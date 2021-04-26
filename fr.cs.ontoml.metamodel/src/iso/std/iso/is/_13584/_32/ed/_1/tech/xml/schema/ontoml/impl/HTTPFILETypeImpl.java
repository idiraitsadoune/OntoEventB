/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTTPFILE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HTTPFILETypeImpl#getHttpFile <em>Http File</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HTTPFILETypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HTTPFILETypeImpl#getDirName <em>Dir Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HTTPFILETypeImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HTTPFILETypeImpl#getLanguageCode <em>Language Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPFILETypeImpl extends MinimalEObjectImpl.Container implements HTTPFILEType {
	/**
	 * The default value of the '{@link #getHttpFile() <em>Http File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpFile()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpFile() <em>Http File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpFile()
	 * @generated
	 * @ordered
	 */
	protected String httpFile = HTTP_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirName() <em>Dir Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirName() <em>Dir Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirName()
	 * @generated
	 * @ordered
	 */
	protected String dirName = DIR_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPFILETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getHTTPFILEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpFile() {
		return httpFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpFile(String newHttpFile) {
		String oldHttpFile = httpFile;
		httpFile = newHttpFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HTTPFILE_TYPE__HTTP_FILE, oldHttpFile, httpFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HTTPFILE_TYPE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirName() {
		return dirName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirName(String newDirName) {
		String oldDirName = dirName;
		dirName = newDirName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HTTPFILE_TYPE__DIR_NAME, oldDirName, dirName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HTTPFILE_TYPE__COUNTRY_CODE, oldCountryCode, countryCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HTTPFILE_TYPE__LANGUAGE_CODE, oldLanguageCode, languageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.HTTPFILE_TYPE__HTTP_FILE:
				return getHttpFile();
			case OntomlPackage.HTTPFILE_TYPE__FILE_NAME:
				return getFileName();
			case OntomlPackage.HTTPFILE_TYPE__DIR_NAME:
				return getDirName();
			case OntomlPackage.HTTPFILE_TYPE__COUNTRY_CODE:
				return getCountryCode();
			case OntomlPackage.HTTPFILE_TYPE__LANGUAGE_CODE:
				return getLanguageCode();
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
			case OntomlPackage.HTTPFILE_TYPE__HTTP_FILE:
				setHttpFile((String)newValue);
				return;
			case OntomlPackage.HTTPFILE_TYPE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case OntomlPackage.HTTPFILE_TYPE__DIR_NAME:
				setDirName((String)newValue);
				return;
			case OntomlPackage.HTTPFILE_TYPE__COUNTRY_CODE:
				setCountryCode((String)newValue);
				return;
			case OntomlPackage.HTTPFILE_TYPE__LANGUAGE_CODE:
				setLanguageCode((String)newValue);
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
			case OntomlPackage.HTTPFILE_TYPE__HTTP_FILE:
				setHttpFile(HTTP_FILE_EDEFAULT);
				return;
			case OntomlPackage.HTTPFILE_TYPE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case OntomlPackage.HTTPFILE_TYPE__DIR_NAME:
				setDirName(DIR_NAME_EDEFAULT);
				return;
			case OntomlPackage.HTTPFILE_TYPE__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
				return;
			case OntomlPackage.HTTPFILE_TYPE__LANGUAGE_CODE:
				setLanguageCode(LANGUAGE_CODE_EDEFAULT);
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
			case OntomlPackage.HTTPFILE_TYPE__HTTP_FILE:
				return HTTP_FILE_EDEFAULT == null ? httpFile != null : !HTTP_FILE_EDEFAULT.equals(httpFile);
			case OntomlPackage.HTTPFILE_TYPE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case OntomlPackage.HTTPFILE_TYPE__DIR_NAME:
				return DIR_NAME_EDEFAULT == null ? dirName != null : !DIR_NAME_EDEFAULT.equals(dirName);
			case OntomlPackage.HTTPFILE_TYPE__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
			case OntomlPackage.HTTPFILE_TYPE__LANGUAGE_CODE:
				return LANGUAGE_CODE_EDEFAULT == null ? languageCode != null : !LANGUAGE_CODE_EDEFAULT.equals(languageCode);
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
		result.append(" (httpFile: ");
		result.append(httpFile);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", dirName: ");
		result.append(dirName);
		result.append(", countryCode: ");
		result.append(countryCode);
		result.append(", languageCode: ");
		result.append(languageCode);
		result.append(')');
		return result.toString();
	}

} //HTTPFILETypeImpl
