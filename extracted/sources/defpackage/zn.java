package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements PopupWindow.OnDismissListener {
    public final /* synthetic */ v6 a;
    public final /* synthetic */ ao b;

    public zn(ao aoVar, v6 v6Var) {
        this.b = aoVar;
        this.a = v6Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
