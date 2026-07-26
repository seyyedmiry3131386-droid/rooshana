package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c88 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("(\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*\\.)*\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*");
    }

    public static final String a(String str) {
        if (str == null || f88.n0(str)) {
            return null;
        }
        return str;
    }
}
