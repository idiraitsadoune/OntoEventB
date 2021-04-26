/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueFactory;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CataloguePackageImpl extends EPackageImpl implements CataloguePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogueTypeEClass = null;

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
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CataloguePackageImpl() {
		super(eNS_URI, CatalogueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CataloguePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CataloguePackage init() {
		if (isInited) return (CataloguePackage)EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI);

		// Obtain or create and register package
		CataloguePackageImpl theCataloguePackage = (CataloguePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CataloguePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CataloguePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OntomlPackageImpl theOntomlPackage = (OntomlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI) instanceof OntomlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI) : OntomlPackage.eINSTANCE);
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) instanceof IdentifierPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) : IdentifierPackage.eINSTANCE);
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) : ValuePackage.eINSTANCE);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);

		// Load packages
		theOntomlPackage.loadPackage();

		// Create package meta-data objects
		theCataloguePackage.createPackageContents();
		theIdentifierPackage.createPackageContents();
		theValuePackage.createPackageContents();
		theBasicPackage.createPackageContents();

		// Initialize created meta-data
		theCataloguePackage.initializePackageContents();
		theIdentifierPackage.initializePackageContents();
		theValuePackage.initializePackageContents();
		theBasicPackage.initializePackageContents();

		// Fix loaded packages
		theOntomlPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theCataloguePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CataloguePackage.eNS_URI, theCataloguePackage);
		return theCataloguePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogueType() {
		return catalogueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogueType_Item() {
		return (EReference)catalogueTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_Catalogue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Item() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Reference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_ClassificationRef() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_Reference() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemType_PropertyValue() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_ClassRef() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_CreatedView() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_DataSpecificationRef() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_InformationSupplierReferenceString() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_IsDependent() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_IsGlobalId() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_IsModel() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_IsProprietary() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_LocalId() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_ViewOf() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValueType() {
		return propertyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_StringValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_BagValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_BooleanValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_ComplexValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_CompositeValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_ControlledValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_CurrencyValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_DateValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_DateTimeValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_FileValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_IntegerValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_ItemReferenceValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_LocalizedTextValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_MeasureQualifiedNumberValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_MeasureRangeValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_MeasureSingleNumberValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_NullValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_RationalValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_RealValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_SequenceValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_SetValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_TimeValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_YearMonthValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_YearValue() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_OneOf() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_Combination() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueType_Environment() {
		return (EReference)propertyValueTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValueType_IsProprietary() {
		return (EAttribute)propertyValueTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValueType_PropertyRef() {
		return (EAttribute)propertyValueTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValueType_SubitemPathPropertyRef() {
		return (EAttribute)propertyValueTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType_Designation() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_OrganizationCode() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_OrganizationRef() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_ReferenceNumber() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueFactory getCatalogueFactory() {
		return (CatalogueFactory)getEFactoryInstance();
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
		catalogueTypeEClass = createEClass(CATALOGUE_TYPE);
		createEReference(catalogueTypeEClass, CATALOGUE_TYPE__ITEM);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CATALOGUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ITEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE);

		itemTypeEClass = createEClass(ITEM_TYPE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__CLASSIFICATION_REF);
		createEReference(itemTypeEClass, ITEM_TYPE__REFERENCE);
		createEReference(itemTypeEClass, ITEM_TYPE__PROPERTY_VALUE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__CLASS_REF);
		createEAttribute(itemTypeEClass, ITEM_TYPE__CREATED_VIEW);
		createEAttribute(itemTypeEClass, ITEM_TYPE__DATA_SPECIFICATION_REF);
		createEAttribute(itemTypeEClass, ITEM_TYPE__INFORMATION_SUPPLIER_REFERENCE_STRING);
		createEAttribute(itemTypeEClass, ITEM_TYPE__IS_DEPENDENT);
		createEAttribute(itemTypeEClass, ITEM_TYPE__IS_GLOBAL_ID);
		createEAttribute(itemTypeEClass, ITEM_TYPE__IS_MODEL);
		createEAttribute(itemTypeEClass, ITEM_TYPE__IS_PROPRIETARY);
		createEAttribute(itemTypeEClass, ITEM_TYPE__LOCAL_ID);
		createEAttribute(itemTypeEClass, ITEM_TYPE__VIEW_OF);

		propertyValueTypeEClass = createEClass(PROPERTY_VALUE_TYPE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__STRING_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__BAG_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__BOOLEAN_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__COMPLEX_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__COMPOSITE_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__CONTROLLED_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__CURRENCY_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__DATE_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__DATE_TIME_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__FILE_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__INTEGER_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__ITEM_REFERENCE_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__LOCALIZED_TEXT_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__MEASURE_RANGE_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__NULL_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__RATIONAL_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__REAL_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__SEQUENCE_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__SET_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__TIME_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__YEAR_MONTH_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__YEAR_VALUE);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__ONE_OF);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__COMBINATION);
		createEReference(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__ENVIRONMENT);
		createEAttribute(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__IS_PROPRIETARY);
		createEAttribute(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__PROPERTY_REF);
		createEAttribute(propertyValueTypeEClass, PROPERTY_VALUE_TYPE__SUBITEM_PATH_PROPERTY_REF);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__DESIGNATION);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__ORGANIZATION_CODE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__ORGANIZATION_REF);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__REFERENCE_NUMBER);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		ValuePackage theValuePackage = (ValuePackage)EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogueTypeEClass, CatalogueType.class, "CatalogueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogueType_Item(), this.getItemType(), null, "item", null, 0, -1, CatalogueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Catalogue(), this.getCatalogueType(), null, "catalogue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Item(), this.getItemType(), null, "item", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyValue(), this.getPropertyValueType(), null, "propertyValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Reference(), this.getReferenceType(), null, "reference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemType_ClassificationRef(), theIdentifierPackage.getIRDIType(), "classificationRef", null, 0, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Reference(), this.getReferenceType(), null, "reference", null, 0, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_PropertyValue(), this.getPropertyValueType(), null, "propertyValue", null, 0, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_ClassRef(), theIdentifierPackage.getIRDIType(), "classRef", null, 1, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_CreatedView(), theIdentifierPackage.getIRDIType(), "createdView", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_DataSpecificationRef(), theIdentifierPackage.getIRDIType(), "dataSpecificationRef", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_InformationSupplierReferenceString(), theXMLTypePackage.getString(), "informationSupplierReferenceString", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_IsDependent(), theXMLTypePackage.getBoolean(), "isDependent", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_IsGlobalId(), theXMLTypePackage.getBoolean(), "isGlobalId", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_IsModel(), theXMLTypePackage.getBoolean(), "isModel", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_IsProprietary(), theXMLTypePackage.getBoolean(), "isProprietary", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_LocalId(), theXMLTypePackage.getID(), "localId", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_ViewOf(), theXMLTypePackage.getIDREF(), "viewOf", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueTypeEClass, PropertyValueType.class, "PropertyValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyValueType_StringValue(), theValuePackage.getStringValueType(), null, "stringValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_BagValue(), theValuePackage.getBagValueType(), null, "bagValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_BooleanValue(), theValuePackage.getBooleanValueType(), null, "booleanValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_ComplexValue(), theValuePackage.getComplexValueType(), null, "complexValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_CompositeValue(), theValuePackage.getCompositeValueType(), null, "compositeValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_ControlledValue(), theValuePackage.getControlledValueType(), null, "controlledValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_CurrencyValue(), theValuePackage.getCurrencyValueType(), null, "currencyValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_DateValue(), theValuePackage.getDateValueType(), null, "dateValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_DateTimeValue(), theValuePackage.getDateTimeValueType(), null, "dateTimeValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_FileValue(), theValuePackage.getFileValueType(), null, "fileValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_IntegerValue(), theValuePackage.getIntegerValueType(), null, "integerValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_ItemReferenceValue(), theValuePackage.getItemReferenceValueType(), null, "itemReferenceValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_LocalizedTextValue(), theValuePackage.getLocalizedTextValueType(), null, "localizedTextValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_MeasureQualifiedNumberValue(), theValuePackage.getMeasureQualifiedNumberValueType(), null, "measureQualifiedNumberValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_MeasureRangeValue(), theValuePackage.getMeasureRangeValueType(), null, "measureRangeValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_MeasureSingleNumberValue(), theValuePackage.getMeasureSingleNumberValueType(), null, "measureSingleNumberValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_NullValue(), theValuePackage.getNullValueType(), null, "nullValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_RationalValue(), theValuePackage.getRationalValueType(), null, "rationalValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_RealValue(), theValuePackage.getRealValueType(), null, "realValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_SequenceValue(), theValuePackage.getSequenceValueType(), null, "sequenceValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_SetValue(), theValuePackage.getSetValueType(), null, "setValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_TimeValue(), theValuePackage.getTimeValueType(), null, "timeValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_YearMonthValue(), theValuePackage.getYearMonthValueType(), null, "yearMonthValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_YearValue(), theValuePackage.getYearValueType(), null, "yearValue", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_OneOf(), theValuePackage.getOneOfType(), null, "oneOf", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_Combination(), theValuePackage.getCombinationType(), null, "combination", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValueType_Environment(), theValuePackage.getEnvironmentType(), null, "environment", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValueType_IsProprietary(), theXMLTypePackage.getBoolean(), "isProprietary", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValueType_PropertyRef(), theIdentifierPackage.getIRDIType(), "propertyRef", null, 1, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValueType_SubitemPathPropertyRef(), theIdentifierPackage.getIRDIListType(), "subitemPathPropertyRef", null, 0, 1, PropertyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceType_Designation(), theBasicPackage.getInternationalTextType(), null, "designation", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_OrganizationCode(), theXMLTypePackage.getString(), "organizationCode", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_OrganizationRef(), theIdentifierPackage.getIRDIType(), "organizationRef", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_ReferenceNumber(), theXMLTypePackage.getString(), "referenceNumber", null, 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (catalogueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "catalogue_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCatalogueType_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace"
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
		  (getDocumentRoot_Catalogue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "catalogue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_PropertyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reference",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (itemTypeEClass, 
		   source, 
		   new String[] {
			 "name", "item_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemType_ClassificationRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "classification_ref",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getItemType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reference",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getItemType_PropertyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getItemType_ClassRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class_ref"
		   });	
		addAnnotation
		  (getItemType_CreatedView(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "created_view"
		   });	
		addAnnotation
		  (getItemType_DataSpecificationRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data_specification_ref"
		   });	
		addAnnotation
		  (getItemType_InformationSupplierReferenceString(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "information_supplier_reference_string"
		   });	
		addAnnotation
		  (getItemType_IsDependent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "is_dependent"
		   });	
		addAnnotation
		  (getItemType_IsGlobalId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "is_global_id"
		   });	
		addAnnotation
		  (getItemType_IsModel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "is_model"
		   });	
		addAnnotation
		  (getItemType_IsProprietary(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "is_proprietary"
		   });	
		addAnnotation
		  (getItemType_LocalId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "local_id"
		   });	
		addAnnotation
		  (getItemType_ViewOf(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "view_of"
		   });	
		addAnnotation
		  (propertyValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "property_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPropertyValueType_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_BagValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bag_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_CompositeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "composite_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_ControlledValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlled_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_CurrencyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_DateTimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_time_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_FileValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_ItemReferenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item_reference_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_LocalizedTextValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localized_text_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_MeasureQualifiedNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_qualified_number_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_MeasureRangeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_range_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_MeasureSingleNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_single_number_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_NullValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_SequenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_SetValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_YearMonthValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_month_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_YearValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_value",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_OneOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "one_of",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_Combination(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "combination",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_Environment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "environment",
			 "namespace", "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:value"
		   });	
		addAnnotation
		  (getPropertyValueType_IsProprietary(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "is_proprietary"
		   });	
		addAnnotation
		  (getPropertyValueType_PropertyRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "property_ref"
		   });	
		addAnnotation
		  (getPropertyValueType_SubitemPathPropertyRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subitem_path_property_ref"
		   });	
		addAnnotation
		  (referenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "reference_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getReferenceType_Designation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "designation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getReferenceType_OrganizationCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "organization_code"
		   });	
		addAnnotation
		  (getReferenceType_OrganizationRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "organization_ref"
		   });	
		addAnnotation
		  (getReferenceType_ReferenceNumber(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "reference_number"
		   });
	}

} //CataloguePackageImpl
