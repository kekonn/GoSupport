// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/bloodsplatter/Projects/GoSupport/Go.g 2009-11-18 13:57:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class GoParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "DIGIT", "LETTER", "ID", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC"
    };
    public static final int PACKAGE=21;
    public static final int DEFER=10;
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
    public static final int BREAK=4;
    public static final int FALLTHROUGH=12;
    public static final int TYPE=27;
    public static final int IF=17;
    public static final int IMPORT=18;
    public static final int ESC_SEQ=34;
    public static final int WS=33;
    public static final int CONTINUE=8;
    public static final int FUNC=14;
    public static final int MAP=20;
    public static final int RETURN=23;
    public static final int VAR=28;
    public static final int INTERFACE=19;
    public static final int DIGIT=29;
    public static final int GO=15;
    public static final int GOTO=16;
    public static final int COMMENT=32;
    public static final int SELECT=24;
    public static final int STRING=35;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", 
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public GoParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public GoParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public GoParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return GoParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/bloodsplatter/Projects/GoSupport/Go.g"; }



    // Delegated rules


 

}