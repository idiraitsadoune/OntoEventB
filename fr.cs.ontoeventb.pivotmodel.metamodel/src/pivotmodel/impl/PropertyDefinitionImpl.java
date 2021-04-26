/**
 */
package pivotmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pivotmodel.ClassDefinition;
import pivotmodel.DataTypeDefinition;
import pivotmodel.PivotmodelPackage;
import pivotmodel.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#isIsFunctional <em>Is Functional</em>}</li>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#isIsSymmetric <em>Is Symmetric</em>}</li>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#isIsTransitive <em>Is Transitive</em>}</li>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#isIsInverseFunctional <em>Is Inverse Functional</em>}</li>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#getRange <em>Range</em>}</li>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#getInverseOf <em>Inverse Of</em>}</li>
 *   <li>{@link pivotmodel.impl.PropertyDefinitionImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PropertyDefinitionImpl extends MinimalEObjectImpl.Container implements PropertyDefinition {
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
	 * The default value of the '{@link #isIsFunctional() <em>Is Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFunctional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FUNCTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFunctional() <em>Is Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFunctional()
	 * @generated
	 * @ordered
	 */
	protected boolean isFunctional = IS_FUNCTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSymmetric() <em>Is Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSymmetric()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SYMMETRIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSymmetric() <em>Is Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSymmetric()
	 * @generated
	 * @ordered
	 */
	protected boolean isSymmetric = IS_SYMMETRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTransitive() <em>Is Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRANSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTransitive() <em>Is Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransitive()
	 * @generated
	 * @ordered
	 */
	protected boolean isTransitive = IS_TRANSITIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInverseFunctional() <em>Is Inverse Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInverseFunctional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INVERSE_FUNCTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInverseFunctional() <em>Is Inverse Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInverseFunctional()
	 * @generated
	 * @ordered
	 */
	protected boolean isInverseFunctional = IS_INVERSE_FUNCTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected DataTypeDefinition range;

	/**
	 * The cached value of the '{@link #getSubPropertyOf() <em>Sub Property Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDefinition> subPropertyOf;

	/**
	 * The cached value of the '{@link #getEquivalentTo() <em>Equivalent To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentTo()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDefinition> equivalentTo;

	/**
	 * The cached value of the '{@link #getInverseOf() <em>Inverse Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseOf()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDefinition> inverseOf;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected ClassDefinition domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.PROPERTY_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.PROPERTY_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsFunctional() {
		return isFunctional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFunctional(boolean newIsFunctional) {
		boolean oldIsFunctional = isFunctional;
		isFunctional = newIsFunctional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.PROPERTY_DEFINITION__IS_FUNCTIONAL, oldIsFunctional, isFunctional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSymmetric() {
		return isSymmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSymmetric(boolean newIsSymmetric) {
		boolean oldIsSymmetric = isSymmetric;
		isSymmetric = newIsSymmetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.PROPERTY_DEFINITION__IS_SYMMETRIC, oldIsSymmetric, isSymmetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsTransitive() {
		return isTransitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTransitive(boolean newIsTransitive) {
		boolean oldIsTransitive = isTransitive;
		isTransitive = newIsTransitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.PROPERTY_DEFINITION__IS_TRANSITIVE, oldIsTransitive, isTransitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsInverseFunctional() {
		return isInverseFunctional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsInverseFunctional(boolean newIsInverseFunctional) {
		boolean oldIsInverseFunctional = isInverseFunctional;
		isInverseFunctional = newIsInverseFunctional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL, oldIsInverseFunctional, isInverseFunctional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTypeDefinition getRange() {
		if (range != null && range.eIsProxy()) {
			InternalEObject oldRange = (InternalEObject)range;
			range = (DataTypeDefinition)eResolveProxy(oldRange);
			if (range != oldRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotmodelPackage.PROPERTY_DEFINITION__RANGE, oldRange, range));
			}
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDefinition basicGetRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(DataTypeDefinition newRange) {
		DataTypeDefinition oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.PROPERTY_DEFINITION__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDefinition getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (ClassDefinition)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotmodelPackage.PROPERTY_DEFINITION__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(ClassDefinition newDomain) {
		ClassDefinition oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.PROPERTY_DEFINITION__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyDefinition> getSubPropertyOf() {
		if (subPropertyOf == null) {
			subPropertyOf = new EObjectResolvingEList<PropertyDefinition>(PropertyDefinition.class, this, PivotmodelPackage.PROPERTY_DEFINITION__SUB_PROPERTY_OF);
		}
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyDefinition> getEquivalentTo() {
		if (equivalentTo == null) {
			equivalentTo = new EObjectResolvingEList<PropertyDefinition>(PropertyDefinition.class, this, PivotmodelPackage.PROPERTY_DEFINITION__EQUIVALENT_TO);
		}
		return equivalentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyDefinition> getInverseOf() {
		if (inverseOf == null) {
			inverseOf = new EObjectResolvingEList<PropertyDefinition>(PropertyDefinition.class, this, PivotmodelPackage.PROPERTY_DEFINITION__INVERSE_OF);
		}
		return inverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PivotmodelPackage.PROPERTY_DEFINITION__NAME:
				return getName();
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_FUNCTIONAL:
				return isIsFunctional();
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_SYMMETRIC:
				return isIsSymmetric();
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_TRANSITIVE:
				return isIsTransitive();
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL:
				return isIsInverseFunctional();
			case PivotmodelPackage.PROPERTY_DEFINITION__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
			case PivotmodelPackage.PROPERTY_DEFINITION__SUB_PROPERTY_OF:
				return getSubPropertyOf();
			case PivotmodelPackage.PROPERTY_DEFINITION__EQUIVALENT_TO:
				return getEquivalentTo();
			case PivotmodelPackage.PROPERTY_DEFINITION__INVERSE_OF:
				return getInverseOf();
			case PivotmodelPackage.PROPERTY_DEFINITION__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
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
			case PivotmodelPackage.PROPERTY_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_FUNCTIONAL:
				setIsFunctional((Boolean)newValue);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_SYMMETRIC:
				setIsSymmetric((Boolean)newValue);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_TRANSITIVE:
				setIsTransitive((Boolean)newValue);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL:
				setIsInverseFunctional((Boolean)newValue);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__RANGE:
				setRange((DataTypeDefinition)newValue);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				getSubPropertyOf().addAll((Collection<? extends PropertyDefinition>)newValue);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__EQUIVALENT_TO:
				getEquivalentTo().clear();
				getEquivalentTo().addAll((Collection<? extends PropertyDefinition>)newValue);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__INVERSE_OF:
				getInverseOf().clear();
				getInverseOf().addAll((Collection<? extends PropertyDefinition>)newValue);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__DOMAIN:
				setDomain((ClassDefinition)newValue);
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
			case PivotmodelPackage.PROPERTY_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_FUNCTIONAL:
				setIsFunctional(IS_FUNCTIONAL_EDEFAULT);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_SYMMETRIC:
				setIsSymmetric(IS_SYMMETRIC_EDEFAULT);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_TRANSITIVE:
				setIsTransitive(IS_TRANSITIVE_EDEFAULT);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL:
				setIsInverseFunctional(IS_INVERSE_FUNCTIONAL_EDEFAULT);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__RANGE:
				setRange((DataTypeDefinition)null);
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__EQUIVALENT_TO:
				getEquivalentTo().clear();
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__INVERSE_OF:
				getInverseOf().clear();
				return;
			case PivotmodelPackage.PROPERTY_DEFINITION__DOMAIN:
				setDomain((ClassDefinition)null);
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
			case PivotmodelPackage.PROPERTY_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_FUNCTIONAL:
				return isFunctional != IS_FUNCTIONAL_EDEFAULT;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_SYMMETRIC:
				return isSymmetric != IS_SYMMETRIC_EDEFAULT;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_TRANSITIVE:
				return isTransitive != IS_TRANSITIVE_EDEFAULT;
			case PivotmodelPackage.PROPERTY_DEFINITION__IS_INVERSE_FUNCTIONAL:
				return isInverseFunctional != IS_INVERSE_FUNCTIONAL_EDEFAULT;
			case PivotmodelPackage.PROPERTY_DEFINITION__RANGE:
				return range != null;
			case PivotmodelPackage.PROPERTY_DEFINITION__SUB_PROPERTY_OF:
				return subPropertyOf != null && !subPropertyOf.isEmpty();
			case PivotmodelPackage.PROPERTY_DEFINITION__EQUIVALENT_TO:
				return equivalentTo != null && !equivalentTo.isEmpty();
			case PivotmodelPackage.PROPERTY_DEFINITION__INVERSE_OF:
				return inverseOf != null && !inverseOf.isEmpty();
			case PivotmodelPackage.PROPERTY_DEFINITION__DOMAIN:
				return domain != null;
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
		result.append(", isFunctional: ");
		result.append(isFunctional);
		result.append(", isSymmetric: ");
		result.append(isSymmetric);
		result.append(", isTransitive: ");
		result.append(isTransitive);
		result.append(", isInverseFunctional: ");
		result.append(isInverseFunctional);
		result.append(')');
		return result.toString();
	}

} //PropertyDefinitionImpl
