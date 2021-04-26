/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONPAPERType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSPRESENTATIONONSCREENType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CREATEICONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.EXPLICITITEMCLASSEXTENSIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.MESSAGEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPLICITITEMCLASSEXTENSION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITITEMCLASSEXTENSIONTypeImpl#getAccessIcon <em>Access Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITITEMCLASSEXTENSIONTypeImpl#getContentMsg <em>Content Msg</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITITEMCLASSEXTENSIONTypeImpl#getCreateIcon <em>Create Icon</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITITEMCLASSEXTENSIONTypeImpl#getCreateMsg <em>Create Msg</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITITEMCLASSEXTENSIONTypeImpl#getClassPresentationOnPaper <em>Class Presentation On Paper</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.EXPLICITITEMCLASSEXTENSIONTypeImpl#getClassPresentationOnScreen <em>Class Presentation On Screen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXPLICITITEMCLASSEXTENSIONTypeImpl extends CLASSEXTENSIONTypeImpl implements EXPLICITITEMCLASSEXTENSIONType {
	/**
	 * The cached value of the '{@link #getAccessIcon() <em>Access Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessIcon()
	 * @generated
	 * @ordered
	 */
	protected ILLUSTRATIONType accessIcon;

	/**
	 * The cached value of the '{@link #getContentMsg() <em>Content Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMsg()
	 * @generated
	 * @ordered
	 */
	protected MESSAGEType contentMsg;

	/**
	 * The cached value of the '{@link #getCreateIcon() <em>Create Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateIcon()
	 * @generated
	 * @ordered
	 */
	protected CREATEICONType createIcon;

	/**
	 * The cached value of the '{@link #getCreateMsg() <em>Create Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateMsg()
	 * @generated
	 * @ordered
	 */
	protected MESSAGEType createMsg;

	/**
	 * The cached value of the '{@link #getClassPresentationOnPaper() <em>Class Presentation On Paper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPresentationOnPaper()
	 * @generated
	 * @ordered
	 */
	protected CLASSPRESENTATIONONPAPERType classPresentationOnPaper;

	/**
	 * The cached value of the '{@link #getClassPresentationOnScreen() <em>Class Presentation On Screen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPresentationOnScreen()
	 * @generated
	 * @ordered
	 */
	protected CLASSPRESENTATIONONSCREENType classPresentationOnScreen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXPLICITITEMCLASSEXTENSIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getEXPLICITITEMCLASSEXTENSIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATIONType getAccessIcon() {
		return accessIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessIcon(ILLUSTRATIONType newAccessIcon, NotificationChain msgs) {
		ILLUSTRATIONType oldAccessIcon = accessIcon;
		accessIcon = newAccessIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON, oldAccessIcon, newAccessIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessIcon(ILLUSTRATIONType newAccessIcon) {
		if (newAccessIcon != accessIcon) {
			NotificationChain msgs = null;
			if (accessIcon != null)
				msgs = ((InternalEObject)accessIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON, null, msgs);
			if (newAccessIcon != null)
				msgs = ((InternalEObject)newAccessIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON, null, msgs);
			msgs = basicSetAccessIcon(newAccessIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON, newAccessIcon, newAccessIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGEType getContentMsg() {
		return contentMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentMsg(MESSAGEType newContentMsg, NotificationChain msgs) {
		MESSAGEType oldContentMsg = contentMsg;
		contentMsg = newContentMsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG, oldContentMsg, newContentMsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentMsg(MESSAGEType newContentMsg) {
		if (newContentMsg != contentMsg) {
			NotificationChain msgs = null;
			if (contentMsg != null)
				msgs = ((InternalEObject)contentMsg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG, null, msgs);
			if (newContentMsg != null)
				msgs = ((InternalEObject)newContentMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG, null, msgs);
			msgs = basicSetContentMsg(newContentMsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG, newContentMsg, newContentMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CREATEICONType getCreateIcon() {
		return createIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateIcon(CREATEICONType newCreateIcon, NotificationChain msgs) {
		CREATEICONType oldCreateIcon = createIcon;
		createIcon = newCreateIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON, oldCreateIcon, newCreateIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateIcon(CREATEICONType newCreateIcon) {
		if (newCreateIcon != createIcon) {
			NotificationChain msgs = null;
			if (createIcon != null)
				msgs = ((InternalEObject)createIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON, null, msgs);
			if (newCreateIcon != null)
				msgs = ((InternalEObject)newCreateIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON, null, msgs);
			msgs = basicSetCreateIcon(newCreateIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON, newCreateIcon, newCreateIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGEType getCreateMsg() {
		return createMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateMsg(MESSAGEType newCreateMsg, NotificationChain msgs) {
		MESSAGEType oldCreateMsg = createMsg;
		createMsg = newCreateMsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG, oldCreateMsg, newCreateMsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateMsg(MESSAGEType newCreateMsg) {
		if (newCreateMsg != createMsg) {
			NotificationChain msgs = null;
			if (createMsg != null)
				msgs = ((InternalEObject)createMsg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG, null, msgs);
			if (newCreateMsg != null)
				msgs = ((InternalEObject)newCreateMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG, null, msgs);
			msgs = basicSetCreateMsg(newCreateMsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG, newCreateMsg, newCreateMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSPRESENTATIONONPAPERType getClassPresentationOnPaper() {
		return classPresentationOnPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassPresentationOnPaper(CLASSPRESENTATIONONPAPERType newClassPresentationOnPaper, NotificationChain msgs) {
		CLASSPRESENTATIONONPAPERType oldClassPresentationOnPaper = classPresentationOnPaper;
		classPresentationOnPaper = newClassPresentationOnPaper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER, oldClassPresentationOnPaper, newClassPresentationOnPaper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPresentationOnPaper(CLASSPRESENTATIONONPAPERType newClassPresentationOnPaper) {
		if (newClassPresentationOnPaper != classPresentationOnPaper) {
			NotificationChain msgs = null;
			if (classPresentationOnPaper != null)
				msgs = ((InternalEObject)classPresentationOnPaper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER, null, msgs);
			if (newClassPresentationOnPaper != null)
				msgs = ((InternalEObject)newClassPresentationOnPaper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER, null, msgs);
			msgs = basicSetClassPresentationOnPaper(newClassPresentationOnPaper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER, newClassPresentationOnPaper, newClassPresentationOnPaper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSPRESENTATIONONSCREENType getClassPresentationOnScreen() {
		return classPresentationOnScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassPresentationOnScreen(CLASSPRESENTATIONONSCREENType newClassPresentationOnScreen, NotificationChain msgs) {
		CLASSPRESENTATIONONSCREENType oldClassPresentationOnScreen = classPresentationOnScreen;
		classPresentationOnScreen = newClassPresentationOnScreen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN, oldClassPresentationOnScreen, newClassPresentationOnScreen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPresentationOnScreen(CLASSPRESENTATIONONSCREENType newClassPresentationOnScreen) {
		if (newClassPresentationOnScreen != classPresentationOnScreen) {
			NotificationChain msgs = null;
			if (classPresentationOnScreen != null)
				msgs = ((InternalEObject)classPresentationOnScreen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN, null, msgs);
			if (newClassPresentationOnScreen != null)
				msgs = ((InternalEObject)newClassPresentationOnScreen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN, null, msgs);
			msgs = basicSetClassPresentationOnScreen(newClassPresentationOnScreen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN, newClassPresentationOnScreen, newClassPresentationOnScreen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON:
				return basicSetAccessIcon(null, msgs);
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG:
				return basicSetContentMsg(null, msgs);
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON:
				return basicSetCreateIcon(null, msgs);
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG:
				return basicSetCreateMsg(null, msgs);
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER:
				return basicSetClassPresentationOnPaper(null, msgs);
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN:
				return basicSetClassPresentationOnScreen(null, msgs);
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
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON:
				return getAccessIcon();
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG:
				return getContentMsg();
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON:
				return getCreateIcon();
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG:
				return getCreateMsg();
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER:
				return getClassPresentationOnPaper();
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN:
				return getClassPresentationOnScreen();
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
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON:
				setAccessIcon((ILLUSTRATIONType)newValue);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG:
				setContentMsg((MESSAGEType)newValue);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON:
				setCreateIcon((CREATEICONType)newValue);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG:
				setCreateMsg((MESSAGEType)newValue);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER:
				setClassPresentationOnPaper((CLASSPRESENTATIONONPAPERType)newValue);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN:
				setClassPresentationOnScreen((CLASSPRESENTATIONONSCREENType)newValue);
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
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON:
				setAccessIcon((ILLUSTRATIONType)null);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG:
				setContentMsg((MESSAGEType)null);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON:
				setCreateIcon((CREATEICONType)null);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG:
				setCreateMsg((MESSAGEType)null);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER:
				setClassPresentationOnPaper((CLASSPRESENTATIONONPAPERType)null);
				return;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN:
				setClassPresentationOnScreen((CLASSPRESENTATIONONSCREENType)null);
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
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__ACCESS_ICON:
				return accessIcon != null;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CONTENT_MSG:
				return contentMsg != null;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_ICON:
				return createIcon != null;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CREATE_MSG:
				return createMsg != null;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_PAPER:
				return classPresentationOnPaper != null;
			case OntomlPackage.EXPLICITITEMCLASSEXTENSION_TYPE__CLASS_PRESENTATION_ON_SCREEN:
				return classPresentationOnScreen != null;
		}
		return super.eIsSet(featureID);
	}

} //EXPLICITITEMCLASSEXTENSIONTypeImpl
