/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROPERTYCLASSIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType#getItsValue <em>Its Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType#getPropDef <em>Prop Def</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYCLASSIFICATIONType()
 * @model extendedMetaData="name='PROPERTY_CLASSIFICATION_Type' kind='elementOnly'"
 * @generated
 */
public interface PROPERTYCLASSIFICATIONType extends EObject {
	/**
	 * Returns the value of the '<em><b>Its Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Value</em>' attribute.
	 * @see #setItsValue(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYCLASSIFICATIONType_ItsValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='its_value'"
	 * @generated
	 */
	BigInteger getItsValue();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType#getItsValue <em>Its Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Value</em>' attribute.
	 * @see #getItsValue()
	 * @generated
	 */
	void setItsValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Prop Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Def</em>' containment reference.
	 * @see #setPropDef(PROPERTYREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYCLASSIFICATIONType_PropDef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='prop_def'"
	 * @generated
	 */
	PROPERTYREFERENCEType getPropDef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType#getPropDef <em>Prop Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop Def</em>' containment reference.
	 * @see #getPropDef()
	 * @generated
	 */
	void setPropDef(PROPERTYREFERENCEType value);

} // PROPERTYCLASSIFICATIONType
