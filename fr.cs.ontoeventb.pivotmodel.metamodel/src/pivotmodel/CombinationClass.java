/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combination Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.CombinationClass#getCombinationOf <em>Combination Of</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getCombinationClass()
 * @model abstract="true"
 * @generated
 */
public interface CombinationClass extends ClassDefinition {
	/**
	 * Returns the value of the '<em><b>Combination Of</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combination Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Of</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getCombinationClass_CombinationOf()
	 * @model required="true"
	 * @generated
	 */
	EList<ClassDefinition> getCombinationOf();

} // CombinationClass
