package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final d0 d = new d0();
    public final Runnable a;
    public final Executor b;
    public d0 c;

    public d0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }

    public d0() {
        this.a = null;
        this.b = null;
    }
}
