/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REMOTELOCATIONSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType;

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
 * An implementation of the model object '<em><b>REMOTELOCATIONS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REMOTELOCATIONSTypeImpl#getRemoteLocation <em>Remote Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REMOTELOCATIONSTypeImpl extends MinimalEObjectImpl.Container implements REMOTELOCATIONSType {
	/**
	 * The cached value of the '{@link #getRemoteLocation() <em>Remote Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteLocationType> remoteLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REMOTELOCATIONSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getREMOTELOCATIONSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoteLocationType> getRemoteLocation() {
		if (remoteLocation == null) {
			remoteLocation = new EObjectContainmentEList<RemoteLocationType>(RemoteLocationType.class, this, OntomlPackage.REMOTELOCATIONS_TYPE__REMOTE_LOCATION);
		}
		return remoteLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.REMOTELOCATIONS_TYPE__REMOTE_LOCATION:
				return ((InternalEList<?>)getRemoteLocation()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.REMOTELOCATIONS_TYPE__REMOTE_LOCATION:
				return getRemoteLocation();
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
			case OntomlPackage.REMOTELOCATIONS_TYPE__REMOTE_LOCATION:
				getRemoteLocation().clear();
				getRemoteLocation().addAll((Collection<? extends RemoteLocationType>)newValue);
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
			case OntomlPackage.REMOTELOCATIONS_TYPE__REMOTE_LOCATION:
				getRemoteLocation().clear();
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
			case OntomlPackage.REMOTELOCATIONS_TYPE__REMOTE_LOCATION:
				return remoteLocation != null && !remoteLocation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //REMOTELOCATIONSTypeImpl
