/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTIDENTIFIERType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.IDENTIFIEDDOCUMENTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDENTIFIEDDOCUMENT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.IDENTIFIEDDOCUMENTTypeImpl#getDocumentIdentifier <em>Document Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDENTIFIEDDOCUMENTTypeImpl extends SOURCEDOCUMENTTypeImpl implements IDENTIFIEDDOCUMENTType {
	/**
	 * The cached value of the '{@link #getDocumentIdentifier() <em>Document Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIdentifier()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTIDENTIFIERType documentIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDENTIFIEDDOCUMENTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getIDENTIFIEDDOCUMENTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTIDENTIFIERType getDocumentIdentifier() {
		return documentIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentIdentifier(DOCUMENTIDENTIFIERType newDocumentIdentifier, NotificationChain msgs) {
		DOCUMENTIDENTIFIERType oldDocumentIdentifier = documentIdentifier;
		documentIdentifier = newDocumentIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER, oldDocumentIdentifier, newDocumentIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentIdentifier(DOCUMENTIDENTIFIERType newDocumentIdentifier) {
		if (newDocumentIdentifier != documentIdentifier) {
			NotificationChain msgs = null;
			if (documentIdentifier != null)
				msgs = ((InternalEObject)documentIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER, null, msgs);
			if (newDocumentIdentifier != null)
				msgs = ((InternalEObject)newDocumentIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER, null, msgs);
			msgs = basicSetDocumentIdentifier(newDocumentIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER, newDocumentIdentifier, newDocumentIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER:
				return basicSetDocumentIdentifier(null, msgs);
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
			case OntomlPackage.IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER:
				return getDocumentIdentifier();
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
			case OntomlPackage.IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER:
				setDocumentIdentifier((DOCUMENTIDENTIFIERType)newValue);
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
			case OntomlPackage.IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER:
				setDocumentIdentifier((DOCUMENTIDENTIFIERType)null);
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
			case OntomlPackage.IDENTIFIEDDOCUMENT_TYPE__DOCUMENT_IDENTIFIER:
				return documentIdentifier != null;
		}
		return super.eIsSet(featureID);
	}

} //IDENTIFIEDDOCUMENTTypeImpl
