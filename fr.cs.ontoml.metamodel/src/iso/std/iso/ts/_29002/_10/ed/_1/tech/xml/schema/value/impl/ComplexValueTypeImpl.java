/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ComplexValueTypeImpl#getRealPart <em>Real Part</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ComplexValueTypeImpl#getImaginaryPart <em>Imaginary Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexValueTypeImpl extends MinimalEObjectImpl.Container implements ComplexValueType {
	/**
	 * The default value of the '{@link #getRealPart() <em>Real Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealPart()
	 * @generated
	 * @ordered
	 */
	protected static final double REAL_PART_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRealPart() <em>Real Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealPart()
	 * @generated
	 * @ordered
	 */
	protected double realPart = REAL_PART_EDEFAULT;

	/**
	 * This is true if the Real Part attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean realPartESet;

	/**
	 * The default value of the '{@link #getImaginaryPart() <em>Imaginary Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImaginaryPart()
	 * @generated
	 * @ordered
	 */
	protected static final double IMAGINARY_PART_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getImaginaryPart() <em>Imaginary Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImaginaryPart()
	 * @generated
	 * @ordered
	 */
	protected double imaginaryPart = IMAGINARY_PART_EDEFAULT;

	/**
	 * This is true if the Imaginary Part attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean imaginaryPartESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.COMPLEX_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRealPart() {
		return realPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealPart(double newRealPart) {
		double oldRealPart = realPart;
		realPart = newRealPart;
		boolean oldRealPartESet = realPartESet;
		realPartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.COMPLEX_VALUE_TYPE__REAL_PART, oldRealPart, realPart, !oldRealPartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRealPart() {
		double oldRealPart = realPart;
		boolean oldRealPartESet = realPartESet;
		realPart = REAL_PART_EDEFAULT;
		realPartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ValuePackage.COMPLEX_VALUE_TYPE__REAL_PART, oldRealPart, REAL_PART_EDEFAULT, oldRealPartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRealPart() {
		return realPartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getImaginaryPart() {
		return imaginaryPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImaginaryPart(double newImaginaryPart) {
		double oldImaginaryPart = imaginaryPart;
		imaginaryPart = newImaginaryPart;
		boolean oldImaginaryPartESet = imaginaryPartESet;
		imaginaryPartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.COMPLEX_VALUE_TYPE__IMAGINARY_PART, oldImaginaryPart, imaginaryPart, !oldImaginaryPartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImaginaryPart() {
		double oldImaginaryPart = imaginaryPart;
		boolean oldImaginaryPartESet = imaginaryPartESet;
		imaginaryPart = IMAGINARY_PART_EDEFAULT;
		imaginaryPartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ValuePackage.COMPLEX_VALUE_TYPE__IMAGINARY_PART, oldImaginaryPart, IMAGINARY_PART_EDEFAULT, oldImaginaryPartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImaginaryPart() {
		return imaginaryPartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValuePackage.COMPLEX_VALUE_TYPE__REAL_PART:
				return getRealPart();
			case ValuePackage.COMPLEX_VALUE_TYPE__IMAGINARY_PART:
				return getImaginaryPart();
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
			case ValuePackage.COMPLEX_VALUE_TYPE__REAL_PART:
				setRealPart((Double)newValue);
				return;
			case ValuePackage.COMPLEX_VALUE_TYPE__IMAGINARY_PART:
				setImaginaryPart((Double)newValue);
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
			case ValuePackage.COMPLEX_VALUE_TYPE__REAL_PART:
				unsetRealPart();
				return;
			case ValuePackage.COMPLEX_VALUE_TYPE__IMAGINARY_PART:
				unsetImaginaryPart();
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
			case ValuePackage.COMPLEX_VALUE_TYPE__REAL_PART:
				return isSetRealPart();
			case ValuePackage.COMPLEX_VALUE_TYPE__IMAGINARY_PART:
				return isSetImaginaryPart();
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
		result.append(" (realPart: ");
		if (realPartESet) result.append(realPart); else result.append("<unset>");
		result.append(", imaginaryPart: ");
		if (imaginaryPartESet) result.append(imaginaryPart); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ComplexValueTypeImpl
