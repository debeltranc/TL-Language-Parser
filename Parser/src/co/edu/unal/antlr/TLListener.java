package co.edu.unal.antlr;
// Generated from TL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLParser}.
 */
public interface TLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(TLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(TLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#from_input}.
	 * @param ctx the parse tree
	 */
	void enterFrom_input(TLParser.From_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#from_input}.
	 * @param ctx the parse tree
	 */
	void exitFrom_input(TLParser.From_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#from_file}.
	 * @param ctx the parse tree
	 */
	void enterFrom_file(TLParser.From_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#from_file}.
	 * @param ctx the parse tree
	 */
	void exitFrom_file(TLParser.From_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#compound_stat}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stat(TLParser.Compound_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#compound_stat}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stat(TLParser.Compound_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#simple_stat}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stat(TLParser.Simple_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#simple_stat}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stat(TLParser.Simple_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(TLParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(TLParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(TLParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(TLParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(TLParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(TLParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(TLParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(TLParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(TLParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(TLParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(TLParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(TLParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#importar}.
	 * @param ctx the parse tree
	 */
	void enterImportar(TLParser.ImportarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#importar}.
	 * @param ctx the parse tree
	 */
	void exitImportar(TLParser.ImportarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#retornar}.
	 * @param ctx the parse tree
	 */
	void enterRetornar(TLParser.RetornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#retornar}.
	 * @param ctx the parse tree
	 */
	void exitRetornar(TLParser.RetornarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(TLParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(TLParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(TLParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(TLParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(TLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(TLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#accessarray}.
	 * @param ctx the parse tree
	 */
	void enterAccessarray(TLParser.AccessarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#accessarray}.
	 * @param ctx the parse tree
	 */
	void exitAccessarray(TLParser.AccessarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(TLParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(TLParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#aritmethicalexpr}.
	 * @param ctx the parse tree
	 */
	void enterAritmethicalexpr(TLParser.AritmethicalexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#aritmethicalexpr}.
	 * @param ctx the parse tree
	 */
	void exitAritmethicalexpr(TLParser.AritmethicalexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#booleanexpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexpr(TLParser.BooleanexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#booleanexpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexpr(TLParser.BooleanexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(TLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(TLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(TLParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(TLParser.EstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalue(TLParser.KeyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalue(TLParser.KeyvalueContext ctx);
}