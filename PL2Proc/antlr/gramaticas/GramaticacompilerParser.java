// Generated from GramaticacompilerParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticacompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, FUNCTION=2, TIPONUMERO=3, TIPOCADENA=4, TIPOVOID=5, BEGIN=6, 
		END=7, DEVOLVER=8, WHILE=9, FOR=10, IF=11, ELSE=12, IFELSE=13, CONDICIONES=14, 
		DOSPUNTOS=15, PUNTO=16, COMA=17, PI=18, PD=19, PC=20, ADD=21, MINUS=22, 
		PRODUCT=23, DIVISION=24, ASIGNACION=25, PORCENTAJE=26, MENORQUE=27, MAYORQUE=28, 
		IGUALQUE=29, DISTINTOQUE=30, NEWLINE=31, CADENA=32, ID=33, DIGITO=34, 
		WS=35, COMENTARIO_LINEA=36, COMENTARIO_LINEA2=37, COMENTARIO_BLOQUE1=38, 
		COMENTARIO_BLOQUE2=39;
	public static final int
		RULE_prog = 0, RULE_include = 1, RULE_asignacion = 2, RULE_variable = 3, 
		RULE_tipo = 4, RULE_funcionwhile = 5, RULE_funcionfor = 6, RULE_numeros = 7, 
		RULE_entero = 8, RULE_flotante = 9, RULE_devolver = 10, RULE_codigo = 11, 
		RULE_func = 12, RULE_nombrevariable = 13, RULE_nombrefuncion = 14, RULE_nomlib = 15, 
		RULE_cabecerafuncion = 16, RULE_crearfuncion = 17, RULE_llamarfuncion = 18, 
		RULE_parametro = 19, RULE_expr = 20, RULE_exprlog = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "include", "asignacion", "variable", "tipo", "funcionwhile", 
			"funcionfor", "numeros", "entero", "flotante", "devolver", "codigo", 
			"func", "nombrevariable", "nombrefuncion", "nomlib", "cabecerafuncion", 
			"crearfuncion", "llamarfuncion", "parametro", "expr", "exprlog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'include'", "'function'", "'numero'", "'cadena'", "'void'", "'begin'", 
			"'end'", "'devolver'", "'while'", "'for'", "'if'", "'else'", null, null, 
			"':'", "'.'", "','", "'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", 
			"':='", "'%'", "'<'", "'>'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INCLUDE", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", 
			"BEGIN", "END", "DEVOLVER", "WHILE", "FOR", "IF", "ELSE", "IFELSE", "CONDICIONES", 
			"DOSPUNTOS", "PUNTO", "COMA", "PI", "PD", "PC", "ADD", "MINUS", "PRODUCT", 
			"DIVISION", "ASIGNACION", "PORCENTAJE", "MENORQUE", "MAYORQUE", "IGUALQUE", 
			"DISTINTOQUE", "NEWLINE", "CADENA", "ID", "DIGITO", "WS", "COMENTARIO_LINEA", 
			"COMENTARIO_LINEA2", "COMENTARIO_BLOQUE1", "COMENTARIO_BLOQUE2"
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

	@Override
	public String getGrammarFileName() { return "GramaticacompilerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticacompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<CrearfuncionContext> crearfuncion() {
			return getRuleContexts(CrearfuncionContext.class);
		}
		public CrearfuncionContext crearfuncion(int i) {
			return getRuleContext(CrearfuncionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					include();
					}
					break;
				case 2:
					{
					setState(45);
					expr(0);
					}
					break;
				case 3:
					{
					setState(46);
					asignacion();
					}
					break;
				case 4:
					{
					setState(47);
					crearfuncion();
					}
					break;
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCLUDE) | (1L << FUNCTION) | (1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID) | (1L << WHILE) | (1L << FOR) | (1L << PUNTO) | (1L << PI) | (1L << CADENA) | (1L << ID) | (1L << DIGITO))) != 0) );
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

	public static class IncludeContext extends ParserRuleContext {
		public List<TerminalNode> INCLUDE() { return getTokens(GramaticacompilerParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(GramaticacompilerParser.INCLUDE, i);
		}
		public List<NomlibContext> nomlib() {
			return getRuleContexts(NomlibContext.class);
		}
		public NomlibContext nomlib(int i) {
			return getRuleContext(NomlibContext.class,i);
		}
		public List<TerminalNode> PC() { return getTokens(GramaticacompilerParser.PC); }
		public TerminalNode PC(int i) {
			return getToken(GramaticacompilerParser.PC, i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(GramaticacompilerParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(GramaticacompilerParser.PUNTO, i);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_include);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52);
					match(INCLUDE);
					setState(53);
					nomlib();
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==PUNTO) {
						{
						{
						setState(54);
						match(PUNTO);
						setState(55);
						nomlib();
						}
						}
						setState(60);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(61);
					match(PC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AsignacionContext extends ParserRuleContext {
		public NombrevariableContext nombrevariable() {
			return getRuleContext(NombrevariableContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(GramaticacompilerParser.ASIGNACION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PC() { return getToken(GramaticacompilerParser.PC, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(67);
				tipo();
				}
			}

			setState(70);
			nombrevariable();
			setState(71);
			match(ASIGNACION);
			setState(72);
			expr(0);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PC) {
				{
				setState(73);
				match(PC);
				}
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticacompilerParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(GramaticacompilerParser.ASIGNACION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(76);
				tipo();
				}
			}

			setState(79);
			match(ID);
			setState(80);
			match(ASIGNACION);
			setState(81);
			expr(0);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TIPONUMERO() { return getToken(GramaticacompilerParser.TIPONUMERO, 0); }
		public TerminalNode TIPOCADENA() { return getToken(GramaticacompilerParser.TIPOCADENA, 0); }
		public TerminalNode TIPOVOID() { return getToken(GramaticacompilerParser.TIPOVOID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) ) {
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

	public static class FuncionwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticacompilerParser.WHILE, 0); }
		public TerminalNode PI() { return getToken(GramaticacompilerParser.PI, 0); }
		public ExprlogContext exprlog() {
			return getRuleContext(ExprlogContext.class,0);
		}
		public TerminalNode PD() { return getToken(GramaticacompilerParser.PD, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FuncionwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterFuncionwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitFuncionwhile(this);
		}
	}

	public final FuncionwhileContext funcionwhile() throws RecognitionException {
		FuncionwhileContext _localctx = new FuncionwhileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcionwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(WHILE);
			setState(86);
			match(PI);
			setState(87);
			exprlog();
			setState(88);
			match(PD);
			setState(89);
			func();
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

	public static class FuncionforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticacompilerParser.FOR, 0); }
		public TerminalNode PI() { return getToken(GramaticacompilerParser.PI, 0); }
		public TerminalNode PD() { return getToken(GramaticacompilerParser.PD, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticacompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticacompilerParser.ID, i);
		}
		public List<TerminalNode> ASIGNACION() { return getTokens(GramaticacompilerParser.ASIGNACION); }
		public TerminalNode ASIGNACION(int i) {
			return getToken(GramaticacompilerParser.ASIGNACION, i);
		}
		public ExprlogContext exprlog() {
			return getRuleContext(ExprlogContext.class,0);
		}
		public List<TerminalNode> ADD() { return getTokens(GramaticacompilerParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(GramaticacompilerParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(GramaticacompilerParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GramaticacompilerParser.MINUS, i);
		}
		public FuncionforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterFuncionfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitFuncionfor(this);
		}
	}

	public final FuncionforContext funcionfor() throws RecognitionException {
		FuncionforContext _localctx = new FuncionforContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcionfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FOR);
			setState(92);
			match(PI);
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(93);
				variable();
				}
				break;
			case 2:
				{
				setState(94);
				match(ID);
				}
				break;
			}
			{
			setState(97);
			match(ASIGNACION);
			setState(98);
			exprlog();
			}
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNACION:
				{
				setState(100);
				match(ASIGNACION);
				setState(101);
				variable();
				}
				break;
			case ID:
				{
				setState(102);
				match(ID);
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					{
					setState(103);
					match(ADD);
					setState(104);
					match(ADD);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(105);
					match(MINUS);
					setState(106);
					match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
			match(PD);
			setState(112);
			func();
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
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public FlotanteContext flotante() {
			return getRuleContext(FlotanteContext.class,0);
		}
		public NumerosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterNumeros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitNumeros(this);
		}
	}

	public final NumerosContext numeros() throws RecognitionException {
		NumerosContext _localctx = new NumerosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeros);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				flotante();
				}
				break;
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

	public static class EnteroContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(GramaticacompilerParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(GramaticacompilerParser.DIGITO, i);
		}
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(118);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(121); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FlotanteContext extends ParserRuleContext {
		public TerminalNode PUNTO() { return getToken(GramaticacompilerParser.PUNTO, 0); }
		public List<TerminalNode> DIGITO() { return getTokens(GramaticacompilerParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(GramaticacompilerParser.DIGITO, i);
		}
		public FlotanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterFlotante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitFlotante(this);
		}
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_flotante);
		int _la;
		try {
			int _alt;
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(123);
					match(DIGITO);
					}
					}
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
				setState(128);
				match(PUNTO);
				setState(130); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(129);
						match(DIGITO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(132); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PUNTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(PUNTO);
				setState(136); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(135);
						match(DIGITO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(138); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DevolverContext extends ParserRuleContext {
		public TerminalNode DEVOLVER() { return getToken(GramaticacompilerParser.DEVOLVER, 0); }
		public TerminalNode PI() { return getToken(GramaticacompilerParser.PI, 0); }
		public TerminalNode PD() { return getToken(GramaticacompilerParser.PD, 0); }
		public TerminalNode PC() { return getToken(GramaticacompilerParser.PC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LlamarfuncionContext llamarfuncion() {
			return getRuleContext(LlamarfuncionContext.class,0);
		}
		public DevolverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_devolver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterDevolver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitDevolver(this);
		}
	}

	public final DevolverContext devolver() throws RecognitionException {
		DevolverContext _localctx = new DevolverContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_devolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(DEVOLVER);
			setState(143);
			match(PI);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(144);
				expr(0);
				}
				break;
			case 2:
				{
				setState(145);
				llamarfuncion();
				}
				break;
			}
			setState(148);
			match(PD);
			setState(149);
			match(PC);
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

	public static class CodigoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public LlamarfuncionContext llamarfuncion() {
			return getRuleContext(LlamarfuncionContext.class,0);
		}
		public FuncionwhileContext funcionwhile() {
			return getRuleContext(FuncionwhileContext.class,0);
		}
		public FuncionforContext funcionfor() {
			return getRuleContext(FuncionforContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitCodigo(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(151);
				asignacion();
				}
				break;
			case 2:
				{
				setState(152);
				llamarfuncion();
				}
				break;
			case 3:
				{
				setState(153);
				funcionwhile();
				}
				break;
			case 4:
				{
				setState(154);
				funcionfor();
				}
				break;
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GramaticacompilerParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(GramaticacompilerParser.END, 0); }
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public DevolverContext devolver() {
			return getRuleContext(DevolverContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(BEGIN);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(158);
				codigo();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEVOLVER) {
				{
				setState(164);
				devolver();
				}
			}

			setState(167);
			match(END);
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

	public static class NombrevariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticacompilerParser.ID, 0); }
		public NombrevariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrevariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterNombrevariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitNombrevariable(this);
		}
	}

	public final NombrevariableContext nombrevariable() throws RecognitionException {
		NombrevariableContext _localctx = new NombrevariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nombrevariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
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

	public static class NombrefuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticacompilerParser.ID, 0); }
		public NombrefuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrefuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterNombrefuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitNombrefuncion(this);
		}
	}

	public final NombrefuncionContext nombrefuncion() throws RecognitionException {
		NombrefuncionContext _localctx = new NombrefuncionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nombrefuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ID);
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

	public static class NomlibContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticacompilerParser.ID, 0); }
		public NomlibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomlib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterNomlib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitNomlib(this);
		}
	}

	public final NomlibContext nomlib() throws RecognitionException {
		NomlibContext _localctx = new NomlibContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nomlib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
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

	public static class CabecerafuncionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(GramaticacompilerParser.FUNCTION, 0); }
		public NombrefuncionContext nombrefuncion() {
			return getRuleContext(NombrefuncionContext.class,0);
		}
		public TerminalNode PI() { return getToken(GramaticacompilerParser.PI, 0); }
		public TerminalNode PD() { return getToken(GramaticacompilerParser.PD, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(GramaticacompilerParser.DOSPUNTOS, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(GramaticacompilerParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GramaticacompilerParser.COMA, i);
		}
		public CabecerafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecerafuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterCabecerafuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitCabecerafuncion(this);
		}
	}

	public final CabecerafuncionContext cabecerafuncion() throws RecognitionException {
		CabecerafuncionContext _localctx = new CabecerafuncionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cabecerafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FUNCTION);
			setState(176);
			nombrefuncion();
			setState(177);
			match(PI);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(178);
				tipo();
				setState(179);
				expr(0);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(180);
					match(COMA);
					setState(181);
					tipo();
					setState(182);
					expr(0);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(191);
			match(PD);
			setState(192);
			match(DOSPUNTOS);
			setState(193);
			tipo();
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

	public static class CrearfuncionContext extends ParserRuleContext {
		public CabecerafuncionContext cabecerafuncion() {
			return getRuleContext(CabecerafuncionContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public CrearfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterCrearfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitCrearfuncion(this);
		}
	}

	public final CrearfuncionContext crearfuncion() throws RecognitionException {
		CrearfuncionContext _localctx = new CrearfuncionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_crearfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			cabecerafuncion();
			setState(196);
			func();
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

	public static class LlamarfuncionContext extends ParserRuleContext {
		public NombrefuncionContext nombrefuncion() {
			return getRuleContext(NombrefuncionContext.class,0);
		}
		public TerminalNode PI() { return getToken(GramaticacompilerParser.PI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PD() { return getToken(GramaticacompilerParser.PD, 0); }
		public FuncionforContext funcionfor() {
			return getRuleContext(FuncionforContext.class,0);
		}
		public FuncionwhileContext funcionwhile() {
			return getRuleContext(FuncionwhileContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(GramaticacompilerParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(GramaticacompilerParser.COMA, i);
		}
		public TerminalNode PC() { return getToken(GramaticacompilerParser.PC, 0); }
		public LlamarfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamarfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterLlamarfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitLlamarfuncion(this);
		}
	}

	public final LlamarfuncionContext llamarfuncion() throws RecognitionException {
		LlamarfuncionContext _localctx = new LlamarfuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_llamarfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(198);
				nombrefuncion();
				setState(199);
				match(PI);
				setState(200);
				expr(0);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(201);
					match(COMA);
					setState(202);
					expr(0);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(PD);
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(209);
					match(PC);
					}
					break;
				}
				}
				break;
			case FOR:
				{
				setState(212);
				funcionfor();
				}
				break;
			case WHILE:
				{
				setState(213);
				funcionwhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParametroContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public LlamarfuncionContext llamarfuncion() {
			return getRuleContext(LlamarfuncionContext.class,0);
		}
		public NombrevariableContext nombrevariable() {
			return getRuleContext(NombrevariableContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(GramaticacompilerParser.CADENA, 0); }
		public List<TerminalNode> ADD() { return getTokens(GramaticacompilerParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(GramaticacompilerParser.ADD, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NumerosContext numeros() {
			return getRuleContext(NumerosContext.class,0);
		}
		public TerminalNode PI() { return getToken(GramaticacompilerParser.PI, 0); }
		public TerminalNode PD() { return getToken(GramaticacompilerParser.PD, 0); }
		public TerminalNode PRODUCT() { return getToken(GramaticacompilerParser.PRODUCT, 0); }
		public TerminalNode DIVISION() { return getToken(GramaticacompilerParser.DIVISION, 0); }
		public TerminalNode MINUS() { return getToken(GramaticacompilerParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(219);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(220);
				nombrevariable();
				}
				break;
			case 3:
				{
				setState(221);
				match(CADENA);
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222);
						match(ADD);
						setState(223);
						expr(0);
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(229);
				numeros();
				}
				break;
			case 5:
				{
				setState(230);
				match(PI);
				setState(231);
				expr(0);
				setState(232);
				match(PD);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(237);
						_la = _input.LA(1);
						if ( !(_la==PRODUCT || _la==DIVISION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(240);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprlogContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENORQUE() { return getToken(GramaticacompilerParser.MENORQUE, 0); }
		public TerminalNode MAYORQUE() { return getToken(GramaticacompilerParser.MAYORQUE, 0); }
		public TerminalNode IGUALQUE() { return getToken(GramaticacompilerParser.IGUALQUE, 0); }
		public TerminalNode DISTINTOQUE() { return getToken(GramaticacompilerParser.DISTINTOQUE, 0); }
		public ExprlogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterExprlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitExprlog(this);
		}
	}

	public final ExprlogContext exprlog() throws RecognitionException {
		ExprlogContext _localctx = new ExprlogContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprlog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			expr(0);
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENORQUE) | (1L << MAYORQUE) | (1L << IGUALQUE) | (1L << DISTINTOQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(249);
			expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\6\2"+
		"\63\n\2\r\2\16\2\64\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\6"+
		"\3B\n\3\r\3\16\3C\3\4\5\4G\n\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\5\5P\n\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bb\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\5\bp\n\b\3\b\3\b\3"+
		"\b\3\t\3\t\5\tw\n\t\3\n\6\nz\n\n\r\n\16\n{\3\13\6\13\177\n\13\r\13\16"+
		"\13\u0080\3\13\3\13\6\13\u0085\n\13\r\13\16\13\u0086\3\13\3\13\6\13\u008b"+
		"\n\13\r\13\16\13\u008c\5\13\u008f\n\13\3\f\3\f\3\f\3\f\5\f\u0095\n\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\16\3\16\7\16\u00a2\n\16\f\16"+
		"\16\16\u00a5\13\16\3\16\5\16\u00a8\n\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00bb\n\22"+
		"\f\22\16\22\u00be\13\22\5\22\u00c0\n\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00ce\n\24\f\24\16\24\u00d1\13\24"+
		"\3\24\3\24\5\24\u00d5\n\24\3\24\3\24\5\24\u00d9\n\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u00e3\n\26\f\26\16\26\u00e6\13\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00ed\n\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u00f5\n\26\f\26\16\26\u00f8\13\26\3\27\3\27\3\27\3\27\3\27\2\3*\30\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\6\3\2\5\7\3\2\31\32\3"+
		"\2\27\30\3\2\35 \2\u010d\2\62\3\2\2\2\4A\3\2\2\2\6F\3\2\2\2\bO\3\2\2\2"+
		"\nU\3\2\2\2\fW\3\2\2\2\16]\3\2\2\2\20v\3\2\2\2\22y\3\2\2\2\24\u008e\3"+
		"\2\2\2\26\u0090\3\2\2\2\30\u009d\3\2\2\2\32\u009f\3\2\2\2\34\u00ab\3\2"+
		"\2\2\36\u00ad\3\2\2\2 \u00af\3\2\2\2\"\u00b1\3\2\2\2$\u00c5\3\2\2\2&\u00d8"+
		"\3\2\2\2(\u00da\3\2\2\2*\u00ec\3\2\2\2,\u00f9\3\2\2\2.\63\5\4\3\2/\63"+
		"\5*\26\2\60\63\5\6\4\2\61\63\5$\23\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2"+
		"\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3\3\2"+
		"\2\2\66\67\7\3\2\2\67<\5 \21\289\7\22\2\29;\5 \21\2:8\3\2\2\2;>\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\26\2\2@B\3\2\2\2A\66\3"+
		"\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EG\5\n\6\2FE\3\2\2\2FG"+
		"\3\2\2\2GH\3\2\2\2HI\5\34\17\2IJ\7\33\2\2JL\5*\26\2KM\7\26\2\2LK\3\2\2"+
		"\2LM\3\2\2\2M\7\3\2\2\2NP\5\n\6\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7#\2"+
		"\2RS\7\33\2\2ST\5*\26\2T\t\3\2\2\2UV\t\2\2\2V\13\3\2\2\2WX\7\13\2\2XY"+
		"\7\24\2\2YZ\5,\27\2Z[\7\25\2\2[\\\5\32\16\2\\\r\3\2\2\2]^\7\f\2\2^a\7"+
		"\24\2\2_b\5\b\5\2`b\7#\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2cd\7\33\2\2de"+
		"\5,\27\2eo\3\2\2\2fg\7\33\2\2gp\5\b\5\2hm\7#\2\2ij\7\27\2\2jn\7\27\2\2"+
		"kl\7\30\2\2ln\7\30\2\2mi\3\2\2\2mk\3\2\2\2np\3\2\2\2of\3\2\2\2oh\3\2\2"+
		"\2pq\3\2\2\2qr\7\25\2\2rs\5\32\16\2s\17\3\2\2\2tw\5\22\n\2uw\5\24\13\2"+
		"vt\3\2\2\2vu\3\2\2\2w\21\3\2\2\2xz\7$\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2"+
		"\2{|\3\2\2\2|\23\3\2\2\2}\177\7$\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\7\22\2\2"+
		"\u0083\u0085\7$\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008f\3\2\2\2\u0088\u008a\7\22\2\2"+
		"\u0089\u008b\7$\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e~\3\2\2\2\u008e"+
		"\u0088\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091\7\n\2\2\u0091\u0094\7\24\2"+
		"\2\u0092\u0095\5*\26\2\u0093\u0095\5&\24\2\u0094\u0092\3\2\2\2\u0094\u0093"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\25\2\2"+
		"\u0097\u0098\7\26\2\2\u0098\27\3\2\2\2\u0099\u009e\5\6\4\2\u009a\u009e"+
		"\5&\24\2\u009b\u009e\5\f\7\2\u009c\u009e\5\16\b\2\u009d\u0099\3\2\2\2"+
		"\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\31"+
		"\3\2\2\2\u009f\u00a3\7\b\2\2\u00a0\u00a2\5\30\r\2\u00a1\u00a0\3\2\2\2"+
		"\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\5\26\f\2\u00a7\u00a6\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\t\2\2\u00aa\33"+
		"\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\35\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae"+
		"\37\3\2\2\2\u00af\u00b0\7#\2\2\u00b0!\3\2\2\2\u00b1\u00b2\7\4\2\2\u00b2"+
		"\u00b3\5\36\20\2\u00b3\u00bf\7\24\2\2\u00b4\u00b5\5\n\6\2\u00b5\u00bc"+
		"\5*\26\2\u00b6\u00b7\7\23\2\2\u00b7\u00b8\5\n\6\2\u00b8\u00b9\5*\26\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00b4\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\25"+
		"\2\2\u00c2\u00c3\7\21\2\2\u00c3\u00c4\5\n\6\2\u00c4#\3\2\2\2\u00c5\u00c6"+
		"\5\"\22\2\u00c6\u00c7\5\32\16\2\u00c7%\3\2\2\2\u00c8\u00c9\5\36\20\2\u00c9"+
		"\u00ca\7\24\2\2\u00ca\u00cf\5*\26\2\u00cb\u00cc\7\23\2\2\u00cc\u00ce\5"+
		"*\26\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\7\25"+
		"\2\2\u00d3\u00d5\7\26\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d9\3\2\2\2\u00d6\u00d9\5\16\b\2\u00d7\u00d9\5\f\7\2\u00d8\u00c8\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\'\3\2\2\2\u00da\u00db"+
		"\5*\26\2\u00db)\3\2\2\2\u00dc\u00dd\b\26\1\2\u00dd\u00ed\5&\24\2\u00de"+
		"\u00ed\5\34\17\2\u00df\u00e4\7\"\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00e3"+
		"\5*\26\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00ed\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ed\5\20"+
		"\t\2\u00e8\u00e9\7\24\2\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\7\25\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00dc\3\2\2\2\u00ec\u00de\3\2\2\2\u00ec\u00df\3\2"+
		"\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\u00f6\3\2\2\2\u00ee"+
		"\u00ef\f\t\2\2\u00ef\u00f0\t\3\2\2\u00f0\u00f5\5*\26\n\u00f1\u00f2\f\b"+
		"\2\2\u00f2\u00f3\t\4\2\2\u00f3\u00f5\5*\26\t\u00f4\u00ee\3\2\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7+\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\5*\26\2\u00fa\u00fb"+
		"\t\5\2\2\u00fb\u00fc\5*\26\2\u00fc-\3\2\2\2\37\62\64<CFLOamov{\u0080\u0086"+
		"\u008c\u008e\u0094\u009d\u00a3\u00a7\u00bc\u00bf\u00cf\u00d4\u00d8\u00e4"+
		"\u00ec\u00f4\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}