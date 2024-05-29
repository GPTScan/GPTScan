// Generated from d:\LogicGPTCode\antlr4helper\SolidityParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ReservedKeywords=1, Abstract=2, Address=3, Anonymous=4, As=5, Assembly=6, 
		Bool=7, Break=8, Bytes=9, Calldata=10, Catch=11, Constant=12, Constructor=13, 
		Continue=14, Contract=15, Delete=16, Do=17, Else=18, Emit=19, Enum=20, 
		Error=21, Event=22, External=23, Fallback=24, False=25, Fixed=26, FixedBytes=27, 
		For=28, From=29, Function=30, Global=31, Hex=32, If=33, Immutable=34, 
		Import=35, Indexed=36, Interface=37, Internal=38, Is=39, Library=40, Mapping=41, 
		Memory=42, Modifier=43, New=44, NumberUnit=45, Override=46, Payable=47, 
		Pragma=48, Private=49, Public=50, Pure=51, Receive=52, Return=53, Returns=54, 
		Revert=55, SignedIntegerType=56, Storage=57, String=58, Struct=59, True=60, 
		Try=61, Type=62, Ufixed=63, Unchecked=64, UnsignedIntegerType=65, Using=66, 
		View=67, Virtual=68, While=69, LParen=70, RParen=71, LBrack=72, RBrack=73, 
		LBrace=74, RBrace=75, Colon=76, Semicolon=77, Period=78, Conditional=79, 
		DoubleArrow=80, RightArrow=81, Assign=82, AssignBitOr=83, AssignBitXor=84, 
		AssignBitAnd=85, AssignShl=86, AssignSar=87, AssignShr=88, AssignAdd=89, 
		AssignSub=90, AssignMul=91, AssignDiv=92, AssignMod=93, Comma=94, Or=95, 
		And=96, BitOr=97, BitXor=98, BitAnd=99, Shl=100, Sar=101, Shr=102, Add=103, 
		Sub=104, Mul=105, Div=106, Mod=107, Exp=108, Equal=109, NotEqual=110, 
		LessThan=111, GreaterThan=112, LessThanOrEqual=113, GreaterThanOrEqual=114, 
		Not=115, BitNot=116, Inc=117, Dec=118, DoubleQuote=119, SingleQuote=120, 
		NonEmptyStringLiteral=121, EmptyStringLiteral=122, UnicodeStringLiteral=123, 
		HexString=124, HexNumber=125, DecimalNumber=126, Identifier=127, WS=128, 
		COMMENT=129, LINE_COMMENT=130, AssemblyDialect=131, AssemblyLBrace=132, 
		AssemblyFlagString=133, AssemblyBlockLParen=134, AssemblyBlockRParen=135, 
		AssemblyBlockComma=136, AssemblyBlockWS=137, AssemblyBlockCOMMENT=138, 
		AssemblyBlockLINE_COMMENT=139, YulBreak=140, YulCase=141, YulContinue=142, 
		YulDefault=143, YulFalse=144, YulFor=145, YulFunction=146, YulIf=147, 
		YulLeave=148, YulLet=149, YulSwitch=150, YulTrue=151, YulHex=152, YulEVMBuiltin=153, 
		YulLBrace=154, YulRBrace=155, YulLParen=156, YulRParen=157, YulAssign=158, 
		YulPeriod=159, YulComma=160, YulArrow=161, YulIdentifier=162, YulHexNumber=163, 
		YulDecimalNumber=164, YulStringLiteral=165, YulHexStringLiteral=166, YulWS=167, 
		YulCOMMENT=168, YulLINE_COMMENT=169, PragmaToken=170, PragmaSemicolon=171, 
		PragmaWS=172, PragmaCOMMENT=173, PragmaLINE_COMMENT=174;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_importDirective = 2, 
		RULE_importAliases = 3, RULE_path = 4, RULE_symbolAliases = 5, RULE_contractDefinition = 6, 
		RULE_interfaceDefinition = 7, RULE_libraryDefinition = 8, RULE_inheritanceSpecifierList = 9, 
		RULE_inheritanceSpecifier = 10, RULE_contractBodyElement = 11, RULE_namedArgument = 12, 
		RULE_callArgumentList = 13, RULE_identifierPath = 14, RULE_modifierInvocation = 15, 
		RULE_visibility = 16, RULE_parameterList = 17, RULE_parameterDeclaration = 18, 
		RULE_constructorDefinition = 19, RULE_stateMutability = 20, RULE_overrideSpecifier = 21, 
		RULE_functionDefinition = 22, RULE_modifierDefinition = 23, RULE_fallbackFunctionDefinition = 24, 
		RULE_receiveFunctionDefinition = 25, RULE_structDefinition = 26, RULE_structMember = 27, 
		RULE_enumDefinition = 28, RULE_userDefinedValueTypeDefinition = 29, RULE_stateVariableDeclaration = 30, 
		RULE_constantVariableDeclaration = 31, RULE_eventParameter = 32, RULE_eventDefinition = 33, 
		RULE_errorParameter = 34, RULE_errorDefinition = 35, RULE_userDefinableOperator = 36, 
		RULE_usingDirective = 37, RULE_typeName = 38, RULE_elementaryTypeName = 39, 
		RULE_functionTypeName = 40, RULE_variableDeclaration = 41, RULE_dataLocation = 42, 
		RULE_expression = 43, RULE_assignOp = 44, RULE_tupleExpression = 45, RULE_inlineArrayExpression = 46, 
		RULE_identifier = 47, RULE_literal = 48, RULE_booleanLiteral = 49, RULE_stringLiteral = 50, 
		RULE_hexStringLiteral = 51, RULE_unicodeStringLiteral = 52, RULE_numberLiteral = 53, 
		RULE_block = 54, RULE_uncheckedBlock = 55, RULE_statement = 56, RULE_simpleStatement = 57, 
		RULE_ifStatement = 58, RULE_forStatement = 59, RULE_whileStatement = 60, 
		RULE_doWhileStatement = 61, RULE_continueStatement = 62, RULE_breakStatement = 63, 
		RULE_tryStatement = 64, RULE_catchClause = 65, RULE_returnStatement = 66, 
		RULE_emitStatement = 67, RULE_revertStatement = 68, RULE_assemblyStatement = 69, 
		RULE_assemblyFlags = 70, RULE_variableDeclarationList = 71, RULE_variableDeclarationTuple = 72, 
		RULE_variableDeclarationStatement = 73, RULE_expressionStatement = 74, 
		RULE_mappingType = 75, RULE_mappingKeyType = 76, RULE_yulStatement = 77, 
		RULE_yulBlock = 78, RULE_yulVariableDeclaration = 79, RULE_yulAssignment = 80, 
		RULE_yulIfStatement = 81, RULE_yulForStatement = 82, RULE_yulSwitchCase = 83, 
		RULE_yulSwitchStatement = 84, RULE_yulFunctionDefinition = 85, RULE_yulPath = 86, 
		RULE_yulFunctionCall = 87, RULE_yulBoolean = 88, RULE_yulLiteral = 89, 
		RULE_yulExpression = 90;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "importDirective", "importAliases", 
			"path", "symbolAliases", "contractDefinition", "interfaceDefinition", 
			"libraryDefinition", "inheritanceSpecifierList", "inheritanceSpecifier", 
			"contractBodyElement", "namedArgument", "callArgumentList", "identifierPath", 
			"modifierInvocation", "visibility", "parameterList", "parameterDeclaration", 
			"constructorDefinition", "stateMutability", "overrideSpecifier", "functionDefinition", 
			"modifierDefinition", "fallbackFunctionDefinition", "receiveFunctionDefinition", 
			"structDefinition", "structMember", "enumDefinition", "userDefinedValueTypeDefinition", 
			"stateVariableDeclaration", "constantVariableDeclaration", "eventParameter", 
			"eventDefinition", "errorParameter", "errorDefinition", "userDefinableOperator", 
			"usingDirective", "typeName", "elementaryTypeName", "functionTypeName", 
			"variableDeclaration", "dataLocation", "expression", "assignOp", "tupleExpression", 
			"inlineArrayExpression", "identifier", "literal", "booleanLiteral", "stringLiteral", 
			"hexStringLiteral", "unicodeStringLiteral", "numberLiteral", "block", 
			"uncheckedBlock", "statement", "simpleStatement", "ifStatement", "forStatement", 
			"whileStatement", "doWhileStatement", "continueStatement", "breakStatement", 
			"tryStatement", "catchClause", "returnStatement", "emitStatement", "revertStatement", 
			"assemblyStatement", "assemblyFlags", "variableDeclarationList", "variableDeclarationTuple", 
			"variableDeclarationStatement", "expressionStatement", "mappingType", 
			"mappingKeyType", "yulStatement", "yulBlock", "yulVariableDeclaration", 
			"yulAssignment", "yulIfStatement", "yulForStatement", "yulSwitchCase", 
			"yulSwitchStatement", "yulFunctionDefinition", "yulPath", "yulFunctionCall", 
			"yulBoolean", "yulLiteral", "yulExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'abstract'", "'address'", "'anonymous'", "'as'", "'assembly'", 
			"'bool'", null, "'bytes'", "'calldata'", "'catch'", "'constant'", "'constructor'", 
			null, "'contract'", "'delete'", "'do'", "'else'", "'emit'", "'enum'", 
			"'error'", "'event'", "'external'", "'fallback'", null, null, null, null, 
			"'from'", null, "'global'", null, null, "'immutable'", "'import'", "'indexed'", 
			"'interface'", "'internal'", "'is'", "'library'", "'mapping'", "'memory'", 
			"'modifier'", "'new'", null, "'override'", "'payable'", "'pragma'", "'private'", 
			"'public'", "'pure'", "'receive'", "'return'", "'returns'", "'revert'", 
			null, "'storage'", "'string'", "'struct'", null, "'try'", "'type'", null, 
			"'unchecked'", null, "'using'", "'view'", "'virtual'", "'while'", null, 
			null, "'['", "']'", null, null, "':'", null, null, "'?'", "'=>'", null, 
			"'='", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", null, "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", 
			"'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'!'", "'~'", "'++'", "'--'", "'\"'", "'''", 
			null, null, null, null, null, null, null, null, null, null, "'\"evmasm\"'", 
			null, null, null, null, null, null, null, null, null, "'case'", null, 
			"'default'", null, null, null, null, "'leave'", "'let'", "'switch'", 
			null, null, null, null, null, null, null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ReservedKeywords", "Abstract", "Address", "Anonymous", "As", "Assembly", 
			"Bool", "Break", "Bytes", "Calldata", "Catch", "Constant", "Constructor", 
			"Continue", "Contract", "Delete", "Do", "Else", "Emit", "Enum", "Error", 
			"Event", "External", "Fallback", "False", "Fixed", "FixedBytes", "For", 
			"From", "Function", "Global", "Hex", "If", "Immutable", "Import", "Indexed", 
			"Interface", "Internal", "Is", "Library", "Mapping", "Memory", "Modifier", 
			"New", "NumberUnit", "Override", "Payable", "Pragma", "Private", "Public", 
			"Pure", "Receive", "Return", "Returns", "Revert", "SignedIntegerType", 
			"Storage", "String", "Struct", "True", "Try", "Type", "Ufixed", "Unchecked", 
			"UnsignedIntegerType", "Using", "View", "Virtual", "While", "LParen", 
			"RParen", "LBrack", "RBrack", "LBrace", "RBrace", "Colon", "Semicolon", 
			"Period", "Conditional", "DoubleArrow", "RightArrow", "Assign", "AssignBitOr", 
			"AssignBitXor", "AssignBitAnd", "AssignShl", "AssignSar", "AssignShr", 
			"AssignAdd", "AssignSub", "AssignMul", "AssignDiv", "AssignMod", "Comma", 
			"Or", "And", "BitOr", "BitXor", "BitAnd", "Shl", "Sar", "Shr", "Add", 
			"Sub", "Mul", "Div", "Mod", "Exp", "Equal", "NotEqual", "LessThan", "GreaterThan", 
			"LessThanOrEqual", "GreaterThanOrEqual", "Not", "BitNot", "Inc", "Dec", 
			"DoubleQuote", "SingleQuote", "NonEmptyStringLiteral", "EmptyStringLiteral", 
			"UnicodeStringLiteral", "HexString", "HexNumber", "DecimalNumber", "Identifier", 
			"WS", "COMMENT", "LINE_COMMENT", "AssemblyDialect", "AssemblyLBrace", 
			"AssemblyFlagString", "AssemblyBlockLParen", "AssemblyBlockRParen", "AssemblyBlockComma", 
			"AssemblyBlockWS", "AssemblyBlockCOMMENT", "AssemblyBlockLINE_COMMENT", 
			"YulBreak", "YulCase", "YulContinue", "YulDefault", "YulFalse", "YulFor", 
			"YulFunction", "YulIf", "YulLeave", "YulLet", "YulSwitch", "YulTrue", 
			"YulHex", "YulEVMBuiltin", "YulLBrace", "YulRBrace", "YulLParen", "YulRParen", 
			"YulAssign", "YulPeriod", "YulComma", "YulArrow", "YulIdentifier", "YulHexNumber", 
			"YulDecimalNumber", "YulStringLiteral", "YulHexStringLiteral", "YulWS", 
			"YulCOMMENT", "YulLINE_COMMENT", "PragmaToken", "PragmaSemicolon", "PragmaWS", 
			"PragmaCOMMENT", "PragmaLINE_COMMENT"
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
	public String getGrammarFileName() { return "SolidityParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<UsingDirectiveContext> usingDirective() {
			return getRuleContexts(UsingDirectiveContext.class);
		}
		public UsingDirectiveContext usingDirective(int i) {
			return getRuleContext(UsingDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public List<InterfaceDefinitionContext> interfaceDefinition() {
			return getRuleContexts(InterfaceDefinitionContext.class);
		}
		public InterfaceDefinitionContext interfaceDefinition(int i) {
			return getRuleContext(InterfaceDefinitionContext.class,i);
		}
		public List<LibraryDefinitionContext> libraryDefinition() {
			return getRuleContexts(LibraryDefinitionContext.class);
		}
		public LibraryDefinitionContext libraryDefinition(int i) {
			return getRuleContext(LibraryDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<ConstantVariableDeclarationContext> constantVariableDeclaration() {
			return getRuleContexts(ConstantVariableDeclarationContext.class);
		}
		public ConstantVariableDeclarationContext constantVariableDeclaration(int i) {
			return getRuleContext(ConstantVariableDeclarationContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<UserDefinedValueTypeDefinitionContext> userDefinedValueTypeDefinition() {
			return getRuleContexts(UserDefinedValueTypeDefinitionContext.class);
		}
		public UserDefinedValueTypeDefinitionContext userDefinedValueTypeDefinition(int i) {
			return getRuleContext(UserDefinedValueTypeDefinitionContext.class,i);
		}
		public List<ErrorDefinitionContext> errorDefinition() {
			return getRuleContexts(ErrorDefinitionContext.class);
		}
		public ErrorDefinitionContext errorDefinition(int i) {
			return getRuleContext(ErrorDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(182);
						pragmaDirective();
						}
						break;
					case 2:
						{
						setState(183);
						importDirective();
						}
						break;
					case 3:
						{
						setState(184);
						usingDirective();
						}
						break;
					case 4:
						{
						setState(185);
						contractDefinition();
						}
						break;
					case 5:
						{
						setState(186);
						interfaceDefinition();
						}
						break;
					case 6:
						{
						setState(187);
						libraryDefinition();
						}
						break;
					case 7:
						{
						setState(188);
						functionDefinition();
						}
						break;
					case 8:
						{
						setState(189);
						constantVariableDeclaration();
						}
						break;
					case 9:
						{
						setState(190);
						structDefinition();
						}
						break;
					case 10:
						{
						setState(191);
						enumDefinition();
						}
						break;
					case 11:
						{
						setState(192);
						userDefinedValueTypeDefinition();
						}
						break;
					case 12:
						{
						setState(193);
						errorDefinition();
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(199);
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

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public TerminalNode Pragma() { return getToken(SolidityParser.Pragma, 0); }
		public TerminalNode PragmaSemicolon() { return getToken(SolidityParser.PragmaSemicolon, 0); }
		public List<TerminalNode> PragmaToken() { return getTokens(SolidityParser.PragmaToken); }
		public TerminalNode PragmaToken(int i) {
			return getToken(SolidityParser.PragmaToken, i);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(Pragma);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(PragmaToken);
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PragmaToken );
			setState(207);
			match(PragmaSemicolon);
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

	public static class ImportDirectiveContext extends ParserRuleContext {
		public IdentifierContext unitAlias;
		public TerminalNode Import() { return getToken(SolidityParser.Import, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SymbolAliasesContext symbolAliases() {
			return getRuleContext(SymbolAliasesContext.class,0);
		}
		public TerminalNode From() { return getToken(SolidityParser.From, 0); }
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TerminalNode As() { return getToken(SolidityParser.As, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Import);
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonEmptyStringLiteral:
				{
				{
				setState(210);
				path();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(211);
					match(As);
					setState(212);
					((ImportDirectiveContext)_localctx).unitAlias = identifier();
					}
				}

				}
				}
				break;
			case LBrace:
				{
				{
				setState(215);
				symbolAliases();
				setState(216);
				match(From);
				setState(217);
				path();
				}
				}
				break;
			case Mul:
				{
				{
				setState(219);
				match(Mul);
				setState(220);
				match(As);
				setState(221);
				((ImportDirectiveContext)_localctx).unitAlias = identifier();
				setState(222);
				match(From);
				setState(223);
				path();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			match(Semicolon);
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

	public static class ImportAliasesContext extends ParserRuleContext {
		public IdentifierContext symbol;
		public IdentifierContext alias;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode As() { return getToken(SolidityParser.As, 0); }
		public ImportAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliases; }
	}

	public final ImportAliasesContext importAliases() throws RecognitionException {
		ImportAliasesContext _localctx = new ImportAliasesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			((ImportAliasesContext)_localctx).symbol = identifier();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(230);
				match(As);
				setState(231);
				((ImportAliasesContext)_localctx).alias = identifier();
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

	public static class PathContext extends ParserRuleContext {
		public TerminalNode NonEmptyStringLiteral() { return getToken(SolidityParser.NonEmptyStringLiteral, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(NonEmptyStringLiteral);
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

	public static class SymbolAliasesContext extends ParserRuleContext {
		public ImportAliasesContext importAliases;
		public List<ImportAliasesContext> aliases = new ArrayList<ImportAliasesContext>();
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<ImportAliasesContext> importAliases() {
			return getRuleContexts(ImportAliasesContext.class);
		}
		public ImportAliasesContext importAliases(int i) {
			return getRuleContext(ImportAliasesContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public SymbolAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolAliases; }
	}

	public final SymbolAliasesContext symbolAliases() throws RecognitionException {
		SymbolAliasesContext _localctx = new SymbolAliasesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_symbolAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LBrace);
			setState(237);
			((SymbolAliasesContext)_localctx).importAliases = importAliases();
			((SymbolAliasesContext)_localctx).aliases.add(((SymbolAliasesContext)_localctx).importAliases);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(238);
				match(Comma);
				setState(239);
				((SymbolAliasesContext)_localctx).importAliases = importAliases();
				((SymbolAliasesContext)_localctx).aliases.add(((SymbolAliasesContext)_localctx).importAliases);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(RBrace);
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

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Contract() { return getToken(SolidityParser.Contract, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Abstract() { return getToken(SolidityParser.Abstract, 0); }
		public InheritanceSpecifierListContext inheritanceSpecifierList() {
			return getRuleContext(InheritanceSpecifierListContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contractDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(247);
				match(Abstract);
				}
			}

			setState(250);
			match(Contract);
			setState(251);
			((ContractDefinitionContext)_localctx).name = identifier();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Is) {
				{
				setState(252);
				inheritanceSpecifierList();
				}
			}

			setState(255);
			match(LBrace);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					contractBodyElement();
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(262);
			match(RBrace);
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

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Interface() { return getToken(SolidityParser.Interface, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InheritanceSpecifierListContext inheritanceSpecifierList() {
			return getRuleContext(InheritanceSpecifierListContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(Interface);
			setState(265);
			((InterfaceDefinitionContext)_localctx).name = identifier();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Is) {
				{
				setState(266);
				inheritanceSpecifierList();
				}
			}

			setState(269);
			match(LBrace);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					contractBodyElement();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(276);
			match(RBrace);
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

	public static class LibraryDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Library() { return getToken(SolidityParser.Library, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public LibraryDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryDefinition; }
	}

	public final LibraryDefinitionContext libraryDefinition() throws RecognitionException {
		LibraryDefinitionContext _localctx = new LibraryDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_libraryDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Library);
			setState(279);
			((LibraryDefinitionContext)_localctx).name = identifier();
			setState(280);
			match(LBrace);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					contractBodyElement();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(287);
			match(RBrace);
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

	public static class InheritanceSpecifierListContext extends ParserRuleContext {
		public InheritanceSpecifierContext inheritanceSpecifier;
		public List<InheritanceSpecifierContext> inheritanceSpecifiers = new ArrayList<InheritanceSpecifierContext>();
		public TerminalNode Is() { return getToken(SolidityParser.Is, 0); }
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public InheritanceSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifierList; }
	}

	public final InheritanceSpecifierListContext inheritanceSpecifierList() throws RecognitionException {
		InheritanceSpecifierListContext _localctx = new InheritanceSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inheritanceSpecifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(Is);
			setState(290);
			((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier = inheritanceSpecifier();
			((InheritanceSpecifierListContext)_localctx).inheritanceSpecifiers.add(((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(291);
					match(Comma);
					setState(292);
					((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier = inheritanceSpecifier();
					((InheritanceSpecifierListContext)_localctx).inheritanceSpecifiers.add(((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier);
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public IdentifierPathContext name;
		public CallArgumentListContext arguments;
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((InheritanceSpecifierContext)_localctx).name = identifierPath();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LParen) {
				{
				setState(299);
				((InheritanceSpecifierContext)_localctx).arguments = callArgumentList();
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

	public static class ContractBodyElementContext extends ParserRuleContext {
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FallbackFunctionDefinitionContext fallbackFunctionDefinition() {
			return getRuleContext(FallbackFunctionDefinitionContext.class,0);
		}
		public ReceiveFunctionDefinitionContext receiveFunctionDefinition() {
			return getRuleContext(ReceiveFunctionDefinitionContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public UserDefinedValueTypeDefinitionContext userDefinedValueTypeDefinition() {
			return getRuleContext(UserDefinedValueTypeDefinitionContext.class,0);
		}
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public ErrorDefinitionContext errorDefinition() {
			return getRuleContext(ErrorDefinitionContext.class,0);
		}
		public UsingDirectiveContext usingDirective() {
			return getRuleContext(UsingDirectiveContext.class,0);
		}
		public ContractBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractBodyElement; }
	}

	public final ContractBodyElementContext contractBodyElement() throws RecognitionException {
		ContractBodyElementContext _localctx = new ContractBodyElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractBodyElement);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				constructorDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				modifierDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				fallbackFunctionDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				receiveFunctionDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				structDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				enumDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(309);
				userDefinedValueTypeDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(310);
				stateVariableDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(311);
				eventDefinition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(312);
				errorDefinition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(313);
				usingDirective();
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

	public static class NamedArgumentContext extends ParserRuleContext {
		public IdentifierContext name;
		public ExpressionContext value;
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((NamedArgumentContext)_localctx).name = identifier();
			setState(317);
			match(Colon);
			setState(318);
			((NamedArgumentContext)_localctx).value = expression(0);
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

	public static class CallArgumentListContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public CallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgumentList; }
	}

	public final CallArgumentListContext callArgumentList() throws RecognitionException {
		CallArgumentListContext _localctx = new CallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(LParen);
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(321);
					expression(0);
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(322);
						match(Comma);
						setState(323);
						expression(0);
						}
						}
						setState(328);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(331);
				match(LBrace);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==Identifier) {
					{
					setState(332);
					namedArgument();
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(333);
						match(Comma);
						setState(334);
						namedArgument();
						}
						}
						setState(339);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(342);
				match(RBrace);
				}
				break;
			}
			setState(345);
			match(RParen);
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

	public static class IdentifierPathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Period() { return getTokens(SolidityParser.Period); }
		public TerminalNode Period(int i) {
			return getToken(SolidityParser.Period, i);
		}
		public IdentifierPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPath; }
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifierPath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			identifier();
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					match(Period);
					setState(349);
					identifier();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifierInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			identifierPath();
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(356);
				callArgumentList();
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

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode Internal() { return getToken(SolidityParser.Internal, 0); }
		public TerminalNode External() { return getToken(SolidityParser.External, 0); }
		public TerminalNode Private() { return getToken(SolidityParser.Private, 0); }
		public TerminalNode Public() { return getToken(SolidityParser.Public, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << External) | (1L << Internal) | (1L << Private) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration;
		public List<ParameterDeclarationContext> parameters = new ArrayList<ParameterDeclarationContext>();
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			((ParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
			((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameterDeclaration);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(362);
				match(Comma);
				setState(363);
				((ParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
				((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameterDeclaration);
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public DataLocationContext location;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public DataLocationContext dataLocation() {
			return getRuleContext(DataLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((ParameterDeclarationContext)_localctx).type = typeName(0);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) {
				{
				setState(370);
				((ParameterDeclarationContext)_localctx).location = dataLocation();
				}
			}

			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==Identifier) {
				{
				setState(373);
				((ParameterDeclarationContext)_localctx).name = identifier();
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

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public boolean payableSet = false;
		public boolean visibilitySet = false;
		public ParameterListContext arguments;
		public BlockContext body;
		public TerminalNode Constructor() { return getToken(SolidityParser.Constructor, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Payable() { return getTokens(SolidityParser.Payable); }
		public TerminalNode Payable(int i) {
			return getToken(SolidityParser.Payable, i);
		}
		public List<TerminalNode> Internal() { return getTokens(SolidityParser.Internal); }
		public TerminalNode Internal(int i) {
			return getToken(SolidityParser.Internal, i);
		}
		public List<TerminalNode> Public() { return getTokens(SolidityParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SolidityParser.Public, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(Constructor);
			setState(377);
			match(LParen);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(378);
				((ConstructorDefinitionContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(381);
			match(RParen);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(382);
						modifierInvocation();
						}
						break;
					case 2:
						{
						setState(383);
						if (!(!_localctx.payableSet)) throw new FailedPredicateException(this, "!$payableSet");
						setState(384);
						match(Payable);
						((ConstructorDefinitionContext)_localctx).payableSet =  true;
						}
						break;
					case 3:
						{
						setState(386);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(387);
						match(Internal);
						((ConstructorDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 4:
						{
						setState(389);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(390);
						match(Public);
						((ConstructorDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(397);
			((ConstructorDefinitionContext)_localctx).body = block();
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

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode Pure() { return getToken(SolidityParser.Pure, 0); }
		public TerminalNode View() { return getToken(SolidityParser.View, 0); }
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (Payable - 47)) | (1L << (Pure - 47)) | (1L << (View - 47)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OverrideSpecifierContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath;
		public List<IdentifierPathContext> overrides = new ArrayList<IdentifierPathContext>();
		public TerminalNode Override() { return getToken(SolidityParser.Override, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<IdentifierPathContext> identifierPath() {
			return getRuleContexts(IdentifierPathContext.class);
		}
		public IdentifierPathContext identifierPath(int i) {
			return getRuleContext(IdentifierPathContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(Override);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(402);
				match(LParen);
				setState(403);
				((OverrideSpecifierContext)_localctx).identifierPath = identifierPath();
				((OverrideSpecifierContext)_localctx).overrides.add(((OverrideSpecifierContext)_localctx).identifierPath);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(404);
					match(Comma);
					setState(405);
					((OverrideSpecifierContext)_localctx).identifierPath = identifierPath();
					((OverrideSpecifierContext)_localctx).overrides.add(((OverrideSpecifierContext)_localctx).identifierPath);
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(411);
				match(RParen);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public ParameterListContext arguments;
		public ParameterListContext returnParameters;
		public BlockContext body;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Fallback() { return getToken(SolidityParser.Fallback, 0); }
		public TerminalNode Receive() { return getToken(SolidityParser.Receive, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(Function);
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Error:
			case From:
			case Global:
			case Revert:
			case Identifier:
				{
				setState(416);
				identifier();
				}
				break;
			case Fallback:
				{
				setState(417);
				match(Fallback);
				}
				break;
			case Receive:
				{
				setState(418);
				match(Receive);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(421);
			match(LParen);
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(422);
				((FunctionDefinitionContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(425);
			match(RParen);
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(442);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(426);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(427);
						visibility();
						((FunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(430);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(431);
						stateMutability();
						((FunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(434);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(435);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(436);
						match(Virtual);
						((FunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(438);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(439);
						overrideSpecifier();
						((FunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(447);
				match(Returns);
				setState(448);
				match(LParen);
				setState(449);
				((FunctionDefinitionContext)_localctx).returnParameters = parameterList();
				setState(450);
				match(RParen);
				}
			}

			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(454);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(455);
				((FunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public IdentifierContext name;
		public ParameterListContext arguments;
		public BlockContext body;
		public TerminalNode Modifier() { return getToken(SolidityParser.Modifier, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifierDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(Modifier);
			setState(459);
			((ModifierDefinitionContext)_localctx).name = identifier();
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(460);
				match(LParen);
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(461);
					((ModifierDefinitionContext)_localctx).arguments = parameterList();
					}
					break;
				}
				setState(464);
				match(RParen);
				}
				break;
			}
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(474);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(467);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(468);
						match(Virtual);
						((ModifierDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 2:
						{
						setState(470);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(471);
						overrideSpecifier();
						((ModifierDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(479);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(480);
				((ModifierDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FallbackFunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public boolean hasParameters = false;
		public Token kind;
		public ParameterListContext returnParameters;
		public BlockContext body;
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public TerminalNode Fallback() { return getToken(SolidityParser.Fallback, 0); }
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<TerminalNode> External() { return getTokens(SolidityParser.External); }
		public TerminalNode External(int i) {
			return getToken(SolidityParser.External, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FallbackFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallbackFunctionDefinition; }
	}

	public final FallbackFunctionDefinitionContext fallbackFunctionDefinition() throws RecognitionException {
		FallbackFunctionDefinitionContext _localctx = new FallbackFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fallbackFunctionDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			((FallbackFunctionDefinitionContext)_localctx).kind = match(Fallback);
			setState(484);
			match(LParen);
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(485);
				parameterList();
				 ((FallbackFunctionDefinitionContext)_localctx).hasParameters =  true; 
				}
				break;
			}
			setState(490);
			match(RParen);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(491);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(492);
						match(External);
						((FallbackFunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(494);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(495);
						stateMutability();
						((FallbackFunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(498);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(499);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(500);
						match(Virtual);
						((FallbackFunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(502);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(503);
						overrideSpecifier();
						((FallbackFunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(511);
				if (!(_localctx.hasParameters)) throw new FailedPredicateException(this, "$hasParameters");
				setState(512);
				match(Returns);
				setState(513);
				match(LParen);
				setState(514);
				((FallbackFunctionDefinitionContext)_localctx).returnParameters = parameterList();
				setState(515);
				match(RParen);
				}
				break;
			case 2:
				{
				setState(517);
				if (!(!_localctx.hasParameters)) throw new FailedPredicateException(this, "!$hasParameters");
				}
				break;
			}
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(520);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(521);
				((FallbackFunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ReceiveFunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public Token kind;
		public BlockContext body;
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Receive() { return getToken(SolidityParser.Receive, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<TerminalNode> External() { return getTokens(SolidityParser.External); }
		public TerminalNode External(int i) {
			return getToken(SolidityParser.External, i);
		}
		public List<TerminalNode> Payable() { return getTokens(SolidityParser.Payable); }
		public TerminalNode Payable(int i) {
			return getToken(SolidityParser.Payable, i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReceiveFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiveFunctionDefinition; }
	}

	public final ReceiveFunctionDefinitionContext receiveFunctionDefinition() throws RecognitionException {
		ReceiveFunctionDefinitionContext _localctx = new ReceiveFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_receiveFunctionDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			((ReceiveFunctionDefinitionContext)_localctx).kind = match(Receive);
			setState(525);
			match(LParen);
			setState(526);
			match(RParen);
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(541);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(527);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(528);
						match(External);
						((ReceiveFunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(530);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(531);
						match(Payable);
						((ReceiveFunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(533);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(534);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(535);
						match(Virtual);
						((ReceiveFunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(537);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(538);
						overrideSpecifier();
						((ReceiveFunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(546);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(547);
				((ReceiveFunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public StructMemberContext members;
		public TerminalNode Struct() { return getToken(SolidityParser.Struct, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_structDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(Struct);
			setState(551);
			((StructDefinitionContext)_localctx).name = identifier();
			setState(552);
			match(LBrace);
			setState(554); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(553);
					((StructDefinitionContext)_localctx).members = structMember();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(556); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(558);
			match(RBrace);
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

	public static class StructMemberContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_structMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			((StructMemberContext)_localctx).type = typeName(0);
			setState(561);
			((StructMemberContext)_localctx).name = identifier();
			setState(562);
			match(Semicolon);
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

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext identifier;
		public List<IdentifierContext> enumValues = new ArrayList<IdentifierContext>();
		public TerminalNode Enum() { return getToken(SolidityParser.Enum, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(Enum);
			setState(565);
			((EnumDefinitionContext)_localctx).name = identifier();
			setState(566);
			match(LBrace);
			setState(567);
			((EnumDefinitionContext)_localctx).identifier = identifier();
			((EnumDefinitionContext)_localctx).enumValues.add(((EnumDefinitionContext)_localctx).identifier);
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(568);
				match(Comma);
				setState(569);
				((EnumDefinitionContext)_localctx).identifier = identifier();
				((EnumDefinitionContext)_localctx).enumValues.add(((EnumDefinitionContext)_localctx).identifier);
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			match(RBrace);
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

	public static class UserDefinedValueTypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Type() { return getToken(SolidityParser.Type, 0); }
		public TerminalNode Is() { return getToken(SolidityParser.Is, 0); }
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserDefinedValueTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedValueTypeDefinition; }
	}

	public final UserDefinedValueTypeDefinitionContext userDefinedValueTypeDefinition() throws RecognitionException {
		UserDefinedValueTypeDefinitionContext _localctx = new UserDefinedValueTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_userDefinedValueTypeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(Type);
			setState(578);
			((UserDefinedValueTypeDefinitionContext)_localctx).name = identifier();
			setState(579);
			match(Is);
			setState(580);
			elementaryTypeName(true);
			setState(581);
			match(Semicolon);
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

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public boolean constantnessSet = false;
		public boolean visibilitySet = false;
		public boolean overrideSpecifierSet = false;
		public TypeNameContext type;
		public IdentifierContext name;
		public ExpressionContext initialValue;
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> Public() { return getTokens(SolidityParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SolidityParser.Public, i);
		}
		public List<TerminalNode> Private() { return getTokens(SolidityParser.Private); }
		public TerminalNode Private(int i) {
			return getToken(SolidityParser.Private, i);
		}
		public List<TerminalNode> Internal() { return getTokens(SolidityParser.Internal); }
		public TerminalNode Internal(int i) {
			return getToken(SolidityParser.Internal, i);
		}
		public List<TerminalNode> Constant() { return getTokens(SolidityParser.Constant); }
		public TerminalNode Constant(int i) {
			return getToken(SolidityParser.Constant, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public List<TerminalNode> Immutable() { return getTokens(SolidityParser.Immutable); }
		public TerminalNode Immutable(int i) {
			return getToken(SolidityParser.Immutable, i);
		}
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stateVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			((StateVariableDeclarationContext)_localctx).type = typeName(0);
			setState(605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(603);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(584);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(585);
						match(Public);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(587);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(588);
						match(Private);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 3:
						{
						setState(590);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(591);
						match(Internal);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 4:
						{
						setState(593);
						if (!(!_localctx.constantnessSet)) throw new FailedPredicateException(this, "!$constantnessSet");
						setState(594);
						match(Constant);
						((StateVariableDeclarationContext)_localctx).constantnessSet =  true;
						}
						break;
					case 5:
						{
						setState(596);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(597);
						overrideSpecifier();
						((StateVariableDeclarationContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					case 6:
						{
						setState(600);
						if (!(!_localctx.constantnessSet)) throw new FailedPredicateException(this, "!$constantnessSet");
						setState(601);
						match(Immutable);
						((StateVariableDeclarationContext)_localctx).constantnessSet =  true;
						}
						break;
					}
					} 
				}
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(608);
			((StateVariableDeclarationContext)_localctx).name = identifier();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(609);
				match(Assign);
				setState(610);
				((StateVariableDeclarationContext)_localctx).initialValue = expression(0);
				}
			}

			setState(613);
			match(Semicolon);
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

	public static class ConstantVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public ExpressionContext initialValue;
		public TerminalNode Constant() { return getToken(SolidityParser.Constant, 0); }
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantVariableDeclaration; }
	}

	public final ConstantVariableDeclarationContext constantVariableDeclaration() throws RecognitionException {
		ConstantVariableDeclarationContext _localctx = new ConstantVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constantVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			((ConstantVariableDeclarationContext)_localctx).type = typeName(0);
			setState(616);
			match(Constant);
			setState(617);
			((ConstantVariableDeclarationContext)_localctx).name = identifier();
			setState(618);
			match(Assign);
			setState(619);
			((ConstantVariableDeclarationContext)_localctx).initialValue = expression(0);
			setState(620);
			match(Semicolon);
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

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Indexed() { return getToken(SolidityParser.Indexed, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			((EventParameterContext)_localctx).type = typeName(0);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Indexed) {
				{
				setState(623);
				match(Indexed);
				}
			}

			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==Identifier) {
				{
				setState(626);
				((EventParameterContext)_localctx).name = identifier();
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

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public EventParameterContext eventParameter;
		public List<EventParameterContext> parameters = new ArrayList<EventParameterContext>();
		public TerminalNode Event() { return getToken(SolidityParser.Event, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Anonymous() { return getToken(SolidityParser.Anonymous, 0); }
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(Event);
			setState(630);
			((EventDefinitionContext)_localctx).name = identifier();
			setState(631);
			match(LParen);
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(632);
				((EventDefinitionContext)_localctx).eventParameter = eventParameter();
				((EventDefinitionContext)_localctx).parameters.add(((EventDefinitionContext)_localctx).eventParameter);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(633);
					match(Comma);
					setState(634);
					((EventDefinitionContext)_localctx).eventParameter = eventParameter();
					((EventDefinitionContext)_localctx).parameters.add(((EventDefinitionContext)_localctx).eventParameter);
					}
					}
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(642);
			match(RParen);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Anonymous) {
				{
				setState(643);
				match(Anonymous);
				}
			}

			setState(646);
			match(Semicolon);
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

	public static class ErrorParameterContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorParameter; }
	}

	public final ErrorParameterContext errorParameter() throws RecognitionException {
		ErrorParameterContext _localctx = new ErrorParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_errorParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			((ErrorParameterContext)_localctx).type = typeName(0);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==Identifier) {
				{
				setState(649);
				((ErrorParameterContext)_localctx).name = identifier();
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

	public static class ErrorDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public ErrorParameterContext errorParameter;
		public List<ErrorParameterContext> parameters = new ArrayList<ErrorParameterContext>();
		public TerminalNode Error() { return getToken(SolidityParser.Error, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ErrorParameterContext> errorParameter() {
			return getRuleContexts(ErrorParameterContext.class);
		}
		public ErrorParameterContext errorParameter(int i) {
			return getRuleContext(ErrorParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public ErrorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDefinition; }
	}

	public final ErrorDefinitionContext errorDefinition() throws RecognitionException {
		ErrorDefinitionContext _localctx = new ErrorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_errorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(Error);
			setState(653);
			((ErrorDefinitionContext)_localctx).name = identifier();
			setState(654);
			match(LParen);
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(655);
				((ErrorDefinitionContext)_localctx).errorParameter = errorParameter();
				((ErrorDefinitionContext)_localctx).parameters.add(((ErrorDefinitionContext)_localctx).errorParameter);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(656);
					match(Comma);
					setState(657);
					((ErrorDefinitionContext)_localctx).errorParameter = errorParameter();
					((ErrorDefinitionContext)_localctx).parameters.add(((ErrorDefinitionContext)_localctx).errorParameter);
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(665);
			match(RParen);
			setState(666);
			match(Semicolon);
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

	public static class UserDefinableOperatorContext extends ParserRuleContext {
		public TerminalNode BitAnd() { return getToken(SolidityParser.BitAnd, 0); }
		public TerminalNode BitNot() { return getToken(SolidityParser.BitNot, 0); }
		public TerminalNode BitOr() { return getToken(SolidityParser.BitOr, 0); }
		public TerminalNode BitXor() { return getToken(SolidityParser.BitXor, 0); }
		public TerminalNode Add() { return getToken(SolidityParser.Add, 0); }
		public TerminalNode Div() { return getToken(SolidityParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SolidityParser.Mod, 0); }
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TerminalNode Sub() { return getToken(SolidityParser.Sub, 0); }
		public TerminalNode Equal() { return getToken(SolidityParser.Equal, 0); }
		public TerminalNode GreaterThan() { return getToken(SolidityParser.GreaterThan, 0); }
		public TerminalNode GreaterThanOrEqual() { return getToken(SolidityParser.GreaterThanOrEqual, 0); }
		public TerminalNode LessThan() { return getToken(SolidityParser.LessThan, 0); }
		public TerminalNode LessThanOrEqual() { return getToken(SolidityParser.LessThanOrEqual, 0); }
		public TerminalNode NotEqual() { return getToken(SolidityParser.NotEqual, 0); }
		public UserDefinableOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinableOperator; }
	}

	public final UserDefinableOperatorContext userDefinableOperator() throws RecognitionException {
		UserDefinableOperatorContext _localctx = new UserDefinableOperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_userDefinableOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (BitOr - 97)) | (1L << (BitXor - 97)) | (1L << (BitAnd - 97)) | (1L << (Add - 97)) | (1L << (Sub - 97)) | (1L << (Mul - 97)) | (1L << (Div - 97)) | (1L << (Mod - 97)) | (1L << (Equal - 97)) | (1L << (NotEqual - 97)) | (1L << (LessThan - 97)) | (1L << (GreaterThan - 97)) | (1L << (LessThanOrEqual - 97)) | (1L << (GreaterThanOrEqual - 97)) | (1L << (BitNot - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UsingDirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(SolidityParser.Using, 0); }
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<IdentifierPathContext> identifierPath() {
			return getRuleContexts(IdentifierPathContext.class);
		}
		public IdentifierPathContext identifierPath(int i) {
			return getRuleContext(IdentifierPathContext.class,i);
		}
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Global() { return getToken(SolidityParser.Global, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<TerminalNode> As() { return getTokens(SolidityParser.As); }
		public TerminalNode As(int i) {
			return getToken(SolidityParser.As, i);
		}
		public List<UserDefinableOperatorContext> userDefinableOperator() {
			return getRuleContexts(UserDefinableOperatorContext.class);
		}
		public UserDefinableOperatorContext userDefinableOperator(int i) {
			return getRuleContext(UserDefinableOperatorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public UsingDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDirective; }
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_usingDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(Using);
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Error:
			case From:
			case Global:
			case Revert:
			case Identifier:
				{
				setState(671);
				identifierPath();
				}
				break;
			case LBrace:
				{
				{
				setState(672);
				match(LBrace);
				setState(673);
				identifierPath();
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(674);
					match(As);
					setState(675);
					userDefinableOperator();
					}
				}

				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(678);
					match(Comma);
					setState(679);
					identifierPath();
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==As) {
						{
						setState(680);
						match(As);
						setState(681);
						userDefinableOperator();
						}
					}

					}
					}
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(689);
				match(RBrace);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(693);
			match(For);
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(694);
				match(Mul);
				}
				break;
			case 2:
				{
				setState(695);
				typeName(0);
				}
				break;
			}
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Global) {
				{
				setState(698);
				match(Global);
				}
			}

			setState(701);
			match(Semicolon);
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

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public MappingTypeContext mappingType() {
			return getRuleContext(MappingTypeContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_typeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(704);
				elementaryTypeName(true);
				}
				break;
			case 2:
				{
				setState(705);
				functionTypeName();
				}
				break;
			case 3:
				{
				setState(706);
				mappingType();
				}
				break;
			case 4:
				{
				setState(707);
				identifierPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(710);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(711);
					match(LBrack);
					setState(713);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(712);
						expression(0);
						}
						break;
					}
					setState(715);
					match(RBrack);
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public boolean allowAddressPayable;
		public TerminalNode Address() { return getToken(SolidityParser.Address, 0); }
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public TerminalNode Bool() { return getToken(SolidityParser.Bool, 0); }
		public TerminalNode String() { return getToken(SolidityParser.String, 0); }
		public TerminalNode Bytes() { return getToken(SolidityParser.Bytes, 0); }
		public TerminalNode SignedIntegerType() { return getToken(SolidityParser.SignedIntegerType, 0); }
		public TerminalNode UnsignedIntegerType() { return getToken(SolidityParser.UnsignedIntegerType, 0); }
		public TerminalNode FixedBytes() { return getToken(SolidityParser.FixedBytes, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState, boolean allowAddressPayable) {
			super(parent, invokingState);
			this.allowAddressPayable = allowAddressPayable;
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
	}

	public final ElementaryTypeNameContext elementaryTypeName(boolean allowAddressPayable) throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState(), allowAddressPayable);
		enterRule(_localctx, 78, RULE_elementaryTypeName);
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(Address);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				if (!(_localctx.allowAddressPayable)) throw new FailedPredicateException(this, "$allowAddressPayable");
				setState(723);
				match(Address);
				setState(724);
				match(Payable);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
				match(Bool);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
				match(String);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(727);
				match(Bytes);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(728);
				match(SignedIntegerType);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(729);
				match(UnsignedIntegerType);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(730);
				match(FixedBytes);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(731);
				match(Fixed);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(732);
				match(Ufixed);
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

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public ParameterListContext arguments;
		public ParameterListContext returnParameters;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(Function);
			setState(736);
			match(LParen);
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(737);
				((FunctionTypeNameContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(740);
			match(RParen);
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(749);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(741);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(742);
						visibility();
						((FunctionTypeNameContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(745);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(746);
						stateMutability();
						((FunctionTypeNameContext)_localctx).mutabilitySet =  true;
						}
						break;
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(754);
				match(Returns);
				setState(755);
				match(LParen);
				setState(756);
				((FunctionTypeNameContext)_localctx).returnParameters = parameterList();
				setState(757);
				match(RParen);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public DataLocationContext location;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataLocationContext dataLocation() {
			return getRuleContext(DataLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			((VariableDeclarationContext)_localctx).type = typeName(0);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) {
				{
				setState(762);
				((VariableDeclarationContext)_localctx).location = dataLocation();
				}
			}

			setState(765);
			((VariableDeclarationContext)_localctx).name = identifier();
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

	public static class DataLocationContext extends ParserRuleContext {
		public TerminalNode Memory() { return getToken(SolidityParser.Memory, 0); }
		public TerminalNode Storage() { return getToken(SolidityParser.Storage, 0); }
		public TerminalNode Calldata() { return getToken(SolidityParser.Calldata, 0); }
		public DataLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataLocation; }
	}

	public final DataLocationContext dataLocation() throws RecognitionException {
		DataLocationContext _localctx = new DataLocationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dataLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryPrefixOperationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Inc() { return getToken(SolidityParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(SolidityParser.Dec, 0); }
		public TerminalNode Not() { return getToken(SolidityParser.Not, 0); }
		public TerminalNode BitNot() { return getToken(SolidityParser.BitNot, 0); }
		public TerminalNode Delete() { return getToken(SolidityParser.Delete, 0); }
		public TerminalNode Sub() { return getToken(SolidityParser.Sub, 0); }
		public UnaryPrefixOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrderComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(SolidityParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(SolidityParser.GreaterThan, 0); }
		public TerminalNode LessThanOrEqual() { return getToken(SolidityParser.LessThanOrEqual, 0); }
		public TerminalNode GreaterThanOrEqual() { return getToken(SolidityParser.GreaterThanOrEqual, 0); }
		public OrderComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionalContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Conditional() { return getToken(SolidityParser.Conditional, 0); }
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public ConditionalContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PayableConversionContext extends ExpressionContext {
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public PayableConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnarySuffixOperationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Inc() { return getToken(SolidityParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(SolidityParser.Dec, 0); }
		public UnarySuffixOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ShiftOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Shl() { return getToken(SolidityParser.Shl, 0); }
		public TerminalNode Sar() { return getToken(SolidityParser.Sar, 0); }
		public TerminalNode Shr() { return getToken(SolidityParser.Shr, 0); }
		public ShiftOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitAndOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(SolidityParser.BitAnd, 0); }
		public BitAndOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IndexRangeAccessContext extends ExpressionContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public IndexRangeAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewExpressionContext extends ExpressionContext {
		public TerminalNode New() { return getToken(SolidityParser.New, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IndexAccessContext extends ExpressionContext {
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public IndexAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(SolidityParser.Add, 0); }
		public TerminalNode Sub() { return getToken(SolidityParser.Sub, 0); }
		public AddSubOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitOrOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(SolidityParser.BitOr, 0); }
		public BitOrOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Exp() { return getToken(SolidityParser.Exp, 0); }
		public ExpOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(SolidityParser.And, 0); }
		public AndOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InlineArrayContext extends ExpressionContext {
		public InlineArrayExpressionContext inlineArrayExpression() {
			return getRuleContext(InlineArrayExpressionContext.class,0);
		}
		public InlineArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(SolidityParser.Or, 0); }
		public OrOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberAccessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Period() { return getToken(SolidityParser.Period, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Address() { return getToken(SolidityParser.Address, 0); }
		public MemberAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MulDivModOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TerminalNode Div() { return getToken(SolidityParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SolidityParser.Mod, 0); }
		public MulDivModOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallOptionsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public FunctionCallOptionsContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitXorOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitXor() { return getToken(SolidityParser.BitXor, 0); }
		public BitXorOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TupleContext extends ExpressionContext {
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TupleContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(SolidityParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(SolidityParser.NotEqual, 0); }
		public EqualityComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MetaTypeContext extends ExpressionContext {
		public TerminalNode Type() { return getToken(SolidityParser.Type, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public MetaTypeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				_localctx = new PayableConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(770);
				match(Payable);
				setState(771);
				callArgumentList();
				}
				break;
			case 2:
				{
				_localctx = new MetaTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(772);
				match(Type);
				setState(773);
				match(LParen);
				setState(774);
				typeName(0);
				setState(775);
				match(RParen);
				}
				break;
			case 3:
				{
				_localctx = new UnaryPrefixOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(777);
				_la = _input.LA(1);
				if ( !(_la==Delete || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Sub - 104)) | (1L << (Not - 104)) | (1L << (BitNot - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(778);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(779);
				match(New);
				setState(780);
				typeName(0);
				}
				break;
			case 5:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(781);
				tupleExpression();
				}
				break;
			case 6:
				{
				_localctx = new InlineArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(782);
				inlineArrayExpression();
				}
				break;
			case 7:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(783);
					identifier();
					}
					break;
				case 2:
					{
					setState(784);
					literal();
					}
					break;
				case 3:
					{
					setState(785);
					elementaryTypeName(false);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new ExpOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(791);
						match(Exp);
						setState(792);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(793);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(794);
						_la = _input.LA(1);
						if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (Mul - 105)) | (1L << (Div - 105)) | (1L << (Mod - 105)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(795);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new AddSubOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(797);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(798);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ShiftOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(799);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(800);
						_la = _input.LA(1);
						if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (Shl - 100)) | (1L << (Sar - 100)) | (1L << (Shr - 100)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(801);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new BitAndOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(802);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(803);
						match(BitAnd);
						setState(804);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new BitXorOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(805);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(806);
						match(BitXor);
						setState(807);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new BitOrOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(808);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(809);
						match(BitOr);
						setState(810);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new OrderComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(811);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(812);
						_la = _input.LA(1);
						if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (LessThan - 111)) | (1L << (GreaterThan - 111)) | (1L << (LessThanOrEqual - 111)) | (1L << (GreaterThanOrEqual - 111)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(813);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new EqualityComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(814);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(815);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(816);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new AndOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(817);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(818);
						match(And);
						setState(819);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new OrOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(820);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(821);
						match(Or);
						setState(822);
						expression(8);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(823);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(824);
						match(Conditional);
						setState(825);
						expression(0);
						setState(826);
						match(Colon);
						setState(827);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new AssignmentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(829);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(830);
						assignOp();
						setState(831);
						expression(5);
						}
						break;
					case 14:
						{
						_localctx = new IndexAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(833);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(834);
						match(LBrack);
						setState(836);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
						case 1:
							{
							setState(835);
							((IndexAccessContext)_localctx).index = expression(0);
							}
							break;
						}
						setState(838);
						match(RBrack);
						}
						break;
					case 15:
						{
						_localctx = new IndexRangeAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(839);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(840);
						match(LBrack);
						setState(842);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
						case 1:
							{
							setState(841);
							((IndexRangeAccessContext)_localctx).start = expression(0);
							}
							break;
						}
						setState(844);
						match(Colon);
						setState(846);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
						case 1:
							{
							setState(845);
							((IndexRangeAccessContext)_localctx).end = expression(0);
							}
							break;
						}
						setState(848);
						match(RBrack);
						}
						break;
					case 16:
						{
						_localctx = new MemberAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(849);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(850);
						match(Period);
						setState(853);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Error:
						case From:
						case Global:
						case Revert:
						case Identifier:
							{
							setState(851);
							identifier();
							}
							break;
						case Address:
							{
							setState(852);
							match(Address);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 17:
						{
						_localctx = new FunctionCallOptionsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(855);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(856);
						match(LBrace);
						setState(865);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==Identifier) {
							{
							setState(857);
							namedArgument();
							setState(862);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(858);
								match(Comma);
								setState(859);
								namedArgument();
								}
								}
								setState(864);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(867);
						match(RBrace);
						}
						break;
					case 18:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(868);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(869);
						callArgumentList();
						}
						break;
					case 19:
						{
						_localctx = new UnarySuffixOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(870);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(871);
						_la = _input.LA(1);
						if ( !(_la==Inc || _la==Dec) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public TerminalNode AssignBitOr() { return getToken(SolidityParser.AssignBitOr, 0); }
		public TerminalNode AssignBitXor() { return getToken(SolidityParser.AssignBitXor, 0); }
		public TerminalNode AssignBitAnd() { return getToken(SolidityParser.AssignBitAnd, 0); }
		public TerminalNode AssignShl() { return getToken(SolidityParser.AssignShl, 0); }
		public TerminalNode AssignSar() { return getToken(SolidityParser.AssignSar, 0); }
		public TerminalNode AssignShr() { return getToken(SolidityParser.AssignShr, 0); }
		public TerminalNode AssignAdd() { return getToken(SolidityParser.AssignAdd, 0); }
		public TerminalNode AssignSub() { return getToken(SolidityParser.AssignSub, 0); }
		public TerminalNode AssignMul() { return getToken(SolidityParser.AssignMul, 0); }
		public TerminalNode AssignDiv() { return getToken(SolidityParser.AssignDiv, 0); }
		public TerminalNode AssignMod() { return getToken(SolidityParser.AssignMod, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (Assign - 82)) | (1L << (AssignBitOr - 82)) | (1L << (AssignBitXor - 82)) | (1L << (AssignBitAnd - 82)) | (1L << (AssignShl - 82)) | (1L << (AssignSar - 82)) | (1L << (AssignShr - 82)) | (1L << (AssignAdd - 82)) | (1L << (AssignSub - 82)) | (1L << (AssignMul - 82)) | (1L << (AssignDiv - 82)) | (1L << (AssignMod - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TupleExpressionContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tupleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(LParen);
			{
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(880);
				expression(0);
				}
				break;
			}
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(883);
				match(Comma);
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(884);
					expression(0);
					}
					break;
				}
				}
				}
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(892);
			match(RParen);
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

	public static class InlineArrayExpressionContext extends ParserRuleContext {
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public InlineArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineArrayExpression; }
	}

	public final InlineArrayExpressionContext inlineArrayExpression() throws RecognitionException {
		InlineArrayExpressionContext _localctx = new InlineArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_inlineArrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(LBrack);
			{
			setState(895);
			expression(0);
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(896);
				match(Comma);
				setState(897);
				expression(0);
				}
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(903);
			match(RBrack);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public TerminalNode From() { return getToken(SolidityParser.From, 0); }
		public TerminalNode Error() { return getToken(SolidityParser.Error, 0); }
		public TerminalNode Revert() { return getToken(SolidityParser.Revert, 0); }
		public TerminalNode Global() { return getToken(SolidityParser.Global, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public HexStringLiteralContext hexStringLiteral() {
			return getRuleContext(HexStringLiteralContext.class,0);
		}
		public UnicodeStringLiteralContext unicodeStringLiteral() {
			return getRuleContext(UnicodeStringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		try {
			setState(912);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonEmptyStringLiteral:
			case EmptyStringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				stringLiteral();
				}
				break;
			case HexNumber:
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				numberLiteral();
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				booleanLiteral();
				}
				break;
			case HexString:
				enterOuterAlt(_localctx, 4);
				{
				setState(910);
				hexStringLiteral();
				}
				break;
			case UnicodeStringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(911);
				unicodeStringLiteral();
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(SolidityParser.True, 0); }
		public TerminalNode False() { return getToken(SolidityParser.False, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NonEmptyStringLiteral() { return getTokens(SolidityParser.NonEmptyStringLiteral); }
		public TerminalNode NonEmptyStringLiteral(int i) {
			return getToken(SolidityParser.NonEmptyStringLiteral, i);
		}
		public List<TerminalNode> EmptyStringLiteral() { return getTokens(SolidityParser.EmptyStringLiteral); }
		public TerminalNode EmptyStringLiteral(int i) {
			return getToken(SolidityParser.EmptyStringLiteral, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(917); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(916);
					_la = _input.LA(1);
					if ( !(_la==NonEmptyStringLiteral || _la==EmptyStringLiteral) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(919); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class HexStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> HexString() { return getTokens(SolidityParser.HexString); }
		public TerminalNode HexString(int i) {
			return getToken(SolidityParser.HexString, i);
		}
		public HexStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexStringLiteral; }
	}

	public final HexStringLiteralContext hexStringLiteral() throws RecognitionException {
		HexStringLiteralContext _localctx = new HexStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_hexStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(922); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(921);
					match(HexString);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(924); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class UnicodeStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> UnicodeStringLiteral() { return getTokens(SolidityParser.UnicodeStringLiteral); }
		public TerminalNode UnicodeStringLiteral(int i) {
			return getToken(SolidityParser.UnicodeStringLiteral, i);
		}
		public UnicodeStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodeStringLiteral; }
	}

	public final UnicodeStringLiteralContext unicodeStringLiteral() throws RecognitionException {
		UnicodeStringLiteralContext _localctx = new UnicodeStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unicodeStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(927); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(926);
					match(UnicodeStringLiteral);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(929); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_la = _input.LA(1);
			if ( !(_la==HexNumber || _la==DecimalNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(932);
				match(NumberUnit);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<UncheckedBlockContext> uncheckedBlock() {
			return getRuleContexts(UncheckedBlockContext.class);
		}
		public UncheckedBlockContext uncheckedBlock(int i) {
			return getRuleContext(UncheckedBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(LBrace);
			setState(940);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(938);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						setState(936);
						statement();
						}
						break;
					case 2:
						{
						setState(937);
						uncheckedBlock();
						}
						break;
					}
					} 
				}
				setState(942);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(943);
			match(RBrace);
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

	public static class UncheckedBlockContext extends ParserRuleContext {
		public TerminalNode Unchecked() { return getToken(SolidityParser.Unchecked, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncheckedBlock; }
	}

	public final UncheckedBlockContext uncheckedBlock() throws RecognitionException {
		UncheckedBlockContext _localctx = new UncheckedBlockContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_uncheckedBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(Unchecked);
			setState(946);
			block();
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public RevertStatementContext revertStatement() {
			return getRuleContext(RevertStatementContext.class,0);
		}
		public AssemblyStatementContext assemblyStatement() {
			return getRuleContext(AssemblyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_statement);
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				simpleStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(950);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(951);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(952);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(953);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(954);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(955);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(956);
				tryStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(957);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(958);
				emitStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(959);
				revertStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(960);
				assemblyStatement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_simpleStatement);
		try {
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				variableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				expressionStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SolidityParser.If, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(SolidityParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(If);
			setState(968);
			match(LParen);
			setState(969);
			expression(0);
			setState(970);
			match(RParen);
			setState(971);
			statement();
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(972);
				match(Else);
				setState(973);
				statement();
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public List<TerminalNode> Semicolon() { return getTokens(SolidityParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(SolidityParser.Semicolon, i);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(For);
			setState(977);
			match(LParen);
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(978);
				simpleStatement();
				}
				break;
			case 2:
				{
				setState(979);
				match(Semicolon);
				}
				break;
			}
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(982);
				expressionStatement();
				}
				break;
			case 2:
				{
				setState(983);
				match(Semicolon);
				}
				break;
			}
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(986);
				expression(0);
				}
				break;
			}
			setState(989);
			match(RParen);
			setState(990);
			statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(While);
			setState(993);
			match(LParen);
			setState(994);
			expression(0);
			setState(995);
			match(RParen);
			setState(996);
			statement();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(SolidityParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(Do);
			setState(999);
			statement();
			setState(1000);
			match(While);
			setState(1001);
			match(LParen);
			setState(1002);
			expression(0);
			setState(1003);
			match(RParen);
			setState(1004);
			match(Semicolon);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(SolidityParser.Continue, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(Continue);
			setState(1007);
			match(Semicolon);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SolidityParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(Break);
			setState(1010);
			match(Semicolon);
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

	public static class TryStatementContext extends ParserRuleContext {
		public ParameterListContext returnParameters;
		public TerminalNode Try() { return getToken(SolidityParser.Try, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tryStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(Try);
			setState(1013);
			expression(0);
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(1014);
				match(Returns);
				setState(1015);
				match(LParen);
				setState(1016);
				((TryStatementContext)_localctx).returnParameters = parameterList();
				setState(1017);
				match(RParen);
				}
			}

			setState(1021);
			block();
			setState(1023); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1022);
					catchClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1025); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CatchClauseContext extends ParserRuleContext {
		public ParameterListContext arguments;
		public TerminalNode Catch() { return getToken(SolidityParser.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(Catch);
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==LParen || _la==Identifier) {
				{
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==Identifier) {
					{
					setState(1028);
					identifier();
					}
				}

				setState(1031);
				match(LParen);
				{
				setState(1032);
				((CatchClauseContext)_localctx).arguments = parameterList();
				}
				setState(1033);
				match(RParen);
				}
			}

			setState(1037);
			block();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SolidityParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(Return);
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1040);
				expression(0);
				}
				break;
			}
			setState(1043);
			match(Semicolon);
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

	public static class EmitStatementContext extends ParserRuleContext {
		public TerminalNode Emit() { return getToken(SolidityParser.Emit, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(Emit);
			setState(1046);
			expression(0);
			setState(1047);
			callArgumentList();
			setState(1048);
			match(Semicolon);
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

	public static class RevertStatementContext extends ParserRuleContext {
		public TerminalNode Revert() { return getToken(SolidityParser.Revert, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public RevertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revertStatement; }
	}

	public final RevertStatementContext revertStatement() throws RecognitionException {
		RevertStatementContext _localctx = new RevertStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_revertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(Revert);
			setState(1051);
			expression(0);
			setState(1052);
			callArgumentList();
			setState(1053);
			match(Semicolon);
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

	public static class AssemblyStatementContext extends ParserRuleContext {
		public TerminalNode Assembly() { return getToken(SolidityParser.Assembly, 0); }
		public TerminalNode AssemblyLBrace() { return getToken(SolidityParser.AssemblyLBrace, 0); }
		public TerminalNode YulRBrace() { return getToken(SolidityParser.YulRBrace, 0); }
		public TerminalNode AssemblyDialect() { return getToken(SolidityParser.AssemblyDialect, 0); }
		public AssemblyFlagsContext assemblyFlags() {
			return getRuleContext(AssemblyFlagsContext.class,0);
		}
		public List<YulStatementContext> yulStatement() {
			return getRuleContexts(YulStatementContext.class);
		}
		public YulStatementContext yulStatement(int i) {
			return getRuleContext(YulStatementContext.class,i);
		}
		public AssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStatement; }
	}

	public final AssemblyStatementContext assemblyStatement() throws RecognitionException {
		AssemblyStatementContext _localctx = new AssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(Assembly);
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AssemblyDialect) {
				{
				setState(1056);
				match(AssemblyDialect);
				}
			}

			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AssemblyBlockLParen) {
				{
				setState(1059);
				assemblyFlags();
				}
			}

			setState(1062);
			match(AssemblyLBrace);
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (YulBreak - 140)) | (1L << (YulContinue - 140)) | (1L << (YulFor - 140)) | (1L << (YulFunction - 140)) | (1L << (YulIf - 140)) | (1L << (YulLeave - 140)) | (1L << (YulLet - 140)) | (1L << (YulSwitch - 140)) | (1L << (YulEVMBuiltin - 140)) | (1L << (YulLBrace - 140)) | (1L << (YulIdentifier - 140)))) != 0)) {
				{
				{
				setState(1063);
				yulStatement();
				}
				}
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1069);
			match(YulRBrace);
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

	public static class AssemblyFlagsContext extends ParserRuleContext {
		public TerminalNode AssemblyBlockLParen() { return getToken(SolidityParser.AssemblyBlockLParen, 0); }
		public List<TerminalNode> AssemblyFlagString() { return getTokens(SolidityParser.AssemblyFlagString); }
		public TerminalNode AssemblyFlagString(int i) {
			return getToken(SolidityParser.AssemblyFlagString, i);
		}
		public TerminalNode AssemblyBlockRParen() { return getToken(SolidityParser.AssemblyBlockRParen, 0); }
		public List<TerminalNode> AssemblyBlockComma() { return getTokens(SolidityParser.AssemblyBlockComma); }
		public TerminalNode AssemblyBlockComma(int i) {
			return getToken(SolidityParser.AssemblyBlockComma, i);
		}
		public AssemblyFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFlags; }
	}

	public final AssemblyFlagsContext assemblyFlags() throws RecognitionException {
		AssemblyFlagsContext _localctx = new AssemblyFlagsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			match(AssemblyBlockLParen);
			setState(1072);
			match(AssemblyFlagString);
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AssemblyBlockComma) {
				{
				{
				setState(1073);
				match(AssemblyBlockComma);
				setState(1074);
				match(AssemblyFlagString);
				}
				}
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1080);
			match(AssemblyBlockRParen);
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> variableDeclarations = new ArrayList<VariableDeclarationContext>();
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			((VariableDeclarationListContext)_localctx).variableDeclaration = variableDeclaration();
			((VariableDeclarationListContext)_localctx).variableDeclarations.add(((VariableDeclarationListContext)_localctx).variableDeclaration);
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1083);
				match(Comma);
				setState(1084);
				((VariableDeclarationListContext)_localctx).variableDeclaration = variableDeclaration();
				((VariableDeclarationListContext)_localctx).variableDeclarations.add(((VariableDeclarationListContext)_localctx).variableDeclaration);
				}
				}
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableDeclarationTupleContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> variableDeclarations = new ArrayList<VariableDeclarationContext>();
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public VariableDeclarationTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationTuple; }
	}

	public final VariableDeclarationTupleContext variableDeclarationTuple() throws RecognitionException {
		VariableDeclarationTupleContext _localctx = new VariableDeclarationTupleContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableDeclarationTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(LParen);
			{
			setState(1094);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1091);
					match(Comma);
					}
					} 
				}
				setState(1096);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(1097);
			((VariableDeclarationTupleContext)_localctx).variableDeclaration = variableDeclaration();
			((VariableDeclarationTupleContext)_localctx).variableDeclarations.add(((VariableDeclarationTupleContext)_localctx).variableDeclaration);
			}
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1099);
				match(Comma);
				setState(1101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1100);
					((VariableDeclarationTupleContext)_localctx).variableDeclaration = variableDeclaration();
					((VariableDeclarationTupleContext)_localctx).variableDeclarations.add(((VariableDeclarationTupleContext)_localctx).variableDeclaration);
					}
					break;
				}
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1108);
			match(RParen);
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

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationTupleContext variableDeclarationTuple() {
			return getRuleContext(VariableDeclarationTupleContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				{
				setState(1110);
				variableDeclaration();
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1111);
					match(Assign);
					setState(1112);
					expression(0);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1115);
				variableDeclarationTuple();
				setState(1116);
				match(Assign);
				setState(1117);
				expression(0);
				}
				}
				break;
			}
			setState(1121);
			match(Semicolon);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			expression(0);
			setState(1124);
			match(Semicolon);
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

	public static class MappingTypeContext extends ParserRuleContext {
		public MappingKeyTypeContext key;
		public IdentifierContext name;
		public TypeNameContext value;
		public TerminalNode Mapping() { return getToken(SolidityParser.Mapping, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode DoubleArrow() { return getToken(SolidityParser.DoubleArrow, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public MappingKeyTypeContext mappingKeyType() {
			return getRuleContext(MappingKeyTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MappingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingType; }
	}

	public final MappingTypeContext mappingType() throws RecognitionException {
		MappingTypeContext _localctx = new MappingTypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_mappingType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			match(Mapping);
			setState(1127);
			match(LParen);
			setState(1128);
			((MappingTypeContext)_localctx).key = mappingKeyType();
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==Identifier) {
				{
				setState(1129);
				((MappingTypeContext)_localctx).name = identifier();
				}
			}

			setState(1132);
			match(DoubleArrow);
			setState(1133);
			((MappingTypeContext)_localctx).value = typeName(0);
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << From) | (1L << Global) | (1L << Revert))) != 0) || _la==Identifier) {
				{
				setState(1134);
				((MappingTypeContext)_localctx).name = identifier();
				}
			}

			setState(1137);
			match(RParen);
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

	public static class MappingKeyTypeContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public MappingKeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingKeyType; }
	}

	public final MappingKeyTypeContext mappingKeyType() throws RecognitionException {
		MappingKeyTypeContext _localctx = new MappingKeyTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_mappingKeyType);
		try {
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				elementaryTypeName(false);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
				identifierPath();
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

	public static class YulStatementContext extends ParserRuleContext {
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulVariableDeclarationContext yulVariableDeclaration() {
			return getRuleContext(YulVariableDeclarationContext.class,0);
		}
		public YulAssignmentContext yulAssignment() {
			return getRuleContext(YulAssignmentContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulIfStatementContext yulIfStatement() {
			return getRuleContext(YulIfStatementContext.class,0);
		}
		public YulForStatementContext yulForStatement() {
			return getRuleContext(YulForStatementContext.class,0);
		}
		public YulSwitchStatementContext yulSwitchStatement() {
			return getRuleContext(YulSwitchStatementContext.class,0);
		}
		public TerminalNode YulLeave() { return getToken(SolidityParser.YulLeave, 0); }
		public TerminalNode YulBreak() { return getToken(SolidityParser.YulBreak, 0); }
		public TerminalNode YulContinue() { return getToken(SolidityParser.YulContinue, 0); }
		public YulFunctionDefinitionContext yulFunctionDefinition() {
			return getRuleContext(YulFunctionDefinitionContext.class,0);
		}
		public YulStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulStatement; }
	}

	public final YulStatementContext yulStatement() throws RecognitionException {
		YulStatementContext _localctx = new YulStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_yulStatement);
		try {
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				yulBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				yulVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1145);
				yulAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1146);
				yulFunctionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1147);
				yulIfStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1148);
				yulForStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1149);
				yulSwitchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1150);
				match(YulLeave);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1151);
				match(YulBreak);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1152);
				match(YulContinue);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1153);
				yulFunctionDefinition();
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

	public static class YulBlockContext extends ParserRuleContext {
		public TerminalNode YulLBrace() { return getToken(SolidityParser.YulLBrace, 0); }
		public TerminalNode YulRBrace() { return getToken(SolidityParser.YulRBrace, 0); }
		public List<YulStatementContext> yulStatement() {
			return getRuleContexts(YulStatementContext.class);
		}
		public YulStatementContext yulStatement(int i) {
			return getRuleContext(YulStatementContext.class,i);
		}
		public YulBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulBlock; }
	}

	public final YulBlockContext yulBlock() throws RecognitionException {
		YulBlockContext _localctx = new YulBlockContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_yulBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(YulLBrace);
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (YulBreak - 140)) | (1L << (YulContinue - 140)) | (1L << (YulFor - 140)) | (1L << (YulFunction - 140)) | (1L << (YulIf - 140)) | (1L << (YulLeave - 140)) | (1L << (YulLet - 140)) | (1L << (YulSwitch - 140)) | (1L << (YulEVMBuiltin - 140)) | (1L << (YulLBrace - 140)) | (1L << (YulIdentifier - 140)))) != 0)) {
				{
				{
				setState(1157);
				yulStatement();
				}
				}
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1163);
			match(YulRBrace);
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

	public static class YulVariableDeclarationContext extends ParserRuleContext {
		public Token YulIdentifier;
		public List<Token> variables = new ArrayList<Token>();
		public TerminalNode YulLet() { return getToken(SolidityParser.YulLet, 0); }
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public TerminalNode YulAssign() { return getToken(SolidityParser.YulAssign, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulVariableDeclaration; }
	}

	public final YulVariableDeclarationContext yulVariableDeclaration() throws RecognitionException {
		YulVariableDeclarationContext _localctx = new YulVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_yulVariableDeclaration);
		int _la;
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1165);
				match(YulLet);
				setState(1166);
				((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulAssign) {
					{
					setState(1167);
					match(YulAssign);
					setState(1168);
					yulExpression();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1171);
				match(YulLet);
				setState(1172);
				((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1173);
					match(YulComma);
					setState(1174);
					((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
					}
					}
					setState(1179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulAssign) {
					{
					setState(1180);
					match(YulAssign);
					setState(1181);
					yulFunctionCall();
					}
				}

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

	public static class YulAssignmentContext extends ParserRuleContext {
		public List<YulPathContext> yulPath() {
			return getRuleContexts(YulPathContext.class);
		}
		public YulPathContext yulPath(int i) {
			return getRuleContext(YulPathContext.class,i);
		}
		public TerminalNode YulAssign() { return getToken(SolidityParser.YulAssign, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulAssignment; }
	}

	public final YulAssignmentContext yulAssignment() throws RecognitionException {
		YulAssignmentContext _localctx = new YulAssignmentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_yulAssignment);
		int _la;
		try {
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				yulPath();
				setState(1187);
				match(YulAssign);
				setState(1188);
				yulExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1190);
				yulPath();
				setState(1193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1191);
					match(YulComma);
					setState(1192);
					yulPath();
					}
					}
					setState(1195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==YulComma );
				}
				setState(1197);
				match(YulAssign);
				setState(1198);
				yulFunctionCall();
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

	public static class YulIfStatementContext extends ParserRuleContext {
		public YulExpressionContext cond;
		public YulBlockContext body;
		public TerminalNode YulIf() { return getToken(SolidityParser.YulIf, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulIfStatement; }
	}

	public final YulIfStatementContext yulIfStatement() throws RecognitionException {
		YulIfStatementContext _localctx = new YulIfStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_yulIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(YulIf);
			setState(1203);
			((YulIfStatementContext)_localctx).cond = yulExpression();
			setState(1204);
			((YulIfStatementContext)_localctx).body = yulBlock();
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

	public static class YulForStatementContext extends ParserRuleContext {
		public YulBlockContext init;
		public YulExpressionContext cond;
		public YulBlockContext post;
		public YulBlockContext body;
		public TerminalNode YulFor() { return getToken(SolidityParser.YulFor, 0); }
		public List<YulBlockContext> yulBlock() {
			return getRuleContexts(YulBlockContext.class);
		}
		public YulBlockContext yulBlock(int i) {
			return getRuleContext(YulBlockContext.class,i);
		}
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulForStatement; }
	}

	public final YulForStatementContext yulForStatement() throws RecognitionException {
		YulForStatementContext _localctx = new YulForStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_yulForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(YulFor);
			setState(1207);
			((YulForStatementContext)_localctx).init = yulBlock();
			setState(1208);
			((YulForStatementContext)_localctx).cond = yulExpression();
			setState(1209);
			((YulForStatementContext)_localctx).post = yulBlock();
			setState(1210);
			((YulForStatementContext)_localctx).body = yulBlock();
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

	public static class YulSwitchCaseContext extends ParserRuleContext {
		public TerminalNode YulCase() { return getToken(SolidityParser.YulCase, 0); }
		public YulLiteralContext yulLiteral() {
			return getRuleContext(YulLiteralContext.class,0);
		}
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulSwitchCase; }
	}

	public final YulSwitchCaseContext yulSwitchCase() throws RecognitionException {
		YulSwitchCaseContext _localctx = new YulSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_yulSwitchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(YulCase);
			setState(1213);
			yulLiteral();
			setState(1214);
			yulBlock();
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

	public static class YulSwitchStatementContext extends ParserRuleContext {
		public TerminalNode YulSwitch() { return getToken(SolidityParser.YulSwitch, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public TerminalNode YulDefault() { return getToken(SolidityParser.YulDefault, 0); }
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public List<YulSwitchCaseContext> yulSwitchCase() {
			return getRuleContexts(YulSwitchCaseContext.class);
		}
		public YulSwitchCaseContext yulSwitchCase(int i) {
			return getRuleContext(YulSwitchCaseContext.class,i);
		}
		public YulSwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulSwitchStatement; }
	}

	public final YulSwitchStatementContext yulSwitchStatement() throws RecognitionException {
		YulSwitchStatementContext _localctx = new YulSwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_yulSwitchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(YulSwitch);
			setState(1217);
			yulExpression();
			setState(1229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YulCase:
				{
				{
				setState(1219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1218);
					yulSwitchCase();
					}
					}
					setState(1221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==YulCase );
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulDefault) {
					{
					setState(1223);
					match(YulDefault);
					setState(1224);
					yulBlock();
					}
				}

				}
				}
				break;
			case YulDefault:
				{
				{
				setState(1227);
				match(YulDefault);
				setState(1228);
				yulBlock();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class YulFunctionDefinitionContext extends ParserRuleContext {
		public Token YulIdentifier;
		public List<Token> arguments = new ArrayList<Token>();
		public List<Token> returnParameters = new ArrayList<Token>();
		public YulBlockContext body;
		public TerminalNode YulFunction() { return getToken(SolidityParser.YulFunction, 0); }
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public TerminalNode YulLParen() { return getToken(SolidityParser.YulLParen, 0); }
		public TerminalNode YulRParen() { return getToken(SolidityParser.YulRParen, 0); }
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public TerminalNode YulArrow() { return getToken(SolidityParser.YulArrow, 0); }
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulFunctionDefinition; }
	}

	public final YulFunctionDefinitionContext yulFunctionDefinition() throws RecognitionException {
		YulFunctionDefinitionContext _localctx = new YulFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_yulFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(YulFunction);
			setState(1232);
			match(YulIdentifier);
			setState(1233);
			match(YulLParen);
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YulIdentifier) {
				{
				setState(1234);
				((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulFunctionDefinitionContext)_localctx).arguments.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1235);
					match(YulComma);
					setState(1236);
					((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulFunctionDefinitionContext)_localctx).arguments.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
					}
					}
					setState(1241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1244);
			match(YulRParen);
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YulArrow) {
				{
				setState(1245);
				match(YulArrow);
				setState(1246);
				((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulFunctionDefinitionContext)_localctx).returnParameters.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1247);
					match(YulComma);
					setState(1248);
					((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulFunctionDefinitionContext)_localctx).returnParameters.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
					}
					}
					setState(1253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1256);
			((YulFunctionDefinitionContext)_localctx).body = yulBlock();
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

	public static class YulPathContext extends ParserRuleContext {
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public List<TerminalNode> YulPeriod() { return getTokens(SolidityParser.YulPeriod); }
		public TerminalNode YulPeriod(int i) {
			return getToken(SolidityParser.YulPeriod, i);
		}
		public List<TerminalNode> YulEVMBuiltin() { return getTokens(SolidityParser.YulEVMBuiltin); }
		public TerminalNode YulEVMBuiltin(int i) {
			return getToken(SolidityParser.YulEVMBuiltin, i);
		}
		public YulPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulPath; }
	}

	public final YulPathContext yulPath() throws RecognitionException {
		YulPathContext _localctx = new YulPathContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_yulPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(YulIdentifier);
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==YulPeriod) {
				{
				{
				setState(1259);
				match(YulPeriod);
				setState(1260);
				_la = _input.LA(1);
				if ( !(_la==YulEVMBuiltin || _la==YulIdentifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class YulFunctionCallContext extends ParserRuleContext {
		public TerminalNode YulLParen() { return getToken(SolidityParser.YulLParen, 0); }
		public TerminalNode YulRParen() { return getToken(SolidityParser.YulRParen, 0); }
		public TerminalNode YulIdentifier() { return getToken(SolidityParser.YulIdentifier, 0); }
		public TerminalNode YulEVMBuiltin() { return getToken(SolidityParser.YulEVMBuiltin, 0); }
		public List<YulExpressionContext> yulExpression() {
			return getRuleContexts(YulExpressionContext.class);
		}
		public YulExpressionContext yulExpression(int i) {
			return getRuleContext(YulExpressionContext.class,i);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulFunctionCall; }
	}

	public final YulFunctionCallContext yulFunctionCall() throws RecognitionException {
		YulFunctionCallContext _localctx = new YulFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_yulFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			_la = _input.LA(1);
			if ( !(_la==YulEVMBuiltin || _la==YulIdentifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1267);
			match(YulLParen);
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (YulFalse - 144)) | (1L << (YulTrue - 144)) | (1L << (YulEVMBuiltin - 144)) | (1L << (YulIdentifier - 144)) | (1L << (YulHexNumber - 144)) | (1L << (YulDecimalNumber - 144)) | (1L << (YulStringLiteral - 144)) | (1L << (YulHexStringLiteral - 144)))) != 0)) {
				{
				setState(1268);
				yulExpression();
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1269);
					match(YulComma);
					setState(1270);
					yulExpression();
					}
					}
					setState(1275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1278);
			match(YulRParen);
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

	public static class YulBooleanContext extends ParserRuleContext {
		public TerminalNode YulTrue() { return getToken(SolidityParser.YulTrue, 0); }
		public TerminalNode YulFalse() { return getToken(SolidityParser.YulFalse, 0); }
		public YulBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulBoolean; }
	}

	public final YulBooleanContext yulBoolean() throws RecognitionException {
		YulBooleanContext _localctx = new YulBooleanContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_yulBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			_la = _input.LA(1);
			if ( !(_la==YulFalse || _la==YulTrue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class YulLiteralContext extends ParserRuleContext {
		public TerminalNode YulDecimalNumber() { return getToken(SolidityParser.YulDecimalNumber, 0); }
		public TerminalNode YulStringLiteral() { return getToken(SolidityParser.YulStringLiteral, 0); }
		public TerminalNode YulHexNumber() { return getToken(SolidityParser.YulHexNumber, 0); }
		public YulBooleanContext yulBoolean() {
			return getRuleContext(YulBooleanContext.class,0);
		}
		public TerminalNode YulHexStringLiteral() { return getToken(SolidityParser.YulHexStringLiteral, 0); }
		public YulLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulLiteral; }
	}

	public final YulLiteralContext yulLiteral() throws RecognitionException {
		YulLiteralContext _localctx = new YulLiteralContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_yulLiteral);
		try {
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YulDecimalNumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				match(YulDecimalNumber);
				}
				break;
			case YulStringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				match(YulStringLiteral);
				}
				break;
			case YulHexNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(1284);
				match(YulHexNumber);
				}
				break;
			case YulFalse:
			case YulTrue:
				enterOuterAlt(_localctx, 4);
				{
				setState(1285);
				yulBoolean();
				}
				break;
			case YulHexStringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1286);
				match(YulHexStringLiteral);
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

	public static class YulExpressionContext extends ParserRuleContext {
		public YulPathContext yulPath() {
			return getRuleContext(YulPathContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulLiteralContext yulLiteral() {
			return getRuleContext(YulLiteralContext.class,0);
		}
		public YulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulExpression; }
	}

	public final YulExpressionContext yulExpression() throws RecognitionException {
		YulExpressionContext _localctx = new YulExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_yulExpression);
		try {
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				yulPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				yulFunctionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1291);
				yulLiteral();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return constructorDefinition_sempred((ConstructorDefinitionContext)_localctx, predIndex);
		case 22:
			return functionDefinition_sempred((FunctionDefinitionContext)_localctx, predIndex);
		case 23:
			return modifierDefinition_sempred((ModifierDefinitionContext)_localctx, predIndex);
		case 24:
			return fallbackFunctionDefinition_sempred((FallbackFunctionDefinitionContext)_localctx, predIndex);
		case 25:
			return receiveFunctionDefinition_sempred((ReceiveFunctionDefinitionContext)_localctx, predIndex);
		case 30:
			return stateVariableDeclaration_sempred((StateVariableDeclarationContext)_localctx, predIndex);
		case 38:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 39:
			return elementaryTypeName_sempred((ElementaryTypeNameContext)_localctx, predIndex);
		case 40:
			return functionTypeName_sempred((FunctionTypeNameContext)_localctx, predIndex);
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constructorDefinition_sempred(ConstructorDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_localctx.payableSet;
		case 1:
			return !_localctx.visibilitySet;
		case 2:
			return !_localctx.visibilitySet;
		}
		return true;
	}
	private boolean functionDefinition_sempred(FunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_localctx.visibilitySet;
		case 4:
			return !_localctx.mutabilitySet;
		case 5:
			return !_localctx.virtualSet;
		case 6:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean modifierDefinition_sempred(ModifierDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return !_localctx.virtualSet;
		case 8:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean fallbackFunctionDefinition_sempred(FallbackFunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return !_localctx.visibilitySet;
		case 10:
			return !_localctx.mutabilitySet;
		case 11:
			return !_localctx.virtualSet;
		case 12:
			return !_localctx.overrideSpecifierSet;
		case 13:
			return _localctx.hasParameters;
		case 14:
			return !_localctx.hasParameters;
		}
		return true;
	}
	private boolean receiveFunctionDefinition_sempred(ReceiveFunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return !_localctx.visibilitySet;
		case 16:
			return !_localctx.mutabilitySet;
		case 17:
			return !_localctx.virtualSet;
		case 18:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean stateVariableDeclaration_sempred(StateVariableDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !_localctx.visibilitySet;
		case 20:
			return !_localctx.visibilitySet;
		case 21:
			return !_localctx.visibilitySet;
		case 22:
			return !_localctx.constantnessSet;
		case 23:
			return !_localctx.overrideSpecifierSet;
		case 24:
			return !_localctx.constantnessSet;
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean elementaryTypeName_sempred(ElementaryTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return _localctx.allowAddressPayable;
		}
		return true;
	}
	private boolean functionTypeName_sempred(FunctionTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return !_localctx.visibilitySet;
		case 28:
			return !_localctx.mutabilitySet;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 17);
		case 30:
			return precpred(_ctx, 16);
		case 31:
			return precpred(_ctx, 15);
		case 32:
			return precpred(_ctx, 14);
		case 33:
			return precpred(_ctx, 13);
		case 34:
			return precpred(_ctx, 12);
		case 35:
			return precpred(_ctx, 11);
		case 36:
			return precpred(_ctx, 10);
		case 37:
			return precpred(_ctx, 9);
		case 38:
			return precpred(_ctx, 8);
		case 39:
			return precpred(_ctx, 7);
		case 40:
			return precpred(_ctx, 6);
		case 41:
			return precpred(_ctx, 5);
		case 42:
			return precpred(_ctx, 26);
		case 43:
			return precpred(_ctx, 25);
		case 44:
			return precpred(_ctx, 24);
		case 45:
			return precpred(_ctx, 23);
		case 46:
			return precpred(_ctx, 22);
		case 47:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b0\u0511\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00c5\n\2\f\2\16\2\u00c8\13\2\3\2\3\2"+
		"\3\3\3\3\6\3\u00ce\n\3\r\3\16\3\u00cf\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u00d8"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e4\n\4\3\4\3\4\3\5"+
		"\3\5\3\5\5\5\u00eb\n\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00f3\n\7\f\7\16\7"+
		"\u00f6\13\7\3\7\3\7\3\b\5\b\u00fb\n\b\3\b\3\b\3\b\5\b\u0100\n\b\3\b\3"+
		"\b\7\b\u0104\n\b\f\b\16\b\u0107\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u010e\n\t"+
		"\3\t\3\t\7\t\u0112\n\t\f\t\16\t\u0115\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n"+
		"\u011d\n\n\f\n\16\n\u0120\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0128"+
		"\n\13\f\13\16\13\u012b\13\13\3\f\3\f\5\f\u012f\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u013d\n\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\7\17\u0147\n\17\f\17\16\17\u014a\13\17\5\17\u014c\n\17\3"+
		"\17\3\17\3\17\3\17\7\17\u0152\n\17\f\17\16\17\u0155\13\17\5\17\u0157\n"+
		"\17\3\17\5\17\u015a\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u0161\n\20\f\20"+
		"\16\20\u0164\13\20\3\21\3\21\5\21\u0168\n\21\3\22\3\22\3\23\3\23\3\23"+
		"\7\23\u016f\n\23\f\23\16\23\u0172\13\23\3\24\3\24\5\24\u0176\n\24\3\24"+
		"\5\24\u0179\n\24\3\25\3\25\3\25\5\25\u017e\n\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u018b\n\25\f\25\16\25\u018e\13"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u0199\n\27\f\27"+
		"\16\27\u019c\13\27\3\27\3\27\5\27\u01a0\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u01a6\n\30\3\30\3\30\5\30\u01aa\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01bd\n\30"+
		"\f\30\16\30\u01c0\13\30\3\30\3\30\3\30\3\30\3\30\5\30\u01c7\n\30\3\30"+
		"\3\30\5\30\u01cb\n\30\3\31\3\31\3\31\3\31\5\31\u01d1\n\31\3\31\5\31\u01d4"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01dd\n\31\f\31\16\31\u01e0"+
		"\13\31\3\31\3\31\5\31\u01e4\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u01eb\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\7\32\u01fd\n\32\f\32\16\32\u0200\13\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u0209\n\32\3\32\3\32\5\32\u020d\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0220\n\33\f\33\16\33\u0223\13\33\3\33\3\33\5\33\u0227\n\33"+
		"\3\34\3\34\3\34\3\34\6\34\u022d\n\34\r\34\16\34\u022e\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u023d\n\36\f\36\16\36"+
		"\u0240\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u025e\n \f \16 \u0261\13"+
		" \3 \3 \3 \5 \u0266\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\5\"\u0273\n"+
		"\"\3\"\5\"\u0276\n\"\3#\3#\3#\3#\3#\3#\7#\u027e\n#\f#\16#\u0281\13#\5"+
		"#\u0283\n#\3#\3#\5#\u0287\n#\3#\3#\3$\3$\5$\u028d\n$\3%\3%\3%\3%\3%\3"+
		"%\7%\u0295\n%\f%\16%\u0298\13%\5%\u029a\n%\3%\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u02a7\n\'\3\'\3\'\3\'\3\'\5\'\u02ad\n\'\7\'\u02af\n\'"+
		"\f\'\16\'\u02b2\13\'\3\'\3\'\5\'\u02b6\n\'\3\'\3\'\3\'\5\'\u02bb\n\'\3"+
		"\'\5\'\u02be\n\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u02c7\n(\3(\3(\3(\5(\u02cc"+
		"\n(\3(\7(\u02cf\n(\f(\16(\u02d2\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\5)\u02e0\n)\3*\3*\3*\5*\u02e5\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u02f0"+
		"\n*\f*\16*\u02f3\13*\3*\3*\3*\3*\3*\5*\u02fa\n*\3+\3+\5+\u02fe\n+\3+\3"+
		"+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0315\n"+
		"-\5-\u0317\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u0347\n-\3-\3-\3-\3-\5-\u034d\n-\3-\3-\5-\u0351\n-\3"+
		"-\3-\3-\3-\3-\5-\u0358\n-\3-\3-\3-\3-\3-\7-\u035f\n-\f-\16-\u0362\13-"+
		"\5-\u0364\n-\3-\3-\3-\3-\3-\7-\u036b\n-\f-\16-\u036e\13-\3.\3.\3/\3/\5"+
		"/\u0374\n/\3/\3/\5/\u0378\n/\7/\u037a\n/\f/\16/\u037d\13/\3/\3/\3\60\3"+
		"\60\3\60\3\60\7\60\u0385\n\60\f\60\16\60\u0388\13\60\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\5\62\u0393\n\62\3\63\3\63\3\64\6\64\u0398"+
		"\n\64\r\64\16\64\u0399\3\65\6\65\u039d\n\65\r\65\16\65\u039e\3\66\6\66"+
		"\u03a2\n\66\r\66\16\66\u03a3\3\67\3\67\5\67\u03a8\n\67\38\38\38\78\u03ad"+
		"\n8\f8\168\u03b0\138\38\38\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\5:\u03c4\n:\3;\3;\5;\u03c8\n;\3<\3<\3<\3<\3<\3<\3<\5<\u03d1\n<\3"+
		"=\3=\3=\3=\5=\u03d7\n=\3=\3=\5=\u03db\n=\3=\5=\u03de\n=\3=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3"+
		"B\3B\3B\5B\u03fe\nB\3B\3B\6B\u0402\nB\rB\16B\u0403\3C\3C\5C\u0408\nC\3"+
		"C\3C\3C\3C\5C\u040e\nC\3C\3C\3D\3D\5D\u0414\nD\3D\3D\3E\3E\3E\3E\3E\3"+
		"F\3F\3F\3F\3F\3G\3G\5G\u0424\nG\3G\5G\u0427\nG\3G\3G\7G\u042b\nG\fG\16"+
		"G\u042e\13G\3G\3G\3H\3H\3H\3H\7H\u0436\nH\fH\16H\u0439\13H\3H\3H\3I\3"+
		"I\3I\7I\u0440\nI\fI\16I\u0443\13I\3J\3J\7J\u0447\nJ\fJ\16J\u044a\13J\3"+
		"J\3J\3J\3J\5J\u0450\nJ\7J\u0452\nJ\fJ\16J\u0455\13J\3J\3J\3K\3K\3K\5K"+
		"\u045c\nK\3K\3K\3K\3K\5K\u0462\nK\3K\3K\3L\3L\3L\3M\3M\3M\3M\5M\u046d"+
		"\nM\3M\3M\3M\5M\u0472\nM\3M\3M\3N\3N\5N\u0478\nN\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\5O\u0485\nO\3P\3P\7P\u0489\nP\fP\16P\u048c\13P\3P\3P\3Q\3"+
		"Q\3Q\3Q\5Q\u0494\nQ\3Q\3Q\3Q\3Q\7Q\u049a\nQ\fQ\16Q\u049d\13Q\3Q\3Q\5Q"+
		"\u04a1\nQ\5Q\u04a3\nQ\3R\3R\3R\3R\3R\3R\3R\6R\u04ac\nR\rR\16R\u04ad\3"+
		"R\3R\3R\5R\u04b3\nR\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3"+
		"V\6V\u04c6\nV\rV\16V\u04c7\3V\3V\5V\u04cc\nV\3V\3V\5V\u04d0\nV\3W\3W\3"+
		"W\3W\3W\3W\7W\u04d8\nW\fW\16W\u04db\13W\5W\u04dd\nW\3W\3W\3W\3W\3W\7W"+
		"\u04e4\nW\fW\16W\u04e7\13W\5W\u04e9\nW\3W\3W\3X\3X\3X\7X\u04f0\nX\fX\16"+
		"X\u04f3\13X\3Y\3Y\3Y\3Y\3Y\7Y\u04fa\nY\fY\16Y\u04fd\13Y\5Y\u04ff\nY\3"+
		"Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\5[\u050a\n[\3\\\3\\\3\\\5\\\u050f\n\\\3\\\3"+
		"\u0129\4NX]\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\2\24\5\2"+
		"\31\31((\63\64\5\2\61\61\65\65EE\6\2ceimotvv\5\2\f\f,,;;\5\2\22\22jju"+
		"x\3\2km\3\2ij\3\2fh\3\2qt\3\2op\3\2wx\3\2T_\7\2\27\27\37\37!!99\u0081"+
		"\u0081\4\2\33\33>>\3\2{|\3\2\177\u0080\4\2\u009b\u009b\u00a4\u00a4\4\2"+
		"\u0092\u0092\u0099\u0099\2\u05a5\2\u00c6\3\2\2\2\4\u00cb\3\2\2\2\6\u00d3"+
		"\3\2\2\2\b\u00e7\3\2\2\2\n\u00ec\3\2\2\2\f\u00ee\3\2\2\2\16\u00fa\3\2"+
		"\2\2\20\u010a\3\2\2\2\22\u0118\3\2\2\2\24\u0123\3\2\2\2\26\u012c\3\2\2"+
		"\2\30\u013c\3\2\2\2\32\u013e\3\2\2\2\34\u0142\3\2\2\2\36\u015d\3\2\2\2"+
		" \u0165\3\2\2\2\"\u0169\3\2\2\2$\u016b\3\2\2\2&\u0173\3\2\2\2(\u017a\3"+
		"\2\2\2*\u0191\3\2\2\2,\u0193\3\2\2\2.\u01a1\3\2\2\2\60\u01cc\3\2\2\2\62"+
		"\u01e5\3\2\2\2\64\u020e\3\2\2\2\66\u0228\3\2\2\28\u0232\3\2\2\2:\u0236"+
		"\3\2\2\2<\u0243\3\2\2\2>\u0249\3\2\2\2@\u0269\3\2\2\2B\u0270\3\2\2\2D"+
		"\u0277\3\2\2\2F\u028a\3\2\2\2H\u028e\3\2\2\2J\u029e\3\2\2\2L\u02a0\3\2"+
		"\2\2N\u02c6\3\2\2\2P\u02df\3\2\2\2R\u02e1\3\2\2\2T\u02fb\3\2\2\2V\u0301"+
		"\3\2\2\2X\u0316\3\2\2\2Z\u036f\3\2\2\2\\\u0371\3\2\2\2^\u0380\3\2\2\2"+
		"`\u038b\3\2\2\2b\u0392\3\2\2\2d\u0394\3\2\2\2f\u0397\3\2\2\2h\u039c\3"+
		"\2\2\2j\u03a1\3\2\2\2l\u03a5\3\2\2\2n\u03a9\3\2\2\2p\u03b3\3\2\2\2r\u03c3"+
		"\3\2\2\2t\u03c7\3\2\2\2v\u03c9\3\2\2\2x\u03d2\3\2\2\2z\u03e2\3\2\2\2|"+
		"\u03e8\3\2\2\2~\u03f0\3\2\2\2\u0080\u03f3\3\2\2\2\u0082\u03f6\3\2\2\2"+
		"\u0084\u0405\3\2\2\2\u0086\u0411\3\2\2\2\u0088\u0417\3\2\2\2\u008a\u041c"+
		"\3\2\2\2\u008c\u0421\3\2\2\2\u008e\u0431\3\2\2\2\u0090\u043c\3\2\2\2\u0092"+
		"\u0444\3\2\2\2\u0094\u0461\3\2\2\2\u0096\u0465\3\2\2\2\u0098\u0468\3\2"+
		"\2\2\u009a\u0477\3\2\2\2\u009c\u0484\3\2\2\2\u009e\u0486\3\2\2\2\u00a0"+
		"\u04a2\3\2\2\2\u00a2\u04b2\3\2\2\2\u00a4\u04b4\3\2\2\2\u00a6\u04b8\3\2"+
		"\2\2\u00a8\u04be\3\2\2\2\u00aa\u04c2\3\2\2\2\u00ac\u04d1\3\2\2\2\u00ae"+
		"\u04ec\3\2\2\2\u00b0\u04f4\3\2\2\2\u00b2\u0502\3\2\2\2\u00b4\u0509\3\2"+
		"\2\2\u00b6\u050e\3\2\2\2\u00b8\u00c5\5\4\3\2\u00b9\u00c5\5\6\4\2\u00ba"+
		"\u00c5\5L\'\2\u00bb\u00c5\5\16\b\2\u00bc\u00c5\5\20\t\2\u00bd\u00c5\5"+
		"\22\n\2\u00be\u00c5\5.\30\2\u00bf\u00c5\5@!\2\u00c0\u00c5\5\66\34\2\u00c1"+
		"\u00c5\5:\36\2\u00c2\u00c5\5<\37\2\u00c3\u00c5\5H%\2\u00c4\u00b8\3\2\2"+
		"\2\u00c4\u00b9\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bc"+
		"\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\2\2\3\u00ca\3\3\2\2\2"+
		"\u00cb\u00cd\7\62\2\2\u00cc\u00ce\7\u00ac\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\7\u00ad\2\2\u00d2\5\3\2\2\2\u00d3\u00e3\7%\2\2\u00d4"+
		"\u00d7\5\n\6\2\u00d5\u00d6\7\7\2\2\u00d6\u00d8\5`\61\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e4\3\2\2\2\u00d9\u00da\5\f\7\2\u00da"+
		"\u00db\7\37\2\2\u00db\u00dc\5\n\6\2\u00dc\u00e4\3\2\2\2\u00dd\u00de\7"+
		"k\2\2\u00de\u00df\7\7\2\2\u00df\u00e0\5`\61\2\u00e0\u00e1\7\37\2\2\u00e1"+
		"\u00e2\5\n\6\2\u00e2\u00e4\3\2\2\2\u00e3\u00d4\3\2\2\2\u00e3\u00d9\3\2"+
		"\2\2\u00e3\u00dd\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7O\2\2\u00e6"+
		"\7\3\2\2\2\u00e7\u00ea\5`\61\2\u00e8\u00e9\7\7\2\2\u00e9\u00eb\5`\61\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\t\3\2\2\2\u00ec\u00ed\7"+
		"{\2\2\u00ed\13\3\2\2\2\u00ee\u00ef\7L\2\2\u00ef\u00f4\5\b\5\2\u00f0\u00f1"+
		"\7`\2\2\u00f1\u00f3\5\b\5\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f8\7M\2\2\u00f8\r\3\2\2\2\u00f9\u00fb\7\4\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\21\2\2"+
		"\u00fd\u00ff\5`\61\2\u00fe\u0100\5\24\13\2\u00ff\u00fe\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0105\7L\2\2\u0102\u0104\5\30\r\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7M\2\2\u0109"+
		"\17\3\2\2\2\u010a\u010b\7\'\2\2\u010b\u010d\5`\61\2\u010c\u010e\5\24\13"+
		"\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113"+
		"\7L\2\2\u0110\u0112\5\30\r\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\7M\2\2\u0117\21\3\2\2\2\u0118\u0119\7*\2\2\u0119\u011a"+
		"\5`\61\2\u011a\u011e\7L\2\2\u011b\u011d\5\30\r\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7M\2\2\u0122\23\3\2\2\2\u0123\u0124"+
		"\7)\2\2\u0124\u0129\5\26\f\2\u0125\u0126\7`\2\2\u0126\u0128\5\26\f\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\25\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\5\36\20\2\u012d"+
		"\u012f\5\34\17\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\27\3\2"+
		"\2\2\u0130\u013d\5(\25\2\u0131\u013d\5.\30\2\u0132\u013d\5\60\31\2\u0133"+
		"\u013d\5\62\32\2\u0134\u013d\5\64\33\2\u0135\u013d\5\66\34\2\u0136\u013d"+
		"\5:\36\2\u0137\u013d\5<\37\2\u0138\u013d\5> \2\u0139\u013d\5D#\2\u013a"+
		"\u013d\5H%\2\u013b\u013d\5L\'\2\u013c\u0130\3\2\2\2\u013c\u0131\3\2\2"+
		"\2\u013c\u0132\3\2\2\2\u013c\u0133\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u0135"+
		"\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u0137\3\2\2\2\u013c\u0138\3\2\2\2\u013c"+
		"\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\31\3\2\2"+
		"\2\u013e\u013f\5`\61\2\u013f\u0140\7N\2\2\u0140\u0141\5X-\2\u0141\33\3"+
		"\2\2\2\u0142\u0159\7H\2\2\u0143\u0148\5X-\2\u0144\u0145\7`\2\2\u0145\u0147"+
		"\5X-\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0143\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u015a\3\2\2\2\u014d\u0156\7L\2\2\u014e"+
		"\u0153\5\32\16\2\u014f\u0150\7`\2\2\u0150\u0152\5\32\16\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u015a\7M\2\2\u0159\u014b\3\2\2\2\u0159"+
		"\u014d\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7I\2\2\u015c\35\3\2\2\2"+
		"\u015d\u0162\5`\61\2\u015e\u015f\7P\2\2\u015f\u0161\5`\61\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\37\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\5\36\20\2\u0166\u0168\5\34"+
		"\17\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168!\3\2\2\2\u0169\u016a"+
		"\t\2\2\2\u016a#\3\2\2\2\u016b\u0170\5&\24\2\u016c\u016d\7`\2\2\u016d\u016f"+
		"\5&\24\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171%\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\5N(\2\u0174"+
		"\u0176\5V,\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2"+
		"\2\u0177\u0179\5`\61\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\'"+
		"\3\2\2\2\u017a\u017b\7\17\2\2\u017b\u017d\7H\2\2\u017c\u017e\5$\23\2\u017d"+
		"\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u018c\7I"+
		"\2\2\u0180\u018b\5 \21\2\u0181\u0182\6\25\2\3\u0182\u0183\7\61\2\2\u0183"+
		"\u018b\b\25\1\2\u0184\u0185\6\25\3\3\u0185\u0186\7(\2\2\u0186\u018b\b"+
		"\25\1\2\u0187\u0188\6\25\4\3\u0188\u0189\7\64\2\2\u0189\u018b\b\25\1\2"+
		"\u018a\u0180\3\2\2\2\u018a\u0181\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0187"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\5n8\2\u0190)\3\2\2\2\u0191"+
		"\u0192\t\3\2\2\u0192+\3\2\2\2\u0193\u019f\7\60\2\2\u0194\u0195\7H\2\2"+
		"\u0195\u019a\5\36\20\2\u0196\u0197\7`\2\2\u0197\u0199\5\36\20\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7I\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u0194\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0-\3\2\2\2"+
		"\u01a1\u01a5\7 \2\2\u01a2\u01a6\5`\61\2\u01a3\u01a6\7\32\2\2\u01a4\u01a6"+
		"\7\66\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2"+
		"\u01a6\u01a7\3\2\2\2\u01a7\u01a9\7H\2\2\u01a8\u01aa\5$\23\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01be\7I\2\2\u01ac"+
		"\u01ad\6\30\5\3\u01ad\u01ae\5\"\22\2\u01ae\u01af\b\30\1\2\u01af\u01bd"+
		"\3\2\2\2\u01b0\u01b1\6\30\6\3\u01b1\u01b2\5*\26\2\u01b2\u01b3\b\30\1\2"+
		"\u01b3\u01bd\3\2\2\2\u01b4\u01bd\5 \21\2\u01b5\u01b6\6\30\7\3\u01b6\u01b7"+
		"\7F\2\2\u01b7\u01bd\b\30\1\2\u01b8\u01b9\6\30\b\3\u01b9\u01ba\5,\27\2"+
		"\u01ba\u01bb\b\30\1\2\u01bb\u01bd\3\2\2\2\u01bc\u01ac\3\2\2\2\u01bc\u01b0"+
		"\3\2\2\2\u01bc\u01b4\3\2\2\2\u01bc\u01b5\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c6\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\78\2\2\u01c2\u01c3\7H\2\2\u01c3\u01c4"+
		"\5$\23\2\u01c4\u01c5\7I\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01cb\7O\2\2\u01c9\u01cb\5n8"+
		"\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb/\3\2\2\2\u01cc\u01cd"+
		"\7-\2\2\u01cd\u01d3\5`\61\2\u01ce\u01d0\7H\2\2\u01cf\u01d1\5$\23\2\u01d0"+
		"\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\7I"+
		"\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01de\3\2\2\2\u01d5"+
		"\u01d6\6\31\t\3\u01d6\u01d7\7F\2\2\u01d7\u01dd\b\31\1\2\u01d8\u01d9\6"+
		"\31\n\3\u01d9\u01da\5,\27\2\u01da\u01db\b\31\1\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01d5\3\2\2\2\u01dc\u01d8\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e3\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1"+
		"\u01e4\7O\2\2\u01e2\u01e4\5n8\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2"+
		"\2\u01e4\61\3\2\2\2\u01e5\u01e6\7\32\2\2\u01e6\u01ea\7H\2\2\u01e7\u01e8"+
		"\5$\23\2\u01e8\u01e9\b\32\1\2\u01e9\u01eb\3\2\2\2\u01ea\u01e7\3\2\2\2"+
		"\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01fe\7I\2\2\u01ed\u01ee"+
		"\6\32\13\3\u01ee\u01ef\7\31\2\2\u01ef\u01fd\b\32\1\2\u01f0\u01f1\6\32"+
		"\f\3\u01f1\u01f2\5*\26\2\u01f2\u01f3\b\32\1\2\u01f3\u01fd\3\2\2\2\u01f4"+
		"\u01fd\5 \21\2\u01f5\u01f6\6\32\r\3\u01f6\u01f7\7F\2\2\u01f7\u01fd\b\32"+
		"\1\2\u01f8\u01f9\6\32\16\3\u01f9\u01fa\5,\27\2\u01fa\u01fb\b\32\1\2\u01fb"+
		"\u01fd\3\2\2\2\u01fc\u01ed\3\2\2\2\u01fc\u01f0\3\2\2\2\u01fc\u01f4\3\2"+
		"\2\2\u01fc\u01f5\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0208\3\2\2\2\u0200\u01fe\3\2"+
		"\2\2\u0201\u0202\6\32\17\3\u0202\u0203\78\2\2\u0203\u0204\7H\2\2\u0204"+
		"\u0205\5$\23\2\u0205\u0206\7I\2\2\u0206\u0209\3\2\2\2\u0207\u0209\6\32"+
		"\20\3\u0208\u0201\3\2\2\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u020d\7O\2\2\u020b\u020d\5n8\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2"+
		"\2\u020d\63\3\2\2\2\u020e\u020f\7\66\2\2\u020f\u0210\7H\2\2\u0210\u0221"+
		"\7I\2\2\u0211\u0212\6\33\21\3\u0212\u0213\7\31\2\2\u0213\u0220\b\33\1"+
		"\2\u0214\u0215\6\33\22\3\u0215\u0216\7\61\2\2\u0216\u0220\b\33\1\2\u0217"+
		"\u0220\5 \21\2\u0218\u0219\6\33\23\3\u0219\u021a\7F\2\2\u021a\u0220\b"+
		"\33\1\2\u021b\u021c\6\33\24\3\u021c\u021d\5,\27\2\u021d\u021e\b\33\1\2"+
		"\u021e\u0220\3\2\2\2\u021f\u0211\3\2\2\2\u021f\u0214\3\2\2\2\u021f\u0217"+
		"\3\2\2\2\u021f\u0218\3\2\2\2\u021f\u021b\3\2\2\2\u0220\u0223\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0226\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0224\u0227\7O\2\2\u0225\u0227\5n8\2\u0226\u0224\3\2\2\2\u0226\u0225"+
		"\3\2\2\2\u0227\65\3\2\2\2\u0228\u0229\7=\2\2\u0229\u022a\5`\61\2\u022a"+
		"\u022c\7L\2\2\u022b\u022d\58\35\2\u022c\u022b\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0231\7M\2\2\u0231\67\3\2\2\2\u0232\u0233\5N(\2\u0233\u0234\5`\61\2\u0234"+
		"\u0235\7O\2\2\u02359\3\2\2\2\u0236\u0237\7\26\2\2\u0237\u0238\5`\61\2"+
		"\u0238\u0239\7L\2\2\u0239\u023e\5`\61\2\u023a\u023b\7`\2\2\u023b\u023d"+
		"\5`\61\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0242\7M"+
		"\2\2\u0242;\3\2\2\2\u0243\u0244\7@\2\2\u0244\u0245\5`\61\2\u0245\u0246"+
		"\7)\2\2\u0246\u0247\5P)\2\u0247\u0248\7O\2\2\u0248=\3\2\2\2\u0249\u025f"+
		"\5N(\2\u024a\u024b\6 \25\3\u024b\u024c\7\64\2\2\u024c\u025e\b \1\2\u024d"+
		"\u024e\6 \26\3\u024e\u024f\7\63\2\2\u024f\u025e\b \1\2\u0250\u0251\6 "+
		"\27\3\u0251\u0252\7(\2\2\u0252\u025e\b \1\2\u0253\u0254\6 \30\3\u0254"+
		"\u0255\7\16\2\2\u0255\u025e\b \1\2\u0256\u0257\6 \31\3\u0257\u0258\5,"+
		"\27\2\u0258\u0259\b \1\2\u0259\u025e\3\2\2\2\u025a\u025b\6 \32\3\u025b"+
		"\u025c\7$\2\2\u025c\u025e\b \1\2\u025d\u024a\3\2\2\2\u025d\u024d\3\2\2"+
		"\2\u025d\u0250\3\2\2\2\u025d\u0253\3\2\2\2\u025d\u0256\3\2\2\2\u025d\u025a"+
		"\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0265\5`\61\2\u0263\u0264\7T"+
		"\2\2\u0264\u0266\5X-\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267"+
		"\3\2\2\2\u0267\u0268\7O\2\2\u0268?\3\2\2\2\u0269\u026a\5N(\2\u026a\u026b"+
		"\7\16\2\2\u026b\u026c\5`\61\2\u026c\u026d\7T\2\2\u026d\u026e\5X-\2\u026e"+
		"\u026f\7O\2\2\u026fA\3\2\2\2\u0270\u0272\5N(\2\u0271\u0273\7&\2\2\u0272"+
		"\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0276\5`"+
		"\61\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276C\3\2\2\2\u0277\u0278"+
		"\7\30\2\2\u0278\u0279\5`\61\2\u0279\u0282\7H\2\2\u027a\u027f\5B\"\2\u027b"+
		"\u027c\7`\2\2\u027c\u027e\5B\"\2\u027d\u027b\3\2\2\2\u027e\u0281\3\2\2"+
		"\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f"+
		"\3\2\2\2\u0282\u027a\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0286\7I\2\2\u0285\u0287\7\6\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u0289\7O\2\2\u0289E\3\2\2\2\u028a\u028c"+
		"\5N(\2\u028b\u028d\5`\61\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"G\3\2\2\2\u028e\u028f\7\27\2\2\u028f\u0290\5`\61\2\u0290\u0299\7H\2\2"+
		"\u0291\u0296\5F$\2\u0292\u0293\7`\2\2\u0293\u0295\5F$\2\u0294\u0292\3"+
		"\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u0291\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a\u029b\3\2\2\2\u029b\u029c\7I\2\2\u029c\u029d\7O\2\2\u029dI"+
		"\3\2\2\2\u029e\u029f\t\4\2\2\u029fK\3\2\2\2\u02a0\u02b5\7D\2\2\u02a1\u02b6"+
		"\5\36\20\2\u02a2\u02a3\7L\2\2\u02a3\u02a6\5\36\20\2\u02a4\u02a5\7\7\2"+
		"\2\u02a5\u02a7\5J&\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02b0"+
		"\3\2\2\2\u02a8\u02a9\7`\2\2\u02a9\u02ac\5\36\20\2\u02aa\u02ab\7\7\2\2"+
		"\u02ab\u02ad\5J&\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af"+
		"\3\2\2\2\u02ae\u02a8\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b4\7M"+
		"\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02a1\3\2\2\2\u02b5\u02a2\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02ba\7\36\2\2\u02b8\u02bb\7k\2\2\u02b9\u02bb\5N"+
		"(\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc"+
		"\u02be\7!\2\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2"+
		"\2\2\u02bf\u02c0\7O\2\2\u02c0M\3\2\2\2\u02c1\u02c2\b(\1\2\u02c2\u02c7"+
		"\5P)\2\u02c3\u02c7\5R*\2\u02c4\u02c7\5\u0098M\2\u02c5\u02c7\5\36\20\2"+
		"\u02c6\u02c1\3\2\2\2\u02c6\u02c3\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c5"+
		"\3\2\2\2\u02c7\u02d0\3\2\2\2\u02c8\u02c9\f\3\2\2\u02c9\u02cb\7J\2\2\u02ca"+
		"\u02cc\5X-\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2"+
		"\2\u02cd\u02cf\7K\2\2\u02ce\u02c8\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce"+
		"\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1O\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3"+
		"\u02e0\7\5\2\2\u02d4\u02d5\6)\34\3\u02d5\u02d6\7\5\2\2\u02d6\u02e0\7\61"+
		"\2\2\u02d7\u02e0\7\t\2\2\u02d8\u02e0\7<\2\2\u02d9\u02e0\7\13\2\2\u02da"+
		"\u02e0\7:\2\2\u02db\u02e0\7C\2\2\u02dc\u02e0\7\35\2\2\u02dd\u02e0\7\34"+
		"\2\2\u02de\u02e0\7A\2\2\u02df\u02d3\3\2\2\2\u02df\u02d4\3\2\2\2\u02df"+
		"\u02d7\3\2\2\2\u02df\u02d8\3\2\2\2\u02df\u02d9\3\2\2\2\u02df\u02da\3\2"+
		"\2\2\u02df\u02db\3\2\2\2\u02df\u02dc\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02de\3\2\2\2\u02e0Q\3\2\2\2\u02e1\u02e2\7 \2\2\u02e2\u02e4\7H\2\2\u02e3"+
		"\u02e5\5$\23\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2"+
		"\2\2\u02e6\u02f1\7I\2\2\u02e7\u02e8\6*\35\3\u02e8\u02e9\5\"\22\2\u02e9"+
		"\u02ea\b*\1\2\u02ea\u02f0\3\2\2\2\u02eb\u02ec\6*\36\3\u02ec\u02ed\5*\26"+
		"\2\u02ed\u02ee\b*\1\2\u02ee\u02f0\3\2\2\2\u02ef\u02e7\3\2\2\2\u02ef\u02eb"+
		"\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f9\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\78\2\2\u02f5\u02f6\7H\2"+
		"\2\u02f6\u02f7\5$\23\2\u02f7\u02f8\7I\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f4"+
		"\3\2\2\2\u02f9\u02fa\3\2\2\2\u02faS\3\2\2\2\u02fb\u02fd\5N(\2\u02fc\u02fe"+
		"\5V,\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u0300\5`\61\2\u0300U\3\2\2\2\u0301\u0302\t\5\2\2\u0302W\3\2\2\2\u0303"+
		"\u0304\b-\1\2\u0304\u0305\7\61\2\2\u0305\u0317\5\34\17\2\u0306\u0307\7"+
		"@\2\2\u0307\u0308\7H\2\2\u0308\u0309\5N(\2\u0309\u030a\7I\2\2\u030a\u0317"+
		"\3\2\2\2\u030b\u030c\t\6\2\2\u030c\u0317\5X-\25\u030d\u030e\7.\2\2\u030e"+
		"\u0317\5N(\2\u030f\u0317\5\\/\2\u0310\u0317\5^\60\2\u0311\u0315\5`\61"+
		"\2\u0312\u0315\5b\62\2\u0313\u0315\5P)\2\u0314\u0311\3\2\2\2\u0314\u0312"+
		"\3\2\2\2\u0314\u0313\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0303\3\2\2\2\u0316"+
		"\u0306\3\2\2\2\u0316\u030b\3\2\2\2\u0316\u030d\3\2\2\2\u0316\u030f\3\2"+
		"\2\2\u0316\u0310\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u036c\3\2\2\2\u0318"+
		"\u0319\f\23\2\2\u0319\u031a\7n\2\2\u031a\u036b\5X-\23\u031b\u031c\f\22"+
		"\2\2\u031c\u031d\t\7\2\2\u031d\u036b\5X-\23\u031e\u031f\f\21\2\2\u031f"+
		"\u0320\t\b\2\2\u0320\u036b\5X-\22\u0321\u0322\f\20\2\2\u0322\u0323\t\t"+
		"\2\2\u0323\u036b\5X-\21\u0324\u0325\f\17\2\2\u0325\u0326\7e\2\2\u0326"+
		"\u036b\5X-\20\u0327\u0328\f\16\2\2\u0328\u0329\7d\2\2\u0329\u036b\5X-"+
		"\17\u032a\u032b\f\r\2\2\u032b\u032c\7c\2\2\u032c\u036b\5X-\16\u032d\u032e"+
		"\f\f\2\2\u032e\u032f\t\n\2\2\u032f\u036b\5X-\r\u0330\u0331\f\13\2\2\u0331"+
		"\u0332\t\13\2\2\u0332\u036b\5X-\f\u0333\u0334\f\n\2\2\u0334\u0335\7b\2"+
		"\2\u0335\u036b\5X-\13\u0336\u0337\f\t\2\2\u0337\u0338\7a\2\2\u0338\u036b"+
		"\5X-\n\u0339\u033a\f\b\2\2\u033a\u033b\7Q\2\2\u033b\u033c\5X-\2\u033c"+
		"\u033d\7N\2\2\u033d\u033e\5X-\b\u033e\u036b\3\2\2\2\u033f\u0340\f\7\2"+
		"\2\u0340\u0341\5Z.\2\u0341\u0342\5X-\7\u0342\u036b\3\2\2\2\u0343\u0344"+
		"\f\34\2\2\u0344\u0346\7J\2\2\u0345\u0347\5X-\2\u0346\u0345\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u036b\7K\2\2\u0349\u034a\f\33"+
		"\2\2\u034a\u034c\7J\2\2\u034b\u034d\5X-\2\u034c\u034b\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0350\7N\2\2\u034f\u0351\5X-\2\u0350"+
		"\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u036b\7K"+
		"\2\2\u0353\u0354\f\32\2\2\u0354\u0357\7P\2\2\u0355\u0358\5`\61\2\u0356"+
		"\u0358\7\5\2\2\u0357\u0355\3\2\2\2\u0357\u0356\3\2\2\2\u0358\u036b\3\2"+
		"\2\2\u0359\u035a\f\31\2\2\u035a\u0363\7L\2\2\u035b\u0360\5\32\16\2\u035c"+
		"\u035d\7`\2\2\u035d\u035f\5\32\16\2\u035e\u035c\3\2\2\2\u035f\u0362\3"+
		"\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0364\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0363\u035b\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2"+
		"\2\2\u0365\u036b\7M\2\2\u0366\u0367\f\30\2\2\u0367\u036b\5\34\17\2\u0368"+
		"\u0369\f\24\2\2\u0369\u036b\t\f\2\2\u036a\u0318\3\2\2\2\u036a\u031b\3"+
		"\2\2\2\u036a\u031e\3\2\2\2\u036a\u0321\3\2\2\2\u036a\u0324\3\2\2\2\u036a"+
		"\u0327\3\2\2\2\u036a\u032a\3\2\2\2\u036a\u032d\3\2\2\2\u036a\u0330\3\2"+
		"\2\2\u036a\u0333\3\2\2\2\u036a\u0336\3\2\2\2\u036a\u0339\3\2\2\2\u036a"+
		"\u033f\3\2\2\2\u036a\u0343\3\2\2\2\u036a\u0349\3\2\2\2\u036a\u0353\3\2"+
		"\2\2\u036a\u0359\3\2\2\2\u036a\u0366\3\2\2\2\u036a\u0368\3\2\2\2\u036b"+
		"\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036dY\3\2\2\2"+
		"\u036e\u036c\3\2\2\2\u036f\u0370\t\r\2\2\u0370[\3\2\2\2\u0371\u0373\7"+
		"H\2\2\u0372\u0374\5X-\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u037b\3\2\2\2\u0375\u0377\7`\2\2\u0376\u0378\5X-\2\u0377\u0376\3\2\2"+
		"\2\u0377\u0378\3\2\2\2\u0378\u037a\3\2\2\2\u0379\u0375\3\2\2\2\u037a\u037d"+
		"\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\3\2\2\2\u037d"+
		"\u037b\3\2\2\2\u037e\u037f\7I\2\2\u037f]\3\2\2\2\u0380\u0381\7J\2\2\u0381"+
		"\u0386\5X-\2\u0382\u0383\7`\2\2\u0383\u0385\5X-\2\u0384\u0382\3\2\2\2"+
		"\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389"+
		"\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038a\7K\2\2\u038a_\3\2\2\2\u038b\u038c"+
		"\t\16\2\2\u038ca\3\2\2\2\u038d\u0393\5f\64\2\u038e\u0393\5l\67\2\u038f"+
		"\u0393\5d\63\2\u0390\u0393\5h\65\2\u0391\u0393\5j\66\2\u0392\u038d\3\2"+
		"\2\2\u0392\u038e\3\2\2\2\u0392\u038f\3\2\2\2\u0392\u0390\3\2\2\2\u0392"+
		"\u0391\3\2\2\2\u0393c\3\2\2\2\u0394\u0395\t\17\2\2\u0395e\3\2\2\2\u0396"+
		"\u0398\t\20\2\2\u0397\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u0397\3"+
		"\2\2\2\u0399\u039a\3\2\2\2\u039ag\3\2\2\2\u039b\u039d\7~\2\2\u039c\u039b"+
		"\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"i\3\2\2\2\u03a0\u03a2\7}\2\2\u03a1\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4k\3\2\2\2\u03a5\u03a7\t\21\2\2"+
		"\u03a6\u03a8\7/\2\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8m\3\2"+
		"\2\2\u03a9\u03ae\7L\2\2\u03aa\u03ad\5r:\2\u03ab\u03ad\5p9\2\u03ac\u03aa"+
		"\3\2\2\2\u03ac\u03ab\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b2\7M"+
		"\2\2\u03b2o\3\2\2\2\u03b3\u03b4\7B\2\2\u03b4\u03b5\5n8\2\u03b5q\3\2\2"+
		"\2\u03b6\u03c4\5n8\2\u03b7\u03c4\5t;\2\u03b8\u03c4\5v<\2\u03b9\u03c4\5"+
		"x=\2\u03ba\u03c4\5z>\2\u03bb\u03c4\5|?\2\u03bc\u03c4\5~@\2\u03bd\u03c4"+
		"\5\u0080A\2\u03be\u03c4\5\u0082B\2\u03bf\u03c4\5\u0086D\2\u03c0\u03c4"+
		"\5\u0088E\2\u03c1\u03c4\5\u008aF\2\u03c2\u03c4\5\u008cG\2\u03c3\u03b6"+
		"\3\2\2\2\u03c3\u03b7\3\2\2\2\u03c3\u03b8\3\2\2\2\u03c3\u03b9\3\2\2\2\u03c3"+
		"\u03ba\3\2\2\2\u03c3\u03bb\3\2\2\2\u03c3\u03bc\3\2\2\2\u03c3\u03bd\3\2"+
		"\2\2\u03c3\u03be\3\2\2\2\u03c3\u03bf\3\2\2\2\u03c3\u03c0\3\2\2\2\u03c3"+
		"\u03c1\3\2\2\2\u03c3\u03c2\3\2\2\2\u03c4s\3\2\2\2\u03c5\u03c8\5\u0094"+
		"K\2\u03c6\u03c8\5\u0096L\2\u03c7\u03c5\3\2\2\2\u03c7\u03c6\3\2\2\2\u03c8"+
		"u\3\2\2\2\u03c9\u03ca\7#\2\2\u03ca\u03cb\7H\2\2\u03cb\u03cc\5X-\2\u03cc"+
		"\u03cd\7I\2\2\u03cd\u03d0\5r:\2\u03ce\u03cf\7\24\2\2\u03cf\u03d1\5r:\2"+
		"\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1w\3\2\2\2\u03d2\u03d3\7"+
		"\36\2\2\u03d3\u03d6\7H\2\2\u03d4\u03d7\5t;\2\u03d5\u03d7\7O\2\2\u03d6"+
		"\u03d4\3\2\2\2\u03d6\u03d5\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03db\5\u0096"+
		"L\2\u03d9\u03db\7O\2\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2\2\2\u03db\u03dd"+
		"\3\2\2\2\u03dc\u03de\5X-\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e0\7I\2\2\u03e0\u03e1\5r:\2\u03e1y\3\2\2\2\u03e2"+
		"\u03e3\7G\2\2\u03e3\u03e4\7H\2\2\u03e4\u03e5\5X-\2\u03e5\u03e6\7I\2\2"+
		"\u03e6\u03e7\5r:\2\u03e7{\3\2\2\2\u03e8\u03e9\7\23\2\2\u03e9\u03ea\5r"+
		":\2\u03ea\u03eb\7G\2\2\u03eb\u03ec\7H\2\2\u03ec\u03ed\5X-\2\u03ed\u03ee"+
		"\7I\2\2\u03ee\u03ef\7O\2\2\u03ef}\3\2\2\2\u03f0\u03f1\7\20\2\2\u03f1\u03f2"+
		"\7O\2\2\u03f2\177\3\2\2\2\u03f3\u03f4\7\n\2\2\u03f4\u03f5\7O\2\2\u03f5"+
		"\u0081\3\2\2\2\u03f6\u03f7\7?\2\2\u03f7\u03fd\5X-\2\u03f8\u03f9\78\2\2"+
		"\u03f9\u03fa\7H\2\2\u03fa\u03fb\5$\23\2\u03fb\u03fc\7I\2\2\u03fc\u03fe"+
		"\3\2\2\2\u03fd\u03f8\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0401\5n8\2\u0400\u0402\5\u0084C\2\u0401\u0400\3\2\2\2\u0402\u0403\3"+
		"\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0083\3\2\2\2\u0405"+
		"\u040d\7\r\2\2\u0406\u0408\5`\61\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2"+
		"\2\2\u0408\u0409\3\2\2\2\u0409\u040a\7H\2\2\u040a\u040b\5$\23\2\u040b"+
		"\u040c\7I\2\2\u040c\u040e\3\2\2\2\u040d\u0407\3\2\2\2\u040d\u040e\3\2"+
		"\2\2\u040e\u040f\3\2\2\2\u040f\u0410\5n8\2\u0410\u0085\3\2\2\2\u0411\u0413"+
		"\7\67\2\2\u0412\u0414\5X-\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0416\7O\2\2\u0416\u0087\3\2\2\2\u0417\u0418\7\25"+
		"\2\2\u0418\u0419\5X-\2\u0419\u041a\5\34\17\2\u041a\u041b\7O\2\2\u041b"+
		"\u0089\3\2\2\2\u041c\u041d\79\2\2\u041d\u041e\5X-\2\u041e\u041f\5\34\17"+
		"\2\u041f\u0420\7O\2\2\u0420\u008b\3\2\2\2\u0421\u0423\7\b\2\2\u0422\u0424"+
		"\7\u0085\2\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2"+
		"\2\u0425\u0427\5\u008eH\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u042c\7\u0086\2\2\u0429\u042b\5\u009cO\2\u042a\u0429"+
		"\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u042f\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u0430\7\u009d\2\2\u0430\u008d"+
		"\3\2\2\2\u0431\u0432\7\u0088\2\2\u0432\u0437\7\u0087\2\2\u0433\u0434\7"+
		"\u008a\2\2\u0434\u0436\7\u0087\2\2\u0435\u0433\3\2\2\2\u0436\u0439\3\2"+
		"\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\3\2\2\2\u0439"+
		"\u0437\3\2\2\2\u043a\u043b\7\u0089\2\2\u043b\u008f\3\2\2\2\u043c\u0441"+
		"\5T+\2\u043d\u043e\7`\2\2\u043e\u0440\5T+\2\u043f\u043d\3\2\2\2\u0440"+
		"\u0443\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0091\3\2"+
		"\2\2\u0443\u0441\3\2\2\2\u0444\u0448\7H\2\2\u0445\u0447\7`\2\2\u0446\u0445"+
		"\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449"+
		"\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044c\5T+\2\u044c\u0453\3\2\2"+
		"\2\u044d\u044f\7`\2\2\u044e\u0450\5T+\2\u044f\u044e\3\2\2\2\u044f\u0450"+
		"\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u044d\3\2\2\2\u0452\u0455\3\2\2\2\u0453"+
		"\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u0453\3\2"+
		"\2\2\u0456\u0457\7I\2\2\u0457\u0093\3\2\2\2\u0458\u045b\5T+\2\u0459\u045a"+
		"\7T\2\2\u045a\u045c\5X-\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c"+
		"\u0462\3\2\2\2\u045d\u045e\5\u0092J\2\u045e\u045f\7T\2\2\u045f\u0460\5"+
		"X-\2\u0460\u0462\3\2\2\2\u0461\u0458\3\2\2\2\u0461\u045d\3\2\2\2\u0462"+
		"\u0463\3\2\2\2\u0463\u0464\7O\2\2\u0464\u0095\3\2\2\2\u0465\u0466\5X-"+
		"\2\u0466\u0467\7O\2\2\u0467\u0097\3\2\2\2\u0468\u0469\7+\2\2\u0469\u046a"+
		"\7H\2\2\u046a\u046c\5\u009aN\2\u046b\u046d\5`\61\2\u046c\u046b\3\2\2\2"+
		"\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\7R\2\2\u046f\u0471"+
		"\5N(\2\u0470\u0472\5`\61\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u0474\7I\2\2\u0474\u0099\3\2\2\2\u0475\u0478\5P)"+
		"\2\u0476\u0478\5\36\20\2\u0477\u0475\3\2\2\2\u0477\u0476\3\2\2\2\u0478"+
		"\u009b\3\2\2\2\u0479\u0485\5\u009eP\2\u047a\u0485\5\u00a0Q\2\u047b\u0485"+
		"\5\u00a2R\2\u047c\u0485\5\u00b0Y\2\u047d\u0485\5\u00a4S\2\u047e\u0485"+
		"\5\u00a6T\2\u047f\u0485\5\u00aaV\2\u0480\u0485\7\u0096\2\2\u0481\u0485"+
		"\7\u008e\2\2\u0482\u0485\7\u0090\2\2\u0483\u0485\5\u00acW\2\u0484\u0479"+
		"\3\2\2\2\u0484\u047a\3\2\2\2\u0484\u047b\3\2\2\2\u0484\u047c\3\2\2\2\u0484"+
		"\u047d\3\2\2\2\u0484\u047e\3\2\2\2\u0484\u047f\3\2\2\2\u0484\u0480\3\2"+
		"\2\2\u0484\u0481\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0483\3\2\2\2\u0485"+
		"\u009d\3\2\2\2\u0486\u048a\7\u009c\2\2\u0487\u0489\5\u009cO\2\u0488\u0487"+
		"\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u048d\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u048e\7\u009d\2\2\u048e\u009f"+
		"\3\2\2\2\u048f\u0490\7\u0097\2\2\u0490\u0493\7\u00a4\2\2\u0491\u0492\7"+
		"\u00a0\2\2\u0492\u0494\5\u00b6\\\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2"+
		"\2\2\u0494\u04a3\3\2\2\2\u0495\u0496\7\u0097\2\2\u0496\u049b\7\u00a4\2"+
		"\2\u0497\u0498\7\u00a2\2\2\u0498\u049a\7\u00a4\2\2\u0499\u0497\3\2\2\2"+
		"\u049a\u049d\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u04a0"+
		"\3\2\2\2\u049d\u049b\3\2\2\2\u049e\u049f\7\u00a0\2\2\u049f\u04a1\5\u00b0"+
		"Y\2\u04a0\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\3\2\2\2\u04a2"+
		"\u048f\3\2\2\2\u04a2\u0495\3\2\2\2\u04a3\u00a1\3\2\2\2\u04a4\u04a5\5\u00ae"+
		"X\2\u04a5\u04a6\7\u00a0\2\2\u04a6\u04a7\5\u00b6\\\2\u04a7\u04b3\3\2\2"+
		"\2\u04a8\u04ab\5\u00aeX\2\u04a9\u04aa\7\u00a2\2\2\u04aa\u04ac\5\u00ae"+
		"X\2\u04ab\u04a9\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\7\u00a0\2\2\u04b0\u04b1"+
		"\5\u00b0Y\2\u04b1\u04b3\3\2\2\2\u04b2\u04a4\3\2\2\2\u04b2\u04a8\3\2\2"+
		"\2\u04b3\u00a3\3\2\2\2\u04b4\u04b5\7\u0095\2\2\u04b5\u04b6\5\u00b6\\\2"+
		"\u04b6\u04b7\5\u009eP\2\u04b7\u00a5\3\2\2\2\u04b8\u04b9\7\u0093\2\2\u04b9"+
		"\u04ba\5\u009eP\2\u04ba\u04bb\5\u00b6\\\2\u04bb\u04bc\5\u009eP\2\u04bc"+
		"\u04bd\5\u009eP\2\u04bd\u00a7\3\2\2\2\u04be\u04bf\7\u008f\2\2\u04bf\u04c0"+
		"\5\u00b4[\2\u04c0\u04c1\5\u009eP\2\u04c1\u00a9\3\2\2\2\u04c2\u04c3\7\u0098"+
		"\2\2\u04c3\u04cf\5\u00b6\\\2\u04c4\u04c6\5\u00a8U\2\u04c5\u04c4\3\2\2"+
		"\2\u04c6\u04c7\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04cb"+
		"\3\2\2\2\u04c9\u04ca\7\u0091\2\2\u04ca\u04cc\5\u009eP\2\u04cb\u04c9\3"+
		"\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04d0\3\2\2\2\u04cd\u04ce\7\u0091\2\2"+
		"\u04ce\u04d0\5\u009eP\2\u04cf\u04c5\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0"+
		"\u00ab\3\2\2\2\u04d1\u04d2\7\u0094\2\2\u04d2\u04d3\7\u00a4\2\2\u04d3\u04dc"+
		"\7\u009e\2\2\u04d4\u04d9\7\u00a4\2\2\u04d5\u04d6\7\u00a2\2\2\u04d6\u04d8"+
		"\7\u00a4\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7\3\2\2"+
		"\2\u04d9\u04da\3\2\2\2\u04da\u04dd\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u04d4"+
		"\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e8\7\u009f\2"+
		"\2\u04df\u04e0\7\u00a3\2\2\u04e0\u04e5\7\u00a4\2\2\u04e1\u04e2\7\u00a2"+
		"\2\2\u04e2\u04e4\7\u00a4\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e7\3\2\2\2\u04e5"+
		"\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e9\3\2\2\2\u04e7\u04e5\3\2"+
		"\2\2\u04e8\u04df\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea"+
		"\u04eb\5\u009eP\2\u04eb\u00ad\3\2\2\2\u04ec\u04f1\7\u00a4\2\2\u04ed\u04ee"+
		"\7\u00a1\2\2\u04ee\u04f0\t\22\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3\2"+
		"\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u00af\3\2\2\2\u04f3"+
		"\u04f1\3\2\2\2\u04f4\u04f5\t\22\2\2\u04f5\u04fe\7\u009e\2\2\u04f6\u04fb"+
		"\5\u00b6\\\2\u04f7\u04f8\7\u00a2\2\2\u04f8\u04fa\5\u00b6\\\2\u04f9\u04f7"+
		"\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc"+
		"\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe\u04f6\3\2\2\2\u04fe\u04ff\3\2"+
		"\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\7\u009f\2\2\u0501\u00b1\3\2\2\2\u0502"+
		"\u0503\t\23\2\2\u0503\u00b3\3\2\2\2\u0504\u050a\7\u00a6\2\2\u0505\u050a"+
		"\7\u00a7\2\2\u0506\u050a\7\u00a5\2\2\u0507\u050a\5\u00b2Z\2\u0508\u050a"+
		"\7\u00a8\2\2\u0509\u0504\3\2\2\2\u0509\u0505\3\2\2\2\u0509\u0506\3\2\2"+
		"\2\u0509\u0507\3\2\2\2\u0509\u0508\3\2\2\2\u050a\u00b5\3\2\2\2\u050b\u050f"+
		"\5\u00aeX\2\u050c\u050f\5\u00b0Y\2\u050d\u050f\5\u00b4[\2\u050e\u050b"+
		"\3\2\2\2\u050e\u050c\3\2\2\2\u050e\u050d\3\2\2\2\u050f\u00b7\3\2\2\2\u0091"+
		"\u00c4\u00c6\u00cf\u00d7\u00e3\u00ea\u00f4\u00fa\u00ff\u0105\u010d\u0113"+
		"\u011e\u0129\u012e\u013c\u0148\u014b\u0153\u0156\u0159\u0162\u0167\u0170"+
		"\u0175\u0178\u017d\u018a\u018c\u019a\u019f\u01a5\u01a9\u01bc\u01be\u01c6"+
		"\u01ca\u01d0\u01d3\u01dc\u01de\u01e3\u01ea\u01fc\u01fe\u0208\u020c\u021f"+
		"\u0221\u0226\u022e\u023e\u025d\u025f\u0265\u0272\u0275\u027f\u0282\u0286"+
		"\u028c\u0296\u0299\u02a6\u02ac\u02b0\u02b5\u02ba\u02bd\u02c6\u02cb\u02d0"+
		"\u02df\u02e4\u02ef\u02f1\u02f9\u02fd\u0314\u0316\u0346\u034c\u0350\u0357"+
		"\u0360\u0363\u036a\u036c\u0373\u0377\u037b\u0386\u0392\u0399\u039e\u03a3"+
		"\u03a7\u03ac\u03ae\u03c3\u03c7\u03d0\u03d6\u03da\u03dd\u03fd\u0403\u0407"+
		"\u040d\u0413\u0423\u0426\u042c\u0437\u0441\u0448\u044f\u0453\u045b\u0461"+
		"\u046c\u0471\u0477\u0484\u048a\u0493\u049b\u04a0\u04a2\u04ad\u04b2\u04c7"+
		"\u04cb\u04cf\u04d9\u04dc\u04e5\u04e8\u04f1\u04fb\u04fe\u0509\u050e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}