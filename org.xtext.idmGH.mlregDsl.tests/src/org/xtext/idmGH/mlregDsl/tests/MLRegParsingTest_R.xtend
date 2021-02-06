package org.xtext.idmGH.mlregDsl.tests

import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.InjectWith
import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.xtext.idmGH.mlregDsl.mLReg.Model
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@ExtendWith(InjectionExtension)
@InjectWith(MLRegInjectorProvider)
class MLRegParsingTest_R {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void testLinearReg1() {
		val result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: RegressionTree, errorType: mean_squared_error}''');
		Assertions.assertNotNull(result)
		//val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
	}
}