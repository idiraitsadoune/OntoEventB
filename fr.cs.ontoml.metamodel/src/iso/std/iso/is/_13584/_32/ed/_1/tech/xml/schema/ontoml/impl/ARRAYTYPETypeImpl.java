/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARRAYTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ARRAYTYPETypeImpl#getBound1 <em>Bound1</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ARRAYTYPETypeImpl#getBound2 <em>Bound2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ARRAYTYPETypeImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ARRAYTYPETypeImpl#isUniqueness <em>Uniqueness</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ARRAYTYPETypeImpl#isAreOptional <em>Are Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARRAYTYPETypeImpl extends ANYTYPETypeImpl implements ARRAYTYPEType {
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
	 * The default value of the '{@link #isUniqueness() <em>Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueness()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUENESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueness() <em>Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueness()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueness = UNIQUENESS_EDEFAULT;

	/**
	 * This is true if the Uniqueness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniquenessESet;

	/**
	 * The default value of the '{@link #isAreOptional() <em>Are Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAreOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARE_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAreOptional() <em>Are Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAreOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean areOptional = ARE_OPTIONAL_EDEFAULT;

	/**
	 * This is true if the Are Optional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean areOptionalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ARRAYTYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getARRAYTYPEType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ARRAYTYPE_TYPE__BOUND1, oldBound1, bound1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ARRAYTYPE_TYPE__BOUND2, oldBound2, bound2));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ARRAYTYPE_TYPE__VALUE_TYPE, oldValueType, newValueType);
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
				msgs = ((InternalEObject)valueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ARRAYTYPE_TYPE__VALUE_TYPE, null, msgs);
			if (newValueType != null)
				msgs = ((InternalEObject)newValueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ARRAYTYPE_TYPE__VALUE_TYPE, null, msgs);
			msgs = basicSetValueType(newValueType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ARRAYTYPE_TYPE__VALUE_TYPE, newValueType, newValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueness() {
		return uniqueness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueness(boolean newUniqueness) {
		boolean oldUniqueness = uniqueness;
		uniqueness = newUniqueness;
		boolean oldUniquenessESet = uniquenessESet;
		uniquenessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ARRAYTYPE_TYPE__UNIQUENESS, oldUniqueness, uniqueness, !oldUniquenessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniqueness() {
		boolean oldUniqueness = uniqueness;
		boolean oldUniquenessESet = uniquenessESet;
		uniqueness = UNIQUENESS_EDEFAULT;
		uniquenessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.ARRAYTYPE_TYPE__UNIQUENESS, oldUniqueness, UNIQUENESS_EDEFAULT, oldUniquenessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniqueness() {
		return uniquenessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAreOptional() {
		return areOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreOptional(boolean newAreOptional) {
		boolean oldAreOptional = areOptional;
		areOptional = newAreOptional;
		boolean oldAreOptionalESet = areOptionalESet;
		areOptionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ARRAYTYPE_TYPE__ARE_OPTIONAL, oldAreOptional, areOptional, !oldAreOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAreOptional() {
		boolean oldAreOptional = areOptional;
		boolean oldAreOptionalESet = areOptionalESet;
		areOptional = ARE_OPTIONAL_EDEFAULT;
		areOptionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.ARRAYTYPE_TYPE__ARE_OPTIONAL, oldAreOptional, ARE_OPTIONAL_EDEFAULT, oldAreOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAreOptional() {
		return areOptionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.ARRAYTYPE_TYPE__VALUE_TYPE:
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
			case OntomlPackage.ARRAYTYPE_TYPE__BOUND1:
				return getBound1();
			case OntomlPackage.ARRAYTYPE_TYPE__BOUND2:
				return getBound2();
			case OntomlPackage.ARRAYTYPE_TYPE__VALUE_TYPE:
				return getValueType();
			case OntomlPackage.ARRAYTYPE_TYPE__UNIQUENESS:
				return isUniqueness();
			case OntomlPackage.ARRAYTYPE_TYPE__ARE_OPTIONAL:
				return isAreOptional();
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
			case OntomlPackage.ARRAYTYPE_TYPE__BOUND1:
				setBound1((BigInteger)newValue);
				return;
			case OntomlPackage.ARRAYTYPE_TYPE__BOUND2:
				setBound2((BigInteger)newValue);
				return;
			case OntomlPackage.ARRAYTYPE_TYPE__VALUE_TYPE:
				setValueType((ANYTYPEType)newValue);
				return;
			case OntomlPackage.ARRAYTYPE_TYPE__UNIQUENESS:
				setUniqueness((Boolean)newValue);
				return;
			case OntomlPackage.ARRAYTYPE_TYPE__ARE_OPTIONAL:
				setAreOptional((Boolean)newValue);
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
			case OntomlPackage.ARRAYTYPE_TYPE__BOUND1:
				setBound1(BOUND1_EDEFAULT);
				return;
			case OntomlPackage.ARRAYTYPE_TYPE__BOUND2:
				setBound2(BOUND2_EDEFAULT);
				return;
			case OntomlPackage.ARRAYTYPE_TYPE__VALUE_TYPE:
				setValueType((ANYTYPEType)null);
				return;
			case OntomlPackage.ARRAYTYPE_TYPE__UNIQUENESS:
				unsetUniqueness();
				return;
			case OntomlPackage.ARRAYTYPE_TYPE__ARE_OPTIONAL:
				unsetAreOptional();
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
			case OntomlPackage.ARRAYTYPE_TYPE__BOUND1:
				return BOUND1_EDEFAULT == null ? bound1 != null : !BOUND1_EDEFAULT.equals(bound1);
			case OntomlPackage.ARRAYTYPE_TYPE__BOUND2:
				return BOUND2_EDEFAULT == null ? bound2 != null : !BOUND2_EDEFAULT.equals(bound2);
			case OntomlPackage.ARRAYTYPE_TYPE__VALUE_TYPE:
				return valueType != null;
			case OntomlPackage.ARRAYTYPE_TYPE__UNIQUENESS:
				return isSetUniqueness();
			case OntomlPackage.ARRAYTYPE_TYPE__ARE_OPTIONAL:
				return isSetAreOptional();
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
		result.append(", uniqueness: ");
		if (uniquenessESet) result.append(uniqueness); else result.append("<unset>");
		result.append(", areOptional: ");
		if (areOptionalESet) result.append(areOptional); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ARRAYTYPETypeImpl
