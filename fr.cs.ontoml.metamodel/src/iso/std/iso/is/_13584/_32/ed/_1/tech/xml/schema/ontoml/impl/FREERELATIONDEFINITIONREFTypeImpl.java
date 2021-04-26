/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONDEFINITIONREFType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FREERELATIONDEFINITIONREF Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FREERELATIONDEFINITIONREFTypeImpl#getDefintionRef <em>Defintion Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FREERELATIONDEFINITIONREFTypeImpl extends MinimalEObjectImpl.Container implements FREERELATIONDEFINITIONREFType {
	/**
	 * The default value of the '{@link #getDefintionRef() <em>Defintion Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefintionRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINTION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefintionRef() <em>Defintion Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefintionRef()
	 * @generated
	 * @ordered
	 */
	protected String defintionRef = DEFINTION_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FREERELATIONDEFINITIONREFTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getFREERELATIONDEFINITIONREFType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefintionRef() {
		return defintionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefintionRef(String newDefintionRef) {
		String oldDefintionRef = defintionRef;
		defintionRef = newDefintionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FREERELATIONDEFINITIONREF_TYPE__DEFINTION_REF, oldDefintionRef, defintionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.FREERELATIONDEFINITIONREF_TYPE__DEFINTION_REF:
				return getDefintionRef();
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
			case OntomlPackage.FREERELATIONDEFINITIONREF_TYPE__DEFINTION_REF:
				setDefintionRef((String)newValue);
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
			case OntomlPackage.FREERELATIONDEFINITIONREF_TYPE__DEFINTION_REF:
				setDefintionRef(DEFINTION_REF_EDEFAULT);
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
			case OntomlPackage.FREERELATIONDEFINITIONREF_TYPE__DEFINTION_REF:
				return DEFINTION_REF_EDEFAULT == null ? defintionRef != null : !DEFINTION_REF_EDEFAULT.equals(defintionRef);
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
		result.append(" (defintionRef: ");
		result.append(defintionRef);
		result.append(')');
		return result.toString();
	}

} //FREERELATIONDEFINITIONREFTypeImpl
