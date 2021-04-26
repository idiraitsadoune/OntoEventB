/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITELEMENTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DERIVEDUNITType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DERIVEDUNIT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DERIVEDUNITTypeImpl#getDerivedUnitElement <em>Derived Unit Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DERIVEDUNITTypeImpl extends UNITTypeImpl implements DERIVEDUNITType {
	/**
	 * The cached value of the '{@link #getDerivedUnitElement() <em>Derived Unit Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedUnitElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DERIVEDUNITELEMENTType> derivedUnitElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DERIVEDUNITTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDERIVEDUNITType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DERIVEDUNITELEMENTType> getDerivedUnitElement() {
		if (derivedUnitElement == null) {
			derivedUnitElement = new EObjectContainmentEList<DERIVEDUNITELEMENTType>(DERIVEDUNITELEMENTType.class, this, OntomlPackage.DERIVEDUNIT_TYPE__DERIVED_UNIT_ELEMENT);
		}
		return derivedUnitElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.DERIVEDUNIT_TYPE__DERIVED_UNIT_ELEMENT:
				return ((InternalEList<?>)getDerivedUnitElement()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.DERIVEDUNIT_TYPE__DERIVED_UNIT_ELEMENT:
				return getDerivedUnitElement();
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
			case OntomlPackage.DERIVEDUNIT_TYPE__DERIVED_UNIT_ELEMENT:
				getDerivedUnitElement().clear();
				getDerivedUnitElement().addAll((Collection<? extends DERIVEDUNITELEMENTType>)newValue);
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
			case OntomlPackage.DERIVEDUNIT_TYPE__DERIVED_UNIT_ELEMENT:
				getDerivedUnitElement().clear();
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
			case OntomlPackage.DERIVEDUNIT_TYPE__DERIVED_UNIT_ELEMENT:
				return derivedUnitElement != null && !derivedUnitElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DERIVEDUNITTypeImpl
