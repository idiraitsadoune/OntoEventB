/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getValueGroup <em>Value Group</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getStringValue <em>String Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getBagValue <em>Bag Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getControlledValue <em>Controlled Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getCurrencyValue <em>Currency Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getDateTimeValue <em>Date Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getFileValue <em>File Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getItemReferenceValue <em>Item Reference Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getLocalizedTextValue <em>Localized Text Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getMeasureRangeValue <em>Measure Range Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getSequenceValue <em>Sequence Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getSetValue <em>Set Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getYearMonthValue <em>Year Month Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType#getYearValue <em>Year Value</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType()
 * @model extendedMetaData="name='set_value_Type' kind='elementOnly'"
 * @generated
 */
public interface SetValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Group</em>' attribute list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_ValueGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ValueGroup:0'"
	 * @generated
	 */
	FeatureMap getValueGroup();

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_StringValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<StringValueType> getStringValue();

	/**
	 * Returns the value of the '<em><b>Bag Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bag Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_BagValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bag_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<BagValueType> getBagValue();

	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_BooleanValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='boolean_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<BooleanValueType> getBooleanValue();

	/**
	 * Returns the value of the '<em><b>Complex Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_ComplexValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='complex_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<ComplexValueType> getComplexValue();

	/**
	 * Returns the value of the '<em><b>Composite Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_CompositeValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='composite_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<CompositeValueType> getCompositeValue();

	/**
	 * Returns the value of the '<em><b>Controlled Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_ControlledValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='controlled_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<ControlledValueType> getControlledValue();

	/**
	 * Returns the value of the '<em><b>Currency Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_CurrencyValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='currency_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<CurrencyValueType> getCurrencyValue();

	/**
	 * Returns the value of the '<em><b>Date Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_DateValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<DateValueType> getDateValue();

	/**
	 * Returns the value of the '<em><b>Date Time Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_DateTimeValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date_time_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<DateTimeValueType> getDateTimeValue();

	/**
	 * Returns the value of the '<em><b>File Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_FileValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='file_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<FileValueType> getFileValue();

	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_IntegerValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='integer_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<IntegerValueType> getIntegerValue();

	/**
	 * Returns the value of the '<em><b>Item Reference Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Reference Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Reference Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_ItemReferenceValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='item_reference_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<ItemReferenceValueType> getItemReferenceValue();

	/**
	 * Returns the value of the '<em><b>Localized Text Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localized Text Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized Text Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_LocalizedTextValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='localized_text_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<LocalizedTextValueType> getLocalizedTextValue();

	/**
	 * Returns the value of the '<em><b>Measure Qualified Number Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Qualified Number Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Qualified Number Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_MeasureQualifiedNumberValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure_qualified_number_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<MeasureQualifiedNumberValueType> getMeasureQualifiedNumberValue();

	/**
	 * Returns the value of the '<em><b>Measure Range Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Range Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Range Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_MeasureRangeValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure_range_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<MeasureRangeValueType> getMeasureRangeValue();

	/**
	 * Returns the value of the '<em><b>Measure Single Number Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Single Number Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Single Number Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_MeasureSingleNumberValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure_single_number_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<MeasureSingleNumberValueType> getMeasureSingleNumberValue();

	/**
	 * Returns the value of the '<em><b>Null Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NullValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_NullValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='null_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<NullValueType> getNullValue();

	/**
	 * Returns the value of the '<em><b>Rational Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rational Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_RationalValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rational_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<RationalValueType> getRationalValue();

	/**
	 * Returns the value of the '<em><b>Real Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_RealValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='real_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<RealValueType> getRealValue();

	/**
	 * Returns the value of the '<em><b>Sequence Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_SequenceValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<SequenceValueType> getSequenceValue();

	/**
	 * Returns the value of the '<em><b>Set Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_SetValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='set_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<SetValueType> getSetValue();

	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_TimeValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='time_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<TimeValueType> getTimeValue();

	/**
	 * Returns the value of the '<em><b>Year Month Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Month Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Month Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_YearMonthValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year_month_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<YearMonthValueType> getYearMonthValue();

	/**
	 * Returns the value of the '<em><b>Year Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getSetValueType_YearValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year_value' namespace='##targetNamespace' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<YearValueType> getYearValue();

} // SetValueType
