package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.bt2;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.o40;
import defpackage.vm0;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends gx4 implements gv1 {
    public final ab5 o;
    public boolean p;
    public boolean q;
    public boolean r;

    public g(ab5 ab5Var) {
        this.o = ab5Var;
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(androidx.compose.ui.node.i iVar) {
        iVar.a();
        vm0 vm0Var = iVar.a;
        if (this.p) {
            o40.l(iVar, zu0.b(0.3f, zu0.b), vm0Var.b.A(), 0.0f, 122);
        } else if (this.q || this.r) {
            o40.l(iVar, zu0.b(0.1f, zu0.b), vm0Var.b.A(), 0.0f, 122);
        }
    }

    @Override // defpackage.gx4
    public final void s0() {
        bt2.G(o0(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
    }
}
