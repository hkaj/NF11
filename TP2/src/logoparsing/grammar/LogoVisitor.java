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
	 * Visit a parse tree produced by {@link LogoParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull LogoParser.MultContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull LogoParser.SubContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(@NotNull LogoParser.SetContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#nequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNequal(@NotNull LogoParser.NequalContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull LogoParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#tg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTg(@NotNull LogoParser.TgContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull LogoParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#inf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInf(@NotNull LogoParser.InfContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(@NotNull LogoParser.EqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#td}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTd(@NotNull LogoParser.TdContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe(@NotNull LogoParser.ReContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull LogoParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#sup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSup(@NotNull LogoParser.SupContext ctx);

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

	/**
	 * Visit a parse tree produced by {@link LogoParser#par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull LogoParser.ParContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull LogoParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(@NotNull LogoParser.ProgrammeContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull LogoParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#ve}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVe(@NotNull LogoParser.VeContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#fpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFpos(@NotNull LogoParser.FposContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#lc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLc(@NotNull LogoParser.LcContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#bc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBc(@NotNull LogoParser.BcContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogoParser#fcc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcc(@NotNull LogoParser.FccContext ctx);
}