package ir.mservices.market.views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.ea7;
import defpackage.js3;
import defpackage.pq6;
import defpackage.sj8;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class SmallEmptyMediumTextOvalButton extends MyketProgressButton {
    public int b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallEmptyMediumTextOvalButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        this.b = sj8.b().t;
        this.c = sj8.b().c;
        setColor(sj8.b().c);
        setButtonTextColor(this.c);
        setTextSize(context.getResources().getDimension(pq6.font_size_medium));
        setMinimumWidth(context.getResources().getDimensionPixelSize(pq6.min_small_button_with));
        setHeight(context.getResources().getDimensionPixelSize(pq6.small_button_height));
        setPadding(context.getResources().getDimensionPixelSize(pq6.space_4));
        setProgressSize(context.getResources().getDimensionPixelSize(pq6.small_button_progress_size));
        a();
    }

    public final int getDisableColor() {
        return this.b;
    }

    public final void setBadge(Drawable drawable) {
        if (drawable == null) {
            setIconWithCompoundRelative(null);
            return;
        }
        drawable.setBounds(0, 0, getResources().getDimensionPixelSize(pq6.space_8), getResources().getDimensionPixelSize(pq6.space_20));
        setDrawablePadding(getResources().getDimensionPixelSize(pq6.space_2));
        setIconWithCompoundRelative(drawable);
    }

    public final void setButtonTextColor(int i) {
        this.c = i;
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{this.c, sj8.b().u}));
    }

    public final void setColor(int i) {
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.o = false;
        ea7Var.c(getContext().getResources().getDimensionPixelSize(pq6.small_button_height) / 2);
        ea7Var.p = Ripple.a(sj8.b().O, i);
        ea7Var.d(getContext().getResources().getDimensionPixelSize(pq6.small_button_height) / 2);
        ea7Var.n = this.b;
        ea7Var.i = i;
        setButtonBackground(ea7Var.a());
    }

    public final void setDisableColor(int i) {
        this.b = i;
    }

    @Override // ir.mservices.market.views.MyketProgressButton
    public void setIconWithCompoundDrawables(Drawable drawable) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.button_icon_size);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        setDrawablePadding(getResources().getDimensionPixelSize(pq6.space_2));
        super.setIconWithCompoundDrawables(drawable);
    }
}
