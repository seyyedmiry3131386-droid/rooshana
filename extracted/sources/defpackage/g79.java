package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class g79 implements View.OnAttachStateChangeListener, dp2 {
    public final View a;
    public final xt3 b;

    public g79(View view, xt3 xt3Var) {
        js3.p(view, "view");
        this.a = view;
        this.b = xt3Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.g(null);
        return tx8.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        js3.p(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        js3.p(view, "v");
        this.a.removeOnAttachStateChangeListener(this);
        this.b.g(null);
    }
}
