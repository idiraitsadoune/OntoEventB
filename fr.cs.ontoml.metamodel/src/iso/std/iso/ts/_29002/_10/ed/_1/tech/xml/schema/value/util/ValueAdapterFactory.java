/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.util;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage
 * @generated
 */
public class ValueAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ValuePackage.eINSTANCE;
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
	protected ValueSwitch<Adapter> modelSwitch =
		new ValueSwitch<Adapter>() {
			@Override
			public Adapter caseBagValueType(BagValueType object) {
				return createBagValueTypeAdapter();
			}
			@Override
			public Adapter caseBooleanValueType(BooleanValueType object) {
				return createBooleanValueTypeAdapter();
			}
			@Override
			public Adapter caseCombinationType(CombinationType object) {
				return createCombinationTypeAdapter();
			}
			@Override
			public Adapter caseComplexValueType(ComplexValueType object) {
				return createComplexValueTypeAdapter();
			}
			@Override
			public Adapter caseCompositeValueType(CompositeValueType object) {
				return createCompositeValueTypeAdapter();
			}
			@Override
			public Adapter caseConditionElementType(ConditionElementType object) {
				return createConditionElementTypeAdapter();
			}
			@Override
			public Adapter caseControlledValueType(ControlledValueType object) {
				return createControlledValueTypeAdapter();
			}
			@Override
			public Adapter caseCurrencyValueType(CurrencyValueType object) {
				return createCurrencyValueTypeAdapter();
			}
			@Override
			public Adapter caseDateTimeValueType(DateTimeValueType object) {
				return createDateTimeValueTypeAdapter();
			}
			@Override
			public Adapter caseDateValueType(DateValueType object) {
				return createDateValueTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnvironmentType(EnvironmentType object) {
				return createEnvironmentTypeAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseFileValueType(FileValueType object) {
				return createFileValueTypeAdapter();
			}
			@Override
			public Adapter caseIntegerValueType(IntegerValueType object) {
				return createIntegerValueTypeAdapter();
			}
			@Override
			public Adapter caseItemReferenceValueType(ItemReferenceValueType object) {
				return createItemReferenceValueTypeAdapter();
			}
			@Override
			public Adapter caseLocalizedTextValueType(LocalizedTextValueType object) {
				return createLocalizedTextValueTypeAdapter();
			}
			@Override
			public Adapter caseMeasureQualifiedNumberValueType(MeasureQualifiedNumberValueType object) {
				return createMeasureQualifiedNumberValueTypeAdapter();
			}
			@Override
			public Adapter caseMeasureRangeValueType(MeasureRangeValueType object) {
				return createMeasureRangeValueTypeAdapter();
			}
			@Override
			public Adapter caseMeasureSingleNumberValueType(MeasureSingleNumberValueType object) {
				return createMeasureSingleNumberValueTypeAdapter();
			}
			@Override
			public Adapter caseMeasureValueType(MeasureValueType object) {
				return createMeasureValueTypeAdapter();
			}
			@Override
			public Adapter caseNullValueType(NullValueType object) {
				return createNullValueTypeAdapter();
			}
			@Override
			public Adapter caseNumericValueType(NumericValueType object) {
				return createNumericValueTypeAdapter();
			}
			@Override
			public Adapter caseOneOfType(OneOfType object) {
				return createOneOfTypeAdapter();
			}
			@Override
			public Adapter casePresentationValueType(PresentationValueType object) {
				return createPresentationValueTypeAdapter();
			}
			@Override
			public Adapter caseQualifiedValueType(QualifiedValueType object) {
				return createQualifiedValueTypeAdapter();
			}
			@Override
			public Adapter caseRationalValueType(RationalValueType object) {
				return createRationalValueTypeAdapter();
			}
			@Override
			public Adapter caseRealValueType(RealValueType object) {
				return createRealValueTypeAdapter();
			}
			@Override
			public Adapter caseSequenceValueType(SequenceValueType object) {
				return createSequenceValueTypeAdapter();
			}
			@Override
			public Adapter caseSetValueType(SetValueType object) {
				return createSetValueTypeAdapter();
			}
			@Override
			public Adapter caseStringValueType(StringValueType object) {
				return createStringValueTypeAdapter();
			}
			@Override
			public Adapter caseTimeValueType(TimeValueType object) {
				return createTimeValueTypeAdapter();
			}
			@Override
			public Adapter caseYearMonthValueType(YearMonthValueType object) {
				return createYearMonthValueTypeAdapter();
			}
			@Override
			public Adapter caseYearValueType(YearValueType object) {
				return createYearValueTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType <em>Bag Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BagValueType
	 * @generated
	 */
	public Adapter createBagValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType <em>Boolean Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.BooleanValueType
	 * @generated
	 */
	public Adapter createBooleanValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType <em>Combination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CombinationType
	 * @generated
	 */
	public Adapter createCombinationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType <em>Complex Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ComplexValueType
	 * @generated
	 */
	public Adapter createComplexValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType <em>Composite Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CompositeValueType
	 * @generated
	 */
	public Adapter createCompositeValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType <em>Condition Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ConditionElementType
	 * @generated
	 */
	public Adapter createConditionElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType <em>Controlled Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ControlledValueType
	 * @generated
	 */
	public Adapter createControlledValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType <em>Currency Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.CurrencyValueType
	 * @generated
	 */
	public Adapter createCurrencyValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType <em>Date Time Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateTimeValueType
	 * @generated
	 */
	public Adapter createDateTimeValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType <em>Date Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DateValueType
	 * @generated
	 */
	public Adapter createDateValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.EnvironmentType
	 * @generated
	 */
	public Adapter createEnvironmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType <em>File Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.FileValueType
	 * @generated
	 */
	public Adapter createFileValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType <em>Integer Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.IntegerValueType
	 * @generated
	 */
	public Adapter createIntegerValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType <em>Item Reference Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ItemReferenceValueType
	 * @generated
	 */
	public Adapter createItemReferenceValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType <em>Localized Text Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.LocalizedTextValueType
	 * @generated
	 */
	public Adapter createLocalizedTextValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType <em>Measure Qualified Number Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType
	 * @generated
	 */
	public Adapter createMeasureQualifiedNumberValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType <em>Measure Range Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureRangeValueType
	 * @generated
	 */
	public Adapter createMeasureRangeValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType <em>Measure Single Number Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureSingleNumberValueType
	 * @generated
	 */
	public Adapter createMeasureSingleNumberValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType <em>Measure Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureValueType
	 * @generated
	 */
	public Adapter createMeasureValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NullValueType <em>Null Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NullValueType
	 * @generated
	 */
	public Adapter createNullValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType <em>Numeric Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.NumericValueType
	 * @generated
	 */
	public Adapter createNumericValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType <em>One Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.OneOfType
	 * @generated
	 */
	public Adapter createOneOfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType <em>Presentation Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.PresentationValueType
	 * @generated
	 */
	public Adapter createPresentationValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType <em>Qualified Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType
	 * @generated
	 */
	public Adapter createQualifiedValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType <em>Rational Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RationalValueType
	 * @generated
	 */
	public Adapter createRationalValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType <em>Real Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.RealValueType
	 * @generated
	 */
	public Adapter createRealValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType <em>Sequence Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SequenceValueType
	 * @generated
	 */
	public Adapter createSequenceValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType <em>Set Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.SetValueType
	 * @generated
	 */
	public Adapter createSetValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType <em>String Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.StringValueType
	 * @generated
	 */
	public Adapter createStringValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType <em>Time Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.TimeValueType
	 * @generated
	 */
	public Adapter createTimeValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType <em>Year Month Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearMonthValueType
	 * @generated
	 */
	public Adapter createYearMonthValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType <em>Year Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.YearValueType
	 * @generated
	 */
	public Adapter createYearValueTypeAdapter() {
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

} //ValueAdapterFactory
