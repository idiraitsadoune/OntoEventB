/**
 */
package iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.util;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage;

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
public class BasicXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		BasicPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the BasicResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new BasicResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new BasicResourceFactoryImpl());
		}
		return registrations;
	}

} //BasicXMLProcessor
