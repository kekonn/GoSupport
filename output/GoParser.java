// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/bloodsplatter/Projects/GoSupport/GoParser.g 2009-11-23 09:32:36
package be.jonas.gogrammar

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "UNICODE_LETTER", "LETTER", "DIGIT", "ID", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", "INT_LIT", "DECIMALS", "EXPONENT", "FLOAT_LIT", "ESCAPED_CHAR", "BIG_U_VALUE", "LITTLE_U_VALUE", "HEX_BYTE_VALUE", "OCTAL_DIGIT", "OCTAL_BYTE_VALUE", "BYTE_VALUE", "UNICODE_VALUE", "CHAR_LIT", "INTERPRETED_STRING_LIT", "RAW_STRING_LIT", "STRINGLIT", "STRING_LIT", "COMMENT", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULUS", "AMPERSAND", "BOR", "BXOR", "BSHIFTL", "BSHIFTR", "BANDNOT", "AND", "OR", "CHANOP", "INCR", "DECR", "EQUAL", "NOTEQUAL", "LGT", "SMT", "ASSIGN", "ASSIGNINIT", "PLUSASSIGN", "MINUSASSIGN", "MULTIPLYASSIGN", "DIVIDEASSIGN", "MODASSIGN", "BANDASSIGN", "BORASSIGN", "BXORASSIGN", "BSHIFTLASSIGN", "BSHIFTRASSIGN", "BANDNOTASSIGN", "SMTASSIGN", "LGTASSIGN", "BRACEOPEN", "BRACECLOSE", "SQBRACEOPEN", "SQBRACECLOSE", "RBRACEOPEN", "RBRACECLOSE", "SLICE", "SELECTOR", "PARAMS", "COMMA", "SEPARATOR"
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
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:10:1: packageName : ID ;
    public final void packageName() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:11:2: ( ID )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:11:4: ID
            {
            match(input,ID,FOLLOW_ID_in_packageName33); 

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
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:12:1: packageClause : PACKAGE packageName ;
    public final void packageClause() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:13:2: ( PACKAGE packageName )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:13:4: PACKAGE packageName
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageClause41); 
            pushFollow(FOLLOW_packageName_in_packageClause43);
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
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:16:1: importPath : STRING_LIT ;
    public final void importPath() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:17:2: ( STRING_LIT )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:17:4: STRING_LIT
            {
            match(input,STRING_LIT,FOLLOW_STRING_LIT_in_importPath54); 

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
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:18:1: importSpec : ( SELECTOR | packageName ) importPath ;
    public final void importSpec() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:19:2: ( ( SELECTOR | packageName ) importPath )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:19:4: ( SELECTOR | packageName ) importPath
            {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:19:4: ( SELECTOR | packageName )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SELECTOR) ) {
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
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:19:5: SELECTOR
                    {
                    match(input,SELECTOR,FOLLOW_SELECTOR_in_importSpec63); 

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:19:16: packageName
                    {
                    pushFollow(FOLLOW_packageName_in_importSpec67);
                    packageName();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_importPath_in_importSpec70);
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
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:20:1: importSpecList : importSpec ( SEPARATOR importSpec )* SEPARATOR ;
    public final void importSpecList() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:21:2: ( importSpec ( SEPARATOR importSpec )* SEPARATOR )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:21:4: importSpec ( SEPARATOR importSpec )* SEPARATOR
            {
            pushFollow(FOLLOW_importSpec_in_importSpecList78);
            importSpec();

            state._fsp--;

            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:21:15: ( SEPARATOR importSpec )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SEPARATOR) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==ID||LA2_1==SELECTOR) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:21:16: SEPARATOR importSpec
            	    {
            	    match(input,SEPARATOR,FOLLOW_SEPARATOR_in_importSpecList81); 
            	    pushFollow(FOLLOW_importSpec_in_importSpecList83);
            	    importSpec();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,SEPARATOR,FOLLOW_SEPARATOR_in_importSpecList87); 

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
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:22:1: importDecl : IMPORT ( importSpec | ( BRACEOPEN importSpecList BRACECLOSE ) ) ;
    public final void importDecl() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:23:2: ( IMPORT ( importSpec | ( BRACEOPEN importSpecList BRACECLOSE ) ) )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:23:4: IMPORT ( importSpec | ( BRACEOPEN importSpecList BRACECLOSE ) )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDecl95); 
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:23:11: ( importSpec | ( BRACEOPEN importSpecList BRACECLOSE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==SELECTOR) ) {
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
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:23:12: importSpec
                    {
                    pushFollow(FOLLOW_importSpec_in_importDecl98);
                    importSpec();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:23:25: ( BRACEOPEN importSpecList BRACECLOSE )
                    {
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:23:25: ( BRACEOPEN importSpecList BRACECLOSE )
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:23:26: BRACEOPEN importSpecList BRACECLOSE
                    {
                    match(input,BRACEOPEN,FOLLOW_BRACEOPEN_in_importDecl103); 
                    pushFollow(FOLLOW_importSpecList_in_importDecl105);
                    importSpecList();

                    state._fsp--;

                    match(input,BRACECLOSE,FOLLOW_BRACECLOSE_in_importDecl107); 

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
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:25:1: tag : STRING_LIT ;
    public final void tag() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:25:5: ( STRING_LIT )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:25:7: STRING_LIT
            {
            match(input,STRING_LIT,FOLLOW_STRING_LIT_in_tag118); 

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
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:26:1: label : ID ;
    public final void label() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:26:7: ( ID )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:26:9: ID
            {
            match(input,ID,FOLLOW_ID_in_label125); 

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


    // $ANTLR start "emptyStatement"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:28:1: emptyStatement : ;
    public final void emptyStatement() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:29:2: ()
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:29:4: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "emptyStatement"


    // $ANTLR start "qualifiedIdent"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:30:1: qualifiedIdent : ( packageName SELECTOR )? ID ;
    public final void qualifiedIdent() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:31:2: ( ( packageName SELECTOR )? ID )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:31:4: ( packageName SELECTOR )? ID
            {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:31:4: ( packageName SELECTOR )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==SELECTOR) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:31:5: packageName SELECTOR
                    {
                    pushFollow(FOLLOW_packageName_in_qualifiedIdent142);
                    packageName();

                    state._fsp--;

                    match(input,SELECTOR,FOLLOW_SELECTOR_in_qualifiedIdent144); 

                    }
                    break;

            }

            match(input,ID,FOLLOW_ID_in_qualifiedIdent148); 

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
    // $ANTLR end "qualifiedIdent"


    // $ANTLR start "typeName"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:33:1: typeName : qualifiedIdent ;
    public final void typeName() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:33:9: ( qualifiedIdent )
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:33:11: qualifiedIdent
            {
            pushFollow(FOLLOW_qualifiedIdent_in_typeName157);
            qualifiedIdent();

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
    // $ANTLR end "typeName"


    // $ANTLR start "type"
    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:34:1: type : ( typeName | ( BRACEOPEN type BRACECLOSE ) );
    public final void type() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:34:6: ( typeName | ( BRACEOPEN type BRACECLOSE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==BRACEOPEN) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:34:8: typeName
                    {
                    pushFollow(FOLLOW_typeName_in_type164);
                    typeName();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:34:19: ( BRACEOPEN type BRACECLOSE )
                    {
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:34:19: ( BRACEOPEN type BRACECLOSE )
                    // /Users/bloodsplatter/Projects/GoSupport/GoParser.g:34:20: BRACEOPEN type BRACECLOSE
                    {
                    match(input,BRACEOPEN,FOLLOW_BRACEOPEN_in_type169); 
                    pushFollow(FOLLOW_type_in_type171);
                    type();

                    state._fsp--;

                    match(input,BRACECLOSE,FOLLOW_BRACECLOSE_in_type173); 

                    }


                    }
                    break;

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
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_packageName33 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_packageClause41 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_packageName_in_packageClause43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_importPath54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTOR_in_importSpec63 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_packageName_in_importSpec67 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_importPath_in_importSpec70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importSpec_in_importSpecList78 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_SEPARATOR_in_importSpecList81 = new BitSet(new long[]{0x0000000100000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_importSpec_in_importSpecList83 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_SEPARATOR_in_importSpecList87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importDecl95 = new BitSet(new long[]{0x0000000100000000L,0x0000004080000000L});
    public static final BitSet FOLLOW_importSpec_in_importDecl98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACEOPEN_in_importDecl103 = new BitSet(new long[]{0x0000000100000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_importSpecList_in_importDecl105 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_BRACECLOSE_in_importDecl107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_tag118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_packageName_in_qualifiedIdent142 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_SELECTOR_in_qualifiedIdent144 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_qualifiedIdent148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedIdent_in_typeName157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_type164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACEOPEN_in_type169 = new BitSet(new long[]{0x0000000100000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_type_in_type171 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_BRACECLOSE_in_type173 = new BitSet(new long[]{0x0000000000000002L});

}