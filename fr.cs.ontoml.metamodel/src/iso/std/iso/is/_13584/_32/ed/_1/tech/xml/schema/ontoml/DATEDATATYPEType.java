/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATEDATATYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATEDATATYPEType#getValueFormat <em>Value Format</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATEDATATYPEType()
 * @model extendedMetaData="name='DATE_DATA_TYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface DATEDATATYPEType extends ANYTYPEType {
	/**
	 * Returns the value of the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Format</em>' attribute.
	 * @see #setValueFormat(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDATEDATATYPEType_ValueFormat()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUEFORMATTYPEType"
	 *        extendedMetaData="kind='element' name='value_format'"
	 * @generated
	 */
	String getValueFormat();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATEDATATYPEType#getValueFormat <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Format</em>' attribute.
	 * @see #getValueFormat()
	 * @generated
	 */
	void setValueFormat(String value);

} // DATEDATATYPEType
