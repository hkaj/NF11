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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, INT=21, WS=22, DECLARATION_ID=23, 
		ID=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'+'", "'-'", "'*'", "'fpos'", "'('", "'tg'", "'bc'", "'<'", "'lc'", 
		"'!='", "'av'", "'set'", "'>'", "'fcc'", "'ve'", "'=='", "'/'", "'re'", 
		"'td'", "INT", "WS", "DECLARATION_ID", "ID"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "INT", "WS", "DECLARATION_ID", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\7\26o"+
		"\n\26\f\26\16\26r\13\26\5\26t\n\26\3\27\6\27w\n\27\r\27\16\27x\3\27\3"+
		"\27\3\30\3\30\3\30\7\30\u0080\n\30\f\30\16\30\u0083\13\30\3\31\3\31\3"+
		"\31\7\31\u0088\n\31\f\31\16\31\u008b\13\31\2\2\32\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\3\2\7\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\"+
		"c|\5\2\62;C\\c|\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3"+
		"\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21E\3\2\2\2\23H\3"+
		"\2\2\2\25J\3\2\2\2\27M\3\2\2\2\31P\3\2\2\2\33S\3\2\2\2\35W\3\2\2\2\37"+
		"Y\3\2\2\2!]\3\2\2\2#`\3\2\2\2%c\3\2\2\2\'e\3\2\2\2)h\3\2\2\2+s\3\2\2\2"+
		"-v\3\2\2\2/|\3\2\2\2\61\u0084\3\2\2\2\63\64\7+\2\2\64\4\3\2\2\2\65\66"+
		"\7-\2\2\66\6\3\2\2\2\678\7/\2\28\b\3\2\2\29:\7,\2\2:\n\3\2\2\2;<\7h\2"+
		"\2<=\7r\2\2=>\7q\2\2>?\7u\2\2?\f\3\2\2\2@A\7*\2\2A\16\3\2\2\2BC\7v\2\2"+
		"CD\7i\2\2D\20\3\2\2\2EF\7d\2\2FG\7e\2\2G\22\3\2\2\2HI\7>\2\2I\24\3\2\2"+
		"\2JK\7n\2\2KL\7e\2\2L\26\3\2\2\2MN\7#\2\2NO\7?\2\2O\30\3\2\2\2PQ\7c\2"+
		"\2QR\7x\2\2R\32\3\2\2\2ST\7u\2\2TU\7g\2\2UV\7v\2\2V\34\3\2\2\2WX\7@\2"+
		"\2X\36\3\2\2\2YZ\7h\2\2Z[\7e\2\2[\\\7e\2\2\\ \3\2\2\2]^\7x\2\2^_\7g\2"+
		"\2_\"\3\2\2\2`a\7?\2\2ab\7?\2\2b$\3\2\2\2cd\7\61\2\2d&\3\2\2\2ef\7t\2"+
		"\2fg\7g\2\2g(\3\2\2\2hi\7v\2\2ij\7f\2\2j*\3\2\2\2kt\7\62\2\2lp\t\2\2\2"+
		"mo\t\3\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"sk\3\2\2\2sl\3\2\2\2t,\3\2\2\2uw\t\4\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2yz\3\2\2\2z{\b\27\2\2{.\3\2\2\2|}\7$\2\2}\u0081\t\5\2\2~\u0080"+
		"\t\6\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\60\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7<\2\2\u0085"+
		"\u0089\t\5\2\2\u0086\u0088\t\6\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\62\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\b\2psx\u0081\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}