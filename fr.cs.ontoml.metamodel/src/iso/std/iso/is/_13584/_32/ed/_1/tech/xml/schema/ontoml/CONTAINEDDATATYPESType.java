/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTAINEDDATATYPES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDATATYPESType#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTAINEDDATATYPESType()
 * @model extendedMetaData="name='CONTAINED_DATATYPES_Type' kind='elementOnly'"
 * @generated
 */
public interface CONTAINEDDATATYPESType extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTAINEDDATATYPESType_Datatype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DATATYPEType> getDatatype();

} // CONTAINEDDATATYPESType
