/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LIBRARY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType#getContainedClassExtensions <em>Contained Class Extensions</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType#getResponsibleSupplier <em>Responsible Supplier</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLIBRARYType()
 * @model extendedMetaData="name='LIBRARY_Type' kind='elementOnly'"
 * @generated
 */
public interface LIBRARYType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Class Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Class Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Class Extensions</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLIBRARYType_ContainedClassExtensions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contained_class_extensions'"
	 * @generated
	 */
	EList<CONTAINEDCLASSEXTENSIONSType> getContainedClassExtensions();

	/**
	 * Returns the value of the '<em><b>Responsible Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Supplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Supplier</em>' containment reference.
	 * @see #setResponsibleSupplier(SUPPLIERREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLIBRARYType_ResponsibleSupplier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='responsible_supplier'"
	 * @generated
	 */
	SUPPLIERREFERENCEType getResponsibleSupplier();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType#getResponsibleSupplier <em>Responsible Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Supplier</em>' containment reference.
	 * @see #getResponsibleSupplier()
	 * @generated
	 */
	void setResponsibleSupplier(SUPPLIERREFERENCEType value);

} // LIBRARYType
