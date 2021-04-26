/**
 */
package iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicFactory;
import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage;
import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType;
import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.util.BasicValidator;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicPackageImpl extends EPackageImpl implements BasicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internationalTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType asn1IdentifierTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dayIntervalTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isoCountryCodeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isoCurrencyCodeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isoLanguageCodeTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicPackageImpl() {
		super(eNS_URI, BasicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BasicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicPackage init() {
		if (isInited) return (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Obtain or create and register package
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OntomlPackageImpl theOntomlPackage = (OntomlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI) instanceof OntomlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI) : OntomlPackage.eINSTANCE);
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) instanceof IdentifierPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) : IdentifierPackage.eINSTANCE);
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) : ValuePackage.eINSTANCE);
		CataloguePackageImpl theCataloguePackage = (CataloguePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) instanceof CataloguePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) : CataloguePackage.eINSTANCE);

		// Load packages
		theOntomlPackage.loadPackage();

		// Create package meta-data objects
		theBasicPackage.createPackageContents();
		theIdentifierPackage.createPackageContents();
		theValuePackage.createPackageContents();
		theCataloguePackage.createPackageContents();

		// Initialize created meta-data
		theBasicPackage.initializePackageContents();
		theIdentifierPackage.initializePackageContents();
		theValuePackage.initializePackageContents();
		theCataloguePackage.initializePackageContents();

		// Fix loaded packages
		theOntomlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBasicPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BasicValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBasicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicPackage.eNS_URI, theBasicPackage);
		return theBasicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternationalTextType() {
		return internationalTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternationalTextType_LocalString() {
		return (EReference)internationalTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageStringType() {
		return languageStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageStringType_Content() {
		return (EAttribute)languageStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageStringType_LanguageRef() {
		return (EAttribute)languageStringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageStringType_LanguageCode() {
		return (EAttribute)languageStringTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageStringType_CountryCode() {
		return (EAttribute)languageStringTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getASN1IdentifierType() {
		return asn1IdentifierTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDayIntervalType() {
		return dayIntervalTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISOCountryCodeType() {
		return isoCountryCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISOCurrencyCodeType() {
		return isoCurrencyCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISOLanguageCodeType() {
		return isoLanguageCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFactory getBasicFactory() {
		return (BasicFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		internationalTextTypeEClass = createEClass(INTERNATIONAL_TEXT_TYPE);
		createEReference(internationalTextTypeEClass, INTERNATIONAL_TEXT_TYPE__LOCAL_STRING);

		languageStringTypeEClass = createEClass(LANGUAGE_STRING_TYPE);
		createEAttribute(languageStringTypeEClass, LANGUAGE_STRING_TYPE__CONTENT);
		createEAttribute(languageStringTypeEClass, LANGUAGE_STRING_TYPE__LANGUAGE_REF);
		createEAttribute(languageStringTypeEClass, LANGUAGE_STRING_TYPE__LANGUAGE_CODE);
		createEAttribute(languageStringTypeEClass, LANGUAGE_STRING_TYPE__COUNTRY_CODE);

		// Create data types
		asn1IdentifierTypeEDataType = createEDataType(ASN1_IDENTIFIER_TYPE);
		dayIntervalTypeEDataType = createEDataType(DAY_INTERVAL_TYPE);
		isoCountryCodeTypeEDataType = createEDataType(ISO_COUNTRY_CODE_TYPE);
		isoCurrencyCodeTypeEDataType = createEDataType(ISO_CURRENCY_CODE_TYPE);
		isoLanguageCodeTypeEDataType = createEDataType(ISO_LANGUAGE_CODE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(internationalTextTypeEClass, InternationalTextType.class, "InternationalTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternationalTextType_LocalString(), this.getLanguageStringType(), null, "localString", null, 1, -1, InternationalTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageStringTypeEClass, LanguageStringType.class, "LanguageStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageStringType_Content(), theXMLTypePackage.getString(), "content", null, 1, 1, LanguageStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageStringType_LanguageRef(), theIdentifierPackage.getIRDIType(), "languageRef", null, 0, 1, LanguageStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageStringType_LanguageCode(), this.getISOLanguageCodeType(), "languageCode", null, 0, 1, LanguageStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageStringType_CountryCode(), this.getISOCountryCodeType(), "countryCode", null, 0, 1, LanguageStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(asn1IdentifierTypeEDataType, String.class, "ASN1IdentifierType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dayIntervalTypeEDataType, XMLGregorianCalendar.class, "DayIntervalType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(isoCountryCodeTypeEDataType, String.class, "ISOCountryCodeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(isoCurrencyCodeTypeEDataType, String.class, "ISOCurrencyCodeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(isoLanguageCodeTypeEDataType, String.class, "ISOLanguageCodeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (asn1IdentifierTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ASN1_identifier_Type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (dayIntervalTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "day_interval_Type",
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#gYear http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#date"
		   });	
		addAnnotation
		  (internationalTextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "international_text_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInternationalTextType_LocalString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "local_string",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (isoCountryCodeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ISO_country_code_Type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[A-Z]{2}"
		   });	
		addAnnotation
		  (isoCurrencyCodeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ISO_currency_code_Type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "length", "3"
		   });	
		addAnnotation
		  (isoLanguageCodeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ISO_language_code_Type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[a-z]{2} [a-z]{3}"
		   });	
		addAnnotation
		  (languageStringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "language_string_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLanguageStringType_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLanguageStringType_LanguageRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "language_ref",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLanguageStringType_LanguageCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "language_code",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLanguageStringType_CountryCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "country_code",
			 "namespace", "##targetNamespace"
		   });
	}

} //BasicPackageImpl
