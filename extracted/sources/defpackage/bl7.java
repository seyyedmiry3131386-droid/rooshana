package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bl7 implements gt8 {
    public final al7 a;
    public final h26 b = new h26(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public bl7(al7 al7Var) {
        this.a = al7Var;
    }

    @Override // defpackage.gt8
    public final void a(int i, h26 h26Var) {
        boolean z = (i & 1) != 0;
        int iX = z ? h26Var.b + h26Var.x() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            h26Var.J(iX);
            this.d = 0;
        }
        while (h26Var.a() > 0) {
            int i2 = this.d;
            h26 h26Var2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iX2 = h26Var.x();
                    h26Var.J(h26Var.b - 1);
                    if (iX2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(h26Var.a(), 3 - this.d);
                h26Var.h(h26Var2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    h26Var2.J(0);
                    h26Var2.I(3);
                    h26Var2.K(1);
                    int iX3 = h26Var2.x();
                    int iX4 = h26Var2.x();
                    this.e = (iX3 & 128) != 0;
                    int i4 = (((iX3 & 15) << 8) | iX4) + 3;
                    this.c = i4;
                    byte[] bArr = h26Var2.a;
                    if (bArr.length < i4) {
                        h26Var2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(h26Var.a(), this.c - this.d);
                h26Var.h(h26Var2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        h26Var2.I(i6);
                    } else {
                        if (j29.o(h26Var2.a, 0, i6, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        h26Var2.I(this.c - 4);
                    }
                    h26Var2.J(0);
                    this.a.a(h26Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.gt8
    public final void b(hm8 hm8Var, x72 x72Var, ft8 ft8Var) {
        this.a.b(hm8Var, x72Var, ft8Var);
        this.f = true;
    }

    @Override // defpackage.gt8
    public final void c() {
        this.f = true;
    }
}
