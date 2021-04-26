/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPORTEDVEPType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VIEWEXCHANGEPROTOCOLIDENTIFICATIONType;

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
 * An implementation of the model object '<em><b>SUPPORTEDVEP Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.SUPPORTEDVEPTypeImpl#getViewExchangeProtocolIdentification <em>View Exchange Protocol Identification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SUPPORTEDVEPTypeImpl extends MinimalEObjectImpl.Container implements SUPPORTEDVEPType {
	/**
	 * The cached value of the '{@link #getViewExchangeProtocolIdentification() <em>View Exchange Protocol Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewExchangeProtocolIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<VIEWEXCHANGEPROTOCOLIDENTIFICATIONType> viewExchangeProtocolIdentification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUPPORTEDVEPTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getSUPPORTEDVEPType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VIEWEXCHANGEPROTOCOLIDENTIFICATIONType> getViewExchangeProtocolIdentification() {
		if (viewExchangeProtocolIdentification == null) {
			viewExchangeProtocolIdentification = new EObjectContainmentEList<VIEWEXCHANGEPROTOCOLIDENTIFICATIONType>(VIEWEXCHANGEPROTOCOLIDENTIFICATIONType.class, this, OntomlPackage.SUPPORTEDVEP_TYPE__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATION);
		}
		return viewExchangeProtocolIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.SUPPORTEDVEP_TYPE__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATION:
				return ((InternalEList<?>)getViewExchangeProtocolIdentification()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.SUPPORTEDVEP_TYPE__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATION:
				return getViewExchangeProtocolIdentification();
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
			case OntomlPackage.SUPPORTEDVEP_TYPE__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATION:
				getViewExchangeProtocolIdentification().clear();
				getViewExchangeProtocolIdentification().addAll((Collection<? extends VIEWEXCHANGEPROTOCOLIDENTIFICATIONType>)newValue);
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
			case OntomlPackage.SUPPORTEDVEP_TYPE__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATION:
				getViewExchangeProtocolIdentification().clear();
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
			case OntomlPackage.SUPPORTEDVEP_TYPE__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATION:
				return viewExchangeProtocolIdentification != null && !viewExchangeProtocolIdentification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SUPPORTEDVEPTypeImpl
