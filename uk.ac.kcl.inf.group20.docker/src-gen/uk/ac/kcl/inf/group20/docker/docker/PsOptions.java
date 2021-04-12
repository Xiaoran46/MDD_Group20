/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ps Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.PsOptions#getOption <em>Option</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.PsOptions#getCommands <em>Commands</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.PsOptions#getFormats <em>Formats</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.PsOptions#getN <em>N</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getPsOptions()
 * @model
 * @generated
 */
public interface PsOptions extends EObject
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute.
   * @see #setOption(String)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getPsOptions_Option()
   * @model
   * @generated
   */
  String getOption();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.PsOptions#getOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see #getOption()
   * @generated
   */
  void setOption(String value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' attribute.
   * @see #setCommands(String)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getPsOptions_Commands()
   * @model
   * @generated
   */
  String getCommands();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.PsOptions#getCommands <em>Commands</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commands</em>' attribute.
   * @see #getCommands()
   * @generated
   */
  void setCommands(String value);

  /**
   * Returns the value of the '<em><b>Formats</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formats</em>' attribute.
   * @see #setFormats(String)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getPsOptions_Formats()
   * @model
   * @generated
   */
  String getFormats();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.PsOptions#getFormats <em>Formats</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formats</em>' attribute.
   * @see #getFormats()
   * @generated
   */
  void setFormats(String value);

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(int)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getPsOptions_N()
   * @model
   * @generated
   */
  int getN();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.PsOptions#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(int value);

} // PsOptions
