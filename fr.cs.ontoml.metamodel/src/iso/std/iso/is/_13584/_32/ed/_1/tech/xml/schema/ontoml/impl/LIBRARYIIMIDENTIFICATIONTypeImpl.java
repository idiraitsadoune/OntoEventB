/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LIBRARYIIMIDENTIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYIIMIDENTIFICATIONTypeImpl#getSourceDocumentIdentifier <em>Source Document Identifier</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYIIMIDENTIFICATIONTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYIIMIDENTIFICATIONTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYIIMIDENTIFICATIONTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYIIMIDENTIFICATIONTypeImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYIIMIDENTIFICATIONTypeImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LIBRARYIIMIDENTIFICATIONTypeImpl extends MinimalEObjectImpl.Container implements LIBRARYIIMIDENTIFICATIONType {
	/**
	 * The default value of the '{@link #getSourceDocumentIdentifier() <em>Source Document Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocumentIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DOCUMENT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceDocumentIdentifier() <em>Source Document Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocumentIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String sourceDocumentIdentifier = SOURCE_DOCUMENT_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected BigInteger date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LIBRARYIIMIDENTIFICATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getLIBRARYIIMIDENTIFICATIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDocumentIdentifier() {
		return sourceDocumentIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocumentIdentifier(String newSourceDocumentIdentifier) {
		String oldSourceDocumentIdentifier = sourceDocumentIdentifier;
		sourceDocumentIdentifier = newSourceDocumentIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__SOURCE_DOCUMENT_IDENTIFIER, oldSourceDocumentIdentifier, sourceDocumentIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(BigInteger newDate) {
		BigInteger oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__SOURCE_DOCUMENT_IDENTIFIER:
				return getSourceDocumentIdentifier();
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__STATUS:
				return getStatus();
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__NAME:
				return getName();
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__DATE:
				return getDate();
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__APPLICATION:
				return getApplication();
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__LEVEL:
				return getLevel();
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
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__SOURCE_DOCUMENT_IDENTIFIER:
				setSourceDocumentIdentifier((String)newValue);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__STATUS:
				setStatus((String)newValue);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__DATE:
				setDate((BigInteger)newValue);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__APPLICATION:
				setApplication((String)newValue);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__LEVEL:
				setLevel((String)newValue);
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
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__SOURCE_DOCUMENT_IDENTIFIER:
				setSourceDocumentIdentifier(SOURCE_DOCUMENT_IDENTIFIER_EDEFAULT);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__SOURCE_DOCUMENT_IDENTIFIER:
				return SOURCE_DOCUMENT_IDENTIFIER_EDEFAULT == null ? sourceDocumentIdentifier != null : !SOURCE_DOCUMENT_IDENTIFIER_EDEFAULT.equals(sourceDocumentIdentifier);
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
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
		result.append(" (sourceDocumentIdentifier: ");
		result.append(sourceDocumentIdentifier);
		result.append(", status: ");
		result.append(status);
		result.append(", name: ");
		result.append(name);
		result.append(", date: ");
		result.append(date);
		result.append(", application: ");
		result.append(application);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //LIBRARYIIMIDENTIFICATIONTypeImpl
