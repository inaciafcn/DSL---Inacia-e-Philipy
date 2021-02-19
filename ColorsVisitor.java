// Generated from Colors.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ColorsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ColorsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ColorsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ColorsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Igualdade}
	 * labeled alternative in {@link ColorsParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdade(ColorsParser.IgualdadeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Combinar}
	 * labeled alternative in {@link ColorsParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinar(ColorsParser.CombinarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mostrar}
	 * labeled alternative in {@link ColorsParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(ColorsParser.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ColorsParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ColorsParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Combinacao}
	 * labeled alternative in {@link ColorsParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinacao(ColorsParser.CombinacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cor}
	 * labeled alternative in {@link ColorsParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCor(ColorsParser.CorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Azul}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzul(ColorsParser.AzulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Amarelo}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmarelo(ColorsParser.AmareloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vermelho}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVermelho(ColorsParser.VermelhoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Laranja}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaranja(ColorsParser.LaranjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Verde}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerde(ColorsParser.VerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Roxo}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoxo(ColorsParser.RoxoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cinza}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCinza(ColorsParser.CinzaContext ctx);
}