/**
 */
package pivotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pivotmodel.CollectionType#getCollectionOf <em>Collection Of</em>}</li>
 *   <li>{@link pivotmodel.CollectionType#getIs <em>Is</em>}</li>
 * </ul>
 *
 * @see pivotmodel.PivotmodelPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends DataTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Collection Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Of</em>' reference.
	 * @see #setCollectionOf(DataTypeDefinition)
	 * @see pivotmodel.PivotmodelPackage#getCollectionType_CollectionOf()
	 * @model required="true"
	 * @generated
	 */
	DataTypeDefinition getCollectionOf();

	/**
	 * Sets the value of the '{@link pivotmodel.CollectionType#getCollectionOf <em>Collection Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Of</em>' reference.
	 * @see #getCollectionOf()
	 * @generated
	 */
	void setCollectionOf(DataTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Is</b></em>' attribute.
	 * The literals are from the enumeration {@link pivotmodel.PredefinedCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' attribute.
	 * @see pivotmodel.PredefinedCollection
	 * @see #setIs(PredefinedCollection)
	 * @see pivotmodel.PivotmodelPackage#getCollectionType_Is()
	 * @model required="true"
	 * @generated
	 */
	PredefinedCollection getIs();

	/**
	 * Sets the value of the '{@link pivotmodel.CollectionType#getIs <em>Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' attribute.
	 * @see pivotmodel.PredefinedCollection
	 * @see #getIs()
	 * @generated
	 */
	void setIs(PredefinedCollection value);

} // CollectionType
