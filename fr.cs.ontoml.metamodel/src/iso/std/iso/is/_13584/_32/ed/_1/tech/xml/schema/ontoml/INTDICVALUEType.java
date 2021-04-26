/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INTDICVALUE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTDICVALUEType#getValueCode <em>Value Code</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINTDICVALUEType()
 * @model extendedMetaData="name='INT_DIC_VALUE_Type' kind='elementOnly'"
 * @generated
 */
public interface INTDICVALUEType extends DICVALUEType {
	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Code</em>' attribute.
	 * @see #setValueCode(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getINTDICVALUEType_ValueCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='value_code'"
	 * @generated
	 */
	BigInteger getValueCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTDICVALUEType#getValueCode <em>Value Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Code</em>' attribute.
	 * @see #getValueCode()
	 * @generated
	 */
	void setValueCode(BigInteger value);

} // INTDICVALUEType
