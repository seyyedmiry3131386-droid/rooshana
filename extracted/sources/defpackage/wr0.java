package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class wr0 extends Drawable implements Animatable {
    public static final LinearInterpolator g = new LinearInterpolator();
    public static final w82 h = new w82(1);
    public static final int[] i = {-16777216};
    public final vr0 a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public wr0(Context context) {
        context.getClass();
        this.c = context.getResources();
        vr0 vr0Var = new vr0();
        this.a = vr0Var;
        vr0Var.i = i;
        vr0Var.a(0);
        vr0Var.h = 2.5f;
        vr0Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new tr0(this, vr0Var));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(g);
        valueAnimatorOfFloat.addListener(new ur0(this, vr0Var, 0));
        this.d = valueAnimatorOfFloat;
    }

    public static void d(float f, vr0 vr0Var) {
        if (f <= 0.75f) {
            vr0Var.u = vr0Var.i[vr0Var.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = vr0Var.i;
        int i2 = vr0Var.j;
        int i3 = iArr[i2];
        int i4 = iArr[(i2 + 1) % iArr.length];
        vr0Var.u = ((((i3 >> 24) & 255) + ((int) ((((i4 >> 24) & 255) - r1) * f2))) << 24) | ((((i3 >> 16) & 255) + ((int) ((((i4 >> 16) & 255) - r3) * f2))) << 16) | ((((i3 >> 8) & 255) + ((int) ((((i4 >> 8) & 255) - r4) * f2))) << 8) | ((i3 & 255) + ((int) (f2 * ((i4 & 255) - r2))));
    }

    public final void a(float f, vr0 vr0Var, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f) {
            d(f, vr0Var);
            float fFloor = (float) (Math.floor(vr0Var.m / 0.8f) + 1.0d);
            float f2 = vr0Var.k;
            float f3 = vr0Var.l;
            vr0Var.e = (((f3 - 0.01f) - f2) * f) + f2;
            vr0Var.f = f3;
            float f4 = vr0Var.m;
            vr0Var.g = dw1.f(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = vr0Var.m;
            w82 w82Var = h;
            if (f < 0.5f) {
                interpolation = vr0Var.k;
                interpolation2 = (w82Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = vr0Var.k + 0.79f;
                interpolation = f6 - (((1.0f - w82Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.e) * 216.0f;
            vr0Var.e = interpolation;
            vr0Var.f = interpolation2;
            vr0Var.g = f7;
            this.b = f8;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        vr0 vr0Var = this.a;
        vr0Var.h = f6;
        vr0Var.b.setStrokeWidth(f6);
        vr0Var.q = f * f5;
        vr0Var.a(0);
        vr0Var.r = (int) (f3 * f5);
        vr0Var.s = (int) (f4 * f5);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        vr0 vr0Var = this.a;
        Paint paint = vr0Var.b;
        RectF rectF = vr0Var.a;
        float f = vr0Var.q;
        float fMin = (vr0Var.h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((vr0Var.r * vr0Var.p) / 2.0f, vr0Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = vr0Var.e;
        float f3 = vr0Var.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((vr0Var.f + f3) * 360.0f) - f4;
        paint.setColor(vr0Var.u);
        paint.setAlpha(vr0Var.t);
        float f6 = vr0Var.h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, vr0Var.d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = vr0Var.c;
        if (vr0Var.n) {
            Path path = vr0Var.o;
            if (path == null) {
                Path path2 = new Path();
                vr0Var.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (vr0Var.r * vr0Var.p) / 2.0f;
            vr0Var.o.moveTo(0.0f, 0.0f);
            vr0Var.o.lineTo(vr0Var.r * vr0Var.p, 0.0f);
            Path path3 = vr0Var.o;
            float f9 = vr0Var.r;
            float f10 = vr0Var.p;
            path3.lineTo((f9 * f10) / 2.0f, vr0Var.s * f10);
            vr0Var.o.offset((rectF.centerX() + fMin2) - f8, (vr0Var.h / 2.0f) + rectF.centerY());
            vr0Var.o.close();
            paint2.setColor(vr0Var.u);
            paint2.setAlpha(vr0Var.t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(vr0Var.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.a.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d.cancel();
        vr0 vr0Var = this.a;
        float f = vr0Var.e;
        vr0Var.k = f;
        float f2 = vr0Var.f;
        vr0Var.l = f2;
        vr0Var.m = vr0Var.g;
        if (f2 != f) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
            return;
        }
        vr0Var.a(0);
        vr0Var.k = 0.0f;
        vr0Var.l = 0.0f;
        vr0Var.m = 0.0f;
        vr0Var.e = 0.0f;
        vr0Var.f = 0.0f;
        vr0Var.g = 0.0f;
        this.d.setDuration(1332L);
        this.d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        vr0 vr0Var = this.a;
        if (vr0Var.n) {
            vr0Var.n = false;
        }
        vr0Var.a(0);
        vr0Var.k = 0.0f;
        vr0Var.l = 0.0f;
        vr0Var.m = 0.0f;
        vr0Var.e = 0.0f;
        vr0Var.f = 0.0f;
        vr0Var.g = 0.0f;
        invalidateSelf();
    }
}
