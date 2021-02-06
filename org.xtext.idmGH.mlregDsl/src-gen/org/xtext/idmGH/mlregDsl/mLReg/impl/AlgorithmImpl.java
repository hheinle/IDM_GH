/**
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.mLReg.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.idmGH.mlregDsl.mLReg.AlgoName;
import org.xtext.idmGH.mlregDsl.mLReg.Algorithm;
import org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.AlgorithmImpl#getAlgoName <em>Algo Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmImpl extends MinimalEObjectImpl.Container implements Algorithm
{
  /**
   * The default value of the '{@link #getAlgoName() <em>Algo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgoName()
   * @generated
   * @ordered
   */
  protected static final AlgoName ALGO_NAME_EDEFAULT = AlgoName.REGRESSION_TREE;

  /**
   * The cached value of the '{@link #getAlgoName() <em>Algo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgoName()
   * @generated
   * @ordered
   */
  protected AlgoName algoName = ALGO_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlgorithmImpl()
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
    return MLRegPackage.Literals.ALGORITHM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlgoName getAlgoName()
  {
    return algoName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlgoName(AlgoName newAlgoName)
  {
    AlgoName oldAlgoName = algoName;
    algoName = newAlgoName == null ? ALGO_NAME_EDEFAULT : newAlgoName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegPackage.ALGORITHM__ALGO_NAME, oldAlgoName, algoName));
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
      case MLRegPackage.ALGORITHM__ALGO_NAME:
        return getAlgoName();
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
      case MLRegPackage.ALGORITHM__ALGO_NAME:
        setAlgoName((AlgoName)newValue);
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
      case MLRegPackage.ALGORITHM__ALGO_NAME:
        setAlgoName(ALGO_NAME_EDEFAULT);
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
      case MLRegPackage.ALGORITHM__ALGO_NAME:
        return algoName != ALGO_NAME_EDEFAULT;
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
    result.append(" (algoName: ");
    result.append(algoName);
    result.append(')');
    return result.toString();
  }

} //AlgorithmImpl
