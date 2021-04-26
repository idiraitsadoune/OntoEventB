/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SETWITHSUBSETCONSTRAINTTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SETWITHSUBSETCONSTRAINTTYPETypeImpl#getBound1 <em>Bound1</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SETWITHSUBSETCONSTRAINTTYPETypeImpl#getBound2 <em>Bound2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SETWITHSUBSETCONSTRAINTTYPETypeImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SETWITHSUBSETCONSTRAINTTYPETypeImpl#getCardinalMin <em>Cardinal Min</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SETWITHSUBSETCONSTRAINTTYPETypeImpl#getCardinalMax <em>Cardinal Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SETWITHSUBSETCONSTRAINTTYPETypeImpl extends ANYTYPETypeImpl implements SETWITHSUBSETCONSTRAINTTYPEType {
	/**
	 * The default value of the '{@link #getBound1() <em>Bound1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BOUND1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBound1() <em>Bound1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bound1 = BOUND1_EDEFAULT;

	/**
	 * The default value of the '{@link #getBound2() <em>Bound2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound2()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BOUND2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBound2() <em>Bound2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound2()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bound2 = BOUND2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected ANYTYPEType valueType;

	/**
	 * The default value of the '{@link #getCardinalMin() <em>Cardinal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalMin()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CARDINAL_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinalMin() <em>Cardinal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalMin()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cardinalMin = CARDINAL_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinalMax() <em>Cardinal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalMax()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CARDINAL_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinalMax() <em>Cardinal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalMax()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cardinalMax = CARDINAL_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SETWITHSUBSETCONSTRAINTTYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getSETWITHSUBSETCONSTRAINTTYPEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBound1() {
		return bound1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound1(BigInteger newBound1) {
		BigInteger oldBound1 = bound1;
		bound1 = newBound1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND1, oldBound1, bound1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBound2() {
		return bound2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound2(BigInteger newBound2) {
		BigInteger oldBound2 = bound2;
		bound2 = newBound2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND2, oldBound2, bound2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANYTYPEType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueType(ANYTYPEType newValueType, NotificationChain msgs) {
		ANYTYPEType oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE, oldValueType, newValueType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ANYTYPEType newValueType) {
		if (newValueType != valueType) {
			NotificationChain msgs = null;
			if (valueType != null)
				msgs = ((InternalEObject)valueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE, null, msgs);
			if (newValueType != null)
				msgs = ((InternalEObject)newValueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE, null, msgs);
			msgs = basicSetValueType(newValueType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE, newValueType, newValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCardinalMin() {
		return cardinalMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalMin(BigInteger newCardinalMin) {
		BigInteger oldCardinalMin = cardinalMin;
		cardinalMin = newCardinalMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MIN, oldCardinalMin, cardinalMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCardinalMax() {
		return cardinalMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalMax(BigInteger newCardinalMax) {
		BigInteger oldCardinalMax = cardinalMax;
		cardinalMax = newCardinalMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MAX, oldCardinalMax, cardinalMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE:
				return basicSetValueType(null, msgs);
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
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND1:
				return getBound1();
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND2:
				return getBound2();
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE:
				return getValueType();
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MIN:
				return getCardinalMin();
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MAX:
				return getCardinalMax();
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
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND1:
				setBound1((BigInteger)newValue);
				return;
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND2:
				setBound2((BigInteger)newValue);
				return;
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE:
				setValueType((ANYTYPEType)newValue);
				return;
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MIN:
				setCardinalMin((BigInteger)newValue);
				return;
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MAX:
				setCardinalMax((BigInteger)newValue);
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
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND1:
				setBound1(BOUND1_EDEFAULT);
				return;
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND2:
				setBound2(BOUND2_EDEFAULT);
				return;
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE:
				setValueType((ANYTYPEType)null);
				return;
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MIN:
				setCardinalMin(CARDINAL_MIN_EDEFAULT);
				return;
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MAX:
				setCardinalMax(CARDINAL_MAX_EDEFAULT);
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
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND1:
				return BOUND1_EDEFAULT == null ? bound1 != null : !BOUND1_EDEFAULT.equals(bound1);
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__BOUND2:
				return BOUND2_EDEFAULT == null ? bound2 != null : !BOUND2_EDEFAULT.equals(bound2);
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__VALUE_TYPE:
				return valueType != null;
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MIN:
				return CARDINAL_MIN_EDEFAULT == null ? cardinalMin != null : !CARDINAL_MIN_EDEFAULT.equals(cardinalMin);
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE__CARDINAL_MAX:
				return CARDINAL_MAX_EDEFAULT == null ? cardinalMax != null : !CARDINAL_MAX_EDEFAULT.equals(cardinalMax);
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
		result.append(" (bound1: ");
		result.append(bound1);
		result.append(", bound2: ");
		result.append(bound2);
		result.append(", cardinalMin: ");
		result.append(cardinalMin);
		result.append(", cardinalMax: ");
		result.append(cardinalMax);
		result.append(')');
		return result.toString();
	}

} //SETWITHSUBSETCONSTRAINTTYPETypeImpl
