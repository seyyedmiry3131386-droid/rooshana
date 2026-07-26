package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nl8 implements zp4, yp4 {
    public final zp4 a;
    public final long b;
    public yp4 c;

    public nl8(zp4 zp4Var, long j) {
        this.a = zp4Var;
        this.b = j;
    }

    @Override // defpackage.ko7
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.yp4
    public final void d(zp4 zp4Var) {
        yp4 yp4Var = this.c;
        yp4Var.getClass();
        yp4Var.d(this);
    }

    @Override // defpackage.zp4
    public final long e(p62[] p62VarArr, boolean[] zArr, pc7[] pc7VarArr, boolean[] zArr2, long j) {
        pc7[] pc7VarArr2 = new pc7[pc7VarArr.length];
        int i = 0;
        while (true) {
            pc7 pc7Var = null;
            if (i >= pc7VarArr.length) {
                break;
            }
            ml8 ml8Var = (ml8) pc7VarArr[i];
            if (ml8Var != null) {
                pc7Var = ml8Var.a;
            }
            pc7VarArr2[i] = pc7Var;
            i++;
        }
        zp4 zp4Var = this.a;
        long j2 = this.b;
        long jE = zp4Var.e(p62VarArr, zArr, pc7VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < pc7VarArr.length; i2++) {
            pc7 pc7Var2 = pc7VarArr2[i2];
            if (pc7Var2 == null) {
                pc7VarArr[i2] = null;
            } else {
                pc7 pc7Var3 = pc7VarArr[i2];
                if (pc7Var3 == null || ((ml8) pc7Var3).a != pc7Var2) {
                    pc7VarArr[i2] = new ml8(pc7Var2, j2);
                }
            }
        }
        return jE + j2;
    }

    @Override // defpackage.ko7
    public final long f() {
        long jF = this.a.f();
        if (jF == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jF + this.b;
    }

    @Override // defpackage.zp4
    public final long g(long j, ll7 ll7Var) {
        long j2 = this.b;
        return this.a.g(j - j2, ll7Var) + j2;
    }

    @Override // defpackage.zp4
    public final void h() {
        this.a.h();
    }

    @Override // defpackage.zp4
    public final long i(long j) {
        long j2 = this.b;
        return this.a.i(j - j2) + j2;
    }

    @Override // defpackage.zp4
    public final long k() {
        long jK = this.a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.b;
    }

    @Override // defpackage.jo7
    public final void l(ko7 ko7Var) {
        yp4 yp4Var = this.c;
        yp4Var.getClass();
        yp4Var.l(this);
    }

    @Override // defpackage.zp4
    public final void m(yp4 yp4Var, long j) {
        this.c = yp4Var;
        this.a.m(this, j - this.b);
    }

    @Override // defpackage.zp4
    public final zo8 n() {
        return this.a.n();
    }

    @Override // defpackage.ko7
    public final boolean p(bb4 bb4Var) {
        ab4 ab4Var = new ab4();
        long j = bb4Var.a;
        ab4Var.b = bb4Var.b;
        ab4Var.c = bb4Var.c;
        ab4Var.a = j - this.b;
        return this.a.p(new bb4(ab4Var));
    }

    @Override // defpackage.ko7
    public final long q() {
        long jQ = this.a.q();
        if (jQ == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jQ + this.b;
    }

    @Override // defpackage.zp4
    public final void s(long j, boolean z) {
        this.a.s(j - this.b, z);
    }

    @Override // defpackage.ko7
    public final void v(long j) {
        this.a.v(j - this.b);
    }
}
