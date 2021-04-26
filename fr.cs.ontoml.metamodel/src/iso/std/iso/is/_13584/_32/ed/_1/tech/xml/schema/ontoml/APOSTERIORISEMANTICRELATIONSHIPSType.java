/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APOSTERIORISEMANTICRELATIONSHIPS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPSType#getAPosterioriSemanticRelationship <em>APosteriori Semantic Relationship</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORISEMANTICRELATIONSHIPSType()
 * @model extendedMetaData="name='A_POSTERIORI_SEMANTIC_RELATIONSHIPS_Type' kind='elementOnly'"
 * @generated
 */
public interface APOSTERIORISEMANTICRELATIONSHIPSType extends EObject {
	/**
	 * Returns the value of the '<em><b>APosteriori Semantic Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APosteriori Semantic Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APosteriori Semantic Relationship</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORISEMANTICRELATIONSHIPSType_APosterioriSemanticRelationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='a_posteriori_semantic_relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<APOSTERIORISEMANTICRELATIONSHIPType> getAPosterioriSemanticRelationship();

} // APOSTERIORISEMANTICRELATIONSHIPSType
