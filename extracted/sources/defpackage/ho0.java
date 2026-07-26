package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class ho0 extends ImageSpan {
    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        js3.p(canvas, "canvas");
        js3.p(paint, "paint");
        Drawable drawable = getDrawable();
        int i6 = (((i5 - i3) - drawable.getBounds().bottom) / 2) + i3;
        canvas.save();
        canvas.translate(f, i6);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        js3.p(paint, "paint");
        Rect bounds = getDrawable().getBounds();
        js3.o(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            int i3 = fontMetricsInt.bottom;
            int i4 = fontMetricsInt.top;
            int i5 = bounds.bottom - bounds.top;
            int i6 = (((i3 - i4) / 2) + i4) - (i5 / 2);
            fontMetricsInt.ascent = i6;
            fontMetricsInt.descent = i6 + i5;
        }
        return bounds.right;
    }
}
