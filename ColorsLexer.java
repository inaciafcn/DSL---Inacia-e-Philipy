// Generated from Colors.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, VAR=12, SPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "VAR", "SPACE"
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


	public ColorsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Colors.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rc\n\r\r\r\16\rd\3\16\3\16\3\16\3\16"+
		"\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2j\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3"+
		"\2\2\2\5\37\3\2\2\2\7(\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\67\3\2\2\2"+
		"\17?\3\2\2\2\21H\3\2\2\2\23P\3\2\2\2\25V\3\2\2\2\27[\3\2\2\2\31b\3\2\2"+
		"\2\33f\3\2\2\2\35\36\7?\2\2\36\4\3\2\2\2\37 \7e\2\2 !\7q\2\2!\"\7o\2\2"+
		"\"#\7d\2\2#$\7k\2\2$%\7p\2\2%&\7c\2\2&\'\7t\2\2\'\6\3\2\2\2()\7o\2\2)"+
		"*\7q\2\2*+\7u\2\2+,\7v\2\2,-\7t\2\2-.\7c\2\2./\7t\2\2/\b\3\2\2\2\60\61"+
		"\7-\2\2\61\n\3\2\2\2\62\63\7c\2\2\63\64\7|\2\2\64\65\7w\2\2\65\66\7n\2"+
		"\2\66\f\3\2\2\2\678\7c\2\289\7o\2\29:\7c\2\2:;\7t\2\2;<\7g\2\2<=\7n\2"+
		"\2=>\7q\2\2>\16\3\2\2\2?@\7x\2\2@A\7g\2\2AB\7t\2\2BC\7o\2\2CD\7g\2\2D"+
		"E\7n\2\2EF\7j\2\2FG\7q\2\2G\20\3\2\2\2HI\7n\2\2IJ\7c\2\2JK\7t\2\2KL\7"+
		"c\2\2LM\7p\2\2MN\7l\2\2NO\7c\2\2O\22\3\2\2\2PQ\7x\2\2QR\7g\2\2RS\7t\2"+
		"\2ST\7f\2\2TU\7g\2\2U\24\3\2\2\2VW\7t\2\2WX\7q\2\2XY\7z\2\2YZ\7q\2\2Z"+
		"\26\3\2\2\2[\\\7e\2\2\\]\7k\2\2]^\7p\2\2^_\7|\2\2_`\7c\2\2`\30\3\2\2\2"+
		"ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\32\3\2\2\2fg\t\3\2"+
		"\2gh\3\2\2\2hi\b\16\2\2i\34\3\2\2\2\4\2d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}