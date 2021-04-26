/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEPENDENTPDET Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DEPENDENTPDETType#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDEPENDENTPDETType()
 * @model extendedMetaData="name='DEPENDENT_P_DET_Type' kind='elementOnly'"
 * @generated
 */
public interface DEPENDENTPDETType extends PROPERTYType {
	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference.
	 * @see #setDependsOn(PROPERTIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDEPENDENTPDETType_DependsOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='depends_on'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getDependsOn();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DEPENDENTPDETType#getDependsOn <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' containment reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(PROPERTIESREFERENCEType value);

} // DEPENDENTPDETType
