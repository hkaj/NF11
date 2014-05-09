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
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, INT=27, WS=28, DECLARATION_ID=29, ID=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'['", "'fpos'", "'*'", "'-'", "'while'", "'tg'", "'('", "'if'", 
		"'<'", "'!='", "'set'", "'ve'", "'fcc'", "'re'", "'loop'", "')'", "'+'", 
		"'bc'", "'lc'", "'av'", "'repeat'", "'>'", "'/'", "'=='", "'td'", "INT", 
		"WS", "DECLARATION_ID", "ID"
	};
	public static final String[] ruleNames = {
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "INT", "WS", "DECLARATION_ID", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\7\34\u0094\n\34\f\34\16\34\u0097\13\34\5\34"+
		"\u0099\n\34\3\35\6\35\u009c\n\35\r\35\16\35\u009d\3\35\3\35\3\36\3\36"+
		"\3\36\7\36\u00a5\n\36\f\36\16\36\u00a8\13\36\3\37\3\37\3\37\7\37\u00ad"+
		"\n\37\f\37\16\37\u00b0\13\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= \3\2\7\3\2\63;\3\2\62;\5\2\13\f\17\17"+
		"\"\"\4\2C\\c|\5\2\62;C\\c|\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2"+
		"\7C\3\2\2\2\tH\3\2\2\2\13J\3\2\2\2\rL\3\2\2\2\17R\3\2\2\2\21U\3\2\2\2"+
		"\23W\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31_\3\2\2\2\33c\3\2\2\2\35f\3\2"+
		"\2\2\37j\3\2\2\2!m\3\2\2\2#r\3\2\2\2%t\3\2\2\2\'v\3\2\2\2)y\3\2\2\2+|"+
		"\3\2\2\2-\177\3\2\2\2/\u0086\3\2\2\2\61\u0088\3\2\2\2\63\u008a\3\2\2\2"+
		"\65\u008d\3\2\2\2\67\u0098\3\2\2\29\u009b\3\2\2\2;\u00a1\3\2\2\2=\u00a9"+
		"\3\2\2\2?@\7_\2\2@\4\3\2\2\2AB\7]\2\2B\6\3\2\2\2CD\7h\2\2DE\7r\2\2EF\7"+
		"q\2\2FG\7u\2\2G\b\3\2\2\2HI\7,\2\2I\n\3\2\2\2JK\7/\2\2K\f\3\2\2\2LM\7"+
		"y\2\2MN\7j\2\2NO\7k\2\2OP\7n\2\2PQ\7g\2\2Q\16\3\2\2\2RS\7v\2\2ST\7i\2"+
		"\2T\20\3\2\2\2UV\7*\2\2V\22\3\2\2\2WX\7k\2\2XY\7h\2\2Y\24\3\2\2\2Z[\7"+
		">\2\2[\26\3\2\2\2\\]\7#\2\2]^\7?\2\2^\30\3\2\2\2_`\7u\2\2`a\7g\2\2ab\7"+
		"v\2\2b\32\3\2\2\2cd\7x\2\2de\7g\2\2e\34\3\2\2\2fg\7h\2\2gh\7e\2\2hi\7"+
		"e\2\2i\36\3\2\2\2jk\7t\2\2kl\7g\2\2l \3\2\2\2mn\7n\2\2no\7q\2\2op\7q\2"+
		"\2pq\7r\2\2q\"\3\2\2\2rs\7+\2\2s$\3\2\2\2tu\7-\2\2u&\3\2\2\2vw\7d\2\2"+
		"wx\7e\2\2x(\3\2\2\2yz\7n\2\2z{\7e\2\2{*\3\2\2\2|}\7c\2\2}~\7x\2\2~,\3"+
		"\2\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7r\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085.\3\2\2\2\u0086\u0087"+
		"\7@\2\2\u0087\60\3\2\2\2\u0088\u0089\7\61\2\2\u0089\62\3\2\2\2\u008a\u008b"+
		"\7?\2\2\u008b\u008c\7?\2\2\u008c\64\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f"+
		"\7f\2\2\u008f\66\3\2\2\2\u0090\u0099\7\62\2\2\u0091\u0095\t\2\2\2\u0092"+
		"\u0094\t\3\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u00998\3\2\2\2\u009a\u009c\t\4\2\2"+
		"\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\35\2\2\u00a0:\3\2\2\2\u00a1"+
		"\u00a2\7$\2\2\u00a2\u00a6\t\5\2\2\u00a3\u00a5\t\6\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"<\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7<\2\2\u00aa\u00ae\t\5\2\2\u00ab"+
		"\u00ad\t\6\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af>\3\2\2\2\u00b0\u00ae\3\2\2\2\b\2\u0095"+
		"\u0098\u009d\u00a6\u00ae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}