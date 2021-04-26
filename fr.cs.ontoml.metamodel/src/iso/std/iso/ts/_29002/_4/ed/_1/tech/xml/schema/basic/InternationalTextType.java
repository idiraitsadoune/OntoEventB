/**
 */
package iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>International Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType#getLocalString <em>Local String</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage#getInternationalTextType()
 * @model extendedMetaData="name='international_text_Type' kind='elementOnly'"
 * @generated
 */
public interface InternationalTextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Local String</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local String</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local String</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage#getInternationalTextType_LocalString()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='local_string' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LanguageStringType> getLocalString();

} // InternationalTextType
