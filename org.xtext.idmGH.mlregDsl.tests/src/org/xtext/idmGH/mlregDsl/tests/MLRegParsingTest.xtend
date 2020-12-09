/*
 * generated by Xtext 2.23.0
 */
package org.xtext.idmGH.mlregDsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.idmGH.mlregDsl.mLReg.Model

@ExtendWith(InjectionExtension)
@InjectWith(MLRegInjectorProvider)
class MLRegParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void testLinearReg1() {
		val result = parseHelper.parse('''
			regression{
				file: "datasets/salary_data.csv",
				testSize : 3,
				predictiveVariables : {0},
				 targetVariable: 1,
				 algorithm: Linear,
				 errorType: mean_squared_error
			}		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		val PythonCompiler cmpPython = new PythonCompiler(result)
		cmpPython.compileAndRun
	}
	
	@Test
	def void testLinearReg2() {
		val result = parseHelper.parse('''
			regression{
				file: "datasets/ozone.csv",
				testSize : 3,
				predictiveVariables : {1,2,3,4,5,6,7,8,9,10},
				 targetVariable: 0,
				 algorithm: Linear,
				 errorType: r2_score
			}		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		val PythonCompiler cmpPython = new PythonCompiler(result)
		cmpPython.compileAndRun
	}
	
	@Test
	def void testLinearReg3() {
		val result = parseHelper.parse('''
			regression{
				file: "datasets/ozone.csv",
				testSize : 3,
				predictiveVariables : {1,2,9,10},
				 targetVariable: 0,
				 algorithm: Linear,
				 errorType: r2_score
			}		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		val PythonCompiler cmpPython = new PythonCompiler(result)
		cmpPython.compileAndRun
	}
	
	@Test
	def void testSVMReg() {
		val result = parseHelper.parse('''
			regression{
				file: "datasets/salary_data.csv",
				testSize : 3,
				predictiveVariables : {0},
				 targetVariable: 1,
				 algorithm: SVM,
				 errorType: mean_squared_error
			}		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		val PythonCompiler cmpPython = new PythonCompiler(result)
		cmpPython.compileAndRun
	}
	
	@Test
	def void testTreeReg() {
		val result = parseHelper.parse('''
			regression{
				file: "datasets/salary_data.csv",
				testSize : 3,
				predictiveVariables : {0},
				 targetVariable: 1,
				 algorithm: RegressionTree,
				 errorType: mean_squared_error
			}		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		
		val PythonCompiler cmpPython = new PythonCompiler(result)
		cmpPython.compileAndRun
	}
}
