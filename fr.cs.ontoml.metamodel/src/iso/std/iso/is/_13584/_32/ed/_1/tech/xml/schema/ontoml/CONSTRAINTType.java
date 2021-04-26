/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType#getConstraintId <em>Constraint Id</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONSTRAINTType()
 * @model abstract="true"
 *        extendedMetaData="name='CONSTRAINT_Type' kind='empty'"
 * @generated
 */
public interface CONSTRAINTType extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Id</em>' attribute.
	 * @see #setConstraintId(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONSTRAINTType_ConstraintId()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ConstraintId"
	 *        extendedMetaData="kind='attribute' name='constraint_id'"
	 * @generated
	 */
	String getConstraintId();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType#getConstraintId <em>Constraint Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Id</em>' attribute.
	 * @see #getConstraintId()
	 * @generated
	 */
	void setConstraintId(String value);

} // CONSTRAINTType
