/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRECONDITION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PRECONDITIONType#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPRECONDITIONType()
 * @model extendedMetaData="name='PRECONDITION_Type' kind='elementOnly'"
 * @generated
 */
public interface PRECONDITIONType extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getPRECONDITIONType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter'"
	 * @generated
	 */
	EList<FILTERType> getFilter();

} // PRECONDITIONType
