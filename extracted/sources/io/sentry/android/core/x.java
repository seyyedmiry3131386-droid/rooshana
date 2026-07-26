package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {
    public final long d;
    public final boolean e;
    public final boolean f;

    public x(long j, io.sentry.u0 u0Var, long j2, boolean z, boolean z2) {
        super(j, u0Var);
        this.d = j2;
        this.e = z;
        this.f = z2;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.e;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return Long.valueOf(this.d);
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.f ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.v vVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.v vVar) {
    }
}
