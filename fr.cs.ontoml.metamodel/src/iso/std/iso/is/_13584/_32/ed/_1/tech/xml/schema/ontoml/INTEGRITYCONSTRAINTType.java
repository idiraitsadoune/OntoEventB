/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INTEGRITYCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType#getRedefinedDomain <em>Redefined Domain</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINTEGRITYCONSTRAINTType()
 * @model extendedMetaData="name='INTEGRITY_CONSTRAINT_Type' kind='elementOnly'"
 * @generated
 */
public interface INTEGRITYCONSTRAINTType extends PROPERTYCONSTRAINTType {
	/**
	 * Returns the value of the '<em><b>Redefined Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Domain</em>' containment reference.
	 * @see #setRedefinedDomain(DOMAINCONSTRAINTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINTEGRITYCONSTRAINTType_RedefinedDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='redefined_domain'"
	 * @generated
	 */
	DOMAINCONSTRAINTType getRedefinedDomain();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType#getRedefinedDomain <em>Redefined Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Domain</em>' containment reference.
	 * @see #getRedefinedDomain()
	 * @generated
	 */
	void setRedefinedDomain(DOMAINCONSTRAINTType value);

} // INTEGRITYCONSTRAINTType
