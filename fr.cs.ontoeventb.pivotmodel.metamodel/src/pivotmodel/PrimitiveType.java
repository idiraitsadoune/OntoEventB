/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.PrimitiveType#getBasedOn <em>Based On</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getPrimitiveType()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveType extends DataTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Based On</b></em>' attribute.
	 * The literals are from the enumeration {@link pivotmodel.PredefinedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' attribute.
	 * @see pivotmodel.PredefinedType
	 * @see #setBasedOn(PredefinedType)
	 * @see pivotmodel.PivotmodelPackage#getPrimitiveType_BasedOn()
	 * @model required="true"
	 * @generated
	 */
	PredefinedType getBasedOn();

	/**
	 * Sets the value of the '{@link pivotmodel.PrimitiveType#getBasedOn <em>Based On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' attribute.
	 * @see pivotmodel.PredefinedType
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(PredefinedType value);

} // PrimitiveType
