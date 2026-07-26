package defpackage;

import java.io.BufferedWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rk1 {
    public static final String a = a("DevLg");
    public static int b = 9;
    public static BufferedWriter c;

    static {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        c = null;
    }

    public static String a(String str) {
        return !str.startsWith("Myket") ? "Myket".concat(str) : str;
    }

    public static boolean b() {
        return b <= 0;
    }

    public static String c(Exception exc) {
        StringBuilder sb = new StringBuilder(64);
        if (o40.O(exc)) {
            sb.append("[Exception ");
        } else {
            sb.append("[Throwable ");
        }
        sb.append(exc.getClass().getName());
        if (exc.getMessage() != null) {
            sb.append(": ");
            sb.append(exc.getMessage());
        }
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb.append(" -- Caused by ");
            sb.append(cause.getClass().getName());
            if (cause.getMessage() != null) {
                sb.append(": ");
                sb.append(cause.getMessage());
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
