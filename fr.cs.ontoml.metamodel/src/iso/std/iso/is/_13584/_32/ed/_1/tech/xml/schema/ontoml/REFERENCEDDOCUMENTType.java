/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REFERENCEDDOCUMENT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDDOCUMENTType#getDocumentReference <em>Document Reference</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREFERENCEDDOCUMENTType()
 * @model extendedMetaData="name='REFERENCED_DOCUMENT_Type' kind='elementOnly'"
 * @generated
 */
public interface REFERENCEDDOCUMENTType extends SOURCEDOCUMENTType {
	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Reference</em>' containment reference.
	 * @see #setDocumentReference(DOCUMENTREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREFERENCEDDOCUMENTType_DocumentReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='document_reference'"
	 * @generated
	 */
	DOCUMENTREFERENCEType getDocumentReference();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDDOCUMENTType#getDocumentReference <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Reference</em>' containment reference.
	 * @see #getDocumentReference()
	 * @generated
	 */
	void setDocumentReference(DOCUMENTREFERENCEType value);

} // REFERENCEDDOCUMENTType
