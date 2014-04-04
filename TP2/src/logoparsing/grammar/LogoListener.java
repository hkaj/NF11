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
	 * Enter a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void enterListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void exitListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);
}