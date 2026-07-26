package defpackage;

import androidx.compose.foundation.text.input.internal.a;
import androidx.compose.foundation.text.selection.f;
import androidx.compose.runtime.g;
import androidx.compose.ui.node.m;

/* JADX INFO: loaded from: classes.dex */
public final class q44 extends gx4 implements m01, rt2, ri1 {
    public a o;
    public x44 p;
    public f q;
    public final wb5 r = g.h(null);

    public q44(a aVar, x44 x44Var, f fVar) {
        this.o = aVar;
        this.p = x44Var;
        this.q = fVar;
    }

    @Override // defpackage.rt2
    public final void n0(m mVar) {
        ((s08) this.r).setValue(mVar);
    }

    @Override // defpackage.gx4
    public final void s0() {
        a aVar = this.o;
        if (aVar.a != null) {
            un3.c("Expected textInputModifierNode to be null");
        }
        aVar.a = this;
    }

    @Override // defpackage.gx4
    public final void u0() {
        this.o.k(this);
    }
}
