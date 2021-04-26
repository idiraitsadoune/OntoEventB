/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlFactory
 * @model kind="package"
 * @generated
 */
public interface OntomlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ontoml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso:std:iso:is:13584:-32:ed-1:tech:xml-schema:ontoml";
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ontoml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntomlPackage eINSTANCE = iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl.init();

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ALTERNATIVEUNITSTypeImpl <em>ALTERNATIVEUNITS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ALTERNATIVEUNITSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getALTERNATIVEUNITSType()
	 * @generated
	 */
	int ALTERNATIVEUNITS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Dic Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEUNITS_TYPE__DIC_UNIT = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEUNITS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEUNITS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ALTERNATIVEUNITS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEUNITS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ANYTYPETypeImpl <em>ANYTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ANYTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getANYTYPEType()
	 * @generated
	 */
	int ANYTYPE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYTYPE_TYPE__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>ANYTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYTYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ANYTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYTYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORISEMANTICRELATIONSHIPTypeImpl <em>APOSTERIORISEMANTICRELATIONSHIP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORISEMANTICRELATIONSHIPTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getAPOSTERIORISEMANTICRELATIONSHIPType()
	 * @generated
	 */
	int APOSTERIORISEMANTICRELATIONSHIP_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORISEMANTICRELATIONSHIP_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>APOSTERIORISEMANTICRELATIONSHIP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORISEMANTICRELATIONSHIP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>APOSTERIORISEMANTICRELATIONSHIP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORISEMANTICRELATIONSHIP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORICASEOFTypeImpl <em>APOSTERIORICASEOF Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORICASEOFTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getAPOSTERIORICASEOFType()
	 * @generated
	 */
	int APOSTERIORICASEOF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORICASEOF_TYPE__ID = APOSTERIORISEMANTICRELATIONSHIP_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Case Of Super</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORICASEOF_TYPE__CASE_OF_SUPER = APOSTERIORISEMANTICRELATIONSHIP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Of Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORICASEOF_TYPE__CASE_OF_SUB = APOSTERIORISEMANTICRELATIONSHIP_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Corresponding Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES = APOSTERIORISEMANTICRELATIONSHIP_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>APOSTERIORICASEOF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORICASEOF_TYPE_FEATURE_COUNT = APOSTERIORISEMANTICRELATIONSHIP_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>APOSTERIORICASEOF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORICASEOF_TYPE_OPERATION_COUNT = APOSTERIORISEMANTICRELATIONSHIP_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORISEMANTICRELATIONSHIPSTypeImpl <em>APOSTERIORISEMANTICRELATIONSHIPS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORISEMANTICRELATIONSHIPSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getAPOSTERIORISEMANTICRELATIONSHIPSType()
	 * @generated
	 */
	int APOSTERIORISEMANTICRELATIONSHIPS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>APosteriori Semantic Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORISEMANTICRELATIONSHIPS_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIP = 0;

	/**
	 * The number of structural features of the '<em>APOSTERIORISEMANTICRELATIONSHIPS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORISEMANTICRELATIONSHIPS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>APOSTERIORISEMANTICRELATIONSHIPS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORISEMANTICRELATIONSHIPS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORIVIEWOFTypeImpl <em>APOSTERIORIVIEWOF Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORIVIEWOFTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getAPOSTERIORIVIEWOFType()
	 * @generated
	 */
	int APOSTERIORIVIEWOF_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORIVIEWOF_TYPE__ID = APOSTERIORISEMANTICRELATIONSHIP_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORIVIEWOF_TYPE__ITEM = APOSTERIORISEMANTICRELATIONSHIP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORIVIEWOF_TYPE__MODEL = APOSTERIORISEMANTICRELATIONSHIP_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Corresponding Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES = APOSTERIORISEMANTICRELATIONSHIP_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>APOSTERIORIVIEWOF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORIVIEWOF_TYPE_FEATURE_COUNT = APOSTERIORISEMANTICRELATIONSHIP_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>APOSTERIORIVIEWOF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOSTERIORIVIEWOF_TYPE_OPERATION_COUNT = APOSTERIORISEMANTICRELATIONSHIP_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ARRAYTYPETypeImpl <em>ARRAYTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ARRAYTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getARRAYTYPEType()
	 * @generated
	 */
	int ARRAYTYPE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYTYPE_TYPE__BOUND1 = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYTYPE_TYPE__BOUND2 = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYTYPE_TYPE__VALUE_TYPE = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYTYPE_TYPE__UNIQUENESS = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Are Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYTYPE_TYPE__ARE_OPTIONAL = ANYTYPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ARRAYTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>ARRAYTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAYTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ASSIGNEDVALUETypeImpl <em>ASSIGNEDVALUE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ASSIGNEDVALUETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getASSIGNEDVALUEType()
	 * @generated
	 */
	int ASSIGNEDVALUE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__STRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__BAG_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__BOOLEAN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__COMPLEX_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__COMPOSITE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__CONTROLLED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__CURRENCY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__DATE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__DATE_TIME_VALUE = 8;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__FILE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__INTEGER_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__ITEM_REFERENCE_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__LOCALIZED_TEXT_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__MEASURE_RANGE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__NULL_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__RATIONAL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__REAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__SEQUENCE_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__SET_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__TIME_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__YEAR_MONTH_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE__YEAR_VALUE = 23;

	/**
	 * The number of structural features of the '<em>ASSIGNEDVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>ASSIGNEDVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEDVALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.AUTHORSTypeImpl <em>AUTHORS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.AUTHORSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getAUTHORSType()
	 * @generated
	 */
	int AUTHORS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__PERSON = 0;

	/**
	 * The number of structural features of the '<em>AUTHORS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AUTHORS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.AXIS1PLACEMENTTYPETypeImpl <em>AXIS1PLACEMENTTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.AXIS1PLACEMENTTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getAXIS1PLACEMENTTYPEType()
	 * @generated
	 */
	int AXIS1PLACEMENTTYPE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS1PLACEMENTTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS1PLACEMENTTYPE_TYPE__CLASS_REF = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AXIS1PLACEMENTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS1PLACEMENTTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AXIS1PLACEMENTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS1PLACEMENTTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.AXIS2PLACEMENT2DTYPETypeImpl <em>AXIS2PLACEMENT2DTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.AXIS2PLACEMENT2DTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getAXIS2PLACEMENT2DTYPEType()
	 * @generated
	 */
	int AXIS2PLACEMENT2DTYPE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2PLACEMENT2DTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2PLACEMENT2DTYPE_TYPE__CLASS_REF = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AXIS2PLACEMENT2DTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2PLACEMENT2DTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AXIS2PLACEMENT2DTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2PLACEMENT2DTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.AXIS2PLACEMENT3DTYPETypeImpl <em>AXIS2PLACEMENT3DTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.AXIS2PLACEMENT3DTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getAXIS2PLACEMENT3DTYPEType()
	 * @generated
	 */
	int AXIS2PLACEMENT3DTYPE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2PLACEMENT3DTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2PLACEMENT3DTYPE_TYPE__CLASS_REF = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AXIS2PLACEMENT3DTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2PLACEMENT3DTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AXIS2PLACEMENT3DTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2PLACEMENT3DTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.BAGTYPETypeImpl <em>BAGTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.BAGTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getBAGTYPEType()
	 * @generated
	 */
	int BAGTYPE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGTYPE_TYPE__BOUND1 = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGTYPE_TYPE__BOUND2 = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGTYPE_TYPE__VALUE_TYPE = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BAGTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BAGTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.BOOLEANTYPETypeImpl <em>BOOLEANTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.BOOLEANTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getBOOLEANTYPEType()
	 * @generated
	 */
	int BOOLEANTYPE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BOOLEANTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BOOLEANTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOMAINCONSTRAINTTypeImpl <em>DOMAINCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOMAINCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDOMAINCONSTRAINTType()
	 * @generated
	 */
	int DOMAINCONSTRAINT_TYPE = 72;

	/**
	 * The number of structural features of the '<em>DOMAINCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINCONSTRAINT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DOMAINCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINCONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CARDINALITYCONSTRAINTTypeImpl <em>CARDINALITYCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CARDINALITYCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCARDINALITYCONSTRAINTType()
	 * @generated
	 */
	int CARDINALITYCONSTRAINT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITYCONSTRAINT_TYPE__BOUND1 = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITYCONSTRAINT_TYPE__BOUND2 = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CARDINALITYCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITYCONSTRAINT_TYPE_FEATURE_COUNT = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CARDINALITYCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITYCONSTRAINT_TYPE_OPERATION_COUNT = DOMAINCONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl <em>CLASS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSType()
	 * @generated
	 */
	int CLASS_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DATE_OF_CURRENT_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DATE_OF_CURRENT_REVISION = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__REVISION = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__TRANSLATION = 5;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__SOURCE_LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__IS_DEPRECATED = 7;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__IS_DEPRECATED_INTERPRETATION = 8;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__PREFERRED_NAME = 9;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__SYNONYMOUS_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__SHORT_NAME = 11;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__ICON = 12;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DEFINITION = 13;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__SOURCE_DOC_OF_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__NOTE = 15;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__REMARK = 16;

	/**
	 * The feature id for the '<em><b>Its Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__ITS_SUPERCLASS = 17;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DESCRIBED_BY = 18;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DEFINED_TYPES = 19;

	/**
	 * The feature id for the '<em><b>Defined Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DEFINED_DOCUMENTS = 20;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__CONSTRAINTS = 21;

	/**
	 * The feature id for the '<em><b>Hierarchical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__HIERARCHICAL_POSITION = 22;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__KEYWORDS = 23;

	/**
	 * The feature id for the '<em><b>Sub Class Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__SUB_CLASS_PROPERTIES = 24;

	/**
	 * The feature id for the '<em><b>Class Constant Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__CLASS_CONSTANT_VALUES = 25;

	/**
	 * The feature id for the '<em><b>Geometric Representation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT = 26;

	/**
	 * The feature id for the '<em><b>Global Unit Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__GLOBAL_UNIT_CONTEXT = 27;

	/**
	 * The feature id for the '<em><b>Keyword References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__KEYWORD_REFERENCES = 28;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__FREE_RELATIONS = 29;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__GUID = 30;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__GUID2 = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__ID = 32;

	/**
	 * The number of structural features of the '<em>CLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = 33;

	/**
	 * The number of operations of the '<em>CLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CATEGORIZATIONCLASSTypeImpl <em>CATEGORIZATIONCLASS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CATEGORIZATIONCLASSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCATEGORIZATIONCLASSType()
	 * @generated
	 */
	int CATEGORIZATIONCLASS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION = CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__DATE_OF_CURRENT_VERSION = CLASS_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__DATE_OF_CURRENT_REVISION = CLASS_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__REVISION = CLASS_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__STATUS = CLASS_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__TRANSLATION = CLASS_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__SOURCE_LANGUAGE = CLASS_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__IS_DEPRECATED = CLASS_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__IS_DEPRECATED_INTERPRETATION = CLASS_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__PREFERRED_NAME = CLASS_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__SYNONYMOUS_NAMES = CLASS_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__SHORT_NAME = CLASS_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__ICON = CLASS_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__DEFINITION = CLASS_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__SOURCE_DOC_OF_DEFINITION = CLASS_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__NOTE = CLASS_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__REMARK = CLASS_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Its Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__ITS_SUPERCLASS = CLASS_TYPE__ITS_SUPERCLASS;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__DESCRIBED_BY = CLASS_TYPE__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__DEFINED_TYPES = CLASS_TYPE__DEFINED_TYPES;

	/**
	 * The feature id for the '<em><b>Defined Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__DEFINED_DOCUMENTS = CLASS_TYPE__DEFINED_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__CONSTRAINTS = CLASS_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__HIERARCHICAL_POSITION = CLASS_TYPE__HIERARCHICAL_POSITION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__KEYWORDS = CLASS_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Sub Class Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__SUB_CLASS_PROPERTIES = CLASS_TYPE__SUB_CLASS_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Class Constant Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__CLASS_CONSTANT_VALUES = CLASS_TYPE__CLASS_CONSTANT_VALUES;

	/**
	 * The feature id for the '<em><b>Geometric Representation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT = CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Global Unit Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__GLOBAL_UNIT_CONTEXT = CLASS_TYPE__GLOBAL_UNIT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Keyword References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__KEYWORD_REFERENCES = CLASS_TYPE__KEYWORD_REFERENCES;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__FREE_RELATIONS = CLASS_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__GUID = CLASS_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__GUID2 = CLASS_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__ID = CLASS_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Categorization Class Superclasses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES = CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CATEGORIZATIONCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE_FEATURE_COUNT = CLASS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CATEGORIZATIONCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATIONCLASS_TYPE_OPERATION_COUNT = CLASS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSCONSTANTVALUESTypeImpl <em>CLASSCONSTANTVALUES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSCONSTANTVALUESTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSCONSTANTVALUESType()
	 * @generated
	 */
	int CLASSCONSTANTVALUES_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Class Value Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSCONSTANTVALUES_TYPE__CLASS_VALUE_ASSIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>CLASSCONSTANTVALUES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSCONSTANTVALUES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CLASSCONSTANTVALUES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSCONSTANTVALUES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONSTRAINTTypeImpl <em>CONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONSTRAINTType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Constraint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE__CONSTRAINT_ID = 0;

	/**
	 * The number of structural features of the '<em>CONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSCONSTRAINTTypeImpl <em>CLASSCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSCONSTRAINTType()
	 * @generated
	 */
	int CLASSCONSTRAINT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Constraint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSCONSTRAINT_TYPE__CONSTRAINT_ID = CONSTRAINT_TYPE__CONSTRAINT_ID;

	/**
	 * The number of structural features of the '<em>CLASSCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSCONSTRAINT_TYPE_FEATURE_COUNT = CONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CLASSCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSCONSTRAINT_TYPE_OPERATION_COUNT = CONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSESREFERENCETypeImpl <em>CLASSESREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSESREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSESREFERENCEType()
	 * @generated
	 */
	int CLASSESREFERENCE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSESREFERENCE_TYPE__CLASS = 0;

	/**
	 * The number of structural features of the '<em>CLASSESREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSESREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CLASSESREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSESREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl <em>CLASSEXTENSION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSEXTENSIONType()
	 * @generated
	 */
	int CLASSEXTENSION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Dictionary Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Content Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE__CONTENT_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Content Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE__CONTENT_REVISION = 2;

	/**
	 * The feature id for the '<em><b>Recommended Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE__CLASSIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Instance Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE__POPULATION = 6;

	/**
	 * The feature id for the '<em><b>Table Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE__TABLE_LIKE = 7;

	/**
	 * The number of structural features of the '<em>CLASSEXTENSION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>CLASSEXTENSION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSEXTENSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSIFICATIONTypeImpl <em>CLASSIFICATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSIFICATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSIFICATIONType()
	 * @generated
	 */
	int CLASSIFICATION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Property Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE__PROPERTY_CLASSIFICATION = 0;

	/**
	 * The number of structural features of the '<em>CLASSIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CLASSIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSPRESENTATIONONPAPERTypeImpl <em>CLASSPRESENTATIONONPAPER Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSPRESENTATIONONPAPERTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSPRESENTATIONONPAPERType()
	 * @generated
	 */
	int CLASSPRESENTATIONONPAPER_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Illustration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPRESENTATIONONPAPER_TYPE__ILLUSTRATION = 0;

	/**
	 * The number of structural features of the '<em>CLASSPRESENTATIONONPAPER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPRESENTATIONONPAPER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CLASSPRESENTATIONONPAPER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPRESENTATIONONPAPER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSPRESENTATIONONSCREENTypeImpl <em>CLASSPRESENTATIONONSCREEN Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSPRESENTATIONONSCREENTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSPRESENTATIONONSCREENType()
	 * @generated
	 */
	int CLASSPRESENTATIONONSCREEN_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Illustration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPRESENTATIONONSCREEN_TYPE__ILLUSTRATION = 0;

	/**
	 * The number of structural features of the '<em>CLASSPRESENTATIONONSCREEN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPRESENTATIONONSCREEN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CLASSPRESENTATIONONSCREEN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPRESENTATIONONSCREEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSREFERENCETypeImpl <em>CLASSREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSREFERENCEType()
	 * @generated
	 */
	int CLASSREFERENCE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSREFERENCE_TYPE__CLASS_REF = 0;

	/**
	 * The number of structural features of the '<em>CLASSREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CLASSREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSREFERENCETYPETypeImpl <em>CLASSREFERENCETYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSREFERENCETYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSREFERENCETYPEType()
	 * @generated
	 */
	int CLASSREFERENCETYPE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSREFERENCETYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSREFERENCETYPE_TYPE__DOMAIN = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CLASSREFERENCETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSREFERENCETYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CLASSREFERENCETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSREFERENCETYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSVALUEASSIGNMENTTypeImpl <em>CLASSVALUEASSIGNMENT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSVALUEASSIGNMENTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCLASSVALUEASSIGNMENTType()
	 * @generated
	 */
	int CLASSVALUEASSIGNMENT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Super Class Defined Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Assigned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE = 1;

	/**
	 * The number of structural features of the '<em>CLASSVALUEASSIGNMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSVALUEASSIGNMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CLASSVALUEASSIGNMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSVALUEASSIGNMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl <em>PROPERTY Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPROPERTYType()
	 * @generated
	 */
	int PROPERTY_TYPE = 139;

	/**
	 * The feature id for the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME_SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DATE_OF_CURRENT_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DATE_OF_CURRENT_REVISION = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__STATUS = 5;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__TRANSLATION = 6;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__SOURCE_LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__IS_DEPRECATED = 8;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION = 9;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__PREFERRED_NAME = 10;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__SYNONYMOUS_NAMES = 11;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__SHORT_NAME = 12;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__ICON = 13;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NOTE = 16;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__REMARK = 17;

	/**
	 * The feature id for the '<em><b>Preferred Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__PREFERRED_SYMBOL = 18;

	/**
	 * The feature id for the '<em><b>Synonymous Symbols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__SYNONYMOUS_SYMBOLS = 19;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__FIGURE = 20;

	/**
	 * The feature id for the '<em><b>Det Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DET_CLASSIFICATION = 21;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DOMAIN = 22;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__FORMULA = 23;

	/**
	 * The feature id for the '<em><b>Synonym References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__SYNONYM_REFERENCES = 24;

	/**
	 * The feature id for the '<em><b>Suggested Value List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__SUGGESTED_VALUE_LIST = 25;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__FREE_RELATIONS = 26;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__GUID = 27;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__GUID2 = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__ID = 29;

	/**
	 * The number of structural features of the '<em>PROPERTY Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 30;

	/**
	 * The number of operations of the '<em>PROPERTY Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONDITIONDETTypeImpl <em>CONDITIONDET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONDITIONDETTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONDITIONDETType()
	 * @generated
	 */
	int CONDITIONDET_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__NAME_SCOPE = PROPERTY_TYPE__NAME_SCOPE;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__DATE_OF_ORIGINAL_DEFINITION = PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__DATE_OF_CURRENT_VERSION = PROPERTY_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__DATE_OF_CURRENT_REVISION = PROPERTY_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__REVISION = PROPERTY_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__STATUS = PROPERTY_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__TRANSLATION = PROPERTY_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__SOURCE_LANGUAGE = PROPERTY_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__IS_DEPRECATED = PROPERTY_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__IS_DEPRECATED_INTERPRETATION = PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__PREFERRED_NAME = PROPERTY_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__SYNONYMOUS_NAMES = PROPERTY_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__SHORT_NAME = PROPERTY_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__ICON = PROPERTY_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__DEFINITION = PROPERTY_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__SOURCE_DOC_OF_DEFINITION = PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__NOTE = PROPERTY_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__REMARK = PROPERTY_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Preferred Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__PREFERRED_SYMBOL = PROPERTY_TYPE__PREFERRED_SYMBOL;

	/**
	 * The feature id for the '<em><b>Synonymous Symbols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__SYNONYMOUS_SYMBOLS = PROPERTY_TYPE__SYNONYMOUS_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__FIGURE = PROPERTY_TYPE__FIGURE;

	/**
	 * The feature id for the '<em><b>Det Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__DET_CLASSIFICATION = PROPERTY_TYPE__DET_CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__DOMAIN = PROPERTY_TYPE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__FORMULA = PROPERTY_TYPE__FORMULA;

	/**
	 * The feature id for the '<em><b>Synonym References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__SYNONYM_REFERENCES = PROPERTY_TYPE__SYNONYM_REFERENCES;

	/**
	 * The feature id for the '<em><b>Suggested Value List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__SUGGESTED_VALUE_LIST = PROPERTY_TYPE__SUGGESTED_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__FREE_RELATIONS = PROPERTY_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__GUID = PROPERTY_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__GUID2 = PROPERTY_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE__ID = PROPERTY_TYPE__ID;

	/**
	 * The number of structural features of the '<em>CONDITIONDET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE_FEATURE_COUNT = PROPERTY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CONDITIONDET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONDET_TYPE_OPERATION_COUNT = PROPERTY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONFIGURATIONCONTROLCONSTRAINTTypeImpl <em>CONFIGURATIONCONTROLCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONFIGURATIONCONTROLCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONFIGURATIONCONTROLCONSTRAINTType()
	 * @generated
	 */
	int CONFIGURATIONCONTROLCONSTRAINT_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Constraint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONCONTROLCONSTRAINT_TYPE__CONSTRAINT_ID = CLASSCONSTRAINT_TYPE__CONSTRAINT_ID;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION = CLASSCONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION = CLASSCONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CONFIGURATIONCONTROLCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONCONTROLCONSTRAINT_TYPE_FEATURE_COUNT = CLASSCONSTRAINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CONFIGURATIONCONTROLCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONCONTROLCONSTRAINT_TYPE_OPERATION_COUNT = CLASSCONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONSTRAINTORCONSTRAINTIDTypeImpl <em>CONSTRAINTORCONSTRAINTID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONSTRAINTORCONSTRAINTIDTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONSTRAINTORCONSTRAINTIDType()
	 * @generated
	 */
	int CONSTRAINTORCONSTRAINTID_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Constraint Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Constraint Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_REF = 1;

	/**
	 * The number of structural features of the '<em>CONSTRAINTORCONSTRAINTID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTORCONSTRAINTID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CONSTRAINTORCONSTRAINTID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTORCONSTRAINTID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONSTRAINTSTypeImpl <em>CONSTRAINTS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONSTRAINTSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONSTRAINTSType()
	 * @generated
	 */
	int CONSTRAINTS_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>CONSTRAINTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONSTRAINTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDCLASSESTypeImpl <em>CONTAINEDCLASSES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDCLASSESTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTAINEDCLASSESType()
	 * @generated
	 */
	int CONTAINEDCLASSES_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDCLASSES_TYPE__CLASS = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDCLASSES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDCLASSES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDCLASSES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDCLASSES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDCLASSEXTENSIONSTypeImpl <em>CONTAINEDCLASSEXTENSIONS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDCLASSEXTENSIONSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTAINEDCLASSEXTENSIONSType()
	 * @generated
	 */
	int CONTAINEDCLASSEXTENSIONS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Class Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDCLASSEXTENSIONS_TYPE__CLASS_EXTENSION = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDCLASSEXTENSIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDCLASSEXTENSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDCLASSEXTENSIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDCLASSEXTENSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDDATATYPESTypeImpl <em>CONTAINEDDATATYPES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDDATATYPESTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTAINEDDATATYPESType()
	 * @generated
	 */
	int CONTAINEDDATATYPES_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDDATATYPES_TYPE__DATATYPE = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDDATATYPES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDDATATYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDDATATYPES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDDATATYPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDDOCUMENTSTypeImpl <em>CONTAINEDDOCUMENTS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDDOCUMENTSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTAINEDDOCUMENTSType()
	 * @generated
	 */
	int CONTAINEDDOCUMENTS_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDDOCUMENTS_TYPE__DOCUMENT = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDDOCUMENTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDDOCUMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDDOCUMENTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDDOCUMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDKEYWORDSTypeImpl <em>CONTAINEDKEYWORDS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDKEYWORDSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTAINEDKEYWORDSType()
	 * @generated
	 */
	int CONTAINEDKEYWORDS_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDKEYWORDS_TYPE__KEYWORD = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDKEYWORDS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDKEYWORDS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDKEYWORDS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDKEYWORDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDPROPERTIESTypeImpl <em>CONTAINEDPROPERTIES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDPROPERTIESTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTAINEDPROPERTIESType()
	 * @generated
	 */
	int CONTAINEDPROPERTIES_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDPROPERTIES_TYPE__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDPROPERTIES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDPROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDPROPERTIES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDPROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDSUPPLIERSTypeImpl <em>CONTAINEDSUPPLIERS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDSUPPLIERSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTAINEDSUPPLIERSType()
	 * @generated
	 */
	int CONTAINEDSUPPLIERS_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDSUPPLIERS_TYPE__SUPPLIER = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDSUPPLIERS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDSUPPLIERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDSUPPLIERS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDSUPPLIERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDSYNONYMSTypeImpl <em>CONTAINEDSYNONYMS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDSYNONYMSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTAINEDSYNONYMSType()
	 * @generated
	 */
	int CONTAINEDSYNONYMS_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Synonym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDSYNONYMS_TYPE__SYNONYM = 0;

	/**
	 * The number of structural features of the '<em>CONTAINEDSYNONYMS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDSYNONYMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTAINEDSYNONYMS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINEDSYNONYMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.UNITTypeImpl <em>UNIT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.UNITTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getUNITType()
	 * @generated
	 */
	int UNIT_TYPE = 183;

	/**
	 * The number of structural features of the '<em>UNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>UNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NAMEDUNITTypeImpl <em>NAMEDUNIT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NAMEDUNITTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getNAMEDUNITType()
	 * @generated
	 */
	int NAMEDUNIT_TYPE = 117;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDUNIT_TYPE__DIMENSIONS = UNIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NAMEDUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDUNIT_TYPE_FEATURE_COUNT = UNIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NAMEDUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDUNIT_TYPE_OPERATION_COUNT = UNIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTDEPENDENTUNITTypeImpl <em>CONTEXTDEPENDENTUNIT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTDEPENDENTUNITTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTEXTDEPENDENTUNITType()
	 * @generated
	 */
	int CONTEXTDEPENDENTUNIT_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTDEPENDENTUNIT_TYPE__DIMENSIONS = NAMEDUNIT_TYPE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTDEPENDENTUNIT_TYPE__NAME = NAMEDUNIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CONTEXTDEPENDENTUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTDEPENDENTUNIT_TYPE_FEATURE_COUNT = NAMEDUNIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CONTEXTDEPENDENTUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTDEPENDENTUNIT_TYPE_OPERATION_COUNT = NAMEDUNIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTPARAMETERCONSTRAINTSTypeImpl <em>CONTEXTPARAMETERCONSTRAINTS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTPARAMETERCONSTRAINTSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTEXTPARAMETERCONSTRAINTSType()
	 * @generated
	 */
	int CONTEXTPARAMETERCONSTRAINTS_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Integrity Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTPARAMETERCONSTRAINTS_TYPE__INTEGRITY_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>CONTEXTPARAMETERCONSTRAINTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTPARAMETERCONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTEXTPARAMETERCONSTRAINTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTPARAMETERCONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTPARAMICONTypeImpl <em>CONTEXTPARAMICON Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTPARAMICONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTEXTPARAMICONType()
	 * @generated
	 */
	int CONTEXTPARAMICON_TYPE = 42;

	/**
	 * The feature id for the '<em><b>A6 Illustration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTPARAMICON_TYPE__A6_ILLUSTRATION = 0;

	/**
	 * The number of structural features of the '<em>CONTEXTPARAMICON Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTPARAMICON_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CONTEXTPARAMICON Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTPARAMICON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYCONSTRAINTTypeImpl <em>PROPERTYCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPROPERTYCONSTRAINTType()
	 * @generated
	 */
	int PROPERTYCONSTRAINT_TYPE = 136;

	/**
	 * The feature id for the '<em><b>Constraint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYCONSTRAINT_TYPE__CONSTRAINT_ID = CONSTRAINT_TYPE__CONSTRAINT_ID;

	/**
	 * The feature id for the '<em><b>Constrained Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY = CONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PROPERTYCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYCONSTRAINT_TYPE_FEATURE_COUNT = CONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PROPERTYCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYCONSTRAINT_TYPE_OPERATION_COUNT = CONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTRESTRICTIONCONSTRAINTTypeImpl <em>CONTEXTRESTRICTIONCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTRESTRICTIONCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONTEXTRESTRICTIONCONSTRAINTType()
	 * @generated
	 */
	int CONTEXTRESTRICTIONCONSTRAINT_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Constraint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONSTRAINT_ID = PROPERTYCONSTRAINT_TYPE__CONSTRAINT_ID;

	/**
	 * The feature id for the '<em><b>Constrained Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONSTRAINED_PROPERTY = PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Context Parameter Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS = PROPERTYCONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CONTEXTRESTRICTIONCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTRESTRICTIONCONSTRAINT_TYPE_FEATURE_COUNT = PROPERTYCONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CONTEXTRESTRICTIONCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTRESTRICTIONCONSTRAINT_TYPE_OPERATION_COUNT = PROPERTYCONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONVERSIONBASEDUNITTypeImpl <em>CONVERSIONBASEDUNIT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONVERSIONBASEDUNITTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCONVERSIONBASEDUNITType()
	 * @generated
	 */
	int CONVERSIONBASEDUNIT_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSIONBASEDUNIT_TYPE__DIMENSIONS = NAMEDUNIT_TYPE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSIONBASEDUNIT_TYPE__NAME = NAMEDUNIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSIONBASEDUNIT_TYPE__VALUE_COMPONENT = NAMEDUNIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT = NAMEDUNIT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CONVERSIONBASEDUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSIONBASEDUNIT_TYPE_FEATURE_COUNT = NAMEDUNIT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CONVERSIONBASEDUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSIONBASEDUNIT_TYPE_OPERATION_COUNT = NAMEDUNIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CORRESPONDINGPROPERTIESTypeImpl <em>CORRESPONDINGPROPERTIES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CORRESPONDINGPROPERTIESTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCORRESPONDINGPROPERTIESType()
	 * @generated
	 */
	int CORRESPONDINGPROPERTIES_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDINGPROPERTIES_TYPE__MAPPING = 0;

	/**
	 * The number of structural features of the '<em>CORRESPONDINGPROPERTIES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDINGPROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CORRESPONDINGPROPERTIES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDINGPROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CREATEICONTypeImpl <em>CREATEICON Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CREATEICONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCREATEICONType()
	 * @generated
	 */
	int CREATEICON_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Illustration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATEICON_TYPE__ILLUSTRATION = 0;

	/**
	 * The number of structural features of the '<em>CREATEICON Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATEICON_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CREATEICON Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATEICON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPEREFERENCETypeImpl <em>DATATYPEREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPEREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDATATYPEREFERENCEType()
	 * @generated
	 */
	int DATATYPEREFERENCE_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Datatype Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEREFERENCE_TYPE__DATATYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>DATATYPEREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DATATYPEREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPESREFERENCETypeImpl <em>DATATYPESREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPESREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDATATYPESREFERENCEType()
	 * @generated
	 */
	int DATATYPESREFERENCE_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPESREFERENCE_TYPE__DATATYPE = 0;

	/**
	 * The number of structural features of the '<em>DATATYPESREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPESREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DATATYPESREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPESREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl <em>DATATYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDATATYPEType()
	 * @generated
	 */
	int DATATYPE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__NAME_SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__DATE_OF_ORIGINAL_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__DATE_OF_CURRENT_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__DATE_OF_CURRENT_REVISION = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__STATUS = 5;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__TRANSLATION = 6;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__SOURCE_LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__IS_DEPRECATED = 8;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION = 9;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__PREFERRED_NAME = 10;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__SYNONYMOUS_NAMES = 11;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__SHORT_NAME = 12;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__ICON = 13;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__TYPE_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Value Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__VALUE_SPECIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__GUID = 16;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__GUID2 = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE__ID = 18;

	/**
	 * The number of structural features of the '<em>DATATYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>DATATYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATEDATATYPETypeImpl <em>DATEDATATYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATEDATATYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDATEDATATYPEType()
	 * @generated
	 */
	int DATEDATATYPE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEDATATYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEDATATYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DATEDATATYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEDATATYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DATEDATATYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEDATATYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATETIMEDATATYPETypeImpl <em>DATETIMEDATATYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATETIMEDATATYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDATETIMEDATATYPEType()
	 * @generated
	 */
	int DATETIMEDATATYPE_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIMEDATATYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIMEDATATYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DATETIMEDATATYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIMEDATATYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DATETIMEDATATYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIMEDATATYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DEPENDENTPDETTypeImpl <em>DEPENDENTPDET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DEPENDENTPDETTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDEPENDENTPDETType()
	 * @generated
	 */
	int DEPENDENTPDET_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__NAME_SCOPE = PROPERTY_TYPE__NAME_SCOPE;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__DATE_OF_ORIGINAL_DEFINITION = PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__DATE_OF_CURRENT_VERSION = PROPERTY_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__DATE_OF_CURRENT_REVISION = PROPERTY_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__REVISION = PROPERTY_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__STATUS = PROPERTY_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__TRANSLATION = PROPERTY_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__SOURCE_LANGUAGE = PROPERTY_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__IS_DEPRECATED = PROPERTY_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__IS_DEPRECATED_INTERPRETATION = PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__PREFERRED_NAME = PROPERTY_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__SYNONYMOUS_NAMES = PROPERTY_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__SHORT_NAME = PROPERTY_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__ICON = PROPERTY_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__DEFINITION = PROPERTY_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__SOURCE_DOC_OF_DEFINITION = PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__NOTE = PROPERTY_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__REMARK = PROPERTY_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Preferred Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__PREFERRED_SYMBOL = PROPERTY_TYPE__PREFERRED_SYMBOL;

	/**
	 * The feature id for the '<em><b>Synonymous Symbols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__SYNONYMOUS_SYMBOLS = PROPERTY_TYPE__SYNONYMOUS_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__FIGURE = PROPERTY_TYPE__FIGURE;

	/**
	 * The feature id for the '<em><b>Det Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__DET_CLASSIFICATION = PROPERTY_TYPE__DET_CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__DOMAIN = PROPERTY_TYPE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__FORMULA = PROPERTY_TYPE__FORMULA;

	/**
	 * The feature id for the '<em><b>Synonym References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__SYNONYM_REFERENCES = PROPERTY_TYPE__SYNONYM_REFERENCES;

	/**
	 * The feature id for the '<em><b>Suggested Value List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__SUGGESTED_VALUE_LIST = PROPERTY_TYPE__SUGGESTED_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__FREE_RELATIONS = PROPERTY_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__GUID = PROPERTY_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__GUID2 = PROPERTY_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__ID = PROPERTY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE__DEPENDS_ON = PROPERTY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DEPENDENTPDET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE_FEATURE_COUNT = PROPERTY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DEPENDENTPDET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENTPDET_TYPE_OPERATION_COUNT = PROPERTY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DERIVEDUNITELEMENTTypeImpl <em>DERIVEDUNITELEMENT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DERIVEDUNITELEMENTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDERIVEDUNITELEMENTType()
	 * @generated
	 */
	int DERIVEDUNITELEMENT_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVEDUNITELEMENT_TYPE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVEDUNITELEMENT_TYPE__EXPONENT = 1;

	/**
	 * The number of structural features of the '<em>DERIVEDUNITELEMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVEDUNITELEMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DERIVEDUNITELEMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVEDUNITELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DERIVEDUNITTypeImpl <em>DERIVEDUNIT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DERIVEDUNITTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDERIVEDUNITType()
	 * @generated
	 */
	int DERIVEDUNIT_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Derived Unit Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVEDUNIT_TYPE__DERIVED_UNIT_ELEMENT = UNIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DERIVEDUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVEDUNIT_TYPE_FEATURE_COUNT = UNIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DERIVEDUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVEDUNIT_TYPE_OPERATION_COUNT = UNIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARIESREFERENCETypeImpl <em>DICTIONARIESREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARIESREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDICTIONARIESREFERENCEType()
	 * @generated
	 */
	int DICTIONARIESREFERENCE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARIESREFERENCE_TYPE__DICTIONARY = 0;

	/**
	 * The number of structural features of the '<em>DICTIONARIESREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARIESREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DICTIONARIESREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARIESREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl <em>DICTIONARY Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDICTIONARYType()
	 * @generated
	 */
	int DICTIONARY_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__IS_COMPLETE = 0;

	/**
	 * The feature id for the '<em><b>Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__UPDATES = 1;

	/**
	 * The feature id for the '<em><b>Update Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__UPDATE_AGREEMENT = 2;

	/**
	 * The feature id for the '<em><b>Referenced Dictionaries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__REFERENCED_DICTIONARIES = 3;

	/**
	 * The feature id for the '<em><b>Responsible Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER = 4;

	/**
	 * The feature id for the '<em><b>Contained Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__CONTAINED_CLASSES = 5;

	/**
	 * The feature id for the '<em><b>APosteriori Semantic Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS = 6;

	/**
	 * The feature id for the '<em><b>Contained Suppliers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__CONTAINED_SUPPLIERS = 7;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__CONTAINED_PROPERTIES = 8;

	/**
	 * The feature id for the '<em><b>Contained Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__CONTAINED_DOCUMENTS = 9;

	/**
	 * The feature id for the '<em><b>Contained Datatypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__CONTAINED_DATATYPES = 10;

	/**
	 * The feature id for the '<em><b>Contained Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__CONTAINED_KEYWORDS = 11;

	/**
	 * The feature id for the '<em><b>Contained Synonyms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__CONTAINED_SYNONYMS = 12;

	/**
	 * The number of structural features of the '<em>DICTIONARY Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>DICTIONARY Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYINSTANDARDFORMATTypeImpl <em>DICTIONARYINSTANDARDFORMAT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYINSTANDARDFORMATTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDICTIONARYINSTANDARDFORMATType()
	 * @generated
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__IS_COMPLETE = DICTIONARY_TYPE__IS_COMPLETE;

	/**
	 * The feature id for the '<em><b>Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__UPDATES = DICTIONARY_TYPE__UPDATES;

	/**
	 * The feature id for the '<em><b>Update Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__UPDATE_AGREEMENT = DICTIONARY_TYPE__UPDATE_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Referenced Dictionaries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__REFERENCED_DICTIONARIES = DICTIONARY_TYPE__REFERENCED_DICTIONARIES;

	/**
	 * The feature id for the '<em><b>Responsible Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__RESPONSIBLE_SUPPLIER = DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Contained Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__CONTAINED_CLASSES = DICTIONARY_TYPE__CONTAINED_CLASSES;

	/**
	 * The feature id for the '<em><b>APosteriori Semantic Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS = DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Contained Suppliers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__CONTAINED_SUPPLIERS = DICTIONARY_TYPE__CONTAINED_SUPPLIERS;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__CONTAINED_PROPERTIES = DICTIONARY_TYPE__CONTAINED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Contained Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__CONTAINED_DOCUMENTS = DICTIONARY_TYPE__CONTAINED_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Contained Datatypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__CONTAINED_DATATYPES = DICTIONARY_TYPE__CONTAINED_DATATYPES;

	/**
	 * The feature id for the '<em><b>Contained Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__CONTAINED_KEYWORDS = DICTIONARY_TYPE__CONTAINED_KEYWORDS;

	/**
	 * The feature id for the '<em><b>Contained Synonyms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE__CONTAINED_SYNONYMS = DICTIONARY_TYPE__CONTAINED_SYNONYMS;

	/**
	 * The number of structural features of the '<em>DICTIONARYINSTANDARDFORMAT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE_FEATURE_COUNT = DICTIONARY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DICTIONARYINSTANDARDFORMAT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYINSTANDARDFORMAT_TYPE_OPERATION_COUNT = DICTIONARY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYREFERENCETypeImpl <em>DICTIONARYREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDICTIONARYREFERENCEType()
	 * @generated
	 */
	int DICTIONARYREFERENCE_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Dictionary Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYREFERENCE_TYPE__DICTIONARY_REF = 0;

	/**
	 * The number of structural features of the '<em>DICTIONARYREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DICTIONARYREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARYREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITREFERENCETypeImpl <em>DICUNITREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDICUNITREFERENCEType()
	 * @generated
	 */
	int DICUNITREFERENCE_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Dic Unit Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNITREFERENCE_TYPE__DIC_UNIT_REF = 0;

	/**
	 * The number of structural features of the '<em>DICUNITREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNITREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DICUNITREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNITREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITSREFERENCETypeImpl <em>DICUNITSREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITSREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDICUNITSREFERENCEType()
	 * @generated
	 */
	int DICUNITSREFERENCE_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Dic Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNITSREFERENCE_TYPE__DIC_UNIT = 0;

	/**
	 * The number of structural features of the '<em>DICUNITSREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNITSREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DICUNITSREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNITSREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITTypeImpl <em>DICUNIT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDICUNITType()
	 * @generated
	 */
	int DICUNIT_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Structured Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNIT_TYPE__STRUCTURED_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>String Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNIT_TYPE__STRING_REPRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Unit Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNIT_TYPE__UNIT_REF = 2;

	/**
	 * The number of structural features of the '<em>DICUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNIT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DICUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICUNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICVALUETypeImpl <em>DICVALUE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICVALUETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDICVALUEType()
	 * @generated
	 */
	int DICVALUE_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__PREFERRED_NAME = 0;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__SYNONYMOUS_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__ICON = 3;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__SOURCE_DOC_OF_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__IS_DEPRECATED = 7;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__IS_DEPRECATED_INTERPRETATION = 8;

	/**
	 * The feature id for the '<em><b>Value Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__VALUE_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__DATE_OF_ORIGINAL_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__DATE_OF_CURRENT_VERSION = 11;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__DATE_OF_CURRENT_REVISION = 12;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__GUID = 13;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__GUID2 = 14;

	/**
	 * The feature id for the '<em><b>Value Meaning Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE__VALUE_MEANING_ID = 15;

	/**
	 * The number of structural features of the '<em>DICVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>DICVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICVALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DIMENSIONALEXPONENTSTypeImpl <em>DIMENSIONALEXPONENTS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DIMENSIONALEXPONENTSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDIMENSIONALEXPONENTSType()
	 * @generated
	 */
	int DIMENSIONALEXPONENTS_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Length Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONALEXPONENTS_TYPE__LENGTH_EXPONENT = 0;

	/**
	 * The feature id for the '<em><b>Mass Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONALEXPONENTS_TYPE__MASS_EXPONENT = 1;

	/**
	 * The feature id for the '<em><b>Time Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONALEXPONENTS_TYPE__TIME_EXPONENT = 2;

	/**
	 * The feature id for the '<em><b>Electric Current Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONALEXPONENTS_TYPE__ELECTRIC_CURRENT_EXPONENT = 3;

	/**
	 * The feature id for the '<em><b>Thermodynamic Temperature Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONALEXPONENTS_TYPE__THERMODYNAMIC_TEMPERATURE_EXPONENT = 4;

	/**
	 * The feature id for the '<em><b>Amount Of Substance Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONALEXPONENTS_TYPE__AMOUNT_OF_SUBSTANCE_EXPONENT = 5;

	/**
	 * The feature id for the '<em><b>Luminous Intensity Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONALEXPONENTS_TYPE__LUMINOUS_INTENSITY_EXPONENT = 6;

	/**
	 * The number of structural features of the '<em>DIMENSIONALEXPONENTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONALEXPONENTS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>DIMENSIONALEXPONENTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONALEXPONENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXTERNALRESOURCETypeImpl <em>EXTERNALRESOURCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXTERNALRESOURCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getEXTERNALRESOURCEType()
	 * @generated
	 */
	int EXTERNALRESOURCE_TYPE = 78;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALRESOURCE_TYPE__FILE = 0;

	/**
	 * The number of structural features of the '<em>EXTERNALRESOURCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALRESOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EXTERNALRESOURCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALRESOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTCONTENTTypeImpl <em>DOCUMENTCONTENT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTCONTENTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDOCUMENTCONTENTType()
	 * @generated
	 */
	int DOCUMENTCONTENT_TYPE = 64;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTCONTENT_TYPE__FILE = EXTERNALRESOURCE_TYPE__FILE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTCONTENT_TYPE__REVISION = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DOCUMENTCONTENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTCONTENT_TYPE_FEATURE_COUNT = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DOCUMENTCONTENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTCONTENT_TYPE_OPERATION_COUNT = EXTERNALRESOURCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTIDENTIFIERNAMELABELTypeImpl <em>DOCUMENTIDENTIFIERNAMELABEL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTIDENTIFIERNAMELABELTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDOCUMENTIDENTIFIERNAMELABELType()
	 * @generated
	 */
	int DOCUMENTIDENTIFIERNAMELABEL_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTIDENTIFIERNAMELABEL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTIDENTIFIERNAMELABEL_TYPE__COUNTRY_CODE = 1;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTIDENTIFIERNAMELABEL_TYPE__LANGUAGE_CODE = 2;

	/**
	 * The number of structural features of the '<em>DOCUMENTIDENTIFIERNAMELABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTIDENTIFIERNAMELABEL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DOCUMENTIDENTIFIERNAMELABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTIDENTIFIERNAMELABEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTIDENTIFIERTypeImpl <em>DOCUMENTIDENTIFIER Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTIDENTIFIERTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDOCUMENTIDENTIFIERType()
	 * @generated
	 */
	int DOCUMENTIDENTIFIER_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTIDENTIFIER_TYPE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>DOCUMENTIDENTIFIER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTIDENTIFIER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DOCUMENTIDENTIFIER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTIDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTREFERENCETypeImpl <em>DOCUMENTREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDOCUMENTREFERENCEType()
	 * @generated
	 */
	int DOCUMENTREFERENCE_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Document Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTREFERENCE_TYPE__DOCUMENT_REF = 0;

	/**
	 * The number of structural features of the '<em>DOCUMENTREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DOCUMENTREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 68;

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
	 * The feature id for the '<em><b>APosteriori Semantic Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APOSTERIORI_SEMANTIC_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATATYPE = 6;

	/**
	 * The feature id for the '<em><b>Dic Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIC_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Dic Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIC_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT = 9;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYWORD = 10;

	/**
	 * The feature id for the '<em><b>Ontoml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ONTOML = 11;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPLIER = 13;

	/**
	 * The feature id for the '<em><b>Synonym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYNONYM = 14;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTSREFERENCETypeImpl <em>DOCUMENTSREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTSREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDOCUMENTSREFERENCEType()
	 * @generated
	 */
	int DOCUMENTSREFERENCE_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTSREFERENCE_TYPE__DOCUMENT = 0;

	/**
	 * The number of structural features of the '<em>DOCUMENTSREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTSREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DOCUMENTSREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTSREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTTypeImpl <em>DOCUMENT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDOCUMENTType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__NAME_SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DATE_OF_ORIGINAL_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DATE_OF_CURRENT_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DATE_OF_CURRENT_REVISION = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__STATUS = 5;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__TRANSLATION = 6;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__SOURCE_LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__IS_DEPRECATED = 8;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__IS_DEPRECATED_INTERPRETATION = 9;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__PREFERRED_NAME = 10;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__SYNONYMOUS_NAMES = 11;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__SHORT_NAME = 12;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ICON = 13;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__NOTE = 15;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__REMARK = 16;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__AUTHORS = 17;

	/**
	 * The feature id for the '<em><b>Publishing Organisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__PUBLISHING_ORGANISATION = 18;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__CONTENT = 19;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__GUID = 20;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__GUID2 = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ID = 22;

	/**
	 * The number of structural features of the '<em>DOCUMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>DOCUMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOMAINCONSTRAINTSTypeImpl <em>DOMAINCONSTRAINTS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOMAINCONSTRAINTSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDOMAINCONSTRAINTSType()
	 * @generated
	 */
	int DOMAINCONSTRAINTS_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINCONSTRAINTS_TYPE__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>DOMAINCONSTRAINTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINCONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DOMAINCONSTRAINTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINCONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ENUMERATIONCONSTRAINTTypeImpl <em>ENUMERATIONCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ENUMERATIONCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getENUMERATIONCONSTRAINTType()
	 * @generated
	 */
	int ENUMERATIONCONSTRAINT_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATIONCONSTRAINT_TYPE__SUBSET = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ENUMERATIONCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATIONCONSTRAINT_TYPE_FEATURE_COUNT = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ENUMERATIONCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATIONCONSTRAINT_TYPE_OPERATION_COUNT = DOMAINCONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl <em>EXPLICITFUNCTIONALMODELCLASSEXTENSION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType()
	 * @generated
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Dictionary Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__DICTIONARY_DEFINITION = CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION;

	/**
	 * The feature id for the '<em><b>Content Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTENT_VERSION = CLASSEXTENSION_TYPE__CONTENT_VERSION;

	/**
	 * The feature id for the '<em><b>Content Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTENT_REVISION = CLASSEXTENSION_TYPE__CONTENT_REVISION;

	/**
	 * The feature id for the '<em><b>Recommended Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION = CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CLASSIFICATION = CLASSEXTENSION_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Instance Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION = CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__POPULATION = CLASSEXTENSION_TYPE__POPULATION;

	/**
	 * The feature id for the '<em><b>Table Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__TABLE_LIKE = CLASSEXTENSION_TYPE__TABLE_LIKE;

	/**
	 * The feature id for the '<em><b>Required Item Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES = CLASSEXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available Views Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON = CLASSEXTENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available Views Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG = CLASSEXTENSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context Param Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON = CLASSEXTENSION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Context Param Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG = CLASSEXTENSION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EXPLICITFUNCTIONALMODELCLASSEXTENSION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE_FEATURE_COUNT = CLASSEXTENSION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>EXPLICITFUNCTIONALMODELCLASSEXTENSION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE_OPERATION_COUNT = CLASSEXTENSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITITEMCLASSEXTENSIONTypeImpl <em>EXPLICITITEMCLASSEXTENSION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITITEMCLASSEXTENSIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getEXPLICITITEMCLASSEXTENSIONType()
	 * @generated
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Dictionary Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__DICTIONARY_DEFINITION = CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION;

	/**
	 * The feature id for the '<em><b>Content Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_VERSION = CLASSEXTENSION_TYPE__CONTENT_VERSION;

	/**
	 * The feature id for the '<em><b>Content Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_REVISION = CLASSEXTENSION_TYPE__CONTENT_REVISION;

	/**
	 * The feature id for the '<em><b>Recommended Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION = CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__CLASSIFICATION = CLASSEXTENSION_TYPE__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Instance Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION = CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__POPULATION = CLASSEXTENSION_TYPE__POPULATION;

	/**
	 * The feature id for the '<em><b>Table Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__TABLE_LIKE = CLASSEXTENSION_TYPE__TABLE_LIKE;

	/**
	 * The feature id for the '<em><b>Access Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON = CLASSEXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG = CLASSEXTENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Create Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON = CLASSEXTENSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Create Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG = CLASSEXTENSION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Class Presentation On Paper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER = CLASSEXTENSION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class Presentation On Screen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN = CLASSEXTENSION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EXPLICITITEMCLASSEXTENSION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE_FEATURE_COUNT = CLASSEXTENSION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>EXPLICITITEMCLASSEXTENSION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICITITEMCLASSEXTENSION_TYPE_OPERATION_COUNT = CLASSEXTENSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXTERNALFILESTypeImpl <em>EXTERNALFILES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXTERNALFILESTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getEXTERNALFILESType()
	 * @generated
	 */
	int EXTERNALFILES_TYPE = 76;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALFILES_TYPE__FILE = EXTERNALRESOURCE_TYPE__FILE;

	/**
	 * The number of structural features of the '<em>EXTERNALFILES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALFILES_TYPE_FEATURE_COUNT = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EXTERNALFILES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALFILES_TYPE_OPERATION_COUNT = EXTERNALRESOURCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GRAPHICSTypeImpl <em>GRAPHICS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GRAPHICSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getGRAPHICSType()
	 * @generated
	 */
	int GRAPHICS_TYPE = 89;

	/**
	 * The number of structural features of the '<em>GRAPHICS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>GRAPHICS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXTERNALGRAPHICSTypeImpl <em>EXTERNALGRAPHICS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXTERNALGRAPHICSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getEXTERNALGRAPHICSType()
	 * @generated
	 */
	int EXTERNALGRAPHICS_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALGRAPHICS_TYPE__REPRESENTATION = GRAPHICS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EXTERNALGRAPHICS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALGRAPHICS_TYPE_FEATURE_COUNT = GRAPHICS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EXTERNALGRAPHICS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALGRAPHICS_TYPE_OPERATION_COUNT = GRAPHICS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FILTERTypeImpl <em>FILTER Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FILTERTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getFILTERType()
	 * @generated
	 */
	int FILTER_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Referenced Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__REFERENCED_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>FILTER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>FILTER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl <em>FMCLASSVIEWOF Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getFMCLASSVIEWOFType()
	 * @generated
	 */
	int FMCLASSVIEWOF_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__DATE_OF_ORIGINAL_DEFINITION = CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__DATE_OF_CURRENT_VERSION = CLASS_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__DATE_OF_CURRENT_REVISION = CLASS_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__REVISION = CLASS_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__STATUS = CLASS_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__TRANSLATION = CLASS_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__SOURCE_LANGUAGE = CLASS_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IS_DEPRECATED = CLASS_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IS_DEPRECATED_INTERPRETATION = CLASS_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__PREFERRED_NAME = CLASS_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__SYNONYMOUS_NAMES = CLASS_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__SHORT_NAME = CLASS_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__ICON = CLASS_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__DEFINITION = CLASS_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__SOURCE_DOC_OF_DEFINITION = CLASS_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__NOTE = CLASS_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__REMARK = CLASS_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Its Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__ITS_SUPERCLASS = CLASS_TYPE__ITS_SUPERCLASS;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__DESCRIBED_BY = CLASS_TYPE__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__DEFINED_TYPES = CLASS_TYPE__DEFINED_TYPES;

	/**
	 * The feature id for the '<em><b>Defined Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__DEFINED_DOCUMENTS = CLASS_TYPE__DEFINED_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__CONSTRAINTS = CLASS_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__HIERARCHICAL_POSITION = CLASS_TYPE__HIERARCHICAL_POSITION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__KEYWORDS = CLASS_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Sub Class Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__SUB_CLASS_PROPERTIES = CLASS_TYPE__SUB_CLASS_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Class Constant Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__CLASS_CONSTANT_VALUES = CLASS_TYPE__CLASS_CONSTANT_VALUES;

	/**
	 * The feature id for the '<em><b>Geometric Representation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT = CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Global Unit Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__GLOBAL_UNIT_CONTEXT = CLASS_TYPE__GLOBAL_UNIT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Keyword References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__KEYWORD_REFERENCES = CLASS_TYPE__KEYWORD_REFERENCES;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__FREE_RELATIONS = CLASS_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__GUID = CLASS_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__GUID2 = CLASS_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__ID = CLASS_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Created View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__CREATED_VIEW = CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VCV Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__VCV_RANGE = CLASS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported Properties From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW = CLASS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imported Types From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW = CLASS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imported Documents From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW = CLASS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Imported Constraints From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW = CLASS_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Case Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__CASE_OF = CLASS_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Imported Properties From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS = CLASS_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Imported Types From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS = CLASS_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Imported Documents From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS = CLASS_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Imported Constraints From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS = CLASS_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>View Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__VIEW_OF = CLASS_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Imported Properties From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM = CLASS_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Imported Types From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM = CLASS_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Imported Documents From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM = CLASS_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Imported Constraints From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM = CLASS_TYPE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>FMCLASSVIEWOF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE_FEATURE_COUNT = CLASS_TYPE_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>FMCLASSVIEWOF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMCLASSVIEWOF_TYPE_OPERATION_COUNT = CLASS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FREERELATIONDEFINITIONREFTypeImpl <em>FREERELATIONDEFINITIONREF Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FREERELATIONDEFINITIONREFTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getFREERELATIONDEFINITIONREFType()
	 * @generated
	 */
	int FREERELATIONDEFINITIONREF_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Defintion Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATIONDEFINITIONREF_TYPE__DEFINTION_REF = 0;

	/**
	 * The number of structural features of the '<em>FREERELATIONDEFINITIONREF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATIONDEFINITIONREF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FREERELATIONDEFINITIONREF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATIONDEFINITIONREF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FREERELATIONENDREFTypeImpl <em>FREERELATIONENDREF Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FREERELATIONENDREFTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getFREERELATIONENDREFType()
	 * @generated
	 */
	int FREERELATIONENDREF_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATIONENDREF_TYPE__ELEMENT_REF = 0;

	/**
	 * The number of structural features of the '<em>FREERELATIONENDREF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATIONENDREF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FREERELATIONENDREF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATIONENDREF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FREERELATIONSTypeImpl <em>FREERELATIONS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FREERELATIONSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getFREERELATIONSType()
	 * @generated
	 */
	int FREERELATIONS_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATIONS_TYPE__RELATION = 0;

	/**
	 * The number of structural features of the '<em>FREERELATIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FREERELATIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FREERELATIONTypeImpl <em>FREERELATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FREERELATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getFREERELATIONType()
	 * @generated
	 */
	int FREERELATION_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATION_TYPE__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATION_TYPE__END = 1;

	/**
	 * The number of structural features of the '<em>FREERELATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>FREERELATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREERELATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl <em>FUNCTIONALMODELCLASS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	int FUNCTIONALMODELCLASS_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION = CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__DATE_OF_CURRENT_VERSION = CLASS_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__DATE_OF_CURRENT_REVISION = CLASS_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__REVISION = CLASS_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__STATUS = CLASS_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__TRANSLATION = CLASS_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__SOURCE_LANGUAGE = CLASS_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IS_DEPRECATED = CLASS_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IS_DEPRECATED_INTERPRETATION = CLASS_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__PREFERRED_NAME = CLASS_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__SYNONYMOUS_NAMES = CLASS_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__SHORT_NAME = CLASS_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__ICON = CLASS_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__DEFINITION = CLASS_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__SOURCE_DOC_OF_DEFINITION = CLASS_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__NOTE = CLASS_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__REMARK = CLASS_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Its Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__ITS_SUPERCLASS = CLASS_TYPE__ITS_SUPERCLASS;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__DESCRIBED_BY = CLASS_TYPE__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__DEFINED_TYPES = CLASS_TYPE__DEFINED_TYPES;

	/**
	 * The feature id for the '<em><b>Defined Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__DEFINED_DOCUMENTS = CLASS_TYPE__DEFINED_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__CONSTRAINTS = CLASS_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__HIERARCHICAL_POSITION = CLASS_TYPE__HIERARCHICAL_POSITION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__KEYWORDS = CLASS_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Sub Class Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__SUB_CLASS_PROPERTIES = CLASS_TYPE__SUB_CLASS_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Class Constant Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__CLASS_CONSTANT_VALUES = CLASS_TYPE__CLASS_CONSTANT_VALUES;

	/**
	 * The feature id for the '<em><b>Geometric Representation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT = CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Global Unit Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__GLOBAL_UNIT_CONTEXT = CLASS_TYPE__GLOBAL_UNIT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Keyword References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__KEYWORD_REFERENCES = CLASS_TYPE__KEYWORD_REFERENCES;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__FREE_RELATIONS = CLASS_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__GUID = CLASS_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__GUID2 = CLASS_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__ID = CLASS_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Created View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW = CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VCV Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__VCV_RANGE = CLASS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported Properties From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW = CLASS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imported Types From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW = CLASS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imported Documents From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW = CLASS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Imported Cosntraints From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW = CLASS_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Case Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__CASE_OF = CLASS_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Imported Properties From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS = CLASS_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Imported Types From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS = CLASS_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Imported Documents From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS = CLASS_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Imported Constraints From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS = CLASS_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>FUNCTIONALMODELCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE_FEATURE_COUNT = CLASS_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>FUNCTIONALMODELCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALMODELCLASS_TYPE_OPERATION_COUNT = CLASS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GENERALTEXTTypeImpl <em>GENERALTEXT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GENERALTEXTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getGENERALTEXTType()
	 * @generated
	 */
	int GENERALTEXT_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALTEXT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALTEXT_TYPE__COUNTRY_CODE = 1;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALTEXT_TYPE__LANGUAGE_CODE = 2;

	/**
	 * The number of structural features of the '<em>GENERALTEXT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALTEXT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GENERALTEXT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALTEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICCONTEXTTypeImpl <em>GEOMETRICCONTEXT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICCONTEXTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getGEOMETRICCONTEXTType()
	 * @generated
	 */
	int GEOMETRICCONTEXT_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICCONTEXT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Coordinate Soace Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICCONTEXT_TYPE__COORDINATE_SOACE_DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>GEOMETRICCONTEXT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICCONTEXT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GEOMETRICCONTEXT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICCONTEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICUNITCONTEXTTypeImpl <em>GEOMETRICUNITCONTEXT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICUNITCONTEXTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getGEOMETRICUNITCONTEXTType()
	 * @generated
	 */
	int GEOMETRICUNITCONTEXT_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Length Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Length Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID = 1;

	/**
	 * The feature id for the '<em><b>Langle Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Angle Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID = 3;

	/**
	 * The number of structural features of the '<em>GEOMETRICUNITCONTEXT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICUNITCONTEXT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GEOMETRICUNITCONTEXT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRICUNITCONTEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl <em>HEADER Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getHEADERType()
	 * @generated
	 */
	int HEADER_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Global Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__GLOBAL_LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Date Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__DATE_TIME_STAMP = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ORGANISATION = 6;

	/**
	 * The feature id for the '<em><b>Pre Processor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__PRE_PROCESSOR_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Originating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ORIGINATING_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Authorisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__AUTHORISATION = 9;

	/**
	 * The feature id for the '<em><b>Ontoml Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ONTOML_INFORMATION = 10;

	/**
	 * The feature id for the '<em><b>Ontoml Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ONTOML_STRUCTURE = 11;

	/**
	 * The feature id for the '<em><b>Supported Vep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__SUPPORTED_VEP = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ID = 13;

	/**
	 * The number of structural features of the '<em>HEADER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>HEADER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HTTPFILETypeImpl <em>HTTPFILE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HTTPFILETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getHTTPFILEType()
	 * @generated
	 */
	int HTTPFILE_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Http File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPFILE_TYPE__HTTP_FILE = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPFILE_TYPE__FILE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Dir Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPFILE_TYPE__DIR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPFILE_TYPE__COUNTRY_CODE = 3;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPFILE_TYPE__LANGUAGE_CODE = 4;

	/**
	 * The number of structural features of the '<em>HTTPFILE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPFILE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>HTTPFILE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPFILE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SOURCEDOCUMENTTypeImpl <em>SOURCEDOCUMENT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SOURCEDOCUMENTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSOURCEDOCUMENTType()
	 * @generated
	 */
	int SOURCEDOCUMENT_TYPE = 162;

	/**
	 * The number of structural features of the '<em>SOURCEDOCUMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCEDOCUMENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>SOURCEDOCUMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCEDOCUMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.IDENTIFIEDDOCUMENTTypeImpl <em>IDENTIFIEDDOCUMENT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.IDENTIFIEDDOCUMENTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getIDENTIFIEDDOCUMENTType()
	 * @generated
	 */
	int IDENTIFIEDDOCUMENT_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Document Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER = SOURCEDOCUMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDENTIFIEDDOCUMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIEDDOCUMENT_TYPE_FEATURE_COUNT = SOURCEDOCUMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IDENTIFIEDDOCUMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIEDDOCUMENT_TYPE_OPERATION_COUNT = SOURCEDOCUMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ILLUSTRATIONTypeImpl <em>ILLUSTRATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ILLUSTRATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getILLUSTRATIONType()
	 * @generated
	 */
	int ILLUSTRATION_TYPE = 93;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLUSTRATION_TYPE__FILE = EXTERNALRESOURCE_TYPE__FILE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLUSTRATION_TYPE__CODE = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind Of Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLUSTRATION_TYPE__KIND_OF_CONTENT = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLUSTRATION_TYPE__WIDTH = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLUSTRATION_TYPE__HEIGHT = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Standard Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLUSTRATION_TYPE__STANDARD_SIZE = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ILLUSTRATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLUSTRATION_TYPE_FEATURE_COUNT = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>ILLUSTRATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLUSTRATION_TYPE_OPERATION_COUNT = EXTERNALRESOURCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INFORMATIONTypeImpl <em>INFORMATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INFORMATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getINFORMATIONType()
	 * @generated
	 */
	int INFORMATION_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__REVISION = 0;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__PREFERRED_NAME = 1;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__SYNONYMOUS_NAMES = 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__SHORT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__ICON = 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__NOTE = 5;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__REMARK = 6;

	/**
	 * The number of structural features of the '<em>INFORMATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>INFORMATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTCURRENCYTYPETypeImpl <em>INTCURRENCYTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTCURRENCYTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getINTCURRENCYTYPEType()
	 * @generated
	 */
	int INTCURRENCYTYPE_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTCURRENCYTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTCURRENCYTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTCURRENCYTYPE_TYPE__CURRENCY = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Currency Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTCURRENCYTYPE_TYPE__CURRENCY_ID = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>INTCURRENCYTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTCURRENCYTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>INTCURRENCYTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTCURRENCYTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTDICVALUETypeImpl <em>INTDICVALUE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTDICVALUETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getINTDICVALUEType()
	 * @generated
	 */
	int INTDICVALUE_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__PREFERRED_NAME = DICVALUE_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__SYNONYMOUS_NAMES = DICVALUE_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__SHORT_NAME = DICVALUE_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__ICON = DICVALUE_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__SOURCE_DOC_OF_DEFINITION = DICVALUE_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__DEFINITION = DICVALUE_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__STATUS = DICVALUE_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__IS_DEPRECATED = DICVALUE_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__IS_DEPRECATED_INTERPRETATION = DICVALUE_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Value Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__VALUE_SPECIFICATION = DICVALUE_TYPE__VALUE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__DATE_OF_ORIGINAL_DEFINITION = DICVALUE_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__DATE_OF_CURRENT_VERSION = DICVALUE_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__DATE_OF_CURRENT_REVISION = DICVALUE_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__GUID = DICVALUE_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__GUID2 = DICVALUE_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Value Meaning Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__VALUE_MEANING_ID = DICVALUE_TYPE__VALUE_MEANING_ID;

	/**
	 * The feature id for the '<em><b>Value Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE__VALUE_CODE = DICVALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>INTDICVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE_FEATURE_COUNT = DICVALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>INTDICVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTDICVALUE_TYPE_OPERATION_COUNT = DICVALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTEGRITYCONSTRAINTTypeImpl <em>INTEGRITYCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTEGRITYCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getINTEGRITYCONSTRAINTType()
	 * @generated
	 */
	int INTEGRITYCONSTRAINT_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Constraint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITYCONSTRAINT_TYPE__CONSTRAINT_ID = PROPERTYCONSTRAINT_TYPE__CONSTRAINT_ID;

	/**
	 * The feature id for the '<em><b>Constrained Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY = PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Redefined Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN = PROPERTYCONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>INTEGRITYCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITYCONSTRAINT_TYPE_FEATURE_COUNT = PROPERTYCONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>INTEGRITYCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITYCONSTRAINT_TYPE_OPERATION_COUNT = PROPERTYCONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTMEASURETYPETypeImpl <em>INTMEASURETYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTMEASURETYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getINTMEASURETYPEType()
	 * @generated
	 */
	int INTMEASURETYPE_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTMEASURETYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTMEASURETYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTMEASURETYPE_TYPE__UNIT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alternative Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTMEASURETYPE_TYPE__ALTERNATIVE_UNITS = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTMEASURETYPE_TYPE__UNIT_ID = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alternative Unit Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS = ANYTYPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>INTMEASURETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTMEASURETYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>INTMEASURETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTMEASURETYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTTYPETypeImpl <em>INTTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getINTTYPEType()
	 * @generated
	 */
	int INTTYPE_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>INTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>INTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl <em>ITEMCLASSCASEOF Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getITEMCLASSCASEOFType()
	 * @generated
	 */
	int ITEMCLASSCASEOF_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__DATE_OF_ORIGINAL_DEFINITION = CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__DATE_OF_CURRENT_VERSION = CLASS_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__DATE_OF_CURRENT_REVISION = CLASS_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__REVISION = CLASS_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__STATUS = CLASS_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__TRANSLATION = CLASS_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__SOURCE_LANGUAGE = CLASS_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__IS_DEPRECATED = CLASS_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__IS_DEPRECATED_INTERPRETATION = CLASS_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__PREFERRED_NAME = CLASS_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__SYNONYMOUS_NAMES = CLASS_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__SHORT_NAME = CLASS_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__ICON = CLASS_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__DEFINITION = CLASS_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__SOURCE_DOC_OF_DEFINITION = CLASS_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__NOTE = CLASS_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__REMARK = CLASS_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Its Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__ITS_SUPERCLASS = CLASS_TYPE__ITS_SUPERCLASS;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__DESCRIBED_BY = CLASS_TYPE__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__DEFINED_TYPES = CLASS_TYPE__DEFINED_TYPES;

	/**
	 * The feature id for the '<em><b>Defined Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__DEFINED_DOCUMENTS = CLASS_TYPE__DEFINED_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__CONSTRAINTS = CLASS_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__HIERARCHICAL_POSITION = CLASS_TYPE__HIERARCHICAL_POSITION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__KEYWORDS = CLASS_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Sub Class Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__SUB_CLASS_PROPERTIES = CLASS_TYPE__SUB_CLASS_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Class Constant Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__CLASS_CONSTANT_VALUES = CLASS_TYPE__CLASS_CONSTANT_VALUES;

	/**
	 * The feature id for the '<em><b>Geometric Representation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT = CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Global Unit Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__GLOBAL_UNIT_CONTEXT = CLASS_TYPE__GLOBAL_UNIT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Keyword References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__KEYWORD_REFERENCES = CLASS_TYPE__KEYWORD_REFERENCES;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__FREE_RELATIONS = CLASS_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__GUID = CLASS_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__GUID2 = CLASS_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__ID = CLASS_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Simplified Drawing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING = CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coded Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__CODED_NAME = CLASS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Sharable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__INSTANCE_SHARABLE = CLASS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Case Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__IS_CASE_OF = CLASS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imported Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES = CLASS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Imported Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES = CLASS_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imported Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS = CLASS_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Imported Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS = CLASS_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ITEMCLASSCASEOF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE_FEATURE_COUNT = CLASS_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ITEMCLASSCASEOF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASSCASEOF_TYPE_OPERATION_COUNT = CLASS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSTypeImpl <em>ITEMCLASS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getITEMCLASSType()
	 * @generated
	 */
	int ITEMCLASS_TYPE = 101;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION = CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__DATE_OF_CURRENT_VERSION = CLASS_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__DATE_OF_CURRENT_REVISION = CLASS_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__REVISION = CLASS_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__STATUS = CLASS_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__TRANSLATION = CLASS_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__SOURCE_LANGUAGE = CLASS_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__IS_DEPRECATED = CLASS_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__IS_DEPRECATED_INTERPRETATION = CLASS_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__PREFERRED_NAME = CLASS_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__SYNONYMOUS_NAMES = CLASS_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__SHORT_NAME = CLASS_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__ICON = CLASS_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__DEFINITION = CLASS_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__SOURCE_DOC_OF_DEFINITION = CLASS_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__NOTE = CLASS_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__REMARK = CLASS_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Its Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__ITS_SUPERCLASS = CLASS_TYPE__ITS_SUPERCLASS;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__DESCRIBED_BY = CLASS_TYPE__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__DEFINED_TYPES = CLASS_TYPE__DEFINED_TYPES;

	/**
	 * The feature id for the '<em><b>Defined Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__DEFINED_DOCUMENTS = CLASS_TYPE__DEFINED_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__CONSTRAINTS = CLASS_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__HIERARCHICAL_POSITION = CLASS_TYPE__HIERARCHICAL_POSITION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__KEYWORDS = CLASS_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Sub Class Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__SUB_CLASS_PROPERTIES = CLASS_TYPE__SUB_CLASS_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Class Constant Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__CLASS_CONSTANT_VALUES = CLASS_TYPE__CLASS_CONSTANT_VALUES;

	/**
	 * The feature id for the '<em><b>Geometric Representation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT = CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Global Unit Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__GLOBAL_UNIT_CONTEXT = CLASS_TYPE__GLOBAL_UNIT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Keyword References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__KEYWORD_REFERENCES = CLASS_TYPE__KEYWORD_REFERENCES;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__FREE_RELATIONS = CLASS_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__GUID = CLASS_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__GUID2 = CLASS_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__ID = CLASS_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Simplified Drawing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__SIMPLIFIED_DRAWING = CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coded Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__CODED_NAME = CLASS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Sharable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE__INSTANCE_SHARABLE = CLASS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ITEMCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE_FEATURE_COUNT = CLASS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ITEMCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMCLASS_TYPE_OPERATION_COUNT = CLASS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITSVALUESTypeImpl <em>ITSVALUES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITSVALUESTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getITSVALUESType()
	 * @generated
	 */
	int ITSVALUES_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Dic Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITSVALUES_TYPE__DIC_VALUE = 0;

	/**
	 * The number of structural features of the '<em>ITSVALUES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITSVALUES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ITSVALUES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITSVALUES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.KEYWORDLABELTypeImpl <em>KEYWORDLABEL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.KEYWORDLABELTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getKEYWORDLABELType()
	 * @generated
	 */
	int KEYWORDLABEL_TYPE = 103;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDLABEL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDLABEL_TYPE__COUNTRY_CODE = 1;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDLABEL_TYPE__LANGUAGE_CODE = 2;

	/**
	 * The number of structural features of the '<em>KEYWORDLABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDLABEL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>KEYWORDLABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDLABEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.KEYWORDREFERENCESTypeImpl <em>KEYWORDREFERENCES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.KEYWORDREFERENCESTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getKEYWORDREFERENCESType()
	 * @generated
	 */
	int KEYWORDREFERENCES_TYPE = 104;

	/**
	 * The feature id for the '<em><b>Keyword Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDREFERENCES_TYPE__KEYWORD_REF = 0;

	/**
	 * The number of structural features of the '<em>KEYWORDREFERENCES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDREFERENCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>KEYWORDREFERENCES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDREFERENCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.KEYWORDTypeImpl <em>KEYWORD Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.KEYWORDTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getKEYWORDType()
	 * @generated
	 */
	int KEYWORD_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_TYPE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>KEYWORD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>KEYWORD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LANGUAGETypeImpl <em>LANGUAGE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LANGUAGETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getLANGUAGEType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TYPE__COUNTRY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TYPE__LANGUAGE_CODE = 1;

	/**
	 * The number of structural features of the '<em>LANGUAGE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LANGUAGE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTypeImpl <em>LEVEL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getLEVELType()
	 * @generated
	 */
	int LEVEL_TYPE = 107;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__TYP = 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE__MAX = 3;

	/**
	 * The number of structural features of the '<em>LEVEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>LEVEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTYPETypeImpl <em>LEVELTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getLEVELTYPEType()
	 * @generated
	 */
	int LEVELTYPE_TYPE = 108;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELTYPE_TYPE__LEVELS = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELTYPE_TYPE__VALUE_TYPE = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LEVELTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>LEVELTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVELTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYIIMIDENTIFICATIONTypeImpl <em>LIBRARYIIMIDENTIFICATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYIIMIDENTIFICATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getLIBRARYIIMIDENTIFICATIONType()
	 * @generated
	 */
	int LIBRARYIIMIDENTIFICATION_TYPE = 109;

	/**
	 * The feature id for the '<em><b>Source Document Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYIIMIDENTIFICATION_TYPE__SOURCE_DOCUMENT_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYIIMIDENTIFICATION_TYPE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYIIMIDENTIFICATION_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYIIMIDENTIFICATION_TYPE__DATE = 3;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYIIMIDENTIFICATION_TYPE__APPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYIIMIDENTIFICATION_TYPE__LEVEL = 5;

	/**
	 * The number of structural features of the '<em>LIBRARYIIMIDENTIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYIIMIDENTIFICATION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>LIBRARYIIMIDENTIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYIIMIDENTIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYTypeImpl <em>LIBRARY Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getLIBRARYType()
	 * @generated
	 */
	int LIBRARY_TYPE = 111;

	/**
	 * The feature id for the '<em><b>Contained Class Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE__CONTAINED_CLASS_EXTENSIONS = 0;

	/**
	 * The feature id for the '<em><b>Responsible Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE__RESPONSIBLE_SUPPLIER = 1;

	/**
	 * The number of structural features of the '<em>LIBRARY Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LIBRARY Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYINSTANDARDFORMATTypeImpl <em>LIBRARYINSTANDARDFORMAT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYINSTANDARDFORMATTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getLIBRARYINSTANDARDFORMATType()
	 * @generated
	 */
	int LIBRARYINSTANDARDFORMAT_TYPE = 110;

	/**
	 * The feature id for the '<em><b>Contained Class Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYINSTANDARDFORMAT_TYPE__CONTAINED_CLASS_EXTENSIONS = LIBRARY_TYPE__CONTAINED_CLASS_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Responsible Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYINSTANDARDFORMAT_TYPE__RESPONSIBLE_SUPPLIER = LIBRARY_TYPE__RESPONSIBLE_SUPPLIER;

	/**
	 * The number of structural features of the '<em>LIBRARYINSTANDARDFORMAT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYINSTANDARDFORMAT_TYPE_FEATURE_COUNT = LIBRARY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LIBRARYINSTANDARDFORMAT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARYINSTANDARDFORMAT_TYPE_OPERATION_COUNT = LIBRARY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LISTTYPETypeImpl <em>LISTTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LISTTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getLISTTYPEType()
	 * @generated
	 */
	int LISTTYPE_TYPE = 112;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTTYPE_TYPE__BOUND1 = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTTYPE_TYPE__BOUND2 = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTTYPE_TYPE__VALUE_TYPE = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTTYPE_TYPE__UNIQUENESS = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LISTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>LISTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.MAPPINGFUNCTIONTypeImpl <em>MAPPINGFUNCTION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.MAPPINGFUNCTIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getMAPPINGFUNCTIONType()
	 * @generated
	 */
	int MAPPINGFUNCTION_TYPE = 113;

	/**
	 * The number of structural features of the '<em>MAPPINGFUNCTION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPINGFUNCTION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>MAPPINGFUNCTION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPINGFUNCTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.MATHEMATICALSTRINGTypeImpl <em>MATHEMATICALSTRING Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.MATHEMATICALSTRINGTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getMATHEMATICALSTRINGType()
	 * @generated
	 */
	int MATHEMATICALSTRING_TYPE = 114;

	/**
	 * The feature id for the '<em><b>Text Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATHEMATICALSTRING_TYPE__TEXT_REPRESENTATION = 0;

	/**
	 * The number of structural features of the '<em>MATHEMATICALSTRING Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATHEMATICALSTRING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>MATHEMATICALSTRING Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATHEMATICALSTRING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.MESSAGETypeImpl <em>MESSAGE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.MESSAGETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getMESSAGEType()
	 * @generated
	 */
	int MESSAGE_TYPE = 115;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__FILE = EXTERNALRESOURCE_TYPE__FILE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__CODE = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MESSAGE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = EXTERNALRESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MESSAGE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_OPERATION_COUNT = EXTERNALRESOURCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NAMEDTYPETypeImpl <em>NAMEDTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NAMEDTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getNAMEDTYPEType()
	 * @generated
	 */
	int NAMEDTYPE_TYPE = 116;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Referred Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDTYPE_TYPE__REFERRED_TYPE = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NAMEDTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NAMEDTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONDEPENDENTPDETTypeImpl <em>NONDEPENDENTPDET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONDEPENDENTPDETTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getNONDEPENDENTPDETType()
	 * @generated
	 */
	int NONDEPENDENTPDET_TYPE = 118;

	/**
	 * The feature id for the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__NAME_SCOPE = PROPERTY_TYPE__NAME_SCOPE;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__DATE_OF_ORIGINAL_DEFINITION = PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__DATE_OF_CURRENT_VERSION = PROPERTY_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__DATE_OF_CURRENT_REVISION = PROPERTY_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__REVISION = PROPERTY_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__STATUS = PROPERTY_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__TRANSLATION = PROPERTY_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__SOURCE_LANGUAGE = PROPERTY_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__IS_DEPRECATED = PROPERTY_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__IS_DEPRECATED_INTERPRETATION = PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__PREFERRED_NAME = PROPERTY_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__SYNONYMOUS_NAMES = PROPERTY_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__SHORT_NAME = PROPERTY_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__ICON = PROPERTY_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__DEFINITION = PROPERTY_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__SOURCE_DOC_OF_DEFINITION = PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__NOTE = PROPERTY_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__REMARK = PROPERTY_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Preferred Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__PREFERRED_SYMBOL = PROPERTY_TYPE__PREFERRED_SYMBOL;

	/**
	 * The feature id for the '<em><b>Synonymous Symbols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__SYNONYMOUS_SYMBOLS = PROPERTY_TYPE__SYNONYMOUS_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__FIGURE = PROPERTY_TYPE__FIGURE;

	/**
	 * The feature id for the '<em><b>Det Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__DET_CLASSIFICATION = PROPERTY_TYPE__DET_CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__DOMAIN = PROPERTY_TYPE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__FORMULA = PROPERTY_TYPE__FORMULA;

	/**
	 * The feature id for the '<em><b>Synonym References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__SYNONYM_REFERENCES = PROPERTY_TYPE__SYNONYM_REFERENCES;

	/**
	 * The feature id for the '<em><b>Suggested Value List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__SUGGESTED_VALUE_LIST = PROPERTY_TYPE__SUGGESTED_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__FREE_RELATIONS = PROPERTY_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__GUID = PROPERTY_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__GUID2 = PROPERTY_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE__ID = PROPERTY_TYPE__ID;

	/**
	 * The number of structural features of the '<em>NONDEPENDENTPDET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE_FEATURE_COUNT = PROPERTY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NONDEPENDENTPDET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONDEPENDENTPDET_TYPE_OPERATION_COUNT = PROPERTY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONINSTANTIABLEFUNCTIONALVIEWCLASSTypeImpl <em>NONINSTANTIABLEFUNCTIONALVIEWCLASS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONINSTANTIABLEFUNCTIONALVIEWCLASSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getNONINSTANTIABLEFUNCTIONALVIEWCLASSType()
	 * @generated
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE = 119;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION = CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__DATE_OF_CURRENT_VERSION = CLASS_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__DATE_OF_CURRENT_REVISION = CLASS_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__REVISION = CLASS_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__STATUS = CLASS_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__TRANSLATION = CLASS_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__SOURCE_LANGUAGE = CLASS_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__IS_DEPRECATED = CLASS_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__IS_DEPRECATED_INTERPRETATION = CLASS_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__PREFERRED_NAME = CLASS_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__SYNONYMOUS_NAMES = CLASS_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__SHORT_NAME = CLASS_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__ICON = CLASS_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__DEFINITION = CLASS_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__SOURCE_DOC_OF_DEFINITION = CLASS_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__NOTE = CLASS_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__REMARK = CLASS_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Its Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__ITS_SUPERCLASS = CLASS_TYPE__ITS_SUPERCLASS;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__DESCRIBED_BY = CLASS_TYPE__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__DEFINED_TYPES = CLASS_TYPE__DEFINED_TYPES;

	/**
	 * The feature id for the '<em><b>Defined Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__DEFINED_DOCUMENTS = CLASS_TYPE__DEFINED_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__CONSTRAINTS = CLASS_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__HIERARCHICAL_POSITION = CLASS_TYPE__HIERARCHICAL_POSITION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__KEYWORDS = CLASS_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Sub Class Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__SUB_CLASS_PROPERTIES = CLASS_TYPE__SUB_CLASS_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Class Constant Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__CLASS_CONSTANT_VALUES = CLASS_TYPE__CLASS_CONSTANT_VALUES;

	/**
	 * The feature id for the '<em><b>Geometric Representation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT = CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Global Unit Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__GLOBAL_UNIT_CONTEXT = CLASS_TYPE__GLOBAL_UNIT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Keyword References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__KEYWORD_REFERENCES = CLASS_TYPE__KEYWORD_REFERENCES;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__FREE_RELATIONS = CLASS_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__GUID = CLASS_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__GUID2 = CLASS_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__ID = CLASS_TYPE__ID;

	/**
	 * The feature id for the '<em><b>View Control Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES = CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NONINSTANTIABLEFUNCTIONALVIEWCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE_FEATURE_COUNT = CLASS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NONINSTANTIABLEFUNCTIONALVIEWCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE_OPERATION_COUNT = CLASS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONQUANTITATIVECODETYPETypeImpl <em>NONQUANTITATIVECODETYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONQUANTITATIVECODETYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getNONQUANTITATIVECODETYPEType()
	 * @generated
	 */
	int NONQUANTITATIVECODETYPE_TYPE = 120;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVECODETYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVECODETYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVECODETYPE_TYPE__ITS_VALUES = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Doc Of Value Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVECODETYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVECODETYPE_TYPE__DEFINITION = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVECODETYPE_TYPE__ICON = ANYTYPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>NONQUANTITATIVECODETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVECODETYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>NONQUANTITATIVECODETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVECODETYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONQUANTITATIVEINTTYPETypeImpl <em>NONQUANTITATIVEINTTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONQUANTITATIVEINTTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getNONQUANTITATIVEINTTYPEType()
	 * @generated
	 */
	int NONQUANTITATIVEINTTYPE_TYPE = 121;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVEINTTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVEINTTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Doc Of Value Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVEINTTYPE_TYPE__DEFINITION = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVEINTTYPE_TYPE__ICON = ANYTYPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>NONQUANTITATIVEINTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVEINTTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>NONQUANTITATIVEINTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONQUANTITATIVEINTTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONSIUNITTypeImpl <em>NONSIUNIT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONSIUNITTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getNONSIUNITType()
	 * @generated
	 */
	int NONSIUNIT_TYPE = 122;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONSIUNIT_TYPE__DIMENSIONS = NAMEDUNIT_TYPE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONSIUNIT_TYPE__NAME = NAMEDUNIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NONSIUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONSIUNIT_TYPE_FEATURE_COUNT = NAMEDUNIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NONSIUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONSIUNIT_TYPE_OPERATION_COUNT = NAMEDUNIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONTRANSLATABLESTRINGTYPETypeImpl <em>NONTRANSLATABLESTRINGTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONTRANSLATABLESTRINGTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getNONTRANSLATABLESTRINGTYPEType()
	 * @generated
	 */
	int NONTRANSLATABLESTRINGTYPE_TYPE = 123;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONTRANSLATABLESTRINGTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONTRANSLATABLESTRINGTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NONTRANSLATABLESTRINGTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONTRANSLATABLESTRINGTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NONTRANSLATABLESTRINGTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONTRANSLATABLESTRINGTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NUMBERTYPETypeImpl <em>NUMBERTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NUMBERTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getNUMBERTYPEType()
	 * @generated
	 */
	int NUMBERTYPE_TYPE = 124;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NUMBERTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NUMBERTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ONTOMLTypeImpl <em>ONTOML Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ONTOMLTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getONTOMLType()
	 * @generated
	 */
	int ONTOML_TYPE = 125;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOML_TYPE__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOML_TYPE__DICTIONARY = 1;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOML_TYPE__LIBRARY = 2;

	/**
	 * The number of structural features of the '<em>ONTOML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOML_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ONTOML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOML_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ORGANIZATIONTypeImpl <em>ORGANIZATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ORGANIZATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getORGANIZATIONType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 126;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>ORGANIZATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ORGANIZATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PERSONTypeImpl <em>PERSON Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PERSONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPERSONType()
	 * @generated
	 */
	int PERSON_TYPE = 127;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__FIRST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Middle Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__MIDDLE_NAMES = 3;

	/**
	 * The feature id for the '<em><b>Prefix Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__PREFIX_TITLES = 4;

	/**
	 * The feature id for the '<em><b>Suffix Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__SUFFIX_TITLES = 5;

	/**
	 * The number of structural features of the '<em>PERSON Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>PERSON Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PLACEMENTTYPETypeImpl <em>PLACEMENTTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PLACEMENTTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPLACEMENTTYPEType()
	 * @generated
	 */
	int PLACEMENTTYPE_TYPE = 128;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTTYPE_TYPE__CLASS_REF = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PLACEMENTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PLACEMENTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.POSTCONDITIONTypeImpl <em>POSTCONDITION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.POSTCONDITIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPOSTCONDITIONType()
	 * @generated
	 */
	int POSTCONDITION_TYPE = 129;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_TYPE__FILTER = 0;

	/**
	 * The number of structural features of the '<em>POSTCONDITION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>POSTCONDITION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PRECONDITIONTypeImpl <em>PRECONDITION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PRECONDITIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPRECONDITIONType()
	 * @generated
	 */
	int PRECONDITION_TYPE = 130;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_TYPE__FILTER = 0;

	/**
	 * The number of structural features of the '<em>PRECONDITION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PRECONDITION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PREFERREDNAMELABELTypeImpl <em>PREFERREDNAMELABEL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PREFERREDNAMELABELTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPREFERREDNAMELABELType()
	 * @generated
	 */
	int PREFERREDNAMELABEL_TYPE = 131;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERREDNAMELABEL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERREDNAMELABEL_TYPE__COUNTRY_CODE = 1;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERREDNAMELABEL_TYPE__LANGUAGE_CODE = 2;

	/**
	 * The number of structural features of the '<em>PREFERREDNAMELABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERREDNAMELABEL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PREFERREDNAMELABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERREDNAMELABEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PREFERREDNAMETypeImpl <em>PREFERREDNAME Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PREFERREDNAMETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPREFERREDNAMEType()
	 * @generated
	 */
	int PREFERREDNAME_TYPE = 132;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERREDNAME_TYPE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>PREFERREDNAME Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERREDNAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PREFERREDNAME Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERREDNAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROGRAMREFERENCETYPETypeImpl <em>PROGRAMREFERENCETYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROGRAMREFERENCETYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPROGRAMREFERENCETYPEType()
	 * @generated
	 */
	int PROGRAMREFERENCETYPE_TYPE = 133;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMREFERENCETYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inout Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMREFERENCETYPE_TYPE__CLASS_REF = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>PROGRAMREFERENCETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMREFERENCETYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>PROGRAMREFERENCETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMREFERENCETYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTIESREFERENCETypeImpl <em>PROPERTIESREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTIESREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPROPERTIESREFERENCEType()
	 * @generated
	 */
	int PROPERTIESREFERENCE_TYPE = 134;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIESREFERENCE_TYPE__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>PROPERTIESREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIESREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PROPERTIESREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIESREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYCLASSIFICATIONTypeImpl <em>PROPERTYCLASSIFICATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYCLASSIFICATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPROPERTYCLASSIFICATIONType()
	 * @generated
	 */
	int PROPERTYCLASSIFICATION_TYPE = 135;

	/**
	 * The feature id for the '<em><b>Its Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYCLASSIFICATION_TYPE__ITS_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Prop Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYCLASSIFICATION_TYPE__PROP_DEF = 1;

	/**
	 * The number of structural features of the '<em>PROPERTYCLASSIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYCLASSIFICATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PROPERTYCLASSIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYCLASSIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYMAPPINGTypeImpl <em>PROPERTYMAPPING Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYMAPPINGTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPROPERTYMAPPINGType()
	 * @generated
	 */
	int PROPERTYMAPPING_TYPE = 137;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYMAPPING_TYPE__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYMAPPING_TYPE__RANGE = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYMAPPING_TYPE__FUNCTION = 2;

	/**
	 * The number of structural features of the '<em>PROPERTYMAPPING Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYMAPPING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PROPERTYMAPPING Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYMAPPING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYREFERENCETypeImpl <em>PROPERTYREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPROPERTYREFERENCEType()
	 * @generated
	 */
	int PROPERTYREFERENCE_TYPE = 138;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYREFERENCE_TYPE__ORDER_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYREFERENCE_TYPE__PROPERTY_REF = 1;

	/**
	 * The number of structural features of the '<em>PROPERTYREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYREFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PROPERTYREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl <em>PROPERTYVALUERECOMMENDEDPRESENTATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPROPERTYVALUERECOMMENDEDPRESENTATIONType()
	 * @generated
	 */
	int PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE = 140;

	/**
	 * The feature id for the '<em><b>Prop Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF = 0;

	/**
	 * The feature id for the '<em><b>Recommended Presentation Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Recommended Presentation Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_FORMAT = 2;

	/**
	 * The number of structural features of the '<em>PROPERTYVALUERECOMMENDEDPRESENTATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PROPERTYVALUERECOMMENDEDPRESENTATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RANGECONSTRAINTTypeImpl <em>RANGECONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RANGECONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getRANGECONSTRAINTType()
	 * @generated
	 */
	int RANGECONSTRAINT_TYPE = 141;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGECONSTRAINT_TYPE__MIN_VALUE = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGECONSTRAINT_TYPE__MAX_VALUE = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RANGECONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGECONSTRAINT_TYPE_FEATURE_COUNT = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RANGECONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGECONSTRAINT_TYPE_OPERATION_COUNT = DOMAINCONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RATIONALMEASURETYPETypeImpl <em>RATIONALMEASURETYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RATIONALMEASURETYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getRATIONALMEASURETYPEType()
	 * @generated
	 */
	int RATIONALMEASURETYPE_TYPE = 142;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALMEASURETYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALMEASURETYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALMEASURETYPE_TYPE__UNIT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alternative Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALMEASURETYPE_TYPE__ALTERNATIVE_UNITS = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALMEASURETYPE_TYPE__UNIT_ID = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alternative Unit Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS = ANYTYPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>RATIONALMEASURETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALMEASURETYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>RATIONALMEASURETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALMEASURETYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RATIONALTYPETypeImpl <em>RATIONALTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RATIONALTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getRATIONALTYPEType()
	 * @generated
	 */
	int RATIONALTYPE_TYPE = 143;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RATIONALTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RATIONALTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALCURRENCYTYPETypeImpl <em>REALCURRENCYTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALCURRENCYTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREALCURRENCYTYPEType()
	 * @generated
	 */
	int REALCURRENCYTYPE_TYPE = 144;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALCURRENCYTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALCURRENCYTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALCURRENCYTYPE_TYPE__CURRENCY = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Currency Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALCURRENCYTYPE_TYPE__CURRENCY_ID = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>REALCURRENCYTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALCURRENCYTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>REALCURRENCYTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALCURRENCYTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALMEASURETYPETypeImpl <em>REALMEASURETYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALMEASURETYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREALMEASURETYPEType()
	 * @generated
	 */
	int REALMEASURETYPE_TYPE = 145;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALMEASURETYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALMEASURETYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALMEASURETYPE_TYPE__UNIT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alternative Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALMEASURETYPE_TYPE__UNIT_ID = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alternative Unit Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS = ANYTYPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>REALMEASURETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALMEASURETYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>REALMEASURETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALMEASURETYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALTYPETypeImpl <em>REALTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREALTYPEType()
	 * @generated
	 */
	int REALTYPE_TYPE = 146;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>REALTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>REALTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RECOMMENDEDPRESENTATIONTypeImpl <em>RECOMMENDEDPRESENTATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RECOMMENDEDPRESENTATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getRECOMMENDEDPRESENTATIONType()
	 * @generated
	 */
	int RECOMMENDEDPRESENTATION_TYPE = 147;

	/**
	 * The feature id for the '<em><b>Property Value Recommended Presentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDEDPRESENTATION_TYPE__PROPERTY_VALUE_RECOMMENDED_PRESENTATION = 0;

	/**
	 * The number of structural features of the '<em>RECOMMENDEDPRESENTATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDEDPRESENTATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RECOMMENDEDPRESENTATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDEDPRESENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REFERENCEDDOCUMENTTypeImpl <em>REFERENCEDDOCUMENT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REFERENCEDDOCUMENTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREFERENCEDDOCUMENTType()
	 * @generated
	 */
	int REFERENCEDDOCUMENT_TYPE = 148;

	/**
	 * The feature id for the '<em><b>Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE = SOURCEDOCUMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>REFERENCEDDOCUMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEDDOCUMENT_TYPE_FEATURE_COUNT = SOURCEDOCUMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>REFERENCEDDOCUMENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEDDOCUMENT_TYPE_OPERATION_COUNT = SOURCEDOCUMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REFERENCEDGRAPHICSTypeImpl <em>REFERENCEDGRAPHICS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REFERENCEDGRAPHICSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREFERENCEDGRAPHICSType()
	 * @generated
	 */
	int REFERENCEDGRAPHICS_TYPE = 149;

	/**
	 * The feature id for the '<em><b>Graphics Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE = GRAPHICS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>REFERENCEDGRAPHICS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEDGRAPHICS_TYPE_FEATURE_COUNT = GRAPHICS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>REFERENCEDGRAPHICS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEDGRAPHICS_TYPE_OPERATION_COUNT = GRAPHICS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REMOTELOCATIONSTypeImpl <em>REMOTELOCATIONS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REMOTELOCATIONSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREMOTELOCATIONSType()
	 * @generated
	 */
	int REMOTELOCATIONS_TYPE = 150;

	/**
	 * The feature id for the '<em><b>Remote Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTELOCATIONS_TYPE__REMOTE_LOCATION = 0;

	/**
	 * The number of structural features of the '<em>REMOTELOCATIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTELOCATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>REMOTELOCATIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTELOCATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RemoteLocationTypeImpl <em>Remote Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RemoteLocationTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getRemoteLocationType()
	 * @generated
	 */
	int REMOTE_LOCATION_TYPE = 151;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_LOCATION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_LOCATION_TYPE__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Remote Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_LOCATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Remote Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_LOCATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REPRESENTATIONPDETTypeImpl <em>REPRESENTATIONPDET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REPRESENTATIONPDETTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREPRESENTATIONPDETType()
	 * @generated
	 */
	int REPRESENTATIONPDET_TYPE = 152;

	/**
	 * The feature id for the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__NAME_SCOPE = PROPERTY_TYPE__NAME_SCOPE;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__DATE_OF_ORIGINAL_DEFINITION = PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__DATE_OF_CURRENT_VERSION = PROPERTY_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__DATE_OF_CURRENT_REVISION = PROPERTY_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__REVISION = PROPERTY_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__STATUS = PROPERTY_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__TRANSLATION = PROPERTY_TYPE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__SOURCE_LANGUAGE = PROPERTY_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__IS_DEPRECATED = PROPERTY_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__IS_DEPRECATED_INTERPRETATION = PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__PREFERRED_NAME = PROPERTY_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__SYNONYMOUS_NAMES = PROPERTY_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__SHORT_NAME = PROPERTY_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__ICON = PROPERTY_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__DEFINITION = PROPERTY_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__SOURCE_DOC_OF_DEFINITION = PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__NOTE = PROPERTY_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__REMARK = PROPERTY_TYPE__REMARK;

	/**
	 * The feature id for the '<em><b>Preferred Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__PREFERRED_SYMBOL = PROPERTY_TYPE__PREFERRED_SYMBOL;

	/**
	 * The feature id for the '<em><b>Synonymous Symbols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__SYNONYMOUS_SYMBOLS = PROPERTY_TYPE__SYNONYMOUS_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__FIGURE = PROPERTY_TYPE__FIGURE;

	/**
	 * The feature id for the '<em><b>Det Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__DET_CLASSIFICATION = PROPERTY_TYPE__DET_CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__DOMAIN = PROPERTY_TYPE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__FORMULA = PROPERTY_TYPE__FORMULA;

	/**
	 * The feature id for the '<em><b>Synonym References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__SYNONYM_REFERENCES = PROPERTY_TYPE__SYNONYM_REFERENCES;

	/**
	 * The feature id for the '<em><b>Suggested Value List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__SUGGESTED_VALUE_LIST = PROPERTY_TYPE__SUGGESTED_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Free Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__FREE_RELATIONS = PROPERTY_TYPE__FREE_RELATIONS;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__GUID = PROPERTY_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__GUID2 = PROPERTY_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE__ID = PROPERTY_TYPE__ID;

	/**
	 * The number of structural features of the '<em>REPRESENTATIONPDET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE_FEATURE_COUNT = PROPERTY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>REPRESENTATIONPDET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONPDET_TYPE_OPERATION_COUNT = PROPERTY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REPRESENTATIONREFERENCETYPETypeImpl <em>REPRESENTATIONREFERENCETYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REPRESENTATIONREFERENCETYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREPRESENTATIONREFERENCETYPEType()
	 * @generated
	 */
	int REPRESENTATIONREFERENCETYPE_TYPE = 153;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONREFERENCETYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONREFERENCETYPE_TYPE__CLASS_REF = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>REPRESENTATIONREFERENCETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONREFERENCETYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>REPRESENTATIONREFERENCETYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONREFERENCETYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl <em>REUSABLENAME Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREUSABLENAMEType()
	 * @generated
	 */
	int REUSABLENAME_TYPE = 155;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__DATE_OF_ORIGINAL_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__DATE_OF_CURRENT_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__DATE_OF_CURRENT_REVISION = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__REVISION = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__SOURCE_LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__IS_DEPRECATED = 6;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__ICON = 9;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__NOTE = 10;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__GUID = 11;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__GUID2 = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE__ID = 13;

	/**
	 * The number of structural features of the '<em>REUSABLENAME Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>REUSABLENAME Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLENAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLEKEYWORDTypeImpl <em>REUSABLEKEYWORD Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLEKEYWORDTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREUSABLEKEYWORDType()
	 * @generated
	 */
	int REUSABLEKEYWORD_TYPE = 154;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__DATE_OF_ORIGINAL_DEFINITION = REUSABLENAME_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__DATE_OF_CURRENT_VERSION = REUSABLENAME_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__DATE_OF_CURRENT_REVISION = REUSABLENAME_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__REVISION = REUSABLENAME_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__STATUS = REUSABLENAME_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__SOURCE_LANGUAGE = REUSABLENAME_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__IS_DEPRECATED = REUSABLENAME_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__IS_DEPRECATED_INTERPRETATION = REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__NAME = REUSABLENAME_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__ICON = REUSABLENAME_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__NOTE = REUSABLENAME_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__GUID = REUSABLENAME_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__GUID2 = REUSABLENAME_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE__ID = REUSABLENAME_TYPE__ID;

	/**
	 * The number of structural features of the '<em>REUSABLEKEYWORD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE_FEATURE_COUNT = REUSABLENAME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>REUSABLEKEYWORD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLEKEYWORD_TYPE_OPERATION_COUNT = REUSABLENAME_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLESYNONYMTypeImpl <em>REUSABLESYNONYM Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLESYNONYMTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREUSABLESYNONYMType()
	 * @generated
	 */
	int REUSABLESYNONYM_TYPE = 156;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__DATE_OF_ORIGINAL_DEFINITION = REUSABLENAME_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__DATE_OF_CURRENT_VERSION = REUSABLENAME_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__DATE_OF_CURRENT_REVISION = REUSABLENAME_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__REVISION = REUSABLENAME_TYPE__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__STATUS = REUSABLENAME_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__SOURCE_LANGUAGE = REUSABLENAME_TYPE__SOURCE_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__IS_DEPRECATED = REUSABLENAME_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__IS_DEPRECATED_INTERPRETATION = REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__NAME = REUSABLENAME_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__ICON = REUSABLENAME_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__NOTE = REUSABLENAME_TYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__GUID = REUSABLENAME_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__GUID2 = REUSABLENAME_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE__ID = REUSABLENAME_TYPE__ID;

	/**
	 * The number of structural features of the '<em>REUSABLESYNONYM Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE_FEATURE_COUNT = REUSABLENAME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>REUSABLESYNONYM Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSABLESYNONYM_TYPE_OPERATION_COUNT = REUSABLENAME_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SETTYPETypeImpl <em>SETTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SETTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSETTYPEType()
	 * @generated
	 */
	int SETTYPE_TYPE = 157;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTYPE_TYPE__BOUND1 = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTYPE_TYPE__BOUND2 = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTYPE_TYPE__VALUE_TYPE = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SETTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SETTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SETWITHSUBSETCONSTRAINTTYPETypeImpl <em>SETWITHSUBSETCONSTRAINTTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SETWITHSUBSETCONSTRAINTTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSETWITHSUBSETCONSTRAINTTYPEType()
	 * @generated
	 */
	int SETWITHSUBSETCONSTRAINTTYPE_TYPE = 158;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETWITHSUBSETCONSTRAINTTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND1 = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND2 = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE = ANYTYPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinal Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MIN = ANYTYPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cardinal Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MAX = ANYTYPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SETWITHSUBSETCONSTRAINTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETWITHSUBSETCONSTRAINTTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>SETWITHSUBSETCONSTRAINTTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETWITHSUBSETCONSTRAINTTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SHORTNAMELABELTypeImpl <em>SHORTNAMELABEL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SHORTNAMELABELTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSHORTNAMELABELType()
	 * @generated
	 */
	int SHORTNAMELABEL_TYPE = 159;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTNAMELABEL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTNAMELABEL_TYPE__COUNTRY_CODE = 1;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTNAMELABEL_TYPE__LANGUAGE_CODE = 2;

	/**
	 * The number of structural features of the '<em>SHORTNAMELABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTNAMELABEL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SHORTNAMELABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTNAMELABEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SHORTNAMETypeImpl <em>SHORTNAME Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SHORTNAMETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSHORTNAMEType()
	 * @generated
	 */
	int SHORTNAME_TYPE = 160;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTNAME_TYPE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>SHORTNAME Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTNAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SHORTNAME Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTNAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SIUNITTypeImpl <em>SIUNIT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SIUNITTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSIUNITType()
	 * @generated
	 */
	int SIUNIT_TYPE = 161;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIUNIT_TYPE__DIMENSIONS = NAMEDUNIT_TYPE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIUNIT_TYPE__PREFIX = NAMEDUNIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIUNIT_TYPE__NAME = NAMEDUNIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SIUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIUNIT_TYPE_FEATURE_COUNT = NAMEDUNIT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SIUNIT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIUNIT_TYPE_OPERATION_COUNT = NAMEDUNIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGDICVALUETypeImpl <em>STRINGDICVALUE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGDICVALUETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSTRINGDICVALUEType()
	 * @generated
	 */
	int STRINGDICVALUE_TYPE = 163;

	/**
	 * The feature id for the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__PREFERRED_NAME = DICVALUE_TYPE__PREFERRED_NAME;

	/**
	 * The feature id for the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__SYNONYMOUS_NAMES = DICVALUE_TYPE__SYNONYMOUS_NAMES;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__SHORT_NAME = DICVALUE_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__ICON = DICVALUE_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Source Doc Of Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__SOURCE_DOC_OF_DEFINITION = DICVALUE_TYPE__SOURCE_DOC_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__DEFINITION = DICVALUE_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__STATUS = DICVALUE_TYPE__STATUS;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__IS_DEPRECATED = DICVALUE_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__IS_DEPRECATED_INTERPRETATION = DICVALUE_TYPE__IS_DEPRECATED_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Value Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__VALUE_SPECIFICATION = DICVALUE_TYPE__VALUE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__DATE_OF_ORIGINAL_DEFINITION = DICVALUE_TYPE__DATE_OF_ORIGINAL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__DATE_OF_CURRENT_VERSION = DICVALUE_TYPE__DATE_OF_CURRENT_VERSION;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__DATE_OF_CURRENT_REVISION = DICVALUE_TYPE__DATE_OF_CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__GUID = DICVALUE_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__GUID2 = DICVALUE_TYPE__GUID2;

	/**
	 * The feature id for the '<em><b>Value Meaning Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__VALUE_MEANING_ID = DICVALUE_TYPE__VALUE_MEANING_ID;

	/**
	 * The feature id for the '<em><b>Value Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE__VALUE_CODE = DICVALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>STRINGDICVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE_FEATURE_COUNT = DICVALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>STRINGDICVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGDICVALUE_TYPE_OPERATION_COUNT = DICVALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGPATTERNCONSTRAINTTypeImpl <em>STRINGPATTERNCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGPATTERNCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSTRINGPATTERNCONSTRAINTType()
	 * @generated
	 */
	int STRINGPATTERNCONSTRAINT_TYPE = 164;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGPATTERNCONSTRAINT_TYPE__PATTERN = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>STRINGPATTERNCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGPATTERNCONSTRAINT_TYPE_FEATURE_COUNT = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>STRINGPATTERNCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGPATTERNCONSTRAINT_TYPE_OPERATION_COUNT = DOMAINCONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGSIZECONSTRAINTTypeImpl <em>STRINGSIZECONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGSIZECONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSTRINGSIZECONSTRAINTType()
	 * @generated
	 */
	int STRINGSIZECONSTRAINT_TYPE = 165;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGSIZECONSTRAINT_TYPE__MIN_LENGTH = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGSIZECONSTRAINT_TYPE__MAX_LENGTH = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>STRINGSIZECONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGSIZECONSTRAINT_TYPE_FEATURE_COUNT = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>STRINGSIZECONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGSIZECONSTRAINT_TYPE_OPERATION_COUNT = DOMAINCONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGSTypeImpl <em>STRINGS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSTRINGSType()
	 * @generated
	 */
	int STRINGS_TYPE = 166;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>STRINGS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>STRINGS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGTYPETypeImpl <em>STRINGTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.STRINGTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSTRINGTYPEType()
	 * @generated
	 */
	int STRINGTYPE_TYPE = 167;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>STRINGTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>STRINGTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUBCLASSCONSTRAINTTypeImpl <em>SUBCLASSCONSTRAINT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUBCLASSCONSTRAINTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSUBCLASSCONSTRAINTType()
	 * @generated
	 */
	int SUBCLASSCONSTRAINT_TYPE = 168;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASSCONSTRAINT_TYPE__SUBCLASSES = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SUBCLASSCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASSCONSTRAINT_TYPE_FEATURE_COUNT = DOMAINCONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SUBCLASSCONSTRAINT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASSCONSTRAINT_TYPE_OPERATION_COUNT = DOMAINCONSTRAINT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUBSETTypeImpl <em>SUBSET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUBSETTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSUBSETType()
	 * @generated
	 */
	int SUBSET_TYPE = 169;

	/**
	 * The feature id for the '<em><b>Value Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__VALUE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__BAG_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__BOOLEAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__COMPLEX_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__COMPOSITE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__CONTROLLED_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__CURRENCY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__DATE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__DATE_TIME_VALUE = 9;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__FILE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__INTEGER_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__ITEM_REFERENCE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__LOCALIZED_TEXT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__MEASURE_RANGE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__NULL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__RATIONAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__REAL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__SEQUENCE_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__SET_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__TIME_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__YEAR_MONTH_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE__YEAR_VALUE = 24;

	/**
	 * The number of structural features of the '<em>SUBSET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>SUBSET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERREFERENCETypeImpl <em>SUPPLIERREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSUPPLIERREFERENCEType()
	 * @generated
	 */
	int SUPPLIERREFERENCE_TYPE = 170;

	/**
	 * The feature id for the '<em><b>Supplier Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERREFERENCE_TYPE__SUPPLIER_REF = 0;

	/**
	 * The number of structural features of the '<em>SUPPLIERREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SUPPLIERREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERSREFERENCETypeImpl <em>SUPPLIERSREFERENCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERSREFERENCETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSUPPLIERSREFERENCEType()
	 * @generated
	 */
	int SUPPLIERSREFERENCE_TYPE = 171;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERSREFERENCE_TYPE__SUPPLIER = 0;

	/**
	 * The number of structural features of the '<em>SUPPLIERSREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERSREFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SUPPLIERSREFERENCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERSREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl <em>SUPPLIER Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSUPPLIERType()
	 * @generated
	 */
	int SUPPLIER_TYPE = 172;

	/**
	 * The feature id for the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__DATE_OF_ORIGINAL_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__DATE_OF_CURRENT_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__DATE_OF_CURRENT_REVISION = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__REVISION = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__IS_DEPRECATED = 5;

	/**
	 * The feature id for the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION = 6;

	/**
	 * The feature id for the '<em><b>Org</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__ORG = 7;

	/**
	 * The feature id for the '<em><b>Internal Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__INTERNAL_LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__STREET_NUMBER = 9;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__STREET = 10;

	/**
	 * The feature id for the '<em><b>Postal Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__POSTAL_BOX = 11;

	/**
	 * The feature id for the '<em><b>Town</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__TOWN = 12;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__REGION = 13;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__POSTAL_CODE = 14;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__COUNTRY = 15;

	/**
	 * The feature id for the '<em><b>Facsimile Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__FACSIMILE_NUMBER = 16;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__TELEPHONE_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Electronic Mail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__ELECTRONIC_MAIL_ADDRESS = 18;

	/**
	 * The feature id for the '<em><b>Telex Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__TELEX_NUMBER = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__ID = 20;

	/**
	 * The number of structural features of the '<em>SUPPLIER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>SUPPLIER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPORTEDVEPTypeImpl <em>SUPPORTEDVEP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPORTEDVEPTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSUPPORTEDVEPType()
	 * @generated
	 */
	int SUPPORTEDVEP_TYPE = 173;

	/**
	 * The feature id for the '<em><b>View Exchange Protocol Identification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTEDVEP_TYPE__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATION = 0;

	/**
	 * The number of structural features of the '<em>SUPPORTEDVEP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTEDVEP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SUPPORTEDVEP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTEDVEP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SYNONYMOUSNAMELABELTypeImpl <em>SYNONYMOUSNAMELABEL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SYNONYMOUSNAMELABELTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSYNONYMOUSNAMELABELType()
	 * @generated
	 */
	int SYNONYMOUSNAMELABEL_TYPE = 174;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSNAMELABEL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSNAMELABEL_TYPE__COUNTRY_CODE = 1;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSNAMELABEL_TYPE__LANGUAGE_CODE = 2;

	/**
	 * The number of structural features of the '<em>SYNONYMOUSNAMELABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSNAMELABEL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SYNONYMOUSNAMELABEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSNAMELABEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SYNONYMOUSNAMETypeImpl <em>SYNONYMOUSNAME Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SYNONYMOUSNAMETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSYNONYMOUSNAMEType()
	 * @generated
	 */
	int SYNONYMOUSNAME_TYPE = 175;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSNAME_TYPE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>SYNONYMOUSNAME Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSNAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SYNONYMOUSNAME Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSNAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SYNONYMOUSSYMBOLSTypeImpl <em>SYNONYMOUSSYMBOLS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SYNONYMOUSSYMBOLSTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSYNONYMOUSSYMBOLSType()
	 * @generated
	 */
	int SYNONYMOUSSYMBOLS_TYPE = 176;

	/**
	 * The feature id for the '<em><b>Mathematical String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSSYMBOLS_TYPE__MATHEMATICAL_STRING = 0;

	/**
	 * The number of structural features of the '<em>SYNONYMOUSSYMBOLS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSSYMBOLS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SYNONYMOUSSYMBOLS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMOUSSYMBOLS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SYNONYMREFERENCESTypeImpl <em>SYNONYMREFERENCES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SYNONYMREFERENCESTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSYNONYMREFERENCESType()
	 * @generated
	 */
	int SYNONYMREFERENCES_TYPE = 177;

	/**
	 * The feature id for the '<em><b>Synonym Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMREFERENCES_TYPE__SYNONYM_REF = 0;

	/**
	 * The number of structural features of the '<em>SYNONYMREFERENCES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMREFERENCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SYNONYMREFERENCES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYMREFERENCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TEXTTypeImpl <em>TEXT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TEXTTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getTEXTType()
	 * @generated
	 */
	int TEXT_TYPE = 178;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>TEXT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TEXT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TIMEDATATYPETypeImpl <em>TIMEDATATYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TIMEDATATYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getTIMEDATATYPEType()
	 * @generated
	 */
	int TIMEDATATYPE_TYPE = 179;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEDATATYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEDATATYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TIMEDATATYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEDATATYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TIMEDATATYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEDATATYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATABLESTRINGTYPETypeImpl <em>TRANSLATABLESTRINGTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATABLESTRINGTYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getTRANSLATABLESTRINGTYPEType()
	 * @generated
	 */
	int TRANSLATABLESTRINGTYPE_TYPE = 180;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATABLESTRINGTYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATABLESTRINGTYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TRANSLATABLESTRINGTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATABLESTRINGTYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TRANSLATABLESTRINGTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATABLESTRINGTYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATIONDATATypeImpl <em>TRANSLATIONDATA Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATIONDATATypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getTRANSLATIONDATAType()
	 * @generated
	 */
	int TRANSLATIONDATA_TYPE = 181;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATIONDATA_TYPE__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Responsible Translator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR = 1;

	/**
	 * The feature id for the '<em><b>Translation Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATIONDATA_TYPE__TRANSLATION_REVISION = 2;

	/**
	 * The feature id for the '<em><b>Date Of Current Translation Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATIONDATA_TYPE__DATE_OF_CURRENT_TRANSLATION_REVISION = 3;

	/**
	 * The number of structural features of the '<em>TRANSLATIONDATA Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATIONDATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TRANSLATIONDATA Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATIONDATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATIONTypeImpl <em>TRANSLATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getTRANSLATIONType()
	 * @generated
	 */
	int TRANSLATION_TYPE = 182;

	/**
	 * The feature id for the '<em><b>Translation Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE__TRANSLATION_DATA = 0;

	/**
	 * The number of structural features of the '<em>TRANSLATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRANSLATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.URITYPETypeImpl <em>URITYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.URITYPETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getURITYPEType()
	 * @generated
	 */
	int URITYPE_TYPE = 184;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URITYPE_TYPE__CONSTRAINTS = ANYTYPE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URITYPE_TYPE__VALUE_FORMAT = ANYTYPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URITYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URITYPE_TYPE_FEATURE_COUNT = ANYTYPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>URITYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URITYPE_TYPE_OPERATION_COUNT = ANYTYPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VCVRANGETypeImpl <em>VCVRANGE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VCVRANGETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getVCVRANGEType()
	 * @generated
	 */
	int VCVRANGE_TYPE = 185;

	/**
	 * The feature id for the '<em><b>View Control Variable Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCVRANGE_TYPE__VIEW_CONTROL_VARIABLE_RANGE = 0;

	/**
	 * The number of structural features of the '<em>VCVRANGE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCVRANGE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VCVRANGE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCVRANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VIEWCONTROLVARIABLERANGETypeImpl <em>VIEWCONTROLVARIABLERANGE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VIEWCONTROLVARIABLERANGETypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getVIEWCONTROLVARIABLERANGEType()
	 * @generated
	 */
	int VIEWCONTROLVARIABLERANGE_TYPE = 186;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Range Lobound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWCONTROLVARIABLERANGE_TYPE__RANGE_LOBOUND = 1;

	/**
	 * The feature id for the '<em><b>Range Hibound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWCONTROLVARIABLERANGE_TYPE__RANGE_HIBOUND = 2;

	/**
	 * The number of structural features of the '<em>VIEWCONTROLVARIABLERANGE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWCONTROLVARIABLERANGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VIEWCONTROLVARIABLERANGE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWCONTROLVARIABLERANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VIEWEXCHANGEPROTOCOLIDENTIFICATIONTypeImpl <em>VIEWEXCHANGEPROTOCOLIDENTIFICATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VIEWEXCHANGEPROTOCOLIDENTIFICATIONTypeImpl
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType()
	 * @generated
	 */
	int VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE = 187;

	/**
	 * The feature id for the '<em><b>Source Document Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE__SOURCE_DOCUMENT_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE__DATE = 3;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE__APPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE__LEVEL = 5;

	/**
	 * The number of structural features of the '<em>VIEWEXCHANGEPROTOCOLIDENTIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>VIEWEXCHANGEPROTOCOLIDENTIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType <em>ILLUSTRATIONTYPE Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getILLUSTRATIONTYPEType()
	 * @generated
	 */
	int ILLUSTRATIONTYPE_TYPE = 188;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType <em>SIPREFIX Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSIPREFIXType()
	 * @generated
	 */
	int SIPREFIX_TYPE = 189;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType <em>SIUNITNAME Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSIUNITNAMEType()
	 * @generated
	 */
	int SIUNITNAME_TYPE = 190;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType <em>STANDARDSIZE Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSTANDARDSIZEType()
	 * @generated
	 */
	int STANDARDSIZE_TYPE = 191;

	/**
	 * The meta object id for the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType <em>VALUESPECIFICATION Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getVALUESPECIFICATIONType()
	 * @generated
	 */
	int VALUESPECIFICATION_TYPE = 192;

	/**
	 * The meta object id for the '<em>ABSOLUTEURLTYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getABSOLUTEURLTYPEType()
	 * @generated
	 */
	int ABSOLUTEURLTYPE_TYPE = 193;

	/**
	 * The meta object id for the '<em>APosteriori Semantic Relation Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getAPosterioriSemanticRelationId()
	 * @generated
	 */
	int APOSTERIORI_SEMANTIC_RELATION_ID = 194;

	/**
	 * The meta object id for the '<em>Class Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getClassId()
	 * @generated
	 */
	int CLASS_ID = 195;

	/**
	 * The meta object id for the '<em>Class Ref Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getClassRefType()
	 * @generated
	 */
	int CLASS_REF_TYPE = 196;

	/**
	 * The meta object id for the '<em>Class Ref Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getClassRefType1()
	 * @generated
	 */
	int CLASS_REF_TYPE1 = 197;

	/**
	 * The meta object id for the '<em>Class Ref Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getClassRefType2()
	 * @generated
	 */
	int CLASS_REF_TYPE2 = 198;

	/**
	 * The meta object id for the '<em>Class Ref Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getClassRefType3()
	 * @generated
	 */
	int CLASS_REF_TYPE3 = 199;

	/**
	 * The meta object id for the '<em>Class Ref Type4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getClassRefType4()
	 * @generated
	 */
	int CLASS_REF_TYPE4 = 200;

	/**
	 * The meta object id for the '<em>Class Ref Type5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getClassRefType5()
	 * @generated
	 */
	int CLASS_REF_TYPE5 = 201;

	/**
	 * The meta object id for the '<em>Constraint Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getConstraintId()
	 * @generated
	 */
	int CONSTRAINT_ID = 202;

	/**
	 * The meta object id for the '<em>COUNTRYCODE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCOUNTRYCODEType()
	 * @generated
	 */
	int COUNTRYCODE_TYPE = 203;

	/**
	 * The meta object id for the '<em>CURRENCYCODE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCURRENCYCODEType()
	 * @generated
	 */
	int CURRENCYCODE_TYPE = 204;

	/**
	 * The meta object id for the '<em>Currency Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getCurrencyId()
	 * @generated
	 */
	int CURRENCY_ID = 205;

	/**
	 * The meta object id for the '<em>Data Type Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDataTypeId()
	 * @generated
	 */
	int DATA_TYPE_ID = 206;

	/**
	 * The meta object id for the '<em>DATETYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDATETYPEType()
	 * @generated
	 */
	int DATETYPE_TYPE = 207;

	/**
	 * The meta object id for the '<em>DETCLASSIFICATIONTYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDETCLASSIFICATIONTYPEType()
	 * @generated
	 */
	int DETCLASSIFICATIONTYPE_TYPE = 208;

	/**
	 * The meta object id for the '<em>Dic Unit Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDicUnitId()
	 * @generated
	 */
	int DIC_UNIT_ID = 209;

	/**
	 * The meta object id for the '<em>Dic Value Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDicValueId()
	 * @generated
	 */
	int DIC_VALUE_ID = 210;

	/**
	 * The meta object id for the '<em>Document Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDocumentId()
	 * @generated
	 */
	int DOCUMENT_ID = 211;

	/**
	 * The meta object id for the '<em>DOCUMENTIDENTIFIERNAME Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getDOCUMENTIDENTIFIERNAMEType()
	 * @generated
	 */
	int DOCUMENTIDENTIFIERNAME_TYPE = 212;

	/**
	 * The meta object id for the '<em>Eptos GUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getEptosGUID()
	 * @generated
	 */
	int EPTOS_GUID = 213;

	/**
	 * The meta object id for the '<em>EXTERNALITEMCODETYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getEXTERNALITEMCODETYPEType()
	 * @generated
	 */
	int EXTERNALITEMCODETYPE_TYPE = 214;

	/**
	 * The meta object id for the '<em>Free Relation Definition Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getFreeRelationDefinitionId()
	 * @generated
	 */
	int FREE_RELATION_DEFINITION_ID = 215;

	/**
	 * The meta object id for the '<em>Free Relation End Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getFreeRelationEndId()
	 * @generated
	 */
	int FREE_RELATION_END_ID = 216;

	/**
	 * The meta object id for the '<em>HTTPDIRECTORYNAMETYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getHTTPDIRECTORYNAMETYPEType()
	 * @generated
	 */
	int HTTPDIRECTORYNAMETYPE_TYPE = 217;

	/**
	 * The meta object id for the '<em>HTTPFILENAMETYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getHTTPFILENAMETYPEType()
	 * @generated
	 */
	int HTTPFILENAMETYPE_TYPE = 218;

	/**
	 * The meta object id for the '<em>ILLUSTRATIONTYPE Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getILLUSTRATIONTYPETypeObject()
	 * @generated
	 */
	int ILLUSTRATIONTYPE_TYPE_OBJECT = 219;

	/**
	 * The meta object id for the '<em>KEYWORDREFERENCE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getKEYWORDREFERENCEType()
	 * @generated
	 */
	int KEYWORDREFERENCE_TYPE = 220;

	/**
	 * The meta object id for the '<em>KEYWORDTYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getKEYWORDTYPEType()
	 * @generated
	 */
	int KEYWORDTYPE_TYPE = 221;

	/**
	 * The meta object id for the '<em>LANGUAGECODE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getLANGUAGECODEType()
	 * @generated
	 */
	int LANGUAGECODE_TYPE = 222;

	/**
	 * The meta object id for the '<em>Ontology Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getOntologyId()
	 * @generated
	 */
	int ONTOLOGY_ID = 223;

	/**
	 * The meta object id for the '<em>POSITIVELENGTHMEASURE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPOSITIVELENGTHMEASUREType()
	 * @generated
	 */
	int POSITIVELENGTHMEASURE_TYPE = 224;

	/**
	 * The meta object id for the '<em>POSITIVEPLANEANGLEMEASURE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPOSITIVEPLANEANGLEMEASUREType()
	 * @generated
	 */
	int POSITIVEPLANEANGLEMEASURE_TYPE = 225;

	/**
	 * The meta object id for the '<em>POSITIVERATIOMEASURE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPOSITIVERATIOMEASUREType()
	 * @generated
	 */
	int POSITIVERATIOMEASURE_TYPE = 226;

	/**
	 * The meta object id for the '<em>PREFERREDNAMETYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPREFERREDNAMETYPEType()
	 * @generated
	 */
	int PREFERREDNAMETYPE_TYPE = 227;

	/**
	 * The meta object id for the '<em>PROGRAMREFERENCENAME Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPROGRAMREFERENCENAMEType()
	 * @generated
	 */
	int PROGRAMREFERENCENAME_TYPE = 228;

	/**
	 * The meta object id for the '<em>Property Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getPropertyId()
	 * @generated
	 */
	int PROPERTY_ID = 229;

	/**
	 * The meta object id for the '<em>Reusable Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getReusableNameId()
	 * @generated
	 */
	int REUSABLE_NAME_ID = 230;

	/**
	 * The meta object id for the '<em>REVISIONTYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getREVISIONTYPEType()
	 * @generated
	 */
	int REVISIONTYPE_TYPE = 231;

	/**
	 * The meta object id for the '<em>SHORTNAMETYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSHORTNAMETYPEType()
	 * @generated
	 */
	int SHORTNAMETYPE_TYPE = 232;

	/**
	 * The meta object id for the '<em>SIPREFIX Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSIPREFIXTypeObject()
	 * @generated
	 */
	int SIPREFIX_TYPE_OBJECT = 233;

	/**
	 * The meta object id for the '<em>SIUNITNAME Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSIUNITNAMETypeObject()
	 * @generated
	 */
	int SIUNITNAME_TYPE_OBJECT = 234;

	/**
	 * The meta object id for the '<em>STANDARDSIZE Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSTANDARDSIZETypeObject()
	 * @generated
	 */
	int STANDARDSIZE_TYPE_OBJECT = 235;

	/**
	 * The meta object id for the '<em>STATUS Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSTATUSType()
	 * @generated
	 */
	int STATUS_TYPE = 236;

	/**
	 * The meta object id for the '<em>SUPPLIERCODETYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSUPPLIERCODETYPEType()
	 * @generated
	 */
	int SUPPLIERCODETYPE_TYPE = 237;

	/**
	 * The meta object id for the '<em>Supplier Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSupplierId()
	 * @generated
	 */
	int SUPPLIER_ID = 238;

	/**
	 * The meta object id for the '<em>SYNONYMOUSNAMETYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSYNONYMOUSNAMETYPEType()
	 * @generated
	 */
	int SYNONYMOUSNAMETYPE_TYPE = 239;

	/**
	 * The meta object id for the '<em>SYNONYMREFERENCE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getSYNONYMREFERENCEType()
	 * @generated
	 */
	int SYNONYMREFERENCE_TYPE = 240;

	/**
	 * The meta object id for the '<em>VALUECODETYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getVALUECODETYPEType()
	 * @generated
	 */
	int VALUECODETYPE_TYPE = 241;

	/**
	 * The meta object id for the '<em>VALUEFORMATTYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getVALUEFORMATTYPEType()
	 * @generated
	 */
	int VALUEFORMATTYPE_TYPE = 242;

	/**
	 * The meta object id for the '<em>VALUESPECIFICATION Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getVALUESPECIFICATIONTypeObject()
	 * @generated
	 */
	int VALUESPECIFICATION_TYPE_OBJECT = 243;

	/**
	 * The meta object id for the '<em>VERSIONTYPE Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl#getVERSIONTYPEType()
	 * @generated
	 */
	int VERSIONTYPE_TYPE = 244;


	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ALTERNATIVEUNITSType <em>ALTERNATIVEUNITS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEUNITS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ALTERNATIVEUNITSType
	 * @generated
	 */
	EClass getALTERNATIVEUNITSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ALTERNATIVEUNITSType#getDicUnit <em>Dic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dic Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ALTERNATIVEUNITSType#getDicUnit()
	 * @see #getALTERNATIVEUNITSType()
	 * @generated
	 */
	EReference getALTERNATIVEUNITSType_DicUnit();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType <em>ANYTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANYTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType
	 * @generated
	 */
	EClass getANYTYPEType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType#getConstraints()
	 * @see #getANYTYPEType()
	 * @generated
	 */
	EReference getANYTYPEType_Constraints();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType <em>APOSTERIORICASEOF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APOSTERIORICASEOF Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType
	 * @generated
	 */
	EClass getAPOSTERIORICASEOFType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCaseOfSuper <em>Case Of Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Of Super</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCaseOfSuper()
	 * @see #getAPOSTERIORICASEOFType()
	 * @generated
	 */
	EReference getAPOSTERIORICASEOFType_CaseOfSuper();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCaseOfSub <em>Case Of Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Of Sub</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCaseOfSub()
	 * @see #getAPOSTERIORICASEOFType()
	 * @generated
	 */
	EReference getAPOSTERIORICASEOFType_CaseOfSub();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCorrespondingProperties <em>Corresponding Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corresponding Properties</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCorrespondingProperties()
	 * @see #getAPOSTERIORICASEOFType()
	 * @generated
	 */
	EReference getAPOSTERIORICASEOFType_CorrespondingProperties();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPSType <em>APOSTERIORISEMANTICRELATIONSHIPS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APOSTERIORISEMANTICRELATIONSHIPS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPSType
	 * @generated
	 */
	EClass getAPOSTERIORISEMANTICRELATIONSHIPSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPSType#getAPosterioriSemanticRelationship <em>APosteriori Semantic Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>APosteriori Semantic Relationship</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPSType#getAPosterioriSemanticRelationship()
	 * @see #getAPOSTERIORISEMANTICRELATIONSHIPSType()
	 * @generated
	 */
	EReference getAPOSTERIORISEMANTICRELATIONSHIPSType_APosterioriSemanticRelationship();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPType <em>APOSTERIORISEMANTICRELATIONSHIP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APOSTERIORISEMANTICRELATIONSHIP Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPType
	 * @generated
	 */
	EClass getAPOSTERIORISEMANTICRELATIONSHIPType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPType#getId()
	 * @see #getAPOSTERIORISEMANTICRELATIONSHIPType()
	 * @generated
	 */
	EAttribute getAPOSTERIORISEMANTICRELATIONSHIPType_Id();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType <em>APOSTERIORIVIEWOF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APOSTERIORIVIEWOF Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType
	 * @generated
	 */
	EClass getAPOSTERIORIVIEWOFType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getItem()
	 * @see #getAPOSTERIORIVIEWOFType()
	 * @generated
	 */
	EReference getAPOSTERIORIVIEWOFType_Item();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getModel()
	 * @see #getAPOSTERIORIVIEWOFType()
	 * @generated
	 */
	EReference getAPOSTERIORIVIEWOFType_Model();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getCorrespondingProperties <em>Corresponding Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corresponding Properties</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getCorrespondingProperties()
	 * @see #getAPOSTERIORIVIEWOFType()
	 * @generated
	 */
	EReference getAPOSTERIORIVIEWOFType_CorrespondingProperties();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType <em>ARRAYTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARRAYTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType
	 * @generated
	 */
	EClass getARRAYTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#getBound1 <em>Bound1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound1</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#getBound1()
	 * @see #getARRAYTYPEType()
	 * @generated
	 */
	EAttribute getARRAYTYPEType_Bound1();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#getBound2 <em>Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#getBound2()
	 * @see #getARRAYTYPEType()
	 * @generated
	 */
	EAttribute getARRAYTYPEType_Bound2();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#getValueType()
	 * @see #getARRAYTYPEType()
	 * @generated
	 */
	EReference getARRAYTYPEType_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#isUniqueness <em>Uniqueness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniqueness</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#isUniqueness()
	 * @see #getARRAYTYPEType()
	 * @generated
	 */
	EAttribute getARRAYTYPEType_Uniqueness();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#isAreOptional <em>Are Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Are Optional</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType#isAreOptional()
	 * @see #getARRAYTYPEType()
	 * @generated
	 */
	EAttribute getARRAYTYPEType_AreOptional();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType <em>ASSIGNEDVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASSIGNEDVALUE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType
	 * @generated
	 */
	EClass getASSIGNEDVALUEType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getStringValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_StringValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bag Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getBagValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_BagValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getBooleanValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getComplexValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getCompositeValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controlled Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getControlledValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getCurrencyValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getDateValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_DateValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getDateTimeValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getFileValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_FileValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getIntegerValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getItemReferenceValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getLocalizedTextValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getMeasureQualifiedNumberValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getMeasureRangeValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getMeasureSingleNumberValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getNullValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_NullValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getRationalValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_RationalValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getRealValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getSequenceValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getSetValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_SetValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getTimeValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_TimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Month Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getYearMonthValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType#getYearValue()
	 * @see #getASSIGNEDVALUEType()
	 * @generated
	 */
	EReference getASSIGNEDVALUEType_YearValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AUTHORSType <em>AUTHORS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AUTHORS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AUTHORSType
	 * @generated
	 */
	EClass getAUTHORSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AUTHORSType#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AUTHORSType#getPerson()
	 * @see #getAUTHORSType()
	 * @generated
	 */
	EReference getAUTHORSType_Person();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS1PLACEMENTTYPEType <em>AXIS1PLACEMENTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AXIS1PLACEMENTTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS1PLACEMENTTYPEType
	 * @generated
	 */
	EClass getAXIS1PLACEMENTTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS1PLACEMENTTYPEType#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS1PLACEMENTTYPEType#getClassRef()
	 * @see #getAXIS1PLACEMENTTYPEType()
	 * @generated
	 */
	EAttribute getAXIS1PLACEMENTTYPEType_ClassRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT2DTYPEType <em>AXIS2PLACEMENT2DTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AXIS2PLACEMENT2DTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT2DTYPEType
	 * @generated
	 */
	EClass getAXIS2PLACEMENT2DTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT2DTYPEType#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT2DTYPEType#getClassRef()
	 * @see #getAXIS2PLACEMENT2DTYPEType()
	 * @generated
	 */
	EAttribute getAXIS2PLACEMENT2DTYPEType_ClassRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT3DTYPEType <em>AXIS2PLACEMENT3DTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AXIS2PLACEMENT3DTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT3DTYPEType
	 * @generated
	 */
	EClass getAXIS2PLACEMENT3DTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT3DTYPEType#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT3DTYPEType#getClassRef()
	 * @see #getAXIS2PLACEMENT3DTYPEType()
	 * @generated
	 */
	EAttribute getAXIS2PLACEMENT3DTYPEType_ClassRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType <em>BAGTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAGTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType
	 * @generated
	 */
	EClass getBAGTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType#getBound1 <em>Bound1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound1</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType#getBound1()
	 * @see #getBAGTYPEType()
	 * @generated
	 */
	EAttribute getBAGTYPEType_Bound1();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType#getBound2 <em>Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType#getBound2()
	 * @see #getBAGTYPEType()
	 * @generated
	 */
	EAttribute getBAGTYPEType_Bound2();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType#getValueType()
	 * @see #getBAGTYPEType()
	 * @generated
	 */
	EReference getBAGTYPEType_ValueType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BOOLEANTYPEType <em>BOOLEANTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOOLEANTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BOOLEANTYPEType
	 * @generated
	 */
	EClass getBOOLEANTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BOOLEANTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BOOLEANTYPEType#getValueFormat()
	 * @see #getBOOLEANTYPEType()
	 * @generated
	 */
	EAttribute getBOOLEANTYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CARDINALITYCONSTRAINTType <em>CARDINALITYCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CARDINALITYCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CARDINALITYCONSTRAINTType
	 * @generated
	 */
	EClass getCARDINALITYCONSTRAINTType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CARDINALITYCONSTRAINTType#getBound1 <em>Bound1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound1</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CARDINALITYCONSTRAINTType#getBound1()
	 * @see #getCARDINALITYCONSTRAINTType()
	 * @generated
	 */
	EAttribute getCARDINALITYCONSTRAINTType_Bound1();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CARDINALITYCONSTRAINTType#getBound2 <em>Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CARDINALITYCONSTRAINTType#getBound2()
	 * @see #getCARDINALITYCONSTRAINTType()
	 * @generated
	 */
	EAttribute getCARDINALITYCONSTRAINTType_Bound2();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CATEGORIZATIONCLASSType <em>CATEGORIZATIONCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CATEGORIZATIONCLASS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CATEGORIZATIONCLASSType
	 * @generated
	 */
	EClass getCATEGORIZATIONCLASSType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CATEGORIZATIONCLASSType#getCategorizationClassSuperclasses <em>Categorization Class Superclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categorization Class Superclasses</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CATEGORIZATIONCLASSType#getCategorizationClassSuperclasses()
	 * @see #getCATEGORIZATIONCLASSType()
	 * @generated
	 */
	EReference getCATEGORIZATIONCLASSType_CategorizationClassSuperclasses();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTANTVALUESType <em>CLASSCONSTANTVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSCONSTANTVALUES Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTANTVALUESType
	 * @generated
	 */
	EClass getCLASSCONSTANTVALUESType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTANTVALUESType#getClassValueAssignment <em>Class Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Value Assignment</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTANTVALUESType#getClassValueAssignment()
	 * @see #getCLASSCONSTANTVALUESType()
	 * @generated
	 */
	EReference getCLASSCONSTANTVALUESType_ClassValueAssignment();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTRAINTType <em>CLASSCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTRAINTType
	 * @generated
	 */
	EClass getCLASSCONSTRAINTType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType <em>CLASSESREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSESREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType
	 * @generated
	 */
	EClass getCLASSESREFERENCEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType#getClass_()
	 * @see #getCLASSESREFERENCEType()
	 * @generated
	 */
	EReference getCLASSESREFERENCEType_Class();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType <em>CLASSEXTENSION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSEXTENSION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType
	 * @generated
	 */
	EClass getCLASSEXTENSIONType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getDictionaryDefinition <em>Dictionary Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getDictionaryDefinition()
	 * @see #getCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getCLASSEXTENSIONType_DictionaryDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getContentVersion <em>Content Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getContentVersion()
	 * @see #getCLASSEXTENSIONType()
	 * @generated
	 */
	EAttribute getCLASSEXTENSIONType_ContentVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getContentRevision <em>Content Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getContentRevision()
	 * @see #getCLASSEXTENSIONType()
	 * @generated
	 */
	EAttribute getCLASSEXTENSIONType_ContentRevision();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getRecommendedPresentation <em>Recommended Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recommended Presentation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getRecommendedPresentation()
	 * @see #getCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getCLASSEXTENSIONType_RecommendedPresentation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getClassification()
	 * @see #getCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getCLASSEXTENSIONType_Classification();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getInstanceIdentification <em>Instance Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance Identification</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getInstanceIdentification()
	 * @see #getCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getCLASSEXTENSIONType_InstanceIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Population</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getPopulation()
	 * @see #getCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getCLASSEXTENSIONType_Population();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#isTableLike <em>Table Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Like</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#isTableLike()
	 * @see #getCLASSEXTENSIONType()
	 * @generated
	 */
	EAttribute getCLASSEXTENSIONType_TableLike();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSIFICATIONType <em>CLASSIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSIFICATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSIFICATIONType
	 * @generated
	 */
	EClass getCLASSIFICATIONType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSIFICATIONType#getPropertyClassification <em>Property Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Classification</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSIFICATIONType#getPropertyClassification()
	 * @see #getCLASSIFICATIONType()
	 * @generated
	 */
	EReference getCLASSIFICATIONType_PropertyClassification();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONPAPERType <em>CLASSPRESENTATIONONPAPER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSPRESENTATIONONPAPER Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONPAPERType
	 * @generated
	 */
	EClass getCLASSPRESENTATIONONPAPERType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONPAPERType#getIllustration <em>Illustration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Illustration</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONPAPERType#getIllustration()
	 * @see #getCLASSPRESENTATIONONPAPERType()
	 * @generated
	 */
	EReference getCLASSPRESENTATIONONPAPERType_Illustration();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONSCREENType <em>CLASSPRESENTATIONONSCREEN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSPRESENTATIONONSCREEN Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONSCREENType
	 * @generated
	 */
	EClass getCLASSPRESENTATIONONSCREENType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONSCREENType#getIllustration <em>Illustration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Illustration</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONSCREENType#getIllustration()
	 * @see #getCLASSPRESENTATIONONSCREENType()
	 * @generated
	 */
	EReference getCLASSPRESENTATIONONSCREENType_Illustration();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType <em>CLASSREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType
	 * @generated
	 */
	EClass getCLASSREFERENCEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType#getClassRef()
	 * @see #getCLASSREFERENCEType()
	 * @generated
	 */
	EAttribute getCLASSREFERENCEType_ClassRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCETYPEType <em>CLASSREFERENCETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSREFERENCETYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCETYPEType
	 * @generated
	 */
	EClass getCLASSREFERENCETYPEType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCETYPEType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCETYPEType#getDomain()
	 * @see #getCLASSREFERENCETYPEType()
	 * @generated
	 */
	EReference getCLASSREFERENCETYPEType_Domain();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType <em>CLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType
	 * @generated
	 */
	EClass getCLASSType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Original Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDateOfOriginalDefinition()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_DateOfOriginalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDateOfCurrentVersion <em>Date Of Current Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDateOfCurrentVersion()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_DateOfCurrentVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDateOfCurrentRevision()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_DateOfCurrentRevision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getRevision()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_Revision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getStatus()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_Status();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getTranslation()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_Translation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getSourceLanguage <em>Source Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Language</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getSourceLanguage()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_SourceLanguage();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#isIsDeprecated <em>Is Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deprecated</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#isIsDeprecated()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_IsDeprecated();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Deprecated Interpretation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getIsDeprecatedInterpretation()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_IsDeprecatedInterpretation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getPreferredName <em>Preferred Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getPreferredName()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_PreferredName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getSynonymousNames <em>Synonymous Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonymous Names</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getSynonymousNames()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_SynonymousNames();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getShortName()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getIcon()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDefinition()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getSourceDocOfDefinition <em>Source Doc Of Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Doc Of Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getSourceDocOfDefinition()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_SourceDocOfDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getNote()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_Note();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getRemark()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_Remark();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getItsSuperclass <em>Its Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its Superclass</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getItsSuperclass()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_ItsSuperclass();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Described By</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDescribedBy()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_DescribedBy();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDefinedTypes <em>Defined Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defined Types</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDefinedTypes()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_DefinedTypes();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDefinedDocuments <em>Defined Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defined Documents</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getDefinedDocuments()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_DefinedDocuments();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getConstraints()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getHierarchicalPosition <em>Hierarchical Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchical Position</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getHierarchicalPosition()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_HierarchicalPosition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keywords</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getKeywords()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_Keywords();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getSubClassProperties <em>Sub Class Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Class Properties</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getSubClassProperties()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_SubClassProperties();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getClassConstantValues <em>Class Constant Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Constant Values</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getClassConstantValues()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_ClassConstantValues();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getGeometricRepresentationContext <em>Geometric Representation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometric Representation Context</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getGeometricRepresentationContext()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_GeometricRepresentationContext();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getGlobalUnitContext <em>Global Unit Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Unit Context</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getGlobalUnitContext()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_GlobalUnitContext();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getKeywordReferences <em>Keyword References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword References</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getKeywordReferences()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_KeywordReferences();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getFreeRelations <em>Free Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Free Relations</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getFreeRelations()
	 * @see #getCLASSType()
	 * @generated
	 */
	EReference getCLASSType_FreeRelations();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getGuid()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_Guid();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getGuid2 <em>Guid2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getGuid2()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_Guid2();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType#getId()
	 * @see #getCLASSType()
	 * @generated
	 */
	EAttribute getCLASSType_Id();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType <em>CLASSVALUEASSIGNMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLASSVALUEASSIGNMENT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType
	 * @generated
	 */
	EClass getCLASSVALUEASSIGNMENTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType#getSuperClassDefinedProperty <em>Super Class Defined Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Class Defined Property</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType#getSuperClassDefinedProperty()
	 * @see #getCLASSVALUEASSIGNMENTType()
	 * @generated
	 */
	EReference getCLASSVALUEASSIGNMENTType_SuperClassDefinedProperty();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType#getAssignedValue <em>Assigned Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType#getAssignedValue()
	 * @see #getCLASSVALUEASSIGNMENTType()
	 * @generated
	 */
	EReference getCLASSVALUEASSIGNMENTType_AssignedValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONDITIONDETType <em>CONDITIONDET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONDITIONDET Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONDITIONDETType
	 * @generated
	 */
	EClass getCONDITIONDETType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType <em>CONFIGURATIONCONTROLCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONFIGURATIONCONTROLCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType
	 * @generated
	 */
	EClass getCONFIGURATIONCONTROLCONSTRAINTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType#getPrecondition()
	 * @see #getCONFIGURATIONCONTROLCONSTRAINTType()
	 * @generated
	 */
	EReference getCONFIGURATIONCONTROLCONSTRAINTType_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcondition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType#getPostcondition()
	 * @see #getCONFIGURATIONCONTROLCONSTRAINTType()
	 * @generated
	 */
	EReference getCONFIGURATIONCONTROLCONSTRAINTType_Postcondition();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType <em>CONSTRAINTORCONSTRAINTID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONSTRAINTORCONSTRAINTID Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType
	 * @generated
	 */
	EClass getCONSTRAINTORCONSTRAINTIDType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType#getConstraintDefinition <em>Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType#getConstraintDefinition()
	 * @see #getCONSTRAINTORCONSTRAINTIDType()
	 * @generated
	 */
	EReference getCONSTRAINTORCONSTRAINTIDType_ConstraintDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType#getConstraintRef <em>Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType#getConstraintRef()
	 * @see #getCONSTRAINTORCONSTRAINTIDType()
	 * @generated
	 */
	EAttribute getCONSTRAINTORCONSTRAINTIDType_ConstraintRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType <em>CONSTRAINTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONSTRAINTS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType
	 * @generated
	 */
	EClass getCONSTRAINTSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType#getConstraint()
	 * @see #getCONSTRAINTSType()
	 * @generated
	 */
	EReference getCONSTRAINTSType_Constraint();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType <em>CONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType
	 * @generated
	 */
	EClass getCONSTRAINTType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType#getConstraintId <em>Constraint Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType#getConstraintId()
	 * @see #getCONSTRAINTType()
	 * @generated
	 */
	EAttribute getCONSTRAINTType_ConstraintId();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSESType <em>CONTAINEDCLASSES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDCLASSES Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSESType
	 * @generated
	 */
	EClass getCONTAINEDCLASSESType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSESType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSESType#getClass_()
	 * @see #getCONTAINEDCLASSESType()
	 * @generated
	 */
	EReference getCONTAINEDCLASSESType_Class();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType <em>CONTAINEDCLASSEXTENSIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDCLASSEXTENSIONS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType
	 * @generated
	 */
	EClass getCONTAINEDCLASSEXTENSIONSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType#getClassExtension <em>Class Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Extension</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType#getClassExtension()
	 * @see #getCONTAINEDCLASSEXTENSIONSType()
	 * @generated
	 */
	EReference getCONTAINEDCLASSEXTENSIONSType_ClassExtension();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDATATYPESType <em>CONTAINEDDATATYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDDATATYPES Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDATATYPESType
	 * @generated
	 */
	EClass getCONTAINEDDATATYPESType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDATATYPESType#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDATATYPESType#getDatatype()
	 * @see #getCONTAINEDDATATYPESType()
	 * @generated
	 */
	EReference getCONTAINEDDATATYPESType_Datatype();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDOCUMENTSType <em>CONTAINEDDOCUMENTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDDOCUMENTS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDOCUMENTSType
	 * @generated
	 */
	EClass getCONTAINEDDOCUMENTSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDOCUMENTSType#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDOCUMENTSType#getDocument()
	 * @see #getCONTAINEDDOCUMENTSType()
	 * @generated
	 */
	EReference getCONTAINEDDOCUMENTSType_Document();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDKEYWORDSType <em>CONTAINEDKEYWORDS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDKEYWORDS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDKEYWORDSType
	 * @generated
	 */
	EClass getCONTAINEDKEYWORDSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDKEYWORDSType#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyword</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDKEYWORDSType#getKeyword()
	 * @see #getCONTAINEDKEYWORDSType()
	 * @generated
	 */
	EReference getCONTAINEDKEYWORDSType_Keyword();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDPROPERTIESType <em>CONTAINEDPROPERTIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDPROPERTIES Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDPROPERTIESType
	 * @generated
	 */
	EClass getCONTAINEDPROPERTIESType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDPROPERTIESType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDPROPERTIESType#getProperty()
	 * @see #getCONTAINEDPROPERTIESType()
	 * @generated
	 */
	EReference getCONTAINEDPROPERTIESType_Property();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSUPPLIERSType <em>CONTAINEDSUPPLIERS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDSUPPLIERS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSUPPLIERSType
	 * @generated
	 */
	EClass getCONTAINEDSUPPLIERSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSUPPLIERSType#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplier</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSUPPLIERSType#getSupplier()
	 * @see #getCONTAINEDSUPPLIERSType()
	 * @generated
	 */
	EReference getCONTAINEDSUPPLIERSType_Supplier();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSYNONYMSType <em>CONTAINEDSYNONYMS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTAINEDSYNONYMS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSYNONYMSType
	 * @generated
	 */
	EClass getCONTAINEDSYNONYMSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSYNONYMSType#getSynonym <em>Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synonym</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSYNONYMSType#getSynonym()
	 * @see #getCONTAINEDSYNONYMSType()
	 * @generated
	 */
	EReference getCONTAINEDSYNONYMSType_Synonym();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTDEPENDENTUNITType <em>CONTEXTDEPENDENTUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTEXTDEPENDENTUNIT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTDEPENDENTUNITType
	 * @generated
	 */
	EClass getCONTEXTDEPENDENTUNITType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTDEPENDENTUNITType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTDEPENDENTUNITType#getName()
	 * @see #getCONTEXTDEPENDENTUNITType()
	 * @generated
	 */
	EAttribute getCONTEXTDEPENDENTUNITType_Name();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMETERCONSTRAINTSType <em>CONTEXTPARAMETERCONSTRAINTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTEXTPARAMETERCONSTRAINTS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMETERCONSTRAINTSType
	 * @generated
	 */
	EClass getCONTEXTPARAMETERCONSTRAINTSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMETERCONSTRAINTSType#getIntegrityConstraint <em>Integrity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integrity Constraint</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMETERCONSTRAINTSType#getIntegrityConstraint()
	 * @see #getCONTEXTPARAMETERCONSTRAINTSType()
	 * @generated
	 */
	EReference getCONTEXTPARAMETERCONSTRAINTSType_IntegrityConstraint();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMICONType <em>CONTEXTPARAMICON Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTEXTPARAMICON Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMICONType
	 * @generated
	 */
	EClass getCONTEXTPARAMICONType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMICONType#getA6Illustration <em>A6 Illustration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A6 Illustration</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMICONType#getA6Illustration()
	 * @see #getCONTEXTPARAMICONType()
	 * @generated
	 */
	EReference getCONTEXTPARAMICONType_A6Illustration();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTRESTRICTIONCONSTRAINTType <em>CONTEXTRESTRICTIONCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONTEXTRESTRICTIONCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTRESTRICTIONCONSTRAINTType
	 * @generated
	 */
	EClass getCONTEXTRESTRICTIONCONSTRAINTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTRESTRICTIONCONSTRAINTType#getContextParameterConstraints <em>Context Parameter Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Parameter Constraints</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTRESTRICTIONCONSTRAINTType#getContextParameterConstraints()
	 * @see #getCONTEXTRESTRICTIONCONSTRAINTType()
	 * @generated
	 */
	EReference getCONTEXTRESTRICTIONCONSTRAINTType_ContextParameterConstraints();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType <em>CONVERSIONBASEDUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CONVERSIONBASEDUNIT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType
	 * @generated
	 */
	EClass getCONVERSIONBASEDUNITType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType#getName()
	 * @see #getCONVERSIONBASEDUNITType()
	 * @generated
	 */
	EAttribute getCONVERSIONBASEDUNITType_Name();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType#getValueComponent <em>Value Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Component</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType#getValueComponent()
	 * @see #getCONVERSIONBASEDUNITType()
	 * @generated
	 */
	EAttribute getCONVERSIONBASEDUNITType_ValueComponent();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType#getUnitComponent <em>Unit Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Component</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType#getUnitComponent()
	 * @see #getCONVERSIONBASEDUNITType()
	 * @generated
	 */
	EReference getCONVERSIONBASEDUNITType_UnitComponent();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CORRESPONDINGPROPERTIESType <em>CORRESPONDINGPROPERTIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORRESPONDINGPROPERTIES Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CORRESPONDINGPROPERTIESType
	 * @generated
	 */
	EClass getCORRESPONDINGPROPERTIESType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CORRESPONDINGPROPERTIESType#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CORRESPONDINGPROPERTIESType#getMapping()
	 * @see #getCORRESPONDINGPROPERTIESType()
	 * @generated
	 */
	EReference getCORRESPONDINGPROPERTIESType_Mapping();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CREATEICONType <em>CREATEICON Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CREATEICON Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CREATEICONType
	 * @generated
	 */
	EClass getCREATEICONType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CREATEICONType#getIllustration <em>Illustration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Illustration</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CREATEICONType#getIllustration()
	 * @see #getCREATEICONType()
	 * @generated
	 */
	EReference getCREATEICONType_Illustration();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType <em>DATATYPEREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType
	 * @generated
	 */
	EClass getDATATYPEREFERENCEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType#getDatatypeRef <em>Datatype Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType#getDatatypeRef()
	 * @see #getDATATYPEREFERENCEType()
	 * @generated
	 */
	EAttribute getDATATYPEREFERENCEType_DatatypeRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType <em>DATATYPESREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPESREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType
	 * @generated
	 */
	EClass getDATATYPESREFERENCEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType#getDatatype()
	 * @see #getDATATYPESREFERENCEType()
	 * @generated
	 */
	EReference getDATATYPESREFERENCEType_Datatype();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType <em>DATATYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType
	 * @generated
	 */
	EClass getDATATYPEType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getNameScope <em>Name Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Scope</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getNameScope()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EReference getDATATYPEType_NameScope();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Original Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfOriginalDefinition()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_DateOfOriginalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfCurrentVersion <em>Date Of Current Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfCurrentVersion()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_DateOfCurrentVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfCurrentRevision()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_DateOfCurrentRevision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getRevision()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_Revision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getStatus()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_Status();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getTranslation()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EReference getDATATYPEType_Translation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getSourceLanguage <em>Source Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Language</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getSourceLanguage()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EReference getDATATYPEType_SourceLanguage();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#isIsDeprecated <em>Is Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deprecated</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#isIsDeprecated()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_IsDeprecated();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Deprecated Interpretation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getIsDeprecatedInterpretation()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EReference getDATATYPEType_IsDeprecatedInterpretation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getPreferredName <em>Preferred Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getPreferredName()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EReference getDATATYPEType_PreferredName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getSynonymousNames <em>Synonymous Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonymous Names</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getSynonymousNames()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EReference getDATATYPEType_SynonymousNames();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getShortName()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EReference getDATATYPEType_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getIcon()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EReference getDATATYPEType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getTypeDefinition()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EReference getDATATYPEType_TypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Specification</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getValueSpecification()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_ValueSpecification();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getGuid()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_Guid();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getGuid2 <em>Guid2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getGuid2()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_Guid2();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getId()
	 * @see #getDATATYPEType()
	 * @generated
	 */
	EAttribute getDATATYPEType_Id();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATEDATATYPEType <em>DATEDATATYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATEDATATYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATEDATATYPEType
	 * @generated
	 */
	EClass getDATEDATATYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATEDATATYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATEDATATYPEType#getValueFormat()
	 * @see #getDATEDATATYPEType()
	 * @generated
	 */
	EAttribute getDATEDATATYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETIMEDATATYPEType <em>DATETIMEDATATYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATETIMEDATATYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETIMEDATATYPEType
	 * @generated
	 */
	EClass getDATETIMEDATATYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETIMEDATATYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETIMEDATATYPEType#getValueFormat()
	 * @see #getDATETIMEDATATYPEType()
	 * @generated
	 */
	EAttribute getDATETIMEDATATYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DEPENDENTPDETType <em>DEPENDENTPDET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEPENDENTPDET Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DEPENDENTPDETType
	 * @generated
	 */
	EClass getDEPENDENTPDETType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DEPENDENTPDETType#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depends On</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DEPENDENTPDETType#getDependsOn()
	 * @see #getDEPENDENTPDETType()
	 * @generated
	 */
	EReference getDEPENDENTPDETType_DependsOn();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType <em>DERIVEDUNITELEMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DERIVEDUNITELEMENT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType
	 * @generated
	 */
	EClass getDERIVEDUNITELEMENTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType#getUnit()
	 * @see #getDERIVEDUNITELEMENTType()
	 * @generated
	 */
	EReference getDERIVEDUNITELEMENTType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType#getExponent()
	 * @see #getDERIVEDUNITELEMENTType()
	 * @generated
	 */
	EAttribute getDERIVEDUNITELEMENTType_Exponent();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITType <em>DERIVEDUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DERIVEDUNIT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITType
	 * @generated
	 */
	EClass getDERIVEDUNITType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITType#getDerivedUnitElement <em>Derived Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived Unit Element</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITType#getDerivedUnitElement()
	 * @see #getDERIVEDUNITType()
	 * @generated
	 */
	EReference getDERIVEDUNITType_DerivedUnitElement();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARIESREFERENCEType <em>DICTIONARIESREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DICTIONARIESREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARIESREFERENCEType
	 * @generated
	 */
	EClass getDICTIONARIESREFERENCEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARIESREFERENCEType#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dictionary</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARIESREFERENCEType#getDictionary()
	 * @see #getDICTIONARIESREFERENCEType()
	 * @generated
	 */
	EReference getDICTIONARIESREFERENCEType_Dictionary();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYINSTANDARDFORMATType <em>DICTIONARYINSTANDARDFORMAT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DICTIONARYINSTANDARDFORMAT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYINSTANDARDFORMATType
	 * @generated
	 */
	EClass getDICTIONARYINSTANDARDFORMATType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType <em>DICTIONARYREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DICTIONARYREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType
	 * @generated
	 */
	EClass getDICTIONARYREFERENCEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType#getDictionaryRef <em>Dictionary Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dictionary Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType#getDictionaryRef()
	 * @see #getDICTIONARYREFERENCEType()
	 * @generated
	 */
	EAttribute getDICTIONARYREFERENCEType_DictionaryRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType <em>DICTIONARY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DICTIONARY Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType
	 * @generated
	 */
	EClass getDICTIONARYType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#isIsComplete <em>Is Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Complete</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#isIsComplete()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EAttribute getDICTIONARYType_IsComplete();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getUpdates <em>Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updates</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getUpdates()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_Updates();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getUpdateAgreement <em>Update Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Agreement</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getUpdateAgreement()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EAttribute getDICTIONARYType_UpdateAgreement();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getReferencedDictionaries <em>Referenced Dictionaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Dictionaries</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getReferencedDictionaries()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_ReferencedDictionaries();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getResponsibleSupplier <em>Responsible Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible Supplier</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getResponsibleSupplier()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_ResponsibleSupplier();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedClasses <em>Contained Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Classes</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedClasses()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_ContainedClasses();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getAPosterioriSemanticRelationships <em>APosteriori Semantic Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>APosteriori Semantic Relationships</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getAPosterioriSemanticRelationships()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_APosterioriSemanticRelationships();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedSuppliers <em>Contained Suppliers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Suppliers</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedSuppliers()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_ContainedSuppliers();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedProperties <em>Contained Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Properties</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedProperties()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_ContainedProperties();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedDocuments <em>Contained Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Documents</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedDocuments()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_ContainedDocuments();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedDatatypes <em>Contained Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Datatypes</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedDatatypes()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_ContainedDatatypes();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedKeywords <em>Contained Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Keywords</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedKeywords()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_ContainedKeywords();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedSynonyms <em>Contained Synonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Synonyms</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedSynonyms()
	 * @see #getDICTIONARYType()
	 * @generated
	 */
	EReference getDICTIONARYType_ContainedSynonyms();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType <em>DICUNITREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DICUNITREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType
	 * @generated
	 */
	EClass getDICUNITREFERENCEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType#getDicUnitRef <em>Dic Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dic Unit Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType#getDicUnitRef()
	 * @see #getDICUNITREFERENCEType()
	 * @generated
	 */
	EAttribute getDICUNITREFERENCEType_DicUnitRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITSREFERENCEType <em>DICUNITSREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DICUNITSREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITSREFERENCEType
	 * @generated
	 */
	EClass getDICUNITSREFERENCEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITSREFERENCEType#getDicUnit <em>Dic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dic Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITSREFERENCEType#getDicUnit()
	 * @see #getDICUNITSREFERENCEType()
	 * @generated
	 */
	EReference getDICUNITSREFERENCEType_DicUnit();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType <em>DICUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DICUNIT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType
	 * @generated
	 */
	EClass getDICUNITType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getStructuredRepresentation <em>Structured Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Representation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getStructuredRepresentation()
	 * @see #getDICUNITType()
	 * @generated
	 */
	EReference getDICUNITType_StructuredRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getStringRepresentation <em>String Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Representation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getStringRepresentation()
	 * @see #getDICUNITType()
	 * @generated
	 */
	EReference getDICUNITType_StringRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getUnitRef <em>Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getUnitRef()
	 * @see #getDICUNITType()
	 * @generated
	 */
	EAttribute getDICUNITType_UnitRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType <em>DICVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DICVALUE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType
	 * @generated
	 */
	EClass getDICVALUEType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getPreferredName <em>Preferred Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getPreferredName()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EReference getDICVALUEType_PreferredName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getSynonymousNames <em>Synonymous Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonymous Names</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getSynonymousNames()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EReference getDICVALUEType_SynonymousNames();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getShortName()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EReference getDICVALUEType_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getIcon()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EReference getDICVALUEType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getSourceDocOfDefinition <em>Source Doc Of Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Doc Of Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getSourceDocOfDefinition()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EReference getDICVALUEType_SourceDocOfDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getDefinition()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EReference getDICVALUEType_Definition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getStatus()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EAttribute getDICVALUEType_Status();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#isIsDeprecated <em>Is Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deprecated</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#isIsDeprecated()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EAttribute getDICVALUEType_IsDeprecated();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Deprecated Interpretation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getIsDeprecatedInterpretation()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EReference getDICVALUEType_IsDeprecatedInterpretation();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Specification</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getValueSpecification()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EAttribute getDICVALUEType_ValueSpecification();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Original Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getDateOfOriginalDefinition()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EAttribute getDICVALUEType_DateOfOriginalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getDateOfCurrentVersion <em>Date Of Current Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getDateOfCurrentVersion()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EAttribute getDICVALUEType_DateOfCurrentVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getDateOfCurrentRevision()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EAttribute getDICVALUEType_DateOfCurrentRevision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getGuid()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EAttribute getDICVALUEType_Guid();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getGuid2 <em>Guid2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getGuid2()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EAttribute getDICVALUEType_Guid2();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getValueMeaningId <em>Value Meaning Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Meaning Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType#getValueMeaningId()
	 * @see #getDICVALUEType()
	 * @generated
	 */
	EAttribute getDICVALUEType_ValueMeaningId();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType <em>DIMENSIONALEXPONENTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIMENSIONALEXPONENTS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType
	 * @generated
	 */
	EClass getDIMENSIONALEXPONENTSType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getLengthExponent <em>Length Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length Exponent</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getLengthExponent()
	 * @see #getDIMENSIONALEXPONENTSType()
	 * @generated
	 */
	EAttribute getDIMENSIONALEXPONENTSType_LengthExponent();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getMassExponent <em>Mass Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass Exponent</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getMassExponent()
	 * @see #getDIMENSIONALEXPONENTSType()
	 * @generated
	 */
	EAttribute getDIMENSIONALEXPONENTSType_MassExponent();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getTimeExponent <em>Time Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Exponent</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getTimeExponent()
	 * @see #getDIMENSIONALEXPONENTSType()
	 * @generated
	 */
	EAttribute getDIMENSIONALEXPONENTSType_TimeExponent();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getElectricCurrentExponent <em>Electric Current Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Electric Current Exponent</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getElectricCurrentExponent()
	 * @see #getDIMENSIONALEXPONENTSType()
	 * @generated
	 */
	EAttribute getDIMENSIONALEXPONENTSType_ElectricCurrentExponent();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thermodynamic Temperature Exponent</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getThermodynamicTemperatureExponent()
	 * @see #getDIMENSIONALEXPONENTSType()
	 * @generated
	 */
	EAttribute getDIMENSIONALEXPONENTSType_ThermodynamicTemperatureExponent();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Substance Exponent</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getAmountOfSubstanceExponent()
	 * @see #getDIMENSIONALEXPONENTSType()
	 * @generated
	 */
	EAttribute getDIMENSIONALEXPONENTSType_AmountOfSubstanceExponent();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luminous Intensity Exponent</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType#getLuminousIntensityExponent()
	 * @see #getDIMENSIONALEXPONENTSType()
	 * @generated
	 */
	EAttribute getDIMENSIONALEXPONENTSType_LuminousIntensityExponent();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTCONTENTType <em>DOCUMENTCONTENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOCUMENTCONTENT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTCONTENTType
	 * @generated
	 */
	EClass getDOCUMENTCONTENTType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTCONTENTType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTCONTENTType#getRevision()
	 * @see #getDOCUMENTCONTENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTCONTENTType_Revision();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType <em>DOCUMENTIDENTIFIERNAMELABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOCUMENTIDENTIFIERNAMELABEL Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType
	 * @generated
	 */
	EClass getDOCUMENTIDENTIFIERNAMELABELType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType#getValue()
	 * @see #getDOCUMENTIDENTIFIERNAMELABELType()
	 * @generated
	 */
	EAttribute getDOCUMENTIDENTIFIERNAMELABELType_Value();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType#getCountryCode()
	 * @see #getDOCUMENTIDENTIFIERNAMELABELType()
	 * @generated
	 */
	EAttribute getDOCUMENTIDENTIFIERNAMELABELType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType#getLanguageCode()
	 * @see #getDOCUMENTIDENTIFIERNAMELABELType()
	 * @generated
	 */
	EAttribute getDOCUMENTIDENTIFIERNAMELABELType_LanguageCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERType <em>DOCUMENTIDENTIFIER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOCUMENTIDENTIFIER Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERType
	 * @generated
	 */
	EClass getDOCUMENTIDENTIFIERType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERType#getLabel()
	 * @see #getDOCUMENTIDENTIFIERType()
	 * @generated
	 */
	EReference getDOCUMENTIDENTIFIERType_Label();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType <em>DOCUMENTREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOCUMENTREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType
	 * @generated
	 */
	EClass getDOCUMENTREFERENCEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType#getDocumentRef <em>Document Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType#getDocumentRef()
	 * @see #getDOCUMENTREFERENCEType()
	 * @generated
	 */
	EAttribute getDOCUMENTREFERENCEType_DocumentRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getAPosterioriSemanticRelationship <em>APosteriori Semantic Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>APosteriori Semantic Relationship</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getAPosterioriSemanticRelationship()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_APosterioriSemanticRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getClass_()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Class();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getDatatype()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Datatype();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getDicUnit <em>Dic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dic Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getDicUnit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DicUnit();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getDicValue <em>Dic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dic Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getDicValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DicValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Document();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getKeyword()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Keyword();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getOntoml <em>Ontoml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ontoml</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getOntoml()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ontoml();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplier</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getSupplier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Supplier();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getSynonym <em>Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonym</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot#getSynonym()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Synonym();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType <em>DOCUMENTSREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOCUMENTSREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType
	 * @generated
	 */
	EClass getDOCUMENTSREFERENCEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType#getDocument()
	 * @see #getDOCUMENTSREFERENCEType()
	 * @generated
	 */
	EReference getDOCUMENTSREFERENCEType_Document();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType <em>DOCUMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOCUMENT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType
	 * @generated
	 */
	EClass getDOCUMENTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getNameScope <em>Name Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Scope</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getNameScope()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_NameScope();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Original Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfOriginalDefinition()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTType_DateOfOriginalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfCurrentVersion <em>Date Of Current Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfCurrentVersion()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTType_DateOfCurrentVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfCurrentRevision()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTType_DateOfCurrentRevision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getRevision()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTType_Revision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getStatus()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTType_Status();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getTranslation()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_Translation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getSourceLanguage <em>Source Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Language</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getSourceLanguage()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_SourceLanguage();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#isIsDeprecated <em>Is Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deprecated</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#isIsDeprecated()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTType_IsDeprecated();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Deprecated Interpretation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getIsDeprecatedInterpretation()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_IsDeprecatedInterpretation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getPreferredName <em>Preferred Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getPreferredName()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_PreferredName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getSynonymousNames <em>Synonymous Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonymous Names</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getSynonymousNames()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_SynonymousNames();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getShortName()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getIcon()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDefinition()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getNote()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_Note();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getRemark()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_Remark();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authors</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getAuthors()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_Authors();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getPublishingOrganisation <em>Publishing Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publishing Organisation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getPublishingOrganisation()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_PublishingOrganisation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getContent()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EReference getDOCUMENTType_Content();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getGuid()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTType_Guid();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getGuid2 <em>Guid2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getGuid2()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTType_Guid2();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getId()
	 * @see #getDOCUMENTType()
	 * @generated
	 */
	EAttribute getDOCUMENTType_Id();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTSType <em>DOMAINCONSTRAINTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOMAINCONSTRAINTS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTSType
	 * @generated
	 */
	EClass getDOMAINCONSTRAINTSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTSType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTSType#getConstraint()
	 * @see #getDOMAINCONSTRAINTSType()
	 * @generated
	 */
	EReference getDOMAINCONSTRAINTSType_Constraint();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTType <em>DOMAINCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOMAINCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTType
	 * @generated
	 */
	EClass getDOMAINCONSTRAINTType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType <em>ENUMERATIONCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENUMERATIONCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType
	 * @generated
	 */
	EClass getENUMERATIONCONSTRAINTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType#getSubset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subset</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType#getSubset()
	 * @see #getENUMERATIONCONSTRAINTType()
	 * @generated
	 */
	EReference getENUMERATIONCONSTRAINTType_Subset();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType#getValueMeaning <em>Value Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Meaning</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType#getValueMeaning()
	 * @see #getENUMERATIONCONSTRAINTType()
	 * @generated
	 */
	EReference getENUMERATIONCONSTRAINTType_ValueMeaning();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType <em>EXPLICITFUNCTIONALMODELCLASSEXTENSION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EXPLICITFUNCTIONALMODELCLASSEXTENSION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType
	 * @generated
	 */
	EClass getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getRequiredItemValues <em>Required Item Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Item Values</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getRequiredItemValues()
	 * @see #getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_RequiredItemValues();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getAvailableViewsIcon <em>Available Views Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Available Views Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getAvailableViewsIcon()
	 * @see #getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_AvailableViewsIcon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getAvailableViewsMsg <em>Available Views Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Available Views Msg</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getAvailableViewsMsg()
	 * @see #getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_AvailableViewsMsg();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getContextParamIcon <em>Context Param Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Param Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getContextParamIcon()
	 * @see #getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_ContextParamIcon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getContextParamMsg <em>Context Param Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Param Msg</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType#getContextParamMsg()
	 * @see #getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_ContextParamMsg();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType <em>EXPLICITITEMCLASSEXTENSION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EXPLICITITEMCLASSEXTENSION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType
	 * @generated
	 */
	EClass getEXPLICITITEMCLASSEXTENSIONType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getAccessIcon <em>Access Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getAccessIcon()
	 * @see #getEXPLICITITEMCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITITEMCLASSEXTENSIONType_AccessIcon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getContentMsg <em>Content Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Msg</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getContentMsg()
	 * @see #getEXPLICITITEMCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITITEMCLASSEXTENSIONType_ContentMsg();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getCreateIcon <em>Create Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getCreateIcon()
	 * @see #getEXPLICITITEMCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITITEMCLASSEXTENSIONType_CreateIcon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getCreateMsg <em>Create Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Msg</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getCreateMsg()
	 * @see #getEXPLICITITEMCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITITEMCLASSEXTENSIONType_CreateMsg();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getClassPresentationOnPaper <em>Class Presentation On Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Presentation On Paper</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getClassPresentationOnPaper()
	 * @see #getEXPLICITITEMCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITITEMCLASSEXTENSIONType_ClassPresentationOnPaper();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getClassPresentationOnScreen <em>Class Presentation On Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Presentation On Screen</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType#getClassPresentationOnScreen()
	 * @see #getEXPLICITITEMCLASSEXTENSIONType()
	 * @generated
	 */
	EReference getEXPLICITITEMCLASSEXTENSIONType_ClassPresentationOnScreen();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALFILESType <em>EXTERNALFILES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EXTERNALFILES Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALFILESType
	 * @generated
	 */
	EClass getEXTERNALFILESType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALGRAPHICSType <em>EXTERNALGRAPHICS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EXTERNALGRAPHICS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALGRAPHICSType
	 * @generated
	 */
	EClass getEXTERNALGRAPHICSType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALGRAPHICSType#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Representation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALGRAPHICSType#getRepresentation()
	 * @see #getEXTERNALGRAPHICSType()
	 * @generated
	 */
	EReference getEXTERNALGRAPHICSType_Representation();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALRESOURCEType <em>EXTERNALRESOURCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EXTERNALRESOURCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALRESOURCEType
	 * @generated
	 */
	EClass getEXTERNALRESOURCEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALRESOURCEType#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALRESOURCEType#getFile()
	 * @see #getEXTERNALRESOURCEType()
	 * @generated
	 */
	EReference getEXTERNALRESOURCEType_File();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType <em>FILTER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FILTER Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType
	 * @generated
	 */
	EClass getFILTERType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType#getReferencedProperty <em>Referenced Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Property</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType#getReferencedProperty()
	 * @see #getFILTERType()
	 * @generated
	 */
	EReference getFILTERType_ReferencedProperty();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType#getDomain()
	 * @see #getFILTERType()
	 * @generated
	 */
	EReference getFILTERType_Domain();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType <em>FMCLASSVIEWOF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMCLASSVIEWOF Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType
	 * @generated
	 */
	EClass getFMCLASSVIEWOFType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getCreatedView <em>Created View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getCreatedView()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_CreatedView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getVCVRange <em>VCV Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VCV Range</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getVCVRange()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_VCVRange();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromView <em>Imported Properties From View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Properties From View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromView()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedPropertiesFromView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromView <em>Imported Types From View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Types From View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromView()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedTypesFromView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromView <em>Imported Documents From View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Documents From View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromView()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedDocumentsFromView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromView <em>Imported Constraints From View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Constraints From View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromView()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedConstraintsFromView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getCaseOf <em>Case Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Of</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getCaseOf()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_CaseOf();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromModels <em>Imported Properties From Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Properties From Models</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromModels()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedPropertiesFromModels();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromModels <em>Imported Types From Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Types From Models</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromModels()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedTypesFromModels();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromModels <em>Imported Documents From Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Documents From Models</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromModels()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedDocumentsFromModels();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromModels <em>Imported Constraints From Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Constraints From Models</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromModels()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedConstraintsFromModels();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getViewOf <em>View Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Of</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getViewOf()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ViewOf();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromItem <em>Imported Properties From Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Properties From Item</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromItem()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedPropertiesFromItem();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromItem <em>Imported Types From Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Types From Item</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromItem()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedTypesFromItem();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromItem <em>Imported Documents From Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Documents From Item</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromItem()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedDocumentsFromItem();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromItem <em>Imported Constraints From Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Constraints From Item</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromItem()
	 * @see #getFMCLASSVIEWOFType()
	 * @generated
	 */
	EReference getFMCLASSVIEWOFType_ImportedConstraintsFromItem();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONDEFINITIONREFType <em>FREERELATIONDEFINITIONREF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FREERELATIONDEFINITIONREF Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONDEFINITIONREFType
	 * @generated
	 */
	EClass getFREERELATIONDEFINITIONREFType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONDEFINITIONREFType#getDefintionRef <em>Defintion Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defintion Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONDEFINITIONREFType#getDefintionRef()
	 * @see #getFREERELATIONDEFINITIONREFType()
	 * @generated
	 */
	EAttribute getFREERELATIONDEFINITIONREFType_DefintionRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONENDREFType <em>FREERELATIONENDREF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FREERELATIONENDREF Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONENDREFType
	 * @generated
	 */
	EClass getFREERELATIONENDREFType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONENDREFType#getElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONENDREFType#getElementRef()
	 * @see #getFREERELATIONENDREFType()
	 * @generated
	 */
	EAttribute getFREERELATIONENDREFType_ElementRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONSType <em>FREERELATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FREERELATIONS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONSType
	 * @generated
	 */
	EClass getFREERELATIONSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONSType#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONSType#getRelation()
	 * @see #getFREERELATIONSType()
	 * @generated
	 */
	EReference getFREERELATIONSType_Relation();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONType <em>FREERELATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FREERELATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONType
	 * @generated
	 */
	EClass getFREERELATIONType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONType#getDefinition()
	 * @see #getFREERELATIONType()
	 * @generated
	 */
	EReference getFREERELATIONType_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONType#getEnd()
	 * @see #getFREERELATIONType()
	 * @generated
	 */
	EReference getFREERELATIONType_End();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType <em>FUNCTIONALMODELCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FUNCTIONALMODELCLASS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType
	 * @generated
	 */
	EClass getFUNCTIONALMODELCLASSType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getCreatedView <em>Created View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getCreatedView()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_CreatedView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getVCVRange <em>VCV Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VCV Range</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getVCVRange()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_VCVRange();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedPropertiesFromView <em>Imported Properties From View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Properties From View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedPropertiesFromView()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_ImportedPropertiesFromView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedTypesFromView <em>Imported Types From View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Types From View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedTypesFromView()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_ImportedTypesFromView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedDocumentsFromView <em>Imported Documents From View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Documents From View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedDocumentsFromView()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_ImportedDocumentsFromView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedCosntraintsFromView <em>Imported Cosntraints From View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Cosntraints From View</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedCosntraintsFromView()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_ImportedCosntraintsFromView();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getCaseOf <em>Case Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Of</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getCaseOf()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_CaseOf();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedPropertiesFromModels <em>Imported Properties From Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Properties From Models</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedPropertiesFromModels()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_ImportedPropertiesFromModels();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedTypesFromModels <em>Imported Types From Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Types From Models</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedTypesFromModels()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_ImportedTypesFromModels();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedDocumentsFromModels <em>Imported Documents From Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Documents From Models</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedDocumentsFromModels()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_ImportedDocumentsFromModels();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedConstraintsFromModels <em>Imported Constraints From Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Constraints From Models</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedConstraintsFromModels()
	 * @see #getFUNCTIONALMODELCLASSType()
	 * @generated
	 */
	EReference getFUNCTIONALMODELCLASSType_ImportedConstraintsFromModels();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType <em>GENERALTEXT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GENERALTEXT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType
	 * @generated
	 */
	EClass getGENERALTEXTType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType#getValue()
	 * @see #getGENERALTEXTType()
	 * @generated
	 */
	EAttribute getGENERALTEXTType_Value();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType#getCountryCode()
	 * @see #getGENERALTEXTType()
	 * @generated
	 */
	EAttribute getGENERALTEXTType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType#getLanguageCode()
	 * @see #getGENERALTEXTType()
	 * @generated
	 */
	EAttribute getGENERALTEXTType_LanguageCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType <em>GEOMETRICCONTEXT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEOMETRICCONTEXT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType
	 * @generated
	 */
	EClass getGEOMETRICCONTEXTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType#getDescription()
	 * @see #getGEOMETRICCONTEXTType()
	 * @generated
	 */
	EReference getGEOMETRICCONTEXTType_Description();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType#getCoordinateSoaceDimension <em>Coordinate Soace Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate Soace Dimension</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType#getCoordinateSoaceDimension()
	 * @see #getGEOMETRICCONTEXTType()
	 * @generated
	 */
	EAttribute getGEOMETRICCONTEXTType_CoordinateSoaceDimension();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType <em>GEOMETRICUNITCONTEXT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEOMETRICUNITCONTEXT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType
	 * @generated
	 */
	EClass getGEOMETRICUNITCONTEXTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLengthUnit()
	 * @see #getGEOMETRICUNITCONTEXTType()
	 * @generated
	 */
	EReference getGEOMETRICUNITCONTEXTType_LengthUnit();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLengthUnitId <em>Length Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length Unit Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLengthUnitId()
	 * @see #getGEOMETRICUNITCONTEXTType()
	 * @generated
	 */
	EReference getGEOMETRICUNITCONTEXTType_LengthUnitId();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLangleUnit <em>Langle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Langle Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLangleUnit()
	 * @see #getGEOMETRICUNITCONTEXTType()
	 * @generated
	 */
	EReference getGEOMETRICUNITCONTEXTType_LangleUnit();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getAngleUnitId <em>Angle Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle Unit Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getAngleUnitId()
	 * @see #getGEOMETRICUNITCONTEXTType()
	 * @generated
	 */
	EReference getGEOMETRICUNITCONTEXTType_AngleUnitId();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType <em>GRAPHICS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRAPHICS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType
	 * @generated
	 */
	EClass getGRAPHICSType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType <em>HEADER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HEADER Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType
	 * @generated
	 */
	EClass getHEADERType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getGlobalLanguage <em>Global Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Language</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getGlobalLanguage()
	 * @see #getHEADERType()
	 * @generated
	 */
	EReference getHEADERType_GlobalLanguage();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getDescription()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_Description();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getVersion()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_Version();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getName()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_Name();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getDateTimeStamp <em>Date Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Stamp</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getDateTimeStamp()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_DateTimeStamp();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Author</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getAuthor()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_Author();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Organisation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getOrganisation()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_Organisation();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getPreProcessorVersion <em>Pre Processor Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Processor Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getPreProcessorVersion()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_PreProcessorVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getOriginatingSystem <em>Originating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originating System</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getOriginatingSystem()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_OriginatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getAuthorisation <em>Authorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorisation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getAuthorisation()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_Authorisation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getOntomlInformation <em>Ontoml Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ontoml Information</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getOntomlInformation()
	 * @see #getHEADERType()
	 * @generated
	 */
	EReference getHEADERType_OntomlInformation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getOntomlStructure <em>Ontoml Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ontoml Structure</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getOntomlStructure()
	 * @see #getHEADERType()
	 * @generated
	 */
	EReference getHEADERType_OntomlStructure();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getSupportedVep <em>Supported Vep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supported Vep</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getSupportedVep()
	 * @see #getHEADERType()
	 * @generated
	 */
	EReference getHEADERType_SupportedVep();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType#getId()
	 * @see #getHEADERType()
	 * @generated
	 */
	EAttribute getHEADERType_Id();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType <em>HTTPFILE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTPFILE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType
	 * @generated
	 */
	EClass getHTTPFILEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getHttpFile <em>Http File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http File</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getHttpFile()
	 * @see #getHTTPFILEType()
	 * @generated
	 */
	EAttribute getHTTPFILEType_HttpFile();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getFileName()
	 * @see #getHTTPFILEType()
	 * @generated
	 */
	EAttribute getHTTPFILEType_FileName();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getDirName <em>Dir Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getDirName()
	 * @see #getHTTPFILEType()
	 * @generated
	 */
	EAttribute getHTTPFILEType_DirName();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getCountryCode()
	 * @see #getHTTPFILEType()
	 * @generated
	 */
	EAttribute getHTTPFILEType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType#getLanguageCode()
	 * @see #getHTTPFILEType()
	 * @generated
	 */
	EAttribute getHTTPFILEType_LanguageCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.IDENTIFIEDDOCUMENTType <em>IDENTIFIEDDOCUMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDENTIFIEDDOCUMENT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.IDENTIFIEDDOCUMENTType
	 * @generated
	 */
	EClass getIDENTIFIEDDOCUMENTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.IDENTIFIEDDOCUMENTType#getDocumentIdentifier <em>Document Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Identifier</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.IDENTIFIEDDOCUMENTType#getDocumentIdentifier()
	 * @see #getIDENTIFIEDDOCUMENTType()
	 * @generated
	 */
	EReference getIDENTIFIEDDOCUMENTType_DocumentIdentifier();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType <em>ILLUSTRATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILLUSTRATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType
	 * @generated
	 */
	EClass getILLUSTRATIONType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getCode()
	 * @see #getILLUSTRATIONType()
	 * @generated
	 */
	EAttribute getILLUSTRATIONType_Code();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getKindOfContent <em>Kind Of Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Of Content</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getKindOfContent()
	 * @see #getILLUSTRATIONType()
	 * @generated
	 */
	EAttribute getILLUSTRATIONType_KindOfContent();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getWidth()
	 * @see #getILLUSTRATIONType()
	 * @generated
	 */
	EAttribute getILLUSTRATIONType_Width();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getHeight()
	 * @see #getILLUSTRATIONType()
	 * @generated
	 */
	EAttribute getILLUSTRATIONType_Height();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getStandardSize <em>Standard Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Size</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getStandardSize()
	 * @see #getILLUSTRATIONType()
	 * @generated
	 */
	EAttribute getILLUSTRATIONType_StandardSize();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType <em>INFORMATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INFORMATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType
	 * @generated
	 */
	EClass getINFORMATIONType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getRevision()
	 * @see #getINFORMATIONType()
	 * @generated
	 */
	EAttribute getINFORMATIONType_Revision();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getPreferredName <em>Preferred Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getPreferredName()
	 * @see #getINFORMATIONType()
	 * @generated
	 */
	EReference getINFORMATIONType_PreferredName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getSynonymousNames <em>Synonymous Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonymous Names</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getSynonymousNames()
	 * @see #getINFORMATIONType()
	 * @generated
	 */
	EReference getINFORMATIONType_SynonymousNames();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getShortName()
	 * @see #getINFORMATIONType()
	 * @generated
	 */
	EReference getINFORMATIONType_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getIcon()
	 * @see #getINFORMATIONType()
	 * @generated
	 */
	EReference getINFORMATIONType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getNote()
	 * @see #getINFORMATIONType()
	 * @generated
	 */
	EReference getINFORMATIONType_Note();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getRemark()
	 * @see #getINFORMATIONType()
	 * @generated
	 */
	EReference getINFORMATIONType_Remark();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType <em>INTCURRENCYTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INTCURRENCYTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType
	 * @generated
	 */
	EClass getINTCURRENCYTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType#getValueFormat()
	 * @see #getINTCURRENCYTYPEType()
	 * @generated
	 */
	EAttribute getINTCURRENCYTYPEType_ValueFormat();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType#getCurrency()
	 * @see #getINTCURRENCYTYPEType()
	 * @generated
	 */
	EAttribute getINTCURRENCYTYPEType_Currency();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType#getCurrencyId <em>Currency Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType#getCurrencyId()
	 * @see #getINTCURRENCYTYPEType()
	 * @generated
	 */
	EAttribute getINTCURRENCYTYPEType_CurrencyId();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTDICVALUEType <em>INTDICVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INTDICVALUE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTDICVALUEType
	 * @generated
	 */
	EClass getINTDICVALUEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTDICVALUEType#getValueCode <em>Value Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTDICVALUEType#getValueCode()
	 * @see #getINTDICVALUEType()
	 * @generated
	 */
	EAttribute getINTDICVALUEType_ValueCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType <em>INTEGRITYCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INTEGRITYCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType
	 * @generated
	 */
	EClass getINTEGRITYCONSTRAINTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType#getRedefinedDomain <em>Redefined Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Redefined Domain</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType#getRedefinedDomain()
	 * @see #getINTEGRITYCONSTRAINTType()
	 * @generated
	 */
	EReference getINTEGRITYCONSTRAINTType_RedefinedDomain();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType <em>INTMEASURETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INTMEASURETYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType
	 * @generated
	 */
	EClass getINTMEASURETYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getValueFormat()
	 * @see #getINTMEASURETYPEType()
	 * @generated
	 */
	EAttribute getINTMEASURETYPEType_ValueFormat();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getUnit()
	 * @see #getINTMEASURETYPEType()
	 * @generated
	 */
	EReference getINTMEASURETYPEType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getAlternativeUnits <em>Alternative Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative Units</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getAlternativeUnits()
	 * @see #getINTMEASURETYPEType()
	 * @generated
	 */
	EReference getINTMEASURETYPEType_AlternativeUnits();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getUnitId <em>Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getUnitId()
	 * @see #getINTMEASURETYPEType()
	 * @generated
	 */
	EReference getINTMEASURETYPEType_UnitId();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getAlternativeUnitIds <em>Alternative Unit Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative Unit Ids</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType#getAlternativeUnitIds()
	 * @see #getINTMEASURETYPEType()
	 * @generated
	 */
	EReference getINTMEASURETYPEType_AlternativeUnitIds();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTTYPEType <em>INTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INTTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTTYPEType
	 * @generated
	 */
	EClass getINTTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTTYPEType#getValueFormat()
	 * @see #getINTTYPEType()
	 * @generated
	 */
	EAttribute getINTTYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType <em>ITEMCLASSCASEOF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITEMCLASSCASEOF Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType
	 * @generated
	 */
	EClass getITEMCLASSCASEOFType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getSimplifiedDrawing <em>Simplified Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simplified Drawing</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getSimplifiedDrawing()
	 * @see #getITEMCLASSCASEOFType()
	 * @generated
	 */
	EReference getITEMCLASSCASEOFType_SimplifiedDrawing();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getCodedName <em>Coded Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coded Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getCodedName()
	 * @see #getITEMCLASSCASEOFType()
	 * @generated
	 */
	EAttribute getITEMCLASSCASEOFType_CodedName();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#isInstanceSharable <em>Instance Sharable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Sharable</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#isInstanceSharable()
	 * @see #getITEMCLASSCASEOFType()
	 * @generated
	 */
	EAttribute getITEMCLASSCASEOFType_InstanceSharable();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getIsCaseOf <em>Is Case Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Case Of</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getIsCaseOf()
	 * @see #getITEMCLASSCASEOFType()
	 * @generated
	 */
	EReference getITEMCLASSCASEOFType_IsCaseOf();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedProperties <em>Imported Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Properties</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedProperties()
	 * @see #getITEMCLASSCASEOFType()
	 * @generated
	 */
	EReference getITEMCLASSCASEOFType_ImportedProperties();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedTypes <em>Imported Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Types</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedTypes()
	 * @see #getITEMCLASSCASEOFType()
	 * @generated
	 */
	EReference getITEMCLASSCASEOFType_ImportedTypes();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedDocuments <em>Imported Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Documents</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedDocuments()
	 * @see #getITEMCLASSCASEOFType()
	 * @generated
	 */
	EReference getITEMCLASSCASEOFType_ImportedDocuments();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedConstraints <em>Imported Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Constraints</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedConstraints()
	 * @see #getITEMCLASSCASEOFType()
	 * @generated
	 */
	EReference getITEMCLASSCASEOFType_ImportedConstraints();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType <em>ITEMCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITEMCLASS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType
	 * @generated
	 */
	EClass getITEMCLASSType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#getSimplifiedDrawing <em>Simplified Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simplified Drawing</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#getSimplifiedDrawing()
	 * @see #getITEMCLASSType()
	 * @generated
	 */
	EReference getITEMCLASSType_SimplifiedDrawing();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#getCodedName <em>Coded Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coded Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#getCodedName()
	 * @see #getITEMCLASSType()
	 * @generated
	 */
	EAttribute getITEMCLASSType_CodedName();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#isInstanceSharable <em>Instance Sharable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Sharable</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#isInstanceSharable()
	 * @see #getITEMCLASSType()
	 * @generated
	 */
	EAttribute getITEMCLASSType_InstanceSharable();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITSVALUESType <em>ITSVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITSVALUES Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITSVALUESType
	 * @generated
	 */
	EClass getITSVALUESType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITSVALUESType#getDicValue <em>Dic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dic Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITSVALUESType#getDicValue()
	 * @see #getITSVALUESType()
	 * @generated
	 */
	EReference getITSVALUESType_DicValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType <em>KEYWORDLABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KEYWORDLABEL Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType
	 * @generated
	 */
	EClass getKEYWORDLABELType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType#getValue()
	 * @see #getKEYWORDLABELType()
	 * @generated
	 */
	EAttribute getKEYWORDLABELType_Value();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType#getCountryCode()
	 * @see #getKEYWORDLABELType()
	 * @generated
	 */
	EAttribute getKEYWORDLABELType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType#getLanguageCode()
	 * @see #getKEYWORDLABELType()
	 * @generated
	 */
	EAttribute getKEYWORDLABELType_LanguageCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDREFERENCESType <em>KEYWORDREFERENCES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KEYWORDREFERENCES Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDREFERENCESType
	 * @generated
	 */
	EClass getKEYWORDREFERENCESType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDREFERENCESType#getKeywordRef <em>Keyword Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDREFERENCESType#getKeywordRef()
	 * @see #getKEYWORDREFERENCESType()
	 * @generated
	 */
	EAttribute getKEYWORDREFERENCESType_KeywordRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDType <em>KEYWORD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KEYWORD Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDType
	 * @generated
	 */
	EClass getKEYWORDType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDType#getLabel()
	 * @see #getKEYWORDType()
	 * @generated
	 */
	EReference getKEYWORDType_Label();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType <em>LANGUAGE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LANGUAGE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType
	 * @generated
	 */
	EClass getLANGUAGEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType#getCountryCode()
	 * @see #getLANGUAGEType()
	 * @generated
	 */
	EAttribute getLANGUAGEType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType#getLanguageCode()
	 * @see #getLANGUAGEType()
	 * @generated
	 */
	EAttribute getLANGUAGEType_LanguageCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType <em>LEVEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LEVEL Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType
	 * @generated
	 */
	EClass getLEVELType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType#getMin()
	 * @see #getLEVELType()
	 * @generated
	 */
	EReference getLEVELType_Min();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nom</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType#getNom()
	 * @see #getLEVELType()
	 * @generated
	 */
	EReference getLEVELType_Nom();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typ</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType#getTyp()
	 * @see #getLEVELType()
	 * @generated
	 */
	EReference getLEVELType_Typ();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType#getMax()
	 * @see #getLEVELType()
	 * @generated
	 */
	EReference getLEVELType_Max();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType <em>LEVELTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LEVELTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType
	 * @generated
	 */
	EClass getLEVELTYPEType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Levels</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType#getLevels()
	 * @see #getLEVELTYPEType()
	 * @generated
	 */
	EReference getLEVELTYPEType_Levels();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType#getValueType()
	 * @see #getLEVELTYPEType()
	 * @generated
	 */
	EReference getLEVELTYPEType_ValueType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType <em>LIBRARYIIMIDENTIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LIBRARYIIMIDENTIFICATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType
	 * @generated
	 */
	EClass getLIBRARYIIMIDENTIFICATIONType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getSourceDocumentIdentifier <em>Source Document Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Document Identifier</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getSourceDocumentIdentifier()
	 * @see #getLIBRARYIIMIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getLIBRARYIIMIDENTIFICATIONType_SourceDocumentIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getStatus()
	 * @see #getLIBRARYIIMIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getLIBRARYIIMIDENTIFICATIONType_Status();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getName()
	 * @see #getLIBRARYIIMIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getLIBRARYIIMIDENTIFICATIONType_Name();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getDate()
	 * @see #getLIBRARYIIMIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getLIBRARYIIMIDENTIFICATIONType_Date();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getApplication()
	 * @see #getLIBRARYIIMIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getLIBRARYIIMIDENTIFICATIONType_Application();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType#getLevel()
	 * @see #getLIBRARYIIMIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getLIBRARYIIMIDENTIFICATIONType_Level();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYINSTANDARDFORMATType <em>LIBRARYINSTANDARDFORMAT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LIBRARYINSTANDARDFORMAT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYINSTANDARDFORMATType
	 * @generated
	 */
	EClass getLIBRARYINSTANDARDFORMATType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType <em>LIBRARY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LIBRARY Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType
	 * @generated
	 */
	EClass getLIBRARYType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType#getContainedClassExtensions <em>Contained Class Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Class Extensions</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType#getContainedClassExtensions()
	 * @see #getLIBRARYType()
	 * @generated
	 */
	EReference getLIBRARYType_ContainedClassExtensions();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType#getResponsibleSupplier <em>Responsible Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible Supplier</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType#getResponsibleSupplier()
	 * @see #getLIBRARYType()
	 * @generated
	 */
	EReference getLIBRARYType_ResponsibleSupplier();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType <em>LISTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LISTTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType
	 * @generated
	 */
	EClass getLISTTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getBound1 <em>Bound1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound1</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getBound1()
	 * @see #getLISTTYPEType()
	 * @generated
	 */
	EAttribute getLISTTYPEType_Bound1();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getBound2 <em>Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getBound2()
	 * @see #getLISTTYPEType()
	 * @generated
	 */
	EAttribute getLISTTYPEType_Bound2();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getValueType()
	 * @see #getLISTTYPEType()
	 * @generated
	 */
	EReference getLISTTYPEType_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#isUniqueness <em>Uniqueness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniqueness</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#isUniqueness()
	 * @see #getLISTTYPEType()
	 * @generated
	 */
	EAttribute getLISTTYPEType_Uniqueness();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MAPPINGFUNCTIONType <em>MAPPINGFUNCTION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAPPINGFUNCTION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MAPPINGFUNCTIONType
	 * @generated
	 */
	EClass getMAPPINGFUNCTIONType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType <em>MATHEMATICALSTRING Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MATHEMATICALSTRING Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType
	 * @generated
	 */
	EClass getMATHEMATICALSTRINGType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType#getTextRepresentation <em>Text Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Representation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType#getTextRepresentation()
	 * @see #getMATHEMATICALSTRINGType()
	 * @generated
	 */
	EAttribute getMATHEMATICALSTRINGType_TextRepresentation();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MESSAGEType <em>MESSAGE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MESSAGE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MESSAGEType
	 * @generated
	 */
	EClass getMESSAGEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MESSAGEType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MESSAGEType#getCode()
	 * @see #getMESSAGEType()
	 * @generated
	 */
	EAttribute getMESSAGEType_Code();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDTYPEType <em>NAMEDTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NAMEDTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDTYPEType
	 * @generated
	 */
	EClass getNAMEDTYPEType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDTYPEType#getReferredType <em>Referred Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referred Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDTYPEType#getReferredType()
	 * @see #getNAMEDTYPEType()
	 * @generated
	 */
	EReference getNAMEDTYPEType_ReferredType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDUNITType <em>NAMEDUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NAMEDUNIT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDUNITType
	 * @generated
	 */
	EClass getNAMEDUNITType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDUNITType#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimensions</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDUNITType#getDimensions()
	 * @see #getNAMEDUNITType()
	 * @generated
	 */
	EReference getNAMEDUNITType_Dimensions();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONDEPENDENTPDETType <em>NONDEPENDENTPDET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NONDEPENDENTPDET Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONDEPENDENTPDETType
	 * @generated
	 */
	EClass getNONDEPENDENTPDETType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONINSTANTIABLEFUNCTIONALVIEWCLASSType <em>NONINSTANTIABLEFUNCTIONALVIEWCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NONINSTANTIABLEFUNCTIONALVIEWCLASS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONINSTANTIABLEFUNCTIONALVIEWCLASSType
	 * @generated
	 */
	EClass getNONINSTANTIABLEFUNCTIONALVIEWCLASSType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONINSTANTIABLEFUNCTIONALVIEWCLASSType#getViewControlVariables <em>View Control Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Control Variables</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONINSTANTIABLEFUNCTIONALVIEWCLASSType#getViewControlVariables()
	 * @see #getNONINSTANTIABLEFUNCTIONALVIEWCLASSType()
	 * @generated
	 */
	EReference getNONINSTANTIABLEFUNCTIONALVIEWCLASSType_ViewControlVariables();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType <em>NONQUANTITATIVECODETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NONQUANTITATIVECODETYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType
	 * @generated
	 */
	EClass getNONQUANTITATIVECODETYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getValueFormat()
	 * @see #getNONQUANTITATIVECODETYPEType()
	 * @generated
	 */
	EAttribute getNONQUANTITATIVECODETYPEType_ValueFormat();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getItsValues <em>Its Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its Values</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getItsValues()
	 * @see #getNONQUANTITATIVECODETYPEType()
	 * @generated
	 */
	EReference getNONQUANTITATIVECODETYPEType_ItsValues();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getSourceDocOfValueDomain <em>Source Doc Of Value Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Doc Of Value Domain</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getSourceDocOfValueDomain()
	 * @see #getNONQUANTITATIVECODETYPEType()
	 * @generated
	 */
	EReference getNONQUANTITATIVECODETYPEType_SourceDocOfValueDomain();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getDefinition()
	 * @see #getNONQUANTITATIVECODETYPEType()
	 * @generated
	 */
	EReference getNONQUANTITATIVECODETYPEType_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType#getIcon()
	 * @see #getNONQUANTITATIVECODETYPEType()
	 * @generated
	 */
	EReference getNONQUANTITATIVECODETYPEType_Icon();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType <em>NONQUANTITATIVEINTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NONQUANTITATIVEINTTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType
	 * @generated
	 */
	EClass getNONQUANTITATIVEINTTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getValueFormat()
	 * @see #getNONQUANTITATIVEINTTYPEType()
	 * @generated
	 */
	EAttribute getNONQUANTITATIVEINTTYPEType_ValueFormat();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getItsValues <em>Its Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its Values</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getItsValues()
	 * @see #getNONQUANTITATIVEINTTYPEType()
	 * @generated
	 */
	EReference getNONQUANTITATIVEINTTYPEType_ItsValues();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getSourceDocOfValueDomain <em>Source Doc Of Value Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Doc Of Value Domain</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getSourceDocOfValueDomain()
	 * @see #getNONQUANTITATIVEINTTYPEType()
	 * @generated
	 */
	EReference getNONQUANTITATIVEINTTYPEType_SourceDocOfValueDomain();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getDefinition()
	 * @see #getNONQUANTITATIVEINTTYPEType()
	 * @generated
	 */
	EReference getNONQUANTITATIVEINTTYPEType_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getIcon()
	 * @see #getNONQUANTITATIVEINTTYPEType()
	 * @generated
	 */
	EReference getNONQUANTITATIVEINTTYPEType_Icon();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONSIUNITType <em>NONSIUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NONSIUNIT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONSIUNITType
	 * @generated
	 */
	EClass getNONSIUNITType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONSIUNITType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONSIUNITType#getName()
	 * @see #getNONSIUNITType()
	 * @generated
	 */
	EAttribute getNONSIUNITType_Name();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONTRANSLATABLESTRINGTYPEType <em>NONTRANSLATABLESTRINGTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NONTRANSLATABLESTRINGTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONTRANSLATABLESTRINGTYPEType
	 * @generated
	 */
	EClass getNONTRANSLATABLESTRINGTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONTRANSLATABLESTRINGTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONTRANSLATABLESTRINGTYPEType#getValueFormat()
	 * @see #getNONTRANSLATABLESTRINGTYPEType()
	 * @generated
	 */
	EAttribute getNONTRANSLATABLESTRINGTYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NUMBERTYPEType <em>NUMBERTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NUMBERTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NUMBERTYPEType
	 * @generated
	 */
	EClass getNUMBERTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NUMBERTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NUMBERTYPEType#getValueFormat()
	 * @see #getNUMBERTYPEType()
	 * @generated
	 */
	EAttribute getNUMBERTYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType <em>ONTOML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ONTOML Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType
	 * @generated
	 */
	EClass getONTOMLType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getHeader()
	 * @see #getONTOMLType()
	 * @generated
	 */
	EReference getONTOMLType_Header();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getDictionary()
	 * @see #getONTOMLType()
	 * @generated
	 */
	EReference getONTOMLType_Dictionary();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getLibrary()
	 * @see #getONTOMLType()
	 * @generated
	 */
	EReference getONTOMLType_Library();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType <em>ORGANIZATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORGANIZATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType
	 * @generated
	 */
	EClass getORGANIZATIONType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType#getId()
	 * @see #getORGANIZATIONType()
	 * @generated
	 */
	EAttribute getORGANIZATIONType_Id();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType#getName()
	 * @see #getORGANIZATIONType()
	 * @generated
	 */
	EAttribute getORGANIZATIONType_Name();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType#getDescription()
	 * @see #getORGANIZATIONType()
	 * @generated
	 */
	EAttribute getORGANIZATIONType_Description();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType <em>PERSON Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PERSON Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType
	 * @generated
	 */
	EClass getPERSONType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getId()
	 * @see #getPERSONType()
	 * @generated
	 */
	EAttribute getPERSONType_Id();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getLastName()
	 * @see #getPERSONType()
	 * @generated
	 */
	EAttribute getPERSONType_LastName();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getFirstName()
	 * @see #getPERSONType()
	 * @generated
	 */
	EAttribute getPERSONType_FirstName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getMiddleNames <em>Middle Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Middle Names</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getMiddleNames()
	 * @see #getPERSONType()
	 * @generated
	 */
	EReference getPERSONType_MiddleNames();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getPrefixTitles <em>Prefix Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix Titles</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getPrefixTitles()
	 * @see #getPERSONType()
	 * @generated
	 */
	EReference getPERSONType_PrefixTitles();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getSuffixTitles <em>Suffix Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix Titles</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType#getSuffixTitles()
	 * @see #getPERSONType()
	 * @generated
	 */
	EReference getPERSONType_SuffixTitles();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PLACEMENTTYPEType <em>PLACEMENTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLACEMENTTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PLACEMENTTYPEType
	 * @generated
	 */
	EClass getPLACEMENTTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PLACEMENTTYPEType#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PLACEMENTTYPEType#getClassRef()
	 * @see #getPLACEMENTTYPEType()
	 * @generated
	 */
	EAttribute getPLACEMENTTYPEType_ClassRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.POSTCONDITIONType <em>POSTCONDITION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POSTCONDITION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.POSTCONDITIONType
	 * @generated
	 */
	EClass getPOSTCONDITIONType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.POSTCONDITIONType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.POSTCONDITIONType#getFilter()
	 * @see #getPOSTCONDITIONType()
	 * @generated
	 */
	EReference getPOSTCONDITIONType_Filter();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PRECONDITIONType <em>PRECONDITION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRECONDITION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PRECONDITIONType
	 * @generated
	 */
	EClass getPRECONDITIONType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PRECONDITIONType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PRECONDITIONType#getFilter()
	 * @see #getPRECONDITIONType()
	 * @generated
	 */
	EReference getPRECONDITIONType_Filter();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType <em>PREFERREDNAMELABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PREFERREDNAMELABEL Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType
	 * @generated
	 */
	EClass getPREFERREDNAMELABELType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getValue()
	 * @see #getPREFERREDNAMELABELType()
	 * @generated
	 */
	EAttribute getPREFERREDNAMELABELType_Value();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getCountryCode()
	 * @see #getPREFERREDNAMELABELType()
	 * @generated
	 */
	EAttribute getPREFERREDNAMELABELType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getLanguageCode()
	 * @see #getPREFERREDNAMELABELType()
	 * @generated
	 */
	EAttribute getPREFERREDNAMELABELType_LanguageCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType <em>PREFERREDNAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PREFERREDNAME Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType
	 * @generated
	 */
	EClass getPREFERREDNAMEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType#getLabel()
	 * @see #getPREFERREDNAMEType()
	 * @generated
	 */
	EReference getPREFERREDNAMEType_Label();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType <em>PROGRAMREFERENCETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROGRAMREFERENCETYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType
	 * @generated
	 */
	EClass getPROGRAMREFERENCETYPEType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getInParameters <em>In Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Parameters</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getInParameters()
	 * @see #getPROGRAMREFERENCETYPEType()
	 * @generated
	 */
	EReference getPROGRAMREFERENCETYPEType_InParameters();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getOutParameters <em>Out Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Parameters</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getOutParameters()
	 * @see #getPROGRAMREFERENCETYPEType()
	 * @generated
	 */
	EReference getPROGRAMREFERENCETYPEType_OutParameters();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getInoutParameters <em>Inout Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inout Parameters</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getInoutParameters()
	 * @see #getPROGRAMREFERENCETYPEType()
	 * @generated
	 */
	EReference getPROGRAMREFERENCETYPEType_InoutParameters();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getClassRef()
	 * @see #getPROGRAMREFERENCETYPEType()
	 * @generated
	 */
	EAttribute getPROGRAMREFERENCETYPEType_ClassRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType <em>PROPERTIESREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROPERTIESREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType
	 * @generated
	 */
	EClass getPROPERTIESREFERENCEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType#getProperty()
	 * @see #getPROPERTIESREFERENCEType()
	 * @generated
	 */
	EReference getPROPERTIESREFERENCEType_Property();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType <em>PROPERTYCLASSIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROPERTYCLASSIFICATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType
	 * @generated
	 */
	EClass getPROPERTYCLASSIFICATIONType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType#getItsValue <em>Its Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Its Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType#getItsValue()
	 * @see #getPROPERTYCLASSIFICATIONType()
	 * @generated
	 */
	EAttribute getPROPERTYCLASSIFICATIONType_ItsValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType#getPropDef <em>Prop Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prop Def</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType#getPropDef()
	 * @see #getPROPERTYCLASSIFICATIONType()
	 * @generated
	 */
	EReference getPROPERTYCLASSIFICATIONType_PropDef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCONSTRAINTType <em>PROPERTYCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROPERTYCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCONSTRAINTType
	 * @generated
	 */
	EClass getPROPERTYCONSTRAINTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCONSTRAINTType#getConstrainedProperty <em>Constrained Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constrained Property</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCONSTRAINTType#getConstrainedProperty()
	 * @see #getPROPERTYCONSTRAINTType()
	 * @generated
	 */
	EReference getPROPERTYCONSTRAINTType_ConstrainedProperty();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType <em>PROPERTYMAPPING Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROPERTYMAPPING Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType
	 * @generated
	 */
	EClass getPROPERTYMAPPINGType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType#getDomain()
	 * @see #getPROPERTYMAPPINGType()
	 * @generated
	 */
	EReference getPROPERTYMAPPINGType_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType#getRange()
	 * @see #getPROPERTYMAPPINGType()
	 * @generated
	 */
	EReference getPROPERTYMAPPINGType_Range();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType#getFunction()
	 * @see #getPROPERTYMAPPINGType()
	 * @generated
	 */
	EReference getPROPERTYMAPPINGType_Function();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType <em>PROPERTYREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROPERTYREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType
	 * @generated
	 */
	EClass getPROPERTYREFERENCEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getOrderNumber <em>Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Number</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getOrderNumber()
	 * @see #getPROPERTYREFERENCEType()
	 * @generated
	 */
	EAttribute getPROPERTYREFERENCEType_OrderNumber();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getPropertyRef()
	 * @see #getPROPERTYREFERENCEType()
	 * @generated
	 */
	EAttribute getPROPERTYREFERENCEType_PropertyRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType <em>PROPERTY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROPERTY Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType
	 * @generated
	 */
	EClass getPROPERTYType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getNameScope <em>Name Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Scope</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getNameScope()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_NameScope();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Original Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDateOfOriginalDefinition()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_DateOfOriginalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDateOfCurrentVersion <em>Date Of Current Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDateOfCurrentVersion()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_DateOfCurrentVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDateOfCurrentRevision()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_DateOfCurrentRevision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getRevision()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_Revision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getStatus()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_Status();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getTranslation()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_Translation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSourceLanguage <em>Source Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Language</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSourceLanguage()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_SourceLanguage();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#isIsDeprecated <em>Is Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deprecated</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#isIsDeprecated()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_IsDeprecated();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Deprecated Interpretation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getIsDeprecatedInterpretation()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_IsDeprecatedInterpretation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getPreferredName <em>Preferred Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getPreferredName()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_PreferredName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSynonymousNames <em>Synonymous Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonymous Names</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSynonymousNames()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_SynonymousNames();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getShortName()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getIcon()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDefinition()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSourceDocOfDefinition <em>Source Doc Of Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Doc Of Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSourceDocOfDefinition()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_SourceDocOfDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getNote()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_Note();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getRemark()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_Remark();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getPreferredSymbol <em>Preferred Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Symbol</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getPreferredSymbol()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_PreferredSymbol();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSynonymousSymbols <em>Synonymous Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonymous Symbols</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSynonymousSymbols()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_SynonymousSymbols();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Figure</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getFigure()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_Figure();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDetClassification <em>Det Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Det Classification</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDetClassification()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_DetClassification();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getDomain()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getFormula()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_Formula();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSynonymReferences <em>Synonym References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonym References</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getSynonymReferences()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_SynonymReferences();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#isSuggestedValueList <em>Suggested Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suggested Value List</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#isSuggestedValueList()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_SuggestedValueList();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getFreeRelations <em>Free Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Free Relations</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getFreeRelations()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EReference getPROPERTYType_FreeRelations();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getGuid()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_Guid();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getGuid2 <em>Guid2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getGuid2()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_Guid2();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType#getId()
	 * @see #getPROPERTYType()
	 * @generated
	 */
	EAttribute getPROPERTYType_Id();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType <em>PROPERTYVALUERECOMMENDEDPRESENTATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROPERTYVALUERECOMMENDEDPRESENTATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType
	 * @generated
	 */
	EClass getPROPERTYVALUERECOMMENDEDPRESENTATIONType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getPropDef <em>Prop Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prop Def</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getPropDef()
	 * @see #getPROPERTYVALUERECOMMENDEDPRESENTATIONType()
	 * @generated
	 */
	EReference getPROPERTYVALUERECOMMENDEDPRESENTATIONType_PropDef();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getRecommendedPresentationUnit <em>Recommended Presentation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recommended Presentation Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getRecommendedPresentationUnit()
	 * @see #getPROPERTYVALUERECOMMENDEDPRESENTATIONType()
	 * @generated
	 */
	EReference getPROPERTYVALUERECOMMENDEDPRESENTATIONType_RecommendedPresentationUnit();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getRecommendedPresentationFormat <em>Recommended Presentation Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommended Presentation Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getRecommendedPresentationFormat()
	 * @see #getPROPERTYVALUERECOMMENDEDPRESENTATIONType()
	 * @generated
	 */
	EAttribute getPROPERTYVALUERECOMMENDEDPRESENTATIONType_RecommendedPresentationFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RANGECONSTRAINTType <em>RANGECONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RANGECONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RANGECONSTRAINTType
	 * @generated
	 */
	EClass getRANGECONSTRAINTType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RANGECONSTRAINTType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RANGECONSTRAINTType#getMinValue()
	 * @see #getRANGECONSTRAINTType()
	 * @generated
	 */
	EAttribute getRANGECONSTRAINTType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RANGECONSTRAINTType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RANGECONSTRAINTType#getMaxValue()
	 * @see #getRANGECONSTRAINTType()
	 * @generated
	 */
	EAttribute getRANGECONSTRAINTType_MaxValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType <em>RATIONALMEASURETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RATIONALMEASURETYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType
	 * @generated
	 */
	EClass getRATIONALMEASURETYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getValueFormat()
	 * @see #getRATIONALMEASURETYPEType()
	 * @generated
	 */
	EAttribute getRATIONALMEASURETYPEType_ValueFormat();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getUnit()
	 * @see #getRATIONALMEASURETYPEType()
	 * @generated
	 */
	EReference getRATIONALMEASURETYPEType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getAlternativeUnits <em>Alternative Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative Units</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getAlternativeUnits()
	 * @see #getRATIONALMEASURETYPEType()
	 * @generated
	 */
	EReference getRATIONALMEASURETYPEType_AlternativeUnits();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getUnitId <em>Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getUnitId()
	 * @see #getRATIONALMEASURETYPEType()
	 * @generated
	 */
	EReference getRATIONALMEASURETYPEType_UnitId();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getAlternativeUnitIds <em>Alternative Unit Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative Unit Ids</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType#getAlternativeUnitIds()
	 * @see #getRATIONALMEASURETYPEType()
	 * @generated
	 */
	EReference getRATIONALMEASURETYPEType_AlternativeUnitIds();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALTYPEType <em>RATIONALTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RATIONALTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALTYPEType
	 * @generated
	 */
	EClass getRATIONALTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALTYPEType#getValueFormat()
	 * @see #getRATIONALTYPEType()
	 * @generated
	 */
	EAttribute getRATIONALTYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType <em>REALCURRENCYTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REALCURRENCYTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType
	 * @generated
	 */
	EClass getREALCURRENCYTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getValueFormat()
	 * @see #getREALCURRENCYTYPEType()
	 * @generated
	 */
	EAttribute getREALCURRENCYTYPEType_ValueFormat();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getCurrency()
	 * @see #getREALCURRENCYTYPEType()
	 * @generated
	 */
	EAttribute getREALCURRENCYTYPEType_Currency();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getCurrencyId <em>Currency Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getCurrencyId()
	 * @see #getREALCURRENCYTYPEType()
	 * @generated
	 */
	EAttribute getREALCURRENCYTYPEType_CurrencyId();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType <em>REALMEASURETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REALMEASURETYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType
	 * @generated
	 */
	EClass getREALMEASURETYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getValueFormat()
	 * @see #getREALMEASURETYPEType()
	 * @generated
	 */
	EAttribute getREALMEASURETYPEType_ValueFormat();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getUnit()
	 * @see #getREALMEASURETYPEType()
	 * @generated
	 */
	EReference getREALMEASURETYPEType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getAlternativeUnits <em>Alternative Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative Units</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getAlternativeUnits()
	 * @see #getREALMEASURETYPEType()
	 * @generated
	 */
	EReference getREALMEASURETYPEType_AlternativeUnits();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getUnitId <em>Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getUnitId()
	 * @see #getREALMEASURETYPEType()
	 * @generated
	 */
	EReference getREALMEASURETYPEType_UnitId();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getAlternativeUnitIds <em>Alternative Unit Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative Unit Ids</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getAlternativeUnitIds()
	 * @see #getREALMEASURETYPEType()
	 * @generated
	 */
	EReference getREALMEASURETYPEType_AlternativeUnitIds();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALTYPEType <em>REALTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REALTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALTYPEType
	 * @generated
	 */
	EClass getREALTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALTYPEType#getValueFormat()
	 * @see #getREALTYPEType()
	 * @generated
	 */
	EAttribute getREALTYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RECOMMENDEDPRESENTATIONType <em>RECOMMENDEDPRESENTATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RECOMMENDEDPRESENTATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RECOMMENDEDPRESENTATIONType
	 * @generated
	 */
	EClass getRECOMMENDEDPRESENTATIONType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RECOMMENDEDPRESENTATIONType#getPropertyValueRecommendedPresentation <em>Property Value Recommended Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Value Recommended Presentation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RECOMMENDEDPRESENTATIONType#getPropertyValueRecommendedPresentation()
	 * @see #getRECOMMENDEDPRESENTATIONType()
	 * @generated
	 */
	EReference getRECOMMENDEDPRESENTATIONType_PropertyValueRecommendedPresentation();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDDOCUMENTType <em>REFERENCEDDOCUMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REFERENCEDDOCUMENT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDDOCUMENTType
	 * @generated
	 */
	EClass getREFERENCEDDOCUMENTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDDOCUMENTType#getDocumentReference <em>Document Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Reference</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDDOCUMENTType#getDocumentReference()
	 * @see #getREFERENCEDDOCUMENTType()
	 * @generated
	 */
	EReference getREFERENCEDDOCUMENTType_DocumentReference();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDGRAPHICSType <em>REFERENCEDGRAPHICS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REFERENCEDGRAPHICS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDGRAPHICSType
	 * @generated
	 */
	EClass getREFERENCEDGRAPHICSType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDGRAPHICSType#getGraphicsReference <em>Graphics Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphics Reference</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDGRAPHICSType#getGraphicsReference()
	 * @see #getREFERENCEDGRAPHICSType()
	 * @generated
	 */
	EReference getREFERENCEDGRAPHICSType_GraphicsReference();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REMOTELOCATIONSType <em>REMOTELOCATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REMOTELOCATIONS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REMOTELOCATIONSType
	 * @generated
	 */
	EClass getREMOTELOCATIONSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REMOTELOCATIONSType#getRemoteLocation <em>Remote Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remote Location</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REMOTELOCATIONSType#getRemoteLocation()
	 * @see #getREMOTELOCATIONSType()
	 * @generated
	 */
	EReference getREMOTELOCATIONSType_RemoteLocation();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType <em>Remote Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Location Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType
	 * @generated
	 */
	EClass getRemoteLocationType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType#getValue()
	 * @see #getRemoteLocationType()
	 * @generated
	 */
	EAttribute getRemoteLocationType_Value();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType#getLanguage()
	 * @see #getRemoteLocationType()
	 * @generated
	 */
	EAttribute getRemoteLocationType_Language();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONPDETType <em>REPRESENTATIONPDET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REPRESENTATIONPDET Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONPDETType
	 * @generated
	 */
	EClass getREPRESENTATIONPDETType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONREFERENCETYPEType <em>REPRESENTATIONREFERENCETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REPRESENTATIONREFERENCETYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONREFERENCETYPEType
	 * @generated
	 */
	EClass getREPRESENTATIONREFERENCETYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONREFERENCETYPEType#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONREFERENCETYPEType#getClassRef()
	 * @see #getREPRESENTATIONREFERENCETYPEType()
	 * @generated
	 */
	EAttribute getREPRESENTATIONREFERENCETYPEType_ClassRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLEKEYWORDType <em>REUSABLEKEYWORD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REUSABLEKEYWORD Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLEKEYWORDType
	 * @generated
	 */
	EClass getREUSABLEKEYWORDType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType <em>REUSABLENAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REUSABLENAME Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType
	 * @generated
	 */
	EClass getREUSABLENAMEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Original Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getDateOfOriginalDefinition()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EAttribute getREUSABLENAMEType_DateOfOriginalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getDateOfCurrentVersion <em>Date Of Current Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getDateOfCurrentVersion()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EAttribute getREUSABLENAMEType_DateOfCurrentVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getDateOfCurrentRevision()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EAttribute getREUSABLENAMEType_DateOfCurrentRevision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getRevision()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EAttribute getREUSABLENAMEType_Revision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getStatus()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EAttribute getREUSABLENAMEType_Status();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getSourceLanguage <em>Source Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Language</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getSourceLanguage()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EReference getREUSABLENAMEType_SourceLanguage();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#isIsDeprecated <em>Is Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deprecated</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#isIsDeprecated()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EAttribute getREUSABLENAMEType_IsDeprecated();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Deprecated Interpretation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getIsDeprecatedInterpretation()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EReference getREUSABLENAMEType_IsDeprecatedInterpretation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getName()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EReference getREUSABLENAMEType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getIcon()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EReference getREUSABLENAMEType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getNote()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EReference getREUSABLENAMEType_Note();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getGuid()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EAttribute getREUSABLENAMEType_Guid();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getGuid2 <em>Guid2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getGuid2()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EAttribute getREUSABLENAMEType_Guid2();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType#getId()
	 * @see #getREUSABLENAMEType()
	 * @generated
	 */
	EAttribute getREUSABLENAMEType_Id();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLESYNONYMType <em>REUSABLESYNONYM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REUSABLESYNONYM Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLESYNONYMType
	 * @generated
	 */
	EClass getREUSABLESYNONYMType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType <em>SETTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SETTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType
	 * @generated
	 */
	EClass getSETTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType#getBound1 <em>Bound1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound1</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType#getBound1()
	 * @see #getSETTYPEType()
	 * @generated
	 */
	EAttribute getSETTYPEType_Bound1();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType#getBound2 <em>Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType#getBound2()
	 * @see #getSETTYPEType()
	 * @generated
	 */
	EAttribute getSETTYPEType_Bound2();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType#getValueType()
	 * @see #getSETTYPEType()
	 * @generated
	 */
	EReference getSETTYPEType_ValueType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType <em>SETWITHSUBSETCONSTRAINTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SETWITHSUBSETCONSTRAINTTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType
	 * @generated
	 */
	EClass getSETWITHSUBSETCONSTRAINTTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getBound1 <em>Bound1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound1</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getBound1()
	 * @see #getSETWITHSUBSETCONSTRAINTTYPEType()
	 * @generated
	 */
	EAttribute getSETWITHSUBSETCONSTRAINTTYPEType_Bound1();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getBound2 <em>Bound2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound2</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getBound2()
	 * @see #getSETWITHSUBSETCONSTRAINTTYPEType()
	 * @generated
	 */
	EAttribute getSETWITHSUBSETCONSTRAINTTYPEType_Bound2();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getValueType()
	 * @see #getSETWITHSUBSETCONSTRAINTTYPEType()
	 * @generated
	 */
	EReference getSETWITHSUBSETCONSTRAINTTYPEType_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getCardinalMin <em>Cardinal Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinal Min</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getCardinalMin()
	 * @see #getSETWITHSUBSETCONSTRAINTTYPEType()
	 * @generated
	 */
	EAttribute getSETWITHSUBSETCONSTRAINTTYPEType_CardinalMin();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getCardinalMax <em>Cardinal Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinal Max</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getCardinalMax()
	 * @see #getSETWITHSUBSETCONSTRAINTTYPEType()
	 * @generated
	 */
	EAttribute getSETWITHSUBSETCONSTRAINTTYPEType_CardinalMax();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType <em>SHORTNAMELABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SHORTNAMELABEL Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType
	 * @generated
	 */
	EClass getSHORTNAMELABELType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType#getValue()
	 * @see #getSHORTNAMELABELType()
	 * @generated
	 */
	EAttribute getSHORTNAMELABELType_Value();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType#getCountryCode()
	 * @see #getSHORTNAMELABELType()
	 * @generated
	 */
	EAttribute getSHORTNAMELABELType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType#getLanguageCode()
	 * @see #getSHORTNAMELABELType()
	 * @generated
	 */
	EAttribute getSHORTNAMELABELType_LanguageCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType <em>SHORTNAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SHORTNAME Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType
	 * @generated
	 */
	EClass getSHORTNAMEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType#getLabel()
	 * @see #getSHORTNAMEType()
	 * @generated
	 */
	EReference getSHORTNAMEType_Label();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType <em>SIUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIUNIT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType
	 * @generated
	 */
	EClass getSIUNITType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getPrefix()
	 * @see #getSIUNITType()
	 * @generated
	 */
	EAttribute getSIUNITType_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getName()
	 * @see #getSIUNITType()
	 * @generated
	 */
	EAttribute getSIUNITType_Name();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SOURCEDOCUMENTType <em>SOURCEDOCUMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOURCEDOCUMENT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SOURCEDOCUMENTType
	 * @generated
	 */
	EClass getSOURCEDOCUMENTType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGDICVALUEType <em>STRINGDICVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRINGDICVALUE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGDICVALUEType
	 * @generated
	 */
	EClass getSTRINGDICVALUEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGDICVALUEType#getValueCode <em>Value Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGDICVALUEType#getValueCode()
	 * @see #getSTRINGDICVALUEType()
	 * @generated
	 */
	EAttribute getSTRINGDICVALUEType_ValueCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGPATTERNCONSTRAINTType <em>STRINGPATTERNCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRINGPATTERNCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGPATTERNCONSTRAINTType
	 * @generated
	 */
	EClass getSTRINGPATTERNCONSTRAINTType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGPATTERNCONSTRAINTType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGPATTERNCONSTRAINTType#getPattern()
	 * @see #getSTRINGPATTERNCONSTRAINTType()
	 * @generated
	 */
	EAttribute getSTRINGPATTERNCONSTRAINTType_Pattern();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSIZECONSTRAINTType <em>STRINGSIZECONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRINGSIZECONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSIZECONSTRAINTType
	 * @generated
	 */
	EClass getSTRINGSIZECONSTRAINTType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSIZECONSTRAINTType#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSIZECONSTRAINTType#getMinLength()
	 * @see #getSTRINGSIZECONSTRAINTType()
	 * @generated
	 */
	EAttribute getSTRINGSIZECONSTRAINTType_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSIZECONSTRAINTType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSIZECONSTRAINTType#getMaxLength()
	 * @see #getSTRINGSIZECONSTRAINTType()
	 * @generated
	 */
	EAttribute getSTRINGSIZECONSTRAINTType_MaxLength();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSType <em>STRINGS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRINGS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSType
	 * @generated
	 */
	EClass getSTRINGSType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSType#getValue()
	 * @see #getSTRINGSType()
	 * @generated
	 */
	EAttribute getSTRINGSType_Value();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGTYPEType <em>STRINGTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STRINGTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGTYPEType
	 * @generated
	 */
	EClass getSTRINGTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGTYPEType#getValueFormat()
	 * @see #getSTRINGTYPEType()
	 * @generated
	 */
	EAttribute getSTRINGTYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBCLASSCONSTRAINTType <em>SUBCLASSCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUBCLASSCONSTRAINT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBCLASSCONSTRAINTType
	 * @generated
	 */
	EClass getSUBCLASSCONSTRAINTType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBCLASSCONSTRAINTType#getSubclasses <em>Subclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subclasses</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBCLASSCONSTRAINTType#getSubclasses()
	 * @see #getSUBCLASSCONSTRAINTType()
	 * @generated
	 */
	EReference getSUBCLASSCONSTRAINTType_Subclasses();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType <em>SUBSET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUBSET Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType
	 * @generated
	 */
	EClass getSUBSETType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getValueGroup <em>Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value Group</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getValueGroup()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EAttribute getSUBSETType_ValueGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getStringValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_StringValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getBagValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_BagValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getBooleanValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getComplexValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getCompositeValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getControlledValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getCurrencyValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getDateValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_DateValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getDateTimeValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getFileValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_FileValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getIntegerValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getItemReferenceValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getLocalizedTextValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getMeasureQualifiedNumberValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getMeasureRangeValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getMeasureSingleNumberValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getNullValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_NullValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getRationalValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_RationalValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getRealValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_RealValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getSequenceValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getSetValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_SetValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getTimeValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_TimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getYearMonthValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getYearValue()
	 * @see #getSUBSETType()
	 * @generated
	 */
	EReference getSUBSETType_YearValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType <em>SUPPLIERREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUPPLIERREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType
	 * @generated
	 */
	EClass getSUPPLIERREFERENCEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType#getSupplierRef <em>Supplier Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType#getSupplierRef()
	 * @see #getSUPPLIERREFERENCEType()
	 * @generated
	 */
	EAttribute getSUPPLIERREFERENCEType_SupplierRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERSREFERENCEType <em>SUPPLIERSREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUPPLIERSREFERENCE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERSREFERENCEType
	 * @generated
	 */
	EClass getSUPPLIERSREFERENCEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERSREFERENCEType#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplier</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERSREFERENCEType#getSupplier()
	 * @see #getSUPPLIERSREFERENCEType()
	 * @generated
	 */
	EReference getSUPPLIERSREFERENCEType_Supplier();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType <em>SUPPLIER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUPPLIER Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType
	 * @generated
	 */
	EClass getSUPPLIERType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Original Definition</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getDateOfOriginalDefinition()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_DateOfOriginalDefinition();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getDateOfCurrentVersion <em>Date Of Current Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Version</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getDateOfCurrentVersion()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_DateOfCurrentVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getDateOfCurrentRevision()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_DateOfCurrentRevision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getRevision()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_Revision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getStatus()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_Status();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#isIsDeprecated <em>Is Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deprecated</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#isIsDeprecated()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_IsDeprecated();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Deprecated Interpretation</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getIsDeprecatedInterpretation()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EReference getSUPPLIERType_IsDeprecatedInterpretation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getOrg <em>Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Org</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getOrg()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EReference getSUPPLIERType_Org();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getInternalLocation <em>Internal Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Location</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getInternalLocation()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_InternalLocation();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getStreetNumber <em>Street Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Number</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getStreetNumber()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_StreetNumber();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getStreet()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_Street();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getPostalBox <em>Postal Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Box</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getPostalBox()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_PostalBox();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getTown <em>Town</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Town</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getTown()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_Town();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getRegion()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_Region();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getPostalCode()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getCountry()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_Country();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getFacsimileNumber <em>Facsimile Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facsimile Number</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getFacsimileNumber()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_FacsimileNumber();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone Number</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getTelephoneNumber()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_TelephoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getElectronicMailAddress <em>Electronic Mail Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Electronic Mail Address</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getElectronicMailAddress()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_ElectronicMailAddress();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getTelexNumber <em>Telex Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telex Number</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getTelexNumber()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_TelexNumber();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType#getId()
	 * @see #getSUPPLIERType()
	 * @generated
	 */
	EAttribute getSUPPLIERType_Id();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPORTEDVEPType <em>SUPPORTEDVEP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUPPORTEDVEP Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPORTEDVEPType
	 * @generated
	 */
	EClass getSUPPORTEDVEPType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPORTEDVEPType#getViewExchangeProtocolIdentification <em>View Exchange Protocol Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Exchange Protocol Identification</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPORTEDVEPType#getViewExchangeProtocolIdentification()
	 * @see #getSUPPORTEDVEPType()
	 * @generated
	 */
	EReference getSUPPORTEDVEPType_ViewExchangeProtocolIdentification();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType <em>SYNONYMOUSNAMELABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SYNONYMOUSNAMELABEL Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType
	 * @generated
	 */
	EClass getSYNONYMOUSNAMELABELType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType#getValue()
	 * @see #getSYNONYMOUSNAMELABELType()
	 * @generated
	 */
	EAttribute getSYNONYMOUSNAMELABELType_Value();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType#getCountryCode()
	 * @see #getSYNONYMOUSNAMELABELType()
	 * @generated
	 */
	EAttribute getSYNONYMOUSNAMELABELType_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType#getLanguageCode()
	 * @see #getSYNONYMOUSNAMELABELType()
	 * @generated
	 */
	EAttribute getSYNONYMOUSNAMELABELType_LanguageCode();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType <em>SYNONYMOUSNAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SYNONYMOUSNAME Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType
	 * @generated
	 */
	EClass getSYNONYMOUSNAMEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType#getLabel()
	 * @see #getSYNONYMOUSNAMEType()
	 * @generated
	 */
	EReference getSYNONYMOUSNAMEType_Label();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSSYMBOLSType <em>SYNONYMOUSSYMBOLS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SYNONYMOUSSYMBOLS Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSSYMBOLSType
	 * @generated
	 */
	EClass getSYNONYMOUSSYMBOLSType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSSYMBOLSType#getMathematicalString <em>Mathematical String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mathematical String</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSSYMBOLSType#getMathematicalString()
	 * @see #getSYNONYMOUSSYMBOLSType()
	 * @generated
	 */
	EReference getSYNONYMOUSSYMBOLSType_MathematicalString();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMREFERENCESType <em>SYNONYMREFERENCES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SYNONYMREFERENCES Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMREFERENCESType
	 * @generated
	 */
	EClass getSYNONYMREFERENCESType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMREFERENCESType#getSynonymRef <em>Synonym Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Synonym Ref</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMREFERENCESType#getSynonymRef()
	 * @see #getSYNONYMREFERENCESType()
	 * @generated
	 */
	EAttribute getSYNONYMREFERENCESType_SynonymRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType <em>TEXT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEXT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType
	 * @generated
	 */
	EClass getTEXTType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType#getText()
	 * @see #getTEXTType()
	 * @generated
	 */
	EReference getTEXTType_Text();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TIMEDATATYPEType <em>TIMEDATATYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIMEDATATYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TIMEDATATYPEType
	 * @generated
	 */
	EClass getTIMEDATATYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TIMEDATATYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TIMEDATATYPEType#getValueFormat()
	 * @see #getTIMEDATATYPEType()
	 * @generated
	 */
	EAttribute getTIMEDATATYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATABLESTRINGTYPEType <em>TRANSLATABLESTRINGTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRANSLATABLESTRINGTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATABLESTRINGTYPEType
	 * @generated
	 */
	EClass getTRANSLATABLESTRINGTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATABLESTRINGTYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATABLESTRINGTYPEType#getValueFormat()
	 * @see #getTRANSLATABLESTRINGTYPEType()
	 * @generated
	 */
	EAttribute getTRANSLATABLESTRINGTYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType <em>TRANSLATIONDATA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRANSLATIONDATA Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType
	 * @generated
	 */
	EClass getTRANSLATIONDATAType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getLanguage()
	 * @see #getTRANSLATIONDATAType()
	 * @generated
	 */
	EReference getTRANSLATIONDATAType_Language();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getResponsibleTranslator <em>Responsible Translator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible Translator</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getResponsibleTranslator()
	 * @see #getTRANSLATIONDATAType()
	 * @generated
	 */
	EReference getTRANSLATIONDATAType_ResponsibleTranslator();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getTranslationRevision <em>Translation Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translation Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getTranslationRevision()
	 * @see #getTRANSLATIONDATAType()
	 * @generated
	 */
	EAttribute getTRANSLATIONDATAType_TranslationRevision();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getDateOfCurrentTranslationRevision <em>Date Of Current Translation Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Current Translation Revision</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getDateOfCurrentTranslationRevision()
	 * @see #getTRANSLATIONDATAType()
	 * @generated
	 */
	EAttribute getTRANSLATIONDATAType_DateOfCurrentTranslationRevision();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType <em>TRANSLATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRANSLATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType
	 * @generated
	 */
	EClass getTRANSLATIONType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType#getTranslationData <em>Translation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translation Data</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType#getTranslationData()
	 * @see #getTRANSLATIONType()
	 * @generated
	 */
	EReference getTRANSLATIONType_TranslationData();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.UNITType <em>UNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UNIT Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.UNITType
	 * @generated
	 */
	EClass getUNITType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.URITYPEType <em>URITYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URITYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.URITYPEType
	 * @generated
	 */
	EClass getURITYPEType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.URITYPEType#getValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Format</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.URITYPEType#getValueFormat()
	 * @see #getURITYPEType()
	 * @generated
	 */
	EAttribute getURITYPEType_ValueFormat();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VCVRANGEType <em>VCVRANGE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCVRANGE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VCVRANGEType
	 * @generated
	 */
	EClass getVCVRANGEType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VCVRANGEType#getViewControlVariableRange <em>View Control Variable Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Control Variable Range</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VCVRANGEType#getViewControlVariableRange()
	 * @see #getVCVRANGEType()
	 * @generated
	 */
	EReference getVCVRANGEType_ViewControlVariableRange();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType <em>VIEWCONTROLVARIABLERANGE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VIEWCONTROLVARIABLERANGE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType
	 * @generated
	 */
	EClass getVIEWCONTROLVARIABLERANGEType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getParameterType()
	 * @see #getVIEWCONTROLVARIABLERANGEType()
	 * @generated
	 */
	EReference getVIEWCONTROLVARIABLERANGEType_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getRangeLobound <em>Range Lobound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Lobound</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getRangeLobound()
	 * @see #getVIEWCONTROLVARIABLERANGEType()
	 * @generated
	 */
	EAttribute getVIEWCONTROLVARIABLERANGEType_RangeLobound();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getRangeHibound <em>Range Hibound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Hibound</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getRangeHibound()
	 * @see #getVIEWCONTROLVARIABLERANGEType()
	 * @generated
	 */
	EAttribute getVIEWCONTROLVARIABLERANGEType_RangeHibound();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType <em>VIEWEXCHANGEPROTOCOLIDENTIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VIEWEXCHANGEPROTOCOLIDENTIFICATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType
	 * @generated
	 */
	EClass getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getSourceDocumentIdentifier <em>Source Document Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Document Identifier</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getSourceDocumentIdentifier()
	 * @see #getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_SourceDocumentIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getStatus()
	 * @see #getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Status();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getName()
	 * @see #getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Name();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getDate()
	 * @see #getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Date();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getApplication()
	 * @see #getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Application();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getLevel()
	 * @see #getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType()
	 * @generated
	 */
	EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Level();

	/**
	 * Returns the meta object for enum '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType <em>ILLUSTRATIONTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ILLUSTRATIONTYPE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType
	 * @generated
	 */
	EEnum getILLUSTRATIONTYPEType();

	/**
	 * Returns the meta object for enum '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType <em>SIPREFIX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SIPREFIX Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType
	 * @generated
	 */
	EEnum getSIPREFIXType();

	/**
	 * Returns the meta object for enum '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType <em>SIUNITNAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SIUNITNAME Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType
	 * @generated
	 */
	EEnum getSIUNITNAMEType();

	/**
	 * Returns the meta object for enum '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType <em>STANDARDSIZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STANDARDSIZE Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType
	 * @generated
	 */
	EEnum getSTANDARDSIZEType();

	/**
	 * Returns the meta object for enum '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType <em>VALUESPECIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VALUESPECIFICATION Type</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType
	 * @generated
	 */
	EEnum getVALUESPECIFICATIONType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ABSOLUTEURLTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ABSOLUTEURLTYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ABSOLUTE_URL_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getABSOLUTEURLTYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>APosteriori Semantic Relation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>APosteriori Semantic Relation Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='APosterioriSemanticRelationId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#CE\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#CE\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#CE\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getAPosterioriSemanticRelationId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ClassId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getClassId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Ref Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='class_ref_._type' baseType='ClassId' pattern='0112\\-1\\-\\-\\-13584_32_1#01\\-PLACEMENT#1'"
	 * @generated
	 */
	EDataType getClassRefType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Ref Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Ref Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='class_ref_._1_._type' baseType='ClassId' pattern='0112\\-1\\-\\-\\-13584_32_1#01\\-AXIS2_PLACEMENT_3D#1'"
	 * @generated
	 */
	EDataType getClassRefType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Ref Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Ref Type2</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='class_ref_._2_._type' baseType='ClassId' pattern='0112\\-1\\-\\-\\-13584_32_1#01\\-REPRESENTATION_REFERENCE#1'"
	 * @generated
	 */
	EDataType getClassRefType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Ref Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Ref Type3</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='class_ref_._3_._type' baseType='ClassId' pattern='0112\\-1\\-\\-\\-13584_32_1#01\\-AXIS2_PLACEMENT_2D#1'"
	 * @generated
	 */
	EDataType getClassRefType3();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Ref Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Ref Type4</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='class_ref_._4_._type' baseType='ClassId' pattern='0112\\-1\\-\\-\\-13584_32_1#01\\-PROGRAM_REFERENCE#1'"
	 * @generated
	 */
	EDataType getClassRefType4();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Ref Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Ref Type5</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='class_ref_._5_._type' baseType='ClassId' pattern='0112\\-1\\-\\-\\-13584_32_1#01\\-AXIS1_PLACEMENT#1'"
	 * @generated
	 */
	EDataType getClassRefType5();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Constraint Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Constraint Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ConstraintId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#04\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getConstraintId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>COUNTRYCODE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>COUNTRYCODE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='COUNTRY_CODE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='2' pattern='[^\\-]* [^\\s]*'"
	 * @generated
	 */
	EDataType getCOUNTRYCODEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>CURRENCYCODE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CURRENCYCODE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CURRENCY_CODE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='3'"
	 * @generated
	 */
	EDataType getCURRENCYCODEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Currency Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CurrencyId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#08\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getCurrencyId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Data Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DataTypeId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#09\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#09\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#09\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getDataTypeId();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>DATETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DATETYPE Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='DATE_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#date'"
	 * @generated
	 */
	EDataType getDATETYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>DETCLASSIFICATIONTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DETCLASSIFICATIONTYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DET_CLASSIFICATION_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='3'"
	 * @generated
	 */
	EDataType getDETCLASSIFICATIONTYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dic Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dic Unit Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DicUnitId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#05\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#05\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#05\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getDicUnitId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dic Value Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dic Value Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DicValueId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#07\\-([A-Z0-9:_\\.]{1,35})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#07\\-([A-Z0-9:_\\.]{1,35})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#07\\-([A-Z0-9:_\\.]{1,35})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getDicValueId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Document Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DocumentId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#10\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#10\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#10\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getDocumentId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>DOCUMENTIDENTIFIERNAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DOCUMENTIDENTIFIERNAME Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DOCUMENT_IDENTIFIER_NAME_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getDOCUMENTIDENTIFIERNAMEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Eptos GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Eptos GUID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='EptosGUID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='32'"
	 * @generated
	 */
	EDataType getEptosGUID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EXTERNALITEMCODETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EXTERNALITEMCODETYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='EXTERNAL_ITEM_CODE_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='18' pattern='[^\\-]* [^\\s]*'"
	 * @generated
	 */
	EDataType getEXTERNALITEMCODETYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Free Relation Definition Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Free Relation Definition Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FreeRelationDefinitionId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#ZB\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#ZB\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#ZB\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getFreeRelationDefinitionId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Free Relation End Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Free Relation End Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FreeRelationEndId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getFreeRelationEndId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>HTTPDIRECTORYNAMETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>HTTPDIRECTORYNAMETYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HTTP_DIRECTORY_NAME_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='128' pattern='[^\\s]*'"
	 * @generated
	 */
	EDataType getHTTPDIRECTORYNAMETYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>HTTPFILENAMETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>HTTPFILENAMETYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HTTP_FILE_NAME_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' maxLength='128' pattern='[^\\s]*'"
	 * @generated
	 */
	EDataType getHTTPFILENAMETYPEType();

	/**
	 * Returns the meta object for data type '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType <em>ILLUSTRATIONTYPE Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ILLUSTRATIONTYPE Type Object</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType
	 * @model instanceClass="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType"
	 *        extendedMetaData="name='ILLUSTRATION_TYPE_Type:Object' baseType='ILLUSTRATION_TYPE_Type'"
	 * @generated
	 */
	EDataType getILLUSTRATIONTYPETypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>KEYWORDREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>KEYWORDREFERENCE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='KEYWORD_REFERENCE_Type' baseType='ReusableNameId'"
	 * @generated
	 */
	EDataType getKEYWORDREFERENCEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>KEYWORDTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>KEYWORDTYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='KEYWORD_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getKEYWORDTYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>LANGUAGECODE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LANGUAGECODE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LANGUAGE_CODE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='2' maxLength='3' pattern='[^\\-]* [^\\s]*'"
	 * @generated
	 */
	EDataType getLANGUAGECODEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ontology Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ontology Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='OntologyId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#11\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#11\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#11\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getOntologyId();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>POSITIVELENGTHMEASURE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>POSITIVELENGTHMEASURE Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='POSITIVE_LENGTH_MEASURE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0.0'"
	 * @generated
	 */
	EDataType getPOSITIVELENGTHMEASUREType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>POSITIVEPLANEANGLEMEASURE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>POSITIVEPLANEANGLEMEASURE Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='POSITIVE_PLANE_ANGLE_MEASURE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getPOSITIVEPLANEANGLEMEASUREType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>POSITIVERATIOMEASURE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>POSITIVERATIOMEASURE Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='POSITIVE_RATIO_MEASURE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getPOSITIVERATIOMEASUREType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>PREFERREDNAMETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PREFERREDNAMETYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PREFERRED_NAME_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getPREFERREDNAMETYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>PROGRAMREFERENCENAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PROGRAMREFERENCENAME Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PROGRAM_REFERENCE_NAME_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[^\\-]* [^\\s]*'"
	 * @generated
	 */
	EDataType getPROGRAMREFERENCENAMEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Property Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PropertyId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getPropertyId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Reusable Name Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reusable Name Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ReusableNameId' baseType='urn:iso:std:iso:ts:29002:-5:ed-1:tech:xml-schema:identifier#IRDI_type' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#TM\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#Z6\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9} ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#TM\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}'"
	 * @generated
	 */
	EDataType getReusableNameId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>REVISIONTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>REVISIONTYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='REVISION_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='3'"
	 * @generated
	 */
	EDataType getREVISIONTYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SHORTNAMETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SHORTNAMETYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SHORT_NAME_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getSHORTNAMETYPEType();

	/**
	 * Returns the meta object for data type '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType <em>SIPREFIX Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SIPREFIX Type Object</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType
	 * @model instanceClass="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType"
	 *        extendedMetaData="name='SI_PREFIX_Type:Object' baseType='SI_PREFIX_Type'"
	 * @generated
	 */
	EDataType getSIPREFIXTypeObject();

	/**
	 * Returns the meta object for data type '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType <em>SIUNITNAME Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SIUNITNAME Type Object</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType
	 * @model instanceClass="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType"
	 *        extendedMetaData="name='SI_UNIT_NAME_Type:Object' baseType='SI_UNIT_NAME_Type'"
	 * @generated
	 */
	EDataType getSIUNITNAMETypeObject();

	/**
	 * Returns the meta object for data type '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType <em>STANDARDSIZE Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>STANDARDSIZE Type Object</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType
	 * @model instanceClass="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType"
	 *        extendedMetaData="name='STANDARD_SIZE_Type:Object' baseType='STANDARD_SIZE_Type'"
	 * @generated
	 */
	EDataType getSTANDARDSIZETypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>STATUS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>STATUS Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='STATUS_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[^\\-]* [^\\s]*'"
	 * @generated
	 */
	EDataType getSTATUSType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SUPPLIERCODETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SUPPLIERCODETYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SUPPLIER_CODE_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='70' pattern='[^\\-]* [^\\s]*'"
	 * @generated
	 */
	EDataType getSUPPLIERCODETYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Supplier Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Supplier Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SupplierId' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)? ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}) ([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})'"
	 * @generated
	 */
	EDataType getSupplierId();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SYNONYMOUSNAMETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SYNONYMOUSNAMETYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SYNONYMOUS_NAME_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getSYNONYMOUSNAMETYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SYNONYMREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SYNONYMREFERENCE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SYNONYM_REFERENCE_Type' baseType='ReusableNameId'"
	 * @generated
	 */
	EDataType getSYNONYMREFERENCEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>VALUECODETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VALUECODETYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VALUE_CODE_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='35' pattern='[^\\-]* [^\\s]*'"
	 * @generated
	 */
	EDataType getVALUECODETYPEType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>VALUEFORMATTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VALUEFORMATTYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VALUE_FORMAT_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='80'"
	 * @generated
	 */
	EDataType getVALUEFORMATTYPEType();

	/**
	 * Returns the meta object for data type '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType <em>VALUESPECIFICATION Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VALUESPECIFICATION Type Object</em>'.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType
	 * @model instanceClass="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType"
	 *        extendedMetaData="name='VALUE_SPECIFICATION_Type:Object' baseType='VALUE_SPECIFICATION_Type'"
	 * @generated
	 */
	EDataType getVALUESPECIFICATIONTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>VERSIONTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VERSIONTYPE Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VERSION_TYPE_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='9' pattern='[0-9]+'"
	 * @generated
	 */
	EDataType getVERSIONTYPEType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OntomlFactory getOntomlFactory();

} //OntomlPackage
