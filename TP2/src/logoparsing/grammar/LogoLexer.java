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
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, INT=29, WS=30, FUNCTION_ID=31, DECLARATION_ID=32, 
		ID=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'fpos'", "'['", "'*'", "'-'", "'while'", "'tg'", "'('", "'if'", 
		"'<'", "'!='", "'set'", "'ve'", "'fcc'", "'re'", "'loop'", "'function'", 
		"')'", "'+'", "'bc'", "'lc'", "'return'", "'av'", "'repeat'", "'>'", "'=='", 
		"'/'", "'td'", "INT", "WS", "FUNCTION_ID", "DECLARATION_ID", "ID"
	};
	public static final String[] ruleNames = {
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "INT", "WS", "FUNCTION_ID", "DECLARATION_ID", 
		"ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u00aa"+
		"\n\36\f\36\16\36\u00ad\13\36\5\36\u00af\n\36\3\37\6\37\u00b2\n\37\r\37"+
		"\16\37\u00b3\3\37\3\37\3 \3 \7 \u00ba\n \f \16 \u00bd\13 \3!\3!\3!\7!"+
		"\u00c2\n!\f!\16!\u00c5\13!\3\"\3\"\3\"\7\"\u00ca\n\"\f\"\16\"\u00cd\13"+
		"\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#\3\2\7\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|\5"+
		"\2\62;C\\c|\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E"+
		"\3\2\2\2\5G\3\2\2\2\7L\3\2\2\2\tN\3\2\2\2\13P\3\2\2\2\rR\3\2\2\2\17X\3"+
		"\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25`\3\2\2\2\27b\3\2\2\2\31e\3\2\2\2\33"+
		"i\3\2\2\2\35l\3\2\2\2\37p\3\2\2\2!s\3\2\2\2#x\3\2\2\2%\u0081\3\2\2\2\'"+
		"\u0083\3\2\2\2)\u0085\3\2\2\2+\u0088\3\2\2\2-\u008b\3\2\2\2/\u0092\3\2"+
		"\2\2\61\u0095\3\2\2\2\63\u009c\3\2\2\2\65\u009e\3\2\2\2\67\u00a1\3\2\2"+
		"\29\u00a3\3\2\2\2;\u00ae\3\2\2\2=\u00b1\3\2\2\2?\u00b7\3\2\2\2A\u00be"+
		"\3\2\2\2C\u00c6\3\2\2\2EF\7_\2\2F\4\3\2\2\2GH\7h\2\2HI\7r\2\2IJ\7q\2\2"+
		"JK\7u\2\2K\6\3\2\2\2LM\7]\2\2M\b\3\2\2\2NO\7,\2\2O\n\3\2\2\2PQ\7/\2\2"+
		"Q\f\3\2\2\2RS\7y\2\2ST\7j\2\2TU\7k\2\2UV\7n\2\2VW\7g\2\2W\16\3\2\2\2X"+
		"Y\7v\2\2YZ\7i\2\2Z\20\3\2\2\2[\\\7*\2\2\\\22\3\2\2\2]^\7k\2\2^_\7h\2\2"+
		"_\24\3\2\2\2`a\7>\2\2a\26\3\2\2\2bc\7#\2\2cd\7?\2\2d\30\3\2\2\2ef\7u\2"+
		"\2fg\7g\2\2gh\7v\2\2h\32\3\2\2\2ij\7x\2\2jk\7g\2\2k\34\3\2\2\2lm\7h\2"+
		"\2mn\7e\2\2no\7e\2\2o\36\3\2\2\2pq\7t\2\2qr\7g\2\2r \3\2\2\2st\7n\2\2"+
		"tu\7q\2\2uv\7q\2\2vw\7r\2\2w\"\3\2\2\2xy\7h\2\2yz\7w\2\2z{\7p\2\2{|\7"+
		"e\2\2|}\7v\2\2}~\7k\2\2~\177\7q\2\2\177\u0080\7p\2\2\u0080$\3\2\2\2\u0081"+
		"\u0082\7+\2\2\u0082&\3\2\2\2\u0083\u0084\7-\2\2\u0084(\3\2\2\2\u0085\u0086"+
		"\7d\2\2\u0086\u0087\7e\2\2\u0087*\3\2\2\2\u0088\u0089\7n\2\2\u0089\u008a"+
		"\7e\2\2\u008a,\3\2\2\2\u008b\u008c\7t\2\2\u008c\u008d\7g\2\2\u008d\u008e"+
		"\7v\2\2\u008e\u008f\7w\2\2\u008f\u0090\7t\2\2\u0090\u0091\7p\2\2\u0091"+
		".\3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094\7x\2\2\u0094\60\3\2\2\2\u0095"+
		"\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7r\2\2\u0098\u0099\7g\2\2"+
		"\u0099\u009a\7c\2\2\u009a\u009b\7v\2\2\u009b\62\3\2\2\2\u009c\u009d\7"+
		"@\2\2\u009d\64\3\2\2\2\u009e\u009f\7?\2\2\u009f\u00a0\7?\2\2\u00a0\66"+
		"\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a28\3\2\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\u00a5\7f\2\2\u00a5:\3\2\2\2\u00a6\u00af\7\62\2\2\u00a7\u00ab\t\2\2\2"+
		"\u00a8\u00aa\t\3\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00af<\3\2\2\2\u00b0\u00b2\t\4\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\37\2\2\u00b6>\3\2\2\2\u00b7"+
		"\u00bb\t\5\2\2\u00b8\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc@\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00bf\7$\2\2\u00bf\u00c3\t\5\2\2\u00c0\u00c2\t\6\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4B\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7<\2\2\u00c7\u00cb"+
		"\t\5\2\2\u00c8\u00ca\t\6\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00ccD\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\t\2\u00ab\u00ae\u00b3\u00bb\u00c3\u00cb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}