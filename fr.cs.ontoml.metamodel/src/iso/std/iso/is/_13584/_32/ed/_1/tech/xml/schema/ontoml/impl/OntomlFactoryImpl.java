/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.*;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierFactory;
import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntomlFactoryImpl extends EFactoryImpl implements OntomlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OntomlFactory init() {
		try {
			OntomlFactory theOntomlFactory = (OntomlFactory)EPackage.Registry.INSTANCE.getEFactory(OntomlPackage.eNS_URI);
			if (theOntomlFactory != null) {
				return theOntomlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OntomlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntomlFactoryImpl() {
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
			case OntomlPackage.ALTERNATIVEUNITS_TYPE: return createALTERNATIVEUNITSType();
			case OntomlPackage.APOSTERIORICASEOF_TYPE: return createAPOSTERIORICASEOFType();
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIPS_TYPE: return createAPOSTERIORISEMANTICRELATIONSHIPSType();
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE: return createAPOSTERIORIVIEWOFType();
			case OntomlPackage.ARRAYTYPE_TYPE: return createARRAYTYPEType();
			case OntomlPackage.ASSIGNEDVALUE_TYPE: return createASSIGNEDVALUEType();
			case OntomlPackage.AUTHORS_TYPE: return createAUTHORSType();
			case OntomlPackage.AXIS1PLACEMENTTYPE_TYPE: return createAXIS1PLACEMENTTYPEType();
			case OntomlPackage.AXIS2PLACEMENT2DTYPE_TYPE: return createAXIS2PLACEMENT2DTYPEType();
			case OntomlPackage.AXIS2PLACEMENT3DTYPE_TYPE: return createAXIS2PLACEMENT3DTYPEType();
			case OntomlPackage.BAGTYPE_TYPE: return createBAGTYPEType();
			case OntomlPackage.BOOLEANTYPE_TYPE: return createBOOLEANTYPEType();
			case OntomlPackage.CARDINALITYCONSTRAINT_TYPE: return createCARDINALITYCONSTRAINTType();
			case OntomlPackage.CATEGORIZATIONCLASS_TYPE: return createCATEGORIZATIONCLASSType();
			case OntomlPackage.CLASSCONSTANTVALUES_TYPE: return createCLASSCONSTANTVALUESType();
			case OntomlPackage.CLASSESREFERENCE_TYPE: return createCLASSESREFERENCEType();
			case OntomlPackage.CLASSIFICATION_TYPE: return createCLASSIFICATIONType();
			case OntomlPackage.CLASSPRESENTATIONONPAPER_TYPE: return createCLASSPRESENTATIONONPAPERType();
			case OntomlPackage.CLASSPRESENTATIONONSCREEN_TYPE: return createCLASSPRESENTATIONONSCREENType();
			case OntomlPackage.CLASSREFERENCE_TYPE: return createCLASSREFERENCEType();
			case OntomlPackage.CLASSREFERENCETYPE_TYPE: return createCLASSREFERENCETYPEType();
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE: return createCLASSVALUEASSIGNMENTType();
			case OntomlPackage.CONDITIONDET_TYPE: return createCONDITIONDETType();
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE: return createCONFIGURATIONCONTROLCONSTRAINTType();
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE: return createCONSTRAINTORCONSTRAINTIDType();
			case OntomlPackage.CONSTRAINTS_TYPE: return createCONSTRAINTSType();
			case OntomlPackage.CONTAINEDCLASSES_TYPE: return createCONTAINEDCLASSESType();
			case OntomlPackage.CONTAINEDCLASSEXTENSIONS_TYPE: return createCONTAINEDCLASSEXTENSIONSType();
			case OntomlPackage.CONTAINEDDATATYPES_TYPE: return createCONTAINEDDATATYPESType();
			case OntomlPackage.CONTAINEDDOCUMENTS_TYPE: return createCONTAINEDDOCUMENTSType();
			case OntomlPackage.CONTAINEDKEYWORDS_TYPE: return createCONTAINEDKEYWORDSType();
			case OntomlPackage.CONTAINEDPROPERTIES_TYPE: return createCONTAINEDPROPERTIESType();
			case OntomlPackage.CONTAINEDSUPPLIERS_TYPE: return createCONTAINEDSUPPLIERSType();
			case OntomlPackage.CONTAINEDSYNONYMS_TYPE: return createCONTAINEDSYNONYMSType();
			case OntomlPackage.CONTEXTDEPENDENTUNIT_TYPE: return createCONTEXTDEPENDENTUNITType();
			case OntomlPackage.CONTEXTPARAMETERCONSTRAINTS_TYPE: return createCONTEXTPARAMETERCONSTRAINTSType();
			case OntomlPackage.CONTEXTPARAMICON_TYPE: return createCONTEXTPARAMICONType();
			case OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE: return createCONTEXTRESTRICTIONCONSTRAINTType();
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE: return createCONVERSIONBASEDUNITType();
			case OntomlPackage.CORRESPONDINGPROPERTIES_TYPE: return createCORRESPONDINGPROPERTIESType();
			case OntomlPackage.CREATEICON_TYPE: return createCREATEICONType();
			case OntomlPackage.DATATYPEREFERENCE_TYPE: return createDATATYPEREFERENCEType();
			case OntomlPackage.DATATYPESREFERENCE_TYPE: return createDATATYPESREFERENCEType();
			case OntomlPackage.DATATYPE_TYPE: return createDATATYPEType();
			case OntomlPackage.DATEDATATYPE_TYPE: return createDATEDATATYPEType();
			case OntomlPackage.DATETIMEDATATYPE_TYPE: return createDATETIMEDATATYPEType();
			case OntomlPackage.DEPENDENTPDET_TYPE: return createDEPENDENTPDETType();
			case OntomlPackage.DERIVEDUNITELEMENT_TYPE: return createDERIVEDUNITELEMENTType();
			case OntomlPackage.DERIVEDUNIT_TYPE: return createDERIVEDUNITType();
			case OntomlPackage.DICTIONARIESREFERENCE_TYPE: return createDICTIONARIESREFERENCEType();
			case OntomlPackage.DICTIONARYINSTANDARDFORMAT_TYPE: return createDICTIONARYINSTANDARDFORMATType();
			case OntomlPackage.DICTIONARYREFERENCE_TYPE: return createDICTIONARYREFERENCEType();
			case OntomlPackage.DICTIONARY_TYPE: return createDICTIONARYType();
			case OntomlPackage.DICUNITREFERENCE_TYPE: return createDICUNITREFERENCEType();
			case OntomlPackage.DICUNITSREFERENCE_TYPE: return createDICUNITSREFERENCEType();
			case OntomlPackage.DICUNIT_TYPE: return createDICUNITType();
			case OntomlPackage.DIMENSIONALEXPONENTS_TYPE: return createDIMENSIONALEXPONENTSType();
			case OntomlPackage.DOCUMENTCONTENT_TYPE: return createDOCUMENTCONTENTType();
			case OntomlPackage.DOCUMENTIDENTIFIERNAMELABEL_TYPE: return createDOCUMENTIDENTIFIERNAMELABELType();
			case OntomlPackage.DOCUMENTIDENTIFIER_TYPE: return createDOCUMENTIDENTIFIERType();
			case OntomlPackage.DOCUMENTREFERENCE_TYPE: return createDOCUMENTREFERENCEType();
			case OntomlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OntomlPackage.DOCUMENTSREFERENCE_TYPE: return createDOCUMENTSREFERENCEType();
			case OntomlPackage.DOCUMENT_TYPE: return createDOCUMENTType();
			case OntomlPackage.DOMAINCONSTRAINTS_TYPE: return createDOMAINCONSTRAINTSType();
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE: return createENUMERATIONCONSTRAINTType();
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE: return createEXPLICITFUNCTIONALMODELCLASSEXTENSIONType();
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE: return createEXPLICITITEMCLASSEXTENSIONType();
			case OntomlPackage.EXTERNALFILES_TYPE: return createEXTERNALFILESType();
			case OntomlPackage.EXTERNALGRAPHICS_TYPE: return createEXTERNALGRAPHICSType();
			case OntomlPackage.FILTER_TYPE: return createFILTERType();
			case OntomlPackage.FMCLASSVIEWOF_TYPE: return createFMCLASSVIEWOFType();
			case OntomlPackage.FREERELATIONDEFINITIONREF_TYPE: return createFREERELATIONDEFINITIONREFType();
			case OntomlPackage.FREERELATIONENDREF_TYPE: return createFREERELATIONENDREFType();
			case OntomlPackage.FREERELATIONS_TYPE: return createFREERELATIONSType();
			case OntomlPackage.FREERELATION_TYPE: return createFREERELATIONType();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE: return createFUNCTIONALMODELCLASSType();
			case OntomlPackage.GENERALTEXT_TYPE: return createGENERALTEXTType();
			case OntomlPackage.GEOMETRICCONTEXT_TYPE: return createGEOMETRICCONTEXTType();
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE: return createGEOMETRICUNITCONTEXTType();
			case OntomlPackage.HEADER_TYPE: return createHEADERType();
			case OntomlPackage.HTTPFILE_TYPE: return createHTTPFILEType();
			case OntomlPackage.IDENTIFIEDDOCUMENT_TYPE: return createIDENTIFIEDDOCUMENTType();
			case OntomlPackage.ILLUSTRATION_TYPE: return createILLUSTRATIONType();
			case OntomlPackage.INFORMATION_TYPE: return createINFORMATIONType();
			case OntomlPackage.INTCURRENCYTYPE_TYPE: return createINTCURRENCYTYPEType();
			case OntomlPackage.INTDICVALUE_TYPE: return createINTDICVALUEType();
			case OntomlPackage.INTEGRITYCONSTRAINT_TYPE: return createINTEGRITYCONSTRAINTType();
			case OntomlPackage.INTMEASURETYPE_TYPE: return createINTMEASURETYPEType();
			case OntomlPackage.INTTYPE_TYPE: return createINTTYPEType();
			case OntomlPackage.ITEMCLASSCASEOF_TYPE: return createITEMCLASSCASEOFType();
			case OntomlPackage.ITEMCLASS_TYPE: return createITEMCLASSType();
			case OntomlPackage.ITSVALUES_TYPE: return createITSVALUESType();
			case OntomlPackage.KEYWORDLABEL_TYPE: return createKEYWORDLABELType();
			case OntomlPackage.KEYWORDREFERENCES_TYPE: return createKEYWORDREFERENCESType();
			case OntomlPackage.KEYWORD_TYPE: return createKEYWORDType();
			case OntomlPackage.LANGUAGE_TYPE: return createLANGUAGEType();
			case OntomlPackage.LEVEL_TYPE: return createLEVELType();
			case OntomlPackage.LEVELTYPE_TYPE: return createLEVELTYPEType();
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE: return createLIBRARYIIMIDENTIFICATIONType();
			case OntomlPackage.LIBRARYINSTANDARDFORMAT_TYPE: return createLIBRARYINSTANDARDFORMATType();
			case OntomlPackage.LIBRARY_TYPE: return createLIBRARYType();
			case OntomlPackage.LISTTYPE_TYPE: return createLISTTYPEType();
			case OntomlPackage.MATHEMATICALSTRING_TYPE: return createMATHEMATICALSTRINGType();
			case OntomlPackage.MESSAGE_TYPE: return createMESSAGEType();
			case OntomlPackage.NAMEDTYPE_TYPE: return createNAMEDTYPEType();
			case OntomlPackage.NAMEDUNIT_TYPE: return createNAMEDUNITType();
			case OntomlPackage.NONDEPENDENTPDET_TYPE: return createNONDEPENDENTPDETType();
			case OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE: return createNONINSTANTIABLEFUNCTIONALVIEWCLASSType();
			case OntomlPackage.NONQUANTITATIVECODETYPE_TYPE: return createNONQUANTITATIVECODETYPEType();
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE: return createNONQUANTITATIVEINTTYPEType();
			case OntomlPackage.NONSIUNIT_TYPE: return createNONSIUNITType();
			case OntomlPackage.NONTRANSLATABLESTRINGTYPE_TYPE: return createNONTRANSLATABLESTRINGTYPEType();
			case OntomlPackage.NUMBERTYPE_TYPE: return createNUMBERTYPEType();
			case OntomlPackage.ONTOML_TYPE: return createONTOMLType();
			case OntomlPackage.ORGANIZATION_TYPE: return createORGANIZATIONType();
			case OntomlPackage.PERSON_TYPE: return createPERSONType();
			case OntomlPackage.PLACEMENTTYPE_TYPE: return createPLACEMENTTYPEType();
			case OntomlPackage.POSTCONDITION_TYPE: return createPOSTCONDITIONType();
			case OntomlPackage.PRECONDITION_TYPE: return createPRECONDITIONType();
			case OntomlPackage.PREFERREDNAMELABEL_TYPE: return createPREFERREDNAMELABELType();
			case OntomlPackage.PREFERREDNAME_TYPE: return createPREFERREDNAMEType();
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE: return createPROGRAMREFERENCETYPEType();
			case OntomlPackage.PROPERTIESREFERENCE_TYPE: return createPROPERTIESREFERENCEType();
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE: return createPROPERTYCLASSIFICATIONType();
			case OntomlPackage.PROPERTYMAPPING_TYPE: return createPROPERTYMAPPINGType();
			case OntomlPackage.PROPERTYREFERENCE_TYPE: return createPROPERTYREFERENCEType();
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE: return createPROPERTYVALUERECOMMENDEDPRESENTATIONType();
			case OntomlPackage.RANGECONSTRAINT_TYPE: return createRANGECONSTRAINTType();
			case OntomlPackage.RATIONALMEASURETYPE_TYPE: return createRATIONALMEASURETYPEType();
			case OntomlPackage.RATIONALTYPE_TYPE: return createRATIONALTYPEType();
			case OntomlPackage.REALCURRENCYTYPE_TYPE: return createREALCURRENCYTYPEType();
			case OntomlPackage.REALMEASURETYPE_TYPE: return createREALMEASURETYPEType();
			case OntomlPackage.REALTYPE_TYPE: return createREALTYPEType();
			case OntomlPackage.RECOMMENDEDPRESENTATION_TYPE: return createRECOMMENDEDPRESENTATIONType();
			case OntomlPackage.REFERENCEDDOCUMENT_TYPE: return createREFERENCEDDOCUMENTType();
			case OntomlPackage.REFERENCEDGRAPHICS_TYPE: return createREFERENCEDGRAPHICSType();
			case OntomlPackage.REMOTELOCATIONS_TYPE: return createREMOTELOCATIONSType();
			case OntomlPackage.REMOTE_LOCATION_TYPE: return createRemoteLocationType();
			case OntomlPackage.REPRESENTATIONPDET_TYPE: return createREPRESENTATIONPDETType();
			case OntomlPackage.REPRESENTATIONREFERENCETYPE_TYPE: return createREPRESENTATIONREFERENCETYPEType();
			case OntomlPackage.REUSABLEKEYWORD_TYPE: return createREUSABLEKEYWORDType();
			case OntomlPackage.REUSABLESYNONYM_TYPE: return createREUSABLESYNONYMType();
			case OntomlPackage.SETTYPE_TYPE: return createSETTYPEType();
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE: return createSETWITHSUBSETCONSTRAINTTYPEType();
			case OntomlPackage.SHORTNAMELABEL_TYPE: return createSHORTNAMELABELType();
			case OntomlPackage.SHORTNAME_TYPE: return createSHORTNAMEType();
			case OntomlPackage.SIUNIT_TYPE: return createSIUNITType();
			case OntomlPackage.STRINGDICVALUE_TYPE: return createSTRINGDICVALUEType();
			case OntomlPackage.STRINGPATTERNCONSTRAINT_TYPE: return createSTRINGPATTERNCONSTRAINTType();
			case OntomlPackage.STRINGSIZECONSTRAINT_TYPE: return createSTRINGSIZECONSTRAINTType();
			case OntomlPackage.STRINGS_TYPE: return createSTRINGSType();
			case OntomlPackage.STRINGTYPE_TYPE: return createSTRINGTYPEType();
			case OntomlPackage.SUBCLASSCONSTRAINT_TYPE: return createSUBCLASSCONSTRAINTType();
			case OntomlPackage.SUBSET_TYPE: return createSUBSETType();
			case OntomlPackage.SUPPLIERREFERENCE_TYPE: return createSUPPLIERREFERENCEType();
			case OntomlPackage.SUPPLIERSREFERENCE_TYPE: return createSUPPLIERSREFERENCEType();
			case OntomlPackage.SUPPLIER_TYPE: return createSUPPLIERType();
			case OntomlPackage.SUPPORTEDVEP_TYPE: return createSUPPORTEDVEPType();
			case OntomlPackage.SYNONYMOUSNAMELABEL_TYPE: return createSYNONYMOUSNAMELABELType();
			case OntomlPackage.SYNONYMOUSNAME_TYPE: return createSYNONYMOUSNAMEType();
			case OntomlPackage.SYNONYMOUSSYMBOLS_TYPE: return createSYNONYMOUSSYMBOLSType();
			case OntomlPackage.SYNONYMREFERENCES_TYPE: return createSYNONYMREFERENCESType();
			case OntomlPackage.TEXT_TYPE: return createTEXTType();
			case OntomlPackage.TIMEDATATYPE_TYPE: return createTIMEDATATYPEType();
			case OntomlPackage.TRANSLATABLESTRINGTYPE_TYPE: return createTRANSLATABLESTRINGTYPEType();
			case OntomlPackage.TRANSLATIONDATA_TYPE: return createTRANSLATIONDATAType();
			case OntomlPackage.TRANSLATION_TYPE: return createTRANSLATIONType();
			case OntomlPackage.URITYPE_TYPE: return createURITYPEType();
			case OntomlPackage.VCVRANGE_TYPE: return createVCVRANGEType();
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE: return createVIEWCONTROLVARIABLERANGEType();
			case OntomlPackage.VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE: return createVIEWEXCHANGEPROTOCOLIDENTIFICATIONType();
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
			case OntomlPackage.ILLUSTRATIONTYPE_TYPE:
				return createILLUSTRATIONTYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.SIPREFIX_TYPE:
				return createSIPREFIXTypeFromString(eDataType, initialValue);
			case OntomlPackage.SIUNITNAME_TYPE:
				return createSIUNITNAMETypeFromString(eDataType, initialValue);
			case OntomlPackage.STANDARDSIZE_TYPE:
				return createSTANDARDSIZETypeFromString(eDataType, initialValue);
			case OntomlPackage.VALUESPECIFICATION_TYPE:
				return createVALUESPECIFICATIONTypeFromString(eDataType, initialValue);
			case OntomlPackage.ABSOLUTEURLTYPE_TYPE:
				return createABSOLUTEURLTYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.APOSTERIORI_SEMANTIC_RELATION_ID:
				return createAPosterioriSemanticRelationIdFromString(eDataType, initialValue);
			case OntomlPackage.CLASS_ID:
				return createClassIdFromString(eDataType, initialValue);
			case OntomlPackage.CLASS_REF_TYPE:
				return createClassRefTypeFromString(eDataType, initialValue);
			case OntomlPackage.CLASS_REF_TYPE1:
				return createClassRefType1FromString(eDataType, initialValue);
			case OntomlPackage.CLASS_REF_TYPE2:
				return createClassRefType2FromString(eDataType, initialValue);
			case OntomlPackage.CLASS_REF_TYPE3:
				return createClassRefType3FromString(eDataType, initialValue);
			case OntomlPackage.CLASS_REF_TYPE4:
				return createClassRefType4FromString(eDataType, initialValue);
			case OntomlPackage.CLASS_REF_TYPE5:
				return createClassRefType5FromString(eDataType, initialValue);
			case OntomlPackage.CONSTRAINT_ID:
				return createConstraintIdFromString(eDataType, initialValue);
			case OntomlPackage.COUNTRYCODE_TYPE:
				return createCOUNTRYCODETypeFromString(eDataType, initialValue);
			case OntomlPackage.CURRENCYCODE_TYPE:
				return createCURRENCYCODETypeFromString(eDataType, initialValue);
			case OntomlPackage.CURRENCY_ID:
				return createCurrencyIdFromString(eDataType, initialValue);
			case OntomlPackage.DATA_TYPE_ID:
				return createDataTypeIdFromString(eDataType, initialValue);
			case OntomlPackage.DATETYPE_TYPE:
				return createDATETYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.DETCLASSIFICATIONTYPE_TYPE:
				return createDETCLASSIFICATIONTYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.DIC_UNIT_ID:
				return createDicUnitIdFromString(eDataType, initialValue);
			case OntomlPackage.DIC_VALUE_ID:
				return createDicValueIdFromString(eDataType, initialValue);
			case OntomlPackage.DOCUMENT_ID:
				return createDocumentIdFromString(eDataType, initialValue);
			case OntomlPackage.DOCUMENTIDENTIFIERNAME_TYPE:
				return createDOCUMENTIDENTIFIERNAMETypeFromString(eDataType, initialValue);
			case OntomlPackage.EPTOS_GUID:
				return createEptosGUIDFromString(eDataType, initialValue);
			case OntomlPackage.EXTERNALITEMCODETYPE_TYPE:
				return createEXTERNALITEMCODETYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.FREE_RELATION_DEFINITION_ID:
				return createFreeRelationDefinitionIdFromString(eDataType, initialValue);
			case OntomlPackage.FREE_RELATION_END_ID:
				return createFreeRelationEndIdFromString(eDataType, initialValue);
			case OntomlPackage.HTTPDIRECTORYNAMETYPE_TYPE:
				return createHTTPDIRECTORYNAMETYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.HTTPFILENAMETYPE_TYPE:
				return createHTTPFILENAMETYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.ILLUSTRATIONTYPE_TYPE_OBJECT:
				return createILLUSTRATIONTYPETypeObjectFromString(eDataType, initialValue);
			case OntomlPackage.KEYWORDREFERENCE_TYPE:
				return createKEYWORDREFERENCETypeFromString(eDataType, initialValue);
			case OntomlPackage.KEYWORDTYPE_TYPE:
				return createKEYWORDTYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.LANGUAGECODE_TYPE:
				return createLANGUAGECODETypeFromString(eDataType, initialValue);
			case OntomlPackage.ONTOLOGY_ID:
				return createOntologyIdFromString(eDataType, initialValue);
			case OntomlPackage.POSITIVELENGTHMEASURE_TYPE:
				return createPOSITIVELENGTHMEASURETypeFromString(eDataType, initialValue);
			case OntomlPackage.POSITIVEPLANEANGLEMEASURE_TYPE:
				return createPOSITIVEPLANEANGLEMEASURETypeFromString(eDataType, initialValue);
			case OntomlPackage.POSITIVERATIOMEASURE_TYPE:
				return createPOSITIVERATIOMEASURETypeFromString(eDataType, initialValue);
			case OntomlPackage.PREFERREDNAMETYPE_TYPE:
				return createPREFERREDNAMETYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.PROGRAMREFERENCENAME_TYPE:
				return createPROGRAMREFERENCENAMETypeFromString(eDataType, initialValue);
			case OntomlPackage.PROPERTY_ID:
				return createPropertyIdFromString(eDataType, initialValue);
			case OntomlPackage.REUSABLE_NAME_ID:
				return createReusableNameIdFromString(eDataType, initialValue);
			case OntomlPackage.REVISIONTYPE_TYPE:
				return createREVISIONTYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.SHORTNAMETYPE_TYPE:
				return createSHORTNAMETYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.SIPREFIX_TYPE_OBJECT:
				return createSIPREFIXTypeObjectFromString(eDataType, initialValue);
			case OntomlPackage.SIUNITNAME_TYPE_OBJECT:
				return createSIUNITNAMETypeObjectFromString(eDataType, initialValue);
			case OntomlPackage.STANDARDSIZE_TYPE_OBJECT:
				return createSTANDARDSIZETypeObjectFromString(eDataType, initialValue);
			case OntomlPackage.STATUS_TYPE:
				return createSTATUSTypeFromString(eDataType, initialValue);
			case OntomlPackage.SUPPLIERCODETYPE_TYPE:
				return createSUPPLIERCODETYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.SUPPLIER_ID:
				return createSupplierIdFromString(eDataType, initialValue);
			case OntomlPackage.SYNONYMOUSNAMETYPE_TYPE:
				return createSYNONYMOUSNAMETYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.SYNONYMREFERENCE_TYPE:
				return createSYNONYMREFERENCETypeFromString(eDataType, initialValue);
			case OntomlPackage.VALUECODETYPE_TYPE:
				return createVALUECODETYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.VALUEFORMATTYPE_TYPE:
				return createVALUEFORMATTYPETypeFromString(eDataType, initialValue);
			case OntomlPackage.VALUESPECIFICATION_TYPE_OBJECT:
				return createVALUESPECIFICATIONTypeObjectFromString(eDataType, initialValue);
			case OntomlPackage.VERSIONTYPE_TYPE:
				return createVERSIONTYPETypeFromString(eDataType, initialValue);
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
			case OntomlPackage.ILLUSTRATIONTYPE_TYPE:
				return convertILLUSTRATIONTYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.SIPREFIX_TYPE:
				return convertSIPREFIXTypeToString(eDataType, instanceValue);
			case OntomlPackage.SIUNITNAME_TYPE:
				return convertSIUNITNAMETypeToString(eDataType, instanceValue);
			case OntomlPackage.STANDARDSIZE_TYPE:
				return convertSTANDARDSIZETypeToString(eDataType, instanceValue);
			case OntomlPackage.VALUESPECIFICATION_TYPE:
				return convertVALUESPECIFICATIONTypeToString(eDataType, instanceValue);
			case OntomlPackage.ABSOLUTEURLTYPE_TYPE:
				return convertABSOLUTEURLTYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.APOSTERIORI_SEMANTIC_RELATION_ID:
				return convertAPosterioriSemanticRelationIdToString(eDataType, instanceValue);
			case OntomlPackage.CLASS_ID:
				return convertClassIdToString(eDataType, instanceValue);
			case OntomlPackage.CLASS_REF_TYPE:
				return convertClassRefTypeToString(eDataType, instanceValue);
			case OntomlPackage.CLASS_REF_TYPE1:
				return convertClassRefType1ToString(eDataType, instanceValue);
			case OntomlPackage.CLASS_REF_TYPE2:
				return convertClassRefType2ToString(eDataType, instanceValue);
			case OntomlPackage.CLASS_REF_TYPE3:
				return convertClassRefType3ToString(eDataType, instanceValue);
			case OntomlPackage.CLASS_REF_TYPE4:
				return convertClassRefType4ToString(eDataType, instanceValue);
			case OntomlPackage.CLASS_REF_TYPE5:
				return convertClassRefType5ToString(eDataType, instanceValue);
			case OntomlPackage.CONSTRAINT_ID:
				return convertConstraintIdToString(eDataType, instanceValue);
			case OntomlPackage.COUNTRYCODE_TYPE:
				return convertCOUNTRYCODETypeToString(eDataType, instanceValue);
			case OntomlPackage.CURRENCYCODE_TYPE:
				return convertCURRENCYCODETypeToString(eDataType, instanceValue);
			case OntomlPackage.CURRENCY_ID:
				return convertCurrencyIdToString(eDataType, instanceValue);
			case OntomlPackage.DATA_TYPE_ID:
				return convertDataTypeIdToString(eDataType, instanceValue);
			case OntomlPackage.DATETYPE_TYPE:
				return convertDATETYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.DETCLASSIFICATIONTYPE_TYPE:
				return convertDETCLASSIFICATIONTYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.DIC_UNIT_ID:
				return convertDicUnitIdToString(eDataType, instanceValue);
			case OntomlPackage.DIC_VALUE_ID:
				return convertDicValueIdToString(eDataType, instanceValue);
			case OntomlPackage.DOCUMENT_ID:
				return convertDocumentIdToString(eDataType, instanceValue);
			case OntomlPackage.DOCUMENTIDENTIFIERNAME_TYPE:
				return convertDOCUMENTIDENTIFIERNAMETypeToString(eDataType, instanceValue);
			case OntomlPackage.EPTOS_GUID:
				return convertEptosGUIDToString(eDataType, instanceValue);
			case OntomlPackage.EXTERNALITEMCODETYPE_TYPE:
				return convertEXTERNALITEMCODETYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.FREE_RELATION_DEFINITION_ID:
				return convertFreeRelationDefinitionIdToString(eDataType, instanceValue);
			case OntomlPackage.FREE_RELATION_END_ID:
				return convertFreeRelationEndIdToString(eDataType, instanceValue);
			case OntomlPackage.HTTPDIRECTORYNAMETYPE_TYPE:
				return convertHTTPDIRECTORYNAMETYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.HTTPFILENAMETYPE_TYPE:
				return convertHTTPFILENAMETYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.ILLUSTRATIONTYPE_TYPE_OBJECT:
				return convertILLUSTRATIONTYPETypeObjectToString(eDataType, instanceValue);
			case OntomlPackage.KEYWORDREFERENCE_TYPE:
				return convertKEYWORDREFERENCETypeToString(eDataType, instanceValue);
			case OntomlPackage.KEYWORDTYPE_TYPE:
				return convertKEYWORDTYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.LANGUAGECODE_TYPE:
				return convertLANGUAGECODETypeToString(eDataType, instanceValue);
			case OntomlPackage.ONTOLOGY_ID:
				return convertOntologyIdToString(eDataType, instanceValue);
			case OntomlPackage.POSITIVELENGTHMEASURE_TYPE:
				return convertPOSITIVELENGTHMEASURETypeToString(eDataType, instanceValue);
			case OntomlPackage.POSITIVEPLANEANGLEMEASURE_TYPE:
				return convertPOSITIVEPLANEANGLEMEASURETypeToString(eDataType, instanceValue);
			case OntomlPackage.POSITIVERATIOMEASURE_TYPE:
				return convertPOSITIVERATIOMEASURETypeToString(eDataType, instanceValue);
			case OntomlPackage.PREFERREDNAMETYPE_TYPE:
				return convertPREFERREDNAMETYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.PROGRAMREFERENCENAME_TYPE:
				return convertPROGRAMREFERENCENAMETypeToString(eDataType, instanceValue);
			case OntomlPackage.PROPERTY_ID:
				return convertPropertyIdToString(eDataType, instanceValue);
			case OntomlPackage.REUSABLE_NAME_ID:
				return convertReusableNameIdToString(eDataType, instanceValue);
			case OntomlPackage.REVISIONTYPE_TYPE:
				return convertREVISIONTYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.SHORTNAMETYPE_TYPE:
				return convertSHORTNAMETYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.SIPREFIX_TYPE_OBJECT:
				return convertSIPREFIXTypeObjectToString(eDataType, instanceValue);
			case OntomlPackage.SIUNITNAME_TYPE_OBJECT:
				return convertSIUNITNAMETypeObjectToString(eDataType, instanceValue);
			case OntomlPackage.STANDARDSIZE_TYPE_OBJECT:
				return convertSTANDARDSIZETypeObjectToString(eDataType, instanceValue);
			case OntomlPackage.STATUS_TYPE:
				return convertSTATUSTypeToString(eDataType, instanceValue);
			case OntomlPackage.SUPPLIERCODETYPE_TYPE:
				return convertSUPPLIERCODETYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.SUPPLIER_ID:
				return convertSupplierIdToString(eDataType, instanceValue);
			case OntomlPackage.SYNONYMOUSNAMETYPE_TYPE:
				return convertSYNONYMOUSNAMETYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.SYNONYMREFERENCE_TYPE:
				return convertSYNONYMREFERENCETypeToString(eDataType, instanceValue);
			case OntomlPackage.VALUECODETYPE_TYPE:
				return convertVALUECODETYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.VALUEFORMATTYPE_TYPE:
				return convertVALUEFORMATTYPETypeToString(eDataType, instanceValue);
			case OntomlPackage.VALUESPECIFICATION_TYPE_OBJECT:
				return convertVALUESPECIFICATIONTypeObjectToString(eDataType, instanceValue);
			case OntomlPackage.VERSIONTYPE_TYPE:
				return convertVERSIONTYPETypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEUNITSType createALTERNATIVEUNITSType() {
		ALTERNATIVEUNITSTypeImpl alternativeunitsType = new ALTERNATIVEUNITSTypeImpl();
		return alternativeunitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORICASEOFType createAPOSTERIORICASEOFType() {
		APOSTERIORICASEOFTypeImpl aposterioricaseofType = new APOSTERIORICASEOFTypeImpl();
		return aposterioricaseofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORISEMANTICRELATIONSHIPSType createAPOSTERIORISEMANTICRELATIONSHIPSType() {
		APOSTERIORISEMANTICRELATIONSHIPSTypeImpl aposteriorisemanticrelationshipsType = new APOSTERIORISEMANTICRELATIONSHIPSTypeImpl();
		return aposteriorisemanticrelationshipsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORIVIEWOFType createAPOSTERIORIVIEWOFType() {
		APOSTERIORIVIEWOFTypeImpl aposterioriviewofType = new APOSTERIORIVIEWOFTypeImpl();
		return aposterioriviewofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAYTYPEType createARRAYTYPEType() {
		ARRAYTYPETypeImpl arraytypeType = new ARRAYTYPETypeImpl();
		return arraytypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASSIGNEDVALUEType createASSIGNEDVALUEType() {
		ASSIGNEDVALUETypeImpl assignedvalueType = new ASSIGNEDVALUETypeImpl();
		return assignedvalueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUTHORSType createAUTHORSType() {
		AUTHORSTypeImpl authorsType = new AUTHORSTypeImpl();
		return authorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AXIS1PLACEMENTTYPEType createAXIS1PLACEMENTTYPEType() {
		AXIS1PLACEMENTTYPETypeImpl axis1PLACEMENTTYPEType = new AXIS1PLACEMENTTYPETypeImpl();
		return axis1PLACEMENTTYPEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AXIS2PLACEMENT2DTYPEType createAXIS2PLACEMENT2DTYPEType() {
		AXIS2PLACEMENT2DTYPETypeImpl axis2PLACEMENT2DTYPEType = new AXIS2PLACEMENT2DTYPETypeImpl();
		return axis2PLACEMENT2DTYPEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AXIS2PLACEMENT3DTYPEType createAXIS2PLACEMENT3DTYPEType() {
		AXIS2PLACEMENT3DTYPETypeImpl axis2PLACEMENT3DTYPEType = new AXIS2PLACEMENT3DTYPETypeImpl();
		return axis2PLACEMENT3DTYPEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAGTYPEType createBAGTYPEType() {
		BAGTYPETypeImpl bagtypeType = new BAGTYPETypeImpl();
		return bagtypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOOLEANTYPEType createBOOLEANTYPEType() {
		BOOLEANTYPETypeImpl booleantypeType = new BOOLEANTYPETypeImpl();
		return booleantypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CARDINALITYCONSTRAINTType createCARDINALITYCONSTRAINTType() {
		CARDINALITYCONSTRAINTTypeImpl cardinalityconstraintType = new CARDINALITYCONSTRAINTTypeImpl();
		return cardinalityconstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CATEGORIZATIONCLASSType createCATEGORIZATIONCLASSType() {
		CATEGORIZATIONCLASSTypeImpl categorizationclassType = new CATEGORIZATIONCLASSTypeImpl();
		return categorizationclassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSCONSTANTVALUESType createCLASSCONSTANTVALUESType() {
		CLASSCONSTANTVALUESTypeImpl classconstantvaluesType = new CLASSCONSTANTVALUESTypeImpl();
		return classconstantvaluesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCEType createCLASSESREFERENCEType() {
		CLASSESREFERENCETypeImpl classesreferenceType = new CLASSESREFERENCETypeImpl();
		return classesreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSIFICATIONType createCLASSIFICATIONType() {
		CLASSIFICATIONTypeImpl classificationType = new CLASSIFICATIONTypeImpl();
		return classificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSPRESENTATIONONPAPERType createCLASSPRESENTATIONONPAPERType() {
		CLASSPRESENTATIONONPAPERTypeImpl classpresentationonpaperType = new CLASSPRESENTATIONONPAPERTypeImpl();
		return classpresentationonpaperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSPRESENTATIONONSCREENType createCLASSPRESENTATIONONSCREENType() {
		CLASSPRESENTATIONONSCREENTypeImpl classpresentationonscreenType = new CLASSPRESENTATIONONSCREENTypeImpl();
		return classpresentationonscreenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType createCLASSREFERENCEType() {
		CLASSREFERENCETypeImpl classreferenceType = new CLASSREFERENCETypeImpl();
		return classreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCETYPEType createCLASSREFERENCETYPEType() {
		CLASSREFERENCETYPETypeImpl classreferencetypeType = new CLASSREFERENCETYPETypeImpl();
		return classreferencetypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSVALUEASSIGNMENTType createCLASSVALUEASSIGNMENTType() {
		CLASSVALUEASSIGNMENTTypeImpl classvalueassignmentType = new CLASSVALUEASSIGNMENTTypeImpl();
		return classvalueassignmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONDITIONDETType createCONDITIONDETType() {
		CONDITIONDETTypeImpl conditiondetType = new CONDITIONDETTypeImpl();
		return conditiondetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONFIGURATIONCONTROLCONSTRAINTType createCONFIGURATIONCONTROLCONSTRAINTType() {
		CONFIGURATIONCONTROLCONSTRAINTTypeImpl configurationcontrolconstraintType = new CONFIGURATIONCONTROLCONSTRAINTTypeImpl();
		return configurationcontrolconstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTORCONSTRAINTIDType createCONSTRAINTORCONSTRAINTIDType() {
		CONSTRAINTORCONSTRAINTIDTypeImpl constraintorconstraintidType = new CONSTRAINTORCONSTRAINTIDTypeImpl();
		return constraintorconstraintidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTSType createCONSTRAINTSType() {
		CONSTRAINTSTypeImpl constraintsType = new CONSTRAINTSTypeImpl();
		return constraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDCLASSESType createCONTAINEDCLASSESType() {
		CONTAINEDCLASSESTypeImpl containedclassesType = new CONTAINEDCLASSESTypeImpl();
		return containedclassesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDCLASSEXTENSIONSType createCONTAINEDCLASSEXTENSIONSType() {
		CONTAINEDCLASSEXTENSIONSTypeImpl containedclassextensionsType = new CONTAINEDCLASSEXTENSIONSTypeImpl();
		return containedclassextensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDDATATYPESType createCONTAINEDDATATYPESType() {
		CONTAINEDDATATYPESTypeImpl containeddatatypesType = new CONTAINEDDATATYPESTypeImpl();
		return containeddatatypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDDOCUMENTSType createCONTAINEDDOCUMENTSType() {
		CONTAINEDDOCUMENTSTypeImpl containeddocumentsType = new CONTAINEDDOCUMENTSTypeImpl();
		return containeddocumentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDKEYWORDSType createCONTAINEDKEYWORDSType() {
		CONTAINEDKEYWORDSTypeImpl containedkeywordsType = new CONTAINEDKEYWORDSTypeImpl();
		return containedkeywordsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDPROPERTIESType createCONTAINEDPROPERTIESType() {
		CONTAINEDPROPERTIESTypeImpl containedpropertiesType = new CONTAINEDPROPERTIESTypeImpl();
		return containedpropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDSUPPLIERSType createCONTAINEDSUPPLIERSType() {
		CONTAINEDSUPPLIERSTypeImpl containedsuppliersType = new CONTAINEDSUPPLIERSTypeImpl();
		return containedsuppliersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDSYNONYMSType createCONTAINEDSYNONYMSType() {
		CONTAINEDSYNONYMSTypeImpl containedsynonymsType = new CONTAINEDSYNONYMSTypeImpl();
		return containedsynonymsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTDEPENDENTUNITType createCONTEXTDEPENDENTUNITType() {
		CONTEXTDEPENDENTUNITTypeImpl contextdependentunitType = new CONTEXTDEPENDENTUNITTypeImpl();
		return contextdependentunitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTPARAMETERCONSTRAINTSType createCONTEXTPARAMETERCONSTRAINTSType() {
		CONTEXTPARAMETERCONSTRAINTSTypeImpl contextparameterconstraintsType = new CONTEXTPARAMETERCONSTRAINTSTypeImpl();
		return contextparameterconstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTPARAMICONType createCONTEXTPARAMICONType() {
		CONTEXTPARAMICONTypeImpl contextparamiconType = new CONTEXTPARAMICONTypeImpl();
		return contextparamiconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTRESTRICTIONCONSTRAINTType createCONTEXTRESTRICTIONCONSTRAINTType() {
		CONTEXTRESTRICTIONCONSTRAINTTypeImpl contextrestrictionconstraintType = new CONTEXTRESTRICTIONCONSTRAINTTypeImpl();
		return contextrestrictionconstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONVERSIONBASEDUNITType createCONVERSIONBASEDUNITType() {
		CONVERSIONBASEDUNITTypeImpl conversionbasedunitType = new CONVERSIONBASEDUNITTypeImpl();
		return conversionbasedunitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CORRESPONDINGPROPERTIESType createCORRESPONDINGPROPERTIESType() {
		CORRESPONDINGPROPERTIESTypeImpl correspondingpropertiesType = new CORRESPONDINGPROPERTIESTypeImpl();
		return correspondingpropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CREATEICONType createCREATEICONType() {
		CREATEICONTypeImpl createiconType = new CREATEICONTypeImpl();
		return createiconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEREFERENCEType createDATATYPEREFERENCEType() {
		DATATYPEREFERENCETypeImpl datatypereferenceType = new DATATYPEREFERENCETypeImpl();
		return datatypereferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCEType createDATATYPESREFERENCEType() {
		DATATYPESREFERENCETypeImpl datatypesreferenceType = new DATATYPESREFERENCETypeImpl();
		return datatypesreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEType createDATATYPEType() {
		DATATYPETypeImpl datatypeType = new DATATYPETypeImpl();
		return datatypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATEDATATYPEType createDATEDATATYPEType() {
		DATEDATATYPETypeImpl datedatatypeType = new DATEDATATYPETypeImpl();
		return datedatatypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATETIMEDATATYPEType createDATETIMEDATATYPEType() {
		DATETIMEDATATYPETypeImpl datetimedatatypeType = new DATETIMEDATATYPETypeImpl();
		return datetimedatatypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEPENDENTPDETType createDEPENDENTPDETType() {
		DEPENDENTPDETTypeImpl dependentpdetType = new DEPENDENTPDETTypeImpl();
		return dependentpdetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DERIVEDUNITELEMENTType createDERIVEDUNITELEMENTType() {
		DERIVEDUNITELEMENTTypeImpl derivedunitelementType = new DERIVEDUNITELEMENTTypeImpl();
		return derivedunitelementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DERIVEDUNITType createDERIVEDUNITType() {
		DERIVEDUNITTypeImpl derivedunitType = new DERIVEDUNITTypeImpl();
		return derivedunitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARIESREFERENCEType createDICTIONARIESREFERENCEType() {
		DICTIONARIESREFERENCETypeImpl dictionariesreferenceType = new DICTIONARIESREFERENCETypeImpl();
		return dictionariesreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARYINSTANDARDFORMATType createDICTIONARYINSTANDARDFORMATType() {
		DICTIONARYINSTANDARDFORMATTypeImpl dictionaryinstandardformatType = new DICTIONARYINSTANDARDFORMATTypeImpl();
		return dictionaryinstandardformatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARYREFERENCEType createDICTIONARYREFERENCEType() {
		DICTIONARYREFERENCETypeImpl dictionaryreferenceType = new DICTIONARYREFERENCETypeImpl();
		return dictionaryreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARYType createDICTIONARYType() {
		DICTIONARYTypeImpl dictionaryType = new DICTIONARYTypeImpl();
		return dictionaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITREFERENCEType createDICUNITREFERENCEType() {
		DICUNITREFERENCETypeImpl dicunitreferenceType = new DICUNITREFERENCETypeImpl();
		return dicunitreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITSREFERENCEType createDICUNITSREFERENCEType() {
		DICUNITSREFERENCETypeImpl dicunitsreferenceType = new DICUNITSREFERENCETypeImpl();
		return dicunitsreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITType createDICUNITType() {
		DICUNITTypeImpl dicunitType = new DICUNITTypeImpl();
		return dicunitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIMENSIONALEXPONENTSType createDIMENSIONALEXPONENTSType() {
		DIMENSIONALEXPONENTSTypeImpl dimensionalexponentsType = new DIMENSIONALEXPONENTSTypeImpl();
		return dimensionalexponentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTCONTENTType createDOCUMENTCONTENTType() {
		DOCUMENTCONTENTTypeImpl documentcontentType = new DOCUMENTCONTENTTypeImpl();
		return documentcontentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTIDENTIFIERNAMELABELType createDOCUMENTIDENTIFIERNAMELABELType() {
		DOCUMENTIDENTIFIERNAMELABELTypeImpl documentidentifiernamelabelType = new DOCUMENTIDENTIFIERNAMELABELTypeImpl();
		return documentidentifiernamelabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTIDENTIFIERType createDOCUMENTIDENTIFIERType() {
		DOCUMENTIDENTIFIERTypeImpl documentidentifierType = new DOCUMENTIDENTIFIERTypeImpl();
		return documentidentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTREFERENCEType createDOCUMENTREFERENCEType() {
		DOCUMENTREFERENCETypeImpl documentreferenceType = new DOCUMENTREFERENCETypeImpl();
		return documentreferenceType;
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
	public DOCUMENTSREFERENCEType createDOCUMENTSREFERENCEType() {
		DOCUMENTSREFERENCETypeImpl documentsreferenceType = new DOCUMENTSREFERENCETypeImpl();
		return documentsreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTType createDOCUMENTType() {
		DOCUMENTTypeImpl documentType = new DOCUMENTTypeImpl();
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOMAINCONSTRAINTSType createDOMAINCONSTRAINTSType() {
		DOMAINCONSTRAINTSTypeImpl domainconstraintsType = new DOMAINCONSTRAINTSTypeImpl();
		return domainconstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMERATIONCONSTRAINTType createENUMERATIONCONSTRAINTType() {
		ENUMERATIONCONSTRAINTTypeImpl enumerationconstraintType = new ENUMERATIONCONSTRAINTTypeImpl();
		return enumerationconstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXPLICITFUNCTIONALMODELCLASSEXTENSIONType createEXPLICITFUNCTIONALMODELCLASSEXTENSIONType() {
		EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl explicitfunctionalmodelclassextensionType = new EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl();
		return explicitfunctionalmodelclassextensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXPLICITITEMCLASSEXTENSIONType createEXPLICITITEMCLASSEXTENSIONType() {
		EXPLICITITEMCLASSEXTENSIONTypeImpl explicititemclassextensionType = new EXPLICITITEMCLASSEXTENSIONTypeImpl();
		return explicititemclassextensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXTERNALFILESType createEXTERNALFILESType() {
		EXTERNALFILESTypeImpl externalfilesType = new EXTERNALFILESTypeImpl();
		return externalfilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXTERNALGRAPHICSType createEXTERNALGRAPHICSType() {
		EXTERNALGRAPHICSTypeImpl externalgraphicsType = new EXTERNALGRAPHICSTypeImpl();
		return externalgraphicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FILTERType createFILTERType() {
		FILTERTypeImpl filterType = new FILTERTypeImpl();
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMCLASSVIEWOFType createFMCLASSVIEWOFType() {
		FMCLASSVIEWOFTypeImpl fmclassviewofType = new FMCLASSVIEWOFTypeImpl();
		return fmclassviewofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FREERELATIONDEFINITIONREFType createFREERELATIONDEFINITIONREFType() {
		FREERELATIONDEFINITIONREFTypeImpl freerelationdefinitionrefType = new FREERELATIONDEFINITIONREFTypeImpl();
		return freerelationdefinitionrefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FREERELATIONENDREFType createFREERELATIONENDREFType() {
		FREERELATIONENDREFTypeImpl freerelationendrefType = new FREERELATIONENDREFTypeImpl();
		return freerelationendrefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FREERELATIONSType createFREERELATIONSType() {
		FREERELATIONSTypeImpl freerelationsType = new FREERELATIONSTypeImpl();
		return freerelationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FREERELATIONType createFREERELATIONType() {
		FREERELATIONTypeImpl freerelationType = new FREERELATIONTypeImpl();
		return freerelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FUNCTIONALMODELCLASSType createFUNCTIONALMODELCLASSType() {
		FUNCTIONALMODELCLASSTypeImpl functionalmodelclassType = new FUNCTIONALMODELCLASSTypeImpl();
		return functionalmodelclassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GENERALTEXTType createGENERALTEXTType() {
		GENERALTEXTTypeImpl generaltextType = new GENERALTEXTTypeImpl();
		return generaltextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEOMETRICCONTEXTType createGEOMETRICCONTEXTType() {
		GEOMETRICCONTEXTTypeImpl geometriccontextType = new GEOMETRICCONTEXTTypeImpl();
		return geometriccontextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEOMETRICUNITCONTEXTType createGEOMETRICUNITCONTEXTType() {
		GEOMETRICUNITCONTEXTTypeImpl geometricunitcontextType = new GEOMETRICUNITCONTEXTTypeImpl();
		return geometricunitcontextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HEADERType createHEADERType() {
		HEADERTypeImpl headerType = new HEADERTypeImpl();
		return headerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPFILEType createHTTPFILEType() {
		HTTPFILETypeImpl httpfileType = new HTTPFILETypeImpl();
		return httpfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDENTIFIEDDOCUMENTType createIDENTIFIEDDOCUMENTType() {
		IDENTIFIEDDOCUMENTTypeImpl identifieddocumentType = new IDENTIFIEDDOCUMENTTypeImpl();
		return identifieddocumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATIONType createILLUSTRATIONType() {
		ILLUSTRATIONTypeImpl illustrationType = new ILLUSTRATIONTypeImpl();
		return illustrationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INFORMATIONType createINFORMATIONType() {
		INFORMATIONTypeImpl informationType = new INFORMATIONTypeImpl();
		return informationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTCURRENCYTYPEType createINTCURRENCYTYPEType() {
		INTCURRENCYTYPETypeImpl intcurrencytypeType = new INTCURRENCYTYPETypeImpl();
		return intcurrencytypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTDICVALUEType createINTDICVALUEType() {
		INTDICVALUETypeImpl intdicvalueType = new INTDICVALUETypeImpl();
		return intdicvalueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTEGRITYCONSTRAINTType createINTEGRITYCONSTRAINTType() {
		INTEGRITYCONSTRAINTTypeImpl integrityconstraintType = new INTEGRITYCONSTRAINTTypeImpl();
		return integrityconstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTMEASURETYPEType createINTMEASURETYPEType() {
		INTMEASURETYPETypeImpl intmeasuretypeType = new INTMEASURETYPETypeImpl();
		return intmeasuretypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTTYPEType createINTTYPEType() {
		INTTYPETypeImpl inttypeType = new INTTYPETypeImpl();
		return inttypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITEMCLASSCASEOFType createITEMCLASSCASEOFType() {
		ITEMCLASSCASEOFTypeImpl itemclasscaseofType = new ITEMCLASSCASEOFTypeImpl();
		return itemclasscaseofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITEMCLASSType createITEMCLASSType() {
		ITEMCLASSTypeImpl itemclassType = new ITEMCLASSTypeImpl();
		return itemclassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITSVALUESType createITSVALUESType() {
		ITSVALUESTypeImpl itsvaluesType = new ITSVALUESTypeImpl();
		return itsvaluesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEYWORDLABELType createKEYWORDLABELType() {
		KEYWORDLABELTypeImpl keywordlabelType = new KEYWORDLABELTypeImpl();
		return keywordlabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEYWORDREFERENCESType createKEYWORDREFERENCESType() {
		KEYWORDREFERENCESTypeImpl keywordreferencesType = new KEYWORDREFERENCESTypeImpl();
		return keywordreferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEYWORDType createKEYWORDType() {
		KEYWORDTypeImpl keywordType = new KEYWORDTypeImpl();
		return keywordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANGUAGEType createLANGUAGEType() {
		LANGUAGETypeImpl languageType = new LANGUAGETypeImpl();
		return languageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEVELType createLEVELType() {
		LEVELTypeImpl levelType = new LEVELTypeImpl();
		return levelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEVELTYPEType createLEVELTYPEType() {
		LEVELTYPETypeImpl leveltypeType = new LEVELTYPETypeImpl();
		return leveltypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIBRARYIIMIDENTIFICATIONType createLIBRARYIIMIDENTIFICATIONType() {
		LIBRARYIIMIDENTIFICATIONTypeImpl libraryiimidentificationType = new LIBRARYIIMIDENTIFICATIONTypeImpl();
		return libraryiimidentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIBRARYINSTANDARDFORMATType createLIBRARYINSTANDARDFORMATType() {
		LIBRARYINSTANDARDFORMATTypeImpl libraryinstandardformatType = new LIBRARYINSTANDARDFORMATTypeImpl();
		return libraryinstandardformatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIBRARYType createLIBRARYType() {
		LIBRARYTypeImpl libraryType = new LIBRARYTypeImpl();
		return libraryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LISTTYPEType createLISTTYPEType() {
		LISTTYPETypeImpl listtypeType = new LISTTYPETypeImpl();
		return listtypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MATHEMATICALSTRINGType createMATHEMATICALSTRINGType() {
		MATHEMATICALSTRINGTypeImpl mathematicalstringType = new MATHEMATICALSTRINGTypeImpl();
		return mathematicalstringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGEType createMESSAGEType() {
		MESSAGETypeImpl messageType = new MESSAGETypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NAMEDTYPEType createNAMEDTYPEType() {
		NAMEDTYPETypeImpl namedtypeType = new NAMEDTYPETypeImpl();
		return namedtypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NAMEDUNITType createNAMEDUNITType() {
		NAMEDUNITTypeImpl namedunitType = new NAMEDUNITTypeImpl();
		return namedunitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONDEPENDENTPDETType createNONDEPENDENTPDETType() {
		NONDEPENDENTPDETTypeImpl nondependentpdetType = new NONDEPENDENTPDETTypeImpl();
		return nondependentpdetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONINSTANTIABLEFUNCTIONALVIEWCLASSType createNONINSTANTIABLEFUNCTIONALVIEWCLASSType() {
		NONINSTANTIABLEFUNCTIONALVIEWCLASSTypeImpl noninstantiablefunctionalviewclassType = new NONINSTANTIABLEFUNCTIONALVIEWCLASSTypeImpl();
		return noninstantiablefunctionalviewclassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONQUANTITATIVECODETYPEType createNONQUANTITATIVECODETYPEType() {
		NONQUANTITATIVECODETYPETypeImpl nonquantitativecodetypeType = new NONQUANTITATIVECODETYPETypeImpl();
		return nonquantitativecodetypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONQUANTITATIVEINTTYPEType createNONQUANTITATIVEINTTYPEType() {
		NONQUANTITATIVEINTTYPETypeImpl nonquantitativeinttypeType = new NONQUANTITATIVEINTTYPETypeImpl();
		return nonquantitativeinttypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONSIUNITType createNONSIUNITType() {
		NONSIUNITTypeImpl nonsiunitType = new NONSIUNITTypeImpl();
		return nonsiunitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONTRANSLATABLESTRINGTYPEType createNONTRANSLATABLESTRINGTYPEType() {
		NONTRANSLATABLESTRINGTYPETypeImpl nontranslatablestringtypeType = new NONTRANSLATABLESTRINGTYPETypeImpl();
		return nontranslatablestringtypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUMBERTYPEType createNUMBERTYPEType() {
		NUMBERTYPETypeImpl numbertypeType = new NUMBERTYPETypeImpl();
		return numbertypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ONTOMLType createONTOMLType() {
		ONTOMLTypeImpl ontomlType = new ONTOMLTypeImpl();
		return ontomlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORGANIZATIONType createORGANIZATIONType() {
		ORGANIZATIONTypeImpl organizationType = new ORGANIZATIONTypeImpl();
		return organizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PERSONType createPERSONType() {
		PERSONTypeImpl personType = new PERSONTypeImpl();
		return personType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLACEMENTTYPEType createPLACEMENTTYPEType() {
		PLACEMENTTYPETypeImpl placementtypeType = new PLACEMENTTYPETypeImpl();
		return placementtypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POSTCONDITIONType createPOSTCONDITIONType() {
		POSTCONDITIONTypeImpl postconditionType = new POSTCONDITIONTypeImpl();
		return postconditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRECONDITIONType createPRECONDITIONType() {
		PRECONDITIONTypeImpl preconditionType = new PRECONDITIONTypeImpl();
		return preconditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREFERREDNAMELABELType createPREFERREDNAMELABELType() {
		PREFERREDNAMELABELTypeImpl preferrednamelabelType = new PREFERREDNAMELABELTypeImpl();
		return preferrednamelabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREFERREDNAMEType createPREFERREDNAMEType() {
		PREFERREDNAMETypeImpl preferrednameType = new PREFERREDNAMETypeImpl();
		return preferrednameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROGRAMREFERENCETYPEType createPROGRAMREFERENCETYPEType() {
		PROGRAMREFERENCETYPETypeImpl programreferencetypeType = new PROGRAMREFERENCETYPETypeImpl();
		return programreferencetypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType createPROPERTIESREFERENCEType() {
		PROPERTIESREFERENCETypeImpl propertiesreferenceType = new PROPERTIESREFERENCETypeImpl();
		return propertiesreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYCLASSIFICATIONType createPROPERTYCLASSIFICATIONType() {
		PROPERTYCLASSIFICATIONTypeImpl propertyclassificationType = new PROPERTYCLASSIFICATIONTypeImpl();
		return propertyclassificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYMAPPINGType createPROPERTYMAPPINGType() {
		PROPERTYMAPPINGTypeImpl propertymappingType = new PROPERTYMAPPINGTypeImpl();
		return propertymappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCEType createPROPERTYREFERENCEType() {
		PROPERTYREFERENCETypeImpl propertyreferenceType = new PROPERTYREFERENCETypeImpl();
		return propertyreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYVALUERECOMMENDEDPRESENTATIONType createPROPERTYVALUERECOMMENDEDPRESENTATIONType() {
		PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl propertyvaluerecommendedpresentationType = new PROPERTYVALUERECOMMENDEDPRESENTATIONTypeImpl();
		return propertyvaluerecommendedpresentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RANGECONSTRAINTType createRANGECONSTRAINTType() {
		RANGECONSTRAINTTypeImpl rangeconstraintType = new RANGECONSTRAINTTypeImpl();
		return rangeconstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RATIONALMEASURETYPEType createRATIONALMEASURETYPEType() {
		RATIONALMEASURETYPETypeImpl rationalmeasuretypeType = new RATIONALMEASURETYPETypeImpl();
		return rationalmeasuretypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RATIONALTYPEType createRATIONALTYPEType() {
		RATIONALTYPETypeImpl rationaltypeType = new RATIONALTYPETypeImpl();
		return rationaltypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REALCURRENCYTYPEType createREALCURRENCYTYPEType() {
		REALCURRENCYTYPETypeImpl realcurrencytypeType = new REALCURRENCYTYPETypeImpl();
		return realcurrencytypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REALMEASURETYPEType createREALMEASURETYPEType() {
		REALMEASURETYPETypeImpl realmeasuretypeType = new REALMEASURETYPETypeImpl();
		return realmeasuretypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REALTYPEType createREALTYPEType() {
		REALTYPETypeImpl realtypeType = new REALTYPETypeImpl();
		return realtypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RECOMMENDEDPRESENTATIONType createRECOMMENDEDPRESENTATIONType() {
		RECOMMENDEDPRESENTATIONTypeImpl recommendedpresentationType = new RECOMMENDEDPRESENTATIONTypeImpl();
		return recommendedpresentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REFERENCEDDOCUMENTType createREFERENCEDDOCUMENTType() {
		REFERENCEDDOCUMENTTypeImpl referenceddocumentType = new REFERENCEDDOCUMENTTypeImpl();
		return referenceddocumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REFERENCEDGRAPHICSType createREFERENCEDGRAPHICSType() {
		REFERENCEDGRAPHICSTypeImpl referencedgraphicsType = new REFERENCEDGRAPHICSTypeImpl();
		return referencedgraphicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REMOTELOCATIONSType createREMOTELOCATIONSType() {
		REMOTELOCATIONSTypeImpl remotelocationsType = new REMOTELOCATIONSTypeImpl();
		return remotelocationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteLocationType createRemoteLocationType() {
		RemoteLocationTypeImpl remoteLocationType = new RemoteLocationTypeImpl();
		return remoteLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REPRESENTATIONPDETType createREPRESENTATIONPDETType() {
		REPRESENTATIONPDETTypeImpl representationpdetType = new REPRESENTATIONPDETTypeImpl();
		return representationpdetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REPRESENTATIONREFERENCETYPEType createREPRESENTATIONREFERENCETYPEType() {
		REPRESENTATIONREFERENCETYPETypeImpl representationreferencetypeType = new REPRESENTATIONREFERENCETYPETypeImpl();
		return representationreferencetypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REUSABLEKEYWORDType createREUSABLEKEYWORDType() {
		REUSABLEKEYWORDTypeImpl reusablekeywordType = new REUSABLEKEYWORDTypeImpl();
		return reusablekeywordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REUSABLESYNONYMType createREUSABLESYNONYMType() {
		REUSABLESYNONYMTypeImpl reusablesynonymType = new REUSABLESYNONYMTypeImpl();
		return reusablesynonymType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SETTYPEType createSETTYPEType() {
		SETTYPETypeImpl settypeType = new SETTYPETypeImpl();
		return settypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SETWITHSUBSETCONSTRAINTTYPEType createSETWITHSUBSETCONSTRAINTTYPEType() {
		SETWITHSUBSETCONSTRAINTTYPETypeImpl setwithsubsetconstrainttypeType = new SETWITHSUBSETCONSTRAINTTYPETypeImpl();
		return setwithsubsetconstrainttypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SHORTNAMELABELType createSHORTNAMELABELType() {
		SHORTNAMELABELTypeImpl shortnamelabelType = new SHORTNAMELABELTypeImpl();
		return shortnamelabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SHORTNAMEType createSHORTNAMEType() {
		SHORTNAMETypeImpl shortnameType = new SHORTNAMETypeImpl();
		return shortnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIUNITType createSIUNITType() {
		SIUNITTypeImpl siunitType = new SIUNITTypeImpl();
		return siunitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGDICVALUEType createSTRINGDICVALUEType() {
		STRINGDICVALUETypeImpl stringdicvalueType = new STRINGDICVALUETypeImpl();
		return stringdicvalueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGPATTERNCONSTRAINTType createSTRINGPATTERNCONSTRAINTType() {
		STRINGPATTERNCONSTRAINTTypeImpl stringpatternconstraintType = new STRINGPATTERNCONSTRAINTTypeImpl();
		return stringpatternconstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGSIZECONSTRAINTType createSTRINGSIZECONSTRAINTType() {
		STRINGSIZECONSTRAINTTypeImpl stringsizeconstraintType = new STRINGSIZECONSTRAINTTypeImpl();
		return stringsizeconstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGSType createSTRINGSType() {
		STRINGSTypeImpl stringsType = new STRINGSTypeImpl();
		return stringsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGTYPEType createSTRINGTYPEType() {
		STRINGTYPETypeImpl stringtypeType = new STRINGTYPETypeImpl();
		return stringtypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUBCLASSCONSTRAINTType createSUBCLASSCONSTRAINTType() {
		SUBCLASSCONSTRAINTTypeImpl subclassconstraintType = new SUBCLASSCONSTRAINTTypeImpl();
		return subclassconstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUBSETType createSUBSETType() {
		SUBSETTypeImpl subsetType = new SUBSETTypeImpl();
		return subsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERREFERENCEType createSUPPLIERREFERENCEType() {
		SUPPLIERREFERENCETypeImpl supplierreferenceType = new SUPPLIERREFERENCETypeImpl();
		return supplierreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERSREFERENCEType createSUPPLIERSREFERENCEType() {
		SUPPLIERSREFERENCETypeImpl suppliersreferenceType = new SUPPLIERSREFERENCETypeImpl();
		return suppliersreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERType createSUPPLIERType() {
		SUPPLIERTypeImpl supplierType = new SUPPLIERTypeImpl();
		return supplierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPORTEDVEPType createSUPPORTEDVEPType() {
		SUPPORTEDVEPTypeImpl supportedvepType = new SUPPORTEDVEPTypeImpl();
		return supportedvepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSNAMELABELType createSYNONYMOUSNAMELABELType() {
		SYNONYMOUSNAMELABELTypeImpl synonymousnamelabelType = new SYNONYMOUSNAMELABELTypeImpl();
		return synonymousnamelabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSNAMEType createSYNONYMOUSNAMEType() {
		SYNONYMOUSNAMETypeImpl synonymousnameType = new SYNONYMOUSNAMETypeImpl();
		return synonymousnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSSYMBOLSType createSYNONYMOUSSYMBOLSType() {
		SYNONYMOUSSYMBOLSTypeImpl synonymoussymbolsType = new SYNONYMOUSSYMBOLSTypeImpl();
		return synonymoussymbolsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMREFERENCESType createSYNONYMREFERENCESType() {
		SYNONYMREFERENCESTypeImpl synonymreferencesType = new SYNONYMREFERENCESTypeImpl();
		return synonymreferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTType createTEXTType() {
		TEXTTypeImpl textType = new TEXTTypeImpl();
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIMEDATATYPEType createTIMEDATATYPEType() {
		TIMEDATATYPETypeImpl timedatatypeType = new TIMEDATATYPETypeImpl();
		return timedatatypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRANSLATABLESTRINGTYPEType createTRANSLATABLESTRINGTYPEType() {
		TRANSLATABLESTRINGTYPETypeImpl translatablestringtypeType = new TRANSLATABLESTRINGTYPETypeImpl();
		return translatablestringtypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRANSLATIONDATAType createTRANSLATIONDATAType() {
		TRANSLATIONDATATypeImpl translationdataType = new TRANSLATIONDATATypeImpl();
		return translationdataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRANSLATIONType createTRANSLATIONType() {
		TRANSLATIONTypeImpl translationType = new TRANSLATIONTypeImpl();
		return translationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URITYPEType createURITYPEType() {
		URITYPETypeImpl uritypeType = new URITYPETypeImpl();
		return uritypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCVRANGEType createVCVRANGEType() {
		VCVRANGETypeImpl vcvrangeType = new VCVRANGETypeImpl();
		return vcvrangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VIEWCONTROLVARIABLERANGEType createVIEWCONTROLVARIABLERANGEType() {
		VIEWCONTROLVARIABLERANGETypeImpl viewcontrolvariablerangeType = new VIEWCONTROLVARIABLERANGETypeImpl();
		return viewcontrolvariablerangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VIEWEXCHANGEPROTOCOLIDENTIFICATIONType createVIEWEXCHANGEPROTOCOLIDENTIFICATIONType() {
		VIEWEXCHANGEPROTOCOLIDENTIFICATIONTypeImpl viewexchangeprotocolidentificationType = new VIEWEXCHANGEPROTOCOLIDENTIFICATIONTypeImpl();
		return viewexchangeprotocolidentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATIONTYPEType createILLUSTRATIONTYPETypeFromString(EDataType eDataType, String initialValue) {
		ILLUSTRATIONTYPEType result = ILLUSTRATIONTYPEType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertILLUSTRATIONTYPETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIPREFIXType createSIPREFIXTypeFromString(EDataType eDataType, String initialValue) {
		SIPREFIXType result = SIPREFIXType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIPREFIXTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIUNITNAMEType createSIUNITNAMETypeFromString(EDataType eDataType, String initialValue) {
		SIUNITNAMEType result = SIUNITNAMEType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIUNITNAMETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STANDARDSIZEType createSTANDARDSIZETypeFromString(EDataType eDataType, String initialValue) {
		STANDARDSIZEType result = STANDARDSIZEType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTANDARDSIZETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESPECIFICATIONType createVALUESPECIFICATIONTypeFromString(EDataType eDataType, String initialValue) {
		VALUESPECIFICATIONType result = VALUESPECIFICATIONType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVALUESPECIFICATIONTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createABSOLUTEURLTYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertABSOLUTEURLTYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAPosterioriSemanticRelationIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAPosterioriSemanticRelationIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassRefTypeFromString(EDataType eDataType, String initialValue) {
		return createClassIdFromString(OntomlPackage.eINSTANCE.getClassId(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassRefTypeToString(EDataType eDataType, Object instanceValue) {
		return convertClassIdToString(OntomlPackage.eINSTANCE.getClassId(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassRefType1FromString(EDataType eDataType, String initialValue) {
		return createClassIdFromString(OntomlPackage.eINSTANCE.getClassId(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassRefType1ToString(EDataType eDataType, Object instanceValue) {
		return convertClassIdToString(OntomlPackage.eINSTANCE.getClassId(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassRefType2FromString(EDataType eDataType, String initialValue) {
		return createClassIdFromString(OntomlPackage.eINSTANCE.getClassId(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassRefType2ToString(EDataType eDataType, Object instanceValue) {
		return convertClassIdToString(OntomlPackage.eINSTANCE.getClassId(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassRefType3FromString(EDataType eDataType, String initialValue) {
		return createClassIdFromString(OntomlPackage.eINSTANCE.getClassId(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassRefType3ToString(EDataType eDataType, Object instanceValue) {
		return convertClassIdToString(OntomlPackage.eINSTANCE.getClassId(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassRefType4FromString(EDataType eDataType, String initialValue) {
		return createClassIdFromString(OntomlPackage.eINSTANCE.getClassId(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassRefType4ToString(EDataType eDataType, Object instanceValue) {
		return convertClassIdToString(OntomlPackage.eINSTANCE.getClassId(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassRefType5FromString(EDataType eDataType, String initialValue) {
		return createClassIdFromString(OntomlPackage.eINSTANCE.getClassId(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassRefType5ToString(EDataType eDataType, Object instanceValue) {
		return convertClassIdToString(OntomlPackage.eINSTANCE.getClassId(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConstraintIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCOUNTRYCODETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOUNTRYCODETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCURRENCYCODETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCURRENCYCODETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCurrencyIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencyIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDataTypeIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDATETYPETypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDATETYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDETCLASSIFICATIONTYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDETCLASSIFICATIONTYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDicUnitIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDicUnitIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDicValueIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDicValueIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDocumentIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDOCUMENTIDENTIFIERNAMETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDOCUMENTIDENTIFIERNAMETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEptosGUIDFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEptosGUIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEXTERNALITEMCODETYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEXTERNALITEMCODETYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFreeRelationDefinitionIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFreeRelationDefinitionIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFreeRelationEndIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFreeRelationEndIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHTTPDIRECTORYNAMETYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPDIRECTORYNAMETYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHTTPFILENAMETYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPFILENAMETYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATIONTYPEType createILLUSTRATIONTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
		return createILLUSTRATIONTYPETypeFromString(OntomlPackage.eINSTANCE.getILLUSTRATIONTYPEType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertILLUSTRATIONTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertILLUSTRATIONTYPETypeToString(OntomlPackage.eINSTANCE.getILLUSTRATIONTYPEType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKEYWORDREFERENCETypeFromString(EDataType eDataType, String initialValue) {
		return createReusableNameIdFromString(OntomlPackage.eINSTANCE.getReusableNameId(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKEYWORDREFERENCETypeToString(EDataType eDataType, Object instanceValue) {
		return convertReusableNameIdToString(OntomlPackage.eINSTANCE.getReusableNameId(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createKEYWORDTYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKEYWORDTYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLANGUAGECODETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLANGUAGECODETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOntologyIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOntologyIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPOSITIVELENGTHMEASURETypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOSITIVELENGTHMEASURETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPOSITIVEPLANEANGLEMEASURETypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOSITIVEPLANEANGLEMEASURETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPOSITIVERATIOMEASURETypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOSITIVERATIOMEASURETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPREFERREDNAMETYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPREFERREDNAMETYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPROGRAMREFERENCENAMETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPROGRAMREFERENCENAMETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPropertyIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createReusableNameIdFromString(EDataType eDataType, String initialValue) {
		return (String)IdentifierFactory.eINSTANCE.createFromString(IdentifierPackage.Literals.IRDI_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReusableNameIdToString(EDataType eDataType, Object instanceValue) {
		return IdentifierFactory.eINSTANCE.convertToString(IdentifierPackage.Literals.IRDI_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createREVISIONTYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertREVISIONTYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSHORTNAMETYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSHORTNAMETYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIPREFIXType createSIPREFIXTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSIPREFIXTypeFromString(OntomlPackage.eINSTANCE.getSIPREFIXType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIPREFIXTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSIPREFIXTypeToString(OntomlPackage.eINSTANCE.getSIPREFIXType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIUNITNAMEType createSIUNITNAMETypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSIUNITNAMETypeFromString(OntomlPackage.eINSTANCE.getSIUNITNAMEType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIUNITNAMETypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSIUNITNAMETypeToString(OntomlPackage.eINSTANCE.getSIUNITNAMEType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STANDARDSIZEType createSTANDARDSIZETypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSTANDARDSIZETypeFromString(OntomlPackage.eINSTANCE.getSTANDARDSIZEType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTANDARDSIZETypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSTANDARDSIZETypeToString(OntomlPackage.eINSTANCE.getSTANDARDSIZEType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSTATUSTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTATUSTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSUPPLIERCODETYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSUPPLIERCODETYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSupplierIdFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplierIdToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSYNONYMOUSNAMETYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSYNONYMOUSNAMETYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSYNONYMREFERENCETypeFromString(EDataType eDataType, String initialValue) {
		return createReusableNameIdFromString(OntomlPackage.eINSTANCE.getReusableNameId(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSYNONYMREFERENCETypeToString(EDataType eDataType, Object instanceValue) {
		return convertReusableNameIdToString(OntomlPackage.eINSTANCE.getReusableNameId(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVALUECODETYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVALUECODETYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVALUEFORMATTYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVALUEFORMATTYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESPECIFICATIONType createVALUESPECIFICATIONTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVALUESPECIFICATIONTypeFromString(OntomlPackage.eINSTANCE.getVALUESPECIFICATIONType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVALUESPECIFICATIONTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVALUESPECIFICATIONTypeToString(OntomlPackage.eINSTANCE.getVALUESPECIFICATIONType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVERSIONTYPETypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVERSIONTYPETypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntomlPackage getOntomlPackage() {
		return (OntomlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OntomlPackage getPackage() {
		return OntomlPackage.eINSTANCE;
	}

} //OntomlFactoryImpl
