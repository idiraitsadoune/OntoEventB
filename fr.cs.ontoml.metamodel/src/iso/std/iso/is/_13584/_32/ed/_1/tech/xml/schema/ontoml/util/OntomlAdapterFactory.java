/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.util;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage
 * @generated
 */
public class OntomlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OntomlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntomlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OntomlPackage.eINSTANCE;
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
	protected OntomlSwitch<Adapter> modelSwitch =
		new OntomlSwitch<Adapter>() {
			@Override
			public Adapter caseALTERNATIVEUNITSType(ALTERNATIVEUNITSType object) {
				return createALTERNATIVEUNITSTypeAdapter();
			}
			@Override
			public Adapter caseANYTYPEType(ANYTYPEType object) {
				return createANYTYPETypeAdapter();
			}
			@Override
			public Adapter caseAPOSTERIORICASEOFType(APOSTERIORICASEOFType object) {
				return createAPOSTERIORICASEOFTypeAdapter();
			}
			@Override
			public Adapter caseAPOSTERIORISEMANTICRELATIONSHIPSType(APOSTERIORISEMANTICRELATIONSHIPSType object) {
				return createAPOSTERIORISEMANTICRELATIONSHIPSTypeAdapter();
			}
			@Override
			public Adapter caseAPOSTERIORISEMANTICRELATIONSHIPType(APOSTERIORISEMANTICRELATIONSHIPType object) {
				return createAPOSTERIORISEMANTICRELATIONSHIPTypeAdapter();
			}
			@Override
			public Adapter caseAPOSTERIORIVIEWOFType(APOSTERIORIVIEWOFType object) {
				return createAPOSTERIORIVIEWOFTypeAdapter();
			}
			@Override
			public Adapter caseARRAYTYPEType(ARRAYTYPEType object) {
				return createARRAYTYPETypeAdapter();
			}
			@Override
			public Adapter caseASSIGNEDVALUEType(ASSIGNEDVALUEType object) {
				return createASSIGNEDVALUETypeAdapter();
			}
			@Override
			public Adapter caseAUTHORSType(AUTHORSType object) {
				return createAUTHORSTypeAdapter();
			}
			@Override
			public Adapter caseAXIS1PLACEMENTTYPEType(AXIS1PLACEMENTTYPEType object) {
				return createAXIS1PLACEMENTTYPETypeAdapter();
			}
			@Override
			public Adapter caseAXIS2PLACEMENT2DTYPEType(AXIS2PLACEMENT2DTYPEType object) {
				return createAXIS2PLACEMENT2DTYPETypeAdapter();
			}
			@Override
			public Adapter caseAXIS2PLACEMENT3DTYPEType(AXIS2PLACEMENT3DTYPEType object) {
				return createAXIS2PLACEMENT3DTYPETypeAdapter();
			}
			@Override
			public Adapter caseBAGTYPEType(BAGTYPEType object) {
				return createBAGTYPETypeAdapter();
			}
			@Override
			public Adapter caseBOOLEANTYPEType(BOOLEANTYPEType object) {
				return createBOOLEANTYPETypeAdapter();
			}
			@Override
			public Adapter caseCARDINALITYCONSTRAINTType(CARDINALITYCONSTRAINTType object) {
				return createCARDINALITYCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseCATEGORIZATIONCLASSType(CATEGORIZATIONCLASSType object) {
				return createCATEGORIZATIONCLASSTypeAdapter();
			}
			@Override
			public Adapter caseCLASSCONSTANTVALUESType(CLASSCONSTANTVALUESType object) {
				return createCLASSCONSTANTVALUESTypeAdapter();
			}
			@Override
			public Adapter caseCLASSCONSTRAINTType(CLASSCONSTRAINTType object) {
				return createCLASSCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseCLASSESREFERENCEType(CLASSESREFERENCEType object) {
				return createCLASSESREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseCLASSEXTENSIONType(CLASSEXTENSIONType object) {
				return createCLASSEXTENSIONTypeAdapter();
			}
			@Override
			public Adapter caseCLASSIFICATIONType(CLASSIFICATIONType object) {
				return createCLASSIFICATIONTypeAdapter();
			}
			@Override
			public Adapter caseCLASSPRESENTATIONONPAPERType(CLASSPRESENTATIONONPAPERType object) {
				return createCLASSPRESENTATIONONPAPERTypeAdapter();
			}
			@Override
			public Adapter caseCLASSPRESENTATIONONSCREENType(CLASSPRESENTATIONONSCREENType object) {
				return createCLASSPRESENTATIONONSCREENTypeAdapter();
			}
			@Override
			public Adapter caseCLASSREFERENCEType(CLASSREFERENCEType object) {
				return createCLASSREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseCLASSREFERENCETYPEType(CLASSREFERENCETYPEType object) {
				return createCLASSREFERENCETYPETypeAdapter();
			}
			@Override
			public Adapter caseCLASSType(CLASSType object) {
				return createCLASSTypeAdapter();
			}
			@Override
			public Adapter caseCLASSVALUEASSIGNMENTType(CLASSVALUEASSIGNMENTType object) {
				return createCLASSVALUEASSIGNMENTTypeAdapter();
			}
			@Override
			public Adapter caseCONDITIONDETType(CONDITIONDETType object) {
				return createCONDITIONDETTypeAdapter();
			}
			@Override
			public Adapter caseCONFIGURATIONCONTROLCONSTRAINTType(CONFIGURATIONCONTROLCONSTRAINTType object) {
				return createCONFIGURATIONCONTROLCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseCONSTRAINTORCONSTRAINTIDType(CONSTRAINTORCONSTRAINTIDType object) {
				return createCONSTRAINTORCONSTRAINTIDTypeAdapter();
			}
			@Override
			public Adapter caseCONSTRAINTSType(CONSTRAINTSType object) {
				return createCONSTRAINTSTypeAdapter();
			}
			@Override
			public Adapter caseCONSTRAINTType(CONSTRAINTType object) {
				return createCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseCONTAINEDCLASSESType(CONTAINEDCLASSESType object) {
				return createCONTAINEDCLASSESTypeAdapter();
			}
			@Override
			public Adapter caseCONTAINEDCLASSEXTENSIONSType(CONTAINEDCLASSEXTENSIONSType object) {
				return createCONTAINEDCLASSEXTENSIONSTypeAdapter();
			}
			@Override
			public Adapter caseCONTAINEDDATATYPESType(CONTAINEDDATATYPESType object) {
				return createCONTAINEDDATATYPESTypeAdapter();
			}
			@Override
			public Adapter caseCONTAINEDDOCUMENTSType(CONTAINEDDOCUMENTSType object) {
				return createCONTAINEDDOCUMENTSTypeAdapter();
			}
			@Override
			public Adapter caseCONTAINEDKEYWORDSType(CONTAINEDKEYWORDSType object) {
				return createCONTAINEDKEYWORDSTypeAdapter();
			}
			@Override
			public Adapter caseCONTAINEDPROPERTIESType(CONTAINEDPROPERTIESType object) {
				return createCONTAINEDPROPERTIESTypeAdapter();
			}
			@Override
			public Adapter caseCONTAINEDSUPPLIERSType(CONTAINEDSUPPLIERSType object) {
				return createCONTAINEDSUPPLIERSTypeAdapter();
			}
			@Override
			public Adapter caseCONTAINEDSYNONYMSType(CONTAINEDSYNONYMSType object) {
				return createCONTAINEDSYNONYMSTypeAdapter();
			}
			@Override
			public Adapter caseCONTEXTDEPENDENTUNITType(CONTEXTDEPENDENTUNITType object) {
				return createCONTEXTDEPENDENTUNITTypeAdapter();
			}
			@Override
			public Adapter caseCONTEXTPARAMETERCONSTRAINTSType(CONTEXTPARAMETERCONSTRAINTSType object) {
				return createCONTEXTPARAMETERCONSTRAINTSTypeAdapter();
			}
			@Override
			public Adapter caseCONTEXTPARAMICONType(CONTEXTPARAMICONType object) {
				return createCONTEXTPARAMICONTypeAdapter();
			}
			@Override
			public Adapter caseCONTEXTRESTRICTIONCONSTRAINTType(CONTEXTRESTRICTIONCONSTRAINTType object) {
				return createCONTEXTRESTRICTIONCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseCONVERSIONBASEDUNITType(CONVERSIONBASEDUNITType object) {
				return createCONVERSIONBASEDUNITTypeAdapter();
			}
			@Override
			public Adapter caseCORRESPONDINGPROPERTIESType(CORRESPONDINGPROPERTIESType object) {
				return createCORRESPONDINGPROPERTIESTypeAdapter();
			}
			@Override
			public Adapter caseCREATEICONType(CREATEICONType object) {
				return createCREATEICONTypeAdapter();
			}
			@Override
			public Adapter caseDATATYPEREFERENCEType(DATATYPEREFERENCEType object) {
				return createDATATYPEREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseDATATYPESREFERENCEType(DATATYPESREFERENCEType object) {
				return createDATATYPESREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseDATATYPEType(DATATYPEType object) {
				return createDATATYPETypeAdapter();
			}
			@Override
			public Adapter caseDATEDATATYPEType(DATEDATATYPEType object) {
				return createDATEDATATYPETypeAdapter();
			}
			@Override
			public Adapter caseDATETIMEDATATYPEType(DATETIMEDATATYPEType object) {
				return createDATETIMEDATATYPETypeAdapter();
			}
			@Override
			public Adapter caseDEPENDENTPDETType(DEPENDENTPDETType object) {
				return createDEPENDENTPDETTypeAdapter();
			}
			@Override
			public Adapter caseDERIVEDUNITELEMENTType(DERIVEDUNITELEMENTType object) {
				return createDERIVEDUNITELEMENTTypeAdapter();
			}
			@Override
			public Adapter caseDERIVEDUNITType(DERIVEDUNITType object) {
				return createDERIVEDUNITTypeAdapter();
			}
			@Override
			public Adapter caseDICTIONARIESREFERENCEType(DICTIONARIESREFERENCEType object) {
				return createDICTIONARIESREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseDICTIONARYINSTANDARDFORMATType(DICTIONARYINSTANDARDFORMATType object) {
				return createDICTIONARYINSTANDARDFORMATTypeAdapter();
			}
			@Override
			public Adapter caseDICTIONARYREFERENCEType(DICTIONARYREFERENCEType object) {
				return createDICTIONARYREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseDICTIONARYType(DICTIONARYType object) {
				return createDICTIONARYTypeAdapter();
			}
			@Override
			public Adapter caseDICUNITREFERENCEType(DICUNITREFERENCEType object) {
				return createDICUNITREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseDICUNITSREFERENCEType(DICUNITSREFERENCEType object) {
				return createDICUNITSREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseDICUNITType(DICUNITType object) {
				return createDICUNITTypeAdapter();
			}
			@Override
			public Adapter caseDICVALUEType(DICVALUEType object) {
				return createDICVALUETypeAdapter();
			}
			@Override
			public Adapter caseDIMENSIONALEXPONENTSType(DIMENSIONALEXPONENTSType object) {
				return createDIMENSIONALEXPONENTSTypeAdapter();
			}
			@Override
			public Adapter caseDOCUMENTCONTENTType(DOCUMENTCONTENTType object) {
				return createDOCUMENTCONTENTTypeAdapter();
			}
			@Override
			public Adapter caseDOCUMENTIDENTIFIERNAMELABELType(DOCUMENTIDENTIFIERNAMELABELType object) {
				return createDOCUMENTIDENTIFIERNAMELABELTypeAdapter();
			}
			@Override
			public Adapter caseDOCUMENTIDENTIFIERType(DOCUMENTIDENTIFIERType object) {
				return createDOCUMENTIDENTIFIERTypeAdapter();
			}
			@Override
			public Adapter caseDOCUMENTREFERENCEType(DOCUMENTREFERENCEType object) {
				return createDOCUMENTREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDOCUMENTSREFERENCEType(DOCUMENTSREFERENCEType object) {
				return createDOCUMENTSREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseDOCUMENTType(DOCUMENTType object) {
				return createDOCUMENTTypeAdapter();
			}
			@Override
			public Adapter caseDOMAINCONSTRAINTSType(DOMAINCONSTRAINTSType object) {
				return createDOMAINCONSTRAINTSTypeAdapter();
			}
			@Override
			public Adapter caseDOMAINCONSTRAINTType(DOMAINCONSTRAINTType object) {
				return createDOMAINCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseENUMERATIONCONSTRAINTType(ENUMERATIONCONSTRAINTType object) {
				return createENUMERATIONCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseEXPLICITFUNCTIONALMODELCLASSEXTENSIONType(EXPLICITFUNCTIONALMODELCLASSEXTENSIONType object) {
				return createEXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeAdapter();
			}
			@Override
			public Adapter caseEXPLICITITEMCLASSEXTENSIONType(EXPLICITITEMCLASSEXTENSIONType object) {
				return createEXPLICITITEMCLASSEXTENSIONTypeAdapter();
			}
			@Override
			public Adapter caseEXTERNALFILESType(EXTERNALFILESType object) {
				return createEXTERNALFILESTypeAdapter();
			}
			@Override
			public Adapter caseEXTERNALGRAPHICSType(EXTERNALGRAPHICSType object) {
				return createEXTERNALGRAPHICSTypeAdapter();
			}
			@Override
			public Adapter caseEXTERNALRESOURCEType(EXTERNALRESOURCEType object) {
				return createEXTERNALRESOURCETypeAdapter();
			}
			@Override
			public Adapter caseFILTERType(FILTERType object) {
				return createFILTERTypeAdapter();
			}
			@Override
			public Adapter caseFMCLASSVIEWOFType(FMCLASSVIEWOFType object) {
				return createFMCLASSVIEWOFTypeAdapter();
			}
			@Override
			public Adapter caseFREERELATIONDEFINITIONREFType(FREERELATIONDEFINITIONREFType object) {
				return createFREERELATIONDEFINITIONREFTypeAdapter();
			}
			@Override
			public Adapter caseFREERELATIONENDREFType(FREERELATIONENDREFType object) {
				return createFREERELATIONENDREFTypeAdapter();
			}
			@Override
			public Adapter caseFREERELATIONSType(FREERELATIONSType object) {
				return createFREERELATIONSTypeAdapter();
			}
			@Override
			public Adapter caseFREERELATIONType(FREERELATIONType object) {
				return createFREERELATIONTypeAdapter();
			}
			@Override
			public Adapter caseFUNCTIONALMODELCLASSType(FUNCTIONALMODELCLASSType object) {
				return createFUNCTIONALMODELCLASSTypeAdapter();
			}
			@Override
			public Adapter caseGENERALTEXTType(GENERALTEXTType object) {
				return createGENERALTEXTTypeAdapter();
			}
			@Override
			public Adapter caseGEOMETRICCONTEXTType(GEOMETRICCONTEXTType object) {
				return createGEOMETRICCONTEXTTypeAdapter();
			}
			@Override
			public Adapter caseGEOMETRICUNITCONTEXTType(GEOMETRICUNITCONTEXTType object) {
				return createGEOMETRICUNITCONTEXTTypeAdapter();
			}
			@Override
			public Adapter caseGRAPHICSType(GRAPHICSType object) {
				return createGRAPHICSTypeAdapter();
			}
			@Override
			public Adapter caseHEADERType(HEADERType object) {
				return createHEADERTypeAdapter();
			}
			@Override
			public Adapter caseHTTPFILEType(HTTPFILEType object) {
				return createHTTPFILETypeAdapter();
			}
			@Override
			public Adapter caseIDENTIFIEDDOCUMENTType(IDENTIFIEDDOCUMENTType object) {
				return createIDENTIFIEDDOCUMENTTypeAdapter();
			}
			@Override
			public Adapter caseILLUSTRATIONType(ILLUSTRATIONType object) {
				return createILLUSTRATIONTypeAdapter();
			}
			@Override
			public Adapter caseINFORMATIONType(INFORMATIONType object) {
				return createINFORMATIONTypeAdapter();
			}
			@Override
			public Adapter caseINTCURRENCYTYPEType(INTCURRENCYTYPEType object) {
				return createINTCURRENCYTYPETypeAdapter();
			}
			@Override
			public Adapter caseINTDICVALUEType(INTDICVALUEType object) {
				return createINTDICVALUETypeAdapter();
			}
			@Override
			public Adapter caseINTEGRITYCONSTRAINTType(INTEGRITYCONSTRAINTType object) {
				return createINTEGRITYCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseINTMEASURETYPEType(INTMEASURETYPEType object) {
				return createINTMEASURETYPETypeAdapter();
			}
			@Override
			public Adapter caseINTTYPEType(INTTYPEType object) {
				return createINTTYPETypeAdapter();
			}
			@Override
			public Adapter caseITEMCLASSCASEOFType(ITEMCLASSCASEOFType object) {
				return createITEMCLASSCASEOFTypeAdapter();
			}
			@Override
			public Adapter caseITEMCLASSType(ITEMCLASSType object) {
				return createITEMCLASSTypeAdapter();
			}
			@Override
			public Adapter caseITSVALUESType(ITSVALUESType object) {
				return createITSVALUESTypeAdapter();
			}
			@Override
			public Adapter caseKEYWORDLABELType(KEYWORDLABELType object) {
				return createKEYWORDLABELTypeAdapter();
			}
			@Override
			public Adapter caseKEYWORDREFERENCESType(KEYWORDREFERENCESType object) {
				return createKEYWORDREFERENCESTypeAdapter();
			}
			@Override
			public Adapter caseKEYWORDType(KEYWORDType object) {
				return createKEYWORDTypeAdapter();
			}
			@Override
			public Adapter caseLANGUAGEType(LANGUAGEType object) {
				return createLANGUAGETypeAdapter();
			}
			@Override
			public Adapter caseLEVELType(LEVELType object) {
				return createLEVELTypeAdapter();
			}
			@Override
			public Adapter caseLEVELTYPEType(LEVELTYPEType object) {
				return createLEVELTYPETypeAdapter();
			}
			@Override
			public Adapter caseLIBRARYIIMIDENTIFICATIONType(LIBRARYIIMIDENTIFICATIONType object) {
				return createLIBRARYIIMIDENTIFICATIONTypeAdapter();
			}
			@Override
			public Adapter caseLIBRARYINSTANDARDFORMATType(LIBRARYINSTANDARDFORMATType object) {
				return createLIBRARYINSTANDARDFORMATTypeAdapter();
			}
			@Override
			public Adapter caseLIBRARYType(LIBRARYType object) {
				return createLIBRARYTypeAdapter();
			}
			@Override
			public Adapter caseLISTTYPEType(LISTTYPEType object) {
				return createLISTTYPETypeAdapter();
			}
			@Override
			public Adapter caseMAPPINGFUNCTIONType(MAPPINGFUNCTIONType object) {
				return createMAPPINGFUNCTIONTypeAdapter();
			}
			@Override
			public Adapter caseMATHEMATICALSTRINGType(MATHEMATICALSTRINGType object) {
				return createMATHEMATICALSTRINGTypeAdapter();
			}
			@Override
			public Adapter caseMESSAGEType(MESSAGEType object) {
				return createMESSAGETypeAdapter();
			}
			@Override
			public Adapter caseNAMEDTYPEType(NAMEDTYPEType object) {
				return createNAMEDTYPETypeAdapter();
			}
			@Override
			public Adapter caseNAMEDUNITType(NAMEDUNITType object) {
				return createNAMEDUNITTypeAdapter();
			}
			@Override
			public Adapter caseNONDEPENDENTPDETType(NONDEPENDENTPDETType object) {
				return createNONDEPENDENTPDETTypeAdapter();
			}
			@Override
			public Adapter caseNONINSTANTIABLEFUNCTIONALVIEWCLASSType(NONINSTANTIABLEFUNCTIONALVIEWCLASSType object) {
				return createNONINSTANTIABLEFUNCTIONALVIEWCLASSTypeAdapter();
			}
			@Override
			public Adapter caseNONQUANTITATIVECODETYPEType(NONQUANTITATIVECODETYPEType object) {
				return createNONQUANTITATIVECODETYPETypeAdapter();
			}
			@Override
			public Adapter caseNONQUANTITATIVEINTTYPEType(NONQUANTITATIVEINTTYPEType object) {
				return createNONQUANTITATIVEINTTYPETypeAdapter();
			}
			@Override
			public Adapter caseNONSIUNITType(NONSIUNITType object) {
				return createNONSIUNITTypeAdapter();
			}
			@Override
			public Adapter caseNONTRANSLATABLESTRINGTYPEType(NONTRANSLATABLESTRINGTYPEType object) {
				return createNONTRANSLATABLESTRINGTYPETypeAdapter();
			}
			@Override
			public Adapter caseNUMBERTYPEType(NUMBERTYPEType object) {
				return createNUMBERTYPETypeAdapter();
			}
			@Override
			public Adapter caseONTOMLType(ONTOMLType object) {
				return createONTOMLTypeAdapter();
			}
			@Override
			public Adapter caseORGANIZATIONType(ORGANIZATIONType object) {
				return createORGANIZATIONTypeAdapter();
			}
			@Override
			public Adapter casePERSONType(PERSONType object) {
				return createPERSONTypeAdapter();
			}
			@Override
			public Adapter casePLACEMENTTYPEType(PLACEMENTTYPEType object) {
				return createPLACEMENTTYPETypeAdapter();
			}
			@Override
			public Adapter casePOSTCONDITIONType(POSTCONDITIONType object) {
				return createPOSTCONDITIONTypeAdapter();
			}
			@Override
			public Adapter casePRECONDITIONType(PRECONDITIONType object) {
				return createPRECONDITIONTypeAdapter();
			}
			@Override
			public Adapter casePREFERREDNAMELABELType(PREFERREDNAMELABELType object) {
				return createPREFERREDNAMELABELTypeAdapter();
			}
			@Override
			public Adapter casePREFERREDNAMEType(PREFERREDNAMEType object) {
				return createPREFERREDNAMETypeAdapter();
			}
			@Override
			public Adapter casePROGRAMREFERENCETYPEType(PROGRAMREFERENCETYPEType object) {
				return createPROGRAMREFERENCETYPETypeAdapter();
			}
			@Override
			public Adapter casePROPERTIESREFERENCEType(PROPERTIESREFERENCEType object) {
				return createPROPERTIESREFERENCETypeAdapter();
			}
			@Override
			public Adapter casePROPERTYCLASSIFICATIONType(PROPERTYCLASSIFICATIONType object) {
				return createPROPERTYCLASSIFICATIONTypeAdapter();
			}
			@Override
			public Adapter casePROPERTYCONSTRAINTType(PROPERTYCONSTRAINTType object) {
				return createPROPERTYCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter casePROPERTYMAPPINGType(PROPERTYMAPPINGType object) {
				return createPROPERTYMAPPINGTypeAdapter();
			}
			@Override
			public Adapter casePROPERTYREFERENCEType(PROPERTYREFERENCEType object) {
				return createPROPERTYREFERENCETypeAdapter();
			}
			@Override
			public Adapter casePROPERTYType(PROPERTYType object) {
				return createPROPERTYTypeAdapter();
			}
			@Override
			public Adapter casePROPERTYVALUERECOMMENDEDPRESENTATIONType(PROPERTYVALUERECOMMENDEDPRESENTATIONType object) {
				return createPROPERTYVALUERECOMMENDEDPRESENTATIONTypeAdapter();
			}
			@Override
			public Adapter caseRANGECONSTRAINTType(RANGECONSTRAINTType object) {
				return createRANGECONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseRATIONALMEASURETYPEType(RATIONALMEASURETYPEType object) {
				return createRATIONALMEASURETYPETypeAdapter();
			}
			@Override
			public Adapter caseRATIONALTYPEType(RATIONALTYPEType object) {
				return createRATIONALTYPETypeAdapter();
			}
			@Override
			public Adapter caseREALCURRENCYTYPEType(REALCURRENCYTYPEType object) {
				return createREALCURRENCYTYPETypeAdapter();
			}
			@Override
			public Adapter caseREALMEASURETYPEType(REALMEASURETYPEType object) {
				return createREALMEASURETYPETypeAdapter();
			}
			@Override
			public Adapter caseREALTYPEType(REALTYPEType object) {
				return createREALTYPETypeAdapter();
			}
			@Override
			public Adapter caseRECOMMENDEDPRESENTATIONType(RECOMMENDEDPRESENTATIONType object) {
				return createRECOMMENDEDPRESENTATIONTypeAdapter();
			}
			@Override
			public Adapter caseREFERENCEDDOCUMENTType(REFERENCEDDOCUMENTType object) {
				return createREFERENCEDDOCUMENTTypeAdapter();
			}
			@Override
			public Adapter caseREFERENCEDGRAPHICSType(REFERENCEDGRAPHICSType object) {
				return createREFERENCEDGRAPHICSTypeAdapter();
			}
			@Override
			public Adapter caseREMOTELOCATIONSType(REMOTELOCATIONSType object) {
				return createREMOTELOCATIONSTypeAdapter();
			}
			@Override
			public Adapter caseRemoteLocationType(RemoteLocationType object) {
				return createRemoteLocationTypeAdapter();
			}
			@Override
			public Adapter caseREPRESENTATIONPDETType(REPRESENTATIONPDETType object) {
				return createREPRESENTATIONPDETTypeAdapter();
			}
			@Override
			public Adapter caseREPRESENTATIONREFERENCETYPEType(REPRESENTATIONREFERENCETYPEType object) {
				return createREPRESENTATIONREFERENCETYPETypeAdapter();
			}
			@Override
			public Adapter caseREUSABLEKEYWORDType(REUSABLEKEYWORDType object) {
				return createREUSABLEKEYWORDTypeAdapter();
			}
			@Override
			public Adapter caseREUSABLENAMEType(REUSABLENAMEType object) {
				return createREUSABLENAMETypeAdapter();
			}
			@Override
			public Adapter caseREUSABLESYNONYMType(REUSABLESYNONYMType object) {
				return createREUSABLESYNONYMTypeAdapter();
			}
			@Override
			public Adapter caseSETTYPEType(SETTYPEType object) {
				return createSETTYPETypeAdapter();
			}
			@Override
			public Adapter caseSETWITHSUBSETCONSTRAINTTYPEType(SETWITHSUBSETCONSTRAINTTYPEType object) {
				return createSETWITHSUBSETCONSTRAINTTYPETypeAdapter();
			}
			@Override
			public Adapter caseSHORTNAMELABELType(SHORTNAMELABELType object) {
				return createSHORTNAMELABELTypeAdapter();
			}
			@Override
			public Adapter caseSHORTNAMEType(SHORTNAMEType object) {
				return createSHORTNAMETypeAdapter();
			}
			@Override
			public Adapter caseSIUNITType(SIUNITType object) {
				return createSIUNITTypeAdapter();
			}
			@Override
			public Adapter caseSOURCEDOCUMENTType(SOURCEDOCUMENTType object) {
				return createSOURCEDOCUMENTTypeAdapter();
			}
			@Override
			public Adapter caseSTRINGDICVALUEType(STRINGDICVALUEType object) {
				return createSTRINGDICVALUETypeAdapter();
			}
			@Override
			public Adapter caseSTRINGPATTERNCONSTRAINTType(STRINGPATTERNCONSTRAINTType object) {
				return createSTRINGPATTERNCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseSTRINGSIZECONSTRAINTType(STRINGSIZECONSTRAINTType object) {
				return createSTRINGSIZECONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseSTRINGSType(STRINGSType object) {
				return createSTRINGSTypeAdapter();
			}
			@Override
			public Adapter caseSTRINGTYPEType(STRINGTYPEType object) {
				return createSTRINGTYPETypeAdapter();
			}
			@Override
			public Adapter caseSUBCLASSCONSTRAINTType(SUBCLASSCONSTRAINTType object) {
				return createSUBCLASSCONSTRAINTTypeAdapter();
			}
			@Override
			public Adapter caseSUBSETType(SUBSETType object) {
				return createSUBSETTypeAdapter();
			}
			@Override
			public Adapter caseSUPPLIERREFERENCEType(SUPPLIERREFERENCEType object) {
				return createSUPPLIERREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseSUPPLIERSREFERENCEType(SUPPLIERSREFERENCEType object) {
				return createSUPPLIERSREFERENCETypeAdapter();
			}
			@Override
			public Adapter caseSUPPLIERType(SUPPLIERType object) {
				return createSUPPLIERTypeAdapter();
			}
			@Override
			public Adapter caseSUPPORTEDVEPType(SUPPORTEDVEPType object) {
				return createSUPPORTEDVEPTypeAdapter();
			}
			@Override
			public Adapter caseSYNONYMOUSNAMELABELType(SYNONYMOUSNAMELABELType object) {
				return createSYNONYMOUSNAMELABELTypeAdapter();
			}
			@Override
			public Adapter caseSYNONYMOUSNAMEType(SYNONYMOUSNAMEType object) {
				return createSYNONYMOUSNAMETypeAdapter();
			}
			@Override
			public Adapter caseSYNONYMOUSSYMBOLSType(SYNONYMOUSSYMBOLSType object) {
				return createSYNONYMOUSSYMBOLSTypeAdapter();
			}
			@Override
			public Adapter caseSYNONYMREFERENCESType(SYNONYMREFERENCESType object) {
				return createSYNONYMREFERENCESTypeAdapter();
			}
			@Override
			public Adapter caseTEXTType(TEXTType object) {
				return createTEXTTypeAdapter();
			}
			@Override
			public Adapter caseTIMEDATATYPEType(TIMEDATATYPEType object) {
				return createTIMEDATATYPETypeAdapter();
			}
			@Override
			public Adapter caseTRANSLATABLESTRINGTYPEType(TRANSLATABLESTRINGTYPEType object) {
				return createTRANSLATABLESTRINGTYPETypeAdapter();
			}
			@Override
			public Adapter caseTRANSLATIONDATAType(TRANSLATIONDATAType object) {
				return createTRANSLATIONDATATypeAdapter();
			}
			@Override
			public Adapter caseTRANSLATIONType(TRANSLATIONType object) {
				return createTRANSLATIONTypeAdapter();
			}
			@Override
			public Adapter caseUNITType(UNITType object) {
				return createUNITTypeAdapter();
			}
			@Override
			public Adapter caseURITYPEType(URITYPEType object) {
				return createURITYPETypeAdapter();
			}
			@Override
			public Adapter caseVCVRANGEType(VCVRANGEType object) {
				return createVCVRANGETypeAdapter();
			}
			@Override
			public Adapter caseVIEWCONTROLVARIABLERANGEType(VIEWCONTROLVARIABLERANGEType object) {
				return createVIEWCONTROLVARIABLERANGETypeAdapter();
			}
			@Override
			public Adapter caseVIEWEXCHANGEPROTOCOLIDENTIFICATIONType(VIEWEXCHANGEPROTOCOLIDENTIFICATIONType object) {
				return createVIEWEXCHANGEPROTOCOLIDENTIFICATIONTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ALTERNATIVEUNITSType <em>ALTERNATIVEUNITS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ALTERNATIVEUNITSType
	 * @generated
	 */
	public Adapter createALTERNATIVEUNITSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType <em>ANYTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ANYTYPEType
	 * @generated
	 */
	public Adapter createANYTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType <em>APOSTERIORICASEOF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType
	 * @generated
	 */
	public Adapter createAPOSTERIORICASEOFTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPSType <em>APOSTERIORISEMANTICRELATIONSHIPS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPSType
	 * @generated
	 */
	public Adapter createAPOSTERIORISEMANTICRELATIONSHIPSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPType <em>APOSTERIORISEMANTICRELATIONSHIP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPType
	 * @generated
	 */
	public Adapter createAPOSTERIORISEMANTICRELATIONSHIPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType <em>APOSTERIORIVIEWOF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType
	 * @generated
	 */
	public Adapter createAPOSTERIORIVIEWOFTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType <em>ARRAYTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ARRAYTYPEType
	 * @generated
	 */
	public Adapter createARRAYTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType <em>ASSIGNEDVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ASSIGNEDVALUEType
	 * @generated
	 */
	public Adapter createASSIGNEDVALUETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AUTHORSType <em>AUTHORS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AUTHORSType
	 * @generated
	 */
	public Adapter createAUTHORSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS1PLACEMENTTYPEType <em>AXIS1PLACEMENTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS1PLACEMENTTYPEType
	 * @generated
	 */
	public Adapter createAXIS1PLACEMENTTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT2DTYPEType <em>AXIS2PLACEMENT2DTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT2DTYPEType
	 * @generated
	 */
	public Adapter createAXIS2PLACEMENT2DTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT3DTYPEType <em>AXIS2PLACEMENT3DTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.AXIS2PLACEMENT3DTYPEType
	 * @generated
	 */
	public Adapter createAXIS2PLACEMENT3DTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType <em>BAGTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BAGTYPEType
	 * @generated
	 */
	public Adapter createBAGTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BOOLEANTYPEType <em>BOOLEANTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.BOOLEANTYPEType
	 * @generated
	 */
	public Adapter createBOOLEANTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CARDINALITYCONSTRAINTType <em>CARDINALITYCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CARDINALITYCONSTRAINTType
	 * @generated
	 */
	public Adapter createCARDINALITYCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CATEGORIZATIONCLASSType <em>CATEGORIZATIONCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CATEGORIZATIONCLASSType
	 * @generated
	 */
	public Adapter createCATEGORIZATIONCLASSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTANTVALUESType <em>CLASSCONSTANTVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTANTVALUESType
	 * @generated
	 */
	public Adapter createCLASSCONSTANTVALUESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTRAINTType <em>CLASSCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSCONSTRAINTType
	 * @generated
	 */
	public Adapter createCLASSCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType <em>CLASSESREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType
	 * @generated
	 */
	public Adapter createCLASSESREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType <em>CLASSEXTENSION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType
	 * @generated
	 */
	public Adapter createCLASSEXTENSIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSIFICATIONType <em>CLASSIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSIFICATIONType
	 * @generated
	 */
	public Adapter createCLASSIFICATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONPAPERType <em>CLASSPRESENTATIONONPAPER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONPAPERType
	 * @generated
	 */
	public Adapter createCLASSPRESENTATIONONPAPERTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONSCREENType <em>CLASSPRESENTATIONONSCREEN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONSCREENType
	 * @generated
	 */
	public Adapter createCLASSPRESENTATIONONSCREENTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType <em>CLASSREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType
	 * @generated
	 */
	public Adapter createCLASSREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCETYPEType <em>CLASSREFERENCETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCETYPEType
	 * @generated
	 */
	public Adapter createCLASSREFERENCETYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType <em>CLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType
	 * @generated
	 */
	public Adapter createCLASSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType <em>CLASSVALUEASSIGNMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSVALUEASSIGNMENTType
	 * @generated
	 */
	public Adapter createCLASSVALUEASSIGNMENTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONDITIONDETType <em>CONDITIONDET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONDITIONDETType
	 * @generated
	 */
	public Adapter createCONDITIONDETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType <em>CONFIGURATIONCONTROLCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType
	 * @generated
	 */
	public Adapter createCONFIGURATIONCONTROLCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType <em>CONSTRAINTORCONSTRAINTID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTORCONSTRAINTIDType
	 * @generated
	 */
	public Adapter createCONSTRAINTORCONSTRAINTIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType <em>CONSTRAINTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType
	 * @generated
	 */
	public Adapter createCONSTRAINTSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType <em>CONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType
	 * @generated
	 */
	public Adapter createCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSESType <em>CONTAINEDCLASSES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSESType
	 * @generated
	 */
	public Adapter createCONTAINEDCLASSESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType <em>CONTAINEDCLASSEXTENSIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType
	 * @generated
	 */
	public Adapter createCONTAINEDCLASSEXTENSIONSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDATATYPESType <em>CONTAINEDDATATYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDATATYPESType
	 * @generated
	 */
	public Adapter createCONTAINEDDATATYPESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDOCUMENTSType <em>CONTAINEDDOCUMENTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDOCUMENTSType
	 * @generated
	 */
	public Adapter createCONTAINEDDOCUMENTSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDKEYWORDSType <em>CONTAINEDKEYWORDS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDKEYWORDSType
	 * @generated
	 */
	public Adapter createCONTAINEDKEYWORDSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDPROPERTIESType <em>CONTAINEDPROPERTIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDPROPERTIESType
	 * @generated
	 */
	public Adapter createCONTAINEDPROPERTIESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSUPPLIERSType <em>CONTAINEDSUPPLIERS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSUPPLIERSType
	 * @generated
	 */
	public Adapter createCONTAINEDSUPPLIERSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSYNONYMSType <em>CONTAINEDSYNONYMS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSYNONYMSType
	 * @generated
	 */
	public Adapter createCONTAINEDSYNONYMSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTDEPENDENTUNITType <em>CONTEXTDEPENDENTUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTDEPENDENTUNITType
	 * @generated
	 */
	public Adapter createCONTEXTDEPENDENTUNITTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMETERCONSTRAINTSType <em>CONTEXTPARAMETERCONSTRAINTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMETERCONSTRAINTSType
	 * @generated
	 */
	public Adapter createCONTEXTPARAMETERCONSTRAINTSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMICONType <em>CONTEXTPARAMICON Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMICONType
	 * @generated
	 */
	public Adapter createCONTEXTPARAMICONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTRESTRICTIONCONSTRAINTType <em>CONTEXTRESTRICTIONCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTRESTRICTIONCONSTRAINTType
	 * @generated
	 */
	public Adapter createCONTEXTRESTRICTIONCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType <em>CONVERSIONBASEDUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType
	 * @generated
	 */
	public Adapter createCONVERSIONBASEDUNITTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CORRESPONDINGPROPERTIESType <em>CORRESPONDINGPROPERTIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CORRESPONDINGPROPERTIESType
	 * @generated
	 */
	public Adapter createCORRESPONDINGPROPERTIESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CREATEICONType <em>CREATEICON Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CREATEICONType
	 * @generated
	 */
	public Adapter createCREATEICONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType <em>DATATYPEREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEREFERENCEType
	 * @generated
	 */
	public Adapter createDATATYPEREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType <em>DATATYPESREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType
	 * @generated
	 */
	public Adapter createDATATYPESREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType <em>DATATYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType
	 * @generated
	 */
	public Adapter createDATATYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATEDATATYPEType <em>DATEDATATYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATEDATATYPEType
	 * @generated
	 */
	public Adapter createDATEDATATYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETIMEDATATYPEType <em>DATETIMEDATATYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATETIMEDATATYPEType
	 * @generated
	 */
	public Adapter createDATETIMEDATATYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DEPENDENTPDETType <em>DEPENDENTPDET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DEPENDENTPDETType
	 * @generated
	 */
	public Adapter createDEPENDENTPDETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType <em>DERIVEDUNITELEMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType
	 * @generated
	 */
	public Adapter createDERIVEDUNITELEMENTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITType <em>DERIVEDUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITType
	 * @generated
	 */
	public Adapter createDERIVEDUNITTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARIESREFERENCEType <em>DICTIONARIESREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARIESREFERENCEType
	 * @generated
	 */
	public Adapter createDICTIONARIESREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYINSTANDARDFORMATType <em>DICTIONARYINSTANDARDFORMAT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYINSTANDARDFORMATType
	 * @generated
	 */
	public Adapter createDICTIONARYINSTANDARDFORMATTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType <em>DICTIONARYREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType
	 * @generated
	 */
	public Adapter createDICTIONARYREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType <em>DICTIONARY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType
	 * @generated
	 */
	public Adapter createDICTIONARYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType <em>DICUNITREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType
	 * @generated
	 */
	public Adapter createDICUNITREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITSREFERENCEType <em>DICUNITSREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITSREFERENCEType
	 * @generated
	 */
	public Adapter createDICUNITSREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType <em>DICUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType
	 * @generated
	 */
	public Adapter createDICUNITTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType <em>DICVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType
	 * @generated
	 */
	public Adapter createDICVALUETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType <em>DIMENSIONALEXPONENTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DIMENSIONALEXPONENTSType
	 * @generated
	 */
	public Adapter createDIMENSIONALEXPONENTSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTCONTENTType <em>DOCUMENTCONTENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTCONTENTType
	 * @generated
	 */
	public Adapter createDOCUMENTCONTENTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType <em>DOCUMENTIDENTIFIERNAMELABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERNAMELABELType
	 * @generated
	 */
	public Adapter createDOCUMENTIDENTIFIERNAMELABELTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERType <em>DOCUMENTIDENTIFIER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERType
	 * @generated
	 */
	public Adapter createDOCUMENTIDENTIFIERTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType <em>DOCUMENTREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType
	 * @generated
	 */
	public Adapter createDOCUMENTREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType <em>DOCUMENTSREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType
	 * @generated
	 */
	public Adapter createDOCUMENTSREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType <em>DOCUMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType
	 * @generated
	 */
	public Adapter createDOCUMENTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTSType <em>DOMAINCONSTRAINTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTSType
	 * @generated
	 */
	public Adapter createDOMAINCONSTRAINTSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTType <em>DOMAINCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOMAINCONSTRAINTType
	 * @generated
	 */
	public Adapter createDOMAINCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType <em>ENUMERATIONCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType
	 * @generated
	 */
	public Adapter createENUMERATIONCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType <em>EXPLICITFUNCTIONALMODELCLASSEXTENSION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType
	 * @generated
	 */
	public Adapter createEXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType <em>EXPLICITITEMCLASSEXTENSION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType
	 * @generated
	 */
	public Adapter createEXPLICITITEMCLASSEXTENSIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALFILESType <em>EXTERNALFILES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALFILESType
	 * @generated
	 */
	public Adapter createEXTERNALFILESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALGRAPHICSType <em>EXTERNALGRAPHICS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALGRAPHICSType
	 * @generated
	 */
	public Adapter createEXTERNALGRAPHICSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALRESOURCEType <em>EXTERNALRESOURCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXTERNALRESOURCEType
	 * @generated
	 */
	public Adapter createEXTERNALRESOURCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType <em>FILTER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType
	 * @generated
	 */
	public Adapter createFILTERTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType <em>FMCLASSVIEWOF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType
	 * @generated
	 */
	public Adapter createFMCLASSVIEWOFTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONDEFINITIONREFType <em>FREERELATIONDEFINITIONREF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONDEFINITIONREFType
	 * @generated
	 */
	public Adapter createFREERELATIONDEFINITIONREFTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONENDREFType <em>FREERELATIONENDREF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONENDREFType
	 * @generated
	 */
	public Adapter createFREERELATIONENDREFTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONSType <em>FREERELATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONSType
	 * @generated
	 */
	public Adapter createFREERELATIONSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONType <em>FREERELATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FREERELATIONType
	 * @generated
	 */
	public Adapter createFREERELATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType <em>FUNCTIONALMODELCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType
	 * @generated
	 */
	public Adapter createFUNCTIONALMODELCLASSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType <em>GENERALTEXT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GENERALTEXTType
	 * @generated
	 */
	public Adapter createGENERALTEXTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType <em>GEOMETRICCONTEXT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType
	 * @generated
	 */
	public Adapter createGEOMETRICCONTEXTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType <em>GEOMETRICUNITCONTEXT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType
	 * @generated
	 */
	public Adapter createGEOMETRICUNITCONTEXTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType <em>GRAPHICS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType
	 * @generated
	 */
	public Adapter createGRAPHICSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType <em>HEADER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType
	 * @generated
	 */
	public Adapter createHEADERTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType <em>HTTPFILE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HTTPFILEType
	 * @generated
	 */
	public Adapter createHTTPFILETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.IDENTIFIEDDOCUMENTType <em>IDENTIFIEDDOCUMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.IDENTIFIEDDOCUMENTType
	 * @generated
	 */
	public Adapter createIDENTIFIEDDOCUMENTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType <em>ILLUSTRATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType
	 * @generated
	 */
	public Adapter createILLUSTRATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType <em>INFORMATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType
	 * @generated
	 */
	public Adapter createINFORMATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType <em>INTCURRENCYTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTCURRENCYTYPEType
	 * @generated
	 */
	public Adapter createINTCURRENCYTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTDICVALUEType <em>INTDICVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTDICVALUEType
	 * @generated
	 */
	public Adapter createINTDICVALUETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType <em>INTEGRITYCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTEGRITYCONSTRAINTType
	 * @generated
	 */
	public Adapter createINTEGRITYCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType <em>INTMEASURETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTMEASURETYPEType
	 * @generated
	 */
	public Adapter createINTMEASURETYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTTYPEType <em>INTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INTTYPEType
	 * @generated
	 */
	public Adapter createINTTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType <em>ITEMCLASSCASEOF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType
	 * @generated
	 */
	public Adapter createITEMCLASSCASEOFTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType <em>ITEMCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType
	 * @generated
	 */
	public Adapter createITEMCLASSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITSVALUESType <em>ITSVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITSVALUESType
	 * @generated
	 */
	public Adapter createITSVALUESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType <em>KEYWORDLABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDLABELType
	 * @generated
	 */
	public Adapter createKEYWORDLABELTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDREFERENCESType <em>KEYWORDREFERENCES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDREFERENCESType
	 * @generated
	 */
	public Adapter createKEYWORDREFERENCESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDType <em>KEYWORD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.KEYWORDType
	 * @generated
	 */
	public Adapter createKEYWORDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType <em>LANGUAGE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType
	 * @generated
	 */
	public Adapter createLANGUAGETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType <em>LEVEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType
	 * @generated
	 */
	public Adapter createLEVELTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType <em>LEVELTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELTYPEType
	 * @generated
	 */
	public Adapter createLEVELTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType <em>LIBRARYIIMIDENTIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYIIMIDENTIFICATIONType
	 * @generated
	 */
	public Adapter createLIBRARYIIMIDENTIFICATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYINSTANDARDFORMATType <em>LIBRARYINSTANDARDFORMAT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYINSTANDARDFORMATType
	 * @generated
	 */
	public Adapter createLIBRARYINSTANDARDFORMATTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType <em>LIBRARY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType
	 * @generated
	 */
	public Adapter createLIBRARYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType <em>LISTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LISTTYPEType
	 * @generated
	 */
	public Adapter createLISTTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MAPPINGFUNCTIONType <em>MAPPINGFUNCTION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MAPPINGFUNCTIONType
	 * @generated
	 */
	public Adapter createMAPPINGFUNCTIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType <em>MATHEMATICALSTRING Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType
	 * @generated
	 */
	public Adapter createMATHEMATICALSTRINGTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MESSAGEType <em>MESSAGE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MESSAGEType
	 * @generated
	 */
	public Adapter createMESSAGETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDTYPEType <em>NAMEDTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDTYPEType
	 * @generated
	 */
	public Adapter createNAMEDTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDUNITType <em>NAMEDUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NAMEDUNITType
	 * @generated
	 */
	public Adapter createNAMEDUNITTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONDEPENDENTPDETType <em>NONDEPENDENTPDET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONDEPENDENTPDETType
	 * @generated
	 */
	public Adapter createNONDEPENDENTPDETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONINSTANTIABLEFUNCTIONALVIEWCLASSType <em>NONINSTANTIABLEFUNCTIONALVIEWCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONINSTANTIABLEFUNCTIONALVIEWCLASSType
	 * @generated
	 */
	public Adapter createNONINSTANTIABLEFUNCTIONALVIEWCLASSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType <em>NONQUANTITATIVECODETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVECODETYPEType
	 * @generated
	 */
	public Adapter createNONQUANTITATIVECODETYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType <em>NONQUANTITATIVEINTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType
	 * @generated
	 */
	public Adapter createNONQUANTITATIVEINTTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONSIUNITType <em>NONSIUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONSIUNITType
	 * @generated
	 */
	public Adapter createNONSIUNITTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONTRANSLATABLESTRINGTYPEType <em>NONTRANSLATABLESTRINGTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONTRANSLATABLESTRINGTYPEType
	 * @generated
	 */
	public Adapter createNONTRANSLATABLESTRINGTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NUMBERTYPEType <em>NUMBERTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NUMBERTYPEType
	 * @generated
	 */
	public Adapter createNUMBERTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType <em>ONTOML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType
	 * @generated
	 */
	public Adapter createONTOMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType <em>ORGANIZATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ORGANIZATIONType
	 * @generated
	 */
	public Adapter createORGANIZATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType <em>PERSON Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType
	 * @generated
	 */
	public Adapter createPERSONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PLACEMENTTYPEType <em>PLACEMENTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PLACEMENTTYPEType
	 * @generated
	 */
	public Adapter createPLACEMENTTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.POSTCONDITIONType <em>POSTCONDITION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.POSTCONDITIONType
	 * @generated
	 */
	public Adapter createPOSTCONDITIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PRECONDITIONType <em>PRECONDITION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PRECONDITIONType
	 * @generated
	 */
	public Adapter createPRECONDITIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType <em>PREFERREDNAMELABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMELABELType
	 * @generated
	 */
	public Adapter createPREFERREDNAMELABELTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType <em>PREFERREDNAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType
	 * @generated
	 */
	public Adapter createPREFERREDNAMETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType <em>PROGRAMREFERENCETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType
	 * @generated
	 */
	public Adapter createPROGRAMREFERENCETYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType <em>PROPERTIESREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType
	 * @generated
	 */
	public Adapter createPROPERTIESREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType <em>PROPERTYCLASSIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCLASSIFICATIONType
	 * @generated
	 */
	public Adapter createPROPERTYCLASSIFICATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCONSTRAINTType <em>PROPERTYCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYCONSTRAINTType
	 * @generated
	 */
	public Adapter createPROPERTYCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType <em>PROPERTYMAPPING Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYMAPPINGType
	 * @generated
	 */
	public Adapter createPROPERTYMAPPINGTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType <em>PROPERTYREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType
	 * @generated
	 */
	public Adapter createPROPERTYREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType <em>PROPERTY Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType
	 * @generated
	 */
	public Adapter createPROPERTYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType <em>PROPERTYVALUERECOMMENDEDPRESENTATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYVALUERECOMMENDEDPRESENTATIONType
	 * @generated
	 */
	public Adapter createPROPERTYVALUERECOMMENDEDPRESENTATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RANGECONSTRAINTType <em>RANGECONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RANGECONSTRAINTType
	 * @generated
	 */
	public Adapter createRANGECONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType <em>RATIONALMEASURETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALMEASURETYPEType
	 * @generated
	 */
	public Adapter createRATIONALMEASURETYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALTYPEType <em>RATIONALTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RATIONALTYPEType
	 * @generated
	 */
	public Adapter createRATIONALTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType <em>REALCURRENCYTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALCURRENCYTYPEType
	 * @generated
	 */
	public Adapter createREALCURRENCYTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType <em>REALMEASURETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType
	 * @generated
	 */
	public Adapter createREALMEASURETYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALTYPEType <em>REALTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALTYPEType
	 * @generated
	 */
	public Adapter createREALTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RECOMMENDEDPRESENTATIONType <em>RECOMMENDEDPRESENTATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RECOMMENDEDPRESENTATIONType
	 * @generated
	 */
	public Adapter createRECOMMENDEDPRESENTATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDDOCUMENTType <em>REFERENCEDDOCUMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDDOCUMENTType
	 * @generated
	 */
	public Adapter createREFERENCEDDOCUMENTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDGRAPHICSType <em>REFERENCEDGRAPHICS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDGRAPHICSType
	 * @generated
	 */
	public Adapter createREFERENCEDGRAPHICSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REMOTELOCATIONSType <em>REMOTELOCATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REMOTELOCATIONSType
	 * @generated
	 */
	public Adapter createREMOTELOCATIONSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType <em>Remote Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RemoteLocationType
	 * @generated
	 */
	public Adapter createRemoteLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONPDETType <em>REPRESENTATIONPDET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONPDETType
	 * @generated
	 */
	public Adapter createREPRESENTATIONPDETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONREFERENCETYPEType <em>REPRESENTATIONREFERENCETYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REPRESENTATIONREFERENCETYPEType
	 * @generated
	 */
	public Adapter createREPRESENTATIONREFERENCETYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLEKEYWORDType <em>REUSABLEKEYWORD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLEKEYWORDType
	 * @generated
	 */
	public Adapter createREUSABLEKEYWORDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType <em>REUSABLENAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLENAMEType
	 * @generated
	 */
	public Adapter createREUSABLENAMETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLESYNONYMType <em>REUSABLESYNONYM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLESYNONYMType
	 * @generated
	 */
	public Adapter createREUSABLESYNONYMTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType <em>SETTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETTYPEType
	 * @generated
	 */
	public Adapter createSETTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType <em>SETWITHSUBSETCONSTRAINTTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SETWITHSUBSETCONSTRAINTTYPEType
	 * @generated
	 */
	public Adapter createSETWITHSUBSETCONSTRAINTTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType <em>SHORTNAMELABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMELABELType
	 * @generated
	 */
	public Adapter createSHORTNAMELABELTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType <em>SHORTNAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType
	 * @generated
	 */
	public Adapter createSHORTNAMETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType <em>SIUNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SIUNITType
	 * @generated
	 */
	public Adapter createSIUNITTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SOURCEDOCUMENTType <em>SOURCEDOCUMENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SOURCEDOCUMENTType
	 * @generated
	 */
	public Adapter createSOURCEDOCUMENTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGDICVALUEType <em>STRINGDICVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGDICVALUEType
	 * @generated
	 */
	public Adapter createSTRINGDICVALUETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGPATTERNCONSTRAINTType <em>STRINGPATTERNCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGPATTERNCONSTRAINTType
	 * @generated
	 */
	public Adapter createSTRINGPATTERNCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSIZECONSTRAINTType <em>STRINGSIZECONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSIZECONSTRAINTType
	 * @generated
	 */
	public Adapter createSTRINGSIZECONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSType <em>STRINGS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSType
	 * @generated
	 */
	public Adapter createSTRINGSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGTYPEType <em>STRINGTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGTYPEType
	 * @generated
	 */
	public Adapter createSTRINGTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBCLASSCONSTRAINTType <em>SUBCLASSCONSTRAINT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBCLASSCONSTRAINTType
	 * @generated
	 */
	public Adapter createSUBCLASSCONSTRAINTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType <em>SUBSET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUBSETType
	 * @generated
	 */
	public Adapter createSUBSETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType <em>SUPPLIERREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType
	 * @generated
	 */
	public Adapter createSUPPLIERREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERSREFERENCEType <em>SUPPLIERSREFERENCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERSREFERENCEType
	 * @generated
	 */
	public Adapter createSUPPLIERSREFERENCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType <em>SUPPLIER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType
	 * @generated
	 */
	public Adapter createSUPPLIERTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPORTEDVEPType <em>SUPPORTEDVEP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPORTEDVEPType
	 * @generated
	 */
	public Adapter createSUPPORTEDVEPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType <em>SYNONYMOUSNAMELABEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMELABELType
	 * @generated
	 */
	public Adapter createSYNONYMOUSNAMELABELTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType <em>SYNONYMOUSNAME Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType
	 * @generated
	 */
	public Adapter createSYNONYMOUSNAMETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSSYMBOLSType <em>SYNONYMOUSSYMBOLS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSSYMBOLSType
	 * @generated
	 */
	public Adapter createSYNONYMOUSSYMBOLSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMREFERENCESType <em>SYNONYMREFERENCES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMREFERENCESType
	 * @generated
	 */
	public Adapter createSYNONYMREFERENCESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType <em>TEXT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType
	 * @generated
	 */
	public Adapter createTEXTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TIMEDATATYPEType <em>TIMEDATATYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TIMEDATATYPEType
	 * @generated
	 */
	public Adapter createTIMEDATATYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATABLESTRINGTYPEType <em>TRANSLATABLESTRINGTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATABLESTRINGTYPEType
	 * @generated
	 */
	public Adapter createTRANSLATABLESTRINGTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType <em>TRANSLATIONDATA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType
	 * @generated
	 */
	public Adapter createTRANSLATIONDATATypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType <em>TRANSLATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONType
	 * @generated
	 */
	public Adapter createTRANSLATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.UNITType <em>UNIT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.UNITType
	 * @generated
	 */
	public Adapter createUNITTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.URITYPEType <em>URITYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.URITYPEType
	 * @generated
	 */
	public Adapter createURITYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VCVRANGEType <em>VCVRANGE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VCVRANGEType
	 * @generated
	 */
	public Adapter createVCVRANGETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType <em>VIEWCONTROLVARIABLERANGE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWCONTROLVARIABLERANGEType
	 * @generated
	 */
	public Adapter createVIEWCONTROLVARIABLERANGETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType <em>VIEWEXCHANGEPROTOCOLIDENTIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType
	 * @generated
	 */
	public Adapter createVIEWEXCHANGEPROTOCOLIDENTIFICATIONTypeAdapter() {
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

} //OntomlAdapterFactory
