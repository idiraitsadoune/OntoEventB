/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getPresentationValue <em>Presentation Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getQualifierCode <em>Qualifier Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getQualifierRef <em>Qualifier Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getQualifiedValueType()
 * @model extendedMetaData="name='qualified_value_Type' kind='elementOnly'"
 * @generated
 */
public interface QualifiedValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Presentation Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Value</em>' containment reference.
	 * @see #setPresentationValue(PresentationValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getQualifiedValueType_PresentationValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='presentation_value' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationValueType getPresentationValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getPresentationValue <em>Presentation Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Value</em>' containment reference.
	 * @see #getPresentationValue()
	 * @generated
	 */
	void setPresentationValue(PresentationValueType value);

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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getQualifiedValueType_RealValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='real_value' namespace='##targetNamespace'"
	 * @generated
	 */
	RealValueType getRealValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getRealValue <em>Real Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getQualifiedValueType_ComplexValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complex_value' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexValueType getComplexValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getComplexValue <em>Complex Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getQualifiedValueType_IntegerValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='integer_value' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerValueType getIntegerValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getIntegerValue <em>Integer Value</em>}' containment reference.
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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getQualifiedValueType_RationalValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rational_value' namespace='##targetNamespace'"
	 * @generated
	 */
	RationalValueType getRationalValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getRationalValue <em>Rational Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rational Value</em>' containment reference.
	 * @see #getRationalValue()
	 * @generated
	 */
	void setRationalValue(RationalValueType value);

	/**
	 * Returns the value of the '<em><b>Qualifier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Code</em>' attribute.
	 * @see #setQualifierCode(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getQualifiedValueType_QualifierCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='qualifier_code'"
	 * @generated
	 */
	String getQualifierCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getQualifierCode <em>Qualifier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier Code</em>' attribute.
	 * @see #getQualifierCode()
	 * @generated
	 */
	void setQualifierCode(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Ref</em>' attribute.
	 * @see #setQualifierRef(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getQualifiedValueType_QualifierRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='attribute' name='qualifier_ref'"
	 * @generated
	 */
	String getQualifierRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType#getQualifierRef <em>Qualifier Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier Ref</em>' attribute.
	 * @see #getQualifierRef()
	 * @generated
	 */
	void setQualifierRef(String value);

} // QualifiedValueType
