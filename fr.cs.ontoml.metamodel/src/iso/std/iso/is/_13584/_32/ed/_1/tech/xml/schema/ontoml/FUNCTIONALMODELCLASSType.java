/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FUNCTIONALMODELCLASS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getCreatedView <em>Created View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getVCVRange <em>VCV Range</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedPropertiesFromView <em>Imported Properties From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedTypesFromView <em>Imported Types From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedDocumentsFromView <em>Imported Documents From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedCosntraintsFromView <em>Imported Cosntraints From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedPropertiesFromModels <em>Imported Properties From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedTypesFromModels <em>Imported Types From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedDocumentsFromModels <em>Imported Documents From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedConstraintsFromModels <em>Imported Constraints From Models</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType()
 * @model extendedMetaData="name='FUNCTIONAL_MODEL_CLASS_Type' kind='elementOnly'"
 * @generated
 */
public interface FUNCTIONALMODELCLASSType extends CLASSType {
	/**
	 * Returns the value of the '<em><b>Created View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created View</em>' containment reference.
	 * @see #setCreatedView(CLASSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_CreatedView()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='created_view'"
	 * @generated
	 */
	CLASSREFERENCEType getCreatedView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getCreatedView <em>Created View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created View</em>' containment reference.
	 * @see #getCreatedView()
	 * @generated
	 */
	void setCreatedView(CLASSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>VCV Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VCV Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VCV Range</em>' containment reference.
	 * @see #setVCVRange(VCVRANGEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_VCVRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='v_c_v_range'"
	 * @generated
	 */
	VCVRANGEType getVCVRange();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getVCVRange <em>VCV Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VCV Range</em>' containment reference.
	 * @see #getVCVRange()
	 * @generated
	 */
	void setVCVRange(VCVRANGEType value);

	/**
	 * Returns the value of the '<em><b>Imported Properties From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Properties From View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Properties From View</em>' containment reference.
	 * @see #setImportedPropertiesFromView(PROPERTIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_ImportedPropertiesFromView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_properties_from_view'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getImportedPropertiesFromView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedPropertiesFromView <em>Imported Properties From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Properties From View</em>' containment reference.
	 * @see #getImportedPropertiesFromView()
	 * @generated
	 */
	void setImportedPropertiesFromView(PROPERTIESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Types From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Types From View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Types From View</em>' containment reference.
	 * @see #setImportedTypesFromView(DATATYPESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_ImportedTypesFromView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_types_from_view'"
	 * @generated
	 */
	DATATYPESREFERENCEType getImportedTypesFromView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedTypesFromView <em>Imported Types From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Types From View</em>' containment reference.
	 * @see #getImportedTypesFromView()
	 * @generated
	 */
	void setImportedTypesFromView(DATATYPESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Documents From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Documents From View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Documents From View</em>' containment reference.
	 * @see #setImportedDocumentsFromView(DOCUMENTSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_ImportedDocumentsFromView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_documents_from_view'"
	 * @generated
	 */
	DOCUMENTSREFERENCEType getImportedDocumentsFromView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedDocumentsFromView <em>Imported Documents From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Documents From View</em>' containment reference.
	 * @see #getImportedDocumentsFromView()
	 * @generated
	 */
	void setImportedDocumentsFromView(DOCUMENTSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Cosntraints From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Cosntraints From View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Cosntraints From View</em>' containment reference.
	 * @see #setImportedCosntraintsFromView(CONSTRAINTSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_ImportedCosntraintsFromView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_cosntraints_from_view'"
	 * @generated
	 */
	CONSTRAINTSType getImportedCosntraintsFromView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedCosntraintsFromView <em>Imported Cosntraints From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Cosntraints From View</em>' containment reference.
	 * @see #getImportedCosntraintsFromView()
	 * @generated
	 */
	void setImportedCosntraintsFromView(CONSTRAINTSType value);

	/**
	 * Returns the value of the '<em><b>Case Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Of</em>' containment reference.
	 * @see #setCaseOf(CLASSESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_CaseOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='case_of'"
	 * @generated
	 */
	CLASSESREFERENCEType getCaseOf();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getCaseOf <em>Case Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Of</em>' containment reference.
	 * @see #getCaseOf()
	 * @generated
	 */
	void setCaseOf(CLASSESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Properties From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Properties From Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Properties From Models</em>' containment reference.
	 * @see #setImportedPropertiesFromModels(PROPERTIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_ImportedPropertiesFromModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_properties_from_models'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getImportedPropertiesFromModels();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedPropertiesFromModels <em>Imported Properties From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Properties From Models</em>' containment reference.
	 * @see #getImportedPropertiesFromModels()
	 * @generated
	 */
	void setImportedPropertiesFromModels(PROPERTIESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Types From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Types From Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Types From Models</em>' containment reference.
	 * @see #setImportedTypesFromModels(DATATYPESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_ImportedTypesFromModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_types_from_models'"
	 * @generated
	 */
	DATATYPESREFERENCEType getImportedTypesFromModels();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedTypesFromModels <em>Imported Types From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Types From Models</em>' containment reference.
	 * @see #getImportedTypesFromModels()
	 * @generated
	 */
	void setImportedTypesFromModels(DATATYPESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Documents From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Documents From Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Documents From Models</em>' containment reference.
	 * @see #setImportedDocumentsFromModels(DOCUMENTSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_ImportedDocumentsFromModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_documents_from_models'"
	 * @generated
	 */
	DOCUMENTSREFERENCEType getImportedDocumentsFromModels();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedDocumentsFromModels <em>Imported Documents From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Documents From Models</em>' containment reference.
	 * @see #getImportedDocumentsFromModels()
	 * @generated
	 */
	void setImportedDocumentsFromModels(DOCUMENTSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Constraints From Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Constraints From Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Constraints From Models</em>' containment reference.
	 * @see #setImportedConstraintsFromModels(CONSTRAINTSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFUNCTIONALMODELCLASSType_ImportedConstraintsFromModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_constraints_from_models'"
	 * @generated
	 */
	CONSTRAINTSType getImportedConstraintsFromModels();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType#getImportedConstraintsFromModels <em>Imported Constraints From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Constraints From Models</em>' containment reference.
	 * @see #getImportedConstraintsFromModels()
	 * @generated
	 */
	void setImportedConstraintsFromModels(CONSTRAINTSType value);

} // FUNCTIONALMODELCLASSType
