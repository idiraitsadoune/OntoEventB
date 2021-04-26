/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rational Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RationalValueTypeImpl#getWholePart <em>Whole Part</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RationalValueTypeImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.RationalValueTypeImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RationalValueTypeImpl extends MinimalEObjectImpl.Container implements RationalValueType {
	/**
	 * The default value of the '{@link #getWholePart() <em>Whole Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWholePart()
	 * @generated
	 * @ordered
	 */
	protected static final int WHOLE_PART_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWholePart() <em>Whole Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWholePart()
	 * @generated
	 * @ordered
	 */
	protected int wholePart = WHOLE_PART_EDEFAULT;

	/**
	 * This is true if the Whole Part attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wholePartESet;

	/**
	 * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected int numerator = NUMERATOR_EDEFAULT;

	/**
	 * This is true if the Numerator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeratorESet;

	/**
	 * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final int DENOMINATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected int denominator = DENOMINATOR_EDEFAULT;

	/**
	 * This is true if the Denominator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean denominatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RationalValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.RATIONAL_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWholePart() {
		return wholePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWholePart(int newWholePart) {
		int oldWholePart = wholePart;
		wholePart = newWholePart;
		boolean oldWholePartESet = wholePartESet;
		wholePartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.RATIONAL_VALUE_TYPE__WHOLE_PART, oldWholePart, wholePart, !oldWholePartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWholePart() {
		int oldWholePart = wholePart;
		boolean oldWholePartESet = wholePartESet;
		wholePart = WHOLE_PART_EDEFAULT;
		wholePartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ValuePackage.RATIONAL_VALUE_TYPE__WHOLE_PART, oldWholePart, WHOLE_PART_EDEFAULT, oldWholePartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWholePart() {
		return wholePartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(int newNumerator) {
		int oldNumerator = numerator;
		numerator = newNumerator;
		boolean oldNumeratorESet = numeratorESet;
		numeratorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.RATIONAL_VALUE_TYPE__NUMERATOR, oldNumerator, numerator, !oldNumeratorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumerator() {
		int oldNumerator = numerator;
		boolean oldNumeratorESet = numeratorESet;
		numerator = NUMERATOR_EDEFAULT;
		numeratorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ValuePackage.RATIONAL_VALUE_TYPE__NUMERATOR, oldNumerator, NUMERATOR_EDEFAULT, oldNumeratorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumerator() {
		return numeratorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(int newDenominator) {
		int oldDenominator = denominator;
		denominator = newDenominator;
		boolean oldDenominatorESet = denominatorESet;
		denominatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.RATIONAL_VALUE_TYPE__DENOMINATOR, oldDenominator, denominator, !oldDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDenominator() {
		int oldDenominator = denominator;
		boolean oldDenominatorESet = denominatorESet;
		denominator = DENOMINATOR_EDEFAULT;
		denominatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ValuePackage.RATIONAL_VALUE_TYPE__DENOMINATOR, oldDenominator, DENOMINATOR_EDEFAULT, oldDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDenominator() {
		return denominatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValuePackage.RATIONAL_VALUE_TYPE__WHOLE_PART:
				return getWholePart();
			case ValuePackage.RATIONAL_VALUE_TYPE__NUMERATOR:
				return getNumerator();
			case ValuePackage.RATIONAL_VALUE_TYPE__DENOMINATOR:
				return getDenominator();
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
			case ValuePackage.RATIONAL_VALUE_TYPE__WHOLE_PART:
				setWholePart((Integer)newValue);
				return;
			case ValuePackage.RATIONAL_VALUE_TYPE__NUMERATOR:
				setNumerator((Integer)newValue);
				return;
			case ValuePackage.RATIONAL_VALUE_TYPE__DENOMINATOR:
				setDenominator((Integer)newValue);
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
			case ValuePackage.RATIONAL_VALUE_TYPE__WHOLE_PART:
				unsetWholePart();
				return;
			case ValuePackage.RATIONAL_VALUE_TYPE__NUMERATOR:
				unsetNumerator();
				return;
			case ValuePackage.RATIONAL_VALUE_TYPE__DENOMINATOR:
				unsetDenominator();
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
			case ValuePackage.RATIONAL_VALUE_TYPE__WHOLE_PART:
				return isSetWholePart();
			case ValuePackage.RATIONAL_VALUE_TYPE__NUMERATOR:
				return isSetNumerator();
			case ValuePackage.RATIONAL_VALUE_TYPE__DENOMINATOR:
				return isSetDenominator();
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
		result.append(" (wholePart: ");
		if (wholePartESet) result.append(wholePart); else result.append("<unset>");
		result.append(", numerator: ");
		if (numeratorESet) result.append(numerator); else result.append("<unset>");
		result.append(", denominator: ");
		if (denominatorESet) result.append(denominator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RationalValueTypeImpl
