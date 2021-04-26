/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VCVRANGEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType;

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
 * An implementation of the model object '<em><b>VCVRANGE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.VCVRANGETypeImpl#getViewControlVariableRange <em>View Control Variable Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VCVRANGETypeImpl extends MinimalEObjectImpl.Container implements VCVRANGEType {
	/**
	 * The cached value of the '{@link #getViewControlVariableRange() <em>View Control Variable Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewControlVariableRange()
	 * @generated
	 * @ordered
	 */
	protected EList<VIEWCONTROLVARIABLERANGEType> viewControlVariableRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCVRANGETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getVCVRANGEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VIEWCONTROLVARIABLERANGEType> getViewControlVariableRange() {
		if (viewControlVariableRange == null) {
			viewControlVariableRange = new EObjectContainmentEList<VIEWCONTROLVARIABLERANGEType>(VIEWCONTROLVARIABLERANGEType.class, this, OntomlPackage.VCVRANGE_TYPE__VIEW_CONTROL_VARIABLE_RANGE);
		}
		return viewControlVariableRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.VCVRANGE_TYPE__VIEW_CONTROL_VARIABLE_RANGE:
				return ((InternalEList<?>)getViewControlVariableRange()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.VCVRANGE_TYPE__VIEW_CONTROL_VARIABLE_RANGE:
				return getViewControlVariableRange();
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
			case OntomlPackage.VCVRANGE_TYPE__VIEW_CONTROL_VARIABLE_RANGE:
				getViewControlVariableRange().clear();
				getViewControlVariableRange().addAll((Collection<? extends VIEWCONTROLVARIABLERANGEType>)newValue);
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
			case OntomlPackage.VCVRANGE_TYPE__VIEW_CONTROL_VARIABLE_RANGE:
				getViewControlVariableRange().clear();
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
			case OntomlPackage.VCVRANGE_TYPE__VIEW_CONTROL_VARIABLE_RANGE:
				return viewControlVariableRange != null && !viewControlVariableRange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VCVRANGETypeImpl
