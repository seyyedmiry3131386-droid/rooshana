package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d49 implements z39 {
    public final xa5 a;
    public final ya5 b;
    public final int c;
    public final zy1 d;
    public int[] e = y39.a;
    public float[] f;
    public dl g;
    public dl h;
    public dl i;
    public dl j;
    public float[] k;
    public float[] l;
    public pj9 m;

    public d49(xa5 xa5Var, ya5 ya5Var, int i, zy1 zy1Var) {
        this.a = xa5Var;
        this.b = ya5Var;
        this.c = i;
        this.d = zy1Var;
        float[] fArr = y39.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = y39.c;
    }

    @Override // defpackage.x39
    public final /* synthetic */ boolean a() {
        return false;
    }

    public final int b(int i) {
        int i2;
        xa5 xa5Var = this.a;
        int i3 = xa5Var.b;
        xa5Var.getClass();
        if (i3 <= 0 || i3 > xa5Var.b) {
            lb7.k("");
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = xa5Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float c(int i, int i2, boolean z) {
        zy1 zy1Var;
        float f;
        xa5 xa5Var = this.a;
        if (i >= xa5Var.b - 1) {
            f = i2;
        } else {
            int iC = xa5Var.c(i);
            int iC2 = xa5Var.c(i + 1);
            if (i2 == iC) {
                f = iC;
            } else {
                int i3 = iC2 - iC;
                c49 c49Var = (c49) this.b.b(iC);
                if (c49Var == null || (zy1Var = c49Var.b) == null) {
                    zy1Var = this.d;
                }
                float f2 = i3;
                float fB = zy1Var.b((i2 - iC) / f2);
                if (z) {
                    return fB;
                }
                f = (f2 * fB) + iC;
            }
        }
        return f / 1000;
    }

    public final void d(dl dlVar, dl dlVar2, dl dlVar3) {
        float[] fArr;
        boolean z = this.m != y39.c;
        dl dlVar4 = this.g;
        ya5 ya5Var = this.b;
        xa5 xa5Var = this.a;
        if (dlVar4 == null) {
            this.g = dlVar.c();
            this.h = dlVar3.c();
            int i = xa5Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = xa5Var.c(i2) / 1000;
            }
            this.f = fArr2;
            int i3 = xa5Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.m != y39.c && js3.i(this.i, dlVar) && js3.i(this.j, dlVar2)) {
                return;
            }
            this.i = dlVar;
            this.j = dlVar2;
            int iB = dlVar.b() + (dlVar.b() % 2);
            this.k = new float[iB];
            this.l = new float[iB];
            int i5 = xa5Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = xa5Var.c(i6);
                c49 c49Var = (c49) ya5Var.b(iC);
                if (iC == 0 && c49Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = dlVar.a(i7);
                    }
                } else if (iC == this.c && c49Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = dlVar2.a(i8);
                    }
                } else {
                    js3.m(c49Var);
                    dl dlVar5 = c49Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = dlVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.m = new pj9(this.e, this.f, fArr3);
        }
    }

    @Override // defpackage.x39
    public final dl h(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        int[] iArr = y39.a;
        int i = 0;
        long j2 = (j / 1000000) - ((long) 0);
        long j3 = this.c;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return dlVar3;
        }
        d(dlVar, dlVar2, dlVar3);
        dl dlVar4 = this.h;
        js3.m(dlVar4);
        if (this.m != y39.c) {
            int i2 = (int) j4;
            float fC = c(b(i2), i2, false);
            float[] fArr = this.l;
            xu[][] xuVarArr = (xu[][]) this.m.a;
            float f = xuVarArr[0][0].a;
            float f2 = xuVarArr[xuVarArr.length - 1][0].b;
            if (fC < f) {
                fC = f;
            }
            if (fC <= f2) {
                f2 = fC;
            }
            int length = fArr.length;
            boolean z = false;
            for (xu[] xuVarArr2 : xuVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    xu xuVar = xuVarArr2[i4];
                    if (f2 <= xuVar.b) {
                        if (xuVar.p) {
                            fArr[i3] = xuVar.q;
                            fArr[i3 + 1] = xuVar.r;
                        } else {
                            xuVar.c(f2);
                            fArr[i3] = xuVar.a();
                            fArr[i3 + 1] = xuVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                dlVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            dl dlVarQ = q((j4 - 1) * 1000000, dlVar, dlVar2, dlVar3);
            dl dlVarQ2 = q(j4 * 1000000, dlVar, dlVar2, dlVar3);
            int iB = dlVarQ.b();
            while (i < iB) {
                dlVar4.e(i, (dlVarQ.a(i) - dlVarQ2.a(i)) * 1000.0f);
                i++;
            }
        }
        return dlVar4;
    }

    @Override // defpackage.z39
    public final int k() {
        return 0;
    }

    @Override // defpackage.z39
    public final int p() {
        return this.c;
    }

    @Override // defpackage.x39
    public final dl q(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        dl dlVar4;
        dl dlVar5;
        float f;
        xu[][] xuVarArr;
        boolean z;
        dl dlVar6 = dlVar;
        dl dlVar7 = dlVar2;
        int[] iArr = y39.a;
        int i = 0;
        long j2 = (j / 1000000) - ((long) 0);
        int i2 = this.c;
        long j3 = i2;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i3 = (int) j3;
        ya5 ya5Var = this.b;
        c49 c49Var = (c49) ya5Var.b(i3);
        if (c49Var != null) {
            return c49Var.a;
        }
        if (i3 >= i2) {
            return dlVar7;
        }
        if (i3 <= 0) {
            return dlVar6;
        }
        d(dlVar6, dlVar7, dlVar3);
        dl dlVar8 = this.g;
        js3.m(dlVar8);
        boolean z2 = true;
        if (this.m != y39.c) {
            float fC = c(b(i3), i3, false);
            float[] fArr = this.k;
            xu[][] xuVarArr2 = (xu[][]) this.m.a;
            int length = xuVarArr2.length - 1;
            float f2 = xuVarArr2[0][0].a;
            float f3 = xuVarArr2[length][0].b;
            int length2 = fArr.length;
            if (fC < f2 || fC > f3) {
                if (fC > f3) {
                    f2 = f3;
                } else {
                    length = 0;
                }
                float f4 = fC - f2;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    xu xuVar = xuVarArr2[length][i5];
                    boolean z3 = xuVar.p;
                    float f5 = xuVar.r;
                    float f6 = xuVar.q;
                    if (z3) {
                        float f7 = xuVar.a;
                        float f8 = xuVar.k;
                        f = f4;
                        float f9 = xuVar.c;
                        xuVarArr = xuVarArr2;
                        fArr[i4] = (f * f6) + dw1.f(xuVar.e, f9, (f2 - f7) * f8, f9);
                        float f10 = (f2 - f7) * f8;
                        float f11 = xuVar.d;
                        fArr[i4 + 1] = (f * f5) + dw1.f(xuVar.f, f11, f10, f11);
                    } else {
                        f = f4;
                        xuVarArr = xuVarArr2;
                        xuVar.c(f2);
                        fArr[i4] = (xuVar.a() * f) + (xuVar.n * xuVar.h) + f6;
                        fArr[i4 + 1] = (xuVar.b() * f) + (xuVar.o * xuVar.i) + f5;
                    }
                    i4 += 2;
                    i5++;
                    f4 = f;
                    xuVarArr2 = xuVarArr;
                }
            } else {
                int length3 = xuVarArr2.length;
                int i6 = 0;
                boolean z4 = false;
                while (i6 < length3) {
                    int i7 = i;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        xu xuVar2 = xuVarArr2[i6][i8];
                        if (fC <= xuVar2.b) {
                            if (xuVar2.p) {
                                float f12 = xuVar2.a;
                                float f13 = xuVar2.k;
                                float f14 = xuVar2.c;
                                z = z2;
                                fArr[i7] = dw1.f(xuVar2.e, f14, (fC - f12) * f13, f14);
                                float f15 = xuVar2.d;
                                fArr[i7 + 1] = dw1.f(xuVar2.f, f15, (fC - f12) * f13, f15);
                            } else {
                                z = z2;
                                xuVar2.c(fC);
                                fArr[i7] = (xuVar2.n * xuVar2.h) + xuVar2.q;
                                fArr[i7 + 1] = (xuVar2.o * xuVar2.i) + xuVar2.r;
                            }
                            z4 = z;
                        } else {
                            z = z2;
                        }
                        i7 += 2;
                        i8++;
                        z2 = z;
                    }
                    boolean z5 = z2;
                    if (z4) {
                        break;
                    }
                    i6++;
                    z2 = z5;
                    i = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                dlVar8.e(i9, fArr[i9]);
            }
        } else {
            int iB = b(i3);
            float fC2 = c(iB, i3, true);
            xa5 xa5Var = this.a;
            c49 c49Var2 = (c49) ya5Var.b(xa5Var.c(iB));
            if (c49Var2 != null && (dlVar5 = c49Var2.a) != null) {
                dlVar6 = dlVar5;
            }
            c49 c49Var3 = (c49) ya5Var.b(xa5Var.c(iB + 1));
            if (c49Var3 != null && (dlVar4 = c49Var3.a) != null) {
                dlVar7 = dlVar4;
            }
            int iB2 = dlVar8.b();
            for (int i10 = 0; i10 < iB2; i10++) {
                dlVar8.e(i10, (dlVar7.a(i10) * fC2) + ((1 - fC2) * dlVar6.a(i10)));
            }
        }
        return dlVar8;
    }

    @Override // defpackage.x39
    public final dl r(dl dlVar, dl dlVar2, dl dlVar3) {
        return h(s(dlVar, dlVar2, dlVar3), dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.x39
    public final long s(dl dlVar, dl dlVar2, dl dlVar3) {
        return ((long) p()) * 1000000;
    }
}
