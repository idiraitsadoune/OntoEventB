/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSCONSTANTVALUES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTANTVALUESType#getClassValueAssignment <em>Class Value Assignment</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSCONSTANTVALUESType()
 * @model extendedMetaData="name='CLASS_CONSTANT_VALUES_Type' kind='elementOnly'"
 * @generated
 */
public interface CLASSCONSTANTVALUESType extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Value Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Value Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Value Assignment</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSCONSTANTVALUESType_ClassValueAssignment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='class_value_assignment'"
	 * @generated
	 */
	EList<CLASSVALUEASSIGNMENTType> getClassValueAssignment();

} // CLASSCONSTANTVALUESType
