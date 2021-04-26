/**
 */
package iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getContent <em>Content</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getLanguageRef <em>Language Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage#getLanguageStringType()
 * @model extendedMetaData="name='language_string_Type' kind='elementOnly'"
 * @generated
 */
public interface LanguageStringType extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage#getLanguageStringType_Content()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Language Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Ref</em>' attribute.
	 * @see #setLanguageRef(String)
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage#getLanguageStringType_LanguageRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='element' name='language_ref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguageRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getLanguageRef <em>Language Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Ref</em>' attribute.
	 * @see #getLanguageRef()
	 * @generated
	 */
	void setLanguageRef(String value);

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' attribute.
	 * @see #setLanguageCode(String)
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage#getLanguageStringType_LanguageCode()
	 * @model dataType="iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.ISOLanguageCodeType"
	 *        extendedMetaData="kind='element' name='language_code' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguageCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getLanguageCode <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' attribute.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(String value);

	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage#getLanguageStringType_CountryCode()
	 * @model dataType="iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.ISOCountryCodeType"
	 *        extendedMetaData="kind='element' name='country_code' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

} // LanguageStringType
