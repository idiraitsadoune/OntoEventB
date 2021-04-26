/**
 */
package pivotmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pivotmodel.DerivedUnit;
import pivotmodel.DerivedUnitElement;
import pivotmodel.PivotmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.DerivedUnitImpl#getDerivedUnitElement <em>Derived Unit Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedUnitImpl extends UnitTypeImpl implements DerivedUnit {
	/**
	 * The cached value of the '{@link #getDerivedUnitElement() <em>Derived Unit Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedUnitElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DerivedUnitElement> derivedUnitElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.DERIVED_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DerivedUnitElement> getDerivedUnitElement() {
		if (derivedUnitElement == null) {
			derivedUnitElement = new EObjectContainmentEList<DerivedUnitElement>(DerivedUnitElement.class, this, PivotmodelPackage.DERIVED_UNIT__DERIVED_UNIT_ELEMENT);
		}
		return derivedUnitElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PivotmodelPackage.DERIVED_UNIT__DERIVED_UNIT_ELEMENT:
				return ((InternalEList<?>)getDerivedUnitElement()).basicRemove(otherEnd, msgs);
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
			case PivotmodelPackage.DERIVED_UNIT__DERIVED_UNIT_ELEMENT:
				return getDerivedUnitElement();
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
			case PivotmodelPackage.DERIVED_UNIT__DERIVED_UNIT_ELEMENT:
				getDerivedUnitElement().clear();
				getDerivedUnitElement().addAll((Collection<? extends DerivedUnitElement>)newValue);
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
			case PivotmodelPackage.DERIVED_UNIT__DERIVED_UNIT_ELEMENT:
				getDerivedUnitElement().clear();
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
			case PivotmodelPackage.DERIVED_UNIT__DERIVED_UNIT_ELEMENT:
				return derivedUnitElement != null && !derivedUnitElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivedUnitImpl
