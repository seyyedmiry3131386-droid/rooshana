package defpackage;

import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class cb7 implements cl4, ya7 {
    public final dv a;
    public final bb0 b;

    public cb7(dv dvVar, bb0 bb0Var) {
        this.a = dvVar;
        this.b = bb0Var;
    }

    @Override // defpackage.ya7
    public final void a(int i, el4 el4Var, int[] iArr, int[] iArr2) {
        this.a.k(el4Var, i, iArr, el4Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.cl4
    public final int b(es3 es3Var, List list, int i) {
        int iB0 = es3Var.b0(this.a.e());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            yk4 yk4Var = (yk4) list.get(i3);
            float fE = xa7.e(xa7.d(yk4Var));
            int iN = yk4Var.n(i);
            if (fE == 0.0f) {
                i2 += iN;
            } else if (fE > 0.0f) {
                f += fE;
                iMax = Math.max(iMax, Math.round(iN / fE));
            }
        }
        return ((list.size() - 1) * iB0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.ya7
    public final long c(int i, int i2, boolean z, int i3) {
        return !z ? j31.a(i, i2, 0, i3) : vy2.y(i, i2, 0, i3);
    }

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        return za7.t(this, h31.j(j), h31.i(j), h31.h(j), h31.g(j), el4Var.b0(this.a.e()), el4Var, list, new b96[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.cl4
    public final int e(es3 es3Var, List list, int i) {
        int iB0 = es3Var.b0(this.a.e());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            yk4 yk4Var = (yk4) list.get(i3);
            float fE = xa7.e(xa7.d(yk4Var));
            int iL = yk4Var.l(i);
            if (fE == 0.0f) {
                i2 += iL;
            } else if (fE > 0.0f) {
                f += fE;
                iMax = Math.max(iMax, Math.round(iL / fE));
            }
        }
        return ((list.size() - 1) * iB0) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb7)) {
            return false;
        }
        cb7 cb7Var = (cb7) obj;
        return js3.i(this.a, cb7Var.a) && js3.i(this.b, cb7Var.b);
    }

    @Override // defpackage.ya7
    public final dl4 f(b96[] b96VarArr, el4 el4Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return el4Var.D(i, i2, b.I(), new ak1(b96VarArr, this, i2, iArr));
    }

    @Override // defpackage.cl4
    public final int g(es3 es3Var, List list, int i) {
        int iB0 = es3Var.b0(this.a.e());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iB0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            yk4 yk4Var = (yk4) list.get(i2);
            float fE = xa7.e(xa7.d(yk4Var));
            if (fE == 0.0f) {
                int iMin2 = Math.min(yk4Var.n(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, yk4Var.a(iMin2));
            } else if (fE > 0.0f) {
                f += fE;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            yk4 yk4Var2 = (yk4) list.get(i3);
            float fE2 = xa7.e(xa7.d(yk4Var2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, yk4Var2.a(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ya7
    public final int h(b96 b96Var) {
        return b96Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.cl4
    public final int i(es3 es3Var, List list, int i) {
        int iB0 = es3Var.b0(this.a.e());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iB0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            yk4 yk4Var = (yk4) list.get(i2);
            float fE = xa7.e(xa7.d(yk4Var));
            if (fE == 0.0f) {
                int iMin2 = Math.min(yk4Var.n(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, yk4Var.P(iMin2));
            } else if (fE > 0.0f) {
                f += fE;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            yk4 yk4Var2 = (yk4) list.get(i3);
            float fE2 = xa7.e(xa7.d(yk4Var2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, yk4Var2.P(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ya7
    public final int j(b96 b96Var) {
        return b96Var.a;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
