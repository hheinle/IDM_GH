/**
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.mLReg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmGH.mlregDsl.mLReg.Algorithm#getAlgoName <em>Algo Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getAlgorithm()
 * @model
 * @generated
 */
public interface Algorithm extends EObject
{
  /**
   * Returns the value of the '<em><b>Algo Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.idmGH.mlregDsl.mLReg.AlgoName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algo Name</em>' attribute.
   * @see org.xtext.idmGH.mlregDsl.mLReg.AlgoName
   * @see #setAlgoName(AlgoName)
   * @see org.xtext.idmGH.mlregDsl.mLReg.MLRegPackage#getAlgorithm_AlgoName()
   * @model
   * @generated
   */
  AlgoName getAlgoName();

  /**
   * Sets the value of the '{@link org.xtext.idmGH.mlregDsl.mLReg.Algorithm#getAlgoName <em>Algo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algo Name</em>' attribute.
   * @see org.xtext.idmGH.mlregDsl.mLReg.AlgoName
   * @see #getAlgoName()
   * @generated
   */
  void setAlgoName(AlgoName value);

} // Algorithm