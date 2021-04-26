/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LANGUAGEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TRANSLATIONDATAType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRANSLATIONDATA Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATIONDATATypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATIONDATATypeImpl#getResponsibleTranslator <em>Responsible Translator</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATIONDATATypeImpl#getTranslationRevision <em>Translation Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.TRANSLATIONDATATypeImpl#getDateOfCurrentTranslationRevision <em>Date Of Current Translation Revision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TRANSLATIONDATATypeImpl extends MinimalEObjectImpl.Container implements TRANSLATIONDATAType {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LANGUAGEType language;

	/**
	 * The cached value of the '{@link #getResponsibleTranslator() <em>Responsible Translator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleTranslator()
	 * @generated
	 * @ordered
	 */
	protected SUPPLIERREFERENCEType responsibleTranslator;

	/**
	 * The default value of the '{@link #getTranslationRevision() <em>Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLATION_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTranslationRevision() <em>Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationRevision()
	 * @generated
	 * @ordered
	 */
	protected String translationRevision = TRANSLATION_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfCurrentTranslationRevision() <em>Date Of Current Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentTranslationRevision()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfCurrentTranslationRevision() <em>Date Of Current Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentTranslationRevision()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateOfCurrentTranslationRevision = DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRANSLATIONDATATypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getTRANSLATIONDATAType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANGUAGEType getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LANGUAGEType newLanguage, NotificationChain msgs) {
		LANGUAGEType oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.TRANSLATIONDATA_TYPE__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(LANGUAGEType newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.TRANSLATIONDATA_TYPE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.TRANSLATIONDATA_TYPE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.TRANSLATIONDATA_TYPE__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERREFERENCEType getResponsibleTranslator() {
		return responsibleTranslator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleTranslator(SUPPLIERREFERENCEType newResponsibleTranslator, NotificationChain msgs) {
		SUPPLIERREFERENCEType oldResponsibleTranslator = responsibleTranslator;
		responsibleTranslator = newResponsibleTranslator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR, oldResponsibleTranslator, newResponsibleTranslator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleTranslator(SUPPLIERREFERENCEType newResponsibleTranslator) {
		if (newResponsibleTranslator != responsibleTranslator) {
			NotificationChain msgs = null;
			if (responsibleTranslator != null)
				msgs = ((InternalEObject)responsibleTranslator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR, null, msgs);
			if (newResponsibleTranslator != null)
				msgs = ((InternalEObject)newResponsibleTranslator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR, null, msgs);
			msgs = basicSetResponsibleTranslator(newResponsibleTranslator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR, newResponsibleTranslator, newResponsibleTranslator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTranslationRevision() {
		return translationRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslationRevision(String newTranslationRevision) {
		String oldTranslationRevision = translationRevision;
		translationRevision = newTranslationRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.TRANSLATIONDATA_TYPE__TRANSLATION_REVISION, oldTranslationRevision, translationRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateOfCurrentTranslationRevision() {
		return dateOfCurrentTranslationRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfCurrentTranslationRevision(XMLGregorianCalendar newDateOfCurrentTranslationRevision) {
		XMLGregorianCalendar oldDateOfCurrentTranslationRevision = dateOfCurrentTranslationRevision;
		dateOfCurrentTranslationRevision = newDateOfCurrentTranslationRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.TRANSLATIONDATA_TYPE__DATE_OF_CURRENT_TRANSLATION_REVISION, oldDateOfCurrentTranslationRevision, dateOfCurrentTranslationRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.TRANSLATIONDATA_TYPE__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case OntomlPackage.TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR:
				return basicSetResponsibleTranslator(null, msgs);
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
			case OntomlPackage.TRANSLATIONDATA_TYPE__LANGUAGE:
				return getLanguage();
			case OntomlPackage.TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR:
				return getResponsibleTranslator();
			case OntomlPackage.TRANSLATIONDATA_TYPE__TRANSLATION_REVISION:
				return getTranslationRevision();
			case OntomlPackage.TRANSLATIONDATA_TYPE__DATE_OF_CURRENT_TRANSLATION_REVISION:
				return getDateOfCurrentTranslationRevision();
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
			case OntomlPackage.TRANSLATIONDATA_TYPE__LANGUAGE:
				setLanguage((LANGUAGEType)newValue);
				return;
			case OntomlPackage.TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR:
				setResponsibleTranslator((SUPPLIERREFERENCEType)newValue);
				return;
			case OntomlPackage.TRANSLATIONDATA_TYPE__TRANSLATION_REVISION:
				setTranslationRevision((String)newValue);
				return;
			case OntomlPackage.TRANSLATIONDATA_TYPE__DATE_OF_CURRENT_TRANSLATION_REVISION:
				setDateOfCurrentTranslationRevision((XMLGregorianCalendar)newValue);
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
			case OntomlPackage.TRANSLATIONDATA_TYPE__LANGUAGE:
				setLanguage((LANGUAGEType)null);
				return;
			case OntomlPackage.TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR:
				setResponsibleTranslator((SUPPLIERREFERENCEType)null);
				return;
			case OntomlPackage.TRANSLATIONDATA_TYPE__TRANSLATION_REVISION:
				setTranslationRevision(TRANSLATION_REVISION_EDEFAULT);
				return;
			case OntomlPackage.TRANSLATIONDATA_TYPE__DATE_OF_CURRENT_TRANSLATION_REVISION:
				setDateOfCurrentTranslationRevision(DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT);
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
			case OntomlPackage.TRANSLATIONDATA_TYPE__LANGUAGE:
				return language != null;
			case OntomlPackage.TRANSLATIONDATA_TYPE__RESPONSIBLE_TRANSLATOR:
				return responsibleTranslator != null;
			case OntomlPackage.TRANSLATIONDATA_TYPE__TRANSLATION_REVISION:
				return TRANSLATION_REVISION_EDEFAULT == null ? translationRevision != null : !TRANSLATION_REVISION_EDEFAULT.equals(translationRevision);
			case OntomlPackage.TRANSLATIONDATA_TYPE__DATE_OF_CURRENT_TRANSLATION_REVISION:
				return DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT == null ? dateOfCurrentTranslationRevision != null : !DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT.equals(dateOfCurrentTranslationRevision);
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
		result.append(" (translationRevision: ");
		result.append(translationRevision);
		result.append(", dateOfCurrentTranslationRevision: ");
		result.append(dateOfCurrentTranslationRevision);
		result.append(')');
		return result.toString();
	}

} //TRANSLATIONDATATypeImpl
