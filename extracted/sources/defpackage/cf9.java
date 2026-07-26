package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class cf9 extends bf9 {
    public no3 n;

    public cf9(lf9 lf9Var, WindowInsets windowInsets) {
        super(lf9Var, windowInsets);
        this.n = null;
    }

    @Override // defpackage.if9
    public lf9 b() {
        return lf9.h(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.if9
    public lf9 c() {
        return lf9.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.if9
    public final no3 j() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = no3.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // defpackage.if9
    public boolean o() {
        return this.c.isConsumed();
    }

    @Override // defpackage.if9
    public void u(no3 no3Var) {
        this.n = no3Var;
    }

    public cf9(lf9 lf9Var, cf9 cf9Var) {
        super(lf9Var, cf9Var);
        this.n = null;
        this.n = cf9Var.n;
    }
}
