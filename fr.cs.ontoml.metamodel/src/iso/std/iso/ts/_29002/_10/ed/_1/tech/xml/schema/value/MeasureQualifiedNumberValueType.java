/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Qualified Number Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType#getQualifiedValue <em>Qualified Value</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureQualifiedNumberValueType()
 * @model extendedMetaData="name='measure_qualified_number_value_Type' kind='elementOnly'"
 * @generated
 */
public interface MeasureQualifiedNumberValueType extends MeasureValueType {
	/**
	 * Returns the value of the '<em><b>Qualified Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureQualifiedNumberValueType_QualifiedValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='qualified_value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QualifiedValueType> getQualifiedValue();

} // MeasureQualifiedNumberValueType
