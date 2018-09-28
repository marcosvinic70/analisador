// Generated from /home/marcos/workspace/analisador-lexico/src/Scanner.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, BOOLEAN=2, BYTE=3, CASE=4, CATCH=5, CHAR=6, CLASS=7, CONST=8, 
		CONTINUE=9, BREAK=10, DO=11, DOUBLE=12, ELSE=13, ENUM=14, EXTENDS=15, 
		FALSE=16, FINAL=17, FLOAT=18, GOTO=19, IF=20, IMPORT=21, INSTANCEOF=22, 
		INT=23, LONG=24, NEW=25, PACKAGE=26, PRIVATE=27, PROTECTED=28, PUBLIC=29, 
		RETURN=30, SWITCH=31, STATIC=32, SUPER=33, THIS=34, TRUE=35, THROW=36, 
		THROWS=37, TRY=38, VOID=39, WHILE=40, ASSIGN=41, GT=42, LT=43, BANG=44, 
		EQUAL=45, LE=46, GE=47, NOTEQUAL=48, AND=49, OR=50, INC=51, DEC=52, ADD=53, 
		SUB=54, MUL=55, DIV=56, ADD_ASSIGN=57, SUB_ASSIGN=58, MUL_ASSIGN=59, DIV_ASSIGN=60, 
		LPAREN=61, RPAREN=62, LBRACE=63, RBRACE=64, LBRACK=65, RBRACK=66, SEMI=67, 
		COMMA=68, DOT=69, IDENTIFIER=70, UNSIGNED_INTEGER=71, INTEGER=72, UNSIGNED_REAL=73, 
		REAL=74, BOOL=75, STRING=76, LINE_COMMENT=77, WHITESPACE=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ABSTRACT", "BOOLEAN", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "BREAK", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FALSE", 
		"FINAL", "FLOAT", "GOTO", "IF", "IMPORT", "INSTANCEOF", "INT", "LONG", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SWITCH", 
		"STATIC", "SUPER", "THIS", "TRUE", "THROW", "THROWS", "TRY", "VOID", "WHILE", 
		"ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "SEMI", "COMMA", "DOT", "IDENTIFIER", "UNSIGNED_INTEGER", "INTEGER", 
		"UNSIGNED_REAL", "REAL", "BOOL", "STRING", "LINE_COMMENT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'boolean'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'break'", "'do'", "'double'", "'else'", 
		"'enum'", "'extends'", "'false'", "'final'", "'float'", "'goto'", "'if'", 
		"'import'", "'instanceof'", "'int'", "'long'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'switch'", "'static'", "'super'", 
		"'this'", "'true'", "'throw'", "'throws'", "'try'", "'void'", "'while'", 
		"'='", "'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'+='", "'-='", "'*='", "'/='", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "BOOLEAN", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
		"CONST", "CONTINUE", "BREAK", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", 
		"FALSE", "FINAL", "FLOAT", "GOTO", "IF", "IMPORT", "INSTANCEOF", "INT", 
		"LONG", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
		"SWITCH", "STATIC", "SUPER", "THIS", "TRUE", "THROW", "THROWS", "TRY", 
		"VOID", "WHILE", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "SEMI", "COMMA", "DOT", "IDENTIFIER", "UNSIGNED_INTEGER", "INTEGER", 
		"UNSIGNED_REAL", "REAL", "BOOL", "STRING", "LINE_COMMENT", "WHITESPACE"
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u0231\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\5G\u01df\nG\3G\7G\u01e2\nG\fG\16G\u01e5"+
		"\13G\3H\6H\u01e8\nH\rH\16H\u01e9\3I\7I\u01ed\nI\fI\16I\u01f0\13I\3I\6"+
		"I\u01f3\nI\rI\16I\u01f4\3J\6J\u01f8\nJ\rJ\16J\u01f9\3J\3J\6J\u01fe\nJ"+
		"\rJ\16J\u01ff\3K\7K\u0203\nK\fK\16K\u0206\13K\3K\6K\u0209\nK\rK\16K\u020a"+
		"\3K\3K\6K\u020f\nK\rK\16K\u0210\3L\3L\5L\u0215\nL\3M\3M\7M\u0219\nM\f"+
		"M\16M\u021c\13M\3M\3M\3N\3N\3N\3N\7N\u0224\nN\fN\16N\u0227\13N\3N\3N\3"+
		"O\6O\u022c\nO\rO\16O\u022d\3O\3O\3\u021a\2P\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;"+
		"\4\2\f\f\17\17\6\2\13\f\16\17\"\"vv\2\u023d\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u009f\3\2\2\2\5\u00a8\3\2\2\2\7\u00b0"+
		"\3\2\2\2\t\u00b5\3\2\2\2\13\u00ba\3\2\2\2\r\u00c0\3\2\2\2\17\u00c5\3\2"+
		"\2\2\21\u00cb\3\2\2\2\23\u00d1\3\2\2\2\25\u00da\3\2\2\2\27\u00e0\3\2\2"+
		"\2\31\u00e3\3\2\2\2\33\u00ea\3\2\2\2\35\u00ef\3\2\2\2\37\u00f4\3\2\2\2"+
		"!\u00fc\3\2\2\2#\u0102\3\2\2\2%\u0108\3\2\2\2\'\u010e\3\2\2\2)\u0113\3"+
		"\2\2\2+\u0116\3\2\2\2-\u011d\3\2\2\2/\u0128\3\2\2\2\61\u012c\3\2\2\2\63"+
		"\u0131\3\2\2\2\65\u0135\3\2\2\2\67\u013d\3\2\2\29\u0145\3\2\2\2;\u014f"+
		"\3\2\2\2=\u0156\3\2\2\2?\u015d\3\2\2\2A\u0164\3\2\2\2C\u016b\3\2\2\2E"+
		"\u0171\3\2\2\2G\u0176\3\2\2\2I\u017b\3\2\2\2K\u0181\3\2\2\2M\u0188\3\2"+
		"\2\2O\u018c\3\2\2\2Q\u0191\3\2\2\2S\u0197\3\2\2\2U\u0199\3\2\2\2W\u019b"+
		"\3\2\2\2Y\u019d\3\2\2\2[\u019f\3\2\2\2]\u01a2\3\2\2\2_\u01a5\3\2\2\2a"+
		"\u01a8\3\2\2\2c\u01ab\3\2\2\2e\u01ae\3\2\2\2g\u01b1\3\2\2\2i\u01b4\3\2"+
		"\2\2k\u01b7\3\2\2\2m\u01b9\3\2\2\2o\u01bb\3\2\2\2q\u01bd\3\2\2\2s\u01bf"+
		"\3\2\2\2u\u01c2\3\2\2\2w\u01c5\3\2\2\2y\u01c8\3\2\2\2{\u01cb\3\2\2\2}"+
		"\u01cd\3\2\2\2\177\u01cf\3\2\2\2\u0081\u01d1\3\2\2\2\u0083\u01d3\3\2\2"+
		"\2\u0085\u01d5\3\2\2\2\u0087\u01d7\3\2\2\2\u0089\u01d9\3\2\2\2\u008b\u01db"+
		"\3\2\2\2\u008d\u01de\3\2\2\2\u008f\u01e7\3\2\2\2\u0091\u01ee\3\2\2\2\u0093"+
		"\u01f7\3\2\2\2\u0095\u0204\3\2\2\2\u0097\u0214\3\2\2\2\u0099\u0216\3\2"+
		"\2\2\u009b\u021f\3\2\2\2\u009d\u022b\3\2\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7d\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7t\2\2"+
		"\u00a4\u00a5\7c\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7v\2\2\u00a7\4\3\2"+
		"\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac"+
		"\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7p\2\2\u00af"+
		"\6\3\2\2\2\u00b0\u00b1\7d\2\2\u00b1\u00b2\7{\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\b\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\n\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7j\2\2"+
		"\u00bf\f\3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7c"+
		"\2\2\u00c3\u00c4\7t\2\2\u00c4\16\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7u\2\2\u00ca"+
		"\20\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7p\2\2\u00ce"+
		"\u00cf\7u\2\2\u00cf\u00d0\7v\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\7e\2\2\u00d2"+
		"\u00d3\7q\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7k\2\2"+
		"\u00d6\u00d7\7p\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7g\2\2\u00d9\24\3\2"+
		"\2\2\u00da\u00db\7d\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de"+
		"\7c\2\2\u00de\u00df\7m\2\2\u00df\26\3\2\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2"+
		"\7q\2\2\u00e2\30\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6"+
		"\7w\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g\2\2\u00e9"+
		"\32\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7u\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\34\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1"+
		"\u00f2\7w\2\2\u00f2\u00f3\7o\2\2\u00f3\36\3\2\2\2\u00f4\u00f5\7g\2\2\u00f5"+
		"\u00f6\7z\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2"+
		"\u00f9\u00fa\7f\2\2\u00fa\u00fb\7u\2\2\u00fb \3\2\2\2\u00fc\u00fd\7h\2"+
		"\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7u\2\2\u0100\u0101"+
		"\7g\2\2\u0101\"\3\2\2\2\u0102\u0103\7h\2\2\u0103\u0104\7k\2\2\u0104\u0105"+
		"\7p\2\2\u0105\u0106\7c\2\2\u0106\u0107\7n\2\2\u0107$\3\2\2\2\u0108\u0109"+
		"\7h\2\2\u0109\u010a\7n\2\2\u010a\u010b\7q\2\2\u010b\u010c\7c\2\2\u010c"+
		"\u010d\7v\2\2\u010d&\3\2\2\2\u010e\u010f\7i\2\2\u010f\u0110\7q\2\2\u0110"+
		"\u0111\7v\2\2\u0111\u0112\7q\2\2\u0112(\3\2\2\2\u0113\u0114\7k\2\2\u0114"+
		"\u0115\7h\2\2\u0115*\3\2\2\2\u0116\u0117\7k\2\2\u0117\u0118\7o\2\2\u0118"+
		"\u0119\7r\2\2\u0119\u011a\7q\2\2\u011a\u011b\7t\2\2\u011b\u011c\7v\2\2"+
		"\u011c,\3\2\2\2\u011d\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7u\2"+
		"\2\u0120\u0121\7v\2\2\u0121\u0122\7c\2\2\u0122\u0123\7p\2\2\u0123\u0124"+
		"\7e\2\2\u0124\u0125\7g\2\2\u0125\u0126\7q\2\2\u0126\u0127\7h\2\2\u0127"+
		".\3\2\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a\u012b\7v\2\2\u012b"+
		"\60\3\2\2\2\u012c\u012d\7n\2\2\u012d\u012e\7q\2\2\u012e\u012f\7p\2\2\u012f"+
		"\u0130\7i\2\2\u0130\62\3\2\2\2\u0131\u0132\7p\2\2\u0132\u0133\7g\2\2\u0133"+
		"\u0134\7y\2\2\u0134\64\3\2\2\2\u0135\u0136\7r\2\2\u0136\u0137\7c\2\2\u0137"+
		"\u0138\7e\2\2\u0138\u0139\7m\2\2\u0139\u013a\7c\2\2\u013a\u013b\7i\2\2"+
		"\u013b\u013c\7g\2\2\u013c\66\3\2\2\2\u013d\u013e\7r\2\2\u013e\u013f\7"+
		"t\2\2\u013f\u0140\7k\2\2\u0140\u0141\7x\2\2\u0141\u0142\7c\2\2\u0142\u0143"+
		"\7v\2\2\u0143\u0144\7g\2\2\u01448\3\2\2\2\u0145\u0146\7r\2\2\u0146\u0147"+
		"\7t\2\2\u0147\u0148\7q\2\2\u0148\u0149\7v\2\2\u0149\u014a\7g\2\2\u014a"+
		"\u014b\7e\2\2\u014b\u014c\7v\2\2\u014c\u014d\7g\2\2\u014d\u014e\7f\2\2"+
		"\u014e:\3\2\2\2\u014f\u0150\7r\2\2\u0150\u0151\7w\2\2\u0151\u0152\7d\2"+
		"\2\u0152\u0153\7n\2\2\u0153\u0154\7k\2\2\u0154\u0155\7e\2\2\u0155<\3\2"+
		"\2\2\u0156\u0157\7t\2\2\u0157\u0158\7g\2\2\u0158\u0159\7v\2\2\u0159\u015a"+
		"\7w\2\2\u015a\u015b\7t\2\2\u015b\u015c\7p\2\2\u015c>\3\2\2\2\u015d\u015e"+
		"\7u\2\2\u015e\u015f\7y\2\2\u015f\u0160\7k\2\2\u0160\u0161\7v\2\2\u0161"+
		"\u0162\7e\2\2\u0162\u0163\7j\2\2\u0163@\3\2\2\2\u0164\u0165\7u\2\2\u0165"+
		"\u0166\7v\2\2\u0166\u0167\7c\2\2\u0167\u0168\7v\2\2\u0168\u0169\7k\2\2"+
		"\u0169\u016a\7e\2\2\u016aB\3\2\2\2\u016b\u016c\7u\2\2\u016c\u016d\7w\2"+
		"\2\u016d\u016e\7r\2\2\u016e\u016f\7g\2\2\u016f\u0170\7t\2\2\u0170D\3\2"+
		"\2\2\u0171\u0172\7v\2\2\u0172\u0173\7j\2\2\u0173\u0174\7k\2\2\u0174\u0175"+
		"\7u\2\2\u0175F\3\2\2\2\u0176\u0177\7v\2\2\u0177\u0178\7t\2\2\u0178\u0179"+
		"\7w\2\2\u0179\u017a\7g\2\2\u017aH\3\2\2\2\u017b\u017c\7v\2\2\u017c\u017d"+
		"\7j\2\2\u017d\u017e\7t\2\2\u017e\u017f\7q\2\2\u017f\u0180\7y\2\2\u0180"+
		"J\3\2\2\2\u0181\u0182\7v\2\2\u0182\u0183\7j\2\2\u0183\u0184\7t\2\2\u0184"+
		"\u0185\7q\2\2\u0185\u0186\7y\2\2\u0186\u0187\7u\2\2\u0187L\3\2\2\2\u0188"+
		"\u0189\7v\2\2\u0189\u018a\7t\2\2\u018a\u018b\7{\2\2\u018bN\3\2\2\2\u018c"+
		"\u018d\7x\2\2\u018d\u018e\7q\2\2\u018e\u018f\7k\2\2\u018f\u0190\7f\2\2"+
		"\u0190P\3\2\2\2\u0191\u0192\7y\2\2\u0192\u0193\7j\2\2\u0193\u0194\7k\2"+
		"\2\u0194\u0195\7n\2\2\u0195\u0196\7g\2\2\u0196R\3\2\2\2\u0197\u0198\7"+
		"?\2\2\u0198T\3\2\2\2\u0199\u019a\7@\2\2\u019aV\3\2\2\2\u019b\u019c\7>"+
		"\2\2\u019cX\3\2\2\2\u019d\u019e\7#\2\2\u019eZ\3\2\2\2\u019f\u01a0\7?\2"+
		"\2\u01a0\u01a1\7?\2\2\u01a1\\\3\2\2\2\u01a2\u01a3\7>\2\2\u01a3\u01a4\7"+
		"?\2\2\u01a4^\3\2\2\2\u01a5\u01a6\7@\2\2\u01a6\u01a7\7?\2\2\u01a7`\3\2"+
		"\2\2\u01a8\u01a9\7#\2\2\u01a9\u01aa\7?\2\2\u01aab\3\2\2\2\u01ab\u01ac"+
		"\7(\2\2\u01ac\u01ad\7(\2\2\u01add\3\2\2\2\u01ae\u01af\7~\2\2\u01af\u01b0"+
		"\7~\2\2\u01b0f\3\2\2\2\u01b1\u01b2\7-\2\2\u01b2\u01b3\7-\2\2\u01b3h\3"+
		"\2\2\2\u01b4\u01b5\7/\2\2\u01b5\u01b6\7/\2\2\u01b6j\3\2\2\2\u01b7\u01b8"+
		"\7-\2\2\u01b8l\3\2\2\2\u01b9\u01ba\7/\2\2\u01ban\3\2\2\2\u01bb\u01bc\7"+
		",\2\2\u01bcp\3\2\2\2\u01bd\u01be\7\61\2\2\u01ber\3\2\2\2\u01bf\u01c0\7"+
		"-\2\2\u01c0\u01c1\7?\2\2\u01c1t\3\2\2\2\u01c2\u01c3\7/\2\2\u01c3\u01c4"+
		"\7?\2\2\u01c4v\3\2\2\2\u01c5\u01c6\7,\2\2\u01c6\u01c7\7?\2\2\u01c7x\3"+
		"\2\2\2\u01c8\u01c9\7\61\2\2\u01c9\u01ca\7?\2\2\u01caz\3\2\2\2\u01cb\u01cc"+
		"\7*\2\2\u01cc|\3\2\2\2\u01cd\u01ce\7+\2\2\u01ce~\3\2\2\2\u01cf\u01d0\7"+
		"}\2\2\u01d0\u0080\3\2\2\2\u01d1\u01d2\7\177\2\2\u01d2\u0082\3\2\2\2\u01d3"+
		"\u01d4\7]\2\2\u01d4\u0084\3\2\2\2\u01d5\u01d6\7_\2\2\u01d6\u0086\3\2\2"+
		"\2\u01d7\u01d8\7=\2\2\u01d8\u0088\3\2\2\2\u01d9\u01da\7.\2\2\u01da\u008a"+
		"\3\2\2\2\u01db\u01dc\7\60\2\2\u01dc\u008c\3\2\2\2\u01dd\u01df\t\2\2\2"+
		"\u01de\u01dd\3\2\2\2\u01df\u01e3\3\2\2\2\u01e0\u01e2\t\3\2\2\u01e1\u01e0"+
		"\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u008e\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\t\4\2\2\u01e7\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u0090\3\2\2\2\u01eb\u01ed\7/\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2"+
		"\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f3\t\4\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u0092\3\2\2\2\u01f6"+
		"\u01f8\t\4\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\7\60\2\2\u01fc"+
		"\u01fe\t\4\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2"+
		"\2\2\u01ff\u0200\3\2\2\2\u0200\u0094\3\2\2\2\u0201\u0203\7/\2\2\u0202"+
		"\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\t\4\2\2\u0208"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020e\7\60\2\2\u020d\u020f\t\4\2\2\u020e"+
		"\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0096\3\2\2\2\u0212\u0215\5G$\2\u0213\u0215\5!\21\2\u0214\u0212"+
		"\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u0098\3\2\2\2\u0216\u021a\7$\2\2\u0217"+
		"\u0219\13\2\2\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u021b\3"+
		"\2\2\2\u021a\u0218\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d"+
		"\u021e\7$\2\2\u021e\u009a\3\2\2\2\u021f\u0220\7\61\2\2\u0220\u0221\7\61"+
		"\2\2\u0221\u0225\3\2\2\2\u0222\u0224\n\5\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0228\u0229\bN\2\2\u0229\u009c\3\2\2\2\u022a"+
		"\u022c\t\6\2\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\bO\2\2\u0230"+
		"\u009e\3\2\2\2\22\2\u01de\u01e1\u01e3\u01e9\u01ee\u01f4\u01f9\u01ff\u0204"+
		"\u020a\u0210\u0214\u021a\u0225\u022d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}