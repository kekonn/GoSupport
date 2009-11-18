// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/bloodsplatter/Projects/GoSupport/GoParser.g 2009-11-18 22:11:54
package be.jonas.gogrammar

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "UNICODE_LETTER", "LETTER", "DIGIT", "ID", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", "INT_LIT", "DECIMALS", "EXPONENT", "FLOAT_LIT", "ESCAPED_CHAR", "BIG_U_VALUE", "LITTLE_U_VALUE", "HEX_BYTE_VALUE", "OCTAL_DIGIT", "OCTAL_BYTE_VALUE", "BYTE_VALUE", "UNICODE_VALUE", "CHAR_LIT", "INTERPRETED_STRING_LIT", "RAW_STRING_LIT", "STRINGLIT", "STRING_LIT", "COMMENT", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULUS", "AMPERSAND", "BOR", "BXOR", "BSHIFTL", "BSHIFTR", "BANDNOT", "AND", "OR", "CHANOP", "INCR", "DECR", "EQUAL", "NOTEQUAL", "LGT", "SMT", "ASSIGN", "ASSIGNINIT", "PLUSASSIGN", "MINUSASSIGN", "MULTIPLYASSIGN", "DIVIDEASSIGN", "MODASSIGN", "BANDASSIGN", "BORASSIGN", "BXORASSIGN", "BSHIFTLASSIGN", "BSHIFTRASSIGN", "BANDNOTASSIGN", "SMTASSIGN", "LGTASSIGN", "BRACEOPEN", "BRACECLOSE", "SQBRACEOPEN", "SQBRACECLOSE", "RBRACEOPEN", "RBRACECLOSE", "SLICE", "SELECTOR", "PARAMS", "COMMA", "SEPARATOR", "'.'"
    };
    public static final int PACKAGE=21;
    public static final int DECIMALS=42;
    public static final int EXPONENT=43;
    public static final int INT_LIT=41;
    public static final int LGT=78;
    public static final int SQBRACECLOSE=98;
    public static final int LETTER=30;
    public static final int CONST=7;
    public static final int BSHIFTL=68;
    public static final int OCTAL_ESC=37;
    public static final int CASE=5;
    public static final int BSHIFTR=69;
    public static final int CHAN=6;
    public static final int SEPARATOR=105;
    public static final int EOF=-1;
    public static final int BORASSIGN=88;
    public static final int OCTAL_DIGIT=49;
    public static final int BREAK=4;
    public static final int DECIMAL_LIT=38;
    public static final int RAW_STRING_LIT=55;
    public static final int TYPE=27;
    public static final int NOTEQUAL=77;
    public static final int IMPORT=18;
    public static final int INCR=74;
    public static final int FLOAT_LIT=44;
    public static final int RETURN=23;
    public static final int CHANOP=73;
    public static final int VAR=28;
    public static final int LGTASSIGN=94;
    public static final int GOTO=16;
    public static final int UNICODE_LETTER=29;
    public static final int PLUSASSIGN=82;
    public static final int COMMENT=58;
    public static final int SELECT=24;
    public static final int DIVIDE=63;
    public static final int ASSIGNINIT=81;
    public static final int SWITCH=26;
    public static final int ELSE=11;
    public static final int CHAR_LIT=53;
    public static final int MULTIPLYASSIGN=84;
    public static final int BRACEOPEN=95;
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
    public static final int SLICE=101;
    public static final int ID=32;
    public static final int AND=71;
    public static final int ESCAPED_CHAR=45;
    public static final int FALLTHROUGH=12;
    public static final int IF=17;
    public static final int RBRACEOPEN=99;
    public static final int SELECTOR=102;
    public static final int ESC_SEQ=33;
    public static final int CONTINUE=8;
    public static final int MULTIPLY=62;
    public static final int COMMA=104;
    public static final int BXORASSIGN=89;
    public static final int BOR=66;
    public static final int EQUAL=76;
    public static final int T__106=106;
    public static final int UNICODE_VALUE=52;
    public static final int PLUS=60;
    public static final int BXOR=67;
    public static final int DIGIT=31;
    public static final int BRACECLOSE=96;
    public static final int BYTE_VALUE=51;
    public static final int STRINGLIT=56;
    public static final int SMT=79;
    public static final int PARAMS=103;
    public static final int DEFER=10;
    public static final int SQBRACEOPEN=97;
    public static final int MODASSIGN=86;
    public static final int BANDNOT=70;
    public static final int UNICODE_ESC=36;
    public static final int DEFAULT=9;
    public static final int AMPERSAND=65;
    public static final int HEX_DIGIT=35;
    public static final int RANGE=22;
    public static final int STRUCT=25;
    public static final int BSHIFTLASSIGN=90;
    public static final int MINUSASSIGN=83;
    public static final int MINUS=61;
    public static final int BIG_U_VALUE=46;
    public static final int OCTAL_BYTE_VALUE=50;
    public static final int DIVIDEASSIGN=85;
    public static final int RBRACECLOSE=100;
    public static final int MODULUS=64;
    public static final int MAP=20;
    public static final int ASSIGN=80;
    public static final int SMTASSIGN=93;
    public static final int DECR=75;
    public static final int INTERFACE=19;
    public static final int BANDASSIGN=87;
    public static final int INTERPRETED_STRING_LIT=54;
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
    public String getGrammarFileName() { return "/Users/bloodsplatter/Projects/GoSupport/GoParser.g"; }



    // $ANTLR start "packageName"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:15:1: packageName : ID ;
    public final void packageName() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:16:2: ( ID )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:16:4: ID
            {
            match(input,ID,FOLLOW_ID_in_packageName42); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "packageName"


    // $ANTLR start "packageClause"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:17:1: packageClause : PACKAGE packageName ;
    public final void packageClause() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:18:2: ( PACKAGE packageName )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:18:4: PACKAGE packageName
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageClause50); 
            pushFollow(FOLLOW_packageName_in_packageClause52);
            packageName();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "packageClause"


    // $ANTLR start "importPath"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:21:1: importPath : STRING_LIT ;
    public final void importPath() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:22:2: ( STRING_LIT )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:22:4: STRING_LIT
            {
            match(input,STRING_LIT,FOLLOW_STRING_LIT_in_importPath63); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "importPath"


    // $ANTLR start "importSpec"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:23:1: importSpec : ( '.' | packageName ) importPath ;
    public final void importSpec() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:24:2: ( ( '.' | packageName ) importPath )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:24:4: ( '.' | packageName ) importPath
            {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:24:4: ( '.' | packageName )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==106) ) {
                alt1=1;
            }
            else if ( (LA1_0==ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:24:5: '.'
                    {
                    match(input,106,FOLLOW_106_in_importSpec72); 

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:24:11: packageName
                    {
                    pushFollow(FOLLOW_packageName_in_importSpec76);
                    packageName();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_importPath_in_importSpec79);
            importPath();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "importSpec"


    // $ANTLR start "importSpecList"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:25:1: importSpecList : importSpec ( SEPARATOR importSpec )* SEPARATOR ;
    public final void importSpecList() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:26:2: ( importSpec ( SEPARATOR importSpec )* SEPARATOR )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:26:4: importSpec ( SEPARATOR importSpec )* SEPARATOR
            {
            pushFollow(FOLLOW_importSpec_in_importSpecList87);
            importSpec();

            state._fsp--;

            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:26:15: ( SEPARATOR importSpec )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SEPARATOR) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==ID||LA2_1==106) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:26:16: SEPARATOR importSpec
            	    {
            	    match(input,SEPARATOR,FOLLOW_SEPARATOR_in_importSpecList90); 
            	    pushFollow(FOLLOW_importSpec_in_importSpecList92);
            	    importSpec();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,SEPARATOR,FOLLOW_SEPARATOR_in_importSpecList96); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "importSpecList"


    // $ANTLR start "importDecl"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:27:1: importDecl : IMPORT ( importSpec | ( BRACEOPEN importSpecList BRACECLOSE ) ) ;
    public final void importDecl() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:28:2: ( IMPORT ( importSpec | ( BRACEOPEN importSpecList BRACECLOSE ) ) )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:28:4: IMPORT ( importSpec | ( BRACEOPEN importSpecList BRACECLOSE ) )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDecl104); 
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:28:11: ( importSpec | ( BRACEOPEN importSpecList BRACECLOSE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==106) ) {
                alt3=1;
            }
            else if ( (LA3_0==BRACEOPEN) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:28:12: importSpec
                    {
                    pushFollow(FOLLOW_importSpec_in_importDecl107);
                    importSpec();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:28:25: ( BRACEOPEN importSpecList BRACECLOSE )
                    {
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:28:25: ( BRACEOPEN importSpecList BRACECLOSE )
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:28:26: BRACEOPEN importSpecList BRACECLOSE
                    {
                    match(input,BRACEOPEN,FOLLOW_BRACEOPEN_in_importDecl112); 
                    pushFollow(FOLLOW_importSpecList_in_importDecl114);
                    importSpecList();

                    state._fsp--;

                    match(input,BRACECLOSE,FOLLOW_BRACECLOSE_in_importDecl116); 

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "importDecl"


    // $ANTLR start "tag"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:30:1: tag : STRING_LIT ;
    public final void tag() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:30:5: ( STRING_LIT )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:30:7: STRING_LIT
            {
            match(input,STRING_LIT,FOLLOW_STRING_LIT_in_tag127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "tag"


    // $ANTLR start "label"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:31:1: label : ID ;
    public final void label() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:31:7: ( ID )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:31:9: ID
            {
            match(input,ID,FOLLOW_ID_in_label134); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "label"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_packageName42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_packageClause50 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_packageName_in_packageClause52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_importPath63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_importSpec72 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_packageName_in_importSpec76 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_importPath_in_importSpec79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importSpec_in_importSpecList87 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_SEPARATOR_in_importSpecList90 = new BitSet(new long[]{0x0000000100000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_importSpec_in_importSpecList92 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_SEPARATOR_in_importSpecList96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importDecl104 = new BitSet(new long[]{0x0000000100000000L,0x0000040080000000L});
    public static final BitSet FOLLOW_importSpec_in_importDecl107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACEOPEN_in_importDecl112 = new BitSet(new long[]{0x0000000100000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_importSpecList_in_importDecl114 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_BRACECLOSE_in_importDecl116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_tag127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label134 = new BitSet(new long[]{0x0000000000000002L});

}