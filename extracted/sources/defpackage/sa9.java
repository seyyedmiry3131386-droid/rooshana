package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.widget.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class sa9 extends oy2 {
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public boolean C0 = false;
    public int D0 = 0;
    public int E0 = 0;
    public final ea0 F0 = new ea0();
    public fa0 G0 = null;

    @Override // defpackage.oy2
    public final void U() {
        for (int i = 0; i < this.v0; i++) {
            f31 f31Var = this.u0[i];
            if (f31Var != null) {
                f31Var.G = true;
            }
        }
    }

    public abstract void V(int i, int i2, int i3, int i4);

    public final void W(f31 f31Var, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, int i, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, int i2) {
        fa0 fa0Var;
        f31 f31Var2;
        while (true) {
            fa0Var = this.G0;
            if (fa0Var != null || (f31Var2 = this.V) == null) {
                break;
            } else {
                this.G0 = ((g31) f31Var2).y0;
            }
        }
        ea0 ea0Var = this.F0;
        ea0Var.a = constraintWidget$DimensionBehaviour;
        ea0Var.b = constraintWidget$DimensionBehaviour2;
        ea0Var.c = i;
        ea0Var.d = i2;
        ((b) fa0Var).b(f31Var, ea0Var);
        f31Var.P(ea0Var.e);
        f31Var.M(ea0Var.f);
        f31Var.E = ea0Var.h;
        f31Var.J(ea0Var.g);
    }
}
