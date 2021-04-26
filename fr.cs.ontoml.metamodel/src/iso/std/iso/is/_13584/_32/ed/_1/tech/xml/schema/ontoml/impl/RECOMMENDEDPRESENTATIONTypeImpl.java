/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RECOMMENDEDPRESENTATIONType;

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
 * An implementation of the model object '<em><b>RECOMMENDEDPRESENTATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.RECOMMENDEDPRESENTATIONTypeImpl#getPropertyValueRecommendedPresentation <em>Property Value Recommended Presentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RECOMMENDEDPRESENTATIONTypeImpl extends MinimalEObjectImpl.Container implements RECOMMENDEDPRESENTATIONType {
	/**
	 * The cached value of the '{@link #getPropertyValueRecommendedPresentation() <em>Property Value Recommended Presentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValueRecommendedPresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<PROPERTYVALUERECOMMENDEDPRESENTATIONType> propertyValueRecommendedPresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RECOMMENDEDPRESENTATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getRECOMMENDEDPRESENTATIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PROPERTYVALUERECOMMENDEDPRESENTATIONType> getPropertyValueRecommendedPresentation() {
		if (propertyValueRecommendedPresentation == null) {
			propertyValueRecommendedPresentation = new EObjectContainmentEList<PROPERTYVALUERECOMMENDEDPRESENTATIONType>(PROPERTYVALUERECOMMENDEDPRESENTATIONType.class, this, OntomlPackage.RECOMMENDEDPRESENTATION_TYPE__PROPERTY_VALUE_RECOMMENDED_PRESENTATION);
		}
		return propertyValueRecommendedPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.RECOMMENDEDPRESENTATION_TYPE__PROPERTY_VALUE_RECOMMENDED_PRESENTATION:
				return ((InternalEList<?>)getPropertyValueRecommendedPresentation()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.RECOMMENDEDPRESENTATION_TYPE__PROPERTY_VALUE_RECOMMENDED_PRESENTATION:
				return getPropertyValueRecommendedPresentation();
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
			case OntomlPackage.RECOMMENDEDPRESENTATION_TYPE__PROPERTY_VALUE_RECOMMENDED_PRESENTATION:
				getPropertyValueRecommendedPresentation().clear();
				getPropertyValueRecommendedPresentation().addAll((Collection<? extends PROPERTYVALUERECOMMENDEDPRESENTATIONType>)newValue);
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
			case OntomlPackage.RECOMMENDEDPRESENTATION_TYPE__PROPERTY_VALUE_RECOMMENDED_PRESENTATION:
				getPropertyValueRecommendedPresentation().clear();
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
			case OntomlPackage.RECOMMENDEDPRESENTATION_TYPE__PROPERTY_VALUE_RECOMMENDED_PRESENTATION:
				return propertyValueRecommendedPresentation != null && !propertyValueRecommendedPresentation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RECOMMENDEDPRESENTATIONTypeImpl
