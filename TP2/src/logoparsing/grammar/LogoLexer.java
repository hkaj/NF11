// Generated from grammar/Logo.g4 by ANTLR 4.2

  package logoparsing.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, INT=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'tg'", "'av'", "'td'", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "INT", "WS"
	};


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7\'\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\7\5\32\n\5\f\5\16\5\35\13\5\5\5\37\n\5\3\6\6\6\"\n\6\r\6\16\6"+
		"#\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\5\3\2\63;\3\2\62;\5\2\13\f\17"+
		"\17\"\")\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\3\r\3\2\2\2\5\20\3\2\2\2\7\23\3\2\2\2\t\36\3\2\2\2\13!\3\2\2\2\r\16\7"+
		"v\2\2\16\17\7i\2\2\17\4\3\2\2\2\20\21\7c\2\2\21\22\7x\2\2\22\6\3\2\2\2"+
		"\23\24\7v\2\2\24\25\7f\2\2\25\b\3\2\2\2\26\37\7\62\2\2\27\33\t\2\2\2\30"+
		"\32\t\3\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34"+
		"\37\3\2\2\2\35\33\3\2\2\2\36\26\3\2\2\2\36\27\3\2\2\2\37\n\3\2\2\2 \""+
		"\t\4\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\b\6\2\2"+
		"&\f\3\2\2\2\6\2\33\36#\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}