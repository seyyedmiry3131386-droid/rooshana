package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class aw2 extends f31 {
    public float u0 = -1.0f;
    public int v0 = -1;
    public int w0 = -1;
    public v21 x0 = this.K;
    public int y0 = 0;
    public boolean z0;

    public aw2() {
        this.S.clear();
        this.S.add(this.x0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.x0;
        }
    }

    @Override // defpackage.f31
    public final boolean B() {
        return this.z0;
    }

    @Override // defpackage.f31
    public final boolean C() {
        return this.z0;
    }

    @Override // defpackage.f31
    public final void R(l74 l74Var, boolean z) {
        if (this.V == null) {
            return;
        }
        v21 v21Var = this.x0;
        l74Var.getClass();
        int iN = l74.n(v21Var);
        if (this.y0 == 1) {
            this.a0 = iN;
            this.b0 = 0;
            M(this.V.l());
            P(0);
            return;
        }
        this.a0 = 0;
        this.b0 = iN;
        P(this.V.r());
        M(0);
    }

    public final void S(int i) {
        this.x0.l(i);
        this.z0 = true;
    }

    public final void T(int i) {
        if (this.y0 == i) {
            return;
        }
        this.y0 = i;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.y0 == 1) {
            this.x0 = this.J;
        } else {
            this.x0 = this.K;
        }
        arrayList.add(this.x0);
        v21[] v21VarArr = this.R;
        int length = v21VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            v21VarArr[i2] = this.x0;
        }
    }

    @Override // defpackage.f31
    public final void b(l74 l74Var, boolean z) {
        g31 g31Var = (g31) this.V;
        if (g31Var == null) {
            return;
        }
        Object objJ = g31Var.j(ConstraintAnchor$Type.a);
        Object objJ2 = g31Var.j(ConstraintAnchor$Type.c);
        f31 f31Var = this.V;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.b;
        boolean z2 = f31Var != null && f31Var.U[0] == constraintWidget$DimensionBehaviour;
        if (this.y0 == 0) {
            objJ = g31Var.j(ConstraintAnchor$Type.b);
            objJ2 = g31Var.j(ConstraintAnchor$Type.d);
            f31 f31Var2 = this.V;
            z2 = f31Var2 != null && f31Var2.U[1] == constraintWidget$DimensionBehaviour;
        }
        if (this.z0) {
            v21 v21Var = this.x0;
            if (v21Var.c) {
                m18 m18VarK = l74Var.k(v21Var);
                l74Var.d(m18VarK, this.x0.d());
                if (this.v0 != -1) {
                    if (z2) {
                        l74Var.f(l74Var.k(objJ2), m18VarK, 0, 5);
                    }
                } else if (this.w0 != -1 && z2) {
                    m18 m18VarK2 = l74Var.k(objJ2);
                    l74Var.f(m18VarK, l74Var.k(objJ), 0, 5);
                    l74Var.f(m18VarK2, m18VarK, 0, 5);
                }
                this.z0 = false;
                return;
            }
        }
        if (this.v0 != -1) {
            m18 m18VarK3 = l74Var.k(this.x0);
            l74Var.e(m18VarK3, l74Var.k(objJ), this.v0, 8);
            if (z2) {
                l74Var.f(l74Var.k(objJ2), m18VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.w0 != -1) {
            m18 m18VarK4 = l74Var.k(this.x0);
            m18 m18VarK5 = l74Var.k(objJ2);
            l74Var.e(m18VarK4, m18VarK5, -this.w0, 8);
            if (z2) {
                l74Var.f(m18VarK4, l74Var.k(objJ), 0, 5);
                l74Var.f(m18VarK5, m18VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.u0 != -1.0f) {
            m18 m18VarK6 = l74Var.k(this.x0);
            m18 m18VarK7 = l74Var.k(objJ2);
            float f = this.u0;
            yv yvVarL = l74Var.l();
            yvVarL.d.g(m18VarK6, -1.0f);
            yvVarL.d.g(m18VarK7, f);
            l74Var.c(yvVarL);
        }
    }

    @Override // defpackage.f31
    public final boolean c() {
        return true;
    }

    @Override // defpackage.f31
    public final void g(f31 f31Var, HashMap map) {
        super.g(f31Var, map);
        aw2 aw2Var = (aw2) f31Var;
        this.u0 = aw2Var.u0;
        this.v0 = aw2Var.v0;
        this.w0 = aw2Var.w0;
        T(aw2Var.y0);
    }

    @Override // defpackage.f31
    public final v21 j(ConstraintAnchor$Type constraintAnchor$Type) {
        int iOrdinal = constraintAnchor$Type.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.y0 == 0) {
                return this.x0;
            }
            return null;
        }
        if (this.y0 == 1) {
            return this.x0;
        }
        return null;
    }
}
