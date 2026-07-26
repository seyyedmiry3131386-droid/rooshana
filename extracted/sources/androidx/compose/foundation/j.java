package androidx.compose.foundation;

import android.view.View;
import androidx.compose.ui.node.m;
import defpackage.br9;
import defpackage.bt2;
import defpackage.ck1;
import defpackage.dt2;
import defpackage.eu1;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.in7;
import defpackage.jr5;
import defpackage.nn7;
import defpackage.nr5;
import defpackage.pg4;
import defpackage.qg4;
import defpackage.qj1;
import defpackage.r96;
import defpackage.rf0;
import defpackage.rt2;
import defpackage.s08;
import defpackage.s96;
import defpackage.t96;
import defpackage.tc7;
import defpackage.th0;
import defpackage.tt3;
import defpackage.tu1;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.y40;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public final class j extends gx4 implements rt2, gv1, in7, jr5 {
    public tu1 o;
    public tc7 p;
    public s96 q;
    public View r;
    public qj1 s;
    public r96 t;
    public ck1 v;
    public zq3 x;
    public kotlinx.coroutines.channels.a y;
    public final wb5 u = androidx.compose.runtime.g.g(null, th0.p);
    public long w = 9205357640488583168L;

    public j(tu1 tu1Var, tc7 tc7Var, s96 s96Var) {
        this.o = tu1Var;
        this.p = tc7Var;
        this.q = s96Var;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    public final long C0() {
        if (this.v == null) {
            this.v = androidx.compose.runtime.g.c(new pg4(this, 2));
        }
        ck1 ck1Var = this.v;
        if (ck1Var != null) {
            return ((nr5) ck1Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void D0() {
        r96 r96Var = this.t;
        if (r96Var != null) {
            ((t96) r96Var).b();
        }
        View viewJ = this.r;
        if (viewJ == null) {
            viewJ = rf0.J(this);
        }
        this.r = viewJ;
        qj1 qj1Var = this.s;
        if (qj1Var == null) {
            qj1Var = y40.H(this).A;
        }
        this.s = qj1Var;
        this.t = this.q.b(viewJ, qj1Var);
        F0();
    }

    public final void E0() {
        qj1 qj1Var = this.s;
        if (qj1Var == null) {
            qj1Var = y40.H(this).A;
            this.s = qj1Var;
        }
        long j = ((nr5) this.o.invoke(qj1Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & C0()) == 9205357640488583168L) {
            this.w = 9205357640488583168L;
            r96 r96Var = this.t;
            if (r96Var != null) {
                ((t96) r96Var).b();
                return;
            }
            return;
        }
        this.w = nr5.g(C0(), j);
        if (this.t == null) {
            D0();
        }
        r96 r96Var2 = this.t;
        if (r96Var2 != null) {
            r96Var2.a(this.w, 9205357640488583168L);
        }
        F0();
    }

    public final void F0() {
        qj1 qj1Var;
        r96 r96Var = this.t;
        if (r96Var == null || (qj1Var = this.s) == null) {
            return;
        }
        t96 t96Var = (t96) r96Var;
        if (zq3.a(t96Var.c(), this.x)) {
            return;
        }
        this.p.invoke(new eu1(qj1Var.o(tt3.M(t96Var.c()))));
        this.x = new zq3(t96Var.c());
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(androidx.compose.ui.node.i iVar) {
        iVar.a();
        kotlinx.coroutines.channels.a aVar = this.y;
        if (aVar != null) {
            aVar.o(tx8.a);
        }
    }

    @Override // defpackage.jr5
    public final void Y() {
        br9.G(this, new pg4(this, 0));
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        nn7Var.a(qg4.a, new pg4(this, 1));
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.rt2
    public final void n0(m mVar) {
        ((s08) this.u).setValue(mVar);
    }

    @Override // defpackage.gx4
    public final void s0() {
        Y();
        this.y = dt2.b(0, 7, null);
        bt2.G(o0(), null, CoroutineStart.d, new MagnifierNode$onAttach$1(this, null), 1);
    }

    @Override // defpackage.gx4
    public final void u0() {
        r96 r96Var = this.t;
        if (r96Var != null) {
            ((t96) r96Var).b();
        }
        this.t = null;
    }
}
