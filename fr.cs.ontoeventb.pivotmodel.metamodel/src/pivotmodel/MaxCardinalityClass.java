/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Cardinality Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.MaxCardinalityClass#getMaxCard <em>Max Card</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getMaxCardinalityClass()
 * @model
 * @generated
 */
public interface MaxCardinalityClass extends CardinalityRestrictedClass {
	/**
	 * Returns the value of the '<em><b>Max Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Card</em>' attribute.
	 * @see #setMaxCard(int)
	 * @see pivotmodel.PivotmodelPackage#getMaxCardinalityClass_MaxCard()
	 * @model required="true"
	 * @generated
	 */
	int getMaxCard();

	/**
	 * Sets the value of the '{@link pivotmodel.MaxCardinalityClass#getMaxCard <em>Max Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Card</em>' attribute.
	 * @see #getMaxCard()
	 * @generated
	 */
	void setMaxCard(int value);

} // MaxCardinalityClass
