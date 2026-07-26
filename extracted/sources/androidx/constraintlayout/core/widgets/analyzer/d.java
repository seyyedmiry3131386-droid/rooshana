package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import defpackage.f31;
import defpackage.oy2;
import defpackage.v21;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f {
    public static final int[] k = new int[2];

    public d(f31 f31Var) {
        super(f31Var);
        this.h.e = DependencyNode$Type.d;
        this.i.e = DependencyNode$Type.e;
        this.f = 0;
    }

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // defpackage.wj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.wj1 r24) {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.d.a(wj1):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void d() {
        f31 f31Var;
        f31 f31Var2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        f31 f31Var3;
        f31 f31Var4;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        f31 f31Var5 = this.b;
        boolean z = f31Var5.a;
        b bVar = this.e;
        if (z) {
            bVar.d(f31Var5.r());
        }
        boolean z2 = bVar.j;
        ArrayList arrayList = bVar.k;
        ArrayList arrayList2 = bVar.l;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.d;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.c;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.a;
        a aVar = this.i;
        a aVar2 = this.h;
        if (!z2) {
            f31 f31Var6 = this.b;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = f31Var6.U[0];
            this.d = constraintWidget$DimensionBehaviour6;
            if (constraintWidget$DimensionBehaviour6 != constraintWidget$DimensionBehaviour4) {
                if (constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour3 && (f31Var4 = f31Var6.V) != null && ((constraintWidget$DimensionBehaviour2 = f31Var4.U[0]) == constraintWidget$DimensionBehaviour5 || constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3)) {
                    int iR = (f31Var4.r() - this.b.J.e()) - this.b.L.e();
                    f.b(aVar2, f31Var4.d.h, this.b.J.e());
                    f.b(aVar, f31Var4.d.i, -this.b.L.e());
                    bVar.d(iR);
                    return;
                }
                if (constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour5) {
                    bVar.d(f31Var6.r());
                }
            }
        } else if (this.d == constraintWidget$DimensionBehaviour3 && (f31Var2 = (f31Var = this.b).V) != null && ((constraintWidget$DimensionBehaviour = f31Var2.U[0]) == constraintWidget$DimensionBehaviour5 || constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3)) {
            f.b(aVar2, f31Var2.d.h, f31Var.J.e());
            f.b(aVar, f31Var2.d.i, -this.b.L.e());
            return;
        }
        if (bVar.j) {
            f31 f31Var7 = this.b;
            if (f31Var7.a) {
                v21[] v21VarArr = f31Var7.R;
                v21 v21Var = v21VarArr[0];
                v21 v21Var2 = v21Var.f;
                if (v21Var2 != null && v21VarArr[1].f != null) {
                    if (f31Var7.y()) {
                        aVar2.f = this.b.R[0].e();
                        aVar.f = -this.b.R[1].e();
                        return;
                    }
                    a aVarH = f.h(this.b.R[0]);
                    if (aVarH != null) {
                        f.b(aVar2, aVarH, this.b.R[0].e());
                    }
                    a aVarH2 = f.h(this.b.R[1]);
                    if (aVarH2 != null) {
                        f.b(aVar, aVarH2, -this.b.R[1].e());
                    }
                    aVar2.b = true;
                    aVar.b = true;
                    return;
                }
                if (v21Var2 != null) {
                    a aVarH3 = f.h(v21Var);
                    if (aVarH3 != null) {
                        f.b(aVar2, aVarH3, this.b.R[0].e());
                        f.b(aVar, aVar2, bVar.g);
                        return;
                    }
                    return;
                }
                v21 v21Var3 = v21VarArr[1];
                if (v21Var3.f != null) {
                    a aVarH4 = f.h(v21Var3);
                    if (aVarH4 != null) {
                        f.b(aVar, aVarH4, -this.b.R[1].e());
                        f.b(aVar2, aVar, -bVar.g);
                        return;
                    }
                    return;
                }
                if ((f31Var7 instanceof oy2) || f31Var7.V == null || f31Var7.j(ConstraintAnchor$Type.f).f != null) {
                    return;
                }
                f31 f31Var8 = this.b;
                f.b(aVar2, f31Var8.V.d.h, f31Var8.s());
                f.b(aVar, aVar2, bVar.g);
                return;
            }
        }
        if (this.d == constraintWidget$DimensionBehaviour4) {
            f31 f31Var9 = this.b;
            int i = f31Var9.r;
            if (i == 2) {
                f31 f31Var10 = f31Var9.V;
                if (f31Var10 != null) {
                    b bVar2 = f31Var10.e.e;
                    arrayList2.add(bVar2);
                    bVar2.k.add(bVar);
                    bVar.b = true;
                    arrayList.add(aVar2);
                    arrayList.add(aVar);
                }
            } else if (i == 3) {
                if (f31Var9.s == 3) {
                    aVar2.a = this;
                    aVar.a = this;
                    e eVar = f31Var9.e;
                    eVar.h.a = this;
                    eVar.i.a = this;
                    bVar.a = this;
                    if (f31Var9.z()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(bVar);
                        e eVar2 = this.b.e;
                        eVar2.e.a = this;
                        arrayList2.add(eVar2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(bVar);
                        this.b.e.i.k.add(bVar);
                    } else if (this.b.y()) {
                        this.b.e.e.l.add(bVar);
                        arrayList.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(bVar);
                    }
                } else {
                    b bVar3 = f31Var9.e.e;
                    arrayList2.add(bVar3);
                    bVar3.k.add(bVar);
                    this.b.e.h.k.add(bVar);
                    this.b.e.i.k.add(bVar);
                    bVar.b = true;
                    arrayList.add(aVar2);
                    arrayList.add(aVar);
                    aVar2.l.add(bVar);
                    aVar.l.add(bVar);
                }
            }
        }
        f31 f31Var11 = this.b;
        v21[] v21VarArr2 = f31Var11.R;
        v21 v21Var4 = v21VarArr2[0];
        v21 v21Var5 = v21Var4.f;
        if (v21Var5 != null && v21VarArr2[1].f != null) {
            if (f31Var11.y()) {
                aVar2.f = this.b.R[0].e();
                aVar.f = -this.b.R[1].e();
                return;
            }
            a aVarH5 = f.h(this.b.R[0]);
            a aVarH6 = f.h(this.b.R[1]);
            if (aVarH5 != null) {
                aVarH5.b(this);
            }
            if (aVarH6 != null) {
                aVarH6.b(this);
            }
            this.j = WidgetRun$RunType.b;
            return;
        }
        if (v21Var5 != null) {
            a aVarH7 = f.h(v21Var4);
            if (aVarH7 != null) {
                f.b(aVar2, aVarH7, this.b.R[0].e());
                c(aVar, aVar2, 1, bVar);
                return;
            }
            return;
        }
        v21 v21Var6 = v21VarArr2[1];
        if (v21Var6.f != null) {
            a aVarH8 = f.h(v21Var6);
            if (aVarH8 != null) {
                f.b(aVar, aVarH8, -this.b.R[1].e());
                c(aVar2, aVar, -1, bVar);
                return;
            }
            return;
        }
        if ((f31Var11 instanceof oy2) || (f31Var3 = f31Var11.V) == null) {
            return;
        }
        f.b(aVar2, f31Var3.d.h, f31Var11.s());
        c(aVar, aVar2, 1, bVar);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void e() {
        a aVar = this.h;
        if (aVar.j) {
            this.b.a0 = aVar.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final boolean k() {
        return this.d != ConstraintWidget$DimensionBehaviour.c || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        a aVar = this.h;
        aVar.c();
        aVar.j = false;
        a aVar2 = this.i;
        aVar2.c();
        aVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.k0;
    }
}
