/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FREERELATIONENDREF Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONENDREFType#getElementRef <em>Element Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFREERELATIONENDREFType()
 * @model extendedMetaData="name='FREE_RELATION_END_REF_Type' kind='empty'"
 * @generated
 */
public interface FREERELATIONENDREFType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Ref</em>' attribute.
	 * @see #setElementRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFREERELATIONENDREFType_ElementRef()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FreeRelationEndId" required="true"
	 *        extendedMetaData="kind='attribute' name='element_ref'"
	 * @generated
	 */
	String getElementRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONENDREFType#getElementRef <em>Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Ref</em>' attribute.
	 * @see #getElementRef()
	 * @generated
	 */
	void setElementRef(String value);

} // FREERELATIONENDREFType
