/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VCVRANGE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VCVRANGEType#getViewControlVariableRange <em>View Control Variable Range</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVCVRANGEType()
 * @model extendedMetaData="name='V_C_V_RANGE_Type' kind='elementOnly'"
 * @generated
 */
public interface VCVRANGEType extends EObject {
	/**
	 * Returns the value of the '<em><b>View Control Variable Range</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Control Variable Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Control Variable Range</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVCVRANGEType_ViewControlVariableRange()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='view_control_variable_range'"
	 * @generated
	 */
	EList<VIEWCONTROLVARIABLERANGEType> getViewControlVariableRange();

} // VCVRANGEType
