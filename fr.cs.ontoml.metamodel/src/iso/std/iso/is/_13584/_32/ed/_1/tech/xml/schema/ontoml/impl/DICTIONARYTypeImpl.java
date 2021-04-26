/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.APOSTERIORISEMANTICRELATIONSHIPSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDCLASSESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDATATYPESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDDOCUMENTSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDKEYWORDSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDPROPERTIESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSUPPLIERSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONTAINEDSYNONYMSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARIESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DICTIONARYType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SUPPLIERREFERENCEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DICTIONARY Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getUpdates <em>Updates</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getUpdateAgreement <em>Update Agreement</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getReferencedDictionaries <em>Referenced Dictionaries</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getResponsibleSupplier <em>Responsible Supplier</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getAPosterioriSemanticRelationships <em>APosteriori Semantic Relationships</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getContainedSuppliers <em>Contained Suppliers</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getContainedDocuments <em>Contained Documents</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getContainedDatatypes <em>Contained Datatypes</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getContainedKeywords <em>Contained Keywords</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.DICTIONARYTypeImpl#getContainedSynonyms <em>Contained Synonyms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DICTIONARYTypeImpl extends MinimalEObjectImpl.Container implements DICTIONARYType {
	/**
	 * The default value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean isComplete = IS_COMPLETE_EDEFAULT;

	/**
	 * This is true if the Is Complete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCompleteESet;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected DICTIONARYREFERENCEType updates;

	/**
	 * The default value of the '{@link #getUpdateAgreement() <em>Update Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateAgreement()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_AGREEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateAgreement() <em>Update Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateAgreement()
	 * @generated
	 * @ordered
	 */
	protected String updateAgreement = UPDATE_AGREEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedDictionaries() <em>Referenced Dictionaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedDictionaries()
	 * @generated
	 * @ordered
	 */
	protected DICTIONARIESREFERENCEType referencedDictionaries;

	/**
	 * The cached value of the '{@link #getResponsibleSupplier() <em>Responsible Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleSupplier()
	 * @generated
	 * @ordered
	 */
	protected SUPPLIERREFERENCEType responsibleSupplier;

	/**
	 * The cached value of the '{@link #getContainedClasses() <em>Contained Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClasses()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDCLASSESType containedClasses;

	/**
	 * The cached value of the '{@link #getAPosterioriSemanticRelationships() <em>APosteriori Semantic Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPosterioriSemanticRelationships()
	 * @generated
	 * @ordered
	 */
	protected APOSTERIORISEMANTICRELATIONSHIPSType aPosterioriSemanticRelationships;

	/**
	 * The cached value of the '{@link #getContainedSuppliers() <em>Contained Suppliers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSuppliers()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDSUPPLIERSType containedSuppliers;

	/**
	 * The cached value of the '{@link #getContainedProperties() <em>Contained Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedProperties()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDPROPERTIESType containedProperties;

	/**
	 * The cached value of the '{@link #getContainedDocuments() <em>Contained Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedDocuments()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDDOCUMENTSType containedDocuments;

	/**
	 * The cached value of the '{@link #getContainedDatatypes() <em>Contained Datatypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedDatatypes()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDDATATYPESType containedDatatypes;

	/**
	 * The cached value of the '{@link #getContainedKeywords() <em>Contained Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedKeywords()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDKEYWORDSType containedKeywords;

	/**
	 * The cached value of the '{@link #getContainedSynonyms() <em>Contained Synonyms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSynonyms()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDSYNONYMSType containedSynonyms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICTIONARYTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getDICTIONARYType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComplete() {
		return isComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComplete(boolean newIsComplete) {
		boolean oldIsComplete = isComplete;
		isComplete = newIsComplete;
		boolean oldIsCompleteESet = isCompleteESet;
		isCompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__IS_COMPLETE, oldIsComplete, isComplete, !oldIsCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsComplete() {
		boolean oldIsComplete = isComplete;
		boolean oldIsCompleteESet = isCompleteESet;
		isComplete = IS_COMPLETE_EDEFAULT;
		isCompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.DICTIONARY_TYPE__IS_COMPLETE, oldIsComplete, IS_COMPLETE_EDEFAULT, oldIsCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsComplete() {
		return isCompleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARYREFERENCEType getUpdates() {
		return updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdates(DICTIONARYREFERENCEType newUpdates, NotificationChain msgs) {
		DICTIONARYREFERENCEType oldUpdates = updates;
		updates = newUpdates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__UPDATES, oldUpdates, newUpdates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdates(DICTIONARYREFERENCEType newUpdates) {
		if (newUpdates != updates) {
			NotificationChain msgs = null;
			if (updates != null)
				msgs = ((InternalEObject)updates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__UPDATES, null, msgs);
			if (newUpdates != null)
				msgs = ((InternalEObject)newUpdates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__UPDATES, null, msgs);
			msgs = basicSetUpdates(newUpdates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__UPDATES, newUpdates, newUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateAgreement() {
		return updateAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateAgreement(String newUpdateAgreement) {
		String oldUpdateAgreement = updateAgreement;
		updateAgreement = newUpdateAgreement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__UPDATE_AGREEMENT, oldUpdateAgreement, updateAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARIESREFERENCEType getReferencedDictionaries() {
		return referencedDictionaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedDictionaries(DICTIONARIESREFERENCEType newReferencedDictionaries, NotificationChain msgs) {
		DICTIONARIESREFERENCEType oldReferencedDictionaries = referencedDictionaries;
		referencedDictionaries = newReferencedDictionaries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__REFERENCED_DICTIONARIES, oldReferencedDictionaries, newReferencedDictionaries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedDictionaries(DICTIONARIESREFERENCEType newReferencedDictionaries) {
		if (newReferencedDictionaries != referencedDictionaries) {
			NotificationChain msgs = null;
			if (referencedDictionaries != null)
				msgs = ((InternalEObject)referencedDictionaries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__REFERENCED_DICTIONARIES, null, msgs);
			if (newReferencedDictionaries != null)
				msgs = ((InternalEObject)newReferencedDictionaries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__REFERENCED_DICTIONARIES, null, msgs);
			msgs = basicSetReferencedDictionaries(newReferencedDictionaries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__REFERENCED_DICTIONARIES, newReferencedDictionaries, newReferencedDictionaries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERREFERENCEType getResponsibleSupplier() {
		return responsibleSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleSupplier(SUPPLIERREFERENCEType newResponsibleSupplier, NotificationChain msgs) {
		SUPPLIERREFERENCEType oldResponsibleSupplier = responsibleSupplier;
		responsibleSupplier = newResponsibleSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER, oldResponsibleSupplier, newResponsibleSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleSupplier(SUPPLIERREFERENCEType newResponsibleSupplier) {
		if (newResponsibleSupplier != responsibleSupplier) {
			NotificationChain msgs = null;
			if (responsibleSupplier != null)
				msgs = ((InternalEObject)responsibleSupplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER, null, msgs);
			if (newResponsibleSupplier != null)
				msgs = ((InternalEObject)newResponsibleSupplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER, null, msgs);
			msgs = basicSetResponsibleSupplier(newResponsibleSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER, newResponsibleSupplier, newResponsibleSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDCLASSESType getContainedClasses() {
		return containedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedClasses(CONTAINEDCLASSESType newContainedClasses, NotificationChain msgs) {
		CONTAINEDCLASSESType oldContainedClasses = containedClasses;
		containedClasses = newContainedClasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_CLASSES, oldContainedClasses, newContainedClasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedClasses(CONTAINEDCLASSESType newContainedClasses) {
		if (newContainedClasses != containedClasses) {
			NotificationChain msgs = null;
			if (containedClasses != null)
				msgs = ((InternalEObject)containedClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_CLASSES, null, msgs);
			if (newContainedClasses != null)
				msgs = ((InternalEObject)newContainedClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_CLASSES, null, msgs);
			msgs = basicSetContainedClasses(newContainedClasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_CLASSES, newContainedClasses, newContainedClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORISEMANTICRELATIONSHIPSType getAPosterioriSemanticRelationships() {
		return aPosterioriSemanticRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPosterioriSemanticRelationships(APOSTERIORISEMANTICRELATIONSHIPSType newAPosterioriSemanticRelationships, NotificationChain msgs) {
		APOSTERIORISEMANTICRELATIONSHIPSType oldAPosterioriSemanticRelationships = aPosterioriSemanticRelationships;
		aPosterioriSemanticRelationships = newAPosterioriSemanticRelationships;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS, oldAPosterioriSemanticRelationships, newAPosterioriSemanticRelationships);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPosterioriSemanticRelationships(APOSTERIORISEMANTICRELATIONSHIPSType newAPosterioriSemanticRelationships) {
		if (newAPosterioriSemanticRelationships != aPosterioriSemanticRelationships) {
			NotificationChain msgs = null;
			if (aPosterioriSemanticRelationships != null)
				msgs = ((InternalEObject)aPosterioriSemanticRelationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS, null, msgs);
			if (newAPosterioriSemanticRelationships != null)
				msgs = ((InternalEObject)newAPosterioriSemanticRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS, null, msgs);
			msgs = basicSetAPosterioriSemanticRelationships(newAPosterioriSemanticRelationships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS, newAPosterioriSemanticRelationships, newAPosterioriSemanticRelationships));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDSUPPLIERSType getContainedSuppliers() {
		return containedSuppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedSuppliers(CONTAINEDSUPPLIERSType newContainedSuppliers, NotificationChain msgs) {
		CONTAINEDSUPPLIERSType oldContainedSuppliers = containedSuppliers;
		containedSuppliers = newContainedSuppliers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_SUPPLIERS, oldContainedSuppliers, newContainedSuppliers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedSuppliers(CONTAINEDSUPPLIERSType newContainedSuppliers) {
		if (newContainedSuppliers != containedSuppliers) {
			NotificationChain msgs = null;
			if (containedSuppliers != null)
				msgs = ((InternalEObject)containedSuppliers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_SUPPLIERS, null, msgs);
			if (newContainedSuppliers != null)
				msgs = ((InternalEObject)newContainedSuppliers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_SUPPLIERS, null, msgs);
			msgs = basicSetContainedSuppliers(newContainedSuppliers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_SUPPLIERS, newContainedSuppliers, newContainedSuppliers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDPROPERTIESType getContainedProperties() {
		return containedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedProperties(CONTAINEDPROPERTIESType newContainedProperties, NotificationChain msgs) {
		CONTAINEDPROPERTIESType oldContainedProperties = containedProperties;
		containedProperties = newContainedProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_PROPERTIES, oldContainedProperties, newContainedProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedProperties(CONTAINEDPROPERTIESType newContainedProperties) {
		if (newContainedProperties != containedProperties) {
			NotificationChain msgs = null;
			if (containedProperties != null)
				msgs = ((InternalEObject)containedProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_PROPERTIES, null, msgs);
			if (newContainedProperties != null)
				msgs = ((InternalEObject)newContainedProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_PROPERTIES, null, msgs);
			msgs = basicSetContainedProperties(newContainedProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_PROPERTIES, newContainedProperties, newContainedProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDDOCUMENTSType getContainedDocuments() {
		return containedDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedDocuments(CONTAINEDDOCUMENTSType newContainedDocuments, NotificationChain msgs) {
		CONTAINEDDOCUMENTSType oldContainedDocuments = containedDocuments;
		containedDocuments = newContainedDocuments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_DOCUMENTS, oldContainedDocuments, newContainedDocuments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedDocuments(CONTAINEDDOCUMENTSType newContainedDocuments) {
		if (newContainedDocuments != containedDocuments) {
			NotificationChain msgs = null;
			if (containedDocuments != null)
				msgs = ((InternalEObject)containedDocuments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_DOCUMENTS, null, msgs);
			if (newContainedDocuments != null)
				msgs = ((InternalEObject)newContainedDocuments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_DOCUMENTS, null, msgs);
			msgs = basicSetContainedDocuments(newContainedDocuments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_DOCUMENTS, newContainedDocuments, newContainedDocuments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDDATATYPESType getContainedDatatypes() {
		return containedDatatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedDatatypes(CONTAINEDDATATYPESType newContainedDatatypes, NotificationChain msgs) {
		CONTAINEDDATATYPESType oldContainedDatatypes = containedDatatypes;
		containedDatatypes = newContainedDatatypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_DATATYPES, oldContainedDatatypes, newContainedDatatypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedDatatypes(CONTAINEDDATATYPESType newContainedDatatypes) {
		if (newContainedDatatypes != containedDatatypes) {
			NotificationChain msgs = null;
			if (containedDatatypes != null)
				msgs = ((InternalEObject)containedDatatypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_DATATYPES, null, msgs);
			if (newContainedDatatypes != null)
				msgs = ((InternalEObject)newContainedDatatypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_DATATYPES, null, msgs);
			msgs = basicSetContainedDatatypes(newContainedDatatypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_DATATYPES, newContainedDatatypes, newContainedDatatypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDKEYWORDSType getContainedKeywords() {
		return containedKeywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedKeywords(CONTAINEDKEYWORDSType newContainedKeywords, NotificationChain msgs) {
		CONTAINEDKEYWORDSType oldContainedKeywords = containedKeywords;
		containedKeywords = newContainedKeywords;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_KEYWORDS, oldContainedKeywords, newContainedKeywords);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedKeywords(CONTAINEDKEYWORDSType newContainedKeywords) {
		if (newContainedKeywords != containedKeywords) {
			NotificationChain msgs = null;
			if (containedKeywords != null)
				msgs = ((InternalEObject)containedKeywords).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_KEYWORDS, null, msgs);
			if (newContainedKeywords != null)
				msgs = ((InternalEObject)newContainedKeywords).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_KEYWORDS, null, msgs);
			msgs = basicSetContainedKeywords(newContainedKeywords, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_KEYWORDS, newContainedKeywords, newContainedKeywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDSYNONYMSType getContainedSynonyms() {
		return containedSynonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedSynonyms(CONTAINEDSYNONYMSType newContainedSynonyms, NotificationChain msgs) {
		CONTAINEDSYNONYMSType oldContainedSynonyms = containedSynonyms;
		containedSynonyms = newContainedSynonyms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_SYNONYMS, oldContainedSynonyms, newContainedSynonyms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedSynonyms(CONTAINEDSYNONYMSType newContainedSynonyms) {
		if (newContainedSynonyms != containedSynonyms) {
			NotificationChain msgs = null;
			if (containedSynonyms != null)
				msgs = ((InternalEObject)containedSynonyms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_SYNONYMS, null, msgs);
			if (newContainedSynonyms != null)
				msgs = ((InternalEObject)newContainedSynonyms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.DICTIONARY_TYPE__CONTAINED_SYNONYMS, null, msgs);
			msgs = basicSetContainedSynonyms(newContainedSynonyms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.DICTIONARY_TYPE__CONTAINED_SYNONYMS, newContainedSynonyms, newContainedSynonyms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.DICTIONARY_TYPE__UPDATES:
				return basicSetUpdates(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__REFERENCED_DICTIONARIES:
				return basicSetReferencedDictionaries(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER:
				return basicSetResponsibleSupplier(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_CLASSES:
				return basicSetContainedClasses(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				return basicSetAPosterioriSemanticRelationships(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SUPPLIERS:
				return basicSetContainedSuppliers(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_PROPERTIES:
				return basicSetContainedProperties(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DOCUMENTS:
				return basicSetContainedDocuments(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DATATYPES:
				return basicSetContainedDatatypes(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_KEYWORDS:
				return basicSetContainedKeywords(null, msgs);
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SYNONYMS:
				return basicSetContainedSynonyms(null, msgs);
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
			case OntomlPackage.DICTIONARY_TYPE__IS_COMPLETE:
				return isIsComplete();
			case OntomlPackage.DICTIONARY_TYPE__UPDATES:
				return getUpdates();
			case OntomlPackage.DICTIONARY_TYPE__UPDATE_AGREEMENT:
				return getUpdateAgreement();
			case OntomlPackage.DICTIONARY_TYPE__REFERENCED_DICTIONARIES:
				return getReferencedDictionaries();
			case OntomlPackage.DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER:
				return getResponsibleSupplier();
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_CLASSES:
				return getContainedClasses();
			case OntomlPackage.DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				return getAPosterioriSemanticRelationships();
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SUPPLIERS:
				return getContainedSuppliers();
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_PROPERTIES:
				return getContainedProperties();
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DOCUMENTS:
				return getContainedDocuments();
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DATATYPES:
				return getContainedDatatypes();
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_KEYWORDS:
				return getContainedKeywords();
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SYNONYMS:
				return getContainedSynonyms();
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
			case OntomlPackage.DICTIONARY_TYPE__IS_COMPLETE:
				setIsComplete((Boolean)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__UPDATES:
				setUpdates((DICTIONARYREFERENCEType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__UPDATE_AGREEMENT:
				setUpdateAgreement((String)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__REFERENCED_DICTIONARIES:
				setReferencedDictionaries((DICTIONARIESREFERENCEType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER:
				setResponsibleSupplier((SUPPLIERREFERENCEType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_CLASSES:
				setContainedClasses((CONTAINEDCLASSESType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				setAPosterioriSemanticRelationships((APOSTERIORISEMANTICRELATIONSHIPSType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SUPPLIERS:
				setContainedSuppliers((CONTAINEDSUPPLIERSType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_PROPERTIES:
				setContainedProperties((CONTAINEDPROPERTIESType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DOCUMENTS:
				setContainedDocuments((CONTAINEDDOCUMENTSType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DATATYPES:
				setContainedDatatypes((CONTAINEDDATATYPESType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_KEYWORDS:
				setContainedKeywords((CONTAINEDKEYWORDSType)newValue);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SYNONYMS:
				setContainedSynonyms((CONTAINEDSYNONYMSType)newValue);
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
			case OntomlPackage.DICTIONARY_TYPE__IS_COMPLETE:
				unsetIsComplete();
				return;
			case OntomlPackage.DICTIONARY_TYPE__UPDATES:
				setUpdates((DICTIONARYREFERENCEType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__UPDATE_AGREEMENT:
				setUpdateAgreement(UPDATE_AGREEMENT_EDEFAULT);
				return;
			case OntomlPackage.DICTIONARY_TYPE__REFERENCED_DICTIONARIES:
				setReferencedDictionaries((DICTIONARIESREFERENCEType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER:
				setResponsibleSupplier((SUPPLIERREFERENCEType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_CLASSES:
				setContainedClasses((CONTAINEDCLASSESType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				setAPosterioriSemanticRelationships((APOSTERIORISEMANTICRELATIONSHIPSType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SUPPLIERS:
				setContainedSuppliers((CONTAINEDSUPPLIERSType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_PROPERTIES:
				setContainedProperties((CONTAINEDPROPERTIESType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DOCUMENTS:
				setContainedDocuments((CONTAINEDDOCUMENTSType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DATATYPES:
				setContainedDatatypes((CONTAINEDDATATYPESType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_KEYWORDS:
				setContainedKeywords((CONTAINEDKEYWORDSType)null);
				return;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SYNONYMS:
				setContainedSynonyms((CONTAINEDSYNONYMSType)null);
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
			case OntomlPackage.DICTIONARY_TYPE__IS_COMPLETE:
				return isSetIsComplete();
			case OntomlPackage.DICTIONARY_TYPE__UPDATES:
				return updates != null;
			case OntomlPackage.DICTIONARY_TYPE__UPDATE_AGREEMENT:
				return UPDATE_AGREEMENT_EDEFAULT == null ? updateAgreement != null : !UPDATE_AGREEMENT_EDEFAULT.equals(updateAgreement);
			case OntomlPackage.DICTIONARY_TYPE__REFERENCED_DICTIONARIES:
				return referencedDictionaries != null;
			case OntomlPackage.DICTIONARY_TYPE__RESPONSIBLE_SUPPLIER:
				return responsibleSupplier != null;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_CLASSES:
				return containedClasses != null;
			case OntomlPackage.DICTIONARY_TYPE__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				return aPosterioriSemanticRelationships != null;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SUPPLIERS:
				return containedSuppliers != null;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_PROPERTIES:
				return containedProperties != null;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DOCUMENTS:
				return containedDocuments != null;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_DATATYPES:
				return containedDatatypes != null;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_KEYWORDS:
				return containedKeywords != null;
			case OntomlPackage.DICTIONARY_TYPE__CONTAINED_SYNONYMS:
				return containedSynonyms != null;
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
		result.append(" (isComplete: ");
		if (isCompleteESet) result.append(isComplete); else result.append("<unset>");
		result.append(", updateAgreement: ");
		result.append(updateAgreement);
		result.append(')');
		return result.toString();
	}

} //DICTIONARYTypeImpl
