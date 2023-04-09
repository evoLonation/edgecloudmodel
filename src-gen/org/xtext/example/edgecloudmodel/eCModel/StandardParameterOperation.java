/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.edgecloudmodel.eCModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Parameter Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.StandardParameterOperation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getStandardParameterOperation()
 * @model
 * @generated
 */
public interface StandardParameterOperation extends PredefineOp
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeCS)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getStandardParameterOperation_Type()
   * @model containment="true"
   * @generated
   */
  TypeCS getType();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.StandardParameterOperation#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeCS value);

} // StandardParameterOperation