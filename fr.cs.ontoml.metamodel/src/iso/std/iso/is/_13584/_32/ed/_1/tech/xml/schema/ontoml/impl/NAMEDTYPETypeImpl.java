/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NAMEDTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NAMEDTYPETypeImpl#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NAMEDTYPETypeImpl extends ANYTYPETypeImpl implements NAMEDTYPEType {
	/**
	 * The cached value of the '{@link #getReferredType() <em>Referred Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredType()
	 * @generated
	 * @ordered
	 */
	protected DATATYPEREFERENCEType referredType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NAMEDTYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getNAMEDTYPEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEREFERENCEType getReferredType() {
		return referredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferredType(DATATYPEREFERENCEType newReferredType, NotificationChain msgs) {
		DATATYPEREFERENCEType oldReferredType = referredType;
		referredType = newReferredType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.NAMEDTYPE_TYPE__REFERRED_TYPE, oldReferredType, newReferredType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredType(DATATYPEREFERENCEType newReferredType) {
		if (newReferredType != referredType) {
			NotificationChain msgs = null;
			if (referredType != null)
				msgs = ((InternalEObject)referredType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NAMEDTYPE_TYPE__REFERRED_TYPE, null, msgs);
			if (newReferredType != null)
				msgs = ((InternalEObject)newReferredType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NAMEDTYPE_TYPE__REFERRED_TYPE, null, msgs);
			msgs = basicSetReferredType(newReferredType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.NAMEDTYPE_TYPE__REFERRED_TYPE, newReferredType, newReferredType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.NAMEDTYPE_TYPE__REFERRED_TYPE:
				return basicSetReferredType(null, msgs);
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
			case OntomlPackage.NAMEDTYPE_TYPE__REFERRED_TYPE:
				return getReferredType();
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
			case OntomlPackage.NAMEDTYPE_TYPE__REFERRED_TYPE:
				setReferredType((DATATYPEREFERENCEType)newValue);
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
			case OntomlPackage.NAMEDTYPE_TYPE__REFERRED_TYPE:
				setReferredType((DATATYPEREFERENCEType)null);
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
			case OntomlPackage.NAMEDTYPE_TYPE__REFERRED_TYPE:
				return referredType != null;
		}
		return super.eIsSet(featureID);
	}

} //NAMEDTYPETypeImpl
