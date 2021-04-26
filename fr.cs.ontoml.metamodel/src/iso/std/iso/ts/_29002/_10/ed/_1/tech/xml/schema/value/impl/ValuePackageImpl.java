/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.OntomlPackageImpl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.EnvironmentType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NullValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValueFactory;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType;

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
public class ValuePackageImpl extends EPackageImpl implements ValuePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlledValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateValueTypeEClass = null;

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
	private EClass environmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemReferenceValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizedTextValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureQualifiedNumberValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureRangeValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureSingleNumberValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneOfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationalValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearMonthValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearValueTypeEClass = null;

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
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValuePackageImpl() {
		super(eNS_URI, ValueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValuePackage init() {
		if (isInited) return (ValuePackage)EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI);

		// Obtain or create and register package
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValuePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OntomlPackageImpl theOntomlPackage = (OntomlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI) instanceof OntomlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI) : OntomlPackage.eINSTANCE);
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) instanceof IdentifierPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) : IdentifierPackage.eINSTANCE);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);
		CataloguePackageImpl theCataloguePackage = (CataloguePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) instanceof CataloguePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) : CataloguePackage.eINSTANCE);

		// Load packages
		theOntomlPackage.loadPackage();

		// Create package meta-data objects
		theValuePackage.createPackageContents();
		theIdentifierPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theCataloguePackage.createPackageContents();

		// Initialize created meta-data
		theValuePackage.initializePackageContents();
		theIdentifierPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theCataloguePackage.initializePackageContents();

		// Fix loaded packages
		theOntomlPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theValuePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValuePackage.eNS_URI, theValuePackage);
		return theValuePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagValueType() {
		return bagValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBagValueType_ValueGroup() {
		return (EAttribute)bagValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_StringValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_BagValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_BooleanValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_ComplexValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_CompositeValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_ControlledValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_CurrencyValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_DateValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_DateTimeValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_FileValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_IntegerValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_ItemReferenceValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_LocalizedTextValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_MeasureQualifiedNumberValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_MeasureRangeValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_MeasureSingleNumberValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_NullValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_RationalValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_RealValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_SequenceValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_SetValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_TimeValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_YearMonthValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValueType_YearValue() {
		return (EReference)bagValueTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueType() {
		return booleanValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValueType_Value() {
		return (EAttribute)booleanValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinationType() {
		return combinationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinationType_ValueGroup() {
		return (EAttribute)combinationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_StringValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_BagValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_BooleanValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_ComplexValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_CompositeValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_ControlledValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_CurrencyValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_DateValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_DateTimeValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_FileValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_IntegerValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_ItemReferenceValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_LocalizedTextValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_MeasureQualifiedNumberValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_MeasureRangeValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_MeasureSingleNumberValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_NullValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_RationalValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_RealValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_SequenceValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_SetValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_TimeValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_YearMonthValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationType_YearValue() {
		return (EReference)combinationTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexValueType() {
		return complexValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexValueType_RealPart() {
		return (EAttribute)complexValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexValueType_ImaginaryPart() {
		return (EAttribute)complexValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeValueType() {
		return compositeValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeValueType_Field() {
		return (EReference)compositeValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionElementType() {
		return conditionElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_StringValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_BagValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_BooleanValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_ComplexValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_CompositeValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_ControlledValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_CurrencyValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_DateValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_DateTimeValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_FileValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_IntegerValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_ItemReferenceValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_LocalizedTextValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_MeasureQualifiedNumberValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_MeasureRangeValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_MeasureSingleNumberValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_NullValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_RationalValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_RealValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_SequenceValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_SetValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_TimeValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_YearMonthValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElementType_YearValue() {
		return (EReference)conditionElementTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionElementType_PropertyRef() {
		return (EAttribute)conditionElementTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlledValueType() {
		return controlledValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlledValueType_ValueCode() {
		return (EAttribute)controlledValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlledValueType_ValueRef() {
		return (EAttribute)controlledValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencyValueType() {
		return currencyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyValueType_RealValue() {
		return (EReference)currencyValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyValueType_ComplexValue() {
		return (EReference)currencyValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyValueType_IntegerValue() {
		return (EReference)currencyValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyValueType_RationalValue() {
		return (EReference)currencyValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyValueType_CurrencyCode() {
		return (EAttribute)currencyValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyValueType_CurrencyRef() {
		return (EAttribute)currencyValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeValueType() {
		return dateTimeValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeValueType_Value() {
		return (EAttribute)dateTimeValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateValueType() {
		return dateValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateValueType_Value() {
		return (EAttribute)dateValueTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_BagValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BooleanValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Combination() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComplexValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompositeValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ControlledValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurrencyValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateTimeValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Environment() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FileValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntegerValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItemReferenceValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocalizedTextValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureQualifiedNumberValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureRangeValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeasureSingleNumberValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NullValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OneOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RationalValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RealValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SequenceValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SetValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StringValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_YearMonthValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_YearValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentType() {
		return environmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentType_PropertyValue() {
		return (EReference)environmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldType() {
		return fieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_StringValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_BagValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_BooleanValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_ComplexValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_CompositeValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_ControlledValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_CurrencyValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_DateValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_DateTimeValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_FileValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_IntegerValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_ItemReferenceValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_LocalizedTextValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_MeasureQualifiedNumberValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_MeasureRangeValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_MeasureSingleNumberValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_NullValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_RationalValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_RealValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_SequenceValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_SetValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_TimeValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_YearMonthValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_YearValue() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_PropertyRef() {
		return (EAttribute)fieldTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileValueType() {
		return fileValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileValueType_URI() {
		return (EAttribute)fileValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueType() {
		return integerValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValueType_Value() {
		return (EAttribute)integerValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemReferenceValueType() {
		return itemReferenceValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemReferenceValueType_ItemLocalRef() {
		return (EAttribute)itemReferenceValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalizedTextValueType() {
		return localizedTextValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalizedTextValueType_Content() {
		return (EReference)localizedTextValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureQualifiedNumberValueType() {
		return measureQualifiedNumberValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureQualifiedNumberValueType_QualifiedValue() {
		return (EReference)measureQualifiedNumberValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureRangeValueType() {
		return measureRangeValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureRangeValueType_LowerValue() {
		return (EReference)measureRangeValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureRangeValueType_UpperValue() {
		return (EReference)measureRangeValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureSingleNumberValueType() {
		return measureSingleNumberValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSingleNumberValueType_PresentationValue() {
		return (EReference)measureSingleNumberValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSingleNumberValueType_RealValue() {
		return (EReference)measureSingleNumberValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSingleNumberValueType_ComplexValue() {
		return (EReference)measureSingleNumberValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSingleNumberValueType_IntegerValue() {
		return (EReference)measureSingleNumberValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSingleNumberValueType_RationalValue() {
		return (EReference)measureSingleNumberValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureValueType() {
		return measureValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureValueType_PresentationUOMCode() {
		return (EAttribute)measureValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureValueType_PresentationUOMRef() {
		return (EAttribute)measureValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureValueType_UOMCode() {
		return (EAttribute)measureValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureValueType_UOMRef() {
		return (EAttribute)measureValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullValueType() {
		return nullValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericValueType() {
		return numericValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValueType_PresentationValue() {
		return (EReference)numericValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValueType_RealValue() {
		return (EReference)numericValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValueType_ComplexValue() {
		return (EReference)numericValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValueType_IntegerValue() {
		return (EReference)numericValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValueType_RationalValue() {
		return (EReference)numericValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneOfType() {
		return oneOfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneOfType_Group() {
		return (EAttribute)oneOfTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_Combination() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_StringValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_BagValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_BooleanValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_ComplexValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_CompositeValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_ControlledValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_CurrencyValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_DateValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_DateTimeValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_FileValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_IntegerValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_ItemReferenceValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_LocalizedTextValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_MeasureQualifiedNumberValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_MeasureRangeValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_MeasureSingleNumberValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_NullValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_RationalValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_RealValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_SequenceValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_SetValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_TimeValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_YearMonthValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfType_YearValue() {
		return (EReference)oneOfTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentationValueType() {
		return presentationValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationValueType_RealValue() {
		return (EReference)presentationValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationValueType_ComplexValue() {
		return (EReference)presentationValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationValueType_IntegerValue() {
		return (EReference)presentationValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationValueType_RationalValue() {
		return (EReference)presentationValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedValueType() {
		return qualifiedValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedValueType_PresentationValue() {
		return (EReference)qualifiedValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedValueType_RealValue() {
		return (EReference)qualifiedValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedValueType_ComplexValue() {
		return (EReference)qualifiedValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedValueType_IntegerValue() {
		return (EReference)qualifiedValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedValueType_RationalValue() {
		return (EReference)qualifiedValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedValueType_QualifierCode() {
		return (EAttribute)qualifiedValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedValueType_QualifierRef() {
		return (EAttribute)qualifiedValueTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationalValueType() {
		return rationalValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalValueType_WholePart() {
		return (EAttribute)rationalValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalValueType_Numerator() {
		return (EAttribute)rationalValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalValueType_Denominator() {
		return (EAttribute)rationalValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealValueType() {
		return realValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealValueType_Value() {
		return (EAttribute)realValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceValueType() {
		return sequenceValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceValueType_ValueGroup() {
		return (EAttribute)sequenceValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_StringValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_BagValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_BooleanValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_ComplexValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_CompositeValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_ControlledValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_CurrencyValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_DateValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_DateTimeValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_FileValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_IntegerValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_ItemReferenceValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_LocalizedTextValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_MeasureQualifiedNumberValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_MeasureRangeValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_MeasureSingleNumberValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_NullValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_RationalValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_RealValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_SequenceValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_SetValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_TimeValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_YearMonthValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValueType_YearValue() {
		return (EReference)sequenceValueTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetValueType() {
		return setValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetValueType_ValueGroup() {
		return (EAttribute)setValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_StringValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_BagValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_BooleanValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_ComplexValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_CompositeValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_ControlledValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_CurrencyValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_DateValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_DateTimeValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_FileValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_IntegerValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_ItemReferenceValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_LocalizedTextValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_MeasureQualifiedNumberValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_MeasureRangeValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_MeasureSingleNumberValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_NullValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_RationalValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_RealValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_SequenceValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_SetValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_TimeValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_YearMonthValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValueType_YearValue() {
		return (EReference)setValueTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValueType() {
		return stringValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValueType_Value() {
		return (EAttribute)stringValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeValueType() {
		return timeValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeValueType_Value() {
		return (EAttribute)timeValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYearMonthValueType() {
		return yearMonthValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYearMonthValueType_Value() {
		return (EAttribute)yearMonthValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYearValueType() {
		return yearValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYearValueType_Value() {
		return (EAttribute)yearValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueFactory getValueFactory() {
		return (ValueFactory)getEFactoryInstance();
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
		bagValueTypeEClass = createEClass(BAG_VALUE_TYPE);
		createEAttribute(bagValueTypeEClass, BAG_VALUE_TYPE__VALUE_GROUP);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__STRING_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__BAG_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__BOOLEAN_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__COMPLEX_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__COMPOSITE_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__CONTROLLED_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__CURRENCY_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__DATE_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__DATE_TIME_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__FILE_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__INTEGER_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__ITEM_REFERENCE_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__LOCALIZED_TEXT_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__MEASURE_RANGE_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__NULL_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__RATIONAL_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__REAL_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__SEQUENCE_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__SET_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__TIME_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__YEAR_MONTH_VALUE);
		createEReference(bagValueTypeEClass, BAG_VALUE_TYPE__YEAR_VALUE);

		booleanValueTypeEClass = createEClass(BOOLEAN_VALUE_TYPE);
		createEAttribute(booleanValueTypeEClass, BOOLEAN_VALUE_TYPE__VALUE);

		combinationTypeEClass = createEClass(COMBINATION_TYPE);
		createEAttribute(combinationTypeEClass, COMBINATION_TYPE__VALUE_GROUP);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__STRING_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__BAG_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__BOOLEAN_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__COMPLEX_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__COMPOSITE_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__CONTROLLED_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__CURRENCY_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__DATE_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__DATE_TIME_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__FILE_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__INTEGER_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__ITEM_REFERENCE_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__LOCALIZED_TEXT_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__MEASURE_RANGE_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__NULL_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__RATIONAL_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__REAL_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__SEQUENCE_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__SET_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__TIME_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__YEAR_MONTH_VALUE);
		createEReference(combinationTypeEClass, COMBINATION_TYPE__YEAR_VALUE);

		complexValueTypeEClass = createEClass(COMPLEX_VALUE_TYPE);
		createEAttribute(complexValueTypeEClass, COMPLEX_VALUE_TYPE__REAL_PART);
		createEAttribute(complexValueTypeEClass, COMPLEX_VALUE_TYPE__IMAGINARY_PART);

		compositeValueTypeEClass = createEClass(COMPOSITE_VALUE_TYPE);
		createEReference(compositeValueTypeEClass, COMPOSITE_VALUE_TYPE__FIELD);

		conditionElementTypeEClass = createEClass(CONDITION_ELEMENT_TYPE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__STRING_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__BAG_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__BOOLEAN_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__COMPLEX_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__COMPOSITE_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__CONTROLLED_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__CURRENCY_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__DATE_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__DATE_TIME_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__FILE_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__INTEGER_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__ITEM_REFERENCE_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__LOCALIZED_TEXT_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__MEASURE_RANGE_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__NULL_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__RATIONAL_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__REAL_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__SEQUENCE_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__SET_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__TIME_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__YEAR_MONTH_VALUE);
		createEReference(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__YEAR_VALUE);
		createEAttribute(conditionElementTypeEClass, CONDITION_ELEMENT_TYPE__PROPERTY_REF);

		controlledValueTypeEClass = createEClass(CONTROLLED_VALUE_TYPE);
		createEAttribute(controlledValueTypeEClass, CONTROLLED_VALUE_TYPE__VALUE_CODE);
		createEAttribute(controlledValueTypeEClass, CONTROLLED_VALUE_TYPE__VALUE_REF);

		currencyValueTypeEClass = createEClass(CURRENCY_VALUE_TYPE);
		createEReference(currencyValueTypeEClass, CURRENCY_VALUE_TYPE__REAL_VALUE);
		createEReference(currencyValueTypeEClass, CURRENCY_VALUE_TYPE__COMPLEX_VALUE);
		createEReference(currencyValueTypeEClass, CURRENCY_VALUE_TYPE__INTEGER_VALUE);
		createEReference(currencyValueTypeEClass, CURRENCY_VALUE_TYPE__RATIONAL_VALUE);
		createEAttribute(currencyValueTypeEClass, CURRENCY_VALUE_TYPE__CURRENCY_CODE);
		createEAttribute(currencyValueTypeEClass, CURRENCY_VALUE_TYPE__CURRENCY_REF);

		dateTimeValueTypeEClass = createEClass(DATE_TIME_VALUE_TYPE);
		createEAttribute(dateTimeValueTypeEClass, DATE_TIME_VALUE_TYPE__VALUE);

		dateValueTypeEClass = createEClass(DATE_VALUE_TYPE);
		createEAttribute(dateValueTypeEClass, DATE_VALUE_TYPE__VALUE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BAG_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOLEAN_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMBINATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPLEX_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPOSITE_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTROLLED_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CURRENCY_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_TIME_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENVIRONMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FILE_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTEGER_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ITEM_REFERENCE_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCALIZED_TEXT_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEASURE_RANGE_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NULL_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ONE_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RATIONAL_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REAL_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SEQUENCE_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SET_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRING_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TIME_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__YEAR_MONTH_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__YEAR_VALUE);

		environmentTypeEClass = createEClass(ENVIRONMENT_TYPE);
		createEReference(environmentTypeEClass, ENVIRONMENT_TYPE__PROPERTY_VALUE);

		fieldTypeEClass = createEClass(FIELD_TYPE);
		createEReference(fieldTypeEClass, FIELD_TYPE__STRING_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__BAG_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__BOOLEAN_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__COMPLEX_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__COMPOSITE_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__CONTROLLED_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__CURRENCY_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__DATE_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__DATE_TIME_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__FILE_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__INTEGER_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__ITEM_REFERENCE_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__LOCALIZED_TEXT_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__MEASURE_RANGE_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__NULL_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__RATIONAL_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__REAL_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__SEQUENCE_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__SET_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__TIME_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__YEAR_MONTH_VALUE);
		createEReference(fieldTypeEClass, FIELD_TYPE__YEAR_VALUE);
		createEAttribute(fieldTypeEClass, FIELD_TYPE__PROPERTY_REF);

		fileValueTypeEClass = createEClass(FILE_VALUE_TYPE);
		createEAttribute(fileValueTypeEClass, FILE_VALUE_TYPE__URI);

		integerValueTypeEClass = createEClass(INTEGER_VALUE_TYPE);
		createEAttribute(integerValueTypeEClass, INTEGER_VALUE_TYPE__VALUE);

		itemReferenceValueTypeEClass = createEClass(ITEM_REFERENCE_VALUE_TYPE);
		createEAttribute(itemReferenceValueTypeEClass, ITEM_REFERENCE_VALUE_TYPE__ITEM_LOCAL_REF);

		localizedTextValueTypeEClass = createEClass(LOCALIZED_TEXT_VALUE_TYPE);
		createEReference(localizedTextValueTypeEClass, LOCALIZED_TEXT_VALUE_TYPE__CONTENT);

		measureQualifiedNumberValueTypeEClass = createEClass(MEASURE_QUALIFIED_NUMBER_VALUE_TYPE);
		createEReference(measureQualifiedNumberValueTypeEClass, MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__QUALIFIED_VALUE);

		measureRangeValueTypeEClass = createEClass(MEASURE_RANGE_VALUE_TYPE);
		createEReference(measureRangeValueTypeEClass, MEASURE_RANGE_VALUE_TYPE__LOWER_VALUE);
		createEReference(measureRangeValueTypeEClass, MEASURE_RANGE_VALUE_TYPE__UPPER_VALUE);

		measureSingleNumberValueTypeEClass = createEClass(MEASURE_SINGLE_NUMBER_VALUE_TYPE);
		createEReference(measureSingleNumberValueTypeEClass, MEASURE_SINGLE_NUMBER_VALUE_TYPE__PRESENTATION_VALUE);
		createEReference(measureSingleNumberValueTypeEClass, MEASURE_SINGLE_NUMBER_VALUE_TYPE__REAL_VALUE);
		createEReference(measureSingleNumberValueTypeEClass, MEASURE_SINGLE_NUMBER_VALUE_TYPE__COMPLEX_VALUE);
		createEReference(measureSingleNumberValueTypeEClass, MEASURE_SINGLE_NUMBER_VALUE_TYPE__INTEGER_VALUE);
		createEReference(measureSingleNumberValueTypeEClass, MEASURE_SINGLE_NUMBER_VALUE_TYPE__RATIONAL_VALUE);

		measureValueTypeEClass = createEClass(MEASURE_VALUE_TYPE);
		createEAttribute(measureValueTypeEClass, MEASURE_VALUE_TYPE__PRESENTATION_UOM_CODE);
		createEAttribute(measureValueTypeEClass, MEASURE_VALUE_TYPE__PRESENTATION_UOM_REF);
		createEAttribute(measureValueTypeEClass, MEASURE_VALUE_TYPE__UOM_CODE);
		createEAttribute(measureValueTypeEClass, MEASURE_VALUE_TYPE__UOM_REF);

		nullValueTypeEClass = createEClass(NULL_VALUE_TYPE);

		numericValueTypeEClass = createEClass(NUMERIC_VALUE_TYPE);
		createEReference(numericValueTypeEClass, NUMERIC_VALUE_TYPE__PRESENTATION_VALUE);
		createEReference(numericValueTypeEClass, NUMERIC_VALUE_TYPE__REAL_VALUE);
		createEReference(numericValueTypeEClass, NUMERIC_VALUE_TYPE__COMPLEX_VALUE);
		createEReference(numericValueTypeEClass, NUMERIC_VALUE_TYPE__INTEGER_VALUE);
		createEReference(numericValueTypeEClass, NUMERIC_VALUE_TYPE__RATIONAL_VALUE);

		oneOfTypeEClass = createEClass(ONE_OF_TYPE);
		createEAttribute(oneOfTypeEClass, ONE_OF_TYPE__GROUP);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__COMBINATION);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__STRING_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__BAG_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__BOOLEAN_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__COMPLEX_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__COMPOSITE_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__CONTROLLED_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__CURRENCY_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__DATE_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__DATE_TIME_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__FILE_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__INTEGER_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__ITEM_REFERENCE_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__LOCALIZED_TEXT_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__MEASURE_RANGE_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__NULL_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__RATIONAL_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__REAL_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__SEQUENCE_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__SET_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__TIME_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__YEAR_MONTH_VALUE);
		createEReference(oneOfTypeEClass, ONE_OF_TYPE__YEAR_VALUE);

		presentationValueTypeEClass = createEClass(PRESENTATION_VALUE_TYPE);
		createEReference(presentationValueTypeEClass, PRESENTATION_VALUE_TYPE__REAL_VALUE);
		createEReference(presentationValueTypeEClass, PRESENTATION_VALUE_TYPE__COMPLEX_VALUE);
		createEReference(presentationValueTypeEClass, PRESENTATION_VALUE_TYPE__INTEGER_VALUE);
		createEReference(presentationValueTypeEClass, PRESENTATION_VALUE_TYPE__RATIONAL_VALUE);

		qualifiedValueTypeEClass = createEClass(QUALIFIED_VALUE_TYPE);
		createEReference(qualifiedValueTypeEClass, QUALIFIED_VALUE_TYPE__PRESENTATION_VALUE);
		createEReference(qualifiedValueTypeEClass, QUALIFIED_VALUE_TYPE__REAL_VALUE);
		createEReference(qualifiedValueTypeEClass, QUALIFIED_VALUE_TYPE__COMPLEX_VALUE);
		createEReference(qualifiedValueTypeEClass, QUALIFIED_VALUE_TYPE__INTEGER_VALUE);
		createEReference(qualifiedValueTypeEClass, QUALIFIED_VALUE_TYPE__RATIONAL_VALUE);
		createEAttribute(qualifiedValueTypeEClass, QUALIFIED_VALUE_TYPE__QUALIFIER_CODE);
		createEAttribute(qualifiedValueTypeEClass, QUALIFIED_VALUE_TYPE__QUALIFIER_REF);

		rationalValueTypeEClass = createEClass(RATIONAL_VALUE_TYPE);
		createEAttribute(rationalValueTypeEClass, RATIONAL_VALUE_TYPE__WHOLE_PART);
		createEAttribute(rationalValueTypeEClass, RATIONAL_VALUE_TYPE__NUMERATOR);
		createEAttribute(rationalValueTypeEClass, RATIONAL_VALUE_TYPE__DENOMINATOR);

		realValueTypeEClass = createEClass(REAL_VALUE_TYPE);
		createEAttribute(realValueTypeEClass, REAL_VALUE_TYPE__VALUE);

		sequenceValueTypeEClass = createEClass(SEQUENCE_VALUE_TYPE);
		createEAttribute(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__VALUE_GROUP);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__STRING_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__BAG_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__BOOLEAN_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__COMPLEX_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__COMPOSITE_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__CONTROLLED_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__CURRENCY_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__DATE_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__DATE_TIME_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__FILE_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__INTEGER_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__ITEM_REFERENCE_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__LOCALIZED_TEXT_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__MEASURE_RANGE_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__NULL_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__RATIONAL_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__REAL_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__SEQUENCE_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__SET_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__TIME_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__YEAR_MONTH_VALUE);
		createEReference(sequenceValueTypeEClass, SEQUENCE_VALUE_TYPE__YEAR_VALUE);

		setValueTypeEClass = createEClass(SET_VALUE_TYPE);
		createEAttribute(setValueTypeEClass, SET_VALUE_TYPE__VALUE_GROUP);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__STRING_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__BAG_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__BOOLEAN_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__COMPLEX_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__COMPOSITE_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__CONTROLLED_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__CURRENCY_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__DATE_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__DATE_TIME_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__FILE_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__INTEGER_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__ITEM_REFERENCE_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__LOCALIZED_TEXT_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__MEASURE_RANGE_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__NULL_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__RATIONAL_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__REAL_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__SEQUENCE_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__SET_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__TIME_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__YEAR_MONTH_VALUE);
		createEReference(setValueTypeEClass, SET_VALUE_TYPE__YEAR_VALUE);

		stringValueTypeEClass = createEClass(STRING_VALUE_TYPE);
		createEAttribute(stringValueTypeEClass, STRING_VALUE_TYPE__VALUE);

		timeValueTypeEClass = createEClass(TIME_VALUE_TYPE);
		createEAttribute(timeValueTypeEClass, TIME_VALUE_TYPE__VALUE);

		yearMonthValueTypeEClass = createEClass(YEAR_MONTH_VALUE_TYPE);
		createEAttribute(yearMonthValueTypeEClass, YEAR_MONTH_VALUE_TYPE__VALUE);

		yearValueTypeEClass = createEClass(YEAR_VALUE_TYPE);
		createEAttribute(yearValueTypeEClass, YEAR_VALUE_TYPE__VALUE);
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
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		measureQualifiedNumberValueTypeEClass.getESuperTypes().add(this.getMeasureValueType());
		measureRangeValueTypeEClass.getESuperTypes().add(this.getMeasureValueType());
		measureSingleNumberValueTypeEClass.getESuperTypes().add(this.getMeasureValueType());

		// Initialize classes, features, and operations; add parameters
		initEClass(bagValueTypeEClass, BagValueType.class, "BagValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBagValueType_ValueGroup(), ecorePackage.getEFeatureMapEntry(), "valueGroup", null, 0, -1, BagValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_StringValue(), this.getStringValueType(), null, "stringValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_BagValue(), this.getBagValueType(), null, "bagValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_BooleanValue(), this.getBooleanValueType(), null, "booleanValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_CompositeValue(), this.getCompositeValueType(), null, "compositeValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_ControlledValue(), this.getControlledValueType(), null, "controlledValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_CurrencyValue(), this.getCurrencyValueType(), null, "currencyValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_DateValue(), this.getDateValueType(), null, "dateValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_DateTimeValue(), this.getDateTimeValueType(), null, "dateTimeValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_FileValue(), this.getFileValueType(), null, "fileValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_ItemReferenceValue(), this.getItemReferenceValueType(), null, "itemReferenceValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_LocalizedTextValue(), this.getLocalizedTextValueType(), null, "localizedTextValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValueType(), null, "measureQualifiedNumberValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_MeasureRangeValue(), this.getMeasureRangeValueType(), null, "measureRangeValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_MeasureSingleNumberValue(), this.getMeasureSingleNumberValueType(), null, "measureSingleNumberValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_NullValue(), this.getNullValueType(), null, "nullValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_SequenceValue(), this.getSequenceValueType(), null, "sequenceValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_SetValue(), this.getSetValueType(), null, "setValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_TimeValue(), this.getTimeValueType(), null, "timeValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_YearMonthValue(), this.getYearMonthValueType(), null, "yearMonthValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBagValueType_YearValue(), this.getYearValueType(), null, "yearValue", null, 0, -1, BagValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueTypeEClass, BooleanValueType.class, "BooleanValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValueType_Value(), theXMLTypePackage.getBoolean(), "value", null, 0, 1, BooleanValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinationTypeEClass, CombinationType.class, "CombinationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCombinationType_ValueGroup(), ecorePackage.getEFeatureMapEntry(), "valueGroup", null, 0, -1, CombinationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_StringValue(), this.getStringValueType(), null, "stringValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_BagValue(), this.getBagValueType(), null, "bagValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_BooleanValue(), this.getBooleanValueType(), null, "booleanValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_CompositeValue(), this.getCompositeValueType(), null, "compositeValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_ControlledValue(), this.getControlledValueType(), null, "controlledValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_CurrencyValue(), this.getCurrencyValueType(), null, "currencyValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_DateValue(), this.getDateValueType(), null, "dateValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_DateTimeValue(), this.getDateTimeValueType(), null, "dateTimeValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_FileValue(), this.getFileValueType(), null, "fileValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_ItemReferenceValue(), this.getItemReferenceValueType(), null, "itemReferenceValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_LocalizedTextValue(), this.getLocalizedTextValueType(), null, "localizedTextValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValueType(), null, "measureQualifiedNumberValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_MeasureRangeValue(), this.getMeasureRangeValueType(), null, "measureRangeValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_MeasureSingleNumberValue(), this.getMeasureSingleNumberValueType(), null, "measureSingleNumberValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_NullValue(), this.getNullValueType(), null, "nullValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_SequenceValue(), this.getSequenceValueType(), null, "sequenceValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_SetValue(), this.getSetValueType(), null, "setValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_TimeValue(), this.getTimeValueType(), null, "timeValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_YearMonthValue(), this.getYearMonthValueType(), null, "yearMonthValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCombinationType_YearValue(), this.getYearValueType(), null, "yearValue", null, 0, -1, CombinationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(complexValueTypeEClass, ComplexValueType.class, "ComplexValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexValueType_RealPart(), theXMLTypePackage.getDouble(), "realPart", null, 1, 1, ComplexValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexValueType_ImaginaryPart(), theXMLTypePackage.getDouble(), "imaginaryPart", null, 1, 1, ComplexValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeValueTypeEClass, CompositeValueType.class, "CompositeValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeValueType_Field(), this.getFieldType(), null, "field", null, 0, -1, CompositeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionElementTypeEClass, ConditionElementType.class, "ConditionElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionElementType_StringValue(), this.getStringValueType(), null, "stringValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_BagValue(), this.getBagValueType(), null, "bagValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_BooleanValue(), this.getBooleanValueType(), null, "booleanValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_CompositeValue(), this.getCompositeValueType(), null, "compositeValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_ControlledValue(), this.getControlledValueType(), null, "controlledValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_CurrencyValue(), this.getCurrencyValueType(), null, "currencyValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_DateValue(), this.getDateValueType(), null, "dateValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_DateTimeValue(), this.getDateTimeValueType(), null, "dateTimeValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_FileValue(), this.getFileValueType(), null, "fileValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_ItemReferenceValue(), this.getItemReferenceValueType(), null, "itemReferenceValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_LocalizedTextValue(), this.getLocalizedTextValueType(), null, "localizedTextValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValueType(), null, "measureQualifiedNumberValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_MeasureRangeValue(), this.getMeasureRangeValueType(), null, "measureRangeValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_MeasureSingleNumberValue(), this.getMeasureSingleNumberValueType(), null, "measureSingleNumberValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_NullValue(), this.getNullValueType(), null, "nullValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_SequenceValue(), this.getSequenceValueType(), null, "sequenceValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_SetValue(), this.getSetValueType(), null, "setValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_TimeValue(), this.getTimeValueType(), null, "timeValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_YearMonthValue(), this.getYearMonthValueType(), null, "yearMonthValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElementType_YearValue(), this.getYearValueType(), null, "yearValue", null, 0, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionElementType_PropertyRef(), theIdentifierPackage.getIRDIType(), "propertyRef", null, 1, 1, ConditionElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlledValueTypeEClass, ControlledValueType.class, "ControlledValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlledValueType_ValueCode(), theXMLTypePackage.getString(), "valueCode", null, 0, 1, ControlledValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlledValueType_ValueRef(), theIdentifierPackage.getIRDIType(), "valueRef", null, 0, 1, ControlledValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyValueTypeEClass, CurrencyValueType.class, "CurrencyValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrencyValueType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, 1, CurrencyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyValueType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, 1, CurrencyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyValueType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, 1, CurrencyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyValueType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, 1, CurrencyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyValueType_CurrencyCode(), theBasicPackage.getISOCurrencyCodeType(), "currencyCode", null, 0, 1, CurrencyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyValueType_CurrencyRef(), theIdentifierPackage.getIRDIType(), "currencyRef", null, 0, 1, CurrencyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeValueTypeEClass, DateTimeValueType.class, "DateTimeValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeValueType_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1, DateTimeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateValueTypeEClass, DateValueType.class, "DateValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateValueType_Value(), theXMLTypePackage.getDate(), "value", null, 0, 1, DateValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BagValue(), this.getBagValueType(), null, "bagValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BooleanValue(), this.getBooleanValueType(), null, "booleanValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Combination(), this.getCombinationType(), null, "combination", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CompositeValue(), this.getCompositeValueType(), null, "compositeValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ControlledValue(), this.getControlledValueType(), null, "controlledValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CurrencyValue(), this.getCurrencyValueType(), null, "currencyValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateTimeValue(), this.getDateTimeValueType(), null, "dateTimeValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateValue(), this.getDateValueType(), null, "dateValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Environment(), this.getEnvironmentType(), null, "environment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FileValue(), this.getFileValueType(), null, "fileValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ItemReferenceValue(), this.getItemReferenceValueType(), null, "itemReferenceValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocalizedTextValue(), this.getLocalizedTextValueType(), null, "localizedTextValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValueType(), null, "measureQualifiedNumberValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MeasureRangeValue(), this.getMeasureRangeValueType(), null, "measureRangeValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MeasureSingleNumberValue(), this.getMeasureSingleNumberValueType(), null, "measureSingleNumberValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NullValue(), this.getNullValueType(), null, "nullValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OneOf(), this.getOneOfType(), null, "oneOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RealValue(), this.getRealValueType(), null, "realValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SequenceValue(), this.getSequenceValueType(), null, "sequenceValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SetValue(), this.getSetValueType(), null, "setValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StringValue(), this.getStringValueType(), null, "stringValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TimeValue(), this.getTimeValueType(), null, "timeValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_YearMonthValue(), this.getYearMonthValueType(), null, "yearMonthValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_YearValue(), this.getYearValueType(), null, "yearValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(environmentTypeEClass, EnvironmentType.class, "EnvironmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentType_PropertyValue(), this.getConditionElementType(), null, "propertyValue", null, 1, -1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldTypeEClass, FieldType.class, "FieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldType_StringValue(), this.getStringValueType(), null, "stringValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_BagValue(), this.getBagValueType(), null, "bagValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_BooleanValue(), this.getBooleanValueType(), null, "booleanValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_CompositeValue(), this.getCompositeValueType(), null, "compositeValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_ControlledValue(), this.getControlledValueType(), null, "controlledValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_CurrencyValue(), this.getCurrencyValueType(), null, "currencyValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_DateValue(), this.getDateValueType(), null, "dateValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_DateTimeValue(), this.getDateTimeValueType(), null, "dateTimeValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_FileValue(), this.getFileValueType(), null, "fileValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_ItemReferenceValue(), this.getItemReferenceValueType(), null, "itemReferenceValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_LocalizedTextValue(), this.getLocalizedTextValueType(), null, "localizedTextValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValueType(), null, "measureQualifiedNumberValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_MeasureRangeValue(), this.getMeasureRangeValueType(), null, "measureRangeValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_MeasureSingleNumberValue(), this.getMeasureSingleNumberValueType(), null, "measureSingleNumberValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_NullValue(), this.getNullValueType(), null, "nullValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_SequenceValue(), this.getSequenceValueType(), null, "sequenceValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_SetValue(), this.getSetValueType(), null, "setValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_TimeValue(), this.getTimeValueType(), null, "timeValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_YearMonthValue(), this.getYearMonthValueType(), null, "yearMonthValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_YearValue(), this.getYearValueType(), null, "yearValue", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldType_PropertyRef(), theIdentifierPackage.getIRDIType(), "propertyRef", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileValueTypeEClass, FileValueType.class, "FileValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileValueType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 1, 1, FileValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueTypeEClass, IntegerValueType.class, "IntegerValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValueType_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, IntegerValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemReferenceValueTypeEClass, ItemReferenceValueType.class, "ItemReferenceValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemReferenceValueType_ItemLocalRef(), theXMLTypePackage.getIDREF(), "itemLocalRef", null, 1, 1, ItemReferenceValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localizedTextValueTypeEClass, LocalizedTextValueType.class, "LocalizedTextValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalizedTextValueType_Content(), theBasicPackage.getInternationalTextType(), null, "content", null, 1, 1, LocalizedTextValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureQualifiedNumberValueTypeEClass, MeasureQualifiedNumberValueType.class, "MeasureQualifiedNumberValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureQualifiedNumberValueType_QualifiedValue(), this.getQualifiedValueType(), null, "qualifiedValue", null, 1, -1, MeasureQualifiedNumberValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureRangeValueTypeEClass, MeasureRangeValueType.class, "MeasureRangeValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureRangeValueType_LowerValue(), this.getNumericValueType(), null, "lowerValue", null, 1, 1, MeasureRangeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureRangeValueType_UpperValue(), this.getNumericValueType(), null, "upperValue", null, 1, 1, MeasureRangeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureSingleNumberValueTypeEClass, MeasureSingleNumberValueType.class, "MeasureSingleNumberValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureSingleNumberValueType_PresentationValue(), this.getPresentationValueType(), null, "presentationValue", null, 0, 1, MeasureSingleNumberValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureSingleNumberValueType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, 1, MeasureSingleNumberValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureSingleNumberValueType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, 1, MeasureSingleNumberValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureSingleNumberValueType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, 1, MeasureSingleNumberValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureSingleNumberValueType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, 1, MeasureSingleNumberValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureValueTypeEClass, MeasureValueType.class, "MeasureValueType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasureValueType_PresentationUOMCode(), theXMLTypePackage.getString(), "presentationUOMCode", null, 0, 1, MeasureValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureValueType_PresentationUOMRef(), theIdentifierPackage.getIRDIType(), "presentationUOMRef", null, 0, 1, MeasureValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureValueType_UOMCode(), theXMLTypePackage.getString(), "uOMCode", null, 0, 1, MeasureValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureValueType_UOMRef(), theIdentifierPackage.getIRDIType(), "uOMRef", null, 0, 1, MeasureValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullValueTypeEClass, NullValueType.class, "NullValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericValueTypeEClass, NumericValueType.class, "NumericValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericValueType_PresentationValue(), this.getPresentationValueType(), null, "presentationValue", null, 0, 1, NumericValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericValueType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, 1, NumericValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericValueType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, 1, NumericValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericValueType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, 1, NumericValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericValueType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, 1, NumericValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneOfTypeEClass, OneOfType.class, "OneOfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneOfType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OneOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_Combination(), this.getCombinationType(), null, "combination", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_StringValue(), this.getStringValueType(), null, "stringValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_BagValue(), this.getBagValueType(), null, "bagValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_BooleanValue(), this.getBooleanValueType(), null, "booleanValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_CompositeValue(), this.getCompositeValueType(), null, "compositeValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_ControlledValue(), this.getControlledValueType(), null, "controlledValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_CurrencyValue(), this.getCurrencyValueType(), null, "currencyValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_DateValue(), this.getDateValueType(), null, "dateValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_DateTimeValue(), this.getDateTimeValueType(), null, "dateTimeValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_FileValue(), this.getFileValueType(), null, "fileValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_ItemReferenceValue(), this.getItemReferenceValueType(), null, "itemReferenceValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_LocalizedTextValue(), this.getLocalizedTextValueType(), null, "localizedTextValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValueType(), null, "measureQualifiedNumberValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_MeasureRangeValue(), this.getMeasureRangeValueType(), null, "measureRangeValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_MeasureSingleNumberValue(), this.getMeasureSingleNumberValueType(), null, "measureSingleNumberValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_NullValue(), this.getNullValueType(), null, "nullValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_SequenceValue(), this.getSequenceValueType(), null, "sequenceValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_SetValue(), this.getSetValueType(), null, "setValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_TimeValue(), this.getTimeValueType(), null, "timeValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_YearMonthValue(), this.getYearMonthValueType(), null, "yearMonthValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOneOfType_YearValue(), this.getYearValueType(), null, "yearValue", null, 0, -1, OneOfType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(presentationValueTypeEClass, PresentationValueType.class, "PresentationValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationValueType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, 1, PresentationValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationValueType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, 1, PresentationValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationValueType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, 1, PresentationValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationValueType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, 1, PresentationValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifiedValueTypeEClass, QualifiedValueType.class, "QualifiedValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifiedValueType_PresentationValue(), this.getPresentationValueType(), null, "presentationValue", null, 0, 1, QualifiedValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifiedValueType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, 1, QualifiedValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifiedValueType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, 1, QualifiedValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifiedValueType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, 1, QualifiedValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifiedValueType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, 1, QualifiedValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifiedValueType_QualifierCode(), theXMLTypePackage.getString(), "qualifierCode", null, 0, 1, QualifiedValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifiedValueType_QualifierRef(), theIdentifierPackage.getIRDIType(), "qualifierRef", null, 0, 1, QualifiedValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rationalValueTypeEClass, RationalValueType.class, "RationalValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRationalValueType_WholePart(), theXMLTypePackage.getInt(), "wholePart", null, 0, 1, RationalValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRationalValueType_Numerator(), theXMLTypePackage.getInt(), "numerator", null, 1, 1, RationalValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRationalValueType_Denominator(), theXMLTypePackage.getInt(), "denominator", null, 1, 1, RationalValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realValueTypeEClass, RealValueType.class, "RealValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealValueType_Value(), theXMLTypePackage.getDouble(), "value", null, 0, 1, RealValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceValueTypeEClass, SequenceValueType.class, "SequenceValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceValueType_ValueGroup(), ecorePackage.getEFeatureMapEntry(), "valueGroup", null, 0, -1, SequenceValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_StringValue(), this.getStringValueType(), null, "stringValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_BagValue(), this.getBagValueType(), null, "bagValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_BooleanValue(), this.getBooleanValueType(), null, "booleanValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_CompositeValue(), this.getCompositeValueType(), null, "compositeValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_ControlledValue(), this.getControlledValueType(), null, "controlledValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_CurrencyValue(), this.getCurrencyValueType(), null, "currencyValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_DateValue(), this.getDateValueType(), null, "dateValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_DateTimeValue(), this.getDateTimeValueType(), null, "dateTimeValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_FileValue(), this.getFileValueType(), null, "fileValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_ItemReferenceValue(), this.getItemReferenceValueType(), null, "itemReferenceValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_LocalizedTextValue(), this.getLocalizedTextValueType(), null, "localizedTextValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValueType(), null, "measureQualifiedNumberValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_MeasureRangeValue(), this.getMeasureRangeValueType(), null, "measureRangeValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_MeasureSingleNumberValue(), this.getMeasureSingleNumberValueType(), null, "measureSingleNumberValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_NullValue(), this.getNullValueType(), null, "nullValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_SequenceValue(), this.getSequenceValueType(), null, "sequenceValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_SetValue(), this.getSetValueType(), null, "setValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_TimeValue(), this.getTimeValueType(), null, "timeValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_YearMonthValue(), this.getYearMonthValueType(), null, "yearMonthValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValueType_YearValue(), this.getYearValueType(), null, "yearValue", null, 0, -1, SequenceValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(setValueTypeEClass, SetValueType.class, "SetValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetValueType_ValueGroup(), ecorePackage.getEFeatureMapEntry(), "valueGroup", null, 0, -1, SetValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_StringValue(), this.getStringValueType(), null, "stringValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_BagValue(), this.getBagValueType(), null, "bagValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_BooleanValue(), this.getBooleanValueType(), null, "booleanValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_ComplexValue(), this.getComplexValueType(), null, "complexValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_CompositeValue(), this.getCompositeValueType(), null, "compositeValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_ControlledValue(), this.getControlledValueType(), null, "controlledValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_CurrencyValue(), this.getCurrencyValueType(), null, "currencyValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_DateValue(), this.getDateValueType(), null, "dateValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_DateTimeValue(), this.getDateTimeValueType(), null, "dateTimeValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_FileValue(), this.getFileValueType(), null, "fileValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_IntegerValue(), this.getIntegerValueType(), null, "integerValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_ItemReferenceValue(), this.getItemReferenceValueType(), null, "itemReferenceValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_LocalizedTextValue(), this.getLocalizedTextValueType(), null, "localizedTextValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValueType(), null, "measureQualifiedNumberValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_MeasureRangeValue(), this.getMeasureRangeValueType(), null, "measureRangeValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_MeasureSingleNumberValue(), this.getMeasureSingleNumberValueType(), null, "measureSingleNumberValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_NullValue(), this.getNullValueType(), null, "nullValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_RationalValue(), this.getRationalValueType(), null, "rationalValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_RealValue(), this.getRealValueType(), null, "realValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_SequenceValue(), this.getSequenceValueType(), null, "sequenceValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_SetValue(), this.getSetValueType(), null, "setValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_TimeValue(), this.getTimeValueType(), null, "timeValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_YearMonthValue(), this.getYearMonthValueType(), null, "yearMonthValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSetValueType_YearValue(), this.getYearValueType(), null, "yearValue", null, 0, -1, SetValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stringValueTypeEClass, StringValueType.class, "StringValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValueType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, StringValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeValueTypeEClass, TimeValueType.class, "TimeValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeValueType_Value(), theXMLTypePackage.getTime(), "value", null, 0, 1, TimeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yearMonthValueTypeEClass, YearMonthValueType.class, "YearMonthValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYearMonthValueType_Value(), theXMLTypePackage.getGYearMonth(), "value", null, 0, 1, YearMonthValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yearValueTypeEClass, YearValueType.class, "YearValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYearValueType_Value(), theXMLTypePackage.getGYear(), "value", null, 0, 1, YearValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (bagValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bag_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBagValueType_ValueGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_BagValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bag_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_CompositeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "composite_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_ControlledValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlled_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_CurrencyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_DateTimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_time_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_FileValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_ItemReferenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item_reference_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_LocalizedTextValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localized_text_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_MeasureQualifiedNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_qualified_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_MeasureRangeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_range_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_MeasureSingleNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_single_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_NullValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_SequenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_SetValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_YearMonthValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_month_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getBagValueType_YearValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (booleanValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "boolean_value_Type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getBooleanValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (combinationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "combination_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCombinationType_ValueGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_BagValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bag_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_CompositeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "composite_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_ControlledValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlled_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_CurrencyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_DateTimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_time_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_FileValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_ItemReferenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item_reference_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_LocalizedTextValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localized_text_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_MeasureQualifiedNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_qualified_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_MeasureRangeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_range_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_MeasureSingleNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_single_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_NullValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_SequenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_SetValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_YearMonthValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_month_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getCombinationType_YearValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (complexValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "complex_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getComplexValueType_RealPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_part",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComplexValueType_ImaginaryPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imaginary_part",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (compositeValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "composite_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCompositeValueType_Field(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "field",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (conditionElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "condition_element_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConditionElementType_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_BagValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bag_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_CompositeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "composite_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_ControlledValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlled_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_CurrencyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_DateTimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_time_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_FileValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_ItemReferenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item_reference_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_LocalizedTextValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localized_text_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_MeasureQualifiedNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_qualified_number_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_MeasureRangeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_range_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_MeasureSingleNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_single_number_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_NullValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_SequenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_SetValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_YearMonthValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_month_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_YearValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConditionElementType_PropertyRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "property_ref"
		   });	
		addAnnotation
		  (controlledValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "controlled_value_Type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getControlledValueType_ValueCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value_code"
		   });	
		addAnnotation
		  (getControlledValueType_ValueRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value_ref"
		   });	
		addAnnotation
		  (currencyValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "currency_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCurrencyValueType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCurrencyValueType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCurrencyValueType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCurrencyValueType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCurrencyValueType_CurrencyCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "currency_code"
		   });	
		addAnnotation
		  (getCurrencyValueType_CurrencyRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "currency_ref"
		   });	
		addAnnotation
		  (dateTimeValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "date_time_value_Type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getDateTimeValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (dateValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "date_value_Type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getDateValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
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
		  (getDocumentRoot_BagValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bag_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Combination(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "combination",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_CompositeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "composite_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ControlledValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlled_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_CurrencyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_DateTimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_time_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Environment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "environment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_FileValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ItemReferenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item_reference_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_LocalizedTextValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localized_text_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_MeasureQualifiedNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_qualified_number_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_MeasureRangeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_range_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_MeasureSingleNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_single_number_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_NullValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_OneOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "one_of",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_SequenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_SetValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_YearMonthValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_month_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_YearValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (environmentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "environment_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEnvironmentType_PropertyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (fieldTypeEClass, 
		   source, 
		   new String[] {
			 "name", "field_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFieldType_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_BagValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bag_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_CompositeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "composite_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_ControlledValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlled_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_CurrencyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_DateTimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_time_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_FileValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_ItemReferenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item_reference_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_LocalizedTextValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localized_text_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_MeasureQualifiedNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_qualified_number_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_MeasureRangeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_range_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_MeasureSingleNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_single_number_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_NullValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_SequenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_SetValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_YearMonthValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_month_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_YearValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFieldType_PropertyRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "property_ref"
		   });	
		addAnnotation
		  (fileValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "file_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFileValueType_URI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "URI",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (integerValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "integer_value_Type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getIntegerValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (itemReferenceValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "item_reference_value_Type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getItemReferenceValueType_ItemLocalRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "item_local_ref"
		   });	
		addAnnotation
		  (localizedTextValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "localized_text_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLocalizedTextValueType_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (measureQualifiedNumberValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "measure_qualified_number_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMeasureQualifiedNumberValueType_QualifiedValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "qualified_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (measureRangeValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "measure_range_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMeasureRangeValueType_LowerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lower_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMeasureRangeValueType_UpperValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "upper_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (measureSingleNumberValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "measure_single_number_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMeasureSingleNumberValueType_PresentationValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "presentation_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMeasureSingleNumberValueType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMeasureSingleNumberValueType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMeasureSingleNumberValueType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMeasureSingleNumberValueType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (measureValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "measure_value_Type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMeasureValueType_PresentationUOMCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "presentation_UOM_code"
		   });	
		addAnnotation
		  (getMeasureValueType_PresentationUOMRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "presentation_UOM_ref"
		   });	
		addAnnotation
		  (getMeasureValueType_UOMCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "UOM_code"
		   });	
		addAnnotation
		  (getMeasureValueType_UOMRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "UOM_ref"
		   });	
		addAnnotation
		  (nullValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "null_value_Type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (numericValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "numeric_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNumericValueType_PresentationValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "presentation_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNumericValueType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNumericValueType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNumericValueType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNumericValueType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (oneOfTypeEClass, 
		   source, 
		   new String[] {
			 "name", "one_of_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOneOfType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getOneOfType_Combination(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "combination",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_BagValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bag_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_CompositeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "composite_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_ControlledValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlled_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_CurrencyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_DateTimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_time_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_FileValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_ItemReferenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item_reference_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_LocalizedTextValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localized_text_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_MeasureQualifiedNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_qualified_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_MeasureRangeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_range_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_MeasureSingleNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_single_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_NullValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_SequenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_SetValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_YearMonthValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_month_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getOneOfType_YearValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_value",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (presentationValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "presentation_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPresentationValueType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPresentationValueType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPresentationValueType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPresentationValueType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (qualifiedValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "qualified_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getQualifiedValueType_PresentationValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "presentation_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getQualifiedValueType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getQualifiedValueType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getQualifiedValueType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getQualifiedValueType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getQualifiedValueType_QualifierCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "qualifier_code"
		   });	
		addAnnotation
		  (getQualifiedValueType_QualifierRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "qualifier_ref"
		   });	
		addAnnotation
		  (rationalValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rational_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRationalValueType_WholePart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "whole_part",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRationalValueType_Numerator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "numerator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRationalValueType_Denominator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "denominator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (realValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "real_value_Type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getRealValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (sequenceValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sequence_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSequenceValueType_ValueGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_BagValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bag_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_CompositeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "composite_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_ControlledValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlled_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_CurrencyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_DateTimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_time_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_FileValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_ItemReferenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item_reference_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_LocalizedTextValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localized_text_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_MeasureQualifiedNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_qualified_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_MeasureRangeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_range_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_MeasureSingleNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_single_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_NullValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_SequenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_SetValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_YearMonthValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_month_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSequenceValueType_YearValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (setValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "set_value_Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSetValueType_ValueGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_BagValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bag_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_ComplexValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complex_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_CompositeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "composite_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_ControlledValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "controlled_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_CurrencyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_DateTimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date_time_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_FileValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_IntegerValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_ItemReferenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item_reference_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_LocalizedTextValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localized_text_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_MeasureQualifiedNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_qualified_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_MeasureRangeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_range_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_MeasureSingleNumberValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure_single_number_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_NullValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_RationalValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rational_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_RealValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "real_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_SequenceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_SetValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_YearMonthValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_month_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (getSetValueType_YearValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year_value",
			 "namespace", "##targetNamespace",
			 "group", "#ValueGroup:0"
		   });	
		addAnnotation
		  (stringValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "string_value_Type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getStringValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (timeValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "time_value_Type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getTimeValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (yearMonthValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "year_month_value_Type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getYearMonthValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (yearValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "year_value_Type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getYearValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });
	}

} //ValuePackageImpl
