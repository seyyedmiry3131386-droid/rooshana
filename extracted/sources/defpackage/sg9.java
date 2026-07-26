package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class sg9 {
    public static final sg9 b;
    public k30 a;

    static {
        sg9 sg9Var = new sg9();
        sg9Var.a = null;
        b = sg9Var;
    }

    public static k30 a(Context context) {
        k30 k30Var;
        sg9 sg9Var = b;
        synchronized (sg9Var) {
            try {
                if (sg9Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    sg9Var.a = new k30(context);
                }
                k30Var = sg9Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k30Var;
    }
}
