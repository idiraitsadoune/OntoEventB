/**
 */
package pivotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pivotmodel.PivotmodelPackage;
import pivotmodel.PrefixeType;
import pivotmodel.StandardUnit;
import pivotmodel.UnitName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.StandardUnitImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link pivotmodel.impl.StandardUnitImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardUnitImpl extends NamedUnitImpl implements StandardUnit {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final PrefixeType PREFIX_EDEFAULT = PrefixeType.EXA;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected PrefixeType prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final UnitName NAME_EDEFAULT = UnitName.METRE;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected UnitName name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.STANDARD_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixeType getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(PrefixeType newPrefix) {
		PrefixeType oldPrefix = prefix;
		prefix = newPrefix == null ? PREFIX_EDEFAULT : newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.STANDARD_UNIT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(UnitName newName) {
		UnitName oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.STANDARD_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.STANDARD_UNIT__PREFIX:
				return getPrefix();
			case PivotmodelPackage.STANDARD_UNIT__NAME:
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
			case PivotmodelPackage.STANDARD_UNIT__PREFIX:
				setPrefix((PrefixeType)newValue);
				return;
			case PivotmodelPackage.STANDARD_UNIT__NAME:
				setName((UnitName)newValue);
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
			case PivotmodelPackage.STANDARD_UNIT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case PivotmodelPackage.STANDARD_UNIT__NAME:
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
			case PivotmodelPackage.STANDARD_UNIT__PREFIX:
				return prefix != PREFIX_EDEFAULT;
			case PivotmodelPackage.STANDARD_UNIT__NAME:
				return name != NAME_EDEFAULT;
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
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StandardUnitImpl
