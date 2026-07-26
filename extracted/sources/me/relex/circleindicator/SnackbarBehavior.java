package me.relex.circleindicator;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import defpackage.di6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class SnackbarBehavior extends CoordinatorLayout.Behavior<BaseCircleIndicator> {
    public SnackbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean f(View view, View view2) {
        return view2 instanceof Snackbar$SnackbarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z;
        BaseCircleIndicator baseCircleIndicator = (BaseCircleIndicator) view;
        ArrayList arrayListO = coordinatorLayout.o(baseCircleIndicator);
        int size = arrayListO.size();
        float fMin = 0.0f;
        int i = 0;
        while (true) {
            if (i >= size) {
                baseCircleIndicator.setTranslationY(fMin);
                return true;
            }
            View view3 = (View) arrayListO.get(i);
            if (view3 instanceof Snackbar$SnackbarLayout) {
                if (baseCircleIndicator.getVisibility() == 0 && view3.getVisibility() == 0) {
                    Rect rectA = CoordinatorLayout.a();
                    coordinatorLayout.n(baseCircleIndicator, rectA, baseCircleIndicator.getParent() != coordinatorLayout);
                    Rect rectA2 = CoordinatorLayout.a();
                    coordinatorLayout.n(view3, rectA2, view3.getParent() != coordinatorLayout);
                    try {
                        z = rectA.left <= rectA2.right && rectA.top <= rectA2.bottom && rectA.right >= rectA2.left && rectA.bottom >= rectA2.top;
                    } finally {
                        rectA.setEmpty();
                        di6 di6Var = CoordinatorLayout.x;
                        di6Var.d(rectA);
                        rectA2.setEmpty();
                        di6Var.d(rectA2);
                    }
                } else {
                    z = false;
                }
                if (z) {
                    fMin = Math.min(fMin, view3.getTranslationY() - view3.getHeight());
                }
            }
            i++;
        }
    }

    public SnackbarBehavior() {
    }
}
