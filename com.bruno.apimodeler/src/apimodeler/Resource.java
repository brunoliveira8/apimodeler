/**
 */
package apimodeler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apimodeler.Resource#getName <em>Name</em>}</li>
 *   <li>{@link apimodeler.Resource#getPathParameter <em>Path Parameter</em>}</li>
 *   <li>{@link apimodeler.Resource#getGet <em>Get</em>}</li>
 *   <li>{@link apimodeler.Resource#getPost <em>Post</em>}</li>
 *   <li>{@link apimodeler.Resource#getPut <em>Put</em>}</li>
 *   <li>{@link apimodeler.Resource#getDelete <em>Delete</em>}</li>
 *   <li>{@link apimodeler.Resource#getPatch <em>Patch</em>}</li>
 * </ul>
 *
 * @see apimodeler.ApimodelerPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
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
	 * @see apimodeler.ApimodelerPackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link apimodeler.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path Parameter</b></em>' reference list.
	 * The list contents are of type {@link apimodeler.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Parameter</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Parameter</em>' reference list.
	 * @see apimodeler.ApimodelerPackage#getResource_PathParameter()
	 * @model
	 * @generated
	 */
	EList<Parameter> getPathParameter();

	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get</em>' containment reference.
	 * @see #setGet(Get)
	 * @see apimodeler.ApimodelerPackage#getResource_Get()
	 * @model containment="true"
	 * @generated
	 */
	Get getGet();

	/**
	 * Sets the value of the '{@link apimodeler.Resource#getGet <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' containment reference.
	 * @see #getGet()
	 * @generated
	 */
	void setGet(Get value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(Post)
	 * @see apimodeler.ApimodelerPackage#getResource_Post()
	 * @model containment="true"
	 * @generated
	 */
	Post getPost();

	/**
	 * Sets the value of the '{@link apimodeler.Resource#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(Post value);

	/**
	 * Returns the value of the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Put</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Put</em>' containment reference.
	 * @see #setPut(Put)
	 * @see apimodeler.ApimodelerPackage#getResource_Put()
	 * @model containment="true"
	 * @generated
	 */
	Put getPut();

	/**
	 * Sets the value of the '{@link apimodeler.Resource#getPut <em>Put</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put</em>' containment reference.
	 * @see #getPut()
	 * @generated
	 */
	void setPut(Put value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(Delete)
	 * @see apimodeler.ApimodelerPackage#getResource_Delete()
	 * @model containment="true"
	 * @generated
	 */
	Delete getDelete();

	/**
	 * Sets the value of the '{@link apimodeler.Resource#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(Delete value);

	/**
	 * Returns the value of the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patch</em>' containment reference.
	 * @see #setPatch(Patch)
	 * @see apimodeler.ApimodelerPackage#getResource_Patch()
	 * @model containment="true"
	 * @generated
	 */
	Patch getPatch();

	/**
	 * Sets the value of the '{@link apimodeler.Resource#getPatch <em>Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patch</em>' containment reference.
	 * @see #getPatch()
	 * @generated
	 */
	void setPatch(Patch value);

} // Resource
