/**
 */
package pivotmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pivotmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PivotmodelFactoryImpl extends EFactoryImpl implements PivotmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PivotmodelFactory init() {
		try {
			PivotmodelFactory thePivotmodelFactory = (PivotmodelFactory)EPackage.Registry.INSTANCE.getEFactory(PivotmodelPackage.eNS_URI);
			if (thePivotmodelFactory != null) {
				return thePivotmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PivotmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PivotmodelFactoryImpl() {
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
			case PivotmodelPackage.ONTOLOGY: return createOntology();
			case PivotmodelPackage.SIMPLE_CLASS: return createSimpleClass();
			case PivotmodelPackage.SIMPLE_PROPERTY: return createSimpleProperty();
			case PivotmodelPackage.CASE_OF_CLASS: return createCaseOfClass();
			case PivotmodelPackage.UNIVERSAL_CLASS: return createUniversalClass();
			case PivotmodelPackage.EXISTANTIAL_CLASS: return createExistantialClass();
			case PivotmodelPackage.HAS_VALUE_CLASS: return createHasValueClass();
			case PivotmodelPackage.MAX_CARDINALITY_CLASS: return createMaxCardinalityClass();
			case PivotmodelPackage.MIN_CARDINALITY_CLASS: return createMinCardinalityClass();
			case PivotmodelPackage.CARDINALITY_CLASS: return createCardinalityClass();
			case PivotmodelPackage.ENUMERATED_CLASS: return createEnumeratedClass();
			case PivotmodelPackage.UNION_CLASS: return createUnionClass();
			case PivotmodelPackage.INTERSECTION_CLASS: return createIntersectionClass();
			case PivotmodelPackage.COMPLEMENT_CLASS: return createComplementClass();
			case PivotmodelPackage.CONDITION_PROPERTY: return createConditionProperty();
			case PivotmodelPackage.DEPENDENT_PROPERTY: return createDependentProperty();
			case PivotmodelPackage.NOT_NUMERIC_TYPE: return createNotNumericType();
			case PivotmodelPackage.NUMERIC_TYPE: return createNumericType();
			case PivotmodelPackage.MEASURE_TYPE: return createMeasureType();
			case PivotmodelPackage.CURRENCY_TYPE: return createCurrencyType();
			case PivotmodelPackage.CLASS_TYPE: return createClassType();
			case PivotmodelPackage.COLLECTION_TYPE: return createCollectionType();
			case PivotmodelPackage.SINGLE_VALUE: return createSingleValue();
			case PivotmodelPackage.ENUMERATED_TYPE: return createEnumeratedType();
			case PivotmodelPackage.NUMBER_ENUMERATED_TYPE: return createNumberEnumeratedType();
			case PivotmodelPackage.NAMED_UNIT: return createNamedUnit();
			case PivotmodelPackage.DERIVED_UNIT: return createDerivedUnit();
			case PivotmodelPackage.NON_STANDARD_UNIT: return createNonStandardUnit();
			case PivotmodelPackage.CONVERSION_BASED_UNIT: return createConversionBasedUnit();
			case PivotmodelPackage.CONTEXT_DEPENDENT_UNIT: return createContextDependentUnit();
			case PivotmodelPackage.STANDARD_UNIT: return createStandardUnit();
			case PivotmodelPackage.DERIVED_UNIT_ELEMENT: return createDerivedUnitElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PivotmodelPackage.PREDEFINED_TYPE:
				return createPredefinedTypeFromString(eDataType, initialValue);
			case PivotmodelPackage.PREDEFINED_COLLECTION:
				return createPredefinedCollectionFromString(eDataType, initialValue);
			case PivotmodelPackage.PREDEFINED_CURRENCY:
				return createPredefinedCurrencyFromString(eDataType, initialValue);
			case PivotmodelPackage.PREFIXE_TYPE:
				return createPrefixeTypeFromString(eDataType, initialValue);
			case PivotmodelPackage.UNIT_NAME:
				return createUnitNameFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PivotmodelPackage.PREDEFINED_TYPE:
				return convertPredefinedTypeToString(eDataType, instanceValue);
			case PivotmodelPackage.PREDEFINED_COLLECTION:
				return convertPredefinedCollectionToString(eDataType, instanceValue);
			case PivotmodelPackage.PREDEFINED_CURRENCY:
				return convertPredefinedCurrencyToString(eDataType, instanceValue);
			case PivotmodelPackage.PREFIXE_TYPE:
				return convertPrefixeTypeToString(eDataType, instanceValue);
			case PivotmodelPackage.UNIT_NAME:
				return convertUnitNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleClass createSimpleClass() {
		SimpleClassImpl simpleClass = new SimpleClassImpl();
		return simpleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleProperty createSimpleProperty() {
		SimplePropertyImpl simpleProperty = new SimplePropertyImpl();
		return simpleProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseOfClass createCaseOfClass() {
		CaseOfClassImpl caseOfClass = new CaseOfClassImpl();
		return caseOfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversalClass createUniversalClass() {
		UniversalClassImpl universalClass = new UniversalClassImpl();
		return universalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExistantialClass createExistantialClass() {
		ExistantialClassImpl existantialClass = new ExistantialClassImpl();
		return existantialClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HasValueClass createHasValueClass() {
		HasValueClassImpl hasValueClass = new HasValueClassImpl();
		return hasValueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxCardinalityClass createMaxCardinalityClass() {
		MaxCardinalityClassImpl maxCardinalityClass = new MaxCardinalityClassImpl();
		return maxCardinalityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinCardinalityClass createMinCardinalityClass() {
		MinCardinalityClassImpl minCardinalityClass = new MinCardinalityClassImpl();
		return minCardinalityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityClass createCardinalityClass() {
		CardinalityClassImpl cardinalityClass = new CardinalityClassImpl();
		return cardinalityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedClass createEnumeratedClass() {
		EnumeratedClassImpl enumeratedClass = new EnumeratedClassImpl();
		return enumeratedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnionClass createUnionClass() {
		UnionClassImpl unionClass = new UnionClassImpl();
		return unionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntersectionClass createIntersectionClass() {
		IntersectionClassImpl intersectionClass = new IntersectionClassImpl();
		return intersectionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplementClass createComplementClass() {
		ComplementClassImpl complementClass = new ComplementClassImpl();
		return complementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionProperty createConditionProperty() {
		ConditionPropertyImpl conditionProperty = new ConditionPropertyImpl();
		return conditionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependentProperty createDependentProperty() {
		DependentPropertyImpl dependentProperty = new DependentPropertyImpl();
		return dependentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotNumericType createNotNumericType() {
		NotNumericTypeImpl notNumericType = new NotNumericTypeImpl();
		return notNumericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericType createNumericType() {
		NumericTypeImpl numericType = new NumericTypeImpl();
		return numericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType createMeasureType() {
		MeasureTypeImpl measureType = new MeasureTypeImpl();
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrencyType createCurrencyType() {
		CurrencyTypeImpl currencyType = new CurrencyTypeImpl();
		return currencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassType createClassType() {
		ClassTypeImpl classType = new ClassTypeImpl();
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleValue createSingleValue() {
		SingleValueImpl singleValue = new SingleValueImpl();
		return singleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedType createEnumeratedType() {
		EnumeratedTypeImpl enumeratedType = new EnumeratedTypeImpl();
		return enumeratedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberEnumeratedType createNumberEnumeratedType() {
		NumberEnumeratedTypeImpl numberEnumeratedType = new NumberEnumeratedTypeImpl();
		return numberEnumeratedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedUnit createNamedUnit() {
		NamedUnitImpl namedUnit = new NamedUnitImpl();
		return namedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedUnit createDerivedUnit() {
		DerivedUnitImpl derivedUnit = new DerivedUnitImpl();
		return derivedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonStandardUnit createNonStandardUnit() {
		NonStandardUnitImpl nonStandardUnit = new NonStandardUnitImpl();
		return nonStandardUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionBasedUnit createConversionBasedUnit() {
		ConversionBasedUnitImpl conversionBasedUnit = new ConversionBasedUnitImpl();
		return conversionBasedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextDependentUnit createContextDependentUnit() {
		ContextDependentUnitImpl contextDependentUnit = new ContextDependentUnitImpl();
		return contextDependentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardUnit createStandardUnit() {
		StandardUnitImpl standardUnit = new StandardUnitImpl();
		return standardUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedUnitElement createDerivedUnitElement() {
		DerivedUnitElementImpl derivedUnitElement = new DerivedUnitElementImpl();
		return derivedUnitElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedType createPredefinedTypeFromString(EDataType eDataType, String initialValue) {
		PredefinedType result = PredefinedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPredefinedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedCollection createPredefinedCollectionFromString(EDataType eDataType, String initialValue) {
		PredefinedCollection result = PredefinedCollection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPredefinedCollectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedCurrency createPredefinedCurrencyFromString(EDataType eDataType, String initialValue) {
		PredefinedCurrency result = PredefinedCurrency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPredefinedCurrencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixeType createPrefixeTypeFromString(EDataType eDataType, String initialValue) {
		PrefixeType result = PrefixeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrefixeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitName createUnitNameFromString(EDataType eDataType, String initialValue) {
		UnitName result = UnitName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PivotmodelPackage getPivotmodelPackage() {
		return (PivotmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PivotmodelPackage getPackage() {
		return PivotmodelPackage.eINSTANCE;
	}

} //PivotmodelFactoryImpl
