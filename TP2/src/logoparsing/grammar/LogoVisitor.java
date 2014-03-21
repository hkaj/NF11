// Generated from grammar/Logo.g4 by ANTLR 4.2

  package logoparsing.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(@NotNull LogoParser.ProgrammeContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#tg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTg(@NotNull LogoParser.TgContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#td}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTd(@NotNull LogoParser.TdContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#av}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAv(@NotNull LogoParser.AvContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);
}