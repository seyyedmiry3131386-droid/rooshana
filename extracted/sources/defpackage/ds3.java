package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.node.j;

/* JADX INFO: loaded from: classes.dex */
public final class ds3 extends fs3 {
    public IntrinsicSize p;
    public boolean q;

    @Override // defpackage.fs3
    public final long C0(yk4 yk4Var, long j) {
        int iP = this.p == IntrinsicSize.a ? yk4Var.P(h31.h(j)) : yk4Var.a(h31.h(j));
        if (iP < 0) {
            iP = 0;
        }
        if (iP < 0) {
            tn3.a("height must be >= 0");
        }
        return j31.h(0, Integer.MAX_VALUE, iP, iP);
    }

    @Override // defpackage.fs3
    public final boolean D0() {
        return this.q;
    }

    @Override // defpackage.fs3, defpackage.f14
    public final int b(j jVar, yk4 yk4Var, int i) {
        return this.p == IntrinsicSize.a ? yk4Var.P(i) : yk4Var.a(i);
    }

    @Override // defpackage.fs3, defpackage.f14
    public final int f(j jVar, yk4 yk4Var, int i) {
        return this.p == IntrinsicSize.a ? yk4Var.P(i) : yk4Var.a(i);
    }
}
