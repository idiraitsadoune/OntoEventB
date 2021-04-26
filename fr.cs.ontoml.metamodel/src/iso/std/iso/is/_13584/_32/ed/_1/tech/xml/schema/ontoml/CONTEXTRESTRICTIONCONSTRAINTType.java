/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTEXTRESTRICTIONCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTRESTRICTIONCONSTRAINTType#getContextParameterConstraints <em>Context Parameter Constraints</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTEXTRESTRICTIONCONSTRAINTType()
 * @model extendedMetaData="name='CONTEXT_RESTRICTION_CONSTRAINT_Type' kind='elementOnly'"
 * @generated
 */
public interface CONTEXTRESTRICTIONCONSTRAINTType extends PROPERTYCONSTRAINTType {
	/**
	 * Returns the value of the '<em><b>Context Parameter Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Parameter Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Parameter Constraints</em>' containment reference.
	 * @see #setContextParameterConstraints(CONTEXTPARAMETERCONSTRAINTSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTEXTRESTRICTIONCONSTRAINTType_ContextParameterConstraints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='context_parameter_constraints'"
	 * @generated
	 */
	CONTEXTPARAMETERCONSTRAINTSType getContextParameterConstraints();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTRESTRICTIONCONSTRAINTType#getContextParameterConstraints <em>Context Parameter Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Parameter Constraints</em>' containment reference.
	 * @see #getContextParameterConstraints()
	 * @generated
	 */
	void setContextParameterConstraints(CONTEXTPARAMETERCONSTRAINTSType value);

} // CONTEXTRESTRICTIONCONSTRAINTType
