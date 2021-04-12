/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.SourceOption#getOption1 <em>Option1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group20.docker.docker.SourceOption#getOption2 <em>Option2</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getSourceOption()
 * @model
 * @generated
 */
public interface SourceOption extends EObject
{
  /**
   * Returns the value of the '<em><b>Option1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option1</em>' attribute.
   * @see #setOption1(String)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getSourceOption_Option1()
   * @model
   * @generated
   */
  String getOption1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.SourceOption#getOption1 <em>Option1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option1</em>' attribute.
   * @see #getOption1()
   * @generated
   */
  void setOption1(String value);

  /**
   * Returns the value of the '<em><b>Option2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option2</em>' reference.
   * @see #setOption2(ContainerNameDeclaration)
   * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage#getSourceOption_Option2()
   * @model
   * @generated
   */
  ContainerNameDeclaration getOption2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group20.docker.docker.SourceOption#getOption2 <em>Option2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option2</em>' reference.
   * @see #getOption2()
   * @generated
   */
  void setOption2(ContainerNameDeclaration value);

} // SourceOption
