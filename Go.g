lexer grammar Go;

// keywords
BREAK	:	'break';
CASE	:	'case';
CHAN	:	'chan';
CONST	:	'const';
CONTINUE:	'continue';
DEFAULT	:	'default';
DEFER	:	'defer';
ELSE	:	'else';
FALLTHROUGH
	:	'fallthrough';
FOR	:	'for';
FUNC	:	'funct';
GO	:	'go';
GOTO	:	'goto';
IF	:	'if';
IMPORT	:	'import';
INTERFACE
	:	'interface';
MAP	:	'map';
PACKAGE	:	'package';
RANGE	:	'range';
RETURN	:	'return';
SELECT	:	'select';
STRUCT	:	'struct';
SWITCH	:	'switch';
TYPE	:	'type';
VAR	:	'var';

fragment
UNICODE_LETTER	:	'a'..'z' | 'A'..'Z';

fragment
LETTER	:	UNICODE_LETTER | '_';

fragment
DIGIT	:	'0'..'9';

ID  :	LETTER (LETTER | DIGIT)*;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
HEX_DIGIT : (DIGIT|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

fragment
DECIMAL_LIT
	:	'1'..'9' (DIGIT)*;

fragment
OCTAL_LIT
	:	'0' ('0'..'7')*;

fragment
HEX_LIT	:	'0' ('x' | 'X' ) HEX_DIGIT HEX_DIGIT*;

INT_LIT	:	DECIMAL_LIT | OCTAL_LIT | HEX_LIT;

DECIMALS:	DIGIT (DIGIT)*;

EXPONENT:	('e'|'E') ('+'|'-')? DECIMALS;

FLOAT_LIT
	:	(DECIMALS '.' DECIMALS? EXPONENT?) | (DECIMALS EXPONENT) | ('.' DECIMALS EXPONENT?);

ESCAPED_CHAR
	:	
	'\\' ('a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\' | '\'' | '"');

fragment	
BIG_U_VALUE
	:	'\\' 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;

fragment	
LITTLE_U_VALUE
	:	UNICODE_ESC;

fragment
HEX_BYTE_VALUE
	:	'\\' HEX_DIGIT HEX_DIGIT ;
	
fragment
OCTAL_DIGIT
	:	('0'..'7');	

fragment
OCTAL_BYTE_VALUE
	:	'\\' OCTAL_DIGIT OCTAL_DIGIT OCTAL_DIGIT ;
	
BYTE_VALUE
	:	OCTAL_BYTE_VALUE | HEX_BYTE_VALUE;
	
UNICODE_VALUE
	:	UNICODE_LETTER | LITTLE_U_VALUE | BIG_U_VALUE;
	
CHAR_LIT:	'\'' (UNICODE_VALUE | BYTE_VALUE) '\'';

INTERPRETED_STRING_LIT
	:	'"' (UNICODE_VALUE | BYTE_VALUE)* '"';
	
RAW_STRING_LIT
	:	'`' UNICODE_LETTER* '`';
	
fragment
STRINGLIT
	:	RAW_STRING_LIT | INTERPRETED_STRING_LIT;
	
STRING_LIT
	:	STRINGLIT STRINGLIT*;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

PLUS	:	'+';
MINUS	:	'-';
MULTIPLY:	'*';
DIVIDE	:	'/';
MODULUS	:	'%';
AMPERSAND	:	'&';
BOR	:	'|';
BXOR	:	'^';
BSHIFTL	:	'<<';
BSHIFTR	:	'>>';
BANDNOT	:	AMPERSAND BXOR;
AND	:	'&&';
OR	:	'||';
CHANOP	:	'<-';
INCR	:	'++';
DECR	:	'--';
EQUAL	:	'==';
NOTEQUAL:	'!=';
LGT	:	'>';
SMT	:	'<';


ASSIGN	:	'=';
ASSIGNINIT
	:	':' ASSIGN;

PLUSASSIGN
	:	PLUS ASSIGN;
MINUSASSIGN
	:	MINUS ASSIGN;
MULTIPLYASSIGN
	:	MULTIPLY ASSIGN;
DIVIDEASSIGN
	:	DIVIDE ASSIGN;
MODASSIGN
	:	MODULUS ASSIGN;
BANDASSIGN
	:	AMPERSAND ASSIGN;
BORASSIGN
	:	BOR ASSIGN;
BXORASSIGN
	:	BXOR ASSIGN;
BSHIFTLASSIGN
	:	BSHIFTL ASSIGN;
BSHIFTRASSIGN
	:	BSHIFTR ASSIGN;
BANDNOTASSIGN
	:	BANDNOT ASSIGN;
SMTASSIGN
	:	SMT ASSIGN;
LGTASSIGN
	:	LGT ASSIGN;

EOL	:	'\n' | ';';
BRACEOPEN
	:	'(';
BRACECLOSE
	:	')';
SQBRACEOPEN
	:	'[';
SQBRACECLOSE
	:	']';
RBRACEOPEN
	:	'{';
RBRACECLOSE
	:	'}';
SLICE	:	':';
PARAMS	:	'...';
COMMA	:	',';
PERIOD	:	'.';
