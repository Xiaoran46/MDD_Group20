/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cp Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.CpStatement#getLink <em>Link</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.CpStatement#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.CpStatement#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getCpStatement()
 * @model
 * @generated
 */
public interface CpStatement extends Statements
{
  /**
   * Returns the value of the '<em><b>Link</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.group20.docker.docker.LinkOption}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' attribute.
   * @see uk.ac.kcl.inf.group20.docker.docker.LinkOption
   * @see #setLink(LinkOption)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getCpStatement_Link()
   * @model
   * @generated
   */
  LinkOption getLink();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.CpStatement#getLink <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' attribute.
   * @see uk.ac.kcl.inf.group20.docker.docker.LinkOption
   * @see #getLink()
   * @generated
   */
  void setLink(LinkOption value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(SourceOption)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getCpStatement_Source()
   * @model containment="true"
   * @generated
   */
  SourceOption getSource();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.CpStatement#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(SourceOption value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' attribute.
   * @see #setDestination(String)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getCpStatement_Destination()
   * @model
   * @generated
   */
  String getDestination();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.CpStatement#getDestination <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' attribute.
   * @see #getDestination()
   * @generated
   */
  void setDestination(String value);

} // CpStatement
