// Generated from .\gramaticapei.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticapeiParser}.
 */
public interface gramaticapeiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gramaticapeiParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gramaticapeiParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(gramaticapeiParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(gramaticapeiParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(gramaticapeiParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(gramaticapeiParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(gramaticapeiParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(gramaticapeiParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gramaticapeiParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gramaticapeiParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#funcionwhile}.
	 * @param ctx the parse tree
	 */
	void enterFuncionwhile(gramaticapeiParser.FuncionwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#funcionwhile}.
	 * @param ctx the parse tree
	 */
	void exitFuncionwhile(gramaticapeiParser.FuncionwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#funcionfor}.
	 * @param ctx the parse tree
	 */
	void enterFuncionfor(gramaticapeiParser.FuncionforContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#funcionfor}.
	 * @param ctx the parse tree
	 */
	void exitFuncionfor(gramaticapeiParser.FuncionforContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterCondicionales(gramaticapeiParser.CondicionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitCondicionales(gramaticapeiParser.CondicionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#funcionif}.
	 * @param ctx the parse tree
	 */
	void enterFuncionif(gramaticapeiParser.FuncionifContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#funcionif}.
	 * @param ctx the parse tree
	 */
	void exitFuncionif(gramaticapeiParser.FuncionifContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#nombrecond}.
	 * @param ctx the parse tree
	 */
	void enterNombrecond(gramaticapeiParser.NombrecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#nombrecond}.
	 * @param ctx the parse tree
	 */
	void exitNombrecond(gramaticapeiParser.NombrecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#caracteresespeciales}.
	 * @param ctx the parse tree
	 */
	void enterCaracteresespeciales(gramaticapeiParser.CaracteresespecialesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#caracteresespeciales}.
	 * @param ctx the parse tree
	 */
	void exitCaracteresespeciales(gramaticapeiParser.CaracteresespecialesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#numeros}.
	 * @param ctx the parse tree
	 */
	void enterNumeros(gramaticapeiParser.NumerosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#numeros}.
	 * @param ctx the parse tree
	 */
	void exitNumeros(gramaticapeiParser.NumerosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(gramaticapeiParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(gramaticapeiParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#flotante}.
	 * @param ctx the parse tree
	 */
	void enterFlotante(gramaticapeiParser.FlotanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#flotante}.
	 * @param ctx the parse tree
	 */
	void exitFlotante(gramaticapeiParser.FlotanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#devolver}.
	 * @param ctx the parse tree
	 */
	void enterDevolver(gramaticapeiParser.DevolverContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#devolver}.
	 * @param ctx the parse tree
	 */
	void exitDevolver(gramaticapeiParser.DevolverContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(gramaticapeiParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(gramaticapeiParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(gramaticapeiParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(gramaticapeiParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#crearfuncion}.
	 * @param ctx the parse tree
	 */
	void enterCrearfuncion(gramaticapeiParser.CrearfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#crearfuncion}.
	 * @param ctx the parse tree
	 */
	void exitCrearfuncion(gramaticapeiParser.CrearfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#llamarfuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamarfuncion(gramaticapeiParser.LlamarfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#llamarfuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamarfuncion(gramaticapeiParser.LlamarfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gramaticapeiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gramaticapeiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#exprlog}.
	 * @param ctx the parse tree
	 */
	void enterExprlog(gramaticapeiParser.ExprlogContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#exprlog}.
	 * @param ctx the parse tree
	 */
	void exitExprlog(gramaticapeiParser.ExprlogContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticapeiParser#comentarios}.
	 * @param ctx the parse tree
	 */
	void enterComentarios(gramaticapeiParser.ComentariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticapeiParser#comentarios}.
	 * @param ctx the parse tree
	 */
	void exitComentarios(gramaticapeiParser.ComentariosContext ctx);
}