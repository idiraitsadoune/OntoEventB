/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VIEWCONTROLVARIABLERANGE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getRangeLobound <em>Range Lobound</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getRangeHibound <em>Range Hibound</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWCONTROLVARIABLERANGEType()
 * @model extendedMetaData="name='VIEW_CONTROL_VARIABLE_RANGE_Type' kind='elementOnly'"
 * @generated
 */
public interface VIEWCONTROLVARIABLERANGEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' containment reference.
	 * @see #setParameterType(PROPERTYREFERENCEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWCONTROLVARIABLERANGEType_ParameterType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameter_type'"
	 * @generated
	 */
	PROPERTYREFERENCEType getParameterType();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getParameterType <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' containment reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(PROPERTYREFERENCEType value);

	/**
	 * Returns the value of the '<em><b>Range Lobound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Lobound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Lobound</em>' attribute.
	 * @see #setRangeLobound(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWCONTROLVARIABLERANGEType_RangeLobound()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='range_lobound'"
	 * @generated
	 */
	BigInteger getRangeLobound();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getRangeLobound <em>Range Lobound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Lobound</em>' attribute.
	 * @see #getRangeLobound()
	 * @generated
	 */
	void setRangeLobound(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Range Hibound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Hibound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Hibound</em>' attribute.
	 * @see #setRangeHibound(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVIEWCONTROLVARIABLERANGEType_RangeHibound()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='range_hibound'"
	 * @generated
	 */
	BigInteger getRangeHibound();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType#getRangeHibound <em>Range Hibound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Hibound</em>' attribute.
	 * @see #getRangeHibound()
	 * @generated
	 */
	void setRangeHibound(BigInteger value);

} // VIEWCONTROLVARIABLERANGEType
