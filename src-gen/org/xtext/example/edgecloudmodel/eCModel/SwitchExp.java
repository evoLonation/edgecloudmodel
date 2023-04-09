/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.edgecloudmodel.eCModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.SwitchExp#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.SwitchExp#getCases <em>Cases</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.SwitchExp#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getSwitchExp()
 * @model
 * @generated
 */
public interface SwitchExp extends JoinExp, ComplexOpeartion
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getSwitchExp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.SwitchExp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.edgecloudmodel.eCModel.SwitchCase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getSwitchExp_Cases()
   * @model containment="true"
   * @generated
   */
  EList<SwitchCase> getCases();

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(SwitchDefault)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getSwitchExp_Default()
   * @model containment="true"
   * @generated
   */
  SwitchDefault getDefault();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.SwitchExp#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(SwitchDefault value);

} // SwitchExp