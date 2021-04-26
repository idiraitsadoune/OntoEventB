/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.util;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage
 * @generated
 */
public class ValueSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSwitch() {
		if (modelPackage == null) {
			modelPackage = ValuePackage.eINSTANCE;
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
			case ValuePackage.BAG_VALUE_TYPE: {
				BagValueType bagValueType = (BagValueType)theEObject;
				T result = caseBagValueType(bagValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.BOOLEAN_VALUE_TYPE: {
				BooleanValueType booleanValueType = (BooleanValueType)theEObject;
				T result = caseBooleanValueType(booleanValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.COMBINATION_TYPE: {
				CombinationType combinationType = (CombinationType)theEObject;
				T result = caseCombinationType(combinationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.COMPLEX_VALUE_TYPE: {
				ComplexValueType complexValueType = (ComplexValueType)theEObject;
				T result = caseComplexValueType(complexValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.COMPOSITE_VALUE_TYPE: {
				CompositeValueType compositeValueType = (CompositeValueType)theEObject;
				T result = caseCompositeValueType(compositeValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.CONDITION_ELEMENT_TYPE: {
				ConditionElementType conditionElementType = (ConditionElementType)theEObject;
				T result = caseConditionElementType(conditionElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.CONTROLLED_VALUE_TYPE: {
				ControlledValueType controlledValueType = (ControlledValueType)theEObject;
				T result = caseControlledValueType(controlledValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.CURRENCY_VALUE_TYPE: {
				CurrencyValueType currencyValueType = (CurrencyValueType)theEObject;
				T result = caseCurrencyValueType(currencyValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.DATE_TIME_VALUE_TYPE: {
				DateTimeValueType dateTimeValueType = (DateTimeValueType)theEObject;
				T result = caseDateTimeValueType(dateTimeValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.DATE_VALUE_TYPE: {
				DateValueType dateValueType = (DateValueType)theEObject;
				T result = caseDateValueType(dateValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.ENVIRONMENT_TYPE: {
				EnvironmentType environmentType = (EnvironmentType)theEObject;
				T result = caseEnvironmentType(environmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.FIELD_TYPE: {
				FieldType fieldType = (FieldType)theEObject;
				T result = caseFieldType(fieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.FILE_VALUE_TYPE: {
				FileValueType fileValueType = (FileValueType)theEObject;
				T result = caseFileValueType(fileValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.INTEGER_VALUE_TYPE: {
				IntegerValueType integerValueType = (IntegerValueType)theEObject;
				T result = caseIntegerValueType(integerValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.ITEM_REFERENCE_VALUE_TYPE: {
				ItemReferenceValueType itemReferenceValueType = (ItemReferenceValueType)theEObject;
				T result = caseItemReferenceValueType(itemReferenceValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.LOCALIZED_TEXT_VALUE_TYPE: {
				LocalizedTextValueType localizedTextValueType = (LocalizedTextValueType)theEObject;
				T result = caseLocalizedTextValueType(localizedTextValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.MEASURE_QUALIFIED_NUMBER_VALUE_TYPE: {
				MeasureQualifiedNumberValueType measureQualifiedNumberValueType = (MeasureQualifiedNumberValueType)theEObject;
				T result = caseMeasureQualifiedNumberValueType(measureQualifiedNumberValueType);
				if (result == null) result = caseMeasureValueType(measureQualifiedNumberValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.MEASURE_RANGE_VALUE_TYPE: {
				MeasureRangeValueType measureRangeValueType = (MeasureRangeValueType)theEObject;
				T result = caseMeasureRangeValueType(measureRangeValueType);
				if (result == null) result = caseMeasureValueType(measureRangeValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.MEASURE_SINGLE_NUMBER_VALUE_TYPE: {
				MeasureSingleNumberValueType measureSingleNumberValueType = (MeasureSingleNumberValueType)theEObject;
				T result = caseMeasureSingleNumberValueType(measureSingleNumberValueType);
				if (result == null) result = caseMeasureValueType(measureSingleNumberValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.MEASURE_VALUE_TYPE: {
				MeasureValueType measureValueType = (MeasureValueType)theEObject;
				T result = caseMeasureValueType(measureValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.NULL_VALUE_TYPE: {
				NullValueType nullValueType = (NullValueType)theEObject;
				T result = caseNullValueType(nullValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.NUMERIC_VALUE_TYPE: {
				NumericValueType numericValueType = (NumericValueType)theEObject;
				T result = caseNumericValueType(numericValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.ONE_OF_TYPE: {
				OneOfType oneOfType = (OneOfType)theEObject;
				T result = caseOneOfType(oneOfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.PRESENTATION_VALUE_TYPE: {
				PresentationValueType presentationValueType = (PresentationValueType)theEObject;
				T result = casePresentationValueType(presentationValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.QUALIFIED_VALUE_TYPE: {
				QualifiedValueType qualifiedValueType = (QualifiedValueType)theEObject;
				T result = caseQualifiedValueType(qualifiedValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.RATIONAL_VALUE_TYPE: {
				RationalValueType rationalValueType = (RationalValueType)theEObject;
				T result = caseRationalValueType(rationalValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.REAL_VALUE_TYPE: {
				RealValueType realValueType = (RealValueType)theEObject;
				T result = caseRealValueType(realValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.SEQUENCE_VALUE_TYPE: {
				SequenceValueType sequenceValueType = (SequenceValueType)theEObject;
				T result = caseSequenceValueType(sequenceValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.SET_VALUE_TYPE: {
				SetValueType setValueType = (SetValueType)theEObject;
				T result = caseSetValueType(setValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.STRING_VALUE_TYPE: {
				StringValueType stringValueType = (StringValueType)theEObject;
				T result = caseStringValueType(stringValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.TIME_VALUE_TYPE: {
				TimeValueType timeValueType = (TimeValueType)theEObject;
				T result = caseTimeValueType(timeValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.YEAR_MONTH_VALUE_TYPE: {
				YearMonthValueType yearMonthValueType = (YearMonthValueType)theEObject;
				T result = caseYearMonthValueType(yearMonthValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuePackage.YEAR_VALUE_TYPE: {
				YearValueType yearValueType = (YearValueType)theEObject;
				T result = caseYearValueType(yearValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagValueType(BagValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValueType(BooleanValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combination Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combination Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinationType(CombinationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexValueType(ComplexValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeValueType(CompositeValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionElementType(ConditionElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controlled Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controlled Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlledValueType(ControlledValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyValueType(CurrencyValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeValueType(DateTimeValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateValueType(DateValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentType(EnvironmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldType(FieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileValueType(FileValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValueType(IntegerValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Reference Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Reference Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemReferenceValueType(ItemReferenceValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localized Text Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localized Text Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalizedTextValueType(LocalizedTextValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Qualified Number Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Qualified Number Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureQualifiedNumberValueType(MeasureQualifiedNumberValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Range Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Range Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureRangeValueType(MeasureRangeValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Single Number Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Single Number Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureSingleNumberValueType(MeasureSingleNumberValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureValueType(MeasureValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullValueType(NullValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericValueType(NumericValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Of Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Of Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneOfType(OneOfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationValueType(PresentationValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedValueType(QualifiedValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rational Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rational Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationalValueType(RationalValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealValueType(RealValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceValueType(SequenceValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetValueType(SetValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValueType(StringValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeValueType(TimeValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year Month Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Month Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYearMonthValueType(YearMonthValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYearValueType(YearValueType object) {
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

} //ValueSwitch
