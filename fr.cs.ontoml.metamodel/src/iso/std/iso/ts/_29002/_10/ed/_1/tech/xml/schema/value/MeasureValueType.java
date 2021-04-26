/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getPresentationUOMCode <em>Presentation UOM Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getPresentationUOMRef <em>Presentation UOM Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getUOMCode <em>UOM Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getUOMRef <em>UOM Ref</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureValueType()
 * @model abstract="true"
 *        extendedMetaData="name='measure_value_Type' kind='empty'"
 * @generated
 */
public interface MeasureValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Presentation UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation UOM Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation UOM Code</em>' attribute.
	 * @see #setPresentationUOMCode(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureValueType_PresentationUOMCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='presentation_UOM_code'"
	 * @generated
	 */
	String getPresentationUOMCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getPresentationUOMCode <em>Presentation UOM Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation UOM Code</em>' attribute.
	 * @see #getPresentationUOMCode()
	 * @generated
	 */
	void setPresentationUOMCode(String value);

	/**
	 * Returns the value of the '<em><b>Presentation UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation UOM Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation UOM Ref</em>' attribute.
	 * @see #setPresentationUOMRef(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureValueType_PresentationUOMRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='attribute' name='presentation_UOM_ref'"
	 * @generated
	 */
	String getPresentationUOMRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getPresentationUOMRef <em>Presentation UOM Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation UOM Ref</em>' attribute.
	 * @see #getPresentationUOMRef()
	 * @generated
	 */
	void setPresentationUOMRef(String value);

	/**
	 * Returns the value of the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UOM Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UOM Code</em>' attribute.
	 * @see #setUOMCode(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureValueType_UOMCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='UOM_code'"
	 * @generated
	 */
	String getUOMCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getUOMCode <em>UOM Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UOM Code</em>' attribute.
	 * @see #getUOMCode()
	 * @generated
	 */
	void setUOMCode(String value);

	/**
	 * Returns the value of the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UOM Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UOM Ref</em>' attribute.
	 * @see #setUOMRef(String)
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#getMeasureValueType_UOMRef()
	 * @model dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType"
	 *        extendedMetaData="kind='attribute' name='UOM_ref'"
	 * @generated
	 */
	String getUOMRef();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType#getUOMRef <em>UOM Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UOM Ref</em>' attribute.
	 * @see #getUOMRef()
	 * @generated
	 */
	void setUOMRef(String value);

} // MeasureValueType
