/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EXTERNALGRAPHICS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALGRAPHICSType#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getEXTERNALGRAPHICSType()
 * @model extendedMetaData="name='EXTERNAL_GRAPHICS_Type' kind='elementOnly'"
 * @generated
 */
public interface EXTERNALGRAPHICSType extends GRAPHICSType {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(EXTERNALFILESType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getEXTERNALGRAPHICSType_Representation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='representation'"
	 * @generated
	 */
	EXTERNALFILESType getRepresentation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALGRAPHICSType#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(EXTERNALFILESType value);

} // EXTERNALGRAPHICSType
