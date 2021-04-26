/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType;
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
 * An implementation of the model object '<em><b>REUSABLENAME Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getDateOfCurrentVersion <em>Date Of Current Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getDateOfCurrentRevision <em>Date Of Current Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#isIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getGuid2 <em>Guid2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REUSABLENAMETypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class REUSABLENAMETypeImpl extends MinimalEObjectImpl.Container implements REUSABLENAMEType {
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
	 * The cached value of the '{@link #getSourceLanguage() <em>Source Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLanguage()
	 * @generated
	 * @ordered
	 */
	protected LANGUAGEType sourceLanguage;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected KEYWORDLABELType name;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICSType icon;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected GENERALTEXTType note;

	/**
	 * The default value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected static final String GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected String guid = GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuid2() <em>Guid2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid2()
	 * @generated
	 * @ordered
	 */
	protected static final String GUID2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuid2() <em>Guid2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid2()
	 * @generated
	 * @ordered
	 */
	protected String guid2 = GUID2_EDEFAULT;

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
	protected REUSABLENAMETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getREUSABLENAMEType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__DATE_OF_ORIGINAL_DEFINITION, oldDateOfOriginalDefinition, dateOfOriginalDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_VERSION, oldDateOfCurrentVersion, dateOfCurrentVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_REVISION, oldDateOfCurrentRevision, dateOfCurrentRevision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANGUAGEType getSourceLanguage() {
		return sourceLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceLanguage(LANGUAGEType newSourceLanguage, NotificationChain msgs) {
		LANGUAGEType oldSourceLanguage = sourceLanguage;
		sourceLanguage = newSourceLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__SOURCE_LANGUAGE, oldSourceLanguage, newSourceLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLanguage(LANGUAGEType newSourceLanguage) {
		if (newSourceLanguage != sourceLanguage) {
			NotificationChain msgs = null;
			if (sourceLanguage != null)
				msgs = ((InternalEObject)sourceLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__SOURCE_LANGUAGE, null, msgs);
			if (newSourceLanguage != null)
				msgs = ((InternalEObject)newSourceLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__SOURCE_LANGUAGE, null, msgs);
			msgs = basicSetSourceLanguage(newSourceLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__SOURCE_LANGUAGE, newSourceLanguage, newSourceLanguage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED, oldIsDeprecated, isDeprecated, !oldIsDeprecatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED, oldIsDeprecated, IS_DEPRECATED_EDEFAULT, oldIsDeprecatedESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION, oldIsDeprecatedInterpretation, newIsDeprecatedInterpretation);
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
				msgs = ((InternalEObject)isDeprecatedInterpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			if (newIsDeprecatedInterpretation != null)
				msgs = ((InternalEObject)newIsDeprecatedInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			msgs = basicSetIsDeprecatedInterpretation(newIsDeprecatedInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION, newIsDeprecatedInterpretation, newIsDeprecatedInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEYWORDLABELType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(KEYWORDLABELType newName, NotificationChain msgs) {
		KEYWORDLABELType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(KEYWORDLABELType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICSType getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(GRAPHICSType newIcon, NotificationChain msgs) {
		GRAPHICSType oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(GRAPHICSType newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GENERALTEXTType getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(GENERALTEXTType newNote, NotificationChain msgs) {
		GENERALTEXTType oldNote = note;
		note = newNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__NOTE, oldNote, newNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(GENERALTEXTType newNote) {
		if (newNote != note) {
			NotificationChain msgs = null;
			if (note != null)
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REUSABLENAME_TYPE__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuid(String newGuid) {
		String oldGuid = guid;
		guid = newGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__GUID, oldGuid, guid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuid2() {
		return guid2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuid2(String newGuid2) {
		String oldGuid2 = guid2;
		guid2 = newGuid2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__GUID2, oldGuid2, guid2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REUSABLENAME_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.REUSABLENAME_TYPE__SOURCE_LANGUAGE:
				return basicSetSourceLanguage(null, msgs);
			case OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION:
				return basicSetIsDeprecatedInterpretation(null, msgs);
			case OntomlPackage.REUSABLENAME_TYPE__NAME:
				return basicSetName(null, msgs);
			case OntomlPackage.REUSABLENAME_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case OntomlPackage.REUSABLENAME_TYPE__NOTE:
				return basicSetNote(null, msgs);
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
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return getDateOfOriginalDefinition();
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_VERSION:
				return getDateOfCurrentVersion();
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_REVISION:
				return getDateOfCurrentRevision();
			case OntomlPackage.REUSABLENAME_TYPE__REVISION:
				return getRevision();
			case OntomlPackage.REUSABLENAME_TYPE__STATUS:
				return getStatus();
			case OntomlPackage.REUSABLENAME_TYPE__SOURCE_LANGUAGE:
				return getSourceLanguage();
			case OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED:
				return isIsDeprecated();
			case OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION:
				return getIsDeprecatedInterpretation();
			case OntomlPackage.REUSABLENAME_TYPE__NAME:
				return getName();
			case OntomlPackage.REUSABLENAME_TYPE__ICON:
				return getIcon();
			case OntomlPackage.REUSABLENAME_TYPE__NOTE:
				return getNote();
			case OntomlPackage.REUSABLENAME_TYPE__GUID:
				return getGuid();
			case OntomlPackage.REUSABLENAME_TYPE__GUID2:
				return getGuid2();
			case OntomlPackage.REUSABLENAME_TYPE__ID:
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
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__REVISION:
				setRevision((String)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__STATUS:
				setStatus((String)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGEType)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__NAME:
				setName((KEYWORDLABELType)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__ICON:
				setIcon((GRAPHICSType)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__NOTE:
				setNote((GENERALTEXTType)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__GUID:
				setGuid((String)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__GUID2:
				setGuid2((String)newValue);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__ID:
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
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition(DATE_OF_ORIGINAL_DEFINITION_EDEFAULT);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion(DATE_OF_CURRENT_VERSION_EDEFAULT);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision(DATE_OF_CURRENT_REVISION_EDEFAULT);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGEType)null);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED:
				unsetIsDeprecated();
				return;
			case OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)null);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__NAME:
				setName((KEYWORDLABELType)null);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__ICON:
				setIcon((GRAPHICSType)null);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__NOTE:
				setNote((GENERALTEXTType)null);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__GUID2:
				setGuid2(GUID2_EDEFAULT);
				return;
			case OntomlPackage.REUSABLENAME_TYPE__ID:
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
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return DATE_OF_ORIGINAL_DEFINITION_EDEFAULT == null ? dateOfOriginalDefinition != null : !DATE_OF_ORIGINAL_DEFINITION_EDEFAULT.equals(dateOfOriginalDefinition);
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_VERSION:
				return DATE_OF_CURRENT_VERSION_EDEFAULT == null ? dateOfCurrentVersion != null : !DATE_OF_CURRENT_VERSION_EDEFAULT.equals(dateOfCurrentVersion);
			case OntomlPackage.REUSABLENAME_TYPE__DATE_OF_CURRENT_REVISION:
				return DATE_OF_CURRENT_REVISION_EDEFAULT == null ? dateOfCurrentRevision != null : !DATE_OF_CURRENT_REVISION_EDEFAULT.equals(dateOfCurrentRevision);
			case OntomlPackage.REUSABLENAME_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case OntomlPackage.REUSABLENAME_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OntomlPackage.REUSABLENAME_TYPE__SOURCE_LANGUAGE:
				return sourceLanguage != null;
			case OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED:
				return isSetIsDeprecated();
			case OntomlPackage.REUSABLENAME_TYPE__IS_DEPRECATED_INTERPRETATION:
				return isDeprecatedInterpretation != null;
			case OntomlPackage.REUSABLENAME_TYPE__NAME:
				return name != null;
			case OntomlPackage.REUSABLENAME_TYPE__ICON:
				return icon != null;
			case OntomlPackage.REUSABLENAME_TYPE__NOTE:
				return note != null;
			case OntomlPackage.REUSABLENAME_TYPE__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case OntomlPackage.REUSABLENAME_TYPE__GUID2:
				return GUID2_EDEFAULT == null ? guid2 != null : !GUID2_EDEFAULT.equals(guid2);
			case OntomlPackage.REUSABLENAME_TYPE__ID:
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
		result.append(", guid: ");
		result.append(guid);
		result.append(", guid2: ");
		result.append(guid2);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //REUSABLENAMETypeImpl
