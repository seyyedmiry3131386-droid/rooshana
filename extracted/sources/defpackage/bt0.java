package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class bt0 extends h3 {
    public final o3 d;

    public bt0(Context context, int i) {
        this.d = new o3(16, context.getString(i));
    }

    @Override // defpackage.h3
    public void d(View view, t3 t3Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, t3Var.a);
        t3Var.b(this.d);
    }
}
