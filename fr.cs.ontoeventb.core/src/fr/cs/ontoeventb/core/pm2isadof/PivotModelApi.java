package fr.cs.ontoeventb.core.pm2isadof;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
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
	public static String pivotModelToIsaDof(Ontology ontology) {
		String res = "theory " + ontology.getName() + "\n";
		res = res + "	imports \"../../DOF/Isa_DOF\"  \"../../../../AFP/Physical_Quantities/SI_Pretty\"" + "\n";
		res = res + "begin" + "\n";
		
		res = res + "end" ;
		return res ;
	}
}
