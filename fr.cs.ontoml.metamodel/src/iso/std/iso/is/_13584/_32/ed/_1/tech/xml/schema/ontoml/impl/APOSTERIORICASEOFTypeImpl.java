/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORICASEOFType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CORRESPONDINGPROPERTIESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APOSTERIORICASEOF Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORICASEOFTypeImpl#getCaseOfSuper <em>Case Of Super</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORICASEOFTypeImpl#getCaseOfSub <em>Case Of Sub</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORICASEOFTypeImpl#getCorrespondingProperties <em>Corresponding Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APOSTERIORICASEOFTypeImpl extends APOSTERIORISEMANTICRELATIONSHIPTypeImpl implements APOSTERIORICASEOFType {
	/**
	 * The cached value of the '{@link #getCaseOfSuper() <em>Case Of Super</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseOfSuper()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCEType caseOfSuper;

	/**
	 * The cached value of the '{@link #getCaseOfSub() <em>Case Of Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseOfSub()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCEType caseOfSub;

	/**
	 * The cached value of the '{@link #getCorrespondingProperties() <em>Corresponding Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingProperties()
	 * @generated
	 * @ordered
	 */
	protected CORRESPONDINGPROPERTIESType correspondingProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APOSTERIORICASEOFTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getAPOSTERIORICASEOFType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType getCaseOfSuper() {
		return caseOfSuper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseOfSuper(CLASSREFERENCEType newCaseOfSuper, NotificationChain msgs) {
		CLASSREFERENCEType oldCaseOfSuper = caseOfSuper;
		caseOfSuper = newCaseOfSuper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUPER, oldCaseOfSuper, newCaseOfSuper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseOfSuper(CLASSREFERENCEType newCaseOfSuper) {
		if (newCaseOfSuper != caseOfSuper) {
			NotificationChain msgs = null;
			if (caseOfSuper != null)
				msgs = ((InternalEObject)caseOfSuper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUPER, null, msgs);
			if (newCaseOfSuper != null)
				msgs = ((InternalEObject)newCaseOfSuper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUPER, null, msgs);
			msgs = basicSetCaseOfSuper(newCaseOfSuper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUPER, newCaseOfSuper, newCaseOfSuper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType getCaseOfSub() {
		return caseOfSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseOfSub(CLASSREFERENCEType newCaseOfSub, NotificationChain msgs) {
		CLASSREFERENCEType oldCaseOfSub = caseOfSub;
		caseOfSub = newCaseOfSub;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUB, oldCaseOfSub, newCaseOfSub);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseOfSub(CLASSREFERENCEType newCaseOfSub) {
		if (newCaseOfSub != caseOfSub) {
			NotificationChain msgs = null;
			if (caseOfSub != null)
				msgs = ((InternalEObject)caseOfSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUB, null, msgs);
			if (newCaseOfSub != null)
				msgs = ((InternalEObject)newCaseOfSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUB, null, msgs);
			msgs = basicSetCaseOfSub(newCaseOfSub, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUB, newCaseOfSub, newCaseOfSub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CORRESPONDINGPROPERTIESType getCorrespondingProperties() {
		return correspondingProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondingProperties(CORRESPONDINGPROPERTIESType newCorrespondingProperties, NotificationChain msgs) {
		CORRESPONDINGPROPERTIESType oldCorrespondingProperties = correspondingProperties;
		correspondingProperties = newCorrespondingProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES, oldCorrespondingProperties, newCorrespondingProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingProperties(CORRESPONDINGPROPERTIESType newCorrespondingProperties) {
		if (newCorrespondingProperties != correspondingProperties) {
			NotificationChain msgs = null;
			if (correspondingProperties != null)
				msgs = ((InternalEObject)correspondingProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES, null, msgs);
			if (newCorrespondingProperties != null)
				msgs = ((InternalEObject)newCorrespondingProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES, null, msgs);
			msgs = basicSetCorrespondingProperties(newCorrespondingProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES, newCorrespondingProperties, newCorrespondingProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUPER:
				return basicSetCaseOfSuper(null, msgs);
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUB:
				return basicSetCaseOfSub(null, msgs);
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES:
				return basicSetCorrespondingProperties(null, msgs);
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
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUPER:
				return getCaseOfSuper();
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUB:
				return getCaseOfSub();
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES:
				return getCorrespondingProperties();
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
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUPER:
				setCaseOfSuper((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUB:
				setCaseOfSub((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES:
				setCorrespondingProperties((CORRESPONDINGPROPERTIESType)newValue);
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
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUPER:
				setCaseOfSuper((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUB:
				setCaseOfSub((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES:
				setCorrespondingProperties((CORRESPONDINGPROPERTIESType)null);
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
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUPER:
				return caseOfSuper != null;
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CASE_OF_SUB:
				return caseOfSub != null;
			case OntomlPackage.APOSTERIORICASEOF_TYPE__CORRESPONDING_PROPERTIES:
				return correspondingProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //APOSTERIORICASEOFTypeImpl
