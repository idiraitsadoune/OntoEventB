/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSVALUEASSIGNMENT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType#getSuperClassDefinedProperty <em>Super Class Defined Property</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType#getAssignedValue <em>Assigned Value</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSVALUEASSIGNMENTType()
 * @model extendedMetaData="name='CLASS_VALUE_ASSIGNMENT_Type' kind='elementOnly'"
 * @generated
 */
public interface CLASSVALUEASSIGNMENTType extends EObject {
	/**
	 * Returns the value of the '<em><b>Super Class Defined Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class Defined Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class Defined Property</em>' containment reference.
	 * @see #setSuperClassDefinedProperty(PROPERTYREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSVALUEASSIGNMENTType_SuperClassDefinedProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='super_class_defined_property'"
	 * @generated
	 */
	PROPERTYREFERENCEType getSuperClassDefinedProperty();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType#getSuperClassDefinedProperty <em>Super Class Defined Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class Defined Property</em>' containment reference.
	 * @see #getSuperClassDefinedProperty()
	 * @generated
	 */
	void setSuperClassDefinedProperty(PROPERTYREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Assigned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Value</em>' containment reference.
	 * @see #setAssignedValue(ASSIGNEDVALUEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSVALUEASSIGNMENTType_AssignedValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='assigned_value'"
	 * @generated
	 */
	ASSIGNEDVALUEType getAssignedValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType#getAssignedValue <em>Assigned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Value</em>' containment reference.
	 * @see #getAssignedValue()
	 * @generated
	 */
	void setAssignedValue(ASSIGNEDVALUEType value);

} // CLASSVALUEASSIGNMENTType
