/**
 */
package iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage;
import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.LanguageStringTypeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.LanguageStringTypeImpl#getLanguageRef <em>Language Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.LanguageStringTypeImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.LanguageStringTypeImpl#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageStringTypeImpl extends MinimalEObjectImpl.Container implements LanguageStringType {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageRef() <em>Language Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageRef() <em>Language Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageRef()
	 * @generated
	 * @ordered
	 */
	protected String languageRef = LANGUAGE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected String languageCode = LANGUAGE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected String countryCode = COUNTRY_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageStringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.LANGUAGE_STRING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.LANGUAGE_STRING_TYPE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageRef() {
		return languageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageRef(String newLanguageRef) {
		String oldLanguageRef = languageRef;
		languageRef = newLanguageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_REF, oldLanguageRef, languageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageCode(String newLanguageCode) {
		String oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_CODE, oldLanguageCode, languageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryCode(String newCountryCode) {
		String oldCountryCode = countryCode;
		countryCode = newCountryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.LANGUAGE_STRING_TYPE__COUNTRY_CODE, oldCountryCode, countryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.LANGUAGE_STRING_TYPE__CONTENT:
				return getContent();
			case BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_REF:
				return getLanguageRef();
			case BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_CODE:
				return getLanguageCode();
			case BasicPackage.LANGUAGE_STRING_TYPE__COUNTRY_CODE:
				return getCountryCode();
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
			case BasicPackage.LANGUAGE_STRING_TYPE__CONTENT:
				setContent((String)newValue);
				return;
			case BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_REF:
				setLanguageRef((String)newValue);
				return;
			case BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_CODE:
				setLanguageCode((String)newValue);
				return;
			case BasicPackage.LANGUAGE_STRING_TYPE__COUNTRY_CODE:
				setCountryCode((String)newValue);
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
			case BasicPackage.LANGUAGE_STRING_TYPE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_REF:
				setLanguageRef(LANGUAGE_REF_EDEFAULT);
				return;
			case BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_CODE:
				setLanguageCode(LANGUAGE_CODE_EDEFAULT);
				return;
			case BasicPackage.LANGUAGE_STRING_TYPE__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
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
			case BasicPackage.LANGUAGE_STRING_TYPE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_REF:
				return LANGUAGE_REF_EDEFAULT == null ? languageRef != null : !LANGUAGE_REF_EDEFAULT.equals(languageRef);
			case BasicPackage.LANGUAGE_STRING_TYPE__LANGUAGE_CODE:
				return LANGUAGE_CODE_EDEFAULT == null ? languageCode != null : !LANGUAGE_CODE_EDEFAULT.equals(languageCode);
			case BasicPackage.LANGUAGE_STRING_TYPE__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
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
		result.append(" (content: ");
		result.append(content);
		result.append(", languageRef: ");
		result.append(languageRef);
		result.append(", languageCode: ");
		result.append(languageCode);
		result.append(", countryCode: ");
		result.append(countryCode);
		result.append(')');
		return result.toString();
	}

} //LanguageStringTypeImpl
