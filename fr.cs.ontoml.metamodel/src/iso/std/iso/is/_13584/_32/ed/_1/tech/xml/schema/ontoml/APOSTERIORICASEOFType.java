/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APOSTERIORICASEOF Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCaseOfSuper <em>Case Of Super</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCaseOfSub <em>Case Of Sub</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCorrespondingProperties <em>Corresponding Properties</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORICASEOFType()
 * @model extendedMetaData="name='A_POSTERIORI_CASE_OF_Type' kind='elementOnly'"
 * @generated
 */
public interface APOSTERIORICASEOFType extends APOSTERIORISEMANTICRELATIONSHIPType {
	/**
	 * Returns the value of the '<em><b>Case Of Super</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Of Super</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Of Super</em>' containment reference.
	 * @see #setCaseOfSuper(CLASSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORICASEOFType_CaseOfSuper()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='case_of_super'"
	 * @generated
	 */
	CLASSREFERENCEType getCaseOfSuper();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCaseOfSuper <em>Case Of Super</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Of Super</em>' containment reference.
	 * @see #getCaseOfSuper()
	 * @generated
	 */
	void setCaseOfSuper(CLASSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Case Of Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Of Sub</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Of Sub</em>' containment reference.
	 * @see #setCaseOfSub(CLASSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORICASEOFType_CaseOfSub()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='case_of_sub'"
	 * @generated
	 */
	CLASSREFERENCEType getCaseOfSub();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCaseOfSub <em>Case Of Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Of Sub</em>' containment reference.
	 * @see #getCaseOfSub()
	 * @generated
	 */
	void setCaseOfSub(CLASSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Corresponding Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Properties</em>' containment reference.
	 * @see #setCorrespondingProperties(CORRESPONDINGPROPERTIESType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORICASEOFType_CorrespondingProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='corresponding_properties'"
	 * @generated
	 */
	CORRESPONDINGPROPERTIESType getCorrespondingProperties();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType#getCorrespondingProperties <em>Corresponding Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Properties</em>' containment reference.
	 * @see #getCorrespondingProperties()
	 * @generated
	 */
	void setCorrespondingProperties(CORRESPONDINGPROPERTIESType value);

} // APOSTERIORICASEOFType
