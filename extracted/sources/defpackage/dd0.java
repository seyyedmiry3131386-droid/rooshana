package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class dd0 extends r {
    public final Thread d;
    public final g42 e;

    public dd0(w61 w61Var, Thread thread, g42 g42Var) {
        super(w61Var, true);
        this.d = thread;
        this.e = g42Var;
    }

    @Override // kotlinx.coroutines.c
    public final void q(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.d;
        if (js3.i(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
