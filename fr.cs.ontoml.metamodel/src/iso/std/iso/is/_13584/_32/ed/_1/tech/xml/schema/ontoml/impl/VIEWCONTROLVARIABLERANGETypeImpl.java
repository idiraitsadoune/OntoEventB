/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VIEWCONTROLVARIABLERANGE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VIEWCONTROLVARIABLERANGETypeImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VIEWCONTROLVARIABLERANGETypeImpl#getRangeLobound <em>Range Lobound</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VIEWCONTROLVARIABLERANGETypeImpl#getRangeHibound <em>Range Hibound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VIEWCONTROLVARIABLERANGETypeImpl extends MinimalEObjectImpl.Container implements VIEWCONTROLVARIABLERANGEType {
	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected PROPERTYREFERENCEType parameterType;

	/**
	 * The default value of the '{@link #getRangeLobound() <em>Range Lobound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeLobound()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RANGE_LOBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRangeLobound() <em>Range Lobound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeLobound()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rangeLobound = RANGE_LOBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRangeHibound() <em>Range Hibound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeHibound()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RANGE_HIBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRangeHibound() <em>Range Hibound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeHibound()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rangeHibound = RANGE_HIBOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VIEWCONTROLVARIABLERANGETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getVIEWCONTROLVARIABLERANGEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCEType getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterType(PROPERTYREFERENCEType newParameterType, NotificationChain msgs) {
		PROPERTYREFERENCEType oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE, oldParameterType, newParameterType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(PROPERTYREFERENCEType newParameterType) {
		if (newParameterType != parameterType) {
			NotificationChain msgs = null;
			if (parameterType != null)
				msgs = ((InternalEObject)parameterType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE, null, msgs);
			if (newParameterType != null)
				msgs = ((InternalEObject)newParameterType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE, null, msgs);
			msgs = basicSetParameterType(newParameterType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE, newParameterType, newParameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRangeLobound() {
		return rangeLobound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeLobound(BigInteger newRangeLobound) {
		BigInteger oldRangeLobound = rangeLobound;
		rangeLobound = newRangeLobound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_LOBOUND, oldRangeLobound, rangeLobound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRangeHibound() {
		return rangeHibound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeHibound(BigInteger newRangeHibound) {
		BigInteger oldRangeHibound = rangeHibound;
		rangeHibound = newRangeHibound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_HIBOUND, oldRangeHibound, rangeHibound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE:
				return basicSetParameterType(null, msgs);
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
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE:
				return getParameterType();
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_LOBOUND:
				return getRangeLobound();
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_HIBOUND:
				return getRangeHibound();
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
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE:
				setParameterType((PROPERTYREFERENCEType)newValue);
				return;
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_LOBOUND:
				setRangeLobound((BigInteger)newValue);
				return;
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_HIBOUND:
				setRangeHibound((BigInteger)newValue);
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
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE:
				setParameterType((PROPERTYREFERENCEType)null);
				return;
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_LOBOUND:
				setRangeLobound(RANGE_LOBOUND_EDEFAULT);
				return;
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_HIBOUND:
				setRangeHibound(RANGE_HIBOUND_EDEFAULT);
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
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__PARAMETER_TYPE:
				return parameterType != null;
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_LOBOUND:
				return RANGE_LOBOUND_EDEFAULT == null ? rangeLobound != null : !RANGE_LOBOUND_EDEFAULT.equals(rangeLobound);
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE__RANGE_HIBOUND:
				return RANGE_HIBOUND_EDEFAULT == null ? rangeHibound != null : !RANGE_HIBOUND_EDEFAULT.equals(rangeHibound);
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
		result.append(" (rangeLobound: ");
		result.append(rangeLobound);
		result.append(", rangeHibound: ");
		result.append(rangeHibound);
		result.append(')');
		return result.toString();
	}

} //VIEWCONTROLVARIABLERANGETypeImpl
