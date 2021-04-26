/**
 */
package iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.util;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.*;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage
 * @generated
 */
public class BasicValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasicValidator INSTANCE = new BasicValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic";

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
	public BasicValidator() {
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
	  return BasicPackage.eINSTANCE;
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
			case BasicPackage.INTERNATIONAL_TEXT_TYPE:
				return validateInternationalTextType((InternationalTextType)value, diagnostics, context);
			case BasicPackage.LANGUAGE_STRING_TYPE:
				return validateLanguageStringType((LanguageStringType)value, diagnostics, context);
			case BasicPackage.ASN1_IDENTIFIER_TYPE:
				return validateASN1IdentifierType((String)value, diagnostics, context);
			case BasicPackage.DAY_INTERVAL_TYPE:
				return validateDayIntervalType((XMLGregorianCalendar)value, diagnostics, context);
			case BasicPackage.ISO_COUNTRY_CODE_TYPE:
				return validateISOCountryCodeType((String)value, diagnostics, context);
			case BasicPackage.ISO_CURRENCY_CODE_TYPE:
				return validateISOCurrencyCodeType((String)value, diagnostics, context);
			case BasicPackage.ISO_LANGUAGE_CODE_TYPE:
				return validateISOLanguageCodeType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternationalTextType(InternationalTextType internationalTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internationalTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageStringType(LanguageStringType languageStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateASN1IdentifierType(String asn1IdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayIntervalType(XMLGregorianCalendar dayIntervalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDayIntervalType_MemberTypes(dayIntervalType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Day Interval Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayIntervalType_MemberTypes(XMLGregorianCalendar dayIntervalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(dayIntervalType)) {
				if (xmlTypeValidator.validateGYear(dayIntervalType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dayIntervalType)) {
				if (xmlTypeValidator.validateGYearMonth(dayIntervalType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dayIntervalType)) {
				if (xmlTypeValidator.validateDate(dayIntervalType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(dayIntervalType)) {
				if (xmlTypeValidator.validateGYear(dayIntervalType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dayIntervalType)) {
				if (xmlTypeValidator.validateGYearMonth(dayIntervalType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dayIntervalType)) {
				if (xmlTypeValidator.validateDate(dayIntervalType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISOCountryCodeType(String isoCountryCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateISOCountryCodeType_Pattern(isoCountryCodeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateISOCountryCodeType_Pattern
	 */
	public static final  PatternMatcher [][] ISO_COUNTRY_CODE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Z]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ISO Country Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISOCountryCodeType_Pattern(String isoCountryCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasicPackage.Literals.ISO_COUNTRY_CODE_TYPE, isoCountryCodeType, ISO_COUNTRY_CODE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISOCurrencyCodeType(String isoCurrencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateISOCurrencyCodeType_MinLength(isoCurrencyCodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateISOCurrencyCodeType_MaxLength(isoCurrencyCodeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>ISO Currency Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISOCurrencyCodeType_MinLength(String isoCurrencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = isoCurrencyCodeType.length();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(BasicPackage.Literals.ISO_CURRENCY_CODE_TYPE, isoCurrencyCodeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>ISO Currency Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISOCurrencyCodeType_MaxLength(String isoCurrencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = isoCurrencyCodeType.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(BasicPackage.Literals.ISO_CURRENCY_CODE_TYPE, isoCurrencyCodeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISOLanguageCodeType(String isoLanguageCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateISOLanguageCodeType_Pattern(isoLanguageCodeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateISOLanguageCodeType_Pattern
	 */
	public static final  PatternMatcher [][] ISO_LANGUAGE_CODE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-z]{2}"),
				XMLTypeUtil.createPatternMatcher("[a-z]{3}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ISO Language Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISOLanguageCodeType_Pattern(String isoLanguageCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BasicPackage.Literals.ISO_LANGUAGE_CODE_TYPE, isoLanguageCodeType, ISO_LANGUAGE_CODE_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //BasicValidator
