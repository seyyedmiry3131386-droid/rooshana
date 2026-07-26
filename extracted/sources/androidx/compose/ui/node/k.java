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
import defpackage.sd;
import defpackage.tx8;
import defpackage.wu8;
import defpackage.ye4;
import defpackage.yk4;
import defpackage.yn3;
import defpackage.zb5;
import defpackage.zy4;

/* JADX INFO: loaded from: classes.dex */
public final class k extends b96 implements yk4, sd, zy4 {
    public boolean A;
    public final n14 f;
    public boolean g;
    public boolean k;
    public boolean l;
    public h31 m;
    public dp2 o;
    public boolean t;
    public Object w;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public LayoutNode$UsageByParent j = LayoutNode$UsageByParent.c;
    public long n = 0;
    public LookaheadPassDelegate$PlacedState p = LookaheadPassDelegate$PlacedState.c;
    public final l14 q = new l14(this, 1);
    public final zb5 r = new zb5(0, new k[16]);
    public boolean s = true;
    public final bp2 u = new bp2() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            k kVar = this.g;
            n14 n14Var = kVar.f;
            n14Var.h = 0;
            zb5 zb5VarL = n14Var.a.L();
            Object[] objArr = zb5VarL.a;
            int i = zb5VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                k kVar2 = ((h) objArr[i2]).t().q;
                js3.m(kVar2);
                kVar2.h = kVar2.i;
                kVar2.i = Integer.MAX_VALUE;
                if (kVar2.j == LayoutNode$UsageByParent.b) {
                    kVar2.j = LayoutNode$UsageByParent.c;
                }
            }
            kVar.e(new dp2() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.1
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    ((sd) obj).c().getClass();
                    return tx8.a;
                }
            });
            yn3 yn3Var = kVar.f().W;
            if (yn3Var != null) {
                boolean z = yn3Var.k;
                kb5 kb5Var = (kb5) n14Var.a.q();
                int i3 = ((zb5) kb5Var.b).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    ye4 ye4VarH0 = ((m) ((h) kb5Var.get(i4)).H.e).H0();
                    if (ye4VarH0 != null) {
                        ye4VarH0.k = z;
                    }
                }
            }
            yn3 yn3Var2 = kVar.f().W;
            js3.m(yn3Var2);
            yn3Var2.r0().d();
            if (kVar.f().W != null) {
                kb5 kb5Var2 = (kb5) n14Var.a.q();
                int i5 = ((zb5) kb5Var2.b).c;
                for (int i6 = 0; i6 < i5; i6++) {
                    ye4 ye4VarH02 = ((m) ((h) kb5Var2.get(i6)).H.e).H0();
                    if (ye4VarH02 != null) {
                        ye4VarH02.k = false;
                    }
                }
            }
            zb5 zb5VarL2 = n14Var.a.L();
            Object[] objArr2 = zb5VarL2.a;
            int i7 = zb5VarL2.c;
            for (int i8 = 0; i8 < i7; i8++) {
                k kVar3 = ((h) objArr2[i8]).t().q;
                js3.m(kVar3);
                int i9 = kVar3.h;
                int i10 = kVar3.i;
                if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                    kVar3.i0(true);
                }
            }
            kVar.e(new dp2() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.4
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
    public boolean v = true;
    public long x = j31.b(0, 0, 15);
    public final bp2 y = new bp2() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            k kVar = this.g;
            ye4 ye4VarH0 = kVar.f.a().H0();
            js3.m(ye4VarH0);
            ye4VarH0.t(kVar.x);
            return tx8.a;
        }
    };
    public final bp2 z = new bp2() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            ye4 ye4VarH0;
            k kVar = this.g;
            n14 n14Var = kVar.f;
            a96 placementScope = null;
            if (wu8.D(n14Var.a) || n14Var.c) {
                m mVar = n14Var.a().s;
                if (mVar != null) {
                    placementScope = mVar.l;
                }
            } else {
                m mVar2 = n14Var.a().s;
                if (mVar2 != null && (ye4VarH0 = mVar2.H0()) != null) {
                    placementScope = ye4VarH0.l;
                }
            }
            if (placementScope == null) {
                placementScope = m14.a(n14Var.a).getPlacementScope();
            }
            ye4 ye4VarH02 = n14Var.a().H0();
            js3.m(ye4VarH02);
            a96.i(placementScope, ye4VarH02, kVar.n);
            return tx8.a;
        }
    };

    public k(n14 n14Var) {
        this.f = n14Var;
        this.w = n14Var.p.q;
    }

    @Override // defpackage.sd
    public final void B() {
        this.t = true;
        l14 l14Var = this.q;
        l14Var.i();
        n14 n14Var = this.f;
        boolean z = n14Var.f;
        h hVar = n14Var.a;
        if (z) {
            zb5 zb5VarL = hVar.L();
            Object[] objArr = zb5VarL.a;
            int i = zb5VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                h hVar2 = (h) objArr[i2];
                if (hVar2.x() && hVar2.C() == LayoutNode$UsageByParent.a) {
                    k kVar = hVar2.t().q;
                    js3.m(kVar);
                    k kVar2 = hVar2.t().q;
                    h31 h31Var = kVar2 != null ? kVar2.m : null;
                    js3.m(h31Var);
                    if (kVar.q0(h31Var.a)) {
                        h.q0(hVar, false, 7);
                    }
                }
            }
        }
        yn3 yn3Var = f().W;
        js3.m(yn3Var);
        if (n14Var.g || (!yn3Var.k && n14Var.f)) {
            n14Var.f = false;
            LayoutNode$LayoutState layoutNode$LayoutState = n14Var.d;
            n14Var.d = LayoutNode$LayoutState.d;
            n14Var.i(false);
            p snapshotObserver = m14.a(hVar).getSnapshotObserver();
            snapshotObserver.a.d(hVar, snapshotObserver.h, this.u);
            n14Var.d = layoutNode$LayoutState;
            if (n14Var.m && yn3Var.k) {
                requestLayout();
            }
            n14Var.g = false;
        }
        if (l14Var.b && l14Var.f()) {
            l14Var.h();
        }
        this.t = false;
    }

    @Override // defpackage.sd
    public final void N() {
        h.q0(this.f.a, false, 7);
    }

    @Override // defpackage.yk4
    public final int P(int i) {
        n0();
        ye4 ye4VarH0 = this.f.a().H0();
        js3.m(ye4VarH0);
        return ye4VarH0.P(i);
    }

    @Override // defpackage.b96
    public final int T() {
        ye4 ye4VarH0 = this.f.a().H0();
        js3.m(ye4VarH0);
        return ye4VarH0.T();
    }

    @Override // defpackage.b96
    public final int U() {
        ye4 ye4VarH0 = this.f.a().H0();
        js3.m(ye4VarH0);
        return ye4VarH0.U();
    }

    @Override // defpackage.b96
    public final void W(long j, float f, dp2 dp2Var) throws Throwable {
        p0(j, dp2Var);
    }

    @Override // defpackage.yk4
    public final int a(int i) {
        n0();
        ye4 ye4VarH0 = this.f.a().H0();
        js3.m(ye4VarH0);
        return ye4VarH0.a(i);
    }

    @Override // defpackage.sd
    public final a c() {
        return this.q;
    }

    @Override // defpackage.sd
    public final void e(dp2 dp2Var) {
        zb5 zb5VarL = this.f.a.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            k kVar = ((h) objArr[i2]).t().q;
            js3.m(kVar);
            dp2Var.invoke(kVar);
        }
    }

    public final boolean e0() {
        n14 n14Var = this.f;
        return wu8.D(n14Var.a) || n14Var.c;
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
        return n14VarT.q;
    }

    public final void i0(boolean z) {
        if (z && e0()) {
            return;
        }
        if (z || e0()) {
            this.p = LookaheadPassDelegate$PlacedState.c;
            zb5 zb5VarL = this.f.a.L();
            Object[] objArr = zb5VarL.a;
            int i = zb5VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                k kVar = ((h) objArr[i2]).t().q;
                js3.m(kVar);
                kVar.i0(true);
            }
        }
    }

    public final void k0() {
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.p;
        n14 n14Var = this.f;
        boolean z = n14Var.c;
        h hVar = n14Var.a;
        if (z) {
            this.p = LookaheadPassDelegate$PlacedState.b;
        } else {
            this.p = LookaheadPassDelegate$PlacedState.a;
        }
        if (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.a && n14Var.e) {
            h.q0(hVar, true, 6);
        }
        zb5 zb5VarL = hVar.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            h hVar2 = (h) objArr[i2];
            k kVarY = hVar2.y();
            if (kVarY == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (kVarY.i != Integer.MAX_VALUE) {
                kVarY.k0();
                h.t0(hVar2);
            }
        }
    }

    @Override // defpackage.yk4
    public final int l(int i) {
        n0();
        ye4 ye4VarH0 = this.f.a().H0();
        js3.m(ye4VarH0);
        return ye4VarH0.l(i);
    }

    @Override // defpackage.sd
    public final int m() {
        return this.i;
    }

    public final void m0() {
        n14 n14Var = this.f;
        if (n14Var.o > 0) {
            zb5 zb5VarL = n14Var.a.L();
            Object[] objArr = zb5VarL.a;
            int i = zb5VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                h hVar = (h) objArr[i2];
                n14 n14VarT = hVar.t();
                if ((n14VarT.m || n14VarT.n) && !n14VarT.f) {
                    hVar.p0(false);
                }
                k kVar = n14VarT.q;
                if (kVar != null) {
                    kVar.m0();
                }
            }
        }
    }

    @Override // defpackage.yk4
    public final int n(int i) {
        n0();
        ye4 ye4VarH0 = this.f.a().H0();
        js3.m(ye4VarH0);
        return ye4VarH0.n(i);
    }

    public final void n0() {
        n14 n14Var = this.f;
        h.q0(n14Var.a, false, 7);
        h hVar = n14Var.a;
        h hVarF = hVar.F();
        if (hVarF == null || hVar.E != LayoutNode$UsageByParent.c) {
            return;
        }
        int iOrdinal = hVarF.v().ordinal();
        hVar.E = iOrdinal != 0 ? iOrdinal != 2 ? hVarF.E : LayoutNode$UsageByParent.b : LayoutNode$UsageByParent.a;
    }

    public final void o0() {
        this.A = true;
        n14 n14Var = this.f;
        h hVarF = n14Var.a.F();
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.p;
        if ((lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.a && !n14Var.c) || (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.b && n14Var.c)) {
            k0();
            if (this.g && hVarF != null) {
                hVarF.p0(false);
            }
        }
        if (hVarF == null) {
            this.i = 0;
        } else if (!this.g && (hVarF.v() == LayoutNode$LayoutState.c || hVarF.v() == LayoutNode$LayoutState.d)) {
            if (this.i != Integer.MAX_VALUE) {
                rn3.b("Place was called on a node which was placed already");
            }
            this.i = hVarF.t().h;
            hVarF.t().h++;
        }
        B();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0007, B:5:0x000d, B:9:0x0016, B:11:0x001b, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0082, B:31:0x006e), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0(long r10, defpackage.dp2 r12) throws java.lang.Throwable {
        /*
            r9 = this;
            n14 r0 = r9.f
            androidx.compose.ui.node.h r1 = r0.a
            androidx.compose.ui.node.h r2 = r0.a
            r3 = 0
            androidx.compose.ui.node.h r4 = r1.F()     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L15
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = r4.v()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r10 = move-exception
            goto L89
        L15:
            r4 = r3
        L16:
            androidx.compose.ui.node.LayoutNode$LayoutState r5 = androidx.compose.ui.node.LayoutNode$LayoutState.d     // Catch: java.lang.Throwable -> L12
            r6 = 0
            if (r4 != r5) goto L1d
            r0.c = r6     // Catch: java.lang.Throwable -> L12
        L1d:
            boolean r4 = r2.R     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L26
            java.lang.String r4 = "place is called on a deactivated node"
            defpackage.rn3.a(r4)     // Catch: java.lang.Throwable -> L12
        L26:
            r0.d = r5     // Catch: java.lang.Throwable -> L12
            r4 = 1
            r9.k = r4     // Catch: java.lang.Throwable -> L12
            r9.A = r6     // Catch: java.lang.Throwable -> L12
            long r7 = r9.n     // Catch: java.lang.Throwable -> L12
            boolean r5 = defpackage.rq3.a(r10, r7)     // Catch: java.lang.Throwable -> L12
            if (r5 != 0) goto L42
            boolean r5 = r0.n     // Catch: java.lang.Throwable -> L12
            if (r5 != 0) goto L3d
            boolean r5 = r0.m     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L3f
        L3d:
            r0.f = r4     // Catch: java.lang.Throwable -> L12
        L3f:
            r9.m0()     // Catch: java.lang.Throwable -> L12
        L42:
            androidx.compose.ui.node.Owner r5 = defpackage.m14.a(r2)     // Catch: java.lang.Throwable -> L12
            r9.n = r10     // Catch: java.lang.Throwable -> L12
            boolean r7 = r0.f     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L6e
            androidx.compose.ui.node.LookaheadPassDelegate$PlacedState r7 = r9.p     // Catch: java.lang.Throwable -> L12
            androidx.compose.ui.node.LookaheadPassDelegate$PlacedState r8 = androidx.compose.ui.node.LookaheadPassDelegate$PlacedState.c     // Catch: java.lang.Throwable -> L12
            if (r7 == r8) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == 0) goto L6e
            androidx.compose.ui.node.m r2 = r0.a()     // Catch: java.lang.Throwable -> L12
            ye4 r2 = r2.H0()     // Catch: java.lang.Throwable -> L12
            defpackage.js3.m(r2)     // Catch: java.lang.Throwable -> L12
            long r4 = r2.e     // Catch: java.lang.Throwable -> L12
            long r10 = defpackage.rq3.c(r10, r4)     // Catch: java.lang.Throwable -> L12
            r2.B0(r10)     // Catch: java.lang.Throwable -> L12
            r9.o0()     // Catch: java.lang.Throwable -> L12
            goto L82
        L6e:
            r0.h(r6)     // Catch: java.lang.Throwable -> L12
            l14 r10 = r9.q     // Catch: java.lang.Throwable -> L12
            r10.e = r6     // Catch: java.lang.Throwable -> L12
            androidx.compose.ui.node.p r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L12
            bp2 r11 = r9.z     // Catch: java.lang.Throwable -> L12
            dp2 r4 = r10.g     // Catch: java.lang.Throwable -> L12
            a18 r10 = r10.a     // Catch: java.lang.Throwable -> L12
            r10.d(r2, r4, r11)     // Catch: java.lang.Throwable -> L12
        L82:
            r9.o = r12     // Catch: java.lang.Throwable -> L12
            androidx.compose.ui.node.LayoutNode$LayoutState r10 = androidx.compose.ui.node.LayoutNode$LayoutState.e     // Catch: java.lang.Throwable -> L12
            r0.d = r10     // Catch: java.lang.Throwable -> L12
            return
        L89:
            r1.v0(r10)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.k.p0(long, dp2):void");
    }

    public final boolean q0(long j) throws Throwable {
        long j2;
        n14 n14Var = this.f;
        h hVar = n14Var.a;
        h hVar2 = n14Var.a;
        try {
            if (hVar.R) {
                rn3.a("measure is called on a deactivated node");
            }
            h hVarF = hVar2.F();
            hVar2.G = hVar2.G || (hVarF != null && hVarF.G);
            if (!hVar2.x()) {
                h31 h31Var = this.m;
                if (h31Var == null ? false : h31.b(h31Var.a, j)) {
                    Owner owner = hVar2.p;
                    if (owner != null) {
                        ((AndroidComposeView) owner).k(hVar2, true);
                    }
                    hVar2.u0();
                    return false;
                }
            }
            this.m = new h31(j);
            c0(j);
            this.q.d = false;
            e(new dp2() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$1$2
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    ((sd) obj).c().getClass();
                    return tx8.a;
                }
            });
            if (this.l) {
                j2 = this.c;
            } else {
                long j3 = Integer.MIN_VALUE;
                j2 = (j3 & 4294967295L) | (j3 << 32);
            }
            this.l = true;
            ye4 ye4VarH0 = n14Var.a().H0();
            if (!(ye4VarH0 != null)) {
                rn3.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            n14Var.c(j);
            Y((((long) ye4VarH0.b) & 4294967295L) | (((long) ye4VarH0.a) << 32));
            return (((int) (j2 >> 32)) == ye4VarH0.a && ((int) (j2 & 4294967295L)) == ye4VarH0.b) ? false : true;
        } catch (Throwable th) {
            hVar.v0(th);
            throw null;
        }
    }

    @Override // defpackage.sd
    public final void requestLayout() {
        h hVar = this.f.a;
        i14 i14Var = h.S;
        hVar.p0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // defpackage.yk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.b96 t(long r6) {
        /*
            r5 = this;
            n14 r0 = r5.f
            androidx.compose.ui.node.h r1 = r0.a
            androidx.compose.ui.node.h r1 = r1.F()
            r2 = 0
            if (r1 == 0) goto L10
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.v()
            goto L11
        L10:
            r1 = r2
        L11:
            androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode$LayoutState.b
            if (r1 == r3) goto L25
            androidx.compose.ui.node.h r1 = r0.a
            androidx.compose.ui.node.h r1 = r1.F()
            if (r1 == 0) goto L21
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = r1.v()
        L21:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode$LayoutState.d
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.b = r1
        L28:
            androidx.compose.ui.node.h r1 = r0.a
            androidx.compose.ui.node.h r2 = r1.F()
            if (r2 == 0) goto L74
            androidx.compose.ui.node.LayoutNode$UsageByParent r3 = r5.j
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode$UsageByParent.c
            if (r3 == r4) goto L40
            boolean r1 = r1.G
            if (r1 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.rn3.b(r1)
        L40:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r2.v()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6f
            r3 = 1
            if (r1 == r3) goto L6f
            r3 = 2
            if (r1 == r3) goto L6c
            r3 = 3
            if (r1 != r3) goto L54
            goto L6c
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r2.v()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6c:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode$UsageByParent.b
            goto L71
        L6f:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode$UsageByParent.a
        L71:
            r5.j = r1
            goto L78
        L74:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode$UsageByParent.c
            r5.j = r1
        L78:
            androidx.compose.ui.node.h r0 = r0.a
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r0.E
            androidx.compose.ui.node.LayoutNode$UsageByParent r2 = androidx.compose.ui.node.LayoutNode$UsageByParent.c
            if (r1 != r2) goto L83
            r0.e()
        L83:
            r5.q0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.k.t(long):b96");
    }

    @Override // defpackage.b96, defpackage.yk4
    public final Object v() {
        return this.w;
    }

    @Override // defpackage.zy4
    public final void x(boolean z) {
        ye4 ye4VarH0;
        n14 n14Var = this.f;
        ye4 ye4VarH02 = n14Var.a().H0();
        if (Boolean.valueOf(z).equals(ye4VarH02 != null ? Boolean.valueOf(ye4VarH02.i) : null) || (ye4VarH0 = n14Var.a().H0()) == null) {
            return;
        }
        ye4VarH0.i = z;
    }
}
