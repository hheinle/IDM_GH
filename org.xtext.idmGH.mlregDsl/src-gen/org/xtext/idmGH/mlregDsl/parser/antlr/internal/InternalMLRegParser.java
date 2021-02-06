package org.xtext.idmGH.mlregDsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.idmGH.mlregDsl.services.MLRegGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMLRegParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'regression'", "'{'", "','", "'}'", "'file'", "':'", "'testSize'", "'predictiveVariables'", "'targetVariable'", "'algorithm'", "'errorType'", "'RegressionTree'", "'SVM'", "'Linear'", "'mean_squared_error'", "'explained_variance_score'", "'r2_score'"
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

        public InternalMLRegParser(TokenStream input, MLRegGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MLRegGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMLReg.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMLReg.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMLReg.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMLReg.g:72:1: ruleModel returns [EObject current=null] : ( (lv_mlRegression_0_0= ruleMlRegression ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mlRegression_0_0 = null;



        	enterRule();

        try {
            // InternalMLReg.g:78:2: ( ( (lv_mlRegression_0_0= ruleMlRegression ) ) )
            // InternalMLReg.g:79:2: ( (lv_mlRegression_0_0= ruleMlRegression ) )
            {
            // InternalMLReg.g:79:2: ( (lv_mlRegression_0_0= ruleMlRegression ) )
            // InternalMLReg.g:80:3: (lv_mlRegression_0_0= ruleMlRegression )
            {
            // InternalMLReg.g:80:3: (lv_mlRegression_0_0= ruleMlRegression )
            // InternalMLReg.g:81:4: lv_mlRegression_0_0= ruleMlRegression
            {

            				newCompositeNode(grammarAccess.getModelAccess().getMlRegressionMlRegressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_mlRegression_0_0=ruleMlRegression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"mlRegression",
            					lv_mlRegression_0_0,
            					"org.xtext.idmGH.mlregDsl.MLReg.MlRegression");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMlRegression"
    // InternalMLReg.g:101:1: entryRuleMlRegression returns [EObject current=null] : iv_ruleMlRegression= ruleMlRegression EOF ;
    public final EObject entryRuleMlRegression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMlRegression = null;


        try {
            // InternalMLReg.g:101:53: (iv_ruleMlRegression= ruleMlRegression EOF )
            // InternalMLReg.g:102:2: iv_ruleMlRegression= ruleMlRegression EOF
            {
             newCompositeNode(grammarAccess.getMlRegressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMlRegression=ruleMlRegression();

            state._fsp--;

             current =iv_ruleMlRegression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMlRegression"


    // $ANTLR start "ruleMlRegression"
    // InternalMLReg.g:108:1: ruleMlRegression returns [EObject current=null] : (otherlv_0= 'regression' otherlv_1= '{' ( (lv_csvFile_2_0= ruleCsvFile ) ) otherlv_3= ',' ( (lv_testSize_4_0= ruleTestSize ) ) otherlv_5= ',' ( (lv_predictiveVars_6_0= rulePredictiveVars ) ) otherlv_7= ',' ( (lv_targetVar_8_0= ruleTargetVar ) ) otherlv_9= ',' ( (lv_algorithm_10_0= ruleAlgorithm ) ) otherlv_11= ',' ( (lv_errorMeasure_12_0= ruleErrorMeasure ) ) otherlv_13= '}' ) ;
    public final EObject ruleMlRegression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_csvFile_2_0 = null;

        EObject lv_testSize_4_0 = null;

        EObject lv_predictiveVars_6_0 = null;

        EObject lv_targetVar_8_0 = null;

        EObject lv_algorithm_10_0 = null;

        EObject lv_errorMeasure_12_0 = null;



        	enterRule();

        try {
            // InternalMLReg.g:114:2: ( (otherlv_0= 'regression' otherlv_1= '{' ( (lv_csvFile_2_0= ruleCsvFile ) ) otherlv_3= ',' ( (lv_testSize_4_0= ruleTestSize ) ) otherlv_5= ',' ( (lv_predictiveVars_6_0= rulePredictiveVars ) ) otherlv_7= ',' ( (lv_targetVar_8_0= ruleTargetVar ) ) otherlv_9= ',' ( (lv_algorithm_10_0= ruleAlgorithm ) ) otherlv_11= ',' ( (lv_errorMeasure_12_0= ruleErrorMeasure ) ) otherlv_13= '}' ) )
            // InternalMLReg.g:115:2: (otherlv_0= 'regression' otherlv_1= '{' ( (lv_csvFile_2_0= ruleCsvFile ) ) otherlv_3= ',' ( (lv_testSize_4_0= ruleTestSize ) ) otherlv_5= ',' ( (lv_predictiveVars_6_0= rulePredictiveVars ) ) otherlv_7= ',' ( (lv_targetVar_8_0= ruleTargetVar ) ) otherlv_9= ',' ( (lv_algorithm_10_0= ruleAlgorithm ) ) otherlv_11= ',' ( (lv_errorMeasure_12_0= ruleErrorMeasure ) ) otherlv_13= '}' )
            {
            // InternalMLReg.g:115:2: (otherlv_0= 'regression' otherlv_1= '{' ( (lv_csvFile_2_0= ruleCsvFile ) ) otherlv_3= ',' ( (lv_testSize_4_0= ruleTestSize ) ) otherlv_5= ',' ( (lv_predictiveVars_6_0= rulePredictiveVars ) ) otherlv_7= ',' ( (lv_targetVar_8_0= ruleTargetVar ) ) otherlv_9= ',' ( (lv_algorithm_10_0= ruleAlgorithm ) ) otherlv_11= ',' ( (lv_errorMeasure_12_0= ruleErrorMeasure ) ) otherlv_13= '}' )
            // InternalMLReg.g:116:3: otherlv_0= 'regression' otherlv_1= '{' ( (lv_csvFile_2_0= ruleCsvFile ) ) otherlv_3= ',' ( (lv_testSize_4_0= ruleTestSize ) ) otherlv_5= ',' ( (lv_predictiveVars_6_0= rulePredictiveVars ) ) otherlv_7= ',' ( (lv_targetVar_8_0= ruleTargetVar ) ) otherlv_9= ',' ( (lv_algorithm_10_0= ruleAlgorithm ) ) otherlv_11= ',' ( (lv_errorMeasure_12_0= ruleErrorMeasure ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMlRegressionAccess().getRegressionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMlRegressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMLReg.g:124:3: ( (lv_csvFile_2_0= ruleCsvFile ) )
            // InternalMLReg.g:125:4: (lv_csvFile_2_0= ruleCsvFile )
            {
            // InternalMLReg.g:125:4: (lv_csvFile_2_0= ruleCsvFile )
            // InternalMLReg.g:126:5: lv_csvFile_2_0= ruleCsvFile
            {

            					newCompositeNode(grammarAccess.getMlRegressionAccess().getCsvFileCsvFileParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_csvFile_2_0=ruleCsvFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMlRegressionRule());
            					}
            					set(
            						current,
            						"csvFile",
            						lv_csvFile_2_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.CsvFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMlRegressionAccess().getCommaKeyword_3());
            		
            // InternalMLReg.g:147:3: ( (lv_testSize_4_0= ruleTestSize ) )
            // InternalMLReg.g:148:4: (lv_testSize_4_0= ruleTestSize )
            {
            // InternalMLReg.g:148:4: (lv_testSize_4_0= ruleTestSize )
            // InternalMLReg.g:149:5: lv_testSize_4_0= ruleTestSize
            {

            					newCompositeNode(grammarAccess.getMlRegressionAccess().getTestSizeTestSizeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_testSize_4_0=ruleTestSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMlRegressionRule());
            					}
            					set(
            						current,
            						"testSize",
            						lv_testSize_4_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.TestSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMlRegressionAccess().getCommaKeyword_5());
            		
            // InternalMLReg.g:170:3: ( (lv_predictiveVars_6_0= rulePredictiveVars ) )
            // InternalMLReg.g:171:4: (lv_predictiveVars_6_0= rulePredictiveVars )
            {
            // InternalMLReg.g:171:4: (lv_predictiveVars_6_0= rulePredictiveVars )
            // InternalMLReg.g:172:5: lv_predictiveVars_6_0= rulePredictiveVars
            {

            					newCompositeNode(grammarAccess.getMlRegressionAccess().getPredictiveVarsPredictiveVarsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_predictiveVars_6_0=rulePredictiveVars();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMlRegressionRule());
            					}
            					set(
            						current,
            						"predictiveVars",
            						lv_predictiveVars_6_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.PredictiveVars");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getMlRegressionAccess().getCommaKeyword_7());
            		
            // InternalMLReg.g:193:3: ( (lv_targetVar_8_0= ruleTargetVar ) )
            // InternalMLReg.g:194:4: (lv_targetVar_8_0= ruleTargetVar )
            {
            // InternalMLReg.g:194:4: (lv_targetVar_8_0= ruleTargetVar )
            // InternalMLReg.g:195:5: lv_targetVar_8_0= ruleTargetVar
            {

            					newCompositeNode(grammarAccess.getMlRegressionAccess().getTargetVarTargetVarParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_5);
            lv_targetVar_8_0=ruleTargetVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMlRegressionRule());
            					}
            					set(
            						current,
            						"targetVar",
            						lv_targetVar_8_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.TargetVar");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getMlRegressionAccess().getCommaKeyword_9());
            		
            // InternalMLReg.g:216:3: ( (lv_algorithm_10_0= ruleAlgorithm ) )
            // InternalMLReg.g:217:4: (lv_algorithm_10_0= ruleAlgorithm )
            {
            // InternalMLReg.g:217:4: (lv_algorithm_10_0= ruleAlgorithm )
            // InternalMLReg.g:218:5: lv_algorithm_10_0= ruleAlgorithm
            {

            					newCompositeNode(grammarAccess.getMlRegressionAccess().getAlgorithmAlgorithmParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_5);
            lv_algorithm_10_0=ruleAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMlRegressionRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_10_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.Algorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getMlRegressionAccess().getCommaKeyword_11());
            		
            // InternalMLReg.g:239:3: ( (lv_errorMeasure_12_0= ruleErrorMeasure ) )
            // InternalMLReg.g:240:4: (lv_errorMeasure_12_0= ruleErrorMeasure )
            {
            // InternalMLReg.g:240:4: (lv_errorMeasure_12_0= ruleErrorMeasure )
            // InternalMLReg.g:241:5: lv_errorMeasure_12_0= ruleErrorMeasure
            {

            					newCompositeNode(grammarAccess.getMlRegressionAccess().getErrorMeasureErrorMeasureParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_errorMeasure_12_0=ruleErrorMeasure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMlRegressionRule());
            					}
            					set(
            						current,
            						"errorMeasure",
            						lv_errorMeasure_12_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.ErrorMeasure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMlRegressionAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMlRegression"


    // $ANTLR start "entryRuleCsvFile"
    // InternalMLReg.g:266:1: entryRuleCsvFile returns [EObject current=null] : iv_ruleCsvFile= ruleCsvFile EOF ;
    public final EObject entryRuleCsvFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvFile = null;


        try {
            // InternalMLReg.g:266:48: (iv_ruleCsvFile= ruleCsvFile EOF )
            // InternalMLReg.g:267:2: iv_ruleCsvFile= ruleCsvFile EOF
            {
             newCompositeNode(grammarAccess.getCsvFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsvFile=ruleCsvFile();

            state._fsp--;

             current =iv_ruleCsvFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCsvFile"


    // $ANTLR start "ruleCsvFile"
    // InternalMLReg.g:273:1: ruleCsvFile returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= ':' ( (lv_csvFile_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCsvFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_csvFile_2_0=null;


        	enterRule();

        try {
            // InternalMLReg.g:279:2: ( (otherlv_0= 'file' otherlv_1= ':' ( (lv_csvFile_2_0= RULE_STRING ) ) ) )
            // InternalMLReg.g:280:2: (otherlv_0= 'file' otherlv_1= ':' ( (lv_csvFile_2_0= RULE_STRING ) ) )
            {
            // InternalMLReg.g:280:2: (otherlv_0= 'file' otherlv_1= ':' ( (lv_csvFile_2_0= RULE_STRING ) ) )
            // InternalMLReg.g:281:3: otherlv_0= 'file' otherlv_1= ':' ( (lv_csvFile_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCsvFileAccess().getFileKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCsvFileAccess().getColonKeyword_1());
            		
            // InternalMLReg.g:289:3: ( (lv_csvFile_2_0= RULE_STRING ) )
            // InternalMLReg.g:290:4: (lv_csvFile_2_0= RULE_STRING )
            {
            // InternalMLReg.g:290:4: (lv_csvFile_2_0= RULE_STRING )
            // InternalMLReg.g:291:5: lv_csvFile_2_0= RULE_STRING
            {
            lv_csvFile_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_csvFile_2_0, grammarAccess.getCsvFileAccess().getCsvFileSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCsvFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"csvFile",
            						lv_csvFile_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCsvFile"


    // $ANTLR start "entryRuleTestSize"
    // InternalMLReg.g:311:1: entryRuleTestSize returns [EObject current=null] : iv_ruleTestSize= ruleTestSize EOF ;
    public final EObject entryRuleTestSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestSize = null;


        try {
            // InternalMLReg.g:311:49: (iv_ruleTestSize= ruleTestSize EOF )
            // InternalMLReg.g:312:2: iv_ruleTestSize= ruleTestSize EOF
            {
             newCompositeNode(grammarAccess.getTestSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestSize=ruleTestSize();

            state._fsp--;

             current =iv_ruleTestSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestSize"


    // $ANTLR start "ruleTestSize"
    // InternalMLReg.g:318:1: ruleTestSize returns [EObject current=null] : ( () otherlv_1= 'testSize' otherlv_2= ':' ( (lv_testSize_3_0= RULE_INT ) ) ) ;
    public final EObject ruleTestSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_testSize_3_0=null;


        	enterRule();

        try {
            // InternalMLReg.g:324:2: ( ( () otherlv_1= 'testSize' otherlv_2= ':' ( (lv_testSize_3_0= RULE_INT ) ) ) )
            // InternalMLReg.g:325:2: ( () otherlv_1= 'testSize' otherlv_2= ':' ( (lv_testSize_3_0= RULE_INT ) ) )
            {
            // InternalMLReg.g:325:2: ( () otherlv_1= 'testSize' otherlv_2= ':' ( (lv_testSize_3_0= RULE_INT ) ) )
            // InternalMLReg.g:326:3: () otherlv_1= 'testSize' otherlv_2= ':' ( (lv_testSize_3_0= RULE_INT ) )
            {
            // InternalMLReg.g:326:3: ()
            // InternalMLReg.g:327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestSizeAccess().getTestSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTestSizeAccess().getTestSizeKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getTestSizeAccess().getColonKeyword_2());
            		
            // InternalMLReg.g:341:3: ( (lv_testSize_3_0= RULE_INT ) )
            // InternalMLReg.g:342:4: (lv_testSize_3_0= RULE_INT )
            {
            // InternalMLReg.g:342:4: (lv_testSize_3_0= RULE_INT )
            // InternalMLReg.g:343:5: lv_testSize_3_0= RULE_INT
            {
            lv_testSize_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_testSize_3_0, grammarAccess.getTestSizeAccess().getTestSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"testSize",
            						lv_testSize_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestSize"


    // $ANTLR start "entryRulePredictiveVars"
    // InternalMLReg.g:363:1: entryRulePredictiveVars returns [EObject current=null] : iv_rulePredictiveVars= rulePredictiveVars EOF ;
    public final EObject entryRulePredictiveVars() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictiveVars = null;


        try {
            // InternalMLReg.g:363:55: (iv_rulePredictiveVars= rulePredictiveVars EOF )
            // InternalMLReg.g:364:2: iv_rulePredictiveVars= rulePredictiveVars EOF
            {
             newCompositeNode(grammarAccess.getPredictiveVarsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredictiveVars=rulePredictiveVars();

            state._fsp--;

             current =iv_rulePredictiveVars; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredictiveVars"


    // $ANTLR start "rulePredictiveVars"
    // InternalMLReg.g:370:1: rulePredictiveVars returns [EObject current=null] : (otherlv_0= 'predictiveVariables' otherlv_1= ':' otherlv_2= '{' ( (lv_predictiveVar_3_0= ruleColVar ) ) (otherlv_4= ',' ( (lv_predictiveVar_5_0= ruleColVar ) ) )* otherlv_6= '}' ) ;
    public final EObject rulePredictiveVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_predictiveVar_3_0 = null;

        EObject lv_predictiveVar_5_0 = null;



        	enterRule();

        try {
            // InternalMLReg.g:376:2: ( (otherlv_0= 'predictiveVariables' otherlv_1= ':' otherlv_2= '{' ( (lv_predictiveVar_3_0= ruleColVar ) ) (otherlv_4= ',' ( (lv_predictiveVar_5_0= ruleColVar ) ) )* otherlv_6= '}' ) )
            // InternalMLReg.g:377:2: (otherlv_0= 'predictiveVariables' otherlv_1= ':' otherlv_2= '{' ( (lv_predictiveVar_3_0= ruleColVar ) ) (otherlv_4= ',' ( (lv_predictiveVar_5_0= ruleColVar ) ) )* otherlv_6= '}' )
            {
            // InternalMLReg.g:377:2: (otherlv_0= 'predictiveVariables' otherlv_1= ':' otherlv_2= '{' ( (lv_predictiveVar_3_0= ruleColVar ) ) (otherlv_4= ',' ( (lv_predictiveVar_5_0= ruleColVar ) ) )* otherlv_6= '}' )
            // InternalMLReg.g:378:3: otherlv_0= 'predictiveVariables' otherlv_1= ':' otherlv_2= '{' ( (lv_predictiveVar_3_0= ruleColVar ) ) (otherlv_4= ',' ( (lv_predictiveVar_5_0= ruleColVar ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPredictiveVarsAccess().getPredictiveVariablesKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPredictiveVarsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPredictiveVarsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMLReg.g:390:3: ( (lv_predictiveVar_3_0= ruleColVar ) )
            // InternalMLReg.g:391:4: (lv_predictiveVar_3_0= ruleColVar )
            {
            // InternalMLReg.g:391:4: (lv_predictiveVar_3_0= ruleColVar )
            // InternalMLReg.g:392:5: lv_predictiveVar_3_0= ruleColVar
            {

            					newCompositeNode(grammarAccess.getPredictiveVarsAccess().getPredictiveVarColVarParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_predictiveVar_3_0=ruleColVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredictiveVarsRule());
            					}
            					add(
            						current,
            						"predictiveVar",
            						lv_predictiveVar_3_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.ColVar");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMLReg.g:409:3: (otherlv_4= ',' ( (lv_predictiveVar_5_0= ruleColVar ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMLReg.g:410:4: otherlv_4= ',' ( (lv_predictiveVar_5_0= ruleColVar ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPredictiveVarsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMLReg.g:414:4: ( (lv_predictiveVar_5_0= ruleColVar ) )
            	    // InternalMLReg.g:415:5: (lv_predictiveVar_5_0= ruleColVar )
            	    {
            	    // InternalMLReg.g:415:5: (lv_predictiveVar_5_0= ruleColVar )
            	    // InternalMLReg.g:416:6: lv_predictiveVar_5_0= ruleColVar
            	    {

            	    						newCompositeNode(grammarAccess.getPredictiveVarsAccess().getPredictiveVarColVarParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_predictiveVar_5_0=ruleColVar();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPredictiveVarsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"predictiveVar",
            	    							lv_predictiveVar_5_0,
            	    							"org.xtext.idmGH.mlregDsl.MLReg.ColVar");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPredictiveVarsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredictiveVars"


    // $ANTLR start "entryRuleTargetVar"
    // InternalMLReg.g:442:1: entryRuleTargetVar returns [EObject current=null] : iv_ruleTargetVar= ruleTargetVar EOF ;
    public final EObject entryRuleTargetVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetVar = null;


        try {
            // InternalMLReg.g:442:50: (iv_ruleTargetVar= ruleTargetVar EOF )
            // InternalMLReg.g:443:2: iv_ruleTargetVar= ruleTargetVar EOF
            {
             newCompositeNode(grammarAccess.getTargetVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetVar=ruleTargetVar();

            state._fsp--;

             current =iv_ruleTargetVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetVar"


    // $ANTLR start "ruleTargetVar"
    // InternalMLReg.g:449:1: ruleTargetVar returns [EObject current=null] : (otherlv_0= 'targetVariable' otherlv_1= ':' ( (lv_targetVar_2_0= ruleColVar ) ) ) ;
    public final EObject ruleTargetVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_targetVar_2_0 = null;



        	enterRule();

        try {
            // InternalMLReg.g:455:2: ( (otherlv_0= 'targetVariable' otherlv_1= ':' ( (lv_targetVar_2_0= ruleColVar ) ) ) )
            // InternalMLReg.g:456:2: (otherlv_0= 'targetVariable' otherlv_1= ':' ( (lv_targetVar_2_0= ruleColVar ) ) )
            {
            // InternalMLReg.g:456:2: (otherlv_0= 'targetVariable' otherlv_1= ':' ( (lv_targetVar_2_0= ruleColVar ) ) )
            // InternalMLReg.g:457:3: otherlv_0= 'targetVariable' otherlv_1= ':' ( (lv_targetVar_2_0= ruleColVar ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetVarAccess().getTargetVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetVarAccess().getColonKeyword_1());
            		
            // InternalMLReg.g:465:3: ( (lv_targetVar_2_0= ruleColVar ) )
            // InternalMLReg.g:466:4: (lv_targetVar_2_0= ruleColVar )
            {
            // InternalMLReg.g:466:4: (lv_targetVar_2_0= ruleColVar )
            // InternalMLReg.g:467:5: lv_targetVar_2_0= ruleColVar
            {

            					newCompositeNode(grammarAccess.getTargetVarAccess().getTargetVarColVarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_targetVar_2_0=ruleColVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetVarRule());
            					}
            					set(
            						current,
            						"targetVar",
            						lv_targetVar_2_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.ColVar");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetVar"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalMLReg.g:488:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalMLReg.g:488:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalMLReg.g:489:2: iv_ruleAlgorithm= ruleAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithm=ruleAlgorithm();

            state._fsp--;

             current =iv_ruleAlgorithm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalMLReg.g:495:1: ruleAlgorithm returns [EObject current=null] : (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algoName_2_0= ruleAlgoName ) ) ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_algoName_2_0 = null;



        	enterRule();

        try {
            // InternalMLReg.g:501:2: ( (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algoName_2_0= ruleAlgoName ) ) ) )
            // InternalMLReg.g:502:2: (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algoName_2_0= ruleAlgoName ) ) )
            {
            // InternalMLReg.g:502:2: (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algoName_2_0= ruleAlgoName ) ) )
            // InternalMLReg.g:503:3: otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algoName_2_0= ruleAlgoName ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmAccess().getColonKeyword_1());
            		
            // InternalMLReg.g:511:3: ( (lv_algoName_2_0= ruleAlgoName ) )
            // InternalMLReg.g:512:4: (lv_algoName_2_0= ruleAlgoName )
            {
            // InternalMLReg.g:512:4: (lv_algoName_2_0= ruleAlgoName )
            // InternalMLReg.g:513:5: lv_algoName_2_0= ruleAlgoName
            {

            					newCompositeNode(grammarAccess.getAlgorithmAccess().getAlgoNameAlgoNameEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_algoName_2_0=ruleAlgoName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            					}
            					set(
            						current,
            						"algoName",
            						lv_algoName_2_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.AlgoName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleErrorMeasure"
    // InternalMLReg.g:534:1: entryRuleErrorMeasure returns [EObject current=null] : iv_ruleErrorMeasure= ruleErrorMeasure EOF ;
    public final EObject entryRuleErrorMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorMeasure = null;


        try {
            // InternalMLReg.g:534:53: (iv_ruleErrorMeasure= ruleErrorMeasure EOF )
            // InternalMLReg.g:535:2: iv_ruleErrorMeasure= ruleErrorMeasure EOF
            {
             newCompositeNode(grammarAccess.getErrorMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorMeasure=ruleErrorMeasure();

            state._fsp--;

             current =iv_ruleErrorMeasure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorMeasure"


    // $ANTLR start "ruleErrorMeasure"
    // InternalMLReg.g:541:1: ruleErrorMeasure returns [EObject current=null] : (otherlv_0= 'errorType' otherlv_1= ':' ( (lv_errorMeasure_2_0= ruleErrorCalculation ) ) ) ;
    public final EObject ruleErrorMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_errorMeasure_2_0 = null;



        	enterRule();

        try {
            // InternalMLReg.g:547:2: ( (otherlv_0= 'errorType' otherlv_1= ':' ( (lv_errorMeasure_2_0= ruleErrorCalculation ) ) ) )
            // InternalMLReg.g:548:2: (otherlv_0= 'errorType' otherlv_1= ':' ( (lv_errorMeasure_2_0= ruleErrorCalculation ) ) )
            {
            // InternalMLReg.g:548:2: (otherlv_0= 'errorType' otherlv_1= ':' ( (lv_errorMeasure_2_0= ruleErrorCalculation ) ) )
            // InternalMLReg.g:549:3: otherlv_0= 'errorType' otherlv_1= ':' ( (lv_errorMeasure_2_0= ruleErrorCalculation ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorMeasureAccess().getErrorTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorMeasureAccess().getColonKeyword_1());
            		
            // InternalMLReg.g:557:3: ( (lv_errorMeasure_2_0= ruleErrorCalculation ) )
            // InternalMLReg.g:558:4: (lv_errorMeasure_2_0= ruleErrorCalculation )
            {
            // InternalMLReg.g:558:4: (lv_errorMeasure_2_0= ruleErrorCalculation )
            // InternalMLReg.g:559:5: lv_errorMeasure_2_0= ruleErrorCalculation
            {

            					newCompositeNode(grammarAccess.getErrorMeasureAccess().getErrorMeasureErrorCalculationEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_errorMeasure_2_0=ruleErrorCalculation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorMeasureRule());
            					}
            					set(
            						current,
            						"errorMeasure",
            						lv_errorMeasure_2_0,
            						"org.xtext.idmGH.mlregDsl.MLReg.ErrorCalculation");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorMeasure"


    // $ANTLR start "entryRuleColVar"
    // InternalMLReg.g:580:1: entryRuleColVar returns [EObject current=null] : iv_ruleColVar= ruleColVar EOF ;
    public final EObject entryRuleColVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColVar = null;


        try {
            // InternalMLReg.g:580:47: (iv_ruleColVar= ruleColVar EOF )
            // InternalMLReg.g:581:2: iv_ruleColVar= ruleColVar EOF
            {
             newCompositeNode(grammarAccess.getColVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColVar=ruleColVar();

            state._fsp--;

             current =iv_ruleColVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColVar"


    // $ANTLR start "ruleColVar"
    // InternalMLReg.g:587:1: ruleColVar returns [EObject current=null] : ( (lv_idCol_0_0= RULE_INT ) ) ;
    public final EObject ruleColVar() throws RecognitionException {
        EObject current = null;

        Token lv_idCol_0_0=null;


        	enterRule();

        try {
            // InternalMLReg.g:593:2: ( ( (lv_idCol_0_0= RULE_INT ) ) )
            // InternalMLReg.g:594:2: ( (lv_idCol_0_0= RULE_INT ) )
            {
            // InternalMLReg.g:594:2: ( (lv_idCol_0_0= RULE_INT ) )
            // InternalMLReg.g:595:3: (lv_idCol_0_0= RULE_INT )
            {
            // InternalMLReg.g:595:3: (lv_idCol_0_0= RULE_INT )
            // InternalMLReg.g:596:4: lv_idCol_0_0= RULE_INT
            {
            lv_idCol_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_idCol_0_0, grammarAccess.getColVarAccess().getIdColINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColVarRule());
            				}
            				setWithLastConsumed(
            					current,
            					"idCol",
            					lv_idCol_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColVar"


    // $ANTLR start "ruleAlgoName"
    // InternalMLReg.g:615:1: ruleAlgoName returns [Enumerator current=null] : ( (enumLiteral_0= 'RegressionTree' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'Linear' ) ) ;
    public final Enumerator ruleAlgoName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMLReg.g:621:2: ( ( (enumLiteral_0= 'RegressionTree' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'Linear' ) ) )
            // InternalMLReg.g:622:2: ( (enumLiteral_0= 'RegressionTree' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'Linear' ) )
            {
            // InternalMLReg.g:622:2: ( (enumLiteral_0= 'RegressionTree' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'Linear' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
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
                    // InternalMLReg.g:623:3: (enumLiteral_0= 'RegressionTree' )
                    {
                    // InternalMLReg.g:623:3: (enumLiteral_0= 'RegressionTree' )
                    // InternalMLReg.g:624:4: enumLiteral_0= 'RegressionTree'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAlgoNameAccess().getRegressionTreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlgoNameAccess().getRegressionTreeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMLReg.g:631:3: (enumLiteral_1= 'SVM' )
                    {
                    // InternalMLReg.g:631:3: (enumLiteral_1= 'SVM' )
                    // InternalMLReg.g:632:4: enumLiteral_1= 'SVM'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAlgoNameAccess().getSVMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlgoNameAccess().getSVMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMLReg.g:639:3: (enumLiteral_2= 'Linear' )
                    {
                    // InternalMLReg.g:639:3: (enumLiteral_2= 'Linear' )
                    // InternalMLReg.g:640:4: enumLiteral_2= 'Linear'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAlgoNameAccess().getLinearEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlgoNameAccess().getLinearEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgoName"


    // $ANTLR start "ruleErrorCalculation"
    // InternalMLReg.g:650:1: ruleErrorCalculation returns [Enumerator current=null] : ( (enumLiteral_0= 'mean_squared_error' ) | (enumLiteral_1= 'explained_variance_score' ) | (enumLiteral_2= 'r2_score' ) ) ;
    public final Enumerator ruleErrorCalculation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMLReg.g:656:2: ( ( (enumLiteral_0= 'mean_squared_error' ) | (enumLiteral_1= 'explained_variance_score' ) | (enumLiteral_2= 'r2_score' ) ) )
            // InternalMLReg.g:657:2: ( (enumLiteral_0= 'mean_squared_error' ) | (enumLiteral_1= 'explained_variance_score' ) | (enumLiteral_2= 'r2_score' ) )
            {
            // InternalMLReg.g:657:2: ( (enumLiteral_0= 'mean_squared_error' ) | (enumLiteral_1= 'explained_variance_score' ) | (enumLiteral_2= 'r2_score' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMLReg.g:658:3: (enumLiteral_0= 'mean_squared_error' )
                    {
                    // InternalMLReg.g:658:3: (enumLiteral_0= 'mean_squared_error' )
                    // InternalMLReg.g:659:4: enumLiteral_0= 'mean_squared_error'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getErrorCalculationAccess().getMean_squared_errorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getErrorCalculationAccess().getMean_squared_errorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMLReg.g:666:3: (enumLiteral_1= 'explained_variance_score' )
                    {
                    // InternalMLReg.g:666:3: (enumLiteral_1= 'explained_variance_score' )
                    // InternalMLReg.g:667:4: enumLiteral_1= 'explained_variance_score'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getErrorCalculationAccess().getExplained_variance_scoreEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getErrorCalculationAccess().getExplained_variance_scoreEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMLReg.g:674:3: (enumLiteral_2= 'r2_score' )
                    {
                    // InternalMLReg.g:674:3: (enumLiteral_2= 'r2_score' )
                    // InternalMLReg.g:675:4: enumLiteral_2= 'r2_score'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getErrorCalculationAccess().getR2_scoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getErrorCalculationAccess().getR2_scoreEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorCalculation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000E000000L});

}