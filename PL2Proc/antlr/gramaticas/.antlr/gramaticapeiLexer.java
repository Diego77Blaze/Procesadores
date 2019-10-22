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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, INCLUDE=16, 
		FUNCTION=17, TIPONUMERO=18, TIPOCADENA=19, TIPOVOID=20, ID=21, BEGIN=22, 
		END=23, WHILE=24, DEVOLVER=25, LETRA=26, DIGITO=27, INT=28, FLOAT=29, 
		PI=30, PD=31, COMENTARIO_LINEA=32, COMENTARIO_LINEA2=33, COMENTARIO_BLOQUE1=34, 
		COMENTARIO_BLOQUE2=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "INCLUDE", "FUNCTION", 
		"TIPONUMERO", "TIPOCADENA", "TIPOVOID", "ID", "BEGIN", "END", "WHILE", 
		"DEVOLVER", "LETRA", "ESC", "NEWLINE", "DIGITO", "INT", "FLOAT", "PI", 
		"PD", "COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", "COMENTARIO_BLOQUE2", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "'.'", "'*'", "'\"'", "','", "':'", "'/'", "'+'", "'-'", 
		"'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'include'", "'function'", 
		"'numero'", "'cadena'", "'void'", null, "'begin'", "'end'", "'while'", 
		"'devolver'", null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "INCLUDE", "FUNCTION", "TIPONUMERO", "TIPOCADENA", 
		"TIPOVOID", "ID", "BEGIN", "END", "WHILE", "DEVOLVER", "LETRA", "DIGITO", 
		"INT", "FLOAT", "PI", "PD", "COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\6\26\u0098\n\26\r\26\16\26\u0099\3\26\7"+
		"\26\u009d\n\26\f\26\16\26\u00a0\13\26\6\26\u00a2\n\26\r\26\16\26\u00a3"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\7\37\u00ca\n\37\f\37\16\37\u00cd"+
		"\13\37\3 \6 \u00d0\n \r \16 \u00d1\3 \3 \6 \u00d6\n \r \16 \u00d7\3 \3"+
		" \6 \u00dc\n \r \16 \u00dd\5 \u00e0\n \3!\3!\3\"\3\"\3#\3#\3#\3#\7#\u00ea"+
		"\n#\f#\16#\u00ed\13#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u00f7\n$\f$\16$\u00fa"+
		"\13$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\7%\u0107\n%\f%\16%\u010a\13%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\7&\u0118\n&\f&\16&\u011b\13&\3&\3&\3"+
		"&\3&\3&\3&\3\'\6\'\u0124\n\'\r\'\16\'\u0125\3\'\3\'\6\u00eb\u00f8\u0108"+
		"\u0119\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\29\2;\35=\36?\37A C!E\"G#I$K%M&\3\2\7\4\2C\\c|\b\2$$^^ddppttvv\6\2$$"+
		"^^pptt\3\2\62;\5\2\13\f\17\17\"\"\2\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5R\3"+
		"\2\2\2\7T\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21^\3"+
		"\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33i\3\2\2\2\35"+
		"l\3\2\2\2\37o\3\2\2\2!r\3\2\2\2#z\3\2\2\2%\u0083\3\2\2\2\'\u008a\3\2\2"+
		"\2)\u0091\3\2\2\2+\u00a1\3\2\2\2-\u00a5\3\2\2\2/\u00ab\3\2\2\2\61\u00af"+
		"\3\2\2\2\63\u00b5\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c3\3\2"+
		"\2\2;\u00c6\3\2\2\2=\u00cb\3\2\2\2?\u00df\3\2\2\2A\u00e1\3\2\2\2C\u00e3"+
		"\3\2\2\2E\u00e5\3\2\2\2G\u00f2\3\2\2\2I\u0100\3\2\2\2K\u0112\3\2\2\2M"+
		"\u0123\3\2\2\2OP\7<\2\2PQ\7?\2\2Q\4\3\2\2\2RS\7\60\2\2S\6\3\2\2\2TU\7"+
		",\2\2U\b\3\2\2\2VW\7$\2\2W\n\3\2\2\2XY\7.\2\2Y\f\3\2\2\2Z[\7<\2\2[\16"+
		"\3\2\2\2\\]\7\61\2\2]\20\3\2\2\2^_\7-\2\2_\22\3\2\2\2`a\7/\2\2a\24\3\2"+
		"\2\2bc\7@\2\2c\26\3\2\2\2de\7>\2\2e\30\3\2\2\2fg\7>\2\2gh\7?\2\2h\32\3"+
		"\2\2\2ij\7@\2\2jk\7?\2\2k\34\3\2\2\2lm\7?\2\2mn\7?\2\2n\36\3\2\2\2op\7"+
		"#\2\2pq\7?\2\2q \3\2\2\2rs\7k\2\2st\7p\2\2tu\7e\2\2uv\7n\2\2vw\7w\2\2"+
		"wx\7f\2\2xy\7g\2\2y\"\3\2\2\2z{\7h\2\2{|\7w\2\2|}\7p\2\2}~\7e\2\2~\177"+
		"\7v\2\2\177\u0080\7k\2\2\u0080\u0081\7q\2\2\u0081\u0082\7p\2\2\u0082$"+
		"\3\2\2\2\u0083\u0084\7p\2\2\u0084\u0085\7w\2\2\u0085\u0086\7o\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7t\2\2\u0088\u0089\7q\2\2\u0089&\3\2\2\2\u008a"+
		"\u008b\7e\2\2\u008b\u008c\7c\2\2\u008c\u008d\7f\2\2\u008d\u008e\7g\2\2"+
		"\u008e\u008f\7p\2\2\u008f\u0090\7c\2\2\u0090(\3\2\2\2\u0091\u0092\7x\2"+
		"\2\u0092\u0093\7q\2\2\u0093\u0094\7k\2\2\u0094\u0095\7f\2\2\u0095*\3\2"+
		"\2\2\u0096\u0098\5\65\33\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e\3\2\2\2\u009b\u009d\5;"+
		"\36\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u0097\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		",\3\2\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7i\2\2\u00a8"+
		"\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad\u00ae\7f\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7y\2\2\u00b0"+
		"\u00b1\7j\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2"+
		"\u00b4\62\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7"+
		"x\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7x\2\2\u00bb\u00bc"+
		"\7g\2\2\u00bc\u00bd\7t\2\2\u00bd\64\3\2\2\2\u00be\u00bf\t\2\2\2\u00bf"+
		"\66\3\2\2\2\u00c0\u00c1\7^\2\2\u00c1\u00c2\t\3\2\2\u00c28\3\2\2\2\u00c3"+
		"\u00c4\7^\2\2\u00c4\u00c5\t\4\2\2\u00c5:\3\2\2\2\u00c6\u00c7\t\5\2\2\u00c7"+
		"<\3\2\2\2\u00c8\u00ca\5;\36\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc>\3\2\2\2\u00cd\u00cb\3"+
		"\2\2\2\u00ce\u00d0\5;\36\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\7\60"+
		"\2\2\u00d4\u00d6\5;\36\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e0\3\2\2\2\u00d9\u00db\7\60"+
		"\2\2\u00da\u00dc\5;\36\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00cf\3\2"+
		"\2\2\u00df\u00d9\3\2\2\2\u00e0@\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2B\3\2"+
		"\2\2\u00e3\u00e4\7+\2\2\u00e4D\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7"+
		"\7\61\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea\13\2\2\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00ed\3\2\2\2\u00eb\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\f\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\b#\2\2\u00f1F\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\7,\2\2\u00f4"+
		"\u00f8\3\2\2\2\u00f5\u00f7\13\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7,\2\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00ff\b$\2\2\u00ffH\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102"+
		"\7,\2\2\u0102\u0103\7,\2\2\u0103\u0104\7,\2\2\u0104\u0108\3\2\2\2\u0105"+
		"\u0107\13\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\7,\2\2\u010c\u010d\7,\2\2\u010d\u010e\7,\2\2\u010e\u010f\7\61\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u0111\b%\2\2\u0111J\3\2\2\2\u0112\u0113\7"+
		"\61\2\2\u0113\u0114\7,\2\2\u0114\u0115\7,\2\2\u0115\u0119\3\2\2\2\u0116"+
		"\u0118\13\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011d\7,\2\2\u011d\u011e\7,\2\2\u011e\u011f\7\61\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\b&\2\2\u0121L\3\2\2\2\u0122\u0124\t\6\2\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\b\'\2\2\u0128N\3\2\2\2\20\2\u0099\u009e\u00a3"+
		"\u00cb\u00d1\u00d7\u00dd\u00df\u00eb\u00f8\u0108\u0119\u0125\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}