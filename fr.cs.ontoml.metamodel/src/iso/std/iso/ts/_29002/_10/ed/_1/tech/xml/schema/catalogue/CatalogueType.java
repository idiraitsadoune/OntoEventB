/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueType#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getCatalogueType()
 * @model extendedMetaData="name='catalogue_Type' kind='elementOnly'"
 * @generated
 */
public interface CatalogueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getCatalogueType_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getItem();

} // CatalogueType
