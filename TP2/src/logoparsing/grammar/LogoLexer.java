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
		T__3=17, T__2=18, T__1=19, T__0=20, INT=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'+'", "'-'", "'*'", "'fpos'", "'('", "'tg'", "'bc'", "'<'", "'lc'", 
		"'!='", "'av'", "'set'", "'>'", "'fcc'", "'ve'", "'=='", "'/'", "'re'", 
		"'td'", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\7\26k\n\26\f\26\16\26n\13\26\5\26"+
		"p\n\26\3\27\6\27s\n\27\r\27\16\27t\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30\3\2\5\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"z\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2"+
		"\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21A"+
		"\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27I\3\2\2\2\31L\3\2\2\2\33O\3\2\2\2\35"+
		"S\3\2\2\2\37U\3\2\2\2!Y\3\2\2\2#\\\3\2\2\2%_\3\2\2\2\'a\3\2\2\2)d\3\2"+
		"\2\2+o\3\2\2\2-r\3\2\2\2/\60\7+\2\2\60\4\3\2\2\2\61\62\7-\2\2\62\6\3\2"+
		"\2\2\63\64\7/\2\2\64\b\3\2\2\2\65\66\7,\2\2\66\n\3\2\2\2\678\7h\2\289"+
		"\7r\2\29:\7q\2\2:;\7u\2\2;\f\3\2\2\2<=\7*\2\2=\16\3\2\2\2>?\7v\2\2?@\7"+
		"i\2\2@\20\3\2\2\2AB\7d\2\2BC\7e\2\2C\22\3\2\2\2DE\7>\2\2E\24\3\2\2\2F"+
		"G\7n\2\2GH\7e\2\2H\26\3\2\2\2IJ\7#\2\2JK\7?\2\2K\30\3\2\2\2LM\7c\2\2M"+
		"N\7x\2\2N\32\3\2\2\2OP\7u\2\2PQ\7g\2\2QR\7v\2\2R\34\3\2\2\2ST\7@\2\2T"+
		"\36\3\2\2\2UV\7h\2\2VW\7e\2\2WX\7e\2\2X \3\2\2\2YZ\7x\2\2Z[\7g\2\2[\""+
		"\3\2\2\2\\]\7?\2\2]^\7?\2\2^$\3\2\2\2_`\7\61\2\2`&\3\2\2\2ab\7t\2\2bc"+
		"\7g\2\2c(\3\2\2\2de\7v\2\2ef\7f\2\2f*\3\2\2\2gp\7\62\2\2hl\t\2\2\2ik\t"+
		"\3\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2og\3"+
		"\2\2\2oh\3\2\2\2p,\3\2\2\2qs\t\4\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2uv\3\2\2\2vw\b\27\2\2w.\3\2\2\2\6\2lot\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}