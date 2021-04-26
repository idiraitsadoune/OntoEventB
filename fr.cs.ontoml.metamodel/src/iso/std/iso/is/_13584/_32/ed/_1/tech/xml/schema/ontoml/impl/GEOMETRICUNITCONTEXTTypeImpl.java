/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICUNITCONTEXTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEOMETRICUNITCONTEXT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICUNITCONTEXTTypeImpl#getLengthUnit <em>Length Unit</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICUNITCONTEXTTypeImpl#getLengthUnitId <em>Length Unit Id</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICUNITCONTEXTTypeImpl#getLangleUnit <em>Langle Unit</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICUNITCONTEXTTypeImpl#getAngleUnitId <em>Angle Unit Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEOMETRICUNITCONTEXTTypeImpl extends MinimalEObjectImpl.Container implements GEOMETRICUNITCONTEXTType {
	/**
	 * The cached value of the '{@link #getLengthUnit() <em>Length Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthUnit()
	 * @generated
	 * @ordered
	 */
	protected DICUNITType lengthUnit;

	/**
	 * The cached value of the '{@link #getLengthUnitId() <em>Length Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthUnitId()
	 * @generated
	 * @ordered
	 */
	protected DICUNITREFERENCEType lengthUnitId;

	/**
	 * The cached value of the '{@link #getLangleUnit() <em>Langle Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangleUnit()
	 * @generated
	 * @ordered
	 */
	protected DICUNITType langleUnit;

	/**
	 * The cached value of the '{@link #getAngleUnitId() <em>Angle Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleUnitId()
	 * @generated
	 * @ordered
	 */
	protected DICUNITREFERENCEType angleUnitId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEOMETRICUNITCONTEXTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getGEOMETRICUNITCONTEXTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITType getLengthUnit() {
		return lengthUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLengthUnit(DICUNITType newLengthUnit, NotificationChain msgs) {
		DICUNITType oldLengthUnit = lengthUnit;
		lengthUnit = newLengthUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT, oldLengthUnit, newLengthUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthUnit(DICUNITType newLengthUnit) {
		if (newLengthUnit != lengthUnit) {
			NotificationChain msgs = null;
			if (lengthUnit != null)
				msgs = ((InternalEObject)lengthUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT, null, msgs);
			if (newLengthUnit != null)
				msgs = ((InternalEObject)newLengthUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT, null, msgs);
			msgs = basicSetLengthUnit(newLengthUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT, newLengthUnit, newLengthUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITREFERENCEType getLengthUnitId() {
		return lengthUnitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLengthUnitId(DICUNITREFERENCEType newLengthUnitId, NotificationChain msgs) {
		DICUNITREFERENCEType oldLengthUnitId = lengthUnitId;
		lengthUnitId = newLengthUnitId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID, oldLengthUnitId, newLengthUnitId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthUnitId(DICUNITREFERENCEType newLengthUnitId) {
		if (newLengthUnitId != lengthUnitId) {
			NotificationChain msgs = null;
			if (lengthUnitId != null)
				msgs = ((InternalEObject)lengthUnitId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID, null, msgs);
			if (newLengthUnitId != null)
				msgs = ((InternalEObject)newLengthUnitId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID, null, msgs);
			msgs = basicSetLengthUnitId(newLengthUnitId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID, newLengthUnitId, newLengthUnitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITType getLangleUnit() {
		return langleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangleUnit(DICUNITType newLangleUnit, NotificationChain msgs) {
		DICUNITType oldLangleUnit = langleUnit;
		langleUnit = newLangleUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT, oldLangleUnit, newLangleUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangleUnit(DICUNITType newLangleUnit) {
		if (newLangleUnit != langleUnit) {
			NotificationChain msgs = null;
			if (langleUnit != null)
				msgs = ((InternalEObject)langleUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT, null, msgs);
			if (newLangleUnit != null)
				msgs = ((InternalEObject)newLangleUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT, null, msgs);
			msgs = basicSetLangleUnit(newLangleUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT, newLangleUnit, newLangleUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITREFERENCEType getAngleUnitId() {
		return angleUnitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleUnitId(DICUNITREFERENCEType newAngleUnitId, NotificationChain msgs) {
		DICUNITREFERENCEType oldAngleUnitId = angleUnitId;
		angleUnitId = newAngleUnitId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID, oldAngleUnitId, newAngleUnitId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleUnitId(DICUNITREFERENCEType newAngleUnitId) {
		if (newAngleUnitId != angleUnitId) {
			NotificationChain msgs = null;
			if (angleUnitId != null)
				msgs = ((InternalEObject)angleUnitId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID, null, msgs);
			if (newAngleUnitId != null)
				msgs = ((InternalEObject)newAngleUnitId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID, null, msgs);
			msgs = basicSetAngleUnitId(newAngleUnitId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID, newAngleUnitId, newAngleUnitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT:
				return basicSetLengthUnit(null, msgs);
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID:
				return basicSetLengthUnitId(null, msgs);
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT:
				return basicSetLangleUnit(null, msgs);
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID:
				return basicSetAngleUnitId(null, msgs);
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
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT:
				return getLengthUnit();
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID:
				return getLengthUnitId();
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT:
				return getLangleUnit();
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID:
				return getAngleUnitId();
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
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT:
				setLengthUnit((DICUNITType)newValue);
				return;
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID:
				setLengthUnitId((DICUNITREFERENCEType)newValue);
				return;
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT:
				setLangleUnit((DICUNITType)newValue);
				return;
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID:
				setAngleUnitId((DICUNITREFERENCEType)newValue);
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
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT:
				setLengthUnit((DICUNITType)null);
				return;
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID:
				setLengthUnitId((DICUNITREFERENCEType)null);
				return;
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT:
				setLangleUnit((DICUNITType)null);
				return;
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID:
				setAngleUnitId((DICUNITREFERENCEType)null);
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
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT:
				return lengthUnit != null;
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LENGTH_UNIT_ID:
				return lengthUnitId != null;
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__LANGLE_UNIT:
				return langleUnit != null;
			case OntomlPackage.GEOMETRICUNITCONTEXT_TYPE__ANGLE_UNIT_ID:
				return angleUnitId != null;
		}
		return super.eIsSet(featureID);
	}

} //GEOMETRICUNITCONTEXTTypeImpl
