/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSSYMBOLSType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SYNONYMOUSSYMBOLS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SYNONYMOUSSYMBOLSTypeImpl#getMathematicalString <em>Mathematical String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SYNONYMOUSSYMBOLSTypeImpl extends MinimalEObjectImpl.Container implements SYNONYMOUSSYMBOLSType {
	/**
	 * The cached value of the '{@link #getMathematicalString() <em>Mathematical String</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathematicalString()
	 * @generated
	 * @ordered
	 */
	protected EList<MATHEMATICALSTRINGType> mathematicalString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SYNONYMOUSSYMBOLSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getSYNONYMOUSSYMBOLSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MATHEMATICALSTRINGType> getMathematicalString() {
		if (mathematicalString == null) {
			mathematicalString = new EObjectContainmentEList<MATHEMATICALSTRINGType>(MATHEMATICALSTRINGType.class, this, OntomlPackage.SYNONYMOUSSYMBOLS_TYPE__MATHEMATICAL_STRING);
		}
		return mathematicalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.SYNONYMOUSSYMBOLS_TYPE__MATHEMATICAL_STRING:
				return ((InternalEList<?>)getMathematicalString()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.SYNONYMOUSSYMBOLS_TYPE__MATHEMATICAL_STRING:
				return getMathematicalString();
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
			case OntomlPackage.SYNONYMOUSSYMBOLS_TYPE__MATHEMATICAL_STRING:
				getMathematicalString().clear();
				getMathematicalString().addAll((Collection<? extends MATHEMATICALSTRINGType>)newValue);
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
			case OntomlPackage.SYNONYMOUSSYMBOLS_TYPE__MATHEMATICAL_STRING:
				getMathematicalString().clear();
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
			case OntomlPackage.SYNONYMOUSSYMBOLS_TYPE__MATHEMATICAL_STRING:
				return mathematicalString != null && !mathematicalString.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SYNONYMOUSSYMBOLSTypeImpl
