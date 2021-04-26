/**
 */
package pivotmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pivotmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pivotmodel.PivotmodelPackage
 * @generated
 */
public class PivotmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PivotmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PivotmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = PivotmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PivotmodelPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.CLASS_DEFINITION: {
				ClassDefinition classDefinition = (ClassDefinition)theEObject;
				T result = caseClassDefinition(classDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.SIMPLE_CLASS: {
				SimpleClass simpleClass = (SimpleClass)theEObject;
				T result = caseSimpleClass(simpleClass);
				if (result == null) result = caseClassDefinition(simpleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.PROPERTY_DEFINITION: {
				PropertyDefinition propertyDefinition = (PropertyDefinition)theEObject;
				T result = casePropertyDefinition(propertyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.SIMPLE_PROPERTY: {
				SimpleProperty simpleProperty = (SimpleProperty)theEObject;
				T result = caseSimpleProperty(simpleProperty);
				if (result == null) result = casePropertyDefinition(simpleProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.DATA_TYPE_DEFINITION: {
				DataTypeDefinition dataTypeDefinition = (DataTypeDefinition)theEObject;
				T result = caseDataTypeDefinition(dataTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseDataTypeDefinition(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.CASE_OF_CLASS: {
				CaseOfClass caseOfClass = (CaseOfClass)theEObject;
				T result = caseCaseOfClass(caseOfClass);
				if (result == null) result = caseClassDefinition(caseOfClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.RESTRICTED_CLASS: {
				RestrictedClass restrictedClass = (RestrictedClass)theEObject;
				T result = caseRestrictedClass(restrictedClass);
				if (result == null) result = caseClassDefinition(restrictedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.VALUE_RESTRICTED_CLASS: {
				ValueRestrictedClass valueRestrictedClass = (ValueRestrictedClass)theEObject;
				T result = caseValueRestrictedClass(valueRestrictedClass);
				if (result == null) result = caseRestrictedClass(valueRestrictedClass);
				if (result == null) result = caseClassDefinition(valueRestrictedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.UNIVERSAL_CLASS: {
				UniversalClass universalClass = (UniversalClass)theEObject;
				T result = caseUniversalClass(universalClass);
				if (result == null) result = caseValueRestrictedClass(universalClass);
				if (result == null) result = caseRestrictedClass(universalClass);
				if (result == null) result = caseClassDefinition(universalClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.EXISTANTIAL_CLASS: {
				ExistantialClass existantialClass = (ExistantialClass)theEObject;
				T result = caseExistantialClass(existantialClass);
				if (result == null) result = caseValueRestrictedClass(existantialClass);
				if (result == null) result = caseRestrictedClass(existantialClass);
				if (result == null) result = caseClassDefinition(existantialClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.HAS_VALUE_CLASS: {
				HasValueClass hasValueClass = (HasValueClass)theEObject;
				T result = caseHasValueClass(hasValueClass);
				if (result == null) result = caseValueRestrictedClass(hasValueClass);
				if (result == null) result = caseRestrictedClass(hasValueClass);
				if (result == null) result = caseClassDefinition(hasValueClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.CARDINALITY_RESTRICTED_CLASS: {
				CardinalityRestrictedClass cardinalityRestrictedClass = (CardinalityRestrictedClass)theEObject;
				T result = caseCardinalityRestrictedClass(cardinalityRestrictedClass);
				if (result == null) result = caseRestrictedClass(cardinalityRestrictedClass);
				if (result == null) result = caseClassDefinition(cardinalityRestrictedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.MAX_CARDINALITY_CLASS: {
				MaxCardinalityClass maxCardinalityClass = (MaxCardinalityClass)theEObject;
				T result = caseMaxCardinalityClass(maxCardinalityClass);
				if (result == null) result = caseCardinalityRestrictedClass(maxCardinalityClass);
				if (result == null) result = caseRestrictedClass(maxCardinalityClass);
				if (result == null) result = caseClassDefinition(maxCardinalityClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.MIN_CARDINALITY_CLASS: {
				MinCardinalityClass minCardinalityClass = (MinCardinalityClass)theEObject;
				T result = caseMinCardinalityClass(minCardinalityClass);
				if (result == null) result = caseCardinalityRestrictedClass(minCardinalityClass);
				if (result == null) result = caseRestrictedClass(minCardinalityClass);
				if (result == null) result = caseClassDefinition(minCardinalityClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.CARDINALITY_CLASS: {
				CardinalityClass cardinalityClass = (CardinalityClass)theEObject;
				T result = caseCardinalityClass(cardinalityClass);
				if (result == null) result = caseCardinalityRestrictedClass(cardinalityClass);
				if (result == null) result = caseRestrictedClass(cardinalityClass);
				if (result == null) result = caseClassDefinition(cardinalityClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.ENUMERATED_CLASS: {
				EnumeratedClass enumeratedClass = (EnumeratedClass)theEObject;
				T result = caseEnumeratedClass(enumeratedClass);
				if (result == null) result = caseClassDefinition(enumeratedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.COMBINATION_CLASS: {
				CombinationClass combinationClass = (CombinationClass)theEObject;
				T result = caseCombinationClass(combinationClass);
				if (result == null) result = caseClassDefinition(combinationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.UNION_CLASS: {
				UnionClass unionClass = (UnionClass)theEObject;
				T result = caseUnionClass(unionClass);
				if (result == null) result = caseCombinationClass(unionClass);
				if (result == null) result = caseClassDefinition(unionClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.INTERSECTION_CLASS: {
				IntersectionClass intersectionClass = (IntersectionClass)theEObject;
				T result = caseIntersectionClass(intersectionClass);
				if (result == null) result = caseCombinationClass(intersectionClass);
				if (result == null) result = caseClassDefinition(intersectionClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.COMPLEMENT_CLASS: {
				ComplementClass complementClass = (ComplementClass)theEObject;
				T result = caseComplementClass(complementClass);
				if (result == null) result = caseCombinationClass(complementClass);
				if (result == null) result = caseClassDefinition(complementClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.CONDITION_PROPERTY: {
				ConditionProperty conditionProperty = (ConditionProperty)theEObject;
				T result = caseConditionProperty(conditionProperty);
				if (result == null) result = casePropertyDefinition(conditionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.DEPENDENT_PROPERTY: {
				DependentProperty dependentProperty = (DependentProperty)theEObject;
				T result = caseDependentProperty(dependentProperty);
				if (result == null) result = casePropertyDefinition(dependentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.NOT_NUMERIC_TYPE: {
				NotNumericType notNumericType = (NotNumericType)theEObject;
				T result = caseNotNumericType(notNumericType);
				if (result == null) result = casePrimitiveType(notNumericType);
				if (result == null) result = caseDataTypeDefinition(notNumericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.NUMERIC_TYPE: {
				NumericType numericType = (NumericType)theEObject;
				T result = caseNumericType(numericType);
				if (result == null) result = casePrimitiveType(numericType);
				if (result == null) result = caseDataTypeDefinition(numericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.MEASURE_TYPE: {
				MeasureType measureType = (MeasureType)theEObject;
				T result = caseMeasureType(measureType);
				if (result == null) result = caseNumericType(measureType);
				if (result == null) result = casePrimitiveType(measureType);
				if (result == null) result = caseDataTypeDefinition(measureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.CURRENCY_TYPE: {
				CurrencyType currencyType = (CurrencyType)theEObject;
				T result = caseCurrencyType(currencyType);
				if (result == null) result = caseNumericType(currencyType);
				if (result == null) result = casePrimitiveType(currencyType);
				if (result == null) result = caseDataTypeDefinition(currencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.CLASS_TYPE: {
				ClassType classType = (ClassType)theEObject;
				T result = caseClassType(classType);
				if (result == null) result = caseDataTypeDefinition(classType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				T result = caseCollectionType(collectionType);
				if (result == null) result = caseDataTypeDefinition(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.SINGLE_VALUE: {
				SingleValue singleValue = (SingleValue)theEObject;
				T result = caseSingleValue(singleValue);
				if (result == null) result = caseDataTypeDefinition(singleValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.ENUMERATED_TYPE: {
				EnumeratedType enumeratedType = (EnumeratedType)theEObject;
				T result = caseEnumeratedType(enumeratedType);
				if (result == null) result = caseDataTypeDefinition(enumeratedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.NUMBER_ENUMERATED_TYPE: {
				NumberEnumeratedType numberEnumeratedType = (NumberEnumeratedType)theEObject;
				T result = caseNumberEnumeratedType(numberEnumeratedType);
				if (result == null) result = caseDataTypeDefinition(numberEnumeratedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.UNIT_TYPE: {
				UnitType unitType = (UnitType)theEObject;
				T result = caseUnitType(unitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.NAMED_UNIT: {
				NamedUnit namedUnit = (NamedUnit)theEObject;
				T result = caseNamedUnit(namedUnit);
				if (result == null) result = caseUnitType(namedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.DERIVED_UNIT: {
				DerivedUnit derivedUnit = (DerivedUnit)theEObject;
				T result = caseDerivedUnit(derivedUnit);
				if (result == null) result = caseUnitType(derivedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.NON_STANDARD_UNIT: {
				NonStandardUnit nonStandardUnit = (NonStandardUnit)theEObject;
				T result = caseNonStandardUnit(nonStandardUnit);
				if (result == null) result = caseNamedUnit(nonStandardUnit);
				if (result == null) result = caseUnitType(nonStandardUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.CONVERSION_BASED_UNIT: {
				ConversionBasedUnit conversionBasedUnit = (ConversionBasedUnit)theEObject;
				T result = caseConversionBasedUnit(conversionBasedUnit);
				if (result == null) result = caseNamedUnit(conversionBasedUnit);
				if (result == null) result = caseUnitType(conversionBasedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.CONTEXT_DEPENDENT_UNIT: {
				ContextDependentUnit contextDependentUnit = (ContextDependentUnit)theEObject;
				T result = caseContextDependentUnit(contextDependentUnit);
				if (result == null) result = caseNamedUnit(contextDependentUnit);
				if (result == null) result = caseUnitType(contextDependentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.STANDARD_UNIT: {
				StandardUnit standardUnit = (StandardUnit)theEObject;
				T result = caseStandardUnit(standardUnit);
				if (result == null) result = caseNamedUnit(standardUnit);
				if (result == null) result = caseUnitType(standardUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PivotmodelPackage.DERIVED_UNIT_ELEMENT: {
				DerivedUnitElement derivedUnitElement = (DerivedUnitElement)theEObject;
				T result = caseDerivedUnitElement(derivedUnitElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDefinition(ClassDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleClass(SimpleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyDefinition(PropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleProperty(SimpleProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeDefinition(DataTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Of Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Of Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseOfClass(CaseOfClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restricted Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricted Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictedClass(RestrictedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Restricted Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Restricted Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRestrictedClass(ValueRestrictedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universal Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universal Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalClass(UniversalClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existantial Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existantial Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistantialClass(ExistantialClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Value Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Value Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasValueClass(HasValueClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Restricted Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Restricted Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityRestrictedClass(CardinalityRestrictedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Cardinality Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Cardinality Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxCardinalityClass(MaxCardinalityClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Cardinality Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Cardinality Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinCardinalityClass(MinCardinalityClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityClass(CardinalityClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedClass(EnumeratedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combination Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combination Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinationClass(CombinationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionClass(UnionClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intersection Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intersection Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntersectionClass(IntersectionClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complement Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complement Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementClass(ComplementClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionProperty(ConditionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentProperty(DependentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotNumericType(NotNumericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericType(NumericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureType(MeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyType(CurrencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassType(ClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleValue(SingleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedType(EnumeratedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Enumerated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Enumerated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberEnumeratedType(NumberEnumeratedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitType(UnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedUnit(NamedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedUnit(DerivedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Standard Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Standard Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonStandardUnit(NonStandardUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion Based Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion Based Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionBasedUnit(ConversionBasedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Dependent Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Dependent Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextDependentUnit(ContextDependentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardUnit(StandardUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Unit Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedUnitElement(DerivedUnitElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PivotmodelSwitch
