package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class y69 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;

    public /* synthetic */ y69(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                (view != null ? (a79) view.getTag(as6.dataBinding) : null).j.run();
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
