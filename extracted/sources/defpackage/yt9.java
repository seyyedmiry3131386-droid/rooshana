package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class yt9 {
    public static final ry0 a;

    static {
        ry0 ry0Var;
        Uri uri = du9.a;
        synchronized (gu9.class) {
            try {
                if (gu9.a == null) {
                    gu9.H(new ry0());
                }
                ry0Var = gu9.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        a = ry0Var;
    }
}
