package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.cv;
import defpackage.mt6;
import defpackage.o37;
import defpackage.sk6;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.xe0;
import defpackage.ye0;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {
    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final NavigationBarMenuView a(Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumHeight <= 0) {
            iMakeMeasureSpec = i2;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
        }
        super.onMeasure(i, iMakeMeasureSpec);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.C0 != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().c(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(xe0 xe0Var) {
        setOnItemReselectedListener(xe0Var);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(ye0 ye0Var) {
        setOnItemSelectedListener(ye0Var);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.bottomNavigationStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        int i2 = mt6.Widget_Design_BottomNavigationView;
        super(context, attributeSet, i, i2);
        sk6 sk6VarE = vj8.e(getContext(), attributeSet, yt6.BottomNavigationView, i, i2, new int[0]);
        int i3 = yt6.BottomNavigationView_itemHorizontalTranslationEnabled;
        TypedArray typedArray = (TypedArray) sk6VarE.c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(i3, true));
        if (typedArray.hasValue(yt6.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(yt6.BottomNavigationView_android_minHeight, 0));
        }
        sk6VarE.G();
        o37.h(this, new cv(3));
    }
}
