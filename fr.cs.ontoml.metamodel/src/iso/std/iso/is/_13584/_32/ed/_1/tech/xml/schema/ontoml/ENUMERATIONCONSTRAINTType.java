/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENUMERATIONCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType#getSubset <em>Subset</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType#getValueMeaning <em>Value Meaning</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getENUMERATIONCONSTRAINTType()
 * @model extendedMetaData="name='ENUMERATION_CONSTRAINT_Type' kind='elementOnly'"
 * @generated
 */
public interface ENUMERATIONCONSTRAINTType extends DOMAINCONSTRAINTType {
	/**
	 * Returns the value of the '<em><b>Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset</em>' containment reference.
	 * @see #setSubset(SUBSETType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getENUMERATIONCONSTRAINTType_Subset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subset'"
	 * @generated
	 */
	SUBSETType getSubset();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType#getSubset <em>Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subset</em>' containment reference.
	 * @see #getSubset()
	 * @generated
	 */
	void setSubset(SUBSETType value);

	/**
	 * Returns the value of the '<em><b>Value Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Meaning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Meaning</em>' containment reference.
	 * @see #setValueMeaning(NONQUANTITATIVEINTTYPEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getENUMERATIONCONSTRAINTType_ValueMeaning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value_meaning'"
	 * @generated
	 */
	NONQUANTITATIVEINTTYPEType getValueMeaning();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType#getValueMeaning <em>Value Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Meaning</em>' containment reference.
	 * @see #getValueMeaning()
	 * @generated
	 */
	void setValueMeaning(NONQUANTITATIVEINTTYPEType value);

} // ENUMERATIONCONSTRAINTType
