/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROPERTYCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCONSTRAINTType#getConstrainedProperty <em>Constrained Property</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYCONSTRAINTType()
 * @model abstract="true"
 *        extendedMetaData="name='PROPERTY_CONSTRAINT_Type' kind='elementOnly'"
 * @generated
 */
public interface PROPERTYCONSTRAINTType extends CONSTRAINTType {
	/**
	 * Returns the value of the '<em><b>Constrained Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Property</em>' containment reference.
	 * @see #setConstrainedProperty(PROPERTYREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYCONSTRAINTType_ConstrainedProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='constrained_property'"
	 * @generated
	 */
	PROPERTYREFERENCEType getConstrainedProperty();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCONSTRAINTType#getConstrainedProperty <em>Constrained Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Property</em>' containment reference.
	 * @see #getConstrainedProperty()
	 * @generated
	 */
	void setConstrainedProperty(PROPERTYREFERENCEType value);

} // PROPERTYCONSTRAINTType
