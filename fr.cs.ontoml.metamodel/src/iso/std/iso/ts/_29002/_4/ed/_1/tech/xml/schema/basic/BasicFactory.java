/**
 */
package iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage
 * @generated
 */
public interface BasicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicFactory eINSTANCE = iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>International Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>International Text Type</em>'.
	 * @generated
	 */
	InternationalTextType createInternationalTextType();

	/**
	 * Returns a new object of class '<em>Language String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language String Type</em>'.
	 * @generated
	 */
	LanguageStringType createLanguageStringType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicPackage getBasicPackage();

} //BasicFactory
