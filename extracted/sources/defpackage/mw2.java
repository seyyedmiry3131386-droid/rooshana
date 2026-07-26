package defpackage;

import androidx.media3.common.b;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class mw2 implements mz1 {
    public final cm7 a;
    public String b;
    public cp8 c;
    public lw2 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final k62 g = new k62(32);
    public final k62 h = new k62(33);
    public final k62 i = new k62(34);
    public final k62 j = new k62(39);
    public final k62 k = new k62(40);
    public long m = -9223372036854775807L;
    public final h26 n = new h26();

    public mw2(cm7 cm7Var) {
        this.a = cm7Var;
    }

    @Override // defpackage.mz1
    public final void a(h26 h26Var) {
        int i;
        vy2.t(this.c);
        String str = j29.a;
        while (h26Var.a() > 0) {
            int i2 = h26Var.b;
            int i3 = h26Var.c;
            byte[] bArr = h26Var.a;
            this.l += (long) h26Var.a();
            this.c.d(h26Var.a(), h26Var);
            while (i2 < i3) {
                int iO = s7.o(bArr, i2, i3, this.f);
                if (iO == i3) {
                    g(bArr, i2, i3);
                    return;
                }
                int i4 = (bArr[iO + 3] & 126) >> 1;
                if (iO <= 0 || bArr[iO - 1] != 0) {
                    i = 3;
                } else {
                    iO--;
                    i = 4;
                }
                int i5 = iO;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    g(bArr, i2, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - ((long) i8);
                b(i8, i7 < 0 ? -i7 : 0, j, this.m);
                h(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    public final void b(int i, int i2, long j, long j2) {
        yb ybVar = this.a.d;
        lw2 lw2Var = this.d;
        boolean z = this.e;
        if (lw2Var.j && lw2Var.g) {
            lw2Var.m = lw2Var.c;
            lw2Var.j = false;
        } else if (lw2Var.h || lw2Var.g) {
            if (z && lw2Var.i) {
                lw2Var.a(i + ((int) (j - lw2Var.b)));
            }
            lw2Var.k = lw2Var.b;
            lw2Var.l = lw2Var.e;
            lw2Var.m = lw2Var.c;
            lw2Var.i = true;
        }
        if (!this.e) {
            k62 k62Var = this.g;
            k62Var.b(i2);
            k62 k62Var2 = this.h;
            k62Var2.b(i2);
            k62 k62Var3 = this.i;
            k62Var3.b(i2);
            if (k62Var.c && k62Var2.c && k62Var3.c) {
                String str = this.b;
                int i3 = k62Var.d;
                byte[] bArr = new byte[k62Var2.d + i3 + k62Var3.d];
                System.arraycopy((byte[]) k62Var.e, 0, bArr, 0, i3);
                System.arraycopy((byte[]) k62Var2.e, 0, bArr, k62Var.d, k62Var2.d);
                System.arraycopy((byte[]) k62Var3.e, 0, bArr, k62Var.d + k62Var2.d, k62Var3.d);
                jh5 jh5VarR = s7.R((byte[]) k62Var2.e, 3, k62Var2.d, null);
                gh5 gh5Var = jh5VarR.b;
                String strA = gh5Var != null ? ku0.a(gh5Var.a, gh5Var.b, gh5Var.c, gh5Var.d, gh5Var.e, gh5Var.f) : null;
                rj2 rj2Var = new rj2();
                rj2Var.a = str;
                rj2Var.l = tv4.m("video/mp2t");
                rj2Var.m = tv4.m("video/hevc");
                rj2Var.j = strA;
                rj2Var.t = jh5VarR.e;
                rj2Var.u = jh5VarR.f;
                rj2Var.v = jh5VarR.g;
                rj2Var.w = jh5VarR.h;
                rj2Var.C = new cv0(jh5VarR.k, jh5VarR.l, jh5VarR.m, jh5VarR.c + 8, jh5VarR.d + 8, null);
                rj2Var.z = jh5VarR.i;
                rj2Var.o = jh5VarR.j;
                rj2Var.D = jh5VarR.a + 1;
                rj2Var.p = Collections.singletonList(bArr);
                b bVar = new b(rj2Var);
                this.c.f(bVar);
                int i4 = bVar.p;
                wn5.t(i4 != -1);
                ybVar.w(i4);
                this.e = true;
            }
        }
        k62 k62Var4 = this.j;
        boolean zB = k62Var4.b(i2);
        h26 h26Var = this.n;
        if (zB) {
            h26Var.H(s7.g0(k62Var4.d, (byte[]) k62Var4.e), (byte[]) k62Var4.e);
            h26Var.K(5);
            ybVar.a(j2, h26Var);
        }
        k62 k62Var5 = this.k;
        if (k62Var5.b(i2)) {
            h26Var.H(s7.g0(k62Var5.d, (byte[]) k62Var5.e), (byte[]) k62Var5.e);
            h26Var.K(5);
            ybVar.a(j2, h26Var);
        }
    }

    @Override // defpackage.mz1
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        s7.g(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        this.a.d.j(0);
        lw2 lw2Var = this.d;
        if (lw2Var != null) {
            lw2Var.f = false;
            lw2Var.g = false;
            lw2Var.h = false;
            lw2Var.i = false;
            lw2Var.j = false;
        }
    }

    @Override // defpackage.mz1
    public final void d(boolean z) {
        vy2.t(this.c);
        String str = j29.a;
        if (z) {
            this.a.d.j(0);
            b(0, 0, this.l, this.m);
            h(0, 48, this.l, this.m);
        }
    }

    @Override // defpackage.mz1
    public final void e(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.mz1
    public final void f(x72 x72Var, ft8 ft8Var) {
        ft8Var.a();
        ft8Var.b();
        this.b = ft8Var.e;
        ft8Var.b();
        cp8 cp8VarO = x72Var.o(ft8Var.d, 2);
        this.c = cp8VarO;
        this.d = new lw2(cp8VarO);
        this.a.b(x72Var, ft8Var);
    }

    public final void g(byte[] bArr, int i, int i2) {
        lw2 lw2Var = this.d;
        if (lw2Var.f) {
            int i3 = lw2Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                lw2Var.g = (bArr[i4] & 128) != 0;
                lw2Var.f = false;
            } else {
                lw2Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void h(int i, int i2, long j, long j2) {
        lw2 lw2Var = this.d;
        boolean z = this.e;
        lw2Var.g = false;
        lw2Var.h = false;
        lw2Var.e = j2;
        lw2Var.d = 0;
        lw2Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (lw2Var.i && !lw2Var.j) {
                if (z) {
                    lw2Var.a(i);
                }
                lw2Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                lw2Var.h = !lw2Var.j;
                lw2Var.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        lw2Var.c = z2;
        lw2Var.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.e(i2);
            this.h.e(i2);
            this.i.e(i2);
        }
        this.j.e(i2);
        this.k.e(i2);
    }
}
