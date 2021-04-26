/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.util;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.*;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.util.IdentifierValidator;

import java.math.BigDecimal;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage
 * @generated
 */
public class OntomlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OntomlValidator INSTANCE = new OntomlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntomlValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OntomlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OntomlPackage.ALTERNATIVEUNITS_TYPE:
				return validateALTERNATIVEUNITSType((ALTERNATIVEUNITSType)value, diagnostics, context);
			case OntomlPackage.ANYTYPE_TYPE:
				return validateANYTYPEType((ANYTYPEType)value, diagnostics, context);
			case OntomlPackage.APOSTERIORICASEOF_TYPE:
				return validateAPOSTERIORICASEOFType((APOSTERIORICASEOFType)value, diagnostics, context);
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIPS_TYPE:
				return validateAPOSTERIORISEMANTICRELATIONSHIPSType((APOSTERIORISEMANTICRELATIONSHIPSType)value, diagnostics, context);
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIP_TYPE:
				return validateAPOSTERIORISEMANTICRELATIONSHIPType((APOSTERIORISEMANTICRELATIONSHIPType)value, diagnostics, context);
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE:
				return validateAPOSTERIORIVIEWOFType((APOSTERIORIVIEWOFType)value, diagnostics, context);
			case OntomlPackage.ARRAYTYPE_TYPE:
				return validateARRAYTYPEType((ARRAYTYPEType)value, diagnostics, context);
			case OntomlPackage.ASSIGNEDVALUE_TYPE:
				return validateASSIGNEDVALUEType((ASSIGNEDVALUEType)value, diagnostics, context);
			case OntomlPackage.AUTHORS_TYPE:
				return validateAUTHORSType((AUTHORSType)value, diagnostics, context);
			case OntomlPackage.AXIS1PLACEMENTTYPE_TYPE:
				return validateAXIS1PLACEMENTTYPEType((AXIS1PLACEMENTTYPEType)value, diagnostics, context);
			case OntomlPackage.AXIS2PLACEMENT2DTYPE_TYPE:
				return validateAXIS2PLACEMENT2DTYPEType((AXIS2PLACEMENT2DTYPEType)value, diagnostics, context);
			case OntomlPackage.AXIS2PLACEMENT3DTYPE_TYPE:
				return validateAXIS2PLACEMENT3DTYPEType((AXIS2PLACEMENT3DTYPEType)value, diagnostics, context);
			case OntomlPackage.BAGTYPE_TYPE:
				return validateBAGTYPEType((BAGTYPEType)value, diagnostics, context);
			case OntomlPackage.BOOLEANTYPE_TYPE:
				return validateBOOLEANTYPEType((BOOLEANTYPEType)value, diagnostics, context);
			case OntomlPackage.CARDINALITYCONSTRAINT_TYPE:
				return validateCARDINALITYCONSTRAINTType((CARDINALITYCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.CATEGORIZATIONCLASS_TYPE:
				return validateCATEGORIZATIONCLASSType((CATEGORIZATIONCLASSType)value, diagnostics, context);
			case OntomlPackage.CLASSCONSTANTVALUES_TYPE:
				return validateCLASSCONSTANTVALUESType((CLASSCONSTANTVALUESType)value, diagnostics, context);
			case OntomlPackage.CLASSCONSTRAINT_TYPE:
				return validateCLASSCONSTRAINTType((CLASSCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.CLASSESREFERENCE_TYPE:
				return validateCLASSESREFERENCEType((CLASSESREFERENCEType)value, diagnostics, context);
			case OntomlPackage.CLASSEXTENSION_TYPE:
				return validateCLASSEXTENSIONType((CLASSEXTENSIONType)value, diagnostics, context);
			case OntomlPackage.CLASSIFICATION_TYPE:
				return validateCLASSIFICATIONType((CLASSIFICATIONType)value, diagnostics, context);
			case OntomlPackage.CLASSPRESENTATIONONPAPER_TYPE:
				return validateCLASSPRESENTATIONONPAPERType((CLASSPRESENTATIONONPAPERType)value, diagnostics, context);
			case OntomlPackage.CLASSPRESENTATIONONSCREEN_TYPE:
				return validateCLASSPRESENTATIONONSCREENType((CLASSPRESENTATIONONSCREENType)value, diagnostics, context);
			case OntomlPackage.CLASSREFERENCE_TYPE:
				return validateCLASSREFERENCEType((CLASSREFERENCEType)value, diagnostics, context);
			case OntomlPackage.CLASSREFERENCETYPE_TYPE:
				return validateCLASSREFERENCETYPEType((CLASSREFERENCETYPEType)value, diagnostics, context);
			case OntomlPackage.CLASS_TYPE:
				return validateCLASSType((CLASSType)value, diagnostics, context);
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE:
				return validateCLASSVALUEASSIGNMENTType((CLASSVALUEASSIGNMENTType)value, diagnostics, context);
			case OntomlPackage.CONDITIONDET_TYPE:
				return validateCONDITIONDETType((CONDITIONDETType)value, diagnostics, context);
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE:
				return validateCONFIGURATIONCONTROLCONSTRAINTType((CONFIGURATIONCONTROLCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE:
				return validateCONSTRAINTORCONSTRAINTIDType((CONSTRAINTORCONSTRAINTIDType)value, diagnostics, context);
			case OntomlPackage.CONSTRAINTS_TYPE:
				return validateCONSTRAINTSType((CONSTRAINTSType)value, diagnostics, context);
			case OntomlPackage.CONSTRAINT_TYPE:
				return validateCONSTRAINTType((CONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.CONTAINEDCLASSES_TYPE:
				return validateCONTAINEDCLASSESType((CONTAINEDCLASSESType)value, diagnostics, context);
			case OntomlPackage.CONTAINEDCLASSEXTENSIONS_TYPE:
				return validateCONTAINEDCLASSEXTENSIONSType((CONTAINEDCLASSEXTENSIONSType)value, diagnostics, context);
			case OntomlPackage.CONTAINEDDATATYPES_TYPE:
				return validateCONTAINEDDATATYPESType((CONTAINEDDATATYPESType)value, diagnostics, context);
			case OntomlPackage.CONTAINEDDOCUMENTS_TYPE:
				return validateCONTAINEDDOCUMENTSType((CONTAINEDDOCUMENTSType)value, diagnostics, context);
			case OntomlPackage.CONTAINEDKEYWORDS_TYPE:
				return validateCONTAINEDKEYWORDSType((CONTAINEDKEYWORDSType)value, diagnostics, context);
			case OntomlPackage.CONTAINEDPROPERTIES_TYPE:
				return validateCONTAINEDPROPERTIESType((CONTAINEDPROPERTIESType)value, diagnostics, context);
			case OntomlPackage.CONTAINEDSUPPLIERS_TYPE:
				return validateCONTAINEDSUPPLIERSType((CONTAINEDSUPPLIERSType)value, diagnostics, context);
			case OntomlPackage.CONTAINEDSYNONYMS_TYPE:
				return validateCONTAINEDSYNONYMSType((CONTAINEDSYNONYMSType)value, diagnostics, context);
			case OntomlPackage.CONTEXTDEPENDENTUNIT_TYPE:
				return validateCONTEXTDEPENDENTUNITType((CONTEXTDEPENDENTUNITType)value, diagnostics, context);
			case OntomlPackage.CONTEXTPARAMETERCONSTRAINTS_TYPE:
				return validateCONTEXTPARAMETERCONSTRAINTSType((CONTEXTPARAMETERCONSTRAINTSType)value, diagnostics, context);
			case OntomlPackage.CONTEXTPARAMICON_TYPE:
				return validateCONTEXTPARAMICONType((CONTEXTPARAMICONType)value, diagnostics, context);
			case OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE:
				return validateCONTEXTRESTRICTIONCONSTRAINTType((CONTEXTRESTRICTIONCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE:
				return validateCONVERSIONBASEDUNITType((CONVERSIONBASEDUNITType)value, diagnostics, context);
			case OntomlPackage.CORRESPONDINGPROPERTIES_TYPE:
				return validateCORRESPONDINGPROPERTIESType((CORRESPONDINGPROPERTIESType)value, diagnostics, context);
			case OntomlPackage.CREATEICON_TYPE:
				return validateCREATEICONType((CREATEICONType)value, diagnostics, context);
			case OntomlPackage.DATATYPEREFERENCE_TYPE:
				return validateDATATYPEREFERENCEType((DATATYPEREFERENCEType)value, diagnostics, context);
			case OntomlPackage.DATATYPESREFERENCE_TYPE:
				return validateDATATYPESREFERENCEType((DATATYPESREFERENCEType)value, diagnostics, context);
			case OntomlPackage.DATATYPE_TYPE:
				return validateDATATYPEType((DATATYPEType)value, diagnostics, context);
			case OntomlPackage.DATEDATATYPE_TYPE:
				return validateDATEDATATYPEType((DATEDATATYPEType)value, diagnostics, context);
			case OntomlPackage.DATETIMEDATATYPE_TYPE:
				return validateDATETIMEDATATYPEType((DATETIMEDATATYPEType)value, diagnostics, context);
			case OntomlPackage.DEPENDENTPDET_TYPE:
				return validateDEPENDENTPDETType((DEPENDENTPDETType)value, diagnostics, context);
			case OntomlPackage.DERIVEDUNITELEMENT_TYPE:
				return validateDERIVEDUNITELEMENTType((DERIVEDUNITELEMENTType)value, diagnostics, context);
			case OntomlPackage.DERIVEDUNIT_TYPE:
				return validateDERIVEDUNITType((DERIVEDUNITType)value, diagnostics, context);
			case OntomlPackage.DICTIONARIESREFERENCE_TYPE:
				return validateDICTIONARIESREFERENCEType((DICTIONARIESREFERENCEType)value, diagnostics, context);
			case OntomlPackage.DICTIONARYINSTANDARDFORMAT_TYPE:
				return validateDICTIONARYINSTANDARDFORMATType((DICTIONARYINSTANDARDFORMATType)value, diagnostics, context);
			case OntomlPackage.DICTIONARYREFERENCE_TYPE:
				return validateDICTIONARYREFERENCEType((DICTIONARYREFERENCEType)value, diagnostics, context);
			case OntomlPackage.DICTIONARY_TYPE:
				return validateDICTIONARYType((DICTIONARYType)value, diagnostics, context);
			case OntomlPackage.DICUNITREFERENCE_TYPE:
				return validateDICUNITREFERENCEType((DICUNITREFERENCEType)value, diagnostics, context);
			case OntomlPackage.DICUNITSREFERENCE_TYPE:
				return validateDICUNITSREFERENCEType((DICUNITSREFERENCEType)value, diagnostics, context);
			case OntomlPackage.DICUNIT_TYPE:
				return validateDICUNITType((DICUNITType)value, diagnostics, context);
			case OntomlPackage.DICVALUE_TYPE:
				return validateDICVALUEType((DICVALUEType)value, diagnostics, context);
			case OntomlPackage.DIMENSIONALEXPONENTS_TYPE:
				return validateDIMENSIONALEXPONENTSType((DIMENSIONALEXPONENTSType)value, diagnostics, context);
			case OntomlPackage.DOCUMENTCONTENT_TYPE:
				return validateDOCUMENTCONTENTType((DOCUMENTCONTENTType)value, diagnostics, context);
			case OntomlPackage.DOCUMENTIDENTIFIERNAMELABEL_TYPE:
				return validateDOCUMENTIDENTIFIERNAMELABELType((DOCUMENTIDENTIFIERNAMELABELType)value, diagnostics, context);
			case OntomlPackage.DOCUMENTIDENTIFIER_TYPE:
				return validateDOCUMENTIDENTIFIERType((DOCUMENTIDENTIFIERType)value, diagnostics, context);
			case OntomlPackage.DOCUMENTREFERENCE_TYPE:
				return validateDOCUMENTREFERENCEType((DOCUMENTREFERENCEType)value, diagnostics, context);
			case OntomlPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case OntomlPackage.DOCUMENTSREFERENCE_TYPE:
				return validateDOCUMENTSREFERENCEType((DOCUMENTSREFERENCEType)value, diagnostics, context);
			case OntomlPackage.DOCUMENT_TYPE:
				return validateDOCUMENTType((DOCUMENTType)value, diagnostics, context);
			case OntomlPackage.DOMAINCONSTRAINTS_TYPE:
				return validateDOMAINCONSTRAINTSType((DOMAINCONSTRAINTSType)value, diagnostics, context);
			case OntomlPackage.DOMAINCONSTRAINT_TYPE:
				return validateDOMAINCONSTRAINTType((DOMAINCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE:
				return validateENUMERATIONCONSTRAINTType((ENUMERATIONCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE:
				return validateEXPLICITFUNCTIONALMODELCLASSEXTENSIONType((EXPLICITFUNCTIONALMODELCLASSEXTENSIONType)value, diagnostics, context);
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE:
				return validateEXPLICITITEMCLASSEXTENSIONType((EXPLICITITEMCLASSEXTENSIONType)value, diagnostics, context);
			case OntomlPackage.EXTERNALFILES_TYPE:
				return validateEXTERNALFILESType((EXTERNALFILESType)value, diagnostics, context);
			case OntomlPackage.EXTERNALGRAPHICS_TYPE:
				return validateEXTERNALGRAPHICSType((EXTERNALGRAPHICSType)value, diagnostics, context);
			case OntomlPackage.EXTERNALRESOURCE_TYPE:
				return validateEXTERNALRESOURCEType((EXTERNALRESOURCEType)value, diagnostics, context);
			case OntomlPackage.FILTER_TYPE:
				return validateFILTERType((FILTERType)value, diagnostics, context);
			case OntomlPackage.FMCLASSVIEWOF_TYPE:
				return validateFMCLASSVIEWOFType((FMCLASSVIEWOFType)value, diagnostics, context);
			case OntomlPackage.FREERELATIONDEFINITIONREF_TYPE:
				return validateFREERELATIONDEFINITIONREFType((FREERELATIONDEFINITIONREFType)value, diagnostics, context);
			case OntomlPackage.FREERELATIONENDREF_TYPE:
				return validateFREERELATIONENDREFType((FREERELATIONENDREFType)value, diagnostics, context);
			case OntomlPackage.FREERELATIONS_TYPE:
				return validateFREERELATIONSType((FREERELATIONSType)value, diagnostics, context);
			case OntomlPackage.FREERELATION_TYPE:
				return validateFREERELATIONType((FREERELATIONType)value, diagnostics, context);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE:
				return validateFUNCTIONALMODELCLASSType((FUNCTIONALMODELCLASSType)value, diagnostics, context);
			case OntomlPackage.GENERALTEXT_TYPE:
				return validateGENERALTEXTType((GENERALTEXTType)value, diagnostics, context);
			case OntomlPackage.GEOMETRICCONTEXT_TYPE:
				return validateGEOMETRICCONTEXTType((GEOMETRICCONTEXTType)value, diagnostics, context);
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE:
				return validateGEOMETRICUNITCONTEXTType((GEOMETRICUNITCONTEXTType)value, diagnostics, context);
			case OntomlPackage.GRAPHICS_TYPE:
				return validateGRAPHICSType((GRAPHICSType)value, diagnostics, context);
			case OntomlPackage.HEADER_TYPE:
				return validateHEADERType((HEADERType)value, diagnostics, context);
			case OntomlPackage.HTTPFILE_TYPE:
				return validateHTTPFILEType((HTTPFILEType)value, diagnostics, context);
			case OntomlPackage.IDENTIFIEDDOCUMENT_TYPE:
				return validateIDENTIFIEDDOCUMENTType((IDENTIFIEDDOCUMENTType)value, diagnostics, context);
			case OntomlPackage.ILLUSTRATION_TYPE:
				return validateILLUSTRATIONType((ILLUSTRATIONType)value, diagnostics, context);
			case OntomlPackage.INFORMATION_TYPE:
				return validateINFORMATIONType((INFORMATIONType)value, diagnostics, context);
			case OntomlPackage.INTCURRENCYTYPE_TYPE:
				return validateINTCURRENCYTYPEType((INTCURRENCYTYPEType)value, diagnostics, context);
			case OntomlPackage.INTDICVALUE_TYPE:
				return validateINTDICVALUEType((INTDICVALUEType)value, diagnostics, context);
			case OntomlPackage.INTEGRITYCONSTRAINT_TYPE:
				return validateINTEGRITYCONSTRAINTType((INTEGRITYCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.INTMEASURETYPE_TYPE:
				return validateINTMEASURETYPEType((INTMEASURETYPEType)value, diagnostics, context);
			case OntomlPackage.INTTYPE_TYPE:
				return validateINTTYPEType((INTTYPEType)value, diagnostics, context);
			case OntomlPackage.ITEMCLASSCASEOF_TYPE:
				return validateITEMCLASSCASEOFType((ITEMCLASSCASEOFType)value, diagnostics, context);
			case OntomlPackage.ITEMCLASS_TYPE:
				return validateITEMCLASSType((ITEMCLASSType)value, diagnostics, context);
			case OntomlPackage.ITSVALUES_TYPE:
				return validateITSVALUESType((ITSVALUESType)value, diagnostics, context);
			case OntomlPackage.KEYWORDLABEL_TYPE:
				return validateKEYWORDLABELType((KEYWORDLABELType)value, diagnostics, context);
			case OntomlPackage.KEYWORDREFERENCES_TYPE:
				return validateKEYWORDREFERENCESType((KEYWORDREFERENCESType)value, diagnostics, context);
			case OntomlPackage.KEYWORD_TYPE:
				return validateKEYWORDType((KEYWORDType)value, diagnostics, context);
			case OntomlPackage.LANGUAGE_TYPE:
				return validateLANGUAGEType((LANGUAGEType)value, diagnostics, context);
			case OntomlPackage.LEVEL_TYPE:
				return validateLEVELType((LEVELType)value, diagnostics, context);
			case OntomlPackage.LEVELTYPE_TYPE:
				return validateLEVELTYPEType((LEVELTYPEType)value, diagnostics, context);
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE:
				return validateLIBRARYIIMIDENTIFICATIONType((LIBRARYIIMIDENTIFICATIONType)value, diagnostics, context);
			case OntomlPackage.LIBRARYINSTANDARDFORMAT_TYPE:
				return validateLIBRARYINSTANDARDFORMATType((LIBRARYINSTANDARDFORMATType)value, diagnostics, context);
			case OntomlPackage.LIBRARY_TYPE:
				return validateLIBRARYType((LIBRARYType)value, diagnostics, context);
			case OntomlPackage.LISTTYPE_TYPE:
				return validateLISTTYPEType((LISTTYPEType)value, diagnostics, context);
			case OntomlPackage.MAPPINGFUNCTION_TYPE:
				return validateMAPPINGFUNCTIONType((MAPPINGFUNCTIONType)value, diagnostics, context);
			case OntomlPackage.MATHEMATICALSTRING_TYPE:
				return validateMATHEMATICALSTRINGType((MATHEMATICALSTRINGType)value, diagnostics, context);
			case OntomlPackage.MESSAGE_TYPE:
				return validateMESSAGEType((MESSAGEType)value, diagnostics, context);
			case OntomlPackage.NAMEDTYPE_TYPE:
				return validateNAMEDTYPEType((NAMEDTYPEType)value, diagnostics, context);
			case OntomlPackage.NAMEDUNIT_TYPE:
				return validateNAMEDUNITType((NAMEDUNITType)value, diagnostics, context);
			case OntomlPackage.NONDEPENDENTPDET_TYPE:
				return validateNONDEPENDENTPDETType((NONDEPENDENTPDETType)value, diagnostics, context);
			case OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE:
				return validateNONINSTANTIABLEFUNCTIONALVIEWCLASSType((NONINSTANTIABLEFUNCTIONALVIEWCLASSType)value, diagnostics, context);
			case OntomlPackage.NONQUANTITATIVECODETYPE_TYPE:
				return validateNONQUANTITATIVECODETYPEType((NONQUANTITATIVECODETYPEType)value, diagnostics, context);
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE:
				return validateNONQUANTITATIVEINTTYPEType((NONQUANTITATIVEINTTYPEType)value, diagnostics, context);
			case OntomlPackage.NONSIUNIT_TYPE:
				return validateNONSIUNITType((NONSIUNITType)value, diagnostics, context);
			case OntomlPackage.NONTRANSLATABLESTRINGTYPE_TYPE:
				return validateNONTRANSLATABLESTRINGTYPEType((NONTRANSLATABLESTRINGTYPEType)value, diagnostics, context);
			case OntomlPackage.NUMBERTYPE_TYPE:
				return validateNUMBERTYPEType((NUMBERTYPEType)value, diagnostics, context);
			case OntomlPackage.ONTOML_TYPE:
				return validateONTOMLType((ONTOMLType)value, diagnostics, context);
			case OntomlPackage.ORGANIZATION_TYPE:
				return validateORGANIZATIONType((ORGANIZATIONType)value, diagnostics, context);
			case OntomlPackage.PERSON_TYPE:
				return validatePERSONType((PERSONType)value, diagnostics, context);
			case OntomlPackage.PLACEMENTTYPE_TYPE:
				return validatePLACEMENTTYPEType((PLACEMENTTYPEType)value, diagnostics, context);
			case OntomlPackage.POSTCONDITION_TYPE:
				return validatePOSTCONDITIONType((POSTCONDITIONType)value, diagnostics, context);
			case OntomlPackage.PRECONDITION_TYPE:
				return validatePRECONDITIONType((PRECONDITIONType)value, diagnostics, context);
			case OntomlPackage.PREFERREDNAMELABEL_TYPE:
				return validatePREFERREDNAMELABELType((PREFERREDNAMELABELType)value, diagnostics, context);
			case OntomlPackage.PREFERREDNAME_TYPE:
				return validatePREFERREDNAMEType((PREFERREDNAMEType)value, diagnostics, context);
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE:
				return validatePROGRAMREFERENCETYPEType((PROGRAMREFERENCETYPEType)value, diagnostics, context);
			case OntomlPackage.PROPERTIESREFERENCE_TYPE:
				return validatePROPERTIESREFERENCEType((PROPERTIESREFERENCEType)value, diagnostics, context);
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE:
				return validatePROPERTYCLASSIFICATIONType((PROPERTYCLASSIFICATIONType)value, diagnostics, context);
			case OntomlPackage.PROPERTYCONSTRAINT_TYPE:
				return validatePROPERTYCONSTRAINTType((PROPERTYCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.PROPERTYMAPPING_TYPE:
				return validatePROPERTYMAPPINGType((PROPERTYMAPPINGType)value, diagnostics, context);
			case OntomlPackage.PROPERTYREFERENCE_TYPE:
				return validatePROPERTYREFERENCEType((PROPERTYREFERENCEType)value, diagnostics, context);
			case OntomlPackage.PROPERTY_TYPE:
				return validatePROPERTYType((PROPERTYType)value, diagnostics, context);
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE:
				return validatePROPERTYVALUERECOMMENDEDPRESENTATIONType((PROPERTYVALUERECOMMENDEDPRESENTATIONType)value, diagnostics, context);
			case OntomlPackage.RANGECONSTRAINT_TYPE:
				return validateRANGECONSTRAINTType((RANGECONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.RATIONALMEASURETYPE_TYPE:
				return validateRATIONALMEASURETYPEType((RATIONALMEASURETYPEType)value, diagnostics, context);
			case OntomlPackage.RATIONALTYPE_TYPE:
				return validateRATIONALTYPEType((RATIONALTYPEType)value, diagnostics, context);
			case OntomlPackage.REALCURRENCYTYPE_TYPE:
				return validateREALCURRENCYTYPEType((REALCURRENCYTYPEType)value, diagnostics, context);
			case OntomlPackage.REALMEASURETYPE_TYPE:
				return validateREALMEASURETYPEType((REALMEASURETYPEType)value, diagnostics, context);
			case OntomlPackage.REALTYPE_TYPE:
				return validateREALTYPEType((REALTYPEType)value, diagnostics, context);
			case OntomlPackage.RECOMMENDEDPRESENTATION_TYPE:
				return validateRECOMMENDEDPRESENTATIONType((RECOMMENDEDPRESENTATIONType)value, diagnostics, context);
			case OntomlPackage.REFERENCEDDOCUMENT_TYPE:
				return validateREFERENCEDDOCUMENTType((REFERENCEDDOCUMENTType)value, diagnostics, context);
			case OntomlPackage.REFERENCEDGRAPHICS_TYPE:
				return validateREFERENCEDGRAPHICSType((REFERENCEDGRAPHICSType)value, diagnostics, context);
			case OntomlPackage.REMOTELOCATIONS_TYPE:
				return validateREMOTELOCATIONSType((REMOTELOCATIONSType)value, diagnostics, context);
			case OntomlPackage.REMOTE_LOCATION_TYPE:
				return validateRemoteLocationType((RemoteLocationType)value, diagnostics, context);
			case OntomlPackage.REPRESENTATIONPDET_TYPE:
				return validateREPRESENTATIONPDETType((REPRESENTATIONPDETType)value, diagnostics, context);
			case OntomlPackage.REPRESENTATIONREFERENCETYPE_TYPE:
				return validateREPRESENTATIONREFERENCETYPEType((REPRESENTATIONREFERENCETYPEType)value, diagnostics, context);
			case OntomlPackage.REUSABLEKEYWORD_TYPE:
				return validateREUSABLEKEYWORDType((REUSABLEKEYWORDType)value, diagnostics, context);
			case OntomlPackage.REUSABLENAME_TYPE:
				return validateREUSABLENAMEType((REUSABLENAMEType)value, diagnostics, context);
			case OntomlPackage.REUSABLESYNONYM_TYPE:
				return validateREUSABLESYNONYMType((REUSABLESYNONYMType)value, diagnostics, context);
			case OntomlPackage.SETTYPE_TYPE:
				return validateSETTYPEType((SETTYPEType)value, diagnostics, context);
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE:
				return validateSETWITHSUBSETCONSTRAINTTYPEType((SETWITHSUBSETCONSTRAINTTYPEType)value, diagnostics, context);
			case OntomlPackage.SHORTNAMELABEL_TYPE:
				return validateSHORTNAMELABELType((SHORTNAMELABELType)value, diagnostics, context);
			case OntomlPackage.SHORTNAME_TYPE:
				return validateSHORTNAMEType((SHORTNAMEType)value, diagnostics, context);
			case OntomlPackage.SIUNIT_TYPE:
				return validateSIUNITType((SIUNITType)value, diagnostics, context);
			case OntomlPackage.SOURCEDOCUMENT_TYPE:
				return validateSOURCEDOCUMENTType((SOURCEDOCUMENTType)value, diagnostics, context);
			case OntomlPackage.STRINGDICVALUE_TYPE:
				return validateSTRINGDICVALUEType((STRINGDICVALUEType)value, diagnostics, context);
			case OntomlPackage.STRINGPATTERNCONSTRAINT_TYPE:
				return validateSTRINGPATTERNCONSTRAINTType((STRINGPATTERNCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.STRINGSIZECONSTRAINT_TYPE:
				return validateSTRINGSIZECONSTRAINTType((STRINGSIZECONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.STRINGS_TYPE:
				return validateSTRINGSType((STRINGSType)value, diagnostics, context);
			case OntomlPackage.STRINGTYPE_TYPE:
				return validateSTRINGTYPEType((STRINGTYPEType)value, diagnostics, context);
			case OntomlPackage.SUBCLASSCONSTRAINT_TYPE:
				return validateSUBCLASSCONSTRAINTType((SUBCLASSCONSTRAINTType)value, diagnostics, context);
			case OntomlPackage.SUBSET_TYPE:
				return validateSUBSETType((SUBSETType)value, diagnostics, context);
			case OntomlPackage.SUPPLIERREFERENCE_TYPE:
				return validateSUPPLIERREFERENCEType((SUPPLIERREFERENCEType)value, diagnostics, context);
			case OntomlPackage.SUPPLIERSREFERENCE_TYPE:
				return validateSUPPLIERSREFERENCEType((SUPPLIERSREFERENCEType)value, diagnostics, context);
			case OntomlPackage.SUPPLIER_TYPE:
				return validateSUPPLIERType((SUPPLIERType)value, diagnostics, context);
			case OntomlPackage.SUPPORTEDVEP_TYPE:
				return validateSUPPORTEDVEPType((SUPPORTEDVEPType)value, diagnostics, context);
			case OntomlPackage.SYNONYMOUSNAMELABEL_TYPE:
				return validateSYNONYMOUSNAMELABELType((SYNONYMOUSNAMELABELType)value, diagnostics, context);
			case OntomlPackage.SYNONYMOUSNAME_TYPE:
				return validateSYNONYMOUSNAMEType((SYNONYMOUSNAMEType)value, diagnostics, context);
			case OntomlPackage.SYNONYMOUSSYMBOLS_TYPE:
				return validateSYNONYMOUSSYMBOLSType((SYNONYMOUSSYMBOLSType)value, diagnostics, context);
			case OntomlPackage.SYNONYMREFERENCES_TYPE:
				return validateSYNONYMREFERENCESType((SYNONYMREFERENCESType)value, diagnostics, context);
			case OntomlPackage.TEXT_TYPE:
				return validateTEXTType((TEXTType)value, diagnostics, context);
			case OntomlPackage.TIMEDATATYPE_TYPE:
				return validateTIMEDATATYPEType((TIMEDATATYPEType)value, diagnostics, context);
			case OntomlPackage.TRANSLATABLESTRINGTYPE_TYPE:
				return validateTRANSLATABLESTRINGTYPEType((TRANSLATABLESTRINGTYPEType)value, diagnostics, context);
			case OntomlPackage.TRANSLATIONDATA_TYPE:
				return validateTRANSLATIONDATAType((TRANSLATIONDATAType)value, diagnostics, context);
			case OntomlPackage.TRANSLATION_TYPE:
				return validateTRANSLATIONType((TRANSLATIONType)value, diagnostics, context);
			case OntomlPackage.UNIT_TYPE:
				return validateUNITType((UNITType)value, diagnostics, context);
			case OntomlPackage.URITYPE_TYPE:
				return validateURITYPEType((URITYPEType)value, diagnostics, context);
			case OntomlPackage.VCVRANGE_TYPE:
				return validateVCVRANGEType((VCVRANGEType)value, diagnostics, context);
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE:
				return validateVIEWCONTROLVARIABLERANGEType((VIEWCONTROLVARIABLERANGEType)value, diagnostics, context);
			case OntomlPackage.VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE:
				return validateVIEWEXCHANGEPROTOCOLIDENTIFICATIONType((VIEWEXCHANGEPROTOCOLIDENTIFICATIONType)value, diagnostics, context);
			case OntomlPackage.ILLUSTRATIONTYPE_TYPE:
				return validateILLUSTRATIONTYPEType((ILLUSTRATIONTYPEType)value, diagnostics, context);
			case OntomlPackage.SIPREFIX_TYPE:
				return validateSIPREFIXType((SIPREFIXType)value, diagnostics, context);
			case OntomlPackage.SIUNITNAME_TYPE:
				return validateSIUNITNAMEType((SIUNITNAMEType)value, diagnostics, context);
			case OntomlPackage.STANDARDSIZE_TYPE:
				return validateSTANDARDSIZEType((STANDARDSIZEType)value, diagnostics, context);
			case OntomlPackage.VALUESPECIFICATION_TYPE:
				return validateVALUESPECIFICATIONType((VALUESPECIFICATIONType)value, diagnostics, context);
			case OntomlPackage.ABSOLUTEURLTYPE_TYPE:
				return validateABSOLUTEURLTYPEType((String)value, diagnostics, context);
			case OntomlPackage.APOSTERIORI_SEMANTIC_RELATION_ID:
				return validateAPosterioriSemanticRelationId((String)value, diagnostics, context);
			case OntomlPackage.CLASS_ID:
				return validateClassId((String)value, diagnostics, context);
			case OntomlPackage.CLASS_REF_TYPE:
				return validateClassRefType((String)value, diagnostics, context);
			case OntomlPackage.CLASS_REF_TYPE1:
				return validateClassRefType1((String)value, diagnostics, context);
			case OntomlPackage.CLASS_REF_TYPE2:
				return validateClassRefType2((String)value, diagnostics, context);
			case OntomlPackage.CLASS_REF_TYPE3:
				return validateClassRefType3((String)value, diagnostics, context);
			case OntomlPackage.CLASS_REF_TYPE4:
				return validateClassRefType4((String)value, diagnostics, context);
			case OntomlPackage.CLASS_REF_TYPE5:
				return validateClassRefType5((String)value, diagnostics, context);
			case OntomlPackage.CONSTRAINT_ID:
				return validateConstraintId((String)value, diagnostics, context);
			case OntomlPackage.COUNTRYCODE_TYPE:
				return validateCOUNTRYCODEType((String)value, diagnostics, context);
			case OntomlPackage.CURRENCYCODE_TYPE:
				return validateCURRENCYCODEType((String)value, diagnostics, context);
			case OntomlPackage.CURRENCY_ID:
				return validateCurrencyId((String)value, diagnostics, context);
			case OntomlPackage.DATA_TYPE_ID:
				return validateDataTypeId((String)value, diagnostics, context);
			case OntomlPackage.DATETYPE_TYPE:
				return validateDATETYPEType((XMLGregorianCalendar)value, diagnostics, context);
			case OntomlPackage.DETCLASSIFICATIONTYPE_TYPE:
				return validateDETCLASSIFICATIONTYPEType((String)value, diagnostics, context);
			case OntomlPackage.DIC_UNIT_ID:
				return validateDicUnitId((String)value, diagnostics, context);
			case OntomlPackage.DIC_VALUE_ID:
				return validateDicValueId((String)value, diagnostics, context);
			case OntomlPackage.DOCUMENT_ID:
				return validateDocumentId((String)value, diagnostics, context);
			case OntomlPackage.DOCUMENTIDENTIFIERNAME_TYPE:
				return validateDOCUMENTIDENTIFIERNAMEType((String)value, diagnostics, context);
			case OntomlPackage.EPTOS_GUID:
				return validateEptosGUID((String)value, diagnostics, context);
			case OntomlPackage.EXTERNALITEMCODETYPE_TYPE:
				return validateEXTERNALITEMCODETYPEType((String)value, diagnostics, context);
			case OntomlPackage.FREE_RELATION_DEFINITION_ID:
				return validateFreeRelationDefinitionId((String)value, diagnostics, context);
			case OntomlPackage.FREE_RELATION_END_ID:
				return validateFreeRelationEndId((String)value, diagnostics, context);
			case OntomlPackage.HTTPDIRECTORYNAMETYPE_TYPE:
				return validateHTTPDIRECTORYNAMETYPEType((String)value, diagnostics, context);
			case OntomlPackage.HTTPFILENAMETYPE_TYPE:
				return validateHTTPFILENAMETYPEType((String)value, diagnostics, context);
			case OntomlPackage.ILLUSTRATIONTYPE_TYPE_OBJECT:
				return validateILLUSTRATIONTYPETypeObject((ILLUSTRATIONTYPEType)value, diagnostics, context);
			case OntomlPackage.KEYWORDREFERENCE_TYPE:
				return validateKEYWORDREFERENCEType((String)value, diagnostics, context);
			case OntomlPackage.KEYWORDTYPE_TYPE:
				return validateKEYWORDTYPEType((String)value, diagnostics, context);
			case OntomlPackage.LANGUAGECODE_TYPE:
				return validateLANGUAGECODEType((String)value, diagnostics, context);
			case OntomlPackage.ONTOLOGY_ID:
				return validateOntologyId((String)value, diagnostics, context);
			case OntomlPackage.POSITIVELENGTHMEASURE_TYPE:
				return validatePOSITIVELENGTHMEASUREType((BigDecimal)value, diagnostics, context);
			case OntomlPackage.POSITIVEPLANEANGLEMEASURE_TYPE:
				return validatePOSITIVEPLANEANGLEMEASUREType((BigDecimal)value, diagnostics, context);
			case OntomlPackage.POSITIVERATIOMEASURE_TYPE:
				return validatePOSITIVERATIOMEASUREType((BigDecimal)value, diagnostics, context);
			case OntomlPackage.PREFERREDNAMETYPE_TYPE:
				return validatePREFERREDNAMETYPEType((String)value, diagnostics, context);
			case OntomlPackage.PROGRAMREFERENCENAME_TYPE:
				return validatePROGRAMREFERENCENAMEType((String)value, diagnostics, context);
			case OntomlPackage.PROPERTY_ID:
				return validatePropertyId((String)value, diagnostics, context);
			case OntomlPackage.REUSABLE_NAME_ID:
				return validateReusableNameId((String)value, diagnostics, context);
			case OntomlPackage.REVISIONTYPE_TYPE:
				return validateREVISIONTYPEType((String)value, diagnostics, context);
			case OntomlPackage.SHORTNAMETYPE_TYPE:
				return validateSHORTNAMETYPEType((String)value, diagnostics, context);
			case OntomlPackage.SIPREFIX_TYPE_OBJECT:
				return validateSIPREFIXTypeObject((SIPREFIXType)value, diagnostics, context);
			case OntomlPackage.SIUNITNAME_TYPE_OBJECT:
				return validateSIUNITNAMETypeObject((SIUNITNAMEType)value, diagnostics, context);
			case OntomlPackage.STANDARDSIZE_TYPE_OBJECT:
				return validateSTANDARDSIZETypeObject((STANDARDSIZEType)value, diagnostics, context);
			case OntomlPackage.STATUS_TYPE:
				return validateSTATUSType((String)value, diagnostics, context);
			case OntomlPackage.SUPPLIERCODETYPE_TYPE:
				return validateSUPPLIERCODETYPEType((String)value, diagnostics, context);
			case OntomlPackage.SUPPLIER_ID:
				return validateSupplierId((String)value, diagnostics, context);
			case OntomlPackage.SYNONYMOUSNAMETYPE_TYPE:
				return validateSYNONYMOUSNAMETYPEType((String)value, diagnostics, context);
			case OntomlPackage.SYNONYMREFERENCE_TYPE:
				return validateSYNONYMREFERENCEType((String)value, diagnostics, context);
			case OntomlPackage.VALUECODETYPE_TYPE:
				return validateVALUECODETYPEType((String)value, diagnostics, context);
			case OntomlPackage.VALUEFORMATTYPE_TYPE:
				return validateVALUEFORMATTYPEType((String)value, diagnostics, context);
			case OntomlPackage.VALUESPECIFICATION_TYPE_OBJECT:
				return validateVALUESPECIFICATIONTypeObject((VALUESPECIFICATIONType)value, diagnostics, context);
			case OntomlPackage.VERSIONTYPE_TYPE:
				return validateVERSIONTYPEType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateALTERNATIVEUNITSType(ALTERNATIVEUNITSType alternativeunitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternativeunitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANYTYPEType(ANYTYPEType anytypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anytypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPOSTERIORICASEOFType(APOSTERIORICASEOFType aposterioricaseofType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aposterioricaseofType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPOSTERIORISEMANTICRELATIONSHIPSType(APOSTERIORISEMANTICRELATIONSHIPSType aposteriorisemanticrelationshipsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aposteriorisemanticrelationshipsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPOSTERIORISEMANTICRELATIONSHIPType(APOSTERIORISEMANTICRELATIONSHIPType aposteriorisemanticrelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aposteriorisemanticrelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPOSTERIORIVIEWOFType(APOSTERIORIVIEWOFType aposterioriviewofType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aposterioriviewofType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateARRAYTYPEType(ARRAYTYPEType arraytypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arraytypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateASSIGNEDVALUEType(ASSIGNEDVALUEType assignedvalueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignedvalueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAUTHORSType(AUTHORSType authorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAXIS1PLACEMENTTYPEType(AXIS1PLACEMENTTYPEType axis1PLACEMENTTYPEType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axis1PLACEMENTTYPEType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAXIS2PLACEMENT2DTYPEType(AXIS2PLACEMENT2DTYPEType axis2PLACEMENT2DTYPEType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axis2PLACEMENT2DTYPEType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAXIS2PLACEMENT3DTYPEType(AXIS2PLACEMENT3DTYPEType axis2PLACEMENT3DTYPEType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axis2PLACEMENT3DTYPEType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBAGTYPEType(BAGTYPEType bagtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bagtypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBOOLEANTYPEType(BOOLEANTYPEType booleantypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleantypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCARDINALITYCONSTRAINTType(CARDINALITYCONSTRAINTType cardinalityconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cardinalityconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCATEGORIZATIONCLASSType(CATEGORIZATIONCLASSType categorizationclassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categorizationclassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSCONSTANTVALUESType(CLASSCONSTANTVALUESType classconstantvaluesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classconstantvaluesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSCONSTRAINTType(CLASSCONSTRAINTType classconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSESREFERENCEType(CLASSESREFERENCEType classesreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classesreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSEXTENSIONType(CLASSEXTENSIONType classextensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classextensionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSIFICATIONType(CLASSIFICATIONType classificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSPRESENTATIONONPAPERType(CLASSPRESENTATIONONPAPERType classpresentationonpaperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classpresentationonpaperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSPRESENTATIONONSCREENType(CLASSPRESENTATIONONSCREENType classpresentationonscreenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classpresentationonscreenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSREFERENCEType(CLASSREFERENCEType classreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSREFERENCETYPEType(CLASSREFERENCETYPEType classreferencetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classreferencetypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSType(CLASSType classType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSVALUEASSIGNMENTType(CLASSVALUEASSIGNMENTType classvalueassignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classvalueassignmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONDITIONDETType(CONDITIONDETType conditiondetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditiondetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONFIGURATIONCONTROLCONSTRAINTType(CONFIGURATIONCONTROLCONSTRAINTType configurationcontrolconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationcontrolconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONSTRAINTORCONSTRAINTIDType(CONSTRAINTORCONSTRAINTIDType constraintorconstraintidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintorconstraintidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONSTRAINTSType(CONSTRAINTSType constraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONSTRAINTType(CONSTRAINTType constraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDCLASSESType(CONTAINEDCLASSESType containedclassesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedclassesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDCLASSEXTENSIONSType(CONTAINEDCLASSEXTENSIONSType containedclassextensionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedclassextensionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDDATATYPESType(CONTAINEDDATATYPESType containeddatatypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containeddatatypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDDOCUMENTSType(CONTAINEDDOCUMENTSType containeddocumentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containeddocumentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDKEYWORDSType(CONTAINEDKEYWORDSType containedkeywordsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedkeywordsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDPROPERTIESType(CONTAINEDPROPERTIESType containedpropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedpropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDSUPPLIERSType(CONTAINEDSUPPLIERSType containedsuppliersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedsuppliersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDSYNONYMSType(CONTAINEDSYNONYMSType containedsynonymsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedsynonymsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTEXTDEPENDENTUNITType(CONTEXTDEPENDENTUNITType contextdependentunitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextdependentunitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTEXTPARAMETERCONSTRAINTSType(CONTEXTPARAMETERCONSTRAINTSType contextparameterconstraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextparameterconstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTEXTPARAMICONType(CONTEXTPARAMICONType contextparamiconType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextparamiconType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTEXTRESTRICTIONCONSTRAINTType(CONTEXTRESTRICTIONCONSTRAINTType contextrestrictionconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextrestrictionconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONVERSIONBASEDUNITType(CONVERSIONBASEDUNITType conversionbasedunitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionbasedunitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCORRESPONDINGPROPERTIESType(CORRESPONDINGPROPERTIESType correspondingpropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correspondingpropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCREATEICONType(CREATEICONType createiconType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createiconType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPEREFERENCEType(DATATYPEREFERENCEType datatypereferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypereferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPESREFERENCEType(DATATYPESREFERENCEType datatypesreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypesreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPEType(DATATYPEType datatypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATEDATATYPEType(DATEDATATYPEType datedatatypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datedatatypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATETIMEDATATYPEType(DATETIMEDATATYPEType datetimedatatypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datetimedatatypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDEPENDENTPDETType(DEPENDENTPDETType dependentpdetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependentpdetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDERIVEDUNITELEMENTType(DERIVEDUNITELEMENTType derivedunitelementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedunitelementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDERIVEDUNITType(DERIVEDUNITType derivedunitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedunitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICTIONARIESREFERENCEType(DICTIONARIESREFERENCEType dictionariesreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionariesreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICTIONARYINSTANDARDFORMATType(DICTIONARYINSTANDARDFORMATType dictionaryinstandardformatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionaryinstandardformatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICTIONARYREFERENCEType(DICTIONARYREFERENCEType dictionaryreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionaryreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICTIONARYType(DICTIONARYType dictionaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICUNITREFERENCEType(DICUNITREFERENCEType dicunitreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dicunitreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICUNITSREFERENCEType(DICUNITSREFERENCEType dicunitsreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dicunitsreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICUNITType(DICUNITType dicunitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dicunitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICVALUEType(DICVALUEType dicvalueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dicvalueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDIMENSIONALEXPONENTSType(DIMENSIONALEXPONENTSType dimensionalexponentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionalexponentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTCONTENTType(DOCUMENTCONTENTType documentcontentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentcontentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERNAMELABELType(DOCUMENTIDENTIFIERNAMELABELType documentidentifiernamelabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentidentifiernamelabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERType(DOCUMENTIDENTIFIERType documentidentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentidentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTREFERENCEType(DOCUMENTREFERENCEType documentreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTSREFERENCEType(DOCUMENTSREFERENCEType documentsreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentsreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTType(DOCUMENTType documentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOMAINCONSTRAINTSType(DOMAINCONSTRAINTSType domainconstraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainconstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOMAINCONSTRAINTType(DOMAINCONSTRAINTType domainconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMERATIONCONSTRAINTType(ENUMERATIONCONSTRAINTType enumerationconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXPLICITFUNCTIONALMODELCLASSEXTENSIONType(EXPLICITFUNCTIONALMODELCLASSEXTENSIONType explicitfunctionalmodelclassextensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explicitfunctionalmodelclassextensionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXPLICITITEMCLASSEXTENSIONType(EXPLICITITEMCLASSEXTENSIONType explicititemclassextensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explicititemclassextensionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTERNALFILESType(EXTERNALFILESType externalfilesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalfilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTERNALGRAPHICSType(EXTERNALGRAPHICSType externalgraphicsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalgraphicsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTERNALRESOURCEType(EXTERNALRESOURCEType externalresourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalresourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFILTERType(FILTERType filterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMCLASSVIEWOFType(FMCLASSVIEWOFType fmclassviewofType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmclassviewofType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFREERELATIONDEFINITIONREFType(FREERELATIONDEFINITIONREFType freerelationdefinitionrefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freerelationdefinitionrefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFREERELATIONENDREFType(FREERELATIONENDREFType freerelationendrefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freerelationendrefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFREERELATIONSType(FREERELATIONSType freerelationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freerelationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFREERELATIONType(FREERELATIONType freerelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freerelationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFUNCTIONALMODELCLASSType(FUNCTIONALMODELCLASSType functionalmodelclassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalmodelclassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGENERALTEXTType(GENERALTEXTType generaltextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generaltextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEOMETRICCONTEXTType(GEOMETRICCONTEXTType geometriccontextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometriccontextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEOMETRICUNITCONTEXTType(GEOMETRICUNITCONTEXTType geometricunitcontextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometricunitcontextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGRAPHICSType(GRAPHICSType graphicsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHEADERType(HEADERType headerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILEType(HTTPFILEType httpfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDENTIFIEDDOCUMENTType(IDENTIFIEDDOCUMENTType identifieddocumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifieddocumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateILLUSTRATIONType(ILLUSTRATIONType illustrationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(illustrationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINFORMATIONType(INFORMATIONType informationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTCURRENCYTYPEType(INTCURRENCYTYPEType intcurrencytypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intcurrencytypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTDICVALUEType(INTDICVALUEType intdicvalueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intdicvalueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTEGRITYCONSTRAINTType(INTEGRITYCONSTRAINTType integrityconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integrityconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTMEASURETYPEType(INTMEASURETYPEType intmeasuretypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intmeasuretypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTTYPEType(INTTYPEType inttypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inttypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITEMCLASSCASEOFType(ITEMCLASSCASEOFType itemclasscaseofType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemclasscaseofType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITEMCLASSType(ITEMCLASSType itemclassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemclassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITSVALUESType(ITSVALUESType itsvaluesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itsvaluesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDLABELType(KEYWORDLABELType keywordlabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keywordlabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDREFERENCESType(KEYWORDREFERENCESType keywordreferencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keywordreferencesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDType(KEYWORDType keywordType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keywordType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGEType(LANGUAGEType languageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEVELType(LEVELType levelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(levelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEVELTYPEType(LEVELTYPEType leveltypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leveltypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLIBRARYIIMIDENTIFICATIONType(LIBRARYIIMIDENTIFICATIONType libraryiimidentificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryiimidentificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLIBRARYINSTANDARDFORMATType(LIBRARYINSTANDARDFORMATType libraryinstandardformatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryinstandardformatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLIBRARYType(LIBRARYType libraryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLISTTYPEType(LISTTYPEType listtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listtypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMAPPINGFUNCTIONType(MAPPINGFUNCTIONType mappingfunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingfunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMATHEMATICALSTRINGType(MATHEMATICALSTRINGType mathematicalstringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mathematicalstringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMESSAGEType(MESSAGEType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNAMEDTYPEType(NAMEDTYPEType namedtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedtypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNAMEDUNITType(NAMEDUNITType namedunitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedunitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONDEPENDENTPDETType(NONDEPENDENTPDETType nondependentpdetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nondependentpdetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONINSTANTIABLEFUNCTIONALVIEWCLASSType(NONINSTANTIABLEFUNCTIONALVIEWCLASSType noninstantiablefunctionalviewclassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noninstantiablefunctionalviewclassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONQUANTITATIVECODETYPEType(NONQUANTITATIVECODETYPEType nonquantitativecodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonquantitativecodetypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONQUANTITATIVEINTTYPEType(NONQUANTITATIVEINTTYPEType nonquantitativeinttypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonquantitativeinttypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONSIUNITType(NONSIUNITType nonsiunitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonsiunitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONTRANSLATABLESTRINGTYPEType(NONTRANSLATABLESTRINGTYPEType nontranslatablestringtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nontranslatablestringtypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUMBERTYPEType(NUMBERTYPEType numbertypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numbertypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateONTOMLType(ONTOMLType ontomlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontomlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateORGANIZATIONType(ORGANIZATIONType organizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePERSONType(PERSONType personType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePLACEMENTTYPEType(PLACEMENTTYPEType placementtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placementtypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOSTCONDITIONType(POSTCONDITIONType postconditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postconditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePRECONDITIONType(PRECONDITIONType preconditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preconditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMELABELType(PREFERREDNAMELABELType preferrednamelabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preferrednamelabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMEType(PREFERREDNAMEType preferrednameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preferrednameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROGRAMREFERENCETYPEType(PROGRAMREFERENCETYPEType programreferencetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programreferencetypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTIESREFERENCEType(PROPERTIESREFERENCEType propertiesreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertiesreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYCLASSIFICATIONType(PROPERTYCLASSIFICATIONType propertyclassificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyclassificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYCONSTRAINTType(PROPERTYCONSTRAINTType propertyconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYMAPPINGType(PROPERTYMAPPINGType propertymappingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertymappingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYREFERENCEType(PROPERTYREFERENCEType propertyreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYType(PROPERTYType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYVALUERECOMMENDEDPRESENTATIONType(PROPERTYVALUERECOMMENDEDPRESENTATIONType propertyvaluerecommendedpresentationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyvaluerecommendedpresentationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRANGECONSTRAINTType(RANGECONSTRAINTType rangeconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRATIONALMEASURETYPEType(RATIONALMEASURETYPEType rationalmeasuretypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rationalmeasuretypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRATIONALTYPEType(RATIONALTYPEType rationaltypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rationaltypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALCURRENCYTYPEType(REALCURRENCYTYPEType realcurrencytypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realcurrencytypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALMEASURETYPEType(REALMEASURETYPEType realmeasuretypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realmeasuretypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALTYPEType(REALTYPEType realtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realtypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRECOMMENDEDPRESENTATIONType(RECOMMENDEDPRESENTATIONType recommendedpresentationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recommendedpresentationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREFERENCEDDOCUMENTType(REFERENCEDDOCUMENTType referenceddocumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceddocumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREFERENCEDGRAPHICSType(REFERENCEDGRAPHICSType referencedgraphicsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencedgraphicsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREMOTELOCATIONSType(REMOTELOCATIONSType remotelocationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remotelocationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteLocationType(RemoteLocationType remoteLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remoteLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREPRESENTATIONPDETType(REPRESENTATIONPDETType representationpdetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representationpdetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREPRESENTATIONREFERENCETYPEType(REPRESENTATIONREFERENCETYPEType representationreferencetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representationreferencetypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREUSABLEKEYWORDType(REUSABLEKEYWORDType reusablekeywordType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reusablekeywordType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREUSABLENAMEType(REUSABLENAMEType reusablenameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reusablenameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREUSABLESYNONYMType(REUSABLESYNONYMType reusablesynonymType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reusablesynonymType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSETTYPEType(SETTYPEType settypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(settypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSETWITHSUBSETCONSTRAINTTYPEType(SETWITHSUBSETCONSTRAINTTYPEType setwithsubsetconstrainttypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setwithsubsetconstrainttypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMELABELType(SHORTNAMELABELType shortnamelabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shortnamelabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMEType(SHORTNAMEType shortnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shortnameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSIUNITType(SIUNITType siunitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(siunitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOURCEDOCUMENTType(SOURCEDOCUMENTType sourcedocumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourcedocumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGDICVALUEType(STRINGDICVALUEType stringdicvalueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringdicvalueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGPATTERNCONSTRAINTType(STRINGPATTERNCONSTRAINTType stringpatternconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringpatternconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGSIZECONSTRAINTType(STRINGSIZECONSTRAINTType stringsizeconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringsizeconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGSType(STRINGSType stringsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGTYPEType(STRINGTYPEType stringtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringtypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUBCLASSCONSTRAINTType(SUBCLASSCONSTRAINTType subclassconstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subclassconstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUBSETType(SUBSETType subsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subsetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIERREFERENCEType(SUPPLIERREFERENCEType supplierreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplierreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIERSREFERENCEType(SUPPLIERSREFERENCEType suppliersreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(suppliersreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIERType(SUPPLIERType supplierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPORTEDVEPType(SUPPORTEDVEPType supportedvepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedvepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMELABELType(SYNONYMOUSNAMELABELType synonymousnamelabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synonymousnamelabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMEType(SYNONYMOUSNAMEType synonymousnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synonymousnameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSSYMBOLSType(SYNONYMOUSSYMBOLSType synonymoussymbolsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synonymoussymbolsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMREFERENCESType(SYNONYMREFERENCESType synonymreferencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synonymreferencesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEXTType(TEXTType textType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIMEDATATYPEType(TIMEDATATYPEType timedatatypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timedatatypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRANSLATABLESTRINGTYPEType(TRANSLATABLESTRINGTYPEType translatablestringtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translatablestringtypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRANSLATIONDATAType(TRANSLATIONDATAType translationdataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translationdataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRANSLATIONType(TRANSLATIONType translationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUNITType(UNITType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURITYPEType(URITYPEType uritypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uritypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVCVRANGEType(VCVRANGEType vcvrangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vcvrangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVIEWCONTROLVARIABLERANGEType(VIEWCONTROLVARIABLERANGEType viewcontrolvariablerangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewcontrolvariablerangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVIEWEXCHANGEPROTOCOLIDENTIFICATIONType(VIEWEXCHANGEPROTOCOLIDENTIFICATIONType viewexchangeprotocolidentificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewexchangeprotocolidentificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateILLUSTRATIONTYPEType(ILLUSTRATIONTYPEType illustrationtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSIPREFIXType(SIPREFIXType siprefixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSIUNITNAMEType(SIUNITNAMEType siunitnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTANDARDSIZEType(STANDARDSIZEType standardsizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVALUESPECIFICATIONType(VALUESPECIFICATIONType valuespecificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateABSOLUTEURLTYPEType(String absoluteurltypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPosterioriSemanticRelationId(String aPosterioriSemanticRelationId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAPosterioriSemanticRelationId_Pattern(aPosterioriSemanticRelationId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAPosterioriSemanticRelationId_Pattern
	 */
	public static final  PatternMatcher [][] APOSTERIORI_SEMANTIC_RELATION_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#CE\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#CE\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#CE\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>APosteriori Semantic Relation Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPosterioriSemanticRelationId_Pattern(String aPosterioriSemanticRelationId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getAPosterioriSemanticRelationId(), aPosterioriSemanticRelationId, APOSTERIORI_SEMANTIC_RELATION_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassId(String classId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassId_Pattern(classId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateClassId_Pattern
	 */
	public static final  PatternMatcher [][] CLASS_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Class Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassId_Pattern(String classId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getClassId(), classId, CLASS_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType(String classRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassRefType_Pattern(classRefType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateClassRefType_Pattern
	 */
	public static final  PatternMatcher [][] CLASS_REF_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0112\\-1\\-\\-\\-13584_32_1#01\\-PLACEMENT#1")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Class Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType_Pattern(String classRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getClassRefType(), classRefType, CLASS_REF_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType1(String classRefType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassRefType1_Pattern(classRefType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateClassRefType1_Pattern
	 */
	public static final  PatternMatcher [][] CLASS_REF_TYPE1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0112\\-1\\-\\-\\-13584_32_1#01\\-AXIS2_PLACEMENT_3D#1")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Class Ref Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType1_Pattern(String classRefType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getClassRefType1(), classRefType1, CLASS_REF_TYPE1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType2(String classRefType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassRefType2_Pattern(classRefType2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateClassRefType2_Pattern
	 */
	public static final  PatternMatcher [][] CLASS_REF_TYPE2__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0112\\-1\\-\\-\\-13584_32_1#01\\-REPRESENTATION_REFERENCE#1")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Class Ref Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType2_Pattern(String classRefType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getClassRefType2(), classRefType2, CLASS_REF_TYPE2__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType3(String classRefType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassRefType3_Pattern(classRefType3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateClassRefType3_Pattern
	 */
	public static final  PatternMatcher [][] CLASS_REF_TYPE3__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0112\\-1\\-\\-\\-13584_32_1#01\\-AXIS2_PLACEMENT_2D#1")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Class Ref Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType3_Pattern(String classRefType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getClassRefType3(), classRefType3, CLASS_REF_TYPE3__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType4(String classRefType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassRefType4_Pattern(classRefType4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateClassRefType4_Pattern
	 */
	public static final  PatternMatcher [][] CLASS_REF_TYPE4__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0112\\-1\\-\\-\\-13584_32_1#01\\-PROGRAM_REFERENCE#1")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Class Ref Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType4_Pattern(String classRefType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getClassRefType4(), classRefType4, CLASS_REF_TYPE4__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType5(String classRefType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassRefType5_Pattern(classRefType5, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateClassRefType5_Pattern
	 */
	public static final  PatternMatcher [][] CLASS_REF_TYPE5__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0112\\-1\\-\\-\\-13584_32_1#01\\-AXIS1_PLACEMENT#1")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Class Ref Type5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRefType5_Pattern(String classRefType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getClassRefType5(), classRefType5, CLASS_REF_TYPE5__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintId(String constraintId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConstraintId_Pattern(constraintId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateConstraintId_Pattern
	 */
	public static final  PatternMatcher [][] CONSTRAINT_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#04\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Constraint Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintId_Pattern(String constraintId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getConstraintId(), constraintId, CONSTRAINT_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCOUNTRYCODEType(String countrycodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCOUNTRYCODEType_Pattern(countrycodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCOUNTRYCODEType_MinLength(countrycodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCOUNTRYCODEType_MaxLength(countrycodeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCOUNTRYCODEType_Pattern
	 */
	public static final  PatternMatcher [][] COUNTRYCODE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\-]*"),
				XMLTypeUtil.createPatternMatcher("[^\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>COUNTRYCODE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCOUNTRYCODEType_Pattern(String countrycodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getCOUNTRYCODEType(), countrycodeType, COUNTRYCODE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>COUNTRYCODE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCOUNTRYCODEType_MinLength(String countrycodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = countrycodeType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OntomlPackage.eINSTANCE.getCOUNTRYCODEType(), countrycodeType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>COUNTRYCODE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCOUNTRYCODEType_MaxLength(String countrycodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = countrycodeType.length();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getCOUNTRYCODEType(), countrycodeType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCURRENCYCODEType(String currencycodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCURRENCYCODEType_MaxLength(currencycodeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>CURRENCYCODE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCURRENCYCODEType_MaxLength(String currencycodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = currencycodeType.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getCURRENCYCODEType(), currencycodeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyId(String currencyId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCurrencyId_Pattern(currencyId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCurrencyId_Pattern
	 */
	public static final  PatternMatcher [][] CURRENCY_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#08\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Currency Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyId_Pattern(String currencyId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getCurrencyId(), currencyId, CURRENCY_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeId(String dataTypeId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDataTypeId_Pattern(dataTypeId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDataTypeId_Pattern
	 */
	public static final  PatternMatcher [][] DATA_TYPE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#09\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#09\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#09\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Data Type Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeId_Pattern(String dataTypeId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getDataTypeId(), dataTypeId, DATA_TYPE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATETYPEType(XMLGregorianCalendar datetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDETCLASSIFICATIONTYPEType(String detclassificationtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDETCLASSIFICATIONTYPEType_MinLength(detclassificationtypeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDETCLASSIFICATIONTYPEType_MaxLength(detclassificationtypeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>DETCLASSIFICATIONTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDETCLASSIFICATIONTYPEType_MinLength(String detclassificationtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = detclassificationtypeType.length();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OntomlPackage.eINSTANCE.getDETCLASSIFICATIONTYPEType(), detclassificationtypeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>DETCLASSIFICATIONTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDETCLASSIFICATIONTYPEType_MaxLength(String detclassificationtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = detclassificationtypeType.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getDETCLASSIFICATIONTYPEType(), detclassificationtypeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDicUnitId(String dicUnitId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDicUnitId_Pattern(dicUnitId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDicUnitId_Pattern
	 */
	public static final  PatternMatcher [][] DIC_UNIT_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#05\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#05\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#05\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dic Unit Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDicUnitId_Pattern(String dicUnitId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getDicUnitId(), dicUnitId, DIC_UNIT_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDicValueId(String dicValueId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDicValueId_Pattern(dicValueId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDicValueId_Pattern
	 */
	public static final  PatternMatcher [][] DIC_VALUE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#07\\-([A-Z0-9:_\\.]{1,35})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#07\\-([A-Z0-9:_\\.]{1,35})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#07\\-([A-Z0-9:_\\.]{1,35})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dic Value Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDicValueId_Pattern(String dicValueId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getDicValueId(), dicValueId, DIC_VALUE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentId(String documentId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDocumentId_Pattern(documentId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDocumentId_Pattern
	 */
	public static final  PatternMatcher [][] DOCUMENT_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#10\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#10\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#10\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Document Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentId_Pattern(String documentId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getDocumentId(), documentId, DOCUMENT_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERNAMEType(String documentidentifiernameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDOCUMENTIDENTIFIERNAMEType_MaxLength(documentidentifiernameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>DOCUMENTIDENTIFIERNAME Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERNAMEType_MaxLength(String documentidentifiernameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = documentidentifiernameType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getDOCUMENTIDENTIFIERNAMEType(), documentidentifiernameType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEptosGUID(String eptosGUID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEptosGUID_MinLength(eptosGUID, diagnostics, context);
		if (result || diagnostics != null) result &= validateEptosGUID_MaxLength(eptosGUID, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Eptos GUID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEptosGUID_MinLength(String eptosGUID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = eptosGUID.length();
		boolean result = length >= 32;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OntomlPackage.eINSTANCE.getEptosGUID(), eptosGUID, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Eptos GUID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEptosGUID_MaxLength(String eptosGUID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = eptosGUID.length();
		boolean result = length <= 32;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getEptosGUID(), eptosGUID, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTERNALITEMCODETYPEType(String externalitemcodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEXTERNALITEMCODETYPEType_Pattern(externalitemcodetypeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEXTERNALITEMCODETYPEType_MaxLength(externalitemcodetypeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEXTERNALITEMCODETYPEType_Pattern
	 */
	public static final  PatternMatcher [][] EXTERNALITEMCODETYPE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\-]*"),
				XMLTypeUtil.createPatternMatcher("[^\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>EXTERNALITEMCODETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTERNALITEMCODETYPEType_Pattern(String externalitemcodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getEXTERNALITEMCODETYPEType(), externalitemcodetypeType, EXTERNALITEMCODETYPE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>EXTERNALITEMCODETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTERNALITEMCODETYPEType_MaxLength(String externalitemcodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = externalitemcodetypeType.length();
		boolean result = length <= 18;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getEXTERNALITEMCODETYPEType(), externalitemcodetypeType, length, 18, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeRelationDefinitionId(String freeRelationDefinitionId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFreeRelationDefinitionId_Pattern(freeRelationDefinitionId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFreeRelationDefinitionId_Pattern
	 */
	public static final  PatternMatcher [][] FREE_RELATION_DEFINITION_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#ZB\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#ZB\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#ZB\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Free Relation Definition Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeRelationDefinitionId_Pattern(String freeRelationDefinitionId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getFreeRelationDefinitionId(), freeRelationDefinitionId, FREE_RELATION_DEFINITION_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeRelationEndId(String freeRelationEndId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFreeRelationEndId_Pattern(freeRelationEndId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFreeRelationEndId_Pattern
	 */
	public static final  PatternMatcher [][] FREE_RELATION_END_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Free Relation End Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeRelationEndId_Pattern(String freeRelationEndId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getFreeRelationEndId(), freeRelationEndId, FREE_RELATION_END_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPDIRECTORYNAMETYPEType(String httpdirectorynametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHTTPDIRECTORYNAMETYPEType_Pattern(httpdirectorynametypeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPDIRECTORYNAMETYPEType_MaxLength(httpdirectorynametypeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHTTPDIRECTORYNAMETYPEType_Pattern
	 */
	public static final  PatternMatcher [][] HTTPDIRECTORYNAMETYPE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>HTTPDIRECTORYNAMETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPDIRECTORYNAMETYPEType_Pattern(String httpdirectorynametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getHTTPDIRECTORYNAMETYPEType(), httpdirectorynametypeType, HTTPDIRECTORYNAMETYPE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>HTTPDIRECTORYNAMETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPDIRECTORYNAMETYPEType_MaxLength(String httpdirectorynametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = httpdirectorynametypeType.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getHTTPDIRECTORYNAMETYPEType(), httpdirectorynametypeType, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILENAMETYPEType(String httpfilenametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHTTPFILENAMETYPEType_Pattern(httpfilenametypeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPFILENAMETYPEType_MaxLength(httpfilenametypeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHTTPFILENAMETYPEType_Pattern
	 */
	public static final  PatternMatcher [][] HTTPFILENAMETYPE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>HTTPFILENAMETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILENAMETYPEType_Pattern(String httpfilenametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getHTTPFILENAMETYPEType(), httpfilenametypeType, HTTPFILENAMETYPE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>HTTPFILENAMETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILENAMETYPEType_MaxLength(String httpfilenametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = httpfilenametypeType.length();
		boolean result = length <= 128;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getHTTPFILENAMETYPEType(), httpfilenametypeType, length, 128, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateILLUSTRATIONTYPETypeObject(ILLUSTRATIONTYPEType illustrationtypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDREFERENCEType(String keywordreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateReusableNameId_Pattern(keywordreferenceType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDTYPEType(String keywordtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateKEYWORDTYPEType_MaxLength(keywordtypeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>KEYWORDTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDTYPEType_MaxLength(String keywordtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = keywordtypeType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getKEYWORDTYPEType(), keywordtypeType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGECODEType(String languagecodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLANGUAGECODEType_Pattern(languagecodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLANGUAGECODEType_MinLength(languagecodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLANGUAGECODEType_MaxLength(languagecodeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLANGUAGECODEType_Pattern
	 */
	public static final  PatternMatcher [][] LANGUAGECODE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\-]*"),
				XMLTypeUtil.createPatternMatcher("[^\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>LANGUAGECODE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGECODEType_Pattern(String languagecodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getLANGUAGECODEType(), languagecodeType, LANGUAGECODE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>LANGUAGECODE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGECODEType_MinLength(String languagecodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = languagecodeType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OntomlPackage.eINSTANCE.getLANGUAGECODEType(), languagecodeType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>LANGUAGECODE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGECODEType_MaxLength(String languagecodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = languagecodeType.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getLANGUAGECODEType(), languagecodeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntologyId(String ontologyId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOntologyId_Pattern(ontologyId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOntologyId_Pattern
	 */
	public static final  PatternMatcher [][] ONTOLOGY_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#11\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#11\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#11\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ontology Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntologyId_Pattern(String ontologyId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getOntologyId(), ontologyId, ONTOLOGY_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOSITIVELENGTHMEASUREType(BigDecimal positivelengthmeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePOSITIVELENGTHMEASUREType_Min(positivelengthmeasureType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePOSITIVELENGTHMEASUREType_Min
	 */
	public static final BigDecimal POSITIVELENGTHMEASURE_TYPE__MIN__VALUE = new BigDecimal("0.0");

	/**
	 * Validates the Min constraint of '<em>POSITIVELENGTHMEASURE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOSITIVELENGTHMEASUREType_Min(BigDecimal positivelengthmeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positivelengthmeasureType.compareTo(POSITIVELENGTHMEASURE_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(OntomlPackage.eINSTANCE.getPOSITIVELENGTHMEASUREType(), positivelengthmeasureType, POSITIVELENGTHMEASURE_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOSITIVEPLANEANGLEMEASUREType(BigDecimal positiveplaneanglemeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOSITIVERATIOMEASUREType(BigDecimal positiveratiomeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMETYPEType(String preferrednametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePREFERREDNAMETYPEType_MaxLength(preferrednametypeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>PREFERREDNAMETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMETYPEType_MaxLength(String preferrednametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = preferrednametypeType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getPREFERREDNAMETYPEType(), preferrednametypeType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROGRAMREFERENCENAMEType(String programreferencenameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePROGRAMREFERENCENAMEType_Pattern(programreferencenameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePROGRAMREFERENCENAMEType_Pattern
	 */
	public static final  PatternMatcher [][] PROGRAMREFERENCENAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\-]*"),
				XMLTypeUtil.createPatternMatcher("[^\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>PROGRAMREFERENCENAME Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROGRAMREFERENCENAMEType_Pattern(String programreferencenameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getPROGRAMREFERENCENAMEType(), programreferencenameType, PROGRAMREFERENCENAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyId(String propertyId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePropertyId_Pattern(propertyId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePropertyId_Pattern
	 */
	public static final  PatternMatcher [][] PROPERTY_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Property Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyId_Pattern(String propertyId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getPropertyId(), propertyId, PROPERTY_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReusableNameId(String reusableNameId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateReusableNameId_Pattern(reusableNameId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateReusableNameId_Pattern
	 */
	public static final  PatternMatcher [][] REUSABLE_NAME_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#TM\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#Z6\\-([A-Z0-9:_\\.]{1,71})#[0-9]{1,9}"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#TM\\-([A-Z0-9_:\\.]{1,71})#[0-9]{1,9}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}(-[0-9A-Z:_\\.]{1,35})?--[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?"),
				XMLTypeUtil.createPatternMatcher("[0-9]{4}-[0-9A-Z:_\\.]{1,35}---[0-9A-Z:_\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\.]{1,131}#[0-9]{1,10})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Reusable Name Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReusableNameId_Pattern(String reusableNameId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getReusableNameId(), reusableNameId, REUSABLE_NAME_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREVISIONTYPEType(String revisiontypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateREVISIONTYPEType_MaxLength(revisiontypeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>REVISIONTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREVISIONTYPEType_MaxLength(String revisiontypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = revisiontypeType.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getREVISIONTYPEType(), revisiontypeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMETYPEType(String shortnametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSHORTNAMETYPEType_MaxLength(shortnametypeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SHORTNAMETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMETYPEType_MaxLength(String shortnametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = shortnametypeType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getSHORTNAMETYPEType(), shortnametypeType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSIPREFIXTypeObject(SIPREFIXType siprefixTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSIUNITNAMETypeObject(SIUNITNAMEType siunitnameTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTANDARDSIZETypeObject(STANDARDSIZEType standardsizeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTATUSType(String statusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSTATUSType_Pattern(statusType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSTATUSType_Pattern
	 */
	public static final  PatternMatcher [][] STATUS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\-]*"),
				XMLTypeUtil.createPatternMatcher("[^\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>STATUS Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTATUSType_Pattern(String statusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getSTATUSType(), statusType, STATUS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIERCODETYPEType(String suppliercodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSUPPLIERCODETYPEType_Pattern(suppliercodetypeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSUPPLIERCODETYPEType_MaxLength(suppliercodetypeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSUPPLIERCODETYPEType_Pattern
	 */
	public static final  PatternMatcher [][] SUPPLIERCODETYPE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\-]*"),
				XMLTypeUtil.createPatternMatcher("[^\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SUPPLIERCODETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIERCODETYPEType_Pattern(String suppliercodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getSUPPLIERCODETYPEType(), suppliercodetypeType, SUPPLIERCODETYPE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>SUPPLIERCODETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIERCODETYPEType_MaxLength(String suppliercodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = suppliercodetypeType.length();
		boolean result = length <= 70;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getSUPPLIERCODETYPEType(), suppliercodetypeType, length, 70, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplierId(String supplierId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSupplierId_Pattern(supplierId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSupplierId_Pattern
	 */
	public static final  PatternMatcher [][] SUPPLIER_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})(\\-([A-Z0-9:_\\.]{1,35})((\\-[019])(\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-([A-Z0-9:_\\.]{1,35})\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})"),
				XMLTypeUtil.createPatternMatcher("([0-9]{4})\\-([A-Z0-9:_\\.]{1,35})\\-\\-\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Supplier Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplierId_Pattern(String supplierId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getSupplierId(), supplierId, SUPPLIER_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMETYPEType(String synonymousnametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSYNONYMOUSNAMETYPEType_MaxLength(synonymousnametypeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SYNONYMOUSNAMETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMETYPEType_MaxLength(String synonymousnametypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = synonymousnametypeType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getSYNONYMOUSNAMETYPEType(), synonymousnametypeType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMREFERENCEType(String synonymreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateReusableNameId_Pattern(synonymreferenceType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVALUECODETYPEType(String valuecodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVALUECODETYPEType_Pattern(valuecodetypeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateVALUECODETYPEType_MaxLength(valuecodetypeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVALUECODETYPEType_Pattern
	 */
	public static final  PatternMatcher [][] VALUECODETYPE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\-]*"),
				XMLTypeUtil.createPatternMatcher("[^\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>VALUECODETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVALUECODETYPEType_Pattern(String valuecodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getVALUECODETYPEType(), valuecodetypeType, VALUECODETYPE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>VALUECODETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVALUECODETYPEType_MaxLength(String valuecodetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = valuecodetypeType.length();
		boolean result = length <= 35;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getVALUECODETYPEType(), valuecodetypeType, length, 35, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVALUEFORMATTYPEType(String valueformattypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVALUEFORMATTYPEType_MaxLength(valueformattypeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>VALUEFORMATTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVALUEFORMATTYPEType_MaxLength(String valueformattypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = valueformattypeType.length();
		boolean result = length <= 80;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getVALUEFORMATTYPEType(), valueformattypeType, length, 80, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVALUESPECIFICATIONTypeObject(VALUESPECIFICATIONType valuespecificationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVERSIONTYPEType(String versiontypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVERSIONTYPEType_Pattern(versiontypeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateVERSIONTYPEType_MaxLength(versiontypeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVERSIONTYPEType_Pattern
	 */
	public static final  PatternMatcher [][] VERSIONTYPE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>VERSIONTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVERSIONTYPEType_Pattern(String versiontypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OntomlPackage.eINSTANCE.getVERSIONTYPEType(), versiontypeType, VERSIONTYPE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>VERSIONTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVERSIONTYPEType_MaxLength(String versiontypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = versiontypeType.length();
		boolean result = length <= 9;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OntomlPackage.eINSTANCE.getVERSIONTYPEType(), versiontypeType, length, 9, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OntomlValidator
