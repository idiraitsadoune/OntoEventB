/**
 */
package pivotmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pivotmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pivotmodel.PivotmodelPackage
 * @generated
 */
public class PivotmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PivotmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PivotmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PivotmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PivotmodelSwitch<Adapter> modelSwitch =
		new PivotmodelSwitch<Adapter>() {
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter caseClassDefinition(ClassDefinition object) {
				return createClassDefinitionAdapter();
			}
			@Override
			public Adapter caseSimpleClass(SimpleClass object) {
				return createSimpleClassAdapter();
			}
			@Override
			public Adapter casePropertyDefinition(PropertyDefinition object) {
				return createPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseSimpleProperty(SimpleProperty object) {
				return createSimplePropertyAdapter();
			}
			@Override
			public Adapter caseDataTypeDefinition(DataTypeDefinition object) {
				return createDataTypeDefinitionAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseCaseOfClass(CaseOfClass object) {
				return createCaseOfClassAdapter();
			}
			@Override
			public Adapter caseRestrictedClass(RestrictedClass object) {
				return createRestrictedClassAdapter();
			}
			@Override
			public Adapter caseValueRestrictedClass(ValueRestrictedClass object) {
				return createValueRestrictedClassAdapter();
			}
			@Override
			public Adapter caseUniversalClass(UniversalClass object) {
				return createUniversalClassAdapter();
			}
			@Override
			public Adapter caseExistantialClass(ExistantialClass object) {
				return createExistantialClassAdapter();
			}
			@Override
			public Adapter caseHasValueClass(HasValueClass object) {
				return createHasValueClassAdapter();
			}
			@Override
			public Adapter caseCardinalityRestrictedClass(CardinalityRestrictedClass object) {
				return createCardinalityRestrictedClassAdapter();
			}
			@Override
			public Adapter caseMaxCardinalityClass(MaxCardinalityClass object) {
				return createMaxCardinalityClassAdapter();
			}
			@Override
			public Adapter caseMinCardinalityClass(MinCardinalityClass object) {
				return createMinCardinalityClassAdapter();
			}
			@Override
			public Adapter caseCardinalityClass(CardinalityClass object) {
				return createCardinalityClassAdapter();
			}
			@Override
			public Adapter caseEnumeratedClass(EnumeratedClass object) {
				return createEnumeratedClassAdapter();
			}
			@Override
			public Adapter caseCombinationClass(CombinationClass object) {
				return createCombinationClassAdapter();
			}
			@Override
			public Adapter caseUnionClass(UnionClass object) {
				return createUnionClassAdapter();
			}
			@Override
			public Adapter caseIntersectionClass(IntersectionClass object) {
				return createIntersectionClassAdapter();
			}
			@Override
			public Adapter caseComplementClass(ComplementClass object) {
				return createComplementClassAdapter();
			}
			@Override
			public Adapter caseConditionProperty(ConditionProperty object) {
				return createConditionPropertyAdapter();
			}
			@Override
			public Adapter caseDependentProperty(DependentProperty object) {
				return createDependentPropertyAdapter();
			}
			@Override
			public Adapter caseNotNumericType(NotNumericType object) {
				return createNotNumericTypeAdapter();
			}
			@Override
			public Adapter caseNumericType(NumericType object) {
				return createNumericTypeAdapter();
			}
			@Override
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
			}
			@Override
			public Adapter caseCurrencyType(CurrencyType object) {
				return createCurrencyTypeAdapter();
			}
			@Override
			public Adapter caseClassType(ClassType object) {
				return createClassTypeAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter caseSingleValue(SingleValue object) {
				return createSingleValueAdapter();
			}
			@Override
			public Adapter caseEnumeratedType(EnumeratedType object) {
				return createEnumeratedTypeAdapter();
			}
			@Override
			public Adapter caseNumberEnumeratedType(NumberEnumeratedType object) {
				return createNumberEnumeratedTypeAdapter();
			}
			@Override
			public Adapter caseUnitType(UnitType object) {
				return createUnitTypeAdapter();
			}
			@Override
			public Adapter caseNamedUnit(NamedUnit object) {
				return createNamedUnitAdapter();
			}
			@Override
			public Adapter caseDerivedUnit(DerivedUnit object) {
				return createDerivedUnitAdapter();
			}
			@Override
			public Adapter caseNonStandardUnit(NonStandardUnit object) {
				return createNonStandardUnitAdapter();
			}
			@Override
			public Adapter caseConversionBasedUnit(ConversionBasedUnit object) {
				return createConversionBasedUnitAdapter();
			}
			@Override
			public Adapter caseContextDependentUnit(ContextDependentUnit object) {
				return createContextDependentUnitAdapter();
			}
			@Override
			public Adapter caseStandardUnit(StandardUnit object) {
				return createStandardUnitAdapter();
			}
			@Override
			public Adapter caseDerivedUnitElement(DerivedUnitElement object) {
				return createDerivedUnitElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.ClassDefinition <em>Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.ClassDefinition
	 * @generated
	 */
	public Adapter createClassDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.SimpleClass <em>Simple Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.SimpleClass
	 * @generated
	 */
	public Adapter createSimpleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.PropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.PropertyDefinition
	 * @generated
	 */
	public Adapter createPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.SimpleProperty <em>Simple Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.SimpleProperty
	 * @generated
	 */
	public Adapter createSimplePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.DataTypeDefinition <em>Data Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.DataTypeDefinition
	 * @generated
	 */
	public Adapter createDataTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.CaseOfClass <em>Case Of Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.CaseOfClass
	 * @generated
	 */
	public Adapter createCaseOfClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.RestrictedClass <em>Restricted Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.RestrictedClass
	 * @generated
	 */
	public Adapter createRestrictedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.ValueRestrictedClass <em>Value Restricted Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.ValueRestrictedClass
	 * @generated
	 */
	public Adapter createValueRestrictedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.UniversalClass <em>Universal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.UniversalClass
	 * @generated
	 */
	public Adapter createUniversalClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.ExistantialClass <em>Existantial Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.ExistantialClass
	 * @generated
	 */
	public Adapter createExistantialClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.HasValueClass <em>Has Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.HasValueClass
	 * @generated
	 */
	public Adapter createHasValueClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.CardinalityRestrictedClass <em>Cardinality Restricted Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.CardinalityRestrictedClass
	 * @generated
	 */
	public Adapter createCardinalityRestrictedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.MaxCardinalityClass <em>Max Cardinality Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.MaxCardinalityClass
	 * @generated
	 */
	public Adapter createMaxCardinalityClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.MinCardinalityClass <em>Min Cardinality Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.MinCardinalityClass
	 * @generated
	 */
	public Adapter createMinCardinalityClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.CardinalityClass <em>Cardinality Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.CardinalityClass
	 * @generated
	 */
	public Adapter createCardinalityClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.EnumeratedClass <em>Enumerated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.EnumeratedClass
	 * @generated
	 */
	public Adapter createEnumeratedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.CombinationClass <em>Combination Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.CombinationClass
	 * @generated
	 */
	public Adapter createCombinationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.UnionClass <em>Union Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.UnionClass
	 * @generated
	 */
	public Adapter createUnionClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.IntersectionClass <em>Intersection Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.IntersectionClass
	 * @generated
	 */
	public Adapter createIntersectionClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.ComplementClass <em>Complement Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.ComplementClass
	 * @generated
	 */
	public Adapter createComplementClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.ConditionProperty <em>Condition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.ConditionProperty
	 * @generated
	 */
	public Adapter createConditionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.DependentProperty <em>Dependent Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.DependentProperty
	 * @generated
	 */
	public Adapter createDependentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.NotNumericType <em>Not Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.NotNumericType
	 * @generated
	 */
	public Adapter createNotNumericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.NumericType
	 * @generated
	 */
	public Adapter createNumericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.CurrencyType <em>Currency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.CurrencyType
	 * @generated
	 */
	public Adapter createCurrencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.ClassType
	 * @generated
	 */
	public Adapter createClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.SingleValue <em>Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.SingleValue
	 * @generated
	 */
	public Adapter createSingleValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.EnumeratedType <em>Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.EnumeratedType
	 * @generated
	 */
	public Adapter createEnumeratedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.NumberEnumeratedType <em>Number Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.NumberEnumeratedType
	 * @generated
	 */
	public Adapter createNumberEnumeratedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.UnitType
	 * @generated
	 */
	public Adapter createUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.NamedUnit <em>Named Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.NamedUnit
	 * @generated
	 */
	public Adapter createNamedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.DerivedUnit <em>Derived Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.DerivedUnit
	 * @generated
	 */
	public Adapter createDerivedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.NonStandardUnit <em>Non Standard Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.NonStandardUnit
	 * @generated
	 */
	public Adapter createNonStandardUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.ConversionBasedUnit <em>Conversion Based Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.ConversionBasedUnit
	 * @generated
	 */
	public Adapter createConversionBasedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.ContextDependentUnit <em>Context Dependent Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.ContextDependentUnit
	 * @generated
	 */
	public Adapter createContextDependentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.StandardUnit <em>Standard Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.StandardUnit
	 * @generated
	 */
	public Adapter createStandardUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pivotmodel.DerivedUnitElement <em>Derived Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pivotmodel.DerivedUnitElement
	 * @generated
	 */
	public Adapter createDerivedUnitElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PivotmodelAdapterFactory
