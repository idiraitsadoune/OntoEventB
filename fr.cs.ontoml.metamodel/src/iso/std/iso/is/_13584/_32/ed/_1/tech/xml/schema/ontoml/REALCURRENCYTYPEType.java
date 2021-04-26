/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REALCURRENCYTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getCurrency <em>Currency</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getCurrencyId <em>Currency Id</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALCURRENCYTYPEType()
 * @model extendedMetaData="name='REAL_CURRENCY_TYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface REALCURRENCYTYPEType extends ANYTYPEType {
	/**
	 * Returns the value of the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Format</em>' attribute.
	 * @see #setValueFormat(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALCURRENCYTYPEType_ValueFormat()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUEFORMATTYPEType"
	 *        extendedMetaData="kind='element' name='value_format'"
	 * @generated
	 */
	String getValueFormat();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getValueFormat <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Format</em>' attribute.
	 * @see #getValueFormat()
	 * @generated
	 */
	void setValueFormat(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALCURRENCYTYPEType_Currency()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CURRENCYCODEType"
	 *        extendedMetaData="kind='element' name='currency'"
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

	/**
	 * Returns the value of the '<em><b>Currency Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Id</em>' attribute.
	 * @see #setCurrencyId(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALCURRENCYTYPEType_CurrencyId()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CurrencyId"
	 *        extendedMetaData="kind='element' name='currency_id'"
	 * @generated
	 */
	String getCurrencyId();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType#getCurrencyId <em>Currency Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Id</em>' attribute.
	 * @see #getCurrencyId()
	 * @generated
	 */
	void setCurrencyId(String value);

} // REALCURRENCYTYPEType
