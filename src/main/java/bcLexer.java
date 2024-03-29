// Generated from C:/Users/Nimit/Downloads/Programming/ANTLR Projects/bc-statements/src/main/java\bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCALE=1, READ=2, PRINT=3, LAST=4, AND=5, OR=6, NOT=7, INC=8, DEC=9, PLUS=10, 
		MINUS=11, DIV=12, MUL=13, MOD=14, POW=15, EQUAL=16, LT=17, GT=18, LTEQ=19, 
		GTEQ=20, EQEQ=21, NOTEQ=22, SQRT=23, SIN=24, COS=25, LOG=26, EXP=27, IF=28, 
		ELSE=29, FOR=30, WHILE=31, DEFINE=32, BREAK=33, CONTINUE=34, RETURN=35, 
		OPAREN=36, CPAREN=37, OBRACE=38, CBRACE=39, COMMA=40, TERMINATOR=41, VARIABLE=42, 
		NUMBER=43, NEWLINE=44, SLCMNT=45, MLCMNT=46, WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SCALE", "READ", "PRINT", "LAST", "AND", "OR", "NOT", "INC", "DEC", "PLUS", 
			"MINUS", "DIV", "MUL", "MOD", "POW", "EQUAL", "LT", "GT", "LTEQ", "GTEQ", 
			"EQEQ", "NOTEQ", "SQRT", "SIN", "COS", "LOG", "EXP", "IF", "ELSE", "FOR", 
			"WHILE", "DEFINE", "BREAK", "CONTINUE", "RETURN", "OPAREN", "CPAREN", 
			"OBRACE", "CBRACE", "COMMA", "TERMINATOR", "VARIABLE", "NUMBER", "NEWLINE", 
			"SLCMNT", "MLCMNT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'scale'", "'read'", "'print'", "'last'", "'&&'", "'||'", "'!'", 
			"'++'", "'--'", "'+'", "'-'", "'/'", "'*'", "'%'", "'^'", "'='", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'sqrt'", "'s'", "'c'", "'l'", 
			"'e'", "'if'", "'else'", "'for'", "'while'", "'define'", "'break'", "'continue'", 
			"'return'", "'('", "')'", "'{'", "'}'", "','", "';'", null, null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCALE", "READ", "PRINT", "LAST", "AND", "OR", "NOT", "INC", "DEC", 
			"PLUS", "MINUS", "DIV", "MUL", "MOD", "POW", "EQUAL", "LT", "GT", "LTEQ", 
			"GTEQ", "EQEQ", "NOTEQ", "SQRT", "SIN", "COS", "LOG", "EXP", "IF", "ELSE", 
			"FOR", "WHILE", "DEFINE", "BREAK", "CONTINUE", "RETURN", "OPAREN", "CPAREN", 
			"OBRACE", "CBRACE", "COMMA", "TERMINATOR", "VARIABLE", "NUMBER", "NEWLINE", 
			"SLCMNT", "MLCMNT", "WS"
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


	public bcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0131\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\6+\u00ed\n+\r+\16+\u00ee"+
		"\3+\7+\u00f2\n+\f+\16+\u00f5\13+\3+\7+\u00f8\n+\f+\16+\u00fb\13+\3,\6"+
		",\u00fe\n,\r,\16,\u00ff\3,\3,\6,\u0104\n,\r,\16,\u0105\5,\u0108\n,\3-"+
		"\3-\3-\3.\3.\7.\u010f\n.\f.\16.\u0112\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\7"+
		"/\u011d\n/\f/\16/\u0120\13/\3/\3/\3/\3/\3/\5/\u0127\n/\3/\3/\3\60\6\60"+
		"\u012c\n\60\r\60\16\60\u012d\3\60\3\60\4\u0110\u011e\2\61\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\""+
		"\2\u013a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3a\3\2\2\2\5g\3\2\2\2\7l\3\2\2\2\tr\3\2\2\2\13w\3\2\2\2\rz\3\2\2"+
		"\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0082\3\2\2\2\25\u0085\3\2\2\2\27\u0087"+
		"\3\2\2\2\31\u0089\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3"+
		"\2\2\2!\u0091\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u009a"+
		"\3\2\2\2+\u009d\3\2\2\2-\u00a0\3\2\2\2/\u00a3\3\2\2\2\61\u00a8\3\2\2\2"+
		"\63\u00aa\3\2\2\2\65\u00ac\3\2\2\2\67\u00ae\3\2\2\29\u00b0\3\2\2\2;\u00b3"+
		"\3\2\2\2=\u00b8\3\2\2\2?\u00bc\3\2\2\2A\u00c2\3\2\2\2C\u00c9\3\2\2\2E"+
		"\u00cf\3\2\2\2G\u00d8\3\2\2\2I\u00df\3\2\2\2K\u00e1\3\2\2\2M\u00e3\3\2"+
		"\2\2O\u00e5\3\2\2\2Q\u00e7\3\2\2\2S\u00e9\3\2\2\2U\u00ec\3\2\2\2W\u00fd"+
		"\3\2\2\2Y\u0109\3\2\2\2[\u010c\3\2\2\2]\u0118\3\2\2\2_\u012b\3\2\2\2a"+
		"b\7u\2\2bc\7e\2\2cd\7c\2\2de\7n\2\2ef\7g\2\2f\4\3\2\2\2gh\7t\2\2hi\7g"+
		"\2\2ij\7c\2\2jk\7f\2\2k\6\3\2\2\2lm\7r\2\2mn\7t\2\2no\7k\2\2op\7p\2\2"+
		"pq\7v\2\2q\b\3\2\2\2rs\7n\2\2st\7c\2\2tu\7u\2\2uv\7v\2\2v\n\3\2\2\2wx"+
		"\7(\2\2xy\7(\2\2y\f\3\2\2\2z{\7~\2\2{|\7~\2\2|\16\3\2\2\2}~\7#\2\2~\20"+
		"\3\2\2\2\177\u0080\7-\2\2\u0080\u0081\7-\2\2\u0081\22\3\2\2\2\u0082\u0083"+
		"\7/\2\2\u0083\u0084\7/\2\2\u0084\24\3\2\2\2\u0085\u0086\7-\2\2\u0086\26"+
		"\3\2\2\2\u0087\u0088\7/\2\2\u0088\30\3\2\2\2\u0089\u008a\7\61\2\2\u008a"+
		"\32\3\2\2\2\u008b\u008c\7,\2\2\u008c\34\3\2\2\2\u008d\u008e\7\'\2\2\u008e"+
		"\36\3\2\2\2\u008f\u0090\7`\2\2\u0090 \3\2\2\2\u0091\u0092\7?\2\2\u0092"+
		"\"\3\2\2\2\u0093\u0094\7>\2\2\u0094$\3\2\2\2\u0095\u0096\7@\2\2\u0096"+
		"&\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099\7?\2\2\u0099(\3\2\2\2\u009a\u009b"+
		"\7@\2\2\u009b\u009c\7?\2\2\u009c*\3\2\2\2\u009d\u009e\7?\2\2\u009e\u009f"+
		"\7?\2\2\u009f,\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\7?\2\2\u00a2.\3"+
		"\2\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7s\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\62\3\2\2\2\u00aa"+
		"\u00ab\7e\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7n\2\2\u00ad\66\3\2\2\2\u00ae"+
		"\u00af\7g\2\2\u00af8\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b2"+
		":\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7t\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1@\3\2\2\2\u00c2"+
		"\u00c3\7f\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7k\2\2"+
		"\u00c6\u00c7\7p\2\2\u00c7\u00c8\7g\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7d\2"+
		"\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce"+
		"\7m\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2"+
		"\7p\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5"+
		"\u00d6\7w\2\2\u00d6\u00d7\7g\2\2\u00d7F\3\2\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7t\2\2"+
		"\u00dd\u00de\7p\2\2\u00deH\3\2\2\2\u00df\u00e0\7*\2\2\u00e0J\3\2\2\2\u00e1"+
		"\u00e2\7+\2\2\u00e2L\3\2\2\2\u00e3\u00e4\7}\2\2\u00e4N\3\2\2\2\u00e5\u00e6"+
		"\7\177\2\2\u00e6P\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8R\3\2\2\2\u00e9\u00ea"+
		"\7=\2\2\u00eaT\3\2\2\2\u00eb\u00ed\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0"+
		"\u00f2\7a\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f9\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f8\t\3\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00faV\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe"+
		"\t\3\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0107\3\2\2\2\u0101\u0103\7\60\2\2\u0102\u0104\t"+
		"\3\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108X\3\2\2\2\u0109\u010a\7\17\2\2\u010a\u010b\7\f\2\2\u010bZ\3"+
		"\2\2\2\u010c\u0110\7%\2\2\u010d\u010f\13\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\17\2\2\u0114\u0115\7\f\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\b.\2\2\u0117\\\3\2\2\2\u0118\u0119\7\61\2\2"+
		"\u0119\u011a\7,\2\2\u011a\u011e\3\2\2\2\u011b\u011d\13\2\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7,\2\2\u0122\u0123\7\61"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0125\7\17\2\2\u0125\u0127\7\f\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b/"+
		"\2\2\u0129^\3\2\2\2\u012a\u012c\t\4\2\2\u012b\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\b\60\2\2\u0130`\3\2\2\2\r\2\u00ee\u00f3\u00f9\u00ff\u0105\u0107"+
		"\u0110\u011e\u0126\u012d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}