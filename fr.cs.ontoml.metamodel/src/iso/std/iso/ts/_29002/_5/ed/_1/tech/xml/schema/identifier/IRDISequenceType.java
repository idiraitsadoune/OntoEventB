/**
 */
package iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRDI Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDISequenceType#getIRDI <em>IRDI</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage#getIRDISequenceType()
 * @model extendedMetaData="name='IRDI_sequence_type' kind='elementOnly'"
 * @generated
 */
public interface IRDISequenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>IRDI</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRDI</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRDI</em>' attribute list.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage#getIRDISequenceType_IRDI()
	 * @model unique="false" dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='element' name='IRDI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getIRDI();

} // IRDISequenceType
