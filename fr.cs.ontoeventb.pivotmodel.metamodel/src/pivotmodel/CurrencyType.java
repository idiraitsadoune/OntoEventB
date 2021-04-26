/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.CurrencyType#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getCurrencyType()
 * @model
 * @generated
 */
public interface CurrencyType extends NumericType {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link pivotmodel.PredefinedCurrency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see pivotmodel.PredefinedCurrency
	 * @see #setCurrency(PredefinedCurrency)
	 * @see pivotmodel.PivotmodelPackage#getCurrencyType_Currency()
	 * @model required="true"
	 * @generated
	 */
	PredefinedCurrency getCurrency();

	/**
	 * Sets the value of the '{@link pivotmodel.CurrencyType#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see pivotmodel.PredefinedCurrency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(PredefinedCurrency value);

} // CurrencyType
