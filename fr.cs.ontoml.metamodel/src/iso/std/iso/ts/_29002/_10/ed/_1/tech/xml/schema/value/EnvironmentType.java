/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.EnvironmentType#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getEnvironmentType()
 * @model extendedMetaData="name='environment_Type' kind='elementOnly'"
 * @generated
 */
public interface EnvironmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getEnvironmentType_PropertyValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='property_value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionElementType> getPropertyValue();

} // EnvironmentType
