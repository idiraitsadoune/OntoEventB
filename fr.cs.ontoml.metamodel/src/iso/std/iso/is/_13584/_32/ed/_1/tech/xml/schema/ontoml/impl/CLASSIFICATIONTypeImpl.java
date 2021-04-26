/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSIFICATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType;

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
 * An implementation of the model object '<em><b>CLASSIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSIFICATIONTypeImpl#getPropertyClassification <em>Property Classification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASSIFICATIONTypeImpl extends MinimalEObjectImpl.Container implements CLASSIFICATIONType {
	/**
	 * The cached value of the '{@link #getPropertyClassification() <em>Property Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<PROPERTYCLASSIFICATIONType> propertyClassification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSIFICATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCLASSIFICATIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PROPERTYCLASSIFICATIONType> getPropertyClassification() {
		if (propertyClassification == null) {
			propertyClassification = new EObjectContainmentEList<PROPERTYCLASSIFICATIONType>(PROPERTYCLASSIFICATIONType.class, this, OntomlPackage.CLASSIFICATION_TYPE__PROPERTY_CLASSIFICATION);
		}
		return propertyClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CLASSIFICATION_TYPE__PROPERTY_CLASSIFICATION:
				return ((InternalEList<?>)getPropertyClassification()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.CLASSIFICATION_TYPE__PROPERTY_CLASSIFICATION:
				return getPropertyClassification();
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
			case OntomlPackage.CLASSIFICATION_TYPE__PROPERTY_CLASSIFICATION:
				getPropertyClassification().clear();
				getPropertyClassification().addAll((Collection<? extends PROPERTYCLASSIFICATIONType>)newValue);
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
			case OntomlPackage.CLASSIFICATION_TYPE__PROPERTY_CLASSIFICATION:
				getPropertyClassification().clear();
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
			case OntomlPackage.CLASSIFICATION_TYPE__PROPERTY_CLASSIFICATION:
				return propertyClassification != null && !propertyClassification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CLASSIFICATIONTypeImpl
