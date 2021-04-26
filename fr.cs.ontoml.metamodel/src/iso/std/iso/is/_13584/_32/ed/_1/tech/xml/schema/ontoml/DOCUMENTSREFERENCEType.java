/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOCUMENTSREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTSREFERENCEType()
 * @model extendedMetaData="name='DOCUMENTS_REFERENCE_Type' kind='elementOnly'"
 * @generated
 */
public interface DOCUMENTSREFERENCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTSREFERENCEType_Document()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='document'"
	 * @generated
	 */
	EList<DOCUMENTREFERENCEType> getDocument();

} // DOCUMENTSREFERENCEType
