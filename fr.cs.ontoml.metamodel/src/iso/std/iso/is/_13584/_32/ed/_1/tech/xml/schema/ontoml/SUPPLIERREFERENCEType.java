/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUPPLIERREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType#getSupplierRef <em>Supplier Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUPPLIERREFERENCEType()
 * @model extendedMetaData="name='SUPPLIER_REFERENCE_Type' kind='empty'"
 * @generated
 */
public interface SUPPLIERREFERENCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Supplier Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Ref</em>' attribute.
	 * @see #setSupplierRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSUPPLIERREFERENCEType_SupplierRef()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SupplierId" required="true"
	 *        extendedMetaData="kind='attribute' name='supplier_ref'"
	 * @generated
	 */
	String getSupplierRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType#getSupplierRef <em>Supplier Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Ref</em>' attribute.
	 * @see #getSupplierRef()
	 * @generated
	 */
	void setSupplierRef(String value);

} // SUPPLIERREFERENCEType
