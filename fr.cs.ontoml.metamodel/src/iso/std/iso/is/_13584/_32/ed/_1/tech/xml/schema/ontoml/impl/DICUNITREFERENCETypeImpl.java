/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DICUNITREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITREFERENCETypeImpl#getDicUnitRef <em>Dic Unit Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DICUNITREFERENCETypeImpl extends MinimalEObjectImpl.Container implements DICUNITREFERENCEType {
	/**
	 * The default value of the '{@link #getDicUnitRef() <em>Dic Unit Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDicUnitRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DIC_UNIT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDicUnitRef() <em>Dic Unit Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDicUnitRef()
	 * @generated
	 * @ordered
	 */
	protected String dicUnitRef = DIC_UNIT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICUNITREFERENCETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDICUNITREFERENCEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDicUnitRef() {
		return dicUnitRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDicUnitRef(String newDicUnitRef) {
		String oldDicUnitRef = dicUnitRef;
		dicUnitRef = newDicUnitRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICUNITREFERENCE_TYPE__DIC_UNIT_REF, oldDicUnitRef, dicUnitRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.DICUNITREFERENCE_TYPE__DIC_UNIT_REF:
				return getDicUnitRef();
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
			case OntomlPackage.DICUNITREFERENCE_TYPE__DIC_UNIT_REF:
				setDicUnitRef((String)newValue);
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
			case OntomlPackage.DICUNITREFERENCE_TYPE__DIC_UNIT_REF:
				setDicUnitRef(DIC_UNIT_REF_EDEFAULT);
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
			case OntomlPackage.DICUNITREFERENCE_TYPE__DIC_UNIT_REF:
				return DIC_UNIT_REF_EDEFAULT == null ? dicUnitRef != null : !DIC_UNIT_REF_EDEFAULT.equals(dicUnitRef);
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
		result.append(" (dicUnitRef: ");
		result.append(dicUnitRef);
		result.append(')');
		return result.toString();
	}

} //DICUNITREFERENCETypeImpl
