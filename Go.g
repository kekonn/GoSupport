grammar Go;

tokens {
	BREAK='break';
	CASE='case';
	CHAN='chan';
	CONST='const';
	CONTINUE='continue';
	DEFAULT='default';
	DEFER='defer';
	ELSE='else';
	FALLTHROUGH='fallthrough';
	FOR='for';
	FUNC='func';
	GO='go';
	GOTO='goto';
	IF='if';
	IMPORT='import';
	INTERFACE='interface';
	MAP='map';
	PACKAGE='package';
	RANGE='range';
	RETURN='return';
	SELECT='select';
	STRUCT='struct';
	SWITCH='switch';
	TYPE='type';
	VAR='var';
}

digit	:	'0'..'9';

letter	:	'a'..'z'|'A'..'Z'|'_';

id	:	letter (letter | digit)*;


COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;


fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
