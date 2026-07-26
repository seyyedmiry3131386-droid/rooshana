package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: loaded from: classes3.dex */
public final class fk0 implements Closeable, Flushable {
    public final mp1 a;

    public fk0(File file, long j) {
        ww3 ww3Var = tb2.a;
        String str = s26.b;
        s26 s26VarZ = rl3.z(file);
        js3.p(ww3Var, "fileSystem");
        gf8 gf8Var = gf8.l;
        js3.p(gf8Var, "taskRunner");
        this.a = new mp1(ww3Var, s26VarZ, j, gf8Var);
    }

    public final void b(w47 w47Var) {
        js3.p(w47Var, "request");
        mp1 mp1Var = this.a;
        String strH = rq4.H(w47Var.a);
        synchronized (mp1Var) {
            js3.p(strH, "key");
            mp1Var.u();
            mp1Var.b();
            mp1.U(strH);
            fp1 fp1Var = (fp1) mp1Var.i.get(strH);
            if (fp1Var == null) {
                return;
            }
            mp1Var.P(fp1Var);
            if (mp1Var.g <= mp1Var.c) {
                mp1Var.o = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final synchronized void d() {
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }
}
