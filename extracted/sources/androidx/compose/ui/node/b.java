package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.d14;
import defpackage.d26;
import defpackage.dh6;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.e3;
import defpackage.el4;
import defpackage.en7;
import defpackage.eq;
import defpackage.eu;
import defpackage.f14;
import defpackage.fg2;
import defpackage.fh6;
import defpackage.fx4;
import defpackage.fy5;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.hy5;
import defpackage.in7;
import defpackage.js3;
import defpackage.lx4;
import defpackage.ng2;
import defpackage.nj;
import defpackage.nn7;
import defpackage.np2;
import defpackage.pg2;
import defpackage.qj1;
import defpackage.rb5;
import defpackage.rf0;
import defpackage.rm3;
import defpackage.rn3;
import defpackage.ro8;
import defpackage.rt2;
import defpackage.sg2;
import defpackage.sh0;
import defpackage.t04;
import defpackage.tt3;
import defpackage.ue8;
import defpackage.v04;
import defpackage.vg6;
import defpackage.y34;
import defpackage.y40;
import defpackage.yk4;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gx4 implements f14, gv1, in7, dh6, lx4, d26, t04, rt2, fg2, pg2, sg2, hy5, sh0 {
    public fx4 o;
    public HashSet p;

    @Override // defpackage.dh6
    public final void B() {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((fh6) fx4Var).e.b();
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    public final void C0(boolean z) {
        if (!this.n) {
            rn3.b("initializeModifier called on unattached node");
        }
        fx4 fx4Var = this.o;
        if ((this.c & 4) != 0 && !z) {
            y40.E(this, 2).Q0();
        }
        if ((this.c & 2) != 0) {
            dp2 dp2Var = c.a;
            ue8 ue8Var = (ue8) y40.H(this).H.f;
            js3.n(ue8Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (ue8Var.o) {
                m mVar = this.h;
                js3.m(mVar);
                ((g) mVar).k1(this);
                fy5 fy5Var = mVar.N;
                if (fy5Var != null) {
                    fy5Var.invalidate();
                }
            }
            if (!z) {
                y40.E(this, 2).Q0();
                y40.H(this).Q();
            }
        }
        if (fx4Var instanceof y34) {
            ((y34) fx4Var).b.k = y40.H(this);
        }
        int i = this.c;
        if ((i & 16) != 0 && (fx4Var instanceof fh6)) {
            ((fh6) fx4Var).e.a = this.h;
        }
        if ((i & 8) != 0) {
            ((AndroidComposeView) y40.I(this)).B();
        }
    }

    @Override // defpackage.gv1
    public final void H() {
        rf0.z(this);
    }

    @Override // defpackage.dh6
    public final void I() {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((fh6) fx4Var).e.getClass();
    }

    @Override // defpackage.lx4
    public final eq N() {
        return eq.x;
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((rm3) fx4Var).getClass();
        throw null;
    }

    @Override // defpackage.fg2
    public final void U(FocusStateImpl focusStateImpl) {
        fx4 fx4Var = this.o;
        rn3.b("onFocusEvent called on wrong node");
        fx4Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.f14
    public final int a(j jVar, yk4 yk4Var, int i) {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((d14) fx4Var).a(jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final int b(j jVar, yk4 yk4Var, int i) {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((d14) fx4Var).b(jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((d14) fx4Var).c(el4Var, yk4Var, j);
    }

    @Override // defpackage.sh0
    public final long d() {
        return tt3.M(y40.E(this, 128).c);
    }

    @Override // defpackage.f14
    public final int e(j jVar, yk4 yk4Var, int i) {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((d14) fx4Var).e(jVar, yk4Var, i);
    }

    @Override // defpackage.dh6
    public final boolean e0() {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((fh6) fx4Var).e.getClass();
        return true;
    }

    @Override // defpackage.f14
    public final int f(j jVar, yk4 yk4Var, int i) {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((d14) fx4Var).f(jVar, yk4Var, i);
    }

    @Override // defpackage.sh0
    public final qj1 getDensity() {
        return y40.H(this).A;
    }

    @Override // defpackage.sh0
    public final LayoutDirection getLayoutDirection() {
        return y40.H(this).B;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.dh6
    public final void i0() {
        B();
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        int i;
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        en7 en7VarK = ((eu) fx4Var).k();
        js3.n(nn7Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        en7 en7Var = (en7) nn7Var;
        rb5 rb5Var = en7Var.a;
        if (en7VarK.c) {
            en7Var.c = true;
        }
        if (en7VarK.d) {
            en7Var.d = true;
        }
        rb5 rb5Var2 = en7VarK.a;
        Object[] objArr = rb5Var2.b;
        Object[] objArr2 = rb5Var2.c;
        long[] jArr = rb5Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        androidx.compose.ui.semantics.g gVar = (androidx.compose.ui.semantics.g) obj;
                        if (!rb5Var.b(gVar)) {
                            rb5Var.m(gVar, obj2);
                        } else if (obj2 instanceof e3) {
                            Object objG = rb5Var.g(gVar);
                            js3.n(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            e3 e3Var = (e3) objG;
                            i = i3;
                            String str = e3Var.a;
                            if (str == null) {
                                str = ((e3) obj2).a;
                            }
                            np2 np2Var = e3Var.b;
                            if (np2Var == null) {
                                np2Var = ((e3) obj2).b;
                            }
                            rb5Var.m(gVar, new e3(str, np2Var));
                        }
                        i = i3;
                    } else {
                        i = i3;
                    }
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.dh6
    public final long m() {
        return ro8.a;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.t04
    public final void n(long j) {
    }

    @Override // defpackage.rt2
    public final void n0(m mVar) {
        js3.n(this.o, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        throw new ClassCastException();
    }

    @Override // defpackage.hy5
    public final boolean p() {
        return this.n;
    }

    @Override // defpackage.d26
    public final Object q(qj1 qj1Var, Object obj) {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        nj njVar = (nj) fx4Var;
        njVar.getClass();
        return njVar;
    }

    @Override // defpackage.gx4
    public final void s0() {
        C0(true);
    }

    @Override // defpackage.dh6
    public final void t(vg6 vg6Var, PointerEventPass pointerEventPass, long j) {
        fx4 fx4Var = this.o;
        js3.n(fx4Var, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((fh6) fx4Var).e.c(vg6Var, pointerEventPass);
    }

    @Override // defpackage.gx4
    public final void t0() {
        if (this.o instanceof fh6) {
            B();
        }
    }

    public final String toString() {
        return this.o.toString();
    }

    @Override // defpackage.gx4
    public final void u0() {
        if (!this.n) {
            rn3.b("unInitializeModifier called on unattached node");
        }
        if ((this.c & 8) != 0) {
            ((AndroidComposeView) y40.I(this)).B();
        }
    }

    @Override // defpackage.pg2
    public final void w(ng2 ng2Var) {
        fx4 fx4Var = this.o;
        rn3.b("applyFocusProperties called on wrong node");
        fx4Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.t04
    public final void k(v04 v04Var) {
    }
}
