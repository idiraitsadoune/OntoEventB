/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.FMCLASSVIEWOFType;
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
 * An implementation of the model object '<em><b>FMCLASSVIEWOF Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getCreatedView <em>Created View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getVCVRange <em>VCV Range</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedPropertiesFromView <em>Imported Properties From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedTypesFromView <em>Imported Types From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedDocumentsFromView <em>Imported Documents From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedConstraintsFromView <em>Imported Constraints From View</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedPropertiesFromModels <em>Imported Properties From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedTypesFromModels <em>Imported Types From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedDocumentsFromModels <em>Imported Documents From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedConstraintsFromModels <em>Imported Constraints From Models</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getViewOf <em>View Of</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedPropertiesFromItem <em>Imported Properties From Item</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedTypesFromItem <em>Imported Types From Item</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedDocumentsFromItem <em>Imported Documents From Item</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.FMCLASSVIEWOFTypeImpl#getImportedConstraintsFromItem <em>Imported Constraints From Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMCLASSVIEWOFTypeImpl extends CLASSTypeImpl implements FMCLASSVIEWOFType {
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
	 * The cached value of the '{@link #getImportedConstraintsFromView() <em>Imported Constraints From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedConstraintsFromView()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTSType importedConstraintsFromView;

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
	 * The cached value of the '{@link #getViewOf() <em>View Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewOf()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCEType viewOf;

	/**
	 * The cached value of the '{@link #getImportedPropertiesFromItem() <em>Imported Properties From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPropertiesFromItem()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType importedPropertiesFromItem;

	/**
	 * The cached value of the '{@link #getImportedTypesFromItem() <em>Imported Types From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypesFromItem()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCEType importedTypesFromItem;

	/**
	 * The cached value of the '{@link #getImportedDocumentsFromItem() <em>Imported Documents From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDocumentsFromItem()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCEType importedDocumentsFromItem;

	/**
	 * The cached value of the '{@link #getImportedConstraintsFromItem() <em>Imported Constraints From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedConstraintsFromItem()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTSType importedConstraintsFromItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMCLASSVIEWOFTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getFMCLASSVIEWOFType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__CREATED_VIEW, oldCreatedView, newCreatedView);
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
				msgs = ((InternalEObject)createdView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__CREATED_VIEW, null, msgs);
			if (newCreatedView != null)
				msgs = ((InternalEObject)newCreatedView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__CREATED_VIEW, null, msgs);
			msgs = basicSetCreatedView(newCreatedView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__CREATED_VIEW, newCreatedView, newCreatedView));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__VCV_RANGE, oldVCVRange, newVCVRange);
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
				msgs = ((InternalEObject)vCVRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__VCV_RANGE, null, msgs);
			if (newVCVRange != null)
				msgs = ((InternalEObject)newVCVRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__VCV_RANGE, null, msgs);
			msgs = basicSetVCVRange(newVCVRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__VCV_RANGE, newVCVRange, newVCVRange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW, oldImportedPropertiesFromView, newImportedPropertiesFromView);
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
				msgs = ((InternalEObject)importedPropertiesFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW, null, msgs);
			if (newImportedPropertiesFromView != null)
				msgs = ((InternalEObject)newImportedPropertiesFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW, null, msgs);
			msgs = basicSetImportedPropertiesFromView(newImportedPropertiesFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW, newImportedPropertiesFromView, newImportedPropertiesFromView));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW, oldImportedTypesFromView, newImportedTypesFromView);
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
				msgs = ((InternalEObject)importedTypesFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW, null, msgs);
			if (newImportedTypesFromView != null)
				msgs = ((InternalEObject)newImportedTypesFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW, null, msgs);
			msgs = basicSetImportedTypesFromView(newImportedTypesFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW, newImportedTypesFromView, newImportedTypesFromView));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW, oldImportedDocumentsFromView, newImportedDocumentsFromView);
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
				msgs = ((InternalEObject)importedDocumentsFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW, null, msgs);
			if (newImportedDocumentsFromView != null)
				msgs = ((InternalEObject)newImportedDocumentsFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW, null, msgs);
			msgs = basicSetImportedDocumentsFromView(newImportedDocumentsFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW, newImportedDocumentsFromView, newImportedDocumentsFromView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTSType getImportedConstraintsFromView() {
		return importedConstraintsFromView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedConstraintsFromView(CONSTRAINTSType newImportedConstraintsFromView, NotificationChain msgs) {
		CONSTRAINTSType oldImportedConstraintsFromView = importedConstraintsFromView;
		importedConstraintsFromView = newImportedConstraintsFromView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW, oldImportedConstraintsFromView, newImportedConstraintsFromView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedConstraintsFromView(CONSTRAINTSType newImportedConstraintsFromView) {
		if (newImportedConstraintsFromView != importedConstraintsFromView) {
			NotificationChain msgs = null;
			if (importedConstraintsFromView != null)
				msgs = ((InternalEObject)importedConstraintsFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW, null, msgs);
			if (newImportedConstraintsFromView != null)
				msgs = ((InternalEObject)newImportedConstraintsFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW, null, msgs);
			msgs = basicSetImportedConstraintsFromView(newImportedConstraintsFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW, newImportedConstraintsFromView, newImportedConstraintsFromView));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__CASE_OF, oldCaseOf, newCaseOf);
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
				msgs = ((InternalEObject)caseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__CASE_OF, null, msgs);
			if (newCaseOf != null)
				msgs = ((InternalEObject)newCaseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__CASE_OF, null, msgs);
			msgs = basicSetCaseOf(newCaseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__CASE_OF, newCaseOf, newCaseOf));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS, oldImportedPropertiesFromModels, newImportedPropertiesFromModels);
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
				msgs = ((InternalEObject)importedPropertiesFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS, null, msgs);
			if (newImportedPropertiesFromModels != null)
				msgs = ((InternalEObject)newImportedPropertiesFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS, null, msgs);
			msgs = basicSetImportedPropertiesFromModels(newImportedPropertiesFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS, newImportedPropertiesFromModels, newImportedPropertiesFromModels));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS, oldImportedTypesFromModels, newImportedTypesFromModels);
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
				msgs = ((InternalEObject)importedTypesFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS, null, msgs);
			if (newImportedTypesFromModels != null)
				msgs = ((InternalEObject)newImportedTypesFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS, null, msgs);
			msgs = basicSetImportedTypesFromModels(newImportedTypesFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS, newImportedTypesFromModels, newImportedTypesFromModels));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS, oldImportedDocumentsFromModels, newImportedDocumentsFromModels);
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
				msgs = ((InternalEObject)importedDocumentsFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS, null, msgs);
			if (newImportedDocumentsFromModels != null)
				msgs = ((InternalEObject)newImportedDocumentsFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS, null, msgs);
			msgs = basicSetImportedDocumentsFromModels(newImportedDocumentsFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS, newImportedDocumentsFromModels, newImportedDocumentsFromModels));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS, oldImportedConstraintsFromModels, newImportedConstraintsFromModels);
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
				msgs = ((InternalEObject)importedConstraintsFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS, null, msgs);
			if (newImportedConstraintsFromModels != null)
				msgs = ((InternalEObject)newImportedConstraintsFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS, null, msgs);
			msgs = basicSetImportedConstraintsFromModels(newImportedConstraintsFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS, newImportedConstraintsFromModels, newImportedConstraintsFromModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCEType getViewOf() {
		return viewOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewOf(CLASSREFERENCEType newViewOf, NotificationChain msgs) {
		CLASSREFERENCEType oldViewOf = viewOf;
		viewOf = newViewOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__VIEW_OF, oldViewOf, newViewOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewOf(CLASSREFERENCEType newViewOf) {
		if (newViewOf != viewOf) {
			NotificationChain msgs = null;
			if (viewOf != null)
				msgs = ((InternalEObject)viewOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__VIEW_OF, null, msgs);
			if (newViewOf != null)
				msgs = ((InternalEObject)newViewOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__VIEW_OF, null, msgs);
			msgs = basicSetViewOf(newViewOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__VIEW_OF, newViewOf, newViewOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getImportedPropertiesFromItem() {
		return importedPropertiesFromItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedPropertiesFromItem(PROPERTIESREFERENCEType newImportedPropertiesFromItem, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldImportedPropertiesFromItem = importedPropertiesFromItem;
		importedPropertiesFromItem = newImportedPropertiesFromItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM, oldImportedPropertiesFromItem, newImportedPropertiesFromItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPropertiesFromItem(PROPERTIESREFERENCEType newImportedPropertiesFromItem) {
		if (newImportedPropertiesFromItem != importedPropertiesFromItem) {
			NotificationChain msgs = null;
			if (importedPropertiesFromItem != null)
				msgs = ((InternalEObject)importedPropertiesFromItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM, null, msgs);
			if (newImportedPropertiesFromItem != null)
				msgs = ((InternalEObject)newImportedPropertiesFromItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM, null, msgs);
			msgs = basicSetImportedPropertiesFromItem(newImportedPropertiesFromItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM, newImportedPropertiesFromItem, newImportedPropertiesFromItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCEType getImportedTypesFromItem() {
		return importedTypesFromItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedTypesFromItem(DATATYPESREFERENCEType newImportedTypesFromItem, NotificationChain msgs) {
		DATATYPESREFERENCEType oldImportedTypesFromItem = importedTypesFromItem;
		importedTypesFromItem = newImportedTypesFromItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM, oldImportedTypesFromItem, newImportedTypesFromItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedTypesFromItem(DATATYPESREFERENCEType newImportedTypesFromItem) {
		if (newImportedTypesFromItem != importedTypesFromItem) {
			NotificationChain msgs = null;
			if (importedTypesFromItem != null)
				msgs = ((InternalEObject)importedTypesFromItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM, null, msgs);
			if (newImportedTypesFromItem != null)
				msgs = ((InternalEObject)newImportedTypesFromItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM, null, msgs);
			msgs = basicSetImportedTypesFromItem(newImportedTypesFromItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM, newImportedTypesFromItem, newImportedTypesFromItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCEType getImportedDocumentsFromItem() {
		return importedDocumentsFromItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedDocumentsFromItem(DOCUMENTSREFERENCEType newImportedDocumentsFromItem, NotificationChain msgs) {
		DOCUMENTSREFERENCEType oldImportedDocumentsFromItem = importedDocumentsFromItem;
		importedDocumentsFromItem = newImportedDocumentsFromItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM, oldImportedDocumentsFromItem, newImportedDocumentsFromItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedDocumentsFromItem(DOCUMENTSREFERENCEType newImportedDocumentsFromItem) {
		if (newImportedDocumentsFromItem != importedDocumentsFromItem) {
			NotificationChain msgs = null;
			if (importedDocumentsFromItem != null)
				msgs = ((InternalEObject)importedDocumentsFromItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM, null, msgs);
			if (newImportedDocumentsFromItem != null)
				msgs = ((InternalEObject)newImportedDocumentsFromItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM, null, msgs);
			msgs = basicSetImportedDocumentsFromItem(newImportedDocumentsFromItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM, newImportedDocumentsFromItem, newImportedDocumentsFromItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTSType getImportedConstraintsFromItem() {
		return importedConstraintsFromItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedConstraintsFromItem(CONSTRAINTSType newImportedConstraintsFromItem, NotificationChain msgs) {
		CONSTRAINTSType oldImportedConstraintsFromItem = importedConstraintsFromItem;
		importedConstraintsFromItem = newImportedConstraintsFromItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM, oldImportedConstraintsFromItem, newImportedConstraintsFromItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedConstraintsFromItem(CONSTRAINTSType newImportedConstraintsFromItem) {
		if (newImportedConstraintsFromItem != importedConstraintsFromItem) {
			NotificationChain msgs = null;
			if (importedConstraintsFromItem != null)
				msgs = ((InternalEObject)importedConstraintsFromItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM, null, msgs);
			if (newImportedConstraintsFromItem != null)
				msgs = ((InternalEObject)newImportedConstraintsFromItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM, null, msgs);
			msgs = basicSetImportedConstraintsFromItem(newImportedConstraintsFromItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM, newImportedConstraintsFromItem, newImportedConstraintsFromItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CREATED_VIEW:
				return basicSetCreatedView(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VCV_RANGE:
				return basicSetVCVRange(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				return basicSetImportedPropertiesFromView(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW:
				return basicSetImportedTypesFromView(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				return basicSetImportedDocumentsFromView(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW:
				return basicSetImportedConstraintsFromView(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CASE_OF:
				return basicSetCaseOf(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				return basicSetImportedPropertiesFromModels(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS:
				return basicSetImportedTypesFromModels(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				return basicSetImportedDocumentsFromModels(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				return basicSetImportedConstraintsFromModels(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VIEW_OF:
				return basicSetViewOf(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM:
				return basicSetImportedPropertiesFromItem(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM:
				return basicSetImportedTypesFromItem(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM:
				return basicSetImportedDocumentsFromItem(null, msgs);
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM:
				return basicSetImportedConstraintsFromItem(null, msgs);
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
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CREATED_VIEW:
				return getCreatedView();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VCV_RANGE:
				return getVCVRange();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				return getImportedPropertiesFromView();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW:
				return getImportedTypesFromView();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				return getImportedDocumentsFromView();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW:
				return getImportedConstraintsFromView();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CASE_OF:
				return getCaseOf();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				return getImportedPropertiesFromModels();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS:
				return getImportedTypesFromModels();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				return getImportedDocumentsFromModels();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				return getImportedConstraintsFromModels();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VIEW_OF:
				return getViewOf();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM:
				return getImportedPropertiesFromItem();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM:
				return getImportedTypesFromItem();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM:
				return getImportedDocumentsFromItem();
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM:
				return getImportedConstraintsFromItem();
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
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CREATED_VIEW:
				setCreatedView((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VCV_RANGE:
				setVCVRange((VCVRANGEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				setImportedPropertiesFromView((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW:
				setImportedTypesFromView((DATATYPESREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				setImportedDocumentsFromView((DOCUMENTSREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW:
				setImportedConstraintsFromView((CONSTRAINTSType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CASE_OF:
				setCaseOf((CLASSESREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				setImportedPropertiesFromModels((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS:
				setImportedTypesFromModels((DATATYPESREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				setImportedDocumentsFromModels((DOCUMENTSREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				setImportedConstraintsFromModels((CONSTRAINTSType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VIEW_OF:
				setViewOf((CLASSREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM:
				setImportedPropertiesFromItem((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM:
				setImportedTypesFromItem((DATATYPESREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM:
				setImportedDocumentsFromItem((DOCUMENTSREFERENCEType)newValue);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM:
				setImportedConstraintsFromItem((CONSTRAINTSType)newValue);
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
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CREATED_VIEW:
				setCreatedView((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VCV_RANGE:
				setVCVRange((VCVRANGEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				setImportedPropertiesFromView((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW:
				setImportedTypesFromView((DATATYPESREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				setImportedDocumentsFromView((DOCUMENTSREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW:
				setImportedConstraintsFromView((CONSTRAINTSType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CASE_OF:
				setCaseOf((CLASSESREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				setImportedPropertiesFromModels((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS:
				setImportedTypesFromModels((DATATYPESREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				setImportedDocumentsFromModels((DOCUMENTSREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				setImportedConstraintsFromModels((CONSTRAINTSType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VIEW_OF:
				setViewOf((CLASSREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM:
				setImportedPropertiesFromItem((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM:
				setImportedTypesFromItem((DATATYPESREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM:
				setImportedDocumentsFromItem((DOCUMENTSREFERENCEType)null);
				return;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM:
				setImportedConstraintsFromItem((CONSTRAINTSType)null);
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
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CREATED_VIEW:
				return createdView != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VCV_RANGE:
				return vCVRange != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_VIEW:
				return importedPropertiesFromView != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_VIEW:
				return importedTypesFromView != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_VIEW:
				return importedDocumentsFromView != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_VIEW:
				return importedConstraintsFromView != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__CASE_OF:
				return caseOf != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_MODELS:
				return importedPropertiesFromModels != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_MODELS:
				return importedTypesFromModels != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_MODELS:
				return importedDocumentsFromModels != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_MODELS:
				return importedConstraintsFromModels != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__VIEW_OF:
				return viewOf != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_PROPERTIES_FROM_ITEM:
				return importedPropertiesFromItem != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_TYPES_FROM_ITEM:
				return importedTypesFromItem != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_DOCUMENTS_FROM_ITEM:
				return importedDocumentsFromItem != null;
			case OntomlPackage.FMCLASSVIEWOF_TYPE__IMPORTED_CONSTRAINTS_FROM_ITEM:
				return importedConstraintsFromItem != null;
		}
		return super.eIsSet(featureID);
	}

} //FMCLASSVIEWOFTypeImpl
