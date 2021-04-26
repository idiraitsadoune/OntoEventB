/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependent Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.DependentProperty#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getDependentProperty()
 * @model
 * @generated
 */
public interface DependentProperty extends PropertyDefinition {
	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getDependentProperty_DependsOn()
	 * @model required="true"
	 * @generated
	 */
	EList<PropertyDefinition> getDependsOn();

} // DependentProperty
