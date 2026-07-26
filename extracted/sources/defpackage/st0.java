package defpackage;

import androidx.media3.common.b;
import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: loaded from: classes.dex */
public final class st0 implements zp4, yp4 {
    public final zp4 a;
    public yp4 b;
    public rt0[] c = new rt0[0];
    public long d;
    public long e;
    public long f;
    public ClippingMediaSource$IllegalClippingException g;

    public st0(zp4 zp4Var, boolean z, long j, long j2) {
        this.a = zp4Var;
        this.d = z ? j : -9223372036854775807L;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.ko7
    public final boolean a() {
        return this.a.a();
    }

    public final boolean b() {
        return this.d != -9223372036854775807L;
    }

    @Override // defpackage.yp4
    public final void d(zp4 zp4Var) {
        if (this.g != null) {
            return;
        }
        yp4 yp4Var = this.b;
        yp4Var.getClass();
        yp4Var.d(this);
    }

    @Override // defpackage.zp4
    public final long e(p62[] p62VarArr, boolean[] zArr, pc7[] pc7VarArr, boolean[] zArr2, long j) {
        long j2;
        this.c = new rt0[pc7VarArr.length];
        pc7[] pc7VarArr2 = new pc7[pc7VarArr.length];
        for (int i = 0; i < pc7VarArr.length; i++) {
            rt0[] rt0VarArr = this.c;
            rt0 rt0Var = (rt0) pc7VarArr[i];
            rt0VarArr[i] = rt0Var;
            pc7VarArr2[i] = rt0Var != null ? rt0Var.a : null;
        }
        long jE = this.a.e(p62VarArr, zArr, pc7VarArr2, zArr2, j);
        long j3 = this.f;
        long jMax = Math.max(jE, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (b()) {
            if (jE >= j) {
                if (jE != 0) {
                    for (p62 p62Var : p62VarArr) {
                        if (p62Var != null) {
                            b bVarM = p62Var.m();
                            if (!tv4.a(bVarM.n, bVarM.k)) {
                            }
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
            break;
        } else {
            j2 = -9223372036854775807L;
        }
        this.d = j2;
        for (int i2 = 0; i2 < pc7VarArr.length; i2++) {
            pc7 pc7Var = pc7VarArr2[i2];
            if (pc7Var == null) {
                this.c[i2] = null;
            } else {
                rt0[] rt0VarArr2 = this.c;
                rt0 rt0Var2 = rt0VarArr2[i2];
                if (rt0Var2 == null || rt0Var2.a != pc7Var) {
                    rt0VarArr2[i2] = new rt0(this, pc7Var);
                }
            }
            pc7VarArr[i2] = this.c[i2];
        }
        return jMax;
    }

    @Override // defpackage.ko7
    public final long f() {
        long jF = this.a.f();
        if (jF != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jF < j) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.zp4
    public final long g(long j, ll7 ll7Var) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        long j3 = j29.j(ll7Var.a, 0L, j - j2);
        long j4 = ll7Var.b;
        long j5 = this.f;
        long j6 = j29.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != ll7Var.a || j6 != ll7Var.b) {
            ll7Var = new ll7(j3, j6);
        }
        return this.a.g(j, ll7Var);
    }

    @Override // defpackage.zp4
    public final void h() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.g;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.a.h();
    }

    @Override // defpackage.zp4
    public final long i(long j) {
        this.d = -9223372036854775807L;
        for (rt0 rt0Var : this.c) {
            if (rt0Var != null) {
                rt0Var.b = false;
            }
        }
        long jI = this.a.i(j);
        long j2 = this.e;
        long j3 = this.f;
        long jMax = Math.max(jI, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.zp4
    public final long k() {
        if (b()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j;
        }
        long jK2 = this.a.k();
        if (jK2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.e;
        long j3 = this.f;
        long jMax = Math.max(jK2, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.jo7
    public final void l(ko7 ko7Var) {
        yp4 yp4Var = this.b;
        yp4Var.getClass();
        yp4Var.l(this);
    }

    @Override // defpackage.zp4
    public final void m(yp4 yp4Var, long j) {
        this.b = yp4Var;
        this.a.m(this, j);
    }

    @Override // defpackage.zp4
    public final zo8 n() {
        return this.a.n();
    }

    @Override // defpackage.ko7
    public final boolean p(bb4 bb4Var) {
        return this.a.p(bb4Var);
    }

    @Override // defpackage.ko7
    public final long q() {
        long jQ = this.a.q();
        if (jQ != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jQ < j) {
                return jQ;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.zp4
    public final void s(long j, boolean z) {
        this.a.s(j, z);
    }

    @Override // defpackage.ko7
    public final void v(long j) {
        this.a.v(j);
    }
}
