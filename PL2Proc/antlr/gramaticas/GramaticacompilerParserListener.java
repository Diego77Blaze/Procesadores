// Generated from GramaticacompilerParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticacompilerParser}.
 */
public interface GramaticacompilerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GramaticacompilerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GramaticacompilerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(GramaticacompilerParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(GramaticacompilerParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(GramaticacompilerParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(GramaticacompilerParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GramaticacompilerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GramaticacompilerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#funcionwhile}.
	 * @param ctx the parse tree
	 */
	void enterFuncionwhile(GramaticacompilerParser.FuncionwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#funcionwhile}.
	 * @param ctx the parse tree
	 */
	void exitFuncionwhile(GramaticacompilerParser.FuncionwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#funcionfor}.
	 * @param ctx the parse tree
	 */
	void enterFuncionfor(GramaticacompilerParser.FuncionforContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#funcionfor}.
	 * @param ctx the parse tree
	 */
	void exitFuncionfor(GramaticacompilerParser.FuncionforContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterCondicionales(GramaticacompilerParser.CondicionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitCondicionales(GramaticacompilerParser.CondicionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#numeros}.
	 * @param ctx the parse tree
	 */
	void enterNumeros(GramaticacompilerParser.NumerosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#numeros}.
	 * @param ctx the parse tree
	 */
	void exitNumeros(GramaticacompilerParser.NumerosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#devolver}.
	 * @param ctx the parse tree
	 */
	void enterDevolver(GramaticacompilerParser.DevolverContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#devolver}.
	 * @param ctx the parse tree
	 */
	void exitDevolver(GramaticacompilerParser.DevolverContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(GramaticacompilerParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(GramaticacompilerParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(GramaticacompilerParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(GramaticacompilerParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#cabecerafuncion}.
	 * @param ctx the parse tree
	 */
	void enterCabecerafuncion(GramaticacompilerParser.CabecerafuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#cabecerafuncion}.
	 * @param ctx the parse tree
	 */
	void exitCabecerafuncion(GramaticacompilerParser.CabecerafuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#tiporetorno}.
	 * @param ctx the parse tree
	 */
	void enterTiporetorno(GramaticacompilerParser.TiporetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#tiporetorno}.
	 * @param ctx the parse tree
	 */
	void exitTiporetorno(GramaticacompilerParser.TiporetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#crearfuncion}.
	 * @param ctx the parse tree
	 */
	void enterCrearfuncion(GramaticacompilerParser.CrearfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#crearfuncion}.
	 * @param ctx the parse tree
	 */
	void exitCrearfuncion(GramaticacompilerParser.CrearfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#llamarfuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamarfuncion(GramaticacompilerParser.LlamarfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#llamarfuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamarfuncion(GramaticacompilerParser.LlamarfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GramaticacompilerParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GramaticacompilerParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GramaticacompilerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GramaticacompilerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#exprlog}.
	 * @param ctx the parse tree
	 */
	void enterExprlog(GramaticacompilerParser.ExprlogContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#exprlog}.
	 * @param ctx the parse tree
	 */
	void exitExprlog(GramaticacompilerParser.ExprlogContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GramaticacompilerParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GramaticacompilerParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#asignador}.
	 * @param ctx the parse tree
	 */
	void enterAsignador(GramaticacompilerParser.AsignadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#asignador}.
	 * @param ctx the parse tree
	 */
	void exitAsignador(GramaticacompilerParser.AsignadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(GramaticacompilerParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(GramaticacompilerParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#flotante}.
	 * @param ctx the parse tree
	 */
	void enterFlotante(GramaticacompilerParser.FlotanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#flotante}.
	 * @param ctx the parse tree
	 */
	void exitFlotante(GramaticacompilerParser.FlotanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#nombrevariable}.
	 * @param ctx the parse tree
	 */
	void enterNombrevariable(GramaticacompilerParser.NombrevariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#nombrevariable}.
	 * @param ctx the parse tree
	 */
	void exitNombrevariable(GramaticacompilerParser.NombrevariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#nombrefuncion}.
	 * @param ctx the parse tree
	 */
	void enterNombrefuncion(GramaticacompilerParser.NombrefuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#nombrefuncion}.
	 * @param ctx the parse tree
	 */
	void exitNombrefuncion(GramaticacompilerParser.NombrefuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#nomlib}.
	 * @param ctx the parse tree
	 */
	void enterNomlib(GramaticacompilerParser.NomlibContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#nomlib}.
	 * @param ctx the parse tree
	 */
	void exitNomlib(GramaticacompilerParser.NomlibContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#punto}.
	 * @param ctx the parse tree
	 */
	void enterPunto(GramaticacompilerParser.PuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#punto}.
	 * @param ctx the parse tree
	 */
	void exitPunto(GramaticacompilerParser.PuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#puntocoma}.
	 * @param ctx the parse tree
	 */
	void enterPuntocoma(GramaticacompilerParser.PuntocomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#puntocoma}.
	 * @param ctx the parse tree
	 */
	void exitPuntocoma(GramaticacompilerParser.PuntocomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(GramaticacompilerParser.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(GramaticacompilerParser.ComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#dospuntos}.
	 * @param ctx the parse tree
	 */
	void enterDospuntos(GramaticacompilerParser.DospuntosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#dospuntos}.
	 * @param ctx the parse tree
	 */
	void exitDospuntos(GramaticacompilerParser.DospuntosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#abrirparentesis}.
	 * @param ctx the parse tree
	 */
	void enterAbrirparentesis(GramaticacompilerParser.AbrirparentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#abrirparentesis}.
	 * @param ctx the parse tree
	 */
	void exitAbrirparentesis(GramaticacompilerParser.AbrirparentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#cerrarparentesis}.
	 * @param ctx the parse tree
	 */
	void enterCerrarparentesis(GramaticacompilerParser.CerrarparentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#cerrarparentesis}.
	 * @param ctx the parse tree
	 */
	void exitCerrarparentesis(GramaticacompilerParser.CerrarparentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#add1}.
	 * @param ctx the parse tree
	 */
	void enterAdd1(GramaticacompilerParser.Add1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#add1}.
	 * @param ctx the parse tree
	 */
	void exitAdd1(GramaticacompilerParser.Add1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#substract1}.
	 * @param ctx the parse tree
	 */
	void enterSubstract1(GramaticacompilerParser.Substract1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#substract1}.
	 * @param ctx the parse tree
	 */
	void exitSubstract1(GramaticacompilerParser.Substract1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(GramaticacompilerParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(GramaticacompilerParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#opsuma}.
	 * @param ctx the parse tree
	 */
	void enterOpsuma(GramaticacompilerParser.OpsumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#opsuma}.
	 * @param ctx the parse tree
	 */
	void exitOpsuma(GramaticacompilerParser.OpsumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#opresta}.
	 * @param ctx the parse tree
	 */
	void enterOpresta(GramaticacompilerParser.OprestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#opresta}.
	 * @param ctx the parse tree
	 */
	void exitOpresta(GramaticacompilerParser.OprestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#opmult}.
	 * @param ctx the parse tree
	 */
	void enterOpmult(GramaticacompilerParser.OpmultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#opmult}.
	 * @param ctx the parse tree
	 */
	void exitOpmult(GramaticacompilerParser.OpmultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#opdiv}.
	 * @param ctx the parse tree
	 */
	void enterOpdiv(GramaticacompilerParser.OpdivContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#opdiv}.
	 * @param ctx the parse tree
	 */
	void exitOpdiv(GramaticacompilerParser.OpdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(GramaticacompilerParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(GramaticacompilerParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#keywordinclude}.
	 * @param ctx the parse tree
	 */
	void enterKeywordinclude(GramaticacompilerParser.KeywordincludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#keywordinclude}.
	 * @param ctx the parse tree
	 */
	void exitKeywordinclude(GramaticacompilerParser.KeywordincludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#keywordwhile}.
	 * @param ctx the parse tree
	 */
	void enterKeywordwhile(GramaticacompilerParser.KeywordwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#keywordwhile}.
	 * @param ctx the parse tree
	 */
	void exitKeywordwhile(GramaticacompilerParser.KeywordwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#keywordfor}.
	 * @param ctx the parse tree
	 */
	void enterKeywordfor(GramaticacompilerParser.KeywordforContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#keywordfor}.
	 * @param ctx the parse tree
	 */
	void exitKeywordfor(GramaticacompilerParser.KeywordforContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#keywordcond}.
	 * @param ctx the parse tree
	 */
	void enterKeywordcond(GramaticacompilerParser.KeywordcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#keywordcond}.
	 * @param ctx the parse tree
	 */
	void exitKeywordcond(GramaticacompilerParser.KeywordcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#keywordmain}.
	 * @param ctx the parse tree
	 */
	void enterKeywordmain(GramaticacompilerParser.KeywordmainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#keywordmain}.
	 * @param ctx the parse tree
	 */
	void exitKeywordmain(GramaticacompilerParser.KeywordmainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#keywordfunc}.
	 * @param ctx the parse tree
	 */
	void enterKeywordfunc(GramaticacompilerParser.KeywordfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#keywordfunc}.
	 * @param ctx the parse tree
	 */
	void exitKeywordfunc(GramaticacompilerParser.KeywordfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#keywordreturn}.
	 * @param ctx the parse tree
	 */
	void enterKeywordreturn(GramaticacompilerParser.KeywordreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#keywordreturn}.
	 * @param ctx the parse tree
	 */
	void exitKeywordreturn(GramaticacompilerParser.KeywordreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#keywordbegin}.
	 * @param ctx the parse tree
	 */
	void enterKeywordbegin(GramaticacompilerParser.KeywordbeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#keywordbegin}.
	 * @param ctx the parse tree
	 */
	void exitKeywordbegin(GramaticacompilerParser.KeywordbeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticacompilerParser#keywordend}.
	 * @param ctx the parse tree
	 */
	void enterKeywordend(GramaticacompilerParser.KeywordendContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#keywordend}.
	 * @param ctx the parse tree
	 */
	void exitKeywordend(GramaticacompilerParser.KeywordendContext ctx);
}