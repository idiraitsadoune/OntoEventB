package fr.cs.ontoeventb.core.pm2isadof;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.cs.ontoeventb.pivotmodel.DSLStandaloneSetup;
import pivotmodel.ClassDefinition;
import pivotmodel.DataTypeDefinition;
import pivotmodel.Ontology;
import pivotmodel.PropertyDefinition;

public class PivotModelApi {
	private static ArrayList<ClassDefinition> usedClasses;
	private static ArrayList<DataTypeDefinition> usedData;
	private static ArrayList<PropertyDefinition> usedProperties;

	/***************************************************
	 * Méthode pour lire un fichier .pm (Pivot Model)
	 * 
	 * @param IFile file
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
	 * Méthode pour créer une théorie ISADOF à partir d'une ontology Pivot Model
	 * 
	 * @param Ontology ontology
	 * @return Le contenu de la théorie ISADOF
	 ********************************************************************/
	public static StringBuffer pivotModelToIsaDof(Ontology ontology) {
		StringBuffer res = new StringBuffer("theory " + ontology.getName() + "\n");
		res.append("\n	imports \"../../DOF/Isa_DOF\"  \"../../../../AFP/Physical_Quantities/SI_Pretty\"" + "\n") ;
		res.append("\nbegin" + "\n");
		
		PivotModelApi.usedClasses = new ArrayList<ClassDefinition>();
		PivotModelApi.usedData = new ArrayList<DataTypeDefinition>();
		PivotModelApi.usedProperties = new ArrayList<PropertyDefinition>();
		
		// traitement des classes
		EList<ClassDefinition> classes = ontology.getContainedClasses();
		for (ClassDefinition c : classes)
			if (!PivotModelApi.usedClasses.contains(c))
				res.append(PivotModelApi.computeClassDefinition(c, ontology));
				
		res.append("\n\nend") ;
		return res ;
	}
	
	/****************************************************
	 * Méthode pour traiter la description d'une classe
	 * 
	 * @param classDefinition
	 * @return Le contenu de la théorie ISADOF
	 ****************************************************/
	public static StringBuffer computeClassDefinition(ClassDefinition c, Ontology o) {
		usedClasses.add(c);
		
		StringBuffer res = new StringBuffer("\n\nonto_class " + c.getName() + " = ");
		StringBuffer buff = new StringBuffer(""); 
		
		if(! c.getSubClassOf().isEmpty()) {
			ClassDefinition super_class = c.getSubClassOf().get(0) ; 
			if (!PivotModelApi.usedClasses.contains(super_class)) 
				buff = PivotModelApi.computeClassDefinition(super_class, o);
			res.append(super_class.getName() + " + ");
		}
		
		res.append("\n    preferredName :: \"string\"  <= \"''" + c.getName() + "''\" ");
		res.append(PivotModelApi.computeProperties(c, o));
		
		return buff.append(res) ;
	}
	
	/******************************************************************
	 * Méthode pour traiter la clause describedBy d'une classDefinition
	 * 
	 * @param classDefinition
	 * @return Le contenu de la théorie ISADOF
	 *******************************************************************/
	public static StringBuffer computeProperties(ClassDefinition c, Ontology o) {
		StringBuffer res = new StringBuffer("");
		
		for (PropertyDefinition p : c.getDescribedBy()) {
			res.append("\n    " + p.getName() + " :: \"string\"");
		}
		
		for(PropertyDefinition p : o.getContainedProperties()) {
			if(p.getDomain().equals(c)) {
				res.append("\n    " + p.getName() + " :: \"string\"");
			}
		}
		
		return res ;
	}
}
