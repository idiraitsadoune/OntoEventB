/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUBCLASSCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBCLASSCONSTRAINTType#getSubclasses <em>Subclasses</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBCLASSCONSTRAINTType()
 * @model extendedMetaData="name='SUBCLASS_CONSTRAINT_Type' kind='elementOnly'"
 * @generated
 */
public interface SUBCLASSCONSTRAINTType extends DOMAINCONSTRAINTType {
	/**
	 * Returns the value of the '<em><b>Subclasses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclasses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclasses</em>' containment reference.
	 * @see #setSubclasses(CLASSESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUBCLASSCONSTRAINTType_Subclasses()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subclasses'"
	 * @generated
	 */
	CLASSESREFERENCEType getSubclasses();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBCLASSCONSTRAINTType#getSubclasses <em>Subclasses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclasses</em>' containment reference.
	 * @see #getSubclasses()
	 * @generated
	 */
	void setSubclasses(CLASSESREFERENCEType value);

} // SUBCLASSCONSTRAINTType
