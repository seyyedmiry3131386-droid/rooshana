package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;

/* JADX INFO: loaded from: classes.dex */
final class cs3 extends mx4 {
    public final dp2 b;

    public cs3(dp2 dp2Var) {
        IntrinsicSize intrinsicSize = IntrinsicSize.a;
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cs3 ? (cs3) obj : null) == null) {
            return false;
        }
        IntrinsicSize intrinsicSize = IntrinsicSize.a;
        return true;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        IntrinsicSize intrinsicSize = IntrinsicSize.a;
        ds3 ds3Var = new ds3(0);
        ds3Var.p = intrinsicSize;
        ds3Var.q = true;
        return ds3Var;
    }

    public final int hashCode() {
        return (IntrinsicSize.a.hashCode() * 31) + 1231;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ds3 ds3Var = (ds3) gx4Var;
        ds3Var.p = IntrinsicSize.a;
        ds3Var.q = true;
    }
}
