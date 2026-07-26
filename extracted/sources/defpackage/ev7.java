package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class ev7 extends Drawable {
    public final ze0 a = new ze0(4, this);
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public bv7 f;

    public ev7() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        bv7 bv7Var;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted() || (bv7Var = this.f) == null || !bv7Var.o || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b() {
        bv7 bv7Var;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (bv7Var = this.f) == null) {
            return;
        }
        int iRound = bv7Var.g;
        if (iRound <= 0) {
            iRound = Math.round(bv7Var.i * iWidth);
        }
        bv7 bv7Var2 = this.f;
        int iRound2 = bv7Var2.h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(bv7Var2.j * iHeight);
        }
        bv7 bv7Var3 = this.f;
        boolean z = true;
        if (bv7Var3.f != 1) {
            int i = bv7Var3.c;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            bv7 bv7Var4 = this.f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, bv7Var4.b, bv7Var4.a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            bv7 bv7Var5 = this.f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, bv7Var5.b, bv7Var5.a, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        if (this.f != null) {
            Paint paint = this.b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f.m));
            Rect rect = this.c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.e;
            float f3 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f.c;
            if (i != 1) {
                if (i == 2) {
                    f2 = dw1.f(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i != 3) {
                    float f4 = -fHeight;
                    f2 = dw1.f(fHeight, f4, animatedFraction, f4);
                } else {
                    f = dw1.f(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f3 = f2;
                f = 0.0f;
            } else {
                float f5 = -fWidth;
                f = dw1.f(fWidth, f5, animatedFraction, f5);
            }
            Matrix matrix = this.d;
            matrix.reset();
            matrix.setRotate(this.f.m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f3, f);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        bv7 bv7Var = this.f;
        if (bv7Var != null) {
            return (bv7Var.n || bv7Var.p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
