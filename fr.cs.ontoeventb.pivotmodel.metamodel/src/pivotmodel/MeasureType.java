/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.MeasureType#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getMeasureType()
 * @model
 * @generated
 */
public interface MeasureType extends NumericType {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(UnitType)
	 * @see pivotmodel.PivotmodelPackage#getMeasureType_Unit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link pivotmodel.MeasureType#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

} // MeasureType
