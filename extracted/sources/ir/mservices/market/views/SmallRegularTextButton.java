package ir.mservices.market.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.d04;
import defpackage.js3;
import defpackage.pq6;
import defpackage.sj8;

/* JADX INFO: loaded from: classes3.dex */
public final class SmallRegularTextButton extends Hilt_SmallRegularTextButton {
    public int n;
    public d04 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallRegularTextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        this.n = sj8.b().c;
        setTextSize(0, context.getResources().getDimension(pq6.font_size_medium));
        setTextColor(this.n);
        setBold(false);
    }

    public static /* synthetic */ void setSmallIcon$default(SmallRegularTextButton smallRegularTextButton, Drawable drawable, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = smallRegularTextButton.n;
        }
        smallRegularTextButton.setSmallIcon(drawable, i);
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.o;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final int getPrimaryColor() {
        return this.n;
    }

    public final void setBigIcon(Drawable drawable) {
        js3.p(drawable, "drawable");
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.small_button_icon_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(pq6.margin_default_v2_half);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        drawable.mutate().setColorFilter(new PorterDuffColorFilter(this.n, PorterDuff.Mode.MULTIPLY));
        setCompoundDrawablePadding(dimensionPixelSize2);
        if (getLanguageHelper().e()) {
            setCompoundDrawables(drawable, null, null, null);
        } else {
            setCompoundDrawables(null, null, drawable, null);
        }
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.o = d04Var;
    }

    public final void setPrimaryColor(int i) {
        this.n = i;
        setTextColor(i);
    }

    public final void setSmallIcon(Drawable drawable, int i) {
        if (drawable == null) {
            setCompoundDrawables(null, null, null, null);
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.small_text_button_icon_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(pq6.margin_default_v2_quarter);
        drawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        setCompoundDrawablePadding(dimensionPixelSize2);
        if (getLanguageHelper().e()) {
            setCompoundDrawables(null, null, drawable, null);
        } else {
            setCompoundDrawables(drawable, null, null, null);
        }
    }
}
