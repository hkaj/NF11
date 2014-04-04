package logoparsing.grammar;

import logogui.Traceur;
import logoparsing.grammar.LogoParser.AvContext;
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
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.avance(getAttValue(ctx.INT()));
		return 0;
	}
	
	@Override
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.tg(getAttValue(ctx.INT()));		
		return 0;
	}
	
	@Override
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.td(getAttValue(ctx.INT()));
		return 0;
	}
	
}
