/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATATYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getNameScope <em>Name Scope</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfCurrentVersion <em>Date Of Current Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getRevision <em>Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getStatus <em>Status</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getTranslation <em>Translation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#isIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getSynonymousNames <em>Synonymous Names</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getShortName <em>Short Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getIcon <em>Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getValueSpecification <em>Value Specification</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getGuid <em>Guid</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getGuid2 <em>Guid2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType()
 * @model extendedMetaData="name='DATATYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface DATATYPEType extends EObject {
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_NameScope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name_scope'"
	 * @generated
	 */
	CLASSREFERENCEType getNameScope();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getNameScope <em>Name Scope</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_DateOfOriginalDefinition()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETYPEType"
	 *        extendedMetaData="kind='element' name='date_of_original_definition'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfOriginalDefinition();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}' attribute.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_DateOfCurrentVersion()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETYPEType"
	 *        extendedMetaData="kind='element' name='date_of_current_version'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfCurrentVersion();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfCurrentVersion <em>Date Of Current Version</em>}' attribute.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_DateOfCurrentRevision()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETYPEType"
	 *        extendedMetaData="kind='element' name='date_of_current_revision'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfCurrentRevision();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getDateOfCurrentRevision <em>Date Of Current Revision</em>}' attribute.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_Revision()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REVISIONTYPEType" required="true"
	 *        extendedMetaData="kind='element' name='revision'"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getRevision <em>Revision</em>}' attribute.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_Status()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STATUSType"
	 *        extendedMetaData="kind='element' name='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getStatus <em>Status</em>}' attribute.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation'"
	 * @generated
	 */
	TRANSLATIONType getTranslation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getTranslation <em>Translation</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_SourceLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source_language'"
	 * @generated
	 */
	LANGUAGEType getSourceLanguage();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getSourceLanguage <em>Source Language</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_IsDeprecated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='is_deprecated'"
	 * @generated
	 */
	boolean isIsDeprecated();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#isIsDeprecated <em>Is Deprecated</em>}' attribute.
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
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#isIsDeprecated <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDeprecated()
	 * @see #isIsDeprecated()
	 * @see #setIsDeprecated(boolean)
	 * @generated
	 */
	void unsetIsDeprecated();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#isIsDeprecated <em>Is Deprecated</em>}' attribute is set.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_IsDeprecatedInterpretation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='is_deprecated_interpretation'"
	 * @generated
	 */
	TEXTType getIsDeprecatedInterpretation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_PreferredName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='preferred_name'"
	 * @generated
	 */
	PREFERREDNAMEType getPreferredName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getPreferredName <em>Preferred Name</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_SynonymousNames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synonymous_names'"
	 * @generated
	 */
	SYNONYMOUSNAMEType getSynonymousNames();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getSynonymousNames <em>Synonymous Names</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_ShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='short_name'"
	 * @generated
	 */
	SHORTNAMEType getShortName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getShortName <em>Short Name</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon'"
	 * @generated
	 */
	GRAPHICSType getIcon();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(GRAPHICSType value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' containment reference.
	 * @see #setTypeDefinition(ANYTYPEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_TypeDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type_definition'"
	 * @generated
	 */
	ANYTYPEType getTypeDefinition();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getTypeDefinition <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' containment reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(ANYTYPEType value);

	/**
	 * Returns the value of the '<em><b>Value Specification</b></em>' attribute.
	 * The literals are from the enumeration {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Specification</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType
	 * @see #isSetValueSpecification()
	 * @see #unsetValueSpecification()
	 * @see #setValueSpecification(VALUESPECIFICATIONType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_ValueSpecification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='value_specification'"
	 * @generated
	 */
	VALUESPECIFICATIONType getValueSpecification();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getValueSpecification <em>Value Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Specification</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUESPECIFICATIONType
	 * @see #isSetValueSpecification()
	 * @see #unsetValueSpecification()
	 * @see #getValueSpecification()
	 * @generated
	 */
	void setValueSpecification(VALUESPECIFICATIONType value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getValueSpecification <em>Value Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueSpecification()
	 * @see #getValueSpecification()
	 * @see #setValueSpecification(VALUESPECIFICATIONType)
	 * @generated
	 */
	void unsetValueSpecification();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getValueSpecification <em>Value Specification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Specification</em>' attribute is set.
	 * @see #unsetValueSpecification()
	 * @see #getValueSpecification()
	 * @see #setValueSpecification(VALUESPECIFICATIONType)
	 * @generated
	 */
	boolean isSetValueSpecification();

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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_Guid()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EptosGUID"
	 *        extendedMetaData="kind='attribute' name='guid'"
	 * @generated
	 */
	String getGuid();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getGuid <em>Guid</em>}' attribute.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_Guid2()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EptosGUID"
	 *        extendedMetaData="kind='attribute' name='guid2'"
	 * @generated
	 */
	String getGuid2();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getGuid2 <em>Guid2</em>}' attribute.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEType_Id()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DataTypeId" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DATATYPEType
