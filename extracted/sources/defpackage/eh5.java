package defpackage;

import java.io.BufferedWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eh5 {
    public static final String a = a("NLog");
    public static int b = 9;
    public static BufferedWriter c;

    static {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        c = null;
    }

    public static String a(String str) {
        return !str.startsWith("Nene") ? "Nene".concat(str) : str;
    }

    public static boolean b(int i) {
        return i >= b;
    }
}
