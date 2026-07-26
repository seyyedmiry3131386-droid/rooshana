package ir.mservices.market.views;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.google.android.material.radiobutton.MaterialRadioButton;
import defpackage.js3;
import defpackage.kh2;
import defpackage.p3;
import defpackage.yq6;
import ir.mservices.market.theme.ThemeData;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketRadioButton extends MaterialRadioButton {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketRadioButton(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public final void a(ThemeData themeData, int i) {
        js3.p(themeData, "theme");
        StateListDrawable stateListDrawable = new StateListDrawable();
        Resources resources = getResources();
        js3.o(resources, "getResources(...)");
        Drawable drawableK = p3.k(resources, yq6.r_b_off);
        int i2 = themeData.m;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableK.setColorFilter(new PorterDuffColorFilter(i2, mode));
        stateListDrawable.addState(new int[]{-16842912}, drawableK);
        Resources resources2 = getResources();
        js3.o(resources2, "getResources(...)");
        Drawable drawableK2 = p3.k(resources2, yq6.r_b_on);
        drawableK2.setColorFilter(new PorterDuffColorFilter(i, mode));
        stateListDrawable.addState(new int[]{R.attr.state_checked}, drawableK2);
        setCompoundDrawablesRelativeWithIntrinsicBounds(stateListDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (isInEditMode()) {
            return;
        }
        setTypeface((Typeface) kh2.b.a.b);
        setText(getText().toString());
    }
}
