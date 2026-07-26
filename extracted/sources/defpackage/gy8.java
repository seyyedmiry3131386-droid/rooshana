package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gy8 extends j77 implements t18 {
    public final dt4 b;
    public final long c;

    public gy8(dt4 dt4Var, long j) {
        this.b = dt4Var;
        this.c = j;
    }

    @Override // defpackage.j77
    public final long d() {
        return this.c;
    }

    @Override // defpackage.j77
    public final ph0 d1() {
        return rf0.j(this);
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) {
        js3.p(gh0Var, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.j77
    public final dt4 g() {
        return this.b;
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return dm8.d;
    }

    @Override // defpackage.j77, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
