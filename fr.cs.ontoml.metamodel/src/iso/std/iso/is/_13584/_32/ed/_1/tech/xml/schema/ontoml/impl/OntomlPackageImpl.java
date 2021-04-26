/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlFactory;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.util.OntomlValidator;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.CataloguePackageImpl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.ValuePackageImpl;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.BasicPackageImpl;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IdentifierPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntomlPackageImpl extends EPackageImpl implements OntomlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ontoml.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeunitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anytypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aposterioricaseofTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aposteriorisemanticrelationshipsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aposteriorisemanticrelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aposterioriviewofTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraytypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignedvalueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axis1PLACEMENTTYPETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axis2PLACEMENT2DTYPETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axis2PLACEMENT3DTYPETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagtypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleantypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizationclassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classconstantvaluesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classesreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classextensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classpresentationonpaperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classpresentationonscreenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classreferencetypeTypeEClass = null;

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
	private EClass classvalueassignmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditiondetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationcontrolconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintorconstraintidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedclassesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedclassextensionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containeddatatypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containeddocumentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedkeywordsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedpropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedsuppliersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedsynonymsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextdependentunitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextparameterconstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextparamiconTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextrestrictionconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionbasedunitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correspondingpropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createiconTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypereferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypesreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datedatatypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimedatatypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentpdetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedunitelementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedunitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionariesreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryinstandardformatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dicunitreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dicunitsreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dicunitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dicvalueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionalexponentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentcontentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentidentifiernamelabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentidentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentreferenceTypeEClass = null;

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
	private EClass documentsreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainconstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitfunctionalmodelclassextensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicititemclassextensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalfilesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalgraphicsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalresourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmclassviewofTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freerelationdefinitionrefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freerelationendrefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freerelationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freerelationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalmodelclassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generaltextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometriccontextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometricunitcontextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifieddocumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass illustrationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intcurrencytypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intdicvalueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intmeasuretypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inttypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemclasscaseofTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemclassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsvaluesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordlabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordreferencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leveltypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryiimidentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryinstandardformatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listtypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingfunctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathematicalstringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedtypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedunitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nondependentpdetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noninstantiablefunctionalviewclassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonquantitativecodetypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonquantitativeinttypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonsiunitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nontranslatablestringtypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numbertypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontomlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementtypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postconditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferrednamelabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferrednameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programreferencetypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyclassificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertymappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyvaluerecommendedpresentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationalmeasuretypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaltypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realcurrencytypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realmeasuretypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendedpresentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceddocumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedgraphicsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remotelocationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationpdetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationreferencetypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusablekeywordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusablenameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusablesynonymTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setwithsubsetconstrainttypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortnamelabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siunitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcedocumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringdicvalueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringpatternconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringsizeconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringtypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subclassconstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suppliersreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedvepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synonymousnamelabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synonymousnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synonymoussymbolsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synonymreferencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedatatypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translatablestringtypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationdataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationTypeEClass = null;

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
	private EClass uritypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcvrangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewcontrolvariablerangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewexchangeprotocolidentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum illustrationtypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum siprefixTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum siunitnameTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardsizeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valuespecificationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType absoluteurltypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aPosterioriSemanticRelationIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classRefTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classRefType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classRefType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classRefType3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classRefType4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classRefType5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType constraintIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countrycodeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencycodeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencyIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataTypeIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datetypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType detclassificationtypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dicUnitIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dicValueIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType documentIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType documentidentifiernameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eptosGUIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType externalitemcodetypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType freeRelationDefinitionIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType freeRelationEndIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType httpdirectorynametypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType httpfilenametypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType illustrationtypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keywordreferenceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keywordtypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languagecodeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ontologyIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positivelengthmeasureTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveplaneanglemeasureTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveratiomeasureTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType preferrednametypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType programreferencenameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reusableNameIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType revisiontypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortnametypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType siprefixTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType siunitnameTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType standardsizeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statusTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType suppliercodetypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType supplierIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType synonymousnametypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType synonymreferenceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valuecodetypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueformattypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valuespecificationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versiontypeTypeEDataType = null;

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
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OntomlPackageImpl() {
		super(eNS_URI, OntomlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OntomlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static OntomlPackage init() {
		if (isInited) return (OntomlPackage)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI);

		// Obtain or create and register package
		OntomlPackageImpl theOntomlPackage = (OntomlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OntomlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OntomlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) instanceof IdentifierPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI) : IdentifierPackage.eINSTANCE);
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) : ValuePackage.eINSTANCE);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);
		CataloguePackageImpl theCataloguePackage = (CataloguePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) instanceof CataloguePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) : CataloguePackage.eINSTANCE);

		// Load packages
		theOntomlPackage.loadPackage();

		// Create package meta-data objects
		theIdentifierPackage.createPackageContents();
		theValuePackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theCataloguePackage.createPackageContents();

		// Initialize created meta-data
		theIdentifierPackage.initializePackageContents();
		theValuePackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theCataloguePackage.initializePackageContents();

		// Fix loaded packages
		theOntomlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOntomlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OntomlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOntomlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OntomlPackage.eNS_URI, theOntomlPackage);
		return theOntomlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEUNITSType() {
		if (alternativeunitsTypeEClass == null) {
			alternativeunitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(1);
		}
		return alternativeunitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEUNITSType_DicUnit() {
        return (EReference)getALTERNATIVEUNITSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANYTYPEType() {
		if (anytypeTypeEClass == null) {
			anytypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(2);
		}
		return anytypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getANYTYPEType_Constraints() {
        return (EReference)getANYTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPOSTERIORICASEOFType() {
		if (aposterioricaseofTypeEClass == null) {
			aposterioricaseofTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(3);
		}
		return aposterioricaseofTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPOSTERIORICASEOFType_CaseOfSuper() {
        return (EReference)getAPOSTERIORICASEOFType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPOSTERIORICASEOFType_CaseOfSub() {
        return (EReference)getAPOSTERIORICASEOFType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPOSTERIORICASEOFType_CorrespondingProperties() {
        return (EReference)getAPOSTERIORICASEOFType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPOSTERIORISEMANTICRELATIONSHIPSType() {
		if (aposteriorisemanticrelationshipsTypeEClass == null) {
			aposteriorisemanticrelationshipsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(5);
		}
		return aposteriorisemanticrelationshipsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPOSTERIORISEMANTICRELATIONSHIPSType_APosterioriSemanticRelationship() {
        return (EReference)getAPOSTERIORISEMANTICRELATIONSHIPSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPOSTERIORISEMANTICRELATIONSHIPType() {
		if (aposteriorisemanticrelationshipTypeEClass == null) {
			aposteriorisemanticrelationshipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(6);
		}
		return aposteriorisemanticrelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPOSTERIORISEMANTICRELATIONSHIPType_Id() {
        return (EAttribute)getAPOSTERIORISEMANTICRELATIONSHIPType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPOSTERIORIVIEWOFType() {
		if (aposterioriviewofTypeEClass == null) {
			aposterioriviewofTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(7);
		}
		return aposterioriviewofTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPOSTERIORIVIEWOFType_Item() {
        return (EReference)getAPOSTERIORIVIEWOFType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPOSTERIORIVIEWOFType_Model() {
        return (EReference)getAPOSTERIORIVIEWOFType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPOSTERIORIVIEWOFType_CorrespondingProperties() {
        return (EReference)getAPOSTERIORIVIEWOFType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARRAYTYPEType() {
		if (arraytypeTypeEClass == null) {
			arraytypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(8);
		}
		return arraytypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARRAYTYPEType_Bound1() {
        return (EAttribute)getARRAYTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARRAYTYPEType_Bound2() {
        return (EAttribute)getARRAYTYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARRAYTYPEType_ValueType() {
        return (EReference)getARRAYTYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARRAYTYPEType_Uniqueness() {
        return (EAttribute)getARRAYTYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARRAYTYPEType_AreOptional() {
        return (EAttribute)getARRAYTYPEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASSIGNEDVALUEType() {
		if (assignedvalueTypeEClass == null) {
			assignedvalueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(9);
		}
		return assignedvalueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_StringValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_BagValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_BooleanValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_ComplexValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_CompositeValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_ControlledValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_CurrencyValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_DateValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_DateTimeValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_FileValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_IntegerValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_ItemReferenceValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_LocalizedTextValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_MeasureQualifiedNumberValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_MeasureRangeValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_MeasureSingleNumberValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_NullValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_RationalValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_RealValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_SequenceValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_SetValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_TimeValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_YearMonthValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASSIGNEDVALUEType_YearValue() {
        return (EReference)getASSIGNEDVALUEType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAUTHORSType() {
		if (authorsTypeEClass == null) {
			authorsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(10);
		}
		return authorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAUTHORSType_Person() {
        return (EReference)getAUTHORSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAXIS1PLACEMENTTYPEType() {
		if (axis1PLACEMENTTYPETypeEClass == null) {
			axis1PLACEMENTTYPETypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(11);
		}
		return axis1PLACEMENTTYPETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAXIS1PLACEMENTTYPEType_ClassRef() {
        return (EAttribute)getAXIS1PLACEMENTTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAXIS2PLACEMENT2DTYPEType() {
		if (axis2PLACEMENT2DTYPETypeEClass == null) {
			axis2PLACEMENT2DTYPETypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(12);
		}
		return axis2PLACEMENT2DTYPETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAXIS2PLACEMENT2DTYPEType_ClassRef() {
        return (EAttribute)getAXIS2PLACEMENT2DTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAXIS2PLACEMENT3DTYPEType() {
		if (axis2PLACEMENT3DTYPETypeEClass == null) {
			axis2PLACEMENT3DTYPETypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(13);
		}
		return axis2PLACEMENT3DTYPETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAXIS2PLACEMENT3DTYPEType_ClassRef() {
        return (EAttribute)getAXIS2PLACEMENT3DTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAGTYPEType() {
		if (bagtypeTypeEClass == null) {
			bagtypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(14);
		}
		return bagtypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBAGTYPEType_Bound1() {
        return (EAttribute)getBAGTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBAGTYPEType_Bound2() {
        return (EAttribute)getBAGTYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAGTYPEType_ValueType() {
        return (EReference)getBAGTYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOOLEANTYPEType() {
		if (booleantypeTypeEClass == null) {
			booleantypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(15);
		}
		return booleantypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBOOLEANTYPEType_ValueFormat() {
        return (EAttribute)getBOOLEANTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCARDINALITYCONSTRAINTType() {
		if (cardinalityconstraintTypeEClass == null) {
			cardinalityconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(16);
		}
		return cardinalityconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCARDINALITYCONSTRAINTType_Bound1() {
        return (EAttribute)getCARDINALITYCONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCARDINALITYCONSTRAINTType_Bound2() {
        return (EAttribute)getCARDINALITYCONSTRAINTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCATEGORIZATIONCLASSType() {
		if (categorizationclassTypeEClass == null) {
			categorizationclassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(17);
		}
		return categorizationclassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCATEGORIZATIONCLASSType_CategorizationClassSuperclasses() {
        return (EReference)getCATEGORIZATIONCLASSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSCONSTANTVALUESType() {
		if (classconstantvaluesTypeEClass == null) {
			classconstantvaluesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(18);
		}
		return classconstantvaluesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSCONSTANTVALUESType_ClassValueAssignment() {
        return (EReference)getCLASSCONSTANTVALUESType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSCONSTRAINTType() {
		if (classconstraintTypeEClass == null) {
			classconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(19);
		}
		return classconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSESREFERENCEType() {
		if (classesreferenceTypeEClass == null) {
			classesreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(20);
		}
		return classesreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSESREFERENCEType_Class() {
        return (EReference)getCLASSESREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSEXTENSIONType() {
		if (classextensionTypeEClass == null) {
			classextensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(21);
		}
		return classextensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSEXTENSIONType_DictionaryDefinition() {
        return (EReference)getCLASSEXTENSIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSEXTENSIONType_ContentVersion() {
        return (EAttribute)getCLASSEXTENSIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSEXTENSIONType_ContentRevision() {
        return (EAttribute)getCLASSEXTENSIONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSEXTENSIONType_RecommendedPresentation() {
        return (EReference)getCLASSEXTENSIONType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSEXTENSIONType_Classification() {
        return (EReference)getCLASSEXTENSIONType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSEXTENSIONType_InstanceIdentification() {
        return (EReference)getCLASSEXTENSIONType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSEXTENSIONType_Population() {
        return (EReference)getCLASSEXTENSIONType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSEXTENSIONType_TableLike() {
        return (EAttribute)getCLASSEXTENSIONType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSIFICATIONType() {
		if (classificationTypeEClass == null) {
			classificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(23);
		}
		return classificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSIFICATIONType_PropertyClassification() {
        return (EReference)getCLASSIFICATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSPRESENTATIONONPAPERType() {
		if (classpresentationonpaperTypeEClass == null) {
			classpresentationonpaperTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(24);
		}
		return classpresentationonpaperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSPRESENTATIONONPAPERType_Illustration() {
        return (EReference)getCLASSPRESENTATIONONPAPERType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSPRESENTATIONONSCREENType() {
		if (classpresentationonscreenTypeEClass == null) {
			classpresentationonscreenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(25);
		}
		return classpresentationonscreenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSPRESENTATIONONSCREENType_Illustration() {
        return (EReference)getCLASSPRESENTATIONONSCREENType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSREFERENCEType() {
		if (classreferenceTypeEClass == null) {
			classreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(26);
		}
		return classreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSREFERENCEType_ClassRef() {
        return (EAttribute)getCLASSREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSREFERENCETYPEType() {
		if (classreferencetypeTypeEClass == null) {
			classreferencetypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(27);
		}
		return classreferencetypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSREFERENCETYPEType_Domain() {
        return (EReference)getCLASSREFERENCETYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSType() {
		if (classTypeEClass == null) {
			classTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(34);
		}
		return classTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_DateOfOriginalDefinition() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_DateOfCurrentVersion() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_DateOfCurrentRevision() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_Revision() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_Status() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_Translation() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_SourceLanguage() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_IsDeprecated() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_IsDeprecatedInterpretation() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_PreferredName() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_SynonymousNames() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_ShortName() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_Icon() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_Definition() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_SourceDocOfDefinition() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_Note() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_Remark() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_ItsSuperclass() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_DescribedBy() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_DefinedTypes() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_DefinedDocuments() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_Constraints() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_HierarchicalPosition() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_Keywords() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_SubClassProperties() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_ClassConstantValues() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_GeometricRepresentationContext() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_GlobalUnitContext() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_KeywordReferences() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSType_FreeRelations() {
        return (EReference)getCLASSType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_Guid() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_Guid2() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLASSType_Id() {
        return (EAttribute)getCLASSType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLASSVALUEASSIGNMENTType() {
		if (classvalueassignmentTypeEClass == null) {
			classvalueassignmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(35);
		}
		return classvalueassignmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSVALUEASSIGNMENTType_SuperClassDefinedProperty() {
        return (EReference)getCLASSVALUEASSIGNMENTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCLASSVALUEASSIGNMENTType_AssignedValue() {
        return (EReference)getCLASSVALUEASSIGNMENTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONDITIONDETType() {
		if (conditiondetTypeEClass == null) {
			conditiondetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(36);
		}
		return conditiondetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONFIGURATIONCONTROLCONSTRAINTType() {
		if (configurationcontrolconstraintTypeEClass == null) {
			configurationcontrolconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(37);
		}
		return configurationcontrolconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONFIGURATIONCONTROLCONSTRAINTType_Precondition() {
        return (EReference)getCONFIGURATIONCONTROLCONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONFIGURATIONCONTROLCONSTRAINTType_Postcondition() {
        return (EReference)getCONFIGURATIONCONTROLCONSTRAINTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONSTRAINTORCONSTRAINTIDType() {
		if (constraintorconstraintidTypeEClass == null) {
			constraintorconstraintidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(39);
		}
		return constraintorconstraintidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONSTRAINTORCONSTRAINTIDType_ConstraintDefinition() {
        return (EReference)getCONSTRAINTORCONSTRAINTIDType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCONSTRAINTORCONSTRAINTIDType_ConstraintRef() {
        return (EAttribute)getCONSTRAINTORCONSTRAINTIDType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONSTRAINTSType() {
		if (constraintsTypeEClass == null) {
			constraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(40);
		}
		return constraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONSTRAINTSType_Constraint() {
        return (EReference)getCONSTRAINTSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONSTRAINTType() {
		if (constraintTypeEClass == null) {
			constraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(41);
		}
		return constraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCONSTRAINTType_ConstraintId() {
        return (EAttribute)getCONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDCLASSESType() {
		if (containedclassesTypeEClass == null) {
			containedclassesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(42);
		}
		return containedclassesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDCLASSESType_Class() {
        return (EReference)getCONTAINEDCLASSESType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDCLASSEXTENSIONSType() {
		if (containedclassextensionsTypeEClass == null) {
			containedclassextensionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(43);
		}
		return containedclassextensionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDCLASSEXTENSIONSType_ClassExtension() {
        return (EReference)getCONTAINEDCLASSEXTENSIONSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDDATATYPESType() {
		if (containeddatatypesTypeEClass == null) {
			containeddatatypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(44);
		}
		return containeddatatypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDDATATYPESType_Datatype() {
        return (EReference)getCONTAINEDDATATYPESType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDDOCUMENTSType() {
		if (containeddocumentsTypeEClass == null) {
			containeddocumentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(45);
		}
		return containeddocumentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDDOCUMENTSType_Document() {
        return (EReference)getCONTAINEDDOCUMENTSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDKEYWORDSType() {
		if (containedkeywordsTypeEClass == null) {
			containedkeywordsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(46);
		}
		return containedkeywordsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDKEYWORDSType_Keyword() {
        return (EReference)getCONTAINEDKEYWORDSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDPROPERTIESType() {
		if (containedpropertiesTypeEClass == null) {
			containedpropertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(47);
		}
		return containedpropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDPROPERTIESType_Property() {
        return (EReference)getCONTAINEDPROPERTIESType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDSUPPLIERSType() {
		if (containedsuppliersTypeEClass == null) {
			containedsuppliersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(48);
		}
		return containedsuppliersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDSUPPLIERSType_Supplier() {
        return (EReference)getCONTAINEDSUPPLIERSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTAINEDSYNONYMSType() {
		if (containedsynonymsTypeEClass == null) {
			containedsynonymsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(49);
		}
		return containedsynonymsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTAINEDSYNONYMSType_Synonym() {
        return (EReference)getCONTAINEDSYNONYMSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTEXTDEPENDENTUNITType() {
		if (contextdependentunitTypeEClass == null) {
			contextdependentunitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(50);
		}
		return contextdependentunitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCONTEXTDEPENDENTUNITType_Name() {
        return (EAttribute)getCONTEXTDEPENDENTUNITType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTEXTPARAMETERCONSTRAINTSType() {
		if (contextparameterconstraintsTypeEClass == null) {
			contextparameterconstraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(51);
		}
		return contextparameterconstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTEXTPARAMETERCONSTRAINTSType_IntegrityConstraint() {
        return (EReference)getCONTEXTPARAMETERCONSTRAINTSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTEXTPARAMICONType() {
		if (contextparamiconTypeEClass == null) {
			contextparamiconTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(52);
		}
		return contextparamiconTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTEXTPARAMICONType_A6Illustration() {
        return (EReference)getCONTEXTPARAMICONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONTEXTRESTRICTIONCONSTRAINTType() {
		if (contextrestrictionconstraintTypeEClass == null) {
			contextrestrictionconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(53);
		}
		return contextrestrictionconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONTEXTRESTRICTIONCONSTRAINTType_ContextParameterConstraints() {
        return (EReference)getCONTEXTRESTRICTIONCONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCONVERSIONBASEDUNITType() {
		if (conversionbasedunitTypeEClass == null) {
			conversionbasedunitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(54);
		}
		return conversionbasedunitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCONVERSIONBASEDUNITType_Name() {
        return (EAttribute)getCONVERSIONBASEDUNITType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCONVERSIONBASEDUNITType_ValueComponent() {
        return (EAttribute)getCONVERSIONBASEDUNITType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCONVERSIONBASEDUNITType_UnitComponent() {
        return (EReference)getCONVERSIONBASEDUNITType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCORRESPONDINGPROPERTIESType() {
		if (correspondingpropertiesTypeEClass == null) {
			correspondingpropertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(55);
		}
		return correspondingpropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCORRESPONDINGPROPERTIESType_Mapping() {
        return (EReference)getCORRESPONDINGPROPERTIESType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCREATEICONType() {
		if (createiconTypeEClass == null) {
			createiconTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(57);
		}
		return createiconTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCREATEICONType_Illustration() {
        return (EReference)getCREATEICONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEREFERENCEType() {
		if (datatypereferenceTypeEClass == null) {
			datatypereferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(61);
		}
		return datatypereferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEREFERENCEType_DatatypeRef() {
        return (EAttribute)getDATATYPEREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPESREFERENCEType() {
		if (datatypesreferenceTypeEClass == null) {
			datatypesreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(62);
		}
		return datatypesreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESREFERENCEType_Datatype() {
        return (EReference)getDATATYPESREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEType() {
		if (datatypeTypeEClass == null) {
			datatypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(63);
		}
		return datatypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEType_NameScope() {
        return (EReference)getDATATYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_DateOfOriginalDefinition() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_DateOfCurrentVersion() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_DateOfCurrentRevision() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_Revision() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_Status() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEType_Translation() {
        return (EReference)getDATATYPEType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEType_SourceLanguage() {
        return (EReference)getDATATYPEType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_IsDeprecated() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEType_IsDeprecatedInterpretation() {
        return (EReference)getDATATYPEType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEType_PreferredName() {
        return (EReference)getDATATYPEType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEType_SynonymousNames() {
        return (EReference)getDATATYPEType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEType_ShortName() {
        return (EReference)getDATATYPEType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEType_Icon() {
        return (EReference)getDATATYPEType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEType_TypeDefinition() {
        return (EReference)getDATATYPEType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_ValueSpecification() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_Guid() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_Guid2() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEType_Id() {
        return (EAttribute)getDATATYPEType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATEDATATYPEType() {
		if (datedatatypeTypeEClass == null) {
			datedatatypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(64);
		}
		return datedatatypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATEDATATYPEType_ValueFormat() {
        return (EAttribute)getDATEDATATYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATETIMEDATATYPEType() {
		if (datetimedatatypeTypeEClass == null) {
			datetimedatatypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(65);
		}
		return datetimedatatypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATETIMEDATATYPEType_ValueFormat() {
        return (EAttribute)getDATETIMEDATATYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEPENDENTPDETType() {
		if (dependentpdetTypeEClass == null) {
			dependentpdetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(67);
		}
		return dependentpdetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEPENDENTPDETType_DependsOn() {
        return (EReference)getDEPENDENTPDETType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDERIVEDUNITELEMENTType() {
		if (derivedunitelementTypeEClass == null) {
			derivedunitelementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(68);
		}
		return derivedunitelementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDERIVEDUNITELEMENTType_Unit() {
        return (EReference)getDERIVEDUNITELEMENTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDERIVEDUNITELEMENTType_Exponent() {
        return (EAttribute)getDERIVEDUNITELEMENTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDERIVEDUNITType() {
		if (derivedunitTypeEClass == null) {
			derivedunitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(69);
		}
		return derivedunitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDERIVEDUNITType_DerivedUnitElement() {
        return (EReference)getDERIVEDUNITType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDICTIONARIESREFERENCEType() {
		if (dictionariesreferenceTypeEClass == null) {
			dictionariesreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(71);
		}
		return dictionariesreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARIESREFERENCEType_Dictionary() {
        return (EReference)getDICTIONARIESREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDICTIONARYINSTANDARDFORMATType() {
		if (dictionaryinstandardformatTypeEClass == null) {
			dictionaryinstandardformatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(72);
		}
		return dictionaryinstandardformatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDICTIONARYREFERENCEType() {
		if (dictionaryreferenceTypeEClass == null) {
			dictionaryreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(73);
		}
		return dictionaryreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICTIONARYREFERENCEType_DictionaryRef() {
        return (EAttribute)getDICTIONARYREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDICTIONARYType() {
		if (dictionaryTypeEClass == null) {
			dictionaryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(74);
		}
		return dictionaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICTIONARYType_IsComplete() {
        return (EAttribute)getDICTIONARYType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_Updates() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICTIONARYType_UpdateAgreement() {
        return (EAttribute)getDICTIONARYType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_ReferencedDictionaries() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_ResponsibleSupplier() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_ContainedClasses() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_APosterioriSemanticRelationships() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_ContainedSuppliers() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_ContainedProperties() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_ContainedDocuments() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_ContainedDatatypes() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_ContainedKeywords() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICTIONARYType_ContainedSynonyms() {
        return (EReference)getDICTIONARYType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDICUNITREFERENCEType() {
		if (dicunitreferenceTypeEClass == null) {
			dicunitreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(76);
		}
		return dicunitreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICUNITREFERENCEType_DicUnitRef() {
        return (EAttribute)getDICUNITREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDICUNITSREFERENCEType() {
		if (dicunitsreferenceTypeEClass == null) {
			dicunitsreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(77);
		}
		return dicunitsreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICUNITSREFERENCEType_DicUnit() {
        return (EReference)getDICUNITSREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDICUNITType() {
		if (dicunitTypeEClass == null) {
			dicunitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(78);
		}
		return dicunitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICUNITType_StructuredRepresentation() {
        return (EReference)getDICUNITType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICUNITType_StringRepresentation() {
        return (EReference)getDICUNITType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICUNITType_UnitRef() {
        return (EAttribute)getDICUNITType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDICVALUEType() {
		if (dicvalueTypeEClass == null) {
			dicvalueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(80);
		}
		return dicvalueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICVALUEType_PreferredName() {
        return (EReference)getDICVALUEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICVALUEType_SynonymousNames() {
        return (EReference)getDICVALUEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICVALUEType_ShortName() {
        return (EReference)getDICVALUEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICVALUEType_Icon() {
        return (EReference)getDICVALUEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICVALUEType_SourceDocOfDefinition() {
        return (EReference)getDICVALUEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICVALUEType_Definition() {
        return (EReference)getDICVALUEType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICVALUEType_Status() {
        return (EAttribute)getDICVALUEType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICVALUEType_IsDeprecated() {
        return (EAttribute)getDICVALUEType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDICVALUEType_IsDeprecatedInterpretation() {
        return (EReference)getDICVALUEType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICVALUEType_ValueSpecification() {
        return (EAttribute)getDICVALUEType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICVALUEType_DateOfOriginalDefinition() {
        return (EAttribute)getDICVALUEType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICVALUEType_DateOfCurrentVersion() {
        return (EAttribute)getDICVALUEType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICVALUEType_DateOfCurrentRevision() {
        return (EAttribute)getDICVALUEType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICVALUEType_Guid() {
        return (EAttribute)getDICVALUEType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICVALUEType_Guid2() {
        return (EAttribute)getDICVALUEType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDICVALUEType_ValueMeaningId() {
        return (EAttribute)getDICVALUEType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDIMENSIONALEXPONENTSType() {
		if (dimensionalexponentsTypeEClass == null) {
			dimensionalexponentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(81);
		}
		return dimensionalexponentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIMENSIONALEXPONENTSType_LengthExponent() {
        return (EAttribute)getDIMENSIONALEXPONENTSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIMENSIONALEXPONENTSType_MassExponent() {
        return (EAttribute)getDIMENSIONALEXPONENTSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIMENSIONALEXPONENTSType_TimeExponent() {
        return (EAttribute)getDIMENSIONALEXPONENTSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIMENSIONALEXPONENTSType_ElectricCurrentExponent() {
        return (EAttribute)getDIMENSIONALEXPONENTSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIMENSIONALEXPONENTSType_ThermodynamicTemperatureExponent() {
        return (EAttribute)getDIMENSIONALEXPONENTSType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIMENSIONALEXPONENTSType_AmountOfSubstanceExponent() {
        return (EAttribute)getDIMENSIONALEXPONENTSType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDIMENSIONALEXPONENTSType_LuminousIntensityExponent() {
        return (EAttribute)getDIMENSIONALEXPONENTSType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOCUMENTCONTENTType() {
		if (documentcontentTypeEClass == null) {
			documentcontentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(82);
		}
		return documentcontentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTCONTENTType_Revision() {
        return (EAttribute)getDOCUMENTCONTENTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOCUMENTIDENTIFIERNAMELABELType() {
		if (documentidentifiernamelabelTypeEClass == null) {
			documentidentifiernamelabelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(84);
		}
		return documentidentifiernamelabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTIDENTIFIERNAMELABELType_Value() {
        return (EAttribute)getDOCUMENTIDENTIFIERNAMELABELType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTIDENTIFIERNAMELABELType_CountryCode() {
        return (EAttribute)getDOCUMENTIDENTIFIERNAMELABELType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTIDENTIFIERNAMELABELType_LanguageCode() {
        return (EAttribute)getDOCUMENTIDENTIFIERNAMELABELType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOCUMENTIDENTIFIERType() {
		if (documentidentifierTypeEClass == null) {
			documentidentifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(86);
		}
		return documentidentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTIDENTIFIERType_Label() {
        return (EReference)getDOCUMENTIDENTIFIERType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOCUMENTREFERENCEType() {
		if (documentreferenceTypeEClass == null) {
			documentreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(87);
		}
		return documentreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTREFERENCEType_DocumentRef() {
        return (EAttribute)getDOCUMENTREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(88);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_APosterioriSemanticRelationship() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Class() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Constraint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Datatype() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DicUnit() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DicValue() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Document() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Keyword() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ontoml() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Property() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Supplier() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Synonym() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOCUMENTSREFERENCEType() {
		if (documentsreferenceTypeEClass == null) {
			documentsreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(89);
		}
		return documentsreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTSREFERENCEType_Document() {
        return (EReference)getDOCUMENTSREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOCUMENTType() {
		if (documentTypeEClass == null) {
			documentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(90);
		}
		return documentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_NameScope() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTType_DateOfOriginalDefinition() {
        return (EAttribute)getDOCUMENTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTType_DateOfCurrentVersion() {
        return (EAttribute)getDOCUMENTType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTType_DateOfCurrentRevision() {
        return (EAttribute)getDOCUMENTType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTType_Revision() {
        return (EAttribute)getDOCUMENTType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTType_Status() {
        return (EAttribute)getDOCUMENTType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_Translation() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_SourceLanguage() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTType_IsDeprecated() {
        return (EAttribute)getDOCUMENTType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_IsDeprecatedInterpretation() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_PreferredName() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_SynonymousNames() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_ShortName() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_Icon() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_Definition() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_Note() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_Remark() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_Authors() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_PublishingOrganisation() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTType_Content() {
        return (EReference)getDOCUMENTType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTType_Guid() {
        return (EAttribute)getDOCUMENTType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTType_Guid2() {
        return (EAttribute)getDOCUMENTType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTType_Id() {
        return (EAttribute)getDOCUMENTType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOMAINCONSTRAINTSType() {
		if (domainconstraintsTypeEClass == null) {
			domainconstraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(91);
		}
		return domainconstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOMAINCONSTRAINTSType_Constraint() {
        return (EReference)getDOMAINCONSTRAINTSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOMAINCONSTRAINTType() {
		if (domainconstraintTypeEClass == null) {
			domainconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(92);
		}
		return domainconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENUMERATIONCONSTRAINTType() {
		if (enumerationconstraintTypeEClass == null) {
			enumerationconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(93);
		}
		return enumerationconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENUMERATIONCONSTRAINTType_Subset() {
        return (EReference)getENUMERATIONCONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENUMERATIONCONSTRAINTType_ValueMeaning() {
        return (EReference)getENUMERATIONCONSTRAINTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType() {
		if (explicitfunctionalmodelclassextensionTypeEClass == null) {
			explicitfunctionalmodelclassextensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(95);
		}
		return explicitfunctionalmodelclassextensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_RequiredItemValues() {
        return (EReference)getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_AvailableViewsIcon() {
        return (EReference)getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_AvailableViewsMsg() {
        return (EReference)getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_ContextParamIcon() {
        return (EReference)getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType_ContextParamMsg() {
        return (EReference)getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEXPLICITITEMCLASSEXTENSIONType() {
		if (explicititemclassextensionTypeEClass == null) {
			explicititemclassextensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(96);
		}
		return explicititemclassextensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITITEMCLASSEXTENSIONType_AccessIcon() {
        return (EReference)getEXPLICITITEMCLASSEXTENSIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITITEMCLASSEXTENSIONType_ContentMsg() {
        return (EReference)getEXPLICITITEMCLASSEXTENSIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITITEMCLASSEXTENSIONType_CreateIcon() {
        return (EReference)getEXPLICITITEMCLASSEXTENSIONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITITEMCLASSEXTENSIONType_CreateMsg() {
        return (EReference)getEXPLICITITEMCLASSEXTENSIONType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITITEMCLASSEXTENSIONType_ClassPresentationOnPaper() {
        return (EReference)getEXPLICITITEMCLASSEXTENSIONType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPLICITITEMCLASSEXTENSIONType_ClassPresentationOnScreen() {
        return (EReference)getEXPLICITITEMCLASSEXTENSIONType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEXTERNALFILESType() {
		if (externalfilesTypeEClass == null) {
			externalfilesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(97);
		}
		return externalfilesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEXTERNALGRAPHICSType() {
		if (externalgraphicsTypeEClass == null) {
			externalgraphicsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(98);
		}
		return externalgraphicsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXTERNALGRAPHICSType_Representation() {
        return (EReference)getEXTERNALGRAPHICSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEXTERNALRESOURCEType() {
		if (externalresourceTypeEClass == null) {
			externalresourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(100);
		}
		return externalresourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXTERNALRESOURCEType_File() {
        return (EReference)getEXTERNALRESOURCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFILTERType() {
		if (filterTypeEClass == null) {
			filterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(101);
		}
		return filterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFILTERType_ReferencedProperty() {
        return (EReference)getFILTERType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFILTERType_Domain() {
        return (EReference)getFILTERType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFMCLASSVIEWOFType() {
		if (fmclassviewofTypeEClass == null) {
			fmclassviewofTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(102);
		}
		return fmclassviewofTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_CreatedView() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_VCVRange() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedPropertiesFromView() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedTypesFromView() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedDocumentsFromView() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedConstraintsFromView() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_CaseOf() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedPropertiesFromModels() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedTypesFromModels() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedDocumentsFromModels() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedConstraintsFromModels() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ViewOf() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedPropertiesFromItem() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedTypesFromItem() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedDocumentsFromItem() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFMCLASSVIEWOFType_ImportedConstraintsFromItem() {
        return (EReference)getFMCLASSVIEWOFType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFREERELATIONDEFINITIONREFType() {
		if (freerelationdefinitionrefTypeEClass == null) {
			freerelationdefinitionrefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(104);
		}
		return freerelationdefinitionrefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFREERELATIONDEFINITIONREFType_DefintionRef() {
        return (EAttribute)getFREERELATIONDEFINITIONREFType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFREERELATIONENDREFType() {
		if (freerelationendrefTypeEClass == null) {
			freerelationendrefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(106);
		}
		return freerelationendrefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFREERELATIONENDREFType_ElementRef() {
        return (EAttribute)getFREERELATIONENDREFType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFREERELATIONSType() {
		if (freerelationsTypeEClass == null) {
			freerelationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(107);
		}
		return freerelationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFREERELATIONSType_Relation() {
        return (EReference)getFREERELATIONSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFREERELATIONType() {
		if (freerelationTypeEClass == null) {
			freerelationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(108);
		}
		return freerelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFREERELATIONType_Definition() {
        return (EReference)getFREERELATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFREERELATIONType_End() {
        return (EReference)getFREERELATIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFUNCTIONALMODELCLASSType() {
		if (functionalmodelclassTypeEClass == null) {
			functionalmodelclassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(109);
		}
		return functionalmodelclassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_CreatedView() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_VCVRange() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_ImportedPropertiesFromView() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_ImportedTypesFromView() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_ImportedDocumentsFromView() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_ImportedCosntraintsFromView() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_CaseOf() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_ImportedPropertiesFromModels() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_ImportedTypesFromModels() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_ImportedDocumentsFromModels() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFUNCTIONALMODELCLASSType_ImportedConstraintsFromModels() {
        return (EReference)getFUNCTIONALMODELCLASSType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGENERALTEXTType() {
		if (generaltextTypeEClass == null) {
			generaltextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(110);
		}
		return generaltextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGENERALTEXTType_Value() {
        return (EAttribute)getGENERALTEXTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGENERALTEXTType_CountryCode() {
        return (EAttribute)getGENERALTEXTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGENERALTEXTType_LanguageCode() {
        return (EAttribute)getGENERALTEXTType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGEOMETRICCONTEXTType() {
		if (geometriccontextTypeEClass == null) {
			geometriccontextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(111);
		}
		return geometriccontextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGEOMETRICCONTEXTType_Description() {
        return (EReference)getGEOMETRICCONTEXTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGEOMETRICCONTEXTType_CoordinateSoaceDimension() {
        return (EAttribute)getGEOMETRICCONTEXTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGEOMETRICUNITCONTEXTType() {
		if (geometricunitcontextTypeEClass == null) {
			geometricunitcontextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(112);
		}
		return geometricunitcontextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGEOMETRICUNITCONTEXTType_LengthUnit() {
        return (EReference)getGEOMETRICUNITCONTEXTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGEOMETRICUNITCONTEXTType_LengthUnitId() {
        return (EReference)getGEOMETRICUNITCONTEXTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGEOMETRICUNITCONTEXTType_LangleUnit() {
        return (EReference)getGEOMETRICUNITCONTEXTType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGEOMETRICUNITCONTEXTType_AngleUnitId() {
        return (EReference)getGEOMETRICUNITCONTEXTType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRAPHICSType() {
		if (graphicsTypeEClass == null) {
			graphicsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(113);
		}
		return graphicsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHEADERType() {
		if (headerTypeEClass == null) {
			headerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(114);
		}
		return headerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHEADERType_GlobalLanguage() {
        return (EReference)getHEADERType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_Description() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_Version() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_Name() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_DateTimeStamp() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_Author() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_Organisation() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_PreProcessorVersion() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_OriginatingSystem() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_Authorisation() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHEADERType_OntomlInformation() {
        return (EReference)getHEADERType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHEADERType_OntomlStructure() {
        return (EReference)getHEADERType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHEADERType_SupportedVep() {
        return (EReference)getHEADERType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHEADERType_Id() {
        return (EAttribute)getHEADERType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPFILEType() {
		if (httpfileTypeEClass == null) {
			httpfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(117);
		}
		return httpfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPFILEType_HttpFile() {
        return (EAttribute)getHTTPFILEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPFILEType_FileName() {
        return (EAttribute)getHTTPFILEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPFILEType_DirName() {
        return (EAttribute)getHTTPFILEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPFILEType_CountryCode() {
        return (EAttribute)getHTTPFILEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPFILEType_LanguageCode() {
        return (EAttribute)getHTTPFILEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDENTIFIEDDOCUMENTType() {
		if (identifieddocumentTypeEClass == null) {
			identifieddocumentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(118);
		}
		return identifieddocumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIDENTIFIEDDOCUMENTType_DocumentIdentifier() {
        return (EReference)getIDENTIFIEDDOCUMENTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getILLUSTRATIONType() {
		if (illustrationTypeEClass == null) {
			illustrationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(119);
		}
		return illustrationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getILLUSTRATIONType_Code() {
        return (EAttribute)getILLUSTRATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getILLUSTRATIONType_KindOfContent() {
        return (EAttribute)getILLUSTRATIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getILLUSTRATIONType_Width() {
        return (EAttribute)getILLUSTRATIONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getILLUSTRATIONType_Height() {
        return (EAttribute)getILLUSTRATIONType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getILLUSTRATIONType_StandardSize() {
        return (EAttribute)getILLUSTRATIONType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINFORMATIONType() {
		if (informationTypeEClass == null) {
			informationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(122);
		}
		return informationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINFORMATIONType_Revision() {
        return (EAttribute)getINFORMATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINFORMATIONType_PreferredName() {
        return (EReference)getINFORMATIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINFORMATIONType_SynonymousNames() {
        return (EReference)getINFORMATIONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINFORMATIONType_ShortName() {
        return (EReference)getINFORMATIONType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINFORMATIONType_Icon() {
        return (EReference)getINFORMATIONType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINFORMATIONType_Note() {
        return (EReference)getINFORMATIONType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINFORMATIONType_Remark() {
        return (EReference)getINFORMATIONType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINTCURRENCYTYPEType() {
		if (intcurrencytypeTypeEClass == null) {
			intcurrencytypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(123);
		}
		return intcurrencytypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINTCURRENCYTYPEType_ValueFormat() {
        return (EAttribute)getINTCURRENCYTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINTCURRENCYTYPEType_Currency() {
        return (EAttribute)getINTCURRENCYTYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINTCURRENCYTYPEType_CurrencyId() {
        return (EAttribute)getINTCURRENCYTYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINTDICVALUEType() {
		if (intdicvalueTypeEClass == null) {
			intdicvalueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(124);
		}
		return intdicvalueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINTDICVALUEType_ValueCode() {
        return (EAttribute)getINTDICVALUEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINTEGRITYCONSTRAINTType() {
		if (integrityconstraintTypeEClass == null) {
			integrityconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(125);
		}
		return integrityconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINTEGRITYCONSTRAINTType_RedefinedDomain() {
        return (EReference)getINTEGRITYCONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINTMEASURETYPEType() {
		if (intmeasuretypeTypeEClass == null) {
			intmeasuretypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(126);
		}
		return intmeasuretypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINTMEASURETYPEType_ValueFormat() {
        return (EAttribute)getINTMEASURETYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINTMEASURETYPEType_Unit() {
        return (EReference)getINTMEASURETYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINTMEASURETYPEType_AlternativeUnits() {
        return (EReference)getINTMEASURETYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINTMEASURETYPEType_UnitId() {
        return (EReference)getINTMEASURETYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINTMEASURETYPEType_AlternativeUnitIds() {
        return (EReference)getINTMEASURETYPEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINTTYPEType() {
		if (inttypeTypeEClass == null) {
			inttypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(127);
		}
		return inttypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINTTYPEType_ValueFormat() {
        return (EAttribute)getINTTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITEMCLASSCASEOFType() {
		if (itemclasscaseofTypeEClass == null) {
			itemclasscaseofTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(128);
		}
		return itemclasscaseofTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITEMCLASSCASEOFType_SimplifiedDrawing() {
        return (EReference)getITEMCLASSCASEOFType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITEMCLASSCASEOFType_CodedName() {
        return (EAttribute)getITEMCLASSCASEOFType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITEMCLASSCASEOFType_InstanceSharable() {
        return (EAttribute)getITEMCLASSCASEOFType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITEMCLASSCASEOFType_IsCaseOf() {
        return (EReference)getITEMCLASSCASEOFType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITEMCLASSCASEOFType_ImportedProperties() {
        return (EReference)getITEMCLASSCASEOFType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITEMCLASSCASEOFType_ImportedTypes() {
        return (EReference)getITEMCLASSCASEOFType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITEMCLASSCASEOFType_ImportedDocuments() {
        return (EReference)getITEMCLASSCASEOFType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITEMCLASSCASEOFType_ImportedConstraints() {
        return (EReference)getITEMCLASSCASEOFType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITEMCLASSType() {
		if (itemclassTypeEClass == null) {
			itemclassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(129);
		}
		return itemclassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITEMCLASSType_SimplifiedDrawing() {
        return (EReference)getITEMCLASSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITEMCLASSType_CodedName() {
        return (EAttribute)getITEMCLASSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITEMCLASSType_InstanceSharable() {
        return (EAttribute)getITEMCLASSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITSVALUESType() {
		if (itsvaluesTypeEClass == null) {
			itsvaluesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(130);
		}
		return itsvaluesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITSVALUESType_DicValue() {
        return (EReference)getITSVALUESType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKEYWORDLABELType() {
		if (keywordlabelTypeEClass == null) {
			keywordlabelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(131);
		}
		return keywordlabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKEYWORDLABELType_Value() {
        return (EAttribute)getKEYWORDLABELType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKEYWORDLABELType_CountryCode() {
        return (EAttribute)getKEYWORDLABELType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKEYWORDLABELType_LanguageCode() {
        return (EAttribute)getKEYWORDLABELType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKEYWORDREFERENCESType() {
		if (keywordreferencesTypeEClass == null) {
			keywordreferencesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(132);
		}
		return keywordreferencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKEYWORDREFERENCESType_KeywordRef() {
        return (EAttribute)getKEYWORDREFERENCESType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKEYWORDType() {
		if (keywordTypeEClass == null) {
			keywordTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(134);
		}
		return keywordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKEYWORDType_Label() {
        return (EReference)getKEYWORDType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLANGUAGEType() {
		if (languageTypeEClass == null) {
			languageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(137);
		}
		return languageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANGUAGEType_CountryCode() {
        return (EAttribute)getLANGUAGEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANGUAGEType_LanguageCode() {
        return (EAttribute)getLANGUAGEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLEVELType() {
		if (levelTypeEClass == null) {
			levelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(138);
		}
		return levelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLEVELType_Min() {
        return (EReference)getLEVELType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLEVELType_Nom() {
        return (EReference)getLEVELType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLEVELType_Typ() {
        return (EReference)getLEVELType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLEVELType_Max() {
        return (EReference)getLEVELType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLEVELTYPEType() {
		if (leveltypeTypeEClass == null) {
			leveltypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(139);
		}
		return leveltypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLEVELTYPEType_Levels() {
        return (EReference)getLEVELTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLEVELTYPEType_ValueType() {
        return (EReference)getLEVELTYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLIBRARYIIMIDENTIFICATIONType() {
		if (libraryiimidentificationTypeEClass == null) {
			libraryiimidentificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(140);
		}
		return libraryiimidentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLIBRARYIIMIDENTIFICATIONType_SourceDocumentIdentifier() {
        return (EAttribute)getLIBRARYIIMIDENTIFICATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLIBRARYIIMIDENTIFICATIONType_Status() {
        return (EAttribute)getLIBRARYIIMIDENTIFICATIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLIBRARYIIMIDENTIFICATIONType_Name() {
        return (EAttribute)getLIBRARYIIMIDENTIFICATIONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLIBRARYIIMIDENTIFICATIONType_Date() {
        return (EAttribute)getLIBRARYIIMIDENTIFICATIONType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLIBRARYIIMIDENTIFICATIONType_Application() {
        return (EAttribute)getLIBRARYIIMIDENTIFICATIONType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLIBRARYIIMIDENTIFICATIONType_Level() {
        return (EAttribute)getLIBRARYIIMIDENTIFICATIONType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLIBRARYINSTANDARDFORMATType() {
		if (libraryinstandardformatTypeEClass == null) {
			libraryinstandardformatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(141);
		}
		return libraryinstandardformatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLIBRARYType() {
		if (libraryTypeEClass == null) {
			libraryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(142);
		}
		return libraryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLIBRARYType_ContainedClassExtensions() {
        return (EReference)getLIBRARYType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLIBRARYType_ResponsibleSupplier() {
        return (EReference)getLIBRARYType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLISTTYPEType() {
		if (listtypeTypeEClass == null) {
			listtypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(143);
		}
		return listtypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLISTTYPEType_Bound1() {
        return (EAttribute)getLISTTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLISTTYPEType_Bound2() {
        return (EAttribute)getLISTTYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLISTTYPEType_ValueType() {
        return (EReference)getLISTTYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLISTTYPEType_Uniqueness() {
        return (EAttribute)getLISTTYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAPPINGFUNCTIONType() {
		if (mappingfunctionTypeEClass == null) {
			mappingfunctionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(144);
		}
		return mappingfunctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMATHEMATICALSTRINGType() {
		if (mathematicalstringTypeEClass == null) {
			mathematicalstringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(145);
		}
		return mathematicalstringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMATHEMATICALSTRINGType_TextRepresentation() {
        return (EAttribute)getMATHEMATICALSTRINGType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMESSAGEType() {
		if (messageTypeEClass == null) {
			messageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(146);
		}
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMESSAGEType_Code() {
        return (EAttribute)getMESSAGEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNAMEDTYPEType() {
		if (namedtypeTypeEClass == null) {
			namedtypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(147);
		}
		return namedtypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNAMEDTYPEType_ReferredType() {
        return (EReference)getNAMEDTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNAMEDUNITType() {
		if (namedunitTypeEClass == null) {
			namedunitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(148);
		}
		return namedunitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNAMEDUNITType_Dimensions() {
        return (EReference)getNAMEDUNITType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNONDEPENDENTPDETType() {
		if (nondependentpdetTypeEClass == null) {
			nondependentpdetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(149);
		}
		return nondependentpdetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNONINSTANTIABLEFUNCTIONALVIEWCLASSType() {
		if (noninstantiablefunctionalviewclassTypeEClass == null) {
			noninstantiablefunctionalviewclassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(150);
		}
		return noninstantiablefunctionalviewclassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNONINSTANTIABLEFUNCTIONALVIEWCLASSType_ViewControlVariables() {
        return (EReference)getNONINSTANTIABLEFUNCTIONALVIEWCLASSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNONQUANTITATIVECODETYPEType() {
		if (nonquantitativecodetypeTypeEClass == null) {
			nonquantitativecodetypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(151);
		}
		return nonquantitativecodetypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNONQUANTITATIVECODETYPEType_ValueFormat() {
        return (EAttribute)getNONQUANTITATIVECODETYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNONQUANTITATIVECODETYPEType_ItsValues() {
        return (EReference)getNONQUANTITATIVECODETYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNONQUANTITATIVECODETYPEType_SourceDocOfValueDomain() {
        return (EReference)getNONQUANTITATIVECODETYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNONQUANTITATIVECODETYPEType_Definition() {
        return (EReference)getNONQUANTITATIVECODETYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNONQUANTITATIVECODETYPEType_Icon() {
        return (EReference)getNONQUANTITATIVECODETYPEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNONQUANTITATIVEINTTYPEType() {
		if (nonquantitativeinttypeTypeEClass == null) {
			nonquantitativeinttypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(152);
		}
		return nonquantitativeinttypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNONQUANTITATIVEINTTYPEType_ValueFormat() {
        return (EAttribute)getNONQUANTITATIVEINTTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNONQUANTITATIVEINTTYPEType_ItsValues() {
        return (EReference)getNONQUANTITATIVEINTTYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNONQUANTITATIVEINTTYPEType_SourceDocOfValueDomain() {
        return (EReference)getNONQUANTITATIVEINTTYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNONQUANTITATIVEINTTYPEType_Definition() {
        return (EReference)getNONQUANTITATIVEINTTYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNONQUANTITATIVEINTTYPEType_Icon() {
        return (EReference)getNONQUANTITATIVEINTTYPEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNONSIUNITType() {
		if (nonsiunitTypeEClass == null) {
			nonsiunitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(153);
		}
		return nonsiunitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNONSIUNITType_Name() {
        return (EAttribute)getNONSIUNITType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNONTRANSLATABLESTRINGTYPEType() {
		if (nontranslatablestringtypeTypeEClass == null) {
			nontranslatablestringtypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(154);
		}
		return nontranslatablestringtypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNONTRANSLATABLESTRINGTYPEType_ValueFormat() {
        return (EAttribute)getNONTRANSLATABLESTRINGTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUMBERTYPEType() {
		if (numbertypeTypeEClass == null) {
			numbertypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(155);
		}
		return numbertypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUMBERTYPEType_ValueFormat() {
        return (EAttribute)getNUMBERTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getONTOMLType() {
		if (ontomlTypeEClass == null) {
			ontomlTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(157);
		}
		return ontomlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getONTOMLType_Header() {
        return (EReference)getONTOMLType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getONTOMLType_Dictionary() {
        return (EReference)getONTOMLType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getONTOMLType_Library() {
        return (EReference)getONTOMLType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORGANIZATIONType() {
		if (organizationTypeEClass == null) {
			organizationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(158);
		}
		return organizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORGANIZATIONType_Id() {
        return (EAttribute)getORGANIZATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORGANIZATIONType_Name() {
        return (EAttribute)getORGANIZATIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORGANIZATIONType_Description() {
        return (EAttribute)getORGANIZATIONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPERSONType() {
		if (personTypeEClass == null) {
			personTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(159);
		}
		return personTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPERSONType_Id() {
        return (EAttribute)getPERSONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPERSONType_LastName() {
        return (EAttribute)getPERSONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPERSONType_FirstName() {
        return (EAttribute)getPERSONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPERSONType_MiddleNames() {
        return (EReference)getPERSONType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPERSONType_PrefixTitles() {
        return (EReference)getPERSONType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPERSONType_SuffixTitles() {
        return (EReference)getPERSONType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPLACEMENTTYPEType() {
		if (placementtypeTypeEClass == null) {
			placementtypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(160);
		}
		return placementtypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPLACEMENTTYPEType_ClassRef() {
        return (EAttribute)getPLACEMENTTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOSTCONDITIONType() {
		if (postconditionTypeEClass == null) {
			postconditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(164);
		}
		return postconditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOSTCONDITIONType_Filter() {
        return (EReference)getPOSTCONDITIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRECONDITIONType() {
		if (preconditionTypeEClass == null) {
			preconditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(165);
		}
		return preconditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPRECONDITIONType_Filter() {
        return (EReference)getPRECONDITIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPREFERREDNAMELABELType() {
		if (preferrednamelabelTypeEClass == null) {
			preferrednamelabelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(166);
		}
		return preferrednamelabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPREFERREDNAMELABELType_Value() {
        return (EAttribute)getPREFERREDNAMELABELType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPREFERREDNAMELABELType_CountryCode() {
        return (EAttribute)getPREFERREDNAMELABELType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPREFERREDNAMELABELType_LanguageCode() {
        return (EAttribute)getPREFERREDNAMELABELType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPREFERREDNAMEType() {
		if (preferrednameTypeEClass == null) {
			preferrednameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(167);
		}
		return preferrednameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPREFERREDNAMEType_Label() {
        return (EReference)getPREFERREDNAMEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROGRAMREFERENCETYPEType() {
		if (programreferencetypeTypeEClass == null) {
			programreferencetypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(170);
		}
		return programreferencetypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROGRAMREFERENCETYPEType_InParameters() {
        return (EReference)getPROGRAMREFERENCETYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROGRAMREFERENCETYPEType_OutParameters() {
        return (EReference)getPROGRAMREFERENCETYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROGRAMREFERENCETYPEType_InoutParameters() {
        return (EReference)getPROGRAMREFERENCETYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROGRAMREFERENCETYPEType_ClassRef() {
        return (EAttribute)getPROGRAMREFERENCETYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTIESREFERENCEType() {
		if (propertiesreferenceTypeEClass == null) {
			propertiesreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(171);
		}
		return propertiesreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTIESREFERENCEType_Property() {
        return (EReference)getPROPERTIESREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTYCLASSIFICATIONType() {
		if (propertyclassificationTypeEClass == null) {
			propertyclassificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(172);
		}
		return propertyclassificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYCLASSIFICATIONType_ItsValue() {
        return (EAttribute)getPROPERTYCLASSIFICATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYCLASSIFICATIONType_PropDef() {
        return (EReference)getPROPERTYCLASSIFICATIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTYCONSTRAINTType() {
		if (propertyconstraintTypeEClass == null) {
			propertyconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(173);
		}
		return propertyconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYCONSTRAINTType_ConstrainedProperty() {
        return (EReference)getPROPERTYCONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTYMAPPINGType() {
		if (propertymappingTypeEClass == null) {
			propertymappingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(175);
		}
		return propertymappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYMAPPINGType_Domain() {
        return (EReference)getPROPERTYMAPPINGType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYMAPPINGType_Range() {
        return (EReference)getPROPERTYMAPPINGType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYMAPPINGType_Function() {
        return (EReference)getPROPERTYMAPPINGType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTYREFERENCEType() {
		if (propertyreferenceTypeEClass == null) {
			propertyreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(176);
		}
		return propertyreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYREFERENCEType_OrderNumber() {
        return (EAttribute)getPROPERTYREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYREFERENCEType_PropertyRef() {
        return (EAttribute)getPROPERTYREFERENCEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTYType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(177);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_NameScope() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_DateOfOriginalDefinition() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_DateOfCurrentVersion() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_DateOfCurrentRevision() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_Revision() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_Status() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_Translation() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_SourceLanguage() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_IsDeprecated() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_IsDeprecatedInterpretation() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_PreferredName() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_SynonymousNames() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_ShortName() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_Icon() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_Definition() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_SourceDocOfDefinition() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_Note() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_Remark() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_PreferredSymbol() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_SynonymousSymbols() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_Figure() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_DetClassification() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_Domain() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_Formula() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_SynonymReferences() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_SuggestedValueList() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYType_FreeRelations() {
        return (EReference)getPROPERTYType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_Guid() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_Guid2() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYType_Id() {
        return (EAttribute)getPROPERTYType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTYVALUERECOMMENDEDPRESENTATIONType() {
		if (propertyvaluerecommendedpresentationTypeEClass == null) {
			propertyvaluerecommendedpresentationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(178);
		}
		return propertyvaluerecommendedpresentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYVALUERECOMMENDEDPRESENTATIONType_PropDef() {
        return (EReference)getPROPERTYVALUERECOMMENDEDPRESENTATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTYVALUERECOMMENDEDPRESENTATIONType_RecommendedPresentationUnit() {
        return (EReference)getPROPERTYVALUERECOMMENDEDPRESENTATIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROPERTYVALUERECOMMENDEDPRESENTATIONType_RecommendedPresentationFormat() {
        return (EAttribute)getPROPERTYVALUERECOMMENDEDPRESENTATIONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRANGECONSTRAINTType() {
		if (rangeconstraintTypeEClass == null) {
			rangeconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(179);
		}
		return rangeconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRANGECONSTRAINTType_MinValue() {
        return (EAttribute)getRANGECONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRANGECONSTRAINTType_MaxValue() {
        return (EAttribute)getRANGECONSTRAINTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRATIONALMEASURETYPEType() {
		if (rationalmeasuretypeTypeEClass == null) {
			rationalmeasuretypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(180);
		}
		return rationalmeasuretypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRATIONALMEASURETYPEType_ValueFormat() {
        return (EAttribute)getRATIONALMEASURETYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRATIONALMEASURETYPEType_Unit() {
        return (EReference)getRATIONALMEASURETYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRATIONALMEASURETYPEType_AlternativeUnits() {
        return (EReference)getRATIONALMEASURETYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRATIONALMEASURETYPEType_UnitId() {
        return (EReference)getRATIONALMEASURETYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRATIONALMEASURETYPEType_AlternativeUnitIds() {
        return (EReference)getRATIONALMEASURETYPEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRATIONALTYPEType() {
		if (rationaltypeTypeEClass == null) {
			rationaltypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(181);
		}
		return rationaltypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRATIONALTYPEType_ValueFormat() {
        return (EAttribute)getRATIONALTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREALCURRENCYTYPEType() {
		if (realcurrencytypeTypeEClass == null) {
			realcurrencytypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(182);
		}
		return realcurrencytypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALCURRENCYTYPEType_ValueFormat() {
        return (EAttribute)getREALCURRENCYTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALCURRENCYTYPEType_Currency() {
        return (EAttribute)getREALCURRENCYTYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALCURRENCYTYPEType_CurrencyId() {
        return (EAttribute)getREALCURRENCYTYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREALMEASURETYPEType() {
		if (realmeasuretypeTypeEClass == null) {
			realmeasuretypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(183);
		}
		return realmeasuretypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALMEASURETYPEType_ValueFormat() {
        return (EAttribute)getREALMEASURETYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALMEASURETYPEType_Unit() {
        return (EReference)getREALMEASURETYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALMEASURETYPEType_AlternativeUnits() {
        return (EReference)getREALMEASURETYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALMEASURETYPEType_UnitId() {
        return (EReference)getREALMEASURETYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALMEASURETYPEType_AlternativeUnitIds() {
        return (EReference)getREALMEASURETYPEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREALTYPEType() {
		if (realtypeTypeEClass == null) {
			realtypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(184);
		}
		return realtypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALTYPEType_ValueFormat() {
        return (EAttribute)getREALTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRECOMMENDEDPRESENTATIONType() {
		if (recommendedpresentationTypeEClass == null) {
			recommendedpresentationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(185);
		}
		return recommendedpresentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRECOMMENDEDPRESENTATIONType_PropertyValueRecommendedPresentation() {
        return (EReference)getRECOMMENDEDPRESENTATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREFERENCEDDOCUMENTType() {
		if (referenceddocumentTypeEClass == null) {
			referenceddocumentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(186);
		}
		return referenceddocumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREFERENCEDDOCUMENTType_DocumentReference() {
        return (EReference)getREFERENCEDDOCUMENTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREFERENCEDGRAPHICSType() {
		if (referencedgraphicsTypeEClass == null) {
			referencedgraphicsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(187);
		}
		return referencedgraphicsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREFERENCEDGRAPHICSType_GraphicsReference() {
        return (EReference)getREFERENCEDGRAPHICSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREMOTELOCATIONSType() {
		if (remotelocationsTypeEClass == null) {
			remotelocationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(188);
		}
		return remotelocationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREMOTELOCATIONSType_RemoteLocation() {
        return (EReference)getREMOTELOCATIONSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteLocationType() {
		if (remoteLocationTypeEClass == null) {
			remoteLocationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(189);
		}
		return remoteLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteLocationType_Value() {
        return (EAttribute)getRemoteLocationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteLocationType_Language() {
        return (EAttribute)getRemoteLocationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREPRESENTATIONPDETType() {
		if (representationpdetTypeEClass == null) {
			representationpdetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(190);
		}
		return representationpdetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREPRESENTATIONREFERENCETYPEType() {
		if (representationreferencetypeTypeEClass == null) {
			representationreferencetypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(191);
		}
		return representationreferencetypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREPRESENTATIONREFERENCETYPEType_ClassRef() {
        return (EAttribute)getREPRESENTATIONREFERENCETYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREUSABLEKEYWORDType() {
		if (reusablekeywordTypeEClass == null) {
			reusablekeywordTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(192);
		}
		return reusablekeywordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREUSABLENAMEType() {
		if (reusablenameTypeEClass == null) {
			reusablenameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(194);
		}
		return reusablenameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREUSABLENAMEType_DateOfOriginalDefinition() {
        return (EAttribute)getREUSABLENAMEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREUSABLENAMEType_DateOfCurrentVersion() {
        return (EAttribute)getREUSABLENAMEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREUSABLENAMEType_DateOfCurrentRevision() {
        return (EAttribute)getREUSABLENAMEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREUSABLENAMEType_Revision() {
        return (EAttribute)getREUSABLENAMEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREUSABLENAMEType_Status() {
        return (EAttribute)getREUSABLENAMEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREUSABLENAMEType_SourceLanguage() {
        return (EReference)getREUSABLENAMEType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREUSABLENAMEType_IsDeprecated() {
        return (EAttribute)getREUSABLENAMEType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREUSABLENAMEType_IsDeprecatedInterpretation() {
        return (EReference)getREUSABLENAMEType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREUSABLENAMEType_Name() {
        return (EReference)getREUSABLENAMEType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREUSABLENAMEType_Icon() {
        return (EReference)getREUSABLENAMEType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREUSABLENAMEType_Note() {
        return (EReference)getREUSABLENAMEType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREUSABLENAMEType_Guid() {
        return (EAttribute)getREUSABLENAMEType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREUSABLENAMEType_Guid2() {
        return (EAttribute)getREUSABLENAMEType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREUSABLENAMEType_Id() {
        return (EAttribute)getREUSABLENAMEType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREUSABLESYNONYMType() {
		if (reusablesynonymTypeEClass == null) {
			reusablesynonymTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(195);
		}
		return reusablesynonymTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSETTYPEType() {
		if (settypeTypeEClass == null) {
			settypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(197);
		}
		return settypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSETTYPEType_Bound1() {
        return (EAttribute)getSETTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSETTYPEType_Bound2() {
        return (EAttribute)getSETTYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSETTYPEType_ValueType() {
        return (EReference)getSETTYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSETWITHSUBSETCONSTRAINTTYPEType() {
		if (setwithsubsetconstrainttypeTypeEClass == null) {
			setwithsubsetconstrainttypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(198);
		}
		return setwithsubsetconstrainttypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSETWITHSUBSETCONSTRAINTTYPEType_Bound1() {
        return (EAttribute)getSETWITHSUBSETCONSTRAINTTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSETWITHSUBSETCONSTRAINTTYPEType_Bound2() {
        return (EAttribute)getSETWITHSUBSETCONSTRAINTTYPEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSETWITHSUBSETCONSTRAINTTYPEType_ValueType() {
        return (EReference)getSETWITHSUBSETCONSTRAINTTYPEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSETWITHSUBSETCONSTRAINTTYPEType_CardinalMin() {
        return (EAttribute)getSETWITHSUBSETCONSTRAINTTYPEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSETWITHSUBSETCONSTRAINTTYPEType_CardinalMax() {
        return (EAttribute)getSETWITHSUBSETCONSTRAINTTYPEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSHORTNAMELABELType() {
		if (shortnamelabelTypeEClass == null) {
			shortnamelabelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(199);
		}
		return shortnamelabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSHORTNAMELABELType_Value() {
        return (EAttribute)getSHORTNAMELABELType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSHORTNAMELABELType_CountryCode() {
        return (EAttribute)getSHORTNAMELABELType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSHORTNAMELABELType_LanguageCode() {
        return (EAttribute)getSHORTNAMELABELType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSHORTNAMEType() {
		if (shortnameTypeEClass == null) {
			shortnameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(200);
		}
		return shortnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSHORTNAMEType_Label() {
        return (EReference)getSHORTNAMEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSIUNITType() {
		if (siunitTypeEClass == null) {
			siunitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(206);
		}
		return siunitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSIUNITType_Prefix() {
        return (EAttribute)getSIUNITType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSIUNITType_Name() {
        return (EAttribute)getSIUNITType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOURCEDOCUMENTType() {
		if (sourcedocumentTypeEClass == null) {
			sourcedocumentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(207);
		}
		return sourcedocumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTRINGDICVALUEType() {
		if (stringdicvalueTypeEClass == null) {
			stringdicvalueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(211);
		}
		return stringdicvalueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTRINGDICVALUEType_ValueCode() {
        return (EAttribute)getSTRINGDICVALUEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTRINGPATTERNCONSTRAINTType() {
		if (stringpatternconstraintTypeEClass == null) {
			stringpatternconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(212);
		}
		return stringpatternconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTRINGPATTERNCONSTRAINTType_Pattern() {
        return (EAttribute)getSTRINGPATTERNCONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTRINGSIZECONSTRAINTType() {
		if (stringsizeconstraintTypeEClass == null) {
			stringsizeconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(213);
		}
		return stringsizeconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTRINGSIZECONSTRAINTType_MinLength() {
        return (EAttribute)getSTRINGSIZECONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTRINGSIZECONSTRAINTType_MaxLength() {
        return (EAttribute)getSTRINGSIZECONSTRAINTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTRINGSType() {
		if (stringsTypeEClass == null) {
			stringsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(214);
		}
		return stringsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTRINGSType_Value() {
        return (EAttribute)getSTRINGSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTRINGTYPEType() {
		if (stringtypeTypeEClass == null) {
			stringtypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(215);
		}
		return stringtypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTRINGTYPEType_ValueFormat() {
        return (EAttribute)getSTRINGTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUBCLASSCONSTRAINTType() {
		if (subclassconstraintTypeEClass == null) {
			subclassconstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(216);
		}
		return subclassconstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBCLASSCONSTRAINTType_Subclasses() {
        return (EReference)getSUBCLASSCONSTRAINTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUBSETType() {
		if (subsetTypeEClass == null) {
			subsetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(217);
		}
		return subsetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUBSETType_ValueGroup() {
        return (EAttribute)getSUBSETType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_StringValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_BagValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_BooleanValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_ComplexValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_CompositeValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_ControlledValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_CurrencyValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_DateValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_DateTimeValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_FileValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_IntegerValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_ItemReferenceValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_LocalizedTextValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_MeasureQualifiedNumberValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_MeasureRangeValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_MeasureSingleNumberValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_NullValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_RationalValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_RealValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_SequenceValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_SetValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_TimeValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_YearMonthValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUBSETType_YearValue() {
        return (EReference)getSUBSETType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUPPLIERREFERENCEType() {
		if (supplierreferenceTypeEClass == null) {
			supplierreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(220);
		}
		return supplierreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERREFERENCEType_SupplierRef() {
        return (EAttribute)getSUPPLIERREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUPPLIERSREFERENCEType() {
		if (suppliersreferenceTypeEClass == null) {
			suppliersreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(221);
		}
		return suppliersreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUPPLIERSREFERENCEType_Supplier() {
        return (EReference)getSUPPLIERSREFERENCEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUPPLIERType() {
		if (supplierTypeEClass == null) {
			supplierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(222);
		}
		return supplierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_DateOfOriginalDefinition() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_DateOfCurrentVersion() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_DateOfCurrentRevision() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_Revision() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_Status() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_IsDeprecated() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUPPLIERType_IsDeprecatedInterpretation() {
        return (EReference)getSUPPLIERType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUPPLIERType_Org() {
        return (EReference)getSUPPLIERType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_InternalLocation() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_StreetNumber() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_Street() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_PostalBox() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_Town() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_Region() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_PostalCode() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_Country() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_FacsimileNumber() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_TelephoneNumber() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_ElectronicMailAddress() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_TelexNumber() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSUPPLIERType_Id() {
        return (EAttribute)getSUPPLIERType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUPPORTEDVEPType() {
		if (supportedvepTypeEClass == null) {
			supportedvepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(223);
		}
		return supportedvepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUPPORTEDVEPType_ViewExchangeProtocolIdentification() {
        return (EReference)getSUPPORTEDVEPType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSYNONYMOUSNAMELABELType() {
		if (synonymousnamelabelTypeEClass == null) {
			synonymousnamelabelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(224);
		}
		return synonymousnamelabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSYNONYMOUSNAMELABELType_Value() {
        return (EAttribute)getSYNONYMOUSNAMELABELType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSYNONYMOUSNAMELABELType_CountryCode() {
        return (EAttribute)getSYNONYMOUSNAMELABELType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSYNONYMOUSNAMELABELType_LanguageCode() {
        return (EAttribute)getSYNONYMOUSNAMELABELType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSYNONYMOUSNAMEType() {
		if (synonymousnameTypeEClass == null) {
			synonymousnameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(225);
		}
		return synonymousnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYNONYMOUSNAMEType_Label() {
        return (EReference)getSYNONYMOUSNAMEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSYNONYMOUSSYMBOLSType() {
		if (synonymoussymbolsTypeEClass == null) {
			synonymoussymbolsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(227);
		}
		return synonymoussymbolsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYNONYMOUSSYMBOLSType_MathematicalString() {
        return (EReference)getSYNONYMOUSSYMBOLSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSYNONYMREFERENCESType() {
		if (synonymreferencesTypeEClass == null) {
			synonymreferencesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(228);
		}
		return synonymreferencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSYNONYMREFERENCESType_SynonymRef() {
        return (EAttribute)getSYNONYMREFERENCESType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEXTType() {
		if (textTypeEClass == null) {
			textTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(230);
		}
		return textTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEXTType_Text() {
        return (EReference)getTEXTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTIMEDATATYPEType() {
		if (timedatatypeTypeEClass == null) {
			timedatatypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(231);
		}
		return timedatatypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTIMEDATATYPEType_ValueFormat() {
        return (EAttribute)getTIMEDATATYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRANSLATABLESTRINGTYPEType() {
		if (translatablestringtypeTypeEClass == null) {
			translatablestringtypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(232);
		}
		return translatablestringtypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRANSLATABLESTRINGTYPEType_ValueFormat() {
        return (EAttribute)getTRANSLATABLESTRINGTYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRANSLATIONDATAType() {
		if (translationdataTypeEClass == null) {
			translationdataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(233);
		}
		return translationdataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRANSLATIONDATAType_Language() {
        return (EReference)getTRANSLATIONDATAType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRANSLATIONDATAType_ResponsibleTranslator() {
        return (EReference)getTRANSLATIONDATAType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRANSLATIONDATAType_TranslationRevision() {
        return (EAttribute)getTRANSLATIONDATAType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRANSLATIONDATAType_DateOfCurrentTranslationRevision() {
        return (EAttribute)getTRANSLATIONDATAType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRANSLATIONType() {
		if (translationTypeEClass == null) {
			translationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(234);
		}
		return translationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRANSLATIONType_TranslationData() {
        return (EReference)getTRANSLATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUNITType() {
		if (unitTypeEClass == null) {
			unitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(235);
		}
		return unitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURITYPEType() {
		if (uritypeTypeEClass == null) {
			uritypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(236);
		}
		return uritypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURITYPEType_ValueFormat() {
        return (EAttribute)getURITYPEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCVRANGEType() {
		if (vcvrangeTypeEClass == null) {
			vcvrangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(241);
		}
		return vcvrangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCVRANGEType_ViewControlVariableRange() {
        return (EReference)getVCVRANGEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVIEWCONTROLVARIABLERANGEType() {
		if (viewcontrolvariablerangeTypeEClass == null) {
			viewcontrolvariablerangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(243);
		}
		return viewcontrolvariablerangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVIEWCONTROLVARIABLERANGEType_ParameterType() {
        return (EReference)getVIEWCONTROLVARIABLERANGEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVIEWCONTROLVARIABLERANGEType_RangeLobound() {
        return (EAttribute)getVIEWCONTROLVARIABLERANGEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVIEWCONTROLVARIABLERANGEType_RangeHibound() {
        return (EAttribute)getVIEWCONTROLVARIABLERANGEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType() {
		if (viewexchangeprotocolidentificationTypeEClass == null) {
			viewexchangeprotocolidentificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(244);
		}
		return viewexchangeprotocolidentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_SourceDocumentIdentifier() {
        return (EAttribute)getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Status() {
        return (EAttribute)getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Name() {
        return (EAttribute)getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Date() {
        return (EAttribute)getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Application() {
        return (EAttribute)getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType_Level() {
        return (EAttribute)getVIEWEXCHANGEPROTOCOLIDENTIFICATIONType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getILLUSTRATIONTYPEType() {
		if (illustrationtypeTypeEEnum == null) {
			illustrationtypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(120);
		}
		return illustrationtypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSIPREFIXType() {
		if (siprefixTypeEEnum == null) {
			siprefixTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(202);
		}
		return siprefixTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSIUNITNAMEType() {
		if (siunitnameTypeEEnum == null) {
			siunitnameTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(204);
		}
		return siunitnameTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSTANDARDSIZEType() {
		if (standardsizeTypeEEnum == null) {
			standardsizeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(208);
		}
		return standardsizeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVALUESPECIFICATIONType() {
		if (valuespecificationTypeEEnum == null) {
			valuespecificationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(239);
		}
		return valuespecificationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getABSOLUTEURLTYPEType() {
		if (absoluteurltypeTypeEDataType == null) {
			absoluteurltypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(0);
		}
		return absoluteurltypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAPosterioriSemanticRelationId() {
		if (aPosterioriSemanticRelationIdEDataType == null) {
			aPosterioriSemanticRelationIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(4);
		}
		return aPosterioriSemanticRelationIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassId() {
		if (classIdEDataType == null) {
			classIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(22);
		}
		return classIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassRefType() {
		if (classRefTypeEDataType == null) {
			classRefTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(28);
		}
		return classRefTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassRefType1() {
		if (classRefType1EDataType == null) {
			classRefType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(29);
		}
		return classRefType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassRefType2() {
		if (classRefType2EDataType == null) {
			classRefType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(30);
		}
		return classRefType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassRefType3() {
		if (classRefType3EDataType == null) {
			classRefType3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(31);
		}
		return classRefType3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassRefType4() {
		if (classRefType4EDataType == null) {
			classRefType4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(32);
		}
		return classRefType4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassRefType5() {
		if (classRefType5EDataType == null) {
			classRefType5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(33);
		}
		return classRefType5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConstraintId() {
		if (constraintIdEDataType == null) {
			constraintIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(38);
		}
		return constraintIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCOUNTRYCODEType() {
		if (countrycodeTypeEDataType == null) {
			countrycodeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(56);
		}
		return countrycodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCURRENCYCODEType() {
		if (currencycodeTypeEDataType == null) {
			currencycodeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(58);
		}
		return currencycodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrencyId() {
		if (currencyIdEDataType == null) {
			currencyIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(59);
		}
		return currencyIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataTypeId() {
		if (dataTypeIdEDataType == null) {
			dataTypeIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(60);
		}
		return dataTypeIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDATETYPEType() {
		if (datetypeTypeEDataType == null) {
			datetypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(66);
		}
		return datetypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDETCLASSIFICATIONTYPEType() {
		if (detclassificationtypeTypeEDataType == null) {
			detclassificationtypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(70);
		}
		return detclassificationtypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDicUnitId() {
		if (dicUnitIdEDataType == null) {
			dicUnitIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(75);
		}
		return dicUnitIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDicValueId() {
		if (dicValueIdEDataType == null) {
			dicValueIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(79);
		}
		return dicValueIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDocumentId() {
		if (documentIdEDataType == null) {
			documentIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(83);
		}
		return documentIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDOCUMENTIDENTIFIERNAMEType() {
		if (documentidentifiernameTypeEDataType == null) {
			documentidentifiernameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(85);
		}
		return documentidentifiernameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEptosGUID() {
		if (eptosGUIDEDataType == null) {
			eptosGUIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(94);
		}
		return eptosGUIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEXTERNALITEMCODETYPEType() {
		if (externalitemcodetypeTypeEDataType == null) {
			externalitemcodetypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(99);
		}
		return externalitemcodetypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFreeRelationDefinitionId() {
		if (freeRelationDefinitionIdEDataType == null) {
			freeRelationDefinitionIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(103);
		}
		return freeRelationDefinitionIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFreeRelationEndId() {
		if (freeRelationEndIdEDataType == null) {
			freeRelationEndIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(105);
		}
		return freeRelationEndIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHTTPDIRECTORYNAMETYPEType() {
		if (httpdirectorynametypeTypeEDataType == null) {
			httpdirectorynametypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(115);
		}
		return httpdirectorynametypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHTTPFILENAMETYPEType() {
		if (httpfilenametypeTypeEDataType == null) {
			httpfilenametypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(116);
		}
		return httpfilenametypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getILLUSTRATIONTYPETypeObject() {
		if (illustrationtypeTypeObjectEDataType == null) {
			illustrationtypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(121);
		}
		return illustrationtypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKEYWORDREFERENCEType() {
		if (keywordreferenceTypeEDataType == null) {
			keywordreferenceTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(133);
		}
		return keywordreferenceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKEYWORDTYPEType() {
		if (keywordtypeTypeEDataType == null) {
			keywordtypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(135);
		}
		return keywordtypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLANGUAGECODEType() {
		if (languagecodeTypeEDataType == null) {
			languagecodeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(136);
		}
		return languagecodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOntologyId() {
		if (ontologyIdEDataType == null) {
			ontologyIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(156);
		}
		return ontologyIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPOSITIVELENGTHMEASUREType() {
		if (positivelengthmeasureTypeEDataType == null) {
			positivelengthmeasureTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(161);
		}
		return positivelengthmeasureTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPOSITIVEPLANEANGLEMEASUREType() {
		if (positiveplaneanglemeasureTypeEDataType == null) {
			positiveplaneanglemeasureTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(162);
		}
		return positiveplaneanglemeasureTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPOSITIVERATIOMEASUREType() {
		if (positiveratiomeasureTypeEDataType == null) {
			positiveratiomeasureTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(163);
		}
		return positiveratiomeasureTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPREFERREDNAMETYPEType() {
		if (preferrednametypeTypeEDataType == null) {
			preferrednametypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(168);
		}
		return preferrednametypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPROGRAMREFERENCENAMEType() {
		if (programreferencenameTypeEDataType == null) {
			programreferencenameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(169);
		}
		return programreferencenameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyId() {
		if (propertyIdEDataType == null) {
			propertyIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(174);
		}
		return propertyIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReusableNameId() {
		if (reusableNameIdEDataType == null) {
			reusableNameIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(193);
		}
		return reusableNameIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getREVISIONTYPEType() {
		if (revisiontypeTypeEDataType == null) {
			revisiontypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(196);
		}
		return revisiontypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSHORTNAMETYPEType() {
		if (shortnametypeTypeEDataType == null) {
			shortnametypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(201);
		}
		return shortnametypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSIPREFIXTypeObject() {
		if (siprefixTypeObjectEDataType == null) {
			siprefixTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(203);
		}
		return siprefixTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSIUNITNAMETypeObject() {
		if (siunitnameTypeObjectEDataType == null) {
			siunitnameTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(205);
		}
		return siunitnameTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSTANDARDSIZETypeObject() {
		if (standardsizeTypeObjectEDataType == null) {
			standardsizeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(209);
		}
		return standardsizeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSTATUSType() {
		if (statusTypeEDataType == null) {
			statusTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(210);
		}
		return statusTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSUPPLIERCODETYPEType() {
		if (suppliercodetypeTypeEDataType == null) {
			suppliercodetypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(218);
		}
		return suppliercodetypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSupplierId() {
		if (supplierIdEDataType == null) {
			supplierIdEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(219);
		}
		return supplierIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSYNONYMOUSNAMETYPEType() {
		if (synonymousnametypeTypeEDataType == null) {
			synonymousnametypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(226);
		}
		return synonymousnametypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSYNONYMREFERENCEType() {
		if (synonymreferenceTypeEDataType == null) {
			synonymreferenceTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(229);
		}
		return synonymreferenceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVALUECODETYPEType() {
		if (valuecodetypeTypeEDataType == null) {
			valuecodetypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(237);
		}
		return valuecodetypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVALUEFORMATTYPEType() {
		if (valueformattypeTypeEDataType == null) {
			valueformattypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(238);
		}
		return valueformattypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVALUESPECIFICATIONTypeObject() {
		if (valuespecificationTypeObjectEDataType == null) {
			valuespecificationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(240);
		}
		return valuespecificationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVERSIONTYPEType() {
		if (versiontypeTypeEDataType == null) {
			versiontypeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OntomlPackage.eNS_URI).getEClassifiers().get(242);
		}
		return versiontypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntomlFactory getOntomlFactory() {
		return (OntomlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //OntomlPackageImpl
