/**
 */
package pivotmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Unit Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.DerivedUnitElement#getName <em>Name</em>}</li>
 *   <li>{@link pivotmodel.DerivedUnitElement#getExponent <em>Exponent</em>}</li>
 *   <li>{@link pivotmodel.DerivedUnitElement#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getDerivedUnitElement()
 * @model
 * @generated
 */
public interface DerivedUnitElement extends EObject {
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
	 * @see pivotmodel.PivotmodelPackage#getDerivedUnitElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pivotmodel.DerivedUnitElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(int)
	 * @see pivotmodel.PivotmodelPackage#getDerivedUnitElement_Exponent()
	 * @model
	 * @generated
	 */
	int getExponent();

	/**
	 * Sets the value of the '{@link pivotmodel.DerivedUnitElement#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(NamedUnit)
	 * @see pivotmodel.PivotmodelPackage#getDerivedUnitElement_Unit()
	 * @model required="true"
	 * @generated
	 */
	NamedUnit getUnit();

	/**
	 * Sets the value of the '{@link pivotmodel.DerivedUnitElement#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(NamedUnit value);

} // DerivedUnitElement
