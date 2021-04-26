/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Reference Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ItemReferenceValueTypeImpl#getItemLocalRef <em>Item Local Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemReferenceValueTypeImpl extends MinimalEObjectImpl.Container implements ItemReferenceValueType {
	/**
	 * The default value of the '{@link #getItemLocalRef() <em>Item Local Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemLocalRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_LOCAL_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemLocalRef() <em>Item Local Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemLocalRef()
	 * @generated
	 * @ordered
	 */
	protected String itemLocalRef = ITEM_LOCAL_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemReferenceValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.ITEM_REFERENCE_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemLocalRef() {
		return itemLocalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemLocalRef(String newItemLocalRef) {
		String oldItemLocalRef = itemLocalRef;
		itemLocalRef = newItemLocalRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.ITEM_REFERENCE_VALUE_TYPE__ITEM_LOCAL_REF, oldItemLocalRef, itemLocalRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValuePackage.ITEM_REFERENCE_VALUE_TYPE__ITEM_LOCAL_REF:
				return getItemLocalRef();
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
			case ValuePackage.ITEM_REFERENCE_VALUE_TYPE__ITEM_LOCAL_REF:
				setItemLocalRef((String)newValue);
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
			case ValuePackage.ITEM_REFERENCE_VALUE_TYPE__ITEM_LOCAL_REF:
				setItemLocalRef(ITEM_LOCAL_REF_EDEFAULT);
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
			case ValuePackage.ITEM_REFERENCE_VALUE_TYPE__ITEM_LOCAL_REF:
				return ITEM_LOCAL_REF_EDEFAULT == null ? itemLocalRef != null : !ITEM_LOCAL_REF_EDEFAULT.equals(itemLocalRef);
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
		result.append(" (itemLocalRef: ");
		result.append(itemLocalRef);
		result.append(')');
		return result.toString();
	}

} //ItemReferenceValueTypeImpl
