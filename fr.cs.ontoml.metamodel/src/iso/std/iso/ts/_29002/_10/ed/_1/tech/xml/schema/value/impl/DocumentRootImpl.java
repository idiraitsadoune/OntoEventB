/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot;
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
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getBagValue <em>Bag Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getCombination <em>Combination</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getControlledValue <em>Controlled Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getCurrencyValue <em>Currency Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getDateTimeValue <em>Date Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getFileValue <em>File Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getItemReferenceValue <em>Item Reference Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getLocalizedTextValue <em>Localized Text Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getMeasureRangeValue <em>Measure Range Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getSequenceValue <em>Sequence Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getSetValue <em>Set Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getYearMonthValue <em>Year Month Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.DocumentRootImpl#getYearValue <em>Year Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ValuePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ValuePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ValuePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagValueType getBagValue() {
		return (BagValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__BAG_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBagValue(BagValueType newBagValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__BAG_VALUE, newBagValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBagValue(BagValueType newBagValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__BAG_VALUE, newBagValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueType getBooleanValue() {
		return (BooleanValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__BOOLEAN_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanValue(BooleanValueType newBooleanValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__BOOLEAN_VALUE, newBooleanValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(BooleanValueType newBooleanValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__BOOLEAN_VALUE, newBooleanValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationType getCombination() {
		return (CombinationType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__COMBINATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombination(CombinationType newCombination, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__COMBINATION, newCombination, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombination(CombinationType newCombination) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__COMBINATION, newCombination);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexValueType getComplexValue() {
		return (ComplexValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__COMPLEX_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexValue(ComplexValueType newComplexValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__COMPLEX_VALUE, newComplexValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexValue(ComplexValueType newComplexValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__COMPLEX_VALUE, newComplexValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeValueType getCompositeValue() {
		return (CompositeValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__COMPOSITE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeValue(CompositeValueType newCompositeValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__COMPOSITE_VALUE, newCompositeValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeValue(CompositeValueType newCompositeValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__COMPOSITE_VALUE, newCompositeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledValueType getControlledValue() {
		return (ControlledValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__CONTROLLED_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledValue(ControlledValueType newControlledValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__CONTROLLED_VALUE, newControlledValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlledValue(ControlledValueType newControlledValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__CONTROLLED_VALUE, newControlledValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyValueType getCurrencyValue() {
		return (CurrencyValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__CURRENCY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrencyValue(CurrencyValueType newCurrencyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__CURRENCY_VALUE, newCurrencyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyValue(CurrencyValueType newCurrencyValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__CURRENCY_VALUE, newCurrencyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeValueType getDateTimeValue() {
		return (DateTimeValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__DATE_TIME_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTimeValue(DateTimeValueType newDateTimeValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__DATE_TIME_VALUE, newDateTimeValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeValue(DateTimeValueType newDateTimeValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__DATE_TIME_VALUE, newDateTimeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateValueType getDateValue() {
		return (DateValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__DATE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateValue(DateValueType newDateValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__DATE_VALUE, newDateValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValue(DateValueType newDateValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__DATE_VALUE, newDateValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentType getEnvironment() {
		return (EnvironmentType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__ENVIRONMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(EnvironmentType newEnvironment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__ENVIRONMENT, newEnvironment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(EnvironmentType newEnvironment) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__ENVIRONMENT, newEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileValueType getFileValue() {
		return (FileValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__FILE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileValue(FileValueType newFileValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__FILE_VALUE, newFileValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileValue(FileValueType newFileValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__FILE_VALUE, newFileValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueType getIntegerValue() {
		return (IntegerValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__INTEGER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerValue(IntegerValueType newIntegerValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__INTEGER_VALUE, newIntegerValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerValue(IntegerValueType newIntegerValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__INTEGER_VALUE, newIntegerValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemReferenceValueType getItemReferenceValue() {
		return (ItemReferenceValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__ITEM_REFERENCE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemReferenceValue(ItemReferenceValueType newItemReferenceValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__ITEM_REFERENCE_VALUE, newItemReferenceValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemReferenceValue(ItemReferenceValueType newItemReferenceValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__ITEM_REFERENCE_VALUE, newItemReferenceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedTextValueType getLocalizedTextValue() {
		return (LocalizedTextValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalizedTextValue(LocalizedTextValueType newLocalizedTextValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE, newLocalizedTextValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizedTextValue(LocalizedTextValueType newLocalizedTextValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE, newLocalizedTextValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureQualifiedNumberValueType getMeasureQualifiedNumberValue() {
		return (MeasureQualifiedNumberValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureQualifiedNumberValue(MeasureQualifiedNumberValueType newMeasureQualifiedNumberValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE, newMeasureQualifiedNumberValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureQualifiedNumberValue(MeasureQualifiedNumberValueType newMeasureQualifiedNumberValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE, newMeasureQualifiedNumberValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureRangeValueType getMeasureRangeValue() {
		return (MeasureRangeValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__MEASURE_RANGE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureRangeValue(MeasureRangeValueType newMeasureRangeValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__MEASURE_RANGE_VALUE, newMeasureRangeValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureRangeValue(MeasureRangeValueType newMeasureRangeValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__MEASURE_RANGE_VALUE, newMeasureRangeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSingleNumberValueType getMeasureSingleNumberValue() {
		return (MeasureSingleNumberValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureSingleNumberValue(MeasureSingleNumberValueType newMeasureSingleNumberValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE, newMeasureSingleNumberValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureSingleNumberValue(MeasureSingleNumberValueType newMeasureSingleNumberValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE, newMeasureSingleNumberValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValueType getNullValue() {
		return (NullValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__NULL_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullValue(NullValueType newNullValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__NULL_VALUE, newNullValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullValue(NullValueType newNullValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__NULL_VALUE, newNullValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneOfType getOneOf() {
		return (OneOfType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__ONE_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneOf(OneOfType newOneOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__ONE_OF, newOneOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneOf(OneOfType newOneOf) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__ONE_OF, newOneOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalValueType getRationalValue() {
		return (RationalValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__RATIONAL_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationalValue(RationalValueType newRationalValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__RATIONAL_VALUE, newRationalValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationalValue(RationalValueType newRationalValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__RATIONAL_VALUE, newRationalValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValueType getRealValue() {
		return (RealValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__REAL_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealValue(RealValueType newRealValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__REAL_VALUE, newRealValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealValue(RealValueType newRealValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__REAL_VALUE, newRealValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceValueType getSequenceValue() {
		return (SequenceValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__SEQUENCE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceValue(SequenceValueType newSequenceValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__SEQUENCE_VALUE, newSequenceValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceValue(SequenceValueType newSequenceValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__SEQUENCE_VALUE, newSequenceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetValueType getSetValue() {
		return (SetValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__SET_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetValue(SetValueType newSetValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__SET_VALUE, newSetValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetValue(SetValueType newSetValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__SET_VALUE, newSetValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueType getStringValue() {
		return (StringValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__STRING_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringValue(StringValueType newStringValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__STRING_VALUE, newStringValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(StringValueType newStringValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__STRING_VALUE, newStringValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getTimeValue() {
		return (TimeValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__TIME_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeValue(TimeValueType newTimeValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__TIME_VALUE, newTimeValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(TimeValueType newTimeValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__TIME_VALUE, newTimeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearMonthValueType getYearMonthValue() {
		return (YearMonthValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__YEAR_MONTH_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearMonthValue(YearMonthValueType newYearMonthValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__YEAR_MONTH_VALUE, newYearMonthValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearMonthValue(YearMonthValueType newYearMonthValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__YEAR_MONTH_VALUE, newYearMonthValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearValueType getYearValue() {
		return (YearValueType)getMixed().get(ValuePackage.Literals.DOCUMENT_ROOT__YEAR_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearValue(YearValueType newYearValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ValuePackage.Literals.DOCUMENT_ROOT__YEAR_VALUE, newYearValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearValue(YearValueType newYearValue) {
		((FeatureMap.Internal)getMixed()).set(ValuePackage.Literals.DOCUMENT_ROOT__YEAR_VALUE, newYearValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValuePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ValuePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ValuePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ValuePackage.DOCUMENT_ROOT__BAG_VALUE:
				return basicSetBagValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				return basicSetBooleanValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__COMBINATION:
				return basicSetCombination(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__COMPLEX_VALUE:
				return basicSetComplexValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				return basicSetCompositeValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__CONTROLLED_VALUE:
				return basicSetControlledValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__CURRENCY_VALUE:
				return basicSetCurrencyValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__DATE_TIME_VALUE:
				return basicSetDateTimeValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__DATE_VALUE:
				return basicSetDateValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__FILE_VALUE:
				return basicSetFileValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__INTEGER_VALUE:
				return basicSetIntegerValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__ITEM_REFERENCE_VALUE:
				return basicSetItemReferenceValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE:
				return basicSetLocalizedTextValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE:
				return basicSetMeasureQualifiedNumberValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__MEASURE_RANGE_VALUE:
				return basicSetMeasureRangeValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE:
				return basicSetMeasureSingleNumberValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__NULL_VALUE:
				return basicSetNullValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__ONE_OF:
				return basicSetOneOf(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__RATIONAL_VALUE:
				return basicSetRationalValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__REAL_VALUE:
				return basicSetRealValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__SEQUENCE_VALUE:
				return basicSetSequenceValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__SET_VALUE:
				return basicSetSetValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__STRING_VALUE:
				return basicSetStringValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__TIME_VALUE:
				return basicSetTimeValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__YEAR_MONTH_VALUE:
				return basicSetYearMonthValue(null, msgs);
			case ValuePackage.DOCUMENT_ROOT__YEAR_VALUE:
				return basicSetYearValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValuePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ValuePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ValuePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ValuePackage.DOCUMENT_ROOT__BAG_VALUE:
				return getBagValue();
			case ValuePackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				return getBooleanValue();
			case ValuePackage.DOCUMENT_ROOT__COMBINATION:
				return getCombination();
			case ValuePackage.DOCUMENT_ROOT__COMPLEX_VALUE:
				return getComplexValue();
			case ValuePackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				return getCompositeValue();
			case ValuePackage.DOCUMENT_ROOT__CONTROLLED_VALUE:
				return getControlledValue();
			case ValuePackage.DOCUMENT_ROOT__CURRENCY_VALUE:
				return getCurrencyValue();
			case ValuePackage.DOCUMENT_ROOT__DATE_TIME_VALUE:
				return getDateTimeValue();
			case ValuePackage.DOCUMENT_ROOT__DATE_VALUE:
				return getDateValue();
			case ValuePackage.DOCUMENT_ROOT__ENVIRONMENT:
				return getEnvironment();
			case ValuePackage.DOCUMENT_ROOT__FILE_VALUE:
				return getFileValue();
			case ValuePackage.DOCUMENT_ROOT__INTEGER_VALUE:
				return getIntegerValue();
			case ValuePackage.DOCUMENT_ROOT__ITEM_REFERENCE_VALUE:
				return getItemReferenceValue();
			case ValuePackage.DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE:
				return getLocalizedTextValue();
			case ValuePackage.DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE:
				return getMeasureQualifiedNumberValue();
			case ValuePackage.DOCUMENT_ROOT__MEASURE_RANGE_VALUE:
				return getMeasureRangeValue();
			case ValuePackage.DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE:
				return getMeasureSingleNumberValue();
			case ValuePackage.DOCUMENT_ROOT__NULL_VALUE:
				return getNullValue();
			case ValuePackage.DOCUMENT_ROOT__ONE_OF:
				return getOneOf();
			case ValuePackage.DOCUMENT_ROOT__RATIONAL_VALUE:
				return getRationalValue();
			case ValuePackage.DOCUMENT_ROOT__REAL_VALUE:
				return getRealValue();
			case ValuePackage.DOCUMENT_ROOT__SEQUENCE_VALUE:
				return getSequenceValue();
			case ValuePackage.DOCUMENT_ROOT__SET_VALUE:
				return getSetValue();
			case ValuePackage.DOCUMENT_ROOT__STRING_VALUE:
				return getStringValue();
			case ValuePackage.DOCUMENT_ROOT__TIME_VALUE:
				return getTimeValue();
			case ValuePackage.DOCUMENT_ROOT__YEAR_MONTH_VALUE:
				return getYearMonthValue();
			case ValuePackage.DOCUMENT_ROOT__YEAR_VALUE:
				return getYearValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValuePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__BAG_VALUE:
				setBagValue((BagValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				setBooleanValue((BooleanValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__COMBINATION:
				setCombination((CombinationType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__COMPLEX_VALUE:
				setComplexValue((ComplexValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				setCompositeValue((CompositeValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__CONTROLLED_VALUE:
				setControlledValue((ControlledValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__CURRENCY_VALUE:
				setCurrencyValue((CurrencyValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__DATE_TIME_VALUE:
				setDateTimeValue((DateTimeValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__DATE_VALUE:
				setDateValue((DateValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__ENVIRONMENT:
				setEnvironment((EnvironmentType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__FILE_VALUE:
				setFileValue((FileValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__INTEGER_VALUE:
				setIntegerValue((IntegerValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__ITEM_REFERENCE_VALUE:
				setItemReferenceValue((ItemReferenceValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE:
				setLocalizedTextValue((LocalizedTextValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE:
				setMeasureQualifiedNumberValue((MeasureQualifiedNumberValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__MEASURE_RANGE_VALUE:
				setMeasureRangeValue((MeasureRangeValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE:
				setMeasureSingleNumberValue((MeasureSingleNumberValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__NULL_VALUE:
				setNullValue((NullValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__ONE_OF:
				setOneOf((OneOfType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__RATIONAL_VALUE:
				setRationalValue((RationalValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__REAL_VALUE:
				setRealValue((RealValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__SEQUENCE_VALUE:
				setSequenceValue((SequenceValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__SET_VALUE:
				setSetValue((SetValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__STRING_VALUE:
				setStringValue((StringValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__TIME_VALUE:
				setTimeValue((TimeValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__YEAR_MONTH_VALUE:
				setYearMonthValue((YearMonthValueType)newValue);
				return;
			case ValuePackage.DOCUMENT_ROOT__YEAR_VALUE:
				setYearValue((YearValueType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ValuePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ValuePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ValuePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ValuePackage.DOCUMENT_ROOT__BAG_VALUE:
				setBagValue((BagValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				setBooleanValue((BooleanValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__COMBINATION:
				setCombination((CombinationType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__COMPLEX_VALUE:
				setComplexValue((ComplexValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				setCompositeValue((CompositeValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__CONTROLLED_VALUE:
				setControlledValue((ControlledValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__CURRENCY_VALUE:
				setCurrencyValue((CurrencyValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__DATE_TIME_VALUE:
				setDateTimeValue((DateTimeValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__DATE_VALUE:
				setDateValue((DateValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__ENVIRONMENT:
				setEnvironment((EnvironmentType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__FILE_VALUE:
				setFileValue((FileValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__INTEGER_VALUE:
				setIntegerValue((IntegerValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__ITEM_REFERENCE_VALUE:
				setItemReferenceValue((ItemReferenceValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE:
				setLocalizedTextValue((LocalizedTextValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE:
				setMeasureQualifiedNumberValue((MeasureQualifiedNumberValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__MEASURE_RANGE_VALUE:
				setMeasureRangeValue((MeasureRangeValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE:
				setMeasureSingleNumberValue((MeasureSingleNumberValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__NULL_VALUE:
				setNullValue((NullValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__ONE_OF:
				setOneOf((OneOfType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__RATIONAL_VALUE:
				setRationalValue((RationalValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__REAL_VALUE:
				setRealValue((RealValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__SEQUENCE_VALUE:
				setSequenceValue((SequenceValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__SET_VALUE:
				setSetValue((SetValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__STRING_VALUE:
				setStringValue((StringValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__TIME_VALUE:
				setTimeValue((TimeValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__YEAR_MONTH_VALUE:
				setYearMonthValue((YearMonthValueType)null);
				return;
			case ValuePackage.DOCUMENT_ROOT__YEAR_VALUE:
				setYearValue((YearValueType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ValuePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ValuePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ValuePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ValuePackage.DOCUMENT_ROOT__BAG_VALUE:
				return getBagValue() != null;
			case ValuePackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				return getBooleanValue() != null;
			case ValuePackage.DOCUMENT_ROOT__COMBINATION:
				return getCombination() != null;
			case ValuePackage.DOCUMENT_ROOT__COMPLEX_VALUE:
				return getComplexValue() != null;
			case ValuePackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				return getCompositeValue() != null;
			case ValuePackage.DOCUMENT_ROOT__CONTROLLED_VALUE:
				return getControlledValue() != null;
			case ValuePackage.DOCUMENT_ROOT__CURRENCY_VALUE:
				return getCurrencyValue() != null;
			case ValuePackage.DOCUMENT_ROOT__DATE_TIME_VALUE:
				return getDateTimeValue() != null;
			case ValuePackage.DOCUMENT_ROOT__DATE_VALUE:
				return getDateValue() != null;
			case ValuePackage.DOCUMENT_ROOT__ENVIRONMENT:
				return getEnvironment() != null;
			case ValuePackage.DOCUMENT_ROOT__FILE_VALUE:
				return getFileValue() != null;
			case ValuePackage.DOCUMENT_ROOT__INTEGER_VALUE:
				return getIntegerValue() != null;
			case ValuePackage.DOCUMENT_ROOT__ITEM_REFERENCE_VALUE:
				return getItemReferenceValue() != null;
			case ValuePackage.DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE:
				return getLocalizedTextValue() != null;
			case ValuePackage.DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE:
				return getMeasureQualifiedNumberValue() != null;
			case ValuePackage.DOCUMENT_ROOT__MEASURE_RANGE_VALUE:
				return getMeasureRangeValue() != null;
			case ValuePackage.DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE:
				return getMeasureSingleNumberValue() != null;
			case ValuePackage.DOCUMENT_ROOT__NULL_VALUE:
				return getNullValue() != null;
			case ValuePackage.DOCUMENT_ROOT__ONE_OF:
				return getOneOf() != null;
			case ValuePackage.DOCUMENT_ROOT__RATIONAL_VALUE:
				return getRationalValue() != null;
			case ValuePackage.DOCUMENT_ROOT__REAL_VALUE:
				return getRealValue() != null;
			case ValuePackage.DOCUMENT_ROOT__SEQUENCE_VALUE:
				return getSequenceValue() != null;
			case ValuePackage.DOCUMENT_ROOT__SET_VALUE:
				return getSetValue() != null;
			case ValuePackage.DOCUMENT_ROOT__STRING_VALUE:
				return getStringValue() != null;
			case ValuePackage.DOCUMENT_ROOT__TIME_VALUE:
				return getTimeValue() != null;
			case ValuePackage.DOCUMENT_ROOT__YEAR_MONTH_VALUE:
				return getYearMonthValue() != null;
			case ValuePackage.DOCUMENT_ROOT__YEAR_VALUE:
				return getYearValue() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
