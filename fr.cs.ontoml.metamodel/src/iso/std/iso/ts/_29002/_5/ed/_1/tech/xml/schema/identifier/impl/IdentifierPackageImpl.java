/**
 */
package iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.DocumentRoot;
import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDISequenceType;
import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierFactory;
import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.util.IdentifierValidator;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifierPackageImpl extends EPackageImpl implements IdentifierPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irdiSequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType irdiListTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType irdiTypeEDataType = null;

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
	 * @see iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdentifierPackageImpl() {
		super(eNS_URI, IdentifierFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdentifierPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdentifierPackage init() {
		if (isInited) return (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Obtain or create and register package
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IdentifierPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IdentifierPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OntomlPackageImpl theOntomlPackage = (OntomlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI) instanceof OntomlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI) : OntomlPackage.eINSTANCE);
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) : ValuePackage.eINSTANCE);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);
		CataloguePackageImpl theCataloguePackage = (CataloguePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) instanceof CataloguePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) : CataloguePackage.eINSTANCE);

		// Load packages
		theOntomlPackage.loadPackage();

		// Create package meta-data objects
		theIdentifierPackage.createPackageContents();
		theValuePackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theCataloguePackage.createPackageContents();

		// Initialize created meta-data
		theIdentifierPackage.initializePackageContents();
		theValuePackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theCataloguePackage.initializePackageContents();

		// Fix loaded packages
		theOntomlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theIdentifierPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return IdentifierValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theIdentifierPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdentifierPackage.eNS_URI, theIdentifierPackage);
		return theIdentifierPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRDISequenceType() {
		return irdiSequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRDISequenceType_IRDI() {
		return (EAttribute)irdiSequenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IRDI() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IRDIList() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIRDIListType() {
		return irdiListTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIRDIType() {
		return irdiTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierFactory getIdentifierFactory() {
		return (IdentifierFactory)getEFactoryInstance();
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
		irdiSequenceTypeEClass = createEClass(IRDI_SEQUENCE_TYPE);
		createEAttribute(irdiSequenceTypeEClass, IRDI_SEQUENCE_TYPE__IRDI);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IRDI);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IRDI_LIST);

		// Create data types
		irdiListTypeEDataType = createEDataType(IRDI_LIST_TYPE);
		irdiTypeEDataType = createEDataType(IRDI_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(irdiSequenceTypeEClass, IRDISequenceType.class, "IRDISequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRDISequenceType_IRDI(), this.getIRDIType(), "iRDI", null, 0, -1, IRDISequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IRDI(), this.getIRDIType(), "iRDI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IRDIList(), this.getIRDIListType(), "iRDIList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(irdiListTypeEDataType, List.class, "IRDIListType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(irdiTypeEDataType, String.class, "IRDIType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (irdiListTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "IRDI_list_type",
			 "itemType", "IRDI_type"
		   });	
		addAnnotation
		  (irdiSequenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IRDI_sequence_type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIRDISequenceType_IRDI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IRDI",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (irdiTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "IRDI_type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})? [0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})? [0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_IRDI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IRDI",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_IRDIList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IRDI_list",
			 "namespace", "##targetNamespace"
		   });
	}

} //IdentifierPackageImpl
