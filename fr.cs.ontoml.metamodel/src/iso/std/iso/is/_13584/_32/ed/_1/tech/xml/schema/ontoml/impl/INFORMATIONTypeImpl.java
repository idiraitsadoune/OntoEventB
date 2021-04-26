/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.INFORMATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PREFERREDNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SHORTNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SYNONYMOUSNAMEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INFORMATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INFORMATIONTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INFORMATIONTypeImpl#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INFORMATIONTypeImpl#getSynonymousNames <em>Synonymous Names</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INFORMATIONTypeImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INFORMATIONTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INFORMATIONTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.INFORMATIONTypeImpl#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INFORMATIONTypeImpl extends MinimalEObjectImpl.Container implements INFORMATIONType {
	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreferredName() <em>Preferred Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredName()
	 * @generated
	 * @ordered
	 */
	protected PREFERREDNAMEType preferredName;

	/**
	 * The cached value of the '{@link #getSynonymousNames() <em>Synonymous Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonymousNames()
	 * @generated
	 * @ordered
	 */
	protected SYNONYMOUSNAMEType synonymousNames;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected SHORTNAMEType shortName;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICSType icon;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected TEXTType note;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected TEXTType remark;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INFORMATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getINFORMATIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREFERREDNAMEType getPreferredName() {
		return preferredName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredName(PREFERREDNAMEType newPreferredName, NotificationChain msgs) {
		PREFERREDNAMEType oldPreferredName = preferredName;
		preferredName = newPreferredName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__PREFERRED_NAME, oldPreferredName, newPreferredName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredName(PREFERREDNAMEType newPreferredName) {
		if (newPreferredName != preferredName) {
			NotificationChain msgs = null;
			if (preferredName != null)
				msgs = ((InternalEObject)preferredName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__PREFERRED_NAME, null, msgs);
			if (newPreferredName != null)
				msgs = ((InternalEObject)newPreferredName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__PREFERRED_NAME, null, msgs);
			msgs = basicSetPreferredName(newPreferredName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__PREFERRED_NAME, newPreferredName, newPreferredName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSNAMEType getSynonymousNames() {
		return synonymousNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynonymousNames(SYNONYMOUSNAMEType newSynonymousNames, NotificationChain msgs) {
		SYNONYMOUSNAMEType oldSynonymousNames = synonymousNames;
		synonymousNames = newSynonymousNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__SYNONYMOUS_NAMES, oldSynonymousNames, newSynonymousNames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynonymousNames(SYNONYMOUSNAMEType newSynonymousNames) {
		if (newSynonymousNames != synonymousNames) {
			NotificationChain msgs = null;
			if (synonymousNames != null)
				msgs = ((InternalEObject)synonymousNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__SYNONYMOUS_NAMES, null, msgs);
			if (newSynonymousNames != null)
				msgs = ((InternalEObject)newSynonymousNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__SYNONYMOUS_NAMES, null, msgs);
			msgs = basicSetSynonymousNames(newSynonymousNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__SYNONYMOUS_NAMES, newSynonymousNames, newSynonymousNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SHORTNAMEType getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortName(SHORTNAMEType newShortName, NotificationChain msgs) {
		SHORTNAMEType oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__SHORT_NAME, oldShortName, newShortName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(SHORTNAMEType newShortName) {
		if (newShortName != shortName) {
			NotificationChain msgs = null;
			if (shortName != null)
				msgs = ((InternalEObject)shortName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__SHORT_NAME, null, msgs);
			if (newShortName != null)
				msgs = ((InternalEObject)newShortName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__SHORT_NAME, null, msgs);
			msgs = basicSetShortName(newShortName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__SHORT_NAME, newShortName, newShortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICSType getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(GRAPHICSType newIcon, NotificationChain msgs) {
		GRAPHICSType oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(GRAPHICSType newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTType getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(TEXTType newNote, NotificationChain msgs) {
		TEXTType oldNote = note;
		note = newNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__NOTE, oldNote, newNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(TEXTType newNote) {
		if (newNote != note) {
			NotificationChain msgs = null;
			if (note != null)
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTType getRemark() {
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemark(TEXTType newRemark, NotificationChain msgs) {
		TEXTType oldRemark = remark;
		remark = newRemark;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__REMARK, oldRemark, newRemark);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemark(TEXTType newRemark) {
		if (newRemark != remark) {
			NotificationChain msgs = null;
			if (remark != null)
				msgs = ((InternalEObject)remark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__REMARK, null, msgs);
			if (newRemark != null)
				msgs = ((InternalEObject)newRemark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.INFORMATION_TYPE__REMARK, null, msgs);
			msgs = basicSetRemark(newRemark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.INFORMATION_TYPE__REMARK, newRemark, newRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.INFORMATION_TYPE__PREFERRED_NAME:
				return basicSetPreferredName(null, msgs);
			case OntomlPackage.INFORMATION_TYPE__SYNONYMOUS_NAMES:
				return basicSetSynonymousNames(null, msgs);
			case OntomlPackage.INFORMATION_TYPE__SHORT_NAME:
				return basicSetShortName(null, msgs);
			case OntomlPackage.INFORMATION_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case OntomlPackage.INFORMATION_TYPE__NOTE:
				return basicSetNote(null, msgs);
			case OntomlPackage.INFORMATION_TYPE__REMARK:
				return basicSetRemark(null, msgs);
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
			case OntomlPackage.INFORMATION_TYPE__REVISION:
				return getRevision();
			case OntomlPackage.INFORMATION_TYPE__PREFERRED_NAME:
				return getPreferredName();
			case OntomlPackage.INFORMATION_TYPE__SYNONYMOUS_NAMES:
				return getSynonymousNames();
			case OntomlPackage.INFORMATION_TYPE__SHORT_NAME:
				return getShortName();
			case OntomlPackage.INFORMATION_TYPE__ICON:
				return getIcon();
			case OntomlPackage.INFORMATION_TYPE__NOTE:
				return getNote();
			case OntomlPackage.INFORMATION_TYPE__REMARK:
				return getRemark();
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
			case OntomlPackage.INFORMATION_TYPE__REVISION:
				setRevision((String)newValue);
				return;
			case OntomlPackage.INFORMATION_TYPE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAMEType)newValue);
				return;
			case OntomlPackage.INFORMATION_TYPE__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAMEType)newValue);
				return;
			case OntomlPackage.INFORMATION_TYPE__SHORT_NAME:
				setShortName((SHORTNAMEType)newValue);
				return;
			case OntomlPackage.INFORMATION_TYPE__ICON:
				setIcon((GRAPHICSType)newValue);
				return;
			case OntomlPackage.INFORMATION_TYPE__NOTE:
				setNote((TEXTType)newValue);
				return;
			case OntomlPackage.INFORMATION_TYPE__REMARK:
				setRemark((TEXTType)newValue);
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
			case OntomlPackage.INFORMATION_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OntomlPackage.INFORMATION_TYPE__PREFERRED_NAME:
				setPreferredName((PREFERREDNAMEType)null);
				return;
			case OntomlPackage.INFORMATION_TYPE__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAMEType)null);
				return;
			case OntomlPackage.INFORMATION_TYPE__SHORT_NAME:
				setShortName((SHORTNAMEType)null);
				return;
			case OntomlPackage.INFORMATION_TYPE__ICON:
				setIcon((GRAPHICSType)null);
				return;
			case OntomlPackage.INFORMATION_TYPE__NOTE:
				setNote((TEXTType)null);
				return;
			case OntomlPackage.INFORMATION_TYPE__REMARK:
				setRemark((TEXTType)null);
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
			case OntomlPackage.INFORMATION_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case OntomlPackage.INFORMATION_TYPE__PREFERRED_NAME:
				return preferredName != null;
			case OntomlPackage.INFORMATION_TYPE__SYNONYMOUS_NAMES:
				return synonymousNames != null;
			case OntomlPackage.INFORMATION_TYPE__SHORT_NAME:
				return shortName != null;
			case OntomlPackage.INFORMATION_TYPE__ICON:
				return icon != null;
			case OntomlPackage.INFORMATION_TYPE__NOTE:
				return note != null;
			case OntomlPackage.INFORMATION_TYPE__REMARK:
				return remark != null;
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
		result.append(" (revision: ");
		result.append(revision);
		result.append(')');
		return result.toString();
	}

} //INFORMATIONTypeImpl
