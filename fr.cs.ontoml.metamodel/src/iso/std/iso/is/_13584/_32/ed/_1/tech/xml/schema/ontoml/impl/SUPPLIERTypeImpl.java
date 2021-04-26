/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SUPPLIER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getDateOfCurrentVersion <em>Date Of Current Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getDateOfCurrentRevision <em>Date Of Current Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#isIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getInternalLocation <em>Internal Location</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getStreetNumber <em>Street Number</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getPostalBox <em>Postal Box</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getTown <em>Town</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getFacsimileNumber <em>Facsimile Number</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getElectronicMailAddress <em>Electronic Mail Address</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getTelexNumber <em>Telex Number</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPLIERTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SUPPLIERTypeImpl extends MinimalEObjectImpl.Container implements SUPPLIERType {
	/**
	 * The default value of the '{@link #getDateOfOriginalDefinition() <em>Date Of Original Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfOriginalDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_OF_ORIGINAL_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfOriginalDefinition() <em>Date Of Original Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfOriginalDefinition()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateOfOriginalDefinition = DATE_OF_ORIGINAL_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfCurrentVersion() <em>Date Of Current Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_OF_CURRENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfCurrentVersion() <em>Date Of Current Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentVersion()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateOfCurrentVersion = DATE_OF_CURRENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfCurrentRevision() <em>Date Of Current Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentRevision()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_OF_CURRENT_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfCurrentRevision() <em>Date Of Current Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentRevision()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateOfCurrentRevision = DATE_OF_CURRENT_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

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
	 * The default value of the '{@link #isIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPRECATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected boolean isDeprecated = IS_DEPRECATED_EDEFAULT;

	/**
	 * This is true if the Is Deprecated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDeprecatedESet;

	/**
	 * The cached value of the '{@link #getIsDeprecatedInterpretation() <em>Is Deprecated Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeprecatedInterpretation()
	 * @generated
	 * @ordered
	 */
	protected TEXTType isDeprecatedInterpretation;

	/**
	 * The cached value of the '{@link #getOrg() <em>Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrg()
	 * @generated
	 * @ordered
	 */
	protected ORGANIZATIONType org;

	/**
	 * The default value of the '{@link #getInternalLocation() <em>Internal Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalLocation() <em>Internal Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalLocation()
	 * @generated
	 * @ordered
	 */
	protected String internalLocation = INTERNAL_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreetNumber() <em>Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreetNumber() <em>Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected String streetNumber = STREET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalBox() <em>Postal Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalBox()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalBox() <em>Postal Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalBox()
	 * @generated
	 * @ordered
	 */
	protected String postalBox = POSTAL_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTown() <em>Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTown()
	 * @generated
	 * @ordered
	 */
	protected static final String TOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTown() <em>Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTown()
	 * @generated
	 * @ordered
	 */
	protected String town = TOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacsimileNumber() <em>Facsimile Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FACSIMILE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacsimileNumber() <em>Facsimile Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileNumber()
	 * @generated
	 * @ordered
	 */
	protected String facsimileNumber = FACSIMILE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String telephoneNumber = TELEPHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getElectronicMailAddress() <em>Electronic Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicMailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ELECTRONIC_MAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElectronicMailAddress() <em>Electronic Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicMailAddress()
	 * @generated
	 * @ordered
	 */
	protected String electronicMailAddress = ELECTRONIC_MAIL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelexNumber() <em>Telex Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelexNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEX_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelexNumber() <em>Telex Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelexNumber()
	 * @generated
	 * @ordered
	 */
	protected String telexNumber = TELEX_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUPPLIERTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getSUPPLIERType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateOfOriginalDefinition() {
		return dateOfOriginalDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfOriginalDefinition(XMLGregorianCalendar newDateOfOriginalDefinition) {
		XMLGregorianCalendar oldDateOfOriginalDefinition = dateOfOriginalDefinition;
		dateOfOriginalDefinition = newDateOfOriginalDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__DATE_OF_ORIGINAL_DEFINITION, oldDateOfOriginalDefinition, dateOfOriginalDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateOfCurrentVersion() {
		return dateOfCurrentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfCurrentVersion(XMLGregorianCalendar newDateOfCurrentVersion) {
		XMLGregorianCalendar oldDateOfCurrentVersion = dateOfCurrentVersion;
		dateOfCurrentVersion = newDateOfCurrentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_VERSION, oldDateOfCurrentVersion, dateOfCurrentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateOfCurrentRevision() {
		return dateOfCurrentRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfCurrentRevision(XMLGregorianCalendar newDateOfCurrentRevision) {
		XMLGregorianCalendar oldDateOfCurrentRevision = dateOfCurrentRevision;
		dateOfCurrentRevision = newDateOfCurrentRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_REVISION, oldDateOfCurrentRevision, dateOfCurrentRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDeprecated() {
		return isDeprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeprecated(boolean newIsDeprecated) {
		boolean oldIsDeprecated = isDeprecated;
		isDeprecated = newIsDeprecated;
		boolean oldIsDeprecatedESet = isDeprecatedESet;
		isDeprecatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED, oldIsDeprecated, isDeprecated, !oldIsDeprecatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDeprecated() {
		boolean oldIsDeprecated = isDeprecated;
		boolean oldIsDeprecatedESet = isDeprecatedESet;
		isDeprecated = IS_DEPRECATED_EDEFAULT;
		isDeprecatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED, oldIsDeprecated, IS_DEPRECATED_EDEFAULT, oldIsDeprecatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDeprecated() {
		return isDeprecatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTType getIsDeprecatedInterpretation() {
		return isDeprecatedInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDeprecatedInterpretation(TEXTType newIsDeprecatedInterpretation, NotificationChain msgs) {
		TEXTType oldIsDeprecatedInterpretation = isDeprecatedInterpretation;
		isDeprecatedInterpretation = newIsDeprecatedInterpretation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION, oldIsDeprecatedInterpretation, newIsDeprecatedInterpretation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeprecatedInterpretation(TEXTType newIsDeprecatedInterpretation) {
		if (newIsDeprecatedInterpretation != isDeprecatedInterpretation) {
			NotificationChain msgs = null;
			if (isDeprecatedInterpretation != null)
				msgs = ((InternalEObject)isDeprecatedInterpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			if (newIsDeprecatedInterpretation != null)
				msgs = ((InternalEObject)newIsDeprecatedInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			msgs = basicSetIsDeprecatedInterpretation(newIsDeprecatedInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION, newIsDeprecatedInterpretation, newIsDeprecatedInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORGANIZATIONType getOrg() {
		return org;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrg(ORGANIZATIONType newOrg, NotificationChain msgs) {
		ORGANIZATIONType oldOrg = org;
		org = newOrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__ORG, oldOrg, newOrg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrg(ORGANIZATIONType newOrg) {
		if (newOrg != org) {
			NotificationChain msgs = null;
			if (org != null)
				msgs = ((InternalEObject)org).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.SUPPLIER_TYPE__ORG, null, msgs);
			if (newOrg != null)
				msgs = ((InternalEObject)newOrg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.SUPPLIER_TYPE__ORG, null, msgs);
			msgs = basicSetOrg(newOrg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__ORG, newOrg, newOrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalLocation() {
		return internalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalLocation(String newInternalLocation) {
		String oldInternalLocation = internalLocation;
		internalLocation = newInternalLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__INTERNAL_LOCATION, oldInternalLocation, internalLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetNumber() {
		return streetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetNumber(String newStreetNumber) {
		String oldStreetNumber = streetNumber;
		streetNumber = newStreetNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__STREET_NUMBER, oldStreetNumber, streetNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalBox() {
		return postalBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalBox(String newPostalBox) {
		String oldPostalBox = postalBox;
		postalBox = newPostalBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__POSTAL_BOX, oldPostalBox, postalBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTown() {
		return town;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTown(String newTown) {
		String oldTown = town;
		town = newTown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__TOWN, oldTown, town));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFacsimileNumber() {
		return facsimileNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacsimileNumber(String newFacsimileNumber) {
		String oldFacsimileNumber = facsimileNumber;
		facsimileNumber = newFacsimileNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__FACSIMILE_NUMBER, oldFacsimileNumber, facsimileNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephoneNumber(String newTelephoneNumber) {
		String oldTelephoneNumber = telephoneNumber;
		telephoneNumber = newTelephoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__TELEPHONE_NUMBER, oldTelephoneNumber, telephoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElectronicMailAddress() {
		return electronicMailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicMailAddress(String newElectronicMailAddress) {
		String oldElectronicMailAddress = electronicMailAddress;
		electronicMailAddress = newElectronicMailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__ELECTRONIC_MAIL_ADDRESS, oldElectronicMailAddress, electronicMailAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelexNumber() {
		return telexNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelexNumber(String newTelexNumber) {
		String oldTelexNumber = telexNumber;
		telexNumber = newTelexNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__TELEX_NUMBER, oldTelexNumber, telexNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.SUPPLIER_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION:
				return basicSetIsDeprecatedInterpretation(null, msgs);
			case OntomlPackage.SUPPLIER_TYPE__ORG:
				return basicSetOrg(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return getDateOfOriginalDefinition();
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_VERSION:
				return getDateOfCurrentVersion();
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_REVISION:
				return getDateOfCurrentRevision();
			case OntomlPackage.SUPPLIER_TYPE__REVISION:
				return getRevision();
			case OntomlPackage.SUPPLIER_TYPE__STATUS:
				return getStatus();
			case OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED:
				return isIsDeprecated();
			case OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION:
				return getIsDeprecatedInterpretation();
			case OntomlPackage.SUPPLIER_TYPE__ORG:
				return getOrg();
			case OntomlPackage.SUPPLIER_TYPE__INTERNAL_LOCATION:
				return getInternalLocation();
			case OntomlPackage.SUPPLIER_TYPE__STREET_NUMBER:
				return getStreetNumber();
			case OntomlPackage.SUPPLIER_TYPE__STREET:
				return getStreet();
			case OntomlPackage.SUPPLIER_TYPE__POSTAL_BOX:
				return getPostalBox();
			case OntomlPackage.SUPPLIER_TYPE__TOWN:
				return getTown();
			case OntomlPackage.SUPPLIER_TYPE__REGION:
				return getRegion();
			case OntomlPackage.SUPPLIER_TYPE__POSTAL_CODE:
				return getPostalCode();
			case OntomlPackage.SUPPLIER_TYPE__COUNTRY:
				return getCountry();
			case OntomlPackage.SUPPLIER_TYPE__FACSIMILE_NUMBER:
				return getFacsimileNumber();
			case OntomlPackage.SUPPLIER_TYPE__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case OntomlPackage.SUPPLIER_TYPE__ELECTRONIC_MAIL_ADDRESS:
				return getElectronicMailAddress();
			case OntomlPackage.SUPPLIER_TYPE__TELEX_NUMBER:
				return getTelexNumber();
			case OntomlPackage.SUPPLIER_TYPE__ID:
				return getId();
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
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__REVISION:
				setRevision((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__STATUS:
				setStatus((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__ORG:
				setOrg((ORGANIZATIONType)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__INTERNAL_LOCATION:
				setInternalLocation((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__STREET_NUMBER:
				setStreetNumber((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__STREET:
				setStreet((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__POSTAL_BOX:
				setPostalBox((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__TOWN:
				setTown((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__REGION:
				setRegion((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__COUNTRY:
				setCountry((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__FACSIMILE_NUMBER:
				setFacsimileNumber((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__TELEPHONE_NUMBER:
				setTelephoneNumber((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__ELECTRONIC_MAIL_ADDRESS:
				setElectronicMailAddress((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__TELEX_NUMBER:
				setTelexNumber((String)newValue);
				return;
			case OntomlPackage.SUPPLIER_TYPE__ID:
				setId((String)newValue);
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
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition(DATE_OF_ORIGINAL_DEFINITION_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion(DATE_OF_CURRENT_VERSION_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision(DATE_OF_CURRENT_REVISION_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED:
				unsetIsDeprecated();
				return;
			case OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)null);
				return;
			case OntomlPackage.SUPPLIER_TYPE__ORG:
				setOrg((ORGANIZATIONType)null);
				return;
			case OntomlPackage.SUPPLIER_TYPE__INTERNAL_LOCATION:
				setInternalLocation(INTERNAL_LOCATION_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__STREET_NUMBER:
				setStreetNumber(STREET_NUMBER_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__POSTAL_BOX:
				setPostalBox(POSTAL_BOX_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__TOWN:
				setTown(TOWN_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__FACSIMILE_NUMBER:
				setFacsimileNumber(FACSIMILE_NUMBER_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__TELEPHONE_NUMBER:
				setTelephoneNumber(TELEPHONE_NUMBER_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__ELECTRONIC_MAIL_ADDRESS:
				setElectronicMailAddress(ELECTRONIC_MAIL_ADDRESS_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__TELEX_NUMBER:
				setTelexNumber(TELEX_NUMBER_EDEFAULT);
				return;
			case OntomlPackage.SUPPLIER_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return DATE_OF_ORIGINAL_DEFINITION_EDEFAULT == null ? dateOfOriginalDefinition != null : !DATE_OF_ORIGINAL_DEFINITION_EDEFAULT.equals(dateOfOriginalDefinition);
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_VERSION:
				return DATE_OF_CURRENT_VERSION_EDEFAULT == null ? dateOfCurrentVersion != null : !DATE_OF_CURRENT_VERSION_EDEFAULT.equals(dateOfCurrentVersion);
			case OntomlPackage.SUPPLIER_TYPE__DATE_OF_CURRENT_REVISION:
				return DATE_OF_CURRENT_REVISION_EDEFAULT == null ? dateOfCurrentRevision != null : !DATE_OF_CURRENT_REVISION_EDEFAULT.equals(dateOfCurrentRevision);
			case OntomlPackage.SUPPLIER_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case OntomlPackage.SUPPLIER_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED:
				return isSetIsDeprecated();
			case OntomlPackage.SUPPLIER_TYPE__IS_DEPRECATED_INTERPRETATION:
				return isDeprecatedInterpretation != null;
			case OntomlPackage.SUPPLIER_TYPE__ORG:
				return org != null;
			case OntomlPackage.SUPPLIER_TYPE__INTERNAL_LOCATION:
				return INTERNAL_LOCATION_EDEFAULT == null ? internalLocation != null : !INTERNAL_LOCATION_EDEFAULT.equals(internalLocation);
			case OntomlPackage.SUPPLIER_TYPE__STREET_NUMBER:
				return STREET_NUMBER_EDEFAULT == null ? streetNumber != null : !STREET_NUMBER_EDEFAULT.equals(streetNumber);
			case OntomlPackage.SUPPLIER_TYPE__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case OntomlPackage.SUPPLIER_TYPE__POSTAL_BOX:
				return POSTAL_BOX_EDEFAULT == null ? postalBox != null : !POSTAL_BOX_EDEFAULT.equals(postalBox);
			case OntomlPackage.SUPPLIER_TYPE__TOWN:
				return TOWN_EDEFAULT == null ? town != null : !TOWN_EDEFAULT.equals(town);
			case OntomlPackage.SUPPLIER_TYPE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case OntomlPackage.SUPPLIER_TYPE__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case OntomlPackage.SUPPLIER_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case OntomlPackage.SUPPLIER_TYPE__FACSIMILE_NUMBER:
				return FACSIMILE_NUMBER_EDEFAULT == null ? facsimileNumber != null : !FACSIMILE_NUMBER_EDEFAULT.equals(facsimileNumber);
			case OntomlPackage.SUPPLIER_TYPE__TELEPHONE_NUMBER:
				return TELEPHONE_NUMBER_EDEFAULT == null ? telephoneNumber != null : !TELEPHONE_NUMBER_EDEFAULT.equals(telephoneNumber);
			case OntomlPackage.SUPPLIER_TYPE__ELECTRONIC_MAIL_ADDRESS:
				return ELECTRONIC_MAIL_ADDRESS_EDEFAULT == null ? electronicMailAddress != null : !ELECTRONIC_MAIL_ADDRESS_EDEFAULT.equals(electronicMailAddress);
			case OntomlPackage.SUPPLIER_TYPE__TELEX_NUMBER:
				return TELEX_NUMBER_EDEFAULT == null ? telexNumber != null : !TELEX_NUMBER_EDEFAULT.equals(telexNumber);
			case OntomlPackage.SUPPLIER_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (dateOfOriginalDefinition: ");
		result.append(dateOfOriginalDefinition);
		result.append(", dateOfCurrentVersion: ");
		result.append(dateOfCurrentVersion);
		result.append(", dateOfCurrentRevision: ");
		result.append(dateOfCurrentRevision);
		result.append(", revision: ");
		result.append(revision);
		result.append(", status: ");
		result.append(status);
		result.append(", isDeprecated: ");
		if (isDeprecatedESet) result.append(isDeprecated); else result.append("<unset>");
		result.append(", internalLocation: ");
		result.append(internalLocation);
		result.append(", streetNumber: ");
		result.append(streetNumber);
		result.append(", street: ");
		result.append(street);
		result.append(", postalBox: ");
		result.append(postalBox);
		result.append(", town: ");
		result.append(town);
		result.append(", region: ");
		result.append(region);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", country: ");
		result.append(country);
		result.append(", facsimileNumber: ");
		result.append(facsimileNumber);
		result.append(", telephoneNumber: ");
		result.append(telephoneNumber);
		result.append(", electronicMailAddress: ");
		result.append(electronicMailAddress);
		result.append(", telexNumber: ");
		result.append(telexNumber);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SUPPLIERTypeImpl
