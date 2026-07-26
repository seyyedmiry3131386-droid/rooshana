package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ir.mservices.market.views.RippleBackground;

/* JADX INFO: loaded from: classes3.dex */
public final class p97 extends View {
    public final /* synthetic */ RippleBackground a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p97(RippleBackground rippleBackground, Context context) {
        super(context);
        this.a = rippleBackground;
        setVisibility(4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        js3.p(canvas, "canvas");
        int width = getWidth();
        int height = getHeight();
        if (width > height) {
            width = height;
        }
        float f = width / 2;
        canvas.drawCircle(f, f, f, this.a.c);
    }
}
