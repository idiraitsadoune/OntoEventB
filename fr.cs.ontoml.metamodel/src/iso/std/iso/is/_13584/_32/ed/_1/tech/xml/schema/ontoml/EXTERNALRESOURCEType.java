/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EXTERNALRESOURCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALRESOURCEType#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getEXTERNALRESOURCEType()
 * @model abstract="true"
 *        extendedMetaData="name='EXTERNAL_RESOURCE_Type' kind='elementOnly'"
 * @generated
 */
public interface EXTERNALRESOURCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getEXTERNALRESOURCEType_File()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='file'"
	 * @generated
	 */
	EList<HTTPFILEType> getFile();

} // EXTERNALRESOURCEType
