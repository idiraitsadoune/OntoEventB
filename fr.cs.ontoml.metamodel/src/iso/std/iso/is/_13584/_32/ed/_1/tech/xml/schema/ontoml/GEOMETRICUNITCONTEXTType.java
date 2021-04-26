/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEOMETRICUNITCONTEXT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLengthUnit <em>Length Unit</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLengthUnitId <em>Length Unit Id</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLangleUnit <em>Langle Unit</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getAngleUnitId <em>Angle Unit Id</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getGEOMETRICUNITCONTEXTType()
 * @model extendedMetaData="name='GEOMETRIC_UNIT_CONTEXT_Type' kind='elementOnly'"
 * @generated
 */
public interface GEOMETRICUNITCONTEXTType extends EObject {
	/**
	 * Returns the value of the '<em><b>Length Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Unit</em>' containment reference.
	 * @see #setLengthUnit(DICUNITType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getGEOMETRICUNITCONTEXTType_LengthUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length_unit'"
	 * @generated
	 */
	DICUNITType getLengthUnit();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLengthUnit <em>Length Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Unit</em>' containment reference.
	 * @see #getLengthUnit()
	 * @generated
	 */
	void setLengthUnit(DICUNITType value);

	/**
	 * Returns the value of the '<em><b>Length Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Unit Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Unit Id</em>' containment reference.
	 * @see #setLengthUnitId(DICUNITREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getGEOMETRICUNITCONTEXTType_LengthUnitId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length_unit_id'"
	 * @generated
	 */
	DICUNITREFERENCEType getLengthUnitId();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLengthUnitId <em>Length Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Unit Id</em>' containment reference.
	 * @see #getLengthUnitId()
	 * @generated
	 */
	void setLengthUnitId(DICUNITREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Langle Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Langle Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langle Unit</em>' containment reference.
	 * @see #setLangleUnit(DICUNITType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getGEOMETRICUNITCONTEXTType_LangleUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='langle_unit'"
	 * @generated
	 */
	DICUNITType getLangleUnit();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getLangleUnit <em>Langle Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langle Unit</em>' containment reference.
	 * @see #getLangleUnit()
	 * @generated
	 */
	void setLangleUnit(DICUNITType value);

	/**
	 * Returns the value of the '<em><b>Angle Unit Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Unit Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Unit Id</em>' containment reference.
	 * @see #setAngleUnitId(DICUNITREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getGEOMETRICUNITCONTEXTType_AngleUnitId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angle_unit_id'"
	 * @generated
	 */
	DICUNITREFERENCEType getAngleUnitId();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType#getAngleUnitId <em>Angle Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Unit Id</em>' containment reference.
	 * @see #getAngleUnitId()
	 * @generated
	 */
	void setAngleUnitId(DICUNITREFERENCEType value);

} // GEOMETRICUNITCONTEXTType
