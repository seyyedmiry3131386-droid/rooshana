package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class sk5 extends h3 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tk5 f;

    public sk5(tk5 tk5Var, int i, boolean z) {
        this.f = tk5Var;
        this.d = i;
        this.e = z;
    }

    @Override // defpackage.h3
    public final void d(View view, t3 t3Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, t3Var.a);
        bl5 bl5Var = this.f.g;
        int i = this.d;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (bl5Var.e.e(i3) == 2 || bl5Var.e.e(i3) == 3) {
                i2--;
            }
        }
        t3Var.o(s3.a(i2, 1, 1, 1, this.e, view.isSelected()));
    }
}
