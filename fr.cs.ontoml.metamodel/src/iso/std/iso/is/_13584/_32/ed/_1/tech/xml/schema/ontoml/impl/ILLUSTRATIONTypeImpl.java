/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl;

import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONTYPEType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ILLUSTRATIONType;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage;
import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.STANDARDSIZEType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ILLUSTRATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ILLUSTRATIONTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ILLUSTRATIONTypeImpl#getKindOfContent <em>Kind Of Content</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ILLUSTRATIONTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ILLUSTRATIONTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.impl.ILLUSTRATIONTypeImpl#getStandardSize <em>Standard Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ILLUSTRATIONTypeImpl extends EXTERNALRESOURCETypeImpl implements ILLUSTRATIONType {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKindOfContent() <em>Kind Of Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfContent()
	 * @generated
	 * @ordered
	 */
	protected static final ILLUSTRATIONTYPEType KIND_OF_CONTENT_EDEFAULT = ILLUSTRATIONTYPEType.SCHEMATICDRAWING;

	/**
	 * The cached value of the '{@link #getKindOfContent() <em>Kind Of Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfContent()
	 * @generated
	 * @ordered
	 */
	protected ILLUSTRATIONTYPEType kindOfContent = KIND_OF_CONTENT_EDEFAULT;

	/**
	 * This is true if the Kind Of Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindOfContentESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardSize() <em>Standard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardSize()
	 * @generated
	 * @ordered
	 */
	protected static final STANDARDSIZEType STANDARD_SIZE_EDEFAULT = STANDARDSIZEType.A6_ILLUSTRATION;

	/**
	 * The cached value of the '{@link #getStandardSize() <em>Standard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardSize()
	 * @generated
	 * @ordered
	 */
	protected STANDARDSIZEType standardSize = STANDARD_SIZE_EDEFAULT;

	/**
	 * This is true if the Standard Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean standardSizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ILLUSTRATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntomlPackage.eINSTANCE.getILLUSTRATIONType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ILLUSTRATION_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATIONTYPEType getKindOfContent() {
		return kindOfContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfContent(ILLUSTRATIONTYPEType newKindOfContent) {
		ILLUSTRATIONTYPEType oldKindOfContent = kindOfContent;
		kindOfContent = newKindOfContent == null ? KIND_OF_CONTENT_EDEFAULT : newKindOfContent;
		boolean oldKindOfContentESet = kindOfContentESet;
		kindOfContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ILLUSTRATION_TYPE__KIND_OF_CONTENT, oldKindOfContent, kindOfContent, !oldKindOfContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKindOfContent() {
		ILLUSTRATIONTYPEType oldKindOfContent = kindOfContent;
		boolean oldKindOfContentESet = kindOfContentESet;
		kindOfContent = KIND_OF_CONTENT_EDEFAULT;
		kindOfContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.ILLUSTRATION_TYPE__KIND_OF_CONTENT, oldKindOfContent, KIND_OF_CONTENT_EDEFAULT, oldKindOfContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKindOfContent() {
		return kindOfContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(BigInteger newWidth) {
		BigInteger oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ILLUSTRATION_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(BigInteger newHeight) {
		BigInteger oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ILLUSTRATION_TYPE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STANDARDSIZEType getStandardSize() {
		return standardSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardSize(STANDARDSIZEType newStandardSize) {
		STANDARDSIZEType oldStandardSize = standardSize;
		standardSize = newStandardSize == null ? STANDARD_SIZE_EDEFAULT : newStandardSize;
		boolean oldStandardSizeESet = standardSizeESet;
		standardSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntomlPackage.ILLUSTRATION_TYPE__STANDARD_SIZE, oldStandardSize, standardSize, !oldStandardSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStandardSize() {
		STANDARDSIZEType oldStandardSize = standardSize;
		boolean oldStandardSizeESet = standardSizeESet;
		standardSize = STANDARD_SIZE_EDEFAULT;
		standardSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OntomlPackage.ILLUSTRATION_TYPE__STANDARD_SIZE, oldStandardSize, STANDARD_SIZE_EDEFAULT, oldStandardSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStandardSize() {
		return standardSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntomlPackage.ILLUSTRATION_TYPE__CODE:
				return getCode();
			case OntomlPackage.ILLUSTRATION_TYPE__KIND_OF_CONTENT:
				return getKindOfContent();
			case OntomlPackage.ILLUSTRATION_TYPE__WIDTH:
				return getWidth();
			case OntomlPackage.ILLUSTRATION_TYPE__HEIGHT:
				return getHeight();
			case OntomlPackage.ILLUSTRATION_TYPE__STANDARD_SIZE:
				return getStandardSize();
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
			case OntomlPackage.ILLUSTRATION_TYPE__CODE:
				setCode((String)newValue);
				return;
			case OntomlPackage.ILLUSTRATION_TYPE__KIND_OF_CONTENT:
				setKindOfContent((ILLUSTRATIONTYPEType)newValue);
				return;
			case OntomlPackage.ILLUSTRATION_TYPE__WIDTH:
				setWidth((BigInteger)newValue);
				return;
			case OntomlPackage.ILLUSTRATION_TYPE__HEIGHT:
				setHeight((BigInteger)newValue);
				return;
			case OntomlPackage.ILLUSTRATION_TYPE__STANDARD_SIZE:
				setStandardSize((STANDARDSIZEType)newValue);
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
			case OntomlPackage.ILLUSTRATION_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case OntomlPackage.ILLUSTRATION_TYPE__KIND_OF_CONTENT:
				unsetKindOfContent();
				return;
			case OntomlPackage.ILLUSTRATION_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case OntomlPackage.ILLUSTRATION_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case OntomlPackage.ILLUSTRATION_TYPE__STANDARD_SIZE:
				unsetStandardSize();
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
			case OntomlPackage.ILLUSTRATION_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case OntomlPackage.ILLUSTRATION_TYPE__KIND_OF_CONTENT:
				return isSetKindOfContent();
			case OntomlPackage.ILLUSTRATION_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case OntomlPackage.ILLUSTRATION_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case OntomlPackage.ILLUSTRATION_TYPE__STANDARD_SIZE:
				return isSetStandardSize();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", kindOfContent: ");
		if (kindOfContentESet) result.append(kindOfContent); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", standardSize: ");
		if (standardSizeESet) result.append(standardSize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ILLUSTRATIONTypeImpl
