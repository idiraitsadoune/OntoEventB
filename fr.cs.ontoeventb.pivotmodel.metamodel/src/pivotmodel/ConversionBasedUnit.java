/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Based Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.ConversionBasedUnit#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link pivotmodel.ConversionBasedUnit#getUnitComponent <em>Unit Component</em>}</li>
 *   <li>{@link pivotmodel.ConversionBasedUnit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getConversionBasedUnit()
 * @model
 * @generated
 */
public interface ConversionBasedUnit extends NamedUnit {
	/**
	 * Returns the value of the '<em><b>Value Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Component</em>' attribute.
	 * @see #setValueComponent(int)
	 * @see pivotmodel.PivotmodelPackage#getConversionBasedUnit_ValueComponent()
	 * @model required="true"
	 * @generated
	 */
	int getValueComponent();

	/**
	 * Sets the value of the '{@link pivotmodel.ConversionBasedUnit#getValueComponent <em>Value Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Component</em>' attribute.
	 * @see #getValueComponent()
	 * @generated
	 */
	void setValueComponent(int value);

	/**
	 * Returns the value of the '<em><b>Unit Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Component</em>' reference.
	 * @see #setUnitComponent(UnitType)
	 * @see pivotmodel.PivotmodelPackage#getConversionBasedUnit_UnitComponent()
	 * @model required="true"
	 * @generated
	 */
	UnitType getUnitComponent();

	/**
	 * Sets the value of the '{@link pivotmodel.ConversionBasedUnit#getUnitComponent <em>Unit Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Component</em>' reference.
	 * @see #getUnitComponent()
	 * @generated
	 */
	void setUnitComponent(UnitType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pivotmodel.PivotmodelPackage#getConversionBasedUnit_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pivotmodel.ConversionBasedUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConversionBasedUnit
