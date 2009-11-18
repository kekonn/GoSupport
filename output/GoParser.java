// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/bloodsplatter/Projects/GoSupport/Go.g 2009-11-18 20:12:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "UNICODE_LETTER", "LETTER", "DIGIT", "ID", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", "INT_LIT", "DECIMALS", "EXPONENT", "FLOAT_LIT", "ESCAPED_CHAR", "BIG_U_VALUE", "LITTLE_U_VALUE", "HEX_BYTE_VALUE", "OCTAL_DIGIT", "OCTAL_BYTE_VALUE", "BYTE_VALUE", "UNICODE_VALUE", "CHAR_LIT", "INTERPRETED_STRING_LIT", "RAW_STRING_LIT", "STRINGLIT", "STRING_LIT", "COMMENT", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULUS", "AMPERSAND", "BOR", "BXOR", "BSHIFTL", "BSHIFTR", "BANDNOT", "AND", "OR", "CHANOP", "INCR", "DECR", "EQUAL", "NOTEQUAL", "LGT", "SMT", "ASSIGN", "ASSIGNINIT", "PLUSASSIGN", "MINUSASSIGN", "MULTIPLYASSIGN", "DIVIDEASSIGN", "MODASSIGN", "BANDASSIGN", "BORASSIGN", "BXORASSIGN", "BSHIFTLASSIGN", "BSHIFTRASSIGN", "BANDNOTASSIGN", "SMTASSIGN", "LGTASSIGN", "EOL", "BRACEOPEN", "BRACECLOSE", "SQBRACEOPEN", "SQBRACECLOSE", "RBRACEOPEN", "RBRACECLOSE", "SLICE", "PARAMS", "COMMA", "PERIOD"
    };
    public static final int PACKAGE=21;
    public static final int EXPONENT=43;
    public static final int DECIMALS=42;
    public static final int INT_LIT=41;
    public static final int LGT=78;
    public static final int SQBRACECLOSE=99;
    public static final int LETTER=30;
    public static final int CONST=7;
    public static final int BSHIFTL=68;
    public static final int OCTAL_ESC=37;
    public static final int CASE=5;
    public static final int BSHIFTR=69;
    public static final int CHAN=6;
    public static final int EOF=-1;
    public static final int BORASSIGN=88;
    public static final int DECIMAL_LIT=38;
    public static final int BREAK=4;
    public static final int OCTAL_DIGIT=49;
    public static final int RAW_STRING_LIT=55;
    public static final int TYPE=27;
    public static final int NOTEQUAL=77;
    public static final int IMPORT=18;
    public static final int EOL=95;
    public static final int INCR=74;
    public static final int FLOAT_LIT=44;
    public static final int RETURN=23;
    public static final int CHANOP=73;
    public static final int VAR=28;
    public static final int LGTASSIGN=94;
    public static final int UNICODE_LETTER=29;
    public static final int GOTO=16;
    public static final int COMMENT=58;
    public static final int PLUSASSIGN=82;
    public static final int SELECT=24;
    public static final int DIVIDE=63;
    public static final int ASSIGNINIT=81;
    public static final int PERIOD=105;
    public static final int SWITCH=26;
    public static final int ELSE=11;
    public static final int CHAR_LIT=53;
    public static final int MULTIPLYASSIGN=84;
    public static final int BRACEOPEN=96;
    public static final int WS=59;
    public static final int OCTAL_LIT=39;
    public static final int FUNC=14;
    public static final int OR=72;
    public static final int LITTLE_U_VALUE=47;
    public static final int GO=15;
    public static final int HEX_LIT=40;
    public static final int HEX_BYTE_VALUE=48;
    public static final int STRING_LIT=57;
    public static final int BANDNOTASSIGN=92;
    public static final int BSHIFTRASSIGN=91;
    public static final int FOR=13;
    public static final int SLICE=102;
    public static final int ID=32;
    public static final int AND=71;
    public static final int ESCAPED_CHAR=45;
    public static final int FALLTHROUGH=12;
    public static final int IF=17;
    public static final int RBRACEOPEN=100;
    public static final int ESC_SEQ=33;
    public static final int CONTINUE=8;
    public static final int MULTIPLY=62;
    public static final int COMMA=104;
    public static final int BXORASSIGN=89;
    public static final int BOR=66;
    public static final int EQUAL=76;
    public static final int UNICODE_VALUE=52;
    public static final int PLUS=60;
    public static final int BXOR=67;
    public static final int DIGIT=31;
    public static final int BRACECLOSE=97;
    public static final int BYTE_VALUE=51;
    public static final int STRINGLIT=56;
    public static final int SMT=79;
    public static final int PARAMS=103;
    public static final int DEFER=10;
    public static final int SQBRACEOPEN=98;
    public static final int MODASSIGN=86;
    public static final int BANDNOT=70;
    public static final int UNICODE_ESC=36;
    public static final int DEFAULT=9;
    public static final int AMPERSAND=65;
    public static final int HEX_DIGIT=35;
    public static final int RANGE=22;
    public static final int STRUCT=25;
    public static final int BSHIFTLASSIGN=90;
    public static final int MINUS=61;
    public static final int MINUSASSIGN=83;
    public static final int BIG_U_VALUE=46;
    public static final int OCTAL_BYTE_VALUE=50;
    public static final int DIVIDEASSIGN=85;
    public static final int RBRACECLOSE=101;
    public static final int MODULUS=64;
    public static final int MAP=20;
    public static final int SMTASSIGN=93;
    public static final int ASSIGN=80;
    public static final int DECR=75;
    public static final int INTERFACE=19;
    public static final int INTERPRETED_STRING_LIT=54;
    public static final int BANDASSIGN=87;
    public static final int STRING=34;

    // delegates
    // delegators


        public GoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GoParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/bloodsplatter/Projects/GoSupport/Go.g"; }



    // Delegated rules


 

}