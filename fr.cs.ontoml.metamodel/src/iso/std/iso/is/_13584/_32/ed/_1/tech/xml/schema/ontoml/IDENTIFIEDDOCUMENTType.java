/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDENTIFIEDDOCUMENT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.IDENTIFIEDDOCUMENTType#getDocumentIdentifier <em>Document Identifier</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getIDENTIFIEDDOCUMENTType()
 * @model extendedMetaData="name='IDENTIFIED_DOCUMENT_Type' kind='elementOnly'"
 * @generated
 */
public interface IDENTIFIEDDOCUMENTType extends SOURCEDOCUMENTType {
	/**
	 * Returns the value of the '<em><b>Document Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Identifier</em>' containment reference.
	 * @see #setDocumentIdentifier(DOCUMENTIDENTIFIERType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getIDENTIFIEDDOCUMENTType_DocumentIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='document_identifier'"
	 * @generated
	 */
	DOCUMENTIDENTIFIERType getDocumentIdentifier();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.IDENTIFIEDDOCUMENTType#getDocumentIdentifier <em>Document Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Identifier</em>' containment reference.
	 * @see #getDocumentIdentifier()
	 * @generated
	 */
	void setDocumentIdentifier(DOCUMENTIDENTIFIERType value);

} // IDENTIFIEDDOCUMENTType
