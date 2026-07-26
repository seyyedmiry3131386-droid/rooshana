package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class kf1 extends u42 implements Executor {
    public static final kf1 c = new kf1();
    public static final y61 d;

    static {
        yx8 yx8Var = yx8.c;
        int i = zd8.a;
        if (64 >= i) {
            i = 64;
        }
        d = yx8Var.F0(o27.k("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // defpackage.y61
    public final void C0(w61 w61Var, Runnable runnable) {
        d.C0(w61Var, runnable);
    }

    @Override // defpackage.y61
    public final y61 F0(int i) {
        return yx8.c.F0(i);
    }

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        d.U(w61Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        U(EmptyCoroutineContext.a, runnable);
    }

    @Override // defpackage.y61
    public final String toString() {
        return "Dispatchers.IO";
    }
}
