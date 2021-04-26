/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CLASSESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.CONSTRAINTSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DATATYPESREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.DOCUMENTSREFERENCEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITEMCLASSCASEOFType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.PROPERTIESREFERENCEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ITEMCLASSCASEOF Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl#getSimplifiedDrawing <em>Simplified Drawing</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl#getCodedName <em>Coded Name</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl#isInstanceSharable <em>Instance Sharable</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl#getIsCaseOf <em>Is Case Of</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl#getImportedProperties <em>Imported Properties</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl#getImportedTypes <em>Imported Types</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl#getImportedDocuments <em>Imported Documents</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ITEMCLASSCASEOFTypeImpl#getImportedConstraints <em>Imported Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ITEMCLASSCASEOFTypeImpl extends CLASSTypeImpl implements ITEMCLASSCASEOFType {
	/**
	 * The cached value of the '{@link #getSimplifiedDrawing() <em>Simplified Drawing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplifiedDrawing()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICSType simplifiedDrawing;

	/**
	 * The default value of the '{@link #getCodedName() <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodedName() <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedName()
	 * @generated
	 * @ordered
	 */
	protected String codedName = CODED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isInstanceSharable() <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstanceSharable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANCE_SHARABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstanceSharable() <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstanceSharable()
	 * @generated
	 * @ordered
	 */
	protected boolean instanceSharable = INSTANCE_SHARABLE_EDEFAULT;

	/**
	 * This is true if the Instance Sharable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instanceSharableESet;

	/**
	 * The cached value of the '{@link #getIsCaseOf() <em>Is Case Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCaseOf()
	 * @generated
	 * @ordered
	 */
	protected CLASSESREFERENCEType isCaseOf;

	/**
	 * The cached value of the '{@link #getImportedProperties() <em>Imported Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedProperties()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCEType importedProperties;

	/**
	 * The cached value of the '{@link #getImportedTypes() <em>Imported Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypes()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCEType importedTypes;

	/**
	 * The cached value of the '{@link #getImportedDocuments() <em>Imported Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDocuments()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCEType importedDocuments;

	/**
	 * The cached value of the '{@link #getImportedConstraints() <em>Imported Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedConstraints()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTSType importedConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITEMCLASSCASEOFTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getITEMCLASSCASEOFType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICSType getSimplifiedDrawing() {
		return simplifiedDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimplifiedDrawing(GRAPHICSType newSimplifiedDrawing, NotificationChain msgs) {
		GRAPHICSType oldSimplifiedDrawing = simplifiedDrawing;
		simplifiedDrawing = newSimplifiedDrawing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING, oldSimplifiedDrawing, newSimplifiedDrawing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimplifiedDrawing(GRAPHICSType newSimplifiedDrawing) {
		if (newSimplifiedDrawing != simplifiedDrawing) {
			NotificationChain msgs = null;
			if (simplifiedDrawing != null)
				msgs = ((InternalEObject)simplifiedDrawing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING, null, msgs);
			if (newSimplifiedDrawing != null)
				msgs = ((InternalEObject)newSimplifiedDrawing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING, null, msgs);
			msgs = basicSetSimplifiedDrawing(newSimplifiedDrawing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING, newSimplifiedDrawing, newSimplifiedDrawing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodedName() {
		return codedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodedName(String newCodedName) {
		String oldCodedName = codedName;
		codedName = newCodedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__CODED_NAME, oldCodedName, codedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstanceSharable() {
		return instanceSharable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceSharable(boolean newInstanceSharable) {
		boolean oldInstanceSharable = instanceSharable;
		instanceSharable = newInstanceSharable;
		boolean oldInstanceSharableESet = instanceSharableESet;
		instanceSharableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__INSTANCE_SHARABLE, oldInstanceSharable, instanceSharable, !oldInstanceSharableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstanceSharable() {
		boolean oldInstanceSharable = instanceSharable;
		boolean oldInstanceSharableESet = instanceSharableESet;
		instanceSharable = INSTANCE_SHARABLE_EDEFAULT;
		instanceSharableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.ITEMCLASSCASEOF_TYPE__INSTANCE_SHARABLE, oldInstanceSharable, INSTANCE_SHARABLE_EDEFAULT, oldInstanceSharableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstanceSharable() {
		return instanceSharableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCEType getIsCaseOf() {
		return isCaseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsCaseOf(CLASSESREFERENCEType newIsCaseOf, NotificationChain msgs) {
		CLASSESREFERENCEType oldIsCaseOf = isCaseOf;
		isCaseOf = newIsCaseOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IS_CASE_OF, oldIsCaseOf, newIsCaseOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCaseOf(CLASSESREFERENCEType newIsCaseOf) {
		if (newIsCaseOf != isCaseOf) {
			NotificationChain msgs = null;
			if (isCaseOf != null)
				msgs = ((InternalEObject)isCaseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IS_CASE_OF, null, msgs);
			if (newIsCaseOf != null)
				msgs = ((InternalEObject)newIsCaseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IS_CASE_OF, null, msgs);
			msgs = basicSetIsCaseOf(newIsCaseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IS_CASE_OF, newIsCaseOf, newIsCaseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCEType getImportedProperties() {
		return importedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedProperties(PROPERTIESREFERENCEType newImportedProperties, NotificationChain msgs) {
		PROPERTIESREFERENCEType oldImportedProperties = importedProperties;
		importedProperties = newImportedProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES, oldImportedProperties, newImportedProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedProperties(PROPERTIESREFERENCEType newImportedProperties) {
		if (newImportedProperties != importedProperties) {
			NotificationChain msgs = null;
			if (importedProperties != null)
				msgs = ((InternalEObject)importedProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES, null, msgs);
			if (newImportedProperties != null)
				msgs = ((InternalEObject)newImportedProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES, null, msgs);
			msgs = basicSetImportedProperties(newImportedProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES, newImportedProperties, newImportedProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCEType getImportedTypes() {
		return importedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedTypes(DATATYPESREFERENCEType newImportedTypes, NotificationChain msgs) {
		DATATYPESREFERENCEType oldImportedTypes = importedTypes;
		importedTypes = newImportedTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES, oldImportedTypes, newImportedTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedTypes(DATATYPESREFERENCEType newImportedTypes) {
		if (newImportedTypes != importedTypes) {
			NotificationChain msgs = null;
			if (importedTypes != null)
				msgs = ((InternalEObject)importedTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES, null, msgs);
			if (newImportedTypes != null)
				msgs = ((InternalEObject)newImportedTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES, null, msgs);
			msgs = basicSetImportedTypes(newImportedTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES, newImportedTypes, newImportedTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCEType getImportedDocuments() {
		return importedDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedDocuments(DOCUMENTSREFERENCEType newImportedDocuments, NotificationChain msgs) {
		DOCUMENTSREFERENCEType oldImportedDocuments = importedDocuments;
		importedDocuments = newImportedDocuments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS, oldImportedDocuments, newImportedDocuments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedDocuments(DOCUMENTSREFERENCEType newImportedDocuments) {
		if (newImportedDocuments != importedDocuments) {
			NotificationChain msgs = null;
			if (importedDocuments != null)
				msgs = ((InternalEObject)importedDocuments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS, null, msgs);
			if (newImportedDocuments != null)
				msgs = ((InternalEObject)newImportedDocuments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS, null, msgs);
			msgs = basicSetImportedDocuments(newImportedDocuments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS, newImportedDocuments, newImportedDocuments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTSType getImportedConstraints() {
		return importedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedConstraints(CONSTRAINTSType newImportedConstraints, NotificationChain msgs) {
		CONSTRAINTSType oldImportedConstraints = importedConstraints;
		importedConstraints = newImportedConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS, oldImportedConstraints, newImportedConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedConstraints(CONSTRAINTSType newImportedConstraints) {
		if (newImportedConstraints != importedConstraints) {
			NotificationChain msgs = null;
			if (importedConstraints != null)
				msgs = ((InternalEObject)importedConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS, null, msgs);
			if (newImportedConstraints != null)
				msgs = ((InternalEObject)newImportedConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS, null, msgs);
			msgs = basicSetImportedConstraints(newImportedConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS, newImportedConstraints, newImportedConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING:
				return basicSetSimplifiedDrawing(null, msgs);
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IS_CASE_OF:
				return basicSetIsCaseOf(null, msgs);
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES:
				return basicSetImportedProperties(null, msgs);
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES:
				return basicSetImportedTypes(null, msgs);
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS:
				return basicSetImportedDocuments(null, msgs);
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS:
				return basicSetImportedConstraints(null, msgs);
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
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING:
				return getSimplifiedDrawing();
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__CODED_NAME:
				return getCodedName();
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__INSTANCE_SHARABLE:
				return isInstanceSharable();
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IS_CASE_OF:
				return getIsCaseOf();
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES:
				return getImportedProperties();
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES:
				return getImportedTypes();
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS:
				return getImportedDocuments();
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS:
				return getImportedConstraints();
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
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING:
				setSimplifiedDrawing((GRAPHICSType)newValue);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__CODED_NAME:
				setCodedName((String)newValue);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__INSTANCE_SHARABLE:
				setInstanceSharable((Boolean)newValue);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IS_CASE_OF:
				setIsCaseOf((CLASSESREFERENCEType)newValue);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES:
				setImportedProperties((PROPERTIESREFERENCEType)newValue);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES:
				setImportedTypes((DATATYPESREFERENCEType)newValue);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS:
				setImportedDocuments((DOCUMENTSREFERENCEType)newValue);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS:
				setImportedConstraints((CONSTRAINTSType)newValue);
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
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING:
				setSimplifiedDrawing((GRAPHICSType)null);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__CODED_NAME:
				setCodedName(CODED_NAME_EDEFAULT);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__INSTANCE_SHARABLE:
				unsetInstanceSharable();
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IS_CASE_OF:
				setIsCaseOf((CLASSESREFERENCEType)null);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES:
				setImportedProperties((PROPERTIESREFERENCEType)null);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES:
				setImportedTypes((DATATYPESREFERENCEType)null);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS:
				setImportedDocuments((DOCUMENTSREFERENCEType)null);
				return;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS:
				setImportedConstraints((CONSTRAINTSType)null);
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
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__SIMPLIFIED_DRAWING:
				return simplifiedDrawing != null;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__CODED_NAME:
				return CODED_NAME_EDEFAULT == null ? codedName != null : !CODED_NAME_EDEFAULT.equals(codedName);
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__INSTANCE_SHARABLE:
				return isSetInstanceSharable();
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IS_CASE_OF:
				return isCaseOf != null;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_PROPERTIES:
				return importedProperties != null;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_TYPES:
				return importedTypes != null;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_DOCUMENTS:
				return importedDocuments != null;
			case OntomlPackage.ITEMCLASSCASEOF_TYPE__IMPORTED_CONSTRAINTS:
				return importedConstraints != null;
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
		result.append(" (codedName: ");
		result.append(codedName);
		result.append(", instanceSharable: ");
		if (instanceSharableESet) result.append(instanceSharable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ITEMCLASSCASEOFTypeImpl
