/**
 */
package iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.util;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifierXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		IdentifierPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the IdentifierResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new IdentifierResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new IdentifierResourceFactoryImpl());
		}
		return registrations;
	}

} //IdentifierXMLProcessor
