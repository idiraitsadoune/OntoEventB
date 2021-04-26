/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPORTEDVEPType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEADER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getGlobalLanguage <em>Global Language</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getDateTimeStamp <em>Date Time Stamp</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getPreProcessorVersion <em>Pre Processor Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getOriginatingSystem <em>Originating System</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getOntomlInformation <em>Ontoml Information</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getOntomlStructure <em>Ontoml Structure</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getSupportedVep <em>Supported Vep</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.HEADERTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HEADERTypeImpl extends MinimalEObjectImpl.Container implements HEADERType {
	/**
	 * The cached value of the '{@link #getGlobalLanguage() <em>Global Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalLanguage()
	 * @generated
	 * @ordered
	 */
	protected LANGUAGEType globalLanguage;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	 * The default value of the '{@link #getDateTimeStamp() <em>Date Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTimeStamp() <em>Date Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateTimeStamp = DATE_TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<String> author;

	/**
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> organisation;

	/**
	 * The default value of the '{@link #getPreProcessorVersion() <em>Pre Processor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreProcessorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_PROCESSOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreProcessorVersion() <em>Pre Processor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreProcessorVersion()
	 * @generated
	 * @ordered
	 */
	protected String preProcessorVersion = PRE_PROCESSOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginatingSystem() <em>Originating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatingSystem() <em>Originating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingSystem()
	 * @generated
	 * @ordered
	 */
	protected String originatingSystem = ORIGINATING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorisation() <em>Authorisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorisation()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorisation() <em>Authorisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorisation()
	 * @generated
	 * @ordered
	 */
	protected String authorisation = AUTHORISATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOntomlInformation() <em>Ontoml Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntomlInformation()
	 * @generated
	 * @ordered
	 */
	protected INFORMATIONType ontomlInformation;

	/**
	 * The cached value of the '{@link #getOntomlStructure() <em>Ontoml Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntomlStructure()
	 * @generated
	 * @ordered
	 */
	protected LIBRARYIIMIDENTIFICATIONType ontomlStructure;

	/**
	 * The cached value of the '{@link #getSupportedVep() <em>Supported Vep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedVep()
	 * @generated
	 * @ordered
	 */
	protected SUPPORTEDVEPType supportedVep;

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
	protected HEADERTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getHEADERType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANGUAGEType getGlobalLanguage() {
		return globalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalLanguage(LANGUAGEType newGlobalLanguage, NotificationChain msgs) {
		LANGUAGEType oldGlobalLanguage = globalLanguage;
		globalLanguage = newGlobalLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__GLOBAL_LANGUAGE, oldGlobalLanguage, newGlobalLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalLanguage(LANGUAGEType newGlobalLanguage) {
		if (newGlobalLanguage != globalLanguage) {
			NotificationChain msgs = null;
			if (globalLanguage != null)
				msgs = ((InternalEObject)globalLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.HEADER_TYPE__GLOBAL_LANGUAGE, null, msgs);
			if (newGlobalLanguage != null)
				msgs = ((InternalEObject)newGlobalLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.HEADER_TYPE__GLOBAL_LANGUAGE, null, msgs);
			msgs = basicSetGlobalLanguage(newGlobalLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__GLOBAL_LANGUAGE, newGlobalLanguage, newGlobalLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateTimeStamp() {
		return dateTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeStamp(XMLGregorianCalendar newDateTimeStamp) {
		XMLGregorianCalendar oldDateTimeStamp = dateTimeStamp;
		dateTimeStamp = newDateTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__DATE_TIME_STAMP, oldDateTimeStamp, dateTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthor() {
		if (author == null) {
			author = new EDataTypeEList<String>(String.class, this, OntomlPackage.HEADER_TYPE__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOrganisation() {
		if (organisation == null) {
			organisation = new EDataTypeEList<String>(String.class, this, OntomlPackage.HEADER_TYPE__ORGANISATION);
		}
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreProcessorVersion() {
		return preProcessorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreProcessorVersion(String newPreProcessorVersion) {
		String oldPreProcessorVersion = preProcessorVersion;
		preProcessorVersion = newPreProcessorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__PRE_PROCESSOR_VERSION, oldPreProcessorVersion, preProcessorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginatingSystem() {
		return originatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginatingSystem(String newOriginatingSystem) {
		String oldOriginatingSystem = originatingSystem;
		originatingSystem = newOriginatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__ORIGINATING_SYSTEM, oldOriginatingSystem, originatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorisation() {
		return authorisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorisation(String newAuthorisation) {
		String oldAuthorisation = authorisation;
		authorisation = newAuthorisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__AUTHORISATION, oldAuthorisation, authorisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INFORMATIONType getOntomlInformation() {
		return ontomlInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntomlInformation(INFORMATIONType newOntomlInformation, NotificationChain msgs) {
		INFORMATIONType oldOntomlInformation = ontomlInformation;
		ontomlInformation = newOntomlInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__ONTOML_INFORMATION, oldOntomlInformation, newOntomlInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntomlInformation(INFORMATIONType newOntomlInformation) {
		if (newOntomlInformation != ontomlInformation) {
			NotificationChain msgs = null;
			if (ontomlInformation != null)
				msgs = ((InternalEObject)ontomlInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.HEADER_TYPE__ONTOML_INFORMATION, null, msgs);
			if (newOntomlInformation != null)
				msgs = ((InternalEObject)newOntomlInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.HEADER_TYPE__ONTOML_INFORMATION, null, msgs);
			msgs = basicSetOntomlInformation(newOntomlInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__ONTOML_INFORMATION, newOntomlInformation, newOntomlInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIBRARYIIMIDENTIFICATIONType getOntomlStructure() {
		return ontomlStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntomlStructure(LIBRARYIIMIDENTIFICATIONType newOntomlStructure, NotificationChain msgs) {
		LIBRARYIIMIDENTIFICATIONType oldOntomlStructure = ontomlStructure;
		ontomlStructure = newOntomlStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__ONTOML_STRUCTURE, oldOntomlStructure, newOntomlStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntomlStructure(LIBRARYIIMIDENTIFICATIONType newOntomlStructure) {
		if (newOntomlStructure != ontomlStructure) {
			NotificationChain msgs = null;
			if (ontomlStructure != null)
				msgs = ((InternalEObject)ontomlStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.HEADER_TYPE__ONTOML_STRUCTURE, null, msgs);
			if (newOntomlStructure != null)
				msgs = ((InternalEObject)newOntomlStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.HEADER_TYPE__ONTOML_STRUCTURE, null, msgs);
			msgs = basicSetOntomlStructure(newOntomlStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__ONTOML_STRUCTURE, newOntomlStructure, newOntomlStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPORTEDVEPType getSupportedVep() {
		return supportedVep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportedVep(SUPPORTEDVEPType newSupportedVep, NotificationChain msgs) {
		SUPPORTEDVEPType oldSupportedVep = supportedVep;
		supportedVep = newSupportedVep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__SUPPORTED_VEP, oldSupportedVep, newSupportedVep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedVep(SUPPORTEDVEPType newSupportedVep) {
		if (newSupportedVep != supportedVep) {
			NotificationChain msgs = null;
			if (supportedVep != null)
				msgs = ((InternalEObject)supportedVep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.HEADER_TYPE__SUPPORTED_VEP, null, msgs);
			if (newSupportedVep != null)
				msgs = ((InternalEObject)newSupportedVep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.HEADER_TYPE__SUPPORTED_VEP, null, msgs);
			msgs = basicSetSupportedVep(newSupportedVep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__SUPPORTED_VEP, newSupportedVep, newSupportedVep));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.HEADER_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.HEADER_TYPE__GLOBAL_LANGUAGE:
				return basicSetGlobalLanguage(null, msgs);
			case OntomlPackage.HEADER_TYPE__ONTOML_INFORMATION:
				return basicSetOntomlInformation(null, msgs);
			case OntomlPackage.HEADER_TYPE__ONTOML_STRUCTURE:
				return basicSetOntomlStructure(null, msgs);
			case OntomlPackage.HEADER_TYPE__SUPPORTED_VEP:
				return basicSetSupportedVep(null, msgs);
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
			case OntomlPackage.HEADER_TYPE__GLOBAL_LANGUAGE:
				return getGlobalLanguage();
			case OntomlPackage.HEADER_TYPE__DESCRIPTION:
				return getDescription();
			case OntomlPackage.HEADER_TYPE__VERSION:
				return getVersion();
			case OntomlPackage.HEADER_TYPE__NAME:
				return getName();
			case OntomlPackage.HEADER_TYPE__DATE_TIME_STAMP:
				return getDateTimeStamp();
			case OntomlPackage.HEADER_TYPE__AUTHOR:
				return getAuthor();
			case OntomlPackage.HEADER_TYPE__ORGANISATION:
				return getOrganisation();
			case OntomlPackage.HEADER_TYPE__PRE_PROCESSOR_VERSION:
				return getPreProcessorVersion();
			case OntomlPackage.HEADER_TYPE__ORIGINATING_SYSTEM:
				return getOriginatingSystem();
			case OntomlPackage.HEADER_TYPE__AUTHORISATION:
				return getAuthorisation();
			case OntomlPackage.HEADER_TYPE__ONTOML_INFORMATION:
				return getOntomlInformation();
			case OntomlPackage.HEADER_TYPE__ONTOML_STRUCTURE:
				return getOntomlStructure();
			case OntomlPackage.HEADER_TYPE__SUPPORTED_VEP:
				return getSupportedVep();
			case OntomlPackage.HEADER_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntomlPackage.HEADER_TYPE__GLOBAL_LANGUAGE:
				setGlobalLanguage((LANGUAGEType)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__NAME:
				setName((String)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__DATE_TIME_STAMP:
				setDateTimeStamp((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends String>)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__ORGANISATION:
				getOrganisation().clear();
				getOrganisation().addAll((Collection<? extends String>)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__PRE_PROCESSOR_VERSION:
				setPreProcessorVersion((String)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__ORIGINATING_SYSTEM:
				setOriginatingSystem((String)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__AUTHORISATION:
				setAuthorisation((String)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__ONTOML_INFORMATION:
				setOntomlInformation((INFORMATIONType)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__ONTOML_STRUCTURE:
				setOntomlStructure((LIBRARYIIMIDENTIFICATIONType)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__SUPPORTED_VEP:
				setSupportedVep((SUPPORTEDVEPType)newValue);
				return;
			case OntomlPackage.HEADER_TYPE__ID:
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
			case OntomlPackage.HEADER_TYPE__GLOBAL_LANGUAGE:
				setGlobalLanguage((LANGUAGEType)null);
				return;
			case OntomlPackage.HEADER_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OntomlPackage.HEADER_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case OntomlPackage.HEADER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntomlPackage.HEADER_TYPE__DATE_TIME_STAMP:
				setDateTimeStamp(DATE_TIME_STAMP_EDEFAULT);
				return;
			case OntomlPackage.HEADER_TYPE__AUTHOR:
				getAuthor().clear();
				return;
			case OntomlPackage.HEADER_TYPE__ORGANISATION:
				getOrganisation().clear();
				return;
			case OntomlPackage.HEADER_TYPE__PRE_PROCESSOR_VERSION:
				setPreProcessorVersion(PRE_PROCESSOR_VERSION_EDEFAULT);
				return;
			case OntomlPackage.HEADER_TYPE__ORIGINATING_SYSTEM:
				setOriginatingSystem(ORIGINATING_SYSTEM_EDEFAULT);
				return;
			case OntomlPackage.HEADER_TYPE__AUTHORISATION:
				setAuthorisation(AUTHORISATION_EDEFAULT);
				return;
			case OntomlPackage.HEADER_TYPE__ONTOML_INFORMATION:
				setOntomlInformation((INFORMATIONType)null);
				return;
			case OntomlPackage.HEADER_TYPE__ONTOML_STRUCTURE:
				setOntomlStructure((LIBRARYIIMIDENTIFICATIONType)null);
				return;
			case OntomlPackage.HEADER_TYPE__SUPPORTED_VEP:
				setSupportedVep((SUPPORTEDVEPType)null);
				return;
			case OntomlPackage.HEADER_TYPE__ID:
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
			case OntomlPackage.HEADER_TYPE__GLOBAL_LANGUAGE:
				return globalLanguage != null;
			case OntomlPackage.HEADER_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OntomlPackage.HEADER_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case OntomlPackage.HEADER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntomlPackage.HEADER_TYPE__DATE_TIME_STAMP:
				return DATE_TIME_STAMP_EDEFAULT == null ? dateTimeStamp != null : !DATE_TIME_STAMP_EDEFAULT.equals(dateTimeStamp);
			case OntomlPackage.HEADER_TYPE__AUTHOR:
				return author != null && !author.isEmpty();
			case OntomlPackage.HEADER_TYPE__ORGANISATION:
				return organisation != null && !organisation.isEmpty();
			case OntomlPackage.HEADER_TYPE__PRE_PROCESSOR_VERSION:
				return PRE_PROCESSOR_VERSION_EDEFAULT == null ? preProcessorVersion != null : !PRE_PROCESSOR_VERSION_EDEFAULT.equals(preProcessorVersion);
			case OntomlPackage.HEADER_TYPE__ORIGINATING_SYSTEM:
				return ORIGINATING_SYSTEM_EDEFAULT == null ? originatingSystem != null : !ORIGINATING_SYSTEM_EDEFAULT.equals(originatingSystem);
			case OntomlPackage.HEADER_TYPE__AUTHORISATION:
				return AUTHORISATION_EDEFAULT == null ? authorisation != null : !AUTHORISATION_EDEFAULT.equals(authorisation);
			case OntomlPackage.HEADER_TYPE__ONTOML_INFORMATION:
				return ontomlInformation != null;
			case OntomlPackage.HEADER_TYPE__ONTOML_STRUCTURE:
				return ontomlStructure != null;
			case OntomlPackage.HEADER_TYPE__SUPPORTED_VEP:
				return supportedVep != null;
			case OntomlPackage.HEADER_TYPE__ID:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", version: ");
		result.append(version);
		result.append(", name: ");
		result.append(name);
		result.append(", dateTimeStamp: ");
		result.append(dateTimeStamp);
		result.append(", author: ");
		result.append(author);
		result.append(", organisation: ");
		result.append(organisation);
		result.append(", preProcessorVersion: ");
		result.append(preProcessorVersion);
		result.append(", originatingSystem: ");
		result.append(originatingSystem);
		result.append(", authorisation: ");
		result.append(authorisation);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //HEADERTypeImpl
