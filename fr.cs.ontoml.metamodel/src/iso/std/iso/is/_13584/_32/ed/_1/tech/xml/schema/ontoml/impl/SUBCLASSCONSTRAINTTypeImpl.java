/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBCLASSCONSTRAINTType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SUBCLASSCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUBCLASSCONSTRAINTTypeImpl#getSubclasses <em>Subclasses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SUBCLASSCONSTRAINTTypeImpl extends DOMAINCONSTRAINTTypeImpl implements SUBCLASSCONSTRAINTType {
	/**
	 * The cached value of the '{@link #getSubclasses() <em>Subclasses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclasses()
	 * @generated
	 * @ordered
	 */
	protected CLASSESREFERENCEType subclasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUBCLASSCONSTRAINTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getSUBCLASSCONSTRAINTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCEType getSubclasses() {
		return subclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubclasses(CLASSESREFERENCEType newSubclasses, NotificationChain msgs) {
		CLASSESREFERENCEType oldSubclasses = subclasses;
		subclasses = newSubclasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.SUBCLASSCONSTRAINT_TYPE__SUBCLASSES, oldSubclasses, newSubclasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubclasses(CLASSESREFERENCEType newSubclasses) {
		if (newSubclasses != subclasses) {
			NotificationChain msgs = null;
			if (subclasses != null)
				msgs = ((InternalEObject)subclasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.SUBCLASSCONSTRAINT_TYPE__SUBCLASSES, null, msgs);
			if (newSubclasses != null)
				msgs = ((InternalEObject)newSubclasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.SUBCLASSCONSTRAINT_TYPE__SUBCLASSES, null, msgs);
			msgs = basicSetSubclasses(newSubclasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUBCLASSCONSTRAINT_TYPE__SUBCLASSES, newSubclasses, newSubclasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.SUBCLASSCONSTRAINT_TYPE__SUBCLASSES:
				return basicSetSubclasses(null, msgs);
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
			case OntomlPackage.SUBCLASSCONSTRAINT_TYPE__SUBCLASSES:
				return getSubclasses();
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
			case OntomlPackage.SUBCLASSCONSTRAINT_TYPE__SUBCLASSES:
				setSubclasses((CLASSESREFERENCEType)newValue);
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
			case OntomlPackage.SUBCLASSCONSTRAINT_TYPE__SUBCLASSES:
				setSubclasses((CLASSESREFERENCEType)null);
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
			case OntomlPackage.SUBCLASSCONSTRAINT_TYPE__SUBCLASSES:
				return subclasses != null;
		}
		return super.eIsSet(featureID);
	}

} //SUBCLASSCONSTRAINTTypeImpl
