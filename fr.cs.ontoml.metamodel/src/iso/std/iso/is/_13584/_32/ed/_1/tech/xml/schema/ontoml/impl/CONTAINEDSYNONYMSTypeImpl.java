/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSYNONYMSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLESYNONYMType;

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
 * An implementation of the model object '<em><b>CONTAINEDSYNONYMS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTAINEDSYNONYMSTypeImpl#getSynonym <em>Synonym</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTAINEDSYNONYMSTypeImpl extends MinimalEObjectImpl.Container implements CONTAINEDSYNONYMSType {
	/**
	 * The cached value of the '{@link #getSynonym() <em>Synonym</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonym()
	 * @generated
	 * @ordered
	 */
	protected EList<REUSABLESYNONYMType> synonym;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTAINEDSYNONYMSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCONTAINEDSYNONYMSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<REUSABLESYNONYMType> getSynonym() {
		if (synonym == null) {
			synonym = new EObjectContainmentEList<REUSABLESYNONYMType>(REUSABLESYNONYMType.class, this, OntomlPackage.CONTAINEDSYNONYMS_TYPE__SYNONYM);
		}
		return synonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CONTAINEDSYNONYMS_TYPE__SYNONYM:
				return ((InternalEList<?>)getSynonym()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.CONTAINEDSYNONYMS_TYPE__SYNONYM:
				return getSynonym();
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
			case OntomlPackage.CONTAINEDSYNONYMS_TYPE__SYNONYM:
				getSynonym().clear();
				getSynonym().addAll((Collection<? extends REUSABLESYNONYMType>)newValue);
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
			case OntomlPackage.CONTAINEDSYNONYMS_TYPE__SYNONYM:
				getSynonym().clear();
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
			case OntomlPackage.CONTAINEDSYNONYMS_TYPE__SYNONYM:
				return synonym != null && !synonym.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CONTAINEDSYNONYMSTypeImpl
