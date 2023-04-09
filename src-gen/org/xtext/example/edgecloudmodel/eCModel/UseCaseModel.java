/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.edgecloudmodel.eCModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.UseCaseModel#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.UseCaseModel#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.UseCaseModel#getUc <em>Uc</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.UseCaseModel#getActor <em>Actor</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.UseCaseModel#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.UseCaseModel#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.UseCaseModel#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getUseCaseModel()
 * @model
 * @generated
 */
public interface UseCaseModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getUseCaseModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.UseCaseModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getUseCaseModel_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.edgecloudmodel.eCModel.UseCaseModel#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Uc</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.edgecloudmodel.eCModel.UC}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uc</em>' containment reference list.
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getUseCaseModel_Uc()
   * @model containment="true"
   * @generated
   */
  EList<UC> getUc();

  /**
   * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.edgecloudmodel.eCModel.Actor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor</em>' containment reference list.
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getUseCaseModel_Actor()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActor();

  /**
   * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.edgecloudmodel.eCModel.Interaction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction</em>' containment reference list.
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getUseCaseModel_Interaction()
   * @model containment="true"
   * @generated
   */
  EList<Interaction> getInteraction();

  /**
   * Returns the value of the '<em><b>Service</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.edgecloudmodel.eCModel.Service}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' containment reference list.
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getUseCaseModel_Service()
   * @model containment="true"
   * @generated
   */
  EList<Service> getService();

  /**
   * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.edgecloudmodel.eCModel.Contract}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract</em>' containment reference list.
   * @see org.xtext.example.edgecloudmodel.eCModel.ECModelPackage#getUseCaseModel_Contract()
   * @model containment="true"
   * @generated
   */
  EList<Contract> getContract();

} // UseCaseModel