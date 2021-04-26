/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CATEGORIZATIONCLASS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CATEGORIZATIONCLASSType#getCategorizationClassSuperclasses <em>Categorization Class Superclasses</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCATEGORIZATIONCLASSType()
 * @model extendedMetaData="name='CATEGORIZATION_CLASS_Type' kind='elementOnly'"
 * @generated
 */
public interface CATEGORIZATIONCLASSType extends CLASSType {
	/**
	 * Returns the value of the '<em><b>Categorization Class Superclasses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorization Class Superclasses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorization Class Superclasses</em>' containment reference.
	 * @see #setCategorizationClassSuperclasses(CLASSESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCATEGORIZATIONCLASSType_CategorizationClassSuperclasses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='categorization_class_superclasses'"
	 * @generated
	 */
	CLASSESREFERENCEType getCategorizationClassSuperclasses();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CATEGORIZATIONCLASSType#getCategorizationClassSuperclasses <em>Categorization Class Superclasses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorization Class Superclasses</em>' containment reference.
	 * @see #getCategorizationClassSuperclasses()
	 * @generated
	 */
	void setCategorizationClassSuperclasses(CLASSESREFERENCEType value);

} // CATEGORIZATIONCLASSType
