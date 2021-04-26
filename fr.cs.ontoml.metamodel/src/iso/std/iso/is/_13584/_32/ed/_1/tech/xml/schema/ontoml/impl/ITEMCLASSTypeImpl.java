/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ITEMCLASS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSTypeImpl#getSimplifiedDrawing <em>Simplified Drawing</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSTypeImpl#getCodedName <em>Coded Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSTypeImpl#isInstanceSharable <em>Instance Sharable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ITEMCLASSTypeImpl extends CLASSTypeImpl implements ITEMCLASSType {
	/**
	 * The cached value of the '{@link #getSimplifiedDrawing() <em>Simplified Drawing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplifiedDrawing()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICSType simplifiedDrawing;

	/**
	 * The default value of the '{@link #getCodedName() <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodedName() <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedName()
	 * @generated
	 * @ordered
	 */
	protected String codedName = CODED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isInstanceSharable() <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstanceSharable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANCE_SHARABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstanceSharable() <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstanceSharable()
	 * @generated
	 * @ordered
	 */
	protected boolean instanceSharable = INSTANCE_SHARABLE_EDEFAULT;

	/**
	 * This is true if the Instance Sharable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instanceSharableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITEMCLASSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getITEMCLASSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICSType getSimplifiedDrawing() {
		return simplifiedDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimplifiedDrawing(GRAPHICSType newSimplifiedDrawing, NotificationChain msgs) {
		GRAPHICSType oldSimplifiedDrawing = simplifiedDrawing;
		simplifiedDrawing = newSimplifiedDrawing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASS_TYPE__SIMPLIFIED_DRAWING, oldSimplifiedDrawing, newSimplifiedDrawing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimplifiedDrawing(GRAPHICSType newSimplifiedDrawing) {
		if (newSimplifiedDrawing != simplifiedDrawing) {
			NotificationChain msgs = null;
			if (simplifiedDrawing != null)
				msgs = ((InternalEObject)simplifiedDrawing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASS_TYPE__SIMPLIFIED_DRAWING, null, msgs);
			if (newSimplifiedDrawing != null)
				msgs = ((InternalEObject)newSimplifiedDrawing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASS_TYPE__SIMPLIFIED_DRAWING, null, msgs);
			msgs = basicSetSimplifiedDrawing(newSimplifiedDrawing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASS_TYPE__SIMPLIFIED_DRAWING, newSimplifiedDrawing, newSimplifiedDrawing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodedName() {
		return codedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodedName(String newCodedName) {
		String oldCodedName = codedName;
		codedName = newCodedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASS_TYPE__CODED_NAME, oldCodedName, codedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstanceSharable() {
		return instanceSharable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceSharable(boolean newInstanceSharable) {
		boolean oldInstanceSharable = instanceSharable;
		instanceSharable = newInstanceSharable;
		boolean oldInstanceSharableESet = instanceSharableESet;
		instanceSharableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASS_TYPE__INSTANCE_SHARABLE, oldInstanceSharable, instanceSharable, !oldInstanceSharableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstanceSharable() {
		boolean oldInstanceSharable = instanceSharable;
		boolean oldInstanceSharableESet = instanceSharableESet;
		instanceSharable = INSTANCE_SHARABLE_EDEFAULT;
		instanceSharableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.ITEMCLASS_TYPE__INSTANCE_SHARABLE, oldInstanceSharable, INSTANCE_SHARABLE_EDEFAULT, oldInstanceSharableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstanceSharable() {
		return instanceSharableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.ITEMCLASS_TYPE__SIMPLIFIED_DRAWING:
				return basicSetSimplifiedDrawing(null, msgs);
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
			case OntomlPackage.ITEMCLASS_TYPE__SIMPLIFIED_DRAWING:
				return getSimplifiedDrawing();
			case OntomlPackage.ITEMCLASS_TYPE__CODED_NAME:
				return getCodedName();
			case OntomlPackage.ITEMCLASS_TYPE__INSTANCE_SHARABLE:
				return isInstanceSharable();
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
			case OntomlPackage.ITEMCLASS_TYPE__SIMPLIFIED_DRAWING:
				setSimplifiedDrawing((GRAPHICSType)newValue);
				return;
			case OntomlPackage.ITEMCLASS_TYPE__CODED_NAME:
				setCodedName((String)newValue);
				return;
			case OntomlPackage.ITEMCLASS_TYPE__INSTANCE_SHARABLE:
				setInstanceSharable((Boolean)newValue);
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
			case OntomlPackage.ITEMCLASS_TYPE__SIMPLIFIED_DRAWING:
				setSimplifiedDrawing((GRAPHICSType)null);
				return;
			case OntomlPackage.ITEMCLASS_TYPE__CODED_NAME:
				setCodedName(CODED_NAME_EDEFAULT);
				return;
			case OntomlPackage.ITEMCLASS_TYPE__INSTANCE_SHARABLE:
				unsetInstanceSharable();
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
			case OntomlPackage.ITEMCLASS_TYPE__SIMPLIFIED_DRAWING:
				return simplifiedDrawing != null;
			case OntomlPackage.ITEMCLASS_TYPE__CODED_NAME:
				return CODED_NAME_EDEFAULT == null ? codedName != null : !CODED_NAME_EDEFAULT.equals(codedName);
			case OntomlPackage.ITEMCLASS_TYPE__INSTANCE_SHARABLE:
				return isSetInstanceSharable();
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
		result.append(" (codedName: ");
		result.append(codedName);
		result.append(", instanceSharable: ");
		if (instanceSharableESet) result.append(instanceSharable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ITEMCLASSTypeImpl
