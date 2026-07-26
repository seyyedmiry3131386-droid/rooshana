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
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.theme.ThemeData;

/* JADX INFO: loaded from: classes3.dex */
public final class BigFillBorderOvalButton extends MyketProgressButton {
    public final ThemeData b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigFillBorderOvalButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        ThemeData themeDataB = sj8.b();
        this.b = themeDataB;
        int i = themeDataB.c;
        this.c = i;
        this.d = i;
        this.e = i;
        setColors(i, i);
        setTextSize(context.getResources().getDimensionPixelSize(pq6.font_size_huge));
        setButtonTextColor(this.e);
        setHeight(context.getResources().getDimensionPixelSize(pq6.big_button_height));
        setPadding(context.getResources().getDimensionPixelSize(pq6.margin_default_v2_triple));
        setProgressSize(context.getResources().getDimensionPixelSize(pq6.button_progress_size));
        a();
    }

    public final void setButtonTextColor(int i) {
        this.e = i;
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{this.e, this.b.u}));
    }

    public final void setColors(int i, int i2) {
        this.c = i;
        this.d = i2;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(pq6.big_button_height) / 2;
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = i;
        ea7Var.c(dimensionPixelSize);
        ea7Var.i = i2;
        ThemeData themeData = this.b;
        ea7Var.k = themeData.t;
        ea7Var.p = Ripple.a(themeData.O, i2);
        ea7Var.h = 0;
        ea7Var.m = 0;
        ea7Var.d(dimensionPixelSize);
        setButtonBackground(ea7Var.a());
    }

    public final void setDisable(boolean z) {
        ThemeData themeData = this.b;
        int i = z ? themeData.t : this.c;
        int i2 = z ? themeData.w : this.d;
        int i3 = z ? themeData.u : this.e;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(pq6.big_button_height) / 2;
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = i;
        ea7Var.c(dimensionPixelSize);
        ea7Var.i = i2;
        ea7Var.k = i;
        ea7Var.p = z ? themeData.N : Ripple.a(themeData.O, this.d);
        ea7Var.h = 0;
        ea7Var.m = 0;
        ea7Var.d(dimensionPixelSize);
        StateListDrawable stateListDrawableA = ea7Var.a();
        setTextColor(i3);
        setButtonBackground(stateListDrawableA);
    }

    @Override // ir.mservices.market.views.MyketProgressButton
    public void setIconWithCompoundDrawables(Drawable drawable) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.big_button_icon_size);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        setDrawablePadding(getResources().getDimensionPixelSize(pq6.space_4));
        super.setIconWithCompoundDrawables(drawable);
    }
}
