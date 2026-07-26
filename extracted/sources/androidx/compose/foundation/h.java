package androidx.compose.foundation;

import androidx.compose.ui.node.m;
import defpackage.ab5;
import defpackage.ah2;
import defpackage.br9;
import defpackage.bt2;
import defpackage.c34;
import defpackage.dp2;
import defpackage.e3;
import defpackage.e51;
import defpackage.fs8;
import defpackage.gg2;
import defpackage.gr3;
import defpackage.gv;
import defpackage.gx4;
import defpackage.hg2;
import defpackage.in7;
import defpackage.jr5;
import defpackage.js3;
import defpackage.m01;
import defpackage.nn7;
import defpackage.ox3;
import defpackage.rn3;
import defpackage.rt2;
import defpackage.th0;
import defpackage.ti1;
import defpackage.ue8;
import defpackage.wt3;
import defpackage.y40;
import defpackage.z4;
import defpackage.zb5;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ti1 implements in7, rt2, m01, jr5, fs8 {
    public static final gv w = new gv(21);
    public ab5 q;
    public final dp2 r;
    public gg2 s;
    public c34 t;
    public m u;
    public final androidx.compose.ui.focus.d v;

    public h(ab5 ab5Var, int i, dp2 dp2Var) {
        this.q = ab5Var;
        this.r = dp2Var;
        androidx.compose.ui.focus.d dVar = new androidx.compose.ui.focus.d(i, new FocusableNode$focusTargetNode$1(2, this, h.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 10);
        C0(dVar);
        this.v = dVar;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    public final void F0(ab5 ab5Var, gr3 gr3Var) {
        if (!this.n) {
            ab5Var.b(gr3Var);
        } else {
            wt3 wt3Var = (wt3) ((e51) o0()).a.r0(th0.n);
            bt2.G(o0(), null, null, new FocusableNode$emitWithFallback$1(ab5Var, gr3Var, wt3Var != null ? wt3Var.s0(new defpackage.m(ab5Var, gr3Var, 16)) : null, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [gx4] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void G0() {
        z4 z4Var;
        if (this.n) {
            if (!this.a.n) {
                rn3.b("visitAncestors called on an unattached node");
            }
            gx4 gx4Var = this.a.e;
            androidx.compose.ui.node.h hVarH = y40.H(this);
            while (hVarH != null) {
                if ((((gx4) hVarH.H.g).d & 262144) != 0) {
                    while (gx4Var != null) {
                        if ((gx4Var.c & 262144) != 0) {
                            ?? J = gx4Var;
                            ?? zb5Var = 0;
                            while (J != 0) {
                                if (J instanceof fs8) {
                                    if (ah2.o.equals(((fs8) J).l())) {
                                        return;
                                    }
                                } else if ((J.c & 262144) != 0 && (J instanceof ti1)) {
                                    gx4 gx4Var2 = ((ti1) J).p;
                                    int i = 0;
                                    J = J;
                                    zb5Var = zb5Var;
                                    while (gx4Var2 != null) {
                                        if ((gx4Var2.c & 262144) != 0) {
                                            i++;
                                            zb5Var = zb5Var;
                                            if (i == 1) {
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
                                        J = J;
                                        zb5Var = zb5Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                J = y40.j(zb5Var);
                            }
                        }
                        gx4Var = gx4Var.e;
                    }
                }
                hVarH = hVarH.F();
                gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
            }
        }
    }

    public final void H0(ab5 ab5Var) {
        gg2 gg2Var;
        if (js3.i(this.q, ab5Var)) {
            return;
        }
        ab5 ab5Var2 = this.q;
        if (ab5Var2 != null && (gg2Var = this.s) != null) {
            ab5Var2.b(new hg2(gg2Var));
        }
        this.s = null;
        this.q = ab5Var;
    }

    @Override // defpackage.jr5
    public final void Y() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        br9.G(this, new defpackage.d(ref$ObjectRef, this, 23));
        c34 c34Var = (c34) ref$ObjectRef.a;
        if (this.v.H0().b()) {
            c34 c34Var2 = this.t;
            if (c34Var2 != null) {
                c34Var2.b();
            }
            if (c34Var != null) {
                c34Var.a();
            } else {
                c34Var = null;
            }
            this.t = c34Var;
        }
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        boolean zB = this.v.H0().b();
        ox3[] ox3VarArr = androidx.compose.ui.semantics.f.a;
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.k;
        ox3 ox3Var = androidx.compose.ui.semantics.f.a[4];
        nn7Var.a(gVar, Boolean.valueOf(zB));
        nn7Var.a(androidx.compose.ui.semantics.a.w, new e3(null, new FocusableNode$applySemantics$1(0, this, h.class, "requestFocus", "requestFocus()Z", 0)));
    }

    @Override // defpackage.fs8
    public final Object l() {
        return w;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.rt2
    public final void n0(m mVar) {
        this.u = mVar;
        if (this.v.H0().b()) {
            if (!mVar.J0().n) {
                G0();
                return;
            }
            m mVar2 = this.u;
            if (mVar2 == null || !mVar2.J0().n) {
                return;
            }
            G0();
        }
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.gx4
    public final void w0() {
        c34 c34Var = this.t;
        if (c34Var != null) {
            c34Var.b();
        }
        this.t = null;
    }
}
