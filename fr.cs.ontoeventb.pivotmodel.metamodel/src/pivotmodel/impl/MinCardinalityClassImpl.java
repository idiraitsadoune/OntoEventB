/**
 */
package pivotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pivotmodel.MinCardinalityClass;
import pivotmodel.PivotmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Cardinality Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.MinCardinalityClassImpl#getMinCard <em>Min Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinCardinalityClassImpl extends CardinalityRestrictedClassImpl implements MinCardinalityClass {
	/**
	 * The default value of the '{@link #getMinCard() <em>Min Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCard()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CARD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCard() <em>Min Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCard()
	 * @generated
	 * @ordered
	 */
	protected int minCard = MIN_CARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinCardinalityClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.MIN_CARDINALITY_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinCard() {
		return minCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinCard(int newMinCard) {
		int oldMinCard = minCard;
		minCard = newMinCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.MIN_CARDINALITY_CLASS__MIN_CARD, oldMinCard, minCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.MIN_CARDINALITY_CLASS__MIN_CARD:
				return getMinCard();
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
			case PivotmodelPackage.MIN_CARDINALITY_CLASS__MIN_CARD:
				setMinCard((Integer)newValue);
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
			case PivotmodelPackage.MIN_CARDINALITY_CLASS__MIN_CARD:
				setMinCard(MIN_CARD_EDEFAULT);
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
			case PivotmodelPackage.MIN_CARDINALITY_CLASS__MIN_CARD:
				return minCard != MIN_CARD_EDEFAULT;
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
		result.append(" (minCard: ");
		result.append(minCard);
		result.append(')');
		return result.toString();
	}

} //MinCardinalityClassImpl
