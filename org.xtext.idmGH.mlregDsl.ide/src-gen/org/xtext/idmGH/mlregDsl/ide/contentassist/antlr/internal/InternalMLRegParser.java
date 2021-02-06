package org.xtext.idmGH.mlregDsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.idmGH.mlregDsl.services.MLRegGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMLRegParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RegressionTree'", "'SVM'", "'Linear'", "'mean_squared_error'", "'explained_variance_score'", "'r2_score'", "'regression'", "'{'", "','", "'}'", "'file'", "':'", "'testSize'", "'predictiveVariables'", "'targetVariable'", "'algorithm'", "'errorType'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMLRegParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMLRegParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMLRegParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMLReg.g"; }


    	private MLRegGrammarAccess grammarAccess;

    	public void setGrammarAccess(MLRegGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMLReg.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMLReg.g:54:1: ( ruleModel EOF )
            // InternalMLReg.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMLReg.g:62:1: ruleModel : ( ( rule__Model__MlRegressionAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:66:2: ( ( ( rule__Model__MlRegressionAssignment ) ) )
            // InternalMLReg.g:67:2: ( ( rule__Model__MlRegressionAssignment ) )
            {
            // InternalMLReg.g:67:2: ( ( rule__Model__MlRegressionAssignment ) )
            // InternalMLReg.g:68:3: ( rule__Model__MlRegressionAssignment )
            {
             before(grammarAccess.getModelAccess().getMlRegressionAssignment()); 
            // InternalMLReg.g:69:3: ( rule__Model__MlRegressionAssignment )
            // InternalMLReg.g:69:4: rule__Model__MlRegressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__MlRegressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMlRegressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMlRegression"
    // InternalMLReg.g:78:1: entryRuleMlRegression : ruleMlRegression EOF ;
    public final void entryRuleMlRegression() throws RecognitionException {
        try {
            // InternalMLReg.g:79:1: ( ruleMlRegression EOF )
            // InternalMLReg.g:80:1: ruleMlRegression EOF
            {
             before(grammarAccess.getMlRegressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMlRegression();

            state._fsp--;

             after(grammarAccess.getMlRegressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMlRegression"


    // $ANTLR start "ruleMlRegression"
    // InternalMLReg.g:87:1: ruleMlRegression : ( ( rule__MlRegression__Group__0 ) ) ;
    public final void ruleMlRegression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:91:2: ( ( ( rule__MlRegression__Group__0 ) ) )
            // InternalMLReg.g:92:2: ( ( rule__MlRegression__Group__0 ) )
            {
            // InternalMLReg.g:92:2: ( ( rule__MlRegression__Group__0 ) )
            // InternalMLReg.g:93:3: ( rule__MlRegression__Group__0 )
            {
             before(grammarAccess.getMlRegressionAccess().getGroup()); 
            // InternalMLReg.g:94:3: ( rule__MlRegression__Group__0 )
            // InternalMLReg.g:94:4: rule__MlRegression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMlRegressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMlRegression"


    // $ANTLR start "entryRuleCsvFile"
    // InternalMLReg.g:103:1: entryRuleCsvFile : ruleCsvFile EOF ;
    public final void entryRuleCsvFile() throws RecognitionException {
        try {
            // InternalMLReg.g:104:1: ( ruleCsvFile EOF )
            // InternalMLReg.g:105:1: ruleCsvFile EOF
            {
             before(grammarAccess.getCsvFileRule()); 
            pushFollow(FOLLOW_1);
            ruleCsvFile();

            state._fsp--;

             after(grammarAccess.getCsvFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCsvFile"


    // $ANTLR start "ruleCsvFile"
    // InternalMLReg.g:112:1: ruleCsvFile : ( ( rule__CsvFile__Group__0 ) ) ;
    public final void ruleCsvFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:116:2: ( ( ( rule__CsvFile__Group__0 ) ) )
            // InternalMLReg.g:117:2: ( ( rule__CsvFile__Group__0 ) )
            {
            // InternalMLReg.g:117:2: ( ( rule__CsvFile__Group__0 ) )
            // InternalMLReg.g:118:3: ( rule__CsvFile__Group__0 )
            {
             before(grammarAccess.getCsvFileAccess().getGroup()); 
            // InternalMLReg.g:119:3: ( rule__CsvFile__Group__0 )
            // InternalMLReg.g:119:4: rule__CsvFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CsvFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCsvFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCsvFile"


    // $ANTLR start "entryRuleTestSize"
    // InternalMLReg.g:128:1: entryRuleTestSize : ruleTestSize EOF ;
    public final void entryRuleTestSize() throws RecognitionException {
        try {
            // InternalMLReg.g:129:1: ( ruleTestSize EOF )
            // InternalMLReg.g:130:1: ruleTestSize EOF
            {
             before(grammarAccess.getTestSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleTestSize();

            state._fsp--;

             after(grammarAccess.getTestSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestSize"


    // $ANTLR start "ruleTestSize"
    // InternalMLReg.g:137:1: ruleTestSize : ( ( rule__TestSize__Group__0 ) ) ;
    public final void ruleTestSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:141:2: ( ( ( rule__TestSize__Group__0 ) ) )
            // InternalMLReg.g:142:2: ( ( rule__TestSize__Group__0 ) )
            {
            // InternalMLReg.g:142:2: ( ( rule__TestSize__Group__0 ) )
            // InternalMLReg.g:143:3: ( rule__TestSize__Group__0 )
            {
             before(grammarAccess.getTestSizeAccess().getGroup()); 
            // InternalMLReg.g:144:3: ( rule__TestSize__Group__0 )
            // InternalMLReg.g:144:4: rule__TestSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestSize"


    // $ANTLR start "entryRulePredictiveVars"
    // InternalMLReg.g:153:1: entryRulePredictiveVars : rulePredictiveVars EOF ;
    public final void entryRulePredictiveVars() throws RecognitionException {
        try {
            // InternalMLReg.g:154:1: ( rulePredictiveVars EOF )
            // InternalMLReg.g:155:1: rulePredictiveVars EOF
            {
             before(grammarAccess.getPredictiveVarsRule()); 
            pushFollow(FOLLOW_1);
            rulePredictiveVars();

            state._fsp--;

             after(grammarAccess.getPredictiveVarsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredictiveVars"


    // $ANTLR start "rulePredictiveVars"
    // InternalMLReg.g:162:1: rulePredictiveVars : ( ( rule__PredictiveVars__Group__0 ) ) ;
    public final void rulePredictiveVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:166:2: ( ( ( rule__PredictiveVars__Group__0 ) ) )
            // InternalMLReg.g:167:2: ( ( rule__PredictiveVars__Group__0 ) )
            {
            // InternalMLReg.g:167:2: ( ( rule__PredictiveVars__Group__0 ) )
            // InternalMLReg.g:168:3: ( rule__PredictiveVars__Group__0 )
            {
             before(grammarAccess.getPredictiveVarsAccess().getGroup()); 
            // InternalMLReg.g:169:3: ( rule__PredictiveVars__Group__0 )
            // InternalMLReg.g:169:4: rule__PredictiveVars__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveVarsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredictiveVars"


    // $ANTLR start "entryRuleTargetVar"
    // InternalMLReg.g:178:1: entryRuleTargetVar : ruleTargetVar EOF ;
    public final void entryRuleTargetVar() throws RecognitionException {
        try {
            // InternalMLReg.g:179:1: ( ruleTargetVar EOF )
            // InternalMLReg.g:180:1: ruleTargetVar EOF
            {
             before(grammarAccess.getTargetVarRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetVar();

            state._fsp--;

             after(grammarAccess.getTargetVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargetVar"


    // $ANTLR start "ruleTargetVar"
    // InternalMLReg.g:187:1: ruleTargetVar : ( ( rule__TargetVar__Group__0 ) ) ;
    public final void ruleTargetVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:191:2: ( ( ( rule__TargetVar__Group__0 ) ) )
            // InternalMLReg.g:192:2: ( ( rule__TargetVar__Group__0 ) )
            {
            // InternalMLReg.g:192:2: ( ( rule__TargetVar__Group__0 ) )
            // InternalMLReg.g:193:3: ( rule__TargetVar__Group__0 )
            {
             before(grammarAccess.getTargetVarAccess().getGroup()); 
            // InternalMLReg.g:194:3: ( rule__TargetVar__Group__0 )
            // InternalMLReg.g:194:4: rule__TargetVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetVar"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalMLReg.g:203:1: entryRuleAlgorithm : ruleAlgorithm EOF ;
    public final void entryRuleAlgorithm() throws RecognitionException {
        try {
            // InternalMLReg.g:204:1: ( ruleAlgorithm EOF )
            // InternalMLReg.g:205:1: ruleAlgorithm EOF
            {
             before(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getAlgorithmRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalMLReg.g:212:1: ruleAlgorithm : ( ( rule__Algorithm__Group__0 ) ) ;
    public final void ruleAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:216:2: ( ( ( rule__Algorithm__Group__0 ) ) )
            // InternalMLReg.g:217:2: ( ( rule__Algorithm__Group__0 ) )
            {
            // InternalMLReg.g:217:2: ( ( rule__Algorithm__Group__0 ) )
            // InternalMLReg.g:218:3: ( rule__Algorithm__Group__0 )
            {
             before(grammarAccess.getAlgorithmAccess().getGroup()); 
            // InternalMLReg.g:219:3: ( rule__Algorithm__Group__0 )
            // InternalMLReg.g:219:4: rule__Algorithm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleErrorMeasure"
    // InternalMLReg.g:228:1: entryRuleErrorMeasure : ruleErrorMeasure EOF ;
    public final void entryRuleErrorMeasure() throws RecognitionException {
        try {
            // InternalMLReg.g:229:1: ( ruleErrorMeasure EOF )
            // InternalMLReg.g:230:1: ruleErrorMeasure EOF
            {
             before(grammarAccess.getErrorMeasureRule()); 
            pushFollow(FOLLOW_1);
            ruleErrorMeasure();

            state._fsp--;

             after(grammarAccess.getErrorMeasureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleErrorMeasure"


    // $ANTLR start "ruleErrorMeasure"
    // InternalMLReg.g:237:1: ruleErrorMeasure : ( ( rule__ErrorMeasure__Group__0 ) ) ;
    public final void ruleErrorMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:241:2: ( ( ( rule__ErrorMeasure__Group__0 ) ) )
            // InternalMLReg.g:242:2: ( ( rule__ErrorMeasure__Group__0 ) )
            {
            // InternalMLReg.g:242:2: ( ( rule__ErrorMeasure__Group__0 ) )
            // InternalMLReg.g:243:3: ( rule__ErrorMeasure__Group__0 )
            {
             before(grammarAccess.getErrorMeasureAccess().getGroup()); 
            // InternalMLReg.g:244:3: ( rule__ErrorMeasure__Group__0 )
            // InternalMLReg.g:244:4: rule__ErrorMeasure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ErrorMeasure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getErrorMeasureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleErrorMeasure"


    // $ANTLR start "entryRuleColVar"
    // InternalMLReg.g:253:1: entryRuleColVar : ruleColVar EOF ;
    public final void entryRuleColVar() throws RecognitionException {
        try {
            // InternalMLReg.g:254:1: ( ruleColVar EOF )
            // InternalMLReg.g:255:1: ruleColVar EOF
            {
             before(grammarAccess.getColVarRule()); 
            pushFollow(FOLLOW_1);
            ruleColVar();

            state._fsp--;

             after(grammarAccess.getColVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColVar"


    // $ANTLR start "ruleColVar"
    // InternalMLReg.g:262:1: ruleColVar : ( ( rule__ColVar__IdColAssignment ) ) ;
    public final void ruleColVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:266:2: ( ( ( rule__ColVar__IdColAssignment ) ) )
            // InternalMLReg.g:267:2: ( ( rule__ColVar__IdColAssignment ) )
            {
            // InternalMLReg.g:267:2: ( ( rule__ColVar__IdColAssignment ) )
            // InternalMLReg.g:268:3: ( rule__ColVar__IdColAssignment )
            {
             before(grammarAccess.getColVarAccess().getIdColAssignment()); 
            // InternalMLReg.g:269:3: ( rule__ColVar__IdColAssignment )
            // InternalMLReg.g:269:4: rule__ColVar__IdColAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColVar__IdColAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColVarAccess().getIdColAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColVar"


    // $ANTLR start "ruleAlgoName"
    // InternalMLReg.g:278:1: ruleAlgoName : ( ( rule__AlgoName__Alternatives ) ) ;
    public final void ruleAlgoName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:282:1: ( ( ( rule__AlgoName__Alternatives ) ) )
            // InternalMLReg.g:283:2: ( ( rule__AlgoName__Alternatives ) )
            {
            // InternalMLReg.g:283:2: ( ( rule__AlgoName__Alternatives ) )
            // InternalMLReg.g:284:3: ( rule__AlgoName__Alternatives )
            {
             before(grammarAccess.getAlgoNameAccess().getAlternatives()); 
            // InternalMLReg.g:285:3: ( rule__AlgoName__Alternatives )
            // InternalMLReg.g:285:4: rule__AlgoName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AlgoName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlgoNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgoName"


    // $ANTLR start "ruleErrorCalculation"
    // InternalMLReg.g:294:1: ruleErrorCalculation : ( ( rule__ErrorCalculation__Alternatives ) ) ;
    public final void ruleErrorCalculation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:298:1: ( ( ( rule__ErrorCalculation__Alternatives ) ) )
            // InternalMLReg.g:299:2: ( ( rule__ErrorCalculation__Alternatives ) )
            {
            // InternalMLReg.g:299:2: ( ( rule__ErrorCalculation__Alternatives ) )
            // InternalMLReg.g:300:3: ( rule__ErrorCalculation__Alternatives )
            {
             before(grammarAccess.getErrorCalculationAccess().getAlternatives()); 
            // InternalMLReg.g:301:3: ( rule__ErrorCalculation__Alternatives )
            // InternalMLReg.g:301:4: rule__ErrorCalculation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ErrorCalculation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getErrorCalculationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleErrorCalculation"


    // $ANTLR start "rule__AlgoName__Alternatives"
    // InternalMLReg.g:309:1: rule__AlgoName__Alternatives : ( ( ( 'RegressionTree' ) ) | ( ( 'SVM' ) ) | ( ( 'Linear' ) ) );
    public final void rule__AlgoName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:313:1: ( ( ( 'RegressionTree' ) ) | ( ( 'SVM' ) ) | ( ( 'Linear' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMLReg.g:314:2: ( ( 'RegressionTree' ) )
                    {
                    // InternalMLReg.g:314:2: ( ( 'RegressionTree' ) )
                    // InternalMLReg.g:315:3: ( 'RegressionTree' )
                    {
                     before(grammarAccess.getAlgoNameAccess().getRegressionTreeEnumLiteralDeclaration_0()); 
                    // InternalMLReg.g:316:3: ( 'RegressionTree' )
                    // InternalMLReg.g:316:4: 'RegressionTree'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgoNameAccess().getRegressionTreeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLReg.g:320:2: ( ( 'SVM' ) )
                    {
                    // InternalMLReg.g:320:2: ( ( 'SVM' ) )
                    // InternalMLReg.g:321:3: ( 'SVM' )
                    {
                     before(grammarAccess.getAlgoNameAccess().getSVMEnumLiteralDeclaration_1()); 
                    // InternalMLReg.g:322:3: ( 'SVM' )
                    // InternalMLReg.g:322:4: 'SVM'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgoNameAccess().getSVMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLReg.g:326:2: ( ( 'Linear' ) )
                    {
                    // InternalMLReg.g:326:2: ( ( 'Linear' ) )
                    // InternalMLReg.g:327:3: ( 'Linear' )
                    {
                     before(grammarAccess.getAlgoNameAccess().getLinearEnumLiteralDeclaration_2()); 
                    // InternalMLReg.g:328:3: ( 'Linear' )
                    // InternalMLReg.g:328:4: 'Linear'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgoNameAccess().getLinearEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgoName__Alternatives"


    // $ANTLR start "rule__ErrorCalculation__Alternatives"
    // InternalMLReg.g:336:1: rule__ErrorCalculation__Alternatives : ( ( ( 'mean_squared_error' ) ) | ( ( 'explained_variance_score' ) ) | ( ( 'r2_score' ) ) );
    public final void rule__ErrorCalculation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:340:1: ( ( ( 'mean_squared_error' ) ) | ( ( 'explained_variance_score' ) ) | ( ( 'r2_score' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMLReg.g:341:2: ( ( 'mean_squared_error' ) )
                    {
                    // InternalMLReg.g:341:2: ( ( 'mean_squared_error' ) )
                    // InternalMLReg.g:342:3: ( 'mean_squared_error' )
                    {
                     before(grammarAccess.getErrorCalculationAccess().getMean_squared_errorEnumLiteralDeclaration_0()); 
                    // InternalMLReg.g:343:3: ( 'mean_squared_error' )
                    // InternalMLReg.g:343:4: 'mean_squared_error'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getErrorCalculationAccess().getMean_squared_errorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLReg.g:347:2: ( ( 'explained_variance_score' ) )
                    {
                    // InternalMLReg.g:347:2: ( ( 'explained_variance_score' ) )
                    // InternalMLReg.g:348:3: ( 'explained_variance_score' )
                    {
                     before(grammarAccess.getErrorCalculationAccess().getExplained_variance_scoreEnumLiteralDeclaration_1()); 
                    // InternalMLReg.g:349:3: ( 'explained_variance_score' )
                    // InternalMLReg.g:349:4: 'explained_variance_score'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getErrorCalculationAccess().getExplained_variance_scoreEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLReg.g:353:2: ( ( 'r2_score' ) )
                    {
                    // InternalMLReg.g:353:2: ( ( 'r2_score' ) )
                    // InternalMLReg.g:354:3: ( 'r2_score' )
                    {
                     before(grammarAccess.getErrorCalculationAccess().getR2_scoreEnumLiteralDeclaration_2()); 
                    // InternalMLReg.g:355:3: ( 'r2_score' )
                    // InternalMLReg.g:355:4: 'r2_score'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getErrorCalculationAccess().getR2_scoreEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorCalculation__Alternatives"


    // $ANTLR start "rule__MlRegression__Group__0"
    // InternalMLReg.g:363:1: rule__MlRegression__Group__0 : rule__MlRegression__Group__0__Impl rule__MlRegression__Group__1 ;
    public final void rule__MlRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:367:1: ( rule__MlRegression__Group__0__Impl rule__MlRegression__Group__1 )
            // InternalMLReg.g:368:2: rule__MlRegression__Group__0__Impl rule__MlRegression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MlRegression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__0"


    // $ANTLR start "rule__MlRegression__Group__0__Impl"
    // InternalMLReg.g:375:1: rule__MlRegression__Group__0__Impl : ( 'regression' ) ;
    public final void rule__MlRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:379:1: ( ( 'regression' ) )
            // InternalMLReg.g:380:1: ( 'regression' )
            {
            // InternalMLReg.g:380:1: ( 'regression' )
            // InternalMLReg.g:381:2: 'regression'
            {
             before(grammarAccess.getMlRegressionAccess().getRegressionKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMlRegressionAccess().getRegressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__0__Impl"


    // $ANTLR start "rule__MlRegression__Group__1"
    // InternalMLReg.g:390:1: rule__MlRegression__Group__1 : rule__MlRegression__Group__1__Impl rule__MlRegression__Group__2 ;
    public final void rule__MlRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:394:1: ( rule__MlRegression__Group__1__Impl rule__MlRegression__Group__2 )
            // InternalMLReg.g:395:2: rule__MlRegression__Group__1__Impl rule__MlRegression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MlRegression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__1"


    // $ANTLR start "rule__MlRegression__Group__1__Impl"
    // InternalMLReg.g:402:1: rule__MlRegression__Group__1__Impl : ( '{' ) ;
    public final void rule__MlRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:406:1: ( ( '{' ) )
            // InternalMLReg.g:407:1: ( '{' )
            {
            // InternalMLReg.g:407:1: ( '{' )
            // InternalMLReg.g:408:2: '{'
            {
             before(grammarAccess.getMlRegressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMlRegressionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__1__Impl"


    // $ANTLR start "rule__MlRegression__Group__2"
    // InternalMLReg.g:417:1: rule__MlRegression__Group__2 : rule__MlRegression__Group__2__Impl rule__MlRegression__Group__3 ;
    public final void rule__MlRegression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:421:1: ( rule__MlRegression__Group__2__Impl rule__MlRegression__Group__3 )
            // InternalMLReg.g:422:2: rule__MlRegression__Group__2__Impl rule__MlRegression__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MlRegression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__2"


    // $ANTLR start "rule__MlRegression__Group__2__Impl"
    // InternalMLReg.g:429:1: rule__MlRegression__Group__2__Impl : ( ( rule__MlRegression__CsvFileAssignment_2 ) ) ;
    public final void rule__MlRegression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:433:1: ( ( ( rule__MlRegression__CsvFileAssignment_2 ) ) )
            // InternalMLReg.g:434:1: ( ( rule__MlRegression__CsvFileAssignment_2 ) )
            {
            // InternalMLReg.g:434:1: ( ( rule__MlRegression__CsvFileAssignment_2 ) )
            // InternalMLReg.g:435:2: ( rule__MlRegression__CsvFileAssignment_2 )
            {
             before(grammarAccess.getMlRegressionAccess().getCsvFileAssignment_2()); 
            // InternalMLReg.g:436:2: ( rule__MlRegression__CsvFileAssignment_2 )
            // InternalMLReg.g:436:3: rule__MlRegression__CsvFileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MlRegression__CsvFileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMlRegressionAccess().getCsvFileAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__2__Impl"


    // $ANTLR start "rule__MlRegression__Group__3"
    // InternalMLReg.g:444:1: rule__MlRegression__Group__3 : rule__MlRegression__Group__3__Impl rule__MlRegression__Group__4 ;
    public final void rule__MlRegression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:448:1: ( rule__MlRegression__Group__3__Impl rule__MlRegression__Group__4 )
            // InternalMLReg.g:449:2: rule__MlRegression__Group__3__Impl rule__MlRegression__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MlRegression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__3"


    // $ANTLR start "rule__MlRegression__Group__3__Impl"
    // InternalMLReg.g:456:1: rule__MlRegression__Group__3__Impl : ( ',' ) ;
    public final void rule__MlRegression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:460:1: ( ( ',' ) )
            // InternalMLReg.g:461:1: ( ',' )
            {
            // InternalMLReg.g:461:1: ( ',' )
            // InternalMLReg.g:462:2: ','
            {
             before(grammarAccess.getMlRegressionAccess().getCommaKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMlRegressionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__3__Impl"


    // $ANTLR start "rule__MlRegression__Group__4"
    // InternalMLReg.g:471:1: rule__MlRegression__Group__4 : rule__MlRegression__Group__4__Impl rule__MlRegression__Group__5 ;
    public final void rule__MlRegression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:475:1: ( rule__MlRegression__Group__4__Impl rule__MlRegression__Group__5 )
            // InternalMLReg.g:476:2: rule__MlRegression__Group__4__Impl rule__MlRegression__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__MlRegression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__4"


    // $ANTLR start "rule__MlRegression__Group__4__Impl"
    // InternalMLReg.g:483:1: rule__MlRegression__Group__4__Impl : ( ( rule__MlRegression__TestSizeAssignment_4 ) ) ;
    public final void rule__MlRegression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:487:1: ( ( ( rule__MlRegression__TestSizeAssignment_4 ) ) )
            // InternalMLReg.g:488:1: ( ( rule__MlRegression__TestSizeAssignment_4 ) )
            {
            // InternalMLReg.g:488:1: ( ( rule__MlRegression__TestSizeAssignment_4 ) )
            // InternalMLReg.g:489:2: ( rule__MlRegression__TestSizeAssignment_4 )
            {
             before(grammarAccess.getMlRegressionAccess().getTestSizeAssignment_4()); 
            // InternalMLReg.g:490:2: ( rule__MlRegression__TestSizeAssignment_4 )
            // InternalMLReg.g:490:3: rule__MlRegression__TestSizeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MlRegression__TestSizeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMlRegressionAccess().getTestSizeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__4__Impl"


    // $ANTLR start "rule__MlRegression__Group__5"
    // InternalMLReg.g:498:1: rule__MlRegression__Group__5 : rule__MlRegression__Group__5__Impl rule__MlRegression__Group__6 ;
    public final void rule__MlRegression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:502:1: ( rule__MlRegression__Group__5__Impl rule__MlRegression__Group__6 )
            // InternalMLReg.g:503:2: rule__MlRegression__Group__5__Impl rule__MlRegression__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__MlRegression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__5"


    // $ANTLR start "rule__MlRegression__Group__5__Impl"
    // InternalMLReg.g:510:1: rule__MlRegression__Group__5__Impl : ( ',' ) ;
    public final void rule__MlRegression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:514:1: ( ( ',' ) )
            // InternalMLReg.g:515:1: ( ',' )
            {
            // InternalMLReg.g:515:1: ( ',' )
            // InternalMLReg.g:516:2: ','
            {
             before(grammarAccess.getMlRegressionAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMlRegressionAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__5__Impl"


    // $ANTLR start "rule__MlRegression__Group__6"
    // InternalMLReg.g:525:1: rule__MlRegression__Group__6 : rule__MlRegression__Group__6__Impl rule__MlRegression__Group__7 ;
    public final void rule__MlRegression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:529:1: ( rule__MlRegression__Group__6__Impl rule__MlRegression__Group__7 )
            // InternalMLReg.g:530:2: rule__MlRegression__Group__6__Impl rule__MlRegression__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__MlRegression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__6"


    // $ANTLR start "rule__MlRegression__Group__6__Impl"
    // InternalMLReg.g:537:1: rule__MlRegression__Group__6__Impl : ( ( rule__MlRegression__PredictiveVarsAssignment_6 ) ) ;
    public final void rule__MlRegression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:541:1: ( ( ( rule__MlRegression__PredictiveVarsAssignment_6 ) ) )
            // InternalMLReg.g:542:1: ( ( rule__MlRegression__PredictiveVarsAssignment_6 ) )
            {
            // InternalMLReg.g:542:1: ( ( rule__MlRegression__PredictiveVarsAssignment_6 ) )
            // InternalMLReg.g:543:2: ( rule__MlRegression__PredictiveVarsAssignment_6 )
            {
             before(grammarAccess.getMlRegressionAccess().getPredictiveVarsAssignment_6()); 
            // InternalMLReg.g:544:2: ( rule__MlRegression__PredictiveVarsAssignment_6 )
            // InternalMLReg.g:544:3: rule__MlRegression__PredictiveVarsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MlRegression__PredictiveVarsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMlRegressionAccess().getPredictiveVarsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__6__Impl"


    // $ANTLR start "rule__MlRegression__Group__7"
    // InternalMLReg.g:552:1: rule__MlRegression__Group__7 : rule__MlRegression__Group__7__Impl rule__MlRegression__Group__8 ;
    public final void rule__MlRegression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:556:1: ( rule__MlRegression__Group__7__Impl rule__MlRegression__Group__8 )
            // InternalMLReg.g:557:2: rule__MlRegression__Group__7__Impl rule__MlRegression__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__MlRegression__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__7"


    // $ANTLR start "rule__MlRegression__Group__7__Impl"
    // InternalMLReg.g:564:1: rule__MlRegression__Group__7__Impl : ( ',' ) ;
    public final void rule__MlRegression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:568:1: ( ( ',' ) )
            // InternalMLReg.g:569:1: ( ',' )
            {
            // InternalMLReg.g:569:1: ( ',' )
            // InternalMLReg.g:570:2: ','
            {
             before(grammarAccess.getMlRegressionAccess().getCommaKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMlRegressionAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__7__Impl"


    // $ANTLR start "rule__MlRegression__Group__8"
    // InternalMLReg.g:579:1: rule__MlRegression__Group__8 : rule__MlRegression__Group__8__Impl rule__MlRegression__Group__9 ;
    public final void rule__MlRegression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:583:1: ( rule__MlRegression__Group__8__Impl rule__MlRegression__Group__9 )
            // InternalMLReg.g:584:2: rule__MlRegression__Group__8__Impl rule__MlRegression__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__MlRegression__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__8"


    // $ANTLR start "rule__MlRegression__Group__8__Impl"
    // InternalMLReg.g:591:1: rule__MlRegression__Group__8__Impl : ( ( rule__MlRegression__TargetVarAssignment_8 ) ) ;
    public final void rule__MlRegression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:595:1: ( ( ( rule__MlRegression__TargetVarAssignment_8 ) ) )
            // InternalMLReg.g:596:1: ( ( rule__MlRegression__TargetVarAssignment_8 ) )
            {
            // InternalMLReg.g:596:1: ( ( rule__MlRegression__TargetVarAssignment_8 ) )
            // InternalMLReg.g:597:2: ( rule__MlRegression__TargetVarAssignment_8 )
            {
             before(grammarAccess.getMlRegressionAccess().getTargetVarAssignment_8()); 
            // InternalMLReg.g:598:2: ( rule__MlRegression__TargetVarAssignment_8 )
            // InternalMLReg.g:598:3: rule__MlRegression__TargetVarAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__MlRegression__TargetVarAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMlRegressionAccess().getTargetVarAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__8__Impl"


    // $ANTLR start "rule__MlRegression__Group__9"
    // InternalMLReg.g:606:1: rule__MlRegression__Group__9 : rule__MlRegression__Group__9__Impl rule__MlRegression__Group__10 ;
    public final void rule__MlRegression__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:610:1: ( rule__MlRegression__Group__9__Impl rule__MlRegression__Group__10 )
            // InternalMLReg.g:611:2: rule__MlRegression__Group__9__Impl rule__MlRegression__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__MlRegression__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__9"


    // $ANTLR start "rule__MlRegression__Group__9__Impl"
    // InternalMLReg.g:618:1: rule__MlRegression__Group__9__Impl : ( ',' ) ;
    public final void rule__MlRegression__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:622:1: ( ( ',' ) )
            // InternalMLReg.g:623:1: ( ',' )
            {
            // InternalMLReg.g:623:1: ( ',' )
            // InternalMLReg.g:624:2: ','
            {
             before(grammarAccess.getMlRegressionAccess().getCommaKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMlRegressionAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__9__Impl"


    // $ANTLR start "rule__MlRegression__Group__10"
    // InternalMLReg.g:633:1: rule__MlRegression__Group__10 : rule__MlRegression__Group__10__Impl rule__MlRegression__Group__11 ;
    public final void rule__MlRegression__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:637:1: ( rule__MlRegression__Group__10__Impl rule__MlRegression__Group__11 )
            // InternalMLReg.g:638:2: rule__MlRegression__Group__10__Impl rule__MlRegression__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__MlRegression__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__10"


    // $ANTLR start "rule__MlRegression__Group__10__Impl"
    // InternalMLReg.g:645:1: rule__MlRegression__Group__10__Impl : ( ( rule__MlRegression__AlgorithmAssignment_10 ) ) ;
    public final void rule__MlRegression__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:649:1: ( ( ( rule__MlRegression__AlgorithmAssignment_10 ) ) )
            // InternalMLReg.g:650:1: ( ( rule__MlRegression__AlgorithmAssignment_10 ) )
            {
            // InternalMLReg.g:650:1: ( ( rule__MlRegression__AlgorithmAssignment_10 ) )
            // InternalMLReg.g:651:2: ( rule__MlRegression__AlgorithmAssignment_10 )
            {
             before(grammarAccess.getMlRegressionAccess().getAlgorithmAssignment_10()); 
            // InternalMLReg.g:652:2: ( rule__MlRegression__AlgorithmAssignment_10 )
            // InternalMLReg.g:652:3: rule__MlRegression__AlgorithmAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__MlRegression__AlgorithmAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMlRegressionAccess().getAlgorithmAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__10__Impl"


    // $ANTLR start "rule__MlRegression__Group__11"
    // InternalMLReg.g:660:1: rule__MlRegression__Group__11 : rule__MlRegression__Group__11__Impl rule__MlRegression__Group__12 ;
    public final void rule__MlRegression__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:664:1: ( rule__MlRegression__Group__11__Impl rule__MlRegression__Group__12 )
            // InternalMLReg.g:665:2: rule__MlRegression__Group__11__Impl rule__MlRegression__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__MlRegression__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__11"


    // $ANTLR start "rule__MlRegression__Group__11__Impl"
    // InternalMLReg.g:672:1: rule__MlRegression__Group__11__Impl : ( ',' ) ;
    public final void rule__MlRegression__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:676:1: ( ( ',' ) )
            // InternalMLReg.g:677:1: ( ',' )
            {
            // InternalMLReg.g:677:1: ( ',' )
            // InternalMLReg.g:678:2: ','
            {
             before(grammarAccess.getMlRegressionAccess().getCommaKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMlRegressionAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__11__Impl"


    // $ANTLR start "rule__MlRegression__Group__12"
    // InternalMLReg.g:687:1: rule__MlRegression__Group__12 : rule__MlRegression__Group__12__Impl rule__MlRegression__Group__13 ;
    public final void rule__MlRegression__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:691:1: ( rule__MlRegression__Group__12__Impl rule__MlRegression__Group__13 )
            // InternalMLReg.g:692:2: rule__MlRegression__Group__12__Impl rule__MlRegression__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__MlRegression__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__12"


    // $ANTLR start "rule__MlRegression__Group__12__Impl"
    // InternalMLReg.g:699:1: rule__MlRegression__Group__12__Impl : ( ( rule__MlRegression__ErrorMeasureAssignment_12 ) ) ;
    public final void rule__MlRegression__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:703:1: ( ( ( rule__MlRegression__ErrorMeasureAssignment_12 ) ) )
            // InternalMLReg.g:704:1: ( ( rule__MlRegression__ErrorMeasureAssignment_12 ) )
            {
            // InternalMLReg.g:704:1: ( ( rule__MlRegression__ErrorMeasureAssignment_12 ) )
            // InternalMLReg.g:705:2: ( rule__MlRegression__ErrorMeasureAssignment_12 )
            {
             before(grammarAccess.getMlRegressionAccess().getErrorMeasureAssignment_12()); 
            // InternalMLReg.g:706:2: ( rule__MlRegression__ErrorMeasureAssignment_12 )
            // InternalMLReg.g:706:3: rule__MlRegression__ErrorMeasureAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__MlRegression__ErrorMeasureAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getMlRegressionAccess().getErrorMeasureAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__12__Impl"


    // $ANTLR start "rule__MlRegression__Group__13"
    // InternalMLReg.g:714:1: rule__MlRegression__Group__13 : rule__MlRegression__Group__13__Impl ;
    public final void rule__MlRegression__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:718:1: ( rule__MlRegression__Group__13__Impl )
            // InternalMLReg.g:719:2: rule__MlRegression__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MlRegression__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__13"


    // $ANTLR start "rule__MlRegression__Group__13__Impl"
    // InternalMLReg.g:725:1: rule__MlRegression__Group__13__Impl : ( '}' ) ;
    public final void rule__MlRegression__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:729:1: ( ( '}' ) )
            // InternalMLReg.g:730:1: ( '}' )
            {
            // InternalMLReg.g:730:1: ( '}' )
            // InternalMLReg.g:731:2: '}'
            {
             before(grammarAccess.getMlRegressionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMlRegressionAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__Group__13__Impl"


    // $ANTLR start "rule__CsvFile__Group__0"
    // InternalMLReg.g:741:1: rule__CsvFile__Group__0 : rule__CsvFile__Group__0__Impl rule__CsvFile__Group__1 ;
    public final void rule__CsvFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:745:1: ( rule__CsvFile__Group__0__Impl rule__CsvFile__Group__1 )
            // InternalMLReg.g:746:2: rule__CsvFile__Group__0__Impl rule__CsvFile__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CsvFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvFile__Group__0"


    // $ANTLR start "rule__CsvFile__Group__0__Impl"
    // InternalMLReg.g:753:1: rule__CsvFile__Group__0__Impl : ( 'file' ) ;
    public final void rule__CsvFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:757:1: ( ( 'file' ) )
            // InternalMLReg.g:758:1: ( 'file' )
            {
            // InternalMLReg.g:758:1: ( 'file' )
            // InternalMLReg.g:759:2: 'file'
            {
             before(grammarAccess.getCsvFileAccess().getFileKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCsvFileAccess().getFileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvFile__Group__0__Impl"


    // $ANTLR start "rule__CsvFile__Group__1"
    // InternalMLReg.g:768:1: rule__CsvFile__Group__1 : rule__CsvFile__Group__1__Impl rule__CsvFile__Group__2 ;
    public final void rule__CsvFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:772:1: ( rule__CsvFile__Group__1__Impl rule__CsvFile__Group__2 )
            // InternalMLReg.g:773:2: rule__CsvFile__Group__1__Impl rule__CsvFile__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__CsvFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvFile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvFile__Group__1"


    // $ANTLR start "rule__CsvFile__Group__1__Impl"
    // InternalMLReg.g:780:1: rule__CsvFile__Group__1__Impl : ( ':' ) ;
    public final void rule__CsvFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:784:1: ( ( ':' ) )
            // InternalMLReg.g:785:1: ( ':' )
            {
            // InternalMLReg.g:785:1: ( ':' )
            // InternalMLReg.g:786:2: ':'
            {
             before(grammarAccess.getCsvFileAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCsvFileAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvFile__Group__1__Impl"


    // $ANTLR start "rule__CsvFile__Group__2"
    // InternalMLReg.g:795:1: rule__CsvFile__Group__2 : rule__CsvFile__Group__2__Impl ;
    public final void rule__CsvFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:799:1: ( rule__CsvFile__Group__2__Impl )
            // InternalMLReg.g:800:2: rule__CsvFile__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvFile__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvFile__Group__2"


    // $ANTLR start "rule__CsvFile__Group__2__Impl"
    // InternalMLReg.g:806:1: rule__CsvFile__Group__2__Impl : ( ( rule__CsvFile__CsvFileAssignment_2 ) ) ;
    public final void rule__CsvFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:810:1: ( ( ( rule__CsvFile__CsvFileAssignment_2 ) ) )
            // InternalMLReg.g:811:1: ( ( rule__CsvFile__CsvFileAssignment_2 ) )
            {
            // InternalMLReg.g:811:1: ( ( rule__CsvFile__CsvFileAssignment_2 ) )
            // InternalMLReg.g:812:2: ( rule__CsvFile__CsvFileAssignment_2 )
            {
             before(grammarAccess.getCsvFileAccess().getCsvFileAssignment_2()); 
            // InternalMLReg.g:813:2: ( rule__CsvFile__CsvFileAssignment_2 )
            // InternalMLReg.g:813:3: rule__CsvFile__CsvFileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CsvFile__CsvFileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCsvFileAccess().getCsvFileAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvFile__Group__2__Impl"


    // $ANTLR start "rule__TestSize__Group__0"
    // InternalMLReg.g:822:1: rule__TestSize__Group__0 : rule__TestSize__Group__0__Impl rule__TestSize__Group__1 ;
    public final void rule__TestSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:826:1: ( rule__TestSize__Group__0__Impl rule__TestSize__Group__1 )
            // InternalMLReg.g:827:2: rule__TestSize__Group__0__Impl rule__TestSize__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TestSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestSize__Group__0"


    // $ANTLR start "rule__TestSize__Group__0__Impl"
    // InternalMLReg.g:834:1: rule__TestSize__Group__0__Impl : ( () ) ;
    public final void rule__TestSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:838:1: ( ( () ) )
            // InternalMLReg.g:839:1: ( () )
            {
            // InternalMLReg.g:839:1: ( () )
            // InternalMLReg.g:840:2: ()
            {
             before(grammarAccess.getTestSizeAccess().getTestSizeAction_0()); 
            // InternalMLReg.g:841:2: ()
            // InternalMLReg.g:841:3: 
            {
            }

             after(grammarAccess.getTestSizeAccess().getTestSizeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestSize__Group__0__Impl"


    // $ANTLR start "rule__TestSize__Group__1"
    // InternalMLReg.g:849:1: rule__TestSize__Group__1 : rule__TestSize__Group__1__Impl rule__TestSize__Group__2 ;
    public final void rule__TestSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:853:1: ( rule__TestSize__Group__1__Impl rule__TestSize__Group__2 )
            // InternalMLReg.g:854:2: rule__TestSize__Group__1__Impl rule__TestSize__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TestSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestSize__Group__1"


    // $ANTLR start "rule__TestSize__Group__1__Impl"
    // InternalMLReg.g:861:1: rule__TestSize__Group__1__Impl : ( 'testSize' ) ;
    public final void rule__TestSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:865:1: ( ( 'testSize' ) )
            // InternalMLReg.g:866:1: ( 'testSize' )
            {
            // InternalMLReg.g:866:1: ( 'testSize' )
            // InternalMLReg.g:867:2: 'testSize'
            {
             before(grammarAccess.getTestSizeAccess().getTestSizeKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTestSizeAccess().getTestSizeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestSize__Group__1__Impl"


    // $ANTLR start "rule__TestSize__Group__2"
    // InternalMLReg.g:876:1: rule__TestSize__Group__2 : rule__TestSize__Group__2__Impl rule__TestSize__Group__3 ;
    public final void rule__TestSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:880:1: ( rule__TestSize__Group__2__Impl rule__TestSize__Group__3 )
            // InternalMLReg.g:881:2: rule__TestSize__Group__2__Impl rule__TestSize__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TestSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestSize__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestSize__Group__2"


    // $ANTLR start "rule__TestSize__Group__2__Impl"
    // InternalMLReg.g:888:1: rule__TestSize__Group__2__Impl : ( ':' ) ;
    public final void rule__TestSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:892:1: ( ( ':' ) )
            // InternalMLReg.g:893:1: ( ':' )
            {
            // InternalMLReg.g:893:1: ( ':' )
            // InternalMLReg.g:894:2: ':'
            {
             before(grammarAccess.getTestSizeAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTestSizeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestSize__Group__2__Impl"


    // $ANTLR start "rule__TestSize__Group__3"
    // InternalMLReg.g:903:1: rule__TestSize__Group__3 : rule__TestSize__Group__3__Impl ;
    public final void rule__TestSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:907:1: ( rule__TestSize__Group__3__Impl )
            // InternalMLReg.g:908:2: rule__TestSize__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestSize__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestSize__Group__3"


    // $ANTLR start "rule__TestSize__Group__3__Impl"
    // InternalMLReg.g:914:1: rule__TestSize__Group__3__Impl : ( ( rule__TestSize__TestSizeAssignment_3 ) ) ;
    public final void rule__TestSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:918:1: ( ( ( rule__TestSize__TestSizeAssignment_3 ) ) )
            // InternalMLReg.g:919:1: ( ( rule__TestSize__TestSizeAssignment_3 ) )
            {
            // InternalMLReg.g:919:1: ( ( rule__TestSize__TestSizeAssignment_3 ) )
            // InternalMLReg.g:920:2: ( rule__TestSize__TestSizeAssignment_3 )
            {
             before(grammarAccess.getTestSizeAccess().getTestSizeAssignment_3()); 
            // InternalMLReg.g:921:2: ( rule__TestSize__TestSizeAssignment_3 )
            // InternalMLReg.g:921:3: rule__TestSize__TestSizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TestSize__TestSizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestSizeAccess().getTestSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestSize__Group__3__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__0"
    // InternalMLReg.g:930:1: rule__PredictiveVars__Group__0 : rule__PredictiveVars__Group__0__Impl rule__PredictiveVars__Group__1 ;
    public final void rule__PredictiveVars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:934:1: ( rule__PredictiveVars__Group__0__Impl rule__PredictiveVars__Group__1 )
            // InternalMLReg.g:935:2: rule__PredictiveVars__Group__0__Impl rule__PredictiveVars__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PredictiveVars__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__0"


    // $ANTLR start "rule__PredictiveVars__Group__0__Impl"
    // InternalMLReg.g:942:1: rule__PredictiveVars__Group__0__Impl : ( 'predictiveVariables' ) ;
    public final void rule__PredictiveVars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:946:1: ( ( 'predictiveVariables' ) )
            // InternalMLReg.g:947:1: ( 'predictiveVariables' )
            {
            // InternalMLReg.g:947:1: ( 'predictiveVariables' )
            // InternalMLReg.g:948:2: 'predictiveVariables'
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredictiveVariablesKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getPredictiveVariablesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__0__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__1"
    // InternalMLReg.g:957:1: rule__PredictiveVars__Group__1 : rule__PredictiveVars__Group__1__Impl rule__PredictiveVars__Group__2 ;
    public final void rule__PredictiveVars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:961:1: ( rule__PredictiveVars__Group__1__Impl rule__PredictiveVars__Group__2 )
            // InternalMLReg.g:962:2: rule__PredictiveVars__Group__1__Impl rule__PredictiveVars__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PredictiveVars__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__1"


    // $ANTLR start "rule__PredictiveVars__Group__1__Impl"
    // InternalMLReg.g:969:1: rule__PredictiveVars__Group__1__Impl : ( ':' ) ;
    public final void rule__PredictiveVars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:973:1: ( ( ':' ) )
            // InternalMLReg.g:974:1: ( ':' )
            {
            // InternalMLReg.g:974:1: ( ':' )
            // InternalMLReg.g:975:2: ':'
            {
             before(grammarAccess.getPredictiveVarsAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__1__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__2"
    // InternalMLReg.g:984:1: rule__PredictiveVars__Group__2 : rule__PredictiveVars__Group__2__Impl rule__PredictiveVars__Group__3 ;
    public final void rule__PredictiveVars__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:988:1: ( rule__PredictiveVars__Group__2__Impl rule__PredictiveVars__Group__3 )
            // InternalMLReg.g:989:2: rule__PredictiveVars__Group__2__Impl rule__PredictiveVars__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__PredictiveVars__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__2"


    // $ANTLR start "rule__PredictiveVars__Group__2__Impl"
    // InternalMLReg.g:996:1: rule__PredictiveVars__Group__2__Impl : ( '{' ) ;
    public final void rule__PredictiveVars__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1000:1: ( ( '{' ) )
            // InternalMLReg.g:1001:1: ( '{' )
            {
            // InternalMLReg.g:1001:1: ( '{' )
            // InternalMLReg.g:1002:2: '{'
            {
             before(grammarAccess.getPredictiveVarsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__2__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__3"
    // InternalMLReg.g:1011:1: rule__PredictiveVars__Group__3 : rule__PredictiveVars__Group__3__Impl rule__PredictiveVars__Group__4 ;
    public final void rule__PredictiveVars__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1015:1: ( rule__PredictiveVars__Group__3__Impl rule__PredictiveVars__Group__4 )
            // InternalMLReg.g:1016:2: rule__PredictiveVars__Group__3__Impl rule__PredictiveVars__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__PredictiveVars__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__3"


    // $ANTLR start "rule__PredictiveVars__Group__3__Impl"
    // InternalMLReg.g:1023:1: rule__PredictiveVars__Group__3__Impl : ( ( rule__PredictiveVars__PredictiveVarAssignment_3 ) ) ;
    public final void rule__PredictiveVars__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1027:1: ( ( ( rule__PredictiveVars__PredictiveVarAssignment_3 ) ) )
            // InternalMLReg.g:1028:1: ( ( rule__PredictiveVars__PredictiveVarAssignment_3 ) )
            {
            // InternalMLReg.g:1028:1: ( ( rule__PredictiveVars__PredictiveVarAssignment_3 ) )
            // InternalMLReg.g:1029:2: ( rule__PredictiveVars__PredictiveVarAssignment_3 )
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredictiveVarAssignment_3()); 
            // InternalMLReg.g:1030:2: ( rule__PredictiveVars__PredictiveVarAssignment_3 )
            // InternalMLReg.g:1030:3: rule__PredictiveVars__PredictiveVarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__PredictiveVarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveVarsAccess().getPredictiveVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__3__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__4"
    // InternalMLReg.g:1038:1: rule__PredictiveVars__Group__4 : rule__PredictiveVars__Group__4__Impl rule__PredictiveVars__Group__5 ;
    public final void rule__PredictiveVars__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1042:1: ( rule__PredictiveVars__Group__4__Impl rule__PredictiveVars__Group__5 )
            // InternalMLReg.g:1043:2: rule__PredictiveVars__Group__4__Impl rule__PredictiveVars__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__PredictiveVars__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__4"


    // $ANTLR start "rule__PredictiveVars__Group__4__Impl"
    // InternalMLReg.g:1050:1: rule__PredictiveVars__Group__4__Impl : ( ( rule__PredictiveVars__Group_4__0 )* ) ;
    public final void rule__PredictiveVars__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1054:1: ( ( ( rule__PredictiveVars__Group_4__0 )* ) )
            // InternalMLReg.g:1055:1: ( ( rule__PredictiveVars__Group_4__0 )* )
            {
            // InternalMLReg.g:1055:1: ( ( rule__PredictiveVars__Group_4__0 )* )
            // InternalMLReg.g:1056:2: ( rule__PredictiveVars__Group_4__0 )*
            {
             before(grammarAccess.getPredictiveVarsAccess().getGroup_4()); 
            // InternalMLReg.g:1057:2: ( rule__PredictiveVars__Group_4__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMLReg.g:1057:3: rule__PredictiveVars__Group_4__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__PredictiveVars__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPredictiveVarsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__4__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__5"
    // InternalMLReg.g:1065:1: rule__PredictiveVars__Group__5 : rule__PredictiveVars__Group__5__Impl ;
    public final void rule__PredictiveVars__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1069:1: ( rule__PredictiveVars__Group__5__Impl )
            // InternalMLReg.g:1070:2: rule__PredictiveVars__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__5"


    // $ANTLR start "rule__PredictiveVars__Group__5__Impl"
    // InternalMLReg.g:1076:1: rule__PredictiveVars__Group__5__Impl : ( '}' ) ;
    public final void rule__PredictiveVars__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1080:1: ( ( '}' ) )
            // InternalMLReg.g:1081:1: ( '}' )
            {
            // InternalMLReg.g:1081:1: ( '}' )
            // InternalMLReg.g:1082:2: '}'
            {
             before(grammarAccess.getPredictiveVarsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group__5__Impl"


    // $ANTLR start "rule__PredictiveVars__Group_4__0"
    // InternalMLReg.g:1092:1: rule__PredictiveVars__Group_4__0 : rule__PredictiveVars__Group_4__0__Impl rule__PredictiveVars__Group_4__1 ;
    public final void rule__PredictiveVars__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1096:1: ( rule__PredictiveVars__Group_4__0__Impl rule__PredictiveVars__Group_4__1 )
            // InternalMLReg.g:1097:2: rule__PredictiveVars__Group_4__0__Impl rule__PredictiveVars__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__PredictiveVars__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group_4__0"


    // $ANTLR start "rule__PredictiveVars__Group_4__0__Impl"
    // InternalMLReg.g:1104:1: rule__PredictiveVars__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PredictiveVars__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1108:1: ( ( ',' ) )
            // InternalMLReg.g:1109:1: ( ',' )
            {
            // InternalMLReg.g:1109:1: ( ',' )
            // InternalMLReg.g:1110:2: ','
            {
             before(grammarAccess.getPredictiveVarsAccess().getCommaKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group_4__0__Impl"


    // $ANTLR start "rule__PredictiveVars__Group_4__1"
    // InternalMLReg.g:1119:1: rule__PredictiveVars__Group_4__1 : rule__PredictiveVars__Group_4__1__Impl ;
    public final void rule__PredictiveVars__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1123:1: ( rule__PredictiveVars__Group_4__1__Impl )
            // InternalMLReg.g:1124:2: rule__PredictiveVars__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group_4__1"


    // $ANTLR start "rule__PredictiveVars__Group_4__1__Impl"
    // InternalMLReg.g:1130:1: rule__PredictiveVars__Group_4__1__Impl : ( ( rule__PredictiveVars__PredictiveVarAssignment_4_1 ) ) ;
    public final void rule__PredictiveVars__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1134:1: ( ( ( rule__PredictiveVars__PredictiveVarAssignment_4_1 ) ) )
            // InternalMLReg.g:1135:1: ( ( rule__PredictiveVars__PredictiveVarAssignment_4_1 ) )
            {
            // InternalMLReg.g:1135:1: ( ( rule__PredictiveVars__PredictiveVarAssignment_4_1 ) )
            // InternalMLReg.g:1136:2: ( rule__PredictiveVars__PredictiveVarAssignment_4_1 )
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredictiveVarAssignment_4_1()); 
            // InternalMLReg.g:1137:2: ( rule__PredictiveVars__PredictiveVarAssignment_4_1 )
            // InternalMLReg.g:1137:3: rule__PredictiveVars__PredictiveVarAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__PredictiveVarAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveVarsAccess().getPredictiveVarAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__Group_4__1__Impl"


    // $ANTLR start "rule__TargetVar__Group__0"
    // InternalMLReg.g:1146:1: rule__TargetVar__Group__0 : rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 ;
    public final void rule__TargetVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1150:1: ( rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 )
            // InternalMLReg.g:1151:2: rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__TargetVar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__Group__0"


    // $ANTLR start "rule__TargetVar__Group__0__Impl"
    // InternalMLReg.g:1158:1: rule__TargetVar__Group__0__Impl : ( 'targetVariable' ) ;
    public final void rule__TargetVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1162:1: ( ( 'targetVariable' ) )
            // InternalMLReg.g:1163:1: ( 'targetVariable' )
            {
            // InternalMLReg.g:1163:1: ( 'targetVariable' )
            // InternalMLReg.g:1164:2: 'targetVariable'
            {
             before(grammarAccess.getTargetVarAccess().getTargetVariableKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getTargetVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__Group__0__Impl"


    // $ANTLR start "rule__TargetVar__Group__1"
    // InternalMLReg.g:1173:1: rule__TargetVar__Group__1 : rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 ;
    public final void rule__TargetVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1177:1: ( rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 )
            // InternalMLReg.g:1178:2: rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TargetVar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__Group__1"


    // $ANTLR start "rule__TargetVar__Group__1__Impl"
    // InternalMLReg.g:1185:1: rule__TargetVar__Group__1__Impl : ( ':' ) ;
    public final void rule__TargetVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1189:1: ( ( ':' ) )
            // InternalMLReg.g:1190:1: ( ':' )
            {
            // InternalMLReg.g:1190:1: ( ':' )
            // InternalMLReg.g:1191:2: ':'
            {
             before(grammarAccess.getTargetVarAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__Group__1__Impl"


    // $ANTLR start "rule__TargetVar__Group__2"
    // InternalMLReg.g:1200:1: rule__TargetVar__Group__2 : rule__TargetVar__Group__2__Impl ;
    public final void rule__TargetVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1204:1: ( rule__TargetVar__Group__2__Impl )
            // InternalMLReg.g:1205:2: rule__TargetVar__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__Group__2"


    // $ANTLR start "rule__TargetVar__Group__2__Impl"
    // InternalMLReg.g:1211:1: rule__TargetVar__Group__2__Impl : ( ( rule__TargetVar__TargetVarAssignment_2 ) ) ;
    public final void rule__TargetVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1215:1: ( ( ( rule__TargetVar__TargetVarAssignment_2 ) ) )
            // InternalMLReg.g:1216:1: ( ( rule__TargetVar__TargetVarAssignment_2 ) )
            {
            // InternalMLReg.g:1216:1: ( ( rule__TargetVar__TargetVarAssignment_2 ) )
            // InternalMLReg.g:1217:2: ( rule__TargetVar__TargetVarAssignment_2 )
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarAssignment_2()); 
            // InternalMLReg.g:1218:2: ( rule__TargetVar__TargetVarAssignment_2 )
            // InternalMLReg.g:1218:3: rule__TargetVar__TargetVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__TargetVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarAccess().getTargetVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__Group__2__Impl"


    // $ANTLR start "rule__Algorithm__Group__0"
    // InternalMLReg.g:1227:1: rule__Algorithm__Group__0 : rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 ;
    public final void rule__Algorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1231:1: ( rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 )
            // InternalMLReg.g:1232:2: rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Algorithm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__0"


    // $ANTLR start "rule__Algorithm__Group__0__Impl"
    // InternalMLReg.g:1239:1: rule__Algorithm__Group__0__Impl : ( 'algorithm' ) ;
    public final void rule__Algorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1243:1: ( ( 'algorithm' ) )
            // InternalMLReg.g:1244:1: ( 'algorithm' )
            {
            // InternalMLReg.g:1244:1: ( 'algorithm' )
            // InternalMLReg.g:1245:2: 'algorithm'
            {
             before(grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__0__Impl"


    // $ANTLR start "rule__Algorithm__Group__1"
    // InternalMLReg.g:1254:1: rule__Algorithm__Group__1 : rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 ;
    public final void rule__Algorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1258:1: ( rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 )
            // InternalMLReg.g:1259:2: rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Algorithm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__1"


    // $ANTLR start "rule__Algorithm__Group__1__Impl"
    // InternalMLReg.g:1266:1: rule__Algorithm__Group__1__Impl : ( ':' ) ;
    public final void rule__Algorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1270:1: ( ( ':' ) )
            // InternalMLReg.g:1271:1: ( ':' )
            {
            // InternalMLReg.g:1271:1: ( ':' )
            // InternalMLReg.g:1272:2: ':'
            {
             before(grammarAccess.getAlgorithmAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__1__Impl"


    // $ANTLR start "rule__Algorithm__Group__2"
    // InternalMLReg.g:1281:1: rule__Algorithm__Group__2 : rule__Algorithm__Group__2__Impl ;
    public final void rule__Algorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1285:1: ( rule__Algorithm__Group__2__Impl )
            // InternalMLReg.g:1286:2: rule__Algorithm__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__2"


    // $ANTLR start "rule__Algorithm__Group__2__Impl"
    // InternalMLReg.g:1292:1: rule__Algorithm__Group__2__Impl : ( ( rule__Algorithm__AlgoNameAssignment_2 ) ) ;
    public final void rule__Algorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1296:1: ( ( ( rule__Algorithm__AlgoNameAssignment_2 ) ) )
            // InternalMLReg.g:1297:1: ( ( rule__Algorithm__AlgoNameAssignment_2 ) )
            {
            // InternalMLReg.g:1297:1: ( ( rule__Algorithm__AlgoNameAssignment_2 ) )
            // InternalMLReg.g:1298:2: ( rule__Algorithm__AlgoNameAssignment_2 )
            {
             before(grammarAccess.getAlgorithmAccess().getAlgoNameAssignment_2()); 
            // InternalMLReg.g:1299:2: ( rule__Algorithm__AlgoNameAssignment_2 )
            // InternalMLReg.g:1299:3: rule__Algorithm__AlgoNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__AlgoNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getAlgoNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__2__Impl"


    // $ANTLR start "rule__ErrorMeasure__Group__0"
    // InternalMLReg.g:1308:1: rule__ErrorMeasure__Group__0 : rule__ErrorMeasure__Group__0__Impl rule__ErrorMeasure__Group__1 ;
    public final void rule__ErrorMeasure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1312:1: ( rule__ErrorMeasure__Group__0__Impl rule__ErrorMeasure__Group__1 )
            // InternalMLReg.g:1313:2: rule__ErrorMeasure__Group__0__Impl rule__ErrorMeasure__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ErrorMeasure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorMeasure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorMeasure__Group__0"


    // $ANTLR start "rule__ErrorMeasure__Group__0__Impl"
    // InternalMLReg.g:1320:1: rule__ErrorMeasure__Group__0__Impl : ( 'errorType' ) ;
    public final void rule__ErrorMeasure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1324:1: ( ( 'errorType' ) )
            // InternalMLReg.g:1325:1: ( 'errorType' )
            {
            // InternalMLReg.g:1325:1: ( 'errorType' )
            // InternalMLReg.g:1326:2: 'errorType'
            {
             before(grammarAccess.getErrorMeasureAccess().getErrorTypeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getErrorMeasureAccess().getErrorTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorMeasure__Group__0__Impl"


    // $ANTLR start "rule__ErrorMeasure__Group__1"
    // InternalMLReg.g:1335:1: rule__ErrorMeasure__Group__1 : rule__ErrorMeasure__Group__1__Impl rule__ErrorMeasure__Group__2 ;
    public final void rule__ErrorMeasure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1339:1: ( rule__ErrorMeasure__Group__1__Impl rule__ErrorMeasure__Group__2 )
            // InternalMLReg.g:1340:2: rule__ErrorMeasure__Group__1__Impl rule__ErrorMeasure__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ErrorMeasure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorMeasure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorMeasure__Group__1"


    // $ANTLR start "rule__ErrorMeasure__Group__1__Impl"
    // InternalMLReg.g:1347:1: rule__ErrorMeasure__Group__1__Impl : ( ':' ) ;
    public final void rule__ErrorMeasure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1351:1: ( ( ':' ) )
            // InternalMLReg.g:1352:1: ( ':' )
            {
            // InternalMLReg.g:1352:1: ( ':' )
            // InternalMLReg.g:1353:2: ':'
            {
             before(grammarAccess.getErrorMeasureAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getErrorMeasureAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorMeasure__Group__1__Impl"


    // $ANTLR start "rule__ErrorMeasure__Group__2"
    // InternalMLReg.g:1362:1: rule__ErrorMeasure__Group__2 : rule__ErrorMeasure__Group__2__Impl ;
    public final void rule__ErrorMeasure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1366:1: ( rule__ErrorMeasure__Group__2__Impl )
            // InternalMLReg.g:1367:2: rule__ErrorMeasure__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErrorMeasure__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorMeasure__Group__2"


    // $ANTLR start "rule__ErrorMeasure__Group__2__Impl"
    // InternalMLReg.g:1373:1: rule__ErrorMeasure__Group__2__Impl : ( ( rule__ErrorMeasure__ErrorMeasureAssignment_2 ) ) ;
    public final void rule__ErrorMeasure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1377:1: ( ( ( rule__ErrorMeasure__ErrorMeasureAssignment_2 ) ) )
            // InternalMLReg.g:1378:1: ( ( rule__ErrorMeasure__ErrorMeasureAssignment_2 ) )
            {
            // InternalMLReg.g:1378:1: ( ( rule__ErrorMeasure__ErrorMeasureAssignment_2 ) )
            // InternalMLReg.g:1379:2: ( rule__ErrorMeasure__ErrorMeasureAssignment_2 )
            {
             before(grammarAccess.getErrorMeasureAccess().getErrorMeasureAssignment_2()); 
            // InternalMLReg.g:1380:2: ( rule__ErrorMeasure__ErrorMeasureAssignment_2 )
            // InternalMLReg.g:1380:3: rule__ErrorMeasure__ErrorMeasureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ErrorMeasure__ErrorMeasureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getErrorMeasureAccess().getErrorMeasureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorMeasure__Group__2__Impl"


    // $ANTLR start "rule__Model__MlRegressionAssignment"
    // InternalMLReg.g:1389:1: rule__Model__MlRegressionAssignment : ( ruleMlRegression ) ;
    public final void rule__Model__MlRegressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1393:1: ( ( ruleMlRegression ) )
            // InternalMLReg.g:1394:2: ( ruleMlRegression )
            {
            // InternalMLReg.g:1394:2: ( ruleMlRegression )
            // InternalMLReg.g:1395:3: ruleMlRegression
            {
             before(grammarAccess.getModelAccess().getMlRegressionMlRegressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMlRegression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMlRegressionMlRegressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MlRegressionAssignment"


    // $ANTLR start "rule__MlRegression__CsvFileAssignment_2"
    // InternalMLReg.g:1404:1: rule__MlRegression__CsvFileAssignment_2 : ( ruleCsvFile ) ;
    public final void rule__MlRegression__CsvFileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1408:1: ( ( ruleCsvFile ) )
            // InternalMLReg.g:1409:2: ( ruleCsvFile )
            {
            // InternalMLReg.g:1409:2: ( ruleCsvFile )
            // InternalMLReg.g:1410:3: ruleCsvFile
            {
             before(grammarAccess.getMlRegressionAccess().getCsvFileCsvFileParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCsvFile();

            state._fsp--;

             after(grammarAccess.getMlRegressionAccess().getCsvFileCsvFileParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__CsvFileAssignment_2"


    // $ANTLR start "rule__MlRegression__TestSizeAssignment_4"
    // InternalMLReg.g:1419:1: rule__MlRegression__TestSizeAssignment_4 : ( ruleTestSize ) ;
    public final void rule__MlRegression__TestSizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1423:1: ( ( ruleTestSize ) )
            // InternalMLReg.g:1424:2: ( ruleTestSize )
            {
            // InternalMLReg.g:1424:2: ( ruleTestSize )
            // InternalMLReg.g:1425:3: ruleTestSize
            {
             before(grammarAccess.getMlRegressionAccess().getTestSizeTestSizeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTestSize();

            state._fsp--;

             after(grammarAccess.getMlRegressionAccess().getTestSizeTestSizeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__TestSizeAssignment_4"


    // $ANTLR start "rule__MlRegression__PredictiveVarsAssignment_6"
    // InternalMLReg.g:1434:1: rule__MlRegression__PredictiveVarsAssignment_6 : ( rulePredictiveVars ) ;
    public final void rule__MlRegression__PredictiveVarsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1438:1: ( ( rulePredictiveVars ) )
            // InternalMLReg.g:1439:2: ( rulePredictiveVars )
            {
            // InternalMLReg.g:1439:2: ( rulePredictiveVars )
            // InternalMLReg.g:1440:3: rulePredictiveVars
            {
             before(grammarAccess.getMlRegressionAccess().getPredictiveVarsPredictiveVarsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePredictiveVars();

            state._fsp--;

             after(grammarAccess.getMlRegressionAccess().getPredictiveVarsPredictiveVarsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__PredictiveVarsAssignment_6"


    // $ANTLR start "rule__MlRegression__TargetVarAssignment_8"
    // InternalMLReg.g:1449:1: rule__MlRegression__TargetVarAssignment_8 : ( ruleTargetVar ) ;
    public final void rule__MlRegression__TargetVarAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1453:1: ( ( ruleTargetVar ) )
            // InternalMLReg.g:1454:2: ( ruleTargetVar )
            {
            // InternalMLReg.g:1454:2: ( ruleTargetVar )
            // InternalMLReg.g:1455:3: ruleTargetVar
            {
             before(grammarAccess.getMlRegressionAccess().getTargetVarTargetVarParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetVar();

            state._fsp--;

             after(grammarAccess.getMlRegressionAccess().getTargetVarTargetVarParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__TargetVarAssignment_8"


    // $ANTLR start "rule__MlRegression__AlgorithmAssignment_10"
    // InternalMLReg.g:1464:1: rule__MlRegression__AlgorithmAssignment_10 : ( ruleAlgorithm ) ;
    public final void rule__MlRegression__AlgorithmAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1468:1: ( ( ruleAlgorithm ) )
            // InternalMLReg.g:1469:2: ( ruleAlgorithm )
            {
            // InternalMLReg.g:1469:2: ( ruleAlgorithm )
            // InternalMLReg.g:1470:3: ruleAlgorithm
            {
             before(grammarAccess.getMlRegressionAccess().getAlgorithmAlgorithmParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getMlRegressionAccess().getAlgorithmAlgorithmParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__AlgorithmAssignment_10"


    // $ANTLR start "rule__MlRegression__ErrorMeasureAssignment_12"
    // InternalMLReg.g:1479:1: rule__MlRegression__ErrorMeasureAssignment_12 : ( ruleErrorMeasure ) ;
    public final void rule__MlRegression__ErrorMeasureAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1483:1: ( ( ruleErrorMeasure ) )
            // InternalMLReg.g:1484:2: ( ruleErrorMeasure )
            {
            // InternalMLReg.g:1484:2: ( ruleErrorMeasure )
            // InternalMLReg.g:1485:3: ruleErrorMeasure
            {
             before(grammarAccess.getMlRegressionAccess().getErrorMeasureErrorMeasureParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleErrorMeasure();

            state._fsp--;

             after(grammarAccess.getMlRegressionAccess().getErrorMeasureErrorMeasureParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MlRegression__ErrorMeasureAssignment_12"


    // $ANTLR start "rule__CsvFile__CsvFileAssignment_2"
    // InternalMLReg.g:1494:1: rule__CsvFile__CsvFileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CsvFile__CsvFileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1498:1: ( ( RULE_STRING ) )
            // InternalMLReg.g:1499:2: ( RULE_STRING )
            {
            // InternalMLReg.g:1499:2: ( RULE_STRING )
            // InternalMLReg.g:1500:3: RULE_STRING
            {
             before(grammarAccess.getCsvFileAccess().getCsvFileSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCsvFileAccess().getCsvFileSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvFile__CsvFileAssignment_2"


    // $ANTLR start "rule__TestSize__TestSizeAssignment_3"
    // InternalMLReg.g:1509:1: rule__TestSize__TestSizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__TestSize__TestSizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1513:1: ( ( RULE_INT ) )
            // InternalMLReg.g:1514:2: ( RULE_INT )
            {
            // InternalMLReg.g:1514:2: ( RULE_INT )
            // InternalMLReg.g:1515:3: RULE_INT
            {
             before(grammarAccess.getTestSizeAccess().getTestSizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTestSizeAccess().getTestSizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestSize__TestSizeAssignment_3"


    // $ANTLR start "rule__PredictiveVars__PredictiveVarAssignment_3"
    // InternalMLReg.g:1524:1: rule__PredictiveVars__PredictiveVarAssignment_3 : ( ruleColVar ) ;
    public final void rule__PredictiveVars__PredictiveVarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1528:1: ( ( ruleColVar ) )
            // InternalMLReg.g:1529:2: ( ruleColVar )
            {
            // InternalMLReg.g:1529:2: ( ruleColVar )
            // InternalMLReg.g:1530:3: ruleColVar
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredictiveVarColVarParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColVar();

            state._fsp--;

             after(grammarAccess.getPredictiveVarsAccess().getPredictiveVarColVarParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__PredictiveVarAssignment_3"


    // $ANTLR start "rule__PredictiveVars__PredictiveVarAssignment_4_1"
    // InternalMLReg.g:1539:1: rule__PredictiveVars__PredictiveVarAssignment_4_1 : ( ruleColVar ) ;
    public final void rule__PredictiveVars__PredictiveVarAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1543:1: ( ( ruleColVar ) )
            // InternalMLReg.g:1544:2: ( ruleColVar )
            {
            // InternalMLReg.g:1544:2: ( ruleColVar )
            // InternalMLReg.g:1545:3: ruleColVar
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredictiveVarColVarParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColVar();

            state._fsp--;

             after(grammarAccess.getPredictiveVarsAccess().getPredictiveVarColVarParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveVars__PredictiveVarAssignment_4_1"


    // $ANTLR start "rule__TargetVar__TargetVarAssignment_2"
    // InternalMLReg.g:1554:1: rule__TargetVar__TargetVarAssignment_2 : ( ruleColVar ) ;
    public final void rule__TargetVar__TargetVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1558:1: ( ( ruleColVar ) )
            // InternalMLReg.g:1559:2: ( ruleColVar )
            {
            // InternalMLReg.g:1559:2: ( ruleColVar )
            // InternalMLReg.g:1560:3: ruleColVar
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarColVarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColVar();

            state._fsp--;

             after(grammarAccess.getTargetVarAccess().getTargetVarColVarParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__TargetVarAssignment_2"


    // $ANTLR start "rule__Algorithm__AlgoNameAssignment_2"
    // InternalMLReg.g:1569:1: rule__Algorithm__AlgoNameAssignment_2 : ( ruleAlgoName ) ;
    public final void rule__Algorithm__AlgoNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1573:1: ( ( ruleAlgoName ) )
            // InternalMLReg.g:1574:2: ( ruleAlgoName )
            {
            // InternalMLReg.g:1574:2: ( ruleAlgoName )
            // InternalMLReg.g:1575:3: ruleAlgoName
            {
             before(grammarAccess.getAlgorithmAccess().getAlgoNameAlgoNameEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgoName();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getAlgoNameAlgoNameEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__AlgoNameAssignment_2"


    // $ANTLR start "rule__ErrorMeasure__ErrorMeasureAssignment_2"
    // InternalMLReg.g:1584:1: rule__ErrorMeasure__ErrorMeasureAssignment_2 : ( ruleErrorCalculation ) ;
    public final void rule__ErrorMeasure__ErrorMeasureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1588:1: ( ( ruleErrorCalculation ) )
            // InternalMLReg.g:1589:2: ( ruleErrorCalculation )
            {
            // InternalMLReg.g:1589:2: ( ruleErrorCalculation )
            // InternalMLReg.g:1590:3: ruleErrorCalculation
            {
             before(grammarAccess.getErrorMeasureAccess().getErrorMeasureErrorCalculationEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleErrorCalculation();

            state._fsp--;

             after(grammarAccess.getErrorMeasureAccess().getErrorMeasureErrorCalculationEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorMeasure__ErrorMeasureAssignment_2"


    // $ANTLR start "rule__ColVar__IdColAssignment"
    // InternalMLReg.g:1599:1: rule__ColVar__IdColAssignment : ( RULE_INT ) ;
    public final void rule__ColVar__IdColAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLReg.g:1603:1: ( ( RULE_INT ) )
            // InternalMLReg.g:1604:2: ( RULE_INT )
            {
            // InternalMLReg.g:1604:2: ( RULE_INT )
            // InternalMLReg.g:1605:3: RULE_INT
            {
             before(grammarAccess.getColVarAccess().getIdColINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColVarAccess().getIdColINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColVar__IdColAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000001C000L});

}