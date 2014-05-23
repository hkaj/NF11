package logoparsing.grammar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import logoparsing.grammar.LogoParser.ExprContext;
import logoparsing.grammar.LogoParser.FunctionDeclarationContext;

public class Context {
	private Context mUpperContext;
	
	private Map<String,Function> mFunctions = new HashMap<String, Function>();
	private Symbols mSymbols = new Symbols();
	public int mLoop;
	public int returnValue;
	
	public Context() {
		
	}
	
	public Context(Context upperContext) {
		this.mUpperContext = upperContext;
	}
	
	public Function getFunction(String name) {
		if (mFunctions.containsKey(name)) {
			return mFunctions.get(name);
		}
		else if (mUpperContext != null) {
			return mUpperContext.getFunction(name);
		}
		else {
			throw new RuntimeException("Function " + name + " does not exist");
		}
	}
	
	public Integer getSymbolValue(String name) {
		if (mSymbols.contains(name)) {
			return mSymbols.get(name);
		}
		else if (mUpperContext != null) {
			return mUpperContext.getSymbolValue(name);
		}
		else {
			throw new RuntimeException("Variable " + name + " does not exist");
		}
	}
	
	public void setSymbolValue(String name, Integer value) {
		if (mSymbols.isAParameter(name)) {
			throw new RuntimeException("Variable " + name + " is a parameter and can't be used as a variable");
		}
		mSymbols.set(name,  value);
	}
	
	public void addFunction(FunctionDeclarationContext ctx) {
		mFunctions.put(ctx.FUNCTION_ID().getText().replace("\"", ""),
				       new Function(ctx));
	}
	
	public void addArguments(Function f, List<Integer> values) {
		for (int i = 0; i < values.size(); i++) {
			mSymbols.setParameter(f.arguments.get(i), values.get(i));
		}
	}
	
	public Context getUpperContext() {
		return mUpperContext;
	}
}
