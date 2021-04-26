/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DATATYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getNameScope <em>Name Scope</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getDateOfCurrentVersion <em>Date Of Current Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getDateOfCurrentRevision <em>Date Of Current Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#isIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getSynonymousNames <em>Synonymous Names</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getValueSpecification <em>Value Specification</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getGuid2 <em>Guid2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DATATYPETypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DATATYPETypeImpl extends MinimalEObjectImpl.Container implements DATATYPEType {
	/**
	 * The cached value of the '{@link #getNameScope() <em>Name Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameScope()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCEType nameScope;

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
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected TRANSLATIONType translation;

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
	 * The cached value of the '{@link #getPreferredName() <em>Preferred Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredName()
	 * @generated
	 * @ordered
	 */
	protected PREFERREDNAMEType preferredName;

	/**
	 * The cached value of the '{@link #getSynonymousNames() <em>Synonymous Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonymousNames()
	 * @generated
	 * @ordered
	 */
	protected SYNONYMOUSNAMEType synonymousNames;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected SHORTNAMEType shortName;

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
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected ANYTYPEType typeDefinition;

	/**
	 * The default value of the '{@link #getValueSpecification() <em>Value Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final VALUESPECIFICATIONType VALUE_SPECIFICATION_EDEFAULT = VALUESPECIFICATIONType.CODED;

	/**
	 * The cached value of the '{@link #getValueSpecification() <em>Value Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpecification()
	 * @generated
	 * @ordered
	 */
	protected VALUESPECIFICATIONType valueSpecification = VALUE_SPECIFICATION_EDEFAULT;

	/**
	 * This is true if the Value Specification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueSpecificationESet;

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
	protected DATATYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDATATYPEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType getNameScope() {
		return nameScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameScope(CLASSREFERENCEType newNameScope, NotificationChain msgs) {
		CLASSREFERENCEType oldNameScope = nameScope;
		nameScope = newNameScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__NAME_SCOPE, oldNameScope, newNameScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameScope(CLASSREFERENCEType newNameScope) {
		if (newNameScope != nameScope) {
			NotificationChain msgs = null;
			if (nameScope != null)
				msgs = ((InternalEObject)nameScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__NAME_SCOPE, null, msgs);
			if (newNameScope != null)
				msgs = ((InternalEObject)newNameScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__NAME_SCOPE, null, msgs);
			msgs = basicSetNameScope(newNameScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__NAME_SCOPE, newNameScope, newNameScope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__DATE_OF_ORIGINAL_DEFINITION, oldDateOfOriginalDefinition, dateOfOriginalDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_VERSION, oldDateOfCurrentVersion, dateOfCurrentVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_REVISION, oldDateOfCurrentRevision, dateOfCurrentRevision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRANSLATIONType getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(TRANSLATIONType newTranslation, NotificationChain msgs) {
		TRANSLATIONType oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__TRANSLATION, oldTranslation, newTranslation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslation(TRANSLATIONType newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__TRANSLATION, newTranslation, newTranslation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__SOURCE_LANGUAGE, oldSourceLanguage, newSourceLanguage);
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
				msgs = ((InternalEObject)sourceLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__SOURCE_LANGUAGE, null, msgs);
			if (newSourceLanguage != null)
				msgs = ((InternalEObject)newSourceLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__SOURCE_LANGUAGE, null, msgs);
			msgs = basicSetSourceLanguage(newSourceLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__SOURCE_LANGUAGE, newSourceLanguage, newSourceLanguage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED, oldIsDeprecated, isDeprecated, !oldIsDeprecatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED, oldIsDeprecated, IS_DEPRECATED_EDEFAULT, oldIsDeprecatedESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION, oldIsDeprecatedInterpretation, newIsDeprecatedInterpretation);
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
				msgs = ((InternalEObject)isDeprecatedInterpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			if (newIsDeprecatedInterpretation != null)
				msgs = ((InternalEObject)newIsDeprecatedInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			msgs = basicSetIsDeprecatedInterpretation(newIsDeprecatedInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION, newIsDeprecatedInterpretation, newIsDeprecatedInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREFERREDNAMEType getPreferredName() {
		return preferredName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredName(PREFERREDNAMEType newPreferredName, NotificationChain msgs) {
		PREFERREDNAMEType oldPreferredName = preferredName;
		preferredName = newPreferredName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__PREFERRED_NAME, oldPreferredName, newPreferredName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredName(PREFERREDNAMEType newPreferredName) {
		if (newPreferredName != preferredName) {
			NotificationChain msgs = null;
			if (preferredName != null)
				msgs = ((InternalEObject)preferredName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__PREFERRED_NAME, null, msgs);
			if (newPreferredName != null)
				msgs = ((InternalEObject)newPreferredName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__PREFERRED_NAME, null, msgs);
			msgs = basicSetPreferredName(newPreferredName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__PREFERRED_NAME, newPreferredName, newPreferredName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSNAMEType getSynonymousNames() {
		return synonymousNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynonymousNames(SYNONYMOUSNAMEType newSynonymousNames, NotificationChain msgs) {
		SYNONYMOUSNAMEType oldSynonymousNames = synonymousNames;
		synonymousNames = newSynonymousNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__SYNONYMOUS_NAMES, oldSynonymousNames, newSynonymousNames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynonymousNames(SYNONYMOUSNAMEType newSynonymousNames) {
		if (newSynonymousNames != synonymousNames) {
			NotificationChain msgs = null;
			if (synonymousNames != null)
				msgs = ((InternalEObject)synonymousNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__SYNONYMOUS_NAMES, null, msgs);
			if (newSynonymousNames != null)
				msgs = ((InternalEObject)newSynonymousNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__SYNONYMOUS_NAMES, null, msgs);
			msgs = basicSetSynonymousNames(newSynonymousNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__SYNONYMOUS_NAMES, newSynonymousNames, newSynonymousNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SHORTNAMEType getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortName(SHORTNAMEType newShortName, NotificationChain msgs) {
		SHORTNAMEType oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__SHORT_NAME, oldShortName, newShortName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(SHORTNAMEType newShortName) {
		if (newShortName != shortName) {
			NotificationChain msgs = null;
			if (shortName != null)
				msgs = ((InternalEObject)shortName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__SHORT_NAME, null, msgs);
			if (newShortName != null)
				msgs = ((InternalEObject)newShortName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__SHORT_NAME, null, msgs);
			msgs = basicSetShortName(newShortName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__SHORT_NAME, newShortName, newShortName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__ICON, oldIcon, newIcon);
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
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANYTYPEType getTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefinition(ANYTYPEType newTypeDefinition, NotificationChain msgs) {
		ANYTYPEType oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__TYPE_DEFINITION, oldTypeDefinition, newTypeDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(ANYTYPEType newTypeDefinition) {
		if (newTypeDefinition != typeDefinition) {
			NotificationChain msgs = null;
			if (typeDefinition != null)
				msgs = ((InternalEObject)typeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__TYPE_DEFINITION, null, msgs);
			if (newTypeDefinition != null)
				msgs = ((InternalEObject)newTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DATATYPE_TYPE__TYPE_DEFINITION, null, msgs);
			msgs = basicSetTypeDefinition(newTypeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__TYPE_DEFINITION, newTypeDefinition, newTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESPECIFICATIONType getValueSpecification() {
		return valueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSpecification(VALUESPECIFICATIONType newValueSpecification) {
		VALUESPECIFICATIONType oldValueSpecification = valueSpecification;
		valueSpecification = newValueSpecification == null ? VALUE_SPECIFICATION_EDEFAULT : newValueSpecification;
		boolean oldValueSpecificationESet = valueSpecificationESet;
		valueSpecificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__VALUE_SPECIFICATION, oldValueSpecification, valueSpecification, !oldValueSpecificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueSpecification() {
		VALUESPECIFICATIONType oldValueSpecification = valueSpecification;
		boolean oldValueSpecificationESet = valueSpecificationESet;
		valueSpecification = VALUE_SPECIFICATION_EDEFAULT;
		valueSpecificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.DATATYPE_TYPE__VALUE_SPECIFICATION, oldValueSpecification, VALUE_SPECIFICATION_EDEFAULT, oldValueSpecificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueSpecification() {
		return valueSpecificationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__GUID, oldGuid, guid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__GUID2, oldGuid2, guid2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DATATYPE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.DATATYPE_TYPE__NAME_SCOPE:
				return basicSetNameScope(null, msgs);
			case OntomlPackage.DATATYPE_TYPE__TRANSLATION:
				return basicSetTranslation(null, msgs);
			case OntomlPackage.DATATYPE_TYPE__SOURCE_LANGUAGE:
				return basicSetSourceLanguage(null, msgs);
			case OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION:
				return basicSetIsDeprecatedInterpretation(null, msgs);
			case OntomlPackage.DATATYPE_TYPE__PREFERRED_NAME:
				return basicSetPreferredName(null, msgs);
			case OntomlPackage.DATATYPE_TYPE__SYNONYMOUS_NAMES:
				return basicSetSynonymousNames(null, msgs);
			case OntomlPackage.DATATYPE_TYPE__SHORT_NAME:
				return basicSetShortName(null, msgs);
			case OntomlPackage.DATATYPE_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case OntomlPackage.DATATYPE_TYPE__TYPE_DEFINITION:
				return basicSetTypeDefinition(null, msgs);
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
			case OntomlPackage.DATATYPE_TYPE__NAME_SCOPE:
				return getNameScope();
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return getDateOfOriginalDefinition();
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_VERSION:
				return getDateOfCurrentVersion();
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_REVISION:
				return getDateOfCurrentRevision();
			case OntomlPackage.DATATYPE_TYPE__REVISION:
				return getRevision();
			case OntomlPackage.DATATYPE_TYPE__STATUS:
				return getStatus();
			case OntomlPackage.DATATYPE_TYPE__TRANSLATION:
				return getTranslation();
			case OntomlPackage.DATATYPE_TYPE__SOURCE_LANGUAGE:
				return getSourceLanguage();
			case OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED:
				return isIsDeprecated();
			case OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION:
				return getIsDeprecatedInterpretation();
			case OntomlPackage.DATATYPE_TYPE__PREFERRED_NAME:
				return getPreferredName();
			case OntomlPackage.DATATYPE_TYPE__SYNONYMOUS_NAMES:
				return getSynonymousNames();
			case OntomlPackage.DATATYPE_TYPE__SHORT_NAME:
				return getShortName();
			case OntomlPackage.DATATYPE_TYPE__ICON:
				return getIcon();
			case OntomlPackage.DATATYPE_TYPE__TYPE_DEFINITION:
				return getTypeDefinition();
			case OntomlPackage.DATATYPE_TYPE__VALUE_SPECIFICATION:
				return getValueSpecification();
			case OntomlPackage.DATATYPE_TYPE__GUID:
				return getGuid();
			case OntomlPackage.DATATYPE_TYPE__GUID2:
				return getGuid2();
			case OntomlPackage.DATATYPE_TYPE__ID:
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
			case OntomlPackage.DATATYPE_TYPE__NAME_SCOPE:
				setNameScope((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__REVISION:
				setRevision((String)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__STATUS:
				setStatus((String)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__TRANSLATION:
				setTranslation((TRANSLATIONType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGEType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAMEType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAMEType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__SHORT_NAME:
				setShortName((SHORTNAMEType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__ICON:
				setIcon((GRAPHICSType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__TYPE_DEFINITION:
				setTypeDefinition((ANYTYPEType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__VALUE_SPECIFICATION:
				setValueSpecification((VALUESPECIFICATIONType)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__GUID:
				setGuid((String)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__GUID2:
				setGuid2((String)newValue);
				return;
			case OntomlPackage.DATATYPE_TYPE__ID:
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
			case OntomlPackage.DATATYPE_TYPE__NAME_SCOPE:
				setNameScope((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition(DATE_OF_ORIGINAL_DEFINITION_EDEFAULT);
				return;
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion(DATE_OF_CURRENT_VERSION_EDEFAULT);
				return;
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision(DATE_OF_CURRENT_REVISION_EDEFAULT);
				return;
			case OntomlPackage.DATATYPE_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OntomlPackage.DATATYPE_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OntomlPackage.DATATYPE_TYPE__TRANSLATION:
				setTranslation((TRANSLATIONType)null);
				return;
			case OntomlPackage.DATATYPE_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGEType)null);
				return;
			case OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED:
				unsetIsDeprecated();
				return;
			case OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)null);
				return;
			case OntomlPackage.DATATYPE_TYPE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAMEType)null);
				return;
			case OntomlPackage.DATATYPE_TYPE__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAMEType)null);
				return;
			case OntomlPackage.DATATYPE_TYPE__SHORT_NAME:
				setShortName((SHORTNAMEType)null);
				return;
			case OntomlPackage.DATATYPE_TYPE__ICON:
				setIcon((GRAPHICSType)null);
				return;
			case OntomlPackage.DATATYPE_TYPE__TYPE_DEFINITION:
				setTypeDefinition((ANYTYPEType)null);
				return;
			case OntomlPackage.DATATYPE_TYPE__VALUE_SPECIFICATION:
				unsetValueSpecification();
				return;
			case OntomlPackage.DATATYPE_TYPE__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case OntomlPackage.DATATYPE_TYPE__GUID2:
				setGuid2(GUID2_EDEFAULT);
				return;
			case OntomlPackage.DATATYPE_TYPE__ID:
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
			case OntomlPackage.DATATYPE_TYPE__NAME_SCOPE:
				return nameScope != null;
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return DATE_OF_ORIGINAL_DEFINITION_EDEFAULT == null ? dateOfOriginalDefinition != null : !DATE_OF_ORIGINAL_DEFINITION_EDEFAULT.equals(dateOfOriginalDefinition);
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_VERSION:
				return DATE_OF_CURRENT_VERSION_EDEFAULT == null ? dateOfCurrentVersion != null : !DATE_OF_CURRENT_VERSION_EDEFAULT.equals(dateOfCurrentVersion);
			case OntomlPackage.DATATYPE_TYPE__DATE_OF_CURRENT_REVISION:
				return DATE_OF_CURRENT_REVISION_EDEFAULT == null ? dateOfCurrentRevision != null : !DATE_OF_CURRENT_REVISION_EDEFAULT.equals(dateOfCurrentRevision);
			case OntomlPackage.DATATYPE_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case OntomlPackage.DATATYPE_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OntomlPackage.DATATYPE_TYPE__TRANSLATION:
				return translation != null;
			case OntomlPackage.DATATYPE_TYPE__SOURCE_LANGUAGE:
				return sourceLanguage != null;
			case OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED:
				return isSetIsDeprecated();
			case OntomlPackage.DATATYPE_TYPE__IS_DEPRECATED_INTERPRETATION:
				return isDeprecatedInterpretation != null;
			case OntomlPackage.DATATYPE_TYPE__PREFERRED_NAME:
				return preferredName != null;
			case OntomlPackage.DATATYPE_TYPE__SYNONYMOUS_NAMES:
				return synonymousNames != null;
			case OntomlPackage.DATATYPE_TYPE__SHORT_NAME:
				return shortName != null;
			case OntomlPackage.DATATYPE_TYPE__ICON:
				return icon != null;
			case OntomlPackage.DATATYPE_TYPE__TYPE_DEFINITION:
				return typeDefinition != null;
			case OntomlPackage.DATATYPE_TYPE__VALUE_SPECIFICATION:
				return isSetValueSpecification();
			case OntomlPackage.DATATYPE_TYPE__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case OntomlPackage.DATATYPE_TYPE__GUID2:
				return GUID2_EDEFAULT == null ? guid2 != null : !GUID2_EDEFAULT.equals(guid2);
			case OntomlPackage.DATATYPE_TYPE__ID:
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
		result.append(", valueSpecification: ");
		if (valueSpecificationESet) result.append(valueSpecification); else result.append("<unset>");
		result.append(", guid: ");
		result.append(guid);
		result.append(", guid2: ");
		result.append(guid2);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DATATYPETypeImpl
