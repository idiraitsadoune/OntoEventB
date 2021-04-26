/**
 */
package iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.util;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage
 * @generated
 */
public class IdentifierValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IdentifierValidator INSTANCE = new IdentifierValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return IdentifierPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case IdentifierPackage.IRDI_SEQUENCE_TYPE:
				return validateIRDISequenceType((IRDISequenceType)value, diagnostics, context);
			case IdentifierPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case IdentifierPackage.IRDI_LIST_TYPE:
				return validateIRDIListType((List<?>)value, diagnostics, context);
			case IdentifierPackage.IRDI_TYPE:
				return validateIRDIType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIRDISequenceType(IRDISequenceType irdiSequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(irdiSequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIRDIListType(List<?> irdiListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIRDIListType_ItemType(irdiListType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>IRDI List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIRDIListType_ItemType(List<?> irdiListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = irdiListType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (IdentifierPackage.Literals.IRDI_TYPE.isInstance(item)) {
				result &= validateIRDIType((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(IdentifierPackage.Literals.IRDI_TYPE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIRDIType(String irdiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIRDIType_Pattern(irdiType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIRDIType_Pattern
	 */
	public static final  PatternMatcher [][] IRDI_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>IRDI Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIRDIType_Pattern(String irdiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(IdentifierPackage.Literals.IRDI_TYPE, irdiType, IRDI_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //IdentifierValidator
