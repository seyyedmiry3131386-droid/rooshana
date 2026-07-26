package defpackage;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mh8 {
    public final ll a;
    public final long b;
    public final ri8 c;
    public final rr5 d;
    public final yi8 e;
    public long f;
    public final ll g;
    public final zh8 h;
    public final si8 i;

    public mh8(zh8 zh8Var, rr5 rr5Var, si8 si8Var, yi8 yi8Var) {
        ll llVar = zh8Var.a;
        long j = zh8Var.b;
        ri8 ri8Var = si8Var != null ? si8Var.a : null;
        this.a = llVar;
        this.b = j;
        this.c = ri8Var;
        this.d = rr5Var;
        this.e = yi8Var;
        this.f = j;
        this.g = llVar;
        this.h = zh8Var;
        this.i = si8Var;
    }

    public final List a(dp2 dp2Var) {
        if (!zi8.d(this.f)) {
            return br9.C(new xw0("", 0), new lq7(zi8.g(this.f), zi8.g(this.f)));
        }
        gz1 gz1Var = (gz1) dp2Var.invoke(this);
        if (gz1Var != null) {
            return br9.B(gz1Var);
        }
        return null;
    }

    public final Integer b() {
        ri8 ri8Var = this.c;
        if (ri8Var == null) {
            return null;
        }
        q95 q95Var = ri8Var.b;
        int iF = zi8.f(this.f);
        rr5 rr5Var = this.d;
        return Integer.valueOf(rr5Var.h(q95Var.c(q95Var.d(rr5Var.q(iF)), true)));
    }

    public final Integer c() {
        ri8 ri8Var = this.c;
        if (ri8Var == null) {
            return null;
        }
        int iG = zi8.g(this.f);
        rr5 rr5Var = this.d;
        return Integer.valueOf(rr5Var.h(ri8Var.f(ri8Var.b.d(rr5Var.q(iG)))));
    }

    public final Integer d() {
        int length;
        ri8 ri8Var = this.c;
        if (ri8Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            ll llVar = this.a;
            if (iR < llVar.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jI = ri8Var.i(length2);
                int i = zi8.c;
                int i2 = (int) (jI & 4294967295L);
                if (i2 > iR) {
                    length = this.d.h(i2);
                    break;
                }
                iR++;
            } else {
                length = llVar.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iH;
        ri8 ri8Var = this.c;
        if (ri8Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            if (iR <= 0) {
                iH = 0;
                break;
            }
            int length = this.g.b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jI = ri8Var.i(length);
            int i = zi8.c;
            int i2 = (int) (jI >> 32);
            if (i2 < iR) {
                iH = this.d.h(i2);
                break;
            }
            iR--;
        }
        return Integer.valueOf(iH);
    }

    public final boolean f() {
        ri8 ri8Var = this.c;
        return (ri8Var != null ? ri8Var.g(r()) : null) != ResolvedTextDirection.b;
    }

    public final int g(ri8 ri8Var, int i) {
        int iR = r();
        yi8 yi8Var = this.e;
        if (yi8Var.a == null) {
            yi8Var.a = Float.valueOf(ri8Var.c(iR).a);
        }
        q95 q95Var = ri8Var.b;
        int iD = q95Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= q95Var.f) {
            return this.g.b.length();
        }
        float fB = q95Var.b(iD) - 1;
        Float f = yi8Var.a;
        js3.m(f);
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= ri8Var.e(iD)) || (!f() && fFloatValue <= ri8Var.d(iD))) {
            return q95Var.c(iD, true);
        }
        return this.d.h(q95Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(defpackage.si8 r9, int r10) {
        /*
            r8 = this;
            v04 r0 = r9.b
            ri8 r1 = r9.a
            if (r0 == 0) goto L13
            v04 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            sy6 r9 = r9.I(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            sy6 r9 = defpackage.sy6.e
        L15:
            zh8 r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.zi8.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            rr5 r2 = r8.d
            int r0 = r2.q(r0)
            sy6 r0 = r1.c(r0)
            float r3 = r0.a
            float r0 = r0.b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            q95 r0 = r1.b
            int r9 = r0.g(r9)
            int r9 = r2.h(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh8.h(si8, int):int");
    }

    public final void i() {
        yi8 yi8Var = this.e;
        yi8Var.a = null;
        ll llVar = this.g;
        if (llVar.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            yi8Var.a = null;
            if (llVar.b.length() > 0) {
                String str = llVar.b;
                long j = this.f;
                int i = zi8.c;
                int i2 = ib7.i((int) (j & 4294967295L), str);
                if (i2 != -1) {
                    q(i2, i2);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        ll llVar = this.g;
        String str = llVar.b;
        String str2 = llVar.b;
        if (str.length() > 0) {
            int iD = za7.d(zi8.f(this.f), str2);
            if (iD == zi8.f(this.f) && iD != str2.length()) {
                iD = za7.d(iD + 1, str2);
            }
            q(iD, iD);
        }
    }

    public final void k() {
        this.e.a = null;
        ll llVar = this.g;
        if (llVar.b.length() > 0) {
            String str = llVar.b;
            long j = this.f;
            int i = zi8.c;
            int iJ = ib7.j((int) (j & 4294967295L), str);
            if (iJ != -1) {
                q(iJ, iJ);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        ll llVar = this.g;
        String str = llVar.b;
        String str2 = llVar.b;
        if (str.length() > 0) {
            int iE = za7.e(zi8.g(this.f), str2);
            if (iE == zi8.g(this.f) && iE != 0) {
                iE = za7.e(iE - 1, str2);
            }
            q(iE, iE);
        }
    }

    public final void m() {
        yi8 yi8Var = this.e;
        yi8Var.a = null;
        ll llVar = this.g;
        if (llVar.b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            yi8Var.a = null;
            if (llVar.b.length() > 0) {
                String str = llVar.b;
                long j = this.f;
                int i = zi8.c;
                int i2 = ib7.i((int) (j & 4294967295L), str);
                if (i2 != -1) {
                    q(i2, i2);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = zi8.c;
            this.f = uy6.b((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = uy6.b(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = zi8.c;
        return this.d.q((int) (j & 4294967295L));
    }
}
