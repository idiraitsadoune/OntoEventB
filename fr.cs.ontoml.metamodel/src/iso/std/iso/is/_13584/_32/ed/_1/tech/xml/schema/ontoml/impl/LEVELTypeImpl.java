/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.LEVELType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEVEL Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTypeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTypeImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.LEVELTypeImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEVELTypeImpl extends MinimalEObjectImpl.Container implements LEVELType {
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected EObject min;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected EObject nom;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected EObject typ;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected EObject max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEVELTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getLEVELType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(EObject newMin, NotificationChain msgs) {
		EObject oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVEL_TYPE__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(EObject newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVEL_TYPE__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVEL_TYPE__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVEL_TYPE__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNom(EObject newNom, NotificationChain msgs) {
		EObject oldNom = nom;
		nom = newNom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVEL_TYPE__NOM, oldNom, newNom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(EObject newNom) {
		if (newNom != nom) {
			NotificationChain msgs = null;
			if (nom != null)
				msgs = ((InternalEObject)nom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVEL_TYPE__NOM, null, msgs);
			if (newNom != null)
				msgs = ((InternalEObject)newNom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVEL_TYPE__NOM, null, msgs);
			msgs = basicSetNom(newNom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVEL_TYPE__NOM, newNom, newNom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTyp(EObject newTyp, NotificationChain msgs) {
		EObject oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVEL_TYPE__TYP, oldTyp, newTyp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTyp(EObject newTyp) {
		if (newTyp != typ) {
			NotificationChain msgs = null;
			if (typ != null)
				msgs = ((InternalEObject)typ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVEL_TYPE__TYP, null, msgs);
			if (newTyp != null)
				msgs = ((InternalEObject)newTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVEL_TYPE__TYP, null, msgs);
			msgs = basicSetTyp(newTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVEL_TYPE__TYP, newTyp, newTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(EObject newMax, NotificationChain msgs) {
		EObject oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVEL_TYPE__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(EObject newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVEL_TYPE__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.LEVEL_TYPE__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.LEVEL_TYPE__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.LEVEL_TYPE__MIN:
				return basicSetMin(null, msgs);
			case OntomlPackage.LEVEL_TYPE__NOM:
				return basicSetNom(null, msgs);
			case OntomlPackage.LEVEL_TYPE__TYP:
				return basicSetTyp(null, msgs);
			case OntomlPackage.LEVEL_TYPE__MAX:
				return basicSetMax(null, msgs);
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
			case OntomlPackage.LEVEL_TYPE__MIN:
				return getMin();
			case OntomlPackage.LEVEL_TYPE__NOM:
				return getNom();
			case OntomlPackage.LEVEL_TYPE__TYP:
				return getTyp();
			case OntomlPackage.LEVEL_TYPE__MAX:
				return getMax();
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
			case OntomlPackage.LEVEL_TYPE__MIN:
				setMin((EObject)newValue);
				return;
			case OntomlPackage.LEVEL_TYPE__NOM:
				setNom((EObject)newValue);
				return;
			case OntomlPackage.LEVEL_TYPE__TYP:
				setTyp((EObject)newValue);
				return;
			case OntomlPackage.LEVEL_TYPE__MAX:
				setMax((EObject)newValue);
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
			case OntomlPackage.LEVEL_TYPE__MIN:
				setMin((EObject)null);
				return;
			case OntomlPackage.LEVEL_TYPE__NOM:
				setNom((EObject)null);
				return;
			case OntomlPackage.LEVEL_TYPE__TYP:
				setTyp((EObject)null);
				return;
			case OntomlPackage.LEVEL_TYPE__MAX:
				setMax((EObject)null);
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
			case OntomlPackage.LEVEL_TYPE__MIN:
				return min != null;
			case OntomlPackage.LEVEL_TYPE__NOM:
				return nom != null;
			case OntomlPackage.LEVEL_TYPE__TYP:
				return typ != null;
			case OntomlPackage.LEVEL_TYPE__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

} //LEVELTypeImpl
