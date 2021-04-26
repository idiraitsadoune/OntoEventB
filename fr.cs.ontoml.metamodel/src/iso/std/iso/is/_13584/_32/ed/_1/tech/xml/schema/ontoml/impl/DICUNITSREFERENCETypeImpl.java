/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITSREFERENCEType;
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
 * An implementation of the model object '<em><b>DICUNITSREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITSREFERENCETypeImpl#getDicUnit <em>Dic Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DICUNITSREFERENCETypeImpl extends MinimalEObjectImpl.Container implements DICUNITSREFERENCEType {
	/**
	 * The cached value of the '{@link #getDicUnit() <em>Dic Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDicUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<DICUNITREFERENCEType> dicUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICUNITSREFERENCETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDICUNITSREFERENCEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DICUNITREFERENCEType> getDicUnit() {
		if (dicUnit == null) {
			dicUnit = new EObjectContainmentEList<DICUNITREFERENCEType>(DICUNITREFERENCEType.class, this, OntomlPackage.DICUNITSREFERENCE_TYPE__DIC_UNIT);
		}
		return dicUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.DICUNITSREFERENCE_TYPE__DIC_UNIT:
				return ((InternalEList<?>)getDicUnit()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.DICUNITSREFERENCE_TYPE__DIC_UNIT:
				return getDicUnit();
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
			case OntomlPackage.DICUNITSREFERENCE_TYPE__DIC_UNIT:
				getDicUnit().clear();
				getDicUnit().addAll((Collection<? extends DICUNITREFERENCEType>)newValue);
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
			case OntomlPackage.DICUNITSREFERENCE_TYPE__DIC_UNIT:
				getDicUnit().clear();
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
			case OntomlPackage.DICUNITSREFERENCE_TYPE__DIC_UNIT:
				return dicUnit != null && !dicUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DICUNITSREFERENCETypeImpl
