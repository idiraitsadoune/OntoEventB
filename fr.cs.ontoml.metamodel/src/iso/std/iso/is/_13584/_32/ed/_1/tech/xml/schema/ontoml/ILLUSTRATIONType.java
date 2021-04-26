/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ILLUSTRATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getCode <em>Code</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getKindOfContent <em>Kind Of Content</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getWidth <em>Width</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getHeight <em>Height</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getStandardSize <em>Standard Size</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getILLUSTRATIONType()
 * @model extendedMetaData="name='ILLUSTRATION_Type' kind='elementOnly'"
 * @generated
 */
public interface ILLUSTRATIONType extends EXTERNALRESOURCEType {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getILLUSTRATIONType_Code()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALITEMCODETYPEType" required="true"
	 *        extendedMetaData="kind='element' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Kind Of Content</b></em>' attribute.
	 * The literals are from the enumeration {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Of Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Of Content</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType
	 * @see #isSetKindOfContent()
	 * @see #unsetKindOfContent()
	 * @see #setKindOfContent(ILLUSTRATIONTYPEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getILLUSTRATIONType_KindOfContent()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='kind_of_content'"
	 * @generated
	 */
	ILLUSTRATIONTYPEType getKindOfContent();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getKindOfContent <em>Kind Of Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Of Content</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType
	 * @see #isSetKindOfContent()
	 * @see #unsetKindOfContent()
	 * @see #getKindOfContent()
	 * @generated
	 */
	void setKindOfContent(ILLUSTRATIONTYPEType value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getKindOfContent <em>Kind Of Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKindOfContent()
	 * @see #getKindOfContent()
	 * @see #setKindOfContent(ILLUSTRATIONTYPEType)
	 * @generated
	 */
	void unsetKindOfContent();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getKindOfContent <em>Kind Of Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind Of Content</em>' attribute is set.
	 * @see #unsetKindOfContent()
	 * @see #getKindOfContent()
	 * @see #setKindOfContent(ILLUSTRATIONTYPEType)
	 * @generated
	 */
	boolean isSetKindOfContent();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getILLUSTRATIONType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='width'"
	 * @generated
	 */
	BigInteger getWidth();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(BigInteger)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getILLUSTRATIONType_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='height'"
	 * @generated
	 */
	BigInteger getHeight();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Standard Size</b></em>' attribute.
	 * The literals are from the enumeration {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Size</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType
	 * @see #isSetStandardSize()
	 * @see #unsetStandardSize()
	 * @see #setStandardSize(STANDARDSIZEType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getILLUSTRATIONType_StandardSize()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='standard_size'"
	 * @generated
	 */
	STANDARDSIZEType getStandardSize();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getStandardSize <em>Standard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Size</em>' attribute.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType
	 * @see #isSetStandardSize()
	 * @see #unsetStandardSize()
	 * @see #getStandardSize()
	 * @generated
	 */
	void setStandardSize(STANDARDSIZEType value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getStandardSize <em>Standard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStandardSize()
	 * @see #getStandardSize()
	 * @see #setStandardSize(STANDARDSIZEType)
	 * @generated
	 */
	void unsetStandardSize();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType#getStandardSize <em>Standard Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Standard Size</em>' attribute is set.
	 * @see #unsetStandardSize()
	 * @see #getStandardSize()
	 * @see #setStandardSize(STANDARDSIZEType)
	 * @generated
	 */
	boolean isSetStandardSize();

} // ILLUSTRATIONType
