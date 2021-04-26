/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMETERCONSTRAINTSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONTEXTPARAMETERCONSTRAINTS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTPARAMETERCONSTRAINTSTypeImpl#getIntegrityConstraint <em>Integrity Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTEXTPARAMETERCONSTRAINTSTypeImpl extends MinimalEObjectImpl.Container implements CONTEXTPARAMETERCONSTRAINTSType {
	/**
	 * The cached value of the '{@link #getIntegrityConstraint() <em>Integrity Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<INTEGRITYCONSTRAINTType> integrityConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTEXTPARAMETERCONSTRAINTSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCONTEXTPARAMETERCONSTRAINTSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<INTEGRITYCONSTRAINTType> getIntegrityConstraint() {
		if (integrityConstraint == null) {
			integrityConstraint = new EObjectContainmentEList<INTEGRITYCONSTRAINTType>(INTEGRITYCONSTRAINTType.class, this, OntomlPackage.CONTEXTPARAMETERCONSTRAINTS_TYPE__INTEGRITY_CONSTRAINT);
		}
		return integrityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CONTEXTPARAMETERCONSTRAINTS_TYPE__INTEGRITY_CONSTRAINT:
				return ((InternalEList<?>)getIntegrityConstraint()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.CONTEXTPARAMETERCONSTRAINTS_TYPE__INTEGRITY_CONSTRAINT:
				return getIntegrityConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntomlPackage.CONTEXTPARAMETERCONSTRAINTS_TYPE__INTEGRITY_CONSTRAINT:
				getIntegrityConstraint().clear();
				getIntegrityConstraint().addAll((Collection<? extends INTEGRITYCONSTRAINTType>)newValue);
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
			case OntomlPackage.CONTEXTPARAMETERCONSTRAINTS_TYPE__INTEGRITY_CONSTRAINT:
				getIntegrityConstraint().clear();
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
			case OntomlPackage.CONTEXTPARAMETERCONSTRAINTS_TYPE__INTEGRITY_CONSTRAINT:
				return integrityConstraint != null && !integrityConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CONTEXTPARAMETERCONSTRAINTSTypeImpl
