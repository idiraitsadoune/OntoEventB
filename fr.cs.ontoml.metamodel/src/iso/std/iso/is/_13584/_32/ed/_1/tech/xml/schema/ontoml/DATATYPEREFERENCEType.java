/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATATYPEREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType#getDatatypeRef <em>Datatype Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEREFERENCEType()
 * @model extendedMetaData="name='DATATYPE_REFERENCE_Type' kind='empty'"
 * @generated
 */
public interface DATATYPEREFERENCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatype Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Ref</em>' attribute.
	 * @see #setDatatypeRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATATYPEREFERENCEType_DatatypeRef()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DataTypeId" required="true"
	 *        extendedMetaData="kind='attribute' name='datatype_ref'"
	 * @generated
	 */
	String getDatatypeRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType#getDatatypeRef <em>Datatype Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype Ref</em>' attribute.
	 * @see #getDatatypeRef()
	 * @generated
	 */
	void setDatatypeRef(String value);

} // DATATYPEREFERENCEType
