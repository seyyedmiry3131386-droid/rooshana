package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.c;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.oq6;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {
    public final /* synthetic */ BottomAppBar.Behavior a;

    public a(BottomAppBar.Behavior behavior) {
        this.a = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BottomAppBar.Behavior behavior = this.a;
        Rect rect = behavior.p;
        BottomAppBar bottomAppBar = (BottomAppBar) behavior.q.get();
        if (bottomAppBar != null) {
            int i9 = bottomAppBar.h;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.f(rect);
                    int iHeight = rect.height();
                    bottomAppBar.N(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(rect)));
                    height = iHeight;
                }
                c cVar = (c) view.getLayoutParams();
                if (behavior.r == 0) {
                    if (bottomAppBar.g == 1) {
                        ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(oq6.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) cVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) cVar).rightMargin = bottomAppBar.getRightInset();
                    if (view.getLayoutDirection() == 1) {
                        ((ViewGroup.MarginLayoutParams) cVar).leftMargin += i9;
                    } else {
                        ((ViewGroup.MarginLayoutParams) cVar).rightMargin += i9;
                    }
                }
                int i10 = BottomAppBar.y;
                bottomAppBar.M();
                return;
            }
        }
        view.removeOnLayoutChangeListener(this);
    }
}
