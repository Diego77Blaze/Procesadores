// Generated from d:\ProgrammingStuff\Github\Procesadores\PL2Proc\antlr\gramaticas\GramaticaCompilerLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaCompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, FUNCTION=2, TIPONUMERO=3, TIPOCADENA=4, TIPOVOID=5, BEGIN=6, 
		END=7, DEVOLVER=8, WHILE=9, FOR=10, IF=11, ELSE=12, IFELSE=13, CONDICIONES=14, 
		PI=15, PD=16, PC=17, ADD=18, MINUS=19, PRODUCT=20, DIVISION=21, ASIGNACION=22, 
		PORCENTAJE=23, MENORQUE=24, MAYORQUE=25, IGUALQUE=26, DISTINTOQUE=27, 
		DOSPUNTOS=28, PUNTO=29, COMA=30, NEWLINE=31, CADENA=32, ID=33, DIGITO=34, 
		WS=35, COMENTARIO_LINEA=36, COMENTARIO_LINEA2=37, COMENTARIO_BLOQUE1=38, 
		COMENTARIO_BLOQUE2=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INCLUDE", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", "BEGIN", 
		"END", "DEVOLVER", "WHILE", "FOR", "IF", "ELSE", "IFELSE", "CONDICIONES", 
		"PI", "PD", "PC", "ADD", "MINUS", "PRODUCT", "DIVISION", "ASIGNACION", 
		"PORCENTAJE", "MENORQUE", "MAYORQUE", "IGUALQUE", "DISTINTOQUE", "DOSPUNTOS", 
		"PUNTO", "COMA", "NEWLINE", "CADENA", "ESC", "ID", "DIGITO", "WS", "COMENTARIO_LINEA", 
		"COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", "COMENTARIO_BLOQUE2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include'", "'function'", "'numero'", "'cadena'", "'void'", "'begin'", 
		"'end'", "'devolver'", "'while'", "'for'", "'if'", "'else'", null, null, 
		"'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", "':='", "'%'", "'<'", 
		"'>'", "'=='", "'!='", "':'", "'.'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INCLUDE", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", "BEGIN", 
		"END", "DEVOLVER", "WHILE", "FOR", "IF", "ELSE", "IFELSE", "CONDICIONES", 
		"PI", "PD", "PC", "ADD", "MINUS", "PRODUCT", "DIVISION", "ASIGNACION", 
		"PORCENTAJE", "MENORQUE", "MAYORQUE", "IGUALQUE", "DISTINTOQUE", "DOSPUNTOS", 
		"PUNTO", "COMA", "NEWLINE", "CADENA", "ID", "DIGITO", "WS", "COMENTARIO_LINEA", 
		"COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", "COMENTARIO_BLOQUE2"
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


	public GramaticaCompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticaCompilerLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u012f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \6 \u00ca\n \r \16 \u00cb\3!\3!\3!\7!\u00d1\n!\f"+
		"!\16!\u00d4\13!\3!\3!\3\"\3\"\3\"\3#\6#\u00dc\n#\r#\16#\u00dd\3$\6$\u00e1"+
		"\n$\r$\16$\u00e2\3%\6%\u00e6\n%\r%\16%\u00e7\3%\6%\u00eb\n%\r%\16%\u00ec"+
		"\5%\u00ef\n%\3%\3%\3&\3&\3&\3&\7&\u00f7\n&\f&\16&\u00fa\13&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\7\'\u0104\n\'\f\'\16\'\u0107\13\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\7(\u0114\n(\f(\16(\u0117\13(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\7)\u0125\n)\f)\16)\u0128\13)\3)\3)\3)\3)\3)\3)\7\u00d2"+
		"\u00f8\u0105\u0115\u0126\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C\2E#G$I%K&M\'O(Q)\3\2\6\4\2\13\f\17"+
		"\17\b\2$$^^ddppttvv\4\2C\\c|\3\2\62;\2\u013b\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5[\3\2\2\2\7d\3\2\2\2\tk\3\2\2\2\13r\3"+
		"\2\2\2\rw\3\2\2\2\17}\3\2\2\2\21\u0081\3\2\2\2\23\u008a\3\2\2\2\25\u0090"+
		"\3\2\2\2\27\u0094\3\2\2\2\31\u0097\3\2\2\2\33\u009c\3\2\2\2\35\u00a3\3"+
		"\2\2\2\37\u00a5\3\2\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'"+
		"\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b3\3\2\2\2/\u00b6\3\2"+
		"\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00bc\3\2\2\2\67\u00bf\3\2\2"+
		"\29\u00c2\3\2\2\2;\u00c4\3\2\2\2=\u00c6\3\2\2\2?\u00c9\3\2\2\2A\u00cd"+
		"\3\2\2\2C\u00d7\3\2\2\2E\u00db\3\2\2\2G\u00e0\3\2\2\2I\u00ee\3\2\2\2K"+
		"\u00f2\3\2\2\2M\u00ff\3\2\2\2O\u010d\3\2\2\2Q\u011f\3\2\2\2ST\7k\2\2T"+
		"U\7p\2\2UV\7e\2\2VW\7n\2\2WX\7w\2\2XY\7f\2\2YZ\7g\2\2Z\4\3\2\2\2[\\\7"+
		"h\2\2\\]\7w\2\2]^\7p\2\2^_\7e\2\2_`\7v\2\2`a\7k\2\2ab\7q\2\2bc\7p\2\2"+
		"c\6\3\2\2\2de\7p\2\2ef\7w\2\2fg\7o\2\2gh\7g\2\2hi\7t\2\2ij\7q\2\2j\b\3"+
		"\2\2\2kl\7e\2\2lm\7c\2\2mn\7f\2\2no\7g\2\2op\7p\2\2pq\7c\2\2q\n\3\2\2"+
		"\2rs\7x\2\2st\7q\2\2tu\7k\2\2uv\7f\2\2v\f\3\2\2\2wx\7d\2\2xy\7g\2\2yz"+
		"\7i\2\2z{\7k\2\2{|\7p\2\2|\16\3\2\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7"+
		"f\2\2\u0080\20\3\2\2\2\u0081\u0082\7f\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7x\2\2\u0084\u0085\7q\2\2\u0085\u0086\7n\2\2\u0086\u0087\7x\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7t\2\2\u0089\22\3\2\2\2\u008a\u008b\7y\2\2\u008b"+
		"\u008c\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2"+
		"\u008f\24\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7q\2\2\u0092\u0093\7"+
		"t\2\2\u0093\26\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7h\2\2\u0096\30"+
		"\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a"+
		"\u009b\7g\2\2\u009b\32\3\2\2\2\u009c\u009d\5\27\f\2\u009d\u009e\7\"\2"+
		"\2\u009e\u009f\5\31\r\2\u009f\34\3\2\2\2\u00a0\u00a4\5\27\f\2\u00a1\u00a4"+
		"\5\31\r\2\u00a2\u00a4\5\33\16\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2"+
		"\2\u00a3\u00a2\3\2\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6 \3\2"+
		"\2\2\u00a7\u00a8\7+\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7=\2\2\u00aa$\3\2"+
		"\2\2\u00ab\u00ac\7-\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae(\3\2\2"+
		"\2\u00af\u00b0\7,\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2,\3\2\2"+
		"\2\u00b3\u00b4\7<\2\2\u00b4\u00b5\7?\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7"+
		"\'\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\62\3\2\2\2\u00ba\u00bb"+
		"\7@\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd\u00be\7?\2\2\u00be\66"+
		"\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7?\2\2\u00c18\3\2\2\2\u00c2\u00c3"+
		"\7<\2\2\u00c3:\3\2\2\2\u00c4\u00c5\7\60\2\2\u00c5<\3\2\2\2\u00c6\u00c7"+
		"\7.\2\2\u00c7>\3\2\2\2\u00c8\u00ca\t\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc@\3\2\2\2\u00cd"+
		"\u00d2\7$\2\2\u00ce\u00d1\5C\"\2\u00cf\u00d1\13\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7$"+
		"\2\2\u00d6B\3\2\2\2\u00d7\u00d8\7^\2\2\u00d8\u00d9\t\3\2\2\u00d9D\3\2"+
		"\2\2\u00da\u00dc\t\4\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00deF\3\2\2\2\u00df\u00e1\t\5\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3H\3\2\2\2\u00e4\u00e6\t\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ef\3\2"+
		"\2\2\u00e9\u00eb\7\"\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e5\3\2"+
		"\2\2\u00ee\u00ea\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b%\2\2\u00f1"+
		"J\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\7\61\2\2\u00f4\u00f8\3\2\2"+
		"\2\u00f5\u00f7\13\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\f\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b&\2\2\u00fe"+
		"L\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0101\7,\2\2\u0101\u0105\3\2\2\2"+
		"\u0102\u0104\13\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7,\2\2\u0109\u010a\7\61\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\'"+
		"\2\2\u010cN\3\2\2\2\u010d\u010e\7\61\2\2\u010e\u010f\7,\2\2\u010f\u0110"+
		"\7,\2\2\u0110\u0111\7,\2\2\u0111\u0115\3\2\2\2\u0112\u0114\13\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7,\2\2\u0119"+
		"\u011a\7,\2\2\u011a\u011b\7,\2\2\u011b\u011c\7\61\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\b(\2\2\u011eP\3\2\2\2\u011f\u0120\7\61\2\2\u0120\u0121"+
		"\7,\2\2\u0121\u0122\7,\2\2\u0122\u0126\3\2\2\2\u0123\u0125\13\2\2\2\u0124"+
		"\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0127\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7,\2\2\u012a"+
		"\u012b\7,\2\2\u012b\u012c\7\61\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b)"+
		"\2\2\u012eR\3\2\2\2\20\2\u00a3\u00cb\u00d0\u00d2\u00dd\u00e2\u00e7\u00ec"+
		"\u00ee\u00f8\u0105\u0115\u0126\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}