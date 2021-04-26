/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICVALUEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DocumentRoot;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLEKEYWORDType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REUSABLESYNONYMType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getAPosterioriSemanticRelationship <em>APosteriori Semantic Relationship</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getDicUnit <em>Dic Unit</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getDicValue <em>Dic Value</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getOntoml <em>Ontoml</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DocumentRootImpl#getSynonym <em>Synonym</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OntomlPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OntomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OntomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORISEMANTICRELATIONSHIPType getAPosterioriSemanticRelationship() {
		return (APOSTERIORISEMANTICRELATIONSHIPType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_APosterioriSemanticRelationship(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPosterioriSemanticRelationship(APOSTERIORISEMANTICRELATIONSHIPType newAPosterioriSemanticRelationship, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_APosterioriSemanticRelationship(), newAPosterioriSemanticRelationship, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPosterioriSemanticRelationship(APOSTERIORISEMANTICRELATIONSHIPType newAPosterioriSemanticRelationship) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_APosterioriSemanticRelationship(), newAPosterioriSemanticRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSType getClass_() {
		return (CLASSType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_Class(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(CLASSType newClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_Class(), newClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(CLASSType newClass) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_Class(), newClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTType getConstraint() {
		return (CONSTRAINTType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_Constraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(CONSTRAINTType newConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_Constraint(), newConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(CONSTRAINTType newConstraint) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_Constraint(), newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEType getDatatype() {
		return (DATATYPEType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_Datatype(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DATATYPEType newDatatype, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_Datatype(), newDatatype, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DATATYPEType newDatatype) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_Datatype(), newDatatype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITType getDicUnit() {
		return (DICUNITType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_DicUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDicUnit(DICUNITType newDicUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_DicUnit(), newDicUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDicUnit(DICUNITType newDicUnit) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_DicUnit(), newDicUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICVALUEType getDicValue() {
		return (DICVALUEType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_DicValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDicValue(DICVALUEType newDicValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_DicValue(), newDicValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDicValue(DICVALUEType newDicValue) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_DicValue(), newDicValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTType getDocument() {
		return (DOCUMENTType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_Document(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(DOCUMENTType newDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_Document(), newDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(DOCUMENTType newDocument) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_Document(), newDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REUSABLEKEYWORDType getKeyword() {
		return (REUSABLEKEYWORDType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_Keyword(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyword(REUSABLEKEYWORDType newKeyword, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_Keyword(), newKeyword, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(REUSABLEKEYWORDType newKeyword) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_Keyword(), newKeyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ONTOMLType getOntoml() {
		return (ONTOMLType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_Ontoml(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntoml(ONTOMLType newOntoml, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_Ontoml(), newOntoml, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntoml(ONTOMLType newOntoml) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_Ontoml(), newOntoml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYType getProperty() {
		return (PROPERTYType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_Property(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PROPERTYType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_Property(), newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(PROPERTYType newProperty) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_Property(), newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERType getSupplier() {
		return (SUPPLIERType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_Supplier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(SUPPLIERType newSupplier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_Supplier(), newSupplier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(SUPPLIERType newSupplier) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_Supplier(), newSupplier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REUSABLESYNONYMType getSynonym() {
		return (REUSABLESYNONYMType)getMixed().get(OntomlPackage.eINSTANCE.getDocumentRoot_Synonym(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynonym(REUSABLESYNONYMType newSynonym, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OntomlPackage.eINSTANCE.getDocumentRoot_Synonym(), newSynonym, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynonym(REUSABLESYNONYMType newSynonym) {
		((FeatureMap.Internal)getMixed()).set(OntomlPackage.eINSTANCE.getDocumentRoot_Synonym(), newSynonym);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OntomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case OntomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case OntomlPackage.DOCUMENT_ROOT__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				return basicSetAPosterioriSemanticRelationship(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__CLASS:
				return basicSetClass(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__CONSTRAINT:
				return basicSetConstraint(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__DATATYPE:
				return basicSetDatatype(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__DIC_UNIT:
				return basicSetDicUnit(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__DIC_VALUE:
				return basicSetDicValue(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__DOCUMENT:
				return basicSetDocument(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__KEYWORD:
				return basicSetKeyword(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__ONTOML:
				return basicSetOntoml(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case OntomlPackage.DOCUMENT_ROOT__SYNONYM:
				return basicSetSynonym(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OntomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case OntomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case OntomlPackage.DOCUMENT_ROOT__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				return getAPosterioriSemanticRelationship();
			case OntomlPackage.DOCUMENT_ROOT__CLASS:
				return getClass_();
			case OntomlPackage.DOCUMENT_ROOT__CONSTRAINT:
				return getConstraint();
			case OntomlPackage.DOCUMENT_ROOT__DATATYPE:
				return getDatatype();
			case OntomlPackage.DOCUMENT_ROOT__DIC_UNIT:
				return getDicUnit();
			case OntomlPackage.DOCUMENT_ROOT__DIC_VALUE:
				return getDicValue();
			case OntomlPackage.DOCUMENT_ROOT__DOCUMENT:
				return getDocument();
			case OntomlPackage.DOCUMENT_ROOT__KEYWORD:
				return getKeyword();
			case OntomlPackage.DOCUMENT_ROOT__ONTOML:
				return getOntoml();
			case OntomlPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case OntomlPackage.DOCUMENT_ROOT__SUPPLIER:
				return getSupplier();
			case OntomlPackage.DOCUMENT_ROOT__SYNONYM:
				return getSynonym();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntomlPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				setAPosterioriSemanticRelationship((APOSTERIORISEMANTICRELATIONSHIPType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__CLASS:
				setClass((CLASSType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__CONSTRAINT:
				setConstraint((CONSTRAINTType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__DATATYPE:
				setDatatype((DATATYPEType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__DIC_UNIT:
				setDicUnit((DICUNITType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__DIC_VALUE:
				setDicValue((DICVALUEType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__DOCUMENT:
				setDocument((DOCUMENTType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword((REUSABLEKEYWORDType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__ONTOML:
				setOntoml((ONTOMLType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PROPERTYType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__SUPPLIER:
				setSupplier((SUPPLIERType)newValue);
				return;
			case OntomlPackage.DOCUMENT_ROOT__SYNONYM:
				setSynonym((REUSABLESYNONYMType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OntomlPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case OntomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case OntomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case OntomlPackage.DOCUMENT_ROOT__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				setAPosterioriSemanticRelationship((APOSTERIORISEMANTICRELATIONSHIPType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__CLASS:
				setClass((CLASSType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__CONSTRAINT:
				setConstraint((CONSTRAINTType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__DATATYPE:
				setDatatype((DATATYPEType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__DIC_UNIT:
				setDicUnit((DICUNITType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__DIC_VALUE:
				setDicValue((DICVALUEType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__DOCUMENT:
				setDocument((DOCUMENTType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword((REUSABLEKEYWORDType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__ONTOML:
				setOntoml((ONTOMLType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PROPERTYType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__SUPPLIER:
				setSupplier((SUPPLIERType)null);
				return;
			case OntomlPackage.DOCUMENT_ROOT__SYNONYM:
				setSynonym((REUSABLESYNONYMType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OntomlPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OntomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case OntomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case OntomlPackage.DOCUMENT_ROOT__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				return getAPosterioriSemanticRelationship() != null;
			case OntomlPackage.DOCUMENT_ROOT__CLASS:
				return getClass_() != null;
			case OntomlPackage.DOCUMENT_ROOT__CONSTRAINT:
				return getConstraint() != null;
			case OntomlPackage.DOCUMENT_ROOT__DATATYPE:
				return getDatatype() != null;
			case OntomlPackage.DOCUMENT_ROOT__DIC_UNIT:
				return getDicUnit() != null;
			case OntomlPackage.DOCUMENT_ROOT__DIC_VALUE:
				return getDicValue() != null;
			case OntomlPackage.DOCUMENT_ROOT__DOCUMENT:
				return getDocument() != null;
			case OntomlPackage.DOCUMENT_ROOT__KEYWORD:
				return getKeyword() != null;
			case OntomlPackage.DOCUMENT_ROOT__ONTOML:
				return getOntoml() != null;
			case OntomlPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case OntomlPackage.DOCUMENT_ROOT__SUPPLIER:
				return getSupplier() != null;
			case OntomlPackage.DOCUMENT_ROOT__SYNONYM:
				return getSynonym() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
