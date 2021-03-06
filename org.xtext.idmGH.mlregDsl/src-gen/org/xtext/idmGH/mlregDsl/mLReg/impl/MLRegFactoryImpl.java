/**
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.mLReg.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.idmGH.mlregDsl.mLReg.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MLRegFactoryImpl extends EFactoryImpl implements MLRegFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MLRegFactory init()
  {
    try
    {
      MLRegFactory theMLRegFactory = (MLRegFactory)EPackage.Registry.INSTANCE.getEFactory(MLRegPackage.eNS_URI);
      if (theMLRegFactory != null)
      {
        return theMLRegFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MLRegFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MLRegFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MLRegPackage.MODEL: return createModel();
      case MLRegPackage.ML_REGRESSION: return createMlRegression();
      case MLRegPackage.CSV_FILE: return createCsvFile();
      case MLRegPackage.TEST_SIZE: return createTestSize();
      case MLRegPackage.PREDICTIVE_VARS: return createPredictiveVars();
      case MLRegPackage.TARGET_VAR: return createTargetVar();
      case MLRegPackage.ALGORITHM: return createAlgorithm();
      case MLRegPackage.ERROR_MEASURE: return createErrorMeasure();
      case MLRegPackage.COL_VAR: return createColVar();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MLRegPackage.ALGO_NAME:
        return createAlgoNameFromString(eDataType, initialValue);
      case MLRegPackage.ERROR_CALCULATION:
        return createErrorCalculationFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MLRegPackage.ALGO_NAME:
        return convertAlgoNameToString(eDataType, instanceValue);
      case MLRegPackage.ERROR_CALCULATION:
        return convertErrorCalculationToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MlRegression createMlRegression()
  {
    MlRegressionImpl mlRegression = new MlRegressionImpl();
    return mlRegression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CsvFile createCsvFile()
  {
    CsvFileImpl csvFile = new CsvFileImpl();
    return csvFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestSize createTestSize()
  {
    TestSizeImpl testSize = new TestSizeImpl();
    return testSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PredictiveVars createPredictiveVars()
  {
    PredictiveVarsImpl predictiveVars = new PredictiveVarsImpl();
    return predictiveVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TargetVar createTargetVar()
  {
    TargetVarImpl targetVar = new TargetVarImpl();
    return targetVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algorithm createAlgorithm()
  {
    AlgorithmImpl algorithm = new AlgorithmImpl();
    return algorithm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ErrorMeasure createErrorMeasure()
  {
    ErrorMeasureImpl errorMeasure = new ErrorMeasureImpl();
    return errorMeasure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColVar createColVar()
  {
    ColVarImpl colVar = new ColVarImpl();
    return colVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlgoName createAlgoNameFromString(EDataType eDataType, String initialValue)
  {
    AlgoName result = AlgoName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAlgoNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorCalculation createErrorCalculationFromString(EDataType eDataType, String initialValue)
  {
    ErrorCalculation result = ErrorCalculation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertErrorCalculationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MLRegPackage getMLRegPackage()
  {
    return (MLRegPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MLRegPackage getPackage()
  {
    return MLRegPackage.eINSTANCE;
  }

} //MLRegFactoryImpl
