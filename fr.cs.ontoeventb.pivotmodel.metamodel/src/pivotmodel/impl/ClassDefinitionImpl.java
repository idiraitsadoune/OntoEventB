/**
 */
package pivotmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import pivotmodel.ClassDefinition;
import pivotmodel.PivotmodelPackage;
import pivotmodel.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.ClassDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link pivotmodel.impl.ClassDefinitionImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link pivotmodel.impl.ClassDefinitionImpl#getDisjointWith <em>Disjoint With</em>}</li>
 *   <li>{@link pivotmodel.impl.ClassDefinitionImpl#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link pivotmodel.impl.ClassDefinitionImpl#getDescribedBy <em>Described By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassDefinitionImpl extends MinimalEObjectImpl.Container implements ClassDefinition {
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
	 * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinition> subClassOf;

	/**
	 * The cached value of the '{@link #getDisjointWith() <em>Disjoint With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointWith()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinition> disjointWith;

	/**
	 * The cached value of the '{@link #getEquivalentTo() <em>Equivalent To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinition> equivalentTo;

	/**
	 * The cached value of the '{@link #getDescribedBy() <em>Described By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDefinition> describedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.CLASS_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.CLASS_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassDefinition> getSubClassOf() {
		if (subClassOf == null) {
			subClassOf = new EObjectResolvingEList<ClassDefinition>(ClassDefinition.class, this, PivotmodelPackage.CLASS_DEFINITION__SUB_CLASS_OF);
		}
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassDefinition> getDisjointWith() {
		if (disjointWith == null) {
			disjointWith = new EObjectResolvingEList<ClassDefinition>(ClassDefinition.class, this, PivotmodelPackage.CLASS_DEFINITION__DISJOINT_WITH);
		}
		return disjointWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassDefinition> getEquivalentTo() {
		if (equivalentTo == null) {
			equivalentTo = new EObjectResolvingEList<ClassDefinition>(ClassDefinition.class, this, PivotmodelPackage.CLASS_DEFINITION__EQUIVALENT_TO);
		}
		return equivalentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyDefinition> getDescribedBy() {
		if (describedBy == null) {
			describedBy = new EObjectResolvingEList<PropertyDefinition>(PropertyDefinition.class, this, PivotmodelPackage.CLASS_DEFINITION__DESCRIBED_BY);
		}
		return describedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.CLASS_DEFINITION__NAME:
				return getName();
			case PivotmodelPackage.CLASS_DEFINITION__SUB_CLASS_OF:
				return getSubClassOf();
			case PivotmodelPackage.CLASS_DEFINITION__DISJOINT_WITH:
				return getDisjointWith();
			case PivotmodelPackage.CLASS_DEFINITION__EQUIVALENT_TO:
				return getEquivalentTo();
			case PivotmodelPackage.CLASS_DEFINITION__DESCRIBED_BY:
				return getDescribedBy();
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
			case PivotmodelPackage.CLASS_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case PivotmodelPackage.CLASS_DEFINITION__SUB_CLASS_OF:
				getSubClassOf().clear();
				getSubClassOf().addAll((Collection<? extends ClassDefinition>)newValue);
				return;
			case PivotmodelPackage.CLASS_DEFINITION__DISJOINT_WITH:
				getDisjointWith().clear();
				getDisjointWith().addAll((Collection<? extends ClassDefinition>)newValue);
				return;
			case PivotmodelPackage.CLASS_DEFINITION__EQUIVALENT_TO:
				getEquivalentTo().clear();
				getEquivalentTo().addAll((Collection<? extends ClassDefinition>)newValue);
				return;
			case PivotmodelPackage.CLASS_DEFINITION__DESCRIBED_BY:
				getDescribedBy().clear();
				getDescribedBy().addAll((Collection<? extends PropertyDefinition>)newValue);
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
			case PivotmodelPackage.CLASS_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotmodelPackage.CLASS_DEFINITION__SUB_CLASS_OF:
				getSubClassOf().clear();
				return;
			case PivotmodelPackage.CLASS_DEFINITION__DISJOINT_WITH:
				getDisjointWith().clear();
				return;
			case PivotmodelPackage.CLASS_DEFINITION__EQUIVALENT_TO:
				getEquivalentTo().clear();
				return;
			case PivotmodelPackage.CLASS_DEFINITION__DESCRIBED_BY:
				getDescribedBy().clear();
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
			case PivotmodelPackage.CLASS_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotmodelPackage.CLASS_DEFINITION__SUB_CLASS_OF:
				return subClassOf != null && !subClassOf.isEmpty();
			case PivotmodelPackage.CLASS_DEFINITION__DISJOINT_WITH:
				return disjointWith != null && !disjointWith.isEmpty();
			case PivotmodelPackage.CLASS_DEFINITION__EQUIVALENT_TO:
				return equivalentTo != null && !equivalentTo.isEmpty();
			case PivotmodelPackage.CLASS_DEFINITION__DESCRIBED_BY:
				return describedBy != null && !describedBy.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassDefinitionImpl
