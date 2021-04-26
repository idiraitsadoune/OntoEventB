/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REALCURRENCYTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALCURRENCYTYPETypeImpl#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALCURRENCYTYPETypeImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALCURRENCYTYPETypeImpl#getCurrencyId <em>Currency Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REALCURRENCYTYPETypeImpl extends ANYTYPETypeImpl implements REALCURRENCYTYPEType {
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
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected String currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyId() <em>Currency Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyId() <em>Currency Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyId()
	 * @generated
	 * @ordered
	 */
	protected String currencyId = CURRENCY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REALCURRENCYTYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getREALCURRENCYTYPEType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REALCURRENCYTYPE_TYPE__VALUE_FORMAT, oldValueFormat, valueFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(String newCurrency) {
		String oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrencyId() {
		return currencyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyId(String newCurrencyId) {
		String oldCurrencyId = currencyId;
		currencyId = newCurrencyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY_ID, oldCurrencyId, currencyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.REALCURRENCYTYPE_TYPE__VALUE_FORMAT:
				return getValueFormat();
			case OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY:
				return getCurrency();
			case OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY_ID:
				return getCurrencyId();
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
			case OntomlPackage.REALCURRENCYTYPE_TYPE__VALUE_FORMAT:
				setValueFormat((String)newValue);
				return;
			case OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY:
				setCurrency((String)newValue);
				return;
			case OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY_ID:
				setCurrencyId((String)newValue);
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
			case OntomlPackage.REALCURRENCYTYPE_TYPE__VALUE_FORMAT:
				setValueFormat(VALUE_FORMAT_EDEFAULT);
				return;
			case OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY_ID:
				setCurrencyId(CURRENCY_ID_EDEFAULT);
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
			case OntomlPackage.REALCURRENCYTYPE_TYPE__VALUE_FORMAT:
				return VALUE_FORMAT_EDEFAULT == null ? valueFormat != null : !VALUE_FORMAT_EDEFAULT.equals(valueFormat);
			case OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case OntomlPackage.REALCURRENCYTYPE_TYPE__CURRENCY_ID:
				return CURRENCY_ID_EDEFAULT == null ? currencyId != null : !CURRENCY_ID_EDEFAULT.equals(currencyId);
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
		result.append(", currency: ");
		result.append(currency);
		result.append(", currencyId: ");
		result.append(currencyId);
		result.append(')');
		return result.toString();
	}

} //REALCURRENCYTYPETypeImpl
