/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

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
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValueFactory
 * @model kind="package"
 * @generated
 */
public interface ValuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "value";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "value";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValuePackage eINSTANCE = iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl.init();

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.BagValueTypeImpl <em>Bag Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.BagValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getBagValueType()
	 * @generated
	 */
	int BAG_VALUE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__VALUE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__BAG_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__BOOLEAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__COMPLEX_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__COMPOSITE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__CONTROLLED_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__CURRENCY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__DATE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__DATE_TIME_VALUE = 9;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__FILE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__INTEGER_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__ITEM_REFERENCE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__LOCALIZED_TEXT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__MEASURE_RANGE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__NULL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__RATIONAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__REAL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__SEQUENCE_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__SET_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__TIME_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__YEAR_MONTH_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE__YEAR_VALUE = 24;

	/**
	 * The number of structural features of the '<em>Bag Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Bag Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.BooleanValueTypeImpl <em>Boolean Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.BooleanValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getBooleanValueType()
	 * @generated
	 */
	int BOOLEAN_VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Boolean Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boolean Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl <em>Combination Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getCombinationType()
	 * @generated
	 */
	int COMBINATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__VALUE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__BAG_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__BOOLEAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__COMPLEX_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__COMPOSITE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__CONTROLLED_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__CURRENCY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__DATE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__DATE_TIME_VALUE = 9;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__FILE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__INTEGER_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__ITEM_REFERENCE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__LOCALIZED_TEXT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__MEASURE_RANGE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__NULL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__RATIONAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__REAL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__SEQUENCE_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__SET_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__TIME_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__YEAR_MONTH_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE__YEAR_VALUE = 24;

	/**
	 * The number of structural features of the '<em>Combination Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Combination Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ComplexValueTypeImpl <em>Complex Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ComplexValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getComplexValueType()
	 * @generated
	 */
	int COMPLEX_VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Real Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE_TYPE__REAL_PART = 0;

	/**
	 * The feature id for the '<em><b>Imaginary Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE_TYPE__IMAGINARY_PART = 1;

	/**
	 * The number of structural features of the '<em>Complex Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Complex Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CompositeValueTypeImpl <em>Composite Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CompositeValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getCompositeValueType()
	 * @generated
	 */
	int COMPOSITE_VALUE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUE_TYPE__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Composite Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Composite Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl <em>Condition Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getConditionElementType()
	 * @generated
	 */
	int CONDITION_ELEMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__STRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__BAG_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__COMPLEX_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__CURRENCY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__DATE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE = 8;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__FILE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__INTEGER_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__NULL_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__RATIONAL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__REAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__SET_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__TIME_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__YEAR_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE__PROPERTY_REF = 24;

	/**
	 * The number of structural features of the '<em>Condition Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Condition Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ControlledValueTypeImpl <em>Controlled Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ControlledValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getControlledValueType()
	 * @generated
	 */
	int CONTROLLED_VALUE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_VALUE_TYPE__VALUE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_VALUE_TYPE__VALUE_REF = 1;

	/**
	 * The number of structural features of the '<em>Controlled Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Controlled Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CurrencyValueTypeImpl <em>Currency Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CurrencyValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getCurrencyValueType()
	 * @generated
	 */
	int CURRENCY_VALUE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_TYPE__REAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_TYPE__COMPLEX_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_TYPE__INTEGER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_TYPE__RATIONAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_TYPE__CURRENCY_CODE = 4;

	/**
	 * The feature id for the '<em><b>Currency Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_TYPE__CURRENCY_REF = 5;

	/**
	 * The number of structural features of the '<em>Currency Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Currency Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DateTimeValueTypeImpl <em>Date Time Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DateTimeValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getDateTimeValueType()
	 * @generated
	 */
	int DATE_TIME_VALUE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Date Time Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Date Time Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DateValueTypeImpl <em>Date Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DateValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getDateValueType()
	 * @generated
	 */
	int DATE_VALUE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Date Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Date Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 10;

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
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BAG_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Combination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMBINATION = 5;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPLEX_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPOSITE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTROLLED_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_TIME_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENVIRONMENT = 12;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILE_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTEGER_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM_REFERENCE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEASURE_RANGE_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NULL_VALUE = 20;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ONE_OF = 21;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RATIONAL_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REAL_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEQUENCE_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SET_VALUE = 25;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_VALUE = 27;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__YEAR_MONTH_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__YEAR_VALUE = 29;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 30;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.EnvironmentTypeImpl <em>Environment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.EnvironmentTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getEnvironmentType()
	 * @generated
	 */
	int ENVIRONMENT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__PROPERTY_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Environment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Environment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.FieldTypeImpl <em>Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.FieldTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 12;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__STRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__BAG_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__BOOLEAN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__COMPLEX_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__COMPOSITE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__CONTROLLED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__CURRENCY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__DATE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__DATE_TIME_VALUE = 8;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__FILE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__INTEGER_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__ITEM_REFERENCE_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__LOCALIZED_TEXT_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__MEASURE_RANGE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__NULL_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__RATIONAL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__REAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__SEQUENCE_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__SET_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__TIME_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__YEAR_MONTH_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__YEAR_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__PROPERTY_REF = 24;

	/**
	 * The number of structural features of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.FileValueTypeImpl <em>File Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.FileValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getFileValueType()
	 * @generated
	 */
	int FILE_VALUE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_VALUE_TYPE__URI = 0;

	/**
	 * The number of structural features of the '<em>File Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.IntegerValueTypeImpl <em>Integer Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.IntegerValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getIntegerValueType()
	 * @generated
	 */
	int INTEGER_VALUE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Integer Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Integer Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ItemReferenceValueTypeImpl <em>Item Reference Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ItemReferenceValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getItemReferenceValueType()
	 * @generated
	 */
	int ITEM_REFERENCE_VALUE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Item Local Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REFERENCE_VALUE_TYPE__ITEM_LOCAL_REF = 0;

	/**
	 * The number of structural features of the '<em>Item Reference Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REFERENCE_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item Reference Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REFERENCE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.LocalizedTextValueTypeImpl <em>Localized Text Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.LocalizedTextValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getLocalizedTextValueType()
	 * @generated
	 */
	int LOCALIZED_TEXT_VALUE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_VALUE_TYPE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Localized Text Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Localized Text Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureValueTypeImpl <em>Measure Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getMeasureValueType()
	 * @generated
	 */
	int MEASURE_VALUE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Presentation UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Presentation UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF = 1;

	/**
	 * The feature id for the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_TYPE__UOM_CODE = 2;

	/**
	 * The feature id for the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_TYPE__UOM_REF = 3;

	/**
	 * The number of structural features of the '<em>Measure Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Measure Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureQualifiedNumberValueTypeImpl <em>Measure Qualified Number Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureQualifiedNumberValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getMeasureQualifiedNumberValueType()
	 * @generated
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Presentation UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__PRESENTATION_UOM_CODE = MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE;

	/**
	 * The feature id for the '<em><b>Presentation UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__PRESENTATION_UOM_REF = MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF;

	/**
	 * The feature id for the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__UOM_CODE = MEASURE_VALUE_TYPE__UOM_CODE;

	/**
	 * The feature id for the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__UOM_REF = MEASURE_VALUE_TYPE__UOM_REF;

	/**
	 * The feature id for the '<em><b>Qualified Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__QUALIFIED_VALUE = MEASURE_VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Qualified Number Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_TYPE_FEATURE_COUNT = MEASURE_VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measure Qualified Number Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_TYPE_OPERATION_COUNT = MEASURE_VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureRangeValueTypeImpl <em>Measure Range Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureRangeValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getMeasureRangeValueType()
	 * @generated
	 */
	int MEASURE_RANGE_VALUE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Presentation UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_TYPE__PRESENTATION_UOM_CODE = MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE;

	/**
	 * The feature id for the '<em><b>Presentation UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_TYPE__PRESENTATION_UOM_REF = MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF;

	/**
	 * The feature id for the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_TYPE__UOM_CODE = MEASURE_VALUE_TYPE__UOM_CODE;

	/**
	 * The feature id for the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_TYPE__UOM_REF = MEASURE_VALUE_TYPE__UOM_REF;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_TYPE__LOWER_VALUE = MEASURE_VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_TYPE__UPPER_VALUE = MEASURE_VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measure Range Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_TYPE_FEATURE_COUNT = MEASURE_VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measure Range Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_TYPE_OPERATION_COUNT = MEASURE_VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureSingleNumberValueTypeImpl <em>Measure Single Number Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureSingleNumberValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getMeasureSingleNumberValueType()
	 * @generated
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Presentation UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE__PRESENTATION_UOM_CODE = MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE;

	/**
	 * The feature id for the '<em><b>Presentation UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE__PRESENTATION_UOM_REF = MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF;

	/**
	 * The feature id for the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE__UOM_CODE = MEASURE_VALUE_TYPE__UOM_CODE;

	/**
	 * The feature id for the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE__UOM_REF = MEASURE_VALUE_TYPE__UOM_REF;

	/**
	 * The feature id for the '<em><b>Presentation Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE__PRESENTATION_VALUE = MEASURE_VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE__REAL_VALUE = MEASURE_VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE__COMPLEX_VALUE = MEASURE_VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE__INTEGER_VALUE = MEASURE_VALUE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE__RATIONAL_VALUE = MEASURE_VALUE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Measure Single Number Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE_FEATURE_COUNT = MEASURE_VALUE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Measure Single Number Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_TYPE_OPERATION_COUNT = MEASURE_VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.NullValueTypeImpl <em>Null Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.NullValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getNullValueType()
	 * @generated
	 */
	int NULL_VALUE_TYPE = 21;

	/**
	 * The number of structural features of the '<em>Null Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Null Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.NumericValueTypeImpl <em>Numeric Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.NumericValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getNumericValueType()
	 * @generated
	 */
	int NUMERIC_VALUE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Presentation Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_TYPE__PRESENTATION_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_TYPE__REAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_TYPE__COMPLEX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_TYPE__INTEGER_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_TYPE__RATIONAL_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Numeric Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Numeric Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.OneOfTypeImpl <em>One Of Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.OneOfTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getOneOfType()
	 * @generated
	 */
	int ONE_OF_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Combination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__COMBINATION = 1;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__STRING_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__BAG_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__BOOLEAN_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__COMPLEX_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__COMPOSITE_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__CONTROLLED_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__CURRENCY_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__DATE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__DATE_TIME_VALUE = 10;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__FILE_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__INTEGER_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__ITEM_REFERENCE_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__LOCALIZED_TEXT_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__MEASURE_RANGE_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__NULL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__RATIONAL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__REAL_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__SEQUENCE_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__SET_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__TIME_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__YEAR_MONTH_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE__YEAR_VALUE = 25;

	/**
	 * The number of structural features of the '<em>One Of Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>One Of Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.PresentationValueTypeImpl <em>Presentation Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.PresentationValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getPresentationValueType()
	 * @generated
	 */
	int PRESENTATION_VALUE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_VALUE_TYPE__REAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_VALUE_TYPE__COMPLEX_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_VALUE_TYPE__INTEGER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_VALUE_TYPE__RATIONAL_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Presentation Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_VALUE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Presentation Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl <em>Qualified Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getQualifiedValueType()
	 * @generated
	 */
	int QUALIFIED_VALUE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Presentation Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_TYPE__REAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_TYPE__COMPLEX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_TYPE__INTEGER_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_TYPE__RATIONAL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Qualifier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_TYPE__QUALIFIER_CODE = 5;

	/**
	 * The feature id for the '<em><b>Qualifier Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_TYPE__QUALIFIER_REF = 6;

	/**
	 * The number of structural features of the '<em>Qualified Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Qualified Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RationalValueTypeImpl <em>Rational Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RationalValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getRationalValueType()
	 * @generated
	 */
	int RATIONAL_VALUE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Whole Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE_TYPE__WHOLE_PART = 0;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE_TYPE__NUMERATOR = 1;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE_TYPE__DENOMINATOR = 2;

	/**
	 * The number of structural features of the '<em>Rational Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rational Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RealValueTypeImpl <em>Real Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RealValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getRealValueType()
	 * @generated
	 */
	int REAL_VALUE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Real Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Real Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.SequenceValueTypeImpl <em>Sequence Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.SequenceValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getSequenceValueType()
	 * @generated
	 */
	int SEQUENCE_VALUE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Value Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__VALUE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__BAG_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__BOOLEAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__COMPLEX_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__COMPOSITE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__CONTROLLED_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__CURRENCY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__DATE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__DATE_TIME_VALUE = 9;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__FILE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__INTEGER_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__ITEM_REFERENCE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__LOCALIZED_TEXT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__MEASURE_RANGE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__NULL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__RATIONAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__REAL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__SEQUENCE_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__SET_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__TIME_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__YEAR_MONTH_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE__YEAR_VALUE = 24;

	/**
	 * The number of structural features of the '<em>Sequence Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Sequence Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.SetValueTypeImpl <em>Set Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.SetValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getSetValueType()
	 * @generated
	 */
	int SET_VALUE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Value Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__VALUE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__BAG_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__BOOLEAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__COMPLEX_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__COMPOSITE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__CONTROLLED_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__CURRENCY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__DATE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__DATE_TIME_VALUE = 9;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__FILE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__INTEGER_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__ITEM_REFERENCE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__LOCALIZED_TEXT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__MEASURE_RANGE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__NULL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__RATIONAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__REAL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__SEQUENCE_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__SET_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__TIME_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__YEAR_MONTH_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE__YEAR_VALUE = 24;

	/**
	 * The number of structural features of the '<em>Set Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Set Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.StringValueTypeImpl <em>String Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.StringValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getStringValueType()
	 * @generated
	 */
	int STRING_VALUE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>String Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>String Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.TimeValueTypeImpl <em>Time Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.TimeValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getTimeValueType()
	 * @generated
	 */
	int TIME_VALUE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Time Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.YearMonthValueTypeImpl <em>Year Month Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.YearMonthValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getYearMonthValueType()
	 * @generated
	 */
	int YEAR_MONTH_VALUE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Year Month Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Year Month Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.YearValueTypeImpl <em>Year Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.YearValueTypeImpl
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getYearValueType()
	 * @generated
	 */
	int YEAR_VALUE_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Year Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Year Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_VALUE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType <em>Bag Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType
	 * @generated
	 */
	EClass getBagValueType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getValueGroup <em>Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value Group</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getValueGroup()
	 * @see #getBagValueType()
	 * @generated
	 */
	EAttribute getBagValueType_ValueGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getStringValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_StringValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getBagValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_BagValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getBooleanValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getComplexValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getCompositeValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getControlledValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getCurrencyValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getDateValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_DateValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getDateTimeValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getFileValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_FileValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getIntegerValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getItemReferenceValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getLocalizedTextValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getMeasureQualifiedNumberValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getMeasureRangeValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getMeasureSingleNumberValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getNullValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_NullValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getRationalValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_RationalValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getRealValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_RealValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getSequenceValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getSetValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_SetValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getTimeValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_TimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getYearMonthValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType#getYearValue()
	 * @see #getBagValueType()
	 * @generated
	 */
	EReference getBagValueType_YearValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType <em>Boolean Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType
	 * @generated
	 */
	EClass getBooleanValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType#isValue()
	 * @see #getBooleanValueType()
	 * @generated
	 */
	EAttribute getBooleanValueType_Value();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType <em>Combination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combination Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType
	 * @generated
	 */
	EClass getCombinationType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getValueGroup <em>Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value Group</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getValueGroup()
	 * @see #getCombinationType()
	 * @generated
	 */
	EAttribute getCombinationType_ValueGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getStringValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_StringValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getBagValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_BagValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getBooleanValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getComplexValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getCompositeValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getControlledValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getCurrencyValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getDateValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_DateValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getDateTimeValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getFileValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_FileValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getIntegerValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getItemReferenceValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getLocalizedTextValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getMeasureQualifiedNumberValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getMeasureRangeValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getMeasureSingleNumberValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getNullValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_NullValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getRationalValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_RationalValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getRealValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_RealValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getSequenceValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getSetValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_SetValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getTimeValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_TimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getYearMonthValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType#getYearValue()
	 * @see #getCombinationType()
	 * @generated
	 */
	EReference getCombinationType_YearValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType <em>Complex Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType
	 * @generated
	 */
	EClass getComplexValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getRealPart <em>Real Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Part</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getRealPart()
	 * @see #getComplexValueType()
	 * @generated
	 */
	EAttribute getComplexValueType_RealPart();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getImaginaryPart <em>Imaginary Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imaginary Part</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getImaginaryPart()
	 * @see #getComplexValueType()
	 * @generated
	 */
	EAttribute getComplexValueType_ImaginaryPart();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType <em>Composite Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType
	 * @generated
	 */
	EClass getCompositeValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType#getField()
	 * @see #getCompositeValueType()
	 * @generated
	 */
	EReference getCompositeValueType_Field();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType <em>Condition Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Element Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType
	 * @generated
	 */
	EClass getConditionElementType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getStringValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_StringValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bag Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getBagValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_BagValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getBooleanValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getComplexValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getCompositeValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controlled Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getControlledValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getCurrencyValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getDateValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_DateValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getDateTimeValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getFileValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_FileValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getIntegerValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getItemReferenceValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getLocalizedTextValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getMeasureQualifiedNumberValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getMeasureRangeValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getMeasureSingleNumberValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getNullValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_NullValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getRationalValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_RationalValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getRealValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getSequenceValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getSetValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_SetValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getTimeValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_TimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Month Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getYearMonthValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getYearValue()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EReference getConditionElementType_YearValue();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType#getPropertyRef()
	 * @see #getConditionElementType()
	 * @generated
	 */
	EAttribute getConditionElementType_PropertyRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType <em>Controlled Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlled Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType
	 * @generated
	 */
	EClass getControlledValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType#getValueCode <em>Value Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Code</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType#getValueCode()
	 * @see #getControlledValueType()
	 * @generated
	 */
	EAttribute getControlledValueType_ValueCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType#getValueRef()
	 * @see #getControlledValueType()
	 * @generated
	 */
	EAttribute getControlledValueType_ValueRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType <em>Currency Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType
	 * @generated
	 */
	EClass getCurrencyValueType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getRealValue()
	 * @see #getCurrencyValueType()
	 * @generated
	 */
	EReference getCurrencyValueType_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getComplexValue()
	 * @see #getCurrencyValueType()
	 * @generated
	 */
	EReference getCurrencyValueType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getIntegerValue()
	 * @see #getCurrencyValueType()
	 * @generated
	 */
	EReference getCurrencyValueType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getRationalValue()
	 * @see #getCurrencyValueType()
	 * @generated
	 */
	EReference getCurrencyValueType_RationalValue();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getCurrencyCode()
	 * @see #getCurrencyValueType()
	 * @generated
	 */
	EAttribute getCurrencyValueType_CurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getCurrencyRef <em>Currency Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getCurrencyRef()
	 * @see #getCurrencyValueType()
	 * @generated
	 */
	EAttribute getCurrencyValueType_CurrencyRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType <em>Date Time Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType
	 * @generated
	 */
	EClass getDateTimeValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType#getValue()
	 * @see #getDateTimeValueType()
	 * @generated
	 */
	EAttribute getDateTimeValueType_Value();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType <em>Date Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType
	 * @generated
	 */
	EClass getDateValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType#getValue()
	 * @see #getDateValueType()
	 * @generated
	 */
	EAttribute getDateValueType_Value();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bag Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getBagValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BagValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getBooleanValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BooleanValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getCombination <em>Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combination</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getCombination()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Combination();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getComplexValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getCompositeValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompositeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controlled Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getControlledValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ControlledValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getCurrencyValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getDateTimeValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getDateValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getEnvironment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getFileValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FileValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getIntegerValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getItemReferenceValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getLocalizedTextValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getMeasureQualifiedNumberValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getMeasureRangeValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getMeasureSingleNumberValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getNullValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NullValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One Of</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getOneOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OneOf();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getRationalValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RationalValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getRealValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getSequenceValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SequenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getSetValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SetValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getStringValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StringValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getTimeValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Month Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getYearMonthValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot#getYearValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_YearValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.EnvironmentType
	 * @generated
	 */
	EClass getEnvironmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.EnvironmentType#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.EnvironmentType#getPropertyValue()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EReference getEnvironmentType_PropertyValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType
	 * @generated
	 */
	EClass getFieldType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getStringValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_StringValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bag Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getBagValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_BagValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getBooleanValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getComplexValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getCompositeValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controlled Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getControlledValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getCurrencyValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getDateValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_DateValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getDateTimeValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getFileValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_FileValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getIntegerValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getItemReferenceValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getLocalizedTextValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureQualifiedNumberValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureRangeValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureSingleNumberValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getNullValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_NullValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getRationalValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_RationalValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getRealValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getSequenceValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getSetValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_SetValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getTimeValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_TimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Month Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getYearMonthValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getYearValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_YearValue();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getPropertyRef()
	 * @see #getFieldType()
	 * @generated
	 */
	EAttribute getFieldType_PropertyRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType <em>File Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType
	 * @generated
	 */
	EClass getFileValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType#getURI()
	 * @see #getFileValueType()
	 * @generated
	 */
	EAttribute getFileValueType_URI();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType <em>Integer Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType
	 * @generated
	 */
	EClass getIntegerValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType#getValue()
	 * @see #getIntegerValueType()
	 * @generated
	 */
	EAttribute getIntegerValueType_Value();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType <em>Item Reference Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Reference Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType
	 * @generated
	 */
	EClass getItemReferenceValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType#getItemLocalRef <em>Item Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Local Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType#getItemLocalRef()
	 * @see #getItemReferenceValueType()
	 * @generated
	 */
	EAttribute getItemReferenceValueType_ItemLocalRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType <em>Localized Text Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localized Text Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType
	 * @generated
	 */
	EClass getLocalizedTextValueType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType#getContent()
	 * @see #getLocalizedTextValueType()
	 * @generated
	 */
	EReference getLocalizedTextValueType_Content();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType <em>Measure Qualified Number Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Qualified Number Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType
	 * @generated
	 */
	EClass getMeasureQualifiedNumberValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType#getQualifiedValue <em>Qualified Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualified Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType#getQualifiedValue()
	 * @see #getMeasureQualifiedNumberValueType()
	 * @generated
	 */
	EReference getMeasureQualifiedNumberValueType_QualifiedValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType <em>Measure Range Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Range Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType
	 * @generated
	 */
	EClass getMeasureRangeValueType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType#getLowerValue()
	 * @see #getMeasureRangeValueType()
	 * @generated
	 */
	EReference getMeasureRangeValueType_LowerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType#getUpperValue <em>Upper Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType#getUpperValue()
	 * @see #getMeasureRangeValueType()
	 * @generated
	 */
	EReference getMeasureRangeValueType_UpperValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType <em>Measure Single Number Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Single Number Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType
	 * @generated
	 */
	EClass getMeasureSingleNumberValueType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getPresentationValue <em>Presentation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getPresentationValue()
	 * @see #getMeasureSingleNumberValueType()
	 * @generated
	 */
	EReference getMeasureSingleNumberValueType_PresentationValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getRealValue()
	 * @see #getMeasureSingleNumberValueType()
	 * @generated
	 */
	EReference getMeasureSingleNumberValueType_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getComplexValue()
	 * @see #getMeasureSingleNumberValueType()
	 * @generated
	 */
	EReference getMeasureSingleNumberValueType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getIntegerValue()
	 * @see #getMeasureSingleNumberValueType()
	 * @generated
	 */
	EReference getMeasureSingleNumberValueType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType#getRationalValue()
	 * @see #getMeasureSingleNumberValueType()
	 * @generated
	 */
	EReference getMeasureSingleNumberValueType_RationalValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType <em>Measure Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType
	 * @generated
	 */
	EClass getMeasureValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getPresentationUOMCode <em>Presentation UOM Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation UOM Code</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getPresentationUOMCode()
	 * @see #getMeasureValueType()
	 * @generated
	 */
	EAttribute getMeasureValueType_PresentationUOMCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getPresentationUOMRef <em>Presentation UOM Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation UOM Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getPresentationUOMRef()
	 * @see #getMeasureValueType()
	 * @generated
	 */
	EAttribute getMeasureValueType_PresentationUOMRef();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getUOMCode <em>UOM Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UOM Code</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getUOMCode()
	 * @see #getMeasureValueType()
	 * @generated
	 */
	EAttribute getMeasureValueType_UOMCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getUOMRef <em>UOM Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UOM Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getUOMRef()
	 * @see #getMeasureValueType()
	 * @generated
	 */
	EAttribute getMeasureValueType_UOMRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NullValueType <em>Null Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NullValueType
	 * @generated
	 */
	EClass getNullValueType();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType <em>Numeric Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType
	 * @generated
	 */
	EClass getNumericValueType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getPresentationValue <em>Presentation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getPresentationValue()
	 * @see #getNumericValueType()
	 * @generated
	 */
	EReference getNumericValueType_PresentationValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getRealValue()
	 * @see #getNumericValueType()
	 * @generated
	 */
	EReference getNumericValueType_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getComplexValue()
	 * @see #getNumericValueType()
	 * @generated
	 */
	EReference getNumericValueType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getIntegerValue()
	 * @see #getNumericValueType()
	 * @generated
	 */
	EReference getNumericValueType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType#getRationalValue()
	 * @see #getNumericValueType()
	 * @generated
	 */
	EReference getNumericValueType_RationalValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType <em>One Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Of Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType
	 * @generated
	 */
	EClass getOneOfType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getGroup()
	 * @see #getOneOfType()
	 * @generated
	 */
	EAttribute getOneOfType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getCombination <em>Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combination</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getCombination()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_Combination();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getStringValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_StringValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getBagValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_BagValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getBooleanValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getComplexValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getCompositeValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getControlledValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getCurrencyValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getDateValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_DateValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getDateTimeValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getFileValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_FileValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getIntegerValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getItemReferenceValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getLocalizedTextValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getMeasureQualifiedNumberValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getMeasureRangeValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getMeasureSingleNumberValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getNullValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_NullValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getRationalValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_RationalValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getRealValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_RealValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getSequenceValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getSetValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_SetValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getTimeValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_TimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getYearMonthValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType#getYearValue()
	 * @see #getOneOfType()
	 * @generated
	 */
	EReference getOneOfType_YearValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType <em>Presentation Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType
	 * @generated
	 */
	EClass getPresentationValueType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType#getRealValue()
	 * @see #getPresentationValueType()
	 * @generated
	 */
	EReference getPresentationValueType_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType#getComplexValue()
	 * @see #getPresentationValueType()
	 * @generated
	 */
	EReference getPresentationValueType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType#getIntegerValue()
	 * @see #getPresentationValueType()
	 * @generated
	 */
	EReference getPresentationValueType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType#getRationalValue()
	 * @see #getPresentationValueType()
	 * @generated
	 */
	EReference getPresentationValueType_RationalValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType <em>Qualified Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType
	 * @generated
	 */
	EClass getQualifiedValueType();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getPresentationValue <em>Presentation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getPresentationValue()
	 * @see #getQualifiedValueType()
	 * @generated
	 */
	EReference getQualifiedValueType_PresentationValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getRealValue()
	 * @see #getQualifiedValueType()
	 * @generated
	 */
	EReference getQualifiedValueType_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getComplexValue()
	 * @see #getQualifiedValueType()
	 * @generated
	 */
	EReference getQualifiedValueType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getIntegerValue()
	 * @see #getQualifiedValueType()
	 * @generated
	 */
	EReference getQualifiedValueType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getRationalValue()
	 * @see #getQualifiedValueType()
	 * @generated
	 */
	EReference getQualifiedValueType_RationalValue();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getQualifierCode <em>Qualifier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier Code</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getQualifierCode()
	 * @see #getQualifiedValueType()
	 * @generated
	 */
	EAttribute getQualifiedValueType_QualifierCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getQualifierRef <em>Qualifier Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier Ref</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getQualifierRef()
	 * @see #getQualifiedValueType()
	 * @generated
	 */
	EAttribute getQualifiedValueType_QualifierRef();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType <em>Rational Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rational Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType
	 * @generated
	 */
	EClass getRationalValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getWholePart <em>Whole Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whole Part</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getWholePart()
	 * @see #getRationalValueType()
	 * @generated
	 */
	EAttribute getRationalValueType_WholePart();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numerator</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getNumerator()
	 * @see #getRationalValueType()
	 * @generated
	 */
	EAttribute getRationalValueType_Numerator();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denominator</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getDenominator()
	 * @see #getRationalValueType()
	 * @generated
	 */
	EAttribute getRationalValueType_Denominator();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType <em>Real Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType
	 * @generated
	 */
	EClass getRealValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType#getValue()
	 * @see #getRealValueType()
	 * @generated
	 */
	EAttribute getRealValueType_Value();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType <em>Sequence Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType
	 * @generated
	 */
	EClass getSequenceValueType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getValueGroup <em>Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value Group</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getValueGroup()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EAttribute getSequenceValueType_ValueGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getStringValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_StringValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getBagValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_BagValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getBooleanValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getComplexValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getCompositeValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getControlledValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getCurrencyValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getDateValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_DateValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getDateTimeValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getFileValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_FileValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getIntegerValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getItemReferenceValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getLocalizedTextValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getMeasureQualifiedNumberValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getMeasureRangeValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getMeasureSingleNumberValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getNullValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_NullValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getRationalValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_RationalValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getRealValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_RealValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getSequenceValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getSetValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_SetValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getTimeValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_TimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getYearMonthValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType#getYearValue()
	 * @see #getSequenceValueType()
	 * @generated
	 */
	EReference getSequenceValueType_YearValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType <em>Set Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType
	 * @generated
	 */
	EClass getSetValueType();

	/**
	 * Returns the meta object for the attribute list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getValueGroup <em>Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value Group</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getValueGroup()
	 * @see #getSetValueType()
	 * @generated
	 */
	EAttribute getSetValueType_ValueGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getStringValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_StringValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getBagValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_BagValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getBooleanValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_BooleanValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getComplexValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_ComplexValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getCompositeValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_CompositeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getControlledValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_ControlledValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getCurrencyValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getDateValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_DateValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getDateTimeValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getFileValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_FileValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getIntegerValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_IntegerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getItemReferenceValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getLocalizedTextValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getMeasureQualifiedNumberValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getMeasureRangeValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getMeasureSingleNumberValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getNullValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_NullValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getRationalValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_RationalValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getRealValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_RealValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getSequenceValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_SequenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getSetValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_SetValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getTimeValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_TimeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getYearMonthValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getYearValue()
	 * @see #getSetValueType()
	 * @generated
	 */
	EReference getSetValueType_YearValue();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType <em>String Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType
	 * @generated
	 */
	EClass getStringValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType#getValue()
	 * @see #getStringValueType()
	 * @generated
	 */
	EAttribute getStringValueType_Value();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType <em>Time Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType
	 * @generated
	 */
	EClass getTimeValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType#getValue()
	 * @see #getTimeValueType()
	 * @generated
	 */
	EAttribute getTimeValueType_Value();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType <em>Year Month Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year Month Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType
	 * @generated
	 */
	EClass getYearMonthValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType#getValue()
	 * @see #getYearMonthValueType()
	 * @generated
	 */
	EAttribute getYearMonthValueType_Value();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType <em>Year Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year Value Type</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType
	 * @generated
	 */
	EClass getYearValueType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType#getValue()
	 * @see #getYearValueType()
	 * @generated
	 */
	EAttribute getYearValueType_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValueFactory getValueFactory();

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
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.BagValueTypeImpl <em>Bag Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.BagValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getBagValueType()
		 * @generated
		 */
		EClass BAG_VALUE_TYPE = eINSTANCE.getBagValueType();

		/**
		 * The meta object literal for the '<em><b>Value Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAG_VALUE_TYPE__VALUE_GROUP = eINSTANCE.getBagValueType_ValueGroup();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__STRING_VALUE = eINSTANCE.getBagValueType_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__BAG_VALUE = eINSTANCE.getBagValueType_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__BOOLEAN_VALUE = eINSTANCE.getBagValueType_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__COMPLEX_VALUE = eINSTANCE.getBagValueType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__COMPOSITE_VALUE = eINSTANCE.getBagValueType_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__CONTROLLED_VALUE = eINSTANCE.getBagValueType_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__CURRENCY_VALUE = eINSTANCE.getBagValueType_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__DATE_VALUE = eINSTANCE.getBagValueType_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__DATE_TIME_VALUE = eINSTANCE.getBagValueType_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__FILE_VALUE = eINSTANCE.getBagValueType_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__INTEGER_VALUE = eINSTANCE.getBagValueType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__ITEM_REFERENCE_VALUE = eINSTANCE.getBagValueType_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__LOCALIZED_TEXT_VALUE = eINSTANCE.getBagValueType_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getBagValueType_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__MEASURE_RANGE_VALUE = eINSTANCE.getBagValueType_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getBagValueType_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__NULL_VALUE = eINSTANCE.getBagValueType_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__RATIONAL_VALUE = eINSTANCE.getBagValueType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__REAL_VALUE = eINSTANCE.getBagValueType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__SEQUENCE_VALUE = eINSTANCE.getBagValueType_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__SET_VALUE = eINSTANCE.getBagValueType_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__TIME_VALUE = eINSTANCE.getBagValueType_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__YEAR_MONTH_VALUE = eINSTANCE.getBagValueType_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE_TYPE__YEAR_VALUE = eINSTANCE.getBagValueType_YearValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.BooleanValueTypeImpl <em>Boolean Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.BooleanValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getBooleanValueType()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_TYPE = eINSTANCE.getBooleanValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_TYPE__VALUE = eINSTANCE.getBooleanValueType_Value();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl <em>Combination Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getCombinationType()
		 * @generated
		 */
		EClass COMBINATION_TYPE = eINSTANCE.getCombinationType();

		/**
		 * The meta object literal for the '<em><b>Value Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINATION_TYPE__VALUE_GROUP = eINSTANCE.getCombinationType_ValueGroup();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__STRING_VALUE = eINSTANCE.getCombinationType_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__BAG_VALUE = eINSTANCE.getCombinationType_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__BOOLEAN_VALUE = eINSTANCE.getCombinationType_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__COMPLEX_VALUE = eINSTANCE.getCombinationType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__COMPOSITE_VALUE = eINSTANCE.getCombinationType_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__CONTROLLED_VALUE = eINSTANCE.getCombinationType_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__CURRENCY_VALUE = eINSTANCE.getCombinationType_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__DATE_VALUE = eINSTANCE.getCombinationType_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__DATE_TIME_VALUE = eINSTANCE.getCombinationType_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__FILE_VALUE = eINSTANCE.getCombinationType_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__INTEGER_VALUE = eINSTANCE.getCombinationType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__ITEM_REFERENCE_VALUE = eINSTANCE.getCombinationType_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__LOCALIZED_TEXT_VALUE = eINSTANCE.getCombinationType_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getCombinationType_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__MEASURE_RANGE_VALUE = eINSTANCE.getCombinationType_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getCombinationType_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__NULL_VALUE = eINSTANCE.getCombinationType_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__RATIONAL_VALUE = eINSTANCE.getCombinationType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__REAL_VALUE = eINSTANCE.getCombinationType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__SEQUENCE_VALUE = eINSTANCE.getCombinationType_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__SET_VALUE = eINSTANCE.getCombinationType_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__TIME_VALUE = eINSTANCE.getCombinationType_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__YEAR_MONTH_VALUE = eINSTANCE.getCombinationType_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_TYPE__YEAR_VALUE = eINSTANCE.getCombinationType_YearValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ComplexValueTypeImpl <em>Complex Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ComplexValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getComplexValueType()
		 * @generated
		 */
		EClass COMPLEX_VALUE_TYPE = eINSTANCE.getComplexValueType();

		/**
		 * The meta object literal for the '<em><b>Real Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_VALUE_TYPE__REAL_PART = eINSTANCE.getComplexValueType_RealPart();

		/**
		 * The meta object literal for the '<em><b>Imaginary Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_VALUE_TYPE__IMAGINARY_PART = eINSTANCE.getComplexValueType_ImaginaryPart();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CompositeValueTypeImpl <em>Composite Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CompositeValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getCompositeValueType()
		 * @generated
		 */
		EClass COMPOSITE_VALUE_TYPE = eINSTANCE.getCompositeValueType();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_VALUE_TYPE__FIELD = eINSTANCE.getCompositeValueType_Field();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl <em>Condition Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getConditionElementType()
		 * @generated
		 */
		EClass CONDITION_ELEMENT_TYPE = eINSTANCE.getConditionElementType();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__STRING_VALUE = eINSTANCE.getConditionElementType_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__BAG_VALUE = eINSTANCE.getConditionElementType_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE = eINSTANCE.getConditionElementType_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__COMPLEX_VALUE = eINSTANCE.getConditionElementType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE = eINSTANCE.getConditionElementType_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE = eINSTANCE.getConditionElementType_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__CURRENCY_VALUE = eINSTANCE.getConditionElementType_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__DATE_VALUE = eINSTANCE.getConditionElementType_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE = eINSTANCE.getConditionElementType_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__FILE_VALUE = eINSTANCE.getConditionElementType_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__INTEGER_VALUE = eINSTANCE.getConditionElementType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE = eINSTANCE.getConditionElementType_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE = eINSTANCE.getConditionElementType_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getConditionElementType_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE = eINSTANCE.getConditionElementType_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getConditionElementType_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__NULL_VALUE = eINSTANCE.getConditionElementType_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__RATIONAL_VALUE = eINSTANCE.getConditionElementType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__REAL_VALUE = eINSTANCE.getConditionElementType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE = eINSTANCE.getConditionElementType_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__SET_VALUE = eINSTANCE.getConditionElementType_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__TIME_VALUE = eINSTANCE.getConditionElementType_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE = eINSTANCE.getConditionElementType_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT_TYPE__YEAR_VALUE = eINSTANCE.getConditionElementType_YearValue();

		/**
		 * The meta object literal for the '<em><b>Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_ELEMENT_TYPE__PROPERTY_REF = eINSTANCE.getConditionElementType_PropertyRef();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ControlledValueTypeImpl <em>Controlled Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ControlledValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getControlledValueType()
		 * @generated
		 */
		EClass CONTROLLED_VALUE_TYPE = eINSTANCE.getControlledValueType();

		/**
		 * The meta object literal for the '<em><b>Value Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLED_VALUE_TYPE__VALUE_CODE = eINSTANCE.getControlledValueType_ValueCode();

		/**
		 * The meta object literal for the '<em><b>Value Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLED_VALUE_TYPE__VALUE_REF = eINSTANCE.getControlledValueType_ValueRef();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CurrencyValueTypeImpl <em>Currency Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CurrencyValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getCurrencyValueType()
		 * @generated
		 */
		EClass CURRENCY_VALUE_TYPE = eINSTANCE.getCurrencyValueType();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_VALUE_TYPE__REAL_VALUE = eINSTANCE.getCurrencyValueType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_VALUE_TYPE__COMPLEX_VALUE = eINSTANCE.getCurrencyValueType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_VALUE_TYPE__INTEGER_VALUE = eINSTANCE.getCurrencyValueType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_VALUE_TYPE__RATIONAL_VALUE = eINSTANCE.getCurrencyValueType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Currency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_VALUE_TYPE__CURRENCY_CODE = eINSTANCE.getCurrencyValueType_CurrencyCode();

		/**
		 * The meta object literal for the '<em><b>Currency Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_VALUE_TYPE__CURRENCY_REF = eINSTANCE.getCurrencyValueType_CurrencyRef();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DateTimeValueTypeImpl <em>Date Time Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DateTimeValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getDateTimeValueType()
		 * @generated
		 */
		EClass DATE_TIME_VALUE_TYPE = eINSTANCE.getDateTimeValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_VALUE_TYPE__VALUE = eINSTANCE.getDateTimeValueType_Value();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DateValueTypeImpl <em>Date Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DateValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getDateValueType()
		 * @generated
		 */
		EClass DATE_VALUE_TYPE = eINSTANCE.getDateValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_VALUE_TYPE__VALUE = eINSTANCE.getDateValueType_Value();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BAG_VALUE = eINSTANCE.getDocumentRoot_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOLEAN_VALUE = eINSTANCE.getDocumentRoot_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Combination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMBINATION = eINSTANCE.getDocumentRoot_Combination();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPLEX_VALUE = eINSTANCE.getDocumentRoot_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPOSITE_VALUE = eINSTANCE.getDocumentRoot_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTROLLED_VALUE = eINSTANCE.getDocumentRoot_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CURRENCY_VALUE = eINSTANCE.getDocumentRoot_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_TIME_VALUE = eINSTANCE.getDocumentRoot_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_VALUE = eINSTANCE.getDocumentRoot_DateValue();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENVIRONMENT = eINSTANCE.getDocumentRoot_Environment();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILE_VALUE = eINSTANCE.getDocumentRoot_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTEGER_VALUE = eINSTANCE.getDocumentRoot_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ITEM_REFERENCE_VALUE = eINSTANCE.getDocumentRoot_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE = eINSTANCE.getDocumentRoot_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getDocumentRoot_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEASURE_RANGE_VALUE = eINSTANCE.getDocumentRoot_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getDocumentRoot_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NULL_VALUE = eINSTANCE.getDocumentRoot_NullValue();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ONE_OF = eINSTANCE.getDocumentRoot_OneOf();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RATIONAL_VALUE = eINSTANCE.getDocumentRoot_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REAL_VALUE = eINSTANCE.getDocumentRoot_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SEQUENCE_VALUE = eINSTANCE.getDocumentRoot_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SET_VALUE = eINSTANCE.getDocumentRoot_SetValue();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRING_VALUE = eINSTANCE.getDocumentRoot_StringValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIME_VALUE = eINSTANCE.getDocumentRoot_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__YEAR_MONTH_VALUE = eINSTANCE.getDocumentRoot_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__YEAR_VALUE = eINSTANCE.getDocumentRoot_YearValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.EnvironmentTypeImpl <em>Environment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.EnvironmentTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getEnvironmentType()
		 * @generated
		 */
		EClass ENVIRONMENT_TYPE = eINSTANCE.getEnvironmentType();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_TYPE__PROPERTY_VALUE = eINSTANCE.getEnvironmentType_PropertyValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.FieldTypeImpl <em>Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.FieldTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getFieldType()
		 * @generated
		 */
		EClass FIELD_TYPE = eINSTANCE.getFieldType();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__STRING_VALUE = eINSTANCE.getFieldType_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__BAG_VALUE = eINSTANCE.getFieldType_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__BOOLEAN_VALUE = eINSTANCE.getFieldType_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__COMPLEX_VALUE = eINSTANCE.getFieldType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__COMPOSITE_VALUE = eINSTANCE.getFieldType_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__CONTROLLED_VALUE = eINSTANCE.getFieldType_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__CURRENCY_VALUE = eINSTANCE.getFieldType_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__DATE_VALUE = eINSTANCE.getFieldType_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__DATE_TIME_VALUE = eINSTANCE.getFieldType_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__FILE_VALUE = eINSTANCE.getFieldType_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__INTEGER_VALUE = eINSTANCE.getFieldType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__ITEM_REFERENCE_VALUE = eINSTANCE.getFieldType_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__LOCALIZED_TEXT_VALUE = eINSTANCE.getFieldType_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getFieldType_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__MEASURE_RANGE_VALUE = eINSTANCE.getFieldType_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getFieldType_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__NULL_VALUE = eINSTANCE.getFieldType_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__RATIONAL_VALUE = eINSTANCE.getFieldType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__REAL_VALUE = eINSTANCE.getFieldType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__SEQUENCE_VALUE = eINSTANCE.getFieldType_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__SET_VALUE = eINSTANCE.getFieldType_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__TIME_VALUE = eINSTANCE.getFieldType_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__YEAR_MONTH_VALUE = eINSTANCE.getFieldType_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__YEAR_VALUE = eINSTANCE.getFieldType_YearValue();

		/**
		 * The meta object literal for the '<em><b>Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_TYPE__PROPERTY_REF = eINSTANCE.getFieldType_PropertyRef();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.FileValueTypeImpl <em>File Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.FileValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getFileValueType()
		 * @generated
		 */
		EClass FILE_VALUE_TYPE = eINSTANCE.getFileValueType();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_VALUE_TYPE__URI = eINSTANCE.getFileValueType_URI();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.IntegerValueTypeImpl <em>Integer Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.IntegerValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getIntegerValueType()
		 * @generated
		 */
		EClass INTEGER_VALUE_TYPE = eINSTANCE.getIntegerValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_TYPE__VALUE = eINSTANCE.getIntegerValueType_Value();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ItemReferenceValueTypeImpl <em>Item Reference Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ItemReferenceValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getItemReferenceValueType()
		 * @generated
		 */
		EClass ITEM_REFERENCE_VALUE_TYPE = eINSTANCE.getItemReferenceValueType();

		/**
		 * The meta object literal for the '<em><b>Item Local Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_REFERENCE_VALUE_TYPE__ITEM_LOCAL_REF = eINSTANCE.getItemReferenceValueType_ItemLocalRef();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.LocalizedTextValueTypeImpl <em>Localized Text Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.LocalizedTextValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getLocalizedTextValueType()
		 * @generated
		 */
		EClass LOCALIZED_TEXT_VALUE_TYPE = eINSTANCE.getLocalizedTextValueType();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALIZED_TEXT_VALUE_TYPE__CONTENT = eINSTANCE.getLocalizedTextValueType_Content();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureQualifiedNumberValueTypeImpl <em>Measure Qualified Number Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureQualifiedNumberValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getMeasureQualifiedNumberValueType()
		 * @generated
		 */
		EClass MEASURE_QUALIFIED_NUMBER_VALUE_TYPE = eINSTANCE.getMeasureQualifiedNumberValueType();

		/**
		 * The meta object literal for the '<em><b>Qualified Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__QUALIFIED_VALUE = eINSTANCE.getMeasureQualifiedNumberValueType_QualifiedValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureRangeValueTypeImpl <em>Measure Range Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureRangeValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getMeasureRangeValueType()
		 * @generated
		 */
		EClass MEASURE_RANGE_VALUE_TYPE = eINSTANCE.getMeasureRangeValueType();

		/**
		 * The meta object literal for the '<em><b>Lower Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_RANGE_VALUE_TYPE__LOWER_VALUE = eINSTANCE.getMeasureRangeValueType_LowerValue();

		/**
		 * The meta object literal for the '<em><b>Upper Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_RANGE_VALUE_TYPE__UPPER_VALUE = eINSTANCE.getMeasureRangeValueType_UpperValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureSingleNumberValueTypeImpl <em>Measure Single Number Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureSingleNumberValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getMeasureSingleNumberValueType()
		 * @generated
		 */
		EClass MEASURE_SINGLE_NUMBER_VALUE_TYPE = eINSTANCE.getMeasureSingleNumberValueType();

		/**
		 * The meta object literal for the '<em><b>Presentation Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SINGLE_NUMBER_VALUE_TYPE__PRESENTATION_VALUE = eINSTANCE.getMeasureSingleNumberValueType_PresentationValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SINGLE_NUMBER_VALUE_TYPE__REAL_VALUE = eINSTANCE.getMeasureSingleNumberValueType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SINGLE_NUMBER_VALUE_TYPE__COMPLEX_VALUE = eINSTANCE.getMeasureSingleNumberValueType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SINGLE_NUMBER_VALUE_TYPE__INTEGER_VALUE = eINSTANCE.getMeasureSingleNumberValueType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SINGLE_NUMBER_VALUE_TYPE__RATIONAL_VALUE = eINSTANCE.getMeasureSingleNumberValueType_RationalValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureValueTypeImpl <em>Measure Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getMeasureValueType()
		 * @generated
		 */
		EClass MEASURE_VALUE_TYPE = eINSTANCE.getMeasureValueType();

		/**
		 * The meta object literal for the '<em><b>Presentation UOM Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE = eINSTANCE.getMeasureValueType_PresentationUOMCode();

		/**
		 * The meta object literal for the '<em><b>Presentation UOM Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF = eINSTANCE.getMeasureValueType_PresentationUOMRef();

		/**
		 * The meta object literal for the '<em><b>UOM Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_VALUE_TYPE__UOM_CODE = eINSTANCE.getMeasureValueType_UOMCode();

		/**
		 * The meta object literal for the '<em><b>UOM Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_VALUE_TYPE__UOM_REF = eINSTANCE.getMeasureValueType_UOMRef();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.NullValueTypeImpl <em>Null Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.NullValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getNullValueType()
		 * @generated
		 */
		EClass NULL_VALUE_TYPE = eINSTANCE.getNullValueType();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.NumericValueTypeImpl <em>Numeric Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.NumericValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getNumericValueType()
		 * @generated
		 */
		EClass NUMERIC_VALUE_TYPE = eINSTANCE.getNumericValueType();

		/**
		 * The meta object literal for the '<em><b>Presentation Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_VALUE_TYPE__PRESENTATION_VALUE = eINSTANCE.getNumericValueType_PresentationValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_VALUE_TYPE__REAL_VALUE = eINSTANCE.getNumericValueType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_VALUE_TYPE__COMPLEX_VALUE = eINSTANCE.getNumericValueType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_VALUE_TYPE__INTEGER_VALUE = eINSTANCE.getNumericValueType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_VALUE_TYPE__RATIONAL_VALUE = eINSTANCE.getNumericValueType_RationalValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.OneOfTypeImpl <em>One Of Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.OneOfTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getOneOfType()
		 * @generated
		 */
		EClass ONE_OF_TYPE = eINSTANCE.getOneOfType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_OF_TYPE__GROUP = eINSTANCE.getOneOfType_Group();

		/**
		 * The meta object literal for the '<em><b>Combination</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__COMBINATION = eINSTANCE.getOneOfType_Combination();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__STRING_VALUE = eINSTANCE.getOneOfType_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__BAG_VALUE = eINSTANCE.getOneOfType_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__BOOLEAN_VALUE = eINSTANCE.getOneOfType_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__COMPLEX_VALUE = eINSTANCE.getOneOfType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__COMPOSITE_VALUE = eINSTANCE.getOneOfType_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__CONTROLLED_VALUE = eINSTANCE.getOneOfType_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__CURRENCY_VALUE = eINSTANCE.getOneOfType_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__DATE_VALUE = eINSTANCE.getOneOfType_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__DATE_TIME_VALUE = eINSTANCE.getOneOfType_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__FILE_VALUE = eINSTANCE.getOneOfType_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__INTEGER_VALUE = eINSTANCE.getOneOfType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__ITEM_REFERENCE_VALUE = eINSTANCE.getOneOfType_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__LOCALIZED_TEXT_VALUE = eINSTANCE.getOneOfType_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getOneOfType_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__MEASURE_RANGE_VALUE = eINSTANCE.getOneOfType_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getOneOfType_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__NULL_VALUE = eINSTANCE.getOneOfType_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__RATIONAL_VALUE = eINSTANCE.getOneOfType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__REAL_VALUE = eINSTANCE.getOneOfType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__SEQUENCE_VALUE = eINSTANCE.getOneOfType_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__SET_VALUE = eINSTANCE.getOneOfType_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__TIME_VALUE = eINSTANCE.getOneOfType_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__YEAR_MONTH_VALUE = eINSTANCE.getOneOfType_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_TYPE__YEAR_VALUE = eINSTANCE.getOneOfType_YearValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.PresentationValueTypeImpl <em>Presentation Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.PresentationValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getPresentationValueType()
		 * @generated
		 */
		EClass PRESENTATION_VALUE_TYPE = eINSTANCE.getPresentationValueType();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_VALUE_TYPE__REAL_VALUE = eINSTANCE.getPresentationValueType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_VALUE_TYPE__COMPLEX_VALUE = eINSTANCE.getPresentationValueType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_VALUE_TYPE__INTEGER_VALUE = eINSTANCE.getPresentationValueType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_VALUE_TYPE__RATIONAL_VALUE = eINSTANCE.getPresentationValueType_RationalValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl <em>Qualified Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getQualifiedValueType()
		 * @generated
		 */
		EClass QUALIFIED_VALUE_TYPE = eINSTANCE.getQualifiedValueType();

		/**
		 * The meta object literal for the '<em><b>Presentation Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE = eINSTANCE.getQualifiedValueType_PresentationValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_VALUE_TYPE__REAL_VALUE = eINSTANCE.getQualifiedValueType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_VALUE_TYPE__COMPLEX_VALUE = eINSTANCE.getQualifiedValueType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_VALUE_TYPE__INTEGER_VALUE = eINSTANCE.getQualifiedValueType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_VALUE_TYPE__RATIONAL_VALUE = eINSTANCE.getQualifiedValueType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Qualifier Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_VALUE_TYPE__QUALIFIER_CODE = eINSTANCE.getQualifiedValueType_QualifierCode();

		/**
		 * The meta object literal for the '<em><b>Qualifier Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_VALUE_TYPE__QUALIFIER_REF = eINSTANCE.getQualifiedValueType_QualifierRef();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RationalValueTypeImpl <em>Rational Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RationalValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getRationalValueType()
		 * @generated
		 */
		EClass RATIONAL_VALUE_TYPE = eINSTANCE.getRationalValueType();

		/**
		 * The meta object literal for the '<em><b>Whole Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_VALUE_TYPE__WHOLE_PART = eINSTANCE.getRationalValueType_WholePart();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_VALUE_TYPE__NUMERATOR = eINSTANCE.getRationalValueType_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_VALUE_TYPE__DENOMINATOR = eINSTANCE.getRationalValueType_Denominator();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RealValueTypeImpl <em>Real Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RealValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getRealValueType()
		 * @generated
		 */
		EClass REAL_VALUE_TYPE = eINSTANCE.getRealValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_VALUE_TYPE__VALUE = eINSTANCE.getRealValueType_Value();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.SequenceValueTypeImpl <em>Sequence Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.SequenceValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getSequenceValueType()
		 * @generated
		 */
		EClass SEQUENCE_VALUE_TYPE = eINSTANCE.getSequenceValueType();

		/**
		 * The meta object literal for the '<em><b>Value Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_VALUE_TYPE__VALUE_GROUP = eINSTANCE.getSequenceValueType_ValueGroup();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__STRING_VALUE = eINSTANCE.getSequenceValueType_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__BAG_VALUE = eINSTANCE.getSequenceValueType_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__BOOLEAN_VALUE = eINSTANCE.getSequenceValueType_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__COMPLEX_VALUE = eINSTANCE.getSequenceValueType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__COMPOSITE_VALUE = eINSTANCE.getSequenceValueType_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__CONTROLLED_VALUE = eINSTANCE.getSequenceValueType_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__CURRENCY_VALUE = eINSTANCE.getSequenceValueType_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__DATE_VALUE = eINSTANCE.getSequenceValueType_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__DATE_TIME_VALUE = eINSTANCE.getSequenceValueType_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__FILE_VALUE = eINSTANCE.getSequenceValueType_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__INTEGER_VALUE = eINSTANCE.getSequenceValueType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__ITEM_REFERENCE_VALUE = eINSTANCE.getSequenceValueType_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__LOCALIZED_TEXT_VALUE = eINSTANCE.getSequenceValueType_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getSequenceValueType_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__MEASURE_RANGE_VALUE = eINSTANCE.getSequenceValueType_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getSequenceValueType_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__NULL_VALUE = eINSTANCE.getSequenceValueType_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__RATIONAL_VALUE = eINSTANCE.getSequenceValueType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__REAL_VALUE = eINSTANCE.getSequenceValueType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__SEQUENCE_VALUE = eINSTANCE.getSequenceValueType_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__SET_VALUE = eINSTANCE.getSequenceValueType_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__TIME_VALUE = eINSTANCE.getSequenceValueType_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__YEAR_MONTH_VALUE = eINSTANCE.getSequenceValueType_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE_TYPE__YEAR_VALUE = eINSTANCE.getSequenceValueType_YearValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.SetValueTypeImpl <em>Set Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.SetValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getSetValueType()
		 * @generated
		 */
		EClass SET_VALUE_TYPE = eINSTANCE.getSetValueType();

		/**
		 * The meta object literal for the '<em><b>Value Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_VALUE_TYPE__VALUE_GROUP = eINSTANCE.getSetValueType_ValueGroup();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__STRING_VALUE = eINSTANCE.getSetValueType_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__BAG_VALUE = eINSTANCE.getSetValueType_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__BOOLEAN_VALUE = eINSTANCE.getSetValueType_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__COMPLEX_VALUE = eINSTANCE.getSetValueType_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__COMPOSITE_VALUE = eINSTANCE.getSetValueType_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__CONTROLLED_VALUE = eINSTANCE.getSetValueType_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__CURRENCY_VALUE = eINSTANCE.getSetValueType_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__DATE_VALUE = eINSTANCE.getSetValueType_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__DATE_TIME_VALUE = eINSTANCE.getSetValueType_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__FILE_VALUE = eINSTANCE.getSetValueType_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__INTEGER_VALUE = eINSTANCE.getSetValueType_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__ITEM_REFERENCE_VALUE = eINSTANCE.getSetValueType_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__LOCALIZED_TEXT_VALUE = eINSTANCE.getSetValueType_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getSetValueType_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__MEASURE_RANGE_VALUE = eINSTANCE.getSetValueType_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getSetValueType_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__NULL_VALUE = eINSTANCE.getSetValueType_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__RATIONAL_VALUE = eINSTANCE.getSetValueType_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__REAL_VALUE = eINSTANCE.getSetValueType_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__SEQUENCE_VALUE = eINSTANCE.getSetValueType_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__SET_VALUE = eINSTANCE.getSetValueType_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__TIME_VALUE = eINSTANCE.getSetValueType_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__YEAR_MONTH_VALUE = eINSTANCE.getSetValueType_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE_TYPE__YEAR_VALUE = eINSTANCE.getSetValueType_YearValue();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.StringValueTypeImpl <em>String Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.StringValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getStringValueType()
		 * @generated
		 */
		EClass STRING_VALUE_TYPE = eINSTANCE.getStringValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE_TYPE__VALUE = eINSTANCE.getStringValueType_Value();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.TimeValueTypeImpl <em>Time Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.TimeValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getTimeValueType()
		 * @generated
		 */
		EClass TIME_VALUE_TYPE = eINSTANCE.getTimeValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE_TYPE__VALUE = eINSTANCE.getTimeValueType_Value();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.YearMonthValueTypeImpl <em>Year Month Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.YearMonthValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getYearMonthValueType()
		 * @generated
		 */
		EClass YEAR_MONTH_VALUE_TYPE = eINSTANCE.getYearMonthValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR_MONTH_VALUE_TYPE__VALUE = eINSTANCE.getYearMonthValueType_Value();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.YearValueTypeImpl <em>Year Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.YearValueTypeImpl
		 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl#getYearValueType()
		 * @generated
		 */
		EClass YEAR_VALUE_TYPE = eINSTANCE.getYearValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR_VALUE_TYPE__VALUE = eINSTANCE.getYearValueType_Value();

	}

} //ValuePackage
