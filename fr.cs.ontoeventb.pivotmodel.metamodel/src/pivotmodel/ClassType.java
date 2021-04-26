/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.ClassType#getBasedOn <em>Based On</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getClassType()
 * @model
 * @generated
 */
public interface ClassType extends DataTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' reference.
	 * @see #setBasedOn(ClassDefinition)
	 * @see pivotmodel.PivotmodelPackage#getClassType_BasedOn()
	 * @model required="true"
	 * @generated
	 */
	ClassDefinition getBasedOn();

	/**
	 * Sets the value of the '{@link pivotmodel.ClassType#getBasedOn <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' reference.
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(ClassDefinition value);

} // ClassType
