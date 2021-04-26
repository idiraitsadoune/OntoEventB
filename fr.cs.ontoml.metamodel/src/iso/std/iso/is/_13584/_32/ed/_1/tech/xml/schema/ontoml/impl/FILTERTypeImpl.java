/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ENUMERATIONCONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FILTERType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTYREFERENCEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FILTER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FILTERTypeImpl#getReferencedProperty <em>Referenced Property</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FILTERTypeImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FILTERTypeImpl extends MinimalEObjectImpl.Container implements FILTERType {
	/**
	 * The cached value of the '{@link #getReferencedProperty() <em>Referenced Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedProperty()
	 * @generated
	 * @ordered
	 */
	protected PROPERTYREFERENCEType referencedProperty;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected ENUMERATIONCONSTRAINTType domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FILTERTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getFILTERType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCEType getReferencedProperty() {
		return referencedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedProperty(PROPERTYREFERENCEType newReferencedProperty, NotificationChain msgs) {
		PROPERTYREFERENCEType oldReferencedProperty = referencedProperty;
		referencedProperty = newReferencedProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FILTER_TYPE__REFERENCED_PROPERTY, oldReferencedProperty, newReferencedProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedProperty(PROPERTYREFERENCEType newReferencedProperty) {
		if (newReferencedProperty != referencedProperty) {
			NotificationChain msgs = null;
			if (referencedProperty != null)
				msgs = ((InternalEObject)referencedProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FILTER_TYPE__REFERENCED_PROPERTY, null, msgs);
			if (newReferencedProperty != null)
				msgs = ((InternalEObject)newReferencedProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FILTER_TYPE__REFERENCED_PROPERTY, null, msgs);
			msgs = basicSetReferencedProperty(newReferencedProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FILTER_TYPE__REFERENCED_PROPERTY, newReferencedProperty, newReferencedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMERATIONCONSTRAINTType getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(ENUMERATIONCONSTRAINTType newDomain, NotificationChain msgs) {
		ENUMERATIONCONSTRAINTType oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FILTER_TYPE__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(ENUMERATIONCONSTRAINTType newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FILTER_TYPE__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FILTER_TYPE__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FILTER_TYPE__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.FILTER_TYPE__REFERENCED_PROPERTY:
				return basicSetReferencedProperty(null, msgs);
			case OntomlPackage.FILTER_TYPE__DOMAIN:
				return basicSetDomain(null, msgs);
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
			case OntomlPackage.FILTER_TYPE__REFERENCED_PROPERTY:
				return getReferencedProperty();
			case OntomlPackage.FILTER_TYPE__DOMAIN:
				return getDomain();
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
			case OntomlPackage.FILTER_TYPE__REFERENCED_PROPERTY:
				setReferencedProperty((PROPERTYREFERENCEType)newValue);
				return;
			case OntomlPackage.FILTER_TYPE__DOMAIN:
				setDomain((ENUMERATIONCONSTRAINTType)newValue);
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
			case OntomlPackage.FILTER_TYPE__REFERENCED_PROPERTY:
				setReferencedProperty((PROPERTYREFERENCEType)null);
				return;
			case OntomlPackage.FILTER_TYPE__DOMAIN:
				setDomain((ENUMERATIONCONSTRAINTType)null);
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
			case OntomlPackage.FILTER_TYPE__REFERENCED_PROPERTY:
				return referencedProperty != null;
			case OntomlPackage.FILTER_TYPE__DOMAIN:
				return domain != null;
		}
		return super.eIsSet(featureID);
	}

} //FILTERTypeImpl
