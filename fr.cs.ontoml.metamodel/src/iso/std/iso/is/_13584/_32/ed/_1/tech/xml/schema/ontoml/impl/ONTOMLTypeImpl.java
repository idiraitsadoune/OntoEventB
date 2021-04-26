/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.HEADERType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LIBRARYType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ONTOML Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ONTOMLTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ONTOMLTypeImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ONTOMLTypeImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ONTOMLTypeImpl extends MinimalEObjectImpl.Container implements ONTOMLType {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected HEADERType header;

	/**
	 * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected DICTIONARYType dictionary;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected LIBRARYType library;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ONTOMLTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getONTOMLType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HEADERType getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HEADERType newHeader, NotificationChain msgs) {
		HEADERType oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ONTOML_TYPE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HEADERType newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ONTOML_TYPE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ONTOML_TYPE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ONTOML_TYPE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARYType getDictionary() {
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionary(DICTIONARYType newDictionary, NotificationChain msgs) {
		DICTIONARYType oldDictionary = dictionary;
		dictionary = newDictionary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ONTOML_TYPE__DICTIONARY, oldDictionary, newDictionary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionary(DICTIONARYType newDictionary) {
		if (newDictionary != dictionary) {
			NotificationChain msgs = null;
			if (dictionary != null)
				msgs = ((InternalEObject)dictionary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ONTOML_TYPE__DICTIONARY, null, msgs);
			if (newDictionary != null)
				msgs = ((InternalEObject)newDictionary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ONTOML_TYPE__DICTIONARY, null, msgs);
			msgs = basicSetDictionary(newDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ONTOML_TYPE__DICTIONARY, newDictionary, newDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIBRARYType getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(LIBRARYType newLibrary, NotificationChain msgs) {
		LIBRARYType oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ONTOML_TYPE__LIBRARY, oldLibrary, newLibrary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(LIBRARYType newLibrary) {
		if (newLibrary != library) {
			NotificationChain msgs = null;
			if (library != null)
				msgs = ((InternalEObject)library).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ONTOML_TYPE__LIBRARY, null, msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ONTOML_TYPE__LIBRARY, null, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ONTOML_TYPE__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.ONTOML_TYPE__HEADER:
				return basicSetHeader(null, msgs);
			case OntomlPackage.ONTOML_TYPE__DICTIONARY:
				return basicSetDictionary(null, msgs);
			case OntomlPackage.ONTOML_TYPE__LIBRARY:
				return basicSetLibrary(null, msgs);
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
			case OntomlPackage.ONTOML_TYPE__HEADER:
				return getHeader();
			case OntomlPackage.ONTOML_TYPE__DICTIONARY:
				return getDictionary();
			case OntomlPackage.ONTOML_TYPE__LIBRARY:
				return getLibrary();
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
			case OntomlPackage.ONTOML_TYPE__HEADER:
				setHeader((HEADERType)newValue);
				return;
			case OntomlPackage.ONTOML_TYPE__DICTIONARY:
				setDictionary((DICTIONARYType)newValue);
				return;
			case OntomlPackage.ONTOML_TYPE__LIBRARY:
				setLibrary((LIBRARYType)newValue);
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
			case OntomlPackage.ONTOML_TYPE__HEADER:
				setHeader((HEADERType)null);
				return;
			case OntomlPackage.ONTOML_TYPE__DICTIONARY:
				setDictionary((DICTIONARYType)null);
				return;
			case OntomlPackage.ONTOML_TYPE__LIBRARY:
				setLibrary((LIBRARYType)null);
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
			case OntomlPackage.ONTOML_TYPE__HEADER:
				return header != null;
			case OntomlPackage.ONTOML_TYPE__DICTIONARY:
				return dictionary != null;
			case OntomlPackage.ONTOML_TYPE__LIBRARY:
				return library != null;
		}
		return super.eIsSet(featureID);
	}

} //ONTOMLTypeImpl
