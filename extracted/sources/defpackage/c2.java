package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    public static final c2 c;
    public static final c2 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (h2.d) {
            d = null;
            c = null;
        } else {
            d = new c2(null, false);
            c = new c2(null, true);
        }
    }

    public c2(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
