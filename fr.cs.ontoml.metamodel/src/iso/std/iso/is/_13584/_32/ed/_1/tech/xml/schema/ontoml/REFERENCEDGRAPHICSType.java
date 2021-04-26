/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REFERENCEDGRAPHICS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDGRAPHICSType#getGraphicsReference <em>Graphics Reference</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREFERENCEDGRAPHICSType()
 * @model extendedMetaData="name='REFERENCED_GRAPHICS_Type' kind='elementOnly'"
 * @generated
 */
public interface REFERENCEDGRAPHICSType extends GRAPHICSType {
	/**
	 * Returns the value of the '<em><b>Graphics Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphics Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics Reference</em>' containment reference.
	 * @see #setGraphicsReference(DOCUMENTREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREFERENCEDGRAPHICSType_GraphicsReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='graphics_reference'"
	 * @generated
	 */
	DOCUMENTREFERENCEType getGraphicsReference();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDGRAPHICSType#getGraphicsReference <em>Graphics Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics Reference</em>' containment reference.
	 * @see #getGraphicsReference()
	 * @generated
	 */
	void setGraphicsReference(DOCUMENTREFERENCEType value);

} // REFERENCEDGRAPHICSType
