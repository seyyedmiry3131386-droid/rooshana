package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.node.j;

/* JADX INFO: loaded from: classes.dex */
public final class hs3 extends fs3 {
    public IntrinsicSize p;
    public boolean q;

    @Override // defpackage.fs3
    public final long C0(yk4 yk4Var, long j) {
        int iL = this.p == IntrinsicSize.a ? yk4Var.l(h31.g(j)) : yk4Var.n(h31.g(j));
        if (iL < 0) {
            iL = 0;
        }
        if (iL < 0) {
            tn3.a("width must be >= 0");
        }
        return j31.h(iL, iL, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.fs3
    public final boolean D0() {
        return this.q;
    }

    @Override // defpackage.fs3, defpackage.f14
    public final int a(j jVar, yk4 yk4Var, int i) {
        return this.p == IntrinsicSize.a ? yk4Var.l(i) : yk4Var.n(i);
    }

    @Override // defpackage.fs3, defpackage.f14
    public final int e(j jVar, yk4 yk4Var, int i) {
        return this.p == IntrinsicSize.a ? yk4Var.l(i) : yk4Var.n(i);
    }
}
