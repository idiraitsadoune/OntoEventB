/**
 */
package iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier;

import java.util.List;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getIRDI <em>IRDI</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getIRDIList <em>IRDI List</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>IRDI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRDI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRDI</em>' attribute.
	 * @see #setIRDI(String)
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage#getDocumentRoot_IRDI()
	 * @model unique="false" dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IRDI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIRDI();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getIRDI <em>IRDI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRDI</em>' attribute.
	 * @see #getIRDI()
	 * @generated
	 */
	void setIRDI(String value);

	/**
	 * Returns the value of the '<em><b>IRDI List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRDI List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRDI List</em>' attribute.
	 * @see #setIRDIList(List)
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage#getDocumentRoot_IRDIList()
	 * @model unique="false" dataType="iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDIListType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IRDI_list' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getIRDIList();

	/**
	 * Sets the value of the '{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot#getIRDIList <em>IRDI List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRDI List</em>' attribute.
	 * @see #getIRDIList()
	 * @generated
	 */
	void setIRDIList(List<String> value);

} // DocumentRoot
