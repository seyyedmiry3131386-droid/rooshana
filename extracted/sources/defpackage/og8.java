package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import androidx.compose.foundation.text.contextmenu.modifier.c;

/* JADX INFO: loaded from: classes.dex */
final class og8 extends mx4 {
    public final c b;
    public final dp2 c;
    public final dp2 d;
    public final t51 e;

    public og8(c cVar, dp2 dp2Var, dp2 dp2Var2, t51 t51Var) {
        this.b = cVar;
        this.c = dp2Var;
        this.d = dp2Var2;
        this.e = t51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og8)) {
            return false;
        }
        og8 og8Var = (og8) obj;
        return this.b == og8Var.b && this.c == og8Var.c && this.d == og8Var.d && this.e == og8Var.e;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new pg8(this.b, this.c, this.d, this.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        pg8 pg8Var = (pg8) gx4Var;
        pg8Var.q.a = null;
        c cVar = this.b;
        pg8Var.q = cVar;
        cVar.a = pg8Var;
        cVar.b = pg8Var.n ? ToolbarHandlerState.c : ToolbarHandlerState.b;
        pg8Var.r = this.c;
        pg8Var.s = this.d;
        pg8Var.t = this.e;
    }
}
