package androidx.compose.ui.node;

import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.a96;
import defpackage.b96;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.h31;
import defpackage.i14;
import defpackage.j31;
import defpackage.js3;
import defpackage.kb5;
import defpackage.l14;
import defpackage.m14;
import defpackage.n14;
import defpackage.rn3;
import defpackage.rq3;
import defpackage.sd;
import defpackage.tx8;
import defpackage.wu8;
import defpackage.yk4;
import defpackage.z4;
import defpackage.zb5;
import defpackage.zq3;
import defpackage.zy4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b96 implements yk4, sd, zy4 {
    public float D;
    public boolean E;
    public dp2 F;
    public float H;
    public boolean J;
    public final n14 f;
    public boolean g;
    public boolean j;
    public boolean k;
    public dp2 n;
    public float o;
    public Object q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean z;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public LayoutNode$UsageByParent l = LayoutNode$UsageByParent.c;
    public long m = 0;
    public boolean p = true;
    public final l14 w = new l14(this, 0);
    public final zb5 x = new zb5(0, new l[16]);
    public boolean y = true;
    public long A = j31.b(0, 0, 15);
    public final bp2 B = new bp2() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            l lVar = this.g;
            lVar.f.a().t(lVar.A);
            return tx8.a;
        }
    };
    public final bp2 C = new bp2() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            l lVar = this.g;
            n14 n14Var = lVar.f;
            n14Var.i = 0;
            zb5 zb5VarL = n14Var.a.L();
            Object[] objArr = zb5VarL.a;
            int i = zb5VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                l lVarZ = ((h) objArr[i2]).z();
                lVarZ.h = lVarZ.i;
                lVarZ.i = Integer.MAX_VALUE;
                lVarZ.s = false;
                if (lVarZ.l == LayoutNode$UsageByParent.b) {
                    lVarZ.l = LayoutNode$UsageByParent.c;
                }
            }
            lVar.e(new dp2() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    ((sd) obj).c().getClass();
                    return tx8.a;
                }
            });
            if (lVar.f().k) {
                kb5 kb5Var = (kb5) n14Var.a.q();
                int i3 = ((zb5) kb5Var.b).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((m) ((h) kb5Var.get(i4)).H.e).k = true;
                }
            }
            lVar.f().r0().d();
            if (lVar.f().k) {
                kb5 kb5Var2 = (kb5) n14Var.a.q();
                int i5 = ((zb5) kb5Var2.b).c;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((m) ((h) kb5Var2.get(i6)).H.e).k = false;
                }
            }
            h hVar = n14Var.a;
            zb5 zb5VarL2 = hVar.L();
            Object[] objArr2 = zb5VarL2.a;
            int i7 = zb5VarL2.c;
            for (int i8 = 0; i8 < i7; i8++) {
                h hVar2 = (h) objArr2[i8];
                if (hVar2.z().h != hVar2.G()) {
                    hVar.i0();
                    hVar.O();
                    if (hVar2.G() == Integer.MAX_VALUE) {
                        if (hVar2.t().c || wu8.D(hVar2)) {
                            k kVarY = hVar2.y();
                            js3.m(kVarY);
                            kVarY.i0(false);
                        }
                        hVar2.z().k0();
                    }
                }
            }
            lVar.e(new dp2() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.4
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    sd sdVar = (sd) obj;
                    a aVarC = sdVar.c();
                    sdVar.c().getClass();
                    aVarC.c = false;
                    return tx8.a;
                }
            });
            return tx8.a;
        }
    };
    public long G = 0;
    public final bp2 I = new bp2() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            a96 placementScope;
            l lVar = this.g;
            n14 n14Var = lVar.f;
            m mVar = n14Var.a().s;
            if (mVar == null || (placementScope = mVar.l) == null) {
                placementScope = m14.a(n14Var.a).getPlacementScope();
            }
            dp2 dp2Var = lVar.F;
            if (dp2Var == null) {
                m mVarA = n14Var.a();
                long j = lVar.G;
                float f = lVar.H;
                placementScope.getClass();
                a96.a(placementScope, mVarA);
                mVarA.W(rq3.c(j, mVarA.e), f, null);
            } else {
                m mVarA2 = n14Var.a();
                long j2 = lVar.G;
                float f2 = lVar.H;
                placementScope.getClass();
                a96.a(placementScope, mVarA2);
                mVarA2.W(rq3.c(j2, mVarA2.e), f2, dp2Var);
            }
            return tx8.a;
        }
    };

    public l(n14 n14Var) {
        this.f = n14Var;
    }

    @Override // defpackage.sd
    public final void B() {
        this.z = true;
        l14 l14Var = this.w;
        l14Var.i();
        boolean z = this.u;
        n14 n14Var = this.f;
        if (z) {
            zb5 zb5VarL = n14Var.a.L();
            Object[] objArr = zb5VarL.a;
            int i = zb5VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                h hVar = (h) objArr[i2];
                if (hVar.A() && hVar.B() == LayoutNode$UsageByParent.a && h.l0(hVar)) {
                    h.s0(n14Var.a, false, 7);
                }
            }
        }
        if (this.v || (!f().k && this.u)) {
            this.u = false;
            LayoutNode$LayoutState layoutNode$LayoutState = n14Var.d;
            n14Var.d = LayoutNode$LayoutState.c;
            n14Var.g(false);
            h hVar2 = n14Var.a;
            p snapshotObserver = m14.a(hVar2).getSnapshotObserver();
            snapshotObserver.a.d(hVar2, snapshotObserver.e, this.C);
            n14Var.d = layoutNode$LayoutState;
            this.v = false;
        }
        if (l14Var.b && l14Var.f()) {
            l14Var.h();
        }
        this.z = false;
    }

    @Override // defpackage.sd
    public final void N() {
        h.s0(this.f.a, false, 7);
    }

    @Override // defpackage.yk4
    public final int P(int i) {
        n14 n14Var = this.f;
        if (!wu8.D(n14Var.a)) {
            n0();
            return n14Var.a().P(i);
        }
        k kVar = n14Var.q;
        js3.m(kVar);
        return kVar.P(i);
    }

    @Override // defpackage.b96
    public final int T() {
        return this.f.a().T();
    }

    @Override // defpackage.b96
    public final int U() {
        return this.f.a().U();
    }

    @Override // defpackage.b96
    public final void W(long j, float f, dp2 dp2Var) throws Throwable {
        a96 placementScope;
        n14 n14Var = this.f;
        h hVar = n14Var.a;
        h hVar2 = n14Var.a;
        try {
            this.s = true;
            if (!rq3.a(j, this.m) || this.J) {
                if (n14Var.k || n14Var.j || this.J) {
                    this.u = true;
                    this.J = false;
                }
                m0();
            }
            k kVar = n14Var.q;
            if (kVar != null) {
                n14 n14Var2 = kVar.f;
                if (kVar.p == LookaheadPassDelegate$PlacedState.c && !wu8.D(n14Var2.a)) {
                    n14Var2.c = true;
                }
            }
            k kVar2 = n14Var.q;
            if (kVar2 != null && kVar2.e0()) {
                m mVar = n14Var.a().s;
                if (mVar == null || (placementScope = mVar.l) == null) {
                    placementScope = m14.a(hVar2).getPlacementScope();
                }
                k kVar3 = n14Var.q;
                js3.m(kVar3);
                h hVarF = hVar2.F();
                if (hVarF != null) {
                    hVarF.t().h = 0;
                }
                kVar3.i = Integer.MAX_VALUE;
                placementScope.g(kVar3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            k kVar4 = n14Var.q;
            if (kVar4 != null && !kVar4.k) {
                rn3.b("Error: Placement happened before lookahead.");
            }
            p0(j, f, dp2Var);
        } catch (Throwable th) {
            hVar.v0(th);
            throw null;
        }
    }

    @Override // defpackage.yk4
    public final int a(int i) {
        n14 n14Var = this.f;
        if (!wu8.D(n14Var.a)) {
            n0();
            return n14Var.a().a(i);
        }
        k kVar = n14Var.q;
        js3.m(kVar);
        return kVar.a(i);
    }

    @Override // defpackage.sd
    public final a c() {
        return this.w;
    }

    @Override // defpackage.sd
    public final void e(dp2 dp2Var) {
        zb5 zb5VarL = this.f.a.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            dp2Var.invoke(((h) objArr[i2]).t().p);
        }
    }

    public final List e0() {
        n14 n14Var = this.f;
        n14Var.a.D0();
        boolean z = this.y;
        zb5 zb5Var = this.x;
        if (!z) {
            return zb5Var.f();
        }
        h hVar = n14Var.a;
        zb5 zb5VarL = hVar.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            h hVar2 = (h) objArr[i2];
            if (zb5Var.c <= i2) {
                zb5Var.b(hVar2.t().p);
            } else {
                l lVar = hVar2.t().p;
                Object[] objArr2 = zb5Var.a;
                Object obj = objArr2[i2];
                objArr2[i2] = lVar;
            }
        }
        zb5Var.m(((zb5) ((kb5) hVar.q()).b).c, zb5Var.c);
        this.y = false;
        return zb5Var.f();
    }

    @Override // defpackage.sd
    public final e f() {
        return (e) this.f.a.H.d;
    }

    @Override // defpackage.sd
    public final sd g() {
        n14 n14VarT;
        h hVarF = this.f.a.F();
        if (hVarF == null || (n14VarT = hVarF.t()) == null) {
            return null;
        }
        return n14VarT.p;
    }

    public final void i0() {
        boolean z = this.r;
        this.r = true;
        n14 n14Var = this.f;
        h hVar = n14Var.a;
        z4 z4Var = hVar.H;
        if (!z) {
            ((e) z4Var.d).U0();
            m14.a(hVar).getRectManager().e(n14Var.a, true);
            if (hVar.A()) {
                h.s0(hVar, true, 6);
            } else if (hVar.x()) {
                h.q0(hVar, true, 6);
            }
        }
        m mVar = ((e) z4Var.d).r;
        for (m mVar2 = (m) z4Var.e; !js3.i(mVar2, mVar) && mVar2 != null; mVar2 = mVar2.r) {
            if (mVar2.M) {
                mVar2.Q0();
            }
        }
        zb5 zb5VarL = hVar.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            h hVar2 = (h) objArr[i2];
            if (hVar2.G() != Integer.MAX_VALUE) {
                hVar2.z().i0();
                h.t0(hVar2);
            }
        }
    }

    public final void k0() {
        if (this.r) {
            this.r = false;
            n14 n14Var = this.f;
            h hVar = n14Var.a;
            h hVar2 = n14Var.a;
            m14.a(hVar).getRectManager().g(hVar2);
            z4 z4Var = hVar2.H;
            m mVar = ((e) z4Var.d).r;
            for (m mVar2 = (m) z4Var.e; !js3.i(mVar2, mVar) && mVar2 != null; mVar2 = mVar2.r) {
                mVar2.W0();
                mVar2.b1();
            }
            zb5 zb5VarL = hVar2.L();
            Object[] objArr = zb5VarL.a;
            int i = zb5VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((h) objArr[i2]).z().k0();
            }
        }
    }

    @Override // defpackage.yk4
    public final int l(int i) {
        n14 n14Var = this.f;
        if (!wu8.D(n14Var.a)) {
            n0();
            return n14Var.a().l(i);
        }
        k kVar = n14Var.q;
        js3.m(kVar);
        return kVar.l(i);
    }

    @Override // defpackage.sd
    public final int m() {
        return this.i;
    }

    public final void m0() {
        n14 n14Var = this.f;
        if (n14Var.l > 0) {
            zb5 zb5VarL = n14Var.a.L();
            Object[] objArr = zb5VarL.a;
            int i = zb5VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                h hVar = (h) objArr[i2];
                n14 n14VarT = hVar.t();
                boolean z = n14VarT.j;
                l lVar = n14VarT.p;
                if ((z || n14VarT.k) && !lVar.u) {
                    hVar.r0(false);
                }
                lVar.m0();
            }
        }
    }

    @Override // defpackage.yk4
    public final int n(int i) {
        n14 n14Var = this.f;
        if (!wu8.D(n14Var.a)) {
            n0();
            return n14Var.a().n(i);
        }
        k kVar = n14Var.q;
        js3.m(kVar);
        return kVar.n(i);
    }

    public final void n0() {
        n14 n14Var = this.f;
        h.s0(n14Var.a, false, 7);
        h hVar = n14Var.a;
        h hVarF = hVar.F();
        if (hVarF == null || hVar.E != LayoutNode$UsageByParent.c) {
            return;
        }
        int iOrdinal = hVarF.v().ordinal();
        hVar.E = iOrdinal != 0 ? iOrdinal != 2 ? hVarF.E : LayoutNode$UsageByParent.b : LayoutNode$UsageByParent.a;
    }

    public final void o0() {
        this.E = true;
        n14 n14Var = this.f;
        h hVarF = n14Var.a.F();
        float f = f().C;
        h hVar = n14Var.a;
        z4 z4Var = hVar.H;
        m mVar = (m) z4Var.e;
        e eVar = (e) z4Var.d;
        while (mVar != eVar) {
            js3.n(mVar, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            g gVar = (g) mVar;
            f += gVar.C;
            mVar = gVar.r;
        }
        if (f != this.D) {
            this.D = f;
            if (hVarF != null) {
                hVarF.i0();
            }
            if (hVarF != null) {
                hVarF.O();
            }
        }
        if (!f().k) {
            boolean z = this.r;
            if (!z || this.w.e()) {
                i0();
            }
            if (z) {
                ((e) hVar.H.d).U0();
            } else {
                if (hVarF != null) {
                    hVarF.O();
                }
                if (this.g && hVarF != null) {
                    hVarF.r0(false);
                }
            }
        }
        if (hVarF == null) {
            this.i = 0;
        } else if (!this.g && hVarF.v() == LayoutNode$LayoutState.c) {
            if (this.i != Integer.MAX_VALUE) {
                rn3.b("Place was called on a node which was placed already");
            }
            this.i = hVarF.t().i;
            hVarF.t().i++;
        }
        B();
    }

    public final void p0(long j, float f, dp2 dp2Var) {
        n14 n14Var = this.f;
        h hVar = n14Var.a;
        h hVar2 = n14Var.a;
        if (hVar.R) {
            rn3.a("place is called on a deactivated node");
        }
        n14Var.d = LayoutNode$LayoutState.c;
        this.m = j;
        this.o = f;
        this.n = dp2Var;
        this.E = false;
        Owner ownerA = m14.a(hVar2);
        if (this.u || !this.r) {
            this.w.e = false;
            n14Var.f(false);
            this.F = dp2Var;
            this.G = j;
            this.H = f;
            p snapshotObserver = ownerA.getSnapshotObserver();
            snapshotObserver.a.d(hVar2, snapshotObserver.f, this.I);
        } else {
            m mVarA = n14Var.a();
            mVarA.Z0(rq3.c(j, mVarA.e), f, dp2Var);
            o0();
        }
        n14Var.d = LayoutNode$LayoutState.e;
        if (n14Var.a().k && (n14Var.k || n14Var.j)) {
            requestLayout();
        }
        this.k = true;
    }

    public final boolean q0(long j) throws Throwable {
        n14 n14Var = this.f;
        h hVar = n14Var.a;
        h hVar2 = n14Var.a;
        try {
            if (hVar.R) {
                rn3.a("measure is called on a deactivated node");
            }
            Owner ownerA = m14.a(hVar2);
            h hVarF = hVar2.F();
            boolean z = true;
            hVar2.G = hVar2.G || (hVarF != null && hVarF.G);
            if (!hVar2.A() && h31.b(this.d, j)) {
                ((AndroidComposeView) ownerA).k(hVar2, false);
                hVar2.u0();
                return false;
            }
            this.w.d = false;
            e(new dp2() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$1$2
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    ((sd) obj).c().getClass();
                    return tx8.a;
                }
            });
            this.j = true;
            long j2 = n14Var.a().c;
            c0(j);
            LayoutNode$LayoutState layoutNode$LayoutState = n14Var.d;
            LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.e;
            if (layoutNode$LayoutState != layoutNode$LayoutState2) {
                rn3.b("layout state is not idle before measure starts");
            }
            this.A = j;
            LayoutNode$LayoutState layoutNode$LayoutState3 = LayoutNode$LayoutState.a;
            n14Var.d = layoutNode$LayoutState3;
            this.t = false;
            p snapshotObserver = m14.a(hVar2).getSnapshotObserver();
            snapshotObserver.a.d(hVar2, snapshotObserver.c, this.B);
            if (n14Var.d == layoutNode$LayoutState3) {
                this.u = true;
                this.v = true;
                n14Var.d = layoutNode$LayoutState2;
            }
            if (zq3.b(n14Var.a().c, j2) && n14Var.a().a == this.a && n14Var.a().b == this.b) {
                z = false;
            }
            Y((((long) n14Var.a().b) & 4294967295L) | (((long) n14Var.a().a) << 32));
            return z;
        } catch (Throwable th) {
            hVar.v0(th);
            throw null;
        }
    }

    @Override // defpackage.sd
    public final void requestLayout() {
        h hVar = this.f.a;
        i14 i14Var = h.S;
        hVar.r0(false);
    }

    @Override // defpackage.yk4
    public final b96 t(long j) throws Throwable {
        LayoutNode$UsageByParent layoutNode$UsageByParent;
        n14 n14Var = this.f;
        h hVar = n14Var.a;
        LayoutNode$UsageByParent layoutNode$UsageByParent2 = hVar.E;
        LayoutNode$UsageByParent layoutNode$UsageByParent3 = LayoutNode$UsageByParent.c;
        if (layoutNode$UsageByParent2 == layoutNode$UsageByParent3) {
            hVar.e();
        }
        if (wu8.D(n14Var.a)) {
            k kVar = n14Var.q;
            js3.m(kVar);
            kVar.j = layoutNode$UsageByParent3;
            kVar.t(j);
        }
        h hVar2 = n14Var.a;
        h hVarF = hVar2.F();
        if (hVarF != null) {
            if (this.l != layoutNode$UsageByParent3 && !hVar2.G) {
                rn3.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = hVarF.v().ordinal();
            if (iOrdinal == 0) {
                layoutNode$UsageByParent = LayoutNode$UsageByParent.a;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + hVarF.v());
                }
                layoutNode$UsageByParent = LayoutNode$UsageByParent.b;
            }
            this.l = layoutNode$UsageByParent;
        } else {
            this.l = layoutNode$UsageByParent3;
        }
        q0(j);
        return this;
    }

    @Override // defpackage.b96, defpackage.yk4
    public final Object v() {
        return this.q;
    }

    @Override // defpackage.zy4
    public final void x(boolean z) {
        n14 n14Var = this.f;
        if (z != n14Var.a().i) {
            n14Var.a().i = z;
            this.J = true;
        }
    }
}
