package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class z91 implements Closeable {
    public pn6 a;
    public i71 b;
    public pn6 c;
    public j42 d;
    public pn6 e;
    public pn6 f;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((qb7) ((i42) this.e.get())).close();
    }
}
