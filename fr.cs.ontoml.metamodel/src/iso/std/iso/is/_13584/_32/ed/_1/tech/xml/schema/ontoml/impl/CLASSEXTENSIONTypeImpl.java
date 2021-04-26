/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSEXTENSIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSIFICATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.RECOMMENDEDPRESENTATIONType;

import iso.std.iso.ts._29002._10.ed._1.tech.xml.schema.catalogue.CatalogueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLASSEXTENSION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl#getDictionaryDefinition <em>Dictionary Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl#getContentVersion <em>Content Version</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl#getContentRevision <em>Content Revision</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl#getRecommendedPresentation <em>Recommended Presentation</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl#getInstanceIdentification <em>Instance Identification</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.CLASSEXTENSIONTypeImpl#isTableLike <em>Table Like</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CLASSEXTENSIONTypeImpl extends MinimalEObjectImpl.Container implements CLASSEXTENSIONType {
	/**
	 * The cached value of the '{@link #getDictionaryDefinition() <em>Dictionary Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryDefinition()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCEType dictionaryDefinition;

	/**
	 * The default value of the '{@link #getContentVersion() <em>Content Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentVersion() <em>Content Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVersion()
	 * @generated
	 * @ordered
	 */
	protected String contentVersion = CONTENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentRevision() <em>Content Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentRevision() <em>Content Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRevision()
	 * @generated
	 * @ordered
	 */
	protected String contentRevision = CONTENT_REVISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecommendedPresentation() <em>Recommended Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPresentation()
	 * @generated
	 * @ordered
	 */
	protected RECOMMENDEDPRESENTATIONType recommendedPresentation;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected CLASSIFICATIONType classification;

	/**
	 * The cached value of the '{@link #getInstanceIdentification() <em>Instance Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceIdentification()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType instanceIdentification;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected CatalogueType population;

	/**
	 * The default value of the '{@link #isTableLike() <em>Table Like</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTableLike()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TABLE_LIKE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTableLike() <em>Table Like</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTableLike()
	 * @generated
	 * @ordered
	 */
	protected boolean tableLike = TABLE_LIKE_EDEFAULT;

	/**
	 * This is true if the Table Like attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tableLikeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSEXTENSIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getCLASSEXTENSIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType getDictionaryDefinition() {
		return dictionaryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionaryDefinition(CLASSREFERENCEType newDictionaryDefinition, NotificationChain msgs) {
		CLASSREFERENCEType oldDictionaryDefinition = dictionaryDefinition;
		dictionaryDefinition = newDictionaryDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION, oldDictionaryDefinition, newDictionaryDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionaryDefinition(CLASSREFERENCEType newDictionaryDefinition) {
		if (newDictionaryDefinition != dictionaryDefinition) {
			NotificationChain msgs = null;
			if (dictionaryDefinition != null)
				msgs = ((InternalEObject)dictionaryDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION, null, msgs);
			if (newDictionaryDefinition != null)
				msgs = ((InternalEObject)newDictionaryDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION, null, msgs);
			msgs = basicSetDictionaryDefinition(newDictionaryDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION, newDictionaryDefinition, newDictionaryDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentVersion() {
		return contentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentVersion(String newContentVersion) {
		String oldContentVersion = contentVersion;
		contentVersion = newContentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_VERSION, oldContentVersion, contentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentRevision() {
		return contentRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentRevision(String newContentRevision) {
		String oldContentRevision = contentRevision;
		contentRevision = newContentRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_REVISION, oldContentRevision, contentRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RECOMMENDEDPRESENTATIONType getRecommendedPresentation() {
		return recommendedPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecommendedPresentation(RECOMMENDEDPRESENTATIONType newRecommendedPresentation, NotificationChain msgs) {
		RECOMMENDEDPRESENTATIONType oldRecommendedPresentation = recommendedPresentation;
		recommendedPresentation = newRecommendedPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION, oldRecommendedPresentation, newRecommendedPresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendedPresentation(RECOMMENDEDPRESENTATIONType newRecommendedPresentation) {
		if (newRecommendedPresentation != recommendedPresentation) {
			NotificationChain msgs = null;
			if (recommendedPresentation != null)
				msgs = ((InternalEObject)recommendedPresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION, null, msgs);
			if (newRecommendedPresentation != null)
				msgs = ((InternalEObject)newRecommendedPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION, null, msgs);
			msgs = basicSetRecommendedPresentation(newRecommendedPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION, newRecommendedPresentation, newRecommendedPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSIFICATIONType getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(CLASSIFICATIONType newClassification, NotificationChain msgs) {
		CLASSIFICATIONType oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__CLASSIFICATION, oldClassification, newClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(CLASSIFICATIONType newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getInstanceIdentification() {
		return instanceIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceIdentification(PROPERTIESREFERENCEType newInstanceIdentification, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldInstanceIdentification = instanceIdentification;
		instanceIdentification = newInstanceIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION, oldInstanceIdentification, newInstanceIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceIdentification(PROPERTIESREFERENCEType newInstanceIdentification) {
		if (newInstanceIdentification != instanceIdentification) {
			NotificationChain msgs = null;
			if (instanceIdentification != null)
				msgs = ((InternalEObject)instanceIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION, null, msgs);
			if (newInstanceIdentification != null)
				msgs = ((InternalEObject)newInstanceIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION, null, msgs);
			msgs = basicSetInstanceIdentification(newInstanceIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION, newInstanceIdentification, newInstanceIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueType getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulation(CatalogueType newPopulation, NotificationChain msgs) {
		CatalogueType oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__POPULATION, oldPopulation, newPopulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(CatalogueType newPopulation) {
		if (newPopulation != population) {
			NotificationChain msgs = null;
			if (population != null)
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.CLASSEXTENSION_TYPE__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__POPULATION, newPopulation, newPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTableLike() {
		return tableLike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableLike(boolean newTableLike) {
		boolean oldTableLike = tableLike;
		tableLike = newTableLike;
		boolean oldTableLikeESet = tableLikeESet;
		tableLikeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.CLASSEXTENSION_TYPE__TABLE_LIKE, oldTableLike, tableLike, !oldTableLikeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTableLike() {
		boolean oldTableLike = tableLike;
		boolean oldTableLikeESet = tableLikeESet;
		tableLike = TABLE_LIKE_EDEFAULT;
		tableLikeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.CLASSEXTENSION_TYPE__TABLE_LIKE, oldTableLike, TABLE_LIKE_EDEFAULT, oldTableLikeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTableLike() {
		return tableLikeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION:
				return basicSetDictionaryDefinition(null, msgs);
			case OntomlPackage.CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION:
				return basicSetRecommendedPresentation(null, msgs);
			case OntomlPackage.CLASSEXTENSION_TYPE__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case OntomlPackage.CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION:
				return basicSetInstanceIdentification(null, msgs);
			case OntomlPackage.CLASSEXTENSION_TYPE__POPULATION:
				return basicSetPopulation(null, msgs);
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
			case OntomlPackage.CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION:
				return getDictionaryDefinition();
			case OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_VERSION:
				return getContentVersion();
			case OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_REVISION:
				return getContentRevision();
			case OntomlPackage.CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION:
				return getRecommendedPresentation();
			case OntomlPackage.CLASSEXTENSION_TYPE__CLASSIFICATION:
				return getClassification();
			case OntomlPackage.CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION:
				return getInstanceIdentification();
			case OntomlPackage.CLASSEXTENSION_TYPE__POPULATION:
				return getPopulation();
			case OntomlPackage.CLASSEXTENSION_TYPE__TABLE_LIKE:
				return isTableLike();
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
			case OntomlPackage.CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION:
				setDictionaryDefinition((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_VERSION:
				setContentVersion((String)newValue);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_REVISION:
				setContentRevision((String)newValue);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION:
				setRecommendedPresentation((RECOMMENDEDPRESENTATIONType)newValue);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__CLASSIFICATION:
				setClassification((CLASSIFICATIONType)newValue);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION:
				setInstanceIdentification((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__POPULATION:
				setPopulation((CatalogueType)newValue);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__TABLE_LIKE:
				setTableLike((Boolean)newValue);
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
			case OntomlPackage.CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION:
				setDictionaryDefinition((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_VERSION:
				setContentVersion(CONTENT_VERSION_EDEFAULT);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_REVISION:
				setContentRevision(CONTENT_REVISION_EDEFAULT);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION:
				setRecommendedPresentation((RECOMMENDEDPRESENTATIONType)null);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__CLASSIFICATION:
				setClassification((CLASSIFICATIONType)null);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION:
				setInstanceIdentification((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__POPULATION:
				setPopulation((CatalogueType)null);
				return;
			case OntomlPackage.CLASSEXTENSION_TYPE__TABLE_LIKE:
				unsetTableLike();
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
			case OntomlPackage.CLASSEXTENSION_TYPE__DICTIONARY_DEFINITION:
				return dictionaryDefinition != null;
			case OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_VERSION:
				return CONTENT_VERSION_EDEFAULT == null ? contentVersion != null : !CONTENT_VERSION_EDEFAULT.equals(contentVersion);
			case OntomlPackage.CLASSEXTENSION_TYPE__CONTENT_REVISION:
				return CONTENT_REVISION_EDEFAULT == null ? contentRevision != null : !CONTENT_REVISION_EDEFAULT.equals(contentRevision);
			case OntomlPackage.CLASSEXTENSION_TYPE__RECOMMENDED_PRESENTATION:
				return recommendedPresentation != null;
			case OntomlPackage.CLASSEXTENSION_TYPE__CLASSIFICATION:
				return classification != null;
			case OntomlPackage.CLASSEXTENSION_TYPE__INSTANCE_IDENTIFICATION:
				return instanceIdentification != null;
			case OntomlPackage.CLASSEXTENSION_TYPE__POPULATION:
				return population != null;
			case OntomlPackage.CLASSEXTENSION_TYPE__TABLE_LIKE:
				return isSetTableLike();
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
		result.append(" (contentVersion: ");
		result.append(contentVersion);
		result.append(", contentRevision: ");
		result.append(contentRevision);
		result.append(", tableLike: ");
		if (tableLikeESet) result.append(tableLike); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CLASSEXTENSIONTypeImpl
