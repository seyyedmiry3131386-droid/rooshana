package ir.mservices.market.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.kf5;
import defpackage.lw8;
import defpackage.mf5;
import defpackage.u91;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketStar extends Hilt_MyketStar {
    public lw8 c;
    public final kf5 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketStar(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final kf5 getBinding() {
        return this.d;
    }

    public final lw8 getUiUtils() {
        lw8 lw8Var = this.c;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    public final void setNumberText(int i, boolean z) {
        MyketTextView myketTextView = this.d.v;
        js3.m(myketTextView);
        myketTextView.setVisibility(z ? 0 : 8);
        myketTextView.setText(lw8.e(getUiUtils(), String.valueOf(i)));
    }

    public final void setNumberTextColor(int i) {
        this.d.v.setTextColor(i);
    }

    public final void setStarColor(int i) {
        this.d.w.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
    }

    public final void setStarImage(Drawable drawable) {
        js3.p(drawable, "drawable");
        this.d.w.setImageDrawable(drawable);
    }

    public final void setUiUtils(lw8 lw8Var) {
        js3.p(lw8Var, "<set-?>");
        this.c = lw8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketStar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    public /* synthetic */ MyketStar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketStar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.c = (lw8) ((u91) ((mf5) e())).a.E.get();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = kf5.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        kf5 kf5Var = (kf5) fa1.c(layoutInflaterFrom, js6.myket_star, this, true);
        js3.o(kf5Var, "inflate(...)");
        this.d = kf5Var;
    }
}
