/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PERSONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STRINGSType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PERSON Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PERSONTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PERSONTypeImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PERSONTypeImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PERSONTypeImpl#getMiddleNames <em>Middle Names</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PERSONTypeImpl#getPrefixTitles <em>Prefix Titles</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PERSONTypeImpl#getSuffixTitles <em>Suffix Titles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PERSONTypeImpl extends MinimalEObjectImpl.Container implements PERSONType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMiddleNames() <em>Middle Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleNames()
	 * @generated
	 * @ordered
	 */
	protected STRINGSType middleNames;

	/**
	 * The cached value of the '{@link #getPrefixTitles() <em>Prefix Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixTitles()
	 * @generated
	 * @ordered
	 */
	protected STRINGSType prefixTitles;

	/**
	 * The cached value of the '{@link #getSuffixTitles() <em>Suffix Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixTitles()
	 * @generated
	 * @ordered
	 */
	protected STRINGSType suffixTitles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PERSONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getPERSONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PERSON_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PERSON_TYPE__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PERSON_TYPE__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGSType getMiddleNames() {
		return middleNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiddleNames(STRINGSType newMiddleNames, NotificationChain msgs) {
		STRINGSType oldMiddleNames = middleNames;
		middleNames = newMiddleNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PERSON_TYPE__MIDDLE_NAMES, oldMiddleNames, newMiddleNames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiddleNames(STRINGSType newMiddleNames) {
		if (newMiddleNames != middleNames) {
			NotificationChain msgs = null;
			if (middleNames != null)
				msgs = ((InternalEObject)middleNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PERSON_TYPE__MIDDLE_NAMES, null, msgs);
			if (newMiddleNames != null)
				msgs = ((InternalEObject)newMiddleNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PERSON_TYPE__MIDDLE_NAMES, null, msgs);
			msgs = basicSetMiddleNames(newMiddleNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PERSON_TYPE__MIDDLE_NAMES, newMiddleNames, newMiddleNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGSType getPrefixTitles() {
		return prefixTitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefixTitles(STRINGSType newPrefixTitles, NotificationChain msgs) {
		STRINGSType oldPrefixTitles = prefixTitles;
		prefixTitles = newPrefixTitles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PERSON_TYPE__PREFIX_TITLES, oldPrefixTitles, newPrefixTitles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefixTitles(STRINGSType newPrefixTitles) {
		if (newPrefixTitles != prefixTitles) {
			NotificationChain msgs = null;
			if (prefixTitles != null)
				msgs = ((InternalEObject)prefixTitles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PERSON_TYPE__PREFIX_TITLES, null, msgs);
			if (newPrefixTitles != null)
				msgs = ((InternalEObject)newPrefixTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PERSON_TYPE__PREFIX_TITLES, null, msgs);
			msgs = basicSetPrefixTitles(newPrefixTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PERSON_TYPE__PREFIX_TITLES, newPrefixTitles, newPrefixTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGSType getSuffixTitles() {
		return suffixTitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuffixTitles(STRINGSType newSuffixTitles, NotificationChain msgs) {
		STRINGSType oldSuffixTitles = suffixTitles;
		suffixTitles = newSuffixTitles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PERSON_TYPE__SUFFIX_TITLES, oldSuffixTitles, newSuffixTitles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffixTitles(STRINGSType newSuffixTitles) {
		if (newSuffixTitles != suffixTitles) {
			NotificationChain msgs = null;
			if (suffixTitles != null)
				msgs = ((InternalEObject)suffixTitles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PERSON_TYPE__SUFFIX_TITLES, null, msgs);
			if (newSuffixTitles != null)
				msgs = ((InternalEObject)newSuffixTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PERSON_TYPE__SUFFIX_TITLES, null, msgs);
			msgs = basicSetSuffixTitles(newSuffixTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PERSON_TYPE__SUFFIX_TITLES, newSuffixTitles, newSuffixTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.PERSON_TYPE__MIDDLE_NAMES:
				return basicSetMiddleNames(null, msgs);
			case OntomlPackage.PERSON_TYPE__PREFIX_TITLES:
				return basicSetPrefixTitles(null, msgs);
			case OntomlPackage.PERSON_TYPE__SUFFIX_TITLES:
				return basicSetSuffixTitles(null, msgs);
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
			case OntomlPackage.PERSON_TYPE__ID:
				return getId();
			case OntomlPackage.PERSON_TYPE__LAST_NAME:
				return getLastName();
			case OntomlPackage.PERSON_TYPE__FIRST_NAME:
				return getFirstName();
			case OntomlPackage.PERSON_TYPE__MIDDLE_NAMES:
				return getMiddleNames();
			case OntomlPackage.PERSON_TYPE__PREFIX_TITLES:
				return getPrefixTitles();
			case OntomlPackage.PERSON_TYPE__SUFFIX_TITLES:
				return getSuffixTitles();
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
			case OntomlPackage.PERSON_TYPE__ID:
				setId((String)newValue);
				return;
			case OntomlPackage.PERSON_TYPE__LAST_NAME:
				setLastName((String)newValue);
				return;
			case OntomlPackage.PERSON_TYPE__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case OntomlPackage.PERSON_TYPE__MIDDLE_NAMES:
				setMiddleNames((STRINGSType)newValue);
				return;
			case OntomlPackage.PERSON_TYPE__PREFIX_TITLES:
				setPrefixTitles((STRINGSType)newValue);
				return;
			case OntomlPackage.PERSON_TYPE__SUFFIX_TITLES:
				setSuffixTitles((STRINGSType)newValue);
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
			case OntomlPackage.PERSON_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case OntomlPackage.PERSON_TYPE__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case OntomlPackage.PERSON_TYPE__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case OntomlPackage.PERSON_TYPE__MIDDLE_NAMES:
				setMiddleNames((STRINGSType)null);
				return;
			case OntomlPackage.PERSON_TYPE__PREFIX_TITLES:
				setPrefixTitles((STRINGSType)null);
				return;
			case OntomlPackage.PERSON_TYPE__SUFFIX_TITLES:
				setSuffixTitles((STRINGSType)null);
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
			case OntomlPackage.PERSON_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OntomlPackage.PERSON_TYPE__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case OntomlPackage.PERSON_TYPE__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case OntomlPackage.PERSON_TYPE__MIDDLE_NAMES:
				return middleNames != null;
			case OntomlPackage.PERSON_TYPE__PREFIX_TITLES:
				return prefixTitles != null;
			case OntomlPackage.PERSON_TYPE__SUFFIX_TITLES:
				return suffixTitles != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(')');
		return result.toString();
	}

} //PERSONTypeImpl
