package defpackage;

import androidx.compose.ui.node.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class ti1 extends gx4 {
    public final int o = ho5.e(this);
    public gx4 p;

    @Override // defpackage.gx4
    public final void A0(gx4 gx4Var) {
        this.a = gx4Var;
        for (gx4 gx4Var2 = this.p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
            gx4Var2.A0(gx4Var);
        }
    }

    @Override // defpackage.gx4
    public final void B0(m mVar) {
        this.h = mVar;
        for (gx4 gx4Var = this.p; gx4Var != null; gx4Var = gx4Var.f) {
            gx4Var.B0(mVar);
        }
    }

    public final ri1 C0(ri1 ri1Var) {
        gx4 gx4Var = ((gx4) ri1Var).a;
        if (gx4Var != ri1Var) {
            gx4 gx4Var2 = ri1Var instanceof gx4 ? (gx4) ri1Var : null;
            gx4 gx4Var3 = gx4Var2 != null ? gx4Var2.e : null;
            if (gx4Var != this.a || !js3.i(gx4Var3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (gx4Var.n) {
                rn3.b("Cannot delegate to an already attached node");
            }
            gx4Var.A0(this.a);
            int i = this.c;
            int iF = ho5.f(gx4Var);
            gx4Var.c = iF;
            int i2 = this.c;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof f14)) {
                rn3.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + gx4Var);
            }
            gx4Var.f = this.p;
            this.p = gx4Var;
            gx4Var.e = this;
            E0(iF | this.c, false);
            if (this.n) {
                if (i3 == 0 || (i & 2) != 0) {
                    B0(this.h);
                } else {
                    z4 z4Var = y40.H(this).H;
                    this.a.B0(null);
                    z4Var.m();
                }
                gx4Var.q0();
                gx4Var.y0();
                if (!gx4Var.n) {
                    rn3.b("autoInvalidateInsertedNode called on unattached node");
                }
                ho5.a(gx4Var, -1, 1);
            }
        }
        return ri1Var;
    }

    public final void D0(ri1 ri1Var) {
        gx4 gx4Var = null;
        for (gx4 gx4Var2 = this.p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
            if (gx4Var2 == ri1Var) {
                boolean z = gx4Var2.n;
                if (z) {
                    ib5 ib5Var = ho5.a;
                    if (!z) {
                        rn3.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    ho5.a(gx4Var2, -1, 2);
                    gx4Var2.z0();
                    gx4Var2.r0();
                }
                gx4Var2.A0(gx4Var2);
                gx4Var2.d = 0;
                if (gx4Var == null) {
                    this.p = gx4Var2.f;
                } else {
                    gx4Var.f = gx4Var2.f;
                }
                gx4Var2.f = null;
                gx4Var2.e = null;
                int i = this.c;
                int iF = ho5.f(this);
                E0(iF, true);
                if (this.n && (i & 2) != 0 && (iF & 2) == 0) {
                    z4 z4Var = y40.H(this).H;
                    this.a.B0(null);
                    z4Var.m();
                    return;
                }
                return;
            }
            gx4Var = gx4Var2;
        }
        throw new IllegalStateException(("Could not find delegate: " + ri1Var).toString());
    }

    public final void E0(int i, boolean z) {
        gx4 gx4Var;
        int i2 = this.c;
        this.c = i;
        if (i2 != i) {
            gx4 gx4Var2 = this.a;
            if (gx4Var2 == this) {
                this.d = i;
            }
            if (this.n) {
                gx4 gx4Var3 = this;
                while (gx4Var3 != null) {
                    i |= gx4Var3.c;
                    gx4Var3.c = i;
                    if (gx4Var3 == gx4Var2) {
                        break;
                    } else {
                        gx4Var3 = gx4Var3.e;
                    }
                }
                if (z && gx4Var3 == gx4Var2) {
                    i = ho5.f(gx4Var2);
                    gx4Var2.c = i;
                }
                int i3 = i | ((gx4Var3 == null || (gx4Var = gx4Var3.f) == null) ? 0 : gx4Var.d);
                while (gx4Var3 != null) {
                    i3 |= gx4Var3.c;
                    gx4Var3.d = i3;
                    gx4Var3 = gx4Var3.e;
                }
            }
        }
    }

    @Override // defpackage.gx4
    public final void q0() {
        super.q0();
        for (gx4 gx4Var = this.p; gx4Var != null; gx4Var = gx4Var.f) {
            gx4Var.B0(this.h);
            if (!gx4Var.n) {
                gx4Var.q0();
            }
        }
    }

    @Override // defpackage.gx4
    public final void r0() {
        for (gx4 gx4Var = this.p; gx4Var != null; gx4Var = gx4Var.f) {
            gx4Var.r0();
        }
        super.r0();
    }

    @Override // defpackage.gx4
    public final void x0() {
        super.x0();
        for (gx4 gx4Var = this.p; gx4Var != null; gx4Var = gx4Var.f) {
            gx4Var.x0();
        }
    }

    @Override // defpackage.gx4
    public final void y0() {
        for (gx4 gx4Var = this.p; gx4Var != null; gx4Var = gx4Var.f) {
            gx4Var.y0();
        }
        super.y0();
    }

    @Override // defpackage.gx4
    public final void z0() {
        super.z0();
        for (gx4 gx4Var = this.p; gx4Var != null; gx4Var = gx4Var.f) {
            gx4Var.z0();
        }
    }
}
