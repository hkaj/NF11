package logoparsing.grammar;

import java.util.Map;

import logogui.Traceur;
import logoparsing.grammar.LogoParser.AddContext;
import logoparsing.grammar.LogoParser.AvContext;
import logoparsing.grammar.LogoParser.BcContext;
import logoparsing.grammar.LogoParser.DivContext;
import logoparsing.grammar.LogoParser.ExprContext;
import logoparsing.grammar.LogoParser.FccContext;
import logoparsing.grammar.LogoParser.FposContext;
import logoparsing.grammar.LogoParser.IntContext;
import logoparsing.grammar.LogoParser.LcContext;
import logoparsing.grammar.LogoParser.MultContext;
import logoparsing.grammar.LogoParser.ParContext;
import logoparsing.grammar.LogoParser.ReContext;
import logoparsing.grammar.LogoParser.SetContext;
import logoparsing.grammar.LogoParser.SubContext;
import logoparsing.grammar.LogoParser.TdContext;
import logoparsing.grammar.LogoParser.TgContext;
import logoparsing.grammar.LogoParser.VeContext;

import org.antlr.v4.runtime.misc.NotNull;
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
	public Integer getAttValue(ParseTree node) { return atts.get(node); }
	@Override
	public Integer visitAv(AvContext ctx) {
		visitChildren(ctx);
		String intText = ctx.getText(); 
		traceur.avance(getAttValue(ctx.expr()));
		return 0;
	}

	@Override
	public Integer visitRe(ReContext ctx) {
		visitChildren(ctx);
		String intText = ctx.getText(); 
		traceur.recule(getAttValue(ctx.expr()));
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
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		System.out.println(ctx);
		int res = a * b;
		setAttValue(ctx, res);
		return res;
	}

	@Override
	public Integer visitDiv(DivContext ctx) {
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		int res = a / b;
		setAttValue(ctx, res);
		return res;
	}
	@Override
	public Integer visitAdd(AddContext ctx) {
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		int res = a + b;
		setAttValue(ctx, res);
		return res;
	}
	@Override
	public Integer visitSub(SubContext ctx) {
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		int res = a - b;
		setAttValue(ctx, res);
		return res;
	}

	@Override
	public Integer visitInt(IntContext ctx) {
		visitChildren(ctx);
		int res = Integer.parseInt(ctx.getText());
		setAttValue(ctx, res);
		return res;
	}

	@Override
	public Integer visitPar(ParContext ctx) {
		visitChildren(ctx);
		int res = getAttValue(ctx.expr());
		setAttValue(ctx, res);
		return res;
	}
	
	@Override
	public Integer visitLc(LcContext ctx) {
		visitChildren(ctx);		
		traceur.setDrawing(false);
		return 0;
	}

	@Override
	public Integer visitBc(BcContext ctx) {
		visitChildren(ctx);		
		traceur.setDrawing(true);
		return 0;
	}
	
	@Override
	public Integer visitVe(VeContext ctx) {
		visitChildren(ctx);
		traceur.clear();
		traceur.setPos(300, 300);
		return 0;
	}

	@Override
	public Integer visitFpos(FposContext ctx) {
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		traceur.setPos(a, b);
		return 0;
	}	
	
	@Override
	public Integer visitEqual(@NotNull LogoParser.EqualContext ctx) {
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		int val = (a == b) ? 1 : 0;
		setAttValue(ctx, val);		
		return val;
	}
	
	@Override
	public Integer visitNequal(@NotNull LogoParser.NequalContext ctx) {
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		int val = (a != b) ? 1 : 0;
		setAttValue(ctx, val);		
		return val;
	}
	
	@Override
	public Integer visitInf(@NotNull LogoParser.InfContext ctx) {
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		int val = (a < b) ? 1 : 0;
		setAttValue(ctx, val);		
		return val;
	}

	@Override
	public Integer visitSup(@NotNull LogoParser.SupContext ctx) {
		visitChildren(ctx);
		int a = getValueFromTree(ctx.expr(0));
		int b = getValueFromTree(ctx.expr(1));
		int val = (a > b) ? 1 : 0;
		setAttValue(ctx, val);		
		return val;
	}
	
	
	@Override
	public Integer visitFcc(FccContext ctx) {
		visitChildren(ctx);
		int n = getValueFromTree(ctx.expr());		
		traceur.setColor(n);
		return 0;
	}
	
	@Override
	public Integer visitSet(SetContext ctx)
	{
		visitChildren(ctx);
		String var = ctx.ID().getText();
		int value = getValueFromTree(ctx.expr());
		m_vars.put(var, value);
		return 0;
	}
	
	private Map<String, Integer> m_vars;
	private int getValueFromTree(ExprContext ctx) {
		return getAttValue(ctx);
	}
}
