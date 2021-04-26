/**
 */
package iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.BasicPackage;
import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType;
import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.LanguageStringType;

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
 * An implementation of the model object '<em><b>International Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.impl.InternationalTextTypeImpl#getLocalString <em>Local String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternationalTextTypeImpl extends MinimalEObjectImpl.Container implements InternationalTextType {
	/**
	 * The cached value of the '{@link #getLocalString() <em>Local String</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalString()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageStringType> localString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternationalTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.INTERNATIONAL_TEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageStringType> getLocalString() {
		if (localString == null) {
			localString = new EObjectContainmentEList<LanguageStringType>(LanguageStringType.class, this, BasicPackage.INTERNATIONAL_TEXT_TYPE__LOCAL_STRING);
		}
		return localString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.INTERNATIONAL_TEXT_TYPE__LOCAL_STRING:
				return ((InternalEList<?>)getLocalString()).basicRemove(otherEnd, msgs);
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
			case BasicPackage.INTERNATIONAL_TEXT_TYPE__LOCAL_STRING:
				return getLocalString();
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
			case BasicPackage.INTERNATIONAL_TEXT_TYPE__LOCAL_STRING:
				getLocalString().clear();
				getLocalString().addAll((Collection<? extends LanguageStringType>)newValue);
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
			case BasicPackage.INTERNATIONAL_TEXT_TYPE__LOCAL_STRING:
				getLocalString().clear();
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
			case BasicPackage.INTERNATIONAL_TEXT_TYPE__LOCAL_STRING:
				return localString != null && !localString.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternationalTextTypeImpl
