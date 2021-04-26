/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.ClassDefinition#getName <em>Name</em>}</li>
 *   <li>{@link pivotmodel.ClassDefinition#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link pivotmodel.ClassDefinition#getDisjointWith <em>Disjoint With</em>}</li>
 *   <li>{@link pivotmodel.ClassDefinition#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link pivotmodel.ClassDefinition#getDescribedBy <em>Described By</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getClassDefinition()
 * @model abstract="true"
 * @generated
 */
public interface ClassDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pivotmodel.PivotmodelPackage#getClassDefinition_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pivotmodel.ClassDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Class Of</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Of</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getClassDefinition_SubClassOf()
	 * @model
	 * @generated
	 */
	EList<ClassDefinition> getSubClassOf();

	/**
	 * Returns the value of the '<em><b>Disjoint With</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint With</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getClassDefinition_DisjointWith()
	 * @model
	 * @generated
	 */
	EList<ClassDefinition> getDisjointWith();

	/**
	 * Returns the value of the '<em><b>Equivalent To</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent To</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getClassDefinition_EquivalentTo()
	 * @model
	 * @generated
	 */
	EList<ClassDefinition> getEquivalentTo();

	/**
	 * Returns the value of the '<em><b>Described By</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described By</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getClassDefinition_DescribedBy()
	 * @model
	 * @generated
	 */
	EList<PropertyDefinition> getDescribedBy();

} // ClassDefinition
