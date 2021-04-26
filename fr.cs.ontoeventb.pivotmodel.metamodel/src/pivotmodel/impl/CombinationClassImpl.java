/**
 */
package pivotmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pivotmodel.ClassDefinition;
import pivotmodel.CombinationClass;
import pivotmodel.PivotmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combination Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.CombinationClassImpl#getCombinationOf <em>Combination Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CombinationClassImpl extends ClassDefinitionImpl implements CombinationClass {
	/**
	 * The cached value of the '{@link #getCombinationOf() <em>Combination Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinationOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinition> combinationOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.COMBINATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassDefinition> getCombinationOf() {
		if (combinationOf == null) {
			combinationOf = new EObjectResolvingEList<ClassDefinition>(ClassDefinition.class, this, PivotmodelPackage.COMBINATION_CLASS__COMBINATION_OF);
		}
		return combinationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.COMBINATION_CLASS__COMBINATION_OF:
				return getCombinationOf();
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
			case PivotmodelPackage.COMBINATION_CLASS__COMBINATION_OF:
				getCombinationOf().clear();
				getCombinationOf().addAll((Collection<? extends ClassDefinition>)newValue);
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
			case PivotmodelPackage.COMBINATION_CLASS__COMBINATION_OF:
				getCombinationOf().clear();
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
			case PivotmodelPackage.COMBINATION_CLASS__COMBINATION_OF:
				return combinationOf != null && !combinationOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CombinationClassImpl
