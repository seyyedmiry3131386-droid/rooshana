package androidx.compose.ui.graphics;

import androidx.compose.ui.node.m;
import defpackage.dp2;
import defpackage.gx4;
import defpackage.mx4;
import defpackage.y40;

/* JADX INFO: loaded from: classes.dex */
final class a extends mx4 {
    public final dp2 b;

    public a(dp2 dp2Var) {
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.b == ((a) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new b(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        m mVar;
        b bVar = (b) gx4Var;
        dp2 dp2Var = this.b;
        bVar.o = dp2Var;
        if (bVar.a.n && (mVar = y40.E(bVar, 2).r) != null) {
            mVar.h1(dp2Var, true);
        }
    }
}
