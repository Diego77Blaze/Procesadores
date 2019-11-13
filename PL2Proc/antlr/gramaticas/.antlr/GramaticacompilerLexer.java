// Generated from c:\Users\diego\OneDrive\Documentos\NetBeansProjects\Procesadores\PL2Proc\antlr\gramaticas/GramaticacompilerLexer.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, MAIN=2, FUNCTION=3, TIPONUMERO=4, TIPOCADENA=5, TIPOVOID=6, 
		THEN=7, IF=8, ELSE=9, CONDICIONES=10, ENDIF=11, BEGIN=12, END=13, DEVOLVER=14, 
		WHILE=15, FOR=16, SWITCH=17, CASE=18, BREAK=19, DEFAULT=20, ENDSWITCH=21, 
		DOSPUNTOS=22, PUNTO=23, COMA=24, PI=25, PD=26, PC=27, BB=28, ADD=29, MINUS=30, 
		PRODUCT=31, DIVISION=32, ASIGNACION=33, PORCENTAJE=34, MENORQUE=35, MAYORQUE=36, 
		IGUALQUE=37, DISTINTOQUE=38, ADD1=39, SUBSTRACT1=40, NEWLINE=41, CADENA=42, 
		ID=43, DIGITO=44, WS=45, COMENTARIO_LINEA=46, COMENTARIO_LINEA2=47, COMENTARIO_BLOQUE1=48, 
		COMENTARIO_BLOQUE2=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INCLUDE", "MAIN", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", 
		"THEN", "IF", "ELSE", "CONDICIONES", "ENDIF", "BEGIN", "END", "DEVOLVER", 
		"WHILE", "FOR", "SWITCH", "CASE", "BREAK", "DEFAULT", "ENDSWITCH", "DOSPUNTOS", 
		"PUNTO", "COMA", "PI", "PD", "PC", "BB", "ADD", "MINUS", "PRODUCT", "DIVISION", 
		"ASIGNACION", "PORCENTAJE", "MENORQUE", "MAYORQUE", "IGUALQUE", "DISTINTOQUE", 
		"ADD1", "SUBSTRACT1", "NEWLINE", "CADENA", "ESC", "ID", "DIGITO", "WS", 
		"COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", "COMENTARIO_BLOQUE2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include'", "'main'", "'function'", "'numero'", "'cadena'", "'void'", 
		"'then'", "'if'", "'else'", null, "'endif'", "'begin'", "'end'", "'devolver'", 
		"'while'", "'for'", "'switch'", "'case'", "'break'", "'default'", "'endswitch'", 
		"':'", "'.'", "','", "'('", "')'", "';'", "'_'", "'+'", "'-'", "'*'", 
		"'/'", "':='", "'%'", "'<'", "'>'", "'=='", "'!='", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INCLUDE", "MAIN", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", 
		"THEN", "IF", "ELSE", "CONDICIONES", "ENDIF", "BEGIN", "END", "DEVOLVER", 
		"WHILE", "FOR", "SWITCH", "CASE", "BREAK", "DEFAULT", "ENDSWITCH", "DOSPUNTOS", 
		"PUNTO", "COMA", "PI", "PD", "PC", "BB", "ADD", "MINUS", "PRODUCT", "DIVISION", 
		"ASIGNACION", "PORCENTAJE", "MENORQUE", "MAYORQUE", "IGUALQUE", "DISTINTOQUE", 
		"ADD1", "SUBSTRACT1", "NEWLINE", "CADENA", "ID", "DIGITO", "WS", "COMENTARIO_LINEA", 
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
		case 41:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u017d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\5\13\u00a0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\6*\u0115\n*\r"+
		"*\16*\u0116\3*\3*\3+\3+\3+\7+\u011e\n+\f+\16+\u0121\13+\3+\3+\3+\3,\3"+
		",\3,\3-\6-\u012a\n-\r-\16-\u012b\3.\6.\u012f\n.\r.\16.\u0130\3/\6/\u0134"+
		"\n/\r/\16/\u0135\3/\6/\u0139\n/\r/\16/\u013a\5/\u013d\n/\3/\3/\3\60\3"+
		"\60\3\60\3\60\7\60\u0145\n\60\f\60\16\60\u0148\13\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\7\61\u0152\n\61\f\61\16\61\u0155\13\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0162\n\62\f\62"+
		"\16\62\u0165\13\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\7\63\u0173\n\63\f\63\16\63\u0176\13\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\7\u011f\u0146\u0153\u0163\u0174\2\64\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W\2Y-[.]/_\60a\61c\62e\63\3\2\6\4\2\13\f\17\17\b\2$$^^ddppttvv\6\2"+
		"\62;C\\aac|\3\2\62;\2\u0188\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5o\3\2\2\2\7t"+
		"\3\2\2\2\t}\3\2\2\2\13\u0084\3\2\2\2\r\u008b\3\2\2\2\17\u0090\3\2\2\2"+
		"\21\u0095\3\2\2\2\23\u0098\3\2\2\2\25\u009f\3\2\2\2\27\u00a1\3\2\2\2\31"+
		"\u00a7\3\2\2\2\33\u00ad\3\2\2\2\35\u00b1\3\2\2\2\37\u00ba\3\2\2\2!\u00c0"+
		"\3\2\2\2#\u00c4\3\2\2\2%\u00cb\3\2\2\2\'\u00d0\3\2\2\2)\u00d6\3\2\2\2"+
		"+\u00de\3\2\2\2-\u00e8\3\2\2\2/\u00ea\3\2\2\2\61\u00ec\3\2\2\2\63\u00ee"+
		"\3\2\2\2\65\u00f0\3\2\2\2\67\u00f2\3\2\2\29\u00f4\3\2\2\2;\u00f6\3\2\2"+
		"\2=\u00f8\3\2\2\2?\u00fa\3\2\2\2A\u00fc\3\2\2\2C\u00fe\3\2\2\2E\u0101"+
		"\3\2\2\2G\u0103\3\2\2\2I\u0105\3\2\2\2K\u0107\3\2\2\2M\u010a\3\2\2\2O"+
		"\u010d\3\2\2\2Q\u0110\3\2\2\2S\u0114\3\2\2\2U\u011a\3\2\2\2W\u0125\3\2"+
		"\2\2Y\u0129\3\2\2\2[\u012e\3\2\2\2]\u013c\3\2\2\2_\u0140\3\2\2\2a\u014d"+
		"\3\2\2\2c\u015b\3\2\2\2e\u016d\3\2\2\2gh\7k\2\2hi\7p\2\2ij\7e\2\2jk\7"+
		"n\2\2kl\7w\2\2lm\7f\2\2mn\7g\2\2n\4\3\2\2\2op\7o\2\2pq\7c\2\2qr\7k\2\2"+
		"rs\7p\2\2s\6\3\2\2\2tu\7h\2\2uv\7w\2\2vw\7p\2\2wx\7e\2\2xy\7v\2\2yz\7"+
		"k\2\2z{\7q\2\2{|\7p\2\2|\b\3\2\2\2}~\7p\2\2~\177\7w\2\2\177\u0080\7o\2"+
		"\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082\u0083\7q\2\2\u0083\n\3"+
		"\2\2\2\u0084\u0085\7e\2\2\u0085\u0086\7c\2\2\u0086\u0087\7f\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7c\2\2\u008a\f\3\2\2\2\u008b"+
		"\u008c\7x\2\2\u008c\u008d\7q\2\2\u008d\u008e\7k\2\2\u008e\u008f\7f\2\2"+
		"\u008f\16\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7j\2\2\u0092\u0093\7"+
		"g\2\2\u0093\u0094\7p\2\2\u0094\20\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097"+
		"\7h\2\2\u0097\22\3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b"+
		"\7u\2\2\u009b\u009c\7g\2\2\u009c\24\3\2\2\2\u009d\u00a0\5\21\t\2\u009e"+
		"\u00a0\5\23\n\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\26\3\2\2"+
		"\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5"+
		"\7k\2\2\u00a5\u00a6\7h\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\32\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7f\2\2\u00b0"+
		"\34\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7x\2\2\u00b4"+
		"\u00b5\7q\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7x\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8\u00b9\7t\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7"+
		"j\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf "+
		"\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\"\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7j\2\2\u00ca$\3\2\2\2\u00cb"+
		"\u00cc\7e\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2"+
		"\u00cf&\3\2\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2"+
		"\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7m\2\2\u00d5(\3\2\2\2\u00d6\u00d7\7"+
		"f\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7c\2\2\u00da\u00db"+
		"\7w\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7v\2\2\u00dd*\3\2\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\u00e3\7y\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7e\2\2"+
		"\u00e6\u00e7\7j\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7<\2\2\u00e9.\3\2\2\2\u00ea"+
		"\u00eb\7\60\2\2\u00eb\60\3\2\2\2\u00ec\u00ed\7.\2\2\u00ed\62\3\2\2\2\u00ee"+
		"\u00ef\7*\2\2\u00ef\64\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1\66\3\2\2\2\u00f2"+
		"\u00f3\7=\2\2\u00f38\3\2\2\2\u00f4\u00f5\7a\2\2\u00f5:\3\2\2\2\u00f6\u00f7"+
		"\7-\2\2\u00f7<\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9>\3\2\2\2\u00fa\u00fb\7"+
		",\2\2\u00fb@\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fdB\3\2\2\2\u00fe\u00ff\7"+
		"<\2\2\u00ff\u0100\7?\2\2\u0100D\3\2\2\2\u0101\u0102\7\'\2\2\u0102F\3\2"+
		"\2\2\u0103\u0104\7>\2\2\u0104H\3\2\2\2\u0105\u0106\7@\2\2\u0106J\3\2\2"+
		"\2\u0107\u0108\7?\2\2\u0108\u0109\7?\2\2\u0109L\3\2\2\2\u010a\u010b\7"+
		"#\2\2\u010b\u010c\7?\2\2\u010cN\3\2\2\2\u010d\u010e\7-\2\2\u010e\u010f"+
		"\7-\2\2\u010fP\3\2\2\2\u0110\u0111\7/\2\2\u0111\u0112\7/\2\2\u0112R\3"+
		"\2\2\2\u0113\u0115\t\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b*"+
		"\2\2\u0119T\3\2\2\2\u011a\u011f\7$\2\2\u011b\u011e\5W,\2\u011c\u011e\13"+
		"\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0123\7$\2\2\u0123\u0124\b+\3\2\u0124V\3\2\2\2\u0125\u0126"+
		"\7^\2\2\u0126\u0127\t\3\2\2\u0127X\3\2\2\2\u0128\u012a\t\4\2\2\u0129\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"Z\3\2\2\2\u012d\u012f\t\5\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\\\3\2\2\2\u0132\u0134\t"+
		"\2\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u013d\3\2\2\2\u0137\u0139\7\"\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u0133\3\2\2\2\u013c\u0138\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\b/\2\2\u013f^\3\2\2\2\u0140\u0141\7\61\2\2\u0141\u0142"+
		"\7\61\2\2\u0142\u0146\3\2\2\2\u0143\u0145\13\2\2\2\u0144\u0143\3\2\2\2"+
		"\u0145\u0148\3\2\2\2\u0146\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\f\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\b\60\2\2\u014c`\3\2\2\2\u014d\u014e\7\61\2\2\u014e\u014f\7,\2\2"+
		"\u014f\u0153\3\2\2\2\u0150\u0152\13\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0157\7,\2\2\u0157\u0158\7\61\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\b\61\2\2\u015ab\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d"+
		"\7,\2\2\u015d\u015e\7,\2\2\u015e\u015f\7,\2\2\u015f\u0163\3\2\2\2\u0160"+
		"\u0162\13\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\7,\2\2\u0167\u0168\7,\2\2\u0168\u0169\7,\2\2\u0169\u016a\7\61\2"+
		"\2\u016a\u016b\3\2\2\2\u016b\u016c\b\62\2\2\u016cd\3\2\2\2\u016d\u016e"+
		"\7\61\2\2\u016e\u016f\7,\2\2\u016f\u0170\7,\2\2\u0170\u0174\3\2\2\2\u0171"+
		"\u0173\13\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0175\3"+
		"\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\7,\2\2\u0178\u0179\7,\2\2\u0179\u017a\7\61\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017c\b\63\2\2\u017cf\3\2\2\2\20\2\u009f\u0116\u011d\u011f"+
		"\u012b\u0130\u0135\u013a\u013c\u0146\u0153\u0163\u0174\4\b\2\2\3+\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}