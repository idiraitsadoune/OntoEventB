/**
 */
package pivotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pivotmodel.CollectionType;
import pivotmodel.DataTypeDefinition;
import pivotmodel.PivotmodelPackage;
import pivotmodel.PredefinedCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.CollectionTypeImpl#getCollectionOf <em>Collection Of</em>}</li>
 *   <li>{@link pivotmodel.impl.CollectionTypeImpl#getIs <em>Is</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionTypeImpl extends DataTypeDefinitionImpl implements CollectionType {
	/**
	 * The cached value of the '{@link #getCollectionOf() <em>Collection Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionOf()
	 * @generated
	 * @ordered
	 */
	protected DataTypeDefinition collectionOf;

	/**
	 * The default value of the '{@link #getIs() <em>Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs()
	 * @generated
	 * @ordered
	 */
	protected static final PredefinedCollection IS_EDEFAULT = PredefinedCollection.ARRAY;

	/**
	 * The cached value of the '{@link #getIs() <em>Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs()
	 * @generated
	 * @ordered
	 */
	protected PredefinedCollection is = IS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTypeDefinition getCollectionOf() {
		if (collectionOf != null && collectionOf.eIsProxy()) {
			InternalEObject oldCollectionOf = (InternalEObject)collectionOf;
			collectionOf = (DataTypeDefinition)eResolveProxy(oldCollectionOf);
			if (collectionOf != oldCollectionOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotmodelPackage.COLLECTION_TYPE__COLLECTION_OF, oldCollectionOf, collectionOf));
			}
		}
		return collectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDefinition basicGetCollectionOf() {
		return collectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionOf(DataTypeDefinition newCollectionOf) {
		DataTypeDefinition oldCollectionOf = collectionOf;
		collectionOf = newCollectionOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.COLLECTION_TYPE__COLLECTION_OF, oldCollectionOf, collectionOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredefinedCollection getIs() {
		return is;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs(PredefinedCollection newIs) {
		PredefinedCollection oldIs = is;
		is = newIs == null ? IS_EDEFAULT : newIs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.COLLECTION_TYPE__IS, oldIs, is));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.COLLECTION_TYPE__COLLECTION_OF:
				if (resolve) return getCollectionOf();
				return basicGetCollectionOf();
			case PivotmodelPackage.COLLECTION_TYPE__IS:
				return getIs();
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
			case PivotmodelPackage.COLLECTION_TYPE__COLLECTION_OF:
				setCollectionOf((DataTypeDefinition)newValue);
				return;
			case PivotmodelPackage.COLLECTION_TYPE__IS:
				setIs((PredefinedCollection)newValue);
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
			case PivotmodelPackage.COLLECTION_TYPE__COLLECTION_OF:
				setCollectionOf((DataTypeDefinition)null);
				return;
			case PivotmodelPackage.COLLECTION_TYPE__IS:
				setIs(IS_EDEFAULT);
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
			case PivotmodelPackage.COLLECTION_TYPE__COLLECTION_OF:
				return collectionOf != null;
			case PivotmodelPackage.COLLECTION_TYPE__IS:
				return is != IS_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (is: ");
		result.append(is);
		result.append(')');
		return result.toString();
	}

} //CollectionTypeImpl
