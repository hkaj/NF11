package logoparsing.grammar;

import logogui.Traceur;
import logoparsing.grammar.LogoParser.AvContext;
import logoparsing.grammar.LogoParser.ExprContext;
import logoparsing.grammar.LogoParser.IntContext;
import logoparsing.grammar.LogoParser.MultContext;
import logoparsing.grammar.LogoParser.TdContext;
import logoparsing.grammar.LogoParser.TgContext;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	Traceur traceur;
	ParseTreeProperty<Integer> atts = new ParseTreeProperty<Integer>();

	public LogoTreeVisitor() {
		super();
	}
	public void initialize(java.awt.Graphics g) {
	      traceur = new Traceur();
	      traceur.setGraphics(g);
    }
	public void setAttValue(ParseTree node, int value) { 
		atts.put(node, value);
	}
	public int getAttValue(ParseTree node) { return atts.get(node); }
	@Override
	public Integer visitAv(AvContext ctx) {
		visitChildren(ctx);
		String intText = ctx.getText(); 
		traceur.avance(getAttValue(ctx.expr()));
		return 0;
	}
	
	@Override
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		traceur.tg(getAttValue(ctx.expr()));		
		return 0;
	}
	
	@Override
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		traceur.td(getAttValue(ctx.expr()));
		return 0;
	}
	@Override
	public Integer visitMult(MultContext ctx) {
		int res = Integer.parseInt(ctx.expr(0).getText()) * Integer.parseInt(ctx.expr(1).getText());
		setAttValue(ctx, res);
		return res;
	}
	@Override
	public Integer visitInt(IntContext ctx) {
		int res = Integer.parseInt(ctx.getText());
		setAttValue(ctx, res);
		return res;
	}
}
