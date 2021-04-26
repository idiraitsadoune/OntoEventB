/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONFIGURATIONCONTROLCONSTRAINTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.POSTCONDITIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PRECONDITIONType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONFIGURATIONCONTROLCONSTRAINT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONFIGURATIONCONTROLCONSTRAINTTypeImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CONFIGURATIONCONTROLCONSTRAINTTypeImpl#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONFIGURATIONCONTROLCONSTRAINTTypeImpl extends CLASSCONSTRAINTTypeImpl implements CONFIGURATIONCONTROLCONSTRAINTType {
	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected PRECONDITIONType precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected POSTCONDITIONType postcondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONFIGURATIONCONTROLCONSTRAINTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCONFIGURATIONCONTROLCONSTRAINTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRECONDITIONType getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(PRECONDITIONType newPrecondition, NotificationChain msgs) {
		PRECONDITIONType oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(PRECONDITIONType newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POSTCONDITIONType getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostcondition(POSTCONDITIONType newPostcondition, NotificationChain msgs) {
		POSTCONDITIONType oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION, oldPostcondition, newPostcondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(POSTCONDITIONType newPostcondition) {
		if (newPostcondition != postcondition) {
			NotificationChain msgs = null;
			if (postcondition != null)
				msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION, null, msgs);
			if (newPostcondition != null)
				msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION, null, msgs);
			msgs = basicSetPostcondition(newPostcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION, newPostcondition, newPostcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION:
				return basicSetPostcondition(null, msgs);
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
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION:
				return getPrecondition();
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION:
				return getPostcondition();
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
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION:
				setPrecondition((PRECONDITIONType)newValue);
				return;
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION:
				setPostcondition((POSTCONDITIONType)newValue);
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
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION:
				setPrecondition((PRECONDITIONType)null);
				return;
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION:
				setPostcondition((POSTCONDITIONType)null);
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
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__PRECONDITION:
				return precondition != null;
			case OntomlPackage.CONFIGURATIONCONTROLCONSTRAINT_TYPE__POSTCONDITION:
				return postcondition != null;
		}
		return super.eIsSet(featureID);
	}

} //CONFIGURATIONCONTROLCONSTRAINTTypeImpl
