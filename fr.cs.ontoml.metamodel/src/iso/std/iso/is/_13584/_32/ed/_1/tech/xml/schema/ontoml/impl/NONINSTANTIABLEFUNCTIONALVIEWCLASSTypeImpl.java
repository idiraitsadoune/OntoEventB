/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONINSTANTIABLEFUNCTIONALVIEWCLASSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NONINSTANTIABLEFUNCTIONALVIEWCLASS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONINSTANTIABLEFUNCTIONALVIEWCLASSTypeImpl#getViewControlVariables <em>View Control Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NONINSTANTIABLEFUNCTIONALVIEWCLASSTypeImpl extends CLASSTypeImpl implements NONINSTANTIABLEFUNCTIONALVIEWCLASSType {
	/**
	 * The cached value of the '{@link #getViewControlVariables() <em>View Control Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewControlVariables()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType viewControlVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NONINSTANTIABLEFUNCTIONALVIEWCLASSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getNONINSTANTIABLEFUNCTIONALVIEWCLASSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getViewControlVariables() {
		return viewControlVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewControlVariables(PROPERTIESREFERENCEType newViewControlVariables, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldViewControlVariables = viewControlVariables;
		viewControlVariables = newViewControlVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES, oldViewControlVariables, newViewControlVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewControlVariables(PROPERTIESREFERENCEType newViewControlVariables) {
		if (newViewControlVariables != viewControlVariables) {
			NotificationChain msgs = null;
			if (viewControlVariables != null)
				msgs = ((InternalEObject)viewControlVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES, null, msgs);
			if (newViewControlVariables != null)
				msgs = ((InternalEObject)newViewControlVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES, null, msgs);
			msgs = basicSetViewControlVariables(newViewControlVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES, newViewControlVariables, newViewControlVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES:
				return basicSetViewControlVariables(null, msgs);
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
			case OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES:
				return getViewControlVariables();
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
			case OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES:
				setViewControlVariables((PROPERTIESREFERENCEType)newValue);
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
			case OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES:
				setViewControlVariables((PROPERTIESREFERENCEType)null);
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
			case OntomlPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS_TYPE__VIEW_CONTROL_VARIABLES:
				return viewControlVariables != null;
		}
		return super.eIsSet(featureID);
	}

} //NONINSTANTIABLEFUNCTIONALVIEWCLASSTypeImpl
