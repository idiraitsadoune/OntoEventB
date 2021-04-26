/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APOSTERIORIVIEWOF Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getItem <em>Item</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getModel <em>Model</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getCorrespondingProperties <em>Corresponding Properties</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORIVIEWOFType()
 * @model extendedMetaData="name='A_POSTERIORI_VIEW_OF_Type' kind='elementOnly'"
 * @generated
 */
public interface APOSTERIORIVIEWOFType extends APOSTERIORISEMANTICRELATIONSHIPType {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(CLASSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORIVIEWOFType_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item'"
	 * @generated
	 */
	CLASSREFERENCEType getItem();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(CLASSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(CLASSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORIVIEWOFType_Model()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='model'"
	 * @generated
	 */
	CLASSREFERENCEType getModel();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(CLASSREFERENCEType value);

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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getAPOSTERIORIVIEWOFType_CorrespondingProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='corresponding_properties'"
	 * @generated
	 */
	CORRESPONDINGPROPERTIESType getCorrespondingProperties();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType#getCorrespondingProperties <em>Corresponding Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Properties</em>' containment reference.
	 * @see #getCorrespondingProperties()
	 * @generated
	 */
	void setCorrespondingProperties(CORRESPONDINGPROPERTIESType value);

} // APOSTERIORIVIEWOFType
