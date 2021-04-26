/**
 */
package pivotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pivotmodel.PivotmodelPackage;
import pivotmodel.PropertyDefinition;
import pivotmodel.RestrictedClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restricted Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.RestrictedClassImpl#getOnProperty <em>On Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RestrictedClassImpl extends ClassDefinitionImpl implements RestrictedClass {
	/**
	 * The cached value of the '{@link #getOnProperty() <em>On Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyDefinition onProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.RESTRICTED_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinition getOnProperty() {
		if (onProperty != null && onProperty.eIsProxy()) {
			InternalEObject oldOnProperty = (InternalEObject)onProperty;
			onProperty = (PropertyDefinition)eResolveProxy(oldOnProperty);
			if (onProperty != oldOnProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotmodelPackage.RESTRICTED_CLASS__ON_PROPERTY, oldOnProperty, onProperty));
			}
		}
		return onProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinition basicGetOnProperty() {
		return onProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnProperty(PropertyDefinition newOnProperty) {
		PropertyDefinition oldOnProperty = onProperty;
		onProperty = newOnProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.RESTRICTED_CLASS__ON_PROPERTY, oldOnProperty, onProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.RESTRICTED_CLASS__ON_PROPERTY:
				if (resolve) return getOnProperty();
				return basicGetOnProperty();
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
			case PivotmodelPackage.RESTRICTED_CLASS__ON_PROPERTY:
				setOnProperty((PropertyDefinition)newValue);
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
			case PivotmodelPackage.RESTRICTED_CLASS__ON_PROPERTY:
				setOnProperty((PropertyDefinition)null);
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
			case PivotmodelPackage.RESTRICTED_CLASS__ON_PROPERTY:
				return onProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //RestrictedClassImpl
