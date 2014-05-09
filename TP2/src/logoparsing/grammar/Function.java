package logoparsing.grammar;

import java.util.ArrayList;
import java.util.List;

import logoparsing.grammar.LogoParser.FunctionDeclarationContext;
import logoparsing.grammar.LogoParser.VariableContext;

public class Function {
	public FunctionDeclarationContext ctx;
	public String name;
	public List<String> arguments = new ArrayList<String>();
	
	public Function(FunctionDeclarationContext ctx) {
		this.ctx = ctx;
		this.name = ctx.FUNCTION_ID().getText();

		for (VariableContext variableCtx : ctx.variable()) {
			arguments.add(variableCtx.getText().replace("\"", ""));
		}		
	}
}
