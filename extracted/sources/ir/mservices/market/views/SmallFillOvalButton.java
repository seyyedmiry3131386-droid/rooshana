package ir.mservices.market.views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import defpackage.ea7;
import defpackage.js3;
import defpackage.pq6;
import defpackage.sj8;
import ir.mservices.market.theme.ThemeData;

/* JADX INFO: loaded from: classes3.dex */
public final class SmallFillOvalButton extends MyketProgressButton {
    public ThemeData b;
    public int c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallFillOvalButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        ThemeData themeDataB = sj8.b();
        this.b = themeDataB;
        int i = themeDataB.c;
        this.c = i;
        this.d = themeDataB.d;
        setBgColor(i);
        setButtonTextColor(this.d);
        setTextSize(context.getResources().getDimension(pq6.font_size_large));
        setMinimumWidth(context.getResources().getDimensionPixelSize(pq6.min_small_button_with));
        setHeight(context.getResources().getDimensionPixelSize(pq6.small_button_height));
        setPadding(context.getResources().getDimensionPixelSize(pq6.space_16));
        setProgressSize(context.getResources().getDimensionPixelSize(pq6.small_button_progress_size));
        a();
    }

    public final void b(int i) {
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i, this.b.u}));
    }

    public final ThemeData getTheme() {
        return this.b;
    }

    public final void setBgColor(int i) {
        this.c = i;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(pq6.small_button_height) / 2;
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = i;
        ea7Var.c(dimensionPixelSize);
        ThemeData themeData = this.b;
        ea7Var.k = themeData.t;
        ea7Var.p = themeData.O.b;
        ea7Var.h = 0;
        ea7Var.m = 0;
        ea7Var.d(dimensionPixelSize);
        setButtonBackground(ea7Var.a());
    }

    public final void setButtonTextColor(int i) {
        this.d = i;
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{this.d, this.b.u}));
    }

    public final void setDisable(boolean z) {
        int i = z ? this.b.t : this.c;
        int i2 = z ? this.b.u : this.d;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(pq6.big_button_height) / 2;
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = i;
        ea7Var.c(dimensionPixelSize);
        ea7Var.k = i;
        ea7Var.p = z ? this.b.N : this.b.O.b;
        ea7Var.h = 0;
        ea7Var.m = 0;
        ea7Var.d(dimensionPixelSize);
        StateListDrawable stateListDrawableA = ea7Var.a();
        setTextColor(i2);
        setButtonBackground(stateListDrawableA);
    }

    @Override // ir.mservices.market.views.MyketProgressButton
    public void setIconWithCompoundDrawables(Drawable drawable) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.button_icon_size);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        setDrawablePadding(getResources().getDimensionPixelSize(pq6.space_4));
        super.setIconWithCompoundDrawables(drawable);
    }

    public final void setTheme(ThemeData themeData) {
        js3.p(themeData, "<set-?>");
        this.b = themeData;
    }
}
