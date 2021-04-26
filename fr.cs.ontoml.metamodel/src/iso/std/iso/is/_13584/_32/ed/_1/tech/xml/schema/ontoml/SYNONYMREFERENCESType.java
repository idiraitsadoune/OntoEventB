/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SYNONYMREFERENCES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMREFERENCESType#getSynonymRef <em>Synonym Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSYNONYMREFERENCESType()
 * @model extendedMetaData="name='SYNONYM_REFERENCES_Type' kind='elementOnly'"
 * @generated
 */
public interface SYNONYMREFERENCESType extends EObject {
	/**
	 * Returns the value of the '<em><b>Synonym Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonym Ref</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonym Ref</em>' attribute list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSYNONYMREFERENCESType_SynonymRef()
	 * @model unique="false" dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMREFERENCEType" required="true"
	 *        extendedMetaData="kind='element' name='synonym_ref'"
	 * @generated
	 */
	EList<String> getSynonymRef();

} // SYNONYMREFERENCESType
