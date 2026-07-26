package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t79 implements AutoCloseable {
    public final String a;
    public final mz3 b;

    public t79(String str, mz3 mz3Var) {
        this.a = str;
        this.b = mz3Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        vp7 vp7Var = this.b.c;
        vp7Var.getClass();
        lf7 lf7Var = (lf7) ((ConcurrentHashMap) vp7Var.d).get(this.a);
        if (lf7Var != null) {
            vp7Var.x(lf7Var);
        }
    }
}
