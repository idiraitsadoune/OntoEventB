/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONSTRAINTTypeImpl#getConstraintId <em>Constraint Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CONSTRAINTTypeImpl extends MinimalEObjectImpl.Container implements CONSTRAINTType {
	/**
	 * The default value of the '{@link #getConstraintId() <em>Constraint Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintId() <em>Constraint Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintId()
	 * @generated
	 * @ordered
	 */
	protected String constraintId = CONSTRAINT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONSTRAINTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCONSTRAINTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintId() {
		return constraintId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintId(String newConstraintId) {
		String oldConstraintId = constraintId;
		constraintId = newConstraintId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CONSTRAINT_TYPE__CONSTRAINT_ID, oldConstraintId, constraintId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.CONSTRAINT_TYPE__CONSTRAINT_ID:
				return getConstraintId();
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
			case OntomlPackage.CONSTRAINT_TYPE__CONSTRAINT_ID:
				setConstraintId((String)newValue);
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
			case OntomlPackage.CONSTRAINT_TYPE__CONSTRAINT_ID:
				setConstraintId(CONSTRAINT_ID_EDEFAULT);
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
			case OntomlPackage.CONSTRAINT_TYPE__CONSTRAINT_ID:
				return CONSTRAINT_ID_EDEFAULT == null ? constraintId != null : !CONSTRAINT_ID_EDEFAULT.equals(constraintId);
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
		result.append(" (constraintId: ");
		result.append(constraintId);
		result.append(')');
		return result.toString();
	}

} //CONSTRAINTTypeImpl
