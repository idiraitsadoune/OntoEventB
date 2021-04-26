/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITEMCLASSCASEOF Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getSimplifiedDrawing <em>Simplified Drawing</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getCodedName <em>Coded Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#isInstanceSharable <em>Instance Sharable</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getIsCaseOf <em>Is Case Of</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedProperties <em>Imported Properties</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedTypes <em>Imported Types</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedDocuments <em>Imported Documents</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedConstraints <em>Imported Constraints</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSCASEOFType()
 * @model extendedMetaData="name='ITEM_CLASS_CASE_OF_Type' kind='elementOnly'"
 * @generated
 */
public interface ITEMCLASSCASEOFType extends CLASSType {
	/**
	 * Returns the value of the '<em><b>Simplified Drawing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simplified Drawing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplified Drawing</em>' containment reference.
	 * @see #setSimplifiedDrawing(GRAPHICSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSCASEOFType_SimplifiedDrawing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simplified_drawing'"
	 * @generated
	 */
	GRAPHICSType getSimplifiedDrawing();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getSimplifiedDrawing <em>Simplified Drawing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simplified Drawing</em>' containment reference.
	 * @see #getSimplifiedDrawing()
	 * @generated
	 */
	void setSimplifiedDrawing(GRAPHICSType value);

	/**
	 * Returns the value of the '<em><b>Coded Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coded Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coded Name</em>' attribute.
	 * @see #setCodedName(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSCASEOFType_CodedName()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUECODETYPEType"
	 *        extendedMetaData="kind='element' name='coded_name'"
	 * @generated
	 */
	String getCodedName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getCodedName <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coded Name</em>' attribute.
	 * @see #getCodedName()
	 * @generated
	 */
	void setCodedName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Sharable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Sharable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Sharable</em>' attribute.
	 * @see #isSetInstanceSharable()
	 * @see #unsetInstanceSharable()
	 * @see #setInstanceSharable(boolean)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSCASEOFType_InstanceSharable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='instance_sharable'"
	 * @generated
	 */
	boolean isInstanceSharable();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#isInstanceSharable <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Sharable</em>' attribute.
	 * @see #isSetInstanceSharable()
	 * @see #unsetInstanceSharable()
	 * @see #isInstanceSharable()
	 * @generated
	 */
	void setInstanceSharable(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#isInstanceSharable <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstanceSharable()
	 * @see #isInstanceSharable()
	 * @see #setInstanceSharable(boolean)
	 * @generated
	 */
	void unsetInstanceSharable();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#isInstanceSharable <em>Instance Sharable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance Sharable</em>' attribute is set.
	 * @see #unsetInstanceSharable()
	 * @see #isInstanceSharable()
	 * @see #setInstanceSharable(boolean)
	 * @generated
	 */
	boolean isSetInstanceSharable();

	/**
	 * Returns the value of the '<em><b>Is Case Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Case Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Case Of</em>' containment reference.
	 * @see #setIsCaseOf(CLASSESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSCASEOFType_IsCaseOf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='is_case_of'"
	 * @generated
	 */
	CLASSESREFERENCEType getIsCaseOf();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getIsCaseOf <em>Is Case Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Case Of</em>' containment reference.
	 * @see #getIsCaseOf()
	 * @generated
	 */
	void setIsCaseOf(CLASSESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Properties</em>' containment reference.
	 * @see #setImportedProperties(PROPERTIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSCASEOFType_ImportedProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_properties'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getImportedProperties();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedProperties <em>Imported Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Properties</em>' containment reference.
	 * @see #getImportedProperties()
	 * @generated
	 */
	void setImportedProperties(PROPERTIESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Types</em>' containment reference.
	 * @see #setImportedTypes(DATATYPESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSCASEOFType_ImportedTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_types'"
	 * @generated
	 */
	DATATYPESREFERENCEType getImportedTypes();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedTypes <em>Imported Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Types</em>' containment reference.
	 * @see #getImportedTypes()
	 * @generated
	 */
	void setImportedTypes(DATATYPESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Documents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Documents</em>' containment reference.
	 * @see #setImportedDocuments(DOCUMENTSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSCASEOFType_ImportedDocuments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_documents'"
	 * @generated
	 */
	DOCUMENTSREFERENCEType getImportedDocuments();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedDocuments <em>Imported Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Documents</em>' containment reference.
	 * @see #getImportedDocuments()
	 * @generated
	 */
	void setImportedDocuments(DOCUMENTSREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Imported Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Constraints</em>' containment reference.
	 * @see #setImportedConstraints(CONSTRAINTSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSCASEOFType_ImportedConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imported_constraints'"
	 * @generated
	 */
	CONSTRAINTSType getImportedConstraints();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType#getImportedConstraints <em>Imported Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Constraints</em>' containment reference.
	 * @see #getImportedConstraints()
	 * @generated
	 */
	void setImportedConstraints(CONSTRAINTSType value);

} // ITEMCLASSCASEOFType
