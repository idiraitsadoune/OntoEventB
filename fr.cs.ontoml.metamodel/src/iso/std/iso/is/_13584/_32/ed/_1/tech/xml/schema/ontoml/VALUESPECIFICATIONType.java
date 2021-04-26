/**
 */
package iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>VALUESPECIFICATION Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.OntomlPackage#getVALUESPECIFICATIONType()
 * @model extendedMetaData="name='VALUE_SPECIFICATION_Type'"
 * @generated
 */
public enum VALUESPECIFICATIONType implements Enumerator {
	/**
	 * The '<em><b>CODED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODED_VALUE
	 * @generated
	 * @ordered
	 */
	CODED(0, "CODED", "CODED"),

	/**
	 * The '<em><b>EXPLICIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLICIT(1, "EXPLICIT", "EXPLICIT");

	/**
	 * The '<em><b>CODED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CODED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CODED_VALUE = 0;

	/**
	 * The '<em><b>EXPLICIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPLICIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPLICIT_VALUE = 1;

	/**
	 * An array of all the '<em><b>VALUESPECIFICATION Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VALUESPECIFICATIONType[] VALUES_ARRAY =
		new VALUESPECIFICATIONType[] {
			CODED,
			EXPLICIT,
		};

	/**
	 * A public read-only list of all the '<em><b>VALUESPECIFICATION Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VALUESPECIFICATIONType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>VALUESPECIFICATION Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VALUESPECIFICATIONType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VALUESPECIFICATIONType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VALUESPECIFICATION Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VALUESPECIFICATIONType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VALUESPECIFICATIONType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VALUESPECIFICATION Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VALUESPECIFICATIONType get(int value) {
		switch (value) {
			case CODED_VALUE: return CODED;
			case EXPLICIT_VALUE: return EXPLICIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VALUESPECIFICATIONType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //VALUESPECIFICATIONType
