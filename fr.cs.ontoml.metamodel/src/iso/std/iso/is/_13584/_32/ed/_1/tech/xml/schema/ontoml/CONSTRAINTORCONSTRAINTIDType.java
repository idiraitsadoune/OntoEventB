/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONSTRAINTORCONSTRAINTID Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType#getConstraintDefinition <em>Constraint Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType#getConstraintRef <em>Constraint Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONSTRAINTORCONSTRAINTIDType()
 * @model extendedMetaData="name='CONSTRAINT_OR_CONSTRAINT_ID_Type' kind='elementOnly'"
 * @generated
 */
public interface CONSTRAINTORCONSTRAINTIDType extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Definition</em>' containment reference.
	 * @see #setConstraintDefinition(CONSTRAINTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONSTRAINTORCONSTRAINTIDType_ConstraintDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraint_definition'"
	 * @generated
	 */
	CONSTRAINTType getConstraintDefinition();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType#getConstraintDefinition <em>Constraint Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Definition</em>' containment reference.
	 * @see #getConstraintDefinition()
	 * @generated
	 */
	void setConstraintDefinition(CONSTRAINTType value);

	/**
	 * Returns the value of the '<em><b>Constraint Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Ref</em>' attribute.
	 * @see #setConstraintRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONSTRAINTORCONSTRAINTIDType_ConstraintRef()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ConstraintId"
	 *        extendedMetaData="kind='attribute' name='constraint_ref'"
	 * @generated
	 */
	String getConstraintRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType#getConstraintRef <em>Constraint Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Ref</em>' attribute.
	 * @see #getConstraintRef()
	 * @generated
	 */
	void setConstraintRef(String value);

} // CONSTRAINTORCONSTRAINTIDType
