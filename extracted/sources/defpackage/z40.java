package defpackage;

import androidx.compose.ui.node.i;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class z40 extends gx4 implements gv1, jr5, in7 {
    public long o;
    public ch0 p;
    public float q;
    public xr7 r;
    public long s;
    public LayoutDirection t;
    public rq4 u;
    public xr7 v;
    public rq4 w;

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        rq4 rq4Var;
        if (this.r == tt3.d) {
            if (!zu0.c(this.o, zu0.h)) {
                o40.l(iVar, this.o, 0L, 0.0f, 126);
            }
            ch0 ch0Var = this.p;
            if (ch0Var != null) {
                o40.k(iVar, ch0Var, 0L, 0L, this.q, null, 118);
            }
        } else {
            vm0 vm0Var = iVar.a;
            if (ey7.b(vm0Var.b.A(), this.s) && iVar.getLayoutDirection() == this.t && js3.i(this.v, this.r)) {
                rq4Var = this.u;
                js3.m(rq4Var);
            } else {
                br9.G(this, new d(this, iVar, 12));
                rq4Var = this.w;
                this.w = null;
            }
            this.u = rq4Var;
            this.s = vm0Var.b.A();
            this.t = iVar.getLayoutDirection();
            this.v = this.r;
            js3.m(rq4Var);
            if (!zu0.c(this.o, zu0.h)) {
                wn5.C(iVar, rq4Var, this.o);
            }
            rq4 rq4Var2 = rq4Var;
            ch0 ch0Var2 = this.p;
            if (ch0Var2 != null) {
                wn5.B(iVar, rq4Var2, ch0Var2, this.q, null, 56);
            }
        }
        iVar.a();
    }

    @Override // defpackage.jr5
    public final void Y() {
        this.s = 9205357640488583168L;
        this.t = null;
        this.u = null;
        this.v = null;
        rf0.z(this);
    }

    @Override // defpackage.in7
    public final boolean h() {
        return false;
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        f.g(nn7Var, this.r);
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }
}
