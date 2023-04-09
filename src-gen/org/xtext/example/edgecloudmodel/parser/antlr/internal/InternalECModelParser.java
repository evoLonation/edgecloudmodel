package org.xtext.example.edgecloudmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.edgecloudmodel.services.ECModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalECModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE_QUOTED_STRING", "RULE_ID", "RULE_SINGLE_QUOTED_STRING", "RULE_INT", "RULE_ESCAPED_CHARACTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'RequirementsModel::'", "'@Description('", "')'", "'Interaction'", "'{'", "'[Participants:'", "']'", "'}'", "'CallMessage::'", "'('", "'->'", "'ReturnMessage::'", "'Execution::'", "'CombinedFragment::'", "'loop'", "'alt'", "'option'", "'Operand::'", "'MessageEnd::'", "'ExecutionEnd::'", "'CombinedFragmentEnd::'", "'OperandEnd::'", "'DomainModel'", "'UseCaseModel'", "'Actor'", "'extends'", "'UC'", "'::'", "','", "'definedBySSD'", "'relatedService'", "'Service'", "'[Operation]'", "'[TempProperty]'", "'[WorkFlow]'", "'[INV]'", "':'", "'ActivityFinal'", "'ActivityStart'", "'ForkNode'", "'JoinNode'", "'Loop'", "'Switch'", "'case:'", "'default:'", "'@AutoCRUD'", "'Entity'", "'[Refer]'", "'*'", "'!'", "'@-'", "'*-'", "'inv'", "'ASSOCINV'", "'['", "'|'", "'include'", "'extend'", "'Contract'", "'definition'", "'precondition'", "'postcondition'", "'and'", "'or'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'/'", "'+'", "'-'", "'one'", "'exists'", "'select'", "'any'", "'forAll'", "'collect'", "'isUnique'", "'.'", "'oclIsNew()'", "'oclIsUndefined()'", "'isEmpty()'", "'notEmpty()'", "'oclIsInvaild()'", "'size()'", "'sum()'", "'oclIsTypeOf'", "'includes'", "'excludes'", "'includesAll'", "'excludesAll'", "'After'", "'Before'", "'isAfter'", "'isBefore'", "'isEqual'", "'allInstance()'", "'@'", "'pre'", "'self'", "'result'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'Tuple'", "'..'", "'true'", "'false'", "'null'", "'invalid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'Date'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Association'", "'Aggregation'", "'Composition'"
    };
    public static final int T__143=143;
    public static final int T__50=50;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SINGLE_QUOTED_STRING=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=4;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_ESCAPED_CHARACTER=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalECModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalECModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalECModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalECModel.g"; }



     	private ECModelGrammarAccess grammarAccess;

        public InternalECModelParser(TokenStream input, ECModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RequirementModel";
       	}

       	@Override
       	protected ECModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRequirementModel"
    // InternalECModel.g:64:1: entryRuleRequirementModel returns [EObject current=null] : iv_ruleRequirementModel= ruleRequirementModel EOF ;
    public final EObject entryRuleRequirementModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementModel = null;


        try {
            // InternalECModel.g:64:57: (iv_ruleRequirementModel= ruleRequirementModel EOF )
            // InternalECModel.g:65:2: iv_ruleRequirementModel= ruleRequirementModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequirementModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequirementModel=ruleRequirementModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequirementModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequirementModel"


    // $ANTLR start "ruleRequirementModel"
    // InternalECModel.g:71:1: ruleRequirementModel returns [EObject current=null] : ( (otherlv_0= 'RequirementsModel::' ( (lv_name_1_0= ruleSimpleNameCS ) ) )? (otherlv_2= '@Description(' ( (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? ( (lv_UseCaseModel_5_0= ruleUseCaseModel ) ) ( (lv_DomainModel_6_0= ruleDomainModel ) ) ) ;
    public final EObject ruleRequirementModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_UseCaseModel_5_0 = null;

        EObject lv_DomainModel_6_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:77:2: ( ( (otherlv_0= 'RequirementsModel::' ( (lv_name_1_0= ruleSimpleNameCS ) ) )? (otherlv_2= '@Description(' ( (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? ( (lv_UseCaseModel_5_0= ruleUseCaseModel ) ) ( (lv_DomainModel_6_0= ruleDomainModel ) ) ) )
            // InternalECModel.g:78:2: ( (otherlv_0= 'RequirementsModel::' ( (lv_name_1_0= ruleSimpleNameCS ) ) )? (otherlv_2= '@Description(' ( (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? ( (lv_UseCaseModel_5_0= ruleUseCaseModel ) ) ( (lv_DomainModel_6_0= ruleDomainModel ) ) )
            {
            // InternalECModel.g:78:2: ( (otherlv_0= 'RequirementsModel::' ( (lv_name_1_0= ruleSimpleNameCS ) ) )? (otherlv_2= '@Description(' ( (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? ( (lv_UseCaseModel_5_0= ruleUseCaseModel ) ) ( (lv_DomainModel_6_0= ruleDomainModel ) ) )
            // InternalECModel.g:79:3: (otherlv_0= 'RequirementsModel::' ( (lv_name_1_0= ruleSimpleNameCS ) ) )? (otherlv_2= '@Description(' ( (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? ( (lv_UseCaseModel_5_0= ruleUseCaseModel ) ) ( (lv_DomainModel_6_0= ruleDomainModel ) )
            {
            // InternalECModel.g:79:3: (otherlv_0= 'RequirementsModel::' ( (lv_name_1_0= ruleSimpleNameCS ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalECModel.g:80:4: otherlv_0= 'RequirementsModel::' ( (lv_name_1_0= ruleSimpleNameCS ) )
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getRequirementModelAccess().getRequirementsModelKeyword_0_0());
                      			
                    }
                    // InternalECModel.g:84:4: ( (lv_name_1_0= ruleSimpleNameCS ) )
                    // InternalECModel.g:85:5: (lv_name_1_0= ruleSimpleNameCS )
                    {
                    // InternalECModel.g:85:5: (lv_name_1_0= ruleSimpleNameCS )
                    // InternalECModel.g:86:6: lv_name_1_0= ruleSimpleNameCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRequirementModelAccess().getNameSimpleNameCSParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleSimpleNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRequirementModelRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalECModel.g:104:3: (otherlv_2= '@Description(' ( (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalECModel.g:105:4: otherlv_2= '@Description(' ( (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRequirementModelAccess().getDescriptionKeyword_1_0());
                      			
                    }
                    // InternalECModel.g:109:4: ( (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING ) )
                    // InternalECModel.g:110:5: (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:110:5: (lv_description_3_0= RULE_DOUBLE_QUOTED_STRING )
                    // InternalECModel.g:111:6: lv_description_3_0= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_3_0, grammarAccess.getRequirementModelAccess().getDescriptionDOUBLE_QUOTED_STRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRequirementModelRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_3_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRequirementModelAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:132:3: ( (lv_UseCaseModel_5_0= ruleUseCaseModel ) )
            // InternalECModel.g:133:4: (lv_UseCaseModel_5_0= ruleUseCaseModel )
            {
            // InternalECModel.g:133:4: (lv_UseCaseModel_5_0= ruleUseCaseModel )
            // InternalECModel.g:134:5: lv_UseCaseModel_5_0= ruleUseCaseModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRequirementModelAccess().getUseCaseModelUseCaseModelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_UseCaseModel_5_0=ruleUseCaseModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRequirementModelRule());
              					}
              					set(
              						current,
              						"UseCaseModel",
              						lv_UseCaseModel_5_0,
              						"org.xtext.example.edgecloudmodel.ECModel.UseCaseModel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:151:3: ( (lv_DomainModel_6_0= ruleDomainModel ) )
            // InternalECModel.g:152:4: (lv_DomainModel_6_0= ruleDomainModel )
            {
            // InternalECModel.g:152:4: (lv_DomainModel_6_0= ruleDomainModel )
            // InternalECModel.g:153:5: lv_DomainModel_6_0= ruleDomainModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRequirementModelAccess().getDomainModelDomainModelParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_DomainModel_6_0=ruleDomainModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRequirementModelRule());
              					}
              					set(
              						current,
              						"DomainModel",
              						lv_DomainModel_6_0,
              						"org.xtext.example.edgecloudmodel.ECModel.DomainModel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRequirementModel"


    // $ANTLR start "entryRuleInteraction"
    // InternalECModel.g:174:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalECModel.g:174:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalECModel.g:175:2: iv_ruleInteraction= ruleInteraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteraction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalECModel.g:181:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'Interaction' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' otherlv_3= '[Participants:' ( (otherlv_4= RULE_ID ) )* otherlv_5= ']' ( (lv_messages_6_0= ruleMessage ) )* ( (lv_executions_7_0= ruleExecution ) )* ( (lv_combinedFragments_8_0= ruleCombinedFragment ) )* ( (lv_ends_9_0= ruleAbstractEnd ) )* otherlv_10= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_messages_6_0 = null;

        EObject lv_executions_7_0 = null;

        EObject lv_combinedFragments_8_0 = null;

        EObject lv_ends_9_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:187:2: ( (otherlv_0= 'Interaction' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' otherlv_3= '[Participants:' ( (otherlv_4= RULE_ID ) )* otherlv_5= ']' ( (lv_messages_6_0= ruleMessage ) )* ( (lv_executions_7_0= ruleExecution ) )* ( (lv_combinedFragments_8_0= ruleCombinedFragment ) )* ( (lv_ends_9_0= ruleAbstractEnd ) )* otherlv_10= '}' ) )
            // InternalECModel.g:188:2: (otherlv_0= 'Interaction' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' otherlv_3= '[Participants:' ( (otherlv_4= RULE_ID ) )* otherlv_5= ']' ( (lv_messages_6_0= ruleMessage ) )* ( (lv_executions_7_0= ruleExecution ) )* ( (lv_combinedFragments_8_0= ruleCombinedFragment ) )* ( (lv_ends_9_0= ruleAbstractEnd ) )* otherlv_10= '}' )
            {
            // InternalECModel.g:188:2: (otherlv_0= 'Interaction' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' otherlv_3= '[Participants:' ( (otherlv_4= RULE_ID ) )* otherlv_5= ']' ( (lv_messages_6_0= ruleMessage ) )* ( (lv_executions_7_0= ruleExecution ) )* ( (lv_combinedFragments_8_0= ruleCombinedFragment ) )* ( (lv_ends_9_0= ruleAbstractEnd ) )* otherlv_10= '}' )
            // InternalECModel.g:189:3: otherlv_0= 'Interaction' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' otherlv_3= '[Participants:' ( (otherlv_4= RULE_ID ) )* otherlv_5= ']' ( (lv_messages_6_0= ruleMessage ) )* ( (lv_executions_7_0= ruleExecution ) )* ( (lv_combinedFragments_8_0= ruleCombinedFragment ) )* ( (lv_ends_9_0= ruleAbstractEnd ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
              		
            }
            // InternalECModel.g:193:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:194:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:194:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:195:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInteractionAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInteractionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getParticipantsKeyword_3());
              		
            }
            // InternalECModel.g:220:3: ( (otherlv_4= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalECModel.g:221:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalECModel.g:221:4: (otherlv_4= RULE_ID )
            	    // InternalECModel.g:222:5: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getInteractionRule());
            	      					}
            	      				
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getInteractionAccess().getParticipantsParticipantCrossReference_4_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getInteractionAccess().getRightSquareBracketKeyword_5());
              		
            }
            // InternalECModel.g:237:3: ( (lv_messages_6_0= ruleMessage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20||LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalECModel.g:238:4: (lv_messages_6_0= ruleMessage )
            	    {
            	    // InternalECModel.g:238:4: (lv_messages_6_0= ruleMessage )
            	    // InternalECModel.g:239:5: lv_messages_6_0= ruleMessage
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInteractionAccess().getMessagesMessageParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_messages_6_0=ruleMessage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"messages",
            	      						lv_messages_6_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.Message");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalECModel.g:256:3: ( (lv_executions_7_0= ruleExecution ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalECModel.g:257:4: (lv_executions_7_0= ruleExecution )
            	    {
            	    // InternalECModel.g:257:4: (lv_executions_7_0= ruleExecution )
            	    // InternalECModel.g:258:5: lv_executions_7_0= ruleExecution
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInteractionAccess().getExecutionsExecutionParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_executions_7_0=ruleExecution();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"executions",
            	      						lv_executions_7_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.Execution");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalECModel.g:275:3: ( (lv_combinedFragments_8_0= ruleCombinedFragment ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalECModel.g:276:4: (lv_combinedFragments_8_0= ruleCombinedFragment )
            	    {
            	    // InternalECModel.g:276:4: (lv_combinedFragments_8_0= ruleCombinedFragment )
            	    // InternalECModel.g:277:5: lv_combinedFragments_8_0= ruleCombinedFragment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInteractionAccess().getCombinedFragmentsCombinedFragmentParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_combinedFragments_8_0=ruleCombinedFragment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"combinedFragments",
            	      						lv_combinedFragments_8_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.CombinedFragment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalECModel.g:294:3: ( (lv_ends_9_0= ruleAbstractEnd ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=30 && LA7_0<=33)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalECModel.g:295:4: (lv_ends_9_0= ruleAbstractEnd )
            	    {
            	    // InternalECModel.g:295:4: (lv_ends_9_0= ruleAbstractEnd )
            	    // InternalECModel.g:296:5: lv_ends_9_0= ruleAbstractEnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInteractionAccess().getEndsAbstractEndParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_ends_9_0=ruleAbstractEnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ends",
            	      						lv_ends_9_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.AbstractEnd");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleMessage"
    // InternalECModel.g:321:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalECModel.g:321:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalECModel.g:322:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalECModel.g:328:1: ruleMessage returns [EObject current=null] : (this_CallMessage_0= ruleCallMessage | this_ReturnMessage_1= ruleReturnMessage ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_CallMessage_0 = null;

        EObject this_ReturnMessage_1 = null;



        	enterRule();

        try {
            // InternalECModel.g:334:2: ( (this_CallMessage_0= ruleCallMessage | this_ReturnMessage_1= ruleReturnMessage ) )
            // InternalECModel.g:335:2: (this_CallMessage_0= ruleCallMessage | this_ReturnMessage_1= ruleReturnMessage )
            {
            // InternalECModel.g:335:2: (this_CallMessage_0= ruleCallMessage | this_ReturnMessage_1= ruleReturnMessage )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalECModel.g:336:3: this_CallMessage_0= ruleCallMessage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMessageAccess().getCallMessageParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CallMessage_0=ruleCallMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CallMessage_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:345:3: this_ReturnMessage_1= ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMessageAccess().getReturnMessageParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnMessage_1=ruleReturnMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReturnMessage_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleCallMessage"
    // InternalECModel.g:357:1: entryRuleCallMessage returns [EObject current=null] : iv_ruleCallMessage= ruleCallMessage EOF ;
    public final EObject entryRuleCallMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallMessage = null;


        try {
            // InternalECModel.g:357:52: (iv_ruleCallMessage= ruleCallMessage EOF )
            // InternalECModel.g:358:2: iv_ruleCallMessage= ruleCallMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallMessageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallMessage=ruleCallMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallMessage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCallMessage"


    // $ANTLR start "ruleCallMessage"
    // InternalECModel.g:364:1: ruleCallMessage returns [EObject current=null] : (otherlv_0= 'CallMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleCallMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:370:2: ( (otherlv_0= 'CallMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalECModel.g:371:2: (otherlv_0= 'CallMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalECModel.g:371:2: (otherlv_0= 'CallMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalECModel.g:372:3: otherlv_0= 'CallMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCallMessageAccess().getCallMessageKeyword_0());
              		
            }
            // InternalECModel.g:376:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:377:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:377:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:378:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCallMessageAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCallMessageRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalECModel.g:399:3: ( (otherlv_3= RULE_ID ) )
            // InternalECModel.g:400:4: (otherlv_3= RULE_ID )
            {
            // InternalECModel.g:400:4: (otherlv_3= RULE_ID )
            // InternalECModel.g:401:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCallMessageRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getCallMessageAccess().getOpOperationCrossReference_3_0());
              				
            }

            }


            }

            // InternalECModel.g:412:3: ( (otherlv_4= RULE_ID ) )
            // InternalECModel.g:413:4: (otherlv_4= RULE_ID )
            {
            // InternalECModel.g:413:4: (otherlv_4= RULE_ID )
            // InternalECModel.g:414:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCallMessageRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getCallMessageAccess().getSendingEndMixEndCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCallMessageAccess().getHyphenMinusGreaterThanSignKeyword_5());
              		
            }
            // InternalECModel.g:429:3: ( (otherlv_6= RULE_ID ) )
            // InternalECModel.g:430:4: (otherlv_6= RULE_ID )
            {
            // InternalECModel.g:430:4: (otherlv_6= RULE_ID )
            // InternalECModel.g:431:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCallMessageRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getCallMessageAccess().getReceivingEndMixEndCrossReference_6_0());
              				
            }

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCallMessage"


    // $ANTLR start "entryRuleReturnMessage"
    // InternalECModel.g:450:1: entryRuleReturnMessage returns [EObject current=null] : iv_ruleReturnMessage= ruleReturnMessage EOF ;
    public final EObject entryRuleReturnMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnMessage = null;


        try {
            // InternalECModel.g:450:54: (iv_ruleReturnMessage= ruleReturnMessage EOF )
            // InternalECModel.g:451:2: iv_ruleReturnMessage= ruleReturnMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnMessageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnMessage=ruleReturnMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnMessage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturnMessage"


    // $ANTLR start "ruleReturnMessage"
    // InternalECModel.g:457:1: ruleReturnMessage returns [EObject current=null] : (otherlv_0= 'ReturnMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleReturnMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:463:2: ( (otherlv_0= 'ReturnMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalECModel.g:464:2: (otherlv_0= 'ReturnMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalECModel.g:464:2: (otherlv_0= 'ReturnMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalECModel.g:465:3: otherlv_0= 'ReturnMessage::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnMessageAccess().getReturnMessageKeyword_0());
              		
            }
            // InternalECModel.g:469:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:470:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:470:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:471:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnMessageAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnMessageRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReturnMessageAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalECModel.g:492:3: ( (otherlv_3= RULE_ID ) )
            // InternalECModel.g:493:4: (otherlv_3= RULE_ID )
            {
            // InternalECModel.g:493:4: (otherlv_3= RULE_ID )
            // InternalECModel.g:494:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReturnMessageRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getReturnMessageAccess().getSendingEndMixEndCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getReturnMessageAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalECModel.g:509:3: ( (otherlv_5= RULE_ID ) )
            // InternalECModel.g:510:4: (otherlv_5= RULE_ID )
            {
            // InternalECModel.g:510:4: (otherlv_5= RULE_ID )
            // InternalECModel.g:511:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReturnMessageRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getReturnMessageAccess().getReceivingEndMixEndCrossReference_5_0());
              				
            }

            }


            }

            // InternalECModel.g:522:3: ( (otherlv_6= RULE_ID ) )
            // InternalECModel.g:523:4: (otherlv_6= RULE_ID )
            {
            // InternalECModel.g:523:4: (otherlv_6= RULE_ID )
            // InternalECModel.g:524:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReturnMessageRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getReturnMessageAccess().getInvocationMessageMessageCrossReference_6_0());
              				
            }

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getReturnMessageAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReturnMessage"


    // $ANTLR start "entryRuleExecution"
    // InternalECModel.g:543:1: entryRuleExecution returns [EObject current=null] : iv_ruleExecution= ruleExecution EOF ;
    public final EObject entryRuleExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecution = null;


        try {
            // InternalECModel.g:543:50: (iv_ruleExecution= ruleExecution EOF )
            // InternalECModel.g:544:2: iv_ruleExecution= ruleExecution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExecutionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExecution=ruleExecution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExecution; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExecution"


    // $ANTLR start "ruleExecution"
    // InternalECModel.g:550:1: ruleExecution returns [EObject current=null] : (otherlv_0= 'Execution::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ;
    public final EObject ruleExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:556:2: ( (otherlv_0= 'Execution::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalECModel.g:557:2: (otherlv_0= 'Execution::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalECModel.g:557:2: (otherlv_0= 'Execution::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalECModel.g:558:3: otherlv_0= 'Execution::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExecutionAccess().getExecutionKeyword_0());
              		
            }
            // InternalECModel.g:562:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:563:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:563:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:564:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExecutionAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExecutionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExecutionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalECModel.g:585:3: ( (otherlv_3= RULE_ID ) )
            // InternalECModel.g:586:4: (otherlv_3= RULE_ID )
            {
            // InternalECModel.g:586:4: (otherlv_3= RULE_ID )
            // InternalECModel.g:587:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExecutionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getExecutionAccess().getOwnerParticipantCrossReference_3_0());
              				
            }

            }


            }

            // InternalECModel.g:598:3: ( (otherlv_4= RULE_ID ) )
            // InternalECModel.g:599:4: (otherlv_4= RULE_ID )
            {
            // InternalECModel.g:599:4: (otherlv_4= RULE_ID )
            // InternalECModel.g:600:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExecutionRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getExecutionAccess().getStartExecutionEndCrossReference_4_0());
              				
            }

            }


            }

            // InternalECModel.g:611:3: ( (otherlv_5= RULE_ID ) )
            // InternalECModel.g:612:4: (otherlv_5= RULE_ID )
            {
            // InternalECModel.g:612:4: (otherlv_5= RULE_ID )
            // InternalECModel.g:613:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExecutionRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getExecutionAccess().getEndExecutionEndCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getExecutionAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExecution"


    // $ANTLR start "entryRuleCombinedFragment"
    // InternalECModel.g:632:1: entryRuleCombinedFragment returns [EObject current=null] : iv_ruleCombinedFragment= ruleCombinedFragment EOF ;
    public final EObject entryRuleCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinedFragment = null;


        try {
            // InternalECModel.g:632:57: (iv_ruleCombinedFragment= ruleCombinedFragment EOF )
            // InternalECModel.g:633:2: iv_ruleCombinedFragment= ruleCombinedFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCombinedFragmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCombinedFragment=ruleCombinedFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCombinedFragment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCombinedFragment"


    // $ANTLR start "ruleCombinedFragment"
    // InternalECModel.g:639:1: ruleCombinedFragment returns [EObject current=null] : (otherlv_0= 'CombinedFragment::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= '{' otherlv_5= '[Participants:' ( (otherlv_6= RULE_ID ) )* otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) ( (lv_ownedOperands_11_0= ruleOperand ) )* otherlv_12= '}' ) ;
    public final EObject ruleCombinedFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_3_0 = null;

        EObject lv_ownedOperands_11_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:645:2: ( (otherlv_0= 'CombinedFragment::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= '{' otherlv_5= '[Participants:' ( (otherlv_6= RULE_ID ) )* otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) ( (lv_ownedOperands_11_0= ruleOperand ) )* otherlv_12= '}' ) )
            // InternalECModel.g:646:2: (otherlv_0= 'CombinedFragment::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= '{' otherlv_5= '[Participants:' ( (otherlv_6= RULE_ID ) )* otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) ( (lv_ownedOperands_11_0= ruleOperand ) )* otherlv_12= '}' )
            {
            // InternalECModel.g:646:2: (otherlv_0= 'CombinedFragment::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= '{' otherlv_5= '[Participants:' ( (otherlv_6= RULE_ID ) )* otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) ( (lv_ownedOperands_11_0= ruleOperand ) )* otherlv_12= '}' )
            // InternalECModel.g:647:3: otherlv_0= 'CombinedFragment::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_operator_3_0= ruleOperator ) ) otherlv_4= '{' otherlv_5= '[Participants:' ( (otherlv_6= RULE_ID ) )* otherlv_7= ']' ( (otherlv_8= RULE_ID ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) ( (lv_ownedOperands_11_0= ruleOperand ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCombinedFragmentAccess().getCombinedFragmentKeyword_0());
              		
            }
            // InternalECModel.g:651:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:652:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:652:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:653:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCombinedFragmentAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCombinedFragmentAccess().getHyphenMinusGreaterThanSignKeyword_2());
              		
            }
            // InternalECModel.g:674:3: ( (lv_operator_3_0= ruleOperator ) )
            // InternalECModel.g:675:4: (lv_operator_3_0= ruleOperator )
            {
            // InternalECModel.g:675:4: (lv_operator_3_0= ruleOperator )
            // InternalECModel.g:676:5: lv_operator_3_0= ruleOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCombinedFragmentAccess().getOperatorOperatorParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_operator_3_0=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_3_0,
              						"org.xtext.example.edgecloudmodel.ECModel.Operator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCombinedFragmentAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCombinedFragmentAccess().getParticipantsKeyword_5());
              		
            }
            // InternalECModel.g:701:3: ( (otherlv_6= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalECModel.g:702:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalECModel.g:702:4: (otherlv_6= RULE_ID )
            	    // InternalECModel.g:703:5: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getCombinedFragmentRule());
            	      					}
            	      				
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getCombinedFragmentAccess().getCoveredParticipantsParticipantCrossReference_6_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCombinedFragmentAccess().getRightSquareBracketKeyword_7());
              		
            }
            // InternalECModel.g:718:3: ( (otherlv_8= RULE_ID ) )
            // InternalECModel.g:719:4: (otherlv_8= RULE_ID )
            {
            // InternalECModel.g:719:4: (otherlv_8= RULE_ID )
            // InternalECModel.g:720:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCombinedFragmentRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getCombinedFragmentAccess().getStartCombinedFragmentEndCrossReference_8_0());
              				
            }

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getCombinedFragmentAccess().getHyphenMinusGreaterThanSignKeyword_9());
              		
            }
            // InternalECModel.g:735:3: ( (otherlv_10= RULE_ID ) )
            // InternalECModel.g:736:4: (otherlv_10= RULE_ID )
            {
            // InternalECModel.g:736:4: (otherlv_10= RULE_ID )
            // InternalECModel.g:737:5: otherlv_10= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCombinedFragmentRule());
              					}
              				
            }
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_10, grammarAccess.getCombinedFragmentAccess().getFinishCombinedFragmentEndCrossReference_10_0());
              				
            }

            }


            }

            // InternalECModel.g:748:3: ( (lv_ownedOperands_11_0= ruleOperand ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalECModel.g:749:4: (lv_ownedOperands_11_0= ruleOperand )
            	    {
            	    // InternalECModel.g:749:4: (lv_ownedOperands_11_0= ruleOperand )
            	    // InternalECModel.g:750:5: lv_ownedOperands_11_0= ruleOperand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCombinedFragmentAccess().getOwnedOperandsOperandParserRuleCall_11_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_ownedOperands_11_0=ruleOperand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedOperands",
            	      						lv_ownedOperands_11_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.Operand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_12=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getCombinedFragmentAccess().getRightCurlyBracketKeyword_12());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCombinedFragment"


    // $ANTLR start "entryRuleOperator"
    // InternalECModel.g:775:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalECModel.g:775:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalECModel.g:776:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalECModel.g:782:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'loop' | kw= 'alt' | kw= 'option' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalECModel.g:788:2: ( (kw= 'loop' | kw= 'alt' | kw= 'option' ) )
            // InternalECModel.g:789:2: (kw= 'loop' | kw= 'alt' | kw= 'option' )
            {
            // InternalECModel.g:789:2: (kw= 'loop' | kw= 'alt' | kw= 'option' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalECModel.g:790:3: kw= 'loop'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLoopKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:796:3: kw= 'alt'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getAltKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:802:3: kw= 'option'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getOptionKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleOperand"
    // InternalECModel.g:811:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalECModel.g:811:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalECModel.g:812:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalECModel.g:818:1: ruleOperand returns [EObject current=null] : (otherlv_0= 'Operand::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:824:2: ( (otherlv_0= 'Operand::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalECModel.g:825:2: (otherlv_0= 'Operand::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalECModel.g:825:2: (otherlv_0= 'Operand::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalECModel.g:826:3: otherlv_0= 'Operand::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getOperandKeyword_0());
              		
            }
            // InternalECModel.g:830:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:831:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:831:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:832:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperandAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperandRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalECModel.g:853:3: ( (otherlv_3= RULE_ID ) )
            // InternalECModel.g:854:4: (otherlv_3= RULE_ID )
            {
            // InternalECModel.g:854:4: (otherlv_3= RULE_ID )
            // InternalECModel.g:855:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperandRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getOperandAccess().getStartOperandEndCrossReference_3_0());
              				
            }

            }


            }

            // InternalECModel.g:866:3: ( (otherlv_4= RULE_ID ) )
            // InternalECModel.g:867:4: (otherlv_4= RULE_ID )
            {
            // InternalECModel.g:867:4: (otherlv_4= RULE_ID )
            // InternalECModel.g:868:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperandRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getOperandAccess().getFinishMixOpAndCFEndCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOperandAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleAbstractEnd"
    // InternalECModel.g:887:1: entryRuleAbstractEnd returns [EObject current=null] : iv_ruleAbstractEnd= ruleAbstractEnd EOF ;
    public final EObject entryRuleAbstractEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEnd = null;


        try {
            // InternalECModel.g:887:52: (iv_ruleAbstractEnd= ruleAbstractEnd EOF )
            // InternalECModel.g:888:2: iv_ruleAbstractEnd= ruleAbstractEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractEnd=ruleAbstractEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractEnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractEnd"


    // $ANTLR start "ruleAbstractEnd"
    // InternalECModel.g:894:1: ruleAbstractEnd returns [EObject current=null] : (this_MixEnd_0= ruleMixEnd | this_MixOpAndCFEnd_1= ruleMixOpAndCFEnd ) ;
    public final EObject ruleAbstractEnd() throws RecognitionException {
        EObject current = null;

        EObject this_MixEnd_0 = null;

        EObject this_MixOpAndCFEnd_1 = null;



        	enterRule();

        try {
            // InternalECModel.g:900:2: ( (this_MixEnd_0= ruleMixEnd | this_MixOpAndCFEnd_1= ruleMixOpAndCFEnd ) )
            // InternalECModel.g:901:2: (this_MixEnd_0= ruleMixEnd | this_MixOpAndCFEnd_1= ruleMixOpAndCFEnd )
            {
            // InternalECModel.g:901:2: (this_MixEnd_0= ruleMixEnd | this_MixOpAndCFEnd_1= ruleMixOpAndCFEnd )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=30 && LA12_0<=31)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=32 && LA12_0<=33)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalECModel.g:902:3: this_MixEnd_0= ruleMixEnd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractEndAccess().getMixEndParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MixEnd_0=ruleMixEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MixEnd_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:911:3: this_MixOpAndCFEnd_1= ruleMixOpAndCFEnd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractEndAccess().getMixOpAndCFEndParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MixOpAndCFEnd_1=ruleMixOpAndCFEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MixOpAndCFEnd_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAbstractEnd"


    // $ANTLR start "entryRuleMixEnd"
    // InternalECModel.g:923:1: entryRuleMixEnd returns [EObject current=null] : iv_ruleMixEnd= ruleMixEnd EOF ;
    public final EObject entryRuleMixEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixEnd = null;


        try {
            // InternalECModel.g:923:47: (iv_ruleMixEnd= ruleMixEnd EOF )
            // InternalECModel.g:924:2: iv_ruleMixEnd= ruleMixEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMixEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMixEnd=ruleMixEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMixEnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMixEnd"


    // $ANTLR start "ruleMixEnd"
    // InternalECModel.g:930:1: ruleMixEnd returns [EObject current=null] : (this_ExecutionEnd_0= ruleExecutionEnd | this_MessageEnd_1= ruleMessageEnd ) ;
    public final EObject ruleMixEnd() throws RecognitionException {
        EObject current = null;

        EObject this_ExecutionEnd_0 = null;

        EObject this_MessageEnd_1 = null;



        	enterRule();

        try {
            // InternalECModel.g:936:2: ( (this_ExecutionEnd_0= ruleExecutionEnd | this_MessageEnd_1= ruleMessageEnd ) )
            // InternalECModel.g:937:2: (this_ExecutionEnd_0= ruleExecutionEnd | this_MessageEnd_1= ruleMessageEnd )
            {
            // InternalECModel.g:937:2: (this_ExecutionEnd_0= ruleExecutionEnd | this_MessageEnd_1= ruleMessageEnd )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalECModel.g:938:3: this_ExecutionEnd_0= ruleExecutionEnd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMixEndAccess().getExecutionEndParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExecutionEnd_0=ruleExecutionEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExecutionEnd_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:947:3: this_MessageEnd_1= ruleMessageEnd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMixEndAccess().getMessageEndParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MessageEnd_1=ruleMessageEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MessageEnd_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMixEnd"


    // $ANTLR start "entryRuleMixOpAndCFEnd"
    // InternalECModel.g:959:1: entryRuleMixOpAndCFEnd returns [EObject current=null] : iv_ruleMixOpAndCFEnd= ruleMixOpAndCFEnd EOF ;
    public final EObject entryRuleMixOpAndCFEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixOpAndCFEnd = null;


        try {
            // InternalECModel.g:959:54: (iv_ruleMixOpAndCFEnd= ruleMixOpAndCFEnd EOF )
            // InternalECModel.g:960:2: iv_ruleMixOpAndCFEnd= ruleMixOpAndCFEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMixOpAndCFEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMixOpAndCFEnd=ruleMixOpAndCFEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMixOpAndCFEnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMixOpAndCFEnd"


    // $ANTLR start "ruleMixOpAndCFEnd"
    // InternalECModel.g:966:1: ruleMixOpAndCFEnd returns [EObject current=null] : (this_CombinedFragmentEnd_0= ruleCombinedFragmentEnd | this_OperandEnd_1= ruleOperandEnd ) ;
    public final EObject ruleMixOpAndCFEnd() throws RecognitionException {
        EObject current = null;

        EObject this_CombinedFragmentEnd_0 = null;

        EObject this_OperandEnd_1 = null;



        	enterRule();

        try {
            // InternalECModel.g:972:2: ( (this_CombinedFragmentEnd_0= ruleCombinedFragmentEnd | this_OperandEnd_1= ruleOperandEnd ) )
            // InternalECModel.g:973:2: (this_CombinedFragmentEnd_0= ruleCombinedFragmentEnd | this_OperandEnd_1= ruleOperandEnd )
            {
            // InternalECModel.g:973:2: (this_CombinedFragmentEnd_0= ruleCombinedFragmentEnd | this_OperandEnd_1= ruleOperandEnd )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalECModel.g:974:3: this_CombinedFragmentEnd_0= ruleCombinedFragmentEnd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMixOpAndCFEndAccess().getCombinedFragmentEndParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CombinedFragmentEnd_0=ruleCombinedFragmentEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CombinedFragmentEnd_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:983:3: this_OperandEnd_1= ruleOperandEnd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMixOpAndCFEndAccess().getOperandEndParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OperandEnd_1=ruleOperandEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperandEnd_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMixOpAndCFEnd"


    // $ANTLR start "entryRuleMessageEnd"
    // InternalECModel.g:995:1: entryRuleMessageEnd returns [EObject current=null] : iv_ruleMessageEnd= ruleMessageEnd EOF ;
    public final EObject entryRuleMessageEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageEnd = null;


        try {
            // InternalECModel.g:995:51: (iv_ruleMessageEnd= ruleMessageEnd EOF )
            // InternalECModel.g:996:2: iv_ruleMessageEnd= ruleMessageEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMessageEnd=ruleMessageEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageEnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMessageEnd"


    // $ANTLR start "ruleMessageEnd"
    // InternalECModel.g:1002:1: ruleMessageEnd returns [EObject current=null] : (otherlv_0= 'MessageEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleMessageEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:1008:2: ( (otherlv_0= 'MessageEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalECModel.g:1009:2: (otherlv_0= 'MessageEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalECModel.g:1009:2: (otherlv_0= 'MessageEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalECModel.g:1010:3: otherlv_0= 'MessageEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMessageEndAccess().getMessageEndKeyword_0());
              		
            }
            // InternalECModel.g:1014:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:1015:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:1015:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:1016:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMessageEndAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMessageEndRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMessageEndAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalECModel.g:1037:3: ( (otherlv_3= RULE_ID ) )
            // InternalECModel.g:1038:4: (otherlv_3= RULE_ID )
            {
            // InternalECModel.g:1038:4: (otherlv_3= RULE_ID )
            // InternalECModel.g:1039:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMessageEndRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getMessageEndAccess().getContextMultiEndCrossReference_3_0());
              				
            }

            }


            }

            // InternalECModel.g:1050:3: ( (otherlv_4= RULE_ID ) )
            // InternalECModel.g:1051:4: (otherlv_4= RULE_ID )
            {
            // InternalECModel.g:1051:4: (otherlv_4= RULE_ID )
            // InternalECModel.g:1052:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMessageEndRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getMessageEndAccess().getMessageMessageCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMessageEndAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMessageEnd"


    // $ANTLR start "entryRuleExecutionEnd"
    // InternalECModel.g:1071:1: entryRuleExecutionEnd returns [EObject current=null] : iv_ruleExecutionEnd= ruleExecutionEnd EOF ;
    public final EObject entryRuleExecutionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionEnd = null;


        try {
            // InternalECModel.g:1071:53: (iv_ruleExecutionEnd= ruleExecutionEnd EOF )
            // InternalECModel.g:1072:2: iv_ruleExecutionEnd= ruleExecutionEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExecutionEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExecutionEnd=ruleExecutionEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExecutionEnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExecutionEnd"


    // $ANTLR start "ruleExecutionEnd"
    // InternalECModel.g:1078:1: ruleExecutionEnd returns [EObject current=null] : (otherlv_0= 'ExecutionEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleExecutionEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:1084:2: ( (otherlv_0= 'ExecutionEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalECModel.g:1085:2: (otherlv_0= 'ExecutionEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalECModel.g:1085:2: (otherlv_0= 'ExecutionEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalECModel.g:1086:3: otherlv_0= 'ExecutionEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExecutionEndAccess().getExecutionEndKeyword_0());
              		
            }
            // InternalECModel.g:1090:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:1091:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:1091:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:1092:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExecutionEndAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExecutionEndRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExecutionEndAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalECModel.g:1113:3: ( (otherlv_3= RULE_ID ) )
            // InternalECModel.g:1114:4: (otherlv_3= RULE_ID )
            {
            // InternalECModel.g:1114:4: (otherlv_3= RULE_ID )
            // InternalECModel.g:1115:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExecutionEndRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getExecutionEndAccess().getContextMultiEndCrossReference_3_0());
              				
            }

            }


            }

            // InternalECModel.g:1126:3: ( (otherlv_4= RULE_ID ) )
            // InternalECModel.g:1127:4: (otherlv_4= RULE_ID )
            {
            // InternalECModel.g:1127:4: (otherlv_4= RULE_ID )
            // InternalECModel.g:1128:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExecutionEndRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getExecutionEndAccess().getExecutionExecutionCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getExecutionEndAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExecutionEnd"


    // $ANTLR start "entryRuleCombinedFragmentEnd"
    // InternalECModel.g:1147:1: entryRuleCombinedFragmentEnd returns [EObject current=null] : iv_ruleCombinedFragmentEnd= ruleCombinedFragmentEnd EOF ;
    public final EObject entryRuleCombinedFragmentEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinedFragmentEnd = null;


        try {
            // InternalECModel.g:1147:60: (iv_ruleCombinedFragmentEnd= ruleCombinedFragmentEnd EOF )
            // InternalECModel.g:1148:2: iv_ruleCombinedFragmentEnd= ruleCombinedFragmentEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCombinedFragmentEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCombinedFragmentEnd=ruleCombinedFragmentEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCombinedFragmentEnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCombinedFragmentEnd"


    // $ANTLR start "ruleCombinedFragmentEnd"
    // InternalECModel.g:1154:1: ruleCombinedFragmentEnd returns [EObject current=null] : (otherlv_0= 'CombinedFragmentEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleCombinedFragmentEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:1160:2: ( (otherlv_0= 'CombinedFragmentEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalECModel.g:1161:2: (otherlv_0= 'CombinedFragmentEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalECModel.g:1161:2: (otherlv_0= 'CombinedFragmentEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalECModel.g:1162:3: otherlv_0= 'CombinedFragmentEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCombinedFragmentEndAccess().getCombinedFragmentEndKeyword_0());
              		
            }
            // InternalECModel.g:1166:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:1167:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:1167:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:1168:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCombinedFragmentEndAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCombinedFragmentEndRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCombinedFragmentEndAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalECModel.g:1189:3: ( (otherlv_3= RULE_ID ) )
            // InternalECModel.g:1190:4: (otherlv_3= RULE_ID )
            {
            // InternalECModel.g:1190:4: (otherlv_3= RULE_ID )
            // InternalECModel.g:1191:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCombinedFragmentEndRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getCombinedFragmentEndAccess().getOwnerCombinedFragmentCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCombinedFragmentEndAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCombinedFragmentEnd"


    // $ANTLR start "entryRuleOperandEnd"
    // InternalECModel.g:1210:1: entryRuleOperandEnd returns [EObject current=null] : iv_ruleOperandEnd= ruleOperandEnd EOF ;
    public final EObject entryRuleOperandEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperandEnd = null;


        try {
            // InternalECModel.g:1210:51: (iv_ruleOperandEnd= ruleOperandEnd EOF )
            // InternalECModel.g:1211:2: iv_ruleOperandEnd= ruleOperandEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperandEnd=ruleOperandEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperandEnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperandEnd"


    // $ANTLR start "ruleOperandEnd"
    // InternalECModel.g:1217:1: ruleOperandEnd returns [EObject current=null] : (otherlv_0= 'OperandEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleOperandEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:1223:2: ( (otherlv_0= 'OperandEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalECModel.g:1224:2: (otherlv_0= 'OperandEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalECModel.g:1224:2: (otherlv_0= 'OperandEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalECModel.g:1225:3: otherlv_0= 'OperandEnd::' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperandEndAccess().getOperandEndKeyword_0());
              		
            }
            // InternalECModel.g:1229:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:1230:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:1230:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:1231:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperandEndAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperandEndRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOperandEndAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalECModel.g:1252:3: ( (otherlv_3= RULE_ID ) )
            // InternalECModel.g:1253:4: (otherlv_3= RULE_ID )
            {
            // InternalECModel.g:1253:4: (otherlv_3= RULE_ID )
            // InternalECModel.g:1254:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperandEndRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getOperandEndAccess().getOwnerOperandCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getOperandEndAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperandEnd"


    // $ANTLR start "entryRuleDomainModel"
    // InternalECModel.g:1273:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalECModel.g:1273:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalECModel.g:1274:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalECModel.g:1280:1: ruleDomainModel returns [EObject current=null] : (otherlv_0= 'DomainModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= '}' ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_entity_6_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:1286:2: ( (otherlv_0= 'DomainModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= '}' ) )
            // InternalECModel.g:1287:2: (otherlv_0= 'DomainModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= '}' )
            {
            // InternalECModel.g:1287:2: (otherlv_0= 'DomainModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= '}' )
            // InternalECModel.g:1288:3: otherlv_0= 'DomainModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDomainModelAccess().getDomainModelKeyword_0());
              		
            }
            // InternalECModel.g:1292:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:1293:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:1293:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:1294:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainModelAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainModelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:1311:3: (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalECModel.g:1312:4: otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDomainModelAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalECModel.g:1316:4: ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) )
                    // InternalECModel.g:1317:5: (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:1317:5: (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING )
                    // InternalECModel.g:1318:6: lv_label_3_0= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_label_3_0, grammarAccess.getDomainModelAccess().getLabelDOUBLE_QUOTED_STRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDomainModelRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"label",
                      							lv_label_3_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDomainModelAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalECModel.g:1343:3: ( (lv_entity_6_0= ruleEntity ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=57 && LA16_0<=58)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalECModel.g:1344:4: (lv_entity_6_0= ruleEntity )
            	    {
            	    // InternalECModel.g:1344:4: (lv_entity_6_0= ruleEntity )
            	    // InternalECModel.g:1345:5: lv_entity_6_0= ruleEntity
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDomainModelAccess().getEntityEntityParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_entity_6_0=ruleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"entity",
            	      						lv_entity_6_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.Entity");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleUseCaseModel"
    // InternalECModel.g:1370:1: entryRuleUseCaseModel returns [EObject current=null] : iv_ruleUseCaseModel= ruleUseCaseModel EOF ;
    public final EObject entryRuleUseCaseModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseModel = null;


        try {
            // InternalECModel.g:1370:53: (iv_ruleUseCaseModel= ruleUseCaseModel EOF )
            // InternalECModel.g:1371:2: iv_ruleUseCaseModel= ruleUseCaseModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUseCaseModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseModel=ruleUseCaseModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUseCaseModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUseCaseModel"


    // $ANTLR start "ruleUseCaseModel"
    // InternalECModel.g:1377:1: ruleUseCaseModel returns [EObject current=null] : (otherlv_0= 'UseCaseModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_uc_6_0= ruleUC ) )* ( (lv_actor_7_0= ruleActor ) )* ( (lv_interaction_8_0= ruleInteraction ) )* ( (lv_service_9_0= ruleService ) )* ( (lv_contract_10_0= ruleContract ) )* otherlv_11= '}' ) ;
    public final EObject ruleUseCaseModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_uc_6_0 = null;

        EObject lv_actor_7_0 = null;

        EObject lv_interaction_8_0 = null;

        EObject lv_service_9_0 = null;

        EObject lv_contract_10_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:1383:2: ( (otherlv_0= 'UseCaseModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_uc_6_0= ruleUC ) )* ( (lv_actor_7_0= ruleActor ) )* ( (lv_interaction_8_0= ruleInteraction ) )* ( (lv_service_9_0= ruleService ) )* ( (lv_contract_10_0= ruleContract ) )* otherlv_11= '}' ) )
            // InternalECModel.g:1384:2: (otherlv_0= 'UseCaseModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_uc_6_0= ruleUC ) )* ( (lv_actor_7_0= ruleActor ) )* ( (lv_interaction_8_0= ruleInteraction ) )* ( (lv_service_9_0= ruleService ) )* ( (lv_contract_10_0= ruleContract ) )* otherlv_11= '}' )
            {
            // InternalECModel.g:1384:2: (otherlv_0= 'UseCaseModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_uc_6_0= ruleUC ) )* ( (lv_actor_7_0= ruleActor ) )* ( (lv_interaction_8_0= ruleInteraction ) )* ( (lv_service_9_0= ruleService ) )* ( (lv_contract_10_0= ruleContract ) )* otherlv_11= '}' )
            // InternalECModel.g:1385:3: otherlv_0= 'UseCaseModel' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_uc_6_0= ruleUC ) )* ( (lv_actor_7_0= ruleActor ) )* ( (lv_interaction_8_0= ruleInteraction ) )* ( (lv_service_9_0= ruleService ) )* ( (lv_contract_10_0= ruleContract ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUseCaseModelAccess().getUseCaseModelKeyword_0());
              		
            }
            // InternalECModel.g:1389:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:1390:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:1390:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:1391:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUseCaseModelAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:1408:3: (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalECModel.g:1409:4: otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUseCaseModelAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalECModel.g:1413:4: ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) )
                    // InternalECModel.g:1414:5: (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:1414:5: (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING )
                    // InternalECModel.g:1415:6: lv_label_3_0= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_label_3_0, grammarAccess.getUseCaseModelAccess().getLabelDOUBLE_QUOTED_STRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUseCaseModelRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"label",
                      							lv_label_3_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getUseCaseModelAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getUseCaseModelAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalECModel.g:1440:3: ( (lv_uc_6_0= ruleUC ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalECModel.g:1441:4: (lv_uc_6_0= ruleUC )
            	    {
            	    // InternalECModel.g:1441:4: (lv_uc_6_0= ruleUC )
            	    // InternalECModel.g:1442:5: lv_uc_6_0= ruleUC
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getUseCaseModelAccess().getUcUCParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_uc_6_0=ruleUC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"uc",
            	      						lv_uc_6_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.UC");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalECModel.g:1459:3: ( (lv_actor_7_0= ruleActor ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalECModel.g:1460:4: (lv_actor_7_0= ruleActor )
            	    {
            	    // InternalECModel.g:1460:4: (lv_actor_7_0= ruleActor )
            	    // InternalECModel.g:1461:5: lv_actor_7_0= ruleActor
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getUseCaseModelAccess().getActorActorParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_actor_7_0=ruleActor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"actor",
            	      						lv_actor_7_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.Actor");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalECModel.g:1478:3: ( (lv_interaction_8_0= ruleInteraction ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalECModel.g:1479:4: (lv_interaction_8_0= ruleInteraction )
            	    {
            	    // InternalECModel.g:1479:4: (lv_interaction_8_0= ruleInteraction )
            	    // InternalECModel.g:1480:5: lv_interaction_8_0= ruleInteraction
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getUseCaseModelAccess().getInteractionInteractionParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_interaction_8_0=ruleInteraction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"interaction",
            	      						lv_interaction_8_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.Interaction");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalECModel.g:1497:3: ( (lv_service_9_0= ruleService ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==43) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalECModel.g:1498:4: (lv_service_9_0= ruleService )
            	    {
            	    // InternalECModel.g:1498:4: (lv_service_9_0= ruleService )
            	    // InternalECModel.g:1499:5: lv_service_9_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getUseCaseModelAccess().getServiceServiceParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_service_9_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"service",
            	      						lv_service_9_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalECModel.g:1516:3: ( (lv_contract_10_0= ruleContract ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==70) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalECModel.g:1517:4: (lv_contract_10_0= ruleContract )
            	    {
            	    // InternalECModel.g:1517:4: (lv_contract_10_0= ruleContract )
            	    // InternalECModel.g:1518:5: lv_contract_10_0= ruleContract
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getUseCaseModelAccess().getContractContractParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_contract_10_0=ruleContract();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"contract",
            	      						lv_contract_10_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.Contract");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_11=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getUseCaseModelAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUseCaseModel"


    // $ANTLR start "entryRuleActor"
    // InternalECModel.g:1543:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalECModel.g:1543:46: (iv_ruleActor= ruleActor EOF )
            // InternalECModel.g:1544:2: iv_ruleActor= ruleActor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalECModel.g:1550:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' (otherlv_8= '@Description(' ( (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_10= ')' )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:1556:2: ( (otherlv_0= 'Actor' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' (otherlv_8= '@Description(' ( (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_10= ')' )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' ) )
            // InternalECModel.g:1557:2: (otherlv_0= 'Actor' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' (otherlv_8= '@Description(' ( (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_10= ')' )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' )
            {
            // InternalECModel.g:1557:2: (otherlv_0= 'Actor' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' (otherlv_8= '@Description(' ( (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_10= ')' )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}' )
            // InternalECModel.g:1558:3: otherlv_0= 'Actor' ( (lv_name_1_0= ruleSimpleNameCS ) ) (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )? (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' (otherlv_8= '@Description(' ( (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_10= ')' )? ( (otherlv_11= RULE_ID ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
              		
            }
            // InternalECModel.g:1562:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:1563:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:1563:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:1564:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActorAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:1581:3: (otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalECModel.g:1582:4: otherlv_2= '(' ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalECModel.g:1586:4: ( (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING ) )
                    // InternalECModel.g:1587:5: (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:1587:5: (lv_label_3_0= RULE_DOUBLE_QUOTED_STRING )
                    // InternalECModel.g:1588:6: lv_label_3_0= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_label_3_0, grammarAccess.getActorAccess().getLabelDOUBLE_QUOTED_STRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getActorRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"label",
                      							lv_label_3_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getActorAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:1609:3: (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalECModel.g:1610:4: otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getActorAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalECModel.g:1614:4: ( (otherlv_6= RULE_ID ) )
                    // InternalECModel.g:1615:5: (otherlv_6= RULE_ID )
                    {
                    // InternalECModel.g:1615:5: (otherlv_6= RULE_ID )
                    // InternalECModel.g:1616:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getActorRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getActorAccess().getSuperActorActorCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalECModel.g:1632:3: (otherlv_8= '@Description(' ( (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_10= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalECModel.g:1633:4: otherlv_8= '@Description(' ( (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getActorAccess().getDescriptionKeyword_5_0());
                      			
                    }
                    // InternalECModel.g:1637:4: ( (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING ) )
                    // InternalECModel.g:1638:5: (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:1638:5: (lv_description_9_0= RULE_DOUBLE_QUOTED_STRING )
                    // InternalECModel.g:1639:6: lv_description_9_0= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_9_0, grammarAccess.getActorAccess().getDescriptionDOUBLE_QUOTED_STRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getActorRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_9_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,14,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getActorAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:1660:3: ( (otherlv_11= RULE_ID ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalECModel.g:1661:4: (otherlv_11= RULE_ID )
            	    {
            	    // InternalECModel.g:1661:4: (otherlv_11= RULE_ID )
            	    // InternalECModel.g:1662:5: otherlv_11= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getActorRule());
            	      					}
            	      				
            	    }
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getActorAccess().getUcUCCrossReference_6_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_12=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleUC"
    // InternalECModel.g:1681:1: entryRuleUC returns [EObject current=null] : iv_ruleUC= ruleUC EOF ;
    public final EObject entryRuleUC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUC = null;


        try {
            // InternalECModel.g:1681:43: (iv_ruleUC= ruleUC EOF )
            // InternalECModel.g:1682:2: iv_ruleUC= ruleUC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUCRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUC=ruleUC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUC; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUC"


    // $ANTLR start "ruleUC"
    // InternalECModel.g:1688:1: ruleUC returns [EObject current=null] : (otherlv_0= 'UC' otherlv_1= '::' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= '(' )? ( (lv_label_4_0= RULE_DOUBLE_QUOTED_STRING ) )? (otherlv_5= ')' )? ( ( (lv_UCRelation_6_0= ruleUSECASE_RELATION ) ) ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'definedBySSD' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? (otherlv_16= 'relatedService' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? (otherlv_22= '@Description(' ( (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_24= ')' )? ) ;
    public final EObject ruleUC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_description_23_0=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_UCRelation_6_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:1694:2: ( (otherlv_0= 'UC' otherlv_1= '::' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= '(' )? ( (lv_label_4_0= RULE_DOUBLE_QUOTED_STRING ) )? (otherlv_5= ')' )? ( ( (lv_UCRelation_6_0= ruleUSECASE_RELATION ) ) ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'definedBySSD' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? (otherlv_16= 'relatedService' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? (otherlv_22= '@Description(' ( (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_24= ')' )? ) )
            // InternalECModel.g:1695:2: (otherlv_0= 'UC' otherlv_1= '::' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= '(' )? ( (lv_label_4_0= RULE_DOUBLE_QUOTED_STRING ) )? (otherlv_5= ')' )? ( ( (lv_UCRelation_6_0= ruleUSECASE_RELATION ) ) ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'definedBySSD' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? (otherlv_16= 'relatedService' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? (otherlv_22= '@Description(' ( (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_24= ')' )? )
            {
            // InternalECModel.g:1695:2: (otherlv_0= 'UC' otherlv_1= '::' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= '(' )? ( (lv_label_4_0= RULE_DOUBLE_QUOTED_STRING ) )? (otherlv_5= ')' )? ( ( (lv_UCRelation_6_0= ruleUSECASE_RELATION ) ) ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'definedBySSD' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? (otherlv_16= 'relatedService' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? (otherlv_22= '@Description(' ( (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_24= ')' )? )
            // InternalECModel.g:1696:3: otherlv_0= 'UC' otherlv_1= '::' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= '(' )? ( (lv_label_4_0= RULE_DOUBLE_QUOTED_STRING ) )? (otherlv_5= ')' )? ( ( (lv_UCRelation_6_0= ruleUSECASE_RELATION ) ) ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'definedBySSD' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? (otherlv_16= 'relatedService' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? (otherlv_22= '@Description(' ( (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_24= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUCAccess().getUCKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUCAccess().getColonColonKeyword_1());
              		
            }
            // InternalECModel.g:1704:3: ( (lv_name_2_0= ruleSimpleNameCS ) )
            // InternalECModel.g:1705:4: (lv_name_2_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:1705:4: (lv_name_2_0= ruleSimpleNameCS )
            // InternalECModel.g:1706:5: lv_name_2_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUCAccess().getNameSimpleNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_name_2_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUCRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:1723:3: (otherlv_3= '(' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalECModel.g:1724:4: otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getUCAccess().getLeftParenthesisKeyword_3());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:1729:3: ( (lv_label_4_0= RULE_DOUBLE_QUOTED_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DOUBLE_QUOTED_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalECModel.g:1730:4: (lv_label_4_0= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:1730:4: (lv_label_4_0= RULE_DOUBLE_QUOTED_STRING )
                    // InternalECModel.g:1731:5: lv_label_4_0= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_label_4_0, grammarAccess.getUCAccess().getLabelDOUBLE_QUOTED_STRINGTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUCRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"label",
                      						lv_label_4_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:1747:3: (otherlv_5= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalECModel.g:1748:4: otherlv_5= ')'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getUCAccess().getRightParenthesisKeyword_5());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:1753:3: ( ( (lv_UCRelation_6_0= ruleUSECASE_RELATION ) ) ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=68 && LA31_0<=69)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalECModel.g:1754:4: ( (lv_UCRelation_6_0= ruleUSECASE_RELATION ) ) ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    // InternalECModel.g:1754:4: ( (lv_UCRelation_6_0= ruleUSECASE_RELATION ) )
                    // InternalECModel.g:1755:5: (lv_UCRelation_6_0= ruleUSECASE_RELATION )
                    {
                    // InternalECModel.g:1755:5: (lv_UCRelation_6_0= ruleUSECASE_RELATION )
                    // InternalECModel.g:1756:6: lv_UCRelation_6_0= ruleUSECASE_RELATION
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUCAccess().getUCRelationUSECASE_RELATIONParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_UCRelation_6_0=ruleUSECASE_RELATION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUCRule());
                      						}
                      						set(
                      							current,
                      							"UCRelation",
                      							lv_UCRelation_6_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.USECASE_RELATION");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalECModel.g:1773:4: ( (otherlv_7= RULE_ID ) )
                    // InternalECModel.g:1774:5: (otherlv_7= RULE_ID )
                    {
                    // InternalECModel.g:1774:5: (otherlv_7= RULE_ID )
                    // InternalECModel.g:1775:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUCRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getUCAccess().getRelateducUCCrossReference_6_1_0());
                      					
                    }

                    }


                    }

                    // InternalECModel.g:1786:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==40) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalECModel.g:1787:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getUCAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalECModel.g:1791:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalECModel.g:1792:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalECModel.g:1792:6: (otherlv_9= RULE_ID )
                    	    // InternalECModel.g:1793:7: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getUCRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_9, grammarAccess.getUCAccess().getRelateducUCCrossReference_6_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalECModel.g:1806:3: (otherlv_10= 'definedBySSD' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalECModel.g:1807:4: otherlv_10= 'definedBySSD' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,41,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getUCAccess().getDefinedBySSDKeyword_7_0());
                      			
                    }
                    otherlv_11=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getUCAccess().getLeftParenthesisKeyword_7_1());
                      			
                    }
                    // InternalECModel.g:1815:4: ( (otherlv_12= RULE_ID ) )
                    // InternalECModel.g:1816:5: (otherlv_12= RULE_ID )
                    {
                    // InternalECModel.g:1816:5: (otherlv_12= RULE_ID )
                    // InternalECModel.g:1817:6: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUCRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getUCAccess().getSsdInteractionCrossReference_7_2_0());
                      					
                    }

                    }


                    }

                    // InternalECModel.g:1828:4: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==40) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalECModel.g:1829:5: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_13, grammarAccess.getUCAccess().getCommaKeyword_7_3_0());
                    	      				
                    	    }
                    	    // InternalECModel.g:1833:5: ( (otherlv_14= RULE_ID ) )
                    	    // InternalECModel.g:1834:6: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalECModel.g:1834:6: (otherlv_14= RULE_ID )
                    	    // InternalECModel.g:1835:7: otherlv_14= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getUCRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_14, grammarAccess.getUCAccess().getSsdInteractionCrossReference_7_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getUCAccess().getRightParenthesisKeyword_7_4());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:1852:3: (otherlv_16= 'relatedService' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalECModel.g:1853:4: otherlv_16= 'relatedService' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,42,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getUCAccess().getRelatedServiceKeyword_8_0());
                      			
                    }
                    otherlv_17=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getUCAccess().getLeftParenthesisKeyword_8_1());
                      			
                    }
                    // InternalECModel.g:1861:4: ( (otherlv_18= RULE_ID ) )
                    // InternalECModel.g:1862:5: (otherlv_18= RULE_ID )
                    {
                    // InternalECModel.g:1862:5: (otherlv_18= RULE_ID )
                    // InternalECModel.g:1863:6: otherlv_18= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUCRule());
                      						}
                      					
                    }
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getUCAccess().getServiceServiceCrossReference_8_2_0());
                      					
                    }

                    }


                    }

                    // InternalECModel.g:1874:4: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==40) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalECModel.g:1875:5: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                    	    {
                    	    otherlv_19=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_19, grammarAccess.getUCAccess().getCommaKeyword_8_3_0());
                    	      				
                    	    }
                    	    // InternalECModel.g:1879:5: ( (otherlv_20= RULE_ID ) )
                    	    // InternalECModel.g:1880:6: (otherlv_20= RULE_ID )
                    	    {
                    	    // InternalECModel.g:1880:6: (otherlv_20= RULE_ID )
                    	    // InternalECModel.g:1881:7: otherlv_20= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getUCRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_20, grammarAccess.getUCAccess().getServiceServiceCrossReference_8_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,14,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getUCAccess().getRightParenthesisKeyword_8_4());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:1898:3: (otherlv_22= '@Description(' ( (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_24= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalECModel.g:1899:4: otherlv_22= '@Description(' ( (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_24= ')'
                    {
                    otherlv_22=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getUCAccess().getDescriptionKeyword_9_0());
                      			
                    }
                    // InternalECModel.g:1903:4: ( (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING ) )
                    // InternalECModel.g:1904:5: (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:1904:5: (lv_description_23_0= RULE_DOUBLE_QUOTED_STRING )
                    // InternalECModel.g:1905:6: lv_description_23_0= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_description_23_0=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_23_0, grammarAccess.getUCAccess().getDescriptionDOUBLE_QUOTED_STRINGTerminalRuleCall_9_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUCRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_23_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      					
                    }

                    }


                    }

                    otherlv_24=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_24, grammarAccess.getUCAccess().getRightParenthesisKeyword_9_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUC"


    // $ANTLR start "entryRuleService"
    // InternalECModel.g:1930:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalECModel.g:1930:48: (iv_ruleService= ruleService EOF )
            // InternalECModel.g:1931:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalECModel.g:1937:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' (otherlv_3= '@Description(' ( (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_5= ')' )? (otherlv_6= '[Operation]' ( (lv_operation_7_0= ruleOperation ) )* )? (otherlv_8= '[TempProperty]' ( (lv_temp_property_9_0= ruleAttribute ) )* )? (otherlv_10= '[WorkFlow]' ( (otherlv_11= RULE_ID ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operation_7_0 = null;

        EObject lv_temp_property_9_0 = null;

        EObject lv_invariance_13_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:1943:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' (otherlv_3= '@Description(' ( (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_5= ')' )? (otherlv_6= '[Operation]' ( (lv_operation_7_0= ruleOperation ) )* )? (otherlv_8= '[TempProperty]' ( (lv_temp_property_9_0= ruleAttribute ) )* )? (otherlv_10= '[WorkFlow]' ( (otherlv_11= RULE_ID ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}' ) )
            // InternalECModel.g:1944:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' (otherlv_3= '@Description(' ( (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_5= ')' )? (otherlv_6= '[Operation]' ( (lv_operation_7_0= ruleOperation ) )* )? (otherlv_8= '[TempProperty]' ( (lv_temp_property_9_0= ruleAttribute ) )* )? (otherlv_10= '[WorkFlow]' ( (otherlv_11= RULE_ID ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}' )
            {
            // InternalECModel.g:1944:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' (otherlv_3= '@Description(' ( (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_5= ')' )? (otherlv_6= '[Operation]' ( (lv_operation_7_0= ruleOperation ) )* )? (otherlv_8= '[TempProperty]' ( (lv_temp_property_9_0= ruleAttribute ) )* )? (otherlv_10= '[WorkFlow]' ( (otherlv_11= RULE_ID ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}' )
            // InternalECModel.g:1945:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= '{' (otherlv_3= '@Description(' ( (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_5= ')' )? (otherlv_6= '[Operation]' ( (lv_operation_7_0= ruleOperation ) )* )? (otherlv_8= '[TempProperty]' ( (lv_temp_property_9_0= ruleAttribute ) )* )? (otherlv_10= '[WorkFlow]' ( (otherlv_11= RULE_ID ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
              		
            }
            // InternalECModel.g:1949:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:1950:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:1950:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:1951:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getServiceAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getServiceRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalECModel.g:1972:3: (otherlv_3= '@Description(' ( (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_5= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalECModel.g:1973:4: otherlv_3= '@Description(' ( (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDescriptionKeyword_3_0());
                      			
                    }
                    // InternalECModel.g:1977:4: ( (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING ) )
                    // InternalECModel.g:1978:5: (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:1978:5: (lv_description_4_0= RULE_DOUBLE_QUOTED_STRING )
                    // InternalECModel.g:1979:6: lv_description_4_0= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_4_0, grammarAccess.getServiceAccess().getDescriptionDOUBLE_QUOTED_STRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getServiceRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_4_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:2000:3: (otherlv_6= '[Operation]' ( (lv_operation_7_0= ruleOperation ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalECModel.g:2001:4: otherlv_6= '[Operation]' ( (lv_operation_7_0= ruleOperation ) )*
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getOperationKeyword_4_0());
                      			
                    }
                    // InternalECModel.g:2005:4: ( (lv_operation_7_0= ruleOperation ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalECModel.g:2006:5: (lv_operation_7_0= ruleOperation )
                    	    {
                    	    // InternalECModel.g:2006:5: (lv_operation_7_0= ruleOperation )
                    	    // InternalECModel.g:2007:6: lv_operation_7_0= ruleOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getServiceAccess().getOperationOperationParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_41);
                    	    lv_operation_7_0=ruleOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getServiceRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"operation",
                    	      							lv_operation_7_0,
                    	      							"org.xtext.example.edgecloudmodel.ECModel.Operation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalECModel.g:2025:3: (otherlv_8= '[TempProperty]' ( (lv_temp_property_9_0= ruleAttribute ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalECModel.g:2026:4: otherlv_8= '[TempProperty]' ( (lv_temp_property_9_0= ruleAttribute ) )*
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getTempPropertyKeyword_5_0());
                      			
                    }
                    // InternalECModel.g:2030:4: ( (lv_temp_property_9_0= ruleAttribute ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_ID) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalECModel.g:2031:5: (lv_temp_property_9_0= ruleAttribute )
                    	    {
                    	    // InternalECModel.g:2031:5: (lv_temp_property_9_0= ruleAttribute )
                    	    // InternalECModel.g:2032:6: lv_temp_property_9_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getServiceAccess().getTemp_propertyAttributeParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_temp_property_9_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getServiceRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"temp_property",
                    	      							lv_temp_property_9_0,
                    	      							"org.xtext.example.edgecloudmodel.ECModel.Attribute");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalECModel.g:2050:3: (otherlv_10= '[WorkFlow]' ( (otherlv_11= RULE_ID ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalECModel.g:2051:4: otherlv_10= '[WorkFlow]' ( (otherlv_11= RULE_ID ) )*
                    {
                    otherlv_10=(Token)match(input,46,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getWorkFlowKeyword_6_0());
                      			
                    }
                    // InternalECModel.g:2055:4: ( (otherlv_11= RULE_ID ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ID) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalECModel.g:2056:5: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalECModel.g:2056:5: (otherlv_11= RULE_ID )
                    	    // InternalECModel.g:2057:6: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getServiceRule());
                    	      						}
                    	      					
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getWorkflowWorkflowCrossReference_6_1_0());
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalECModel.g:2069:3: (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalECModel.g:2070:4: otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )*
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getINVKeyword_7_0());
                      			
                    }
                    // InternalECModel.g:2074:4: ( (lv_invariance_13_0= ruleInvariance ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==64) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalECModel.g:2075:5: (lv_invariance_13_0= ruleInvariance )
                    	    {
                    	    // InternalECModel.g:2075:5: (lv_invariance_13_0= ruleInvariance )
                    	    // InternalECModel.g:2076:6: lv_invariance_13_0= ruleInvariance
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getServiceAccess().getInvarianceInvarianceParserRuleCall_7_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_44);
                    	    lv_invariance_13_0=ruleInvariance();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getServiceRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"invariance",
                    	      							lv_invariance_13_0,
                    	      							"org.xtext.example.edgecloudmodel.ECModel.Invariance");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleParticipant"
    // InternalECModel.g:2102:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // InternalECModel.g:2102:52: (iv_ruleParticipant= ruleParticipant EOF )
            // InternalECModel.g:2103:2: iv_ruleParticipant= ruleParticipant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParticipantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParticipant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalECModel.g:2109:1: ruleParticipant returns [EObject current=null] : (this_Actor_0= ruleActor | this_Service_1= ruleService ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Service_1 = null;



        	enterRule();

        try {
            // InternalECModel.g:2115:2: ( (this_Actor_0= ruleActor | this_Service_1= ruleService ) )
            // InternalECModel.g:2116:2: (this_Actor_0= ruleActor | this_Service_1= ruleService )
            {
            // InternalECModel.g:2116:2: (this_Actor_0= ruleActor | this_Service_1= ruleService )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            else if ( (LA46_0==43) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalECModel.g:2117:3: this_Actor_0= ruleActor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParticipantAccess().getActorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Actor_0=ruleActor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Actor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:2126:3: this_Service_1= ruleService
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParticipantAccess().getServiceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Service_1=ruleService();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Service_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRulePartition"
    // InternalECModel.g:2138:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // InternalECModel.g:2138:50: (iv_rulePartition= rulePartition EOF )
            // InternalECModel.g:2139:2: iv_rulePartition= rulePartition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartition=rulePartition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePartition"


    // $ANTLR start "rulePartition"
    // InternalECModel.g:2145:1: rulePartition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleWorkflowExp ) )* otherlv_3= '}' ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exps_2_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:2151:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleWorkflowExp ) )* otherlv_3= '}' ) )
            // InternalECModel.g:2152:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleWorkflowExp ) )* otherlv_3= '}' )
            {
            // InternalECModel.g:2152:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleWorkflowExp ) )* otherlv_3= '}' )
            // InternalECModel.g:2153:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleWorkflowExp ) )* otherlv_3= '}'
            {
            // InternalECModel.g:2153:3: ( (otherlv_0= RULE_ID ) )
            // InternalECModel.g:2154:4: (otherlv_0= RULE_ID )
            {
            // InternalECModel.g:2154:4: (otherlv_0= RULE_ID )
            // InternalECModel.g:2155:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPartitionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPartitionAccess().getNameParticipantCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPartitionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalECModel.g:2170:3: ( (lv_exps_2_0= ruleWorkflowExp ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||(LA47_0>=21 && LA47_0<=22)||(LA47_0>=49 && LA47_0<=51)||(LA47_0>=53 && LA47_0<=54)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalECModel.g:2171:4: (lv_exps_2_0= ruleWorkflowExp )
            	    {
            	    // InternalECModel.g:2171:4: (lv_exps_2_0= ruleWorkflowExp )
            	    // InternalECModel.g:2172:5: lv_exps_2_0= ruleWorkflowExp
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPartitionAccess().getExpsWorkflowExpParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_exps_2_0=ruleWorkflowExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPartitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"exps",
            	      						lv_exps_2_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.WorkflowExp");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPartitionAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePartition"


    // $ANTLR start "entryRuleWorkflowExp"
    // InternalECModel.g:2197:1: entryRuleWorkflowExp returns [EObject current=null] : iv_ruleWorkflowExp= ruleWorkflowExp EOF ;
    public final EObject entryRuleWorkflowExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowExp = null;


        try {
            // InternalECModel.g:2197:52: (iv_ruleWorkflowExp= ruleWorkflowExp EOF )
            // InternalECModel.g:2198:2: iv_ruleWorkflowExp= ruleWorkflowExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowExp=ruleWorkflowExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowExp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWorkflowExp"


    // $ANTLR start "ruleWorkflowExp"
    // InternalECModel.g:2204:1: ruleWorkflowExp returns [EObject current=null] : (this_SimpleOperation_0= ruleSimpleOperation | this_ComplexOpeartion_1= ruleComplexOpeartion | this_InitalNode_2= ruleInitalNode | this_ActivityFinal_3= ruleActivityFinal | this_ForkNode_4= ruleForkNode | this_JoinNode_5= ruleJoinNode | this_PartitionAction_6= rulePartitionAction ) ;
    public final EObject ruleWorkflowExp() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleOperation_0 = null;

        EObject this_ComplexOpeartion_1 = null;

        EObject this_InitalNode_2 = null;

        EObject this_ActivityFinal_3 = null;

        EObject this_ForkNode_4 = null;

        EObject this_JoinNode_5 = null;

        EObject this_PartitionAction_6 = null;



        	enterRule();

        try {
            // InternalECModel.g:2210:2: ( (this_SimpleOperation_0= ruleSimpleOperation | this_ComplexOpeartion_1= ruleComplexOpeartion | this_InitalNode_2= ruleInitalNode | this_ActivityFinal_3= ruleActivityFinal | this_ForkNode_4= ruleForkNode | this_JoinNode_5= ruleJoinNode | this_PartitionAction_6= rulePartitionAction ) )
            // InternalECModel.g:2211:2: (this_SimpleOperation_0= ruleSimpleOperation | this_ComplexOpeartion_1= ruleComplexOpeartion | this_InitalNode_2= ruleInitalNode | this_ActivityFinal_3= ruleActivityFinal | this_ForkNode_4= ruleForkNode | this_JoinNode_5= ruleJoinNode | this_PartitionAction_6= rulePartitionAction )
            {
            // InternalECModel.g:2211:2: (this_SimpleOperation_0= ruleSimpleOperation | this_ComplexOpeartion_1= ruleComplexOpeartion | this_InitalNode_2= ruleInitalNode | this_ActivityFinal_3= ruleActivityFinal | this_ForkNode_4= ruleForkNode | this_JoinNode_5= ruleJoinNode | this_PartitionAction_6= rulePartitionAction )
            int alt48=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt48=1;
                }
                break;
            case 53:
            case 54:
                {
                alt48=2;
                }
                break;
            case 50:
                {
                alt48=3;
                }
                break;
            case 49:
                {
                alt48=4;
                }
                break;
            case 51:
                {
                alt48=5;
                }
                break;
            case 21:
                {
                alt48=6;
                }
                break;
            case 22:
                {
                alt48=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalECModel.g:2212:3: this_SimpleOperation_0= ruleSimpleOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getWorkflowExpAccess().getSimpleOperationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleOperation_0=ruleSimpleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleOperation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:2221:3: this_ComplexOpeartion_1= ruleComplexOpeartion
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getWorkflowExpAccess().getComplexOpeartionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComplexOpeartion_1=ruleComplexOpeartion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComplexOpeartion_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:2230:3: this_InitalNode_2= ruleInitalNode
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getWorkflowExpAccess().getInitalNodeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InitalNode_2=ruleInitalNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InitalNode_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:2239:3: this_ActivityFinal_3= ruleActivityFinal
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getWorkflowExpAccess().getActivityFinalParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ActivityFinal_3=ruleActivityFinal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActivityFinal_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:2248:3: this_ForkNode_4= ruleForkNode
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getWorkflowExpAccess().getForkNodeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForkNode_4=ruleForkNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForkNode_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalECModel.g:2257:3: this_JoinNode_5= ruleJoinNode
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getWorkflowExpAccess().getJoinNodeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JoinNode_5=ruleJoinNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JoinNode_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalECModel.g:2266:3: this_PartitionAction_6= rulePartitionAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getWorkflowExpAccess().getPartitionActionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PartitionAction_6=rulePartitionAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PartitionAction_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWorkflowExp"


    // $ANTLR start "entryRulePartitionAction"
    // InternalECModel.g:2278:1: entryRulePartitionAction returns [EObject current=null] : iv_rulePartitionAction= rulePartitionAction EOF ;
    public final EObject entryRulePartitionAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartitionAction = null;


        try {
            // InternalECModel.g:2278:56: (iv_rulePartitionAction= rulePartitionAction EOF )
            // InternalECModel.g:2279:2: iv_rulePartitionAction= rulePartitionAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartitionActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartitionAction=rulePartitionAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartitionAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePartitionAction"


    // $ANTLR start "rulePartitionAction"
    // InternalECModel.g:2285:1: rulePartitionAction returns [EObject current=null] : (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePartitionAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalECModel.g:2291:2: ( (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalECModel.g:2292:2: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalECModel.g:2292:2: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalECModel.g:2293:3: otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPartitionActionAccess().getHyphenMinusGreaterThanSignKeyword_0());
              		
            }
            // InternalECModel.g:2297:3: ( (otherlv_1= RULE_ID ) )
            // InternalECModel.g:2298:4: (otherlv_1= RULE_ID )
            {
            // InternalECModel.g:2298:4: (otherlv_1= RULE_ID )
            // InternalECModel.g:2299:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPartitionActionRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getPartitionActionAccess().getPatitionParticipantCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPartitionActionAccess().getColonKeyword_2());
              		
            }
            // InternalECModel.g:2314:3: ( (otherlv_3= RULE_ID ) )
            // InternalECModel.g:2315:4: (otherlv_3= RULE_ID )
            {
            // InternalECModel.g:2315:4: (otherlv_3= RULE_ID )
            // InternalECModel.g:2316:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPartitionActionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getPartitionActionAccess().getActionJoinExpCrossReference_3_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePartitionAction"


    // $ANTLR start "entryRuleActivityFinal"
    // InternalECModel.g:2331:1: entryRuleActivityFinal returns [EObject current=null] : iv_ruleActivityFinal= ruleActivityFinal EOF ;
    public final EObject entryRuleActivityFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityFinal = null;


        try {
            // InternalECModel.g:2331:54: (iv_ruleActivityFinal= ruleActivityFinal EOF )
            // InternalECModel.g:2332:2: iv_ruleActivityFinal= ruleActivityFinal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivityFinalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActivityFinal=ruleActivityFinal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivityFinal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActivityFinal"


    // $ANTLR start "ruleActivityFinal"
    // InternalECModel.g:2338:1: ruleActivityFinal returns [EObject current=null] : ( (lv_name_0_0= 'ActivityFinal' ) ) ;
    public final EObject ruleActivityFinal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalECModel.g:2344:2: ( ( (lv_name_0_0= 'ActivityFinal' ) ) )
            // InternalECModel.g:2345:2: ( (lv_name_0_0= 'ActivityFinal' ) )
            {
            // InternalECModel.g:2345:2: ( (lv_name_0_0= 'ActivityFinal' ) )
            // InternalECModel.g:2346:3: (lv_name_0_0= 'ActivityFinal' )
            {
            // InternalECModel.g:2346:3: (lv_name_0_0= 'ActivityFinal' )
            // InternalECModel.g:2347:4: lv_name_0_0= 'ActivityFinal'
            {
            lv_name_0_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getActivityFinalAccess().getNameActivityFinalKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getActivityFinalRule());
              				}
              				setWithLastConsumed(current, "name", lv_name_0_0, "ActivityFinal");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActivityFinal"


    // $ANTLR start "entryRuleInitalNode"
    // InternalECModel.g:2362:1: entryRuleInitalNode returns [EObject current=null] : iv_ruleInitalNode= ruleInitalNode EOF ;
    public final EObject entryRuleInitalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitalNode = null;


        try {
            // InternalECModel.g:2362:51: (iv_ruleInitalNode= ruleInitalNode EOF )
            // InternalECModel.g:2363:2: iv_ruleInitalNode= ruleInitalNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitalNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitalNode=ruleInitalNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitalNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInitalNode"


    // $ANTLR start "ruleInitalNode"
    // InternalECModel.g:2369:1: ruleInitalNode returns [EObject current=null] : ( (lv_name_0_0= 'ActivityStart' ) ) ;
    public final EObject ruleInitalNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalECModel.g:2375:2: ( ( (lv_name_0_0= 'ActivityStart' ) ) )
            // InternalECModel.g:2376:2: ( (lv_name_0_0= 'ActivityStart' ) )
            {
            // InternalECModel.g:2376:2: ( (lv_name_0_0= 'ActivityStart' ) )
            // InternalECModel.g:2377:3: (lv_name_0_0= 'ActivityStart' )
            {
            // InternalECModel.g:2377:3: (lv_name_0_0= 'ActivityStart' )
            // InternalECModel.g:2378:4: lv_name_0_0= 'ActivityStart'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getInitalNodeAccess().getNameActivityStartKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getInitalNodeRule());
              				}
              				setWithLastConsumed(current, "name", lv_name_0_0, "ActivityStart");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInitalNode"


    // $ANTLR start "entryRuleForkNode"
    // InternalECModel.g:2393:1: entryRuleForkNode returns [EObject current=null] : iv_ruleForkNode= ruleForkNode EOF ;
    public final EObject entryRuleForkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkNode = null;


        try {
            // InternalECModel.g:2393:49: (iv_ruleForkNode= ruleForkNode EOF )
            // InternalECModel.g:2394:2: iv_ruleForkNode= ruleForkNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForkNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForkNode=ruleForkNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForkNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForkNode"


    // $ANTLR start "ruleForkNode"
    // InternalECModel.g:2400:1: ruleForkNode returns [EObject current=null] : (otherlv_0= 'ForkNode' otherlv_1= '->' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' ) ;
    public final EObject ruleForkNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalECModel.g:2406:2: ( (otherlv_0= 'ForkNode' otherlv_1= '->' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' ) )
            // InternalECModel.g:2407:2: (otherlv_0= 'ForkNode' otherlv_1= '->' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )
            {
            // InternalECModel.g:2407:2: (otherlv_0= 'ForkNode' otherlv_1= '->' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')' )
            // InternalECModel.g:2408:3: otherlv_0= 'ForkNode' otherlv_1= '->' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForkNodeAccess().getForkNodeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForkNodeAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalECModel.g:2420:3: ( (otherlv_3= RULE_ID ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalECModel.g:2421:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalECModel.g:2421:4: (otherlv_3= RULE_ID )
            	    // InternalECModel.g:2422:5: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getForkNodeRule());
            	      					}
            	      				
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getForkNodeAccess().getStartlinksJoinExpCrossReference_3_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleForkNode"


    // $ANTLR start "entryRuleJoinNode"
    // InternalECModel.g:2441:1: entryRuleJoinNode returns [EObject current=null] : iv_ruleJoinNode= ruleJoinNode EOF ;
    public final EObject entryRuleJoinNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinNode = null;


        try {
            // InternalECModel.g:2441:49: (iv_ruleJoinNode= ruleJoinNode EOF )
            // InternalECModel.g:2442:2: iv_ruleJoinNode= ruleJoinNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJoinNode=ruleJoinNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJoinNode"


    // $ANTLR start "ruleJoinNode"
    // InternalECModel.g:2448:1: ruleJoinNode returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) )+ otherlv_2= ')' otherlv_3= '->' otherlv_4= 'JoinNode' ) ;
    public final EObject ruleJoinNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalECModel.g:2454:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) )+ otherlv_2= ')' otherlv_3= '->' otherlv_4= 'JoinNode' ) )
            // InternalECModel.g:2455:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) )+ otherlv_2= ')' otherlv_3= '->' otherlv_4= 'JoinNode' )
            {
            // InternalECModel.g:2455:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) )+ otherlv_2= ')' otherlv_3= '->' otherlv_4= 'JoinNode' )
            // InternalECModel.g:2456:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) )+ otherlv_2= ')' otherlv_3= '->' otherlv_4= 'JoinNode'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalECModel.g:2460:3: ( (otherlv_1= RULE_ID ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalECModel.g:2461:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalECModel.g:2461:4: (otherlv_1= RULE_ID )
            	    // InternalECModel.g:2462:5: otherlv_1= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getJoinNodeRule());
            	      					}
            	      				
            	    }
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_1, grammarAccess.getJoinNodeAccess().getEndlinksJoinExpCrossReference_1_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getJoinNodeAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getJoinNodeAccess().getJoinNodeKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJoinNode"


    // $ANTLR start "entryRuleComplexOpeartion"
    // InternalECModel.g:2489:1: entryRuleComplexOpeartion returns [EObject current=null] : iv_ruleComplexOpeartion= ruleComplexOpeartion EOF ;
    public final EObject entryRuleComplexOpeartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexOpeartion = null;


        try {
            // InternalECModel.g:2489:57: (iv_ruleComplexOpeartion= ruleComplexOpeartion EOF )
            // InternalECModel.g:2490:2: iv_ruleComplexOpeartion= ruleComplexOpeartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexOpeartionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComplexOpeartion=ruleComplexOpeartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexOpeartion; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComplexOpeartion"


    // $ANTLR start "ruleComplexOpeartion"
    // InternalECModel.g:2496:1: ruleComplexOpeartion returns [EObject current=null] : (this_LoopExp_0= ruleLoopExp | this_SwitchExp_1= ruleSwitchExp ) ;
    public final EObject ruleComplexOpeartion() throws RecognitionException {
        EObject current = null;

        EObject this_LoopExp_0 = null;

        EObject this_SwitchExp_1 = null;



        	enterRule();

        try {
            // InternalECModel.g:2502:2: ( (this_LoopExp_0= ruleLoopExp | this_SwitchExp_1= ruleSwitchExp ) )
            // InternalECModel.g:2503:2: (this_LoopExp_0= ruleLoopExp | this_SwitchExp_1= ruleSwitchExp )
            {
            // InternalECModel.g:2503:2: (this_LoopExp_0= ruleLoopExp | this_SwitchExp_1= ruleSwitchExp )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            else if ( (LA51_0==54) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalECModel.g:2504:3: this_LoopExp_0= ruleLoopExp
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComplexOpeartionAccess().getLoopExpParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LoopExp_0=ruleLoopExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LoopExp_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:2513:3: this_SwitchExp_1= ruleSwitchExp
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComplexOpeartionAccess().getSwitchExpParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchExp_1=ruleSwitchExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SwitchExp_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComplexOpeartion"


    // $ANTLR start "entryRuleSimpleOperation"
    // InternalECModel.g:2525:1: entryRuleSimpleOperation returns [EObject current=null] : iv_ruleSimpleOperation= ruleSimpleOperation EOF ;
    public final EObject entryRuleSimpleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOperation = null;


        try {
            // InternalECModel.g:2525:56: (iv_ruleSimpleOperation= ruleSimpleOperation EOF )
            // InternalECModel.g:2526:2: iv_ruleSimpleOperation= ruleSimpleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleOperation=ruleSimpleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleOperation"


    // $ANTLR start "ruleSimpleOperation"
    // InternalECModel.g:2532:1: ruleSimpleOperation returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSimpleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalECModel.g:2538:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalECModel.g:2539:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalECModel.g:2539:2: ( (otherlv_0= RULE_ID ) )
            // InternalECModel.g:2540:3: (otherlv_0= RULE_ID )
            {
            // InternalECModel.g:2540:3: (otherlv_0= RULE_ID )
            // InternalECModel.g:2541:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSimpleOperationRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getSimpleOperationAccess().getRefOperationCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleOperation"


    // $ANTLR start "entryRuleLoopExp"
    // InternalECModel.g:2555:1: entryRuleLoopExp returns [EObject current=null] : iv_ruleLoopExp= ruleLoopExp EOF ;
    public final EObject entryRuleLoopExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopExp = null;


        try {
            // InternalECModel.g:2555:48: (iv_ruleLoopExp= ruleLoopExp EOF )
            // InternalECModel.g:2556:2: iv_ruleLoopExp= ruleLoopExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoopExp=ruleLoopExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopExp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLoopExp"


    // $ANTLR start "ruleLoopExp"
    // InternalECModel.g:2562:1: ruleLoopExp returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_exps_4_0= ruleWorkflowExp ) )* otherlv_5= '}' ) ;
    public final EObject ruleLoopExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_exps_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:2568:2: ( (otherlv_0= 'Loop' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_exps_4_0= ruleWorkflowExp ) )* otherlv_5= '}' ) )
            // InternalECModel.g:2569:2: (otherlv_0= 'Loop' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_exps_4_0= ruleWorkflowExp ) )* otherlv_5= '}' )
            {
            // InternalECModel.g:2569:2: (otherlv_0= 'Loop' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_exps_4_0= ruleWorkflowExp ) )* otherlv_5= '}' )
            // InternalECModel.g:2570:3: otherlv_0= 'Loop' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_exps_4_0= ruleWorkflowExp ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLoopExpAccess().getLoopKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLoopExpAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalECModel.g:2578:3: ( (lv_name_2_0= ruleSimpleNameCS ) )
            // InternalECModel.g:2579:4: (lv_name_2_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:2579:4: (lv_name_2_0= ruleSimpleNameCS )
            // InternalECModel.g:2580:5: lv_name_2_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLoopExpAccess().getNameSimpleNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLoopExpRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLoopExpAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalECModel.g:2601:3: ( (lv_exps_4_0= ruleWorkflowExp ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID||(LA52_0>=21 && LA52_0<=22)||(LA52_0>=49 && LA52_0<=51)||(LA52_0>=53 && LA52_0<=54)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalECModel.g:2602:4: (lv_exps_4_0= ruleWorkflowExp )
            	    {
            	    // InternalECModel.g:2602:4: (lv_exps_4_0= ruleWorkflowExp )
            	    // InternalECModel.g:2603:5: lv_exps_4_0= ruleWorkflowExp
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getLoopExpAccess().getExpsWorkflowExpParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_exps_4_0=ruleWorkflowExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getLoopExpRule());
            	      					}
            	      					add(
            	      						current,
            	      						"exps",
            	      						lv_exps_4_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.WorkflowExp");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getLoopExpAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLoopExp"


    // $ANTLR start "entryRuleSwitchExp"
    // InternalECModel.g:2628:1: entryRuleSwitchExp returns [EObject current=null] : iv_ruleSwitchExp= ruleSwitchExp EOF ;
    public final EObject entryRuleSwitchExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchExp = null;


        try {
            // InternalECModel.g:2628:50: (iv_ruleSwitchExp= ruleSwitchExp EOF )
            // InternalECModel.g:2629:2: iv_ruleSwitchExp= ruleSwitchExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchExp=ruleSwitchExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchExp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchExp"


    // $ANTLR start "ruleSwitchExp"
    // InternalECModel.g:2635:1: ruleSwitchExp returns [EObject current=null] : (otherlv_0= 'Switch' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleSwitchCase ) )* ( (lv_default_5_0= ruleSwitchDefault ) )? otherlv_6= '}' ) ;
    public final EObject ruleSwitchExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_cases_4_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:2641:2: ( (otherlv_0= 'Switch' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleSwitchCase ) )* ( (lv_default_5_0= ruleSwitchDefault ) )? otherlv_6= '}' ) )
            // InternalECModel.g:2642:2: (otherlv_0= 'Switch' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleSwitchCase ) )* ( (lv_default_5_0= ruleSwitchDefault ) )? otherlv_6= '}' )
            {
            // InternalECModel.g:2642:2: (otherlv_0= 'Switch' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleSwitchCase ) )* ( (lv_default_5_0= ruleSwitchDefault ) )? otherlv_6= '}' )
            // InternalECModel.g:2643:3: otherlv_0= 'Switch' otherlv_1= '->' ( (lv_name_2_0= ruleSimpleNameCS ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleSwitchCase ) )* ( (lv_default_5_0= ruleSwitchDefault ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchExpAccess().getSwitchKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSwitchExpAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalECModel.g:2651:3: ( (lv_name_2_0= ruleSimpleNameCS ) )
            // InternalECModel.g:2652:4: (lv_name_2_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:2652:4: (lv_name_2_0= ruleSimpleNameCS )
            // InternalECModel.g:2653:5: lv_name_2_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSwitchExpAccess().getNameSimpleNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSwitchExpRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSwitchExpAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalECModel.g:2674:3: ( (lv_cases_4_0= ruleSwitchCase ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==55) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalECModel.g:2675:4: (lv_cases_4_0= ruleSwitchCase )
            	    {
            	    // InternalECModel.g:2675:4: (lv_cases_4_0= ruleSwitchCase )
            	    // InternalECModel.g:2676:5: lv_cases_4_0= ruleSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchExpAccess().getCasesSwitchCaseParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_cases_4_0=ruleSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchExpRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cases",
            	      						lv_cases_4_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.SwitchCase");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalECModel.g:2693:3: ( (lv_default_5_0= ruleSwitchDefault ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==56) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalECModel.g:2694:4: (lv_default_5_0= ruleSwitchDefault )
                    {
                    // InternalECModel.g:2694:4: (lv_default_5_0= ruleSwitchDefault )
                    // InternalECModel.g:2695:5: lv_default_5_0= ruleSwitchDefault
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSwitchExpAccess().getDefaultSwitchDefaultParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_50);
                    lv_default_5_0=ruleSwitchDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSwitchExpRule());
                      					}
                      					set(
                      						current,
                      						"default",
                      						lv_default_5_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.SwitchDefault");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSwitchExpAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSwitchExp"


    // $ANTLR start "entryRuleSwitchCase"
    // InternalECModel.g:2720:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalECModel.g:2720:51: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalECModel.g:2721:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // InternalECModel.g:2727:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'case:' ( (lv_caseValue_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_op_3_0= ruleSimpleOperation ) ) ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_caseValue_1_0 = null;

        EObject lv_op_3_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:2733:2: ( (otherlv_0= 'case:' ( (lv_caseValue_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_op_3_0= ruleSimpleOperation ) ) ) )
            // InternalECModel.g:2734:2: (otherlv_0= 'case:' ( (lv_caseValue_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_op_3_0= ruleSimpleOperation ) ) )
            {
            // InternalECModel.g:2734:2: (otherlv_0= 'case:' ( (lv_caseValue_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_op_3_0= ruleSimpleOperation ) ) )
            // InternalECModel.g:2735:3: otherlv_0= 'case:' ( (lv_caseValue_1_0= ruleSimpleNameCS ) ) otherlv_2= '->' ( (lv_op_3_0= ruleSimpleOperation ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getCaseKeyword_0());
              		
            }
            // InternalECModel.g:2739:3: ( (lv_caseValue_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:2740:4: (lv_caseValue_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:2740:4: (lv_caseValue_1_0= ruleSimpleNameCS )
            // InternalECModel.g:2741:5: lv_caseValue_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSwitchCaseAccess().getCaseValueSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_caseValue_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              					}
              					set(
              						current,
              						"caseValue",
              						lv_caseValue_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getHyphenMinusGreaterThanSignKeyword_2());
              		
            }
            // InternalECModel.g:2762:3: ( (lv_op_3_0= ruleSimpleOperation ) )
            // InternalECModel.g:2763:4: (lv_op_3_0= ruleSimpleOperation )
            {
            // InternalECModel.g:2763:4: (lv_op_3_0= ruleSimpleOperation )
            // InternalECModel.g:2764:5: lv_op_3_0= ruleSimpleOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSwitchCaseAccess().getOpSimpleOperationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_op_3_0=ruleSimpleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_3_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleSwitchDefault"
    // InternalECModel.g:2785:1: entryRuleSwitchDefault returns [EObject current=null] : iv_ruleSwitchDefault= ruleSwitchDefault EOF ;
    public final EObject entryRuleSwitchDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchDefault = null;


        try {
            // InternalECModel.g:2785:54: (iv_ruleSwitchDefault= ruleSwitchDefault EOF )
            // InternalECModel.g:2786:2: iv_ruleSwitchDefault= ruleSwitchDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchDefaultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchDefault=ruleSwitchDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchDefault; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchDefault"


    // $ANTLR start "ruleSwitchDefault"
    // InternalECModel.g:2792:1: ruleSwitchDefault returns [EObject current=null] : (otherlv_0= 'default:' ( (lv_op_1_0= ruleSimpleOperation ) ) ) ;
    public final EObject ruleSwitchDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:2798:2: ( (otherlv_0= 'default:' ( (lv_op_1_0= ruleSimpleOperation ) ) ) )
            // InternalECModel.g:2799:2: (otherlv_0= 'default:' ( (lv_op_1_0= ruleSimpleOperation ) ) )
            {
            // InternalECModel.g:2799:2: (otherlv_0= 'default:' ( (lv_op_1_0= ruleSimpleOperation ) ) )
            // InternalECModel.g:2800:3: otherlv_0= 'default:' ( (lv_op_1_0= ruleSimpleOperation ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchDefaultAccess().getDefaultKeyword_0());
              		
            }
            // InternalECModel.g:2804:3: ( (lv_op_1_0= ruleSimpleOperation ) )
            // InternalECModel.g:2805:4: (lv_op_1_0= ruleSimpleOperation )
            {
            // InternalECModel.g:2805:4: (lv_op_1_0= ruleSimpleOperation )
            // InternalECModel.g:2806:5: lv_op_1_0= ruleSimpleOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSwitchDefaultAccess().getOpSimpleOperationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_op_1_0=ruleSimpleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSwitchDefaultRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSwitchDefault"


    // $ANTLR start "entryRuleOperation"
    // InternalECModel.g:2827:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalECModel.g:2827:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalECModel.g:2828:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalECModel.g:2834:1: ruleOperation returns [EObject current=null] : ( ( (lv_name_0_0= ruleOperationName ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeCS ) ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_parameter_2_0 = null;

        EObject lv_parameter_4_0 = null;

        EObject lv_returnType_7_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:2840:2: ( ( ( (lv_name_0_0= ruleOperationName ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeCS ) ) )? ) )
            // InternalECModel.g:2841:2: ( ( (lv_name_0_0= ruleOperationName ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeCS ) ) )? )
            {
            // InternalECModel.g:2841:2: ( ( (lv_name_0_0= ruleOperationName ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeCS ) ) )? )
            // InternalECModel.g:2842:3: ( (lv_name_0_0= ruleOperationName ) ) otherlv_1= '(' ( (lv_parameter_2_0= ruleParameter ) )? (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* otherlv_5= ')' (otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeCS ) ) )?
            {
            // InternalECModel.g:2842:3: ( (lv_name_0_0= ruleOperationName ) )
            // InternalECModel.g:2843:4: (lv_name_0_0= ruleOperationName )
            {
            // InternalECModel.g:2843:4: (lv_name_0_0= ruleOperationName )
            // InternalECModel.g:2844:5: lv_name_0_0= ruleOperationName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getNameOperationNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_0_0=ruleOperationName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.OperationName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalECModel.g:2865:3: ( (lv_parameter_2_0= ruleParameter ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalECModel.g:2866:4: (lv_parameter_2_0= ruleParameter )
                    {
                    // InternalECModel.g:2866:4: (lv_parameter_2_0= ruleParameter )
                    // InternalECModel.g:2867:5: lv_parameter_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_36);
                    lv_parameter_2_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationRule());
                      					}
                      					add(
                      						current,
                      						"parameter",
                      						lv_parameter_2_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.Parameter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:2884:3: (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==40) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalECModel.g:2885:4: otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) )
            	    {
            	    otherlv_3=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalECModel.g:2889:4: ( (lv_parameter_4_0= ruleParameter ) )
            	    // InternalECModel.g:2890:5: (lv_parameter_4_0= ruleParameter )
            	    {
            	    // InternalECModel.g:2890:5: (lv_parameter_4_0= ruleParameter )
            	    // InternalECModel.g:2891:6: lv_parameter_4_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_parameter_4_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOperationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameter",
            	      							lv_parameter_4_0,
            	      							"org.xtext.example.edgecloudmodel.ECModel.Parameter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalECModel.g:2913:3: (otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeCS ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==48) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalECModel.g:2914:4: otherlv_6= ':' ( (lv_returnType_7_0= ruleTypeCS ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getColonKeyword_5_0());
                      			
                    }
                    // InternalECModel.g:2918:4: ( (lv_returnType_7_0= ruleTypeCS ) )
                    // InternalECModel.g:2919:5: (lv_returnType_7_0= ruleTypeCS )
                    {
                    // InternalECModel.g:2919:5: (lv_returnType_7_0= ruleTypeCS )
                    // InternalECModel.g:2920:6: lv_returnType_7_0= ruleTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeTypeCSParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_returnType_7_0=ruleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationRule());
                      						}
                      						set(
                      							current,
                      							"returnType",
                      							lv_returnType_7_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.TypeCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationName"
    // InternalECModel.g:2942:1: entryRuleOperationName returns [String current=null] : iv_ruleOperationName= ruleOperationName EOF ;
    public final String entryRuleOperationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationName = null;


        try {
            // InternalECModel.g:2942:53: (iv_ruleOperationName= ruleOperationName EOF )
            // InternalECModel.g:2943:2: iv_ruleOperationName= ruleOperationName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationName=ruleOperationName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationName"


    // $ANTLR start "ruleOperationName"
    // InternalECModel.g:2949:1: ruleOperationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SimpleNameCS_0= ruleSimpleNameCS ;
    public final AntlrDatatypeRuleToken ruleOperationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleNameCS_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:2955:2: (this_SimpleNameCS_0= ruleSimpleNameCS )
            // InternalECModel.g:2956:2: this_SimpleNameCS_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getOperationNameAccess().getSimpleNameCSParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SimpleNameCS_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SimpleNameCS_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperationName"


    // $ANTLR start "entryRuleParameter"
    // InternalECModel.g:2969:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalECModel.g:2969:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalECModel.g:2970:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalECModel.g:2976:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleParametersName ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:2982:2: ( ( ( (lv_name_0_0= ruleParametersName ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )? ) )
            // InternalECModel.g:2983:2: ( ( (lv_name_0_0= ruleParametersName ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )? )
            {
            // InternalECModel.g:2983:2: ( ( (lv_name_0_0= ruleParametersName ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )? )
            // InternalECModel.g:2984:3: ( (lv_name_0_0= ruleParametersName ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )?
            {
            // InternalECModel.g:2984:3: ( (lv_name_0_0= ruleParametersName ) )
            // InternalECModel.g:2985:4: (lv_name_0_0= ruleParametersName )
            {
            // InternalECModel.g:2985:4: (lv_name_0_0= ruleParametersName )
            // InternalECModel.g:2986:5: lv_name_0_0= ruleParametersName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getNameParametersNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_52);
            lv_name_0_0=ruleParametersName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.ParametersName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:3003:3: (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==48) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalECModel.g:3004:4: otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) )
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalECModel.g:3008:4: ( (lv_type_2_0= ruleTypeCS ) )
                    // InternalECModel.g:3009:5: (lv_type_2_0= ruleTypeCS )
                    {
                    // InternalECModel.g:3009:5: (lv_type_2_0= ruleTypeCS )
                    // InternalECModel.g:3010:6: lv_type_2_0= ruleTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.TypeCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParametersName"
    // InternalECModel.g:3032:1: entryRuleParametersName returns [String current=null] : iv_ruleParametersName= ruleParametersName EOF ;
    public final String entryRuleParametersName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParametersName = null;


        try {
            // InternalECModel.g:3032:54: (iv_ruleParametersName= ruleParametersName EOF )
            // InternalECModel.g:3033:2: iv_ruleParametersName= ruleParametersName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParametersName=ruleParametersName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParametersName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParametersName"


    // $ANTLR start "ruleParametersName"
    // InternalECModel.g:3039:1: ruleParametersName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SimpleNameCS_0= ruleSimpleNameCS ;
    public final AntlrDatatypeRuleToken ruleParametersName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleNameCS_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:3045:2: (this_SimpleNameCS_0= ruleSimpleNameCS )
            // InternalECModel.g:3046:2: this_SimpleNameCS_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getParametersNameAccess().getSimpleNameCSParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SimpleNameCS_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SimpleNameCS_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParametersName"


    // $ANTLR start "entryRuleEntity"
    // InternalECModel.g:3059:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalECModel.g:3059:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalECModel.g:3060:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalECModel.g:3066:1: ruleEntity returns [EObject current=null] : ( ( (lv_isCRUD_0_0= '@AutoCRUD' ) )? otherlv_1= 'Entity' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= '@Description(' ( (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_8= ')' )? ( (lv_attributes_9_0= ruleAttribute ) )* (otherlv_10= '[Refer]' ( (lv_reference_11_0= ruleReference ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_isCRUD_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_reference_11_0 = null;

        EObject lv_invariance_13_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:3072:2: ( ( ( (lv_isCRUD_0_0= '@AutoCRUD' ) )? otherlv_1= 'Entity' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= '@Description(' ( (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_8= ')' )? ( (lv_attributes_9_0= ruleAttribute ) )* (otherlv_10= '[Refer]' ( (lv_reference_11_0= ruleReference ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}' ) )
            // InternalECModel.g:3073:2: ( ( (lv_isCRUD_0_0= '@AutoCRUD' ) )? otherlv_1= 'Entity' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= '@Description(' ( (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_8= ')' )? ( (lv_attributes_9_0= ruleAttribute ) )* (otherlv_10= '[Refer]' ( (lv_reference_11_0= ruleReference ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}' )
            {
            // InternalECModel.g:3073:2: ( ( (lv_isCRUD_0_0= '@AutoCRUD' ) )? otherlv_1= 'Entity' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= '@Description(' ( (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_8= ')' )? ( (lv_attributes_9_0= ruleAttribute ) )* (otherlv_10= '[Refer]' ( (lv_reference_11_0= ruleReference ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}' )
            // InternalECModel.g:3074:3: ( (lv_isCRUD_0_0= '@AutoCRUD' ) )? otherlv_1= 'Entity' ( (lv_name_2_0= ruleSimpleNameCS ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= '@Description(' ( (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_8= ')' )? ( (lv_attributes_9_0= ruleAttribute ) )* (otherlv_10= '[Refer]' ( (lv_reference_11_0= ruleReference ) )* )? (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )? otherlv_14= '}'
            {
            // InternalECModel.g:3074:3: ( (lv_isCRUD_0_0= '@AutoCRUD' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==57) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalECModel.g:3075:4: (lv_isCRUD_0_0= '@AutoCRUD' )
                    {
                    // InternalECModel.g:3075:4: (lv_isCRUD_0_0= '@AutoCRUD' )
                    // InternalECModel.g:3076:5: lv_isCRUD_0_0= '@AutoCRUD'
                    {
                    lv_isCRUD_0_0=(Token)match(input,57,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isCRUD_0_0, grammarAccess.getEntityAccess().getIsCRUDAutoCRUDKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEntityRule());
                      					}
                      					setWithLastConsumed(current, "isCRUD", lv_isCRUD_0_0 != null, "@AutoCRUD");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
              		
            }
            // InternalECModel.g:3092:3: ( (lv_name_2_0= ruleSimpleNameCS ) )
            // InternalECModel.g:3093:4: (lv_name_2_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:3093:4: (lv_name_2_0= ruleSimpleNameCS )
            // InternalECModel.g:3094:5: lv_name_2_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntityAccess().getNameSimpleNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_name_2_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEntityRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:3111:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==37) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalECModel.g:3112:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalECModel.g:3116:4: ( (otherlv_4= RULE_ID ) )
                    // InternalECModel.g:3117:5: (otherlv_4= RULE_ID )
                    {
                    // InternalECModel.g:3117:5: (otherlv_4= RULE_ID )
                    // InternalECModel.g:3118:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEntityRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalECModel.g:3134:3: (otherlv_6= '@Description(' ( (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_8= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==13) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalECModel.g:3135:4: otherlv_6= '@Description(' ( (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getDescriptionKeyword_5_0());
                      			
                    }
                    // InternalECModel.g:3139:4: ( (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING ) )
                    // InternalECModel.g:3140:5: (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:3140:5: (lv_description_7_0= RULE_DOUBLE_QUOTED_STRING )
                    // InternalECModel.g:3141:6: lv_description_7_0= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_7_0, grammarAccess.getEntityAccess().getDescriptionDOUBLE_QUOTED_STRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEntityRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_7_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:3162:3: ( (lv_attributes_9_0= ruleAttribute ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalECModel.g:3163:4: (lv_attributes_9_0= ruleAttribute )
            	    {
            	    // InternalECModel.g:3163:4: (lv_attributes_9_0= ruleAttribute )
            	    // InternalECModel.g:3164:5: lv_attributes_9_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_attributes_9_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEntityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_9_0,
            	      						"org.xtext.example.edgecloudmodel.ECModel.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // InternalECModel.g:3181:3: (otherlv_10= '[Refer]' ( (lv_reference_11_0= ruleReference ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==59) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalECModel.g:3182:4: otherlv_10= '[Refer]' ( (lv_reference_11_0= ruleReference ) )*
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getReferKeyword_7_0());
                      			
                    }
                    // InternalECModel.g:3186:4: ( (lv_reference_11_0= ruleReference ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_ID) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalECModel.g:3187:5: (lv_reference_11_0= ruleReference )
                    	    {
                    	    // InternalECModel.g:3187:5: (lv_reference_11_0= ruleReference )
                    	    // InternalECModel.g:3188:6: lv_reference_11_0= ruleReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getEntityAccess().getReferenceReferenceParserRuleCall_7_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_43);
                    	    lv_reference_11_0=ruleReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"reference",
                    	      							lv_reference_11_0,
                    	      							"org.xtext.example.edgecloudmodel.ECModel.Reference");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalECModel.g:3206:3: (otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==47) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalECModel.g:3207:4: otherlv_12= '[INV]' ( (lv_invariance_13_0= ruleInvariance ) )*
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getINVKeyword_8_0());
                      			
                    }
                    // InternalECModel.g:3211:4: ( (lv_invariance_13_0= ruleInvariance ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==64) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalECModel.g:3212:5: (lv_invariance_13_0= ruleInvariance )
                    	    {
                    	    // InternalECModel.g:3212:5: (lv_invariance_13_0= ruleInvariance )
                    	    // InternalECModel.g:3213:6: lv_invariance_13_0= ruleInvariance
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getEntityAccess().getInvarianceInvarianceParserRuleCall_8_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_44);
                    	    lv_invariance_13_0=ruleInvariance();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"invariance",
                    	      							lv_invariance_13_0,
                    	      							"org.xtext.example.edgecloudmodel.ECModel.Invariance");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalECModel.g:3239:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalECModel.g:3239:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalECModel.g:3240:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalECModel.g:3246:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) ( (lv_ismultiple_3_0= '*' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_ismultiple_3_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:3252:2: ( ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) ( (lv_ismultiple_3_0= '*' ) )? ) )
            // InternalECModel.g:3253:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) ( (lv_ismultiple_3_0= '*' ) )? )
            {
            // InternalECModel.g:3253:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) ( (lv_ismultiple_3_0= '*' ) )? )
            // InternalECModel.g:3254:3: ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) ( (lv_ismultiple_3_0= '*' ) )?
            {
            // InternalECModel.g:3254:3: ( (lv_name_0_0= ruleSimpleNameCS ) )
            // InternalECModel.g:3255:4: (lv_name_0_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:3255:4: (lv_name_0_0= ruleSimpleNameCS )
            // InternalECModel.g:3256:5: lv_name_0_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getNameSimpleNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_name_0_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
              		
            }
            // InternalECModel.g:3277:3: ( (lv_type_2_0= ruleTypeCS ) )
            // InternalECModel.g:3278:4: (lv_type_2_0= ruleTypeCS )
            {
            // InternalECModel.g:3278:4: (lv_type_2_0= ruleTypeCS )
            // InternalECModel.g:3279:5: lv_type_2_0= ruleTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_57);
            lv_type_2_0=ruleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.TypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:3296:3: ( (lv_ismultiple_3_0= '*' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==60) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalECModel.g:3297:4: (lv_ismultiple_3_0= '*' )
                    {
                    // InternalECModel.g:3297:4: (lv_ismultiple_3_0= '*' )
                    // InternalECModel.g:3298:5: lv_ismultiple_3_0= '*'
                    {
                    lv_ismultiple_3_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_ismultiple_3_0, grammarAccess.getAttributeAccess().getIsmultipleAsteriskKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeRule());
                      					}
                      					setWithLastConsumed(current, "ismultiple", lv_ismultiple_3_0 != null, "*");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalECModel.g:3314:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalECModel.g:3314:50: (iv_ruleReference= ruleReference EOF )
            // InternalECModel.g:3315:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalECModel.g:3321:1: ruleReference returns [EObject current=null] : ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_ismultiple_3_0= '*' ) )? ( (lv_isReverseAssoication_4_0= '!' ) )? ( (lv_isAggregation_5_0= '@-' ) )? ( (lv_isComposition_6_0= '*-' ) )? ( (lv_type_7_0= ruleAssociationTypeCS ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_ismultiple_3_0=null;
        Token lv_isReverseAssoication_4_0=null;
        Token lv_isAggregation_5_0=null;
        Token lv_isComposition_6_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:3327:2: ( ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_ismultiple_3_0= '*' ) )? ( (lv_isReverseAssoication_4_0= '!' ) )? ( (lv_isAggregation_5_0= '@-' ) )? ( (lv_isComposition_6_0= '*-' ) )? ( (lv_type_7_0= ruleAssociationTypeCS ) ) ) )
            // InternalECModel.g:3328:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_ismultiple_3_0= '*' ) )? ( (lv_isReverseAssoication_4_0= '!' ) )? ( (lv_isAggregation_5_0= '@-' ) )? ( (lv_isComposition_6_0= '*-' ) )? ( (lv_type_7_0= ruleAssociationTypeCS ) ) )
            {
            // InternalECModel.g:3328:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_ismultiple_3_0= '*' ) )? ( (lv_isReverseAssoication_4_0= '!' ) )? ( (lv_isAggregation_5_0= '@-' ) )? ( (lv_isComposition_6_0= '*-' ) )? ( (lv_type_7_0= ruleAssociationTypeCS ) ) )
            // InternalECModel.g:3329:3: ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_ismultiple_3_0= '*' ) )? ( (lv_isReverseAssoication_4_0= '!' ) )? ( (lv_isAggregation_5_0= '@-' ) )? ( (lv_isComposition_6_0= '*-' ) )? ( (lv_type_7_0= ruleAssociationTypeCS ) )
            {
            // InternalECModel.g:3329:3: ( (lv_name_0_0= ruleSimpleNameCS ) )
            // InternalECModel.g:3330:4: (lv_name_0_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:3330:4: (lv_name_0_0= ruleSimpleNameCS )
            // InternalECModel.g:3331:5: lv_name_0_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReferenceAccess().getNameSimpleNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_name_0_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReferenceRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getColonKeyword_1());
              		
            }
            // InternalECModel.g:3352:3: ( (otherlv_2= RULE_ID ) )
            // InternalECModel.g:3353:4: (otherlv_2= RULE_ID )
            {
            // InternalECModel.g:3353:4: (otherlv_2= RULE_ID )
            // InternalECModel.g:3354:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReferenceRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getEntityEntityCrossReference_2_0());
              				
            }

            }


            }

            // InternalECModel.g:3365:3: ( (lv_ismultiple_3_0= '*' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==60) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalECModel.g:3366:4: (lv_ismultiple_3_0= '*' )
                    {
                    // InternalECModel.g:3366:4: (lv_ismultiple_3_0= '*' )
                    // InternalECModel.g:3367:5: lv_ismultiple_3_0= '*'
                    {
                    lv_ismultiple_3_0=(Token)match(input,60,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_ismultiple_3_0, grammarAccess.getReferenceAccess().getIsmultipleAsteriskKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getReferenceRule());
                      					}
                      					setWithLastConsumed(current, "ismultiple", lv_ismultiple_3_0 != null, "*");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:3379:3: ( (lv_isReverseAssoication_4_0= '!' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==61) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalECModel.g:3380:4: (lv_isReverseAssoication_4_0= '!' )
                    {
                    // InternalECModel.g:3380:4: (lv_isReverseAssoication_4_0= '!' )
                    // InternalECModel.g:3381:5: lv_isReverseAssoication_4_0= '!'
                    {
                    lv_isReverseAssoication_4_0=(Token)match(input,61,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isReverseAssoication_4_0, grammarAccess.getReferenceAccess().getIsReverseAssoicationExclamationMarkKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getReferenceRule());
                      					}
                      					setWithLastConsumed(current, "isReverseAssoication", lv_isReverseAssoication_4_0 != null, "!");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:3393:3: ( (lv_isAggregation_5_0= '@-' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==62) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalECModel.g:3394:4: (lv_isAggregation_5_0= '@-' )
                    {
                    // InternalECModel.g:3394:4: (lv_isAggregation_5_0= '@-' )
                    // InternalECModel.g:3395:5: lv_isAggregation_5_0= '@-'
                    {
                    lv_isAggregation_5_0=(Token)match(input,62,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isAggregation_5_0, grammarAccess.getReferenceAccess().getIsAggregationCommercialAtHyphenMinusKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getReferenceRule());
                      					}
                      					setWithLastConsumed(current, "isAggregation", lv_isAggregation_5_0 != null, "@-");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:3407:3: ( (lv_isComposition_6_0= '*-' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==63) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalECModel.g:3408:4: (lv_isComposition_6_0= '*-' )
                    {
                    // InternalECModel.g:3408:4: (lv_isComposition_6_0= '*-' )
                    // InternalECModel.g:3409:5: lv_isComposition_6_0= '*-'
                    {
                    lv_isComposition_6_0=(Token)match(input,63,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isComposition_6_0, grammarAccess.getReferenceAccess().getIsCompositionAsteriskHyphenMinusKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getReferenceRule());
                      					}
                      					setWithLastConsumed(current, "isComposition", lv_isComposition_6_0 != null, "*-");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:3421:3: ( (lv_type_7_0= ruleAssociationTypeCS ) )
            // InternalECModel.g:3422:4: (lv_type_7_0= ruleAssociationTypeCS )
            {
            // InternalECModel.g:3422:4: (lv_type_7_0= ruleAssociationTypeCS )
            // InternalECModel.g:3423:5: lv_type_7_0= ruleAssociationTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReferenceAccess().getTypeAssociationTypeCSParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruleAssociationTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReferenceRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_7_0,
              						"org.xtext.example.edgecloudmodel.ECModel.AssociationTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleTypeCS"
    // InternalECModel.g:3444:1: entryRuleTypeCS returns [EObject current=null] : iv_ruleTypeCS= ruleTypeCS EOF ;
    public final EObject entryRuleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCS = null;


        try {
            // InternalECModel.g:3444:47: (iv_ruleTypeCS= ruleTypeCS EOF )
            // InternalECModel.g:3445:2: iv_ruleTypeCS= ruleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeCS=ruleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeCS"


    // $ANTLR start "ruleTypeCS"
    // InternalECModel.g:3451:1: ruleTypeCS returns [EObject current=null] : (this_EntityType_0= ruleEntityType | this_PrimitiveTypeCS_1= rulePrimitiveTypeCS | this_EnumEntity_2= ruleEnumEntity | this_CollectionTypeCS_3= ruleCollectionTypeCS ) ;
    public final EObject ruleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject this_EntityType_0 = null;

        EObject this_PrimitiveTypeCS_1 = null;

        EObject this_EnumEntity_2 = null;

        EObject this_CollectionTypeCS_3 = null;



        	enterRule();

        try {
            // InternalECModel.g:3457:2: ( (this_EntityType_0= ruleEntityType | this_PrimitiveTypeCS_1= rulePrimitiveTypeCS | this_EnumEntity_2= ruleEnumEntity | this_CollectionTypeCS_3= ruleCollectionTypeCS ) )
            // InternalECModel.g:3458:2: (this_EntityType_0= ruleEntityType | this_PrimitiveTypeCS_1= rulePrimitiveTypeCS | this_EnumEntity_2= ruleEnumEntity | this_CollectionTypeCS_3= ruleCollectionTypeCS )
            {
            // InternalECModel.g:3458:2: (this_EntityType_0= ruleEntityType | this_PrimitiveTypeCS_1= rulePrimitiveTypeCS | this_EnumEntity_2= ruleEnumEntity | this_CollectionTypeCS_3= ruleCollectionTypeCS )
            int alt72=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==66) ) {
                    alt72=3;
                }
                else if ( (LA72_1==EOF||LA72_1==RULE_ID||LA72_1==14||LA72_1==16||LA72_1==19||LA72_1==40||(LA72_1>=45 && LA72_1<=47)||(LA72_1>=59 && LA72_1<=60)||LA72_1==67||LA72_1==72||LA72_1==80||LA72_1==120) ) {
                    alt72=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
                }
                break;
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
                {
                alt72=2;
                }
                break;
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
                {
                alt72=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalECModel.g:3459:3: this_EntityType_0= ruleEntityType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeCSAccess().getEntityTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EntityType_0=ruleEntityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EntityType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:3468:3: this_PrimitiveTypeCS_1= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeCSAccess().getPrimitiveTypeCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeCS_1=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:3477:3: this_EnumEntity_2= ruleEnumEntity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeCSAccess().getEnumEntityParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumEntity_2=ruleEnumEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumEntity_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:3486:3: this_CollectionTypeCS_3= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeCSAccess().getCollectionTypeCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionTypeCS_3=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionTypeCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeCS"


    // $ANTLR start "entryRuleInvariance"
    // InternalECModel.g:3498:1: entryRuleInvariance returns [EObject current=null] : iv_ruleInvariance= ruleInvariance EOF ;
    public final EObject entryRuleInvariance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariance = null;


        try {
            // InternalECModel.g:3498:51: (iv_ruleInvariance= ruleInvariance EOF )
            // InternalECModel.g:3499:2: iv_ruleInvariance= ruleInvariance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvarianceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvariance=ruleInvariance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariance; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvariance"


    // $ANTLR start "ruleInvariance"
    // InternalECModel.g:3505:1: ruleInvariance returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= ':' ( (otherlv_3= '{' ( (lv_ocl_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) | ( (lv_ocl_6_0= ruleOCLExpressionCS ) ) ) ( (lv_isForAssociation_7_0= 'ASSOCINV' ) )? ) ;
    public final EObject ruleInvariance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_isForAssociation_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ocl_4_0 = null;

        EObject lv_ocl_6_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:3511:2: ( (otherlv_0= 'inv' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= ':' ( (otherlv_3= '{' ( (lv_ocl_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) | ( (lv_ocl_6_0= ruleOCLExpressionCS ) ) ) ( (lv_isForAssociation_7_0= 'ASSOCINV' ) )? ) )
            // InternalECModel.g:3512:2: (otherlv_0= 'inv' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= ':' ( (otherlv_3= '{' ( (lv_ocl_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) | ( (lv_ocl_6_0= ruleOCLExpressionCS ) ) ) ( (lv_isForAssociation_7_0= 'ASSOCINV' ) )? )
            {
            // InternalECModel.g:3512:2: (otherlv_0= 'inv' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= ':' ( (otherlv_3= '{' ( (lv_ocl_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) | ( (lv_ocl_6_0= ruleOCLExpressionCS ) ) ) ( (lv_isForAssociation_7_0= 'ASSOCINV' ) )? )
            // InternalECModel.g:3513:3: otherlv_0= 'inv' ( (lv_name_1_0= ruleSimpleNameCS ) ) otherlv_2= ':' ( (otherlv_3= '{' ( (lv_ocl_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) | ( (lv_ocl_6_0= ruleOCLExpressionCS ) ) ) ( (lv_isForAssociation_7_0= 'ASSOCINV' ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvarianceAccess().getInvKeyword_0());
              		
            }
            // InternalECModel.g:3517:3: ( (lv_name_1_0= ruleSimpleNameCS ) )
            // InternalECModel.g:3518:4: (lv_name_1_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:3518:4: (lv_name_1_0= ruleSimpleNameCS )
            // InternalECModel.g:3519:5: lv_name_1_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvarianceAccess().getNameSimpleNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_name_1_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvarianceRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInvarianceAccess().getColonKeyword_2());
              		
            }
            // InternalECModel.g:3540:3: ( (otherlv_3= '{' ( (lv_ocl_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) | ( (lv_ocl_6_0= ruleOCLExpressionCS ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==16) ) {
                alt73=1;
            }
            else if ( ((LA73_0>=RULE_DOUBLE_QUOTED_STRING && LA73_0<=RULE_INT)||LA73_0==21||LA73_0==60||(LA73_0>=113 && LA73_0<=115)||LA73_0==119||LA73_0==121||(LA73_0>=123 && LA73_0<=131)) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalECModel.g:3541:4: (otherlv_3= '{' ( (lv_ocl_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' )
                    {
                    // InternalECModel.g:3541:4: (otherlv_3= '{' ( (lv_ocl_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' )
                    // InternalECModel.g:3542:5: otherlv_3= '{' ( (lv_ocl_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getInvarianceAccess().getLeftCurlyBracketKeyword_3_0_0());
                      				
                    }
                    // InternalECModel.g:3546:5: ( (lv_ocl_4_0= ruleOCLExpressionCS ) )
                    // InternalECModel.g:3547:6: (lv_ocl_4_0= ruleOCLExpressionCS )
                    {
                    // InternalECModel.g:3547:6: (lv_ocl_4_0= ruleOCLExpressionCS )
                    // InternalECModel.g:3548:7: lv_ocl_4_0= ruleOCLExpressionCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getInvarianceAccess().getOclOCLExpressionCSParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    lv_ocl_4_0=ruleOCLExpressionCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getInvarianceRule());
                      							}
                      							set(
                      								current,
                      								"ocl",
                      								lv_ocl_4_0,
                      								"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getInvarianceAccess().getRightCurlyBracketKeyword_3_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalECModel.g:3571:4: ( (lv_ocl_6_0= ruleOCLExpressionCS ) )
                    {
                    // InternalECModel.g:3571:4: ( (lv_ocl_6_0= ruleOCLExpressionCS ) )
                    // InternalECModel.g:3572:5: (lv_ocl_6_0= ruleOCLExpressionCS )
                    {
                    // InternalECModel.g:3572:5: (lv_ocl_6_0= ruleOCLExpressionCS )
                    // InternalECModel.g:3573:6: lv_ocl_6_0= ruleOCLExpressionCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInvarianceAccess().getOclOCLExpressionCSParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_60);
                    lv_ocl_6_0=ruleOCLExpressionCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInvarianceRule());
                      						}
                      						set(
                      							current,
                      							"ocl",
                      							lv_ocl_6_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalECModel.g:3591:3: ( (lv_isForAssociation_7_0= 'ASSOCINV' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==65) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalECModel.g:3592:4: (lv_isForAssociation_7_0= 'ASSOCINV' )
                    {
                    // InternalECModel.g:3592:4: (lv_isForAssociation_7_0= 'ASSOCINV' )
                    // InternalECModel.g:3593:5: lv_isForAssociation_7_0= 'ASSOCINV'
                    {
                    lv_isForAssociation_7_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isForAssociation_7_0, grammarAccess.getInvarianceAccess().getIsForAssociationASSOCINVKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInvarianceRule());
                      					}
                      					setWithLastConsumed(current, "isForAssociation", lv_isForAssociation_7_0 != null, "ASSOCINV");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInvariance"


    // $ANTLR start "entryRuleEntityType"
    // InternalECModel.g:3609:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalECModel.g:3609:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalECModel.g:3610:2: iv_ruleEntityType= ruleEntityType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalECModel.g:3616:1: ruleEntityType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalECModel.g:3622:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalECModel.g:3623:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalECModel.g:3623:2: ( (otherlv_0= RULE_ID ) )
            // InternalECModel.g:3624:3: (otherlv_0= RULE_ID )
            {
            // InternalECModel.g:3624:3: (otherlv_0= RULE_ID )
            // InternalECModel.g:3625:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getEntityTypeRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleEnumEntity"
    // InternalECModel.g:3639:1: entryRuleEnumEntity returns [EObject current=null] : iv_ruleEnumEntity= ruleEnumEntity EOF ;
    public final EObject entryRuleEnumEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumEntity = null;


        try {
            // InternalECModel.g:3639:51: (iv_ruleEnumEntity= ruleEnumEntity EOF )
            // InternalECModel.g:3640:2: iv_ruleEnumEntity= ruleEnumEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumEntity=ruleEnumEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumEntity"


    // $ANTLR start "ruleEnumEntity"
    // InternalECModel.g:3646:1: ruleEnumEntity returns [EObject current=null] : ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '[' ( (lv_element_2_0= ruleEnumItem ) ) (otherlv_3= '|' ( (lv_element_4_0= ruleEnumItem ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleEnumEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:3652:2: ( ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '[' ( (lv_element_2_0= ruleEnumItem ) ) (otherlv_3= '|' ( (lv_element_4_0= ruleEnumItem ) ) )* otherlv_5= ']' ) )
            // InternalECModel.g:3653:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '[' ( (lv_element_2_0= ruleEnumItem ) ) (otherlv_3= '|' ( (lv_element_4_0= ruleEnumItem ) ) )* otherlv_5= ']' )
            {
            // InternalECModel.g:3653:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '[' ( (lv_element_2_0= ruleEnumItem ) ) (otherlv_3= '|' ( (lv_element_4_0= ruleEnumItem ) ) )* otherlv_5= ']' )
            // InternalECModel.g:3654:3: ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '[' ( (lv_element_2_0= ruleEnumItem ) ) (otherlv_3= '|' ( (lv_element_4_0= ruleEnumItem ) ) )* otherlv_5= ']'
            {
            // InternalECModel.g:3654:3: ( (lv_name_0_0= ruleSimpleNameCS ) )
            // InternalECModel.g:3655:4: (lv_name_0_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:3655:4: (lv_name_0_0= ruleSimpleNameCS )
            // InternalECModel.g:3656:5: lv_name_0_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumEntityAccess().getNameSimpleNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_name_0_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumEntityRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,66,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumEntityAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalECModel.g:3677:3: ( (lv_element_2_0= ruleEnumItem ) )
            // InternalECModel.g:3678:4: (lv_element_2_0= ruleEnumItem )
            {
            // InternalECModel.g:3678:4: (lv_element_2_0= ruleEnumItem )
            // InternalECModel.g:3679:5: lv_element_2_0= ruleEnumItem
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumEntityAccess().getElementEnumItemParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_62);
            lv_element_2_0=ruleEnumItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumEntityRule());
              					}
              					add(
              						current,
              						"element",
              						lv_element_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.EnumItem");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:3696:3: (otherlv_3= '|' ( (lv_element_4_0= ruleEnumItem ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==67) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalECModel.g:3697:4: otherlv_3= '|' ( (lv_element_4_0= ruleEnumItem ) )
            	    {
            	    otherlv_3=(Token)match(input,67,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getEnumEntityAccess().getVerticalLineKeyword_3_0());
            	      			
            	    }
            	    // InternalECModel.g:3701:4: ( (lv_element_4_0= ruleEnumItem ) )
            	    // InternalECModel.g:3702:5: (lv_element_4_0= ruleEnumItem )
            	    {
            	    // InternalECModel.g:3702:5: (lv_element_4_0= ruleEnumItem )
            	    // InternalECModel.g:3703:6: lv_element_4_0= ruleEnumItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumEntityAccess().getElementEnumItemParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
            	    lv_element_4_0=ruleEnumItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumEntityRule());
            	      						}
            	      						add(
            	      							current,
            	      							"element",
            	      							lv_element_4_0,
            	      							"org.xtext.example.edgecloudmodel.ECModel.EnumItem");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEnumEntityAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumEntity"


    // $ANTLR start "entryRuleEnumItem"
    // InternalECModel.g:3729:1: entryRuleEnumItem returns [EObject current=null] : iv_ruleEnumItem= ruleEnumItem EOF ;
    public final EObject entryRuleEnumItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItem = null;


        try {
            // InternalECModel.g:3729:49: (iv_ruleEnumItem= ruleEnumItem EOF )
            // InternalECModel.g:3730:2: iv_ruleEnumItem= ruleEnumItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumItemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumItem=ruleEnumItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumItem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumItem"


    // $ANTLR start "ruleEnumItem"
    // InternalECModel.g:3736:1: ruleEnumItem returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalECModel.g:3742:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalECModel.g:3743:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalECModel.g:3743:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalECModel.g:3744:3: (lv_name_0_0= RULE_ID )
            {
            // InternalECModel.g:3744:3: (lv_name_0_0= RULE_ID )
            // InternalECModel.g:3745:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getEnumItemAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getEnumItemRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.xtext.example.edgecloudmodel.ECModel.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumItem"


    // $ANTLR start "entryRuleUSECASE_RELATION"
    // InternalECModel.g:3764:1: entryRuleUSECASE_RELATION returns [String current=null] : iv_ruleUSECASE_RELATION= ruleUSECASE_RELATION EOF ;
    public final String entryRuleUSECASE_RELATION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUSECASE_RELATION = null;


        try {
            // InternalECModel.g:3764:56: (iv_ruleUSECASE_RELATION= ruleUSECASE_RELATION EOF )
            // InternalECModel.g:3765:2: iv_ruleUSECASE_RELATION= ruleUSECASE_RELATION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUSECASE_RELATIONRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUSECASE_RELATION=ruleUSECASE_RELATION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUSECASE_RELATION.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUSECASE_RELATION"


    // $ANTLR start "ruleUSECASE_RELATION"
    // InternalECModel.g:3771:1: ruleUSECASE_RELATION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'include' | kw= 'extend' ) ;
    public final AntlrDatatypeRuleToken ruleUSECASE_RELATION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalECModel.g:3777:2: ( (kw= 'include' | kw= 'extend' ) )
            // InternalECModel.g:3778:2: (kw= 'include' | kw= 'extend' )
            {
            // InternalECModel.g:3778:2: (kw= 'include' | kw= 'extend' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==68) ) {
                alt76=1;
            }
            else if ( (LA76_0==69) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalECModel.g:3779:3: kw= 'include'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUSECASE_RELATIONAccess().getIncludeKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:3785:3: kw= 'extend'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUSECASE_RELATIONAccess().getExtendKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUSECASE_RELATION"


    // $ANTLR start "entryRuleContract"
    // InternalECModel.g:3794:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalECModel.g:3794:49: (iv_ruleContract= ruleContract EOF )
            // InternalECModel.g:3795:2: iv_ruleContract= ruleContract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContract=ruleContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalECModel.g:3801:1: ruleContract returns [EObject current=null] : (otherlv_0= 'Contract' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (lv_op_3_0= ruleOperation ) ) otherlv_4= '{' ( (lv_def_5_0= ruleDefinition ) )? ( (lv_pre_6_0= rulePrecondition ) ) ( (lv_post_7_0= rulePostcondition ) ) otherlv_8= '}' ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_op_3_0 = null;

        EObject lv_def_5_0 = null;

        EObject lv_pre_6_0 = null;

        EObject lv_post_7_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:3807:2: ( (otherlv_0= 'Contract' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (lv_op_3_0= ruleOperation ) ) otherlv_4= '{' ( (lv_def_5_0= ruleDefinition ) )? ( (lv_pre_6_0= rulePrecondition ) ) ( (lv_post_7_0= rulePostcondition ) ) otherlv_8= '}' ) )
            // InternalECModel.g:3808:2: (otherlv_0= 'Contract' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (lv_op_3_0= ruleOperation ) ) otherlv_4= '{' ( (lv_def_5_0= ruleDefinition ) )? ( (lv_pre_6_0= rulePrecondition ) ) ( (lv_post_7_0= rulePostcondition ) ) otherlv_8= '}' )
            {
            // InternalECModel.g:3808:2: (otherlv_0= 'Contract' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (lv_op_3_0= ruleOperation ) ) otherlv_4= '{' ( (lv_def_5_0= ruleDefinition ) )? ( (lv_pre_6_0= rulePrecondition ) ) ( (lv_post_7_0= rulePostcondition ) ) otherlv_8= '}' )
            // InternalECModel.g:3809:3: otherlv_0= 'Contract' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (lv_op_3_0= ruleOperation ) ) otherlv_4= '{' ( (lv_def_5_0= ruleDefinition ) )? ( (lv_pre_6_0= rulePrecondition ) ) ( (lv_post_7_0= rulePostcondition ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
              		
            }
            // InternalECModel.g:3813:3: ( (otherlv_1= RULE_ID ) )
            // InternalECModel.g:3814:4: (otherlv_1= RULE_ID )
            {
            // InternalECModel.g:3814:4: (otherlv_1= RULE_ID )
            // InternalECModel.g:3815:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getContractRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getContractAccess().getServiceServiceCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getColonColonKeyword_2());
              		
            }
            // InternalECModel.g:3830:3: ( (lv_op_3_0= ruleOperation ) )
            // InternalECModel.g:3831:4: (lv_op_3_0= ruleOperation )
            {
            // InternalECModel.g:3831:4: (lv_op_3_0= ruleOperation )
            // InternalECModel.g:3832:5: lv_op_3_0= ruleOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContractAccess().getOpOperationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_op_3_0=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContractRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_3_0,
              						"org.xtext.example.edgecloudmodel.ECModel.Operation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalECModel.g:3853:3: ( (lv_def_5_0= ruleDefinition ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==71) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalECModel.g:3854:4: (lv_def_5_0= ruleDefinition )
                    {
                    // InternalECModel.g:3854:4: (lv_def_5_0= ruleDefinition )
                    // InternalECModel.g:3855:5: lv_def_5_0= ruleDefinition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getContractAccess().getDefDefinitionParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_63);
                    lv_def_5_0=ruleDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getContractRule());
                      					}
                      					set(
                      						current,
                      						"def",
                      						lv_def_5_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.Definition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:3872:3: ( (lv_pre_6_0= rulePrecondition ) )
            // InternalECModel.g:3873:4: (lv_pre_6_0= rulePrecondition )
            {
            // InternalECModel.g:3873:4: (lv_pre_6_0= rulePrecondition )
            // InternalECModel.g:3874:5: lv_pre_6_0= rulePrecondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContractAccess().getPrePreconditionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_64);
            lv_pre_6_0=rulePrecondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContractRule());
              					}
              					set(
              						current,
              						"pre",
              						lv_pre_6_0,
              						"org.xtext.example.edgecloudmodel.ECModel.Precondition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:3891:3: ( (lv_post_7_0= rulePostcondition ) )
            // InternalECModel.g:3892:4: (lv_post_7_0= rulePostcondition )
            {
            // InternalECModel.g:3892:4: (lv_post_7_0= rulePostcondition )
            // InternalECModel.g:3893:5: lv_post_7_0= rulePostcondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContractAccess().getPostPostconditionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_post_7_0=rulePostcondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContractRule());
              					}
              					set(
              						current,
              						"post",
              						lv_post_7_0,
              						"org.xtext.example.edgecloudmodel.ECModel.Postcondition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleDefinition"
    // InternalECModel.g:3918:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalECModel.g:3918:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalECModel.g:3919:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalECModel.g:3925:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'definition' otherlv_1= ':' ( (lv_variable_2_0= ruleVariableDeclarationCS ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariableDeclarationCS ) ) )* ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:3931:2: ( (otherlv_0= 'definition' otherlv_1= ':' ( (lv_variable_2_0= ruleVariableDeclarationCS ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariableDeclarationCS ) ) )* ) )
            // InternalECModel.g:3932:2: (otherlv_0= 'definition' otherlv_1= ':' ( (lv_variable_2_0= ruleVariableDeclarationCS ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariableDeclarationCS ) ) )* )
            {
            // InternalECModel.g:3932:2: (otherlv_0= 'definition' otherlv_1= ':' ( (lv_variable_2_0= ruleVariableDeclarationCS ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariableDeclarationCS ) ) )* )
            // InternalECModel.g:3933:3: otherlv_0= 'definition' otherlv_1= ':' ( (lv_variable_2_0= ruleVariableDeclarationCS ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariableDeclarationCS ) ) )*
            {
            otherlv_0=(Token)match(input,71,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefinitionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getColonKeyword_1());
              		
            }
            // InternalECModel.g:3941:3: ( (lv_variable_2_0= ruleVariableDeclarationCS ) )
            // InternalECModel.g:3942:4: (lv_variable_2_0= ruleVariableDeclarationCS )
            {
            // InternalECModel.g:3942:4: (lv_variable_2_0= ruleVariableDeclarationCS )
            // InternalECModel.g:3943:5: lv_variable_2_0= ruleVariableDeclarationCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getVariableVariableDeclarationCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_variable_2_0=ruleVariableDeclarationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					add(
              						current,
              						"variable",
              						lv_variable_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.VariableDeclarationCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:3960:3: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariableDeclarationCS ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==40) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalECModel.g:3961:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariableDeclarationCS ) )
            	    {
            	    otherlv_3=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalECModel.g:3965:4: ( (lv_variable_4_0= ruleVariableDeclarationCS ) )
            	    // InternalECModel.g:3966:5: (lv_variable_4_0= ruleVariableDeclarationCS )
            	    {
            	    // InternalECModel.g:3966:5: (lv_variable_4_0= ruleVariableDeclarationCS )
            	    // InternalECModel.g:3967:6: lv_variable_4_0= ruleVariableDeclarationCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefinitionAccess().getVariableVariableDeclarationCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
            	    lv_variable_4_0=ruleVariableDeclarationCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variable",
            	      							lv_variable_4_0,
            	      							"org.xtext.example.edgecloudmodel.ECModel.VariableDeclarationCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRulePrecondition"
    // InternalECModel.g:3989:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalECModel.g:3989:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalECModel.g:3990:2: iv_rulePrecondition= rulePrecondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreconditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrecondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalECModel.g:3996:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'precondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_oclexp_2_0 = null;

        EObject lv_oclexp_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:4002:2: ( (otherlv_0= 'precondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) ) ) )
            // InternalECModel.g:4003:2: (otherlv_0= 'precondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) ) )
            {
            // InternalECModel.g:4003:2: (otherlv_0= 'precondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) ) )
            // InternalECModel.g:4004:3: otherlv_0= 'precondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPreconditionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,48,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPreconditionAccess().getColonKeyword_1());
              		
            }
            // InternalECModel.g:4012:3: ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_DOUBLE_QUOTED_STRING && LA79_0<=RULE_INT)||LA79_0==21||LA79_0==60||(LA79_0>=113 && LA79_0<=115)||LA79_0==119||LA79_0==121||(LA79_0>=123 && LA79_0<=131)) ) {
                alt79=1;
            }
            else if ( (LA79_0==16) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalECModel.g:4013:4: ( (lv_oclexp_2_0= ruleOCLExpressionCS ) )
                    {
                    // InternalECModel.g:4013:4: ( (lv_oclexp_2_0= ruleOCLExpressionCS ) )
                    // InternalECModel.g:4014:5: (lv_oclexp_2_0= ruleOCLExpressionCS )
                    {
                    // InternalECModel.g:4014:5: (lv_oclexp_2_0= ruleOCLExpressionCS )
                    // InternalECModel.g:4015:6: lv_oclexp_2_0= ruleOCLExpressionCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPreconditionAccess().getOclexpOCLExpressionCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_oclexp_2_0=ruleOCLExpressionCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPreconditionRule());
                      						}
                      						set(
                      							current,
                      							"oclexp",
                      							lv_oclexp_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalECModel.g:4033:4: (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' )
                    {
                    // InternalECModel.g:4033:4: (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' )
                    // InternalECModel.g:4034:5: otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getPreconditionAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalECModel.g:4038:5: ( (lv_oclexp_4_0= ruleOCLExpressionCS ) )
                    // InternalECModel.g:4039:6: (lv_oclexp_4_0= ruleOCLExpressionCS )
                    {
                    // InternalECModel.g:4039:6: (lv_oclexp_4_0= ruleOCLExpressionCS )
                    // InternalECModel.g:4040:7: lv_oclexp_4_0= ruleOCLExpressionCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPreconditionAccess().getOclexpOCLExpressionCSParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    lv_oclexp_4_0=ruleOCLExpressionCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPreconditionRule());
                      							}
                      							set(
                      								current,
                      								"oclexp",
                      								lv_oclexp_4_0,
                      								"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPreconditionAccess().getRightCurlyBracketKeyword_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalECModel.g:4067:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalECModel.g:4067:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalECModel.g:4068:2: iv_rulePostcondition= rulePostcondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostconditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostcondition=rulePostcondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostcondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalECModel.g:4074:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'postcondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_oclexp_2_0 = null;

        EObject lv_oclexp_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:4080:2: ( (otherlv_0= 'postcondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) ) ) )
            // InternalECModel.g:4081:2: (otherlv_0= 'postcondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) ) )
            {
            // InternalECModel.g:4081:2: (otherlv_0= 'postcondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) ) )
            // InternalECModel.g:4082:3: otherlv_0= 'postcondition' otherlv_1= ':' ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostconditionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,48,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getColonKeyword_1());
              		
            }
            // InternalECModel.g:4090:3: ( ( (lv_oclexp_2_0= ruleOCLExpressionCS ) ) | (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_DOUBLE_QUOTED_STRING && LA80_0<=RULE_INT)||LA80_0==21||LA80_0==60||(LA80_0>=113 && LA80_0<=115)||LA80_0==119||LA80_0==121||(LA80_0>=123 && LA80_0<=131)) ) {
                alt80=1;
            }
            else if ( (LA80_0==16) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalECModel.g:4091:4: ( (lv_oclexp_2_0= ruleOCLExpressionCS ) )
                    {
                    // InternalECModel.g:4091:4: ( (lv_oclexp_2_0= ruleOCLExpressionCS ) )
                    // InternalECModel.g:4092:5: (lv_oclexp_2_0= ruleOCLExpressionCS )
                    {
                    // InternalECModel.g:4092:5: (lv_oclexp_2_0= ruleOCLExpressionCS )
                    // InternalECModel.g:4093:6: lv_oclexp_2_0= ruleOCLExpressionCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPostconditionAccess().getOclexpOCLExpressionCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_oclexp_2_0=ruleOCLExpressionCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPostconditionRule());
                      						}
                      						set(
                      							current,
                      							"oclexp",
                      							lv_oclexp_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalECModel.g:4111:4: (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' )
                    {
                    // InternalECModel.g:4111:4: (otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}' )
                    // InternalECModel.g:4112:5: otherlv_3= '{' ( (lv_oclexp_4_0= ruleOCLExpressionCS ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getPostconditionAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalECModel.g:4116:5: ( (lv_oclexp_4_0= ruleOCLExpressionCS ) )
                    // InternalECModel.g:4117:6: (lv_oclexp_4_0= ruleOCLExpressionCS )
                    {
                    // InternalECModel.g:4117:6: (lv_oclexp_4_0= ruleOCLExpressionCS )
                    // InternalECModel.g:4118:7: lv_oclexp_4_0= ruleOCLExpressionCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPostconditionAccess().getOclexpOCLExpressionCSParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    lv_oclexp_4_0=ruleOCLExpressionCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPostconditionRule());
                      							}
                      							set(
                      								current,
                      								"oclexp",
                      								lv_oclexp_4_0,
                      								"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPostconditionAccess().getRightCurlyBracketKeyword_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleOCLExpressionCS"
    // InternalECModel.g:4145:1: entryRuleOCLExpressionCS returns [EObject current=null] : iv_ruleOCLExpressionCS= ruleOCLExpressionCS EOF ;
    public final EObject entryRuleOCLExpressionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCLExpressionCS = null;


        try {
            // InternalECModel.g:4145:56: (iv_ruleOCLExpressionCS= ruleOCLExpressionCS EOF )
            // InternalECModel.g:4146:2: iv_ruleOCLExpressionCS= ruleOCLExpressionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOCLExpressionCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOCLExpressionCS=ruleOCLExpressionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOCLExpressionCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOCLExpressionCS"


    // $ANTLR start "ruleOCLExpressionCS"
    // InternalECModel.g:4152:1: ruleOCLExpressionCS returns [EObject current=null] : (this_LiteralExpCS_0= ruleLiteralExpCS | this_LetExpCS_1= ruleLetExpCS | this_IfExpCS_2= ruleIfExpCS | this_LogicFormulaExpCS_3= ruleLogicFormulaExpCS | this_NestedExpCS_4= ruleNestedExpCS ) ;
    public final EObject ruleOCLExpressionCS() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpCS_0 = null;

        EObject this_LetExpCS_1 = null;

        EObject this_IfExpCS_2 = null;

        EObject this_LogicFormulaExpCS_3 = null;

        EObject this_NestedExpCS_4 = null;



        	enterRule();

        try {
            // InternalECModel.g:4158:2: ( (this_LiteralExpCS_0= ruleLiteralExpCS | this_LetExpCS_1= ruleLetExpCS | this_IfExpCS_2= ruleIfExpCS | this_LogicFormulaExpCS_3= ruleLogicFormulaExpCS | this_NestedExpCS_4= ruleNestedExpCS ) )
            // InternalECModel.g:4159:2: (this_LiteralExpCS_0= ruleLiteralExpCS | this_LetExpCS_1= ruleLetExpCS | this_IfExpCS_2= ruleIfExpCS | this_LogicFormulaExpCS_3= ruleLogicFormulaExpCS | this_NestedExpCS_4= ruleNestedExpCS )
            {
            // InternalECModel.g:4159:2: (this_LiteralExpCS_0= ruleLiteralExpCS | this_LetExpCS_1= ruleLetExpCS | this_IfExpCS_2= ruleIfExpCS | this_LogicFormulaExpCS_3= ruleLogicFormulaExpCS | this_NestedExpCS_4= ruleNestedExpCS )
            int alt81=5;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE_QUOTED_STRING:
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_INT:
            case 60:
            case 121:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
                {
                alt81=1;
                }
                break;
            case RULE_ID:
                {
                int LA81_2 = input.LA(2);

                if ( (LA81_2==EOF||LA81_2==14||LA81_2==19||(LA81_2>=21 && LA81_2<=22)||LA81_2==40||(LA81_2>=64 && LA81_2<=65)||LA81_2==67||(LA81_2>=72 && LA81_2<=81)||LA81_2==92||(LA81_2>=116 && LA81_2<=118)||LA81_2==120||LA81_2==122) ) {
                    alt81=4;
                }
                else if ( (LA81_2==39) ) {
                    alt81=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;
                }
                }
                break;
            case 119:
                {
                alt81=2;
                }
                break;
            case 115:
                {
                alt81=3;
                }
                break;
            case 113:
            case 114:
                {
                alt81=4;
                }
                break;
            case 21:
                {
                alt81=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalECModel.g:4160:3: this_LiteralExpCS_0= ruleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOCLExpressionCSAccess().getLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralExpCS_0=ruleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:4169:3: this_LetExpCS_1= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOCLExpressionCSAccess().getLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LetExpCS_1=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:4178:3: this_IfExpCS_2= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOCLExpressionCSAccess().getIfExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfExpCS_2=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:4187:3: this_LogicFormulaExpCS_3= ruleLogicFormulaExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOCLExpressionCSAccess().getLogicFormulaExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LogicFormulaExpCS_3=ruleLogicFormulaExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LogicFormulaExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:4196:3: this_NestedExpCS_4= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOCLExpressionCSAccess().getNestedExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NestedExpCS_4=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOCLExpressionCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // InternalECModel.g:4208:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalECModel.g:4208:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalECModel.g:4209:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // InternalECModel.g:4215:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_nestedExpression_1_0= ruleOCLExpressionCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_nestedExpression_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:4221:2: ( (otherlv_0= '(' ( (lv_nestedExpression_1_0= ruleOCLExpressionCS ) ) otherlv_2= ')' ) )
            // InternalECModel.g:4222:2: (otherlv_0= '(' ( (lv_nestedExpression_1_0= ruleOCLExpressionCS ) ) otherlv_2= ')' )
            {
            // InternalECModel.g:4222:2: (otherlv_0= '(' ( (lv_nestedExpression_1_0= ruleOCLExpressionCS ) ) otherlv_2= ')' )
            // InternalECModel.g:4223:3: otherlv_0= '(' ( (lv_nestedExpression_1_0= ruleOCLExpressionCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalECModel.g:4227:3: ( (lv_nestedExpression_1_0= ruleOCLExpressionCS ) )
            // InternalECModel.g:4228:4: (lv_nestedExpression_1_0= ruleOCLExpressionCS )
            {
            // InternalECModel.g:4228:4: (lv_nestedExpression_1_0= ruleOCLExpressionCS )
            // InternalECModel.g:4229:5: lv_nestedExpression_1_0= ruleOCLExpressionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpCSAccess().getNestedExpressionOCLExpressionCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_nestedExpression_1_0=ruleOCLExpressionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              					}
              					set(
              						current,
              						"nestedExpression",
              						lv_nestedExpression_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleLogicFormulaExpCS"
    // InternalECModel.g:4254:1: entryRuleLogicFormulaExpCS returns [EObject current=null] : iv_ruleLogicFormulaExpCS= ruleLogicFormulaExpCS EOF ;
    public final EObject entryRuleLogicFormulaExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicFormulaExpCS = null;


        try {
            // InternalECModel.g:4254:58: (iv_ruleLogicFormulaExpCS= ruleLogicFormulaExpCS EOF )
            // InternalECModel.g:4255:2: iv_ruleLogicFormulaExpCS= ruleLogicFormulaExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicFormulaExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicFormulaExpCS=ruleLogicFormulaExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicFormulaExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicFormulaExpCS"


    // $ANTLR start "ruleLogicFormulaExpCS"
    // InternalECModel.g:4261:1: ruleLogicFormulaExpCS returns [EObject current=null] : ( ( (lv_atomicexp_0_0= ruleAtomicExpression ) ) ( ( ( 'and' | 'or' )=> ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) ) ) ( ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) ) ) )* ) ;
    public final EObject ruleLogicFormulaExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_connector_1_1=null;
        Token lv_connector_1_2=null;
        EObject lv_atomicexp_0_0 = null;

        EObject lv_atomicexp_2_1 = null;

        EObject lv_atomicexp_2_2 = null;

        EObject lv_atomicexp_2_3 = null;



        	enterRule();

        try {
            // InternalECModel.g:4267:2: ( ( ( (lv_atomicexp_0_0= ruleAtomicExpression ) ) ( ( ( 'and' | 'or' )=> ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) ) ) ( ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) ) ) )* ) )
            // InternalECModel.g:4268:2: ( ( (lv_atomicexp_0_0= ruleAtomicExpression ) ) ( ( ( 'and' | 'or' )=> ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) ) ) ( ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) ) ) )* )
            {
            // InternalECModel.g:4268:2: ( ( (lv_atomicexp_0_0= ruleAtomicExpression ) ) ( ( ( 'and' | 'or' )=> ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) ) ) ( ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) ) ) )* )
            // InternalECModel.g:4269:3: ( (lv_atomicexp_0_0= ruleAtomicExpression ) ) ( ( ( 'and' | 'or' )=> ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) ) ) ( ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) ) ) )*
            {
            // InternalECModel.g:4269:3: ( (lv_atomicexp_0_0= ruleAtomicExpression ) )
            // InternalECModel.g:4270:4: (lv_atomicexp_0_0= ruleAtomicExpression )
            {
            // InternalECModel.g:4270:4: (lv_atomicexp_0_0= ruleAtomicExpression )
            // InternalECModel.g:4271:5: lv_atomicexp_0_0= ruleAtomicExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLogicFormulaExpCSAccess().getAtomicexpAtomicExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_66);
            lv_atomicexp_0_0=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLogicFormulaExpCSRule());
              					}
              					add(
              						current,
              						"atomicexp",
              						lv_atomicexp_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.AtomicExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:4288:3: ( ( ( 'and' | 'or' )=> ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) ) ) ( ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==74) && (synpred1_InternalECModel())) {
                    alt84=1;
                }
                else if ( (LA84_0==75) && (synpred1_InternalECModel())) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalECModel.g:4289:4: ( ( 'and' | 'or' )=> ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) ) ) ( ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) ) )
            	    {
            	    // InternalECModel.g:4289:4: ( ( 'and' | 'or' )=> ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) ) )
            	    // InternalECModel.g:4290:5: ( 'and' | 'or' )=> ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) )
            	    {
            	    // InternalECModel.g:4291:5: ( (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' ) )
            	    // InternalECModel.g:4292:6: (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' )
            	    {
            	    // InternalECModel.g:4292:6: (lv_connector_1_1= 'and' | lv_connector_1_2= 'or' )
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==74) ) {
            	        alt82=1;
            	    }
            	    else if ( (LA82_0==75) ) {
            	        alt82=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 82, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // InternalECModel.g:4293:7: lv_connector_1_1= 'and'
            	            {
            	            lv_connector_1_1=(Token)match(input,74,FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_connector_1_1, grammarAccess.getLogicFormulaExpCSAccess().getConnectorAndKeyword_1_0_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getLogicFormulaExpCSRule());
            	              							}
            	              							addWithLastConsumed(current, "connector", lv_connector_1_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalECModel.g:4304:7: lv_connector_1_2= 'or'
            	            {
            	            lv_connector_1_2=(Token)match(input,75,FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_connector_1_2, grammarAccess.getLogicFormulaExpCSAccess().getConnectorOrKeyword_1_0_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getLogicFormulaExpCSRule());
            	              							}
            	              							addWithLastConsumed(current, "connector", lv_connector_1_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalECModel.g:4317:4: ( ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) ) )
            	    // InternalECModel.g:4318:5: ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) )
            	    {
            	    // InternalECModel.g:4318:5: ( (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS ) )
            	    // InternalECModel.g:4319:6: (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS )
            	    {
            	    // InternalECModel.g:4319:6: (lv_atomicexp_2_1= ruleAtomicExpression | lv_atomicexp_2_2= ruleIfExpCS | lv_atomicexp_2_3= ruleNestedExpCS )
            	    int alt83=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	    case 113:
            	    case 114:
            	        {
            	        alt83=1;
            	        }
            	        break;
            	    case 115:
            	        {
            	        alt83=2;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt83=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 83, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt83) {
            	        case 1 :
            	            // InternalECModel.g:4320:7: lv_atomicexp_2_1= ruleAtomicExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getLogicFormulaExpCSAccess().getAtomicexpAtomicExpressionParserRuleCall_1_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_66);
            	            lv_atomicexp_2_1=ruleAtomicExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getLogicFormulaExpCSRule());
            	              							}
            	              							add(
            	              								current,
            	              								"atomicexp",
            	              								lv_atomicexp_2_1,
            	              								"org.xtext.example.edgecloudmodel.ECModel.AtomicExpression");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalECModel.g:4336:7: lv_atomicexp_2_2= ruleIfExpCS
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getLogicFormulaExpCSAccess().getAtomicexpIfExpCSParserRuleCall_1_1_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_66);
            	            lv_atomicexp_2_2=ruleIfExpCS();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getLogicFormulaExpCSRule());
            	              							}
            	              							add(
            	              								current,
            	              								"atomicexp",
            	              								lv_atomicexp_2_2,
            	              								"org.xtext.example.edgecloudmodel.ECModel.IfExpCS");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalECModel.g:4352:7: lv_atomicexp_2_3= ruleNestedExpCS
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getLogicFormulaExpCSAccess().getAtomicexpNestedExpCSParserRuleCall_1_1_0_2());
            	              						
            	            }
            	            pushFollow(FOLLOW_66);
            	            lv_atomicexp_2_3=ruleNestedExpCS();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getLogicFormulaExpCSRule());
            	              							}
            	              							add(
            	              								current,
            	              								"atomicexp",
            	              								lv_atomicexp_2_3,
            	              								"org.xtext.example.edgecloudmodel.ECModel.NestedExpCS");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicFormulaExpCS"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalECModel.g:4375:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalECModel.g:4375:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalECModel.g:4376:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalECModel.g:4382:1: ruleAtomicExpression returns [EObject current=null] : ( ( (lv_leftside_0_0= ruleLeftSubAtomicExpression ) ) ( ( (lv_infixop_1_0= ruleInfixCompareOperatorName ) ) ( (lv_rightside_2_0= ruleRightSubAtomicExpression ) ) ( ( (lv_op_3_0= ruleInfixOperatorName ) ) ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) ) )? )? ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_leftside_0_0 = null;

        AntlrDatatypeRuleToken lv_infixop_1_0 = null;

        EObject lv_rightside_2_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;

        EObject lv_num_4_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:4388:2: ( ( ( (lv_leftside_0_0= ruleLeftSubAtomicExpression ) ) ( ( (lv_infixop_1_0= ruleInfixCompareOperatorName ) ) ( (lv_rightside_2_0= ruleRightSubAtomicExpression ) ) ( ( (lv_op_3_0= ruleInfixOperatorName ) ) ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) ) )? )? ) )
            // InternalECModel.g:4389:2: ( ( (lv_leftside_0_0= ruleLeftSubAtomicExpression ) ) ( ( (lv_infixop_1_0= ruleInfixCompareOperatorName ) ) ( (lv_rightside_2_0= ruleRightSubAtomicExpression ) ) ( ( (lv_op_3_0= ruleInfixOperatorName ) ) ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) ) )? )? )
            {
            // InternalECModel.g:4389:2: ( ( (lv_leftside_0_0= ruleLeftSubAtomicExpression ) ) ( ( (lv_infixop_1_0= ruleInfixCompareOperatorName ) ) ( (lv_rightside_2_0= ruleRightSubAtomicExpression ) ) ( ( (lv_op_3_0= ruleInfixOperatorName ) ) ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) ) )? )? )
            // InternalECModel.g:4390:3: ( (lv_leftside_0_0= ruleLeftSubAtomicExpression ) ) ( ( (lv_infixop_1_0= ruleInfixCompareOperatorName ) ) ( (lv_rightside_2_0= ruleRightSubAtomicExpression ) ) ( ( (lv_op_3_0= ruleInfixOperatorName ) ) ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) ) )? )?
            {
            // InternalECModel.g:4390:3: ( (lv_leftside_0_0= ruleLeftSubAtomicExpression ) )
            // InternalECModel.g:4391:4: (lv_leftside_0_0= ruleLeftSubAtomicExpression )
            {
            // InternalECModel.g:4391:4: (lv_leftside_0_0= ruleLeftSubAtomicExpression )
            // InternalECModel.g:4392:5: lv_leftside_0_0= ruleLeftSubAtomicExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtomicExpressionAccess().getLeftsideLeftSubAtomicExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_67);
            lv_leftside_0_0=ruleLeftSubAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtomicExpressionRule());
              					}
              					set(
              						current,
              						"leftside",
              						lv_leftside_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.LeftSubAtomicExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:4409:3: ( ( (lv_infixop_1_0= ruleInfixCompareOperatorName ) ) ( (lv_rightside_2_0= ruleRightSubAtomicExpression ) ) ( ( (lv_op_3_0= ruleInfixOperatorName ) ) ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) ) )? )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=76 && LA87_0<=81)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalECModel.g:4410:4: ( (lv_infixop_1_0= ruleInfixCompareOperatorName ) ) ( (lv_rightside_2_0= ruleRightSubAtomicExpression ) ) ( ( (lv_op_3_0= ruleInfixOperatorName ) ) ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) ) )?
                    {
                    // InternalECModel.g:4410:4: ( (lv_infixop_1_0= ruleInfixCompareOperatorName ) )
                    // InternalECModel.g:4411:5: (lv_infixop_1_0= ruleInfixCompareOperatorName )
                    {
                    // InternalECModel.g:4411:5: (lv_infixop_1_0= ruleInfixCompareOperatorName )
                    // InternalECModel.g:4412:6: lv_infixop_1_0= ruleInfixCompareOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExpressionAccess().getInfixopInfixCompareOperatorNameParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_68);
                    lv_infixop_1_0=ruleInfixCompareOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExpressionRule());
                      						}
                      						set(
                      							current,
                      							"infixop",
                      							lv_infixop_1_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.InfixCompareOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalECModel.g:4429:4: ( (lv_rightside_2_0= ruleRightSubAtomicExpression ) )
                    // InternalECModel.g:4430:5: (lv_rightside_2_0= ruleRightSubAtomicExpression )
                    {
                    // InternalECModel.g:4430:5: (lv_rightside_2_0= ruleRightSubAtomicExpression )
                    // InternalECModel.g:4431:6: lv_rightside_2_0= ruleRightSubAtomicExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRightsideRightSubAtomicExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    lv_rightside_2_0=ruleRightSubAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rightside",
                      							lv_rightside_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.RightSubAtomicExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalECModel.g:4448:4: ( ( (lv_op_3_0= ruleInfixOperatorName ) ) ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==60||(LA86_0>=82 && LA86_0<=84)) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalECModel.g:4449:5: ( (lv_op_3_0= ruleInfixOperatorName ) ) ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) )
                            {
                            // InternalECModel.g:4449:5: ( (lv_op_3_0= ruleInfixOperatorName ) )
                            // InternalECModel.g:4450:6: (lv_op_3_0= ruleInfixOperatorName )
                            {
                            // InternalECModel.g:4450:6: (lv_op_3_0= ruleInfixOperatorName )
                            // InternalECModel.g:4451:7: lv_op_3_0= ruleInfixOperatorName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicExpressionAccess().getOpInfixOperatorNameParserRuleCall_1_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_70);
                            lv_op_3_0=ruleInfixOperatorName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtomicExpressionRule());
                              							}
                              							set(
                              								current,
                              								"op",
                              								lv_op_3_0,
                              								"org.xtext.example.edgecloudmodel.ECModel.InfixOperatorName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalECModel.g:4468:5: ( ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) ) | ( (lv_exp_5_0= ruleAtomicExpression ) ) )
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==RULE_DOUBLE_QUOTED_STRING||(LA85_0>=RULE_SINGLE_QUOTED_STRING && LA85_0<=RULE_INT)||LA85_0==60||(LA85_0>=123 && LA85_0<=126)) ) {
                                alt85=1;
                            }
                            else if ( (LA85_0==RULE_ID||(LA85_0>=113 && LA85_0<=114)) ) {
                                alt85=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 85, 0, input);

                                throw nvae;
                            }
                            switch (alt85) {
                                case 1 :
                                    // InternalECModel.g:4469:6: ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) )
                                    {
                                    // InternalECModel.g:4469:6: ( (lv_num_4_0= rulePrimitiveLiteralExpCS ) )
                                    // InternalECModel.g:4470:7: (lv_num_4_0= rulePrimitiveLiteralExpCS )
                                    {
                                    // InternalECModel.g:4470:7: (lv_num_4_0= rulePrimitiveLiteralExpCS )
                                    // InternalECModel.g:4471:8: lv_num_4_0= rulePrimitiveLiteralExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getAtomicExpressionAccess().getNumPrimitiveLiteralExpCSParserRuleCall_1_2_1_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_num_4_0=rulePrimitiveLiteralExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getAtomicExpressionRule());
                                      								}
                                      								set(
                                      									current,
                                      									"num",
                                      									lv_num_4_0,
                                      									"org.xtext.example.edgecloudmodel.ECModel.PrimitiveLiteralExpCS");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalECModel.g:4489:6: ( (lv_exp_5_0= ruleAtomicExpression ) )
                                    {
                                    // InternalECModel.g:4489:6: ( (lv_exp_5_0= ruleAtomicExpression ) )
                                    // InternalECModel.g:4490:7: (lv_exp_5_0= ruleAtomicExpression )
                                    {
                                    // InternalECModel.g:4490:7: (lv_exp_5_0= ruleAtomicExpression )
                                    // InternalECModel.g:4491:8: lv_exp_5_0= ruleAtomicExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExpAtomicExpressionParserRuleCall_1_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_exp_5_0=ruleAtomicExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getAtomicExpressionRule());
                                      								}
                                      								set(
                                      									current,
                                      									"exp",
                                      									lv_exp_5_0,
                                      									"org.xtext.example.edgecloudmodel.ECModel.AtomicExpression");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleLeftSubAtomicExpression"
    // InternalECModel.g:4515:1: entryRuleLeftSubAtomicExpression returns [EObject current=null] : iv_ruleLeftSubAtomicExpression= ruleLeftSubAtomicExpression EOF ;
    public final EObject entryRuleLeftSubAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSubAtomicExpression = null;


        try {
            // InternalECModel.g:4515:64: (iv_ruleLeftSubAtomicExpression= ruleLeftSubAtomicExpression EOF )
            // InternalECModel.g:4516:2: iv_ruleLeftSubAtomicExpression= ruleLeftSubAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftSubAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeftSubAtomicExpression=ruleLeftSubAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftSubAtomicExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLeftSubAtomicExpression"


    // $ANTLR start "ruleLeftSubAtomicExpression"
    // InternalECModel.g:4522:1: ruleLeftSubAtomicExpression returns [EObject current=null] : (this_VariableExpCS_0= ruleVariableExpCS | this_CallExpCS_1= ruleCallExpCS ) ;
    public final EObject ruleLeftSubAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_VariableExpCS_0 = null;

        EObject this_CallExpCS_1 = null;



        	enterRule();

        try {
            // InternalECModel.g:4528:2: ( (this_VariableExpCS_0= ruleVariableExpCS | this_CallExpCS_1= ruleCallExpCS ) )
            // InternalECModel.g:4529:2: (this_VariableExpCS_0= ruleVariableExpCS | this_CallExpCS_1= ruleCallExpCS )
            {
            // InternalECModel.g:4529:2: (this_VariableExpCS_0= ruleVariableExpCS | this_CallExpCS_1= ruleCallExpCS )
            int alt88=2;
            switch ( input.LA(1) ) {
            case 113:
                {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==92) ) {
                    alt88=2;
                }
                else if ( (LA88_1==EOF||LA88_1==14||LA88_1==19||LA88_1==40||(LA88_1>=64 && LA88_1<=65)||LA88_1==67||(LA88_1>=72 && LA88_1<=81)||(LA88_1>=116 && LA88_1<=118)||LA88_1==120||LA88_1==122) ) {
                    alt88=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
                }
                break;
            case 114:
                {
                int LA88_2 = input.LA(2);

                if ( (LA88_2==92) ) {
                    alt88=2;
                }
                else if ( (LA88_2==EOF||LA88_2==14||LA88_2==19||LA88_2==40||(LA88_2>=64 && LA88_2<=65)||LA88_2==67||(LA88_2>=72 && LA88_2<=81)||(LA88_2>=116 && LA88_2<=118)||LA88_2==120||LA88_2==122) ) {
                    alt88=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA88_3 = input.LA(2);

                if ( (LA88_3==EOF||LA88_3==14||LA88_3==19||LA88_3==40||(LA88_3>=64 && LA88_3<=65)||LA88_3==67||(LA88_3>=72 && LA88_3<=81)||(LA88_3>=116 && LA88_3<=118)||LA88_3==120||LA88_3==122) ) {
                    alt88=1;
                }
                else if ( ((LA88_3>=21 && LA88_3<=22)||LA88_3==92) ) {
                    alt88=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalECModel.g:4530:3: this_VariableExpCS_0= ruleVariableExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLeftSubAtomicExpressionAccess().getVariableExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableExpCS_0=ruleVariableExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:4539:3: this_CallExpCS_1= ruleCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLeftSubAtomicExpressionAccess().getCallExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CallExpCS_1=ruleCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CallExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLeftSubAtomicExpression"


    // $ANTLR start "entryRuleRightSubAtomicExpression"
    // InternalECModel.g:4551:1: entryRuleRightSubAtomicExpression returns [EObject current=null] : iv_ruleRightSubAtomicExpression= ruleRightSubAtomicExpression EOF ;
    public final EObject entryRuleRightSubAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSubAtomicExpression = null;


        try {
            // InternalECModel.g:4551:65: (iv_ruleRightSubAtomicExpression= ruleRightSubAtomicExpression EOF )
            // InternalECModel.g:4552:2: iv_ruleRightSubAtomicExpression= ruleRightSubAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightSubAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRightSubAtomicExpression=ruleRightSubAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightSubAtomicExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRightSubAtomicExpression"


    // $ANTLR start "ruleRightSubAtomicExpression"
    // InternalECModel.g:4558:1: ruleRightSubAtomicExpression returns [EObject current=null] : (this_LiteralExpCS_0= ruleLiteralExpCS | this_VariableExpCS_1= ruleVariableExpCS | this_CallExpCS_2= ruleCallExpCS ) ;
    public final EObject ruleRightSubAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpCS_0 = null;

        EObject this_VariableExpCS_1 = null;

        EObject this_CallExpCS_2 = null;



        	enterRule();

        try {
            // InternalECModel.g:4564:2: ( (this_LiteralExpCS_0= ruleLiteralExpCS | this_VariableExpCS_1= ruleVariableExpCS | this_CallExpCS_2= ruleCallExpCS ) )
            // InternalECModel.g:4565:2: (this_LiteralExpCS_0= ruleLiteralExpCS | this_VariableExpCS_1= ruleVariableExpCS | this_CallExpCS_2= ruleCallExpCS )
            {
            // InternalECModel.g:4565:2: (this_LiteralExpCS_0= ruleLiteralExpCS | this_VariableExpCS_1= ruleVariableExpCS | this_CallExpCS_2= ruleCallExpCS )
            int alt89=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE_QUOTED_STRING:
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_INT:
            case 60:
            case 121:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
                {
                alt89=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 21:
                case 22:
                case 92:
                    {
                    alt89=3;
                    }
                    break;
                case EOF:
                case 14:
                case 19:
                case 40:
                case 60:
                case 64:
                case 65:
                case 67:
                case 72:
                case 73:
                case 74:
                case 75:
                case 82:
                case 83:
                case 84:
                case 116:
                case 117:
                case 118:
                case 120:
                case 122:
                    {
                    alt89=2;
                    }
                    break;
                case 39:
                    {
                    alt89=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 2, input);

                    throw nvae;
                }

                }
                break;
            case 113:
                {
                int LA89_3 = input.LA(2);

                if ( (LA89_3==92) ) {
                    alt89=3;
                }
                else if ( (LA89_3==EOF||LA89_3==14||LA89_3==19||LA89_3==40||LA89_3==60||(LA89_3>=64 && LA89_3<=65)||LA89_3==67||(LA89_3>=72 && LA89_3<=75)||(LA89_3>=82 && LA89_3<=84)||(LA89_3>=116 && LA89_3<=118)||LA89_3==120||LA89_3==122) ) {
                    alt89=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 3, input);

                    throw nvae;
                }
                }
                break;
            case 114:
                {
                int LA89_4 = input.LA(2);

                if ( (LA89_4==92) ) {
                    alt89=3;
                }
                else if ( (LA89_4==EOF||LA89_4==14||LA89_4==19||LA89_4==40||LA89_4==60||(LA89_4>=64 && LA89_4<=65)||LA89_4==67||(LA89_4>=72 && LA89_4<=75)||(LA89_4>=82 && LA89_4<=84)||(LA89_4>=116 && LA89_4<=118)||LA89_4==120||LA89_4==122) ) {
                    alt89=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalECModel.g:4566:3: this_LiteralExpCS_0= ruleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRightSubAtomicExpressionAccess().getLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralExpCS_0=ruleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:4575:3: this_VariableExpCS_1= ruleVariableExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRightSubAtomicExpressionAccess().getVariableExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableExpCS_1=ruleVariableExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:4584:3: this_CallExpCS_2= ruleCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRightSubAtomicExpressionAccess().getCallExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CallExpCS_2=ruleCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CallExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRightSubAtomicExpression"


    // $ANTLR start "entryRuleInfixCompareOperatorName"
    // InternalECModel.g:4596:1: entryRuleInfixCompareOperatorName returns [String current=null] : iv_ruleInfixCompareOperatorName= ruleInfixCompareOperatorName EOF ;
    public final String entryRuleInfixCompareOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixCompareOperatorName = null;


        try {
            // InternalECModel.g:4596:64: (iv_ruleInfixCompareOperatorName= ruleInfixCompareOperatorName EOF )
            // InternalECModel.g:4597:2: iv_ruleInfixCompareOperatorName= ruleInfixCompareOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixCompareOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInfixCompareOperatorName=ruleInfixCompareOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixCompareOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInfixCompareOperatorName"


    // $ANTLR start "ruleInfixCompareOperatorName"
    // InternalECModel.g:4603:1: ruleInfixCompareOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' ) ;
    public final AntlrDatatypeRuleToken ruleInfixCompareOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalECModel.g:4609:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' ) )
            // InternalECModel.g:4610:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' )
            {
            // InternalECModel.g:4610:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' )
            int alt90=6;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt90=1;
                }
                break;
            case 77:
                {
                alt90=2;
                }
                break;
            case 78:
                {
                alt90=3;
                }
                break;
            case 79:
                {
                alt90=4;
                }
                break;
            case 80:
                {
                alt90=5;
                }
                break;
            case 81:
                {
                alt90=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalECModel.g:4611:3: kw= '>'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixCompareOperatorNameAccess().getGreaterThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:4617:3: kw= '<'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixCompareOperatorNameAccess().getLessThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:4623:3: kw= '>='
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixCompareOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:4629:3: kw= '<='
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixCompareOperatorNameAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:4635:3: kw= '='
                    {
                    kw=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixCompareOperatorNameAccess().getEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalECModel.g:4641:3: kw= '<>'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixCompareOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInfixCompareOperatorName"


    // $ANTLR start "entryRuleInfixOperatorName"
    // InternalECModel.g:4650:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // InternalECModel.g:4650:57: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // InternalECModel.g:4651:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInfixOperatorName=ruleInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInfixOperatorName"


    // $ANTLR start "ruleInfixOperatorName"
    // InternalECModel.g:4657:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalECModel.g:4663:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' ) )
            // InternalECModel.g:4664:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' )
            {
            // InternalECModel.g:4664:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' )
            int alt91=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt91=1;
                }
                break;
            case 82:
                {
                alt91=2;
                }
                break;
            case 83:
                {
                alt91=3;
                }
                break;
            case 84:
                {
                alt91=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalECModel.g:4665:3: kw= '*'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorNameAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:4671:3: kw= '/'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorNameAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:4677:3: kw= '+'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorNameAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:4683:3: kw= '-'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorNameAccess().getHyphenMinusKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInfixOperatorName"


    // $ANTLR start "entryRuleCallExpCS"
    // InternalECModel.g:4692:1: entryRuleCallExpCS returns [EObject current=null] : iv_ruleCallExpCS= ruleCallExpCS EOF ;
    public final EObject entryRuleCallExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallExpCS = null;


        try {
            // InternalECModel.g:4692:50: (iv_ruleCallExpCS= ruleCallExpCS EOF )
            // InternalECModel.g:4693:2: iv_ruleCallExpCS= ruleCallExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallExpCS=ruleCallExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCallExpCS"


    // $ANTLR start "ruleCallExpCS"
    // InternalECModel.g:4699:1: ruleCallExpCS returns [EObject current=null] : (this_FeatureCallExpCS_0= ruleFeatureCallExpCS | this_LoopExpCS_1= ruleLoopExpCS ) ;
    public final EObject ruleCallExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureCallExpCS_0 = null;

        EObject this_LoopExpCS_1 = null;



        	enterRule();

        try {
            // InternalECModel.g:4705:2: ( (this_FeatureCallExpCS_0= ruleFeatureCallExpCS | this_LoopExpCS_1= ruleLoopExpCS ) )
            // InternalECModel.g:4706:2: (this_FeatureCallExpCS_0= ruleFeatureCallExpCS | this_LoopExpCS_1= ruleLoopExpCS )
            {
            // InternalECModel.g:4706:2: (this_FeatureCallExpCS_0= ruleFeatureCallExpCS | this_LoopExpCS_1= ruleLoopExpCS )
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // InternalECModel.g:4707:3: this_FeatureCallExpCS_0= ruleFeatureCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpCSAccess().getFeatureCallExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureCallExpCS_0=ruleFeatureCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FeatureCallExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:4716:3: this_LoopExpCS_1= ruleLoopExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpCSAccess().getLoopExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LoopExpCS_1=ruleLoopExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LoopExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCallExpCS"


    // $ANTLR start "entryRuleLoopExpCS"
    // InternalECModel.g:4728:1: entryRuleLoopExpCS returns [EObject current=null] : iv_ruleLoopExpCS= ruleLoopExpCS EOF ;
    public final EObject entryRuleLoopExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopExpCS = null;


        try {
            // InternalECModel.g:4728:50: (iv_ruleLoopExpCS= ruleLoopExpCS EOF )
            // InternalECModel.g:4729:2: iv_ruleLoopExpCS= ruleLoopExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoopExpCS=ruleLoopExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLoopExpCS"


    // $ANTLR start "ruleLoopExpCS"
    // InternalECModel.g:4735:1: ruleLoopExpCS returns [EObject current=null] : this_IteratorExpCS_0= ruleIteratorExpCS ;
    public final EObject ruleLoopExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_IteratorExpCS_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:4741:2: (this_IteratorExpCS_0= ruleIteratorExpCS )
            // InternalECModel.g:4742:2: this_IteratorExpCS_0= ruleIteratorExpCS
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getLoopExpCSAccess().getIteratorExpCSParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_IteratorExpCS_0=ruleIteratorExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_IteratorExpCS_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLoopExpCS"


    // $ANTLR start "entryRuleIteratorExpCS"
    // InternalECModel.g:4753:1: entryRuleIteratorExpCS returns [EObject current=null] : iv_ruleIteratorExpCS= ruleIteratorExpCS EOF ;
    public final EObject entryRuleIteratorExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteratorExpCS = null;


        try {
            // InternalECModel.g:4753:54: (iv_ruleIteratorExpCS= ruleIteratorExpCS EOF )
            // InternalECModel.g:4754:2: iv_ruleIteratorExpCS= ruleIteratorExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIteratorExpCS=ruleIteratorExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteratorExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIteratorExpCS"


    // $ANTLR start "ruleIteratorExpCS"
    // InternalECModel.g:4760:1: ruleIteratorExpCS returns [EObject current=null] : ( ( ( ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) ) ) | ( (lv_simpleCall_1_0= ruleSimpleNameCS ) ) ) otherlv_2= '->' ( (lv_iterator_3_0= ruleIteratorIdentifier ) ) otherlv_4= '(' ( ( (lv_varibles_5_0= ruleVariableDeclarationCS ) ) (otherlv_6= ',' ( (lv_varibles_7_0= ruleVariableDeclarationCS ) ) )* otherlv_8= '|' )? ( ( 'self' | 'result' | 'if' | RULE_ID )=> ( (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleIteratorExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_objectCall_0_1 = null;

        EObject lv_objectCall_0_2 = null;

        AntlrDatatypeRuleToken lv_simpleCall_1_0 = null;

        AntlrDatatypeRuleToken lv_iterator_3_0 = null;

        EObject lv_varibles_5_0 = null;

        EObject lv_varibles_7_0 = null;

        EObject lv_exp_9_1 = null;

        EObject lv_exp_9_2 = null;



        	enterRule();

        try {
            // InternalECModel.g:4766:2: ( ( ( ( ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) ) ) | ( (lv_simpleCall_1_0= ruleSimpleNameCS ) ) ) otherlv_2= '->' ( (lv_iterator_3_0= ruleIteratorIdentifier ) ) otherlv_4= '(' ( ( (lv_varibles_5_0= ruleVariableDeclarationCS ) ) (otherlv_6= ',' ( (lv_varibles_7_0= ruleVariableDeclarationCS ) ) )* otherlv_8= '|' )? ( ( 'self' | 'result' | 'if' | RULE_ID )=> ( (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS ) ) ) otherlv_10= ')' ) )
            // InternalECModel.g:4767:2: ( ( ( ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) ) ) | ( (lv_simpleCall_1_0= ruleSimpleNameCS ) ) ) otherlv_2= '->' ( (lv_iterator_3_0= ruleIteratorIdentifier ) ) otherlv_4= '(' ( ( (lv_varibles_5_0= ruleVariableDeclarationCS ) ) (otherlv_6= ',' ( (lv_varibles_7_0= ruleVariableDeclarationCS ) ) )* otherlv_8= '|' )? ( ( 'self' | 'result' | 'if' | RULE_ID )=> ( (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS ) ) ) otherlv_10= ')' )
            {
            // InternalECModel.g:4767:2: ( ( ( ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) ) ) | ( (lv_simpleCall_1_0= ruleSimpleNameCS ) ) ) otherlv_2= '->' ( (lv_iterator_3_0= ruleIteratorIdentifier ) ) otherlv_4= '(' ( ( (lv_varibles_5_0= ruleVariableDeclarationCS ) ) (otherlv_6= ',' ( (lv_varibles_7_0= ruleVariableDeclarationCS ) ) )* otherlv_8= '|' )? ( ( 'self' | 'result' | 'if' | RULE_ID )=> ( (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS ) ) ) otherlv_10= ')' )
            // InternalECModel.g:4768:3: ( ( ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) ) ) | ( (lv_simpleCall_1_0= ruleSimpleNameCS ) ) ) otherlv_2= '->' ( (lv_iterator_3_0= ruleIteratorIdentifier ) ) otherlv_4= '(' ( ( (lv_varibles_5_0= ruleVariableDeclarationCS ) ) (otherlv_6= ',' ( (lv_varibles_7_0= ruleVariableDeclarationCS ) ) )* otherlv_8= '|' )? ( ( 'self' | 'result' | 'if' | RULE_ID )=> ( (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS ) ) ) otherlv_10= ')'
            {
            // InternalECModel.g:4768:3: ( ( ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) ) ) | ( (lv_simpleCall_1_0= ruleSimpleNameCS ) ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                int LA94_1 = input.LA(2);

                if ( (LA94_1==92) ) {
                    alt94=1;
                }
                else if ( (LA94_1==22) ) {
                    alt94=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA94_0>=113 && LA94_0<=114)) ) {
                alt94=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalECModel.g:4769:4: ( ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) ) )
                    {
                    // InternalECModel.g:4769:4: ( ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) ) )
                    // InternalECModel.g:4770:5: ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) )
                    {
                    // InternalECModel.g:4770:5: ( (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS ) )
                    // InternalECModel.g:4771:6: (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS )
                    {
                    // InternalECModel.g:4771:6: (lv_objectCall_0_1= ruleClassiferCallExpCS | lv_objectCall_0_2= rulePropertyCallExpCS )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==RULE_ID) ) {
                        int LA93_1 = input.LA(2);

                        if ( (LA93_1==92) ) {
                            int LA93_3 = input.LA(3);

                            if ( (LA93_3==RULE_ID||(LA93_3>=113 && LA93_3<=114)) ) {
                                alt93=2;
                            }
                            else if ( (LA93_3==110) ) {
                                alt93=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 93, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 93, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA93_0>=113 && LA93_0<=114)) ) {
                        alt93=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalECModel.g:4772:7: lv_objectCall_0_1= ruleClassiferCallExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getIteratorExpCSAccess().getObjectCallClassiferCallExpCSParserRuleCall_0_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_16);
                            lv_objectCall_0_1=ruleClassiferCallExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getIteratorExpCSRule());
                              							}
                              							set(
                              								current,
                              								"objectCall",
                              								lv_objectCall_0_1,
                              								"org.xtext.example.edgecloudmodel.ECModel.ClassiferCallExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalECModel.g:4788:7: lv_objectCall_0_2= rulePropertyCallExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getIteratorExpCSAccess().getObjectCallPropertyCallExpCSParserRuleCall_0_0_0_1());
                              						
                            }
                            pushFollow(FOLLOW_16);
                            lv_objectCall_0_2=rulePropertyCallExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getIteratorExpCSRule());
                              							}
                              							set(
                              								current,
                              								"objectCall",
                              								lv_objectCall_0_2,
                              								"org.xtext.example.edgecloudmodel.ECModel.PropertyCallExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalECModel.g:4807:4: ( (lv_simpleCall_1_0= ruleSimpleNameCS ) )
                    {
                    // InternalECModel.g:4807:4: ( (lv_simpleCall_1_0= ruleSimpleNameCS ) )
                    // InternalECModel.g:4808:5: (lv_simpleCall_1_0= ruleSimpleNameCS )
                    {
                    // InternalECModel.g:4808:5: (lv_simpleCall_1_0= ruleSimpleNameCS )
                    // InternalECModel.g:4809:6: lv_simpleCall_1_0= ruleSimpleNameCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIteratorExpCSAccess().getSimpleCallSimpleNameCSParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_simpleCall_1_0=ruleSimpleNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIteratorExpCSRule());
                      						}
                      						set(
                      							current,
                      							"simpleCall",
                      							lv_simpleCall_1_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIteratorExpCSAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalECModel.g:4831:3: ( (lv_iterator_3_0= ruleIteratorIdentifier ) )
            // InternalECModel.g:4832:4: (lv_iterator_3_0= ruleIteratorIdentifier )
            {
            // InternalECModel.g:4832:4: (lv_iterator_3_0= ruleIteratorIdentifier )
            // InternalECModel.g:4833:5: lv_iterator_3_0= ruleIteratorIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIteratorExpCSAccess().getIteratorIteratorIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_iterator_3_0=ruleIteratorIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIteratorExpCSRule());
              					}
              					set(
              						current,
              						"iterator",
              						lv_iterator_3_0,
              						"org.xtext.example.edgecloudmodel.ECModel.IteratorIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIteratorExpCSAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalECModel.g:4854:3: ( ( (lv_varibles_5_0= ruleVariableDeclarationCS ) ) (otherlv_6= ',' ( (lv_varibles_7_0= ruleVariableDeclarationCS ) ) )* otherlv_8= '|' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID) ) {
                int LA96_1 = input.LA(2);

                if ( (true) ) {
                    alt96=1;
                }
            }
            switch (alt96) {
                case 1 :
                    // InternalECModel.g:4855:4: ( (lv_varibles_5_0= ruleVariableDeclarationCS ) ) (otherlv_6= ',' ( (lv_varibles_7_0= ruleVariableDeclarationCS ) ) )* otherlv_8= '|'
                    {
                    // InternalECModel.g:4855:4: ( (lv_varibles_5_0= ruleVariableDeclarationCS ) )
                    // InternalECModel.g:4856:5: (lv_varibles_5_0= ruleVariableDeclarationCS )
                    {
                    // InternalECModel.g:4856:5: (lv_varibles_5_0= ruleVariableDeclarationCS )
                    // InternalECModel.g:4857:6: lv_varibles_5_0= ruleVariableDeclarationCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIteratorExpCSAccess().getVariblesVariableDeclarationCSParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_73);
                    lv_varibles_5_0=ruleVariableDeclarationCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIteratorExpCSRule());
                      						}
                      						add(
                      							current,
                      							"varibles",
                      							lv_varibles_5_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.VariableDeclarationCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalECModel.g:4874:4: (otherlv_6= ',' ( (lv_varibles_7_0= ruleVariableDeclarationCS ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==40) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalECModel.g:4875:5: otherlv_6= ',' ( (lv_varibles_7_0= ruleVariableDeclarationCS ) )
                    	    {
                    	    otherlv_6=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getIteratorExpCSAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalECModel.g:4879:5: ( (lv_varibles_7_0= ruleVariableDeclarationCS ) )
                    	    // InternalECModel.g:4880:6: (lv_varibles_7_0= ruleVariableDeclarationCS )
                    	    {
                    	    // InternalECModel.g:4880:6: (lv_varibles_7_0= ruleVariableDeclarationCS )
                    	    // InternalECModel.g:4881:7: lv_varibles_7_0= ruleVariableDeclarationCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getIteratorExpCSAccess().getVariblesVariableDeclarationCSParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_73);
                    	    lv_varibles_7_0=ruleVariableDeclarationCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getIteratorExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"varibles",
                    	      								lv_varibles_7_0,
                    	      								"org.xtext.example.edgecloudmodel.ECModel.VariableDeclarationCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,67,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIteratorExpCSAccess().getVerticalLineKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:4904:3: ( ( 'self' | 'result' | 'if' | RULE_ID )=> ( (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS ) ) )
            // InternalECModel.g:4905:4: ( 'self' | 'result' | 'if' | RULE_ID )=> ( (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS ) )
            {
            // InternalECModel.g:4906:4: ( (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS ) )
            // InternalECModel.g:4907:5: (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS )
            {
            // InternalECModel.g:4907:5: (lv_exp_9_1= ruleLogicFormulaExpCS | lv_exp_9_2= ruleIfExpCS )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ID||(LA97_0>=113 && LA97_0<=114)) ) {
                alt97=1;
            }
            else if ( (LA97_0==115) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalECModel.g:4908:6: lv_exp_9_1= ruleLogicFormulaExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIteratorExpCSAccess().getExpLogicFormulaExpCSParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_exp_9_1=ruleLogicFormulaExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIteratorExpCSRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_9_1,
                      							"org.xtext.example.edgecloudmodel.ECModel.LogicFormulaExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:4924:6: lv_exp_9_2= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIteratorExpCSAccess().getExpIfExpCSParserRuleCall_5_0_1());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_exp_9_2=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIteratorExpCSRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_9_2,
                      							"org.xtext.example.edgecloudmodel.ECModel.IfExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getIteratorExpCSAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIteratorExpCS"


    // $ANTLR start "entryRuleIteratorIdentifier"
    // InternalECModel.g:4950:1: entryRuleIteratorIdentifier returns [String current=null] : iv_ruleIteratorIdentifier= ruleIteratorIdentifier EOF ;
    public final String entryRuleIteratorIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIteratorIdentifier = null;


        try {
            // InternalECModel.g:4950:58: (iv_ruleIteratorIdentifier= ruleIteratorIdentifier EOF )
            // InternalECModel.g:4951:2: iv_ruleIteratorIdentifier= ruleIteratorIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIteratorIdentifier=ruleIteratorIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteratorIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIteratorIdentifier"


    // $ANTLR start "ruleIteratorIdentifier"
    // InternalECModel.g:4957:1: ruleIteratorIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'one' | kw= 'exists' | kw= 'select' | kw= 'any' | kw= 'forAll' | kw= 'collect' | kw= 'isUnique' ) ;
    public final AntlrDatatypeRuleToken ruleIteratorIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalECModel.g:4963:2: ( (kw= 'one' | kw= 'exists' | kw= 'select' | kw= 'any' | kw= 'forAll' | kw= 'collect' | kw= 'isUnique' ) )
            // InternalECModel.g:4964:2: (kw= 'one' | kw= 'exists' | kw= 'select' | kw= 'any' | kw= 'forAll' | kw= 'collect' | kw= 'isUnique' )
            {
            // InternalECModel.g:4964:2: (kw= 'one' | kw= 'exists' | kw= 'select' | kw= 'any' | kw= 'forAll' | kw= 'collect' | kw= 'isUnique' )
            int alt98=7;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt98=1;
                }
                break;
            case 86:
                {
                alt98=2;
                }
                break;
            case 87:
                {
                alt98=3;
                }
                break;
            case 88:
                {
                alt98=4;
                }
                break;
            case 89:
                {
                alt98=5;
                }
                break;
            case 90:
                {
                alt98=6;
                }
                break;
            case 91:
                {
                alt98=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalECModel.g:4965:3: kw= 'one'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIteratorIdentifierAccess().getOneKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:4971:3: kw= 'exists'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIteratorIdentifierAccess().getExistsKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:4977:3: kw= 'select'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIteratorIdentifierAccess().getSelectKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:4983:3: kw= 'any'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIteratorIdentifierAccess().getAnyKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:4989:3: kw= 'forAll'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIteratorIdentifierAccess().getForAllKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalECModel.g:4995:3: kw= 'collect'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIteratorIdentifierAccess().getCollectKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalECModel.g:5001:3: kw= 'isUnique'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIteratorIdentifierAccess().getIsUniqueKeyword_6());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIteratorIdentifier"


    // $ANTLR start "entryRuleArgumentsCS"
    // InternalECModel.g:5010:1: entryRuleArgumentsCS returns [EObject current=null] : iv_ruleArgumentsCS= ruleArgumentsCS EOF ;
    public final EObject entryRuleArgumentsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentsCS = null;


        try {
            // InternalECModel.g:5010:52: (iv_ruleArgumentsCS= ruleArgumentsCS EOF )
            // InternalECModel.g:5011:2: iv_ruleArgumentsCS= ruleArgumentsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgumentsCS=ruleArgumentsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentsCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArgumentsCS"


    // $ANTLR start "ruleArgumentsCS"
    // InternalECModel.g:5017:1: ruleArgumentsCS returns [EObject current=null] : ( ( (lv_first_0_0= ruleOCLExpressionCS ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleArgumentsCS ) ) )? ) ;
    public final EObject ruleArgumentsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_first_0_0 = null;

        EObject lv_next_2_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:5023:2: ( ( ( (lv_first_0_0= ruleOCLExpressionCS ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleArgumentsCS ) ) )? ) )
            // InternalECModel.g:5024:2: ( ( (lv_first_0_0= ruleOCLExpressionCS ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleArgumentsCS ) ) )? )
            {
            // InternalECModel.g:5024:2: ( ( (lv_first_0_0= ruleOCLExpressionCS ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleArgumentsCS ) ) )? )
            // InternalECModel.g:5025:3: ( (lv_first_0_0= ruleOCLExpressionCS ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleArgumentsCS ) ) )?
            {
            // InternalECModel.g:5025:3: ( (lv_first_0_0= ruleOCLExpressionCS ) )
            // InternalECModel.g:5026:4: (lv_first_0_0= ruleOCLExpressionCS )
            {
            // InternalECModel.g:5026:4: (lv_first_0_0= ruleOCLExpressionCS )
            // InternalECModel.g:5027:5: lv_first_0_0= ruleOCLExpressionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArgumentsCSAccess().getFirstOCLExpressionCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_first_0_0=ruleOCLExpressionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArgumentsCSRule());
              					}
              					set(
              						current,
              						"first",
              						lv_first_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:5044:3: (otherlv_1= ',' ( (lv_next_2_0= ruleArgumentsCS ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==40) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalECModel.g:5045:4: otherlv_1= ',' ( (lv_next_2_0= ruleArgumentsCS ) )
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArgumentsCSAccess().getCommaKeyword_1_0());
                      			
                    }
                    // InternalECModel.g:5049:4: ( (lv_next_2_0= ruleArgumentsCS ) )
                    // InternalECModel.g:5050:5: (lv_next_2_0= ruleArgumentsCS )
                    {
                    // InternalECModel.g:5050:5: (lv_next_2_0= ruleArgumentsCS )
                    // InternalECModel.g:5051:6: lv_next_2_0= ruleArgumentsCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArgumentsCSAccess().getNextArgumentsCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_2_0=ruleArgumentsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArgumentsCSRule());
                      						}
                      						set(
                      							current,
                      							"next",
                      							lv_next_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.ArgumentsCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArgumentsCS"


    // $ANTLR start "entryRuleFeatureCallExpCS"
    // InternalECModel.g:5073:1: entryRuleFeatureCallExpCS returns [EObject current=null] : iv_ruleFeatureCallExpCS= ruleFeatureCallExpCS EOF ;
    public final EObject entryRuleFeatureCallExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCallExpCS = null;


        try {
            // InternalECModel.g:5073:57: (iv_ruleFeatureCallExpCS= ruleFeatureCallExpCS EOF )
            // InternalECModel.g:5074:2: iv_ruleFeatureCallExpCS= ruleFeatureCallExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCallExpCS=ruleFeatureCallExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureCallExpCS"


    // $ANTLR start "ruleFeatureCallExpCS"
    // InternalECModel.g:5080:1: ruleFeatureCallExpCS returns [EObject current=null] : (this_PropertyCallExpCS_0= rulePropertyCallExpCS | this_ClassiferCallExpCS_1= ruleClassiferCallExpCS | this_StandardOperationExpCS_2= ruleStandardOperationExpCS | this_StandardNavigationCallExpCS_3= ruleStandardNavigationCallExpCS | this_OperationCallExpCS_4= ruleOperationCallExpCS ) ;
    public final EObject ruleFeatureCallExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyCallExpCS_0 = null;

        EObject this_ClassiferCallExpCS_1 = null;

        EObject this_StandardOperationExpCS_2 = null;

        EObject this_StandardNavigationCallExpCS_3 = null;

        EObject this_OperationCallExpCS_4 = null;



        	enterRule();

        try {
            // InternalECModel.g:5086:2: ( (this_PropertyCallExpCS_0= rulePropertyCallExpCS | this_ClassiferCallExpCS_1= ruleClassiferCallExpCS | this_StandardOperationExpCS_2= ruleStandardOperationExpCS | this_StandardNavigationCallExpCS_3= ruleStandardNavigationCallExpCS | this_OperationCallExpCS_4= ruleOperationCallExpCS ) )
            // InternalECModel.g:5087:2: (this_PropertyCallExpCS_0= rulePropertyCallExpCS | this_ClassiferCallExpCS_1= ruleClassiferCallExpCS | this_StandardOperationExpCS_2= ruleStandardOperationExpCS | this_StandardNavigationCallExpCS_3= ruleStandardNavigationCallExpCS | this_OperationCallExpCS_4= ruleOperationCallExpCS )
            {
            // InternalECModel.g:5087:2: (this_PropertyCallExpCS_0= rulePropertyCallExpCS | this_ClassiferCallExpCS_1= ruleClassiferCallExpCS | this_StandardOperationExpCS_2= ruleStandardOperationExpCS | this_StandardNavigationCallExpCS_3= ruleStandardNavigationCallExpCS | this_OperationCallExpCS_4= ruleOperationCallExpCS )
            int alt100=5;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // InternalECModel.g:5088:3: this_PropertyCallExpCS_0= rulePropertyCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCallExpCSAccess().getPropertyCallExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertyCallExpCS_0=rulePropertyCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyCallExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:5097:3: this_ClassiferCallExpCS_1= ruleClassiferCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCallExpCSAccess().getClassiferCallExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassiferCallExpCS_1=ruleClassiferCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassiferCallExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:5106:3: this_StandardOperationExpCS_2= ruleStandardOperationExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCallExpCSAccess().getStandardOperationExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StandardOperationExpCS_2=ruleStandardOperationExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StandardOperationExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:5115:3: this_StandardNavigationCallExpCS_3= ruleStandardNavigationCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCallExpCSAccess().getStandardNavigationCallExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StandardNavigationCallExpCS_3=ruleStandardNavigationCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StandardNavigationCallExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:5124:3: this_OperationCallExpCS_4= ruleOperationCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCallExpCSAccess().getOperationCallExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OperationCallExpCS_4=ruleOperationCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperationCallExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureCallExpCS"


    // $ANTLR start "entryRuleStandardNavigationCallExpCS"
    // InternalECModel.g:5136:1: entryRuleStandardNavigationCallExpCS returns [EObject current=null] : iv_ruleStandardNavigationCallExpCS= ruleStandardNavigationCallExpCS EOF ;
    public final EObject entryRuleStandardNavigationCallExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardNavigationCallExpCS = null;


        try {
            // InternalECModel.g:5136:68: (iv_ruleStandardNavigationCallExpCS= ruleStandardNavigationCallExpCS EOF )
            // InternalECModel.g:5137:2: iv_ruleStandardNavigationCallExpCS= ruleStandardNavigationCallExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardNavigationCallExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardNavigationCallExpCS=ruleStandardNavigationCallExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardNavigationCallExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStandardNavigationCallExpCS"


    // $ANTLR start "ruleStandardNavigationCallExpCS"
    // InternalECModel.g:5143:1: ruleStandardNavigationCallExpCS returns [EObject current=null] : ( ( ( (lv_classifercall_0_0= ruleClassiferCallExpCS ) ) | ( (lv_propertycall_1_0= rulePropertyCallExpCS ) ) | ( (lv_object_2_0= ruleSimpleNameCS ) ) ) ( (lv_navop_3_0= '->' ) ) ( (lv_standardOP_4_0= ruleStandardCollectionOperation ) ) ) ;
    public final EObject ruleStandardNavigationCallExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_navop_3_0=null;
        EObject lv_classifercall_0_0 = null;

        EObject lv_propertycall_1_0 = null;

        AntlrDatatypeRuleToken lv_object_2_0 = null;

        EObject lv_standardOP_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:5149:2: ( ( ( ( (lv_classifercall_0_0= ruleClassiferCallExpCS ) ) | ( (lv_propertycall_1_0= rulePropertyCallExpCS ) ) | ( (lv_object_2_0= ruleSimpleNameCS ) ) ) ( (lv_navop_3_0= '->' ) ) ( (lv_standardOP_4_0= ruleStandardCollectionOperation ) ) ) )
            // InternalECModel.g:5150:2: ( ( ( (lv_classifercall_0_0= ruleClassiferCallExpCS ) ) | ( (lv_propertycall_1_0= rulePropertyCallExpCS ) ) | ( (lv_object_2_0= ruleSimpleNameCS ) ) ) ( (lv_navop_3_0= '->' ) ) ( (lv_standardOP_4_0= ruleStandardCollectionOperation ) ) )
            {
            // InternalECModel.g:5150:2: ( ( ( (lv_classifercall_0_0= ruleClassiferCallExpCS ) ) | ( (lv_propertycall_1_0= rulePropertyCallExpCS ) ) | ( (lv_object_2_0= ruleSimpleNameCS ) ) ) ( (lv_navop_3_0= '->' ) ) ( (lv_standardOP_4_0= ruleStandardCollectionOperation ) ) )
            // InternalECModel.g:5151:3: ( ( (lv_classifercall_0_0= ruleClassiferCallExpCS ) ) | ( (lv_propertycall_1_0= rulePropertyCallExpCS ) ) | ( (lv_object_2_0= ruleSimpleNameCS ) ) ) ( (lv_navop_3_0= '->' ) ) ( (lv_standardOP_4_0= ruleStandardCollectionOperation ) )
            {
            // InternalECModel.g:5151:3: ( ( (lv_classifercall_0_0= ruleClassiferCallExpCS ) ) | ( (lv_propertycall_1_0= rulePropertyCallExpCS ) ) | ( (lv_object_2_0= ruleSimpleNameCS ) ) )
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_ID) ) {
                int LA101_1 = input.LA(2);

                if ( (LA101_1==92) ) {
                    int LA101_3 = input.LA(3);

                    if ( (LA101_3==110) ) {
                        alt101=1;
                    }
                    else if ( (LA101_3==RULE_ID||(LA101_3>=113 && LA101_3<=114)) ) {
                        alt101=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA101_1==22) ) {
                    alt101=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA101_0>=113 && LA101_0<=114)) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalECModel.g:5152:4: ( (lv_classifercall_0_0= ruleClassiferCallExpCS ) )
                    {
                    // InternalECModel.g:5152:4: ( (lv_classifercall_0_0= ruleClassiferCallExpCS ) )
                    // InternalECModel.g:5153:5: (lv_classifercall_0_0= ruleClassiferCallExpCS )
                    {
                    // InternalECModel.g:5153:5: (lv_classifercall_0_0= ruleClassiferCallExpCS )
                    // InternalECModel.g:5154:6: lv_classifercall_0_0= ruleClassiferCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardNavigationCallExpCSAccess().getClassifercallClassiferCallExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_classifercall_0_0=ruleClassiferCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardNavigationCallExpCSRule());
                      						}
                      						set(
                      							current,
                      							"classifercall",
                      							lv_classifercall_0_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.ClassiferCallExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalECModel.g:5172:4: ( (lv_propertycall_1_0= rulePropertyCallExpCS ) )
                    {
                    // InternalECModel.g:5172:4: ( (lv_propertycall_1_0= rulePropertyCallExpCS ) )
                    // InternalECModel.g:5173:5: (lv_propertycall_1_0= rulePropertyCallExpCS )
                    {
                    // InternalECModel.g:5173:5: (lv_propertycall_1_0= rulePropertyCallExpCS )
                    // InternalECModel.g:5174:6: lv_propertycall_1_0= rulePropertyCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardNavigationCallExpCSAccess().getPropertycallPropertyCallExpCSParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_propertycall_1_0=rulePropertyCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardNavigationCallExpCSRule());
                      						}
                      						set(
                      							current,
                      							"propertycall",
                      							lv_propertycall_1_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.PropertyCallExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalECModel.g:5192:4: ( (lv_object_2_0= ruleSimpleNameCS ) )
                    {
                    // InternalECModel.g:5192:4: ( (lv_object_2_0= ruleSimpleNameCS ) )
                    // InternalECModel.g:5193:5: (lv_object_2_0= ruleSimpleNameCS )
                    {
                    // InternalECModel.g:5193:5: (lv_object_2_0= ruleSimpleNameCS )
                    // InternalECModel.g:5194:6: lv_object_2_0= ruleSimpleNameCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardNavigationCallExpCSAccess().getObjectSimpleNameCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_object_2_0=ruleSimpleNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardNavigationCallExpCSRule());
                      						}
                      						set(
                      							current,
                      							"object",
                      							lv_object_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalECModel.g:5212:3: ( (lv_navop_3_0= '->' ) )
            // InternalECModel.g:5213:4: (lv_navop_3_0= '->' )
            {
            // InternalECModel.g:5213:4: (lv_navop_3_0= '->' )
            // InternalECModel.g:5214:5: lv_navop_3_0= '->'
            {
            lv_navop_3_0=(Token)match(input,22,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_navop_3_0, grammarAccess.getStandardNavigationCallExpCSAccess().getNavopHyphenMinusGreaterThanSignKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStandardNavigationCallExpCSRule());
              					}
              					setWithLastConsumed(current, "navop", lv_navop_3_0, "->");
              				
            }

            }


            }

            // InternalECModel.g:5226:3: ( (lv_standardOP_4_0= ruleStandardCollectionOperation ) )
            // InternalECModel.g:5227:4: (lv_standardOP_4_0= ruleStandardCollectionOperation )
            {
            // InternalECModel.g:5227:4: (lv_standardOP_4_0= ruleStandardCollectionOperation )
            // InternalECModel.g:5228:5: lv_standardOP_4_0= ruleStandardCollectionOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardNavigationCallExpCSAccess().getStandardOPStandardCollectionOperationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_standardOP_4_0=ruleStandardCollectionOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStandardNavigationCallExpCSRule());
              					}
              					set(
              						current,
              						"standardOP",
              						lv_standardOP_4_0,
              						"org.xtext.example.edgecloudmodel.ECModel.StandardCollectionOperation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStandardNavigationCallExpCS"


    // $ANTLR start "entryRuleStandardOperationExpCS"
    // InternalECModel.g:5249:1: entryRuleStandardOperationExpCS returns [EObject current=null] : iv_ruleStandardOperationExpCS= ruleStandardOperationExpCS EOF ;
    public final EObject entryRuleStandardOperationExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardOperationExpCS = null;


        try {
            // InternalECModel.g:5249:63: (iv_ruleStandardOperationExpCS= ruleStandardOperationExpCS EOF )
            // InternalECModel.g:5250:2: iv_ruleStandardOperationExpCS= ruleStandardOperationExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardOperationExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardOperationExpCS=ruleStandardOperationExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardOperationExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStandardOperationExpCS"


    // $ANTLR start "ruleStandardOperationExpCS"
    // InternalECModel.g:5256:1: ruleStandardOperationExpCS returns [EObject current=null] : ( ( (lv_object_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_property_2_0= ruleVariableExpCS ) ) ( (lv_premark_3_0= ruleIsMarkedPreCS ) )? otherlv_4= '.' )? ( (lv_predefinedop_5_0= rulePredefineOp ) ) ) ;
    public final EObject ruleStandardOperationExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_object_0_0 = null;

        EObject lv_property_2_0 = null;

        AntlrDatatypeRuleToken lv_premark_3_0 = null;

        EObject lv_predefinedop_5_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:5262:2: ( ( ( (lv_object_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_property_2_0= ruleVariableExpCS ) ) ( (lv_premark_3_0= ruleIsMarkedPreCS ) )? otherlv_4= '.' )? ( (lv_predefinedop_5_0= rulePredefineOp ) ) ) )
            // InternalECModel.g:5263:2: ( ( (lv_object_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_property_2_0= ruleVariableExpCS ) ) ( (lv_premark_3_0= ruleIsMarkedPreCS ) )? otherlv_4= '.' )? ( (lv_predefinedop_5_0= rulePredefineOp ) ) )
            {
            // InternalECModel.g:5263:2: ( ( (lv_object_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_property_2_0= ruleVariableExpCS ) ) ( (lv_premark_3_0= ruleIsMarkedPreCS ) )? otherlv_4= '.' )? ( (lv_predefinedop_5_0= rulePredefineOp ) ) )
            // InternalECModel.g:5264:3: ( (lv_object_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_property_2_0= ruleVariableExpCS ) ) ( (lv_premark_3_0= ruleIsMarkedPreCS ) )? otherlv_4= '.' )? ( (lv_predefinedop_5_0= rulePredefineOp ) )
            {
            // InternalECModel.g:5264:3: ( (lv_object_0_0= ruleVariableExpCS ) )
            // InternalECModel.g:5265:4: (lv_object_0_0= ruleVariableExpCS )
            {
            // InternalECModel.g:5265:4: (lv_object_0_0= ruleVariableExpCS )
            // InternalECModel.g:5266:5: lv_object_0_0= ruleVariableExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardOperationExpCSAccess().getObjectVariableExpCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_75);
            lv_object_0_0=ruleVariableExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStandardOperationExpCSRule());
              					}
              					set(
              						current,
              						"object",
              						lv_object_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.VariableExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,92,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStandardOperationExpCSAccess().getFullStopKeyword_1());
              		
            }
            // InternalECModel.g:5287:3: ( ( (lv_property_2_0= ruleVariableExpCS ) ) ( (lv_premark_3_0= ruleIsMarkedPreCS ) )? otherlv_4= '.' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_ID||(LA103_0>=113 && LA103_0<=114)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalECModel.g:5288:4: ( (lv_property_2_0= ruleVariableExpCS ) ) ( (lv_premark_3_0= ruleIsMarkedPreCS ) )? otherlv_4= '.'
                    {
                    // InternalECModel.g:5288:4: ( (lv_property_2_0= ruleVariableExpCS ) )
                    // InternalECModel.g:5289:5: (lv_property_2_0= ruleVariableExpCS )
                    {
                    // InternalECModel.g:5289:5: (lv_property_2_0= ruleVariableExpCS )
                    // InternalECModel.g:5290:6: lv_property_2_0= ruleVariableExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardOperationExpCSAccess().getPropertyVariableExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_77);
                    lv_property_2_0=ruleVariableExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardOperationExpCSRule());
                      						}
                      						set(
                      							current,
                      							"property",
                      							lv_property_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.VariableExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalECModel.g:5307:4: ( (lv_premark_3_0= ruleIsMarkedPreCS ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==111) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalECModel.g:5308:5: (lv_premark_3_0= ruleIsMarkedPreCS )
                            {
                            // InternalECModel.g:5308:5: (lv_premark_3_0= ruleIsMarkedPreCS )
                            // InternalECModel.g:5309:6: lv_premark_3_0= ruleIsMarkedPreCS
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getStandardOperationExpCSAccess().getPremarkIsMarkedPreCSParserRuleCall_2_1_0());
                              					
                            }
                            pushFollow(FOLLOW_75);
                            lv_premark_3_0=ruleIsMarkedPreCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getStandardOperationExpCSRule());
                              						}
                              						set(
                              							current,
                              							"premark",
                              							lv_premark_3_0,
                              							"org.xtext.example.edgecloudmodel.ECModel.IsMarkedPreCS");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,92,FOLLOW_76); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStandardOperationExpCSAccess().getFullStopKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:5331:3: ( (lv_predefinedop_5_0= rulePredefineOp ) )
            // InternalECModel.g:5332:4: (lv_predefinedop_5_0= rulePredefineOp )
            {
            // InternalECModel.g:5332:4: (lv_predefinedop_5_0= rulePredefineOp )
            // InternalECModel.g:5333:5: lv_predefinedop_5_0= rulePredefineOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardOperationExpCSAccess().getPredefinedopPredefineOpParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_predefinedop_5_0=rulePredefineOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStandardOperationExpCSRule());
              					}
              					set(
              						current,
              						"predefinedop",
              						lv_predefinedop_5_0,
              						"org.xtext.example.edgecloudmodel.ECModel.PredefineOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStandardOperationExpCS"


    // $ANTLR start "entryRulePredefineOp"
    // InternalECModel.g:5354:1: entryRulePredefineOp returns [EObject current=null] : iv_rulePredefineOp= rulePredefineOp EOF ;
    public final EObject entryRulePredefineOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefineOp = null;


        try {
            // InternalECModel.g:5354:52: (iv_rulePredefineOp= rulePredefineOp EOF )
            // InternalECModel.g:5355:2: iv_rulePredefineOp= rulePredefineOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredefineOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredefineOp=rulePredefineOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredefineOp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePredefineOp"


    // $ANTLR start "rulePredefineOp"
    // InternalECModel.g:5361:1: rulePredefineOp returns [EObject current=null] : (this_StandardNoneParameterOperation_0= ruleStandardNoneParameterOperation | this_StandardParameterOperation_1= ruleStandardParameterOperation | this_StandardDateOperation_2= ruleStandardDateOperation ) ;
    public final EObject rulePredefineOp() throws RecognitionException {
        EObject current = null;

        EObject this_StandardNoneParameterOperation_0 = null;

        EObject this_StandardParameterOperation_1 = null;

        EObject this_StandardDateOperation_2 = null;



        	enterRule();

        try {
            // InternalECModel.g:5367:2: ( (this_StandardNoneParameterOperation_0= ruleStandardNoneParameterOperation | this_StandardParameterOperation_1= ruleStandardParameterOperation | this_StandardDateOperation_2= ruleStandardDateOperation ) )
            // InternalECModel.g:5368:2: (this_StandardNoneParameterOperation_0= ruleStandardNoneParameterOperation | this_StandardParameterOperation_1= ruleStandardParameterOperation | this_StandardDateOperation_2= ruleStandardDateOperation )
            {
            // InternalECModel.g:5368:2: (this_StandardNoneParameterOperation_0= ruleStandardNoneParameterOperation | this_StandardParameterOperation_1= ruleStandardParameterOperation | this_StandardDateOperation_2= ruleStandardDateOperation )
            int alt104=3;
            switch ( input.LA(1) ) {
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
                {
                alt104=1;
                }
                break;
            case 100:
                {
                alt104=2;
                }
                break;
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
                {
                alt104=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalECModel.g:5369:3: this_StandardNoneParameterOperation_0= ruleStandardNoneParameterOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPredefineOpAccess().getStandardNoneParameterOperationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StandardNoneParameterOperation_0=ruleStandardNoneParameterOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StandardNoneParameterOperation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:5378:3: this_StandardParameterOperation_1= ruleStandardParameterOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPredefineOpAccess().getStandardParameterOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StandardParameterOperation_1=ruleStandardParameterOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StandardParameterOperation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:5387:3: this_StandardDateOperation_2= ruleStandardDateOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPredefineOpAccess().getStandardDateOperationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StandardDateOperation_2=ruleStandardDateOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StandardDateOperation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePredefineOp"


    // $ANTLR start "entryRuleStandardNoneParameterOperation"
    // InternalECModel.g:5399:1: entryRuleStandardNoneParameterOperation returns [EObject current=null] : iv_ruleStandardNoneParameterOperation= ruleStandardNoneParameterOperation EOF ;
    public final EObject entryRuleStandardNoneParameterOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardNoneParameterOperation = null;


        try {
            // InternalECModel.g:5399:71: (iv_ruleStandardNoneParameterOperation= ruleStandardNoneParameterOperation EOF )
            // InternalECModel.g:5400:2: iv_ruleStandardNoneParameterOperation= ruleStandardNoneParameterOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardNoneParameterOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardNoneParameterOperation=ruleStandardNoneParameterOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardNoneParameterOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStandardNoneParameterOperation"


    // $ANTLR start "ruleStandardNoneParameterOperation"
    // InternalECModel.g:5406:1: ruleStandardNoneParameterOperation returns [EObject current=null] : ( ( (lv_name_0_1= 'oclIsNew()' | lv_name_0_2= 'oclIsUndefined()' | lv_name_0_3= 'isEmpty()' | lv_name_0_4= 'notEmpty()' | lv_name_0_5= 'oclIsInvaild()' | lv_name_0_6= 'size()' | lv_name_0_7= 'sum()' ) ) ) ;
    public final EObject ruleStandardNoneParameterOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;


        	enterRule();

        try {
            // InternalECModel.g:5412:2: ( ( ( (lv_name_0_1= 'oclIsNew()' | lv_name_0_2= 'oclIsUndefined()' | lv_name_0_3= 'isEmpty()' | lv_name_0_4= 'notEmpty()' | lv_name_0_5= 'oclIsInvaild()' | lv_name_0_6= 'size()' | lv_name_0_7= 'sum()' ) ) ) )
            // InternalECModel.g:5413:2: ( ( (lv_name_0_1= 'oclIsNew()' | lv_name_0_2= 'oclIsUndefined()' | lv_name_0_3= 'isEmpty()' | lv_name_0_4= 'notEmpty()' | lv_name_0_5= 'oclIsInvaild()' | lv_name_0_6= 'size()' | lv_name_0_7= 'sum()' ) ) )
            {
            // InternalECModel.g:5413:2: ( ( (lv_name_0_1= 'oclIsNew()' | lv_name_0_2= 'oclIsUndefined()' | lv_name_0_3= 'isEmpty()' | lv_name_0_4= 'notEmpty()' | lv_name_0_5= 'oclIsInvaild()' | lv_name_0_6= 'size()' | lv_name_0_7= 'sum()' ) ) )
            // InternalECModel.g:5414:3: ( (lv_name_0_1= 'oclIsNew()' | lv_name_0_2= 'oclIsUndefined()' | lv_name_0_3= 'isEmpty()' | lv_name_0_4= 'notEmpty()' | lv_name_0_5= 'oclIsInvaild()' | lv_name_0_6= 'size()' | lv_name_0_7= 'sum()' ) )
            {
            // InternalECModel.g:5414:3: ( (lv_name_0_1= 'oclIsNew()' | lv_name_0_2= 'oclIsUndefined()' | lv_name_0_3= 'isEmpty()' | lv_name_0_4= 'notEmpty()' | lv_name_0_5= 'oclIsInvaild()' | lv_name_0_6= 'size()' | lv_name_0_7= 'sum()' ) )
            // InternalECModel.g:5415:4: (lv_name_0_1= 'oclIsNew()' | lv_name_0_2= 'oclIsUndefined()' | lv_name_0_3= 'isEmpty()' | lv_name_0_4= 'notEmpty()' | lv_name_0_5= 'oclIsInvaild()' | lv_name_0_6= 'size()' | lv_name_0_7= 'sum()' )
            {
            // InternalECModel.g:5415:4: (lv_name_0_1= 'oclIsNew()' | lv_name_0_2= 'oclIsUndefined()' | lv_name_0_3= 'isEmpty()' | lv_name_0_4= 'notEmpty()' | lv_name_0_5= 'oclIsInvaild()' | lv_name_0_6= 'size()' | lv_name_0_7= 'sum()' )
            int alt105=7;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt105=1;
                }
                break;
            case 94:
                {
                alt105=2;
                }
                break;
            case 95:
                {
                alt105=3;
                }
                break;
            case 96:
                {
                alt105=4;
                }
                break;
            case 97:
                {
                alt105=5;
                }
                break;
            case 98:
                {
                alt105=6;
                }
                break;
            case 99:
                {
                alt105=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalECModel.g:5416:5: lv_name_0_1= 'oclIsNew()'
                    {
                    lv_name_0_1=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getStandardNoneParameterOperationAccess().getNameOclIsNewKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStandardNoneParameterOperationRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:5427:5: lv_name_0_2= 'oclIsUndefined()'
                    {
                    lv_name_0_2=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getStandardNoneParameterOperationAccess().getNameOclIsUndefinedKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStandardNoneParameterOperationRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:5438:5: lv_name_0_3= 'isEmpty()'
                    {
                    lv_name_0_3=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_3, grammarAccess.getStandardNoneParameterOperationAccess().getNameIsEmptyKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStandardNoneParameterOperationRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:5449:5: lv_name_0_4= 'notEmpty()'
                    {
                    lv_name_0_4=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_4, grammarAccess.getStandardNoneParameterOperationAccess().getNameNotEmptyKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStandardNoneParameterOperationRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:5460:5: lv_name_0_5= 'oclIsInvaild()'
                    {
                    lv_name_0_5=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_5, grammarAccess.getStandardNoneParameterOperationAccess().getNameOclIsInvaildKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStandardNoneParameterOperationRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_5, null);
                      				
                    }

                    }
                    break;
                case 6 :
                    // InternalECModel.g:5471:5: lv_name_0_6= 'size()'
                    {
                    lv_name_0_6=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_6, grammarAccess.getStandardNoneParameterOperationAccess().getNameSizeKeyword_0_5());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStandardNoneParameterOperationRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_6, null);
                      				
                    }

                    }
                    break;
                case 7 :
                    // InternalECModel.g:5482:5: lv_name_0_7= 'sum()'
                    {
                    lv_name_0_7=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_7, grammarAccess.getStandardNoneParameterOperationAccess().getNameSumKeyword_0_6());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStandardNoneParameterOperationRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_7, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStandardNoneParameterOperation"


    // $ANTLR start "entryRuleStandardParameterOperation"
    // InternalECModel.g:5498:1: entryRuleStandardParameterOperation returns [EObject current=null] : iv_ruleStandardParameterOperation= ruleStandardParameterOperation EOF ;
    public final EObject entryRuleStandardParameterOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardParameterOperation = null;


        try {
            // InternalECModel.g:5498:67: (iv_ruleStandardParameterOperation= ruleStandardParameterOperation EOF )
            // InternalECModel.g:5499:2: iv_ruleStandardParameterOperation= ruleStandardParameterOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardParameterOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardParameterOperation=ruleStandardParameterOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardParameterOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStandardParameterOperation"


    // $ANTLR start "ruleStandardParameterOperation"
    // InternalECModel.g:5505:1: ruleStandardParameterOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'oclIsTypeOf' ) ) otherlv_1= '(' ( ( (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType ) ) ) otherlv_3= ')' ) ;
    public final EObject ruleStandardParameterOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;



        	enterRule();

        try {
            // InternalECModel.g:5511:2: ( ( ( (lv_name_0_0= 'oclIsTypeOf' ) ) otherlv_1= '(' ( ( (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType ) ) ) otherlv_3= ')' ) )
            // InternalECModel.g:5512:2: ( ( (lv_name_0_0= 'oclIsTypeOf' ) ) otherlv_1= '(' ( ( (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType ) ) ) otherlv_3= ')' )
            {
            // InternalECModel.g:5512:2: ( ( (lv_name_0_0= 'oclIsTypeOf' ) ) otherlv_1= '(' ( ( (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType ) ) ) otherlv_3= ')' )
            // InternalECModel.g:5513:3: ( (lv_name_0_0= 'oclIsTypeOf' ) ) otherlv_1= '(' ( ( (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType ) ) ) otherlv_3= ')'
            {
            // InternalECModel.g:5513:3: ( (lv_name_0_0= 'oclIsTypeOf' ) )
            // InternalECModel.g:5514:4: (lv_name_0_0= 'oclIsTypeOf' )
            {
            // InternalECModel.g:5514:4: (lv_name_0_0= 'oclIsTypeOf' )
            // InternalECModel.g:5515:5: lv_name_0_0= 'oclIsTypeOf'
            {
            lv_name_0_0=(Token)match(input,100,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getStandardParameterOperationAccess().getNameOclIsTypeOfKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStandardParameterOperationRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "oclIsTypeOf");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStandardParameterOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalECModel.g:5531:3: ( ( (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType ) ) )
            // InternalECModel.g:5532:4: ( (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType ) )
            {
            // InternalECModel.g:5532:4: ( (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType ) )
            // InternalECModel.g:5533:5: (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType )
            {
            // InternalECModel.g:5533:5: (lv_type_2_1= rulePrimitiveTypeCS | lv_type_2_2= ruleEntityType )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=132 && LA106_0<=137)) ) {
                alt106=1;
            }
            else if ( (LA106_0==RULE_ID) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalECModel.g:5534:6: lv_type_2_1= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardParameterOperationAccess().getTypePrimitiveTypeCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_type_2_1=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardParameterOperationRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_1,
                      							"org.xtext.example.edgecloudmodel.ECModel.PrimitiveTypeCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:5550:6: lv_type_2_2= ruleEntityType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardParameterOperationAccess().getTypeEntityTypeParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_type_2_2=ruleEntityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardParameterOperationRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_2,
                      							"org.xtext.example.edgecloudmodel.ECModel.EntityType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStandardParameterOperationAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStandardParameterOperation"


    // $ANTLR start "entryRuleStandardCollectionOperation"
    // InternalECModel.g:5576:1: entryRuleStandardCollectionOperation returns [EObject current=null] : iv_ruleStandardCollectionOperation= ruleStandardCollectionOperation EOF ;
    public final EObject entryRuleStandardCollectionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardCollectionOperation = null;


        try {
            // InternalECModel.g:5576:68: (iv_ruleStandardCollectionOperation= ruleStandardCollectionOperation EOF )
            // InternalECModel.g:5577:2: iv_ruleStandardCollectionOperation= ruleStandardCollectionOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardCollectionOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardCollectionOperation=ruleStandardCollectionOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardCollectionOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStandardCollectionOperation"


    // $ANTLR start "ruleStandardCollectionOperation"
    // InternalECModel.g:5583:1: ruleStandardCollectionOperation returns [EObject current=null] : ( ( ( (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' ) ) ) otherlv_1= '(' ( (lv_object_2_0= ruleSimpleNameCS ) ) otherlv_3= ')' ) ;
    public final EObject ruleStandardCollectionOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_object_2_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:5589:2: ( ( ( ( (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' ) ) ) otherlv_1= '(' ( (lv_object_2_0= ruleSimpleNameCS ) ) otherlv_3= ')' ) )
            // InternalECModel.g:5590:2: ( ( ( (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' ) ) ) otherlv_1= '(' ( (lv_object_2_0= ruleSimpleNameCS ) ) otherlv_3= ')' )
            {
            // InternalECModel.g:5590:2: ( ( ( (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' ) ) ) otherlv_1= '(' ( (lv_object_2_0= ruleSimpleNameCS ) ) otherlv_3= ')' )
            // InternalECModel.g:5591:3: ( ( (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' ) ) ) otherlv_1= '(' ( (lv_object_2_0= ruleSimpleNameCS ) ) otherlv_3= ')'
            {
            // InternalECModel.g:5591:3: ( ( (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' ) ) )
            // InternalECModel.g:5592:4: ( (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' ) )
            {
            // InternalECModel.g:5592:4: ( (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' ) )
            // InternalECModel.g:5593:5: (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' )
            {
            // InternalECModel.g:5593:5: (lv_name_0_1= 'includes' | lv_name_0_2= 'excludes' | lv_name_0_3= 'includesAll' | lv_name_0_4= 'excludesAll' )
            int alt107=4;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt107=1;
                }
                break;
            case 102:
                {
                alt107=2;
                }
                break;
            case 103:
                {
                alt107=3;
                }
                break;
            case 104:
                {
                alt107=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalECModel.g:5594:6: lv_name_0_1= 'includes'
                    {
                    lv_name_0_1=(Token)match(input,101,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_1, grammarAccess.getStandardCollectionOperationAccess().getNameIncludesKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStandardCollectionOperationRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:5605:6: lv_name_0_2= 'excludes'
                    {
                    lv_name_0_2=(Token)match(input,102,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_2, grammarAccess.getStandardCollectionOperationAccess().getNameExcludesKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStandardCollectionOperationRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:5616:6: lv_name_0_3= 'includesAll'
                    {
                    lv_name_0_3=(Token)match(input,103,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_3, grammarAccess.getStandardCollectionOperationAccess().getNameIncludesAllKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStandardCollectionOperationRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:5627:6: lv_name_0_4= 'excludesAll'
                    {
                    lv_name_0_4=(Token)match(input,104,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_4, grammarAccess.getStandardCollectionOperationAccess().getNameExcludesAllKeyword_0_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStandardCollectionOperationRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_4, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStandardCollectionOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalECModel.g:5644:3: ( (lv_object_2_0= ruleSimpleNameCS ) )
            // InternalECModel.g:5645:4: (lv_object_2_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:5645:4: (lv_object_2_0= ruleSimpleNameCS )
            // InternalECModel.g:5646:5: lv_object_2_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStandardCollectionOperationAccess().getObjectSimpleNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_object_2_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStandardCollectionOperationRule());
              					}
              					set(
              						current,
              						"object",
              						lv_object_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStandardCollectionOperationAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStandardCollectionOperation"


    // $ANTLR start "entryRuleStandardDateOperation"
    // InternalECModel.g:5671:1: entryRuleStandardDateOperation returns [EObject current=null] : iv_ruleStandardDateOperation= ruleStandardDateOperation EOF ;
    public final EObject entryRuleStandardDateOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardDateOperation = null;


        try {
            // InternalECModel.g:5671:62: (iv_ruleStandardDateOperation= ruleStandardDateOperation EOF )
            // InternalECModel.g:5672:2: iv_ruleStandardDateOperation= ruleStandardDateOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardDateOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardDateOperation=ruleStandardDateOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardDateOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStandardDateOperation"


    // $ANTLR start "ruleStandardDateOperation"
    // InternalECModel.g:5678:1: ruleStandardDateOperation returns [EObject current=null] : ( ( ( (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' ) ) ) otherlv_1= '(' ( ( (lv_object_2_0= ruleSimpleNameCS ) ) | ( (lv_datenum_3_0= ruleNumberLiteralExpCS ) ) | ( (lv_procall_4_0= rulePropertyCallExpCS ) ) ) otherlv_5= ')' (otherlv_6= '.' ( (lv_nested_7_0= ruleStandardDateOperation ) ) )? ) ;
    public final EObject ruleStandardDateOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_object_2_0 = null;

        EObject lv_datenum_3_0 = null;

        EObject lv_procall_4_0 = null;

        EObject lv_nested_7_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:5684:2: ( ( ( ( (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' ) ) ) otherlv_1= '(' ( ( (lv_object_2_0= ruleSimpleNameCS ) ) | ( (lv_datenum_3_0= ruleNumberLiteralExpCS ) ) | ( (lv_procall_4_0= rulePropertyCallExpCS ) ) ) otherlv_5= ')' (otherlv_6= '.' ( (lv_nested_7_0= ruleStandardDateOperation ) ) )? ) )
            // InternalECModel.g:5685:2: ( ( ( (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' ) ) ) otherlv_1= '(' ( ( (lv_object_2_0= ruleSimpleNameCS ) ) | ( (lv_datenum_3_0= ruleNumberLiteralExpCS ) ) | ( (lv_procall_4_0= rulePropertyCallExpCS ) ) ) otherlv_5= ')' (otherlv_6= '.' ( (lv_nested_7_0= ruleStandardDateOperation ) ) )? )
            {
            // InternalECModel.g:5685:2: ( ( ( (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' ) ) ) otherlv_1= '(' ( ( (lv_object_2_0= ruleSimpleNameCS ) ) | ( (lv_datenum_3_0= ruleNumberLiteralExpCS ) ) | ( (lv_procall_4_0= rulePropertyCallExpCS ) ) ) otherlv_5= ')' (otherlv_6= '.' ( (lv_nested_7_0= ruleStandardDateOperation ) ) )? )
            // InternalECModel.g:5686:3: ( ( (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' ) ) ) otherlv_1= '(' ( ( (lv_object_2_0= ruleSimpleNameCS ) ) | ( (lv_datenum_3_0= ruleNumberLiteralExpCS ) ) | ( (lv_procall_4_0= rulePropertyCallExpCS ) ) ) otherlv_5= ')' (otherlv_6= '.' ( (lv_nested_7_0= ruleStandardDateOperation ) ) )?
            {
            // InternalECModel.g:5686:3: ( ( (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' ) ) )
            // InternalECModel.g:5687:4: ( (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' ) )
            {
            // InternalECModel.g:5687:4: ( (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' ) )
            // InternalECModel.g:5688:5: (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' )
            {
            // InternalECModel.g:5688:5: (lv_name_0_1= 'After' | lv_name_0_2= 'Before' | lv_name_0_3= 'isAfter' | lv_name_0_4= 'isBefore' | lv_name_0_5= 'isEqual' )
            int alt108=5;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt108=1;
                }
                break;
            case 106:
                {
                alt108=2;
                }
                break;
            case 107:
                {
                alt108=3;
                }
                break;
            case 108:
                {
                alt108=4;
                }
                break;
            case 109:
                {
                alt108=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalECModel.g:5689:6: lv_name_0_1= 'After'
                    {
                    lv_name_0_1=(Token)match(input,105,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_1, grammarAccess.getStandardDateOperationAccess().getNameAfterKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStandardDateOperationRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:5700:6: lv_name_0_2= 'Before'
                    {
                    lv_name_0_2=(Token)match(input,106,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_2, grammarAccess.getStandardDateOperationAccess().getNameBeforeKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStandardDateOperationRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:5711:6: lv_name_0_3= 'isAfter'
                    {
                    lv_name_0_3=(Token)match(input,107,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_3, grammarAccess.getStandardDateOperationAccess().getNameIsAfterKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStandardDateOperationRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:5722:6: lv_name_0_4= 'isBefore'
                    {
                    lv_name_0_4=(Token)match(input,108,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_4, grammarAccess.getStandardDateOperationAccess().getNameIsBeforeKeyword_0_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStandardDateOperationRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_4, null);
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:5733:6: lv_name_0_5= 'isEqual'
                    {
                    lv_name_0_5=(Token)match(input,109,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_5, grammarAccess.getStandardDateOperationAccess().getNameIsEqualKeyword_0_0_4());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStandardDateOperationRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_0_5, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStandardDateOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalECModel.g:5750:3: ( ( (lv_object_2_0= ruleSimpleNameCS ) ) | ( (lv_datenum_3_0= ruleNumberLiteralExpCS ) ) | ( (lv_procall_4_0= rulePropertyCallExpCS ) ) )
            int alt109=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA109_1 = input.LA(2);

                if ( (LA109_1==92) ) {
                    alt109=3;
                }
                else if ( (LA109_1==14) ) {
                    alt109=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 60:
                {
                alt109=2;
                }
                break;
            case 113:
            case 114:
                {
                alt109=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalECModel.g:5751:4: ( (lv_object_2_0= ruleSimpleNameCS ) )
                    {
                    // InternalECModel.g:5751:4: ( (lv_object_2_0= ruleSimpleNameCS ) )
                    // InternalECModel.g:5752:5: (lv_object_2_0= ruleSimpleNameCS )
                    {
                    // InternalECModel.g:5752:5: (lv_object_2_0= ruleSimpleNameCS )
                    // InternalECModel.g:5753:6: lv_object_2_0= ruleSimpleNameCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardDateOperationAccess().getObjectSimpleNameCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_object_2_0=ruleSimpleNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardDateOperationRule());
                      						}
                      						set(
                      							current,
                      							"object",
                      							lv_object_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalECModel.g:5771:4: ( (lv_datenum_3_0= ruleNumberLiteralExpCS ) )
                    {
                    // InternalECModel.g:5771:4: ( (lv_datenum_3_0= ruleNumberLiteralExpCS ) )
                    // InternalECModel.g:5772:5: (lv_datenum_3_0= ruleNumberLiteralExpCS )
                    {
                    // InternalECModel.g:5772:5: (lv_datenum_3_0= ruleNumberLiteralExpCS )
                    // InternalECModel.g:5773:6: lv_datenum_3_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardDateOperationAccess().getDatenumNumberLiteralExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_datenum_3_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardDateOperationRule());
                      						}
                      						set(
                      							current,
                      							"datenum",
                      							lv_datenum_3_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.NumberLiteralExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalECModel.g:5791:4: ( (lv_procall_4_0= rulePropertyCallExpCS ) )
                    {
                    // InternalECModel.g:5791:4: ( (lv_procall_4_0= rulePropertyCallExpCS ) )
                    // InternalECModel.g:5792:5: (lv_procall_4_0= rulePropertyCallExpCS )
                    {
                    // InternalECModel.g:5792:5: (lv_procall_4_0= rulePropertyCallExpCS )
                    // InternalECModel.g:5793:6: lv_procall_4_0= rulePropertyCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardDateOperationAccess().getProcallPropertyCallExpCSParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_procall_4_0=rulePropertyCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardDateOperationRule());
                      						}
                      						set(
                      							current,
                      							"procall",
                      							lv_procall_4_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.PropertyCallExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getStandardDateOperationAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalECModel.g:5815:3: (otherlv_6= '.' ( (lv_nested_7_0= ruleStandardDateOperation ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==92) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalECModel.g:5816:4: otherlv_6= '.' ( (lv_nested_7_0= ruleStandardDateOperation ) )
                    {
                    otherlv_6=(Token)match(input,92,FOLLOW_76); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStandardDateOperationAccess().getFullStopKeyword_4_0());
                      			
                    }
                    // InternalECModel.g:5820:4: ( (lv_nested_7_0= ruleStandardDateOperation ) )
                    // InternalECModel.g:5821:5: (lv_nested_7_0= ruleStandardDateOperation )
                    {
                    // InternalECModel.g:5821:5: (lv_nested_7_0= ruleStandardDateOperation )
                    // InternalECModel.g:5822:6: lv_nested_7_0= ruleStandardDateOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStandardDateOperationAccess().getNestedStandardDateOperationParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_nested_7_0=ruleStandardDateOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStandardDateOperationRule());
                      						}
                      						set(
                      							current,
                      							"nested",
                      							lv_nested_7_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.StandardDateOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStandardDateOperation"


    // $ANTLR start "entryRuleClassiferCallExpCS"
    // InternalECModel.g:5844:1: entryRuleClassiferCallExpCS returns [EObject current=null] : iv_ruleClassiferCallExpCS= ruleClassiferCallExpCS EOF ;
    public final EObject entryRuleClassiferCallExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassiferCallExpCS = null;


        try {
            // InternalECModel.g:5844:59: (iv_ruleClassiferCallExpCS= ruleClassiferCallExpCS EOF )
            // InternalECModel.g:5845:2: iv_ruleClassiferCallExpCS= ruleClassiferCallExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassiferCallExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassiferCallExpCS=ruleClassiferCallExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassiferCallExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassiferCallExpCS"


    // $ANTLR start "ruleClassiferCallExpCS"
    // InternalECModel.g:5851:1: ruleClassiferCallExpCS returns [EObject current=null] : ( ( (lv_entity_0_0= ruleSimpleNameCS ) ) otherlv_1= '.' ( (lv_op_2_0= 'allInstance()' ) ) ) ;
    public final EObject ruleClassiferCallExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_op_2_0=null;
        AntlrDatatypeRuleToken lv_entity_0_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:5857:2: ( ( ( (lv_entity_0_0= ruleSimpleNameCS ) ) otherlv_1= '.' ( (lv_op_2_0= 'allInstance()' ) ) ) )
            // InternalECModel.g:5858:2: ( ( (lv_entity_0_0= ruleSimpleNameCS ) ) otherlv_1= '.' ( (lv_op_2_0= 'allInstance()' ) ) )
            {
            // InternalECModel.g:5858:2: ( ( (lv_entity_0_0= ruleSimpleNameCS ) ) otherlv_1= '.' ( (lv_op_2_0= 'allInstance()' ) ) )
            // InternalECModel.g:5859:3: ( (lv_entity_0_0= ruleSimpleNameCS ) ) otherlv_1= '.' ( (lv_op_2_0= 'allInstance()' ) )
            {
            // InternalECModel.g:5859:3: ( (lv_entity_0_0= ruleSimpleNameCS ) )
            // InternalECModel.g:5860:4: (lv_entity_0_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:5860:4: (lv_entity_0_0= ruleSimpleNameCS )
            // InternalECModel.g:5861:5: lv_entity_0_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassiferCallExpCSAccess().getEntitySimpleNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_75);
            lv_entity_0_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassiferCallExpCSRule());
              					}
              					set(
              						current,
              						"entity",
              						lv_entity_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,92,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassiferCallExpCSAccess().getFullStopKeyword_1());
              		
            }
            // InternalECModel.g:5882:3: ( (lv_op_2_0= 'allInstance()' ) )
            // InternalECModel.g:5883:4: (lv_op_2_0= 'allInstance()' )
            {
            // InternalECModel.g:5883:4: (lv_op_2_0= 'allInstance()' )
            // InternalECModel.g:5884:5: lv_op_2_0= 'allInstance()'
            {
            lv_op_2_0=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_2_0, grammarAccess.getClassiferCallExpCSAccess().getOpAllInstanceKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClassiferCallExpCSRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_2_0, "allInstance()");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassiferCallExpCS"


    // $ANTLR start "entryRulePropertyCallExpCS"
    // InternalECModel.g:5900:1: entryRulePropertyCallExpCS returns [EObject current=null] : iv_rulePropertyCallExpCS= rulePropertyCallExpCS EOF ;
    public final EObject entryRulePropertyCallExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCallExpCS = null;


        try {
            // InternalECModel.g:5900:58: (iv_rulePropertyCallExpCS= rulePropertyCallExpCS EOF )
            // InternalECModel.g:5901:2: iv_rulePropertyCallExpCS= rulePropertyCallExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyCallExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyCallExpCS=rulePropertyCallExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyCallExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyCallExpCS"


    // $ANTLR start "rulePropertyCallExpCS"
    // InternalECModel.g:5907:1: rulePropertyCallExpCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_selfproperty_2_0= ruleVariableExpCS ) ) otherlv_3= '.' )? ( (lv_attribute_4_0= ruleSimpleNameCS ) ) ( (lv_premark_5_0= ruleIsMarkedPreCS ) )? ) ;
    public final EObject rulePropertyCallExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_selfproperty_2_0 = null;

        AntlrDatatypeRuleToken lv_attribute_4_0 = null;

        AntlrDatatypeRuleToken lv_premark_5_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:5913:2: ( ( ( (lv_name_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_selfproperty_2_0= ruleVariableExpCS ) ) otherlv_3= '.' )? ( (lv_attribute_4_0= ruleSimpleNameCS ) ) ( (lv_premark_5_0= ruleIsMarkedPreCS ) )? ) )
            // InternalECModel.g:5914:2: ( ( (lv_name_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_selfproperty_2_0= ruleVariableExpCS ) ) otherlv_3= '.' )? ( (lv_attribute_4_0= ruleSimpleNameCS ) ) ( (lv_premark_5_0= ruleIsMarkedPreCS ) )? )
            {
            // InternalECModel.g:5914:2: ( ( (lv_name_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_selfproperty_2_0= ruleVariableExpCS ) ) otherlv_3= '.' )? ( (lv_attribute_4_0= ruleSimpleNameCS ) ) ( (lv_premark_5_0= ruleIsMarkedPreCS ) )? )
            // InternalECModel.g:5915:3: ( (lv_name_0_0= ruleVariableExpCS ) ) otherlv_1= '.' ( ( (lv_selfproperty_2_0= ruleVariableExpCS ) ) otherlv_3= '.' )? ( (lv_attribute_4_0= ruleSimpleNameCS ) ) ( (lv_premark_5_0= ruleIsMarkedPreCS ) )?
            {
            // InternalECModel.g:5915:3: ( (lv_name_0_0= ruleVariableExpCS ) )
            // InternalECModel.g:5916:4: (lv_name_0_0= ruleVariableExpCS )
            {
            // InternalECModel.g:5916:4: (lv_name_0_0= ruleVariableExpCS )
            // InternalECModel.g:5917:5: lv_name_0_0= ruleVariableExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyCallExpCSAccess().getNameVariableExpCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_75);
            lv_name_0_0=ruleVariableExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyCallExpCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.VariableExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,92,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPropertyCallExpCSAccess().getFullStopKeyword_1());
              		
            }
            // InternalECModel.g:5938:3: ( ( (lv_selfproperty_2_0= ruleVariableExpCS ) ) otherlv_3= '.' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( ((LA111_0>=113 && LA111_0<=114)) ) {
                alt111=1;
            }
            else if ( (LA111_0==RULE_ID) ) {
                int LA111_2 = input.LA(2);

                if ( (LA111_2==92) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // InternalECModel.g:5939:4: ( (lv_selfproperty_2_0= ruleVariableExpCS ) ) otherlv_3= '.'
                    {
                    // InternalECModel.g:5939:4: ( (lv_selfproperty_2_0= ruleVariableExpCS ) )
                    // InternalECModel.g:5940:5: (lv_selfproperty_2_0= ruleVariableExpCS )
                    {
                    // InternalECModel.g:5940:5: (lv_selfproperty_2_0= ruleVariableExpCS )
                    // InternalECModel.g:5941:6: lv_selfproperty_2_0= ruleVariableExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPropertyCallExpCSAccess().getSelfpropertyVariableExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_75);
                    lv_selfproperty_2_0=ruleVariableExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPropertyCallExpCSRule());
                      						}
                      						set(
                      							current,
                      							"selfproperty",
                      							lv_selfproperty_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.VariableExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,92,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPropertyCallExpCSAccess().getFullStopKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalECModel.g:5963:3: ( (lv_attribute_4_0= ruleSimpleNameCS ) )
            // InternalECModel.g:5964:4: (lv_attribute_4_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:5964:4: (lv_attribute_4_0= ruleSimpleNameCS )
            // InternalECModel.g:5965:5: lv_attribute_4_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyCallExpCSAccess().getAttributeSimpleNameCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_83);
            lv_attribute_4_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyCallExpCSRule());
              					}
              					set(
              						current,
              						"attribute",
              						lv_attribute_4_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:5982:3: ( (lv_premark_5_0= ruleIsMarkedPreCS ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==111) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalECModel.g:5983:4: (lv_premark_5_0= ruleIsMarkedPreCS )
                    {
                    // InternalECModel.g:5983:4: (lv_premark_5_0= ruleIsMarkedPreCS )
                    // InternalECModel.g:5984:5: lv_premark_5_0= ruleIsMarkedPreCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPropertyCallExpCSAccess().getPremarkIsMarkedPreCSParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_premark_5_0=ruleIsMarkedPreCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPropertyCallExpCSRule());
                      					}
                      					set(
                      						current,
                      						"premark",
                      						lv_premark_5_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.IsMarkedPreCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyCallExpCS"


    // $ANTLR start "entryRuleOperationCallExpCS"
    // InternalECModel.g:6005:1: entryRuleOperationCallExpCS returns [EObject current=null] : iv_ruleOperationCallExpCS= ruleOperationCallExpCS EOF ;
    public final EObject entryRuleOperationCallExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallExpCS = null;


        try {
            // InternalECModel.g:6005:59: (iv_ruleOperationCallExpCS= ruleOperationCallExpCS EOF )
            // InternalECModel.g:6006:2: iv_ruleOperationCallExpCS= ruleOperationCallExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationCallExpCS=ruleOperationCallExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCallExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationCallExpCS"


    // $ANTLR start "ruleOperationCallExpCS"
    // InternalECModel.g:6012:1: ruleOperationCallExpCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOperationParameters ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOperationParameters ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleOperationCallExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6018:2: ( ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOperationParameters ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOperationParameters ) ) )* otherlv_5= ')' ) )
            // InternalECModel.g:6019:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOperationParameters ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOperationParameters ) ) )* otherlv_5= ')' )
            {
            // InternalECModel.g:6019:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOperationParameters ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOperationParameters ) ) )* otherlv_5= ')' )
            // InternalECModel.g:6020:3: ( (lv_name_0_0= ruleSimpleNameCS ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOperationParameters ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOperationParameters ) ) )* otherlv_5= ')'
            {
            // InternalECModel.g:6020:3: ( (lv_name_0_0= ruleSimpleNameCS ) )
            // InternalECModel.g:6021:4: (lv_name_0_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:6021:4: (lv_name_0_0= ruleSimpleNameCS )
            // InternalECModel.g:6022:5: lv_name_0_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationCallExpCSAccess().getNameSimpleNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_0_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationCallExpCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOperationCallExpCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalECModel.g:6043:3: ( (lv_parameters_2_0= ruleOperationParameters ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=RULE_DOUBLE_QUOTED_STRING && LA113_0<=RULE_SINGLE_QUOTED_STRING)||(LA113_0>=113 && LA113_0<=114)) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalECModel.g:6044:4: (lv_parameters_2_0= ruleOperationParameters )
                    {
                    // InternalECModel.g:6044:4: (lv_parameters_2_0= ruleOperationParameters )
                    // InternalECModel.g:6045:5: lv_parameters_2_0= ruleOperationParameters
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationCallExpCSAccess().getParametersOperationParametersParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_36);
                    lv_parameters_2_0=ruleOperationParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationCallExpCSRule());
                      					}
                      					add(
                      						current,
                      						"parameters",
                      						lv_parameters_2_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.OperationParameters");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:6062:3: (otherlv_3= ',' ( (lv_parameters_4_0= ruleOperationParameters ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==40) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalECModel.g:6063:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleOperationParameters ) )
            	    {
            	    otherlv_3=(Token)match(input,40,FOLLOW_85); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getOperationCallExpCSAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalECModel.g:6067:4: ( (lv_parameters_4_0= ruleOperationParameters ) )
            	    // InternalECModel.g:6068:5: (lv_parameters_4_0= ruleOperationParameters )
            	    {
            	    // InternalECModel.g:6068:5: (lv_parameters_4_0= ruleOperationParameters )
            	    // InternalECModel.g:6069:6: lv_parameters_4_0= ruleOperationParameters
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOperationCallExpCSAccess().getParametersOperationParametersParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_parameters_4_0=ruleOperationParameters();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOperationCallExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_4_0,
            	      							"org.xtext.example.edgecloudmodel.ECModel.OperationParameters");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOperationCallExpCSAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperationCallExpCS"


    // $ANTLR start "entryRuleOperationParameters"
    // InternalECModel.g:6095:1: entryRuleOperationParameters returns [EObject current=null] : iv_ruleOperationParameters= ruleOperationParameters EOF ;
    public final EObject entryRuleOperationParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationParameters = null;


        try {
            // InternalECModel.g:6095:60: (iv_ruleOperationParameters= ruleOperationParameters EOF )
            // InternalECModel.g:6096:2: iv_ruleOperationParameters= ruleOperationParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationParameters=ruleOperationParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationParameters"


    // $ANTLR start "ruleOperationParameters"
    // InternalECModel.g:6102:1: ruleOperationParameters returns [EObject current=null] : ( ( (lv_object_0_0= ruleSimpleNameCS ) ) | ( (lv_objectproperty_1_0= rulePropertyCallExpCS ) ) | ( ( (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING ) ) ) ) ;
    public final EObject ruleOperationParameters() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_1=null;
        Token lv_string_2_2=null;
        AntlrDatatypeRuleToken lv_object_0_0 = null;

        EObject lv_objectproperty_1_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6108:2: ( ( ( (lv_object_0_0= ruleSimpleNameCS ) ) | ( (lv_objectproperty_1_0= rulePropertyCallExpCS ) ) | ( ( (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING ) ) ) ) )
            // InternalECModel.g:6109:2: ( ( (lv_object_0_0= ruleSimpleNameCS ) ) | ( (lv_objectproperty_1_0= rulePropertyCallExpCS ) ) | ( ( (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING ) ) ) )
            {
            // InternalECModel.g:6109:2: ( ( (lv_object_0_0= ruleSimpleNameCS ) ) | ( (lv_objectproperty_1_0= rulePropertyCallExpCS ) ) | ( ( (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING ) ) ) )
            int alt116=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==EOF||LA116_1==14||LA116_1==40) ) {
                    alt116=1;
                }
                else if ( (LA116_1==92) ) {
                    alt116=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 1, input);

                    throw nvae;
                }
                }
                break;
            case 113:
            case 114:
                {
                alt116=2;
                }
                break;
            case RULE_DOUBLE_QUOTED_STRING:
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt116=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalECModel.g:6110:3: ( (lv_object_0_0= ruleSimpleNameCS ) )
                    {
                    // InternalECModel.g:6110:3: ( (lv_object_0_0= ruleSimpleNameCS ) )
                    // InternalECModel.g:6111:4: (lv_object_0_0= ruleSimpleNameCS )
                    {
                    // InternalECModel.g:6111:4: (lv_object_0_0= ruleSimpleNameCS )
                    // InternalECModel.g:6112:5: lv_object_0_0= ruleSimpleNameCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationParametersAccess().getObjectSimpleNameCSParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_object_0_0=ruleSimpleNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationParametersRule());
                      					}
                      					set(
                      						current,
                      						"object",
                      						lv_object_0_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalECModel.g:6130:3: ( (lv_objectproperty_1_0= rulePropertyCallExpCS ) )
                    {
                    // InternalECModel.g:6130:3: ( (lv_objectproperty_1_0= rulePropertyCallExpCS ) )
                    // InternalECModel.g:6131:4: (lv_objectproperty_1_0= rulePropertyCallExpCS )
                    {
                    // InternalECModel.g:6131:4: (lv_objectproperty_1_0= rulePropertyCallExpCS )
                    // InternalECModel.g:6132:5: lv_objectproperty_1_0= rulePropertyCallExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationParametersAccess().getObjectpropertyPropertyCallExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_objectproperty_1_0=rulePropertyCallExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationParametersRule());
                      					}
                      					set(
                      						current,
                      						"objectproperty",
                      						lv_objectproperty_1_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.PropertyCallExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalECModel.g:6150:3: ( ( (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING ) ) )
                    {
                    // InternalECModel.g:6150:3: ( ( (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING ) ) )
                    // InternalECModel.g:6151:4: ( (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING ) )
                    {
                    // InternalECModel.g:6151:4: ( (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING ) )
                    // InternalECModel.g:6152:5: (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING )
                    {
                    // InternalECModel.g:6152:5: (lv_string_2_1= RULE_SINGLE_QUOTED_STRING | lv_string_2_2= RULE_DOUBLE_QUOTED_STRING )
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==RULE_SINGLE_QUOTED_STRING) ) {
                        alt115=1;
                    }
                    else if ( (LA115_0==RULE_DOUBLE_QUOTED_STRING) ) {
                        alt115=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 0, input);

                        throw nvae;
                    }
                    switch (alt115) {
                        case 1 :
                            // InternalECModel.g:6153:6: lv_string_2_1= RULE_SINGLE_QUOTED_STRING
                            {
                            lv_string_2_1=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_string_2_1, grammarAccess.getOperationParametersAccess().getStringSINGLE_QUOTED_STRINGTerminalRuleCall_2_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getOperationParametersRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"string",
                              							lv_string_2_1,
                              							"org.xtext.example.edgecloudmodel.ECModel.SINGLE_QUOTED_STRING");
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalECModel.g:6168:6: lv_string_2_2= RULE_DOUBLE_QUOTED_STRING
                            {
                            lv_string_2_2=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_string_2_2, grammarAccess.getOperationParametersAccess().getStringDOUBLE_QUOTED_STRINGTerminalRuleCall_2_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getOperationParametersRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"string",
                              							lv_string_2_2,
                              							"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                              					
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperationParameters"


    // $ANTLR start "entryRuleIsMarkedPreCS"
    // InternalECModel.g:6189:1: entryRuleIsMarkedPreCS returns [String current=null] : iv_ruleIsMarkedPreCS= ruleIsMarkedPreCS EOF ;
    public final String entryRuleIsMarkedPreCS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsMarkedPreCS = null;


        try {
            // InternalECModel.g:6189:53: (iv_ruleIsMarkedPreCS= ruleIsMarkedPreCS EOF )
            // InternalECModel.g:6190:2: iv_ruleIsMarkedPreCS= ruleIsMarkedPreCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsMarkedPreCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsMarkedPreCS=ruleIsMarkedPreCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsMarkedPreCS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIsMarkedPreCS"


    // $ANTLR start "ruleIsMarkedPreCS"
    // InternalECModel.g:6196:1: ruleIsMarkedPreCS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' kw= 'pre' ) ;
    public final AntlrDatatypeRuleToken ruleIsMarkedPreCS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalECModel.g:6202:2: ( (kw= '@' kw= 'pre' ) )
            // InternalECModel.g:6203:2: (kw= '@' kw= 'pre' )
            {
            // InternalECModel.g:6203:2: (kw= '@' kw= 'pre' )
            // InternalECModel.g:6204:3: kw= '@' kw= 'pre'
            {
            kw=(Token)match(input,111,FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIsMarkedPreCSAccess().getCommercialAtKeyword_0());
              		
            }
            kw=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIsMarkedPreCSAccess().getPreKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIsMarkedPreCS"


    // $ANTLR start "entryRuleVariableExpCS"
    // InternalECModel.g:6218:1: entryRuleVariableExpCS returns [EObject current=null] : iv_ruleVariableExpCS= ruleVariableExpCS EOF ;
    public final EObject entryRuleVariableExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpCS = null;


        try {
            // InternalECModel.g:6218:54: (iv_ruleVariableExpCS= ruleVariableExpCS EOF )
            // InternalECModel.g:6219:2: iv_ruleVariableExpCS= ruleVariableExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableExpCS=ruleVariableExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableExpCS"


    // $ANTLR start "ruleVariableExpCS"
    // InternalECModel.g:6225:1: ruleVariableExpCS returns [EObject current=null] : ( ( (lv_symbol_0_1= 'self' | lv_symbol_0_2= 'result' | lv_symbol_0_3= ruleSimpleNameCS ) ) ) ;
    public final EObject ruleVariableExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_1=null;
        Token lv_symbol_0_2=null;
        AntlrDatatypeRuleToken lv_symbol_0_3 = null;



        	enterRule();

        try {
            // InternalECModel.g:6231:2: ( ( ( (lv_symbol_0_1= 'self' | lv_symbol_0_2= 'result' | lv_symbol_0_3= ruleSimpleNameCS ) ) ) )
            // InternalECModel.g:6232:2: ( ( (lv_symbol_0_1= 'self' | lv_symbol_0_2= 'result' | lv_symbol_0_3= ruleSimpleNameCS ) ) )
            {
            // InternalECModel.g:6232:2: ( ( (lv_symbol_0_1= 'self' | lv_symbol_0_2= 'result' | lv_symbol_0_3= ruleSimpleNameCS ) ) )
            // InternalECModel.g:6233:3: ( (lv_symbol_0_1= 'self' | lv_symbol_0_2= 'result' | lv_symbol_0_3= ruleSimpleNameCS ) )
            {
            // InternalECModel.g:6233:3: ( (lv_symbol_0_1= 'self' | lv_symbol_0_2= 'result' | lv_symbol_0_3= ruleSimpleNameCS ) )
            // InternalECModel.g:6234:4: (lv_symbol_0_1= 'self' | lv_symbol_0_2= 'result' | lv_symbol_0_3= ruleSimpleNameCS )
            {
            // InternalECModel.g:6234:4: (lv_symbol_0_1= 'self' | lv_symbol_0_2= 'result' | lv_symbol_0_3= ruleSimpleNameCS )
            int alt117=3;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt117=1;
                }
                break;
            case 114:
                {
                alt117=2;
                }
                break;
            case RULE_ID:
                {
                alt117=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalECModel.g:6235:5: lv_symbol_0_1= 'self'
                    {
                    lv_symbol_0_1=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_1, grammarAccess.getVariableExpCSAccess().getSymbolSelfKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:6246:5: lv_symbol_0_2= 'result'
                    {
                    lv_symbol_0_2=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_2, grammarAccess.getVariableExpCSAccess().getSymbolResultKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:6257:5: lv_symbol_0_3= ruleSimpleNameCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVariableExpCSAccess().getSymbolSimpleNameCSParserRuleCall_0_2());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_symbol_0_3=ruleSimpleNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVariableExpCSRule());
                      					}
                      					set(
                      						current,
                      						"symbol",
                      						lv_symbol_0_3,
                      						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableExpCS"


    // $ANTLR start "entryRuleSimpleNameCS"
    // InternalECModel.g:6278:1: entryRuleSimpleNameCS returns [String current=null] : iv_ruleSimpleNameCS= ruleSimpleNameCS EOF ;
    public final String entryRuleSimpleNameCS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleNameCS = null;


        try {
            // InternalECModel.g:6278:52: (iv_ruleSimpleNameCS= ruleSimpleNameCS EOF )
            // InternalECModel.g:6279:2: iv_ruleSimpleNameCS= ruleSimpleNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNameCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleNameCS=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNameCS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleNameCS"


    // $ANTLR start "ruleSimpleNameCS"
    // InternalECModel.g:6285:1: ruleSimpleNameCS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSimpleNameCS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalECModel.g:6291:2: (this_ID_0= RULE_ID )
            // InternalECModel.g:6292:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getSimpleNameCSAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleNameCS"


    // $ANTLR start "entryRuleIfExpCS"
    // InternalECModel.g:6302:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalECModel.g:6302:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalECModel.g:6303:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // InternalECModel.g:6309:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleOCLExpressionCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOCLExpressionCS ) ) (otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOCLExpressionCS ) ) )? otherlv_6= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6315:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleOCLExpressionCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOCLExpressionCS ) ) (otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOCLExpressionCS ) ) )? otherlv_6= 'endif' ) )
            // InternalECModel.g:6316:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOCLExpressionCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOCLExpressionCS ) ) (otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOCLExpressionCS ) ) )? otherlv_6= 'endif' )
            {
            // InternalECModel.g:6316:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOCLExpressionCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOCLExpressionCS ) ) (otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOCLExpressionCS ) ) )? otherlv_6= 'endif' )
            // InternalECModel.g:6317:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleOCLExpressionCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOCLExpressionCS ) ) (otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOCLExpressionCS ) ) )? otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
              		
            }
            // InternalECModel.g:6321:3: ( (lv_condition_1_0= ruleOCLExpressionCS ) )
            // InternalECModel.g:6322:4: (lv_condition_1_0= ruleOCLExpressionCS )
            {
            // InternalECModel.g:6322:4: (lv_condition_1_0= ruleOCLExpressionCS )
            // InternalECModel.g:6323:5: lv_condition_1_0= ruleOCLExpressionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionOCLExpressionCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_87);
            lv_condition_1_0=ruleOCLExpressionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,116,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalECModel.g:6344:3: ( (lv_thenExpression_3_0= ruleOCLExpressionCS ) )
            // InternalECModel.g:6345:4: (lv_thenExpression_3_0= ruleOCLExpressionCS )
            {
            // InternalECModel.g:6345:4: (lv_thenExpression_3_0= ruleOCLExpressionCS )
            // InternalECModel.g:6346:5: lv_thenExpression_3_0= ruleOCLExpressionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionOCLExpressionCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_88);
            lv_thenExpression_3_0=ruleOCLExpressionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"thenExpression",
              						lv_thenExpression_3_0,
              						"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:6363:3: (otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOCLExpressionCS ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==117) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalECModel.g:6364:4: otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOCLExpressionCS ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalECModel.g:6368:4: ( (lv_elseExpression_5_0= ruleOCLExpressionCS ) )
                    // InternalECModel.g:6369:5: (lv_elseExpression_5_0= ruleOCLExpressionCS )
                    {
                    // InternalECModel.g:6369:5: (lv_elseExpression_5_0= ruleOCLExpressionCS )
                    // InternalECModel.g:6370:6: lv_elseExpression_5_0= ruleOCLExpressionCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionOCLExpressionCSParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_89);
                    lv_elseExpression_5_0=ruleOCLExpressionCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"elseExpression",
                      							lv_elseExpression_5_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfExpCSAccess().getEndifKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // InternalECModel.g:6396:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalECModel.g:6396:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalECModel.g:6397:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // InternalECModel.g:6403:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclarationCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleVariableDeclarationCS ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOCLExpressionCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_inExpression_5_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6409:2: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclarationCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleVariableDeclarationCS ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOCLExpressionCS ) ) ) )
            // InternalECModel.g:6410:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclarationCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleVariableDeclarationCS ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOCLExpressionCS ) ) )
            {
            // InternalECModel.g:6410:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclarationCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleVariableDeclarationCS ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOCLExpressionCS ) ) )
            // InternalECModel.g:6411:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleVariableDeclarationCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleVariableDeclarationCS ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOCLExpressionCS ) )
            {
            otherlv_0=(Token)match(input,119,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
              		
            }
            // InternalECModel.g:6415:3: ( (lv_variable_1_0= ruleVariableDeclarationCS ) )
            // InternalECModel.g:6416:4: (lv_variable_1_0= ruleVariableDeclarationCS )
            {
            // InternalECModel.g:6416:4: (lv_variable_1_0= ruleVariableDeclarationCS )
            // InternalECModel.g:6417:5: lv_variable_1_0= ruleVariableDeclarationCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableVariableDeclarationCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_90);
            lv_variable_1_0=ruleVariableDeclarationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					add(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"org.xtext.example.edgecloudmodel.ECModel.VariableDeclarationCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:6434:3: (otherlv_2= ',' ( (lv_variable_3_0= ruleVariableDeclarationCS ) ) )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==40) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalECModel.g:6435:4: otherlv_2= ',' ( (lv_variable_3_0= ruleVariableDeclarationCS ) )
            	    {
            	    otherlv_2=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalECModel.g:6439:4: ( (lv_variable_3_0= ruleVariableDeclarationCS ) )
            	    // InternalECModel.g:6440:5: (lv_variable_3_0= ruleVariableDeclarationCS )
            	    {
            	    // InternalECModel.g:6440:5: (lv_variable_3_0= ruleVariableDeclarationCS )
            	    // InternalECModel.g:6441:6: lv_variable_3_0= ruleVariableDeclarationCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableVariableDeclarationCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_90);
            	    lv_variable_3_0=ruleVariableDeclarationCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variable",
            	      							lv_variable_3_0,
            	      							"org.xtext.example.edgecloudmodel.ECModel.VariableDeclarationCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);

            otherlv_4=(Token)match(input,120,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
              		
            }
            // InternalECModel.g:6463:3: ( (lv_inExpression_5_0= ruleOCLExpressionCS ) )
            // InternalECModel.g:6464:4: (lv_inExpression_5_0= ruleOCLExpressionCS )
            {
            // InternalECModel.g:6464:4: (lv_inExpression_5_0= ruleOCLExpressionCS )
            // InternalECModel.g:6465:5: lv_inExpression_5_0= ruleOCLExpressionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getInExpressionOCLExpressionCSParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_inExpression_5_0=ruleOCLExpressionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					set(
              						current,
              						"inExpression",
              						lv_inExpression_5_0,
              						"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleVariableDeclarationCS"
    // InternalECModel.g:6486:1: entryRuleVariableDeclarationCS returns [EObject current=null] : iv_ruleVariableDeclarationCS= ruleVariableDeclarationCS EOF ;
    public final EObject entryRuleVariableDeclarationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationCS = null;


        try {
            // InternalECModel.g:6486:62: (iv_ruleVariableDeclarationCS= ruleVariableDeclarationCS EOF )
            // InternalECModel.g:6487:2: iv_ruleVariableDeclarationCS= ruleVariableDeclarationCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclarationCS=ruleVariableDeclarationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclarationCS"


    // $ANTLR start "ruleVariableDeclarationCS"
    // InternalECModel.g:6493:1: ruleVariableDeclarationCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleSimpleNameCS ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOCLExpressionCS ) ) )? ) ;
    public final EObject ruleVariableDeclarationCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6499:2: ( ( ( (lv_name_0_0= ruleSimpleNameCS ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOCLExpressionCS ) ) )? ) )
            // InternalECModel.g:6500:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOCLExpressionCS ) ) )? )
            {
            // InternalECModel.g:6500:2: ( ( (lv_name_0_0= ruleSimpleNameCS ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOCLExpressionCS ) ) )? )
            // InternalECModel.g:6501:3: ( (lv_name_0_0= ruleSimpleNameCS ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )? (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOCLExpressionCS ) ) )?
            {
            // InternalECModel.g:6501:3: ( (lv_name_0_0= ruleSimpleNameCS ) )
            // InternalECModel.g:6502:4: (lv_name_0_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:6502:4: (lv_name_0_0= ruleSimpleNameCS )
            // InternalECModel.g:6503:5: lv_name_0_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationCSAccess().getNameSimpleNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_91);
            lv_name_0_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalECModel.g:6520:3: (otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==48) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalECModel.g:6521:4: otherlv_1= ':' ( (lv_type_2_0= ruleTypeCS ) )
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalECModel.g:6525:4: ( (lv_type_2_0= ruleTypeCS ) )
                    // InternalECModel.g:6526:5: (lv_type_2_0= ruleTypeCS )
                    {
                    // InternalECModel.g:6526:5: (lv_type_2_0= ruleTypeCS )
                    // InternalECModel.g:6527:6: lv_type_2_0= ruleTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableDeclarationCSAccess().getTypeTypeCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_92);
                    lv_type_2_0=ruleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableDeclarationCSRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.TypeCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalECModel.g:6545:3: (otherlv_3= '=' ( (lv_initExpression_4_0= ruleOCLExpressionCS ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==80) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalECModel.g:6546:4: otherlv_3= '=' ( (lv_initExpression_4_0= ruleOCLExpressionCS ) )
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationCSAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalECModel.g:6550:4: ( (lv_initExpression_4_0= ruleOCLExpressionCS ) )
                    // InternalECModel.g:6551:5: (lv_initExpression_4_0= ruleOCLExpressionCS )
                    {
                    // InternalECModel.g:6551:5: (lv_initExpression_4_0= ruleOCLExpressionCS )
                    // InternalECModel.g:6552:6: lv_initExpression_4_0= ruleOCLExpressionCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableDeclarationCSAccess().getInitExpressionOCLExpressionCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_initExpression_4_0=ruleOCLExpressionCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableDeclarationCSRule());
                      						}
                      						set(
                      							current,
                      							"initExpression",
                      							lv_initExpression_4_0,
                      							"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableDeclarationCS"


    // $ANTLR start "entryRuleLiteralExpCS"
    // InternalECModel.g:6574:1: entryRuleLiteralExpCS returns [EObject current=null] : iv_ruleLiteralExpCS= ruleLiteralExpCS EOF ;
    public final EObject entryRuleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpCS = null;


        try {
            // InternalECModel.g:6574:53: (iv_ruleLiteralExpCS= ruleLiteralExpCS EOF )
            // InternalECModel.g:6575:2: iv_ruleLiteralExpCS= ruleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpCS=ruleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralExpCS"


    // $ANTLR start "ruleLiteralExpCS"
    // InternalECModel.g:6581:1: ruleLiteralExpCS returns [EObject current=null] : (this_CollectionLiteralExpCS_0= ruleCollectionLiteralExpCS | this_TupleLiteralExpCS_1= ruleTupleLiteralExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_EnumLiteralExpCS_3= ruleEnumLiteralExpCS ) ;
    public final EObject ruleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteralExpCS_0 = null;

        EObject this_TupleLiteralExpCS_1 = null;

        EObject this_PrimitiveLiteralExpCS_2 = null;

        EObject this_EnumLiteralExpCS_3 = null;



        	enterRule();

        try {
            // InternalECModel.g:6587:2: ( (this_CollectionLiteralExpCS_0= ruleCollectionLiteralExpCS | this_TupleLiteralExpCS_1= ruleTupleLiteralExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_EnumLiteralExpCS_3= ruleEnumLiteralExpCS ) )
            // InternalECModel.g:6588:2: (this_CollectionLiteralExpCS_0= ruleCollectionLiteralExpCS | this_TupleLiteralExpCS_1= ruleTupleLiteralExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_EnumLiteralExpCS_3= ruleEnumLiteralExpCS )
            {
            // InternalECModel.g:6588:2: (this_CollectionLiteralExpCS_0= ruleCollectionLiteralExpCS | this_TupleLiteralExpCS_1= ruleTupleLiteralExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_EnumLiteralExpCS_3= ruleEnumLiteralExpCS )
            int alt122=4;
            switch ( input.LA(1) ) {
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
                {
                alt122=1;
                }
                break;
            case 121:
                {
                alt122=2;
                }
                break;
            case RULE_DOUBLE_QUOTED_STRING:
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_INT:
            case 60:
            case 123:
            case 124:
            case 125:
            case 126:
                {
                alt122=3;
                }
                break;
            case RULE_ID:
                {
                alt122=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // InternalECModel.g:6589:3: this_CollectionLiteralExpCS_0= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpCSAccess().getCollectionLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionLiteralExpCS_0=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:6598:3: this_TupleLiteralExpCS_1= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpCSAccess().getTupleLiteralExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleLiteralExpCS_1=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleLiteralExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:6607:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveLiteralExpCS_2=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveLiteralExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:6616:3: this_EnumLiteralExpCS_3= ruleEnumLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpCSAccess().getEnumLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumLiteralExpCS_3=ruleEnumLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteralExpCS"


    // $ANTLR start "entryRuleEnumLiteralExpCS"
    // InternalECModel.g:6628:1: entryRuleEnumLiteralExpCS returns [EObject current=null] : iv_ruleEnumLiteralExpCS= ruleEnumLiteralExpCS EOF ;
    public final EObject entryRuleEnumLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralExpCS = null;


        try {
            // InternalECModel.g:6628:57: (iv_ruleEnumLiteralExpCS= ruleEnumLiteralExpCS EOF )
            // InternalECModel.g:6629:2: iv_ruleEnumLiteralExpCS= ruleEnumLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteralExpCS=ruleEnumLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumLiteralExpCS"


    // $ANTLR start "ruleEnumLiteralExpCS"
    // InternalECModel.g:6635:1: ruleEnumLiteralExpCS returns [EObject current=null] : ( ( (lv_enumname_0_0= ruleSimpleNameCS ) ) otherlv_1= '::' ( (lv_eunmitem_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_eunmitem_2_0=null;
        AntlrDatatypeRuleToken lv_enumname_0_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6641:2: ( ( ( (lv_enumname_0_0= ruleSimpleNameCS ) ) otherlv_1= '::' ( (lv_eunmitem_2_0= RULE_ID ) ) ) )
            // InternalECModel.g:6642:2: ( ( (lv_enumname_0_0= ruleSimpleNameCS ) ) otherlv_1= '::' ( (lv_eunmitem_2_0= RULE_ID ) ) )
            {
            // InternalECModel.g:6642:2: ( ( (lv_enumname_0_0= ruleSimpleNameCS ) ) otherlv_1= '::' ( (lv_eunmitem_2_0= RULE_ID ) ) )
            // InternalECModel.g:6643:3: ( (lv_enumname_0_0= ruleSimpleNameCS ) ) otherlv_1= '::' ( (lv_eunmitem_2_0= RULE_ID ) )
            {
            // InternalECModel.g:6643:3: ( (lv_enumname_0_0= ruleSimpleNameCS ) )
            // InternalECModel.g:6644:4: (lv_enumname_0_0= ruleSimpleNameCS )
            {
            // InternalECModel.g:6644:4: (lv_enumname_0_0= ruleSimpleNameCS )
            // InternalECModel.g:6645:5: lv_enumname_0_0= ruleSimpleNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumLiteralExpCSAccess().getEnumnameSimpleNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_enumname_0_0=ruleSimpleNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumLiteralExpCSRule());
              					}
              					set(
              						current,
              						"enumname",
              						lv_enumname_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.SimpleNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumLiteralExpCSAccess().getColonColonKeyword_1());
              		
            }
            // InternalECModel.g:6666:3: ( (lv_eunmitem_2_0= RULE_ID ) )
            // InternalECModel.g:6667:4: (lv_eunmitem_2_0= RULE_ID )
            {
            // InternalECModel.g:6667:4: (lv_eunmitem_2_0= RULE_ID )
            // InternalECModel.g:6668:5: lv_eunmitem_2_0= RULE_ID
            {
            lv_eunmitem_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_eunmitem_2_0, grammarAccess.getEnumLiteralExpCSAccess().getEunmitemIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumLiteralExpCSRule());
              					}
              					setWithLastConsumed(
              						current,
              						"eunmitem",
              						lv_eunmitem_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // InternalECModel.g:6688:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalECModel.g:6688:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalECModel.g:6689:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // InternalECModel.g:6695:1: ruleTupleLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleVariableDeclarationCS ) )? (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableDeclarationCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variables_2_0 = null;

        EObject lv_variables_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6701:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleVariableDeclarationCS ) )? (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableDeclarationCS ) ) )* otherlv_5= '}' ) )
            // InternalECModel.g:6702:2: ( ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleVariableDeclarationCS ) )? (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableDeclarationCS ) ) )* otherlv_5= '}' )
            {
            // InternalECModel.g:6702:2: ( ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleVariableDeclarationCS ) )? (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableDeclarationCS ) ) )* otherlv_5= '}' )
            // InternalECModel.g:6703:3: ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleVariableDeclarationCS ) )? (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableDeclarationCS ) ) )* otherlv_5= '}'
            {
            // InternalECModel.g:6703:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalECModel.g:6704:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalECModel.g:6704:4: (lv_name_0_0= 'Tuple' )
            // InternalECModel.g:6705:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,121,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTupleLiteralExpCSAccess().getNameTupleKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTupleLiteralExpCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalECModel.g:6721:3: ( (lv_variables_2_0= ruleVariableDeclarationCS ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==RULE_ID) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalECModel.g:6722:4: (lv_variables_2_0= ruleVariableDeclarationCS )
                    {
                    // InternalECModel.g:6722:4: (lv_variables_2_0= ruleVariableDeclarationCS )
                    // InternalECModel.g:6723:5: lv_variables_2_0= ruleVariableDeclarationCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getVariablesVariableDeclarationCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_94);
                    lv_variables_2_0=ruleVariableDeclarationCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
                      					}
                      					add(
                      						current,
                      						"variables",
                      						lv_variables_2_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.VariableDeclarationCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:6740:3: (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableDeclarationCS ) ) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==40) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalECModel.g:6741:4: otherlv_3= ',' ( (lv_variables_4_0= ruleVariableDeclarationCS ) )
            	    {
            	    otherlv_3=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalECModel.g:6745:4: ( (lv_variables_4_0= ruleVariableDeclarationCS ) )
            	    // InternalECModel.g:6746:5: (lv_variables_4_0= ruleVariableDeclarationCS )
            	    {
            	    // InternalECModel.g:6746:5: (lv_variables_4_0= ruleVariableDeclarationCS )
            	    // InternalECModel.g:6747:6: lv_variables_4_0= ruleVariableDeclarationCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getVariablesVariableDeclarationCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_94);
            	    lv_variables_4_0=ruleVariableDeclarationCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variables",
            	      							lv_variables_4_0,
            	      							"org.xtext.example.edgecloudmodel.ECModel.VariableDeclarationCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // InternalECModel.g:6773:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalECModel.g:6773:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalECModel.g:6774:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // InternalECModel.g:6780:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '(' ( (lv_type_2_0= ruleTypeCS ) ) otherlv_3= ')' ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6786:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '(' ( (lv_type_2_0= ruleTypeCS ) ) otherlv_3= ')' ) )
            // InternalECModel.g:6787:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '(' ( (lv_type_2_0= ruleTypeCS ) ) otherlv_3= ')' )
            {
            // InternalECModel.g:6787:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '(' ( (lv_type_2_0= ruleTypeCS ) ) otherlv_3= ')' )
            // InternalECModel.g:6788:3: ( (lv_name_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '(' ( (lv_type_2_0= ruleTypeCS ) ) otherlv_3= ')'
            {
            // InternalECModel.g:6788:3: ( (lv_name_0_0= ruleCollectionTypeIdentifierCS ) )
            // InternalECModel.g:6789:4: (lv_name_0_0= ruleCollectionTypeIdentifierCS )
            {
            // InternalECModel.g:6789:4: (lv_name_0_0= ruleCollectionTypeIdentifierCS )
            // InternalECModel.g:6790:5: lv_name_0_0= ruleCollectionTypeIdentifierCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_0_0=ruleCollectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.CollectionTypeIdentifierCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalECModel.g:6811:3: ( (lv_type_2_0= ruleTypeCS ) )
            // InternalECModel.g:6812:4: (lv_type_2_0= ruleTypeCS )
            {
            // InternalECModel.g:6812:4: (lv_type_2_0= ruleTypeCS )
            // InternalECModel.g:6813:5: lv_type_2_0= ruleTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getTypeTypeCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_type_2_0=ruleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.TypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // InternalECModel.g:6838:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalECModel.g:6838:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalECModel.g:6839:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // InternalECModel.g:6845:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_kind_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '{' ( (lv_part_2_0= ruleCollectionLiteralPartCS ) )? ( ( ( ',' )=>otherlv_3= ',' ) ( (lv_part_4_0= ruleCollectionLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_kind_0_0 = null;

        EObject lv_part_2_0 = null;

        EObject lv_part_4_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6851:2: ( ( ( (lv_kind_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '{' ( (lv_part_2_0= ruleCollectionLiteralPartCS ) )? ( ( ( ',' )=>otherlv_3= ',' ) ( (lv_part_4_0= ruleCollectionLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalECModel.g:6852:2: ( ( (lv_kind_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '{' ( (lv_part_2_0= ruleCollectionLiteralPartCS ) )? ( ( ( ',' )=>otherlv_3= ',' ) ( (lv_part_4_0= ruleCollectionLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalECModel.g:6852:2: ( ( (lv_kind_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '{' ( (lv_part_2_0= ruleCollectionLiteralPartCS ) )? ( ( ( ',' )=>otherlv_3= ',' ) ( (lv_part_4_0= ruleCollectionLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalECModel.g:6853:3: ( (lv_kind_0_0= ruleCollectionTypeIdentifierCS ) ) otherlv_1= '{' ( (lv_part_2_0= ruleCollectionLiteralPartCS ) )? ( ( ( ',' )=>otherlv_3= ',' ) ( (lv_part_4_0= ruleCollectionLiteralPartCS ) ) )* otherlv_5= '}'
            {
            // InternalECModel.g:6853:3: ( (lv_kind_0_0= ruleCollectionTypeIdentifierCS ) )
            // InternalECModel.g:6854:4: (lv_kind_0_0= ruleCollectionTypeIdentifierCS )
            {
            // InternalECModel.g:6854:4: (lv_kind_0_0= ruleCollectionTypeIdentifierCS )
            // InternalECModel.g:6855:5: lv_kind_0_0= ruleCollectionTypeIdentifierCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getKindCollectionTypeIdentifierCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_kind_0_0=ruleCollectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              					}
              					set(
              						current,
              						"kind",
              						lv_kind_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.CollectionTypeIdentifierCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalECModel.g:6876:3: ( (lv_part_2_0= ruleCollectionLiteralPartCS ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( ((LA125_0>=RULE_DOUBLE_QUOTED_STRING && LA125_0<=RULE_INT)||LA125_0==21||LA125_0==60||(LA125_0>=113 && LA125_0<=115)||LA125_0==119||LA125_0==121||(LA125_0>=123 && LA125_0<=131)) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalECModel.g:6877:4: (lv_part_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalECModel.g:6877:4: (lv_part_2_0= ruleCollectionLiteralPartCS )
                    // InternalECModel.g:6878:5: lv_part_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getPartCollectionLiteralPartCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_94);
                    lv_part_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      					}
                      					add(
                      						current,
                      						"part",
                      						lv_part_2_0,
                      						"org.xtext.example.edgecloudmodel.ECModel.CollectionLiteralPartCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalECModel.g:6895:3: ( ( ( ',' )=>otherlv_3= ',' ) ( (lv_part_4_0= ruleCollectionLiteralPartCS ) ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==40) && (synpred3_InternalECModel())) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalECModel.g:6896:4: ( ( ',' )=>otherlv_3= ',' ) ( (lv_part_4_0= ruleCollectionLiteralPartCS ) )
            	    {
            	    // InternalECModel.g:6896:4: ( ( ',' )=>otherlv_3= ',' )
            	    // InternalECModel.g:6897:5: ( ',' )=>otherlv_3= ','
            	    {
            	    otherlv_3=(Token)match(input,40,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_3_0());
            	      				
            	    }

            	    }

            	    // InternalECModel.g:6903:4: ( (lv_part_4_0= ruleCollectionLiteralPartCS ) )
            	    // InternalECModel.g:6904:5: (lv_part_4_0= ruleCollectionLiteralPartCS )
            	    {
            	    // InternalECModel.g:6904:5: (lv_part_4_0= ruleCollectionLiteralPartCS )
            	    // InternalECModel.g:6905:6: lv_part_4_0= ruleCollectionLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getPartCollectionLiteralPartCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_94);
            	    lv_part_4_0=ruleCollectionLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"part",
            	      							lv_part_4_0,
            	      							"org.xtext.example.edgecloudmodel.ECModel.CollectionLiteralPartCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // InternalECModel.g:6931:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalECModel.g:6931:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalECModel.g:6932:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // InternalECModel.g:6938:1: ruleCollectionLiteralPartCS returns [EObject current=null] : (this_CollectionRangeCS_0= ruleCollectionRangeCS | ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=>this_CollectionItem_1= ruleCollectionItem ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionRangeCS_0 = null;

        EObject this_CollectionItem_1 = null;



        	enterRule();

        try {
            // InternalECModel.g:6944:2: ( (this_CollectionRangeCS_0= ruleCollectionRangeCS | ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=>this_CollectionItem_1= ruleCollectionItem ) ) )
            // InternalECModel.g:6945:2: (this_CollectionRangeCS_0= ruleCollectionRangeCS | ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=>this_CollectionItem_1= ruleCollectionItem ) )
            {
            // InternalECModel.g:6945:2: (this_CollectionRangeCS_0= ruleCollectionRangeCS | ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=>this_CollectionItem_1= ruleCollectionItem ) )
            int alt127=2;
            alt127 = dfa127.predict(input);
            switch (alt127) {
                case 1 :
                    // InternalECModel.g:6946:3: this_CollectionRangeCS_0= ruleCollectionRangeCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getCollectionRangeCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionRangeCS_0=ruleCollectionRangeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionRangeCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:6955:3: ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=>this_CollectionItem_1= ruleCollectionItem )
                    {
                    // InternalECModel.g:6955:3: ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=>this_CollectionItem_1= ruleCollectionItem )
                    // InternalECModel.g:6956:4: ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=>this_CollectionItem_1= ruleCollectionItem
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getCollectionItemParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionItem_1=ruleCollectionItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CollectionItem_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleCollectionRangeCS"
    // InternalECModel.g:6970:1: entryRuleCollectionRangeCS returns [EObject current=null] : iv_ruleCollectionRangeCS= ruleCollectionRangeCS EOF ;
    public final EObject entryRuleCollectionRangeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionRangeCS = null;


        try {
            // InternalECModel.g:6970:58: (iv_ruleCollectionRangeCS= ruleCollectionRangeCS EOF )
            // InternalECModel.g:6971:2: iv_ruleCollectionRangeCS= ruleCollectionRangeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRangeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionRangeCS=ruleCollectionRangeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionRangeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionRangeCS"


    // $ANTLR start "ruleCollectionRangeCS"
    // InternalECModel.g:6977:1: ruleCollectionRangeCS returns [EObject current=null] : ( ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=> (lv_first_0_0= ruleOCLExpressionCS ) ) otherlv_1= '..' ( (lv_last_2_0= ruleOCLExpressionCS ) ) ) ;
    public final EObject ruleCollectionRangeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_first_0_0 = null;

        EObject lv_last_2_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:6983:2: ( ( ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=> (lv_first_0_0= ruleOCLExpressionCS ) ) otherlv_1= '..' ( (lv_last_2_0= ruleOCLExpressionCS ) ) ) )
            // InternalECModel.g:6984:2: ( ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=> (lv_first_0_0= ruleOCLExpressionCS ) ) otherlv_1= '..' ( (lv_last_2_0= ruleOCLExpressionCS ) ) )
            {
            // InternalECModel.g:6984:2: ( ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=> (lv_first_0_0= ruleOCLExpressionCS ) ) otherlv_1= '..' ( (lv_last_2_0= ruleOCLExpressionCS ) ) )
            // InternalECModel.g:6985:3: ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=> (lv_first_0_0= ruleOCLExpressionCS ) ) otherlv_1= '..' ( (lv_last_2_0= ruleOCLExpressionCS ) )
            {
            // InternalECModel.g:6985:3: ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=> (lv_first_0_0= ruleOCLExpressionCS ) )
            // InternalECModel.g:6986:4: ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=> (lv_first_0_0= ruleOCLExpressionCS )
            {
            // InternalECModel.g:6987:4: (lv_first_0_0= ruleOCLExpressionCS )
            // InternalECModel.g:6988:5: lv_first_0_0= ruleOCLExpressionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionRangeCSAccess().getFirstOCLExpressionCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_96);
            lv_first_0_0=ruleOCLExpressionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionRangeCSRule());
              					}
              					set(
              						current,
              						"first",
              						lv_first_0_0,
              						"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,122,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionRangeCSAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalECModel.g:7009:3: ( (lv_last_2_0= ruleOCLExpressionCS ) )
            // InternalECModel.g:7010:4: (lv_last_2_0= ruleOCLExpressionCS )
            {
            // InternalECModel.g:7010:4: (lv_last_2_0= ruleOCLExpressionCS )
            // InternalECModel.g:7011:5: lv_last_2_0= ruleOCLExpressionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionRangeCSAccess().getLastOCLExpressionCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_last_2_0=ruleOCLExpressionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionRangeCSRule());
              					}
              					set(
              						current,
              						"last",
              						lv_last_2_0,
              						"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionRangeCS"


    // $ANTLR start "entryRuleCollectionItem"
    // InternalECModel.g:7032:1: entryRuleCollectionItem returns [EObject current=null] : iv_ruleCollectionItem= ruleCollectionItem EOF ;
    public final EObject entryRuleCollectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionItem = null;


        try {
            // InternalECModel.g:7032:55: (iv_ruleCollectionItem= ruleCollectionItem EOF )
            // InternalECModel.g:7033:2: iv_ruleCollectionItem= ruleCollectionItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionItemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionItem=ruleCollectionItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionItem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionItem"


    // $ANTLR start "ruleCollectionItem"
    // InternalECModel.g:7039:1: ruleCollectionItem returns [EObject current=null] : ( (lv_item_0_0= ruleOCLExpressionCS ) ) ;
    public final EObject ruleCollectionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_item_0_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:7045:2: ( ( (lv_item_0_0= ruleOCLExpressionCS ) ) )
            // InternalECModel.g:7046:2: ( (lv_item_0_0= ruleOCLExpressionCS ) )
            {
            // InternalECModel.g:7046:2: ( (lv_item_0_0= ruleOCLExpressionCS ) )
            // InternalECModel.g:7047:3: (lv_item_0_0= ruleOCLExpressionCS )
            {
            // InternalECModel.g:7047:3: (lv_item_0_0= ruleOCLExpressionCS )
            // InternalECModel.g:7048:4: lv_item_0_0= ruleOCLExpressionCS
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getCollectionItemAccess().getItemOCLExpressionCSParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_item_0_0=ruleOCLExpressionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getCollectionItemRule());
              				}
              				set(
              					current,
              					"item",
              					lv_item_0_0,
              					"org.xtext.example.edgecloudmodel.ECModel.OCLExpressionCS");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionItem"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalECModel.g:7068:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalECModel.g:7068:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalECModel.g:7069:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // InternalECModel.g:7075:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_InvalidLiteralExpCS_3= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_4= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_InvalidLiteralExpCS_3 = null;

        EObject this_NullLiteralExpCS_4 = null;



        	enterRule();

        try {
            // InternalECModel.g:7081:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_InvalidLiteralExpCS_3= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_4= ruleNullLiteralExpCS ) )
            // InternalECModel.g:7082:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_InvalidLiteralExpCS_3= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_4= ruleNullLiteralExpCS )
            {
            // InternalECModel.g:7082:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_InvalidLiteralExpCS_3= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_4= ruleNullLiteralExpCS )
            int alt128=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 60:
                {
                alt128=1;
                }
                break;
            case RULE_DOUBLE_QUOTED_STRING:
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt128=2;
                }
                break;
            case 123:
            case 124:
                {
                alt128=3;
                }
                break;
            case 126:
                {
                alt128=4;
                }
                break;
            case 125:
                {
                alt128=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // InternalECModel.g:7083:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:7092:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteralExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:7101:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:7110:3: this_InvalidLiteralExpCS_3= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvalidLiteralExpCS_3=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvalidLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:7119:3: this_NullLiteralExpCS_4= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExpCS_4=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // InternalECModel.g:7131:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalECModel.g:7131:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalECModel.g:7132:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // InternalECModel.g:7138:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_1= ruleIntegerLiteralExpCS | lv_symbol_0_2= ruleRealLiteralExpCS | lv_symbol_0_3= ruleUnlimitedNaturalLiteralExpCS ) ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_1 = null;

        AntlrDatatypeRuleToken lv_symbol_0_2 = null;

        AntlrDatatypeRuleToken lv_symbol_0_3 = null;



        	enterRule();

        try {
            // InternalECModel.g:7144:2: ( ( ( (lv_symbol_0_1= ruleIntegerLiteralExpCS | lv_symbol_0_2= ruleRealLiteralExpCS | lv_symbol_0_3= ruleUnlimitedNaturalLiteralExpCS ) ) ) )
            // InternalECModel.g:7145:2: ( ( (lv_symbol_0_1= ruleIntegerLiteralExpCS | lv_symbol_0_2= ruleRealLiteralExpCS | lv_symbol_0_3= ruleUnlimitedNaturalLiteralExpCS ) ) )
            {
            // InternalECModel.g:7145:2: ( ( (lv_symbol_0_1= ruleIntegerLiteralExpCS | lv_symbol_0_2= ruleRealLiteralExpCS | lv_symbol_0_3= ruleUnlimitedNaturalLiteralExpCS ) ) )
            // InternalECModel.g:7146:3: ( (lv_symbol_0_1= ruleIntegerLiteralExpCS | lv_symbol_0_2= ruleRealLiteralExpCS | lv_symbol_0_3= ruleUnlimitedNaturalLiteralExpCS ) )
            {
            // InternalECModel.g:7146:3: ( (lv_symbol_0_1= ruleIntegerLiteralExpCS | lv_symbol_0_2= ruleRealLiteralExpCS | lv_symbol_0_3= ruleUnlimitedNaturalLiteralExpCS ) )
            // InternalECModel.g:7147:4: (lv_symbol_0_1= ruleIntegerLiteralExpCS | lv_symbol_0_2= ruleRealLiteralExpCS | lv_symbol_0_3= ruleUnlimitedNaturalLiteralExpCS )
            {
            // InternalECModel.g:7147:4: (lv_symbol_0_1= ruleIntegerLiteralExpCS | lv_symbol_0_2= ruleRealLiteralExpCS | lv_symbol_0_3= ruleUnlimitedNaturalLiteralExpCS )
            int alt129=3;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_INT) ) {
                int LA129_1 = input.LA(2);

                if ( (LA129_1==EOF||LA129_1==14||LA129_1==19||LA129_1==40||LA129_1==60||(LA129_1>=64 && LA129_1<=65)||LA129_1==67||(LA129_1>=72 && LA129_1<=75)||(LA129_1>=82 && LA129_1<=84)||(LA129_1>=116 && LA129_1<=118)||LA129_1==120||LA129_1==122) ) {
                    alt129=1;
                }
                else if ( (LA129_1==92) ) {
                    alt129=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA129_0==60) ) {
                alt129=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalECModel.g:7148:5: lv_symbol_0_1= ruleIntegerLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolIntegerLiteralExpCSParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_symbol_0_1=ruleIntegerLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
                      					}
                      					set(
                      						current,
                      						"symbol",
                      						lv_symbol_0_1,
                      						"org.xtext.example.edgecloudmodel.ECModel.IntegerLiteralExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:7164:5: lv_symbol_0_2= ruleRealLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolRealLiteralExpCSParserRuleCall_0_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_symbol_0_2=ruleRealLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
                      					}
                      					set(
                      						current,
                      						"symbol",
                      						lv_symbol_0_2,
                      						"org.xtext.example.edgecloudmodel.ECModel.RealLiteralExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:7180:5: lv_symbol_0_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolUnlimitedNaturalLiteralExpCSParserRuleCall_0_2());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_symbol_0_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
                      					}
                      					set(
                      						current,
                      						"symbol",
                      						lv_symbol_0_3,
                      						"org.xtext.example.edgecloudmodel.ECModel.UnlimitedNaturalLiteralExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleIntegerLiteralExpCS"
    // InternalECModel.g:7201:1: entryRuleIntegerLiteralExpCS returns [String current=null] : iv_ruleIntegerLiteralExpCS= ruleIntegerLiteralExpCS EOF ;
    public final String entryRuleIntegerLiteralExpCS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteralExpCS = null;


        try {
            // InternalECModel.g:7201:59: (iv_ruleIntegerLiteralExpCS= ruleIntegerLiteralExpCS EOF )
            // InternalECModel.g:7202:2: iv_ruleIntegerLiteralExpCS= ruleIntegerLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteralExpCS=ruleIntegerLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteralExpCS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerLiteralExpCS"


    // $ANTLR start "ruleIntegerLiteralExpCS"
    // InternalECModel.g:7208:1: ruleIntegerLiteralExpCS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteralExpCS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalECModel.g:7214:2: (this_INT_0= RULE_INT )
            // InternalECModel.g:7215:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getIntegerLiteralExpCSAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerLiteralExpCS"


    // $ANTLR start "entryRuleRealLiteralExpCS"
    // InternalECModel.g:7225:1: entryRuleRealLiteralExpCS returns [String current=null] : iv_ruleRealLiteralExpCS= ruleRealLiteralExpCS EOF ;
    public final String entryRuleRealLiteralExpCS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealLiteralExpCS = null;


        try {
            // InternalECModel.g:7225:56: (iv_ruleRealLiteralExpCS= ruleRealLiteralExpCS EOF )
            // InternalECModel.g:7226:2: iv_ruleRealLiteralExpCS= ruleRealLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteralExpCS=ruleRealLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteralExpCS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealLiteralExpCS"


    // $ANTLR start "ruleRealLiteralExpCS"
    // InternalECModel.g:7232:1: ruleRealLiteralExpCS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Float_0= ruleFloat ;
    public final AntlrDatatypeRuleToken ruleRealLiteralExpCS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Float_0 = null;



        	enterRule();

        try {
            // InternalECModel.g:7238:2: (this_Float_0= ruleFloat )
            // InternalECModel.g:7239:2: this_Float_0= ruleFloat
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getRealLiteralExpCSAccess().getFloatParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Float_0=ruleFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Float_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRealLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // InternalECModel.g:7252:1: entryRuleUnlimitedNaturalLiteralExpCS returns [String current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final String entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalECModel.g:7252:68: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalECModel.g:7253:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // InternalECModel.g:7259:1: ruleUnlimitedNaturalLiteralExpCS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalECModel.g:7265:2: (kw= '*' )
            // InternalECModel.g:7266:2: kw= '*'
            {
            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // InternalECModel.g:7274:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalECModel.g:7274:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalECModel.g:7275:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // InternalECModel.g:7281:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_1= 'true' | lv_symbol_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_1=null;
        Token lv_symbol_0_2=null;


        	enterRule();

        try {
            // InternalECModel.g:7287:2: ( ( ( (lv_symbol_0_1= 'true' | lv_symbol_0_2= 'false' ) ) ) )
            // InternalECModel.g:7288:2: ( ( (lv_symbol_0_1= 'true' | lv_symbol_0_2= 'false' ) ) )
            {
            // InternalECModel.g:7288:2: ( ( (lv_symbol_0_1= 'true' | lv_symbol_0_2= 'false' ) ) )
            // InternalECModel.g:7289:3: ( (lv_symbol_0_1= 'true' | lv_symbol_0_2= 'false' ) )
            {
            // InternalECModel.g:7289:3: ( (lv_symbol_0_1= 'true' | lv_symbol_0_2= 'false' ) )
            // InternalECModel.g:7290:4: (lv_symbol_0_1= 'true' | lv_symbol_0_2= 'false' )
            {
            // InternalECModel.g:7290:4: (lv_symbol_0_1= 'true' | lv_symbol_0_2= 'false' )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==123) ) {
                alt130=1;
            }
            else if ( (LA130_0==124) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // InternalECModel.g:7291:5: lv_symbol_0_1= 'true'
                    {
                    lv_symbol_0_1=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_1, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:7302:5: lv_symbol_0_2= 'false'
                    {
                    lv_symbol_0_2=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_2, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolFalseKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_0_2, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // InternalECModel.g:7318:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalECModel.g:7318:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalECModel.g:7319:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // InternalECModel.g:7325:1: ruleStringLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_1= RULE_SINGLE_QUOTED_STRING | lv_symbol_0_2= RULE_DOUBLE_QUOTED_STRING ) ) ) ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_1=null;
        Token lv_symbol_0_2=null;


        	enterRule();

        try {
            // InternalECModel.g:7331:2: ( ( ( (lv_symbol_0_1= RULE_SINGLE_QUOTED_STRING | lv_symbol_0_2= RULE_DOUBLE_QUOTED_STRING ) ) ) )
            // InternalECModel.g:7332:2: ( ( (lv_symbol_0_1= RULE_SINGLE_QUOTED_STRING | lv_symbol_0_2= RULE_DOUBLE_QUOTED_STRING ) ) )
            {
            // InternalECModel.g:7332:2: ( ( (lv_symbol_0_1= RULE_SINGLE_QUOTED_STRING | lv_symbol_0_2= RULE_DOUBLE_QUOTED_STRING ) ) )
            // InternalECModel.g:7333:3: ( (lv_symbol_0_1= RULE_SINGLE_QUOTED_STRING | lv_symbol_0_2= RULE_DOUBLE_QUOTED_STRING ) )
            {
            // InternalECModel.g:7333:3: ( (lv_symbol_0_1= RULE_SINGLE_QUOTED_STRING | lv_symbol_0_2= RULE_DOUBLE_QUOTED_STRING ) )
            // InternalECModel.g:7334:4: (lv_symbol_0_1= RULE_SINGLE_QUOTED_STRING | lv_symbol_0_2= RULE_DOUBLE_QUOTED_STRING )
            {
            // InternalECModel.g:7334:4: (lv_symbol_0_1= RULE_SINGLE_QUOTED_STRING | lv_symbol_0_2= RULE_DOUBLE_QUOTED_STRING )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt131=1;
            }
            else if ( (LA131_0==RULE_DOUBLE_QUOTED_STRING) ) {
                alt131=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // InternalECModel.g:7335:5: lv_symbol_0_1= RULE_SINGLE_QUOTED_STRING
                    {
                    lv_symbol_0_1=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_1, grammarAccess.getStringLiteralExpCSAccess().getSymbolSINGLE_QUOTED_STRINGTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStringLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"symbol",
                      						lv_symbol_0_1,
                      						"org.xtext.example.edgecloudmodel.ECModel.SINGLE_QUOTED_STRING");
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:7350:5: lv_symbol_0_2= RULE_DOUBLE_QUOTED_STRING
                    {
                    lv_symbol_0_2=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_2, grammarAccess.getStringLiteralExpCSAccess().getSymbolDOUBLE_QUOTED_STRINGTerminalRuleCall_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getStringLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"symbol",
                      						lv_symbol_0_2,
                      						"org.xtext.example.edgecloudmodel.ECModel.DOUBLE_QUOTED_STRING");
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // InternalECModel.g:7370:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalECModel.g:7370:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalECModel.g:7371:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // InternalECModel.g:7377:1: ruleNullLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= 'null' ) ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;


        	enterRule();

        try {
            // InternalECModel.g:7383:2: ( ( (lv_symbol_0_0= 'null' ) ) )
            // InternalECModel.g:7384:2: ( (lv_symbol_0_0= 'null' ) )
            {
            // InternalECModel.g:7384:2: ( (lv_symbol_0_0= 'null' ) )
            // InternalECModel.g:7385:3: (lv_symbol_0_0= 'null' )
            {
            // InternalECModel.g:7385:3: (lv_symbol_0_0= 'null' )
            // InternalECModel.g:7386:4: lv_symbol_0_0= 'null'
            {
            lv_symbol_0_0=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_symbol_0_0, grammarAccess.getNullLiteralExpCSAccess().getSymbolNullKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNullLiteralExpCSRule());
              				}
              				setWithLastConsumed(current, "symbol", lv_symbol_0_0, "null");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // InternalECModel.g:7401:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalECModel.g:7401:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalECModel.g:7402:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // InternalECModel.g:7408:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= 'invalid' ) ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;


        	enterRule();

        try {
            // InternalECModel.g:7414:2: ( ( (lv_symbol_0_0= 'invalid' ) ) )
            // InternalECModel.g:7415:2: ( (lv_symbol_0_0= 'invalid' ) )
            {
            // InternalECModel.g:7415:2: ( (lv_symbol_0_0= 'invalid' ) )
            // InternalECModel.g:7416:3: (lv_symbol_0_0= 'invalid' )
            {
            // InternalECModel.g:7416:3: (lv_symbol_0_0= 'invalid' )
            // InternalECModel.g:7417:4: lv_symbol_0_0= 'invalid'
            {
            lv_symbol_0_0=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_symbol_0_0, grammarAccess.getInvalidLiteralExpCSAccess().getSymbolInvalidKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getInvalidLiteralExpCSRule());
              				}
              				setWithLastConsumed(current, "symbol", lv_symbol_0_0, "invalid");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleFloat"
    // InternalECModel.g:7432:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalECModel.g:7432:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalECModel.g:7433:2: iv_ruleFloat= ruleFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalECModel.g:7439:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalECModel.g:7445:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalECModel.g:7446:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalECModel.g:7446:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalECModel.g:7447:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,92,FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleCollectionTypeIdentifierCS"
    // InternalECModel.g:7470:1: entryRuleCollectionTypeIdentifierCS returns [EObject current=null] : iv_ruleCollectionTypeIdentifierCS= ruleCollectionTypeIdentifierCS EOF ;
    public final EObject entryRuleCollectionTypeIdentifierCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeIdentifierCS = null;


        try {
            // InternalECModel.g:7470:67: (iv_ruleCollectionTypeIdentifierCS= ruleCollectionTypeIdentifierCS EOF )
            // InternalECModel.g:7471:2: iv_ruleCollectionTypeIdentifierCS= ruleCollectionTypeIdentifierCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeIdentifierCS=ruleCollectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifierCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeIdentifierCS"


    // $ANTLR start "ruleCollectionTypeIdentifierCS"
    // InternalECModel.g:7477:1: ruleCollectionTypeIdentifierCS returns [EObject current=null] : ( ( (lv_name_0_1= 'Set' | lv_name_0_2= 'Bag' | lv_name_0_3= 'Sequence' | lv_name_0_4= 'Collection' | lv_name_0_5= 'OrderedSet' ) ) ) ;
    public final EObject ruleCollectionTypeIdentifierCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;


        	enterRule();

        try {
            // InternalECModel.g:7483:2: ( ( ( (lv_name_0_1= 'Set' | lv_name_0_2= 'Bag' | lv_name_0_3= 'Sequence' | lv_name_0_4= 'Collection' | lv_name_0_5= 'OrderedSet' ) ) ) )
            // InternalECModel.g:7484:2: ( ( (lv_name_0_1= 'Set' | lv_name_0_2= 'Bag' | lv_name_0_3= 'Sequence' | lv_name_0_4= 'Collection' | lv_name_0_5= 'OrderedSet' ) ) )
            {
            // InternalECModel.g:7484:2: ( ( (lv_name_0_1= 'Set' | lv_name_0_2= 'Bag' | lv_name_0_3= 'Sequence' | lv_name_0_4= 'Collection' | lv_name_0_5= 'OrderedSet' ) ) )
            // InternalECModel.g:7485:3: ( (lv_name_0_1= 'Set' | lv_name_0_2= 'Bag' | lv_name_0_3= 'Sequence' | lv_name_0_4= 'Collection' | lv_name_0_5= 'OrderedSet' ) )
            {
            // InternalECModel.g:7485:3: ( (lv_name_0_1= 'Set' | lv_name_0_2= 'Bag' | lv_name_0_3= 'Sequence' | lv_name_0_4= 'Collection' | lv_name_0_5= 'OrderedSet' ) )
            // InternalECModel.g:7486:4: (lv_name_0_1= 'Set' | lv_name_0_2= 'Bag' | lv_name_0_3= 'Sequence' | lv_name_0_4= 'Collection' | lv_name_0_5= 'OrderedSet' )
            {
            // InternalECModel.g:7486:4: (lv_name_0_1= 'Set' | lv_name_0_2= 'Bag' | lv_name_0_3= 'Sequence' | lv_name_0_4= 'Collection' | lv_name_0_5= 'OrderedSet' )
            int alt132=5;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt132=1;
                }
                break;
            case 128:
                {
                alt132=2;
                }
                break;
            case 129:
                {
                alt132=3;
                }
                break;
            case 130:
                {
                alt132=4;
                }
                break;
            case 131:
                {
                alt132=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalECModel.g:7487:5: lv_name_0_1= 'Set'
                    {
                    lv_name_0_1=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getCollectionTypeIdentifierCSAccess().getNameSetKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCollectionTypeIdentifierCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:7498:5: lv_name_0_2= 'Bag'
                    {
                    lv_name_0_2=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getCollectionTypeIdentifierCSAccess().getNameBagKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCollectionTypeIdentifierCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:7509:5: lv_name_0_3= 'Sequence'
                    {
                    lv_name_0_3=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_3, grammarAccess.getCollectionTypeIdentifierCSAccess().getNameSequenceKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCollectionTypeIdentifierCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:7520:5: lv_name_0_4= 'Collection'
                    {
                    lv_name_0_4=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_4, grammarAccess.getCollectionTypeIdentifierCSAccess().getNameCollectionKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCollectionTypeIdentifierCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:7531:5: lv_name_0_5= 'OrderedSet'
                    {
                    lv_name_0_5=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_5, grammarAccess.getCollectionTypeIdentifierCSAccess().getNameOrderedSetKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCollectionTypeIdentifierCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_5, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionTypeIdentifierCS"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // InternalECModel.g:7547:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalECModel.g:7547:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalECModel.g:7548:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // InternalECModel.g:7554:1: rulePrimitiveTypeCS returns [EObject current=null] : ( ( (lv_name_0_1= 'Boolean' | lv_name_0_2= 'Integer' | lv_name_0_3= 'Real' | lv_name_0_4= 'String' | lv_name_0_5= 'UnlimitedNatural' | lv_name_0_6= 'Date' ) ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;


        	enterRule();

        try {
            // InternalECModel.g:7560:2: ( ( ( (lv_name_0_1= 'Boolean' | lv_name_0_2= 'Integer' | lv_name_0_3= 'Real' | lv_name_0_4= 'String' | lv_name_0_5= 'UnlimitedNatural' | lv_name_0_6= 'Date' ) ) ) )
            // InternalECModel.g:7561:2: ( ( (lv_name_0_1= 'Boolean' | lv_name_0_2= 'Integer' | lv_name_0_3= 'Real' | lv_name_0_4= 'String' | lv_name_0_5= 'UnlimitedNatural' | lv_name_0_6= 'Date' ) ) )
            {
            // InternalECModel.g:7561:2: ( ( (lv_name_0_1= 'Boolean' | lv_name_0_2= 'Integer' | lv_name_0_3= 'Real' | lv_name_0_4= 'String' | lv_name_0_5= 'UnlimitedNatural' | lv_name_0_6= 'Date' ) ) )
            // InternalECModel.g:7562:3: ( (lv_name_0_1= 'Boolean' | lv_name_0_2= 'Integer' | lv_name_0_3= 'Real' | lv_name_0_4= 'String' | lv_name_0_5= 'UnlimitedNatural' | lv_name_0_6= 'Date' ) )
            {
            // InternalECModel.g:7562:3: ( (lv_name_0_1= 'Boolean' | lv_name_0_2= 'Integer' | lv_name_0_3= 'Real' | lv_name_0_4= 'String' | lv_name_0_5= 'UnlimitedNatural' | lv_name_0_6= 'Date' ) )
            // InternalECModel.g:7563:4: (lv_name_0_1= 'Boolean' | lv_name_0_2= 'Integer' | lv_name_0_3= 'Real' | lv_name_0_4= 'String' | lv_name_0_5= 'UnlimitedNatural' | lv_name_0_6= 'Date' )
            {
            // InternalECModel.g:7563:4: (lv_name_0_1= 'Boolean' | lv_name_0_2= 'Integer' | lv_name_0_3= 'Real' | lv_name_0_4= 'String' | lv_name_0_5= 'UnlimitedNatural' | lv_name_0_6= 'Date' )
            int alt133=6;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt133=1;
                }
                break;
            case 133:
                {
                alt133=2;
                }
                break;
            case 134:
                {
                alt133=3;
                }
                break;
            case 135:
                {
                alt133=4;
                }
                break;
            case 136:
                {
                alt133=5;
                }
                break;
            case 137:
                {
                alt133=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // InternalECModel.g:7564:5: lv_name_0_1= 'Boolean'
                    {
                    lv_name_0_1=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getPrimitiveTypeCSAccess().getNameBooleanKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:7575:5: lv_name_0_2= 'Integer'
                    {
                    lv_name_0_2=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getPrimitiveTypeCSAccess().getNameIntegerKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:7586:5: lv_name_0_3= 'Real'
                    {
                    lv_name_0_3=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_3, grammarAccess.getPrimitiveTypeCSAccess().getNameRealKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalECModel.g:7597:5: lv_name_0_4= 'String'
                    {
                    lv_name_0_4=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_4, grammarAccess.getPrimitiveTypeCSAccess().getNameStringKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalECModel.g:7608:5: lv_name_0_5= 'UnlimitedNatural'
                    {
                    lv_name_0_5=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_5, grammarAccess.getPrimitiveTypeCSAccess().getNameUnlimitedNaturalKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_5, null);
                      				
                    }

                    }
                    break;
                case 6 :
                    // InternalECModel.g:7619:5: lv_name_0_6= 'Date'
                    {
                    lv_name_0_6=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_6, grammarAccess.getPrimitiveTypeCSAccess().getNameDateKeyword_0_5());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_6, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleOclTypeCS"
    // InternalECModel.g:7635:1: entryRuleOclTypeCS returns [EObject current=null] : iv_ruleOclTypeCS= ruleOclTypeCS EOF ;
    public final EObject entryRuleOclTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclTypeCS = null;


        try {
            // InternalECModel.g:7635:50: (iv_ruleOclTypeCS= ruleOclTypeCS EOF )
            // InternalECModel.g:7636:2: iv_ruleOclTypeCS= ruleOclTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOclTypeCS=ruleOclTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOclTypeCS"


    // $ANTLR start "ruleOclTypeCS"
    // InternalECModel.g:7642:1: ruleOclTypeCS returns [EObject current=null] : ( ( (lv_name_0_1= 'OclAny' | lv_name_0_2= 'OclInvalid' | lv_name_0_3= 'OclVoid' ) ) ) ;
    public final EObject ruleOclTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalECModel.g:7648:2: ( ( ( (lv_name_0_1= 'OclAny' | lv_name_0_2= 'OclInvalid' | lv_name_0_3= 'OclVoid' ) ) ) )
            // InternalECModel.g:7649:2: ( ( (lv_name_0_1= 'OclAny' | lv_name_0_2= 'OclInvalid' | lv_name_0_3= 'OclVoid' ) ) )
            {
            // InternalECModel.g:7649:2: ( ( (lv_name_0_1= 'OclAny' | lv_name_0_2= 'OclInvalid' | lv_name_0_3= 'OclVoid' ) ) )
            // InternalECModel.g:7650:3: ( (lv_name_0_1= 'OclAny' | lv_name_0_2= 'OclInvalid' | lv_name_0_3= 'OclVoid' ) )
            {
            // InternalECModel.g:7650:3: ( (lv_name_0_1= 'OclAny' | lv_name_0_2= 'OclInvalid' | lv_name_0_3= 'OclVoid' ) )
            // InternalECModel.g:7651:4: (lv_name_0_1= 'OclAny' | lv_name_0_2= 'OclInvalid' | lv_name_0_3= 'OclVoid' )
            {
            // InternalECModel.g:7651:4: (lv_name_0_1= 'OclAny' | lv_name_0_2= 'OclInvalid' | lv_name_0_3= 'OclVoid' )
            int alt134=3;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt134=1;
                }
                break;
            case 139:
                {
                alt134=2;
                }
                break;
            case 140:
                {
                alt134=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // InternalECModel.g:7652:5: lv_name_0_1= 'OclAny'
                    {
                    lv_name_0_1=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_1, grammarAccess.getOclTypeCSAccess().getNameOclAnyKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOclTypeCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:7663:5: lv_name_0_2= 'OclInvalid'
                    {
                    lv_name_0_2=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_2, grammarAccess.getOclTypeCSAccess().getNameOclInvalidKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOclTypeCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:7674:5: lv_name_0_3= 'OclVoid'
                    {
                    lv_name_0_3=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_3, grammarAccess.getOclTypeCSAccess().getNameOclVoidKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOclTypeCSRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_3, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOclTypeCS"


    // $ANTLR start "entryRuleAssociationTypeCS"
    // InternalECModel.g:7690:1: entryRuleAssociationTypeCS returns [String current=null] : iv_ruleAssociationTypeCS= ruleAssociationTypeCS EOF ;
    public final String entryRuleAssociationTypeCS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssociationTypeCS = null;


        try {
            // InternalECModel.g:7690:57: (iv_ruleAssociationTypeCS= ruleAssociationTypeCS EOF )
            // InternalECModel.g:7691:2: iv_ruleAssociationTypeCS= ruleAssociationTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssociationTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssociationTypeCS=ruleAssociationTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssociationTypeCS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssociationTypeCS"


    // $ANTLR start "ruleAssociationTypeCS"
    // InternalECModel.g:7697:1: ruleAssociationTypeCS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Association' | kw= 'Aggregation' | kw= 'Composition' ) ;
    public final AntlrDatatypeRuleToken ruleAssociationTypeCS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalECModel.g:7703:2: ( (kw= 'Association' | kw= 'Aggregation' | kw= 'Composition' ) )
            // InternalECModel.g:7704:2: (kw= 'Association' | kw= 'Aggregation' | kw= 'Composition' )
            {
            // InternalECModel.g:7704:2: (kw= 'Association' | kw= 'Aggregation' | kw= 'Composition' )
            int alt135=3;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt135=1;
                }
                break;
            case 142:
                {
                alt135=2;
                }
                break;
            case 143:
                {
                alt135=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // InternalECModel.g:7705:3: kw= 'Association'
                    {
                    kw=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssociationTypeCSAccess().getAssociationKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalECModel.g:7711:3: kw= 'Aggregation'
                    {
                    kw=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssociationTypeCSAccess().getAggregationKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalECModel.g:7717:3: kw= 'Composition'
                    {
                    kw=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssociationTypeCSAccess().getCompositionKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssociationTypeCS"

    // $ANTLR start synpred1_InternalECModel
    public final void synpred1_InternalECModel_fragment() throws RecognitionException {   
        // InternalECModel.g:4290:5: ( 'and' | 'or' )
        // InternalECModel.g:
        {
        if ( (input.LA(1)>=74 && input.LA(1)<=75) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalECModel

    // $ANTLR start synpred2_InternalECModel
    public final void synpred2_InternalECModel_fragment() throws RecognitionException {   
        // InternalECModel.g:4905:4: ( 'self' | 'result' | 'if' | RULE_ID )
        // InternalECModel.g:
        {
        if ( input.LA(1)==RULE_ID||(input.LA(1)>=113 && input.LA(1)<=115) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred2_InternalECModel

    // $ANTLR start synpred3_InternalECModel
    public final void synpred3_InternalECModel_fragment() throws RecognitionException {   
        // InternalECModel.g:6897:5: ( ',' )
        // InternalECModel.g:6897:6: ','
        {
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalECModel

    // $ANTLR start synpred4_InternalECModel
    public final void synpred4_InternalECModel_fragment() throws RecognitionException {   
        // InternalECModel.g:6956:4: ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )
        // InternalECModel.g:
        {
        if ( (input.LA(1)>=RULE_DOUBLE_QUOTED_STRING && input.LA(1)<=RULE_INT)||input.LA(1)==21||input.LA(1)==60||(input.LA(1)>=113 && input.LA(1)<=115)||input.LA(1)==119||input.LA(1)==121||(input.LA(1)>=123 && input.LA(1)<=131) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred4_InternalECModel

    // Delegated rules

    public final boolean synpred4_InternalECModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalECModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalECModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalECModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalECModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalECModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalECModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalECModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA92 dfa92 = new DFA92(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA127 dfa127 = new DFA127(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\12\uffff\2\7\3\uffff\2\7\1\uffff\1\7";
    static final String dfa_3s = "\1\5\2\134\1\25\2\5\1\125\1\uffff\2\134\2\16\1\uffff\1\5\1\160\2\16\1\160\1\16";
    static final String dfa_4s = "\1\162\3\134\2\162\1\150\1\uffff\2\157\2\172\1\uffff\1\155\1\160\2\172\1\160\1\172";
    static final String dfa_5s = "\7\uffff\1\1\4\uffff\1\2\6\uffff";
    static final String dfa_6s = "\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\153\uffff\1\1\1\2",
            "\1\4",
            "\1\4",
            "\1\7\1\6\105\uffff\1\5",
            "\1\12\127\uffff\10\7\4\uffff\5\7\3\uffff\1\10\1\11",
            "\1\12\127\uffff\10\7\4\uffff\5\7\1\13\2\uffff\1\10\1\11",
            "\7\14\11\uffff\4\7",
            "",
            "\1\15\22\uffff\1\7",
            "\1\15\22\uffff\1\7",
            "\1\7\4\uffff\1\7\2\uffff\1\6\21\uffff\1\7\23\uffff\1\7\3\uffff\2\7\1\uffff\1\7\4\uffff\15\7\7\uffff\1\15\22\uffff\1\16\4\uffff\3\7\1\uffff\1\7\1\uffff\1\7",
            "\1\7\4\uffff\1\7\2\uffff\1\6\21\uffff\1\7\23\uffff\1\7\3\uffff\2\7\1\uffff\1\7\4\uffff\15\7\37\uffff\3\7\1\uffff\1\7\1\uffff\1\7",
            "",
            "\1\17\127\uffff\10\7\4\uffff\5\7",
            "\1\20",
            "\1\7\4\uffff\1\7\2\uffff\1\6\21\uffff\1\7\23\uffff\1\7\3\uffff\2\7\1\uffff\1\7\4\uffff\15\7\32\uffff\1\21\4\uffff\3\7\1\uffff\1\7\1\uffff\1\7",
            "\1\7\4\uffff\1\7\2\uffff\1\6\21\uffff\1\7\23\uffff\1\7\3\uffff\2\7\1\uffff\1\7\4\uffff\15\7\7\uffff\1\7\27\uffff\3\7\1\uffff\1\7\1\uffff\1\7",
            "\1\22",
            "\1\7\4\uffff\1\7\2\uffff\1\6\21\uffff\1\7\23\uffff\1\7\3\uffff\2\7\1\uffff\1\7\4\uffff\15\7\37\uffff\3\7\1\uffff\1\7\1\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4706:2: (this_FeatureCallExpCS_0= ruleFeatureCallExpCS | this_LoopExpCS_1= ruleLoopExpCS )";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\12\uffff\1\17\1\uffff\1\20\4\uffff\2\17\1\uffff\1\17";
    static final String dfa_10s = "\1\5\2\134\1\25\1\5\1\uffff\1\5\1\uffff\2\134\1\16\1\uffff\1\16\1\5\1\160\2\uffff\2\16\1\160\1\16";
    static final String dfa_11s = "\1\162\3\134\1\162\1\uffff\1\162\1\uffff\2\157\1\172\1\uffff\1\172\1\155\1\160\2\uffff\2\172\1\160\1\172";
    static final String dfa_12s = "\5\uffff\1\4\1\uffff\1\5\3\uffff\1\3\3\uffff\1\1\1\2\4\uffff";
    static final String dfa_13s = "\25\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\153\uffff\1\1\1\2",
            "\1\4",
            "\1\4",
            "\1\7\1\5\105\uffff\1\6",
            "\1\12\127\uffff\10\13\4\uffff\5\13\3\uffff\1\10\1\11",
            "",
            "\1\12\127\uffff\10\13\4\uffff\5\13\1\14\2\uffff\1\10\1\11",
            "",
            "\1\15\22\uffff\1\13",
            "\1\15\22\uffff\1\13",
            "\1\17\4\uffff\1\17\2\uffff\1\5\21\uffff\1\17\23\uffff\1\17\3\uffff\2\17\1\uffff\1\17\4\uffff\15\17\7\uffff\1\15\22\uffff\1\16\4\uffff\3\17\1\uffff\1\17\1\uffff\1\17",
            "",
            "\1\20\4\uffff\1\20\2\uffff\1\5\21\uffff\1\20\23\uffff\1\20\3\uffff\2\20\1\uffff\1\20\4\uffff\15\20\37\uffff\3\20\1\uffff\1\20\1\uffff\1\20",
            "\1\21\127\uffff\10\13\4\uffff\5\13",
            "\1\22",
            "",
            "",
            "\1\17\4\uffff\1\17\2\uffff\1\5\21\uffff\1\17\23\uffff\1\17\3\uffff\2\17\1\uffff\1\17\4\uffff\15\17\32\uffff\1\23\4\uffff\3\17\1\uffff\1\17\1\uffff\1\17",
            "\1\17\4\uffff\1\17\2\uffff\1\5\21\uffff\1\17\23\uffff\1\17\3\uffff\2\17\1\uffff\1\17\4\uffff\15\17\7\uffff\1\13\27\uffff\3\17\1\uffff\1\17\1\uffff\1\17",
            "\1\24",
            "\1\17\4\uffff\1\17\2\uffff\1\5\21\uffff\1\17\23\uffff\1\17\3\uffff\2\17\1\uffff\1\17\4\uffff\15\17\37\uffff\3\17\1\uffff\1\17\1\uffff\1\17"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "5087:2: (this_PropertyCallExpCS_0= rulePropertyCallExpCS | this_ClassiferCallExpCS_1= ruleClassiferCallExpCS | this_StandardOperationExpCS_2= ruleStandardOperationExpCS | this_StandardNavigationCallExpCS_3= ruleStandardNavigationCallExpCS | this_OperationCallExpCS_4= ruleOperationCallExpCS )";
        }
    }
    static final String dfa_15s = "\27\uffff";
    static final String dfa_16s = "\1\4\24\0\2\uffff";
    static final String dfa_17s = "\1\u0083\24\0\2\uffff";
    static final String dfa_18s = "\25\uffff\1\1\1\2";
    static final String dfa_19s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\2\uffff}>";
    static final String[] dfa_20s = {
            "\1\12\1\17\1\11\1\7\15\uffff\1\24\46\uffff\1\10\64\uffff\1\22\1\23\1\21\3\uffff\1\20\1\uffff\1\6\1\uffff\1\13\1\14\1\16\1\15\1\1\1\2\1\3\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA127 extends DFA {

        public DFA127(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 127;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "6945:2: (this_CollectionRangeCS_0= ruleCollectionRangeCS | ( ( 'Set' | 'Bag' | 'Sequence' | 'Collection' | 'OrderedSet' | 'Tuple' | '*' | 'true' | 'false' | 'invalid' | 'null' | 'let' | 'if' | 'self' | 'result' | '(' | RULE_INT | RULE_SINGLE_QUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_ID )=>this_CollectionItem_1= ruleCollectionItem ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA127_1 = input.LA(1);

                         
                        int index127_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA127_2 = input.LA(1);

                         
                        int index127_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA127_3 = input.LA(1);

                         
                        int index127_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA127_4 = input.LA(1);

                         
                        int index127_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA127_5 = input.LA(1);

                         
                        int index127_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA127_6 = input.LA(1);

                         
                        int index127_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA127_7 = input.LA(1);

                         
                        int index127_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA127_8 = input.LA(1);

                         
                        int index127_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA127_9 = input.LA(1);

                         
                        int index127_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA127_10 = input.LA(1);

                         
                        int index127_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA127_11 = input.LA(1);

                         
                        int index127_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA127_12 = input.LA(1);

                         
                        int index127_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA127_13 = input.LA(1);

                         
                        int index127_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA127_14 = input.LA(1);

                         
                        int index127_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA127_15 = input.LA(1);

                         
                        int index127_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA127_16 = input.LA(1);

                         
                        int index127_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA127_17 = input.LA(1);

                         
                        int index127_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA127_18 = input.LA(1);

                         
                        int index127_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA127_19 = input.LA(1);

                         
                        int index127_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA127_20 = input.LA(1);

                         
                        int index127_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred4_InternalECModel()) ) {s = 22;}

                         
                        input.seek(index127_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 127, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000003C3980000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000003C3080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003C2080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000003C0080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0600000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000085000088000L,0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000081000088000L,0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000088000L,0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000210000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000082020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000060000206012L,0x0000000000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000060000006012L,0x0000000000000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000060000006002L,0x0000000000000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000060000002002L,0x0000000000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000070000002002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000002002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000F00000082000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000F00000080000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000E00000080020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000C00000080020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000080020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x006E000000680020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0180000000080000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000004020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000020L,0x8000000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800800000082020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800800000080020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x10000000002100F0L,0xFA8E000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x000000000003F000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x10000000000000F0L,0xFA06000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1000000000000002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x10000000000000F0L,0x7806000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x000000000FE00000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000020L,0x000E000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x000001E000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000020L,0x00063E1FE0000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000800010000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x00000000000003F0L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x10000000000000A0L,0x0006000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000020L,0x0006000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000010000004070L,0x0006000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000070L,0x0006000000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000010000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0001000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000010000080020L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x10000100002900F0L,0xFA8E000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000080L});

}