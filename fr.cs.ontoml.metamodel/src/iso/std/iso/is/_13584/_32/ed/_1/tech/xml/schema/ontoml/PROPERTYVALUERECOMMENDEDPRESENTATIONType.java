/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROPERTYVALUERECOMMENDEDPRESENTATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getPropDef <em>Prop Def</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getRecommendedPresentationUnit <em>Recommended Presentation Unit</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getRecommendedPresentationFormat <em>Recommended Presentation Format</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYVALUERECOMMENDEDPRESENTATIONType()
 * @model extendedMetaData="name='PROPERTY_VALUE_RECOMMENDED_PRESENTATION_Type' kind='elementOnly'"
 * @generated
 */
public interface PROPERTYVALUERECOMMENDEDPRESENTATIONType extends EObject {
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYVALUERECOMMENDEDPRESENTATIONType_PropDef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='prop_def'"
	 * @generated
	 */
	PROPERTYREFERENCEType getPropDef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getPropDef <em>Prop Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop Def</em>' containment reference.
	 * @see #getPropDef()
	 * @generated
	 */
	void setPropDef(PROPERTYREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Recommended Presentation Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Presentation Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Presentation Unit</em>' containment reference.
	 * @see #setRecommendedPresentationUnit(UNITType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYVALUERECOMMENDEDPRESENTATIONType_RecommendedPresentationUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='recommended_presentation_unit'"
	 * @generated
	 */
	UNITType getRecommendedPresentationUnit();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getRecommendedPresentationUnit <em>Recommended Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Presentation Unit</em>' containment reference.
	 * @see #getRecommendedPresentationUnit()
	 * @generated
	 */
	void setRecommendedPresentationUnit(UNITType value);

	/**
	 * Returns the value of the '<em><b>Recommended Presentation Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Presentation Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Presentation Format</em>' attribute.
	 * @see #setRecommendedPresentationFormat(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYVALUERECOMMENDEDPRESENTATIONType_RecommendedPresentationFormat()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUEFORMATTYPEType" required="true"
	 *        extendedMetaData="kind='element' name='recommended_presentation_format'"
	 * @generated
	 */
	String getRecommendedPresentationFormat();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType#getRecommendedPresentationFormat <em>Recommended Presentation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Presentation Format</em>' attribute.
	 * @see #getRecommendedPresentationFormat()
	 * @generated
	 */
	void setRecommendedPresentationFormat(String value);

} // PROPERTYVALUERECOMMENDEDPRESENTATIONType
