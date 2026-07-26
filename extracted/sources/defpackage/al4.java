package defpackage;

import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutNode$LayoutState;
import androidx.compose.ui.node.LayoutNode$UsageByParent;
import androidx.compose.ui.node.SortedSet;
import androidx.compose.ui.node.e;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.m;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class al4 {
    public final h a;
    public boolean c;
    public boolean d;
    public h31 i;
    public final wv8 b = new wv8(21);
    public final hh2 e = new hh2(24, (byte) 0);
    public final zb5 f = new zb5(0, new gy5[16]);
    public final long g = 1;
    public final zb5 h = new zb5(0, new zk4[16]);

    public al4(h hVar) {
        this.a = hVar;
    }

    public static boolean b(h hVar, h31 h31Var) {
        if (hVar.j == null) {
            return false;
        }
        boolean zY = h31Var != null ? hVar.Y(h31Var) : h.Z(hVar);
        h hVarF = hVar.F();
        if (zY && hVarF != null) {
            if (hVarF.j == null) {
                h.s0(hVarF, false, 3);
                return zY;
            }
            if (hVar.C() == LayoutNode$UsageByParent.a) {
                h.q0(hVarF, false, 3);
                return zY;
            }
            if (hVar.C() == LayoutNode$UsageByParent.b) {
                hVarF.p0(false);
            }
        }
        return zY;
    }

    public static boolean c(h hVar, h31 h31Var) {
        boolean zK0 = h31Var != null ? hVar.k0(h31Var) : h.l0(hVar);
        h hVarF = hVar.F();
        if (zK0 && hVarF != null) {
            if (hVar.B() == LayoutNode$UsageByParent.a) {
                h.s0(hVarF, false, 3);
                return zK0;
            }
            if (hVar.B() == LayoutNode$UsageByParent.b) {
                hVarF.r0(false);
            }
        }
        return zK0;
    }

    public static boolean h(h hVar) {
        k kVar;
        l14 l14Var;
        if (hVar.x()) {
            return (hVar.C() == LayoutNode$UsageByParent.c && ((kVar = hVar.t().q) == null || (l14Var = kVar.q) == null || !l14Var.f())) ? false : true;
        }
        return false;
    }

    public static boolean i(h hVar) {
        if (!hVar.A()) {
            return false;
        }
        do {
            if (hVar.B() == LayoutNode$UsageByParent.c && !hVar.t().p.w.f()) {
                h hVarF = hVar.F();
                if ((hVarF != null ? hVarF.v() : null) != LayoutNode$LayoutState.a) {
                    return false;
                }
            }
            hVar = hVar.F();
            if (hVar == null) {
                return false;
            }
        } while (!hVar.V());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            hh2 r1 = r7.e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.b
            zb5 r8 = (defpackage.zb5) r8
            androidx.compose.ui.node.h r2 = r7.a
            int r3 = r2.Q
            if (r3 <= 0) goto L17
            r8.h()
            r8.b(r2)
            r2.P = r0
        L17:
            java.lang.Object r8 = r1.b
            zb5 r8 = (defpackage.zb5) r8
            int r2 = r8.c
            if (r2 == 0) goto L62
            yg2 r3 = defpackage.yg2.d
            java.lang.Object[] r4 = r8.a
            r5 = 0
            defpackage.ew.T0(r4, r3, r5, r2)
            int r2 = r8.c
            java.lang.Object r3 = r1.c
            androidx.compose.ui.node.h[] r3 = (androidx.compose.ui.node.h[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            androidx.compose.ui.node.h[] r3 = new androidx.compose.ui.node.h[r3]
        L3a:
            r4 = 0
            r1.c = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.a
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.h()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            defpackage.js3.m(r8)
            boolean r0 = r8.P
            if (r0 == 0) goto L5b
            defpackage.hh2.i(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.c = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al4.a(boolean):void");
    }

    public final void d() {
        zb5 zb5Var = this.h;
        int i = zb5Var.c;
        if (i != 0) {
            Object[] objArr = zb5Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                zk4 zk4Var = (zk4) objArr[i2];
                h hVar = zk4Var.a;
                boolean z = zk4Var.c;
                h hVar2 = zk4Var.a;
                if (hVar.U()) {
                    if (zk4Var.b) {
                        h.q0(hVar2, z, 2);
                    } else {
                        h.s0(hVar2, z, 2);
                    }
                }
            }
            zb5Var.h();
        }
    }

    public final void e(h hVar) {
        zb5 zb5VarL = hVar.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            h hVar2 = (h) objArr[i2];
            if (js3.i(hVar2.X(), Boolean.TRUE) && !hVar2.R) {
                if (this.b.o(hVar2)) {
                    hVar2.a0();
                }
                e(hVar2);
            }
        }
    }

    public final void f(h hVar, boolean z) {
        if (!this.c) {
            rn3.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? hVar.x() : hVar.A()) {
            rn3.a("node not yet measured");
        }
        g(hVar, z);
    }

    public final void g(h hVar, boolean z) {
        k kVar;
        l14 l14Var;
        zb5 zb5VarL = hVar.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            h hVar2 = (h) objArr[i2];
            if ((!z && (hVar2.B() == LayoutNode$UsageByParent.a || hVar2.t().p.w.f())) || (z && (hVar2.C() == LayoutNode$UsageByParent.a || ((kVar = hVar2.t().q) != null && (l14Var = kVar.q) != null && l14Var.f())))) {
                if (wu8.D(hVar2) && !z) {
                    if (hVar2.x() && this.b.o(hVar2)) {
                        m(hVar2, true, false);
                    } else {
                        f(hVar2, true);
                    }
                }
                if (z ? hVar2.x() : hVar2.A()) {
                    m(hVar2, z, false);
                }
                if (!(z ? hVar2.x() : hVar2.A())) {
                    g(hVar2, z);
                }
            }
        }
        if (z ? hVar.x() : hVar.A()) {
            m(hVar, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [gx4] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [gx4] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [zb5] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [zb5] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(bp2 bp2Var) {
        boolean z;
        gx4 gx4Var;
        int i;
        ?? J;
        boolean z2;
        h hVar;
        boolean z3;
        wv8 wv8Var = this.b;
        h hVar2 = this.a;
        if (!hVar2.U()) {
            rn3.a("performMeasureAndLayout called with unattached root");
        }
        if (!hVar2.V()) {
            rn3.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            rn3.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zF = wv8Var.F();
                pt2 pt2Var = (pt2) wv8Var.b;
                if (zF) {
                    z = false;
                    while (true) {
                        pt2 pt2Var2 = (pt2) wv8Var.d;
                        pt2 pt2Var3 = (pt2) wv8Var.c;
                        if (!((SortedSet) pt2Var.b).isEmpty()) {
                            hVar = (h) ((SortedSet) pt2Var.b).first();
                            pt2Var.y(hVar);
                            z3 = hVar.j != null;
                            z2 = false;
                        } else if (!((SortedSet) pt2Var3.b).isEmpty()) {
                            hVar = (h) ((SortedSet) pt2Var3.b).first();
                            pt2Var3.y(hVar);
                            z3 = hVar.j != null;
                            z2 = true;
                        } else {
                            if (((SortedSet) pt2Var2.b).isEmpty()) {
                                break;
                            }
                            h hVar3 = (h) ((SortedSet) pt2Var2.b).first();
                            pt2Var2.y(hVar3);
                            z2 = true;
                            hVar = hVar3;
                            z3 = false;
                        }
                        boolean zM = m(hVar, z3, z2);
                        if (!z2) {
                            if (hVar.w()) {
                                wv8Var.g(hVar, Invalidation.b);
                            }
                            if (hVar.u()) {
                                wv8Var.g(hVar, Invalidation.d);
                            }
                        }
                        if (hVar == hVar2 && zM) {
                            z = true;
                        }
                    }
                    if (bp2Var != null) {
                        bp2Var.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        zb5 zb5Var = this.f;
        Object[] objArr = zb5Var.a;
        int i2 = zb5Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            z4 z4Var = ((h) ((gy5) objArr[i3])).H;
            e eVar = (e) z4Var.d;
            int i4 = 4194304;
            boolean zG = ho5.g(4194304);
            if (zG) {
                gx4Var = eVar.V;
            } else {
                gx4Var = eVar.V.e;
                if (gx4Var == null) {
                }
            }
            dp2 dp2Var = m.O;
            gx4 gx4VarL0 = eVar.L0(zG);
            while (gx4VarL0 != null && (gx4VarL0.d & i4) != 0) {
                if ((gx4VarL0.c & i4) != 0) {
                    ?? r13 = gx4VarL0;
                    ?? zb5Var2 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof t04) {
                            ((t04) r13).k((e) z4Var.d);
                        } else {
                            if ((r13.c & i4) != 0 && (r13 instanceof ti1)) {
                                gx4 gx4Var2 = ((ti1) r13).p;
                                i = i4;
                                int i5 = 0;
                                J = r13;
                                zb5Var2 = zb5Var2;
                                while (gx4Var2 != null) {
                                    if ((gx4Var2.c & i) != 0) {
                                        i5++;
                                        zb5Var2 = zb5Var2;
                                        if (i5 == 1) {
                                            J = gx4Var2;
                                        } else {
                                            if (zb5Var2 == 0) {
                                                zb5Var2 = new zb5(0, new gx4[16]);
                                            }
                                            if (J != 0) {
                                                zb5Var2.b(J);
                                                J = 0;
                                            }
                                            zb5Var2.b(gx4Var2);
                                        }
                                    }
                                    gx4Var2 = gx4Var2.f;
                                    J = J;
                                    zb5Var2 = zb5Var2;
                                }
                                if (i5 == 1) {
                                }
                                i4 = i;
                                r13 = J;
                                zb5Var2 = zb5Var2;
                            }
                            J = y40.j(zb5Var2);
                            i4 = i;
                            r13 = J;
                            zb5Var2 = zb5Var2;
                        }
                        i = i4;
                        J = y40.j(zb5Var2);
                        i4 = i;
                        r13 = J;
                        zb5Var2 = zb5Var2;
                    }
                }
                int i6 = i4;
                if (gx4VarL0 != gx4Var) {
                    gx4VarL0 = gx4VarL0.f;
                    i4 = i6;
                }
            }
        }
        zb5Var.h();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [gx4] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [gx4] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [zb5] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [zb5] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.compose.ui.node.h, java.lang.Object] */
    public final void k(h hVar, long j) {
        gx4 gx4Var;
        ?? zb5Var;
        ?? J;
        int i;
        if (hVar.R) {
            return;
        }
        h hVar2 = this.a;
        if (hVar.equals(hVar2)) {
            rn3.a("measureAndLayout called on root");
        }
        if (!hVar2.U()) {
            rn3.a("performMeasureAndLayout called with unattached root");
        }
        if (!hVar2.V()) {
            rn3.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            rn3.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                wv8 wv8Var = this.b;
                ((pt2) wv8Var.b).y(hVar);
                ((pt2) wv8Var.c).y(hVar);
                ((pt2) wv8Var.d).y(hVar);
                if (b(hVar, new h31(j)) || hVar.w()) {
                    if (js3.i(hVar.X(), Boolean.TRUE)) {
                        hVar.a0();
                    }
                }
                e(hVar);
                c(hVar, new h31(j));
                if (hVar.u() && hVar.V()) {
                    hVar.o0();
                    hh2 hh2Var = this.e;
                    hh2Var.getClass();
                    if (hVar.Q > 0) {
                        ((zb5) hh2Var.b).b(hVar);
                        hVar.P = true;
                    }
                }
                d();
            } finally {
            }
        }
        zb5 zb5Var2 = this.f;
        Object[] objArr = zb5Var2.a;
        int i2 = zb5Var2.c;
        for (int i3 = 0; i3 < i2; i3++) {
            z4 z4Var = ((h) ((gy5) objArr[i3])).H;
            e eVar = (e) z4Var.d;
            int i4 = 4194304;
            boolean zG = ho5.g(4194304);
            if (zG) {
                gx4Var = eVar.V;
            } else {
                gx4Var = eVar.V.e;
                if (gx4Var == null) {
                }
            }
            dp2 dp2Var = m.O;
            gx4 gx4VarL0 = eVar.L0(zG);
            while (gx4VarL0 != null && (gx4VarL0.d & i4) != 0) {
                if ((gx4VarL0.c & i4) != 0) {
                    ?? r12 = gx4VarL0;
                    ?? r13 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof t04) {
                            ((t04) r12).k((e) z4Var.d);
                        } else {
                            if ((r12.c & i4) != 0 && (r12 instanceof ti1)) {
                                gx4 gx4Var2 = ((ti1) r12).p;
                                int i5 = 0;
                                J = r12;
                                zb5Var = r13;
                                while (gx4Var2 != null) {
                                    int i6 = i4;
                                    if ((gx4Var2.c & i6) != 0) {
                                        i5++;
                                        zb5Var = zb5Var;
                                        if (i5 == 1) {
                                            J = gx4Var2;
                                        } else {
                                            if (zb5Var == 0) {
                                                zb5Var = new zb5(0, new gx4[16]);
                                            }
                                            if (J != 0) {
                                                zb5Var.b(J);
                                                J = 0;
                                            }
                                            zb5Var.b(gx4Var2);
                                        }
                                    }
                                    gx4Var2 = gx4Var2.f;
                                    i4 = i6;
                                    J = J;
                                    zb5Var = zb5Var;
                                }
                                i = i4;
                                zb5Var = zb5Var;
                                if (i5 == 1) {
                                }
                                i4 = i;
                                r12 = J;
                                r13 = zb5Var;
                            }
                            J = y40.j(zb5Var);
                            i4 = i;
                            r12 = J;
                            r13 = zb5Var;
                        }
                        i = i4;
                        zb5Var = r13;
                        J = y40.j(zb5Var);
                        i4 = i;
                        r12 = J;
                        r13 = zb5Var;
                    }
                }
                int i7 = i4;
                if (gx4VarL0 != gx4Var) {
                    gx4VarL0 = gx4VarL0.f;
                    i4 = i7;
                }
            }
        }
        zb5Var2.h();
    }

    public final void l() {
        wv8 wv8Var = this.b;
        if (wv8Var.F()) {
            h hVar = this.a;
            if (!hVar.U()) {
                rn3.a("performMeasureAndLayout called with unattached root");
            }
            if (!hVar.V()) {
                rn3.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                rn3.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((SortedSet) ((pt2) wv8Var.d).b).isEmpty() && !((SortedSet) ((pt2) wv8Var.b).b).isEmpty()) {
                        if (hVar.j != null) {
                            o(hVar, true);
                        } else {
                            n(hVar);
                        }
                    }
                    o(hVar, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean m(h hVar, boolean z, boolean z2) {
        h31 h31Var;
        boolean zC;
        h hVarF;
        if (hVar.R || (!hVar.V() && !hVar.W() && !i(hVar) && !js3.i(hVar.X(), Boolean.TRUE) && !h(hVar) && !hVar.m())) {
            return false;
        }
        h hVar2 = this.a;
        if (hVar == hVar2) {
            h31Var = this.i;
            js3.m(h31Var);
        } else {
            h31Var = null;
        }
        if (z) {
            zC = hVar.x() ? b(hVar, h31Var) : false;
            if (z2 && ((zC || hVar.w()) && js3.i(hVar.X(), Boolean.TRUE))) {
                hVar.a0();
            }
        } else {
            zC = hVar.A() ? c(hVar, h31Var) : false;
            if (z2 && hVar.u() && (hVar == hVar2 || ((hVarF = hVar.F()) != null && hVarF.V() && hVar.W()))) {
                if (hVar == hVar2) {
                    hVar.j0();
                } else {
                    hVar.o0();
                }
                hh2 hh2Var = this.e;
                hh2Var.getClass();
                if (hVar.Q > 0) {
                    ((zb5) hh2Var.b).b(hVar);
                    hVar.P = true;
                }
            }
        }
        d();
        return zC;
    }

    public final void n(h hVar) {
        zb5 zb5VarL = hVar.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            h hVar2 = (h) objArr[i2];
            if (hVar2.B() == LayoutNode$UsageByParent.a || hVar2.t().p.w.f()) {
                if (wu8.D(hVar2)) {
                    o(hVar2, true);
                } else {
                    n(hVar2);
                }
            }
        }
    }

    public final void o(h hVar, boolean z) {
        h31 h31Var;
        if (hVar.R) {
            return;
        }
        if (hVar == this.a) {
            h31Var = this.i;
            js3.m(h31Var);
        } else {
            h31Var = null;
        }
        if (z) {
            b(hVar, h31Var);
        } else {
            c(hVar, h31Var);
        }
    }

    public final boolean p(h hVar, boolean z) {
        int iOrdinal = hVar.v().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new zk4(hVar, false, z));
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!hVar.A() || z) {
                    hVar.e0();
                    if (!hVar.R && (hVar.V() || i(hVar))) {
                        h hVarF = hVar.F();
                        if (hVarF == null || !hVarF.A()) {
                            this.b.g(hVar, Invalidation.c);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        h31 h31Var = this.i;
        if (h31Var == null ? false : h31.b(h31Var.a, j)) {
            return;
        }
        if (this.c) {
            rn3.a("updateRootConstraints called while measuring");
        }
        this.i = new h31(j);
        h hVar = this.a;
        if (hVar.j != null) {
            hVar.d0();
        }
        hVar.e0();
        this.b.g(hVar, hVar.j != null ? Invalidation.a : Invalidation.c);
    }
}
