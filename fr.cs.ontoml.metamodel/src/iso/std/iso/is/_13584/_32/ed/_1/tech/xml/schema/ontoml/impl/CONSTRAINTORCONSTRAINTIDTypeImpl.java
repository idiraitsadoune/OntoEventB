/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONSTRAINTORCONSTRAINTID Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONSTRAINTORCONSTRAINTIDTypeImpl#getConstraintDefinition <em>Constraint Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONSTRAINTORCONSTRAINTIDTypeImpl#getConstraintRef <em>Constraint Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONSTRAINTORCONSTRAINTIDTypeImpl extends MinimalEObjectImpl.Container implements CONSTRAINTORCONSTRAINTIDType {
	/**
	 * The cached value of the '{@link #getConstraintDefinition() <em>Constraint Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintDefinition()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTType constraintDefinition;

	/**
	 * The default value of the '{@link #getConstraintRef() <em>Constraint Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintRef() <em>Constraint Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintRef()
	 * @generated
	 * @ordered
	 */
	protected String constraintRef = CONSTRAINT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONSTRAINTORCONSTRAINTIDTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCONSTRAINTORCONSTRAINTIDType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTType getConstraintDefinition() {
		return constraintDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintDefinition(CONSTRAINTType newConstraintDefinition, NotificationChain msgs) {
		CONSTRAINTType oldConstraintDefinition = constraintDefinition;
		constraintDefinition = newConstraintDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION, oldConstraintDefinition, newConstraintDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintDefinition(CONSTRAINTType newConstraintDefinition) {
		if (newConstraintDefinition != constraintDefinition) {
			NotificationChain msgs = null;
			if (constraintDefinition != null)
				msgs = ((InternalEObject)constraintDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION, null, msgs);
			if (newConstraintDefinition != null)
				msgs = ((InternalEObject)newConstraintDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION, null, msgs);
			msgs = basicSetConstraintDefinition(newConstraintDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION, newConstraintDefinition, newConstraintDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintRef() {
		return constraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintRef(String newConstraintRef) {
		String oldConstraintRef = constraintRef;
		constraintRef = newConstraintRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_REF, oldConstraintRef, constraintRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION:
				return basicSetConstraintDefinition(null, msgs);
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
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION:
				return getConstraintDefinition();
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_REF:
				return getConstraintRef();
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
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION:
				setConstraintDefinition((CONSTRAINTType)newValue);
				return;
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_REF:
				setConstraintRef((String)newValue);
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
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION:
				setConstraintDefinition((CONSTRAINTType)null);
				return;
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_REF:
				setConstraintRef(CONSTRAINT_REF_EDEFAULT);
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
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_DEFINITION:
				return constraintDefinition != null;
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE__CONSTRAINT_REF:
				return CONSTRAINT_REF_EDEFAULT == null ? constraintRef != null : !CONSTRAINT_REF_EDEFAULT.equals(constraintRef);
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
		result.append(" (constraintRef: ");
		result.append(constraintRef);
		result.append(')');
		return result.toString();
	}

} //CONSTRAINTORCONSTRAINTIDTypeImpl
