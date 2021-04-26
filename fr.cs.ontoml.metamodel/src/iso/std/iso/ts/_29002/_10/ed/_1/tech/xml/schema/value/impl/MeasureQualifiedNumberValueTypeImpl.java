/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.MeasureQualifiedNumberValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.QualifiedValueType;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.ValuePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Qualified Number Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.value.impl.MeasureQualifiedNumberValueTypeImpl#getQualifiedValue <em>Qualified Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureQualifiedNumberValueTypeImpl extends MeasureValueTypeImpl implements MeasureQualifiedNumberValueType {
	/**
	 * The cached value of the '{@link #getQualifiedValue() <em>Qualified Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<QualifiedValueType> qualifiedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureQualifiedNumberValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.MEASURE_QUALIFIED_NUMBER_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualifiedValueType> getQualifiedValue() {
		if (qualifiedValue == null) {
			qualifiedValue = new EObjectContainmentEList<QualifiedValueType>(QualifiedValueType.class, this, ValuePackage.MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__QUALIFIED_VALUE);
		}
		return qualifiedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValuePackage.MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__QUALIFIED_VALUE:
				return ((InternalEList<?>)getQualifiedValue()).basicRemove(otherEnd, msgs);
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
			case ValuePackage.MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__QUALIFIED_VALUE:
				return getQualifiedValue();
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
			case ValuePackage.MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__QUALIFIED_VALUE:
				getQualifiedValue().clear();
				getQualifiedValue().addAll((Collection<? extends QualifiedValueType>)newValue);
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
			case ValuePackage.MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__QUALIFIED_VALUE:
				getQualifiedValue().clear();
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
			case ValuePackage.MEASURE_QUALIFIED_NUMBER_VALUE_TYPE__QUALIFIED_VALUE:
				return qualifiedValue != null && !qualifiedValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureQualifiedNumberValueTypeImpl
