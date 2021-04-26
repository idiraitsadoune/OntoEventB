/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITEMCLASS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#getSimplifiedDrawing <em>Simplified Drawing</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#getCodedName <em>Coded Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#isInstanceSharable <em>Instance Sharable</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSType()
 * @model extendedMetaData="name='ITEM_CLASS_Type' kind='elementOnly'"
 * @generated
 */
public interface ITEMCLASSType extends CLASSType {
	/**
	 * Returns the value of the '<em><b>Simplified Drawing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simplified Drawing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplified Drawing</em>' containment reference.
	 * @see #setSimplifiedDrawing(GRAPHICSType)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSType_SimplifiedDrawing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simplified_drawing'"
	 * @generated
	 */
	GRAPHICSType getSimplifiedDrawing();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#getSimplifiedDrawing <em>Simplified Drawing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simplified Drawing</em>' containment reference.
	 * @see #getSimplifiedDrawing()
	 * @generated
	 */
	void setSimplifiedDrawing(GRAPHICSType value);

	/**
	 * Returns the value of the '<em><b>Coded Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coded Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coded Name</em>' attribute.
	 * @see #setCodedName(String)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSType_CodedName()
	 * @model dataType="iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VALUECODETYPEType"
	 *        extendedMetaData="kind='element' name='coded_name'"
	 * @generated
	 */
	String getCodedName();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#getCodedName <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coded Name</em>' attribute.
	 * @see #getCodedName()
	 * @generated
	 */
	void setCodedName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Sharable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Sharable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Sharable</em>' attribute.
	 * @see #isSetInstanceSharable()
	 * @see #unsetInstanceSharable()
	 * @see #setInstanceSharable(boolean)
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getITEMCLASSType_InstanceSharable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='instance_sharable'"
	 * @generated
	 */
	boolean isInstanceSharable();

	/**
	 * Sets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#isInstanceSharable <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Sharable</em>' attribute.
	 * @see #isSetInstanceSharable()
	 * @see #unsetInstanceSharable()
	 * @see #isInstanceSharable()
	 * @generated
	 */
	void setInstanceSharable(boolean value);

	/**
	 * Unsets the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#isInstanceSharable <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstanceSharable()
	 * @see #isInstanceSharable()
	 * @see #setInstanceSharable(boolean)
	 * @generated
	 */
	void unsetInstanceSharable();

	/**
	 * Returns whether the value of the '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType#isInstanceSharable <em>Instance Sharable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance Sharable</em>' attribute is set.
	 * @see #unsetInstanceSharable()
	 * @see #isInstanceSharable()
	 * @see #setInstanceSharable(boolean)
	 * @generated
	 */
	boolean isSetInstanceSharable();

} // ITEMCLASSType
