/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureValueTypeImpl#getPresentationUOMCode <em>Presentation UOM Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureValueTypeImpl#getPresentationUOMRef <em>Presentation UOM Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureValueTypeImpl#getUOMCode <em>UOM Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureValueTypeImpl#getUOMRef <em>UOM Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MeasureValueTypeImpl extends MinimalEObjectImpl.Container implements MeasureValueType {
	/**
	 * The default value of the '{@link #getPresentationUOMCode() <em>Presentation UOM Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationUOMCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_UOM_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentationUOMCode() <em>Presentation UOM Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationUOMCode()
	 * @generated
	 * @ordered
	 */
	protected String presentationUOMCode = PRESENTATION_UOM_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentationUOMRef() <em>Presentation UOM Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationUOMRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_UOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentationUOMRef() <em>Presentation UOM Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationUOMRef()
	 * @generated
	 * @ordered
	 */
	protected String presentationUOMRef = PRESENTATION_UOM_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getUOMCode() <em>UOM Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUOMCode()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUOMCode() <em>UOM Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUOMCode()
	 * @generated
	 * @ordered
	 */
	protected String uOMCode = UOM_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUOMRef() <em>UOM Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUOMRef()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUOMRef() <em>UOM Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUOMRef()
	 * @generated
	 * @ordered
	 */
	protected String uOMRef = UOM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.MEASURE_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentationUOMCode() {
		return presentationUOMCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationUOMCode(String newPresentationUOMCode) {
		String oldPresentationUOMCode = presentationUOMCode;
		presentationUOMCode = newPresentationUOMCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE, oldPresentationUOMCode, presentationUOMCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentationUOMRef() {
		return presentationUOMRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationUOMRef(String newPresentationUOMRef) {
		String oldPresentationUOMRef = presentationUOMRef;
		presentationUOMRef = newPresentationUOMRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF, oldPresentationUOMRef, presentationUOMRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUOMCode() {
		return uOMCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUOMCode(String newUOMCode) {
		String oldUOMCode = uOMCode;
		uOMCode = newUOMCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.MEASURE_VALUE_TYPE__UOM_CODE, oldUOMCode, uOMCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUOMRef() {
		return uOMRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUOMRef(String newUOMRef) {
		String oldUOMRef = uOMRef;
		uOMRef = newUOMRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.MEASURE_VALUE_TYPE__UOM_REF, oldUOMRef, uOMRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE:
				return getPresentationUOMCode();
			case ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF:
				return getPresentationUOMRef();
			case ValuePackage.MEASURE_VALUE_TYPE__UOM_CODE:
				return getUOMCode();
			case ValuePackage.MEASURE_VALUE_TYPE__UOM_REF:
				return getUOMRef();
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
			case ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE:
				setPresentationUOMCode((String)newValue);
				return;
			case ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF:
				setPresentationUOMRef((String)newValue);
				return;
			case ValuePackage.MEASURE_VALUE_TYPE__UOM_CODE:
				setUOMCode((String)newValue);
				return;
			case ValuePackage.MEASURE_VALUE_TYPE__UOM_REF:
				setUOMRef((String)newValue);
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
			case ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE:
				setPresentationUOMCode(PRESENTATION_UOM_CODE_EDEFAULT);
				return;
			case ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF:
				setPresentationUOMRef(PRESENTATION_UOM_REF_EDEFAULT);
				return;
			case ValuePackage.MEASURE_VALUE_TYPE__UOM_CODE:
				setUOMCode(UOM_CODE_EDEFAULT);
				return;
			case ValuePackage.MEASURE_VALUE_TYPE__UOM_REF:
				setUOMRef(UOM_REF_EDEFAULT);
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
			case ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE:
				return PRESENTATION_UOM_CODE_EDEFAULT == null ? presentationUOMCode != null : !PRESENTATION_UOM_CODE_EDEFAULT.equals(presentationUOMCode);
			case ValuePackage.MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF:
				return PRESENTATION_UOM_REF_EDEFAULT == null ? presentationUOMRef != null : !PRESENTATION_UOM_REF_EDEFAULT.equals(presentationUOMRef);
			case ValuePackage.MEASURE_VALUE_TYPE__UOM_CODE:
				return UOM_CODE_EDEFAULT == null ? uOMCode != null : !UOM_CODE_EDEFAULT.equals(uOMCode);
			case ValuePackage.MEASURE_VALUE_TYPE__UOM_REF:
				return UOM_REF_EDEFAULT == null ? uOMRef != null : !UOM_REF_EDEFAULT.equals(uOMRef);
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
		result.append(" (presentationUOMCode: ");
		result.append(presentationUOMCode);
		result.append(", presentationUOMRef: ");
		result.append(presentationUOMRef);
		result.append(", uOMCode: ");
		result.append(uOMCode);
		result.append(", uOMRef: ");
		result.append(uOMRef);
		result.append(')');
		return result.toString();
	}

} //MeasureValueTypeImpl
