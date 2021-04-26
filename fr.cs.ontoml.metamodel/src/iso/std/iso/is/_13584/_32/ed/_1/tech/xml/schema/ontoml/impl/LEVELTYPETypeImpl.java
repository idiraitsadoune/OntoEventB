/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEVELTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTYPETypeImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTYPETypeImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEVELTYPETypeImpl extends ANYTYPETypeImpl implements LEVELTYPEType {
	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected LEVELType levels;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected ANYTYPEType valueType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEVELTYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getLEVELTYPEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEVELType getLevels() {
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevels(LEVELType newLevels, NotificationChain msgs) {
		LEVELType oldLevels = levels;
		levels = newLevels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVELTYPE_TYPE__LEVELS, oldLevels, newLevels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevels(LEVELType newLevels) {
		if (newLevels != levels) {
			NotificationChain msgs = null;
			if (levels != null)
				msgs = ((InternalEObject)levels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVELTYPE_TYPE__LEVELS, null, msgs);
			if (newLevels != null)
				msgs = ((InternalEObject)newLevels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVELTYPE_TYPE__LEVELS, null, msgs);
			msgs = basicSetLevels(newLevels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVELTYPE_TYPE__LEVELS, newLevels, newLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANYTYPEType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueType(ANYTYPEType newValueType, NotificationChain msgs) {
		ANYTYPEType oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVELTYPE_TYPE__VALUE_TYPE, oldValueType, newValueType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ANYTYPEType newValueType) {
		if (newValueType != valueType) {
			NotificationChain msgs = null;
			if (valueType != null)
				msgs = ((InternalEObject)valueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVELTYPE_TYPE__VALUE_TYPE, null, msgs);
			if (newValueType != null)
				msgs = ((InternalEObject)newValueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVELTYPE_TYPE__VALUE_TYPE, null, msgs);
			msgs = basicSetValueType(newValueType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVELTYPE_TYPE__VALUE_TYPE, newValueType, newValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.LEVELTYPE_TYPE__LEVELS:
				return basicSetLevels(null, msgs);
			case OntomlPackage.LEVELTYPE_TYPE__VALUE_TYPE:
				return basicSetValueType(null, msgs);
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
			case OntomlPackage.LEVELTYPE_TYPE__LEVELS:
				return getLevels();
			case OntomlPackage.LEVELTYPE_TYPE__VALUE_TYPE:
				return getValueType();
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
			case OntomlPackage.LEVELTYPE_TYPE__LEVELS:
				setLevels((LEVELType)newValue);
				return;
			case OntomlPackage.LEVELTYPE_TYPE__VALUE_TYPE:
				setValueType((ANYTYPEType)newValue);
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
			case OntomlPackage.LEVELTYPE_TYPE__LEVELS:
				setLevels((LEVELType)null);
				return;
			case OntomlPackage.LEVELTYPE_TYPE__VALUE_TYPE:
				setValueType((ANYTYPEType)null);
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
			case OntomlPackage.LEVELTYPE_TYPE__LEVELS:
				return levels != null;
			case OntomlPackage.LEVELTYPE_TYPE__VALUE_TYPE:
				return valueType != null;
		}
		return super.eIsSet(featureID);
	}

} //LEVELTYPETypeImpl
