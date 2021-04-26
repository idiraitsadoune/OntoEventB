/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.DerivedUnit#getDerivedUnitElement <em>Derived Unit Element</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getDerivedUnit()
 * @model
 * @generated
 */
public interface DerivedUnit extends UnitType {
	/**
	 * Returns the value of the '<em><b>Derived Unit Element</b></em>' containment reference list.
	 * The list contents are of type {@link pivotmodel.DerivedUnitElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Unit Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Unit Element</em>' containment reference list.
	 * @see pivotmodel.PivotmodelPackage#getDerivedUnit_DerivedUnitElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DerivedUnitElement> getDerivedUnitElement();

} // DerivedUnit
