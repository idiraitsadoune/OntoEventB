/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOCUMENTIDENTIFIER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERType#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTIDENTIFIERType()
 * @model extendedMetaData="name='DOCUMENT_IDENTIFIER_Type' kind='elementOnly'"
 * @generated
 */
public interface DOCUMENTIDENTIFIERType extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOCUMENTIDENTIFIERType_Label()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	EList<DOCUMENTIDENTIFIERNAMELABELType> getLabel();

} // DOCUMENTIDENTIFIERType
