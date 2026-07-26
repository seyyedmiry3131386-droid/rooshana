package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class yk5 extends f07 {
    public final /* synthetic */ bl5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk5(bl5 bl5Var, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f = bl5Var;
    }

    @Override // defpackage.f07, defpackage.h3
    public final void d(View view, t3 t3Var) {
        super.d(view, t3Var);
        bl5 bl5Var = this.f.e.g;
        int i = 0;
        for (int i2 = 0; i2 < bl5Var.e.d.size(); i2++) {
            int iE = bl5Var.e.e(i2);
            if (iE == 0 || iE == 1) {
                i++;
            }
        }
        t3Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }
}
