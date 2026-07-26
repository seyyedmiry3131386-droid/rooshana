package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class ad0 implements LeadingMarginSpan {
    public final /* synthetic */ int a;
    public final ui4 b;
    public final Rect c;
    public final Paint d;

    public ad0(ui4 ui4Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = er5.a;
                this.d = er5.c;
                this.b = ui4Var;
                break;
            default:
                this.c = er5.a;
                this.d = er5.c;
                this.b = ui4Var;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        switch (this.a) {
            case 0:
                ui4 ui4Var = this.b;
                int i8 = ui4Var.b;
                if (i8 == 0) {
                    i8 = (int) ((ui4Var.a * 0.25f) + 0.5f);
                }
                Paint paint2 = this.d;
                paint2.set(paint);
                ui4Var.getClass();
                int iL = yh0.l(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(iL);
                int i9 = i2 * i8;
                int i10 = i + i9;
                int i11 = i9 + i10;
                int iMin = Math.min(i10, i11);
                int iMax = Math.max(i10, i11);
                Rect rect = this.c;
                rect.set(iMin, i3, iMax, i5);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int i12 = ((i5 - i3) / 2) + i3;
                Paint paint3 = this.d;
                paint3.set(paint);
                ui4 ui4Var2 = this.b;
                ui4Var2.getClass();
                paint3.setColor(yh0.l(paint3.getColor(), 25));
                paint3.setStyle(Paint.Style.FILL);
                int i13 = ui4Var2.g;
                if (i13 >= 0) {
                    paint3.setStrokeWidth(i13);
                }
                int strokeWidth = (int) ((((int) (paint3.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                int i14 = i12 - strokeWidth;
                int i15 = i12 + strokeWidth;
                Rect rect2 = this.c;
                rect2.set(i, i14, width, i15);
                canvas.drawRect(rect2, paint3);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        switch (this.a) {
            case 0:
                return this.b.a;
            default:
                return 0;
        }
    }
}
