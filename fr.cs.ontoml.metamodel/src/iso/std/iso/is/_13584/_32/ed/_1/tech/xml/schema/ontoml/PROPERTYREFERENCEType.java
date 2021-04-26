/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROPERTYREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYREFERENCEType()
 * @model extendedMetaData="name='PROPERTY_REFERENCE_Type' kind='empty'"
 * @generated
 */
public interface PROPERTYREFERENCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Number</em>' attribute.
	 * @see #isSetOrderNumber()
	 * @see #unsetOrderNumber()
	 * @see #setOrderNumber(int)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYREFERENCEType_OrderNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='order_number'"
	 * @generated
	 */
	int getOrderNumber();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getOrderNumber <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Number</em>' attribute.
	 * @see #isSetOrderNumber()
	 * @see #unsetOrderNumber()
	 * @see #getOrderNumber()
	 * @generated
	 */
	void setOrderNumber(int value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getOrderNumber <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrderNumber()
	 * @see #getOrderNumber()
	 * @see #setOrderNumber(int)
	 * @generated
	 */
	void unsetOrderNumber();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getOrderNumber <em>Order Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order Number</em>' attribute is set.
	 * @see #unsetOrderNumber()
	 * @see #getOrderNumber()
	 * @see #setOrderNumber(int)
	 * @generated
	 */
	boolean isSetOrderNumber();

	/**
	 * Returns the value of the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Ref</em>' attribute.
	 * @see #setPropertyRef(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPROPERTYREFERENCEType_PropertyRef()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PropertyId" required="true"
	 *        extendedMetaData="kind='attribute' name='property_ref'"
	 * @generated
	 */
	String getPropertyRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType#getPropertyRef <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Ref</em>' attribute.
	 * @see #getPropertyRef()
	 * @generated
	 */
	void setPropertyRef(String value);

} // PROPERTYREFERENCEType
