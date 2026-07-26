package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zp0 {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static volatile Charset f;
    public static volatile Charset g;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        js3.o(charsetForName, "forName(...)");
        a = charsetForName;
        js3.o(Charset.forName("UTF-16"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        js3.o(charsetForName2, "forName(...)");
        b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        js3.o(charsetForName3, "forName(...)");
        c = charsetForName3;
        Charset charsetForName4 = Charset.forName("US-ASCII");
        js3.o(charsetForName4, "forName(...)");
        d = charsetForName4;
        Charset charsetForName5 = Charset.forName("ISO-8859-1");
        js3.o(charsetForName5, "forName(...)");
        e = charsetForName5;
    }
}
