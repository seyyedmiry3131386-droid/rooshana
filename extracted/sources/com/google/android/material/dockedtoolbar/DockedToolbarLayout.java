package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.c;
import defpackage.as7;
import defpackage.fk4;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.o37;
import defpackage.pt2;
import defpackage.sk6;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class DockedToolbarLayout extends FrameLayout {
    public static final int c = mt6.Widget_Material3_DockedToolbar;
    public final Boolean a;
    public final Boolean b;

    public DockedToolbarLayout(Context context) {
        this(context, null);
    }

    public static boolean a(DockedToolbarLayout dockedToolbarLayout, ViewGroup.LayoutParams layoutParams, int i) {
        return layoutParams instanceof c ? (((c) layoutParams).c & i) == i : (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i) == i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int childCount = getChildCount();
            int iMax = Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight());
            for (int i3 = 0; i3 < childCount; i3++) {
                measureChild(getChildAt(i3), i, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.dockedToolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = c;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        sk6 sk6VarE = vj8.e(context2, attributeSet, yt6.DockedToolbar, i, i2, new int[0]);
        int i3 = yt6.DockedToolbar_backgroundTint;
        TypedArray typedArray = (TypedArray) sk6VarE.c;
        if (typedArray.hasValue(i3)) {
            int color = typedArray.getColor(yt6.DockedToolbar_backgroundTint, 0);
            fk4 fk4Var = new fk4(as7.d(context2, attributeSet, i, i2).a());
            fk4Var.s(ColorStateList.valueOf(color));
            setBackground(fk4Var);
        }
        if (typedArray.hasValue(yt6.DockedToolbar_paddingTopSystemWindowInsets)) {
            this.a = Boolean.valueOf(typedArray.getBoolean(yt6.DockedToolbar_paddingTopSystemWindowInsets, true));
        }
        if (typedArray.hasValue(yt6.DockedToolbar_paddingBottomSystemWindowInsets)) {
            this.b = Boolean.valueOf(typedArray.getBoolean(yt6.DockedToolbar_paddingBottomSystemWindowInsets, true));
        }
        o37.h(this, new pt2(19, this));
        setImportantForAccessibility(1);
        sk6VarE.G();
    }
}
