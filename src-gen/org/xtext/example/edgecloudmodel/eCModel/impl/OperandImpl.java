/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.edgecloudmodel.eCModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.edgecloudmodel.eCModel.ECModelPackage;
import org.xtext.example.edgecloudmodel.eCModel.MixOpAndCFEnd;
import org.xtext.example.edgecloudmodel.eCModel.Operand;
import org.xtext.example.edgecloudmodel.eCModel.OperandEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.impl.OperandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.impl.OperandImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.impl.OperandImpl#getFinish <em>Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperandImpl extends MinimalEObjectImpl.Container implements Operand
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected OperandEnd start;

  /**
   * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinish()
   * @generated
   * @ordered
   */
  protected MixOpAndCFEnd finish;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperandImpl()
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
    return ECModelPackage.Literals.OPERAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ECModelPackage.OPERAND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperandEnd getStart()
  {
    if (start != null && start.eIsProxy())
    {
      InternalEObject oldStart = (InternalEObject)start;
      start = (OperandEnd)eResolveProxy(oldStart);
      if (start != oldStart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ECModelPackage.OPERAND__START, oldStart, start));
      }
    }
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperandEnd basicGetStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStart(OperandEnd newStart)
  {
    OperandEnd oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ECModelPackage.OPERAND__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MixOpAndCFEnd getFinish()
  {
    if (finish != null && finish.eIsProxy())
    {
      InternalEObject oldFinish = (InternalEObject)finish;
      finish = (MixOpAndCFEnd)eResolveProxy(oldFinish);
      if (finish != oldFinish)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ECModelPackage.OPERAND__FINISH, oldFinish, finish));
      }
    }
    return finish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MixOpAndCFEnd basicGetFinish()
  {
    return finish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinish(MixOpAndCFEnd newFinish)
  {
    MixOpAndCFEnd oldFinish = finish;
    finish = newFinish;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ECModelPackage.OPERAND__FINISH, oldFinish, finish));
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
      case ECModelPackage.OPERAND__NAME:
        return getName();
      case ECModelPackage.OPERAND__START:
        if (resolve) return getStart();
        return basicGetStart();
      case ECModelPackage.OPERAND__FINISH:
        if (resolve) return getFinish();
        return basicGetFinish();
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
      case ECModelPackage.OPERAND__NAME:
        setName((String)newValue);
        return;
      case ECModelPackage.OPERAND__START:
        setStart((OperandEnd)newValue);
        return;
      case ECModelPackage.OPERAND__FINISH:
        setFinish((MixOpAndCFEnd)newValue);
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
      case ECModelPackage.OPERAND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ECModelPackage.OPERAND__START:
        setStart((OperandEnd)null);
        return;
      case ECModelPackage.OPERAND__FINISH:
        setFinish((MixOpAndCFEnd)null);
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
      case ECModelPackage.OPERAND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ECModelPackage.OPERAND__START:
        return start != null;
      case ECModelPackage.OPERAND__FINISH:
        return finish != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //OperandImpl