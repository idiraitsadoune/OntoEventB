/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ONTOML Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getHeader <em>Header</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getONTOMLType()
 * @model extendedMetaData="name='ONTOML_Type' kind='elementOnly'"
 * @generated
 */
public interface ONTOMLType extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HEADERType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getONTOMLType_Header()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='header'"
	 * @generated
	 */
	HEADERType getHeader();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HEADERType value);

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' containment reference.
	 * @see #setDictionary(DICTIONARYType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getONTOMLType_Dictionary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dictionary'"
	 * @generated
	 */
	DICTIONARYType getDictionary();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getDictionary <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' containment reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(DICTIONARYType value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference.
	 * @see #setLibrary(LIBRARYType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getONTOMLType_Library()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='library'"
	 * @generated
	 */
	LIBRARYType getLibrary();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType#getLibrary <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' containment reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(LIBRARYType value);

} // ONTOMLType
