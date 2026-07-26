package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l50 extends oy2 {
    public int w0 = 0;
    public boolean x0 = true;
    public int y0 = 0;
    public boolean z0 = false;

    @Override // defpackage.f31
    public final boolean B() {
        return this.z0;
    }

    @Override // defpackage.f31
    public final boolean C() {
        return this.z0;
    }

    public final boolean V() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.v0;
            if (i4 >= i) {
                break;
            }
            f31 f31Var = this.u0[i4];
            if ((this.x0 || f31Var.c()) && ((((i2 = this.w0) == 0 || i2 == 1) && !f31Var.B()) || (((i3 = this.w0) == 2 || i3 == 3) && !f31Var.C()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.v0; i5++) {
            f31 f31Var2 = this.u0[i5];
            if (this.x0 || f31Var2.c()) {
                ConstraintAnchor$Type constraintAnchor$Type = ConstraintAnchor$Type.d;
                ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.b;
                ConstraintAnchor$Type constraintAnchor$Type3 = ConstraintAnchor$Type.c;
                ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.a;
                if (!z2) {
                    int i6 = this.w0;
                    if (i6 == 0) {
                        iMax = f31Var2.j(constraintAnchor$Type4).d();
                    } else if (i6 == 1) {
                        iMax = f31Var2.j(constraintAnchor$Type3).d();
                    } else if (i6 == 2) {
                        iMax = f31Var2.j(constraintAnchor$Type2).d();
                    } else if (i6 == 3) {
                        iMax = f31Var2.j(constraintAnchor$Type).d();
                    }
                    z2 = true;
                }
                int i7 = this.w0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, f31Var2.j(constraintAnchor$Type4).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, f31Var2.j(constraintAnchor$Type3).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, f31Var2.j(constraintAnchor$Type2).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, f31Var2.j(constraintAnchor$Type).d());
                }
            }
        }
        int i8 = iMax + this.y0;
        int i9 = this.w0;
        if (i9 == 0 || i9 == 1) {
            K(i8, i8);
        } else {
            L(i8, i8);
        }
        this.z0 = true;
        return true;
    }

    public final int W() {
        int i = this.w0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.f31
    public final void b(l74 l74Var, boolean z) {
        boolean z2;
        int i;
        v21[] v21VarArr = this.R;
        v21 v21Var = this.J;
        v21VarArr[0] = v21Var;
        int i2 = 2;
        v21 v21Var2 = this.K;
        v21VarArr[2] = v21Var2;
        v21 v21Var3 = this.L;
        v21VarArr[1] = v21Var3;
        v21 v21Var4 = this.M;
        v21VarArr[3] = v21Var4;
        for (v21 v21Var5 : v21VarArr) {
            v21Var5.i = l74Var.k(v21Var5);
        }
        int i3 = this.w0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        v21 v21Var6 = v21VarArr[i3];
        if (!this.z0) {
            V();
        }
        if (this.z0) {
            this.z0 = false;
            int i4 = this.w0;
            if (i4 == 0 || i4 == 1) {
                l74Var.d(v21Var.i, this.a0);
                l74Var.d(v21Var3.i, this.a0);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    l74Var.d(v21Var2.i, this.b0);
                    l74Var.d(v21Var4.i, this.b0);
                    return;
                }
                return;
            }
        }
        for (int i5 = 0; i5 < this.v0; i5++) {
            f31 f31Var = this.u0[i5];
            if (this.x0 || f31Var.c()) {
                int i6 = this.w0;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.c;
                if (((i6 == 0 || i6 == 1) && f31Var.U[0] == constraintWidget$DimensionBehaviour && f31Var.J.f != null && f31Var.L.f != null) || ((i6 == 2 || i6 == 3) && f31Var.U[1] == constraintWidget$DimensionBehaviour && f31Var.K.f != null && f31Var.M.f != null)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = v21Var.g() || v21Var3.g();
        boolean z4 = v21Var2.g() || v21Var4.g();
        int i7 = !(!z2 && (((i = this.w0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.v0) {
            f31 f31Var2 = this.u0[i8];
            if (this.x0 || f31Var2.c()) {
                m18 m18VarK = l74Var.k(f31Var2.R[this.w0]);
                v21[] v21VarArr2 = f31Var2.R;
                int i9 = this.w0;
                v21 v21Var7 = v21VarArr2[i9];
                v21Var7.i = m18VarK;
                v21 v21Var8 = v21Var7.f;
                int i10 = (v21Var8 == null || v21Var8.d != this) ? 0 : v21Var7.g;
                if (i9 == 0 || i9 == i2) {
                    m18 m18Var = v21Var6.i;
                    int i11 = this.y0 - i10;
                    yv yvVarL = l74Var.l();
                    m18 m18VarM = l74Var.m();
                    m18VarM.d = 0;
                    yvVarL.c(m18Var, m18VarK, m18VarM, i11);
                    l74Var.c(yvVarL);
                } else {
                    m18 m18Var2 = v21Var6.i;
                    int i12 = this.y0 + i10;
                    yv yvVarL2 = l74Var.l();
                    m18 m18VarM2 = l74Var.m();
                    m18VarM2.d = 0;
                    yvVarL2.b(m18Var2, m18VarK, m18VarM2, i12);
                    l74Var.c(yvVarL2);
                }
                l74Var.e(v21Var6.i, m18VarK, this.y0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.w0;
        if (i13 == 0) {
            l74Var.e(v21Var3.i, v21Var.i, 0, 8);
            l74Var.e(v21Var.i, this.V.L.i, 0, 4);
            l74Var.e(v21Var.i, this.V.J.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            l74Var.e(v21Var.i, v21Var3.i, 0, 8);
            l74Var.e(v21Var.i, this.V.J.i, 0, 4);
            l74Var.e(v21Var.i, this.V.L.i, 0, 0);
        } else if (i13 == 2) {
            l74Var.e(v21Var4.i, v21Var2.i, 0, 8);
            l74Var.e(v21Var2.i, this.V.M.i, 0, 4);
            l74Var.e(v21Var2.i, this.V.K.i, 0, 0);
        } else if (i13 == 3) {
            l74Var.e(v21Var2.i, v21Var4.i, 0, 8);
            l74Var.e(v21Var2.i, this.V.K.i, 0, 4);
            l74Var.e(v21Var2.i, this.V.M.i, 0, 0);
        }
    }

    @Override // defpackage.f31
    public final boolean c() {
        return true;
    }

    @Override // defpackage.oy2, defpackage.f31
    public final void g(f31 f31Var, HashMap map) {
        super.g(f31Var, map);
        l50 l50Var = (l50) f31Var;
        this.w0 = l50Var.w0;
        this.x0 = l50Var.x0;
        this.y0 = l50Var.y0;
    }

    @Override // defpackage.f31
    public final String toString() {
        String strS = dw1.s(new StringBuilder("[Barrier] "), this.k0, " {");
        for (int i = 0; i < this.v0; i++) {
            f31 f31Var = this.u0[i];
            if (i > 0) {
                strS = t61.i(strS, ", ");
            }
            StringBuilder sbC = bl4.C(strS);
            sbC.append(f31Var.k0);
            strS = sbC.toString();
        }
        return t61.i(strS, "}");
    }
}
