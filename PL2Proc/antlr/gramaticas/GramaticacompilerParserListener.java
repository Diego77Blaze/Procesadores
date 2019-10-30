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
	 * Enter a parse tree produced by {@link GramaticacompilerParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(GramaticacompilerParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(GramaticacompilerParser.ParametroContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticacompilerParser#comentarios}.
	 * @param ctx the parse tree
	 */
	void enterComentarios(GramaticacompilerParser.ComentariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticacompilerParser#comentarios}.
	 * @param ctx the parse tree
	 */
	void exitComentarios(GramaticacompilerParser.ComentariosContext ctx);
}