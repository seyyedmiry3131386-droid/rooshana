package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qd3 extends md3 {
    public boolean e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        if (!this.e) {
            b(rd3.f);
        }
        this.c = true;
    }

    @Override // defpackage.md3, defpackage.t18
    public final long f0(gh0 gh0Var, long j) {
        js3.p(gh0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.e) {
            return -1L;
        }
        long jF0 = super.f0(gh0Var, j);
        if (jF0 != -1) {
            return jF0;
        }
        this.e = true;
        b(by2.b);
        return -1L;
    }
}
