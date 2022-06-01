package fr.cs.ontoeventb.core.ontoml2pm;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import fr.cs.ontoeventb.pivotmodel.DSLStandaloneSetup;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.*;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.util.OntomlResourceFactoryImpl;
import pivotmodel.*;

public class OntoMLModelApi {

	private static ONTOMLType ontoMlOntology = null;
	private static Ontology pmOntology = null;
	private static int nbEnumeratedDataDefinition = 0;

	/*************************************
	 * renvoyer le modèle pivot obtenu
	 * 
	 * @return Ontology
	 **************************************/
	public static Ontology getOntology() {
		return OntoMLModelApi.pmOntology;
	}

	/***********************************
	 * Lire une ontology OntoML
	 * 
	 * @param IFile
	 *            file
	 * @return ONTOMLType
	 ************************************/
	public static void readOntoMLlFile(IFile file) {

		OntoMLModelApi.ontoMlOntology = null;
		OntoMLModelApi.nbEnumeratedDataDefinition = 0;

		try {
			String uri = file.getFullPath().toString();

			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",
					new OntomlResourceFactoryImpl());
			Resource resource = resourceSet.getResource(URI.createURI(uri), true);

			EObject root = resource.getContents().get(0);
			if (root instanceof DocumentRoot) {
				OntoMLModelApi.ontoMlOntology = ((DocumentRoot) root).getOntoml();
			}

		} catch (Exception e) {
			OntoMLModelApi.ontoMlOntology = null;
			e.printStackTrace();
		}
	}

	/********************************************************
	 * Convertir un modèle OntoML vers une ontologie Pivot
	 * 
	 * @param name
	 **********************************************************/
	public static void OntoMLToPmOntology(String name) {
		OntoMLModelApi.pmOntology = null;

		DSLStandaloneSetup.doSetup();
		OntoMLModelApi.pmOntology = PivotmodelFactory.eINSTANCE.createOntology();
		OntoMLModelApi.pmOntology.setName(name);

		OntoMLModelApi.computeProperties();
		OntoMLModelApi.computeClasses();

	}

	/*********************************************
	 * Traitement de toutes les classes OntoML
	 **********************************************/
	public static void computeClasses() {

		for (CLASSType ontClass : OntoMLModelApi.ontoMlOntology.getDictionary().getContainedClasses().getClass_())
			if (OntoMLModelApi.classIsTreated(ontClass) == null)
				OntoMLModelApi.createNewClass(ontClass);
	}

	/***********************************************
	 * Traitement de toutes les proprietes OntoML
	 **********************************************/
	public static void computeProperties() {
		for (PROPERTYType ontProperty : OntoMLModelApi.ontoMlOntology.getDictionary().getContainedProperties()
				.getProperty())
			if (OntoMLModelApi.propertyIsTreated(ontProperty) == null)
				OntoMLModelApi.createNewProperty(ontProperty);
	}

	/*****************************************************************
	 * Création d'une ClassDefinition à partir d'une classe OntoML
	 * 
	 * @param CLASSType
	 *            ontClass
	 * @return ClassDefinition
	 *****************************************************************/
	public static ClassDefinition createNewClass(CLASSType ontClass) {

		ClassDefinition classDefinition;
		String name = "C" + OntoMLModelApi.computeOntoMlName(ontClass.getPreferredName().getLabel().get(1).getValue());

		// ITEM_CLASS_Type
		if (ontClass instanceof ITEMCLASSType) {
			//ITEMCLASSType oc = (ITEMCLASSType) ontClass;
			classDefinition = PivotmodelFactory.eINSTANCE.createSimpleClass();
			classDefinition.setName(name);
			OntoMLModelApi.pmOntology.getContainedClasses().add(classDefinition);
			// TODO sub_class_properties of ITEM_CLASS_Type
		}
		// TODO CATEGORIZATION_ CLASS_Type
		// ITEM_CLASS_CASE_OF_Type
		else if (ontClass instanceof ITEMCLASSCASEOFType) {
			ITEMCLASSCASEOFType oc = (ITEMCLASSCASEOFType) ontClass;
			classDefinition = PivotmodelFactory.eINSTANCE.createCaseOfClass();
			classDefinition.setName(name);
			OntoMLModelApi.pmOntology.getContainedClasses().add(classDefinition);

			for (CLASSREFERENCEType c : oc.getIsCaseOf().getClass_()) {
				String classId = c.getClassRef();
				CLASSType cc = OntoMLModelApi.getClassOfId(classId);
				if (cc != null) {
					ClassDefinition newClass = classIsTreated(cc);
					if (newClass == null)
						newClass = OntoMLModelApi.createNewClass(cc);
					((CaseOfClass) classDefinition).getCaseOf().add(newClass);
				}
				// TODO imported_properties of ITEM_CLASS_CASE_OF_Type
				// TODO sub_class_properties of ITEM_CLASS_CASE_OF_Type
			}
		}
		// TODO Others CLASS_Type
		// default
		else {
			classDefinition = PivotmodelFactory.eINSTANCE.createSimpleClass();
			classDefinition.setName(name);
			OntoMLModelApi.pmOntology.getContainedClasses().add(classDefinition);
		}

		// traitement de la relation described_by
		if (ontClass.getDescribedBy() != null) {
			for (PROPERTYREFERENCEType prop : ontClass.getDescribedBy().getProperty()) {
				String propId = prop.getPropertyRef();
				PROPERTYType pp = OntoMLModelApi.getPropertyOfId(propId);
				if (pp != null) {
					PropertyDefinition newProperty = OntoMLModelApi.propertyIsTreated(pp);
					if (newProperty == null)
						newProperty = OntoMLModelApi.createNewProperty(pp);
					classDefinition.getDescribedBy().add(newProperty);
				}
			}
		}
		// traitement de la relation its_superclass
		if (ontClass.getItsSuperclass() != null) {
			String classId = ontClass.getItsSuperclass().getClassRef();
			CLASSType cc = OntoMLModelApi.getClassOfId(classId);
			if (cc != null) {
				ClassDefinition newClass = OntoMLModelApi.classIsTreated(cc);
				if (newClass == null)
					newClass = OntoMLModelApi.createNewClass(cc);
				classDefinition.getSubClassOf().add(newClass);
			}
		}

		return classDefinition;
	}

	/******************************************************
	 * Renvoyée la CLASSType d'une référence OntoML
	 * 
	 * @param String
	 *            id
	 * @return CLASSType
	 *******************************************************/
	public static CLASSType getClassOfId(String id) {

		for (CLASSType ontoC : OntoMLModelApi.ontoMlOntology.getDictionary().getContainedClasses().getClass_()) {
			if (id.equals(ontoC.getId())) {
				return ontoC;
			}
		}
		return null;
	}

	/**********************************************************
	 * Générer un nom pour une entité à partir d'une phrase
	 * 
	 * @param String
	 *            name
	 * @return String
	 ***********************************************************/
	public static String computeOntoMlName(String name) {
		name = name.replaceAll("[^a-zA-Z0-9 ]", "");
		String[] allName = name.split(" ");
		String result = "";
		for (String s : allName) {
			if (s.length() > 0)
				result += s.substring(0, 1).toUpperCase() + s.substring(1);
		}
		return result;
	}

	/*******************************************
	 * Vérifier si ontClass a déjà été traitée
	 * 
	 * @param CLASSType
	 *            ontClass
	 * @return ClassDefinition
	 ********************************************/
	public static ClassDefinition classIsTreated(CLASSType ontClass) {

		for (ClassDefinition cd : OntoMLModelApi.pmOntology.getContainedClasses())
			if (cd.getName().equals(
					"C" + OntoMLModelApi.computeOntoMlName(ontClass.getPreferredName().getLabel().get(1).getValue())))
				return cd;

		return null;
	}

	/*******************************************************************
	 * Créer une PropertyDefinition à partir d'une OntoML Property
	 * 
	 * @param PROPERTYType
	 *            ontProp
	 * @return PropertyDefinition
	 ********************************************************************/
	public static PropertyDefinition createNewProperty(PROPERTYType ontProp) {

		PropertyDefinition propertyDefinition;
		String name = "p" + OntoMLModelApi.computeOntoMlName(ontProp.getPreferredName().getLabel().get(1).getValue());

		// NON_DEPENDENT_P_DET_Type
		if (ontProp instanceof NONDEPENDENTPDETType) {
			propertyDefinition = PivotmodelFactory.eINSTANCE.createSimpleProperty();
			propertyDefinition.setName(name);
			OntoMLModelApi.pmOntology.getContainedProperties().add(propertyDefinition);
			DataTypeDefinition range = OntoMLModelApi.createNewDataType(ontProp.getDomain());
			if (range != null)
				propertyDefinition.setRange(range);
		}
		// TODO CONDITION_DET_Type
		// TODO DEPENDENT_ P_DET_Type
		// default
		else {
			propertyDefinition = PivotmodelFactory.eINSTANCE.createSimpleProperty();
			propertyDefinition.setName(name + "NoTreated");
			OntoMLModelApi.pmOntology.getContainedProperties().add(propertyDefinition);
		}

		return propertyDefinition;
	}

	/*****************************************************
	 * Vérifier si la propriété ontProp a déjà été traitée
	 * 
	 * @param PROPERTYType
	 *            ontProp
	 * @return PropertyDefinition
	 ******************************************************/
	public static PropertyDefinition propertyIsTreated(PROPERTYType ontProp) {

		for (PropertyDefinition pd : OntoMLModelApi.pmOntology.getContainedProperties())
			if (pd.getName().equals(
					"p" + OntoMLModelApi.computeOntoMlName(ontProp.getPreferredName().getLabel().get(1).getValue())))
				return pd;

		return null;
	}

	/********************************************
	 * Retrouver la propriete référencée par l'ID
	 * 
	 * @param String
	 *            id
	 * @return PROPERTYType
	 ********************************************/
	public static PROPERTYType getPropertyOfId(String id) {

		for (PROPERTYType ontoP : OntoMLModelApi.ontoMlOntology.getDictionary().getContainedProperties()
				.getProperty()) {
			if (id.equals(ontoP.getId())) {
				return ontoP;
			}
		}
		return null;
	}

	/************************************************************************
	 * Covertir un ANY_TYPE_Type d'OntoML à DataTypeDefinition de PM
	 * 
	 * @param ANYTYPEType
	 *            ontDataType
	 * @return DataTypeDefinition
	 ************************************************************************/
	public static DataTypeDefinition createNewDataType(ANYTYPEType ontDataType) {
		// BOOLEAN_TYPE_Type
		if (ontDataType instanceof BOOLEANTYPEType) {
			if (OntoMLModelApi.dataTypeIsTreated("TBoolean") != null)
				return OntoMLModelApi.dataTypeIsTreated("TBoolean");
			NotNumericType bool = PivotmodelFactory.eINSTANCE.createNotNumericType();
			bool.setName("TBoolean");
			bool.setBasedOn(PredefinedType.BOOLEAN);
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(bool);
			return bool;
		}
		// STRING_TYPE_Type
		else if (ontDataType instanceof STRINGTYPEType) {
			if (OntoMLModelApi.dataTypeIsTreated("TString") != null)
				return OntoMLModelApi.dataTypeIsTreated("TString");
			NotNumericType str = PivotmodelFactory.eINSTANCE.createNotNumericType();
			str.setName("TString");
			str.setBasedOn(PredefinedType.STRING);
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(str);
			return str;
		}
		// TRANSLATABLE _STRING_TYPE_Type
		else if (ontDataType instanceof TRANSLATABLESTRINGTYPEType) {
			if (OntoMLModelApi.dataTypeIsTreated("TranslatableString") != null)
				return OntoMLModelApi.dataTypeIsTreated("TranslatableString");
			NotNumericType str = PivotmodelFactory.eINSTANCE.createNotNumericType();
			str.setName("TranslatableString");
			str.setBasedOn(PredefinedType.STRING);
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(str);
			return str;
		}
		// TODO REMOTE_HTTP_ACCESS_TYPE_Type
		// NON_TRANSLATABLE _STRING_TYPE_Type
		else if (ontDataType instanceof NONTRANSLATABLESTRINGTYPEType) {
			if (OntoMLModelApi.dataTypeIsTreated("NonTranslatableString") != null)
				return OntoMLModelApi.dataTypeIsTreated("NonTranslatableString");
			NotNumericType str = PivotmodelFactory.eINSTANCE.createNotNumericType();
			str.setName("NonTranslatableString");
			str.setBasedOn(PredefinedType.STRING);
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(str);
			return str;
		}
		// NON_QUANTITATIVE _CODE_TYPE_Type
		else if (ontDataType instanceof NONQUANTITATIVECODETYPEType) {
			OntoMLModelApi.nbEnumeratedDataDefinition++;
			EnumeratedType et = PivotmodelFactory.eINSTANCE.createEnumeratedType();
			et.setName("EnumeratedData_" + OntoMLModelApi.nbEnumeratedDataDefinition);

			OntoMLModelApi.pmOntology.getContainedDataTypes().add(et);

			NotNumericType str = (NotNumericType) OntoMLModelApi.dataTypeIsTreated("TString");
			if (str == null) {
				str = PivotmodelFactory.eINSTANCE.createNotNumericType();
				str.setName("TString");
				str.setBasedOn(PredefinedType.STRING);
				OntoMLModelApi.pmOntology.getContainedDataTypes().add(str);
			}

			for (DICVALUEType s : ((NONQUANTITATIVECODETYPEType) ontDataType).getItsValues().getDicValue()) {
				String value = OntoMLModelApi
						.computeOntoMlName(((STRINGDICVALUEType) s).getPreferredName().getLabel().get(1).getValue());
				if (value.equals(""))
					value = OntoMLModelApi.computeOntoMlName(((STRINGDICVALUEType) s).getValueCode());
				SingleValue sv = (SingleValue) OntoMLModelApi.dataTypeIsTreated(value);
				if (OntoMLModelApi.dataTypeIsTreated(value) == null) {
					sv = PivotmodelFactory.eINSTANCE.createSingleValue();
					sv.setName(value);
					sv.setIsOfType(str);
					OntoMLModelApi.pmOntology.getContainedDataTypes().add(sv);
				}
				et.getContains().add(sv);
			}
			return et;
		}
		// NUMBER_TYPE_Type
		else if (ontDataType instanceof INTTYPEType) {
			if (OntoMLModelApi.dataTypeIsTreated("Number") != null)
				return OntoMLModelApi.dataTypeIsTreated("Number");
			NumericType integer = PivotmodelFactory.eINSTANCE.createNumericType();
			integer.setName("Number");
			integer.setBasedOn(PredefinedType.INTEGER);
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(integer);
			return integer;
		}
		// REAL_TYPE_Type
		else if (ontDataType instanceof REALTYPEType) {
			if (OntoMLModelApi.dataTypeIsTreated("Real") != null)
				return OntoMLModelApi.dataTypeIsTreated("Real");
			NumericType integer = PivotmodelFactory.eINSTANCE.createNumericType();
			integer.setName("Real");
			integer.setBasedOn(PredefinedType.INTEGER);
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(integer);
			return integer;
		}
		// INT_TYPE_Type
		else if (ontDataType instanceof INTTYPEType) {
			if (OntoMLModelApi.dataTypeIsTreated("TInteger") != null)
				return OntoMLModelApi.dataTypeIsTreated("TInteger");
			NumericType integer = PivotmodelFactory.eINSTANCE.createNumericType();
			integer.setName("TInteger");
			integer.setBasedOn(PredefinedType.INTEGER);
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(integer);
			return integer;
		}
		// REAL_CURRENCY _TYPE_Type and INT_CURRENCY _TYPE_Type
		else if (ontDataType instanceof REALCURRENCYTYPEType || ontDataType instanceof INTCURRENCYTYPEType) {
			String currencyName = "";
			if (ontDataType instanceof REALCURRENCYTYPEType)
				currencyName = ((REALCURRENCYTYPEType) ontDataType).getCurrency() + "_Currency";
			else
				currencyName = ((INTCURRENCYTYPEType) ontDataType).getCurrency() + "_Currency";

			if (OntoMLModelApi.dataTypeIsTreated(currencyName) != null)
				return OntoMLModelApi.dataTypeIsTreated(currencyName);

			CurrencyType currency = PivotmodelFactory.eINSTANCE.createCurrencyType();
			currency.setName(currencyName);
			currency.setBasedOn(PredefinedType.INTEGER);
			if (ontDataType instanceof REALCURRENCYTYPEType)
				currency.setCurrency(OntoMLModelApi.getCorrency(((REALCURRENCYTYPEType) ontDataType).getCurrency()));
			else
				currency.setCurrency(OntoMLModelApi.getCorrency(((INTCURRENCYTYPEType) ontDataType).getCurrency()));
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(currency);
			return currency;
		}
		// REAL_MEASURE _TYPE_Type and INT_MEASURE _TYPE_Type
		else if (ontDataType instanceof REALMEASURETYPEType || ontDataType instanceof INTMEASURETYPEType) {
			DICUNITType unitType;
			if (ontDataType instanceof REALMEASURETYPEType)
				unitType = ((REALMEASURETYPEType) ontDataType).getUnit();
			else
				unitType = ((INTMEASURETYPEType) ontDataType).getUnit();

			UnitType su;
			String measureName = "";
			// SI_UNIT_Type
			if (unitType.getStructuredRepresentation() instanceof SIUNITType) {
				if (((SIUNITType) unitType.getStructuredRepresentation()).getPrefix().getLiteral().equals(""))
					measureName = ((SIUNITType) unitType.getStructuredRepresentation()).getName().getLiteral()
							+ "_Measure";
				else
					measureName = ((SIUNITType) unitType.getStructuredRepresentation()).getPrefix().getLiteral() + "_"
							+ ((SIUNITType) unitType.getStructuredRepresentation()).getName().getLiteral() + "_Measure";
				su = PivotmodelFactory.eINSTANCE.createStandardUnit();
				((StandardUnit) su).setName(OntoMLModelApi
						.getUnitName(((SIUNITType) unitType.getStructuredRepresentation()).getName().getLiteral()));
				((StandardUnit) su).setPrefix(OntoMLModelApi
						.getPrefixe(((SIUNITType) unitType.getStructuredRepresentation()).getPrefix().getLiteral()));
			}
			// NON_SI_UNIT_Type
			else if (unitType.getStructuredRepresentation() instanceof NONSIUNITType) {
				measureName = ((NONSIUNITType) unitType.getStructuredRepresentation()).getName() + "_Measure";
				su = PivotmodelFactory.eINSTANCE.createNonStandardUnit();
				((NonStandardUnit) su).setName(((NONSIUNITType) unitType.getStructuredRepresentation()).getName());
			}
			// TODO CONVERSION_BASED_ UNIT_Type
			// TODO CONTEXT_DEPENDENT_ UNIT_Type
			// TODO DERIVED_UNIT_Type
			// default
			else {
				measureName = "UnknownUnit_Measure";
				su = PivotmodelFactory.eINSTANCE.createNamedUnit();
			}

			if (OntoMLModelApi.dataTypeIsTreated(measureName) != null)
				return OntoMLModelApi.dataTypeIsTreated(measureName);

			MeasureType measure = PivotmodelFactory.eINSTANCE.createMeasureType();
			measure.setBasedOn(PredefinedType.INTEGER);
			measure.setName(measureName);
			measure.setUnit(su);
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(measure);
			return measure;
		}
		// NON_QUANTITATIVE _INT_TYPE_Type
		else if (ontDataType instanceof NONQUANTITATIVEINTTYPEType) {
			OntoMLModelApi.nbEnumeratedDataDefinition++;
			NumberEnumeratedType et = PivotmodelFactory.eINSTANCE.createNumberEnumeratedType();
			et.setName("EnumeratedData_" + OntoMLModelApi.nbEnumeratedDataDefinition);

			OntoMLModelApi.pmOntology.getContainedDataTypes().add(et);

			for (DICVALUEType s : ((NONQUANTITATIVECODETYPEType) ontDataType).getItsValues().getDicValue()) {
				int value = ((INTDICVALUEType) s).getValueCode().intValue();
				et.getContains().add(value);
			}
			return et;
		}
		// TODO BAG_Type
		// TODO SET_Type
		// TODO LIST_Type
		// TODO ARRAY_Type
		// TODO SET_WITH_SUBSET_ CONSTRAINT_ TYPE_Type
		// CLASS_INSTANCE _TYPE_Type
		else if (ontDataType instanceof CLASSREFERENCETYPEType) {
			CLASSType ontClass = OntoMLModelApi
					.getClassOfId(((CLASSREFERENCETYPEType) ontDataType).getDomain().getClassRef());

			if (ontClass != null) {
				ClassDefinition classDefinition = OntoMLModelApi.classIsTreated(ontClass);
				if (classDefinition == null)
					classDefinition = OntoMLModelApi.createNewClass(ontClass);
				String name = "T" + classDefinition.getName();

				if (OntoMLModelApi.dataTypeIsTreated(name) != null)
					return OntoMLModelApi.dataTypeIsTreated(name);

				ClassType data = PivotmodelFactory.eINSTANCE.createClassType();
				data.setName(name);
				data.setBasedOn(classDefinition);
				OntoMLModelApi.pmOntology.getContainedDataTypes().add(data);

				return data;
			}
			return null;
		}
		// TODO LEVEL_TYPE_Type
		// TODO NAMED_TYPE_Type
		// default NotTreatedType data type is returned
		else {
			if (OntoMLModelApi.dataTypeIsTreated("NotTreatedType") != null)
				return OntoMLModelApi.dataTypeIsTreated("NotTreatedType");
			NotNumericType str = PivotmodelFactory.eINSTANCE.createNotNumericType();
			str.setName("NotTreatedType");
			str.setBasedOn(PredefinedType.STRING);
			OntoMLModelApi.pmOntology.getContainedDataTypes().add(str);
			return str;
		}
	}

	/***************************************************************************
	 * Renvoyer le DataTypeDefinition correspondant à ontData si déjà traitée
	 * 
	 * @param String
	 *            ontData
	 * @return DataTypeDefinition
	 ***************************************************************************/
	public static DataTypeDefinition dataTypeIsTreated(String ontData) {

		for (DataTypeDefinition dd : OntoMLModelApi.pmOntology.getContainedDataTypes())
			if (dd.getName().equals(ontData))
				return dd;

		return null;
	}

	/*****************************************************
	 * Renvoyer le type Currency correspondant au code
	 * 
	 * @param String
	 *            code
	 * @return PredefinedCurrency
	 *****************************************************/
	public static PredefinedCurrency getCorrency(String code) {
		if ("EUR".equals(code))
			return PredefinedCurrency.EUR;
		else if ("USD".equals(code))
			return PredefinedCurrency.USD;
		else if ("CHF".equals(code))
			return PredefinedCurrency.CHF;
		else if ("CNY".equals(code))
			return PredefinedCurrency.CNY;
		else if ("JPY".equals(code))
			return PredefinedCurrency.JPY;
		else if ("SUR".equals(code))
			return PredefinedCurrency.SUR;
		return PredefinedCurrency.EUR;
	}

	/**************************************************
	 * Renvoyer l'UnitName correspondat au code
	 * 
	 * @param String
	 *            code
	 * @return UnitName
	 ***************************************************/
	public static UnitName getUnitName(String code) {
		if ("METRE".equals(code))
			return UnitName.METRE;
		else if ("GRAM".equals(code))
			return UnitName.GRAM;
		else if ("SECOND".equals(code))
			return UnitName.SECOND;
		else if ("AMPERE".equals(code))
			return UnitName.AMPERE;
		else if ("KELVIN".equals(code))
			return UnitName.KELVIN;
		else if ("MOLE".equals(code))
			return UnitName.MOLE;
		else if ("CANDELA".equals(code))
			return UnitName.CANDELA;
		else if ("RADIAN".equals(code))
			return UnitName.RADIAN;
		else if ("STERADIAN".equals(code))
			return UnitName.STERADIAN;
		else if ("HERTZ".equals(code))
			return UnitName.HERTZ;
		else if ("NEWTON".equals(code))
			return UnitName.NEWTON;
		else if ("PASCAL".equals(code))
			return UnitName.PASCAL;
		else if ("JOULE".equals(code))
			return UnitName.JOULE;
		else if ("WATT".equals(code))
			return UnitName.WATT;
		else if ("COULOMB".equals(code))
			return UnitName.COULOMB;
		else if ("VOLT".equals(code))
			return UnitName.VOLT;
		else if ("FARAD".equals(code))
			return UnitName.FARAD;
		else if ("OHM".equals(code))
			return UnitName.OHM;
		else if ("SIEMENS".equals(code))
			return UnitName.SIEMENS;
		else if ("WEBER".equals(code))
			return UnitName.WEBER;
		else if ("TESLA".equals(code))
			return UnitName.TESLA;
		else if ("HENRY".equals(code))
			return UnitName.HENRY;
		else if ("DEGREE_CELSIUS".equals(code))
			return UnitName.DEGREE_CELSIUS;
		else if ("LUMEN".equals(code))
			return UnitName.LUMEN;
		else if ("LUX".equals(code))
			return UnitName.LUX;
		else if ("BECQUEREL".equals(code))
			return UnitName.BECQUEREL;
		else if ("GRAY".equals(code))
			return UnitName.GRAY;
		else if ("SIEVERT".equals(code))
			return UnitName.SIEVERT;
		return UnitName.METRE;
	}

	/*****************************************************
	 * Renvoyer le PrefixeType correspondat au code
	 * 
	 * @param String
	 *            code
	 * @return PrefixeType
	 *******************************************************/
	public static PrefixeType getPrefixe(String code) {

		if ("EXA".equals(code))
			return PrefixeType.EXA;
		else if ("PETA".equals(code))
			return PrefixeType.PETA;
		else if ("TERA".equals(code))
			return PrefixeType.TERA;
		else if ("GIGA".equals(code))
			return PrefixeType.GIGA;
		else if ("MEGA".equals(code))
			return PrefixeType.MEGA;
		else if ("KILO".equals(code))
			return PrefixeType.KILO;
		else if ("HECTO".equals(code))
			return PrefixeType.HECTO;
		else if ("DECA".equals(code))
			return PrefixeType.DECA;
		else if ("DECI".equals(code))
			return PrefixeType.DECI;
		else if ("CENTI".equals(code))
			return PrefixeType.CENTI;
		else if ("MILLI".equals(code))
			return PrefixeType.MILLI;
		else if ("MICRO".equals(code))
			return PrefixeType.MICRO;
		else if ("NANO".equals(code))
			return PrefixeType.NANO;
		else if ("PICO".equals(code))
			return PrefixeType.PICO;
		else if ("FEMTO".equals(code))
			return PrefixeType.FEMTO;
		else if ("ATTO".equals(code))
			return PrefixeType.ATTO;
		return PrefixeType.KILO;
	}
}
