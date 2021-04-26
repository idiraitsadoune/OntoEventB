/**
 */
package pivotmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pivotmodel.CardinalityClass;
import pivotmodel.CardinalityRestrictedClass;
import pivotmodel.CaseOfClass;
import pivotmodel.ClassDefinition;
import pivotmodel.ClassType;
import pivotmodel.CollectionType;
import pivotmodel.CombinationClass;
import pivotmodel.ComplementClass;
import pivotmodel.ConditionProperty;
import pivotmodel.ContextDependentUnit;
import pivotmodel.ConversionBasedUnit;
import pivotmodel.CurrencyType;
import pivotmodel.DataTypeDefinition;
import pivotmodel.DependentProperty;
import pivotmodel.DerivedUnit;
import pivotmodel.DerivedUnitElement;
import pivotmodel.EnumeratedClass;
import pivotmodel.EnumeratedType;
import pivotmodel.ExistantialClass;
import pivotmodel.HasValueClass;
import pivotmodel.IntersectionClass;
import pivotmodel.MaxCardinalityClass;
import pivotmodel.MeasureType;
import pivotmodel.MinCardinalityClass;
import pivotmodel.NamedUnit;
import pivotmodel.NonStandardUnit;
import pivotmodel.NotNumericType;
import pivotmodel.NumberEnumeratedType;
import pivotmodel.NumericType;
import pivotmodel.Ontology;
import pivotmodel.PivotmodelFactory;
import pivotmodel.PivotmodelPackage;
import pivotmodel.PredefinedCollection;
import pivotmodel.PredefinedCurrency;
import pivotmodel.PredefinedType;
import pivotmodel.PrefixeType;
import pivotmodel.PrimitiveType;
import pivotmodel.PropertyDefinition;
import pivotmodel.RestrictedClass;
import pivotmodel.SimpleClass;
import pivotmodel.SimpleProperty;
import pivotmodel.SingleValue;
import pivotmodel.StandardUnit;
import pivotmodel.UnionClass;
import pivotmodel.UnitName;
import pivotmodel.UnitType;
import pivotmodel.UniversalClass;
import pivotmodel.ValueRestrictedClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PivotmodelPackageImpl extends EPackageImpl implements PivotmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseOfClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRestrictedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existantialClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasValueClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityRestrictedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxCardinalityClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minCardinalityClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intersectionClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notNumericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEnumeratedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonStandardUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionBasedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextDependentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedUnitElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum predefinedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum predefinedCollectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum predefinedCurrencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prefixeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitNameEEnum = null;

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
	 * @see pivotmodel.PivotmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PivotmodelPackageImpl() {
		super(eNS_URI, PivotmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PivotmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PivotmodelPackage init() {
		if (isInited) return (PivotmodelPackage)EPackage.Registry.INSTANCE.getEPackage(PivotmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPivotmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PivotmodelPackageImpl thePivotmodelPackage = registeredPivotmodelPackage instanceof PivotmodelPackageImpl ? (PivotmodelPackageImpl)registeredPivotmodelPackage : new PivotmodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePivotmodelPackage.createPackageContents();

		// Initialize created meta-data
		thePivotmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePivotmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PivotmodelPackage.eNS_URI, thePivotmodelPackage);
		return thePivotmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntology() {
		return ontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntology_Name() {
		return (EAttribute)ontologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntology_ContainedClasses() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntology_ContainedProperties() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOntology_ContainedDataTypes() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassDefinition() {
		return classDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassDefinition_Name() {
		return (EAttribute)classDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDefinition_SubClassOf() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDefinition_DisjointWith() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDefinition_EquivalentTo() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDefinition_DescribedBy() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleClass() {
		return simpleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyDefinition() {
		return propertyDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_Name() {
		return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_IsFunctional() {
		return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_IsSymmetric() {
		return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_IsTransitive() {
		return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_IsInverseFunctional() {
		return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyDefinition_Range() {
		return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyDefinition_Domain() {
		return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyDefinition_SubPropertyOf() {
		return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyDefinition_EquivalentTo() {
		return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyDefinition_InverseOf() {
		return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleProperty() {
		return simplePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTypeDefinition() {
		return dataTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTypeDefinition_Name() {
		return (EAttribute)dataTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveType_BasedOn() {
		return (EAttribute)primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaseOfClass() {
		return caseOfClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseOfClass_CaseOf() {
		return (EReference)caseOfClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseOfClass_ImportedProperties() {
		return (EReference)caseOfClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestrictedClass() {
		return restrictedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestrictedClass_OnProperty() {
		return (EReference)restrictedClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueRestrictedClass() {
		return valueRestrictedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueRestrictedClass_ToDataDefinition() {
		return (EReference)valueRestrictedClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversalClass() {
		return universalClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistantialClass() {
		return existantialClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasValueClass() {
		return hasValueClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinalityRestrictedClass() {
		return cardinalityRestrictedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaxCardinalityClass() {
		return maxCardinalityClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaxCardinalityClass_MaxCard() {
		return (EAttribute)maxCardinalityClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinCardinalityClass() {
		return minCardinalityClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinCardinalityClass_MinCard() {
		return (EAttribute)minCardinalityClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinalityClass() {
		return cardinalityClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinalityClass_Card() {
		return (EAttribute)cardinalityClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeratedClass() {
		return enumeratedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeratedClass_OneOf() {
		return (EReference)enumeratedClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCombinationClass() {
		return combinationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCombinationClass_CombinationOf() {
		return (EReference)combinationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnionClass() {
		return unionClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntersectionClass() {
		return intersectionClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplementClass() {
		return complementClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionProperty() {
		return conditionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependentProperty() {
		return dependentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependentProperty_DependsOn() {
		return (EReference)dependentPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotNumericType() {
		return notNumericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericType() {
		return numericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasureType() {
		return measureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasureType_Unit() {
		return (EReference)measureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrencyType() {
		return currencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurrencyType_Currency() {
		return (EAttribute)currencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassType() {
		return classTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassType_BasedOn() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollectionType() {
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionType_CollectionOf() {
		return (EReference)collectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionType_Is() {
		return (EAttribute)collectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleValue() {
		return singleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleValue_IsOfType() {
		return (EReference)singleValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeratedType() {
		return enumeratedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeratedType_Contains() {
		return (EReference)enumeratedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberEnumeratedType() {
		return numberEnumeratedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberEnumeratedType_Contains() {
		return (EAttribute)numberEnumeratedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitType() {
		return unitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedUnit() {
		return namedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedUnit_Exponent() {
		return (EAttribute)namedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerivedUnit() {
		return derivedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDerivedUnit_DerivedUnitElement() {
		return (EReference)derivedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNonStandardUnit() {
		return nonStandardUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonStandardUnit_Name() {
		return (EAttribute)nonStandardUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConversionBasedUnit() {
		return conversionBasedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConversionBasedUnit_ValueComponent() {
		return (EAttribute)conversionBasedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConversionBasedUnit_UnitComponent() {
		return (EReference)conversionBasedUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConversionBasedUnit_Name() {
		return (EAttribute)conversionBasedUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextDependentUnit() {
		return contextDependentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDependentUnit_Name() {
		return (EAttribute)contextDependentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardUnit() {
		return standardUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardUnit_Prefix() {
		return (EAttribute)standardUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardUnit_Name() {
		return (EAttribute)standardUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerivedUnitElement() {
		return derivedUnitElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDerivedUnitElement_Name() {
		return (EAttribute)derivedUnitElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDerivedUnitElement_Exponent() {
		return (EAttribute)derivedUnitElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDerivedUnitElement_Unit() {
		return (EReference)derivedUnitElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPredefinedType() {
		return predefinedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPredefinedCollection() {
		return predefinedCollectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPredefinedCurrency() {
		return predefinedCurrencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrefixeType() {
		return prefixeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitName() {
		return unitNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PivotmodelFactory getPivotmodelFactory() {
		return (PivotmodelFactory)getEFactoryInstance();
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
		ontologyEClass = createEClass(ONTOLOGY);
		createEAttribute(ontologyEClass, ONTOLOGY__NAME);
		createEReference(ontologyEClass, ONTOLOGY__CONTAINED_CLASSES);
		createEReference(ontologyEClass, ONTOLOGY__CONTAINED_PROPERTIES);
		createEReference(ontologyEClass, ONTOLOGY__CONTAINED_DATA_TYPES);

		classDefinitionEClass = createEClass(CLASS_DEFINITION);
		createEAttribute(classDefinitionEClass, CLASS_DEFINITION__NAME);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__SUB_CLASS_OF);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__DISJOINT_WITH);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__EQUIVALENT_TO);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__DESCRIBED_BY);

		simpleClassEClass = createEClass(SIMPLE_CLASS);

		propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__NAME);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__IS_FUNCTIONAL);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__IS_SYMMETRIC);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__IS_TRANSITIVE);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL);
		createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__RANGE);
		createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__SUB_PROPERTY_OF);
		createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__EQUIVALENT_TO);
		createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__INVERSE_OF);
		createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__DOMAIN);

		simplePropertyEClass = createEClass(SIMPLE_PROPERTY);

		dataTypeDefinitionEClass = createEClass(DATA_TYPE_DEFINITION);
		createEAttribute(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__NAME);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__BASED_ON);

		caseOfClassEClass = createEClass(CASE_OF_CLASS);
		createEReference(caseOfClassEClass, CASE_OF_CLASS__CASE_OF);
		createEReference(caseOfClassEClass, CASE_OF_CLASS__IMPORTED_PROPERTIES);

		restrictedClassEClass = createEClass(RESTRICTED_CLASS);
		createEReference(restrictedClassEClass, RESTRICTED_CLASS__ON_PROPERTY);

		valueRestrictedClassEClass = createEClass(VALUE_RESTRICTED_CLASS);
		createEReference(valueRestrictedClassEClass, VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION);

		universalClassEClass = createEClass(UNIVERSAL_CLASS);

		existantialClassEClass = createEClass(EXISTANTIAL_CLASS);

		hasValueClassEClass = createEClass(HAS_VALUE_CLASS);

		cardinalityRestrictedClassEClass = createEClass(CARDINALITY_RESTRICTED_CLASS);

		maxCardinalityClassEClass = createEClass(MAX_CARDINALITY_CLASS);
		createEAttribute(maxCardinalityClassEClass, MAX_CARDINALITY_CLASS__MAX_CARD);

		minCardinalityClassEClass = createEClass(MIN_CARDINALITY_CLASS);
		createEAttribute(minCardinalityClassEClass, MIN_CARDINALITY_CLASS__MIN_CARD);

		cardinalityClassEClass = createEClass(CARDINALITY_CLASS);
		createEAttribute(cardinalityClassEClass, CARDINALITY_CLASS__CARD);

		enumeratedClassEClass = createEClass(ENUMERATED_CLASS);
		createEReference(enumeratedClassEClass, ENUMERATED_CLASS__ONE_OF);

		combinationClassEClass = createEClass(COMBINATION_CLASS);
		createEReference(combinationClassEClass, COMBINATION_CLASS__COMBINATION_OF);

		unionClassEClass = createEClass(UNION_CLASS);

		intersectionClassEClass = createEClass(INTERSECTION_CLASS);

		complementClassEClass = createEClass(COMPLEMENT_CLASS);

		conditionPropertyEClass = createEClass(CONDITION_PROPERTY);

		dependentPropertyEClass = createEClass(DEPENDENT_PROPERTY);
		createEReference(dependentPropertyEClass, DEPENDENT_PROPERTY__DEPENDS_ON);

		notNumericTypeEClass = createEClass(NOT_NUMERIC_TYPE);

		numericTypeEClass = createEClass(NUMERIC_TYPE);

		measureTypeEClass = createEClass(MEASURE_TYPE);
		createEReference(measureTypeEClass, MEASURE_TYPE__UNIT);

		currencyTypeEClass = createEClass(CURRENCY_TYPE);
		createEAttribute(currencyTypeEClass, CURRENCY_TYPE__CURRENCY);

		classTypeEClass = createEClass(CLASS_TYPE);
		createEReference(classTypeEClass, CLASS_TYPE__BASED_ON);

		collectionTypeEClass = createEClass(COLLECTION_TYPE);
		createEReference(collectionTypeEClass, COLLECTION_TYPE__COLLECTION_OF);
		createEAttribute(collectionTypeEClass, COLLECTION_TYPE__IS);

		singleValueEClass = createEClass(SINGLE_VALUE);
		createEReference(singleValueEClass, SINGLE_VALUE__IS_OF_TYPE);

		enumeratedTypeEClass = createEClass(ENUMERATED_TYPE);
		createEReference(enumeratedTypeEClass, ENUMERATED_TYPE__CONTAINS);

		numberEnumeratedTypeEClass = createEClass(NUMBER_ENUMERATED_TYPE);
		createEAttribute(numberEnumeratedTypeEClass, NUMBER_ENUMERATED_TYPE__CONTAINS);

		unitTypeEClass = createEClass(UNIT_TYPE);

		namedUnitEClass = createEClass(NAMED_UNIT);
		createEAttribute(namedUnitEClass, NAMED_UNIT__EXPONENT);

		derivedUnitEClass = createEClass(DERIVED_UNIT);
		createEReference(derivedUnitEClass, DERIVED_UNIT__DERIVED_UNIT_ELEMENT);

		nonStandardUnitEClass = createEClass(NON_STANDARD_UNIT);
		createEAttribute(nonStandardUnitEClass, NON_STANDARD_UNIT__NAME);

		conversionBasedUnitEClass = createEClass(CONVERSION_BASED_UNIT);
		createEAttribute(conversionBasedUnitEClass, CONVERSION_BASED_UNIT__VALUE_COMPONENT);
		createEReference(conversionBasedUnitEClass, CONVERSION_BASED_UNIT__UNIT_COMPONENT);
		createEAttribute(conversionBasedUnitEClass, CONVERSION_BASED_UNIT__NAME);

		contextDependentUnitEClass = createEClass(CONTEXT_DEPENDENT_UNIT);
		createEAttribute(contextDependentUnitEClass, CONTEXT_DEPENDENT_UNIT__NAME);

		standardUnitEClass = createEClass(STANDARD_UNIT);
		createEAttribute(standardUnitEClass, STANDARD_UNIT__PREFIX);
		createEAttribute(standardUnitEClass, STANDARD_UNIT__NAME);

		derivedUnitElementEClass = createEClass(DERIVED_UNIT_ELEMENT);
		createEAttribute(derivedUnitElementEClass, DERIVED_UNIT_ELEMENT__NAME);
		createEAttribute(derivedUnitElementEClass, DERIVED_UNIT_ELEMENT__EXPONENT);
		createEReference(derivedUnitElementEClass, DERIVED_UNIT_ELEMENT__UNIT);

		// Create enums
		predefinedTypeEEnum = createEEnum(PREDEFINED_TYPE);
		predefinedCollectionEEnum = createEEnum(PREDEFINED_COLLECTION);
		predefinedCurrencyEEnum = createEEnum(PREDEFINED_CURRENCY);
		prefixeTypeEEnum = createEEnum(PREFIXE_TYPE);
		unitNameEEnum = createEEnum(UNIT_NAME);
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
		simpleClassEClass.getESuperTypes().add(this.getClassDefinition());
		simplePropertyEClass.getESuperTypes().add(this.getPropertyDefinition());
		primitiveTypeEClass.getESuperTypes().add(this.getDataTypeDefinition());
		caseOfClassEClass.getESuperTypes().add(this.getClassDefinition());
		restrictedClassEClass.getESuperTypes().add(this.getClassDefinition());
		valueRestrictedClassEClass.getESuperTypes().add(this.getRestrictedClass());
		universalClassEClass.getESuperTypes().add(this.getValueRestrictedClass());
		existantialClassEClass.getESuperTypes().add(this.getValueRestrictedClass());
		hasValueClassEClass.getESuperTypes().add(this.getValueRestrictedClass());
		cardinalityRestrictedClassEClass.getESuperTypes().add(this.getRestrictedClass());
		maxCardinalityClassEClass.getESuperTypes().add(this.getCardinalityRestrictedClass());
		minCardinalityClassEClass.getESuperTypes().add(this.getCardinalityRestrictedClass());
		cardinalityClassEClass.getESuperTypes().add(this.getCardinalityRestrictedClass());
		enumeratedClassEClass.getESuperTypes().add(this.getClassDefinition());
		combinationClassEClass.getESuperTypes().add(this.getClassDefinition());
		unionClassEClass.getESuperTypes().add(this.getCombinationClass());
		intersectionClassEClass.getESuperTypes().add(this.getCombinationClass());
		complementClassEClass.getESuperTypes().add(this.getCombinationClass());
		conditionPropertyEClass.getESuperTypes().add(this.getPropertyDefinition());
		dependentPropertyEClass.getESuperTypes().add(this.getPropertyDefinition());
		notNumericTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		numericTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		measureTypeEClass.getESuperTypes().add(this.getNumericType());
		currencyTypeEClass.getESuperTypes().add(this.getNumericType());
		classTypeEClass.getESuperTypes().add(this.getDataTypeDefinition());
		collectionTypeEClass.getESuperTypes().add(this.getDataTypeDefinition());
		singleValueEClass.getESuperTypes().add(this.getDataTypeDefinition());
		enumeratedTypeEClass.getESuperTypes().add(this.getDataTypeDefinition());
		numberEnumeratedTypeEClass.getESuperTypes().add(this.getDataTypeDefinition());
		namedUnitEClass.getESuperTypes().add(this.getUnitType());
		derivedUnitEClass.getESuperTypes().add(this.getUnitType());
		nonStandardUnitEClass.getESuperTypes().add(this.getNamedUnit());
		conversionBasedUnitEClass.getESuperTypes().add(this.getNamedUnit());
		contextDependentUnitEClass.getESuperTypes().add(this.getNamedUnit());
		standardUnitEClass.getESuperTypes().add(this.getNamedUnit());

		// Initialize classes, features, and operations; add parameters
		initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntology_Name(), ecorePackage.getEString(), "name", null, 1, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_ContainedClasses(), this.getClassDefinition(), null, "containedClasses", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_ContainedProperties(), this.getPropertyDefinition(), null, "containedProperties", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_ContainedDataTypes(), this.getDataTypeDefinition(), null, "containedDataTypes", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDefinitionEClass, ClassDefinition.class, "ClassDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_SubClassOf(), this.getClassDefinition(), null, "subClassOf", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_DisjointWith(), this.getClassDefinition(), null, "disjointWith", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_EquivalentTo(), this.getClassDefinition(), null, "equivalentTo", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_DescribedBy(), this.getPropertyDefinition(), null, "describedBy", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleClassEClass, SimpleClass.class, "SimpleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDefinition_IsFunctional(), ecorePackage.getEBoolean(), "isFunctional", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDefinition_IsSymmetric(), ecorePackage.getEBoolean(), "isSymmetric", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDefinition_IsTransitive(), ecorePackage.getEBoolean(), "isTransitive", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDefinition_IsInverseFunctional(), ecorePackage.getEBoolean(), "isInverseFunctional", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyDefinition_Range(), this.getDataTypeDefinition(), null, "range", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyDefinition_SubPropertyOf(), this.getPropertyDefinition(), null, "subPropertyOf", null, 0, -1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyDefinition_EquivalentTo(), this.getPropertyDefinition(), null, "equivalentTo", null, 0, -1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyDefinition_InverseOf(), this.getPropertyDefinition(), null, "inverseOf", null, 0, -1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyDefinition_Domain(), this.getClassDefinition(), null, "domain", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simplePropertyEClass, SimpleProperty.class, "SimpleProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeDefinitionEClass, DataTypeDefinition.class, "DataTypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTypeDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_BasedOn(), this.getPredefinedType(), "basedOn", null, 1, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseOfClassEClass, CaseOfClass.class, "CaseOfClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseOfClass_CaseOf(), this.getClassDefinition(), null, "caseOf", null, 1, -1, CaseOfClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseOfClass_ImportedProperties(), this.getPropertyDefinition(), null, "importedProperties", null, 0, -1, CaseOfClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictedClassEClass, RestrictedClass.class, "RestrictedClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestrictedClass_OnProperty(), this.getPropertyDefinition(), null, "onProperty", null, 1, 1, RestrictedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueRestrictedClassEClass, ValueRestrictedClass.class, "ValueRestrictedClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueRestrictedClass_ToDataDefinition(), this.getDataTypeDefinition(), null, "toDataDefinition", null, 1, 1, ValueRestrictedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universalClassEClass, UniversalClass.class, "UniversalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(existantialClassEClass, ExistantialClass.class, "ExistantialClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hasValueClassEClass, HasValueClass.class, "HasValueClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardinalityRestrictedClassEClass, CardinalityRestrictedClass.class, "CardinalityRestrictedClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxCardinalityClassEClass, MaxCardinalityClass.class, "MaxCardinalityClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxCardinalityClass_MaxCard(), ecorePackage.getEInt(), "maxCard", null, 1, 1, MaxCardinalityClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minCardinalityClassEClass, MinCardinalityClass.class, "MinCardinalityClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinCardinalityClass_MinCard(), ecorePackage.getEInt(), "minCard", null, 1, 1, MinCardinalityClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityClassEClass, CardinalityClass.class, "CardinalityClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalityClass_Card(), ecorePackage.getEInt(), "card", null, 1, 1, CardinalityClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedClassEClass, EnumeratedClass.class, "EnumeratedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedClass_OneOf(), this.getSingleValue(), null, "oneOf", null, 1, -1, EnumeratedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinationClassEClass, CombinationClass.class, "CombinationClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinationClass_CombinationOf(), this.getClassDefinition(), null, "combinationOf", null, 1, -1, CombinationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionClassEClass, UnionClass.class, "UnionClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intersectionClassEClass, IntersectionClass.class, "IntersectionClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complementClassEClass, ComplementClass.class, "ComplementClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionPropertyEClass, ConditionProperty.class, "ConditionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependentPropertyEClass, DependentProperty.class, "DependentProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependentProperty_DependsOn(), this.getPropertyDefinition(), null, "dependsOn", null, 1, -1, DependentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notNumericTypeEClass, NotNumericType.class, "NotNumericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericTypeEClass, NumericType.class, "NumericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measureTypeEClass, MeasureType.class, "MeasureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureType_Unit(), this.getUnitType(), null, "unit", null, 1, 1, MeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyTypeEClass, CurrencyType.class, "CurrencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrencyType_Currency(), this.getPredefinedCurrency(), "currency", null, 1, 1, CurrencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classTypeEClass, ClassType.class, "ClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassType_BasedOn(), this.getClassDefinition(), null, "basedOn", null, 1, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionType_CollectionOf(), this.getDataTypeDefinition(), null, "collectionOf", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionType_Is(), this.getPredefinedCollection(), "is", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleValueEClass, SingleValue.class, "SingleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleValue_IsOfType(), this.getDataTypeDefinition(), null, "isOfType", null, 1, 1, SingleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedTypeEClass, EnumeratedType.class, "EnumeratedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedType_Contains(), this.getSingleValue(), null, "contains", null, 1, -1, EnumeratedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberEnumeratedTypeEClass, NumberEnumeratedType.class, "NumberEnumeratedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberEnumeratedType_Contains(), ecorePackage.getEInt(), "contains", null, 1, -1, NumberEnumeratedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitTypeEClass, UnitType.class, "UnitType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedUnitEClass, NamedUnit.class, "NamedUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedUnit_Exponent(), ecorePackage.getEInt(), "exponent", null, 0, 1, NamedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedUnitEClass, DerivedUnit.class, "DerivedUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedUnit_DerivedUnitElement(), this.getDerivedUnitElement(), null, "derivedUnitElement", null, 1, -1, DerivedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonStandardUnitEClass, NonStandardUnit.class, "NonStandardUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonStandardUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, NonStandardUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversionBasedUnitEClass, ConversionBasedUnit.class, "ConversionBasedUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConversionBasedUnit_ValueComponent(), ecorePackage.getEInt(), "valueComponent", null, 1, 1, ConversionBasedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionBasedUnit_UnitComponent(), this.getUnitType(), null, "unitComponent", null, 1, 1, ConversionBasedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConversionBasedUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, ConversionBasedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextDependentUnitEClass, ContextDependentUnit.class, "ContextDependentUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextDependentUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextDependentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardUnitEClass, StandardUnit.class, "StandardUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardUnit_Prefix(), this.getPrefixeType(), "prefix", null, 0, 1, StandardUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardUnit_Name(), this.getUnitName(), "name", null, 1, 1, StandardUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedUnitElementEClass, DerivedUnitElement.class, "DerivedUnitElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivedUnitElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, DerivedUnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerivedUnitElement_Exponent(), ecorePackage.getEInt(), "exponent", null, 0, 1, DerivedUnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivedUnitElement_Unit(), this.getNamedUnit(), null, "unit", null, 1, 1, DerivedUnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(predefinedTypeEEnum, PredefinedType.class, "PredefinedType");
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.INTEGER);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.NATURAL);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.BOOLEAN);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.STRING);

		initEEnum(predefinedCollectionEEnum, PredefinedCollection.class, "PredefinedCollection");
		addEEnumLiteral(predefinedCollectionEEnum, PredefinedCollection.ARRAY);
		addEEnumLiteral(predefinedCollectionEEnum, PredefinedCollection.SET);
		addEEnumLiteral(predefinedCollectionEEnum, PredefinedCollection.BAG);
		addEEnumLiteral(predefinedCollectionEEnum, PredefinedCollection.LIST);

		initEEnum(predefinedCurrencyEEnum, PredefinedCurrency.class, "PredefinedCurrency");
		addEEnumLiteral(predefinedCurrencyEEnum, PredefinedCurrency.EUR);
		addEEnumLiteral(predefinedCurrencyEEnum, PredefinedCurrency.USD);
		addEEnumLiteral(predefinedCurrencyEEnum, PredefinedCurrency.SUR);
		addEEnumLiteral(predefinedCurrencyEEnum, PredefinedCurrency.JPY);
		addEEnumLiteral(predefinedCurrencyEEnum, PredefinedCurrency.CNY);
		addEEnumLiteral(predefinedCurrencyEEnum, PredefinedCurrency.CHF);

		initEEnum(prefixeTypeEEnum, PrefixeType.class, "PrefixeType");
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.EXA);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.PETA);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.TERA);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.GIGA);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.MEGA);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.KILO);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.HECTO);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.DECA);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.DECI);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.CENTI);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.MILLI);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.MICRO);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.NANO);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.PICO);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.FEMTO);
		addEEnumLiteral(prefixeTypeEEnum, PrefixeType.ATTO);

		initEEnum(unitNameEEnum, UnitName.class, "UnitName");
		addEEnumLiteral(unitNameEEnum, UnitName.METRE);
		addEEnumLiteral(unitNameEEnum, UnitName.GRAM);
		addEEnumLiteral(unitNameEEnum, UnitName.SECOND);
		addEEnumLiteral(unitNameEEnum, UnitName.AMPERE);
		addEEnumLiteral(unitNameEEnum, UnitName.KELVIN);
		addEEnumLiteral(unitNameEEnum, UnitName.MOLE);
		addEEnumLiteral(unitNameEEnum, UnitName.CANDELA);
		addEEnumLiteral(unitNameEEnum, UnitName.RADIAN);
		addEEnumLiteral(unitNameEEnum, UnitName.STERADIAN);
		addEEnumLiteral(unitNameEEnum, UnitName.HERTZ);
		addEEnumLiteral(unitNameEEnum, UnitName.NEWTON);
		addEEnumLiteral(unitNameEEnum, UnitName.PASCAL);
		addEEnumLiteral(unitNameEEnum, UnitName.JOULE);
		addEEnumLiteral(unitNameEEnum, UnitName.WATT);
		addEEnumLiteral(unitNameEEnum, UnitName.COULOMB);
		addEEnumLiteral(unitNameEEnum, UnitName.VOLT);
		addEEnumLiteral(unitNameEEnum, UnitName.FARAD);
		addEEnumLiteral(unitNameEEnum, UnitName.OHM);
		addEEnumLiteral(unitNameEEnum, UnitName.SIEMENS);
		addEEnumLiteral(unitNameEEnum, UnitName.WEBER);
		addEEnumLiteral(unitNameEEnum, UnitName.TESLA);
		addEEnumLiteral(unitNameEEnum, UnitName.HENRY);
		addEEnumLiteral(unitNameEEnum, UnitName.DEGREE_CELSIUS);
		addEEnumLiteral(unitNameEEnum, UnitName.LUMEN);
		addEEnumLiteral(unitNameEEnum, UnitName.LUX);
		addEEnumLiteral(unitNameEEnum, UnitName.BECQUEREL);
		addEEnumLiteral(unitNameEEnum, UnitName.GRAY);
		addEEnumLiteral(unitNameEEnum, UnitName.SIEVERT);

		// Create resource
		createResource(eNS_URI);
	}

} //PivotmodelPackageImpl
