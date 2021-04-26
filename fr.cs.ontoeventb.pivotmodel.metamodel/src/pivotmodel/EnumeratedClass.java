/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.EnumeratedClass#getOneOf <em>One Of</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getEnumeratedClass()
 * @model
 * @generated
 */
public interface EnumeratedClass extends ClassDefinition {
	/**
	 * Returns the value of the '<em><b>One Of</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.SingleValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Of</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getEnumeratedClass_OneOf()
	 * @model required="true"
	 * @generated
	 */
	EList<SingleValue> getOneOf();

} // EnumeratedClass
