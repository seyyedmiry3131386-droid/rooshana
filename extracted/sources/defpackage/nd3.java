package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nd3 implements by7 {
    public final kk2 a;
    public boolean b;
    public final /* synthetic */ rd3 c;

    public nd3(rd3 rd3Var) {
        this.c = rd3Var;
        this.a = new kk2(((sv6) rd3Var.c.d).a.i());
    }

    @Override // defpackage.by7
    public final void X0(gh0 gh0Var, long j) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        sv6 sv6Var = (sv6) this.c.c.d;
        if (sv6Var.c) {
            throw new IllegalStateException("closed");
        }
        sv6Var.b.Y0(j);
        sv6Var.b();
        sv6Var.n0("\r\n");
        sv6Var.X0(gh0Var, j);
        sv6Var.n0("\r\n");
    }

    @Override // defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((sv6) this.c.c.d).n0("0\r\n\r\n");
        kk2 kk2Var = this.a;
        dm8 dm8Var = kk2Var.e;
        kk2Var.e = dm8.d;
        dm8Var.a();
        dm8Var.b();
        this.c.d = 3;
    }

    @Override // defpackage.by7, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((sv6) this.c.c.d).flush();
    }

    @Override // defpackage.by7
    public final dm8 i() {
        return this.a;
    }
}
