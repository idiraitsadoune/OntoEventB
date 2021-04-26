/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTEXTPARAMICON Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMICONType#getA6Illustration <em>A6 Illustration</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTEXTPARAMICONType()
 * @model extendedMetaData="name='CONTEXT_PARAM_ICON_Type' kind='elementOnly'"
 * @generated
 */
public interface CONTEXTPARAMICONType extends EObject {
	/**
	 * Returns the value of the '<em><b>A6 Illustration</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A6 Illustration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A6 Illustration</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCONTEXTPARAMICONType_A6Illustration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='a6_illustration'"
	 * @generated
	 */
	EList<ILLUSTRATIONType> getA6Illustration();

} // CONTEXTPARAMICONType
