/**
 */
package pivotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pivotmodel.DataTypeDefinition;
import pivotmodel.PivotmodelPackage;
import pivotmodel.ValueRestrictedClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Restricted Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.ValueRestrictedClassImpl#getToDataDefinition <em>To Data Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueRestrictedClassImpl extends RestrictedClassImpl implements ValueRestrictedClass {
	/**
	 * The cached value of the '{@link #getToDataDefinition() <em>To Data Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDataDefinition()
	 * @generated
	 * @ordered
	 */
	protected DataTypeDefinition toDataDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueRestrictedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.VALUE_RESTRICTED_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTypeDefinition getToDataDefinition() {
		if (toDataDefinition != null && toDataDefinition.eIsProxy()) {
			InternalEObject oldToDataDefinition = (InternalEObject)toDataDefinition;
			toDataDefinition = (DataTypeDefinition)eResolveProxy(oldToDataDefinition);
			if (toDataDefinition != oldToDataDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotmodelPackage.VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION, oldToDataDefinition, toDataDefinition));
			}
		}
		return toDataDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDefinition basicGetToDataDefinition() {
		return toDataDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToDataDefinition(DataTypeDefinition newToDataDefinition) {
		DataTypeDefinition oldToDataDefinition = toDataDefinition;
		toDataDefinition = newToDataDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION, oldToDataDefinition, toDataDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION:
				if (resolve) return getToDataDefinition();
				return basicGetToDataDefinition();
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
			case PivotmodelPackage.VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION:
				setToDataDefinition((DataTypeDefinition)newValue);
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
			case PivotmodelPackage.VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION:
				setToDataDefinition((DataTypeDefinition)null);
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
			case PivotmodelPackage.VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION:
				return toDataDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueRestrictedClassImpl
