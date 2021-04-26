/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DICTIONARYREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYREFERENCETypeImpl#getDictionaryRef <em>Dictionary Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DICTIONARYREFERENCETypeImpl extends MinimalEObjectImpl.Container implements DICTIONARYREFERENCEType {
	/**
	 * The default value of the '{@link #getDictionaryRef() <em>Dictionary Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DICTIONARY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDictionaryRef() <em>Dictionary Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryRef()
	 * @generated
	 * @ordered
	 */
	protected String dictionaryRef = DICTIONARY_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICTIONARYREFERENCETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDICTIONARYREFERENCEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDictionaryRef() {
		return dictionaryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionaryRef(String newDictionaryRef) {
		String oldDictionaryRef = dictionaryRef;
		dictionaryRef = newDictionaryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARYREFERENCE_TYPE__DICTIONARY_REF, oldDictionaryRef, dictionaryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.DICTIONARYREFERENCE_TYPE__DICTIONARY_REF:
				return getDictionaryRef();
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
			case OntomlPackage.DICTIONARYREFERENCE_TYPE__DICTIONARY_REF:
				setDictionaryRef((String)newValue);
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
			case OntomlPackage.DICTIONARYREFERENCE_TYPE__DICTIONARY_REF:
				setDictionaryRef(DICTIONARY_REF_EDEFAULT);
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
			case OntomlPackage.DICTIONARYREFERENCE_TYPE__DICTIONARY_REF:
				return DICTIONARY_REF_EDEFAULT == null ? dictionaryRef != null : !DICTIONARY_REF_EDEFAULT.equals(dictionaryRef);
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
		result.append(" (dictionaryRef: ");
		result.append(dictionaryRef);
		result.append(')');
		return result.toString();
	}

} //DICTIONARYREFERENCETypeImpl
