/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DICUNIT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getStructuredRepresentation <em>Structured Representation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getStringRepresentation <em>String Representation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getUnitRef <em>Unit Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICUNITType()
 * @model extendedMetaData="name='DIC_UNIT_Type' kind='elementOnly'"
 * @generated
 */
public interface DICUNITType extends EObject {
	/**
	 * Returns the value of the '<em><b>Structured Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Representation</em>' containment reference.
	 * @see #setStructuredRepresentation(UNITType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICUNITType_StructuredRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structured_representation'"
	 * @generated
	 */
	UNITType getStructuredRepresentation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getStructuredRepresentation <em>Structured Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Representation</em>' containment reference.
	 * @see #getStructuredRepresentation()
	 * @generated
	 */
	void setStructuredRepresentation(UNITType value);

	/**
	 * Returns the value of the '<em><b>String Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Representation</em>' containment reference.
	 * @see #setStringRepresentation(MATHEMATICALSTRINGType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICUNITType_StringRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='string_representation'"
	 * @generated
	 */
	MATHEMATICALSTRINGType getStringRepresentation();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getStringRepresentation <em>String Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Representation</em>' containment reference.
	 * @see #getStringRepresentation()
	 * @generated
	 */
	void setStringRepresentation(MATHEMATICALSTRINGType value);

	/**
	 * Returns the value of the '<em><b>Unit Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Ref</em>' attribute.
	 * @see #setUnitRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDICUNITType_UnitRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='attribute' name='unit_ref'"
	 * @generated
	 */
	String getUnitRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType#getUnitRef <em>Unit Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Ref</em>' attribute.
	 * @see #getUnitRef()
	 * @generated
	 */
	void setUnitRef(String value);

} // DICUNITType
