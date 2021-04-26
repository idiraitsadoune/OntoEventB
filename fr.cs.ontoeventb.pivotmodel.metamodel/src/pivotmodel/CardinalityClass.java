/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.CardinalityClass#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getCardinalityClass()
 * @model
 * @generated
 */
public interface CardinalityClass extends CardinalityRestrictedClass {
	/**
	 * Returns the value of the '<em><b>Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' attribute.
	 * @see #setCard(int)
	 * @see pivotmodel.PivotmodelPackage#getCardinalityClass_Card()
	 * @model required="true"
	 * @generated
	 */
	int getCard();

	/**
	 * Sets the value of the '{@link pivotmodel.CardinalityClass#getCard <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' attribute.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(int value);

} // CardinalityClass
