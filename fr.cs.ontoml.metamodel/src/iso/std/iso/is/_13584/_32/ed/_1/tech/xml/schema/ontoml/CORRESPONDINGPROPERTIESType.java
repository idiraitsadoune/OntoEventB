/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CORRESPONDINGPROPERTIES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CORRESPONDINGPROPERTIESType#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCORRESPONDINGPROPERTIESType()
 * @model extendedMetaData="name='CORRESPONDING_PROPERTIES_type' kind='elementOnly'"
 * @generated
 */
public interface CORRESPONDINGPROPERTIESType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCORRESPONDINGPROPERTIESType_Mapping()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mapping'"
	 * @generated
	 */
	EList<PROPERTYMAPPINGType> getMapping();

} // CORRESPONDINGPROPERTIESType
