/**
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.mLReg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.ErrorMeasure#getErrorMeasure <em>Error Measure</em>}</li>
 * </ul>
 *
 * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getErrorMeasure()
 * @model
 * @generated
 */
public interface ErrorMeasure extends EObject
{
  /**
   * Returns the value of the '<em><b>Error Measure</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.idmGH.mlregDsl.mLReg.ErrorCalculation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Measure</em>' attribute.
   * @see org.xtext.idmGH.mlregDsl.mLReg.ErrorCalculation
   * @see #setErrorMeasure(ErrorCalculation)
   * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getErrorMeasure_ErrorMeasure()
   * @model
   * @generated
   */
  ErrorCalculation getErrorMeasure();

  /**
   * Sets the value of the '{@link org.xtext.idmGH.mlregDsl.mLReg.ErrorMeasure#getErrorMeasure <em>Error Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Measure</em>' attribute.
   * @see org.xtext.idmGH.mlregDsl.mLReg.ErrorCalculation
   * @see #getErrorMeasure()
   * @generated
   */
  void setErrorMeasure(ErrorCalculation value);

} // ErrorMeasure
