/**
 */
package pivotmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pivotmodel.PivotmodelPackage
 * @generated
 */
public interface PivotmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PivotmodelFactory eINSTANCE = pivotmodel.impl.PivotmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology</em>'.
	 * @generated
	 */
	Ontology createOntology();

	/**
	 * Returns a new object of class '<em>Simple Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Class</em>'.
	 * @generated
	 */
	SimpleClass createSimpleClass();

	/**
	 * Returns a new object of class '<em>Simple Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Property</em>'.
	 * @generated
	 */
	SimpleProperty createSimpleProperty();

	/**
	 * Returns a new object of class '<em>Case Of Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Of Class</em>'.
	 * @generated
	 */
	CaseOfClass createCaseOfClass();

	/**
	 * Returns a new object of class '<em>Universal Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universal Class</em>'.
	 * @generated
	 */
	UniversalClass createUniversalClass();

	/**
	 * Returns a new object of class '<em>Existantial Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existantial Class</em>'.
	 * @generated
	 */
	ExistantialClass createExistantialClass();

	/**
	 * Returns a new object of class '<em>Has Value Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Value Class</em>'.
	 * @generated
	 */
	HasValueClass createHasValueClass();

	/**
	 * Returns a new object of class '<em>Max Cardinality Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Cardinality Class</em>'.
	 * @generated
	 */
	MaxCardinalityClass createMaxCardinalityClass();

	/**
	 * Returns a new object of class '<em>Min Cardinality Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Cardinality Class</em>'.
	 * @generated
	 */
	MinCardinalityClass createMinCardinalityClass();

	/**
	 * Returns a new object of class '<em>Cardinality Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality Class</em>'.
	 * @generated
	 */
	CardinalityClass createCardinalityClass();

	/**
	 * Returns a new object of class '<em>Enumerated Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Class</em>'.
	 * @generated
	 */
	EnumeratedClass createEnumeratedClass();

	/**
	 * Returns a new object of class '<em>Union Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Class</em>'.
	 * @generated
	 */
	UnionClass createUnionClass();

	/**
	 * Returns a new object of class '<em>Intersection Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intersection Class</em>'.
	 * @generated
	 */
	IntersectionClass createIntersectionClass();

	/**
	 * Returns a new object of class '<em>Complement Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complement Class</em>'.
	 * @generated
	 */
	ComplementClass createComplementClass();

	/**
	 * Returns a new object of class '<em>Condition Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Property</em>'.
	 * @generated
	 */
	ConditionProperty createConditionProperty();

	/**
	 * Returns a new object of class '<em>Dependent Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependent Property</em>'.
	 * @generated
	 */
	DependentProperty createDependentProperty();

	/**
	 * Returns a new object of class '<em>Not Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Numeric Type</em>'.
	 * @generated
	 */
	NotNumericType createNotNumericType();

	/**
	 * Returns a new object of class '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Type</em>'.
	 * @generated
	 */
	NumericType createNumericType();

	/**
	 * Returns a new object of class '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Type</em>'.
	 * @generated
	 */
	MeasureType createMeasureType();

	/**
	 * Returns a new object of class '<em>Currency Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency Type</em>'.
	 * @generated
	 */
	CurrencyType createCurrencyType();

	/**
	 * Returns a new object of class '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Type</em>'.
	 * @generated
	 */
	ClassType createClassType();

	/**
	 * Returns a new object of class '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type</em>'.
	 * @generated
	 */
	CollectionType createCollectionType();

	/**
	 * Returns a new object of class '<em>Single Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Value</em>'.
	 * @generated
	 */
	SingleValue createSingleValue();

	/**
	 * Returns a new object of class '<em>Enumerated Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Type</em>'.
	 * @generated
	 */
	EnumeratedType createEnumeratedType();

	/**
	 * Returns a new object of class '<em>Number Enumerated Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Enumerated Type</em>'.
	 * @generated
	 */
	NumberEnumeratedType createNumberEnumeratedType();

	/**
	 * Returns a new object of class '<em>Named Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Unit</em>'.
	 * @generated
	 */
	NamedUnit createNamedUnit();

	/**
	 * Returns a new object of class '<em>Derived Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Unit</em>'.
	 * @generated
	 */
	DerivedUnit createDerivedUnit();

	/**
	 * Returns a new object of class '<em>Non Standard Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Standard Unit</em>'.
	 * @generated
	 */
	NonStandardUnit createNonStandardUnit();

	/**
	 * Returns a new object of class '<em>Conversion Based Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion Based Unit</em>'.
	 * @generated
	 */
	ConversionBasedUnit createConversionBasedUnit();

	/**
	 * Returns a new object of class '<em>Context Dependent Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Dependent Unit</em>'.
	 * @generated
	 */
	ContextDependentUnit createContextDependentUnit();

	/**
	 * Returns a new object of class '<em>Standard Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Unit</em>'.
	 * @generated
	 */
	StandardUnit createStandardUnit();

	/**
	 * Returns a new object of class '<em>Derived Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Unit Element</em>'.
	 * @generated
	 */
	DerivedUnitElement createDerivedUnitElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PivotmodelPackage getPivotmodelPackage();

} //PivotmodelFactory
