package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import defpackage.aa0;
import defpackage.f31;
import defpackage.oy2;
import defpackage.v21;
import defpackage.wj1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public final a k;
    public aa0 l;

    public e(f31 f31Var) {
        super(f31Var);
        a aVar = new a(this);
        this.k = aVar;
        this.l = null;
        this.h.e = DependencyNode$Type.f;
        this.i.e = DependencyNode$Type.g;
        aVar.e = DependencyNode$Type.h;
        this.f = 1;
    }

    @Override // defpackage.wj1
    public final void a(wj1 wj1Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.j.ordinal() == 3) {
            f31 f31Var = this.b;
            l(f31Var.K, f31Var.M, 1);
            return;
        }
        b bVar = this.e;
        boolean z = bVar.c;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.c;
        if (z && !bVar.j && this.d == constraintWidget$DimensionBehaviour) {
            f31 f31Var2 = this.b;
            int i2 = f31Var2.s;
            if (i2 == 2) {
                f31 f31Var3 = f31Var2.V;
                if (f31Var3 != null) {
                    if (f31Var3.e.e.j) {
                        bVar.d((int) ((r1.g * f31Var2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                b bVar2 = f31Var2.d.e;
                if (bVar2.j) {
                    int i3 = f31Var2.Z;
                    if (i3 == -1) {
                        f = bVar2.g;
                        f2 = f31Var2.Y;
                    } else if (i3 == 0) {
                        f3 = bVar2.g * f31Var2.Y;
                        i = (int) (f3 + 0.5f);
                        bVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        bVar.d(i);
                    } else {
                        f = bVar2.g;
                        f2 = f31Var2.Y;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    bVar.d(i);
                }
            }
        }
        a aVar = this.h;
        boolean z2 = aVar.c;
        ArrayList arrayList = aVar.l;
        if (z2) {
            a aVar2 = this.i;
            boolean z3 = aVar2.c;
            ArrayList arrayList2 = aVar2.l;
            if (z3) {
                if (aVar.j && aVar2.j && bVar.j) {
                    return;
                }
                if (!bVar.j && this.d == constraintWidget$DimensionBehaviour) {
                    f31 f31Var4 = this.b;
                    if (f31Var4.r == 0 && !f31Var4.z()) {
                        a aVar3 = (a) arrayList.get(0);
                        a aVar4 = (a) arrayList2.get(0);
                        int i4 = aVar3.g + aVar.f;
                        int i5 = aVar4.g + aVar2.f;
                        aVar.d(i4);
                        aVar2.d(i5);
                        bVar.d(i5 - i4);
                        return;
                    }
                }
                if (!bVar.j && this.d == constraintWidget$DimensionBehaviour && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    a aVar5 = (a) arrayList.get(0);
                    int i6 = (((a) arrayList2.get(0)).g + aVar2.f) - (aVar5.g + aVar.f);
                    int i7 = bVar.m;
                    if (i6 < i7) {
                        bVar.d(i6);
                    } else {
                        bVar.d(i7);
                    }
                }
                if (bVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    a aVar6 = (a) arrayList.get(0);
                    a aVar7 = (a) arrayList2.get(0);
                    int i8 = aVar6.g;
                    int i9 = aVar.f + i8;
                    int i10 = aVar7.g;
                    int i11 = aVar2.f + i10;
                    float f4 = this.b.g0;
                    if (aVar6 == aVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    aVar.d((int) ((((i10 - i8) - bVar.g) * f4) + i8 + 0.5f));
                    aVar2.d(aVar.g + bVar.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void d() {
        f31 f31Var;
        f31 f31Var2;
        f31 f31Var3;
        f31 f31Var4;
        f31 f31Var5 = this.b;
        boolean z = f31Var5.a;
        b bVar = this.e;
        if (z) {
            bVar.d(f31Var5.l());
        }
        boolean z2 = bVar.j;
        ArrayList arrayList = bVar.k;
        ArrayList arrayList2 = bVar.l;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.d;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.c;
        a aVar = this.i;
        a aVar2 = this.h;
        if (!z2) {
            f31 f31Var6 = this.b;
            this.d = f31Var6.U[1];
            if (f31Var6.E) {
                this.l = new aa0(this);
            }
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = this.d;
            if (constraintWidget$DimensionBehaviour4 != constraintWidget$DimensionBehaviour3) {
                if (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour && (f31Var4 = this.b.V) != null && f31Var4.U[1] == constraintWidget$DimensionBehaviour2) {
                    int iL = (f31Var4.l() - this.b.K.e()) - this.b.M.e();
                    f.b(aVar2, f31Var4.e.h, this.b.K.e());
                    f.b(aVar, f31Var4.e.i, -this.b.M.e());
                    bVar.d(iL);
                    return;
                }
                if (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour2) {
                    bVar.d(this.b.l());
                }
            }
        } else if (this.d == constraintWidget$DimensionBehaviour && (f31Var2 = (f31Var = this.b).V) != null && f31Var2.U[1] == constraintWidget$DimensionBehaviour2) {
            f.b(aVar2, f31Var2.e.h, f31Var.K.e());
            f.b(aVar, f31Var2.e.i, -this.b.M.e());
            return;
        }
        boolean z3 = bVar.j;
        a aVar3 = this.k;
        if (z3) {
            f31 f31Var7 = this.b;
            if (f31Var7.a) {
                v21[] v21VarArr = f31Var7.R;
                v21 v21Var = v21VarArr[2];
                v21 v21Var2 = v21Var.f;
                if (v21Var2 != null && v21VarArr[3].f != null) {
                    if (f31Var7.z()) {
                        aVar2.f = this.b.R[2].e();
                        aVar.f = -this.b.R[3].e();
                    } else {
                        a aVarH = f.h(this.b.R[2]);
                        if (aVarH != null) {
                            f.b(aVar2, aVarH, this.b.R[2].e());
                        }
                        a aVarH2 = f.h(this.b.R[3]);
                        if (aVarH2 != null) {
                            f.b(aVar, aVarH2, -this.b.R[3].e());
                        }
                        aVar2.b = true;
                        aVar.b = true;
                    }
                    f31 f31Var8 = this.b;
                    if (f31Var8.E) {
                        f.b(aVar3, aVar2, f31Var8.c0);
                        return;
                    }
                    return;
                }
                if (v21Var2 != null) {
                    a aVarH3 = f.h(v21Var);
                    if (aVarH3 != null) {
                        f.b(aVar2, aVarH3, this.b.R[2].e());
                        f.b(aVar, aVar2, bVar.g);
                        f31 f31Var9 = this.b;
                        if (f31Var9.E) {
                            f.b(aVar3, aVar2, f31Var9.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                v21 v21Var3 = v21VarArr[3];
                if (v21Var3.f != null) {
                    a aVarH4 = f.h(v21Var3);
                    if (aVarH4 != null) {
                        f.b(aVar, aVarH4, -this.b.R[3].e());
                        f.b(aVar2, aVar, -bVar.g);
                    }
                    f31 f31Var10 = this.b;
                    if (f31Var10.E) {
                        f.b(aVar3, aVar2, f31Var10.c0);
                        return;
                    }
                    return;
                }
                v21 v21Var4 = v21VarArr[4];
                if (v21Var4.f != null) {
                    a aVarH5 = f.h(v21Var4);
                    if (aVarH5 != null) {
                        f.b(aVar3, aVarH5, 0);
                        f.b(aVar2, aVar3, -this.b.c0);
                        f.b(aVar, aVar2, bVar.g);
                        return;
                    }
                    return;
                }
                if ((f31Var7 instanceof oy2) || f31Var7.V == null || f31Var7.j(ConstraintAnchor$Type.f).f != null) {
                    return;
                }
                f31 f31Var11 = this.b;
                f.b(aVar2, f31Var11.V.e.h, f31Var11.t());
                f.b(aVar, aVar2, bVar.g);
                f31 f31Var12 = this.b;
                if (f31Var12.E) {
                    f.b(aVar3, aVar2, f31Var12.c0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != constraintWidget$DimensionBehaviour3) {
            bVar.b(this);
        } else {
            f31 f31Var13 = this.b;
            int i = f31Var13.s;
            if (i == 2) {
                f31 f31Var14 = f31Var13.V;
                if (f31Var14 != null) {
                    b bVar2 = f31Var14.e.e;
                    arrayList2.add(bVar2);
                    bVar2.k.add(bVar);
                    bVar.b = true;
                    arrayList.add(aVar2);
                    arrayList.add(aVar);
                }
            } else if (i == 3 && !f31Var13.z()) {
                f31 f31Var15 = this.b;
                if (f31Var15.r != 3) {
                    b bVar3 = f31Var15.d.e;
                    arrayList2.add(bVar3);
                    bVar3.k.add(bVar);
                    bVar.b = true;
                    arrayList.add(aVar2);
                    arrayList.add(aVar);
                }
            }
        }
        f31 f31Var16 = this.b;
        v21[] v21VarArr2 = f31Var16.R;
        v21 v21Var5 = v21VarArr2[2];
        v21 v21Var6 = v21Var5.f;
        if (v21Var6 != null && v21VarArr2[3].f != null) {
            if (f31Var16.z()) {
                aVar2.f = this.b.R[2].e();
                aVar.f = -this.b.R[3].e();
            } else {
                a aVarH6 = f.h(this.b.R[2]);
                a aVarH7 = f.h(this.b.R[3]);
                if (aVarH6 != null) {
                    aVarH6.b(this);
                }
                if (aVarH7 != null) {
                    aVarH7.b(this);
                }
                this.j = WidgetRun$RunType.b;
            }
            if (this.b.E) {
                c(aVar3, aVar2, 1, this.l);
            }
        } else if (v21Var6 != null) {
            a aVarH8 = f.h(v21Var5);
            if (aVarH8 != null) {
                f.b(aVar2, aVarH8, this.b.R[2].e());
                c(aVar, aVar2, 1, bVar);
                if (this.b.E) {
                    c(aVar3, aVar2, 1, this.l);
                }
                if (this.d == constraintWidget$DimensionBehaviour3) {
                    f31 f31Var17 = this.b;
                    if (f31Var17.Y > 0.0f) {
                        d dVar = f31Var17.d;
                        if (dVar.d == constraintWidget$DimensionBehaviour3) {
                            dVar.e.k.add(bVar);
                            arrayList2.add(this.b.d.e);
                            bVar.a = this;
                        }
                    }
                }
            }
        } else {
            v21 v21Var7 = v21VarArr2[3];
            if (v21Var7.f != null) {
                a aVarH9 = f.h(v21Var7);
                if (aVarH9 != null) {
                    f.b(aVar, aVarH9, -this.b.R[3].e());
                    c(aVar2, aVar, -1, bVar);
                    if (this.b.E) {
                        c(aVar3, aVar2, 1, this.l);
                    }
                }
            } else {
                v21 v21Var8 = v21VarArr2[4];
                if (v21Var8.f != null) {
                    a aVarH10 = f.h(v21Var8);
                    if (aVarH10 != null) {
                        f.b(aVar3, aVarH10, 0);
                        c(aVar2, aVar3, -1, this.l);
                        c(aVar, aVar2, 1, bVar);
                    }
                } else if (!(f31Var16 instanceof oy2) && (f31Var3 = f31Var16.V) != null) {
                    f.b(aVar2, f31Var3.e.h, f31Var16.t());
                    c(aVar, aVar2, 1, bVar);
                    if (this.b.E) {
                        c(aVar3, aVar2, 1, this.l);
                    }
                    if (this.d == constraintWidget$DimensionBehaviour3) {
                        f31 f31Var18 = this.b;
                        if (f31Var18.Y > 0.0f) {
                            d dVar2 = f31Var18.d;
                            if (dVar2.d == constraintWidget$DimensionBehaviour3) {
                                dVar2.e.k.add(bVar);
                                arrayList2.add(this.b.d.e);
                                bVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            bVar.c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void e() {
        a aVar = this.h;
        if (aVar.j) {
            this.b.b0 = aVar.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final boolean k() {
        return this.d != ConstraintWidget$DimensionBehaviour.c || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        a aVar = this.h;
        aVar.c();
        aVar.j = false;
        a aVar2 = this.i;
        aVar2.c();
        aVar2.j = false;
        a aVar3 = this.k;
        aVar3.c();
        aVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.k0;
    }
}
