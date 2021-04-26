/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSESREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSESREFERENCEType()
 * @model extendedMetaData="name='CLASSES_REFERENCE_Type' kind='elementOnly'"
 * @generated
 */
public interface CLASSESREFERENCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSESREFERENCEType_Class()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='class'"
	 * @generated
	 */
	EList<CLASSREFERENCEType> getClass_();

} // CLASSESREFERENCEType
