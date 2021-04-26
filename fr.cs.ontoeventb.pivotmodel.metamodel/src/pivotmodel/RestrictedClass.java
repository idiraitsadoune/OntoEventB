/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restricted Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.RestrictedClass#getOnProperty <em>On Property</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getRestrictedClass()
 * @model abstract="true"
 * @generated
 */
public interface RestrictedClass extends ClassDefinition {
	/**
	 * Returns the value of the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Property</em>' reference.
	 * @see #setOnProperty(PropertyDefinition)
	 * @see pivotmodel.PivotmodelPackage#getRestrictedClass_OnProperty()
	 * @model required="true"
	 * @generated
	 */
	PropertyDefinition getOnProperty();

	/**
	 * Sets the value of the '{@link pivotmodel.RestrictedClass#getOnProperty <em>On Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Property</em>' reference.
	 * @see #getOnProperty()
	 * @generated
	 */
	void setOnProperty(PropertyDefinition value);

} // RestrictedClass
