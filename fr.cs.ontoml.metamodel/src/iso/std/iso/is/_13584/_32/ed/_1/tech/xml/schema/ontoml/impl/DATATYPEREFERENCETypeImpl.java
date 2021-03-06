/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DATATYPEREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPEREFERENCETypeImpl#getDatatypeRef <em>Datatype Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DATATYPEREFERENCETypeImpl extends MinimalEObjectImpl.Container implements DATATYPEREFERENCEType {
	/**
	 * The default value of the '{@link #getDatatypeRef() <em>Datatype Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatatypeRef() <em>Datatype Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeRef()
	 * @generated
	 * @ordered
	 */
	protected String datatypeRef = DATATYPE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DATATYPEREFERENCETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDATATYPEREFERENCEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatatypeRef() {
		return datatypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatypeRef(String newDatatypeRef) {
		String oldDatatypeRef = datatypeRef;
		datatypeRef = newDatatypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPEREFERENCE_TYPE__DATATYPE_REF, oldDatatypeRef, datatypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.DATATYPEREFERENCE_TYPE__DATATYPE_REF:
				return getDatatypeRef();
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
			case OntomlPackage.DATATYPEREFERENCE_TYPE__DATATYPE_REF:
				setDatatypeRef((String)newValue);
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
			case OntomlPackage.DATATYPEREFERENCE_TYPE__DATATYPE_REF:
				setDatatypeRef(DATATYPE_REF_EDEFAULT);
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
			case OntomlPackage.DATATYPEREFERENCE_TYPE__DATATYPE_REF:
				return DATATYPE_REF_EDEFAULT == null ? datatypeRef != null : !DATATYPE_REF_EDEFAULT.equals(datatypeRef);
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
		result.append(" (datatypeRef: ");
		result.append(datatypeRef);
		result.append(')');
		return result.toString();
	}

} //DATATYPEREFERENCETypeImpl
