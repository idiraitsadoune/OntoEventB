package fr.cs.ontoeventb.pivotmodel.parser.antlr.internal;

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
import fr.cs.ontoeventb.pivotmodel.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Ontology'", "'{'", "'containedClasses'", "','", "'}'", "'containedProperties'", "'containedDataTypes'", "'SimpleClass'", "'subClassOf'", "'('", "')'", "'disjointWith'", "'equivalentTo'", "'describedBy'", "'CaseOfClass'", "'caseOf'", "'importedProperties'", "'UniversalClass'", "'onProperty'", "'toDataDefinition'", "'ExistantialClass'", "'HasValueClass'", "'MaxCardinalityClass'", "'maxCard'", "'MinCardinalityClass'", "'minCard'", "'CardinalityClass'", "'card'", "'EnumeratedClass'", "'oneOf'", "'UnionClass'", "'combinationOf'", "'IntersectionClass'", "'ComplementClass'", "'-'", "'SingleValue'", "'isOfType'", "'isFunctional'", "'isSymmetric'", "'isTransitive'", "'isInverseFunctional'", "'SimpleProperty'", "'range'", "'subPropertyOf'", "'inverseOf'", "'domain'", "'ConditionProperty'", "'DependentProperty'", "'dependsOn'", "'NotNumericType'", "'basedOn'", "'NumericType'", "'MeasureType'", "'unit'", "'CurrencyType'", "'currency'", "'ClassType'", "'CollectionType'", "'is'", "'collectionOf'", "'EnumeratedType'", "'contains'", "'NumberEnumeratedType'", "'NamedUnit'", "'exponent'", "'DerivedUnit'", "'derivedUnitElement'", "'NonStandardUnit'", "'ConversionBasedUnit'", "'valueComponent'", "'unitComponent'", "'ContextDependentUnit'", "'StandardUnit'", "'prefix'", "'name'", "'DerivedUnitElement'", "'INTEGER'", "'NATURAL'", "'BOOLEAN'", "'STRING'", "'EXA'", "'PETA'", "'TERA'", "'GIGA'", "'MEGA'", "'KILO'", "'HECTO'", "'DECA'", "'DECI'", "'CENTI'", "'MILLI'", "'MICRO'", "'NANO'", "'PICO'", "'FEMTO'", "'ATTO'", "'METRE'", "'GRAM'", "'SECOND'", "'AMPERE'", "'KELVIN'", "'MOLE'", "'CANDELA'", "'RADIAN'", "'STERADIAN'", "'HERTZ'", "'NEWTON'", "'PASCAL'", "'JOULE'", "'WATT'", "'COULOMB'", "'VOLT'", "'FARAD'", "'OHM'", "'SIEMENS'", "'WEBER'", "'TESLA'", "'HENRY'", "'DEGREE_CELSIUS'", "'LUMEN'", "'LUX'", "'BECQUEREL'", "'GRAY'", "'SIEVERT'", "'EUR'", "'USD'", "'SUR'", "'JPY'", "'CNY'", "'CHF'", "'ARRAY'", "'SET'", "'BAG'", "'LIST'"
    };
    public static final int T__144=144;
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
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int T__48=48;
    public static final int T__49=49;
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
    public static final int T__11=11;
    public static final int T__99=99;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }



     	private DSLGrammarAccess grammarAccess;

        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Ontology";
       	}

       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOntology"
    // InternalDSL.g:65:1: entryRuleOntology returns [EObject current=null] : iv_ruleOntology= ruleOntology EOF ;
    public final EObject entryRuleOntology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntology = null;


        try {
            // InternalDSL.g:65:49: (iv_ruleOntology= ruleOntology EOF )
            // InternalDSL.g:66:2: iv_ruleOntology= ruleOntology EOF
            {
             newCompositeNode(grammarAccess.getOntologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntology=ruleOntology();

            state._fsp--;

             current =iv_ruleOntology; 
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
    // $ANTLR end "entryRuleOntology"


    // $ANTLR start "ruleOntology"
    // InternalDSL.g:72:1: ruleOntology returns [EObject current=null] : ( () otherlv_1= 'Ontology' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containedClasses' otherlv_5= '{' ( (lv_containedClasses_6_0= ruleClassDefinition ) ) (otherlv_7= ',' ( (lv_containedClasses_8_0= ruleClassDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'containedProperties' otherlv_11= '{' ( (lv_containedProperties_12_0= rulePropertyDefinition ) ) (otherlv_13= ',' ( (lv_containedProperties_14_0= rulePropertyDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedDataTypes' otherlv_17= '{' ( (lv_containedDataTypes_18_0= ruleDataTypeDefinition ) ) (otherlv_19= ',' ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleOntology() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_containedClasses_6_0 = null;

        EObject lv_containedClasses_8_0 = null;

        EObject lv_containedProperties_12_0 = null;

        EObject lv_containedProperties_14_0 = null;

        EObject lv_containedDataTypes_18_0 = null;

        EObject lv_containedDataTypes_20_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:78:2: ( ( () otherlv_1= 'Ontology' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containedClasses' otherlv_5= '{' ( (lv_containedClasses_6_0= ruleClassDefinition ) ) (otherlv_7= ',' ( (lv_containedClasses_8_0= ruleClassDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'containedProperties' otherlv_11= '{' ( (lv_containedProperties_12_0= rulePropertyDefinition ) ) (otherlv_13= ',' ( (lv_containedProperties_14_0= rulePropertyDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedDataTypes' otherlv_17= '{' ( (lv_containedDataTypes_18_0= ruleDataTypeDefinition ) ) (otherlv_19= ',' ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalDSL.g:79:2: ( () otherlv_1= 'Ontology' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containedClasses' otherlv_5= '{' ( (lv_containedClasses_6_0= ruleClassDefinition ) ) (otherlv_7= ',' ( (lv_containedClasses_8_0= ruleClassDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'containedProperties' otherlv_11= '{' ( (lv_containedProperties_12_0= rulePropertyDefinition ) ) (otherlv_13= ',' ( (lv_containedProperties_14_0= rulePropertyDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedDataTypes' otherlv_17= '{' ( (lv_containedDataTypes_18_0= ruleDataTypeDefinition ) ) (otherlv_19= ',' ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalDSL.g:79:2: ( () otherlv_1= 'Ontology' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containedClasses' otherlv_5= '{' ( (lv_containedClasses_6_0= ruleClassDefinition ) ) (otherlv_7= ',' ( (lv_containedClasses_8_0= ruleClassDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'containedProperties' otherlv_11= '{' ( (lv_containedProperties_12_0= rulePropertyDefinition ) ) (otherlv_13= ',' ( (lv_containedProperties_14_0= rulePropertyDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedDataTypes' otherlv_17= '{' ( (lv_containedDataTypes_18_0= ruleDataTypeDefinition ) ) (otherlv_19= ',' ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalDSL.g:80:3: () otherlv_1= 'Ontology' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containedClasses' otherlv_5= '{' ( (lv_containedClasses_6_0= ruleClassDefinition ) ) (otherlv_7= ',' ( (lv_containedClasses_8_0= ruleClassDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'containedProperties' otherlv_11= '{' ( (lv_containedProperties_12_0= rulePropertyDefinition ) ) (otherlv_13= ',' ( (lv_containedProperties_14_0= rulePropertyDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedDataTypes' otherlv_17= '{' ( (lv_containedDataTypes_18_0= ruleDataTypeDefinition ) ) (otherlv_19= ',' ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalDSL.g:80:3: ()
            // InternalDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologyAccess().getOntologyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologyAccess().getOntologyKeyword_1());
            		
            // InternalDSL.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:92:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getOntologyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:114:3: (otherlv_4= 'containedClasses' otherlv_5= '{' ( (lv_containedClasses_6_0= ruleClassDefinition ) ) (otherlv_7= ',' ( (lv_containedClasses_8_0= ruleClassDefinition ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:115:4: otherlv_4= 'containedClasses' otherlv_5= '{' ( (lv_containedClasses_6_0= ruleClassDefinition ) ) (otherlv_7= ',' ( (lv_containedClasses_8_0= ruleClassDefinition ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getOntologyAccess().getContainedClassesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getOntologyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDSL.g:123:4: ( (lv_containedClasses_6_0= ruleClassDefinition ) )
                    // InternalDSL.g:124:5: (lv_containedClasses_6_0= ruleClassDefinition )
                    {
                    // InternalDSL.g:124:5: (lv_containedClasses_6_0= ruleClassDefinition )
                    // InternalDSL.g:125:6: lv_containedClasses_6_0= ruleClassDefinition
                    {

                    						newCompositeNode(grammarAccess.getOntologyAccess().getContainedClassesClassDefinitionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_containedClasses_6_0=ruleClassDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologyRule());
                    						}
                    						add(
                    							current,
                    							"containedClasses",
                    							lv_containedClasses_6_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.ClassDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:142:4: (otherlv_7= ',' ( (lv_containedClasses_8_0= ruleClassDefinition ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDSL.g:143:5: otherlv_7= ',' ( (lv_containedClasses_8_0= ruleClassDefinition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOntologyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:147:5: ( (lv_containedClasses_8_0= ruleClassDefinition ) )
                    	    // InternalDSL.g:148:6: (lv_containedClasses_8_0= ruleClassDefinition )
                    	    {
                    	    // InternalDSL.g:148:6: (lv_containedClasses_8_0= ruleClassDefinition )
                    	    // InternalDSL.g:149:7: lv_containedClasses_8_0= ruleClassDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologyAccess().getContainedClassesClassDefinitionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_containedClasses_8_0=ruleClassDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containedClasses",
                    	    								lv_containedClasses_8_0,
                    	    								"fr.cs.ontoeventb.pivotmodel.DSL.ClassDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getOntologyAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:172:3: (otherlv_10= 'containedProperties' otherlv_11= '{' ( (lv_containedProperties_12_0= rulePropertyDefinition ) ) (otherlv_13= ',' ( (lv_containedProperties_14_0= rulePropertyDefinition ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:173:4: otherlv_10= 'containedProperties' otherlv_11= '{' ( (lv_containedProperties_12_0= rulePropertyDefinition ) ) (otherlv_13= ',' ( (lv_containedProperties_14_0= rulePropertyDefinition ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getOntologyAccess().getContainedPropertiesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getOntologyAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDSL.g:181:4: ( (lv_containedProperties_12_0= rulePropertyDefinition ) )
                    // InternalDSL.g:182:5: (lv_containedProperties_12_0= rulePropertyDefinition )
                    {
                    // InternalDSL.g:182:5: (lv_containedProperties_12_0= rulePropertyDefinition )
                    // InternalDSL.g:183:6: lv_containedProperties_12_0= rulePropertyDefinition
                    {

                    						newCompositeNode(grammarAccess.getOntologyAccess().getContainedPropertiesPropertyDefinitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_containedProperties_12_0=rulePropertyDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologyRule());
                    						}
                    						add(
                    							current,
                    							"containedProperties",
                    							lv_containedProperties_12_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.PropertyDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:200:4: (otherlv_13= ',' ( (lv_containedProperties_14_0= rulePropertyDefinition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDSL.g:201:5: otherlv_13= ',' ( (lv_containedProperties_14_0= rulePropertyDefinition ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOntologyAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:205:5: ( (lv_containedProperties_14_0= rulePropertyDefinition ) )
                    	    // InternalDSL.g:206:6: (lv_containedProperties_14_0= rulePropertyDefinition )
                    	    {
                    	    // InternalDSL.g:206:6: (lv_containedProperties_14_0= rulePropertyDefinition )
                    	    // InternalDSL.g:207:7: lv_containedProperties_14_0= rulePropertyDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologyAccess().getContainedPropertiesPropertyDefinitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_containedProperties_14_0=rulePropertyDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containedProperties",
                    	    								lv_containedProperties_14_0,
                    	    								"fr.cs.ontoeventb.pivotmodel.DSL.PropertyDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getOntologyAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:230:3: (otherlv_16= 'containedDataTypes' otherlv_17= '{' ( (lv_containedDataTypes_18_0= ruleDataTypeDefinition ) ) (otherlv_19= ',' ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:231:4: otherlv_16= 'containedDataTypes' otherlv_17= '{' ( (lv_containedDataTypes_18_0= ruleDataTypeDefinition ) ) (otherlv_19= ',' ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getOntologyAccess().getContainedDataTypesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getOntologyAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDSL.g:239:4: ( (lv_containedDataTypes_18_0= ruleDataTypeDefinition ) )
                    // InternalDSL.g:240:5: (lv_containedDataTypes_18_0= ruleDataTypeDefinition )
                    {
                    // InternalDSL.g:240:5: (lv_containedDataTypes_18_0= ruleDataTypeDefinition )
                    // InternalDSL.g:241:6: lv_containedDataTypes_18_0= ruleDataTypeDefinition
                    {

                    						newCompositeNode(grammarAccess.getOntologyAccess().getContainedDataTypesDataTypeDefinitionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_containedDataTypes_18_0=ruleDataTypeDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologyRule());
                    						}
                    						add(
                    							current,
                    							"containedDataTypes",
                    							lv_containedDataTypes_18_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.DataTypeDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:258:4: (otherlv_19= ',' ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDSL.g:259:5: otherlv_19= ',' ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getOntologyAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:263:5: ( (lv_containedDataTypes_20_0= ruleDataTypeDefinition ) )
                    	    // InternalDSL.g:264:6: (lv_containedDataTypes_20_0= ruleDataTypeDefinition )
                    	    {
                    	    // InternalDSL.g:264:6: (lv_containedDataTypes_20_0= ruleDataTypeDefinition )
                    	    // InternalDSL.g:265:7: lv_containedDataTypes_20_0= ruleDataTypeDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getOntologyAccess().getContainedDataTypesDataTypeDefinitionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_containedDataTypes_20_0=ruleDataTypeDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOntologyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containedDataTypes",
                    	    								lv_containedDataTypes_20_0,
                    	    								"fr.cs.ontoeventb.pivotmodel.DSL.DataTypeDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getOntologyAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getOntologyAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleOntology"


    // $ANTLR start "entryRuleClassDefinition"
    // InternalDSL.g:296:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalDSL.g:296:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalDSL.g:297:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;

             current =iv_ruleClassDefinition; 
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
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // InternalDSL.g:303:1: ruleClassDefinition returns [EObject current=null] : (this_SimpleClass_0= ruleSimpleClass | this_CaseOfClass_1= ruleCaseOfClass | this_UniversalClass_2= ruleUniversalClass | this_ExistantialClass_3= ruleExistantialClass | this_HasValueClass_4= ruleHasValueClass | this_MaxCardinalityClass_5= ruleMaxCardinalityClass | this_MinCardinalityClass_6= ruleMinCardinalityClass | this_CardinalityClass_7= ruleCardinalityClass | this_EnumeratedClass_8= ruleEnumeratedClass | this_UnionClass_9= ruleUnionClass | this_IntersectionClass_10= ruleIntersectionClass | this_ComplementClass_11= ruleComplementClass ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleClass_0 = null;

        EObject this_CaseOfClass_1 = null;

        EObject this_UniversalClass_2 = null;

        EObject this_ExistantialClass_3 = null;

        EObject this_HasValueClass_4 = null;

        EObject this_MaxCardinalityClass_5 = null;

        EObject this_MinCardinalityClass_6 = null;

        EObject this_CardinalityClass_7 = null;

        EObject this_EnumeratedClass_8 = null;

        EObject this_UnionClass_9 = null;

        EObject this_IntersectionClass_10 = null;

        EObject this_ComplementClass_11 = null;



        	enterRule();

        try {
            // InternalDSL.g:309:2: ( (this_SimpleClass_0= ruleSimpleClass | this_CaseOfClass_1= ruleCaseOfClass | this_UniversalClass_2= ruleUniversalClass | this_ExistantialClass_3= ruleExistantialClass | this_HasValueClass_4= ruleHasValueClass | this_MaxCardinalityClass_5= ruleMaxCardinalityClass | this_MinCardinalityClass_6= ruleMinCardinalityClass | this_CardinalityClass_7= ruleCardinalityClass | this_EnumeratedClass_8= ruleEnumeratedClass | this_UnionClass_9= ruleUnionClass | this_IntersectionClass_10= ruleIntersectionClass | this_ComplementClass_11= ruleComplementClass ) )
            // InternalDSL.g:310:2: (this_SimpleClass_0= ruleSimpleClass | this_CaseOfClass_1= ruleCaseOfClass | this_UniversalClass_2= ruleUniversalClass | this_ExistantialClass_3= ruleExistantialClass | this_HasValueClass_4= ruleHasValueClass | this_MaxCardinalityClass_5= ruleMaxCardinalityClass | this_MinCardinalityClass_6= ruleMinCardinalityClass | this_CardinalityClass_7= ruleCardinalityClass | this_EnumeratedClass_8= ruleEnumeratedClass | this_UnionClass_9= ruleUnionClass | this_IntersectionClass_10= ruleIntersectionClass | this_ComplementClass_11= ruleComplementClass )
            {
            // InternalDSL.g:310:2: (this_SimpleClass_0= ruleSimpleClass | this_CaseOfClass_1= ruleCaseOfClass | this_UniversalClass_2= ruleUniversalClass | this_ExistantialClass_3= ruleExistantialClass | this_HasValueClass_4= ruleHasValueClass | this_MaxCardinalityClass_5= ruleMaxCardinalityClass | this_MinCardinalityClass_6= ruleMinCardinalityClass | this_CardinalityClass_7= ruleCardinalityClass | this_EnumeratedClass_8= ruleEnumeratedClass | this_UnionClass_9= ruleUnionClass | this_IntersectionClass_10= ruleIntersectionClass | this_ComplementClass_11= ruleComplementClass )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            case 32:
                {
                alt7=5;
                }
                break;
            case 33:
                {
                alt7=6;
                }
                break;
            case 35:
                {
                alt7=7;
                }
                break;
            case 37:
                {
                alt7=8;
                }
                break;
            case 39:
                {
                alt7=9;
                }
                break;
            case 41:
                {
                alt7=10;
                }
                break;
            case 43:
                {
                alt7=11;
                }
                break;
            case 44:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:311:3: this_SimpleClass_0= ruleSimpleClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getSimpleClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleClass_0=ruleSimpleClass();

                    state._fsp--;


                    			current = this_SimpleClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:320:3: this_CaseOfClass_1= ruleCaseOfClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getCaseOfClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CaseOfClass_1=ruleCaseOfClass();

                    state._fsp--;


                    			current = this_CaseOfClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:329:3: this_UniversalClass_2= ruleUniversalClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getUniversalClassParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UniversalClass_2=ruleUniversalClass();

                    state._fsp--;


                    			current = this_UniversalClass_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:338:3: this_ExistantialClass_3= ruleExistantialClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getExistantialClassParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistantialClass_3=ruleExistantialClass();

                    state._fsp--;


                    			current = this_ExistantialClass_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:347:3: this_HasValueClass_4= ruleHasValueClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getHasValueClassParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_HasValueClass_4=ruleHasValueClass();

                    state._fsp--;


                    			current = this_HasValueClass_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDSL.g:356:3: this_MaxCardinalityClass_5= ruleMaxCardinalityClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getMaxCardinalityClassParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxCardinalityClass_5=ruleMaxCardinalityClass();

                    state._fsp--;


                    			current = this_MaxCardinalityClass_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDSL.g:365:3: this_MinCardinalityClass_6= ruleMinCardinalityClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getMinCardinalityClassParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinCardinalityClass_6=ruleMinCardinalityClass();

                    state._fsp--;


                    			current = this_MinCardinalityClass_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDSL.g:374:3: this_CardinalityClass_7= ruleCardinalityClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getCardinalityClassParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_CardinalityClass_7=ruleCardinalityClass();

                    state._fsp--;


                    			current = this_CardinalityClass_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDSL.g:383:3: this_EnumeratedClass_8= ruleEnumeratedClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getEnumeratedClassParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumeratedClass_8=ruleEnumeratedClass();

                    state._fsp--;


                    			current = this_EnumeratedClass_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDSL.g:392:3: this_UnionClass_9= ruleUnionClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getUnionClassParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnionClass_9=ruleUnionClass();

                    state._fsp--;


                    			current = this_UnionClass_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDSL.g:401:3: this_IntersectionClass_10= ruleIntersectionClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getIntersectionClassParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntersectionClass_10=ruleIntersectionClass();

                    state._fsp--;


                    			current = this_IntersectionClass_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDSL.g:410:3: this_ComplementClass_11= ruleComplementClass
                    {

                    			newCompositeNode(grammarAccess.getClassDefinitionAccess().getComplementClassParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplementClass_11=ruleComplementClass();

                    state._fsp--;


                    			current = this_ComplementClass_11;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalDSL.g:422:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalDSL.g:422:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalDSL.g:423:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // InternalDSL.g:429:1: rulePropertyDefinition returns [EObject current=null] : (this_SimpleProperty_0= ruleSimpleProperty | this_ConditionProperty_1= ruleConditionProperty | this_DependentProperty_2= ruleDependentProperty ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleProperty_0 = null;

        EObject this_ConditionProperty_1 = null;

        EObject this_DependentProperty_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:435:2: ( (this_SimpleProperty_0= ruleSimpleProperty | this_ConditionProperty_1= ruleConditionProperty | this_DependentProperty_2= ruleDependentProperty ) )
            // InternalDSL.g:436:2: (this_SimpleProperty_0= ruleSimpleProperty | this_ConditionProperty_1= ruleConditionProperty | this_DependentProperty_2= ruleDependentProperty )
            {
            // InternalDSL.g:436:2: (this_SimpleProperty_0= ruleSimpleProperty | this_ConditionProperty_1= ruleConditionProperty | this_DependentProperty_2= ruleDependentProperty )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    switch ( input.LA(3) ) {
                    case 50:
                        {
                        switch ( input.LA(4) ) {
                        case 51:
                            {
                            switch ( input.LA(5) ) {
                            case 58:
                                {
                                alt8=3;
                                }
                                break;
                            case 57:
                                {
                                alt8=2;
                                }
                                break;
                            case 52:
                                {
                                alt8=1;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 4, input);

                                throw nvae;
                            }

                            }
                            break;
                        case 57:
                            {
                            alt8=2;
                            }
                            break;
                        case 52:
                            {
                            alt8=1;
                            }
                            break;
                        case 58:
                            {
                            alt8=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 51:
                        {
                        switch ( input.LA(4) ) {
                        case 58:
                            {
                            alt8=3;
                            }
                            break;
                        case 57:
                            {
                            alt8=2;
                            }
                            break;
                        case 52:
                            {
                            alt8=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 58:
                        {
                        alt8=3;
                        }
                        break;
                    case 57:
                        {
                        alt8=2;
                        }
                        break;
                    case 52:
                        {
                        alt8=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 50:
                    {
                    switch ( input.LA(3) ) {
                    case 51:
                        {
                        switch ( input.LA(4) ) {
                        case 58:
                            {
                            alt8=3;
                            }
                            break;
                        case 57:
                            {
                            alt8=2;
                            }
                            break;
                        case 52:
                            {
                            alt8=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 57:
                        {
                        alt8=2;
                        }
                        break;
                    case 52:
                        {
                        alt8=1;
                        }
                        break;
                    case 58:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 51:
                    {
                    switch ( input.LA(3) ) {
                    case 58:
                        {
                        alt8=3;
                        }
                        break;
                    case 57:
                        {
                        alt8=2;
                        }
                        break;
                    case 52:
                        {
                        alt8=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 52:
                    {
                    alt8=1;
                    }
                    break;
                case 58:
                    {
                    alt8=3;
                    }
                    break;
                case 57:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

                }
                break;
            case 49:
                {
                switch ( input.LA(2) ) {
                case 50:
                    {
                    switch ( input.LA(3) ) {
                    case 51:
                        {
                        switch ( input.LA(4) ) {
                        case 58:
                            {
                            alt8=3;
                            }
                            break;
                        case 57:
                            {
                            alt8=2;
                            }
                            break;
                        case 52:
                            {
                            alt8=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 57:
                        {
                        alt8=2;
                        }
                        break;
                    case 52:
                        {
                        alt8=1;
                        }
                        break;
                    case 58:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 51:
                    {
                    switch ( input.LA(3) ) {
                    case 58:
                        {
                        alt8=3;
                        }
                        break;
                    case 57:
                        {
                        alt8=2;
                        }
                        break;
                    case 52:
                        {
                        alt8=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 58:
                    {
                    alt8=3;
                    }
                    break;
                case 57:
                    {
                    alt8=2;
                    }
                    break;
                case 52:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

                }
                break;
            case 50:
                {
                switch ( input.LA(2) ) {
                case 51:
                    {
                    switch ( input.LA(3) ) {
                    case 58:
                        {
                        alt8=3;
                        }
                        break;
                    case 57:
                        {
                        alt8=2;
                        }
                        break;
                    case 52:
                        {
                        alt8=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 57:
                    {
                    alt8=2;
                    }
                    break;
                case 52:
                    {
                    alt8=1;
                    }
                    break;
                case 58:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }

                }
                break;
            case 51:
                {
                switch ( input.LA(2) ) {
                case 58:
                    {
                    alt8=3;
                    }
                    break;
                case 57:
                    {
                    alt8=2;
                    }
                    break;
                case 52:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }

                }
                break;
            case 52:
                {
                alt8=1;
                }
                break;
            case 57:
                {
                alt8=2;
                }
                break;
            case 58:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:437:3: this_SimpleProperty_0= ruleSimpleProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getSimplePropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleProperty_0=ruleSimpleProperty();

                    state._fsp--;


                    			current = this_SimpleProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:446:3: this_ConditionProperty_1= ruleConditionProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getConditionPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionProperty_1=ruleConditionProperty();

                    state._fsp--;


                    			current = this_ConditionProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:455:3: this_DependentProperty_2= ruleDependentProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDependentPropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DependentProperty_2=ruleDependentProperty();

                    state._fsp--;


                    			current = this_DependentProperty_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleDataTypeDefinition"
    // InternalDSL.g:467:1: entryRuleDataTypeDefinition returns [EObject current=null] : iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF ;
    public final EObject entryRuleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDefinition = null;


        try {
            // InternalDSL.g:467:59: (iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF )
            // InternalDSL.g:468:2: iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getDataTypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeDefinition=ruleDataTypeDefinition();

            state._fsp--;

             current =iv_ruleDataTypeDefinition; 
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
    // $ANTLR end "entryRuleDataTypeDefinition"


    // $ANTLR start "ruleDataTypeDefinition"
    // InternalDSL.g:474:1: ruleDataTypeDefinition returns [EObject current=null] : (this_NotNumericType_0= ruleNotNumericType | this_NumericType_Impl_1= ruleNumericType_Impl | this_MeasureType_2= ruleMeasureType | this_CurrencyType_3= ruleCurrencyType | this_ClassType_4= ruleClassType | this_CollectionType_5= ruleCollectionType | this_SingleValue_6= ruleSingleValue | this_EnumeratedType_7= ruleEnumeratedType | this_NumberEnumeratedType_8= ruleNumberEnumeratedType ) ;
    public final EObject ruleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NotNumericType_0 = null;

        EObject this_NumericType_Impl_1 = null;

        EObject this_MeasureType_2 = null;

        EObject this_CurrencyType_3 = null;

        EObject this_ClassType_4 = null;

        EObject this_CollectionType_5 = null;

        EObject this_SingleValue_6 = null;

        EObject this_EnumeratedType_7 = null;

        EObject this_NumberEnumeratedType_8 = null;



        	enterRule();

        try {
            // InternalDSL.g:480:2: ( (this_NotNumericType_0= ruleNotNumericType | this_NumericType_Impl_1= ruleNumericType_Impl | this_MeasureType_2= ruleMeasureType | this_CurrencyType_3= ruleCurrencyType | this_ClassType_4= ruleClassType | this_CollectionType_5= ruleCollectionType | this_SingleValue_6= ruleSingleValue | this_EnumeratedType_7= ruleEnumeratedType | this_NumberEnumeratedType_8= ruleNumberEnumeratedType ) )
            // InternalDSL.g:481:2: (this_NotNumericType_0= ruleNotNumericType | this_NumericType_Impl_1= ruleNumericType_Impl | this_MeasureType_2= ruleMeasureType | this_CurrencyType_3= ruleCurrencyType | this_ClassType_4= ruleClassType | this_CollectionType_5= ruleCollectionType | this_SingleValue_6= ruleSingleValue | this_EnumeratedType_7= ruleEnumeratedType | this_NumberEnumeratedType_8= ruleNumberEnumeratedType )
            {
            // InternalDSL.g:481:2: (this_NotNumericType_0= ruleNotNumericType | this_NumericType_Impl_1= ruleNumericType_Impl | this_MeasureType_2= ruleMeasureType | this_CurrencyType_3= ruleCurrencyType | this_ClassType_4= ruleClassType | this_CollectionType_5= ruleCollectionType | this_SingleValue_6= ruleSingleValue | this_EnumeratedType_7= ruleEnumeratedType | this_NumberEnumeratedType_8= ruleNumberEnumeratedType )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt9=1;
                }
                break;
            case 62:
                {
                alt9=2;
                }
                break;
            case 63:
                {
                alt9=3;
                }
                break;
            case 65:
                {
                alt9=4;
                }
                break;
            case 67:
                {
                alt9=5;
                }
                break;
            case 68:
                {
                alt9=6;
                }
                break;
            case 46:
                {
                alt9=7;
                }
                break;
            case 71:
                {
                alt9=8;
                }
                break;
            case 73:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDSL.g:482:3: this_NotNumericType_0= ruleNotNumericType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getNotNumericTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotNumericType_0=ruleNotNumericType();

                    state._fsp--;


                    			current = this_NotNumericType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:491:3: this_NumericType_Impl_1= ruleNumericType_Impl
                    {

                    			newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getNumericType_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericType_Impl_1=ruleNumericType_Impl();

                    state._fsp--;


                    			current = this_NumericType_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:500:3: this_MeasureType_2= ruleMeasureType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getMeasureTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureType_2=ruleMeasureType();

                    state._fsp--;


                    			current = this_MeasureType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:509:3: this_CurrencyType_3= ruleCurrencyType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getCurrencyTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CurrencyType_3=ruleCurrencyType();

                    state._fsp--;


                    			current = this_CurrencyType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:518:3: this_ClassType_4= ruleClassType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getClassTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassType_4=ruleClassType();

                    state._fsp--;


                    			current = this_ClassType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDSL.g:527:3: this_CollectionType_5= ruleCollectionType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getCollectionTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionType_5=ruleCollectionType();

                    state._fsp--;


                    			current = this_CollectionType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDSL.g:536:3: this_SingleValue_6= ruleSingleValue
                    {

                    			newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getSingleValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleValue_6=ruleSingleValue();

                    state._fsp--;


                    			current = this_SingleValue_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDSL.g:545:3: this_EnumeratedType_7= ruleEnumeratedType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getEnumeratedTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumeratedType_7=ruleEnumeratedType();

                    state._fsp--;


                    			current = this_EnumeratedType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDSL.g:554:3: this_NumberEnumeratedType_8= ruleNumberEnumeratedType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getNumberEnumeratedTypeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberEnumeratedType_8=ruleNumberEnumeratedType();

                    state._fsp--;


                    			current = this_NumberEnumeratedType_8;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDataTypeDefinition"


    // $ANTLR start "entryRuleUnitType"
    // InternalDSL.g:566:1: entryRuleUnitType returns [EObject current=null] : iv_ruleUnitType= ruleUnitType EOF ;
    public final EObject entryRuleUnitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitType = null;


        try {
            // InternalDSL.g:566:49: (iv_ruleUnitType= ruleUnitType EOF )
            // InternalDSL.g:567:2: iv_ruleUnitType= ruleUnitType EOF
            {
             newCompositeNode(grammarAccess.getUnitTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitType=ruleUnitType();

            state._fsp--;

             current =iv_ruleUnitType; 
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
    // $ANTLR end "entryRuleUnitType"


    // $ANTLR start "ruleUnitType"
    // InternalDSL.g:573:1: ruleUnitType returns [EObject current=null] : (this_NamedUnit_Impl_0= ruleNamedUnit_Impl | this_DerivedUnit_1= ruleDerivedUnit | this_NonStandardUnit_2= ruleNonStandardUnit | this_ConversionBasedUnit_3= ruleConversionBasedUnit | this_ContextDependentUnit_4= ruleContextDependentUnit | this_StandardUnit_5= ruleStandardUnit ) ;
    public final EObject ruleUnitType() throws RecognitionException {
        EObject current = null;

        EObject this_NamedUnit_Impl_0 = null;

        EObject this_DerivedUnit_1 = null;

        EObject this_NonStandardUnit_2 = null;

        EObject this_ConversionBasedUnit_3 = null;

        EObject this_ContextDependentUnit_4 = null;

        EObject this_StandardUnit_5 = null;



        	enterRule();

        try {
            // InternalDSL.g:579:2: ( (this_NamedUnit_Impl_0= ruleNamedUnit_Impl | this_DerivedUnit_1= ruleDerivedUnit | this_NonStandardUnit_2= ruleNonStandardUnit | this_ConversionBasedUnit_3= ruleConversionBasedUnit | this_ContextDependentUnit_4= ruleContextDependentUnit | this_StandardUnit_5= ruleStandardUnit ) )
            // InternalDSL.g:580:2: (this_NamedUnit_Impl_0= ruleNamedUnit_Impl | this_DerivedUnit_1= ruleDerivedUnit | this_NonStandardUnit_2= ruleNonStandardUnit | this_ConversionBasedUnit_3= ruleConversionBasedUnit | this_ContextDependentUnit_4= ruleContextDependentUnit | this_StandardUnit_5= ruleStandardUnit )
            {
            // InternalDSL.g:580:2: (this_NamedUnit_Impl_0= ruleNamedUnit_Impl | this_DerivedUnit_1= ruleDerivedUnit | this_NonStandardUnit_2= ruleNonStandardUnit | this_ConversionBasedUnit_3= ruleConversionBasedUnit | this_ContextDependentUnit_4= ruleContextDependentUnit | this_StandardUnit_5= ruleStandardUnit )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt10=1;
                }
                break;
            case 76:
                {
                alt10=2;
                }
                break;
            case 78:
                {
                alt10=3;
                }
                break;
            case 79:
                {
                alt10=4;
                }
                break;
            case 82:
                {
                alt10=5;
                }
                break;
            case 83:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDSL.g:581:3: this_NamedUnit_Impl_0= ruleNamedUnit_Impl
                    {

                    			newCompositeNode(grammarAccess.getUnitTypeAccess().getNamedUnit_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedUnit_Impl_0=ruleNamedUnit_Impl();

                    state._fsp--;


                    			current = this_NamedUnit_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:590:3: this_DerivedUnit_1= ruleDerivedUnit
                    {

                    			newCompositeNode(grammarAccess.getUnitTypeAccess().getDerivedUnitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DerivedUnit_1=ruleDerivedUnit();

                    state._fsp--;


                    			current = this_DerivedUnit_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:599:3: this_NonStandardUnit_2= ruleNonStandardUnit
                    {

                    			newCompositeNode(grammarAccess.getUnitTypeAccess().getNonStandardUnitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonStandardUnit_2=ruleNonStandardUnit();

                    state._fsp--;


                    			current = this_NonStandardUnit_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:608:3: this_ConversionBasedUnit_3= ruleConversionBasedUnit
                    {

                    			newCompositeNode(grammarAccess.getUnitTypeAccess().getConversionBasedUnitParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConversionBasedUnit_3=ruleConversionBasedUnit();

                    state._fsp--;


                    			current = this_ConversionBasedUnit_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:617:3: this_ContextDependentUnit_4= ruleContextDependentUnit
                    {

                    			newCompositeNode(grammarAccess.getUnitTypeAccess().getContextDependentUnitParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextDependentUnit_4=ruleContextDependentUnit();

                    state._fsp--;


                    			current = this_ContextDependentUnit_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDSL.g:626:3: this_StandardUnit_5= ruleStandardUnit
                    {

                    			newCompositeNode(grammarAccess.getUnitTypeAccess().getStandardUnitParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StandardUnit_5=ruleStandardUnit();

                    state._fsp--;


                    			current = this_StandardUnit_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleUnitType"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:638:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:638:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:639:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDSL.g:645:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:651:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:652:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:652:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:653:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:661:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSimpleClass"
    // InternalDSL.g:672:1: entryRuleSimpleClass returns [EObject current=null] : iv_ruleSimpleClass= ruleSimpleClass EOF ;
    public final EObject entryRuleSimpleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleClass = null;


        try {
            // InternalDSL.g:672:52: (iv_ruleSimpleClass= ruleSimpleClass EOF )
            // InternalDSL.g:673:2: iv_ruleSimpleClass= ruleSimpleClass EOF
            {
             newCompositeNode(grammarAccess.getSimpleClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleClass=ruleSimpleClass();

            state._fsp--;

             current =iv_ruleSimpleClass; 
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
    // $ANTLR end "entryRuleSimpleClass"


    // $ANTLR start "ruleSimpleClass"
    // InternalDSL.g:679:1: ruleSimpleClass returns [EObject current=null] : ( () otherlv_1= 'SimpleClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subClassOf' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'disjointWith' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'describedBy' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? otherlv_28= '}' ) ;
    public final EObject ruleSimpleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:685:2: ( ( () otherlv_1= 'SimpleClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subClassOf' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'disjointWith' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'describedBy' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? otherlv_28= '}' ) )
            // InternalDSL.g:686:2: ( () otherlv_1= 'SimpleClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subClassOf' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'disjointWith' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'describedBy' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? otherlv_28= '}' )
            {
            // InternalDSL.g:686:2: ( () otherlv_1= 'SimpleClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subClassOf' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'disjointWith' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'describedBy' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? otherlv_28= '}' )
            // InternalDSL.g:687:3: () otherlv_1= 'SimpleClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'subClassOf' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'disjointWith' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'describedBy' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? otherlv_28= '}'
            {
            // InternalDSL.g:687:3: ()
            // InternalDSL.g:688:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleClassAccess().getSimpleClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleClassAccess().getSimpleClassKeyword_1());
            		
            // InternalDSL.g:698:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:699:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:699:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:700:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:721:3: (otherlv_4= 'subClassOf' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:722:4: otherlv_4= 'subClassOf' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleClassAccess().getSubClassOfKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSimpleClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDSL.g:730:4: ( ( ruleEString ) )
                    // InternalDSL.g:731:5: ( ruleEString )
                    {
                    // InternalDSL.g:731:5: ( ruleEString )
                    // InternalDSL.g:732:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimpleClassAccess().getSubClassOfClassDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:746:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDSL.g:747:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSimpleClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:751:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:752:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:752:6: ( ruleEString )
                    	    // InternalDSL.g:753:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSimpleClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSimpleClassAccess().getSubClassOfClassDefinitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getSimpleClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:773:3: (otherlv_10= 'disjointWith' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:774:4: otherlv_10= 'disjointWith' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getSimpleClassAccess().getDisjointWithKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getSimpleClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:782:4: ( ( ruleEString ) )
                    // InternalDSL.g:783:5: ( ruleEString )
                    {
                    // InternalDSL.g:783:5: ( ruleEString )
                    // InternalDSL.g:784:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimpleClassAccess().getDisjointWithClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:798:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDSL.g:799:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSimpleClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:803:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:804:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:804:6: ( ruleEString )
                    	    // InternalDSL.g:805:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSimpleClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSimpleClassAccess().getDisjointWithClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_15, grammarAccess.getSimpleClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:825:3: (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDSL.g:826:4: otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getSimpleClassAccess().getEquivalentToKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getSimpleClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:834:4: ( ( ruleEString ) )
                    // InternalDSL.g:835:5: ( ruleEString )
                    {
                    // InternalDSL.g:835:5: ( ruleEString )
                    // InternalDSL.g:836:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimpleClassAccess().getEquivalentToClassDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:850:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalDSL.g:851:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSimpleClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:855:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:856:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:856:6: ( ruleEString )
                    	    // InternalDSL.g:857:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSimpleClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSimpleClassAccess().getEquivalentToClassDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_21, grammarAccess.getSimpleClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:877:3: (otherlv_22= 'describedBy' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDSL.g:878:4: otherlv_22= 'describedBy' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')'
                    {
                    otherlv_22=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getSimpleClassAccess().getDescribedByKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getSimpleClassAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalDSL.g:886:4: ( ( ruleEString ) )
                    // InternalDSL.g:887:5: ( ruleEString )
                    {
                    // InternalDSL.g:887:5: ( ruleEString )
                    // InternalDSL.g:888:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimpleClassAccess().getDescribedByPropertyDefinitionCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:902:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDSL.g:903:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getSimpleClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDSL.g:907:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:908:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:908:6: ( ruleEString )
                    	    // InternalDSL.g:909:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSimpleClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSimpleClassAccess().getDescribedByPropertyDefinitionCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_27, grammarAccess.getSimpleClassAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getSimpleClassAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSimpleClass"


    // $ANTLR start "entryRuleCaseOfClass"
    // InternalDSL.g:937:1: entryRuleCaseOfClass returns [EObject current=null] : iv_ruleCaseOfClass= ruleCaseOfClass EOF ;
    public final EObject entryRuleCaseOfClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseOfClass = null;


        try {
            // InternalDSL.g:937:52: (iv_ruleCaseOfClass= ruleCaseOfClass EOF )
            // InternalDSL.g:938:2: iv_ruleCaseOfClass= ruleCaseOfClass EOF
            {
             newCompositeNode(grammarAccess.getCaseOfClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseOfClass=ruleCaseOfClass();

            state._fsp--;

             current =iv_ruleCaseOfClass; 
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
    // $ANTLR end "entryRuleCaseOfClass"


    // $ANTLR start "ruleCaseOfClass"
    // InternalDSL.g:944:1: ruleCaseOfClass returns [EObject current=null] : (otherlv_0= 'CaseOfClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'caseOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' (otherlv_33= 'importedProperties' otherlv_34= '(' ( ( ruleEString ) ) (otherlv_36= ',' ( ( ruleEString ) ) )* otherlv_38= ')' )? otherlv_39= '}' ) ;
    public final EObject ruleCaseOfClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:950:2: ( (otherlv_0= 'CaseOfClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'caseOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' (otherlv_33= 'importedProperties' otherlv_34= '(' ( ( ruleEString ) ) (otherlv_36= ',' ( ( ruleEString ) ) )* otherlv_38= ')' )? otherlv_39= '}' ) )
            // InternalDSL.g:951:2: (otherlv_0= 'CaseOfClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'caseOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' (otherlv_33= 'importedProperties' otherlv_34= '(' ( ( ruleEString ) ) (otherlv_36= ',' ( ( ruleEString ) ) )* otherlv_38= ')' )? otherlv_39= '}' )
            {
            // InternalDSL.g:951:2: (otherlv_0= 'CaseOfClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'caseOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' (otherlv_33= 'importedProperties' otherlv_34= '(' ( ( ruleEString ) ) (otherlv_36= ',' ( ( ruleEString ) ) )* otherlv_38= ')' )? otherlv_39= '}' )
            // InternalDSL.g:952:3: otherlv_0= 'CaseOfClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'caseOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' (otherlv_33= 'importedProperties' otherlv_34= '(' ( ( ruleEString ) ) (otherlv_36= ',' ( ( ruleEString ) ) )* otherlv_38= ')' )? otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseOfClassAccess().getCaseOfClassKeyword_0());
            		
            // InternalDSL.g:956:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:957:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:957:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:958:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCaseOfClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseOfClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseOfClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:979:3: (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDSL.g:980:4: otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getCaseOfClassAccess().getSubClassOfKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCaseOfClassAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDSL.g:988:4: ( ( ruleEString ) )
                    // InternalDSL.g:989:5: ( ruleEString )
                    {
                    // InternalDSL.g:989:5: ( ruleEString )
                    // InternalDSL.g:990:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCaseOfClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCaseOfClassAccess().getSubClassOfClassDefinitionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1004:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDSL.g:1005:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCaseOfClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDSL.g:1009:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1010:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1010:6: ( ruleEString )
                    	    // InternalDSL.g:1011:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCaseOfClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCaseOfClassAccess().getSubClassOfClassDefinitionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getCaseOfClassAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1031:3: (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDSL.g:1032:4: otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getCaseOfClassAccess().getDisjointWithKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getCaseOfClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDSL.g:1040:4: ( ( ruleEString ) )
                    // InternalDSL.g:1041:5: ( ruleEString )
                    {
                    // InternalDSL.g:1041:5: ( ruleEString )
                    // InternalDSL.g:1042:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCaseOfClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCaseOfClassAccess().getDisjointWithClassDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1056:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDSL.g:1057:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getCaseOfClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:1061:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1062:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1062:6: ( ruleEString )
                    	    // InternalDSL.g:1063:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCaseOfClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCaseOfClassAccess().getDisjointWithClassDefinitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getCaseOfClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1083:3: (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDSL.g:1084:4: otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getCaseOfClassAccess().getEquivalentToKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getCaseOfClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:1092:4: ( ( ruleEString ) )
                    // InternalDSL.g:1093:5: ( ruleEString )
                    {
                    // InternalDSL.g:1093:5: ( ruleEString )
                    // InternalDSL.g:1094:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCaseOfClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCaseOfClassAccess().getEquivalentToClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1108:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDSL.g:1109:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCaseOfClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:1113:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1114:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1114:6: ( ruleEString )
                    	    // InternalDSL.g:1115:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCaseOfClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCaseOfClassAccess().getEquivalentToClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getCaseOfClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1135:3: (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDSL.g:1136:4: otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getCaseOfClassAccess().getDescribedByKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getCaseOfClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:1144:4: ( ( ruleEString ) )
                    // InternalDSL.g:1145:5: ( ruleEString )
                    {
                    // InternalDSL.g:1145:5: ( ruleEString )
                    // InternalDSL.g:1146:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCaseOfClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCaseOfClassAccess().getDescribedByPropertyDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1160:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalDSL.g:1161:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getCaseOfClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:1165:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1166:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1166:6: ( ruleEString )
                    	    // InternalDSL.g:1167:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCaseOfClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCaseOfClassAccess().getDescribedByPropertyDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_23); 

                    				newLeafNode(otherlv_26, grammarAccess.getCaseOfClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_27, grammarAccess.getCaseOfClassAccess().getCaseOfKeyword_7());
            		
            otherlv_28=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_28, grammarAccess.getCaseOfClassAccess().getLeftParenthesisKeyword_8());
            		
            // InternalDSL.g:1195:3: ( ( ruleEString ) )
            // InternalDSL.g:1196:4: ( ruleEString )
            {
            // InternalDSL.g:1196:4: ( ruleEString )
            // InternalDSL.g:1197:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseOfClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCaseOfClassAccess().getCaseOfClassDefinitionCrossReference_9_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:1211:3: (otherlv_30= ',' ( ( ruleEString ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDSL.g:1212:4: otherlv_30= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_30, grammarAccess.getCaseOfClassAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalDSL.g:1216:4: ( ( ruleEString ) )
            	    // InternalDSL.g:1217:5: ( ruleEString )
            	    {
            	    // InternalDSL.g:1217:5: ( ruleEString )
            	    // InternalDSL.g:1218:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCaseOfClassRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCaseOfClassAccess().getCaseOfClassDefinitionCrossReference_10_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_32=(Token)match(input,21,FOLLOW_24); 

            			newLeafNode(otherlv_32, grammarAccess.getCaseOfClassAccess().getRightParenthesisKeyword_11());
            		
            // InternalDSL.g:1237:3: (otherlv_33= 'importedProperties' otherlv_34= '(' ( ( ruleEString ) ) (otherlv_36= ',' ( ( ruleEString ) ) )* otherlv_38= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDSL.g:1238:4: otherlv_33= 'importedProperties' otherlv_34= '(' ( ( ruleEString ) ) (otherlv_36= ',' ( ( ruleEString ) ) )* otherlv_38= ')'
                    {
                    otherlv_33=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_33, grammarAccess.getCaseOfClassAccess().getImportedPropertiesKeyword_12_0());
                    			
                    otherlv_34=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_34, grammarAccess.getCaseOfClassAccess().getLeftParenthesisKeyword_12_1());
                    			
                    // InternalDSL.g:1246:4: ( ( ruleEString ) )
                    // InternalDSL.g:1247:5: ( ruleEString )
                    {
                    // InternalDSL.g:1247:5: ( ruleEString )
                    // InternalDSL.g:1248:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCaseOfClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCaseOfClassAccess().getImportedPropertiesPropertyDefinitionCrossReference_12_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1262:4: (otherlv_36= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDSL.g:1263:5: otherlv_36= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getCaseOfClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalDSL.g:1267:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1268:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1268:6: ( ruleEString )
                    	    // InternalDSL.g:1269:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCaseOfClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCaseOfClassAccess().getImportedPropertiesPropertyDefinitionCrossReference_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_38, grammarAccess.getCaseOfClassAccess().getRightParenthesisKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_39=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getCaseOfClassAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleCaseOfClass"


    // $ANTLR start "entryRuleUniversalClass"
    // InternalDSL.g:1297:1: entryRuleUniversalClass returns [EObject current=null] : iv_ruleUniversalClass= ruleUniversalClass EOF ;
    public final EObject entryRuleUniversalClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalClass = null;


        try {
            // InternalDSL.g:1297:55: (iv_ruleUniversalClass= ruleUniversalClass EOF )
            // InternalDSL.g:1298:2: iv_ruleUniversalClass= ruleUniversalClass EOF
            {
             newCompositeNode(grammarAccess.getUniversalClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniversalClass=ruleUniversalClass();

            state._fsp--;

             current =iv_ruleUniversalClass; 
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
    // $ANTLR end "entryRuleUniversalClass"


    // $ANTLR start "ruleUniversalClass"
    // InternalDSL.g:1304:1: ruleUniversalClass returns [EObject current=null] : (otherlv_0= 'UniversalClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' ) ;
    public final EObject ruleUniversalClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1310:2: ( (otherlv_0= 'UniversalClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' ) )
            // InternalDSL.g:1311:2: (otherlv_0= 'UniversalClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' )
            {
            // InternalDSL.g:1311:2: (otherlv_0= 'UniversalClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' )
            // InternalDSL.g:1312:3: otherlv_0= 'UniversalClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUniversalClassAccess().getUniversalClassKeyword_0());
            		
            // InternalDSL.g:1316:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1317:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1317:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1318:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUniversalClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversalClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getUniversalClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:1339:3: (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDSL.g:1340:4: otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getUniversalClassAccess().getSubClassOfKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getUniversalClassAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDSL.g:1348:4: ( ( ruleEString ) )
                    // InternalDSL.g:1349:5: ( ruleEString )
                    {
                    // InternalDSL.g:1349:5: ( ruleEString )
                    // InternalDSL.g:1350:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUniversalClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUniversalClassAccess().getSubClassOfClassDefinitionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1364:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalDSL.g:1365:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getUniversalClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDSL.g:1369:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1370:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1370:6: ( ruleEString )
                    	    // InternalDSL.g:1371:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUniversalClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUniversalClassAccess().getSubClassOfClassDefinitionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getUniversalClassAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1391:3: (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDSL.g:1392:4: otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getUniversalClassAccess().getDisjointWithKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getUniversalClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDSL.g:1400:4: ( ( ruleEString ) )
                    // InternalDSL.g:1401:5: ( ruleEString )
                    {
                    // InternalDSL.g:1401:5: ( ruleEString )
                    // InternalDSL.g:1402:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUniversalClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUniversalClassAccess().getDisjointWithClassDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1416:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalDSL.g:1417:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getUniversalClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:1421:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1422:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1422:6: ( ruleEString )
                    	    // InternalDSL.g:1423:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUniversalClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUniversalClassAccess().getDisjointWithClassDefinitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_27); 

                    				newLeafNode(otherlv_14, grammarAccess.getUniversalClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1443:3: (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDSL.g:1444:4: otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getUniversalClassAccess().getEquivalentToKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getUniversalClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:1452:4: ( ( ruleEString ) )
                    // InternalDSL.g:1453:5: ( ruleEString )
                    {
                    // InternalDSL.g:1453:5: ( ruleEString )
                    // InternalDSL.g:1454:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUniversalClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUniversalClassAccess().getEquivalentToClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1468:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalDSL.g:1469:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getUniversalClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:1473:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1474:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1474:6: ( ruleEString )
                    	    // InternalDSL.g:1475:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUniversalClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUniversalClassAccess().getEquivalentToClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_20, grammarAccess.getUniversalClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1495:3: (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDSL.g:1496:4: otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getUniversalClassAccess().getDescribedByKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getUniversalClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:1504:4: ( ( ruleEString ) )
                    // InternalDSL.g:1505:5: ( ruleEString )
                    {
                    // InternalDSL.g:1505:5: ( ruleEString )
                    // InternalDSL.g:1506:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUniversalClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUniversalClassAccess().getDescribedByPropertyDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1520:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalDSL.g:1521:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getUniversalClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:1525:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1526:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1526:6: ( ruleEString )
                    	    // InternalDSL.g:1527:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUniversalClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUniversalClassAccess().getDescribedByPropertyDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_29); 

                    				newLeafNode(otherlv_26, grammarAccess.getUniversalClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getUniversalClassAccess().getOnPropertyKeyword_7());
            		
            // InternalDSL.g:1551:3: ( ( ruleEString ) )
            // InternalDSL.g:1552:4: ( ruleEString )
            {
            // InternalDSL.g:1552:4: ( ruleEString )
            // InternalDSL.g:1553:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniversalClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUniversalClassAccess().getOnPropertyPropertyDefinitionCrossReference_8_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_29=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getUniversalClassAccess().getToDataDefinitionKeyword_9());
            		
            // InternalDSL.g:1571:3: ( ( ruleEString ) )
            // InternalDSL.g:1572:4: ( ruleEString )
            {
            // InternalDSL.g:1572:4: ( ruleEString )
            // InternalDSL.g:1573:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniversalClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUniversalClassAccess().getToDataDefinitionDataTypeDefinitionCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getUniversalClassAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleUniversalClass"


    // $ANTLR start "entryRuleExistantialClass"
    // InternalDSL.g:1595:1: entryRuleExistantialClass returns [EObject current=null] : iv_ruleExistantialClass= ruleExistantialClass EOF ;
    public final EObject entryRuleExistantialClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistantialClass = null;


        try {
            // InternalDSL.g:1595:57: (iv_ruleExistantialClass= ruleExistantialClass EOF )
            // InternalDSL.g:1596:2: iv_ruleExistantialClass= ruleExistantialClass EOF
            {
             newCompositeNode(grammarAccess.getExistantialClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistantialClass=ruleExistantialClass();

            state._fsp--;

             current =iv_ruleExistantialClass; 
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
    // $ANTLR end "entryRuleExistantialClass"


    // $ANTLR start "ruleExistantialClass"
    // InternalDSL.g:1602:1: ruleExistantialClass returns [EObject current=null] : (otherlv_0= 'ExistantialClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' ) ;
    public final EObject ruleExistantialClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1608:2: ( (otherlv_0= 'ExistantialClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' ) )
            // InternalDSL.g:1609:2: (otherlv_0= 'ExistantialClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' )
            {
            // InternalDSL.g:1609:2: (otherlv_0= 'ExistantialClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' )
            // InternalDSL.g:1610:3: otherlv_0= 'ExistantialClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExistantialClassAccess().getExistantialClassKeyword_0());
            		
            // InternalDSL.g:1614:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1615:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1615:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1616:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExistantialClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistantialClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getExistantialClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:1637:3: (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDSL.g:1638:4: otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getExistantialClassAccess().getSubClassOfKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getExistantialClassAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDSL.g:1646:4: ( ( ruleEString ) )
                    // InternalDSL.g:1647:5: ( ruleEString )
                    {
                    // InternalDSL.g:1647:5: ( ruleEString )
                    // InternalDSL.g:1648:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExistantialClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExistantialClassAccess().getSubClassOfClassDefinitionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1662:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalDSL.g:1663:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getExistantialClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDSL.g:1667:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1668:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1668:6: ( ruleEString )
                    	    // InternalDSL.g:1669:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExistantialClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExistantialClassAccess().getSubClassOfClassDefinitionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getExistantialClassAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1689:3: (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==22) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDSL.g:1690:4: otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getExistantialClassAccess().getDisjointWithKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getExistantialClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDSL.g:1698:4: ( ( ruleEString ) )
                    // InternalDSL.g:1699:5: ( ruleEString )
                    {
                    // InternalDSL.g:1699:5: ( ruleEString )
                    // InternalDSL.g:1700:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExistantialClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExistantialClassAccess().getDisjointWithClassDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1714:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalDSL.g:1715:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getExistantialClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:1719:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1720:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1720:6: ( ruleEString )
                    	    // InternalDSL.g:1721:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExistantialClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExistantialClassAccess().getDisjointWithClassDefinitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_27); 

                    				newLeafNode(otherlv_14, grammarAccess.getExistantialClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1741:3: (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDSL.g:1742:4: otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getExistantialClassAccess().getEquivalentToKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getExistantialClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:1750:4: ( ( ruleEString ) )
                    // InternalDSL.g:1751:5: ( ruleEString )
                    {
                    // InternalDSL.g:1751:5: ( ruleEString )
                    // InternalDSL.g:1752:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExistantialClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExistantialClassAccess().getEquivalentToClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1766:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalDSL.g:1767:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getExistantialClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:1771:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1772:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1772:6: ( ruleEString )
                    	    // InternalDSL.g:1773:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExistantialClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExistantialClassAccess().getEquivalentToClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_20, grammarAccess.getExistantialClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1793:3: (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDSL.g:1794:4: otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getExistantialClassAccess().getDescribedByKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getExistantialClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:1802:4: ( ( ruleEString ) )
                    // InternalDSL.g:1803:5: ( ruleEString )
                    {
                    // InternalDSL.g:1803:5: ( ruleEString )
                    // InternalDSL.g:1804:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExistantialClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExistantialClassAccess().getDescribedByPropertyDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1818:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalDSL.g:1819:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getExistantialClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:1823:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1824:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1824:6: ( ruleEString )
                    	    // InternalDSL.g:1825:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExistantialClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExistantialClassAccess().getDescribedByPropertyDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_29); 

                    				newLeafNode(otherlv_26, grammarAccess.getExistantialClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getExistantialClassAccess().getOnPropertyKeyword_7());
            		
            // InternalDSL.g:1849:3: ( ( ruleEString ) )
            // InternalDSL.g:1850:4: ( ruleEString )
            {
            // InternalDSL.g:1850:4: ( ruleEString )
            // InternalDSL.g:1851:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExistantialClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExistantialClassAccess().getOnPropertyPropertyDefinitionCrossReference_8_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_29=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getExistantialClassAccess().getToDataDefinitionKeyword_9());
            		
            // InternalDSL.g:1869:3: ( ( ruleEString ) )
            // InternalDSL.g:1870:4: ( ruleEString )
            {
            // InternalDSL.g:1870:4: ( ruleEString )
            // InternalDSL.g:1871:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExistantialClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExistantialClassAccess().getToDataDefinitionDataTypeDefinitionCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getExistantialClassAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleExistantialClass"


    // $ANTLR start "entryRuleHasValueClass"
    // InternalDSL.g:1893:1: entryRuleHasValueClass returns [EObject current=null] : iv_ruleHasValueClass= ruleHasValueClass EOF ;
    public final EObject entryRuleHasValueClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasValueClass = null;


        try {
            // InternalDSL.g:1893:54: (iv_ruleHasValueClass= ruleHasValueClass EOF )
            // InternalDSL.g:1894:2: iv_ruleHasValueClass= ruleHasValueClass EOF
            {
             newCompositeNode(grammarAccess.getHasValueClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHasValueClass=ruleHasValueClass();

            state._fsp--;

             current =iv_ruleHasValueClass; 
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
    // $ANTLR end "entryRuleHasValueClass"


    // $ANTLR start "ruleHasValueClass"
    // InternalDSL.g:1900:1: ruleHasValueClass returns [EObject current=null] : (otherlv_0= 'HasValueClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' ) ;
    public final EObject ruleHasValueClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1906:2: ( (otherlv_0= 'HasValueClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' ) )
            // InternalDSL.g:1907:2: (otherlv_0= 'HasValueClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' )
            {
            // InternalDSL.g:1907:2: (otherlv_0= 'HasValueClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}' )
            // InternalDSL.g:1908:3: otherlv_0= 'HasValueClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'onProperty' ( ( ruleEString ) ) otherlv_29= 'toDataDefinition' ( ( ruleEString ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHasValueClassAccess().getHasValueClassKeyword_0());
            		
            // InternalDSL.g:1912:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1913:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1913:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1914:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHasValueClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHasValueClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getHasValueClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:1935:3: (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDSL.g:1936:4: otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getHasValueClassAccess().getSubClassOfKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getHasValueClassAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDSL.g:1944:4: ( ( ruleEString ) )
                    // InternalDSL.g:1945:5: ( ruleEString )
                    {
                    // InternalDSL.g:1945:5: ( ruleEString )
                    // InternalDSL.g:1946:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHasValueClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHasValueClassAccess().getSubClassOfClassDefinitionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1960:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalDSL.g:1961:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHasValueClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDSL.g:1965:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1966:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1966:6: ( ruleEString )
                    	    // InternalDSL.g:1967:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHasValueClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHasValueClassAccess().getSubClassOfClassDefinitionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getHasValueClassAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1987:3: (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==22) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDSL.g:1988:4: otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getHasValueClassAccess().getDisjointWithKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getHasValueClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDSL.g:1996:4: ( ( ruleEString ) )
                    // InternalDSL.g:1997:5: ( ruleEString )
                    {
                    // InternalDSL.g:1997:5: ( ruleEString )
                    // InternalDSL.g:1998:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHasValueClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHasValueClassAccess().getDisjointWithClassDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2012:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalDSL.g:2013:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getHasValueClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:2017:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2018:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2018:6: ( ruleEString )
                    	    // InternalDSL.g:2019:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHasValueClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHasValueClassAccess().getDisjointWithClassDefinitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_27); 

                    				newLeafNode(otherlv_14, grammarAccess.getHasValueClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2039:3: (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==23) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDSL.g:2040:4: otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getHasValueClassAccess().getEquivalentToKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getHasValueClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:2048:4: ( ( ruleEString ) )
                    // InternalDSL.g:2049:5: ( ruleEString )
                    {
                    // InternalDSL.g:2049:5: ( ruleEString )
                    // InternalDSL.g:2050:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHasValueClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHasValueClassAccess().getEquivalentToClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2064:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalDSL.g:2065:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getHasValueClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:2069:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2070:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2070:6: ( ruleEString )
                    	    // InternalDSL.g:2071:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHasValueClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHasValueClassAccess().getEquivalentToClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_20, grammarAccess.getHasValueClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2091:3: (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==24) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDSL.g:2092:4: otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getHasValueClassAccess().getDescribedByKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getHasValueClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:2100:4: ( ( ruleEString ) )
                    // InternalDSL.g:2101:5: ( ruleEString )
                    {
                    // InternalDSL.g:2101:5: ( ruleEString )
                    // InternalDSL.g:2102:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHasValueClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHasValueClassAccess().getDescribedByPropertyDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2116:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalDSL.g:2117:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getHasValueClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:2121:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2122:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2122:6: ( ruleEString )
                    	    // InternalDSL.g:2123:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHasValueClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHasValueClassAccess().getDescribedByPropertyDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_29); 

                    				newLeafNode(otherlv_26, grammarAccess.getHasValueClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getHasValueClassAccess().getOnPropertyKeyword_7());
            		
            // InternalDSL.g:2147:3: ( ( ruleEString ) )
            // InternalDSL.g:2148:4: ( ruleEString )
            {
            // InternalDSL.g:2148:4: ( ruleEString )
            // InternalDSL.g:2149:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHasValueClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getHasValueClassAccess().getOnPropertyPropertyDefinitionCrossReference_8_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_29=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getHasValueClassAccess().getToDataDefinitionKeyword_9());
            		
            // InternalDSL.g:2167:3: ( ( ruleEString ) )
            // InternalDSL.g:2168:4: ( ruleEString )
            {
            // InternalDSL.g:2168:4: ( ruleEString )
            // InternalDSL.g:2169:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHasValueClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getHasValueClassAccess().getToDataDefinitionDataTypeDefinitionCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getHasValueClassAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleHasValueClass"


    // $ANTLR start "entryRuleMaxCardinalityClass"
    // InternalDSL.g:2191:1: entryRuleMaxCardinalityClass returns [EObject current=null] : iv_ruleMaxCardinalityClass= ruleMaxCardinalityClass EOF ;
    public final EObject entryRuleMaxCardinalityClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxCardinalityClass = null;


        try {
            // InternalDSL.g:2191:60: (iv_ruleMaxCardinalityClass= ruleMaxCardinalityClass EOF )
            // InternalDSL.g:2192:2: iv_ruleMaxCardinalityClass= ruleMaxCardinalityClass EOF
            {
             newCompositeNode(grammarAccess.getMaxCardinalityClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxCardinalityClass=ruleMaxCardinalityClass();

            state._fsp--;

             current =iv_ruleMaxCardinalityClass; 
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
    // $ANTLR end "entryRuleMaxCardinalityClass"


    // $ANTLR start "ruleMaxCardinalityClass"
    // InternalDSL.g:2198:1: ruleMaxCardinalityClass returns [EObject current=null] : (otherlv_0= 'MaxCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'maxCard' ( (lv_maxCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' ) ;
    public final EObject ruleMaxCardinalityClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_maxCard_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2204:2: ( (otherlv_0= 'MaxCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'maxCard' ( (lv_maxCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' ) )
            // InternalDSL.g:2205:2: (otherlv_0= 'MaxCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'maxCard' ( (lv_maxCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' )
            {
            // InternalDSL.g:2205:2: (otherlv_0= 'MaxCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'maxCard' ( (lv_maxCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' )
            // InternalDSL.g:2206:3: otherlv_0= 'MaxCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'maxCard' ( (lv_maxCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxCardinalityClassAccess().getMaxCardinalityClassKeyword_0());
            		
            // InternalDSL.g:2210:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:2211:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:2211:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:2212:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxCardinalityClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxCardinalityClassAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getMaxCardinalityClassAccess().getMaxCardKeyword_3());
            		
            // InternalDSL.g:2237:3: ( (lv_maxCard_4_0= ruleEInt ) )
            // InternalDSL.g:2238:4: (lv_maxCard_4_0= ruleEInt )
            {
            // InternalDSL.g:2238:4: (lv_maxCard_4_0= ruleEInt )
            // InternalDSL.g:2239:5: lv_maxCard_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getMaxCardEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_maxCard_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxCardinalityClassRule());
            					}
            					set(
            						current,
            						"maxCard",
            						lv_maxCard_4_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:2256:3: (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==19) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDSL.g:2257:4: otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getMaxCardinalityClassAccess().getSubClassOfKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMaxCardinalityClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:2265:4: ( ( ruleEString ) )
                    // InternalDSL.g:2266:5: ( ruleEString )
                    {
                    // InternalDSL.g:2266:5: ( ruleEString )
                    // InternalDSL.g:2267:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaxCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getSubClassOfClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2281:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==14) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalDSL.g:2282:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMaxCardinalityClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:2286:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2287:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2287:6: ( ruleEString )
                    	    // InternalDSL.g:2288:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMaxCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getSubClassOfClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getMaxCardinalityClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2308:3: (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==22) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDSL.g:2309:4: otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getMaxCardinalityClassAccess().getDisjointWithKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getMaxCardinalityClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:2317:4: ( ( ruleEString ) )
                    // InternalDSL.g:2318:5: ( ruleEString )
                    {
                    // InternalDSL.g:2318:5: ( ruleEString )
                    // InternalDSL.g:2319:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaxCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getDisjointWithClassDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2333:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==14) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalDSL.g:2334:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getMaxCardinalityClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:2338:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2339:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2339:6: ( ruleEString )
                    	    // InternalDSL.g:2340:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMaxCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getDisjointWithClassDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,21,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getMaxCardinalityClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2360:3: (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==23) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDSL.g:2361:4: otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getMaxCardinalityClassAccess().getEquivalentToKeyword_7_0());
                    			
                    otherlv_18=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getMaxCardinalityClassAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalDSL.g:2369:4: ( ( ruleEString ) )
                    // InternalDSL.g:2370:5: ( ruleEString )
                    {
                    // InternalDSL.g:2370:5: ( ruleEString )
                    // InternalDSL.g:2371:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaxCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getEquivalentToClassDefinitionCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2385:4: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalDSL.g:2386:5: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getMaxCardinalityClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDSL.g:2390:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2391:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2391:6: ( ruleEString )
                    	    // InternalDSL.g:2392:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMaxCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getEquivalentToClassDefinitionCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_22, grammarAccess.getMaxCardinalityClassAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2412:3: (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==24) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDSL.g:2413:4: otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')'
                    {
                    otherlv_23=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getMaxCardinalityClassAccess().getDescribedByKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getMaxCardinalityClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalDSL.g:2421:4: ( ( ruleEString ) )
                    // InternalDSL.g:2422:5: ( ruleEString )
                    {
                    // InternalDSL.g:2422:5: ( ruleEString )
                    // InternalDSL.g:2423:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaxCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getDescribedByPropertyDefinitionCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2437:4: (otherlv_26= ',' ( ( ruleEString ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==14) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalDSL.g:2438:5: otherlv_26= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getMaxCardinalityClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalDSL.g:2442:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2443:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2443:6: ( ruleEString )
                    	    // InternalDSL.g:2444:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMaxCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getDescribedByPropertyDefinitionCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,21,FOLLOW_29); 

                    				newLeafNode(otherlv_28, grammarAccess.getMaxCardinalityClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getMaxCardinalityClassAccess().getOnPropertyKeyword_9());
            		
            // InternalDSL.g:2468:3: ( ( ruleEString ) )
            // InternalDSL.g:2469:4: ( ruleEString )
            {
            // InternalDSL.g:2469:4: ( ruleEString )
            // InternalDSL.g:2470:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxCardinalityClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMaxCardinalityClassAccess().getOnPropertyPropertyDefinitionCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getMaxCardinalityClassAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleMaxCardinalityClass"


    // $ANTLR start "entryRuleMinCardinalityClass"
    // InternalDSL.g:2492:1: entryRuleMinCardinalityClass returns [EObject current=null] : iv_ruleMinCardinalityClass= ruleMinCardinalityClass EOF ;
    public final EObject entryRuleMinCardinalityClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinCardinalityClass = null;


        try {
            // InternalDSL.g:2492:60: (iv_ruleMinCardinalityClass= ruleMinCardinalityClass EOF )
            // InternalDSL.g:2493:2: iv_ruleMinCardinalityClass= ruleMinCardinalityClass EOF
            {
             newCompositeNode(grammarAccess.getMinCardinalityClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinCardinalityClass=ruleMinCardinalityClass();

            state._fsp--;

             current =iv_ruleMinCardinalityClass; 
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
    // $ANTLR end "entryRuleMinCardinalityClass"


    // $ANTLR start "ruleMinCardinalityClass"
    // InternalDSL.g:2499:1: ruleMinCardinalityClass returns [EObject current=null] : (otherlv_0= 'MinCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minCard' ( (lv_minCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' ) ;
    public final EObject ruleMinCardinalityClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_minCard_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2505:2: ( (otherlv_0= 'MinCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minCard' ( (lv_minCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' ) )
            // InternalDSL.g:2506:2: (otherlv_0= 'MinCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minCard' ( (lv_minCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' )
            {
            // InternalDSL.g:2506:2: (otherlv_0= 'MinCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minCard' ( (lv_minCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' )
            // InternalDSL.g:2507:3: otherlv_0= 'MinCardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minCard' ( (lv_minCard_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMinCardinalityClassAccess().getMinCardinalityClassKeyword_0());
            		
            // InternalDSL.g:2511:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:2512:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:2512:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:2513:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinCardinalityClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getMinCardinalityClassAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getMinCardinalityClassAccess().getMinCardKeyword_3());
            		
            // InternalDSL.g:2538:3: ( (lv_minCard_4_0= ruleEInt ) )
            // InternalDSL.g:2539:4: (lv_minCard_4_0= ruleEInt )
            {
            // InternalDSL.g:2539:4: (lv_minCard_4_0= ruleEInt )
            // InternalDSL.g:2540:5: lv_minCard_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getMinCardEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_minCard_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinCardinalityClassRule());
            					}
            					set(
            						current,
            						"minCard",
            						lv_minCard_4_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:2557:3: (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==19) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDSL.g:2558:4: otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getMinCardinalityClassAccess().getSubClassOfKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMinCardinalityClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:2566:4: ( ( ruleEString ) )
                    // InternalDSL.g:2567:5: ( ruleEString )
                    {
                    // InternalDSL.g:2567:5: ( ruleEString )
                    // InternalDSL.g:2568:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMinCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getSubClassOfClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2582:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalDSL.g:2583:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMinCardinalityClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:2587:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2588:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2588:6: ( ruleEString )
                    	    // InternalDSL.g:2589:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMinCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getSubClassOfClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getMinCardinalityClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2609:3: (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==22) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDSL.g:2610:4: otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getMinCardinalityClassAccess().getDisjointWithKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getMinCardinalityClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:2618:4: ( ( ruleEString ) )
                    // InternalDSL.g:2619:5: ( ruleEString )
                    {
                    // InternalDSL.g:2619:5: ( ruleEString )
                    // InternalDSL.g:2620:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMinCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getDisjointWithClassDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2634:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==14) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalDSL.g:2635:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getMinCardinalityClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:2639:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2640:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2640:6: ( ruleEString )
                    	    // InternalDSL.g:2641:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMinCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getDisjointWithClassDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,21,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getMinCardinalityClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2661:3: (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==23) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDSL.g:2662:4: otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getMinCardinalityClassAccess().getEquivalentToKeyword_7_0());
                    			
                    otherlv_18=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getMinCardinalityClassAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalDSL.g:2670:4: ( ( ruleEString ) )
                    // InternalDSL.g:2671:5: ( ruleEString )
                    {
                    // InternalDSL.g:2671:5: ( ruleEString )
                    // InternalDSL.g:2672:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMinCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getEquivalentToClassDefinitionCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2686:4: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalDSL.g:2687:5: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getMinCardinalityClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDSL.g:2691:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2692:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2692:6: ( ruleEString )
                    	    // InternalDSL.g:2693:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMinCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getEquivalentToClassDefinitionCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_22, grammarAccess.getMinCardinalityClassAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2713:3: (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==24) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDSL.g:2714:4: otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')'
                    {
                    otherlv_23=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getMinCardinalityClassAccess().getDescribedByKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getMinCardinalityClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalDSL.g:2722:4: ( ( ruleEString ) )
                    // InternalDSL.g:2723:5: ( ruleEString )
                    {
                    // InternalDSL.g:2723:5: ( ruleEString )
                    // InternalDSL.g:2724:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMinCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getDescribedByPropertyDefinitionCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2738:4: (otherlv_26= ',' ( ( ruleEString ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==14) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalDSL.g:2739:5: otherlv_26= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getMinCardinalityClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalDSL.g:2743:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2744:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2744:6: ( ruleEString )
                    	    // InternalDSL.g:2745:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMinCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getDescribedByPropertyDefinitionCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,21,FOLLOW_29); 

                    				newLeafNode(otherlv_28, grammarAccess.getMinCardinalityClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getMinCardinalityClassAccess().getOnPropertyKeyword_9());
            		
            // InternalDSL.g:2769:3: ( ( ruleEString ) )
            // InternalDSL.g:2770:4: ( ruleEString )
            {
            // InternalDSL.g:2770:4: ( ruleEString )
            // InternalDSL.g:2771:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinCardinalityClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMinCardinalityClassAccess().getOnPropertyPropertyDefinitionCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getMinCardinalityClassAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleMinCardinalityClass"


    // $ANTLR start "entryRuleCardinalityClass"
    // InternalDSL.g:2793:1: entryRuleCardinalityClass returns [EObject current=null] : iv_ruleCardinalityClass= ruleCardinalityClass EOF ;
    public final EObject entryRuleCardinalityClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalityClass = null;


        try {
            // InternalDSL.g:2793:57: (iv_ruleCardinalityClass= ruleCardinalityClass EOF )
            // InternalDSL.g:2794:2: iv_ruleCardinalityClass= ruleCardinalityClass EOF
            {
             newCompositeNode(grammarAccess.getCardinalityClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalityClass=ruleCardinalityClass();

            state._fsp--;

             current =iv_ruleCardinalityClass; 
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
    // $ANTLR end "entryRuleCardinalityClass"


    // $ANTLR start "ruleCardinalityClass"
    // InternalDSL.g:2800:1: ruleCardinalityClass returns [EObject current=null] : (otherlv_0= 'CardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'card' ( (lv_card_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' ) ;
    public final EObject ruleCardinalityClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_card_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2806:2: ( (otherlv_0= 'CardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'card' ( (lv_card_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' ) )
            // InternalDSL.g:2807:2: (otherlv_0= 'CardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'card' ( (lv_card_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' )
            {
            // InternalDSL.g:2807:2: (otherlv_0= 'CardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'card' ( (lv_card_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}' )
            // InternalDSL.g:2808:3: otherlv_0= 'CardinalityClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'card' ( (lv_card_4_0= ruleEInt ) ) (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= 'onProperty' ( ( ruleEString ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinalityClassAccess().getCardinalityClassKeyword_0());
            		
            // InternalDSL.g:2812:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:2813:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:2813:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:2814:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardinalityClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinalityClassAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getCardinalityClassAccess().getCardKeyword_3());
            		
            // InternalDSL.g:2839:3: ( (lv_card_4_0= ruleEInt ) )
            // InternalDSL.g:2840:4: (lv_card_4_0= ruleEInt )
            {
            // InternalDSL.g:2840:4: (lv_card_4_0= ruleEInt )
            // InternalDSL.g:2841:5: lv_card_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalityClassAccess().getCardEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_card_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityClassRule());
            					}
            					set(
            						current,
            						"card",
            						lv_card_4_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:2858:3: (otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==19) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDSL.g:2859:4: otherlv_5= 'subClassOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getCardinalityClassAccess().getSubClassOfKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCardinalityClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:2867:4: ( ( ruleEString ) )
                    // InternalDSL.g:2868:5: ( ruleEString )
                    {
                    // InternalDSL.g:2868:5: ( ruleEString )
                    // InternalDSL.g:2869:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCardinalityClassAccess().getSubClassOfClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2883:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==14) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalDSL.g:2884:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCardinalityClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:2888:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2889:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2889:6: ( ruleEString )
                    	    // InternalDSL.g:2890:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCardinalityClassAccess().getSubClassOfClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getCardinalityClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2910:3: (otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==22) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalDSL.g:2911:4: otherlv_11= 'disjointWith' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getCardinalityClassAccess().getDisjointWithKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getCardinalityClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:2919:4: ( ( ruleEString ) )
                    // InternalDSL.g:2920:5: ( ruleEString )
                    {
                    // InternalDSL.g:2920:5: ( ruleEString )
                    // InternalDSL.g:2921:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCardinalityClassAccess().getDisjointWithClassDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2935:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==14) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalDSL.g:2936:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getCardinalityClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:2940:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2941:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2941:6: ( ruleEString )
                    	    // InternalDSL.g:2942:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCardinalityClassAccess().getDisjointWithClassDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,21,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getCardinalityClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:2962:3: (otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==23) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDSL.g:2963:4: otherlv_17= 'equivalentTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getCardinalityClassAccess().getEquivalentToKeyword_7_0());
                    			
                    otherlv_18=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getCardinalityClassAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalDSL.g:2971:4: ( ( ruleEString ) )
                    // InternalDSL.g:2972:5: ( ruleEString )
                    {
                    // InternalDSL.g:2972:5: ( ruleEString )
                    // InternalDSL.g:2973:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCardinalityClassAccess().getEquivalentToClassDefinitionCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:2987:4: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==14) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalDSL.g:2988:5: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getCardinalityClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDSL.g:2992:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:2993:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:2993:6: ( ruleEString )
                    	    // InternalDSL.g:2994:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCardinalityClassAccess().getEquivalentToClassDefinitionCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_22, grammarAccess.getCardinalityClassAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3014:3: (otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==24) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalDSL.g:3015:4: otherlv_23= 'describedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')'
                    {
                    otherlv_23=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getCardinalityClassAccess().getDescribedByKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getCardinalityClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalDSL.g:3023:4: ( ( ruleEString ) )
                    // InternalDSL.g:3024:5: ( ruleEString )
                    {
                    // InternalDSL.g:3024:5: ( ruleEString )
                    // InternalDSL.g:3025:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCardinalityClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCardinalityClassAccess().getDescribedByPropertyDefinitionCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3039:4: (otherlv_26= ',' ( ( ruleEString ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==14) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalDSL.g:3040:5: otherlv_26= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getCardinalityClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalDSL.g:3044:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3045:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3045:6: ( ruleEString )
                    	    // InternalDSL.g:3046:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCardinalityClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCardinalityClassAccess().getDescribedByPropertyDefinitionCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,21,FOLLOW_29); 

                    				newLeafNode(otherlv_28, grammarAccess.getCardinalityClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getCardinalityClassAccess().getOnPropertyKeyword_9());
            		
            // InternalDSL.g:3070:3: ( ( ruleEString ) )
            // InternalDSL.g:3071:4: ( ruleEString )
            {
            // InternalDSL.g:3071:4: ( ruleEString )
            // InternalDSL.g:3072:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardinalityClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCardinalityClassAccess().getOnPropertyPropertyDefinitionCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getCardinalityClassAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleCardinalityClass"


    // $ANTLR start "entryRuleEnumeratedClass"
    // InternalDSL.g:3094:1: entryRuleEnumeratedClass returns [EObject current=null] : iv_ruleEnumeratedClass= ruleEnumeratedClass EOF ;
    public final EObject entryRuleEnumeratedClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeratedClass = null;


        try {
            // InternalDSL.g:3094:56: (iv_ruleEnumeratedClass= ruleEnumeratedClass EOF )
            // InternalDSL.g:3095:2: iv_ruleEnumeratedClass= ruleEnumeratedClass EOF
            {
             newCompositeNode(grammarAccess.getEnumeratedClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeratedClass=ruleEnumeratedClass();

            state._fsp--;

             current =iv_ruleEnumeratedClass; 
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
    // $ANTLR end "entryRuleEnumeratedClass"


    // $ANTLR start "ruleEnumeratedClass"
    // InternalDSL.g:3101:1: ruleEnumeratedClass returns [EObject current=null] : (otherlv_0= 'EnumeratedClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'oneOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' ) ;
    public final EObject ruleEnumeratedClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:3107:2: ( (otherlv_0= 'EnumeratedClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'oneOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' ) )
            // InternalDSL.g:3108:2: (otherlv_0= 'EnumeratedClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'oneOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' )
            {
            // InternalDSL.g:3108:2: (otherlv_0= 'EnumeratedClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'oneOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' )
            // InternalDSL.g:3109:3: otherlv_0= 'EnumeratedClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'oneOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumeratedClassAccess().getEnumeratedClassKeyword_0());
            		
            // InternalDSL.g:3113:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:3114:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:3114:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:3115:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumeratedClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumeratedClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumeratedClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:3136:3: (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==19) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalDSL.g:3137:4: otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumeratedClassAccess().getSubClassOfKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnumeratedClassAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDSL.g:3145:4: ( ( ruleEString ) )
                    // InternalDSL.g:3146:5: ( ruleEString )
                    {
                    // InternalDSL.g:3146:5: ( ruleEString )
                    // InternalDSL.g:3147:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumeratedClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnumeratedClassAccess().getSubClassOfClassDefinitionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3161:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==14) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalDSL.g:3162:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEnumeratedClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDSL.g:3166:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3167:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3167:6: ( ruleEString )
                    	    // InternalDSL.g:3168:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEnumeratedClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEnumeratedClassAccess().getSubClassOfClassDefinitionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnumeratedClassAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3188:3: (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==22) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDSL.g:3189:4: otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnumeratedClassAccess().getDisjointWithKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnumeratedClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDSL.g:3197:4: ( ( ruleEString ) )
                    // InternalDSL.g:3198:5: ( ruleEString )
                    {
                    // InternalDSL.g:3198:5: ( ruleEString )
                    // InternalDSL.g:3199:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumeratedClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnumeratedClassAccess().getDisjointWithClassDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3213:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==14) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalDSL.g:3214:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEnumeratedClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:3218:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3219:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3219:6: ( ruleEString )
                    	    // InternalDSL.g:3220:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEnumeratedClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEnumeratedClassAccess().getDisjointWithClassDefinitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_37); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnumeratedClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3240:3: (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==23) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDSL.g:3241:4: otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getEnumeratedClassAccess().getEquivalentToKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getEnumeratedClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:3249:4: ( ( ruleEString ) )
                    // InternalDSL.g:3250:5: ( ruleEString )
                    {
                    // InternalDSL.g:3250:5: ( ruleEString )
                    // InternalDSL.g:3251:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumeratedClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnumeratedClassAccess().getEquivalentToClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3265:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==14) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalDSL.g:3266:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getEnumeratedClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:3270:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3271:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3271:6: ( ruleEString )
                    	    // InternalDSL.g:3272:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEnumeratedClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEnumeratedClassAccess().getEquivalentToClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_38); 

                    				newLeafNode(otherlv_20, grammarAccess.getEnumeratedClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3292:3: (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==24) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalDSL.g:3293:4: otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getEnumeratedClassAccess().getDescribedByKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getEnumeratedClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:3301:4: ( ( ruleEString ) )
                    // InternalDSL.g:3302:5: ( ruleEString )
                    {
                    // InternalDSL.g:3302:5: ( ruleEString )
                    // InternalDSL.g:3303:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumeratedClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnumeratedClassAccess().getDescribedByPropertyDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3317:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==14) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalDSL.g:3318:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getEnumeratedClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:3322:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3323:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3323:6: ( ruleEString )
                    	    // InternalDSL.g:3324:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEnumeratedClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEnumeratedClassAccess().getDescribedByPropertyDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_39); 

                    				newLeafNode(otherlv_26, grammarAccess.getEnumeratedClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_27, grammarAccess.getEnumeratedClassAccess().getOneOfKeyword_7());
            		
            otherlv_28=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_28, grammarAccess.getEnumeratedClassAccess().getLeftParenthesisKeyword_8());
            		
            // InternalDSL.g:3352:3: ( ( ruleEString ) )
            // InternalDSL.g:3353:4: ( ruleEString )
            {
            // InternalDSL.g:3353:4: ( ruleEString )
            // InternalDSL.g:3354:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumeratedClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnumeratedClassAccess().getOneOfSingleValueCrossReference_9_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:3368:3: (otherlv_30= ',' ( ( ruleEString ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==14) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalDSL.g:3369:4: otherlv_30= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_30, grammarAccess.getEnumeratedClassAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalDSL.g:3373:4: ( ( ruleEString ) )
            	    // InternalDSL.g:3374:5: ( ruleEString )
            	    {
            	    // InternalDSL.g:3374:5: ( ruleEString )
            	    // InternalDSL.g:3375:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEnumeratedClassRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getEnumeratedClassAccess().getOneOfSingleValueCrossReference_10_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            otherlv_32=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_32, grammarAccess.getEnumeratedClassAccess().getRightParenthesisKeyword_11());
            		
            otherlv_33=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_33, grammarAccess.getEnumeratedClassAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleEnumeratedClass"


    // $ANTLR start "entryRuleUnionClass"
    // InternalDSL.g:3402:1: entryRuleUnionClass returns [EObject current=null] : iv_ruleUnionClass= ruleUnionClass EOF ;
    public final EObject entryRuleUnionClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionClass = null;


        try {
            // InternalDSL.g:3402:51: (iv_ruleUnionClass= ruleUnionClass EOF )
            // InternalDSL.g:3403:2: iv_ruleUnionClass= ruleUnionClass EOF
            {
             newCompositeNode(grammarAccess.getUnionClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionClass=ruleUnionClass();

            state._fsp--;

             current =iv_ruleUnionClass; 
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
    // $ANTLR end "entryRuleUnionClass"


    // $ANTLR start "ruleUnionClass"
    // InternalDSL.g:3409:1: ruleUnionClass returns [EObject current=null] : (otherlv_0= 'UnionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' ) ;
    public final EObject ruleUnionClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:3415:2: ( (otherlv_0= 'UnionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' ) )
            // InternalDSL.g:3416:2: (otherlv_0= 'UnionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' )
            {
            // InternalDSL.g:3416:2: (otherlv_0= 'UnionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' )
            // InternalDSL.g:3417:3: otherlv_0= 'UnionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnionClassAccess().getUnionClassKeyword_0());
            		
            // InternalDSL.g:3421:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:3422:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:3422:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:3423:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUnionClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnionClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getUnionClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:3444:3: (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==19) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalDSL.g:3445:4: otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnionClassAccess().getSubClassOfKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnionClassAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDSL.g:3453:4: ( ( ruleEString ) )
                    // InternalDSL.g:3454:5: ( ruleEString )
                    {
                    // InternalDSL.g:3454:5: ( ruleEString )
                    // InternalDSL.g:3455:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnionClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnionClassAccess().getSubClassOfClassDefinitionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3469:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==14) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalDSL.g:3470:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getUnionClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDSL.g:3474:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3475:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3475:6: ( ruleEString )
                    	    // InternalDSL.g:3476:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUnionClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUnionClassAccess().getSubClassOfClassDefinitionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getUnionClassAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3496:3: (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==22) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalDSL.g:3497:4: otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnionClassAccess().getDisjointWithKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getUnionClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDSL.g:3505:4: ( ( ruleEString ) )
                    // InternalDSL.g:3506:5: ( ruleEString )
                    {
                    // InternalDSL.g:3506:5: ( ruleEString )
                    // InternalDSL.g:3507:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnionClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnionClassAccess().getDisjointWithClassDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3521:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==14) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalDSL.g:3522:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getUnionClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:3526:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3527:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3527:6: ( ruleEString )
                    	    // InternalDSL.g:3528:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUnionClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUnionClassAccess().getDisjointWithClassDefinitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_42); 

                    				newLeafNode(otherlv_14, grammarAccess.getUnionClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3548:3: (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==23) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalDSL.g:3549:4: otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getUnionClassAccess().getEquivalentToKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getUnionClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:3557:4: ( ( ruleEString ) )
                    // InternalDSL.g:3558:5: ( ruleEString )
                    {
                    // InternalDSL.g:3558:5: ( ruleEString )
                    // InternalDSL.g:3559:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnionClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnionClassAccess().getEquivalentToClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3573:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==14) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalDSL.g:3574:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getUnionClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:3578:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3579:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3579:6: ( ruleEString )
                    	    // InternalDSL.g:3580:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUnionClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUnionClassAccess().getEquivalentToClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_43); 

                    				newLeafNode(otherlv_20, grammarAccess.getUnionClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3600:3: (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==24) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalDSL.g:3601:4: otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getUnionClassAccess().getDescribedByKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getUnionClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:3609:4: ( ( ruleEString ) )
                    // InternalDSL.g:3610:5: ( ruleEString )
                    {
                    // InternalDSL.g:3610:5: ( ruleEString )
                    // InternalDSL.g:3611:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnionClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUnionClassAccess().getDescribedByPropertyDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3625:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==14) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalDSL.g:3626:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getUnionClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:3630:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3631:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3631:6: ( ruleEString )
                    	    // InternalDSL.g:3632:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUnionClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUnionClassAccess().getDescribedByPropertyDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_44); 

                    				newLeafNode(otherlv_26, grammarAccess.getUnionClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_27, grammarAccess.getUnionClassAccess().getCombinationOfKeyword_7());
            		
            otherlv_28=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_28, grammarAccess.getUnionClassAccess().getLeftParenthesisKeyword_8());
            		
            // InternalDSL.g:3660:3: ( ( ruleEString ) )
            // InternalDSL.g:3661:4: ( ruleEString )
            {
            // InternalDSL.g:3661:4: ( ruleEString )
            // InternalDSL.g:3662:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnionClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnionClassAccess().getCombinationOfClassDefinitionCrossReference_9_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:3676:3: (otherlv_30= ',' ( ( ruleEString ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==14) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalDSL.g:3677:4: otherlv_30= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_30, grammarAccess.getUnionClassAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalDSL.g:3681:4: ( ( ruleEString ) )
            	    // InternalDSL.g:3682:5: ( ruleEString )
            	    {
            	    // InternalDSL.g:3682:5: ( ruleEString )
            	    // InternalDSL.g:3683:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUnionClassRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getUnionClassAccess().getCombinationOfClassDefinitionCrossReference_10_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            otherlv_32=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_32, grammarAccess.getUnionClassAccess().getRightParenthesisKeyword_11());
            		
            otherlv_33=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_33, grammarAccess.getUnionClassAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleUnionClass"


    // $ANTLR start "entryRuleIntersectionClass"
    // InternalDSL.g:3710:1: entryRuleIntersectionClass returns [EObject current=null] : iv_ruleIntersectionClass= ruleIntersectionClass EOF ;
    public final EObject entryRuleIntersectionClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionClass = null;


        try {
            // InternalDSL.g:3710:58: (iv_ruleIntersectionClass= ruleIntersectionClass EOF )
            // InternalDSL.g:3711:2: iv_ruleIntersectionClass= ruleIntersectionClass EOF
            {
             newCompositeNode(grammarAccess.getIntersectionClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntersectionClass=ruleIntersectionClass();

            state._fsp--;

             current =iv_ruleIntersectionClass; 
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
    // $ANTLR end "entryRuleIntersectionClass"


    // $ANTLR start "ruleIntersectionClass"
    // InternalDSL.g:3717:1: ruleIntersectionClass returns [EObject current=null] : (otherlv_0= 'IntersectionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' ) ;
    public final EObject ruleIntersectionClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:3723:2: ( (otherlv_0= 'IntersectionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' ) )
            // InternalDSL.g:3724:2: (otherlv_0= 'IntersectionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' )
            {
            // InternalDSL.g:3724:2: (otherlv_0= 'IntersectionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' )
            // InternalDSL.g:3725:3: otherlv_0= 'IntersectionClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntersectionClassAccess().getIntersectionClassKeyword_0());
            		
            // InternalDSL.g:3729:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:3730:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:3730:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:3731:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntersectionClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntersectionClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getIntersectionClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:3752:3: (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==19) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalDSL.g:3753:4: otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntersectionClassAccess().getSubClassOfKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntersectionClassAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDSL.g:3761:4: ( ( ruleEString ) )
                    // InternalDSL.g:3762:5: ( ruleEString )
                    {
                    // InternalDSL.g:3762:5: ( ruleEString )
                    // InternalDSL.g:3763:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntersectionClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIntersectionClassAccess().getSubClassOfClassDefinitionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3777:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==14) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalDSL.g:3778:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getIntersectionClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDSL.g:3782:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3783:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3783:6: ( ruleEString )
                    	    // InternalDSL.g:3784:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIntersectionClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIntersectionClassAccess().getSubClassOfClassDefinitionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getIntersectionClassAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3804:3: (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==22) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalDSL.g:3805:4: otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getIntersectionClassAccess().getDisjointWithKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getIntersectionClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDSL.g:3813:4: ( ( ruleEString ) )
                    // InternalDSL.g:3814:5: ( ruleEString )
                    {
                    // InternalDSL.g:3814:5: ( ruleEString )
                    // InternalDSL.g:3815:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntersectionClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIntersectionClassAccess().getDisjointWithClassDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3829:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==14) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalDSL.g:3830:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getIntersectionClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:3834:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3835:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3835:6: ( ruleEString )
                    	    // InternalDSL.g:3836:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIntersectionClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIntersectionClassAccess().getDisjointWithClassDefinitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_42); 

                    				newLeafNode(otherlv_14, grammarAccess.getIntersectionClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3856:3: (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==23) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDSL.g:3857:4: otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getIntersectionClassAccess().getEquivalentToKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getIntersectionClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:3865:4: ( ( ruleEString ) )
                    // InternalDSL.g:3866:5: ( ruleEString )
                    {
                    // InternalDSL.g:3866:5: ( ruleEString )
                    // InternalDSL.g:3867:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntersectionClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIntersectionClassAccess().getEquivalentToClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3881:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==14) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalDSL.g:3882:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getIntersectionClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:3886:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3887:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3887:6: ( ruleEString )
                    	    // InternalDSL.g:3888:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIntersectionClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIntersectionClassAccess().getEquivalentToClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_43); 

                    				newLeafNode(otherlv_20, grammarAccess.getIntersectionClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:3908:3: (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==24) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalDSL.g:3909:4: otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getIntersectionClassAccess().getDescribedByKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getIntersectionClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:3917:4: ( ( ruleEString ) )
                    // InternalDSL.g:3918:5: ( ruleEString )
                    {
                    // InternalDSL.g:3918:5: ( ruleEString )
                    // InternalDSL.g:3919:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntersectionClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIntersectionClassAccess().getDescribedByPropertyDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:3933:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==14) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalDSL.g:3934:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getIntersectionClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:3938:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:3939:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:3939:6: ( ruleEString )
                    	    // InternalDSL.g:3940:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIntersectionClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIntersectionClassAccess().getDescribedByPropertyDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_44); 

                    				newLeafNode(otherlv_26, grammarAccess.getIntersectionClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_27, grammarAccess.getIntersectionClassAccess().getCombinationOfKeyword_7());
            		
            otherlv_28=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_28, grammarAccess.getIntersectionClassAccess().getLeftParenthesisKeyword_8());
            		
            // InternalDSL.g:3968:3: ( ( ruleEString ) )
            // InternalDSL.g:3969:4: ( ruleEString )
            {
            // InternalDSL.g:3969:4: ( ruleEString )
            // InternalDSL.g:3970:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntersectionClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntersectionClassAccess().getCombinationOfClassDefinitionCrossReference_9_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:3984:3: (otherlv_30= ',' ( ( ruleEString ) ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==14) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalDSL.g:3985:4: otherlv_30= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_30, grammarAccess.getIntersectionClassAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalDSL.g:3989:4: ( ( ruleEString ) )
            	    // InternalDSL.g:3990:5: ( ruleEString )
            	    {
            	    // InternalDSL.g:3990:5: ( ruleEString )
            	    // InternalDSL.g:3991:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIntersectionClassRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getIntersectionClassAccess().getCombinationOfClassDefinitionCrossReference_10_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            otherlv_32=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_32, grammarAccess.getIntersectionClassAccess().getRightParenthesisKeyword_11());
            		
            otherlv_33=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_33, grammarAccess.getIntersectionClassAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleIntersectionClass"


    // $ANTLR start "entryRuleComplementClass"
    // InternalDSL.g:4018:1: entryRuleComplementClass returns [EObject current=null] : iv_ruleComplementClass= ruleComplementClass EOF ;
    public final EObject entryRuleComplementClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplementClass = null;


        try {
            // InternalDSL.g:4018:56: (iv_ruleComplementClass= ruleComplementClass EOF )
            // InternalDSL.g:4019:2: iv_ruleComplementClass= ruleComplementClass EOF
            {
             newCompositeNode(grammarAccess.getComplementClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplementClass=ruleComplementClass();

            state._fsp--;

             current =iv_ruleComplementClass; 
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
    // $ANTLR end "entryRuleComplementClass"


    // $ANTLR start "ruleComplementClass"
    // InternalDSL.g:4025:1: ruleComplementClass returns [EObject current=null] : (otherlv_0= 'ComplementClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' ) ;
    public final EObject ruleComplementClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:4031:2: ( (otherlv_0= 'ComplementClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' ) )
            // InternalDSL.g:4032:2: (otherlv_0= 'ComplementClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' )
            {
            // InternalDSL.g:4032:2: (otherlv_0= 'ComplementClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}' )
            // InternalDSL.g:4033:3: otherlv_0= 'ComplementClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? otherlv_27= 'combinationOf' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComplementClassAccess().getComplementClassKeyword_0());
            		
            // InternalDSL.g:4037:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:4038:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:4038:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:4039:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplementClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplementClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getComplementClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:4060:3: (otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==19) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalDSL.g:4061:4: otherlv_3= 'subClassOf' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getComplementClassAccess().getSubClassOfKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getComplementClassAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDSL.g:4069:4: ( ( ruleEString ) )
                    // InternalDSL.g:4070:5: ( ruleEString )
                    {
                    // InternalDSL.g:4070:5: ( ruleEString )
                    // InternalDSL.g:4071:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComplementClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComplementClassAccess().getSubClassOfClassDefinitionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4085:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==14) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalDSL.g:4086:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComplementClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDSL.g:4090:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:4091:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:4091:6: ( ruleEString )
                    	    // InternalDSL.g:4092:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComplementClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComplementClassAccess().getSubClassOfClassDefinitionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getComplementClassAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:4112:3: (otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==22) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalDSL.g:4113:4: otherlv_9= 'disjointWith' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getComplementClassAccess().getDisjointWithKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getComplementClassAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDSL.g:4121:4: ( ( ruleEString ) )
                    // InternalDSL.g:4122:5: ( ruleEString )
                    {
                    // InternalDSL.g:4122:5: ( ruleEString )
                    // InternalDSL.g:4123:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComplementClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComplementClassAccess().getDisjointWithClassDefinitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4137:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==14) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalDSL.g:4138:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getComplementClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDSL.g:4142:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:4143:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:4143:6: ( ruleEString )
                    	    // InternalDSL.g:4144:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComplementClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComplementClassAccess().getDisjointWithClassDefinitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_42); 

                    				newLeafNode(otherlv_14, grammarAccess.getComplementClassAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:4164:3: (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==23) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalDSL.g:4165:4: otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getComplementClassAccess().getEquivalentToKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getComplementClassAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDSL.g:4173:4: ( ( ruleEString ) )
                    // InternalDSL.g:4174:5: ( ruleEString )
                    {
                    // InternalDSL.g:4174:5: ( ruleEString )
                    // InternalDSL.g:4175:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComplementClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComplementClassAccess().getEquivalentToClassDefinitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4189:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==14) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalDSL.g:4190:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getComplementClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:4194:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:4195:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:4195:6: ( ruleEString )
                    	    // InternalDSL.g:4196:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComplementClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComplementClassAccess().getEquivalentToClassDefinitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_43); 

                    				newLeafNode(otherlv_20, grammarAccess.getComplementClassAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:4216:3: (otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==24) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalDSL.g:4217:4: otherlv_21= 'describedBy' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getComplementClassAccess().getDescribedByKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getComplementClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalDSL.g:4225:4: ( ( ruleEString ) )
                    // InternalDSL.g:4226:5: ( ruleEString )
                    {
                    // InternalDSL.g:4226:5: ( ruleEString )
                    // InternalDSL.g:4227:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComplementClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComplementClassAccess().getDescribedByPropertyDefinitionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4241:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==14) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalDSL.g:4242:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getComplementClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDSL.g:4246:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:4247:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:4247:6: ( ruleEString )
                    	    // InternalDSL.g:4248:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComplementClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComplementClassAccess().getDescribedByPropertyDefinitionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_44); 

                    				newLeafNode(otherlv_26, grammarAccess.getComplementClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_27, grammarAccess.getComplementClassAccess().getCombinationOfKeyword_7());
            		
            otherlv_28=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_28, grammarAccess.getComplementClassAccess().getLeftParenthesisKeyword_8());
            		
            // InternalDSL.g:4276:3: ( ( ruleEString ) )
            // InternalDSL.g:4277:4: ( ruleEString )
            {
            // InternalDSL.g:4277:4: ( ruleEString )
            // InternalDSL.g:4278:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplementClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComplementClassAccess().getCombinationOfClassDefinitionCrossReference_9_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:4292:3: (otherlv_30= ',' ( ( ruleEString ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==14) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalDSL.g:4293:4: otherlv_30= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_30=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_30, grammarAccess.getComplementClassAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalDSL.g:4297:4: ( ( ruleEString ) )
            	    // InternalDSL.g:4298:5: ( ruleEString )
            	    {
            	    // InternalDSL.g:4298:5: ( ruleEString )
            	    // InternalDSL.g:4299:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComplementClassRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getComplementClassAccess().getCombinationOfClassDefinitionCrossReference_10_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            otherlv_32=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_32, grammarAccess.getComplementClassAccess().getRightParenthesisKeyword_11());
            		
            otherlv_33=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_33, grammarAccess.getComplementClassAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleComplementClass"


    // $ANTLR start "entryRuleEInt"
    // InternalDSL.g:4326:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDSL.g:4326:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDSL.g:4327:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDSL.g:4333:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDSL.g:4339:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDSL.g:4340:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDSL.g:4340:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDSL.g:4341:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDSL.g:4341:3: (kw= '-' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==45) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalDSL.g:4342:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSingleValue"
    // InternalDSL.g:4359:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalDSL.g:4359:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalDSL.g:4360:2: iv_ruleSingleValue= ruleSingleValue EOF
            {
             newCompositeNode(grammarAccess.getSingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleValue=ruleSingleValue();

            state._fsp--;

             current =iv_ruleSingleValue; 
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
    // $ANTLR end "entryRuleSingleValue"


    // $ANTLR start "ruleSingleValue"
    // InternalDSL.g:4366:1: ruleSingleValue returns [EObject current=null] : (otherlv_0= 'SingleValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'isOfType' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:4372:2: ( (otherlv_0= 'SingleValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'isOfType' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalDSL.g:4373:2: (otherlv_0= 'SingleValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'isOfType' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalDSL.g:4373:2: (otherlv_0= 'SingleValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'isOfType' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalDSL.g:4374:3: otherlv_0= 'SingleValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'isOfType' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleValueAccess().getSingleValueKeyword_0());
            		
            // InternalDSL.g:4378:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:4379:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:4379:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:4380:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSingleValueAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleValueAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSingleValueAccess().getIsOfTypeKeyword_3());
            		
            // InternalDSL.g:4405:3: ( ( ruleEString ) )
            // InternalDSL.g:4406:4: ( ruleEString )
            {
            // InternalDSL.g:4406:4: ( ruleEString )
            // InternalDSL.g:4407:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleValueAccess().getIsOfTypeDataTypeDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSingleValueAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "entryRuleSimpleProperty"
    // InternalDSL.g:4429:1: entryRuleSimpleProperty returns [EObject current=null] : iv_ruleSimpleProperty= ruleSimpleProperty EOF ;
    public final EObject entryRuleSimpleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleProperty = null;


        try {
            // InternalDSL.g:4429:55: (iv_ruleSimpleProperty= ruleSimpleProperty EOF )
            // InternalDSL.g:4430:2: iv_ruleSimpleProperty= ruleSimpleProperty EOF
            {
             newCompositeNode(grammarAccess.getSimplePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleProperty=ruleSimpleProperty();

            state._fsp--;

             current =iv_ruleSimpleProperty; 
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
    // $ANTLR end "entryRuleSimpleProperty"


    // $ANTLR start "ruleSimpleProperty"
    // InternalDSL.g:4436:1: ruleSimpleProperty returns [EObject current=null] : ( () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'SimpleProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleSimpleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_isFunctional_1_0=null;
        Token lv_isSymmetric_2_0=null;
        Token lv_isTransitive_3_0=null;
        Token lv_isInverseFunctional_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:4442:2: ( ( () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'SimpleProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}' ) )
            // InternalDSL.g:4443:2: ( () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'SimpleProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}' )
            {
            // InternalDSL.g:4443:2: ( () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'SimpleProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}' )
            // InternalDSL.g:4444:3: () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'SimpleProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}'
            {
            // InternalDSL.g:4444:3: ()
            // InternalDSL.g:4445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimplePropertyAccess().getSimplePropertyAction_0(),
            					current);
            			

            }

            // InternalDSL.g:4451:3: ( (lv_isFunctional_1_0= 'isFunctional' ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==48) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalDSL.g:4452:4: (lv_isFunctional_1_0= 'isFunctional' )
                    {
                    // InternalDSL.g:4452:4: (lv_isFunctional_1_0= 'isFunctional' )
                    // InternalDSL.g:4453:5: lv_isFunctional_1_0= 'isFunctional'
                    {
                    lv_isFunctional_1_0=(Token)match(input,48,FOLLOW_47); 

                    					newLeafNode(lv_isFunctional_1_0, grammarAccess.getSimplePropertyAccess().getIsFunctionalIsFunctionalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimplePropertyRule());
                    					}
                    					setWithLastConsumed(current, "isFunctional", lv_isFunctional_1_0 != null, "isFunctional");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:4465:3: ( (lv_isSymmetric_2_0= 'isSymmetric' ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==49) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalDSL.g:4466:4: (lv_isSymmetric_2_0= 'isSymmetric' )
                    {
                    // InternalDSL.g:4466:4: (lv_isSymmetric_2_0= 'isSymmetric' )
                    // InternalDSL.g:4467:5: lv_isSymmetric_2_0= 'isSymmetric'
                    {
                    lv_isSymmetric_2_0=(Token)match(input,49,FOLLOW_48); 

                    					newLeafNode(lv_isSymmetric_2_0, grammarAccess.getSimplePropertyAccess().getIsSymmetricIsSymmetricKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimplePropertyRule());
                    					}
                    					setWithLastConsumed(current, "isSymmetric", lv_isSymmetric_2_0 != null, "isSymmetric");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:4479:3: ( (lv_isTransitive_3_0= 'isTransitive' ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==50) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalDSL.g:4480:4: (lv_isTransitive_3_0= 'isTransitive' )
                    {
                    // InternalDSL.g:4480:4: (lv_isTransitive_3_0= 'isTransitive' )
                    // InternalDSL.g:4481:5: lv_isTransitive_3_0= 'isTransitive'
                    {
                    lv_isTransitive_3_0=(Token)match(input,50,FOLLOW_49); 

                    					newLeafNode(lv_isTransitive_3_0, grammarAccess.getSimplePropertyAccess().getIsTransitiveIsTransitiveKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimplePropertyRule());
                    					}
                    					setWithLastConsumed(current, "isTransitive", lv_isTransitive_3_0 != null, "isTransitive");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:4493:3: ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==51) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalDSL.g:4494:4: (lv_isInverseFunctional_4_0= 'isInverseFunctional' )
                    {
                    // InternalDSL.g:4494:4: (lv_isInverseFunctional_4_0= 'isInverseFunctional' )
                    // InternalDSL.g:4495:5: lv_isInverseFunctional_4_0= 'isInverseFunctional'
                    {
                    lv_isInverseFunctional_4_0=(Token)match(input,51,FOLLOW_50); 

                    					newLeafNode(lv_isInverseFunctional_4_0, grammarAccess.getSimplePropertyAccess().getIsInverseFunctionalIsInverseFunctionalKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimplePropertyRule());
                    					}
                    					setWithLastConsumed(current, "isInverseFunctional", lv_isInverseFunctional_4_0 != null, "isInverseFunctional");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSimplePropertyAccess().getSimplePropertyKeyword_5());
            		
            // InternalDSL.g:4511:3: ( (lv_name_6_0= ruleEString ) )
            // InternalDSL.g:4512:4: (lv_name_6_0= ruleEString )
            {
            // InternalDSL.g:4512:4: (lv_name_6_0= ruleEString )
            // InternalDSL.g:4513:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimplePropertyAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimplePropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_7, grammarAccess.getSimplePropertyAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDSL.g:4534:3: (otherlv_8= 'range' ( ( ruleEString ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==53) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalDSL.g:4535:4: otherlv_8= 'range' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSimplePropertyAccess().getRangeKeyword_8_0());
                    			
                    // InternalDSL.g:4539:4: ( ( ruleEString ) )
                    // InternalDSL.g:4540:5: ( ruleEString )
                    {
                    // InternalDSL.g:4540:5: ( ruleEString )
                    // InternalDSL.g:4541:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimplePropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimplePropertyAccess().getRangeDataTypeDefinitionCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDSL.g:4556:3: (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==54) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalDSL.g:4557:4: otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,54,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getSimplePropertyAccess().getSubPropertyOfKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getSimplePropertyAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalDSL.g:4565:4: ( ( ruleEString ) )
                    // InternalDSL.g:4566:5: ( ruleEString )
                    {
                    // InternalDSL.g:4566:5: ( ruleEString )
                    // InternalDSL.g:4567:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimplePropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimplePropertyAccess().getSubPropertyOfPropertyDefinitionCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4581:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==14) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalDSL.g:4582:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSimplePropertyAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalDSL.g:4586:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:4587:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:4587:6: ( ruleEString )
                    	    // InternalDSL.g:4588:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSimplePropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSimplePropertyAccess().getSubPropertyOfPropertyDefinitionCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,21,FOLLOW_53); 

                    				newLeafNode(otherlv_15, grammarAccess.getSimplePropertyAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:4608:3: (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==23) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalDSL.g:4609:4: otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getSimplePropertyAccess().getEquivalentToKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getSimplePropertyAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalDSL.g:4617:4: ( ( ruleEString ) )
                    // InternalDSL.g:4618:5: ( ruleEString )
                    {
                    // InternalDSL.g:4618:5: ( ruleEString )
                    // InternalDSL.g:4619:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimplePropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimplePropertyAccess().getEquivalentToPropertyDefinitionCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4633:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==14) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalDSL.g:4634:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSimplePropertyAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalDSL.g:4638:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:4639:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:4639:6: ( ruleEString )
                    	    // InternalDSL.g:4640:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSimplePropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSimplePropertyAccess().getEquivalentToPropertyDefinitionCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,21,FOLLOW_54); 

                    				newLeafNode(otherlv_21, grammarAccess.getSimplePropertyAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:4660:3: (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==55) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalDSL.g:4661:4: otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')'
                    {
                    otherlv_22=(Token)match(input,55,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getSimplePropertyAccess().getInverseOfKeyword_11_0());
                    			
                    otherlv_23=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getSimplePropertyAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalDSL.g:4669:4: ( ( ruleEString ) )
                    // InternalDSL.g:4670:5: ( ruleEString )
                    {
                    // InternalDSL.g:4670:5: ( ruleEString )
                    // InternalDSL.g:4671:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimplePropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimplePropertyAccess().getInverseOfPropertyDefinitionCrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4685:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==14) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalDSL.g:4686:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getSimplePropertyAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalDSL.g:4690:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:4691:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:4691:6: ( ruleEString )
                    	    // InternalDSL.g:4692:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSimplePropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSimplePropertyAccess().getInverseOfPropertyDefinitionCrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,21,FOLLOW_55); 

                    				newLeafNode(otherlv_27, grammarAccess.getSimplePropertyAccess().getRightParenthesisKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:4712:3: (otherlv_28= 'domain' ( ( ruleEString ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==56) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalDSL.g:4713:4: otherlv_28= 'domain' ( ( ruleEString ) )
                    {
                    otherlv_28=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getSimplePropertyAccess().getDomainKeyword_12_0());
                    			
                    // InternalDSL.g:4717:4: ( ( ruleEString ) )
                    // InternalDSL.g:4718:5: ( ruleEString )
                    {
                    // InternalDSL.g:4718:5: ( ruleEString )
                    // InternalDSL.g:4719:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimplePropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimplePropertyAccess().getDomainClassDefinitionCrossReference_12_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getSimplePropertyAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleSimpleProperty"


    // $ANTLR start "entryRuleConditionProperty"
    // InternalDSL.g:4742:1: entryRuleConditionProperty returns [EObject current=null] : iv_ruleConditionProperty= ruleConditionProperty EOF ;
    public final EObject entryRuleConditionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionProperty = null;


        try {
            // InternalDSL.g:4742:58: (iv_ruleConditionProperty= ruleConditionProperty EOF )
            // InternalDSL.g:4743:2: iv_ruleConditionProperty= ruleConditionProperty EOF
            {
             newCompositeNode(grammarAccess.getConditionPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionProperty=ruleConditionProperty();

            state._fsp--;

             current =iv_ruleConditionProperty; 
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
    // $ANTLR end "entryRuleConditionProperty"


    // $ANTLR start "ruleConditionProperty"
    // InternalDSL.g:4749:1: ruleConditionProperty returns [EObject current=null] : ( () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'ConditionProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleConditionProperty() throws RecognitionException {
        EObject current = null;

        Token lv_isFunctional_1_0=null;
        Token lv_isSymmetric_2_0=null;
        Token lv_isTransitive_3_0=null;
        Token lv_isInverseFunctional_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:4755:2: ( ( () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'ConditionProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}' ) )
            // InternalDSL.g:4756:2: ( () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'ConditionProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}' )
            {
            // InternalDSL.g:4756:2: ( () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'ConditionProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}' )
            // InternalDSL.g:4757:3: () ( (lv_isFunctional_1_0= 'isFunctional' ) )? ( (lv_isSymmetric_2_0= 'isSymmetric' ) )? ( (lv_isTransitive_3_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )? otherlv_5= 'ConditionProperty' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'range' ( ( ruleEString ) ) )? (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )? (otherlv_28= 'domain' ( ( ruleEString ) ) )? otherlv_30= '}'
            {
            // InternalDSL.g:4757:3: ()
            // InternalDSL.g:4758:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionPropertyAccess().getConditionPropertyAction_0(),
            					current);
            			

            }

            // InternalDSL.g:4764:3: ( (lv_isFunctional_1_0= 'isFunctional' ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==48) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalDSL.g:4765:4: (lv_isFunctional_1_0= 'isFunctional' )
                    {
                    // InternalDSL.g:4765:4: (lv_isFunctional_1_0= 'isFunctional' )
                    // InternalDSL.g:4766:5: lv_isFunctional_1_0= 'isFunctional'
                    {
                    lv_isFunctional_1_0=(Token)match(input,48,FOLLOW_56); 

                    					newLeafNode(lv_isFunctional_1_0, grammarAccess.getConditionPropertyAccess().getIsFunctionalIsFunctionalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionPropertyRule());
                    					}
                    					setWithLastConsumed(current, "isFunctional", lv_isFunctional_1_0 != null, "isFunctional");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:4778:3: ( (lv_isSymmetric_2_0= 'isSymmetric' ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==49) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalDSL.g:4779:4: (lv_isSymmetric_2_0= 'isSymmetric' )
                    {
                    // InternalDSL.g:4779:4: (lv_isSymmetric_2_0= 'isSymmetric' )
                    // InternalDSL.g:4780:5: lv_isSymmetric_2_0= 'isSymmetric'
                    {
                    lv_isSymmetric_2_0=(Token)match(input,49,FOLLOW_57); 

                    					newLeafNode(lv_isSymmetric_2_0, grammarAccess.getConditionPropertyAccess().getIsSymmetricIsSymmetricKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionPropertyRule());
                    					}
                    					setWithLastConsumed(current, "isSymmetric", lv_isSymmetric_2_0 != null, "isSymmetric");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:4792:3: ( (lv_isTransitive_3_0= 'isTransitive' ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==50) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalDSL.g:4793:4: (lv_isTransitive_3_0= 'isTransitive' )
                    {
                    // InternalDSL.g:4793:4: (lv_isTransitive_3_0= 'isTransitive' )
                    // InternalDSL.g:4794:5: lv_isTransitive_3_0= 'isTransitive'
                    {
                    lv_isTransitive_3_0=(Token)match(input,50,FOLLOW_58); 

                    					newLeafNode(lv_isTransitive_3_0, grammarAccess.getConditionPropertyAccess().getIsTransitiveIsTransitiveKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionPropertyRule());
                    					}
                    					setWithLastConsumed(current, "isTransitive", lv_isTransitive_3_0 != null, "isTransitive");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:4806:3: ( (lv_isInverseFunctional_4_0= 'isInverseFunctional' ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==51) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalDSL.g:4807:4: (lv_isInverseFunctional_4_0= 'isInverseFunctional' )
                    {
                    // InternalDSL.g:4807:4: (lv_isInverseFunctional_4_0= 'isInverseFunctional' )
                    // InternalDSL.g:4808:5: lv_isInverseFunctional_4_0= 'isInverseFunctional'
                    {
                    lv_isInverseFunctional_4_0=(Token)match(input,51,FOLLOW_59); 

                    					newLeafNode(lv_isInverseFunctional_4_0, grammarAccess.getConditionPropertyAccess().getIsInverseFunctionalIsInverseFunctionalKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionPropertyRule());
                    					}
                    					setWithLastConsumed(current, "isInverseFunctional", lv_isInverseFunctional_4_0 != null, "isInverseFunctional");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionPropertyAccess().getConditionPropertyKeyword_5());
            		
            // InternalDSL.g:4824:3: ( (lv_name_6_0= ruleEString ) )
            // InternalDSL.g:4825:4: (lv_name_6_0= ruleEString )
            {
            // InternalDSL.g:4825:4: (lv_name_6_0= ruleEString )
            // InternalDSL.g:4826:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionPropertyAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionPropertyAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDSL.g:4847:3: (otherlv_8= 'range' ( ( ruleEString ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==53) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalDSL.g:4848:4: otherlv_8= 'range' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionPropertyAccess().getRangeKeyword_8_0());
                    			
                    // InternalDSL.g:4852:4: ( ( ruleEString ) )
                    // InternalDSL.g:4853:5: ( ruleEString )
                    {
                    // InternalDSL.g:4853:5: ( ruleEString )
                    // InternalDSL.g:4854:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionPropertyAccess().getRangeDataTypeDefinitionCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDSL.g:4869:3: (otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==54) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalDSL.g:4870:4: otherlv_10= 'subPropertyOf' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,54,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionPropertyAccess().getSubPropertyOfKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getConditionPropertyAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalDSL.g:4878:4: ( ( ruleEString ) )
                    // InternalDSL.g:4879:5: ( ruleEString )
                    {
                    // InternalDSL.g:4879:5: ( ruleEString )
                    // InternalDSL.g:4880:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionPropertyAccess().getSubPropertyOfPropertyDefinitionCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4894:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==14) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalDSL.g:4895:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getConditionPropertyAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalDSL.g:4899:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:4900:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:4900:6: ( ruleEString )
                    	    // InternalDSL.g:4901:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConditionPropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConditionPropertyAccess().getSubPropertyOfPropertyDefinitionCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,21,FOLLOW_53); 

                    				newLeafNode(otherlv_15, grammarAccess.getConditionPropertyAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:4921:3: (otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==23) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalDSL.g:4922:4: otherlv_16= 'equivalentTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getConditionPropertyAccess().getEquivalentToKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getConditionPropertyAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalDSL.g:4930:4: ( ( ruleEString ) )
                    // InternalDSL.g:4931:5: ( ruleEString )
                    {
                    // InternalDSL.g:4931:5: ( ruleEString )
                    // InternalDSL.g:4932:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionPropertyAccess().getEquivalentToPropertyDefinitionCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4946:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==14) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalDSL.g:4947:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getConditionPropertyAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalDSL.g:4951:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:4952:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:4952:6: ( ruleEString )
                    	    // InternalDSL.g:4953:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConditionPropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConditionPropertyAccess().getEquivalentToPropertyDefinitionCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,21,FOLLOW_54); 

                    				newLeafNode(otherlv_21, grammarAccess.getConditionPropertyAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:4973:3: (otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==55) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalDSL.g:4974:4: otherlv_22= 'inverseOf' otherlv_23= '(' ( ( ruleEString ) ) (otherlv_25= ',' ( ( ruleEString ) ) )* otherlv_27= ')'
                    {
                    otherlv_22=(Token)match(input,55,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getConditionPropertyAccess().getInverseOfKeyword_11_0());
                    			
                    otherlv_23=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getConditionPropertyAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalDSL.g:4982:4: ( ( ruleEString ) )
                    // InternalDSL.g:4983:5: ( ruleEString )
                    {
                    // InternalDSL.g:4983:5: ( ruleEString )
                    // InternalDSL.g:4984:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionPropertyAccess().getInverseOfPropertyDefinitionCrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:4998:4: (otherlv_25= ',' ( ( ruleEString ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==14) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalDSL.g:4999:5: otherlv_25= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getConditionPropertyAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalDSL.g:5003:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:5004:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:5004:6: ( ruleEString )
                    	    // InternalDSL.g:5005:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConditionPropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getConditionPropertyAccess().getInverseOfPropertyDefinitionCrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,21,FOLLOW_55); 

                    				newLeafNode(otherlv_27, grammarAccess.getConditionPropertyAccess().getRightParenthesisKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:5025:3: (otherlv_28= 'domain' ( ( ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==56) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalDSL.g:5026:4: otherlv_28= 'domain' ( ( ruleEString ) )
                    {
                    otherlv_28=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getConditionPropertyAccess().getDomainKeyword_12_0());
                    			
                    // InternalDSL.g:5030:4: ( ( ruleEString ) )
                    // InternalDSL.g:5031:5: ( ruleEString )
                    {
                    // InternalDSL.g:5031:5: ( ruleEString )
                    // InternalDSL.g:5032:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionPropertyAccess().getDomainClassDefinitionCrossReference_12_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getConditionPropertyAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleConditionProperty"


    // $ANTLR start "entryRuleDependentProperty"
    // InternalDSL.g:5055:1: entryRuleDependentProperty returns [EObject current=null] : iv_ruleDependentProperty= ruleDependentProperty EOF ;
    public final EObject entryRuleDependentProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependentProperty = null;


        try {
            // InternalDSL.g:5055:58: (iv_ruleDependentProperty= ruleDependentProperty EOF )
            // InternalDSL.g:5056:2: iv_ruleDependentProperty= ruleDependentProperty EOF
            {
             newCompositeNode(grammarAccess.getDependentPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependentProperty=ruleDependentProperty();

            state._fsp--;

             current =iv_ruleDependentProperty; 
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
    // $ANTLR end "entryRuleDependentProperty"


    // $ANTLR start "ruleDependentProperty"
    // InternalDSL.g:5062:1: ruleDependentProperty returns [EObject current=null] : ( ( (lv_isFunctional_0_0= 'isFunctional' ) )? ( (lv_isSymmetric_1_0= 'isSymmetric' ) )? ( (lv_isTransitive_2_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_3_0= 'isInverseFunctional' ) )? otherlv_4= 'DependentProperty' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'range' ( ( ruleEString ) ) )? (otherlv_9= 'subPropertyOf' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'inverseOf' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'domain' ( ( ruleEString ) ) )? otherlv_29= 'dependsOn' otherlv_30= '(' ( ( ruleEString ) ) (otherlv_32= ',' ( ( ruleEString ) ) )* otherlv_34= ')' otherlv_35= '}' ) ;
    public final EObject ruleDependentProperty() throws RecognitionException {
        EObject current = null;

        Token lv_isFunctional_0_0=null;
        Token lv_isSymmetric_1_0=null;
        Token lv_isTransitive_2_0=null;
        Token lv_isInverseFunctional_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:5068:2: ( ( ( (lv_isFunctional_0_0= 'isFunctional' ) )? ( (lv_isSymmetric_1_0= 'isSymmetric' ) )? ( (lv_isTransitive_2_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_3_0= 'isInverseFunctional' ) )? otherlv_4= 'DependentProperty' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'range' ( ( ruleEString ) ) )? (otherlv_9= 'subPropertyOf' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'inverseOf' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'domain' ( ( ruleEString ) ) )? otherlv_29= 'dependsOn' otherlv_30= '(' ( ( ruleEString ) ) (otherlv_32= ',' ( ( ruleEString ) ) )* otherlv_34= ')' otherlv_35= '}' ) )
            // InternalDSL.g:5069:2: ( ( (lv_isFunctional_0_0= 'isFunctional' ) )? ( (lv_isSymmetric_1_0= 'isSymmetric' ) )? ( (lv_isTransitive_2_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_3_0= 'isInverseFunctional' ) )? otherlv_4= 'DependentProperty' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'range' ( ( ruleEString ) ) )? (otherlv_9= 'subPropertyOf' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'inverseOf' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'domain' ( ( ruleEString ) ) )? otherlv_29= 'dependsOn' otherlv_30= '(' ( ( ruleEString ) ) (otherlv_32= ',' ( ( ruleEString ) ) )* otherlv_34= ')' otherlv_35= '}' )
            {
            // InternalDSL.g:5069:2: ( ( (lv_isFunctional_0_0= 'isFunctional' ) )? ( (lv_isSymmetric_1_0= 'isSymmetric' ) )? ( (lv_isTransitive_2_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_3_0= 'isInverseFunctional' ) )? otherlv_4= 'DependentProperty' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'range' ( ( ruleEString ) ) )? (otherlv_9= 'subPropertyOf' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'inverseOf' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'domain' ( ( ruleEString ) ) )? otherlv_29= 'dependsOn' otherlv_30= '(' ( ( ruleEString ) ) (otherlv_32= ',' ( ( ruleEString ) ) )* otherlv_34= ')' otherlv_35= '}' )
            // InternalDSL.g:5070:3: ( (lv_isFunctional_0_0= 'isFunctional' ) )? ( (lv_isSymmetric_1_0= 'isSymmetric' ) )? ( (lv_isTransitive_2_0= 'isTransitive' ) )? ( (lv_isInverseFunctional_3_0= 'isInverseFunctional' ) )? otherlv_4= 'DependentProperty' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'range' ( ( ruleEString ) ) )? (otherlv_9= 'subPropertyOf' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'inverseOf' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'domain' ( ( ruleEString ) ) )? otherlv_29= 'dependsOn' otherlv_30= '(' ( ( ruleEString ) ) (otherlv_32= ',' ( ( ruleEString ) ) )* otherlv_34= ')' otherlv_35= '}'
            {
            // InternalDSL.g:5070:3: ( (lv_isFunctional_0_0= 'isFunctional' ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==48) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalDSL.g:5071:4: (lv_isFunctional_0_0= 'isFunctional' )
                    {
                    // InternalDSL.g:5071:4: (lv_isFunctional_0_0= 'isFunctional' )
                    // InternalDSL.g:5072:5: lv_isFunctional_0_0= 'isFunctional'
                    {
                    lv_isFunctional_0_0=(Token)match(input,48,FOLLOW_60); 

                    					newLeafNode(lv_isFunctional_0_0, grammarAccess.getDependentPropertyAccess().getIsFunctionalIsFunctionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDependentPropertyRule());
                    					}
                    					setWithLastConsumed(current, "isFunctional", lv_isFunctional_0_0 != null, "isFunctional");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:5084:3: ( (lv_isSymmetric_1_0= 'isSymmetric' ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==49) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalDSL.g:5085:4: (lv_isSymmetric_1_0= 'isSymmetric' )
                    {
                    // InternalDSL.g:5085:4: (lv_isSymmetric_1_0= 'isSymmetric' )
                    // InternalDSL.g:5086:5: lv_isSymmetric_1_0= 'isSymmetric'
                    {
                    lv_isSymmetric_1_0=(Token)match(input,49,FOLLOW_61); 

                    					newLeafNode(lv_isSymmetric_1_0, grammarAccess.getDependentPropertyAccess().getIsSymmetricIsSymmetricKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDependentPropertyRule());
                    					}
                    					setWithLastConsumed(current, "isSymmetric", lv_isSymmetric_1_0 != null, "isSymmetric");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:5098:3: ( (lv_isTransitive_2_0= 'isTransitive' ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==50) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalDSL.g:5099:4: (lv_isTransitive_2_0= 'isTransitive' )
                    {
                    // InternalDSL.g:5099:4: (lv_isTransitive_2_0= 'isTransitive' )
                    // InternalDSL.g:5100:5: lv_isTransitive_2_0= 'isTransitive'
                    {
                    lv_isTransitive_2_0=(Token)match(input,50,FOLLOW_62); 

                    					newLeafNode(lv_isTransitive_2_0, grammarAccess.getDependentPropertyAccess().getIsTransitiveIsTransitiveKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDependentPropertyRule());
                    					}
                    					setWithLastConsumed(current, "isTransitive", lv_isTransitive_2_0 != null, "isTransitive");
                    				

                    }


                    }
                    break;

            }

            // InternalDSL.g:5112:3: ( (lv_isInverseFunctional_3_0= 'isInverseFunctional' ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==51) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalDSL.g:5113:4: (lv_isInverseFunctional_3_0= 'isInverseFunctional' )
                    {
                    // InternalDSL.g:5113:4: (lv_isInverseFunctional_3_0= 'isInverseFunctional' )
                    // InternalDSL.g:5114:5: lv_isInverseFunctional_3_0= 'isInverseFunctional'
                    {
                    lv_isInverseFunctional_3_0=(Token)match(input,51,FOLLOW_63); 

                    					newLeafNode(lv_isInverseFunctional_3_0, grammarAccess.getDependentPropertyAccess().getIsInverseFunctionalIsInverseFunctionalKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDependentPropertyRule());
                    					}
                    					setWithLastConsumed(current, "isInverseFunctional", lv_isInverseFunctional_3_0 != null, "isInverseFunctional");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDependentPropertyAccess().getDependentPropertyKeyword_4());
            		
            // InternalDSL.g:5130:3: ( (lv_name_5_0= ruleEString ) )
            // InternalDSL.g:5131:4: (lv_name_5_0= ruleEString )
            {
            // InternalDSL.g:5131:4: (lv_name_5_0= ruleEString )
            // InternalDSL.g:5132:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDependentPropertyAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependentPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_6, grammarAccess.getDependentPropertyAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDSL.g:5153:3: (otherlv_7= 'range' ( ( ruleEString ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==53) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalDSL.g:5154:4: otherlv_7= 'range' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getDependentPropertyAccess().getRangeKeyword_7_0());
                    			
                    // InternalDSL.g:5158:4: ( ( ruleEString ) )
                    // InternalDSL.g:5159:5: ( ruleEString )
                    {
                    // InternalDSL.g:5159:5: ( ruleEString )
                    // InternalDSL.g:5160:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependentPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDependentPropertyAccess().getRangeDataTypeDefinitionCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDSL.g:5175:3: (otherlv_9= 'subPropertyOf' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==54) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalDSL.g:5176:4: otherlv_9= 'subPropertyOf' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getDependentPropertyAccess().getSubPropertyOfKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getDependentPropertyAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalDSL.g:5184:4: ( ( ruleEString ) )
                    // InternalDSL.g:5185:5: ( ruleEString )
                    {
                    // InternalDSL.g:5185:5: ( ruleEString )
                    // InternalDSL.g:5186:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependentPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDependentPropertyAccess().getSubPropertyOfPropertyDefinitionCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:5200:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==14) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // InternalDSL.g:5201:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDependentPropertyAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalDSL.g:5205:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:5206:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:5206:6: ( ruleEString )
                    	    // InternalDSL.g:5207:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDependentPropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDependentPropertyAccess().getSubPropertyOfPropertyDefinitionCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop145;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_66); 

                    				newLeafNode(otherlv_14, grammarAccess.getDependentPropertyAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:5227:3: (otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==23) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalDSL.g:5228:4: otherlv_15= 'equivalentTo' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getDependentPropertyAccess().getEquivalentToKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getDependentPropertyAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalDSL.g:5236:4: ( ( ruleEString ) )
                    // InternalDSL.g:5237:5: ( ruleEString )
                    {
                    // InternalDSL.g:5237:5: ( ruleEString )
                    // InternalDSL.g:5238:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependentPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDependentPropertyAccess().getEquivalentToPropertyDefinitionCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:5252:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==14) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // InternalDSL.g:5253:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDependentPropertyAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalDSL.g:5257:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:5258:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:5258:6: ( ruleEString )
                    	    // InternalDSL.g:5259:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDependentPropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDependentPropertyAccess().getEquivalentToPropertyDefinitionCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_67); 

                    				newLeafNode(otherlv_20, grammarAccess.getDependentPropertyAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:5279:3: (otherlv_21= 'inverseOf' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==55) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalDSL.g:5280:4: otherlv_21= 'inverseOf' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,55,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getDependentPropertyAccess().getInverseOfKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getDependentPropertyAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalDSL.g:5288:4: ( ( ruleEString ) )
                    // InternalDSL.g:5289:5: ( ruleEString )
                    {
                    // InternalDSL.g:5289:5: ( ruleEString )
                    // InternalDSL.g:5290:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependentPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDependentPropertyAccess().getInverseOfPropertyDefinitionCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:5304:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==14) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalDSL.g:5305:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getDependentPropertyAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalDSL.g:5309:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:5310:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:5310:6: ( ruleEString )
                    	    // InternalDSL.g:5311:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDependentPropertyRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDependentPropertyAccess().getInverseOfPropertyDefinitionCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_68); 

                    				newLeafNode(otherlv_26, grammarAccess.getDependentPropertyAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:5331:3: (otherlv_27= 'domain' ( ( ruleEString ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==56) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalDSL.g:5332:4: otherlv_27= 'domain' ( ( ruleEString ) )
                    {
                    otherlv_27=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getDependentPropertyAccess().getDomainKeyword_11_0());
                    			
                    // InternalDSL.g:5336:4: ( ( ruleEString ) )
                    // InternalDSL.g:5337:5: ( ruleEString )
                    {
                    // InternalDSL.g:5337:5: ( ruleEString )
                    // InternalDSL.g:5338:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDependentPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDependentPropertyAccess().getDomainClassDefinitionCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,59,FOLLOW_14); 

            			newLeafNode(otherlv_29, grammarAccess.getDependentPropertyAccess().getDependsOnKeyword_12());
            		
            otherlv_30=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_30, grammarAccess.getDependentPropertyAccess().getLeftParenthesisKeyword_13());
            		
            // InternalDSL.g:5361:3: ( ( ruleEString ) )
            // InternalDSL.g:5362:4: ( ruleEString )
            {
            // InternalDSL.g:5362:4: ( ruleEString )
            // InternalDSL.g:5363:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependentPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependentPropertyAccess().getDependsOnPropertyDefinitionCrossReference_14_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:5377:3: (otherlv_32= ',' ( ( ruleEString ) ) )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==14) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // InternalDSL.g:5378:4: otherlv_32= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_32=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_32, grammarAccess.getDependentPropertyAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalDSL.g:5382:4: ( ( ruleEString ) )
            	    // InternalDSL.g:5383:5: ( ruleEString )
            	    {
            	    // InternalDSL.g:5383:5: ( ruleEString )
            	    // InternalDSL.g:5384:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDependentPropertyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDependentPropertyAccess().getDependsOnPropertyDefinitionCrossReference_15_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop152;
                }
            } while (true);

            otherlv_34=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_34, grammarAccess.getDependentPropertyAccess().getRightParenthesisKeyword_16());
            		
            otherlv_35=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getDependentPropertyAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleDependentProperty"


    // $ANTLR start "entryRuleNotNumericType"
    // InternalDSL.g:5411:1: entryRuleNotNumericType returns [EObject current=null] : iv_ruleNotNumericType= ruleNotNumericType EOF ;
    public final EObject entryRuleNotNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotNumericType = null;


        try {
            // InternalDSL.g:5411:55: (iv_ruleNotNumericType= ruleNotNumericType EOF )
            // InternalDSL.g:5412:2: iv_ruleNotNumericType= ruleNotNumericType EOF
            {
             newCompositeNode(grammarAccess.getNotNumericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotNumericType=ruleNotNumericType();

            state._fsp--;

             current =iv_ruleNotNumericType; 
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
    // $ANTLR end "entryRuleNotNumericType"


    // $ANTLR start "ruleNotNumericType"
    // InternalDSL.g:5418:1: ruleNotNumericType returns [EObject current=null] : (otherlv_0= 'NotNumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}' ) ;
    public final EObject ruleNotNumericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_basedOn_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:5424:2: ( (otherlv_0= 'NotNumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}' ) )
            // InternalDSL.g:5425:2: (otherlv_0= 'NotNumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}' )
            {
            // InternalDSL.g:5425:2: (otherlv_0= 'NotNumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}' )
            // InternalDSL.g:5426:3: otherlv_0= 'NotNumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotNumericTypeAccess().getNotNumericTypeKeyword_0());
            		
            // InternalDSL.g:5430:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:5431:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:5431:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:5432:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNotNumericTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotNumericTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getNotNumericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,61,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getNotNumericTypeAccess().getBasedOnKeyword_3());
            		
            // InternalDSL.g:5457:3: ( (lv_basedOn_4_0= rulePredefinedType ) )
            // InternalDSL.g:5458:4: (lv_basedOn_4_0= rulePredefinedType )
            {
            // InternalDSL.g:5458:4: (lv_basedOn_4_0= rulePredefinedType )
            // InternalDSL.g:5459:5: lv_basedOn_4_0= rulePredefinedType
            {

            					newCompositeNode(grammarAccess.getNotNumericTypeAccess().getBasedOnPredefinedTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_basedOn_4_0=rulePredefinedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotNumericTypeRule());
            					}
            					set(
            						current,
            						"basedOn",
            						lv_basedOn_4_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.PredefinedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNotNumericTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNotNumericType"


    // $ANTLR start "entryRuleNumericType_Impl"
    // InternalDSL.g:5484:1: entryRuleNumericType_Impl returns [EObject current=null] : iv_ruleNumericType_Impl= ruleNumericType_Impl EOF ;
    public final EObject entryRuleNumericType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType_Impl = null;


        try {
            // InternalDSL.g:5484:57: (iv_ruleNumericType_Impl= ruleNumericType_Impl EOF )
            // InternalDSL.g:5485:2: iv_ruleNumericType_Impl= ruleNumericType_Impl EOF
            {
             newCompositeNode(grammarAccess.getNumericType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericType_Impl=ruleNumericType_Impl();

            state._fsp--;

             current =iv_ruleNumericType_Impl; 
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
    // $ANTLR end "entryRuleNumericType_Impl"


    // $ANTLR start "ruleNumericType_Impl"
    // InternalDSL.g:5491:1: ruleNumericType_Impl returns [EObject current=null] : (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}' ) ;
    public final EObject ruleNumericType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_basedOn_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:5497:2: ( (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}' ) )
            // InternalDSL.g:5498:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}' )
            {
            // InternalDSL.g:5498:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}' )
            // InternalDSL.g:5499:3: otherlv_0= 'NumericType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNumericType_ImplAccess().getNumericTypeKeyword_0());
            		
            // InternalDSL.g:5503:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:5504:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:5504:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:5505:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNumericType_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericType_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,61,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getNumericType_ImplAccess().getBasedOnKeyword_3());
            		
            // InternalDSL.g:5530:3: ( (lv_basedOn_4_0= rulePredefinedType ) )
            // InternalDSL.g:5531:4: (lv_basedOn_4_0= rulePredefinedType )
            {
            // InternalDSL.g:5531:4: (lv_basedOn_4_0= rulePredefinedType )
            // InternalDSL.g:5532:5: lv_basedOn_4_0= rulePredefinedType
            {

            					newCompositeNode(grammarAccess.getNumericType_ImplAccess().getBasedOnPredefinedTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_basedOn_4_0=rulePredefinedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericType_ImplRule());
            					}
            					set(
            						current,
            						"basedOn",
            						lv_basedOn_4_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.PredefinedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNumericType_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNumericType_Impl"


    // $ANTLR start "entryRuleMeasureType"
    // InternalDSL.g:5557:1: entryRuleMeasureType returns [EObject current=null] : iv_ruleMeasureType= ruleMeasureType EOF ;
    public final EObject entryRuleMeasureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureType = null;


        try {
            // InternalDSL.g:5557:52: (iv_ruleMeasureType= ruleMeasureType EOF )
            // InternalDSL.g:5558:2: iv_ruleMeasureType= ruleMeasureType EOF
            {
             newCompositeNode(grammarAccess.getMeasureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureType=ruleMeasureType();

            state._fsp--;

             current =iv_ruleMeasureType; 
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
    // $ANTLR end "entryRuleMeasureType"


    // $ANTLR start "ruleMeasureType"
    // InternalDSL.g:5564:1: ruleMeasureType returns [EObject current=null] : (otherlv_0= 'MeasureType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'unit' ( (lv_unit_6_0= ruleUnitType ) ) otherlv_7= '}' ) ;
    public final EObject ruleMeasureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_basedOn_4_0 = null;

        EObject lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:5570:2: ( (otherlv_0= 'MeasureType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'unit' ( (lv_unit_6_0= ruleUnitType ) ) otherlv_7= '}' ) )
            // InternalDSL.g:5571:2: (otherlv_0= 'MeasureType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'unit' ( (lv_unit_6_0= ruleUnitType ) ) otherlv_7= '}' )
            {
            // InternalDSL.g:5571:2: (otherlv_0= 'MeasureType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'unit' ( (lv_unit_6_0= ruleUnitType ) ) otherlv_7= '}' )
            // InternalDSL.g:5572:3: otherlv_0= 'MeasureType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'unit' ( (lv_unit_6_0= ruleUnitType ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasureTypeAccess().getMeasureTypeKeyword_0());
            		
            // InternalDSL.g:5576:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:5577:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:5577:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:5578:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasureTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,61,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getMeasureTypeAccess().getBasedOnKeyword_3());
            		
            // InternalDSL.g:5603:3: ( (lv_basedOn_4_0= rulePredefinedType ) )
            // InternalDSL.g:5604:4: (lv_basedOn_4_0= rulePredefinedType )
            {
            // InternalDSL.g:5604:4: (lv_basedOn_4_0= rulePredefinedType )
            // InternalDSL.g:5605:5: lv_basedOn_4_0= rulePredefinedType
            {

            					newCompositeNode(grammarAccess.getMeasureTypeAccess().getBasedOnPredefinedTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_72);
            lv_basedOn_4_0=rulePredefinedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureTypeRule());
            					}
            					set(
            						current,
            						"basedOn",
            						lv_basedOn_4_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.PredefinedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,64,FOLLOW_73); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureTypeAccess().getUnitKeyword_5());
            		
            // InternalDSL.g:5626:3: ( (lv_unit_6_0= ruleUnitType ) )
            // InternalDSL.g:5627:4: (lv_unit_6_0= ruleUnitType )
            {
            // InternalDSL.g:5627:4: (lv_unit_6_0= ruleUnitType )
            // InternalDSL.g:5628:5: lv_unit_6_0= ruleUnitType
            {

            					newCompositeNode(grammarAccess.getMeasureTypeAccess().getUnitUnitTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_unit_6_0=ruleUnitType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureTypeRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_6_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.UnitType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureTypeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleMeasureType"


    // $ANTLR start "entryRuleCurrencyType"
    // InternalDSL.g:5653:1: entryRuleCurrencyType returns [EObject current=null] : iv_ruleCurrencyType= ruleCurrencyType EOF ;
    public final EObject entryRuleCurrencyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrencyType = null;


        try {
            // InternalDSL.g:5653:53: (iv_ruleCurrencyType= ruleCurrencyType EOF )
            // InternalDSL.g:5654:2: iv_ruleCurrencyType= ruleCurrencyType EOF
            {
             newCompositeNode(grammarAccess.getCurrencyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCurrencyType=ruleCurrencyType();

            state._fsp--;

             current =iv_ruleCurrencyType; 
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
    // $ANTLR end "entryRuleCurrencyType"


    // $ANTLR start "ruleCurrencyType"
    // InternalDSL.g:5660:1: ruleCurrencyType returns [EObject current=null] : (otherlv_0= 'CurrencyType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'currency' ( (lv_currency_6_0= rulePredefinedCurrency ) ) otherlv_7= '}' ) ;
    public final EObject ruleCurrencyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_basedOn_4_0 = null;

        Enumerator lv_currency_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:5666:2: ( (otherlv_0= 'CurrencyType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'currency' ( (lv_currency_6_0= rulePredefinedCurrency ) ) otherlv_7= '}' ) )
            // InternalDSL.g:5667:2: (otherlv_0= 'CurrencyType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'currency' ( (lv_currency_6_0= rulePredefinedCurrency ) ) otherlv_7= '}' )
            {
            // InternalDSL.g:5667:2: (otherlv_0= 'CurrencyType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'currency' ( (lv_currency_6_0= rulePredefinedCurrency ) ) otherlv_7= '}' )
            // InternalDSL.g:5668:3: otherlv_0= 'CurrencyType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( (lv_basedOn_4_0= rulePredefinedType ) ) otherlv_5= 'currency' ( (lv_currency_6_0= rulePredefinedCurrency ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCurrencyTypeAccess().getCurrencyTypeKeyword_0());
            		
            // InternalDSL.g:5672:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:5673:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:5673:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:5674:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCurrencyTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCurrencyTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getCurrencyTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,61,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getCurrencyTypeAccess().getBasedOnKeyword_3());
            		
            // InternalDSL.g:5699:3: ( (lv_basedOn_4_0= rulePredefinedType ) )
            // InternalDSL.g:5700:4: (lv_basedOn_4_0= rulePredefinedType )
            {
            // InternalDSL.g:5700:4: (lv_basedOn_4_0= rulePredefinedType )
            // InternalDSL.g:5701:5: lv_basedOn_4_0= rulePredefinedType
            {

            					newCompositeNode(grammarAccess.getCurrencyTypeAccess().getBasedOnPredefinedTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_74);
            lv_basedOn_4_0=rulePredefinedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCurrencyTypeRule());
            					}
            					set(
            						current,
            						"basedOn",
            						lv_basedOn_4_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.PredefinedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,66,FOLLOW_75); 

            			newLeafNode(otherlv_5, grammarAccess.getCurrencyTypeAccess().getCurrencyKeyword_5());
            		
            // InternalDSL.g:5722:3: ( (lv_currency_6_0= rulePredefinedCurrency ) )
            // InternalDSL.g:5723:4: (lv_currency_6_0= rulePredefinedCurrency )
            {
            // InternalDSL.g:5723:4: (lv_currency_6_0= rulePredefinedCurrency )
            // InternalDSL.g:5724:5: lv_currency_6_0= rulePredefinedCurrency
            {

            					newCompositeNode(grammarAccess.getCurrencyTypeAccess().getCurrencyPredefinedCurrencyEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_currency_6_0=rulePredefinedCurrency();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCurrencyTypeRule());
            					}
            					set(
            						current,
            						"currency",
            						lv_currency_6_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.PredefinedCurrency");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCurrencyTypeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleCurrencyType"


    // $ANTLR start "entryRuleClassType"
    // InternalDSL.g:5749:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // InternalDSL.g:5749:50: (iv_ruleClassType= ruleClassType EOF )
            // InternalDSL.g:5750:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // InternalDSL.g:5756:1: ruleClassType returns [EObject current=null] : (otherlv_0= 'ClassType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:5762:2: ( (otherlv_0= 'ClassType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalDSL.g:5763:2: (otherlv_0= 'ClassType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalDSL.g:5763:2: (otherlv_0= 'ClassType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalDSL.g:5764:3: otherlv_0= 'ClassType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'basedOn' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getClassTypeKeyword_0());
            		
            // InternalDSL.g:5768:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:5769:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:5769:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:5770:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getClassTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getClassTypeAccess().getBasedOnKeyword_3());
            		
            // InternalDSL.g:5795:3: ( ( ruleEString ) )
            // InternalDSL.g:5796:4: ( ruleEString )
            {
            // InternalDSL.g:5796:4: ( ruleEString )
            // InternalDSL.g:5797:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClassTypeAccess().getBasedOnClassDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClassTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleCollectionType"
    // InternalDSL.g:5819:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalDSL.g:5819:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalDSL.g:5820:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;

             current =iv_ruleCollectionType; 
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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalDSL.g:5826:1: ruleCollectionType returns [EObject current=null] : (otherlv_0= 'CollectionType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'is' ( (lv_is_4_0= rulePredefinedCollection ) ) otherlv_5= 'collectionOf' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_is_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:5832:2: ( (otherlv_0= 'CollectionType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'is' ( (lv_is_4_0= rulePredefinedCollection ) ) otherlv_5= 'collectionOf' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalDSL.g:5833:2: (otherlv_0= 'CollectionType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'is' ( (lv_is_4_0= rulePredefinedCollection ) ) otherlv_5= 'collectionOf' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalDSL.g:5833:2: (otherlv_0= 'CollectionType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'is' ( (lv_is_4_0= rulePredefinedCollection ) ) otherlv_5= 'collectionOf' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalDSL.g:5834:3: otherlv_0= 'CollectionType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'is' ( (lv_is_4_0= rulePredefinedCollection ) ) otherlv_5= 'collectionOf' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getCollectionTypeKeyword_0());
            		
            // InternalDSL.g:5838:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:5839:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:5839:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:5840:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectionTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,69,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getIsKeyword_3());
            		
            // InternalDSL.g:5865:3: ( (lv_is_4_0= rulePredefinedCollection ) )
            // InternalDSL.g:5866:4: (lv_is_4_0= rulePredefinedCollection )
            {
            // InternalDSL.g:5866:4: (lv_is_4_0= rulePredefinedCollection )
            // InternalDSL.g:5867:5: lv_is_4_0= rulePredefinedCollection
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getIsPredefinedCollectionEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_78);
            lv_is_4_0=rulePredefinedCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
            					}
            					set(
            						current,
            						"is",
            						lv_is_4_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.PredefinedCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCollectionTypeAccess().getCollectionOfKeyword_5());
            		
            // InternalDSL.g:5888:3: ( ( ruleEString ) )
            // InternalDSL.g:5889:4: ( ruleEString )
            {
            // InternalDSL.g:5889:4: ( ruleEString )
            // InternalDSL.g:5890:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getCollectionOfDataTypeDefinitionCrossReference_6_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCollectionTypeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleEnumeratedType"
    // InternalDSL.g:5912:1: entryRuleEnumeratedType returns [EObject current=null] : iv_ruleEnumeratedType= ruleEnumeratedType EOF ;
    public final EObject entryRuleEnumeratedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeratedType = null;


        try {
            // InternalDSL.g:5912:55: (iv_ruleEnumeratedType= ruleEnumeratedType EOF )
            // InternalDSL.g:5913:2: iv_ruleEnumeratedType= ruleEnumeratedType EOF
            {
             newCompositeNode(grammarAccess.getEnumeratedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeratedType=ruleEnumeratedType();

            state._fsp--;

             current =iv_ruleEnumeratedType; 
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
    // $ANTLR end "entryRuleEnumeratedType"


    // $ANTLR start "ruleEnumeratedType"
    // InternalDSL.g:5919:1: ruleEnumeratedType returns [EObject current=null] : (otherlv_0= 'EnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleEnumeratedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:5925:2: ( (otherlv_0= 'EnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalDSL.g:5926:2: (otherlv_0= 'EnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalDSL.g:5926:2: (otherlv_0= 'EnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalDSL.g:5927:3: otherlv_0= 'EnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumeratedTypeAccess().getEnumeratedTypeKeyword_0());
            		
            // InternalDSL.g:5931:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:5932:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:5932:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:5933:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumeratedTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumeratedTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumeratedTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,72,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumeratedTypeAccess().getContainsKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumeratedTypeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalDSL.g:5962:3: ( ( ruleEString ) )
            // InternalDSL.g:5963:4: ( ruleEString )
            {
            // InternalDSL.g:5963:4: ( ruleEString )
            // InternalDSL.g:5964:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumeratedTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnumeratedTypeAccess().getContainsSingleValueCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:5978:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop153:
            do {
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==14) ) {
                    alt153=1;
                }


                switch (alt153) {
            	case 1 :
            	    // InternalDSL.g:5979:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnumeratedTypeAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDSL.g:5983:4: ( ( ruleEString ) )
            	    // InternalDSL.g:5984:5: ( ruleEString )
            	    {
            	    // InternalDSL.g:5984:5: ( ruleEString )
            	    // InternalDSL.g:5985:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEnumeratedTypeRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getEnumeratedTypeAccess().getContainsSingleValueCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop153;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumeratedTypeAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumeratedTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEnumeratedType"


    // $ANTLR start "entryRuleNumberEnumeratedType"
    // InternalDSL.g:6012:1: entryRuleNumberEnumeratedType returns [EObject current=null] : iv_ruleNumberEnumeratedType= ruleNumberEnumeratedType EOF ;
    public final EObject entryRuleNumberEnumeratedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberEnumeratedType = null;


        try {
            // InternalDSL.g:6012:61: (iv_ruleNumberEnumeratedType= ruleNumberEnumeratedType EOF )
            // InternalDSL.g:6013:2: iv_ruleNumberEnumeratedType= ruleNumberEnumeratedType EOF
            {
             newCompositeNode(grammarAccess.getNumberEnumeratedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberEnumeratedType=ruleNumberEnumeratedType();

            state._fsp--;

             current =iv_ruleNumberEnumeratedType; 
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
    // $ANTLR end "entryRuleNumberEnumeratedType"


    // $ANTLR start "ruleNumberEnumeratedType"
    // InternalDSL.g:6019:1: ruleNumberEnumeratedType returns [EObject current=null] : (otherlv_0= 'NumberEnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' ( (lv_contains_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_contains_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleNumberEnumeratedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_contains_5_0 = null;

        AntlrDatatypeRuleToken lv_contains_7_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:6025:2: ( (otherlv_0= 'NumberEnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' ( (lv_contains_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_contains_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalDSL.g:6026:2: (otherlv_0= 'NumberEnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' ( (lv_contains_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_contains_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalDSL.g:6026:2: (otherlv_0= 'NumberEnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' ( (lv_contains_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_contains_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalDSL.g:6027:3: otherlv_0= 'NumberEnumeratedType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' ( (lv_contains_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_contains_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberEnumeratedTypeAccess().getNumberEnumeratedTypeKeyword_0());
            		
            // InternalDSL.g:6031:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:6032:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:6032:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:6033:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNumberEnumeratedTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberEnumeratedTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getNumberEnumeratedTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getNumberEnumeratedTypeAccess().getContainsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getNumberEnumeratedTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDSL.g:6062:3: ( (lv_contains_5_0= ruleEInt ) )
            // InternalDSL.g:6063:4: (lv_contains_5_0= ruleEInt )
            {
            // InternalDSL.g:6063:4: (lv_contains_5_0= ruleEInt )
            // InternalDSL.g:6064:5: lv_contains_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNumberEnumeratedTypeAccess().getContainsEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_contains_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberEnumeratedTypeRule());
            					}
            					add(
            						current,
            						"contains",
            						lv_contains_5_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:6081:3: (otherlv_6= ',' ( (lv_contains_7_0= ruleEInt ) ) )*
            loop154:
            do {
                int alt154=2;
                int LA154_0 = input.LA(1);

                if ( (LA154_0==14) ) {
                    alt154=1;
                }


                switch (alt154) {
            	case 1 :
            	    // InternalDSL.g:6082:4: otherlv_6= ',' ( (lv_contains_7_0= ruleEInt ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_32); 

            	    				newLeafNode(otherlv_6, grammarAccess.getNumberEnumeratedTypeAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDSL.g:6086:4: ( (lv_contains_7_0= ruleEInt ) )
            	    // InternalDSL.g:6087:5: (lv_contains_7_0= ruleEInt )
            	    {
            	    // InternalDSL.g:6087:5: (lv_contains_7_0= ruleEInt )
            	    // InternalDSL.g:6088:6: lv_contains_7_0= ruleEInt
            	    {

            	    						newCompositeNode(grammarAccess.getNumberEnumeratedTypeAccess().getContainsEIntParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_contains_7_0=ruleEInt();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNumberEnumeratedTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contains",
            	    							lv_contains_7_0,
            	    							"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop154;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getNumberEnumeratedTypeAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNumberEnumeratedTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleNumberEnumeratedType"


    // $ANTLR start "entryRuleNamedUnit_Impl"
    // InternalDSL.g:6118:1: entryRuleNamedUnit_Impl returns [EObject current=null] : iv_ruleNamedUnit_Impl= ruleNamedUnit_Impl EOF ;
    public final EObject entryRuleNamedUnit_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedUnit_Impl = null;


        try {
            // InternalDSL.g:6118:55: (iv_ruleNamedUnit_Impl= ruleNamedUnit_Impl EOF )
            // InternalDSL.g:6119:2: iv_ruleNamedUnit_Impl= ruleNamedUnit_Impl EOF
            {
             newCompositeNode(grammarAccess.getNamedUnit_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedUnit_Impl=ruleNamedUnit_Impl();

            state._fsp--;

             current =iv_ruleNamedUnit_Impl; 
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
    // $ANTLR end "entryRuleNamedUnit_Impl"


    // $ANTLR start "ruleNamedUnit_Impl"
    // InternalDSL.g:6125:1: ruleNamedUnit_Impl returns [EObject current=null] : ( () otherlv_1= 'NamedUnit' otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleNamedUnit_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_exponent_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:6131:2: ( ( () otherlv_1= 'NamedUnit' otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalDSL.g:6132:2: ( () otherlv_1= 'NamedUnit' otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalDSL.g:6132:2: ( () otherlv_1= 'NamedUnit' otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalDSL.g:6133:3: () otherlv_1= 'NamedUnit' otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalDSL.g:6133:3: ()
            // InternalDSL.g:6134:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedUnit_ImplAccess().getNamedUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedUnit_ImplAccess().getNamedUnitKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedUnit_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:6148:3: (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==75) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalDSL.g:6149:4: otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_32); 

                    				newLeafNode(otherlv_3, grammarAccess.getNamedUnit_ImplAccess().getExponentKeyword_3_0());
                    			
                    // InternalDSL.g:6153:4: ( (lv_exponent_4_0= ruleEInt ) )
                    // InternalDSL.g:6154:5: (lv_exponent_4_0= ruleEInt )
                    {
                    // InternalDSL.g:6154:5: (lv_exponent_4_0= ruleEInt )
                    // InternalDSL.g:6155:6: lv_exponent_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getNamedUnit_ImplAccess().getExponentEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_exponent_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedUnit_ImplRule());
                    						}
                    						set(
                    							current,
                    							"exponent",
                    							lv_exponent_4_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNamedUnit_ImplAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNamedUnit_Impl"


    // $ANTLR start "entryRuleDerivedUnit"
    // InternalDSL.g:6181:1: entryRuleDerivedUnit returns [EObject current=null] : iv_ruleDerivedUnit= ruleDerivedUnit EOF ;
    public final EObject entryRuleDerivedUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedUnit = null;


        try {
            // InternalDSL.g:6181:52: (iv_ruleDerivedUnit= ruleDerivedUnit EOF )
            // InternalDSL.g:6182:2: iv_ruleDerivedUnit= ruleDerivedUnit EOF
            {
             newCompositeNode(grammarAccess.getDerivedUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedUnit=ruleDerivedUnit();

            state._fsp--;

             current =iv_ruleDerivedUnit; 
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
    // $ANTLR end "entryRuleDerivedUnit"


    // $ANTLR start "ruleDerivedUnit"
    // InternalDSL.g:6188:1: ruleDerivedUnit returns [EObject current=null] : (otherlv_0= 'DerivedUnit' otherlv_1= '{' otherlv_2= 'derivedUnitElement' otherlv_3= '{' ( (lv_derivedUnitElement_4_0= ruleDerivedUnitElement ) ) (otherlv_5= ',' ( (lv_derivedUnitElement_6_0= ruleDerivedUnitElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleDerivedUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_derivedUnitElement_4_0 = null;

        EObject lv_derivedUnitElement_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:6194:2: ( (otherlv_0= 'DerivedUnit' otherlv_1= '{' otherlv_2= 'derivedUnitElement' otherlv_3= '{' ( (lv_derivedUnitElement_4_0= ruleDerivedUnitElement ) ) (otherlv_5= ',' ( (lv_derivedUnitElement_6_0= ruleDerivedUnitElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalDSL.g:6195:2: (otherlv_0= 'DerivedUnit' otherlv_1= '{' otherlv_2= 'derivedUnitElement' otherlv_3= '{' ( (lv_derivedUnitElement_4_0= ruleDerivedUnitElement ) ) (otherlv_5= ',' ( (lv_derivedUnitElement_6_0= ruleDerivedUnitElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalDSL.g:6195:2: (otherlv_0= 'DerivedUnit' otherlv_1= '{' otherlv_2= 'derivedUnitElement' otherlv_3= '{' ( (lv_derivedUnitElement_4_0= ruleDerivedUnitElement ) ) (otherlv_5= ',' ( (lv_derivedUnitElement_6_0= ruleDerivedUnitElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalDSL.g:6196:3: otherlv_0= 'DerivedUnit' otherlv_1= '{' otherlv_2= 'derivedUnitElement' otherlv_3= '{' ( (lv_derivedUnitElement_4_0= ruleDerivedUnitElement ) ) (otherlv_5= ',' ( (lv_derivedUnitElement_6_0= ruleDerivedUnitElement ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedUnitAccess().getDerivedUnitKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedUnitAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDerivedUnitAccess().getDerivedUnitElementKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_82); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedUnitAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:6212:3: ( (lv_derivedUnitElement_4_0= ruleDerivedUnitElement ) )
            // InternalDSL.g:6213:4: (lv_derivedUnitElement_4_0= ruleDerivedUnitElement )
            {
            // InternalDSL.g:6213:4: (lv_derivedUnitElement_4_0= ruleDerivedUnitElement )
            // InternalDSL.g:6214:5: lv_derivedUnitElement_4_0= ruleDerivedUnitElement
            {

            					newCompositeNode(grammarAccess.getDerivedUnitAccess().getDerivedUnitElementDerivedUnitElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_derivedUnitElement_4_0=ruleDerivedUnitElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDerivedUnitRule());
            					}
            					add(
            						current,
            						"derivedUnitElement",
            						lv_derivedUnitElement_4_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.DerivedUnitElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:6231:3: (otherlv_5= ',' ( (lv_derivedUnitElement_6_0= ruleDerivedUnitElement ) ) )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==14) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // InternalDSL.g:6232:4: otherlv_5= ',' ( (lv_derivedUnitElement_6_0= ruleDerivedUnitElement ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_82); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDerivedUnitAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDSL.g:6236:4: ( (lv_derivedUnitElement_6_0= ruleDerivedUnitElement ) )
            	    // InternalDSL.g:6237:5: (lv_derivedUnitElement_6_0= ruleDerivedUnitElement )
            	    {
            	    // InternalDSL.g:6237:5: (lv_derivedUnitElement_6_0= ruleDerivedUnitElement )
            	    // InternalDSL.g:6238:6: lv_derivedUnitElement_6_0= ruleDerivedUnitElement
            	    {

            	    						newCompositeNode(grammarAccess.getDerivedUnitAccess().getDerivedUnitElementDerivedUnitElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_derivedUnitElement_6_0=ruleDerivedUnitElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDerivedUnitRule());
            	    						}
            	    						add(
            	    							current,
            	    							"derivedUnitElement",
            	    							lv_derivedUnitElement_6_0,
            	    							"fr.cs.ontoeventb.pivotmodel.DSL.DerivedUnitElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop156;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getDerivedUnitAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDerivedUnitAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDerivedUnit"


    // $ANTLR start "entryRuleNonStandardUnit"
    // InternalDSL.g:6268:1: entryRuleNonStandardUnit returns [EObject current=null] : iv_ruleNonStandardUnit= ruleNonStandardUnit EOF ;
    public final EObject entryRuleNonStandardUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonStandardUnit = null;


        try {
            // InternalDSL.g:6268:56: (iv_ruleNonStandardUnit= ruleNonStandardUnit EOF )
            // InternalDSL.g:6269:2: iv_ruleNonStandardUnit= ruleNonStandardUnit EOF
            {
             newCompositeNode(grammarAccess.getNonStandardUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonStandardUnit=ruleNonStandardUnit();

            state._fsp--;

             current =iv_ruleNonStandardUnit; 
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
    // $ANTLR end "entryRuleNonStandardUnit"


    // $ANTLR start "ruleNonStandardUnit"
    // InternalDSL.g:6275:1: ruleNonStandardUnit returns [EObject current=null] : ( () otherlv_1= 'NonStandardUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleNonStandardUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_exponent_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:6281:2: ( ( () otherlv_1= 'NonStandardUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalDSL.g:6282:2: ( () otherlv_1= 'NonStandardUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalDSL.g:6282:2: ( () otherlv_1= 'NonStandardUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalDSL.g:6283:3: () otherlv_1= 'NonStandardUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalDSL.g:6283:3: ()
            // InternalDSL.g:6284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNonStandardUnitAccess().getNonStandardUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNonStandardUnitAccess().getNonStandardUnitKeyword_1());
            		
            // InternalDSL.g:6294:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:6295:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:6295:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:6296:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNonStandardUnitAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNonStandardUnitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getNonStandardUnitAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:6317:3: (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==75) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalDSL.g:6318:4: otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getNonStandardUnitAccess().getExponentKeyword_4_0());
                    			
                    // InternalDSL.g:6322:4: ( (lv_exponent_5_0= ruleEInt ) )
                    // InternalDSL.g:6323:5: (lv_exponent_5_0= ruleEInt )
                    {
                    // InternalDSL.g:6323:5: (lv_exponent_5_0= ruleEInt )
                    // InternalDSL.g:6324:6: lv_exponent_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getNonStandardUnitAccess().getExponentEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_exponent_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonStandardUnitRule());
                    						}
                    						set(
                    							current,
                    							"exponent",
                    							lv_exponent_5_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNonStandardUnitAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNonStandardUnit"


    // $ANTLR start "entryRuleConversionBasedUnit"
    // InternalDSL.g:6350:1: entryRuleConversionBasedUnit returns [EObject current=null] : iv_ruleConversionBasedUnit= ruleConversionBasedUnit EOF ;
    public final EObject entryRuleConversionBasedUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConversionBasedUnit = null;


        try {
            // InternalDSL.g:6350:60: (iv_ruleConversionBasedUnit= ruleConversionBasedUnit EOF )
            // InternalDSL.g:6351:2: iv_ruleConversionBasedUnit= ruleConversionBasedUnit EOF
            {
             newCompositeNode(grammarAccess.getConversionBasedUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConversionBasedUnit=ruleConversionBasedUnit();

            state._fsp--;

             current =iv_ruleConversionBasedUnit; 
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
    // $ANTLR end "entryRuleConversionBasedUnit"


    // $ANTLR start "ruleConversionBasedUnit"
    // InternalDSL.g:6357:1: ruleConversionBasedUnit returns [EObject current=null] : (otherlv_0= 'ConversionBasedUnit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'valueComponent' ( (lv_valueComponent_6_0= ruleEInt ) ) otherlv_7= 'unitComponent' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleConversionBasedUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_exponent_4_0 = null;

        AntlrDatatypeRuleToken lv_valueComponent_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:6363:2: ( (otherlv_0= 'ConversionBasedUnit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'valueComponent' ( (lv_valueComponent_6_0= ruleEInt ) ) otherlv_7= 'unitComponent' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalDSL.g:6364:2: (otherlv_0= 'ConversionBasedUnit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'valueComponent' ( (lv_valueComponent_6_0= ruleEInt ) ) otherlv_7= 'unitComponent' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalDSL.g:6364:2: (otherlv_0= 'ConversionBasedUnit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'valueComponent' ( (lv_valueComponent_6_0= ruleEInt ) ) otherlv_7= 'unitComponent' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalDSL.g:6365:3: otherlv_0= 'ConversionBasedUnit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'valueComponent' ( (lv_valueComponent_6_0= ruleEInt ) ) otherlv_7= 'unitComponent' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConversionBasedUnitAccess().getConversionBasedUnitKeyword_0());
            		
            // InternalDSL.g:6369:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:6370:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:6370:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:6371:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConversionBasedUnitAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConversionBasedUnitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_83); 

            			newLeafNode(otherlv_2, grammarAccess.getConversionBasedUnitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:6392:3: (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==75) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalDSL.g:6393:4: otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_32); 

                    				newLeafNode(otherlv_3, grammarAccess.getConversionBasedUnitAccess().getExponentKeyword_3_0());
                    			
                    // InternalDSL.g:6397:4: ( (lv_exponent_4_0= ruleEInt ) )
                    // InternalDSL.g:6398:5: (lv_exponent_4_0= ruleEInt )
                    {
                    // InternalDSL.g:6398:5: (lv_exponent_4_0= ruleEInt )
                    // InternalDSL.g:6399:6: lv_exponent_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getConversionBasedUnitAccess().getExponentEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    lv_exponent_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConversionBasedUnitRule());
                    						}
                    						set(
                    							current,
                    							"exponent",
                    							lv_exponent_4_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,80,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getConversionBasedUnitAccess().getValueComponentKeyword_4());
            		
            // InternalDSL.g:6421:3: ( (lv_valueComponent_6_0= ruleEInt ) )
            // InternalDSL.g:6422:4: (lv_valueComponent_6_0= ruleEInt )
            {
            // InternalDSL.g:6422:4: (lv_valueComponent_6_0= ruleEInt )
            // InternalDSL.g:6423:5: lv_valueComponent_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getConversionBasedUnitAccess().getValueComponentEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_85);
            lv_valueComponent_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConversionBasedUnitRule());
            					}
            					set(
            						current,
            						"valueComponent",
            						lv_valueComponent_6_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getConversionBasedUnitAccess().getUnitComponentKeyword_6());
            		
            // InternalDSL.g:6444:3: ( ( ruleEString ) )
            // InternalDSL.g:6445:4: ( ruleEString )
            {
            // InternalDSL.g:6445:4: ( ruleEString )
            // InternalDSL.g:6446:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConversionBasedUnitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConversionBasedUnitAccess().getUnitComponentUnitTypeCrossReference_7_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConversionBasedUnitAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleConversionBasedUnit"


    // $ANTLR start "entryRuleContextDependentUnit"
    // InternalDSL.g:6468:1: entryRuleContextDependentUnit returns [EObject current=null] : iv_ruleContextDependentUnit= ruleContextDependentUnit EOF ;
    public final EObject entryRuleContextDependentUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDependentUnit = null;


        try {
            // InternalDSL.g:6468:61: (iv_ruleContextDependentUnit= ruleContextDependentUnit EOF )
            // InternalDSL.g:6469:2: iv_ruleContextDependentUnit= ruleContextDependentUnit EOF
            {
             newCompositeNode(grammarAccess.getContextDependentUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextDependentUnit=ruleContextDependentUnit();

            state._fsp--;

             current =iv_ruleContextDependentUnit; 
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
    // $ANTLR end "entryRuleContextDependentUnit"


    // $ANTLR start "ruleContextDependentUnit"
    // InternalDSL.g:6475:1: ruleContextDependentUnit returns [EObject current=null] : ( () otherlv_1= 'ContextDependentUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleContextDependentUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_exponent_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:6481:2: ( ( () otherlv_1= 'ContextDependentUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalDSL.g:6482:2: ( () otherlv_1= 'ContextDependentUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalDSL.g:6482:2: ( () otherlv_1= 'ContextDependentUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalDSL.g:6483:3: () otherlv_1= 'ContextDependentUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalDSL.g:6483:3: ()
            // InternalDSL.g:6484:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContextDependentUnitAccess().getContextDependentUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContextDependentUnitAccess().getContextDependentUnitKeyword_1());
            		
            // InternalDSL.g:6494:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:6495:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:6495:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:6496:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContextDependentUnitAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextDependentUnitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getContextDependentUnitAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:6517:3: (otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==75) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalDSL.g:6518:4: otherlv_4= 'exponent' ( (lv_exponent_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getContextDependentUnitAccess().getExponentKeyword_4_0());
                    			
                    // InternalDSL.g:6522:4: ( (lv_exponent_5_0= ruleEInt ) )
                    // InternalDSL.g:6523:5: (lv_exponent_5_0= ruleEInt )
                    {
                    // InternalDSL.g:6523:5: (lv_exponent_5_0= ruleEInt )
                    // InternalDSL.g:6524:6: lv_exponent_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getContextDependentUnitAccess().getExponentEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_exponent_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextDependentUnitRule());
                    						}
                    						set(
                    							current,
                    							"exponent",
                    							lv_exponent_5_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContextDependentUnitAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleContextDependentUnit"


    // $ANTLR start "entryRuleStandardUnit"
    // InternalDSL.g:6550:1: entryRuleStandardUnit returns [EObject current=null] : iv_ruleStandardUnit= ruleStandardUnit EOF ;
    public final EObject entryRuleStandardUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardUnit = null;


        try {
            // InternalDSL.g:6550:53: (iv_ruleStandardUnit= ruleStandardUnit EOF )
            // InternalDSL.g:6551:2: iv_ruleStandardUnit= ruleStandardUnit EOF
            {
             newCompositeNode(grammarAccess.getStandardUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStandardUnit=ruleStandardUnit();

            state._fsp--;

             current =iv_ruleStandardUnit; 
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
    // $ANTLR end "entryRuleStandardUnit"


    // $ANTLR start "ruleStandardUnit"
    // InternalDSL.g:6557:1: ruleStandardUnit returns [EObject current=null] : (otherlv_0= 'StandardUnit' otherlv_1= '{' (otherlv_2= 'exponent' ( (lv_exponent_3_0= ruleEInt ) ) )? (otherlv_4= 'prefix' ( (lv_prefix_5_0= rulePrefixeType ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleUnitName ) ) otherlv_8= '}' ) ;
    public final EObject ruleStandardUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_exponent_3_0 = null;

        Enumerator lv_prefix_5_0 = null;

        Enumerator lv_name_7_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:6563:2: ( (otherlv_0= 'StandardUnit' otherlv_1= '{' (otherlv_2= 'exponent' ( (lv_exponent_3_0= ruleEInt ) ) )? (otherlv_4= 'prefix' ( (lv_prefix_5_0= rulePrefixeType ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleUnitName ) ) otherlv_8= '}' ) )
            // InternalDSL.g:6564:2: (otherlv_0= 'StandardUnit' otherlv_1= '{' (otherlv_2= 'exponent' ( (lv_exponent_3_0= ruleEInt ) ) )? (otherlv_4= 'prefix' ( (lv_prefix_5_0= rulePrefixeType ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleUnitName ) ) otherlv_8= '}' )
            {
            // InternalDSL.g:6564:2: (otherlv_0= 'StandardUnit' otherlv_1= '{' (otherlv_2= 'exponent' ( (lv_exponent_3_0= ruleEInt ) ) )? (otherlv_4= 'prefix' ( (lv_prefix_5_0= rulePrefixeType ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleUnitName ) ) otherlv_8= '}' )
            // InternalDSL.g:6565:3: otherlv_0= 'StandardUnit' otherlv_1= '{' (otherlv_2= 'exponent' ( (lv_exponent_3_0= ruleEInt ) ) )? (otherlv_4= 'prefix' ( (lv_prefix_5_0= rulePrefixeType ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleUnitName ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStandardUnitAccess().getStandardUnitKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_86); 

            			newLeafNode(otherlv_1, grammarAccess.getStandardUnitAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDSL.g:6573:3: (otherlv_2= 'exponent' ( (lv_exponent_3_0= ruleEInt ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==75) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalDSL.g:6574:4: otherlv_2= 'exponent' ( (lv_exponent_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,75,FOLLOW_32); 

                    				newLeafNode(otherlv_2, grammarAccess.getStandardUnitAccess().getExponentKeyword_2_0());
                    			
                    // InternalDSL.g:6578:4: ( (lv_exponent_3_0= ruleEInt ) )
                    // InternalDSL.g:6579:5: (lv_exponent_3_0= ruleEInt )
                    {
                    // InternalDSL.g:6579:5: (lv_exponent_3_0= ruleEInt )
                    // InternalDSL.g:6580:6: lv_exponent_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStandardUnitAccess().getExponentEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    lv_exponent_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStandardUnitRule());
                    						}
                    						set(
                    							current,
                    							"exponent",
                    							lv_exponent_3_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDSL.g:6598:3: (otherlv_4= 'prefix' ( (lv_prefix_5_0= rulePrefixeType ) ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==84) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalDSL.g:6599:4: otherlv_4= 'prefix' ( (lv_prefix_5_0= rulePrefixeType ) )
                    {
                    otherlv_4=(Token)match(input,84,FOLLOW_88); 

                    				newLeafNode(otherlv_4, grammarAccess.getStandardUnitAccess().getPrefixKeyword_3_0());
                    			
                    // InternalDSL.g:6603:4: ( (lv_prefix_5_0= rulePrefixeType ) )
                    // InternalDSL.g:6604:5: (lv_prefix_5_0= rulePrefixeType )
                    {
                    // InternalDSL.g:6604:5: (lv_prefix_5_0= rulePrefixeType )
                    // InternalDSL.g:6605:6: lv_prefix_5_0= rulePrefixeType
                    {

                    						newCompositeNode(grammarAccess.getStandardUnitAccess().getPrefixPrefixeTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_89);
                    lv_prefix_5_0=rulePrefixeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStandardUnitRule());
                    						}
                    						set(
                    							current,
                    							"prefix",
                    							lv_prefix_5_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.PrefixeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,85,FOLLOW_90); 

            			newLeafNode(otherlv_6, grammarAccess.getStandardUnitAccess().getNameKeyword_4());
            		
            // InternalDSL.g:6627:3: ( (lv_name_7_0= ruleUnitName ) )
            // InternalDSL.g:6628:4: (lv_name_7_0= ruleUnitName )
            {
            // InternalDSL.g:6628:4: (lv_name_7_0= ruleUnitName )
            // InternalDSL.g:6629:5: lv_name_7_0= ruleUnitName
            {

            					newCompositeNode(grammarAccess.getStandardUnitAccess().getNameUnitNameEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_7_0=ruleUnitName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStandardUnitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.UnitName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStandardUnitAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleStandardUnit"


    // $ANTLR start "entryRuleDerivedUnitElement"
    // InternalDSL.g:6654:1: entryRuleDerivedUnitElement returns [EObject current=null] : iv_ruleDerivedUnitElement= ruleDerivedUnitElement EOF ;
    public final EObject entryRuleDerivedUnitElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedUnitElement = null;


        try {
            // InternalDSL.g:6654:59: (iv_ruleDerivedUnitElement= ruleDerivedUnitElement EOF )
            // InternalDSL.g:6655:2: iv_ruleDerivedUnitElement= ruleDerivedUnitElement EOF
            {
             newCompositeNode(grammarAccess.getDerivedUnitElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedUnitElement=ruleDerivedUnitElement();

            state._fsp--;

             current =iv_ruleDerivedUnitElement; 
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
    // $ANTLR end "entryRuleDerivedUnitElement"


    // $ANTLR start "ruleDerivedUnitElement"
    // InternalDSL.g:6661:1: ruleDerivedUnitElement returns [EObject current=null] : (otherlv_0= 'DerivedUnitElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'unit' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleDerivedUnitElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_exponent_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:6667:2: ( (otherlv_0= 'DerivedUnitElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'unit' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalDSL.g:6668:2: (otherlv_0= 'DerivedUnitElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'unit' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalDSL.g:6668:2: (otherlv_0= 'DerivedUnitElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'unit' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalDSL.g:6669:3: otherlv_0= 'DerivedUnitElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )? otherlv_5= 'unit' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedUnitElementAccess().getDerivedUnitElementKeyword_0());
            		
            // InternalDSL.g:6673:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:6674:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:6674:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:6675:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDerivedUnitElementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDerivedUnitElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.cs.ontoeventb.pivotmodel.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_91); 

            			newLeafNode(otherlv_2, grammarAccess.getDerivedUnitElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:6696:3: (otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==75) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalDSL.g:6697:4: otherlv_3= 'exponent' ( (lv_exponent_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_32); 

                    				newLeafNode(otherlv_3, grammarAccess.getDerivedUnitElementAccess().getExponentKeyword_3_0());
                    			
                    // InternalDSL.g:6701:4: ( (lv_exponent_4_0= ruleEInt ) )
                    // InternalDSL.g:6702:5: (lv_exponent_4_0= ruleEInt )
                    {
                    // InternalDSL.g:6702:5: (lv_exponent_4_0= ruleEInt )
                    // InternalDSL.g:6703:6: lv_exponent_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDerivedUnitElementAccess().getExponentEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_exponent_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedUnitElementRule());
                    						}
                    						set(
                    							current,
                    							"exponent",
                    							lv_exponent_4_0,
                    							"fr.cs.ontoeventb.pivotmodel.DSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDerivedUnitElementAccess().getUnitKeyword_4());
            		
            // InternalDSL.g:6725:3: ( ( ruleEString ) )
            // InternalDSL.g:6726:4: ( ruleEString )
            {
            // InternalDSL.g:6726:4: ( ruleEString )
            // InternalDSL.g:6727:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDerivedUnitElementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDerivedUnitElementAccess().getUnitNamedUnitCrossReference_5_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDerivedUnitElementAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDerivedUnitElement"


    // $ANTLR start "rulePredefinedType"
    // InternalDSL.g:6749:1: rulePredefinedType returns [Enumerator current=null] : ( (enumLiteral_0= 'INTEGER' ) | (enumLiteral_1= 'NATURAL' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) ) ;
    public final Enumerator rulePredefinedType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDSL.g:6755:2: ( ( (enumLiteral_0= 'INTEGER' ) | (enumLiteral_1= 'NATURAL' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) ) )
            // InternalDSL.g:6756:2: ( (enumLiteral_0= 'INTEGER' ) | (enumLiteral_1= 'NATURAL' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) )
            {
            // InternalDSL.g:6756:2: ( (enumLiteral_0= 'INTEGER' ) | (enumLiteral_1= 'NATURAL' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) )
            int alt163=4;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt163=1;
                }
                break;
            case 88:
                {
                alt163=2;
                }
                break;
            case 89:
                {
                alt163=3;
                }
                break;
            case 90:
                {
                alt163=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }

            switch (alt163) {
                case 1 :
                    // InternalDSL.g:6757:3: (enumLiteral_0= 'INTEGER' )
                    {
                    // InternalDSL.g:6757:3: (enumLiteral_0= 'INTEGER' )
                    // InternalDSL.g:6758:4: enumLiteral_0= 'INTEGER'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPredefinedTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:6765:3: (enumLiteral_1= 'NATURAL' )
                    {
                    // InternalDSL.g:6765:3: (enumLiteral_1= 'NATURAL' )
                    // InternalDSL.g:6766:4: enumLiteral_1= 'NATURAL'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedTypeAccess().getNATURALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPredefinedTypeAccess().getNATURALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:6773:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalDSL.g:6773:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalDSL.g:6774:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPredefinedTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:6781:3: (enumLiteral_3= 'STRING' )
                    {
                    // InternalDSL.g:6781:3: (enumLiteral_3= 'STRING' )
                    // InternalDSL.g:6782:4: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPredefinedTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "rulePredefinedType"


    // $ANTLR start "rulePrefixeType"
    // InternalDSL.g:6792:1: rulePrefixeType returns [Enumerator current=null] : ( (enumLiteral_0= 'EXA' ) | (enumLiteral_1= 'PETA' ) | (enumLiteral_2= 'TERA' ) | (enumLiteral_3= 'GIGA' ) | (enumLiteral_4= 'MEGA' ) | (enumLiteral_5= 'KILO' ) | (enumLiteral_6= 'HECTO' ) | (enumLiteral_7= 'DECA' ) | (enumLiteral_8= 'DECI' ) | (enumLiteral_9= 'CENTI' ) | (enumLiteral_10= 'MILLI' ) | (enumLiteral_11= 'MICRO' ) | (enumLiteral_12= 'NANO' ) | (enumLiteral_13= 'PICO' ) | (enumLiteral_14= 'FEMTO' ) | (enumLiteral_15= 'ATTO' ) ) ;
    public final Enumerator rulePrefixeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;


        	enterRule();

        try {
            // InternalDSL.g:6798:2: ( ( (enumLiteral_0= 'EXA' ) | (enumLiteral_1= 'PETA' ) | (enumLiteral_2= 'TERA' ) | (enumLiteral_3= 'GIGA' ) | (enumLiteral_4= 'MEGA' ) | (enumLiteral_5= 'KILO' ) | (enumLiteral_6= 'HECTO' ) | (enumLiteral_7= 'DECA' ) | (enumLiteral_8= 'DECI' ) | (enumLiteral_9= 'CENTI' ) | (enumLiteral_10= 'MILLI' ) | (enumLiteral_11= 'MICRO' ) | (enumLiteral_12= 'NANO' ) | (enumLiteral_13= 'PICO' ) | (enumLiteral_14= 'FEMTO' ) | (enumLiteral_15= 'ATTO' ) ) )
            // InternalDSL.g:6799:2: ( (enumLiteral_0= 'EXA' ) | (enumLiteral_1= 'PETA' ) | (enumLiteral_2= 'TERA' ) | (enumLiteral_3= 'GIGA' ) | (enumLiteral_4= 'MEGA' ) | (enumLiteral_5= 'KILO' ) | (enumLiteral_6= 'HECTO' ) | (enumLiteral_7= 'DECA' ) | (enumLiteral_8= 'DECI' ) | (enumLiteral_9= 'CENTI' ) | (enumLiteral_10= 'MILLI' ) | (enumLiteral_11= 'MICRO' ) | (enumLiteral_12= 'NANO' ) | (enumLiteral_13= 'PICO' ) | (enumLiteral_14= 'FEMTO' ) | (enumLiteral_15= 'ATTO' ) )
            {
            // InternalDSL.g:6799:2: ( (enumLiteral_0= 'EXA' ) | (enumLiteral_1= 'PETA' ) | (enumLiteral_2= 'TERA' ) | (enumLiteral_3= 'GIGA' ) | (enumLiteral_4= 'MEGA' ) | (enumLiteral_5= 'KILO' ) | (enumLiteral_6= 'HECTO' ) | (enumLiteral_7= 'DECA' ) | (enumLiteral_8= 'DECI' ) | (enumLiteral_9= 'CENTI' ) | (enumLiteral_10= 'MILLI' ) | (enumLiteral_11= 'MICRO' ) | (enumLiteral_12= 'NANO' ) | (enumLiteral_13= 'PICO' ) | (enumLiteral_14= 'FEMTO' ) | (enumLiteral_15= 'ATTO' ) )
            int alt164=16;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt164=1;
                }
                break;
            case 92:
                {
                alt164=2;
                }
                break;
            case 93:
                {
                alt164=3;
                }
                break;
            case 94:
                {
                alt164=4;
                }
                break;
            case 95:
                {
                alt164=5;
                }
                break;
            case 96:
                {
                alt164=6;
                }
                break;
            case 97:
                {
                alt164=7;
                }
                break;
            case 98:
                {
                alt164=8;
                }
                break;
            case 99:
                {
                alt164=9;
                }
                break;
            case 100:
                {
                alt164=10;
                }
                break;
            case 101:
                {
                alt164=11;
                }
                break;
            case 102:
                {
                alt164=12;
                }
                break;
            case 103:
                {
                alt164=13;
                }
                break;
            case 104:
                {
                alt164=14;
                }
                break;
            case 105:
                {
                alt164=15;
                }
                break;
            case 106:
                {
                alt164=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }

            switch (alt164) {
                case 1 :
                    // InternalDSL.g:6800:3: (enumLiteral_0= 'EXA' )
                    {
                    // InternalDSL.g:6800:3: (enumLiteral_0= 'EXA' )
                    // InternalDSL.g:6801:4: enumLiteral_0= 'EXA'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getEXAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrefixeTypeAccess().getEXAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:6808:3: (enumLiteral_1= 'PETA' )
                    {
                    // InternalDSL.g:6808:3: (enumLiteral_1= 'PETA' )
                    // InternalDSL.g:6809:4: enumLiteral_1= 'PETA'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getPETAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrefixeTypeAccess().getPETAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:6816:3: (enumLiteral_2= 'TERA' )
                    {
                    // InternalDSL.g:6816:3: (enumLiteral_2= 'TERA' )
                    // InternalDSL.g:6817:4: enumLiteral_2= 'TERA'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getTERAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrefixeTypeAccess().getTERAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:6824:3: (enumLiteral_3= 'GIGA' )
                    {
                    // InternalDSL.g:6824:3: (enumLiteral_3= 'GIGA' )
                    // InternalDSL.g:6825:4: enumLiteral_3= 'GIGA'
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getGIGAEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrefixeTypeAccess().getGIGAEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:6832:3: (enumLiteral_4= 'MEGA' )
                    {
                    // InternalDSL.g:6832:3: (enumLiteral_4= 'MEGA' )
                    // InternalDSL.g:6833:4: enumLiteral_4= 'MEGA'
                    {
                    enumLiteral_4=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getMEGAEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPrefixeTypeAccess().getMEGAEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:6840:3: (enumLiteral_5= 'KILO' )
                    {
                    // InternalDSL.g:6840:3: (enumLiteral_5= 'KILO' )
                    // InternalDSL.g:6841:4: enumLiteral_5= 'KILO'
                    {
                    enumLiteral_5=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getKILOEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPrefixeTypeAccess().getKILOEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:6848:3: (enumLiteral_6= 'HECTO' )
                    {
                    // InternalDSL.g:6848:3: (enumLiteral_6= 'HECTO' )
                    // InternalDSL.g:6849:4: enumLiteral_6= 'HECTO'
                    {
                    enumLiteral_6=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getHECTOEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPrefixeTypeAccess().getHECTOEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:6856:3: (enumLiteral_7= 'DECA' )
                    {
                    // InternalDSL.g:6856:3: (enumLiteral_7= 'DECA' )
                    // InternalDSL.g:6857:4: enumLiteral_7= 'DECA'
                    {
                    enumLiteral_7=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getDECAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPrefixeTypeAccess().getDECAEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDSL.g:6864:3: (enumLiteral_8= 'DECI' )
                    {
                    // InternalDSL.g:6864:3: (enumLiteral_8= 'DECI' )
                    // InternalDSL.g:6865:4: enumLiteral_8= 'DECI'
                    {
                    enumLiteral_8=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getDECIEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPrefixeTypeAccess().getDECIEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDSL.g:6872:3: (enumLiteral_9= 'CENTI' )
                    {
                    // InternalDSL.g:6872:3: (enumLiteral_9= 'CENTI' )
                    // InternalDSL.g:6873:4: enumLiteral_9= 'CENTI'
                    {
                    enumLiteral_9=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getCENTIEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPrefixeTypeAccess().getCENTIEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDSL.g:6880:3: (enumLiteral_10= 'MILLI' )
                    {
                    // InternalDSL.g:6880:3: (enumLiteral_10= 'MILLI' )
                    // InternalDSL.g:6881:4: enumLiteral_10= 'MILLI'
                    {
                    enumLiteral_10=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getMILLIEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPrefixeTypeAccess().getMILLIEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDSL.g:6888:3: (enumLiteral_11= 'MICRO' )
                    {
                    // InternalDSL.g:6888:3: (enumLiteral_11= 'MICRO' )
                    // InternalDSL.g:6889:4: enumLiteral_11= 'MICRO'
                    {
                    enumLiteral_11=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getMICROEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPrefixeTypeAccess().getMICROEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDSL.g:6896:3: (enumLiteral_12= 'NANO' )
                    {
                    // InternalDSL.g:6896:3: (enumLiteral_12= 'NANO' )
                    // InternalDSL.g:6897:4: enumLiteral_12= 'NANO'
                    {
                    enumLiteral_12=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getNANOEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getPrefixeTypeAccess().getNANOEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalDSL.g:6904:3: (enumLiteral_13= 'PICO' )
                    {
                    // InternalDSL.g:6904:3: (enumLiteral_13= 'PICO' )
                    // InternalDSL.g:6905:4: enumLiteral_13= 'PICO'
                    {
                    enumLiteral_13=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getPICOEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getPrefixeTypeAccess().getPICOEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalDSL.g:6912:3: (enumLiteral_14= 'FEMTO' )
                    {
                    // InternalDSL.g:6912:3: (enumLiteral_14= 'FEMTO' )
                    // InternalDSL.g:6913:4: enumLiteral_14= 'FEMTO'
                    {
                    enumLiteral_14=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getFEMTOEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getPrefixeTypeAccess().getFEMTOEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalDSL.g:6920:3: (enumLiteral_15= 'ATTO' )
                    {
                    // InternalDSL.g:6920:3: (enumLiteral_15= 'ATTO' )
                    // InternalDSL.g:6921:4: enumLiteral_15= 'ATTO'
                    {
                    enumLiteral_15=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getPrefixeTypeAccess().getATTOEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getPrefixeTypeAccess().getATTOEnumLiteralDeclaration_15());
                    			

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
    // $ANTLR end "rulePrefixeType"


    // $ANTLR start "ruleUnitName"
    // InternalDSL.g:6931:1: ruleUnitName returns [Enumerator current=null] : ( (enumLiteral_0= 'METRE' ) | (enumLiteral_1= 'GRAM' ) | (enumLiteral_2= 'SECOND' ) | (enumLiteral_3= 'AMPERE' ) | (enumLiteral_4= 'KELVIN' ) | (enumLiteral_5= 'MOLE' ) | (enumLiteral_6= 'CANDELA' ) | (enumLiteral_7= 'RADIAN' ) | (enumLiteral_8= 'STERADIAN' ) | (enumLiteral_9= 'HERTZ' ) | (enumLiteral_10= 'NEWTON' ) | (enumLiteral_11= 'PASCAL' ) | (enumLiteral_12= 'JOULE' ) | (enumLiteral_13= 'WATT' ) | (enumLiteral_14= 'COULOMB' ) | (enumLiteral_15= 'VOLT' ) | (enumLiteral_16= 'FARAD' ) | (enumLiteral_17= 'OHM' ) | (enumLiteral_18= 'SIEMENS' ) | (enumLiteral_19= 'WEBER' ) | (enumLiteral_20= 'TESLA' ) | (enumLiteral_21= 'HENRY' ) | (enumLiteral_22= 'DEGREE_CELSIUS' ) | (enumLiteral_23= 'LUMEN' ) | (enumLiteral_24= 'LUX' ) | (enumLiteral_25= 'BECQUEREL' ) | (enumLiteral_26= 'GRAY' ) | (enumLiteral_27= 'SIEVERT' ) ) ;
    public final Enumerator ruleUnitName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;


        	enterRule();

        try {
            // InternalDSL.g:6937:2: ( ( (enumLiteral_0= 'METRE' ) | (enumLiteral_1= 'GRAM' ) | (enumLiteral_2= 'SECOND' ) | (enumLiteral_3= 'AMPERE' ) | (enumLiteral_4= 'KELVIN' ) | (enumLiteral_5= 'MOLE' ) | (enumLiteral_6= 'CANDELA' ) | (enumLiteral_7= 'RADIAN' ) | (enumLiteral_8= 'STERADIAN' ) | (enumLiteral_9= 'HERTZ' ) | (enumLiteral_10= 'NEWTON' ) | (enumLiteral_11= 'PASCAL' ) | (enumLiteral_12= 'JOULE' ) | (enumLiteral_13= 'WATT' ) | (enumLiteral_14= 'COULOMB' ) | (enumLiteral_15= 'VOLT' ) | (enumLiteral_16= 'FARAD' ) | (enumLiteral_17= 'OHM' ) | (enumLiteral_18= 'SIEMENS' ) | (enumLiteral_19= 'WEBER' ) | (enumLiteral_20= 'TESLA' ) | (enumLiteral_21= 'HENRY' ) | (enumLiteral_22= 'DEGREE_CELSIUS' ) | (enumLiteral_23= 'LUMEN' ) | (enumLiteral_24= 'LUX' ) | (enumLiteral_25= 'BECQUEREL' ) | (enumLiteral_26= 'GRAY' ) | (enumLiteral_27= 'SIEVERT' ) ) )
            // InternalDSL.g:6938:2: ( (enumLiteral_0= 'METRE' ) | (enumLiteral_1= 'GRAM' ) | (enumLiteral_2= 'SECOND' ) | (enumLiteral_3= 'AMPERE' ) | (enumLiteral_4= 'KELVIN' ) | (enumLiteral_5= 'MOLE' ) | (enumLiteral_6= 'CANDELA' ) | (enumLiteral_7= 'RADIAN' ) | (enumLiteral_8= 'STERADIAN' ) | (enumLiteral_9= 'HERTZ' ) | (enumLiteral_10= 'NEWTON' ) | (enumLiteral_11= 'PASCAL' ) | (enumLiteral_12= 'JOULE' ) | (enumLiteral_13= 'WATT' ) | (enumLiteral_14= 'COULOMB' ) | (enumLiteral_15= 'VOLT' ) | (enumLiteral_16= 'FARAD' ) | (enumLiteral_17= 'OHM' ) | (enumLiteral_18= 'SIEMENS' ) | (enumLiteral_19= 'WEBER' ) | (enumLiteral_20= 'TESLA' ) | (enumLiteral_21= 'HENRY' ) | (enumLiteral_22= 'DEGREE_CELSIUS' ) | (enumLiteral_23= 'LUMEN' ) | (enumLiteral_24= 'LUX' ) | (enumLiteral_25= 'BECQUEREL' ) | (enumLiteral_26= 'GRAY' ) | (enumLiteral_27= 'SIEVERT' ) )
            {
            // InternalDSL.g:6938:2: ( (enumLiteral_0= 'METRE' ) | (enumLiteral_1= 'GRAM' ) | (enumLiteral_2= 'SECOND' ) | (enumLiteral_3= 'AMPERE' ) | (enumLiteral_4= 'KELVIN' ) | (enumLiteral_5= 'MOLE' ) | (enumLiteral_6= 'CANDELA' ) | (enumLiteral_7= 'RADIAN' ) | (enumLiteral_8= 'STERADIAN' ) | (enumLiteral_9= 'HERTZ' ) | (enumLiteral_10= 'NEWTON' ) | (enumLiteral_11= 'PASCAL' ) | (enumLiteral_12= 'JOULE' ) | (enumLiteral_13= 'WATT' ) | (enumLiteral_14= 'COULOMB' ) | (enumLiteral_15= 'VOLT' ) | (enumLiteral_16= 'FARAD' ) | (enumLiteral_17= 'OHM' ) | (enumLiteral_18= 'SIEMENS' ) | (enumLiteral_19= 'WEBER' ) | (enumLiteral_20= 'TESLA' ) | (enumLiteral_21= 'HENRY' ) | (enumLiteral_22= 'DEGREE_CELSIUS' ) | (enumLiteral_23= 'LUMEN' ) | (enumLiteral_24= 'LUX' ) | (enumLiteral_25= 'BECQUEREL' ) | (enumLiteral_26= 'GRAY' ) | (enumLiteral_27= 'SIEVERT' ) )
            int alt165=28;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt165=1;
                }
                break;
            case 108:
                {
                alt165=2;
                }
                break;
            case 109:
                {
                alt165=3;
                }
                break;
            case 110:
                {
                alt165=4;
                }
                break;
            case 111:
                {
                alt165=5;
                }
                break;
            case 112:
                {
                alt165=6;
                }
                break;
            case 113:
                {
                alt165=7;
                }
                break;
            case 114:
                {
                alt165=8;
                }
                break;
            case 115:
                {
                alt165=9;
                }
                break;
            case 116:
                {
                alt165=10;
                }
                break;
            case 117:
                {
                alt165=11;
                }
                break;
            case 118:
                {
                alt165=12;
                }
                break;
            case 119:
                {
                alt165=13;
                }
                break;
            case 120:
                {
                alt165=14;
                }
                break;
            case 121:
                {
                alt165=15;
                }
                break;
            case 122:
                {
                alt165=16;
                }
                break;
            case 123:
                {
                alt165=17;
                }
                break;
            case 124:
                {
                alt165=18;
                }
                break;
            case 125:
                {
                alt165=19;
                }
                break;
            case 126:
                {
                alt165=20;
                }
                break;
            case 127:
                {
                alt165=21;
                }
                break;
            case 128:
                {
                alt165=22;
                }
                break;
            case 129:
                {
                alt165=23;
                }
                break;
            case 130:
                {
                alt165=24;
                }
                break;
            case 131:
                {
                alt165=25;
                }
                break;
            case 132:
                {
                alt165=26;
                }
                break;
            case 133:
                {
                alt165=27;
                }
                break;
            case 134:
                {
                alt165=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }

            switch (alt165) {
                case 1 :
                    // InternalDSL.g:6939:3: (enumLiteral_0= 'METRE' )
                    {
                    // InternalDSL.g:6939:3: (enumLiteral_0= 'METRE' )
                    // InternalDSL.g:6940:4: enumLiteral_0= 'METRE'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getMETREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitNameAccess().getMETREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:6947:3: (enumLiteral_1= 'GRAM' )
                    {
                    // InternalDSL.g:6947:3: (enumLiteral_1= 'GRAM' )
                    // InternalDSL.g:6948:4: enumLiteral_1= 'GRAM'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getGRAMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitNameAccess().getGRAMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:6955:3: (enumLiteral_2= 'SECOND' )
                    {
                    // InternalDSL.g:6955:3: (enumLiteral_2= 'SECOND' )
                    // InternalDSL.g:6956:4: enumLiteral_2= 'SECOND'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getSECONDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitNameAccess().getSECONDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:6963:3: (enumLiteral_3= 'AMPERE' )
                    {
                    // InternalDSL.g:6963:3: (enumLiteral_3= 'AMPERE' )
                    // InternalDSL.g:6964:4: enumLiteral_3= 'AMPERE'
                    {
                    enumLiteral_3=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getAMPEREEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitNameAccess().getAMPEREEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:6971:3: (enumLiteral_4= 'KELVIN' )
                    {
                    // InternalDSL.g:6971:3: (enumLiteral_4= 'KELVIN' )
                    // InternalDSL.g:6972:4: enumLiteral_4= 'KELVIN'
                    {
                    enumLiteral_4=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getKELVINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnitNameAccess().getKELVINEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:6979:3: (enumLiteral_5= 'MOLE' )
                    {
                    // InternalDSL.g:6979:3: (enumLiteral_5= 'MOLE' )
                    // InternalDSL.g:6980:4: enumLiteral_5= 'MOLE'
                    {
                    enumLiteral_5=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getMOLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUnitNameAccess().getMOLEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:6987:3: (enumLiteral_6= 'CANDELA' )
                    {
                    // InternalDSL.g:6987:3: (enumLiteral_6= 'CANDELA' )
                    // InternalDSL.g:6988:4: enumLiteral_6= 'CANDELA'
                    {
                    enumLiteral_6=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getCANDELAEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getUnitNameAccess().getCANDELAEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:6995:3: (enumLiteral_7= 'RADIAN' )
                    {
                    // InternalDSL.g:6995:3: (enumLiteral_7= 'RADIAN' )
                    // InternalDSL.g:6996:4: enumLiteral_7= 'RADIAN'
                    {
                    enumLiteral_7=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getRADIANEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getUnitNameAccess().getRADIANEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDSL.g:7003:3: (enumLiteral_8= 'STERADIAN' )
                    {
                    // InternalDSL.g:7003:3: (enumLiteral_8= 'STERADIAN' )
                    // InternalDSL.g:7004:4: enumLiteral_8= 'STERADIAN'
                    {
                    enumLiteral_8=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getSTERADIANEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getUnitNameAccess().getSTERADIANEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDSL.g:7011:3: (enumLiteral_9= 'HERTZ' )
                    {
                    // InternalDSL.g:7011:3: (enumLiteral_9= 'HERTZ' )
                    // InternalDSL.g:7012:4: enumLiteral_9= 'HERTZ'
                    {
                    enumLiteral_9=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getHERTZEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getUnitNameAccess().getHERTZEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDSL.g:7019:3: (enumLiteral_10= 'NEWTON' )
                    {
                    // InternalDSL.g:7019:3: (enumLiteral_10= 'NEWTON' )
                    // InternalDSL.g:7020:4: enumLiteral_10= 'NEWTON'
                    {
                    enumLiteral_10=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getNEWTONEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getUnitNameAccess().getNEWTONEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDSL.g:7027:3: (enumLiteral_11= 'PASCAL' )
                    {
                    // InternalDSL.g:7027:3: (enumLiteral_11= 'PASCAL' )
                    // InternalDSL.g:7028:4: enumLiteral_11= 'PASCAL'
                    {
                    enumLiteral_11=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getPASCALEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getUnitNameAccess().getPASCALEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDSL.g:7035:3: (enumLiteral_12= 'JOULE' )
                    {
                    // InternalDSL.g:7035:3: (enumLiteral_12= 'JOULE' )
                    // InternalDSL.g:7036:4: enumLiteral_12= 'JOULE'
                    {
                    enumLiteral_12=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getJOULEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getUnitNameAccess().getJOULEEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalDSL.g:7043:3: (enumLiteral_13= 'WATT' )
                    {
                    // InternalDSL.g:7043:3: (enumLiteral_13= 'WATT' )
                    // InternalDSL.g:7044:4: enumLiteral_13= 'WATT'
                    {
                    enumLiteral_13=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getWATTEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getUnitNameAccess().getWATTEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalDSL.g:7051:3: (enumLiteral_14= 'COULOMB' )
                    {
                    // InternalDSL.g:7051:3: (enumLiteral_14= 'COULOMB' )
                    // InternalDSL.g:7052:4: enumLiteral_14= 'COULOMB'
                    {
                    enumLiteral_14=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getCOULOMBEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getUnitNameAccess().getCOULOMBEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalDSL.g:7059:3: (enumLiteral_15= 'VOLT' )
                    {
                    // InternalDSL.g:7059:3: (enumLiteral_15= 'VOLT' )
                    // InternalDSL.g:7060:4: enumLiteral_15= 'VOLT'
                    {
                    enumLiteral_15=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getVOLTEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getUnitNameAccess().getVOLTEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalDSL.g:7067:3: (enumLiteral_16= 'FARAD' )
                    {
                    // InternalDSL.g:7067:3: (enumLiteral_16= 'FARAD' )
                    // InternalDSL.g:7068:4: enumLiteral_16= 'FARAD'
                    {
                    enumLiteral_16=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getFARADEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getUnitNameAccess().getFARADEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalDSL.g:7075:3: (enumLiteral_17= 'OHM' )
                    {
                    // InternalDSL.g:7075:3: (enumLiteral_17= 'OHM' )
                    // InternalDSL.g:7076:4: enumLiteral_17= 'OHM'
                    {
                    enumLiteral_17=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getOHMEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getUnitNameAccess().getOHMEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalDSL.g:7083:3: (enumLiteral_18= 'SIEMENS' )
                    {
                    // InternalDSL.g:7083:3: (enumLiteral_18= 'SIEMENS' )
                    // InternalDSL.g:7084:4: enumLiteral_18= 'SIEMENS'
                    {
                    enumLiteral_18=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getSIEMENSEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getUnitNameAccess().getSIEMENSEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalDSL.g:7091:3: (enumLiteral_19= 'WEBER' )
                    {
                    // InternalDSL.g:7091:3: (enumLiteral_19= 'WEBER' )
                    // InternalDSL.g:7092:4: enumLiteral_19= 'WEBER'
                    {
                    enumLiteral_19=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getWEBEREnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getUnitNameAccess().getWEBEREnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalDSL.g:7099:3: (enumLiteral_20= 'TESLA' )
                    {
                    // InternalDSL.g:7099:3: (enumLiteral_20= 'TESLA' )
                    // InternalDSL.g:7100:4: enumLiteral_20= 'TESLA'
                    {
                    enumLiteral_20=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getTESLAEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getUnitNameAccess().getTESLAEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalDSL.g:7107:3: (enumLiteral_21= 'HENRY' )
                    {
                    // InternalDSL.g:7107:3: (enumLiteral_21= 'HENRY' )
                    // InternalDSL.g:7108:4: enumLiteral_21= 'HENRY'
                    {
                    enumLiteral_21=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getHENRYEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getUnitNameAccess().getHENRYEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalDSL.g:7115:3: (enumLiteral_22= 'DEGREE_CELSIUS' )
                    {
                    // InternalDSL.g:7115:3: (enumLiteral_22= 'DEGREE_CELSIUS' )
                    // InternalDSL.g:7116:4: enumLiteral_22= 'DEGREE_CELSIUS'
                    {
                    enumLiteral_22=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getDEGREE_CELSIUSEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getUnitNameAccess().getDEGREE_CELSIUSEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalDSL.g:7123:3: (enumLiteral_23= 'LUMEN' )
                    {
                    // InternalDSL.g:7123:3: (enumLiteral_23= 'LUMEN' )
                    // InternalDSL.g:7124:4: enumLiteral_23= 'LUMEN'
                    {
                    enumLiteral_23=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getLUMENEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getUnitNameAccess().getLUMENEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalDSL.g:7131:3: (enumLiteral_24= 'LUX' )
                    {
                    // InternalDSL.g:7131:3: (enumLiteral_24= 'LUX' )
                    // InternalDSL.g:7132:4: enumLiteral_24= 'LUX'
                    {
                    enumLiteral_24=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getLUXEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getUnitNameAccess().getLUXEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalDSL.g:7139:3: (enumLiteral_25= 'BECQUEREL' )
                    {
                    // InternalDSL.g:7139:3: (enumLiteral_25= 'BECQUEREL' )
                    // InternalDSL.g:7140:4: enumLiteral_25= 'BECQUEREL'
                    {
                    enumLiteral_25=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getBECQUERELEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getUnitNameAccess().getBECQUERELEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalDSL.g:7147:3: (enumLiteral_26= 'GRAY' )
                    {
                    // InternalDSL.g:7147:3: (enumLiteral_26= 'GRAY' )
                    // InternalDSL.g:7148:4: enumLiteral_26= 'GRAY'
                    {
                    enumLiteral_26=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getGRAYEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getUnitNameAccess().getGRAYEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalDSL.g:7155:3: (enumLiteral_27= 'SIEVERT' )
                    {
                    // InternalDSL.g:7155:3: (enumLiteral_27= 'SIEVERT' )
                    // InternalDSL.g:7156:4: enumLiteral_27= 'SIEVERT'
                    {
                    enumLiteral_27=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getUnitNameAccess().getSIEVERTEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getUnitNameAccess().getSIEVERTEnumLiteralDeclaration_27());
                    			

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
    // $ANTLR end "ruleUnitName"


    // $ANTLR start "rulePredefinedCurrency"
    // InternalDSL.g:7166:1: rulePredefinedCurrency returns [Enumerator current=null] : ( (enumLiteral_0= 'EUR' ) | (enumLiteral_1= 'USD' ) | (enumLiteral_2= 'SUR' ) | (enumLiteral_3= 'JPY' ) | (enumLiteral_4= 'CNY' ) | (enumLiteral_5= 'CHF' ) ) ;
    public final Enumerator rulePredefinedCurrency() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalDSL.g:7172:2: ( ( (enumLiteral_0= 'EUR' ) | (enumLiteral_1= 'USD' ) | (enumLiteral_2= 'SUR' ) | (enumLiteral_3= 'JPY' ) | (enumLiteral_4= 'CNY' ) | (enumLiteral_5= 'CHF' ) ) )
            // InternalDSL.g:7173:2: ( (enumLiteral_0= 'EUR' ) | (enumLiteral_1= 'USD' ) | (enumLiteral_2= 'SUR' ) | (enumLiteral_3= 'JPY' ) | (enumLiteral_4= 'CNY' ) | (enumLiteral_5= 'CHF' ) )
            {
            // InternalDSL.g:7173:2: ( (enumLiteral_0= 'EUR' ) | (enumLiteral_1= 'USD' ) | (enumLiteral_2= 'SUR' ) | (enumLiteral_3= 'JPY' ) | (enumLiteral_4= 'CNY' ) | (enumLiteral_5= 'CHF' ) )
            int alt166=6;
            switch ( input.LA(1) ) {
            case 135:
                {
                alt166=1;
                }
                break;
            case 136:
                {
                alt166=2;
                }
                break;
            case 137:
                {
                alt166=3;
                }
                break;
            case 138:
                {
                alt166=4;
                }
                break;
            case 139:
                {
                alt166=5;
                }
                break;
            case 140:
                {
                alt166=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }

            switch (alt166) {
                case 1 :
                    // InternalDSL.g:7174:3: (enumLiteral_0= 'EUR' )
                    {
                    // InternalDSL.g:7174:3: (enumLiteral_0= 'EUR' )
                    // InternalDSL.g:7175:4: enumLiteral_0= 'EUR'
                    {
                    enumLiteral_0=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCurrencyAccess().getEUREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPredefinedCurrencyAccess().getEUREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:7182:3: (enumLiteral_1= 'USD' )
                    {
                    // InternalDSL.g:7182:3: (enumLiteral_1= 'USD' )
                    // InternalDSL.g:7183:4: enumLiteral_1= 'USD'
                    {
                    enumLiteral_1=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCurrencyAccess().getUSDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPredefinedCurrencyAccess().getUSDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:7190:3: (enumLiteral_2= 'SUR' )
                    {
                    // InternalDSL.g:7190:3: (enumLiteral_2= 'SUR' )
                    // InternalDSL.g:7191:4: enumLiteral_2= 'SUR'
                    {
                    enumLiteral_2=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCurrencyAccess().getSUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPredefinedCurrencyAccess().getSUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:7198:3: (enumLiteral_3= 'JPY' )
                    {
                    // InternalDSL.g:7198:3: (enumLiteral_3= 'JPY' )
                    // InternalDSL.g:7199:4: enumLiteral_3= 'JPY'
                    {
                    enumLiteral_3=(Token)match(input,138,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCurrencyAccess().getJPYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPredefinedCurrencyAccess().getJPYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:7206:3: (enumLiteral_4= 'CNY' )
                    {
                    // InternalDSL.g:7206:3: (enumLiteral_4= 'CNY' )
                    // InternalDSL.g:7207:4: enumLiteral_4= 'CNY'
                    {
                    enumLiteral_4=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCurrencyAccess().getCNYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPredefinedCurrencyAccess().getCNYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:7214:3: (enumLiteral_5= 'CHF' )
                    {
                    // InternalDSL.g:7214:3: (enumLiteral_5= 'CHF' )
                    // InternalDSL.g:7215:4: enumLiteral_5= 'CHF'
                    {
                    enumLiteral_5=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCurrencyAccess().getCHFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPredefinedCurrencyAccess().getCHFEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "rulePredefinedCurrency"


    // $ANTLR start "rulePredefinedCollection"
    // InternalDSL.g:7225:1: rulePredefinedCollection returns [Enumerator current=null] : ( (enumLiteral_0= 'ARRAY' ) | (enumLiteral_1= 'SET' ) | (enumLiteral_2= 'BAG' ) | (enumLiteral_3= 'LIST' ) ) ;
    public final Enumerator rulePredefinedCollection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDSL.g:7231:2: ( ( (enumLiteral_0= 'ARRAY' ) | (enumLiteral_1= 'SET' ) | (enumLiteral_2= 'BAG' ) | (enumLiteral_3= 'LIST' ) ) )
            // InternalDSL.g:7232:2: ( (enumLiteral_0= 'ARRAY' ) | (enumLiteral_1= 'SET' ) | (enumLiteral_2= 'BAG' ) | (enumLiteral_3= 'LIST' ) )
            {
            // InternalDSL.g:7232:2: ( (enumLiteral_0= 'ARRAY' ) | (enumLiteral_1= 'SET' ) | (enumLiteral_2= 'BAG' ) | (enumLiteral_3= 'LIST' ) )
            int alt167=4;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt167=1;
                }
                break;
            case 142:
                {
                alt167=2;
                }
                break;
            case 143:
                {
                alt167=3;
                }
                break;
            case 144:
                {
                alt167=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }

            switch (alt167) {
                case 1 :
                    // InternalDSL.g:7233:3: (enumLiteral_0= 'ARRAY' )
                    {
                    // InternalDSL.g:7233:3: (enumLiteral_0= 'ARRAY' )
                    // InternalDSL.g:7234:4: enumLiteral_0= 'ARRAY'
                    {
                    enumLiteral_0=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCollectionAccess().getARRAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPredefinedCollectionAccess().getARRAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:7241:3: (enumLiteral_1= 'SET' )
                    {
                    // InternalDSL.g:7241:3: (enumLiteral_1= 'SET' )
                    // InternalDSL.g:7242:4: enumLiteral_1= 'SET'
                    {
                    enumLiteral_1=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCollectionAccess().getSETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPredefinedCollectionAccess().getSETEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:7249:3: (enumLiteral_2= 'BAG' )
                    {
                    // InternalDSL.g:7249:3: (enumLiteral_2= 'BAG' )
                    // InternalDSL.g:7250:4: enumLiteral_2= 'BAG'
                    {
                    enumLiteral_2=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCollectionAccess().getBAGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPredefinedCollectionAccess().getBAGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:7257:3: (enumLiteral_3= 'LIST' )
                    {
                    // InternalDSL.g:7257:3: (enumLiteral_3= 'LIST' )
                    // InternalDSL.g:7258:4: enumLiteral_3= 'LIST'
                    {
                    enumLiteral_3=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedCollectionAccess().getLISTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPredefinedCollectionAccess().getLISTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "rulePredefinedCollection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001AAB92040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x061F000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xD000400000000000L,0x000000000000029AL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001C88000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C08000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000005C80000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000005C00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000005800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000021C80000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000021C00000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000021800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010001C80000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010001C00000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010001800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010001000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040001C80000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040001C00000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040001800000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x01E0000000808000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x01C0000000808000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0180000000808000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0180000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x020E000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x020C000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x040E000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x040C000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0408000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x09E0000000800000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x09C0000000800000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0980000000800000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0980000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0900000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x00000000000CD400L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000800L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010800L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300800L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x000007FFF8000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0xFFFFF80000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000801L});

}