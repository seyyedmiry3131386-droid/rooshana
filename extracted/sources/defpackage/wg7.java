package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.n;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class wg7 extends ti1 implements m01, jr5 {
    public c A;
    public boolean B;
    public bh7 q;
    public Orientation r;
    public boolean s;
    public qe1 t;
    public ab5 u;
    public boolean v;
    public c w;
    public n x;
    public ri1 y;
    public eg z;

    public final void F0() {
        ri1 ri1Var = this.y;
        if (ri1Var != null) {
            if (((gx4) ri1Var).a.n) {
                return;
            }
            C0(ri1Var);
            return;
        }
        if (this.v) {
            br9.G(this, new o06(19, this));
        }
        c cVar = this.v ? this.A : this.w;
        if (cVar != null) {
            ti1 ti1Var = cVar.i;
            if (ti1Var.a.n) {
                return;
            }
            C0(ti1Var);
            this.y = ti1Var;
        }
    }

    public final boolean G0() {
        LayoutDirection layoutDirection = LayoutDirection.a;
        if (this.n) {
            layoutDirection = y40.H(this).B;
        }
        return layoutDirection != LayoutDirection.b || this.r == Orientation.a;
    }

    public final void H0(qe1 qe1Var, ab5 ab5Var, bh7 bh7Var, c cVar, Orientation orientation, boolean z, boolean z2) {
        boolean z3;
        this.q = bh7Var;
        this.r = orientation;
        boolean z4 = true;
        if (this.v != z) {
            this.v = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (js3.i(this.w, cVar)) {
            z4 = false;
        } else {
            this.w = cVar;
        }
        if (z3 || (z4 && !z)) {
            ri1 ri1Var = this.y;
            if (ri1Var != null) {
                D0(ri1Var);
            }
            this.y = null;
            F0();
        }
        this.s = z2;
        this.t = qe1Var;
        this.u = ab5Var;
        boolean zG0 = G0();
        this.B = zG0;
        n nVar = this.x;
        if (nVar != null) {
            nVar.X0(qe1Var, ab5Var, bh7Var, this.v ? this.A : this.w, orientation, z2, zG0);
        }
    }

    @Override // defpackage.jr5
    public final void Y() {
        eg egVar = (eg) y97.t(this, nx5.a);
        if (js3.i(egVar, this.z)) {
            return;
        }
        this.z = egVar;
        this.A = null;
        ri1 ri1Var = this.y;
        if (ri1Var != null) {
            D0(ri1Var);
        }
        this.y = null;
        F0();
        n nVar = this.x;
        if (nVar != null) {
            bh7 bh7Var = this.q;
            Orientation orientation = this.r;
            nVar.X0(this.t, this.u, bh7Var, this.v ? this.A : this.w, orientation, this.s, this.B);
        }
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.gx4
    public final void s0() {
        this.B = G0();
        F0();
        if (this.x == null) {
            n nVar = new n(this.t, this.u, this.q, this.v ? this.A : this.w, this.r, this.s, this.B);
            C0(nVar);
            this.x = nVar;
        }
    }

    @Override // defpackage.gx4
    public final void u0() {
        ri1 ri1Var = this.y;
        if (ri1Var != null) {
            D0(ri1Var);
        }
    }

    @Override // defpackage.gx4
    public final void v0() {
        boolean zG0 = G0();
        if (this.B != zG0) {
            this.B = zG0;
            bh7 bh7Var = this.q;
            Orientation orientation = this.r;
            boolean z = this.v;
            H0(this.t, this.u, bh7Var, z ? this.A : this.w, orientation, z, this.s);
        }
    }
}
