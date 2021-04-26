/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl#getPresentationValue <em>Presentation Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl#getQualifierCode <em>Qualifier Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.QualifiedValueTypeImpl#getQualifierRef <em>Qualifier Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedValueTypeImpl extends MinimalEObjectImpl.Container implements QualifiedValueType {
	/**
	 * The cached value of the '{@link #getPresentationValue() <em>Presentation Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationValue()
	 * @generated
	 * @ordered
	 */
	protected PresentationValueType presentationValue;

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
	 * The cached value of the '{@link #getComplexValue() <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexValue()
	 * @generated
	 * @ordered
	 */
	protected ComplexValueType complexValue;

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
	 * The cached value of the '{@link #getRationalValue() <em>Rational Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationalValue()
	 * @generated
	 * @ordered
	 */
	protected RationalValueType rationalValue;

	/**
	 * The default value of the '{@link #getQualifierCode() <em>Qualifier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierCode()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifierCode() <em>Qualifier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierCode()
	 * @generated
	 * @ordered
	 */
	protected String qualifierCode = QUALIFIER_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifierRef() <em>Qualifier Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierRef()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifierRef() <em>Qualifier Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierRef()
	 * @generated
	 * @ordered
	 */
	protected String qualifierRef = QUALIFIER_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.QUALIFIED_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationValueType getPresentationValue() {
		return presentationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationValue(PresentationValueType newPresentationValue, NotificationChain msgs) {
		PresentationValueType oldPresentationValue = presentationValue;
		presentationValue = newPresentationValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE, oldPresentationValue, newPresentationValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationValue(PresentationValueType newPresentationValue) {
		if (newPresentationValue != presentationValue) {
			NotificationChain msgs = null;
			if (presentationValue != null)
				msgs = ((InternalEObject)presentationValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE, null, msgs);
			if (newPresentationValue != null)
				msgs = ((InternalEObject)newPresentationValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE, null, msgs);
			msgs = basicSetPresentationValue(newPresentationValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE, newPresentationValue, newPresentationValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__REAL_VALUE, oldRealValue, newRealValue);
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
				msgs = ((InternalEObject)realValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__REAL_VALUE, null, msgs);
			if (newRealValue != null)
				msgs = ((InternalEObject)newRealValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__REAL_VALUE, null, msgs);
			msgs = basicSetRealValue(newRealValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__REAL_VALUE, newRealValue, newRealValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__COMPLEX_VALUE, oldComplexValue, newComplexValue);
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
				msgs = ((InternalEObject)complexValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__COMPLEX_VALUE, null, msgs);
			if (newComplexValue != null)
				msgs = ((InternalEObject)newComplexValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__COMPLEX_VALUE, null, msgs);
			msgs = basicSetComplexValue(newComplexValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__COMPLEX_VALUE, newComplexValue, newComplexValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__INTEGER_VALUE, oldIntegerValue, newIntegerValue);
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
				msgs = ((InternalEObject)integerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__INTEGER_VALUE, null, msgs);
			if (newIntegerValue != null)
				msgs = ((InternalEObject)newIntegerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__INTEGER_VALUE, null, msgs);
			msgs = basicSetIntegerValue(newIntegerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__INTEGER_VALUE, newIntegerValue, newIntegerValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__RATIONAL_VALUE, oldRationalValue, newRationalValue);
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
				msgs = ((InternalEObject)rationalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__RATIONAL_VALUE, null, msgs);
			if (newRationalValue != null)
				msgs = ((InternalEObject)newRationalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuePackage.QUALIFIED_VALUE_TYPE__RATIONAL_VALUE, null, msgs);
			msgs = basicSetRationalValue(newRationalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__RATIONAL_VALUE, newRationalValue, newRationalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifierCode() {
		return qualifierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifierCode(String newQualifierCode) {
		String oldQualifierCode = qualifierCode;
		qualifierCode = newQualifierCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_CODE, oldQualifierCode, qualifierCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifierRef() {
		return qualifierRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifierRef(String newQualifierRef) {
		String oldQualifierRef = qualifierRef;
		qualifierRef = newQualifierRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_REF, oldQualifierRef, qualifierRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValuePackage.QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE:
				return basicSetPresentationValue(null, msgs);
			case ValuePackage.QUALIFIED_VALUE_TYPE__REAL_VALUE:
				return basicSetRealValue(null, msgs);
			case ValuePackage.QUALIFIED_VALUE_TYPE__COMPLEX_VALUE:
				return basicSetComplexValue(null, msgs);
			case ValuePackage.QUALIFIED_VALUE_TYPE__INTEGER_VALUE:
				return basicSetIntegerValue(null, msgs);
			case ValuePackage.QUALIFIED_VALUE_TYPE__RATIONAL_VALUE:
				return basicSetRationalValue(null, msgs);
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
			case ValuePackage.QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE:
				return getPresentationValue();
			case ValuePackage.QUALIFIED_VALUE_TYPE__REAL_VALUE:
				return getRealValue();
			case ValuePackage.QUALIFIED_VALUE_TYPE__COMPLEX_VALUE:
				return getComplexValue();
			case ValuePackage.QUALIFIED_VALUE_TYPE__INTEGER_VALUE:
				return getIntegerValue();
			case ValuePackage.QUALIFIED_VALUE_TYPE__RATIONAL_VALUE:
				return getRationalValue();
			case ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_CODE:
				return getQualifierCode();
			case ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_REF:
				return getQualifierRef();
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
			case ValuePackage.QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE:
				setPresentationValue((PresentationValueType)newValue);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__REAL_VALUE:
				setRealValue((RealValueType)newValue);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__COMPLEX_VALUE:
				setComplexValue((ComplexValueType)newValue);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__INTEGER_VALUE:
				setIntegerValue((IntegerValueType)newValue);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__RATIONAL_VALUE:
				setRationalValue((RationalValueType)newValue);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_CODE:
				setQualifierCode((String)newValue);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_REF:
				setQualifierRef((String)newValue);
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
			case ValuePackage.QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE:
				setPresentationValue((PresentationValueType)null);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__REAL_VALUE:
				setRealValue((RealValueType)null);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__COMPLEX_VALUE:
				setComplexValue((ComplexValueType)null);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__INTEGER_VALUE:
				setIntegerValue((IntegerValueType)null);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__RATIONAL_VALUE:
				setRationalValue((RationalValueType)null);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_CODE:
				setQualifierCode(QUALIFIER_CODE_EDEFAULT);
				return;
			case ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_REF:
				setQualifierRef(QUALIFIER_REF_EDEFAULT);
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
			case ValuePackage.QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE:
				return presentationValue != null;
			case ValuePackage.QUALIFIED_VALUE_TYPE__REAL_VALUE:
				return realValue != null;
			case ValuePackage.QUALIFIED_VALUE_TYPE__COMPLEX_VALUE:
				return complexValue != null;
			case ValuePackage.QUALIFIED_VALUE_TYPE__INTEGER_VALUE:
				return integerValue != null;
			case ValuePackage.QUALIFIED_VALUE_TYPE__RATIONAL_VALUE:
				return rationalValue != null;
			case ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_CODE:
				return QUALIFIER_CODE_EDEFAULT == null ? qualifierCode != null : !QUALIFIER_CODE_EDEFAULT.equals(qualifierCode);
			case ValuePackage.QUALIFIED_VALUE_TYPE__QUALIFIER_REF:
				return QUALIFIER_REF_EDEFAULT == null ? qualifierRef != null : !QUALIFIER_REF_EDEFAULT.equals(qualifierRef);
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
		result.append(" (qualifierCode: ");
		result.append(qualifierCode);
		result.append(", qualifierRef: ");
		result.append(qualifierRef);
		result.append(')');
		return result.toString();
	}

} //QualifiedValueTypeImpl
