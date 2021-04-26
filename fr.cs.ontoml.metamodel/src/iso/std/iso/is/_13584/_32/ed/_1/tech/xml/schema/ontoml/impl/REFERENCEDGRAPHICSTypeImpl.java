/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.REFERENCEDGRAPHICSType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REFERENCEDGRAPHICS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.REFERENCEDGRAPHICSTypeImpl#getGraphicsReference <em>Graphics Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REFERENCEDGRAPHICSTypeImpl extends GRAPHICSTypeImpl implements REFERENCEDGRAPHICSType {
	/**
	 * The cached value of the '{@link #getGraphicsReference() <em>Graphics Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicsReference()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTREFERENCEType graphicsReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REFERENCEDGRAPHICSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getREFERENCEDGRAPHICSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTREFERENCEType getGraphicsReference() {
		return graphicsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicsReference(DOCUMENTREFERENCEType newGraphicsReference, NotificationChain msgs) {
		DOCUMENTREFERENCEType oldGraphicsReference = graphicsReference;
		graphicsReference = newGraphicsReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE, oldGraphicsReference, newGraphicsReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicsReference(DOCUMENTREFERENCEType newGraphicsReference) {
		if (newGraphicsReference != graphicsReference) {
			NotificationChain msgs = null;
			if (graphicsReference != null)
				msgs = ((InternalEObject)graphicsReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE, null, msgs);
			if (newGraphicsReference != null)
				msgs = ((InternalEObject)newGraphicsReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE, null, msgs);
			msgs = basicSetGraphicsReference(newGraphicsReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE, newGraphicsReference, newGraphicsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE:
				return basicSetGraphicsReference(null, msgs);
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
			case OntomlPackage.REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE:
				return getGraphicsReference();
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
			case OntomlPackage.REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE:
				setGraphicsReference((DOCUMENTREFERENCEType)newValue);
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
			case OntomlPackage.REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE:
				setGraphicsReference((DOCUMENTREFERENCEType)null);
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
			case OntomlPackage.REFERENCEDGRAPHICS_TYPE__GRAPHICS_REFERENCE:
				return graphicsReference != null;
		}
		return super.eIsSet(featureID);
	}

} //REFERENCEDGRAPHICSTypeImpl
