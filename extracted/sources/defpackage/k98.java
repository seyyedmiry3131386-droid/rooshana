package defpackage;

import androidx.compose.foundation.text.handwriting.a;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;

/* JADX INFO: loaded from: classes.dex */
public final class k98 extends ti1 implements dh6, fg2, sg2 {
    public bp2 q;
    public boolean r;
    public final f s;

    public k98(bp2 bp2Var) {
        this.q = bp2Var;
        a aVar = new a(this);
        vg6 vg6Var = bd8.a;
        f fVar = new f(null, null, aVar);
        C0(fVar);
        this.s = fVar;
    }

    @Override // defpackage.dh6
    public final void B() {
        this.s.B();
    }

    @Override // defpackage.dh6
    public final /* synthetic */ void I() {
    }

    @Override // defpackage.fg2
    public final void U(FocusStateImpl focusStateImpl) {
        this.r = focusStateImpl.b();
    }

    @Override // defpackage.dh6
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // defpackage.dh6
    public final void i0() {
        B();
    }

    @Override // defpackage.dh6
    public final long m() {
        fu1 fu1Var = j98.a;
        qj1 qj1Var = y40.H(this).A;
        fu1Var.getClass();
        int i = ro8.b;
        return ql3.q(qj1Var.b0(fu1Var.a), qj1Var.b0(fu1Var.b), qj1Var.b0(fu1Var.c), qj1Var.b0(fu1Var.d));
    }

    @Override // defpackage.dh6
    public final void t(vg6 vg6Var, PointerEventPass pointerEventPass, long j) {
        this.s.t(vg6Var, pointerEventPass, j);
    }

    @Override // defpackage.gx4
    public final void t0() {
        B();
    }
}
