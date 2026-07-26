package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class gx7 implements pc7 {
    public int a;
    public boolean b;
    public final /* synthetic */ ix7 c;

    public gx7(ix7 ix7Var) {
        this.c = ix7Var;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ix7 ix7Var = this.c;
        pg pgVar = ix7Var.e;
        pgVar.e(new ur4(pgVar, new op4(1, tv4.h(ix7Var.j.n), ix7Var.j, 0, null, j29.k0(0L), -9223372036854775807L), 5));
        this.b = true;
    }

    @Override // defpackage.pc7
    public final boolean b() {
        return this.c.l;
    }

    @Override // defpackage.pc7
    public final void f() throws IOException {
        ix7 ix7Var = this.c;
        if (ix7Var.k) {
            return;
        }
        wv8 wv8Var = ix7Var.i;
        IOException iOException = (IOException) wv8Var.d;
        if (iOException != null) {
            throw iOException;
        }
        qa4 qa4Var = (qa4) wv8Var.c;
        if (qa4Var != null) {
            int i = qa4Var.a;
            IOException iOException2 = qa4Var.e;
            if (iOException2 != null && qa4Var.f > i) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.pc7
    public final int g(long j) {
        a();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // defpackage.pc7
    public final int h(hh2 hh2Var, fc1 fc1Var, int i) {
        a();
        ix7 ix7Var = this.c;
        boolean z = ix7Var.l;
        if (z && ix7Var.m == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            fc1Var.b(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            hh2Var.c = ix7Var.j;
            this.a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        ix7Var.m.getClass();
        fc1Var.b(1);
        fc1Var.g = 0L;
        if ((i & 4) == 0) {
            fc1Var.i(ix7Var.n);
            fc1Var.e.put(ix7Var.m, 0, ix7Var.n);
        }
        if ((i & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }
}
