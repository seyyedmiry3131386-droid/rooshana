package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yd8 extends vo3 {
    public dp2 r;
    public rf9 s;

    @Override // defpackage.qo3, defpackage.gx4
    public final void s0() {
        View viewJ = rf0.J(this);
        WeakHashMap weakHashMap = rf9.w;
        rf9 rf9VarO = js8.o(viewJ);
        rf9VarO.a(viewJ);
        me9 me9Var = (me9) this.r.invoke(rf9VarO);
        if (!js3.i(me9Var, this.q)) {
            this.q = me9Var;
            D0();
        }
        this.s = rf9VarO;
        super.s0();
    }

    @Override // defpackage.qo3, defpackage.gx4
    public final void u0() {
        View viewJ = rf0.J(this);
        rf9 rf9Var = this.s;
        if (rf9Var != null) {
            int i = rf9Var.u - 1;
            rf9Var.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = q69.a;
                h69.m(viewJ, null);
                q69.t(viewJ, null);
                viewJ.removeOnAttachStateChangeListener(rf9Var.v);
            }
        }
        super.u0();
    }
}
