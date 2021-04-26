/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Cardinality Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.MinCardinalityClass#getMinCard <em>Min Card</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getMinCardinalityClass()
 * @model
 * @generated
 */
public interface MinCardinalityClass extends CardinalityRestrictedClass {
	/**
	 * Returns the value of the '<em><b>Min Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Card</em>' attribute.
	 * @see #setMinCard(int)
	 * @see pivotmodel.PivotmodelPackage#getMinCardinalityClass_MinCard()
	 * @model required="true"
	 * @generated
	 */
	int getMinCard();

	/**
	 * Sets the value of the '{@link pivotmodel.MinCardinalityClass#getMinCard <em>Min Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Card</em>' attribute.
	 * @see #getMinCard()
	 * @generated
	 */
	void setMinCard(int value);

} // MinCardinalityClass
