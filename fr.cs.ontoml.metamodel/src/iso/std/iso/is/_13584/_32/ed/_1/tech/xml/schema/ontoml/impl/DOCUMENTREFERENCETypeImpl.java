/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOCUMENTREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DOCUMENTREFERENCETypeImpl#getDocumentRef <em>Document Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOCUMENTREFERENCETypeImpl extends MinimalEObjectImpl.Container implements DOCUMENTREFERENCEType {
	/**
	 * The default value of the '{@link #getDocumentRef() <em>Document Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentRef() <em>Document Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRef()
	 * @generated
	 * @ordered
	 */
	protected String documentRef = DOCUMENT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DOCUMENTREFERENCETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDOCUMENTREFERENCEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentRef() {
		return documentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentRef(String newDocumentRef) {
		String oldDocumentRef = documentRef;
		documentRef = newDocumentRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DOCUMENTREFERENCE_TYPE__DOCUMENT_REF, oldDocumentRef, documentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.DOCUMENTREFERENCE_TYPE__DOCUMENT_REF:
				return getDocumentRef();
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
			case OntomlPackage.DOCUMENTREFERENCE_TYPE__DOCUMENT_REF:
				setDocumentRef((String)newValue);
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
			case OntomlPackage.DOCUMENTREFERENCE_TYPE__DOCUMENT_REF:
				setDocumentRef(DOCUMENT_REF_EDEFAULT);
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
			case OntomlPackage.DOCUMENTREFERENCE_TYPE__DOCUMENT_REF:
				return DOCUMENT_REF_EDEFAULT == null ? documentRef != null : !DOCUMENT_REF_EDEFAULT.equals(documentRef);
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
		result.append(" (documentRef: ");
		result.append(documentRef);
		result.append(')');
		return result.toString();
	}

} //DOCUMENTREFERENCETypeImpl
