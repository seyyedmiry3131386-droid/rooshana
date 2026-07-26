package defpackage;

import com.google.common.util.concurrent.b;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final c0 c;
    public static final c0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (b.d) {
            d = null;
            c = null;
        } else {
            d = new c0(null, false);
            c = new c0(null, true);
        }
    }

    public c0(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
