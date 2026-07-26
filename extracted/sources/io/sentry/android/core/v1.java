package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.f {
    public final long d;
    public final boolean e;

    public v1(long j, io.sentry.u0 u0Var, long j2, boolean z) {
        super(j, u0Var);
        this.d = j2;
        this.e = z;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.e;
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.v vVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.v vVar) {
    }
}
