package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ht2 implements ThreadFactory {
    public final p6 a;
    public final String b;
    public final hy2 c;
    public final boolean d;
    public final AtomicInteger e;

    public ht2(p6 p6Var, String str, boolean z) {
        hy2 hy2Var = hy2.l;
        this.e = new AtomicInteger();
        this.a = p6Var;
        this.b = str;
        this.c = hy2Var;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        g6 g6Var = new g6(this, runnable, 15);
        this.a.getClass();
        nx nxVar = new nx(g6Var);
        nxVar.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return nxVar;
    }
}
