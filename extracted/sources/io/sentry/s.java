package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements d1 {
    public static final ThreadLocal a = new ThreadLocal();

    @Override // io.sentry.d1
    public final h1 a(c1 c1Var) {
        c1 c1Var2 = get();
        a.set(c1Var);
        return new r(0, c1Var2);
    }

    @Override // io.sentry.d1
    public final void close() {
        a.remove();
    }

    @Override // io.sentry.d1
    public final c1 get() {
        return (c1) a.get();
    }
}
