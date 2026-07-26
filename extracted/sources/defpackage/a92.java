package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a92 implements by7 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public final Object d;

    public a92(by7 by7Var, n nVar) {
        this.c = by7Var;
        this.d = nVar;
    }

    @Override // defpackage.by7
    public final void X0(gh0 gh0Var, long j) throws InterruptedException {
        switch (this.a) {
            case 0:
                if (this.b) {
                    gh0Var.skip(j);
                    return;
                }
                try {
                    ((by7) this.c).X0(gh0Var, j);
                    return;
                } catch (IOException e) {
                    this.b = true;
                    ((n) this.d).invoke(e);
                    return;
                }
            default:
                if (this.b) {
                    throw new IllegalStateException("closed");
                }
                gh9.a(gh0Var.b, 0L, j);
                ((sv6) ((rd3) this.d).c.d).X0(gh0Var, j);
                return;
        }
    }

    @Override // defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        switch (this.a) {
            case 0:
                try {
                    ((by7) this.c).close();
                } catch (IOException e) {
                    this.b = true;
                    ((n) this.d).invoke(e);
                    return;
                }
                break;
            default:
                rd3 rd3Var = (rd3) this.d;
                if (!this.b) {
                    this.b = true;
                    kk2 kk2Var = (kk2) this.c;
                    dm8 dm8Var = kk2Var.e;
                    kk2Var.e = dm8.d;
                    dm8Var.a();
                    dm8Var.b();
                    rd3Var.d = 3;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.by7, java.io.Flushable
    public final void flush() throws InterruptedException {
        switch (this.a) {
            case 0:
                try {
                    ((by7) this.c).flush();
                } catch (IOException e) {
                    this.b = true;
                    ((n) this.d).invoke(e);
                    return;
                }
                break;
            default:
                if (!this.b) {
                    ((sv6) ((rd3) this.d).c.d).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.by7
    public final dm8 i() {
        switch (this.a) {
            case 0:
                return ((by7) this.c).i();
            default:
                return (kk2) this.c;
        }
    }

    public a92(rd3 rd3Var) {
        this.d = rd3Var;
        this.c = new kk2(((sv6) rd3Var.c.d).a.i());
    }
}
