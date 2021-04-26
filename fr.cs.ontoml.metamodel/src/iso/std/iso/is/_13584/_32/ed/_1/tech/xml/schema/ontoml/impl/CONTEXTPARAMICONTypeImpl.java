/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMICONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

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
 * An implementation of the model object '<em><b>CONTEXTPARAMICON Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONTEXTPARAMICONTypeImpl#getA6Illustration <em>A6 Illustration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTEXTPARAMICONTypeImpl extends MinimalEObjectImpl.Container implements CONTEXTPARAMICONType {
	/**
	 * The cached value of the '{@link #getA6Illustration() <em>A6 Illustration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA6Illustration()
	 * @generated
	 * @ordered
	 */
	protected EList<ILLUSTRATIONType> a6Illustration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTEXTPARAMICONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCONTEXTPARAMICONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ILLUSTRATIONType> getA6Illustration() {
		if (a6Illustration == null) {
			a6Illustration = new EObjectContainmentEList<ILLUSTRATIONType>(ILLUSTRATIONType.class, this, OntomlPackage.CONTEXTPARAMICON_TYPE__A6_ILLUSTRATION);
		}
		return a6Illustration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CONTEXTPARAMICON_TYPE__A6_ILLUSTRATION:
				return ((InternalEList<?>)getA6Illustration()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.CONTEXTPARAMICON_TYPE__A6_ILLUSTRATION:
				return getA6Illustration();
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
			case OntomlPackage.CONTEXTPARAMICON_TYPE__A6_ILLUSTRATION:
				getA6Illustration().clear();
				getA6Illustration().addAll((Collection<? extends ILLUSTRATIONType>)newValue);
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
			case OntomlPackage.CONTEXTPARAMICON_TYPE__A6_ILLUSTRATION:
				getA6Illustration().clear();
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
			case OntomlPackage.CONTEXTPARAMICON_TYPE__A6_ILLUSTRATION:
				return a6Illustration != null && !a6Illustration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CONTEXTPARAMICONTypeImpl
