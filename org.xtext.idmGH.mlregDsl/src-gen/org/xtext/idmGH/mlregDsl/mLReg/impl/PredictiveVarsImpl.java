/**
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.mLReg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.idmGH.mlregDsl.mLReg.ColVar;
import org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage;
import org.xtext.idmGH.mlregDsl.mLReg.PredictiveVars;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predictive Vars</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.PredictiveVarsImpl#getPredictiveVar <em>Predictive Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictiveVarsImpl extends MinimalEObjectImpl.Container implements PredictiveVars
{
  /**
   * The cached value of the '{@link #getPredictiveVar() <em>Predictive Var</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredictiveVar()
   * @generated
   * @ordered
   */
  protected EList<ColVar> predictiveVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredictiveVarsImpl()
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
    return MLRegPackage.Literals.PREDICTIVE_VARS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ColVar> getPredictiveVar()
  {
    if (predictiveVar == null)
    {
      predictiveVar = new EObjectContainmentEList<ColVar>(ColVar.class, this, MLRegPackage.PREDICTIVE_VARS__PREDICTIVE_VAR);
    }
    return predictiveVar;
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
      case MLRegPackage.PREDICTIVE_VARS__PREDICTIVE_VAR:
        return ((InternalEList<?>)getPredictiveVar()).basicRemove(otherEnd, msgs);
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
      case MLRegPackage.PREDICTIVE_VARS__PREDICTIVE_VAR:
        return getPredictiveVar();
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
      case MLRegPackage.PREDICTIVE_VARS__PREDICTIVE_VAR:
        getPredictiveVar().clear();
        getPredictiveVar().addAll((Collection<? extends ColVar>)newValue);
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
      case MLRegPackage.PREDICTIVE_VARS__PREDICTIVE_VAR:
        getPredictiveVar().clear();
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
      case MLRegPackage.PREDICTIVE_VARS__PREDICTIVE_VAR:
        return predictiveVar != null && !predictiveVar.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PredictiveVarsImpl
