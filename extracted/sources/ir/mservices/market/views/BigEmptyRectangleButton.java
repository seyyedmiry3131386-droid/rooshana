package ir.mservices.market.views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import defpackage.ea7;
import defpackage.js3;
import defpackage.pq6;
import defpackage.sj8;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.theme.ThemeData;

/* JADX INFO: loaded from: classes3.dex */
public final class BigEmptyRectangleButton extends MyketProgressButton {
    public ThemeData b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigEmptyRectangleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        ThemeData themeDataB = sj8.b();
        this.b = themeDataB;
        int i = themeDataB.c;
        this.c = i;
        setColor(i);
        setButtonTextColor(this.c);
        setTextSize(context.getResources().getDimensionPixelSize(pq6.font_size_huge));
        setHeight(context.getResources().getDimensionPixelSize(pq6.big_button_height));
        setPadding(context.getResources().getDimensionPixelSize(pq6.margin_default_v2));
        setProgressSize(context.getResources().getDimensionPixelSize(pq6.button_progress_size));
        a();
    }

    public final ThemeData getTheme() {
        return this.b;
    }

    public final void setButtonTextColor(int i) {
        this.c = i;
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{this.c, this.b.u}));
    }

    public final void setColor(int i) {
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.o = false;
        ea7Var.c(getContext().getResources().getDimensionPixelSize(pq6.margin_default_v2));
        ea7Var.d(getContext().getResources().getDimensionPixelSize(pq6.margin_default_v2));
        ea7Var.p = Ripple.a(this.b.O, i);
        ea7Var.n = this.b.t;
        ea7Var.i = i;
        setButtonBackground(ea7Var.a());
    }

    public final void setTheme(ThemeData themeData) {
        js3.p(themeData, "<set-?>");
        this.b = themeData;
    }
}
