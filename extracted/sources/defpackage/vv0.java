package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class vv0 implements cl4, ya7 {
    public final hv a;
    public final ab0 b;

    public vv0(hv hvVar, ab0 ab0Var) {
        this.a = hvVar;
        this.b = ab0Var;
    }

    @Override // defpackage.ya7
    public final void a(int i, el4 el4Var, int[] iArr, int[] iArr2) {
        this.a.o(i, el4Var, iArr, iArr2);
    }

    @Override // defpackage.cl4
    public final int b(es3 es3Var, List list, int i) {
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
                int iMin2 = Math.min(yk4Var.a(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, yk4Var.n(iMin2));
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
                iMax = Math.max(iMax, yk4Var2.n(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ya7
    public final long c(int i, int i2, boolean z, int i3) {
        return !z ? j31.a(0, i3, i, i2) : vy2.x(0, i3, i, i2);
    }

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        return za7.t(this, h31.i(j), h31.j(j), h31.g(j), h31.h(j), el4Var.b0(this.a.e()), el4Var, list, new b96[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.cl4
    public final int e(es3 es3Var, List list, int i) {
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
                int iMin2 = Math.min(yk4Var.a(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, yk4Var.l(iMin2));
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
                iMax = Math.max(iMax, yk4Var2.l(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0)) {
            return false;
        }
        vv0 vv0Var = (vv0) obj;
        return this.a.equals(vv0Var.a) && this.b.equals(vv0Var.b);
    }

    @Override // defpackage.ya7
    public final dl4 f(final b96[] b96VarArr, final el4 el4Var, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return el4Var.D(i2, i, b.I(), new dp2() { // from class: uv0
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96 a96Var = (a96) obj;
                b96[] b96VarArr2 = b96VarArr;
                int length = b96VarArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    b96 b96Var = b96VarArr2[i6];
                    int i8 = i7 + 1;
                    js3.m(b96Var);
                    Object objV = b96Var.v();
                    ab7 ab7Var = objV instanceof ab7 ? (ab7) objV : null;
                    LayoutDirection layoutDirection = el4Var.getLayoutDirection();
                    ok4 ok4Var = ab7Var != null ? ab7Var.c : null;
                    int i9 = i2;
                    a96Var.g(b96Var, ok4Var != null ? ok4Var.k(i9, layoutDirection, b96Var) : this.b.a(b96Var.a, i9, layoutDirection), iArr[i7], 0.0f);
                    i6++;
                    i7 = i8;
                }
                return tx8.a;
            }
        });
    }

    @Override // defpackage.cl4
    public final int g(es3 es3Var, List list, int i) {
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
            int iA = yk4Var.a(i);
            if (fE == 0.0f) {
                i2 += iA;
            } else if (fE > 0.0f) {
                f += fE;
                iMax = Math.max(iMax, Math.round(iA / fE));
            }
        }
        return ((list.size() - 1) * iB0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.ya7
    public final int h(b96 b96Var) {
        return b96Var.a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.cl4
    public final int i(es3 es3Var, List list, int i) {
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
            int iP = yk4Var.P(i);
            if (fE == 0.0f) {
                i2 += iP;
            } else if (fE > 0.0f) {
                f += fE;
                iMax = Math.max(iMax, Math.round(iP / fE));
            }
        }
        return ((list.size() - 1) * iB0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.ya7
    public final int j(b96 b96Var) {
        return b96Var.b;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
