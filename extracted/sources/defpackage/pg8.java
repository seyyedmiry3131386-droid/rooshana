package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import androidx.compose.foundation.text.contextmenu.modifier.c;
import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class pg8 extends ti1 implements m01, ag8 {
    public c q;
    public dp2 r;
    public dp2 s;
    public t51 t;
    public li1 u;
    public final ck1 v = g.c(new yu7(5, this));
    public sy6 w = sy6.e;

    public pg8(c cVar, dp2 dp2Var, dp2 dp2Var2, t51 t51Var) {
        this.q = cVar;
        this.r = dp2Var;
        this.s = dp2Var2;
        this.t = t51Var;
    }

    @Override // defpackage.ag8
    public final zf8 K() {
        return (zf8) this.v.getValue();
    }

    @Override // defpackage.ag8
    public final long g(v04 v04Var) {
        return j(v04Var).d();
    }

    @Override // defpackage.ag8
    public final sy6 j(v04 v04Var) {
        if (!this.n) {
            return this.w;
        }
        sy6 sy6Var = (sy6) this.t.invoke(v04Var);
        if (sy6Var == null) {
            return this.w;
        }
        this.w = sy6Var;
        return sy6Var;
    }

    @Override // defpackage.gx4
    public final void s0() {
        c cVar = this.q;
        cVar.b = ToolbarHandlerState.c;
        cVar.a = this;
    }

    @Override // defpackage.gx4
    public final void u0() {
        c cVar = this.q;
        cVar.b = ToolbarHandlerState.b;
        cVar.a = null;
    }
}
