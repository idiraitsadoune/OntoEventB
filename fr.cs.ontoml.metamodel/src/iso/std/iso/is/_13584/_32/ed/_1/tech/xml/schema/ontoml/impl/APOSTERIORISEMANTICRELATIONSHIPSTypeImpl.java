/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APOSTERIORISEMANTICRELATIONSHIPS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORISEMANTICRELATIONSHIPSTypeImpl#getAPosterioriSemanticRelationship <em>APosteriori Semantic Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APOSTERIORISEMANTICRELATIONSHIPSTypeImpl extends MinimalEObjectImpl.Container implements APOSTERIORISEMANTICRELATIONSHIPSType {
	/**
	 * The cached value of the '{@link #getAPosterioriSemanticRelationship() <em>APosteriori Semantic Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPosterioriSemanticRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<APOSTERIORISEMANTICRELATIONSHIPType> aPosterioriSemanticRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APOSTERIORISEMANTICRELATIONSHIPSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getAPOSTERIORISEMANTICRELATIONSHIPSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APOSTERIORISEMANTICRELATIONSHIPType> getAPosterioriSemanticRelationship() {
		if (aPosterioriSemanticRelationship == null) {
			aPosterioriSemanticRelationship = new EObjectContainmentEList<APOSTERIORISEMANTICRELATIONSHIPType>(APOSTERIORISEMANTICRELATIONSHIPType.class, this, OntomlPackage.APOSTERIORISEMANTICRELATIONSHIPS_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIP);
		}
		return aPosterioriSemanticRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIPS_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				return ((InternalEList<?>)getAPosterioriSemanticRelationship()).basicRemove(otherEnd, msgs);
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
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIPS_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				return getAPosterioriSemanticRelationship();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIPS_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				getAPosterioriSemanticRelationship().clear();
				getAPosterioriSemanticRelationship().addAll((Collection<? extends APOSTERIORISEMANTICRELATIONSHIPType>)newValue);
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
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIPS_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				getAPosterioriSemanticRelationship().clear();
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
			case OntomlPackage.APOSTERIORISEMANTICRELATIONSHIPS_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIP:
				return aPosterioriSemanticRelationship != null && !aPosterioriSemanticRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APOSTERIORISEMANTICRELATIONSHIPSTypeImpl
