package logoparsing.grammar;

import logogui.Traceur;
import logoparsing.grammar.LogoParser.AddContext;
import logoparsing.grammar.LogoParser.AvContext;
import logoparsing.grammar.LogoParser.BcContext;
import logoparsing.grammar.LogoParser.DivContext;
import logoparsing.grammar.LogoParser.ExprContext;
import logoparsing.grammar.LogoParser.FccContext;
import logoparsing.grammar.LogoParser.FposContext;
import logoparsing.grammar.LogoParser.IfContext;
import logoparsing.grammar.LogoParser.IntContext;
import logoparsing.grammar.LogoParser.LcContext;
import logoparsing.grammar.LogoParser.LoopContext;
import logoparsing.grammar.LogoParser.MultContext;
import logoparsing.grammar.LogoParser.ParContext;
import logoparsing.grammar.LogoParser.ReContext;
import logoparsing.grammar.LogoParser.RepeatContext;
import logoparsing.grammar.LogoParser.SetContext;
import logoparsing.grammar.LogoParser.SubContext;
import logoparsing.grammar.LogoParser.TdContext;
import logoparsing.grammar.LogoParser.TgContext;
import logoparsing.grammar.LogoParser.VeContext;
import logoparsing.grammar.LogoParser.WhileContext;

import org.antlr.v4.runtime.misc.NotNull;

public class LogoExecutionTreeVisitor extends LogoTreeVisitor {
	private Traceur mTraceur;
	public LogoExecutionTreeVisitor() {
		super();
	}
	public void initialize(java.awt.Graphics g) {
	      mTraceur = new Traceur();
	      mTraceur.setGraphics(g);
    }
	
	@Override
	public Integer visitSet(SetContext ctx)
	{
		visitChildren(ctx);
		
		String var = ctx.DECLARATION_ID().getText().replace("\"", "");
		int value = getValueFromTree(ctx.expr());
		mContext.setSymbolValue(var, value);

		return 0;
	}		
	
	@Override
	public Integer visitAv(AvContext ctx) {
		visitChildren(ctx);
		mTraceur.avance(getAttValue(ctx.expr()));
		return 0;
	}

	@Override
	public Integer visitRe(ReContext ctx) {
		visitChildren(ctx);
		mTraceur.recule(getAttValue(ctx.expr()));
		return 0;
	}	
	
	@Override
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		mTraceur.tg(getAttValue(ctx.expr()));		
		return 0;
	}
	
	@Override
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		mTraceur.td(getAttValue(ctx.expr()));
		return 0;
	}
	
	@Override
	public Integer visitLc(LcContext ctx) {
		visitChildren(ctx);		
		mTraceur.setDrawing(false);
		return 0;
	}

	@Override
	public Integer visitBc(BcContext ctx) {
		visitChildren(ctx);		
		mTraceur.setDrawing(true);
		return 0;
	}
	
	@Override
	public Integer visitVe(VeContext ctx) {
		visitChildren(ctx);
		mTraceur.clear();
		mTraceur.setPos(300, 300);
		return 0;
	}

	@Override
	public Integer visitFpos(FposContext ctx) {
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		mTraceur.setPos(a, b);
		return 0;
	}	
	
	
	
	@Override
	public Integer visitFcc(FccContext ctx) {
		visitChildren(ctx);
		int n = getValueFromTree(ctx.expr());		
		mTraceur.setColor(n);
		return 0;
	}	
}


