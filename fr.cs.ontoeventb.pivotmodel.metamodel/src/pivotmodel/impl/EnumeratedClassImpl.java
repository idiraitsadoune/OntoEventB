/**
 */
package pivotmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pivotmodel.EnumeratedClass;
import pivotmodel.PivotmodelPackage;
import pivotmodel.SingleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.EnumeratedClassImpl#getOneOf <em>One Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumeratedClassImpl extends ClassDefinitionImpl implements EnumeratedClass {
	/**
	 * The cached value of the '{@link #getOneOf() <em>One Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneOf()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleValue> oneOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.ENUMERATED_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleValue> getOneOf() {
		if (oneOf == null) {
			oneOf = new EObjectResolvingEList<SingleValue>(SingleValue.class, this, PivotmodelPackage.ENUMERATED_CLASS__ONE_OF);
		}
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.ENUMERATED_CLASS__ONE_OF:
				return getOneOf();
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
			case PivotmodelPackage.ENUMERATED_CLASS__ONE_OF:
				getOneOf().clear();
				getOneOf().addAll((Collection<? extends SingleValue>)newValue);
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
			case PivotmodelPackage.ENUMERATED_CLASS__ONE_OF:
				getOneOf().clear();
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
			case PivotmodelPackage.ENUMERATED_CLASS__ONE_OF:
				return oneOf != null && !oneOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedClassImpl
