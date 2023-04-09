/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.edgecloudmodel.eCModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getDef <em>Def</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getPre <em>Pre</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject
{
  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(Service)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getContract_Service()
   * @model
   * @generated
   */
  Service getService();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(Service value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(Operation)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getContract_Op()
   * @model containment="true"
   * @generated
   */
  Operation getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(Operation value);

  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(Definition)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getContract_Def()
   * @model containment="true"
   * @generated
   */
  Definition getDef();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(Definition value);

  /**
   * Returns the value of the '<em><b>Pre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' containment reference.
   * @see #setPre(Precondition)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getContract_Pre()
   * @model containment="true"
   * @generated
   */
  Precondition getPre();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getPre <em>Pre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre</em>' containment reference.
   * @see #getPre()
   * @generated
   */
  void setPre(Precondition value);

  /**
   * Returns the value of the '<em><b>Post</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post</em>' containment reference.
   * @see #setPost(Postcondition)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getContract_Post()
   * @model containment="true"
   * @generated
   */
  Postcondition getPost();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.Contract#getPost <em>Post</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post</em>' containment reference.
   * @see #getPost()
   * @generated
   */
  void setPost(Postcondition value);

} // Contract
