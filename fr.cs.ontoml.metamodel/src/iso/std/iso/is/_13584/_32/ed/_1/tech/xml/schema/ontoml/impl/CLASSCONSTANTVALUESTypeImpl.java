/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTANTVALUESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType;
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
 * An implementation of the model object '<em><b>CLASSCONSTANTVALUES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSCONSTANTVALUESTypeImpl#getClassValueAssignment <em>Class Value Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASSCONSTANTVALUESTypeImpl extends MinimalEObjectImpl.Container implements CLASSCONSTANTVALUESType {
	/**
	 * The cached value of the '{@link #getClassValueAssignment() <em>Class Value Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassValueAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<CLASSVALUEASSIGNMENTType> classValueAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSCONSTANTVALUESTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCLASSCONSTANTVALUESType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CLASSVALUEASSIGNMENTType> getClassValueAssignment() {
		if (classValueAssignment == null) {
			classValueAssignment = new EObjectContainmentEList<CLASSVALUEASSIGNMENTType>(CLASSVALUEASSIGNMENTType.class, this, OntomlPackage.CLASSCONSTANTVALUES_TYPE__CLASS_VALUE_ASSIGNMENT);
		}
		return classValueAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CLASSCONSTANTVALUES_TYPE__CLASS_VALUE_ASSIGNMENT:
				return ((InternalEList<?>)getClassValueAssignment()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.CLASSCONSTANTVALUES_TYPE__CLASS_VALUE_ASSIGNMENT:
				return getClassValueAssignment();
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
			case OntomlPackage.CLASSCONSTANTVALUES_TYPE__CLASS_VALUE_ASSIGNMENT:
				getClassValueAssignment().clear();
				getClassValueAssignment().addAll((Collection<? extends CLASSVALUEASSIGNMENTType>)newValue);
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
			case OntomlPackage.CLASSCONSTANTVALUES_TYPE__CLASS_VALUE_ASSIGNMENT:
				getClassValueAssignment().clear();
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
			case OntomlPackage.CLASSCONSTANTVALUES_TYPE__CLASS_VALUE_ASSIGNMENT:
				return classValueAssignment != null && !classValueAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CLASSCONSTANTVALUESTypeImpl
