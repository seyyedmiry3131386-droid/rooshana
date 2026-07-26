package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fk6 extends yv {
    public m18[] f;
    public m18[] g;
    public int h;
    public hh2 i;

    @Override // defpackage.yv
    public final m18 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            m18[] m18VarArr = this.f;
            m18 m18Var = m18VarArr[i2];
            if (!zArr[m18Var.b]) {
                hh2 hh2Var = this.i;
                hh2Var.b = m18Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((m18) hh2Var.b).h[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    m18 m18Var2 = m18VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = m18Var2.h[i3];
                            float f3 = ((m18) hh2Var.b).h[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.yv
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.yv
    public final void i(l74 l74Var, yv yvVar, boolean z) {
        m18 m18Var = yvVar.a;
        if (m18Var == null) {
            return;
        }
        float[] fArr = m18Var.h;
        pv pvVar = yvVar.d;
        int iD = pvVar.d();
        for (int i = 0; i < iD; i++) {
            m18 m18VarE = pvVar.e(i);
            float f = pvVar.f(i);
            hh2 hh2Var = this.i;
            hh2Var.b = m18VarE;
            if (m18VarE.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((m18) hh2Var.b).h;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((m18) hh2Var.b).h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((fk6) hh2Var.c).k((m18) hh2Var.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((m18) hh2Var.b).h[i3] = f4;
                    } else {
                        ((m18) hh2Var.b).h[i3] = 0.0f;
                    }
                }
                j(m18VarE);
            }
            this.b = (yvVar.b * f) + this.b;
        }
        k(m18Var);
    }

    public final void j(m18 m18Var) {
        int i;
        int i2 = this.h + 1;
        m18[] m18VarArr = this.f;
        if (i2 > m18VarArr.length) {
            m18[] m18VarArr2 = (m18[]) Arrays.copyOf(m18VarArr, m18VarArr.length * 2);
            this.f = m18VarArr2;
            this.g = (m18[]) Arrays.copyOf(m18VarArr2, m18VarArr2.length * 2);
        }
        m18[] m18VarArr3 = this.f;
        int i3 = this.h;
        m18VarArr3[i3] = m18Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && m18VarArr3[i3].b > m18Var.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new ek6(0));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        m18Var.a = true;
        m18Var.a(this);
    }

    public final void k(m18 m18Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == m18Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        m18Var.a = false;
                        return;
                    } else {
                        m18[] m18VarArr = this.f;
                        int i3 = i + 1;
                        m18VarArr[i] = m18VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.yv
    public final String toString() {
        hh2 hh2Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            hh2Var.b = this.f[i];
            str = str + hh2Var + " ";
        }
        return str;
    }
}
