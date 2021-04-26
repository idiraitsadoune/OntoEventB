/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSEXTENSION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getDictionaryDefinition <em>Dictionary Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getContentVersion <em>Content Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getContentRevision <em>Content Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getRecommendedPresentation <em>Recommended Presentation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getClassification <em>Classification</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getInstanceIdentification <em>Instance Identification</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getPopulation <em>Population</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#isTableLike <em>Table Like</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSEXTENSIONType()
 * @model abstract="true"
 *        extendedMetaData="name='CLASS_EXTENSION_Type' kind='elementOnly'"
 * @generated
 */
public interface CLASSEXTENSIONType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dictionary Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary Definition</em>' containment reference.
	 * @see #setDictionaryDefinition(CLASSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSEXTENSIONType_DictionaryDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dictionary_definition'"
	 * @generated
	 */
	CLASSREFERENCEType getDictionaryDefinition();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getDictionaryDefinition <em>Dictionary Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Definition</em>' containment reference.
	 * @see #getDictionaryDefinition()
	 * @generated
	 */
	void setDictionaryDefinition(CLASSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Content Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Version</em>' attribute.
	 * @see #setContentVersion(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSEXTENSIONType_ContentVersion()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VERSIONTYPEType"
	 *        extendedMetaData="kind='element' name='content_version'"
	 * @generated
	 */
	String getContentVersion();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getContentVersion <em>Content Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Version</em>' attribute.
	 * @see #getContentVersion()
	 * @generated
	 */
	void setContentVersion(String value);

	/**
	 * Returns the value of the '<em><b>Content Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Revision</em>' attribute.
	 * @see #setContentRevision(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSEXTENSIONType_ContentRevision()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REVISIONTYPEType"
	 *        extendedMetaData="kind='element' name='content_revision'"
	 * @generated
	 */
	String getContentRevision();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getContentRevision <em>Content Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Revision</em>' attribute.
	 * @see #getContentRevision()
	 * @generated
	 */
	void setContentRevision(String value);

	/**
	 * Returns the value of the '<em><b>Recommended Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Presentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Presentation</em>' containment reference.
	 * @see #setRecommendedPresentation(RECOMMENDEDPRESENTATIONType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSEXTENSIONType_RecommendedPresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recommended_presentation'"
	 * @generated
	 */
	RECOMMENDEDPRESENTATIONType getRecommendedPresentation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getRecommendedPresentation <em>Recommended Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Presentation</em>' containment reference.
	 * @see #getRecommendedPresentation()
	 * @generated
	 */
	void setRecommendedPresentation(RECOMMENDEDPRESENTATIONType value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(CLASSIFICATIONType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSEXTENSIONType_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification'"
	 * @generated
	 */
	CLASSIFICATIONType getClassification();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(CLASSIFICATIONType value);

	/**
	 * Returns the value of the '<em><b>Instance Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Identification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Identification</em>' containment reference.
	 * @see #setInstanceIdentification(PROPERTIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSEXTENSIONType_InstanceIdentification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='instance_identification'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getInstanceIdentification();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getInstanceIdentification <em>Instance Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Identification</em>' containment reference.
	 * @see #getInstanceIdentification()
	 * @generated
	 */
	void setInstanceIdentification(PROPERTIESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference.
	 * @see #setPopulation(CatalogueType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSEXTENSIONType_Population()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='population'"
	 * @generated
	 */
	CatalogueType getPopulation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#getPopulation <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' containment reference.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(CatalogueType value);

	/**
	 * Returns the value of the '<em><b>Table Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Like</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Like</em>' attribute.
	 * @see #isSetTableLike()
	 * @see #unsetTableLike()
	 * @see #setTableLike(boolean)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getCLASSEXTENSIONType_TableLike()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='table_like'"
	 * @generated
	 */
	boolean isTableLike();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#isTableLike <em>Table Like</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Like</em>' attribute.
	 * @see #isSetTableLike()
	 * @see #unsetTableLike()
	 * @see #isTableLike()
	 * @generated
	 */
	void setTableLike(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#isTableLike <em>Table Like</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTableLike()
	 * @see #isTableLike()
	 * @see #setTableLike(boolean)
	 * @generated
	 */
	void unsetTableLike();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType#isTableLike <em>Table Like</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table Like</em>' attribute is set.
	 * @see #unsetTableLike()
	 * @see #isTableLike()
	 * @see #setTableLike(boolean)
	 * @generated
	 */
	boolean isSetTableLike();

} // CLASSEXTENSIONType
