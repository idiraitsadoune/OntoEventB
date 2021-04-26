/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Enumerated Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.NumberEnumeratedType#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getNumberEnumeratedType()
 * @model
 * @generated
 */
public interface NumberEnumeratedType extends DataTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' attribute list.
	 * @see pivotmodel.PivotmodelPackage#getNumberEnumeratedType_Contains()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getContains();

} // NumberEnumeratedType
