/**
 */
package iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CataloguePackage;
import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.ReferenceType;

import iso.std.iso.ts._29002._4.ed._1.tech.xml.schema.basic.InternationalTextType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ReferenceTypeImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ReferenceTypeImpl#getOrganizationCode <em>Organization Code</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ReferenceTypeImpl#getOrganizationRef <em>Organization Ref</em>}</li>
 *   <li>{@link iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.impl.ReferenceTypeImpl#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceTypeImpl extends MinimalEObjectImpl.Container implements ReferenceType {
	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected InternationalTextType designation;

	/**
	 * The default value of the '{@link #getOrganizationCode() <em>Organization Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationCode() <em>Organization Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationCode()
	 * @generated
	 * @ordered
	 */
	protected String organizationCode = ORGANIZATION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationRef() <em>Organization Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationRef() <em>Organization Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRef()
	 * @generated
	 * @ordered
	 */
	protected String organizationRef = ORGANIZATION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalTextType getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignation(InternationalTextType newDesignation, NotificationChain msgs) {
		InternationalTextType oldDesignation = designation;
		designation = newDesignation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CataloguePackage.REFERENCE_TYPE__DESIGNATION, oldDesignation, newDesignation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignation(InternationalTextType newDesignation) {
		if (newDesignation != designation) {
			NotificationChain msgs = null;
			if (designation != null)
				msgs = ((InternalEObject)designation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.REFERENCE_TYPE__DESIGNATION, null, msgs);
			if (newDesignation != null)
				msgs = ((InternalEObject)newDesignation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.REFERENCE_TYPE__DESIGNATION, null, msgs);
			msgs = basicSetDesignation(newDesignation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.REFERENCE_TYPE__DESIGNATION, newDesignation, newDesignation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationCode() {
		return organizationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationCode(String newOrganizationCode) {
		String oldOrganizationCode = organizationCode;
		organizationCode = newOrganizationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.REFERENCE_TYPE__ORGANIZATION_CODE, oldOrganizationCode, organizationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationRef() {
		return organizationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationRef(String newOrganizationRef) {
		String oldOrganizationRef = organizationRef;
		organizationRef = newOrganizationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.REFERENCE_TYPE__ORGANIZATION_REF, oldOrganizationRef, organizationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNumber(String newReferenceNumber) {
		String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.REFERENCE_TYPE__REFERENCE_NUMBER, oldReferenceNumber, referenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CataloguePackage.REFERENCE_TYPE__DESIGNATION:
				return basicSetDesignation(null, msgs);
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
			case CataloguePackage.REFERENCE_TYPE__DESIGNATION:
				return getDesignation();
			case CataloguePackage.REFERENCE_TYPE__ORGANIZATION_CODE:
				return getOrganizationCode();
			case CataloguePackage.REFERENCE_TYPE__ORGANIZATION_REF:
				return getOrganizationRef();
			case CataloguePackage.REFERENCE_TYPE__REFERENCE_NUMBER:
				return getReferenceNumber();
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
			case CataloguePackage.REFERENCE_TYPE__DESIGNATION:
				setDesignation((InternationalTextType)newValue);
				return;
			case CataloguePackage.REFERENCE_TYPE__ORGANIZATION_CODE:
				setOrganizationCode((String)newValue);
				return;
			case CataloguePackage.REFERENCE_TYPE__ORGANIZATION_REF:
				setOrganizationRef((String)newValue);
				return;
			case CataloguePackage.REFERENCE_TYPE__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
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
			case CataloguePackage.REFERENCE_TYPE__DESIGNATION:
				setDesignation((InternationalTextType)null);
				return;
			case CataloguePackage.REFERENCE_TYPE__ORGANIZATION_CODE:
				setOrganizationCode(ORGANIZATION_CODE_EDEFAULT);
				return;
			case CataloguePackage.REFERENCE_TYPE__ORGANIZATION_REF:
				setOrganizationRef(ORGANIZATION_REF_EDEFAULT);
				return;
			case CataloguePackage.REFERENCE_TYPE__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
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
			case CataloguePackage.REFERENCE_TYPE__DESIGNATION:
				return designation != null;
			case CataloguePackage.REFERENCE_TYPE__ORGANIZATION_CODE:
				return ORGANIZATION_CODE_EDEFAULT == null ? organizationCode != null : !ORGANIZATION_CODE_EDEFAULT.equals(organizationCode);
			case CataloguePackage.REFERENCE_TYPE__ORGANIZATION_REF:
				return ORGANIZATION_REF_EDEFAULT == null ? organizationRef != null : !ORGANIZATION_REF_EDEFAULT.equals(organizationRef);
			case CataloguePackage.REFERENCE_TYPE__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
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
		result.append(" (organizationCode: ");
		result.append(organizationCode);
		result.append(", organizationRef: ");
		result.append(organizationRef);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
		result.append(')');
		return result.toString();
	}

} //ReferenceTypeImpl
