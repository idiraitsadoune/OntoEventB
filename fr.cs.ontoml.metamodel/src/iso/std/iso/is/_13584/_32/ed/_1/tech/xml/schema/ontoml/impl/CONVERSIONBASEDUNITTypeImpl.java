/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONVERSIONBASEDUNITType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.UNITType;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONVERSIONBASEDUNIT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONVERSIONBASEDUNITTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONVERSIONBASEDUNITTypeImpl#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONVERSIONBASEDUNITTypeImpl#getUnitComponent <em>Unit Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONVERSIONBASEDUNITTypeImpl extends NAMEDUNITTypeImpl implements CONVERSIONBASEDUNITType {
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
	 * The default value of the '{@link #getValueComponent() <em>Value Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComponent()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VALUE_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueComponent() <em>Value Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComponent()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal valueComponent = VALUE_COMPONENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnitComponent() <em>Unit Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitComponent()
	 * @generated
	 * @ordered
	 */
	protected UNITType unitComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONVERSIONBASEDUNITTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCONVERSIONBASEDUNITType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CONVERSIONBASEDUNIT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getValueComponent() {
		return valueComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueComponent(BigDecimal newValueComponent) {
		BigDecimal oldValueComponent = valueComponent;
		valueComponent = newValueComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CONVERSIONBASEDUNIT_TYPE__VALUE_COMPONENT, oldValueComponent, valueComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNITType getUnitComponent() {
		return unitComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitComponent(UNITType newUnitComponent, NotificationChain msgs) {
		UNITType oldUnitComponent = unitComponent;
		unitComponent = newUnitComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT, oldUnitComponent, newUnitComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitComponent(UNITType newUnitComponent) {
		if (newUnitComponent != unitComponent) {
			NotificationChain msgs = null;
			if (unitComponent != null)
				msgs = ((InternalEObject)unitComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT, null, msgs);
			if (newUnitComponent != null)
				msgs = ((InternalEObject)newUnitComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT, null, msgs);
			msgs = basicSetUnitComponent(newUnitComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT, newUnitComponent, newUnitComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT:
				return basicSetUnitComponent(null, msgs);
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
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__NAME:
				return getName();
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__VALUE_COMPONENT:
				return getValueComponent();
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT:
				return getUnitComponent();
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
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__NAME:
				setName((String)newValue);
				return;
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__VALUE_COMPONENT:
				setValueComponent((BigDecimal)newValue);
				return;
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT:
				setUnitComponent((UNITType)newValue);
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
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__VALUE_COMPONENT:
				setValueComponent(VALUE_COMPONENT_EDEFAULT);
				return;
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT:
				setUnitComponent((UNITType)null);
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
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__VALUE_COMPONENT:
				return VALUE_COMPONENT_EDEFAULT == null ? valueComponent != null : !VALUE_COMPONENT_EDEFAULT.equals(valueComponent);
			case OntomlPackage.CONVERSIONBASEDUNIT_TYPE__UNIT_COMPONENT:
				return unitComponent != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", valueComponent: ");
		result.append(valueComponent);
		result.append(')');
		return result.toString();
	}

} //CONVERSIONBASEDUNITTypeImpl
