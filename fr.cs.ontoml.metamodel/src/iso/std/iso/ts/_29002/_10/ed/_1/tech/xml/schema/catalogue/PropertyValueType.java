/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.EnvironmentType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NullValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getStringValue <em>String Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getBagValue <em>Bag Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getControlledValue <em>Controlled Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCurrencyValue <em>Currency Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getDateTimeValue <em>Date Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getFileValue <em>File Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getItemReferenceValue <em>Item Reference Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getLocalizedTextValue <em>Localized Text Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureRangeValue <em>Measure Range Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSequenceValue <em>Sequence Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSetValue <em>Set Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getYearMonthValue <em>Year Month Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getYearValue <em>Year Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getOneOf <em>One Of</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCombination <em>Combination</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#isIsProprietary <em>Is Proprietary</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSubitemPathPropertyRef <em>Subitem Path Property Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType()
 * @model extendedMetaData="name='property_value_Type' kind='elementOnly'"
 * @generated
 */
public interface PropertyValueType extends EObject {
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_StringValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='string_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	StringValueType getStringValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getStringValue <em>String Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_BagValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bag_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	BagValueType getBagValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getBagValue <em>Bag Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_BooleanValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boolean_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	BooleanValueType getBooleanValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getBooleanValue <em>Boolean Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_ComplexValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complex_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	ComplexValueType getComplexValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getComplexValue <em>Complex Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_CompositeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='composite_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	CompositeValueType getCompositeValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCompositeValue <em>Composite Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_ControlledValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlled_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	ControlledValueType getControlledValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getControlledValue <em>Controlled Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_CurrencyValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currency_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	CurrencyValueType getCurrencyValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCurrencyValue <em>Currency Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_DateValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	DateValueType getDateValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getDateValue <em>Date Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_DateTimeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date_time_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	DateTimeValueType getDateTimeValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getDateTimeValue <em>Date Time Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_FileValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='file_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	FileValueType getFileValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getFileValue <em>File Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_IntegerValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='integer_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	IntegerValueType getIntegerValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getIntegerValue <em>Integer Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_ItemReferenceValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item_reference_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	ItemReferenceValueType getItemReferenceValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getItemReferenceValue <em>Item Reference Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_LocalizedTextValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='localized_text_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	LocalizedTextValueType getLocalizedTextValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getLocalizedTextValue <em>Localized Text Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_MeasureQualifiedNumberValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure_qualified_number_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	MeasureQualifiedNumberValueType getMeasureQualifiedNumberValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_MeasureRangeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure_range_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	MeasureRangeValueType getMeasureRangeValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureRangeValue <em>Measure Range Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_MeasureSingleNumberValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measure_single_number_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	MeasureSingleNumberValueType getMeasureSingleNumberValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_NullValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='null_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	NullValueType getNullValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getNullValue <em>Null Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_RationalValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rational_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	RationalValueType getRationalValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getRationalValue <em>Rational Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_RealValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='real_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	RealValueType getRealValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getRealValue <em>Real Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_SequenceValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	SequenceValueType getSequenceValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSequenceValue <em>Sequence Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_SetValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	SetValueType getSetValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSetValue <em>Set Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_TimeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	TimeValueType getTimeValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getTimeValue <em>Time Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_YearMonthValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='year_month_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	YearMonthValueType getYearMonthValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getYearMonthValue <em>Year Month Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_YearValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='year_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	YearValueType getYearValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getYearValue <em>Year Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Value</em>' containment reference.
	 * @see #getYearValue()
	 * @generated
	 */
	void setYearValue(YearValueType value);

	/**
	 * Returns the value of the '<em><b>One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Of</em>' containment reference.
	 * @see #setOneOf(OneOfType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_OneOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='one_of' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	OneOfType getOneOf();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getOneOf <em>One Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Of</em>' containment reference.
	 * @see #getOneOf()
	 * @generated
	 */
	void setOneOf(OneOfType value);

	/**
	 * Returns the value of the '<em><b>Combination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination</em>' containment reference.
	 * @see #setCombination(CombinationType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_Combination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combination' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	CombinationType getCombination();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getCombination <em>Combination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combination</em>' containment reference.
	 * @see #getCombination()
	 * @generated
	 */
	void setCombination(CombinationType value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(EnvironmentType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_Environment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value'"
	 * @generated
	 */
	EnvironmentType getEnvironment();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(EnvironmentType value);

	/**
	 * Returns the value of the '<em><b>Is Proprietary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Proprietary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Proprietary</em>' attribute.
	 * @see #isSetIsProprietary()
	 * @see #unsetIsProprietary()
	 * @see #setIsProprietary(boolean)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_IsProprietary()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='is_proprietary'"
	 * @generated
	 */
	boolean isIsProprietary();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#isIsProprietary <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Proprietary</em>' attribute.
	 * @see #isSetIsProprietary()
	 * @see #unsetIsProprietary()
	 * @see #isIsProprietary()
	 * @generated
	 */
	void setIsProprietary(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#isIsProprietary <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsProprietary()
	 * @see #isIsProprietary()
	 * @see #setIsProprietary(boolean)
	 * @generated
	 */
	void unsetIsProprietary();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#isIsProprietary <em>Is Proprietary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Proprietary</em>' attribute is set.
	 * @see #unsetIsProprietary()
	 * @see #isIsProprietary()
	 * @see #setIsProprietary(boolean)
	 * @generated
	 */
	boolean isSetIsProprietary();

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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_PropertyRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType" required="true"
	 *        extendedMetaData="kind='attribute' name='property_ref'"
	 * @generated
	 */
	String getPropertyRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getPropertyRef <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Ref</em>' attribute.
	 * @see #getPropertyRef()
	 * @generated
	 */
	void setPropertyRef(String value);

	/**
	 * Returns the value of the '<em><b>Subitem Path Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subitem Path Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subitem Path Property Ref</em>' attribute.
	 * @see #setSubitemPathPropertyRef(List)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getPropertyValueType_SubitemPathPropertyRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIListType" many="false"
	 *        extendedMetaData="kind='attribute' name='subitem_path_property_ref'"
	 * @generated
	 */
	List<String> getSubitemPathPropertyRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType#getSubitemPathPropertyRef <em>Subitem Path Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subitem Path Property Ref</em>' attribute.
	 * @see #getSubitemPathPropertyRef()
	 * @generated
	 */
	void setSubitemPathPropertyRef(List<String> value);

} // PropertyValueType
