package logoparsing.grammar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Symbols {
	private Map<String, Integer> mSymbolsMap = new HashMap<String, Integer>();
	private Set<String> mParameters = new HashSet<String>();
	
	public Integer get(String sym) {
		return mSymbolsMap.get(sym);
	}
	
	public boolean contains(String sym) {
		return mSymbolsMap.containsKey(sym);
	}
	
	public boolean isAParameter(String sym) {
		return mParameters.contains(sym);
	}
	
	public void set(String sym, Integer value) {
		mSymbolsMap.put(sym, value);
	}

	public void setParameter(String sym, Integer value) {
		mSymbolsMap.put(sym, value);
		mParameters.add(sym);
	}

}
