/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENUMERATIONCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ENUMERATIONCONSTRAINTTypeImpl#getSubset <em>Subset</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ENUMERATIONCONSTRAINTTypeImpl#getValueMeaning <em>Value Meaning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENUMERATIONCONSTRAINTTypeImpl extends DOMAINCONSTRAINTTypeImpl implements ENUMERATIONCONSTRAINTType {
	/**
	 * The cached value of the '{@link #getSubset() <em>Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubset()
	 * @generated
	 * @ordered
	 */
	protected SUBSETType subset;

	/**
	 * The cached value of the '{@link #getValueMeaning() <em>Value Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMeaning()
	 * @generated
	 * @ordered
	 */
	protected NONQUANTITATIVEINTTYPEType valueMeaning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENUMERATIONCONSTRAINTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getENUMERATIONCONSTRAINTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUBSETType getSubset() {
		return subset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubset(SUBSETType newSubset, NotificationChain msgs) {
		SUBSETType oldSubset = subset;
		subset = newSubset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__SUBSET, oldSubset, newSubset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubset(SUBSETType newSubset) {
		if (newSubset != subset) {
			NotificationChain msgs = null;
			if (subset != null)
				msgs = ((InternalEObject)subset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__SUBSET, null, msgs);
			if (newSubset != null)
				msgs = ((InternalEObject)newSubset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__SUBSET, null, msgs);
			msgs = basicSetSubset(newSubset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__SUBSET, newSubset, newSubset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONQUANTITATIVEINTTYPEType getValueMeaning() {
		return valueMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMeaning(NONQUANTITATIVEINTTYPEType newValueMeaning, NotificationChain msgs) {
		NONQUANTITATIVEINTTYPEType oldValueMeaning = valueMeaning;
		valueMeaning = newValueMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING, oldValueMeaning, newValueMeaning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMeaning(NONQUANTITATIVEINTTYPEType newValueMeaning) {
		if (newValueMeaning != valueMeaning) {
			NotificationChain msgs = null;
			if (valueMeaning != null)
				msgs = ((InternalEObject)valueMeaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING, null, msgs);
			if (newValueMeaning != null)
				msgs = ((InternalEObject)newValueMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING, null, msgs);
			msgs = basicSetValueMeaning(newValueMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING, newValueMeaning, newValueMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__SUBSET:
				return basicSetSubset(null, msgs);
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING:
				return basicSetValueMeaning(null, msgs);
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
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__SUBSET:
				return getSubset();
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING:
				return getValueMeaning();
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
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__SUBSET:
				setSubset((SUBSETType)newValue);
				return;
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING:
				setValueMeaning((NONQUANTITATIVEINTTYPEType)newValue);
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
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__SUBSET:
				setSubset((SUBSETType)null);
				return;
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING:
				setValueMeaning((NONQUANTITATIVEINTTYPEType)null);
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
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__SUBSET:
				return subset != null;
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE__VALUE_MEANING:
				return valueMeaning != null;
		}
		return super.eIsSet(featureID);
	}

} //ENUMERATIONCONSTRAINTTypeImpl
