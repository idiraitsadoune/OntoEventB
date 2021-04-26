/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROGRAMREFERENCETYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getOutParameters <em>Out Parameters</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getInoutParameters <em>Inout Parameters</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROGRAMREFERENCETYPEType()
 * @model extendedMetaData="name='PROGRAM_REFERENCE_TYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface PROGRAMREFERENCETYPEType extends ANYTYPEType {
	/**
	 * Returns the value of the '<em><b>In Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Parameters</em>' containment reference.
	 * @see #setInParameters(PROPERTIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROGRAMREFERENCETYPEType_InParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='in_parameters'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getInParameters();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getInParameters <em>In Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Parameters</em>' containment reference.
	 * @see #getInParameters()
	 * @generated
	 */
	void setInParameters(PROPERTIESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Out Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Parameters</em>' containment reference.
	 * @see #setOutParameters(PROPERTIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROGRAMREFERENCETYPEType_OutParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='out_parameters'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getOutParameters();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getOutParameters <em>Out Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Parameters</em>' containment reference.
	 * @see #getOutParameters()
	 * @generated
	 */
	void setOutParameters(PROPERTIESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Inout Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inout Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inout Parameters</em>' containment reference.
	 * @see #setInoutParameters(PROPERTIESREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROGRAMREFERENCETYPEType_InoutParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inout_parameters'"
	 * @generated
	 */
	PROPERTIESREFERENCEType getInoutParameters();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getInoutParameters <em>Inout Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inout Parameters</em>' containment reference.
	 * @see #getInoutParameters()
	 * @generated
	 */
	void setInoutParameters(PROPERTIESREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Ref</em>' attribute.
	 * @see #setClassRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROGRAMREFERENCETYPEType_ClassRef()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ClassRefType4"
	 *        extendedMetaData="kind='attribute' name='class_ref'"
	 * @generated
	 */
	String getClassRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType#getClassRef <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' attribute.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(String value);

} // PROGRAMREFERENCETYPEType
