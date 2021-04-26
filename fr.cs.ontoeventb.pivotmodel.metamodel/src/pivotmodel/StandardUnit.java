/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.StandardUnit#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link pivotmodel.StandardUnit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getStandardUnit()
 * @model
 * @generated
 */
public interface StandardUnit extends NamedUnit {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The literals are from the enumeration {@link pivotmodel.PrefixeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see pivotmodel.PrefixeType
	 * @see #setPrefix(PrefixeType)
	 * @see pivotmodel.PivotmodelPackage#getStandardUnit_Prefix()
	 * @model
	 * @generated
	 */
	PrefixeType getPrefix();

	/**
	 * Sets the value of the '{@link pivotmodel.StandardUnit#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see pivotmodel.PrefixeType
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(PrefixeType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link pivotmodel.UnitName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see pivotmodel.UnitName
	 * @see #setName(UnitName)
	 * @see pivotmodel.PivotmodelPackage#getStandardUnit_Name()
	 * @model required="true"
	 * @generated
	 */
	UnitName getName();

	/**
	 * Sets the value of the '{@link pivotmodel.StandardUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see pivotmodel.UnitName
	 * @see #getName()
	 * @generated
	 */
	void setName(UnitName value);

} // StandardUnit
