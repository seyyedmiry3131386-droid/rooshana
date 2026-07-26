package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ye2 extends sa9 {
    public f31[] e1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public int T0 = 0;
    public int U0 = 0;
    public int V0 = 2;
    public int W0 = 2;
    public int X0 = 0;
    public int Y0 = -1;
    public int Z0 = 0;
    public final ArrayList a1 = new ArrayList();
    public f31[] b1 = null;
    public f31[] c1 = null;
    public int[] d1 = null;
    public int f1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0117  */
    @Override // defpackage.sa9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(int r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye2.V(int, int, int, int):void");
    }

    public final int X(f31 f31Var, int i) {
        f31 f31Var2;
        if (f31Var == null) {
            return 0;
        }
        if (f31Var.U[1] == ConstraintWidget$DimensionBehaviour.c) {
            int i2 = f31Var.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (f31Var.z * i);
                if (i3 != f31Var.l()) {
                    f31Var.g = true;
                    W(f31Var, f31Var.U[0], f31Var.r(), ConstraintWidget$DimensionBehaviour.a, i3);
                }
                return i3;
            }
            f31Var2 = f31Var;
            if (i2 == 1) {
                return f31Var2.l();
            }
            if (i2 == 3) {
                return (int) ((f31Var2.r() * f31Var2.Y) + 0.5f);
            }
        } else {
            f31Var2 = f31Var;
        }
        return f31Var2.l();
    }

    public final int Y(f31 f31Var, int i) {
        f31 f31Var2;
        if (f31Var == null) {
            return 0;
        }
        if (f31Var.U[0] == ConstraintWidget$DimensionBehaviour.c) {
            int i2 = f31Var.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (f31Var.w * i);
                if (i3 != f31Var.r()) {
                    f31Var.g = true;
                    W(f31Var, ConstraintWidget$DimensionBehaviour.a, i3, f31Var.U[1], f31Var.l());
                }
                return i3;
            }
            f31Var2 = f31Var;
            if (i2 == 1) {
                return f31Var2.r();
            }
            if (i2 == 3) {
                return (int) ((f31Var2.l() * f31Var2.Y) + 0.5f);
            }
        } else {
            f31Var2 = f31Var;
        }
        return f31Var2.r();
    }

    @Override // defpackage.f31
    public final void b(l74 l74Var, boolean z) {
        f31 f31Var;
        float f;
        int i;
        super.b(l74Var, z);
        f31 f31Var2 = this.V;
        boolean z2 = f31Var2 != null && ((g31) f31Var2).z0;
        int i2 = this.X0;
        ArrayList arrayList = this.a1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((we2) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((we2) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.d1 != null && this.c1 != null && this.b1 != null) {
                for (int i5 = 0; i5 < this.f1; i5++) {
                    this.e1[i5].E();
                }
                int[] iArr = this.d1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.N0;
                f31 f31Var3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.N0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    f31 f31Var4 = this.c1[i];
                    if (f31Var4 != null) {
                        v21 v21Var = f31Var4.J;
                        if (f31Var4.i0 != 8) {
                            if (i8 == 0) {
                                f31Var4.e(v21Var, this.J, this.A0);
                                f31Var4.l0 = this.H0;
                                f31Var4.f0 = f;
                            }
                            if (i8 == i6 - 1) {
                                f31Var4.e(f31Var4.L, this.L, this.B0);
                            }
                            if (i8 > 0 && f31Var3 != null) {
                                v21 v21Var2 = f31Var3.L;
                                f31Var4.e(v21Var, v21Var2, this.T0);
                                f31Var3.e(v21Var2, v21Var, 0);
                            }
                            f31Var3 = f31Var4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    f31 f31Var5 = this.b1[i9];
                    if (f31Var5 != null) {
                        v21 v21Var3 = f31Var5.K;
                        if (f31Var5.i0 != 8) {
                            if (i9 == 0) {
                                f31Var5.e(v21Var3, this.K, this.w0);
                                f31Var5.m0 = this.I0;
                                f31Var5.g0 = this.O0;
                            }
                            if (i9 == i7 - 1) {
                                f31Var5.e(f31Var5.M, this.M, this.x0);
                            }
                            if (i9 > 0 && f31Var3 != null) {
                                v21 v21Var4 = f31Var3.M;
                                f31Var5.e(v21Var3, v21Var4, this.U0);
                                f31Var3.e(v21Var4, v21Var3, 0);
                            }
                            f31Var3 = f31Var5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.Z0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        f31[] f31VarArr = this.e1;
                        if (i12 < f31VarArr.length && (f31Var = f31VarArr[i12]) != null && f31Var.i0 != 8) {
                            f31 f31Var6 = this.c1[i10];
                            f31 f31Var7 = this.b1[i11];
                            if (f31Var != f31Var6) {
                                f31Var.e(f31Var.J, f31Var6.J, 0);
                                f31Var.e(f31Var.L, f31Var6.L, 0);
                            }
                            if (f31Var != f31Var7) {
                                f31Var.e(f31Var.K, f31Var7.K, 0);
                                f31Var.e(f31Var.M, f31Var7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((we2) arrayList.get(0)).b(0, z2, true);
        }
        this.C0 = false;
    }

    @Override // defpackage.oy2, defpackage.f31
    public final void g(f31 f31Var, HashMap map) {
        super.g(f31Var, map);
        ye2 ye2Var = (ye2) f31Var;
        this.H0 = ye2Var.H0;
        this.I0 = ye2Var.I0;
        this.J0 = ye2Var.J0;
        this.K0 = ye2Var.K0;
        this.L0 = ye2Var.L0;
        this.M0 = ye2Var.M0;
        this.N0 = ye2Var.N0;
        this.O0 = ye2Var.O0;
        this.P0 = ye2Var.P0;
        this.Q0 = ye2Var.Q0;
        this.R0 = ye2Var.R0;
        this.S0 = ye2Var.S0;
        this.T0 = ye2Var.T0;
        this.U0 = ye2Var.U0;
        this.V0 = ye2Var.V0;
        this.W0 = ye2Var.W0;
        this.X0 = ye2Var.X0;
        this.Y0 = ye2Var.Y0;
        this.Z0 = ye2Var.Z0;
    }
}
