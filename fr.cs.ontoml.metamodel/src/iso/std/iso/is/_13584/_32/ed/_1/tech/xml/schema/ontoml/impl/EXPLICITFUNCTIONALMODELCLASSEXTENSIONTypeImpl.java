/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTEXTPARAMICONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITFUNCTIONALMODELCLASSEXTENSIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MESSAGEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPLICITFUNCTIONALMODELCLASSEXTENSION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl#getRequiredItemValues <em>Required Item Values</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl#getAvailableViewsIcon <em>Available Views Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl#getAvailableViewsMsg <em>Available Views Msg</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl#getContextParamIcon <em>Context Param Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl#getContextParamMsg <em>Context Param Msg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl extends CLASSEXTENSIONTypeImpl implements EXPLICITFUNCTIONALMODELCLASSEXTENSIONType {
	/**
	 * The cached value of the '{@link #getRequiredItemValues() <em>Required Item Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredItemValues()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType requiredItemValues;

	/**
	 * The cached value of the '{@link #getAvailableViewsIcon() <em>Available Views Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableViewsIcon()
	 * @generated
	 * @ordered
	 */
	protected ILLUSTRATIONType availableViewsIcon;

	/**
	 * The cached value of the '{@link #getAvailableViewsMsg() <em>Available Views Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableViewsMsg()
	 * @generated
	 * @ordered
	 */
	protected MESSAGEType availableViewsMsg;

	/**
	 * The cached value of the '{@link #getContextParamIcon() <em>Context Param Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParamIcon()
	 * @generated
	 * @ordered
	 */
	protected CONTEXTPARAMICONType contextParamIcon;

	/**
	 * The cached value of the '{@link #getContextParamMsg() <em>Context Param Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParamMsg()
	 * @generated
	 * @ordered
	 */
	protected MESSAGEType contextParamMsg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getEXPLICITFUNCTIONALMODELCLASSEXTENSIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getRequiredItemValues() {
		return requiredItemValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredItemValues(PROPERTIESREFERENCEType newRequiredItemValues, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldRequiredItemValues = requiredItemValues;
		requiredItemValues = newRequiredItemValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES, oldRequiredItemValues, newRequiredItemValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredItemValues(PROPERTIESREFERENCEType newRequiredItemValues) {
		if (newRequiredItemValues != requiredItemValues) {
			NotificationChain msgs = null;
			if (requiredItemValues != null)
				msgs = ((InternalEObject)requiredItemValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES, null, msgs);
			if (newRequiredItemValues != null)
				msgs = ((InternalEObject)newRequiredItemValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES, null, msgs);
			msgs = basicSetRequiredItemValues(newRequiredItemValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES, newRequiredItemValues, newRequiredItemValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATIONType getAvailableViewsIcon() {
		return availableViewsIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableViewsIcon(ILLUSTRATIONType newAvailableViewsIcon, NotificationChain msgs) {
		ILLUSTRATIONType oldAvailableViewsIcon = availableViewsIcon;
		availableViewsIcon = newAvailableViewsIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON, oldAvailableViewsIcon, newAvailableViewsIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableViewsIcon(ILLUSTRATIONType newAvailableViewsIcon) {
		if (newAvailableViewsIcon != availableViewsIcon) {
			NotificationChain msgs = null;
			if (availableViewsIcon != null)
				msgs = ((InternalEObject)availableViewsIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON, null, msgs);
			if (newAvailableViewsIcon != null)
				msgs = ((InternalEObject)newAvailableViewsIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON, null, msgs);
			msgs = basicSetAvailableViewsIcon(newAvailableViewsIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON, newAvailableViewsIcon, newAvailableViewsIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGEType getAvailableViewsMsg() {
		return availableViewsMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableViewsMsg(MESSAGEType newAvailableViewsMsg, NotificationChain msgs) {
		MESSAGEType oldAvailableViewsMsg = availableViewsMsg;
		availableViewsMsg = newAvailableViewsMsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG, oldAvailableViewsMsg, newAvailableViewsMsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableViewsMsg(MESSAGEType newAvailableViewsMsg) {
		if (newAvailableViewsMsg != availableViewsMsg) {
			NotificationChain msgs = null;
			if (availableViewsMsg != null)
				msgs = ((InternalEObject)availableViewsMsg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG, null, msgs);
			if (newAvailableViewsMsg != null)
				msgs = ((InternalEObject)newAvailableViewsMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG, null, msgs);
			msgs = basicSetAvailableViewsMsg(newAvailableViewsMsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG, newAvailableViewsMsg, newAvailableViewsMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTPARAMICONType getContextParamIcon() {
		return contextParamIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextParamIcon(CONTEXTPARAMICONType newContextParamIcon, NotificationChain msgs) {
		CONTEXTPARAMICONType oldContextParamIcon = contextParamIcon;
		contextParamIcon = newContextParamIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON, oldContextParamIcon, newContextParamIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextParamIcon(CONTEXTPARAMICONType newContextParamIcon) {
		if (newContextParamIcon != contextParamIcon) {
			NotificationChain msgs = null;
			if (contextParamIcon != null)
				msgs = ((InternalEObject)contextParamIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON, null, msgs);
			if (newContextParamIcon != null)
				msgs = ((InternalEObject)newContextParamIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON, null, msgs);
			msgs = basicSetContextParamIcon(newContextParamIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON, newContextParamIcon, newContextParamIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGEType getContextParamMsg() {
		return contextParamMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextParamMsg(MESSAGEType newContextParamMsg, NotificationChain msgs) {
		MESSAGEType oldContextParamMsg = contextParamMsg;
		contextParamMsg = newContextParamMsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG, oldContextParamMsg, newContextParamMsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextParamMsg(MESSAGEType newContextParamMsg) {
		if (newContextParamMsg != contextParamMsg) {
			NotificationChain msgs = null;
			if (contextParamMsg != null)
				msgs = ((InternalEObject)contextParamMsg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG, null, msgs);
			if (newContextParamMsg != null)
				msgs = ((InternalEObject)newContextParamMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG, null, msgs);
			msgs = basicSetContextParamMsg(newContextParamMsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG, newContextParamMsg, newContextParamMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES:
				return basicSetRequiredItemValues(null, msgs);
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON:
				return basicSetAvailableViewsIcon(null, msgs);
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG:
				return basicSetAvailableViewsMsg(null, msgs);
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON:
				return basicSetContextParamIcon(null, msgs);
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG:
				return basicSetContextParamMsg(null, msgs);
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
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES:
				return getRequiredItemValues();
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON:
				return getAvailableViewsIcon();
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG:
				return getAvailableViewsMsg();
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON:
				return getContextParamIcon();
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG:
				return getContextParamMsg();
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
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES:
				setRequiredItemValues((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON:
				setAvailableViewsIcon((ILLUSTRATIONType)newValue);
				return;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG:
				setAvailableViewsMsg((MESSAGEType)newValue);
				return;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON:
				setContextParamIcon((CONTEXTPARAMICONType)newValue);
				return;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG:
				setContextParamMsg((MESSAGEType)newValue);
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
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES:
				setRequiredItemValues((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON:
				setAvailableViewsIcon((ILLUSTRATIONType)null);
				return;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG:
				setAvailableViewsMsg((MESSAGEType)null);
				return;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON:
				setContextParamIcon((CONTEXTPARAMICONType)null);
				return;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG:
				setContextParamMsg((MESSAGEType)null);
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
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__REQUIRED_ITEM_VALUES:
				return requiredItemValues != null;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_ICON:
				return availableViewsIcon != null;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__AVAILABLE_VIEWS_MSG:
				return availableViewsMsg != null;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_ICON:
				return contextParamIcon != null;
			case OntomlPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION_TYPE__CONTEXT_PARAM_MSG:
				return contextParamMsg != null;
		}
		return super.eIsSet(featureID);
	}

} //EXPLICITFUNCTIONALMODELCLASSEXTENSIONTypeImpl
