/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DERIVEDUNIT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITType#getDerivedUnitElement <em>Derived Unit Element</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDERIVEDUNITType()
 * @model extendedMetaData="name='DERIVED_UNIT_Type' kind='elementOnly'"
 * @generated
 */
public interface DERIVEDUNITType extends UNITType {
	/**
	 * Returns the value of the '<em><b>Derived Unit Element</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Unit Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Unit Element</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDERIVEDUNITType_DerivedUnitElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='derived_unit_element'"
	 * @generated
	 */
	EList<DERIVEDUNITELEMENTType> getDerivedUnitElement();

} // DERIVEDUNITType
