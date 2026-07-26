package androidx.concurrent.futures;

import defpackage.h2;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Throwable a;

    static {
        new a(new AbstractResolvableFuture$Failure$1("Failure occurred while trying to finish a future."));
    }

    public a(Throwable th) {
        boolean z = h2.d;
        th.getClass();
        this.a = th;
    }
}
