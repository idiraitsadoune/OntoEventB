/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDDOCUMENTType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REFERENCEDDOCUMENT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REFERENCEDDOCUMENTTypeImpl#getDocumentReference <em>Document Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REFERENCEDDOCUMENTTypeImpl extends SOURCEDOCUMENTTypeImpl implements REFERENCEDDOCUMENTType {
	/**
	 * The cached value of the '{@link #getDocumentReference() <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTREFERENCEType documentReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REFERENCEDDOCUMENTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getREFERENCEDDOCUMENTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTREFERENCEType getDocumentReference() {
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentReference(DOCUMENTREFERENCEType newDocumentReference, NotificationChain msgs) {
		DOCUMENTREFERENCEType oldDocumentReference = documentReference;
		documentReference = newDocumentReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE, oldDocumentReference, newDocumentReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentReference(DOCUMENTREFERENCEType newDocumentReference) {
		if (newDocumentReference != documentReference) {
			NotificationChain msgs = null;
			if (documentReference != null)
				msgs = ((InternalEObject)documentReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE, null, msgs);
			if (newDocumentReference != null)
				msgs = ((InternalEObject)newDocumentReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE, null, msgs);
			msgs = basicSetDocumentReference(newDocumentReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE, newDocumentReference, newDocumentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE:
				return basicSetDocumentReference(null, msgs);
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
			case OntomlPackage.REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE:
				return getDocumentReference();
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
			case OntomlPackage.REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE:
				setDocumentReference((DOCUMENTREFERENCEType)newValue);
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
			case OntomlPackage.REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE:
				setDocumentReference((DOCUMENTREFERENCEType)null);
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
			case OntomlPackage.REFERENCEDDOCUMENT_TYPE__DOCUMENT_REFERENCE:
				return documentReference != null;
		}
		return super.eIsSet(featureID);
	}

} //REFERENCEDDOCUMENTTypeImpl
