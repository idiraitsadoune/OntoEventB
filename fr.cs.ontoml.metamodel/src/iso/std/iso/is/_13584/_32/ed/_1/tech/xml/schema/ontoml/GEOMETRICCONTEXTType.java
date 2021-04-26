/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEOMETRICCONTEXT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType#getDescription <em>Description</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType#getCoordinateSoaceDimension <em>Coordinate Soace Dimension</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getGEOMETRICCONTEXTType()
 * @model extendedMetaData="name='GEOMETRIC_CONTEXT_Type' kind='elementOnly'"
 * @generated
 */
public interface GEOMETRICCONTEXTType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(TEXTType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getGEOMETRICCONTEXTType_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	TEXTType getDescription();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(TEXTType value);

	/**
	 * Returns the value of the '<em><b>Coordinate Soace Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Soace Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Soace Dimension</em>' attribute.
	 * @see #setCoordinateSoaceDimension(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getGEOMETRICCONTEXTType_CoordinateSoaceDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='coordinate_soace_dimension'"
	 * @generated
	 */
	BigInteger getCoordinateSoaceDimension();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType#getCoordinateSoaceDimension <em>Coordinate Soace Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Soace Dimension</em>' attribute.
	 * @see #getCoordinateSoaceDimension()
	 * @generated
	 */
	void setCoordinateSoaceDimension(BigInteger value);

} // GEOMETRICCONTEXTType
