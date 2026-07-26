package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class nf {
    public static final nf a = new nf();

    public final void a(View view, yg6 yg6Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = yg6Var instanceof jh ? PointerIcon.getSystemIcon(context, ((jh) yg6Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (js3.i(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
