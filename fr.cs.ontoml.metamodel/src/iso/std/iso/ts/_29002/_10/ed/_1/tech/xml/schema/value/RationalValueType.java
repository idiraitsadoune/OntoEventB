/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rational Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getWholePart <em>Whole Part</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getRationalValueType()
 * @model extendedMetaData="name='rational_value_Type' kind='elementOnly'"
 * @generated
 */
public interface RationalValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Whole Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whole Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whole Part</em>' attribute.
	 * @see #isSetWholePart()
	 * @see #unsetWholePart()
	 * @see #setWholePart(int)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getRationalValueType_WholePart()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='whole_part' namespace='##targetNamespace'"
	 * @generated
	 */
	int getWholePart();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getWholePart <em>Whole Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whole Part</em>' attribute.
	 * @see #isSetWholePart()
	 * @see #unsetWholePart()
	 * @see #getWholePart()
	 * @generated
	 */
	void setWholePart(int value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getWholePart <em>Whole Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWholePart()
	 * @see #getWholePart()
	 * @see #setWholePart(int)
	 * @generated
	 */
	void unsetWholePart();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getWholePart <em>Whole Part</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Whole Part</em>' attribute is set.
	 * @see #unsetWholePart()
	 * @see #getWholePart()
	 * @see #setWholePart(int)
	 * @generated
	 */
	boolean isSetWholePart();

	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' attribute.
	 * @see #isSetNumerator()
	 * @see #unsetNumerator()
	 * @see #setNumerator(int)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getRationalValueType_Numerator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='numerator' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumerator();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' attribute.
	 * @see #isSetNumerator()
	 * @see #unsetNumerator()
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(int value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumerator()
	 * @see #getNumerator()
	 * @see #setNumerator(int)
	 * @generated
	 */
	void unsetNumerator();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getNumerator <em>Numerator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numerator</em>' attribute is set.
	 * @see #unsetNumerator()
	 * @see #getNumerator()
	 * @see #setNumerator(int)
	 * @generated
	 */
	boolean isSetNumerator();

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' attribute.
	 * @see #isSetDenominator()
	 * @see #unsetDenominator()
	 * @see #setDenominator(int)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getRationalValueType_Denominator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='denominator' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDenominator();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' attribute.
	 * @see #isSetDenominator()
	 * @see #unsetDenominator()
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(int value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDenominator()
	 * @see #getDenominator()
	 * @see #setDenominator(int)
	 * @generated
	 */
	void unsetDenominator();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType#getDenominator <em>Denominator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Denominator</em>' attribute is set.
	 * @see #unsetDenominator()
	 * @see #getDenominator()
	 * @see #setDenominator(int)
	 * @generated
	 */
	boolean isSetDenominator();

} // RationalValueType
