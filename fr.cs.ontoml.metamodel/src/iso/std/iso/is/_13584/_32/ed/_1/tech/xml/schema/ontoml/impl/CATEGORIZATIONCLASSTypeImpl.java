/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CATEGORIZATIONCLASSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CATEGORIZATIONCLASS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CATEGORIZATIONCLASSTypeImpl#getCategorizationClassSuperclasses <em>Categorization Class Superclasses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CATEGORIZATIONCLASSTypeImpl extends CLASSTypeImpl implements CATEGORIZATIONCLASSType {
	/**
	 * The cached value of the '{@link #getCategorizationClassSuperclasses() <em>Categorization Class Superclasses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizationClassSuperclasses()
	 * @generated
	 * @ordered
	 */
	protected CLASSESREFERENCEType categorizationClassSuperclasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CATEGORIZATIONCLASSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCATEGORIZATIONCLASSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCEType getCategorizationClassSuperclasses() {
		return categorizationClassSuperclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategorizationClassSuperclasses(CLASSESREFERENCEType newCategorizationClassSuperclasses, NotificationChain msgs) {
		CLASSESREFERENCEType oldCategorizationClassSuperclasses = categorizationClassSuperclasses;
		categorizationClassSuperclasses = newCategorizationClassSuperclasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES, oldCategorizationClassSuperclasses, newCategorizationClassSuperclasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorizationClassSuperclasses(CLASSESREFERENCEType newCategorizationClassSuperclasses) {
		if (newCategorizationClassSuperclasses != categorizationClassSuperclasses) {
			NotificationChain msgs = null;
			if (categorizationClassSuperclasses != null)
				msgs = ((InternalEObject)categorizationClassSuperclasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES, null, msgs);
			if (newCategorizationClassSuperclasses != null)
				msgs = ((InternalEObject)newCategorizationClassSuperclasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES, null, msgs);
			msgs = basicSetCategorizationClassSuperclasses(newCategorizationClassSuperclasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES, newCategorizationClassSuperclasses, newCategorizationClassSuperclasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES:
				return basicSetCategorizationClassSuperclasses(null, msgs);
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
			case OntomlPackage.CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES:
				return getCategorizationClassSuperclasses();
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
			case OntomlPackage.CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES:
				setCategorizationClassSuperclasses((CLASSESREFERENCEType)newValue);
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
			case OntomlPackage.CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES:
				setCategorizationClassSuperclasses((CLASSESREFERENCEType)null);
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
			case OntomlPackage.CATEGORIZATIONCLASS_TYPE__CATEGORIZATION_CLASS_SUPERCLASSES:
				return categorizationClassSuperclasses != null;
		}
		return super.eIsSet(featureID);
	}

} //CATEGORIZATIONCLASSTypeImpl
