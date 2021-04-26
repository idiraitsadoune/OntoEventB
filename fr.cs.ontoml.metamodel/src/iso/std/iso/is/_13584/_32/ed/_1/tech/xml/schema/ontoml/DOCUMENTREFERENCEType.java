/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOCUMENTREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType#getDocumentRef <em>Document Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTREFERENCEType()
 * @model extendedMetaData="name='DOCUMENT_REFERENCE_Type' kind='empty'"
 * @generated
 */
public interface DOCUMENTREFERENCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Ref</em>' attribute.
	 * @see #setDocumentRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTREFERENCEType_DocumentRef()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentId" required="true"
	 *        extendedMetaData="kind='attribute' name='document_ref'"
	 * @generated
	 */
	String getDocumentRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType#getDocumentRef <em>Document Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Ref</em>' attribute.
	 * @see #getDocumentRef()
	 * @generated
	 */
	void setDocumentRef(String value);

} // DOCUMENTREFERENCEType
