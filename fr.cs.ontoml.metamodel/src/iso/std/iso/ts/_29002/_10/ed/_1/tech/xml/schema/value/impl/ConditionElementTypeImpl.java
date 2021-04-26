/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getBagValue <em>Bag Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getControlledValue <em>Controlled Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getCurrencyValue <em>Currency Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getDateTimeValue <em>Date Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getFileValue <em>File Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getItemReferenceValue <em>Item Reference Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getLocalizedTextValue <em>Localized Text Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getMeasureRangeValue <em>Measure Range Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getSequenceValue <em>Sequence Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getSetValue <em>Set Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getYearMonthValue <em>Year Month Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getYearValue <em>Year Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ConditionElementTypeImpl#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionElementTypeImpl extends MinimalEObjectImpl.Container implements ConditionElementType {
	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected StringValueType stringValue;

	/**
	 * The cached value of the '{@link #getBagValue() <em>Bag Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBagValue()
	 * @generated
	 * @ordered
	 */
	protected BagValueType bagValue;

	/**
	 * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected BooleanValueType booleanValue;

	/**
	 * The cached value of the '{@link #getComplexValue() <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexValue()
	 * @generated
	 * @ordered
	 */
	protected ComplexValueType complexValue;

	/**
	 * The cached value of the '{@link #getCompositeValue() <em>Composite Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeValue()
	 * @generated
	 * @ordered
	 */
	protected CompositeValueType compositeValue;

	/**
	 * The cached value of the '{@link #getControlledValue() <em>Controlled Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledValue()
	 * @generated
	 * @ordered
	 */
	protected ControlledValueType controlledValue;

	/**
	 * The cached value of the '{@link #getCurrencyValue() <em>Currency Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyValue()
	 * @generated
	 * @ordered
	 */
	protected CurrencyValueType currencyValue;

	/**
	 * The cached value of the '{@link #getDateValue() <em>Date Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected DateValueType dateValue;

	/**
	 * The cached value of the '{@link #getDateTimeValue() <em>Date Time Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeValue()
	 * @generated
	 * @ordered
	 */
	protected DateTimeValueType dateTimeValue;

	/**
	 * The cached value of the '{@link #getFileValue() <em>File Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileValue()
	 * @generated
	 * @ordered
	 */
	protected FileValueType fileValue;

	/**
	 * The cached value of the '{@link #getIntegerValue() <em>Integer Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected IntegerValueType integerValue;

	/**
	 * The cached value of the '{@link #getItemReferenceValue() <em>Item Reference Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemReferenceValue()
	 * @generated
	 * @ordered
	 */
	protected ItemReferenceValueType itemReferenceValue;

	/**
	 * The cached value of the '{@link #getLocalizedTextValue() <em>Localized Text Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedTextValue()
	 * @generated
	 * @ordered
	 */
	protected LocalizedTextValueType localizedTextValue;

	/**
	 * The cached value of the '{@link #getMeasureQualifiedNumberValue() <em>Measure Qualified Number Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureQualifiedNumberValue()
	 * @generated
	 * @ordered
	 */
	protected MeasureQualifiedNumberValueType measureQualifiedNumberValue;

	/**
	 * The cached value of the '{@link #getMeasureRangeValue() <em>Measure Range Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureRangeValue()
	 * @generated
	 * @ordered
	 */
	protected MeasureRangeValueType measureRangeValue;

	/**
	 * The cached value of the '{@link #getMeasureSingleNumberValue() <em>Measure Single Number Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureSingleNumberValue()
	 * @generated
	 * @ordered
	 */
	protected MeasureSingleNumberValueType measureSingleNumberValue;

	/**
	 * The cached value of the '{@link #getNullValue() <em>Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValue()
	 * @generated
	 * @ordered
	 */
	protected NullValueType nullValue;

	/**
	 * The cached value of the '{@link #getRationalValue() <em>Rational Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationalValue()
	 * @generated
	 * @ordered
	 */
	protected RationalValueType rationalValue;

	/**
	 * The cached value of the '{@link #getRealValue() <em>Real Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealValue()
	 * @generated
	 * @ordered
	 */
	protected RealValueType realValue;

	/**
	 * The cached value of the '{@link #getSequenceValue() <em>Sequence Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceValue()
	 * @generated
	 * @ordered
	 */
	protected SequenceValueType sequenceValue;

	/**
	 * The cached value of the '{@link #getSetValue() <em>Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetValue()
	 * @generated
	 * @ordered
	 */
	protected SetValueType setValue;

	/**
	 * The cached value of the '{@link #getTimeValue() <em>Time Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType timeValue;

	/**
	 * The cached value of the '{@link #getYearMonthValue() <em>Year Month Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearMonthValue()
	 * @generated
	 * @ordered
	 */
	protected YearMonthValueType yearMonthValue;

	/**
	 * The cached value of the '{@link #getYearValue() <em>Year Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearValue()
	 * @generated
	 * @ordered
	 */
	protected YearValueType yearValue;

	/**
	 * The default value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected String propertyRef = PROPERTY_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.CONDITION_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueType getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringValue(StringValueType newStringValue, NotificationChain msgs) {
		StringValueType oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__STRING_VALUE, oldStringValue, newStringValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(StringValueType newStringValue) {
		if (newStringValue != stringValue) {
			NotificationChain msgs = null;
			if (stringValue != null)
				msgs = ((InternalEObject)stringValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__STRING_VALUE, null, msgs);
			if (newStringValue != null)
				msgs = ((InternalEObject)newStringValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__STRING_VALUE, null, msgs);
			msgs = basicSetStringValue(newStringValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__STRING_VALUE, newStringValue, newStringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagValueType getBagValue() {
		return bagValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBagValue(BagValueType newBagValue, NotificationChain msgs) {
		BagValueType oldBagValue = bagValue;
		bagValue = newBagValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__BAG_VALUE, oldBagValue, newBagValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBagValue(BagValueType newBagValue) {
		if (newBagValue != bagValue) {
			NotificationChain msgs = null;
			if (bagValue != null)
				msgs = ((InternalEObject)bagValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__BAG_VALUE, null, msgs);
			if (newBagValue != null)
				msgs = ((InternalEObject)newBagValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__BAG_VALUE, null, msgs);
			msgs = basicSetBagValue(newBagValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__BAG_VALUE, newBagValue, newBagValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueType getBooleanValue() {
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanValue(BooleanValueType newBooleanValue, NotificationChain msgs) {
		BooleanValueType oldBooleanValue = booleanValue;
		booleanValue = newBooleanValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE, oldBooleanValue, newBooleanValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(BooleanValueType newBooleanValue) {
		if (newBooleanValue != booleanValue) {
			NotificationChain msgs = null;
			if (booleanValue != null)
				msgs = ((InternalEObject)booleanValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE, null, msgs);
			if (newBooleanValue != null)
				msgs = ((InternalEObject)newBooleanValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE, null, msgs);
			msgs = basicSetBooleanValue(newBooleanValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE, newBooleanValue, newBooleanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexValueType getComplexValue() {
		return complexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexValue(ComplexValueType newComplexValue, NotificationChain msgs) {
		ComplexValueType oldComplexValue = complexValue;
		complexValue = newComplexValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__COMPLEX_VALUE, oldComplexValue, newComplexValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexValue(ComplexValueType newComplexValue) {
		if (newComplexValue != complexValue) {
			NotificationChain msgs = null;
			if (complexValue != null)
				msgs = ((InternalEObject)complexValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__COMPLEX_VALUE, null, msgs);
			if (newComplexValue != null)
				msgs = ((InternalEObject)newComplexValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__COMPLEX_VALUE, null, msgs);
			msgs = basicSetComplexValue(newComplexValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__COMPLEX_VALUE, newComplexValue, newComplexValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeValueType getCompositeValue() {
		return compositeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeValue(CompositeValueType newCompositeValue, NotificationChain msgs) {
		CompositeValueType oldCompositeValue = compositeValue;
		compositeValue = newCompositeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE, oldCompositeValue, newCompositeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeValue(CompositeValueType newCompositeValue) {
		if (newCompositeValue != compositeValue) {
			NotificationChain msgs = null;
			if (compositeValue != null)
				msgs = ((InternalEObject)compositeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE, null, msgs);
			if (newCompositeValue != null)
				msgs = ((InternalEObject)newCompositeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE, null, msgs);
			msgs = basicSetCompositeValue(newCompositeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE, newCompositeValue, newCompositeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledValueType getControlledValue() {
		return controlledValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledValue(ControlledValueType newControlledValue, NotificationChain msgs) {
		ControlledValueType oldControlledValue = controlledValue;
		controlledValue = newControlledValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE, oldControlledValue, newControlledValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlledValue(ControlledValueType newControlledValue) {
		if (newControlledValue != controlledValue) {
			NotificationChain msgs = null;
			if (controlledValue != null)
				msgs = ((InternalEObject)controlledValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE, null, msgs);
			if (newControlledValue != null)
				msgs = ((InternalEObject)newControlledValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE, null, msgs);
			msgs = basicSetControlledValue(newControlledValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE, newControlledValue, newControlledValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyValueType getCurrencyValue() {
		return currencyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrencyValue(CurrencyValueType newCurrencyValue, NotificationChain msgs) {
		CurrencyValueType oldCurrencyValue = currencyValue;
		currencyValue = newCurrencyValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__CURRENCY_VALUE, oldCurrencyValue, newCurrencyValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyValue(CurrencyValueType newCurrencyValue) {
		if (newCurrencyValue != currencyValue) {
			NotificationChain msgs = null;
			if (currencyValue != null)
				msgs = ((InternalEObject)currencyValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__CURRENCY_VALUE, null, msgs);
			if (newCurrencyValue != null)
				msgs = ((InternalEObject)newCurrencyValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__CURRENCY_VALUE, null, msgs);
			msgs = basicSetCurrencyValue(newCurrencyValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__CURRENCY_VALUE, newCurrencyValue, newCurrencyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateValueType getDateValue() {
		return dateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateValue(DateValueType newDateValue, NotificationChain msgs) {
		DateValueType oldDateValue = dateValue;
		dateValue = newDateValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__DATE_VALUE, oldDateValue, newDateValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValue(DateValueType newDateValue) {
		if (newDateValue != dateValue) {
			NotificationChain msgs = null;
			if (dateValue != null)
				msgs = ((InternalEObject)dateValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__DATE_VALUE, null, msgs);
			if (newDateValue != null)
				msgs = ((InternalEObject)newDateValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__DATE_VALUE, null, msgs);
			msgs = basicSetDateValue(newDateValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__DATE_VALUE, newDateValue, newDateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeValueType getDateTimeValue() {
		return dateTimeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTimeValue(DateTimeValueType newDateTimeValue, NotificationChain msgs) {
		DateTimeValueType oldDateTimeValue = dateTimeValue;
		dateTimeValue = newDateTimeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE, oldDateTimeValue, newDateTimeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeValue(DateTimeValueType newDateTimeValue) {
		if (newDateTimeValue != dateTimeValue) {
			NotificationChain msgs = null;
			if (dateTimeValue != null)
				msgs = ((InternalEObject)dateTimeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE, null, msgs);
			if (newDateTimeValue != null)
				msgs = ((InternalEObject)newDateTimeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE, null, msgs);
			msgs = basicSetDateTimeValue(newDateTimeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE, newDateTimeValue, newDateTimeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileValueType getFileValue() {
		return fileValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileValue(FileValueType newFileValue, NotificationChain msgs) {
		FileValueType oldFileValue = fileValue;
		fileValue = newFileValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__FILE_VALUE, oldFileValue, newFileValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileValue(FileValueType newFileValue) {
		if (newFileValue != fileValue) {
			NotificationChain msgs = null;
			if (fileValue != null)
				msgs = ((InternalEObject)fileValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__FILE_VALUE, null, msgs);
			if (newFileValue != null)
				msgs = ((InternalEObject)newFileValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__FILE_VALUE, null, msgs);
			msgs = basicSetFileValue(newFileValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__FILE_VALUE, newFileValue, newFileValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueType getIntegerValue() {
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerValue(IntegerValueType newIntegerValue, NotificationChain msgs) {
		IntegerValueType oldIntegerValue = integerValue;
		integerValue = newIntegerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__INTEGER_VALUE, oldIntegerValue, newIntegerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerValue(IntegerValueType newIntegerValue) {
		if (newIntegerValue != integerValue) {
			NotificationChain msgs = null;
			if (integerValue != null)
				msgs = ((InternalEObject)integerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__INTEGER_VALUE, null, msgs);
			if (newIntegerValue != null)
				msgs = ((InternalEObject)newIntegerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__INTEGER_VALUE, null, msgs);
			msgs = basicSetIntegerValue(newIntegerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__INTEGER_VALUE, newIntegerValue, newIntegerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemReferenceValueType getItemReferenceValue() {
		return itemReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemReferenceValue(ItemReferenceValueType newItemReferenceValue, NotificationChain msgs) {
		ItemReferenceValueType oldItemReferenceValue = itemReferenceValue;
		itemReferenceValue = newItemReferenceValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE, oldItemReferenceValue, newItemReferenceValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemReferenceValue(ItemReferenceValueType newItemReferenceValue) {
		if (newItemReferenceValue != itemReferenceValue) {
			NotificationChain msgs = null;
			if (itemReferenceValue != null)
				msgs = ((InternalEObject)itemReferenceValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE, null, msgs);
			if (newItemReferenceValue != null)
				msgs = ((InternalEObject)newItemReferenceValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE, null, msgs);
			msgs = basicSetItemReferenceValue(newItemReferenceValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE, newItemReferenceValue, newItemReferenceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedTextValueType getLocalizedTextValue() {
		return localizedTextValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalizedTextValue(LocalizedTextValueType newLocalizedTextValue, NotificationChain msgs) {
		LocalizedTextValueType oldLocalizedTextValue = localizedTextValue;
		localizedTextValue = newLocalizedTextValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE, oldLocalizedTextValue, newLocalizedTextValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizedTextValue(LocalizedTextValueType newLocalizedTextValue) {
		if (newLocalizedTextValue != localizedTextValue) {
			NotificationChain msgs = null;
			if (localizedTextValue != null)
				msgs = ((InternalEObject)localizedTextValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE, null, msgs);
			if (newLocalizedTextValue != null)
				msgs = ((InternalEObject)newLocalizedTextValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE, null, msgs);
			msgs = basicSetLocalizedTextValue(newLocalizedTextValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE, newLocalizedTextValue, newLocalizedTextValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureQualifiedNumberValueType getMeasureQualifiedNumberValue() {
		return measureQualifiedNumberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureQualifiedNumberValue(MeasureQualifiedNumberValueType newMeasureQualifiedNumberValue, NotificationChain msgs) {
		MeasureQualifiedNumberValueType oldMeasureQualifiedNumberValue = measureQualifiedNumberValue;
		measureQualifiedNumberValue = newMeasureQualifiedNumberValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE, oldMeasureQualifiedNumberValue, newMeasureQualifiedNumberValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureQualifiedNumberValue(MeasureQualifiedNumberValueType newMeasureQualifiedNumberValue) {
		if (newMeasureQualifiedNumberValue != measureQualifiedNumberValue) {
			NotificationChain msgs = null;
			if (measureQualifiedNumberValue != null)
				msgs = ((InternalEObject)measureQualifiedNumberValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE, null, msgs);
			if (newMeasureQualifiedNumberValue != null)
				msgs = ((InternalEObject)newMeasureQualifiedNumberValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE, null, msgs);
			msgs = basicSetMeasureQualifiedNumberValue(newMeasureQualifiedNumberValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE, newMeasureQualifiedNumberValue, newMeasureQualifiedNumberValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureRangeValueType getMeasureRangeValue() {
		return measureRangeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureRangeValue(MeasureRangeValueType newMeasureRangeValue, NotificationChain msgs) {
		MeasureRangeValueType oldMeasureRangeValue = measureRangeValue;
		measureRangeValue = newMeasureRangeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE, oldMeasureRangeValue, newMeasureRangeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureRangeValue(MeasureRangeValueType newMeasureRangeValue) {
		if (newMeasureRangeValue != measureRangeValue) {
			NotificationChain msgs = null;
			if (measureRangeValue != null)
				msgs = ((InternalEObject)measureRangeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE, null, msgs);
			if (newMeasureRangeValue != null)
				msgs = ((InternalEObject)newMeasureRangeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE, null, msgs);
			msgs = basicSetMeasureRangeValue(newMeasureRangeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE, newMeasureRangeValue, newMeasureRangeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSingleNumberValueType getMeasureSingleNumberValue() {
		return measureSingleNumberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureSingleNumberValue(MeasureSingleNumberValueType newMeasureSingleNumberValue, NotificationChain msgs) {
		MeasureSingleNumberValueType oldMeasureSingleNumberValue = measureSingleNumberValue;
		measureSingleNumberValue = newMeasureSingleNumberValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE, oldMeasureSingleNumberValue, newMeasureSingleNumberValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureSingleNumberValue(MeasureSingleNumberValueType newMeasureSingleNumberValue) {
		if (newMeasureSingleNumberValue != measureSingleNumberValue) {
			NotificationChain msgs = null;
			if (measureSingleNumberValue != null)
				msgs = ((InternalEObject)measureSingleNumberValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE, null, msgs);
			if (newMeasureSingleNumberValue != null)
				msgs = ((InternalEObject)newMeasureSingleNumberValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE, null, msgs);
			msgs = basicSetMeasureSingleNumberValue(newMeasureSingleNumberValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE, newMeasureSingleNumberValue, newMeasureSingleNumberValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValueType getNullValue() {
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullValue(NullValueType newNullValue, NotificationChain msgs) {
		NullValueType oldNullValue = nullValue;
		nullValue = newNullValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__NULL_VALUE, oldNullValue, newNullValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullValue(NullValueType newNullValue) {
		if (newNullValue != nullValue) {
			NotificationChain msgs = null;
			if (nullValue != null)
				msgs = ((InternalEObject)nullValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__NULL_VALUE, null, msgs);
			if (newNullValue != null)
				msgs = ((InternalEObject)newNullValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__NULL_VALUE, null, msgs);
			msgs = basicSetNullValue(newNullValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__NULL_VALUE, newNullValue, newNullValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalValueType getRationalValue() {
		return rationalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationalValue(RationalValueType newRationalValue, NotificationChain msgs) {
		RationalValueType oldRationalValue = rationalValue;
		rationalValue = newRationalValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__RATIONAL_VALUE, oldRationalValue, newRationalValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationalValue(RationalValueType newRationalValue) {
		if (newRationalValue != rationalValue) {
			NotificationChain msgs = null;
			if (rationalValue != null)
				msgs = ((InternalEObject)rationalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__RATIONAL_VALUE, null, msgs);
			if (newRationalValue != null)
				msgs = ((InternalEObject)newRationalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__RATIONAL_VALUE, null, msgs);
			msgs = basicSetRationalValue(newRationalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__RATIONAL_VALUE, newRationalValue, newRationalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValueType getRealValue() {
		return realValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealValue(RealValueType newRealValue, NotificationChain msgs) {
		RealValueType oldRealValue = realValue;
		realValue = newRealValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__REAL_VALUE, oldRealValue, newRealValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealValue(RealValueType newRealValue) {
		if (newRealValue != realValue) {
			NotificationChain msgs = null;
			if (realValue != null)
				msgs = ((InternalEObject)realValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__REAL_VALUE, null, msgs);
			if (newRealValue != null)
				msgs = ((InternalEObject)newRealValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__REAL_VALUE, null, msgs);
			msgs = basicSetRealValue(newRealValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__REAL_VALUE, newRealValue, newRealValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceValueType getSequenceValue() {
		return sequenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceValue(SequenceValueType newSequenceValue, NotificationChain msgs) {
		SequenceValueType oldSequenceValue = sequenceValue;
		sequenceValue = newSequenceValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE, oldSequenceValue, newSequenceValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceValue(SequenceValueType newSequenceValue) {
		if (newSequenceValue != sequenceValue) {
			NotificationChain msgs = null;
			if (sequenceValue != null)
				msgs = ((InternalEObject)sequenceValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE, null, msgs);
			if (newSequenceValue != null)
				msgs = ((InternalEObject)newSequenceValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE, null, msgs);
			msgs = basicSetSequenceValue(newSequenceValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE, newSequenceValue, newSequenceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetValueType getSetValue() {
		return setValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetValue(SetValueType newSetValue, NotificationChain msgs) {
		SetValueType oldSetValue = setValue;
		setValue = newSetValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__SET_VALUE, oldSetValue, newSetValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetValue(SetValueType newSetValue) {
		if (newSetValue != setValue) {
			NotificationChain msgs = null;
			if (setValue != null)
				msgs = ((InternalEObject)setValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__SET_VALUE, null, msgs);
			if (newSetValue != null)
				msgs = ((InternalEObject)newSetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__SET_VALUE, null, msgs);
			msgs = basicSetSetValue(newSetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__SET_VALUE, newSetValue, newSetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getTimeValue() {
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeValue(TimeValueType newTimeValue, NotificationChain msgs) {
		TimeValueType oldTimeValue = timeValue;
		timeValue = newTimeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__TIME_VALUE, oldTimeValue, newTimeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(TimeValueType newTimeValue) {
		if (newTimeValue != timeValue) {
			NotificationChain msgs = null;
			if (timeValue != null)
				msgs = ((InternalEObject)timeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__TIME_VALUE, null, msgs);
			if (newTimeValue != null)
				msgs = ((InternalEObject)newTimeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__TIME_VALUE, null, msgs);
			msgs = basicSetTimeValue(newTimeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__TIME_VALUE, newTimeValue, newTimeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearMonthValueType getYearMonthValue() {
		return yearMonthValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearMonthValue(YearMonthValueType newYearMonthValue, NotificationChain msgs) {
		YearMonthValueType oldYearMonthValue = yearMonthValue;
		yearMonthValue = newYearMonthValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE, oldYearMonthValue, newYearMonthValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearMonthValue(YearMonthValueType newYearMonthValue) {
		if (newYearMonthValue != yearMonthValue) {
			NotificationChain msgs = null;
			if (yearMonthValue != null)
				msgs = ((InternalEObject)yearMonthValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE, null, msgs);
			if (newYearMonthValue != null)
				msgs = ((InternalEObject)newYearMonthValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE, null, msgs);
			msgs = basicSetYearMonthValue(newYearMonthValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE, newYearMonthValue, newYearMonthValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearValueType getYearValue() {
		return yearValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearValue(YearValueType newYearValue, NotificationChain msgs) {
		YearValueType oldYearValue = yearValue;
		yearValue = newYearValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_VALUE, oldYearValue, newYearValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearValue(YearValueType newYearValue) {
		if (newYearValue != yearValue) {
			NotificationChain msgs = null;
			if (yearValue != null)
				msgs = ((InternalEObject)yearValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_VALUE, null, msgs);
			if (newYearValue != null)
				msgs = ((InternalEObject)newYearValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_VALUE, null, msgs);
			msgs = basicSetYearValue(newYearValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_VALUE, newYearValue, newYearValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyRef() {
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyRef(String newPropertyRef) {
		String oldPropertyRef = propertyRef;
		propertyRef = newPropertyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.CONDITION_ELEMENT_TYPE__PROPERTY_REF, oldPropertyRef, propertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValuePackage.CONDITION_ELEMENT_TYPE__STRING_VALUE:
				return basicSetStringValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__BAG_VALUE:
				return basicSetBagValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE:
				return basicSetBooleanValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPLEX_VALUE:
				return basicSetComplexValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE:
				return basicSetCompositeValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE:
				return basicSetControlledValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__CURRENCY_VALUE:
				return basicSetCurrencyValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_VALUE:
				return basicSetDateValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE:
				return basicSetDateTimeValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__FILE_VALUE:
				return basicSetFileValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__INTEGER_VALUE:
				return basicSetIntegerValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE:
				return basicSetItemReferenceValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE:
				return basicSetLocalizedTextValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				return basicSetMeasureQualifiedNumberValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE:
				return basicSetMeasureRangeValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				return basicSetMeasureSingleNumberValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__NULL_VALUE:
				return basicSetNullValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__RATIONAL_VALUE:
				return basicSetRationalValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__REAL_VALUE:
				return basicSetRealValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE:
				return basicSetSequenceValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__SET_VALUE:
				return basicSetSetValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__TIME_VALUE:
				return basicSetTimeValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE:
				return basicSetYearMonthValue(null, msgs);
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_VALUE:
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
			case ValuePackage.CONDITION_ELEMENT_TYPE__STRING_VALUE:
				return getStringValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__BAG_VALUE:
				return getBagValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE:
				return getBooleanValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPLEX_VALUE:
				return getComplexValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE:
				return getCompositeValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE:
				return getControlledValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__CURRENCY_VALUE:
				return getCurrencyValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_VALUE:
				return getDateValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE:
				return getDateTimeValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__FILE_VALUE:
				return getFileValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__INTEGER_VALUE:
				return getIntegerValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE:
				return getItemReferenceValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE:
				return getLocalizedTextValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				return getMeasureQualifiedNumberValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE:
				return getMeasureRangeValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				return getMeasureSingleNumberValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__NULL_VALUE:
				return getNullValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__RATIONAL_VALUE:
				return getRationalValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__REAL_VALUE:
				return getRealValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE:
				return getSequenceValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__SET_VALUE:
				return getSetValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__TIME_VALUE:
				return getTimeValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE:
				return getYearMonthValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_VALUE:
				return getYearValue();
			case ValuePackage.CONDITION_ELEMENT_TYPE__PROPERTY_REF:
				return getPropertyRef();
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
			case ValuePackage.CONDITION_ELEMENT_TYPE__STRING_VALUE:
				setStringValue((StringValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__BAG_VALUE:
				setBagValue((BagValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE:
				setBooleanValue((BooleanValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPLEX_VALUE:
				setComplexValue((ComplexValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE:
				setCompositeValue((CompositeValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE:
				setControlledValue((ControlledValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__CURRENCY_VALUE:
				setCurrencyValue((CurrencyValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_VALUE:
				setDateValue((DateValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE:
				setDateTimeValue((DateTimeValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__FILE_VALUE:
				setFileValue((FileValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__INTEGER_VALUE:
				setIntegerValue((IntegerValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE:
				setItemReferenceValue((ItemReferenceValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE:
				setLocalizedTextValue((LocalizedTextValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				setMeasureQualifiedNumberValue((MeasureQualifiedNumberValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE:
				setMeasureRangeValue((MeasureRangeValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				setMeasureSingleNumberValue((MeasureSingleNumberValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__NULL_VALUE:
				setNullValue((NullValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__RATIONAL_VALUE:
				setRationalValue((RationalValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__REAL_VALUE:
				setRealValue((RealValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE:
				setSequenceValue((SequenceValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__SET_VALUE:
				setSetValue((SetValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__TIME_VALUE:
				setTimeValue((TimeValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE:
				setYearMonthValue((YearMonthValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_VALUE:
				setYearValue((YearValueType)newValue);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__PROPERTY_REF:
				setPropertyRef((String)newValue);
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
			case ValuePackage.CONDITION_ELEMENT_TYPE__STRING_VALUE:
				setStringValue((StringValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__BAG_VALUE:
				setBagValue((BagValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE:
				setBooleanValue((BooleanValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPLEX_VALUE:
				setComplexValue((ComplexValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE:
				setCompositeValue((CompositeValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE:
				setControlledValue((ControlledValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__CURRENCY_VALUE:
				setCurrencyValue((CurrencyValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_VALUE:
				setDateValue((DateValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE:
				setDateTimeValue((DateTimeValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__FILE_VALUE:
				setFileValue((FileValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__INTEGER_VALUE:
				setIntegerValue((IntegerValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE:
				setItemReferenceValue((ItemReferenceValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE:
				setLocalizedTextValue((LocalizedTextValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				setMeasureQualifiedNumberValue((MeasureQualifiedNumberValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE:
				setMeasureRangeValue((MeasureRangeValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				setMeasureSingleNumberValue((MeasureSingleNumberValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__NULL_VALUE:
				setNullValue((NullValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__RATIONAL_VALUE:
				setRationalValue((RationalValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__REAL_VALUE:
				setRealValue((RealValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE:
				setSequenceValue((SequenceValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__SET_VALUE:
				setSetValue((SetValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__TIME_VALUE:
				setTimeValue((TimeValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE:
				setYearMonthValue((YearMonthValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_VALUE:
				setYearValue((YearValueType)null);
				return;
			case ValuePackage.CONDITION_ELEMENT_TYPE__PROPERTY_REF:
				setPropertyRef(PROPERTY_REF_EDEFAULT);
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
			case ValuePackage.CONDITION_ELEMENT_TYPE__STRING_VALUE:
				return stringValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__BAG_VALUE:
				return bagValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE:
				return booleanValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPLEX_VALUE:
				return complexValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE:
				return compositeValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE:
				return controlledValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__CURRENCY_VALUE:
				return currencyValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_VALUE:
				return dateValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE:
				return dateTimeValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__FILE_VALUE:
				return fileValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__INTEGER_VALUE:
				return integerValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE:
				return itemReferenceValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE:
				return localizedTextValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE:
				return measureQualifiedNumberValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE:
				return measureRangeValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE:
				return measureSingleNumberValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__NULL_VALUE:
				return nullValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__RATIONAL_VALUE:
				return rationalValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__REAL_VALUE:
				return realValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE:
				return sequenceValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__SET_VALUE:
				return setValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__TIME_VALUE:
				return timeValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE:
				return yearMonthValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__YEAR_VALUE:
				return yearValue != null;
			case ValuePackage.CONDITION_ELEMENT_TYPE__PROPERTY_REF:
				return PROPERTY_REF_EDEFAULT == null ? propertyRef != null : !PROPERTY_REF_EDEFAULT.equals(propertyRef);
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
		result.append(" (propertyRef: ");
		result.append(propertyRef);
		result.append(')');
		return result.toString();
	}

} //ConditionElementTypeImpl
