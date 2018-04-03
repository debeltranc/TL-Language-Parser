package co.edu.unal.antlr;
// Generated from TL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLParser extends Parser {
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
	public static final int
		RULE_parse = 0, RULE_from_input = 1, RULE_from_file = 2, RULE_stat = 3, 
		RULE_compound_stat = 4, RULE_simple_stat = 5, RULE_assignment = 6, RULE_if_stat = 7, 
		RULE_while_stat = 8, RULE_for_stat = 9, RULE_log = 10, RULE_leer = 11, 
		RULE_funcion = 12, RULE_importar = 13, RULE_retornar = 14, RULE_condition_block = 15, 
		RULE_stat_block = 16, RULE_array = 17, RULE_accessarray = 18, RULE_variable = 19, 
		RULE_parametro = 20, RULE_expr = 21, RULE_aritmethicalexpr = 22, RULE_booleanexpr = 23, 
		RULE_atom = 24, RULE_estructura = 25, RULE_keyvalue = 26;
	public static final String[] ruleNames = {
		"parse", "from_input", "from_file", "stat", "compound_stat", "simple_stat", 
		"assignment", "if_stat", "while_stat", "for_stat", "log", "leer", "funcion", 
		"importar", "retornar", "condition_block", "stat_block", "array", "accessarray", 
		"variable", "parametro", "expr", "aritmethicalexpr", "booleanexpr", "atom", 
		"estructura", "keyvalue"
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

	@Override
	public String getGrammarFileName() { return "TL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public From_inputContext from_input() {
			return getRuleContext(From_inputContext.class,0);
		}
		public From_fileContext from_file() {
			return getRuleContext(From_fileContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				from_input();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				from_file();
				}
				break;
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

	public static class From_inputContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode TOKEN_NEWLINE() { return getToken(TLParser.TOKEN_NEWLINE, 0); }
		public From_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFrom_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFrom_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFrom_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_inputContext from_input() throws RecognitionException {
		From_inputContext _localctx = new From_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_from_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			stat();
			setState(59);
			match(TOKEN_NEWLINE);
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

	public static class From_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TLParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> TOKEN_NEWLINE() { return getTokens(TLParser.TOKEN_NEWLINE); }
		public TerminalNode TOKEN_NEWLINE(int i) {
			return getToken(TLParser.TOKEN_NEWLINE, i);
		}
		public From_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFrom_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFrom_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFrom_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_fileContext from_file() throws RecognitionException {
		From_fileContext _localctx = new From_fileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << LOG) | (1L << LEER) | (1L << FUNCION) | (1L << FALSE) | (1L << TRUE) | (1L << IMPORTAR) | (1L << RETORNO) | (1L << DESDE) | (1L << TOKEN_LLAVE_IZQ) | (1L << TOKEN_COR_IZQ) | (1L << TOKEN_PAR_IZQ) | (1L << TOKEN_NOT) | (1L << TOKEN_MENOS) | (1L << TOKEN_STRING) | (1L << ID) | (1L << TOKEN_INTEGER) | (1L << TOKEN_FLOAT) | (1L << TOKEN_NEWLINE))) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHILE:
				case FOR:
				case IF:
				case LOG:
				case LEER:
				case FUNCION:
				case FALSE:
				case TRUE:
				case IMPORTAR:
				case RETORNO:
				case DESDE:
				case TOKEN_LLAVE_IZQ:
				case TOKEN_COR_IZQ:
				case TOKEN_PAR_IZQ:
				case TOKEN_NOT:
				case TOKEN_MENOS:
				case TOKEN_STRING:
				case ID:
				case TOKEN_INTEGER:
				case TOKEN_FLOAT:
					{
					setState(61);
					stat();
					}
					break;
				case TOKEN_NEWLINE:
					{
					setState(62);
					match(TOKEN_NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(EOF);
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

	public static class StatContext extends ParserRuleContext {
		public Simple_statContext simple_stat() {
			return getRuleContext(Simple_statContext.class,0);
		}
		public Compound_statContext compound_stat() {
			return getRuleContext(Compound_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOG:
			case LEER:
			case FALSE:
			case TRUE:
			case IMPORTAR:
			case RETORNO:
			case DESDE:
			case TOKEN_LLAVE_IZQ:
			case TOKEN_COR_IZQ:
			case TOKEN_PAR_IZQ:
			case TOKEN_NOT:
			case TOKEN_MENOS:
			case TOKEN_STRING:
			case ID:
			case TOKEN_INTEGER:
			case TOKEN_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				simple_stat();
				}
				break;
			case WHILE:
			case FOR:
			case IF:
			case FUNCION:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				compound_stat();
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

	public static class Compound_statContext extends ParserRuleContext {
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Compound_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCompound_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCompound_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCompound_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statContext compound_stat() throws RecognitionException {
		Compound_statContext _localctx = new Compound_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound_stat);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				while_stat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				for_stat();
				}
				break;
			case FUNCION:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				funcion();
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

	public static class Simple_statContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public ImportarContext importar() {
			return getRuleContext(ImportarContext.class,0);
		}
		public RetornarContext retornar() {
			return getRuleContext(RetornarContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode TOKEN_NEWLINE() { return getToken(TLParser.TOKEN_NEWLINE, 0); }
		public Simple_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterSimple_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitSimple_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitSimple_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statContext simple_stat() throws RecognitionException {
		Simple_statContext _localctx = new Simple_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_stat);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				log();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				leer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				importar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				retornar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				atom();
				setState(87);
				match(TOKEN_NEWLINE);
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode TOKEN_ASSIGN() { return getToken(TLParser.TOKEN_ASSIGN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(91);
				variable();
				}
				break;
			case TOKEN_COR_IZQ:
				{
				setState(92);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(95);
			match(TOKEN_ASSIGN);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(96);
				assignment();
				}
				break;
			case 2:
				{
				setState(97);
				expr();
				}
				break;
			}
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

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TLParser.IF, 0); }
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> TOKEN_NEWLINE() { return getTokens(TLParser.TOKEN_NEWLINE); }
		public TerminalNode TOKEN_NEWLINE(int i) {
			return getToken(TLParser.TOKEN_NEWLINE, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(TLParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(TLParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(TLParser.ELSE, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IF);
			setState(101);
			condition_block();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(TOKEN_NEWLINE);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(108);
				match(ELIF);
				setState(109);
				condition_block();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(TOKEN_NEWLINE);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(121);
				match(ELSE);
				setState(122);
				stat_block();
				}
			}

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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TLParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(WHILE);
			setState(126);
			condition_block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TLParser.FOR, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode IN() { return getToken(TLParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(FOR);
			setState(129);
			match(ID);
			setState(130);
			match(IN);
			setState(131);
			expr();
			setState(132);
			stat_block();
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(TLParser.LOG, 0); }
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TLParser.TOKEN_PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(TLParser.TOKEN_PAR_DER, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LOG);
			setState(135);
			match(TOKEN_PAR_IZQ);
			setState(136);
			expr();
			setState(137);
			match(TOKEN_PAR_DER);
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(TLParser.LEER, 0); }
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TLParser.TOKEN_PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(TLParser.TOKEN_PAR_DER, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LEER);
			setState(140);
			match(TOKEN_PAR_IZQ);
			setState(141);
			expr();
			setState(142);
			match(TOKEN_PAR_DER);
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

	public static class FuncionContext extends ParserRuleContext {
		public List<TerminalNode> FUNCION() { return getTokens(TLParser.FUNCION); }
		public TerminalNode FUNCION(int i) {
			return getToken(TLParser.FUNCION, i);
		}
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TLParser.TOKEN_PAR_IZQ, 0); }
		public TerminalNode TOKEN_PAR_DER() { return getToken(TLParser.TOKEN_PAR_DER, 0); }
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> TOKEN_NEWLINE() { return getTokens(TLParser.TOKEN_NEWLINE); }
		public TerminalNode TOKEN_NEWLINE(int i) {
			return getToken(TLParser.TOKEN_NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(TLParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(TLParser.TOKEN_COMA, i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FUNCION);
			setState(145);
			match(ID);
			setState(146);
			match(TOKEN_PAR_IZQ);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(147);
				parametro();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(148);
					match(TOKEN_COMA);
					setState(149);
					parametro();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(157);
			match(TOKEN_PAR_DER);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << LOG) | (1L << LEER) | (1L << FUNCION) | (1L << FALSE) | (1L << TRUE) | (1L << IMPORTAR) | (1L << RETORNO) | (1L << DESDE) | (1L << TOKEN_LLAVE_IZQ) | (1L << TOKEN_COR_IZQ) | (1L << TOKEN_PAR_IZQ) | (1L << TOKEN_NOT) | (1L << TOKEN_MENOS) | (1L << TOKEN_STRING) | (1L << ID) | (1L << TOKEN_INTEGER) | (1L << TOKEN_FLOAT) | (1L << TOKEN_NEWLINE))) != 0)) {
				{
				setState(160);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOKEN_NEWLINE:
					{
					setState(158);
					match(TOKEN_NEWLINE);
					}
					break;
				case WHILE:
				case FOR:
				case IF:
				case LOG:
				case LEER:
				case FUNCION:
				case FALSE:
				case TRUE:
				case IMPORTAR:
				case RETORNO:
				case DESDE:
				case TOKEN_LLAVE_IZQ:
				case TOKEN_COR_IZQ:
				case TOKEN_PAR_IZQ:
				case TOKEN_NOT:
				case TOKEN_MENOS:
				case TOKEN_STRING:
				case ID:
				case TOKEN_INTEGER:
				case TOKEN_FLOAT:
					{
					setState(159);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(END);
			setState(166);
			match(FUNCION);
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

	public static class ImportarContext extends ParserRuleContext {
		public TerminalNode IMPORTAR() { return getToken(TLParser.IMPORTAR, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<TerminalNode> TOKEN_POINT() { return getTokens(TLParser.TOKEN_POINT); }
		public TerminalNode TOKEN_POINT(int i) {
			return getToken(TLParser.TOKEN_POINT, i);
		}
		public TerminalNode DESDE() { return getToken(TLParser.DESDE, 0); }
		public ImportarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterImportar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitImportar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitImportar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportarContext importar() throws RecognitionException {
		ImportarContext _localctx = new ImportarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_importar);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORTAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(IMPORTAR);
				setState(169);
				match(ID);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_POINT) {
					{
					{
					setState(170);
					match(TOKEN_POINT);
					setState(171);
					match(ID);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DESDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(DESDE);
				setState(178);
				match(ID);
				setState(179);
				match(IMPORTAR);
				setState(180);
				match(ID);
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

	public static class RetornarContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(TLParser.RETORNO, 0); }
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TLParser.TOKEN_PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(TLParser.TOKEN_PAR_DER, 0); }
		public TerminalNode TOKEN_NEWLINE() { return getToken(TLParser.TOKEN_NEWLINE, 0); }
		public RetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitRetornar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitRetornar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornarContext retornar() throws RecognitionException {
		RetornarContext _localctx = new RetornarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(RETORNO);
			setState(184);
			match(TOKEN_PAR_IZQ);
			setState(185);
			expr();
			setState(186);
			match(TOKEN_PAR_DER);
			setState(187);
			match(TOKEN_NEWLINE);
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TLParser.TOKEN_PAR_IZQ, 0); }
		public BooleanexprContext booleanexpr() {
			return getRuleContext(BooleanexprContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(TLParser.TOKEN_PAR_DER, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode TOKEN_NEWLINE() { return getToken(TLParser.TOKEN_NEWLINE, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(TOKEN_PAR_IZQ);
			setState(190);
			booleanexpr(0);
			setState(191);
			match(TOKEN_PAR_DER);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(192);
				match(TOKEN_NEWLINE);
				}
				break;
			}
			setState(195);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode TOKEN_LLAVE_IZQ() { return getToken(TLParser.TOKEN_LLAVE_IZQ, 0); }
		public TerminalNode TOKEN_LLAVE_DER() { return getToken(TLParser.TOKEN_LLAVE_DER, 0); }
		public List<TerminalNode> TOKEN_NEWLINE() { return getTokens(TLParser.TOKEN_NEWLINE); }
		public TerminalNode TOKEN_NEWLINE(int i) {
			return getToken(TLParser.TOKEN_NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stat_block);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_NEWLINE) {
					{
					{
					setState(197);
					match(TOKEN_NEWLINE);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(TOKEN_LLAVE_IZQ);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << LOG) | (1L << LEER) | (1L << FUNCION) | (1L << FALSE) | (1L << TRUE) | (1L << IMPORTAR) | (1L << RETORNO) | (1L << DESDE) | (1L << TOKEN_LLAVE_IZQ) | (1L << TOKEN_COR_IZQ) | (1L << TOKEN_PAR_IZQ) | (1L << TOKEN_NOT) | (1L << TOKEN_MENOS) | (1L << TOKEN_STRING) | (1L << ID) | (1L << TOKEN_INTEGER) | (1L << TOKEN_FLOAT) | (1L << TOKEN_NEWLINE))) != 0)) {
					{
					setState(206);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHILE:
					case FOR:
					case IF:
					case LOG:
					case LEER:
					case FUNCION:
					case FALSE:
					case TRUE:
					case IMPORTAR:
					case RETORNO:
					case DESDE:
					case TOKEN_LLAVE_IZQ:
					case TOKEN_COR_IZQ:
					case TOKEN_PAR_IZQ:
					case TOKEN_NOT:
					case TOKEN_MENOS:
					case TOKEN_STRING:
					case ID:
					case TOKEN_INTEGER:
					case TOKEN_FLOAT:
						{
						setState(204);
						stat();
						}
						break;
					case TOKEN_NEWLINE:
						{
						setState(205);
						match(TOKEN_NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(TOKEN_LLAVE_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_NEWLINE) {
					{
					{
					setState(212);
					match(TOKEN_NEWLINE);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(218);
				stat();
				setState(219);
				match(TOKEN_NEWLINE);
				}
				}
				break;
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

	public static class ArrayContext extends ParserRuleContext {
		public ExprContext start;
		public ExprContext step;
		public ExprContext end;
		public TerminalNode TOKEN_COR_IZQ() { return getToken(TLParser.TOKEN_COR_IZQ, 0); }
		public TerminalNode TOKEN_COR_DER() { return getToken(TLParser.TOKEN_COR_DER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(TLParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(TLParser.TOKEN_COMA, i);
		}
		public List<TerminalNode> TOKEN_DOSP() { return getTokens(TLParser.TOKEN_DOSP); }
		public TerminalNode TOKEN_DOSP(int i) {
			return getToken(TLParser.TOKEN_DOSP, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(TOKEN_COR_IZQ);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << TOKEN_LLAVE_IZQ) | (1L << TOKEN_COR_IZQ) | (1L << TOKEN_PAR_IZQ) | (1L << TOKEN_NOT) | (1L << TOKEN_MENOS) | (1L << TOKEN_STRING) | (1L << ID) | (1L << TOKEN_INTEGER) | (1L << TOKEN_FLOAT))) != 0)) {
					{
					setState(224);
					expr();
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TOKEN_COMA) {
						{
						{
						setState(225);
						match(TOKEN_COMA);
						setState(226);
						expr();
						}
						}
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(234);
				match(TOKEN_COR_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(TOKEN_COR_IZQ);
				setState(236);
				((ArrayContext)_localctx).start = expr();
				setState(237);
				match(TOKEN_DOSP);
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(238);
					((ArrayContext)_localctx).step = expr();
					setState(239);
					match(TOKEN_DOSP);
					}
					break;
				}
				setState(243);
				((ArrayContext)_localctx).end = expr();
				setState(244);
				match(TOKEN_COR_DER);
				}
				break;
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

	public static class AccessarrayContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode TOKEN_COR_IZQ() { return getToken(TLParser.TOKEN_COR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_COR_DER() { return getToken(TLParser.TOKEN_COR_DER, 0); }
		public AccessarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAccessarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAccessarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAccessarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessarrayContext accessarray() throws RecognitionException {
		AccessarrayContext _localctx = new AccessarrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_accessarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			variable();
			setState(249);
			match(TOKEN_COR_IZQ);
			setState(250);
			expr();
			setState(251);
			match(TOKEN_COR_DER);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<TerminalNode> TOKEN_POINT() { return getTokens(TLParser.TOKEN_POINT); }
		public TerminalNode TOKEN_POINT(int i) {
			return getToken(TLParser.TOKEN_POINT, i);
		}
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TLParser.TOKEN_PAR_IZQ, 0); }
		public TerminalNode TOKEN_PAR_DER() { return getToken(TLParser.TOKEN_PAR_DER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(TLParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(TLParser.TOKEN_COMA, i);
		}
		public TerminalNode TOKEN_COR_IZQ() { return getToken(TLParser.TOKEN_COR_IZQ, 0); }
		public TerminalNode TOKEN_COR_DER() { return getToken(TLParser.TOKEN_COR_DER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable);
		int _la;
		try {
			int _alt;
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ID);
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(254);
						match(TOKEN_POINT);
						setState(255);
						match(ID);
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(261);
					match(TOKEN_PAR_IZQ);
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << TOKEN_LLAVE_IZQ) | (1L << TOKEN_COR_IZQ) | (1L << TOKEN_PAR_IZQ) | (1L << TOKEN_NOT) | (1L << TOKEN_MENOS) | (1L << TOKEN_STRING) | (1L << ID) | (1L << TOKEN_INTEGER) | (1L << TOKEN_FLOAT))) != 0)) {
						{
						setState(262);
						expr();
						setState(267);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==TOKEN_COMA) {
							{
							{
							setState(263);
							match(TOKEN_COMA);
							setState(264);
							expr();
							}
							}
							setState(269);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(272);
					match(TOKEN_PAR_DER);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(ID);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_POINT) {
					{
					{
					setState(276);
					match(TOKEN_POINT);
					setState(277);
					match(ID);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(TOKEN_COR_IZQ);
				setState(284);
				expr();
				setState(285);
				match(TOKEN_COR_DER);
				}
				break;
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode TOKEN_ASSIGN() { return getToken(TLParser.TOKEN_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ID);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_ASSIGN) {
				{
				setState(290);
				match(TOKEN_ASSIGN);
				setState(291);
				expr();
				}
			}

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

	public static class ExprContext extends ParserRuleContext {
		public AritmethicalexprContext aritmethicalexpr() {
			return getRuleContext(AritmethicalexprContext.class,0);
		}
		public BooleanexprContext booleanexpr() {
			return getRuleContext(BooleanexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				aritmethicalexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				booleanexpr(0);
				}
				break;
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

	public static class AritmethicalexprContext extends ParserRuleContext {
		public AritmethicalexprContext left;
		public AritmethicalexprContext right;
		public Token op;
		public TerminalNode TOKEN_MENOS() { return getToken(TLParser.TOKEN_MENOS, 0); }
		public List<AritmethicalexprContext> aritmethicalexpr() {
			return getRuleContexts(AritmethicalexprContext.class);
		}
		public AritmethicalexprContext aritmethicalexpr(int i) {
			return getRuleContext(AritmethicalexprContext.class,i);
		}
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TLParser.TOKEN_PAR_IZQ, 0); }
		public TerminalNode TOKEN_PAR_DER() { return getToken(TLParser.TOKEN_PAR_DER, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode TOKEN_POT() { return getToken(TLParser.TOKEN_POT, 0); }
		public TerminalNode TOKEN_MUL() { return getToken(TLParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(TLParser.TOKEN_DIV, 0); }
		public TerminalNode TOKEN_MOD() { return getToken(TLParser.TOKEN_MOD, 0); }
		public TerminalNode TOKEN_MAS() { return getToken(TLParser.TOKEN_MAS, 0); }
		public AritmethicalexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmethicalexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAritmethicalexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAritmethicalexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAritmethicalexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmethicalexprContext aritmethicalexpr() throws RecognitionException {
		return aritmethicalexpr(0);
	}

	private AritmethicalexprContext aritmethicalexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AritmethicalexprContext _localctx = new AritmethicalexprContext(_ctx, _parentState);
		AritmethicalexprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_aritmethicalexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_MENOS:
				{
				setState(299);
				match(TOKEN_MENOS);
				setState(300);
				aritmethicalexpr(5);
				}
				break;
			case TOKEN_PAR_IZQ:
				{
				setState(301);
				match(TOKEN_PAR_IZQ);
				setState(302);
				aritmethicalexpr(0);
				setState(303);
				match(TOKEN_PAR_DER);
				}
				break;
			case FALSE:
			case TRUE:
			case TOKEN_LLAVE_IZQ:
			case TOKEN_COR_IZQ:
			case TOKEN_STRING:
			case ID:
			case TOKEN_INTEGER:
			case TOKEN_FLOAT:
				{
				setState(305);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new AritmethicalexprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aritmethicalexpr);
						setState(308);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(309);
						match(TOKEN_POT);
						setState(310);
						((AritmethicalexprContext)_localctx).right = aritmethicalexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new AritmethicalexprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aritmethicalexpr);
						setState(311);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(312);
						((AritmethicalexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_MUL) | (1L << TOKEN_DIV) | (1L << TOKEN_MOD))) != 0)) ) {
							((AritmethicalexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(313);
						((AritmethicalexprContext)_localctx).right = aritmethicalexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new AritmethicalexprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aritmethicalexpr);
						setState(314);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(315);
						((AritmethicalexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==TOKEN_MAS || _la==TOKEN_MENOS) ) {
							((AritmethicalexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(316);
						((AritmethicalexprContext)_localctx).right = aritmethicalexpr(4);
						}
						break;
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class BooleanexprContext extends ParserRuleContext {
		public BooleanexprContext left;
		public Token op;
		public BooleanexprContext right;
		public TerminalNode TOKEN_NOT() { return getToken(TLParser.TOKEN_NOT, 0); }
		public List<BooleanexprContext> booleanexpr() {
			return getRuleContexts(BooleanexprContext.class);
		}
		public BooleanexprContext booleanexpr(int i) {
			return getRuleContext(BooleanexprContext.class,i);
		}
		public AritmethicalexprContext aritmethicalexpr() {
			return getRuleContext(AritmethicalexprContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(TLParser.TOKEN_MENOR_IGUAL, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(TLParser.TOKEN_MAYOR_IGUAL, 0); }
		public TerminalNode TOKEN_MENOR() { return getToken(TLParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MAYOR() { return getToken(TLParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_IGUAL_NUM() { return getToken(TLParser.TOKEN_IGUAL_NUM, 0); }
		public TerminalNode TOKEN_DIFF_NUM() { return getToken(TLParser.TOKEN_DIFF_NUM, 0); }
		public TerminalNode TOKEN_AND() { return getToken(TLParser.TOKEN_AND, 0); }
		public TerminalNode TOKEN_OR() { return getToken(TLParser.TOKEN_OR, 0); }
		public BooleanexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterBooleanexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitBooleanexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitBooleanexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanexprContext booleanexpr() throws RecognitionException {
		return booleanexpr(0);
	}

	private BooleanexprContext booleanexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanexprContext _localctx = new BooleanexprContext(_ctx, _parentState);
		BooleanexprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_booleanexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(323);
				match(TOKEN_NOT);
				setState(324);
				booleanexpr(7);
				}
				break;
			case 2:
				{
				setState(325);
				aritmethicalexpr(0);
				}
				break;
			case 3:
				{
				setState(326);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanexprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexpr);
						setState(329);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(330);
						((BooleanexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_MAYOR) | (1L << TOKEN_MENOR) | (1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_MENOR_IGUAL))) != 0)) ) {
							((BooleanexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						((BooleanexprContext)_localctx).right = booleanexpr(7);
						}
						break;
					case 2:
						{
						_localctx = new BooleanexprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexpr);
						setState(332);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(333);
						((BooleanexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==TOKEN_IGUAL_NUM || _la==TOKEN_DIFF_NUM) ) {
							((BooleanexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(334);
						((BooleanexprContext)_localctx).right = booleanexpr(6);
						}
						break;
					case 3:
						{
						_localctx = new BooleanexprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexpr);
						setState(335);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(336);
						match(TOKEN_AND);
						setState(337);
						((BooleanexprContext)_localctx).right = booleanexpr(5);
						}
						break;
					case 4:
						{
						_localctx = new BooleanexprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexpr);
						setState(338);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(339);
						match(TOKEN_OR);
						setState(340);
						((BooleanexprContext)_localctx).right = booleanexpr(4);
						}
						break;
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode TOKEN_INTEGER() { return getToken(TLParser.TOKEN_INTEGER, 0); }
		public TerminalNode TOKEN_FLOAT() { return getToken(TLParser.TOKEN_FLOAT, 0); }
		public TerminalNode TRUE() { return getToken(TLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TLParser.FALSE, 0); }
		public TerminalNode TOKEN_STRING() { return getToken(TLParser.TOKEN_STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public EstructuraContext estructura() {
			return getRuleContext(EstructuraContext.class,0);
		}
		public AccessarrayContext accessarray() {
			return getRuleContext(AccessarrayContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atom);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				_la = _input.LA(1);
				if ( !(_la==TOKEN_INTEGER || _la==TOKEN_FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(TOKEN_STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				estructura();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				accessarray();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(352);
				variable();
				}
				break;
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

	public static class EstructuraContext extends ParserRuleContext {
		public TerminalNode TOKEN_LLAVE_IZQ() { return getToken(TLParser.TOKEN_LLAVE_IZQ, 0); }
		public TerminalNode TOKEN_LLAVE_DER() { return getToken(TLParser.TOKEN_LLAVE_DER, 0); }
		public List<KeyvalueContext> keyvalue() {
			return getRuleContexts(KeyvalueContext.class);
		}
		public KeyvalueContext keyvalue(int i) {
			return getRuleContext(KeyvalueContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(TLParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(TLParser.TOKEN_COMA, i);
		}
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(TOKEN_LLAVE_IZQ);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(356);
				keyvalue();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(357);
					match(TOKEN_COMA);
					setState(358);
					keyvalue();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(366);
			match(TOKEN_LLAVE_DER);
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

	public static class KeyvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(TLParser.TOKEN_DOSP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KeyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterKeyvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitKeyvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitKeyvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keyvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(ID);
			setState(369);
			match(TOKEN_DOSP);
			setState(370);
			expr();
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
		case 22:
			return aritmethicalexpr_sempred((AritmethicalexprContext)_localctx, predIndex);
		case 23:
			return booleanexpr_sempred((BooleanexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aritmethicalexpr_sempred(AritmethicalexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean booleanexpr_sempred(BooleanexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0177\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\3\4\3\4\7"+
		"\4B\n\4\f\4\16\4E\13\4\3\4\3\4\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\5\6Q\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\5\b`\n\b\3\b"+
		"\3\b\3\b\5\be\n\b\3\t\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\t\3\t\7\tq\n\t"+
		"\f\t\16\tt\13\t\3\t\7\tw\n\t\f\t\16\tz\13\t\3\t\3\t\5\t~\n\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16"+
		"\5\16\u009e\n\16\3\16\3\16\3\16\7\16\u00a3\n\16\f\16\16\16\u00a6\13\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2\13"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00b8\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00c4\n\21\3\21\3\21\3\22\7\22\u00c9\n\22\f"+
		"\22\16\22\u00cc\13\22\3\22\3\22\3\22\7\22\u00d1\n\22\f\22\16\22\u00d4"+
		"\13\22\3\22\3\22\7\22\u00d8\n\22\f\22\16\22\u00db\13\22\3\22\3\22\3\22"+
		"\5\22\u00e0\n\22\3\23\3\23\3\23\3\23\7\23\u00e6\n\23\f\23\16\23\u00e9"+
		"\13\23\5\23\u00eb\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f4\n"+
		"\23\3\23\3\23\3\23\5\23\u00f9\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\7\25\u0103\n\25\f\25\16\25\u0106\13\25\3\25\3\25\3\25\3\25\7\25"+
		"\u010c\n\25\f\25\16\25\u010f\13\25\5\25\u0111\n\25\3\25\5\25\u0114\n\25"+
		"\3\25\3\25\3\25\7\25\u0119\n\25\f\25\16\25\u011c\13\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0122\n\25\3\26\3\26\3\26\5\26\u0127\n\26\3\27\3\27\5\27\u012b"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0135\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0140\n\30\f\30\16\30\u0143\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\5\31\u014a\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0158\n\31\f\31\16\31\u015b\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0164\n\32\3\33\3\33\3\33"+
		"\3\33\7\33\u016a\n\33\f\33\16\33\u016d\13\33\5\33\u016f\n\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\2\4.\60\35\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\66\2\b\3\2%\'\3\2#$\3\2\31\34\4\2\35\35\37\37"+
		"\3\2/\60\3\2\13\f\2\u0199\2:\3\2\2\2\4<\3\2\2\2\6C\3\2\2\2\bJ\3\2\2\2"+
		"\nP\3\2\2\2\f[\3\2\2\2\16_\3\2\2\2\20f\3\2\2\2\22\177\3\2\2\2\24\u0082"+
		"\3\2\2\2\26\u0088\3\2\2\2\30\u008d\3\2\2\2\32\u0092\3\2\2\2\34\u00b7\3"+
		"\2\2\2\36\u00b9\3\2\2\2 \u00bf\3\2\2\2\"\u00df\3\2\2\2$\u00f8\3\2\2\2"+
		"&\u00fa\3\2\2\2(\u0121\3\2\2\2*\u0123\3\2\2\2,\u012a\3\2\2\2.\u0134\3"+
		"\2\2\2\60\u0149\3\2\2\2\62\u0163\3\2\2\2\64\u0165\3\2\2\2\66\u0172\3\2"+
		"\2\28;\5\4\3\29;\5\6\4\2:8\3\2\2\2:9\3\2\2\2;\3\3\2\2\2<=\5\b\5\2=>\7"+
		"\62\2\2>\5\3\2\2\2?B\5\b\5\2@B\7\62\2\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\2\2\3G\7\3\2\2\2HK\5\f\7"+
		"\2IK\5\n\6\2JH\3\2\2\2JI\3\2\2\2K\t\3\2\2\2LQ\5\20\t\2MQ\5\22\n\2NQ\5"+
		"\24\13\2OQ\5\32\16\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\13\3\2\2"+
		"\2R\\\5\16\b\2S\\\5,\27\2T\\\5\26\f\2U\\\5\30\r\2V\\\5\34\17\2W\\\5\36"+
		"\20\2XY\5\62\32\2YZ\7\62\2\2Z\\\3\2\2\2[R\3\2\2\2[S\3\2\2\2[T\3\2\2\2"+
		"[U\3\2\2\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2\\\r\3\2\2\2]`\5(\25\2^`\5$\23"+
		"\2_]\3\2\2\2_^\3\2\2\2`a\3\2\2\2ad\7)\2\2be\5\16\b\2ce\5,\27\2db\3\2\2"+
		"\2dc\3\2\2\2e\17\3\2\2\2fg\7\5\2\2gk\5 \21\2hj\7\62\2\2ih\3\2\2\2jm\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2lr\3\2\2\2mk\3\2\2\2no\7\6\2\2oq\5 \21\2pn\3"+
		"\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sx\3\2\2\2tr\3\2\2\2uw\7\62\2\2vu"+
		"\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y}\3\2\2\2zx\3\2\2\2{|\7\7\2\2|"+
		"~\5\"\22\2}{\3\2\2\2}~\3\2\2\2~\21\3\2\2\2\177\u0080\7\3\2\2\u0080\u0081"+
		"\5 \21\2\u0081\23\3\2\2\2\u0082\u0083\7\4\2\2\u0083\u0084\7.\2\2\u0084"+
		"\u0085\7\16\2\2\u0085\u0086\5,\27\2\u0086\u0087\5\"\22\2\u0087\25\3\2"+
		"\2\2\u0088\u0089\7\b\2\2\u0089\u008a\7\27\2\2\u008a\u008b\5,\27\2\u008b"+
		"\u008c\7\30\2\2\u008c\27\3\2\2\2\u008d\u008e\7\t\2\2\u008e\u008f\7\27"+
		"\2\2\u008f\u0090\5,\27\2\u0090\u0091\7\30\2\2\u0091\31\3\2\2\2\u0092\u0093"+
		"\7\n\2\2\u0093\u0094\7.\2\2\u0094\u009d\7\27\2\2\u0095\u009a\5*\26\2\u0096"+
		"\u0097\7*\2\2\u0097\u0099\5*\26\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a4\7\30\2\2\u00a0\u00a3\7\62\2\2\u00a1\u00a3\5\b\5\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\7\20\2\2\u00a8\u00a9\7\n\2\2\u00a9\33\3\2\2\2\u00aa\u00ab\7\r\2"+
		"\2\u00ab\u00b0\7.\2\2\u00ac\u00ad\7\36\2\2\u00ad\u00af\7.\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b8\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b5\7"+
		".\2\2\u00b5\u00b6\7\r\2\2\u00b6\u00b8\7.\2\2\u00b7\u00aa\3\2\2\2\u00b7"+
		"\u00b3\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\7\17\2\2\u00ba\u00bb\7\27"+
		"\2\2\u00bb\u00bc\5,\27\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\7\62\2\2\u00be"+
		"\37\3\2\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\5\60\31\2\u00c1\u00c3\7\30"+
		"\2\2\u00c2\u00c4\7\62\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\5\"\22\2\u00c6!\3\2\2\2\u00c7\u00c9\7\62\2"+
		"\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d2\7\23\2\2"+
		"\u00ce\u00d1\5\b\5\2\u00cf\u00d1\7\62\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00e0\7\24\2\2\u00d6\u00d8\7"+
		"\62\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\5\b"+
		"\5\2\u00dd\u00de\7\62\2\2\u00de\u00e0\3\2\2\2\u00df\u00ca\3\2\2\2\u00df"+
		"\u00d9\3\2\2\2\u00e0#\3\2\2\2\u00e1\u00ea\7\25\2\2\u00e2\u00e7\5,\27\2"+
		"\u00e3\u00e4\7*\2\2\u00e4\u00e6\5,\27\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f9\7\26\2\2\u00ed\u00ee\7\25\2\2\u00ee\u00ef\5,\27\2\u00ef"+
		"\u00f3\7+\2\2\u00f0\u00f1\5,\27\2\u00f1\u00f2\7+\2\2\u00f2\u00f4\3\2\2"+
		"\2\u00f3\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6"+
		"\5,\27\2\u00f6\u00f7\7\26\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00e1\3\2\2\2"+
		"\u00f8\u00ed\3\2\2\2\u00f9%\3\2\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\7"+
		"\25\2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\7\26\2\2\u00fe\'\3\2\2\2\u00ff"+
		"\u0104\7.\2\2\u0100\u0101\7\36\2\2\u0101\u0103\7.\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0113\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0110\7\27\2\2\u0108\u010d\5"+
		",\27\2\u0109\u010a\7*\2\2\u010a\u010c\5,\27\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0114\7\30\2\2\u0113\u0107\3\2\2\2\u0113\u0114\3"+
		"\2\2\2\u0114\u0122\3\2\2\2\u0115\u011a\7.\2\2\u0116\u0117\7\36\2\2\u0117"+
		"\u0119\7.\2\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\7\25\2\2\u011e\u011f\5,\27\2\u011f\u0120\7\26\2\2\u0120\u0122\3"+
		"\2\2\2\u0121\u00ff\3\2\2\2\u0121\u0115\3\2\2\2\u0122)\3\2\2\2\u0123\u0126"+
		"\7.\2\2\u0124\u0125\7)\2\2\u0125\u0127\5,\27\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127+\3\2\2\2\u0128\u012b\5.\30\2\u0129\u012b\5\60\31"+
		"\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b-\3\2\2\2\u012c\u012d"+
		"\b\30\1\2\u012d\u012e\7$\2\2\u012e\u0135\5.\30\7\u012f\u0130\7\27\2\2"+
		"\u0130\u0131\5.\30\2\u0131\u0132\7\30\2\2\u0132\u0135\3\2\2\2\u0133\u0135"+
		"\5\62\32\2\u0134\u012c\3\2\2\2\u0134\u012f\3\2\2\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0141\3\2\2\2\u0136\u0137\f\b\2\2\u0137\u0138\7(\2\2\u0138\u0140"+
		"\5.\30\b\u0139\u013a\f\6\2\2\u013a\u013b\t\2\2\2\u013b\u0140\5.\30\7\u013c"+
		"\u013d\f\5\2\2\u013d\u013e\t\3\2\2\u013e\u0140\5.\30\6\u013f\u0136\3\2"+
		"\2\2\u013f\u0139\3\2\2\2\u013f\u013c\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142/\3\2\2\2\u0143\u0141\3\2\2\2"+
		"\u0144\u0145\b\31\1\2\u0145\u0146\7\"\2\2\u0146\u014a\5\60\31\t\u0147"+
		"\u014a\5.\30\2\u0148\u014a\5\62\32\2\u0149\u0144\3\2\2\2\u0149\u0147\3"+
		"\2\2\2\u0149\u0148\3\2\2\2\u014a\u0159\3\2\2\2\u014b\u014c\f\b\2\2\u014c"+
		"\u014d\t\4\2\2\u014d\u0158\5\60\31\t\u014e\u014f\f\7\2\2\u014f\u0150\t"+
		"\5\2\2\u0150\u0158\5\60\31\b\u0151\u0152\f\6\2\2\u0152\u0153\7 \2\2\u0153"+
		"\u0158\5\60\31\7\u0154\u0155\f\5\2\2\u0155\u0156\7!\2\2\u0156\u0158\5"+
		"\60\31\6\u0157\u014b\3\2\2\2\u0157\u014e\3\2\2\2\u0157\u0151\3\2\2\2\u0157"+
		"\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\61\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0164\t\6\2\2\u015d\u0164"+
		"\t\7\2\2\u015e\u0164\7,\2\2\u015f\u0164\5$\23\2\u0160\u0164\5\64\33\2"+
		"\u0161\u0164\5&\24\2\u0162\u0164\5(\25\2\u0163\u015c\3\2\2\2\u0163\u015d"+
		"\3\2\2\2\u0163\u015e\3\2\2\2\u0163\u015f\3\2\2\2\u0163\u0160\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\63\3\2\2\2\u0165\u016e\7\23\2"+
		"\2\u0166\u016b\5\66\34\2\u0167\u0168\7*\2\2\u0168\u016a\5\66\34\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0166\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\24\2\2\u0171\65\3\2\2"+
		"\2\u0172\u0173\7.\2\2\u0173\u0174\7+\2\2\u0174\u0175\5,\27\2\u0175\67"+
		"\3\2\2\2/:ACJP[_dkrx}\u009a\u009d\u00a2\u00a4\u00b0\u00b7\u00c3\u00ca"+
		"\u00d0\u00d2\u00d9\u00df\u00e7\u00ea\u00f3\u00f8\u0104\u010d\u0110\u0113"+
		"\u011a\u0121\u0126\u012a\u0134\u013f\u0141\u0149\u0157\u0159\u0163\u016b"+
		"\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}