/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MATHEMATICALSTRINGType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.UNITType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DICUNIT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITTypeImpl#getStructuredRepresentation <em>Structured Representation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITTypeImpl#getStringRepresentation <em>String Representation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICUNITTypeImpl#getUnitRef <em>Unit Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DICUNITTypeImpl extends MinimalEObjectImpl.Container implements DICUNITType {
	/**
	 * The cached value of the '{@link #getStructuredRepresentation() <em>Structured Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredRepresentation()
	 * @generated
	 * @ordered
	 */
	protected UNITType structuredRepresentation;

	/**
	 * The cached value of the '{@link #getStringRepresentation() <em>String Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringRepresentation()
	 * @generated
	 * @ordered
	 */
	protected MATHEMATICALSTRINGType stringRepresentation;

	/**
	 * The default value of the '{@link #getUnitRef() <em>Unit Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitRef()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitRef() <em>Unit Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitRef()
	 * @generated
	 * @ordered
	 */
	protected String unitRef = UNIT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICUNITTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDICUNITType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNITType getStructuredRepresentation() {
		return structuredRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredRepresentation(UNITType newStructuredRepresentation, NotificationChain msgs) {
		UNITType oldStructuredRepresentation = structuredRepresentation;
		structuredRepresentation = newStructuredRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICUNIT_TYPE__STRUCTURED_REPRESENTATION, oldStructuredRepresentation, newStructuredRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredRepresentation(UNITType newStructuredRepresentation) {
		if (newStructuredRepresentation != structuredRepresentation) {
			NotificationChain msgs = null;
			if (structuredRepresentation != null)
				msgs = ((InternalEObject)structuredRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICUNIT_TYPE__STRUCTURED_REPRESENTATION, null, msgs);
			if (newStructuredRepresentation != null)
				msgs = ((InternalEObject)newStructuredRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICUNIT_TYPE__STRUCTURED_REPRESENTATION, null, msgs);
			msgs = basicSetStructuredRepresentation(newStructuredRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICUNIT_TYPE__STRUCTURED_REPRESENTATION, newStructuredRepresentation, newStructuredRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MATHEMATICALSTRINGType getStringRepresentation() {
		return stringRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringRepresentation(MATHEMATICALSTRINGType newStringRepresentation, NotificationChain msgs) {
		MATHEMATICALSTRINGType oldStringRepresentation = stringRepresentation;
		stringRepresentation = newStringRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICUNIT_TYPE__STRING_REPRESENTATION, oldStringRepresentation, newStringRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringRepresentation(MATHEMATICALSTRINGType newStringRepresentation) {
		if (newStringRepresentation != stringRepresentation) {
			NotificationChain msgs = null;
			if (stringRepresentation != null)
				msgs = ((InternalEObject)stringRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICUNIT_TYPE__STRING_REPRESENTATION, null, msgs);
			if (newStringRepresentation != null)
				msgs = ((InternalEObject)newStringRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICUNIT_TYPE__STRING_REPRESENTATION, null, msgs);
			msgs = basicSetStringRepresentation(newStringRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICUNIT_TYPE__STRING_REPRESENTATION, newStringRepresentation, newStringRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitRef() {
		return unitRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitRef(String newUnitRef) {
		String oldUnitRef = unitRef;
		unitRef = newUnitRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICUNIT_TYPE__UNIT_REF, oldUnitRef, unitRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.DICUNIT_TYPE__STRUCTURED_REPRESENTATION:
				return basicSetStructuredRepresentation(null, msgs);
			case OntomlPackage.DICUNIT_TYPE__STRING_REPRESENTATION:
				return basicSetStringRepresentation(null, msgs);
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
			case OntomlPackage.DICUNIT_TYPE__STRUCTURED_REPRESENTATION:
				return getStructuredRepresentation();
			case OntomlPackage.DICUNIT_TYPE__STRING_REPRESENTATION:
				return getStringRepresentation();
			case OntomlPackage.DICUNIT_TYPE__UNIT_REF:
				return getUnitRef();
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
			case OntomlPackage.DICUNIT_TYPE__STRUCTURED_REPRESENTATION:
				setStructuredRepresentation((UNITType)newValue);
				return;
			case OntomlPackage.DICUNIT_TYPE__STRING_REPRESENTATION:
				setStringRepresentation((MATHEMATICALSTRINGType)newValue);
				return;
			case OntomlPackage.DICUNIT_TYPE__UNIT_REF:
				setUnitRef((String)newValue);
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
			case OntomlPackage.DICUNIT_TYPE__STRUCTURED_REPRESENTATION:
				setStructuredRepresentation((UNITType)null);
				return;
			case OntomlPackage.DICUNIT_TYPE__STRING_REPRESENTATION:
				setStringRepresentation((MATHEMATICALSTRINGType)null);
				return;
			case OntomlPackage.DICUNIT_TYPE__UNIT_REF:
				setUnitRef(UNIT_REF_EDEFAULT);
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
			case OntomlPackage.DICUNIT_TYPE__STRUCTURED_REPRESENTATION:
				return structuredRepresentation != null;
			case OntomlPackage.DICUNIT_TYPE__STRING_REPRESENTATION:
				return stringRepresentation != null;
			case OntomlPackage.DICUNIT_TYPE__UNIT_REF:
				return UNIT_REF_EDEFAULT == null ? unitRef != null : !UNIT_REF_EDEFAULT.equals(unitRef);
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
		result.append(" (unitRef: ");
		result.append(unitRef);
		result.append(')');
		return result.toString();
	}

} //DICUNITTypeImpl
