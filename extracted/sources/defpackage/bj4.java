package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bj4 implements zp4, yp4 {
    public final ks4 a;
    public final long b;
    public final qc1 c;
    public x70 d;
    public zp4 e;
    public yp4 f;
    public long g = -9223372036854775807L;

    public bj4(ks4 ks4Var, qc1 qc1Var, long j) {
        this.a = ks4Var;
        this.c = qc1Var;
        this.b = j;
    }

    @Override // defpackage.ko7
    public final boolean a() {
        zp4 zp4Var = this.e;
        return zp4Var != null && zp4Var.a();
    }

    public final void b(ks4 ks4Var) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        x70 x70Var = this.d;
        x70Var.getClass();
        zp4 zp4VarB = x70Var.b(ks4Var, this.c, j);
        this.e = zp4VarB;
        if (this.f != null) {
            zp4VarB.m(this, j);
        }
    }

    @Override // defpackage.yp4
    public final void d(zp4 zp4Var) {
        yp4 yp4Var = this.f;
        String str = j29.a;
        yp4Var.d(this);
    }

    @Override // defpackage.zp4
    public final long e(p62[] p62VarArr, boolean[] zArr, pc7[] pc7VarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.g = -9223372036854775807L;
        zp4 zp4Var = this.e;
        String str = j29.a;
        return zp4Var.e(p62VarArr, zArr, pc7VarArr, zArr2, j3);
    }

    @Override // defpackage.ko7
    public final long f() {
        zp4 zp4Var = this.e;
        String str = j29.a;
        return zp4Var.f();
    }

    @Override // defpackage.zp4
    public final long g(long j, ll7 ll7Var) {
        zp4 zp4Var = this.e;
        String str = j29.a;
        return zp4Var.g(j, ll7Var);
    }

    @Override // defpackage.zp4
    public final void h() {
        zp4 zp4Var = this.e;
        if (zp4Var != null) {
            zp4Var.h();
            return;
        }
        x70 x70Var = this.d;
        if (x70Var != null) {
            x70Var.j();
        }
    }

    @Override // defpackage.zp4
    public final long i(long j) {
        zp4 zp4Var = this.e;
        String str = j29.a;
        return zp4Var.i(j);
    }

    @Override // defpackage.zp4
    public final long k() {
        zp4 zp4Var = this.e;
        String str = j29.a;
        return zp4Var.k();
    }

    @Override // defpackage.jo7
    public final void l(ko7 ko7Var) {
        yp4 yp4Var = this.f;
        String str = j29.a;
        yp4Var.l(this);
    }

    @Override // defpackage.zp4
    public final void m(yp4 yp4Var, long j) {
        this.f = yp4Var;
        zp4 zp4Var = this.e;
        if (zp4Var != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            zp4Var.m(this, j2);
        }
    }

    @Override // defpackage.zp4
    public final zo8 n() {
        zp4 zp4Var = this.e;
        String str = j29.a;
        return zp4Var.n();
    }

    @Override // defpackage.ko7
    public final boolean p(bb4 bb4Var) {
        zp4 zp4Var = this.e;
        return zp4Var != null && zp4Var.p(bb4Var);
    }

    @Override // defpackage.ko7
    public final long q() {
        zp4 zp4Var = this.e;
        String str = j29.a;
        return zp4Var.q();
    }

    @Override // defpackage.zp4
    public final void s(long j, boolean z) {
        zp4 zp4Var = this.e;
        String str = j29.a;
        zp4Var.s(j, z);
    }

    @Override // defpackage.ko7
    public final void v(long j) {
        zp4 zp4Var = this.e;
        String str = j29.a;
        zp4Var.v(j);
    }
}
