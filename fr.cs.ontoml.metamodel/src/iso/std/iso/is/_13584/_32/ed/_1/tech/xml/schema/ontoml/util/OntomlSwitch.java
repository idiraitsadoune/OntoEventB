/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.util;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.*;

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
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage
 * @generated
 */
public class OntomlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OntomlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntomlSwitch() {
		if (modelPackage == null) {
			modelPackage = OntomlPackage.eINSTANCE;
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
			case OntomlPackage.ALTERNATIVEUNITS_TYPE: {
				ALTERNATIVEUNITSType alternativeunitsType = (ALTERNATIVEUNITSType)theEObject;
				T result = caseALTERNATIVEUNITSType(alternativeunitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ANYTYPE_TYPE: {
				ANYTYPEType anytypeType = (ANYTYPEType)theEObject;
				T result = caseANYTYPEType(anytypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.APOSTERIORICASEOF_TYPE: {
				APOSTERIORICASEOFType aposterioricaseofType = (APOSTERIORICASEOFType)theEObject;
				T result = caseAPOSTERIORICASEOFType(aposterioricaseofType);
				if (result == null) result = caseAPOSTERIORISEMANTICRELATIONSHIPType(aposterioricaseofType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIPS_TYPE: {
				APOSTERIORISEMANTICRELATIONSHIPSType aposteriorisemanticrelationshipsType = (APOSTERIORISEMANTICRELATIONSHIPSType)theEObject;
				T result = caseAPOSTERIORISEMANTICRELATIONSHIPSType(aposteriorisemanticrelationshipsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIP_TYPE: {
				APOSTERIORISEMANTICRELATIONSHIPType aposteriorisemanticrelationshipType = (APOSTERIORISEMANTICRELATIONSHIPType)theEObject;
				T result = caseAPOSTERIORISEMANTICRELATIONSHIPType(aposteriorisemanticrelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE: {
				APOSTERIORIVIEWOFType aposterioriviewofType = (APOSTERIORIVIEWOFType)theEObject;
				T result = caseAPOSTERIORIVIEWOFType(aposterioriviewofType);
				if (result == null) result = caseAPOSTERIORISEMANTICRELATIONSHIPType(aposterioriviewofType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ARRAYTYPE_TYPE: {
				ARRAYTYPEType arraytypeType = (ARRAYTYPEType)theEObject;
				T result = caseARRAYTYPEType(arraytypeType);
				if (result == null) result = caseANYTYPEType(arraytypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ASSIGNEDVALUE_TYPE: {
				ASSIGNEDVALUEType assignedvalueType = (ASSIGNEDVALUEType)theEObject;
				T result = caseASSIGNEDVALUEType(assignedvalueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.AUTHORS_TYPE: {
				AUTHORSType authorsType = (AUTHORSType)theEObject;
				T result = caseAUTHORSType(authorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.AXIS1PLACEMENTTYPE_TYPE: {
				AXIS1PLACEMENTTYPEType axis1PLACEMENTTYPEType = (AXIS1PLACEMENTTYPEType)theEObject;
				T result = caseAXIS1PLACEMENTTYPEType(axis1PLACEMENTTYPEType);
				if (result == null) result = caseANYTYPEType(axis1PLACEMENTTYPEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.AXIS2PLACEMENT2DTYPE_TYPE: {
				AXIS2PLACEMENT2DTYPEType axis2PLACEMENT2DTYPEType = (AXIS2PLACEMENT2DTYPEType)theEObject;
				T result = caseAXIS2PLACEMENT2DTYPEType(axis2PLACEMENT2DTYPEType);
				if (result == null) result = caseANYTYPEType(axis2PLACEMENT2DTYPEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.AXIS2PLACEMENT3DTYPE_TYPE: {
				AXIS2PLACEMENT3DTYPEType axis2PLACEMENT3DTYPEType = (AXIS2PLACEMENT3DTYPEType)theEObject;
				T result = caseAXIS2PLACEMENT3DTYPEType(axis2PLACEMENT3DTYPEType);
				if (result == null) result = caseANYTYPEType(axis2PLACEMENT3DTYPEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.BAGTYPE_TYPE: {
				BAGTYPEType bagtypeType = (BAGTYPEType)theEObject;
				T result = caseBAGTYPEType(bagtypeType);
				if (result == null) result = caseANYTYPEType(bagtypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.BOOLEANTYPE_TYPE: {
				BOOLEANTYPEType booleantypeType = (BOOLEANTYPEType)theEObject;
				T result = caseBOOLEANTYPEType(booleantypeType);
				if (result == null) result = caseANYTYPEType(booleantypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CARDINALITYCONSTRAINT_TYPE: {
				CARDINALITYCONSTRAINTType cardinalityconstraintType = (CARDINALITYCONSTRAINTType)theEObject;
				T result = caseCARDINALITYCONSTRAINTType(cardinalityconstraintType);
				if (result == null) result = caseDOMAINCONSTRAINTType(cardinalityconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CATEGORIZATIONCLASS_TYPE: {
				CATEGORIZATIONCLASSType categorizationclassType = (CATEGORIZATIONCLASSType)theEObject;
				T result = caseCATEGORIZATIONCLASSType(categorizationclassType);
				if (result == null) result = caseCLASSType(categorizationclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSCONSTANTVALUES_TYPE: {
				CLASSCONSTANTVALUESType classconstantvaluesType = (CLASSCONSTANTVALUESType)theEObject;
				T result = caseCLASSCONSTANTVALUESType(classconstantvaluesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSCONSTRAINT_TYPE: {
				CLASSCONSTRAINTType classconstraintType = (CLASSCONSTRAINTType)theEObject;
				T result = caseCLASSCONSTRAINTType(classconstraintType);
				if (result == null) result = caseCONSTRAINTType(classconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSESREFERENCE_TYPE: {
				CLASSESREFERENCEType classesreferenceType = (CLASSESREFERENCEType)theEObject;
				T result = caseCLASSESREFERENCEType(classesreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSEXTENSION_TYPE: {
				CLASSEXTENSIONType classextensionType = (CLASSEXTENSIONType)theEObject;
				T result = caseCLASSEXTENSIONType(classextensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSIFICATION_TYPE: {
				CLASSIFICATIONType classificationType = (CLASSIFICATIONType)theEObject;
				T result = caseCLASSIFICATIONType(classificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSPRESENTATIONONPAPER_TYPE: {
				CLASSPRESENTATIONONPAPERType classpresentationonpaperType = (CLASSPRESENTATIONONPAPERType)theEObject;
				T result = caseCLASSPRESENTATIONONPAPERType(classpresentationonpaperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSPRESENTATIONONSCREEN_TYPE: {
				CLASSPRESENTATIONONSCREENType classpresentationonscreenType = (CLASSPRESENTATIONONSCREENType)theEObject;
				T result = caseCLASSPRESENTATIONONSCREENType(classpresentationonscreenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSREFERENCE_TYPE: {
				CLASSREFERENCEType classreferenceType = (CLASSREFERENCEType)theEObject;
				T result = caseCLASSREFERENCEType(classreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSREFERENCETYPE_TYPE: {
				CLASSREFERENCETYPEType classreferencetypeType = (CLASSREFERENCETYPEType)theEObject;
				T result = caseCLASSREFERENCETYPEType(classreferencetypeType);
				if (result == null) result = caseANYTYPEType(classreferencetypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASS_TYPE: {
				CLASSType classType = (CLASSType)theEObject;
				T result = caseCLASSType(classType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CLASSVALUEASSIGNMENT_TYPE: {
				CLASSVALUEASSIGNMENTType classvalueassignmentType = (CLASSVALUEASSIGNMENTType)theEObject;
				T result = caseCLASSVALUEASSIGNMENTType(classvalueassignmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONDITIONDET_TYPE: {
				CONDITIONDETType conditiondetType = (CONDITIONDETType)theEObject;
				T result = caseCONDITIONDETType(conditiondetType);
				if (result == null) result = casePROPERTYType(conditiondetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE: {
				CONFIGURATIONCONTROLCONSTRAINTType configurationcontrolconstraintType = (CONFIGURATIONCONTROLCONSTRAINTType)theEObject;
				T result = caseCONFIGURATIONCONTROLCONSTRAINTType(configurationcontrolconstraintType);
				if (result == null) result = caseCLASSCONSTRAINTType(configurationcontrolconstraintType);
				if (result == null) result = caseCONSTRAINTType(configurationcontrolconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONSTRAINTORCONSTRAINTID_TYPE: {
				CONSTRAINTORCONSTRAINTIDType constraintorconstraintidType = (CONSTRAINTORCONSTRAINTIDType)theEObject;
				T result = caseCONSTRAINTORCONSTRAINTIDType(constraintorconstraintidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONSTRAINTS_TYPE: {
				CONSTRAINTSType constraintsType = (CONSTRAINTSType)theEObject;
				T result = caseCONSTRAINTSType(constraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONSTRAINT_TYPE: {
				CONSTRAINTType constraintType = (CONSTRAINTType)theEObject;
				T result = caseCONSTRAINTType(constraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTAINEDCLASSES_TYPE: {
				CONTAINEDCLASSESType containedclassesType = (CONTAINEDCLASSESType)theEObject;
				T result = caseCONTAINEDCLASSESType(containedclassesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTAINEDCLASSEXTENSIONS_TYPE: {
				CONTAINEDCLASSEXTENSIONSType containedclassextensionsType = (CONTAINEDCLASSEXTENSIONSType)theEObject;
				T result = caseCONTAINEDCLASSEXTENSIONSType(containedclassextensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTAINEDDATATYPES_TYPE: {
				CONTAINEDDATATYPESType containeddatatypesType = (CONTAINEDDATATYPESType)theEObject;
				T result = caseCONTAINEDDATATYPESType(containeddatatypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTAINEDDOCUMENTS_TYPE: {
				CONTAINEDDOCUMENTSType containeddocumentsType = (CONTAINEDDOCUMENTSType)theEObject;
				T result = caseCONTAINEDDOCUMENTSType(containeddocumentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTAINEDKEYWORDS_TYPE: {
				CONTAINEDKEYWORDSType containedkeywordsType = (CONTAINEDKEYWORDSType)theEObject;
				T result = caseCONTAINEDKEYWORDSType(containedkeywordsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTAINEDPROPERTIES_TYPE: {
				CONTAINEDPROPERTIESType containedpropertiesType = (CONTAINEDPROPERTIESType)theEObject;
				T result = caseCONTAINEDPROPERTIESType(containedpropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTAINEDSUPPLIERS_TYPE: {
				CONTAINEDSUPPLIERSType containedsuppliersType = (CONTAINEDSUPPLIERSType)theEObject;
				T result = caseCONTAINEDSUPPLIERSType(containedsuppliersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTAINEDSYNONYMS_TYPE: {
				CONTAINEDSYNONYMSType containedsynonymsType = (CONTAINEDSYNONYMSType)theEObject;
				T result = caseCONTAINEDSYNONYMSType(containedsynonymsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTEXTDEPENDENTUNIT_TYPE: {
				CONTEXTDEPENDENTUNITType contextdependentunitType = (CONTEXTDEPENDENTUNITType)theEObject;
				T result = caseCONTEXTDEPENDENTUNITType(contextdependentunitType);
				if (result == null) result = caseNAMEDUNITType(contextdependentunitType);
				if (result == null) result = caseUNITType(contextdependentunitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTEXTPARAMETERCONSTRAINTS_TYPE: {
				CONTEXTPARAMETERCONSTRAINTSType contextparameterconstraintsType = (CONTEXTPARAMETERCONSTRAINTSType)theEObject;
				T result = caseCONTEXTPARAMETERCONSTRAINTSType(contextparameterconstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTEXTPARAMICON_TYPE: {
				CONTEXTPARAMICONType contextparamiconType = (CONTEXTPARAMICONType)theEObject;
				T result = caseCONTEXTPARAMICONType(contextparamiconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONTEXTRESTRICTIONCONSTRAINT_TYPE: {
				CONTEXTRESTRICTIONCONSTRAINTType contextrestrictionconstraintType = (CONTEXTRESTRICTIONCONSTRAINTType)theEObject;
				T result = caseCONTEXTRESTRICTIONCONSTRAINTType(contextrestrictionconstraintType);
				if (result == null) result = casePROPERTYCONSTRAINTType(contextrestrictionconstraintType);
				if (result == null) result = caseCONSTRAINTType(contextrestrictionconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE: {
				CONVERSIONBASEDUNITType conversionbasedunitType = (CONVERSIONBASEDUNITType)theEObject;
				T result = caseCONVERSIONBASEDUNITType(conversionbasedunitType);
				if (result == null) result = caseNAMEDUNITType(conversionbasedunitType);
				if (result == null) result = caseUNITType(conversionbasedunitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CORRESPONDINGPROPERTIES_TYPE: {
				CORRESPONDINGPROPERTIESType correspondingpropertiesType = (CORRESPONDINGPROPERTIESType)theEObject;
				T result = caseCORRESPONDINGPROPERTIESType(correspondingpropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.CREATEICON_TYPE: {
				CREATEICONType createiconType = (CREATEICONType)theEObject;
				T result = caseCREATEICONType(createiconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DATATYPEREFERENCE_TYPE: {
				DATATYPEREFERENCEType datatypereferenceType = (DATATYPEREFERENCEType)theEObject;
				T result = caseDATATYPEREFERENCEType(datatypereferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DATATYPESREFERENCE_TYPE: {
				DATATYPESREFERENCEType datatypesreferenceType = (DATATYPESREFERENCEType)theEObject;
				T result = caseDATATYPESREFERENCEType(datatypesreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DATATYPE_TYPE: {
				DATATYPEType datatypeType = (DATATYPEType)theEObject;
				T result = caseDATATYPEType(datatypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DATEDATATYPE_TYPE: {
				DATEDATATYPEType datedatatypeType = (DATEDATATYPEType)theEObject;
				T result = caseDATEDATATYPEType(datedatatypeType);
				if (result == null) result = caseANYTYPEType(datedatatypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DATETIMEDATATYPE_TYPE: {
				DATETIMEDATATYPEType datetimedatatypeType = (DATETIMEDATATYPEType)theEObject;
				T result = caseDATETIMEDATATYPEType(datetimedatatypeType);
				if (result == null) result = caseANYTYPEType(datetimedatatypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DEPENDENTPDET_TYPE: {
				DEPENDENTPDETType dependentpdetType = (DEPENDENTPDETType)theEObject;
				T result = caseDEPENDENTPDETType(dependentpdetType);
				if (result == null) result = casePROPERTYType(dependentpdetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DERIVEDUNITELEMENT_TYPE: {
				DERIVEDUNITELEMENTType derivedunitelementType = (DERIVEDUNITELEMENTType)theEObject;
				T result = caseDERIVEDUNITELEMENTType(derivedunitelementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DERIVEDUNIT_TYPE: {
				DERIVEDUNITType derivedunitType = (DERIVEDUNITType)theEObject;
				T result = caseDERIVEDUNITType(derivedunitType);
				if (result == null) result = caseUNITType(derivedunitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DICTIONARIESREFERENCE_TYPE: {
				DICTIONARIESREFERENCEType dictionariesreferenceType = (DICTIONARIESREFERENCEType)theEObject;
				T result = caseDICTIONARIESREFERENCEType(dictionariesreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DICTIONARYINSTANDARDFORMAT_TYPE: {
				DICTIONARYINSTANDARDFORMATType dictionaryinstandardformatType = (DICTIONARYINSTANDARDFORMATType)theEObject;
				T result = caseDICTIONARYINSTANDARDFORMATType(dictionaryinstandardformatType);
				if (result == null) result = caseDICTIONARYType(dictionaryinstandardformatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DICTIONARYREFERENCE_TYPE: {
				DICTIONARYREFERENCEType dictionaryreferenceType = (DICTIONARYREFERENCEType)theEObject;
				T result = caseDICTIONARYREFERENCEType(dictionaryreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DICTIONARY_TYPE: {
				DICTIONARYType dictionaryType = (DICTIONARYType)theEObject;
				T result = caseDICTIONARYType(dictionaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DICUNITREFERENCE_TYPE: {
				DICUNITREFERENCEType dicunitreferenceType = (DICUNITREFERENCEType)theEObject;
				T result = caseDICUNITREFERENCEType(dicunitreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DICUNITSREFERENCE_TYPE: {
				DICUNITSREFERENCEType dicunitsreferenceType = (DICUNITSREFERENCEType)theEObject;
				T result = caseDICUNITSREFERENCEType(dicunitsreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DICUNIT_TYPE: {
				DICUNITType dicunitType = (DICUNITType)theEObject;
				T result = caseDICUNITType(dicunitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DICVALUE_TYPE: {
				DICVALUEType dicvalueType = (DICVALUEType)theEObject;
				T result = caseDICVALUEType(dicvalueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DIMENSIONALEXPONENTS_TYPE: {
				DIMENSIONALEXPONENTSType dimensionalexponentsType = (DIMENSIONALEXPONENTSType)theEObject;
				T result = caseDIMENSIONALEXPONENTSType(dimensionalexponentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DOCUMENTCONTENT_TYPE: {
				DOCUMENTCONTENTType documentcontentType = (DOCUMENTCONTENTType)theEObject;
				T result = caseDOCUMENTCONTENTType(documentcontentType);
				if (result == null) result = caseEXTERNALRESOURCEType(documentcontentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DOCUMENTIDENTIFIERNAMELABEL_TYPE: {
				DOCUMENTIDENTIFIERNAMELABELType documentidentifiernamelabelType = (DOCUMENTIDENTIFIERNAMELABELType)theEObject;
				T result = caseDOCUMENTIDENTIFIERNAMELABELType(documentidentifiernamelabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DOCUMENTIDENTIFIER_TYPE: {
				DOCUMENTIDENTIFIERType documentidentifierType = (DOCUMENTIDENTIFIERType)theEObject;
				T result = caseDOCUMENTIDENTIFIERType(documentidentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DOCUMENTREFERENCE_TYPE: {
				DOCUMENTREFERENCEType documentreferenceType = (DOCUMENTREFERENCEType)theEObject;
				T result = caseDOCUMENTREFERENCEType(documentreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DOCUMENTSREFERENCE_TYPE: {
				DOCUMENTSREFERENCEType documentsreferenceType = (DOCUMENTSREFERENCEType)theEObject;
				T result = caseDOCUMENTSREFERENCEType(documentsreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DOCUMENT_TYPE: {
				DOCUMENTType documentType = (DOCUMENTType)theEObject;
				T result = caseDOCUMENTType(documentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DOMAINCONSTRAINTS_TYPE: {
				DOMAINCONSTRAINTSType domainconstraintsType = (DOMAINCONSTRAINTSType)theEObject;
				T result = caseDOMAINCONSTRAINTSType(domainconstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.DOMAINCONSTRAINT_TYPE: {
				DOMAINCONSTRAINTType domainconstraintType = (DOMAINCONSTRAINTType)theEObject;
				T result = caseDOMAINCONSTRAINTType(domainconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ENUMERATIONCONSTRAINT_TYPE: {
				ENUMERATIONCONSTRAINTType enumerationconstraintType = (ENUMERATIONCONSTRAINTType)theEObject;
				T result = caseENUMERATIONCONSTRAINTType(enumerationconstraintType);
				if (result == null) result = caseDOMAINCONSTRAINTType(enumerationconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE: {
				EXPLICITFUNCTIONALMODELCLASSEXTENSIONType explicitfunctionalmodelclassextensionType = (EXPLICITFUNCTIONALMODELCLASSEXTENSIONType)theEObject;
				T result = caseEXPLICITFUNCTIONALMODELCLASSEXTENSIONType(explicitfunctionalmodelclassextensionType);
				if (result == null) result = caseCLASSEXTENSIONType(explicitfunctionalmodelclassextensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE: {
				EXPLICITITEMCLASSEXTENSIONType explicititemclassextensionType = (EXPLICITITEMCLASSEXTENSIONType)theEObject;
				T result = caseEXPLICITITEMCLASSEXTENSIONType(explicititemclassextensionType);
				if (result == null) result = caseCLASSEXTENSIONType(explicititemclassextensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.EXTERNALFILES_TYPE: {
				EXTERNALFILESType externalfilesType = (EXTERNALFILESType)theEObject;
				T result = caseEXTERNALFILESType(externalfilesType);
				if (result == null) result = caseEXTERNALRESOURCEType(externalfilesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.EXTERNALGRAPHICS_TYPE: {
				EXTERNALGRAPHICSType externalgraphicsType = (EXTERNALGRAPHICSType)theEObject;
				T result = caseEXTERNALGRAPHICSType(externalgraphicsType);
				if (result == null) result = caseGRAPHICSType(externalgraphicsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.EXTERNALRESOURCE_TYPE: {
				EXTERNALRESOURCEType externalresourceType = (EXTERNALRESOURCEType)theEObject;
				T result = caseEXTERNALRESOURCEType(externalresourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.FILTER_TYPE: {
				FILTERType filterType = (FILTERType)theEObject;
				T result = caseFILTERType(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.FMCLASSVIEWOF_TYPE: {
				FMCLASSVIEWOFType fmclassviewofType = (FMCLASSVIEWOFType)theEObject;
				T result = caseFMCLASSVIEWOFType(fmclassviewofType);
				if (result == null) result = caseCLASSType(fmclassviewofType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.FREERELATIONDEFINITIONREF_TYPE: {
				FREERELATIONDEFINITIONREFType freerelationdefinitionrefType = (FREERELATIONDEFINITIONREFType)theEObject;
				T result = caseFREERELATIONDEFINITIONREFType(freerelationdefinitionrefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.FREERELATIONENDREF_TYPE: {
				FREERELATIONENDREFType freerelationendrefType = (FREERELATIONENDREFType)theEObject;
				T result = caseFREERELATIONENDREFType(freerelationendrefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.FREERELATIONS_TYPE: {
				FREERELATIONSType freerelationsType = (FREERELATIONSType)theEObject;
				T result = caseFREERELATIONSType(freerelationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.FREERELATION_TYPE: {
				FREERELATIONType freerelationType = (FREERELATIONType)theEObject;
				T result = caseFREERELATIONType(freerelationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE: {
				FUNCTIONALMODELCLASSType functionalmodelclassType = (FUNCTIONALMODELCLASSType)theEObject;
				T result = caseFUNCTIONALMODELCLASSType(functionalmodelclassType);
				if (result == null) result = caseCLASSType(functionalmodelclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.GENERALTEXT_TYPE: {
				GENERALTEXTType generaltextType = (GENERALTEXTType)theEObject;
				T result = caseGENERALTEXTType(generaltextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.GEOMETRICCONTEXT_TYPE: {
				GEOMETRICCONTEXTType geometriccontextType = (GEOMETRICCONTEXTType)theEObject;
				T result = caseGEOMETRICCONTEXTType(geometriccontextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE: {
				GEOMETRICUNITCONTEXTType geometricunitcontextType = (GEOMETRICUNITCONTEXTType)theEObject;
				T result = caseGEOMETRICUNITCONTEXTType(geometricunitcontextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.GRAPHICS_TYPE: {
				GRAPHICSType graphicsType = (GRAPHICSType)theEObject;
				T result = caseGRAPHICSType(graphicsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.HEADER_TYPE: {
				HEADERType headerType = (HEADERType)theEObject;
				T result = caseHEADERType(headerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.HTTPFILE_TYPE: {
				HTTPFILEType httpfileType = (HTTPFILEType)theEObject;
				T result = caseHTTPFILEType(httpfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.IDENTIFIEDDOCUMENT_TYPE: {
				IDENTIFIEDDOCUMENTType identifieddocumentType = (IDENTIFIEDDOCUMENTType)theEObject;
				T result = caseIDENTIFIEDDOCUMENTType(identifieddocumentType);
				if (result == null) result = caseSOURCEDOCUMENTType(identifieddocumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ILLUSTRATION_TYPE: {
				ILLUSTRATIONType illustrationType = (ILLUSTRATIONType)theEObject;
				T result = caseILLUSTRATIONType(illustrationType);
				if (result == null) result = caseEXTERNALRESOURCEType(illustrationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.INFORMATION_TYPE: {
				INFORMATIONType informationType = (INFORMATIONType)theEObject;
				T result = caseINFORMATIONType(informationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.INTCURRENCYTYPE_TYPE: {
				INTCURRENCYTYPEType intcurrencytypeType = (INTCURRENCYTYPEType)theEObject;
				T result = caseINTCURRENCYTYPEType(intcurrencytypeType);
				if (result == null) result = caseANYTYPEType(intcurrencytypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.INTDICVALUE_TYPE: {
				INTDICVALUEType intdicvalueType = (INTDICVALUEType)theEObject;
				T result = caseINTDICVALUEType(intdicvalueType);
				if (result == null) result = caseDICVALUEType(intdicvalueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.INTEGRITYCONSTRAINT_TYPE: {
				INTEGRITYCONSTRAINTType integrityconstraintType = (INTEGRITYCONSTRAINTType)theEObject;
				T result = caseINTEGRITYCONSTRAINTType(integrityconstraintType);
				if (result == null) result = casePROPERTYCONSTRAINTType(integrityconstraintType);
				if (result == null) result = caseCONSTRAINTType(integrityconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.INTMEASURETYPE_TYPE: {
				INTMEASURETYPEType intmeasuretypeType = (INTMEASURETYPEType)theEObject;
				T result = caseINTMEASURETYPEType(intmeasuretypeType);
				if (result == null) result = caseANYTYPEType(intmeasuretypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.INTTYPE_TYPE: {
				INTTYPEType inttypeType = (INTTYPEType)theEObject;
				T result = caseINTTYPEType(inttypeType);
				if (result == null) result = caseANYTYPEType(inttypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ITEMCLASSCASEOF_TYPE: {
				ITEMCLASSCASEOFType itemclasscaseofType = (ITEMCLASSCASEOFType)theEObject;
				T result = caseITEMCLASSCASEOFType(itemclasscaseofType);
				if (result == null) result = caseCLASSType(itemclasscaseofType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ITEMCLASS_TYPE: {
				ITEMCLASSType itemclassType = (ITEMCLASSType)theEObject;
				T result = caseITEMCLASSType(itemclassType);
				if (result == null) result = caseCLASSType(itemclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ITSVALUES_TYPE: {
				ITSVALUESType itsvaluesType = (ITSVALUESType)theEObject;
				T result = caseITSVALUESType(itsvaluesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.KEYWORDLABEL_TYPE: {
				KEYWORDLABELType keywordlabelType = (KEYWORDLABELType)theEObject;
				T result = caseKEYWORDLABELType(keywordlabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.KEYWORDREFERENCES_TYPE: {
				KEYWORDREFERENCESType keywordreferencesType = (KEYWORDREFERENCESType)theEObject;
				T result = caseKEYWORDREFERENCESType(keywordreferencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.KEYWORD_TYPE: {
				KEYWORDType keywordType = (KEYWORDType)theEObject;
				T result = caseKEYWORDType(keywordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.LANGUAGE_TYPE: {
				LANGUAGEType languageType = (LANGUAGEType)theEObject;
				T result = caseLANGUAGEType(languageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.LEVEL_TYPE: {
				LEVELType levelType = (LEVELType)theEObject;
				T result = caseLEVELType(levelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.LEVELTYPE_TYPE: {
				LEVELTYPEType leveltypeType = (LEVELTYPEType)theEObject;
				T result = caseLEVELTYPEType(leveltypeType);
				if (result == null) result = caseANYTYPEType(leveltypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.LIBRARYIIMIDENTIFICATION_TYPE: {
				LIBRARYIIMIDENTIFICATIONType libraryiimidentificationType = (LIBRARYIIMIDENTIFICATIONType)theEObject;
				T result = caseLIBRARYIIMIDENTIFICATIONType(libraryiimidentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.LIBRARYINSTANDARDFORMAT_TYPE: {
				LIBRARYINSTANDARDFORMATType libraryinstandardformatType = (LIBRARYINSTANDARDFORMATType)theEObject;
				T result = caseLIBRARYINSTANDARDFORMATType(libraryinstandardformatType);
				if (result == null) result = caseLIBRARYType(libraryinstandardformatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.LIBRARY_TYPE: {
				LIBRARYType libraryType = (LIBRARYType)theEObject;
				T result = caseLIBRARYType(libraryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.LISTTYPE_TYPE: {
				LISTTYPEType listtypeType = (LISTTYPEType)theEObject;
				T result = caseLISTTYPEType(listtypeType);
				if (result == null) result = caseANYTYPEType(listtypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.MAPPINGFUNCTION_TYPE: {
				MAPPINGFUNCTIONType mappingfunctionType = (MAPPINGFUNCTIONType)theEObject;
				T result = caseMAPPINGFUNCTIONType(mappingfunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.MATHEMATICALSTRING_TYPE: {
				MATHEMATICALSTRINGType mathematicalstringType = (MATHEMATICALSTRINGType)theEObject;
				T result = caseMATHEMATICALSTRINGType(mathematicalstringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.MESSAGE_TYPE: {
				MESSAGEType messageType = (MESSAGEType)theEObject;
				T result = caseMESSAGEType(messageType);
				if (result == null) result = caseEXTERNALRESOURCEType(messageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.NAMEDTYPE_TYPE: {
				NAMEDTYPEType namedtypeType = (NAMEDTYPEType)theEObject;
				T result = caseNAMEDTYPEType(namedtypeType);
				if (result == null) result = caseANYTYPEType(namedtypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.NAMEDUNIT_TYPE: {
				NAMEDUNITType namedunitType = (NAMEDUNITType)theEObject;
				T result = caseNAMEDUNITType(namedunitType);
				if (result == null) result = caseUNITType(namedunitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.NONDEPENDENTPDET_TYPE: {
				NONDEPENDENTPDETType nondependentpdetType = (NONDEPENDENTPDETType)theEObject;
				T result = caseNONDEPENDENTPDETType(nondependentpdetType);
				if (result == null) result = casePROPERTYType(nondependentpdetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE: {
				NONINSTANTIABLEFUNCTIONALVIEWCLASSType noninstantiablefunctionalviewclassType = (NONINSTANTIABLEFUNCTIONALVIEWCLASSType)theEObject;
				T result = caseNONINSTANTIABLEFUNCTIONALVIEWCLASSType(noninstantiablefunctionalviewclassType);
				if (result == null) result = caseCLASSType(noninstantiablefunctionalviewclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.NONQUANTITATIVECODETYPE_TYPE: {
				NONQUANTITATIVECODETYPEType nonquantitativecodetypeType = (NONQUANTITATIVECODETYPEType)theEObject;
				T result = caseNONQUANTITATIVECODETYPEType(nonquantitativecodetypeType);
				if (result == null) result = caseANYTYPEType(nonquantitativecodetypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE: {
				NONQUANTITATIVEINTTYPEType nonquantitativeinttypeType = (NONQUANTITATIVEINTTYPEType)theEObject;
				T result = caseNONQUANTITATIVEINTTYPEType(nonquantitativeinttypeType);
				if (result == null) result = caseANYTYPEType(nonquantitativeinttypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.NONSIUNIT_TYPE: {
				NONSIUNITType nonsiunitType = (NONSIUNITType)theEObject;
				T result = caseNONSIUNITType(nonsiunitType);
				if (result == null) result = caseNAMEDUNITType(nonsiunitType);
				if (result == null) result = caseUNITType(nonsiunitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.NONTRANSLATABLESTRINGTYPE_TYPE: {
				NONTRANSLATABLESTRINGTYPEType nontranslatablestringtypeType = (NONTRANSLATABLESTRINGTYPEType)theEObject;
				T result = caseNONTRANSLATABLESTRINGTYPEType(nontranslatablestringtypeType);
				if (result == null) result = caseANYTYPEType(nontranslatablestringtypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.NUMBERTYPE_TYPE: {
				NUMBERTYPEType numbertypeType = (NUMBERTYPEType)theEObject;
				T result = caseNUMBERTYPEType(numbertypeType);
				if (result == null) result = caseANYTYPEType(numbertypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ONTOML_TYPE: {
				ONTOMLType ontomlType = (ONTOMLType)theEObject;
				T result = caseONTOMLType(ontomlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.ORGANIZATION_TYPE: {
				ORGANIZATIONType organizationType = (ORGANIZATIONType)theEObject;
				T result = caseORGANIZATIONType(organizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PERSON_TYPE: {
				PERSONType personType = (PERSONType)theEObject;
				T result = casePERSONType(personType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PLACEMENTTYPE_TYPE: {
				PLACEMENTTYPEType placementtypeType = (PLACEMENTTYPEType)theEObject;
				T result = casePLACEMENTTYPEType(placementtypeType);
				if (result == null) result = caseANYTYPEType(placementtypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.POSTCONDITION_TYPE: {
				POSTCONDITIONType postconditionType = (POSTCONDITIONType)theEObject;
				T result = casePOSTCONDITIONType(postconditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PRECONDITION_TYPE: {
				PRECONDITIONType preconditionType = (PRECONDITIONType)theEObject;
				T result = casePRECONDITIONType(preconditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PREFERREDNAMELABEL_TYPE: {
				PREFERREDNAMELABELType preferrednamelabelType = (PREFERREDNAMELABELType)theEObject;
				T result = casePREFERREDNAMELABELType(preferrednamelabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PREFERREDNAME_TYPE: {
				PREFERREDNAMEType preferrednameType = (PREFERREDNAMEType)theEObject;
				T result = casePREFERREDNAMEType(preferrednameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE: {
				PROGRAMREFERENCETYPEType programreferencetypeType = (PROGRAMREFERENCETYPEType)theEObject;
				T result = casePROGRAMREFERENCETYPEType(programreferencetypeType);
				if (result == null) result = caseANYTYPEType(programreferencetypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PROPERTIESREFERENCE_TYPE: {
				PROPERTIESREFERENCEType propertiesreferenceType = (PROPERTIESREFERENCEType)theEObject;
				T result = casePROPERTIESREFERENCEType(propertiesreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PROPERTYCLASSIFICATION_TYPE: {
				PROPERTYCLASSIFICATIONType propertyclassificationType = (PROPERTYCLASSIFICATIONType)theEObject;
				T result = casePROPERTYCLASSIFICATIONType(propertyclassificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PROPERTYCONSTRAINT_TYPE: {
				PROPERTYCONSTRAINTType propertyconstraintType = (PROPERTYCONSTRAINTType)theEObject;
				T result = casePROPERTYCONSTRAINTType(propertyconstraintType);
				if (result == null) result = caseCONSTRAINTType(propertyconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PROPERTYMAPPING_TYPE: {
				PROPERTYMAPPINGType propertymappingType = (PROPERTYMAPPINGType)theEObject;
				T result = casePROPERTYMAPPINGType(propertymappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PROPERTYREFERENCE_TYPE: {
				PROPERTYREFERENCEType propertyreferenceType = (PROPERTYREFERENCEType)theEObject;
				T result = casePROPERTYREFERENCEType(propertyreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PROPERTY_TYPE: {
				PROPERTYType propertyType = (PROPERTYType)theEObject;
				T result = casePROPERTYType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.PROPERTYVALUERECOMMENDEDPRESENTATION_TYPE: {
				PROPERTYVALUERECOMMENDEDPRESENTATIONType propertyvaluerecommendedpresentationType = (PROPERTYVALUERECOMMENDEDPRESENTATIONType)theEObject;
				T result = casePROPERTYVALUERECOMMENDEDPRESENTATIONType(propertyvaluerecommendedpresentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.RANGECONSTRAINT_TYPE: {
				RANGECONSTRAINTType rangeconstraintType = (RANGECONSTRAINTType)theEObject;
				T result = caseRANGECONSTRAINTType(rangeconstraintType);
				if (result == null) result = caseDOMAINCONSTRAINTType(rangeconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.RATIONALMEASURETYPE_TYPE: {
				RATIONALMEASURETYPEType rationalmeasuretypeType = (RATIONALMEASURETYPEType)theEObject;
				T result = caseRATIONALMEASURETYPEType(rationalmeasuretypeType);
				if (result == null) result = caseANYTYPEType(rationalmeasuretypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.RATIONALTYPE_TYPE: {
				RATIONALTYPEType rationaltypeType = (RATIONALTYPEType)theEObject;
				T result = caseRATIONALTYPEType(rationaltypeType);
				if (result == null) result = caseANYTYPEType(rationaltypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REALCURRENCYTYPE_TYPE: {
				REALCURRENCYTYPEType realcurrencytypeType = (REALCURRENCYTYPEType)theEObject;
				T result = caseREALCURRENCYTYPEType(realcurrencytypeType);
				if (result == null) result = caseANYTYPEType(realcurrencytypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REALMEASURETYPE_TYPE: {
				REALMEASURETYPEType realmeasuretypeType = (REALMEASURETYPEType)theEObject;
				T result = caseREALMEASURETYPEType(realmeasuretypeType);
				if (result == null) result = caseANYTYPEType(realmeasuretypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REALTYPE_TYPE: {
				REALTYPEType realtypeType = (REALTYPEType)theEObject;
				T result = caseREALTYPEType(realtypeType);
				if (result == null) result = caseANYTYPEType(realtypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.RECOMMENDEDPRESENTATION_TYPE: {
				RECOMMENDEDPRESENTATIONType recommendedpresentationType = (RECOMMENDEDPRESENTATIONType)theEObject;
				T result = caseRECOMMENDEDPRESENTATIONType(recommendedpresentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REFERENCEDDOCUMENT_TYPE: {
				REFERENCEDDOCUMENTType referenceddocumentType = (REFERENCEDDOCUMENTType)theEObject;
				T result = caseREFERENCEDDOCUMENTType(referenceddocumentType);
				if (result == null) result = caseSOURCEDOCUMENTType(referenceddocumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REFERENCEDGRAPHICS_TYPE: {
				REFERENCEDGRAPHICSType referencedgraphicsType = (REFERENCEDGRAPHICSType)theEObject;
				T result = caseREFERENCEDGRAPHICSType(referencedgraphicsType);
				if (result == null) result = caseGRAPHICSType(referencedgraphicsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REMOTELOCATIONS_TYPE: {
				REMOTELOCATIONSType remotelocationsType = (REMOTELOCATIONSType)theEObject;
				T result = caseREMOTELOCATIONSType(remotelocationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REMOTE_LOCATION_TYPE: {
				RemoteLocationType remoteLocationType = (RemoteLocationType)theEObject;
				T result = caseRemoteLocationType(remoteLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REPRESENTATIONPDET_TYPE: {
				REPRESENTATIONPDETType representationpdetType = (REPRESENTATIONPDETType)theEObject;
				T result = caseREPRESENTATIONPDETType(representationpdetType);
				if (result == null) result = casePROPERTYType(representationpdetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REPRESENTATIONREFERENCETYPE_TYPE: {
				REPRESENTATIONREFERENCETYPEType representationreferencetypeType = (REPRESENTATIONREFERENCETYPEType)theEObject;
				T result = caseREPRESENTATIONREFERENCETYPEType(representationreferencetypeType);
				if (result == null) result = caseANYTYPEType(representationreferencetypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REUSABLEKEYWORD_TYPE: {
				REUSABLEKEYWORDType reusablekeywordType = (REUSABLEKEYWORDType)theEObject;
				T result = caseREUSABLEKEYWORDType(reusablekeywordType);
				if (result == null) result = caseREUSABLENAMEType(reusablekeywordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REUSABLENAME_TYPE: {
				REUSABLENAMEType reusablenameType = (REUSABLENAMEType)theEObject;
				T result = caseREUSABLENAMEType(reusablenameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.REUSABLESYNONYM_TYPE: {
				REUSABLESYNONYMType reusablesynonymType = (REUSABLESYNONYMType)theEObject;
				T result = caseREUSABLESYNONYMType(reusablesynonymType);
				if (result == null) result = caseREUSABLENAMEType(reusablesynonymType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SETTYPE_TYPE: {
				SETTYPEType settypeType = (SETTYPEType)theEObject;
				T result = caseSETTYPEType(settypeType);
				if (result == null) result = caseANYTYPEType(settypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SETWITHSUBSETCONSTRAINTTYPE_TYPE: {
				SETWITHSUBSETCONSTRAINTTYPEType setwithsubsetconstrainttypeType = (SETWITHSUBSETCONSTRAINTTYPEType)theEObject;
				T result = caseSETWITHSUBSETCONSTRAINTTYPEType(setwithsubsetconstrainttypeType);
				if (result == null) result = caseANYTYPEType(setwithsubsetconstrainttypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SHORTNAMELABEL_TYPE: {
				SHORTNAMELABELType shortnamelabelType = (SHORTNAMELABELType)theEObject;
				T result = caseSHORTNAMELABELType(shortnamelabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SHORTNAME_TYPE: {
				SHORTNAMEType shortnameType = (SHORTNAMEType)theEObject;
				T result = caseSHORTNAMEType(shortnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SIUNIT_TYPE: {
				SIUNITType siunitType = (SIUNITType)theEObject;
				T result = caseSIUNITType(siunitType);
				if (result == null) result = caseNAMEDUNITType(siunitType);
				if (result == null) result = caseUNITType(siunitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SOURCEDOCUMENT_TYPE: {
				SOURCEDOCUMENTType sourcedocumentType = (SOURCEDOCUMENTType)theEObject;
				T result = caseSOURCEDOCUMENTType(sourcedocumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.STRINGDICVALUE_TYPE: {
				STRINGDICVALUEType stringdicvalueType = (STRINGDICVALUEType)theEObject;
				T result = caseSTRINGDICVALUEType(stringdicvalueType);
				if (result == null) result = caseDICVALUEType(stringdicvalueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.STRINGPATTERNCONSTRAINT_TYPE: {
				STRINGPATTERNCONSTRAINTType stringpatternconstraintType = (STRINGPATTERNCONSTRAINTType)theEObject;
				T result = caseSTRINGPATTERNCONSTRAINTType(stringpatternconstraintType);
				if (result == null) result = caseDOMAINCONSTRAINTType(stringpatternconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.STRINGSIZECONSTRAINT_TYPE: {
				STRINGSIZECONSTRAINTType stringsizeconstraintType = (STRINGSIZECONSTRAINTType)theEObject;
				T result = caseSTRINGSIZECONSTRAINTType(stringsizeconstraintType);
				if (result == null) result = caseDOMAINCONSTRAINTType(stringsizeconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.STRINGS_TYPE: {
				STRINGSType stringsType = (STRINGSType)theEObject;
				T result = caseSTRINGSType(stringsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.STRINGTYPE_TYPE: {
				STRINGTYPEType stringtypeType = (STRINGTYPEType)theEObject;
				T result = caseSTRINGTYPEType(stringtypeType);
				if (result == null) result = caseANYTYPEType(stringtypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SUBCLASSCONSTRAINT_TYPE: {
				SUBCLASSCONSTRAINTType subclassconstraintType = (SUBCLASSCONSTRAINTType)theEObject;
				T result = caseSUBCLASSCONSTRAINTType(subclassconstraintType);
				if (result == null) result = caseDOMAINCONSTRAINTType(subclassconstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SUBSET_TYPE: {
				SUBSETType subsetType = (SUBSETType)theEObject;
				T result = caseSUBSETType(subsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SUPPLIERREFERENCE_TYPE: {
				SUPPLIERREFERENCEType supplierreferenceType = (SUPPLIERREFERENCEType)theEObject;
				T result = caseSUPPLIERREFERENCEType(supplierreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SUPPLIERSREFERENCE_TYPE: {
				SUPPLIERSREFERENCEType suppliersreferenceType = (SUPPLIERSREFERENCEType)theEObject;
				T result = caseSUPPLIERSREFERENCEType(suppliersreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SUPPLIER_TYPE: {
				SUPPLIERType supplierType = (SUPPLIERType)theEObject;
				T result = caseSUPPLIERType(supplierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SUPPORTEDVEP_TYPE: {
				SUPPORTEDVEPType supportedvepType = (SUPPORTEDVEPType)theEObject;
				T result = caseSUPPORTEDVEPType(supportedvepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SYNONYMOUSNAMELABEL_TYPE: {
				SYNONYMOUSNAMELABELType synonymousnamelabelType = (SYNONYMOUSNAMELABELType)theEObject;
				T result = caseSYNONYMOUSNAMELABELType(synonymousnamelabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SYNONYMOUSNAME_TYPE: {
				SYNONYMOUSNAMEType synonymousnameType = (SYNONYMOUSNAMEType)theEObject;
				T result = caseSYNONYMOUSNAMEType(synonymousnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SYNONYMOUSSYMBOLS_TYPE: {
				SYNONYMOUSSYMBOLSType synonymoussymbolsType = (SYNONYMOUSSYMBOLSType)theEObject;
				T result = caseSYNONYMOUSSYMBOLSType(synonymoussymbolsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.SYNONYMREFERENCES_TYPE: {
				SYNONYMREFERENCESType synonymreferencesType = (SYNONYMREFERENCESType)theEObject;
				T result = caseSYNONYMREFERENCESType(synonymreferencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.TEXT_TYPE: {
				TEXTType textType = (TEXTType)theEObject;
				T result = caseTEXTType(textType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.TIMEDATATYPE_TYPE: {
				TIMEDATATYPEType timedatatypeType = (TIMEDATATYPEType)theEObject;
				T result = caseTIMEDATATYPEType(timedatatypeType);
				if (result == null) result = caseANYTYPEType(timedatatypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.TRANSLATABLESTRINGTYPE_TYPE: {
				TRANSLATABLESTRINGTYPEType translatablestringtypeType = (TRANSLATABLESTRINGTYPEType)theEObject;
				T result = caseTRANSLATABLESTRINGTYPEType(translatablestringtypeType);
				if (result == null) result = caseANYTYPEType(translatablestringtypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.TRANSLATIONDATA_TYPE: {
				TRANSLATIONDATAType translationdataType = (TRANSLATIONDATAType)theEObject;
				T result = caseTRANSLATIONDATAType(translationdataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.TRANSLATION_TYPE: {
				TRANSLATIONType translationType = (TRANSLATIONType)theEObject;
				T result = caseTRANSLATIONType(translationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.UNIT_TYPE: {
				UNITType unitType = (UNITType)theEObject;
				T result = caseUNITType(unitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.URITYPE_TYPE: {
				URITYPEType uritypeType = (URITYPEType)theEObject;
				T result = caseURITYPEType(uritypeType);
				if (result == null) result = caseANYTYPEType(uritypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.VCVRANGE_TYPE: {
				VCVRANGEType vcvrangeType = (VCVRANGEType)theEObject;
				T result = caseVCVRANGEType(vcvrangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.VIEWCONTROLVARIABLERANGE_TYPE: {
				VIEWCONTROLVARIABLERANGEType viewcontrolvariablerangeType = (VIEWCONTROLVARIABLERANGEType)theEObject;
				T result = caseVIEWCONTROLVARIABLERANGEType(viewcontrolvariablerangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntomlPackage.VIEWEXCHANGEPROTOCOLIDENTIFICATION_TYPE: {
				VIEWEXCHANGEPROTOCOLIDENTIFICATIONType viewexchangeprotocolidentificationType = (VIEWEXCHANGEPROTOCOLIDENTIFICATIONType)theEObject;
				T result = caseVIEWEXCHANGEPROTOCOLIDENTIFICATIONType(viewexchangeprotocolidentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEUNITS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEUNITS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEUNITSType(ALTERNATIVEUNITSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANYTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANYTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANYTYPEType(ANYTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APOSTERIORICASEOF Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APOSTERIORICASEOF Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPOSTERIORICASEOFType(APOSTERIORICASEOFType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APOSTERIORISEMANTICRELATIONSHIPS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APOSTERIORISEMANTICRELATIONSHIPS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPOSTERIORISEMANTICRELATIONSHIPSType(APOSTERIORISEMANTICRELATIONSHIPSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APOSTERIORISEMANTICRELATIONSHIP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APOSTERIORISEMANTICRELATIONSHIP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPOSTERIORISEMANTICRELATIONSHIPType(APOSTERIORISEMANTICRELATIONSHIPType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APOSTERIORIVIEWOF Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APOSTERIORIVIEWOF Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPOSTERIORIVIEWOFType(APOSTERIORIVIEWOFType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARRAYTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARRAYTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARRAYTYPEType(ARRAYTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASSIGNEDVALUE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASSIGNEDVALUE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASSIGNEDVALUEType(ASSIGNEDVALUEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AUTHORS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AUTHORS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAUTHORSType(AUTHORSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AXIS1PLACEMENTTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AXIS1PLACEMENTTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAXIS1PLACEMENTTYPEType(AXIS1PLACEMENTTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AXIS2PLACEMENT2DTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AXIS2PLACEMENT2DTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAXIS2PLACEMENT2DTYPEType(AXIS2PLACEMENT2DTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AXIS2PLACEMENT3DTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AXIS2PLACEMENT3DTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAXIS2PLACEMENT3DTYPEType(AXIS2PLACEMENT3DTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAGTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAGTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAGTYPEType(BAGTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOOLEANTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOOLEANTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOOLEANTYPEType(BOOLEANTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CARDINALITYCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CARDINALITYCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCARDINALITYCONSTRAINTType(CARDINALITYCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CATEGORIZATIONCLASS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CATEGORIZATIONCLASS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCATEGORIZATIONCLASSType(CATEGORIZATIONCLASSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSCONSTANTVALUES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSCONSTANTVALUES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSCONSTANTVALUESType(CLASSCONSTANTVALUESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSCONSTRAINTType(CLASSCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSESREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSESREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSESREFERENCEType(CLASSESREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSEXTENSION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSEXTENSION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSEXTENSIONType(CLASSEXTENSIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSIFICATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSIFICATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSIFICATIONType(CLASSIFICATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSPRESENTATIONONPAPER Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSPRESENTATIONONPAPER Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSPRESENTATIONONPAPERType(CLASSPRESENTATIONONPAPERType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSPRESENTATIONONSCREEN Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSPRESENTATIONONSCREEN Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSPRESENTATIONONSCREENType(CLASSPRESENTATIONONSCREENType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSREFERENCEType(CLASSREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSREFERENCETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSREFERENCETYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSREFERENCETYPEType(CLASSREFERENCETYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSType(CLASSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSVALUEASSIGNMENT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSVALUEASSIGNMENT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSVALUEASSIGNMENTType(CLASSVALUEASSIGNMENTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONDITIONDET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONDITIONDET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONDITIONDETType(CONDITIONDETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONFIGURATIONCONTROLCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONFIGURATIONCONTROLCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONFIGURATIONCONTROLCONSTRAINTType(CONFIGURATIONCONTROLCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONSTRAINTORCONSTRAINTID Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONSTRAINTORCONSTRAINTID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONSTRAINTORCONSTRAINTIDType(CONSTRAINTORCONSTRAINTIDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONSTRAINTS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONSTRAINTS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONSTRAINTSType(CONSTRAINTSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONSTRAINTType(CONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDCLASSES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDCLASSES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDCLASSESType(CONTAINEDCLASSESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDCLASSEXTENSIONS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDCLASSEXTENSIONS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDCLASSEXTENSIONSType(CONTAINEDCLASSEXTENSIONSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDDATATYPES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDDATATYPES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDDATATYPESType(CONTAINEDDATATYPESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDDOCUMENTS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDDOCUMENTS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDDOCUMENTSType(CONTAINEDDOCUMENTSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDKEYWORDS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDKEYWORDS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDKEYWORDSType(CONTAINEDKEYWORDSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDPROPERTIES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDPROPERTIES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDPROPERTIESType(CONTAINEDPROPERTIESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDSUPPLIERS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDSUPPLIERS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDSUPPLIERSType(CONTAINEDSUPPLIERSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDSYNONYMS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDSYNONYMS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDSYNONYMSType(CONTAINEDSYNONYMSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTEXTDEPENDENTUNIT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTEXTDEPENDENTUNIT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTEXTDEPENDENTUNITType(CONTEXTDEPENDENTUNITType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTEXTPARAMETERCONSTRAINTS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTEXTPARAMETERCONSTRAINTS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTEXTPARAMETERCONSTRAINTSType(CONTEXTPARAMETERCONSTRAINTSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTEXTPARAMICON Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTEXTPARAMICON Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTEXTPARAMICONType(CONTEXTPARAMICONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTEXTRESTRICTIONCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTEXTRESTRICTIONCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTEXTRESTRICTIONCONSTRAINTType(CONTEXTRESTRICTIONCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONVERSIONBASEDUNIT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONVERSIONBASEDUNIT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONVERSIONBASEDUNITType(CONVERSIONBASEDUNITType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORRESPONDINGPROPERTIES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORRESPONDINGPROPERTIES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCORRESPONDINGPROPERTIESType(CORRESPONDINGPROPERTIESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CREATEICON Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CREATEICON Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCREATEICONType(CREATEICONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEREFERENCEType(DATATYPEREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPESREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPESREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPESREFERENCEType(DATATYPESREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEType(DATATYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATEDATATYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATEDATATYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATEDATATYPEType(DATEDATATYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATETIMEDATATYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATETIMEDATATYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATETIMEDATATYPEType(DATETIMEDATATYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEPENDENTPDET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEPENDENTPDET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEPENDENTPDETType(DEPENDENTPDETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DERIVEDUNITELEMENT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DERIVEDUNITELEMENT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDERIVEDUNITELEMENTType(DERIVEDUNITELEMENTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DERIVEDUNIT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DERIVEDUNIT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDERIVEDUNITType(DERIVEDUNITType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICTIONARIESREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICTIONARIESREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICTIONARIESREFERENCEType(DICTIONARIESREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICTIONARYINSTANDARDFORMAT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICTIONARYINSTANDARDFORMAT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICTIONARYINSTANDARDFORMATType(DICTIONARYINSTANDARDFORMATType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICTIONARYREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICTIONARYREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICTIONARYREFERENCEType(DICTIONARYREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICTIONARY Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICTIONARY Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICTIONARYType(DICTIONARYType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICUNITREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICUNITREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICUNITREFERENCEType(DICUNITREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICUNITSREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICUNITSREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICUNITSREFERENCEType(DICUNITSREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICUNIT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICUNIT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICUNITType(DICUNITType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICVALUE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICVALUE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICVALUEType(DICVALUEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DIMENSIONALEXPONENTS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIMENSIONALEXPONENTS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDIMENSIONALEXPONENTSType(DIMENSIONALEXPONENTSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTCONTENT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTCONTENT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTCONTENTType(DOCUMENTCONTENTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTIDENTIFIERNAMELABEL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTIDENTIFIERNAMELABEL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTIDENTIFIERNAMELABELType(DOCUMENTIDENTIFIERNAMELABELType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTIDENTIFIER Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTIDENTIFIER Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTIDENTIFIERType(DOCUMENTIDENTIFIERType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTREFERENCEType(DOCUMENTREFERENCEType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTSREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTSREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTSREFERENCEType(DOCUMENTSREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTType(DOCUMENTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOMAINCONSTRAINTS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOMAINCONSTRAINTS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOMAINCONSTRAINTSType(DOMAINCONSTRAINTSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOMAINCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOMAINCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOMAINCONSTRAINTType(DOMAINCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENUMERATIONCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENUMERATIONCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENUMERATIONCONSTRAINTType(ENUMERATIONCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXPLICITFUNCTIONALMODELCLASSEXTENSION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXPLICITFUNCTIONALMODELCLASSEXTENSION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXPLICITFUNCTIONALMODELCLASSEXTENSIONType(EXPLICITFUNCTIONALMODELCLASSEXTENSIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXPLICITITEMCLASSEXTENSION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXPLICITITEMCLASSEXTENSION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXPLICITITEMCLASSEXTENSIONType(EXPLICITITEMCLASSEXTENSIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXTERNALFILES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXTERNALFILES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXTERNALFILESType(EXTERNALFILESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXTERNALGRAPHICS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXTERNALGRAPHICS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXTERNALGRAPHICSType(EXTERNALGRAPHICSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXTERNALRESOURCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXTERNALRESOURCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXTERNALRESOURCEType(EXTERNALRESOURCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FILTER Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FILTER Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFILTERType(FILTERType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMCLASSVIEWOF Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMCLASSVIEWOF Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMCLASSVIEWOFType(FMCLASSVIEWOFType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FREERELATIONDEFINITIONREF Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FREERELATIONDEFINITIONREF Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFREERELATIONDEFINITIONREFType(FREERELATIONDEFINITIONREFType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FREERELATIONENDREF Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FREERELATIONENDREF Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFREERELATIONENDREFType(FREERELATIONENDREFType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FREERELATIONS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FREERELATIONS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFREERELATIONSType(FREERELATIONSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FREERELATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FREERELATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFREERELATIONType(FREERELATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FUNCTIONALMODELCLASS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FUNCTIONALMODELCLASS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFUNCTIONALMODELCLASSType(FUNCTIONALMODELCLASSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GENERALTEXT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GENERALTEXT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGENERALTEXTType(GENERALTEXTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEOMETRICCONTEXT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEOMETRICCONTEXT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEOMETRICCONTEXTType(GEOMETRICCONTEXTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEOMETRICUNITCONTEXT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEOMETRICUNITCONTEXT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEOMETRICUNITCONTEXTType(GEOMETRICUNITCONTEXTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRAPHICS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRAPHICS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRAPHICSType(GRAPHICSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HEADER Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HEADER Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHEADERType(HEADERType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTPFILE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTPFILE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPFILEType(HTTPFILEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDENTIFIEDDOCUMENT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDENTIFIEDDOCUMENT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDENTIFIEDDOCUMENTType(IDENTIFIEDDOCUMENTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILLUSTRATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILLUSTRATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILLUSTRATIONType(ILLUSTRATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INFORMATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INFORMATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINFORMATIONType(INFORMATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTCURRENCYTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTCURRENCYTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTCURRENCYTYPEType(INTCURRENCYTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTDICVALUE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTDICVALUE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTDICVALUEType(INTDICVALUEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTEGRITYCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTEGRITYCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTEGRITYCONSTRAINTType(INTEGRITYCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTMEASURETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTMEASURETYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTMEASURETYPEType(INTMEASURETYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTTYPEType(INTTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITEMCLASSCASEOF Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITEMCLASSCASEOF Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITEMCLASSCASEOFType(ITEMCLASSCASEOFType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITEMCLASS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITEMCLASS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITEMCLASSType(ITEMCLASSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITSVALUES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITSVALUES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITSVALUESType(ITSVALUESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KEYWORDLABEL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KEYWORDLABEL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKEYWORDLABELType(KEYWORDLABELType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KEYWORDREFERENCES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KEYWORDREFERENCES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKEYWORDREFERENCESType(KEYWORDREFERENCESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KEYWORD Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KEYWORD Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKEYWORDType(KEYWORDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LANGUAGE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LANGUAGE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLANGUAGEType(LANGUAGEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEVEL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEVEL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEVELType(LEVELType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEVELTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEVELTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEVELTYPEType(LEVELTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIBRARYIIMIDENTIFICATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIBRARYIIMIDENTIFICATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIBRARYIIMIDENTIFICATIONType(LIBRARYIIMIDENTIFICATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIBRARYINSTANDARDFORMAT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIBRARYINSTANDARDFORMAT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIBRARYINSTANDARDFORMATType(LIBRARYINSTANDARDFORMATType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIBRARY Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIBRARY Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIBRARYType(LIBRARYType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LISTTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LISTTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLISTTYPEType(LISTTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAPPINGFUNCTION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAPPINGFUNCTION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAPPINGFUNCTIONType(MAPPINGFUNCTIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MATHEMATICALSTRING Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MATHEMATICALSTRING Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMATHEMATICALSTRINGType(MATHEMATICALSTRINGType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MESSAGE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MESSAGE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMESSAGEType(MESSAGEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAMEDTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAMEDTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNAMEDTYPEType(NAMEDTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAMEDUNIT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAMEDUNIT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNAMEDUNITType(NAMEDUNITType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONDEPENDENTPDET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONDEPENDENTPDET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONDEPENDENTPDETType(NONDEPENDENTPDETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONINSTANTIABLEFUNCTIONALVIEWCLASS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONINSTANTIABLEFUNCTIONALVIEWCLASS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONINSTANTIABLEFUNCTIONALVIEWCLASSType(NONINSTANTIABLEFUNCTIONALVIEWCLASSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONQUANTITATIVECODETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONQUANTITATIVECODETYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONQUANTITATIVECODETYPEType(NONQUANTITATIVECODETYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONQUANTITATIVEINTTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONQUANTITATIVEINTTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONQUANTITATIVEINTTYPEType(NONQUANTITATIVEINTTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONSIUNIT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONSIUNIT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONSIUNITType(NONSIUNITType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONTRANSLATABLESTRINGTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONTRANSLATABLESTRINGTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONTRANSLATABLESTRINGTYPEType(NONTRANSLATABLESTRINGTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NUMBERTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NUMBERTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUMBERTYPEType(NUMBERTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ONTOML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ONTOML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseONTOMLType(ONTOMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORGANIZATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORGANIZATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORGANIZATIONType(ORGANIZATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PERSON Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PERSON Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePERSONType(PERSONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PLACEMENTTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PLACEMENTTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePLACEMENTTYPEType(PLACEMENTTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POSTCONDITION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POSTCONDITION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOSTCONDITIONType(POSTCONDITIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRECONDITION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRECONDITION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRECONDITIONType(PRECONDITIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PREFERREDNAMELABEL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PREFERREDNAMELABEL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePREFERREDNAMELABELType(PREFERREDNAMELABELType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PREFERREDNAME Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PREFERREDNAME Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePREFERREDNAMEType(PREFERREDNAMEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROGRAMREFERENCETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROGRAMREFERENCETYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROGRAMREFERENCETYPEType(PROGRAMREFERENCETYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTIESREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTIESREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTIESREFERENCEType(PROPERTIESREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYCLASSIFICATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYCLASSIFICATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYCLASSIFICATIONType(PROPERTYCLASSIFICATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYCONSTRAINTType(PROPERTYCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYMAPPING Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYMAPPING Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYMAPPINGType(PROPERTYMAPPINGType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYREFERENCEType(PROPERTYREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTY Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTY Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYType(PROPERTYType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYVALUERECOMMENDEDPRESENTATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYVALUERECOMMENDEDPRESENTATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYVALUERECOMMENDEDPRESENTATIONType(PROPERTYVALUERECOMMENDEDPRESENTATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RANGECONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RANGECONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRANGECONSTRAINTType(RANGECONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RATIONALMEASURETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RATIONALMEASURETYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRATIONALMEASURETYPEType(RATIONALMEASURETYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RATIONALTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RATIONALTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRATIONALTYPEType(RATIONALTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REALCURRENCYTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REALCURRENCYTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREALCURRENCYTYPEType(REALCURRENCYTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REALMEASURETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REALMEASURETYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREALMEASURETYPEType(REALMEASURETYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REALTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REALTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREALTYPEType(REALTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RECOMMENDEDPRESENTATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RECOMMENDEDPRESENTATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRECOMMENDEDPRESENTATIONType(RECOMMENDEDPRESENTATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REFERENCEDDOCUMENT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REFERENCEDDOCUMENT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREFERENCEDDOCUMENTType(REFERENCEDDOCUMENTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REFERENCEDGRAPHICS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REFERENCEDGRAPHICS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREFERENCEDGRAPHICSType(REFERENCEDGRAPHICSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REMOTELOCATIONS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REMOTELOCATIONS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREMOTELOCATIONSType(REMOTELOCATIONSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteLocationType(RemoteLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REPRESENTATIONPDET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REPRESENTATIONPDET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREPRESENTATIONPDETType(REPRESENTATIONPDETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REPRESENTATIONREFERENCETYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REPRESENTATIONREFERENCETYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREPRESENTATIONREFERENCETYPEType(REPRESENTATIONREFERENCETYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REUSABLEKEYWORD Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REUSABLEKEYWORD Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREUSABLEKEYWORDType(REUSABLEKEYWORDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REUSABLENAME Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REUSABLENAME Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREUSABLENAMEType(REUSABLENAMEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REUSABLESYNONYM Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REUSABLESYNONYM Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREUSABLESYNONYMType(REUSABLESYNONYMType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SETTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SETTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSETTYPEType(SETTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SETWITHSUBSETCONSTRAINTTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SETWITHSUBSETCONSTRAINTTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSETWITHSUBSETCONSTRAINTTYPEType(SETWITHSUBSETCONSTRAINTTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SHORTNAMELABEL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SHORTNAMELABEL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSHORTNAMELABELType(SHORTNAMELABELType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SHORTNAME Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SHORTNAME Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSHORTNAMEType(SHORTNAMEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIUNIT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIUNIT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSIUNITType(SIUNITType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOURCEDOCUMENT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOURCEDOCUMENT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOURCEDOCUMENTType(SOURCEDOCUMENTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGDICVALUE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGDICVALUE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGDICVALUEType(STRINGDICVALUEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGPATTERNCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGPATTERNCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGPATTERNCONSTRAINTType(STRINGPATTERNCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGSIZECONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGSIZECONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGSIZECONSTRAINTType(STRINGSIZECONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGSType(STRINGSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGTYPEType(STRINGTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUBCLASSCONSTRAINT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUBCLASSCONSTRAINT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUBCLASSCONSTRAINTType(SUBCLASSCONSTRAINTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUBSET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUBSET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUBSETType(SUBSETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUPPLIERREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUPPLIERREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUPPLIERREFERENCEType(SUPPLIERREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUPPLIERSREFERENCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUPPLIERSREFERENCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUPPLIERSREFERENCEType(SUPPLIERSREFERENCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUPPLIER Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUPPLIER Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUPPLIERType(SUPPLIERType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUPPORTEDVEP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUPPORTEDVEP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUPPORTEDVEPType(SUPPORTEDVEPType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SYNONYMOUSNAMELABEL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYNONYMOUSNAMELABEL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYNONYMOUSNAMELABELType(SYNONYMOUSNAMELABELType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SYNONYMOUSNAME Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYNONYMOUSNAME Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYNONYMOUSNAMEType(SYNONYMOUSNAMEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SYNONYMOUSSYMBOLS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYNONYMOUSSYMBOLS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYNONYMOUSSYMBOLSType(SYNONYMOUSSYMBOLSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SYNONYMREFERENCES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYNONYMREFERENCES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYNONYMREFERENCESType(SYNONYMREFERENCESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEXT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEXT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEXTType(TEXTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIMEDATATYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIMEDATATYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIMEDATATYPEType(TIMEDATATYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRANSLATABLESTRINGTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRANSLATABLESTRINGTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRANSLATABLESTRINGTYPEType(TRANSLATABLESTRINGTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRANSLATIONDATA Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRANSLATIONDATA Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRANSLATIONDATAType(TRANSLATIONDATAType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRANSLATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRANSLATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRANSLATIONType(TRANSLATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UNIT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UNIT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUNITType(UNITType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URITYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URITYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURITYPEType(URITYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCVRANGE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCVRANGE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCVRANGEType(VCVRANGEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VIEWCONTROLVARIABLERANGE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VIEWCONTROLVARIABLERANGE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVIEWCONTROLVARIABLERANGEType(VIEWCONTROLVARIABLERANGEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VIEWEXCHANGEPROTOCOLIDENTIFICATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VIEWEXCHANGEPROTOCOLIDENTIFICATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVIEWEXCHANGEPROTOCOLIDENTIFICATIONType(VIEWEXCHANGEPROTOCOLIDENTIFICATIONType object) {
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

} //OntomlSwitch
