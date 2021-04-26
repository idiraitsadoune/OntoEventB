/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONFIGURATIONCONTROLCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONFIGURATIONCONTROLCONSTRAINTType()
 * @model extendedMetaData="name='CONFIGURATION_CONTROL_CONSTRAINT_Type' kind='elementOnly'"
 * @generated
 */
public interface CONFIGURATIONCONTROLCONSTRAINTType extends CLASSCONSTRAINTType {
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(PRECONDITIONType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONFIGURATIONCONTROLCONSTRAINTType_Precondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='precondition'"
	 * @generated
	 */
	PRECONDITIONType getPrecondition();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(PRECONDITIONType value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference.
	 * @see #setPostcondition(POSTCONDITIONType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONFIGURATIONCONTROLCONSTRAINTType_Postcondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='postcondition'"
	 * @generated
	 */
	POSTCONDITIONType getPostcondition();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType#getPostcondition <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' containment reference.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(POSTCONDITIONType value);

} // CONFIGURATIONCONTROLCONSTRAINTType
