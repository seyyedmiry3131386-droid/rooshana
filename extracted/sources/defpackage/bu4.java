package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class bu4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ cu4 a;

    public bu4(cu4 cu4Var) {
        this.a = cu4Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
