package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class yu extends b67 {
    public static volatile yu d;
    public static final qa e = new qa(1);
    public final lh1 c = new lh1();

    public static yu h() {
        if (d != null) {
            return d;
        }
        synchronized (yu.class) {
            try {
                if (d == null) {
                    d = new yu();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public final void i(Runnable runnable) {
        lh1 lh1Var = this.c;
        if (lh1Var.e == null) {
            synchronized (lh1Var.c) {
                try {
                    if (lh1Var.e == null) {
                        lh1Var.e = lh1.h(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        lh1Var.e.post(runnable);
    }
}
