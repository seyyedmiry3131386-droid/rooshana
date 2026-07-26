package coil3.compose;

import androidx.compose.runtime.g;
import defpackage.ey7;
import defpackage.fz1;
import defpackage.g16;
import defpackage.hv1;
import defpackage.j27;
import defpackage.n08;
import defpackage.nm5;
import defpackage.ok4;
import defpackage.q41;
import defpackage.qx1;
import defpackage.sl8;
import defpackage.tc0;
import defpackage.tl8;

/* JADX INFO: loaded from: classes.dex */
public final class CrossfadePainter extends g16 {
    public final g16 f;
    public final q41 g;
    public final long h;
    public final tl8 i;
    public final boolean j;
    public final n08 k;
    public sl8 l;
    public boolean m;
    public float n;
    public tc0 o;
    public g16 p;
    public final long q;

    public CrossfadePainter(g16 g16Var, g16 g16Var2, q41 q41Var, long j, boolean z) {
        fz1 fz1Var = fz1.s;
        this.f = g16Var2;
        this.g = q41Var;
        this.h = j;
        this.i = fz1Var;
        this.j = z;
        this.k = g.e(0);
        this.n = 1.0f;
        this.p = g16Var;
        long jH = g16Var != null ? g16Var.h() : 0L;
        long jH2 = g16Var2 != null ? g16Var2.h() : 0L;
        long jFloatToRawIntBits = 9205357640488583168L;
        boolean z2 = jH != 9205357640488583168L;
        boolean z3 = jH2 != 9205357640488583168L;
        if (z2 && z3) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jH & 4294967295L)), Float.intBitsToFloat((int) (jH2 & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH2 >> 32))))) << 32);
        }
        this.q = jFloatToRawIntBits;
    }

    @Override // defpackage.g16
    public final boolean b(float f) {
        this.n = f;
        return true;
    }

    @Override // defpackage.g16
    public final boolean d(tc0 tc0Var) {
        this.o = tc0Var;
        return true;
    }

    @Override // defpackage.g16
    public final long h() {
        return this.q;
    }

    @Override // defpackage.g16
    public final void i(hv1 hv1Var) {
        boolean z = this.m;
        g16 g16Var = this.f;
        if (z) {
            j(hv1Var, g16Var, this.n);
            return;
        }
        sl8 sl8VarC = this.l;
        if (sl8VarC == null) {
            sl8VarC = this.i.c();
            this.l = sl8VarC;
        }
        float fD = qx1.d(sl8.a(sl8VarC.a)) / qx1.d(this.h);
        float fS = ok4.s(fD, 0.0f, 1.0f);
        float f = this.n;
        float f2 = fS * f;
        if (this.j) {
            f -= f2;
        }
        this.m = fD >= 1.0f;
        j(hv1Var, this.p, f);
        j(hv1Var, g16Var, f2);
        if (this.m) {
            this.p = null;
        } else {
            n08 n08Var = this.k;
            n08Var.i(n08Var.h() + 1);
        }
    }

    public final void j(hv1 hv1Var, g16 g16Var, float f) {
        if (g16Var == null || f <= 0.0f) {
            return;
        }
        long jD = hv1Var.d();
        long jH = g16Var.h();
        long jL = (jH == 9205357640488583168L || ey7.f(jH) || jD == 9205357640488583168L || ey7.f(jD)) ? jD : j27.l(jH, this.g.d(jH, jD));
        if (jD == 9205357640488583168L || ey7.f(jD)) {
            g16Var.g(hv1Var, jL, f, this.o);
            return;
        }
        float f2 = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jD >> 32)) - Float.intBitsToFloat((int) (jL >> 32))) / f2;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jD & 4294967295L)) - Float.intBitsToFloat((int) (jL & 4294967295L))) / f2;
        ((nm5) hv1Var.X().b).p(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            g16Var.g(hv1Var, jL, f, this.o);
        } finally {
            float f3 = -fIntBitsToFloat;
            float f4 = -fIntBitsToFloat2;
            ((nm5) hv1Var.X().b).p(f3, f4, f3, f4);
        }
    }
}
