package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.d04;
import defpackage.js3;
import defpackage.lw;
import defpackage.uf2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class FlowLayoutView extends Hilt_FlowLayoutView {
    public d04 c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlowLayoutView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public final void b(ArrayList arrayList, int i, int i2, int i3, boolean z) {
        if (!z) {
            i3 = getPaddingLeft();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type ir.mservices.market.views.FlowLayoutView.LayoutParams");
            uf2 uf2Var = (uf2) layoutParams;
            int i4 = uf2Var.a;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i5 = ((i2 - (uf2Var.b + measuredHeight)) / 2) + i;
            if (z) {
                view.layout(i3 - measuredWidth, i5, i3, measuredHeight + i5);
                i3 -= measuredWidth + i4;
            } else {
                view.layout(i3, i5, i3 + measuredWidth, measuredHeight + i5);
                i3 += measuredWidth + i4;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        js3.p(layoutParams, "p");
        return layoutParams instanceof uf2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        js3.p(layoutParams, "p");
        return layoutParams;
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.c;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zF = getLanguageHelper().f();
        int i5 = i3 - i;
        int paddingLeft = zF ? i5 : getPaddingLeft();
        int paddingTop = getPaddingTop();
        ArrayList arrayList = new ArrayList();
        int i6 = paddingTop;
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                js3.n(layoutParams, "null cannot be cast to non-null type ir.mservices.market.views.FlowLayoutView.LayoutParams");
                uf2 uf2Var = (uf2) layoutParams;
                int i8 = uf2Var.a;
                if (!zF ? paddingLeft + measuredWidth > i5 : paddingLeft - measuredWidth < 0) {
                    b(arrayList, i6, iMax, i5, zF);
                    i6 += iMax;
                    arrayList.clear();
                    paddingLeft = zF ? i5 : getPaddingLeft();
                    iMax = 0;
                }
                arrayList.add(childAt);
                iMax = Math.max(iMax, measuredHeight + uf2Var.b);
                paddingLeft = zF ? paddingLeft - (measuredWidth + i8) : measuredWidth + i8 + paddingLeft;
            }
        }
        b(arrayList, i6, iMax, i5, zF);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        lw.f(null, null, View.MeasureSpec.getMode(i) != 0);
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        int i3 = paddingTop;
        int paddingLeft2 = paddingLeft;
        int iMax = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                js3.n(layoutParams, "null cannot be cast to non-null type ir.mservices.market.views.FlowLayoutView.LayoutParams");
                uf2 uf2Var = (uf2) layoutParams;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + uf2Var.b);
                if (paddingLeft2 + measuredWidth > size) {
                    paddingLeft2 = getPaddingLeft();
                    i3 += iMax;
                }
                paddingLeft2 = measuredWidth + uf2Var.a + paddingLeft2;
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            size2 = Math.min(i3 + iMax, size2);
        } else if (mode == 0) {
            size2 = i3 + iMax;
        }
        setMeasuredDimension(size, size2);
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.c = d04Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (isInEditMode()) {
            return;
        }
        a();
    }
}
