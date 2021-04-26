/**
 */
package pivotmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pivotmodel.PivotmodelFactory
 * @model kind="package"
 * @generated
 */
public interface PivotmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pivotmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://PM/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PivotmodelPackage eINSTANCE = pivotmodel.impl.PivotmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link pivotmodel.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.OntologyImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contained Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__CONTAINED_CLASSES = 1;

	/**
	 * The feature id for the '<em><b>Contained Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__CONTAINED_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Contained Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__CONTAINED_DATA_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.ClassDefinitionImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getClassDefinition()
	 * @generated
	 */
	int CLASS_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__SUB_CLASS_OF = 1;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__DISJOINT_WITH = 2;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__EQUIVALENT_TO = 3;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION__DESCRIBED_BY = 4;

	/**
	 * The number of structural features of the '<em>Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.SimpleClassImpl <em>Simple Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.SimpleClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getSimpleClass()
	 * @generated
	 */
	int SIMPLE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS__NAME = CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS__SUB_CLASS_OF = CLASS_DEFINITION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS__DISJOINT_WITH = CLASS_DEFINITION__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS__EQUIVALENT_TO = CLASS_DEFINITION__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS__DESCRIBED_BY = CLASS_DEFINITION__DESCRIBED_BY;

	/**
	 * The number of structural features of the '<em>Simple Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS_FEATURE_COUNT = CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS_OPERATION_COUNT = CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.PropertyDefinitionImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getPropertyDefinition()
	 * @generated
	 */
	int PROPERTY_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__IS_FUNCTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__IS_SYMMETRIC = 2;

	/**
	 * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__IS_TRANSITIVE = 3;

	/**
	 * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__RANGE = 5;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__SUB_PROPERTY_OF = 6;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__EQUIVALENT_TO = 7;

	/**
	 * The feature id for the '<em><b>Inverse Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__INVERSE_OF = 8;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__DOMAIN = 9;

	/**
	 * The number of structural features of the '<em>Property Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Property Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.SimplePropertyImpl <em>Simple Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.SimplePropertyImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getSimpleProperty()
	 * @generated
	 */
	int SIMPLE_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__NAME = PROPERTY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__IS_FUNCTIONAL = PROPERTY_DEFINITION__IS_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__IS_SYMMETRIC = PROPERTY_DEFINITION__IS_SYMMETRIC;

	/**
	 * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__IS_TRANSITIVE = PROPERTY_DEFINITION__IS_TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__IS_INVERSE_FUNCTIONAL = PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__RANGE = PROPERTY_DEFINITION__RANGE;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__SUB_PROPERTY_OF = PROPERTY_DEFINITION__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__EQUIVALENT_TO = PROPERTY_DEFINITION__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Inverse Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__INVERSE_OF = PROPERTY_DEFINITION__INVERSE_OF;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY__DOMAIN = PROPERTY_DEFINITION__DOMAIN;

	/**
	 * The number of structural features of the '<em>Simple Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY_FEATURE_COUNT = PROPERTY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPERTY_OPERATION_COUNT = PROPERTY_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.DataTypeDefinitionImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getDataTypeDefinition()
	 * @generated
	 */
	int DATA_TYPE_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.PrimitiveTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = DATA_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__BASED_ON = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = DATA_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.CaseOfClassImpl <em>Case Of Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.CaseOfClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getCaseOfClass()
	 * @generated
	 */
	int CASE_OF_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OF_CLASS__NAME = CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OF_CLASS__SUB_CLASS_OF = CLASS_DEFINITION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OF_CLASS__DISJOINT_WITH = CLASS_DEFINITION__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OF_CLASS__EQUIVALENT_TO = CLASS_DEFINITION__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OF_CLASS__DESCRIBED_BY = CLASS_DEFINITION__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Case Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OF_CLASS__CASE_OF = CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OF_CLASS__IMPORTED_PROPERTIES = CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case Of Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OF_CLASS_FEATURE_COUNT = CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Case Of Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OF_CLASS_OPERATION_COUNT = CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.RestrictedClassImpl <em>Restricted Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.RestrictedClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getRestrictedClass()
	 * @generated
	 */
	int RESTRICTED_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_CLASS__NAME = CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_CLASS__SUB_CLASS_OF = CLASS_DEFINITION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_CLASS__DISJOINT_WITH = CLASS_DEFINITION__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_CLASS__EQUIVALENT_TO = CLASS_DEFINITION__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_CLASS__DESCRIBED_BY = CLASS_DEFINITION__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_CLASS__ON_PROPERTY = CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Restricted Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_CLASS_FEATURE_COUNT = CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Restricted Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_CLASS_OPERATION_COUNT = CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.ValueRestrictedClassImpl <em>Value Restricted Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.ValueRestrictedClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getValueRestrictedClass()
	 * @generated
	 */
	int VALUE_RESTRICTED_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTED_CLASS__NAME = RESTRICTED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTED_CLASS__SUB_CLASS_OF = RESTRICTED_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTED_CLASS__DISJOINT_WITH = RESTRICTED_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTED_CLASS__EQUIVALENT_TO = RESTRICTED_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTED_CLASS__DESCRIBED_BY = RESTRICTED_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTED_CLASS__ON_PROPERTY = RESTRICTED_CLASS__ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>To Data Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION = RESTRICTED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Restricted Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTED_CLASS_FEATURE_COUNT = RESTRICTED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Restricted Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTED_CLASS_OPERATION_COUNT = RESTRICTED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.UniversalClassImpl <em>Universal Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.UniversalClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getUniversalClass()
	 * @generated
	 */
	int UNIVERSAL_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CLASS__NAME = VALUE_RESTRICTED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CLASS__SUB_CLASS_OF = VALUE_RESTRICTED_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CLASS__DISJOINT_WITH = VALUE_RESTRICTED_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CLASS__EQUIVALENT_TO = VALUE_RESTRICTED_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CLASS__DESCRIBED_BY = VALUE_RESTRICTED_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CLASS__ON_PROPERTY = VALUE_RESTRICTED_CLASS__ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>To Data Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CLASS__TO_DATA_DEFINITION = VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION;

	/**
	 * The number of structural features of the '<em>Universal Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CLASS_FEATURE_COUNT = VALUE_RESTRICTED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Universal Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CLASS_OPERATION_COUNT = VALUE_RESTRICTED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.ExistantialClassImpl <em>Existantial Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.ExistantialClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getExistantialClass()
	 * @generated
	 */
	int EXISTANTIAL_CLASS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANTIAL_CLASS__NAME = VALUE_RESTRICTED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANTIAL_CLASS__SUB_CLASS_OF = VALUE_RESTRICTED_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANTIAL_CLASS__DISJOINT_WITH = VALUE_RESTRICTED_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANTIAL_CLASS__EQUIVALENT_TO = VALUE_RESTRICTED_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANTIAL_CLASS__DESCRIBED_BY = VALUE_RESTRICTED_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANTIAL_CLASS__ON_PROPERTY = VALUE_RESTRICTED_CLASS__ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>To Data Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANTIAL_CLASS__TO_DATA_DEFINITION = VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION;

	/**
	 * The number of structural features of the '<em>Existantial Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANTIAL_CLASS_FEATURE_COUNT = VALUE_RESTRICTED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Existantial Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANTIAL_CLASS_OPERATION_COUNT = VALUE_RESTRICTED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.HasValueClassImpl <em>Has Value Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.HasValueClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getHasValueClass()
	 * @generated
	 */
	int HAS_VALUE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_CLASS__NAME = VALUE_RESTRICTED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_CLASS__SUB_CLASS_OF = VALUE_RESTRICTED_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_CLASS__DISJOINT_WITH = VALUE_RESTRICTED_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_CLASS__EQUIVALENT_TO = VALUE_RESTRICTED_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_CLASS__DESCRIBED_BY = VALUE_RESTRICTED_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_CLASS__ON_PROPERTY = VALUE_RESTRICTED_CLASS__ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>To Data Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_CLASS__TO_DATA_DEFINITION = VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION;

	/**
	 * The number of structural features of the '<em>Has Value Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_CLASS_FEATURE_COUNT = VALUE_RESTRICTED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Has Value Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_CLASS_OPERATION_COUNT = VALUE_RESTRICTED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.CardinalityRestrictedClassImpl <em>Cardinality Restricted Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.CardinalityRestrictedClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getCardinalityRestrictedClass()
	 * @generated
	 */
	int CARDINALITY_RESTRICTED_CLASS = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTED_CLASS__NAME = RESTRICTED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTED_CLASS__SUB_CLASS_OF = RESTRICTED_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTED_CLASS__DISJOINT_WITH = RESTRICTED_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTED_CLASS__EQUIVALENT_TO = RESTRICTED_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTED_CLASS__DESCRIBED_BY = RESTRICTED_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTED_CLASS__ON_PROPERTY = RESTRICTED_CLASS__ON_PROPERTY;

	/**
	 * The number of structural features of the '<em>Cardinality Restricted Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTED_CLASS_FEATURE_COUNT = RESTRICTED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cardinality Restricted Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTED_CLASS_OPERATION_COUNT = RESTRICTED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.MaxCardinalityClassImpl <em>Max Cardinality Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.MaxCardinalityClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getMaxCardinalityClass()
	 * @generated
	 */
	int MAX_CARDINALITY_CLASS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_CLASS__NAME = CARDINALITY_RESTRICTED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_CLASS__SUB_CLASS_OF = CARDINALITY_RESTRICTED_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_CLASS__DISJOINT_WITH = CARDINALITY_RESTRICTED_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_CLASS__EQUIVALENT_TO = CARDINALITY_RESTRICTED_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_CLASS__DESCRIBED_BY = CARDINALITY_RESTRICTED_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_CLASS__ON_PROPERTY = CARDINALITY_RESTRICTED_CLASS__ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>Max Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_CLASS__MAX_CARD = CARDINALITY_RESTRICTED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Cardinality Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_CLASS_FEATURE_COUNT = CARDINALITY_RESTRICTED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Cardinality Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_CLASS_OPERATION_COUNT = CARDINALITY_RESTRICTED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.MinCardinalityClassImpl <em>Min Cardinality Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.MinCardinalityClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getMinCardinalityClass()
	 * @generated
	 */
	int MIN_CARDINALITY_CLASS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_CLASS__NAME = CARDINALITY_RESTRICTED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_CLASS__SUB_CLASS_OF = CARDINALITY_RESTRICTED_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_CLASS__DISJOINT_WITH = CARDINALITY_RESTRICTED_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_CLASS__EQUIVALENT_TO = CARDINALITY_RESTRICTED_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_CLASS__DESCRIBED_BY = CARDINALITY_RESTRICTED_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_CLASS__ON_PROPERTY = CARDINALITY_RESTRICTED_CLASS__ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>Min Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_CLASS__MIN_CARD = CARDINALITY_RESTRICTED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Cardinality Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_CLASS_FEATURE_COUNT = CARDINALITY_RESTRICTED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Cardinality Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_CLASS_OPERATION_COUNT = CARDINALITY_RESTRICTED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.CardinalityClassImpl <em>Cardinality Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.CardinalityClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getCardinalityClass()
	 * @generated
	 */
	int CARDINALITY_CLASS = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CLASS__NAME = CARDINALITY_RESTRICTED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CLASS__SUB_CLASS_OF = CARDINALITY_RESTRICTED_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CLASS__DISJOINT_WITH = CARDINALITY_RESTRICTED_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CLASS__EQUIVALENT_TO = CARDINALITY_RESTRICTED_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CLASS__DESCRIBED_BY = CARDINALITY_RESTRICTED_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CLASS__ON_PROPERTY = CARDINALITY_RESTRICTED_CLASS__ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CLASS__CARD = CARDINALITY_RESTRICTED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cardinality Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CLASS_FEATURE_COUNT = CARDINALITY_RESTRICTED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cardinality Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CLASS_OPERATION_COUNT = CARDINALITY_RESTRICTED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.EnumeratedClassImpl <em>Enumerated Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.EnumeratedClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getEnumeratedClass()
	 * @generated
	 */
	int ENUMERATED_CLASS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__NAME = CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__SUB_CLASS_OF = CLASS_DEFINITION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__DISJOINT_WITH = CLASS_DEFINITION__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__EQUIVALENT_TO = CLASS_DEFINITION__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__DESCRIBED_BY = CLASS_DEFINITION__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__ONE_OF = CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS_FEATURE_COUNT = CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS_OPERATION_COUNT = CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.CombinationClassImpl <em>Combination Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.CombinationClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getCombinationClass()
	 * @generated
	 */
	int COMBINATION_CLASS = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CLASS__NAME = CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CLASS__SUB_CLASS_OF = CLASS_DEFINITION__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CLASS__DISJOINT_WITH = CLASS_DEFINITION__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CLASS__EQUIVALENT_TO = CLASS_DEFINITION__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CLASS__DESCRIBED_BY = CLASS_DEFINITION__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Combination Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CLASS__COMBINATION_OF = CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combination Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CLASS_FEATURE_COUNT = CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Combination Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CLASS_OPERATION_COUNT = CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.UnionClassImpl <em>Union Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.UnionClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getUnionClass()
	 * @generated
	 */
	int UNION_CLASS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__NAME = COMBINATION_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__SUB_CLASS_OF = COMBINATION_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__DISJOINT_WITH = COMBINATION_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__EQUIVALENT_TO = COMBINATION_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__DESCRIBED_BY = COMBINATION_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Combination Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__COMBINATION_OF = COMBINATION_CLASS__COMBINATION_OF;

	/**
	 * The number of structural features of the '<em>Union Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS_FEATURE_COUNT = COMBINATION_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Union Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS_OPERATION_COUNT = COMBINATION_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.IntersectionClassImpl <em>Intersection Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.IntersectionClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getIntersectionClass()
	 * @generated
	 */
	int INTERSECTION_CLASS = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__NAME = COMBINATION_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__SUB_CLASS_OF = COMBINATION_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__DISJOINT_WITH = COMBINATION_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__EQUIVALENT_TO = COMBINATION_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__DESCRIBED_BY = COMBINATION_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Combination Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__COMBINATION_OF = COMBINATION_CLASS__COMBINATION_OF;

	/**
	 * The number of structural features of the '<em>Intersection Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS_FEATURE_COUNT = COMBINATION_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intersection Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS_OPERATION_COUNT = COMBINATION_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.ComplementClassImpl <em>Complement Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.ComplementClassImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getComplementClass()
	 * @generated
	 */
	int COMPLEMENT_CLASS = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__NAME = COMBINATION_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__SUB_CLASS_OF = COMBINATION_CLASS__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__DISJOINT_WITH = COMBINATION_CLASS__DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__EQUIVALENT_TO = COMBINATION_CLASS__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__DESCRIBED_BY = COMBINATION_CLASS__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Combination Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__COMBINATION_OF = COMBINATION_CLASS__COMBINATION_OF;

	/**
	 * The number of structural features of the '<em>Complement Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS_FEATURE_COUNT = COMBINATION_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complement Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS_OPERATION_COUNT = COMBINATION_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.ConditionPropertyImpl <em>Condition Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.ConditionPropertyImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getConditionProperty()
	 * @generated
	 */
	int CONDITION_PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__NAME = PROPERTY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__IS_FUNCTIONAL = PROPERTY_DEFINITION__IS_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__IS_SYMMETRIC = PROPERTY_DEFINITION__IS_SYMMETRIC;

	/**
	 * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__IS_TRANSITIVE = PROPERTY_DEFINITION__IS_TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__IS_INVERSE_FUNCTIONAL = PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__RANGE = PROPERTY_DEFINITION__RANGE;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__SUB_PROPERTY_OF = PROPERTY_DEFINITION__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__EQUIVALENT_TO = PROPERTY_DEFINITION__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Inverse Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__INVERSE_OF = PROPERTY_DEFINITION__INVERSE_OF;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY__DOMAIN = PROPERTY_DEFINITION__DOMAIN;

	/**
	 * The number of structural features of the '<em>Condition Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY_FEATURE_COUNT = PROPERTY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PROPERTY_OPERATION_COUNT = PROPERTY_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.DependentPropertyImpl <em>Dependent Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.DependentPropertyImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getDependentProperty()
	 * @generated
	 */
	int DEPENDENT_PROPERTY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__NAME = PROPERTY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__IS_FUNCTIONAL = PROPERTY_DEFINITION__IS_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__IS_SYMMETRIC = PROPERTY_DEFINITION__IS_SYMMETRIC;

	/**
	 * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__IS_TRANSITIVE = PROPERTY_DEFINITION__IS_TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__IS_INVERSE_FUNCTIONAL = PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__RANGE = PROPERTY_DEFINITION__RANGE;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__SUB_PROPERTY_OF = PROPERTY_DEFINITION__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__EQUIVALENT_TO = PROPERTY_DEFINITION__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Inverse Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__INVERSE_OF = PROPERTY_DEFINITION__INVERSE_OF;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__DOMAIN = PROPERTY_DEFINITION__DOMAIN;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY__DEPENDS_ON = PROPERTY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dependent Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY_FEATURE_COUNT = PROPERTY_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dependent Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_PROPERTY_OPERATION_COUNT = PROPERTY_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.NotNumericTypeImpl <em>Not Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.NotNumericTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getNotNumericType()
	 * @generated
	 */
	int NOT_NUMERIC_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NUMERIC_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NUMERIC_TYPE__BASED_ON = PRIMITIVE_TYPE__BASED_ON;

	/**
	 * The number of structural features of the '<em>Not Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NUMERIC_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NUMERIC_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.NumericTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__BASED_ON = PRIMITIVE_TYPE__BASED_ON;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.MeasureTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getMeasureType()
	 * @generated
	 */
	int MEASURE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__NAME = NUMERIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__BASED_ON = NUMERIC_TYPE__BASED_ON;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__UNIT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.CurrencyTypeImpl <em>Currency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.CurrencyTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getCurrencyType()
	 * @generated
	 */
	int CURRENCY_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_TYPE__NAME = NUMERIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_TYPE__BASED_ON = NUMERIC_TYPE__BASED_ON;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_TYPE__CURRENCY = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Currency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Currency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.ClassTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__NAME = DATA_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__BASED_ON = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_OPERATION_COUNT = DATA_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.CollectionTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__NAME = DATA_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Collection Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__COLLECTION_OF = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__IS = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_OPERATION_COUNT = DATA_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.SingleValueImpl <em>Single Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.SingleValueImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getSingleValue()
	 * @generated
	 */
	int SINGLE_VALUE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__NAME = DATA_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__IS_OF_TYPE = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_OPERATION_COUNT = DATA_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.EnumeratedTypeImpl <em>Enumerated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.EnumeratedTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getEnumeratedType()
	 * @generated
	 */
	int ENUMERATED_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__NAME = DATA_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE__CONTAINS = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_OPERATION_COUNT = DATA_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.NumberEnumeratedTypeImpl <em>Number Enumerated Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.NumberEnumeratedTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getNumberEnumeratedType()
	 * @generated
	 */
	int NUMBER_ENUMERATED_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ENUMERATED_TYPE__NAME = DATA_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ENUMERATED_TYPE__CONTAINS = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Enumerated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ENUMERATED_TYPE_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Enumerated Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ENUMERATED_TYPE_OPERATION_COUNT = DATA_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.UnitTypeImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 33;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.NamedUnitImpl <em>Named Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.NamedUnitImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getNamedUnit()
	 * @generated
	 */
	int NAMED_UNIT = 34;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_UNIT__EXPONENT = UNIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_UNIT_FEATURE_COUNT = UNIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_UNIT_OPERATION_COUNT = UNIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.DerivedUnitImpl <em>Derived Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.DerivedUnitImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getDerivedUnit()
	 * @generated
	 */
	int DERIVED_UNIT = 35;

	/**
	 * The feature id for the '<em><b>Derived Unit Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__DERIVED_UNIT_ELEMENT = UNIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_FEATURE_COUNT = UNIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_OPERATION_COUNT = UNIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.NonStandardUnitImpl <em>Non Standard Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.NonStandardUnitImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getNonStandardUnit()
	 * @generated
	 */
	int NON_STANDARD_UNIT = 36;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_UNIT__EXPONENT = NAMED_UNIT__EXPONENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_UNIT__NAME = NAMED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Standard Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_UNIT_FEATURE_COUNT = NAMED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Standard Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARD_UNIT_OPERATION_COUNT = NAMED_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.ConversionBasedUnitImpl <em>Conversion Based Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.ConversionBasedUnitImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getConversionBasedUnit()
	 * @generated
	 */
	int CONVERSION_BASED_UNIT = 37;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__EXPONENT = NAMED_UNIT__EXPONENT;

	/**
	 * The feature id for the '<em><b>Value Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__VALUE_COMPONENT = NAMED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__UNIT_COMPONENT = NAMED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__NAME = NAMED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conversion Based Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT_FEATURE_COUNT = NAMED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conversion Based Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT_OPERATION_COUNT = NAMED_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.ContextDependentUnitImpl <em>Context Dependent Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.ContextDependentUnitImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getContextDependentUnit()
	 * @generated
	 */
	int CONTEXT_DEPENDENT_UNIT = 38;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_UNIT__EXPONENT = NAMED_UNIT__EXPONENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_UNIT__NAME = NAMED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Dependent Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_UNIT_FEATURE_COUNT = NAMED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Context Dependent Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_UNIT_OPERATION_COUNT = NAMED_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.StandardUnitImpl <em>Standard Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.StandardUnitImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getStandardUnit()
	 * @generated
	 */
	int STANDARD_UNIT = 39;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_UNIT__EXPONENT = NAMED_UNIT__EXPONENT;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_UNIT__PREFIX = NAMED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_UNIT__NAME = NAMED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Standard Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_UNIT_FEATURE_COUNT = NAMED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Standard Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_UNIT_OPERATION_COUNT = NAMED_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pivotmodel.impl.DerivedUnitElementImpl <em>Derived Unit Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.impl.DerivedUnitElementImpl
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getDerivedUnitElement()
	 * @generated
	 */
	int DERIVED_UNIT_ELEMENT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_ELEMENT__EXPONENT = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_ELEMENT__UNIT = 2;

	/**
	 * The number of structural features of the '<em>Derived Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Derived Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pivotmodel.PredefinedType <em>Predefined Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.PredefinedType
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getPredefinedType()
	 * @generated
	 */
	int PREDEFINED_TYPE = 41;

	/**
	 * The meta object id for the '{@link pivotmodel.PredefinedCollection <em>Predefined Collection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.PredefinedCollection
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getPredefinedCollection()
	 * @generated
	 */
	int PREDEFINED_COLLECTION = 42;

	/**
	 * The meta object id for the '{@link pivotmodel.PredefinedCurrency <em>Predefined Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.PredefinedCurrency
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getPredefinedCurrency()
	 * @generated
	 */
	int PREDEFINED_CURRENCY = 43;


	/**
	 * The meta object id for the '{@link pivotmodel.PrefixeType <em>Prefixe Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.PrefixeType
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getPrefixeType()
	 * @generated
	 */
	int PREFIXE_TYPE = 44;

	/**
	 * The meta object id for the '{@link pivotmodel.UnitName <em>Unit Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pivotmodel.UnitName
	 * @see pivotmodel.impl.PivotmodelPackageImpl#getUnitName()
	 * @generated
	 */
	int UNIT_NAME = 45;


	/**
	 * Returns the meta object for class '{@link pivotmodel.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see pivotmodel.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.Ontology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pivotmodel.Ontology#getName()
	 * @see #getOntology()
	 * @generated
	 */
	EAttribute getOntology_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pivotmodel.Ontology#getContainedClasses <em>Contained Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Classes</em>'.
	 * @see pivotmodel.Ontology#getContainedClasses()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_ContainedClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link pivotmodel.Ontology#getContainedProperties <em>Contained Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Properties</em>'.
	 * @see pivotmodel.Ontology#getContainedProperties()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_ContainedProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link pivotmodel.Ontology#getContainedDataTypes <em>Contained Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Data Types</em>'.
	 * @see pivotmodel.Ontology#getContainedDataTypes()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_ContainedDataTypes();

	/**
	 * Returns the meta object for class '{@link pivotmodel.ClassDefinition <em>Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Definition</em>'.
	 * @see pivotmodel.ClassDefinition
	 * @generated
	 */
	EClass getClassDefinition();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.ClassDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pivotmodel.ClassDefinition#getName()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EAttribute getClassDefinition_Name();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.ClassDefinition#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Class Of</em>'.
	 * @see pivotmodel.ClassDefinition#getSubClassOf()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EReference getClassDefinition_SubClassOf();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.ClassDefinition#getDisjointWith <em>Disjoint With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjoint With</em>'.
	 * @see pivotmodel.ClassDefinition#getDisjointWith()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EReference getClassDefinition_DisjointWith();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.ClassDefinition#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent To</em>'.
	 * @see pivotmodel.ClassDefinition#getEquivalentTo()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EReference getClassDefinition_EquivalentTo();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.ClassDefinition#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Described By</em>'.
	 * @see pivotmodel.ClassDefinition#getDescribedBy()
	 * @see #getClassDefinition()
	 * @generated
	 */
	EReference getClassDefinition_DescribedBy();

	/**
	 * Returns the meta object for class '{@link pivotmodel.SimpleClass <em>Simple Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Class</em>'.
	 * @see pivotmodel.SimpleClass
	 * @generated
	 */
	EClass getSimpleClass();

	/**
	 * Returns the meta object for class '{@link pivotmodel.PropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Definition</em>'.
	 * @see pivotmodel.PropertyDefinition
	 * @generated
	 */
	EClass getPropertyDefinition();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.PropertyDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pivotmodel.PropertyDefinition#getName()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.PropertyDefinition#isIsFunctional <em>Is Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Functional</em>'.
	 * @see pivotmodel.PropertyDefinition#isIsFunctional()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_IsFunctional();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.PropertyDefinition#isIsSymmetric <em>Is Symmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Symmetric</em>'.
	 * @see pivotmodel.PropertyDefinition#isIsSymmetric()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_IsSymmetric();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.PropertyDefinition#isIsTransitive <em>Is Transitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Transitive</em>'.
	 * @see pivotmodel.PropertyDefinition#isIsTransitive()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_IsTransitive();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.PropertyDefinition#isIsInverseFunctional <em>Is Inverse Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inverse Functional</em>'.
	 * @see pivotmodel.PropertyDefinition#isIsInverseFunctional()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_IsInverseFunctional();

	/**
	 * Returns the meta object for the reference '{@link pivotmodel.PropertyDefinition#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see pivotmodel.PropertyDefinition#getRange()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_Range();

	/**
	 * Returns the meta object for the reference '{@link pivotmodel.PropertyDefinition#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see pivotmodel.PropertyDefinition#getDomain()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_Domain();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.PropertyDefinition#getSubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Property Of</em>'.
	 * @see pivotmodel.PropertyDefinition#getSubPropertyOf()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_SubPropertyOf();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.PropertyDefinition#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent To</em>'.
	 * @see pivotmodel.PropertyDefinition#getEquivalentTo()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_EquivalentTo();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.PropertyDefinition#getInverseOf <em>Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inverse Of</em>'.
	 * @see pivotmodel.PropertyDefinition#getInverseOf()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_InverseOf();

	/**
	 * Returns the meta object for class '{@link pivotmodel.SimpleProperty <em>Simple Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Property</em>'.
	 * @see pivotmodel.SimpleProperty
	 * @generated
	 */
	EClass getSimpleProperty();

	/**
	 * Returns the meta object for class '{@link pivotmodel.DataTypeDefinition <em>Data Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Definition</em>'.
	 * @see pivotmodel.DataTypeDefinition
	 * @generated
	 */
	EClass getDataTypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.DataTypeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pivotmodel.DataTypeDefinition#getName()
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	EAttribute getDataTypeDefinition_Name();

	/**
	 * Returns the meta object for class '{@link pivotmodel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see pivotmodel.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.PrimitiveType#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Based On</em>'.
	 * @see pivotmodel.PrimitiveType#getBasedOn()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_BasedOn();

	/**
	 * Returns the meta object for class '{@link pivotmodel.CaseOfClass <em>Case Of Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Of Class</em>'.
	 * @see pivotmodel.CaseOfClass
	 * @generated
	 */
	EClass getCaseOfClass();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.CaseOfClass#getCaseOf <em>Case Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Case Of</em>'.
	 * @see pivotmodel.CaseOfClass#getCaseOf()
	 * @see #getCaseOfClass()
	 * @generated
	 */
	EReference getCaseOfClass_CaseOf();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.CaseOfClass#getImportedProperties <em>Imported Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Properties</em>'.
	 * @see pivotmodel.CaseOfClass#getImportedProperties()
	 * @see #getCaseOfClass()
	 * @generated
	 */
	EReference getCaseOfClass_ImportedProperties();

	/**
	 * Returns the meta object for class '{@link pivotmodel.RestrictedClass <em>Restricted Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricted Class</em>'.
	 * @see pivotmodel.RestrictedClass
	 * @generated
	 */
	EClass getRestrictedClass();

	/**
	 * Returns the meta object for the reference '{@link pivotmodel.RestrictedClass#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Property</em>'.
	 * @see pivotmodel.RestrictedClass#getOnProperty()
	 * @see #getRestrictedClass()
	 * @generated
	 */
	EReference getRestrictedClass_OnProperty();

	/**
	 * Returns the meta object for class '{@link pivotmodel.ValueRestrictedClass <em>Value Restricted Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Restricted Class</em>'.
	 * @see pivotmodel.ValueRestrictedClass
	 * @generated
	 */
	EClass getValueRestrictedClass();

	/**
	 * Returns the meta object for the reference '{@link pivotmodel.ValueRestrictedClass#getToDataDefinition <em>To Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Data Definition</em>'.
	 * @see pivotmodel.ValueRestrictedClass#getToDataDefinition()
	 * @see #getValueRestrictedClass()
	 * @generated
	 */
	EReference getValueRestrictedClass_ToDataDefinition();

	/**
	 * Returns the meta object for class '{@link pivotmodel.UniversalClass <em>Universal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universal Class</em>'.
	 * @see pivotmodel.UniversalClass
	 * @generated
	 */
	EClass getUniversalClass();

	/**
	 * Returns the meta object for class '{@link pivotmodel.ExistantialClass <em>Existantial Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existantial Class</em>'.
	 * @see pivotmodel.ExistantialClass
	 * @generated
	 */
	EClass getExistantialClass();

	/**
	 * Returns the meta object for class '{@link pivotmodel.HasValueClass <em>Has Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Value Class</em>'.
	 * @see pivotmodel.HasValueClass
	 * @generated
	 */
	EClass getHasValueClass();

	/**
	 * Returns the meta object for class '{@link pivotmodel.CardinalityRestrictedClass <em>Cardinality Restricted Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Restricted Class</em>'.
	 * @see pivotmodel.CardinalityRestrictedClass
	 * @generated
	 */
	EClass getCardinalityRestrictedClass();

	/**
	 * Returns the meta object for class '{@link pivotmodel.MaxCardinalityClass <em>Max Cardinality Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Cardinality Class</em>'.
	 * @see pivotmodel.MaxCardinalityClass
	 * @generated
	 */
	EClass getMaxCardinalityClass();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.MaxCardinalityClass#getMaxCard <em>Max Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Card</em>'.
	 * @see pivotmodel.MaxCardinalityClass#getMaxCard()
	 * @see #getMaxCardinalityClass()
	 * @generated
	 */
	EAttribute getMaxCardinalityClass_MaxCard();

	/**
	 * Returns the meta object for class '{@link pivotmodel.MinCardinalityClass <em>Min Cardinality Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Cardinality Class</em>'.
	 * @see pivotmodel.MinCardinalityClass
	 * @generated
	 */
	EClass getMinCardinalityClass();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.MinCardinalityClass#getMinCard <em>Min Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Card</em>'.
	 * @see pivotmodel.MinCardinalityClass#getMinCard()
	 * @see #getMinCardinalityClass()
	 * @generated
	 */
	EAttribute getMinCardinalityClass_MinCard();

	/**
	 * Returns the meta object for class '{@link pivotmodel.CardinalityClass <em>Cardinality Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Class</em>'.
	 * @see pivotmodel.CardinalityClass
	 * @generated
	 */
	EClass getCardinalityClass();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.CardinalityClass#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card</em>'.
	 * @see pivotmodel.CardinalityClass#getCard()
	 * @see #getCardinalityClass()
	 * @generated
	 */
	EAttribute getCardinalityClass_Card();

	/**
	 * Returns the meta object for class '{@link pivotmodel.EnumeratedClass <em>Enumerated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Class</em>'.
	 * @see pivotmodel.EnumeratedClass
	 * @generated
	 */
	EClass getEnumeratedClass();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.EnumeratedClass#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>One Of</em>'.
	 * @see pivotmodel.EnumeratedClass#getOneOf()
	 * @see #getEnumeratedClass()
	 * @generated
	 */
	EReference getEnumeratedClass_OneOf();

	/**
	 * Returns the meta object for class '{@link pivotmodel.CombinationClass <em>Combination Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combination Class</em>'.
	 * @see pivotmodel.CombinationClass
	 * @generated
	 */
	EClass getCombinationClass();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.CombinationClass#getCombinationOf <em>Combination Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combination Of</em>'.
	 * @see pivotmodel.CombinationClass#getCombinationOf()
	 * @see #getCombinationClass()
	 * @generated
	 */
	EReference getCombinationClass_CombinationOf();

	/**
	 * Returns the meta object for class '{@link pivotmodel.UnionClass <em>Union Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Class</em>'.
	 * @see pivotmodel.UnionClass
	 * @generated
	 */
	EClass getUnionClass();

	/**
	 * Returns the meta object for class '{@link pivotmodel.IntersectionClass <em>Intersection Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersection Class</em>'.
	 * @see pivotmodel.IntersectionClass
	 * @generated
	 */
	EClass getIntersectionClass();

	/**
	 * Returns the meta object for class '{@link pivotmodel.ComplementClass <em>Complement Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complement Class</em>'.
	 * @see pivotmodel.ComplementClass
	 * @generated
	 */
	EClass getComplementClass();

	/**
	 * Returns the meta object for class '{@link pivotmodel.ConditionProperty <em>Condition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Property</em>'.
	 * @see pivotmodel.ConditionProperty
	 * @generated
	 */
	EClass getConditionProperty();

	/**
	 * Returns the meta object for class '{@link pivotmodel.DependentProperty <em>Dependent Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Property</em>'.
	 * @see pivotmodel.DependentProperty
	 * @generated
	 */
	EClass getDependentProperty();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.DependentProperty#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see pivotmodel.DependentProperty#getDependsOn()
	 * @see #getDependentProperty()
	 * @generated
	 */
	EReference getDependentProperty_DependsOn();

	/**
	 * Returns the meta object for class '{@link pivotmodel.NotNumericType <em>Not Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Numeric Type</em>'.
	 * @see pivotmodel.NotNumericType
	 * @generated
	 */
	EClass getNotNumericType();

	/**
	 * Returns the meta object for class '{@link pivotmodel.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see pivotmodel.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for class '{@link pivotmodel.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Type</em>'.
	 * @see pivotmodel.MeasureType
	 * @generated
	 */
	EClass getMeasureType();

	/**
	 * Returns the meta object for the containment reference '{@link pivotmodel.MeasureType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see pivotmodel.MeasureType#getUnit()
	 * @see #getMeasureType()
	 * @generated
	 */
	EReference getMeasureType_Unit();

	/**
	 * Returns the meta object for class '{@link pivotmodel.CurrencyType <em>Currency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Type</em>'.
	 * @see pivotmodel.CurrencyType
	 * @generated
	 */
	EClass getCurrencyType();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.CurrencyType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see pivotmodel.CurrencyType#getCurrency()
	 * @see #getCurrencyType()
	 * @generated
	 */
	EAttribute getCurrencyType_Currency();

	/**
	 * Returns the meta object for class '{@link pivotmodel.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see pivotmodel.ClassType
	 * @generated
	 */
	EClass getClassType();

	/**
	 * Returns the meta object for the reference '{@link pivotmodel.ClassType#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Based On</em>'.
	 * @see pivotmodel.ClassType#getBasedOn()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_BasedOn();

	/**
	 * Returns the meta object for class '{@link pivotmodel.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see pivotmodel.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the reference '{@link pivotmodel.CollectionType#getCollectionOf <em>Collection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection Of</em>'.
	 * @see pivotmodel.CollectionType#getCollectionOf()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_CollectionOf();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.CollectionType#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is</em>'.
	 * @see pivotmodel.CollectionType#getIs()
	 * @see #getCollectionType()
	 * @generated
	 */
	EAttribute getCollectionType_Is();

	/**
	 * Returns the meta object for class '{@link pivotmodel.SingleValue <em>Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Value</em>'.
	 * @see pivotmodel.SingleValue
	 * @generated
	 */
	EClass getSingleValue();

	/**
	 * Returns the meta object for the reference '{@link pivotmodel.SingleValue#getIsOfType <em>Is Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Of Type</em>'.
	 * @see pivotmodel.SingleValue#getIsOfType()
	 * @see #getSingleValue()
	 * @generated
	 */
	EReference getSingleValue_IsOfType();

	/**
	 * Returns the meta object for class '{@link pivotmodel.EnumeratedType <em>Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Type</em>'.
	 * @see pivotmodel.EnumeratedType
	 * @generated
	 */
	EClass getEnumeratedType();

	/**
	 * Returns the meta object for the reference list '{@link pivotmodel.EnumeratedType#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see pivotmodel.EnumeratedType#getContains()
	 * @see #getEnumeratedType()
	 * @generated
	 */
	EReference getEnumeratedType_Contains();

	/**
	 * Returns the meta object for class '{@link pivotmodel.NumberEnumeratedType <em>Number Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Enumerated Type</em>'.
	 * @see pivotmodel.NumberEnumeratedType
	 * @generated
	 */
	EClass getNumberEnumeratedType();

	/**
	 * Returns the meta object for the attribute list '{@link pivotmodel.NumberEnumeratedType#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contains</em>'.
	 * @see pivotmodel.NumberEnumeratedType#getContains()
	 * @see #getNumberEnumeratedType()
	 * @generated
	 */
	EAttribute getNumberEnumeratedType_Contains();

	/**
	 * Returns the meta object for class '{@link pivotmodel.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see pivotmodel.UnitType
	 * @generated
	 */
	EClass getUnitType();

	/**
	 * Returns the meta object for class '{@link pivotmodel.NamedUnit <em>Named Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Unit</em>'.
	 * @see pivotmodel.NamedUnit
	 * @generated
	 */
	EClass getNamedUnit();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.NamedUnit#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see pivotmodel.NamedUnit#getExponent()
	 * @see #getNamedUnit()
	 * @generated
	 */
	EAttribute getNamedUnit_Exponent();

	/**
	 * Returns the meta object for class '{@link pivotmodel.DerivedUnit <em>Derived Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Unit</em>'.
	 * @see pivotmodel.DerivedUnit
	 * @generated
	 */
	EClass getDerivedUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link pivotmodel.DerivedUnit#getDerivedUnitElement <em>Derived Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived Unit Element</em>'.
	 * @see pivotmodel.DerivedUnit#getDerivedUnitElement()
	 * @see #getDerivedUnit()
	 * @generated
	 */
	EReference getDerivedUnit_DerivedUnitElement();

	/**
	 * Returns the meta object for class '{@link pivotmodel.NonStandardUnit <em>Non Standard Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Standard Unit</em>'.
	 * @see pivotmodel.NonStandardUnit
	 * @generated
	 */
	EClass getNonStandardUnit();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.NonStandardUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pivotmodel.NonStandardUnit#getName()
	 * @see #getNonStandardUnit()
	 * @generated
	 */
	EAttribute getNonStandardUnit_Name();

	/**
	 * Returns the meta object for class '{@link pivotmodel.ConversionBasedUnit <em>Conversion Based Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Based Unit</em>'.
	 * @see pivotmodel.ConversionBasedUnit
	 * @generated
	 */
	EClass getConversionBasedUnit();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.ConversionBasedUnit#getValueComponent <em>Value Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Component</em>'.
	 * @see pivotmodel.ConversionBasedUnit#getValueComponent()
	 * @see #getConversionBasedUnit()
	 * @generated
	 */
	EAttribute getConversionBasedUnit_ValueComponent();

	/**
	 * Returns the meta object for the reference '{@link pivotmodel.ConversionBasedUnit#getUnitComponent <em>Unit Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit Component</em>'.
	 * @see pivotmodel.ConversionBasedUnit#getUnitComponent()
	 * @see #getConversionBasedUnit()
	 * @generated
	 */
	EReference getConversionBasedUnit_UnitComponent();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.ConversionBasedUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pivotmodel.ConversionBasedUnit#getName()
	 * @see #getConversionBasedUnit()
	 * @generated
	 */
	EAttribute getConversionBasedUnit_Name();

	/**
	 * Returns the meta object for class '{@link pivotmodel.ContextDependentUnit <em>Context Dependent Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Dependent Unit</em>'.
	 * @see pivotmodel.ContextDependentUnit
	 * @generated
	 */
	EClass getContextDependentUnit();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.ContextDependentUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pivotmodel.ContextDependentUnit#getName()
	 * @see #getContextDependentUnit()
	 * @generated
	 */
	EAttribute getContextDependentUnit_Name();

	/**
	 * Returns the meta object for class '{@link pivotmodel.StandardUnit <em>Standard Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Unit</em>'.
	 * @see pivotmodel.StandardUnit
	 * @generated
	 */
	EClass getStandardUnit();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.StandardUnit#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see pivotmodel.StandardUnit#getPrefix()
	 * @see #getStandardUnit()
	 * @generated
	 */
	EAttribute getStandardUnit_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.StandardUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pivotmodel.StandardUnit#getName()
	 * @see #getStandardUnit()
	 * @generated
	 */
	EAttribute getStandardUnit_Name();

	/**
	 * Returns the meta object for class '{@link pivotmodel.DerivedUnitElement <em>Derived Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Unit Element</em>'.
	 * @see pivotmodel.DerivedUnitElement
	 * @generated
	 */
	EClass getDerivedUnitElement();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.DerivedUnitElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pivotmodel.DerivedUnitElement#getName()
	 * @see #getDerivedUnitElement()
	 * @generated
	 */
	EAttribute getDerivedUnitElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link pivotmodel.DerivedUnitElement#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see pivotmodel.DerivedUnitElement#getExponent()
	 * @see #getDerivedUnitElement()
	 * @generated
	 */
	EAttribute getDerivedUnitElement_Exponent();

	/**
	 * Returns the meta object for the reference '{@link pivotmodel.DerivedUnitElement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see pivotmodel.DerivedUnitElement#getUnit()
	 * @see #getDerivedUnitElement()
	 * @generated
	 */
	EReference getDerivedUnitElement_Unit();

	/**
	 * Returns the meta object for enum '{@link pivotmodel.PredefinedType <em>Predefined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Predefined Type</em>'.
	 * @see pivotmodel.PredefinedType
	 * @generated
	 */
	EEnum getPredefinedType();

	/**
	 * Returns the meta object for enum '{@link pivotmodel.PredefinedCollection <em>Predefined Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Predefined Collection</em>'.
	 * @see pivotmodel.PredefinedCollection
	 * @generated
	 */
	EEnum getPredefinedCollection();

	/**
	 * Returns the meta object for enum '{@link pivotmodel.PredefinedCurrency <em>Predefined Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Predefined Currency</em>'.
	 * @see pivotmodel.PredefinedCurrency
	 * @generated
	 */
	EEnum getPredefinedCurrency();

	/**
	 * Returns the meta object for enum '{@link pivotmodel.PrefixeType <em>Prefixe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Prefixe Type</em>'.
	 * @see pivotmodel.PrefixeType
	 * @generated
	 */
	EEnum getPrefixeType();

	/**
	 * Returns the meta object for enum '{@link pivotmodel.UnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Name</em>'.
	 * @see pivotmodel.UnitName
	 * @generated
	 */
	EEnum getUnitName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PivotmodelFactory getPivotmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pivotmodel.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.OntologyImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY__NAME = eINSTANCE.getOntology_Name();

		/**
		 * The meta object literal for the '<em><b>Contained Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__CONTAINED_CLASSES = eINSTANCE.getOntology_ContainedClasses();

		/**
		 * The meta object literal for the '<em><b>Contained Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__CONTAINED_PROPERTIES = eINSTANCE.getOntology_ContainedProperties();

		/**
		 * The meta object literal for the '<em><b>Contained Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__CONTAINED_DATA_TYPES = eINSTANCE.getOntology_ContainedDataTypes();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.ClassDefinitionImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getClassDefinition()
		 * @generated
		 */
		EClass CLASS_DEFINITION = eINSTANCE.getClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DEFINITION__NAME = eINSTANCE.getClassDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Class Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION__SUB_CLASS_OF = eINSTANCE.getClassDefinition_SubClassOf();

		/**
		 * The meta object literal for the '<em><b>Disjoint With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION__DISJOINT_WITH = eINSTANCE.getClassDefinition_DisjointWith();

		/**
		 * The meta object literal for the '<em><b>Equivalent To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION__EQUIVALENT_TO = eINSTANCE.getClassDefinition_EquivalentTo();

		/**
		 * The meta object literal for the '<em><b>Described By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEFINITION__DESCRIBED_BY = eINSTANCE.getClassDefinition_DescribedBy();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.SimpleClassImpl <em>Simple Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.SimpleClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getSimpleClass()
		 * @generated
		 */
		EClass SIMPLE_CLASS = eINSTANCE.getSimpleClass();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.PropertyDefinitionImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getPropertyDefinition()
		 * @generated
		 */
		EClass PROPERTY_DEFINITION = eINSTANCE.getPropertyDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__NAME = eINSTANCE.getPropertyDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Is Functional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__IS_FUNCTIONAL = eINSTANCE.getPropertyDefinition_IsFunctional();

		/**
		 * The meta object literal for the '<em><b>Is Symmetric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__IS_SYMMETRIC = eINSTANCE.getPropertyDefinition_IsSymmetric();

		/**
		 * The meta object literal for the '<em><b>Is Transitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__IS_TRANSITIVE = eINSTANCE.getPropertyDefinition_IsTransitive();

		/**
		 * The meta object literal for the '<em><b>Is Inverse Functional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL = eINSTANCE.getPropertyDefinition_IsInverseFunctional();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION__RANGE = eINSTANCE.getPropertyDefinition_Range();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION__DOMAIN = eINSTANCE.getPropertyDefinition_Domain();

		/**
		 * The meta object literal for the '<em><b>Sub Property Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION__SUB_PROPERTY_OF = eINSTANCE.getPropertyDefinition_SubPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Equivalent To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION__EQUIVALENT_TO = eINSTANCE.getPropertyDefinition_EquivalentTo();

		/**
		 * The meta object literal for the '<em><b>Inverse Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION__INVERSE_OF = eINSTANCE.getPropertyDefinition_InverseOf();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.SimplePropertyImpl <em>Simple Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.SimplePropertyImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getSimpleProperty()
		 * @generated
		 */
		EClass SIMPLE_PROPERTY = eINSTANCE.getSimpleProperty();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.DataTypeDefinitionImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getDataTypeDefinition()
		 * @generated
		 */
		EClass DATA_TYPE_DEFINITION = eINSTANCE.getDataTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_DEFINITION__NAME = eINSTANCE.getDataTypeDefinition_Name();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.PrimitiveTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__BASED_ON = eINSTANCE.getPrimitiveType_BasedOn();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.CaseOfClassImpl <em>Case Of Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.CaseOfClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getCaseOfClass()
		 * @generated
		 */
		EClass CASE_OF_CLASS = eINSTANCE.getCaseOfClass();

		/**
		 * The meta object literal for the '<em><b>Case Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_OF_CLASS__CASE_OF = eINSTANCE.getCaseOfClass_CaseOf();

		/**
		 * The meta object literal for the '<em><b>Imported Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_OF_CLASS__IMPORTED_PROPERTIES = eINSTANCE.getCaseOfClass_ImportedProperties();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.RestrictedClassImpl <em>Restricted Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.RestrictedClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getRestrictedClass()
		 * @generated
		 */
		EClass RESTRICTED_CLASS = eINSTANCE.getRestrictedClass();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTED_CLASS__ON_PROPERTY = eINSTANCE.getRestrictedClass_OnProperty();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.ValueRestrictedClassImpl <em>Value Restricted Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.ValueRestrictedClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getValueRestrictedClass()
		 * @generated
		 */
		EClass VALUE_RESTRICTED_CLASS = eINSTANCE.getValueRestrictedClass();

		/**
		 * The meta object literal for the '<em><b>To Data Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_RESTRICTED_CLASS__TO_DATA_DEFINITION = eINSTANCE.getValueRestrictedClass_ToDataDefinition();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.UniversalClassImpl <em>Universal Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.UniversalClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getUniversalClass()
		 * @generated
		 */
		EClass UNIVERSAL_CLASS = eINSTANCE.getUniversalClass();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.ExistantialClassImpl <em>Existantial Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.ExistantialClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getExistantialClass()
		 * @generated
		 */
		EClass EXISTANTIAL_CLASS = eINSTANCE.getExistantialClass();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.HasValueClassImpl <em>Has Value Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.HasValueClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getHasValueClass()
		 * @generated
		 */
		EClass HAS_VALUE_CLASS = eINSTANCE.getHasValueClass();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.CardinalityRestrictedClassImpl <em>Cardinality Restricted Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.CardinalityRestrictedClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getCardinalityRestrictedClass()
		 * @generated
		 */
		EClass CARDINALITY_RESTRICTED_CLASS = eINSTANCE.getCardinalityRestrictedClass();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.MaxCardinalityClassImpl <em>Max Cardinality Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.MaxCardinalityClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getMaxCardinalityClass()
		 * @generated
		 */
		EClass MAX_CARDINALITY_CLASS = eINSTANCE.getMaxCardinalityClass();

		/**
		 * The meta object literal for the '<em><b>Max Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_CARDINALITY_CLASS__MAX_CARD = eINSTANCE.getMaxCardinalityClass_MaxCard();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.MinCardinalityClassImpl <em>Min Cardinality Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.MinCardinalityClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getMinCardinalityClass()
		 * @generated
		 */
		EClass MIN_CARDINALITY_CLASS = eINSTANCE.getMinCardinalityClass();

		/**
		 * The meta object literal for the '<em><b>Min Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_CARDINALITY_CLASS__MIN_CARD = eINSTANCE.getMinCardinalityClass_MinCard();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.CardinalityClassImpl <em>Cardinality Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.CardinalityClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getCardinalityClass()
		 * @generated
		 */
		EClass CARDINALITY_CLASS = eINSTANCE.getCardinalityClass();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY_CLASS__CARD = eINSTANCE.getCardinalityClass_Card();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.EnumeratedClassImpl <em>Enumerated Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.EnumeratedClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getEnumeratedClass()
		 * @generated
		 */
		EClass ENUMERATED_CLASS = eINSTANCE.getEnumeratedClass();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_CLASS__ONE_OF = eINSTANCE.getEnumeratedClass_OneOf();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.CombinationClassImpl <em>Combination Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.CombinationClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getCombinationClass()
		 * @generated
		 */
		EClass COMBINATION_CLASS = eINSTANCE.getCombinationClass();

		/**
		 * The meta object literal for the '<em><b>Combination Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_CLASS__COMBINATION_OF = eINSTANCE.getCombinationClass_CombinationOf();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.UnionClassImpl <em>Union Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.UnionClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getUnionClass()
		 * @generated
		 */
		EClass UNION_CLASS = eINSTANCE.getUnionClass();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.IntersectionClassImpl <em>Intersection Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.IntersectionClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getIntersectionClass()
		 * @generated
		 */
		EClass INTERSECTION_CLASS = eINSTANCE.getIntersectionClass();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.ComplementClassImpl <em>Complement Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.ComplementClassImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getComplementClass()
		 * @generated
		 */
		EClass COMPLEMENT_CLASS = eINSTANCE.getComplementClass();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.ConditionPropertyImpl <em>Condition Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.ConditionPropertyImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getConditionProperty()
		 * @generated
		 */
		EClass CONDITION_PROPERTY = eINSTANCE.getConditionProperty();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.DependentPropertyImpl <em>Dependent Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.DependentPropertyImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getDependentProperty()
		 * @generated
		 */
		EClass DEPENDENT_PROPERTY = eINSTANCE.getDependentProperty();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT_PROPERTY__DEPENDS_ON = eINSTANCE.getDependentProperty_DependsOn();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.NotNumericTypeImpl <em>Not Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.NotNumericTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getNotNumericType()
		 * @generated
		 */
		EClass NOT_NUMERIC_TYPE = eINSTANCE.getNotNumericType();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.NumericTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.MeasureTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getMeasureType()
		 * @generated
		 */
		EClass MEASURE_TYPE = eINSTANCE.getMeasureType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_TYPE__UNIT = eINSTANCE.getMeasureType_Unit();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.CurrencyTypeImpl <em>Currency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.CurrencyTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getCurrencyType()
		 * @generated
		 */
		EClass CURRENCY_TYPE = eINSTANCE.getCurrencyType();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_TYPE__CURRENCY = eINSTANCE.getCurrencyType_Currency();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.ClassTypeImpl <em>Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.ClassTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getClassType()
		 * @generated
		 */
		EClass CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__BASED_ON = eINSTANCE.getClassType_BasedOn();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.CollectionTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Collection Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__COLLECTION_OF = eINSTANCE.getCollectionType_CollectionOf();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_TYPE__IS = eINSTANCE.getCollectionType_Is();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.SingleValueImpl <em>Single Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.SingleValueImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getSingleValue()
		 * @generated
		 */
		EClass SINGLE_VALUE = eINSTANCE.getSingleValue();

		/**
		 * The meta object literal for the '<em><b>Is Of Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VALUE__IS_OF_TYPE = eINSTANCE.getSingleValue_IsOfType();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.EnumeratedTypeImpl <em>Enumerated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.EnumeratedTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getEnumeratedType()
		 * @generated
		 */
		EClass ENUMERATED_TYPE = eINSTANCE.getEnumeratedType();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE__CONTAINS = eINSTANCE.getEnumeratedType_Contains();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.NumberEnumeratedTypeImpl <em>Number Enumerated Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.NumberEnumeratedTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getNumberEnumeratedType()
		 * @generated
		 */
		EClass NUMBER_ENUMERATED_TYPE = eINSTANCE.getNumberEnumeratedType();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ENUMERATED_TYPE__CONTAINS = eINSTANCE.getNumberEnumeratedType_Contains();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.UnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.UnitTypeImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getUnitType()
		 * @generated
		 */
		EClass UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.NamedUnitImpl <em>Named Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.NamedUnitImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getNamedUnit()
		 * @generated
		 */
		EClass NAMED_UNIT = eINSTANCE.getNamedUnit();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_UNIT__EXPONENT = eINSTANCE.getNamedUnit_Exponent();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.DerivedUnitImpl <em>Derived Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.DerivedUnitImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getDerivedUnit()
		 * @generated
		 */
		EClass DERIVED_UNIT = eINSTANCE.getDerivedUnit();

		/**
		 * The meta object literal for the '<em><b>Derived Unit Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_UNIT__DERIVED_UNIT_ELEMENT = eINSTANCE.getDerivedUnit_DerivedUnitElement();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.NonStandardUnitImpl <em>Non Standard Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.NonStandardUnitImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getNonStandardUnit()
		 * @generated
		 */
		EClass NON_STANDARD_UNIT = eINSTANCE.getNonStandardUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_STANDARD_UNIT__NAME = eINSTANCE.getNonStandardUnit_Name();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.ConversionBasedUnitImpl <em>Conversion Based Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.ConversionBasedUnitImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getConversionBasedUnit()
		 * @generated
		 */
		EClass CONVERSION_BASED_UNIT = eINSTANCE.getConversionBasedUnit();

		/**
		 * The meta object literal for the '<em><b>Value Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_BASED_UNIT__VALUE_COMPONENT = eINSTANCE.getConversionBasedUnit_ValueComponent();

		/**
		 * The meta object literal for the '<em><b>Unit Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_BASED_UNIT__UNIT_COMPONENT = eINSTANCE.getConversionBasedUnit_UnitComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_BASED_UNIT__NAME = eINSTANCE.getConversionBasedUnit_Name();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.ContextDependentUnitImpl <em>Context Dependent Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.ContextDependentUnitImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getContextDependentUnit()
		 * @generated
		 */
		EClass CONTEXT_DEPENDENT_UNIT = eINSTANCE.getContextDependentUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DEPENDENT_UNIT__NAME = eINSTANCE.getContextDependentUnit_Name();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.StandardUnitImpl <em>Standard Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.StandardUnitImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getStandardUnit()
		 * @generated
		 */
		EClass STANDARD_UNIT = eINSTANCE.getStandardUnit();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_UNIT__PREFIX = eINSTANCE.getStandardUnit_Prefix();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_UNIT__NAME = eINSTANCE.getStandardUnit_Name();

		/**
		 * The meta object literal for the '{@link pivotmodel.impl.DerivedUnitElementImpl <em>Derived Unit Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.impl.DerivedUnitElementImpl
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getDerivedUnitElement()
		 * @generated
		 */
		EClass DERIVED_UNIT_ELEMENT = eINSTANCE.getDerivedUnitElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_UNIT_ELEMENT__NAME = eINSTANCE.getDerivedUnitElement_Name();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_UNIT_ELEMENT__EXPONENT = eINSTANCE.getDerivedUnitElement_Exponent();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_UNIT_ELEMENT__UNIT = eINSTANCE.getDerivedUnitElement_Unit();

		/**
		 * The meta object literal for the '{@link pivotmodel.PredefinedType <em>Predefined Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.PredefinedType
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getPredefinedType()
		 * @generated
		 */
		EEnum PREDEFINED_TYPE = eINSTANCE.getPredefinedType();

		/**
		 * The meta object literal for the '{@link pivotmodel.PredefinedCollection <em>Predefined Collection</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.PredefinedCollection
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getPredefinedCollection()
		 * @generated
		 */
		EEnum PREDEFINED_COLLECTION = eINSTANCE.getPredefinedCollection();

		/**
		 * The meta object literal for the '{@link pivotmodel.PredefinedCurrency <em>Predefined Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.PredefinedCurrency
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getPredefinedCurrency()
		 * @generated
		 */
		EEnum PREDEFINED_CURRENCY = eINSTANCE.getPredefinedCurrency();

		/**
		 * The meta object literal for the '{@link pivotmodel.PrefixeType <em>Prefixe Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.PrefixeType
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getPrefixeType()
		 * @generated
		 */
		EEnum PREFIXE_TYPE = eINSTANCE.getPrefixeType();

		/**
		 * The meta object literal for the '{@link pivotmodel.UnitName <em>Unit Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pivotmodel.UnitName
		 * @see pivotmodel.impl.PivotmodelPackageImpl#getUnitName()
		 * @generated
		 */
		EEnum UNIT_NAME = eINSTANCE.getUnitName();

	}

} //PivotmodelPackage
