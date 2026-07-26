package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar;
import defpackage.at2;
import defpackage.lf9;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public HeaderScrollingViewBehavior() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutC = C(coordinatorLayout.o(view));
        int iS = 0;
        if (appBarLayoutC == null) {
            coordinatorLayout.v(i, view);
            this.e = 0;
            return;
        }
        androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        int bottom = appBarLayoutC.getBottom() + ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int bottom2 = ((appBarLayoutC.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        lf9 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i2 = cVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        if (this.f != 0) {
            float fD = D(appBarLayoutC);
            int i3 = this.f;
            iS = at2.S((int) (fD * i3), 0, i3);
        }
        view.layout(rect2.left, rect2.top - iS, rect2.right, rect2.bottom - iS);
        this.e = rect2.top - appBarLayoutC.getBottom();
    }

    public abstract AppBarLayout C(ArrayList arrayList);

    public float D(View view) {
        return 1.0f;
    }

    public int E(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutC;
        lf9 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutC = C(coordinatorLayout.o(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutC.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int iE = size + E(appBarLayoutC);
        int measuredHeight = appBarLayoutC.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iE -= measuredHeight;
        }
        coordinatorLayout.w(i, i2, View.MeasureSpec.makeMeasureSpec(iE, i4 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}
