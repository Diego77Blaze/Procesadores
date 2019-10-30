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
		PI=15, PD=16, PC=17, ADD=18, MINUS=19, PRODUCT=20, DIVISION=21, ASIGNACION=22, 
		PORCENTAJE=23, MENORQUE=24, MAYORQUE=25, IGUALQUE=26, DISTINTOQUE=27, 
		DOSPUNTOS=28, PUNTO=29, COMA=30, NEWLINE=31, CADENA=32, ID=33, DIGITO=34, 
		WS=35, COMENTARIO_LINEA=36, COMENTARIO_LINEA2=37, COMENTARIO_BLOQUE1=38, 
		COMENTARIO_BLOQUE2=39;
	public static final int
		RULE_prog = 0, RULE_include = 1, RULE_asignacion = 2, RULE_variable = 3, 
		RULE_tipo = 4, RULE_funcionwhile = 5, RULE_funcionfor = 6, RULE_numeros = 7, 
		RULE_entero = 8, RULE_flotante = 9, RULE_devolver = 10, RULE_codigo = 11, 
		RULE_func = 12, RULE_nombrevariable = 13, RULE_nombrefuncion = 14, RULE_cabecerafuncion = 15, 
		RULE_crearfuncion = 16, RULE_llamarfuncion = 17, RULE_parametro = 18, 
		RULE_expr = 19, RULE_exprlog = 20, RULE_comentarios = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "include", "asignacion", "variable", "tipo", "funcionwhile", 
			"funcionfor", "numeros", "entero", "flotante", "devolver", "codigo", 
			"func", "nombrevariable", "nombrefuncion", "cabecerafuncion", "crearfuncion", 
			"llamarfuncion", "parametro", "expr", "exprlog", "comentarios"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'include'", "'function'", "'numero'", "'cadena'", "'void'", "'begin'", 
			"'end'", "'devolver'", "'while'", "'for'", "'if'", "'else'", null, null, 
			"'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", "':='", "'%'", "'<'", 
			"'>'", "'=='", "'!='", "':'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INCLUDE", "FUNCTION", "TIPONUMERO", "TIPOCADENA", "TIPOVOID", 
			"BEGIN", "END", "DEVOLVER", "WHILE", "FOR", "IF", "ELSE", "IFELSE", "CONDICIONES", 
			"PI", "PD", "PC", "ADD", "MINUS", "PRODUCT", "DIVISION", "ASIGNACION", 
			"PORCENTAJE", "MENORQUE", "MAYORQUE", "IGUALQUE", "DISTINTOQUE", "DOSPUNTOS", 
			"PUNTO", "COMA", "NEWLINE", "CADENA", "ID", "DIGITO", "WS", "COMENTARIO_LINEA", 
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
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
		}
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
		public List<ComentariosContext> comentarios() {
			return getRuleContexts(ComentariosContext.class);
		}
		public ComentariosContext comentarios(int i) {
			return getRuleContext(ComentariosContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(44);
						match(NEWLINE);
						}
						} 
					}
					setState(49);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(50);
					include();
					}
					break;
				case 2:
					{
					setState(51);
					expr(0);
					}
					break;
				case 3:
					{
					setState(52);
					asignacion();
					}
					break;
				case 4:
					{
					setState(53);
					crearfuncion();
					}
					break;
				case 5:
					{
					setState(54);
					comentarios();
					}
					break;
				}
				setState(57);
				match(NEWLINE);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCLUDE) | (1L << FUNCTION) | (1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID) | (1L << WHILE) | (1L << FOR) | (1L << PI) | (1L << PUNTO) | (1L << NEWLINE) | (1L << CADENA) | (1L << ID) | (1L << DIGITO) | (1L << COMENTARIO_LINEA) | (1L << COMENTARIO_LINEA2) | (1L << COMENTARIO_BLOQUE1) | (1L << COMENTARIO_BLOQUE2))) != 0) );
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
		public List<TerminalNode> ID() { return getTokens(GramaticacompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticacompilerParser.ID, i);
		}
		public List<TerminalNode> PC() { return getTokens(GramaticacompilerParser.PC); }
		public TerminalNode PC(int i) {
			return getToken(GramaticacompilerParser.PC, i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(GramaticacompilerParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(GramaticacompilerParser.PUNTO, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(63);
				match(INCLUDE);
				setState(64);
				match(ID);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUNTO) {
					{
					{
					setState(65);
					match(PUNTO);
					setState(66);
					match(ID);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(PC);
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						match(NEWLINE);
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				}
				setState(83);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(84);
				tipo();
				}
			}

			setState(87);
			nombrevariable();
			setState(88);
			match(ASIGNACION);
			setState(89);
			expr(0);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PC) {
				{
				setState(90);
				match(PC);
				}
			}

			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					match(NEWLINE);
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(99);
				tipo();
				}
			}

			setState(102);
			match(ID);
			setState(103);
			match(ASIGNACION);
			setState(104);
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
			setState(106);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHILE);
			setState(109);
			match(PI);
			setState(110);
			exprlog();
			setState(111);
			match(PD);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				match(NEWLINE);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(117);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FOR);
			setState(120);
			match(PI);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(121);
				variable();
				}
				break;
			case 2:
				{
				setState(122);
				match(ID);
				}
				break;
			}
			{
			setState(125);
			match(ASIGNACION);
			setState(126);
			exprlog();
			}
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNACION:
				{
				setState(128);
				match(ASIGNACION);
				setState(129);
				variable();
				}
				break;
			case ID:
				{
				setState(130);
				match(ID);
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					{
					setState(131);
					match(ADD);
					setState(132);
					match(ADD);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(133);
					match(MINUS);
					setState(134);
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
			setState(139);
			match(PD);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				match(NEWLINE);
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(145);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(151);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					match(DIGITO);
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
				setState(161);
				match(PUNTO);
				setState(163); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(162);
						match(DIGITO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(165); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PUNTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(PUNTO);
				setState(169); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(168);
						match(DIGITO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(171); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(DEVOLVER);
			setState(176);
			match(PI);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(177);
				expr(0);
				}
				break;
			case 2:
				{
				setState(178);
				llamarfuncion();
				}
				break;
			}
			setState(181);
			match(PD);
			setState(182);
			match(PC);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(183);
				match(NEWLINE);
				}
				}
				setState(188);
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(189);
				asignacion();
				}
				break;
			case 2:
				{
				setState(190);
				llamarfuncion();
				}
				break;
			case 3:
				{
				setState(191);
				funcionwhile();
				}
				break;
			case 4:
				{
				setState(192);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
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
		enterRule(_localctx, 24, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(BEGIN);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				match(NEWLINE);
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(201);
				codigo();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(202);
					match(NEWLINE);
					}
				}

				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEVOLVER) {
				{
				setState(210);
				devolver();
				}
			}

			setState(213);
			match(END);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					match(NEWLINE);
					}
					} 
				}
				setState(219);
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
			setState(220);
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
			setState(222);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
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
		enterRule(_localctx, 30, RULE_cabecerafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(FUNCTION);
			setState(225);
			nombrefuncion();
			setState(226);
			match(PI);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(227);
				tipo();
				setState(228);
				expr(0);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(229);
					match(COMA);
					setState(230);
					tipo();
					setState(231);
					expr(0);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(240);
			match(PD);
			setState(241);
			match(DOSPUNTOS);
			setState(242);
			tipo();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(243);
				match(NEWLINE);
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
		enterRule(_localctx, 32, RULE_crearfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			cabecerafuncion();
			setState(250);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
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
		enterRule(_localctx, 34, RULE_llamarfuncion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(252);
				nombrefuncion();
				setState(253);
				match(PI);
				setState(254);
				expr(0);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(255);
					match(COMA);
					setState(256);
					expr(0);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(PD);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(263);
					match(PC);
					}
					break;
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(266);
						match(NEWLINE);
						}
						} 
					}
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case FOR:
				{
				setState(272);
				funcionfor();
				}
				break;
			case WHILE:
				{
				setState(273);
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
		enterRule(_localctx, 36, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticacompilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticacompilerParser.NEWLINE, i);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(279);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(280);
				nombrevariable();
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(281);
						match(NEWLINE);
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(287);
				match(CADENA);
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(288);
						match(NEWLINE);
						}
						} 
					}
					setState(293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(294);
						match(ADD);
						setState(295);
						expr(0);
						}
						} 
					}
					setState(300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(301);
				numeros();
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(302);
						match(NEWLINE);
						}
						} 
					}
					setState(307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case 5:
				{
				setState(308);
				match(PI);
				setState(309);
				expr(0);
				setState(310);
				match(PD);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(315);
						_la = _input.LA(1);
						if ( !(_la==PRODUCT || _la==DIVISION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(316);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(318);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(319);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 40, RULE_exprlog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			expr(0);
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENORQUE) | (1L << MAYORQUE) | (1L << IGUALQUE) | (1L << DISTINTOQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(327);
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

	public static class ComentariosContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_LINEA() { return getToken(GramaticacompilerParser.COMENTARIO_LINEA, 0); }
		public TerminalNode COMENTARIO_BLOQUE1() { return getToken(GramaticacompilerParser.COMENTARIO_BLOQUE1, 0); }
		public TerminalNode COMENTARIO_BLOQUE2() { return getToken(GramaticacompilerParser.COMENTARIO_BLOQUE2, 0); }
		public TerminalNode COMENTARIO_LINEA2() { return getToken(GramaticacompilerParser.COMENTARIO_LINEA2, 0); }
		public ComentariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).enterComentarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticacompilerParserListener ) ((GramaticacompilerParserListener)listener).exitComentarios(this);
		}
	}

	public final ComentariosContext comentarios() throws RecognitionException {
		ComentariosContext _localctx = new ComentariosContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comentarios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIO_LINEA) | (1L << COMENTARIO_LINEA2) | (1L << COMENTARIO_BLOQUE1) | (1L << COMENTARIO_BLOQUE2))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\2\3\2\3\2\5\2:\n\2\3\2\3\2\6\2>\n\2\r\2\16\2?"+
		"\3\3\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13"+
		"\3\7\3R\n\3\f\3\16\3U\13\3\3\4\5\4X\n\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\7"+
		"\4a\n\4\f\4\16\4d\13\4\3\5\5\5g\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\6\7t\n\7\r\7\16\7u\3\7\3\7\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\5\b\u008c\n\b\3\b\3\b\6"+
		"\b\u0090\n\b\r\b\16\b\u0091\3\b\3\b\3\t\3\t\5\t\u0098\n\t\3\n\6\n\u009b"+
		"\n\n\r\n\16\n\u009c\3\13\6\13\u00a0\n\13\r\13\16\13\u00a1\3\13\3\13\6"+
		"\13\u00a6\n\13\r\13\16\13\u00a7\3\13\3\13\6\13\u00ac\n\13\r\13\16\13\u00ad"+
		"\5\13\u00b0\n\13\3\f\3\f\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\3\f\7\f\u00bb\n"+
		"\f\f\f\16\f\u00be\13\f\3\r\3\r\3\r\3\r\5\r\u00c4\n\r\3\16\3\16\6\16\u00c8"+
		"\n\16\r\16\16\16\u00c9\3\16\3\16\5\16\u00ce\n\16\7\16\u00d0\n\16\f\16"+
		"\16\16\u00d3\13\16\3\16\5\16\u00d6\n\16\3\16\3\16\7\16\u00da\n\16\f\16"+
		"\16\16\u00dd\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u00ec\n\21\f\21\16\21\u00ef\13\21\5\21\u00f1\n\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00f7\n\21\f\21\16\21\u00fa\13\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\7\23\u0104\n\23\f\23\16\23\u0107\13\23\3"+
		"\23\3\23\5\23\u010b\n\23\3\23\7\23\u010e\n\23\f\23\16\23\u0111\13\23\3"+
		"\23\3\23\5\23\u0115\n\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u011d\n\25"+
		"\f\25\16\25\u0120\13\25\3\25\3\25\7\25\u0124\n\25\f\25\16\25\u0127\13"+
		"\25\3\25\3\25\7\25\u012b\n\25\f\25\16\25\u012e\13\25\3\25\3\25\7\25\u0132"+
		"\n\25\f\25\16\25\u0135\13\25\3\25\3\25\3\25\3\25\5\25\u013b\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0143\n\25\f\25\16\25\u0146\13\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\2\3(\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\7\3\2\5\7\3\2\26\27\3\2\24\25\3\2\32\35\3\2&)\2\u016c"+
		"\2=\3\2\2\2\4S\3\2\2\2\6W\3\2\2\2\bf\3\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16"+
		"y\3\2\2\2\20\u0097\3\2\2\2\22\u009a\3\2\2\2\24\u00af\3\2\2\2\26\u00b1"+
		"\3\2\2\2\30\u00c3\3\2\2\2\32\u00c5\3\2\2\2\34\u00de\3\2\2\2\36\u00e0\3"+
		"\2\2\2 \u00e2\3\2\2\2\"\u00fb\3\2\2\2$\u0114\3\2\2\2&\u0116\3\2\2\2(\u013a"+
		"\3\2\2\2*\u0147\3\2\2\2,\u014b\3\2\2\2.\60\7!\2\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\629\3\2\2\2\63\61\3\2\2\2\64:\5\4\3\2\65"+
		":\5(\25\2\66:\5\6\4\2\67:\5\"\22\28:\5,\27\29\64\3\2\2\29\65\3\2\2\29"+
		"\66\3\2\2\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;<\7!\2\2<>\3\2\2\2=\61\3\2"+
		"\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2AB\7\3\2\2BG\7#\2\2CD\7\37"+
		"\2\2DF\7#\2\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2"+
		"\2\2JN\7\23\2\2KM\7!\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2"+
		"\2\2PN\3\2\2\2QA\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\5\3\2\2\2US\3"+
		"\2\2\2VX\5\n\6\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\34\17\2Z[\7\30\2\2"+
		"[]\5(\25\2\\^\7\23\2\2]\\\3\2\2\2]^\3\2\2\2^b\3\2\2\2_a\7!\2\2`_\3\2\2"+
		"\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\7\3\2\2\2db\3\2\2\2eg\5\n\6\2fe\3\2"+
		"\2\2fg\3\2\2\2gh\3\2\2\2hi\7#\2\2ij\7\30\2\2jk\5(\25\2k\t\3\2\2\2lm\t"+
		"\2\2\2m\13\3\2\2\2no\7\13\2\2op\7\21\2\2pq\5*\26\2qs\7\22\2\2rt\7!\2\2"+
		"sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\32\16\2x\r\3\2"+
		"\2\2yz\7\f\2\2z}\7\21\2\2{~\5\b\5\2|~\7#\2\2}{\3\2\2\2}|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7\30\2\2\u0080\u0081\5*\26\2\u0081\u008b\3\2\2\2\u0082"+
		"\u0083\7\30\2\2\u0083\u008c\5\b\5\2\u0084\u0089\7#\2\2\u0085\u0086\7\24"+
		"\2\2\u0086\u008a\7\24\2\2\u0087\u0088\7\25\2\2\u0088\u008a\7\25\2\2\u0089"+
		"\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0082\3\2"+
		"\2\2\u008b\u0084\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7\22\2\2\u008e"+
		"\u0090\7!\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5\32\16\2\u0094"+
		"\17\3\2\2\2\u0095\u0098\5\22\n\2\u0096\u0098\5\24\13\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0096\3\2\2\2\u0098\21\3\2\2\2\u0099\u009b\7$\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\23\3\2\2\2\u009e\u00a0\7$\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\7\37\2\2\u00a4\u00a6\7$\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b0\3\2\2\2\u00a9\u00ab\7\37"+
		"\2\2\u00aa\u00ac\7$\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u009f\3\2"+
		"\2\2\u00af\u00a9\3\2\2\2\u00b0\25\3\2\2\2\u00b1\u00b2\7\n\2\2\u00b2\u00b5"+
		"\7\21\2\2\u00b3\u00b6\5(\25\2\u00b4\u00b6\5$\23\2\u00b5\u00b3\3\2\2\2"+
		"\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\7\22\2\2\u00b8\u00bc\7\23\2\2\u00b9\u00bb\7!\2\2\u00ba\u00b9\3\2\2\2"+
		"\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\27"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c4\5\6\4\2\u00c0\u00c4\5$\23\2\u00c1"+
		"\u00c4\5\f\7\2\u00c2\u00c4\5\16\b\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\31\3\2\2\2\u00c5"+
		"\u00c7\7\b\2\2\u00c6\u00c8\7!\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d1\3\2\2\2\u00cb"+
		"\u00cd\5\30\r\2\u00cc\u00ce\7!\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d6\5\26\f\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00db\7\t\2\2\u00d8\u00da\7!\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\33\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7#\2\2\u00df\35\3\2\2\2\u00e0"+
		"\u00e1\7#\2\2\u00e1\37\3\2\2\2\u00e2\u00e3\7\4\2\2\u00e3\u00e4\5\36\20"+
		"\2\u00e4\u00f0\7\21\2\2\u00e5\u00e6\5\n\6\2\u00e6\u00ed\5(\25\2\u00e7"+
		"\u00e8\7 \2\2\u00e8\u00e9\5\n\6\2\u00e9\u00ea\5(\25\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00e7\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00e5\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\22\2\2\u00f3"+
		"\u00f4\7\36\2\2\u00f4\u00f8\5\n\6\2\u00f5\u00f7\7!\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"!\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\5\32\16"+
		"\2\u00fd#\3\2\2\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\7\21\2\2\u0100\u0105"+
		"\5(\25\2\u0101\u0102\7 \2\2\u0102\u0104\5(\25\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u010a\7\22\2\2\u0109\u010b\7\23\2\2\u010a"+
		"\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010f\3\2\2\2\u010c\u010e\7!"+
		"\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0115\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0115\5\16"+
		"\b\2\u0113\u0115\5\f\7\2\u0114\u00fe\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0115%\3\2\2\2\u0116\u0117\5(\25\2\u0117\'\3\2\2\2\u0118"+
		"\u0119\b\25\1\2\u0119\u013b\5$\23\2\u011a\u011e\5\34\17\2\u011b\u011d"+
		"\7!\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u013b\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0125\7\""+
		"\2\2\u0122\u0124\7!\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012c\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u0129\7\24\2\2\u0129\u012b\5(\25\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u013b\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0133\5\20\t\2\u0130\u0132\7!\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u013b\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\21\2\2\u0137"+
		"\u0138\5(\25\2\u0138\u0139\7\22\2\2\u0139\u013b\3\2\2\2\u013a\u0118\3"+
		"\2\2\2\u013a\u011a\3\2\2\2\u013a\u0121\3\2\2\2\u013a\u012f\3\2\2\2\u013a"+
		"\u0136\3\2\2\2\u013b\u0144\3\2\2\2\u013c\u013d\f\t\2\2\u013d\u013e\t\3"+
		"\2\2\u013e\u0143\5(\25\n\u013f\u0140\f\b\2\2\u0140\u0141\t\4\2\2\u0141"+
		"\u0143\5(\25\t\u0142\u013c\3\2\2\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145)\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0147\u0148\5(\25\2\u0148\u0149\t\5\2\2\u0149\u014a\5(\25\2\u014a"+
		"+\3\2\2\2\u014b\u014c\t\6\2\2\u014c-\3\2\2\2-\619?GNSW]bfu}\u0089\u008b"+
		"\u0091\u0097\u009c\u00a1\u00a7\u00ad\u00af\u00b5\u00bc\u00c3\u00c9\u00cd"+
		"\u00d1\u00d5\u00db\u00ed\u00f0\u00f8\u0105\u010a\u010f\u0114\u011e\u0125"+
		"\u012c\u0133\u013a\u0142\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}