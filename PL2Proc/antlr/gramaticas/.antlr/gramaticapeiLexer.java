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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, INCLUDE=27, FUNCTION=28, TIPONUMERO=29, TIPOCADENA=30, 
		TIPOVOID=31, BEGIN=32, END=33, PORCENTAJE=34, DEVOLVER=35, WHILE=36, FOR=37, 
		IF=38, ELSE=39, IFELSE=40, CADENA=41, NEWLINE=42, ID=43, DIGITO=44, PI=45, 
		PD=46, COMENTARIO_LINEA=47, COMENTARIO_LINEA2=48, COMENTARIO_BLOQUE1=49, 
		COMENTARIO_BLOQUE2=50, WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "INCLUDE", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", 
		"BEGIN", "END", "PORCENTAJE", "DEVOLVER", "WHILE", "FOR", "IF", "ELSE", 
		"IFELSE", "CADENA", "ESC", "NEWLINE", "ID", "DIGITO", "PI", "PD", "COMENTARIO_LINEA", 
		"COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", "COMENTARIO_BLOQUE2", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "';'", "'.'", "'+'", "'-'", "'\u00C3\u00A1'", "'\u00C3\uFFFD'", 
		"'\u00C3\u00A9'", "'\u00C3\u2030'", "'\u00C3\u00AD'", "'\u00C3\u00B3'", 
		"'\u00C3\u201C'", "'\u00C3\u00BA'", "'\u00C3\u0161'", "'\u00C3\u00B1'", 
		"'\u00C3\u2018'", "','", "':'", "'*'", "'/'", "'>'", "'<'", "'<='", "'>='", 
		"'=='", "'!='", "'include'", "'function'", "'numero'", "'cadena'", "'void'", 
		"'begin'", "'end'", "'%'", "'devolver'", "'while'", "'for'", "'if'", "'else'", 
		null, null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INCLUDE", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", 
		"BEGIN", "END", "PORCENTAJE", "DEVOLVER", "WHILE", "FOR", "IF", "ELSE", 
		"IFELSE", "CADENA", "NEWLINE", "ID", "DIGITO", "PI", "PD", "COMENTARIO_LINEA", 
		"COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", "COMENTARIO_BLOQUE2", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0169\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3*\3*\3*\7*\u0102\n*\f*\16*\u0105\13*\3*\3*\3+\3+\3+\3,\6,\u010d"+
		"\n,\r,\16,\u010e\3-\6-\u0112\n-\r-\16-\u0113\3.\6.\u0117\n.\r.\16.\u0118"+
		"\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0123\n\61\f\61\16\61\u0126"+
		"\13\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0130\n\62\f\62\16"+
		"\62\u0133\13\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\7\63\u0140\n\63\f\63\16\63\u0143\13\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\7\64\u0151\n\64\f\64\16\64\u0154\13\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\6\65\u015d\n\65\r\65\16\65\u015e\3"+
		"\65\6\65\u0162\n\65\r\65\16\65\u0163\5\65\u0166\n\65\3\65\3\65\7\u0103"+
		"\u0124\u0131\u0141\u0152\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W,Y-[.]/_\60"+
		"a\61c\62e\63g\64i\65\3\2\6\b\2$$^^ddppttvv\4\2\13\f\17\17\4\2C\\c|\3\2"+
		"\62;\2\u0173\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5n\3\2\2"+
		"\2\7p\3\2\2\2\tr\3\2\2\2\13t\3\2\2\2\rv\3\2\2\2\17y\3\2\2\2\21|\3\2\2"+
		"\2\23\177\3\2\2\2\25\u0082\3\2\2\2\27\u0085\3\2\2\2\31\u0088\3\2\2\2\33"+
		"\u008b\3\2\2\2\35\u008e\3\2\2\2\37\u0091\3\2\2\2!\u0094\3\2\2\2#\u0097"+
		"\3\2\2\2%\u0099\3\2\2\2\'\u009b\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2"+
		"-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61\u00a6\3\2\2\2\63\u00a9\3\2\2\2\65\u00ac"+
		"\3\2\2\2\67\u00af\3\2\2\29\u00b7\3\2\2\2;\u00c0\3\2\2\2=\u00c7\3\2\2\2"+
		"?\u00ce\3\2\2\2A\u00d3\3\2\2\2C\u00d9\3\2\2\2E\u00dd\3\2\2\2G\u00df\3"+
		"\2\2\2I\u00e8\3\2\2\2K\u00ee\3\2\2\2M\u00f2\3\2\2\2O\u00f5\3\2\2\2Q\u00fa"+
		"\3\2\2\2S\u00fe\3\2\2\2U\u0108\3\2\2\2W\u010c\3\2\2\2Y\u0111\3\2\2\2["+
		"\u0116\3\2\2\2]\u011a\3\2\2\2_\u011c\3\2\2\2a\u011e\3\2\2\2c\u012b\3\2"+
		"\2\2e\u0139\3\2\2\2g\u014b\3\2\2\2i\u0165\3\2\2\2kl\7<\2\2lm\7?\2\2m\4"+
		"\3\2\2\2no\7=\2\2o\6\3\2\2\2pq\7\60\2\2q\b\3\2\2\2rs\7-\2\2s\n\3\2\2\2"+
		"tu\7/\2\2u\f\3\2\2\2vw\7\u00c5\2\2wx\7\u00a3\2\2x\16\3\2\2\2yz\7\u00c5"+
		"\2\2z{\7\uffff\2\2{\20\3\2\2\2|}\7\u00c5\2\2}~\7\u00ab\2\2~\22\3\2\2\2"+
		"\177\u0080\7\u00c5\2\2\u0080\u0081\7\u2032\2\2\u0081\24\3\2\2\2\u0082"+
		"\u0083\7\u00c5\2\2\u0083\u0084\7\u00af\2\2\u0084\26\3\2\2\2\u0085\u0086"+
		"\7\u00c5\2\2\u0086\u0087\7\u00b5\2\2\u0087\30\3\2\2\2\u0088\u0089\7\u00c5"+
		"\2\2\u0089\u008a\7\u201e\2\2\u008a\32\3\2\2\2\u008b\u008c\7\u00c5\2\2"+
		"\u008c\u008d\7\u00bc\2\2\u008d\34\3\2\2\2\u008e\u008f\7\u00c5\2\2\u008f"+
		"\u0090\7\u0163\2\2\u0090\36\3\2\2\2\u0091\u0092\7\u00c5\2\2\u0092\u0093"+
		"\7\u00b3\2\2\u0093 \3\2\2\2\u0094\u0095\7\u00c5\2\2\u0095\u0096\7\u201a"+
		"\2\2\u0096\"\3\2\2\2\u0097\u0098\7.\2\2\u0098$\3\2\2\2\u0099\u009a\7<"+
		"\2\2\u009a&\3\2\2\2\u009b\u009c\7,\2\2\u009c(\3\2\2\2\u009d\u009e\7\61"+
		"\2\2\u009e*\3\2\2\2\u009f\u00a0\7@\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7>\2"+
		"\2\u00a2.\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7?\2\2\u00a5\60\3\2\2"+
		"\2\u00a6\u00a7\7@\2\2\u00a7\u00a8\7?\2\2\u00a8\62\3\2\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa\u00ab\7?\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2"+
		"\7e\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7f\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b68\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7w\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7k\2\2"+
		"\u00bd\u00be\7q\2\2\u00be\u00bf\7p\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7p\2"+
		"\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7o\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\u00c6\7q\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd>\3\2\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"\u00d1\7k\2\2\u00d1\u00d2\7f\2\2\u00d2@\3\2\2\2\u00d3\u00d4\7d\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2"+
		"\u00d8B\3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2"+
		"\2\u00dcD\3\2\2\2\u00dd\u00de\7\'\2\2\u00deF\3\2\2\2\u00df\u00e0\7f\2"+
		"\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7x\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7n\2\2\u00e4\u00e5\7x\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7t\2\2\u00e7"+
		"H\3\2\2\2\u00e8\u00e9\7y\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7k\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00edJ\3\2\2\2\u00ee\u00ef\7h\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u00f1\7t\2\2\u00f1L\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7h\2\2\u00f4N\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7n\2\2\u00f7"+
		"\u00f8\7u\2\2\u00f8\u00f9\7g\2\2\u00f9P\3\2\2\2\u00fa\u00fb\5M\'\2\u00fb"+
		"\u00fc\7\"\2\2\u00fc\u00fd\5O(\2\u00fdR\3\2\2\2\u00fe\u0103\7$\2\2\u00ff"+
		"\u0102\5U+\2\u0100\u0102\13\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7$\2\2\u0107T\3\2\2\2\u0108"+
		"\u0109\7^\2\2\u0109\u010a\t\2\2\2\u010aV\3\2\2\2\u010b\u010d\t\3\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010fX\3\2\2\2\u0110\u0112\t\4\2\2\u0111\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114Z\3\2\2\2\u0115"+
		"\u0117\t\5\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\\\3\2\2\2\u011a\u011b\7*\2\2\u011b^\3\2"+
		"\2\2\u011c\u011d\7+\2\2\u011d`\3\2\2\2\u011e\u011f\7\61\2\2\u011f\u0120"+
		"\7\61\2\2\u0120\u0124\3\2\2\2\u0121\u0123\13\2\2\2\u0122\u0121\3\2\2\2"+
		"\u0123\u0126\3\2\2\2\u0124\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\f\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\b\61\2\2\u012ab\3\2\2\2\u012b\u012c\7\61\2\2\u012c\u012d\7,\2\2"+
		"\u012d\u0131\3\2\2\2\u012e\u0130\13\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\7,\2\2\u0135\u0136\7\61\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\b\62\2\2\u0138d\3\2\2\2\u0139\u013a\7\61\2\2\u013a\u013b"+
		"\7,\2\2\u013b\u013c\7,\2\2\u013c\u013d\7,\2\2\u013d\u0141\3\2\2\2\u013e"+
		"\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u0142\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7,\2\2\u0145\u0146\7,\2\2\u0146\u0147\7,\2\2\u0147\u0148\7\61\2"+
		"\2\u0148\u0149\3\2\2\2\u0149\u014a\b\63\2\2\u014af\3\2\2\2\u014b\u014c"+
		"\7\61\2\2\u014c\u014d\7,\2\2\u014d\u014e\7,\2\2\u014e\u0152\3\2\2\2\u014f"+
		"\u0151\13\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\3"+
		"\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0156\7,\2\2\u0156\u0157\7,\2\2\u0157\u0158\7\61\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\b\64\2\2\u015ah\3\2\2\2\u015b\u015d\t\3\2\2\u015c\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0166\3\2\2\2\u0160\u0162\7\"\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u015c\3\2\2\2\u0165\u0161\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b\65"+
		"\2\2\u0168j\3\2\2\2\17\2\u0101\u0103\u010e\u0113\u0118\u0124\u0131\u0141"+
		"\u0152\u015e\u0163\u0165\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}