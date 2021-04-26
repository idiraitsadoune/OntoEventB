/**
 */
package iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierFactory
 * @model kind="package"
 * @generated
 */
public interface IdentifierPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "identifier";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "identifier";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdentifierPackage eINSTANCE = iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl.init();

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IRDISequenceTypeImpl <em>IRDI Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IRDISequenceTypeImpl
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl#getIRDISequenceType()
	 * @generated
	 */
	int IRDI_SEQUENCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>IRDI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRDI_SEQUENCE_TYPE__IRDI = 0;

	/**
	 * The number of structural features of the '<em>IRDI Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRDI_SEQUENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IRDI Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRDI_SEQUENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.DocumentRootImpl
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>IRDI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IRDI = 3;

	/**
	 * The feature id for the '<em><b>IRDI List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IRDI_LIST = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>IRDI List Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl#getIRDIListType()
	 * @generated
	 */
	int IRDI_LIST_TYPE = 2;

	/**
	 * The meta object id for the '<em>IRDI Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl#getIRDIType()
	 * @generated
	 */
	int IRDI_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDISequenceType <em>IRDI Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRDI Sequence Type</em>'.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDISequenceType
	 * @generated
	 */
	EClass getIRDISequenceType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDISequenceType#getIRDI <em>IRDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>IRDI</em>'.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDISequenceType#getIRDI()
	 * @see #getIRDISequenceType()
	 * @generated
	 */
	EAttribute getIRDISequenceType_IRDI();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getIRDI <em>IRDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IRDI</em>'.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getIRDI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IRDI();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getIRDIList <em>IRDI List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IRDI List</em>'.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getIRDIList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IRDIList();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>IRDI List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IRDI List Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='IRDI_list_type' itemType='IRDI_type'"
	 * @generated
	 */
	EDataType getIRDIListType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IRDI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IRDI Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IRDI_type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})? [0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})? [0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?'"
	 * @generated
	 */
	EDataType getIRDIType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdentifierFactory getIdentifierFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IRDISequenceTypeImpl <em>IRDI Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IRDISequenceTypeImpl
		 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl#getIRDISequenceType()
		 * @generated
		 */
		EClass IRDI_SEQUENCE_TYPE = eINSTANCE.getIRDISequenceType();

		/**
		 * The meta object literal for the '<em><b>IRDI</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRDI_SEQUENCE_TYPE__IRDI = eINSTANCE.getIRDISequenceType_IRDI();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.DocumentRootImpl
		 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>IRDI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IRDI = eINSTANCE.getDocumentRoot_IRDI();

		/**
		 * The meta object literal for the '<em><b>IRDI List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IRDI_LIST = eINSTANCE.getDocumentRoot_IRDIList();

		/**
		 * The meta object literal for the '<em>IRDI List Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl#getIRDIListType()
		 * @generated
		 */
		EDataType IRDI_LIST_TYPE = eINSTANCE.getIRDIListType();

		/**
		 * The meta object literal for the '<em>IRDI Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl#getIRDIType()
		 * @generated
		 */
		EDataType IRDI_TYPE = eINSTANCE.getIRDIType();

	}

} //IdentifierPackage
