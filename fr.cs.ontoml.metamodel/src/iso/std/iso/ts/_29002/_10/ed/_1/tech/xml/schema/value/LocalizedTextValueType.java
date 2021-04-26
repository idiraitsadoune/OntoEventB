/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localized Text Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getLocalizedTextValueType()
 * @model extendedMetaData="name='localized_text_value_Type' kind='elementOnly'"
 * @generated
 */
public interface LocalizedTextValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(InternationalTextType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getLocalizedTextValueType_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getContent();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(InternationalTextType value);

} // LocalizedTextValueType
