package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e76 implements gt8 {
    public final mz1 a;
    public final ao0 b = new ao0(new byte[10], 10);
    public int c = 0;
    public int d;
    public hm8 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public e76(mz1 mz1Var) {
        this.a = mz1Var;
    }

    @Override // defpackage.gt8
    public final void a(int i, h26 h26Var) {
        vy2.t(this.e);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        mz1 mz1Var = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    wn5.k0("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        wn5.k0("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    mz1Var.d(h26Var.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (h26Var.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                ao0 ao0Var = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (d(h26Var, ao0Var.b, Math.min(10, this.i)) && d(h26Var, null, this.i)) {
                            ao0Var.q(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                ao0Var.t(4);
                                long jI = ((long) ao0Var.i(3)) << 30;
                                ao0Var.t(1);
                                long jI2 = ((long) (ao0Var.i(15) << 15)) | jI;
                                ao0Var.t(1);
                                long jI3 = jI2 | ((long) ao0Var.i(15));
                                ao0Var.t(1);
                                if (!this.h && this.g) {
                                    ao0Var.t(4);
                                    long jI4 = ((long) ao0Var.i(3)) << 30;
                                    ao0Var.t(1);
                                    long jI5 = jI4 | ((long) (ao0Var.i(15) << 15));
                                    ao0Var.t(1);
                                    long jI6 = jI5 | ((long) ao0Var.i(15));
                                    ao0Var.t(1);
                                    this.e.b(jI6);
                                    this.h = true;
                                }
                                this.l = this.e.b(jI3);
                            }
                            i6 |= this.k ? 4 : 0;
                            mz1Var.e(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = h26Var.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            h26Var.I(h26Var.b + iA);
                        }
                        mz1Var.a(h26Var);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                mz1Var.d(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(h26Var, ao0Var.b, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                h26Var.K(h26Var.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // defpackage.gt8
    public final void b(hm8 hm8Var, x72 x72Var, ft8 ft8Var) {
        this.e = hm8Var;
        this.a.f(x72Var, ft8Var);
    }

    @Override // defpackage.gt8
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(h26 h26Var, byte[] bArr, int i) {
        int iMin = Math.min(h26Var.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            h26Var.K(iMin);
        } else {
            h26Var.h(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        ao0 ao0Var = this.b;
        ao0Var.q(0);
        int i = ao0Var.i(24);
        if (i != 1) {
            o40.E(i, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        ao0Var.t(8);
        int i2 = ao0Var.i(16);
        ao0Var.t(5);
        this.k = ao0Var.h();
        ao0Var.t(2);
        this.f = ao0Var.h();
        this.g = ao0Var.h();
        ao0Var.t(6);
        int i3 = ao0Var.i(8);
        this.i = i3;
        if (i2 == 0) {
            this.j = -1;
        } else {
            int i4 = (i2 - 3) - i3;
            this.j = i4;
            if (i4 < 0) {
                wn5.k0("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }
}
