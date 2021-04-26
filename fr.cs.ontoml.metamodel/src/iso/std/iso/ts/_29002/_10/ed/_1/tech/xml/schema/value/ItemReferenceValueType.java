/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Reference Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType#getItemLocalRef <em>Item Local Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getItemReferenceValueType()
 * @model extendedMetaData="name='item_reference_value_Type' kind='empty'"
 * @generated
 */
public interface ItemReferenceValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Local Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Local Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Local Ref</em>' attribute.
	 * @see #setItemLocalRef(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getItemReferenceValueType_ItemLocalRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='item_local_ref'"
	 * @generated
	 */
	String getItemLocalRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType#getItemLocalRef <em>Item Local Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Local Ref</em>' attribute.
	 * @see #getItemLocalRef()
	 * @generated
	 */
	void setItemLocalRef(String value);

} // ItemReferenceValueType
