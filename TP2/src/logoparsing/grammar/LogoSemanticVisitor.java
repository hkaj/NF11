package logoparsing.grammar;

import logoparsing.grammar.LogoParser.FunctionContext;
import logoparsing.grammar.LogoParser.IdContext;
import logoparsing.grammar.LogoParser.ProcedureContext;

public class LogoSemanticVisitor extends LogoTreeVisitor {

	@Override
	public Integer visitId(IdContext ctx) {
		return super.visitId(ctx);
	}
	
	@Override
	public Integer visitFunction(FunctionContext ctx) {
		Function f = mContext.getFunction(ctx.FUNCTION_ID().getText());
		
		if (f.arguments.size() != ctx.expr().size()) {
			throw new RuntimeException("Wrong arity (given " + f.arguments.size() + " expected " + ctx.expr().size() + ")");
		}
		
		return super.visitFunction(ctx);
	}

	@Override
	public Integer visitProcedure(ProcedureContext ctx) {
		Function f = mContext.getFunction(ctx.FUNCTION_ID().getText());

		if (f.arguments.size() != ctx.expr().size()) {
			throw new RuntimeException("Wrong arity (given " + f.arguments.size() + " expected " + ctx.expr().size() + ")");
		}
		return super.visitProcedure(ctx);
	}
	
	
}
	