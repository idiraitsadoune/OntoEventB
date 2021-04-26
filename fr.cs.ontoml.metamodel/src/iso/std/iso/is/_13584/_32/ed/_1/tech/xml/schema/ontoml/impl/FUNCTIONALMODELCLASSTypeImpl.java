/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FUNCTIONALMODELCLASSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.VCVRANGEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FUNCTIONALMODELCLASS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getCreatedView <em>Created View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getVCVRange <em>VCV Range</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getImportedPropertiesFromView <em>Imported Properties From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getImportedTypesFromView <em>Imported Types From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getImportedDocumentsFromView <em>Imported Documents From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getImportedCosntraintsFromView <em>Imported Cosntraints From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getImportedPropertiesFromModels <em>Imported Properties From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getImportedTypesFromModels <em>Imported Types From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getImportedDocumentsFromModels <em>Imported Documents From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FUNCTIONALMODELCLASSTypeImpl#getImportedConstraintsFromModels <em>Imported Constraints From Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FUNCTIONALMODELCLASSTypeImpl extends CLASSTypeImpl implements FUNCTIONALMODELCLASSType {
	/**
	 * The cached value of the '{@link #getCreatedView() <em>Created View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedView()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCEType createdView;

	/**
	 * The cached value of the '{@link #getVCVRange() <em>VCV Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVCVRange()
	 * @generated
	 * @ordered
	 */
	protected VCVRANGEType vCVRange;

	/**
	 * The cached value of the '{@link #getImportedPropertiesFromView() <em>Imported Properties From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPropertiesFromView()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType importedPropertiesFromView;

	/**
	 * The cached value of the '{@link #getImportedTypesFromView() <em>Imported Types From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypesFromView()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCEType importedTypesFromView;

	/**
	 * The cached value of the '{@link #getImportedDocumentsFromView() <em>Imported Documents From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDocumentsFromView()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCEType importedDocumentsFromView;

	/**
	 * The cached value of the '{@link #getImportedCosntraintsFromView() <em>Imported Cosntraints From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedCosntraintsFromView()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTSType importedCosntraintsFromView;

	/**
	 * The cached value of the '{@link #getCaseOf() <em>Case Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseOf()
	 * @generated
	 * @ordered
	 */
	protected CLASSESREFERENCEType caseOf;

	/**
	 * The cached value of the '{@link #getImportedPropertiesFromModels() <em>Imported Properties From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPropertiesFromModels()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType importedPropertiesFromModels;

	/**
	 * The cached value of the '{@link #getImportedTypesFromModels() <em>Imported Types From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypesFromModels()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCEType importedTypesFromModels;

	/**
	 * The cached value of the '{@link #getImportedDocumentsFromModels() <em>Imported Documents From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDocumentsFromModels()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCEType importedDocumentsFromModels;

	/**
	 * The cached value of the '{@link #getImportedConstraintsFromModels() <em>Imported Constraints From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedConstraintsFromModels()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTSType importedConstraintsFromModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FUNCTIONALMODELCLASSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getFUNCTIONALMODELCLASSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType getCreatedView() {
		return createdView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatedView(CLASSREFERENCEType newCreatedView, NotificationChain msgs) {
		CLASSREFERENCEType oldCreatedView = createdView;
		createdView = newCreatedView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW, oldCreatedView, newCreatedView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedView(CLASSREFERENCEType newCreatedView) {
		if (newCreatedView != createdView) {
			NotificationChain msgs = null;
			if (createdView != null)
				msgs = ((InternalEObject)createdView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW, null, msgs);
			if (newCreatedView != null)
				msgs = ((InternalEObject)newCreatedView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW, null, msgs);
			msgs = basicSetCreatedView(newCreatedView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW, newCreatedView, newCreatedView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCVRANGEType getVCVRange() {
		return vCVRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVCVRange(VCVRANGEType newVCVRange, NotificationChain msgs) {
		VCVRANGEType oldVCVRange = vCVRange;
		vCVRange = newVCVRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__VCV_RANGE, oldVCVRange, newVCVRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVCVRange(VCVRANGEType newVCVRange) {
		if (newVCVRange != vCVRange) {
			NotificationChain msgs = null;
			if (vCVRange != null)
				msgs = ((InternalEObject)vCVRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__VCV_RANGE, null, msgs);
			if (newVCVRange != null)
				msgs = ((InternalEObject)newVCVRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__VCV_RANGE, null, msgs);
			msgs = basicSetVCVRange(newVCVRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__VCV_RANGE, newVCVRange, newVCVRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getImportedPropertiesFromView() {
		return importedPropertiesFromView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedPropertiesFromView(PROPERTIESREFERENCEType newImportedPropertiesFromView, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldImportedPropertiesFromView = importedPropertiesFromView;
		importedPropertiesFromView = newImportedPropertiesFromView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW, oldImportedPropertiesFromView, newImportedPropertiesFromView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPropertiesFromView(PROPERTIESREFERENCEType newImportedPropertiesFromView) {
		if (newImportedPropertiesFromView != importedPropertiesFromView) {
			NotificationChain msgs = null;
			if (importedPropertiesFromView != null)
				msgs = ((InternalEObject)importedPropertiesFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW, null, msgs);
			if (newImportedPropertiesFromView != null)
				msgs = ((InternalEObject)newImportedPropertiesFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW, null, msgs);
			msgs = basicSetImportedPropertiesFromView(newImportedPropertiesFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW, newImportedPropertiesFromView, newImportedPropertiesFromView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCEType getImportedTypesFromView() {
		return importedTypesFromView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedTypesFromView(DATATYPESREFERENCEType newImportedTypesFromView, NotificationChain msgs) {
		DATATYPESREFERENCEType oldImportedTypesFromView = importedTypesFromView;
		importedTypesFromView = newImportedTypesFromView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW, oldImportedTypesFromView, newImportedTypesFromView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedTypesFromView(DATATYPESREFERENCEType newImportedTypesFromView) {
		if (newImportedTypesFromView != importedTypesFromView) {
			NotificationChain msgs = null;
			if (importedTypesFromView != null)
				msgs = ((InternalEObject)importedTypesFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW, null, msgs);
			if (newImportedTypesFromView != null)
				msgs = ((InternalEObject)newImportedTypesFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW, null, msgs);
			msgs = basicSetImportedTypesFromView(newImportedTypesFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW, newImportedTypesFromView, newImportedTypesFromView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCEType getImportedDocumentsFromView() {
		return importedDocumentsFromView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedDocumentsFromView(DOCUMENTSREFERENCEType newImportedDocumentsFromView, NotificationChain msgs) {
		DOCUMENTSREFERENCEType oldImportedDocumentsFromView = importedDocumentsFromView;
		importedDocumentsFromView = newImportedDocumentsFromView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW, oldImportedDocumentsFromView, newImportedDocumentsFromView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedDocumentsFromView(DOCUMENTSREFERENCEType newImportedDocumentsFromView) {
		if (newImportedDocumentsFromView != importedDocumentsFromView) {
			NotificationChain msgs = null;
			if (importedDocumentsFromView != null)
				msgs = ((InternalEObject)importedDocumentsFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW, null, msgs);
			if (newImportedDocumentsFromView != null)
				msgs = ((InternalEObject)newImportedDocumentsFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW, null, msgs);
			msgs = basicSetImportedDocumentsFromView(newImportedDocumentsFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW, newImportedDocumentsFromView, newImportedDocumentsFromView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTSType getImportedCosntraintsFromView() {
		return importedCosntraintsFromView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedCosntraintsFromView(CONSTRAINTSType newImportedCosntraintsFromView, NotificationChain msgs) {
		CONSTRAINTSType oldImportedCosntraintsFromView = importedCosntraintsFromView;
		importedCosntraintsFromView = newImportedCosntraintsFromView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW, oldImportedCosntraintsFromView, newImportedCosntraintsFromView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedCosntraintsFromView(CONSTRAINTSType newImportedCosntraintsFromView) {
		if (newImportedCosntraintsFromView != importedCosntraintsFromView) {
			NotificationChain msgs = null;
			if (importedCosntraintsFromView != null)
				msgs = ((InternalEObject)importedCosntraintsFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW, null, msgs);
			if (newImportedCosntraintsFromView != null)
				msgs = ((InternalEObject)newImportedCosntraintsFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW, null, msgs);
			msgs = basicSetImportedCosntraintsFromView(newImportedCosntraintsFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW, newImportedCosntraintsFromView, newImportedCosntraintsFromView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCEType getCaseOf() {
		return caseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseOf(CLASSESREFERENCEType newCaseOf, NotificationChain msgs) {
		CLASSESREFERENCEType oldCaseOf = caseOf;
		caseOf = newCaseOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CASE_OF, oldCaseOf, newCaseOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseOf(CLASSESREFERENCEType newCaseOf) {
		if (newCaseOf != caseOf) {
			NotificationChain msgs = null;
			if (caseOf != null)
				msgs = ((InternalEObject)caseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CASE_OF, null, msgs);
			if (newCaseOf != null)
				msgs = ((InternalEObject)newCaseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CASE_OF, null, msgs);
			msgs = basicSetCaseOf(newCaseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CASE_OF, newCaseOf, newCaseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getImportedPropertiesFromModels() {
		return importedPropertiesFromModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedPropertiesFromModels(PROPERTIESREFERENCEType newImportedPropertiesFromModels, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldImportedPropertiesFromModels = importedPropertiesFromModels;
		importedPropertiesFromModels = newImportedPropertiesFromModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS, oldImportedPropertiesFromModels, newImportedPropertiesFromModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPropertiesFromModels(PROPERTIESREFERENCEType newImportedPropertiesFromModels) {
		if (newImportedPropertiesFromModels != importedPropertiesFromModels) {
			NotificationChain msgs = null;
			if (importedPropertiesFromModels != null)
				msgs = ((InternalEObject)importedPropertiesFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS, null, msgs);
			if (newImportedPropertiesFromModels != null)
				msgs = ((InternalEObject)newImportedPropertiesFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS, null, msgs);
			msgs = basicSetImportedPropertiesFromModels(newImportedPropertiesFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS, newImportedPropertiesFromModels, newImportedPropertiesFromModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCEType getImportedTypesFromModels() {
		return importedTypesFromModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedTypesFromModels(DATATYPESREFERENCEType newImportedTypesFromModels, NotificationChain msgs) {
		DATATYPESREFERENCEType oldImportedTypesFromModels = importedTypesFromModels;
		importedTypesFromModels = newImportedTypesFromModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS, oldImportedTypesFromModels, newImportedTypesFromModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedTypesFromModels(DATATYPESREFERENCEType newImportedTypesFromModels) {
		if (newImportedTypesFromModels != importedTypesFromModels) {
			NotificationChain msgs = null;
			if (importedTypesFromModels != null)
				msgs = ((InternalEObject)importedTypesFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS, null, msgs);
			if (newImportedTypesFromModels != null)
				msgs = ((InternalEObject)newImportedTypesFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS, null, msgs);
			msgs = basicSetImportedTypesFromModels(newImportedTypesFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS, newImportedTypesFromModels, newImportedTypesFromModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCEType getImportedDocumentsFromModels() {
		return importedDocumentsFromModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedDocumentsFromModels(DOCUMENTSREFERENCEType newImportedDocumentsFromModels, NotificationChain msgs) {
		DOCUMENTSREFERENCEType oldImportedDocumentsFromModels = importedDocumentsFromModels;
		importedDocumentsFromModels = newImportedDocumentsFromModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS, oldImportedDocumentsFromModels, newImportedDocumentsFromModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedDocumentsFromModels(DOCUMENTSREFERENCEType newImportedDocumentsFromModels) {
		if (newImportedDocumentsFromModels != importedDocumentsFromModels) {
			NotificationChain msgs = null;
			if (importedDocumentsFromModels != null)
				msgs = ((InternalEObject)importedDocumentsFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS, null, msgs);
			if (newImportedDocumentsFromModels != null)
				msgs = ((InternalEObject)newImportedDocumentsFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS, null, msgs);
			msgs = basicSetImportedDocumentsFromModels(newImportedDocumentsFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS, newImportedDocumentsFromModels, newImportedDocumentsFromModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTSType getImportedConstraintsFromModels() {
		return importedConstraintsFromModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedConstraintsFromModels(CONSTRAINTSType newImportedConstraintsFromModels, NotificationChain msgs) {
		CONSTRAINTSType oldImportedConstraintsFromModels = importedConstraintsFromModels;
		importedConstraintsFromModels = newImportedConstraintsFromModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS, oldImportedConstraintsFromModels, newImportedConstraintsFromModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedConstraintsFromModels(CONSTRAINTSType newImportedConstraintsFromModels) {
		if (newImportedConstraintsFromModels != importedConstraintsFromModels) {
			NotificationChain msgs = null;
			if (importedConstraintsFromModels != null)
				msgs = ((InternalEObject)importedConstraintsFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS, null, msgs);
			if (newImportedConstraintsFromModels != null)
				msgs = ((InternalEObject)newImportedConstraintsFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS, null, msgs);
			msgs = basicSetImportedConstraintsFromModels(newImportedConstraintsFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS, newImportedConstraintsFromModels, newImportedConstraintsFromModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW:
				return basicSetCreatedView(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__VCV_RANGE:
				return basicSetVCVRange(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				return basicSetImportedPropertiesFromView(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW:
				return basicSetImportedTypesFromView(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				return basicSetImportedDocumentsFromView(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW:
				return basicSetImportedCosntraintsFromView(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CASE_OF:
				return basicSetCaseOf(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				return basicSetImportedPropertiesFromModels(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS:
				return basicSetImportedTypesFromModels(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				return basicSetImportedDocumentsFromModels(null, msgs);
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				return basicSetImportedConstraintsFromModels(null, msgs);
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
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW:
				return getCreatedView();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__VCV_RANGE:
				return getVCVRange();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				return getImportedPropertiesFromView();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW:
				return getImportedTypesFromView();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				return getImportedDocumentsFromView();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW:
				return getImportedCosntraintsFromView();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CASE_OF:
				return getCaseOf();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				return getImportedPropertiesFromModels();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS:
				return getImportedTypesFromModels();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				return getImportedDocumentsFromModels();
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				return getImportedConstraintsFromModels();
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
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW:
				setCreatedView((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__VCV_RANGE:
				setVCVRange((VCVRANGEType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				setImportedPropertiesFromView((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW:
				setImportedTypesFromView((DATATYPESREFERENCEType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				setImportedDocumentsFromView((DOCUMENTSREFERENCEType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW:
				setImportedCosntraintsFromView((CONSTRAINTSType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CASE_OF:
				setCaseOf((CLASSESREFERENCEType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				setImportedPropertiesFromModels((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS:
				setImportedTypesFromModels((DATATYPESREFERENCEType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				setImportedDocumentsFromModels((DOCUMENTSREFERENCEType)newValue);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				setImportedConstraintsFromModels((CONSTRAINTSType)newValue);
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
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW:
				setCreatedView((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__VCV_RANGE:
				setVCVRange((VCVRANGEType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				setImportedPropertiesFromView((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW:
				setImportedTypesFromView((DATATYPESREFERENCEType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				setImportedDocumentsFromView((DOCUMENTSREFERENCEType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW:
				setImportedCosntraintsFromView((CONSTRAINTSType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CASE_OF:
				setCaseOf((CLASSESREFERENCEType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				setImportedPropertiesFromModels((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS:
				setImportedTypesFromModels((DATATYPESREFERENCEType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				setImportedDocumentsFromModels((DOCUMENTSREFERENCEType)null);
				return;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				setImportedConstraintsFromModels((CONSTRAINTSType)null);
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
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CREATED_VIEW:
				return createdView != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__VCV_RANGE:
				return vCVRange != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				return importedPropertiesFromView != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_VIEW:
				return importedTypesFromView != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				return importedDocumentsFromView != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_COSNTRAINTS_FROM_VIEW:
				return importedCosntraintsFromView != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__CASE_OF:
				return caseOf != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				return importedPropertiesFromModels != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_TYPES_FROM_MODELS:
				return importedTypesFromModels != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				return importedDocumentsFromModels != null;
			case OntomlPackage.FUNCTIONALMODELCLASS_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				return importedConstraintsFromModels != null;
		}
		return super.eIsSet(featureID);
	}

} //FUNCTIONALMODELCLASSTypeImpl
