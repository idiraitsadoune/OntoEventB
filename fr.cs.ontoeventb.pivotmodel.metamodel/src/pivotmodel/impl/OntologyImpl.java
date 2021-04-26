/**
 */
package pivotmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pivotmodel.ClassDefinition;
import pivotmodel.DataTypeDefinition;
import pivotmodel.Ontology;
import pivotmodel.PivotmodelPackage;
import pivotmodel.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.impl.OntologyImpl#getName <em>Name</em>}</li>
 *   <li>{@link pivotmodel.impl.OntologyImpl#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link pivotmodel.impl.OntologyImpl#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link pivotmodel.impl.OntologyImpl#getContainedDataTypes <em>Contained Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyImpl extends MinimalEObjectImpl.Container implements Ontology {
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
	 * The cached value of the '{@link #getContainedClasses() <em>Contained Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinition> containedClasses;

	/**
	 * The cached value of the '{@link #getContainedProperties() <em>Contained Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDefinition> containedProperties;

	/**
	 * The cached value of the '{@link #getContainedDataTypes() <em>Contained Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeDefinition> containedDataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotmodelPackage.Literals.ONTOLOGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PivotmodelPackage.ONTOLOGY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassDefinition> getContainedClasses() {
		if (containedClasses == null) {
			containedClasses = new EObjectContainmentEList<ClassDefinition>(ClassDefinition.class, this, PivotmodelPackage.ONTOLOGY__CONTAINED_CLASSES);
		}
		return containedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyDefinition> getContainedProperties() {
		if (containedProperties == null) {
			containedProperties = new EObjectContainmentEList<PropertyDefinition>(PropertyDefinition.class, this, PivotmodelPackage.ONTOLOGY__CONTAINED_PROPERTIES);
		}
		return containedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataTypeDefinition> getContainedDataTypes() {
		if (containedDataTypes == null) {
			containedDataTypes = new EObjectContainmentEList<DataTypeDefinition>(DataTypeDefinition.class, this, PivotmodelPackage.ONTOLOGY__CONTAINED_DATA_TYPES);
		}
		return containedDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PivotmodelPackage.ONTOLOGY__CONTAINED_CLASSES:
				return ((InternalEList<?>)getContainedClasses()).basicRemove(otherEnd, msgs);
			case PivotmodelPackage.ONTOLOGY__CONTAINED_PROPERTIES:
				return ((InternalEList<?>)getContainedProperties()).basicRemove(otherEnd, msgs);
			case PivotmodelPackage.ONTOLOGY__CONTAINED_DATA_TYPES:
				return ((InternalEList<?>)getContainedDataTypes()).basicRemove(otherEnd, msgs);
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
			case PivotmodelPackage.ONTOLOGY__NAME:
				return getName();
			case PivotmodelPackage.ONTOLOGY__CONTAINED_CLASSES:
				return getContainedClasses();
			case PivotmodelPackage.ONTOLOGY__CONTAINED_PROPERTIES:
				return getContainedProperties();
			case PivotmodelPackage.ONTOLOGY__CONTAINED_DATA_TYPES:
				return getContainedDataTypes();
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
			case PivotmodelPackage.ONTOLOGY__NAME:
				setName((String)newValue);
				return;
			case PivotmodelPackage.ONTOLOGY__CONTAINED_CLASSES:
				getContainedClasses().clear();
				getContainedClasses().addAll((Collection<? extends ClassDefinition>)newValue);
				return;
			case PivotmodelPackage.ONTOLOGY__CONTAINED_PROPERTIES:
				getContainedProperties().clear();
				getContainedProperties().addAll((Collection<? extends PropertyDefinition>)newValue);
				return;
			case PivotmodelPackage.ONTOLOGY__CONTAINED_DATA_TYPES:
				getContainedDataTypes().clear();
				getContainedDataTypes().addAll((Collection<? extends DataTypeDefinition>)newValue);
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
			case PivotmodelPackage.ONTOLOGY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotmodelPackage.ONTOLOGY__CONTAINED_CLASSES:
				getContainedClasses().clear();
				return;
			case PivotmodelPackage.ONTOLOGY__CONTAINED_PROPERTIES:
				getContainedProperties().clear();
				return;
			case PivotmodelPackage.ONTOLOGY__CONTAINED_DATA_TYPES:
				getContainedDataTypes().clear();
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
			case PivotmodelPackage.ONTOLOGY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotmodelPackage.ONTOLOGY__CONTAINED_CLASSES:
				return containedClasses != null && !containedClasses.isEmpty();
			case PivotmodelPackage.ONTOLOGY__CONTAINED_PROPERTIES:
				return containedProperties != null && !containedProperties.isEmpty();
			case PivotmodelPackage.ONTOLOGY__CONTAINED_DATA_TYPES:
				return containedDataTypes != null && !containedDataTypes.isEmpty();
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

} //OntologyImpl
