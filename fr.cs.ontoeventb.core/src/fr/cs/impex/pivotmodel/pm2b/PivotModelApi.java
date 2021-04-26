package fr.cs.impex.pivotmodel.pm2b;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.cs.ontoeventb.pivotmodel.DSLStandaloneSetup;
import fr.cs.rodindev.rodinapi.RodinContext;
import fr.cs.rodindev.rodinapi.RodinElement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import pivotmodel.*;

public class PivotModelApi {

	private static ArrayList<ClassDefinition> usedClasses;
	private static ArrayList<DataTypeDefinition> usedData;
	private static ArrayList<PropertyDefinition> usedProperties;

	/***************************************************
	 * Méthode pour lire un fichier .pm (Pivot Model)
	 * 
	 * @param IFile
	 *            file
	 * @return Ontology
	 ****************************************************/
	public static Ontology readOntology(IFile file) {

		try {
			String uri = file.getFullPath().toString();
			new DSLStandaloneSetup();
			DSLStandaloneSetup.doSetup();

			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(URI.createURI(uri, true), true);

			EObject eobject = resource.getContents().get(0);

			return (Ontology) eobject;
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
	}

	/********************************************************************
	 * Méthode pour créer un Context à partir d'une ontology Pivot Model
	 * 
	 * @param Ontology
	 *            ontology
	 * @return RodinContext
	 ********************************************************************/
	public static RodinContext pivotModelToContext(Ontology ontology) {

		PivotModelApi.usedClasses = new ArrayList<ClassDefinition>();
		PivotModelApi.usedData = new ArrayList<DataTypeDefinition>();
		PivotModelApi.usedProperties = new ArrayList<PropertyDefinition>();

		RodinContext rodinContext = new RodinContext(ontology.getName());

		// Les types prédéfinis dans le contexte des ontologies
		rodinContext.addSet("Thing");
		rodinContext.addSet("String");
		PivotModelApi.generateCurrencyType(rodinContext);
		PivotModelApi.generatePrefixe(rodinContext);
		PivotModelApi.generateStandardUnit(rodinContext);

		// traitement des classes
		EList<ClassDefinition> classes = ontology.getContainedClasses();
		for (ClassDefinition c : classes)
			if (!PivotModelApi.usedClasses.contains(c))
				PivotModelApi.computeClassDefinition(c, rodinContext);

		// traitement des donnees
		EList<DataTypeDefinition> data = ontology.getContainedDataTypes();
		for (DataTypeDefinition d : data)
			if (!PivotModelApi.usedData.contains(d))
				PivotModelApi.computeDataTypeDefinition(d, rodinContext);

		// traitement des proprietes
		EList<PropertyDefinition> properties = ontology.getContainedProperties();
		for (PropertyDefinition p : properties)
			if (!PivotModelApi.usedProperties.contains(p))
				PivotModelApi.computePropertyDefinition(p, rodinContext);

		return rodinContext;
	}

	/****************************************************
	 * Méthode pour traiter la description d'une classe
	 * 
	 * @param classDefinition
	 * @param rodinContext
	 ****************************************************/
	public static void computeClassDefinition(ClassDefinition classDefinition, RodinContext rodinContext) {

		// déclarer la classe classDefinition
		rodinContext.addConstant(classDefinition.getName());
		if (!classDefinition.getName().contains("ClassDefinition"))
			rodinContext.addAxiom(new RodinElement("", classDefinition.getName() + " is a Class",
					classDefinition.getName() + " \u2286 Thing"));
		PivotModelApi.usedClasses.add(classDefinition);

		PivotModelApi.computeSubClassOf(classDefinition, rodinContext);
		// Traiter la clause Disjoint With de la classe classDefinition
		PivotModelApi.computeDisjointWith(classDefinition, rodinContext);
		// Traiter la clause Equivalent To de la classe classDefinition
		PivotModelApi.computeEquivalentTo(classDefinition, rodinContext);
		// Traiter la clause described by de la classe classDefinition
		PivotModelApi.computeDescribedBy(classDefinition, rodinContext);
		// traiter la clause Sub Class Of de la classe classDefinition

		// traiter la classe simple
		if (classDefinition instanceof SimpleClass)
			PivotModelApi.computeSimpleClass((SimpleClass) classDefinition, rodinContext);
		// traiter la classe caseOf
		else if (classDefinition instanceof CaseOfClass)
			PivotModelApi.computeCaseOfClass((CaseOfClass) classDefinition, rodinContext);
		// traiter la classe restricted
		else if (classDefinition instanceof RestrictedClass)
			PivotModelApi.computeRestrictedClass((RestrictedClass) classDefinition, rodinContext);
		// traiter la classe enumerated
		else if (classDefinition instanceof EnumeratedClass)
			PivotModelApi.computeEnumeratedClass((EnumeratedClass) classDefinition, rodinContext);
		// traiter la classe combination
		else if (classDefinition instanceof CombinationClass)
			PivotModelApi.computeCombinationClass((CombinationClass) classDefinition, rodinContext);
	}

	/******************************************************************
	 * Méthode pour traiter la clause describedBy d'une classDefinition
	 * 
	 * @param classDefinition
	 * @param rodinContext
	 *******************************************************************/
	public static void computeDescribedBy(ClassDefinition classDefinition, RodinContext rodinContext) {

		for (PropertyDefinition p : classDefinition.getDescribedBy()) {
			if (!PivotModelApi.usedProperties.contains(p))
				PivotModelApi.computePropertyDefinition(p, rodinContext);
			rodinContext.addAxiom(
					new RodinElement("", p.getName() + " is a property of " + classDefinition.getName() + " Class",
							classDefinition.getName() + " \u2286 dom(" + p.getName() + ")"));
		}
	}

	/*****************************************************************
	 * Méthode pour traiter la clause subClassOf d'une classDefinition
	 * 
	 * @param classDefinition
	 * @param rodinContext
	 *****************************************************************/
	public static void computeSubClassOf(ClassDefinition classDefinition, RodinContext rodinContext) {

		for (ClassDefinition c : classDefinition.getSubClassOf()) {
			if (!PivotModelApi.usedClasses.contains(c))
				PivotModelApi.computeClassDefinition(c, rodinContext);
			rodinContext.addAxiom(
					new RodinElement("", classDefinition.getName() + " sub class of " + c.getName() + " Class",
							classDefinition.getName() + " \u2286 " + c.getName()));
		}
	}

	/********************************************************************
	 * Méthode pour traiter la clause disjointWith d'une classDefinition
	 * 
	 * @param classDefinition
	 * @param rodinContext
	 ********************************************************************/
	public static void computeDisjointWith(ClassDefinition classDefinition, RodinContext rodinContext) {

		for (ClassDefinition c : classDefinition.getDisjointWith()) {
			if (!PivotModelApi.usedClasses.contains(c))
				PivotModelApi.computeClassDefinition(c, rodinContext);
			rodinContext.addAxiom(
					new RodinElement("", classDefinition.getName() + " disjoint whith " + c.getName() + " Class",
							classDefinition.getName() + " \u2229 " + c.getName() + " = {}"));
		}
	}

	/********************************************************************
	 * Méthode pour traiter la clause equivalentTo d'une classDefinition
	 * 
	 * @param classDefinition
	 * @param rodinContext
	 ********************************************************************/
	public static void computeEquivalentTo(ClassDefinition classDefinition, RodinContext rodinContext) {

		for (ClassDefinition c : classDefinition.getEquivalentTo()) {
			if (!PivotModelApi.usedClasses.contains(c))
				PivotModelApi.computeClassDefinition(c, rodinContext);
			rodinContext
					.addAxiom(new RodinElement("", classDefinition.getName() + " defined by " + c.getName() + " Class",
							classDefinition.getName() + " = " + c.getName()));
		}
	}

	/******************************************
	 * Méthode pour traiter Une simple classe
	 * 
	 * @param simpleClass
	 * @param rodinContext
	 *****************************************/
	public static void computeSimpleClass(SimpleClass simpleClass, RodinContext rodinContext) {
		// no thing to do
	}

	/******************************************
	 * Méthode pour traiter une Case Of Classe
	 * 
	 * @param caseOfClass
	 * @param rodinContext
	 *****************************************/
	public static void computeCaseOfClass(CaseOfClass caseOfClass, RodinContext rodinContext) {

		for (ClassDefinition c : caseOfClass.getCaseOf()) {
			if (!PivotModelApi.usedClasses.contains(c))
				PivotModelApi.computeClassDefinition(c, rodinContext);
			rodinContext.addAxiom(new RodinElement("", caseOfClass.getName() + " is case of " + c.getName() + " Class",
					caseOfClass.getName() + " \u2286 " + c.getName()));
		}

		for (PropertyDefinition p : caseOfClass.getImportedProperties()) {
			if (!PivotModelApi.usedProperties.contains(p))
				PivotModelApi.computePropertyDefinition(p, rodinContext);
			rodinContext.addAxiom(
					new RodinElement("", p.getName() + " is a property of " + caseOfClass.getName() + " Class",
							caseOfClass.getName() + " \u2286 dom(" + p.getName() + ")"));
		}
	}

	/*********************************************
	 * Méthode pour traiter une Restricted Classe
	 * 
	 * @param restrictedClass
	 * @param rodinContext
	 *********************************************/
	public static void computeRestrictedClass(RestrictedClass restrictedClass, RodinContext rodinContext) {
		// Traiter Universal Class
		if (restrictedClass instanceof UniversalClass) {
			UniversalClass universalClass = (UniversalClass) restrictedClass;
			String rc = universalClass.getName();
			String prop = universalClass.getOnProperty().getName();
			if (!PivotModelApi.usedProperties.contains(universalClass.getOnProperty()))
				PivotModelApi.computePropertyDefinition(universalClass.getOnProperty(), rodinContext);
			String ranConst = universalClass.getToDataDefinition().getName();
			if (universalClass.getToDataDefinition() instanceof ClassType)
				ranConst = ((ClassType) universalClass.getToDataDefinition()).getBasedOn().getName();
			if (!PivotModelApi.usedData.contains(universalClass.getToDataDefinition()))
				PivotModelApi.computeDataTypeDefinition(universalClass.getToDataDefinition(), rodinContext);
			String ran = universalClass.getOnProperty().getRange().getName();
			String axm = rc + " = " + prop + "\u223C\u005B" + ranConst + "\u005D\u2216" + prop + "\u223C\u005B" + ran
					+ "\u2216" + ranConst + "\u005D";
			rodinContext.addAxiom(new RodinElement("", rc + " All values from definition Class", axm));
		}
		// Traiter Existantial Class
		else if (restrictedClass instanceof ExistantialClass) {
			ExistantialClass existantialClass = (ExistantialClass) restrictedClass;
			String rc = existantialClass.getName();
			String prop = existantialClass.getOnProperty().getName();
			if (!PivotModelApi.usedProperties.contains(existantialClass.getOnProperty()))
				PivotModelApi.computePropertyDefinition(existantialClass.getOnProperty(), rodinContext);
			String ranConst = existantialClass.getToDataDefinition().getName();
			if (existantialClass.getToDataDefinition() instanceof ClassType)
				ranConst = ((ClassType) existantialClass.getToDataDefinition()).getBasedOn().getName();
			if (!PivotModelApi.usedData.contains(existantialClass.getToDataDefinition()))
				PivotModelApi.computeDataTypeDefinition(existantialClass.getToDataDefinition(), rodinContext);
			String axm = rc + " = " + prop + "\u223C\u005B" + ranConst + "\u005D";
			rodinContext.addAxiom(new RodinElement("", rc + " Some values from definition Class", axm));
		}
		// Traiter Has Value Class
		else if (restrictedClass instanceof HasValueClass) {
			HasValueClass hasValueClass = (HasValueClass) restrictedClass;
			String rc = hasValueClass.getName();
			String prop = hasValueClass.getOnProperty().getName();
			if (!PivotModelApi.usedProperties.contains(hasValueClass.getOnProperty()))
				PivotModelApi.computePropertyDefinition(hasValueClass.getOnProperty(), rodinContext);
			String ranConst = hasValueClass.getToDataDefinition().getName();
			if (hasValueClass.getToDataDefinition() instanceof ClassType)
				ranConst = ((ClassType) hasValueClass.getToDataDefinition()).getBasedOn().getName();
			String axm = rc + " = " + prop + "\u223C\u005B\u007B" + ranConst + "\u007D\u005D";
			rodinContext.addAxiom(new RodinElement("", rc + " Has Value definition Class", axm));
		}
		// Traiter Max Cardinality Class
		else if (restrictedClass instanceof MaxCardinalityClass) {
			MaxCardinalityClass cardinalityClass = (MaxCardinalityClass) restrictedClass;
			String rc = cardinalityClass.getName();
			String prop = cardinalityClass.getOnProperty().getName();
			if (!PivotModelApi.usedProperties.contains(cardinalityClass.getOnProperty()))
				PivotModelApi.computePropertyDefinition(cardinalityClass.getOnProperty(), rodinContext);
			int cardinality = cardinalityClass.getMaxCard();
			String axm = rc + " = \u007B x \u00B7 card\u0028" + prop + "\u005B\u007B x \u007D\u005D\u0029 \u2264 "
					+ cardinality + " \u2223 x \u007D";
			rodinContext.addAxiom(new RodinElement("", rc + " Has MaxCardinality definition Class", axm));
		}
		// Traiter Min Cardinality Class
		else if (restrictedClass instanceof MinCardinalityClass) {
			MinCardinalityClass cardinalityClass = (MinCardinalityClass) restrictedClass;
			String rc = cardinalityClass.getName();
			String prop = cardinalityClass.getOnProperty().getName();
			if (!PivotModelApi.usedProperties.contains(cardinalityClass.getOnProperty()))
				PivotModelApi.computePropertyDefinition(cardinalityClass.getOnProperty(), rodinContext);
			int cardinality = cardinalityClass.getMinCard();
			String axm = rc + " = \u007B x \u00B7 card\u0028" + prop + "\u005B\u007B x \u007D\u005D\u0029 \u2265 "
					+ cardinality + " \u2223 x \u007D";
			rodinContext.addAxiom(new RodinElement("", rc + " Has MinCardinality definition Class", axm));
		}
		// Traiter Cardinalty Class
		else if (restrictedClass instanceof CardinalityClass) {
			CardinalityClass cardinalityClass = (CardinalityClass) restrictedClass;
			String rc = cardinalityClass.getName();
			String prop = cardinalityClass.getOnProperty().getName();
			if (!PivotModelApi.usedProperties.contains(cardinalityClass.getOnProperty()))
				PivotModelApi.computePropertyDefinition(cardinalityClass.getOnProperty(), rodinContext);
			int cardinality = cardinalityClass.getCard();
			String axm = rc + " = \u007B x \u00B7 card\u0028" + prop + "\u005B\u007B x \u007D\u005D\u0029 = "
					+ cardinality + " \u2223 x \u007D";
			rodinContext.addAxiom(new RodinElement("", rc + " Has Cardinality definition Class", axm));
		}
	}

	/**********************************************
	 * Méthode pour traiter une enumerated classe
	 * 
	 * @param enumeratedClass
	 * @param rodinContext
	 ***********************************************/
	public static void computeEnumeratedClass(EnumeratedClass enumeratedClass, RodinContext rodinContext) {

		if (enumeratedClass.getName().contains("ClassDefinition"))
			rodinContext.addAxiom(new RodinElement("", enumeratedClass.getName() + " is a Class",
					enumeratedClass.getName() + " \u2286 Thing"));

		ArrayList<String> ind = new ArrayList<String>();
		for (SingleValue s : enumeratedClass.getOneOf()) {
			ind.add(s.getName());
			rodinContext.addConstant(s.getName());
		}

		String axm = "partition(" + enumeratedClass.getName();
		for (String i : ind)
			axm = axm + ",{" + i + "}";
		axm = axm + ")";

		rodinContext.addAxiom(new RodinElement("", enumeratedClass.getName() + " enumerated classe definition ", axm));
	}

	/**********************************************
	 * Méthode pour traiter une combination classe
	 * 
	 * @param combinationClass
	 * @param rodinContext
	 **********************************************/
	public static void computeCombinationClass(CombinationClass combinationClass, RodinContext rodinContext) {

		ArrayList<String> classes = new ArrayList<String>();
		for (ClassDefinition c : combinationClass.getCombinationOf()) {
			if (!PivotModelApi.usedClasses.contains(c))
				PivotModelApi.computeClassDefinition(c, rodinContext);
			classes.add(c.getName());
		}

		String op = "";
		if (combinationClass instanceof UnionClass)
			op = "\u222A";
		else if (combinationClass instanceof IntersectionClass)
			op = "\u2229";
		else if (combinationClass instanceof ComplementClass)
			op = "\u222A";

		String axm = combinationClass.getName() + " = (";
		if (combinationClass instanceof ComplementClass) {
			axm = axm + "Thing \u2216 (";
			for (int i = 0; i < classes.size() - 1; i++)
				axm = axm + classes.get(i) + " " + op + " ";
			axm = axm + classes.get(classes.size() - 1) + "))";
		} else {
			for (int i = 0; i < classes.size() - 1; i++)
				axm = axm + classes.get(i) + " " + op + " ";
			axm = axm + classes.get(classes.size() - 1) + ")";
		}

		rodinContext.addAxiom(new RodinElement("", combinationClass.getName() + " classe definition ", axm));
	}

	/******************************************************
	 * Méthode pour traiter la description d'une propriété
	 * 
	 * @param propertyDefinition
	 * @param rodinContext
	 ******************************************************/
	public static void computePropertyDefinition(PropertyDefinition propertyDefinition, RodinContext rodinContext) {

		// déclarer la propriété propertyDefinition
		rodinContext.addConstant(propertyDefinition.getName());
		PivotModelApi.usedProperties.add(propertyDefinition);

		// traitement du domaine et du range
		String dom = "Thing";
		String range = null;
		if (propertyDefinition.getDomain() != null) {
			if (!PivotModelApi.usedClasses.contains(propertyDefinition.getDomain()))
				PivotModelApi.computeClassDefinition(propertyDefinition.getDomain(), rodinContext);
			dom = propertyDefinition.getDomain().getName();
		}
		if (propertyDefinition.getRange() != null) {
			if (!PivotModelApi.usedData.contains(propertyDefinition.getRange())) {
				range = PivotModelApi.computeDataTypeDefinition(propertyDefinition.getRange(), rodinContext);
				rodinContext.addAxiom(new RodinElement("", propertyDefinition.getName() + " is a Property",
						propertyDefinition.getName() + " \u2208 " + dom + " \u2194 " + range));
			} else {
				if ("TString".equals(propertyDefinition.getRange().getName()))
					range = "String";
				else if ("TBoolean".equals(propertyDefinition.getRange().getName()))
					range = "BOOL";
				else if ("TInteger".equals(propertyDefinition.getRange().getName()))
					range = "\u2124";
				else if ("TNatural".equals(propertyDefinition.getRange().getName()))
					range = "\u2115";
				else if (propertyDefinition.getRange() instanceof ClassType)
					range = ((ClassType) propertyDefinition.getRange()).getBasedOn().getName();
				else
					range = propertyDefinition.getRange().getName();
				rodinContext.addAxiom(new RodinElement("", propertyDefinition.getName() + " is a Property",
						propertyDefinition.getName() + " \u2208 " + dom + " \u2194 " + range));
			}
		}

		// traiter la propriete isFunctional
		if (!"Thing".equals(dom) && range != null && propertyDefinition.isIsFunctional())
			rodinContext.addAxiom(new RodinElement("", propertyDefinition.getName() + " is functional property ",
					propertyDefinition.getName() + " \u2208 " + dom + " \u21F8 " + range));
		// traiter la propriete isSymmetric
		if (propertyDefinition.isIsSymmetric())
			rodinContext.addAxiom(new RodinElement("", propertyDefinition.getName() + " is symmetric property ",
					propertyDefinition.getName() + " = " + propertyDefinition.getName() + " \u223C"));
		// traiter la propriete isTransitive
		if (propertyDefinition.isIsTransitive())
			rodinContext.addAxiom(new RodinElement("", propertyDefinition.getName() + " is transitive property ",
					propertyDefinition.getName() + " \u003B " + propertyDefinition.getName() + " \u2286"
							+ propertyDefinition.getName()));
		// traiter la propriete isInverseFunctional
		if (!"Thing".equals(dom) && range != null && propertyDefinition.isIsInverseFunctional())
			rodinContext
					.addAxiom(new RodinElement("", propertyDefinition.getName() + " is inverse functional property ",
							propertyDefinition.getName() + " \u223C \u2208 " + range + " \u21F8 " + dom));

		// traiter la clause inverseOf
		for (PropertyDefinition p : propertyDefinition.getInverseOf()) {
			if (!PivotModelApi.usedProperties.contains(p))
				PivotModelApi.computePropertyDefinition(p, rodinContext);
			rodinContext.addAxiom(
					new RodinElement("", propertyDefinition.getName() + " inverse of " + p.getName() + " property",
							propertyDefinition.getName() + " = " + p.getName() + " \u223C"));
		}
		// traiter la clause subproperty of
		for (PropertyDefinition p : propertyDefinition.getSubPropertyOf()) {
			if (!PivotModelApi.usedProperties.contains(p))
				PivotModelApi.computePropertyDefinition(p, rodinContext);
			rodinContext.addAxiom(
					new RodinElement("", propertyDefinition.getName() + " sub property of " + p.getName() + " property",
							propertyDefinition.getName() + " \u2286 " + p.getName()));
			// TODO range and domain in case of subproperty_of on PM
		}
		// traiter la clause equivalent to
		for (PropertyDefinition p : propertyDefinition.getEquivalentTo()) {
			if (!PivotModelApi.usedProperties.contains(p))
				PivotModelApi.computePropertyDefinition(p, rodinContext);
			rodinContext.addAxiom(
					new RodinElement("", propertyDefinition.getName() + " is defined by " + p.getName() + " property",
							propertyDefinition.getName() + " = " + p.getName()));
		}

		// TODO ConditionProperty of PM
		// TODO DependentProperty of PM
	}

	/********************************************************************
	 * Méthode pour traiter la description d'un nouveau type de données
	 * 
	 * @param dataTypeDefinition
	 * @param rodinContext
	 ********************************************************************/
	public static String computeDataTypeDefinition(DataTypeDefinition dataTypeDefinition, RodinContext rodinContext) {

		if (!"TString".equals(dataTypeDefinition.getName()) && !"TBoolean".equals(dataTypeDefinition.getName())
				&& !"TInteger".equals(dataTypeDefinition.getName())
				&& !"TNatural".equals(dataTypeDefinition.getName())) {

			// Type primitif
			if (dataTypeDefinition instanceof PrimitiveType) {
				rodinContext.addConstant(dataTypeDefinition.getName());
				PivotModelApi.usedData.add(dataTypeDefinition);
				PivotModelApi.computePrimitiveType((PrimitiveType) dataTypeDefinition, rodinContext);
				return dataTypeDefinition.getName();
			}
			// Les Objets d'une classe
			else if (dataTypeDefinition instanceof ClassType) {
				rodinContext.addConstant(dataTypeDefinition.getName());
				PivotModelApi.usedData.add(dataTypeDefinition);
				PivotModelApi.computeClassType((ClassType) dataTypeDefinition, rodinContext);
				return dataTypeDefinition.getName();
			}

			// EnumeratedType of PM
			else if (dataTypeDefinition instanceof EnumeratedType) {
				rodinContext.addConstant(dataTypeDefinition.getName());
				PivotModelApi.usedData.add(dataTypeDefinition);
				rodinContext.addAxiom(
						new RodinElement("", dataTypeDefinition.getName() + " is a String enumerated data type",
								dataTypeDefinition.getName() + "  \u2286 String"));
				String axm = "partition(" + dataTypeDefinition.getName();
				for (int i = 0; i < ((EnumeratedType) dataTypeDefinition).getContains().size(); i++)
					axm += ",{" + ((EnumeratedType) dataTypeDefinition).getContains().get(i).getName() + "}";
				axm += ")";
				rodinContext.addAxiom(new RodinElement("", dataTypeDefinition.getName() + " elements", axm));
				return dataTypeDefinition.getName();
			}
			// NumberEnumeratedType of PM
			else if (dataTypeDefinition instanceof NumberEnumeratedType) {
				rodinContext.addConstant(dataTypeDefinition.getName());
				PivotModelApi.usedData.add(dataTypeDefinition);
				rodinContext.addAxiom(
						new RodinElement("", dataTypeDefinition.getName() + " is an Integer enumerated data type",
								dataTypeDefinition.getName() + "  \u2286 2124"));
				String axm = dataTypeDefinition.getName() + " = {";
				axm += ((NumberEnumeratedType) dataTypeDefinition).getContains().get(0);
				for (int i = 1; i < ((NumberEnumeratedType) dataTypeDefinition).getContains().size(); i++)
					axm += "," + ((NumberEnumeratedType) dataTypeDefinition).getContains().get(i);
				axm += "}";
				rodinContext
						.addAxiom(new RodinElement("", dataTypeDefinition.getName() + " is enumerated data type", axm));
				return dataTypeDefinition.getName();
			}
			// SingleValue of PM
			else if (dataTypeDefinition instanceof SingleValue) {
				rodinContext.addConstant(dataTypeDefinition.getName());
				PivotModelApi.usedData.add(dataTypeDefinition);
				String set = ((SingleValue) dataTypeDefinition).getIsOfType().getName();
				if ("TString".equals(set))
					set = "String";
				else if ("TBoolean".equals(set))
					set = "BOOL";
				else if ("TInteger".equals(set))
					set = "\u2124";
				else if ("TNatural".equals(set))
					set = "\u2115";
				rodinContext.addAxiom(new RodinElement("", dataTypeDefinition.getName() + " is a Constante",
						dataTypeDefinition.getName() + " \u2208 " + set));
				return dataTypeDefinition.getName();
			}
			// TODO CollectionType of PM
			else {
				return dataTypeDefinition.getName();
			}
		} else {
			if ("TString".equals(dataTypeDefinition.getName()))
				return "String";
			else if ("TBoolean".equals(dataTypeDefinition.getName()))
				return "BOOL";
			else if ("TInteger".equals(dataTypeDefinition.getName()))
				return "\u2124";
			else if ("TNatural".equals(dataTypeDefinition.getName()))
				return "\u2115";
			else
				return "Thing";
		}
	}

	/**********************************************************
	 * Méthode pour traiter un type primitif du modèle pivot
	 * 
	 * @param PrimitiveType
	 *            primitiveType
	 * @param RodinContext
	 *            rodinContext
	 ***********************************************************/
	public static void computePrimitiveType(PrimitiveType primitiveType, RodinContext rodinContext) {

		// Traiter un type non numérique
		if (primitiveType instanceof NotNumericType) {
			// triter le type booleen
			if (primitiveType.getBasedOn().equals(PredefinedType.BOOLEAN))
				rodinContext.addAxiom(new RodinElement("", primitiveType.getName() + " Type",
						primitiveType.getName() + " \u2286 BOOL"));
			// traiter le type String
			else
				rodinContext.addAxiom(new RodinElement("", primitiveType.getName() + " Type",
						primitiveType.getName() + " \u2286 String"));
		}
		// traiter un type numérique
		else if (primitiveType instanceof NumericType) {
			// traiter un type monnaie CurrencyType
			if (primitiveType instanceof CurrencyType) {
				String currency = ((CurrencyType) primitiveType).getCurrency().toString();
				rodinContext.addAxiom(new RodinElement("", primitiveType.getName() + " Currency Type",
						primitiveType.getName() + " \u2286 (\u2124   \u00D7  {" + currency + "})"));
				/*
				 * if (((CurrencyType)
				 * primitiveType).getCurrency().equals(PredefinedCurrency.EUR))
				 * rodinContext.addAxiom(new RodinElement("", primitiveType.getName() +
				 * " Currency Type", primitiveType.getName() +
				 * " \u2286 (\u2124   \u00D7  {EUR})")); else if (((CurrencyType)
				 * primitiveType).getCurrency().equals(PredefinedCurrency.USD))
				 * rodinContext.addAxiom(new RodinElement("", primitiveType.getName() +
				 * " Currency Type", primitiveType.getName() +
				 * " \u2286 (\u2124   \u00D7  {USD})")); else if (((CurrencyType)
				 * primitiveType).getCurrency().equals(PredefinedCurrency.SUR))
				 * rodinContext.addAxiom(new RodinElement("", primitiveType.getName() +
				 * " Currency Type", primitiveType.getName() +
				 * " \u2286 (\u2124   \u00D7  {SUR})")); else if (((CurrencyType)
				 * primitiveType).getCurrency().equals(PredefinedCurrency.JPY))
				 * rodinContext.addAxiom(new RodinElement("", primitiveType.getName() +
				 * " Currency Type", primitiveType.getName() +
				 * " \u2286 (\u2124   \u00D7  {JPY})")); else if (((CurrencyType)
				 * primitiveType).getCurrency().equals(PredefinedCurrency.CNY))
				 * rodinContext.addAxiom(new RodinElement("", primitiveType.getName() +
				 * " Currency Type", primitiveType.getName() +
				 * " \u2286 (\u2124   \u00D7  {CNY})")); else if (((CurrencyType)
				 * primitiveType).getCurrency().equals(PredefinedCurrency.CHF))
				 * rodinContext.addAxiom(new RodinElement("", primitiveType.getName() +
				 * " Currency Type", primitiveType.getName() +
				 * " \u2286 (\u2124   \u00D7  {CHF})")); else rodinContext.addAxiom(new
				 * RodinElement("", primitiveType.getName() + " Currency Type",
				 * primitiveType.getName() + " \u2286 (\u2124   \u00D7  {EUR})"));
				 */
			}
			// traiter un type de mesure
			else if (primitiveType instanceof MeasureType) {
				// MeasureType of PM
				UnitType unit = ((MeasureType) primitiveType).getUnit();
				// standard Unit
				if (unit instanceof StandardUnit) {
					String sunitn = ((StandardUnit) unit).getName().toString();
					String prefix = "EMPTY";
					if (!((StandardUnit) unit).getPrefix().toString().equals("")) {
						prefix = ((StandardUnit) unit).getPrefix().toString();
					}

					rodinContext.addAxiom(
							new RodinElement("", primitiveType.getName() + " Currency Type", primitiveType.getName()
									+ " \u2286 (\u2124  \u00D7  {" + prefix + " \u21A6 " + sunitn + "})"));
				}
				// TODO NonStandardUnit of PM
				// TODO Conversion basedUnit of PM
				// TODO ContextDependentUnit of PM
				// TODO DerivedUnit of PM
				// default
				else {
					rodinContext.addAxiom(new RodinElement("", primitiveType.getName() + " Type",
							primitiveType.getName() + " \u2286 \u2124"));
				}

			}
			// traiter le type entier naturel
			else if (primitiveType.getBasedOn().equals(PredefinedType.NATURAL))
				rodinContext.addAxiom(new RodinElement("", primitiveType.getName() + " Type",
						primitiveType.getName() + " \u2286 \u2115"));
			// traiter le type entier
			else
				rodinContext.addAxiom(new RodinElement("", primitiveType.getName() + " Type",
						primitiveType.getName() + " \u2286 \u2124"));
		}

	}
	
	/***********************************************************************************
	 * Méthode pour traiter le type de donnée correspondant à une classe de
	 * l'ontology
	 * 
	 * @param ClassType
	 *            classType
	 * @param RodinContext
	 *            rodinContext
	 ***********************************************************************************/
	public static void computeClassType(ClassType classType, RodinContext rodinContext) {

		if (!PivotModelApi.usedClasses.contains(classType.getBasedOn()))
			PivotModelApi.computeClassDefinition(classType.getBasedOn(), rodinContext);
		
		rodinContext.addAxiom(new RodinElement("", classType.getName() + " Type",
				classType.getName() + " \u2286 " + classType.getBasedOn().getName()));
	}

	/**************************************************
	 * Convertir ne type name dans un type event-B
	 * 
	 * @param String
	 *            name
	 * @return String
	 ***************************************************/
	public static String EventBName(String name) {
		if ("STRING".equals(name))
			return "String";
		else if ("BOOLEAN".equals(name))
			return "BOOL";
		else if ("INTEGER".equals(name))
			return "\u2124";
		else if ("NATURAL".equals(name))
			return "\u2115";
		return name;
	}

	/********************************************************
	 * Générer le type Currency dans le context Event-B
	 * 
	 * @param RodinContext
	 *            rodinContext
	 ********************************************************/
	public static void generateCurrencyType(RodinContext rodinContext) {
		rodinContext.addSet("PredefinedCurrency");
		rodinContext.addConstant("EUR");
		rodinContext.addConstant("USD");
		rodinContext.addConstant("SUR");
		rodinContext.addConstant("JPY");
		rodinContext.addConstant("CNY");
		rodinContext.addConstant("CHF");
		rodinContext.addAxiom(new RodinElement("", "PredefinedCurrency Type",
				"partition(PredefinedCurrency, {EUR} , {USD} , {SUR} , {JPY} , {CNY} , {CHF})"));
	}

	/********************************************************
	 * Générer les prefixe d'unités dans le context Event-B
	 * 
	 * @param RodinContext
	 *            rodinContext
	 ********************************************************/
	public static void generatePrefixe(RodinContext rodinContext) {
		rodinContext.addSet("PredefinedPrefix");
		rodinContext.addConstant("EXA");
		rodinContext.addConstant("PETA");
		rodinContext.addConstant("TERA");
		rodinContext.addConstant("GIGA");
		rodinContext.addConstant("MEGA");
		rodinContext.addConstant("KILO");
		rodinContext.addConstant("HECTO");
		rodinContext.addConstant("DECA");
		rodinContext.addConstant("DECI");
		rodinContext.addConstant("CENTI");
		rodinContext.addConstant("MILLI");
		rodinContext.addConstant("MICRO");
		rodinContext.addConstant("NANO");
		rodinContext.addConstant("PICO");
		rodinContext.addConstant("FEMTO");
		rodinContext.addConstant("ATTO");
		rodinContext.addConstant("EMPTY");
		rodinContext.addAxiom(new RodinElement("", "PredefinedPrefix Type",
				"partition(PredefinedPrefix, "
						+ "{EXA} , {PETA} , {TERA} , {GIGA} , {MEGA} , {KILO}, {HECTO} , {DECA} , "
						+ "{DECI} , {CENTI} , {MILLI} , {MICRO} , {NANO} , {PICO}, {FEMTO} , {ATTO} , {EMPTY})"));
	}

	/***********************************************************
	 * Générer les unités standard dans le context Event-B
	 * 
	 * @param rodinContext
	 ***********************************************************/
	public static void generateStandardUnit(RodinContext rodinContext) {
		rodinContext.addSet("PredefinedStandardUnit");
		rodinContext.addConstant("METRE");
		rodinContext.addConstant("GRAM");
		rodinContext.addConstant("SECOND");
		rodinContext.addConstant("AMPERE");
		rodinContext.addConstant("KELVIN");
		rodinContext.addConstant("MOLE");
		rodinContext.addConstant("CANDELA");
		rodinContext.addConstant("RADIAN");
		rodinContext.addConstant("STERADIAN");
		rodinContext.addConstant("HERTZ");
		rodinContext.addConstant("NEWTON");
		rodinContext.addConstant("PASCAL");
		rodinContext.addConstant("JOULE");
		rodinContext.addConstant("WATT");
		rodinContext.addConstant("COULOMB");
		rodinContext.addConstant("VOLT");
		rodinContext.addConstant("FARAD");
		rodinContext.addConstant("OHM");
		rodinContext.addConstant("SIEMENS");
		rodinContext.addConstant("WEBER");
		rodinContext.addConstant("TESLA");
		rodinContext.addConstant("HENRY");
		rodinContext.addConstant("DEGREE_CELSIUS");
		rodinContext.addConstant("LUMEN");
		rodinContext.addConstant("LUX");
		rodinContext.addConstant("BECQUEREL");
		rodinContext.addConstant("GRAY");
		rodinContext.addConstant("SIEVERT");
		rodinContext.addAxiom(new RodinElement("", "PredefinedStandardUnit Type", "partition(PredefinedStandardUnit, "
				+ "{METRE} , {GRAM} , {SECOND} , {AMPERE} , {KELVIN} , {MOLE}, {CANDELA} , {RADIAN} , {STERADIAN} , "
				+ "{HERTZ} , {NEWTON} , {PASCAL} , {JOULE} , {WATT} , {COULOMB}, {VOLT} , {FARAD}, {OHM} , "
				+ "{SIEMENS} , {WEBER} , {TESLA} , {HENRY} , {DEGREE_CELSIUS} , {LUMEN}, {LUX} , {BECQUEREL}, {GRAY} , "
				+ "{SIEVERT})"));
	}
}
