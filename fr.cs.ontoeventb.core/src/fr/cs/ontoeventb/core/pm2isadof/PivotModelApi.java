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
import pivotmodel.ClassType;
import pivotmodel.DataTypeDefinition;
import pivotmodel.Ontology;
import pivotmodel.PropertyDefinition;

public class PivotModelApi {
	private static ArrayList<ClassDefinition> usedClasses;
	private static ArrayList<DataTypeDefinition> usedData;
	private static ArrayList<PropertyDefinition> usedProperties;
	private static StringBuffer file_content;

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
		file_content = new StringBuffer("theory " + ontology.getName() + "\n");
		file_content.append("\n	imports \"../../DOF/Isa_DOF\"  \"../../../../AFP/Physical_Quantities/SI_Pretty\"" + "\n") ;
		file_content.append("\nbegin" + "\n");
		
		PivotModelApi.usedClasses = new ArrayList<ClassDefinition>();
		PivotModelApi.usedData = new ArrayList<DataTypeDefinition>();
		PivotModelApi.usedProperties = new ArrayList<PropertyDefinition>();
		
		// traitement des classes
		EList<ClassDefinition> classes = ontology.getContainedClasses();
		for (ClassDefinition c : classes)
			if (!PivotModelApi.usedClasses.contains(c))
				file_content.append(PivotModelApi.computeClassDefinition(c, ontology));
				
		file_content.append("\n\nend") ;
		return file_content ;
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
			res.append("\n    " + p.getName() + " :: \"" + PivotModelApi.computeDataType(p,o) + "\"");
		}
		
		for(PropertyDefinition p : o.getContainedProperties()) {
			if(c.equals(p.getDomain())) {
				res.append("\n    " + p.getName() + " :: \"" + PivotModelApi.computeDataType(p,o) + "\"");
			}
		}
		
		return res ;
	}
	
	/******************************************************************
	 * Méthode pour traiter la clause describedBy d'une classDefinition
	 * 
	 * @param classDefinition
	 * @return Le contenu de la théorie ISADOF
	 *******************************************************************/
	public static StringBuffer computeDataType(PropertyDefinition p, Ontology o) {
		StringBuffer res = new StringBuffer("string");
		
		if (p.getRange() != null) {
			if ("TThing".equals(p.getRange().getName()))
				res = new StringBuffer("string");
			else if (p.getRange() instanceof ClassType) {
				ClassDefinition c = ((ClassType) p.getRange()).getBasedOn() ;
				if (!PivotModelApi.usedClasses.contains(c))
					file_content.append(PivotModelApi.computeClassDefinition(c, o));
				res = new StringBuffer(((ClassType) p.getRange()).getBasedOn().getName());
			}
			else if ("TString".equals(p.getRange().getName()))
				res = new StringBuffer("string");
			else if ("TBoolean".equals(p.getRange().getName()))
				res = new StringBuffer("bool");
			else if ("TInteger".equals(p.getRange().getName()))
				res = new StringBuffer("int");
			else if ("TNatural".equals(p.getRange().getName()))
				res = new StringBuffer("nat");
		}
		
		return res ;
	}
}
