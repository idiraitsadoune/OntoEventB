/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getCurrencyRef <em>Currency Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getCurrencyValueType()
 * @model extendedMetaData="name='currency_value_Type' kind='elementOnly'"
 * @generated
 */
public interface CurrencyValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Value</em>' containment reference.
	 * @see #setRealValue(RealValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getCurrencyValueType_RealValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='real_value' namespace='##targetNamespace'"
	 * @generated
	 */
	RealValueType getRealValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getRealValue <em>Real Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Value</em>' containment reference.
	 * @see #getRealValue()
	 * @generated
	 */
	void setRealValue(RealValueType value);

	/**
	 * Returns the value of the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Value</em>' containment reference.
	 * @see #setComplexValue(ComplexValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getCurrencyValueType_ComplexValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complex_value' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexValueType getComplexValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getComplexValue <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Value</em>' containment reference.
	 * @see #getComplexValue()
	 * @generated
	 */
	void setComplexValue(ComplexValueType value);

	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' containment reference.
	 * @see #setIntegerValue(IntegerValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getCurrencyValueType_IntegerValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='integer_value' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerValueType getIntegerValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getIntegerValue <em>Integer Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' containment reference.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(IntegerValueType value);

	/**
	 * Returns the value of the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rational Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational Value</em>' containment reference.
	 * @see #setRationalValue(RationalValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getCurrencyValueType_RationalValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rational_value' namespace='##targetNamespace'"
	 * @generated
	 */
	RationalValueType getRationalValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getRationalValue <em>Rational Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rational Value</em>' containment reference.
	 * @see #getRationalValue()
	 * @generated
	 */
	void setRationalValue(RationalValueType value);

	/**
	 * Returns the value of the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Code</em>' attribute.
	 * @see #setCurrencyCode(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getCurrencyValueType_CurrencyCode()
	 * @model dataType="iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.ISOCurrencyCodeType"
	 *        extendedMetaData="kind='attribute' name='currency_code'"
	 * @generated
	 */
	String getCurrencyCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getCurrencyCode <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Code</em>' attribute.
	 * @see #getCurrencyCode()
	 * @generated
	 */
	void setCurrencyCode(String value);

	/**
	 * Returns the value of the '<em><b>Currency Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Ref</em>' attribute.
	 * @see #setCurrencyRef(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getCurrencyValueType_CurrencyRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='attribute' name='currency_ref'"
	 * @generated
	 */
	String getCurrencyRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType#getCurrencyRef <em>Currency Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Ref</em>' attribute.
	 * @see #getCurrencyRef()
	 * @generated
	 */
	void setCurrencyRef(String value);

} // CurrencyValueType
