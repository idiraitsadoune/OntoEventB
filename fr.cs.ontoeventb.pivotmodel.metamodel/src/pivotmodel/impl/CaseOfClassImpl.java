/**
 */
package pivotmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pivotmodel.CaseOfClass;
import pivotmodel.ClassDefinition;
import pivotmodel.PivotmodelPackage;
import pivotmodel.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Of Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.CaseOfClassImpl#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link pivotmodel.impl.CaseOfClassImpl#getImportedProperties <em>Imported Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseOfClassImpl extends ClassDefinitionImpl implements CaseOfClass {
	/**
	 * The cached value of the '{@link #getCaseOf() <em>Case Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinition> caseOf;

	/**
	 * The cached value of the '{@link #getImportedProperties() <em>Imported Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDefinition> importedProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseOfClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.CASE_OF_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassDefinition> getCaseOf() {
		if (caseOf == null) {
			caseOf = new EObjectResolvingEList<ClassDefinition>(ClassDefinition.class, this, PivotmodelPackage.CASE_OF_CLASS__CASE_OF);
		}
		return caseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyDefinition> getImportedProperties() {
		if (importedProperties == null) {
			importedProperties = new EObjectResolvingEList<PropertyDefinition>(PropertyDefinition.class, this, PivotmodelPackage.CASE_OF_CLASS__IMPORTED_PROPERTIES);
		}
		return importedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.CASE_OF_CLASS__CASE_OF:
				return getCaseOf();
			case PivotmodelPackage.CASE_OF_CLASS__IMPORTED_PROPERTIES:
				return getImportedProperties();
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
			case PivotmodelPackage.CASE_OF_CLASS__CASE_OF:
				getCaseOf().clear();
				getCaseOf().addAll((Collection<? extends ClassDefinition>)newValue);
				return;
			case PivotmodelPackage.CASE_OF_CLASS__IMPORTED_PROPERTIES:
				getImportedProperties().clear();
				getImportedProperties().addAll((Collection<? extends PropertyDefinition>)newValue);
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
			case PivotmodelPackage.CASE_OF_CLASS__CASE_OF:
				getCaseOf().clear();
				return;
			case PivotmodelPackage.CASE_OF_CLASS__IMPORTED_PROPERTIES:
				getImportedProperties().clear();
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
			case PivotmodelPackage.CASE_OF_CLASS__CASE_OF:
				return caseOf != null && !caseOf.isEmpty();
			case PivotmodelPackage.CASE_OF_CLASS__IMPORTED_PROPERTIES:
				return importedProperties != null && !importedProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseOfClassImpl
