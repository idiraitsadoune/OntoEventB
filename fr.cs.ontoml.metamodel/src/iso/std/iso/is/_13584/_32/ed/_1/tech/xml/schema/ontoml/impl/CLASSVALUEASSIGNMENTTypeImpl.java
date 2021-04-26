/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLASSVALUEASSIGNMENT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSVALUEASSIGNMENTTypeImpl#getSuperClassDefinedProperty <em>Super Class Defined Property</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSVALUEASSIGNMENTTypeImpl#getAssignedValue <em>Assigned Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASSVALUEASSIGNMENTTypeImpl extends MinimalEObjectImpl.Container implements CLASSVALUEASSIGNMENTType {
	/**
	 * The cached value of the '{@link #getSuperClassDefinedProperty() <em>Super Class Defined Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClassDefinedProperty()
	 * @generated
	 * @ordered
	 */
	protected PROPERTYREFERENCEType superClassDefinedProperty;

	/**
	 * The cached value of the '{@link #getAssignedValue() <em>Assigned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedValue()
	 * @generated
	 * @ordered
	 */
	protected ASSIGNEDVALUEType assignedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSVALUEASSIGNMENTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCLASSVALUEASSIGNMENTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCEType getSuperClassDefinedProperty() {
		return superClassDefinedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperClassDefinedProperty(PROPERTYREFERENCEType newSuperClassDefinedProperty, NotificationChain msgs) {
		PROPERTYREFERENCEType oldSuperClassDefinedProperty = superClassDefinedProperty;
		superClassDefinedProperty = newSuperClassDefinedProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY, oldSuperClassDefinedProperty, newSuperClassDefinedProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClassDefinedProperty(PROPERTYREFERENCEType newSuperClassDefinedProperty) {
		if (newSuperClassDefinedProperty != superClassDefinedProperty) {
			NotificationChain msgs = null;
			if (superClassDefinedProperty != null)
				msgs = ((InternalEObject)superClassDefinedProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY, null, msgs);
			if (newSuperClassDefinedProperty != null)
				msgs = ((InternalEObject)newSuperClassDefinedProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY, null, msgs);
			msgs = basicSetSuperClassDefinedProperty(newSuperClassDefinedProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY, newSuperClassDefinedProperty, newSuperClassDefinedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASSIGNEDVALUEType getAssignedValue() {
		return assignedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedValue(ASSIGNEDVALUEType newAssignedValue, NotificationChain msgs) {
		ASSIGNEDVALUEType oldAssignedValue = assignedValue;
		assignedValue = newAssignedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE, oldAssignedValue, newAssignedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedValue(ASSIGNEDVALUEType newAssignedValue) {
		if (newAssignedValue != assignedValue) {
			NotificationChain msgs = null;
			if (assignedValue != null)
				msgs = ((InternalEObject)assignedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE, null, msgs);
			if (newAssignedValue != null)
				msgs = ((InternalEObject)newAssignedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE, null, msgs);
			msgs = basicSetAssignedValue(newAssignedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE, newAssignedValue, newAssignedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY:
				return basicSetSuperClassDefinedProperty(null, msgs);
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE:
				return basicSetAssignedValue(null, msgs);
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
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY:
				return getSuperClassDefinedProperty();
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE:
				return getAssignedValue();
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
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY:
				setSuperClassDefinedProperty((PROPERTYREFERENCEType)newValue);
				return;
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE:
				setAssignedValue((ASSIGNEDVALUEType)newValue);
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
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY:
				setSuperClassDefinedProperty((PROPERTYREFERENCEType)null);
				return;
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE:
				setAssignedValue((ASSIGNEDVALUEType)null);
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
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__SUPER_CLASS_DEFINED_PROPERTY:
				return superClassDefinedProperty != null;
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE__ASSIGNED_VALUE:
				return assignedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //CLASSVALUEASSIGNMENTTypeImpl
