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
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, INT=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'+'", "'-'", "'*'", "'fpos'", "'('", "'tg'", "'bc'", "'<'", "'lc'", 
		"'!='", "'av'", "'>'", "'fcc'", "'ve'", "'=='", "'/'", "'re'", "'td'", 
		"INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\7\25e\n\25\f\25\16\25h\13\25\5\25j\n\25\3\26\6\26m\n\26\r\26"+
		"\16\26n\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\5\3\2\63;\3"+
		"\2\62;\5\2\13\f\17\17\"\"t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r:"+
		"\3\2\2\2\17<\3\2\2\2\21?\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27G\3\2\2\2\31"+
		"J\3\2\2\2\33M\3\2\2\2\35O\3\2\2\2\37S\3\2\2\2!V\3\2\2\2#Y\3\2\2\2%[\3"+
		"\2\2\2\'^\3\2\2\2)i\3\2\2\2+l\3\2\2\2-.\7+\2\2.\4\3\2\2\2/\60\7-\2\2\60"+
		"\6\3\2\2\2\61\62\7/\2\2\62\b\3\2\2\2\63\64\7,\2\2\64\n\3\2\2\2\65\66\7"+
		"h\2\2\66\67\7r\2\2\678\7q\2\289\7u\2\29\f\3\2\2\2:;\7*\2\2;\16\3\2\2\2"+
		"<=\7v\2\2=>\7i\2\2>\20\3\2\2\2?@\7d\2\2@A\7e\2\2A\22\3\2\2\2BC\7>\2\2"+
		"C\24\3\2\2\2DE\7n\2\2EF\7e\2\2F\26\3\2\2\2GH\7#\2\2HI\7?\2\2I\30\3\2\2"+
		"\2JK\7c\2\2KL\7x\2\2L\32\3\2\2\2MN\7@\2\2N\34\3\2\2\2OP\7h\2\2PQ\7e\2"+
		"\2QR\7e\2\2R\36\3\2\2\2ST\7x\2\2TU\7g\2\2U \3\2\2\2VW\7?\2\2WX\7?\2\2"+
		"X\"\3\2\2\2YZ\7\61\2\2Z$\3\2\2\2[\\\7t\2\2\\]\7g\2\2]&\3\2\2\2^_\7v\2"+
		"\2_`\7f\2\2`(\3\2\2\2aj\7\62\2\2bf\t\2\2\2ce\t\3\2\2dc\3\2\2\2eh\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ia\3\2\2\2ib\3\2\2\2j*\3\2\2"+
		"\2km\t\4\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\26"+
		"\2\2q,\3\2\2\2\6\2fin\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}