package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class xv5 implements LeadingMarginSpan {
    public final ui4 a;
    public final String b;
    public final Paint c = er5.c;
    public int d;

    public xv5(ui4 ui4Var, String str) {
        this.a = ui4Var;
        this.b = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.c;
            paint2.set(paint);
            ui4 ui4Var = this.a;
            ui4Var.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = ui4Var.c;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.b;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = ui4Var.a;
            if (iMeasureText > i10) {
                this.d = iMeasureText;
                i10 = iMeasureText;
            } else {
                this.d = 0;
            }
            if (i2 > 0) {
                i8 = ((i10 * i2) + i) - iMeasureText;
            } else {
                i8 = (i10 - iMeasureText) + (i2 * i10) + i;
            }
            canvas.drawText(str, i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.d, this.a.a);
    }
}
