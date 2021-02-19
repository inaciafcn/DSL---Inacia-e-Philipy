// Generated from Colors.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, VAR=12, SPACE=13;
	public static final int
		RULE_prog = 0, RULE_entrada = 1, RULE_exp = 2, RULE_cores = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "entrada", "exp", "cores"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'combinar'", "'mostrar'", "'+'", "'azul'", "'amarelo'", 
			"'vermelho'", "'laranja'", "'verde'", "'roxo'", "'cinza'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"VAR", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Colors.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ColorsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<EntradaContext> entrada() {
			return getRuleContexts(EntradaContext.class);
		}
		public EntradaContext entrada(int i) {
			return getRuleContext(EntradaContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				entrada();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << VAR))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntradaContext extends ParserRuleContext {
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
	 
		public EntradaContext() { }
		public void copyFrom(EntradaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MostrarContext extends EntradaContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MostrarContext(EntradaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualdadeContext extends EntradaContext {
		public TerminalNode VAR() { return getToken(ColorsParser.VAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IgualdadeContext(EntradaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitIgualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CombinarContext extends EntradaContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CombinarContext(EntradaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterCombinar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitCombinar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitCombinar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entrada);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new IgualdadeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(VAR);
				setState(14);
				match(T__0);
				setState(15);
				exp(0);
				}
				break;
			case T__1:
				_localctx = new CombinarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(T__1);
				setState(17);
				exp(0);
				}
				break;
			case T__2:
				_localctx = new MostrarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(T__2);
				setState(19);
				exp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarContext extends ExpContext {
		public TerminalNode VAR() { return getToken(ColorsParser.VAR, 0); }
		public VarContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CombinacaoContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CombinacaoContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterCombinacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitCombinacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitCombinacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CorContext extends ExpContext {
		public CoresContext cores() {
			return getRuleContext(CoresContext.class,0);
		}
		public CorContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterCor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitCor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitCor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				match(VAR);
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				{
				_localctx = new CorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				cores();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CombinacaoContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(27);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(28);
					match(T__3);
					setState(29);
					exp(4);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CoresContext extends ParserRuleContext {
		public CoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cores; }
	 
		public CoresContext() { }
		public void copyFrom(CoresContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LaranjaContext extends CoresContext {
		public LaranjaContext(CoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterLaranja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitLaranja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitLaranja(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RoxoContext extends CoresContext {
		public RoxoContext(CoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterRoxo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitRoxo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitRoxo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AmareloContext extends CoresContext {
		public AmareloContext(CoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterAmarelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitAmarelo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitAmarelo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VermelhoContext extends CoresContext {
		public VermelhoContext(CoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterVermelho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitVermelho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitVermelho(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CinzaContext extends CoresContext {
		public CinzaContext(CoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterCinza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitCinza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitCinza(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AzulContext extends CoresContext {
		public AzulContext(CoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterAzul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitAzul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitAzul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerdeContext extends CoresContext {
		public VerdeContext(CoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).enterVerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorsListener ) ((ColorsListener)listener).exitVerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorsVisitor ) return ((ColorsVisitor<? extends T>)visitor).visitVerde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoresContext cores() throws RecognitionException {
		CoresContext _localctx = new CoresContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cores);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new AzulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new AmareloContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new VermelhoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new LaranjaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new VerdeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new RoxoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new CinzaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\27\n\3\3\4\3\4\3\4\5\4\34\n\4\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\5\2\3\6\6\2\4\6\b\2\2\2\65\2"+
		"\13\3\2\2\2\4\26\3\2\2\2\6\33\3\2\2\2\b,\3\2\2\2\n\f\5\4\3\2\13\n\3\2"+
		"\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\20\7\16\2\2"+
		"\20\21\7\3\2\2\21\27\5\6\4\2\22\23\7\4\2\2\23\27\5\6\4\2\24\25\7\5\2\2"+
		"\25\27\5\6\4\2\26\17\3\2\2\2\26\22\3\2\2\2\26\24\3\2\2\2\27\5\3\2\2\2"+
		"\30\31\b\4\1\2\31\34\7\16\2\2\32\34\5\b\5\2\33\30\3\2\2\2\33\32\3\2\2"+
		"\2\34\"\3\2\2\2\35\36\f\5\2\2\36\37\7\6\2\2\37!\5\6\4\6 \35\3\2\2\2!$"+
		"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\7\3\2\2\2$\"\3\2\2\2%-\7\7\2\2&-\7\b\2"+
		"\2\'-\7\t\2\2(-\7\n\2\2)-\7\13\2\2*-\7\f\2\2+-\7\r\2\2,%\3\2\2\2,&\3\2"+
		"\2\2,\'\3\2\2\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\t\3\2\2\2\7\r"+
		"\26\33\",";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}