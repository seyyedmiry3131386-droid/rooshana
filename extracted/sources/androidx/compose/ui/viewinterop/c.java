package androidx.compose.ui.viewinterop;

import defpackage.dp2;
import defpackage.gx4;
import defpackage.mx4;

/* JADX INFO: loaded from: classes.dex */
final class c extends mx4 {
    public final dp2 b;

    public c(dp2 dp2Var) {
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.b == ((c) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new d(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        d dVar = (d) gx4Var;
        dp2 dp2Var = this.b;
        dVar.o = dp2Var;
        if (dVar.n) {
            ((AndroidViewHolder$layoutNode$1$coreModifier$4) dp2Var).invoke(dVar.p);
        }
    }
}
