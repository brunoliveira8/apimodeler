/**
 */
package apimodeler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apimodeler.Response#getCode <em>Code</em>}</li>
 *   <li>{@link apimodeler.Response#getDescription <em>Description</em>}</li>
 *   <li>{@link apimodeler.Response#getType <em>Type</em>}</li>
 *   <li>{@link apimodeler.Response#getDocuments <em>Documents</em>}</li>
 *   <li>{@link apimodeler.Response#getDocument <em>Document</em>}</li>
 *   <li>{@link apimodeler.Response#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see apimodeler.ApimodelerPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"C200"</code>.
	 * The literals are from the enumeration {@link apimodeler.StatusCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see apimodeler.StatusCode
	 * @see #setCode(StatusCode)
	 * @see apimodeler.ApimodelerPackage#getResponse_Code()
	 * @model default="C200"
	 * @generated
	 */
	StatusCode getCode();

	/**
	 * Sets the value of the '{@link apimodeler.Response#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see apimodeler.StatusCode
	 * @see #getCode()
	 * @generated
	 */
	void setCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see apimodeler.ApimodelerPackage#getResponse_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link apimodeler.Response#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"object"</code>.
	 * The literals are from the enumeration {@link apimodeler.SchemaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see apimodeler.SchemaType
	 * @see #setType(SchemaType)
	 * @see apimodeler.ApimodelerPackage#getResponse_Type()
	 * @model default="object"
	 * @generated
	 */
	SchemaType getType();

	/**
	 * Sets the value of the '{@link apimodeler.Response#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see apimodeler.SchemaType
	 * @see #getType()
	 * @generated
	 */
	void setType(SchemaType value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference.
	 * @see #setDocuments(Document)
	 * @see apimodeler.ApimodelerPackage#getResponse_Documents()
	 * @model
	 * @generated
	 */
	Document getDocuments();

	/**
	 * Sets the value of the '{@link apimodeler.Response#getDocuments <em>Documents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documents</em>' reference.
	 * @see #getDocuments()
	 * @generated
	 */
	void setDocuments(Document value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(Document)
	 * @see apimodeler.ApimodelerPackage#getResponse_Document()
	 * @model containment="true"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link apimodeler.Response#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see apimodeler.ApimodelerPackage#getResponse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link apimodeler.Response#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Response
