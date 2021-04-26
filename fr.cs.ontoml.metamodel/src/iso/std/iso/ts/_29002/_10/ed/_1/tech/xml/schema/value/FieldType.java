/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getStringValue <em>String Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getBagValue <em>Bag Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getControlledValue <em>Controlled Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getCurrencyValue <em>Currency Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getDateTimeValue <em>Date Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getFileValue <em>File Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getItemReferenceValue <em>Item Reference Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getLocalizedTextValue <em>Localized Text Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureRangeValue <em>Measure Range Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getSequenceValue <em>Sequence Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getSetValue <em>Set Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getYearMonthValue <em>Year Month Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getYearValue <em>Year Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType()
 * @model extendedMetaData="name='field_Type' kind='elementOnly'"
 * @generated
 */
public interface FieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' containment reference.
	 * @see #setStringValue(StringValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_StringValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='string_value' namespace='##targetNamespace'"
	 * @generated
	 */
	StringValueType getStringValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getStringValue <em>String Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' containment reference.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(StringValueType value);

	/**
	 * Returns the value of the '<em><b>Bag Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bag Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag Value</em>' containment reference.
	 * @see #setBagValue(BagValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_BagValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bag_value' namespace='##targetNamespace'"
	 * @generated
	 */
	BagValueType getBagValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getBagValue <em>Bag Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bag Value</em>' containment reference.
	 * @see #getBagValue()
	 * @generated
	 */
	void setBagValue(BagValueType value);

	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' containment reference.
	 * @see #setBooleanValue(BooleanValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_BooleanValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boolean_value' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanValueType getBooleanValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getBooleanValue <em>Boolean Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' containment reference.
	 * @see #getBooleanValue()
	 * @generated
	 */
	void setBooleanValue(BooleanValueType value);

	/**
	 * Returns the value of the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Value</em>' containment reference.
	 * @see #setComplexValue(ComplexValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_ComplexValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complex_value' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexValueType getComplexValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getComplexValue <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Value</em>' containment reference.
	 * @see #getComplexValue()
	 * @generated
	 */
	void setComplexValue(ComplexValueType value);

	/**
	 * Returns the value of the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Value</em>' containment reference.
	 * @see #setCompositeValue(CompositeValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_CompositeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='composite_value' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositeValueType getCompositeValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getCompositeValue <em>Composite Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Value</em>' containment reference.
	 * @see #getCompositeValue()
	 * @generated
	 */
	void setCompositeValue(CompositeValueType value);

	/**
	 * Returns the value of the '<em><b>Controlled Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Value</em>' containment reference.
	 * @see #setControlledValue(ControlledValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_ControlledValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlled_value' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlledValueType getControlledValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getControlledValue <em>Controlled Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled Value</em>' containment reference.
	 * @see #getControlledValue()
	 * @generated
	 */
	void setControlledValue(ControlledValueType value);

	/**
	 * Returns the value of the '<em><b>Currency Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Value</em>' containment reference.
	 * @see #setCurrencyValue(CurrencyValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_CurrencyValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currency_value' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrencyValueType getCurrencyValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getCurrencyValue <em>Currency Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Value</em>' containment reference.
	 * @see #getCurrencyValue()
	 * @generated
	 */
	void setCurrencyValue(CurrencyValueType value);

	/**
	 * Returns the value of the '<em><b>Date Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Value</em>' containment reference.
	 * @see #setDateValue(DateValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_DateValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date_value' namespace='##targetNamespace'"
	 * @generated
	 */
	DateValueType getDateValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getDateValue <em>Date Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Value</em>' containment reference.
	 * @see #getDateValue()
	 * @generated
	 */
	void setDateValue(DateValueType value);

	/**
	 * Returns the value of the '<em><b>Date Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Value</em>' containment reference.
	 * @see #setDateTimeValue(DateTimeValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_DateTimeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date_time_value' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeValueType getDateTimeValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getDateTimeValue <em>Date Time Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Value</em>' containment reference.
	 * @see #getDateTimeValue()
	 * @generated
	 */
	void setDateTimeValue(DateTimeValueType value);

	/**
	 * Returns the value of the '<em><b>File Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Value</em>' containment reference.
	 * @see #setFileValue(FileValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_FileValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='file_value' namespace='##targetNamespace'"
	 * @generated
	 */
	FileValueType getFileValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getFileValue <em>File Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Value</em>' containment reference.
	 * @see #getFileValue()
	 * @generated
	 */
	void setFileValue(FileValueType value);

	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' containment reference.
	 * @see #setIntegerValue(IntegerValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_IntegerValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='integer_value' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerValueType getIntegerValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getIntegerValue <em>Integer Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' containment reference.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(IntegerValueType value);

	/**
	 * Returns the value of the '<em><b>Item Reference Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Reference Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Reference Value</em>' containment reference.
	 * @see #setItemReferenceValue(ItemReferenceValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_ItemReferenceValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item_reference_value' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemReferenceValueType getItemReferenceValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getItemReferenceValue <em>Item Reference Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Reference Value</em>' containment reference.
	 * @see #getItemReferenceValue()
	 * @generated
	 */
	void setItemReferenceValue(ItemReferenceValueType value);

	/**
	 * Returns the value of the '<em><b>Localized Text Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localized Text Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized Text Value</em>' containment reference.
	 * @see #setLocalizedTextValue(LocalizedTextValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_LocalizedTextValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='localized_text_value' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalizedTextValueType getLocalizedTextValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getLocalizedTextValue <em>Localized Text Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localized Text Value</em>' containment reference.
	 * @see #getLocalizedTextValue()
	 * @generated
	 */
	void setLocalizedTextValue(LocalizedTextValueType value);

	/**
	 * Returns the value of the '<em><b>Measure Qualified Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Qualified Number Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Qualified Number Value</em>' containment reference.
	 * @see #setMeasureQualifiedNumberValue(MeasureQualifiedNumberValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_MeasureQualifiedNumberValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure_qualified_number_value' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureQualifiedNumberValueType getMeasureQualifiedNumberValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Qualified Number Value</em>' containment reference.
	 * @see #getMeasureQualifiedNumberValue()
	 * @generated
	 */
	void setMeasureQualifiedNumberValue(MeasureQualifiedNumberValueType value);

	/**
	 * Returns the value of the '<em><b>Measure Range Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Range Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Range Value</em>' containment reference.
	 * @see #setMeasureRangeValue(MeasureRangeValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_MeasureRangeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure_range_value' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureRangeValueType getMeasureRangeValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureRangeValue <em>Measure Range Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Range Value</em>' containment reference.
	 * @see #getMeasureRangeValue()
	 * @generated
	 */
	void setMeasureRangeValue(MeasureRangeValueType value);

	/**
	 * Returns the value of the '<em><b>Measure Single Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Single Number Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Single Number Value</em>' containment reference.
	 * @see #setMeasureSingleNumberValue(MeasureSingleNumberValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_MeasureSingleNumberValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure_single_number_value' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureSingleNumberValueType getMeasureSingleNumberValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Single Number Value</em>' containment reference.
	 * @see #getMeasureSingleNumberValue()
	 * @generated
	 */
	void setMeasureSingleNumberValue(MeasureSingleNumberValueType value);

	/**
	 * Returns the value of the '<em><b>Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Value</em>' containment reference.
	 * @see #setNullValue(NullValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_NullValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='null_value' namespace='##targetNamespace'"
	 * @generated
	 */
	NullValueType getNullValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getNullValue <em>Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Value</em>' containment reference.
	 * @see #getNullValue()
	 * @generated
	 */
	void setNullValue(NullValueType value);

	/**
	 * Returns the value of the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rational Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational Value</em>' containment reference.
	 * @see #setRationalValue(RationalValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_RationalValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rational_value' namespace='##targetNamespace'"
	 * @generated
	 */
	RationalValueType getRationalValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getRationalValue <em>Rational Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rational Value</em>' containment reference.
	 * @see #getRationalValue()
	 * @generated
	 */
	void setRationalValue(RationalValueType value);

	/**
	 * Returns the value of the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Value</em>' containment reference.
	 * @see #setRealValue(RealValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_RealValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='real_value' namespace='##targetNamespace'"
	 * @generated
	 */
	RealValueType getRealValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getRealValue <em>Real Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Value</em>' containment reference.
	 * @see #getRealValue()
	 * @generated
	 */
	void setRealValue(RealValueType value);

	/**
	 * Returns the value of the '<em><b>Sequence Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Value</em>' containment reference.
	 * @see #setSequenceValue(SequenceValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_SequenceValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence_value' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceValueType getSequenceValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getSequenceValue <em>Sequence Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Value</em>' containment reference.
	 * @see #getSequenceValue()
	 * @generated
	 */
	void setSequenceValue(SequenceValueType value);

	/**
	 * Returns the value of the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Value</em>' containment reference.
	 * @see #setSetValue(SetValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_SetValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set_value' namespace='##targetNamespace'"
	 * @generated
	 */
	SetValueType getSetValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getSetValue <em>Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Value</em>' containment reference.
	 * @see #getSetValue()
	 * @generated
	 */
	void setSetValue(SetValueType value);

	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value</em>' containment reference.
	 * @see #setTimeValue(TimeValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_TimeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time_value' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getTimeValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getTimeValue <em>Time Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' containment reference.
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Year Month Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Month Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Month Value</em>' containment reference.
	 * @see #setYearMonthValue(YearMonthValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_YearMonthValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='year_month_value' namespace='##targetNamespace'"
	 * @generated
	 */
	YearMonthValueType getYearMonthValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getYearMonthValue <em>Year Month Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Month Value</em>' containment reference.
	 * @see #getYearMonthValue()
	 * @generated
	 */
	void setYearMonthValue(YearMonthValueType value);

	/**
	 * Returns the value of the '<em><b>Year Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Value</em>' containment reference.
	 * @see #setYearValue(YearValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_YearValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='year_value' namespace='##targetNamespace'"
	 * @generated
	 */
	YearValueType getYearValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getYearValue <em>Year Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Value</em>' containment reference.
	 * @see #getYearValue()
	 * @generated
	 */
	void setYearValue(YearValueType value);

	/**
	 * Returns the value of the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Ref</em>' attribute.
	 * @see #setPropertyRef(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getFieldType_PropertyRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='attribute' name='property_ref'"
	 * @generated
	 */
	String getPropertyRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType#getPropertyRef <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Ref</em>' attribute.
	 * @see #getPropertyRef()
	 * @generated
	 */
	void setPropertyRef(String value);

} // FieldType
