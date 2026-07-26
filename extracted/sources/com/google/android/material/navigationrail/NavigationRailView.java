package com.google.android.material.navigationrail;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import com.google.android.material.navigation.NavigationBarDividerView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.ck4;
import defpackage.mt6;
import defpackage.o37;
import defpackage.oq6;
import defpackage.rr8;
import defpackage.sk6;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yj5;
import defpackage.yk;
import defpackage.yt6;
import defpackage.zz3;

/* JADX INFO: loaded from: classes.dex */
public class NavigationRailView extends NavigationBarView {
    public static final PathInterpolator x = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    public final int g;
    public final int h;
    public boolean i;
    public final View j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final NavigationRailFrameLayout w;

    public NavigationRailView(Context context) {
        this(context, null);
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int iMax = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getNavigationRailMenuView().getChildAt(i);
            if (childAt.getVisibility() != 8 && !(childAt instanceof NavigationBarDividerView)) {
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
        }
        return iMax;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private void setExpanded(boolean z) {
        if (this.n == z) {
            return;
        }
        if (isLaidOut()) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.c = 500L;
            changeBounds.d = x;
            Fade fade = new Fade();
            fade.c = 100L;
            Fade fade2 = new Fade();
            fade2.c = 100L;
            zz3 zz3Var = new zz3(0);
            Fade fade3 = new Fade();
            fade3.c = 100L;
            int childCount = getNavigationRailMenuView().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getNavigationRailMenuView().getChildAt(i);
                if (childAt instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) childAt;
                    changeBounds.n(navigationBarItemView.getLabelGroup());
                    changeBounds.n(navigationBarItemView.getExpandedLabelGroup());
                    if (this.n) {
                        fade2.b(navigationBarItemView.getExpandedLabelGroup());
                        fade.b(navigationBarItemView.getLabelGroup());
                    } else {
                        fade2.b(navigationBarItemView.getLabelGroup());
                        fade.b(navigationBarItemView.getExpandedLabelGroup());
                    }
                    zz3Var.b(navigationBarItemView.getExpandedLabelGroup());
                }
                fade3.b(childAt);
            }
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.T(0);
            transitionSet.P(changeBounds);
            transitionSet.P(fade);
            transitionSet.P(zz3Var);
            if (!this.n) {
                transitionSet.P(fade3);
            }
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.T(0);
            transitionSet2.P(fade2);
            if (this.n) {
                transitionSet2.P(fade3);
            }
            TransitionSet transitionSet3 = new TransitionSet();
            transitionSet3.T(1);
            transitionSet3.P(transitionSet2);
            transitionSet3.P(transitionSet);
            rr8.a((ViewGroup) getParent(), transitionSet3);
        }
        this.n = z;
        int i2 = this.q;
        int i3 = this.o;
        int i4 = this.p;
        int i5 = this.r;
        if (z) {
            i2 = this.t;
            i3 = this.v;
            i4 = this.s;
            i5 = this.u;
        }
        getNavigationRailMenuView().setItemGravity(i5);
        super.setItemIconGravity(i2);
        getNavigationRailMenuView().setItemSpacing(i3);
        getNavigationRailMenuView().setItemMinimumHeight(i4);
        getNavigationRailMenuView().setExpanded(z);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final NavigationBarMenuView a(Context context) {
        return new NavigationRailMenuView(context);
    }

    public int getCollapsedItemMinimumHeight() {
        return this.p;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.s;
    }

    public View getHeaderView() {
        return this.j;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return Integer.MAX_VALUE;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int iMakeMeasureSpec = (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) ? i : View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        if (this.n) {
            measureChild(getNavigationRailMenuView(), i, i2);
            View view = this.j;
            if (view != null) {
                measureChild(view, i, i2);
            }
            int maxChildWidth = getMaxChildWidth();
            int iMin = Math.min(this.g, View.MeasureSpec.getSize(i));
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                int iMax = Math.max(maxChildWidth, iMin);
                View view2 = this.j;
                if (view2 != null) {
                    iMax = Math.max(iMax, view2.getMeasuredWidth());
                }
                i = View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(iMax, this.h)), 1073741824);
            }
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
                int size = View.MeasureSpec.getSize(i);
                yj5[] yj5VarArr = navigationRailMenuView.g;
                if (yj5VarArr != null) {
                    for (yj5 yj5Var : yj5VarArr) {
                        if (yj5Var instanceof NavigationBarItemView) {
                            ((NavigationBarItemView) yj5Var).j(size);
                        }
                    }
                }
            }
            iMakeMeasureSpec = i;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.w.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.w, iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setCollapsedItemMinimumHeight(int i) {
        this.p = i;
        if (this.n) {
            return;
        }
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setCollapsedItemSpacing(int i) {
        this.o = i;
        if (this.n) {
            return;
        }
        getNavigationRailMenuView().setItemSpacing(i);
    }

    public void setExpandedItemMinimumHeight(int i) {
        this.s = i;
        if (this.n) {
            ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemGravity(int i) {
        this.r = i;
        this.u = i;
        super.setItemGravity(i);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemIconGravity(int i) {
        this.q = i;
        this.t = i;
        super.setItemIconGravity(i);
    }

    public void setItemMinimumHeight(int i) {
        this.p = i;
        this.s = i;
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setItemSpacing(int i) {
        this.o = i;
        this.v = i;
        getNavigationRailMenuView().setItemSpacing(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.navigationRailStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        int i2 = mt6.Widget_MaterialComponents_NavigationRailView;
        super(context, attributeSet, i, i2);
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = false;
        this.p = -1;
        this.q = 0;
        this.r = 49;
        Context context2 = getContext();
        this.v = getContext().getResources().getDimensionPixelSize(oq6.m3_navigation_rail_expanded_item_spacing);
        this.u = 8388627;
        this.t = 1;
        sk6 sk6VarE = vj8.e(context2, attributeSet, yt6.NavigationRailView, i, i2, new int[0]);
        int i3 = yt6.NavigationRailView_contentMarginTop;
        int dimensionPixelSize = getResources().getDimensionPixelSize(oq6.mtrl_navigation_rail_margin);
        TypedArray typedArray = (TypedArray) sk6VarE.c;
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(i3, dimensionPixelSize);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(yt6.NavigationRailView_headerMarginBottom, getResources().getDimensionPixelSize(oq6.mtrl_navigation_rail_margin));
        boolean z = typedArray.getBoolean(yt6.NavigationRailView_scrollingEnabled, false);
        setSubmenuDividersEnabled(typedArray.getBoolean(yt6.NavigationRailView_submenuDividersEnabled, false));
        View view = (View) getMenuView();
        NavigationRailFrameLayout navigationRailFrameLayout = new NavigationRailFrameLayout(getContext());
        this.w = navigationRailFrameLayout;
        navigationRailFrameLayout.setPaddingTop(dimensionPixelSize2);
        this.w.setScrollingEnabled(z);
        this.w.setClipChildren(false);
        this.w.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.w.addView(view);
        if (!z) {
            addView(this.w);
        } else {
            ScrollView scrollView = new ScrollView(getContext());
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.addView(this.w);
            scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(scrollView);
        }
        int resourceId = typedArray.getResourceId(yt6.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            View view2 = this.j;
            if (view2 != null) {
                this.w.removeView(view2);
                this.j = null;
            }
            this.j = viewInflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.bottomMargin = dimensionPixelSize3;
            this.w.addView(viewInflate, 0, layoutParams);
        }
        setMenuGravity(typedArray.getInt(yt6.NavigationRailView_menuGravity, 49));
        int dimensionPixelSize4 = typedArray.getDimensionPixelSize(yt6.NavigationRailView_itemMinHeight, -1);
        int dimensionPixelSize5 = typedArray.getDimensionPixelSize(yt6.NavigationRailView_itemMinHeight, -1);
        dimensionPixelSize4 = typedArray.hasValue(yt6.NavigationRailView_collapsedItemMinHeight) ? typedArray.getDimensionPixelSize(yt6.NavigationRailView_collapsedItemMinHeight, -1) : dimensionPixelSize4;
        dimensionPixelSize5 = typedArray.hasValue(yt6.NavigationRailView_expandedItemMinHeight) ? typedArray.getDimensionPixelSize(yt6.NavigationRailView_expandedItemMinHeight, -1) : dimensionPixelSize5;
        setCollapsedItemMinimumHeight(dimensionPixelSize4);
        setExpandedItemMinimumHeight(dimensionPixelSize5);
        this.g = typedArray.getDimensionPixelSize(yt6.NavigationRailView_expandedMinWidth, context2.getResources().getDimensionPixelSize(oq6.m3_navigation_rail_min_expanded_width));
        this.h = typedArray.getDimensionPixelSize(yt6.NavigationRailView_expandedMaxWidth, context2.getResources().getDimensionPixelSize(oq6.m3_navigation_rail_max_expanded_width));
        if (typedArray.hasValue(yt6.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.k = Boolean.valueOf(typedArray.getBoolean(yt6.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (typedArray.hasValue(yt6.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.l = Boolean.valueOf(typedArray.getBoolean(yt6.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (typedArray.hasValue(yt6.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.m = Boolean.valueOf(typedArray.getBoolean(yt6.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(oq6.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(oq6.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fB = yk.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f);
        float fC = yk.c(fB, getItemPaddingTop(), dimensionPixelOffset);
        float fC2 = yk.c(fB, getItemPaddingBottom(), dimensionPixelOffset2);
        setItemPaddingTop(Math.round(fC));
        setItemPaddingBottom(Math.round(fC2));
        setCollapsedItemSpacing(typedArray.getDimensionPixelSize(yt6.NavigationRailView_itemSpacing, 0));
        setExpanded(typedArray.getBoolean(yt6.NavigationRailView_expanded, false));
        sk6VarE.G();
        o37.h(this, new ck4(6, this));
    }
}
