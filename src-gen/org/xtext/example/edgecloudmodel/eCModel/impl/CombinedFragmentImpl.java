/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.edgecloudmodel.eCModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.edgecloudmodel.eCModel.CombinedFragment;
import org.xtext.example.edgecloudmodel.eCModel.CombinedFragmentEnd;
import org.xtext.example.edgecloudmodel.eCModel.ECModelPackage;
import org.xtext.example.edgecloudmodel.eCModel.Operand;
import org.xtext.example.edgecloudmodel.eCModel.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.impl.CombinedFragmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.impl.CombinedFragmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.impl.CombinedFragmentImpl#getCoveredParticipants <em>Covered Participants</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.impl.CombinedFragmentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.impl.CombinedFragmentImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link org.xtext.example.edgecloudmodel.eCModel.impl.CombinedFragmentImpl#getOwnedOperands <em>Owned Operands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedFragmentImpl extends MinimalEObjectImpl.Container implements CombinedFragment
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
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getCoveredParticipants() <em>Covered Participants</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoveredParticipants()
   * @generated
   * @ordered
   */
  protected EList<Participant> coveredParticipants;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected CombinedFragmentEnd start;

  /**
   * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinish()
   * @generated
   * @ordered
   */
  protected CombinedFragmentEnd finish;

  /**
   * The cached value of the '{@link #getOwnedOperands() <em>Owned Operands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedOperands()
   * @generated
   * @ordered
   */
  protected EList<Operand> ownedOperands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CombinedFragmentImpl()
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
    return ECModelPackage.Literals.COMBINED_FRAGMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ECModelPackage.COMBINED_FRAGMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ECModelPackage.COMBINED_FRAGMENT__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Participant> getCoveredParticipants()
  {
    if (coveredParticipants == null)
    {
      coveredParticipants = new EObjectResolvingEList<Participant>(Participant.class, this, ECModelPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS);
    }
    return coveredParticipants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CombinedFragmentEnd getStart()
  {
    if (start != null && start.eIsProxy())
    {
      InternalEObject oldStart = (InternalEObject)start;
      start = (CombinedFragmentEnd)eResolveProxy(oldStart);
      if (start != oldStart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ECModelPackage.COMBINED_FRAGMENT__START, oldStart, start));
      }
    }
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CombinedFragmentEnd basicGetStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStart(CombinedFragmentEnd newStart)
  {
    CombinedFragmentEnd oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ECModelPackage.COMBINED_FRAGMENT__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CombinedFragmentEnd getFinish()
  {
    if (finish != null && finish.eIsProxy())
    {
      InternalEObject oldFinish = (InternalEObject)finish;
      finish = (CombinedFragmentEnd)eResolveProxy(oldFinish);
      if (finish != oldFinish)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ECModelPackage.COMBINED_FRAGMENT__FINISH, oldFinish, finish));
      }
    }
    return finish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CombinedFragmentEnd basicGetFinish()
  {
    return finish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinish(CombinedFragmentEnd newFinish)
  {
    CombinedFragmentEnd oldFinish = finish;
    finish = newFinish;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ECModelPackage.COMBINED_FRAGMENT__FINISH, oldFinish, finish));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Operand> getOwnedOperands()
  {
    if (ownedOperands == null)
    {
      ownedOperands = new EObjectContainmentEList<Operand>(Operand.class, this, ECModelPackage.COMBINED_FRAGMENT__OWNED_OPERANDS);
    }
    return ownedOperands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ECModelPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
        return ((InternalEList<?>)getOwnedOperands()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ECModelPackage.COMBINED_FRAGMENT__NAME:
        return getName();
      case ECModelPackage.COMBINED_FRAGMENT__OPERATOR:
        return getOperator();
      case ECModelPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
        return getCoveredParticipants();
      case ECModelPackage.COMBINED_FRAGMENT__START:
        if (resolve) return getStart();
        return basicGetStart();
      case ECModelPackage.COMBINED_FRAGMENT__FINISH:
        if (resolve) return getFinish();
        return basicGetFinish();
      case ECModelPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
        return getOwnedOperands();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ECModelPackage.COMBINED_FRAGMENT__NAME:
        setName((String)newValue);
        return;
      case ECModelPackage.COMBINED_FRAGMENT__OPERATOR:
        setOperator((String)newValue);
        return;
      case ECModelPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
        getCoveredParticipants().clear();
        getCoveredParticipants().addAll((Collection<? extends Participant>)newValue);
        return;
      case ECModelPackage.COMBINED_FRAGMENT__START:
        setStart((CombinedFragmentEnd)newValue);
        return;
      case ECModelPackage.COMBINED_FRAGMENT__FINISH:
        setFinish((CombinedFragmentEnd)newValue);
        return;
      case ECModelPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
        getOwnedOperands().clear();
        getOwnedOperands().addAll((Collection<? extends Operand>)newValue);
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
      case ECModelPackage.COMBINED_FRAGMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ECModelPackage.COMBINED_FRAGMENT__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case ECModelPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
        getCoveredParticipants().clear();
        return;
      case ECModelPackage.COMBINED_FRAGMENT__START:
        setStart((CombinedFragmentEnd)null);
        return;
      case ECModelPackage.COMBINED_FRAGMENT__FINISH:
        setFinish((CombinedFragmentEnd)null);
        return;
      case ECModelPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
        getOwnedOperands().clear();
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
      case ECModelPackage.COMBINED_FRAGMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ECModelPackage.COMBINED_FRAGMENT__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case ECModelPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
        return coveredParticipants != null && !coveredParticipants.isEmpty();
      case ECModelPackage.COMBINED_FRAGMENT__START:
        return start != null;
      case ECModelPackage.COMBINED_FRAGMENT__FINISH:
        return finish != null;
      case ECModelPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
        return ownedOperands != null && !ownedOperands.isEmpty();
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
    result.append(", operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //CombinedFragmentImpl
