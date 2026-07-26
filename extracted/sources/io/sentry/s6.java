package io.sentry;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class s6 extends io.sentry.hints.c implements io.sentry.hints.h, io.sentry.hints.k {
    public final AtomicReference d;

    public s6(long j, u0 u0Var) {
        super(j, u0Var);
        this.d = new AtomicReference();
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.v vVar) {
        io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) this.d.get();
        return vVar2 != null && vVar2.equals(vVar);
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.v vVar) {
        this.d.set(vVar);
    }
}
