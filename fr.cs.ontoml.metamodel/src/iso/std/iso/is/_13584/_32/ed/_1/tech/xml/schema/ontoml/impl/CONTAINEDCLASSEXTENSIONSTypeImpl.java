/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType;
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
 * An implementation of the model object '<em><b>CONTAINEDCLASSEXTENSIONS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDCLASSEXTENSIONSTypeImpl#getClassExtension <em>Class Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTAINEDCLASSEXTENSIONSTypeImpl extends MinimalEObjectImpl.Container implements CONTAINEDCLASSEXTENSIONSType {
	/**
	 * The cached value of the '{@link #getClassExtension() <em>Class Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<CLASSEXTENSIONType> classExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTAINEDCLASSEXTENSIONSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCONTAINEDCLASSEXTENSIONSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CLASSEXTENSIONType> getClassExtension() {
		if (classExtension == null) {
			classExtension = new EObjectContainmentEList<CLASSEXTENSIONType>(CLASSEXTENSIONType.class, this, OntomlPackage.CONTAINEDCLASSEXTENSIONS_TYPE__CLASS_EXTENSION);
		}
		return classExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CONTAINEDCLASSEXTENSIONS_TYPE__CLASS_EXTENSION:
				return ((InternalEList<?>)getClassExtension()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.CONTAINEDCLASSEXTENSIONS_TYPE__CLASS_EXTENSION:
				return getClassExtension();
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
			case OntomlPackage.CONTAINEDCLASSEXTENSIONS_TYPE__CLASS_EXTENSION:
				getClassExtension().clear();
				getClassExtension().addAll((Collection<? extends CLASSEXTENSIONType>)newValue);
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
			case OntomlPackage.CONTAINEDCLASSEXTENSIONS_TYPE__CLASS_EXTENSION:
				getClassExtension().clear();
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
			case OntomlPackage.CONTAINEDCLASSEXTENSIONS_TYPE__CLASS_EXTENSION:
				return classExtension != null && !classExtension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CONTAINEDCLASSEXTENSIONSTypeImpl
