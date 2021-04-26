/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getDesignation <em>Designation</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getOrganizationCode <em>Organization Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getOrganizationRef <em>Organization Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getReferenceType()
 * @model extendedMetaData="name='reference_Type' kind='elementOnly'"
 * @generated
 */
public interface ReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference.
	 * @see #setDesignation(InternationalTextType)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getReferenceType_Designation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	InternationalTextType getDesignation();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getDesignation <em>Designation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designation</em>' containment reference.
	 * @see #getDesignation()
	 * @generated
	 */
	void setDesignation(InternationalTextType value);

	/**
	 * Returns the value of the '<em><b>Organization Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Code</em>' attribute.
	 * @see #setOrganizationCode(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getReferenceType_OrganizationCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='organization_code'"
	 * @generated
	 */
	String getOrganizationCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getOrganizationCode <em>Organization Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Code</em>' attribute.
	 * @see #getOrganizationCode()
	 * @generated
	 */
	void setOrganizationCode(String value);

	/**
	 * Returns the value of the '<em><b>Organization Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Ref</em>' attribute.
	 * @see #setOrganizationRef(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getReferenceType_OrganizationRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='attribute' name='organization_ref'"
	 * @generated
	 */
	String getOrganizationRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getOrganizationRef <em>Organization Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Ref</em>' attribute.
	 * @see #getOrganizationRef()
	 * @generated
	 */
	void setOrganizationRef(String value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getReferenceType_ReferenceNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='reference_number'"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

} // ReferenceType
