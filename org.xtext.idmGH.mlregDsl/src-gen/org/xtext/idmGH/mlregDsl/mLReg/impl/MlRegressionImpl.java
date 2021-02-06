/**
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.mLReg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.idmGH.mlregDsl.mLReg.Algorithm;
import org.xtext.idmGH.mlregDsl.mLReg.CsvFile;
import org.xtext.idmGH.mlregDsl.mLReg.ErrorMeasure;
import org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage;
import org.xtext.idmGH.mlregDsl.mLReg.MlRegression;
import org.xtext.idmGH.mlregDsl.mLReg.PredictiveVars;
import org.xtext.idmGH.mlregDsl.mLReg.TargetVar;
import org.xtext.idmGH.mlregDsl.mLReg.TestSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ml Regression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.MlRegressionImpl#getCsvFile <em>Csv File</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.MlRegressionImpl#getTestSize <em>Test Size</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.MlRegressionImpl#getPredictiveVars <em>Predictive Vars</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.MlRegressionImpl#getTargetVar <em>Target Var</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.MlRegressionImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.impl.MlRegressionImpl#getErrorMeasure <em>Error Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MlRegressionImpl extends MinimalEObjectImpl.Container implements MlRegression
{
  /**
   * The cached value of the '{@link #getCsvFile() <em>Csv File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCsvFile()
   * @generated
   * @ordered
   */
  protected CsvFile csvFile;

  /**
   * The cached value of the '{@link #getTestSize() <em>Test Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestSize()
   * @generated
   * @ordered
   */
  protected TestSize testSize;

  /**
   * The cached value of the '{@link #getPredictiveVars() <em>Predictive Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredictiveVars()
   * @generated
   * @ordered
   */
  protected PredictiveVars predictiveVars;

  /**
   * The cached value of the '{@link #getTargetVar() <em>Target Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetVar()
   * @generated
   * @ordered
   */
  protected TargetVar targetVar;

  /**
   * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithm()
   * @generated
   * @ordered
   */
  protected Algorithm algorithm;

  /**
   * The cached value of the '{@link #getErrorMeasure() <em>Error Measure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMeasure()
   * @generated
   * @ordered
   */
  protected ErrorMeasure errorMeasure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MlRegressionImpl()
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
    return MLRegPackage.Literals.ML_REGRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CsvFile getCsvFile()
  {
    return csvFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCsvFile(CsvFile newCsvFile, NotificationChain msgs)
  {
    CsvFile oldCsvFile = csvFile;
    csvFile = newCsvFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__CSV_FILE, oldCsvFile, newCsvFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCsvFile(CsvFile newCsvFile)
  {
    if (newCsvFile != csvFile)
    {
      NotificationChain msgs = null;
      if (csvFile != null)
        msgs = ((InternalEObject)csvFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__CSV_FILE, null, msgs);
      if (newCsvFile != null)
        msgs = ((InternalEObject)newCsvFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__CSV_FILE, null, msgs);
      msgs = basicSetCsvFile(newCsvFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__CSV_FILE, newCsvFile, newCsvFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestSize getTestSize()
  {
    return testSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestSize(TestSize newTestSize, NotificationChain msgs)
  {
    TestSize oldTestSize = testSize;
    testSize = newTestSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__TEST_SIZE, oldTestSize, newTestSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTestSize(TestSize newTestSize)
  {
    if (newTestSize != testSize)
    {
      NotificationChain msgs = null;
      if (testSize != null)
        msgs = ((InternalEObject)testSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__TEST_SIZE, null, msgs);
      if (newTestSize != null)
        msgs = ((InternalEObject)newTestSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__TEST_SIZE, null, msgs);
      msgs = basicSetTestSize(newTestSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__TEST_SIZE, newTestSize, newTestSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PredictiveVars getPredictiveVars()
  {
    return predictiveVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredictiveVars(PredictiveVars newPredictiveVars, NotificationChain msgs)
  {
    PredictiveVars oldPredictiveVars = predictiveVars;
    predictiveVars = newPredictiveVars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__PREDICTIVE_VARS, oldPredictiveVars, newPredictiveVars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPredictiveVars(PredictiveVars newPredictiveVars)
  {
    if (newPredictiveVars != predictiveVars)
    {
      NotificationChain msgs = null;
      if (predictiveVars != null)
        msgs = ((InternalEObject)predictiveVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__PREDICTIVE_VARS, null, msgs);
      if (newPredictiveVars != null)
        msgs = ((InternalEObject)newPredictiveVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__PREDICTIVE_VARS, null, msgs);
      msgs = basicSetPredictiveVars(newPredictiveVars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__PREDICTIVE_VARS, newPredictiveVars, newPredictiveVars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TargetVar getTargetVar()
  {
    return targetVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetVar(TargetVar newTargetVar, NotificationChain msgs)
  {
    TargetVar oldTargetVar = targetVar;
    targetVar = newTargetVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__TARGET_VAR, oldTargetVar, newTargetVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTargetVar(TargetVar newTargetVar)
  {
    if (newTargetVar != targetVar)
    {
      NotificationChain msgs = null;
      if (targetVar != null)
        msgs = ((InternalEObject)targetVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__TARGET_VAR, null, msgs);
      if (newTargetVar != null)
        msgs = ((InternalEObject)newTargetVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__TARGET_VAR, null, msgs);
      msgs = basicSetTargetVar(newTargetVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__TARGET_VAR, newTargetVar, newTargetVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algorithm getAlgorithm()
  {
    return algorithm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlgorithm(Algorithm newAlgorithm, NotificationChain msgs)
  {
    Algorithm oldAlgorithm = algorithm;
    algorithm = newAlgorithm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__ALGORITHM, oldAlgorithm, newAlgorithm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlgorithm(Algorithm newAlgorithm)
  {
    if (newAlgorithm != algorithm)
    {
      NotificationChain msgs = null;
      if (algorithm != null)
        msgs = ((InternalEObject)algorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__ALGORITHM, null, msgs);
      if (newAlgorithm != null)
        msgs = ((InternalEObject)newAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__ALGORITHM, null, msgs);
      msgs = basicSetAlgorithm(newAlgorithm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__ALGORITHM, newAlgorithm, newAlgorithm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ErrorMeasure getErrorMeasure()
  {
    return errorMeasure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetErrorMeasure(ErrorMeasure newErrorMeasure, NotificationChain msgs)
  {
    ErrorMeasure oldErrorMeasure = errorMeasure;
    errorMeasure = newErrorMeasure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__ERROR_MEASURE, oldErrorMeasure, newErrorMeasure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setErrorMeasure(ErrorMeasure newErrorMeasure)
  {
    if (newErrorMeasure != errorMeasure)
    {
      NotificationChain msgs = null;
      if (errorMeasure != null)
        msgs = ((InternalEObject)errorMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__ERROR_MEASURE, null, msgs);
      if (newErrorMeasure != null)
        msgs = ((InternalEObject)newErrorMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegPackage.ML_REGRESSION__ERROR_MEASURE, null, msgs);
      msgs = basicSetErrorMeasure(newErrorMeasure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegPackage.ML_REGRESSION__ERROR_MEASURE, newErrorMeasure, newErrorMeasure));
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
      case MLRegPackage.ML_REGRESSION__CSV_FILE:
        return basicSetCsvFile(null, msgs);
      case MLRegPackage.ML_REGRESSION__TEST_SIZE:
        return basicSetTestSize(null, msgs);
      case MLRegPackage.ML_REGRESSION__PREDICTIVE_VARS:
        return basicSetPredictiveVars(null, msgs);
      case MLRegPackage.ML_REGRESSION__TARGET_VAR:
        return basicSetTargetVar(null, msgs);
      case MLRegPackage.ML_REGRESSION__ALGORITHM:
        return basicSetAlgorithm(null, msgs);
      case MLRegPackage.ML_REGRESSION__ERROR_MEASURE:
        return basicSetErrorMeasure(null, msgs);
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
      case MLRegPackage.ML_REGRESSION__CSV_FILE:
        return getCsvFile();
      case MLRegPackage.ML_REGRESSION__TEST_SIZE:
        return getTestSize();
      case MLRegPackage.ML_REGRESSION__PREDICTIVE_VARS:
        return getPredictiveVars();
      case MLRegPackage.ML_REGRESSION__TARGET_VAR:
        return getTargetVar();
      case MLRegPackage.ML_REGRESSION__ALGORITHM:
        return getAlgorithm();
      case MLRegPackage.ML_REGRESSION__ERROR_MEASURE:
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
      case MLRegPackage.ML_REGRESSION__CSV_FILE:
        setCsvFile((CsvFile)newValue);
        return;
      case MLRegPackage.ML_REGRESSION__TEST_SIZE:
        setTestSize((TestSize)newValue);
        return;
      case MLRegPackage.ML_REGRESSION__PREDICTIVE_VARS:
        setPredictiveVars((PredictiveVars)newValue);
        return;
      case MLRegPackage.ML_REGRESSION__TARGET_VAR:
        setTargetVar((TargetVar)newValue);
        return;
      case MLRegPackage.ML_REGRESSION__ALGORITHM:
        setAlgorithm((Algorithm)newValue);
        return;
      case MLRegPackage.ML_REGRESSION__ERROR_MEASURE:
        setErrorMeasure((ErrorMeasure)newValue);
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
      case MLRegPackage.ML_REGRESSION__CSV_FILE:
        setCsvFile((CsvFile)null);
        return;
      case MLRegPackage.ML_REGRESSION__TEST_SIZE:
        setTestSize((TestSize)null);
        return;
      case MLRegPackage.ML_REGRESSION__PREDICTIVE_VARS:
        setPredictiveVars((PredictiveVars)null);
        return;
      case MLRegPackage.ML_REGRESSION__TARGET_VAR:
        setTargetVar((TargetVar)null);
        return;
      case MLRegPackage.ML_REGRESSION__ALGORITHM:
        setAlgorithm((Algorithm)null);
        return;
      case MLRegPackage.ML_REGRESSION__ERROR_MEASURE:
        setErrorMeasure((ErrorMeasure)null);
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
      case MLRegPackage.ML_REGRESSION__CSV_FILE:
        return csvFile != null;
      case MLRegPackage.ML_REGRESSION__TEST_SIZE:
        return testSize != null;
      case MLRegPackage.ML_REGRESSION__PREDICTIVE_VARS:
        return predictiveVars != null;
      case MLRegPackage.ML_REGRESSION__TARGET_VAR:
        return targetVar != null;
      case MLRegPackage.ML_REGRESSION__ALGORITHM:
        return algorithm != null;
      case MLRegPackage.ML_REGRESSION__ERROR_MEASURE:
        return errorMeasure != null;
    }
    return super.eIsSet(featureID);
  }

} //MlRegressionImpl
