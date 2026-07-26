package defpackage;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class xf2 implements ya7 {
    public final dv a;
    public final hv b;
    public final float c;
    public final x71 d;
    public final float e;
    public final int f;
    public final int g;
    public final tf2 h;

    public xf2(dv dvVar, hv hvVar, float f, x71 x71Var, float f2, int i, int i2, tf2 tf2Var) {
        this.a = dvVar;
        this.b = hvVar;
        this.c = f;
        this.d = x71Var;
        this.e = f2;
        this.f = i;
        this.g = i2;
        this.h = tf2Var;
    }

    public static int b(List list, int i, int i2, int i3, int i4, int i5, tf2 tf2Var) {
        boolean z;
        long jA = lq3.a(0, 0);
        if (!list.isEmpty()) {
            int i6 = Integer.MAX_VALUE;
            ff ffVar = new ff(i4, tf2Var, j31.a(0, i, 0, Integer.MAX_VALUE), i5, i2, i3);
            yk4 yk4Var = (yk4) a.q0(0, list);
            int iP = yk4Var != null ? yk4Var.P(i) : 0;
            int iL = yk4Var != null ? yk4Var.l(iP) : 0;
            int i7 = 0;
            if (ffVar.b(list.size() > 1, 0, lq3.a(i, Integer.MAX_VALUE), yk4Var == null ? null : new lq3(lq3.a(iL, iP)), 0, 0, 0, false, false).b) {
                tf2Var.getClass();
                FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.a;
                jA = jA;
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    int i14 = i8 - iL;
                    int i15 = i11 + 1;
                    int iMax = Math.max(i10, iP);
                    yk4 yk4Var2 = (yk4) a.q0(i15, list);
                    iP = yk4Var2 != null ? yk4Var2.P(i) : 0;
                    int iL2 = yk4Var2 != null ? yk4Var2.l(iP) + i2 : 0;
                    if (i11 + 2 < list.size()) {
                        i11 = i15;
                        z = true;
                    } else {
                        i11 = i15;
                        z = false;
                    }
                    int i16 = i11 - i13;
                    int i17 = i9;
                    int i18 = iL2;
                    of2 of2VarB = ffVar.b(z, i16, lq3.a(i14, i6), yk4Var2 == null ? null : new lq3(lq3.a(iL2, iP)), i17, i7, iMax, false, false);
                    if (of2VarB.a) {
                        int i19 = iMax + i3 + i7;
                        ffVar.a(of2VarB, yk4Var2 != null, i17, i19, i14, i16);
                        int i20 = i18 - i2;
                        i9 = i17 + 1;
                        if (of2VarB.b) {
                            i12 = i11;
                            i7 = i19;
                            break;
                        }
                        i8 = i;
                        i13 = i11;
                        iL = i20;
                        i7 = i19;
                        i10 = 0;
                    } else {
                        iL = i18;
                        i8 = i14;
                        i9 = i17;
                        i10 = iMax;
                    }
                    i12 = i11;
                    i6 = Integer.MAX_VALUE;
                }
                jA = lq3.a(i7 - i3, i12);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // defpackage.ya7
    public final void a(int i, el4 el4Var, int[] iArr, int[] iArr2) {
        this.a.k(el4Var, i, iArr, el4Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.ya7
    public final long c(int i, int i2, boolean z, int i3) {
        cb7 cb7Var = bb7.a;
        return !z ? j31.a(i, i2, 0, i3) : vy2.y(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf2)) {
            return false;
        }
        xf2 xf2Var = (xf2) obj;
        return this.a.equals(xf2Var.a) && this.b.equals(xf2Var.b) && au1.b(this.c, xf2Var.c) && this.d.equals(xf2Var.d) && au1.b(this.e, xf2Var.e) && this.f == xf2Var.f && this.g == xf2Var.g && js3.i(this.h, xf2Var.h);
    }

    @Override // defpackage.ya7
    public final dl4 f(final b96[] b96VarArr, el4 el4Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final LayoutDirection layoutDirection = LayoutDirection.a;
        return el4Var.D(i, i2, b.I(), new dp2() { // from class: wf2
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                ok4 ok4Var;
                a96 a96Var = (a96) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    b96 b96Var = b96VarArr[i8];
                    js3.m(b96Var);
                    Object objV = b96Var.v();
                    ab7 ab7Var = objV instanceof ab7 ? (ab7) objV : null;
                    if (ab7Var == null || (ok4Var = ab7Var.c) == null) {
                        ok4Var = this.d;
                    }
                    a96Var.g(b96Var, iArr[i8 - i7], ok4Var.k(i2, layoutDirection, b96Var) + i6, 0.0f);
                }
                return tx8.a;
            }
        });
    }

    @Override // defpackage.ya7
    public final int h(b96 b96Var) {
        return b96Var.T();
    }

    public final int hashCode() {
        return this.h.hashCode() + ((((dw1.g(this.e, (this.d.hashCode() + dw1.g(this.c, (this.b.hashCode() + ((this.a.hashCode() + 38161) * 31)) * 31, 31)) * 31, 31) + this.f) * 31) + this.g) * 31);
    }

    @Override // defpackage.ya7
    public final int j(b96 b96Var) {
        return b96Var.U();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + ((Object) au1.c(this.c)) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + ((Object) au1.c(this.e)) + ", maxItemsInMainAxis=" + this.f + ", maxLines=" + this.g + ", overflow=" + this.h + ')';
    }
}
