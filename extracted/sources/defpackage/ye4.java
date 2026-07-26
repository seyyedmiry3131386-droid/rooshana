package defpackage;

import androidx.compose.ui.node.h;
import androidx.compose.ui.node.j;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.m;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ye4 extends j implements yk4 {
    public final m p;
    public LinkedHashMap r;
    public dl4 t;
    public final ib5 u;
    public long q = 0;
    public final ze4 s = new ze4(this);

    public ye4(m mVar) {
        this.p = mVar;
        ib5 ib5Var = xq5.a;
        this.u = new ib5();
    }

    public static final void y0(ye4 ye4Var, dl4 dl4Var) {
        LinkedHashMap linkedHashMap;
        if (dl4Var != null) {
            ye4Var.Y((((long) dl4Var.a()) & 4294967295L) | (((long) dl4Var.b()) << 32));
        } else {
            ye4Var.Y(0L);
        }
        if (!js3.i(ye4Var.t, dl4Var) && dl4Var != null && ((((linkedHashMap = ye4Var.r) != null && !linkedHashMap.isEmpty()) || !dl4Var.c().isEmpty()) && !js3.i(dl4Var.c(), ye4Var.r))) {
            k kVar = ye4Var.p.p.t().q;
            js3.m(kVar);
            kVar.q.g();
            LinkedHashMap linkedHashMap2 = ye4Var.r;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                ye4Var.r = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(dl4Var.c());
        }
        ye4Var.t = dl4Var;
    }

    public void A0() {
        r0().d();
    }

    public final void B0(long j) {
        if (!rq3.a(this.q, j)) {
            this.q = j;
            m mVar = this.p;
            k kVar = mVar.p.t().q;
            if (kVar != null) {
                kVar.m0();
            }
            j.v0(mVar);
        }
        if (this.k) {
            return;
        }
        m0(r0());
    }

    public final long C0(ye4 ye4Var, boolean z) {
        long jC = 0;
        ye4 ye4VarH0 = this;
        while (!ye4VarH0.equals(ye4Var)) {
            if (!ye4VarH0.i || !z) {
                jC = rq3.c(jC, ye4VarH0.q);
            }
            m mVar = ye4VarH0.p.s;
            js3.m(mVar);
            ye4VarH0 = mVar.H0();
            js3.m(ye4VarH0);
        }
        return jC;
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.p.O();
    }

    @Override // androidx.compose.ui.node.j, defpackage.es3
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.b96
    public final void W(long j, float f, dp2 dp2Var) {
        B0(j);
        if (this.j) {
            return;
        }
        A0();
    }

    @Override // androidx.compose.ui.node.j, defpackage.fl4
    public final h f0() {
        return this.p.p;
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.p.getDensity();
    }

    @Override // defpackage.es3
    public final LayoutDirection getLayoutDirection() {
        return this.p.p.B;
    }

    @Override // androidx.compose.ui.node.j
    public final j o0() {
        m mVar = this.p.r;
        if (mVar != null) {
            return mVar.H0();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.j
    public final v04 p0() {
        return this.s;
    }

    @Override // androidx.compose.ui.node.j
    public final boolean q0() {
        return this.t != null;
    }

    @Override // androidx.compose.ui.node.j
    public final dl4 r0() {
        dl4 dl4Var = this.t;
        if (dl4Var != null) {
            return dl4Var;
        }
        throw t61.r("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.j
    public final j s0() {
        m mVar = this.p.s;
        if (mVar != null) {
            return mVar.H0();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.j
    public final long t0() {
        return this.q;
    }

    @Override // defpackage.b96, defpackage.yk4
    public final Object v() {
        return this.p.v();
    }

    @Override // androidx.compose.ui.node.j
    public final void x0() {
        W(this.q, 0.0f, null);
    }

    public final long z0() {
        return (((long) this.b) & 4294967295L) | (((long) this.a) << 32);
    }
}
