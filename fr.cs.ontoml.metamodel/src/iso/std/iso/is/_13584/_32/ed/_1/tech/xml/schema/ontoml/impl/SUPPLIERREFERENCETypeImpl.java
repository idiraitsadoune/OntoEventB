/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SUPPLIERREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERREFERENCETypeImpl#getSupplierRef <em>Supplier Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SUPPLIERREFERENCETypeImpl extends MinimalEObjectImpl.Container implements SUPPLIERREFERENCEType {
	/**
	 * The default value of the '{@link #getSupplierRef() <em>Supplier Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierRef() <em>Supplier Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierRef()
	 * @generated
	 * @ordered
	 */
	protected String supplierRef = SUPPLIER_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUPPLIERREFERENCETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getSUPPLIERREFERENCEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplierRef() {
		return supplierRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierRef(String newSupplierRef) {
		String oldSupplierRef = supplierRef;
		supplierRef = newSupplierRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIERREFERENCE_TYPE__SUPPLIER_REF, oldSupplierRef, supplierRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.SUPPLIERREFERENCE_TYPE__SUPPLIER_REF:
				return getSupplierRef();
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
			case OntomlPackage.SUPPLIERREFERENCE_TYPE__SUPPLIER_REF:
				setSupplierRef((String)newValue);
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
			case OntomlPackage.SUPPLIERREFERENCE_TYPE__SUPPLIER_REF:
				setSupplierRef(SUPPLIER_REF_EDEFAULT);
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
			case OntomlPackage.SUPPLIERREFERENCE_TYPE__SUPPLIER_REF:
				return SUPPLIER_REF_EDEFAULT == null ? supplierRef != null : !SUPPLIER_REF_EDEFAULT.equals(supplierRef);
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
		result.append(" (supplierRef: ");
		result.append(supplierRef);
		result.append(')');
		return result.toString();
	}

} //SUPPLIERREFERENCETypeImpl
