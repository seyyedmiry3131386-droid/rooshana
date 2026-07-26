package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sj2 {
    public static final sj2 d = new sj2("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new sj2("\n", "  ", true);
    }

    public sj2(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
