/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DICTIONARY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getUpdates <em>Updates</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getUpdateAgreement <em>Update Agreement</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getReferencedDictionaries <em>Referenced Dictionaries</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getResponsibleSupplier <em>Responsible Supplier</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getAPosterioriSemanticRelationships <em>APosteriori Semantic Relationships</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedSuppliers <em>Contained Suppliers</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedDocuments <em>Contained Documents</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedDatatypes <em>Contained Datatypes</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedKeywords <em>Contained Keywords</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedSynonyms <em>Contained Synonyms</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType()
 * @model extendedMetaData="name='DICTIONARY_Type' kind='elementOnly'"
 * @generated
 */
public interface DICTIONARYType extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Complete</em>' attribute.
	 * @see #isSetIsComplete()
	 * @see #unsetIsComplete()
	 * @see #setIsComplete(boolean)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_IsComplete()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='is_complete'"
	 * @generated
	 */
	boolean isIsComplete();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Complete</em>' attribute.
	 * @see #isSetIsComplete()
	 * @see #unsetIsComplete()
	 * @see #isIsComplete()
	 * @generated
	 */
	void setIsComplete(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsComplete()
	 * @see #isIsComplete()
	 * @see #setIsComplete(boolean)
	 * @generated
	 */
	void unsetIsComplete();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#isIsComplete <em>Is Complete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Complete</em>' attribute is set.
	 * @see #unsetIsComplete()
	 * @see #isIsComplete()
	 * @see #setIsComplete(boolean)
	 * @generated
	 */
	boolean isSetIsComplete();

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' containment reference.
	 * @see #setUpdates(DICTIONARYREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_Updates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updates'"
	 * @generated
	 */
	DICTIONARYREFERENCEType getUpdates();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getUpdates <em>Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updates</em>' containment reference.
	 * @see #getUpdates()
	 * @generated
	 */
	void setUpdates(DICTIONARYREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Update Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Agreement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Agreement</em>' attribute.
	 * @see #setUpdateAgreement(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_UpdateAgreement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='update_agreement'"
	 * @generated
	 */
	String getUpdateAgreement();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getUpdateAgreement <em>Update Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Agreement</em>' attribute.
	 * @see #getUpdateAgreement()
	 * @generated
	 */
	void setUpdateAgreement(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Dictionaries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Dictionaries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Dictionaries</em>' containment reference.
	 * @see #setReferencedDictionaries(DICTIONARIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_ReferencedDictionaries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenced_dictionaries'"
	 * @generated
	 */
	DICTIONARIESREFERENCEType getReferencedDictionaries();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getReferencedDictionaries <em>Referenced Dictionaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Dictionaries</em>' containment reference.
	 * @see #getReferencedDictionaries()
	 * @generated
	 */
	void setReferencedDictionaries(DICTIONARIESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Responsible Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Supplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Supplier</em>' containment reference.
	 * @see #setResponsibleSupplier(SUPPLIERREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_ResponsibleSupplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible_supplier'"
	 * @generated
	 */
	SUPPLIERREFERENCEType getResponsibleSupplier();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getResponsibleSupplier <em>Responsible Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Supplier</em>' containment reference.
	 * @see #getResponsibleSupplier()
	 * @generated
	 */
	void setResponsibleSupplier(SUPPLIERREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Contained Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Classes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Classes</em>' containment reference.
	 * @see #setContainedClasses(CONTAINEDCLASSESType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_ContainedClasses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contained_classes'"
	 * @generated
	 */
	CONTAINEDCLASSESType getContainedClasses();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedClasses <em>Contained Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Classes</em>' containment reference.
	 * @see #getContainedClasses()
	 * @generated
	 */
	void setContainedClasses(CONTAINEDCLASSESType value);

	/**
	 * Returns the value of the '<em><b>APosteriori Semantic Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APosteriori Semantic Relationships</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APosteriori Semantic Relationships</em>' containment reference.
	 * @see #setAPosterioriSemanticRelationships(APOSTERIORISEMANTICRELATIONSHIPSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_APosterioriSemanticRelationships()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='a_posteriori_semantic_relationships'"
	 * @generated
	 */
	APOSTERIORISEMANTICRELATIONSHIPSType getAPosterioriSemanticRelationships();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getAPosterioriSemanticRelationships <em>APosteriori Semantic Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APosteriori Semantic Relationships</em>' containment reference.
	 * @see #getAPosterioriSemanticRelationships()
	 * @generated
	 */
	void setAPosterioriSemanticRelationships(APOSTERIORISEMANTICRELATIONSHIPSType value);

	/**
	 * Returns the value of the '<em><b>Contained Suppliers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Suppliers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Suppliers</em>' containment reference.
	 * @see #setContainedSuppliers(CONTAINEDSUPPLIERSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_ContainedSuppliers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contained_suppliers'"
	 * @generated
	 */
	CONTAINEDSUPPLIERSType getContainedSuppliers();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedSuppliers <em>Contained Suppliers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Suppliers</em>' containment reference.
	 * @see #getContainedSuppliers()
	 * @generated
	 */
	void setContainedSuppliers(CONTAINEDSUPPLIERSType value);

	/**
	 * Returns the value of the '<em><b>Contained Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Properties</em>' containment reference.
	 * @see #setContainedProperties(CONTAINEDPROPERTIESType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_ContainedProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contained_properties'"
	 * @generated
	 */
	CONTAINEDPROPERTIESType getContainedProperties();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedProperties <em>Contained Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Properties</em>' containment reference.
	 * @see #getContainedProperties()
	 * @generated
	 */
	void setContainedProperties(CONTAINEDPROPERTIESType value);

	/**
	 * Returns the value of the '<em><b>Contained Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Documents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Documents</em>' containment reference.
	 * @see #setContainedDocuments(CONTAINEDDOCUMENTSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_ContainedDocuments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contained_documents'"
	 * @generated
	 */
	CONTAINEDDOCUMENTSType getContainedDocuments();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedDocuments <em>Contained Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Documents</em>' containment reference.
	 * @see #getContainedDocuments()
	 * @generated
	 */
	void setContainedDocuments(CONTAINEDDOCUMENTSType value);

	/**
	 * Returns the value of the '<em><b>Contained Datatypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Datatypes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Datatypes</em>' containment reference.
	 * @see #setContainedDatatypes(CONTAINEDDATATYPESType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_ContainedDatatypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contained_datatypes'"
	 * @generated
	 */
	CONTAINEDDATATYPESType getContainedDatatypes();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedDatatypes <em>Contained Datatypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Datatypes</em>' containment reference.
	 * @see #getContainedDatatypes()
	 * @generated
	 */
	void setContainedDatatypes(CONTAINEDDATATYPESType value);

	/**
	 * Returns the value of the '<em><b>Contained Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Keywords</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Keywords</em>' containment reference.
	 * @see #setContainedKeywords(CONTAINEDKEYWORDSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_ContainedKeywords()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contained_keywords'"
	 * @generated
	 */
	CONTAINEDKEYWORDSType getContainedKeywords();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedKeywords <em>Contained Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Keywords</em>' containment reference.
	 * @see #getContainedKeywords()
	 * @generated
	 */
	void setContainedKeywords(CONTAINEDKEYWORDSType value);

	/**
	 * Returns the value of the '<em><b>Contained Synonyms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Synonyms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Synonyms</em>' containment reference.
	 * @see #setContainedSynonyms(CONTAINEDSYNONYMSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICTIONARYType_ContainedSynonyms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contained_synonyms'"
	 * @generated
	 */
	CONTAINEDSYNONYMSType getContainedSynonyms();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType#getContainedSynonyms <em>Contained Synonyms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Synonyms</em>' containment reference.
	 * @see #getContainedSynonyms()
	 * @generated
	 */
	void setContainedSynonyms(CONTAINEDSYNONYMSType value);

} // DICTIONARYType
