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
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combination Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getValueGroup <em>Value Group</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getBagValue <em>Bag Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getControlledValue <em>Controlled Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getCurrencyValue <em>Currency Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getDateTimeValue <em>Date Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getFileValue <em>File Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getItemReferenceValue <em>Item Reference Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getLocalizedTextValue <em>Localized Text Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getMeasureRangeValue <em>Measure Range Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getSequenceValue <em>Sequence Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getSetValue <em>Set Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getYearMonthValue <em>Year Month Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.CombinationTypeImpl#getYearValue <em>Year Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinationTypeImpl extends MinimalEObjectImpl.Container implements CombinationType {
	/**
	 * The cached value of the '{@link #getValueGroup() <em>Value Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap valueGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.COMBINATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getValueGroup() {
		if (valueGroup == null) {
			valueGroup = new BasicFeatureMap(this, ValuePackage.COMBINATION_TYPE__VALUE_GROUP);
		}
		return valueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringValueType> getStringValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__STRING_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BagValueType> getBagValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__BAG_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanValueType> getBooleanValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__BOOLEAN_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexValueType> getComplexValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__COMPLEX_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeValueType> getCompositeValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__COMPOSITE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlledValueType> getControlledValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__CONTROLLED_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrencyValueType> getCurrencyValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__CURRENCY_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateValueType> getDateValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__DATE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateTimeValueType> getDateTimeValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__DATE_TIME_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileValueType> getFileValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__FILE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerValueType> getIntegerValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__INTEGER_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemReferenceValueType> getItemReferenceValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__ITEM_REFERENCE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizedTextValueType> getLocalizedTextValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__LOCALIZED_TEXT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureQualifiedNumberValueType> getMeasureQualifiedNumberValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureRangeValueType> getMeasureRangeValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__MEASURE_RANGE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureSingleNumberValueType> getMeasureSingleNumberValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__MEASURE_SINGLE_NUMBER_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NullValueType> getNullValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__NULL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RationalValueType> getRationalValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__RATIONAL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealValueType> getRealValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__REAL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceValueType> getSequenceValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__SEQUENCE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetValueType> getSetValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__SET_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeValueType> getTimeValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__TIME_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YearMonthValueType> getYearMonthValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__YEAR_MONTH_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YearValueType> getYearValue() {
		return getValueGroup().list(ValuePackage.Literals.COMBINATION_TYPE__YEAR_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValuePackage.COMBINATION_TYPE__VALUE_GROUP:
				return ((InternalEList<?>)getValueGroup()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__STRING_VALUE:
				return ((InternalEList<?>)getStringValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__BAG_VALUE:
				return ((InternalEList<?>)getBagValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__BOOLEAN_VALUE:
				return ((InternalEList<?>)getBooleanValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__COMPLEX_VALUE:
				return ((InternalEList<?>)getComplexValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__COMPOSITE_VALUE:
				return ((InternalEList<?>)getCompositeValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__CONTROLLED_VALUE:
				return ((InternalEList<?>)getControlledValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__CURRENCY_VALUE:
				return ((InternalEList<?>)getCurrencyValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__DATE_VALUE:
				return ((InternalEList<?>)getDateValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__DATE_TIME_VALUE:
				return ((InternalEList<?>)getDateTimeValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__FILE_VALUE:
				return ((InternalEList<?>)getFileValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__INTEGER_VALUE:
				return ((InternalEList<?>)getIntegerValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__ITEM_REFERENCE_VALUE:
				return ((InternalEList<?>)getItemReferenceValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__LOCALIZED_TEXT_VALUE:
				return ((InternalEList<?>)getLocalizedTextValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				return ((InternalEList<?>)getMeasureQualifiedNumberValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__MEASURE_RANGE_VALUE:
				return ((InternalEList<?>)getMeasureRangeValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				return ((InternalEList<?>)getMeasureSingleNumberValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__NULL_VALUE:
				return ((InternalEList<?>)getNullValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__RATIONAL_VALUE:
				return ((InternalEList<?>)getRationalValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__REAL_VALUE:
				return ((InternalEList<?>)getRealValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__SEQUENCE_VALUE:
				return ((InternalEList<?>)getSequenceValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__SET_VALUE:
				return ((InternalEList<?>)getSetValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__TIME_VALUE:
				return ((InternalEList<?>)getTimeValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__YEAR_MONTH_VALUE:
				return ((InternalEList<?>)getYearMonthValue()).basicRemove(otherEnd, msgs);
			case ValuePackage.COMBINATION_TYPE__YEAR_VALUE:
				return ((InternalEList<?>)getYearValue()).basicRemove(otherEnd, msgs);
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
			case ValuePackage.COMBINATION_TYPE__VALUE_GROUP:
				if (coreType) return getValueGroup();
				return ((FeatureMap.Internal)getValueGroup()).getWrapper();
			case ValuePackage.COMBINATION_TYPE__STRING_VALUE:
				return getStringValue();
			case ValuePackage.COMBINATION_TYPE__BAG_VALUE:
				return getBagValue();
			case ValuePackage.COMBINATION_TYPE__BOOLEAN_VALUE:
				return getBooleanValue();
			case ValuePackage.COMBINATION_TYPE__COMPLEX_VALUE:
				return getComplexValue();
			case ValuePackage.COMBINATION_TYPE__COMPOSITE_VALUE:
				return getCompositeValue();
			case ValuePackage.COMBINATION_TYPE__CONTROLLED_VALUE:
				return getControlledValue();
			case ValuePackage.COMBINATION_TYPE__CURRENCY_VALUE:
				return getCurrencyValue();
			case ValuePackage.COMBINATION_TYPE__DATE_VALUE:
				return getDateValue();
			case ValuePackage.COMBINATION_TYPE__DATE_TIME_VALUE:
				return getDateTimeValue();
			case ValuePackage.COMBINATION_TYPE__FILE_VALUE:
				return getFileValue();
			case ValuePackage.COMBINATION_TYPE__INTEGER_VALUE:
				return getIntegerValue();
			case ValuePackage.COMBINATION_TYPE__ITEM_REFERENCE_VALUE:
				return getItemReferenceValue();
			case ValuePackage.COMBINATION_TYPE__LOCALIZED_TEXT_VALUE:
				return getLocalizedTextValue();
			case ValuePackage.COMBINATION_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				return getMeasureQualifiedNumberValue();
			case ValuePackage.COMBINATION_TYPE__MEASURE_RANGE_VALUE:
				return getMeasureRangeValue();
			case ValuePackage.COMBINATION_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				return getMeasureSingleNumberValue();
			case ValuePackage.COMBINATION_TYPE__NULL_VALUE:
				return getNullValue();
			case ValuePackage.COMBINATION_TYPE__RATIONAL_VALUE:
				return getRationalValue();
			case ValuePackage.COMBINATION_TYPE__REAL_VALUE:
				return getRealValue();
			case ValuePackage.COMBINATION_TYPE__SEQUENCE_VALUE:
				return getSequenceValue();
			case ValuePackage.COMBINATION_TYPE__SET_VALUE:
				return getSetValue();
			case ValuePackage.COMBINATION_TYPE__TIME_VALUE:
				return getTimeValue();
			case ValuePackage.COMBINATION_TYPE__YEAR_MONTH_VALUE:
				return getYearMonthValue();
			case ValuePackage.COMBINATION_TYPE__YEAR_VALUE:
				return getYearValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValuePackage.COMBINATION_TYPE__VALUE_GROUP:
				((FeatureMap.Internal)getValueGroup()).set(newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__STRING_VALUE:
				getStringValue().clear();
				getStringValue().addAll((Collection<? extends StringValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__BAG_VALUE:
				getBagValue().clear();
				getBagValue().addAll((Collection<? extends BagValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__BOOLEAN_VALUE:
				getBooleanValue().clear();
				getBooleanValue().addAll((Collection<? extends BooleanValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__COMPLEX_VALUE:
				getComplexValue().clear();
				getComplexValue().addAll((Collection<? extends ComplexValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__COMPOSITE_VALUE:
				getCompositeValue().clear();
				getCompositeValue().addAll((Collection<? extends CompositeValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__CONTROLLED_VALUE:
				getControlledValue().clear();
				getControlledValue().addAll((Collection<? extends ControlledValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__CURRENCY_VALUE:
				getCurrencyValue().clear();
				getCurrencyValue().addAll((Collection<? extends CurrencyValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__DATE_VALUE:
				getDateValue().clear();
				getDateValue().addAll((Collection<? extends DateValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__DATE_TIME_VALUE:
				getDateTimeValue().clear();
				getDateTimeValue().addAll((Collection<? extends DateTimeValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__FILE_VALUE:
				getFileValue().clear();
				getFileValue().addAll((Collection<? extends FileValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__INTEGER_VALUE:
				getIntegerValue().clear();
				getIntegerValue().addAll((Collection<? extends IntegerValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__ITEM_REFERENCE_VALUE:
				getItemReferenceValue().clear();
				getItemReferenceValue().addAll((Collection<? extends ItemReferenceValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__LOCALIZED_TEXT_VALUE:
				getLocalizedTextValue().clear();
				getLocalizedTextValue().addAll((Collection<? extends LocalizedTextValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				getMeasureQualifiedNumberValue().clear();
				getMeasureQualifiedNumberValue().addAll((Collection<? extends MeasureQualifiedNumberValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__MEASURE_RANGE_VALUE:
				getMeasureRangeValue().clear();
				getMeasureRangeValue().addAll((Collection<? extends MeasureRangeValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				getMeasureSingleNumberValue().clear();
				getMeasureSingleNumberValue().addAll((Collection<? extends MeasureSingleNumberValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__NULL_VALUE:
				getNullValue().clear();
				getNullValue().addAll((Collection<? extends NullValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__RATIONAL_VALUE:
				getRationalValue().clear();
				getRationalValue().addAll((Collection<? extends RationalValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__REAL_VALUE:
				getRealValue().clear();
				getRealValue().addAll((Collection<? extends RealValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__SEQUENCE_VALUE:
				getSequenceValue().clear();
				getSequenceValue().addAll((Collection<? extends SequenceValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__SET_VALUE:
				getSetValue().clear();
				getSetValue().addAll((Collection<? extends SetValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__TIME_VALUE:
				getTimeValue().clear();
				getTimeValue().addAll((Collection<? extends TimeValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__YEAR_MONTH_VALUE:
				getYearMonthValue().clear();
				getYearMonthValue().addAll((Collection<? extends YearMonthValueType>)newValue);
				return;
			case ValuePackage.COMBINATION_TYPE__YEAR_VALUE:
				getYearValue().clear();
				getYearValue().addAll((Collection<? extends YearValueType>)newValue);
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
			case ValuePackage.COMBINATION_TYPE__VALUE_GROUP:
				getValueGroup().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__STRING_VALUE:
				getStringValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__BAG_VALUE:
				getBagValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__BOOLEAN_VALUE:
				getBooleanValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__COMPLEX_VALUE:
				getComplexValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__COMPOSITE_VALUE:
				getCompositeValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__CONTROLLED_VALUE:
				getControlledValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__CURRENCY_VALUE:
				getCurrencyValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__DATE_VALUE:
				getDateValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__DATE_TIME_VALUE:
				getDateTimeValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__FILE_VALUE:
				getFileValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__INTEGER_VALUE:
				getIntegerValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__ITEM_REFERENCE_VALUE:
				getItemReferenceValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__LOCALIZED_TEXT_VALUE:
				getLocalizedTextValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				getMeasureQualifiedNumberValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__MEASURE_RANGE_VALUE:
				getMeasureRangeValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				getMeasureSingleNumberValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__NULL_VALUE:
				getNullValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__RATIONAL_VALUE:
				getRationalValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__REAL_VALUE:
				getRealValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__SEQUENCE_VALUE:
				getSequenceValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__SET_VALUE:
				getSetValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__TIME_VALUE:
				getTimeValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__YEAR_MONTH_VALUE:
				getYearMonthValue().clear();
				return;
			case ValuePackage.COMBINATION_TYPE__YEAR_VALUE:
				getYearValue().clear();
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
			case ValuePackage.COMBINATION_TYPE__VALUE_GROUP:
				return valueGroup != null && !valueGroup.isEmpty();
			case ValuePackage.COMBINATION_TYPE__STRING_VALUE:
				return !getStringValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__BAG_VALUE:
				return !getBagValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__BOOLEAN_VALUE:
				return !getBooleanValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__COMPLEX_VALUE:
				return !getComplexValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__COMPOSITE_VALUE:
				return !getCompositeValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__CONTROLLED_VALUE:
				return !getControlledValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__CURRENCY_VALUE:
				return !getCurrencyValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__DATE_VALUE:
				return !getDateValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__DATE_TIME_VALUE:
				return !getDateTimeValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__FILE_VALUE:
				return !getFileValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__INTEGER_VALUE:
				return !getIntegerValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__ITEM_REFERENCE_VALUE:
				return !getItemReferenceValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__LOCALIZED_TEXT_VALUE:
				return !getLocalizedTextValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				return !getMeasureQualifiedNumberValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__MEASURE_RANGE_VALUE:
				return !getMeasureRangeValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				return !getMeasureSingleNumberValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__NULL_VALUE:
				return !getNullValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__RATIONAL_VALUE:
				return !getRationalValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__REAL_VALUE:
				return !getRealValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__SEQUENCE_VALUE:
				return !getSequenceValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__SET_VALUE:
				return !getSetValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__TIME_VALUE:
				return !getTimeValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__YEAR_MONTH_VALUE:
				return !getYearMonthValue().isEmpty();
			case ValuePackage.COMBINATION_TYPE__YEAR_VALUE:
				return !getYearValue().isEmpty();
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
		result.append(" (valueGroup: ");
		result.append(valueGroup);
		result.append(')');
		return result.toString();
	}

} //CombinationTypeImpl
