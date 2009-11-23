parser grammar GoParser;

options {
	tokenVocab = GoLexer;
}

@header {package be.jonas.gogrammar}

// package
packageName
	:	ID;
packageClause
	:	PACKAGE packageName;
	
// imports
importPath
	:	STRING_LIT;
importSpec
	:	(SELECTOR | packageName) importPath;
importSpecList
	:	importSpec (SEPARATOR importSpec)* SEPARATOR;
importDecl
	:	IMPORT (importSpec | (BRACEOPEN importSpecList BRACECLOSE ));

tag	:	STRING_LIT;
label	:	ID;
//labeledStatement: label ':' statement;
emptyStatement
	:	;

//type basics
qualifiedIdent
	:	(packageName SELECTOR)? ID ;
	
typeName:	qualifiedIdent;
type	:	typeName | typeLit | (BRACEOPEN type BRACECLOSE);
elementType
	:	type;
typeLit	:	mapType |channelType;

//channels
recvChannel
	:	CHANOP CHAN elementType;
sendChannel
	:	CHAN CHANOP elementType;
channel	:	CHAN elementType;
channelType
	:	channel | sendChannel | recvChannel;

//maps
keyType	:	type;
mapType	:	MAP SQBRACEOPEN keyType SQBRACECLOSE elementType ;

//literals
element	:	(key SLICE) value;
key	:	fieldName | elementIndex;
fieldName
	:	ID;
elementIndex
	:	expression;
value	:	expression;
basicLit:	INT_LIT | FLOAT_LIT | CHAR_LIT | STRINGLIT;

//expression
expression
	:	unaryExpr | (binary_op unaryExpr)*;
unaryExpr
	:	primaryExpr | unary_op unaryExpr;
binary_op
	:	log_op | com_op | rel_op | add_op | mul_op;
log_op	:	OR | AND;
rel_op	:	EQUAL | NOTEQUAL | SMT | SMTOREQUAL | LGT | LGTOREQUAL;
com_op	:	CHANOP;
add_op	:	PLUS | MINUS | BOR | BXOR;
mul_op	:	MULTIPLY | DIVIDE | MODULUS | BSHIFTL | BSHIFTR | AMPERSAND | BANDNOT;
unary_op:	PLUS | MINUS | NOT | BXOR | MULTIPLY | AMPERSAND | CHANOP;