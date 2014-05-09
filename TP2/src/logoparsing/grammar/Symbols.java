package logoparsing.grammar;

import java.util.HashMap;
import java.util.Map;

public class Symbols {
	private Map<String, Integer> mSymbolsMap = new HashMap<String, Integer>();
	
	public Integer get(String sym) {
		return mSymbolsMap.get(sym);
	}
	
	public boolean contains(String sym) {
		return mSymbolsMap.containsKey(sym);
	}
	
	public void set(String sym, Integer value) {
		mSymbolsMap.put(sym, value);
	}
}
