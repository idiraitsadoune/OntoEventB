/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REMOTELOCATIONS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REMOTELOCATIONSType#getRemoteLocation <em>Remote Location</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREMOTELOCATIONSType()
 * @model extendedMetaData="name='REMOTE_LOCATIONS_Type' kind='elementOnly'"
 * @generated
 */
public interface REMOTELOCATIONSType extends EObject {
	/**
	 * Returns the value of the '<em><b>Remote Location</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Location</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getREMOTELOCATIONSType_RemoteLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='remote_location'"
	 * @generated
	 */
	EList<RemoteLocationType> getRemoteLocation();

} // REMOTELOCATIONSType
