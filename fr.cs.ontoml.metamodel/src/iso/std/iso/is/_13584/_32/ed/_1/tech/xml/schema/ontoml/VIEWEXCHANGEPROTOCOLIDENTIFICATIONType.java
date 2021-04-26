/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VIEWEXCHANGEPROTOCOLIDENTIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getSourceDocumentIdentifier <em>Source Document Identifier</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getStatus <em>Status</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getName <em>Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getDate <em>Date</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getApplication <em>Application</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType()
 * @model extendedMetaData="name='VIEW_EXCHANGE_PROTOCOL_IDENTIFICATION_Type' kind='elementOnly'"
 * @generated
 */
public interface VIEWEXCHANGEPROTOCOLIDENTIFICATIONType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Document Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Document Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Document Identifier</em>' attribute.
	 * @see #setSourceDocumentIdentifier(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_SourceDocumentIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='source_document_identifier'"
	 * @generated
	 */
	String getSourceDocumentIdentifier();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getSourceDocumentIdentifier <em>Source Document Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Document Identifier</em>' attribute.
	 * @see #getSourceDocumentIdentifier()
	 * @generated
	 */
	void setSourceDocumentIdentifier(String value);

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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='date'"
	 * @generated
	 */
	BigInteger getDate();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Application()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='application'"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Level()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='level'"
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

} // VIEWEXCHANGEPROTOCOLIDENTIFICATIONType
