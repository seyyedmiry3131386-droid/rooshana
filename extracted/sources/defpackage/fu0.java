package defpackage;

import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class fu0 implements AutoCloseable, e71 {
    public final w61 a;

    public fu0(w61 w61Var) {
        js3.p(w61Var, "coroutineContext");
        this.a = w61Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a.c(this.a, null);
    }

    @Override // defpackage.e71
    public final w61 getCoroutineContext() {
        return this.a;
    }
}
