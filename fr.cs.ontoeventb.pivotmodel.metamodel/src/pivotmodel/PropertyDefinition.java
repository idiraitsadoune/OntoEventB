/**
 */
package pivotmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.PropertyDefinition#getName <em>Name</em>}</li>
 *   <li>{@link pivotmodel.PropertyDefinition#isIsFunctional <em>Is Functional</em>}</li>
 *   <li>{@link pivotmodel.PropertyDefinition#isIsSymmetric <em>Is Symmetric</em>}</li>
 *   <li>{@link pivotmodel.PropertyDefinition#isIsTransitive <em>Is Transitive</em>}</li>
 *   <li>{@link pivotmodel.PropertyDefinition#isIsInverseFunctional <em>Is Inverse Functional</em>}</li>
 *   <li>{@link pivotmodel.PropertyDefinition#getRange <em>Range</em>}</li>
 *   <li>{@link pivotmodel.PropertyDefinition#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link pivotmodel.PropertyDefinition#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link pivotmodel.PropertyDefinition#getInverseOf <em>Inverse Of</em>}</li>
 *   <li>{@link pivotmodel.PropertyDefinition#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition()
 * @model abstract="true"
 * @generated
 */
public interface PropertyDefinition extends EObject {
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
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pivotmodel.PropertyDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Functional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Functional</em>' attribute.
	 * @see #setIsFunctional(boolean)
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_IsFunctional()
	 * @model
	 * @generated
	 */
	boolean isIsFunctional();

	/**
	 * Sets the value of the '{@link pivotmodel.PropertyDefinition#isIsFunctional <em>Is Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Functional</em>' attribute.
	 * @see #isIsFunctional()
	 * @generated
	 */
	void setIsFunctional(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Symmetric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Symmetric</em>' attribute.
	 * @see #setIsSymmetric(boolean)
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_IsSymmetric()
	 * @model
	 * @generated
	 */
	boolean isIsSymmetric();

	/**
	 * Sets the value of the '{@link pivotmodel.PropertyDefinition#isIsSymmetric <em>Is Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Symmetric</em>' attribute.
	 * @see #isIsSymmetric()
	 * @generated
	 */
	void setIsSymmetric(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Transitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Transitive</em>' attribute.
	 * @see #setIsTransitive(boolean)
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_IsTransitive()
	 * @model
	 * @generated
	 */
	boolean isIsTransitive();

	/**
	 * Sets the value of the '{@link pivotmodel.PropertyDefinition#isIsTransitive <em>Is Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transitive</em>' attribute.
	 * @see #isIsTransitive()
	 * @generated
	 */
	void setIsTransitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Inverse Functional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inverse Functional</em>' attribute.
	 * @see #setIsInverseFunctional(boolean)
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_IsInverseFunctional()
	 * @model
	 * @generated
	 */
	boolean isIsInverseFunctional();

	/**
	 * Sets the value of the '{@link pivotmodel.PropertyDefinition#isIsInverseFunctional <em>Is Inverse Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inverse Functional</em>' attribute.
	 * @see #isIsInverseFunctional()
	 * @generated
	 */
	void setIsInverseFunctional(boolean value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(DataTypeDefinition)
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_Range()
	 * @model
	 * @generated
	 */
	DataTypeDefinition getRange();

	/**
	 * Sets the value of the '{@link pivotmodel.PropertyDefinition#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DataTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(ClassDefinition)
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_Domain()
	 * @model
	 * @generated
	 */
	ClassDefinition getDomain();

	/**
	 * Sets the value of the '{@link pivotmodel.PropertyDefinition#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Sub Property Of</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Of</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_SubPropertyOf()
	 * @model
	 * @generated
	 */
	EList<PropertyDefinition> getSubPropertyOf();

	/**
	 * Returns the value of the '<em><b>Equivalent To</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent To</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_EquivalentTo()
	 * @model
	 * @generated
	 */
	EList<PropertyDefinition> getEquivalentTo();

	/**
	 * Returns the value of the '<em><b>Inverse Of</b></em>' reference list.
	 * The list contents are of type {@link pivotmodel.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Of</em>' reference list.
	 * @see pivotmodel.PivotmodelPackage#getPropertyDefinition_InverseOf()
	 * @model
	 * @generated
	 */
	EList<PropertyDefinition> getInverseOf();

} // PropertyDefinition
