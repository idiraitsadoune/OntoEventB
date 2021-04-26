/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.Ontology#getName <em>Name</em>}</li>
 *   <li>{@link pivotmodel.Ontology#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link pivotmodel.Ontology#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link pivotmodel.Ontology#getContainedDataTypes <em>Contained Data Types</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getOntology()
 * @model
 * @generated
 */
public interface Ontology extends EObject {
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
	 * @see pivotmodel.PivotmodelPackage#getOntology_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pivotmodel.Ontology#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contained Classes</b></em>' containment reference list.
	 * The list contents are of type {@link pivotmodel.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Classes</em>' containment reference list.
	 * @see pivotmodel.PivotmodelPackage#getOntology_ContainedClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassDefinition> getContainedClasses();

	/**
	 * Returns the value of the '<em><b>Contained Properties</b></em>' containment reference list.
	 * The list contents are of type {@link pivotmodel.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Properties</em>' containment reference list.
	 * @see pivotmodel.PivotmodelPackage#getOntology_ContainedProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyDefinition> getContainedProperties();

	/**
	 * Returns the value of the '<em><b>Contained Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link pivotmodel.DataTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Data Types</em>' containment reference list.
	 * @see pivotmodel.PivotmodelPackage#getOntology_ContainedDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTypeDefinition> getContainedDataTypes();

} // Ontology
