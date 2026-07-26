package defpackage;

import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class x85 implements mz1 {
    public final h26 a;
    public final y85 b;
    public final String c;
    public final int d;
    public final String e;
    public cp8 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public x85(String str, int i, String str2) {
        h26 h26Var = new h26(4);
        this.a = h26Var;
        h26Var.a[0] = -1;
        this.b = new y85();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.mz1
    public final void a(h26 h26Var) {
        vy2.t(this.f);
        while (h26Var.a() > 0) {
            int i = this.h;
            h26 h26Var2 = this.a;
            if (i == 0) {
                byte[] bArr = h26Var.a;
                int i2 = h26Var.b;
                int i3 = h26Var.c;
                while (true) {
                    if (i2 >= i3) {
                        h26Var.J(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        h26Var.J(i2 + 1);
                        this.k = false;
                        h26Var2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(h26Var.a(), 4 - this.i);
                h26Var.h(h26Var2.a, this.i, iMin);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    h26Var2.J(0);
                    int iJ = h26Var2.j();
                    y85 y85Var = this.b;
                    if (y85Var.a(iJ)) {
                        this.m = y85Var.b;
                        if (!this.j) {
                            this.l = (((long) y85Var.f) * 1000000) / ((long) y85Var.c);
                            rj2 rj2Var = new rj2();
                            rj2Var.a = this.g;
                            rj2Var.l = tv4.m(this.e);
                            rj2Var.m = tv4.m((String) y85Var.g);
                            rj2Var.n = 4096;
                            rj2Var.E = y85Var.d;
                            rj2Var.F = y85Var.c;
                            rj2Var.d = this.c;
                            rj2Var.f = this.d;
                            this.f.f(new b(rj2Var));
                            this.j = true;
                        }
                        h26Var2.J(0);
                        this.f.d(4, h26Var2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(h26Var.a(), this.m - this.i);
                this.f.d(iMin2, h26Var);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    vy2.s(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.mz1
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.mz1
    public final void e(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.mz1
    public final void f(x72 x72Var, ft8 ft8Var) {
        ft8Var.a();
        ft8Var.b();
        this.g = ft8Var.e;
        ft8Var.b();
        this.f = x72Var.o(ft8Var.d, 1);
    }

    @Override // defpackage.mz1
    public final void d(boolean z) {
    }
}
