/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.UNITType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROPERTYVALUERECOMMENDEDPRESENTATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl#getPropDef <em>Prop Def</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl#getRecommendedPresentationUnit <em>Recommended Presentation Unit</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl#getRecommendedPresentationFormat <em>Recommended Presentation Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl extends MinimalEObjectImpl.Container implements PROPERTYVALUERECOMMENDEDPRESENTATIONType {
	/**
	 * The cached value of the '{@link #getPropDef() <em>Prop Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropDef()
	 * @generated
	 * @ordered
	 */
	protected PROPERTYREFERENCEType propDef;

	/**
	 * The cached value of the '{@link #getRecommendedPresentationUnit() <em>Recommended Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPresentationUnit()
	 * @generated
	 * @ordered
	 */
	protected UNITType recommendedPresentationUnit;

	/**
	 * The default value of the '{@link #getRecommendedPresentationFormat() <em>Recommended Presentation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPresentationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommendedPresentationFormat() <em>Recommended Presentation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPresentationFormat()
	 * @generated
	 * @ordered
	 */
	protected String recommendedPresentationFormat = RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getPROPERTYVALUERECOMMENDEDPRESENTATIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCEType getPropDef() {
		return propDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropDef(PROPERTYREFERENCEType newPropDef, NotificationChain msgs) {
		PROPERTYREFERENCEType oldPropDef = propDef;
		propDef = newPropDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF, oldPropDef, newPropDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropDef(PROPERTYREFERENCEType newPropDef) {
		if (newPropDef != propDef) {
			NotificationChain msgs = null;
			if (propDef != null)
				msgs = ((InternalEObject)propDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF, null, msgs);
			if (newPropDef != null)
				msgs = ((InternalEObject)newPropDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF, null, msgs);
			msgs = basicSetPropDef(newPropDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF, newPropDef, newPropDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNITType getRecommendedPresentationUnit() {
		return recommendedPresentationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecommendedPresentationUnit(UNITType newRecommendedPresentationUnit, NotificationChain msgs) {
		UNITType oldRecommendedPresentationUnit = recommendedPresentationUnit;
		recommendedPresentationUnit = newRecommendedPresentationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT, oldRecommendedPresentationUnit, newRecommendedPresentationUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendedPresentationUnit(UNITType newRecommendedPresentationUnit) {
		if (newRecommendedPresentationUnit != recommendedPresentationUnit) {
			NotificationChain msgs = null;
			if (recommendedPresentationUnit != null)
				msgs = ((InternalEObject)recommendedPresentationUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT, null, msgs);
			if (newRecommendedPresentationUnit != null)
				msgs = ((InternalEObject)newRecommendedPresentationUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT, null, msgs);
			msgs = basicSetRecommendedPresentationUnit(newRecommendedPresentationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT, newRecommendedPresentationUnit, newRecommendedPresentationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecommendedPresentationFormat() {
		return recommendedPresentationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendedPresentationFormat(String newRecommendedPresentationFormat) {
		String oldRecommendedPresentationFormat = recommendedPresentationFormat;
		recommendedPresentationFormat = newRecommendedPresentationFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_FORMAT, oldRecommendedPresentationFormat, recommendedPresentationFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF:
				return basicSetPropDef(null, msgs);
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT:
				return basicSetRecommendedPresentationUnit(null, msgs);
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
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF:
				return getPropDef();
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT:
				return getRecommendedPresentationUnit();
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_FORMAT:
				return getRecommendedPresentationFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF:
				setPropDef((PROPERTYREFERENCEType)newValue);
				return;
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT:
				setRecommendedPresentationUnit((UNITType)newValue);
				return;
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_FORMAT:
				setRecommendedPresentationFormat((String)newValue);
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
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF:
				setPropDef((PROPERTYREFERENCEType)null);
				return;
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT:
				setRecommendedPresentationUnit((UNITType)null);
				return;
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_FORMAT:
				setRecommendedPresentationFormat(RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT);
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
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__PROP_DEF:
				return propDef != null;
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_UNIT:
				return recommendedPresentationUnit != null;
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE__RECOMMENDED_PRESENTATION_FORMAT:
				return RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT == null ? recommendedPresentationFormat != null : !RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT.equals(recommendedPresentationFormat);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (recommendedPresentationFormat: ");
		result.append(recommendedPresentationFormat);
		result.append(')');
		return result.toString();
	}

} //PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl
