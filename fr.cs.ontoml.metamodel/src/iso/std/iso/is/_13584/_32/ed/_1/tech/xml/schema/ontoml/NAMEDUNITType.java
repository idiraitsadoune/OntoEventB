/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NAMEDUNIT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDUNITType#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNAMEDUNITType()
 * @model extendedMetaData="name='NAMED_UNIT_Type' kind='elementOnly'"
 * @generated
 */
public interface NAMEDUNITType extends UNITType {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(DIMENSIONALEXPONENTSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNAMEDUNITType_Dimensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dimensions'"
	 * @generated
	 */
	DIMENSIONALEXPONENTSType getDimensions();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDUNITType#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(DIMENSIONALEXPONENTSType value);

} // NAMEDUNITType
