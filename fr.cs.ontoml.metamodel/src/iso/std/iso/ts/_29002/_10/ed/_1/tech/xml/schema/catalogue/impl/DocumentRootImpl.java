/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.DocumentRoot;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType;

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
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl#getCatalogue <em>Catalogue</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl#getItem <em>Item</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.DocumentRootImpl#getReference <em>Reference</em>}</li>
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
		return CataloguePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CataloguePackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CataloguePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CataloguePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueType getCatalogue() {
		return (CatalogueType)getMixed().get(CataloguePackage.Literals.DOCUMENT_ROOT__CATALOGUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogue(CatalogueType newCatalogue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CataloguePackage.Literals.DOCUMENT_ROOT__CATALOGUE, newCatalogue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogue(CatalogueType newCatalogue) {
		((FeatureMap.Internal)getMixed()).set(CataloguePackage.Literals.DOCUMENT_ROOT__CATALOGUE, newCatalogue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItem() {
		return (ItemType)getMixed().get(CataloguePackage.Literals.DOCUMENT_ROOT__ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(ItemType newItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CataloguePackage.Literals.DOCUMENT_ROOT__ITEM, newItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(ItemType newItem) {
		((FeatureMap.Internal)getMixed()).set(CataloguePackage.Literals.DOCUMENT_ROOT__ITEM, newItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueType getPropertyValue() {
		return (PropertyValueType)getMixed().get(CataloguePackage.Literals.DOCUMENT_ROOT__PROPERTY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyValue(PropertyValueType newPropertyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CataloguePackage.Literals.DOCUMENT_ROOT__PROPERTY_VALUE, newPropertyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyValue(PropertyValueType newPropertyValue) {
		((FeatureMap.Internal)getMixed()).set(CataloguePackage.Literals.DOCUMENT_ROOT__PROPERTY_VALUE, newPropertyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getReference() {
		return (ReferenceType)getMixed().get(CataloguePackage.Literals.DOCUMENT_ROOT__REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType newReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CataloguePackage.Literals.DOCUMENT_ROOT__REFERENCE, newReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ReferenceType newReference) {
		((FeatureMap.Internal)getMixed()).set(CataloguePackage.Literals.DOCUMENT_ROOT__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CataloguePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CataloguePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CataloguePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CataloguePackage.DOCUMENT_ROOT__CATALOGUE:
				return basicSetCatalogue(null, msgs);
			case CataloguePackage.DOCUMENT_ROOT__ITEM:
				return basicSetItem(null, msgs);
			case CataloguePackage.DOCUMENT_ROOT__PROPERTY_VALUE:
				return basicSetPropertyValue(null, msgs);
			case CataloguePackage.DOCUMENT_ROOT__REFERENCE:
				return basicSetReference(null, msgs);
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
			case CataloguePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CataloguePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CataloguePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CataloguePackage.DOCUMENT_ROOT__CATALOGUE:
				return getCatalogue();
			case CataloguePackage.DOCUMENT_ROOT__ITEM:
				return getItem();
			case CataloguePackage.DOCUMENT_ROOT__PROPERTY_VALUE:
				return getPropertyValue();
			case CataloguePackage.DOCUMENT_ROOT__REFERENCE:
				return getReference();
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
			case CataloguePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CataloguePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CataloguePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CataloguePackage.DOCUMENT_ROOT__CATALOGUE:
				setCatalogue((CatalogueType)newValue);
				return;
			case CataloguePackage.DOCUMENT_ROOT__ITEM:
				setItem((ItemType)newValue);
				return;
			case CataloguePackage.DOCUMENT_ROOT__PROPERTY_VALUE:
				setPropertyValue((PropertyValueType)newValue);
				return;
			case CataloguePackage.DOCUMENT_ROOT__REFERENCE:
				setReference((ReferenceType)newValue);
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
			case CataloguePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CataloguePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CataloguePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CataloguePackage.DOCUMENT_ROOT__CATALOGUE:
				setCatalogue((CatalogueType)null);
				return;
			case CataloguePackage.DOCUMENT_ROOT__ITEM:
				setItem((ItemType)null);
				return;
			case CataloguePackage.DOCUMENT_ROOT__PROPERTY_VALUE:
				setPropertyValue((PropertyValueType)null);
				return;
			case CataloguePackage.DOCUMENT_ROOT__REFERENCE:
				setReference((ReferenceType)null);
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
			case CataloguePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CataloguePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CataloguePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CataloguePackage.DOCUMENT_ROOT__CATALOGUE:
				return getCatalogue() != null;
			case CataloguePackage.DOCUMENT_ROOT__ITEM:
				return getItem() != null;
			case CataloguePackage.DOCUMENT_ROOT__PROPERTY_VALUE:
				return getPropertyValue() != null;
			case CataloguePackage.DOCUMENT_ROOT__REFERENCE:
				return getReference() != null;
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
