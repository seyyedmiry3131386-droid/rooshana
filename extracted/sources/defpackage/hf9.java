package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class hf9 extends gf9 {
    public static final lf9 s = lf9.h(null, WindowInsets.CONSUMED);

    public hf9(lf9 lf9Var, WindowInsets windowInsets) {
        super(lf9Var, windowInsets);
    }

    @Override // defpackage.ff9, defpackage.bf9, defpackage.if9
    public no3 g(int i) {
        return no3.d(this.c.getInsets(kf9.a(i)));
    }

    @Override // defpackage.ff9, defpackage.bf9, defpackage.if9
    public no3 h(int i) {
        return no3.d(this.c.getInsetsIgnoringVisibility(kf9.a(i)));
    }

    @Override // defpackage.ff9, defpackage.bf9, defpackage.if9
    public boolean q(int i) {
        return this.c.isVisible(kf9.a(i));
    }

    public hf9(lf9 lf9Var, hf9 hf9Var) {
        super(lf9Var, hf9Var);
    }
}
