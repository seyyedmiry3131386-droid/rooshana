package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bc2 {
    public static final char a;

    static {
        Character.toString('.');
        a = File.separatorChar;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(Math.max(str.lastIndexOf(47), str.lastIndexOf(92)) + 1);
    }
}
