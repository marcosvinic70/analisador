lexer grammar Scanner;

//reservadas
ABSTRACT : 'abstract';
BOOLEAN : 'boolean';
BYTE : 'byte';
CASE : 'case';
CATCH : 'catch';
CHAR : 'char';
CLASS : 'class';
CONST : 'const';
CONTINUE : 'continue';
BREAK : 'break';
DO : 'do';
DOUBLE : 'double';
ELSE : 'else';
ENUM : 'enum';
EXTENDS : 'extends';
FALSE : 'false';
FINAL : 'final';
FLOAT : 'float';
GOTO : 'goto';
IF : 'if';
IMPORT : 'import';
INSTANCEOF : 'instanceof';
INT : 'int';
LONG : 'long';
NEW : 'new';
PACKAGE : 'package';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
RETURN : 'return';
SWITCH : 'switch';
STATIC : 'static';
SUPER : 'super';
THIS : 'this';
TRUE : 'true';
THROW : 'throw';
THROWS : 'throws';
TRY : 'try';
VOID : 'void';
WHILE : 'while';

//operadores
ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';

//separadores
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

IDENTIFIER : ([A-Za-z] | '_') ([A-Za-z0-9] | '_' )*;
UNSIGNED_INTEGER : [0-9]+;
INTEGER : ( '-' )* [0-9]+;
UNSIGNED_REAL : [0-9]+ '.' [0-9]+;
REAL : ( '-' )* [0-9]+ '.' [0-9]+;
BOOL : ( TRUE | FALSE );
STRING : '"' .*? '"' ;

LINE_COMMENT : '//' ~[\r\n]* -> skip;
WHITESPACE : ( 't' | '\t' | ' ' | '\r' | '\n' | '\u000C' )+ -> skip;
