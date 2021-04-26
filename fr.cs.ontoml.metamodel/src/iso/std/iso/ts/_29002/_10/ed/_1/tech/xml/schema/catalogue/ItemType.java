/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getClassificationRef <em>Classification Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getReference <em>Reference</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getCreatedView <em>Created View</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getDataSpecificationRef <em>Data Specification Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getInformationSupplierReferenceString <em>Information Supplier Reference String</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsGlobalId <em>Is Global Id</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsModel <em>Is Model</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsProprietary <em>Is Proprietary</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getViewOf <em>View Of</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType()
 * @model extendedMetaData="name='item_Type' kind='elementOnly'"
 * @generated
 */
public interface ItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Classification Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Ref</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Ref</em>' attribute list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_ClassificationRef()
	 * @model unique="false" dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='element' name='classification_ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getClassificationRef();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferenceType> getReference();

	/**
	 * Returns the value of the '<em><b>Property Value</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Value</em>' containment reference list.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_PropertyValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property_value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyValueType> getPropertyValue();

	/**
	 * Returns the value of the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Ref</em>' attribute.
	 * @see #setClassRef(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_ClassRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType" required="true"
	 *        extendedMetaData="kind='attribute' name='class_ref'"
	 * @generated
	 */
	String getClassRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getClassRef <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' attribute.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(String value);

	/**
	 * Returns the value of the '<em><b>Created View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created View</em>' attribute.
	 * @see #setCreatedView(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_CreatedView()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='attribute' name='created_view'"
	 * @generated
	 */
	String getCreatedView();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getCreatedView <em>Created View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created View</em>' attribute.
	 * @see #getCreatedView()
	 * @generated
	 */
	void setCreatedView(String value);

	/**
	 * Returns the value of the '<em><b>Data Specification Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Specification Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Specification Ref</em>' attribute.
	 * @see #setDataSpecificationRef(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_DataSpecificationRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='attribute' name='data_specification_ref'"
	 * @generated
	 */
	String getDataSpecificationRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getDataSpecificationRef <em>Data Specification Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Specification Ref</em>' attribute.
	 * @see #getDataSpecificationRef()
	 * @generated
	 */
	void setDataSpecificationRef(String value);

	/**
	 * Returns the value of the '<em><b>Information Supplier Reference String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Supplier Reference String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Supplier Reference String</em>' attribute.
	 * @see #setInformationSupplierReferenceString(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_InformationSupplierReferenceString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='information_supplier_reference_string'"
	 * @generated
	 */
	String getInformationSupplierReferenceString();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getInformationSupplierReferenceString <em>Information Supplier Reference String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Supplier Reference String</em>' attribute.
	 * @see #getInformationSupplierReferenceString()
	 * @generated
	 */
	void setInformationSupplierReferenceString(String value);

	/**
	 * Returns the value of the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dependent</em>' attribute.
	 * @see #isSetIsDependent()
	 * @see #unsetIsDependent()
	 * @see #setIsDependent(boolean)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_IsDependent()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='is_dependent'"
	 * @generated
	 */
	boolean isIsDependent();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsDependent <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dependent</em>' attribute.
	 * @see #isSetIsDependent()
	 * @see #unsetIsDependent()
	 * @see #isIsDependent()
	 * @generated
	 */
	void setIsDependent(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsDependent <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDependent()
	 * @see #isIsDependent()
	 * @see #setIsDependent(boolean)
	 * @generated
	 */
	void unsetIsDependent();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsDependent <em>Is Dependent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Dependent</em>' attribute is set.
	 * @see #unsetIsDependent()
	 * @see #isIsDependent()
	 * @see #setIsDependent(boolean)
	 * @generated
	 */
	boolean isSetIsDependent();

	/**
	 * Returns the value of the '<em><b>Is Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Global Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Global Id</em>' attribute.
	 * @see #isSetIsGlobalId()
	 * @see #unsetIsGlobalId()
	 * @see #setIsGlobalId(boolean)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_IsGlobalId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='is_global_id'"
	 * @generated
	 */
	boolean isIsGlobalId();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsGlobalId <em>Is Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Global Id</em>' attribute.
	 * @see #isSetIsGlobalId()
	 * @see #unsetIsGlobalId()
	 * @see #isIsGlobalId()
	 * @generated
	 */
	void setIsGlobalId(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsGlobalId <em>Is Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsGlobalId()
	 * @see #isIsGlobalId()
	 * @see #setIsGlobalId(boolean)
	 * @generated
	 */
	void unsetIsGlobalId();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsGlobalId <em>Is Global Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Global Id</em>' attribute is set.
	 * @see #unsetIsGlobalId()
	 * @see #isIsGlobalId()
	 * @see #setIsGlobalId(boolean)
	 * @generated
	 */
	boolean isSetIsGlobalId();

	/**
	 * Returns the value of the '<em><b>Is Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Model</em>' attribute.
	 * @see #isSetIsModel()
	 * @see #unsetIsModel()
	 * @see #setIsModel(boolean)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_IsModel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='is_model'"
	 * @generated
	 */
	boolean isIsModel();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsModel <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Model</em>' attribute.
	 * @see #isSetIsModel()
	 * @see #unsetIsModel()
	 * @see #isIsModel()
	 * @generated
	 */
	void setIsModel(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsModel <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsModel()
	 * @see #isIsModel()
	 * @see #setIsModel(boolean)
	 * @generated
	 */
	void unsetIsModel();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsModel <em>Is Model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Model</em>' attribute is set.
	 * @see #unsetIsModel()
	 * @see #isIsModel()
	 * @see #setIsModel(boolean)
	 * @generated
	 */
	boolean isSetIsModel();

	/**
	 * Returns the value of the '<em><b>Is Proprietary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Proprietary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Proprietary</em>' attribute.
	 * @see #isSetIsProprietary()
	 * @see #unsetIsProprietary()
	 * @see #setIsProprietary(boolean)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_IsProprietary()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='is_proprietary'"
	 * @generated
	 */
	boolean isIsProprietary();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsProprietary <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Proprietary</em>' attribute.
	 * @see #isSetIsProprietary()
	 * @see #unsetIsProprietary()
	 * @see #isIsProprietary()
	 * @generated
	 */
	void setIsProprietary(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsProprietary <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsProprietary()
	 * @see #isIsProprietary()
	 * @see #setIsProprietary(boolean)
	 * @generated
	 */
	void unsetIsProprietary();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#isIsProprietary <em>Is Proprietary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Proprietary</em>' attribute is set.
	 * @see #unsetIsProprietary()
	 * @see #isIsProprietary()
	 * @see #setIsProprietary(boolean)
	 * @generated
	 */
	boolean isSetIsProprietary();

	/**
	 * Returns the value of the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Id</em>' attribute.
	 * @see #setLocalId(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_LocalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='local_id'"
	 * @generated
	 */
	String getLocalId();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(String value);

	/**
	 * Returns the value of the '<em><b>View Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Of</em>' attribute.
	 * @see #setViewOf(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#getItemType_ViewOf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='view_of'"
	 * @generated
	 */
	String getViewOf();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType#getViewOf <em>View Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Of</em>' attribute.
	 * @see #getViewOf()
	 * @generated
	 */
	void setViewOf(String value);

} // ItemType
