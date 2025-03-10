// Generated from .\GramaticacompilerLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticacompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, MAIN=2, FUNCTION=3, TIPONUMERO=4, TIPOCADENA=5, TIPOVOID=6, 
		BEGIN=7, END=8, DEVOLVER=9, WHILE=10, FOR=11, IF=12, ELSE=13, IFELSE=14, 
		CONDICIONES=15, DOSPUNTOS=16, PUNTO=17, COMA=18, PI=19, PD=20, PC=21, 
		ADD=22, MINUS=23, PRODUCT=24, DIVISION=25, ASIGNACION=26, PORCENTAJE=27, 
		MENORQUE=28, MAYORQUE=29, IGUALQUE=30, DISTINTOQUE=31, ADD1=32, SUBSTRACT1=33, 
		NEWLINE=34, CADENA=35, ID=36, DIGITO=37, WS=38, COMENTARIO_LINEA=39, COMENTARIO_LINEA2=40, 
		COMENTARIO_BLOQUE1=41, COMENTARIO_BLOQUE2=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INCLUDE", "MAIN", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", 
			"BEGIN", "END", "DEVOLVER", "WHILE", "FOR", "IF", "ELSE", "IFELSE", "CONDICIONES", 
			"DOSPUNTOS", "PUNTO", "COMA", "PI", "PD", "PC", "ADD", "MINUS", "PRODUCT", 
			"DIVISION", "ASIGNACION", "PORCENTAJE", "MENORQUE", "MAYORQUE", "IGUALQUE", 
			"DISTINTOQUE", "ADD1", "SUBSTRACT1", "NEWLINE", "CADENA", "ESC", "ID", 
			"DIGITO", "WS", "COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", 
			"COMENTARIO_BLOQUE2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'include'", "'main'", "'function'", "'numero'", "'cadena'", "'void'", 
			"'begin'", "'end'", "'devolver'", "'while'", "'for'", "'if'", "'else'", 
			null, null, "':'", "'.'", "','", "'('", "')'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "':='", "'%'", "'<'", "'>'", "'=='", "'!='", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INCLUDE", "MAIN", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", 
			"BEGIN", "END", "DEVOLVER", "WHILE", "FOR", "IF", "ELSE", "IFELSE", "CONDICIONES", 
			"DOSPUNTOS", "PUNTO", "COMA", "PI", "PD", "PC", "ADD", "MINUS", "PRODUCT", 
			"DIVISION", "ASIGNACION", "PORCENTAJE", "MENORQUE", "MAYORQUE", "IGUALQUE", 
			"DISTINTOQUE", "ADD1", "SUBSTRACT1", "NEWLINE", "CADENA", "ID", "DIGITO", 
			"WS", "COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", 
			"COMENTARIO_BLOQUE2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GramaticacompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticacompilerLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 34:
			CADENA_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CADENA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0143\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\5\20\u00af\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\6#\u00db\n#\r#\16#\u00dc\3#\3#\3$\3$\3$\7$\u00e4\n$\f$\16"+
		"$\u00e7\13$\3$\3$\3$\3%\3%\3%\3&\6&\u00f0\n&\r&\16&\u00f1\3\'\6\'\u00f5"+
		"\n\'\r\'\16\'\u00f6\3(\6(\u00fa\n(\r(\16(\u00fb\3(\6(\u00ff\n(\r(\16("+
		"\u0100\5(\u0103\n(\3(\3(\3)\3)\3)\3)\7)\u010b\n)\f)\16)\u010e\13)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\7*\u0118\n*\f*\16*\u011b\13*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\7+\u0128\n+\f+\16+\u012b\13+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\7,\u0139\n,\f,\16,\u013c\13,\3,\3,\3,\3,\3,\3,\7\u00e5\u010c\u0119"+
		"\u0129\u013a\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I\2K&M\'O(Q)S*U+W,\3\2\6\4\2\13\f\17\17"+
		"\b\2$$^^ddppttvv\4\2C\\c|\3\2\62;\2\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5a\3\2"+
		"\2\2\7f\3\2\2\2\to\3\2\2\2\13v\3\2\2\2\r}\3\2\2\2\17\u0082\3\2\2\2\21"+
		"\u0088\3\2\2\2\23\u008c\3\2\2\2\25\u0095\3\2\2\2\27\u009b\3\2\2\2\31\u009f"+
		"\3\2\2\2\33\u00a2\3\2\2\2\35\u00a7\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2"+
		"\2\2#\u00b2\3\2\2\2%\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00ba"+
		"\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2"+
		"\2\65\u00c4\3\2\2\2\67\u00c7\3\2\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00cd"+
		"\3\2\2\2?\u00d0\3\2\2\2A\u00d3\3\2\2\2C\u00d6\3\2\2\2E\u00da\3\2\2\2G"+
		"\u00e0\3\2\2\2I\u00eb\3\2\2\2K\u00ef\3\2\2\2M\u00f4\3\2\2\2O\u0102\3\2"+
		"\2\2Q\u0106\3\2\2\2S\u0113\3\2\2\2U\u0121\3\2\2\2W\u0133\3\2\2\2YZ\7k"+
		"\2\2Z[\7p\2\2[\\\7e\2\2\\]\7n\2\2]^\7w\2\2^_\7f\2\2_`\7g\2\2`\4\3\2\2"+
		"\2ab\7o\2\2bc\7c\2\2cd\7k\2\2de\7p\2\2e\6\3\2\2\2fg\7h\2\2gh\7w\2\2hi"+
		"\7p\2\2ij\7e\2\2jk\7v\2\2kl\7k\2\2lm\7q\2\2mn\7p\2\2n\b\3\2\2\2op\7p\2"+
		"\2pq\7w\2\2qr\7o\2\2rs\7g\2\2st\7t\2\2tu\7q\2\2u\n\3\2\2\2vw\7e\2\2wx"+
		"\7c\2\2xy\7f\2\2yz\7g\2\2z{\7p\2\2{|\7c\2\2|\f\3\2\2\2}~\7x\2\2~\177\7"+
		"q\2\2\177\u0080\7k\2\2\u0080\u0081\7f\2\2\u0081\16\3\2\2\2\u0082\u0083"+
		"\7d\2\2\u0083\u0084\7g\2\2\u0084\u0085\7i\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7p\2\2\u0087\20\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7f\2\2\u008b\22\3\2\2\2\u008c\u008d\7f\2\2\u008d\u008e\7g\2\2\u008e"+
		"\u008f\7x\2\2\u008f\u0090\7q\2\2\u0090\u0091\7n\2\2\u0091\u0092\7x\2\2"+
		"\u0092\u0093\7g\2\2\u0093\u0094\7t\2\2\u0094\24\3\2\2\2\u0095\u0096\7"+
		"y\2\2\u0096\u0097\7j\2\2\u0097\u0098\7k\2\2\u0098\u0099\7n\2\2\u0099\u009a"+
		"\7g\2\2\u009a\26\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7q\2\2\u009d\u009e"+
		"\7t\2\2\u009e\30\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1\32"+
		"\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\5\31\r\2\u00a8\u00a9\7\"\2"+
		"\2\u00a9\u00aa\5\33\16\2\u00aa\36\3\2\2\2\u00ab\u00af\5\31\r\2\u00ac\u00af"+
		"\5\33\16\2\u00ad\u00af\5\35\17\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00ae\u00ad\3\2\2\2\u00af \3\2\2\2\u00b0\u00b1\7<\2\2\u00b1\"\3\2\2"+
		"\2\u00b2\u00b3\7\60\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7.\2\2\u00b5&\3\2\2"+
		"\2\u00b6\u00b7\7*\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7+\2\2\u00b9*\3\2\2\2"+
		"\u00ba\u00bb\7=\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd.\3\2\2\2\u00be"+
		"\u00bf\7/\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7,\2\2\u00c1\62\3\2\2\2\u00c2"+
		"\u00c3\7\61\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7<\2\2\u00c5\u00c6\7?\2\2"+
		"\u00c6\66\3\2\2\2\u00c7\u00c8\7\'\2\2\u00c88\3\2\2\2\u00c9\u00ca\7>\2"+
		"\2\u00ca:\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7?\2\2"+
		"\u00ce\u00cf\7?\2\2\u00cf>\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7?\2"+
		"\2\u00d2@\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4\u00d5\7-\2\2\u00d5B\3\2\2\2"+
		"\u00d6\u00d7\7/\2\2\u00d7\u00d8\7/\2\2\u00d8D\3\2\2\2\u00d9\u00db\t\2"+
		"\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b#\2\2\u00dfF\3\2\2\2\u00e0"+
		"\u00e5\7$\2\2\u00e1\u00e4\5I%\2\u00e2\u00e4\13\2\2\2\u00e3\u00e1\3\2\2"+
		"\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7$\2\2\u00e9"+
		"\u00ea\b$\3\2\u00eaH\3\2\2\2\u00eb\u00ec\7^\2\2\u00ec\u00ed\t\3\2\2\u00ed"+
		"J\3\2\2\2\u00ee\u00f0\t\4\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2L\3\2\2\2\u00f3\u00f5\t"+
		"\5\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7N\3\2\2\2\u00f8\u00fa\t\2\2\2\u00f9\u00f8\3\2\2\2"+
		"\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0103"+
		"\3\2\2\2\u00fd\u00ff\7\"\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00f9\3\2"+
		"\2\2\u0102\u00fe\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b(\2\2\u0105"+
		"P\3\2\2\2\u0106\u0107\7\61\2\2\u0107\u0108\7\61\2\2\u0108\u010c\3\2\2"+
		"\2\u0109\u010b\13\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0110\7\f\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b)\2\2\u0112"+
		"R\3\2\2\2\u0113\u0114\7\61\2\2\u0114\u0115\7,\2\2\u0115\u0119\3\2\2\2"+
		"\u0116\u0118\13\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011d\7,\2\2\u011d\u011e\7\61\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b*"+
		"\2\2\u0120T\3\2\2\2\u0121\u0122\7\61\2\2\u0122\u0123\7,\2\2\u0123\u0124"+
		"\7,\2\2\u0124\u0125\7,\2\2\u0125\u0129\3\2\2\2\u0126\u0128\13\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7,\2\2\u012d"+
		"\u012e\7,\2\2\u012e\u012f\7,\2\2\u012f\u0130\7\61\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\b+\2\2\u0132V\3\2\2\2\u0133\u0134\7\61\2\2\u0134\u0135"+
		"\7,\2\2\u0135\u0136\7,\2\2\u0136\u013a\3\2\2\2\u0137\u0139\13\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u013b\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7,\2\2\u013e"+
		"\u013f\7,\2\2\u013f\u0140\7\61\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b,"+
		"\2\2\u0142X\3\2\2\2\20\2\u00ae\u00dc\u00e3\u00e5\u00f1\u00f6\u00fb\u0100"+
		"\u0102\u010c\u0119\u0129\u013a\4\b\2\2\3$\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}