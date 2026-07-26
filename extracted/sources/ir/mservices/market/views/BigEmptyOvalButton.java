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

/* JADX INFO: loaded from: classes3.dex */
public final class BigEmptyOvalButton extends MyketProgressButton {
    public int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigEmptyOvalButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        this.b = sj8.b().c;
        setColor(sj8.b().c);
        setButtonTextColor(this.b);
        setTextSize(context.getResources().getDimensionPixelSize(pq6.font_size_huge));
        setHeight(context.getResources().getDimensionPixelSize(pq6.big_button_height));
        setPadding(context.getResources().getDimensionPixelSize(pq6.margin_default_v2_triple));
        setProgressSize(context.getResources().getDimensionPixelSize(pq6.button_progress_size));
        a();
    }

    public final void setButtonTextColor(int i) {
        this.b = i;
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{this.b, sj8.b().u}));
    }

    public final void setColor(int i) {
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.o = false;
        ea7Var.c(getContext().getResources().getDimensionPixelSize(pq6.big_button_height) / 2);
        ea7Var.d(getContext().getResources().getDimensionPixelSize(pq6.big_button_height) / 2);
        ea7Var.p = Ripple.a(sj8.b().O, i);
        ea7Var.n = i;
        ea7Var.i = i;
        setButtonBackground(ea7Var.a());
    }
}
