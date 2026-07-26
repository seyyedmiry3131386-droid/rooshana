package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class xh0 implements LeadingMarginSpan {
    public static final boolean f;
    public final ui4 a;
    public final Paint b = er5.c;
    public final RectF c = er5.b;
    public final Rect d = er5.a;
    public final int e;

    static {
        int i = Build.VERSION.SDK_INT;
        f = 24 == i || 25 == i;
    }

    public xh0(ui4 ui4Var, int i) {
        this.a = ui4Var;
        this.e = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        RectF rectF = this.c;
        Rect rect = this.d;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.b;
            paint2.set(paint);
            ui4 ui4Var = this.a;
            ui4Var.getClass();
            int i8 = ui4Var.a;
            paint2.setColor(paint2.getColor());
            int i9 = ui4Var.c;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            int iSave = canvas.save();
            try {
                int iMin2 = Math.min(i8, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i10 = ui4Var.d;
                if (i10 != 0 && i10 <= iMin2) {
                    iMin2 = i10;
                }
                int i11 = (i8 - iMin2) / 2;
                boolean z2 = f;
                int i12 = this.e;
                if (z2) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (i8 * i12)) : (i8 * i12) - i;
                    int i13 = (i11 * i2) + i;
                    int i14 = (i2 * iMin2) + i13;
                    int i15 = i2 * width;
                    iMin = Math.min(i13, i14) + i15;
                    iMax = Math.max(i13, i14) + i15;
                } else {
                    if (i2 <= 0) {
                        i -= i8;
                    }
                    iMin = i + i11;
                    iMax = iMin + iMin2;
                }
                int iDescent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin2 / 2);
                int i16 = iMin2 + iDescent;
                if (i12 == 0 || i12 == 1) {
                    rectF.set(iMin, iDescent, iMax, i16);
                    paint2.setStyle(i12 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(iMin, iDescent, iMax, i16);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.a.a;
    }
}
