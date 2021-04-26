/**
 */
package pivotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pivotmodel.ConversionBasedUnit;
import pivotmodel.PivotmodelPackage;
import pivotmodel.UnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Based Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.ConversionBasedUnitImpl#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link pivotmodel.impl.ConversionBasedUnitImpl#getUnitComponent <em>Unit Component</em>}</li>
 *   <li>{@link pivotmodel.impl.ConversionBasedUnitImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionBasedUnitImpl extends NamedUnitImpl implements ConversionBasedUnit {
	/**
	 * The default value of the '{@link #getValueComponent() <em>Value Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComponent()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_COMPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValueComponent() <em>Value Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComponent()
	 * @generated
	 * @ordered
	 */
	protected int valueComponent = VALUE_COMPONENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnitComponent() <em>Unit Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitComponent()
	 * @generated
	 * @ordered
	 */
	protected UnitType unitComponent;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionBasedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.CONVERSION_BASED_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValueComponent() {
		return valueComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueComponent(int newValueComponent) {
		int oldValueComponent = valueComponent;
		valueComponent = newValueComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.CONVERSION_BASED_UNIT__VALUE_COMPONENT, oldValueComponent, valueComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getUnitComponent() {
		if (unitComponent != null && unitComponent.eIsProxy()) {
			InternalEObject oldUnitComponent = (InternalEObject)unitComponent;
			unitComponent = (UnitType)eResolveProxy(oldUnitComponent);
			if (unitComponent != oldUnitComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotmodelPackage.CONVERSION_BASED_UNIT__UNIT_COMPONENT, oldUnitComponent, unitComponent));
			}
		}
		return unitComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType basicGetUnitComponent() {
		return unitComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitComponent(UnitType newUnitComponent) {
		UnitType oldUnitComponent = unitComponent;
		unitComponent = newUnitComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.CONVERSION_BASED_UNIT__UNIT_COMPONENT, oldUnitComponent, unitComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.CONVERSION_BASED_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.CONVERSION_BASED_UNIT__VALUE_COMPONENT:
				return getValueComponent();
			case PivotmodelPackage.CONVERSION_BASED_UNIT__UNIT_COMPONENT:
				if (resolve) return getUnitComponent();
				return basicGetUnitComponent();
			case PivotmodelPackage.CONVERSION_BASED_UNIT__NAME:
				return getName();
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
			case PivotmodelPackage.CONVERSION_BASED_UNIT__VALUE_COMPONENT:
				setValueComponent((Integer)newValue);
				return;
			case PivotmodelPackage.CONVERSION_BASED_UNIT__UNIT_COMPONENT:
				setUnitComponent((UnitType)newValue);
				return;
			case PivotmodelPackage.CONVERSION_BASED_UNIT__NAME:
				setName((String)newValue);
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
			case PivotmodelPackage.CONVERSION_BASED_UNIT__VALUE_COMPONENT:
				setValueComponent(VALUE_COMPONENT_EDEFAULT);
				return;
			case PivotmodelPackage.CONVERSION_BASED_UNIT__UNIT_COMPONENT:
				setUnitComponent((UnitType)null);
				return;
			case PivotmodelPackage.CONVERSION_BASED_UNIT__NAME:
				setName(NAME_EDEFAULT);
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
			case PivotmodelPackage.CONVERSION_BASED_UNIT__VALUE_COMPONENT:
				return valueComponent != VALUE_COMPONENT_EDEFAULT;
			case PivotmodelPackage.CONVERSION_BASED_UNIT__UNIT_COMPONENT:
				return unitComponent != null;
			case PivotmodelPackage.CONVERSION_BASED_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (valueComponent: ");
		result.append(valueComponent);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConversionBasedUnitImpl
