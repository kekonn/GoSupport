// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/bloodsplatter/Projects/GoSupport/Go.g 2009-11-18 15:58:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Go extends Lexer {
    public static final int HEX_LIT=15;
    public static final int DECIMALS=17;
    public static final int EXPONENT=18;
    public static final int INT_LIT=16;
    public static final int LETTER=5;
    public static final int UNICODE_ESC=11;
    public static final int OCTAL_ESC=12;
    public static final int HEX_DIGIT=10;
    public static final int ID=7;
    public static final int ESCAPED_CHAR=20;
    public static final int EOF=-1;
    public static final int DECIMAL_LIT=13;
    public static final int WS=22;
    public static final int ESC_SEQ=8;
    public static final int FLOAT_LIT=19;
    public static final int OCTAL_LIT=14;
    public static final int DIGIT=6;
    public static final int UNICODE_LETTER=4;
    public static final int COMMENT=21;
    public static final int STRING=9;

    // delegates
    // delegators

    public Go() {;} 
    public Go(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Go(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/bloodsplatter/Projects/GoSupport/Go.g"; }

    // $ANTLR start "UNICODE_LETTER"
    public final void mUNICODE_LETTER() throws RecognitionException {
        try {
            int _type = UNICODE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:3:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_LETTER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:5:8: ( UNICODE_LETTER | '_' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:7:7: ( '0' .. '9' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:7:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:9:5: ( LETTER ( LETTER | DIGIT )* )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:9:7: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:9:14: ( LETTER | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:12:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:12:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:12:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:12:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:12:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:16:11: ( ( DIGIT | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:16:13: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:20:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt3=1;
                    }
                    break;
                case 'u':
                    {
                    alt3=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:20:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:21:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:22:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>='0' && LA4_1<='3')) ) {
                    int LA4_2 = input.LA(3);

                    if ( ((LA4_2>='0' && LA4_2<='7')) ) {
                        int LA4_5 = input.LA(4);

                        if ( ((LA4_5>='0' && LA4_5<='7')) ) {
                            alt4=1;
                        }
                        else {
                            alt4=2;}
                    }
                    else {
                        alt4=3;}
                }
                else if ( ((LA4_1>='4' && LA4_1<='7')) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>='0' && LA4_3<='7')) ) {
                        alt4=2;
                    }
                    else {
                        alt4=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:14: ( '0' .. '3' )
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:25: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:36: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:28:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:28:14: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:28:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:28:25: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:28:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:29:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:29:14: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:29:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:34:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:34:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "DECIMAL_LIT"
    public final void mDECIMAL_LIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:2: ( '1' .. '9' ( DIGIT )* )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:4: '1' .. '9' ( DIGIT )*
            {
            matchRange('1','9'); 
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:13: ( DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:14: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_LIT"

    // $ANTLR start "OCTAL_LIT"
    public final void mOCTAL_LIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:43:2: ( '0' ( '0' .. '7' )* )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:43:4: '0' ( '0' .. '7' )*
            {
            match('0'); 
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:43:8: ( '0' .. '7' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='7')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:43:9: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_LIT"

    // $ANTLR start "HEX_LIT"
    public final void mHEX_LIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:46:9: ( '0' ( 'x' | 'X' ) HEX_DIGIT )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:46:11: '0' ( 'x' | 'X' ) HEX_DIGIT
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_LIT"

    // $ANTLR start "INT_LIT"
    public final void mINT_LIT() throws RecognitionException {
        try {
            int _type = INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:48:9: ( DECIMAL_LIT | OCTAL_LIT | HEX_LIT )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='0') ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='X'||LA7_2=='x') ) {
                    alt7=3;
                }
                else {
                    alt7=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:48:11: DECIMAL_LIT
                    {
                    mDECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:48:25: OCTAL_LIT
                    {
                    mOCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:48:37: HEX_LIT
                    {
                    mHEX_LIT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_LIT"

    // $ANTLR start "DECIMALS"
    public final void mDECIMALS() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:51:9: ( DIGIT ( DIGIT )* )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:51:11: DIGIT ( DIGIT )*
            {
            mDIGIT(); 
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:51:17: ( DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:51:18: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DECIMALS"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:54:9: ( ( 'e' | 'E' ) ( '+' | '-' )? DECIMALS )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:54:11: ( 'e' | 'E' ) ( '+' | '-' )? DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/bloodsplatter/Projects/GoSupport/Go.g:54:21: ( '+' | '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mDECIMALS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "FLOAT_LIT"
    public final void mFLOAT_LIT() throws RecognitionException {
        try {
            int _type = FLOAT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:2: ( ( DECIMALS '.' ( DECIMALS )? ( EXPONENT )? ) | ( DECIMALS EXPONENT ) | ( '.' DECIMALS ( EXPONENT )? ) )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:4: ( DECIMALS '.' ( DECIMALS )? ( EXPONENT )? )
                    {
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:4: ( DECIMALS '.' ( DECIMALS )? ( EXPONENT )? )
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:5: DECIMALS '.' ( DECIMALS )? ( EXPONENT )?
                    {
                    mDECIMALS(); 
                    match('.'); 
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:18: ( DECIMALS )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:18: DECIMALS
                            {
                            mDECIMALS(); 

                            }
                            break;

                    }

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:28: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:28: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:41: ( DECIMALS EXPONENT )
                    {
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:41: ( DECIMALS EXPONENT )
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:42: DECIMALS EXPONENT
                    {
                    mDECIMALS(); 
                    mEXPONENT(); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:63: ( '.' DECIMALS ( EXPONENT )? )
                    {
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:63: ( '.' DECIMALS ( EXPONENT )? )
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:64: '.' DECIMALS ( EXPONENT )?
                    {
                    match('.'); 
                    mDECIMALS(); 
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:77: ( EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/bloodsplatter/Projects/GoSupport/Go.g:57:77: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT_LIT"

    // $ANTLR start "ESCAPED_CHAR"
    public final void mESCAPED_CHAR() throws RecognitionException {
        try {
            int _type = ESCAPED_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:60:2: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:61:2: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPED_CHAR"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:64:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='/') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='/') ) {
                    alt17=1;
                }
                else if ( (LA17_1=='*') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:64:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:64:14: (~ ( '\\n' | '\\r' ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:64:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:64:28: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/bloodsplatter/Projects/GoSupport/Go.g:64:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:65:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:65:14: ( options {greedy=false; } : . )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='*') ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1=='/') ) {
                                alt16=2;
                            }
                            else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                                alt16=1;
                            }


                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:65:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:68:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:68:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:8: ( UNICODE_LETTER | LETTER | DIGIT | ID | STRING | INT_LIT | FLOAT_LIT | ESCAPED_CHAR | COMMENT | WS )
        int alt18=10;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:10: UNICODE_LETTER
                {
                mUNICODE_LETTER(); 

                }
                break;
            case 2 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:25: LETTER
                {
                mLETTER(); 

                }
                break;
            case 3 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:32: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 4 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:38: ID
                {
                mID(); 

                }
                break;
            case 5 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:41: STRING
                {
                mSTRING(); 

                }
                break;
            case 6 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:48: INT_LIT
                {
                mINT_LIT(); 

                }
                break;
            case 7 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:56: FLOAT_LIT
                {
                mFLOAT_LIT(); 

                }
                break;
            case 8 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:66: ESCAPED_CHAR
                {
                mESCAPED_CHAR(); 

                }
                break;
            case 9 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:79: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 10 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:87: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA13_eotS =
        "\6\uffff";
    static final String DFA13_eofS =
        "\6\uffff";
    static final String DFA13_minS =
        "\2\56\1\uffff\1\56\2\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\1\uffff\1\145\2\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA13_specialS =
        "\6\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\3\13\uffff\1\5\37\uffff\1\5",
            "",
            "\1\4\1\uffff\12\3\13\uffff\1\5\37\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "56:1: FLOAT_LIT : ( ( DECIMALS '.' ( DECIMALS )? ( EXPONENT )? ) | ( DECIMALS EXPONENT ) | ( '.' DECIMALS ( EXPONENT )? ) );";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\12\1\14\1\15\1\uffff\1\15\10\uffff\1\17\1\uffff\1\17";
    static final String DFA18_eofS =
        "\21\uffff";
    static final String DFA18_minS =
        "\1\11\2\60\1\56\1\uffff\1\56\10\uffff\1\56\1\uffff\1\56";
    static final String DFA18_maxS =
        "\3\172\1\145\1\uffff\1\170\10\uffff\1\145\1\uffff\1\145";
    static final String DFA18_acceptS =
        "\4\uffff\1\5\1\uffff\1\7\1\10\1\11\1\12\1\1\1\4\1\2\1\3\1\uffff"+
        "\1\6\1\uffff";
    static final String DFA18_specialS =
        "\21\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\11\2\uffff\1\11\22\uffff\1\11\1\uffff\1\4\13\uffff\1\6\1"+
            "\10\1\5\11\3\7\uffff\32\1\1\uffff\1\7\2\uffff\1\2\1\uffff\32"+
            "\1",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\6\1\uffff\12\16\13\uffff\1\6\37\uffff\1\6",
            "",
            "\1\6\1\uffff\10\20\2\6\13\uffff\1\6\22\uffff\1\17\14\uffff"+
            "\1\6\22\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\6\1\uffff\12\16\13\uffff\1\6\37\uffff\1\6",
            "",
            "\1\6\1\uffff\10\20\2\6\13\uffff\1\6\37\uffff\1\6"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( UNICODE_LETTER | LETTER | DIGIT | ID | STRING | INT_LIT | FLOAT_LIT | ESCAPED_CHAR | COMMENT | WS );";
        }
    }
 

}