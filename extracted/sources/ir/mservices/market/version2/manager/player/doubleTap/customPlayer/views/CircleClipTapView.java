package ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import defpackage.bp2;
import defpackage.dw1;
import defpackage.js3;
import defpackage.qj;
import defpackage.rj;
import defpackage.sj8;
import defpackage.v7;

/* JADX INFO: loaded from: classes3.dex */
public final class CircleClipTapView extends View {
    public static final /* synthetic */ int p = 0;
    public final Paint a;
    public final Paint b;
    public int c;
    public int d;
    public final Path e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public final int j;
    public final int k;
    public ValueAnimator l;
    public boolean m;
    public bp2 n;
    public float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleClipTapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(attributeSet, "attrs");
        Paint paint = new Paint();
        this.a = paint;
        Paint paint2 = new Paint();
        this.b = paint2;
        this.e = new Path();
        this.f = true;
        if (context == null) {
            throw new IllegalArgumentException("Context is null.");
        }
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setColor(sj8.b().I.c);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(sj8.b().I.c);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.c = displayMetrics.widthPixels;
        this.d = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        this.j = (int) (30.0f * f);
        this.k = (int) (f * 400.0f);
        b();
        this.l = getCircleAnimator();
        this.n = new v7(23);
        this.o = 80.0f;
    }

    private final ValueAnimator getCircleAnimator() {
        if (this.l == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(getAnimationDuration());
            valueAnimatorOfFloat.addUpdateListener(new qj(2, this));
            valueAnimatorOfFloat.addListener(new rj(2, this));
            this.l = valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimator = this.l;
        js3.m(valueAnimator);
        return valueAnimator;
    }

    public final void a(bp2 bp2Var) {
        this.m = true;
        getCircleAnimator().end();
        bp2Var.invoke();
        this.m = false;
        getCircleAnimator().start();
    }

    public final void b() {
        float f = this.c * 0.5f;
        Path path = this.e;
        path.reset();
        boolean z = this.f;
        float f2 = z ? 0.0f : this.c;
        int i = z ? 1 : -1;
        path.moveTo(f2, 0.0f);
        float f3 = i;
        path.lineTo(dw1.f(f, this.o, f3, f2), 0.0f);
        float f4 = this.o;
        int i2 = this.d;
        path.quadTo(((f + f4) * f3) + f2, i2 / 2, dw1.f(f, f4, f3, f2), i2);
        path.lineTo(f2, this.d);
        path.close();
        invalidate();
    }

    public final void c(float f, float f2) {
        this.g = f;
        this.h = f2;
        boolean z = f <= ((float) (getResources().getDisplayMetrics().widthPixels / 2));
        if (this.f != z) {
            this.f = z;
            b();
        }
    }

    public final long getAnimationDuration() {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            return valueAnimator.getDuration();
        }
        return 650L;
    }

    public final float getArcSize() {
        return this.o;
    }

    public final int getCircleBackgroundColor() {
        return this.a.getColor();
    }

    public final int getCircleColor() {
        return this.b.getColor();
    }

    public final bp2 getPerformAtEnd() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        js3.p(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.e;
        canvas.clipPath(path);
        canvas.drawPath(path, this.a);
        canvas.drawCircle(this.g, this.h, this.i, this.b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c = i;
        this.d = i2;
        b();
    }

    public final void setAnimationDuration(long j) {
        getCircleAnimator().setDuration(j);
    }

    public final void setArcSize(float f) {
        this.o = f;
        b();
    }

    public final void setCircleBackgroundColor(int i) {
        this.a.setColor(i);
    }

    public final void setCircleColor(int i) {
        this.b.setColor(i);
    }

    public final void setPerformAtEnd(bp2 bp2Var) {
        js3.p(bp2Var, "<set-?>");
        this.n = bp2Var;
    }
}
