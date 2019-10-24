// Generated from d:\ProgrammingStuff\Github\Procesadores\PL2Proc\antlr\gramaticas\gramaticapei.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticapeiParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_asignacion = 1, RULE_variable = 2, RULE_include = 3, 
		RULE_tipo = 4, RULE_funcionwhile = 5, RULE_funcionfor = 6, RULE_condicionales = 7, 
		RULE_funcionif = 8, RULE_nombrecond = 9, RULE_caracteresespeciales = 10, 
		RULE_numeros = 11, RULE_entero = 12, RULE_flotante = 13, RULE_devolver = 14, 
		RULE_codigo = 15, RULE_func = 16, RULE_crearfuncion = 17, RULE_llamarfuncion = 18, 
		RULE_expr = 19, RULE_exprlog = 20, RULE_comentarios = 21;
	public static final String[] ruleNames = {
		"prog", "asignacion", "variable", "include", "tipo", "funcionwhile", "funcionfor", 
		"condicionales", "funcionif", "nombrecond", "caracteresespeciales", "numeros", 
		"entero", "flotante", "devolver", "codigo", "func", "crearfuncion", "llamarfuncion", 
		"expr", "exprlog", "comentarios"
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

	@Override
	public String getGrammarFileName() { return "gramaticapei.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticapeiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << INCLUDE) | (1L << FUNCTION) | (1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << IFELSE) | (1L << CADENA) | (1L << NEWLINE) | (1L << ID) | (1L << DIGITO) | (1L << PI) | (1L << COMENTARIO_LINEA) | (1L << COMENTARIO_LINEA2) | (1L << COMENTARIO_BLOQUE1) | (1L << COMENTARIO_BLOQUE2))) != 0) );
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
		public TerminalNode ID() { return getToken(gramaticapeiParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_asignacion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(63);
				tipo();
				}
			}

			setState(66);
			match(ID);
			setState(67);
			match(T__0);
			setState(68);
			expr(0);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(69);
				match(T__1);
				}
			}

			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					match(NEWLINE);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public TerminalNode ID() { return getToken(gramaticapeiParser.ID, 0); }
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(78);
				tipo();
				}
			}

			setState(81);
			match(ID);
			setState(82);
			match(T__0);
			setState(83);
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

	public static class IncludeContext extends ParserRuleContext {
		public List<TerminalNode> INCLUDE() { return getTokens(gramaticapeiParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(gramaticapeiParser.INCLUDE, i);
		}
		public List<TerminalNode> ID() { return getTokens(gramaticapeiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticapeiParser.ID, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_include);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(85);
				match(INCLUDE);
				setState(86);
				match(ID);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(87);
					match(T__2);
					setState(88);
					match(ID);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				match(T__1);
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						match(NEWLINE);
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				}
				setState(105);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TIPONUMERO() { return getToken(gramaticapeiParser.TIPONUMERO, 0); }
		public TerminalNode TIPOCADENA() { return getToken(gramaticapeiParser.TIPOCADENA, 0); }
		public TerminalNode TIPOVOID() { return getToken(gramaticapeiParser.TIPOVOID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
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
		public TerminalNode WHILE() { return getToken(gramaticapeiParser.WHILE, 0); }
		public TerminalNode PI() { return getToken(gramaticapeiParser.PI, 0); }
		public ExprlogContext exprlog() {
			return getRuleContext(ExprlogContext.class,0);
		}
		public TerminalNode PD() { return getToken(gramaticapeiParser.PD, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public FuncionwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionwhile; }
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
		public TerminalNode FOR() { return getToken(gramaticapeiParser.FOR, 0); }
		public TerminalNode PI() { return getToken(gramaticapeiParser.PI, 0); }
		public TerminalNode PD() { return getToken(gramaticapeiParser.PD, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(gramaticapeiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticapeiParser.ID, i);
		}
		public ExprlogContext exprlog() {
			return getRuleContext(ExprlogContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public FuncionforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionfor; }
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
			match(T__1);
			setState(126);
			exprlog();
			}
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(128);
				match(T__1);
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
				case T__3:
					{
					{
					setState(131);
					match(T__3);
					setState(132);
					match(T__3);
					}
					}
					break;
				case T__4:
					{
					{
					setState(133);
					match(T__4);
					setState(134);
					match(T__4);
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

	public static class CondicionalesContext extends ParserRuleContext {
		public NombrecondContext nombrecond() {
			return getRuleContext(NombrecondContext.class,0);
		}
		public TerminalNode PI() { return getToken(gramaticapeiParser.PI, 0); }
		public ExprlogContext exprlog() {
			return getRuleContext(ExprlogContext.class,0);
		}
		public TerminalNode PD() { return getToken(gramaticapeiParser.PD, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public CondicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionales; }
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			nombrecond();
			setState(148);
			match(PI);
			setState(149);
			exprlog();
			setState(150);
			match(PD);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				match(NEWLINE);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(156);
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

	public static class FuncionifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gramaticapeiParser.IF, 0); }
		public TerminalNode PI() { return getToken(gramaticapeiParser.PI, 0); }
		public ExprlogContext exprlog() {
			return getRuleContext(ExprlogContext.class,0);
		}
		public TerminalNode PD() { return getToken(gramaticapeiParser.PD, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public FuncionifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionif; }
	}

	public final FuncionifContext funcionif() throws RecognitionException {
		FuncionifContext _localctx = new FuncionifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcionif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IF);
			setState(159);
			match(PI);
			setState(160);
			exprlog();
			setState(161);
			match(PD);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				match(NEWLINE);
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(167);
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

	public static class NombrecondContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gramaticapeiParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(gramaticapeiParser.ELSE, 0); }
		public TerminalNode IFELSE() { return getToken(gramaticapeiParser.IFELSE, 0); }
		public NombrecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrecond; }
	}

	public final NombrecondContext nombrecond() throws RecognitionException {
		NombrecondContext _localctx = new NombrecondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nombrecond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << IFELSE))) != 0)) ) {
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

	public static class CaracteresespecialesContext extends ParserRuleContext {
		public CaracteresespecialesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteresespeciales; }
	}

	public final CaracteresespecialesContext caracteresespeciales() throws RecognitionException {
		CaracteresespecialesContext _localctx = new CaracteresespecialesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caracteresespeciales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
	}

	public final NumerosContext numeros() throws RecognitionException {
		NumerosContext _localctx = new NumerosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numeros);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		public List<TerminalNode> DIGITO() { return getTokens(gramaticapeiParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(gramaticapeiParser.DIGITO, i);
		}
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(177);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public List<TerminalNode> DIGITO() { return getTokens(gramaticapeiParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(gramaticapeiParser.DIGITO, i);
		}
		public FlotanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotante; }
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_flotante);
		int _la;
		try {
			int _alt;
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					match(DIGITO);
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
				setState(187);
				match(T__2);
				setState(189); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(188);
						match(DIGITO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(191); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(T__2);
				setState(195); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(194);
						match(DIGITO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(197); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public TerminalNode DEVOLVER() { return getToken(gramaticapeiParser.DEVOLVER, 0); }
		public TerminalNode PI() { return getToken(gramaticapeiParser.PI, 0); }
		public TerminalNode PD() { return getToken(gramaticapeiParser.PD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LlamarfuncionContext llamarfuncion() {
			return getRuleContext(LlamarfuncionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public DevolverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_devolver; }
	}

	public final DevolverContext devolver() throws RecognitionException {
		DevolverContext _localctx = new DevolverContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_devolver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(DEVOLVER);
			setState(202);
			match(PI);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(203);
				expr(0);
				}
				break;
			case 2:
				{
				setState(204);
				llamarfuncion();
				}
				break;
			}
			setState(207);
			match(PD);
			setState(208);
			match(T__1);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(209);
				match(NEWLINE);
				}
				}
				setState(214);
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
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(215);
				asignacion();
				}
				break;
			case 2:
				{
				setState(216);
				llamarfuncion();
				}
				break;
			case 3:
				{
				setState(217);
				funcionwhile();
				}
				break;
			case 4:
				{
				setState(218);
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
		public TerminalNode BEGIN() { return getToken(gramaticapeiParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(gramaticapeiParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
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
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(BEGIN);
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				match(NEWLINE);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << IFELSE) | (1L << ID))) != 0)) {
				{
				{
				setState(227);
				codigo();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(228);
					match(NEWLINE);
					}
				}

				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEVOLVER) {
				{
				setState(236);
				devolver();
				}
			}

			setState(239);
			match(END);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					match(NEWLINE);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode FUNCTION() { return getToken(gramaticapeiParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(gramaticapeiParser.ID, 0); }
		public TerminalNode PI() { return getToken(gramaticapeiParser.PI, 0); }
		public TerminalNode PD() { return getToken(gramaticapeiParser.PD, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public CrearfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearfuncion; }
	}

	public final CrearfuncionContext crearfuncion() throws RecognitionException {
		CrearfuncionContext _localctx = new CrearfuncionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_crearfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(FUNCTION);
			setState(247);
			match(ID);
			setState(248);
			match(PI);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPONUMERO) | (1L << TIPOCADENA) | (1L << TIPOVOID))) != 0)) {
				{
				setState(249);
				tipo();
				setState(250);
				expr(0);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(251);
					match(T__16);
					setState(252);
					tipo();
					setState(253);
					expr(0);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(262);
			match(PD);
			setState(263);
			match(T__17);
			setState(264);
			tipo();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(265);
				match(NEWLINE);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
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
		public TerminalNode ID() { return getToken(gramaticapeiParser.ID, 0); }
		public TerminalNode PI() { return getToken(gramaticapeiParser.PI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PD() { return getToken(gramaticapeiParser.PD, 0); }
		public FuncionforContext funcionfor() {
			return getRuleContext(FuncionforContext.class,0);
		}
		public FuncionwhileContext funcionwhile() {
			return getRuleContext(FuncionwhileContext.class,0);
		}
		public CondicionalesContext condicionales() {
			return getRuleContext(CondicionalesContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public LlamarfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamarfuncion; }
	}

	public final LlamarfuncionContext llamarfuncion() throws RecognitionException {
		LlamarfuncionContext _localctx = new LlamarfuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_llamarfuncion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(273);
				match(ID);
				setState(274);
				match(PI);
				setState(275);
				expr(0);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(276);
					match(T__16);
					setState(277);
					expr(0);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(PD);
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(284);
					match(T__1);
					}
					break;
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(287);
						match(NEWLINE);
						}
						} 
					}
					setState(292);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case FOR:
				{
				setState(293);
				funcionfor();
				}
				break;
			case WHILE:
				{
				setState(294);
				funcionwhile();
				}
				break;
			case IF:
			case ELSE:
			case IFELSE:
				{
				setState(295);
				condicionales();
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

	public static class ExprContext extends ParserRuleContext {
		public LlamarfuncionContext llamarfuncion() {
			return getRuleContext(LlamarfuncionContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticapeiParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(gramaticapeiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramaticapeiParser.NEWLINE, i);
		}
		public TerminalNode CADENA() { return getToken(gramaticapeiParser.CADENA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NumerosContext numeros() {
			return getRuleContext(NumerosContext.class,0);
		}
		public TerminalNode PI() { return getToken(gramaticapeiParser.PI, 0); }
		public TerminalNode PD() { return getToken(gramaticapeiParser.PD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
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
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(299);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(300);
				match(ID);
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(301);
						match(NEWLINE);
						}
						} 
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(307);
				match(CADENA);
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						match(NEWLINE);
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314);
						match(T__3);
						setState(315);
						expr(0);
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(321);
				numeros();
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(322);
						match(NEWLINE);
						}
						} 
					}
					setState(327);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case 5:
				{
				setState(328);
				match(PI);
				setState(329);
				expr(0);
				setState(330);
				match(PD);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(335);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(338);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(339);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public ExprlogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlog; }
	}

	public final ExprlogContext exprlog() throws RecognitionException {
		ExprlogContext _localctx = new ExprlogContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprlog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			expr(0);
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(347);
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
		public TerminalNode COMENTARIO_LINEA() { return getToken(gramaticapeiParser.COMENTARIO_LINEA, 0); }
		public TerminalNode COMENTARIO_BLOQUE1() { return getToken(gramaticapeiParser.COMENTARIO_BLOQUE1, 0); }
		public TerminalNode COMENTARIO_BLOQUE2() { return getToken(gramaticapeiParser.COMENTARIO_BLOQUE2, 0); }
		public TerminalNode COMENTARIO_LINEA2() { return getToken(gramaticapeiParser.COMENTARIO_LINEA2, 0); }
		public ComentariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentarios; }
	}

	public final ComentariosContext comentarios() throws RecognitionException {
		ComentariosContext _localctx = new ComentariosContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comentarios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0162\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\2\3\2\3\2\5\2:\n\2\3\2\3\2\6\2>\n\2\r\2\16\2?"+
		"\3\3\5\3C\n\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\4"+
		"\5\4R\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5"+
		"\3\5\7\5c\n\5\f\5\16\5f\13\5\7\5h\n\5\f\5\16\5k\13\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\6\7t\n\7\r\7\16\7u\3\7\3\7\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\5\b\u008c\n\b\3\b\3\b\6"+
		"\b\u0090\n\b\r\b\16\b\u0091\3\b\3\b\3\t\3\t\3\t\3\t\3\t\6\t\u009b\n\t"+
		"\r\t\16\t\u009c\3\t\3\t\3\n\3\n\3\n\3\n\3\n\6\n\u00a6\n\n\r\n\16\n\u00a7"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u00b2\n\r\3\16\6\16\u00b5\n\16"+
		"\r\16\16\16\u00b6\3\17\6\17\u00ba\n\17\r\17\16\17\u00bb\3\17\3\17\6\17"+
		"\u00c0\n\17\r\17\16\17\u00c1\3\17\3\17\6\17\u00c6\n\17\r\17\16\17\u00c7"+
		"\5\17\u00ca\n\17\3\20\3\20\3\20\3\20\5\20\u00d0\n\20\3\20\3\20\3\20\7"+
		"\20\u00d5\n\20\f\20\16\20\u00d8\13\20\3\21\3\21\3\21\3\21\5\21\u00de\n"+
		"\21\3\22\3\22\6\22\u00e2\n\22\r\22\16\22\u00e3\3\22\3\22\5\22\u00e8\n"+
		"\22\7\22\u00ea\n\22\f\22\16\22\u00ed\13\22\3\22\5\22\u00f0\n\22\3\22\3"+
		"\22\7\22\u00f4\n\22\f\22\16\22\u00f7\13\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\7\23\u0102\n\23\f\23\16\23\u0105\13\23\5\23\u0107\n"+
		"\23\3\23\3\23\3\23\3\23\7\23\u010d\n\23\f\23\16\23\u0110\13\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\7\24\u0119\n\24\f\24\16\24\u011c\13\24\3"+
		"\24\3\24\5\24\u0120\n\24\3\24\7\24\u0123\n\24\f\24\16\24\u0126\13\24\3"+
		"\24\3\24\3\24\5\24\u012b\n\24\3\25\3\25\3\25\3\25\7\25\u0131\n\25\f\25"+
		"\16\25\u0134\13\25\3\25\3\25\7\25\u0138\n\25\f\25\16\25\u013b\13\25\3"+
		"\25\3\25\7\25\u013f\n\25\f\25\16\25\u0142\13\25\3\25\3\25\7\25\u0146\n"+
		"\25\f\25\16\25\u0149\13\25\3\25\3\25\3\25\3\25\5\25\u014f\n\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u0157\n\25\f\25\16\25\u015a\13\25\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\2\3(\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\t\3\2\37!\3\2(*\3\2\b\22\3\2\25\26\3\2\6\7\3\2\27\34"+
		"\3\2\61\64\2\u0183\2=\3\2\2\2\4B\3\2\2\2\6Q\3\2\2\2\bi\3\2\2\2\nl\3\2"+
		"\2\2\fn\3\2\2\2\16y\3\2\2\2\20\u0095\3\2\2\2\22\u00a0\3\2\2\2\24\u00ab"+
		"\3\2\2\2\26\u00ad\3\2\2\2\30\u00b1\3\2\2\2\32\u00b4\3\2\2\2\34\u00c9\3"+
		"\2\2\2\36\u00cb\3\2\2\2 \u00dd\3\2\2\2\"\u00df\3\2\2\2$\u00f8\3\2\2\2"+
		"&\u012a\3\2\2\2(\u014e\3\2\2\2*\u015b\3\2\2\2,\u015f\3\2\2\2.\60\7,\2"+
		"\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\629\3\2\2\2\63\61"+
		"\3\2\2\2\64:\5\b\5\2\65:\5(\25\2\66:\5\4\3\2\67:\5$\23\28:\5,\27\29\64"+
		"\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;<\7,"+
		"\2\2<>\3\2\2\2=\61\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2AC"+
		"\5\n\6\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7-\2\2EF\7\3\2\2FH\5(\25\2GI"+
		"\7\4\2\2HG\3\2\2\2HI\3\2\2\2IM\3\2\2\2JL\7,\2\2KJ\3\2\2\2LO\3\2\2\2MK"+
		"\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OM\3\2\2\2PR\5\n\6\2QP\3\2\2\2QR\3\2\2\2"+
		"RS\3\2\2\2ST\7-\2\2TU\7\3\2\2UV\5(\25\2V\7\3\2\2\2WX\7\35\2\2X]\7-\2\2"+
		"YZ\7\5\2\2Z\\\7-\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2"+
		"\2_]\3\2\2\2`d\7\4\2\2ac\7,\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2"+
		"\2eh\3\2\2\2fd\3\2\2\2gW\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\t\3\2"+
		"\2\2ki\3\2\2\2lm\t\2\2\2m\13\3\2\2\2no\7&\2\2op\7/\2\2pq\5*\26\2qs\7\60"+
		"\2\2rt\7,\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\""+
		"\22\2x\r\3\2\2\2yz\7\'\2\2z}\7/\2\2{~\5\6\4\2|~\7-\2\2}{\3\2\2\2}|\3\2"+
		"\2\2~\177\3\2\2\2\177\u0080\7\4\2\2\u0080\u0081\5*\26\2\u0081\u008b\3"+
		"\2\2\2\u0082\u0083\7\4\2\2\u0083\u008c\5\6\4\2\u0084\u0089\7-\2\2\u0085"+
		"\u0086\7\6\2\2\u0086\u008a\7\6\2\2\u0087\u0088\7\7\2\2\u0088\u008a\7\7"+
		"\2\2\u0089\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0082\3\2\2\2\u008b\u0084\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7\60"+
		"\2\2\u008e\u0090\7,\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5\""+
		"\22\2\u0094\17\3\2\2\2\u0095\u0096\5\24\13\2\u0096\u0097\7/\2\2\u0097"+
		"\u0098\5*\26\2\u0098\u009a\7\60\2\2\u0099\u009b\7,\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\5\"\22\2\u009f\21\3\2\2\2\u00a0\u00a1\7(\2"+
		"\2\u00a1\u00a2\7/\2\2\u00a2\u00a3\5*\26\2\u00a3\u00a5\7\60\2\2\u00a4\u00a6"+
		"\7,\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5\"\22\2\u00aa\23\3\2\2"+
		"\2\u00ab\u00ac\t\3\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\t\4\2\2\u00ae\27\3"+
		"\2\2\2\u00af\u00b2\5\32\16\2\u00b0\u00b2\5\34\17\2\u00b1\u00af\3\2\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b5\7.\2\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\33\3\2\2\2\u00b8\u00ba\7.\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf"+
		"\7\5\2\2\u00be\u00c0\7.\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00ca\3\2\2\2\u00c3\u00c5\7\5"+
		"\2\2\u00c4\u00c6\7.\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00b9\3\2"+
		"\2\2\u00c9\u00c3\3\2\2\2\u00ca\35\3\2\2\2\u00cb\u00cc\7%\2\2\u00cc\u00cf"+
		"\7/\2\2\u00cd\u00d0\5(\25\2\u00ce\u00d0\5&\24\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\60"+
		"\2\2\u00d2\u00d6\7\4\2\2\u00d3\u00d5\7,\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\37\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d9\u00de\5\4\3\2\u00da\u00de\5&\24\2\u00db\u00de"+
		"\5\f\7\2\u00dc\u00de\5\16\b\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de!\3\2\2\2\u00df\u00e1\7"+
		"\"\2\2\u00e0\u00e2\7,\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00eb\3\2\2\2\u00e5\u00e7\5 "+
		"\21\2\u00e6\u00e8\7,\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\5\36\20\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f1\u00f5\7#\2\2\u00f2\u00f4\7,\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6#\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\36\2\2\u00f9\u00fa\7-\2\2\u00fa\u0106"+
		"\7/\2\2\u00fb\u00fc\5\n\6\2\u00fc\u0103\5(\25\2\u00fd\u00fe\7\23\2\2\u00fe"+
		"\u00ff\5\n\6\2\u00ff\u0100\5(\25\2\u0100\u0102\3\2\2\2\u0101\u00fd\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u00fb\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\60\2\2\u0109\u010a\7\24\2\2\u010a"+
		"\u010e\5\n\6\2\u010b\u010d\7,\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0112\5\"\22\2\u0112%\3\2\2\2\u0113\u0114\7-\2\2"+
		"\u0114\u0115\7/\2\2\u0115\u011a\5(\25\2\u0116\u0117\7\23\2\2\u0117\u0119"+
		"\5(\25\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\7\60"+
		"\2\2\u011e\u0120\7\4\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0124\3\2\2\2\u0121\u0123\7,\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012b\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u012b\5\16\b\2\u0128\u012b\5\f\7\2\u0129\u012b\5"+
		"\20\t\2\u012a\u0113\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\'\3\2\2\2\u012c\u012d\b\25\1\2\u012d\u014f\5&\24"+
		"\2\u012e\u0132\7-\2\2\u012f\u0131\7,\2\2\u0130\u012f\3\2\2\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u014f\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0139\7+\2\2\u0136\u0138\7,\2\2\u0137\u0136\3\2\2"+
		"\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0140"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\6\2\2\u013d\u013f\5(\25\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u014f\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0147\5\30\r\2\u0144"+
		"\u0146\7,\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014f\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\7/\2\2\u014b\u014c\5(\25\2\u014c\u014d\7\60\2\2\u014d\u014f\3\2"+
		"\2\2\u014e\u012c\3\2\2\2\u014e\u012e\3\2\2\2\u014e\u0135\3\2\2\2\u014e"+
		"\u0143\3\2\2\2\u014e\u014a\3\2\2\2\u014f\u0158\3\2\2\2\u0150\u0151\f\t"+
		"\2\2\u0151\u0152\t\5\2\2\u0152\u0157\5(\25\n\u0153\u0154\f\b\2\2\u0154"+
		"\u0155\t\6\2\2\u0155\u0157\5(\25\t\u0156\u0150\3\2\2\2\u0156\u0153\3\2"+
		"\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		")\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\5(\25\2\u015c\u015d\t\7\2\2"+
		"\u015d\u015e\5(\25\2\u015e+\3\2\2\2\u015f\u0160\t\b\2\2\u0160-\3\2\2\2"+
		"/\619?BHMQ]diu}\u0089\u008b\u0091\u009c\u00a7\u00b1\u00b6\u00bb\u00c1"+
		"\u00c7\u00c9\u00cf\u00d6\u00dd\u00e3\u00e7\u00eb\u00ef\u00f5\u0103\u0106"+
		"\u010e\u011a\u011f\u0124\u012a\u0132\u0139\u0140\u0147\u014e\u0156\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}