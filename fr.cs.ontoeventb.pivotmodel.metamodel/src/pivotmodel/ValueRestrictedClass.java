/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Restricted Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.ValueRestrictedClass#getToDataDefinition <em>To Data Definition</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getValueRestrictedClass()
 * @model abstract="true"
 * @generated
 */
public interface ValueRestrictedClass extends RestrictedClass {
	/**
	 * Returns the value of the '<em><b>To Data Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Data Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Data Definition</em>' reference.
	 * @see #setToDataDefinition(DataTypeDefinition)
	 * @see pivotmodel.PivotmodelPackage#getValueRestrictedClass_ToDataDefinition()
	 * @model required="true"
	 * @generated
	 */
	DataTypeDefinition getToDataDefinition();

	/**
	 * Sets the value of the '{@link pivotmodel.ValueRestrictedClass#getToDataDefinition <em>To Data Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Data Definition</em>' reference.
	 * @see #getToDataDefinition()
	 * @generated
	 */
	void setToDataDefinition(DataTypeDefinition value);

} // ValueRestrictedClass
