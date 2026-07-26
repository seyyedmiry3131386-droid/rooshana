package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusStateImpl;
import defpackage.au1;
import defpackage.b96;
import defpackage.bt2;
import defpackage.ck1;
import defpackage.dl4;
import defpackage.dt2;
import defpackage.el4;
import defpackage.ev2;
import defpackage.f14;
import defpackage.fg2;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.h31;
import defpackage.j31;
import defpackage.li1;
import defpackage.m22;
import defpackage.n08;
import defpackage.nm5;
import defpackage.o40;
import defpackage.ok4;
import defpackage.q;
import defpackage.s08;
import defpackage.tt3;
import defpackage.vj3;
import defpackage.vm0;
import defpackage.wb5;
import defpackage.wi4;
import defpackage.wv8;
import defpackage.xv3;
import defpackage.y40;
import defpackage.yk4;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends gx4 implements f14, gv1, fg2 {
    public int o;
    public float p;
    public li1 t;
    public androidx.compose.ui.graphics.layer.a u;
    public final wb5 v;
    public final ck1 y;
    public final n08 q = androidx.compose.runtime.g.e(0);
    public final n08 r = androidx.compose.runtime.g.e(0);
    public final wb5 s = androidx.compose.runtime.g.h(Boolean.FALSE);
    public final wb5 w = androidx.compose.runtime.g.h(new wi4());
    public final androidx.compose.animation.core.a x = dt2.a(0.0f);

    public k(int i, vj3 vj3Var, float f) {
        this.o = i;
        this.p = f;
        this.v = androidx.compose.runtime.g.h(vj3Var);
        this.y = androidx.compose.runtime.g.c(new xv3(vj3Var, this, 3));
    }

    public final int C0() {
        return this.r.h();
    }

    public final int D0() {
        return this.q.h();
    }

    public final int E0() {
        return ((Number) this.y.getValue()).intValue();
    }

    public final void F0() {
        li1 li1Var = this.t;
        if (li1Var != null) {
            li1Var.g(null);
        }
        if (this.n) {
            this.t = bt2.G(o0(), null, null, new MarqueeModifierNode$restartAnimation$1(li1Var, this, null), 3);
        }
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(androidx.compose.ui.node.i iVar) {
        float fD0;
        float fFloatValue;
        int iC0;
        int iA = au1.a(this.p, 0);
        androidx.compose.animation.core.a aVar = this.x;
        if (iA > 0) {
            int iOrdinal = iVar.getLayoutDirection().ordinal();
            if (iOrdinal == 0) {
                fD0 = ((Number) aVar.d()).floatValue();
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                fFloatValue = (-((Number) aVar.d()).floatValue()) + (D0() * 2) + E0();
                iC0 = C0();
                fD0 = fFloatValue - iC0;
            }
        } else {
            int iOrdinal2 = iVar.getLayoutDirection().ordinal();
            if (iOrdinal2 == 0) {
                fD0 = (-((Number) aVar.d()).floatValue()) + D0() + E0();
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                fFloatValue = ((Number) aVar.d()).floatValue() + D0();
                iC0 = C0();
                fD0 = fFloatValue - iC0;
            }
        }
        boolean z = fD0 < ((float) D0());
        boolean z2 = ((float) C0()) + fD0 > ((float) (E0() + D0()));
        float fE0 = E0() + D0();
        vm0 vm0Var = iVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (vm0Var.b.A() & 4294967295L));
        androidx.compose.ui.graphics.layer.a aVar2 = this.u;
        if (aVar2 != null) {
            iVar.e(aVar2, (((long) D0()) << 32) | (((long) ok4.V(fIntBitsToFloat)) & 4294967295L), new m22(17, iVar));
        }
        float fC0 = C0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iVar.d() & 4294967295L));
        wv8 wv8Var = vm0Var.b;
        long jA = wv8Var.A();
        wv8Var.v().e();
        try {
            ((wv8) ((nm5) wv8Var.b).b).v().m(0.0f, 0.0f, fC0, fIntBitsToFloat2, 1);
            float f = -fD0;
            ((nm5) iVar.a.b.b).z(f, 0.0f);
            try {
                androidx.compose.ui.graphics.layer.a aVar3 = this.u;
                if (aVar3 != null) {
                    if (z) {
                        tt3.v(iVar, aVar3);
                    }
                    if (z2) {
                        ((nm5) iVar.a.b.b).z(fE0, 0.0f);
                        try {
                            tt3.v(iVar, aVar3);
                            ((nm5) iVar.a.b.b).z(-fE0, -0.0f);
                        } finally {
                        }
                    }
                } else {
                    if (z) {
                        iVar.a();
                    }
                    if (z2) {
                        ((nm5) iVar.a.b.b).z(fE0, 0.0f);
                        try {
                            iVar.a();
                            ((nm5) iVar.a.b.b).z(-fE0, -0.0f);
                        } finally {
                        }
                    }
                }
                ((nm5) iVar.a.b.b).z(-f, -0.0f);
            } catch (Throwable th) {
                ((nm5) iVar.a.b.b).z(-f, -0.0f);
                throw th;
            }
        } finally {
            o40.F(wv8Var, jA);
        }
    }

    @Override // defpackage.fg2
    public final void U(FocusStateImpl focusStateImpl) {
        ((s08) this.s).setValue(Boolean.valueOf(focusStateImpl.a()));
    }

    @Override // defpackage.f14
    public final int a(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return 0;
    }

    @Override // defpackage.f14
    public final int b(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return yk4Var.P(Integer.MAX_VALUE);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        b96 b96VarT = yk4Var.t(h31.a(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        this.r.i(j31.g(b96VarT.a, j));
        this.q.i(b96VarT.a);
        return el4Var.D(C0(), b96VarT.b, kotlin.collections.b.I(), new q(b96VarT, 7));
    }

    @Override // defpackage.f14
    public final int e(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return yk4Var.n(i);
    }

    @Override // defpackage.f14
    public final int f(androidx.compose.ui.node.j jVar, yk4 yk4Var, int i) {
        return yk4Var.a(Integer.MAX_VALUE);
    }

    @Override // defpackage.gx4
    public final void s0() {
        androidx.compose.ui.graphics.layer.a aVar = this.u;
        ev2 ev2VarF = y40.F(this);
        if (aVar != null) {
            ev2VarF.a(aVar);
        }
        this.u = ev2VarF.b();
        F0();
    }

    @Override // defpackage.gx4
    public final void u0() {
        li1 li1Var = this.t;
        if (li1Var != null) {
            li1Var.g(null);
        }
        this.t = null;
        androidx.compose.ui.graphics.layer.a aVar = this.u;
        if (aVar != null) {
            y40.F(this).a(aVar);
            this.u = null;
        }
    }
}
