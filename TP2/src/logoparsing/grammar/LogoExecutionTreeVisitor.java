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
		mContext.setSymbolValue(var, value);

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
	public Integer visitLoop(LoopContext ctx) {
		setAttValue(ctx, mContext.mLoop);
		System.out.println(mContext.mLoop);
		return mContext.mLoop;
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
	
}


