/**
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.mLReg.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage;
import org.xtext.idmGH.mlregDsl.mLReg.TestSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.TestSizeImpl#getTestSize <em>Test Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestSizeImpl extends MinimalEObjectImpl.Container implements TestSize
{
  /**
   * The default value of the '{@link #getTestSize() <em>Test Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestSize()
   * @generated
   * @ordered
   */
  protected static final int TEST_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTestSize() <em>Test Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestSize()
   * @generated
   * @ordered
   */
  protected int testSize = TEST_SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestSizeImpl()
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
    return MLRegPackage.Literals.TEST_SIZE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTestSize()
  {
    return testSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTestSize(int newTestSize)
  {
    int oldTestSize = testSize;
    testSize = newTestSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegPackage.TEST_SIZE__TEST_SIZE, oldTestSize, testSize));
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
      case MLRegPackage.TEST_SIZE__TEST_SIZE:
        return getTestSize();
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
      case MLRegPackage.TEST_SIZE__TEST_SIZE:
        setTestSize((Integer)newValue);
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
      case MLRegPackage.TEST_SIZE__TEST_SIZE:
        setTestSize(TEST_SIZE_EDEFAULT);
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
      case MLRegPackage.TEST_SIZE__TEST_SIZE:
        return testSize != TEST_SIZE_EDEFAULT;
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
    result.append(" (testSize: ");
    result.append(testSize);
    result.append(')');
    return result.toString();
  }

} //TestSizeImpl