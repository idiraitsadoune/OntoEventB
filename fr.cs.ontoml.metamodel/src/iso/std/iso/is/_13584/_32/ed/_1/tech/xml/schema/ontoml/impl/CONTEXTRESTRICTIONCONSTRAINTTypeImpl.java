/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMETERCONSTRAINTSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTRESTRICTIONCONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONTEXTRESTRICTIONCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTRESTRICTIONCONSTRAINTTypeImpl#getContextParameterConstraints <em>Context Parameter Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTEXTRESTRICTIONCONSTRAINTTypeImpl extends PROPERTYCONSTRAINTTypeImpl implements CONTEXTRESTRICTIONCONSTRAINTType {
	/**
	 * The cached value of the '{@link #getContextParameterConstraints() <em>Context Parameter Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParameterConstraints()
	 * @generated
	 * @ordered
	 */
	protected CONTEXTPARAMETERCONSTRAINTSType contextParameterConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTEXTRESTRICTIONCONSTRAINTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCONTEXTRESTRICTIONCONSTRAINTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTPARAMETERCONSTRAINTSType getContextParameterConstraints() {
		return contextParameterConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextParameterConstraints(CONTEXTPARAMETERCONSTRAINTSType newContextParameterConstraints, NotificationChain msgs) {
		CONTEXTPARAMETERCONSTRAINTSType oldContextParameterConstraints = contextParameterConstraints;
		contextParameterConstraints = newContextParameterConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS, oldContextParameterConstraints, newContextParameterConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextParameterConstraints(CONTEXTPARAMETERCONSTRAINTSType newContextParameterConstraints) {
		if (newContextParameterConstraints != contextParameterConstraints) {
			NotificationChain msgs = null;
			if (contextParameterConstraints != null)
				msgs = ((InternalEObject)contextParameterConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS, null, msgs);
			if (newContextParameterConstraints != null)
				msgs = ((InternalEObject)newContextParameterConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS, null, msgs);
			msgs = basicSetContextParameterConstraints(newContextParameterConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS, newContextParameterConstraints, newContextParameterConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS:
				return basicSetContextParameterConstraints(null, msgs);
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
			case OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS:
				return getContextParameterConstraints();
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
			case OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS:
				setContextParameterConstraints((CONTEXTPARAMETERCONSTRAINTSType)newValue);
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
			case OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS:
				setContextParameterConstraints((CONTEXTPARAMETERCONSTRAINTSType)null);
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
			case OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE__CONTEXT_PARAMETER_CONSTRAINTS:
				return contextParameterConstraints != null;
		}
		return super.eIsSet(featureID);
	}

} //CONTEXTRESTRICTIONCONSTRAINTTypeImpl
