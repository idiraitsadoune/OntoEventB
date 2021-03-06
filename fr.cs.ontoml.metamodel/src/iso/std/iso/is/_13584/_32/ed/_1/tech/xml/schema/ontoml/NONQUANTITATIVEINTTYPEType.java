/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NONQUANTITATIVEINTTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getItsValues <em>Its Values</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getSourceDocOfValueDomain <em>Source Doc Of Value Domain</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getDefinition <em>Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNONQUANTITATIVEINTTYPEType()
 * @model extendedMetaData="name='NON_QUANTITATIVE_INT_TYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface NONQUANTITATIVEINTTYPEType extends ANYTYPEType {
	/**
	 * Returns the value of the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Format</em>' attribute.
	 * @see #setValueFormat(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNONQUANTITATIVEINTTYPEType_ValueFormat()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUEFORMATTYPEType"
	 *        extendedMetaData="kind='element' name='value_format'"
	 * @generated
	 */
	String getValueFormat();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getValueFormat <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Format</em>' attribute.
	 * @see #getValueFormat()
	 * @generated
	 */
	void setValueFormat(String value);

	/**
	 * Returns the value of the '<em><b>Its Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Values</em>' containment reference.
	 * @see #setItsValues(ITSVALUESType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNONQUANTITATIVEINTTYPEType_ItsValues()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='its_values'"
	 * @generated
	 */
	ITSVALUESType getItsValues();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getItsValues <em>Its Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Values</em>' containment reference.
	 * @see #getItsValues()
	 * @generated
	 */
	void setItsValues(ITSVALUESType value);

	/**
	 * Returns the value of the '<em><b>Source Doc Of Value Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Doc Of Value Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Doc Of Value Domain</em>' containment reference.
	 * @see #setSourceDocOfValueDomain(SOURCEDOCUMENTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNONQUANTITATIVEINTTYPEType_SourceDocOfValueDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source_doc_of_value_domain'"
	 * @generated
	 */
	SOURCEDOCUMENTType getSourceDocOfValueDomain();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getSourceDocOfValueDomain <em>Source Doc Of Value Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Doc Of Value Domain</em>' containment reference.
	 * @see #getSourceDocOfValueDomain()
	 * @generated
	 */
	void setSourceDocOfValueDomain(SOURCEDOCUMENTType value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(TEXTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNONQUANTITATIVEINTTYPEType_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition'"
	 * @generated
	 */
	TEXTType getDefinition();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(TEXTType value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(GRAPHICSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getNONQUANTITATIVEINTTYPEType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon'"
	 * @generated
	 */
	GRAPHICSType getIcon();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(GRAPHICSType value);

} // NONQUANTITATIVEINTTYPEType
