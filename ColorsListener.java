// Generated from Colors.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ColorsParser}.
 */
public interface ColorsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ColorsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ColorsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ColorsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Igualdade}
	 * labeled alternative in {@link ColorsParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterIgualdade(ColorsParser.IgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Igualdade}
	 * labeled alternative in {@link ColorsParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitIgualdade(ColorsParser.IgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Combinar}
	 * labeled alternative in {@link ColorsParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterCombinar(ColorsParser.CombinarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Combinar}
	 * labeled alternative in {@link ColorsParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitCombinar(ColorsParser.CombinarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mostrar}
	 * labeled alternative in {@link ColorsParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(ColorsParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mostrar}
	 * labeled alternative in {@link ColorsParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(ColorsParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ColorsParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVar(ColorsParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ColorsParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVar(ColorsParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Combinacao}
	 * labeled alternative in {@link ColorsParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCombinacao(ColorsParser.CombinacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Combinacao}
	 * labeled alternative in {@link ColorsParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCombinacao(ColorsParser.CombinacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cor}
	 * labeled alternative in {@link ColorsParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCor(ColorsParser.CorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cor}
	 * labeled alternative in {@link ColorsParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCor(ColorsParser.CorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Azul}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void enterAzul(ColorsParser.AzulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Azul}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void exitAzul(ColorsParser.AzulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Amarelo}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void enterAmarelo(ColorsParser.AmareloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Amarelo}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void exitAmarelo(ColorsParser.AmareloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vermelho}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void enterVermelho(ColorsParser.VermelhoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vermelho}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void exitVermelho(ColorsParser.VermelhoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Laranja}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void enterLaranja(ColorsParser.LaranjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Laranja}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void exitLaranja(ColorsParser.LaranjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Verde}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void enterVerde(ColorsParser.VerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Verde}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void exitVerde(ColorsParser.VerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Roxo}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void enterRoxo(ColorsParser.RoxoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Roxo}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void exitRoxo(ColorsParser.RoxoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cinza}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void enterCinza(ColorsParser.CinzaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cinza}
	 * labeled alternative in {@link ColorsParser#cores}.
	 * @param ctx the parse tree
	 */
	void exitCinza(ColorsParser.CinzaContext ctx);
}