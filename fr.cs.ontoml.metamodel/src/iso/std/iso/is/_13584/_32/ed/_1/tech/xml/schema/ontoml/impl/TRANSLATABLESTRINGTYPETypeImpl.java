/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATABLESTRINGTYPEType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRANSLATABLESTRINGTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATABLESTRINGTYPETypeImpl#getValueFormat <em>Value Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TRANSLATABLESTRINGTYPETypeImpl extends ANYTYPETypeImpl implements TRANSLATABLESTRINGTYPEType {
	/**
	 * The default value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected String valueFormat = VALUE_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRANSLATABLESTRINGTYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getTRANSLATABLESTRINGTYPEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueFormat(String newValueFormat) {
		String oldValueFormat = valueFormat;
		valueFormat = newValueFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.TRANSLATABLESTRINGTYPE_TYPE__VALUE_FORMAT, oldValueFormat, valueFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.TRANSLATABLESTRINGTYPE_TYPE__VALUE_FORMAT:
				return getValueFormat();
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
			case OntomlPackage.TRANSLATABLESTRINGTYPE_TYPE__VALUE_FORMAT:
				setValueFormat((String)newValue);
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
			case OntomlPackage.TRANSLATABLESTRINGTYPE_TYPE__VALUE_FORMAT:
				setValueFormat(VALUE_FORMAT_EDEFAULT);
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
			case OntomlPackage.TRANSLATABLESTRINGTYPE_TYPE__VALUE_FORMAT:
				return VALUE_FORMAT_EDEFAULT == null ? valueFormat != null : !VALUE_FORMAT_EDEFAULT.equals(valueFormat);
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
		result.append(" (valueFormat: ");
		result.append(valueFormat);
		result.append(')');
		return result.toString();
	}

} //TRANSLATABLESTRINGTYPETypeImpl
