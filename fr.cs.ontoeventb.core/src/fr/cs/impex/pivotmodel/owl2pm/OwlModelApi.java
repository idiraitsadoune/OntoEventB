package fr.cs.impex.pivotmodel.owl2pm;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntProperty;
import org.apache.jena.ontology.OntResource;
import org.apache.jena.rdf.model.ModelFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Injector;
import fr.cs.ontoeventb.pivotmodel.DSLStandaloneSetup;
import pivotmodel.*;

public class OwlModelApi {

	private static int nbAnonymousClasses = 0;
	private static int nbAnonymousProperties = 0;

	/***************************************************
	 * Méthode pour lire un fichier .owl (OWL Model)
	 * 
	 * @param IFile
	 *            file
	 * @return OntModel
	 ****************************************************/
	public static OntModel readOwlFile(IFile file) {

		try {
			String uri = file.getLocation().toString();

			OntModel ontModel = ModelFactory.createOntologyModel();
			ontModel.read(uri, "RDF/XML");

			return ontModel;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	/********************************************************************
	 * Méthode pour générer un fichier à partir d'une ontology
	 * 
	 * @param Ontology
	 *            ontology
	 * @param String
	 *            path
	 ********************************************************************/
	public static void savePmModel(Ontology ontology, String path) {

		Injector injector = new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet rs = injector.getInstance(ResourceSet.class);
		Resource r = rs.createResource(URI.createURI(path));
		r.getContents().add(ontology);

		try {
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*******************************************************************
	 * Méthode pour créer une ontology PM à partir d'un modèle OWL
	 * 
	 * @param OntModel
	 *            ontModel
	 * @return Ontology
	 *******************************************************************/
	public static Ontology owlModelToPmOntology(String name, OntModel ontModel) {

		OwlModelApi.nbAnonymousClasses = 0;
		OwlModelApi.nbAnonymousProperties = 0;

		DSLStandaloneSetup.doSetup();
		Ontology pmOntology = PivotmodelFactory.eINSTANCE.createOntology();
		pmOntology.setName(name);
		System.out.println("OntoEventB : " + name + " OWL ontology will be treated");

		// Ajouter les types prédéfinis
		OwlModelApi.createPredefinedType(pmOntology);
		// Traitement des classes
		OwlModelApi.computeClasses(ontModel, pmOntology);
		// Traitement des proprietes
		OwlModelApi.computeProperties(ontModel, pmOntology);

		System.out.println("OntoEventB : Pivot Model created");
		return pmOntology;
	}

	/******************************************************
	 * Méthode pour traiter les classes du modèle OWL
	 * 
	 * @param OntModel
	 *            ontModel
	 * @param Ontology
	 *            pmOntology
	 ******************************************************/
	public static void computeClasses(OntModel ontModel, Ontology pmOntology) {

		for (OntClass ontClass : ontModel.listNamedClasses().toList())
			OwlModelApi.createNewClass(ontClass, pmOntology);
		System.out.println("OntoEventB : All Classes created ");
	}

	/************************************************************
	 * Créer une Pivot model class à partir d'une classe OWL
	 * 
	 * @param OntClass
	 *            ontClass
	 * @param Ontology
	 *            pmOntology
	 * @return Pivot model class
	 *************************************************************/
	public static ClassDefinition createNewClass(OntClass ontClass, Ontology pmOntology) {

		String name;
		ClassDefinition classDefinition = OwlModelApi.classIsTreated(ontClass, pmOntology);
		if (classDefinition != null)
			return classDefinition;

		if (!ontClass.isAnon() && !"Resource".equals(ontClass.getLocalName()))
			name = ontClass.getLocalName();
		else if (ontClass.isAnon()) {
			OwlModelApi.nbAnonymousClasses++;
			name = "ClassDefinition_" + OwlModelApi.nbAnonymousClasses;
		} else
			return null;

		// traitement de Combination Class
		if (ontClass.isUnionClass() || ontClass.isComplementClass() || ontClass.isIntersectionClass()) {
			ArrayList<OntClass> ontoClasses;
			if (ontClass.isUnionClass()) {
				classDefinition = PivotmodelFactory.eINSTANCE.createUnionClass();
				ontoClasses = new ArrayList<OntClass>(ontClass.asUnionClass().listOperands().toList());
			} else if (ontClass.isComplementClass()) {
				classDefinition = PivotmodelFactory.eINSTANCE.createComplementClass();
				ontoClasses = new ArrayList<OntClass>(ontClass.asComplementClass().listOperands().toList());
			} else {
				classDefinition = PivotmodelFactory.eINSTANCE.createIntersectionClass();
				ontoClasses = new ArrayList<OntClass>(ontClass.asIntersectionClass().listOperands().toList());
			}
			classDefinition.setName(name);
			pmOntology.getContainedClasses().add(classDefinition);

			for (OntClass c : ontoClasses) {
				ClassDefinition cd = OwlModelApi.createNewClass(c, pmOntology);
				if (cd != null)
					((CombinationClass) classDefinition).getCombinationOf().add(cd);
			}
		}
		// traitement des classes énumérées
		else if (ontClass.isEnumeratedClass()) {
			classDefinition = PivotmodelFactory.eINSTANCE.createEnumeratedClass();
			classDefinition.setName(name);
			pmOntology.getContainedClasses().add(classDefinition);

			ArrayList<OntResource> ressources = new ArrayList<OntResource>(
					ontClass.asEnumeratedClass().listOneOf().toList());
			for (OntResource r : ressources) {
				SingleValue s = (SingleValue) createNewDataType(r, pmOntology);
				((EnumeratedClass) classDefinition).getOneOf().add(s);
				s = null;
			}
		}
		// traitement des cardinalités restrictions
		else if (ontClass.isRestriction() && ontClass.asRestriction().isMinCardinalityRestriction()) {
			classDefinition = PivotmodelFactory.eINSTANCE.createMinCardinalityClass();
			classDefinition.setName(name);
			pmOntology.getContainedClasses().add(classDefinition);
			((MinCardinalityClass) classDefinition)
					.setOnProperty(OwlModelApi.createNewProperty(ontClass.asRestriction().getOnProperty(), pmOntology));
			((MinCardinalityClass) classDefinition)
					.setMinCard(ontClass.asRestriction().asMinCardinalityRestriction().getMinCardinality());
		} else if (ontClass.isRestriction() && ontClass.asRestriction().isMaxCardinalityRestriction()) {
			classDefinition = PivotmodelFactory.eINSTANCE.createMaxCardinalityClass();
			classDefinition.setName(name);
			pmOntology.getContainedClasses().add(classDefinition);
			((MaxCardinalityClass) classDefinition)
					.setOnProperty(OwlModelApi.createNewProperty(ontClass.asRestriction().getOnProperty(), pmOntology));
			((MaxCardinalityClass) classDefinition)
					.setMaxCard(ontClass.asRestriction().asMaxCardinalityRestriction().getMaxCardinality());
		} else if (ontClass.isRestriction() && ontClass.asRestriction().isCardinalityRestriction()) {
			classDefinition = PivotmodelFactory.eINSTANCE.createCardinalityClass();
			classDefinition.setName(name);
			pmOntology.getContainedClasses().add(classDefinition);
			((CardinalityClass) classDefinition)
					.setOnProperty(OwlModelApi.createNewProperty(ontClass.asRestriction().getOnProperty(), pmOntology));
			((CardinalityClass) classDefinition)
					.setCard(ontClass.asRestriction().asCardinalityRestriction().getCardinality());
		} else if (ontClass.isRestriction() && ontClass.asRestriction().isSomeValuesFromRestriction()) {
			classDefinition = PivotmodelFactory.eINSTANCE.createExistantialClass();
			classDefinition.setName(name);
			pmOntology.getContainedClasses().add(classDefinition);
			((ExistantialClass) classDefinition)
					.setOnProperty(OwlModelApi.createNewProperty(ontClass.asRestriction().getOnProperty(), pmOntology));
			((ExistantialClass) classDefinition).setToDataDefinition(OwlModelApi.createNewDataType(
					(OntClass) ontClass.asRestriction().asSomeValuesFromRestriction().getSomeValuesFrom(), pmOntology));
		} else if (ontClass.isRestriction() && ontClass.asRestriction().isAllValuesFromRestriction()) {
			classDefinition = PivotmodelFactory.eINSTANCE.createUniversalClass();
			classDefinition.setName(name);
			pmOntology.getContainedClasses().add(classDefinition);
			((UniversalClass) classDefinition)
					.setOnProperty(OwlModelApi.createNewProperty(ontClass.asRestriction().getOnProperty(), pmOntology));
			((UniversalClass) classDefinition).setToDataDefinition(OwlModelApi.createNewDataType(
					(OntClass) ontClass.asRestriction().asAllValuesFromRestriction().getAllValuesFrom(), pmOntology));
		} else if (ontClass.isRestriction() && ontClass.asRestriction().isHasValueRestriction()) {
			classDefinition = PivotmodelFactory.eINSTANCE.createHasValueClass();
			classDefinition.setName(name);
			pmOntology.getContainedClasses().add(classDefinition);
			((HasValueClass) classDefinition)
					.setOnProperty(OwlModelApi.createNewProperty(ontClass.asRestriction().getOnProperty(), pmOntology));
			((HasValueClass) classDefinition).setToDataDefinition(OwlModelApi.createNewDataType(
					(OntResource) ontClass.asRestriction().asHasValueRestriction().getHasValue(), pmOntology));
		}
		// traitement de Simple Class
		else {
			classDefinition = PivotmodelFactory.eINSTANCE.createSimpleClass();
			classDefinition.setName(name);
			pmOntology.getContainedClasses().add(classDefinition);
		}
		// traitement des relations entre classes
		for (OntClass c : ontClass.listSuperClasses().toList()) {
			ClassDefinition newClassDefinition = OwlModelApi.createNewClass(c, pmOntology);
			if (newClassDefinition != null)
				classDefinition.getSubClassOf().add(newClassDefinition);
		}
		for (OntClass c : ontClass.listEquivalentClasses().toList()) {
			ClassDefinition newClassDefinition = OwlModelApi.createNewClass(c, pmOntology);
			if (newClassDefinition != null)
				classDefinition.getEquivalentTo().add(newClassDefinition);
		}
		for (OntClass c : ontClass.listDisjointWith().toList()) {
			ClassDefinition newClassDefinition = OwlModelApi.createNewClass(c, pmOntology);
			if (newClassDefinition != null)
				classDefinition.getDisjointWith().add(newClassDefinition);
		}

		return classDefinition;
	}

	/**********************************************************************************
	 * Méthode qui vérifie si la classe OWL ontClass a été déjà traitée
	 * 
	 * @param OntClass
	 *            ontClass
	 * @param Ontology
	 *            pmOntology
	 * @return ClassDefinition
	 *******************************************************************/
	public static ClassDefinition classIsTreated(OntClass ontClass, Ontology pmOntology) {

		for (ClassDefinition cd : pmOntology.getContainedClasses())
			if (cd.getName().equals(ontClass.getLocalName()))
				return cd;

		return null;
	}

	/******************************************
	 * Traiter les proprietes du model OWL
	 * 
	 * @param ontModel
	 * @param pmOntology
	 ******************************************/
	public static void computeProperties(OntModel ontModel, Ontology pmOntology) {

		for (OntProperty p : ontModel.listObjectProperties().toList())
			OwlModelApi.createNewProperty(p, pmOntology);
		System.out.println("OntoEventB : All Object Properties created");
		for (OntProperty p : ontModel.listDatatypeProperties().toList())
			OwlModelApi.createNewProperty(p, pmOntology);
		System.out.println("OntoEventB : All DataType Properties created");
	}

	/**************************************************************
	 * Creation d'une propriete PM à partir d'une propriete OWL
	 * 
	 * @param OntProperty
	 *            ontProperty
	 * @param Ontology
	 *            pmOntology
	 * @return PropertyDefinition
	 **************************************************************/
	public static PropertyDefinition createNewProperty(OntProperty ontProperty, Ontology pmOntology) {

		String name;

		// Vérifier si la propriete a déjà été traitée
		PropertyDefinition propertyDefinition = OwlModelApi.propertyIsTreated(ontProperty, pmOntology);
		if (propertyDefinition != null)
			return propertyDefinition;

		// traitement des properietes anonymes
		if (!ontProperty.isAnon() && !"Resource".equals(ontProperty.getLocalName()))
			name = ontProperty.getLocalName();
		else if (ontProperty.isAnon()) {
			OwlModelApi.nbAnonymousProperties++;
			name = "propertyDefinition_" + OwlModelApi.nbAnonymousProperties;
		} else
			return null;

		// créer la nouvelle propriete
		propertyDefinition = PivotmodelFactory.eINSTANCE.createSimpleProperty();
		propertyDefinition.setName(name);
		pmOntology.getContainedProperties().add(propertyDefinition);

		// Gestion du domaine et du range
		if (ontProperty.getDomain() != null) {
			ClassDefinition domain = OwlModelApi.createNewClass(ontProperty.getDomain().asClass(), pmOntology);
			if (domain != null)
				propertyDefinition.setDomain(domain);
		}
		if (ontProperty.getRange() != null) {
			DataTypeDefinition range = OwlModelApi.createNewDataType(ontProperty.getRange(), pmOntology);
			if (range != null)
				propertyDefinition.setRange(range);
		}

		// Gestion des caracteristique de la propriete
		if (ontProperty.isFunctionalProperty())
			propertyDefinition.setIsFunctional(true);
		if (ontProperty.isSymmetricProperty())
			propertyDefinition.setIsSymmetric(true);
		if (ontProperty.isTransitiveProperty())
			propertyDefinition.setIsTransitive(true);
		if (ontProperty.isInverseFunctionalProperty())
			propertyDefinition.setIsInverseFunctional(true);
		// if(ontProperty.isReflexiveProperty())
		// propertyDefinition.setIsReflexive(true);

		// Gestion des relations entre proprietes
		for (OntProperty p : ontProperty.listSuperProperties().toList()) {
			PropertyDefinition pd = OwlModelApi.createNewProperty(p, pmOntology);
			if (pd != null)
				propertyDefinition.getSubPropertyOf().add(pd);
		}
		for (OntProperty p : ontProperty.listEquivalentProperties().toList()) {
			PropertyDefinition pd = OwlModelApi.createNewProperty(p, pmOntology);
			if (pd != null)
				propertyDefinition.getEquivalentTo().add(pd);
		}
		for (OntProperty p : ontProperty.listInverseOf().toList()) {
			PropertyDefinition pd = OwlModelApi.createNewProperty(p, pmOntology);
			propertyDefinition.getInverseOf().add(pd);
		}

		return propertyDefinition;
	}

	/********************************************************
	 * Méthode qui vérifie si la propriete a déjà été traitée
	 * 
	 * @param OntProperty
	 *            ontProperty
	 * @param Ontology
	 *            pmOntology
	 * @return PropertyDefinition
	 *******************************************************/
	public static PropertyDefinition propertyIsTreated(OntProperty ontProperty, Ontology pmOntology) {

		for (PropertyDefinition pd : pmOntology.getContainedProperties())
			if (pd.getName().equals(ontProperty.getLocalName()))
				return pd;

		return null;
	}

	/******************************************
	 * Creer un nouveau DataType à partir d'une ressource OWL
	 * 
	 * @param OntResource
	 *            ontResource
	 * @param Ontology
	 *            pmOntology
	 * @return DataTypeDefinition
	 *******************************************/
	public static DataTypeDefinition createNewDataType(OntResource ontResource, Ontology pmOntology) {

		if ("float".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(0);

		else if ("dooble".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(0);

		else if ("int".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(0);

		else if ("long".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(0);

		else if ("short".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(0);

		else if ("byte".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(0);

		else if ("decimal".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(0);

		else if ("dateTime".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(1);

		else if ("Boolean".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(2);

		else if ("string".equals(ontResource.getLocalName()))
			return pmOntology.getContainedDataTypes().get(3);

		else if (ontResource.isClass()) {
			ClassDefinition classDefinition = OwlModelApi.createNewClass(ontResource.asClass(), pmOntology);
			String name = "T" + classDefinition.getName();

			ClassType data = null;
			for (DataTypeDefinition type : pmOntology.getContainedDataTypes())
				if (type.getName().equals(name))
					data = (ClassType) type;

			if (data == null) {
				data = PivotmodelFactory.eINSTANCE.createClassType();
				data.setName(name);
				data.setBasedOn(classDefinition);
				pmOntology.getContainedDataTypes().add(data);
			}
			return data;
		} else if (ontResource.isIndividual()) {
			SingleValue data = null;
			String name = ontResource.asIndividual().getLocalName();

			for (DataTypeDefinition type : pmOntology.getContainedDataTypes())
				if (type.getName().equals(name))
					data = (SingleValue) type;

			if (data == null) {
				data = PivotmodelFactory.eINSTANCE.createSingleValue();
				data.setName(name);
				data.setIsOfType(createNewDataType(ontResource.asIndividual().getOntClass(), pmOntology));
				pmOntology.getContainedDataTypes().add(data);
			}
			return data;
		}

		return pmOntology.getContainedDataTypes().get(3);
	}

	/*********************************************************
	 * Méthode qui ajoute les types prédéfinis à l'ontologie
	 * 
	 * @param Ontology
	 *            pmOntology
	 **********************************************************/
	public static void createPredefinedType(Ontology pmOntology) {

		NumericType integer = PivotmodelFactory.eINSTANCE.createNumericType();
		integer.setName("TInteger");
		integer.setBasedOn(PredefinedType.INTEGER);
		pmOntology.getContainedDataTypes().add(integer);

		NumericType natural = PivotmodelFactory.eINSTANCE.createNumericType();
		natural.setName("TNatural");
		natural.setBasedOn(PredefinedType.NATURAL);
		pmOntology.getContainedDataTypes().add(natural);

		NotNumericType bool = PivotmodelFactory.eINSTANCE.createNotNumericType();
		bool.setName("TBoolean");
		bool.setBasedOn(PredefinedType.BOOLEAN);
		pmOntology.getContainedDataTypes().add(bool);

		NotNumericType str = PivotmodelFactory.eINSTANCE.createNotNumericType();
		str.setName("TString");
		str.setBasedOn(PredefinedType.STRING);
		pmOntology.getContainedDataTypes().add(str);

		System.out.println("OntoEventB : All Predefined types created ");

	}
}
