// Generated from d:\ProgrammingStuff\Github\Procesadores\PL2Proc\antlr\gramaticas\gramaticapei.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticapeiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INCLUDE=15, FUNCTION=16, 
		TIPONUMERO=17, TIPOCADENA=18, TIPOVOID=19, ID=20, BEGIN=21, END=22, WHILE=23, 
		DEVOLVER=24, LETRA=25, DIGITO=26, INT=27, FLOAT=28, PI=29, PD=30, COMENTARIO_LINEA=31, 
		COMENTARIO_LINEA2=32, COMENTARIO_BLOQUE1=33, COMENTARIO_BLOQUE2=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "INCLUDE", "FUNCTION", "TIPONUMERO", 
		"TIPOCADENA", "TIPOVOID", "ID", "BEGIN", "END", "WHILE", "DEVOLVER", "LETRA", 
		"ESC", "NEWLINE", "DIGITO", "INT", "FLOAT", "PI", "PD", "COMENTARIO_LINEA", 
		"COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", "COMENTARIO_BLOQUE2", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "'\"'", "','", "':'", "'*'", "'/'", "'+'", "'-'", "'>'", 
		"'<'", "'<='", "'>='", "'=='", "'!='", "'include'", "'function'", "'numero'", 
		"'cadena'", "'void'", null, "'begin'", "'end'", "'while'", "'devolver'", 
		null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INCLUDE", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", 
		"ID", "BEGIN", "END", "WHILE", "DEVOLVER", "LETRA", "DIGITO", "INT", "FLOAT", 
		"PI", "PD", "COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", 
		"COMENTARIO_BLOQUE2", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public gramaticapeiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramaticapei.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0126\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\6\25\u0094\n\25\r\25\16\25\u0095\3\25\7\25\u0099\n\25\f\25"+
		"\16\25\u009c\13\25\7\25\u009e\n\25\f\25\16\25\u00a1\13\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\36\7\36\u00c7\n\36\f\36\16\36\u00ca\13\36\3"+
		"\37\6\37\u00cd\n\37\r\37\16\37\u00ce\3\37\3\37\6\37\u00d3\n\37\r\37\16"+
		"\37\u00d4\3\37\3\37\6\37\u00d9\n\37\r\37\16\37\u00da\5\37\u00dd\n\37\3"+
		" \3 \3!\3!\3\"\3\"\3\"\3\"\7\"\u00e7\n\"\f\"\16\"\u00ea\13\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\7#\u00f4\n#\f#\16#\u00f7\13#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\7$\u0104\n$\f$\16$\u0107\13$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\7%\u0115\n%\f%\16%\u0118\13%\3%\3%\3%\3%\3%\3%\3&\6&\u0121\n&\r"+
		"&\16&\u0122\3&\3&\6\u00e8\u00f5\u0105\u0116\2\'\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\2\67\29\34;\35=\36?\37A C!E\"G#I$K%\3"+
		"\2\7\4\2C\\c|\b\2$$^^ddppttvv\6\2$$^^pptt\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u0130\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\3M\3\2\2\2\5P\3\2\2\2\7R\3\2\2\2\tT\3\2\2\2\13V\3\2\2\2\rX\3\2"+
		"\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27b\3\2\2\2\31e"+
		"\3\2\2\2\33h\3\2\2\2\35k\3\2\2\2\37n\3\2\2\2!v\3\2\2\2#\177\3\2\2\2%\u0086"+
		"\3\2\2\2\'\u008d\3\2\2\2)\u009f\3\2\2\2+\u00a2\3\2\2\2-\u00a8\3\2\2\2"+
		"/\u00ac\3\2\2\2\61\u00b2\3\2\2\2\63\u00bb\3\2\2\2\65\u00bd\3\2\2\2\67"+
		"\u00c0\3\2\2\29\u00c3\3\2\2\2;\u00c8\3\2\2\2=\u00dc\3\2\2\2?\u00de\3\2"+
		"\2\2A\u00e0\3\2\2\2C\u00e2\3\2\2\2E\u00ef\3\2\2\2G\u00fd\3\2\2\2I\u010f"+
		"\3\2\2\2K\u0120\3\2\2\2MN\7<\2\2NO\7?\2\2O\4\3\2\2\2PQ\7$\2\2Q\6\3\2\2"+
		"\2RS\7.\2\2S\b\3\2\2\2TU\7<\2\2U\n\3\2\2\2VW\7,\2\2W\f\3\2\2\2XY\7\61"+
		"\2\2Y\16\3\2\2\2Z[\7-\2\2[\20\3\2\2\2\\]\7/\2\2]\22\3\2\2\2^_\7@\2\2_"+
		"\24\3\2\2\2`a\7>\2\2a\26\3\2\2\2bc\7>\2\2cd\7?\2\2d\30\3\2\2\2ef\7@\2"+
		"\2fg\7?\2\2g\32\3\2\2\2hi\7?\2\2ij\7?\2\2j\34\3\2\2\2kl\7#\2\2lm\7?\2"+
		"\2m\36\3\2\2\2no\7k\2\2op\7p\2\2pq\7e\2\2qr\7n\2\2rs\7w\2\2st\7f\2\2t"+
		"u\7g\2\2u \3\2\2\2vw\7h\2\2wx\7w\2\2xy\7p\2\2yz\7e\2\2z{\7v\2\2{|\7k\2"+
		"\2|}\7q\2\2}~\7p\2\2~\"\3\2\2\2\177\u0080\7p\2\2\u0080\u0081\7w\2\2\u0081"+
		"\u0082\7o\2\2\u0082\u0083\7g\2\2\u0083\u0084\7t\2\2\u0084\u0085\7q\2\2"+
		"\u0085$\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088\7c\2\2\u0088\u0089\7f\2"+
		"\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7c\2\2\u008c&\3\2"+
		"\2\2\u008d\u008e\7x\2\2\u008e\u008f\7q\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7f\2\2\u0091(\3\2\2\2\u0092\u0094\5\63\32\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009a\3\2"+
		"\2\2\u0097\u0099\59\35\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u0093\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0*\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7d\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2"+
		"\u00a7,\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7f\2"+
		"\2\u00ab.\3\2\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae\7j\2\2\u00ae\u00af\7"+
		"k\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1\60\3\2\2\2\u00b2\u00b3"+
		"\7f\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7x\2\2\u00b5\u00b6\7q\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7x\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7t\2\2"+
		"\u00ba\62\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7^"+
		"\2\2\u00be\u00bf\t\3\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7^\2\2\u00c1\u00c2"+
		"\t\4\2\2\u00c28\3\2\2\2\u00c3\u00c4\t\5\2\2\u00c4:\3\2\2\2\u00c5\u00c7"+
		"\59\35\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9<\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\59\35\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7\60\2\2\u00d1\u00d3\59\35\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00dd\3\2\2\2\u00d6\u00d8\7\60\2\2\u00d7\u00d9\59\35\2"+
		"\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00cc\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dd"+
		">\3\2\2\2\u00de\u00df\7*\2\2\u00df@\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1B"+
		"\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\7\61\2\2\u00e4\u00e8\3\2\2\2"+
		"\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7\f\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\"\2\2\u00eeD\3\2\2\2"+
		"\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4"+
		"\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9"+
		"\7,\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b#\2\2\u00fc"+
		"F\3\2\2\2\u00fd\u00fe\7\61\2\2\u00fe\u00ff\7,\2\2\u00ff\u0100\7,\2\2\u0100"+
		"\u0101\7,\2\2\u0101\u0105\3\2\2\2\u0102\u0104\13\2\2\2\u0103\u0102\3\2"+
		"\2\2\u0104\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7,\2\2\u0109\u010a\7,\2"+
		"\2\u010a\u010b\7,\2\2\u010b\u010c\7\61\2\2\u010c\u010d\3\2\2\2\u010d\u010e"+
		"\b$\2\2\u010eH\3\2\2\2\u010f\u0110\7\61\2\2\u0110\u0111\7,\2\2\u0111\u0112"+
		"\7,\2\2\u0112\u0116\3\2\2\2\u0113\u0115\13\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7,\2\2\u011a\u011b\7,\2\2\u011b\u011c"+
		"\7\61\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b%\2\2\u011eJ\3\2\2\2\u011f"+
		"\u0121\t\6\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b&\2\2\u0125"+
		"L\3\2\2\2\20\2\u0095\u009a\u009f\u00c8\u00ce\u00d4\u00da\u00dc\u00e8\u00f5"+
		"\u0105\u0116\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}