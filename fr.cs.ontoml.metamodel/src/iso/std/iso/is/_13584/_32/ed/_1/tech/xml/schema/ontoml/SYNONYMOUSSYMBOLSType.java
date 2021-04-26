/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SYNONYMOUSSYMBOLS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSSYMBOLSType#getMathematicalString <em>Mathematical String</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSYNONYMOUSSYMBOLSType()
 * @model extendedMetaData="name='SYNONYMOUS_SYMBOLS_Type' kind='elementOnly'"
 * @generated
 */
public interface SYNONYMOUSSYMBOLSType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mathematical String</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mathematical String</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathematical String</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSYNONYMOUSSYMBOLSType_MathematicalString()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mathematical_string'"
	 * @generated
	 */
	EList<MATHEMATICALSTRINGType> getMathematicalString();

} // SYNONYMOUSSYMBOLSType
