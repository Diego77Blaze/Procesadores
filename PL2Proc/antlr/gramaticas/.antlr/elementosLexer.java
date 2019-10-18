// Generated from d:\ProgrammingStuff\Github\Procesadores\PL2Proc\antlr\gramaticas\elementos.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class elementosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PI=1, PD=2, ID=3, INT=4, IF=5, IDz=6, IDF=7, ENTERO=8, FLOTANTE=9, CADENA=10, 
		COMENTARIO_LINEA=11, COMENTARIO_BLOQUE=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PI", "PD", "ID", "INT", "IF", "IDz", "IDF", "ID_LETRA", "DIGITO", "ENTERO", 
		"FLOTANTE", "CADENA", "ESC", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, null, "'if'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PI", "PD", "ID", "INT", "IF", "IDz", "IDF", "ENTERO", "FLOTANTE", 
		"CADENA", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS"
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


	public elementosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "elementos.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\6\4)\n\4\r\4\16\4*\3\5\6\5.\n\5\r\5\16\5/\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\7\b;\n\b\f\b\16\b>\13\b\3\t\3\t\3\n\3\n\3\13\6"+
		"\13E\n\13\r\13\16\13F\3\f\6\fJ\n\f\r\f\16\fK\3\f\3\f\7\fP\n\f\f\f\16\f"+
		"S\13\f\3\f\3\f\6\fW\n\f\r\f\16\fX\5\f[\n\f\3\r\3\r\3\r\7\r`\n\r\f\r\16"+
		"\rc\13\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17n\n\17\f\17\16"+
		"\17q\13\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20{\n\20\f\20\16"+
		"\20~\13\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21\u0086\n\21\r\21\16\21\u0087"+
		"\3\21\3\21\5ao|\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\n\27\13"+
		"\31\f\33\2\35\r\37\16!\17\3\2\7\4\2C\\c|\3\2\62;\5\2\62;C\\c|\b\2$$^^"+
		"ddppttvv\5\2\13\f\17\17\"\"\2\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2"+
		"\5%\3\2\2\2\7(\3\2\2\2\t-\3\2\2\2\13\61\3\2\2\2\r\64\3\2\2\2\17\67\3\2"+
		"\2\2\21?\3\2\2\2\23A\3\2\2\2\25D\3\2\2\2\27Z\3\2\2\2\31\\\3\2\2\2\33f"+
		"\3\2\2\2\35i\3\2\2\2\37v\3\2\2\2!\u0085\3\2\2\2#$\7*\2\2$\4\3\2\2\2%&"+
		"\7+\2\2&\6\3\2\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2"+
		"+\b\3\2\2\2,.\t\3\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\n\3"+
		"\2\2\2\61\62\7k\2\2\62\63\7h\2\2\63\f\3\2\2\2\64\65\t\2\2\2\65\66\t\4"+
		"\2\2\66\16\3\2\2\2\67<\5\21\t\28;\5\21\t\29;\5\23\n\2:8\3\2\2\2:9\3\2"+
		"\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\20\3\2\2\2><\3\2\2\2?@\t\2\2\2@\22"+
		"\3\2\2\2AB\t\3\2\2B\24\3\2\2\2CE\5\23\n\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2G\26\3\2\2\2HJ\5\23\n\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2LM\3\2\2\2MQ\7\60\2\2NP\5\23\n\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2Q"+
		"R\3\2\2\2R[\3\2\2\2SQ\3\2\2\2TV\7\60\2\2UW\5\23\n\2VU\3\2\2\2WX\3\2\2"+
		"\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZI\3\2\2\2ZT\3\2\2\2[\30\3\2\2\2\\a\7"+
		"$\2\2]`\5\33\16\2^`\13\2\2\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2ab\3\2\2\2a"+
		"_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7$\2\2e\32\3\2\2\2fg\7^\2\2gh\t\5\2\2"+
		"h\34\3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2\2\2ln\13\2\2\2ml\3\2\2\2nq\3"+
		"\2\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\f\2\2st\3\2\2\2tu\b"+
		"\17\2\2u\36\3\2\2\2vw\7\61\2\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2"+
		"{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7,\2\2"+
		"\u0080\u0081\7\61\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\20\2\2\u0083 "+
		"\3\2\2\2\u0084\u0086\t\6\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\21"+
		"\2\2\u008a\"\3\2\2\2\21\2*/:<FKQXZ_ao|\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}