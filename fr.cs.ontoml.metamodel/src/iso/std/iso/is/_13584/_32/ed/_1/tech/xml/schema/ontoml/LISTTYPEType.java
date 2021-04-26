/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LISTTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getBound1 <em>Bound1</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getBound2 <em>Bound2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#isUniqueness <em>Uniqueness</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLISTTYPEType()
 * @model extendedMetaData="name='LIST_TYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface LISTTYPEType extends ANYTYPEType {
	/**
	 * Returns the value of the '<em><b>Bound1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound1</em>' attribute.
	 * @see #setBound1(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLISTTYPEType_Bound1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='bound_1'"
	 * @generated
	 */
	BigInteger getBound1();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getBound1 <em>Bound1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound1</em>' attribute.
	 * @see #getBound1()
	 * @generated
	 */
	void setBound1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Bound2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound2</em>' attribute.
	 * @see #setBound2(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLISTTYPEType_Bound2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='bound_2'"
	 * @generated
	 */
	BigInteger getBound2();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getBound2 <em>Bound2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound2</em>' attribute.
	 * @see #getBound2()
	 * @generated
	 */
	void setBound2(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' containment reference.
	 * @see #setValueType(ANYTYPEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLISTTYPEType_ValueType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value_type'"
	 * @generated
	 */
	ANYTYPEType getValueType();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#getValueType <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' containment reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ANYTYPEType value);

	/**
	 * Returns the value of the '<em><b>Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uniqueness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uniqueness</em>' attribute.
	 * @see #isSetUniqueness()
	 * @see #unsetUniqueness()
	 * @see #setUniqueness(boolean)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getLISTTYPEType_Uniqueness()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='uniqueness'"
	 * @generated
	 */
	boolean isUniqueness();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#isUniqueness <em>Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uniqueness</em>' attribute.
	 * @see #isSetUniqueness()
	 * @see #unsetUniqueness()
	 * @see #isUniqueness()
	 * @generated
	 */
	void setUniqueness(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#isUniqueness <em>Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniqueness()
	 * @see #isUniqueness()
	 * @see #setUniqueness(boolean)
	 * @generated
	 */
	void unsetUniqueness();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType#isUniqueness <em>Uniqueness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uniqueness</em>' attribute is set.
	 * @see #unsetUniqueness()
	 * @see #isUniqueness()
	 * @see #setUniqueness(boolean)
	 * @generated
	 */
	boolean isSetUniqueness();

} // LISTTYPEType
