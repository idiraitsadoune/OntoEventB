/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DICUNITREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType#getDicUnitRef <em>Dic Unit Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICUNITREFERENCEType()
 * @model extendedMetaData="name='DIC_UNIT_REFERENCE_Type' kind='empty'"
 * @generated
 */
public interface DICUNITREFERENCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dic Unit Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dic Unit Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dic Unit Ref</em>' attribute.
	 * @see #setDicUnitRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICUNITREFERENCEType_DicUnitRef()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DicUnitId" required="true"
	 *        extendedMetaData="kind='attribute' name='dic_unit_ref'"
	 * @generated
	 */
	String getDicUnitRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType#getDicUnitRef <em>Dic Unit Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dic Unit Ref</em>' attribute.
	 * @see #getDicUnitRef()
	 * @generated
	 */
	void setDicUnitRef(String value);

} // DICUNITREFERENCEType
