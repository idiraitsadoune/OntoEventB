/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Standard Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.NonStandardUnit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getNonStandardUnit()
 * @model
 * @generated
 */
public interface NonStandardUnit extends NamedUnit {

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
	 * @see pivotmodel.PivotmodelPackage#getNonStandardUnit_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pivotmodel.NonStandardUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // NonStandardUnit
