/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DICTIONARYREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType#getDictionaryRef <em>Dictionary Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYREFERENCEType()
 * @model extendedMetaData="name='DICTIONARY_REFERENCE_Type' kind='empty'"
 * @generated
 */
public interface DICTIONARYREFERENCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dictionary Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary Ref</em>' attribute.
	 * @see #setDictionaryRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYREFERENCEType_DictionaryRef()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntologyId" required="true"
	 *        extendedMetaData="kind='attribute' name='dictionary_ref'"
	 * @generated
	 */
	String getDictionaryRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType#getDictionaryRef <em>Dictionary Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Ref</em>' attribute.
	 * @see #getDictionaryRef()
	 * @generated
	 */
	void setDictionaryRef(String value);

} // DICTIONARYREFERENCEType
