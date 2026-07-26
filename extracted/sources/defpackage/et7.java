package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public final class et7 extends ViewOutlineProvider {
    public final /* synthetic */ ft7 a;

    public et7(ft7 ft7Var) {
        this.a = ft7Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ft7 ft7Var = this.a;
        if (ft7Var.e.isEmpty()) {
            return;
        }
        outline.setPath(ft7Var.e);
    }
}
