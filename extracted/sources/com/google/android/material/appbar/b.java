package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.h3;
import defpackage.o3;
import defpackage.t3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h3 {
    public final /* synthetic */ AppBarLayout d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout.BaseBehavior f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f = baseBehavior;
        this.d = appBarLayout;
        this.e = coordinatorLayout;
    }

    @Override // defpackage.h3
    public final void d(View view, t3 t3Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, t3Var.a);
        t3Var.m(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.e;
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        View viewI = AppBarLayout.BaseBehavior.I(baseBehavior, coordinatorLayout);
        if (viewI == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((AppBarLayout.LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (baseBehavior.z() != (-appBarLayout.getTotalScrollRange())) {
                    t3Var.b(o3.j);
                    t3Var.w(true);
                }
                if (baseBehavior.z() != 0) {
                    if (!viewI.canScrollVertically(-1)) {
                        t3Var.b(o3.k);
                        t3Var.w(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            t3Var.b(o3.k);
                            t3Var.w(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.h3
    public final boolean g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        if (baseBehavior.z() != 0) {
            CoordinatorLayout coordinatorLayout = this.e;
            View viewI = AppBarLayout.BaseBehavior.I(baseBehavior, coordinatorLayout);
            if (!viewI.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.L(coordinatorLayout, this.d, viewI, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
