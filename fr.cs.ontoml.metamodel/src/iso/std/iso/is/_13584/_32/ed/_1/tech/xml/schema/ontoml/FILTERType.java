/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FILTER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType#getReferencedProperty <em>Referenced Property</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFILTERType()
 * @model extendedMetaData="name='FILTER_Type' kind='elementOnly'"
 * @generated
 */
public interface FILTERType extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Property</em>' containment reference.
	 * @see #setReferencedProperty(PROPERTYREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFILTERType_ReferencedProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenced_property'"
	 * @generated
	 */
	PROPERTYREFERENCEType getReferencedProperty();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType#getReferencedProperty <em>Referenced Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Property</em>' containment reference.
	 * @see #getReferencedProperty()
	 * @generated
	 */
	void setReferencedProperty(PROPERTYREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(ENUMERATIONCONSTRAINTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFILTERType_Domain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='domain'"
	 * @generated
	 */
	ENUMERATIONCONSTRAINTType getDomain();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(ENUMERATIONCONSTRAINTType value);

} // FILTERType
