/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GEOMETRICCONTEXTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEOMETRICCONTEXT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICCONTEXTTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.GEOMETRICCONTEXTTypeImpl#getCoordinateSoaceDimension <em>Coordinate Soace Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEOMETRICCONTEXTTypeImpl extends MinimalEObjectImpl.Container implements GEOMETRICCONTEXTType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected TEXTType description;

	/**
	 * The default value of the '{@link #getCoordinateSoaceDimension() <em>Coordinate Soace Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSoaceDimension()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COORDINATE_SOACE_DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordinateSoaceDimension() <em>Coordinate Soace Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSoaceDimension()
	 * @generated
	 * @ordered
	 */
	protected BigInteger coordinateSoaceDimension = COORDINATE_SOACE_DIMENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEOMETRICCONTEXTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getGEOMETRICCONTEXTType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(TEXTType newDescription, NotificationChain msgs) {
		TEXTType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICCONTEXT_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(TEXTType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICCONTEXT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.GEOMETRICCONTEXT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICCONTEXT_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCoordinateSoaceDimension() {
		return coordinateSoaceDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSoaceDimension(BigInteger newCoordinateSoaceDimension) {
		BigInteger oldCoordinateSoaceDimension = coordinateSoaceDimension;
		coordinateSoaceDimension = newCoordinateSoaceDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.GEOMETRICCONTEXT_TYPE__COORDINATE_SOACE_DIMENSION, oldCoordinateSoaceDimension, coordinateSoaceDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.GEOMETRICCONTEXT_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case OntomlPackage.GEOMETRICCONTEXT_TYPE__DESCRIPTION:
				return getDescription();
			case OntomlPackage.GEOMETRICCONTEXT_TYPE__COORDINATE_SOACE_DIMENSION:
				return getCoordinateSoaceDimension();
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
			case OntomlPackage.GEOMETRICCONTEXT_TYPE__DESCRIPTION:
				setDescription((TEXTType)newValue);
				return;
			case OntomlPackage.GEOMETRICCONTEXT_TYPE__COORDINATE_SOACE_DIMENSION:
				setCoordinateSoaceDimension((BigInteger)newValue);
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
			case OntomlPackage.GEOMETRICCONTEXT_TYPE__DESCRIPTION:
				setDescription((TEXTType)null);
				return;
			case OntomlPackage.GEOMETRICCONTEXT_TYPE__COORDINATE_SOACE_DIMENSION:
				setCoordinateSoaceDimension(COORDINATE_SOACE_DIMENSION_EDEFAULT);
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
			case OntomlPackage.GEOMETRICCONTEXT_TYPE__DESCRIPTION:
				return description != null;
			case OntomlPackage.GEOMETRICCONTEXT_TYPE__COORDINATE_SOACE_DIMENSION:
				return COORDINATE_SOACE_DIMENSION_EDEFAULT == null ? coordinateSoaceDimension != null : !COORDINATE_SOACE_DIMENSION_EDEFAULT.equals(coordinateSoaceDimension);
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
		result.append(" (coordinateSoaceDimension: ");
		result.append(coordinateSoaceDimension);
		result.append(')');
		return result.toString();
	}

} //GEOMETRICCONTEXTTypeImpl
