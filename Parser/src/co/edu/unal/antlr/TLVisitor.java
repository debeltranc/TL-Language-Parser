package co.edu.unal.antlr;
// Generated from TL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(TLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#from_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_input(TLParser.From_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#from_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_file(TLParser.From_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TLParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#compound_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stat(TLParser.Compound_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#simple_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stat(TLParser.Simple_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(TLParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(TLParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(TLParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(TLParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(TLParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(TLParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#importar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportar(TLParser.ImportarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#retornar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornar(TLParser.RetornarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(TLParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(TLParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(TLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#accessarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessarray(TLParser.AccessarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(TLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(TLParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#aritmethicalexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmethicalexpr(TLParser.AritmethicalexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#booleanexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanexpr(TLParser.BooleanexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(TLParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura(TLParser.EstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#keyvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyvalue(TLParser.KeyvalueContext ctx);
}