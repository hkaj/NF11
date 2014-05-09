package logoparsing.grammar;

import java.util.HashMap;
import java.util.Map;

import logogui.Traceur;
import logoparsing.grammar.LogoParser.AddContext;
import logoparsing.grammar.LogoParser.AvContext;
import logoparsing.grammar.LogoParser.BcContext;
import logoparsing.grammar.LogoParser.DivContext;
import logoparsing.grammar.LogoParser.ExprContext;
import logoparsing.grammar.LogoParser.FccContext;
import logoparsing.grammar.LogoParser.FposContext;
import logoparsing.grammar.LogoParser.IdContext;
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

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	Traceur mTraceur;
	ParseTreeProperty<Integer> mAtts = new ParseTreeProperty<Integer>();
	private Map<String, Integer> mVars = new HashMap<String, Integer>();
	private int mLoop;
	
	public LogoTreeVisitor() {
		super();
	}
	public void initialize(java.awt.Graphics g) {
	      mTraceur = new Traceur();
	      mTraceur.setGraphics(g);
    }
	public void setAttValue(ParseTree node, int value) { 
		mAtts.put(node, value);
	}

	public Integer getAttValue(ParseTree node) { return mAtts.get(node); }	

	private int getValueFromTree(ExprContext ctx) {
		return getAttValue(ctx);
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
	public Integer visitPar(ParContext ctx) {
		visitChildren(ctx);
		int res = getAttValue(ctx.expr());
		setAttValue(ctx, res);
		return res;
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
		mTraceur.setColor(n);
		return 0;
	}
	
	@Override
	public Integer visitSet(SetContext ctx)
	{
		visitChildren(ctx);
		String var = ctx.DECLARATION_ID().getText().replace("\"", "");
		int value = getValueFromTree(ctx.expr());
		mVars.put(var, value);
		return 0;
	}

	@Override
	public Integer visitInt(IntContext ctx) {
		visitChildren(ctx);
		int res = Integer.parseInt(ctx.getText());
		setAttValue(ctx, res);
		return res;
	}

	@Override
	public Integer visitId(IdContext ctx) {
		visitChildren(ctx);
		String symbol = ctx.getText().replace(":", "");
		if (! mVars.containsKey(symbol)) {
			throw new RuntimeException("Undefined variable " + ctx.getText());
		}
		int res = mVars.get(symbol);
		setAttValue(ctx, res);
		return res;
	}
	
	@Override
	public Integer visitLoop(LoopContext ctx) {
		setAttValue(ctx, mLoop);
		return mLoop;
	}
	
	@Override
	public Integer visitIf(IfContext ctx) {
		visit(ctx.expr());
		int res = getAttValue(ctx.expr());
		if (res == 1) {
			visit(ctx.liste_instructions(0));
		}
		else {
			if (ctx.liste_instructions().size() == 2) {
				visit(ctx.liste_instructions(1));
			}
		}
		return 0;
	}
	
	@Override
	public Integer visitRepeat(RepeatContext ctx) {
		visit(ctx.expr());
		int n = getAttValue(ctx.expr());
	
		for (int i = 0; i < n; i++) {
			mLoop = i;
			visit(ctx.liste_instructions());
		}
		
		return n;
	}
	

}


