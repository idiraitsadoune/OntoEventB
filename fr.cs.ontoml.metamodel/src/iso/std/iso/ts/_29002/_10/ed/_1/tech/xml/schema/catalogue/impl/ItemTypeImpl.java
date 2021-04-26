/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ItemType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.PropertyValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#getClassificationRef <em>Classification Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#getCreatedView <em>Created View</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#getDataSpecificationRef <em>Data Specification Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#getInformationSupplierReferenceString <em>Information Supplier Reference String</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#isIsGlobalId <em>Is Global Id</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#isIsModel <em>Is Model</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#isIsProprietary <em>Is Proprietary</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ItemTypeImpl#getViewOf <em>View Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemTypeImpl extends MinimalEObjectImpl.Container implements ItemType {
	/**
	 * The cached value of the '{@link #getClassificationRef() <em>Classification Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classificationRef;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceType> reference;

	/**
	 * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueType> propertyValue;

	/**
	 * The default value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected String classRef = CLASS_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedView() <em>Created View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedView()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedView() <em>Created View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedView()
	 * @generated
	 * @ordered
	 */
	protected String createdView = CREATED_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSpecificationRef() <em>Data Specification Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSpecificationRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SPECIFICATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSpecificationRef() <em>Data Specification Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSpecificationRef()
	 * @generated
	 * @ordered
	 */
	protected String dataSpecificationRef = DATA_SPECIFICATION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getInformationSupplierReferenceString() <em>Information Supplier Reference String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSupplierReferenceString()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformationSupplierReferenceString() <em>Information Supplier Reference String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSupplierReferenceString()
	 * @generated
	 * @ordered
	 */
	protected String informationSupplierReferenceString = INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean isDependent = IS_DEPENDENT_EDEFAULT;

	/**
	 * This is true if the Is Dependent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDependentESet;

	/**
	 * The default value of the '{@link #isIsGlobalId() <em>Is Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGlobalId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GLOBAL_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGlobalId() <em>Is Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGlobalId()
	 * @generated
	 * @ordered
	 */
	protected boolean isGlobalId = IS_GLOBAL_ID_EDEFAULT;

	/**
	 * This is true if the Is Global Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isGlobalIdESet;

	/**
	 * The default value of the '{@link #isIsModel() <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsModel() <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModel()
	 * @generated
	 * @ordered
	 */
	protected boolean isModel = IS_MODEL_EDEFAULT;

	/**
	 * This is true if the Is Model attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isModelESet;

	/**
	 * The default value of the '{@link #isIsProprietary() <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProprietary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROPRIETARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProprietary() <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProprietary()
	 * @generated
	 * @ordered
	 */
	protected boolean isProprietary = IS_PROPRIETARY_EDEFAULT;

	/**
	 * This is true if the Is Proprietary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isProprietaryESet;

	/**
	 * The default value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected String localId = LOCAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewOf() <em>View Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewOf()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewOf() <em>View Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewOf()
	 * @generated
	 * @ordered
	 */
	protected String viewOf = VIEW_OF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClassificationRef() {
		if (classificationRef == null) {
			classificationRef = new EDataTypeEList<String>(String.class, this, CataloguePackage.ITEM_TYPE__CLASSIFICATION_REF);
		}
		return classificationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceType> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<ReferenceType>(ReferenceType.class, this, CataloguePackage.ITEM_TYPE__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValueType> getPropertyValue() {
		if (propertyValue == null) {
			propertyValue = new EObjectContainmentEList<PropertyValueType>(PropertyValueType.class, this, CataloguePackage.ITEM_TYPE__PROPERTY_VALUE);
		}
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassRef() {
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassRef(String newClassRef) {
		String oldClassRef = classRef;
		classRef = newClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__CLASS_REF, oldClassRef, classRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedView() {
		return createdView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedView(String newCreatedView) {
		String oldCreatedView = createdView;
		createdView = newCreatedView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__CREATED_VIEW, oldCreatedView, createdView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSpecificationRef() {
		return dataSpecificationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSpecificationRef(String newDataSpecificationRef) {
		String oldDataSpecificationRef = dataSpecificationRef;
		dataSpecificationRef = newDataSpecificationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__DATA_SPECIFICATION_REF, oldDataSpecificationRef, dataSpecificationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformationSupplierReferenceString() {
		return informationSupplierReferenceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationSupplierReferenceString(String newInformationSupplierReferenceString) {
		String oldInformationSupplierReferenceString = informationSupplierReferenceString;
		informationSupplierReferenceString = newInformationSupplierReferenceString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__INFORMATION_SUPPLIER_REFERENCE_STRING, oldInformationSupplierReferenceString, informationSupplierReferenceString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDependent() {
		return isDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDependent(boolean newIsDependent) {
		boolean oldIsDependent = isDependent;
		isDependent = newIsDependent;
		boolean oldIsDependentESet = isDependentESet;
		isDependentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__IS_DEPENDENT, oldIsDependent, isDependent, !oldIsDependentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDependent() {
		boolean oldIsDependent = isDependent;
		boolean oldIsDependentESet = isDependentESet;
		isDependent = IS_DEPENDENT_EDEFAULT;
		isDependentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CataloguePackage.ITEM_TYPE__IS_DEPENDENT, oldIsDependent, IS_DEPENDENT_EDEFAULT, oldIsDependentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDependent() {
		return isDependentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGlobalId() {
		return isGlobalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGlobalId(boolean newIsGlobalId) {
		boolean oldIsGlobalId = isGlobalId;
		isGlobalId = newIsGlobalId;
		boolean oldIsGlobalIdESet = isGlobalIdESet;
		isGlobalIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__IS_GLOBAL_ID, oldIsGlobalId, isGlobalId, !oldIsGlobalIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsGlobalId() {
		boolean oldIsGlobalId = isGlobalId;
		boolean oldIsGlobalIdESet = isGlobalIdESet;
		isGlobalId = IS_GLOBAL_ID_EDEFAULT;
		isGlobalIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CataloguePackage.ITEM_TYPE__IS_GLOBAL_ID, oldIsGlobalId, IS_GLOBAL_ID_EDEFAULT, oldIsGlobalIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsGlobalId() {
		return isGlobalIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsModel() {
		return isModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModel(boolean newIsModel) {
		boolean oldIsModel = isModel;
		isModel = newIsModel;
		boolean oldIsModelESet = isModelESet;
		isModelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__IS_MODEL, oldIsModel, isModel, !oldIsModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsModel() {
		boolean oldIsModel = isModel;
		boolean oldIsModelESet = isModelESet;
		isModel = IS_MODEL_EDEFAULT;
		isModelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CataloguePackage.ITEM_TYPE__IS_MODEL, oldIsModel, IS_MODEL_EDEFAULT, oldIsModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsModel() {
		return isModelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProprietary() {
		return isProprietary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProprietary(boolean newIsProprietary) {
		boolean oldIsProprietary = isProprietary;
		isProprietary = newIsProprietary;
		boolean oldIsProprietaryESet = isProprietaryESet;
		isProprietaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__IS_PROPRIETARY, oldIsProprietary, isProprietary, !oldIsProprietaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsProprietary() {
		boolean oldIsProprietary = isProprietary;
		boolean oldIsProprietaryESet = isProprietaryESet;
		isProprietary = IS_PROPRIETARY_EDEFAULT;
		isProprietaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CataloguePackage.ITEM_TYPE__IS_PROPRIETARY, oldIsProprietary, IS_PROPRIETARY_EDEFAULT, oldIsProprietaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsProprietary() {
		return isProprietaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalId() {
		return localId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalId(String newLocalId) {
		String oldLocalId = localId;
		localId = newLocalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__LOCAL_ID, oldLocalId, localId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewOf() {
		return viewOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewOf(String newViewOf) {
		String oldViewOf = viewOf;
		viewOf = newViewOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.ITEM_TYPE__VIEW_OF, oldViewOf, viewOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CataloguePackage.ITEM_TYPE__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case CataloguePackage.ITEM_TYPE__PROPERTY_VALUE:
				return ((InternalEList<?>)getPropertyValue()).basicRemove(otherEnd, msgs);
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
			case CataloguePackage.ITEM_TYPE__CLASSIFICATION_REF:
				return getClassificationRef();
			case CataloguePackage.ITEM_TYPE__REFERENCE:
				return getReference();
			case CataloguePackage.ITEM_TYPE__PROPERTY_VALUE:
				return getPropertyValue();
			case CataloguePackage.ITEM_TYPE__CLASS_REF:
				return getClassRef();
			case CataloguePackage.ITEM_TYPE__CREATED_VIEW:
				return getCreatedView();
			case CataloguePackage.ITEM_TYPE__DATA_SPECIFICATION_REF:
				return getDataSpecificationRef();
			case CataloguePackage.ITEM_TYPE__INFORMATION_SUPPLIER_REFERENCE_STRING:
				return getInformationSupplierReferenceString();
			case CataloguePackage.ITEM_TYPE__IS_DEPENDENT:
				return isIsDependent();
			case CataloguePackage.ITEM_TYPE__IS_GLOBAL_ID:
				return isIsGlobalId();
			case CataloguePackage.ITEM_TYPE__IS_MODEL:
				return isIsModel();
			case CataloguePackage.ITEM_TYPE__IS_PROPRIETARY:
				return isIsProprietary();
			case CataloguePackage.ITEM_TYPE__LOCAL_ID:
				return getLocalId();
			case CataloguePackage.ITEM_TYPE__VIEW_OF:
				return getViewOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CataloguePackage.ITEM_TYPE__CLASSIFICATION_REF:
				getClassificationRef().clear();
				getClassificationRef().addAll((Collection<? extends String>)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends ReferenceType>)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__PROPERTY_VALUE:
				getPropertyValue().clear();
				getPropertyValue().addAll((Collection<? extends PropertyValueType>)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__CLASS_REF:
				setClassRef((String)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__CREATED_VIEW:
				setCreatedView((String)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__DATA_SPECIFICATION_REF:
				setDataSpecificationRef((String)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__INFORMATION_SUPPLIER_REFERENCE_STRING:
				setInformationSupplierReferenceString((String)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__IS_DEPENDENT:
				setIsDependent((Boolean)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__IS_GLOBAL_ID:
				setIsGlobalId((Boolean)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__IS_MODEL:
				setIsModel((Boolean)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__IS_PROPRIETARY:
				setIsProprietary((Boolean)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__LOCAL_ID:
				setLocalId((String)newValue);
				return;
			case CataloguePackage.ITEM_TYPE__VIEW_OF:
				setViewOf((String)newValue);
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
			case CataloguePackage.ITEM_TYPE__CLASSIFICATION_REF:
				getClassificationRef().clear();
				return;
			case CataloguePackage.ITEM_TYPE__REFERENCE:
				getReference().clear();
				return;
			case CataloguePackage.ITEM_TYPE__PROPERTY_VALUE:
				getPropertyValue().clear();
				return;
			case CataloguePackage.ITEM_TYPE__CLASS_REF:
				setClassRef(CLASS_REF_EDEFAULT);
				return;
			case CataloguePackage.ITEM_TYPE__CREATED_VIEW:
				setCreatedView(CREATED_VIEW_EDEFAULT);
				return;
			case CataloguePackage.ITEM_TYPE__DATA_SPECIFICATION_REF:
				setDataSpecificationRef(DATA_SPECIFICATION_REF_EDEFAULT);
				return;
			case CataloguePackage.ITEM_TYPE__INFORMATION_SUPPLIER_REFERENCE_STRING:
				setInformationSupplierReferenceString(INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT);
				return;
			case CataloguePackage.ITEM_TYPE__IS_DEPENDENT:
				unsetIsDependent();
				return;
			case CataloguePackage.ITEM_TYPE__IS_GLOBAL_ID:
				unsetIsGlobalId();
				return;
			case CataloguePackage.ITEM_TYPE__IS_MODEL:
				unsetIsModel();
				return;
			case CataloguePackage.ITEM_TYPE__IS_PROPRIETARY:
				unsetIsProprietary();
				return;
			case CataloguePackage.ITEM_TYPE__LOCAL_ID:
				setLocalId(LOCAL_ID_EDEFAULT);
				return;
			case CataloguePackage.ITEM_TYPE__VIEW_OF:
				setViewOf(VIEW_OF_EDEFAULT);
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
			case CataloguePackage.ITEM_TYPE__CLASSIFICATION_REF:
				return classificationRef != null && !classificationRef.isEmpty();
			case CataloguePackage.ITEM_TYPE__REFERENCE:
				return reference != null && !reference.isEmpty();
			case CataloguePackage.ITEM_TYPE__PROPERTY_VALUE:
				return propertyValue != null && !propertyValue.isEmpty();
			case CataloguePackage.ITEM_TYPE__CLASS_REF:
				return CLASS_REF_EDEFAULT == null ? classRef != null : !CLASS_REF_EDEFAULT.equals(classRef);
			case CataloguePackage.ITEM_TYPE__CREATED_VIEW:
				return CREATED_VIEW_EDEFAULT == null ? createdView != null : !CREATED_VIEW_EDEFAULT.equals(createdView);
			case CataloguePackage.ITEM_TYPE__DATA_SPECIFICATION_REF:
				return DATA_SPECIFICATION_REF_EDEFAULT == null ? dataSpecificationRef != null : !DATA_SPECIFICATION_REF_EDEFAULT.equals(dataSpecificationRef);
			case CataloguePackage.ITEM_TYPE__INFORMATION_SUPPLIER_REFERENCE_STRING:
				return INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT == null ? informationSupplierReferenceString != null : !INFORMATION_SUPPLIER_REFERENCE_STRING_EDEFAULT.equals(informationSupplierReferenceString);
			case CataloguePackage.ITEM_TYPE__IS_DEPENDENT:
				return isSetIsDependent();
			case CataloguePackage.ITEM_TYPE__IS_GLOBAL_ID:
				return isSetIsGlobalId();
			case CataloguePackage.ITEM_TYPE__IS_MODEL:
				return isSetIsModel();
			case CataloguePackage.ITEM_TYPE__IS_PROPRIETARY:
				return isSetIsProprietary();
			case CataloguePackage.ITEM_TYPE__LOCAL_ID:
				return LOCAL_ID_EDEFAULT == null ? localId != null : !LOCAL_ID_EDEFAULT.equals(localId);
			case CataloguePackage.ITEM_TYPE__VIEW_OF:
				return VIEW_OF_EDEFAULT == null ? viewOf != null : !VIEW_OF_EDEFAULT.equals(viewOf);
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
		result.append(" (classificationRef: ");
		result.append(classificationRef);
		result.append(", classRef: ");
		result.append(classRef);
		result.append(", createdView: ");
		result.append(createdView);
		result.append(", dataSpecificationRef: ");
		result.append(dataSpecificationRef);
		result.append(", informationSupplierReferenceString: ");
		result.append(informationSupplierReferenceString);
		result.append(", isDependent: ");
		if (isDependentESet) result.append(isDependent); else result.append("<unset>");
		result.append(", isGlobalId: ");
		if (isGlobalIdESet) result.append(isGlobalId); else result.append("<unset>");
		result.append(", isModel: ");
		if (isModelESet) result.append(isModel); else result.append("<unset>");
		result.append(", isProprietary: ");
		if (isProprietaryESet) result.append(isProprietary); else result.append("<unset>");
		result.append(", localId: ");
		result.append(localId);
		result.append(", viewOf: ");
		result.append(viewOf);
		result.append(')');
		return result.toString();
	}

} //ItemTypeImpl
