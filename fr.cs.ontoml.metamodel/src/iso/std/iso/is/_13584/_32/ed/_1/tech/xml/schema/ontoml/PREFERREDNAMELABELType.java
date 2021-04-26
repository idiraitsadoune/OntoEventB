/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PREFERREDNAMELABEL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getValue <em>Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getLanguageCode <em>Language Code</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPREFERREDNAMELABELType()
 * @model extendedMetaData="name='PREFERRED_NAME_LABEL_Type' kind='simple'"
 * @generated
 */
public interface PREFERREDNAMELABELType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPREFERREDNAMELABELType_Value()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMETYPEType"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPREFERREDNAMELABELType_CountryCode()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.COUNTRYCODEType"
	 *        extendedMetaData="kind='attribute' name='country_code'"
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPREFERREDNAMELABELType_LanguageCode()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGECODEType"
	 *        extendedMetaData="kind='attribute' name='language_code'"
	 * @generated
	 */
	String getLanguageCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType#getLanguageCode <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' attribute.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(String value);

} // PREFERREDNAMELABELType
