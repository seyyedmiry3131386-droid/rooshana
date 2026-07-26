package ir.mservices.market.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a99;
import defpackage.ea7;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.sj8;

/* JADX INFO: loaded from: classes3.dex */
public final class SeriesBackground extends ConstraintLayout {
    public final a99 q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeriesBackground(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final void setBackgroundWidth(int i) {
        a99 a99Var = this.q;
        a99Var.v.getLayoutParams().width = i - getResources().getDimensionPixelSize(pq6.margin_default_v2_double);
        a99Var.w.getLayoutParams().width = i - getResources().getDimensionPixelSize(pq6.margin_default_v2);
    }

    public final void setImageDrawable(Drawable drawable) {
        a99 a99Var = this.q;
        a99Var.v.setImageDrawable(drawable);
        a99Var.w.setImageDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeriesBackground(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeriesBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = a99.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        a99 a99Var = (a99) fa1.c(layoutInflaterFrom, js6.view_series_background, this, true);
        js3.o(a99Var, "inflate(...)");
        this.q = a99Var;
        ImageView imageView = a99Var.v;
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.i = sj8.b().w;
        ea7Var.p = sj8.b().N;
        ea7Var.h = 1;
        ea7Var.c(getResources().getDimensionPixelSize(pq6.margin_default_v2_half));
        imageView.setBackground(ea7Var.a());
        imageView.setPadding(1, 1, 1, 1);
        ImageView imageView2 = a99Var.w;
        ea7 ea7Var2 = new ea7(context);
        ea7Var2.j = false;
        ea7Var2.i = sj8.b().w;
        ea7Var2.p = sj8.b().N;
        ea7Var2.h = 1;
        ea7Var2.c(getResources().getDimensionPixelSize(pq6.margin_default_v2_half));
        imageView2.setBackground(ea7Var2.a());
        imageView2.setPadding(1, 1, 1, 1);
    }

    public /* synthetic */ SeriesBackground(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
