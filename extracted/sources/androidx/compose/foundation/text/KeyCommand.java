package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KeyCommand {
    public static final KeyCommand A;
    public static final KeyCommand B;
    public static final KeyCommand C;
    public static final KeyCommand D;
    public static final KeyCommand E;
    public static final KeyCommand F;
    public static final KeyCommand G;
    public static final KeyCommand H;
    public static final KeyCommand I;
    public static final KeyCommand J;
    public static final KeyCommand K;
    public static final KeyCommand L;
    public static final KeyCommand M;
    public static final KeyCommand N;
    public static final KeyCommand O;
    public static final KeyCommand P;
    public static final KeyCommand Q;
    public static final KeyCommand R;
    public static final KeyCommand S;
    public static final KeyCommand T;
    public static final KeyCommand U;
    public static final KeyCommand V;
    public static final KeyCommand W;
    public static final /* synthetic */ KeyCommand[] X;
    public static final KeyCommand b;
    public static final KeyCommand c;
    public static final KeyCommand d;
    public static final KeyCommand e;
    public static final KeyCommand f;
    public static final KeyCommand g;
    public static final KeyCommand h;
    public static final KeyCommand i;
    public static final KeyCommand j;
    public static final KeyCommand k;
    public static final KeyCommand l;
    public static final KeyCommand m;
    public static final KeyCommand n;
    public static final KeyCommand o;
    public static final KeyCommand p;
    public static final KeyCommand q;
    public static final KeyCommand r;
    public static final KeyCommand s;
    public static final KeyCommand t;
    public static final KeyCommand u;
    public static final KeyCommand v;
    public static final KeyCommand w;
    public static final KeyCommand x;
    public static final KeyCommand y;
    public static final KeyCommand z;
    public final boolean a;

    static {
        KeyCommand keyCommand = new KeyCommand("LEFT_CHAR", 0, false);
        b = keyCommand;
        KeyCommand keyCommand2 = new KeyCommand("RIGHT_CHAR", 1, false);
        c = keyCommand2;
        KeyCommand keyCommand3 = new KeyCommand("RIGHT_WORD", 2, false);
        d = keyCommand3;
        KeyCommand keyCommand4 = new KeyCommand("LEFT_WORD", 3, false);
        e = keyCommand4;
        KeyCommand keyCommand5 = new KeyCommand("NEXT_PARAGRAPH", 4, false);
        f = keyCommand5;
        KeyCommand keyCommand6 = new KeyCommand("PREV_PARAGRAPH", 5, false);
        g = keyCommand6;
        KeyCommand keyCommand7 = new KeyCommand("LINE_START", 6, false);
        h = keyCommand7;
        KeyCommand keyCommand8 = new KeyCommand("LINE_END", 7, false);
        i = keyCommand8;
        KeyCommand keyCommand9 = new KeyCommand("LINE_LEFT", 8, false);
        j = keyCommand9;
        KeyCommand keyCommand10 = new KeyCommand("LINE_RIGHT", 9, false);
        k = keyCommand10;
        KeyCommand keyCommand11 = new KeyCommand("UP", 10, false);
        l = keyCommand11;
        KeyCommand keyCommand12 = new KeyCommand("DOWN", 11, false);
        m = keyCommand12;
        KeyCommand keyCommand13 = new KeyCommand("CENTER", 12, false);
        n = keyCommand13;
        KeyCommand keyCommand14 = new KeyCommand("PAGE_UP", 13, false);
        o = keyCommand14;
        KeyCommand keyCommand15 = new KeyCommand("PAGE_DOWN", 14, false);
        p = keyCommand15;
        KeyCommand keyCommand16 = new KeyCommand("HOME", 15, false);
        q = keyCommand16;
        KeyCommand keyCommand17 = new KeyCommand("END", 16, false);
        r = keyCommand17;
        KeyCommand keyCommand18 = new KeyCommand("COPY", 17, false);
        s = keyCommand18;
        KeyCommand keyCommand19 = new KeyCommand("PASTE", 18, true);
        t = keyCommand19;
        KeyCommand keyCommand20 = new KeyCommand("CUT", 19, true);
        u = keyCommand20;
        KeyCommand keyCommand21 = new KeyCommand("DELETE_PREV_CHAR", 20, true);
        v = keyCommand21;
        KeyCommand keyCommand22 = new KeyCommand("DELETE_NEXT_CHAR", 21, true);
        w = keyCommand22;
        KeyCommand keyCommand23 = new KeyCommand("DELETE_PREV_WORD", 22, true);
        x = keyCommand23;
        KeyCommand keyCommand24 = new KeyCommand("DELETE_NEXT_WORD", 23, true);
        y = keyCommand24;
        KeyCommand keyCommand25 = new KeyCommand("DELETE_FROM_LINE_START", 24, true);
        z = keyCommand25;
        KeyCommand keyCommand26 = new KeyCommand("DELETE_TO_LINE_END", 25, true);
        A = keyCommand26;
        KeyCommand keyCommand27 = new KeyCommand("SELECT_ALL", 26, false);
        B = keyCommand27;
        KeyCommand keyCommand28 = new KeyCommand("SELECT_LEFT_CHAR", 27, false);
        C = keyCommand28;
        KeyCommand keyCommand29 = new KeyCommand("SELECT_RIGHT_CHAR", 28, false);
        D = keyCommand29;
        KeyCommand keyCommand30 = new KeyCommand("SELECT_UP", 29, false);
        E = keyCommand30;
        KeyCommand keyCommand31 = new KeyCommand("SELECT_DOWN", 30, false);
        F = keyCommand31;
        KeyCommand keyCommand32 = new KeyCommand("SELECT_PAGE_UP", 31, false);
        G = keyCommand32;
        KeyCommand keyCommand33 = new KeyCommand("SELECT_PAGE_DOWN", 32, false);
        H = keyCommand33;
        KeyCommand keyCommand34 = new KeyCommand("SELECT_HOME", 33, false);
        I = keyCommand34;
        KeyCommand keyCommand35 = new KeyCommand("SELECT_END", 34, false);
        J = keyCommand35;
        KeyCommand keyCommand36 = new KeyCommand("SELECT_LEFT_WORD", 35, false);
        K = keyCommand36;
        KeyCommand keyCommand37 = new KeyCommand("SELECT_RIGHT_WORD", 36, false);
        L = keyCommand37;
        KeyCommand keyCommand38 = new KeyCommand("SELECT_NEXT_PARAGRAPH", 37, false);
        M = keyCommand38;
        KeyCommand keyCommand39 = new KeyCommand("SELECT_PREV_PARAGRAPH", 38, false);
        N = keyCommand39;
        KeyCommand keyCommand40 = new KeyCommand("SELECT_LINE_START", 39, false);
        O = keyCommand40;
        KeyCommand keyCommand41 = new KeyCommand("SELECT_LINE_END", 40, false);
        P = keyCommand41;
        KeyCommand keyCommand42 = new KeyCommand("SELECT_LINE_LEFT", 41, false);
        Q = keyCommand42;
        KeyCommand keyCommand43 = new KeyCommand("SELECT_LINE_RIGHT", 42, false);
        R = keyCommand43;
        KeyCommand keyCommand44 = new KeyCommand("DESELECT", 43, false);
        S = keyCommand44;
        KeyCommand keyCommand45 = new KeyCommand("NEW_LINE", 44, true);
        T = keyCommand45;
        KeyCommand keyCommand46 = new KeyCommand("TAB", 45, true);
        U = keyCommand46;
        KeyCommand keyCommand47 = new KeyCommand("UNDO", 46, true);
        V = keyCommand47;
        KeyCommand keyCommand48 = new KeyCommand("REDO", 47, true);
        W = keyCommand48;
        KeyCommand[] keyCommandArr = {keyCommand, keyCommand2, keyCommand3, keyCommand4, keyCommand5, keyCommand6, keyCommand7, keyCommand8, keyCommand9, keyCommand10, keyCommand11, keyCommand12, keyCommand13, keyCommand14, keyCommand15, keyCommand16, keyCommand17, keyCommand18, keyCommand19, keyCommand20, keyCommand21, keyCommand22, keyCommand23, keyCommand24, keyCommand25, keyCommand26, keyCommand27, keyCommand28, keyCommand29, keyCommand30, keyCommand31, keyCommand32, keyCommand33, keyCommand34, keyCommand35, keyCommand36, keyCommand37, keyCommand38, keyCommand39, keyCommand40, keyCommand41, keyCommand42, keyCommand43, keyCommand44, keyCommand45, keyCommand46, keyCommand47, keyCommand48, new KeyCommand("CHARACTER_PALETTE", 48, true)};
        X = keyCommandArr;
        kotlin.enums.a.a(keyCommandArr);
    }

    public KeyCommand(String str, int i2, boolean z2) {
        this.a = z2;
    }

    public static KeyCommand valueOf(String str) {
        return (KeyCommand) Enum.valueOf(KeyCommand.class, str);
    }

    public static KeyCommand[] values() {
        return (KeyCommand[]) X.clone();
    }
}
