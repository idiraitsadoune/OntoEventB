/**
 */
package iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicFactory
 * @model kind="package"
 * @generated
 */
public interface BasicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso:std:iso:ts:29002:-4:ed-1:tech:xml-schema:basic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicPackage eINSTANCE = iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl.init();

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.InternationalTextTypeImpl <em>International Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.InternationalTextTypeImpl
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getInternationalTextType()
	 * @generated
	 */
	int INTERNATIONAL_TEXT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Local String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_TYPE__LOCAL_STRING = 0;

	/**
	 * The number of structural features of the '<em>International Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>International Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.LanguageStringTypeImpl <em>Language String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.LanguageStringTypeImpl
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getLanguageStringType()
	 * @generated
	 */
	int LANGUAGE_STRING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_TYPE__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Language Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_TYPE__LANGUAGE_REF = 1;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_TYPE__LANGUAGE_CODE = 2;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_TYPE__COUNTRY_CODE = 3;

	/**
	 * The number of structural features of the '<em>Language String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Language String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>ASN1 Identifier Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getASN1IdentifierType()
	 * @generated
	 */
	int ASN1_IDENTIFIER_TYPE = 2;

	/**
	 * The meta object id for the '<em>Day Interval Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getDayIntervalType()
	 * @generated
	 */
	int DAY_INTERVAL_TYPE = 3;

	/**
	 * The meta object id for the '<em>ISO Country Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getISOCountryCodeType()
	 * @generated
	 */
	int ISO_COUNTRY_CODE_TYPE = 4;

	/**
	 * The meta object id for the '<em>ISO Currency Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getISOCurrencyCodeType()
	 * @generated
	 */
	int ISO_CURRENCY_CODE_TYPE = 5;

	/**
	 * The meta object id for the '<em>ISO Language Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getISOLanguageCodeType()
	 * @generated
	 */
	int ISO_LANGUAGE_CODE_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType <em>International Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International Text Type</em>'.
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType
	 * @generated
	 */
	EClass getInternationalTextType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType#getLocalString <em>Local String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local String</em>'.
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType#getLocalString()
	 * @see #getInternationalTextType()
	 * @generated
	 */
	EReference getInternationalTextType_LocalString();

	/**
	 * Returns the meta object for class '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType <em>Language String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language String Type</em>'.
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType
	 * @generated
	 */
	EClass getLanguageStringType();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getContent()
	 * @see #getLanguageStringType()
	 * @generated
	 */
	EAttribute getLanguageStringType_Content();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getLanguageRef <em>Language Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Ref</em>'.
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getLanguageRef()
	 * @see #getLanguageStringType()
	 * @generated
	 */
	EAttribute getLanguageStringType_LanguageRef();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getLanguageCode()
	 * @see #getLanguageStringType()
	 * @generated
	 */
	EAttribute getLanguageStringType_LanguageCode();

	/**
	 * Returns the meta object for the attribute '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType#getCountryCode()
	 * @see #getLanguageStringType()
	 * @generated
	 */
	EAttribute getLanguageStringType_CountryCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ASN1 Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ASN1 Identifier Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ASN1_identifier_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getASN1IdentifierType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Day Interval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Day Interval Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='day_interval_Type' memberTypes='http://www.eclipse.org/emf/2003/XMLType#gYear http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#date'"
	 * @generated
	 */
	EDataType getDayIntervalType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ISO Country Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ISO Country Code Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ISO_country_code_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Z]{2}'"
	 * @generated
	 */
	EDataType getISOCountryCodeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ISO Currency Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ISO Currency Code Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ISO_currency_code_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='3'"
	 * @generated
	 */
	EDataType getISOCurrencyCodeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ISO Language Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ISO Language Code Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ISO_language_code_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[a-z]{2} [a-z]{3}'"
	 * @generated
	 */
	EDataType getISOLanguageCodeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicFactory getBasicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.InternationalTextTypeImpl <em>International Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.InternationalTextTypeImpl
		 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getInternationalTextType()
		 * @generated
		 */
		EClass INTERNATIONAL_TEXT_TYPE = eINSTANCE.getInternationalTextType();

		/**
		 * The meta object literal for the '<em><b>Local String</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNATIONAL_TEXT_TYPE__LOCAL_STRING = eINSTANCE.getInternationalTextType_LocalString();

		/**
		 * The meta object literal for the '{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.LanguageStringTypeImpl <em>Language String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.LanguageStringTypeImpl
		 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getLanguageStringType()
		 * @generated
		 */
		EClass LANGUAGE_STRING_TYPE = eINSTANCE.getLanguageStringType();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING_TYPE__CONTENT = eINSTANCE.getLanguageStringType_Content();

		/**
		 * The meta object literal for the '<em><b>Language Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING_TYPE__LANGUAGE_REF = eINSTANCE.getLanguageStringType_LanguageRef();

		/**
		 * The meta object literal for the '<em><b>Language Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING_TYPE__LANGUAGE_CODE = eINSTANCE.getLanguageStringType_LanguageCode();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING_TYPE__COUNTRY_CODE = eINSTANCE.getLanguageStringType_CountryCode();

		/**
		 * The meta object literal for the '<em>ASN1 Identifier Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getASN1IdentifierType()
		 * @generated
		 */
		EDataType ASN1_IDENTIFIER_TYPE = eINSTANCE.getASN1IdentifierType();

		/**
		 * The meta object literal for the '<em>Day Interval Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getDayIntervalType()
		 * @generated
		 */
		EDataType DAY_INTERVAL_TYPE = eINSTANCE.getDayIntervalType();

		/**
		 * The meta object literal for the '<em>ISO Country Code Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getISOCountryCodeType()
		 * @generated
		 */
		EDataType ISO_COUNTRY_CODE_TYPE = eINSTANCE.getISOCountryCodeType();

		/**
		 * The meta object literal for the '<em>ISO Currency Code Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getISOCurrencyCodeType()
		 * @generated
		 */
		EDataType ISO_CURRENCY_CODE_TYPE = eINSTANCE.getISOCurrencyCodeType();

		/**
		 * The meta object literal for the '<em>ISO Language Code Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl#getISOLanguageCodeType()
		 * @generated
		 */
		EDataType ISO_LANGUAGE_CODE_TYPE = eINSTANCE.getISOLanguageCodeType();

	}

} //BasicPackage
