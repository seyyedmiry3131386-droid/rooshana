package defpackage;

import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class eg0 implements cl4 {
    public final qd a;
    public final boolean b;

    public eg0(qd qdVar, boolean z) {
        this.a = qdVar;
        this.b = z;
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int b(es3 es3Var, List list, int i) {
        return bl4.c(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final dl4 d(final el4 el4Var, final List list, long j) {
        int iJ;
        int i;
        b96 b96VarT;
        if (list.isEmpty()) {
            return el4Var.D(h31.j(j), h31.i(j), b.I(), new k7(26));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final yk4 yk4Var = (yk4) list.get(0);
            Object objV = yk4Var.v();
            zf0 zf0Var = objV instanceof zf0 ? (zf0) objV : null;
            if (zf0Var != null ? zf0Var.p : false) {
                iJ = h31.j(j);
                i = h31.i(j);
                int iJ2 = h31.j(j);
                int i2 = h31.i(j);
                if (!((i2 >= 0) & (iJ2 >= 0))) {
                    tn3.a("width and height must be >= 0");
                }
                b96VarT = yk4Var.t(j31.h(iJ2, iJ2, i2, i2));
            } else {
                b96VarT = yk4Var.t(j2);
                iJ = Math.max(h31.j(j), b96VarT.a);
                i = Math.max(h31.i(j), b96VarT.b);
            }
            final int i3 = i;
            final int i4 = iJ;
            final b96 b96Var = b96VarT;
            return el4Var.D(i4, i3, b.I(), new dp2() { // from class: cg0
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    bg0.b((a96) obj, b96Var, yk4Var, el4Var.getLayoutDirection(), i4, i3, this.a);
                    return tx8.a;
                }
            });
        }
        final b96[] b96VarArr = new b96[list.size()];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.a = h31.j(j);
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.a = h31.i(j);
        int size = list.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            yk4 yk4Var2 = (yk4) list.get(i5);
            Object objV2 = yk4Var2.v();
            zf0 zf0Var2 = objV2 instanceof zf0 ? (zf0) objV2 : null;
            if (zf0Var2 != null ? zf0Var2.p : false) {
                z = true;
            } else {
                b96 b96VarT2 = yk4Var2.t(j2);
                b96VarArr[i5] = b96VarT2;
                ref$IntRef.a = Math.max(ref$IntRef.a, b96VarT2.a);
                ref$IntRef2.a = Math.max(ref$IntRef2.a, b96VarT2.b);
            }
        }
        if (z) {
            int i6 = ref$IntRef.a;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = ref$IntRef2.a;
            long jA = j31.a(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                yk4 yk4Var3 = (yk4) list.get(i9);
                Object objV3 = yk4Var3.v();
                zf0 zf0Var3 = objV3 instanceof zf0 ? (zf0) objV3 : null;
                if (zf0Var3 != null ? zf0Var3.p : false) {
                    b96VarArr[i9] = yk4Var3.t(jA);
                }
            }
        }
        return el4Var.D(ref$IntRef.a, ref$IntRef2.a, b.I(), new dp2() { // from class: dg0
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96 a96Var = (a96) obj;
                b96[] b96VarArr2 = b96VarArr;
                int length = b96VarArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i10;
                    b96 b96Var2 = b96VarArr2[i11];
                    js3.n(b96Var2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    bg0.b(a96Var, b96Var2, (yk4) list.get(i12), el4Var.getLayoutDirection(), ref$IntRef.a, ref$IntRef2.a, this.a);
                    i11++;
                    i10 = i12 + 1;
                }
                return tx8.a;
            }
        });
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int e(es3 es3Var, List list, int i) {
        return bl4.e(this, es3Var, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg0)) {
            return false;
        }
        eg0 eg0Var = (eg0) obj;
        return js3.i(this.a, eg0Var.a) && this.b == eg0Var.b;
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int g(es3 es3Var, List list, int i) {
        return bl4.b(this, es3Var, list, i);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int i(es3 es3Var, List list, int i) {
        return bl4.d(this, es3Var, list, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return bl4.A(sb, this.b, ')');
    }
}
