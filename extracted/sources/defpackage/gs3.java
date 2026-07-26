package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;

/* JADX INFO: loaded from: classes.dex */
final class gs3 extends mx4 {
    public final dp2 b;

    public gs3(dp2 dp2Var) {
        IntrinsicSize intrinsicSize = IntrinsicSize.a;
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gs3 ? (gs3) obj : null) == null) {
            return false;
        }
        IntrinsicSize intrinsicSize = IntrinsicSize.a;
        return true;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        IntrinsicSize intrinsicSize = IntrinsicSize.b;
        hs3 hs3Var = new hs3(0);
        hs3Var.p = intrinsicSize;
        hs3Var.q = true;
        return hs3Var;
    }

    public final int hashCode() {
        return (IntrinsicSize.b.hashCode() * 31) + 1231;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        hs3 hs3Var = (hs3) gx4Var;
        hs3Var.p = IntrinsicSize.b;
        hs3Var.q = true;
    }
}
