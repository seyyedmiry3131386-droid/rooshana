package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public abstract class g16 {
    public jx9 a;
    public boolean b;
    public tc0 c;
    public float d = 1.0f;
    public LayoutDirection e = LayoutDirection.a;

    public boolean b(float f) {
        return false;
    }

    public boolean d(tc0 tc0Var) {
        return false;
    }

    public final void g(hv1 hv1Var, long j, float f, tc0 tc0Var) {
        if (this.d != f) {
            if (!b(f)) {
                if (f == 1.0f) {
                    jx9 jx9Var = this.a;
                    if (jx9Var != null) {
                        jx9Var.n(f);
                    }
                    this.b = false;
                } else {
                    jx9 jx9VarC = this.a;
                    if (jx9VarC == null) {
                        jx9VarC = dt2.c();
                        this.a = jx9VarC;
                    }
                    jx9VarC.n(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!js3.i(this.c, tc0Var)) {
            if (!d(tc0Var)) {
                if (tc0Var == null) {
                    jx9 jx9Var2 = this.a;
                    if (jx9Var2 != null) {
                        jx9Var2.q(null);
                    }
                    this.b = false;
                } else {
                    jx9 jx9VarC2 = this.a;
                    if (jx9VarC2 == null) {
                        jx9VarC2 = dt2.c();
                        this.a = jx9VarC2;
                    }
                    jx9VarC2.q(tc0Var);
                    this.b = true;
                }
            }
            this.c = tc0Var;
        }
        LayoutDirection layoutDirection = hv1Var.getLayoutDirection();
        if (this.e != layoutDirection) {
            f(layoutDirection);
            this.e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (hv1Var.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((nm5) hv1Var.X().b).p(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        sy6 sy6VarC = ry7.c(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        tm0 tm0VarV = hv1Var.X().v();
                        jx9 jx9VarC3 = this.a;
                        if (jx9VarC3 == null) {
                            jx9VarC3 = dt2.c();
                            this.a = jx9VarC3;
                        }
                        try {
                            tm0VarV.c(sy6VarC, jx9VarC3);
                            i(hv1Var);
                            tm0VarV.o();
                        } catch (Throwable th) {
                            tm0VarV.o();
                            throw th;
                        }
                    } else {
                        i(hv1Var);
                    }
                }
            } catch (Throwable th2) {
                ((nm5) hv1Var.X().b).p(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((nm5) hv1Var.X().b).p(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(hv1 hv1Var);

    public void f(LayoutDirection layoutDirection) {
    }
}
