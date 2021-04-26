/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORIVIEWOFType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CORRESPONDINGPROPERTIESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APOSTERIORIVIEWOF Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORIVIEWOFTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORIVIEWOFTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.APOSTERIORIVIEWOFTypeImpl#getCorrespondingProperties <em>Corresponding Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APOSTERIORIVIEWOFTypeImpl extends APOSTERIORISEMANTICRELATIONSHIPTypeImpl implements APOSTERIORIVIEWOFType {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCEType item;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCEType model;

	/**
	 * The cached value of the '{@link #getCorrespondingProperties() <em>Corresponding Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingProperties()
	 * @generated
	 * @ordered
	 */
	protected CORRESPONDINGPROPERTIESType correspondingProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APOSTERIORIVIEWOFTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getAPOSTERIORIVIEWOFType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(CLASSREFERENCEType newItem, NotificationChain msgs) {
		CLASSREFERENCEType oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORIVIEWOF_TYPE__ITEM, oldItem, newItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(CLASSREFERENCEType newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORIVIEWOF_TYPE__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORIVIEWOF_TYPE__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORIVIEWOF_TYPE__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(CLASSREFERENCEType newModel, NotificationChain msgs) {
		CLASSREFERENCEType oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORIVIEWOF_TYPE__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(CLASSREFERENCEType newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORIVIEWOF_TYPE__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORIVIEWOF_TYPE__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORIVIEWOF_TYPE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CORRESPONDINGPROPERTIESType getCorrespondingProperties() {
		return correspondingProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondingProperties(CORRESPONDINGPROPERTIESType newCorrespondingProperties, NotificationChain msgs) {
		CORRESPONDINGPROPERTIESType oldCorrespondingProperties = correspondingProperties;
		correspondingProperties = newCorrespondingProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES, oldCorrespondingProperties, newCorrespondingProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingProperties(CORRESPONDINGPROPERTIESType newCorrespondingProperties) {
		if (newCorrespondingProperties != correspondingProperties) {
			NotificationChain msgs = null;
			if (correspondingProperties != null)
				msgs = ((InternalEObject)correspondingProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES, null, msgs);
			if (newCorrespondingProperties != null)
				msgs = ((InternalEObject)newCorrespondingProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES, null, msgs);
			msgs = basicSetCorrespondingProperties(newCorrespondingProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES, newCorrespondingProperties, newCorrespondingProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__ITEM:
				return basicSetItem(null, msgs);
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__MODEL:
				return basicSetModel(null, msgs);
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES:
				return basicSetCorrespondingProperties(null, msgs);
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
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__ITEM:
				return getItem();
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__MODEL:
				return getModel();
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES:
				return getCorrespondingProperties();
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
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__ITEM:
				setItem((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__MODEL:
				setModel((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES:
				setCorrespondingProperties((CORRESPONDINGPROPERTIESType)newValue);
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
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__ITEM:
				setItem((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__MODEL:
				setModel((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES:
				setCorrespondingProperties((CORRESPONDINGPROPERTIESType)null);
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
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__ITEM:
				return item != null;
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__MODEL:
				return model != null;
			case OntomlPackage.APOSTERIORIVIEWOF_TYPE__CORRESPONDING_PROPERTIES:
				return correspondingProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //APOSTERIORIVIEWOFTypeImpl
