package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;

/* JADX INFO: loaded from: classes.dex */
public final class d96 extends sa9 {
    @Override // defpackage.sa9
    public final void V(int i, int i2, int i3, int i4) {
        int iR = this.A0 + this.B0;
        int iL = this.w0 + this.x0;
        if (this.v0 > 0) {
            iR += this.u0[0].r();
            iL += this.u0[0].l();
        }
        int iMax = Math.max(this.d0, iR);
        int iMax2 = Math.max(this.e0, iL);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(iMax, i2) : i == 0 ? iMax : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(iMax2, i4) : i3 == 0 ? iMax2 : 0;
        }
        this.D0 = i2;
        this.E0 = i4;
        P(i2);
        M(i4);
        this.C0 = this.v0 > 0;
    }

    @Override // defpackage.f31
    public final void b(l74 l74Var, boolean z) {
        super.b(l74Var, z);
        if (this.v0 > 0) {
            f31 f31Var = this.u0[0];
            f31Var.E();
            f31Var.g0 = 0.5f;
            f31Var.f0 = 0.5f;
            ConstraintAnchor$Type constraintAnchor$Type = ConstraintAnchor$Type.a;
            f31Var.f(constraintAnchor$Type, this, constraintAnchor$Type, 0);
            ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.c;
            f31Var.f(constraintAnchor$Type2, this, constraintAnchor$Type2, 0);
            ConstraintAnchor$Type constraintAnchor$Type3 = ConstraintAnchor$Type.b;
            f31Var.f(constraintAnchor$Type3, this, constraintAnchor$Type3, 0);
            ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.d;
            f31Var.f(constraintAnchor$Type4, this, constraintAnchor$Type4, 0);
        }
    }
}
