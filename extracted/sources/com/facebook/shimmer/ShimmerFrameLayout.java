package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.av7;
import defpackage.bv7;
import defpackage.ev7;
import defpackage.wt6;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint a;
    public final ev7 b;
    public final boolean c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new ev7();
        this.c = true;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        av7 av7Var;
        setWillNotDraw(false);
        this.b.setCallback(this);
        if (attributeSet == null) {
            b(new av7(0).g());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wt6.ShimmerFrameLayout, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(wt6.ShimmerFrameLayout_shimmer_colored) && typedArrayObtainStyledAttributes.getBoolean(wt6.ShimmerFrameLayout_shimmer_colored, false)) {
                av7Var = new av7(1);
                ((bv7) av7Var.b).p = false;
            } else {
                av7Var = new av7(0);
            }
            b(av7Var.h(typedArrayObtainStyledAttributes).g());
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(bv7 bv7Var) {
        boolean zIsStarted;
        ev7 ev7Var = this.b;
        ev7Var.f = bv7Var;
        if (bv7Var != null) {
            ev7Var.b.setXfermode(new PorterDuffXfermode(ev7Var.f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        ev7Var.b();
        if (ev7Var.f != null) {
            ValueAnimator valueAnimator = ev7Var.e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                ev7Var.e.cancel();
                ev7Var.e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            bv7 bv7Var2 = ev7Var.f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (bv7Var2.t / bv7Var2.s) + 1.0f);
            ev7Var.e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(ev7Var.f.r);
            ev7Var.e.setRepeatCount(ev7Var.f.q);
            ValueAnimator valueAnimator2 = ev7Var.e;
            bv7 bv7Var3 = ev7Var.f;
            valueAnimator2.setDuration(bv7Var3.s + bv7Var3.t);
            ev7Var.e.addUpdateListener(ev7Var.a);
            if (zIsStarted) {
                ev7Var.e.start();
            }
        }
        ev7Var.invalidateSelf();
        if (bv7Var == null || !bv7Var.n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ev7 ev7Var = this.b;
        ValueAnimator valueAnimator = ev7Var.e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        ev7Var.e.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.b = new ev7();
        this.c = true;
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint();
        this.b = new ev7();
        this.c = true;
        a(context, attributeSet);
    }
}
