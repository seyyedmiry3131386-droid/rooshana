package defpackage;

import androidx.compose.foundation.h;

/* JADX INFO: loaded from: classes.dex */
final class zg2 extends mx4 {
    public final ab5 b;

    public zg2(ab5 ab5Var) {
        this.b = ab5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zg2) {
            return js3.i(this.b, ((zg2) obj).b);
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new h(this.b, 1, null);
    }

    public final int hashCode() {
        ab5 ab5Var = this.b;
        if (ab5Var != null) {
            return ab5Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((h) gx4Var).H0(this.b);
    }
}
