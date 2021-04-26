/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Range Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureRangeValueType()
 * @model extendedMetaData="name='measure_range_value_Type' kind='elementOnly'"
 * @generated
 */
public interface MeasureRangeValueType extends MeasureValueType {
	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference.
	 * @see #setLowerValue(NumericValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureRangeValueType_LowerValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lower_value' namespace='##targetNamespace'"
	 * @generated
	 */
	NumericValueType getLowerValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType#getLowerValue <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(NumericValueType value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference.
	 * @see #setUpperValue(NumericValueType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureRangeValueType_UpperValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upper_value' namespace='##targetNamespace'"
	 * @generated
	 */
	NumericValueType getUpperValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType#getUpperValue <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(NumericValueType value);

} // MeasureRangeValueType
