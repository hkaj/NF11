// Generated from grammar/Logo.g4 by ANTLR 4.2

  package logoparsing;

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
		T__1=1, T__0=2, INT=3, WS=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'av'", "'td'", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "INT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6\"\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4\25\n\4"+
		"\f\4\16\4\30\13\4\5\4\32\n\4\3\5\6\5\35\n\5\r\5\16\5\36\3\5\3\5\2\2\6"+
		"\3\3\5\4\7\5\t\6\3\2\5\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"$\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5\16\3\2\2\2\7\31\3"+
		"\2\2\2\t\34\3\2\2\2\13\f\7c\2\2\f\r\7x\2\2\r\4\3\2\2\2\16\17\7v\2\2\17"+
		"\20\7f\2\2\20\6\3\2\2\2\21\32\7\62\2\2\22\26\t\2\2\2\23\25\t\3\2\2\24"+
		"\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\32\3\2\2\2\30"+
		"\26\3\2\2\2\31\21\3\2\2\2\31\22\3\2\2\2\32\b\3\2\2\2\33\35\t\4\2\2\34"+
		"\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\b"+
		"\5\2\2!\n\3\2\2\2\6\2\26\31\36\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}