/**
 */
package iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage
 * @generated
 */
public interface IdentifierFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdentifierFactory eINSTANCE = iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IRDI Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IRDI Sequence Type</em>'.
	 * @generated
	 */
	IRDISequenceType createIRDISequenceType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdentifierPackage getIdentifierPackage();

} //IdentifierFactory
