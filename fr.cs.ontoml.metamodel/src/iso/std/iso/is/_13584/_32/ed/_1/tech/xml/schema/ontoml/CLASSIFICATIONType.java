/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSIFICATIONType#getPropertyClassification <em>Property Classification</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSIFICATIONType()
 * @model extendedMetaData="name='CLASSIFICATION_Type' kind='elementOnly'"
 * @generated
 */
public interface CLASSIFICATIONType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Classification</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Classification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Classification</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSIFICATIONType_PropertyClassification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='property_classification'"
	 * @generated
	 */
	EList<PROPERTYCLASSIFICATIONType> getPropertyClassification();

} // CLASSIFICATIONType
