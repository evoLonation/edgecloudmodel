/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.edgecloudmodel.eCModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.OperandEnd#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getOperandEnd()
 * @model
 * @generated
 */
public interface OperandEnd extends MixOpAndCFEnd
{
  /**
   * Returns the value of the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' reference.
   * @see #setOwner(Operand)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getOperandEnd_Owner()
   * @model
   * @generated
   */
  Operand getOwner();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.OperandEnd#getOwner <em>Owner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(Operand value);

} // OperandEnd