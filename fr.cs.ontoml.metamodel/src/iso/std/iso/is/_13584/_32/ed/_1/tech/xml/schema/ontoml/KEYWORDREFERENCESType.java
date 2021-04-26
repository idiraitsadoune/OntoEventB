/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KEYWORDREFERENCES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDREFERENCESType#getKeywordRef <em>Keyword Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getKEYWORDREFERENCESType()
 * @model extendedMetaData="name='KEYWORD_REFERENCES_Type' kind='elementOnly'"
 * @generated
 */
public interface KEYWORDREFERENCESType extends EObject {
	/**
	 * Returns the value of the '<em><b>Keyword Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword Ref</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword Ref</em>' attribute list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getKEYWORDREFERENCESType_KeywordRef()
	 * @model unique="false" dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDREFERENCEType" required="true"
	 *        extendedMetaData="kind='element' name='keyword_ref'"
	 * @generated
	 */
	EList<String> getKeywordRef();

} // KEYWORDREFERENCESType
