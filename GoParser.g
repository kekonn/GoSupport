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
