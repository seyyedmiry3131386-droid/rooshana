package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import defpackage.bt2;
import defpackage.q34;
import defpackage.rm7;
import defpackage.t34;
import defpackage.un3;

/* JADX INFO: loaded from: classes.dex */
public final class q34 extends gx4 implements in7 {
    public bp2 o;
    public n34 p;
    public Orientation q;
    public boolean r;
    public gg7 s;
    public final m22 t = new m22(13, this);
    public d u;

    public q34(bp2 bp2Var, n34 n34Var, Orientation orientation, boolean z) {
        this.o = bp2Var;
        this.p = n34Var;
        this.q = orientation;
        this.r = z;
        C0();
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C0() {
        this.s = new gg7(new p34(this, 0), new p34(this, 1));
        this.u = this.r ? new dp2() { // from class: androidx.compose.foundation.lazy.layout.d
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                q34 q34Var = this.a;
                t34 t34Var = (t34) q34Var.o.invoke();
                if (iIntValue < 0 || iIntValue >= t34Var.c()) {
                    StringBuilder sbR = rm7.r(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbR.append(t34Var.c());
                    sbR.append(')');
                    un3.a(sbR.toString());
                }
                bt2.G(q34Var.o0(), null, null, new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(q34Var, iIntValue, null), 3);
                return Boolean.TRUE;
            }
        } : 0;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        f.i(nn7Var);
        nn7Var.a(androidx.compose.ui.semantics.d.M, this.t);
        if (this.q == Orientation.a) {
            gg7 gg7Var = this.s;
            if (gg7Var == null) {
                js3.V("scrollAxisRange");
                throw null;
            }
            g gVar = androidx.compose.ui.semantics.d.v;
            ox3 ox3Var = f.a[13];
            nn7Var.a(gVar, gg7Var);
        } else {
            gg7 gg7Var2 = this.s;
            if (gg7Var2 == null) {
                js3.V("scrollAxisRange");
                throw null;
            }
            g gVar2 = androidx.compose.ui.semantics.d.u;
            ox3 ox3Var2 = f.a[12];
            nn7Var.a(gVar2, gg7Var2);
        }
        d dVar = this.u;
        if (dVar != null) {
            nn7Var.a(a.f, new e3(null, dVar));
        }
        f.a(nn7Var, new p34(this, 2));
        n34 n34Var = this.p;
        n34Var.getClass();
        su0 su0Var = new su0(((Number) n34Var.a.getValue()).intValue(), 1);
        g gVar3 = androidx.compose.ui.semantics.d.f;
        ox3 ox3Var3 = f.a[23];
        nn7Var.a(gVar3, su0Var);
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }
}
