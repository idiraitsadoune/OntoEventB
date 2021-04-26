/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.util;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

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
public class ValueXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ValuePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ValueResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ValueResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ValueResourceFactoryImpl());
		}
		return registrations;
	}

} //ValueXMLProcessor
