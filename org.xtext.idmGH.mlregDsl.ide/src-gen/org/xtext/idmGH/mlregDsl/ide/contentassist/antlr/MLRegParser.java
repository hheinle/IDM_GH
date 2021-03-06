/*
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.idmGH.mlregDsl.ide.contentassist.antlr.internal.InternalMLRegParser;
import org.xtext.idmGH.mlregDsl.services.MLRegGrammarAccess;

public class MLRegParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MLRegGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MLRegGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAlgoNameAccess().getAlternatives(), "rule__AlgoName__Alternatives");
			builder.put(grammarAccess.getErrorCalculationAccess().getAlternatives(), "rule__ErrorCalculation__Alternatives");
			builder.put(grammarAccess.getMlRegressionAccess().getGroup(), "rule__MlRegression__Group__0");
			builder.put(grammarAccess.getCsvFileAccess().getGroup(), "rule__CsvFile__Group__0");
			builder.put(grammarAccess.getTestSizeAccess().getGroup(), "rule__TestSize__Group__0");
			builder.put(grammarAccess.getPredictiveVarsAccess().getGroup(), "rule__PredictiveVars__Group__0");
			builder.put(grammarAccess.getPredictiveVarsAccess().getGroup_4(), "rule__PredictiveVars__Group_4__0");
			builder.put(grammarAccess.getTargetVarAccess().getGroup(), "rule__TargetVar__Group__0");
			builder.put(grammarAccess.getAlgorithmAccess().getGroup(), "rule__Algorithm__Group__0");
			builder.put(grammarAccess.getErrorMeasureAccess().getGroup(), "rule__ErrorMeasure__Group__0");
			builder.put(grammarAccess.getModelAccess().getMlRegressionAssignment(), "rule__Model__MlRegressionAssignment");
			builder.put(grammarAccess.getMlRegressionAccess().getCsvFileAssignment_2(), "rule__MlRegression__CsvFileAssignment_2");
			builder.put(grammarAccess.getMlRegressionAccess().getTestSizeAssignment_4(), "rule__MlRegression__TestSizeAssignment_4");
			builder.put(grammarAccess.getMlRegressionAccess().getPredictiveVarsAssignment_6(), "rule__MlRegression__PredictiveVarsAssignment_6");
			builder.put(grammarAccess.getMlRegressionAccess().getTargetVarAssignment_8(), "rule__MlRegression__TargetVarAssignment_8");
			builder.put(grammarAccess.getMlRegressionAccess().getAlgorithmAssignment_10(), "rule__MlRegression__AlgorithmAssignment_10");
			builder.put(grammarAccess.getMlRegressionAccess().getErrorMeasureAssignment_12(), "rule__MlRegression__ErrorMeasureAssignment_12");
			builder.put(grammarAccess.getCsvFileAccess().getCsvFileAssignment_2(), "rule__CsvFile__CsvFileAssignment_2");
			builder.put(grammarAccess.getTestSizeAccess().getTestSizeAssignment_3(), "rule__TestSize__TestSizeAssignment_3");
			builder.put(grammarAccess.getPredictiveVarsAccess().getPredictiveVarAssignment_3(), "rule__PredictiveVars__PredictiveVarAssignment_3");
			builder.put(grammarAccess.getPredictiveVarsAccess().getPredictiveVarAssignment_4_1(), "rule__PredictiveVars__PredictiveVarAssignment_4_1");
			builder.put(grammarAccess.getTargetVarAccess().getTargetVarAssignment_2(), "rule__TargetVar__TargetVarAssignment_2");
			builder.put(grammarAccess.getAlgorithmAccess().getAlgoNameAssignment_2(), "rule__Algorithm__AlgoNameAssignment_2");
			builder.put(grammarAccess.getErrorMeasureAccess().getErrorMeasureAssignment_2(), "rule__ErrorMeasure__ErrorMeasureAssignment_2");
			builder.put(grammarAccess.getColVarAccess().getIdColAssignment(), "rule__ColVar__IdColAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MLRegGrammarAccess grammarAccess;

	@Override
	protected InternalMLRegParser createParser() {
		InternalMLRegParser result = new InternalMLRegParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MLRegGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MLRegGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
