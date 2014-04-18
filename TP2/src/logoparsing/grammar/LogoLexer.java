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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, INT=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "'fpos'", "'-'", "'*'", "'bc'", "'tg'", "'lc'", "'av'", "'fcc'", 
		"'ve'", "'/'", "'re'", "'td'", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "INT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21X\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\7\17K\n\17\f\17\16\17N\13\17\5\17P\n\17\3\20\6\20S\n\20"+
		"\r\20\16\20T\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\3\2\63;\3\2\62;\5\2\13\f\17\17"+
		"\"\"Z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5"+
		"#\3\2\2\2\7(\3\2\2\2\t*\3\2\2\2\13,\3\2\2\2\r/\3\2\2\2\17\62\3\2\2\2\21"+
		"\65\3\2\2\2\238\3\2\2\2\25<\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33D\3\2\2"+
		"\2\35O\3\2\2\2\37R\3\2\2\2!\"\7-\2\2\"\4\3\2\2\2#$\7h\2\2$%\7r\2\2%&\7"+
		"q\2\2&\'\7u\2\2\'\6\3\2\2\2()\7/\2\2)\b\3\2\2\2*+\7,\2\2+\n\3\2\2\2,-"+
		"\7d\2\2-.\7e\2\2.\f\3\2\2\2/\60\7v\2\2\60\61\7i\2\2\61\16\3\2\2\2\62\63"+
		"\7n\2\2\63\64\7e\2\2\64\20\3\2\2\2\65\66\7c\2\2\66\67\7x\2\2\67\22\3\2"+
		"\2\289\7h\2\29:\7e\2\2:;\7e\2\2;\24\3\2\2\2<=\7x\2\2=>\7g\2\2>\26\3\2"+
		"\2\2?@\7\61\2\2@\30\3\2\2\2AB\7t\2\2BC\7g\2\2C\32\3\2\2\2DE\7v\2\2EF\7"+
		"f\2\2F\34\3\2\2\2GP\7\62\2\2HL\t\2\2\2IK\t\3\2\2JI\3\2\2\2KN\3\2\2\2L"+
		"J\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OG\3\2\2\2OH\3\2\2\2P\36\3\2\2"+
		"\2QS\t\4\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\b\20"+
		"\2\2W \3\2\2\2\6\2LOT\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}