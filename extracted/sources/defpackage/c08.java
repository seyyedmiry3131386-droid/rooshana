package defpackage;

import androidx.compose.runtime.snapshots.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c08 {
    public a a;
    public long b;
    public boolean c;
    public int d;

    public c08(long j, a aVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = aVar;
        this.b = j;
        vd7 vd7Var = g08.a;
        if (j != 0) {
            a aVarD = d();
            long j2 = aVarD.c;
            long[] jArr = aVarD.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = aVarD.b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = aVarD.a;
                    if (j4 != 0) {
                        j2 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (g08.c) {
                iA = g08.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(c08 c08Var) {
        g08.b.I(c08Var);
    }

    public final void a() {
        synchronized (g08.c) {
            b();
            p();
        }
    }

    public void b() {
        g08.d = g08.d.c(g());
    }

    public abstract void c();

    public a d() {
        return this.a;
    }

    public abstract dp2 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract dp2 i();

    public final c08 j() {
        sk6 sk6Var = g08.b;
        c08 c08Var = (c08) sk6Var.s();
        sk6Var.I(this);
        return c08Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(e58 e58Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            g08.v(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(a aVar) {
        this.a = aVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract c08 u(dp2 dp2Var);
}
