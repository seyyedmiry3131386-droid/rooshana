package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class h96 extends ReplacementSpan {
    public Paint.FontMetricsInt a;
    public int b;
    public int c;
    public boolean d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        js3.V("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.d) {
            sn3.b("PlaceholderSpan is not laid out yet.");
        }
        return this.c;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.d = true;
        paint.getTextSize();
        this.a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            sn3.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.b = (int) Math.ceil(0.0f);
        this.c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.d) {
            sn3.b("PlaceholderSpan is not laid out yet.");
        }
        return this.b;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
