package defpackage;

import androidx.compose.ui.node.h;

/* JADX INFO: loaded from: classes.dex */
final class ur5 extends mx4 {
    public final dp2 b;
    public final boolean c;
    public final dp2 d;

    public ur5(dp2 dp2Var, dp2 dp2Var2, boolean z) {
        this.b = dp2Var;
        this.c = z;
        this.d = dp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ur5 ur5Var = obj instanceof ur5 ? (ur5) obj : null;
        return ur5Var != null && this.b == ur5Var.b && this.c == ur5Var.c;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        vr5 vr5Var = new vr5();
        vr5Var.o = this.b;
        vr5Var.p = this.c;
        return vr5Var;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + (this.c ? 1231 : 1237);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        vr5 vr5Var = (vr5) gx4Var;
        dp2 dp2Var = vr5Var.o;
        dp2 dp2Var2 = this.b;
        boolean z = this.c;
        if (dp2Var != dp2Var2 || vr5Var.p != z) {
            h hVarH = y40.H(vr5Var);
            i14 i14Var = h.S;
            hVarH.r0(false);
        }
        vr5Var.o = dp2Var2;
        vr5Var.p = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.b);
        sb.append(", rtlAware=");
        return bl4.A(sb, this.c, ')');
    }
}
