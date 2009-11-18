// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/bloodsplatter/Projects/GoSupport/Go.g 2009-11-18 13:57:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GoLexer extends Lexer {
    public static final int DEFER=10;
    public static final int PACKAGE=21;
    public static final int LETTER=30;
    public static final int CONST=7;
    public static final int SWITCH=26;
    public static final int UNICODE_ESC=37;
    public static final int DEFAULT=9;
    public static final int ELSE=11;
    public static final int CASE=5;
    public static final int HEX_DIGIT=36;
    public static final int RANGE=22;
    public static final int FOR=13;
    public static final int STRUCT=25;
    public static final int CHAN=6;
    public static final int ID=31;
    public static final int EOF=-1;
    public static final int FALLTHROUGH=12;
    public static final int BREAK=4;
    public static final int IF=17;
    public static final int TYPE=27;
    public static final int IMPORT=18;
    public static final int WS=33;
    public static final int ESC_SEQ=34;
    public static final int CONTINUE=8;
    public static final int FUNC=14;
    public static final int MAP=20;
    public static final int RETURN=23;
    public static final int VAR=28;
    public static final int INTERFACE=19;
    public static final int DIGIT=29;
    public static final int GOTO=16;
    public static final int GO=15;
    public static final int COMMENT=32;
    public static final int SELECT=24;
    public static final int STRING=35;

    // delegates
    // delegators

    public GoLexer() {;} 
    public GoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/bloodsplatter/Projects/GoSupport/Go.g"; }

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:3:7: ( 'break' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:3:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:4:6: ( 'case' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:4:8: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CHAN"
    public final void mCHAN() throws RecognitionException {
        try {
            int _type = CHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:5:6: ( 'chan' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:5:8: 'chan'
            {
            match("chan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAN"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:6:7: ( 'const' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:6:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:7:10: ( 'continue' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:7:12: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:8:9: ( 'default' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:8:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DEFER"
    public final void mDEFER() throws RecognitionException {
        try {
            int _type = DEFER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:9:7: ( 'defer' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:9:9: 'defer'
            {
            match("defer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFER"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:10:6: ( 'else' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:10:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FALLTHROUGH"
    public final void mFALLTHROUGH() throws RecognitionException {
        try {
            int _type = FALLTHROUGH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:11:13: ( 'fallthrough' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:11:15: 'fallthrough'
            {
            match("fallthrough"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALLTHROUGH"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:12:5: ( 'for' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:12:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:13:6: ( 'func' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:13:8: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "GO"
    public final void mGO() throws RecognitionException {
        try {
            int _type = GO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:14:4: ( 'go' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:14:6: 'go'
            {
            match("go"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GO"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:15:6: ( 'goto' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:15:8: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:16:4: ( 'if' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:16:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:17:8: ( 'import' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:17:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:18:11: ( 'interface' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:18:13: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "MAP"
    public final void mMAP() throws RecognitionException {
        try {
            int _type = MAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:19:5: ( 'map' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:19:7: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAP"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:20:9: ( 'package' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:20:11: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "RANGE"
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:21:7: ( 'range' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:21:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:22:8: ( 'return' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:22:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:23:8: ( 'select' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:23:10: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:24:8: ( 'struct' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:24:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:25:8: ( 'switch' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:25:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:26:6: ( 'type' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:26:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:5: ( 'var' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:27:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:31:7: ( '0' .. '9' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:31:9: '0' .. '9'
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:33:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:35:4: ( LETTER ( LETTER | DIGIT )* )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:35:6: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:35:13: ( LETTER | DIGIT )*
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='/') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='/') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='*') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:14: (~ ( '\\n' | '\\r' ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop2;
                        }
                    } while (true);

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:28: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/bloodsplatter/Projects/GoSupport/Go.g:39:28: '\\r'
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
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:40:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:40:14: ( options {greedy=false; } : . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='*') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='/') ) {
                                alt4=2;
                            }
                            else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:40:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
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
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:43:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:43:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:51:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:51:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:51:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:51:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/bloodsplatter/Projects/GoSupport/Go.g:51:24: ~ ( '\\\\' | '\"' )
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
            	    break loop6;
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
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:56:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:56:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:60:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='\"'||LA7_1=='\''||LA7_1=='\\'||LA7_1=='b'||LA7_1=='f'||LA7_1=='n'||LA7_1=='r'||LA7_1=='t') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='u') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:60:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /Users/bloodsplatter/Projects/GoSupport/Go.g:61:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:66:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/bloodsplatter/Projects/GoSupport/Go.g:66:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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

    public void mTokens() throws RecognitionException {
        // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:8: ( BREAK | CASE | CHAN | CONST | CONTINUE | DEFAULT | DEFER | ELSE | FALLTHROUGH | FOR | FUNC | GO | GOTO | IF | IMPORT | INTERFACE | MAP | PACKAGE | RANGE | RETURN | SELECT | STRUCT | SWITCH | TYPE | VAR | DIGIT | LETTER | ID | COMMENT | WS | STRING )
        int alt8=31;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:10: BREAK
                {
                mBREAK(); 

                }
                break;
            case 2 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:16: CASE
                {
                mCASE(); 

                }
                break;
            case 3 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:21: CHAN
                {
                mCHAN(); 

                }
                break;
            case 4 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:26: CONST
                {
                mCONST(); 

                }
                break;
            case 5 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:32: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 6 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:41: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 7 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:49: DEFER
                {
                mDEFER(); 

                }
                break;
            case 8 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:55: ELSE
                {
                mELSE(); 

                }
                break;
            case 9 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:60: FALLTHROUGH
                {
                mFALLTHROUGH(); 

                }
                break;
            case 10 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:72: FOR
                {
                mFOR(); 

                }
                break;
            case 11 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:76: FUNC
                {
                mFUNC(); 

                }
                break;
            case 12 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:81: GO
                {
                mGO(); 

                }
                break;
            case 13 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:84: GOTO
                {
                mGOTO(); 

                }
                break;
            case 14 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:89: IF
                {
                mIF(); 

                }
                break;
            case 15 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:92: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 16 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:99: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 17 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:109: MAP
                {
                mMAP(); 

                }
                break;
            case 18 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:113: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 19 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:121: RANGE
                {
                mRANGE(); 

                }
                break;
            case 20 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:127: RETURN
                {
                mRETURN(); 

                }
                break;
            case 21 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:134: SELECT
                {
                mSELECT(); 

                }
                break;
            case 22 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:141: STRUCT
                {
                mSTRUCT(); 

                }
                break;
            case 23 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:148: SWITCH
                {
                mSWITCH(); 

                }
                break;
            case 24 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:155: TYPE
                {
                mTYPE(); 

                }
                break;
            case 25 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:160: VAR
                {
                mVAR(); 

                }
                break;
            case 26 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:164: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 27 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:170: LETTER
                {
                mLETTER(); 

                }
                break;
            case 28 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:177: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:180: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 30 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:188: WS
                {
                mWS(); 

                }
                break;
            case 31 :
                // /Users/bloodsplatter/Projects/GoSupport/Go.g:1:191: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\15\24\1\uffff\1\24\3\uffff\1\25\2\uffff\10\25\1\65\1\66"+
        "\22\25\1\113\2\25\2\uffff\2\25\1\120\7\25\1\130\1\25\1\132\1\133"+
        "\4\25\1\140\1\25\1\uffff\1\142\1\143\2\25\1\uffff\6\25\1\154\1\uffff"+
        "\1\155\2\uffff\1\156\2\25\1\161\1\uffff\1\25\2\uffff\3\25\1\166"+
        "\4\25\3\uffff\2\25\1\uffff\1\25\1\176\2\25\1\uffff\1\u0081\1\u0082"+
        "\1\u0083\1\u0084\1\25\1\u0086\1\25\1\uffff\1\25\1\u0089\4\uffff"+
        "\1\u008a\1\uffff\2\25\2\uffff\1\25\1\u008e\1\25\1\uffff\1\u0090"+
        "\1\uffff";
    static final String DFA8_eofS =
        "\u0091\uffff";
    static final String DFA8_minS =
        "\1\11\15\60\1\uffff\1\60\3\uffff\1\145\2\uffff\1\163\1\141\1\156"+
        "\1\146\1\163\1\154\1\162\1\156\2\60\1\160\1\164\1\160\1\143\1\156"+
        "\1\164\1\154\1\162\1\151\1\160\1\162\1\141\1\145\1\156\1\163\1\141"+
        "\1\145\1\154\1\60\1\143\1\157\2\uffff\1\157\1\145\1\60\1\153\1\147"+
        "\1\165\1\145\1\165\1\164\1\145\1\60\1\153\2\60\1\164\1\151\1\165"+
        "\1\162\1\60\1\164\1\uffff\2\60\2\162\1\uffff\1\141\1\145\1\162\3"+
        "\143\1\60\1\uffff\1\60\2\uffff\1\60\1\156\1\154\1\60\1\uffff\1\150"+
        "\2\uffff\1\164\1\146\1\147\1\60\1\156\2\164\1\150\3\uffff\1\165"+
        "\1\164\1\uffff\1\162\1\60\1\141\1\145\1\uffff\4\60\1\145\1\60\1"+
        "\157\1\uffff\1\143\1\60\4\uffff\1\60\1\uffff\1\165\1\145\2\uffff"+
        "\1\147\1\60\1\150\1\uffff\1\60\1\uffff";
    static final String DFA8_maxS =
        "\16\172\1\uffff\1\172\3\uffff\1\145\2\uffff\1\163\1\141\1\156\1"+
        "\146\1\163\1\154\1\162\1\156\2\172\1\160\1\164\1\160\1\143\1\156"+
        "\1\164\1\154\1\162\1\151\1\160\1\162\1\141\1\145\1\156\1\164\2\145"+
        "\1\154\1\172\1\143\1\157\2\uffff\1\157\1\145\1\172\1\153\1\147\1"+
        "\165\1\145\1\165\1\164\1\145\1\172\1\153\2\172\1\164\1\151\1\165"+
        "\1\162\1\172\1\164\1\uffff\2\172\2\162\1\uffff\1\141\1\145\1\162"+
        "\3\143\1\172\1\uffff\1\172\2\uffff\1\172\1\156\1\154\1\172\1\uffff"+
        "\1\150\2\uffff\1\164\1\146\1\147\1\172\1\156\2\164\1\150\3\uffff"+
        "\1\165\1\164\1\uffff\1\162\1\172\1\141\1\145\1\uffff\4\172\1\145"+
        "\1\172\1\157\1\uffff\1\143\1\172\4\uffff\1\172\1\uffff\1\165\1\145"+
        "\2\uffff\1\147\1\172\1\150\1\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\16\uffff\1\32\1\uffff\1\35\1\36\1\37\1\uffff\1\33\1\34\37\uffff"+
        "\1\14\1\16\24\uffff\1\12\4\uffff\1\21\7\uffff\1\31\1\uffff\1\2\1"+
        "\3\4\uffff\1\10\1\uffff\1\13\1\15\10\uffff\1\30\1\1\1\4\2\uffff"+
        "\1\7\4\uffff\1\23\7\uffff\1\17\2\uffff\1\24\1\25\1\26\1\27\1\uffff"+
        "\1\6\2\uffff\1\22\1\5\3\uffff\1\20\1\uffff\1\11";
    static final String DFA8_specialS =
        "\u0091\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\21\2\uffff\1\21\22\uffff\1\21\1\uffff\1\22\14\uffff\1\20"+
            "\12\16\7\uffff\32\17\4\uffff\1\17\1\uffff\1\17\1\1\1\2\1\3\1"+
            "\4\1\5\1\6\1\17\1\7\3\17\1\10\2\17\1\11\1\17\1\12\1\13\1\14"+
            "\1\17\1\15\4\17",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\21\25\1\23\10\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\26\6\25\1\27\6"+
            "\25\1\30\13\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\31\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\13\25\1\32\16\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\33\15\25\1\34\5"+
            "\25\1\35\5\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\16\25\1\36\13\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\5\25\1\37\6\25\1"+
            "\40\1\41\14\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\42\31\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\43\31\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\44\3\25\1\45\25"+
            "\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\46\16\25\1"+
            "\47\2\25\1\50\3\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\30\25\1\51\1\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\52\31\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "\1\53",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\64\6\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105\1\106",
            "\1\107\3\uffff\1\110",
            "\1\111",
            "\1\112",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\116",
            "\1\117",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\131",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\141",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\157",
            "\1\160",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\162",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\177",
            "\1\u0080",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0085",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0087",
            "",
            "\1\u0088",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u008f",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BREAK | CASE | CHAN | CONST | CONTINUE | DEFAULT | DEFER | ELSE | FALLTHROUGH | FOR | FUNC | GO | GOTO | IF | IMPORT | INTERFACE | MAP | PACKAGE | RANGE | RETURN | SELECT | STRUCT | SWITCH | TYPE | VAR | DIGIT | LETTER | ID | COMMENT | WS | STRING );";
        }
    }
 

}