package logoparsing.grammar;

import java.util.ArrayList;
import java.util.List;

import logoparsing.grammar.LogoParser.ExprContext;
import logoparsing.grammar.LogoParser.FunctionContext;
import logoparsing.grammar.LogoParser.FunctionDeclarationContext;
import logoparsing.grammar.LogoParser.IdContext;
import logoparsing.grammar.LogoParser.ProcedureContext;
import logoparsing.grammar.LogoParser.RepeatContext;
import logoparsing.grammar.LogoParser.WhileContext;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {

	private ParseTreeProperty<Integer> mAtts = new ParseTreeProperty<Integer>();
	protected Context mContext = new Context();

	public LogoTreeVisitor() {
		super();
	}

	public void setAttValue(ParseTree node, int value) { 
		mAtts.put(node, value);
	}

	public Integer getAttValue(ParseTree node) { return mAtts.get(node); }

	
	
	@Override
	public Integer visitId(IdContext ctx) {
		visitChildren(ctx);
		String symbol = ctx.getText().replace(":", "");
		int res = mContext.getSymbolValue(symbol);
		setAttValue(ctx, res);
		return res;
	}

	@Override
	public Integer visitRepeat(RepeatContext ctx) {
		visit(ctx.expr());
		int n = getAttValue(ctx.expr());
		
		mContext = new Context(mContext);
		
		for (int i = 0; i < n; i++) {
			mContext.mLoop = i;
			visit(ctx.liste_instructions());
		}
		
		mContext = mContext.getUpperContext();
		
		return n;
	}
	
	@Override
	public Integer visitWhile(WhileContext ctx) {
		visit(ctx.expr());
		int n = getAttValue(ctx.expr());
		
		while (n != 0) {
			visit(ctx.liste_instructions());			
			visit(ctx.expr());
			n = getAttValue(ctx.expr());			
		}
		return 0;
	}	
	
	@Override
	public Integer visitFunction(FunctionContext ctx) {
		
		Function f = mContext.getFunction(ctx.FUNCTION_ID().getText());
	
		mContext = new Context(mContext);
		
		List<Integer> values = new ArrayList<Integer>();
		for (ExprContext expr : ctx.expr()) {
			visit(expr);
			values.add(getAttValue(expr));
		}		
		mContext.addArguments(f, values);		
		
		visit(f.ctx.programme());
		if (f.ctx.expr() != null) {
			visit(f.ctx.expr());
		}
		int returnValue = f.ctx.expr() == null ? 0 : getAttValue(f.ctx.expr());
		setAttValue(ctx, returnValue);
		
		mContext = mContext.getUpperContext();		
		return returnValue;
	}

	@Override
	public Integer visitProcedure(ProcedureContext ctx) {
		Function f = mContext.getFunction(ctx.FUNCTION_ID().getText());
	
		mContext = new Context(mContext);
		
		List<Integer> values = new ArrayList<Integer>();
		for (ExprContext expr : ctx.expr()) {
			visit(expr);
			values.add(getAttValue(expr));
		}		
		mContext.addArguments(f, values);		
		
		visit(f.ctx.programme());
		if (f.ctx.expr() != null) {
			visit(f.ctx.expr());
		}
		int returnValue = f.ctx.expr() == null ? 0 : getAttValue(f.ctx.expr());
		setAttValue(ctx, returnValue);
		
		mContext = mContext.getUpperContext();		
		return returnValue;
	}

	@Override
	public Integer visitFunctionDeclaration(FunctionDeclarationContext ctx) {
		mContext.addFunction(ctx);
		return 0;		
	}

}