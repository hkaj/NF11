// Generated from grammar/Logo.g4 by ANTLR 4.2

  package logoparsing.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull LogoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull LogoParser.MultContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(@NotNull LogoParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(@NotNull LogoParser.SubContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(@NotNull LogoParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(@NotNull LogoParser.SetContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#nequal}.
	 * @param ctx the parse tree
	 */
	void enterNequal(@NotNull LogoParser.NequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#nequal}.
	 * @param ctx the parse tree
	 */
	void exitNequal(@NotNull LogoParser.NequalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull LogoParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull LogoParser.DivContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#tg}.
	 * @param ctx the parse tree
	 */
	void enterTg(@NotNull LogoParser.TgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#tg}.
	 * @param ctx the parse tree
	 */
	void exitTg(@NotNull LogoParser.TgContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(@NotNull LogoParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(@NotNull LogoParser.RepeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#td}.
	 * @param ctx the parse tree
	 */
	void enterTd(@NotNull LogoParser.TdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#td}.
	 * @param ctx the parse tree
	 */
	void exitTd(@NotNull LogoParser.TdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull LogoParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull LogoParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#sup}.
	 * @param ctx the parse tree
	 */
	void enterSup(@NotNull LogoParser.SupContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#sup}.
	 * @param ctx the parse tree
	 */
	void exitSup(@NotNull LogoParser.SupContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#re}.
	 * @param ctx the parse tree
	 */
	void enterRe(@NotNull LogoParser.ReContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#re}.
	 * @param ctx the parse tree
	 */
	void exitRe(@NotNull LogoParser.ReContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void enterListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void exitListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull LogoParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull LogoParser.WhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull LogoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull LogoParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull LogoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull LogoParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull LogoParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull LogoParser.ParContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull LogoParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull LogoParser.IfContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#ve}.
	 * @param ctx the parse tree
	 */
	void enterVe(@NotNull LogoParser.VeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ve}.
	 * @param ctx the parse tree
	 */
	void exitVe(@NotNull LogoParser.VeContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull LogoParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull LogoParser.LoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#bc}.
	 * @param ctx the parse tree
	 */
	void enterBc(@NotNull LogoParser.BcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#bc}.
	 * @param ctx the parse tree
	 */
	void exitBc(@NotNull LogoParser.BcContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(@NotNull LogoParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(@NotNull LogoParser.ProcedureContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull LogoParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull LogoParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#inf}.
	 * @param ctx the parse tree
	 */
	void enterInf(@NotNull LogoParser.InfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#inf}.
	 * @param ctx the parse tree
	 */
	void exitInf(@NotNull LogoParser.InfContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(@NotNull LogoParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(@NotNull LogoParser.EqualContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#av}.
	 * @param ctx the parse tree
	 */
	void enterAv(@NotNull LogoParser.AvContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#av}.
	 * @param ctx the parse tree
	 */
	void exitAv(@NotNull LogoParser.AvContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(@NotNull LogoParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(@NotNull LogoParser.ProgrammeContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_functions}.
	 * @param ctx the parse tree
	 */
	void enterListe_functions(@NotNull LogoParser.Liste_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_functions}.
	 * @param ctx the parse tree
	 */
	void exitListe_functions(@NotNull LogoParser.Liste_functionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#fpos}.
	 * @param ctx the parse tree
	 */
	void enterFpos(@NotNull LogoParser.FposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#fpos}.
	 * @param ctx the parse tree
	 */
	void exitFpos(@NotNull LogoParser.FposContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#lc}.
	 * @param ctx the parse tree
	 */
	void enterLc(@NotNull LogoParser.LcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#lc}.
	 * @param ctx the parse tree
	 */
	void exitLc(@NotNull LogoParser.LcContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull LogoParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull LogoParser.FunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull LogoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull LogoParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#fcc}.
	 * @param ctx the parse tree
	 */
	void enterFcc(@NotNull LogoParser.FccContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#fcc}.
	 * @param ctx the parse tree
	 */
	void exitFcc(@NotNull LogoParser.FccContext ctx);
}