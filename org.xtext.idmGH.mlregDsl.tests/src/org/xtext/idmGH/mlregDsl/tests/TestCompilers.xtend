package org.xtext.idmGH.mlregDsl.tests

import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.InjectWith
import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.xtext.idmGH.mlregDsl.mLReg.Model
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.Before
import java.nio.file.Files
import java.nio.file.Paths
import java.io.File
import java.io.BufferedWriter
import java.io.FileWriter
import com.google.common.base.Charsets
import java.nio.charset.Charset
import org.junit.jupiter.api.BeforeAll
import static extension com.google.common.io.Files.*

@ExtendWith(InjectionExtension)
@InjectWith(MLRegInjectorProvider)
class TestCompilers {
	@Inject
	ParseHelper<Model> parseHelper
	
	
	@BeforeAll
	def static void init() {
		Files.newBufferedWriter(Paths.get("statistics/benchmark_R.csv"))
		asCharSink(new File('statistics/benchmark_R.csv'), Charsets.UTF_8).write('Algorithme;Variable(s) predictrice(s); Variable cible; Duree (ms); Type Erreur; Erreur\n')
		Files.newBufferedWriter(Paths.get("statistics/benchmark_Pyth.csv"))
		asCharSink(new File('statistics/benchmark_Pyth.csv'), Charsets.UTF_8).write('Algorithme,Variable(s) predictrice(s), Variable cible, Duree (ms), Type Erreur, Erreur\n')
	
	}
	
	

	
	@Test
	def void testLinearRegRmseOnePredictiveVar() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: Linear, errorType: rmse}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1}, targetVariable: 0, algorithm: Linear, errorType: rmse}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testLinearRegMaeOnePredictiveVar() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: Linear, errorType: mae}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1}, targetVariable: 0, algorithm: Linear, errorType: mae}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testLinearRegR2OnePredictiveVar() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: Linear, errorType: r2}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1}, targetVariable: 0, algorithm: Linear, errorType: r2}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testSvmRmseOnePredictiveVar() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: SVM, errorType: rmse}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1}, targetVariable: 0, algorithm: SVM, errorType: rmse}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testSvmMaeOnePredictiveVar() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: SVM, errorType: mae}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1}, targetVariable: 0, algorithm: SVM, errorType: mae}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testSvmR2OnePredictiveVar() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: SVM, errorType: r2}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1}, targetVariable: 0, algorithm: SVM, errorType: r2}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testRegressionTreeRmseOnePredictiveVar() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: RegressionTree, errorType: rmse}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1}, targetVariable: 0, algorithm: RegressionTree, errorType: rmse}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testRegressionTreeMaeOnePredictiveVar() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: RegressionTree, errorType: mae}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1}, targetVariable: 0, algorithm: RegressionTree, errorType: mae}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testRegressionTreeR2OnePredictiveVar() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: RegressionTree, errorType: r2}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1}, targetVariable: 0, algorithm: RegressionTree, errorType: r2}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
		@Test
	def void testLinearRegRmseMultiplePredictiveVars() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2,3,10,11}, targetVariable: 1, algorithm: Linear, errorType: rmse}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1,2,9,10}, targetVariable: 0, algorithm: Linear, errorType: rmse}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testLinearRegMaeMultiplePredictiveVars() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2,3,10,11}, targetVariable: 1, algorithm: Linear, errorType: mae}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1,2,9,10}, targetVariable: 0, algorithm: Linear, errorType: mae}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testLinearRegR2MultiplePredictiveVars() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2,3,10,11}, targetVariable: 1, algorithm: Linear, errorType: r2}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1,2,9,10}, targetVariable: 0, algorithm: Linear, errorType: r2}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testSvmRmseMultiplePredictiveVars() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2,3,10,11}, targetVariable: 1, algorithm: SVM, errorType: rmse}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1,2,9,10}, targetVariable: 0, algorithm: SVM, errorType: rmse}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testSvmMaeMultiplePredictiveVars() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2,3,10,11}, targetVariable: 1, algorithm: SVM, errorType: mae}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1,2,9,10}, targetVariable: 0, algorithm: SVM, errorType: mae}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testSvmR2MutliplePredictiveVars() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2,3,10,11}, targetVariable: 1, algorithm: SVM, errorType: r2}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1,2,9,10}, targetVariable: 0, algorithm: SVM, errorType: r2}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testRegressionTreeRmseMultiplePredictiveVars() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2,3,10,11}, targetVariable: 1, algorithm: RegressionTree, errorType: rmse}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1,2,9,10}, targetVariable: 0, algorithm: RegressionTree, errorType: rmse}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testRegressionTreeMaeMultiplePredictiveVars() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2,3,10,11}, targetVariable: 1, algorithm: RegressionTree, errorType: mae}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1,2,9,10}, targetVariable: 0, algorithm: RegressionTree, errorType: mae}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
	@Test
	def void testRegressionTreeR2MultiplePredictiveVars() {
		var result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {2,3,10,11}, targetVariable: 1, algorithm: RegressionTree, errorType: r2}''')
		Assertions.assertNotNull(result)
		var errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val RCompiler cmpR = new RCompiler(result)
		cmpR.compileAndRun
		result = this.parseHelper.parse('''regression {file: "datasets/ozone.csv", testSize: 30, predictiveVariables: {1,2,9,10}, targetVariable: 0, algorithm: RegressionTree, errorType: r2}''')
		Assertions.assertNotNull(result)
		errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: errors.join(", ")''')
		val PythonCompiler cmpPyth = new PythonCompiler(result)
		cmpPyth.compileAndRun();
	}
	
}