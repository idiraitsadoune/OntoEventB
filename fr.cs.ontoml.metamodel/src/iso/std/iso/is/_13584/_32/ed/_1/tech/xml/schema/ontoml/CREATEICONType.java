/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CREATEICON Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CREATEICONType#getIllustration <em>Illustration</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCREATEICONType()
 * @model extendedMetaData="name='CREATE_ICON_Type' kind='elementOnly'"
 * @generated
 */
public interface CREATEICONType extends EObject {
	/**
	 * Returns the value of the '<em><b>Illustration</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Illustration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illustration</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCREATEICONType_Illustration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='illustration'"
	 * @generated
	 */
	EList<ILLUSTRATIONType> getIllustration();

} // CREATEICONType
