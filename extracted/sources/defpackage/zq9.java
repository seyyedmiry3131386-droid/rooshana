package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class zq9 {
    public static final go8 a;

    static {
        go8 go8Var;
        Uri uri = ar9.a;
        synchronized (br9.class) {
            try {
                if (br9.a == null) {
                    br9.U(new go8());
                }
                go8Var = br9.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        a = go8Var;
    }
}
