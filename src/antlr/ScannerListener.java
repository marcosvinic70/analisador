// Generated from /home/marcos/workspace/analisador/src/lex/Scanner.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScannerParser}.
 */
public interface ScannerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScannerParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ScannerParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ScannerParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ScannerParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ScannerParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(ScannerParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(ScannerParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(ScannerParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(ScannerParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(ScannerParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(ScannerParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(ScannerParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(ScannerParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(ScannerParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(ScannerParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(ScannerParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(ScannerParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(ScannerParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(ScannerParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(ScannerParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(ScannerParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(ScannerParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(ScannerParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(ScannerParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(ScannerParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(ScannerParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(ScannerParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(ScannerParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(ScannerParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ScannerParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ScannerParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(ScannerParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(ScannerParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ScannerParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ScannerParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(ScannerParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(ScannerParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(ScannerParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(ScannerParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(ScannerParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(ScannerParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ScannerParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ScannerParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(ScannerParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(ScannerParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ScannerParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ScannerParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(ScannerParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(ScannerParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(ScannerParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(ScannerParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(ScannerParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(ScannerParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ScannerParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ScannerParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(ScannerParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(ScannerParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(ScannerParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(ScannerParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(ScannerParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(ScannerParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(ScannerParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(ScannerParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ScannerParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ScannerParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ScannerParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ScannerParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(ScannerParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(ScannerParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ScannerParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ScannerParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(ScannerParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(ScannerParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(ScannerParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(ScannerParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(ScannerParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(ScannerParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(ScannerParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(ScannerParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ScannerParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ScannerParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ScannerParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ScannerParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(ScannerParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(ScannerParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(ScannerParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(ScannerParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(ScannerParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(ScannerParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(ScannerParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(ScannerParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(ScannerParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(ScannerParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(ScannerParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(ScannerParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(ScannerParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(ScannerParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ScannerParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ScannerParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(ScannerParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(ScannerParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(ScannerParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(ScannerParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ScannerParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ScannerParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(ScannerParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(ScannerParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(ScannerParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(ScannerParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ScannerParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ScannerParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ScannerParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ScannerParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ScannerParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ScannerParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(ScannerParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(ScannerParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(ScannerParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(ScannerParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(ScannerParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(ScannerParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(ScannerParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(ScannerParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(ScannerParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(ScannerParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(ScannerParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(ScannerParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(ScannerParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(ScannerParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(ScannerParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(ScannerParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(ScannerParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(ScannerParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(ScannerParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(ScannerParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(ScannerParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(ScannerParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(ScannerParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(ScannerParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ScannerParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ScannerParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(ScannerParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(ScannerParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(ScannerParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(ScannerParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(ScannerParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(ScannerParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(ScannerParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(ScannerParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ScannerParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ScannerParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ScannerParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ScannerParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ScannerParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ScannerParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(ScannerParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(ScannerParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(ScannerParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(ScannerParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(ScannerParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(ScannerParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(ScannerParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(ScannerParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(ScannerParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(ScannerParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(ScannerParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(ScannerParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ScannerParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ScannerParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(ScannerParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(ScannerParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(ScannerParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(ScannerParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ScannerParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ScannerParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(ScannerParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(ScannerParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(ScannerParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(ScannerParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(ScannerParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(ScannerParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(ScannerParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(ScannerParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(ScannerParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(ScannerParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(ScannerParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(ScannerParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(ScannerParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(ScannerParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(ScannerParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(ScannerParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(ScannerParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(ScannerParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(ScannerParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(ScannerParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(ScannerParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(ScannerParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(ScannerParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(ScannerParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(ScannerParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(ScannerParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(ScannerParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(ScannerParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(ScannerParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(ScannerParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(ScannerParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(ScannerParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(ScannerParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(ScannerParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(ScannerParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(ScannerParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(ScannerParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(ScannerParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(ScannerParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(ScannerParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(ScannerParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(ScannerParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(ScannerParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(ScannerParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(ScannerParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(ScannerParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(ScannerParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(ScannerParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(ScannerParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(ScannerParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(ScannerParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(ScannerParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(ScannerParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(ScannerParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(ScannerParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(ScannerParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(ScannerParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(ScannerParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(ScannerParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(ScannerParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(ScannerParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(ScannerParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(ScannerParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(ScannerParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(ScannerParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(ScannerParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(ScannerParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(ScannerParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(ScannerParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(ScannerParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(ScannerParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(ScannerParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ScannerParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ScannerParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(ScannerParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(ScannerParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ScannerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ScannerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(ScannerParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(ScannerParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ScannerParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ScannerParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(ScannerParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(ScannerParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(ScannerParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(ScannerParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ScannerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ScannerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(ScannerParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(ScannerParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(ScannerParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(ScannerParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(ScannerParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(ScannerParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(ScannerParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(ScannerParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(ScannerParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(ScannerParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ScannerParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ScannerParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ScannerParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ScannerParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(ScannerParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(ScannerParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(ScannerParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(ScannerParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(ScannerParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(ScannerParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(ScannerParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(ScannerParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ScannerParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ScannerParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(ScannerParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(ScannerParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(ScannerParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(ScannerParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(ScannerParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(ScannerParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(ScannerParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(ScannerParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(ScannerParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(ScannerParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ScannerParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ScannerParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(ScannerParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(ScannerParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ScannerParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ScannerParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ScannerParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ScannerParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(ScannerParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(ScannerParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(ScannerParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(ScannerParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(ScannerParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(ScannerParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ScannerParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ScannerParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(ScannerParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(ScannerParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(ScannerParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(ScannerParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(ScannerParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(ScannerParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(ScannerParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(ScannerParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ScannerParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ScannerParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ScannerParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ScannerParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ScannerParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ScannerParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ScannerParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ScannerParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(ScannerParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(ScannerParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(ScannerParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(ScannerParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(ScannerParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(ScannerParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ScannerParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ScannerParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(ScannerParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(ScannerParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(ScannerParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(ScannerParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(ScannerParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(ScannerParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(ScannerParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(ScannerParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(ScannerParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(ScannerParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(ScannerParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(ScannerParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(ScannerParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(ScannerParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ScannerParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ScannerParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(ScannerParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(ScannerParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(ScannerParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(ScannerParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(ScannerParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(ScannerParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(ScannerParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(ScannerParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ScannerParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ScannerParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ScannerParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ScannerParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(ScannerParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(ScannerParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ScannerParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ScannerParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ScannerParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ScannerParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(ScannerParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(ScannerParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(ScannerParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(ScannerParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(ScannerParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(ScannerParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(ScannerParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(ScannerParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(ScannerParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(ScannerParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(ScannerParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(ScannerParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(ScannerParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(ScannerParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ScannerParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ScannerParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(ScannerParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(ScannerParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(ScannerParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(ScannerParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(ScannerParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(ScannerParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(ScannerParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(ScannerParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(ScannerParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(ScannerParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ScannerParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ScannerParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(ScannerParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(ScannerParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(ScannerParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(ScannerParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(ScannerParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(ScannerParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(ScannerParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(ScannerParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(ScannerParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(ScannerParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(ScannerParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(ScannerParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ScannerParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ScannerParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ScannerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ScannerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(ScannerParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(ScannerParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(ScannerParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(ScannerParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(ScannerParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(ScannerParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(ScannerParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(ScannerParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ScannerParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ScannerParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ScannerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ScannerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(ScannerParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(ScannerParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ScannerParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ScannerParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ScannerParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ScannerParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(ScannerParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(ScannerParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(ScannerParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(ScannerParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(ScannerParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(ScannerParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(ScannerParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(ScannerParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ScannerParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ScannerParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ScannerParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ScannerParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ScannerParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ScannerParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(ScannerParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(ScannerParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ScannerParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ScannerParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ScannerParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ScannerParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ScannerParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ScannerParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(ScannerParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(ScannerParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(ScannerParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(ScannerParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(ScannerParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(ScannerParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ScannerParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ScannerParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(ScannerParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(ScannerParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(ScannerParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(ScannerParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(ScannerParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(ScannerParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(ScannerParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(ScannerParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ScannerParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ScannerParser.CastExpressionContext ctx);
}