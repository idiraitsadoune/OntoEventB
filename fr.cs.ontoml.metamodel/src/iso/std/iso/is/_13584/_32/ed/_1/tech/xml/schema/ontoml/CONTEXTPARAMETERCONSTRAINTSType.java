/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTEXTPARAMETERCONSTRAINTS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMETERCONSTRAINTSType#getIntegrityConstraint <em>Integrity Constraint</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTEXTPARAMETERCONSTRAINTSType()
 * @model extendedMetaData="name='CONTEXT_PARAMETER_CONSTRAINTS_Type' kind='elementOnly'"
 * @generated
 */
public interface CONTEXTPARAMETERCONSTRAINTSType extends EObject {
	/**
	 * Returns the value of the '<em><b>Integrity Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrity Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity Constraint</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTEXTPARAMETERCONSTRAINTSType_IntegrityConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='integrity_constraint'"
	 * @generated
	 */
	EList<INTEGRITYCONSTRAINTType> getIntegrityConstraint();

} // CONTEXTPARAMETERCONSTRAINTSType
