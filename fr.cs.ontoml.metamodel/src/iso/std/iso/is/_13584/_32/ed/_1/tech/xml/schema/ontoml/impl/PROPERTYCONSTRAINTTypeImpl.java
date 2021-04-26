/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROPERTYCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYCONSTRAINTTypeImpl#getConstrainedProperty <em>Constrained Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PROPERTYCONSTRAINTTypeImpl extends CONSTRAINTTypeImpl implements PROPERTYCONSTRAINTType {
	/**
	 * The cached value of the '{@link #getConstrainedProperty() <em>Constrained Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedProperty()
	 * @generated
	 * @ordered
	 */
	protected PROPERTYREFERENCEType constrainedProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROPERTYCONSTRAINTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getPROPERTYCONSTRAINTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCEType getConstrainedProperty() {
		return constrainedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstrainedProperty(PROPERTYREFERENCEType newConstrainedProperty, NotificationChain msgs) {
		PROPERTYREFERENCEType oldConstrainedProperty = constrainedProperty;
		constrainedProperty = newConstrainedProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY, oldConstrainedProperty, newConstrainedProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedProperty(PROPERTYREFERENCEType newConstrainedProperty) {
		if (newConstrainedProperty != constrainedProperty) {
			NotificationChain msgs = null;
			if (constrainedProperty != null)
				msgs = ((InternalEObject)constrainedProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY, null, msgs);
			if (newConstrainedProperty != null)
				msgs = ((InternalEObject)newConstrainedProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY, null, msgs);
			msgs = basicSetConstrainedProperty(newConstrainedProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY, newConstrainedProperty, newConstrainedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY:
				return basicSetConstrainedProperty(null, msgs);
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
			case OntomlPackage.PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY:
				return getConstrainedProperty();
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
			case OntomlPackage.PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY:
				setConstrainedProperty((PROPERTYREFERENCEType)newValue);
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
			case OntomlPackage.PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY:
				setConstrainedProperty((PROPERTYREFERENCEType)null);
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
			case OntomlPackage.PROPERTYCONSTRAINT_TYPE__CONSTRAINED_PROPERTY:
				return constrainedProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //PROPERTYCONSTRAINTTypeImpl
