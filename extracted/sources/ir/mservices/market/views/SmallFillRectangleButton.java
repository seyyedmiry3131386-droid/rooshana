package ir.mservices.market.views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import defpackage.ea7;
import defpackage.js3;
import defpackage.pq6;
import defpackage.sj8;
import ir.mservices.market.theme.ThemeData;

/* JADX INFO: loaded from: classes3.dex */
public final class SmallFillRectangleButton extends MyketProgressButton {
    public ThemeData b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallFillRectangleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        ThemeData themeDataB = sj8.b();
        this.b = themeDataB;
        this.c = themeDataB.d;
        setBgColor(themeDataB.c);
        setTextSize(context.getResources().getDimensionPixelSize(pq6.font_size_medium));
        setButtonTextColor(this.c);
        setHeight(context.getResources().getDimensionPixelSize(pq6.rectangle_small_button_height));
        setPadding(context.getResources().getDimensionPixelSize(pq6.margin_default_v2_half));
        setProgressSize(context.getResources().getDimensionPixelSize(pq6.small_button_progress_size));
        a();
    }

    public final ThemeData getTheme() {
        return this.b;
    }

    public final void setBgColor(int i) {
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = i;
        ea7Var.c(getContext().getResources().getDimensionPixelSize(pq6.margin_default_v2_half));
        ThemeData themeData = this.b;
        ea7Var.k = themeData.t;
        ea7Var.p = themeData.O.b;
        ea7Var.h = 0;
        ea7Var.m = 0;
        ea7Var.d(getContext().getResources().getDimensionPixelSize(pq6.margin_default_v2));
        setButtonBackground(ea7Var.a());
    }

    public final void setButtonTextColor(int i) {
        this.c = i;
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{this.c, this.b.u}));
    }

    public final void setTheme(ThemeData themeData) {
        js3.p(themeData, "<set-?>");
        this.b = themeData;
    }
}
