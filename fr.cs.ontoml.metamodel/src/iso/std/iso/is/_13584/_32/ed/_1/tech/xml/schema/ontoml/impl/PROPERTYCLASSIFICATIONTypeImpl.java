/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROPERTYCLASSIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYCLASSIFICATIONTypeImpl#getItsValue <em>Its Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYCLASSIFICATIONTypeImpl#getPropDef <em>Prop Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROPERTYCLASSIFICATIONTypeImpl extends MinimalEObjectImpl.Container implements PROPERTYCLASSIFICATIONType {
	/**
	 * The default value of the '{@link #getItsValue() <em>Its Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ITS_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItsValue() <em>Its Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger itsValue = ITS_VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROPERTYCLASSIFICATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getPROPERTYCLASSIFICATIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getItsValue() {
		return itsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsValue(BigInteger newItsValue) {
		BigInteger oldItsValue = itsValue;
		itsValue = newItsValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYCLASSIFICATION_TYPE__ITS_VALUE, oldItsValue, itsValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYCLASSIFICATION_TYPE__PROP_DEF, oldPropDef, newPropDef);
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
				msgs = ((InternalEObject)propDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTYCLASSIFICATION_TYPE__PROP_DEF, null, msgs);
			if (newPropDef != null)
				msgs = ((InternalEObject)newPropDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTYCLASSIFICATION_TYPE__PROP_DEF, null, msgs);
			msgs = basicSetPropDef(newPropDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTYCLASSIFICATION_TYPE__PROP_DEF, newPropDef, newPropDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE__PROP_DEF:
				return basicSetPropDef(null, msgs);
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
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE__ITS_VALUE:
				return getItsValue();
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE__PROP_DEF:
				return getPropDef();
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
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE__ITS_VALUE:
				setItsValue((BigInteger)newValue);
				return;
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE__PROP_DEF:
				setPropDef((PROPERTYREFERENCEType)newValue);
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
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE__ITS_VALUE:
				setItsValue(ITS_VALUE_EDEFAULT);
				return;
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE__PROP_DEF:
				setPropDef((PROPERTYREFERENCEType)null);
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
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE__ITS_VALUE:
				return ITS_VALUE_EDEFAULT == null ? itsValue != null : !ITS_VALUE_EDEFAULT.equals(itsValue);
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE__PROP_DEF:
				return propDef != null;
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
		result.append(" (itsValue: ");
		result.append(itsValue);
		result.append(')');
		return result.toString();
	}

} //PROPERTYCLASSIFICATIONTypeImpl
