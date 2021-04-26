/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS1PLACEMENTTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AXIS1PLACEMENTTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.AXIS1PLACEMENTTYPETypeImpl#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AXIS1PLACEMENTTYPETypeImpl extends ANYTYPETypeImpl implements AXIS1PLACEMENTTYPEType {
	/**
	 * The default value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected String classRef = CLASS_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AXIS1PLACEMENTTYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getAXIS1PLACEMENTTYPEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassRef() {
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassRef(String newClassRef) {
		String oldClassRef = classRef;
		classRef = newClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.AXIS1PLACEMENTTYPE_TYPE__CLASS_REF, oldClassRef, classRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.AXIS1PLACEMENTTYPE_TYPE__CLASS_REF:
				return getClassRef();
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
			case OntomlPackage.AXIS1PLACEMENTTYPE_TYPE__CLASS_REF:
				setClassRef((String)newValue);
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
			case OntomlPackage.AXIS1PLACEMENTTYPE_TYPE__CLASS_REF:
				setClassRef(CLASS_REF_EDEFAULT);
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
			case OntomlPackage.AXIS1PLACEMENTTYPE_TYPE__CLASS_REF:
				return CLASS_REF_EDEFAULT == null ? classRef != null : !CLASS_REF_EDEFAULT.equals(classRef);
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
		result.append(" (classRef: ");
		result.append(classRef);
		result.append(')');
		return result.toString();
	}

} //AXIS1PLACEMENTTYPETypeImpl
