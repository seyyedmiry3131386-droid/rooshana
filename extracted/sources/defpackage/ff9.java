package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class ff9 extends ef9 {
    public static final lf9 r = lf9.h(null, WindowInsets.CONSUMED);

    public ff9(lf9 lf9Var, WindowInsets windowInsets) {
        super(lf9Var, windowInsets);
    }

    @Override // defpackage.bf9, defpackage.if9
    public no3 g(int i) {
        return no3.d(this.c.getInsets(jf9.a(i)));
    }

    @Override // defpackage.bf9, defpackage.if9
    public no3 h(int i) {
        return no3.d(this.c.getInsetsIgnoringVisibility(jf9.a(i)));
    }

    @Override // defpackage.bf9, defpackage.if9
    public boolean q(int i) {
        return this.c.isVisible(jf9.a(i));
    }

    public ff9(lf9 lf9Var, ff9 ff9Var) {
        super(lf9Var, ff9Var);
    }

    @Override // defpackage.bf9, defpackage.if9
    public final void d(View view) {
    }
}
