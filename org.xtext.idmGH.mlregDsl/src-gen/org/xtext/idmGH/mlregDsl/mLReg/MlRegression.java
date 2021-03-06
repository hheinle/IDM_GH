/**
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.mLReg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ml Regression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getCsvFile <em>Csv File</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getTestSize <em>Test Size</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getPredictiveVars <em>Predictive Vars</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getTargetVar <em>Target Var</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getErrorMeasure <em>Error Measure</em>}</li>
 * </ul>
 *
 * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getMlRegression()
 * @model
 * @generated
 */
public interface MlRegression extends EObject
{
  /**
   * Returns the value of the '<em><b>Csv File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Csv File</em>' containment reference.
   * @see #setCsvFile(CsvFile)
   * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getMlRegression_CsvFile()
   * @model containment="true"
   * @generated
   */
  CsvFile getCsvFile();

  /**
   * Sets the value of the '{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getCsvFile <em>Csv File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Csv File</em>' containment reference.
   * @see #getCsvFile()
   * @generated
   */
  void setCsvFile(CsvFile value);

  /**
   * Returns the value of the '<em><b>Test Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Size</em>' containment reference.
   * @see #setTestSize(TestSize)
   * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getMlRegression_TestSize()
   * @model containment="true"
   * @generated
   */
  TestSize getTestSize();

  /**
   * Sets the value of the '{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getTestSize <em>Test Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Size</em>' containment reference.
   * @see #getTestSize()
   * @generated
   */
  void setTestSize(TestSize value);

  /**
   * Returns the value of the '<em><b>Predictive Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predictive Vars</em>' containment reference.
   * @see #setPredictiveVars(PredictiveVars)
   * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getMlRegression_PredictiveVars()
   * @model containment="true"
   * @generated
   */
  PredictiveVars getPredictiveVars();

  /**
   * Sets the value of the '{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getPredictiveVars <em>Predictive Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predictive Vars</em>' containment reference.
   * @see #getPredictiveVars()
   * @generated
   */
  void setPredictiveVars(PredictiveVars value);

  /**
   * Returns the value of the '<em><b>Target Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Var</em>' containment reference.
   * @see #setTargetVar(TargetVar)
   * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getMlRegression_TargetVar()
   * @model containment="true"
   * @generated
   */
  TargetVar getTargetVar();

  /**
   * Sets the value of the '{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getTargetVar <em>Target Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Var</em>' containment reference.
   * @see #getTargetVar()
   * @generated
   */
  void setTargetVar(TargetVar value);

  /**
   * Returns the value of the '<em><b>Algorithm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithm</em>' containment reference.
   * @see #setAlgorithm(Algorithm)
   * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getMlRegression_Algorithm()
   * @model containment="true"
   * @generated
   */
  Algorithm getAlgorithm();

  /**
   * Sets the value of the '{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getAlgorithm <em>Algorithm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithm</em>' containment reference.
   * @see #getAlgorithm()
   * @generated
   */
  void setAlgorithm(Algorithm value);

  /**
   * Returns the value of the '<em><b>Error Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Measure</em>' containment reference.
   * @see #setErrorMeasure(ErrorMeasure)
   * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getMlRegression_ErrorMeasure()
   * @model containment="true"
   * @generated
   */
  ErrorMeasure getErrorMeasure();

  /**
   * Sets the value of the '{@link org.xtext.idmGH.mlregDsl.mLReg.MlRegression#getErrorMeasure <em>Error Measure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Measure</em>' containment reference.
   * @see #getErrorMeasure()
   * @generated
   */
  void setErrorMeasure(ErrorMeasure value);

} // MlRegression
