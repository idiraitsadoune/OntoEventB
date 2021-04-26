/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.EnumeratedType#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getEnumeratedType()
 * @model
 * @generated
 */
public interface EnumeratedType extends DataTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.SingleValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getEnumeratedType_Contains()
	 * @model required="true"
	 * @generated
	 */
	EList<SingleValue> getContains();

} // EnumeratedType
