package co.edu.unal.antlr;
// Generated from TL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, FOR=2, IF=3, ELIF=4, ELSE=5, LOG=6, LEER=7, FUNCION=8, FALSE=9, 
		TRUE=10, IMPORTAR=11, IN=12, RETORNO=13, END=14, DESDE=15, TODO=16, TOKEN_LLAVE_IZQ=17, 
		TOKEN_LLAVE_DER=18, TOKEN_COR_IZQ=19, TOKEN_COR_DER=20, TOKEN_PAR_IZQ=21, 
		TOKEN_PAR_DER=22, TOKEN_MAYOR=23, TOKEN_MENOR=24, TOKEN_MAYOR_IGUAL=25, 
		TOKEN_MENOR_IGUAL=26, TOKEN_IGUAL_NUM=27, TOKEN_POINT=28, TOKEN_DIFF_NUM=29, 
		TOKEN_AND=30, TOKEN_OR=31, TOKEN_NOT=32, TOKEN_MAS=33, TOKEN_MENOS=34, 
		TOKEN_MUL=35, TOKEN_DIV=36, TOKEN_MOD=37, TOKEN_POT=38, TOKEN_ASSIGN=39, 
		TOKEN_COMA=40, TOKEN_DOSP=41, TOKEN_STRING=42, COMMENTARIO=43, ID=44, 
		TOKEN_INTEGER=45, TOKEN_FLOAT=46, WS=47, TOKEN_NEWLINE=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHILE", "FOR", "IF", "ELIF", "ELSE", "LOG", "LEER", "FUNCION", "FALSE", 
		"TRUE", "IMPORTAR", "IN", "RETORNO", "END", "DESDE", "TODO", "TOKEN_LLAVE_IZQ", 
		"TOKEN_LLAVE_DER", "TOKEN_COR_IZQ", "TOKEN_COR_DER", "TOKEN_PAR_IZQ", 
		"TOKEN_PAR_DER", "TOKEN_MAYOR", "TOKEN_MENOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR_IGUAL", 
		"TOKEN_IGUAL_NUM", "TOKEN_POINT", "TOKEN_DIFF_NUM", "TOKEN_AND", "TOKEN_OR", 
		"TOKEN_NOT", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", "TOKEN_DIV", "TOKEN_MOD", 
		"TOKEN_POT", "TOKEN_ASSIGN", "TOKEN_COMA", "TOKEN_DOSP", "TOKEN_STRING", 
		"COMMENTARIO", "ID", "TOKEN_INTEGER", "TOKEN_FLOAT", "WS", "TOKEN_NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'while'", "'for'", "'if'", "'else if'", "'else'", "'log'", "'leer'", 
		"'funcion'", "'false'", "'true'", "'importar'", "'in'", "'retorno'", "'end'", 
		"'desde'", "'todo'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'>'", 
		"'<'", "'>='", "'<='", "'=='", "'.'", "'!='", "'&&'", "'||'", "'!'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'^'", "'='", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHILE", "FOR", "IF", "ELIF", "ELSE", "LOG", "LEER", "FUNCION", 
		"FALSE", "TRUE", "IMPORTAR", "IN", "RETORNO", "END", "DESDE", "TODO", 
		"TOKEN_LLAVE_IZQ", "TOKEN_LLAVE_DER", "TOKEN_COR_IZQ", "TOKEN_COR_DER", 
		"TOKEN_PAR_IZQ", "TOKEN_PAR_DER", "TOKEN_MAYOR", "TOKEN_MENOR", "TOKEN_MAYOR_IGUAL", 
		"TOKEN_MENOR_IGUAL", "TOKEN_IGUAL_NUM", "TOKEN_POINT", "TOKEN_DIFF_NUM", 
		"TOKEN_AND", "TOKEN_OR", "TOKEN_NOT", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", 
		"TOKEN_DIV", "TOKEN_MOD", "TOKEN_POT", "TOKEN_ASSIGN", "TOKEN_COMA", "TOKEN_DOSP", 
		"TOKEN_STRING", "COMMENTARIO", "ID", "TOKEN_INTEGER", "TOKEN_FLOAT", "WS", 
		"TOKEN_NEWLINE"
	};
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


	public TLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0128\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\7+\u00f7\n+\f+\16+\u00fa"+
		"\13+\3+\3+\3,\3,\7,\u0100\n,\f,\16,\u0103\13,\3,\3,\3,\3,\3-\3-\7-\u010b"+
		"\n-\f-\16-\u010e\13-\3.\6.\u0111\n.\r.\16.\u0112\3/\6/\u0116\n/\r/\16"+
		"/\u0117\3/\3/\6/\u011c\n/\r/\16/\u011d\3\60\6\60\u0121\n\60\r\60\16\60"+
		"\u0122\3\60\3\60\3\61\3\61\4\u00f8\u0101\2\62\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\13"+
		"\17\17\"\"\3\2\f\f\2\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5i\3\2\2\2\7m\3\2\2\2\tp\3\2"+
		"\2\2\13x\3\2\2\2\r}\3\2\2\2\17\u0081\3\2\2\2\21\u0086\3\2\2\2\23\u008e"+
		"\3\2\2\2\25\u0094\3\2\2\2\27\u0099\3\2\2\2\31\u00a2\3\2\2\2\33\u00a5\3"+
		"\2\2\2\35\u00ad\3\2\2\2\37\u00b1\3\2\2\2!\u00b7\3\2\2\2#\u00bc\3\2\2\2"+
		"%\u00be\3\2\2\2\'\u00c0\3\2\2\2)\u00c2\3\2\2\2+\u00c4\3\2\2\2-\u00c6\3"+
		"\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2\2\65\u00cf\3\2\2"+
		"\2\67\u00d2\3\2\2\29\u00d5\3\2\2\2;\u00d7\3\2\2\2=\u00da\3\2\2\2?\u00dd"+
		"\3\2\2\2A\u00e0\3\2\2\2C\u00e2\3\2\2\2E\u00e4\3\2\2\2G\u00e6\3\2\2\2I"+
		"\u00e8\3\2\2\2K\u00ea\3\2\2\2M\u00ec\3\2\2\2O\u00ee\3\2\2\2Q\u00f0\3\2"+
		"\2\2S\u00f2\3\2\2\2U\u00f4\3\2\2\2W\u00fd\3\2\2\2Y\u0108\3\2\2\2[\u0110"+
		"\3\2\2\2]\u0115\3\2\2\2_\u0120\3\2\2\2a\u0126\3\2\2\2cd\7y\2\2de\7j\2"+
		"\2ef\7k\2\2fg\7n\2\2gh\7g\2\2h\4\3\2\2\2ij\7h\2\2jk\7q\2\2kl\7t\2\2l\6"+
		"\3\2\2\2mn\7k\2\2no\7h\2\2o\b\3\2\2\2pq\7g\2\2qr\7n\2\2rs\7u\2\2st\7g"+
		"\2\2tu\7\"\2\2uv\7k\2\2vw\7h\2\2w\n\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2"+
		"{|\7g\2\2|\f\3\2\2\2}~\7n\2\2~\177\7q\2\2\177\u0080\7i\2\2\u0080\16\3"+
		"\2\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\u0084\7g\2\2\u0084"+
		"\u0085\7t\2\2\u0085\20\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7w\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7e\2\2\u008a\u008b\7k\2\2\u008b\u008c\7q\2\2"+
		"\u008c\u008d\7p\2\2\u008d\22\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7"+
		"c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\24"+
		"\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7w\2\2\u0097"+
		"\u0098\7g\2\2\u0098\26\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7o\2\2\u009b"+
		"\u009c\7r\2\2\u009c\u009d\7q\2\2\u009d\u009e\7t\2\2\u009e\u009f\7v\2\2"+
		"\u009f\u00a0\7c\2\2\u00a0\u00a1\7t\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7"+
		"k\2\2\u00a3\u00a4\7p\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7q\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\u00b0\7f\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6 \3\2\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7f\2"+
		"\2\u00ba\u00bb\7q\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7}\2\2\u00bd$\3\2\2"+
		"\2\u00be\u00bf\7\177\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7]\2\2\u00c1(\3\2"+
		"\2\2\u00c2\u00c3\7_\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7*\2\2\u00c5,\3\2\2"+
		"\2\u00c6\u00c7\7+\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9\60\3\2\2"+
		"\2\u00ca\u00cb\7>\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1\7?\2\2\u00d1\66"+
		"\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3\u00d4\7?\2\2\u00d48\3\2\2\2\u00d5\u00d6"+
		"\7\60\2\2\u00d6:\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9\7?\2\2\u00d9<"+
		"\3\2\2\2\u00da\u00db\7(\2\2\u00db\u00dc\7(\2\2\u00dc>\3\2\2\2\u00dd\u00de"+
		"\7~\2\2\u00de\u00df\7~\2\2\u00df@\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1B\3"+
		"\2\2\2\u00e2\u00e3\7-\2\2\u00e3D\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5F\3\2"+
		"\2\2\u00e6\u00e7\7,\2\2\u00e7H\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9J\3\2"+
		"\2\2\u00ea\u00eb\7\'\2\2\u00ebL\3\2\2\2\u00ec\u00ed\7`\2\2\u00edN\3\2"+
		"\2\2\u00ee\u00ef\7?\2\2\u00efP\3\2\2\2\u00f0\u00f1\7.\2\2\u00f1R\3\2\2"+
		"\2\u00f2\u00f3\7<\2\2\u00f3T\3\2\2\2\u00f4\u00f8\7$\2\2\u00f5\u00f7\13"+
		"\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7$"+
		"\2\2\u00fcV\3\2\2\2\u00fd\u0101\7%\2\2\u00fe\u0100\13\2\2\2\u00ff\u00fe"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\f\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\b,\2\2\u0107X\3\2\2\2\u0108\u010c\t\2\2\2\u0109\u010b"+
		"\t\3\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010dZ\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\t\4\2\2"+
		"\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\\\3\2\2\2\u0114\u0116\t\4\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\7\60\2\2\u011a\u011c\t\4\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e^\3\2\2\2"+
		"\u011f\u0121\t\5\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b\60\2\2"+
		"\u0125`\3\2\2\2\u0126\u0127\t\6\2\2\u0127b\3\2\2\2\n\2\u00f8\u0101\u010c"+
		"\u0112\u0117\u011d\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}