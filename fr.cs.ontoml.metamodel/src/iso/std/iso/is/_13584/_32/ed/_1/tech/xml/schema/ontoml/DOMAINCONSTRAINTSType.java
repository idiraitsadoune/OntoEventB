/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOMAINCONSTRAINTS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTSType#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOMAINCONSTRAINTSType()
 * @model extendedMetaData="name='DOMAIN_CONSTRAINTS_Type' kind='elementOnly'"
 * @generated
 */
public interface DOMAINCONSTRAINTSType extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getDOMAINCONSTRAINTSType_Constraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='constraint'"
	 * @generated
	 */
	EList<DOMAINCONSTRAINTType> getConstraint();

} // DOMAINCONSTRAINTSType
