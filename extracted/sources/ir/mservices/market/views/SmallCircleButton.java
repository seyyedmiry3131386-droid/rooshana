package ir.mservices.market.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.ea7;
import defpackage.js3;
import defpackage.pq6;
import defpackage.sj8;

/* JADX INFO: loaded from: classes3.dex */
public final class SmallCircleButton extends MyketProgressButton {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallCircleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        setColor(sj8.b().c);
        setHeight(context.getResources().getDimensionPixelSize(pq6.button_progress_size));
        setWidth(context.getResources().getDimensionPixelSize(pq6.button_progress_size));
        setProgressSize(context.getResources().getDimensionPixelSize(pq6.small_circle_button_progress_size));
    }

    public final void setColor(int i) {
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.o = false;
        ea7Var.c(getContext().getResources().getDimensionPixelSize(pq6.button_progress_size) / 2);
        ea7Var.d(getContext().getResources().getDimensionPixelSize(pq6.button_progress_size) / 2);
        ea7Var.n = i;
        ea7Var.p = sj8.b().O.b;
        ea7Var.i = i;
        setButtonBackground(ea7Var.a());
    }

    @Override // ir.mservices.market.views.MyketProgressButton
    public void setIcon(Drawable drawable) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.small_button_progress_size);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        super.setIcon(drawable);
    }
}
