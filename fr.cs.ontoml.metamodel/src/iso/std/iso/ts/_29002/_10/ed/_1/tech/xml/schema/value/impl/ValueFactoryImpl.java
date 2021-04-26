/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueFactoryImpl extends EFactoryImpl implements ValueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValueFactory init() {
		try {
			ValueFactory theValueFactory = (ValueFactory)EPackage.Registry.INSTANCE.getEFactory(ValuePackage.eNS_URI);
			if (theValueFactory != null) {
				return theValueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ValuePackage.BAG_VALUE_TYPE: return createBagValueType();
			case ValuePackage.BOOLEAN_VALUE_TYPE: return createBooleanValueType();
			case ValuePackage.COMBINATION_TYPE: return createCombinationType();
			case ValuePackage.COMPLEX_VALUE_TYPE: return createComplexValueType();
			case ValuePackage.COMPOSITE_VALUE_TYPE: return createCompositeValueType();
			case ValuePackage.CONDITION_ELEMENT_TYPE: return createConditionElementType();
			case ValuePackage.CONTROLLED_VALUE_TYPE: return createControlledValueType();
			case ValuePackage.CURRENCY_VALUE_TYPE: return createCurrencyValueType();
			case ValuePackage.DATE_TIME_VALUE_TYPE: return createDateTimeValueType();
			case ValuePackage.DATE_VALUE_TYPE: return createDateValueType();
			case ValuePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ValuePackage.ENVIRONMENT_TYPE: return createEnvironmentType();
			case ValuePackage.FIELD_TYPE: return createFieldType();
			case ValuePackage.FILE_VALUE_TYPE: return createFileValueType();
			case ValuePackage.INTEGER_VALUE_TYPE: return createIntegerValueType();
			case ValuePackage.ITEM_REFERENCE_VALUE_TYPE: return createItemReferenceValueType();
			case ValuePackage.LOCALIZED_TEXT_VALUE_TYPE: return createLocalizedTextValueType();
			case ValuePackage.MEASURE_QUALIFIED_NUMBER_VALUE_TYPE: return createMeasureQualifiedNumberValueType();
			case ValuePackage.MEASURE_RANGE_VALUE_TYPE: return createMeasureRangeValueType();
			case ValuePackage.MEASURE_SINGLE_NUMBER_VALUE_TYPE: return createMeasureSingleNumberValueType();
			case ValuePackage.NULL_VALUE_TYPE: return createNullValueType();
			case ValuePackage.NUMERIC_VALUE_TYPE: return createNumericValueType();
			case ValuePackage.ONE_OF_TYPE: return createOneOfType();
			case ValuePackage.PRESENTATION_VALUE_TYPE: return createPresentationValueType();
			case ValuePackage.QUALIFIED_VALUE_TYPE: return createQualifiedValueType();
			case ValuePackage.RATIONAL_VALUE_TYPE: return createRationalValueType();
			case ValuePackage.REAL_VALUE_TYPE: return createRealValueType();
			case ValuePackage.SEQUENCE_VALUE_TYPE: return createSequenceValueType();
			case ValuePackage.SET_VALUE_TYPE: return createSetValueType();
			case ValuePackage.STRING_VALUE_TYPE: return createStringValueType();
			case ValuePackage.TIME_VALUE_TYPE: return createTimeValueType();
			case ValuePackage.YEAR_MONTH_VALUE_TYPE: return createYearMonthValueType();
			case ValuePackage.YEAR_VALUE_TYPE: return createYearValueType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagValueType createBagValueType() {
		BagValueTypeImpl bagValueType = new BagValueTypeImpl();
		return bagValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueType createBooleanValueType() {
		BooleanValueTypeImpl booleanValueType = new BooleanValueTypeImpl();
		return booleanValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationType createCombinationType() {
		CombinationTypeImpl combinationType = new CombinationTypeImpl();
		return combinationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexValueType createComplexValueType() {
		ComplexValueTypeImpl complexValueType = new ComplexValueTypeImpl();
		return complexValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeValueType createCompositeValueType() {
		CompositeValueTypeImpl compositeValueType = new CompositeValueTypeImpl();
		return compositeValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionElementType createConditionElementType() {
		ConditionElementTypeImpl conditionElementType = new ConditionElementTypeImpl();
		return conditionElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledValueType createControlledValueType() {
		ControlledValueTypeImpl controlledValueType = new ControlledValueTypeImpl();
		return controlledValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyValueType createCurrencyValueType() {
		CurrencyValueTypeImpl currencyValueType = new CurrencyValueTypeImpl();
		return currencyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeValueType createDateTimeValueType() {
		DateTimeValueTypeImpl dateTimeValueType = new DateTimeValueTypeImpl();
		return dateTimeValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateValueType createDateValueType() {
		DateValueTypeImpl dateValueType = new DateValueTypeImpl();
		return dateValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentType createEnvironmentType() {
		EnvironmentTypeImpl environmentType = new EnvironmentTypeImpl();
		return environmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType createFieldType() {
		FieldTypeImpl fieldType = new FieldTypeImpl();
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileValueType createFileValueType() {
		FileValueTypeImpl fileValueType = new FileValueTypeImpl();
		return fileValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueType createIntegerValueType() {
		IntegerValueTypeImpl integerValueType = new IntegerValueTypeImpl();
		return integerValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemReferenceValueType createItemReferenceValueType() {
		ItemReferenceValueTypeImpl itemReferenceValueType = new ItemReferenceValueTypeImpl();
		return itemReferenceValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedTextValueType createLocalizedTextValueType() {
		LocalizedTextValueTypeImpl localizedTextValueType = new LocalizedTextValueTypeImpl();
		return localizedTextValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureQualifiedNumberValueType createMeasureQualifiedNumberValueType() {
		MeasureQualifiedNumberValueTypeImpl measureQualifiedNumberValueType = new MeasureQualifiedNumberValueTypeImpl();
		return measureQualifiedNumberValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureRangeValueType createMeasureRangeValueType() {
		MeasureRangeValueTypeImpl measureRangeValueType = new MeasureRangeValueTypeImpl();
		return measureRangeValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSingleNumberValueType createMeasureSingleNumberValueType() {
		MeasureSingleNumberValueTypeImpl measureSingleNumberValueType = new MeasureSingleNumberValueTypeImpl();
		return measureSingleNumberValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValueType createNullValueType() {
		NullValueTypeImpl nullValueType = new NullValueTypeImpl();
		return nullValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValueType createNumericValueType() {
		NumericValueTypeImpl numericValueType = new NumericValueTypeImpl();
		return numericValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneOfType createOneOfType() {
		OneOfTypeImpl oneOfType = new OneOfTypeImpl();
		return oneOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationValueType createPresentationValueType() {
		PresentationValueTypeImpl presentationValueType = new PresentationValueTypeImpl();
		return presentationValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedValueType createQualifiedValueType() {
		QualifiedValueTypeImpl qualifiedValueType = new QualifiedValueTypeImpl();
		return qualifiedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalValueType createRationalValueType() {
		RationalValueTypeImpl rationalValueType = new RationalValueTypeImpl();
		return rationalValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValueType createRealValueType() {
		RealValueTypeImpl realValueType = new RealValueTypeImpl();
		return realValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceValueType createSequenceValueType() {
		SequenceValueTypeImpl sequenceValueType = new SequenceValueTypeImpl();
		return sequenceValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetValueType createSetValueType() {
		SetValueTypeImpl setValueType = new SetValueTypeImpl();
		return setValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueType createStringValueType() {
		StringValueTypeImpl stringValueType = new StringValueTypeImpl();
		return stringValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType createTimeValueType() {
		TimeValueTypeImpl timeValueType = new TimeValueTypeImpl();
		return timeValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearMonthValueType createYearMonthValueType() {
		YearMonthValueTypeImpl yearMonthValueType = new YearMonthValueTypeImpl();
		return yearMonthValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearValueType createYearValueType() {
		YearValueTypeImpl yearValueType = new YearValueTypeImpl();
		return yearValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePackage getValuePackage() {
		return (ValuePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValuePackage getPackage() {
		return ValuePackage.eINSTANCE;
	}

} //ValueFactoryImpl
