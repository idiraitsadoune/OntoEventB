/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMCLASSVIEWOF Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getCreatedView <em>Created View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getVCVRange <em>VCV Range</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromView <em>Imported Properties From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromView <em>Imported Types From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromView <em>Imported Documents From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromView <em>Imported Constraints From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromModels <em>Imported Properties From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromModels <em>Imported Types From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromModels <em>Imported Documents From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromModels <em>Imported Constraints From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getViewOf <em>View Of</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromItem <em>Imported Properties From Item</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromItem <em>Imported Types From Item</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromItem <em>Imported Documents From Item</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromItem <em>Imported Constraints From Item</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType()
 * @model extendedMetaData="name='FM_CLASS_VIEW_OF_Type' kind='elementOnly'"
 * @generated
 */
public interface FMCLASSVIEWOFType extends CLASSType {
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_CreatedView()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='created_view'"
	 * @generated
	 */
	CLASSREFERENCEType getCreatedView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getCreatedView <em>Created View</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_VCVRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='v_c_v_range'"
	 * @generated
	 */
	VCVRANGEType getVCVRange();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getVCVRange <em>VCV Range</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedPropertiesFromView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_properties_from_view'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getImportedPropertiesFromView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromView <em>Imported Properties From View</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedTypesFromView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_types_from_view'"
	 * @generated
	 */
	DATATYPESREFERENCEType getImportedTypesFromView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromView <em>Imported Types From View</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedDocumentsFromView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_documents_from_view'"
	 * @generated
	 */
	DOCUMENTSREFERENCEType getImportedDocumentsFromView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromView <em>Imported Documents From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Documents From View</em>' containment reference.
	 * @see #getImportedDocumentsFromView()
	 * @generated
	 */
	void setImportedDocumentsFromView(DOCUMENTSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Constraints From View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Constraints From View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Constraints From View</em>' containment reference.
	 * @see #setImportedConstraintsFromView(CONSTRAINTSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedConstraintsFromView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_constraints_from_view'"
	 * @generated
	 */
	CONSTRAINTSType getImportedConstraintsFromView();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromView <em>Imported Constraints From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Constraints From View</em>' containment reference.
	 * @see #getImportedConstraintsFromView()
	 * @generated
	 */
	void setImportedConstraintsFromView(CONSTRAINTSType value);

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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_CaseOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='case_of'"
	 * @generated
	 */
	CLASSESREFERENCEType getCaseOf();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getCaseOf <em>Case Of</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedPropertiesFromModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_properties_from_models'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getImportedPropertiesFromModels();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromModels <em>Imported Properties From Models</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedTypesFromModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_types_from_models'"
	 * @generated
	 */
	DATATYPESREFERENCEType getImportedTypesFromModels();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromModels <em>Imported Types From Models</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedDocumentsFromModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_documents_from_models'"
	 * @generated
	 */
	DOCUMENTSREFERENCEType getImportedDocumentsFromModels();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromModels <em>Imported Documents From Models</em>}' containment reference.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedConstraintsFromModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_constraints_from_models'"
	 * @generated
	 */
	CONSTRAINTSType getImportedConstraintsFromModels();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromModels <em>Imported Constraints From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Constraints From Models</em>' containment reference.
	 * @see #getImportedConstraintsFromModels()
	 * @generated
	 */
	void setImportedConstraintsFromModels(CONSTRAINTSType value);

	/**
	 * Returns the value of the '<em><b>View Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Of</em>' containment reference.
	 * @see #setViewOf(CLASSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ViewOf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='view_of'"
	 * @generated
	 */
	CLASSREFERENCEType getViewOf();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getViewOf <em>View Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Of</em>' containment reference.
	 * @see #getViewOf()
	 * @generated
	 */
	void setViewOf(CLASSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Properties From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Properties From Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Properties From Item</em>' containment reference.
	 * @see #setImportedPropertiesFromItem(PROPERTIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedPropertiesFromItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_properties_from_item'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getImportedPropertiesFromItem();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedPropertiesFromItem <em>Imported Properties From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Properties From Item</em>' containment reference.
	 * @see #getImportedPropertiesFromItem()
	 * @generated
	 */
	void setImportedPropertiesFromItem(PROPERTIESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Types From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Types From Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Types From Item</em>' containment reference.
	 * @see #setImportedTypesFromItem(DATATYPESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedTypesFromItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_types_from_item'"
	 * @generated
	 */
	DATATYPESREFERENCEType getImportedTypesFromItem();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedTypesFromItem <em>Imported Types From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Types From Item</em>' containment reference.
	 * @see #getImportedTypesFromItem()
	 * @generated
	 */
	void setImportedTypesFromItem(DATATYPESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Documents From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Documents From Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Documents From Item</em>' containment reference.
	 * @see #setImportedDocumentsFromItem(DOCUMENTSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedDocumentsFromItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_documents_from_item'"
	 * @generated
	 */
	DOCUMENTSREFERENCEType getImportedDocumentsFromItem();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedDocumentsFromItem <em>Imported Documents From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Documents From Item</em>' containment reference.
	 * @see #getImportedDocumentsFromItem()
	 * @generated
	 */
	void setImportedDocumentsFromItem(DOCUMENTSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Constraints From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Constraints From Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Constraints From Item</em>' containment reference.
	 * @see #setImportedConstraintsFromItem(CONSTRAINTSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getFMCLASSVIEWOFType_ImportedConstraintsFromItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_constraints_from_item'"
	 * @generated
	 */
	CONSTRAINTSType getImportedConstraintsFromItem();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType#getImportedConstraintsFromItem <em>Imported Constraints From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Constraints From Item</em>' containment reference.
	 * @see #getImportedConstraintsFromItem()
	 * @generated
	 */
	void setImportedConstraintsFromItem(CONSTRAINTSType value);

} // FMCLASSVIEWOFType
