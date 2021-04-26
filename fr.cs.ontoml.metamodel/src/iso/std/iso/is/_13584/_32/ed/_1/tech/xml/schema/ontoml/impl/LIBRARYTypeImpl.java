/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSEXTENSIONSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LIBRARY Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYTypeImpl#getContainedClassExtensions <em>Contained Class Extensions</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LIBRARYTypeImpl#getResponsibleSupplier <em>Responsible Supplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LIBRARYTypeImpl extends MinimalEObjectImpl.Container implements LIBRARYType {
	/**
	 * The cached value of the '{@link #getContainedClassExtensions() <em>Contained Class Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClassExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<CONTAINEDCLASSEXTENSIONSType> containedClassExtensions;

	/**
	 * The cached value of the '{@link #getResponsibleSupplier() <em>Responsible Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleSupplier()
	 * @generated
	 * @ordered
	 */
	protected SUPPLIERREFERENCEType responsibleSupplier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LIBRARYTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getLIBRARYType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CONTAINEDCLASSEXTENSIONSType> getContainedClassExtensions() {
		if (containedClassExtensions == null) {
			containedClassExtensions = new EObjectContainmentEList<CONTAINEDCLASSEXTENSIONSType>(CONTAINEDCLASSEXTENSIONSType.class, this, OntomlPackage.LIBRARY_TYPE__CONTAINED_CLASS_EXTENSIONS);
		}
		return containedClassExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERREFERENCEType getResponsibleSupplier() {
		return responsibleSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleSupplier(SUPPLIERREFERENCEType newResponsibleSupplier, NotificationChain msgs) {
		SUPPLIERREFERENCEType oldResponsibleSupplier = responsibleSupplier;
		responsibleSupplier = newResponsibleSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.LIBRARY_TYPE__RESPONSIBLE_SUPPLIER, oldResponsibleSupplier, newResponsibleSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleSupplier(SUPPLIERREFERENCEType newResponsibleSupplier) {
		if (newResponsibleSupplier != responsibleSupplier) {
			NotificationChain msgs = null;
			if (responsibleSupplier != null)
				msgs = ((InternalEObject)responsibleSupplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LIBRARY_TYPE__RESPONSIBLE_SUPPLIER, null, msgs);
			if (newResponsibleSupplier != null)
				msgs = ((InternalEObject)newResponsibleSupplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LIBRARY_TYPE__RESPONSIBLE_SUPPLIER, null, msgs);
			msgs = basicSetResponsibleSupplier(newResponsibleSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LIBRARY_TYPE__RESPONSIBLE_SUPPLIER, newResponsibleSupplier, newResponsibleSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.LIBRARY_TYPE__CONTAINED_CLASS_EXTENSIONS:
				return ((InternalEList<?>)getContainedClassExtensions()).basicRemove(otherEnd, msgs);
			case OntomlPackage.LIBRARY_TYPE__RESPONSIBLE_SUPPLIER:
				return basicSetResponsibleSupplier(null, msgs);
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
			case OntomlPackage.LIBRARY_TYPE__CONTAINED_CLASS_EXTENSIONS:
				return getContainedClassExtensions();
			case OntomlPackage.LIBRARY_TYPE__RESPONSIBLE_SUPPLIER:
				return getResponsibleSupplier();
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
			case OntomlPackage.LIBRARY_TYPE__CONTAINED_CLASS_EXTENSIONS:
				getContainedClassExtensions().clear();
				getContainedClassExtensions().addAll((Collection<? extends CONTAINEDCLASSEXTENSIONSType>)newValue);
				return;
			case OntomlPackage.LIBRARY_TYPE__RESPONSIBLE_SUPPLIER:
				setResponsibleSupplier((SUPPLIERREFERENCEType)newValue);
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
			case OntomlPackage.LIBRARY_TYPE__CONTAINED_CLASS_EXTENSIONS:
				getContainedClassExtensions().clear();
				return;
			case OntomlPackage.LIBRARY_TYPE__RESPONSIBLE_SUPPLIER:
				setResponsibleSupplier((SUPPLIERREFERENCEType)null);
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
			case OntomlPackage.LIBRARY_TYPE__CONTAINED_CLASS_EXTENSIONS:
				return containedClassExtensions != null && !containedClassExtensions.isEmpty();
			case OntomlPackage.LIBRARY_TYPE__RESPONSIBLE_SUPPLIER:
				return responsibleSupplier != null;
		}
		return super.eIsSet(featureID);
	}

} //LIBRARYTypeImpl
