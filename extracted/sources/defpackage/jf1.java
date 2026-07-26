package defpackage;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;

/* JADX INFO: loaded from: classes.dex */
public final class jf1 implements yk4 {
    public final yk4 a;
    public final IntrinsicMinMax b;
    public final IntrinsicWidthHeight c;

    public jf1(yk4 yk4Var, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.a = yk4Var;
        this.b = intrinsicMinMax;
        this.c = intrinsicWidthHeight;
    }

    @Override // defpackage.yk4
    public final int P(int i) {
        return this.a.P(i);
    }

    @Override // defpackage.yk4
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.yk4
    public final int l(int i) {
        return this.a.l(i);
    }

    @Override // defpackage.yk4
    public final int n(int i) {
        return this.a.n(i);
    }

    @Override // defpackage.yk4
    public final b96 t(long j) {
        IntrinsicWidthHeight intrinsicWidthHeight = this.c;
        IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.a;
        IntrinsicMinMax intrinsicMinMax = this.b;
        yk4 yk4Var = this.a;
        if (intrinsicWidthHeight == intrinsicWidthHeight2) {
            return new nd2(intrinsicMinMax == IntrinsicMinMax.b ? yk4Var.n(h31.g(j)) : yk4Var.l(h31.g(j)), h31.c(j) ? h31.g(j) : 32767, 0);
        }
        return new nd2(h31.d(j) ? h31.h(j) : 32767, intrinsicMinMax == IntrinsicMinMax.b ? yk4Var.a(h31.h(j)) : yk4Var.P(h31.h(j)), 0);
    }

    @Override // defpackage.yk4
    public final Object v() {
        return this.a.v();
    }
}
