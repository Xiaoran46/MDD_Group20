/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.group20.docker.docker.ContainerNameDeclaration;
import uk.ac.kcl.inf.group20.docker.docker.DockerPackage;
import uk.ac.kcl.inf.group20.docker.docker.ExportStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.impl.ExportStatementImpl#getFile_path <em>File path</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.impl.ExportStatementImpl#getContainerName <em>Container Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportStatementImpl extends StatementsImpl implements ExportStatement
{
  /**
   * The default value of the '{@link #getFile_path() <em>File path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile_path()
   * @generated
   * @ordered
   */
  protected static final String FILE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFile_path() <em>File path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile_path()
   * @generated
   * @ordered
   */
  protected String file_path = FILE_PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getContainerName() <em>Container Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerName()
   * @generated
   * @ordered
   */
  protected ContainerNameDeclaration containerName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExportStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DockerPackage.Literals.EXPORT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFile_path()
  {
    return file_path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFile_path(String newFile_path)
  {
    String oldFile_path = file_path;
    file_path = newFile_path;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.EXPORT_STATEMENT__FILE_PATH, oldFile_path, file_path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContainerNameDeclaration getContainerName()
  {
    if (containerName != null && containerName.eIsProxy())
    {
      InternalEObject oldContainerName = (InternalEObject)containerName;
      containerName = (ContainerNameDeclaration)eResolveProxy(oldContainerName);
      if (containerName != oldContainerName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockerPackage.EXPORT_STATEMENT__CONTAINER_NAME, oldContainerName, containerName));
      }
    }
    return containerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerNameDeclaration basicGetContainerName()
  {
    return containerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContainerName(ContainerNameDeclaration newContainerName)
  {
    ContainerNameDeclaration oldContainerName = containerName;
    containerName = newContainerName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.EXPORT_STATEMENT__CONTAINER_NAME, oldContainerName, containerName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DockerPackage.EXPORT_STATEMENT__FILE_PATH:
        return getFile_path();
      case DockerPackage.EXPORT_STATEMENT__CONTAINER_NAME:
        if (resolve) return getContainerName();
        return basicGetContainerName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DockerPackage.EXPORT_STATEMENT__FILE_PATH:
        setFile_path((String)newValue);
        return;
      case DockerPackage.EXPORT_STATEMENT__CONTAINER_NAME:
        setContainerName((ContainerNameDeclaration)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DockerPackage.EXPORT_STATEMENT__FILE_PATH:
        setFile_path(FILE_PATH_EDEFAULT);
        return;
      case DockerPackage.EXPORT_STATEMENT__CONTAINER_NAME:
        setContainerName((ContainerNameDeclaration)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DockerPackage.EXPORT_STATEMENT__FILE_PATH:
        return FILE_PATH_EDEFAULT == null ? file_path != null : !FILE_PATH_EDEFAULT.equals(file_path);
      case DockerPackage.EXPORT_STATEMENT__CONTAINER_NAME:
        return containerName != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (file_path: ");
    result.append(file_path);
    result.append(')');
    return result.toString();
  }

} //ExportStatementImpl
