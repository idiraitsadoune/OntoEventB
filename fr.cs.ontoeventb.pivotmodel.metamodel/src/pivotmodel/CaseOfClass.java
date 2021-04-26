/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Of Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.CaseOfClass#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link pivotmodel.CaseOfClass#getImportedProperties <em>Imported Properties</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getCaseOfClass()
 * @model
 * @generated
 */
public interface CaseOfClass extends ClassDefinition {
	/**
	 * Returns the value of the '<em><b>Case Of</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Of</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getCaseOfClass_CaseOf()
	 * @model required="true"
	 * @generated
	 */
	EList<ClassDefinition> getCaseOf();

	/**
	 * Returns the value of the '<em><b>Imported Properties</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Properties</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getCaseOfClass_ImportedProperties()
	 * @model
	 * @generated
	 */
	EList<PropertyDefinition> getImportedProperties();

} // CaseOfClass
