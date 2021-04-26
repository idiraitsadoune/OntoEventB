/**
 */
package pivotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pivotmodel.MaxCardinalityClass;
import pivotmodel.PivotmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Cardinality Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.MaxCardinalityClassImpl#getMaxCard <em>Max Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxCardinalityClassImpl extends CardinalityRestrictedClassImpl implements MaxCardinalityClass {
	/**
	 * The default value of the '{@link #getMaxCard() <em>Max Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCard()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CARD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCard() <em>Max Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCard()
	 * @generated
	 * @ordered
	 */
	protected int maxCard = MAX_CARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxCardinalityClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.MAX_CARDINALITY_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxCard() {
		return maxCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCard(int newMaxCard) {
		int oldMaxCard = maxCard;
		maxCard = newMaxCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.MAX_CARDINALITY_CLASS__MAX_CARD, oldMaxCard, maxCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.MAX_CARDINALITY_CLASS__MAX_CARD:
				return getMaxCard();
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
			case PivotmodelPackage.MAX_CARDINALITY_CLASS__MAX_CARD:
				setMaxCard((Integer)newValue);
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
			case PivotmodelPackage.MAX_CARDINALITY_CLASS__MAX_CARD:
				setMaxCard(MAX_CARD_EDEFAULT);
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
			case PivotmodelPackage.MAX_CARDINALITY_CLASS__MAX_CARD:
				return maxCard != MAX_CARD_EDEFAULT;
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
		result.append(" (maxCard: ");
		result.append(maxCard);
		result.append(')');
		return result.toString();
	}

} //MaxCardinalityClassImpl
