/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROGRAMREFERENCETYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROGRAMREFERENCETYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROGRAMREFERENCETYPETypeImpl#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROGRAMREFERENCETYPETypeImpl#getOutParameters <em>Out Parameters</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROGRAMREFERENCETYPETypeImpl#getInoutParameters <em>Inout Parameters</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.PROGRAMREFERENCETYPETypeImpl#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROGRAMREFERENCETYPETypeImpl extends ANYTYPETypeImpl implements PROGRAMREFERENCETYPEType {
	/**
	 * The cached value of the '{@link #getInParameters() <em>In Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameters()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType inParameters;

	/**
	 * The cached value of the '{@link #getOutParameters() <em>Out Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutParameters()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType outParameters;

	/**
	 * The cached value of the '{@link #getInoutParameters() <em>Inout Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInoutParameters()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType inoutParameters;

	/**
	 * The default value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected String classRef = CLASS_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROGRAMREFERENCETYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getPROGRAMREFERENCETYPEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getInParameters() {
		return inParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInParameters(PROPERTIESREFERENCEType newInParameters, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldInParameters = inParameters;
		inParameters = newInParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS, oldInParameters, newInParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInParameters(PROPERTIESREFERENCEType newInParameters) {
		if (newInParameters != inParameters) {
			NotificationChain msgs = null;
			if (inParameters != null)
				msgs = ((InternalEObject)inParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS, null, msgs);
			if (newInParameters != null)
				msgs = ((InternalEObject)newInParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS, null, msgs);
			msgs = basicSetInParameters(newInParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS, newInParameters, newInParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getOutParameters() {
		return outParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutParameters(PROPERTIESREFERENCEType newOutParameters, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldOutParameters = outParameters;
		outParameters = newOutParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS, oldOutParameters, newOutParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutParameters(PROPERTIESREFERENCEType newOutParameters) {
		if (newOutParameters != outParameters) {
			NotificationChain msgs = null;
			if (outParameters != null)
				msgs = ((InternalEObject)outParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS, null, msgs);
			if (newOutParameters != null)
				msgs = ((InternalEObject)newOutParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS, null, msgs);
			msgs = basicSetOutParameters(newOutParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS, newOutParameters, newOutParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getInoutParameters() {
		return inoutParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInoutParameters(PROPERTIESREFERENCEType newInoutParameters, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldInoutParameters = inoutParameters;
		inoutParameters = newInoutParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS, oldInoutParameters, newInoutParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInoutParameters(PROPERTIESREFERENCEType newInoutParameters) {
		if (newInoutParameters != inoutParameters) {
			NotificationChain msgs = null;
			if (inoutParameters != null)
				msgs = ((InternalEObject)inoutParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS, null, msgs);
			if (newInoutParameters != null)
				msgs = ((InternalEObject)newInoutParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS, null, msgs);
			msgs = basicSetInoutParameters(newInoutParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS, newInoutParameters, newInoutParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassRef() {
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassRef(String newClassRef) {
		String oldClassRef = classRef;
		classRef = newClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.PROGRAMREFERENCETYPE_TYPE__CLASS_REF, oldClassRef, classRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS:
				return basicSetInParameters(null, msgs);
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS:
				return basicSetOutParameters(null, msgs);
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS:
				return basicSetInoutParameters(null, msgs);
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
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS:
				return getInParameters();
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS:
				return getOutParameters();
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS:
				return getInoutParameters();
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__CLASS_REF:
				return getClassRef();
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
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS:
				setInParameters((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS:
				setOutParameters((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS:
				setInoutParameters((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__CLASS_REF:
				setClassRef((String)newValue);
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
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS:
				setInParameters((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS:
				setOutParameters((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS:
				setInoutParameters((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__CLASS_REF:
				setClassRef(CLASS_REF_EDEFAULT);
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
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__IN_PARAMETERS:
				return inParameters != null;
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__OUT_PARAMETERS:
				return outParameters != null;
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__INOUT_PARAMETERS:
				return inoutParameters != null;
			case OntomlPackage.PROGRAMREFERENCETYPE_TYPE__CLASS_REF:
				return CLASS_REF_EDEFAULT == null ? classRef != null : !CLASS_REF_EDEFAULT.equals(classRef);
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
		result.append(" (classRef: ");
		result.append(classRef);
		result.append(')');
		return result.toString();
	}

} //PROGRAMREFERENCETYPETypeImpl
