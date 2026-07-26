package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;

/* JADX INFO: loaded from: classes3.dex */
public final class xg8 extends ShapeDrawable {
    public Paint a;
    public Paint b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        if (this.g > 0) {
            RectF rectF = new RectF(getBounds());
            float f = this.g / 2;
            rectF.inset(f, f);
            if (getShape() instanceof OvalShape) {
                canvas.drawOval(rectF, this.b);
            } else if (getShape() instanceof RoundRectShape) {
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.b);
            } else {
                canvas.drawRect(rectF, this.b);
            }
        }
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = this.e;
        if (iWidth < 0) {
            iWidth = bounds.width();
        }
        int iHeight = this.d;
        if (iHeight < 0) {
            iHeight = bounds.height();
        }
        int iMin = this.f;
        if (iMin < 0) {
            iMin = Math.min(iWidth, iHeight) / 3;
        }
        this.a.setTextSize(iMin);
        canvas.drawText(this.c, iWidth / 2, (iHeight / 2) - ((this.a.ascent() + this.a.descent()) / 2.0f), this.a);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.e;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
