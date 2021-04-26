/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUPPORTEDVEP Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPORTEDVEPType#getViewExchangeProtocolIdentification <em>View Exchange Protocol Identification</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUPPORTEDVEPType()
 * @model extendedMetaData="name='SUPPORTED_VEP_Type' kind='elementOnly'"
 * @generated
 */
public interface SUPPORTEDVEPType extends EObject {
	/**
	 * Returns the value of the '<em><b>View Exchange Protocol Identification</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Exchange Protocol Identification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Exchange Protocol Identification</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUPPORTEDVEPType_ViewExchangeProtocolIdentification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='view_exchange_protocol_identification'"
	 * @generated
	 */
	EList<VIEWEXCHANGEPROTOCOLIDENTIFICATIONType> getViewExchangeProtocolIdentification();

} // SUPPORTEDVEPType
