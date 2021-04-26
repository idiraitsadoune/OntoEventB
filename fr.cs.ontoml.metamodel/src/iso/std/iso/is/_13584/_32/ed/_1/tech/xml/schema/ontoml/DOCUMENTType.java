/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOCUMENT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getNameScope <em>Name Scope</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfCurrentVersion <em>Date Of Current Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getRevision <em>Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getStatus <em>Status</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getTranslation <em>Translation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#isIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getSynonymousNames <em>Synonymous Names</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getShortName <em>Short Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getIcon <em>Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDefinition <em>Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getNote <em>Note</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getRemark <em>Remark</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getAuthors <em>Authors</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getPublishingOrganisation <em>Publishing Organisation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getContent <em>Content</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getGuid <em>Guid</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getGuid2 <em>Guid2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType()
 * @model extendedMetaData="name='DOCUMENT_Type' kind='elementOnly'"
 * @generated
 */
public interface DOCUMENTType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Scope</em>' containment reference.
	 * @see #setNameScope(CLASSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_NameScope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name_scope'"
	 * @generated
	 */
	CLASSREFERENCEType getNameScope();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getNameScope <em>Name Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Scope</em>' containment reference.
	 * @see #getNameScope()
	 * @generated
	 */
	void setNameScope(CLASSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Date Of Original Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Original Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Original Definition</em>' attribute.
	 * @see #setDateOfOriginalDefinition(XMLGregorianCalendar)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_DateOfOriginalDefinition()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETYPEType"
	 *        extendedMetaData="kind='element' name='date_of_original_definition'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfOriginalDefinition();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Original Definition</em>' attribute.
	 * @see #getDateOfOriginalDefinition()
	 * @generated
	 */
	void setDateOfOriginalDefinition(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Of Current Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Current Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Current Version</em>' attribute.
	 * @see #setDateOfCurrentVersion(XMLGregorianCalendar)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_DateOfCurrentVersion()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETYPEType"
	 *        extendedMetaData="kind='element' name='date_of_current_version'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfCurrentVersion();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfCurrentVersion <em>Date Of Current Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Current Version</em>' attribute.
	 * @see #getDateOfCurrentVersion()
	 * @generated
	 */
	void setDateOfCurrentVersion(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Of Current Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Current Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Current Revision</em>' attribute.
	 * @see #setDateOfCurrentRevision(XMLGregorianCalendar)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_DateOfCurrentRevision()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETYPEType"
	 *        extendedMetaData="kind='element' name='date_of_current_revision'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfCurrentRevision();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Current Revision</em>' attribute.
	 * @see #getDateOfCurrentRevision()
	 * @generated
	 */
	void setDateOfCurrentRevision(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Revision()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REVISIONTYPEType" required="true"
	 *        extendedMetaData="kind='element' name='revision'"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Status()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STATUSType"
	 *        extendedMetaData="kind='element' name='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(TRANSLATIONType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation'"
	 * @generated
	 */
	TRANSLATIONType getTranslation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(TRANSLATIONType value);

	/**
	 * Returns the value of the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Language</em>' containment reference.
	 * @see #setSourceLanguage(LANGUAGEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_SourceLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source_language'"
	 * @generated
	 */
	LANGUAGEType getSourceLanguage();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getSourceLanguage <em>Source Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Language</em>' containment reference.
	 * @see #getSourceLanguage()
	 * @generated
	 */
	void setSourceLanguage(LANGUAGEType value);

	/**
	 * Returns the value of the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Deprecated</em>' attribute.
	 * @see #isSetIsDeprecated()
	 * @see #unsetIsDeprecated()
	 * @see #setIsDeprecated(boolean)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_IsDeprecated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='is_deprecated'"
	 * @generated
	 */
	boolean isIsDeprecated();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#isIsDeprecated <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deprecated</em>' attribute.
	 * @see #isSetIsDeprecated()
	 * @see #unsetIsDeprecated()
	 * @see #isIsDeprecated()
	 * @generated
	 */
	void setIsDeprecated(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#isIsDeprecated <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDeprecated()
	 * @see #isIsDeprecated()
	 * @see #setIsDeprecated(boolean)
	 * @generated
	 */
	void unsetIsDeprecated();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#isIsDeprecated <em>Is Deprecated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Deprecated</em>' attribute is set.
	 * @see #unsetIsDeprecated()
	 * @see #isIsDeprecated()
	 * @see #setIsDeprecated(boolean)
	 * @generated
	 */
	boolean isSetIsDeprecated();

	/**
	 * Returns the value of the '<em><b>Is Deprecated Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Deprecated Interpretation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Deprecated Interpretation</em>' containment reference.
	 * @see #setIsDeprecatedInterpretation(TEXTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_IsDeprecatedInterpretation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='is_deprecated_interpretation'"
	 * @generated
	 */
	TEXTType getIsDeprecatedInterpretation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deprecated Interpretation</em>' containment reference.
	 * @see #getIsDeprecatedInterpretation()
	 * @generated
	 */
	void setIsDeprecatedInterpretation(TEXTType value);

	/**
	 * Returns the value of the '<em><b>Preferred Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Name</em>' containment reference.
	 * @see #setPreferredName(PREFERREDNAMEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_PreferredName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='preferred_name'"
	 * @generated
	 */
	PREFERREDNAMEType getPreferredName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getPreferredName <em>Preferred Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Name</em>' containment reference.
	 * @see #getPreferredName()
	 * @generated
	 */
	void setPreferredName(PREFERREDNAMEType value);

	/**
	 * Returns the value of the '<em><b>Synonymous Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonymous Names</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonymous Names</em>' containment reference.
	 * @see #setSynonymousNames(SYNONYMOUSNAMEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_SynonymousNames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synonymous_names'"
	 * @generated
	 */
	SYNONYMOUSNAMEType getSynonymousNames();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getSynonymousNames <em>Synonymous Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synonymous Names</em>' containment reference.
	 * @see #getSynonymousNames()
	 * @generated
	 */
	void setSynonymousNames(SYNONYMOUSNAMEType value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' containment reference.
	 * @see #setShortName(SHORTNAMEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_ShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='short_name'"
	 * @generated
	 */
	SHORTNAMEType getShortName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getShortName <em>Short Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' containment reference.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(SHORTNAMEType value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(GRAPHICSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon'"
	 * @generated
	 */
	GRAPHICSType getIcon();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(GRAPHICSType value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(TEXTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Definition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definition'"
	 * @generated
	 */
	TEXTType getDefinition();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(TEXTType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(TEXTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note'"
	 * @generated
	 */
	TEXTType getNote();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(TEXTType value);

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference.
	 * @see #setRemark(TEXTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Remark()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remark'"
	 * @generated
	 */
	TEXTType getRemark();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getRemark <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' containment reference.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(TEXTType value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference.
	 * @see #setAuthors(AUTHORSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Authors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authors'"
	 * @generated
	 */
	AUTHORSType getAuthors();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getAuthors <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authors</em>' containment reference.
	 * @see #getAuthors()
	 * @generated
	 */
	void setAuthors(AUTHORSType value);

	/**
	 * Returns the value of the '<em><b>Publishing Organisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishing Organisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Organisation</em>' containment reference.
	 * @see #setPublishingOrganisation(ORGANIZATIONType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_PublishingOrganisation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='publishing_organisation'"
	 * @generated
	 */
	ORGANIZATIONType getPublishingOrganisation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getPublishingOrganisation <em>Publishing Organisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishing Organisation</em>' containment reference.
	 * @see #getPublishingOrganisation()
	 * @generated
	 */
	void setPublishingOrganisation(ORGANIZATIONType value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(DOCUMENTCONTENTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content'"
	 * @generated
	 */
	DOCUMENTCONTENTType getContent();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(DOCUMENTCONTENTType value);

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Guid()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EptosGUID"
	 *        extendedMetaData="kind='attribute' name='guid'"
	 * @generated
	 */
	String getGuid();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(String value);

	/**
	 * Returns the value of the '<em><b>Guid2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guid2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid2</em>' attribute.
	 * @see #setGuid2(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Guid2()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EptosGUID"
	 *        extendedMetaData="kind='attribute' name='guid2'"
	 * @generated
	 */
	String getGuid2();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getGuid2 <em>Guid2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid2</em>' attribute.
	 * @see #getGuid2()
	 * @generated
	 */
	void setGuid2(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTType_Id()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentId" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DOCUMENTType
