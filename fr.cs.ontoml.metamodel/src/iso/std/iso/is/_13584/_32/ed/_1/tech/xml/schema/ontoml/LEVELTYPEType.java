/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEVELTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType#getLevels <em>Levels</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLEVELTYPEType()
 * @model extendedMetaData="name='LEVEL_TYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface LEVELTYPEType extends ANYTYPEType {
	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Levels</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference.
	 * @see #setLevels(LEVELType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLEVELTYPEType_Levels()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='levels'"
	 * @generated
	 */
	LEVELType getLevels();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType#getLevels <em>Levels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Levels</em>' containment reference.
	 * @see #getLevels()
	 * @generated
	 */
	void setLevels(LEVELType value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' containment reference.
	 * @see #setValueType(ANYTYPEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLEVELTYPEType_ValueType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value_type'"
	 * @generated
	 */
	ANYTYPEType getValueType();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType#getValueType <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' containment reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ANYTYPEType value);

} // LEVELTYPEType
