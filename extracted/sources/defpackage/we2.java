package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;

/* JADX INFO: loaded from: classes.dex */
public final class we2 {
    public int a;
    public v21 d;
    public v21 e;
    public v21 f;
    public v21 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ ye2 r;
    public f31 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public we2(ye2 ye2Var, int i, v21 v21Var, v21 v21Var2, v21 v21Var3, v21 v21Var4, int i2) {
        this.r = ye2Var;
        this.a = i;
        this.d = v21Var;
        this.e = v21Var2;
        this.f = v21Var3;
        this.g = v21Var4;
        this.h = ye2Var.A0;
        this.i = ye2Var.w0;
        this.j = ye2Var.B0;
        this.k = ye2Var.x0;
        this.q = i2;
    }

    public final void a(f31 f31Var) {
        int i = this.a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.c;
        ye2 ye2Var = this.r;
        if (i == 0) {
            int iY = ye2Var.Y(f31Var, this.q);
            if (f31Var.U[0] == constraintWidget$DimensionBehaviour) {
                this.p++;
                iY = 0;
            }
            this.l = iY + (f31Var.i0 != 8 ? ye2Var.T0 : 0) + this.l;
            int iX = ye2Var.X(f31Var, this.q);
            if (this.b == null || this.c < iX) {
                this.b = f31Var;
                this.c = iX;
                this.m = iX;
            }
        } else {
            int iY2 = ye2Var.Y(f31Var, this.q);
            int iX2 = ye2Var.X(f31Var, this.q);
            if (f31Var.U[1] == constraintWidget$DimensionBehaviour) {
                this.p++;
                iX2 = 0;
            }
            this.m = iX2 + (f31Var.i0 != 8 ? ye2Var.U0 : 0) + this.m;
            if (this.b == null || this.c < iY2) {
                this.b = f31Var;
                this.c = iY2;
                this.l = iY2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        ye2 ye2Var;
        int i2;
        int i3;
        f31 f31Var;
        boolean z3;
        int i4;
        int i5;
        char c;
        float f;
        float f2;
        float f3;
        int i6;
        float f4;
        float f5;
        int i7;
        int i8 = this.o;
        int i9 = 0;
        while (true) {
            ye2Var = this.r;
            if (i9 >= i8 || (i7 = this.n + i9) >= ye2Var.f1) {
                break;
            }
            f31 f31Var2 = ye2Var.e1[i7];
            if (f31Var2 != null) {
                f31Var2.E();
            }
            i9++;
        }
        if (i8 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = this.n + (z ? (i8 - 1) - i12 : i12);
            if (i13 >= ye2Var.f1) {
                break;
            }
            f31 f31Var3 = ye2Var.e1[i13];
            if (f31Var3 != null && f31Var3.i0 == 0) {
                if (i10 == -1) {
                    i10 = i12;
                }
                i11 = i12;
            }
        }
        if (this.a == 0) {
            f31 f31Var4 = this.b;
            f31Var4.m0 = ye2Var.I0;
            v21 v21Var = f31Var4.M;
            v21 v21Var2 = f31Var4.K;
            int i14 = this.i;
            if (i > 0) {
                i14 += ye2Var.U0;
            }
            v21Var2.a(this.e, i14);
            if (z2) {
                v21Var.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.M.a(v21Var2, 0);
            }
            if (ye2Var.W0 != 3 || f31Var4.E) {
                f31Var = f31Var4;
            } else {
                for (int i15 = 0; i15 < i8; i15++) {
                    int i16 = this.n + (z ? (i8 - 1) - i15 : i15);
                    if (i16 >= ye2Var.f1) {
                        break;
                    }
                    f31Var = ye2Var.e1[i16];
                    if (f31Var.E) {
                        break;
                    }
                }
                f31Var = f31Var4;
            }
            int i17 = 0;
            f31 f31Var5 = null;
            while (i17 < i8) {
                int i18 = z ? (i8 - 1) - i17 : i17;
                int i19 = this.n + i18;
                if (i19 >= ye2Var.f1) {
                    return;
                }
                f31 f31Var6 = ye2Var.e1[i19];
                if (f31Var6 == null) {
                    i5 = i8;
                    z3 = z4;
                    i4 = i11;
                    c = 3;
                } else {
                    v21 v21Var3 = f31Var6.M;
                    v21 v21Var4 = f31Var6.K;
                    v21 v21Var5 = f31Var6.J;
                    z3 = z4;
                    if (i17 == 0) {
                        i4 = i11;
                        f31Var6.e(v21Var5, this.d, this.h);
                    } else {
                        i4 = i11;
                    }
                    if (i18 == 0) {
                        int i20 = ye2Var.H0;
                        if (z) {
                            f = 1.0f;
                            f2 = 1.0f - ye2Var.N0;
                        } else {
                            f = 1.0f;
                            f2 = ye2Var.N0;
                        }
                        if (this.n == 0) {
                            i6 = ye2Var.J0;
                            f3 = f2;
                            if (i6 != -1) {
                                if (z) {
                                    f5 = ye2Var.P0;
                                    f4 = f - f5;
                                    f31Var6.l0 = i6;
                                    f31Var6.f0 = f4;
                                } else {
                                    f4 = ye2Var.P0;
                                    f31Var6.l0 = i6;
                                    f31Var6.f0 = f4;
                                }
                            }
                        } else {
                            f3 = f2;
                        }
                        if (!z2 || (i6 = ye2Var.L0) == -1) {
                            i6 = i20;
                            f4 = f3;
                        } else if (z) {
                            f5 = ye2Var.R0;
                            f4 = f - f5;
                        } else {
                            f4 = ye2Var.R0;
                        }
                        f31Var6.l0 = i6;
                        f31Var6.f0 = f4;
                    }
                    if (i17 == i8 - 1) {
                        i5 = i8;
                        f31Var6.e(f31Var6.L, this.f, this.j);
                    } else {
                        i5 = i8;
                    }
                    if (f31Var5 != null) {
                        v21 v21Var6 = f31Var5.L;
                        v21Var5.a(v21Var6, ye2Var.T0);
                        if (i17 == i10) {
                            int i21 = this.h;
                            if (v21Var5.h()) {
                                v21Var5.h = i21;
                            }
                        }
                        v21Var6.a(v21Var5, 0);
                        if (i17 == i4 + 1) {
                            int i22 = this.j;
                            if (v21Var6.h()) {
                                v21Var6.h = i22;
                            }
                        }
                    }
                    if (f31Var6 != f31Var4) {
                        int i23 = ye2Var.W0;
                        c = 3;
                        if (i23 == 3 && f31Var.E && f31Var6 != f31Var && f31Var6.E) {
                            f31Var6.N.a(f31Var.N, 0);
                        } else if (i23 == 0) {
                            v21Var4.a(v21Var2, 0);
                        } else if (i23 == 1) {
                            v21Var3.a(v21Var, 0);
                        } else if (z3) {
                            v21Var4.a(this.e, this.i);
                            v21Var3.a(this.g, this.k);
                        } else {
                            v21Var4.a(v21Var2, 0);
                            v21Var3.a(v21Var, 0);
                        }
                    } else {
                        c = 3;
                    }
                    f31Var5 = f31Var6;
                }
                i17++;
                z4 = z3;
                i11 = i4;
                i8 = i5;
            }
            return;
        }
        int i24 = i8;
        boolean z5 = z4;
        int i25 = i11;
        f31 f31Var7 = this.b;
        f31Var7.l0 = ye2Var.H0;
        v21 v21Var7 = f31Var7.J;
        v21 v21Var8 = f31Var7.L;
        int i26 = this.h;
        if (i > 0) {
            i26 += ye2Var.T0;
        }
        if (z) {
            v21Var8.a(this.f, i26);
            if (z2) {
                v21Var7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.J.a(v21Var8, 0);
            }
        } else {
            v21Var7.a(this.d, i26);
            if (z2) {
                v21Var8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.L.a(v21Var7, 0);
            }
        }
        int i27 = 0;
        f31 f31Var8 = null;
        while (true) {
            int i28 = i24;
            if (i27 >= i28 || (i2 = this.n + i27) >= ye2Var.f1) {
                return;
            }
            f31 f31Var9 = ye2Var.e1[i2];
            if (f31Var9 == null) {
                i24 = i28;
            } else {
                v21 v21Var9 = f31Var9.K;
                v21 v21Var10 = f31Var9.L;
                v21 v21Var11 = f31Var9.J;
                if (i27 == 0) {
                    f31Var9.e(v21Var9, this.e, this.i);
                    int i29 = ye2Var.I0;
                    float f6 = ye2Var.O0;
                    if (this.n == 0) {
                        int i30 = ye2Var.K0;
                        i24 = i28;
                        i3 = -1;
                        if (i30 != -1) {
                            f6 = ye2Var.Q0;
                        }
                        i29 = i30;
                        f31Var9.m0 = i29;
                        f31Var9.g0 = f6;
                    } else {
                        i24 = i28;
                        i3 = -1;
                    }
                    if (z2 && (i30 = ye2Var.M0) != i3) {
                        f6 = ye2Var.S0;
                        i29 = i30;
                    }
                    f31Var9.m0 = i29;
                    f31Var9.g0 = f6;
                } else {
                    i24 = i28;
                }
                if (i27 == i24 - 1) {
                    f31Var9.e(f31Var9.M, this.g, this.k);
                }
                if (f31Var8 != null) {
                    v21 v21Var12 = f31Var8.M;
                    v21Var9.a(v21Var12, ye2Var.U0);
                    if (i27 == i10) {
                        int i31 = this.i;
                        if (v21Var9.h()) {
                            v21Var9.h = i31;
                        }
                    }
                    v21Var12.a(v21Var9, 0);
                    if (i27 == i25 + 1) {
                        int i32 = this.k;
                        if (v21Var12.h()) {
                            v21Var12.h = i32;
                        }
                    }
                }
                if (f31Var9 == f31Var7) {
                    f31Var8 = f31Var9;
                } else if (z) {
                    int i33 = ye2Var.V0;
                    if (i33 == 0) {
                        v21Var10.a(v21Var8, 0);
                    } else if (i33 == 1) {
                        v21Var11.a(v21Var7, 0);
                    } else if (i33 == 2) {
                        v21Var11.a(v21Var7, 0);
                        v21Var10.a(v21Var8, 0);
                    }
                    f31Var8 = f31Var9;
                } else {
                    int i34 = ye2Var.V0;
                    if (i34 == 0) {
                        v21Var11.a(v21Var7, 0);
                    } else if (i34 == 1) {
                        v21Var10.a(v21Var8, 0);
                    } else if (i34 == 2) {
                        if (z5) {
                            v21Var11.a(this.d, this.h);
                            v21Var10.a(this.f, this.j);
                        } else {
                            v21Var11.a(v21Var7, 0);
                            v21Var10.a(v21Var8, 0);
                        }
                    }
                    f31Var8 = f31Var9;
                }
            }
            i27++;
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.U0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.T0 : this.l;
    }

    public final void e(int i) {
        int i2 = this.p;
        if (i2 == 0) {
            return;
        }
        int i3 = this.o;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.n;
            int i7 = i6 + i5;
            ye2 ye2Var = this.r;
            if (i7 >= ye2Var.f1) {
                break;
            }
            f31 f31Var = ye2Var.e1[i6 + i5];
            int i8 = this.a;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.a;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.c;
            if (i8 == 0) {
                if (f31Var != null) {
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = f31Var.U;
                    if (constraintWidget$DimensionBehaviourArr[0] == constraintWidget$DimensionBehaviour2 && f31Var.r == 0) {
                        ye2Var.W(f31Var, constraintWidget$DimensionBehaviour, i4, constraintWidget$DimensionBehaviourArr[1], f31Var.l());
                    }
                }
            } else if (f31Var != null) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = f31Var.U;
                if (constraintWidget$DimensionBehaviourArr2[1] == constraintWidget$DimensionBehaviour2 && f31Var.s == 0) {
                    int i9 = i4;
                    ye2Var.W(f31Var, constraintWidget$DimensionBehaviourArr2[0], f31Var.r(), constraintWidget$DimensionBehaviour, i9);
                    i4 = i9;
                }
            }
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i10 = this.o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.n + i11;
            ye2 ye2Var2 = this.r;
            if (i12 >= ye2Var2.f1) {
                return;
            }
            f31 f31Var2 = ye2Var2.e1[i12];
            if (this.a == 0) {
                int iR = f31Var2.r();
                int i13 = ye2Var2.T0;
                if (f31Var2.i0 == 8) {
                    i13 = 0;
                }
                this.l = iR + i13 + this.l;
                int iX = ye2Var2.X(f31Var2, this.q);
                if (this.b == null || this.c < iX) {
                    this.b = f31Var2;
                    this.c = iX;
                    this.m = iX;
                }
            } else {
                int iY = ye2Var2.Y(f31Var2, this.q);
                int iX2 = ye2Var2.X(f31Var2, this.q);
                int i14 = ye2Var2.U0;
                if (f31Var2.i0 == 8) {
                    i14 = 0;
                }
                this.m = iX2 + i14 + this.m;
                if (this.b == null || this.c < iY) {
                    this.b = f31Var2;
                    this.c = iY;
                    this.l = iY;
                }
            }
        }
    }

    public final void f(int i, v21 v21Var, v21 v21Var2, v21 v21Var3, v21 v21Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = v21Var;
        this.e = v21Var2;
        this.f = v21Var3;
        this.g = v21Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
