/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIUNIT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSIUNITType()
 * @model extendedMetaData="name='SI_UNIT_Type' kind='elementOnly'"
 * @generated
 */
public interface SIUNITType extends NAMEDUNITType {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The literals are from the enumeration {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #setPrefix(SIPREFIXType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSIUNITType_Prefix()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='prefix'"
	 * @generated
	 */
	SIPREFIXType getPrefix();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIPREFIXType
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(SIPREFIXType value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(SIPREFIXType)
	 * @generated
	 */
	void unsetPrefix();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getPrefix <em>Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefix</em>' attribute is set.
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(SIPREFIXType)
	 * @generated
	 */
	boolean isSetPrefix();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(SIUNITNAMEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSIUNITType_Name()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	SIUNITNAMEType getName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITNAMEType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(SIUNITNAMEType value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(SIUNITNAMEType)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(SIUNITNAMEType)
	 * @generated
	 */
	boolean isSetName();

} // SIUNITType
