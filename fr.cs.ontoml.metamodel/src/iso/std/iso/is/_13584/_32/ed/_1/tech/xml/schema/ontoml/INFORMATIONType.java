/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INFORMATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getRevision <em>Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getSynonymousNames <em>Synonymous Names</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getShortName <em>Short Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getIcon <em>Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getNote <em>Note</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINFORMATIONType()
 * @model extendedMetaData="name='INFORMATION_Type' kind='elementOnly'"
 * @generated
 */
public interface INFORMATIONType extends EObject {
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINFORMATIONType_Revision()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REVISIONTYPEType" required="true"
	 *        extendedMetaData="kind='element' name='revision'"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINFORMATIONType_PreferredName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='preferred_name'"
	 * @generated
	 */
	PREFERREDNAMEType getPreferredName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getPreferredName <em>Preferred Name</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINFORMATIONType_SynonymousNames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synonymous_names'"
	 * @generated
	 */
	SYNONYMOUSNAMEType getSynonymousNames();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getSynonymousNames <em>Synonymous Names</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINFORMATIONType_ShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='short_name'"
	 * @generated
	 */
	SHORTNAMEType getShortName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getShortName <em>Short Name</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINFORMATIONType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon'"
	 * @generated
	 */
	GRAPHICSType getIcon();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(GRAPHICSType value);

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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINFORMATIONType_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note'"
	 * @generated
	 */
	TEXTType getNote();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getNote <em>Note</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINFORMATIONType_Remark()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remark'"
	 * @generated
	 */
	TEXTType getRemark();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType#getRemark <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' containment reference.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(TEXTType value);

} // INFORMATIONType
