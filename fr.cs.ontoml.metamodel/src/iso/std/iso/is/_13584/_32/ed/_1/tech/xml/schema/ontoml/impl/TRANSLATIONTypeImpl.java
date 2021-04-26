/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType;

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
 * An implementation of the model object '<em><b>TRANSLATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATIONTypeImpl#getTranslationData <em>Translation Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TRANSLATIONTypeImpl extends MinimalEObjectImpl.Container implements TRANSLATIONType {
	/**
	 * The cached value of the '{@link #getTranslationData() <em>Translation Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationData()
	 * @generated
	 * @ordered
	 */
	protected EList<TRANSLATIONDATAType> translationData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRANSLATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getTRANSLATIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRANSLATIONDATAType> getTranslationData() {
		if (translationData == null) {
			translationData = new EObjectContainmentEList<TRANSLATIONDATAType>(TRANSLATIONDATAType.class, this, OntomlPackage.TRANSLATION_TYPE__TRANSLATION_DATA);
		}
		return translationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.TRANSLATION_TYPE__TRANSLATION_DATA:
				return ((InternalEList<?>)getTranslationData()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.TRANSLATION_TYPE__TRANSLATION_DATA:
				return getTranslationData();
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
			case OntomlPackage.TRANSLATION_TYPE__TRANSLATION_DATA:
				getTranslationData().clear();
				getTranslationData().addAll((Collection<? extends TRANSLATIONDATAType>)newValue);
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
			case OntomlPackage.TRANSLATION_TYPE__TRANSLATION_DATA:
				getTranslationData().clear();
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
			case OntomlPackage.TRANSLATION_TYPE__TRANSLATION_DATA:
				return translationData != null && !translationData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TRANSLATIONTypeImpl
