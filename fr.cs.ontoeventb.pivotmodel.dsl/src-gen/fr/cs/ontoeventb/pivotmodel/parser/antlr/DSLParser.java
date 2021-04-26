/*
 * generated by Xtext 2.25.0
 */
package fr.cs.ontoeventb.pivotmodel.parser.antlr;

import com.google.inject.Inject;
import fr.cs.ontoeventb.pivotmodel.parser.antlr.internal.InternalDSLParser;
import fr.cs.ontoeventb.pivotmodel.services.DSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DSLParser extends AbstractAntlrParser {

	@Inject
	private DSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDSLParser createParser(XtextTokenStream stream) {
		return new InternalDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Ontology";
	}

	public DSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
