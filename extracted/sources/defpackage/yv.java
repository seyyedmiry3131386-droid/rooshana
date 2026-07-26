package defpackage;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class yv {
    public final pv d;
    public m18 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public yv(wv8 wv8Var) {
        this.d = new pv(this, wv8Var);
    }

    public final void a(l74 l74Var, int i) {
        this.d.g(l74Var.j(i), 1.0f);
        this.d.g(l74Var.j(i), -1.0f);
    }

    public final void b(m18 m18Var, m18 m18Var2, m18 m18Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.g(m18Var, 1.0f);
            this.d.g(m18Var2, -1.0f);
            this.d.g(m18Var3, -1.0f);
        } else {
            this.d.g(m18Var, -1.0f);
            this.d.g(m18Var2, 1.0f);
            this.d.g(m18Var3, 1.0f);
        }
    }

    public final void c(m18 m18Var, m18 m18Var2, m18 m18Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.g(m18Var, 1.0f);
            this.d.g(m18Var2, -1.0f);
            this.d.g(m18Var3, 1.0f);
        } else {
            this.d.g(m18Var, -1.0f);
            this.d.g(m18Var2, 1.0f);
            this.d.g(m18Var3, -1.0f);
        }
    }

    public m18 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final m18 f(boolean[] zArr, m18 m18Var) {
        SolverVariable$Type solverVariable$Type;
        int iD = this.d.d();
        m18 m18Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < iD; i++) {
            float f2 = this.d.f(i);
            if (f2 < 0.0f) {
                m18 m18VarE = this.d.e(i);
                if ((zArr == null || !zArr[m18VarE.b]) && m18VarE != m18Var && (((solverVariable$Type = m18VarE.i) == SolverVariable$Type.b || solverVariable$Type == SolverVariable$Type.c) && f2 < f)) {
                    f = f2;
                    m18Var2 = m18VarE;
                }
            }
        }
        return m18Var2;
    }

    public final void g(m18 m18Var) {
        m18 m18Var2 = this.a;
        if (m18Var2 != null) {
            this.d.g(m18Var2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fH = this.d.h(m18Var, true) * (-1.0f);
        this.a = m18Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        pv pvVar = this.d;
        int i = pvVar.h;
        for (int i2 = 0; i != -1 && i2 < pvVar.a; i2++) {
            float[] fArr = pvVar.g;
            fArr[i] = fArr[i] / fH;
            i = pvVar.f[i];
        }
    }

    public final void h(l74 l74Var, m18 m18Var, boolean z) {
        if (m18Var.f) {
            float fC = this.d.c(m18Var);
            this.b = (m18Var.e * fC) + this.b;
            this.d.h(m18Var, z);
            if (z) {
                m18Var.b(this);
            }
            if (this.d.d() == 0) {
                this.e = true;
                l74Var.b = true;
            }
        }
    }

    public void i(l74 l74Var, yv yvVar, boolean z) {
        pv pvVar = this.d;
        pvVar.getClass();
        float fC = pvVar.c(yvVar.a);
        pvVar.h(yvVar.a, z);
        pv pvVar2 = yvVar.d;
        int iD = pvVar2.d();
        for (int i = 0; i < iD; i++) {
            m18 m18VarE = pvVar2.e(i);
            pvVar.a(m18VarE, pvVar2.c(m18VarE) * fC, z);
        }
        this.b = (yvVar.b * fC) + this.b;
        if (z) {
            yvVar.a.b(this);
        }
        if (this.a == null || this.d.d() != 0) {
            return;
        }
        this.e = true;
        l74Var.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            m18 r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            m18 r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.t61.i(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.bl4.C(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            pv r5 = r10.d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            pv r6 = r10.d
            m18 r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            pv r7 = r10.d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.t61.i(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.t61.i(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.t61.i(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = defpackage.t61.i(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = defpackage.t61.i(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv.toString():java.lang.String");
    }
}
