/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRANSLATIONDATA Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getLanguage <em>Language</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getResponsibleTranslator <em>Responsible Translator</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getTranslationRevision <em>Translation Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getDateOfCurrentTranslationRevision <em>Date Of Current Translation Revision</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getTRANSLATIONDATAType()
 * @model extendedMetaData="name='TRANSLATION_DATA_Type' kind='elementOnly'"
 * @generated
 */
public interface TRANSLATIONDATAType extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LANGUAGEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getTRANSLATIONDATAType_Language()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='language'"
	 * @generated
	 */
	LANGUAGEType getLanguage();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LANGUAGEType value);

	/**
	 * Returns the value of the '<em><b>Responsible Translator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Translator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Translator</em>' containment reference.
	 * @see #setResponsibleTranslator(SUPPLIERREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getTRANSLATIONDATAType_ResponsibleTranslator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='responsible_translator'"
	 * @generated
	 */
	SUPPLIERREFERENCEType getResponsibleTranslator();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getResponsibleTranslator <em>Responsible Translator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Translator</em>' containment reference.
	 * @see #getResponsibleTranslator()
	 * @generated
	 */
	void setResponsibleTranslator(SUPPLIERREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Translation Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Revision</em>' attribute.
	 * @see #setTranslationRevision(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getTRANSLATIONDATAType_TranslationRevision()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REVISIONTYPEType" required="true"
	 *        extendedMetaData="kind='element' name='translation_revision'"
	 * @generated
	 */
	String getTranslationRevision();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getTranslationRevision <em>Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Revision</em>' attribute.
	 * @see #getTranslationRevision()
	 * @generated
	 */
	void setTranslationRevision(String value);

	/**
	 * Returns the value of the '<em><b>Date Of Current Translation Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Current Translation Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Current Translation Revision</em>' attribute.
	 * @see #setDateOfCurrentTranslationRevision(XMLGregorianCalendar)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getTRANSLATIONDATAType_DateOfCurrentTranslationRevision()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETYPEType"
	 *        extendedMetaData="kind='element' name='date_of_current_translation_revision'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfCurrentTranslationRevision();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType#getDateOfCurrentTranslationRevision <em>Date Of Current Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Current Translation Revision</em>' attribute.
	 * @see #getDateOfCurrentTranslationRevision()
	 * @generated
	 */
	void setDateOfCurrentTranslationRevision(XMLGregorianCalendar value);

} // TRANSLATIONDATAType
