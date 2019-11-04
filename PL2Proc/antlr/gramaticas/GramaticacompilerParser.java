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
		INCLUDE=1, MAIN=2, FUNCTION=3, TIPONUMERO=4, TIPOCADENA=5, TIPOVOID=6, 
		BEGIN=7, END=8, DEVOLVER=9, WHILE=10, FOR=11, IF=12, ELSE=13, IFELSE=14, 
		CONDICIONES=15, DOSPUNTOS=16, PUNTO=17, COMA=18, PI=19, PD=20, PC=21, 
		ADD=22, MINUS=23, PRODUCT=24, DIVISION=25, ASIGNACION=26, PORCENTAJE=27, 
		MENORQUE=28, MAYORQUE=29, IGUALQUE=30, DISTINTOQUE=31, ADD1=32, SUBSTRACT1=33, 
		NEWLINE=34, CADENA=35, ID=36, DIGITO=37, WS=38, COMENTARIO_LINEA=39, COMENTARIO_LINEA2=40, 
		COMENTARIO_BLOQUE1=41, COMENTARIO_BLOQUE2=42;
	public static final int
		RULE_prog = 0, RULE_include = 1, RULE_asignacion = 2, RULE_variable = 3, 
		RULE_funcionwhile = 4, RULE_funcionfor = 5, RULE_condicionales = 6, RULE_numeros = 7, 
		RULE_devolver = 8, RULE_codigo = 9, RULE_func = 10, RULE_cabecerafuncion = 11, 
		RULE_tiporetorno = 12, RULE_crearfuncion = 13, RULE_llamarfuncion = 14, 
		RULE_parametros = 15, RULE_expr = 16, RULE_exprlog = 17, RULE_tipo = 18, 
		RULE_asignador = 19, RULE_entero = 20, RULE_flotante = 21, RULE_nombrevariable = 22, 
		RULE_nombrefuncion = 23, RULE_nomlib = 24, RULE_punto = 25, RULE_puntocoma = 26, 
		RULE_coma = 27, RULE_dospuntos = 28, RULE_abrirparentesis = 29, RULE_cerrarparentesis = 30, 
		RULE_add1 = 31, RULE_substract1 = 32, RULE_cadena = 33, RULE_opsuma = 34, 
		RULE_opresta = 35, RULE_opmult = 36, RULE_opdiv = 37, RULE_oplog = 38, 
		RULE_keywordinclude = 39, RULE_keywordwhile = 40, RULE_keywordfor = 41, 
		RULE_keywordcond = 42, RULE_keywordmain = 43, RULE_keywordfunc = 44, RULE_keywordreturn = 45, 
		RULE_keywordbegin = 46, RULE_keywordend = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "include", "asignacion", "variable", "funcionwhile", "funcionfor", 
			"condicionales", "numeros", "devolver", "codigo", "func", "cabecerafuncion", 
			"tiporetorno", "crearfuncion", "llamarfuncion", "parametros", "expr", 
			"exprlog", "tipo", "asignador", "entero", "flotante", "nombrevariable", 
			"nombrefuncion", "nomlib", "punto", "puntocoma", "coma", "dospuntos", 
			"abrirparentesis", "cerrarparentesis", "add1", "substract1", "cadena", 
			"opsuma", "opresta", "opmult", "opdiv", "oplog", "keywordinclude", "keywordwhile", 
			"keywordfor", "keywordcond", "keywordmain", "keywordfunc", "keywordreturn", 
			"keywordbegin", "keywordend"
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
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(96);
					include();
					}
					break;
				case 2:
					{
					setState(97);
					expr(0);
					}
					break;
				case 3:
					{
					setState(98);
					asignacion();
					}
					break;
				case 4:
					{
					setState(99);
					crearfuncion();
					}
					break;
				}
				}
				setState(102); 
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
		public List<KeywordincludeContext> keywordinclude() {
			return getRuleContexts(KeywordincludeContext.class);
		}
		public KeywordincludeContext keywordinclude(int i) {
			return getRuleContext(KeywordincludeContext.class,i);
		}
		public List<NomlibContext> nomlib() {
			return getRuleContexts(NomlibContext.class);
		}
		public NomlibContext nomlib(int i) {
			return getRuleContext(NomlibContext.class,i);
		}
		public List<PuntocomaContext> puntocoma() {
			return getRuleContexts(PuntocomaContext.class);
		}
		public PuntocomaContext puntocoma(int i) {
			return getRuleContext(PuntocomaContext.class,i);
		}
		public List<PuntoContext> punto() {
			return getRuleContexts(PuntoContext.class);
		}
		public PuntoContext punto(int i) {
			return getRuleContext(PuntoContext.class,i);
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
			setState(116); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(104);
					keywordinclude();
					setState(105);
					nomlib();
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==PUNTO) {
						{
						{
						setState(106);
						punto();
						setState(107);
						nomlib();
						}
						}
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(114);
					puntocoma();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
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
		public AsignadorContext asignador() {
			return getRuleContext(AsignadorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
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
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(120);
				tipo();
				}
			}

			setState(123);
			nombrevariable();
			setState(124);
			asignador();
			setState(125);
			expr(0);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PC) {
				{
				setState(126);
				puntocoma();
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
		public NombrevariableContext nombrevariable() {
			return getRuleContext(NombrevariableContext.class,0);
		}
		public AsignadorContext asignador() {
			return getRuleContext(AsignadorContext.class,0);
		}
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
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(129);
				tipo();
				}
			}

			setState(132);
			nombrevariable();
			setState(133);
			asignador();
			setState(134);
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

	public static class FuncionwhileContext extends ParserRuleContext {
		public KeywordwhileContext keywordwhile() {
			return getRuleContext(KeywordwhileContext.class,0);
		}
		public AbrirparentesisContext abrirparentesis() {
			return getRuleContext(AbrirparentesisContext.class,0);
		}
		public ExprlogContext exprlog() {
			return getRuleContext(ExprlogContext.class,0);
		}
		public CerrarparentesisContext cerrarparentesis() {
			return getRuleContext(CerrarparentesisContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_funcionwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			keywordwhile();
			setState(137);
			abrirparentesis();
			setState(138);
			exprlog();
			setState(139);
			cerrarparentesis();
			setState(140);
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
		public KeywordforContext keywordfor() {
			return getRuleContext(KeywordforContext.class,0);
		}
		public AbrirparentesisContext abrirparentesis() {
			return getRuleContext(AbrirparentesisContext.class,0);
		}
		public CerrarparentesisContext cerrarparentesis() {
			return getRuleContext(CerrarparentesisContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<NombrevariableContext> nombrevariable() {
			return getRuleContexts(NombrevariableContext.class);
		}
		public NombrevariableContext nombrevariable(int i) {
			return getRuleContext(NombrevariableContext.class,i);
		}
		public List<PuntocomaContext> puntocoma() {
			return getRuleContexts(PuntocomaContext.class);
		}
		public PuntocomaContext puntocoma(int i) {
			return getRuleContext(PuntocomaContext.class,i);
		}
		public ExprlogContext exprlog() {
			return getRuleContext(ExprlogContext.class,0);
		}
		public Add1Context add1() {
			return getRuleContext(Add1Context.class,0);
		}
		public Substract1Context substract1() {
			return getRuleContext(Substract1Context.class,0);
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
		enterRule(_localctx, 10, RULE_funcionfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			keywordfor();
			setState(143);
			abrirparentesis();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(144);
				variable();
				}
				break;
			case 2:
				{
				setState(145);
				nombrevariable();
				}
				break;
			}
			{
			setState(148);
			puntocoma();
			setState(149);
			exprlog();
			}
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PC:
				{
				setState(151);
				puntocoma();
				setState(152);
				variable();
				}
				break;
			case ID:
				{
				setState(154);
				nombrevariable();
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD1:
					{
					setState(155);
					add1();
					}
					break;
				case SUBSTRACT1:
					{
					setState(156);
					substract1();
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
			setState(161);
			cerrarparentesis();
			setState(162);
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

	public static class CondicionalesContext extends ParserRuleContext {
		public KeywordcondContext keywordcond() {
			return getRuleContext(KeywordcondContext.class,0);
		}
		public AbrirparentesisContext abrirparentesis() {
			return getRuleContext(AbrirparentesisContext.class,0);
		}
		public ExprlogContext exprlog() {
			return getRuleContext(ExprlogContext.class,0);
		}
		public CerrarparentesisContext cerrarparentesis() {
			return getRuleContext(CerrarparentesisContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public CondicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterCondicionales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitCondicionales(this);
		}
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicionales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			keywordcond();
			setState(165);
			abrirparentesis();
			setState(166);
			exprlog();
			setState(167);
			cerrarparentesis();
			setState(168);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
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

	public static class DevolverContext extends ParserRuleContext {
		public KeywordreturnContext keywordreturn() {
			return getRuleContext(KeywordreturnContext.class,0);
		}
		public AbrirparentesisContext abrirparentesis() {
			return getRuleContext(AbrirparentesisContext.class,0);
		}
		public CerrarparentesisContext cerrarparentesis() {
			return getRuleContext(CerrarparentesisContext.class,0);
		}
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_devolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			keywordreturn();
			setState(175);
			abrirparentesis();
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(176);
				expr(0);
				}
				break;
			case 2:
				{
				setState(177);
				llamarfuncion();
				}
				break;
			}
			setState(180);
			cerrarparentesis();
			setState(181);
			puntocoma();
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
		enterRule(_localctx, 18, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(183);
				asignacion();
				}
				break;
			case 2:
				{
				setState(184);
				llamarfuncion();
				}
				break;
			case 3:
				{
				setState(185);
				funcionwhile();
				}
				break;
			case 4:
				{
				setState(186);
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
		public KeywordbeginContext keywordbegin() {
			return getRuleContext(KeywordbeginContext.class,0);
		}
		public KeywordendContext keywordend() {
			return getRuleContext(KeywordendContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			keywordbegin();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(190);
				codigo();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEVOLVER) {
				{
				setState(196);
				devolver();
				}
			}

			setState(199);
			keywordend();
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
		public KeywordfuncContext keywordfunc() {
			return getRuleContext(KeywordfuncContext.class,0);
		}
		public AbrirparentesisContext abrirparentesis() {
			return getRuleContext(AbrirparentesisContext.class,0);
		}
		public CerrarparentesisContext cerrarparentesis() {
			return getRuleContext(CerrarparentesisContext.class,0);
		}
		public DospuntosContext dospuntos() {
			return getRuleContext(DospuntosContext.class,0);
		}
		public TiporetornoContext tiporetorno() {
			return getRuleContext(TiporetornoContext.class,0);
		}
		public NombrefuncionContext nombrefuncion() {
			return getRuleContext(NombrefuncionContext.class,0);
		}
		public KeywordmainContext keywordmain() {
			return getRuleContext(KeywordmainContext.class,0);
		}
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
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
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
		enterRule(_localctx, 22, RULE_cabecerafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			keywordfunc();
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(202);
				nombrefuncion();
				}
				break;
			case MAIN:
				{
				setState(203);
				keywordmain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206);
			abrirparentesis();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(207);
				tipo();
				setState(208);
				expr(0);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(209);
					coma();
					setState(210);
					tipo();
					setState(211);
					expr(0);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(220);
			cerrarparentesis();
			setState(221);
			dospuntos();
			setState(222);
			tiporetorno();
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

	public static class TiporetornoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TiporetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiporetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterTiporetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitTiporetorno(this);
		}
	}

	public final TiporetornoContext tiporetorno() throws RecognitionException {
		TiporetornoContext _localctx = new TiporetornoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tiporetorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		enterRule(_localctx, 26, RULE_crearfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			cabecerafuncion();
			setState(227);
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
		public AbrirparentesisContext abrirparentesis() {
			return getRuleContext(AbrirparentesisContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public CerrarparentesisContext cerrarparentesis() {
			return getRuleContext(CerrarparentesisContext.class,0);
		}
		public FuncionforContext funcionfor() {
			return getRuleContext(FuncionforContext.class,0);
		}
		public FuncionwhileContext funcionwhile() {
			return getRuleContext(FuncionwhileContext.class,0);
		}
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_llamarfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(229);
				nombrefuncion();
				setState(230);
				abrirparentesis();
				setState(231);
				parametros();
				setState(232);
				cerrarparentesis();
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(233);
					puntocoma();
					}
					break;
				}
				}
				break;
			case FOR:
				{
				setState(236);
				funcionfor();
				}
				break;
			case WHILE:
				{
				setState(237);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			expr(0);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(241);
				coma();
				setState(242);
				expr(0);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprContext extends ParserRuleContext {
		public LlamarfuncionContext llamarfuncion() {
			return getRuleContext(LlamarfuncionContext.class,0);
		}
		public NombrevariableContext nombrevariable() {
			return getRuleContext(NombrevariableContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public List<OpsumaContext> opsuma() {
			return getRuleContexts(OpsumaContext.class);
		}
		public OpsumaContext opsuma(int i) {
			return getRuleContext(OpsumaContext.class,i);
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
		public AbrirparentesisContext abrirparentesis() {
			return getRuleContext(AbrirparentesisContext.class,0);
		}
		public CerrarparentesisContext cerrarparentesis() {
			return getRuleContext(CerrarparentesisContext.class,0);
		}
		public OpdivContext opdiv() {
			return getRuleContext(OpdivContext.class,0);
		}
		public OpmultContext opmult() {
			return getRuleContext(OpmultContext.class,0);
		}
		public OprestaContext opresta() {
			return getRuleContext(OprestaContext.class,0);
		}
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(250);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(251);
				nombrevariable();
				}
				break;
			case 3:
				{
				setState(252);
				cadena();
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						opsuma();
						setState(254);
						expr(0);
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(261);
				numeros();
				}
				break;
			case 5:
				{
				setState(262);
				abrirparentesis();
				setState(263);
				expr(0);
				setState(264);
				cerrarparentesis();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(271);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DIVISION:
							{
							setState(269);
							opdiv();
							}
							break;
						case PRODUCT:
							{
							setState(270);
							opmult();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(273);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ADD:
							{
							setState(276);
							opsuma();
							}
							break;
						case MINUS:
							{
							setState(277);
							opresta();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(280);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_exprlog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expr(0);
			setState(288);
			oplog();
			setState(289);
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
		enterRule(_localctx, 36, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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

	public static class AsignadorContext extends ParserRuleContext {
		public TerminalNode ASIGNACION() { return getToken(GramaticacompilerParser.ASIGNACION, 0); }
		public AsignadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterAsignador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitAsignador(this);
		}
	}

	public final AsignadorContext asignador() throws RecognitionException {
		AsignadorContext _localctx = new AsignadorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_asignador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ASIGNACION);
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
		enterRule(_localctx, 40, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(295);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(298); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 42, RULE_flotante);
		int _la;
		try {
			int _alt;
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					match(DIGITO);
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
				setState(305);
				match(PUNTO);
				setState(307); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(306);
						match(DIGITO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(309); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PUNTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(PUNTO);
				setState(313); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(312);
						match(DIGITO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(315); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 44, RULE_nombrevariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 46, RULE_nombrefuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 48, RULE_nomlib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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

	public static class PuntoContext extends ParserRuleContext {
		public TerminalNode PUNTO() { return getToken(GramaticacompilerParser.PUNTO, 0); }
		public PuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterPunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitPunto(this);
		}
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(PUNTO);
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

	public static class PuntocomaContext extends ParserRuleContext {
		public TerminalNode PC() { return getToken(GramaticacompilerParser.PC, 0); }
		public PuntocomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntocoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterPuntocoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitPuntocoma(this);
		}
	}

	public final PuntocomaContext puntocoma() throws RecognitionException {
		PuntocomaContext _localctx = new PuntocomaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_puntocoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(GramaticacompilerParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(COMA);
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

	public static class DospuntosContext extends ParserRuleContext {
		public TerminalNode DOSPUNTOS() { return getToken(GramaticacompilerParser.DOSPUNTOS, 0); }
		public DospuntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dospuntos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterDospuntos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitDospuntos(this);
		}
	}

	public final DospuntosContext dospuntos() throws RecognitionException {
		DospuntosContext _localctx = new DospuntosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dospuntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(DOSPUNTOS);
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

	public static class AbrirparentesisContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(GramaticacompilerParser.PI, 0); }
		public AbrirparentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abrirparentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterAbrirparentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitAbrirparentesis(this);
		}
	}

	public final AbrirparentesisContext abrirparentesis() throws RecognitionException {
		AbrirparentesisContext _localctx = new AbrirparentesisContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_abrirparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(PI);
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

	public static class CerrarparentesisContext extends ParserRuleContext {
		public TerminalNode PD() { return getToken(GramaticacompilerParser.PD, 0); }
		public CerrarparentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cerrarparentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterCerrarparentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitCerrarparentesis(this);
		}
	}

	public final CerrarparentesisContext cerrarparentesis() throws RecognitionException {
		CerrarparentesisContext _localctx = new CerrarparentesisContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cerrarparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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

	public static class Add1Context extends ParserRuleContext {
		public TerminalNode ADD1() { return getToken(GramaticacompilerParser.ADD1, 0); }
		public Add1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterAdd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitAdd1(this);
		}
	}

	public final Add1Context add1() throws RecognitionException {
		Add1Context _localctx = new Add1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_add1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ADD1);
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

	public static class Substract1Context extends ParserRuleContext {
		public TerminalNode SUBSTRACT1() { return getToken(GramaticacompilerParser.SUBSTRACT1, 0); }
		public Substract1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substract1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterSubstract1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitSubstract1(this);
		}
	}

	public final Substract1Context substract1() throws RecognitionException {
		Substract1Context _localctx = new Substract1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_substract1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(SUBSTRACT1);
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

	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(GramaticacompilerParser.CADENA, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitCadena(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(CADENA);
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

	public static class OpsumaContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GramaticacompilerParser.ADD, 0); }
		public OpsumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opsuma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterOpsuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitOpsuma(this);
		}
	}

	public final OpsumaContext opsuma() throws RecognitionException {
		OpsumaContext _localctx = new OpsumaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opsuma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ADD);
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

	public static class OprestaContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(GramaticacompilerParser.MINUS, 0); }
		public OprestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opresta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterOpresta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitOpresta(this);
		}
	}

	public final OprestaContext opresta() throws RecognitionException {
		OprestaContext _localctx = new OprestaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_opresta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(MINUS);
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

	public static class OpmultContext extends ParserRuleContext {
		public TerminalNode PRODUCT() { return getToken(GramaticacompilerParser.PRODUCT, 0); }
		public OpmultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opmult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterOpmult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitOpmult(this);
		}
	}

	public final OpmultContext opmult() throws RecognitionException {
		OpmultContext _localctx = new OpmultContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_opmult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(PRODUCT);
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

	public static class OpdivContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(GramaticacompilerParser.DIVISION, 0); }
		public OpdivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opdiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterOpdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitOpdiv(this);
		}
	}

	public final OpdivContext opdiv() throws RecognitionException {
		OpdivContext _localctx = new OpdivContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_opdiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(DIVISION);
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

	public static class OplogContext extends ParserRuleContext {
		public TerminalNode MENORQUE() { return getToken(GramaticacompilerParser.MENORQUE, 0); }
		public TerminalNode MAYORQUE() { return getToken(GramaticacompilerParser.MAYORQUE, 0); }
		public TerminalNode IGUALQUE() { return getToken(GramaticacompilerParser.IGUALQUE, 0); }
		public TerminalNode DISTINTOQUE() { return getToken(GramaticacompilerParser.DISTINTOQUE, 0); }
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitOplog(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENORQUE) | (1L << MAYORQUE) | (1L << IGUALQUE) | (1L << DISTINTOQUE))) != 0)) ) {
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

	public static class KeywordincludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(GramaticacompilerParser.INCLUDE, 0); }
		public KeywordincludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordinclude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterKeywordinclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitKeywordinclude(this);
		}
	}

	public final KeywordincludeContext keywordinclude() throws RecognitionException {
		KeywordincludeContext _localctx = new KeywordincludeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_keywordinclude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(INCLUDE);
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

	public static class KeywordwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticacompilerParser.WHILE, 0); }
		public KeywordwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterKeywordwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitKeywordwhile(this);
		}
	}

	public final KeywordwhileContext keywordwhile() throws RecognitionException {
		KeywordwhileContext _localctx = new KeywordwhileContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_keywordwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(WHILE);
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

	public static class KeywordforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticacompilerParser.FOR, 0); }
		public KeywordforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterKeywordfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitKeywordfor(this);
		}
	}

	public final KeywordforContext keywordfor() throws RecognitionException {
		KeywordforContext _localctx = new KeywordforContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_keywordfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(FOR);
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

	public static class KeywordcondContext extends ParserRuleContext {
		public TerminalNode CONDICIONES() { return getToken(GramaticacompilerParser.CONDICIONES, 0); }
		public KeywordcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterKeywordcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitKeywordcond(this);
		}
	}

	public final KeywordcondContext keywordcond() throws RecognitionException {
		KeywordcondContext _localctx = new KeywordcondContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_keywordcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(CONDICIONES);
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

	public static class KeywordmainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(GramaticacompilerParser.MAIN, 0); }
		public KeywordmainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordmain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterKeywordmain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitKeywordmain(this);
		}
	}

	public final KeywordmainContext keywordmain() throws RecognitionException {
		KeywordmainContext _localctx = new KeywordmainContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_keywordmain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(MAIN);
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

	public static class KeywordfuncContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(GramaticacompilerParser.FUNCTION, 0); }
		public KeywordfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterKeywordfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitKeywordfunc(this);
		}
	}

	public final KeywordfuncContext keywordfunc() throws RecognitionException {
		KeywordfuncContext _localctx = new KeywordfuncContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_keywordfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(FUNCTION);
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

	public static class KeywordreturnContext extends ParserRuleContext {
		public TerminalNode DEVOLVER() { return getToken(GramaticacompilerParser.DEVOLVER, 0); }
		public KeywordreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterKeywordreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitKeywordreturn(this);
		}
	}

	public final KeywordreturnContext keywordreturn() throws RecognitionException {
		KeywordreturnContext _localctx = new KeywordreturnContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_keywordreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(DEVOLVER);
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

	public static class KeywordbeginContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GramaticacompilerParser.BEGIN, 0); }
		public KeywordbeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordbegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterKeywordbegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitKeywordbegin(this);
		}
	}

	public final KeywordbeginContext keywordbegin() throws RecognitionException {
		KeywordbeginContext _localctx = new KeywordbeginContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_keywordbegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(BEGIN);
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

	public static class KeywordendContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(GramaticacompilerParser.END, 0); }
		public KeywordendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterKeywordend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitKeywordend(this);
		}
	}

	public final KeywordendContext keywordend() throws RecognitionException {
		KeywordendContext _localctx = new KeywordendContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_keywordend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0176\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\6\2g\n\2\r"+
		"\2\16\2h\3\3\3\3\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\3\3\3\6\3w\n\3"+
		"\r\3\16\3x\3\4\5\4|\n\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\5\5\u0085\n"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0095\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a0\n\7\5\7\u00a2\n\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00af\n\t\3\n\3\n\3\n\3\n"+
		"\5\n\u00b5\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f"+
		"\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\f\5\f\u00c8\n\f\3\f\3\f\3\r\3\r\3"+
		"\r\5\r\u00cf\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d8\n\r\f\r\16\r\u00db"+
		"\13\r\5\r\u00dd\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00ed\n\20\3\20\3\20\5\20\u00f1\n\20\3\21\3\21\3"+
		"\21\3\21\7\21\u00f7\n\21\f\21\16\21\u00fa\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u0103\n\22\f\22\16\22\u0106\13\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u010d\n\22\3\22\3\22\3\22\5\22\u0112\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0119\n\22\3\22\3\22\7\22\u011d\n\22\f\22\16\22\u0120"+
		"\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26\u012b\n\26\r"+
		"\26\16\26\u012c\3\27\6\27\u0130\n\27\r\27\16\27\u0131\3\27\3\27\6\27\u0136"+
		"\n\27\r\27\16\27\u0137\3\27\3\27\6\27\u013c\n\27\r\27\16\27\u013d\5\27"+
		"\u0140\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\61\2\3\"\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`\2\4\3\2\6\b\3\2\36!\2\u016e\2f\3\2\2\2\4v\3"+
		"\2\2\2\6{\3\2\2\2\b\u0084\3\2\2\2\n\u008a\3\2\2\2\f\u0090\3\2\2\2\16\u00a6"+
		"\3\2\2\2\20\u00ae\3\2\2\2\22\u00b0\3\2\2\2\24\u00bd\3\2\2\2\26\u00bf\3"+
		"\2\2\2\30\u00cb\3\2\2\2\32\u00e2\3\2\2\2\34\u00e4\3\2\2\2\36\u00f0\3\2"+
		"\2\2 \u00f2\3\2\2\2\"\u010c\3\2\2\2$\u0121\3\2\2\2&\u0125\3\2\2\2(\u0127"+
		"\3\2\2\2*\u012a\3\2\2\2,\u013f\3\2\2\2.\u0141\3\2\2\2\60\u0143\3\2\2\2"+
		"\62\u0145\3\2\2\2\64\u0147\3\2\2\2\66\u0149\3\2\2\28\u014b\3\2\2\2:\u014d"+
		"\3\2\2\2<\u014f\3\2\2\2>\u0151\3\2\2\2@\u0153\3\2\2\2B\u0155\3\2\2\2D"+
		"\u0157\3\2\2\2F\u0159\3\2\2\2H\u015b\3\2\2\2J\u015d\3\2\2\2L\u015f\3\2"+
		"\2\2N\u0161\3\2\2\2P\u0163\3\2\2\2R\u0165\3\2\2\2T\u0167\3\2\2\2V\u0169"+
		"\3\2\2\2X\u016b\3\2\2\2Z\u016d\3\2\2\2\\\u016f\3\2\2\2^\u0171\3\2\2\2"+
		"`\u0173\3\2\2\2bg\5\4\3\2cg\5\"\22\2dg\5\6\4\2eg\5\34\17\2fb\3\2\2\2f"+
		"c\3\2\2\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\3\3\2\2\2"+
		"jk\5P)\2kq\5\62\32\2lm\5\64\33\2mn\5\62\32\2np\3\2\2\2ol\3\2\2\2ps\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\5\66\34\2uw\3\2\2\2vj\3"+
		"\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\5\3\2\2\2z|\5&\24\2{z\3\2\2\2{|"+
		"\3\2\2\2|}\3\2\2\2}~\5.\30\2~\177\5(\25\2\177\u0081\5\"\22\2\u0080\u0082"+
		"\5\66\34\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\7\3\2\2\2\u0083"+
		"\u0085\5&\24\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\5.\30\2\u0087\u0088\5(\25\2\u0088\u0089\5\"\22\2\u0089"+
		"\t\3\2\2\2\u008a\u008b\5R*\2\u008b\u008c\5<\37\2\u008c\u008d\5$\23\2\u008d"+
		"\u008e\5> \2\u008e\u008f\5\26\f\2\u008f\13\3\2\2\2\u0090\u0091\5T+\2\u0091"+
		"\u0094\5<\37\2\u0092\u0095\5\b\5\2\u0093\u0095\5.\30\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5\66\34\2\u0097"+
		"\u0098\5$\23\2\u0098\u00a1\3\2\2\2\u0099\u009a\5\66\34\2\u009a\u009b\5"+
		"\b\5\2\u009b\u00a2\3\2\2\2\u009c\u009f\5.\30\2\u009d\u00a0\5@!\2\u009e"+
		"\u00a0\5B\"\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u0099\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\5> \2\u00a4\u00a5\5\26\f\2\u00a5\r\3\2\2\2\u00a6\u00a7\5V,\2\u00a7"+
		"\u00a8\5<\37\2\u00a8\u00a9\5$\23\2\u00a9\u00aa\5> \2\u00aa\u00ab\5\26"+
		"\f\2\u00ab\17\3\2\2\2\u00ac\u00af\5*\26\2\u00ad\u00af\5,\27\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00b1\5\\/\2\u00b1"+
		"\u00b4\5<\37\2\u00b2\u00b5\5\"\22\2\u00b3\u00b5\5\36\20\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\5> \2\u00b7\u00b8\5\66\34\2\u00b8\23\3\2\2\2\u00b9\u00be\5\6\4"+
		"\2\u00ba\u00be\5\36\20\2\u00bb\u00be\5\n\6\2\u00bc\u00be\5\f\7\2\u00bd"+
		"\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\25\3\2\2\2\u00bf\u00c3\5^\60\2\u00c0\u00c2\5\24\13\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\5\22\n\2\u00c7"+
		"\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\5`"+
		"\61\2\u00ca\27\3\2\2\2\u00cb\u00ce\5Z.\2\u00cc\u00cf\5\60\31\2\u00cd\u00cf"+
		"\5X-\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00dc\5<\37\2\u00d1\u00d2\5&\24\2\u00d2\u00d9\5\"\22\2\u00d3\u00d4\5"+
		"8\35\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\5\"\22\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5> \2\u00df\u00e0\5:\36"+
		"\2\u00e0\u00e1\5\32\16\2\u00e1\31\3\2\2\2\u00e2\u00e3\5&\24\2\u00e3\33"+
		"\3\2\2\2\u00e4\u00e5\5\30\r\2\u00e5\u00e6\5\26\f\2\u00e6\35\3\2\2\2\u00e7"+
		"\u00e8\5\60\31\2\u00e8\u00e9\5<\37\2\u00e9\u00ea\5 \21\2\u00ea\u00ec\5"+
		"> \2\u00eb\u00ed\5\66\34\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f1\3\2\2\2\u00ee\u00f1\5\f\7\2\u00ef\u00f1\5\n\6\2\u00f0\u00e7\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f8"+
		"\5\"\22\2\u00f3\u00f4\58\35\2\u00f4\u00f5\5\"\22\2\u00f5\u00f7\3\2\2\2"+
		"\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9!\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\b\22\1\2\u00fc"+
		"\u010d\5\36\20\2\u00fd\u010d\5.\30\2\u00fe\u0104\5D#\2\u00ff\u0100\5F"+
		"$\2\u0100\u0101\5\"\22\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010d\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u010d\5\20\t\2\u0108\u0109\5<\37\2\u0109"+
		"\u010a\5\"\22\2\u010a\u010b\5> \2\u010b\u010d\3\2\2\2\u010c\u00fb\3\2"+
		"\2\2\u010c\u00fd\3\2\2\2\u010c\u00fe\3\2\2\2\u010c\u0107\3\2\2\2\u010c"+
		"\u0108\3\2\2\2\u010d\u011e\3\2\2\2\u010e\u0111\f\t\2\2\u010f\u0112\5L"+
		"\'\2\u0110\u0112\5J&\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\5\"\22\n\u0114\u011d\3\2\2\2\u0115\u0118\f\b\2\2"+
		"\u0116\u0119\5F$\2\u0117\u0119\5H%\2\u0118\u0116\3\2\2\2\u0118\u0117\3"+
		"\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\5\"\22\t\u011b\u011d\3\2\2\2\u011c"+
		"\u010e\3\2\2\2\u011c\u0115\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f#\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122"+
		"\5\"\22\2\u0122\u0123\5N(\2\u0123\u0124\5\"\22\2\u0124%\3\2\2\2\u0125"+
		"\u0126\t\2\2\2\u0126\'\3\2\2\2\u0127\u0128\7\34\2\2\u0128)\3\2\2\2\u0129"+
		"\u012b\7\'\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d+\3\2\2\2\u012e\u0130\7\'\2\2\u012f\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\7\23\2\2\u0134\u0136\7\'\2\2\u0135\u0134\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0140\3\2\2\2\u0139\u013b\7\23\2\2\u013a\u013c\7\'\2\2\u013b\u013a\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u012f\3\2\2\2\u013f\u0139\3\2\2\2\u0140-\3\2\2\2"+
		"\u0141\u0142\7&\2\2\u0142/\3\2\2\2\u0143\u0144\7&\2\2\u0144\61\3\2\2\2"+
		"\u0145\u0146\7&\2\2\u0146\63\3\2\2\2\u0147\u0148\7\23\2\2\u0148\65\3\2"+
		"\2\2\u0149\u014a\7\27\2\2\u014a\67\3\2\2\2\u014b\u014c\7\24\2\2\u014c"+
		"9\3\2\2\2\u014d\u014e\7\22\2\2\u014e;\3\2\2\2\u014f\u0150\7\25\2\2\u0150"+
		"=\3\2\2\2\u0151\u0152\7\26\2\2\u0152?\3\2\2\2\u0153\u0154\7\"\2\2\u0154"+
		"A\3\2\2\2\u0155\u0156\7#\2\2\u0156C\3\2\2\2\u0157\u0158\7%\2\2\u0158E"+
		"\3\2\2\2\u0159\u015a\7\30\2\2\u015aG\3\2\2\2\u015b\u015c\7\31\2\2\u015c"+
		"I\3\2\2\2\u015d\u015e\7\32\2\2\u015eK\3\2\2\2\u015f\u0160\7\33\2\2\u0160"+
		"M\3\2\2\2\u0161\u0162\t\3\2\2\u0162O\3\2\2\2\u0163\u0164\7\3\2\2\u0164"+
		"Q\3\2\2\2\u0165\u0166\7\f\2\2\u0166S\3\2\2\2\u0167\u0168\7\r\2\2\u0168"+
		"U\3\2\2\2\u0169\u016a\7\21\2\2\u016aW\3\2\2\2\u016b\u016c\7\4\2\2\u016c"+
		"Y\3\2\2\2\u016d\u016e\7\5\2\2\u016e[\3\2\2\2\u016f\u0170\7\13\2\2\u0170"+
		"]\3\2\2\2\u0171\u0172\7\t\2\2\u0172_\3\2\2\2\u0173\u0174\7\n\2\2\u0174"+
		"a\3\2\2\2\"fhqx{\u0081\u0084\u0094\u009f\u00a1\u00ae\u00b4\u00bd\u00c3"+
		"\u00c7\u00ce\u00d9\u00dc\u00ec\u00f0\u00f8\u0104\u010c\u0111\u0118\u011c"+
		"\u011e\u012c\u0131\u0137\u013d\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}