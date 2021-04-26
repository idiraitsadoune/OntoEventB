/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.NamedUnit#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getNamedUnit()
 * @model
 * @generated
 */
public interface NamedUnit extends UnitType {
	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(int)
	 * @see pivotmodel.PivotmodelPackage#getNamedUnit_Exponent()
	 * @model
	 * @generated
	 */
	int getExponent();

	/**
	 * Sets the value of the '{@link pivotmodel.NamedUnit#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(int value);

} // NamedUnit
