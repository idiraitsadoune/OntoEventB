/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.SingleValue#getIsOfType <em>Is Of Type</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getSingleValue()
 * @model
 * @generated
 */
public interface SingleValue extends DataTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Is Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Of Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Of Type</em>' reference.
	 * @see #setIsOfType(DataTypeDefinition)
	 * @see pivotmodel.PivotmodelPackage#getSingleValue_IsOfType()
	 * @model required="true"
	 * @generated
	 */
	DataTypeDefinition getIsOfType();

	/**
	 * Sets the value of the '{@link pivotmodel.SingleValue#getIsOfType <em>Is Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Of Type</em>' reference.
	 * @see #getIsOfType()
	 * @generated
	 */
	void setIsOfType(DataTypeDefinition value);

} // SingleValue
