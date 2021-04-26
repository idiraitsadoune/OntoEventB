/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SOURCEDOCUMENTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSSYMBOLSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMREFERENCESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROPERTY Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getNameScope <em>Name Scope</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getDateOfCurrentVersion <em>Date Of Current Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getDateOfCurrentRevision <em>Date Of Current Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#isIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getSynonymousNames <em>Synonymous Names</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getSourceDocOfDefinition <em>Source Doc Of Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getPreferredSymbol <em>Preferred Symbol</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getSynonymousSymbols <em>Synonymous Symbols</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getDetClassification <em>Det Classification</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getSynonymReferences <em>Synonym References</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#isSuggestedValueList <em>Suggested Value List</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getFreeRelations <em>Free Relations</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getGuid2 <em>Guid2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROPERTYTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PROPERTYTypeImpl extends MinimalEObjectImpl.Container implements PROPERTYType {
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
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected TEXTType definition;

	/**
	 * The cached value of the '{@link #getSourceDocOfDefinition() <em>Source Doc Of Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocOfDefinition()
	 * @generated
	 * @ordered
	 */
	protected SOURCEDOCUMENTType sourceDocOfDefinition;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected TEXTType note;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected TEXTType remark;

	/**
	 * The cached value of the '{@link #getPreferredSymbol() <em>Preferred Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredSymbol()
	 * @generated
	 * @ordered
	 */
	protected MATHEMATICALSTRINGType preferredSymbol;

	/**
	 * The cached value of the '{@link #getSynonymousSymbols() <em>Synonymous Symbols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonymousSymbols()
	 * @generated
	 * @ordered
	 */
	protected SYNONYMOUSSYMBOLSType synonymousSymbols;

	/**
	 * The cached value of the '{@link #getFigure() <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICSType figure;

	/**
	 * The default value of the '{@link #getDetClassification() <em>Det Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String DET_CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetClassification() <em>Det Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetClassification()
	 * @generated
	 * @ordered
	 */
	protected String detClassification = DET_CLASSIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected ANYTYPEType domain;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected MATHEMATICALSTRINGType formula;

	/**
	 * The cached value of the '{@link #getSynonymReferences() <em>Synonym References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonymReferences()
	 * @generated
	 * @ordered
	 */
	protected SYNONYMREFERENCESType synonymReferences;

	/**
	 * The default value of the '{@link #isSuggestedValueList() <em>Suggested Value List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuggestedValueList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUGGESTED_VALUE_LIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuggestedValueList() <em>Suggested Value List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuggestedValueList()
	 * @generated
	 * @ordered
	 */
	protected boolean suggestedValueList = SUGGESTED_VALUE_LIST_EDEFAULT;

	/**
	 * This is true if the Suggested Value List attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suggestedValueListESet;

	/**
	 * The cached value of the '{@link #getFreeRelations() <em>Free Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeRelations()
	 * @generated
	 * @ordered
	 */
	protected FREERELATIONSType freeRelations;

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
	protected PROPERTYTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getPROPERTYType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__NAME_SCOPE, oldNameScope, newNameScope);
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
				msgs = ((InternalEObject)nameScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__NAME_SCOPE, null, msgs);
			if (newNameScope != null)
				msgs = ((InternalEObject)newNameScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__NAME_SCOPE, null, msgs);
			msgs = basicSetNameScope(newNameScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__NAME_SCOPE, newNameScope, newNameScope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION, oldDateOfOriginalDefinition, dateOfOriginalDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_VERSION, oldDateOfCurrentVersion, dateOfCurrentVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_REVISION, oldDateOfCurrentRevision, dateOfCurrentRevision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__STATUS, oldStatus, status));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__TRANSLATION, oldTranslation, newTranslation);
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
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__TRANSLATION, newTranslation, newTranslation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SOURCE_LANGUAGE, oldSourceLanguage, newSourceLanguage);
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
				msgs = ((InternalEObject)sourceLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SOURCE_LANGUAGE, null, msgs);
			if (newSourceLanguage != null)
				msgs = ((InternalEObject)newSourceLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SOURCE_LANGUAGE, null, msgs);
			msgs = basicSetSourceLanguage(newSourceLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SOURCE_LANGUAGE, newSourceLanguage, newSourceLanguage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED, oldIsDeprecated, isDeprecated, !oldIsDeprecatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED, oldIsDeprecated, IS_DEPRECATED_EDEFAULT, oldIsDeprecatedESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION, oldIsDeprecatedInterpretation, newIsDeprecatedInterpretation);
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
				msgs = ((InternalEObject)isDeprecatedInterpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			if (newIsDeprecatedInterpretation != null)
				msgs = ((InternalEObject)newIsDeprecatedInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			msgs = basicSetIsDeprecatedInterpretation(newIsDeprecatedInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION, newIsDeprecatedInterpretation, newIsDeprecatedInterpretation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__PREFERRED_NAME, oldPreferredName, newPreferredName);
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
				msgs = ((InternalEObject)preferredName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__PREFERRED_NAME, null, msgs);
			if (newPreferredName != null)
				msgs = ((InternalEObject)newPreferredName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__PREFERRED_NAME, null, msgs);
			msgs = basicSetPreferredName(newPreferredName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__PREFERRED_NAME, newPreferredName, newPreferredName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_NAMES, oldSynonymousNames, newSynonymousNames);
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
				msgs = ((InternalEObject)synonymousNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_NAMES, null, msgs);
			if (newSynonymousNames != null)
				msgs = ((InternalEObject)newSynonymousNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_NAMES, null, msgs);
			msgs = basicSetSynonymousNames(newSynonymousNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_NAMES, newSynonymousNames, newSynonymousNames));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SHORT_NAME, oldShortName, newShortName);
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
				msgs = ((InternalEObject)shortName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SHORT_NAME, null, msgs);
			if (newShortName != null)
				msgs = ((InternalEObject)newShortName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SHORT_NAME, null, msgs);
			msgs = basicSetShortName(newShortName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SHORT_NAME, newShortName, newShortName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__ICON, oldIcon, newIcon);
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
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTType getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(TEXTType newDefinition, NotificationChain msgs) {
		TEXTType oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(TEXTType newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOURCEDOCUMENTType getSourceDocOfDefinition() {
		return sourceDocOfDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDocOfDefinition(SOURCEDOCUMENTType newSourceDocOfDefinition, NotificationChain msgs) {
		SOURCEDOCUMENTType oldSourceDocOfDefinition = sourceDocOfDefinition;
		sourceDocOfDefinition = newSourceDocOfDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION, oldSourceDocOfDefinition, newSourceDocOfDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocOfDefinition(SOURCEDOCUMENTType newSourceDocOfDefinition) {
		if (newSourceDocOfDefinition != sourceDocOfDefinition) {
			NotificationChain msgs = null;
			if (sourceDocOfDefinition != null)
				msgs = ((InternalEObject)sourceDocOfDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION, null, msgs);
			if (newSourceDocOfDefinition != null)
				msgs = ((InternalEObject)newSourceDocOfDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION, null, msgs);
			msgs = basicSetSourceDocOfDefinition(newSourceDocOfDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION, newSourceDocOfDefinition, newSourceDocOfDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTType getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(TEXTType newNote, NotificationChain msgs) {
		TEXTType oldNote = note;
		note = newNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__NOTE, oldNote, newNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(TEXTType newNote) {
		if (newNote != note) {
			NotificationChain msgs = null;
			if (note != null)
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTType getRemark() {
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemark(TEXTType newRemark, NotificationChain msgs) {
		TEXTType oldRemark = remark;
		remark = newRemark;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__REMARK, oldRemark, newRemark);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemark(TEXTType newRemark) {
		if (newRemark != remark) {
			NotificationChain msgs = null;
			if (remark != null)
				msgs = ((InternalEObject)remark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__REMARK, null, msgs);
			if (newRemark != null)
				msgs = ((InternalEObject)newRemark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__REMARK, null, msgs);
			msgs = basicSetRemark(newRemark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__REMARK, newRemark, newRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MATHEMATICALSTRINGType getPreferredSymbol() {
		return preferredSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredSymbol(MATHEMATICALSTRINGType newPreferredSymbol, NotificationChain msgs) {
		MATHEMATICALSTRINGType oldPreferredSymbol = preferredSymbol;
		preferredSymbol = newPreferredSymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__PREFERRED_SYMBOL, oldPreferredSymbol, newPreferredSymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredSymbol(MATHEMATICALSTRINGType newPreferredSymbol) {
		if (newPreferredSymbol != preferredSymbol) {
			NotificationChain msgs = null;
			if (preferredSymbol != null)
				msgs = ((InternalEObject)preferredSymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__PREFERRED_SYMBOL, null, msgs);
			if (newPreferredSymbol != null)
				msgs = ((InternalEObject)newPreferredSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__PREFERRED_SYMBOL, null, msgs);
			msgs = basicSetPreferredSymbol(newPreferredSymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__PREFERRED_SYMBOL, newPreferredSymbol, newPreferredSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSSYMBOLSType getSynonymousSymbols() {
		return synonymousSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynonymousSymbols(SYNONYMOUSSYMBOLSType newSynonymousSymbols, NotificationChain msgs) {
		SYNONYMOUSSYMBOLSType oldSynonymousSymbols = synonymousSymbols;
		synonymousSymbols = newSynonymousSymbols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_SYMBOLS, oldSynonymousSymbols, newSynonymousSymbols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynonymousSymbols(SYNONYMOUSSYMBOLSType newSynonymousSymbols) {
		if (newSynonymousSymbols != synonymousSymbols) {
			NotificationChain msgs = null;
			if (synonymousSymbols != null)
				msgs = ((InternalEObject)synonymousSymbols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_SYMBOLS, null, msgs);
			if (newSynonymousSymbols != null)
				msgs = ((InternalEObject)newSynonymousSymbols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_SYMBOLS, null, msgs);
			msgs = basicSetSynonymousSymbols(newSynonymousSymbols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_SYMBOLS, newSynonymousSymbols, newSynonymousSymbols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICSType getFigure() {
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigure(GRAPHICSType newFigure, NotificationChain msgs) {
		GRAPHICSType oldFigure = figure;
		figure = newFigure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__FIGURE, oldFigure, newFigure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigure(GRAPHICSType newFigure) {
		if (newFigure != figure) {
			NotificationChain msgs = null;
			if (figure != null)
				msgs = ((InternalEObject)figure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__FIGURE, null, msgs);
			if (newFigure != null)
				msgs = ((InternalEObject)newFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__FIGURE, null, msgs);
			msgs = basicSetFigure(newFigure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__FIGURE, newFigure, newFigure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetClassification() {
		return detClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetClassification(String newDetClassification) {
		String oldDetClassification = detClassification;
		detClassification = newDetClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__DET_CLASSIFICATION, oldDetClassification, detClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANYTYPEType getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(ANYTYPEType newDomain, NotificationChain msgs) {
		ANYTYPEType oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(ANYTYPEType newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MATHEMATICALSTRINGType getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula(MATHEMATICALSTRINGType newFormula, NotificationChain msgs) {
		MATHEMATICALSTRINGType oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__FORMULA, oldFormula, newFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(MATHEMATICALSTRINGType newFormula) {
		if (newFormula != formula) {
			NotificationChain msgs = null;
			if (formula != null)
				msgs = ((InternalEObject)formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__FORMULA, null, msgs);
			if (newFormula != null)
				msgs = ((InternalEObject)newFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__FORMULA, null, msgs);
			msgs = basicSetFormula(newFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__FORMULA, newFormula, newFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMREFERENCESType getSynonymReferences() {
		return synonymReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynonymReferences(SYNONYMREFERENCESType newSynonymReferences, NotificationChain msgs) {
		SYNONYMREFERENCESType oldSynonymReferences = synonymReferences;
		synonymReferences = newSynonymReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SYNONYM_REFERENCES, oldSynonymReferences, newSynonymReferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynonymReferences(SYNONYMREFERENCESType newSynonymReferences) {
		if (newSynonymReferences != synonymReferences) {
			NotificationChain msgs = null;
			if (synonymReferences != null)
				msgs = ((InternalEObject)synonymReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SYNONYM_REFERENCES, null, msgs);
			if (newSynonymReferences != null)
				msgs = ((InternalEObject)newSynonymReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__SYNONYM_REFERENCES, null, msgs);
			msgs = basicSetSynonymReferences(newSynonymReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SYNONYM_REFERENCES, newSynonymReferences, newSynonymReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuggestedValueList() {
		return suggestedValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuggestedValueList(boolean newSuggestedValueList) {
		boolean oldSuggestedValueList = suggestedValueList;
		suggestedValueList = newSuggestedValueList;
		boolean oldSuggestedValueListESet = suggestedValueListESet;
		suggestedValueListESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__SUGGESTED_VALUE_LIST, oldSuggestedValueList, suggestedValueList, !oldSuggestedValueListESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuggestedValueList() {
		boolean oldSuggestedValueList = suggestedValueList;
		boolean oldSuggestedValueListESet = suggestedValueListESet;
		suggestedValueList = SUGGESTED_VALUE_LIST_EDEFAULT;
		suggestedValueListESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.PROPERTY_TYPE__SUGGESTED_VALUE_LIST, oldSuggestedValueList, SUGGESTED_VALUE_LIST_EDEFAULT, oldSuggestedValueListESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuggestedValueList() {
		return suggestedValueListESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FREERELATIONSType getFreeRelations() {
		return freeRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreeRelations(FREERELATIONSType newFreeRelations, NotificationChain msgs) {
		FREERELATIONSType oldFreeRelations = freeRelations;
		freeRelations = newFreeRelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__FREE_RELATIONS, oldFreeRelations, newFreeRelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeRelations(FREERELATIONSType newFreeRelations) {
		if (newFreeRelations != freeRelations) {
			NotificationChain msgs = null;
			if (freeRelations != null)
				msgs = ((InternalEObject)freeRelations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__FREE_RELATIONS, null, msgs);
			if (newFreeRelations != null)
				msgs = ((InternalEObject)newFreeRelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROPERTY_TYPE__FREE_RELATIONS, null, msgs);
			msgs = basicSetFreeRelations(newFreeRelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__FREE_RELATIONS, newFreeRelations, newFreeRelations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__GUID, oldGuid, guid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__GUID2, oldGuid2, guid2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROPERTY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.PROPERTY_TYPE__NAME_SCOPE:
				return basicSetNameScope(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__TRANSLATION:
				return basicSetTranslation(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__SOURCE_LANGUAGE:
				return basicSetSourceLanguage(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION:
				return basicSetIsDeprecatedInterpretation(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_NAME:
				return basicSetPreferredName(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_NAMES:
				return basicSetSynonymousNames(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__SHORT_NAME:
				return basicSetShortName(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION:
				return basicSetSourceDocOfDefinition(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__NOTE:
				return basicSetNote(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__REMARK:
				return basicSetRemark(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_SYMBOL:
				return basicSetPreferredSymbol(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_SYMBOLS:
				return basicSetSynonymousSymbols(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__FIGURE:
				return basicSetFigure(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__DOMAIN:
				return basicSetDomain(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__FORMULA:
				return basicSetFormula(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__SYNONYM_REFERENCES:
				return basicSetSynonymReferences(null, msgs);
			case OntomlPackage.PROPERTY_TYPE__FREE_RELATIONS:
				return basicSetFreeRelations(null, msgs);
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
			case OntomlPackage.PROPERTY_TYPE__NAME_SCOPE:
				return getNameScope();
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return getDateOfOriginalDefinition();
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_VERSION:
				return getDateOfCurrentVersion();
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_REVISION:
				return getDateOfCurrentRevision();
			case OntomlPackage.PROPERTY_TYPE__REVISION:
				return getRevision();
			case OntomlPackage.PROPERTY_TYPE__STATUS:
				return getStatus();
			case OntomlPackage.PROPERTY_TYPE__TRANSLATION:
				return getTranslation();
			case OntomlPackage.PROPERTY_TYPE__SOURCE_LANGUAGE:
				return getSourceLanguage();
			case OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED:
				return isIsDeprecated();
			case OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION:
				return getIsDeprecatedInterpretation();
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_NAME:
				return getPreferredName();
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_NAMES:
				return getSynonymousNames();
			case OntomlPackage.PROPERTY_TYPE__SHORT_NAME:
				return getShortName();
			case OntomlPackage.PROPERTY_TYPE__ICON:
				return getIcon();
			case OntomlPackage.PROPERTY_TYPE__DEFINITION:
				return getDefinition();
			case OntomlPackage.PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION:
				return getSourceDocOfDefinition();
			case OntomlPackage.PROPERTY_TYPE__NOTE:
				return getNote();
			case OntomlPackage.PROPERTY_TYPE__REMARK:
				return getRemark();
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_SYMBOL:
				return getPreferredSymbol();
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_SYMBOLS:
				return getSynonymousSymbols();
			case OntomlPackage.PROPERTY_TYPE__FIGURE:
				return getFigure();
			case OntomlPackage.PROPERTY_TYPE__DET_CLASSIFICATION:
				return getDetClassification();
			case OntomlPackage.PROPERTY_TYPE__DOMAIN:
				return getDomain();
			case OntomlPackage.PROPERTY_TYPE__FORMULA:
				return getFormula();
			case OntomlPackage.PROPERTY_TYPE__SYNONYM_REFERENCES:
				return getSynonymReferences();
			case OntomlPackage.PROPERTY_TYPE__SUGGESTED_VALUE_LIST:
				return isSuggestedValueList();
			case OntomlPackage.PROPERTY_TYPE__FREE_RELATIONS:
				return getFreeRelations();
			case OntomlPackage.PROPERTY_TYPE__GUID:
				return getGuid();
			case OntomlPackage.PROPERTY_TYPE__GUID2:
				return getGuid2();
			case OntomlPackage.PROPERTY_TYPE__ID:
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
			case OntomlPackage.PROPERTY_TYPE__NAME_SCOPE:
				setNameScope((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__REVISION:
				setRevision((String)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__STATUS:
				setStatus((String)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__TRANSLATION:
				setTranslation((TRANSLATIONType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGEType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAMEType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAMEType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__SHORT_NAME:
				setShortName((SHORTNAMEType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__ICON:
				setIcon((GRAPHICSType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__DEFINITION:
				setDefinition((TEXTType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION:
				setSourceDocOfDefinition((SOURCEDOCUMENTType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__NOTE:
				setNote((TEXTType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__REMARK:
				setRemark((TEXTType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_SYMBOL:
				setPreferredSymbol((MATHEMATICALSTRINGType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_SYMBOLS:
				setSynonymousSymbols((SYNONYMOUSSYMBOLSType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__FIGURE:
				setFigure((GRAPHICSType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__DET_CLASSIFICATION:
				setDetClassification((String)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__DOMAIN:
				setDomain((ANYTYPEType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__FORMULA:
				setFormula((MATHEMATICALSTRINGType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__SYNONYM_REFERENCES:
				setSynonymReferences((SYNONYMREFERENCESType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__SUGGESTED_VALUE_LIST:
				setSuggestedValueList((Boolean)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__FREE_RELATIONS:
				setFreeRelations((FREERELATIONSType)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__GUID:
				setGuid((String)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__GUID2:
				setGuid2((String)newValue);
				return;
			case OntomlPackage.PROPERTY_TYPE__ID:
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
			case OntomlPackage.PROPERTY_TYPE__NAME_SCOPE:
				setNameScope((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition(DATE_OF_ORIGINAL_DEFINITION_EDEFAULT);
				return;
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion(DATE_OF_CURRENT_VERSION_EDEFAULT);
				return;
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision(DATE_OF_CURRENT_REVISION_EDEFAULT);
				return;
			case OntomlPackage.PROPERTY_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OntomlPackage.PROPERTY_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OntomlPackage.PROPERTY_TYPE__TRANSLATION:
				setTranslation((TRANSLATIONType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGEType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED:
				unsetIsDeprecated();
				return;
			case OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAMEType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAMEType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__SHORT_NAME:
				setShortName((SHORTNAMEType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__ICON:
				setIcon((GRAPHICSType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__DEFINITION:
				setDefinition((TEXTType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION:
				setSourceDocOfDefinition((SOURCEDOCUMENTType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__NOTE:
				setNote((TEXTType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__REMARK:
				setRemark((TEXTType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_SYMBOL:
				setPreferredSymbol((MATHEMATICALSTRINGType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_SYMBOLS:
				setSynonymousSymbols((SYNONYMOUSSYMBOLSType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__FIGURE:
				setFigure((GRAPHICSType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__DET_CLASSIFICATION:
				setDetClassification(DET_CLASSIFICATION_EDEFAULT);
				return;
			case OntomlPackage.PROPERTY_TYPE__DOMAIN:
				setDomain((ANYTYPEType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__FORMULA:
				setFormula((MATHEMATICALSTRINGType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__SYNONYM_REFERENCES:
				setSynonymReferences((SYNONYMREFERENCESType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__SUGGESTED_VALUE_LIST:
				unsetSuggestedValueList();
				return;
			case OntomlPackage.PROPERTY_TYPE__FREE_RELATIONS:
				setFreeRelations((FREERELATIONSType)null);
				return;
			case OntomlPackage.PROPERTY_TYPE__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case OntomlPackage.PROPERTY_TYPE__GUID2:
				setGuid2(GUID2_EDEFAULT);
				return;
			case OntomlPackage.PROPERTY_TYPE__ID:
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
			case OntomlPackage.PROPERTY_TYPE__NAME_SCOPE:
				return nameScope != null;
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return DATE_OF_ORIGINAL_DEFINITION_EDEFAULT == null ? dateOfOriginalDefinition != null : !DATE_OF_ORIGINAL_DEFINITION_EDEFAULT.equals(dateOfOriginalDefinition);
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_VERSION:
				return DATE_OF_CURRENT_VERSION_EDEFAULT == null ? dateOfCurrentVersion != null : !DATE_OF_CURRENT_VERSION_EDEFAULT.equals(dateOfCurrentVersion);
			case OntomlPackage.PROPERTY_TYPE__DATE_OF_CURRENT_REVISION:
				return DATE_OF_CURRENT_REVISION_EDEFAULT == null ? dateOfCurrentRevision != null : !DATE_OF_CURRENT_REVISION_EDEFAULT.equals(dateOfCurrentRevision);
			case OntomlPackage.PROPERTY_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case OntomlPackage.PROPERTY_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OntomlPackage.PROPERTY_TYPE__TRANSLATION:
				return translation != null;
			case OntomlPackage.PROPERTY_TYPE__SOURCE_LANGUAGE:
				return sourceLanguage != null;
			case OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED:
				return isSetIsDeprecated();
			case OntomlPackage.PROPERTY_TYPE__IS_DEPRECATED_INTERPRETATION:
				return isDeprecatedInterpretation != null;
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_NAME:
				return preferredName != null;
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_NAMES:
				return synonymousNames != null;
			case OntomlPackage.PROPERTY_TYPE__SHORT_NAME:
				return shortName != null;
			case OntomlPackage.PROPERTY_TYPE__ICON:
				return icon != null;
			case OntomlPackage.PROPERTY_TYPE__DEFINITION:
				return definition != null;
			case OntomlPackage.PROPERTY_TYPE__SOURCE_DOC_OF_DEFINITION:
				return sourceDocOfDefinition != null;
			case OntomlPackage.PROPERTY_TYPE__NOTE:
				return note != null;
			case OntomlPackage.PROPERTY_TYPE__REMARK:
				return remark != null;
			case OntomlPackage.PROPERTY_TYPE__PREFERRED_SYMBOL:
				return preferredSymbol != null;
			case OntomlPackage.PROPERTY_TYPE__SYNONYMOUS_SYMBOLS:
				return synonymousSymbols != null;
			case OntomlPackage.PROPERTY_TYPE__FIGURE:
				return figure != null;
			case OntomlPackage.PROPERTY_TYPE__DET_CLASSIFICATION:
				return DET_CLASSIFICATION_EDEFAULT == null ? detClassification != null : !DET_CLASSIFICATION_EDEFAULT.equals(detClassification);
			case OntomlPackage.PROPERTY_TYPE__DOMAIN:
				return domain != null;
			case OntomlPackage.PROPERTY_TYPE__FORMULA:
				return formula != null;
			case OntomlPackage.PROPERTY_TYPE__SYNONYM_REFERENCES:
				return synonymReferences != null;
			case OntomlPackage.PROPERTY_TYPE__SUGGESTED_VALUE_LIST:
				return isSetSuggestedValueList();
			case OntomlPackage.PROPERTY_TYPE__FREE_RELATIONS:
				return freeRelations != null;
			case OntomlPackage.PROPERTY_TYPE__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case OntomlPackage.PROPERTY_TYPE__GUID2:
				return GUID2_EDEFAULT == null ? guid2 != null : !GUID2_EDEFAULT.equals(guid2);
			case OntomlPackage.PROPERTY_TYPE__ID:
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
		result.append(", detClassification: ");
		result.append(detClassification);
		result.append(", suggestedValueList: ");
		if (suggestedValueListESet) result.append(suggestedValueList); else result.append("<unset>");
		result.append(", guid: ");
		result.append(guid);
		result.append(", guid2: ");
		result.append(guid2);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PROPERTYTypeImpl
