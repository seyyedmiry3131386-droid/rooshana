package defpackage;

import androidx.media3.common.b;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v80 implements ke6 {
    public final int b;
    public x37 d;
    public int e;
    public ee6 f;
    public td8 g;
    public int h;
    public pc7 i;
    public b[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public ks4 q;
    public ci1 r;
    public final Object a = new Object();
    public final hh2 c = new hh2((char) 0, 1);
    public long m = Long.MIN_VALUE;
    public bm8 p = bm8.a;

    public v80(int i) {
        this.b = i;
    }

    public int A() {
        return 0;
    }

    public final ExoPlaybackException a(Exception exc, b bVar, boolean z, int i) {
        int iZ;
        if (bVar == null || this.o) {
            iZ = 4;
        } else {
            this.o = true;
            try {
                iZ = z(bVar) & 7;
            } catch (ExoPlaybackException unused) {
                iZ = 4;
            } finally {
                this.o = false;
            }
        }
        return new ExoPlaybackException(1, exc, i, j(), this.e, bVar, bVar == null ? 4 : iZ, this.q, z);
    }

    public void b() {
    }

    public long c(long j, long j2) {
        if (this.h == 1) {
            return (m() || l()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public nm4 f() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.m == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j, boolean z);

    public final int v(hh2 hh2Var, fc1 fc1Var, int i) {
        pc7 pc7Var = this.i;
        pc7Var.getClass();
        int iH = pc7Var.h(hh2Var, fc1Var, i);
        if (iH == -4) {
            if (fc1Var.d(4)) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = fc1Var.g + this.k;
            fc1Var.g = j;
            this.m = Math.max(this.m, j);
            return iH;
        }
        if (iH == -5) {
            b bVar = (b) hh2Var.c;
            bVar.getClass();
            long j2 = bVar.s;
            if (j2 != Long.MAX_VALUE) {
                rj2 rj2VarA = bVar.a();
                rj2VarA.r = j2 + this.k;
                hh2Var.c = new b(rj2VarA);
            }
        }
        return iH;
    }

    public abstract void w(long j, long j2);

    public final void x(b[] bVarArr, pc7 pc7Var, long j, long j2, ks4 ks4Var) {
        vy2.s(!this.n);
        this.i = pc7Var;
        this.q = ks4Var;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = bVarArr;
        this.k = j2;
        u(bVarArr, j, j2, ks4Var);
    }

    public void y(float f, float f2) {
    }

    public abstract int z(b bVar);

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    @Override // defpackage.ke6
    public void e(int i, Object obj) {
    }

    public void o(boolean z, boolean z2) {
    }

    public void u(b[] bVarArr, long j, long j2, ks4 ks4Var) {
    }
}
