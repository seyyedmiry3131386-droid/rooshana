package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import defpackage.f31;
import defpackage.kb7;
import defpackage.v21;
import defpackage.wj1;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements wj1 {
    public int a;
    public f31 b;
    public kb7 c;
    public ConstraintWidget$DimensionBehaviour d;
    public final b e = new b(this);
    public int f = 0;
    public boolean g = false;
    public final a h = new a(this);
    public final a i = new a(this);
    public WidgetRun$RunType j = WidgetRun$RunType.a;

    public f(f31 f31Var) {
        this.b = f31Var;
    }

    public static void b(a aVar, a aVar2, int i) {
        aVar.l.add(aVar2);
        aVar.f = i;
        aVar2.k.add(aVar);
    }

    public static a h(v21 v21Var) {
        v21 v21Var2 = v21Var.f;
        if (v21Var2 == null) {
            return null;
        }
        f31 f31Var = v21Var2.d;
        int iOrdinal = v21Var2.e.ordinal();
        if (iOrdinal == 1) {
            return f31Var.d.h;
        }
        if (iOrdinal == 2) {
            return f31Var.e.h;
        }
        if (iOrdinal == 3) {
            return f31Var.d.i;
        }
        if (iOrdinal == 4) {
            return f31Var.e.i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return f31Var.e.k;
    }

    public static a i(v21 v21Var, int i) {
        v21 v21Var2 = v21Var.f;
        if (v21Var2 == null) {
            return null;
        }
        f31 f31Var = v21Var2.d;
        f fVar = i == 0 ? f31Var.d : f31Var.e;
        int iOrdinal = v21Var2.e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return fVar.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return fVar.i;
        }
        return null;
    }

    public final void c(a aVar, a aVar2, int i, b bVar) {
        aVar.l.add(aVar2);
        aVar.l.add(this.e);
        aVar.h = i;
        aVar.i = bVar;
        aVar2.k.add(aVar);
        bVar.k.add(aVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            f31 f31Var = this.b;
            int i3 = f31Var.v;
            int iMax = Math.max(f31Var.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            f31 f31Var2 = this.b;
            int i4 = f31Var2.y;
            int iMax2 = Math.max(f31Var2.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.v21 r13, defpackage.v21 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.f.l(v21, v21, int):void");
    }
}
