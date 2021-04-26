/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTANTVALUESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDREFERENCESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SOURCEDOCUMENTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType;
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
 * An implementation of the model object '<em><b>CLASS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getDateOfCurrentVersion <em>Date Of Current Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getDateOfCurrentRevision <em>Date Of Current Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#isIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getSynonymousNames <em>Synonymous Names</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getSourceDocOfDefinition <em>Source Doc Of Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getItsSuperclass <em>Its Superclass</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getDescribedBy <em>Described By</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getDefinedTypes <em>Defined Types</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getDefinedDocuments <em>Defined Documents</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getHierarchicalPosition <em>Hierarchical Position</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getSubClassProperties <em>Sub Class Properties</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getClassConstantValues <em>Class Constant Values</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getGeometricRepresentationContext <em>Geometric Representation Context</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getGlobalUnitContext <em>Global Unit Context</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getKeywordReferences <em>Keyword References</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getFreeRelations <em>Free Relations</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getGuid2 <em>Guid2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CLASSTypeImpl extends MinimalEObjectImpl.Container implements CLASSType {
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
	 * The cached value of the '{@link #getItsSuperclass() <em>Its Superclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSuperclass()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCEType itsSuperclass;

	/**
	 * The cached value of the '{@link #getDescribedBy() <em>Described By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedBy()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType describedBy;

	/**
	 * The cached value of the '{@link #getDefinedTypes() <em>Defined Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedTypes()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCEType definedTypes;

	/**
	 * The cached value of the '{@link #getDefinedDocuments() <em>Defined Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedDocuments()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCEType definedDocuments;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTSType constraints;

	/**
	 * The default value of the '{@link #getHierarchicalPosition() <em>Hierarchical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchicalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String HIERARCHICAL_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHierarchicalPosition() <em>Hierarchical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchicalPosition()
	 * @generated
	 * @ordered
	 */
	protected String hierarchicalPosition = HIERARCHICAL_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected KEYWORDType keywords;

	/**
	 * The cached value of the '{@link #getSubClassProperties() <em>Sub Class Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassProperties()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType subClassProperties;

	/**
	 * The cached value of the '{@link #getClassConstantValues() <em>Class Constant Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassConstantValues()
	 * @generated
	 * @ordered
	 */
	protected CLASSCONSTANTVALUESType classConstantValues;

	/**
	 * The cached value of the '{@link #getGeometricRepresentationContext() <em>Geometric Representation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometricRepresentationContext()
	 * @generated
	 * @ordered
	 */
	protected GEOMETRICCONTEXTType geometricRepresentationContext;

	/**
	 * The cached value of the '{@link #getGlobalUnitContext() <em>Global Unit Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalUnitContext()
	 * @generated
	 * @ordered
	 */
	protected GEOMETRICUNITCONTEXTType globalUnitContext;

	/**
	 * The cached value of the '{@link #getKeywordReferences() <em>Keyword References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordReferences()
	 * @generated
	 * @ordered
	 */
	protected KEYWORDREFERENCESType keywordReferences;

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
	protected CLASSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCLASSType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION, oldDateOfOriginalDefinition, dateOfOriginalDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_VERSION, oldDateOfCurrentVersion, dateOfCurrentVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_REVISION, oldDateOfCurrentRevision, dateOfCurrentRevision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__STATUS, oldStatus, status));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__TRANSLATION, oldTranslation, newTranslation);
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
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__TRANSLATION, newTranslation, newTranslation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SOURCE_LANGUAGE, oldSourceLanguage, newSourceLanguage);
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
				msgs = ((InternalEObject)sourceLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SOURCE_LANGUAGE, null, msgs);
			if (newSourceLanguage != null)
				msgs = ((InternalEObject)newSourceLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SOURCE_LANGUAGE, null, msgs);
			msgs = basicSetSourceLanguage(newSourceLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SOURCE_LANGUAGE, newSourceLanguage, newSourceLanguage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__IS_DEPRECATED, oldIsDeprecated, isDeprecated, !oldIsDeprecatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.CLASS_TYPE__IS_DEPRECATED, oldIsDeprecated, IS_DEPRECATED_EDEFAULT, oldIsDeprecatedESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__IS_DEPRECATED_INTERPRETATION, oldIsDeprecatedInterpretation, newIsDeprecatedInterpretation);
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
				msgs = ((InternalEObject)isDeprecatedInterpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			if (newIsDeprecatedInterpretation != null)
				msgs = ((InternalEObject)newIsDeprecatedInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__IS_DEPRECATED_INTERPRETATION, null, msgs);
			msgs = basicSetIsDeprecatedInterpretation(newIsDeprecatedInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__IS_DEPRECATED_INTERPRETATION, newIsDeprecatedInterpretation, newIsDeprecatedInterpretation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__PREFERRED_NAME, oldPreferredName, newPreferredName);
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
				msgs = ((InternalEObject)preferredName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__PREFERRED_NAME, null, msgs);
			if (newPreferredName != null)
				msgs = ((InternalEObject)newPreferredName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__PREFERRED_NAME, null, msgs);
			msgs = basicSetPreferredName(newPreferredName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__PREFERRED_NAME, newPreferredName, newPreferredName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SYNONYMOUS_NAMES, oldSynonymousNames, newSynonymousNames);
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
				msgs = ((InternalEObject)synonymousNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SYNONYMOUS_NAMES, null, msgs);
			if (newSynonymousNames != null)
				msgs = ((InternalEObject)newSynonymousNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SYNONYMOUS_NAMES, null, msgs);
			msgs = basicSetSynonymousNames(newSynonymousNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SYNONYMOUS_NAMES, newSynonymousNames, newSynonymousNames));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SHORT_NAME, oldShortName, newShortName);
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
				msgs = ((InternalEObject)shortName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SHORT_NAME, null, msgs);
			if (newShortName != null)
				msgs = ((InternalEObject)newShortName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SHORT_NAME, null, msgs);
			msgs = basicSetShortName(newShortName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SHORT_NAME, newShortName, newShortName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__ICON, oldIcon, newIcon);
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
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__ICON, newIcon, newIcon));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DEFINITION, oldDefinition, newDefinition);
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
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DEFINITION, newDefinition, newDefinition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SOURCE_DOC_OF_DEFINITION, oldSourceDocOfDefinition, newSourceDocOfDefinition);
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
				msgs = ((InternalEObject)sourceDocOfDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SOURCE_DOC_OF_DEFINITION, null, msgs);
			if (newSourceDocOfDefinition != null)
				msgs = ((InternalEObject)newSourceDocOfDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SOURCE_DOC_OF_DEFINITION, null, msgs);
			msgs = basicSetSourceDocOfDefinition(newSourceDocOfDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SOURCE_DOC_OF_DEFINITION, newSourceDocOfDefinition, newSourceDocOfDefinition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__NOTE, oldNote, newNote);
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
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__NOTE, newNote, newNote));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__REMARK, oldRemark, newRemark);
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
				msgs = ((InternalEObject)remark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__REMARK, null, msgs);
			if (newRemark != null)
				msgs = ((InternalEObject)newRemark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__REMARK, null, msgs);
			msgs = basicSetRemark(newRemark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__REMARK, newRemark, newRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType getItsSuperclass() {
		return itsSuperclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsSuperclass(CLASSREFERENCEType newItsSuperclass, NotificationChain msgs) {
		CLASSREFERENCEType oldItsSuperclass = itsSuperclass;
		itsSuperclass = newItsSuperclass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__ITS_SUPERCLASS, oldItsSuperclass, newItsSuperclass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsSuperclass(CLASSREFERENCEType newItsSuperclass) {
		if (newItsSuperclass != itsSuperclass) {
			NotificationChain msgs = null;
			if (itsSuperclass != null)
				msgs = ((InternalEObject)itsSuperclass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__ITS_SUPERCLASS, null, msgs);
			if (newItsSuperclass != null)
				msgs = ((InternalEObject)newItsSuperclass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__ITS_SUPERCLASS, null, msgs);
			msgs = basicSetItsSuperclass(newItsSuperclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__ITS_SUPERCLASS, newItsSuperclass, newItsSuperclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getDescribedBy() {
		return describedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribedBy(PROPERTIESREFERENCEType newDescribedBy, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldDescribedBy = describedBy;
		describedBy = newDescribedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DESCRIBED_BY, oldDescribedBy, newDescribedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribedBy(PROPERTIESREFERENCEType newDescribedBy) {
		if (newDescribedBy != describedBy) {
			NotificationChain msgs = null;
			if (describedBy != null)
				msgs = ((InternalEObject)describedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__DESCRIBED_BY, null, msgs);
			if (newDescribedBy != null)
				msgs = ((InternalEObject)newDescribedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__DESCRIBED_BY, null, msgs);
			msgs = basicSetDescribedBy(newDescribedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DESCRIBED_BY, newDescribedBy, newDescribedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCEType getDefinedTypes() {
		return definedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedTypes(DATATYPESREFERENCEType newDefinedTypes, NotificationChain msgs) {
		DATATYPESREFERENCEType oldDefinedTypes = definedTypes;
		definedTypes = newDefinedTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DEFINED_TYPES, oldDefinedTypes, newDefinedTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedTypes(DATATYPESREFERENCEType newDefinedTypes) {
		if (newDefinedTypes != definedTypes) {
			NotificationChain msgs = null;
			if (definedTypes != null)
				msgs = ((InternalEObject)definedTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__DEFINED_TYPES, null, msgs);
			if (newDefinedTypes != null)
				msgs = ((InternalEObject)newDefinedTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__DEFINED_TYPES, null, msgs);
			msgs = basicSetDefinedTypes(newDefinedTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DEFINED_TYPES, newDefinedTypes, newDefinedTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCEType getDefinedDocuments() {
		return definedDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedDocuments(DOCUMENTSREFERENCEType newDefinedDocuments, NotificationChain msgs) {
		DOCUMENTSREFERENCEType oldDefinedDocuments = definedDocuments;
		definedDocuments = newDefinedDocuments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DEFINED_DOCUMENTS, oldDefinedDocuments, newDefinedDocuments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedDocuments(DOCUMENTSREFERENCEType newDefinedDocuments) {
		if (newDefinedDocuments != definedDocuments) {
			NotificationChain msgs = null;
			if (definedDocuments != null)
				msgs = ((InternalEObject)definedDocuments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__DEFINED_DOCUMENTS, null, msgs);
			if (newDefinedDocuments != null)
				msgs = ((InternalEObject)newDefinedDocuments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__DEFINED_DOCUMENTS, null, msgs);
			msgs = basicSetDefinedDocuments(newDefinedDocuments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__DEFINED_DOCUMENTS, newDefinedDocuments, newDefinedDocuments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTSType getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(CONSTRAINTSType newConstraints, NotificationChain msgs) {
		CONSTRAINTSType oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(CONSTRAINTSType newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHierarchicalPosition() {
		return hierarchicalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchicalPosition(String newHierarchicalPosition) {
		String oldHierarchicalPosition = hierarchicalPosition;
		hierarchicalPosition = newHierarchicalPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__HIERARCHICAL_POSITION, oldHierarchicalPosition, hierarchicalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEYWORDType getKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywords(KEYWORDType newKeywords, NotificationChain msgs) {
		KEYWORDType oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__KEYWORDS, oldKeywords, newKeywords);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywords(KEYWORDType newKeywords) {
		if (newKeywords != keywords) {
			NotificationChain msgs = null;
			if (keywords != null)
				msgs = ((InternalEObject)keywords).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__KEYWORDS, null, msgs);
			if (newKeywords != null)
				msgs = ((InternalEObject)newKeywords).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__KEYWORDS, null, msgs);
			msgs = basicSetKeywords(newKeywords, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__KEYWORDS, newKeywords, newKeywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getSubClassProperties() {
		return subClassProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubClassProperties(PROPERTIESREFERENCEType newSubClassProperties, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldSubClassProperties = subClassProperties;
		subClassProperties = newSubClassProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SUB_CLASS_PROPERTIES, oldSubClassProperties, newSubClassProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClassProperties(PROPERTIESREFERENCEType newSubClassProperties) {
		if (newSubClassProperties != subClassProperties) {
			NotificationChain msgs = null;
			if (subClassProperties != null)
				msgs = ((InternalEObject)subClassProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SUB_CLASS_PROPERTIES, null, msgs);
			if (newSubClassProperties != null)
				msgs = ((InternalEObject)newSubClassProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__SUB_CLASS_PROPERTIES, null, msgs);
			msgs = basicSetSubClassProperties(newSubClassProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__SUB_CLASS_PROPERTIES, newSubClassProperties, newSubClassProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSCONSTANTVALUESType getClassConstantValues() {
		return classConstantValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassConstantValues(CLASSCONSTANTVALUESType newClassConstantValues, NotificationChain msgs) {
		CLASSCONSTANTVALUESType oldClassConstantValues = classConstantValues;
		classConstantValues = newClassConstantValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__CLASS_CONSTANT_VALUES, oldClassConstantValues, newClassConstantValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassConstantValues(CLASSCONSTANTVALUESType newClassConstantValues) {
		if (newClassConstantValues != classConstantValues) {
			NotificationChain msgs = null;
			if (classConstantValues != null)
				msgs = ((InternalEObject)classConstantValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__CLASS_CONSTANT_VALUES, null, msgs);
			if (newClassConstantValues != null)
				msgs = ((InternalEObject)newClassConstantValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__CLASS_CONSTANT_VALUES, null, msgs);
			msgs = basicSetClassConstantValues(newClassConstantValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__CLASS_CONSTANT_VALUES, newClassConstantValues, newClassConstantValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEOMETRICCONTEXTType getGeometricRepresentationContext() {
		return geometricRepresentationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometricRepresentationContext(GEOMETRICCONTEXTType newGeometricRepresentationContext, NotificationChain msgs) {
		GEOMETRICCONTEXTType oldGeometricRepresentationContext = geometricRepresentationContext;
		geometricRepresentationContext = newGeometricRepresentationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT, oldGeometricRepresentationContext, newGeometricRepresentationContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometricRepresentationContext(GEOMETRICCONTEXTType newGeometricRepresentationContext) {
		if (newGeometricRepresentationContext != geometricRepresentationContext) {
			NotificationChain msgs = null;
			if (geometricRepresentationContext != null)
				msgs = ((InternalEObject)geometricRepresentationContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT, null, msgs);
			if (newGeometricRepresentationContext != null)
				msgs = ((InternalEObject)newGeometricRepresentationContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT, null, msgs);
			msgs = basicSetGeometricRepresentationContext(newGeometricRepresentationContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT, newGeometricRepresentationContext, newGeometricRepresentationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEOMETRICUNITCONTEXTType getGlobalUnitContext() {
		return globalUnitContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalUnitContext(GEOMETRICUNITCONTEXTType newGlobalUnitContext, NotificationChain msgs) {
		GEOMETRICUNITCONTEXTType oldGlobalUnitContext = globalUnitContext;
		globalUnitContext = newGlobalUnitContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__GLOBAL_UNIT_CONTEXT, oldGlobalUnitContext, newGlobalUnitContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalUnitContext(GEOMETRICUNITCONTEXTType newGlobalUnitContext) {
		if (newGlobalUnitContext != globalUnitContext) {
			NotificationChain msgs = null;
			if (globalUnitContext != null)
				msgs = ((InternalEObject)globalUnitContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__GLOBAL_UNIT_CONTEXT, null, msgs);
			if (newGlobalUnitContext != null)
				msgs = ((InternalEObject)newGlobalUnitContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__GLOBAL_UNIT_CONTEXT, null, msgs);
			msgs = basicSetGlobalUnitContext(newGlobalUnitContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__GLOBAL_UNIT_CONTEXT, newGlobalUnitContext, newGlobalUnitContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEYWORDREFERENCESType getKeywordReferences() {
		return keywordReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywordReferences(KEYWORDREFERENCESType newKeywordReferences, NotificationChain msgs) {
		KEYWORDREFERENCESType oldKeywordReferences = keywordReferences;
		keywordReferences = newKeywordReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__KEYWORD_REFERENCES, oldKeywordReferences, newKeywordReferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywordReferences(KEYWORDREFERENCESType newKeywordReferences) {
		if (newKeywordReferences != keywordReferences) {
			NotificationChain msgs = null;
			if (keywordReferences != null)
				msgs = ((InternalEObject)keywordReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__KEYWORD_REFERENCES, null, msgs);
			if (newKeywordReferences != null)
				msgs = ((InternalEObject)newKeywordReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__KEYWORD_REFERENCES, null, msgs);
			msgs = basicSetKeywordReferences(newKeywordReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__KEYWORD_REFERENCES, newKeywordReferences, newKeywordReferences));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__FREE_RELATIONS, oldFreeRelations, newFreeRelations);
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
				msgs = ((InternalEObject)freeRelations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__FREE_RELATIONS, null, msgs);
			if (newFreeRelations != null)
				msgs = ((InternalEObject)newFreeRelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASS_TYPE__FREE_RELATIONS, null, msgs);
			msgs = basicSetFreeRelations(newFreeRelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__FREE_RELATIONS, newFreeRelations, newFreeRelations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__GUID, oldGuid, guid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__GUID2, oldGuid2, guid2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASS_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CLASS_TYPE__TRANSLATION:
				return basicSetTranslation(null, msgs);
			case OntomlPackage.CLASS_TYPE__SOURCE_LANGUAGE:
				return basicSetSourceLanguage(null, msgs);
			case OntomlPackage.CLASS_TYPE__IS_DEPRECATED_INTERPRETATION:
				return basicSetIsDeprecatedInterpretation(null, msgs);
			case OntomlPackage.CLASS_TYPE__PREFERRED_NAME:
				return basicSetPreferredName(null, msgs);
			case OntomlPackage.CLASS_TYPE__SYNONYMOUS_NAMES:
				return basicSetSynonymousNames(null, msgs);
			case OntomlPackage.CLASS_TYPE__SHORT_NAME:
				return basicSetShortName(null, msgs);
			case OntomlPackage.CLASS_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case OntomlPackage.CLASS_TYPE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case OntomlPackage.CLASS_TYPE__SOURCE_DOC_OF_DEFINITION:
				return basicSetSourceDocOfDefinition(null, msgs);
			case OntomlPackage.CLASS_TYPE__NOTE:
				return basicSetNote(null, msgs);
			case OntomlPackage.CLASS_TYPE__REMARK:
				return basicSetRemark(null, msgs);
			case OntomlPackage.CLASS_TYPE__ITS_SUPERCLASS:
				return basicSetItsSuperclass(null, msgs);
			case OntomlPackage.CLASS_TYPE__DESCRIBED_BY:
				return basicSetDescribedBy(null, msgs);
			case OntomlPackage.CLASS_TYPE__DEFINED_TYPES:
				return basicSetDefinedTypes(null, msgs);
			case OntomlPackage.CLASS_TYPE__DEFINED_DOCUMENTS:
				return basicSetDefinedDocuments(null, msgs);
			case OntomlPackage.CLASS_TYPE__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case OntomlPackage.CLASS_TYPE__KEYWORDS:
				return basicSetKeywords(null, msgs);
			case OntomlPackage.CLASS_TYPE__SUB_CLASS_PROPERTIES:
				return basicSetSubClassProperties(null, msgs);
			case OntomlPackage.CLASS_TYPE__CLASS_CONSTANT_VALUES:
				return basicSetClassConstantValues(null, msgs);
			case OntomlPackage.CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT:
				return basicSetGeometricRepresentationContext(null, msgs);
			case OntomlPackage.CLASS_TYPE__GLOBAL_UNIT_CONTEXT:
				return basicSetGlobalUnitContext(null, msgs);
			case OntomlPackage.CLASS_TYPE__KEYWORD_REFERENCES:
				return basicSetKeywordReferences(null, msgs);
			case OntomlPackage.CLASS_TYPE__FREE_RELATIONS:
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
			case OntomlPackage.CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return getDateOfOriginalDefinition();
			case OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_VERSION:
				return getDateOfCurrentVersion();
			case OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_REVISION:
				return getDateOfCurrentRevision();
			case OntomlPackage.CLASS_TYPE__REVISION:
				return getRevision();
			case OntomlPackage.CLASS_TYPE__STATUS:
				return getStatus();
			case OntomlPackage.CLASS_TYPE__TRANSLATION:
				return getTranslation();
			case OntomlPackage.CLASS_TYPE__SOURCE_LANGUAGE:
				return getSourceLanguage();
			case OntomlPackage.CLASS_TYPE__IS_DEPRECATED:
				return isIsDeprecated();
			case OntomlPackage.CLASS_TYPE__IS_DEPRECATED_INTERPRETATION:
				return getIsDeprecatedInterpretation();
			case OntomlPackage.CLASS_TYPE__PREFERRED_NAME:
				return getPreferredName();
			case OntomlPackage.CLASS_TYPE__SYNONYMOUS_NAMES:
				return getSynonymousNames();
			case OntomlPackage.CLASS_TYPE__SHORT_NAME:
				return getShortName();
			case OntomlPackage.CLASS_TYPE__ICON:
				return getIcon();
			case OntomlPackage.CLASS_TYPE__DEFINITION:
				return getDefinition();
			case OntomlPackage.CLASS_TYPE__SOURCE_DOC_OF_DEFINITION:
				return getSourceDocOfDefinition();
			case OntomlPackage.CLASS_TYPE__NOTE:
				return getNote();
			case OntomlPackage.CLASS_TYPE__REMARK:
				return getRemark();
			case OntomlPackage.CLASS_TYPE__ITS_SUPERCLASS:
				return getItsSuperclass();
			case OntomlPackage.CLASS_TYPE__DESCRIBED_BY:
				return getDescribedBy();
			case OntomlPackage.CLASS_TYPE__DEFINED_TYPES:
				return getDefinedTypes();
			case OntomlPackage.CLASS_TYPE__DEFINED_DOCUMENTS:
				return getDefinedDocuments();
			case OntomlPackage.CLASS_TYPE__CONSTRAINTS:
				return getConstraints();
			case OntomlPackage.CLASS_TYPE__HIERARCHICAL_POSITION:
				return getHierarchicalPosition();
			case OntomlPackage.CLASS_TYPE__KEYWORDS:
				return getKeywords();
			case OntomlPackage.CLASS_TYPE__SUB_CLASS_PROPERTIES:
				return getSubClassProperties();
			case OntomlPackage.CLASS_TYPE__CLASS_CONSTANT_VALUES:
				return getClassConstantValues();
			case OntomlPackage.CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT:
				return getGeometricRepresentationContext();
			case OntomlPackage.CLASS_TYPE__GLOBAL_UNIT_CONTEXT:
				return getGlobalUnitContext();
			case OntomlPackage.CLASS_TYPE__KEYWORD_REFERENCES:
				return getKeywordReferences();
			case OntomlPackage.CLASS_TYPE__FREE_RELATIONS:
				return getFreeRelations();
			case OntomlPackage.CLASS_TYPE__GUID:
				return getGuid();
			case OntomlPackage.CLASS_TYPE__GUID2:
				return getGuid2();
			case OntomlPackage.CLASS_TYPE__ID:
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
			case OntomlPackage.CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision((XMLGregorianCalendar)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__REVISION:
				setRevision((String)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__STATUS:
				setStatus((String)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__TRANSLATION:
				setTranslation((TRANSLATIONType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGEType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAMEType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAMEType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__SHORT_NAME:
				setShortName((SHORTNAMEType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__ICON:
				setIcon((GRAPHICSType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__DEFINITION:
				setDefinition((TEXTType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__SOURCE_DOC_OF_DEFINITION:
				setSourceDocOfDefinition((SOURCEDOCUMENTType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__NOTE:
				setNote((TEXTType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__REMARK:
				setRemark((TEXTType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__ITS_SUPERCLASS:
				setItsSuperclass((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__DESCRIBED_BY:
				setDescribedBy((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__DEFINED_TYPES:
				setDefinedTypes((DATATYPESREFERENCEType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__DEFINED_DOCUMENTS:
				setDefinedDocuments((DOCUMENTSREFERENCEType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__CONSTRAINTS:
				setConstraints((CONSTRAINTSType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__HIERARCHICAL_POSITION:
				setHierarchicalPosition((String)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__KEYWORDS:
				setKeywords((KEYWORDType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__SUB_CLASS_PROPERTIES:
				setSubClassProperties((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__CLASS_CONSTANT_VALUES:
				setClassConstantValues((CLASSCONSTANTVALUESType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT:
				setGeometricRepresentationContext((GEOMETRICCONTEXTType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__GLOBAL_UNIT_CONTEXT:
				setGlobalUnitContext((GEOMETRICUNITCONTEXTType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__KEYWORD_REFERENCES:
				setKeywordReferences((KEYWORDREFERENCESType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__FREE_RELATIONS:
				setFreeRelations((FREERELATIONSType)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__GUID:
				setGuid((String)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__GUID2:
				setGuid2((String)newValue);
				return;
			case OntomlPackage.CLASS_TYPE__ID:
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
			case OntomlPackage.CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition(DATE_OF_ORIGINAL_DEFINITION_EDEFAULT);
				return;
			case OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion(DATE_OF_CURRENT_VERSION_EDEFAULT);
				return;
			case OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision(DATE_OF_CURRENT_REVISION_EDEFAULT);
				return;
			case OntomlPackage.CLASS_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OntomlPackage.CLASS_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OntomlPackage.CLASS_TYPE__TRANSLATION:
				setTranslation((TRANSLATIONType)null);
				return;
			case OntomlPackage.CLASS_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGEType)null);
				return;
			case OntomlPackage.CLASS_TYPE__IS_DEPRECATED:
				unsetIsDeprecated();
				return;
			case OntomlPackage.CLASS_TYPE__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXTType)null);
				return;
			case OntomlPackage.CLASS_TYPE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAMEType)null);
				return;
			case OntomlPackage.CLASS_TYPE__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAMEType)null);
				return;
			case OntomlPackage.CLASS_TYPE__SHORT_NAME:
				setShortName((SHORTNAMEType)null);
				return;
			case OntomlPackage.CLASS_TYPE__ICON:
				setIcon((GRAPHICSType)null);
				return;
			case OntomlPackage.CLASS_TYPE__DEFINITION:
				setDefinition((TEXTType)null);
				return;
			case OntomlPackage.CLASS_TYPE__SOURCE_DOC_OF_DEFINITION:
				setSourceDocOfDefinition((SOURCEDOCUMENTType)null);
				return;
			case OntomlPackage.CLASS_TYPE__NOTE:
				setNote((TEXTType)null);
				return;
			case OntomlPackage.CLASS_TYPE__REMARK:
				setRemark((TEXTType)null);
				return;
			case OntomlPackage.CLASS_TYPE__ITS_SUPERCLASS:
				setItsSuperclass((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.CLASS_TYPE__DESCRIBED_BY:
				setDescribedBy((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.CLASS_TYPE__DEFINED_TYPES:
				setDefinedTypes((DATATYPESREFERENCEType)null);
				return;
			case OntomlPackage.CLASS_TYPE__DEFINED_DOCUMENTS:
				setDefinedDocuments((DOCUMENTSREFERENCEType)null);
				return;
			case OntomlPackage.CLASS_TYPE__CONSTRAINTS:
				setConstraints((CONSTRAINTSType)null);
				return;
			case OntomlPackage.CLASS_TYPE__HIERARCHICAL_POSITION:
				setHierarchicalPosition(HIERARCHICAL_POSITION_EDEFAULT);
				return;
			case OntomlPackage.CLASS_TYPE__KEYWORDS:
				setKeywords((KEYWORDType)null);
				return;
			case OntomlPackage.CLASS_TYPE__SUB_CLASS_PROPERTIES:
				setSubClassProperties((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.CLASS_TYPE__CLASS_CONSTANT_VALUES:
				setClassConstantValues((CLASSCONSTANTVALUESType)null);
				return;
			case OntomlPackage.CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT:
				setGeometricRepresentationContext((GEOMETRICCONTEXTType)null);
				return;
			case OntomlPackage.CLASS_TYPE__GLOBAL_UNIT_CONTEXT:
				setGlobalUnitContext((GEOMETRICUNITCONTEXTType)null);
				return;
			case OntomlPackage.CLASS_TYPE__KEYWORD_REFERENCES:
				setKeywordReferences((KEYWORDREFERENCESType)null);
				return;
			case OntomlPackage.CLASS_TYPE__FREE_RELATIONS:
				setFreeRelations((FREERELATIONSType)null);
				return;
			case OntomlPackage.CLASS_TYPE__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case OntomlPackage.CLASS_TYPE__GUID2:
				setGuid2(GUID2_EDEFAULT);
				return;
			case OntomlPackage.CLASS_TYPE__ID:
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
			case OntomlPackage.CLASS_TYPE__DATE_OF_ORIGINAL_DEFINITION:
				return DATE_OF_ORIGINAL_DEFINITION_EDEFAULT == null ? dateOfOriginalDefinition != null : !DATE_OF_ORIGINAL_DEFINITION_EDEFAULT.equals(dateOfOriginalDefinition);
			case OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_VERSION:
				return DATE_OF_CURRENT_VERSION_EDEFAULT == null ? dateOfCurrentVersion != null : !DATE_OF_CURRENT_VERSION_EDEFAULT.equals(dateOfCurrentVersion);
			case OntomlPackage.CLASS_TYPE__DATE_OF_CURRENT_REVISION:
				return DATE_OF_CURRENT_REVISION_EDEFAULT == null ? dateOfCurrentRevision != null : !DATE_OF_CURRENT_REVISION_EDEFAULT.equals(dateOfCurrentRevision);
			case OntomlPackage.CLASS_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case OntomlPackage.CLASS_TYPE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OntomlPackage.CLASS_TYPE__TRANSLATION:
				return translation != null;
			case OntomlPackage.CLASS_TYPE__SOURCE_LANGUAGE:
				return sourceLanguage != null;
			case OntomlPackage.CLASS_TYPE__IS_DEPRECATED:
				return isSetIsDeprecated();
			case OntomlPackage.CLASS_TYPE__IS_DEPRECATED_INTERPRETATION:
				return isDeprecatedInterpretation != null;
			case OntomlPackage.CLASS_TYPE__PREFERRED_NAME:
				return preferredName != null;
			case OntomlPackage.CLASS_TYPE__SYNONYMOUS_NAMES:
				return synonymousNames != null;
			case OntomlPackage.CLASS_TYPE__SHORT_NAME:
				return shortName != null;
			case OntomlPackage.CLASS_TYPE__ICON:
				return icon != null;
			case OntomlPackage.CLASS_TYPE__DEFINITION:
				return definition != null;
			case OntomlPackage.CLASS_TYPE__SOURCE_DOC_OF_DEFINITION:
				return sourceDocOfDefinition != null;
			case OntomlPackage.CLASS_TYPE__NOTE:
				return note != null;
			case OntomlPackage.CLASS_TYPE__REMARK:
				return remark != null;
			case OntomlPackage.CLASS_TYPE__ITS_SUPERCLASS:
				return itsSuperclass != null;
			case OntomlPackage.CLASS_TYPE__DESCRIBED_BY:
				return describedBy != null;
			case OntomlPackage.CLASS_TYPE__DEFINED_TYPES:
				return definedTypes != null;
			case OntomlPackage.CLASS_TYPE__DEFINED_DOCUMENTS:
				return definedDocuments != null;
			case OntomlPackage.CLASS_TYPE__CONSTRAINTS:
				return constraints != null;
			case OntomlPackage.CLASS_TYPE__HIERARCHICAL_POSITION:
				return HIERARCHICAL_POSITION_EDEFAULT == null ? hierarchicalPosition != null : !HIERARCHICAL_POSITION_EDEFAULT.equals(hierarchicalPosition);
			case OntomlPackage.CLASS_TYPE__KEYWORDS:
				return keywords != null;
			case OntomlPackage.CLASS_TYPE__SUB_CLASS_PROPERTIES:
				return subClassProperties != null;
			case OntomlPackage.CLASS_TYPE__CLASS_CONSTANT_VALUES:
				return classConstantValues != null;
			case OntomlPackage.CLASS_TYPE__GEOMETRIC_REPRESENTATION_CONTEXT:
				return geometricRepresentationContext != null;
			case OntomlPackage.CLASS_TYPE__GLOBAL_UNIT_CONTEXT:
				return globalUnitContext != null;
			case OntomlPackage.CLASS_TYPE__KEYWORD_REFERENCES:
				return keywordReferences != null;
			case OntomlPackage.CLASS_TYPE__FREE_RELATIONS:
				return freeRelations != null;
			case OntomlPackage.CLASS_TYPE__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case OntomlPackage.CLASS_TYPE__GUID2:
				return GUID2_EDEFAULT == null ? guid2 != null : !GUID2_EDEFAULT.equals(guid2);
			case OntomlPackage.CLASS_TYPE__ID:
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
		result.append(", hierarchicalPosition: ");
		result.append(hierarchicalPosition);
		result.append(", guid: ");
		result.append(guid);
		result.append(", guid2: ");
		result.append(guid2);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CLASSTypeImpl
