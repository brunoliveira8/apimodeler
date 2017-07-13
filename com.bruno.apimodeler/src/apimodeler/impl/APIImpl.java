/**
 */
package apimodeler.impl;

import apimodeler.API;
import apimodeler.ApimodelerPackage;
import apimodeler.Document;
import apimodeler.Information;
import apimodeler.Parameter;
import apimodeler.Resource;

import apimodeler.Response;
import apimodeler.Schemes;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apimodeler.impl.APIImpl#getHost <em>Host</em>}</li>
 *   <li>{@link apimodeler.impl.APIImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link apimodeler.impl.APIImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link apimodeler.impl.APIImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link apimodeler.impl.APIImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link apimodeler.impl.APIImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link apimodeler.impl.APIImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link apimodeler.impl.APIImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIImpl extends MinimalEObjectImpl.Container implements API {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<Schemes> schemes;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected Information info;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> response;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> document;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApimodelerPackage.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelerPackage.API__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelerPackage.API__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schemes> getSchemes() {
		if (schemes == null) {
			schemes = new EDataTypeUniqueEList<Schemes>(Schemes.class, this, ApimodelerPackage.API__SCHEMES);
		}
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(Information newInfo, NotificationChain msgs) {
		Information oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApimodelerPackage.API__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(Information newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApimodelerPackage.API__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApimodelerPackage.API__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelerPackage.API__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this, ApimodelerPackage.API__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Response> getResponse() {
		if (response == null) {
			response = new EObjectContainmentEList<Response>(Response.class, this, ApimodelerPackage.API__RESPONSE);
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocument() {
		if (document == null) {
			document = new EObjectContainmentEList<Document>(Document.class, this, ApimodelerPackage.API__DOCUMENT);
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, ApimodelerPackage.API__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApimodelerPackage.API__INFO:
				return basicSetInfo(null, msgs);
			case ApimodelerPackage.API__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case ApimodelerPackage.API__RESPONSE:
				return ((InternalEList<?>)getResponse()).basicRemove(otherEnd, msgs);
			case ApimodelerPackage.API__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
			case ApimodelerPackage.API__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case ApimodelerPackage.API__HOST:
				return getHost();
			case ApimodelerPackage.API__BASE_PATH:
				return getBasePath();
			case ApimodelerPackage.API__SCHEMES:
				return getSchemes();
			case ApimodelerPackage.API__INFO:
				return getInfo();
			case ApimodelerPackage.API__RESOURCE:
				return getResource();
			case ApimodelerPackage.API__RESPONSE:
				return getResponse();
			case ApimodelerPackage.API__DOCUMENT:
				return getDocument();
			case ApimodelerPackage.API__PARAMETER:
				return getParameter();
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
			case ApimodelerPackage.API__HOST:
				setHost((String)newValue);
				return;
			case ApimodelerPackage.API__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case ApimodelerPackage.API__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends Schemes>)newValue);
				return;
			case ApimodelerPackage.API__INFO:
				setInfo((Information)newValue);
				return;
			case ApimodelerPackage.API__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case ApimodelerPackage.API__RESPONSE:
				getResponse().clear();
				getResponse().addAll((Collection<? extends Response>)newValue);
				return;
			case ApimodelerPackage.API__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection<? extends Document>)newValue);
				return;
			case ApimodelerPackage.API__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
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
			case ApimodelerPackage.API__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case ApimodelerPackage.API__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case ApimodelerPackage.API__SCHEMES:
				getSchemes().clear();
				return;
			case ApimodelerPackage.API__INFO:
				setInfo((Information)null);
				return;
			case ApimodelerPackage.API__RESOURCE:
				getResource().clear();
				return;
			case ApimodelerPackage.API__RESPONSE:
				getResponse().clear();
				return;
			case ApimodelerPackage.API__DOCUMENT:
				getDocument().clear();
				return;
			case ApimodelerPackage.API__PARAMETER:
				getParameter().clear();
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
			case ApimodelerPackage.API__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case ApimodelerPackage.API__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case ApimodelerPackage.API__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case ApimodelerPackage.API__INFO:
				return info != null;
			case ApimodelerPackage.API__RESOURCE:
				return resource != null && !resource.isEmpty();
			case ApimodelerPackage.API__RESPONSE:
				return response != null && !response.isEmpty();
			case ApimodelerPackage.API__DOCUMENT:
				return document != null && !document.isEmpty();
			case ApimodelerPackage.API__PARAMETER:
				return parameter != null && !parameter.isEmpty();
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
		result.append(" (host: ");
		result.append(host);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", schemes: ");
		result.append(schemes);
		result.append(')');
		return result.toString();
	}

} //APIImpl
