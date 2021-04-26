/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ALTERNATIVEUNITSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICUNITType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REALMEASURETYPEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REALMEASURETYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALMEASURETYPETypeImpl#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALMEASURETYPETypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALMEASURETYPETypeImpl#getAlternativeUnits <em>Alternative Units</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALMEASURETYPETypeImpl#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REALMEASURETYPETypeImpl#getAlternativeUnitIds <em>Alternative Unit Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REALMEASURETYPETypeImpl extends ANYTYPETypeImpl implements REALMEASURETYPEType {
	/**
	 * The default value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected String valueFormat = VALUE_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected DICUNITType unit;

	/**
	 * The cached value of the '{@link #getAlternativeUnits() <em>Alternative Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeUnits()
	 * @generated
	 * @ordered
	 */
	protected ALTERNATIVEUNITSType alternativeUnits;

	/**
	 * The cached value of the '{@link #getUnitId() <em>Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitId()
	 * @generated
	 * @ordered
	 */
	protected DICUNITREFERENCEType unitId;

	/**
	 * The cached value of the '{@link #getAlternativeUnitIds() <em>Alternative Unit Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeUnitIds()
	 * @generated
	 * @ordered
	 */
	protected DICUNITSREFERENCEType alternativeUnitIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REALMEASURETYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getREALMEASURETYPEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueFormat(String newValueFormat) {
		String oldValueFormat = valueFormat;
		valueFormat = newValueFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REALMEASURETYPE_TYPE__VALUE_FORMAT, oldValueFormat, valueFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITType getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(DICUNITType newUnit, NotificationChain msgs) {
		DICUNITType oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REALMEASURETYPE_TYPE__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(DICUNITType newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REALMEASURETYPE_TYPE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REALMEASURETYPE_TYPE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REALMEASURETYPE_TYPE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEUNITSType getAlternativeUnits() {
		return alternativeUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeUnits(ALTERNATIVEUNITSType newAlternativeUnits, NotificationChain msgs) {
		ALTERNATIVEUNITSType oldAlternativeUnits = alternativeUnits;
		alternativeUnits = newAlternativeUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS, oldAlternativeUnits, newAlternativeUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeUnits(ALTERNATIVEUNITSType newAlternativeUnits) {
		if (newAlternativeUnits != alternativeUnits) {
			NotificationChain msgs = null;
			if (alternativeUnits != null)
				msgs = ((InternalEObject)alternativeUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS, null, msgs);
			if (newAlternativeUnits != null)
				msgs = ((InternalEObject)newAlternativeUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS, null, msgs);
			msgs = basicSetAlternativeUnits(newAlternativeUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS, newAlternativeUnits, newAlternativeUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITREFERENCEType getUnitId() {
		return unitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitId(DICUNITREFERENCEType newUnitId, NotificationChain msgs) {
		DICUNITREFERENCEType oldUnitId = unitId;
		unitId = newUnitId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REALMEASURETYPE_TYPE__UNIT_ID, oldUnitId, newUnitId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitId(DICUNITREFERENCEType newUnitId) {
		if (newUnitId != unitId) {
			NotificationChain msgs = null;
			if (unitId != null)
				msgs = ((InternalEObject)unitId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REALMEASURETYPE_TYPE__UNIT_ID, null, msgs);
			if (newUnitId != null)
				msgs = ((InternalEObject)newUnitId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REALMEASURETYPE_TYPE__UNIT_ID, null, msgs);
			msgs = basicSetUnitId(newUnitId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REALMEASURETYPE_TYPE__UNIT_ID, newUnitId, newUnitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITSREFERENCEType getAlternativeUnitIds() {
		return alternativeUnitIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeUnitIds(DICUNITSREFERENCEType newAlternativeUnitIds, NotificationChain msgs) {
		DICUNITSREFERENCEType oldAlternativeUnitIds = alternativeUnitIds;
		alternativeUnitIds = newAlternativeUnitIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS, oldAlternativeUnitIds, newAlternativeUnitIds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeUnitIds(DICUNITSREFERENCEType newAlternativeUnitIds) {
		if (newAlternativeUnitIds != alternativeUnitIds) {
			NotificationChain msgs = null;
			if (alternativeUnitIds != null)
				msgs = ((InternalEObject)alternativeUnitIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS, null, msgs);
			if (newAlternativeUnitIds != null)
				msgs = ((InternalEObject)newAlternativeUnitIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS, null, msgs);
			msgs = basicSetAlternativeUnitIds(newAlternativeUnitIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS, newAlternativeUnitIds, newAlternativeUnitIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT:
				return basicSetUnit(null, msgs);
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS:
				return basicSetAlternativeUnits(null, msgs);
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT_ID:
				return basicSetUnitId(null, msgs);
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS:
				return basicSetAlternativeUnitIds(null, msgs);
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
			case OntomlPackage.REALMEASURETYPE_TYPE__VALUE_FORMAT:
				return getValueFormat();
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT:
				return getUnit();
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS:
				return getAlternativeUnits();
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT_ID:
				return getUnitId();
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS:
				return getAlternativeUnitIds();
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
			case OntomlPackage.REALMEASURETYPE_TYPE__VALUE_FORMAT:
				setValueFormat((String)newValue);
				return;
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT:
				setUnit((DICUNITType)newValue);
				return;
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS:
				setAlternativeUnits((ALTERNATIVEUNITSType)newValue);
				return;
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT_ID:
				setUnitId((DICUNITREFERENCEType)newValue);
				return;
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS:
				setAlternativeUnitIds((DICUNITSREFERENCEType)newValue);
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
			case OntomlPackage.REALMEASURETYPE_TYPE__VALUE_FORMAT:
				setValueFormat(VALUE_FORMAT_EDEFAULT);
				return;
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT:
				setUnit((DICUNITType)null);
				return;
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS:
				setAlternativeUnits((ALTERNATIVEUNITSType)null);
				return;
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT_ID:
				setUnitId((DICUNITREFERENCEType)null);
				return;
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS:
				setAlternativeUnitIds((DICUNITSREFERENCEType)null);
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
			case OntomlPackage.REALMEASURETYPE_TYPE__VALUE_FORMAT:
				return VALUE_FORMAT_EDEFAULT == null ? valueFormat != null : !VALUE_FORMAT_EDEFAULT.equals(valueFormat);
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT:
				return unit != null;
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNITS:
				return alternativeUnits != null;
			case OntomlPackage.REALMEASURETYPE_TYPE__UNIT_ID:
				return unitId != null;
			case OntomlPackage.REALMEASURETYPE_TYPE__ALTERNATIVE_UNIT_IDS:
				return alternativeUnitIds != null;
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
		result.append(" (valueFormat: ");
		result.append(valueFormat);
		result.append(')');
		return result.toString();
	}

} //REALMEASURETYPETypeImpl
