/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.StopStatement#getContainerName <em>Container Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getStopStatement()
 * @model
 * @generated
 */
public interface StopStatement extends Statements
{
  /**
   * Returns the value of the '<em><b>Container Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Name</em>' reference.
   * @see #setContainerName(ContainerNameDeclaration)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getStopStatement_ContainerName()
   * @model
   * @generated
   */
  ContainerNameDeclaration getContainerName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.StopStatement#getContainerName <em>Container Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container Name</em>' reference.
   * @see #getContainerName()
   * @generated
   */
  void setContainerName(ContainerNameDeclaration value);

} // StopStatement
