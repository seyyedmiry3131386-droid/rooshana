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

/* JADX INFO: loaded from: classes3.dex */
public final class SmallMovieOvalButton extends MyketProgressButton {
    public int b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallMovieOvalButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        this.b = sj8.b().j;
        this.c = sj8.b().k;
        setBgColor(sj8.b().j);
        setTextSize(context.getResources().getDimensionPixelSize(pq6.font_size_normal));
        setButtonTextColor(this.c);
        setHeight(context.getResources().getDimensionPixelSize(pq6.small_movie_button_size));
        setProgressSize(context.getResources().getDimensionPixelSize(pq6.space_16));
        setAnimationSize(getResources().getDimensionPixelSize(pq6.small_button_icon_size));
        a();
    }

    public final void setBgColor(int i) {
        this.b = i;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(pq6.big_movie_button_size) / 2;
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = i;
        ea7Var.c(dimensionPixelSize);
        ea7Var.k = sj8.b().t;
        ea7Var.p = sj8.b().O.b;
        ea7Var.h = 0;
        ea7Var.m = 0;
        ea7Var.d(dimensionPixelSize);
        setButtonBackground(ea7Var.a());
    }

    public final void setButtonTextColor(int i) {
        this.c = i;
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{this.c, sj8.b().u}));
    }

    public final void setDisable(boolean z) {
        int i = z ? sj8.b().t : this.b;
        int i2 = z ? sj8.b().u : this.c;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(pq6.big_movie_button_size) / 2;
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = i;
        ea7Var.c(dimensionPixelSize);
        ea7Var.k = i;
        ea7Var.p = z ? sj8.b().N : sj8.b().O.b;
        ea7Var.h = 0;
        ea7Var.m = 0;
        ea7Var.d(dimensionPixelSize);
        StateListDrawable stateListDrawableA = ea7Var.a();
        setTextColor(i2);
        setButtonBackground(stateListDrawableA);
    }

    @Override // ir.mservices.market.views.MyketProgressButton
    public void setIconWithCompoundDrawables(Drawable drawable) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.small_button_icon_size);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        super.setIconWithCompoundDrawables(drawable);
    }
}
