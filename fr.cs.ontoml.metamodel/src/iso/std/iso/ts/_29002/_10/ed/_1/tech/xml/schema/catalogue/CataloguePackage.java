/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueFactory
 * @model kind="package"
 * @generated
 */
public interface CataloguePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalogue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:catalogue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalogue";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CataloguePackage eINSTANCE = iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl.init();

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CatalogueTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CatalogueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getCatalogueType()
	 * @generated
	 */
	int CATALOGUE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_TYPE__ITEM = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Catalogue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOGUE = 3;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM = 4;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Classification Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__CLASSIFICATION_REF = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__PROPERTY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__CLASS_REF = 3;

	/**
	 * The feature id for the '<em><b>Created View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__CREATED_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Data Specification Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__DATA_SPECIFICATION_REF = 5;

	/**
	 * The feature id for the '<em><b>Information Supplier Reference String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__INFORMATION_SUPPLIER_REFERENCE_STRING = 6;

	/**
	 * The feature id for the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__IS_DEPENDENT = 7;

	/**
	 * The feature id for the '<em><b>Is Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__IS_GLOBAL_ID = 8;

	/**
	 * The feature id for the '<em><b>Is Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__IS_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Is Proprietary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__IS_PROPRIETARY = 10;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__LOCAL_ID = 11;

	/**
	 * The feature id for the '<em><b>View Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__VIEW_OF = 12;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.PropertyValueTypeImpl <em>Property Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.PropertyValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getPropertyValueType()
	 * @generated
	 */
	int PROPERTY_VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__STRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__BAG_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__BOOLEAN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__COMPLEX_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__COMPOSITE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__CONTROLLED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__CURRENCY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__DATE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__DATE_TIME_VALUE = 8;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__FILE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__INTEGER_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__ITEM_REFERENCE_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__LOCALIZED_TEXT_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__MEASURE_RANGE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__NULL_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__RATIONAL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__REAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__SEQUENCE_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__SET_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__TIME_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__YEAR_MONTH_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__YEAR_VALUE = 23;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__ONE_OF = 24;

	/**
	 * The feature id for the '<em><b>Combination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__COMBINATION = 25;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__ENVIRONMENT = 26;

	/**
	 * The feature id for the '<em><b>Is Proprietary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__IS_PROPRIETARY = 27;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__PROPERTY_REF = 28;

	/**
	 * The feature id for the '<em><b>Subitem Path Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE__SUBITEM_PATH_PROPERTY_REF = 29;

	/**
	 * The number of structural features of the '<em>Property Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE_FEATURE_COUNT = 30;

	/**
	 * The number of operations of the '<em>Property Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ReferenceTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__DESIGNATION = 0;

	/**
	 * The feature id for the '<em><b>Organization Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__ORGANIZATION_CODE = 1;

	/**
	 * The feature id for the '<em><b>Organization Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__ORGANIZATION_REF = 2;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__REFERENCE_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueType
	 * @generated
	 */
	EClass getCatalogueType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueType#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueType#getItem()
	 * @see #getCatalogueType()
	 * @generated
	 */
	EReference getCatalogueType_Item();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalogue</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getCatalogue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Catalogue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Item();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getPropertyValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot#getReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Reference();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getClassificationRef <em>Classification Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Classification Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getClassificationRef()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_ClassificationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getReference()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getPropertyValue()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_PropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getClassRef()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_ClassRef();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getCreatedView <em>Created View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created View</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getCreatedView()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_CreatedView();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getDataSpecificationRef <em>Data Specification Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Specification Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getDataSpecificationRef()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_DataSpecificationRef();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getInformationSupplierReferenceString <em>Information Supplier Reference String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information Supplier Reference String</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getInformationSupplierReferenceString()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_InformationSupplierReferenceString();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsDependent <em>Is Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dependent</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsDependent()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_IsDependent();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsGlobalId <em>Is Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Global Id</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsGlobalId()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_IsGlobalId();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsModel <em>Is Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Model</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsModel()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_IsModel();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsProprietary <em>Is Proprietary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Proprietary</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsProprietary()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_IsProprietary();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getLocalId()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getViewOf <em>View Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Of</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getViewOf()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_ViewOf();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType <em>Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType
	 * @generated
	 */
	EClass getPropertyValueType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getStringValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_StringValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bag Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getBagValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_BagValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getBooleanValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getComplexValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCompositeValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controlled Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getControlledValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCurrencyValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getDateValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_DateValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getDateTimeValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getFileValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_FileValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getIntegerValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getItemReferenceValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getLocalizedTextValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureQualifiedNumberValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureRangeValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureSingleNumberValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getNullValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_NullValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getRationalValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_RationalValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getRealValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSequenceValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSetValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_SetValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getTimeValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_TimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Month Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getYearMonthValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getYearValue()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_YearValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One Of</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getOneOf()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_OneOf();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCombination <em>Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combination</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCombination()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_Combination();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getEnvironment()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EReference getPropertyValueType_Environment();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#isIsProprietary <em>Is Proprietary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Proprietary</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#isIsProprietary()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EAttribute getPropertyValueType_IsProprietary();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getPropertyRef()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EAttribute getPropertyValueType_PropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSubitemPathPropertyRef <em>Subitem Path Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subitem Path Property Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSubitemPathPropertyRef()
	 * @see #getPropertyValueType()
	 * @generated
	 */
	EAttribute getPropertyValueType_SubitemPathPropertyRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getDesignation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Designation</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getDesignation()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Designation();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getOrganizationCode <em>Organization Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Code</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getOrganizationCode()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_OrganizationCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getOrganizationRef <em>Organization Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getOrganizationRef()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_OrganizationRef();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getReferenceNumber()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_ReferenceNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogueFactory getCatalogueFactory();

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
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CatalogueTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CatalogueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getCatalogueType()
		 * @generated
		 */
		EClass CATALOGUE_TYPE = eINSTANCE.getCatalogueType();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE_TYPE__ITEM = eINSTANCE.getCatalogueType_Item();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Catalogue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATALOGUE = eINSTANCE.getDocumentRoot_Catalogue();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ITEM = eINSTANCE.getDocumentRoot_Item();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_VALUE = eINSTANCE.getDocumentRoot_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCE = eINSTANCE.getDocumentRoot_Reference();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Classification Ref</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__CLASSIFICATION_REF = eINSTANCE.getItemType_ClassificationRef();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__REFERENCE = eINSTANCE.getItemType_Reference();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__PROPERTY_VALUE = eINSTANCE.getItemType_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Class Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__CLASS_REF = eINSTANCE.getItemType_ClassRef();

		/**
		 * The meta object literal for the '<em><b>Created View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__CREATED_VIEW = eINSTANCE.getItemType_CreatedView();

		/**
		 * The meta object literal for the '<em><b>Data Specification Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__DATA_SPECIFICATION_REF = eINSTANCE.getItemType_DataSpecificationRef();

		/**
		 * The meta object literal for the '<em><b>Information Supplier Reference String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__INFORMATION_SUPPLIER_REFERENCE_STRING = eINSTANCE.getItemType_InformationSupplierReferenceString();

		/**
		 * The meta object literal for the '<em><b>Is Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__IS_DEPENDENT = eINSTANCE.getItemType_IsDependent();

		/**
		 * The meta object literal for the '<em><b>Is Global Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__IS_GLOBAL_ID = eINSTANCE.getItemType_IsGlobalId();

		/**
		 * The meta object literal for the '<em><b>Is Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__IS_MODEL = eINSTANCE.getItemType_IsModel();

		/**
		 * The meta object literal for the '<em><b>Is Proprietary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__IS_PROPRIETARY = eINSTANCE.getItemType_IsProprietary();

		/**
		 * The meta object literal for the '<em><b>Local Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__LOCAL_ID = eINSTANCE.getItemType_LocalId();

		/**
		 * The meta object literal for the '<em><b>View Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__VIEW_OF = eINSTANCE.getItemType_ViewOf();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.PropertyValueTypeImpl <em>Property Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.PropertyValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getPropertyValueType()
		 * @generated
		 */
		EClass PROPERTY_VALUE_TYPE = eINSTANCE.getPropertyValueType();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__STRING_VALUE = eINSTANCE.getPropertyValueType_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__BAG_VALUE = eINSTANCE.getPropertyValueType_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__BOOLEAN_VALUE = eINSTANCE.getPropertyValueType_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__COMPLEX_VALUE = eINSTANCE.getPropertyValueType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__COMPOSITE_VALUE = eINSTANCE.getPropertyValueType_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__CONTROLLED_VALUE = eINSTANCE.getPropertyValueType_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__CURRENCY_VALUE = eINSTANCE.getPropertyValueType_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__DATE_VALUE = eINSTANCE.getPropertyValueType_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__DATE_TIME_VALUE = eINSTANCE.getPropertyValueType_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__FILE_VALUE = eINSTANCE.getPropertyValueType_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__INTEGER_VALUE = eINSTANCE.getPropertyValueType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__ITEM_REFERENCE_VALUE = eINSTANCE.getPropertyValueType_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__LOCALIZED_TEXT_VALUE = eINSTANCE.getPropertyValueType_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getPropertyValueType_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__MEASURE_RANGE_VALUE = eINSTANCE.getPropertyValueType_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getPropertyValueType_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__NULL_VALUE = eINSTANCE.getPropertyValueType_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__RATIONAL_VALUE = eINSTANCE.getPropertyValueType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__REAL_VALUE = eINSTANCE.getPropertyValueType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__SEQUENCE_VALUE = eINSTANCE.getPropertyValueType_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__SET_VALUE = eINSTANCE.getPropertyValueType_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__TIME_VALUE = eINSTANCE.getPropertyValueType_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__YEAR_MONTH_VALUE = eINSTANCE.getPropertyValueType_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__YEAR_VALUE = eINSTANCE.getPropertyValueType_YearValue();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__ONE_OF = eINSTANCE.getPropertyValueType_OneOf();

		/**
		 * The meta object literal for the '<em><b>Combination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__COMBINATION = eINSTANCE.getPropertyValueType_Combination();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUE_TYPE__ENVIRONMENT = eINSTANCE.getPropertyValueType_Environment();

		/**
		 * The meta object literal for the '<em><b>Is Proprietary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE_TYPE__IS_PROPRIETARY = eINSTANCE.getPropertyValueType_IsProprietary();

		/**
		 * The meta object literal for the '<em><b>Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE_TYPE__PROPERTY_REF = eINSTANCE.getPropertyValueType_PropertyRef();

		/**
		 * The meta object literal for the '<em><b>Subitem Path Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE_TYPE__SUBITEM_PATH_PROPERTY_REF = eINSTANCE.getPropertyValueType_SubitemPathPropertyRef();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ReferenceTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__DESIGNATION = eINSTANCE.getReferenceType_Designation();

		/**
		 * The meta object literal for the '<em><b>Organization Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__ORGANIZATION_CODE = eINSTANCE.getReferenceType_OrganizationCode();

		/**
		 * The meta object literal for the '<em><b>Organization Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__ORGANIZATION_REF = eINSTANCE.getReferenceType_OrganizationRef();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__REFERENCE_NUMBER = eINSTANCE.getReferenceType_ReferenceNumber();

	}

} //CataloguePackage
