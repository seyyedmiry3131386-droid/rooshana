package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements y0 {
    public final Runtime a = Runtime.getRuntime();

    @Override // io.sentry.y0
    public final void a(k3 k3Var) {
        Runtime runtime = this.a;
        k3Var.b = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
    }

    @Override // io.sentry.y0
    public final void c() {
    }
}
