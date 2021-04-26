/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.GRAPHICSType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ITSVALUESType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.NONQUANTITATIVEINTTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.SOURCEDOCUMENTType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.TEXTType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NONQUANTITATIVEINTTYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONQUANTITATIVEINTTYPETypeImpl#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONQUANTITATIVEINTTYPETypeImpl#getItsValues <em>Its Values</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONQUANTITATIVEINTTYPETypeImpl#getSourceDocOfValueDomain <em>Source Doc Of Value Domain</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONQUANTITATIVEINTTYPETypeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.NONQUANTITATIVEINTTYPETypeImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NONQUANTITATIVEINTTYPETypeImpl extends ANYTYPETypeImpl implements NONQUANTITATIVEINTTYPEType {
	/**
	 * The default value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected String valueFormat = VALUE_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItsValues() <em>Its Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsValues()
	 * @generated
	 * @ordered
	 */
	protected ITSVALUESType itsValues;

	/**
	 * The cached value of the '{@link #getSourceDocOfValueDomain() <em>Source Doc Of Value Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocOfValueDomain()
	 * @generated
	 * @ordered
	 */
	protected SOURCEDOCUMENTType sourceDocOfValueDomain;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected TEXTType definition;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICSType icon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NONQUANTITATIVEINTTYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getNONQUANTITATIVEINTTYPEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueFormat(String newValueFormat) {
		String oldValueFormat = valueFormat;
		valueFormat = newValueFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__VALUE_FORMAT, oldValueFormat, valueFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITSVALUESType getItsValues() {
		return itsValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsValues(ITSVALUESType newItsValues, NotificationChain msgs) {
		ITSVALUESType oldItsValues = itsValues;
		itsValues = newItsValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES, oldItsValues, newItsValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsValues(ITSVALUESType newItsValues) {
		if (newItsValues != itsValues) {
			NotificationChain msgs = null;
			if (itsValues != null)
				msgs = ((InternalEObject)itsValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES, null, msgs);
			if (newItsValues != null)
				msgs = ((InternalEObject)newItsValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES, null, msgs);
			msgs = basicSetItsValues(newItsValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES, newItsValues, newItsValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOURCEDOCUMENTType getSourceDocOfValueDomain() {
		return sourceDocOfValueDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDocOfValueDomain(SOURCEDOCUMENTType newSourceDocOfValueDomain, NotificationChain msgs) {
		SOURCEDOCUMENTType oldSourceDocOfValueDomain = sourceDocOfValueDomain;
		sourceDocOfValueDomain = newSourceDocOfValueDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN, oldSourceDocOfValueDomain, newSourceDocOfValueDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocOfValueDomain(SOURCEDOCUMENTType newSourceDocOfValueDomain) {
		if (newSourceDocOfValueDomain != sourceDocOfValueDomain) {
			NotificationChain msgs = null;
			if (sourceDocOfValueDomain != null)
				msgs = ((InternalEObject)sourceDocOfValueDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN, null, msgs);
			if (newSourceDocOfValueDomain != null)
				msgs = ((InternalEObject)newSourceDocOfValueDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN, null, msgs);
			msgs = basicSetSourceDocOfValueDomain(newSourceDocOfValueDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN, newSourceDocOfValueDomain, newSourceDocOfValueDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTType getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(TEXTType newDefinition, NotificationChain msgs) {
		TEXTType oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(TEXTType newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICSType getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(GRAPHICSType newIcon, NotificationChain msgs) {
		GRAPHICSType oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(GRAPHICSType newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES:
				return basicSetItsValues(null, msgs);
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				return basicSetSourceDocOfValueDomain(null, msgs);
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ICON:
				return basicSetIcon(null, msgs);
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
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__VALUE_FORMAT:
				return getValueFormat();
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES:
				return getItsValues();
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				return getSourceDocOfValueDomain();
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__DEFINITION:
				return getDefinition();
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ICON:
				return getIcon();
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
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__VALUE_FORMAT:
				setValueFormat((String)newValue);
				return;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES:
				setItsValues((ITSVALUESType)newValue);
				return;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				setSourceDocOfValueDomain((SOURCEDOCUMENTType)newValue);
				return;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__DEFINITION:
				setDefinition((TEXTType)newValue);
				return;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ICON:
				setIcon((GRAPHICSType)newValue);
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
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__VALUE_FORMAT:
				setValueFormat(VALUE_FORMAT_EDEFAULT);
				return;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES:
				setItsValues((ITSVALUESType)null);
				return;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				setSourceDocOfValueDomain((SOURCEDOCUMENTType)null);
				return;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__DEFINITION:
				setDefinition((TEXTType)null);
				return;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ICON:
				setIcon((GRAPHICSType)null);
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
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__VALUE_FORMAT:
				return VALUE_FORMAT_EDEFAULT == null ? valueFormat != null : !VALUE_FORMAT_EDEFAULT.equals(valueFormat);
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ITS_VALUES:
				return itsValues != null;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__SOURCE_DOC_OF_VALUE_DOMAIN:
				return sourceDocOfValueDomain != null;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__DEFINITION:
				return definition != null;
			case OntomlPackage.NONQUANTITATIVEINTTYPE_TYPE__ICON:
				return icon != null;
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
		result.append(" (valueFormat: ");
		result.append(valueFormat);
		result.append(')');
		return result.toString();
	}

} //NONQUANTITATIVEINTTYPETypeImpl
