/**
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.mLReg.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.idmGH.mlregDsl.mLReg.ErrorCalculation;
import org.xtext.idmGH.mlregDsl.mLReg.ErrorMeasure;
import org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.ErrorMeasureImpl#getErrorMeasure <em>Error Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorMeasureImpl extends MinimalEObjectImpl.Container implements ErrorMeasure
{
  /**
   * The default value of the '{@link #getErrorMeasure() <em>Error Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMeasure()
   * @generated
   * @ordered
   */
  protected static final ErrorCalculation ERROR_MEASURE_EDEFAULT = ErrorCalculation.MEAN_SQUARED_ERROR;

  /**
   * The cached value of the '{@link #getErrorMeasure() <em>Error Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMeasure()
   * @generated
   * @ordered
   */
  protected ErrorCalculation errorMeasure = ERROR_MEASURE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ErrorMeasureImpl()
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
    return MLRegPackage.Literals.ERROR_MEASURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ErrorCalculation getErrorMeasure()
  {
    return errorMeasure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setErrorMeasure(ErrorCalculation newErrorMeasure)
  {
    ErrorCalculation oldErrorMeasure = errorMeasure;
    errorMeasure = newErrorMeasure == null ? ERROR_MEASURE_EDEFAULT : newErrorMeasure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegPackage.ERROR_MEASURE__ERROR_MEASURE, oldErrorMeasure, errorMeasure));
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
      case MLRegPackage.ERROR_MEASURE__ERROR_MEASURE:
        return getErrorMeasure();
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
      case MLRegPackage.ERROR_MEASURE__ERROR_MEASURE:
        setErrorMeasure((ErrorCalculation)newValue);
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
      case MLRegPackage.ERROR_MEASURE__ERROR_MEASURE:
        setErrorMeasure(ERROR_MEASURE_EDEFAULT);
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
      case MLRegPackage.ERROR_MEASURE__ERROR_MEASURE:
        return errorMeasure != ERROR_MEASURE_EDEFAULT;
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
    result.append(" (errorMeasure: ");
    result.append(errorMeasure);
    result.append(')');
    return result.toString();
  }

} //ErrorMeasureImpl
