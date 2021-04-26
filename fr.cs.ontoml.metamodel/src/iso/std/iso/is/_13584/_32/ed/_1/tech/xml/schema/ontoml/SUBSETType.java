/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NullValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUBSET Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getValueGroup <em>Value Group</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getStringValue <em>String Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getBagValue <em>Bag Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getControlledValue <em>Controlled Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getCurrencyValue <em>Currency Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getDateTimeValue <em>Date Time Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getFileValue <em>File Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getItemReferenceValue <em>Item Reference Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getLocalizedTextValue <em>Localized Text Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getMeasureRangeValue <em>Measure Range Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getSequenceValue <em>Sequence Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getSetValue <em>Set Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getYearMonthValue <em>Year Month Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType#getYearValue <em>Year Value</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType()
 * @model extendedMetaData="name='SUBSET_Type' kind='elementOnly'"
 * @generated
 */
public interface SUBSETType extends EObject {
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_ValueGroup()
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_StringValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_BagValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bag_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_BooleanValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='boolean_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_ComplexValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='complex_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_CompositeValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='composite_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_ControlledValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='controlled_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_CurrencyValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='currency_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_DateValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_DateTimeValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date_time_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_FileValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='file_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_IntegerValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='integer_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_ItemReferenceValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='item_reference_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_LocalizedTextValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='localized_text_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_MeasureQualifiedNumberValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure_qualified_number_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_MeasureRangeValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure_range_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_MeasureSingleNumberValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure_single_number_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_NullValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='null_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_RationalValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rational_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_RealValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='real_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_SequenceValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_SetValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='set_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_TimeValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='time_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_YearMonthValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year_month_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBSETType_YearValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='year_value' namespace='urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value' group='#ValueGroup:0'"
	 * @generated
	 */
	EList<YearValueType> getYearValue();

} // SUBSETType
