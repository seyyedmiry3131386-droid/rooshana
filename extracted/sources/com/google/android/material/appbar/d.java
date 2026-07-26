package com.google.android.material.appbar;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import defpackage.at2;
import defpackage.dw1;
import defpackage.jm;
import defpackage.lf9;
import defpackage.qu0;
import defpackage.z79;

/* JADX INFO: loaded from: classes.dex */
public final class d implements jm {
    public final /* synthetic */ CollapsingToolbarLayout a;

    public d(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.jm
    public final void A(int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        qu0 qu0Var = collapsingToolbarLayout.m;
        qu0 qu0Var2 = collapsingToolbarLayout.l;
        collapsingToolbarLayout.B = i;
        lf9 lf9Var = collapsingToolbarLayout.E;
        int iD = lf9Var != null ? lf9Var.d() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = collapsingToolbarLayout.getChildAt(i2);
            CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams();
            z79 z79VarB = CollapsingToolbarLayout.b(childAt);
            int i3 = layoutParams.a;
            if (i3 == 1) {
                z79VarB.b(at2.S(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin));
            } else if (i3 == 2) {
                z79VarB.b(Math.round((-i) * layoutParams.b));
            }
        }
        collapsingToolbarLayout.d();
        if (collapsingToolbarLayout.s != null && iD > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height = collapsingToolbarLayout.getHeight();
        int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iD;
        int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
        int i4 = collapsingToolbarLayout.B + minimumHeight;
        float f = minimumHeight;
        float fAbs = Math.abs(i) / f;
        float f2 = scrimVisibleHeightTrigger / f;
        float fMin = Math.min(1.0f, f2);
        qu0Var2.d = fMin;
        qu0Var2.e = dw1.f(1.0f, fMin, 0.5f, fMin);
        qu0Var2.f = i4;
        qu0Var2.A(fAbs);
        float fMin2 = Math.min(1.0f, f2);
        qu0Var.d = fMin2;
        qu0Var.e = dw1.f(1.0f, fMin2, 0.5f, fMin2);
        qu0Var.f = i4;
        qu0Var.A(fAbs);
    }
}
