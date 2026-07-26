package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import defpackage.cl5;

/* JADX INFO: loaded from: classes.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    public final FrameLayout.LayoutParams A0;
    public int y0;
    public int z0;

    public NavigationRailMenuView(Context context) {
        super(context);
        this.y0 = -1;
        this.z0 = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.A0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView f(Context context) {
        return new cl5(context);
    }

    public int getItemMinimumHeight() {
        return this.y0;
    }

    public int getItemSpacing() {
        return this.z0;
    }

    public int getMenuGravity() {
        return this.A0.gravity;
    }

    public final int h(int i, int i2, int i3, View view) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 0);
        int childCount = getChildCount();
        int measuredHeight = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!(childAt instanceof NavigationBarItemView)) {
                childAt.measure(i, iMakeMeasureSpec2);
                int measuredHeight2 = childAt.getVisibility() != 8 ? childAt.getMeasuredHeight() : 0;
                i2 -= measuredHeight2;
                measuredHeight += measuredHeight2;
            }
        }
        int iMax = Math.max(i2, 0);
        if (view == null) {
            int iMax2 = iMax / Math.max(1, i3);
            int size = this.y0;
            if (size == -1) {
                size = View.MeasureSpec.getSize(i);
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax2), 0);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() == 0) {
                i5++;
            }
            if ((childAt2 instanceof NavigationBarItemView) && childAt2 != view) {
                childAt2.measure(i, iMakeMeasureSpec);
                measuredHeight = (childAt2.getVisibility() != 8 ? childAt2.getMeasuredHeight() : 0) + measuredHeight;
            }
        }
        return (Math.max(0, i5 - 1) * this.z0) + measuredHeight;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        int measuredHeight = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                measuredHeight += childAt.getMeasuredHeight();
                i6++;
            }
        }
        int iMax = i6 <= 1 ? 0 : Math.max(0, Math.min((getMeasuredHeight() - measuredHeight) / (i6 - 1), this.z0));
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight2 = childAt2.getMeasuredHeight();
                childAt2.layout(0, i8, i5, measuredHeight2 + i8);
                i8 += measuredHeight2 + iMax;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iH;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i2);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        if (currentVisibleContentItemCount <= 1 || !NavigationBarMenuView.g(getLabelVisibilityMode(), currentVisibleContentItemCount)) {
            iH = h(i, size, currentVisibleContentItemCount, null);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int iMax = size / Math.max(1, currentVisibleContentItemCount);
                int size2 = this.y0;
                if (size2 == -1) {
                    size2 = View.MeasureSpec.getSize(i);
                }
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(Math.min(size2, iMax), 0));
                measuredHeight = childAt.getVisibility() != 8 ? childAt.getMeasuredHeight() : 0;
                size -= measuredHeight;
                currentVisibleContentItemCount--;
            } else {
                measuredHeight = 0;
            }
            iH = h(i, size, currentVisibleContentItemCount, childAt) + measuredHeight;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(iH, i2, 0));
    }

    public void setItemMinimumHeight(int i) {
        if (this.y0 != i) {
            this.y0 = i;
            requestLayout();
        }
    }

    public void setItemSpacing(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.A0;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}
