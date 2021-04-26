/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STRINGDICVALUE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGDICVALUEType#getValueCode <em>Value Code</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSTRINGDICVALUEType()
 * @model extendedMetaData="name='STRING_DIC_VALUE_Type' kind='elementOnly'"
 * @generated
 */
public interface STRINGDICVALUEType extends DICVALUEType {
	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Code</em>' attribute.
	 * @see #setValueCode(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSTRINGDICVALUEType_ValueCode()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUECODETYPEType" required="true"
	 *        extendedMetaData="kind='element' name='value_code'"
	 * @generated
	 */
	String getValueCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGDICVALUEType#getValueCode <em>Value Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Code</em>' attribute.
	 * @see #getValueCode()
	 * @generated
	 */
	void setValueCode(String value);

} // STRINGDICVALUEType
