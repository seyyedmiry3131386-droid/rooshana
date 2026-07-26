package ir.mservices.market.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.b77;
import defpackage.bu6;
import defpackage.d04;
import defpackage.js3;
import defpackage.nd0;
import defpackage.pq6;
import defpackage.q39;
import defpackage.sj8;
import defpackage.yq6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieTabView extends Hilt_MovieTabView {
    public static final /* synthetic */ int D0 = 0;
    public final int B0;
    public d04 C0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MovieTabView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.C0;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final void s() {
        View childAt = getChildAt(0);
        if (childAt instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) childAt;
            int i = this.B0;
            linearLayout.setOrientation(i == 1 ? 1 : 0);
            linearLayout.setGravity(8388611);
            int childCount = linearLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = linearLayout.getChildAt(i2);
                LinearLayout linearLayout2 = childAt2 instanceof LinearLayout ? (LinearLayout) childAt2 : null;
                if (linearLayout2 != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                    js3.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (i == 1) {
                        layoutParams2.width = -1;
                        layoutParams2.height = getResources().getDimensionPixelSize(pq6.fix_button_height);
                        linearLayout2.setMinimumWidth(getMeasuredWidth());
                    } else {
                        layoutParams2.width = -2;
                        layoutParams2.height = -1;
                    }
                    linearLayout2.requestLayout();
                }
            }
        }
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.C0 = d04Var;
    }

    public final void t() {
        Drawable drawable;
        View childAt = getChildAt(0);
        LinearLayout linearLayout = childAt instanceof LinearLayout ? (LinearLayout) childAt : null;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt2 = linearLayout.getChildAt(i);
                LinearLayout linearLayout2 = childAt2 instanceof LinearLayout ? (LinearLayout) childAt2 : null;
                if (linearLayout2 != null) {
                    if (this.B0 != 1) {
                        continue;
                    } else {
                        boolean z = i == getSelectedTabPosition();
                        View view = new View(getContext());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view.getResources().getDimensionPixelSize(pq6.space_4), -1);
                        layoutParams.setMarginEnd(view.getResources().getDimensionPixelSize(pq6.space_16));
                        view.setLayoutParams(layoutParams);
                        Resources resources = view.getResources();
                        js3.o(resources, "getResources(...)");
                        int i2 = yq6.vertical_movie_tab_indicator;
                        try {
                            drawable = q39.a(resources, i2, null);
                            if (drawable == null) {
                                ThreadLocal threadLocal = b77.a;
                                drawable = resources.getDrawable(i2, null);
                                if (drawable == null) {
                                    throw new Resources.NotFoundException();
                                }
                            }
                        } catch (Exception unused) {
                            ThreadLocal threadLocal2 = b77.a;
                            drawable = resources.getDrawable(i2, null);
                            if (drawable == null) {
                                throw new Resources.NotFoundException();
                            }
                        }
                        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().j, PorterDuff.Mode.MULTIPLY));
                        view.setBackground(drawable);
                        view.setVisibility(z ? 0 : 4);
                        if (getLanguageHelper().f()) {
                            view.setRotationY(180.0f);
                        }
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        if (linearLayout2.getChildCount() >= 2) {
                            linearLayout2.removeViewAt(0);
                        }
                        linearLayout2.addView(view, 0);
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MovieTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu6.MovieTabView);
            js3.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.B0 = typedArrayObtainStyledAttributes.getInt(bu6.MovieTabView_orientation, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        setTabRippleColor(ColorStateList.valueOf(Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{12, Integer.valueOf(sj8.b().O.c & 16777215)}, 2)))));
        s();
        t();
        a(new nd0(1, this));
    }

    public /* synthetic */ MovieTabView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
