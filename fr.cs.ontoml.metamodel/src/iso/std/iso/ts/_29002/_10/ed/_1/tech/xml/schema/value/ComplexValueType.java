/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getRealPart <em>Real Part</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getImaginaryPart <em>Imaginary Part</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getComplexValueType()
 * @model extendedMetaData="name='complex_value_Type' kind='elementOnly'"
 * @generated
 */
public interface ComplexValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Part</em>' attribute.
	 * @see #isSetRealPart()
	 * @see #unsetRealPart()
	 * @see #setRealPart(double)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getComplexValueType_RealPart()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='real_part' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRealPart();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getRealPart <em>Real Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Part</em>' attribute.
	 * @see #isSetRealPart()
	 * @see #unsetRealPart()
	 * @see #getRealPart()
	 * @generated
	 */
	void setRealPart(double value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getRealPart <em>Real Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRealPart()
	 * @see #getRealPart()
	 * @see #setRealPart(double)
	 * @generated
	 */
	void unsetRealPart();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getRealPart <em>Real Part</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Real Part</em>' attribute is set.
	 * @see #unsetRealPart()
	 * @see #getRealPart()
	 * @see #setRealPart(double)
	 * @generated
	 */
	boolean isSetRealPart();

	/**
	 * Returns the value of the '<em><b>Imaginary Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imaginary Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaginary Part</em>' attribute.
	 * @see #isSetImaginaryPart()
	 * @see #unsetImaginaryPart()
	 * @see #setImaginaryPart(double)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getComplexValueType_ImaginaryPart()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='imaginary_part' namespace='##targetNamespace'"
	 * @generated
	 */
	double getImaginaryPart();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getImaginaryPart <em>Imaginary Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaginary Part</em>' attribute.
	 * @see #isSetImaginaryPart()
	 * @see #unsetImaginaryPart()
	 * @see #getImaginaryPart()
	 * @generated
	 */
	void setImaginaryPart(double value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getImaginaryPart <em>Imaginary Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImaginaryPart()
	 * @see #getImaginaryPart()
	 * @see #setImaginaryPart(double)
	 * @generated
	 */
	void unsetImaginaryPart();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType#getImaginaryPart <em>Imaginary Part</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Imaginary Part</em>' attribute is set.
	 * @see #unsetImaginaryPart()
	 * @see #getImaginaryPart()
	 * @see #setImaginaryPart(double)
	 * @generated
	 */
	boolean isSetImaginaryPart();

} // ComplexValueType
