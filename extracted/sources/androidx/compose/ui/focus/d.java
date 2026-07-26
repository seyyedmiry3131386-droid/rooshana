package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.l;
import defpackage.bp2;
import defpackage.br9;
import defpackage.dp2;
import defpackage.eq;
import defpackage.fg2;
import defpackage.fo3;
import defpackage.go3;
import defpackage.gx4;
import defpackage.ho3;
import defpackage.jr5;
import defpackage.js3;
import defpackage.lg2;
import defpackage.lx4;
import defpackage.m01;
import defpackage.ng2;
import defpackage.og2;
import defpackage.pg2;
import defpackage.qg2;
import defpackage.qp2;
import defpackage.ri1;
import defpackage.rn3;
import defpackage.ry7;
import defpackage.s08;
import defpackage.sy6;
import defpackage.t04;
import defpackage.th0;
import defpackage.ti1;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.ue8;
import defpackage.v04;
import defpackage.y40;
import defpackage.y97;
import defpackage.z4;
import defpackage.zb5;
import defpackage.zk8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class d extends gx4 implements m01, t04, jr5, lx4, ri1 {
    public final boolean o;
    public final qp2 p;
    public boolean q;
    public boolean r;
    public final int s;

    public d(int i, qp2 qp2Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        qp2Var = (i2 & 4) != 0 ? null : qp2Var;
        this.o = z;
        this.p = qp2Var;
        this.s = i;
    }

    public final boolean C0(int i) {
        int iOrdinal = e.p(this, i).ordinal();
        if (iOrdinal == 0) {
            return e.q(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [gx4] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [zb5] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void D0(FocusStateImpl focusStateImpl, FocusStateImpl focusStateImpl2) {
        z4 z4Var;
        qp2 qp2Var;
        c cVar = (c) y40.I(this).getFocusOwner();
        d dVarF = cVar.f();
        if (!focusStateImpl.equals(focusStateImpl2) && (qp2Var = this.p) != null) {
            qp2Var.invoke(focusStateImpl, focusStateImpl2);
        }
        gx4 gx4Var = this.a;
        if (!gx4Var.n) {
            rn3.b("visitAncestors called on an unattached node");
        }
        gx4 gx4Var2 = this.a;
        h hVarH = y40.H(this);
        while (hVarH != null) {
            if ((((gx4) hVarH.H.g).d & 5120) != 0) {
                while (gx4Var2 != null) {
                    int i = gx4Var2.c;
                    if ((i & 5120) != 0) {
                        if (gx4Var2 != gx4Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? J = gx4Var2;
                            ?? zb5Var = 0;
                            while (J != 0) {
                                if (J instanceof fg2) {
                                    fg2 fg2Var = (fg2) J;
                                    if (dVarF == cVar.f()) {
                                        fg2Var.U(focusStateImpl2);
                                    }
                                } else if ((J.c & 4096) != 0 && (J instanceof ti1)) {
                                    gx4 gx4Var3 = ((ti1) J).p;
                                    int i2 = 0;
                                    J = J;
                                    zb5Var = zb5Var;
                                    while (gx4Var3 != null) {
                                        if ((gx4Var3.c & 4096) != 0) {
                                            i2++;
                                            zb5Var = zb5Var;
                                            if (i2 == 1) {
                                                J = gx4Var3;
                                            } else {
                                                if (zb5Var == 0) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (J != 0) {
                                                    zb5Var.b(J);
                                                    J = 0;
                                                }
                                                zb5Var.b(gx4Var3);
                                            }
                                        }
                                        gx4Var3 = gx4Var3.f;
                                        J = J;
                                        zb5Var = zb5Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = y40.j(zb5Var);
                            }
                        }
                    }
                    gx4Var2 = gx4Var2.e;
                }
            }
            hVarH = hVarH.F();
            gx4Var2 = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [gx4] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [zb5] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final og2 E0() {
        boolean z;
        z4 z4Var;
        og2 og2Var = new og2();
        og2Var.a = true;
        qg2 qg2Var = qg2.b;
        og2Var.b = qg2Var;
        og2Var.c = qg2Var;
        og2Var.d = qg2Var;
        og2Var.e = qg2Var;
        og2Var.f = qg2Var;
        og2Var.g = qg2Var;
        og2Var.h = qg2Var;
        og2Var.i = qg2Var;
        og2Var.j = new dp2() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onEnter$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return tx8.a;
            }
        };
        og2Var.k = new dp2() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onExit$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return tx8.a;
            }
        };
        og2Var.l = th0.l;
        int i = this.s;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((fo3) ((s08) ((ho3) ((go3) y97.t(this, l.m))).b).getValue()).a == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        og2Var.a = z;
        gx4 gx4Var = this.a;
        if (!gx4Var.n) {
            rn3.b("visitAncestors called on an unattached node");
        }
        gx4 gx4Var2 = this.a;
        h hVarH = y40.H(this);
        loop0: while (hVarH != null) {
            if ((((gx4) hVarH.H.g).d & 3072) != 0) {
                while (gx4Var2 != null) {
                    int i2 = gx4Var2.c;
                    if ((i2 & 3072) != 0) {
                        if (gx4Var2 != gx4Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? J = gx4Var2;
                            ?? zb5Var = 0;
                            while (J != 0) {
                                if (J instanceof pg2) {
                                    ((pg2) J).w(og2Var);
                                } else if ((J.c & 2048) != 0 && (J instanceof ti1)) {
                                    gx4 gx4Var3 = ((ti1) J).p;
                                    int i3 = 0;
                                    J = J;
                                    zb5Var = zb5Var;
                                    while (gx4Var3 != null) {
                                        if ((gx4Var3.c & 2048) != 0) {
                                            i3++;
                                            zb5Var = zb5Var;
                                            if (i3 == 1) {
                                                J = gx4Var3;
                                            } else {
                                                if (zb5Var == 0) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (J != 0) {
                                                    zb5Var.b(J);
                                                    J = 0;
                                                }
                                                zb5Var.b(gx4Var3);
                                            }
                                        }
                                        gx4Var3 = gx4Var3.f;
                                        J = J;
                                        zb5Var = zb5Var;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                J = y40.j(zb5Var);
                            }
                        }
                    }
                    gx4Var2 = gx4Var2.e;
                }
            }
            hVarH = hVarH.F();
            gx4Var2 = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
        }
        return og2Var;
    }

    public final sy6 F0(v04 v04Var) {
        sy6 sy6Var = E0().l;
        return sy6Var != th0.l ? v04Var == null ? sy6Var : sy6Var.i(v04Var.H(y40.G(this), 0L)) : v04Var != null ? v04Var.I(y40.G(this), false) : ry7.c(0L, tt3.M(y40.G(this).c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a6, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.q24 G0() {
        /*
            r7 = this;
            gx4 r0 = r7.a
            boolean r0 = r0.n
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.rn3.b(r0)
        Lb:
            gx4 r0 = r7.a
            gx4 r0 = r0.e
            androidx.compose.ui.node.h r1 = defpackage.y40.H(r7)
        L13:
            r2 = 0
            if (r1 == 0) goto La6
            z4 r3 = r1.H
            java.lang.Object r3 = r3.g
            gx4 r3 = (defpackage.gx4) r3
            int r3 = r3.d
            r4 = 8388640(0x800020, float:1.1754988E-38)
            r3 = r3 & r4
            if (r3 == 0) goto L93
        L24:
            if (r0 == 0) goto L93
            int r3 = r0.c
            r5 = r3 & r4
            if (r5 == 0) goto L90
            r5 = 8388608(0x800000, float:1.1754944E-38)
            r5 = r5 & r3
            if (r5 == 0) goto L51
            boolean r1 = r0 instanceof defpackage.q24
            if (r1 == 0) goto L36
            goto L4c
        L36:
            boolean r1 = r0 instanceof defpackage.ti1
            if (r1 == 0) goto L4b
            ti1 r0 = (defpackage.ti1) r0
            gx4 r0 = r0.p
            r1 = r2
        L3f:
            if (r0 == 0) goto L49
            boolean r3 = r0 instanceof defpackage.q24
            if (r3 == 0) goto L46
            r1 = r0
        L46:
            gx4 r0 = r0.f
            goto L3f
        L49:
            r0 = r1
            goto L4c
        L4b:
            r0 = r2
        L4c:
            q24 r0 = (defpackage.q24) r0
            if (r0 == 0) goto La6
            return r0
        L51:
            r3 = r3 & 32
            if (r3 == 0) goto L90
            boolean r3 = r0 instanceof defpackage.lx4
            if (r3 == 0) goto L5b
            r5 = r0
            goto L70
        L5b:
            boolean r3 = r0 instanceof defpackage.ti1
            if (r3 == 0) goto L6f
            r3 = r0
            ti1 r3 = (defpackage.ti1) r3
            gx4 r3 = r3.p
            r5 = r2
        L65:
            if (r3 == 0) goto L70
            boolean r6 = r3 instanceof defpackage.lx4
            if (r6 == 0) goto L6c
            r5 = r3
        L6c:
            gx4 r3 = r3.f
            goto L65
        L6f:
            r5 = r2
        L70:
            lx4 r5 = (defpackage.lx4) r5
            if (r5 == 0) goto L90
            eq r3 = r5.N()
            mn6 r6 = androidx.compose.ui.layout.b.a
            boolean r3 = r3.d(r6)
            if (r3 != 0) goto L81
            goto L90
        L81:
            eq r0 = r5.N()
            r0.getClass()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = ""
            r0.<init>(r1)
            throw r0
        L90:
            gx4 r0 = r0.e
            goto L24
        L93:
            androidx.compose.ui.node.h r1 = r1.F()
            if (r1 == 0) goto La3
            z4 r0 = r1.H
            if (r0 == 0) goto La3
            java.lang.Object r0 = r0.f
            ue8 r0 = (defpackage.ue8) r0
            goto L13
        La3:
            r0 = r2
            goto L13
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.d.G0():q24");
    }

    public final FocusStateImpl H0() {
        z4 z4Var;
        if (!this.n) {
            return FocusStateImpl.c;
        }
        d dVarF = ((c) y40.I(this).getFocusOwner()).f();
        if (dVarF == null) {
            return FocusStateImpl.c;
        }
        if (this == dVarF) {
            return FocusStateImpl.a;
        }
        if (dVarF.n) {
            if (!dVarF.a.n) {
                rn3.b("visitAncestors called on an unattached node");
            }
            gx4 gx4Var = dVarF.a.e;
            h hVarH = y40.H(dVarF);
            while (hVarH != null) {
                if ((((gx4) hVarH.H.g).d & 1024) != 0) {
                    while (gx4Var != null) {
                        if ((gx4Var.c & 1024) != 0) {
                            gx4 gx4VarJ = gx4Var;
                            zb5 zb5Var = null;
                            while (gx4VarJ != null) {
                                if (gx4VarJ instanceof d) {
                                    if (this == ((d) gx4VarJ)) {
                                        return FocusStateImpl.b;
                                    }
                                } else if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                    int i = 0;
                                    for (gx4 gx4Var2 = ((ti1) gx4VarJ).p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
                                        if ((gx4Var2.c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                gx4VarJ = gx4Var2;
                                            } else {
                                                if (zb5Var == null) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (gx4VarJ != null) {
                                                    zb5Var.b(gx4VarJ);
                                                    gx4VarJ = null;
                                                }
                                                zb5Var.b(gx4Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                gx4VarJ = y40.j(zb5Var);
                            }
                        }
                        gx4Var = gx4Var.e;
                    }
                }
                hVarH = hVarH.F();
                gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
            }
        }
        return FocusStateImpl.c;
    }

    public final void I0() {
        int iOrdinal = H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        br9.G(this, new bp2() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                ref$ObjectRef.a = this.E0();
                return tx8.a;
            }
        });
        Object obj = ref$ObjectRef.a;
        if (obj == null) {
            js3.V("focusProperties");
            throw null;
        }
        if (((ng2) obj).a()) {
            return;
        }
        ((c) y40.I(this).getFocusOwner()).b(8, true, true);
    }

    public final boolean J0(final int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zC0 = E0().a ? C0(i) : e.g(this, i, new dp2() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((d) obj).C0(i));
                }
            });
            Trace.endSection();
            return zC0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.lx4
    public final /* synthetic */ eq N() {
        return eq.x;
    }

    @Override // defpackage.jr5
    public final void Y() {
        I0();
    }

    @Override // defpackage.t04
    public final /* synthetic */ void n(long j) {
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.gx4
    public final void u0() {
        int iOrdinal = H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                lg2 focusOwner = y40.I(this).getFocusOwner();
                d dVarA = zk8.A(this);
                if (dVarA == null || !dVarA.o) {
                    return;
                }
                c cVar = (c) focusOwner;
                cVar.a.E();
                cVar.d.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        c cVar2 = (c) y40.I(this).getFocusOwner();
        cVar2.b(8, true, false);
        if (this.o) {
            cVar2.a.E();
        }
        cVar2.d.a();
    }

    @Override // defpackage.gx4
    public final void w0() {
        if (H0().b()) {
            ((c) y40.I(this).getFocusOwner()).b(8, true, true);
        }
    }

    @Override // defpackage.t04
    public final void k(v04 v04Var) {
    }
}
