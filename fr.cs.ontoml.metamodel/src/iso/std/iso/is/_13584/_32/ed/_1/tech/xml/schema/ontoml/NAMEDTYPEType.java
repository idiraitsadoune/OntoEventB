/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NAMEDTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDTYPEType#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNAMEDTYPEType()
 * @model extendedMetaData="name='NAMED_TYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface NAMEDTYPEType extends ANYTYPEType {
	/**
	 * Returns the value of the '<em><b>Referred Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Type</em>' containment reference.
	 * @see #setReferredType(DATATYPEREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNAMEDTYPEType_ReferredType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referred_type'"
	 * @generated
	 */
	DATATYPEREFERENCEType getReferredType();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDTYPEType#getReferredType <em>Referred Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Type</em>' containment reference.
	 * @see #getReferredType()
	 * @generated
	 */
	void setReferredType(DATATYPEREFERENCEType value);

} // NAMEDTYPEType
