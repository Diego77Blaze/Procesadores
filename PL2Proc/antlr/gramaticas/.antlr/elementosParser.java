// Generated from d:\ProgrammingStuff\Github\Procesadores\PL2Proc\antlr\gramaticas\elementos.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class elementosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PI=1, PD=2, ID=3, INT=4, IF=5, IDz=6, IDF=7, ENTERO=8, FLOTANTE=9, CADENA=10, 
		COMENTARIO_LINEA=11, COMENTARIO_BLOQUE=12, WS=13;
	public static final int
		RULE_llamadafuncion = 0, RULE_numeros = 1;
	public static final String[] ruleNames = {
		"llamadafuncion", "numeros"
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

	@Override
	public String getGrammarFileName() { return "elementos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public elementosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LlamadafuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(elementosParser.ID, 0); }
		public TerminalNode PI() { return getToken(elementosParser.PI, 0); }
		public TerminalNode INT() { return getToken(elementosParser.INT, 0); }
		public TerminalNode PD() { return getToken(elementosParser.PD, 0); }
		public LlamadafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadafuncion; }
	}

	public final LlamadafuncionContext llamadafuncion() throws RecognitionException {
		LlamadafuncionContext _localctx = new LlamadafuncionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_llamadafuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(ID);
			setState(5);
			match(PI);
			setState(6);
			match(INT);
			setState(7);
			match(PD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumerosContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(elementosParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(elementosParser.FLOTANTE, 0); }
		public NumerosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeros; }
	}

	public final NumerosContext numeros() throws RecognitionException {
		NumerosContext _localctx = new NumerosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numeros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==FLOTANTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\16\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\2\2\4\2\4\2\3\3\2\n\13\2\13\2\6\3"+
		"\2\2\2\4\13\3\2\2\2\6\7\7\5\2\2\7\b\7\3\2\2\b\t\7\6\2\2\t\n\7\4\2\2\n"+
		"\3\3\2\2\2\13\f\t\2\2\2\f\5\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}