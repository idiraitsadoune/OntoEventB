/**
 */
package iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl;

import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IRDISequenceType;
import iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.IdentifierPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IRDI Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso.std.iso.ts._29002._5.ed._1.tech.xml.schema.identifier.impl.IRDISequenceTypeImpl#getIRDI <em>IRDI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IRDISequenceTypeImpl extends MinimalEObjectImpl.Container implements IRDISequenceType {
	/**
	 * The cached value of the '{@link #getIRDI() <em>IRDI</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRDI()
	 * @generated
	 * @ordered
	 */
	protected EList<String> iRDI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IRDISequenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdentifierPackage.Literals.IRDI_SEQUENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIRDI() {
		if (iRDI == null) {
			iRDI = new EDataTypeEList<String>(String.class, this, IdentifierPackage.IRDI_SEQUENCE_TYPE__IRDI);
		}
		return iRDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdentifierPackage.IRDI_SEQUENCE_TYPE__IRDI:
				return getIRDI();
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
			case IdentifierPackage.IRDI_SEQUENCE_TYPE__IRDI:
				getIRDI().clear();
				getIRDI().addAll((Collection<? extends String>)newValue);
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
			case IdentifierPackage.IRDI_SEQUENCE_TYPE__IRDI:
				getIRDI().clear();
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
			case IdentifierPackage.IRDI_SEQUENCE_TYPE__IRDI:
				return iRDI != null && !iRDI.isEmpty();
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
		result.append(" (iRDI: ");
		result.append(iRDI);
		result.append(')');
		return result.toString();
	}

} //IRDISequenceTypeImpl
