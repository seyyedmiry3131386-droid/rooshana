package defpackage;

import androidx.compose.ui.draw.a;
import androidx.compose.ui.draw.b;

/* JADX INFO: loaded from: classes.dex */
final class kv1 extends mx4 {
    public final dp2 b;

    public kv1(dp2 dp2Var) {
        this.b = dp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kv1) {
            return this.b == ((kv1) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new a(new b(), this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        a aVar = (a) gx4Var;
        aVar.q = this.b;
        aVar.C0();
    }
}
