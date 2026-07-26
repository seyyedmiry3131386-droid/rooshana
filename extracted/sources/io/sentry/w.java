package io.sentry;

import java.io.File;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public final c1 a;
    public final u0 b;
    public final long c;
    public final Queue d;

    public w(c1 c1Var, u0 u0Var, long j, int i) {
        this.a = c1Var;
        this.b = u0Var;
        this.c = j;
        this.d = new SynchronizedQueue(new CircularFifoQueue(i));
    }

    public abstract boolean a(String str);

    public abstract void b(File file, h0 h0Var);
}
