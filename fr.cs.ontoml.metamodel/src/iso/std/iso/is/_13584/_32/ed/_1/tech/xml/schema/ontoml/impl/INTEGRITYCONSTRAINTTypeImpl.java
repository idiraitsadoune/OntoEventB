/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INTEGRITYCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INTEGRITYCONSTRAINTTypeImpl#getRedefinedDomain <em>Redefined Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INTEGRITYCONSTRAINTTypeImpl extends PROPERTYCONSTRAINTTypeImpl implements INTEGRITYCONSTRAINTType {
	/**
	 * The cached value of the '{@link #getRedefinedDomain() <em>Redefined Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedDomain()
	 * @generated
	 * @ordered
	 */
	protected DOMAINCONSTRAINTType redefinedDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INTEGRITYCONSTRAINTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getINTEGRITYCONSTRAINTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOMAINCONSTRAINTType getRedefinedDomain() {
		return redefinedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefinedDomain(DOMAINCONSTRAINTType newRedefinedDomain, NotificationChain msgs) {
		DOMAINCONSTRAINTType oldRedefinedDomain = redefinedDomain;
		redefinedDomain = newRedefinedDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN, oldRedefinedDomain, newRedefinedDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedDomain(DOMAINCONSTRAINTType newRedefinedDomain) {
		if (newRedefinedDomain != redefinedDomain) {
			NotificationChain msgs = null;
			if (redefinedDomain != null)
				msgs = ((InternalEObject)redefinedDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN, null, msgs);
			if (newRedefinedDomain != null)
				msgs = ((InternalEObject)newRedefinedDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN, null, msgs);
			msgs = basicSetRedefinedDomain(newRedefinedDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN, newRedefinedDomain, newRedefinedDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN:
				return basicSetRedefinedDomain(null, msgs);
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
			case OntomlPackage.INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN:
				return getRedefinedDomain();
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
			case OntomlPackage.INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN:
				setRedefinedDomain((DOMAINCONSTRAINTType)newValue);
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
			case OntomlPackage.INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN:
				setRedefinedDomain((DOMAINCONSTRAINTType)null);
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
			case OntomlPackage.INTEGRITYCONSTRAINT_TYPE__REDEFINED_DOMAIN:
				return redefinedDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //INTEGRITYCONSTRAINTTypeImpl
