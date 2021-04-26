/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SETWITHSUBSETCONSTRAINTTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getBound1 <em>Bound1</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getBound2 <em>Bound2</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getCardinalMin <em>Cardinal Min</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getCardinalMax <em>Cardinal Max</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSETWITHSUBSETCONSTRAINTTYPEType()
 * @model extendedMetaData="name='SET_WITH_SUBSET_CONSTRAINT_TYPE_Type' kind='elementOnly'"
 * @generated
 */
public interface SETWITHSUBSETCONSTRAINTTYPEType extends ANYTYPEType {
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSETWITHSUBSETCONSTRAINTTYPEType_Bound1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='bound_1'"
	 * @generated
	 */
	BigInteger getBound1();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getBound1 <em>Bound1</em>}' attribute.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSETWITHSUBSETCONSTRAINTTYPEType_Bound2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='bound_2'"
	 * @generated
	 */
	BigInteger getBound2();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getBound2 <em>Bound2</em>}' attribute.
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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSETWITHSUBSETCONSTRAINTTYPEType_ValueType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value_type'"
	 * @generated
	 */
	ANYTYPEType getValueType();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getValueType <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' containment reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ANYTYPEType value);

	/**
	 * Returns the value of the '<em><b>Cardinal Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinal Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinal Min</em>' attribute.
	 * @see #setCardinalMin(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSETWITHSUBSETCONSTRAINTTYPEType_CardinalMin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='cardinal_min'"
	 * @generated
	 */
	BigInteger getCardinalMin();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getCardinalMin <em>Cardinal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinal Min</em>' attribute.
	 * @see #getCardinalMin()
	 * @generated
	 */
	void setCardinalMin(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cardinal Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinal Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinal Max</em>' attribute.
	 * @see #setCardinalMax(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getSETWITHSUBSETCONSTRAINTTYPEType_CardinalMax()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='cardinal_max'"
	 * @generated
	 */
	BigInteger getCardinalMax();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType#getCardinalMax <em>Cardinal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinal Max</em>' attribute.
	 * @see #getCardinalMax()
	 * @generated
	 */
	void setCardinalMax(BigInteger value);

} // SETWITHSUBSETCONSTRAINTTYPEType
