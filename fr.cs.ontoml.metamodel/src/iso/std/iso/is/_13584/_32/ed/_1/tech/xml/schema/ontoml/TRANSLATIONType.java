/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRANSLATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType#getTranslationData <em>Translation Data</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getTRANSLATIONType()
 * @model extendedMetaData="name='TRANSLATION_Type' kind='elementOnly'"
 * @generated
 */
public interface TRANSLATIONType extends EObject {
	/**
	 * Returns the value of the '<em><b>Translation Data</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Data</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getTRANSLATIONType_TranslationData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='translation_data'"
	 * @generated
	 */
	EList<TRANSLATIONDATAType> getTranslationData();

} // TRANSLATIONType
