/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTAINEDCLASSEXTENSIONS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType#getClassExtension <em>Class Extension</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTAINEDCLASSEXTENSIONSType()
 * @model extendedMetaData="name='CONTAINED_CLASS_EXTENSIONS_Type' kind='elementOnly'"
 * @generated
 */
public interface CONTAINEDCLASSEXTENSIONSType extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Extension</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Extension</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTAINEDCLASSEXTENSIONSType_ClassExtension()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='class_extension'"
	 * @generated
	 */
	EList<CLASSEXTENSIONType> getClassExtension();

} // CONTAINEDCLASSEXTENSIONSType
