package com.google.android.material.progressindicator;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import defpackage.cw1;
import defpackage.fl;
import defpackage.m91;
import defpackage.mk4;
import defpackage.mm3;
import defpackage.mt6;
import defpackage.ow1;
import defpackage.qk1;
import defpackage.r80;
import defpackage.s80;
import defpackage.t80;
import defpackage.vj8;
import defpackage.xp6;
import defpackage.yt6;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseProgressIndicator<S extends t80> extends ProgressBar {
    public static final int p = mt6.Widget_MaterialComponents_ProgressIndicator;
    public final t80 a;
    public int b;
    public boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public long g;
    public fl h;
    public boolean i;
    public int j;
    public boolean k;
    public final r80 l;
    public final r80 m;
    public final s80 n;
    public final s80 o;

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(mk4.a(context, attributeSet, i, p), attributeSet, i);
        this.g = -1L;
        this.i = false;
        this.j = 4;
        this.l = new r80(this, 0);
        this.m = new r80(this, 1);
        this.n = new s80(0, this);
        this.o = new s80(1, this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.BaseProgressIndicator, i, i2, new int[0]);
        this.e = typedArrayD.getInt(yt6.BaseProgressIndicator_showDelay, -1);
        this.f = Math.min(typedArrayD.getInt(yt6.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayD.recycle();
        this.h = new fl();
        this.d = true;
    }

    private ow1 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().n;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().n;
    }

    public abstract t80 a(Context context, AttributeSet attributeSet);

    public final void b() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().o.x(this.n);
    }

    public final boolean c() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.h;
    }

    public int[] getIndicatorColor() {
        return this.a.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.i;
    }

    public int getShowAnimationBehavior() {
        return this.a.g;
    }

    public int getTrackColor() {
        return this.a.f;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.a.c;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    public int getWaveAmplitude() {
        return this.a.l;
    }

    public int getWaveSpeed() {
        return this.a.m;
    }

    public int getWavelengthDeterminate() {
        return this.a.j;
    }

    public int getWavelengthIndeterminate() {
        return this.a.k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        qk1 progressDrawable = getProgressDrawable();
        s80 s80Var = this.o;
        if (progressDrawable != null) {
            qk1 progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.g == null) {
                progressDrawable2.g = new ArrayList();
            }
            if (!progressDrawable2.g.contains(s80Var)) {
                progressDrawable2.g.add(s80Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            mm3 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.g == null) {
                indeterminateDrawable.g = new ArrayList();
            }
            if (!indeterminateDrawable.g.contains(s80Var)) {
                indeterminateDrawable.g.add(s80Var);
            }
        }
        if (c()) {
            if (this.f > 0) {
                this.g = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.m);
        removeCallbacks(this.l);
        ((cw1) getCurrentDrawable()).d(false, false, false);
        mm3 indeterminateDrawable = getIndeterminateDrawable();
        s80 s80Var = this.o;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(s80Var);
            getIndeterminateDrawable().o.F();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(s80Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            ow1 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.d) {
            ((cw1) getCurrentDrawable()).d(c(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.d) {
            ((cw1) getCurrentDrawable()).d(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(fl flVar) {
        this.h = flVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = flVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = flVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            cw1 cw1Var = (cw1) getCurrentDrawable();
            if (cw1Var != null) {
                cw1Var.d(false, false, false);
            }
            super.setIndeterminate(z);
            cw1 cw1Var2 = (cw1) getCurrentDrawable();
            if (cw1Var2 != null) {
                cw1Var2.d(c(), false, false);
            }
            if ((cw1Var2 instanceof mm3) && c()) {
                ((mm3) cw1Var2).o.D();
            }
            this.i = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        t80 t80Var = this.a;
        if (t80Var.n != f) {
            t80Var.n = f;
            getIndeterminateDrawable().o.q();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof mm3) {
            ((cw1) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.k) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{m91.q(getContext(), xp6.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.a.e = iArr;
        getIndeterminateDrawable().o.q();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        t80 t80Var = this.a;
        if (t80Var.i != i) {
            t80Var.i = i;
            t80Var.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i, false);
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.c = z;
            this.i = true;
            if (getIndeterminateDrawable().isVisible()) {
                fl flVar = this.h;
                ContentResolver contentResolver = getContext().getContentResolver();
                flVar.getClass();
                if (fl.a(contentResolver) != 0.0f) {
                    getIndeterminateDrawable().o.y();
                    return;
                }
            }
            this.n.a(getIndeterminateDrawable());
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof qk1)) {
            if (this.k) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            qk1 qk1Var = (qk1) drawable;
            qk1Var.d(false, false, false);
            super.setProgressDrawable(qk1Var);
            qk1Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        t80 t80Var = this.a;
        if (t80Var.f != i) {
            t80Var.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        t80 t80Var = this.a;
        if (t80Var.b != i) {
            t80Var.b = Math.min(i, t80Var.a / 2);
            t80Var.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        t80 t80Var = this.a;
        if (t80Var.c != f) {
            t80Var.c = Math.min(f, 0.5f);
            t80Var.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        t80 t80Var = this.a;
        if (t80Var.a != i) {
            t80Var.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.j = i;
    }

    public void setWaveAmplitude(int i) {
        t80 t80Var = this.a;
        if (t80Var.l != i) {
            t80Var.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i) {
        t80 t80Var = this.a;
        t80Var.m = i;
        qk1 progressDrawable = getProgressDrawable();
        boolean z = t80Var.m != 0;
        ValueAnimator valueAnimator = progressDrawable.t;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        t80 t80Var = this.a;
        if (t80Var.j != i) {
            t80Var.j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        t80 t80Var = this.a;
        if (t80Var.k != i) {
            t80Var.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public mm3 getIndeterminateDrawable() {
        return (mm3) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public qk1 getProgressDrawable() {
        return (qk1) super.getProgressDrawable();
    }
}
