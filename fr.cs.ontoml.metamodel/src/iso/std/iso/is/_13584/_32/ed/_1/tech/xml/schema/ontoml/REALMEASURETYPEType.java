/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REALMEASURETYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getUnit <em>Unit</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getAlternativeUnits <em>Alternative Units</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getAlternativeUnitIds <em>Alternative Unit Ids</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALMEASURETYPEType()
 * @model extendedMetaData="name='REAL_MEASURE_TYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface REALMEASURETYPEType extends ANYTYPEType {
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALMEASURETYPEType_ValueFormat()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUEFORMATTYPEType"
	 *        extendedMetaData="kind='element' name='value_format'"
	 * @generated
	 */
	String getValueFormat();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getValueFormat <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Format</em>' attribute.
	 * @see #getValueFormat()
	 * @generated
	 */
	void setValueFormat(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(DICUNITType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALMEASURETYPEType_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit'"
	 * @generated
	 */
	DICUNITType getUnit();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DICUNITType value);

	/**
	 * Returns the value of the '<em><b>Alternative Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Units</em>' containment reference.
	 * @see #setAlternativeUnits(ALTERNATIVEUNITSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALMEASURETYPEType_AlternativeUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternative_units'"
	 * @generated
	 */
	ALTERNATIVEUNITSType getAlternativeUnits();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getAlternativeUnits <em>Alternative Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Units</em>' containment reference.
	 * @see #getAlternativeUnits()
	 * @generated
	 */
	void setAlternativeUnits(ALTERNATIVEUNITSType value);

	/**
	 * Returns the value of the '<em><b>Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Id</em>' containment reference.
	 * @see #setUnitId(DICUNITREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALMEASURETYPEType_UnitId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit_id'"
	 * @generated
	 */
	DICUNITREFERENCEType getUnitId();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getUnitId <em>Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Id</em>' containment reference.
	 * @see #getUnitId()
	 * @generated
	 */
	void setUnitId(DICUNITREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Alternative Unit Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Unit Ids</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Unit Ids</em>' containment reference.
	 * @see #setAlternativeUnitIds(DICUNITSREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREALMEASURETYPEType_AlternativeUnitIds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternative_unit_ids'"
	 * @generated
	 */
	DICUNITSREFERENCEType getAlternativeUnitIds();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType#getAlternativeUnitIds <em>Alternative Unit Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Unit Ids</em>' containment reference.
	 * @see #getAlternativeUnitIds()
	 * @generated
	 */
	void setAlternativeUnitIds(DICUNITSREFERENCEType value);

} // REALMEASURETYPEType
